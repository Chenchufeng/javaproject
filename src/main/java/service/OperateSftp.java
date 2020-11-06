package service;

import com.jcraft.jsch.SftpException;
import util.SFTPUtil;

import java.util.Vector;

public class OperateSftp {
    public static void main(String[] args) throws SftpException {
        SFTPUtil sftpUtil=new SFTPUtil("foo","pass","localhost",2222);
        sftpUtil.login();
        Vector<?> files = sftpUtil.listFiles("/upload");
        System.out.println(files);
        sftpUtil.delete("/upload","a.pdf");
        sftpUtil.logout();
    }
}

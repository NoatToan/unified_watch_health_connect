package it.sauronsoftware.ftp4j.listparsers;

import io.flutter.embedding.android.FlutterActivityLaunchConfigs;
import it.sauronsoftware.ftp4j.FTPFile;
import it.sauronsoftware.ftp4j.FTPListParseException;
import it.sauronsoftware.ftp4j.FTPListParser;
import java.util.Date;
import java.util.StringTokenizer;

/* JADX INFO: loaded from: classes22.dex */
public class EPLFListParser implements FTPListParser {
    public static void main(String[] strArr) throws Throwable {
        for (FTPFile fTPFile : new EPLFListParser().parse(new String[]{"+i8388621.29609,m824255902,/,\tdev", "+i8388621.44468,m839956783,r,s10376,\tRFCEPLF"})) {
            System.out.println(fTPFile);
        }
    }

    @Override // it.sauronsoftware.ftp4j.FTPListParser
    public FTPFile[] parse(String[] strArr) throws FTPListParseException {
        int length = strArr.length;
        FTPFile[] fTPFileArr = null;
        for (int i = 0; i < length; i++) {
            String str = strArr[i];
            if (str.charAt(0) != '+') {
                throw new FTPListParseException();
            }
            int iIndexOf = str.indexOf(9);
            if (iIndexOf == -1) {
                throw new FTPListParseException();
            }
            String strSubstring = str.substring(1, iIndexOf);
            String strSubstring2 = str.substring(iIndexOf + 1, str.length());
            long j = 0;
            StringTokenizer stringTokenizer = new StringTokenizer(strSubstring, ",");
            Date date = null;
            int i2 = 0;
            while (stringTokenizer.hasMoreTokens()) {
                String strNextToken = stringTokenizer.nextToken();
                int length2 = strNextToken.length();
                if (length2 > 0) {
                    if (length2 != 1) {
                        char cCharAt = strNextToken.charAt(0);
                        String strSubstring3 = strNextToken.substring(1, length2);
                        if (cCharAt == 's') {
                            try {
                                j = Long.parseLong(strSubstring3);
                            } catch (Throwable unused) {
                            }
                        } else if (cCharAt == 'm') {
                            date = new Date(Long.parseLong(strSubstring3) * 1000);
                        }
                    } else if (strNextToken.equals(FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE)) {
                        i2 = 1;
                    }
                }
            }
            if (fTPFileArr == null) {
                fTPFileArr = new FTPFile[length];
            }
            fTPFileArr[i] = new FTPFile();
            fTPFileArr[i].setName(strSubstring2);
            fTPFileArr[i].setModifiedDate(date);
            fTPFileArr[i].setSize(j);
            fTPFileArr[i].setType(i2);
        }
        return fTPFileArr;
    }
}

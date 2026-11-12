package it.sauronsoftware.ftp4j.listparsers;

import it.sauronsoftware.ftp4j.FTPFile;
import it.sauronsoftware.ftp4j.FTPListParseException;
import it.sauronsoftware.ftp4j.FTPListParser;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Properties;
import java.util.StringTokenizer;

/* JADX INFO: loaded from: classes22.dex */
public class MLSDListParser implements FTPListParser {
    private static final DateFormat a = new SimpleDateFormat("yyyyMMddhhmmss.SSS Z");
    private static final DateFormat b = new SimpleDateFormat("yyyyMMddhhmmss Z");

    private FTPFile a(String str) throws FTPListParseException {
        long j;
        ArrayList<String> arrayList = new ArrayList();
        StringTokenizer stringTokenizer = new StringTokenizer(str, ";");
        while (stringTokenizer.hasMoreElements()) {
            String strTrim = stringTokenizer.nextToken().trim();
            if (strTrim.length() > 0) {
                arrayList.add(strTrim);
            }
        }
        if (arrayList.size() == 0) {
            throw new FTPListParseException();
        }
        int i = 1;
        String str2 = (String) arrayList.remove(arrayList.size() - 1);
        Properties properties = new Properties();
        for (String str3 : arrayList) {
            int iIndexOf = str3.indexOf(61);
            if (iIndexOf == -1) {
                throw new FTPListParseException();
            }
            String strTrim2 = str3.substring(0, iIndexOf).trim();
            String strTrim3 = str3.substring(iIndexOf + 1, str3.length()).trim();
            if (strTrim2.length() == 0 || strTrim3.length() == 0) {
                throw new FTPListParseException();
            }
            properties.setProperty(strTrim2, strTrim3);
        }
        String property = properties.getProperty("type");
        if (property == null) {
            throw new FTPListParseException();
        }
        Date date = null;
        if ("file".equalsIgnoreCase(property)) {
            i = 0;
        } else if (!"dir".equalsIgnoreCase(property)) {
            if ("cdir".equalsIgnoreCase(property)) {
                return null;
            }
            "pdir".equalsIgnoreCase(property);
            return null;
        }
        String property2 = properties.getProperty("modify");
        if (property2 != null) {
            String str4 = property2 + " +0000";
            try {
                DateFormat dateFormat = a;
                synchronized (dateFormat) {
                    try {
                        date = dateFormat.parse(str4);
                    } catch (ParseException unused) {
                    }
                }
            } catch (ParseException unused2) {
                DateFormat dateFormat2 = b;
                synchronized (dateFormat2) {
                    date = dateFormat2.parse(str4);
                }
            }
        }
        String property3 = properties.getProperty("size");
        long j2 = 0;
        if (property3 != null) {
            try {
                j = Long.parseLong(property3);
            } catch (NumberFormatException unused3) {
                j = 0;
            }
            if (j >= 0) {
                j2 = j;
            }
        }
        FTPFile fTPFile = new FTPFile();
        fTPFile.setType(i);
        fTPFile.setModifiedDate(date);
        fTPFile.setSize(j2);
        fTPFile.setName(str2);
        return fTPFile;
    }

    @Override // it.sauronsoftware.ftp4j.FTPListParser
    public FTPFile[] parse(String[] strArr) throws FTPListParseException {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            FTPFile fTPFileA = a(str);
            if (fTPFileA != null) {
                arrayList.add(fTPFileA);
            }
        }
        int size = arrayList.size();
        FTPFile[] fTPFileArr = new FTPFile[size];
        for (int i = 0; i < size; i++) {
            fTPFileArr[i] = (FTPFile) arrayList.get(i);
        }
        return fTPFileArr;
    }
}

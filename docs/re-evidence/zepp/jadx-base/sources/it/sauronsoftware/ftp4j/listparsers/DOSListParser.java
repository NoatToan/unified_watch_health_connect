package it.sauronsoftware.ftp4j.listparsers;

import io.flutter.embedding.android.FlutterActivityLaunchConfigs;
import it.sauronsoftware.ftp4j.FTPFile;
import it.sauronsoftware.ftp4j.FTPListParseException;
import it.sauronsoftware.ftp4j.FTPListParser;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes22.dex */
public class DOSListParser implements FTPListParser {
    private static final Pattern a = Pattern.compile("^(\\d{2})-(\\d{2})-(\\d{2})\\s+(\\d{2}):(\\d{2})(AM|PM)\\s+(<DIR>|\\d+)\\s+([^\\\\/*?\"<>|]+)$");
    private static final DateFormat b = new SimpleDateFormat("MM/dd/yy hh:mm a", Locale.ENGLISH);

    @Override // it.sauronsoftware.ftp4j.FTPListParser
    public FTPFile[] parse(String[] strArr) throws FTPListParseException {
        Date date;
        int length = strArr.length;
        FTPFile[] fTPFileArr = new FTPFile[length];
        for (int i = 0; i < length; i++) {
            Matcher matcher = a.matcher(strArr[i]);
            if (!matcher.matches()) {
                throw new FTPListParseException();
            }
            String strGroup = matcher.group(1);
            String strGroup2 = matcher.group(2);
            String strGroup3 = matcher.group(3);
            String strGroup4 = matcher.group(4);
            String strGroup5 = matcher.group(5);
            String strGroup6 = matcher.group(6);
            String strGroup7 = matcher.group(7);
            String strGroup8 = matcher.group(8);
            fTPFileArr[i] = new FTPFile();
            fTPFileArr[i].setName(strGroup8);
            if (strGroup7.equalsIgnoreCase("<DIR>")) {
                fTPFileArr[i].setType(1);
                fTPFileArr[i].setSize(0L);
            } else {
                try {
                    long j = Long.parseLong(strGroup7);
                    fTPFileArr[i].setType(0);
                    fTPFileArr[i].setSize(j);
                } catch (Throwable unused) {
                    throw new FTPListParseException();
                }
            }
            String str = strGroup + FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE + strGroup2 + FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE + strGroup3 + " " + strGroup4 + ":" + strGroup5 + " " + strGroup6;
            try {
                DateFormat dateFormat = b;
                synchronized (dateFormat) {
                    date = dateFormat.parse(str);
                }
                fTPFileArr[i].setModifiedDate(date);
            } catch (ParseException unused2) {
                throw new FTPListParseException();
            }
        }
        return fTPFileArr;
    }
}

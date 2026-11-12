package it.sauronsoftware.ftp4j.listparsers;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.xiaomi.mipush.sdk.Constants;
import io.netty.util.internal.StringUtil;
import it.sauronsoftware.ftp4j.FTPFile;
import it.sauronsoftware.ftp4j.FTPListParseException;
import it.sauronsoftware.ftp4j.FTPListParser;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlinx.serialization.json.internal.JsonLexerKt;

/* JADX INFO: loaded from: classes22.dex */
public class UnixListParser implements FTPListParser {
    private static final Pattern a = Pattern.compile("^([dl\\-])[r\\-][w\\-][xSs\\-][r\\-][w\\-][xSs\\-][r\\-][w\\-][xTt\\-]\\s+(?:\\d+\\s+)?\\S+\\s*\\S+\\s+(\\d+)\\s+(?:(\\w{3})\\s+(\\d{1,2}))\\s+(?:(\\d{4})|(?:(\\d{1,2}):(\\d{1,2})))\\s+([^\\\\*?\"<>|]+)(?: -> ([^\\\\*?\"<>|]+))?$");
    private static final DateFormat b = new SimpleDateFormat("MMM dd yyyy HH:mm", Locale.US);

    /* JADX WARN: Code duplicated, block: B:54:0x0161  */
    @Override // it.sauronsoftware.ftp4j.FTPListParser
    public FTPFile[] parse(String[] strArr) throws FTPListParseException {
        boolean z;
        Date time;
        String[] strArr2 = strArr;
        int length = strArr2.length;
        if (length == 0) {
            return new FTPFile[0];
        }
        if (strArr2[0].startsWith("total")) {
            length--;
            String[] strArr3 = new String[length];
            int i = 0;
            while (i < length) {
                int i2 = i + 1;
                strArr3[i] = strArr2[i2];
                i = i2;
            }
            strArr2 = strArr3;
        }
        Calendar calendar = Calendar.getInstance();
        int i3 = 1;
        int i4 = calendar.get(1);
        FTPFile[] fTPFileArr = new FTPFile[length];
        int i5 = 0;
        while (i5 < length) {
            Matcher matcher = a.matcher(strArr2[i5]);
            if (!matcher.matches()) {
                throw new FTPListParseException();
            }
            fTPFileArr[i5] = new FTPFile();
            String strGroup = matcher.group(i3);
            String strGroup2 = matcher.group(2);
            String strGroup3 = matcher.group(3);
            String strGroup4 = matcher.group(4);
            String strGroup5 = matcher.group(5);
            String strGroup6 = matcher.group(6);
            String strGroup7 = matcher.group(7);
            String strGroup8 = matcher.group(8);
            String strGroup9 = matcher.group(9);
            if (strGroup.equals(Constants.ACCEPT_TIME_SEPARATOR_SERVER)) {
                fTPFileArr[i5].setType(0);
            } else if (strGroup.equals(GoogleApiAvailabilityLight.a)) {
                fTPFileArr[i5].setType(1);
            } else {
                if (!strGroup.equals("l")) {
                    throw new FTPListParseException();
                }
                fTPFileArr[i5].setType(2);
                fTPFileArr[i5].setLink(strGroup9);
            }
            try {
                fTPFileArr[i5].setSize(Long.parseLong(strGroup2));
                if (strGroup4.length() == 1) {
                    strGroup4 = "0" + strGroup4;
                }
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append(strGroup3);
                stringBuffer.append(StringUtil.SPACE);
                stringBuffer.append(strGroup4);
                stringBuffer.append(StringUtil.SPACE);
                if (strGroup5 == null) {
                    stringBuffer.append(i4);
                    z = true;
                } else {
                    stringBuffer.append(strGroup5);
                    z = false;
                }
                stringBuffer.append(StringUtil.SPACE);
                if (strGroup6 == null || strGroup7 == null) {
                    stringBuffer.append("00:00");
                } else {
                    if (strGroup6.length() == 1) {
                        strGroup6 = "0" + strGroup6;
                    }
                    if (strGroup7.length() == 1) {
                        strGroup7 = "0" + strGroup7;
                    }
                    stringBuffer.append(strGroup6);
                    stringBuffer.append(JsonLexerKt.COLON);
                    stringBuffer.append(strGroup7);
                }
                try {
                    DateFormat dateFormat = b;
                    synchronized (dateFormat) {
                        time = dateFormat.parse(stringBuffer.toString());
                    }
                    if (z) {
                        Calendar calendar2 = Calendar.getInstance();
                        calendar2.setTime(time);
                        if (calendar2.after(calendar) && calendar2.getTimeInMillis() - calendar.getTimeInMillis() > 86400000) {
                            calendar2.set(1, i4 - 1);
                            time = calendar2.getTime();
                        }
                    }
                    fTPFileArr[i5].setModifiedDate(time);
                    fTPFileArr[i5].setName(strGroup8);
                    i5++;
                    i3 = 1;
                } catch (ParseException unused) {
                    throw new FTPListParseException();
                }
            } catch (Throwable unused2) {
                throw new FTPListParseException();
            }
        }
        return fTPFileArr;
    }
}

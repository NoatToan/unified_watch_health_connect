package nd2;

import android.annotation.SuppressLint;
import com.garmin.android.lib.networking.authentication.exceptions.AuthHttpException;
import d53.u;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* JADX INFO: loaded from: classes11.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static boolean f125412a;

    public static final wc2.a.C3415a a(Logger logger, URL url, HttpURLConnection httpURLConnection, Integer num) {
        String strG;
        logger.getClass();
        if (httpURLConnection != null) {
            try {
                strG = g(httpURLConnection);
            } catch (Throwable unused) {
                strG = "";
            }
        } else {
            strG = "";
        }
        logger.error((num != null ? num : "") + StringUtils.SPACE + url + ": " + strG);
        return new wc2.a.C3415a(new AuthHttpException(strG, num, null, 4, null), num, strG, null, 8, null);
    }

    public static final Logger b(String str) {
        return LoggerFactory.getLogger("NC#".concat(str));
    }

    public static final Calendar c() {
        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        calendar.getClass();
        return calendar;
    }

    public static final boolean d(long j8) {
        Calendar calendarC = c();
        calendarC.add(11, 1);
        return j8 <= calendarC.getTimeInMillis();
    }

    public static final boolean e(long j8) {
        return j8 <= c().getTimeInMillis();
    }

    @SuppressLint({"SimpleDateFormat"})
    public static final long f(String str) throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        Date date = simpleDateFormat.parse(str);
        if (date != null) {
            return date.getTime();
        }
        return 0L;
    }

    public static final String g(HttpURLConnection httpURLConnection) {
        httpURLConnection.getClass();
        StringBuilder sb3 = new StringBuilder();
        try {
            try {
                InputStream inputStream = httpURLConnection.getInputStream();
                try {
                    inputStream.getClass();
                    sb3.append(u.n(dh.b.M(inputStream)));
                    sb3.append('\n');
                    jg.b.l(inputStream, null);
                } catch (Throwable th3) {
                    try {
                        throw th3;
                    } catch (Throwable th4) {
                        jg.b.l(inputStream, th3);
                        throw th4;
                    }
                }
            } catch (Throwable unused) {
            }
            InputStream errorStream = httpURLConnection.getErrorStream();
            if (errorStream != null) {
                try {
                    sb3.append(u.n(dh.b.M(errorStream)));
                    errorStream.close();
                } catch (Throwable th5) {
                    try {
                        throw th5;
                    } catch (Throwable th6) {
                        jg.b.l(errorStream, th5);
                        throw th6;
                    }
                }
            }
        } catch (Throwable unused2) {
        }
        return sb3.toString();
    }

    public static final String h(HttpURLConnection httpURLConnection) throws IOException {
        InputStream inputStream;
        if (httpURLConnection == null || (inputStream = httpURLConnection.getInputStream()) == null) {
            return null;
        }
        try {
            String strN = u.n(dh.b.M(inputStream));
            inputStream.close();
            return strN;
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                jg.b.l(inputStream, th3);
                throw th4;
            }
        }
    }

    public static final String i(String str) {
        str.getClass();
        String strEncode = URLEncoder.encode(str, "UTF-8");
        strEncode.getClass();
        return strEncode;
    }
}

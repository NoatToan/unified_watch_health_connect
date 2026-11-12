package com.huawei.hms.base.log;

import android.os.Process;
import android.util.Log;
import androidx.exifinterface.media.ExifInterface;
import com.huawei.operation.utils.Constants;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public class e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f12997b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f12998c;
    private int d;
    private String g;
    private int h;
    private int i;
    private int j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final StringBuilder f12996a = new StringBuilder();
    private long e = 0;
    private long f = 0;

    e(int i, String str, int i2, String str2) {
        this.f12998c = Constants.HMS;
        this.j = i;
        this.f12997b = str;
        this.d = i2;
        if (str2 != null) {
            this.f12998c = str2;
        }
        b();
    }

    public static String a(int i) {
        if (i == 3) {
            return "D";
        }
        if (i == 4) {
            return "I";
        }
        if (i != 5) {
            return i != 6 ? String.valueOf(i) : ExifInterface.LONGITUDE_EAST;
        }
        return "W";
    }

    private e b() {
        this.e = System.currentTimeMillis();
        Thread threadCurrentThread = Thread.currentThread();
        this.f = threadCurrentThread.getId();
        this.h = Process.myPid();
        StackTraceElement[] stackTrace = threadCurrentThread.getStackTrace();
        int length = stackTrace.length;
        int i = this.j;
        if (length > i) {
            StackTraceElement stackTraceElement = stackTrace[i];
            this.g = stackTraceElement.getFileName();
            this.i = stackTraceElement.getLineNumber();
        }
        return this;
    }

    public String c() {
        StringBuilder sb = new StringBuilder();
        b(sb);
        return sb.toString();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        b(sb);
        a(sb);
        return sb.toString();
    }

    public <T> e a(T t) {
        this.f12996a.append(t);
        return this;
    }

    public e a(Throwable th) {
        a('\n').a(Log.getStackTraceString(th));
        return this;
    }

    public String a() {
        StringBuilder sb = new StringBuilder();
        a(sb);
        return sb.toString();
    }

    private StringBuilder a(StringBuilder sb) {
        sb.append(' ');
        sb.append(this.f12996a.toString());
        return sb;
    }

    private StringBuilder b(StringBuilder sb) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.getDefault());
        sb.append('[');
        sb.append(simpleDateFormat.format(Long.valueOf(this.e)));
        String strA = a(this.d);
        sb.append(' ');
        sb.append(strA);
        sb.append('/');
        sb.append(this.f12998c);
        sb.append('/');
        sb.append(this.f12997b);
        sb.append(' ');
        sb.append(this.h);
        sb.append(':');
        sb.append(this.f);
        sb.append(' ');
        sb.append(this.g);
        sb.append(':');
        sb.append(this.i);
        sb.append(']');
        return sb;
    }
}

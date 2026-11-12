package defpackage;

import android.os.Process;
import com.huawei.openplatform.abl.log.LogLevel;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* JADX INFO: loaded from: classes12.dex */
public class ohn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f44333a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f44335c;
    private String d;
    private String e;
    private int j;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f44334b = 0;
    private final StringBuilder f = new StringBuilder();

    public String toString() {
        StringBuilder sb = new StringBuilder();
        e(sb);
        d(sb);
        return sb.toString();
    }

    public String d() {
        StringBuilder sb = new StringBuilder();
        e(sb);
        return sb.toString();
    }

    public String c() {
        StringBuilder sb = new StringBuilder();
        d(sb);
        return sb.toString();
    }

    public <T> ohn e(T t) {
        this.f.append(t);
        return this;
    }

    private StringBuilder e(StringBuilder sb) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.ENGLISH);
        sb.append('[');
        sb.append(simpleDateFormat.format(Long.valueOf(this.f44334b)));
        String strPriorityToString = LogLevel.priorityToString(this.f44335c);
        sb.append(' ');
        sb.append(strPriorityToString);
        sb.append('/');
        sb.append(this.f44333a);
        sb.append('/');
        sb.append(this.e);
        sb.append(' ');
        sb.append(this.j);
        sb.append(':');
        sb.append(this.d);
        sb.append(']');
        return sb;
    }

    private ohn e() {
        this.f44334b = System.currentTimeMillis();
        this.d = Thread.currentThread().getName();
        this.j = Process.myPid();
        return this;
    }

    private StringBuilder d(StringBuilder sb) {
        sb.append(' ');
        sb.append((CharSequence) this.f);
        return sb;
    }

    ohn(String str, int i, String str2) {
        this.f44333a = null;
        this.e = "HA";
        this.f44335c = 0;
        this.f44333a = str;
        this.f44335c = i;
        if (str2 != null) {
            this.e = str2;
        }
        e();
    }
}

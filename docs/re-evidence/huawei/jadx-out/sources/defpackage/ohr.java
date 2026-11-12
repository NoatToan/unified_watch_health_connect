package defpackage;

import android.text.TextUtils;
import com.huawei.openplatform.abl.log.i;
import com.huawei.openplatform.abl.log.m;

/* JADX INFO: loaded from: classes12.dex */
public class ohr {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f44346c;
    private i d;
    private String e = "SDK.";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f44345b = 4;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f44344a = false;

    public void c(int i, String str, String str2) {
        if (e(i)) {
            String str3 = this.e + str;
            this.d.a(a(i, str3, str2), i, str3);
        }
    }

    public boolean e(int i) {
        return this.f44344a && i >= this.f44345b;
    }

    public void a(String str, String str2) {
        if (this.f44344a) {
            this.d.a(a(4, str, str2), 4, str);
        }
    }

    public void b(ohi ohiVar) {
        int iC = ohiVar.c();
        String strA = ohiVar.a();
        String strD = ohiVar.d();
        String strE = ohiVar.e();
        this.d = oho.b(ohiVar.g());
        this.f44345b = iC;
        this.f44346c = strD;
        String str = strD + "_Log";
        if (TextUtils.isEmpty(strE)) {
            strE = str;
        }
        this.e = strD + ".";
        this.d.a(strA, strE);
        this.f44344a = true;
    }

    public void c(int i, String str, Throwable th) {
        if (th == null || !e(i)) {
            return;
        }
        StringBuilder sb = new StringBuilder("Exception: ");
        sb.append(th.getClass().getName());
        sb.append(" msg: ");
        sb.append(m.a(th.getMessage()));
        sb.append('\n');
        int i2 = 0;
        for (StackTraceElement stackTraceElement : th.getStackTrace()) {
            if (i2 >= 10) {
                break;
            }
            sb.append(stackTraceElement.toString());
            sb.append('\n');
            i2++;
        }
        c(i, str, sb.toString());
    }

    public void a(int i, String str, String str2, Throwable th) {
        c(i, str, str2 + " | Exception: " + th.getClass().getSimpleName() + " msg: " + m.a(th.getMessage()));
    }

    private ohn a(int i, String str, String str2) {
        ohn ohnVar = new ohn(this.f44346c, i, str);
        ohnVar.e(str2);
        return ohnVar;
    }
}

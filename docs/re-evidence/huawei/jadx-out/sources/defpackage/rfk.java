package defpackage;

import android.os.Bundle;
import android.view.View;
import com.huawei.operation.OpAnalyticsConstants;

/* JADX INFO: loaded from: classes16.dex */
public class rfk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f47259a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f47260b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f47261c;
    private String d;
    private int e;
    private String f;
    private int g;
    private View.OnClickListener h;
    private int i;
    private int j;
    private String l;

    public rfk(int i) {
        this.e = -1;
        this.d = null;
        this.l = null;
        this.j = -1;
        this.i = -1;
        this.f47260b = false;
        this.f = "";
        this.f47259a = false;
        this.h = null;
        this.g = i;
    }

    public rfk(int i, String str, String str2, int i2) {
        this.e = -1;
        this.d = null;
        this.l = null;
        this.j = -1;
        this.i = -1;
        this.f47260b = false;
        this.g = -1;
        this.f = "";
        this.f47259a = false;
        this.h = null;
        this.e = ((Integer) lst.d(Integer.valueOf(i))).intValue();
        this.d = (String) lst.d(str);
        this.l = (String) lst.d(str2);
        this.i = ((Integer) lst.d(Integer.valueOf(i2))).intValue();
    }

    public rfk(int i, String str, String str2, boolean z, String str3) {
        this.e = -1;
        this.d = null;
        this.l = null;
        this.j = -1;
        this.i = -1;
        this.f47260b = false;
        this.g = -1;
        this.f = "";
        this.f47259a = false;
        this.h = null;
        this.e = ((Integer) lst.d(Integer.valueOf(i))).intValue();
        this.d = (String) lst.d(str);
        this.l = (String) lst.d(str2);
        this.f47260b = ((Boolean) lst.d(Boolean.valueOf(z))).booleanValue();
        this.f47261c = (String) lst.d(str3);
    }

    public boolean k() {
        return this.f47259a;
    }

    public void b(boolean z) {
        this.f47259a = z;
    }

    public String h() {
        return this.f;
    }

    public void a(String str) {
        this.f = str;
    }

    public int e() {
        return ((Integer) lst.d(Integer.valueOf(this.g))).intValue();
    }

    public void e(int i) {
        this.g = ((Integer) lst.d(Integer.valueOf(i))).intValue();
    }

    public boolean j() {
        return ((Boolean) lst.d(Boolean.valueOf(this.f47260b))).booleanValue();
    }

    public String d() {
        return (String) lst.d(this.f47261c);
    }

    public int a() {
        return ((Integer) lst.d(Integer.valueOf(this.e))).intValue();
    }

    public String c() {
        return (String) lst.d(this.d);
    }

    public String f() {
        return (String) lst.d(this.l);
    }

    public int g() {
        return ((Integer) lst.d(Integer.valueOf(this.i))).intValue();
    }

    public View.OnClickListener i() {
        return (View.OnClickListener) lst.d(this.h);
    }

    public void b(View.OnClickListener onClickListener) {
        this.h = (View.OnClickListener) lst.d(onClickListener);
    }

    public String toString() {
        return "SettingMainListItem [mId=" + this.e + ", mContent=" + this.d + ", mSummary=" + this.l + ", mResIdRight=" + this.j + ",mResView=" + this.i + "]";
    }

    public Bundle b() {
        Bundle bundle = new Bundle();
        bundle.putInt(OpAnalyticsConstants.OPERATION_ID, a());
        bundle.putString("mContent", c());
        return bundle;
    }
}

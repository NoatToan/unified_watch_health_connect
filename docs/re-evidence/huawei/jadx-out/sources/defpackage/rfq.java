package defpackage;

import android.widget.CompoundButton;

/* JADX INFO: loaded from: classes16.dex */
public class rfq {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f47274c = -1;
    private int e = 0;
    private int i = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f47273b = null;
    private String j = null;
    private String g = null;
    private boolean d = false;
    private CompoundButton.OnCheckedChangeListener f = null;
    private boolean h = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f47272a = true;

    public void e(int i) {
        this.f47274c = i;
    }

    public int b() {
        return this.f47274c;
    }

    public void e(String str) {
        this.f47273b = str;
    }

    public String e() {
        return this.f47273b;
    }

    public void c(String str) {
        this.j = str;
    }

    public String h() {
        return this.j;
    }

    public void a(String str) {
        this.g = str;
    }

    public String c() {
        return this.g;
    }

    public void d(int i) {
        this.i = i;
    }

    public int i() {
        return this.i;
    }

    public void b(boolean z) {
        this.d = z;
    }

    public boolean g() {
        return this.d;
    }

    public boolean j() {
        return this.h;
    }

    public void e(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f = onCheckedChangeListener;
    }

    public CompoundButton.OnCheckedChangeListener d() {
        return this.f;
    }

    public void a(int i) {
        this.e = i;
    }

    public int a() {
        return this.e;
    }

    public void c(boolean z) {
        this.f47272a = z;
    }

    public boolean f() {
        return this.f47272a;
    }

    public String toString() {
        return "DeviceSettingFactoryListItem [mId=" + this.f47274c + ", mContent=" + this.f47273b + ", mSubContent=" + this.j + ", mIsChecked=" + this.d + ", mType=" + this.i + "]";
    }
}

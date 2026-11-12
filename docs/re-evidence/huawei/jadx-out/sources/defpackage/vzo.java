package defpackage;

import android.content.ContentValues;

/* JADX INFO: loaded from: classes19.dex */
public class vzo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f51748a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f51749b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String[] f51750c;
    private ContentValues d;
    private int e;
    private long f;
    private int g;
    private int[] h;
    private String i;
    private int j;
    private int k;
    private String l;
    private boolean m;
    private long n;
    private boolean o;
    private int[] p;

    public vzo() {
        this(0L, 0L, 0, "", "");
    }

    public vzo(long j, long j2, int i, String str, String str2) {
        this.d = new ContentValues();
        this.n = j;
        this.f = j2;
        this.k = i;
        this.i = str;
        this.l = str2;
    }

    public vzo(int i, String str, String str2) {
        this.d = new ContentValues();
        this.g = i;
        this.i = str;
        this.l = str2;
    }

    public int c() {
        return this.f51749b;
    }

    public void c(int i) {
        this.f51749b = i;
    }

    public long m() {
        return this.n;
    }

    public void a(long j) {
        this.n = j;
    }

    public long h() {
        return this.f;
    }

    public void e(long j) {
        this.f = j;
    }

    public String[] e() {
        String[] strArr = this.f51750c;
        if (strArr == null) {
            return new String[0];
        }
        return (String[]) strArr.clone();
    }

    public void d(String[] strArr) {
        if (strArr == null) {
            this.f51750c = null;
        } else {
            this.f51750c = (String[]) strArr.clone();
        }
    }

    public int d() {
        return this.e;
    }

    public void d(int i) {
        this.e = i;
    }

    public int[] o() {
        int[] iArr = this.p;
        if (iArr == null) {
            return new int[0];
        }
        return (int[]) iArr.clone();
    }

    public void e(int[] iArr) {
        if (iArr == null) {
            this.p = null;
        } else {
            this.p = (int[]) iArr.clone();
        }
    }

    public int g() {
        return this.j;
    }

    public void b(int i) {
        this.j = i;
    }

    public int l() {
        return this.k;
    }

    public void a(int i) {
        this.k = i;
    }

    public int a() {
        return this.g;
    }

    public int b() {
        return this.f51748a;
    }

    public void e(int i) {
        this.f51748a = i;
    }

    public String j() {
        return this.i;
    }

    public void e(String str) {
        this.i = str;
    }

    public boolean k() {
        return this.m;
    }

    public void e(boolean z) {
        this.m = z;
    }

    public int[] i() {
        int[] iArr = this.h;
        if (iArr == null) {
            return new int[0];
        }
        return (int[]) iArr.clone();
    }

    public void a(int[] iArr) {
        if (iArr == null) {
            this.h = null;
        } else {
            this.h = (int[]) iArr.clone();
        }
    }

    public String f() {
        return this.l;
    }

    public void c(String str) {
        this.l = str;
    }

    public boolean n() {
        return this.o;
    }

    public void b(boolean z) {
        this.o = z;
    }

    public void a(String str, int i) {
        if (this.d.containsKey(str)) {
            this.d.remove(str);
        }
        this.d.put(str, Integer.valueOf(i));
    }

    public int b(String str) {
        Integer asInteger = this.d.getAsInteger(str);
        if (asInteger == null) {
            return Integer.MIN_VALUE;
        }
        return asInteger.intValue();
    }
}

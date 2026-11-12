package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes7.dex */
public class dwd implements Serializable {
    private static final long serialVersionUID = 5732217115586382887L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f32441a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f32442b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f32443c;
    private String d;

    public void b(String str) {
        this.d = (String) dym.d(str);
    }

    public String e() {
        return (String) dym.d(this.f32443c);
    }

    public void a(String str) {
        this.f32443c = (String) dym.d(str);
    }

    public String b() {
        return (String) dym.d(this.f32442b);
    }

    public void d(String str) {
        this.f32442b = (String) dym.d(str);
    }

    public int d() {
        return ((Integer) dym.d(Integer.valueOf(this.f32441a))).intValue();
    }

    public void a(int i) {
        this.f32441a = ((Integer) dym.d(Integer.valueOf(i))).intValue();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(16);
        sb.append("WeightResultShowModel [weight=");
        sb.append(this.d);
        sb.append(", bodyFat=");
        sb.append(this.f32443c);
        sb.append(", targetWeight=");
        sb.append(this.f32442b);
        sb.append(", bodyFatColor=");
        sb.append(this.f32441a);
        sb.append("]");
        return sb.toString();
    }
}

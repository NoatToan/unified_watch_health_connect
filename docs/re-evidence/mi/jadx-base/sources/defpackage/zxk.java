package defpackage;

/* JADX INFO: loaded from: classes7.dex */
public class zxk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f41784a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f41785b;
    public int c = 0;

    public zxk(int i, int i2) {
        this.f41784a = i;
        this.f41785b = i2;
    }

    public int a() {
        return this.f41784a;
    }

    public int b() {
        return this.f41785b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        zxk zxkVar = (zxk) obj;
        return this.f41784a == zxkVar.a() && this.f41785b == zxkVar.b();
    }

    public int hashCode() {
        String str = String.valueOf(this.f41784a) + "|" + String.valueOf(this.f41785b);
        int i = this.c;
        if (i == 0 && str.length() > 0) {
            for (char c : str.toCharArray()) {
                i = (i * 31) + c;
            }
            this.c = i;
        }
        return i;
    }
}

package defpackage;

/* JADX INFO: loaded from: classes7.dex */
public class j4n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f22416a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f22417b;
    public int c;

    public j4n() {
    }

    public int a() {
        return this.c;
    }

    public int b() {
        return this.f22417b;
    }

    public int c() {
        return this.f22416a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        j4n j4nVar = (j4n) obj;
        return this.c == j4nVar.c && this.f22417b == j4nVar.f22417b && this.f22416a == j4nVar.f22416a;
    }

    public int hashCode() {
        return ((((this.c + 31) * 31) + this.f22417b) * 31) + this.f22416a;
    }

    public String toString() {
        return this.f22416a + "-" + this.f22417b + "-" + this.c;
    }

    public j4n(int i, int i2, int i3) {
        this.f22416a = i;
        this.f22417b = i2;
        this.c = i3;
    }
}

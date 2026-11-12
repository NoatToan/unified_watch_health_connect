package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes21.dex */
public final class ahd implements Comparable<ahd>, Serializable {
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f404a;
    private int d;
    private Class<?> e;

    public ahd() {
        this.e = null;
        this.f404a = null;
        this.d = 0;
    }

    public ahd(Class<?> cls) {
        this.e = cls;
        String name = cls.getName();
        this.f404a = name;
        this.d = name.hashCode();
    }

    public void a(Class<?> cls) {
        this.e = cls;
        String name = cls.getName();
        this.f404a = name;
        this.d = name.hashCode();
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(ahd ahdVar) {
        return this.f404a.compareTo(ahdVar.f404a);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return obj != null && obj.getClass() == getClass() && ((ahd) obj).e == this.e;
    }

    public int hashCode() {
        return this.d;
    }

    public String toString() {
        return this.f404a;
    }
}

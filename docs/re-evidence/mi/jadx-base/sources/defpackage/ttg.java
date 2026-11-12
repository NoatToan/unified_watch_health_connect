package defpackage;

/* JADX INFO: loaded from: classes7.dex */
public class ttg implements Comparable<ttg> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f35023a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public mjh<Float, Float> f35024b;
    public float c;
    public int d = 0;

    public ttg(String str, mjh<Float, Float> mjhVar, float f) {
        this.f35023a = str;
        this.f35024b = mjhVar;
        this.c = f;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(ttg ttgVar) {
        return this.f35023a.compareTo(ttgVar.f35023a);
    }

    public float b() {
        return this.c;
    }

    public mjh<Float, Float> c() {
        return this.f35024b;
    }

    public boolean equals(Object obj) {
        if (obj instanceof ttg) {
            return this.f35023a.equals(((ttg) obj).f35023a);
        }
        return false;
    }

    public int hashCode() {
        int i = this.d;
        if (i == 0 && this.f35023a.length() > 0) {
            for (char c : this.f35023a.toCharArray()) {
                i = (i * 31) + c;
            }
            this.d = i;
        }
        return i;
    }

    public String toString() {
        return this.f35024b + "\t" + this.f35023a + "\t" + this.c;
    }
}

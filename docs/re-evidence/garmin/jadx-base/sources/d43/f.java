package d43;

/* JADX INFO: loaded from: classes3.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x33.b f57479a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f57480b;

    public f(x33.b bVar, int i14) {
        bVar.getClass();
        this.f57479a = bVar;
        this.f57480b = i14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f57479a.equals(fVar.f57479a) && this.f57480b == fVar.f57480b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f57480b) + (this.f57479a.hashCode() * 31);
    }

    public final String toString() {
        int i14;
        StringBuilder sb3 = new StringBuilder();
        int i15 = 0;
        while (true) {
            i14 = this.f57480b;
            if (i15 >= i14) {
                break;
            }
            sb3.append("kotlin/Array<");
            i15++;
        }
        sb3.append(this.f57479a);
        for (int i16 = 0; i16 < i14; i16++) {
            sb3.append(">");
        }
        return sb3.toString();
    }
}

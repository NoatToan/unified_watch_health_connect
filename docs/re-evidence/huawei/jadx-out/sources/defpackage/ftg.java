package defpackage;

import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes7.dex */
public class ftg {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f34549b;
    private fth[] e;

    public int b() {
        return this.f34549b;
    }

    public void d(int i) {
        this.f34549b = i;
    }

    public fth[] d() {
        return this.e;
    }

    public void b(fth[] fthVarArr) {
        this.e = fthVarArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ftg ftgVar = (ftg) obj;
        return this.f34549b == ftgVar.f34549b && Arrays.equals(this.e, ftgVar.e);
    }

    public int hashCode() {
        return (Objects.hash(Integer.valueOf(this.f34549b)) * 31) + Arrays.hashCode(this.e);
    }
}

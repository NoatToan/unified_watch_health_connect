package defpackage;

import java.io.File;

/* JADX INFO: loaded from: classes5.dex */
public final class kit extends fkt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f23902a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f23903b;

    public kit(File file, String str) {
        if (file == null) {
            throw new NullPointerException("Null splitFile");
        }
        this.f23902a = file;
        if (str == null) {
            throw new NullPointerException("Null splitId");
        }
        this.f23903b = str;
    }

    @Override // defpackage.fkt
    public final File a() {
        return this.f23902a;
    }

    @Override // defpackage.fkt
    public final String b() {
        return this.f23903b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof fkt) {
            fkt fktVar = (fkt) obj;
            if (this.f23902a.equals(fktVar.a()) && this.f23903b.equals(fktVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f23902a.hashCode() ^ 1000003) * 1000003) ^ this.f23903b.hashCode();
    }

    public final String toString() {
        return "SplitFileInfo{splitFile=" + this.f23902a.toString() + ", splitId=" + this.f23903b + "}";
    }
}

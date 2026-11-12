package defpackage;

import defpackage.zzp;

/* JADX INFO: loaded from: classes4.dex */
public abstract class zzp<CHILD extends zzp<CHILD, TranscodeType>, TranscodeType> implements Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public xzp<? super TranscodeType> f41838a = nvg.b();

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final CHILD clone() {
        try {
            return (CHILD) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public final xzp<? super TranscodeType> b() {
        return this.f41838a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof zzp) {
            return ulq.e(this.f41838a, ((zzp) obj).f41838a);
        }
        return false;
    }

    public int hashCode() {
        xzp<? super TranscodeType> xzpVar = this.f41838a;
        if (xzpVar != null) {
            return xzpVar.hashCode();
        }
        return 0;
    }
}

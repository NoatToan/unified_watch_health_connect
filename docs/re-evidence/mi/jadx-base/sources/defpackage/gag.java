package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public class gag implements y5d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f18781a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f18782b;
    public final y5d c;
    public final Integer d;

    public gag(int i, boolean z, y5d y5dVar, Integer num) {
        this.f18781a = i;
        this.f18782b = z;
        this.c = y5dVar;
        this.d = num;
    }

    public final x5d a(l4d l4dVar, boolean z) {
        y5d y5dVar = this.c;
        if (y5dVar == null) {
            return null;
        }
        return y5dVar.createImageTranscoder(l4dVar, z);
    }

    public final x5d b(l4d l4dVar, boolean z) {
        Integer num = this.d;
        if (num == null) {
            return null;
        }
        int iIntValue = num.intValue();
        if (iIntValue == 0) {
            return c(l4dVar, z);
        }
        if (iIntValue == 1) {
            return d(l4dVar, z);
        }
        throw new IllegalArgumentException("Invalid ImageTranscoderType");
    }

    public final x5d c(l4d l4dVar, boolean z) {
        return qhg.a(this.f18781a, this.f18782b).createImageTranscoder(l4dVar, z);
    }

    @Override // defpackage.y5d
    public x5d createImageTranscoder(l4d l4dVar, boolean z) {
        x5d x5dVarA = a(l4dVar, z);
        if (x5dVarA == null) {
            x5dVarA = b(l4dVar, z);
        }
        if (x5dVarA == null) {
            x5dVarA = c(l4dVar, z);
        }
        return x5dVarA == null ? d(l4dVar, z) : x5dVarA;
    }

    public final x5d d(l4d l4dVar, boolean z) {
        return new ucm(this.f18781a).createImageTranscoder(l4dVar, z);
    }
}

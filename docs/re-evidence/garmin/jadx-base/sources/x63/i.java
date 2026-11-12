package x63;

import e23.p;
import java.io.IOException;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.r0;
import w63.b0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class i implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f189346a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r0 f189347b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b0 f189348c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r0 f189349d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r0 f189350e;

    public /* synthetic */ i(r0 r0Var, b0 b0Var, r0 r0Var2, r0 r0Var3) {
        this.f189347b = r0Var;
        this.f189348c = b0Var;
        this.f189349d = r0Var2;
        this.f189350e = r0Var3;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [T, java.lang.Long] */
    /* JADX WARN: Type inference failed for: r12v11, types: [T, java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r12v13, types: [T, java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r12v15, types: [T, java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r12v24, types: [T, java.lang.Long] */
    /* JADX WARN: Type inference failed for: r12v26, types: [T, java.lang.Long] */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) throws IOException {
        int i14 = this.f189346a;
        int iIntValue = ((Integer) obj).intValue();
        Long l14 = (Long) obj2;
        switch (i14) {
            case 0:
                long jLongValue = l14.longValue();
                if (iIntValue == 21589) {
                    if (jLongValue >= 1) {
                        b0 b0Var = this.f189348c;
                        byte b14 = b0Var.readByte();
                        boolean z14 = (b14 & 1) == 1;
                        boolean z15 = (b14 & 2) == 2;
                        boolean z16 = (b14 & 4) == 4;
                        long j8 = z14 ? 5L : 1L;
                        if (z15) {
                            j8 += 4;
                        }
                        if (z16) {
                            j8 += 4;
                        }
                        if (jLongValue >= j8) {
                            if (z14) {
                                this.f189347b.f105810a = Integer.valueOf(b0Var.c());
                            }
                            if (z15) {
                                this.f189349d.f105810a = Integer.valueOf(b0Var.c());
                            }
                            if (z16) {
                                this.f189350e.f105810a = Integer.valueOf(b0Var.c());
                            }
                        } else {
                            vb.h.C("bad zip: extended timestamp extra too short");
                        }
                    } else {
                        vb.h.C("bad zip: extended timestamp extra too short");
                    }
                    return null;
                }
                return Unit.INSTANCE;
            default:
                long jLongValue2 = l14.longValue();
                if (iIntValue == 1) {
                    r0 r0Var = this.f189347b;
                    if (r0Var.f105810a != 0) {
                        vb.h.C("bad zip: NTFS extra attribute tag 0x0001 repeated");
                    } else if (jLongValue2 == 24) {
                        b0 b0Var2 = this.f189348c;
                        r0Var.f105810a = Long.valueOf(b0Var2.e());
                        this.f189349d.f105810a = Long.valueOf(b0Var2.e());
                        this.f189350e.f105810a = Long.valueOf(b0Var2.e());
                    } else {
                        vb.h.C("bad zip: NTFS extra attribute tag 0x0001 size != 24");
                    }
                    return null;
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ i(b0 b0Var, r0 r0Var, r0 r0Var2, r0 r0Var3) {
        this.f189348c = b0Var;
        this.f189347b = r0Var;
        this.f189349d = r0Var2;
        this.f189350e = r0Var3;
    }
}

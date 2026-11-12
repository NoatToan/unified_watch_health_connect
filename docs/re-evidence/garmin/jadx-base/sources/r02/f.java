package r02;

import b5.a0;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.q0;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class f implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f148839a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q0 f148840b;

    public /* synthetic */ f(int i14, q0 q0Var) {
        this.f148839a = i14;
        this.f148840b = q0Var;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f148839a;
        q0 q0Var = this.f148840b;
        a0 a0Var = (a0) obj;
        switch (i14) {
            case 0:
                float fFloatValue = ((Float) obj2).floatValue();
                a0Var.a();
                long jFloatToRawIntBits = Float.floatToRawIntBits(0.0f);
                long jFloatToRawIntBits2 = ((long) Float.floatToRawIntBits(fFloatValue)) & 4294967295L;
                n4.c.a aVar = n4.c.f123541b;
                q0Var.f105808a = jFloatToRawIntBits2 | (jFloatToRawIntBits << 32);
                break;
            default:
                a0Var.a();
                q0Var.f105808a = ((n4.c) obj2).f123544a;
                break;
        }
        return Unit.INSTANCE;
    }
}

package r02;

import j23.t;
import o53.l1;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class j implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f148887a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f148888b;

    public /* synthetic */ j(m mVar, int i14) {
        this.f148887a = i14;
        this.f148888b = mVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.a
    public final Object invoke() {
        int i14 = this.f148887a;
        m mVar = this.f148888b;
        switch (i14) {
            case 0:
                l1 l1Var = mVar.f148900h;
                if (l1Var != null) {
                    l1Var.c(null);
                }
                mVar.f148904l.setValue(Boolean.TRUE);
                return Unit.INSTANCE;
            case 1:
                mVar.f148904l.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            case 2:
                Boolean bool = (Boolean) mVar.f148904l.getF182175a();
                bool.booleanValue();
                return bool;
            default:
                int i15 = m.f148892q;
                float fIntBitsToFloat = Float.intBitsToFloat((int) (mVar.f() & 4294967295L));
                float fIntBitsToFloat2 = 0.0f;
                if (fIntBitsToFloat != 0.0f) {
                    fIntBitsToFloat2 = (Float.intBitsToFloat((int) (mVar.f() & 4294967295L)) / 2.0f) * ((float) Math.sin((t.d(mVar.f148902j.getFloatValue() / fIntBitsToFloat, -1.0f, 1.0f) * 3.1415927f) / 2));
                }
                return Float.valueOf(fIntBitsToFloat2);
        }
    }
}

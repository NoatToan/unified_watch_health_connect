package i3;

import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class q2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final q2 f89384a = new q2();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final z3.e f89385b = new z3.e(984817901, false, a.f89386a);

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class a implements e23.p<p3.m, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f89386a = new a();

        @Override // e23.p
        public final Unit invoke(p3.m mVar, Integer num) {
            p3.m mVar2 = mVar;
            int iIntValue = num.intValue();
            if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                p3.x1 x1Var = p3.n.f135158a;
                l3.z0.f109502a.getClass();
                u4.d dVarC = l3.z0.f109503b;
                if (dVarC == null) {
                    g6.f.a aVar = g6.f.f75994b;
                    u4.d.a aVar2 = new u4.d.a("Filled.Close", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 224, null);
                    p13.j0 j0Var = u4.m.f168519a;
                    o4.d0.f128823b.getClass();
                    o4.t1 t1Var = new o4.t1(o4.d0.f128824c, null);
                    o4.u1.f129010b.getClass();
                    o4.v1.f129019b.getClass();
                    int i14 = o4.v1.f129021d;
                    u4.e eVarM = com.nimbusds.jose.shaded.gson.internal.a.m(19.0f, 6.41f, 17.59f, 5.0f);
                    eVarM.i(12.0f, 10.59f);
                    eVarM.i(6.41f, 5.0f);
                    eVarM.i(5.0f, 6.41f);
                    eVarM.i(10.59f, 12.0f);
                    eVarM.i(5.0f, 17.59f);
                    eVarM.i(6.41f, 19.0f);
                    eVarM.i(12.0f, 13.41f);
                    eVarM.i(17.59f, 19.0f);
                    com.nimbusds.jose.shaded.gson.internal.a.z(eVarM, 19.0f, 17.59f, 13.41f, 12.0f);
                    u4.d.a.b(aVar2, eVarM.f168407a, 0, t1Var, 1.0f, null, 1.0f, i14, 1.0f);
                    dVarC = aVar2.c();
                    l3.z0.f109503b = dVarC;
                }
                int i15 = l3.n1.f109367b;
                i7.b(dVarC, l3.k.h(mVar2, R.string.m3c_snackbar_dismiss), null, 0L, mVar2, 0, 12);
            } else {
                mVar2.e();
            }
            return Unit.INSTANCE;
        }
    }
}

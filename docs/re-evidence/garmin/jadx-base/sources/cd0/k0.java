package cd0;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import java.util.UUID;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcd0/k0;", "Lcd0/i;", "<init>", "()V", "a", "gcm-domain-device_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class k0 extends i {

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"cd0/k0$b", "Lsm2/w$b;", "gcm-domain-device_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b implements sm2.w.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ bm2.d f26822a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ lm2.g f26823b;

        public b(bm2.d dVar, lm2.g gVar) {
            this.f26822a = dVar;
            this.f26823b = gVar;
        }

        @Override // sm2.w.b
        public final void a(long j8, long j14) {
        }

        @Override // sm2.w.b
        public final void b(o13.p<byte[], UUID> pVar, String str) {
            bm2.d dVar = this.f26822a;
            if (pVar == null || !(str == null || d53.w.J(str))) {
                String strN = fb1.c.n("Failed to retrieve device XML after firmware update: ", str);
                i2.a aVar = i2.f36769a;
                a2 a2Var = a2.GENERAL;
                aVar.getClass();
                i2.a.b(a2Var, "VectorHandshakeCompleteNonSetupFlowStrategy", strN);
            } else {
                i2.a aVar2 = i2.f36769a;
                a2 a2Var2 = a2.GENERAL;
                aVar2.getClass();
                i2.a.b(a2Var2, "VectorHandshakeCompleteNonSetupFlowStrategy", "Retrieved device XML after firmware update, saving to database");
                rd2.f.a().f152047c.j(dVar.getF92746j(), pVar.f128594a);
            }
            ((fm2.c) this.f26823b).j(dVar);
        }
    }

    static {
        new a(null);
    }

    @Override // cd0.i
    public final void d(bm2.d dVar, boolean z14) {
        l80.a aVar = (l80.a) KoinJavaComponent.get$default(l80.a.class, null, null, 6, null);
        int iH = aVar.h(dVar);
        lm2.g gVarC = lm2.h.c();
        if (iH < dVar.getF92745i()) {
            String strE = tn.k.e(iH, dVar.getF92745i(), "Retrieving device XML after firmware updated from ", " to ");
            i2.a aVar2 = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar2.getClass();
            i2.a.b(a2Var, "VectorHandshakeCompleteNonSetupFlowStrategy", strE);
            String strF = dVar.f();
            strF.getClass();
            ((fm2.c) gVarC).o(strF, new b(dVar, gVarC));
        } else {
            String strF2 = v.e0.f(dVar.getF92745i(), "No firmware update detected (current ", "), proceeding with handshake complete");
            i2.a aVar3 = i2.f36769a;
            a2 a2Var2 = a2.GENERAL;
            aVar3.getClass();
            i2.a.b(a2Var2, "VectorHandshakeCompleteNonSetupFlowStrategy", strF2);
            ((fm2.c) gVarC).j(dVar);
        }
        aVar.F(dVar);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcd0/k0$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-domain-device_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}

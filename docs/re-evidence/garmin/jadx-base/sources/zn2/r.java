package zn2;

import ch.qos.logback.core.spi.AbstractComponentTracker;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.feature.garminpay.util.InvalidApduResponseException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Set;
import org.koin.java.KoinJavaComponent;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Lns2/a;", "Lzn2/t3;", "<anonymous>", "(Lo53/b0;)Lns2/a;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.feature.garminpay.providers.gpay.NewFitPayCardProductCatalogProvider$getFromServerItems$2", f = "NewFitPayCardProductCatalogProvider.kt", l = {82, 96}, m = "invokeSuspend", v = 2)
public final class r extends v13.i implements e23.p<o53.b0, t13.d<? super ns2.a<? extends t3>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public sd2.f f205783a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f205784b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ hs2.a f205785c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ns2.b f205786d;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lul2/c;", "transfer", "", "<anonymous>", "(Lul2/c;)[B"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.feature.garminpay.providers.gpay.NewFitPayCardProductCatalogProvider$getFromServerItems$2$cplc$1", f = "NewFitPayCardProductCatalogProvider.kt", l = {83, 84}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<ul2.c, t13.d<? super byte[]>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f205787a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f205788b;

        public a(t13.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            a aVar = new a(dVar);
            aVar.f205788b = obj;
            return aVar;
        }

        @Override // e23.p
        public final Object invoke(ul2.c cVar, t13.d<? super byte[]> dVar) {
            return ((a) create(cVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x004f, code lost:
        
            if (r8 == r1) goto L18;
         */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws InvalidApduResponseException {
            ul2.c cVar = (ul2.c) this.f205788b;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f205787a;
            if (i14 != 0) {
                if (i14 == 1) {
                    o13.r.b(obj);
                } else {
                    if (i14 != 2) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o13.r.b(obj);
                }
                return p13.s.k(3, 45, (byte[]) obj);
            }
            o13.r.b(obj);
            aq2.j.f12491a.getClass();
            byte[] bArr = aq2.j.f12496f;
            this.f205788b = cVar;
            this.f205787a = 1;
            Object objF = w13.b.f(cVar, wq2.a.b(bArr), AbstractComponentTracker.LINGERING_TIMEOUT, this);
            if (objF != aVar) {
                objF = Unit.INSTANCE;
            }
            if (objF != aVar) {
            }
            return aVar;
            wq2.a.f186629a.getClass();
            byte[] bArr2 = wq2.a.f186630b;
            this.f205788b = null;
            this.f205787a = 2;
            obj = w13.b.f(cVar, bArr2, AbstractComponentTracker.LINGERING_TIMEOUT, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(hs2.a aVar, ns2.b bVar, t13.d<? super r> dVar) {
        super(2, dVar);
        this.f205785c = aVar;
        this.f205786d = bVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new r(this.f205785c, this.f205786d, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super ns2.a<? extends t3>> dVar) {
        return ((r) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x00de, code lost:
    
        if (r0 == r8) goto L21;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws IOException {
        sd2.f fVarI;
        Object objC;
        Object objB;
        t3 t3VarA;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f205784b;
        hs2.a aVar2 = this.f205785c;
        if (i14 != 0) {
            if (i14 == 1) {
                fVarI = this.f205783a;
                o13.r.b(obj);
                objC = obj;
            } else {
                if (i14 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
                objB = obj;
            }
            ns2.b bVar = this.f205786d;
            ArrayList arrayList = new ArrayList();
            for (fo2.w wVar : (Iterable) objB) {
                try {
                    t3.a aVar3 = t3.f205847j;
                    Logger logger = ns2.b.f127817g;
                    ArrayList arrayListA = bVar.a(null);
                    aVar3.getClass();
                    t3VarA = t3.a.a(wVar, arrayListA);
                } catch (Throwable th3) {
                    q.a.a(q.f205734b).warn("Error during convert operator into ServerBasedOperator, drop " + wVar, th3);
                    t3VarA = null;
                }
                if (t3VarA != null) {
                    arrayList.add(t3VarA);
                }
            }
            return new ns2.a(arrayList, true);
        }
        o13.r.b(obj);
        j jVar = j.f205593a;
        Set<pl2.c> setB = aVar2.getNfcInfo().b();
        jVar.getClass();
        if (!j.f(setB)) {
            q.a.a(q.f205734b).info("No snowball capability, won't get products from server.");
            return gg.b.q(true);
        }
        q.a.a(q.f205734b).info("Here is the snowball capability, get products from server.");
        rd2.j jVar2 = rd2.f.a().f152045a;
        long unitId = aVar2.getUnitId();
        jVar2.getClass();
        fVarI = rd2.j.i(unitId, null);
        if (fVarI == null) {
            vb.h.z(org.apache.commons.lang3.e.e(aVar2.getUnitId(), "Cannot get device database record for "));
            return null;
        }
        ps2.w wVar2 = ps2.w.f140538a;
        long unitId2 = aVar2.getUnitId();
        wVar2.getClass();
        ps2.n nVarI = ps2.w.i(unitId2);
        if (nVarI == null) {
            vb.h.z(org.apache.commons.lang3.e.e(aVar2.getUnitId(), "Cannot find device wallet for "));
            return null;
        }
        hs2.d dVar = nVarI.f140499b;
        a aVar4 = new a(null);
        this.f205783a = fVarI;
        this.f205784b = 1;
        objC = ks2.e.c(dVar, aVar4, this);
        if (objC != aVar) {
        }
        return aVar;
        String strB = hb2.d.b((byte[]) objC);
        strB.getClass();
        Locale locale = Locale.US;
        locale.getClass();
        String upperCase = strB.toUpperCase(locale);
        upperCase.getClass();
        wr2.p pVar = wr2.p.f186870a;
        String string = ((hn2.a) KoinJavaComponent.get$default(hn2.a.class, null, null, 6, null)).c().getString(R.string.is_snowball_sandbox_role);
        string.getClass();
        pVar.getClass();
        boolean zB = wr2.p.b("general_app", string, false);
        sd2.f fVar = fVarI;
        u0 u0Var = u0.f205864a;
        String applicationKey = fVar.getApplicationKey();
        applicationKey.getClass();
        Set<pl2.c> setB2 = aVar2.getNfcInfo().b();
        String productNumber = fVar.getProductNumber();
        productNumber.getClass();
        aq2.j.f12491a.getClass();
        boolean zF = aq2.j.f();
        this.f205783a = null;
        this.f205784b = 2;
        objB = u0Var.b(applicationKey, setB2, upperCase, productNumber, zB, zF, this);
    }
}

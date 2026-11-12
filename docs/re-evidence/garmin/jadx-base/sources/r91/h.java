package r91;

import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.v2;
import e23.l;
import e23.p;
import java.util.Iterator;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.h0;
import r53.z1;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.personalrecords.domain.usecase.PRHistoryUseCase$deletePersonalRecord$1", f = "PRHistoryUseCase.kt", l = {210, 230}, m = "invokeSuspend", v = 2)
public final class h extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public n91.a f151409a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f151410b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k f151411c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f151412d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l<n91.a, Unit> f151413e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.repcounting.model.f f151414f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ e23.a<Unit> f151415g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public h(k kVar, long j8, l<? super n91.a, Unit> lVar, com.garmin.android.apps.connectmobile.repcounting.model.f fVar, e23.a<Unit> aVar, t13.d<? super h> dVar) {
        super(2, dVar);
        this.f151411c = kVar;
        this.f151412d = j8;
        this.f151413e = lVar;
        this.f151414f = fVar;
        this.f151415g = aVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new h(this.f151411c, this.f151412d, this.f151413e, this.f151414f, this.f151415g, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((h) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:68:0x015b  */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        aa1.e value;
        Object objF;
        aa1.e value2;
        aa1.d next;
        i53.c<aa1.d> cVarE;
        Object next2;
        n91.a aVar;
        Object objA;
        n91.a aVar2;
        Long l14;
        Long l15;
        aa1.e value3;
        aa1.e eVar;
        u13.a aVar3 = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f151410b;
        long j8 = this.f151412d;
        k kVar = this.f151411c;
        if (i14 == 0) {
            r.b(obj);
            z1<aa1.e> z1Var = kVar.f151431e;
            do {
                value = z1Var.getValue();
            } while (!z1Var.b(value, aa1.e.b(value, true, false, null, null, null, null, null, 2046)));
            o91.a aVar4 = kVar.f151428b;
            this.f151410b = 1;
            objF = aVar4.f(j8, this);
            if (objF != aVar3) {
            }
            return aVar3;
        }
        if (i14 == 1) {
            r.b(obj);
            objF = obj;
        } else {
            if (i14 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            aVar2 = this.f151409a;
            r.b(obj);
            objA = obj;
        }
        aVar = aVar2;
        kVar.f151430d.b(new p22.a(kVar.f151427a.getString(R.string.lbl_personal_records_updated_message), null, null, 6, null));
        this.f151413e.invoke(aVar != null ? n91.a.b(aVar, q91.c.ACCEPTED, 4091) : null);
        return Unit.INSTANCE;
        if (((v2) objF) instanceof v2.b) {
            z1<aa1.e> z1Var2 = kVar.f151431e;
            z1<aa1.e> z1Var3 = kVar.f151431e;
            Iterator<aa1.d> it = z1Var2.getValue().f2269k.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                Long l16 = next.f2256h;
                if (l16 != null && l16.longValue() == j8) {
                    break;
                }
            }
            aa1.d dVar = next;
            if (dVar == null || (cVarE = i53.a.e(h0.y0(z1Var3.getValue().f2269k, dVar))) == null) {
                cVarE = z1Var3.getValue().f2269k;
            }
            i53.c<aa1.d> cVar = cVarE;
            if (cVar.size() >= 9 || ((l15 = z1Var3.getValue().f2264f) != null && j8 == l15.longValue())) {
                Iterator it3 = kVar.f151433g.iterator();
                do {
                    if (!it3.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it3.next();
                    l14 = ((n91.a) next2).getCom.google.android.exoplayer2.text.ttml.TtmlNode.ATTR_ID java.lang.String();
                    if (l14 == null) {
                        break;
                    }
                } while (j8 == l14.longValue());
                aVar = (n91.a) next2;
                q91.d dVar2 = z1Var3.getValue().f2262d;
                if (dVar2 != null) {
                    this.f151409a = aVar;
                    this.f151410b = 2;
                    objA = kVar.a(dVar2, this.f151414f, this.f151415g, this);
                    if (objA != aVar3) {
                        aVar2 = aVar;
                        aVar = aVar2;
                    }
                    return aVar3;
                }
            } else {
                do {
                    value3 = z1Var3.getValue();
                    eVar = value3;
                } while (!z1Var3.b(value3, dVar != null ? aa1.e.b(eVar, false, false, null, null, null, null, cVar, 1022) : aa1.e.b(eVar, false, false, null, null, null, null, null, 2046)));
                aVar = null;
            }
            kVar.f151430d.b(new p22.a(kVar.f151427a.getString(R.string.lbl_personal_records_updated_message), null, null, 6, null));
            this.f151413e.invoke(aVar != null ? n91.a.b(aVar, q91.c.ACCEPTED, 4091) : null);
        } else {
            kVar.f151430d.a();
            z1<aa1.e> z1Var4 = kVar.f151431e;
            do {
                value2 = z1Var4.getValue();
            } while (!z1Var4.b(value2, aa1.e.b(value2, false, false, null, null, null, null, null, 2046)));
        }
        return Unit.INSTANCE;
    }
}

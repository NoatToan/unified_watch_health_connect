package gx;

import e32.o;
import g22.k;
import hd1.m;
import java.util.Iterator;
import java.util.List;
import o13.r;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.i;
import r53.j;
import vb.h;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lr53/i;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e implements i<gx.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f80034a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f80035b;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a<T> implements j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j f80036a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ f f80037b;

        /* JADX INFO: renamed from: gx.e$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        @v13.e(c = "com.garmin.android.apps.connectmobile.bodybattery.domain.dashboard.GetBodyBatterySecondaryStatsDataUseCase$invoke$$inlined$map$1$2", f = "GetBodyBatterySecondaryStatsDataUseCase.kt", l = {50}, m = "emit", v = 2)
        public static final class C1603a extends v13.c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public /* synthetic */ Object f80038a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f80039b;

            public C1603a(t13.d dVar) {
                super(dVar);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                this.f80038a = obj;
                this.f80039b |= Integer.MIN_VALUE;
                return a.this.emit(null, this);
            }
        }

        public a(j jVar, f fVar) {
            this.f80036a = jVar;
            this.f80037b = fVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // r53.j
        public final Object emit(Object obj, t13.d dVar) {
            C1603a c1603a;
            T next;
            boolean z14;
            hs1.a bodyBattery;
            hs1.a bodyBattery2;
            hs1.a bodyBattery3;
            if (dVar instanceof C1603a) {
                c1603a = (C1603a) dVar;
                int i14 = c1603a.f80039b;
                if ((i14 & Integer.MIN_VALUE) != 0) {
                    c1603a.f80039b = i14 - Integer.MIN_VALUE;
                } else {
                    c1603a = new C1603a(dVar);
                }
            } else {
                c1603a = new C1603a(dVar);
            }
            Object obj2 = c1603a.f80038a;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i15 = c1603a.f80039b;
            if (i15 == 0) {
                r.b(obj2);
                j70.j jVar = (j70.j) obj;
                ae0.b bVar = this.f80037b.f80042b;
                List listA = ae0.b.a((String) jVar.f97543b, o.f62807j);
                Iterator<T> it = listA.iterator();
                do {
                    if (!it.hasNext()) {
                        next = (T) null;
                        break;
                    }
                    next = it.next();
                } while (!k.g(((hs1.d) next).b(), LocalDate.now()));
                hs1.d dVar2 = next;
                yz1.d dVar3 = jVar.f97542a;
                m mVar = (m) jVar.f97544c;
                Integer latestValue = (dVar2 == null || (bodyBattery3 = dVar2.getBodyBattery()) == null) ? null : bodyBattery3.getLatestValue();
                Integer numValueOf = mVar != null ? Integer.valueOf(mVar.f83391b) : null;
                Integer num = (numValueOf == null || numValueOf.intValue() < 0 || numValueOf.intValue() > 100) ? latestValue : numValueOf;
                Integer chargedValue = (dVar2 == null || (bodyBattery2 = dVar2.getBodyBattery()) == null) ? null : bodyBattery2.getChargedValue();
                Integer drainedValue = (dVar2 == null || (bodyBattery = dVar2.getBodyBattery()) == null) ? null : bodyBattery.getDrainedValue();
                if (!listA.isEmpty()) {
                    Iterator<T> it3 = listA.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            z14 = false;
                            break;
                        }
                        hs1.a bodyBattery4 = ((hs1.d) it3.next()).getBodyBattery();
                        if ((bodyBattery4 != null ? bodyBattery4.getLatestValue() : null) != null) {
                            z14 = true;
                            break;
                        }
                    }
                } else {
                    z14 = false;
                    break;
                }
                gx.a aVar2 = new gx.a(dVar3, num, chargedValue, drainedValue, z14);
                c1603a.f80039b = 1;
                if (this.f80036a.emit(aVar2, c1603a) == aVar) {
                    return aVar;
                }
            } else {
                if (i15 != 1) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj2);
            }
            return Unit.INSTANCE;
        }
    }

    public e(i iVar, f fVar) {
        this.f80034a = iVar;
        this.f80035b = fVar;
    }

    @Override // r53.i
    public final Object collect(j<? super gx.a> jVar, t13.d dVar) {
        Object objCollect = this.f80034a.collect(new a(jVar, this.f80035b), dVar);
        return objCollect == u13.a.COROUTINE_SUSPENDED ? objCollect : Unit.INSTANCE;
    }
}

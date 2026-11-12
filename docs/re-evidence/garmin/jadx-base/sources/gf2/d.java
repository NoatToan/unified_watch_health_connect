package gf2;

import android.graphics.Bitmap;
import o13.p;
import o13.r;
import o4.f;
import o4.v0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.i;
import r53.j;
import vb.h;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lr53/i;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d implements i<p<? extends ff2.a, ? extends v0>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f77089a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f77090b;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a<T> implements j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j f77091a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ e f77092b;

        /* JADX INFO: renamed from: gf2.d$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        @v13.e(c = "com.garmin.android.library.promotionlibrary.domain.dashboard.GetActiveCampaignUseCase$invoke$$inlined$map$1$2", f = "GetActiveCampaignUseCase.kt", l = {50}, m = "emit", v = 2)
        public static final class C1556a extends v13.c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public /* synthetic */ Object f77093a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f77094b;

            public C1556a(t13.d dVar) {
                super(dVar);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                this.f77093a = obj;
                this.f77094b |= Integer.MIN_VALUE;
                return a.this.emit(null, this);
            }
        }

        public a(j jVar, e eVar) {
            this.f77091a = jVar;
            this.f77092b = eVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // r53.j
        public final Object emit(Object obj, t13.d dVar) throws Throwable {
            C1556a c1556a;
            if (dVar instanceof C1556a) {
                c1556a = (C1556a) dVar;
                int i14 = c1556a.f77094b;
                if ((i14 & Integer.MIN_VALUE) != 0) {
                    c1556a.f77094b = i14 - Integer.MIN_VALUE;
                } else {
                    c1556a = new C1556a(dVar);
                }
            } else {
                c1556a = new C1556a(dVar);
            }
            Object obj2 = c1556a.f77093a;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i15 = c1556a.f77094b;
            if (i15 == 0) {
                r.b(obj2);
                ff2.a aVar2 = (ff2.a) obj;
                f fVar = null;
                if (aVar2 != null) {
                    Bitmap bitmapB = this.f77092b.f77096a.b(aVar2.getCampaignId(), kf2.c.OFFER_TYPE);
                    if (bitmapB != null) {
                        fVar = new f(bitmapB);
                    }
                }
                p pVar = new p(aVar2, fVar);
                c1556a.f77094b = 1;
                if (this.f77091a.emit(pVar, c1556a) == aVar) {
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

    public d(i iVar, e eVar) {
        this.f77089a = iVar;
        this.f77090b = eVar;
    }

    @Override // r53.i
    public final Object collect(j<? super p<? extends ff2.a, ? extends v0>> jVar, t13.d dVar) {
        Object objCollect = this.f77089a.collect(new a(jVar, this.f77090b), dVar);
        return objCollect == u13.a.COROUTINE_SUSPENDED ? objCollect : Unit.INSTANCE;
    }
}

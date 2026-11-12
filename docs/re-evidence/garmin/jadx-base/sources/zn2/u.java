package zn2;

import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.feature.garminpay.providers.gpay.NewFitPayDeviceServiceProvider$checkForUnprocessedCommits$1", f = "NewFitPayDeviceServiceProvider.kt", l = {390, PsExtractor.PRIVATE_STREAM_1}, m = "invokeSuspend", v = 2)
public final class u extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f205859a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public z53.b f205860b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public t f205861c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f205862d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ t f205863e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(t tVar, t13.d<? super u> dVar) {
        super(2, dVar);
        this.f205863e = tVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new u(this.f205863e, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((u) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:31:0x00b7  */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c5, code lost:
    
        if (r14 == r1) goto L33;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        long jG;
        z53.b bVar;
        t tVar;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f205862d;
        t tVar2 = this.f205863e;
        try {
            if (i14 != 0) {
                if (i14 == 1) {
                    jG = this.f205859a;
                    tVar = this.f205861c;
                    bVar = this.f205860b;
                    o13.r.b(obj);
                } else {
                    if (i14 != 2) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o13.r.b(obj);
                }
                if (((Boolean) obj).booleanValue()) {
                    tVar2.p(vo2.z.IS_DIRTY);
                }
                return Unit.INSTANCE;
            }
            o13.r.b(obj);
            t.f205814n.debug("checkForUnprocessedCommits");
            zf.b.r();
            jG = gh2.i.f77458c.a().f77477b.g("check_unprocessed_commits_delay_milliseconds");
            if (jG > 0) {
                z53.b bVar2 = tVar2.f205826l;
                this.f205860b = bVar2;
                this.f205861c = tVar2;
                this.f205859a = jG;
                this.f205862d = 1;
                if (bVar2.c(this) != aVar) {
                    bVar = bVar2;
                    tVar = tVar2;
                }
            } else {
                if (!((hn2.a) KoinJavaComponent.get$default(hn2.a.class, null, null, 6, null)).a(tVar2.f205816b.getF99647a())) {
                    wr.g.v("checkForUnprocessedCommits: device ", tVar2.f205816b.getF99647a(), " is not BLE connected, skipping isDirty check", t.f205814n);
                    return Unit.INSTANCE;
                }
                l lVar = tVar2.f205819e;
                this.f205860b = null;
                this.f205861c = null;
                this.f205859a = jG;
                this.f205862d = 2;
                obj = lVar.e(this);
            }
            return aVar;
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - tVar.f205825k < jG) {
                t.f205814n.debug("checkForUnprocessedCommits: Skipping check as last check was done within the last " + jG + " ms");
                Unit unit = Unit.INSTANCE;
                bVar.e(null);
                return unit;
            }
            tVar.f205825k = jCurrentTimeMillis;
            Unit unit2 = Unit.INSTANCE;
            bVar.e(null);
            if (!((hn2.a) KoinJavaComponent.get$default(hn2.a.class, null, null, 6, null)).a(tVar2.f205816b.getF99647a())) {
                wr.g.v("checkForUnprocessedCommits: device ", tVar2.f205816b.getF99647a(), " is not BLE connected, skipping isDirty check", t.f205814n);
                return Unit.INSTANCE;
            }
            l lVar2 = tVar2.f205819e;
            this.f205860b = null;
            this.f205861c = null;
            this.f205859a = jG;
            this.f205862d = 2;
            obj = lVar2.e(this);
        } catch (Throwable th3) {
            bVar.e(null);
            throw th3;
        }
    }
}

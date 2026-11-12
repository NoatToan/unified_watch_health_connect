package yt;

import android.content.Context;
import androidx.lifecycle.v1;
import com.garmin.android.apps.connectmobile.map.GCMMapView;
import o53.s0;
import o53.t1;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.annual_report.player.AnnualReportPlayerViewModel$handleChapterImageTask$1$1", f = "AnnualReportPlayerViewModel.kt", l = {171, 173}, m = "invokeSuspend", v = 2)
public final class o extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f199357a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ot.l f199358b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f199359c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ GCMMapView f199360d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n f199361e;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.annual_report.player.AnnualReportPlayerViewModel$handleChapterImageTask$1$1$1", f = "AnnualReportPlayerViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ot.l f199362a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Context f199363b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ GCMMapView f199364c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ n f199365d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ot.l lVar, Context context, GCMMapView gCMMapView, n nVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f199362a = lVar;
            this.f199363b = context;
            this.f199364c = gCMMapView;
            this.f199365d = nVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f199362a, this.f199363b, this.f199364c, this.f199365d, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            ot.f fVar = (ot.f) this.f199362a;
            w9.a aVarA = v1.a(this.f199365d);
            fVar.getClass();
            Context context = this.f199363b;
            context.getClass();
            GCMMapView gCMMapView = this.f199364c;
            gCMMapView.getClass();
            gCMMapView.setLiteMode(true);
            gCMMapView.setupMap(new ot.h(fVar, context, gCMMapView, aVarA));
            gCMMapView.onCreate(null);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(ot.l lVar, Context context, GCMMapView gCMMapView, n nVar, t13.d<? super o> dVar) {
        super(2, dVar);
        this.f199358b = lVar;
        this.f199359c = context;
        this.f199360d = gCMMapView;
        this.f199361e = nVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new o(this.f199358b, this.f199359c, this.f199360d, this.f199361e, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((o) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0035  */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004b, code lost:
    
        if (ge1.b.e0(r10, r2, r9) == r0) goto L19;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f199357a;
        ot.l lVar = this.f199358b;
        if (i14 == 0) {
            o13.r.b(obj);
            if (lVar.n()) {
                this.f199357a = 1;
                if (lVar.m(this.f199359c, this) != aVar) {
                    if (lVar instanceof ot.f) {
                        x53.c cVar = s0.f129406a;
                        t1 t1Var = u53.o.f168762a;
                        a aVar2 = new a(lVar, this.f199359c, this.f199360d, this.f199361e, null);
                        this.f199357a = 2;
                    }
                }
                return aVar;
            }
            return Unit.INSTANCE;
        }
        if (i14 == 1) {
            o13.r.b(obj);
            if (lVar instanceof ot.f) {
                x53.c cVar2 = s0.f129406a;
                t1 t1Var2 = u53.o.f168762a;
                a aVar3 = new a(lVar, this.f199359c, this.f199360d, this.f199361e, null);
                this.f199357a = 2;
            }
        } else {
            if (i14 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        return Unit.INSTANCE;
    }
}

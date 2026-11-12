package zs1;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import e2.i0;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.p1;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.trails.presentation.composables.bottomsheet.TrailsListKt$TrailsList$2$1", f = "TrailsList.kt", l = {TsExtractor.TS_STREAM_TYPE_DTS}, m = "invokeSuspend", v = 2)
public final class m extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f206871a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p1<us1.k> f206872b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ us1.k f206873c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i0 f206874d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(p1<us1.k> p1Var, us1.k kVar, i0 i0Var, t13.d<? super m> dVar) {
        super(2, dVar);
        this.f206872b = p1Var;
        this.f206873c = kVar;
        this.f206874d = i0Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new m(this.f206872b, this.f206873c, this.f206874d, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((m) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f206871a;
        if (i14 == 0) {
            o13.r.b(obj);
            p1<us1.k> p1Var = this.f206872b;
            us1.k f182175a = p1Var.getF182175a();
            us1.k kVar = this.f206873c;
            if (f182175a != kVar) {
                p1Var.setValue(kVar);
                this.f206871a = 1;
                i0.a aVar2 = i0.f62432x;
                if (this.f206874d.l(0, 0, this) == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        return Unit.INSTANCE;
    }
}

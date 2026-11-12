package cg1;

import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.segments.data.model.SegmentsSummaryListDTO;
import com.garmin.android.apps.connectmobile.v2;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/garmin/android/apps/connectmobile/v2;", "Lcom/garmin/android/apps/connectmobile/segments/data/model/SegmentsSummaryListDTO;", "<anonymous>", "()Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.segments.presentation.SegmentViewModel$getUserSegments$1", f = "SegmentViewModel.kt", l = {34}, m = "invokeSuspend", v = 2)
public final class z extends v13.i implements e23.l<t13.d<? super v2<? extends SegmentsSummaryListDTO>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f27221a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c0 f27222b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f27223c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f27224d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(c0 c0Var, int i14, int i15, t13.d<? super z> dVar) {
        super(1, dVar);
        this.f27222b = c0Var;
        this.f27223c = i14;
        this.f27224d = i15;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new z(this.f27222b, this.f27223c, this.f27224d, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super v2<? extends SegmentsSummaryListDTO>> dVar) {
        return ((z) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f27221a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        yf1.b bVar = this.f27222b.f27136b;
        this.f27221a = 1;
        bVar.getClass();
        Object objJ = f0.J(bVar, new yf1.g(bVar, this.f27223c, this.f27224d, null), this);
        return objJ == aVar ? aVar : objJ;
    }
}

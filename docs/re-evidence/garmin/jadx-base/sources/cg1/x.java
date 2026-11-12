package cg1;

import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.segments.model.SegmentDetailsDTO;
import com.garmin.android.apps.connectmobile.v2;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/garmin/android/apps/connectmobile/v2;", "Lcom/garmin/android/apps/connectmobile/segments/model/SegmentDetailsDTO;", "<anonymous>", "()Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.segments.presentation.SegmentViewModel$getSegmentDetailsWithElevationAsync$1", f = "SegmentViewModel.kt", l = {81}, m = "invokeSuspend", v = 2)
public final class x extends v13.i implements e23.l<t13.d<? super v2<? extends SegmentDetailsDTO>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f27211a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c0 f27212b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f27213c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Boolean f27214d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(c0 c0Var, String str, Boolean bool, t13.d<? super x> dVar) {
        super(1, dVar);
        this.f27212b = c0Var;
        this.f27213c = str;
        this.f27214d = bool;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new x(this.f27212b, this.f27213c, this.f27214d, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super v2<? extends SegmentDetailsDTO>> dVar) {
        return ((x) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f27211a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        yf1.b bVar = this.f27212b.f27136b;
        this.f27211a = 1;
        bVar.getClass();
        Object objJ = f0.J(bVar, new yf1.d(bVar, this.f27213c, this.f27214d, null), this);
        return objJ == aVar ? aVar : objJ;
    }
}

package ol1;

import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.v2;
import d60.l0;
import e23.l;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/garmin/android/apps/connectmobile/v2;", "", "<anonymous>", "()Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.shareableevents.ShareableEventViewModel$sendPaceProPlanToDevice$1", f = "ShareableEventViewModel.kt", l = {245}, m = "invokeSuspend", v = 2)
public final class i extends v13.i implements l<t13.d<? super v2<? extends Object>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f132866a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.shareableevents.a f132867b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f132868c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(com.garmin.android.apps.connectmobile.shareableevents.a aVar, long j8, t13.d<? super i> dVar) {
        super(1, dVar);
        this.f132867b = aVar;
        this.f132868c = j8;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new i(this.f132867b, this.f132868c, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super v2<? extends Object>> dVar) {
        return ((i) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f132866a;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        com.garmin.android.apps.connectmobile.shareableevents.a aVar2 = this.f132867b;
        d60.b bVar = aVar2.f44227d;
        if (bVar == null) {
            s.m("courseRepository");
            throw null;
        }
        long j8 = aVar2.f44232i;
        this.f132866a = 1;
        Object objJ = f0.J(bVar, new l0(bVar, j8, this.f132868c, null), this);
        return objJ == aVar ? aVar : objJ;
    }
}

package qr;

import android.os.Parcelable;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.activity.details.presentation.ActivityDetailsViewModel$getLinkedEventDetails$1", f = "ActivityDetailsViewModel.kt", l = {5708, 5710}, m = "invokeSuspend", v = 2)
public final class a3 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f146092a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f146093b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Long f146094c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t f146095d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f146096e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a3(Long l14, t tVar, String str, t13.d<? super a3> dVar) {
        super(2, dVar);
        this.f146094c = l14;
        this.f146095d = tVar;
        this.f146096e = str;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        a3 a3Var = new a3(this.f146094c, this.f146095d, this.f146096e, dVar);
        a3Var.f146093b = obj;
        return a3Var;
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((a3) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0036, code lost:
    
        if (r8 == r1) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004b, code lost:
    
        if (r8 == r1) goto L20;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        o53.b0 b0Var = (o53.b0) this.f146093b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f146092a;
        com.garmin.android.apps.connectmobile.v2 v2Var = null;
        t tVar = this.f146095d;
        if (i14 == 0) {
            o13.r.b(obj);
            Long l14 = this.f146094c;
            if (l14 != null) {
                zf0.d dVar = tVar.f146531k;
                long jLongValue = l14.longValue();
                this.f146093b = b0Var;
                this.f146092a = 1;
                obj = dVar.d(jLongValue, this);
            } else {
                String str = this.f146096e;
                if (str != null) {
                    zf0.d dVar2 = tVar.f146531k;
                    this.f146093b = b0Var;
                    this.f146092a = 2;
                    obj = dVar2.f(str, this);
                }
            }
            return aVar;
        }
        if (i14 == 1) {
            o13.r.b(obj);
            v2Var = (com.garmin.android.apps.connectmobile.v2) obj;
        } else {
            if (i14 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            v2Var = (com.garmin.android.apps.connectmobile.v2) obj;
        }
        if (v2Var instanceof com.garmin.android.apps.connectmobile.v2.b) {
            fg0.k kVar = (fg0.k) ((com.garmin.android.apps.connectmobile.v2.b) v2Var).f47386a;
            Parcelable.Creator<fg0.k> creator = fg0.k.CREATOR;
            tVar.T1 = kVar.r(false);
        } else if (v2Var instanceof com.garmin.android.apps.connectmobile.v2.a) {
            com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.ACTIVITIES;
            String strD = com.airbnb.lottie.animation.keyframe.a.d(((com.garmin.android.apps.connectmobile.v2.a) v2Var).f47383a, "Error retrieving event details: ");
            com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
            com.garmin.android.apps.connectmobile.i2.a.f(a2Var, "ActivityDetailsViewModel", strD);
        }
        return Unit.INSTANCE;
    }
}

package ws0;

import c83.a0;
import com.garmin.android.apps.connectmobile.userprofile.model.BiometricProfileDTO;
import e23.l;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Lcom/garmin/android/apps/connectmobile/userprofile/model/BiometricProfileDTO;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.lactate_threshold.reports.data.repo.LactateThresholdRepoImpl$getBiometricProfile$2", f = "LactateThresholdRepoImpl.kt", l = {12}, m = "invokeSuspend", v = 2)
public final class b extends v13.i implements l<t13.d<? super a0<BiometricProfileDTO>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f186899a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f186900b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f186901c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(j jVar, String str, t13.d<? super b> dVar) {
        super(1, dVar);
        this.f186900b = jVar;
        this.f186901c = str;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new b(this.f186900b, this.f186901c, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super a0<BiometricProfileDTO>> dVar) {
        return ((b) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f186899a;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        us0.a aVar2 = this.f186900b.f186946a;
        this.f186899a = 1;
        Object objC = aVar2.c(this.f186901c, this);
        return objC == aVar ? aVar : objC;
    }
}

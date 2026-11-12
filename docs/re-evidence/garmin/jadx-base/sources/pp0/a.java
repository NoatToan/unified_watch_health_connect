package pp0;

import com.garmin.android.apps.connectmobile.v2;
import e23.l;
import kp0.j;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import t13.d;
import v13.e;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/garmin/android/apps/connectmobile/v2;", "Lop0/c;", "<anonymous>", "()Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
@e(c = "com.garmin.android.apps.connectmobile.hydration.presentation.HydrationSettingsViewModel$getHydrationSettings$1", f = "HydrationSettingsViewModel.kt", l = {10}, m = "invokeSuspend", v = 2)
public final class a extends i implements l<d<? super v2<? extends op0.c>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f139529a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f139530b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c cVar, d<? super a> dVar) {
        super(1, dVar);
        this.f139530b = cVar;
    }

    @Override // v13.a
    public final d<Unit> create(d<?> dVar) {
        return new a(this.f139530b, dVar);
    }

    @Override // e23.l
    public final Object invoke(d<? super v2<? extends op0.c>> dVar) {
        return ((a) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f139529a;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
                return obj;
            }
            h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        j jVar = this.f139530b.f139534a;
        this.f139529a = 1;
        Object objB = jVar.b(this);
        return objB == aVar ? aVar : objB;
    }
}

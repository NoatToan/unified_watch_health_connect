package kd0;

import android.text.TextUtils;
import java.util.ArrayList;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lwd2/f;", "Lcom/garmin/android/library/livetrack/d;", "it", "", "<anonymous>", "(Lwd2/f;)Z"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.di.concrete.DashboardDelegateImpl$observeLiveTrackCardVisible$1", f = "DashboardDelegateImpl.kt", l = {}, m = "invokeSuspend", v = 2)
public final class a1 extends v13.i implements e23.p<wd2.f<? extends com.garmin.android.library.livetrack.d>, t13.d<? super Boolean>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x0 f103966a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(x0 x0Var, t13.d<? super a1> dVar) {
        super(2, dVar);
        this.f103966a = x0Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new a1(this.f103966a, dVar);
    }

    @Override // e23.p
    public final Object invoke(wd2.f<? extends com.garmin.android.library.livetrack.d> fVar, t13.d<? super Boolean> dVar) {
        return ((a1) create(fVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        zb0.u0 u0Var;
        int i14;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        ArrayList<ou0.c> arrayListH = this.f103966a.f104418b.j().h();
        boolean z14 = false;
        if (arrayListH != null && !arrayListH.isEmpty()) {
            for (ou0.c cVar : arrayListH) {
                if (wd2.m.e(cVar.f133964a)) {
                    String str = cVar.f133965b;
                    if (!TextUtils.isEmpty(str) && (u0Var = (zb0.u0) zb0.u0.f203782n6.get(str)) != null && ((i14 = nu0.c.a.f127895a[u0Var.ordinal()]) == 1 || i14 == 2)) {
                        z14 = true;
                        break;
                    }
                }
            }
        }
        return Boolean.valueOf(z14);
    }
}

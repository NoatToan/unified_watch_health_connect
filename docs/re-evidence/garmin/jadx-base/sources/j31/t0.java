package j31;

import android.content.Context;
import com.garmin.android.apps.connectmobile.settings.lte.LTESubscriptionManagerActivity;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lj31/t0;", "Lj31/z0;", "Lui1/o0;", "lteRepository", "<init>", "(Lui1/o0;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class t0 implements z0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ui1.o0 f96927b;

    public t0(ui1.o0 o0Var) {
        o0Var.getClass();
        this.f96927b = o0Var;
    }

    @Override // j31.z0
    public final Object c(long j8, v13.c cVar) {
        Object objF = this.f96927b.f(new Long(j8), cVar);
        return objF == u13.a.COROUTINE_SUSPENDED ? objF : Unit.INSTANCE;
    }

    @Override // j31.z0
    public final void d(Context context, long j8, String str, String str2) {
        ds.e0.p(context, str, str2);
        context.startActivity(LTESubscriptionManagerActivity.a.a(LTESubscriptionManagerActivity.f43457e, context, j8, false, 12));
    }
}

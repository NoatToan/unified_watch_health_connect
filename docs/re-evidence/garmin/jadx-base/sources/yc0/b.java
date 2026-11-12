package yc0;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.garmin.android.apps.connectmobile.dashboard.presentation.DashboardActivity;
import com.garmin.android.apps.connectmobile.devices.settings.realtime.RTSSettingsLauncherActivity;
import e23.p;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import rd2.j;
import v13.i;
import z6.h0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Landroid/app/PendingIntent;", "<anonymous>", "(Lo53/b0;)Landroid/app/PendingIntent;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.devices.settings.realtime.util.RTSDeepLinkingNavigationUtil$createRTSLauncherPendingIntent$2", f = "RTSDeepLinkingNavigationUtil.kt", l = {}, m = "invokeSuspend", v = 2)
public final class b extends i implements p<b0, t13.d<? super PendingIntent>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f196715a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f196716b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f196717c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f196718d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(long j8, Context context, int i14, boolean z14, t13.d<? super b> dVar) {
        super(2, dVar);
        this.f196715a = j8;
        this.f196716b = context;
        this.f196717c = i14;
        this.f196718d = z14;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new b(this.f196715a, this.f196716b, this.f196717c, this.f196718d, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super PendingIntent> dVar) {
        return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        r.b(obj);
        rd2.f.a().f152045a.getClass();
        sd2.f fVarI = j.i(this.f196715a, null);
        if (fVarI == null) {
            return null;
        }
        boolean z14 = this.f196718d;
        RTSSettingsLauncherActivity.a aVar2 = RTSSettingsLauncherActivity.f34352a;
        Context context = this.f196716b;
        Intent intentB = RTSSettingsLauncherActivity.a.b(aVar2, context, fVarI, this.f196717c, z14);
        h0 h0VarE = h0.e(context);
        h0VarE.d(DashboardActivity.class);
        h0VarE.b(intentB);
        PendingIntent pendingIntentF = h0VarE.f();
        pendingIntentF.getClass();
        return pendingIntentF;
    }
}

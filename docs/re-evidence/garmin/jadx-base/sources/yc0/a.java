package yc0;

import android.content.Context;
import android.content.Intent;
import com.garmin.android.apps.connectmobile.devices.settings.realtime.RTSSettingsLauncherActivity;
import e23.p;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import rd2.j;
import v13.i;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Landroid/content/Intent;", "<anonymous>", "(Lo53/b0;)Landroid/content/Intent;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.devices.settings.realtime.util.RTSDeepLinkingNavigationUtil$createRTSLauncherIntent$2", f = "RTSDeepLinkingNavigationUtil.kt", l = {}, m = "invokeSuspend", v = 2)
public final class a extends i implements p<b0, t13.d<? super Intent>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f196709a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f196710b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f196711c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f196712d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f196713e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f196714f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(long j8, Context context, int i14, boolean z14, String str, String str2, t13.d<? super a> dVar) {
        super(2, dVar);
        this.f196709a = j8;
        this.f196710b = context;
        this.f196711c = i14;
        this.f196712d = z14;
        this.f196713e = str;
        this.f196714f = str2;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new a(this.f196709a, this.f196710b, this.f196711c, this.f196712d, this.f196713e, this.f196714f, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Intent> dVar) {
        return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        r.b(obj);
        rd2.f.a().f152045a.getClass();
        sd2.f fVarI = j.i(this.f196709a, null);
        if (fVarI == null) {
            return null;
        }
        RTSSettingsLauncherActivity.f34352a.getClass();
        Intent intentA = RTSSettingsLauncherActivity.a.a(this.f196710b, fVarI, this.f196711c, this.f196712d, this.f196713e, this.f196714f);
        intentA.addFlags(268435456);
        return intentA;
    }
}

package uf2;

import com.garmin.proto.generated.GDILiveSessionProto;
import p005kotlin.Metadata;
import r53.e2;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.livesessionview.communication.protobuf.LiveActivityInteractorDeviceToApp", f = "LiveActivityInteractorDeviceToApp.kt", l = {93, 105}, m = "emitConfirmFinalizeSetRequest$live_session_view", v = 2)
public final class n0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public GDILiveSessionProto.SetConfigurationRequest f170438a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public e2 f170439b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f170440c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l0 f170441d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f170442e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(l0 l0Var, t13.d<? super n0> dVar) {
        super(dVar);
        this.f170441d = l0Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f170440c = obj;
        this.f170442e |= Integer.MIN_VALUE;
        return this.f170441d.b(null, null, this);
    }
}

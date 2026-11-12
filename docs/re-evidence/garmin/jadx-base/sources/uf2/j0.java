package uf2;

import com.garmin.proto.generated.GDISmartProto;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.livesessionview.communication.protobuf.LiveActivityInteractorAppToDevice", f = "LiveActivityInteractorAppToDevice.kt", l = {317}, m = "startPreviewMetricsRequest$live_session_view", v = 2)
public final class j0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public dt2.g f170412a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public GDISmartProto.Smart f170413b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f170414c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u f170415d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f170416e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(u uVar, t13.d<? super j0> dVar) {
        super(dVar);
        this.f170415d = uVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f170414c = obj;
        this.f170416e |= Integer.MIN_VALUE;
        return this.f170415d.i(null, null, this);
    }
}

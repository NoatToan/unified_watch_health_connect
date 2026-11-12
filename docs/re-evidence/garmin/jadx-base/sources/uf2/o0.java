package uf2;

import com.garmin.proto.generated.GDILiveSessionProto;
import java.util.Collection;
import java.util.Iterator;
import p005kotlin.Metadata;
import r53.y1;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.livesessionview.communication.protobuf.LiveActivityInteractorDeviceToApp", f = "LiveActivityInteractorDeviceToApp.kt", l = {40, 55}, m = "emitFinalizeSetRequest$live_session_view", v = 2)
public final class o0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public GDILiveSessionProto.FinalizeSetRequest f170446a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public y1 f170447b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Collection f170448c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Iterator f170449d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f170450e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f170451f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f170452g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f170453h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ l0 f170454i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f170455j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(l0 l0Var, t13.d<? super o0> dVar) {
        super(dVar);
        this.f170454i = l0Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f170453h = obj;
        this.f170455j |= Integer.MIN_VALUE;
        return this.f170454i.c(null, null, this);
    }
}

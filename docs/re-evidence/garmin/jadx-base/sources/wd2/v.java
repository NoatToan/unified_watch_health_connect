package wd2;

import android.content.Context;
import com.garmin.proto.generated.GDILiveTrackMessagingProto;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.library.livetrack.LivetrackManager$handleGrouptrackGetMessagesRequest$1", f = "LivetrackManager.kt", l = {254}, m = "invokeSuspend", v = 2)
public final class v extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f184633a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f184634b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f184635c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f184636d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f184637e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(long j8, Context context, int i14, String str, t13.d<? super v> dVar) {
        super(2, dVar);
        this.f184634b = j8;
        this.f184635c = context;
        this.f184636d = i14;
        this.f184637e = str;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new v(this.f184634b, this.f184635c, this.f184636d, this.f184637e, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((v) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f184633a;
        if (i14 == 0) {
            o13.r.b(obj);
            Logger logger = q.f184565h;
            if (logger != null) {
                wr.g.v("handleGrouptrackGetMessagesRequest for device ", this.f184634b, " - error, livetrack not in progress", logger);
            }
            fe2.j1.a aVar2 = fe2.j1.f70814e;
            GDILiveTrackMessagingProto.GetLiveTrackMessagesResponse.GetLiveTrackMessagesStatus getLiveTrackMessagesStatus = GDILiveTrackMessagingProto.GetLiveTrackMessagesResponse.GetLiveTrackMessagesStatus.NOT_LIVE_TRACKING;
            this.f184633a = 1;
            aVar2.getClass();
            if (fe2.j1.a.e(this.f184635c, this.f184636d, this.f184637e, getLiveTrackMessagesStatus, this) == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        return Unit.INSTANCE;
    }
}

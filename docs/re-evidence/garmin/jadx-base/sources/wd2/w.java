package wd2;

import android.content.Context;
import com.garmin.proto.generated.GDILiveTrackMessagingProto;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.library.livetrack.LivetrackManager$handleGrouptrackSendMessagesRequest$1", f = "LivetrackManager.kt", l = {273}, m = "invokeSuspend", v = 2)
public final class w extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f184646a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f184647b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j f184648c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Context f184649d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f184650e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f184651f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(long j8, j jVar, Context context, int i14, String str, t13.d<? super w> dVar) {
        super(2, dVar);
        this.f184647b = j8;
        this.f184648c = jVar;
        this.f184649d = context;
        this.f184650e = i14;
        this.f184651f = str;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new w(this.f184647b, this.f184648c, this.f184649d, this.f184650e, this.f184651f, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((w) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f184646a;
        if (i14 == 0) {
            o13.r.b(obj);
            Logger logger = q.f184565h;
            if (logger != null) {
                logger.debug("handleGrouptrackSendMessagesRequest for device " + this.f184647b + " with message " + this.f184648c + " - error, livetrack not in progress");
            }
            fe2.j1.a aVar2 = fe2.j1.f70814e;
            GDILiveTrackMessagingProto.SendLiveTrackMessageResponse.SendLiveTrackMessageStatus sendLiveTrackMessageStatus = GDILiveTrackMessagingProto.SendLiveTrackMessageResponse.SendLiveTrackMessageStatus.NOT_LIVE_TRACKING;
            this.f184646a = 1;
            aVar2.getClass();
            if (fe2.j1.a.f(this.f184649d, this.f184650e, this.f184651f, sendLiveTrackMessageStatus, this) == aVar) {
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

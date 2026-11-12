package do1;

import android.content.Intent;
import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.social.VideoPlayerActivity;
import com.garmin.android.apps.connectmobile.v2;
import ei0.q0;
import lc.u0;
import o53.b0;
import o53.s0;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.social.VideoPlayerActivity$deleteActivityVideo$1", f = "VideoPlayerActivity.kt", l = {125}, m = "invokeSuspend", v = 2)
public final class u extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f60624a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f60625b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ VideoPlayerActivity f60626c;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.social.VideoPlayerActivity$deleteActivityVideo$1$1", f = "VideoPlayerActivity.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ VideoPlayerActivity f60627a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(VideoPlayerActivity videoPlayerActivity, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f60627a = videoPlayerActivity;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f60627a, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            VideoPlayerActivity videoPlayerActivity = this.f60627a;
            q0.b(videoPlayerActivity);
            videoPlayerActivity.hideProgressOverlay();
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(VideoPlayerActivity videoPlayerActivity, t13.d<? super u> dVar) {
        super(2, dVar);
        this.f60626c = videoPlayerActivity;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        u uVar = new u(this.f60626c, dVar);
        uVar.f60625b = obj;
        return uVar;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((u) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        b0 b0Var = (b0) this.f60625b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f60624a;
        VideoPlayerActivity videoPlayerActivity = this.f60626c;
        if (i14 == 0) {
            o13.r.b(obj);
            qo1.a.f145955b.getClass();
            qo1.a aVarA = qo1.a.C2749a.a();
            VideoPlayerActivity.a aVar2 = VideoPlayerActivity.f44499a;
            long jCa = videoPlayerActivity.ca();
            this.f60625b = b0Var;
            this.f60624a = 1;
            obj = f0.J(aVarA, new qo1.b(aVarA, jCa, null), this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        v2 v2Var = (v2) obj;
        if (v2Var instanceof v2.a) {
            x53.c cVar = s0.f129406a;
            ge1.b.T(b0Var, u53.o.f168762a, null, new a(videoPlayerActivity, null), 2);
        } else {
            if (!(v2Var instanceof v2.b)) {
                u0.r();
                return null;
            }
            videoPlayerActivity.hideProgressOverlay();
            Intent intent = new Intent();
            VideoPlayerActivity.a aVar3 = VideoPlayerActivity.f44499a;
            intent.putExtra("GCM_extra_activity_id", videoPlayerActivity.ca());
            videoPlayerActivity.setResult(-1, intent);
            ((iz0.a) KoinJavaComponent.get$default(iz0.a.class, null, null, 6, null)).o(videoPlayerActivity, videoPlayerActivity.ca(), false);
            videoPlayerActivity.finish();
        }
        return Unit.INSTANCE;
    }
}

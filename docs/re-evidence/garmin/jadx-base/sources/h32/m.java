package h32;

import android.app.Activity;
import android.content.Context;
import com.garmin.android.apps.connectmobile.view.UserLevelImageView;
import com.garmin.android.apps.connectmobile.view.view_3_0.PostCommentView;
import e23.p;
import o13.r;
import o53.b0;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.view.view_3_0.PostCommentView$updateProfileImage$1", f = "PostCommentView.kt", l = {}, m = "invokeSuspend", v = 2)
public final class m extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PostCommentView f81396a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(PostCommentView postCommentView, t13.d<? super m> dVar) {
        super(2, dVar);
        this.f81396a = postCommentView;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new m(this.f81396a, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((m) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        r.b(obj);
        PostCommentView postCommentView = this.f81396a;
        Context context = postCommentView.getContext();
        Activity activity = context instanceof Activity ? (Activity) context : null;
        if (activity != null && activity.isFinishing()) {
            return Unit.INSTANCE;
        }
        String strZ4 = postCommentView.getUserSettings().z4("PREMIUM_FRIEND");
        if (strZ4 == null) {
            strZ4 = ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).q4();
        }
        String str = strZ4;
        UserLevelImageView userLevelImageView = postCommentView.f47847b;
        if (userLevelImageView != null) {
            userLevelImageView.setProfileImageData(new b12.b(str, null, null, null, null, 30, null));
        }
        return Unit.INSTANCE;
    }
}

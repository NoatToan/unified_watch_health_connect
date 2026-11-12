package kd0;

import android.content.Context;
import android.content.Intent;
import com.garmin.android.apps.connectmobile.follow.domain.FollowRequestActivity;
import com.garmin.android.apps.connectmobile.follow.domain.FriendDiscoverActivity;
import com.garmin.android.apps.connectmobile.userprofile.presentation.EditProfileActivity;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkd0/j2;", "Lgi0/a;", "<init>", "()V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class j2 implements gi0.a {
    @Override // gi0.a
    public final void c(Context context) {
        context.getClass();
        ro1.g0.e(context);
    }

    @Override // gi0.a
    public final Intent d(Context context) {
        context.getClass();
        FriendDiscoverActivity.a aVar = FriendDiscoverActivity.f35251b;
        p003ji0.j jVar = p003ji0.j.SEARCH;
        Boolean bool = Boolean.TRUE;
        aVar.getClass();
        Intent intent = new Intent(context, (Class<?>) FriendDiscoverActivity.class);
        if (jVar != null) {
            intent.putExtra("extra_initial_tab", jVar.ordinal());
            intent.putExtra("extra_open_keyboard", bool);
        }
        return intent;
    }

    @Override // gi0.a
    public final void e() {
        ((q00.a) KoinJavaComponent.get$default(q00.a.class, null, null, 6, null)).a();
        ((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).I();
    }

    @Override // gi0.a
    public final Intent f(Context context) {
        return sn.a.d(context, context, FollowRequestActivity.class);
    }

    @Override // gi0.a
    public final Intent g(Context context) {
        context.getClass();
        EditProfileActivity.f46981h.getClass();
        Intent intent = new Intent(context, (Class<?>) EditProfileActivity.class);
        intent.putExtra("EXTRA_FOCUS", false);
        return intent;
    }
}

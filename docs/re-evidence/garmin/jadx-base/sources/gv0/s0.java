package gv0;

import android.app.Activity;
import com.garmin.android.apps.connectmobile.follow.domain.FriendListActivity;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Unit;
import p3.p1;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class s0 implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f79377a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Activity f79378b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p1 f79379c;

    public /* synthetic */ s0(Activity activity, p1 p1Var, int i14) {
        this.f79377a = i14;
        this.f79378b = activity;
        this.f79379c = p1Var;
    }

    @Override // e23.a
    public final Object invoke() {
        switch (this.f79377a) {
            case 0:
                this.f79379c.setValue(Boolean.FALSE);
                ((uu0.a) KoinJavaComponent.get$default(uu0.a.class, null, null, 6, null)).g().getClass();
                FriendListActivity.a aVar = FriendListActivity.f35257b;
                p003ji0.k kVar = p003ji0.k.SUGGESTED;
                aVar.getClass();
                Activity activity = this.f79378b;
                activity.startActivity(FriendListActivity.a.a(activity, kVar));
                break;
            default:
                if (this.f79378b != null) {
                    this.f79379c.setValue(Boolean.TRUE);
                }
                break;
        }
        return Unit.INSTANCE;
    }
}

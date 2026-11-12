package z10;

import android.app.Activity;
import android.content.Intent;
import com.garmin.android.apps.connectmobile.consent.ConsentActivity;
import com.garmin.android.apps.connectmobile.consent.DeviceUploadConsentActivity;
import com.garmin.android.apps.connectmobile.consent.PopularityRoutingConsentActivity;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class u1 implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f201264a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f.c f201265b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Activity f201266c;

    public /* synthetic */ u1(f.c cVar, Activity activity) {
        this.f201264a = 1;
        this.f201265b = cVar;
        this.f201266c = activity;
    }

    @Override // e23.a
    public final Object invoke() {
        switch (this.f201264a) {
            case 0:
                DeviceUploadConsentActivity.f32201b.getClass();
                Activity activity = this.f201266c;
                activity.getClass();
                f.c cVar = this.f201265b;
                cVar.getClass();
                if (d1.f()) {
                    d1.o(activity, new xk1.v(12));
                } else {
                    cVar.a(new Intent(activity, (Class<?>) DeviceUploadConsentActivity.class), null);
                }
                break;
            case 1:
                this.f201265b.a(ConsentActivity.a.b(ConsentActivity.f32155r, this.f201266c, q92.x.DI_CONNECT_LIVETRACK_STRAVA_BEACON, false, null, 24), null);
                break;
            case 2:
                PopularityRoutingConsentActivity.f32209d.getClass();
                Activity activity2 = this.f201266c;
                activity2.getClass();
                f.c cVar2 = this.f201265b;
                cVar2.getClass();
                cVar2.a(new Intent(activity2, (Class<?>) PopularityRoutingConsentActivity.class), null);
                break;
            default:
                this.f201265b.a(((ub1.i) KoinJavaComponent.get$default(ub1.i.class, null, null, 6, null)).b(this.f201266c), null);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ u1(Activity activity, f.c cVar, int i14) {
        this.f201264a = i14;
        this.f201266c = activity;
        this.f201265b = cVar;
    }
}

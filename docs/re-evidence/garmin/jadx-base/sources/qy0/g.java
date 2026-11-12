package qy0;

import com.garmin.android.apps.connectmobile.multidayactivities.presentation.edit.MultiDayActivitiesEditActivity;
import com.garmin.android.lib.legal.LegalGatewayActivity;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class g implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f148486a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MultiDayActivitiesEditActivity f148487b;

    public /* synthetic */ g(MultiDayActivitiesEditActivity multiDayActivitiesEditActivity, int i14) {
        this.f148486a = i14;
        this.f148487b = multiDayActivitiesEditActivity;
    }

    @Override // e23.a
    public final Object invoke() {
        int i14 = this.f148486a;
        MultiDayActivitiesEditActivity multiDayActivitiesEditActivity = this.f148487b;
        switch (i14) {
            case 0:
                MultiDayActivitiesEditActivity.a aVar = MultiDayActivitiesEditActivity.f39291b;
                LegalGatewayActivity.a.b(LegalGatewayActivity.f49928n, this.f148487b, 0, lc2.a.GARMIN_CONNECT_PRIVACY_POLICY, ((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).f(), false, null, false, null, PsExtractor.VIDEO_STREAM_MASK);
                break;
            case 1:
                MultiDayActivitiesEditActivity.a aVar2 = MultiDayActivitiesEditActivity.f39291b;
                multiDayActivitiesEditActivity.finish();
                break;
            default:
                MultiDayActivitiesEditActivity.a aVar3 = MultiDayActivitiesEditActivity.f39291b;
                multiDayActivitiesEditActivity.ca().M3();
                break;
        }
        return Unit.INSTANCE;
    }
}

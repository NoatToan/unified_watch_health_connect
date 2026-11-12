package jd0;

import com.garmin.android.apps.connectmobile.activities.model.ActivityListItemDTO;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class u implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f98371a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.l f98372b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ActivityListItemDTO f98373c;

    public /* synthetic */ u(e23.l lVar, ActivityListItemDTO activityListItemDTO, int i14) {
        this.f98371a = i14;
        this.f98372b = lVar;
        this.f98373c = activityListItemDTO;
    }

    @Override // e23.a
    public final Object invoke() {
        switch (this.f98371a) {
            case 0:
                this.f98372b.invoke(Long.valueOf(this.f98373c.f29250b));
                break;
            default:
                this.f98372b.invoke(this.f98373c);
                break;
        }
        return Unit.INSTANCE;
    }
}

package vd0;

import android.content.Context;
import com.garmin.android.apps.connectmobile.activities.model.ActivityListItemDTO;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class n implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f177329a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ oe0.g f177330b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f177331c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ActivityListItemDTO f177332d;

    public /* synthetic */ n(oe0.g gVar, Context context, ActivityListItemDTO activityListItemDTO, int i14) {
        this.f177329a = i14;
        this.f177330b = gVar;
        this.f177331c = context;
        this.f177332d = activityListItemDTO;
    }

    @Override // e23.a
    public final Object invoke() {
        switch (this.f177329a) {
            case 0:
                this.f177330b.a(this.f177331c, this.f177332d);
                break;
            default:
                this.f177330b.a(this.f177331c, this.f177332d);
                break;
        }
        return Unit.INSTANCE;
    }
}

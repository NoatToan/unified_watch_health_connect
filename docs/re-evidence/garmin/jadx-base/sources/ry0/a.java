package ry0;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.garmin.android.apps.connectmobile.multidayactivities.presentation.details.MultiDayActivitiesDetailActivity;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class a implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f155061a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f155062b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f155063c;

    public /* synthetic */ a(Context context, String str, int i14) {
        this.f155061a = i14;
        this.f155062b = context;
        this.f155063c = str;
    }

    @Override // e23.a
    public final Object invoke() {
        switch (this.f155061a) {
            case 0:
                MultiDayActivitiesDetailActivity.f39233a.getClass();
                MultiDayActivitiesDetailActivity.a.b(this.f155062b, this.f155063c);
                break;
            case 1:
                this.f155062b.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(this.f155063c)));
                break;
            case 2:
                lg.d.C(this.f155062b, this.f155063c);
                break;
            default:
                g22.a.d(this.f155062b, Uri.parse(this.f155063c));
                break;
        }
        return Unit.INSTANCE;
    }
}

package m2;

import android.content.Context;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import androidx.fragment.app.v;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.activities.manual.eventType.ActivitiesEventTypeActivity;
import com.garmin.android.apps.connectmobile.i1;
import e23.l;
import o2.h;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import qs.g;
import s5.w0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f115929a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f115930b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f115931c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Context f115932d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f115933e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ CharSequence f115934f;

    public /* synthetic */ b(Context context, ResolveInfo resolveInfo, boolean z14, CharSequence charSequence, long j8) {
        this.f115932d = context;
        this.f115933e = resolveInfo;
        this.f115931c = z14;
        this.f115934f = charSequence;
        this.f115930b = j8;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        int i14 = this.f115929a;
        boolean z14 = this.f115931c;
        long j8 = this.f115930b;
        Object obj2 = this.f115933e;
        switch (i14) {
            case 0:
                a.f115926a.getClass();
                i1 i1Var = a.f115928c;
                Boolean boolValueOf = Boolean.valueOf(z14);
                w0 w0VarA = w0.a(j8);
                i1Var.invoke(this.f115932d, (ResolveInfo) obj2, boolValueOf, this.f115934f, w0VarA);
                ((h) obj).close();
                break;
            default:
                ActivitiesEventTypeActivity activitiesEventTypeActivity = (ActivitiesEventTypeActivity) this.f115932d;
                g gVar = (g) obj2;
                String str = (String) this.f115934f;
                String str2 = (String) obj;
                ActivitiesEventTypeActivity.a aVar = ActivitiesEventTypeActivity.f29178b;
                if (s.g(str2, "ActivitiesEventTypeFragment")) {
                    com.garmin.android.apps.connectmobile.activities.manual.eventType.b.f29199g.getClass();
                    Bundle bundle = new Bundle();
                    bundle.putSerializable("GCM_extra_event_type", gVar);
                    bundle.putString("GCM_extra_start_date", str);
                    bundle.putLong("GCM_extra_activity_id", j8);
                    bundle.putBoolean("CAN_TRIATHLON_ACTIVITY_LINKED", z14);
                    com.garmin.android.apps.connectmobile.activities.manual.eventType.b bVar = new com.garmin.android.apps.connectmobile.activities.manual.eventType.b();
                    bVar.setArguments(bundle);
                    v supportFragmentManager = activitiesEventTypeActivity.getSupportFragmentManager();
                    supportFragmentManager.getClass();
                    androidx.fragment.app.a aVar2 = new androidx.fragment.app.a(supportFragmentManager);
                    aVar2.l(R.id.content_frame, bVar, str2);
                    aVar2.d(str2);
                    aVar2.e();
                } else if (s.g(str2, "ActivitiesEventListFragment")) {
                    activitiesEventTypeActivity.hideActionBar();
                    com.garmin.android.apps.connectmobile.activities.manual.eventType.a.f29185i.getClass();
                    Bundle bundle2 = new Bundle();
                    com.garmin.android.apps.connectmobile.activities.manual.eventType.a aVar3 = new com.garmin.android.apps.connectmobile.activities.manual.eventType.a();
                    aVar3.setArguments(bundle2);
                    v supportFragmentManager2 = activitiesEventTypeActivity.getSupportFragmentManager();
                    supportFragmentManager2.getClass();
                    androidx.fragment.app.a aVar4 = new androidx.fragment.app.a(supportFragmentManager2);
                    aVar4.l(R.id.content_frame, aVar3, str2);
                    aVar4.d(str2);
                    aVar4.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ b(ActivitiesEventTypeActivity activitiesEventTypeActivity, g gVar, String str, long j8, boolean z14) {
        this.f115932d = activitiesEventTypeActivity;
        this.f115933e = gVar;
        this.f115934f = str;
        this.f115930b = j8;
        this.f115931c = z14;
    }
}

package mh1;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.garmin.android.apps.connectmobile.GCMActivityStartup;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.settings.devices.index.ManagePeopleActivity;
import java.util.List;
import p005kotlin.Metadata;
import zb0.u0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lmh1/s;", "Lmh1/o$a;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class s implements o.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r f118499a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f118500b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n00.c f118501c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Bundle f118502d;

    public s(r rVar, Context context, n00.c cVar, Bundle bundle) {
        this.f118499a = rVar;
        this.f118500b = context;
        this.f118501c = cVar;
        this.f118502d = bundle;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x00a2  */
    @Override // mh1.o.a
    public final void a(Long l14, String str) {
        String strSubstring;
        int i14 = r.f118497b;
        r rVar = this.f118499a;
        rVar.f().debug("onPairedDeviceIDObtained : " + l14);
        n00.c cVar = n00.c.INVITATION_STATUS_ACCEPTED;
        n00.c cVar2 = this.f118501c;
        if (cVar != n00.c.a(cVar2.f122099a)) {
            if (n00.c.INVITATION_STATUS_DECLINED == n00.c.a(cVar2.f122099a)) {
                rVar.f().debug("declined invitation PushNotification: not handled ! add your code here ");
                return;
            }
            return;
        }
        rVar.f().debug("ACCEPTED! invitation PushNotification handling");
        sz0.e eVar = sz0.e.C;
        String str2 = eVar.f161386a;
        Context context = this.f118500b;
        z6.q qVar = new z6.q(context, str2);
        qVar.N.icon = 2131232010;
        qVar.f202683e = z6.q.e(context.getString(R.string.pn_smart_scale_invitation_outcome_title_accepted));
        Bundle bundle = this.f118502d;
        String string = context.getString(R.string.pn_shareable_device_accept_format, bundle.get("profile-fullname"), bundle.get("device-name"));
        string.getClass();
        qVar.f202684f = z6.q.e(string);
        qVar.B = "social";
        qVar.f202691m = 1;
        Intent intentP9 = GCMActivityStartup.P9(context, null);
        if (l14 != null && str != null) {
            String string2 = bundle.getString("device-partnumber");
            if (string2 != null) {
                List listW = d53.w.W(string2, new String[]{"-"});
                if (listW.size() > 1) {
                    strSubstring = ((String) listW.get(1)).substring(1);
                } else {
                    strSubstring = "";
                }
            } else {
                strSubstring = "";
            }
            if (u0.n(strSubstring, u0.P5, u0.H0, u0.S5)) {
                intentP9 = new Intent(context, (Class<?>) ManagePeopleActivity.class);
                intentP9.putExtra("GCM_deviceUnitID", l14.longValue());
                intentP9.putExtra("GCM_deviceDisplayName", str);
                rVar.f().debug("constructed launchIntent: type=[" + intentP9 + "]");
            } else {
                rVar.f().debug("shareable device invitation cannot be handled - going to startup, cannot redirect !");
            }
        }
        PendingIntent activity = PendingIntent.getActivity(context, 0, intentP9, 1140850688);
        activity.getClass();
        qVar.f202686h = activity;
        Notification notificationC = qVar.c();
        notificationC.flags = 16;
        rVar.f().debug("Should show user notification : " + notificationC);
        sz0.f.a aVar = sz0.f.f161394a;
        int iD = rVar.d(cVar2);
        aVar.getClass();
        sz0.f.a.f(context, notificationC, iD, eVar);
    }
}

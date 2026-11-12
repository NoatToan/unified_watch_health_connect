package com.garmin.android.apps.connectmobile.settings.devices.swim;

import android.os.Bundle;
import android.widget.TextView;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.settings.devices.activityoptions.ActivityOptionsActivity;
import com.garmin.android.apps.connectmobile.settings.devices.activityoptions.a;
import d53.u;
import g22.n;
import hb2.i;
import java.util.ArrayList;
import java.util.List;
import og1.e;
import og1.g;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import zb0.u0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/devices/swim/SwimActivityOptionsActivity;", "Lcom/garmin/android/apps/connectmobile/settings/devices/activityoptions/ActivityOptionsActivity;", "<init>", "()V", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public class SwimActivityOptionsActivity extends ActivityOptionsActivity {
    @Override // com.garmin.android.apps.connectmobile.settings.devices.activityoptions.ActivityOptionsActivity
    public final a ea(ArrayList arrayList, ActivityOptionsActivity.a aVar) {
        return new wh1.a(this, arrayList, aVar);
    }

    @Override // com.garmin.android.apps.connectmobile.settings.devices.activityoptions.ActivityOptionsActivity, og1.f
    public final void j9(String str) {
        if (this.f42535i) {
            return;
        }
        e eVar = this.f42534h;
        List<g> list = eVar != null ? eVar.f131999a : null;
        list.getClass();
        for (g gVar : list) {
            if (u.q(gVar.f132003d, str, false)) {
                String sport = gVar.getSport();
                String subSport = gVar.getSubSport();
                String str2 = gVar.f132003d;
                if (sport == null || subSport == null || !i.a(this)) {
                    return;
                }
                com.garmin.android.apps.connectmobile.settings.devices.e.a aVarValueOf = com.garmin.android.apps.connectmobile.settings.devices.e.a.valueOf(n.g(sport));
                com.garmin.android.apps.connectmobile.settings.devices.e.b bVarValueOf = com.garmin.android.apps.connectmobile.settings.devices.e.b.valueOf(n.g(subSport));
                og1.a aVar = this.f42538l;
                if (aVar != null) {
                    str2.getClass();
                    long j8 = this.f42528b;
                    u0 u0Var = this.f42537k;
                    u0Var.getClass();
                    aVar.a(aVarValueOf, bVarValueOf, str2, j8, u0Var);
                    return;
                }
                return;
            }
        }
    }

    @Override // com.garmin.android.apps.connectmobile.settings.devices.activityoptions.ActivityOptionsActivity, com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        TextView textView = this.f42531e;
        if (textView != null) {
            textView.setText(getString(R.string.msg_swim_display_activities_footer));
        } else {
            s.m("mMaximumAllowedLabel");
            throw null;
        }
    }
}

package com.garmin.android.apps.connectmobile.settings.devices.lumen;

import android.os.Bundle;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.settings.devices.activityoptions.ActivityOptionsActivity;
import d53.u;
import g22.n;
import hb2.i;
import java.util.Iterator;
import java.util.List;
import og1.a;
import og1.e;
import og1.g;
import p005kotlin.Metadata;
import zb0.u0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/devices/lumen/LumenActivityOptionsActivity;", "Lcom/garmin/android/apps/connectmobile/settings/devices/activityoptions/ActivityOptionsActivity;", "<init>", "()V", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class LumenActivityOptionsActivity extends ActivityOptionsActivity {
    @Override // com.garmin.android.apps.connectmobile.settings.devices.activityoptions.ActivityOptionsActivity
    public final void ha() {
        super.ha();
        this.f42527a = 7;
    }

    @Override // com.garmin.android.apps.connectmobile.settings.devices.activityoptions.ActivityOptionsActivity, og1.f
    public final void j9(String str) {
        e eVar;
        List<g> list;
        Object next;
        String sport;
        String subSport;
        String str2;
        u0 u0Var = this.f42537k;
        if (u0Var == null || this.f42535i || !i.a(this) || (eVar = this.f42534h) == null || (list = eVar.f131999a) == null) {
            return;
        }
        Iterator<T> it = list.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!u.q(((g) next).f132003d, str, false));
        g gVar = (g) next;
        if (gVar == null || (sport = gVar.getSport()) == null || (subSport = gVar.getSubSport()) == null || (str2 = gVar.f132003d) == null) {
            return;
        }
        com.garmin.android.apps.connectmobile.settings.devices.e.a aVarValueOf = com.garmin.android.apps.connectmobile.settings.devices.e.a.valueOf(n.g(sport));
        com.garmin.android.apps.connectmobile.settings.devices.e.b bVarValueOf = com.garmin.android.apps.connectmobile.settings.devices.e.b.valueOf(n.g(subSport));
        a aVar = this.f42538l;
        if (aVar != null) {
            aVar.a(aVarValueOf, bVarValueOf, str2, this.f42528b, u0Var);
        }
    }

    @Override // com.garmin.android.apps.connectmobile.settings.devices.activityoptions.ActivityOptionsActivity, com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        initActionBar(true, R.string.activity_options_title);
    }
}

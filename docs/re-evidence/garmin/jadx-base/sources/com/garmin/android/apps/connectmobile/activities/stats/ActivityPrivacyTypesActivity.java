package com.garmin.android.apps.connectmobile.activities.stats;

import a32.d;
import am.k;
import am.l;
import android.content.Intent;
import com.garmin.android.apps.connectmobile.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p13.h0;

/* JADX INFO: loaded from: classes7.dex */
public class ActivityPrivacyTypesActivity extends d<l> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f29759c = 0;

    @Override // a32.d
    public final String ca() {
        return getString(R.string.account_privacy);
    }

    @Override // a32.d
    public final l da() {
        String stringExtra = getIntent().getStringExtra("GCM_extra_privacy_type");
        l.f4047c.getClass();
        return l.a.a(stringExtra, l.f4051g);
    }

    @Override // a32.d
    public final ArrayList ea(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(((l) it.next()).a()));
        }
        return arrayList;
    }

    @Override // a32.d
    public final ArrayList fa(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(((l) it.next()).b()));
        }
        return arrayList;
    }

    @Override // a32.d
    public final List<l> ga() {
        l.f4047c.getClass();
        return h0.N0(l.f4053i, new k());
    }

    @Override // a32.d
    public final Intent ha(l lVar) {
        Intent intent = new Intent();
        intent.putExtra("GCM_extra_activity_type", lVar.f4054a);
        return intent;
    }
}

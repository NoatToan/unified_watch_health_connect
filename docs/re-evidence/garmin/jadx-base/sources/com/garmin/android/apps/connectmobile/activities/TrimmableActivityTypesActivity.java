package com.garmin.android.apps.connectmobile.activities;

import am.x0;
import bm.m;
import java.util.ArrayList;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/activities/TrimmableActivityTypesActivity;", "Lcom/garmin/android/apps/connectmobile/activities/ActivityTypesActivity;", "<init>", "()V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class TrimmableActivityTypesActivity extends ActivityTypesActivity {
    @Override // com.garmin.android.apps.connectmobile.activities.ActivityTypesActivity
    public final List<x0> da(x0 x0Var) {
        List<x0> listDa = super.da(x0Var);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listDa) {
            if (m.d(((x0) obj).f4358a).booleanValue()) {
                arrayList.add(obj);
            }
        }
        return new ArrayList(arrayList);
    }
}

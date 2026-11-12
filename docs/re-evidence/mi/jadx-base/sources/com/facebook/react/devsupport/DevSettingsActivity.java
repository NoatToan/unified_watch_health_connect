package com.facebook.react.devsupport;

import android.os.Bundle;
import android.preference.PreferenceActivity;
import defpackage.c6j;
import defpackage.l1j;

/* JADX INFO: loaded from: classes4.dex */
public class DevSettingsActivity extends PreferenceActivity {
    @Override // android.preference.PreferenceActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle(getApplication().getResources().getString(l1j.x));
        addPreferencesFromResource(c6j.f4987a);
    }
}

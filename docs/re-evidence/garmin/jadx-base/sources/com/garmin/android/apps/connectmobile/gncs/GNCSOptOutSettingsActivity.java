package com.garmin.android.apps.connectmobile.gncs;

import android.os.Bundle;
import androidx.fragment.app.v;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.c;
import com.garmin.android.gncs.settings.GNCSOptOutSettingsFragment;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/gncs/GNCSOptOutSettingsActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "<init>", "()V", "a", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class GNCSOptOutSettingsActivity extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f35738a = new a(null);

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.opt_out_settings);
        GNCSOptOutSettingsFragment gNCSOptOutSettingsFragment = new GNCSOptOutSettingsFragment();
        Bundle bundle2 = new Bundle(8);
        bundle2.putInt(GNCSOptOutSettingsFragment.EXTRA_PROGRESS_INDICATOR_RESOURCE_ID, R.drawable.gcm4_running_man_animation);
        bundle2.putBoolean(GNCSOptOutSettingsFragment.EXTRA_HIDE_INSTRUCTIONS, true);
        bundle2.putInt(GNCSOptOutSettingsFragment.EXTRA_TEXT_COLOR, R.color.gcm_text_primary);
        bundle2.putInt(GNCSOptOutSettingsFragment.EXTRA_DISABLED_TEXT_COLOR, R.color.gcm_text_primary_disabled);
        bundle2.putInt(GNCSOptOutSettingsFragment.EXTRA_SWITCH_THUMB_TINT_ID, R.color.gcm_switch_thumb_color_selector);
        bundle2.putInt(GNCSOptOutSettingsFragment.EXTRA_SWITCH_TRACK_TINT_ID, R.color.gcm_switch_track_color_selector);
        bundle2.putString(GNCSOptOutSettingsFragment.EXTRA_TEXT_FONT, "font/roboto_light.ttf");
        bundle2.putInt(GNCSOptOutSettingsFragment.EXTRA_PROGRESS_INDICATOR_TINT_ID, R.color.gcm_running_man_icon);
        gNCSOptOutSettingsFragment.setArguments(bundle2);
        v supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        androidx.fragment.app.a aVar = new androidx.fragment.app.a(supportFragmentManager);
        aVar.l(com.garmin.android.gncs.R.id.fragment_container, gNCSOptOutSettingsFragment, null);
        aVar.e();
        initActionBar(true, R.string.gncs_lbl_app_notifications);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/gncs/GNCSOptOutSettingsActivity$a;", "", "<init>", "()V", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}

package com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.settings.model.UserSettingsDTO;
import java.util.Iterator;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import z10.p3;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/menstrualcycle/presentation/settings/MenstrualCycleSettingsActivity;", "Lz10/p3;", "<init>", "()V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class MenstrualCycleSettingsActivity extends p3 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f39030c = new a(null);

    @Override // z10.p3
    public final Fragment ca() {
        Parcelable parcelable;
        Intent intent = getIntent();
        Parcelable parcelable2 = null;
        if (intent != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable = (Parcelable) intent.getParcelableExtra("USER_SETTINGS_KEY", UserSettingsDTO.class);
            } else {
                Parcelable parcelableExtra = intent.getParcelableExtra("USER_SETTINGS_KEY");
                parcelable = (UserSettingsDTO) (parcelableExtra instanceof UserSettingsDTO ? parcelableExtra : null);
            }
            parcelable2 = (UserSettingsDTO) parcelable;
        }
        Intent intent2 = getIntent();
        boolean booleanExtra = intent2 != null ? intent2.getBooleanExtra("SAVE_ON_BACK_KEY", false) : false;
        Intent intent3 = getIntent();
        boolean booleanExtra2 = intent3 != null ? intent3.getBooleanExtra("SCROLL_TO_TRACKING_OPTIONS", false) : false;
        Intent intent4 = getIntent();
        boolean booleanExtra3 = intent4 != null ? intent4.getBooleanExtra("NAVIGATE_TO_CYCLE_TYPE", false) : false;
        Intent intent5 = getIntent();
        boolean booleanExtra4 = intent5 != null ? intent5.getBooleanExtra("NAVIGATE_TO_HORMONAL_CONTRACEPTIVES", false) : false;
        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.f39031t1.getClass();
        Bundle bundle = new Bundle();
        bundle.putParcelable("USER_SETTINGS_KEY", parcelable2);
        bundle.putBoolean("SAVE_ON_BACK_KEY", booleanExtra);
        bundle.putBoolean("SCROLL_TO_TRACKING_OPTIONS", booleanExtra2);
        bundle.putBoolean("NAVIGATE_TO_CYCLE_TYPE", booleanExtra3);
        bundle.putBoolean("NAVIGATE_TO_HORMONAL_CONTRACEPTIVES", booleanExtra4);
        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a aVar = new com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a();
        aVar.setArguments(bundle);
        return aVar;
    }

    @Override // z10.p3
    public final String da() {
        String string = getString(R.string.pregnancy_womens_health);
        string.getClass();
        return string;
    }

    @Override // z10.p3
    public final boolean ia() {
        return true;
    }

    @Override // com.garmin.android.apps.connectmobile.z1, androidx.fragment.app.m, b.g, android.app.Activity
    public final void onActivityResult(int i14, int i15, Intent intent) {
        Iterator<Fragment> it = getSupportFragmentManager().f7372c.f().iterator();
        while (it.hasNext()) {
            it.next().onActivityResult(i14, i15, intent);
        }
        super.onActivityResult(i14, i15, intent);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0006¨\u0006\r"}, d2 = {"Lcom/garmin/android/apps/connectmobile/menstrualcycle/presentation/settings/MenstrualCycleSettingsActivity$a;", "", "<init>", "()V", "", "CYCLE_PREDICTIONS_ALTERED_KEY", "Ljava/lang/String;", "PREGNANCY_DATA_ALTERED", "USER_SETTINGS_KEY", "SAVE_ON_BACK_KEY", "SCROLL_TO_TRACKING_OPTIONS", "NAVIGATE_TO_CYCLE_TYPE", "NAVIGATE_TO_HORMONAL_CONTRACEPTIVES", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        public static Intent a(a aVar, Context context, UserSettingsDTO userSettingsDTO, boolean z14, boolean z15, boolean z16, int i14) {
            if ((i14 & 8) != 0) {
                z14 = false;
            }
            if ((i14 & 16) != 0) {
                z15 = false;
            }
            if ((i14 & 32) != 0) {
                z16 = false;
            }
            aVar.getClass();
            context.getClass();
            Intent intent = new Intent(context, (Class<?>) MenstrualCycleSettingsActivity.class);
            intent.putExtra("USER_SETTINGS_KEY", userSettingsDTO);
            intent.putExtra("SAVE_ON_BACK_KEY", true);
            intent.putExtra("SCROLL_TO_TRACKING_OPTIONS", z14);
            intent.putExtra("NAVIGATE_TO_CYCLE_TYPE", z15);
            intent.putExtra("NAVIGATE_TO_HORMONAL_CONTRACEPTIVES", z16);
            return intent;
        }

        private a() {
        }
    }
}

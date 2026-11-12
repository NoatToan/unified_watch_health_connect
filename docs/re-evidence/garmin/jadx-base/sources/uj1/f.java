package uj1;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import androidx.fragment.app.Fragment;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.SafetyFeaturesActivity;
import com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.setupwizard.SafetyFeatureSetupWizardActivity;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import org.koin.java.KoinJavaComponent;
import r22.p0;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class f implements DialogInterface.OnDismissListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f171504a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Fragment f171505b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f171506c;

    public /* synthetic */ f(Fragment fragment, Object obj, int i14) {
        this.f171504a = i14;
        this.f171505b = fragment;
        this.f171506c = obj;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        int i14 = this.f171504a;
        Object obj = this.f171506c;
        Fragment fragment = this.f171505b;
        switch (i14) {
            case 0:
                com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.b.a aVar = com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.b.f43713m;
                ((com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.b) fragment).z6((Integer) obj);
                break;
            default:
                SafetyFeatureSetupWizardActivity safetyFeatureSetupWizardActivity = (SafetyFeatureSetupWizardActivity) obj;
                SafetyFeatureSetupWizardActivity.a aVar2 = SafetyFeatureSetupWizardActivity.f43851k;
                ((p0) fragment).dismissAllowingStateLoss();
                if (p005kotlin.jvm.internal.s.g(safetyFeatureSetupWizardActivity.la(), hl.a.c.f84256b)) {
                    eq0.a.f65038b.a().getClass();
                    SharedPreferences sharedPreferencesP = eq0.a.P();
                    String strO = eq0.a.O(R.string.key_safety_feature_setup_first_time);
                    Set<String> stringSet = sharedPreferencesP.getStringSet(strO, null);
                    if (stringSet == null) {
                        stringSet = new HashSet<>();
                    }
                    Object obj2 = KoinJavaComponent.get$default(f12.b.class, null, null, 6, null);
                    obj2.getClass();
                    String userDisplayName = ((f12.b) obj2).getUserDisplayName();
                    Locale locale = Locale.getDefault();
                    locale.getClass();
                    String lowerCase = userDisplayName.toLowerCase(locale);
                    lowerCase.getClass();
                    stringSet.add(lowerCase);
                    sharedPreferencesP.edit().putStringSet(strO, stringSet).commit();
                    safetyFeatureSetupWizardActivity.ka().f137903e.o(true);
                }
                SafetyFeaturesActivity.a aVar3 = SafetyFeaturesActivity.f43691f;
                hl.a aVarLa = safetyFeatureSetupWizardActivity.la();
                aVar3.getClass();
                Intent intentB = SafetyFeaturesActivity.a.b(safetyFeatureSetupWizardActivity, false, aVarLa);
                intentB.addFlags(67108864);
                safetyFeatureSetupWizardActivity.startActivity(intentB);
                safetyFeatureSetupWizardActivity.finish();
                break;
        }
    }
}

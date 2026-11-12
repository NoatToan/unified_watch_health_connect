package dv;

import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.v;
import androidx.lifecycle.n0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.group.details.feed.create.CreatePostActivity;
import com.garmin.android.apps.connectmobile.powerguide.create.CreatePowerGuideStrategyActivity;
import com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.SafetyFeaturesActivity;
import com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.setupwizard.SafetyFeatureSetupWizardActivity;
import com.garmin.feature.garminpay.providers.gpay.snowball.ui.SnowballCardDetailActivity;
import java.util.List;
import java.util.ListIterator;
import org.slf4j.Logger;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class i implements v.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f61329a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.v f61330b;

    public /* synthetic */ i(com.garmin.android.apps.connectmobile.v vVar, int i14) {
        this.f61329a = i14;
        this.f61330b = vVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // androidx.fragment.app.v.p
    public final void onBackStackChanged() {
        Fragment fragment;
        String tag;
        String tag2;
        int i14 = this.f61329a;
        Object obj = null;
        boolean z14 = true;
        com.garmin.android.apps.connectmobile.v vVar = this.f61330b;
        switch (i14) {
            case 0:
                com.garmin.android.apps.connectmobile.bic.a aVar = (com.garmin.android.apps.connectmobile.bic.a) vVar;
                int i15 = com.garmin.android.apps.connectmobile.bic.a.f30723c;
                n0 n0VarF = aVar.getSupportFragmentManager().F(R.id.content_frame);
                if (!(n0VarF instanceof l)) {
                    aVar.f30725b.i(0.0f);
                    break;
                } else {
                    View viewR = ((l) n0VarF).R();
                    if (viewR != null) {
                        viewR.getViewTreeObserver().addOnPreDrawListener(new com.garmin.android.apps.connectmobile.bic.a.b(viewR, aVar));
                        break;
                    }
                }
                break;
            case 1:
                Logger logger = hn2.c.f84546f;
                List<Fragment> listF = ((hn2.c) vVar).getSupportFragmentManager().f7372c.f();
                listF.getClass();
                ListIterator<Fragment> listIterator = listF.listIterator(listF.size());
                while (listIterator.hasPrevious()) {
                    Object objPrevious = listIterator.previous();
                    if (((Fragment) objPrevious).isVisible()) {
                        obj = objPrevious;
                        fragment = (Fragment) obj;
                        if (fragment == null && (fragment instanceof br2.h)) {
                            ((br2.h) fragment).v6();
                            break;
                        }
                    }
                }
                fragment = (Fragment) obj;
                if (fragment == null) {
                }
                break;
            case 2:
                SnowballCardDetailActivity snowballCardDetailActivity = (SnowballCardDetailActivity) vVar;
                SnowballCardDetailActivity.f51258k.trace("onBackStackChanged()");
                Fragment fragmentG = snowballCardDetailActivity.getSupportFragmentManager().G("RECHARGE");
                Fragment fragmentG2 = snowballCardDetailActivity.getSupportFragmentManager().G("ORDER_HISTORY");
                boolean z15 = fragmentG != null;
                z14 = fragmentG2 != null;
                if (z15) {
                    String string = snowballCardDetailActivity.getString(R.string.wallet_top_up);
                    string.getClass();
                    snowballCardDetailActivity.W9(string, hn2.c.a.BACK);
                    snowballCardDetailActivity.j();
                } else if (!z14) {
                    String string2 = snowballCardDetailActivity.getString(R.string.wallet_card_detail);
                    string2.getClass();
                    snowballCardDetailActivity.W9(string2, hn2.c.a.BACK);
                    snowballCardDetailActivity.e();
                } else {
                    String string3 = snowballCardDetailActivity.getString(R.string.wallet_order_history);
                    string3.getClass();
                    snowballCardDetailActivity.W9(string3, hn2.c.a.BACK);
                    snowballCardDetailActivity.j();
                }
                break;
            case 3:
                CreatePostActivity createPostActivity = (CreatePostActivity) vVar;
                CreatePostActivity.a aVar2 = CreatePostActivity.f36357a;
                int iM = createPostActivity.getSupportFragmentManager().M();
                if (iM > 0) {
                    v.k kVarL = createPostActivity.getSupportFragmentManager().L(iM - 1);
                    kVarL.getClass();
                    Fragment fragmentG3 = createPostActivity.getSupportFragmentManager().G(kVarL.getName());
                    if (fragmentG3 instanceof tm0.c) {
                        createPostActivity.updateActionBarTitle(createPostActivity.getString(R.string.social_group_create_post_title));
                    } else if (fragmentG3 instanceof tm0.i) {
                        createPostActivity.updateActionBarTitle(createPostActivity.getString(R.string.social_choose_photo));
                    }
                }
                break;
            case 4:
                CreatePowerGuideStrategyActivity createPowerGuideStrategyActivity = (CreatePowerGuideStrategyActivity) vVar;
                CreatePowerGuideStrategyActivity.a aVar3 = CreatePowerGuideStrategyActivity.f40374b;
                Fragment fragmentF = createPowerGuideStrategyActivity.getSupportFragmentManager().F(R.id.content);
                if (fragmentF != null && (fragmentF instanceof va1.b)) {
                    createPowerGuideStrategyActivity.setTitle(((va1.b) fragmentF).V5());
                    break;
                }
                break;
            case 5:
                SafetyFeaturesActivity safetyFeaturesActivity = (SafetyFeaturesActivity) vVar;
                SafetyFeaturesActivity.a aVar4 = SafetyFeaturesActivity.f43691f;
                Fragment fragmentF2 = safetyFeaturesActivity.getSupportFragmentManager().F(R.id.content_frame);
                if (fragmentF2 != null && (tag = fragmentF2.getTag()) != null) {
                    Object obj2 = (hl.a) safetyFeaturesActivity.f43692c.getValue();
                    if ((obj2 instanceof hl.a.b ? (hl.a.b) obj2 : null) != null) {
                        ComposeView composeView = (ComposeView) safetyFeaturesActivity.findViewById(R.id.managed_account_notice);
                        composeView.getClass();
                        composeView.setVisibility(tag.equals("SafetyFeaturesMainFragment") ? 0 : 8);
                    }
                    break;
                }
                break;
            default:
                SafetyFeatureSetupWizardActivity safetyFeatureSetupWizardActivity = (SafetyFeatureSetupWizardActivity) vVar;
                SafetyFeatureSetupWizardActivity.a aVar5 = SafetyFeatureSetupWizardActivity.f43851k;
                Fragment fragmentF3 = safetyFeatureSetupWizardActivity.getSupportFragmentManager().F(R.id.content_frame);
                if (fragmentF3 != null && (tag2 = fragmentF3.getTag()) != null) {
                    Object objLa = safetyFeatureSetupWizardActivity.la();
                    if ((objLa instanceof hl.a.b ? (hl.a.b) objLa : null) != null) {
                        ComposeView composeView2 = (ComposeView) safetyFeatureSetupWizardActivity.findViewById(R.id.managed_account_notice);
                        switch (tag2.hashCode()) {
                            case -2117742814:
                                if (!tag2.equals("AssistanceTypeFragment")) {
                                    z14 = false;
                                }
                                break;
                            case -1283079632:
                                if (!tag2.equals("MyInformationFragment")) {
                                    z14 = false;
                                }
                                break;
                            case -916202867:
                                if (!tag2.equals("SafetyFeaturesSetupWizardDeviceSelectionFragment")) {
                                    z14 = false;
                                }
                                break;
                            case 424376988:
                                if (!tag2.equals("AddContactNewUserFragment")) {
                                    z14 = false;
                                }
                                break;
                            case 708753321:
                                if (!tag2.equals("SafetyFeatureSetupWizardFragment_BLANK")) {
                                    z14 = false;
                                }
                                break;
                            case 1234920052:
                                if (!tag2.equals("SafetyFeatureSetupWizardFragment")) {
                                    z14 = false;
                                }
                                break;
                            default:
                                z14 = false;
                                break;
                        }
                        composeView2.getClass();
                        composeView2.setVisibility(z14 ? 0 : 8);
                    }
                    break;
                }
                break;
        }
    }
}

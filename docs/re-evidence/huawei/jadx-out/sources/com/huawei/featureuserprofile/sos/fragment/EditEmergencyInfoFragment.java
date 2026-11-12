package com.huawei.featureuserprofile.sos.fragment;

import android.app.Dialog;
import android.os.Bundle;
import android.preference.Preference;
import android.preference.PreferenceCategory;
import android.preference.PreferenceFragment;
import android.preference.PreferenceScreen;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.huawei.featureuserprofile.R;
import com.huawei.featureuserprofile.sos.interf.OnPreferenceChangedListener;
import com.huawei.featureuserprofile.sos.interf.ReloadablePreferenceInterface;
import com.huawei.featureuserprofile.sos.manager.EmergencyInfoManager;
import com.huawei.featureuserprofile.sos.preference.EmergencyEditTextPreference;
import com.huawei.featureuserprofile.sos.preference.EmergencyEditTextTipPreference;
import com.huawei.featureuserprofile.sos.preference.EmergencyListPreference;
import com.huawei.ui.commonui.listviewforscroll.ListViewForScroll;
import defpackage.cxz;
import defpackage.inv;
import health.compact.a.util.LogUtil;

/* JADX INFO: loaded from: classes6.dex */
public class EditEmergencyInfoFragment extends PreferenceFragment implements OnPreferenceChangedListener {
    private Window e = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Preference f5687b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private PreferenceCategory f5688c = null;

    @Override // android.preference.PreferenceFragment, android.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // android.preference.PreferenceFragment, android.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_editemergencyinfo, (ViewGroup) null);
        ListViewForScroll listViewForScroll = (ListViewForScroll) viewInflate.findViewById(android.R.id.list);
        if (listViewForScroll != null) {
            listViewForScroll.setDivider(getResources().getDrawable(R.drawable.list_divider));
            listViewForScroll.setDividerHeight(1);
            listViewForScroll.setFooterDividersEnabled(false);
            listViewForScroll.setOverscrollFooter(getResources().getDrawable(R.color.transparent));
            listViewForScroll.setHeaderDividersEnabled(false);
            listViewForScroll.setOverscrollHeader(getResources().getDrawable(R.color.transparent));
        }
        addPreferencesFromResource(R.xml.edit_emergency_info);
        PreferenceCategory preferenceCategory = findPreference("title_personal") instanceof PreferenceCategory ? (PreferenceCategory) findPreference("title_personal") : null;
        if (preferenceCategory != null) {
            preferenceCategory.setLayoutResource(R.layout.custom_preference_category_no_divider);
        }
        if (findPreference("title_emergency_contact") instanceof PreferenceCategory) {
            this.f5688c = (PreferenceCategory) findPreference("title_emergency_contact");
        }
        this.f5687b = findPreference("entry_contact_edit");
        return viewInflate;
    }

    @Override // android.preference.PreferenceFragment, android.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        d();
        for (String str : inv.b()) {
            e(str);
        }
        this.f5688c.removePreference(this.f5687b);
        this.f5688c.addPreference(this.f5687b);
    }

    @Override // android.preference.PreferenceFragment
    public boolean onPreferenceTreeClick(PreferenceScreen preferenceScreen, Preference preference) {
        if (cxz.a(getActivity())) {
            e(preference);
        }
        return super.onPreferenceTreeClick(preferenceScreen, preference);
    }

    public void e(Preference preference) {
        Dialog dialog;
        if (preference instanceof EmergencyEditTextPreference) {
            dialog = ((EmergencyEditTextPreference) preference).getDialog();
        } else if (preference instanceof EmergencyEditTextTipPreference) {
            dialog = ((EmergencyEditTextTipPreference) preference).getDialog();
        } else if (preference instanceof EmergencyListPreference) {
            dialog = ((EmergencyListPreference) preference).getDialog();
        } else {
            LogUtil.d("EditEmergencyInfoFragment", "setDialogHideNavigation preference is not definition");
            dialog = null;
        }
        if (dialog == null) {
            LogUtil.d("EditEmergencyInfoFragment", "getDialog before dialog init done");
            return;
        }
        Window window = dialog.getWindow();
        this.e = window;
        if (window != null) {
            this.e.getDecorView().setSystemUiVisibility(window.getDecorView().getSystemUiVisibility() | 5890);
            this.e.getDecorView().setOnSystemUiVisibilityChangeListener(new View.OnSystemUiVisibilityChangeListener() { // from class: com.huawei.featureuserprofile.sos.fragment.EditEmergencyInfoFragment.2
                @Override // android.view.View.OnSystemUiVisibilityChangeListener
                public void onSystemUiVisibilityChange(int i) {
                    if (i != 5890) {
                        EditEmergencyInfoFragment.this.e.getDecorView().setSystemUiVisibility(i | 5890);
                    }
                }
            });
        }
    }

    public void d() {
        for (String str : inv.b()) {
            ReloadablePreferenceInterface reloadablePreferenceInterface = findPreference(str) instanceof ReloadablePreferenceInterface ? (ReloadablePreferenceInterface) findPreference(str) : null;
            if (reloadablePreferenceInterface != null) {
                reloadablePreferenceInterface.reloadFromPreference();
            }
        }
    }

    @Override // android.preference.PreferenceFragment, android.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:37:0x006a  */
    private void e(String str) {
        Preference preferenceFindPreference = findPreference(str);
        if (preferenceFindPreference == null) {
            LogUtil.d("EditEmergencyInfoFragment", "addPreferenceChangedListener preference is null. key is ", str);
        }
        str.hashCode();
        switch (str) {
            case "blood_type":
            case "organ_donor":
                if (preferenceFindPreference instanceof EmergencyListPreference) {
                    ((EmergencyListPreference) preferenceFindPreference).e(this);
                    break;
                }
                break;
            case "address":
            case "allergies":
            case "medications":
            case "medical_conditions":
                if (preferenceFindPreference instanceof EmergencyEditTextTipPreference) {
                    ((EmergencyEditTextTipPreference) preferenceFindPreference).d(this);
                    break;
                }
                break;
            case "name":
                if (preferenceFindPreference instanceof EmergencyEditTextPreference) {
                    ((EmergencyEditTextPreference) preferenceFindPreference).d(this);
                    break;
                }
                break;
            default:
                LogUtil.d("EditEmergencyInfoFragment", "There is no this preference.");
                break;
        }
    }

    @Override // com.huawei.featureuserprofile.sos.interf.OnPreferenceChangedListener
    public void onPreferenceChanged(String str, String str2) {
        LogUtil.a("EditEmergencyInfoFragment", "onPreferenceChanged preferenceKey ", str);
        EmergencyInfoManager.a().c(str, str2);
    }
}

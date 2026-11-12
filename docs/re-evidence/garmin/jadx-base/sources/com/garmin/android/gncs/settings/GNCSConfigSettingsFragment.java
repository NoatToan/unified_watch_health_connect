package com.garmin.android.gncs.settings;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import androidx.appcompat.widget.SwitchCompat;
import androidx.fragment.app.Fragment;
import com.garmin.android.gncs.R;

/* JADX INFO: loaded from: classes11.dex */
public class GNCSConfigSettingsFragment extends Fragment {
    private SwitchCompat addBlockAppAction;
    private SwitchCompat addDismissAppAction;
    private final CompoundButton.OnCheckedChangeListener listener = new CompoundButton.OnCheckedChangeListener() { // from class: com.garmin.android.gncs.settings.GNCSConfigSettingsFragment.1
        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z14) {
            if (compoundButton == GNCSConfigSettingsFragment.this.addDismissAppAction) {
                SmartNotificationsConfig.getInstance().setAddDismissAppAction(z14);
                return;
            }
            if (compoundButton == GNCSConfigSettingsFragment.this.addBlockAppAction) {
                SmartNotificationsConfig.getInstance().setAddBlockAppAction(z14);
                return;
            }
            if (compoundButton == GNCSConfigSettingsFragment.this.preferWearableActions) {
                SmartNotificationsConfig.getInstance().setPreferWearableActions(z14);
            } else if (compoundButton == GNCSConfigSettingsFragment.this.onlyUseWearableActions) {
                SmartNotificationsConfig.getInstance().setOnlyUseWearableActions(z14);
            } else if (compoundButton == GNCSConfigSettingsFragment.this.useSimpleActions) {
                SmartNotificationsConfig.getInstance().setUseSimpleActions(z14);
            }
        }
    };
    private SwitchCompat onlyUseWearableActions;
    private SwitchCompat preferWearableActions;
    private SwitchCompat useSimpleActions;

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(R.layout.config_settings, viewGroup, false);
        this.addDismissAppAction = (SwitchCompat) viewInflate.findViewById(R.id.addDismissAppAction);
        this.addBlockAppAction = (SwitchCompat) viewInflate.findViewById(R.id.addBlockAppAction);
        this.preferWearableActions = (SwitchCompat) viewInflate.findViewById(R.id.preferWearableActions);
        this.onlyUseWearableActions = (SwitchCompat) viewInflate.findViewById(R.id.onlyUseWearableActions);
        this.useSimpleActions = (SwitchCompat) viewInflate.findViewById(R.id.useSimpleActions);
        this.addDismissAppAction.setOnCheckedChangeListener(this.listener);
        this.addBlockAppAction.setOnCheckedChangeListener(this.listener);
        this.preferWearableActions.setOnCheckedChangeListener(this.listener);
        this.onlyUseWearableActions.setOnCheckedChangeListener(this.listener);
        this.useSimpleActions.setOnCheckedChangeListener(this.listener);
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        this.addDismissAppAction.setChecked(SmartNotificationsConfig.getInstance().getAddDismissAppAction());
        this.addBlockAppAction.setChecked(SmartNotificationsConfig.getInstance().getAddBlockAppAction());
        this.preferWearableActions.setChecked(SmartNotificationsConfig.getInstance().preferWearableActions());
        this.onlyUseWearableActions.setChecked(SmartNotificationsConfig.getInstance().onlyUseWearableActions());
        this.useSimpleActions.setChecked(SmartNotificationsConfig.getInstance().useSimpleActions());
    }
}

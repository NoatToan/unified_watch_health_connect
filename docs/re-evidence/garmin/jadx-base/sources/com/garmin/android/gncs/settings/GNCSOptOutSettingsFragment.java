package com.garmin.android.gncs.settings;

import android.R;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.m;
import b7.g;
import com.garmin.android.apps.connectmobile.connectiq.i;
import com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy.l;
import com.garmin.android.gncs.GNCSApplicationInfo;
import com.garmin.android.gncs.GNCSListenerService;
import com.garmin.android.gncs.SmartNotificationsUtil;
import com.garmin.android.gncs.utils.FontCache;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
public class GNCSOptOutSettingsFragment extends Fragment implements GNCSApplicationAdapter.ItemCallback {
    public static final String EXTRA_DISABLED_TEXT_COLOR = "disabledTextColor";
    public static final String EXTRA_HIDE_INSTRUCTIONS = "hideInstructions";
    public static final String EXTRA_PROGRESS_INDICATOR_RESOURCE_ID = "progressIndicatorResourceId";
    public static final String EXTRA_PROGRESS_INDICATOR_TINT_ID = "progressIndicatorTintId";
    public static final String EXTRA_SWITCH_THUMB_RESOURCE_ID = "switchThumbResourceId";
    public static final String EXTRA_SWITCH_THUMB_TINT_ID = "switchThumbTintId";
    public static final String EXTRA_SWITCH_TRACK_RESOURCE_ID = "switchTrackResourceId";
    public static final String EXTRA_SWITCH_TRACK_TINT_ID = "switchTrackTintId";
    public static final String EXTRA_TEXT_COLOR = "textColor";
    public static final String EXTRA_TEXT_FONT = "textFont";
    private GNCSApplicationAdapter adapter;
    private SwitchCompat allApplicationsSwitch;
    private final CompoundButton.OnCheckedChangeListener allApplicationsSwitchListener;
    private View allApplicationsToggleContainer;
    private Context appContext;
    private View dndSettingContainer;
    private View followDNDHint;
    private SwitchCompat followDNDSwitch;
    private final CompoundButton.OnCheckedChangeListener followDNDSwitchListener;
    private ListView listView;
    private View notificationAccess;
    private View notificationAccessHint;
    private SwitchCompat notificationAccessSwitch;
    private ProgressBar progressBar;
    private final List<AppInfo> appInfoList = new ArrayList();
    private boolean ignoreAllApplicationsToggle = false;
    private boolean isNotificationServiceConnected = false;
    private final Handler mainThreadHandler = new Handler(Looper.getMainLooper());
    private final Runnable notificationStatusChecker = new Runnable() { // from class: com.garmin.android.gncs.settings.GNCSOptOutSettingsFragment.1
        @Override // java.lang.Runnable
        public void run() {
            if (GNCSOptOutSettingsFragment.this.getActivity() == null) {
                return;
            }
            boolean zIsServiceConnected = GNCSListenerService.isServiceConnected();
            if (GNCSOptOutSettingsFragment.this.isNotificationServiceConnected != zIsServiceConnected) {
                GNCSOptOutSettingsFragment.this.updateNotificationServiceStatus();
                GNCSOptOutSettingsFragment.this.isNotificationServiceConnected = zIsServiceConnected;
            }
            GNCSOptOutSettingsFragment.this.mainThreadHandler.postDelayed(this, 1000L);
        }
    };

    public GNCSOptOutSettingsFragment() {
        final int i14 = 0;
        this.followDNDSwitchListener = new CompoundButton.OnCheckedChangeListener(this) { // from class: com.garmin.android.gncs.settings.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ GNCSOptOutSettingsFragment f49903b;

            {
                this.f49903b = this;
            }

            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z14) {
                switch (i14) {
                    case 0:
                        this.f49903b.lambda$new$0(compoundButton, z14);
                        break;
                    default:
                        this.f49903b.lambda$new$1(compoundButton, z14);
                        break;
                }
            }
        };
        final int i15 = 1;
        this.allApplicationsSwitchListener = new CompoundButton.OnCheckedChangeListener(this) { // from class: com.garmin.android.gncs.settings.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ GNCSOptOutSettingsFragment f49903b;

            {
                this.f49903b = this;
            }

            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z14) {
                switch (i15) {
                    case 0:
                        this.f49903b.lambda$new$0(compoundButton, z14);
                        break;
                    default:
                        this.f49903b.lambda$new$1(compoundButton, z14);
                        break;
                }
            }
        };
    }

    private boolean areAllEnabled() {
        Iterator<AppInfo> it = this.appInfoList.iterator();
        while (it.hasNext()) {
            if (!it.next().enabled) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0(CompoundButton compoundButton, boolean z14) {
        ih2.b.b("GNCSOptOutSettingsFragment.OnCheckedChangeListener -> Follow DND set to: " + z14);
        GNCSSettings.getInstance().setFollowDND(this.appContext, z14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$1(CompoundButton compoundButton, boolean z14) {
        if (this.ignoreAllApplicationsToggle) {
            this.ignoreAllApplicationsToggle = false;
            return;
        }
        ih2.b.b("GNCSOptOutSettingsFragment.OnCheckedChangeListener -> Ignoring all applications.");
        GNCSApplicationAdapter gNCSApplicationAdapter = (GNCSApplicationAdapter) this.listView.getAdapter();
        if (gNCSApplicationAdapter != null) {
            ArrayList arrayList = new ArrayList(this.appInfoList.size());
            for (AppInfo appInfo : this.appInfoList) {
                appInfo.enabled = z14;
                arrayList.add(new GNCSApplicationInfo(appInfo.packageName, z14));
            }
            GNCSSettings.getInstance().save(arrayList);
            gNCSApplicationAdapter.notifyDataSetChanged();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onCreateView$2(View view2) {
        startActivity(new Intent("android.settings.ACTION_NOTIFICATION_LISTENER_SETTINGS"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onCreateView$3(View view2) {
        showNotificationAccessTerminatedDialog();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onCreateView$4(View view2) {
        SwitchCompat switchCompat = this.followDNDSwitch;
        switchCompat.setChecked(!switchCompat.isChecked());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onCreateView$5(View view2) {
        showNotificationAccessTerminatedDialog();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onCreateView$6(View view2) {
        SwitchCompat switchCompat = this.allApplicationsSwitch;
        switchCompat.setChecked(!switchCompat.isChecked());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean lambda$onCreateView$7(View view2, int i14, KeyEvent keyEvent) {
        if (i14 == 66 && keyEvent.getAction() == 0) {
            return this.listView.getSelectedView().performClick();
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Unit lambda$onResume$8(List list) {
        m activity = getActivity();
        if (activity != null && !activity.isFinishing()) {
            this.appInfoList.clear();
            this.appInfoList.addAll(list);
            boolean z14 = false;
            this.allApplicationsToggleContainer.setVisibility(0);
            this.progressBar.setVisibility(8);
            this.adapter.clear();
            this.adapter.addAll(this.appInfoList);
            boolean zIsChecked = this.allApplicationsSwitch.isChecked();
            boolean zAreAllEnabled = areAllEnabled();
            if (zAreAllEnabled && !zIsChecked) {
                z14 = true;
            }
            this.ignoreAllApplicationsToggle = z14;
            this.allApplicationsSwitch.setChecked(zAreAllEnabled);
            this.followDNDSwitch.setChecked(GNCSSettings.getInstance().isFollowingDND(this.appContext));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showNotificationAccessTerminatedDialog$9(DialogInterface dialogInterface, int i14) {
        startActivity(new Intent("android.settings.ACTION_NOTIFICATION_LISTENER_SETTINGS"));
        dialogInterface.dismiss();
    }

    public static Fragment newInstance(boolean z14, int i14, int i15) {
        ih2.b.b("GNCSOptOutSettingsFragment.newInstance -> New Instance of fragment created. ");
        if (!z14) {
            return new GNCSOptOutSettingsFragment();
        }
        Bundle bundle = new Bundle(3);
        bundle.putByte(EXTRA_HIDE_INSTRUCTIONS, (byte) 0);
        bundle.putInt(EXTRA_PROGRESS_INDICATOR_RESOURCE_ID, i14);
        bundle.putInt(EXTRA_PROGRESS_INDICATOR_TINT_ID, i15);
        GNCSOptOutSettingsFragment gNCSOptOutSettingsFragment = new GNCSOptOutSettingsFragment();
        gNCSOptOutSettingsFragment.setArguments(bundle);
        return gNCSOptOutSettingsFragment;
    }

    private void showNotificationAccessNotAllowedDialog() {
        m activity = getActivity();
        if (activity == null || activity.isFinishing()) {
            return;
        }
        new AlertDialog.Builder(activity).setCancelable(false).setTitle("Notification Access Not Allowed").setMessage("Unfortunately, notification access is not allowed on this device due to system limitations.").setPositiveButton(R.string.ok, new ai1.a(activity, 20)).show();
    }

    private void showNotificationAccessTerminatedDialog() {
        m activity = getActivity();
        if (activity == null || activity.isFinishing()) {
            return;
        }
        new AlertDialog.Builder(activity).setMessage(com.garmin.android.gncs.R.string.notification_access_terminated_popup_message).setPositiveButton(com.garmin.android.gncs.R.string.open_settings, new ai1.a(this, 21)).setNegativeButton(R.string.cancel, new i(4)).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateNotificationServiceStatus() {
        boolean zIsNotificationAccessEnabled = SmartNotificationsUtil.isNotificationAccessEnabled(this.appContext);
        boolean zIsServiceConnected = GNCSListenerService.isServiceConnected();
        if (zIsNotificationAccessEnabled && zIsServiceConnected) {
            this.notificationAccessSwitch.setChecked(true);
            this.notificationAccessHint.setVisibility(8);
            this.dndSettingContainer.setEnabled(true);
            this.followDNDSwitch.setEnabled(true);
            this.allApplicationsToggleContainer.setEnabled(true);
            this.allApplicationsSwitch.setEnabled(true);
            this.adapter.setEnabled(true);
            return;
        }
        SwitchCompat switchCompat = this.notificationAccessSwitch;
        if (zIsNotificationAccessEnabled) {
            switchCompat.setChecked(false);
            this.notificationAccessHint.setVisibility(0);
            this.dndSettingContainer.setEnabled(true);
            this.followDNDSwitch.setEnabled(true);
            this.allApplicationsToggleContainer.setEnabled(true);
            this.allApplicationsSwitch.setEnabled(true);
            this.adapter.setEnabled(true);
            return;
        }
        switchCompat.setChecked(false);
        this.notificationAccessHint.setVisibility(8);
        this.dndSettingContainer.setEnabled(false);
        this.followDNDSwitch.setEnabled(false);
        this.allApplicationsToggleContainer.setEnabled(false);
        this.allApplicationsSwitch.setEnabled(false);
        this.adapter.setEnabled(false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        this.appContext = context.getApplicationContext();
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        SmartNotificationsUtil.notifyNotificationAccessRequired(getActivity(), true, true);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        Typeface typeface;
        ih2.b.b("GNCSOptOutSettingsFragment.OnCreateView -> Creating view ");
        final int i24 = 0;
        View viewInflate = layoutInflater.inflate(com.garmin.android.gncs.R.layout.fragment_gncs_settings, viewGroup, false);
        this.listView = (ListView) viewInflate.findViewById(com.garmin.android.gncs.R.id.app_list);
        this.progressBar = (ProgressBar) viewInflate.findViewById(com.garmin.android.gncs.R.id.loading_spinner);
        View viewFindViewById = viewInflate.findViewById(com.garmin.android.gncs.R.id.notification_access);
        this.notificationAccess = viewFindViewById;
        viewFindViewById.setOnClickListener(new View.OnClickListener(this) { // from class: com.garmin.android.gncs.settings.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ GNCSOptOutSettingsFragment f49905b;

            {
                this.f49905b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i24) {
                    case 0:
                        this.f49905b.lambda$onCreateView$2(view2);
                        break;
                    case 1:
                        this.f49905b.lambda$onCreateView$3(view2);
                        break;
                    case 2:
                        this.f49905b.lambda$onCreateView$4(view2);
                        break;
                    case 3:
                        this.f49905b.lambda$onCreateView$5(view2);
                        break;
                    default:
                        this.f49905b.lambda$onCreateView$6(view2);
                        break;
                }
            }
        });
        View viewFindViewById2 = viewInflate.findViewById(com.garmin.android.gncs.R.id.notification_access_hint);
        this.notificationAccessHint = viewFindViewById2;
        final int i25 = 1;
        viewFindViewById2.setOnClickListener(new View.OnClickListener(this) { // from class: com.garmin.android.gncs.settings.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ GNCSOptOutSettingsFragment f49905b;

            {
                this.f49905b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i25) {
                    case 0:
                        this.f49905b.lambda$onCreateView$2(view2);
                        break;
                    case 1:
                        this.f49905b.lambda$onCreateView$3(view2);
                        break;
                    case 2:
                        this.f49905b.lambda$onCreateView$4(view2);
                        break;
                    case 3:
                        this.f49905b.lambda$onCreateView$5(view2);
                        break;
                    default:
                        this.f49905b.lambda$onCreateView$6(view2);
                        break;
                }
            }
        });
        this.notificationAccessSwitch = (SwitchCompat) viewInflate.findViewById(com.garmin.android.gncs.R.id.service_state);
        SwitchCompat switchCompat = (SwitchCompat) viewInflate.findViewById(com.garmin.android.gncs.R.id.all_applications_toggle_switch);
        this.allApplicationsSwitch = switchCompat;
        switchCompat.setOnCheckedChangeListener(this.allApplicationsSwitchListener);
        View viewFindViewById3 = viewInflate.findViewById(com.garmin.android.gncs.R.id.dnd_setting);
        this.dndSettingContainer = viewFindViewById3;
        final int i26 = 2;
        viewFindViewById3.setOnClickListener(new View.OnClickListener(this) { // from class: com.garmin.android.gncs.settings.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ GNCSOptOutSettingsFragment f49905b;

            {
                this.f49905b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i26) {
                    case 0:
                        this.f49905b.lambda$onCreateView$2(view2);
                        break;
                    case 1:
                        this.f49905b.lambda$onCreateView$3(view2);
                        break;
                    case 2:
                        this.f49905b.lambda$onCreateView$4(view2);
                        break;
                    case 3:
                        this.f49905b.lambda$onCreateView$5(view2);
                        break;
                    default:
                        this.f49905b.lambda$onCreateView$6(view2);
                        break;
                }
            }
        });
        View viewFindViewById4 = viewInflate.findViewById(com.garmin.android.gncs.R.id.dnd_setting_hint);
        this.followDNDHint = viewFindViewById4;
        final int i27 = 3;
        viewFindViewById4.setOnClickListener(new View.OnClickListener(this) { // from class: com.garmin.android.gncs.settings.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ GNCSOptOutSettingsFragment f49905b;

            {
                this.f49905b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i27) {
                    case 0:
                        this.f49905b.lambda$onCreateView$2(view2);
                        break;
                    case 1:
                        this.f49905b.lambda$onCreateView$3(view2);
                        break;
                    case 2:
                        this.f49905b.lambda$onCreateView$4(view2);
                        break;
                    case 3:
                        this.f49905b.lambda$onCreateView$5(view2);
                        break;
                    default:
                        this.f49905b.lambda$onCreateView$6(view2);
                        break;
                }
            }
        });
        SwitchCompat switchCompat2 = (SwitchCompat) viewInflate.findViewById(com.garmin.android.gncs.R.id.dnd_state);
        this.followDNDSwitch = switchCompat2;
        switchCompat2.setOnCheckedChangeListener(this.followDNDSwitchListener);
        View viewFindViewById5 = viewInflate.findViewById(com.garmin.android.gncs.R.id.all_applications_toggle_container);
        this.allApplicationsToggleContainer = viewFindViewById5;
        final int i28 = 4;
        viewFindViewById5.setOnClickListener(new View.OnClickListener(this) { // from class: com.garmin.android.gncs.settings.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ GNCSOptOutSettingsFragment f49905b;

            {
                this.f49905b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i28) {
                    case 0:
                        this.f49905b.lambda$onCreateView$2(view2);
                        break;
                    case 1:
                        this.f49905b.lambda$onCreateView$3(view2);
                        break;
                    case 2:
                        this.f49905b.lambda$onCreateView$4(view2);
                        break;
                    case 3:
                        this.f49905b.lambda$onCreateView$5(view2);
                        break;
                    default:
                        this.f49905b.lambda$onCreateView$6(view2);
                        break;
                }
            }
        });
        Bundle arguments = getArguments();
        if (arguments != null) {
            i14 = arguments.getInt(EXTRA_TEXT_COLOR, 0);
            String string = arguments.getString(EXTRA_TEXT_FONT, "");
            int i29 = arguments.getInt(EXTRA_DISABLED_TEXT_COLOR, 0);
            int i30 = arguments.getInt(EXTRA_SWITCH_THUMB_RESOURCE_ID, 0);
            int i34 = arguments.getInt(EXTRA_SWITCH_TRACK_RESOURCE_ID, 0);
            int i35 = arguments.getInt(EXTRA_SWITCH_THUMB_TINT_ID, 0);
            int i36 = arguments.getInt(EXTRA_SWITCH_TRACK_TINT_ID, 0);
            int i37 = arguments.getInt(EXTRA_PROGRESS_INDICATOR_TINT_ID, 0);
            Typeface typeface2 = !string.isEmpty() ? FontCache.getTypeface(string, requireContext()) : null;
            TextView textView = (TextView) viewInflate.findViewById(com.garmin.android.gncs.R.id.instructions);
            textView.setVisibility(arguments.containsKey(EXTRA_HIDE_INSTRUCTIONS) ? 8 : 0);
            TextView textView2 = (TextView) viewInflate.findViewById(com.garmin.android.gncs.R.id.notification_access_text);
            TextView textView3 = (TextView) viewInflate.findViewById(com.garmin.android.gncs.R.id.all_applications_text_view);
            TextView textView4 = (TextView) viewInflate.findViewById(com.garmin.android.gncs.R.id.dnd_setting_text);
            if (typeface2 != null) {
                textView2.setTypeface(typeface2);
                textView3.setTypeface(typeface2);
                textView.setTypeface(typeface2);
                textView4.setTypeface(typeface2);
            }
            if (i30 != 0) {
                this.notificationAccessSwitch.setThumbResource(i30);
                this.allApplicationsSwitch.setThumbResource(i30);
                this.followDNDSwitch.setThumbResource(i30);
            }
            if (i34 != 0) {
                this.notificationAccessSwitch.setTrackResource(i34);
                this.allApplicationsSwitch.setTrackResource(i34);
                this.followDNDSwitch.setTrackResource(i34);
            }
            if (i35 != 0) {
                this.notificationAccessSwitch.setThumbTintList(a7.b.getColorStateList(this.appContext, i35));
                this.allApplicationsSwitch.setThumbTintList(a7.b.getColorStateList(this.appContext, i35));
                this.followDNDSwitch.setThumbTintList(a7.b.getColorStateList(this.appContext, i35));
            }
            if (i36 != 0) {
                this.notificationAccessSwitch.setTrackTintList(a7.b.getColorStateList(this.appContext, i36));
                this.allApplicationsSwitch.setTrackTintList(a7.b.getColorStateList(this.appContext, i36));
                this.followDNDSwitch.setTrackTintList(a7.b.getColorStateList(this.appContext, i36));
            }
            int i38 = arguments.getInt(EXTRA_PROGRESS_INDICATOR_RESOURCE_ID, 0);
            if (i38 != 0) {
                ProgressBar progressBar = this.progressBar;
                Resources resources = getResources();
                ThreadLocal<TypedValue> threadLocal = g.f16255a;
                progressBar.setIndeterminateDrawable(resources.getDrawable(i38, null));
            }
            if (i37 != 0) {
                this.progressBar.setProgressTintList(a7.b.getColorStateList(this.appContext, i37));
            }
            typeface = typeface2;
            i15 = i29;
            i16 = i30;
            i17 = i34;
            i18 = i35;
            i19 = i36;
        } else {
            i14 = 0;
            i15 = 0;
            i16 = 0;
            i17 = 0;
            i18 = 0;
            i19 = 0;
            typeface = null;
        }
        GNCSApplicationAdapter gNCSApplicationAdapter = new GNCSApplicationAdapter(requireActivity(), this, i14, i15, i16, i17, i18, i19, typeface);
        this.adapter = gNCSApplicationAdapter;
        this.listView.setAdapter((ListAdapter) gNCSApplicationAdapter);
        this.listView.setOnKeyListener(new e(this, i24));
        return viewInflate;
    }

    @Override // com.garmin.android.gncs.settings.GNCSApplicationAdapter.ItemCallback
    public void onItemStateChanged() {
        boolean zIsChecked = this.allApplicationsSwitch.isChecked();
        boolean zAreAllEnabled = areAllEnabled();
        if (zIsChecked != zAreAllEnabled) {
            this.ignoreAllApplicationsToggle = true;
            this.allApplicationsSwitch.setChecked(zAreAllEnabled);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        this.mainThreadHandler.removeCallbacks(this.notificationStatusChecker);
        GNCSSettings.getInstance().completeOptOutSettings();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (!GNCSListenerService.isNotificationAccessAllowed(this.appContext)) {
            showNotificationAccessNotAllowedDialog();
            return;
        }
        this.progressBar.setVisibility(0);
        ih2.b.b("GNCSOptOutSettingsFragment -> Loading application list ");
        AppListLoaderKt.loadApps(this.appContext, new l(this, 3));
        updateNotificationServiceStatus();
        this.isNotificationServiceConnected = GNCSListenerService.isServiceConnected();
        this.mainThreadHandler.postDelayed(this.notificationStatusChecker, 1000L);
    }

    public static Fragment newInstance() {
        return newInstance(false, -1, -1);
    }
}

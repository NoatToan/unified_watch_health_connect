package com.xiaomi.hm.health.lab.activity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.fragment.app.FragmentTransaction;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.lib.rainbow.titlebar.RainbowTitleBar;
import com.huami.mifit.analytics.Analytics;
import com.huami.widget.toast.CustomToast;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.databases.model.LabActionDao;
import com.xiaomi.hm.health.lab.R;
import com.xiaomi.hm.health.lab.activity.PreBehaviorTaggingActivity;
import com.xiaomi.hm.health.lab.fragment.CountDownFragment;
import com.xiaomi.hm.health.lab.fragment.PreTaggingFragment;
import com.xiaomi.hm.health.lab.model.BehaviorTagEnity;
import com.xiaomi.hm.health.lab.provider.OptionsItemProvider;
import com.xiaomi.hm.health.lab.utils.BehaviorTaggingTools;
import com.xiaomi.hm.health.lab.utils.LabKeeper;
import com.xiaomi.hm.health.lab.view.RevealFrameLayout;
import com.xiaomi.hm.health.lab.view.picker.PickerDialogFragment;
import java.util.ArrayList;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes21.dex */
public class PreBehaviorTaggingActivity extends AppCompatActivity implements View.OnClickListener {
    public static final String BEHAVIOR_AUTO_SLEEP_TAG = "behavior.auto.sleep.tag.key";
    private BehaviorTagEnity a;
    private boolean b;
    private View c;
    private EditText d;
    private RevealFrameLayout e;
    private AppCompatTextView h;
    private AppCompatTextView i;
    private boolean j;
    private HMDeviceType f = HMDeviceType.MILI;
    private boolean g = false;
    private int k = 0;
    private int l = 0;

    public class a implements RevealFrameLayout.OnStateChangeListener {
        public a() {
        }

        @Override // com.xiaomi.hm.health.lab.view.RevealFrameLayout.OnStateChangeListener
        public void onStateChange(int i) {
            if (i == 2) {
                PreBehaviorTaggingActivity.this.w();
            } else if (i == 4) {
                PreBehaviorTaggingActivity.this.e.setVisibility(8);
            }
        }
    }

    public class b implements PickerDialogFragment.OnClickListener {
        public final /* synthetic */ ArrayList a;
        public final /* synthetic */ ArrayList b;

        public b(ArrayList arrayList, ArrayList arrayList2) {
            this.a = arrayList;
            this.b = arrayList2;
        }

        @Override // com.xiaomi.hm.health.lab.view.picker.PickerDialogFragment.OnClickListener
        public void onNegativeClick(int i, int i2) {
        }

        @Override // com.xiaomi.hm.health.lab.view.picker.PickerDialogFragment.OnClickListener
        public void onPositiveClick(int i, int i2) {
            PreBehaviorTaggingActivity.this.j = true;
            String str = (String) this.a.get(i);
            String str2 = (String) ((ArrayList) this.b.get(i)).get(i2);
            PreBehaviorTaggingActivity.this.h.setVisibility(0);
            if (i == 1) {
                PreBehaviorTaggingActivity.this.h.setText(PreBehaviorTaggingActivity.this.getResources().getString(R.string.lab_temperature_infrared_msg));
            } else {
                PreBehaviorTaggingActivity.this.h.setText(PreBehaviorTaggingActivity.this.getResources().getString(R.string.lab_temperature_mercury_msg));
            }
            PreBehaviorTaggingActivity.this.i.setText(String.format(PreBehaviorTaggingActivity.this.getResources().getString(R.string.lab_temperature_select_content), str, str2));
            PreBehaviorTaggingActivity.this.k = i;
            PreBehaviorTaggingActivity.this.l = i2;
            LabKeeper.saveTemperatureOptions(i, i2);
        }
    }

    public class c implements PreTaggingFragment.OnMarkDeviceChooseListener {

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                PreBehaviorTaggingActivity.this.e.startFromLocation(PreBehaviorTaggingActivity.this.c, 500L);
            }
        }

        public c() {
        }

        @Override // com.xiaomi.hm.health.lab.fragment.PreTaggingFragment.OnMarkDeviceChooseListener
        public void onMarkDeviceChoose(View view, HMDeviceType hMDeviceType) {
            Editable text = PreBehaviorTaggingActivity.this.d.getText();
            if (PreBehaviorTaggingActivity.this.b && TextUtils.isEmpty(text)) {
                ((InputMethodManager) PreBehaviorTaggingActivity.this.getSystemService("input_method")).showSoftInput(PreBehaviorTaggingActivity.this.d, 2);
                return;
            }
            if ("temperature".equals(PreBehaviorTaggingActivity.this.a.getBehaviorKey()) && !PreBehaviorTaggingActivity.this.j) {
                CustomToast.showShort(PreBehaviorTaggingActivity.this.getApplicationContext(), R.string.lab_temperature_device_parts_select);
                return;
            }
            PreBehaviorTaggingActivity.this.c = view;
            PreBehaviorTaggingActivity.this.f = hMDeviceType;
            if (!TextUtils.isEmpty(text)) {
                PreBehaviorTaggingActivity.this.a.setCustomizeBehaviorName(text.toString());
            }
            PreBehaviorTaggingActivity.this.e.setVisibility(0);
            PreBehaviorTaggingActivity.this.e.post(new a());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ CharSequence A(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        if (Pattern.compile("[\\\\/:*?\"<>|]").matcher(charSequence.toString()).find()) {
            return "";
        }
        return null;
    }

    private void B(EditText editText) {
        editText.setFilters(new InputFilter[]{new InputFilter() { // from class: s26
            @Override // android.text.InputFilter
            public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
                return PreBehaviorTaggingActivity.A(charSequence, i, i2, spanned, i3, i4);
            }
        }, new InputFilter.LengthFilter(20)});
    }

    private void initView() {
        RainbowTitleBar rainbowTitleBar = (RainbowTitleBar) findViewById(R.id.tv_title_bar);
        rainbowTitleBar.setTitle(this.a.getBehaviorNameStrId());
        rainbowTitleBar.setNavigationOnClickListener(new View.OnClickListener() { // from class: t26
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.x(view);
            }
        });
        ((ImageView) findViewById(R.id.imv_action_image)).setImageResource(this.a.getBehaviorBigImgResId());
        EditText editText = (EditText) findViewById(R.id.tx_action_name);
        this.d = editText;
        B(editText);
        if (this.b) {
            this.d.setVisibility(0);
        }
        v();
        u();
        if (BehaviorTaggingTools.NMEA.equals(this.a.getBehaviorKey())) {
            rainbowTitleBar.setMenuIcon(R.drawable.btn_nmea_tip);
            rainbowTitleBar.setOnActionMenuClickListener(new RainbowTitleBar.OnActionMenuClickListener() { // from class: u26
                @Override // com.huami.lib.rainbow.titlebar.RainbowTitleBar.OnActionMenuClickListener
                public final void onClick(View view, int i) {
                    this.a.z(view, i);
                }
            });
        } else if ("temperature".equals(this.a.getBehaviorKey())) {
            AppCompatTextView appCompatTextView = (AppCompatTextView) findViewById(R.id.lab_temperature_title);
            this.i = (AppCompatTextView) findViewById(R.id.lab_temperature_select);
            this.h = (AppCompatTextView) findViewById(R.id.lab_temperature_msg);
            appCompatTextView.setVisibility(0);
            this.i.setVisibility(0);
            this.i.setOnClickListener(this);
        }
    }

    private void u() {
        CountDownFragment countDownFragment = new CountDownFragment();
        FragmentTransaction fragmentTransactionBeginTransaction = getSupportFragmentManager().beginTransaction();
        int i = R.id.fl_countdown_container;
        fragmentTransactionBeginTransaction.replace(i, countDownFragment).commit();
        RevealFrameLayout revealFrameLayout = (RevealFrameLayout) findViewById(i);
        this.e = revealFrameLayout;
        revealFrameLayout.setOnStateChangeListener(new a());
    }

    private void v() {
        FragmentTransaction fragmentTransactionBeginTransaction = getSupportFragmentManager().beginTransaction();
        PreTaggingFragment preTaggingFragmentNewInstance = PreTaggingFragment.newInstance(this.a, this.g);
        fragmentTransactionBeginTransaction.replace(R.id.fl_main_container, preTaggingFragmentNewInstance).commit();
        preTaggingFragmentNewInstance.setOnMarkDeviceChooseListener(new c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w() {
        Intent intent = new Intent();
        HMDeviceType hMDeviceType = this.f;
        HMDeviceType hMDeviceType2 = HMDeviceType.SHOES;
        if (hMDeviceType == hMDeviceType2 && this.a.isSupportShoes()) {
            intent.setClass(this, ShoesBehaviorTaggingActivity.class);
            this.a.setDeviceType(hMDeviceType2);
        } else {
            HMDeviceType hMDeviceType3 = this.f;
            HMDeviceType hMDeviceType4 = HMDeviceType.MILI;
            if (hMDeviceType3 == hMDeviceType4) {
                intent.setClass(this, MiLiBehaviorTaggingActivity.class);
                this.a.setDeviceType(hMDeviceType4);
            } else {
                HMDeviceType hMDeviceType5 = HMDeviceType.OTHER;
                if (hMDeviceType3 == hMDeviceType5) {
                    intent.setClass(this, MonkeyBehaviorTaggingActivity.class);
                    this.a.setDeviceType(hMDeviceType5);
                } else {
                    HMDeviceType hMDeviceType6 = HMDeviceType.EARBUD;
                    if (hMDeviceType3 == hMDeviceType6) {
                        intent.setClass(this, EarbudBehaviorTaggingActivity.class);
                        this.a.setDeviceType(hMDeviceType6);
                    } else {
                        HMDeviceType hMDeviceType7 = HMDeviceType.HEADSET;
                        if (hMDeviceType3 != hMDeviceType7) {
                            Toast.makeText(this, R.string.choose_device_please, 0).show();
                            return;
                        } else {
                            intent.setClass(this, HeadsetBehaviorTaggingActivity.class);
                            this.a.setDeviceType(hMDeviceType7);
                        }
                    }
                }
            }
        }
        String behaviorKey = this.a.getBehaviorKey();
        if (!TextUtils.isEmpty(behaviorKey)) {
            Analytics.event(this, String.format("Lab_%s%s_ViewNum", behaviorKey.substring(0, 1).toUpperCase(), behaviorKey.substring(1)));
        }
        intent.putExtra(LabActionDao.TABLENAME, this.a);
        intent.putExtra(BaseBehaviorTaggingActivity.TEMPERATURE_DEVICE_OPTION, this.k);
        intent.putExtra(BaseBehaviorTaggingActivity.TEMPERATURE_PART_OPTION, this.l);
        startActivity(intent);
        overridePendingTransition(R.anim.running_main_enter, R.anim.running_main_exit);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void x(View view) {
        onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void z(View view, int i) {
        new AlertDialogFragment.Builder(view.getContext()).setMessage(R.string.lab_nmea_tip).setNeutralButton(R.string.gotit, new DialogInterface.OnClickListener() { // from class: r26
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                dialogInterface.dismiss();
            }
        }).create().show(getSupportFragmentManager());
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == R.id.lab_temperature_select) {
            ArrayList<String> arrayListBuildDeviceData = OptionsItemProvider.buildDeviceData(this);
            ArrayList<ArrayList<String>> arrayListBuildPartsData = OptionsItemProvider.buildPartsData(this);
            PickerDialogFragment pickerDialogFragmentBuild = new PickerDialogFragment.Builder().setOptions1Items(arrayListBuildDeviceData).setOptions2Items(arrayListBuildPartsData).setOptions1CurrentItem(this.k).setOptions2CurrentItem(this.l).build();
            pickerDialogFragmentBuild.setOnClickListener(new b(arrayListBuildDeviceData, arrayListBuildPartsData));
            pickerDialogFragmentBuild.show(getSupportFragmentManager(), "lab.picker.dialog.fragment");
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        setTheme(R.style.Theme_App_Zepp);
        super.onCreate(bundle);
        setContentView(R.layout.activity_pre_mark_action);
        this.a = (BehaviorTagEnity) getIntent().getSerializableExtra(LabActionDao.TABLENAME);
        this.b = getIntent().getBooleanExtra("IS_CUSTOM", false);
        this.g = getIntent().getBooleanExtra(BEHAVIOR_AUTO_SLEEP_TAG, false);
        initView();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        RevealFrameLayout revealFrameLayout = this.e;
        if (revealFrameLayout != null && this.c != null) {
            revealFrameLayout.setVisibility(8);
            this.e.endFromEdge(this.c, 0L);
        }
        super.onResume();
    }
}

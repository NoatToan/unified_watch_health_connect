package com.xiaomi.hm.health.ui.sportdevice;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.huami.moving.ui.utils.SportUIKeeper;
import com.huami.network.hmnetwork.server.HMServerDef;
import com.huami.view.basetitle.BaseTitleActivity;
import com.huami.watch.hmwatchmanager.R;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.device.HMDeviceManager;
import com.xiaomi.hm.health.device.event.HMDeviceConnectionEvent;
import com.xiaomi.hm.health.discovery.WebHelper;
import com.xiaomi.hm.health.model.account.HMPersonInfo;
import com.xiaomi.hm.health.ui.UnifyTitleBarStyle;
import com.xiaomi.hm.health.ui.sportdevice.SportSpecifiedTypeOpenDeviceActivity;
import com.xiaomi.hm.health.ui.sportdevice.adapter.SportOpenApplicableDeviceRvAdapter;
import com.xiaomi.hm.health.ui.sportdevice.view.CommonSportTipAlertDialogFragment;
import com.xiaomi.hm.health.ui.sportfitness.manager.SportDeviceManager;
import de.greenrobot.event.EventBus;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes22.dex */
public class SportSpecifiedTypeOpenDeviceActivity extends BaseTitleActivity implements SportOpenApplicableDeviceRvAdapter.OnOpenedDeviceChangeListener, SportOpenApplicableDeviceRvAdapter.OnDeviceSupportSportAnalysisTagClickListener {
    private static final String H = "sport_type";
    private static final int I = 1;
    private static final int J = 2;
    private SportOpenApplicableDeviceRvAdapter A;
    private LinearLayout B;
    private SportDeviceManager C;
    private List<HMDeviceSource> D = new ArrayList();
    private List<HMDeviceSource> E = new ArrayList();
    private CommonSportTipAlertDialogFragment F;
    private LayoutInflater G;
    private int x;
    private TextView y;
    private NestedScrollView z;

    private void initTitle() {
        String string;
        int i = this.x;
        if (i == 1) {
            string = getString(R.string.running_sports_type_running);
        } else if (i == 6) {
            string = getString(R.string.running_sports_type_walking);
        } else if (i == 25 || i == 8) {
            string = getString(R.string.runnings_sport_type_treadmill);
        } else {
            string = i != 9 ? "" : getString(R.string.sports_type_bike_ride);
        }
        if (TextUtils.isEmpty(string)) {
            UnifyTitleBarStyle.setUnifyTitleStyle(this, string);
        } else {
            UnifyTitleBarStyle.setUnifyTitleStyle(this, getString(R.string.open_device_sport_type_applicable_device, new Object[]{string}));
        }
        getTitleTextView().setTextColor(ContextCompat.getColor(this, R.color.s2));
    }

    private void initView() {
        this.z = (NestedScrollView) findViewById(R.id.exists_applicable_device_container);
        this.B = (LinearLayout) findViewById(R.id.no_applicable_device_container);
        this.y = (TextView) findViewById(R.id.open_device_tips);
    }

    private void n() {
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        if (defaultAdapter == null || defaultAdapter.isEnabled()) {
            return;
        }
        t();
    }

    private void o() {
        TextView textView;
        this.D.addAll(this.C.getBoundDevices(Integer.valueOf(this.x)));
        if (this.D.size() == 0) {
            this.z.setVisibility(8);
            this.B.setVisibility(0);
            textView = (TextView) findViewById(R.id.no_device_help);
        } else {
            this.z.setVisibility(0);
            this.B.setVisibility(8);
            textView = (TextView) findViewById(R.id.exists_device_help);
            p();
            q();
        }
        textView.setOnClickListener(new View.OnClickListener() { // from class: yc7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SportSpecifiedTypeOpenDeviceActivity.r(view);
            }
        });
    }

    public static void openSportSpecifiedTypeDeviceActivity(Context context, int sportType) {
        Intent intent = new Intent(context, (Class<?>) SportSpecifiedTypeOpenDeviceActivity.class);
        intent.putExtra("sport_type", sportType);
        context.startActivity(intent);
    }

    private void p() {
        List<HMDeviceSource> userOpenedBoundDevices = this.C.getUserOpenedBoundDevices(this.x);
        if (userOpenedBoundDevices.isEmpty()) {
            return;
        }
        this.E.addAll(userOpenedBoundDevices);
    }

    private void q() {
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.open_device_rv);
        SportOpenApplicableDeviceRvAdapter sportOpenApplicableDeviceRvAdapter = new SportOpenApplicableDeviceRvAdapter(this, this.x);
        this.A = sportOpenApplicableDeviceRvAdapter;
        sportOpenApplicableDeviceRvAdapter.setCanOpenDeviceList(this.D);
        this.A.setHaveOpenedDeviceList(this.E);
        recyclerView.setAdapter(this.A);
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        this.A.setOnOpenedDeviceChangeListener(this);
        this.A.setOnDeviceSupportSportAnalysisTagClickListener(this);
        this.y.setVisibility(this.D.size() > 2 ? 0 : 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void r(View view) {
        WebHelper.launch(HMServerDef.getUrl("t/posts/mifit?category=7&meta_key=tag&meta_value=sport_help") + "&userid=" + HMPersonInfo.getInstance().getUserInfo().getUserid());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void s(View view) {
        this.F.dismissAllowingStateLoss();
    }

    private void t() {
        startActivityForResult(new Intent("android.bluetooth.adapter.action.REQUEST_ENABLE"), 1);
    }

    private void u() {
        HMDeviceSource hMDeviceSource;
        int size = this.E.size();
        HMDeviceSource hMDeviceSource2 = null;
        if (size > 1) {
            hMDeviceSource2 = this.E.get(0);
            hMDeviceSource = this.E.get(1);
        } else if (size == 1) {
            hMDeviceSource2 = this.E.get(0);
            hMDeviceSource = null;
        } else {
            hMDeviceSource = null;
        }
        this.C.saveUserOpenedBoundDevices(this.x, hMDeviceSource2, hMDeviceSource);
    }

    private void v(int sportAnalysisType) {
        CommonSportTipAlertDialogFragment commonSportTipAlertDialogFragment = this.F;
        if (commonSportTipAlertDialogFragment == null || commonSportTipAlertDialogFragment.getDialog() == null || !this.F.getDialog().isShowing()) {
            if (this.G == null) {
                this.G = LayoutInflater.from(getApplicationContext());
            }
            View viewInflate = null;
            if (sportAnalysisType == 0) {
                viewInflate = View.inflate(this, R.layout.sport_device_support_sport_hr_analysis_dialog_content, null);
            } else if (sportAnalysisType == 1) {
                viewInflate = View.inflate(this, R.layout.sport_device_support_sport_pose_analysis_dialog_content, null);
            } else if (sportAnalysisType == 2) {
                viewInflate = View.inflate(this, R.layout.sport_device_support_sport_effect_analysis_dialog_content, null);
            }
            if (viewInflate == null) {
                return;
            }
            CommonSportTipAlertDialogFragment commonSportTipAlertDialogFragmentCreate = new CommonSportTipAlertDialogFragment.Builder().setContentView(viewInflate).create();
            this.F = commonSportTipAlertDialogFragmentCreate;
            commonSportTipAlertDialogFragmentCreate.show(getSupportFragmentManager(), "");
            viewInflate.findViewById(R.id.sport_analysis_dialog_close).setOnClickListener(new View.OnClickListener() { // from class: xc7
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.a.s(view);
                }
            });
        }
    }

    @SuppressLint({"NotifyDataSetChanged"})
    private void w(HMDeviceSource addedDeviceSource) {
        HMDeviceSource hMDeviceSource = null;
        int i = -1;
        for (HMDeviceSource hMDeviceSource2 : this.E) {
            int iIndexOf = this.D.indexOf(hMDeviceSource2);
            if (iIndexOf >= i) {
                hMDeviceSource = hMDeviceSource2;
                i = iIndexOf;
            }
        }
        this.E.remove(hMDeviceSource);
        this.E.add(addedDeviceSource);
        this.A.notifyDataSetChanged();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, android.app.Activity
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
    }

    @Override // com.xiaomi.hm.health.ui.sportdevice.adapter.SportOpenApplicableDeviceRvAdapter.OnDeviceSupportSportAnalysisTagClickListener
    public void onAnalysisTagClick(int sportAnalysisType) {
        v(sportAnalysisType);
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        setTheme(2132017904);
        super.onCreate(savedInstanceState);
        this.x = getIntent().getIntExtra("sport_type", -1);
        setContentView(R.layout.sport_activity_specified_type_open_device);
        this.C = SportDeviceManager.getInstance(getApplicationContext());
        initTitle();
        initView();
        o();
        n();
        SportUIKeeper.setSpecifiedSportTypeHaveOpenedDevice(getApplicationContext(), this.x, true);
        EventBus.getDefault().register(this);
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        EventBus.getDefault().unregister(this);
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public void onEventMainThread(HMDeviceConnectionEvent event) {
        HMDeviceSource boundDeviceSource = HMDeviceManager.getInstance().getBoundDeviceSource(event.getDeviceType());
        if (this.D.size() <= 0 || !this.D.contains(boundDeviceSource)) {
            return;
        }
        this.A.notifyDataSetChanged();
    }

    @Override // com.xiaomi.hm.health.ui.sportdevice.adapter.SportOpenApplicableDeviceRvAdapter.OnOpenedDeviceChangeListener
    public void onOpenedChange(int position, boolean isOpened) {
        if (!isOpened) {
            this.E.remove(this.D.get(position));
        } else if (this.E.size() >= 2) {
            w(this.D.get(position));
        } else {
            this.E.add(this.D.get(position));
        }
        u();
    }
}

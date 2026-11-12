package com.xiaomi.hm.health.device;

import android.app.FragmentTransaction;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.util.Consumer;
import com.google.gson.Gson;
import com.huami.devicex.manager.DeviceManagerApi;
import com.huami.lib.rainbow.titlebar.RainbowTitleBar;
import com.huami.passport.Configs;
import com.huami.watch.companion.CompanionApplication;
import com.huami.watch.companion.R;
import com.huami.watch.companion.dataflow.HealthData;
import com.huami.watch.companion.device.Device;
import com.huami.watch.companion.device.DeviceManager;
import com.huami.watch.companion.device.DeviceSource;
import com.huami.watch.companion.heartrate.reserve.HRReserveHelper;
import com.huami.watch.companion.heartrate.reserve.bean.HeartRateReserveInfo;
import com.huami.watch.companion.intervalrun.ui.TrainingPickerFragment;
import com.huami.watch.companion.sync.SyncUtil;
import com.huami.watch.companion.sync.ble.SyncBleUtil;
import com.huami.watch.companion.tips.TipCenter;
import com.huami.watch.companion.ui.view.HeartTypeView;
import com.huami.watch.companion.usersettings.UserSettings;
import com.huami.watch.companion.usersettings.UserSettingsKeys;
import com.huami.watch.dataflow.model.sport.SportParams;
import com.huami.watch.hmwatchmanager.view.AlertDialogFragment;
import com.huami.watch.transport.DataTransportResult;
import com.huami.watch.transport.Transporter;
import com.huami.watch.util.Rx;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.device.HMMiLiProDevice;
import kotlin.Lazy;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes20.dex */
public class EditHRReserveActivity extends AppCompatActivity implements View.OnClickListener {
    private static final String k = "type";
    private int a;
    private HeartTypeView[] b;
    private TextView c;
    private TextView d;
    private String e;
    private HeartRateReserveInfo h;
    private TipCenter i;
    private int f = -1;
    private int g = 0;
    private final Lazy<DeviceManagerApi> j = KoinJavaComponent.inject(DeviceManagerApi.class);

    public class a implements View.OnClickListener {
        public final /* synthetic */ AlertDialogFragment a;

        public a(AlertDialogFragment alertDialogFragment) {
            this.a = alertDialogFragment;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.a.dismissAllowingStateLoss();
        }
    }

    public class b implements DialogInterface.OnDismissListener {
        public final /* synthetic */ int a;

        public b(int i) {
            this.a = i;
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            EditHRReserveActivity.this.b[this.a].setValue(EditHRReserveActivity.this.h.getSection() != null ? EditHRReserveActivity.this.h.getSection()[this.a] : 0);
        }
    }

    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            EditHRReserveActivity.this.i.getSyncTip().hide();
        }
    }

    public class d implements View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            EditHRReserveActivity.this.i.getSyncTip().hide();
            EditHRReserveActivity.this.K(true);
        }
    }

    public class e implements View.OnClickListener {
        public e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            EditHRReserveActivity.this.i.getSyncTip().hide();
        }
    }

    public class f implements View.OnClickListener {
        public final /* synthetic */ TrainingPickerFragment a;
        public final /* synthetic */ int b;
        public final /* synthetic */ AlertDialogFragment c;

        public f(TrainingPickerFragment trainingPickerFragment, int i, AlertDialogFragment alertDialogFragment) {
            this.a = trainingPickerFragment;
            this.b = i;
            this.c = alertDialogFragment;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int i = (int) this.a.getPickerValue()[1];
            int i2 = this.b;
            if (i2 < 0) {
                if (i >= EditHRReserveActivity.this.f) {
                    EditHRReserveActivity editHRReserveActivity = EditHRReserveActivity.this;
                    editHRReserveActivity.Q(editHRReserveActivity.getString(R.string.resting_heart_values_tips));
                } else {
                    EditHRReserveActivity.this.g = i;
                    EditHRReserveActivity.this.d.setSelected(true);
                    EditHRReserveActivity.this.d.setText(EditHRReserveActivity.this.getString(R.string.heart_value_with_unit, new Object[]{Integer.valueOf(i)}));
                    EditHRReserveActivity.this.C();
                }
            } else if (i2 >= EditHRReserveActivity.this.b.length) {
                EditHRReserveActivity.this.b[this.b - EditHRReserveActivity.this.b.length].setPercent(i);
                EditHRReserveActivity.this.b[this.b - EditHRReserveActivity.this.b.length].setValue(EditHRReserveActivity.this.J(i / 100.0f));
            } else if (this.b == EditHRReserveActivity.this.b.length - 1) {
                EditHRReserveActivity.this.f = i;
                EditHRReserveActivity.this.C();
            } else {
                EditHRReserveActivity.this.b[this.b].setValue(i);
                EditHRReserveActivity.this.b[this.b].setPercent(Math.round(EditHRReserveActivity.this.R(i) * 100.0f));
            }
            this.c.dismissAllowingStateLoss();
        }
    }

    public class g implements View.OnClickListener {
        public final /* synthetic */ AlertDialogFragment a;

        public g(AlertDialogFragment alertDialogFragment) {
            this.a = alertDialogFragment;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.a.dismissAllowingStateLoss();
        }
    }

    public class h implements View.OnClickListener {
        public final /* synthetic */ AlertDialogFragment a;

        public h(AlertDialogFragment alertDialogFragment) {
            this.a = alertDialogFragment;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.a.dismissAllowingStateLoss();
        }
    }

    public class i implements View.OnClickListener {
        public final /* synthetic */ AlertDialogFragment a;

        public i(AlertDialogFragment alertDialogFragment) {
            this.a = alertDialogFragment;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            EditHRReserveActivity.this.g = -1;
            EditHRReserveActivity.this.f = HRReserveUtilsKt.getMaxHR();
            EditHRReserveActivity.this.B();
            EditHRReserveActivity.this.d.setSelected(false);
            EditHRReserveActivity.this.d.setText(R.string.training_click_setting);
            this.a.dismissAllowingStateLoss();
        }
    }

    public class j implements View.OnClickListener {
        public final /* synthetic */ AlertDialogFragment a;

        public j(AlertDialogFragment alertDialogFragment) {
            this.a = alertDialogFragment;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.a.dismissAllowingStateLoss();
        }
    }

    public class k implements View.OnClickListener {
        public final /* synthetic */ AlertDialogFragment a;

        public k(AlertDialogFragment alertDialogFragment) {
            this.a = alertDialogFragment;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.a.dismissAllowingStateLoss();
        }
    }

    public class l implements View.OnClickListener {
        public l() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int iIntValue = ((Integer) view.getTag()).intValue();
            if (iIntValue < 0) {
                EditHRReserveActivity editHRReserveActivity = EditHRReserveActivity.this;
                editHRReserveActivity.M(editHRReserveActivity.getString(R.string.choose_heart_value), 6, iIntValue);
            } else {
                if (iIntValue < EditHRReserveActivity.this.b.length) {
                    EditHRReserveActivity.this.y();
                    EditHRReserveActivity.this.b[iIntValue].setValueSelected(true);
                    EditHRReserveActivity editHRReserveActivity2 = EditHRReserveActivity.this;
                    editHRReserveActivity2.M(editHRReserveActivity2.getString(R.string.choose_heart_value), 5, iIntValue);
                    return;
                }
                EditHRReserveActivity.this.y();
                EditHRReserveActivity.this.b[iIntValue - EditHRReserveActivity.this.b.length].setPercentSelected(true);
                EditHRReserveActivity editHRReserveActivity3 = EditHRReserveActivity.this;
                editHRReserveActivity3.M(editHRReserveActivity3.getString(R.string.choose_heart_percent), 7, iIntValue);
            }
        }
    }

    private int[] A(int i2) {
        return HRReserveUtilsKt.getDefaultHeartRegionValue(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void B() {
        int[] iArrA = A(this.f);
        float[] fArrZ = z();
        int i2 = 0;
        while (true) {
            HeartTypeView[] heartTypeViewArr = this.b;
            if (i2 >= heartTypeViewArr.length) {
                return;
            }
            heartTypeViewArr[i2].setValue(iArrA[i2]);
            this.b[i2].setPercent((int) (fArrZ[i2] * 100.0f));
            i2++;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void C() {
        float[] fArrZ = z();
        for (int i2 = 0; i2 < fArrZ.length; i2++) {
            this.b[i2].setValue(J(fArrZ[i2]));
            this.b[i2].setPercent(Math.round(fArrZ[i2] * 100.0f));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void D(View view) {
        onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void E(View view, int i2) {
        K(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void F(Boolean bool) {
        if (bool.booleanValue()) {
            P();
        } else {
            O();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void G(boolean z, final Boolean bool) {
        if (z) {
            Rx.mainThread(new Runnable() { // from class: mi1
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.F(bool);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void H(int i2) {
        if (i2 == 0) {
            P();
        } else {
            O();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void I(boolean z, DataTransportResult dataTransportResult) {
        if (z) {
            final int resultCode = dataTransportResult.getResultCode();
            Rx.mainThread(new Runnable() { // from class: li1
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.H(resultCode);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int J(float f2) {
        int i2 = this.g;
        return i2 < 0 ? Math.round(this.f * f2) : Math.round(((this.f - i2) * f2) + i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean K(final boolean z) {
        int[] defaultHeartRegionValue;
        float[] defaultHeartRegionPercent;
        if (this.a != 1) {
            defaultHeartRegionValue = new int[6];
            defaultHeartRegionPercent = new float[6];
            int i2 = 0;
            while (true) {
                HeartTypeView[] heartTypeViewArr = this.b;
                if (i2 >= heartTypeViewArr.length) {
                    break;
                }
                defaultHeartRegionValue[i2] = heartTypeViewArr[i2].getValue();
                defaultHeartRegionPercent[i2] = this.b[i2].getPercent();
                i2++;
            }
            this.h.setRestingHeartRate(this.g);
            this.h.setSection(defaultHeartRegionValue);
            this.h.setPercent(defaultHeartRegionPercent);
        } else {
            defaultHeartRegionValue = HRReserveUtilsKt.getDefaultHeartRegionValue();
            defaultHeartRegionPercent = HRReserveUtilsKt.getDefaultHeartRegionPercent();
        }
        if (z) {
            this.h.setHeartRateType(this.a);
        }
        String json = new Gson().toJson(this.h);
        if (!z && json.equalsIgnoreCase(this.e)) {
            return true;
        }
        HRReserveHelper.getInstance(getApplicationContext()).clean();
        HealthData.cleanAllDayCacheHR();
        this.e = json;
        if (z) {
            UserSettings.put(getContentResolver(), UserSettingsKeys.KEY_RESERVE_HEARTRATE, json);
        }
        Device currentDevice = DeviceManager.getManager(this).getCurrentDevice();
        HMMiLiProDevice hMMiLiProDevice = (HMMiLiProDevice) this.j.getValue().getDevice(HMDeviceType.MILI);
        if (currentDevice == null && hMMiLiProDevice == null) {
            return true;
        }
        if ((currentDevice == null || !DeviceSource.isSeriesEverest2(currentDevice)) && hMMiLiProDevice == null) {
            SyncUtil.syncReserveHeartRateToWatch(this, json, new Transporter.DataSendResultCallback() { // from class: ki1
                @Override // com.huami.watch.transport.Transporter.DataSendResultCallback
                public final void onResultBack(DataTransportResult dataTransportResult) {
                    this.a.I(z, dataTransportResult);
                }
            });
        } else {
            if (hMMiLiProDevice == null) {
                hMMiLiProDevice = CompanionApplication.get().mBleConnection.mBleDevice;
            }
            SyncBleUtil.sendHeartRateZone(hMMiLiProDevice, (byte) this.h.getHeartRateType(), HRReserveUtilsKt.percentsToBytes(defaultHeartRegionPercent), HRReserveUtilsKt.sectionsToBytes(defaultHeartRegionValue), (byte) this.h.getRestingHeartRate(), new Consumer() { // from class: ii1
                @Override // androidx.core.util.Consumer
                public final void accept(Object obj) {
                    this.a.G(z, (Boolean) obj);
                }
            });
        }
        return true;
    }

    private void L(int i2) {
        int[] iArrX = x(i2);
        int i3 = iArrX[0] + 1;
        int i4 = iArrX[1] - 1;
        AlertDialogFragment alertDialogFragmentNewInstance = AlertDialogFragment.newInstance(7);
        alertDialogFragmentNewInstance.setMessage(getString(R.string.heart_values_tips, new Object[]{Integer.valueOf(i3), Integer.valueOf(i4)}));
        alertDialogFragmentNewInstance.setConfirm(getString(R.string.btn_enter), new k(alertDialogFragmentNewInstance));
        alertDialogFragmentNewInstance.setCancel(getString(R.string.btn_cancel), new a(alertDialogFragmentNewInstance));
        alertDialogFragmentNewInstance.setDismissListener(new b(i2));
        alertDialogFragmentNewInstance.show(getFragmentManager(), "check");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void M(String str, int i2, int i3) {
        AlertDialogFragment alertDialogFragmentNewInstance = AlertDialogFragment.newInstance(5);
        FragmentTransaction fragmentTransactionBeginTransaction = getFragmentManager().beginTransaction();
        TrainingPickerFragment trainingPickerFragment = new TrainingPickerFragment();
        Bundle bundle = new Bundle();
        bundle.putInt("type", i2);
        HeartTypeView[] heartTypeViewArr = this.b;
        if (i3 >= heartTypeViewArr.length) {
            int[] iArrX = x(i3 - heartTypeViewArr.length);
            bundle.putInt(SportParams.PARAM_CONFIG_MAX, Math.round(R(iArrX[1]) * 100.0f));
            bundle.putInt(SportParams.PARAM_CONFIG_MIN, Math.round(R(iArrX[0]) * 100.0f));
        } else if (i3 >= 0) {
            int[] iArrX2 = x(i3);
            bundle.putInt(SportParams.PARAM_CONFIG_MAX, iArrX2[1]);
            bundle.putInt(SportParams.PARAM_CONFIG_MIN, iArrX2[0]);
        }
        trainingPickerFragment.setArguments(bundle);
        alertDialogFragmentNewInstance.setContent(trainingPickerFragment);
        alertDialogFragmentNewInstance.setTitle(str);
        alertDialogFragmentNewInstance.setConfirm(getString(R.string.btn_enter), new f(trainingPickerFragment, i3, alertDialogFragmentNewInstance));
        alertDialogFragmentNewInstance.setCancel(getString(R.string.btn_cancel), new g(alertDialogFragmentNewInstance));
        alertDialogFragmentNewInstance.show(fragmentTransactionBeginTransaction, "picker");
    }

    private void N() {
        AlertDialogFragment alertDialogFragmentNewInstance = AlertDialogFragment.newInstance(7);
        alertDialogFragmentNewInstance.setMessage(getString(R.string.reset_heart_tips));
        alertDialogFragmentNewInstance.setConfirm(getString(R.string.btn_enter), new i(alertDialogFragmentNewInstance));
        alertDialogFragmentNewInstance.setCancel(getString(R.string.btn_cancel), new j(alertDialogFragmentNewInstance));
        alertDialogFragmentNewInstance.show(getFragmentManager(), Configs.Params.RESET);
    }

    private void O() {
        this.i.getSyncTip().setAnimDuration(400L).setLeftImg(R.drawable.ic_tips_icon_upgrade_red).setRightImg(R.drawable.ic_tips_btn_close_n).setRightBottomImg(R.drawable.ic_tips_btn_retry_n).setTitle(getString(R.string.reserve_heart_sync_title, new Object[]{this.a == 1 ? getString(R.string.heart_type_max) : getString(R.string.heart_type_reserve)})).setInfo(R.string.sync_data_fail).setBgColor(R.color.tip_bg_sync_failed).setOnRightImgClickListener(new e()).setOnRightBottomImgClickListener(new d()).autoHide(false).show();
    }

    private void P() {
        this.i.getSyncTip().setAnimDuration(400L).setLeftImg(R.drawable.ic_tips_icon_upgrade_green).setRightImg(R.drawable.ic_tips_btn_down_n).setTitle(getString(R.string.reserve_heart_sync_title, new Object[]{this.a == 1 ? getString(R.string.heart_type_max) : getString(R.string.heart_type_reserve)})).setInfo(R.string.sync_data_success).setBgColor(R.color.tip_bg_sync_success).setOnRightImgClickListener(new c()).autoHide(true).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Q(String str) {
        AlertDialogFragment alertDialogFragmentNewInstance = AlertDialogFragment.newInstance(6);
        alertDialogFragmentNewInstance.setMessage(str);
        alertDialogFragmentNewInstance.setNeutral(getString(R.string.btn_enter), new h(alertDialogFragmentNewInstance));
        alertDialogFragmentNewInstance.show(getFragmentManager(), "tips");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float R(int i2) {
        float f2;
        float f3;
        int i3 = this.g;
        if (i3 < 0) {
            f2 = i2;
            f3 = this.f;
        } else {
            f2 = i2 - i3;
            f3 = this.f - i3;
        }
        float f4 = f2 / f3;
        if (f4 < 0.01f) {
            f4 = 0.01f;
        }
        if (f4 > 1.0f) {
            return 1.0f;
        }
        return f4;
    }

    private void initData() {
        this.e = UserSettings.get(getContentResolver(), UserSettingsKeys.KEY_RESERVE_HEARTRATE);
        HeartRateReserveInfo info = HRReserveHelper.getInstance(getApplicationContext()).getInfo();
        this.h = info;
        if (info.getSection() == null || this.h.getPercent() == null) {
            int maxHR = HRReserveUtilsKt.getMaxHR();
            this.f = maxHR;
            this.h.setSection(A(maxHR));
            this.h.setPercent(z());
        }
    }

    private void initView() {
        Intent intent = getIntent();
        if (intent != null) {
            this.a = intent.getExtras().getInt("type", 0);
        }
        this.i = TipCenter.create((FrameLayout) findViewById(R.id.container));
        this.d = (TextView) findViewById(R.id.resting_heart_value);
        this.c = (TextView) findViewById(R.id.region_title);
        RainbowTitleBar rainbowTitleBar = (RainbowTitleBar) findViewById(R.id.title_bar);
        rainbowTitleBar.setNavigationOnClickListener(new View.OnClickListener() { // from class: hi1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.D(view);
            }
        });
        rainbowTitleBar.setOnActionMenuClickListener(new RainbowTitleBar.OnActionMenuClickListener() { // from class: ji1
            @Override // com.huami.lib.rainbow.titlebar.RainbowTitleBar.OnActionMenuClickListener
            public final void onClick(View view, int i2) {
                this.a.E(view, i2);
            }
        });
        findViewById(R.id.resting_heart_area).setOnClickListener(this);
        HeartTypeView[] heartTypeViewArr = new HeartTypeView[6];
        this.b = heartTypeViewArr;
        heartTypeViewArr[0] = (HeartTypeView) findViewById(R.id.area1);
        this.b[1] = (HeartTypeView) findViewById(R.id.area2);
        this.b[2] = (HeartTypeView) findViewById(R.id.area3);
        this.b[3] = (HeartTypeView) findViewById(R.id.area4);
        this.b[4] = (HeartTypeView) findViewById(R.id.area5);
        this.b[5] = (HeartTypeView) findViewById(R.id.area6);
        if (this.a != 1) {
            rainbowTitleBar.setTitle(R.string.heart_type_reserve);
            findViewById(R.id.reset).setOnClickListener(this);
            this.f = this.h.getSection()[5];
            int restingHeartRate = this.h.getRestingHeartRate();
            this.g = restingHeartRate;
            if (restingHeartRate > 0) {
                this.d.setSelected(true);
                this.d.setText(getString(R.string.heart_value_with_unit, new Object[]{Integer.valueOf(this.g)}));
            }
            int[] section = this.h.getSection();
            float[] percent = this.h.getPercent();
            if (section != null && section.length == 6) {
                l lVar = new l();
                int i2 = 0;
                while (true) {
                    HeartTypeView[] heartTypeViewArr2 = this.b;
                    if (i2 >= heartTypeViewArr2.length) {
                        break;
                    }
                    heartTypeViewArr2[i2].setValueTag(i2);
                    HeartTypeView[] heartTypeViewArr3 = this.b;
                    heartTypeViewArr3[i2].setPercentTag(heartTypeViewArr3.length + i2);
                    this.b[i2].setValue(section[i2]);
                    this.b[i2].setPercent((int) (percent[i2] * 100.0f));
                    int i3 = i2 + 1;
                    this.b[i2].setTitle(getString(R.string.reserve_heart_region_title, new Object[]{Integer.valueOf(i3)}));
                    this.b[i2].setValueClickListener(lVar);
                    i2 = i3;
                }
            }
            this.b[5].setTitle(R.string.heart_type_max);
            this.b[5].setPercentEnabled(false);
            return;
        }
        findViewById(R.id.header).setVisibility(8);
        findViewById(R.id.reset).setVisibility(8);
        ((TextView) findViewById(R.id.tips)).setText(R.string.max_heart_tips);
        int i4 = R.string.heart_type_max;
        rainbowTitleBar.setTitle(i4);
        this.c.setText(R.string.max_heart_region);
        this.b[0].setTitle(R.string.heart_section4);
        this.b[1].setTitle(R.string.heart_section3);
        this.b[2].setTitle(R.string.heart_section2);
        this.b[3].setTitle(R.string.heart_section1);
        this.b[4].setTitle(R.string.heart_section0);
        this.b[5].setTitle(i4);
        int i5 = 0;
        while (true) {
            HeartTypeView[] heartTypeViewArr4 = this.b;
            if (i5 >= heartTypeViewArr4.length) {
                this.f = HRReserveUtilsKt.getMaxHR();
                B();
                return;
            } else {
                heartTypeViewArr4[i5].setEnabled(false);
                i5++;
            }
        }
    }

    public static void show(Context context, int i2) {
        Intent intent = new Intent(context, (Class<?>) EditHRReserveActivity.class);
        intent.putExtra("type", i2);
        context.startActivity(intent);
    }

    private int[] x(int i2) {
        int[] iArr = new int[2];
        if (i2 == 0) {
            iArr[0] = Math.round(this.f * this.b[0].getPercent());
            iArr[1] = this.b[1].getValue() - 1;
            if (iArr[1] <= iArr[0]) {
                iArr[1] = iArr[0];
            }
        } else {
            HeartTypeView[] heartTypeViewArr = this.b;
            if (i2 == heartTypeViewArr.length - 1) {
                iArr[0] = this.g + 1;
                if (iArr[0] < 30) {
                    iArr[0] = 30;
                }
                iArr[1] = 215;
            } else {
                iArr[0] = heartTypeViewArr[i2 - 1].getValue() + 1;
                iArr[1] = this.b[i2 + 1].getValue() - 1;
                if (iArr[1] < iArr[0]) {
                    iArr[1] = iArr[0];
                }
            }
        }
        return iArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y() {
        int i2 = 0;
        while (true) {
            HeartTypeView[] heartTypeViewArr = this.b;
            if (i2 >= heartTypeViewArr.length) {
                return;
            }
            heartTypeViewArr[i2].cleanSelected();
            i2++;
        }
    }

    private float[] z() {
        return HRReserveUtilsKt.getDefaultHeartRegionPercent();
    }

    @Override // androidx.view.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (K(false)) {
            super.onBackPressed();
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.resting_heart_area) {
            M(getString(R.string.choose_resting_heart_value), 6, -1);
        } else if (id == R.id.reset) {
            N();
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_edit_heart);
        initData();
        initView();
    }
}

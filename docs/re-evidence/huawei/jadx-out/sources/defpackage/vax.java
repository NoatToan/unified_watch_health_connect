package defpackage;

import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.ContextCompat;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.health.device.model.HealthDevice;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.CreativeType;
import com.huawei.ui.commonui.dialog.CustomAlertDialog;
import com.huawei.ui.commonui.dialog.NoTitleCustomAlertDialog;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import com.huawei.ui.commonui.toolbar.HealthToolBar;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.health.activity.healthdata.InputTemperatureActivity;
import com.huawei.ui.main.stories.health.temperature.activity.TemperatureIntroduceActivity;
import com.huawei.ui.main.stories.privacy.template.model.bean.PageModelArgs;
import com.huawei.ui.main.stories.privacy.template.view.showdata.PrivacyDataModelActivity;
import com.huawei.ui.main.stories.template.BaseActivity;
import com.huawei.ui.main.stories.template.health.impl.HealthDetailCommonActivityPresenter;
import com.huawei.ui.main.stories.template.health.module.HealthDataDetailActivity;
import com.huawei.ui.main.stories.utils.LastTimeHealthDataReader;
import health.compact.a.EnvironmentInfo;
import health.compact.a.LanguageUtil;
import health.compact.a.Utils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class vax extends HealthDetailCommonActivityPresenter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f50882a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private WeakReference<CustomTitleBar> f50883b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f50884c;
    private LastTimeHealthDataReader<BaseActivity> d;
    private Context e;
    private HealthToolBar g;

    static /* synthetic */ void b(View view) {
    }

    public vax() {
        super("TemperatureActivityPresenter");
        boolean zO = Utils.o();
        this.f50882a = zO;
        this.mNeedResolution = !zO;
    }

    @Override // com.huawei.ui.main.stories.template.health.impl.HealthDetailCommonActivityPresenter
    public void initTitleBar(String str, String str2) {
        super.initTitleBar(str, str2);
        if (getView() == null) {
            LogUtil.j("TemperatureActivityPresenter", "initTitleBar getView is null");
            return;
        }
        if (!isViewAttached()) {
            LogUtil.j("TemperatureActivityPresenter", "initTitleBar isViewAttached false");
            return;
        }
        Context viewContext = getView().getViewContext();
        this.e = viewContext;
        if (viewContext == null) {
            this.e = BaseApplication.b();
        }
        if (this.f50882a) {
            getView().setTitle(this.e.getString(R.string.IDS_health_skin_temperature));
        } else {
            getView().setTitle(this.e.getString(R.string.IDS_settings_health_temperature));
        }
        WeakReference<CustomTitleBar> weakReference = new WeakReference<>(getView().getCustomTitleBar());
        this.f50883b = weakReference;
        final CustomTitleBar customTitleBar = weakReference.get();
        if (customTitleBar == null) {
            LogUtil.j("TemperatureActivityPresenter", "initTitleBar customTitleBar is null");
            return;
        }
        customTitleBar.setRightButtonDrawable(ContextCompat.getDrawable(this.e, R.drawable.ic_more_normal_black), qre.f(R.string.accessibility_more_item));
        customTitleBar.setRightButtonClickable(true);
        customTitleBar.setRightButtonOnClickListener(new View.OnClickListener() { // from class: vbc
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f50892b.d(customTitleBar, view);
            }
        });
        c();
    }

    /* synthetic */ void d(CustomTitleBar customTitleBar, View view) {
        e(customTitleBar);
    }

    private void c() {
        Context context = this.e;
        if (context instanceof HealthDataDetailActivity) {
            if (((HealthDataDetailActivity) context).e() > 0) {
                e(0);
                this.f50884c = false;
            } else {
                e(8);
            }
        }
    }

    @Override // com.huawei.ui.main.stories.template.health.impl.HealthDetailCommonActivityPresenter
    public void initToolBar() {
        if (getView() == null) {
            LogUtil.j("TemperatureActivityPresenter", "initToolBar getView is null");
            return;
        }
        if (!this.f50882a && this.g == null) {
            this.g = getView().getHealthToolBar();
            View viewInflate = View.inflate(this.e, R.layout.hw_toolbar_bottomview, null);
            viewInflate.setBackgroundColor(ContextCompat.getColor(this.e, R.color.health_chart_extend_background_color));
            this.g.d(viewInflate);
            this.g.setIcon(1, e());
            HealthToolBar healthToolBar = this.g;
            healthToolBar.setIconTitle(1, healthToolBar.getResources().getString(R.string.IDS_hw_health_show_healthdata_input));
            this.g.setIcon(3, R.mipmap.ic_thermometer);
            HealthToolBar healthToolBar2 = this.g;
            healthToolBar2.setIconTitle(3, healthToolBar2.getResources().getString(R.string.IDS_device_group_name_temperature_scale));
            if (EnvironmentInfo.m()) {
                this.g.setIconVisible(3, 8);
            }
            this.g.setOnSingleTapListener(new HealthToolBar.OnSingleTapListener() { // from class: vaz
                @Override // com.huawei.ui.commonui.toolbar.HealthToolBar.OnSingleTapListener
                public final void onSingleTap(int i) {
                    this.f50890a.b(i);
                }
            });
        }
    }

    /* synthetic */ void b(int i) {
        if (i == 1) {
            login(String.valueOf(1));
        } else if (i == 3) {
            login(String.valueOf(3));
        } else {
            LogUtil.j("TemperatureActivityPresenter", "unKnow click");
        }
    }

    @Override // com.huawei.ui.main.stories.template.health.impl.HealthDetailCommonActivityPresenter
    public void onLogined(String str) {
        if (String.valueOf(1).equals(str)) {
            b();
        } else if (String.valueOf(3).equals(str)) {
            h();
        } else {
            LogUtil.j("TemperatureActivityPresenter", "unknow position=", str);
        }
    }

    private void e(CustomTitleBar customTitleBar) {
        View viewInflate = LayoutInflater.from(this.e).inflate(R.layout.temperature_toolbar_popupwindow, (ViewGroup) null);
        final qop qopVar = new qop(this.e, viewInflate);
        qopVar.e(customTitleBar, 17);
        viewInflate.findViewById(R.id.temperature_declare_text).setOnClickListener(new View.OnClickListener() { // from class: vax.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                qopVar.e();
                vax.this.d(1);
                iov.d(vax.this.e, new Intent(vax.this.e, (Class<?>) TemperatureIntroduceActivity.class));
            }
        });
        viewInflate.findViewById(R.id.temperature_data_text).setOnClickListener(new View.OnClickListener() { // from class: vax.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                qopVar.e();
                vax.this.d(0);
                PageModelArgs pageModelArgs = new PageModelArgs(vax.this.f50882a ? CreativeType.WINDOW_IMAGE_WITH_DOWNLOAD_BUTTON : 106, "PrivacyDataConstructor", 3, 1);
                pageModelArgs.setClassType(0);
                PrivacyDataModelActivity.b(vax.this.e, pageModelArgs);
            }
        });
        d(viewInflate);
    }

    private void d(View view) {
        if (this.f50884c) {
            view.findViewById(R.id.temperature_data_text).setVisibility(8);
            view.findViewById(R.id.divider_line).setVisibility(8);
        } else {
            view.findViewById(R.id.temperature_data_text).setVisibility(0);
            view.findViewById(R.id.divider_line).setVisibility(0);
        }
    }

    private Drawable e() {
        Drawable drawable = ContextCompat.getDrawable(this.e, R.drawable.ic_public_detection);
        return LanguageUtil.ba(this.e) ? qqz.e(this.e, drawable) : drawable;
    }

    private void b() {
        if (qrs.c(500)) {
            return;
        }
        String strValue = AnalyticsValue.HEALTH_HEALTH_TEMPERATURE_INPUT_2060049.value();
        HashMap map = new HashMap(16);
        map.put("click", "1");
        lmf.d().c(this.e, strValue, map, 0);
        Intent intent = new Intent(this.e, (Class<?>) InputTemperatureActivity.class);
        intent.putExtra("isShowInput", true);
        iov.d(this.e, intent);
    }

    private void h() {
        if (qrs.c(500)) {
            return;
        }
        if (d() > 0) {
            a();
        } else {
            g();
        }
    }

    private void a() {
        final Intent intent = new Intent();
        intent.setPackage(BaseApplication.d());
        intent.setClassName(BaseApplication.d(), "com.huawei.health.device.ui.DeviceMainActivity");
        intent.putExtra("kind", "HDK_BODY_TEMPERATURE");
        final BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        if (defaultAdapter != null && defaultAdapter.getState() == 12) {
            c(intent);
            return;
        }
        NoTitleCustomAlertDialog.Builder builder = new NoTitleCustomAlertDialog.Builder(this.e);
        builder.b(R.string.IDS_device_bluetooth_open_request);
        builder.c(R.string.IDS_device_ui_dialog_yes, new View.OnClickListener() { // from class: vau
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f50881c.a(defaultAdapter, intent, view);
            }
        });
        builder.a(R.string.IDS_device_ui_dialog_no, new View.OnClickListener() { // from class: vaw
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                vax.b(view);
            }
        });
        NoTitleCustomAlertDialog noTitleCustomAlertDialogC = builder.c();
        noTitleCustomAlertDialogC.setCancelable(false);
        noTitleCustomAlertDialogC.show();
    }

    /* synthetic */ void a(BluetoothAdapter bluetoothAdapter, Intent intent, View view) {
        if (bluetoothAdapter != null) {
            try {
                if (bluetoothAdapter.enable()) {
                    c(intent);
                }
            } catch (SecurityException unused) {
                qpx.e(this.e, R.string.IDS_nearby_permission_exception);
                ReleaseLogUtil.a("TemperatureActivityPresenter", "gotoMeasure SecurityException");
            }
        }
    }

    private int d() {
        ArrayList<String> arrayListD = drw.e().d(HealthDevice.HealthDeviceKind.HDK_BODY_TEMPERATURE);
        if (njy.e(arrayListD)) {
            return 0;
        }
        return arrayListD.size();
    }

    private void c(Intent intent) {
        String strValue = AnalyticsValue.HEALTH_HEALTH_TEMPERATURE_DETAIL_MEASURE_2060047.value();
        HashMap map = new HashMap(16);
        map.put("click", "1");
        lmf.d().c(this.e, strValue, map, 0);
        intent.putExtra("view", "MeasureDevice");
        iov.d(this.e, intent);
    }

    private void g() {
        String string = this.e.getString(R.string.IDS_hw_temperature_no_device_tip, 1, 2);
        CustomAlertDialog.Builder builder = new CustomAlertDialog.Builder(this.e);
        builder.d(R.string.IDS_hw_temperature_no_device_title).e(string).d(R.string.IDS_hw_temperature_no_device_bind, new DialogInterface.OnClickListener() { // from class: vba
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                this.e.e(dialogInterface, i);
            }
        }).a(R.string.IDS_hw_health_show_common_dialog_cancle_button, new DialogInterface.OnClickListener() { // from class: vbf
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                LogUtil.a("TemperatureActivityPresenter", "onClick negative button");
            }
        });
        builder.b().show();
    }

    /* synthetic */ void e(DialogInterface dialogInterface, int i) {
        String strValue = AnalyticsValue.HEALTH_HEALTH_TEMPERATURE_DETAIL_BIND_2060048.value();
        HashMap map = new HashMap(16);
        map.put("click", "1");
        lmf.d().c(this.e, strValue, map, 0);
        i();
    }

    private void i() {
        etn.a(getView().getViewContext(), "HDK_BODY_TEMPERATURE");
    }

    @Override // com.huawei.ui.main.stories.template.health.impl.HealthDetailCommonActivityPresenter
    public void getLastDataTimestamp(IBaseResponseCallback iBaseResponseCallback) {
        d(iBaseResponseCallback);
    }

    private void d(final IBaseResponseCallback iBaseResponseCallback) {
        if (iBaseResponseCallback == null) {
            LogUtil.j("TemperatureActivityPresenter", "readLastTimeForDataPlatform callback is null");
            return;
        }
        Context context = this.e;
        if (context instanceof BaseActivity) {
            if (this.d == null) {
                this.d = new LastTimeHealthDataReader<>((BaseActivity) context, new IBaseResponseCallback() { // from class: vbb
                    @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                    /* JADX INFO: renamed from: onResponse */
                    public final void a(int i, Object obj) {
                        this.e.a(iBaseResponseCallback, i, obj);
                    }
                });
            }
            this.d.b(LastTimeHealthDataReader.CardData.TEMPERATURE);
        }
    }

    /* synthetic */ void a(IBaseResponseCallback iBaseResponseCallback, int i, Object obj) {
        if (obj instanceof HiHealthData) {
            this.f50884c = false;
            e(0);
            HiHealthData hiHealthData = (HiHealthData) obj;
            iBaseResponseCallback.a(0, Long.valueOf(hiHealthData.getStartTime()));
            LogUtil.a("TemperatureActivityPresenter", "readLastTimeForDataPlatform lastTime ", Long.valueOf(hiHealthData.getStartTime()));
            return;
        }
        if (this.f50882a) {
            e(0);
            iBaseResponseCallback.a(0, Long.valueOf(System.currentTimeMillis()));
        } else {
            a(iBaseResponseCallback);
        }
    }

    private void e(final int i) {
        HandlerExecutor.b(new Runnable() { // from class: vay
            @Override // java.lang.Runnable
            public final void run() {
                this.d.a(i);
            }
        });
    }

    /* synthetic */ void a(int i) {
        CustomTitleBar customTitleBar = this.f50883b.get();
        if (customTitleBar == null) {
            LogUtil.j("TemperatureActivityPresenter", "showTitleBar customTitleBar is null");
        } else {
            customTitleBar.setRightButtonVisibility(i);
        }
    }

    private void a(IBaseResponseCallback iBaseResponseCallback) {
        if (iBaseResponseCallback == null) {
            return;
        }
        int iD = d();
        boolean zA = mbw.a();
        LogUtil.a("TemperatureActivityPresenter", "showByBonded device number ", Integer.valueOf(iD), " isSupported ", Boolean.valueOf(zA));
        if (iD > 0 || zA) {
            e(0);
            this.f50884c = true;
            iBaseResponseCallback.a(2, 1L);
        } else {
            e(8);
            this.f50884c = false;
            iBaseResponseCallback.a(-1, 1L);
        }
    }

    @Override // com.huawei.ui.main.stories.template.health.impl.HealthDetailCommonActivityPresenter
    public List<Integer> getSubscribeList() {
        ArrayList arrayList = new ArrayList(4);
        vbk vbkVarC = vbk.c();
        arrayList.add(Integer.valueOf(vbkVarC.h()));
        arrayList.add(Integer.valueOf(vbkVarC.m()));
        arrayList.add(Integer.valueOf(vbkVarC.d()));
        arrayList.add(Integer.valueOf(vbkVarC.b()));
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(int i) {
        HashMap map = new HashMap();
        map.put("click", 1);
        map.put("type", Integer.valueOf(i));
        idy.b(AnalyticsValue.TEMPERATURE_MORE_2060079.value(), map);
    }

    @Override // com.huawei.ui.main.stories.template.health.impl.HealthDetailCommonActivityPresenter, com.huawei.ui.main.stories.template.BasePresenter
    public void detachView() {
        super.detachView();
        this.g = null;
        this.e = null;
    }
}

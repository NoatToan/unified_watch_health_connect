package com.xiaomi.hm.health.ui.smartplay;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.huami.android.design.dialog.loading.LoadingDialog;
import com.huami.bluetooth.profile.channel.module.alarm.AlarmVersionInfo;
import com.huami.devicex.R;
import com.huami.devicex.injection.action.ToolUtilApi;
import com.huami.mifit.analytics.Analytics;
import com.huami.mifit.analytics.builder.CountEventBuilder;
import com.huami.tools.log.HMLog;
import com.huami.view.basetitle.BaseTitleActivity;
import com.huami.widget.toast.CustomToast;
import com.huami.widget.toast.IconToast;
import com.xiaomi.hm.health.baseutil.GlobalConfig;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.databases.model.Alarm;
import com.xiaomi.hm.health.device.HMDeviceConfig;
import com.xiaomi.hm.health.device.HMDeviceManager;
import com.xiaomi.hm.health.device.alarm.AlarmClockManager;
import com.xiaomi.hm.health.device.event.StatEvent;
import com.xiaomi.hm.health.ui.BLEStatueListenerAdapter;
import com.xiaomi.hm.health.ui.BTStatusFragment;
import com.xiaomi.hm.health.ui.smartplay.HuamiOSAlarmActivity;
import com.xiaomi.hm.health.ui.smartplay.alarm.AlarmAdapter;
import com.xiaomi.hm.health.ui.smartplay.alarm.AlarmDiffUtilCallBack;
import com.xiaomi.hm.health.ui.smartplay.alarm.AlarmItem;
import com.xiaomi.hm.health.ui.smartplay.alarm.AlarmViewModelExt;
import com.xiaomi.hm.health.ui.smartplay.alarm.IAlarmCallback;
import com.xiaomi.hm.health.ui.smartplay.alarm.OnRecyclerItemClickedListener;
import com.xiaomi.hm.health.ui.smartplay.eventremind.EventReminderExpandKt;
import com.xiaomi.hm.health.ui.widget.SpacingDecoration;
import com.xiaomi.hm.health.utils.BaseTitleStyleKt;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import org.jetbrains.annotations.NotNull;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes22.dex */
public class HuamiOSAlarmActivity extends BaseTitleActivity implements View.OnClickListener {
    public static final int ALARM_PRO_SIZE = 10;
    public static final String KEY_DEVICE_TYPE = "hm_device_type";
    private static final String U = "HuamiOSAlarmActivity";
    private static final int V = 3;
    private static final String W = "key_force_dark_theme";
    private TextView A;
    private TextView B;
    private TextView C;
    private AlarmClockManager D;
    private View E;
    private View F;
    private TextView G;
    private View H;
    private View I;
    private TextView J;
    private BTStatusFragment K;
    private HMBaseDevice L;
    private HMDeviceSource M;
    private LoadingDialog N;
    private AlarmViewModelExt S;
    private RecyclerView x;
    private AlarmAdapter y;
    private View z;
    private boolean O = false;
    private final AtomicBoolean P = new AtomicBoolean(false);
    private final Lazy<ToolUtilApi> Q = KoinJavaComponent.inject(ToolUtilApi.class);
    private HMDeviceType R = HMDeviceType.MILI;
    private final Function0<Unit> T = new a();

    public class a implements Function0<Unit> {
        public a() {
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Unit getA() {
            if (HuamiOSAlarmActivity.this.S == null) {
                return null;
            }
            HuamiOSAlarmActivity.this.S.queryDeviceAlarm();
            return null;
        }
    }

    public class b extends BLEStatueListenerAdapter {
        public b() {
        }

        @Override // com.xiaomi.hm.health.ui.BLEStatueListenerAdapter, com.xiaomi.hm.health.ui.BTStatusFragment.BLEStatueListener
        public CharSequence getUnbindStr() {
            return HuamiOSAlarmActivity.this.getString(R.string.miband_alarm_not_bound);
        }

        @Override // com.xiaomi.hm.health.ui.BLEStatueListenerAdapter, com.xiaomi.hm.health.ui.BTStatusFragment.BLEStatueListener
        public void onEnableChange(boolean z) {
            if (HuamiOSAlarmActivity.this.S != null) {
                HuamiOSAlarmActivity.this.S.setEnable(z);
            }
        }
    }

    public static /* synthetic */ class c {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[HMDeviceSource.values().length];
            a = iArr;
            try {
                iArr[HMDeviceSource.MILI.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[HMDeviceSource.MILI_1A.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[HMDeviceSource.MILI_1S.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[HMDeviceSource.MILI_PRO.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[HMDeviceSource.MILI_PRO_I.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[HMDeviceSource.MILI_PRO_OLD.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[HMDeviceSource.MILI_ROCKY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[HMDeviceSource.MILI_NFC.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[HMDeviceSource.MILI_WUHAN.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[HMDeviceSource.MILI_CHONGQING.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                a[HMDeviceSource.MILI_CINCO.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                a[HMDeviceSource.MILI_CINCO_L.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    private void A() {
        this.S = (AlarmViewModelExt) new ViewModelProvider(this).get(AlarmViewModelExt.class);
        this.D = AlarmClockManager.getInstance();
        this.S.setUp(this.L);
        this.S.prepareAlarmAction(this.R);
        this.S.setAlarms(this.D.getShowAlarm(), false);
        this.S.getAlarmClocks().observe(this, new Observer() { // from class: hb4
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                this.a.F((List) obj);
            }
        });
        this.S.getEditAlarmClocks().observe(this, new Observer() { // from class: ib4
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                this.a.G((List) obj);
            }
        });
        this.S.getEnable().observe(this, new Observer() { // from class: db4
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                this.a.H((Boolean) obj);
            }
        });
        this.S.getResult().observe(this, new Observer() { // from class: jb4
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                this.a.I((Pair) obj);
            }
        });
        this.S.isEdit().observe(this, new Observer() { // from class: gb4
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                this.a.J((Boolean) obj);
            }
        });
        this.S.registerAlarmChangeListener(this.T);
    }

    private void B() {
        BTStatusFragment bTStatusFragmentNewInstance = BTStatusFragment.newInstance(R.id.container, getSupportFragmentManager());
        this.K = bTStatusFragmentNewInstance;
        bTStatusFragmentNewInstance.setShowBottomArea(false);
        this.K.setBLEStatusListener(new b());
    }

    private void C() {
        this.O = getIntent().getBooleanExtra(W, false);
        HMDeviceType hMDeviceType = (HMDeviceType) getIntent().getSerializableExtra(KEY_DEVICE_TYPE);
        if (hMDeviceType == null) {
            hMDeviceType = HMDeviceType.MILI;
        }
        this.R = hMDeviceType;
        if (this.O) {
            getDelegate().setLocalNightMode(2);
            this.P.compareAndSet(false, true);
        }
        setTheme(R.style.Theme_App_Zepp);
    }

    private void D() {
        switch (c.a[this.M.ordinal()]) {
            case 1:
            case 2:
            case 3:
                this.J.setText(R.string.miband_tips);
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                this.J.setText(R.string.alarm_clock_lazy_tip);
                break;
            default:
                this.J.setVisibility(8);
                break;
        }
        if (HMDeviceConfig.hasBoundWatch() || HMDeviceConfig.hasBoundTempSeries()) {
            this.I.setVisibility(8);
        }
    }

    private void E() {
        String string = getString(HMDeviceConfig.hasBoundWatch() ? R.string.chaohu_alarm : R.string.mi_band_alarm);
        if (GlobalConfig.get().isBuildMidong()) {
            EventReminderExpandKt.setUnifyTitleStyle(this, BaseTitleActivity.STYLE.BACK_AND_TITLE, string, null);
            BaseTitleStyleKt.boldTitle(this, 16.0f, 2);
        } else {
            setStyle(BaseTitleActivity.STYLE.BACK_AND_TITLE, ContextCompat.getColor(this, R.color.pale_grey), string, true);
            setBaseTitleColor(ContextCompat.getColor(this, R.color.black70));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void F(List list) {
        T(list);
        AlarmAdapter alarmAdapter = this.y;
        if (alarmAdapter == null || list == null) {
            return;
        }
        List<AlarmItem> alarmClocks = alarmAdapter.getAlarmClocks();
        List<AlarmItem> listAlarmList2AlarmItemList = this.S.alarmList2AlarmItemList(list);
        DiffUtil.DiffResult diffResultCalculateDiff = DiffUtil.calculateDiff(new AlarmDiffUtilCallBack(alarmClocks, listAlarmList2AlarmItemList), true);
        this.y.setAlarmClocks(listAlarmList2AlarmItemList);
        diffResultCalculateDiff.dispatchUpdatesTo(this.y);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void G(List list) {
        AlarmAdapter alarmAdapter;
        if (!this.S.isEdit().getValue().booleanValue() || (alarmAdapter = this.y) == null || list == null) {
            return;
        }
        List<AlarmItem> alarmClocks = alarmAdapter.getAlarmClocks();
        List<AlarmItem> listAlarmList2AlarmItemList = this.S.alarmList2AlarmItemList(list);
        DiffUtil.DiffResult diffResultCalculateDiff = DiffUtil.calculateDiff(new AlarmDiffUtilCallBack(alarmClocks, listAlarmList2AlarmItemList), true);
        this.y.setAlarmClocks(listAlarmList2AlarmItemList);
        diffResultCalculateDiff.dispatchUpdatesTo(this.y);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void H(Boolean bool) {
        y(bool.booleanValue());
        if (bool.booleanValue()) {
            this.S.queryDeviceAlarm();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void I(Pair pair) {
        Integer numValueOf;
        Integer num = (Integer) pair.getFirst();
        Boolean bool = (Boolean) pair.getSecond();
        if (num.intValue() == 1 && bool == null) {
            numValueOf = Integer.valueOf(R.string.delete_alarm);
        } else if (num.intValue() == 255 && bool == null) {
            numValueOf = Integer.valueOf(R.string.alarm_save);
        } else if (num.intValue() == 1) {
            numValueOf = Integer.valueOf(bool.booleanValue() ? R.string.delete_alarm_success : R.string.alarm_delete_failed);
        } else if (num.intValue() == 255) {
            numValueOf = Integer.valueOf(bool.booleanValue() ? R.string.alarm_save_success : R.string.alarm_save_failed);
        } else {
            if (num.intValue() == 0) {
                this.S.setAlarms(this.D.getShowAlarm(), false);
                return;
            }
            numValueOf = null;
        }
        if (bool == null) {
            S(numValueOf != null ? getString(numValueOf.intValue()) : "");
        } else {
            R(bool.booleanValue(), numValueOf != null ? getString(numValueOf.intValue()) : "");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void J(Boolean bool) {
        this.y.setEdit(bool.booleanValue());
        if (bool.booleanValue()) {
            this.z.setVisibility(8);
        } else {
            this.z.setVisibility(0);
        }
        if (bool.booleanValue()) {
            this.C.setVisibility(0);
        } else {
            this.C.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Unit K(Alarm alarm, Integer num) {
        this.S.deleteAlarm(alarm);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void L(AlarmVersionInfo alarmVersionInfo) {
        AlarmAdapter alarmAdapter = this.y;
        if (alarmAdapter != null) {
            alarmAdapter.setSupportCalendar(alarmVersionInfo != null && alarmVersionInfo.isSupportCalendarWorkday());
            this.S.loadAlarmData();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void M(int i) {
        if (this.C.getVisibility() == 0) {
            Analytics.recordEvent(new CountEventBuilder(StatEvent.EventId.BAND_CLOCK_OUT).setValue("Click2"));
        } else {
            Analytics.recordEvent(new CountEventBuilder(StatEvent.EventId.BAND_CLOCK_OUT).setValue("Click1"));
        }
        SetHuamiOSAlarmActivity.launch(this, 0, i, this.O);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void N(Boolean bool, Alarm alarm, Boolean bool2) {
        if (bool2 == null || !bool2.booleanValue()) {
            if (bool.booleanValue()) {
                IconToast.showError(this, getString(R.string.alarm_open_failed));
            } else {
                IconToast.showError(this, getString(R.string.alarm_close_failed));
            }
            this.D.keepVisibleAlarm(alarm);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Unit O(final Alarm alarm, Integer num, final Boolean bool) {
        this.S.updateAlarm(alarm, new IAlarmCallback() { // from class: lb4
            @Override // com.xiaomi.hm.health.ui.smartplay.alarm.IAlarmCallback
            public final void onResult(Object obj) {
                this.a.N(bool, alarm, (Boolean) obj);
            }
        });
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String P() {
        return "setLocalNightMode triggers recreate, no need to recreate";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String Q() {
        return "Manifest configChanges is uiMode, the page does not force dark mode; therefore, receive callbacks need to receive";
    }

    private void R(boolean z, String str) {
        LoadingDialog loadingDialog = this.N;
        if (loadingDialog != null && loadingDialog.isShowing() && z) {
            this.N.setSuccess(str);
            return;
        }
        LoadingDialog loadingDialog2 = this.N;
        if (loadingDialog2 == null || !loadingDialog2.isShowing() || z) {
            return;
        }
        this.N.setFailed(str);
    }

    private void S(String str) {
        LoadingDialog loadingDialog = this.N;
        if (loadingDialog != null) {
            loadingDialog.dismiss();
        }
        if (this.N == null) {
            this.N = LoadingDialog.showDialog(this, str);
        }
        if (!this.N.isShowing()) {
            this.N.show();
        }
        this.N.setCancelable(false);
    }

    private void T(List<Alarm> list) {
        int size = list != null ? list.size() : 0;
        BTStatusFragment bTStatusFragment = this.K;
        if (!(bTStatusFragment != null && bTStatusFragment.isShowing())) {
            if (size != 0) {
                this.A.setEnabled(true);
                this.A.setTextColor(ContextCompat.getColor(this, R.color.s2));
                this.F.setVisibility(8);
                this.H.setVisibility(0);
                return;
            }
            this.A.setEnabled(false);
            this.A.setTextColor(ContextCompat.getColor(this, R.color.s3));
            this.F.setVisibility(0);
            this.G.setVisibility(0);
            this.H.setVisibility(4);
            return;
        }
        this.A.setEnabled(true);
        TextView textView = this.A;
        int i = R.color.s2;
        textView.setTextColor(ContextCompat.getColor(this, i));
        this.B.setEnabled(true);
        this.B.setTextColor(ContextCompat.getColor(this, i));
        this.H.setVisibility(0);
        if (size != 0) {
            this.F.setVisibility(8);
        } else {
            this.F.setVisibility(0);
            this.G.setVisibility(8);
        }
    }

    private void initRecyclerView() {
        this.x.setHasFixedSize(true);
        AlarmAdapter alarmAdapter = new AlarmAdapter();
        this.y = alarmAdapter;
        alarmAdapter.setMListener(new OnRecyclerItemClickedListener() { // from class: mb4
            @Override // com.xiaomi.hm.health.ui.smartplay.alarm.OnRecyclerItemClickedListener
            public final void onClick(int i) {
                this.a.M(i);
            }
        });
        this.y.setOnCheckListener(new Function3() { // from class: fb4
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return this.a.O((Alarm) obj, (Integer) obj2, (Boolean) obj3);
            }
        });
        this.y.setOnDeleteListener(new Function2() { // from class: eb4
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return this.a.K((Alarm) obj, (Integer) obj2);
            }
        });
        this.x.setAdapter(this.y);
        this.x.setLayoutManager(new LinearLayoutManager(this));
        this.x.setItemAnimator(new DefaultItemAnimator());
        this.x.addItemDecoration(new SpacingDecoration((int) BaseTitleActivity.dp2px(this, 12.0f), (int) BaseTitleActivity.dp2px(this, 10.0f), true));
        this.S.queryVersion(new IAlarmCallback() { // from class: kb4
            @Override // com.xiaomi.hm.health.ui.smartplay.alarm.IAlarmCallback
            public final void onResult(Object obj) {
                this.a.L((AlarmVersionInfo) obj);
            }
        });
    }

    private void initView() {
        E();
        z();
        initRecyclerView();
        D();
        B();
    }

    public static void navigation2Alarm(Context context, boolean z) {
        Intent intent = new Intent(context, (Class<?>) HuamiOSAlarmActivity.class);
        intent.putExtra(W, z);
        context.startActivity(intent);
    }

    private void y(boolean z) {
        if (z) {
            this.I.setVisibility((HMDeviceManager.getInstance().hasBound(HMDeviceSource.MILI_PEYTO) || HMDeviceManager.getInstance().hasBound(HMDeviceSource.MILI_TEMPO)) ? 8 : 0);
        } else {
            this.I.setVisibility(8);
        }
        this.x.setEnabled(z);
        this.E.setVisibility(z ? 8 : 0);
    }

    private void z() {
        this.x = (RecyclerView) findViewById(R.id.alarm_list);
        this.J = (TextView) findViewById(R.id.alarm_tip);
        this.I = findViewById(R.id.alarm_tip_rl);
        this.F = findViewById(R.id.null_text);
        this.G = (TextView) findViewById(R.id.null_tip);
        this.H = findViewById(R.id.alarm_layout);
        this.E = findViewById(R.id.mask_view);
        int i = R.id.alarm_edit_parent;
        this.z = findViewById(i);
        this.A = (TextView) findViewById(R.id.alarm_edit);
        this.B = (TextView) findViewById(R.id.alarm_add);
        this.z = findViewById(i);
        this.C = (TextView) findViewById(R.id.alarm_done);
        this.A.setOnClickListener(this);
        this.B.setOnClickListener(this);
        this.C.setOnClickListener(this);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        HMLog.d(U, "onActivityResult", new Object[0]);
        if (intent == null || !intent.getBooleanExtra(SetHuamiOSAlarmActivity.KEY_IS_CHANGE, false)) {
            return;
        }
        this.S.queryDeviceAlarm();
    }

    @Override // androidx.view.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        AlarmViewModelExt alarmViewModelExt = this.S;
        if (alarmViewModelExt == null || !alarmViewModelExt.isEdit().getValue().booleanValue()) {
            super.onBackPressed();
        } else {
            this.S.setIsEdit(false);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (id != R.id.alarm_add) {
            if (id == R.id.alarm_edit) {
                this.S.setIsEdit(true);
                Analytics.recordEvent(new CountEventBuilder(StatEvent.EventId.BAND_CLOCK_OUT).setValue("Add"));
                return;
            } else {
                if (id == R.id.alarm_done) {
                    this.S.doneEditSource();
                    return;
                }
                return;
            }
        }
        int availableId = this.D.getAvailableId();
        if (this.D.isNormalAlarmSize()) {
            if (availableId < 0 || availableId > 2) {
                CustomToast.showShort(this, getString(R.string.add_alarm_tips, new Object[]{3}));
            } else {
                SetHuamiOSAlarmActivity.launch(this, 1, availableId, this.O);
            }
        } else if (availableId < 0 || availableId > 9) {
            CustomToast.showShort(this, getString(R.string.add_alarm_tips, new Object[]{10}));
        } else {
            SetHuamiOSAlarmActivity.launch(this, 1, availableId, this.O);
        }
        Analytics.recordEvent(new CountEventBuilder(StatEvent.EventId.BAND_CLOCK_OUT).setValue("Edit"));
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(@NonNull @NotNull Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.P.compareAndSet(true, false) && configuration.uiMode == 32) {
            HMLog.info(U, new Function0() { // from class: ob4
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public final Object getA() {
                    return HuamiOSAlarmActivity.P();
                }
            });
        } else {
            HMLog.info(U, new Function0() { // from class: nb4
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public final Object getA() {
                    return HuamiOSAlarmActivity.Q();
                }
            });
            ActivityCompat.recreate(this);
        }
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        C();
        super.onCreate(bundle);
        setContentView(R.layout.activity_huamios_alarm);
        this.L = HMDeviceManager.getInstance().getDevice(this.R);
        this.M = HMDeviceManager.getInstance().getBoundDeviceSource(this.R);
        A();
        initView();
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        AlarmViewModelExt alarmViewModelExt = this.S;
        if (alarmViewModelExt != null) {
            alarmViewModelExt.unRegisterAlarmChangeListener(this.T);
        }
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity
    public void onLeftClicked() {
        AlarmViewModelExt alarmViewModelExt = this.S;
        if (alarmViewModelExt == null || !alarmViewModelExt.isEdit().getValue().booleanValue()) {
            super.onLeftClicked();
        } else {
            this.S.setIsEdit(false);
        }
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity
    public void onRightFuncClicked() {
        this.Q.getValue().addToMyTools("ALARM");
        CustomToast.showShort(getApplicationContext(), R.string.tool_add_success);
        showRightFunc(false);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
        Analytics.recordEvent(new CountEventBuilder(StatEvent.EventId.BAND_CLOCK_VIEW_NUM));
    }
}

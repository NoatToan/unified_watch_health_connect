package com.xiaomi.hm.health.ui.smartplay.eventremind;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.huami.devicex.R;
import com.huami.devicex.injection.action.ToolUtilApi;
import com.huami.devicex.manager.DeviceManagerApi;
import com.huami.mifit.analytics.Analytics;
import com.huami.mifit.analytics.builder.CountEventBuilder;
import com.huami.tools.log.HMLog;
import com.huami.view.basetitle.BaseTitleActivity;
import com.huami.widget.toast.CustomToast;
import com.huami.widget.toast.IconToast;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.scwang.smartrefresh.layout.api.RefreshFooter;
import com.scwang.smartrefresh.layout.api.RefreshLayout;
import com.scwang.smartrefresh.layout.constant.SpinnerStyle;
import com.scwang.smartrefresh.layout.footer.ClassicsFooter;
import com.scwang.smartrefresh.layout.listener.OnRefreshLoadmoreListener;
import com.xiaomi.hm.health.baseutil.GlobalConfig;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMCallback;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.device.HMMiLiProDevice;
import com.xiaomi.hm.health.bt.model.HMReminderInfo;
import com.xiaomi.hm.health.device.deviceconfig.Feature;
import com.xiaomi.hm.health.device.deviceconfig.configs.ConfigHelperKt;
import com.xiaomi.hm.health.ui.BLEStatueListenerAdapter;
import com.xiaomi.hm.health.ui.BTStatusFragment;
import com.xiaomi.hm.health.ui.smartplay.eventremind.EventRemindActivity;
import de.greenrobot.event.EventBus;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import org.koin.java.KoinJavaComponent;
import rx.Emitter;
import rx.Observable;
import rx.Observer;
import rx.functions.Action1;

/* JADX INFO: loaded from: classes22.dex */
public class EventRemindActivity extends BaseTitleActivity {
    private static final String I = "EventRemindActivity";
    private TextView A;
    private RecyclerView B;
    private SmartRefreshLayout C;
    private EventRemindAdapter D;
    private EventRemindManager E = EventRemindManager.getInstance();
    private final Lazy<DeviceManagerApi> F = KoinJavaComponent.inject(DeviceManagerApi.class);
    private final Lazy<ToolUtilApi> G = KoinJavaComponent.inject(ToolUtilApi.class);
    private int H = 0;
    private TextView x;
    private TextView y;
    private TextView z;

    public class a implements Observer<Boolean> {
        public a() {
        }

        @Override // rx.Observer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onNext(Boolean bool) {
            EventRemindActivity.this.updateItems(false);
            EventRemindManager.readRemindersFromDevice();
        }

        @Override // rx.Observer
        public void onCompleted() {
        }

        @Override // rx.Observer
        public void onError(Throwable th) {
        }
    }

    public class b implements Observer<Void> {
        public final /* synthetic */ boolean a;

        public b(boolean z) {
            this.a = z;
        }

        @Override // rx.Observer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onNext(Void r1) {
        }

        @Override // rx.Observer
        public void onCompleted() {
            ArrayList arrayList = new ArrayList();
            EventRemindActivity.this.E(arrayList);
            int i = EventRemindActivity.this.H;
            if (this.a) {
                EventRemindActivity.this.H = EventRemindManager.getInstance().getEndedReminders().size();
            } else {
                EventRemindActivity.this.H += 20;
            }
            List<ComparableReminder> listO = EventRemindActivity.this.E.o(EventRemindActivity.this.H);
            EventRemindActivity.this.H = listO.size();
            if (listO.size() != 0) {
                arrayList.add(EventRemindActivity.this.getString(R.string.event_remind_ended, new Object[]{Integer.valueOf(EventRemindManager.n())}));
                arrayList.addAll(listO);
            }
            EventRemindActivity.this.D.getData().clear();
            EventRemindActivity.this.D.addData((Collection) arrayList);
            if (this.a) {
                return;
            }
            if (i != EventRemindActivity.this.H) {
                EventRemindActivity.this.C.finishLoadmore();
            } else {
                EventRemindActivity.this.C.finishLoadmore();
                EventRemindActivity.this.C.setLoadmoreFinished(true);
            }
        }

        @Override // rx.Observer
        public void onError(Throwable th) {
        }
    }

    public class c implements Observer<Boolean> {
        public c() {
        }

        @Override // rx.Observer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onNext(Boolean bool) {
            EventRemindActivity.this.U(false);
        }

        @Override // rx.Observer
        public void onCompleted() {
        }

        @Override // rx.Observer
        public void onError(Throwable th) {
        }
    }

    public class d implements OnRefreshLoadmoreListener {
        public d() {
        }

        @Override // com.scwang.smartrefresh.layout.listener.OnLoadmoreListener
        public void onLoadmore(RefreshLayout refreshLayout) {
            EventRemindActivity.this.S();
        }

        @Override // com.scwang.smartrefresh.layout.listener.OnRefreshListener
        public void onRefresh(RefreshLayout refreshLayout) {
        }
    }

    public class e extends BLEStatueListenerAdapter {
        public final /* synthetic */ BTStatusFragment a;

        public e(BTStatusFragment bTStatusFragment) {
            this.a = bTStatusFragment;
        }

        @Override // com.xiaomi.hm.health.ui.BLEStatueListenerAdapter, com.xiaomi.hm.health.ui.BTStatusFragment.BLEStatueListener
        public HMDeviceType getHMDeviceType() {
            DeviceManagerApi deviceManagerApi = (DeviceManagerApi) EventRemindActivity.this.F.getValue();
            HMDeviceType hMDeviceType = HMDeviceType.MILI;
            if (deviceManagerApi.hasBound(hMDeviceType)) {
                return hMDeviceType;
            }
            DeviceManagerApi deviceManagerApi2 = (DeviceManagerApi) EventRemindActivity.this.F.getValue();
            HMDeviceType hMDeviceType2 = HMDeviceType.WATCH;
            if (deviceManagerApi2.hasBound(hMDeviceType2)) {
                return hMDeviceType2;
            }
            DeviceManagerApi deviceManagerApi3 = (DeviceManagerApi) EventRemindActivity.this.F.getValue();
            HMDeviceType hMDeviceType3 = HMDeviceType.SENSORHUB;
            if (deviceManagerApi3.hasBound(hMDeviceType3)) {
                return hMDeviceType3;
            }
            DeviceManagerApi deviceManagerApi4 = (DeviceManagerApi) EventRemindActivity.this.F.getValue();
            HMDeviceType hMDeviceType4 = HMDeviceType.SHOES;
            if (deviceManagerApi4.hasBound(hMDeviceType4)) {
                return hMDeviceType4;
            }
            return null;
        }

        @Override // com.xiaomi.hm.health.ui.BLEStatueListenerAdapter, com.xiaomi.hm.health.ui.BTStatusFragment.BLEStatueListener
        public CharSequence getUnbindStr() {
            return null;
        }

        @Override // com.xiaomi.hm.health.ui.BLEStatueListenerAdapter, com.xiaomi.hm.health.ui.BTStatusFragment.BLEStatueListener
        public void onEnableChange(boolean z) {
            this.a.setBottomAreaVisible(false);
            EventRemindActivity.this.findViewById(R.id.mask_view).setVisibility(z ? 8 : 0);
        }
    }

    public class f extends HMCallback<ArrayList<HMReminderInfo>> {
        public f() {
        }

        @Override // com.xiaomi.hm.health.bt.device.HMCallback
        public void onFinish(ArrayList<HMReminderInfo> arrayList) {
            super.onFinish(arrayList);
            StringBuilder sb = new StringBuilder();
            sb.append("remindersEventRemind: ");
            sb.append(arrayList != null ? Arrays.toString(arrayList.toArray()) : "null");
            HMLog.i(EventRemindActivity.I, sb.toString(), new Object[0]);
            EventRemindManager.updateEventFromDevice(arrayList);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void E(List<Object> list) {
        List<ComparableReminder> todayReminders = this.E.getTodayReminders();
        if (todayReminders.size() != 0) {
            list.add(getString(R.string.event_remind_today, new Object[]{Integer.valueOf(todayReminders.size())}));
            list.addAll(todayReminders);
        }
        List<ComparableReminder> tomorrowReminders = this.E.getTomorrowReminders();
        if (tomorrowReminders.size() != 0) {
            list.add(getString(R.string.event_remind_tomorrow, new Object[]{Integer.valueOf(tomorrowReminders.size())}));
            list.addAll(tomorrowReminders);
        }
        List<ComparableReminder> laterReminders = this.E.getLaterReminders();
        if (laterReminders.size() != 0) {
            list.add(getString(R.string.event_remind_later, new Object[]{Integer.valueOf(laterReminders.size())}));
            list.addAll(laterReminders);
        }
    }

    private void F() {
        Observable.create(new Action1() { // from class: at1
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                this.a.I((Emitter) obj);
            }
        }, Emitter.BackpressureMode.BUFFER).compose(RxUtil.computationToMain()).subscribe(new Action1() { // from class: ys1
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                this.a.J((Boolean) obj);
            }
        }, new Action1() { // from class: bt1
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                EventRemindActivity.L((Throwable) obj);
            }
        });
    }

    private void G() {
        SmartRefreshLayout smartRefreshLayout = (SmartRefreshLayout) findViewById(R.id.load_more_layout);
        this.C = smartRefreshLayout;
        smartRefreshLayout.setEnableRefresh(false);
        this.C.setEnableLoadmore(true);
        this.C.setEnableLoadmoreWhenContentNotFull(true);
        this.C.setEnableAutoLoadmore(true);
        ClassicsFooter.REFRESH_FOOTER_PULLUP = getString(R.string.label_pull_to_load);
        ClassicsFooter.REFRESH_FOOTER_RELEASE = getString(R.string.label_release_to_load);
        ClassicsFooter.REFRESH_FOOTER_LOADING = getString(R.string.setting_dev_loading);
        ClassicsFooter.REFRESH_FOOTER_REFRESHING = getString(R.string.label_refreshing);
        ClassicsFooter.REFRESH_FOOTER_FINISH = getString(R.string.load_success);
        ClassicsFooter.REFRESH_FOOTER_FAILED = getString(R.string.load_fail);
        ClassicsFooter.REFRESH_FOOTER_ALLLOADED = getString(R.string.label_all_data_loaded);
        this.C.setRefreshFooter((RefreshFooter) new ClassicsFooter(this).setSpinnerStyle(SpinnerStyle.Translate));
        this.C.setOnRefreshLoadmoreListener((OnRefreshLoadmoreListener) new d());
    }

    private void H() {
        BTStatusFragment bTStatusFragmentNewInstance = BTStatusFragment.newInstance(R.id.container, getSupportFragmentManager());
        bTStatusFragmentNewInstance.setBLEStatusListener(new e(bTStatusFragmentNewInstance));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void I(Emitter emitter) {
        List<ComparableReminder> listV = this.D.v();
        if (listV.size() == 0) {
            emitter.onNext(Boolean.TRUE);
        } else {
            this.E.categorizeReminders(listV);
            emitter.onNext(Boolean.FALSE);
        }
        emitter.onCompleted();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void J(Boolean bool) {
        if (bool.booleanValue()) {
            this.z.setVisibility(0);
            this.z.setEnabled(false);
            this.A.setVisibility(8);
            this.y.setVisibility(0);
            findViewById(R.id.empty_tv).setVisibility(0);
            this.B.setVisibility(8);
            W();
            return;
        }
        findViewById(R.id.empty_tv).setVisibility(8);
        this.B.setVisibility(0);
        this.z.setEnabled(true);
        if (this.D.getState() == EventRemindAdapter.State.SHOW) {
            this.z.setVisibility(8);
            this.y.setVisibility(8);
            this.x.setVisibility(8);
            this.A.setVisibility(0);
        } else if (this.D.getState() == EventRemindAdapter.State.NORMAL) {
            this.z.setVisibility(0);
            this.y.setVisibility(0);
            this.A.setVisibility(8);
            W();
        }
        ArrayList arrayList = new ArrayList();
        E(arrayList);
        List<ComparableReminder> endedReminders = this.E.getEndedReminders();
        this.H = endedReminders.size();
        if (endedReminders.size() != 0) {
            arrayList.add(getString(R.string.event_remind_ended, new Object[]{Integer.valueOf(EventRemindManager.n())}));
            arrayList.addAll(endedReminders);
        }
        this.D.getData().clear();
        this.D.addData((Collection) arrayList);
        this.D.notifyDataSetChanged();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String K() {
        return "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void L(Throwable th) {
        HMLog.error(I, "", th, new Function0() { // from class: xs1
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object getA() {
                return EventRemindActivity.K();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void M(long j) {
        HMLog.i(I, "delete item: " + j, new Object[0]);
        F();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void N(View view) {
        Analytics.recordEvent(new CountEventBuilder(com.xiaomi.hm.health.ui.smartplay.eventremind.a.b).setValue("Edit"));
        this.D.setState(EventRemindAdapter.State.NORMAL2SHOW);
        this.x.setVisibility(8);
        this.z.setVisibility(8);
        this.y.setVisibility(8);
        this.A.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void O(View view) {
        Analytics.recordEvent(new CountEventBuilder(com.xiaomi.hm.health.ui.smartplay.eventremind.a.b).setValue("Add"));
        if (this.E.getEnableIndex() == -1) {
            IconToast.showError(this, R.string.event_remind_full);
            HMLog.i(I, "cannot create new event as no available id.", new Object[0]);
        } else {
            startActivity(new Intent(this, (Class<?>) SetEventActivity.class));
            V();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void P(View view) {
        this.D.setState(EventRemindAdapter.State.SHOW2NORMAL);
        W();
        this.z.setVisibility(0);
        this.y.setVisibility(0);
        this.A.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void Q(Emitter emitter) {
        this.E.categorizeReminders(EventRemindManager.getReminders());
        emitter.onCompleted();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void R() {
        this.D.setState(EventRemindAdapter.State.NORMAL);
        W();
        this.z.setVisibility(0);
        this.y.setVisibility(0);
        this.A.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void S() {
        if (this.H < EventRemindManager.n()) {
            HMLog.d(I, "load local data.", new Object[0]);
            U(false);
        } else {
            HMLog.d(I, "load server data.", new Object[0]);
            EventRemindManager.C(20, false).compose(RxUtil.ioToMain()).subscribe(new c());
        }
    }

    private void T() {
        HMBaseDevice device;
        if (ConfigHelperKt.hasMiliFeature(Feature.SUPPORT_CHANGE_REMINDER_ON_DEVICE) && (device = this.F.getValue().getDevice(HMDeviceType.MILI)) != null && device.isConnected() && (device instanceof HMMiLiProDevice)) {
            ((HMMiLiProDevice) device).getReminders(new f());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void U(boolean z) {
        Observable.create(new Action1() { // from class: zs1
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                this.a.Q((Emitter) obj);
            }
        }, Emitter.BackpressureMode.BUFFER).compose(RxUtil.computationToMain()).subscribe(new b(z));
    }

    private void W() {
        this.x.setVisibility(8);
    }

    private void initTitle() {
        setContentView(R.layout.activity_event_remind);
        String string = getString(ConfigHelperKt.hasMiliFeature(Feature.SUPPORT_EVENT_REMIND_NEW_NAME) ? R.string.schedule : R.string.event_remind_title);
        if (GlobalConfig.get().isBuildMidong()) {
            EventReminderExpandKt.setUnifyTitleStyle(this, BaseTitleActivity.STYLE.BACK_AND_TITLE, string, null);
        } else {
            setStyle(BaseTitleActivity.STYLE.BACK_AND_TITLE, ContextCompat.getColor(this, R.color.pale_grey), string, true);
            getTitleTextView().setTextColor(ContextCompat.getColor(this, R.color.black70));
        }
    }

    private void initViews() {
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.event_list);
        this.B = recyclerView;
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        this.B.setLayoutManager(new LinearLayoutManager(this));
        EventRemindAdapter eventRemindAdapter = new EventRemindAdapter(new EventRemindAdapter.DeleteItemListener() { // from class: vs1
            @Override // com.xiaomi.hm.health.ui.smartplay.eventremind.EventRemindAdapter.DeleteItemListener
            public final void delete(long j) {
                this.a.M(j);
            }
        });
        this.D = eventRemindAdapter;
        eventRemindAdapter.bindToRecyclerView(this.B);
        G();
        this.x = (TextView) findViewById(R.id.vibrate_tv);
        this.y = (TextView) findViewById(R.id.add_event_tv);
        this.z = (TextView) findViewById(R.id.edit_event_tv);
        this.A = (TextView) findViewById(R.id.done_event_tv);
        this.z.setOnClickListener(new View.OnClickListener() { // from class: ss1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.N(view);
            }
        });
        this.y.setOnClickListener(new View.OnClickListener() { // from class: us1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.O(view);
            }
        });
        this.A.setOnClickListener(new View.OnClickListener() { // from class: ts1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.P(view);
            }
        });
        if (ConfigHelperKt.hasMiliFeature(Feature.SUPPORT_EVENT_REMIND_NEW_NAME)) {
            ((TextView) findViewById(R.id.empty_tv)).setText(R.string.add_schedule_tip);
        }
    }

    public void V() {
        this.z.postDelayed(new Runnable() { // from class: ws1
            @Override // java.lang.Runnable
            public final void run() {
                this.a.R();
            }
        }, 1000L);
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        setTheme(R.style.Theme_App_Zepp);
        super.onCreate(bundle);
        initTitle();
        H();
        initViews();
        EventBus.getDefault().register(this);
        EventRemindAPI.getInstance().setHasMore(true);
        updateItems(true);
        if (EventRemindManager.s() < 20) {
            EventRemindManager.C(20, true).compose(RxUtil.ioToMain()).subscribe(new a());
        } else {
            EventRemindManager.readRemindersFromDevice();
        }
        EventRemindManager.H();
        EventRemindManager.l();
        this.x.setVisibility(8);
        Analytics.recordEvent(new CountEventBuilder(com.xiaomi.hm.health.ui.smartplay.eventremind.a.a));
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        EventBus.getDefault().unregister(this);
    }

    public void onEventMainThread(ReminderChangedEvent reminderChangedEvent) {
        if (reminderChangedEvent.isFromDevice()) {
            U(true);
        }
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity
    public void onRightFuncClicked() {
        this.G.getValue().addReminderToMyTools();
        CustomToast.showShort(getApplicationContext(), R.string.tool_add_success);
        showRightFunc(false);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
        this.D.setState(EventRemindAdapter.State.NORMAL);
        this.A.setVisibility(8);
        this.z.setVisibility(0);
        this.y.setVisibility(0);
        if (EventRemindManager.s() == 0) {
            this.z.setEnabled(false);
        } else {
            this.z.setEnabled(true);
        }
    }

    public void updateItems(boolean z) {
        if (EventRemindManager.s() != 0) {
            this.z.setEnabled(true);
            findViewById(R.id.empty_tv).setVisibility(8);
            this.B.setVisibility(0);
            U(z);
            return;
        }
        this.z.setEnabled(false);
        findViewById(R.id.empty_tv).setVisibility(0);
        this.B.setVisibility(8);
        if (z) {
            return;
        }
        this.C.setLoadmoreFinished(true);
        this.C.setEnableLoadmore(false);
    }

    public void onEventMainThread(ReminderModifiedEvent reminderModifiedEvent) {
        for (ComparableReminder comparableReminder : reminderModifiedEvent.reminders) {
            HMLog.i(I, "modified: " + comparableReminder.getReminder().getTime(), new Object[0]);
            this.D.insertOrReplace(comparableReminder);
        }
        F();
    }
}

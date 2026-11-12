package com.xiaomi.hm.health.ui.smartplay;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.ColorRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.StringRes;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.huami.device.feature.notification.appnotify.NotificationManager;
import com.huami.device.feature.unlock.MiuiUnlockAPI;
import com.huami.devicex.funapi.ManagerFunctionsKt;
import com.huami.mifit.analytics.Analytics;
import com.huami.tools.log.HMLog;
import com.huami.view.basetitle.BaseTitleActivity;
import com.huami.watch.hmwatchmanager.R;
import com.xiaomi.hm.health.baseui.GlobalTitleStyle;
import com.xiaomi.hm.health.baseutil.GlobalConfig;
import com.xiaomi.hm.health.baseutil.Language;
import com.xiaomi.hm.health.baseutil.TintUtils;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.databases.model.Reminder;
import com.xiaomi.hm.health.device.HMDeviceConfig;
import com.xiaomi.hm.health.device.HMDeviceManager;
import com.xiaomi.hm.health.device.HMDeviceUtils;
import com.xiaomi.hm.health.device.alarm.AlarmClockManager;
import com.xiaomi.hm.health.device.deviceconfig.Feature;
import com.xiaomi.hm.health.device.deviceconfig.configs.ConfigHelperKt;
import com.xiaomi.hm.health.device.deviceproperty.HMDevicePropertyCache;
import com.xiaomi.hm.health.device.event.StatEvent;
import com.xiaomi.hm.health.model.account.HMMiliConfig;
import com.xiaomi.hm.health.model.account.HMPersonInfo;
import com.xiaomi.hm.health.ui.smartplay.eventremind.EventRemindActivity;
import com.xiaomi.hm.health.ui.smartplay.eventremind.EventRemindManager;
import com.xiaomi.hm.health.ui.smartplay.eventremind.ReminderChangedEvent;
import com.xiaomi.hm.health.ui.smartplay.logsit.LongSitAlertActivity;
import com.xiaomi.hm.health.ui.smartplay.logsit.LongSitLogicKt;
import com.xiaomi.hm.health.ui.smartplay.logsit.LongSitMode;
import de.greenrobot.event.EventBus;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
public class AlertListActivityNew extends BaseTitleActivity {
    private static final String C = "AlertListActivityNew";
    private static final int D = 1;
    private static final int E = 2;
    private static final int F = 4;
    private static final int G = 8;
    private static final int H = -1;
    private static final int I = 0;
    private static final int J = 1;
    private static final int K = 2;
    private static final int L = 3;
    private static final int M = 4;
    private static final int N = 5;
    private static final int O = 6;
    private static final int P = 7;
    private static final int Q = 8;
    private static final int R = 9;
    private static final int S = 10;
    private static final int T = 15;
    private static final String U = "tag::hide::reminder";
    private static final String V = "tag::hide::alarm";
    private static final String W = "tag::hide::lock";
    private static final String X = "tag::hide::watch::alarm";
    private static boolean Y = true;
    private HMMiliConfig A;
    private final Context B = this;
    private SparseArray<a> x;
    private b y;
    private HMPersonInfo z;

    public static class a {
        public int a;
        public int b;

        @StringRes
        public int c;

        @DrawableRes
        public int d;

        @ColorRes
        public int e;
        public boolean f = false;
        public String g;
        public Class<?> h;

        public a(int id, @StringRes int title, @DrawableRes int icon, @ColorRes int color, Class<?> cla) {
            this.b = id;
            this.c = title;
            this.d = icon;
            this.h = cla;
            this.e = color;
        }
    }

    public class b extends RecyclerView.Adapter<c> {
        public static final int e = 1;
        public static final int f = 2;
        private SparseArray<a> a;
        private final boolean b = MiuiAPI.getInstance().isSupportMiuiNotifyInternal();
        private final boolean c = HMDeviceConfig.hasFeatureProDevice();

        public b(SparseArray<a> items) {
            this.a = items;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(c holder, int position) {
            if (holder.getItemViewType() == 1) {
                holder.a(this.a.get(AlertListActivityNew.this.x.keyAt(position)));
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        @NonNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public c onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            HMLog.d(AlertListActivityNew.C, "view type:" + viewType, new Object[0]);
            if (viewType == 1) {
                return AlertListActivityNew.this.new c(AlertListActivityNew.this.getLayoutInflater().inflate(R.layout.item_alert_list, parent, false), 1);
            }
            return AlertListActivityNew.this.new c(new View(AlertListActivityNew.this), 2);
        }

        public void c(SparseArray<a> items) {
            this.a = items;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: getItemCount */
        public int getA() {
            return this.a.size();
        }

        /* JADX WARN: Code duplicated, block: B:15:0x002f  */
        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemViewType(int position) {
            boolean z;
            int iKeyAt = AlertListActivityNew.this.x.keyAt(position);
            int i = this.a.get(iKeyAt).a;
            if (((this.b ? 4 : 8) & i) <= 0) {
                z = false;
            } else {
                if ((i & (this.c ? 2 : 1)) > 0) {
                    z = true;
                } else {
                    z = false;
                }
            }
            if (this.a.get(iKeyAt).b == 8 && HMDeviceSource.MILI_AMAZFIT == HMDeviceManager.getInstance().getBoundDeviceSource(HMDeviceType.MILI)) {
                z = true;
            }
            return z ? 1 : 2;
        }
    }

    public class c extends RecyclerView.ViewHolder implements View.OnClickListener {
        public ImageView a;
        public TextView b;
        public TextView c;
        public TextView d;
        public a e;

        public c(View itemView, int type) {
            super(itemView);
            if (type == 1) {
                itemView.setOnClickListener(this);
                this.a = (ImageView) itemView.findViewById(R.id.alert_list_item_logo);
                this.b = (TextView) itemView.findViewById(R.id.alert_list_item_text);
                this.c = (TextView) itemView.findViewById(R.id.alert_list_item_status);
                this.d = (TextView) itemView.findViewById(R.id.alert_list_item_summary);
            }
        }

        public void a(a item) {
            this.e = item;
            this.a.setImageResource(item.d);
            if (!GlobalConfig.get().isBuildMidong()) {
                TintUtils.tintDrawable(this.a, ContextCompat.getColor(AlertListActivityNew.this.B, item.e));
            }
            this.b.setText(item.c);
            this.c.setText(item.g);
            this.d.setVisibility(item.f ? 0 : 8);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
            Intent intent = new Intent(AlertListActivityNew.this, this.e.h);
            if (this.e.h == AppNotificationAlertActivity.class) {
                intent.putExtra("deviceType", HMDeviceType.MILI.getValue());
            }
            AlertListActivityNew.this.startActivityForResult(intent, this.e.b);
            AlertListActivityNew.this.o(this.e.h);
        }
    }

    private String A(boolean enable) {
        return getString(enable ? R.string.alert_enable : R.string.alert_disable);
    }

    private String B(int id) {
        switch (id) {
            case 0:
                return z();
            case 1:
                return u();
            case 2:
                return s();
            case 3:
                return w();
            case 4:
                return p();
            case 5:
                return v();
            case 6:
                return y();
            case 7:
                return x();
            case 8:
                return t();
            case 9:
                return q();
            case 10:
                return r();
            default:
                return "";
        }
    }

    private void C() {
        this.x = new SparseArray<>();
        if (E(W)) {
            a aVar = new a(0, R.string.screen_unlock, R.drawable.icon_screen_unlock, R.color.dark_sky_blue_three, ScreenUnlockActivity.class);
            aVar.a = 15;
            aVar.g = z();
            this.x.put(aVar.b, aVar);
        }
        if (!H()) {
            a aVar2 = new a(1, R.string.incoming_call_alert, R.drawable.incoming_call_alert_icon, R.color.bf3_list_health, IncomingCallAlertActivity.class);
            aVar2.a = 15;
            aVar2.g = u();
            this.x.put(aVar2.b, aVar2);
        }
        if (E(X)) {
            a aVar3 = new a(3, HMDeviceConfig.hasBoundWatch() ? R.string.chaohu_alarm : R.string.mi_band_alarm, R.drawable.mi_band_alarm_icon, R.color.bf3_list_not_stand, AlarmClockManager.isSupportAlarmModule() ? HuamiOSAlarmActivity.class : MiBandAlarmActivity.class);
            aVar3.a = G() ? 15 : 0;
            aVar3.g = w();
            this.x.put(aVar3.b, aVar3);
        }
        a aVar4 = new a(4, R.string.app_notification_alert, R.drawable.app_notification_alert_icon, R.color.item_app_notify, AppNotificationAlertActivity.class);
        aVar4.a = 15;
        aVar4.g = p();
        this.x.put(aVar4.b, aVar4);
        LongSitMode longSitMode = LongSitLogicKt.getLongSitMode(ManagerFunctionsKt.getDeviceManagerApi().getBoundDeviceSource(HMDeviceType.MILI));
        a aVar5 = new a(5, longSitMode.isLongSit() ? R.string.long_sit_alert : R.string.stand_alert, longSitMode.isLongSit() ? R.drawable.long_sit_alert_icon : R.drawable.stand_up_alert_icon, R.color.item_long_sit, LongSitAlertActivity.class);
        aVar5.a = 14;
        aVar5.g = v();
        this.x.put(aVar5.b, aVar5);
        a aVar6 = new a(6, R.string.sm_alert, R.drawable.sm_alert_icon, R.color.bf3_list_attention, SMAlertByNotificationActivity.class);
        aVar6.a = 15;
        aVar6.g = y();
        this.x.put(aVar6.b, aVar6);
        if (E(V)) {
            a aVar7 = new a(7, R.string.phone_alarm, R.drawable.icon_phone_alarm, R.color.dark_sky_blue_three, PhoneAlarmActivity.class);
            aVar7.a = 7;
            aVar7.g = x();
            this.x.put(aVar7.b, aVar7);
        }
        a aVar8 = new a(8, R.string.reach_goal, R.drawable.reach_goal_alert_icon, R.color.item_reach_goal, ReachGoalRemindActivity.class);
        aVar8.a = 14;
        aVar8.g = t();
        this.x.put(aVar8.b, aVar8);
        if (HMDeviceConfig.hasFeatureDNDDevice()) {
            a aVar9 = new a(9, R.string.avoid_disturb_tips, R.drawable.icon_unbother, R.color.item_long_sit, AvoidDisturbActivity.class);
            aVar9.a = 14;
            aVar9.g = q();
            this.x.put(aVar9.b, aVar9);
        }
        if (HMDeviceConfig.hasFeatureDisconnectRemindDevice()) {
            a aVar10 = new a(10, R.string.dis_notify, R.drawable.anti_theft_icon, R.color.bf3_list_attention, DisconnectRemindActivity.class);
            aVar10.a = 14;
            aVar10.g = r();
            this.x.put(aVar10.b, aVar10);
        }
        if (E(U)) {
            boolean zHasMiliFeature = ConfigHelperKt.hasMiliFeature(Feature.SUPPORT_EVENT_REMIND_NEW_NAME);
            if (HMDeviceConfig.hasFeatureReminderDevice()) {
                a aVar11 = new a(2, zHasMiliFeature ? R.string.schedule : R.string.event_remind_title, R.drawable.icon_event_remind, R.color.event_remind_icon_color, EventRemindActivity.class);
                aVar11.a = 14;
                aVar11.g = s();
                this.x.put(aVar11.b, aVar11);
            }
        }
    }

    private boolean D() {
        String boundDeviceAddress = HMDeviceManager.getInstance().getBoundDeviceAddress(HMDeviceType.MILI);
        if (TextUtils.isEmpty(boundDeviceAddress)) {
            return false;
        }
        return MiuiUnlockAPI.isUnlockEnabled(this, boundDeviceAddress);
    }

    private boolean E(@NonNull String key) {
        Bundle extras;
        if (getIntent() == null || (extras = getIntent().getExtras()) == null) {
            return true;
        }
        return !extras.getBoolean(key, false);
    }

    private void F() {
        HMPersonInfo hMPersonInfo = HMPersonInfo.getInstance();
        this.z = hMPersonInfo;
        this.A = hMPersonInfo.getMiliConfig();
    }

    private boolean G() {
        return HMDeviceManager.getInstance().getBoundDeviceSource(HMDeviceType.MILI) != HMDeviceSource.MILI_ANETO;
    }

    private boolean H() {
        return HMDevicePropertyCache.getInstance().getMiliFeature().hasSw(20);
    }

    private void I() {
        HMMiliConfig miliConfig = this.z.getMiliConfig();
        boolean zD = D();
        if (miliConfig.getScreenLock() != zD) {
            miliConfig.setScreenLock(zD ? 1 : 0);
            this.z.saveInfo(2);
        }
        if (E(W)) {
            J(0);
        }
        if (zD || !miliConfig.isAlarmNotifyEnabled()) {
            return;
        }
        miliConfig.setAlarmNotifyEnabled(false);
        this.z.saveInfo(2);
        J(7);
    }

    private void J(int id) {
        String strB = B(id);
        a aVar = this.x.get(id);
        if (aVar != null) {
            aVar.g = strB;
            this.y.c(this.x);
            this.y.notifyItemChanged(this.x.indexOfValue(aVar));
        }
    }

    @NotNull
    public static Bundle createHideBundle() {
        Bundle bundle = new Bundle();
        bundle.putBoolean(U, Y);
        bundle.putBoolean(V, Y);
        bundle.putBoolean(W, Y);
        bundle.putBoolean(X, Y);
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o(Class<?> cls) {
        String simpleName = cls.getSimpleName();
        if (simpleName.equals("AppNotificationAlertActivity")) {
            Analytics.event(this, StatEvent.EventId.REMIND_OUT, StatEvent.EventParams.REMIND_OUT_LISTAPPPUSHDETAIL);
            return;
        }
        if (simpleName.equals("IncomingCallAlertActivity")) {
            Analytics.event(this, StatEvent.EventId.REMIND_OUT, StatEvent.EventParams.REMIND_OUT_LISTCALLDETAIL);
            return;
        }
        if (simpleName.equals("ReachGoalRemindActivity")) {
            Analytics.event(this, StatEvent.EventId.REMIND_OUT, "GoalsRemind");
            return;
        }
        if (simpleName.equals("SMAlertActivity")) {
            Analytics.event(this, StatEvent.EventId.REMIND_OUT, StatEvent.EventParams.REMIND_OUT_LISTSMSDETAIL);
            return;
        }
        if (simpleName.equals("LongSitAlertActivity")) {
            Analytics.event(this, StatEvent.EventId.REMIND_OUT, "SittingRemind");
            return;
        }
        if (simpleName.equals("MiBandAlarmActivity")) {
            Analytics.event(this, StatEvent.EventId.REMIND_OUT, StatEvent.EventParams.REMIND_OUT_LISTBANDCLOCKDETAIL);
        } else if (simpleName.equals("AvoidDisturbActivity")) {
            Analytics.event(this, StatEvent.EventId.REMIND_OUT, StatEvent.EventParams.REMIND_OUT_NODISTURB);
        } else if (simpleName.equals("PhoneAlarmActivity")) {
            Analytics.event(this, StatEvent.EventId.REMIND_OUT, StatEvent.EventParams.REMIND_OUT_LISTPHONECLOCKDETAIL);
        }
    }

    private String p() {
        return A(NotificationManager.getInstance().getAppsRepo().isNotificationOn());
    }

    private String q() {
        return A(HMDeviceUtils.fromSilentConfig(this.A.getQuietMode()).isEnable());
    }

    private String r() {
        return A(HMDeviceUtils.fromDisconnectRemindConfigString(this.A.getDisconnectRemind()).isEnable());
    }

    private String s() {
        List<Reminder> enableReminders = EventRemindManager.getEnableReminders();
        if (enableReminders != null && enableReminders.size() != 0) {
            return getResources().getQuantityString(R.plurals.event_remind_count, enableReminders.size(), Integer.valueOf(enableReminders.size()));
        }
        if (Language.isSpainish()) {
            return getResources().getQuantityString(R.plurals.event_remind_count, 0, 0);
        }
        return getString(ConfigHelperKt.hasMiliFeature(Feature.SUPPORT_EVENT_REMIND_NEW_NAME) ? R.string.schedule_null : R.string.event_remind_close);
    }

    private String t() {
        return A(this.A.isGoalRemind());
    }

    private String u() {
        boolean zIsInComingCallEnabled = this.A.isInComingCallEnabled();
        boolean zIsPhoneNotifyDelayEnable = this.A.isPhoneNotifyDelayEnable();
        if (!zIsInComingCallEnabled) {
            return getString(R.string.alert_disable);
        }
        if (!zIsPhoneNotifyDelayEnable) {
            return getString(R.string.alert_enable);
        }
        int inComingCallNotifyTime = this.A.getInComingCallNotifyTime();
        return String.format(getString(R.string.incoming_call_alert_tips), inComingCallNotifyTime + "");
    }

    private String v() {
        return A(HMDeviceUtils.fromSedentaryConfig(this.A.getSedentaryRemind()).isEnable());
    }

    private String w() {
        int enableAlarmSize = AlarmClockManager.getInstance().getEnableAlarmSize();
        if (enableAlarmSize <= 0) {
            return getString(R.string.alert_disable);
        }
        return String.format(getString(R.string.enabled_alarms), enableAlarmSize + "");
    }

    private String x() {
        return A(this.A.isAlarmNotifyEnabled());
    }

    private String y() {
        return A(this.A.isSmsNotifyEnabled());
    }

    private String z() {
        return getString(D() ? R.string.alert_enable : R.string.alert_disable);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, android.app.Activity
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        F();
        J(requestCode);
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        setTheme(2132017904);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alert_list);
        GlobalTitleStyle.setUnifyTitleStyle(this, getString(R.string.push_and_alert));
        NotificationManager.getInstance().getAppsRepo().setCurrentDeviceType(HMDeviceType.MILI);
        HMPersonInfo hMPersonInfo = HMPersonInfo.getInstance();
        this.z = hMPersonInfo;
        this.A = hMPersonInfo.getMiliConfig();
        C();
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.alert_list);
        recyclerView.setHasFixedSize(false);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        b bVar = new b(this.x);
        this.y = bVar;
        recyclerView.setAdapter(bVar);
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        EventBus.getDefault().unregister(this);
    }

    public void onEventMainThread(ReminderChangedEvent event) {
        if (event.isFromDevice()) {
            J(2);
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
        I();
        Analytics.event(this, StatEvent.EventId.REMIND_VIEW_NUM);
    }

    public static Bundle createHideBundle(boolean reminderHide, boolean alarmHide, boolean smartLockHide, boolean watchAlarmHide) {
        Bundle bundle = new Bundle();
        bundle.putBoolean(U, reminderHide);
        bundle.putBoolean(V, alarmHide);
        bundle.putBoolean(W, smartLockHide);
        bundle.putBoolean(X, watchAlarmHide);
        bundle.putBoolean(X, watchAlarmHide);
        return bundle;
    }
}

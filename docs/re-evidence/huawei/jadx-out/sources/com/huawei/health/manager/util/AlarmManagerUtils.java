package com.huawei.health.manager.util;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import androidx.core.app.NotificationCompat;
import com.huawei.health.manager.DaemonService;
import com.huawei.health.manager.powerkit.PowerKitManager;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.xjk;
import health.compact.a.EnvironmentInfo;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class AlarmManagerUtils {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f8130a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final StateHandleBean f8131b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private AlarmManager f8132c;
    private final boolean d;
    private Context e;
    private final StateHandleBean g;
    private int j;

    public enum SportTypeUtils {
        STATE_IDLE,
        STATE_ENTER_RUNNING,
        STATE_EXIT_RUNNING,
        STATE_ENTER_BICYCLE,
        STATE_EXIT_BICYCLE,
        STATE_ENTER_WALKING,
        STATE_EXIT_WALKING
    }

    public AlarmManagerUtils(Context context) {
        this.f8132c = null;
        this.e = null;
        StateHandleBean stateHandleBean = new StateHandleBean(257);
        this.g = stateHandleBean;
        StateHandleBean stateHandleBean2 = new StateHandleBean(258);
        this.f8131b = stateHandleBean2;
        this.j = 180;
        this.d = EnvironmentInfo.l();
        this.f8130a = false;
        if (context != null) {
            this.e = context;
            Object systemService = context.getSystemService(NotificationCompat.CATEGORY_ALARM);
            if (!(systemService instanceof AlarmManager)) {
                LogUtil.a("Track_AlarmManagerUtils", "object is not instance of AlarmManager");
                return;
            }
            this.f8132c = (AlarmManager) systemService;
            stateHandleBean2.d(context);
            stateHandleBean.d(context);
        }
    }

    public void b(SportTypeUtils sportTypeUtils) {
        StateHandleBean stateHandleBean;
        if (sportTypeUtils == SportTypeUtils.STATE_ENTER_RUNNING || sportTypeUtils == SportTypeUtils.STATE_EXIT_RUNNING) {
            stateHandleBean = this.f8131b;
        } else if (sportTypeUtils != SportTypeUtils.STATE_ENTER_WALKING && sportTypeUtils != SportTypeUtils.STATE_EXIT_WALKING) {
            return;
        } else {
            stateHandleBean = this.g;
        }
        if (stateHandleBean.a() == stateHandleBean.d()) {
            if (stateHandleBean.b() < SystemClock.elapsedRealtime()) {
                stateHandleBean.a(SportTypeUtils.STATE_IDLE);
                LogUtil.a("Track_AlarmManagerUtils", "I have deal exit cmd enter idle");
            }
        }
        LogUtil.a("Track_AlarmManagerUtils", "setCurrentSportType cur ", stateHandleBean.a(), " new ", sportTypeUtils);
        if (stateHandleBean.a() == SportTypeUtils.STATE_IDLE && sportTypeUtils != stateHandleBean.c()) {
            LogUtil.a("Track_AlarmManagerUtils", "idle now only support running or walking");
        } else {
            b(stateHandleBean, sportTypeUtils);
        }
    }

    private void b(StateHandleBean stateHandleBean, SportTypeUtils sportTypeUtils) {
        LogUtil.a("Track_AlarmManagerUtils", "handleCurrentSportType mCurrentSportType is ", stateHandleBean.a());
        if (stateHandleBean.a() == SportTypeUtils.STATE_IDLE) {
            e(stateHandleBean, sportTypeUtils);
        } else if (stateHandleBean.a() == stateHandleBean.c()) {
            e(stateHandleBean, true, sportTypeUtils);
        } else if (stateHandleBean.a() == stateHandleBean.d()) {
            e(stateHandleBean, false, sportTypeUtils);
        }
    }

    private void e(StateHandleBean stateHandleBean, boolean z, SportTypeUtils sportTypeUtils) {
        LogUtil.a("Track_AlarmManagerUtils", "handleNewState sportType is ", sportTypeUtils, "isEnter is", Boolean.valueOf(z));
        if (sportTypeUtils == stateHandleBean.c()) {
            if (z) {
                c(sportTypeUtils);
                return;
            } else {
                c(stateHandleBean, sportTypeUtils);
                return;
            }
        }
        if (sportTypeUtils == stateHandleBean.d() && z) {
            d(stateHandleBean, sportTypeUtils);
        }
    }

    private void c(StateHandleBean stateHandleBean, SportTypeUtils sportTypeUtils) {
        LogUtil.a("Track_AlarmManagerUtils", "handExitStateEnter sportType is ", sportTypeUtils);
        b(sportTypeUtils, stateHandleBean);
    }

    private void e(StateHandleBean stateHandleBean, SportTypeUtils sportTypeUtils) {
        LogUtil.a("Track_AlarmManagerUtils", "handleStateIdle sportType is ", sportTypeUtils);
        b(sportTypeUtils, stateHandleBean);
    }

    private void d(StateHandleBean stateHandleBean, SportTypeUtils sportTypeUtils) {
        b(sportTypeUtils, stateHandleBean);
    }

    private void c(SportTypeUtils sportTypeUtils) {
        LogUtil.a("Track_AlarmManagerUtils", "handleEnterStateEnter sportType is", sportTypeUtils);
    }

    private void b(SportTypeUtils sportTypeUtils, StateHandleBean stateHandleBean) {
        stateHandleBean.d(sportTypeUtils);
        LogUtil.a("Track_AlarmManagerUtils", "sendBroadcast mNewSportType is ", sportTypeUtils);
        if (sportTypeUtils == stateHandleBean.c()) {
            e(stateHandleBean, stateHandleBean.h() * 1000);
        } else if (sportTypeUtils == stateHandleBean.d()) {
            a(stateHandleBean, stateHandleBean.f() * 1000);
        } else {
            LogUtil.a("Track_AlarmManagerUtils", "sportType have no match");
        }
    }

    public void d(int i, int i2) {
        this.f8131b.a(i);
        this.f8131b.d(i2);
    }

    /* JADX WARN: Code duplicated, block: B:9:0x004c  */
    private void e(StateHandleBean stateHandleBean, int i) {
        boolean z;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        List<String> listSingletonList = Collections.singletonList(stateHandleBean.n());
        if (stateHandleBean.a() == stateHandleBean.d()) {
            if (stateHandleBean.b() > jElapsedRealtime) {
                LogUtil.a("Track_AlarmManagerUtils", "cancel stop ", Long.valueOf(stateHandleBean.b()), " current ", Long.valueOf(jElapsedRealtime));
                a(listSingletonList);
                c(stateHandleBean);
                stateHandleBean.d(0L);
                z = false;
            } else {
                z = true;
            }
        } else if (stateHandleBean.a() == SportTypeUtils.STATE_IDLE) {
            z = true;
        } else {
            LogUtil.a("Track_AlarmManagerUtils", "mCurrentSportType have no match");
            z = false;
        }
        LogUtil.a("Track_AlarmManagerUtils", "sendStartBroadcast needSetAlarm ", Boolean.valueOf(z));
        if (z) {
            LogUtil.a("Track_AlarmManagerUtils", "sendStartBroadcast mNewSportType ", stateHandleBean.i());
            this.f8130a = false;
            long j = jElapsedRealtime + ((long) i);
            LogUtil.a("Track_AlarmManagerUtils", "sendStartBroadcast triggerAtTime ", Long.valueOf(j));
            PendingIntent pendingIntentJ = stateHandleBean.j();
            if (this.d) {
                c(listSingletonList);
                xjk.e(this.f8132c, 2, j, pendingIntentJ, "Track_AlarmManagerUtilssendStartBroadcast");
            } else {
                this.f8132c.set(2, j, pendingIntentJ);
            }
            stateHandleBean.b(j);
            stateHandleBean.a(stateHandleBean.i());
        }
    }

    private void c(List<String> list) {
        if (this.d) {
            ReleaseLogUtil.d("Track_AlarmManagerUtils", "applyForAlarmExemption actions ", list);
            PowerKitManager.a().e(list);
        }
    }

    private void a(List<String> list) {
        if (this.d) {
            ReleaseLogUtil.d("Track_AlarmManagerUtils", "unapplyForAlarmExemption actions ", list);
            PowerKitManager.a().b(list);
        }
    }

    private void a(StateHandleBean stateHandleBean, int i) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        List<String> listSingletonList = Collections.singletonList(stateHandleBean.l());
        if (jElapsedRealtime < stateHandleBean.e()) {
            LogUtil.a("Track_AlarmManagerUtils", "cancel start dest:  ", Long.valueOf(stateHandleBean.e()), " curr: ", Long.valueOf(jElapsedRealtime));
            a(listSingletonList);
            d(stateHandleBean);
            return;
        }
        this.f8130a = true;
        LogUtil.a("Track_AlarmManagerUtils", "sendStopBroadcast mNewSportType ", stateHandleBean.i());
        long j = jElapsedRealtime + ((long) i);
        LogUtil.a("Track_AlarmManagerUtils", "sendStopBroadcast triggerAtTime ", Long.valueOf(j));
        PendingIntent pendingIntentG = stateHandleBean.g();
        if (this.d) {
            c(listSingletonList);
            xjk.e(this.f8132c, 2, j, pendingIntentG, "Track_AlarmManagerUtilssendStopBroadcast");
        } else {
            this.f8132c.set(2, j, pendingIntentG);
        }
        stateHandleBean.d(j);
        stateHandleBean.a(stateHandleBean.i());
    }

    public void e() {
        if (this.f8130a) {
            return;
        }
        LogUtil.a("Track_AlarmManagerUtils", "heartBeatSendStopBroadcast");
        StateHandleBean stateHandleBean = this.f8131b;
        a(stateHandleBean, stateHandleBean.f() * 1000);
    }

    private void c(StateHandleBean stateHandleBean) {
        AlarmManager alarmManager = this.f8132c;
        if (alarmManager != null) {
            this.f8130a = false;
            alarmManager.cancel(stateHandleBean.g());
            LogUtil.a("Track_AlarmManagerUtils", "cancel(mStopPendingIntent)");
        }
        stateHandleBean.a(stateHandleBean.i());
    }

    private void d(StateHandleBean stateHandleBean) {
        AlarmManager alarmManager = this.f8132c;
        if (alarmManager != null) {
            alarmManager.cancel(stateHandleBean.j());
            LogUtil.a("Track_AlarmManagerUtils", "cancel(mStartWalkPendingIntent)");
        }
        stateHandleBean.a(stateHandleBean.i());
    }

    public static class StateHandleBean {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f8135c;
        private SportTypeUtils d;
        private PendingIntent f;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private SportTypeUtils f8134b = SportTypeUtils.STATE_IDLE;
        private int j = 180;
        private int g = 180;
        private PendingIntent h = null;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f8133a = 0;
        private long e = 0;

        public StateHandleBean(int i) {
            this.f8135c = i;
            o();
        }

        private void o() {
            int i = this.f8135c;
            if (i == 258) {
                this.j = 40;
            } else if (i == 257) {
                this.j = 180;
            }
        }

        public SportTypeUtils d() {
            if (this.f8135c == 258) {
                return SportTypeUtils.STATE_EXIT_RUNNING;
            }
            return SportTypeUtils.STATE_EXIT_WALKING;
        }

        public SportTypeUtils c() {
            if (this.f8135c == 258) {
                return SportTypeUtils.STATE_ENTER_RUNNING;
            }
            return SportTypeUtils.STATE_ENTER_WALKING;
        }

        public void d(Context context) {
            a(context);
            c(context);
        }

        public SportTypeUtils a() {
            return this.f8134b;
        }

        public void a(SportTypeUtils sportTypeUtils) {
            this.f8134b = sportTypeUtils;
        }

        public int h() {
            return this.j;
        }

        public void a(int i) {
            this.j = i;
        }

        public SportTypeUtils i() {
            return this.d;
        }

        public void d(SportTypeUtils sportTypeUtils) {
            this.d = sportTypeUtils;
        }

        public PendingIntent g() {
            return this.f;
        }

        public int f() {
            return this.g;
        }

        public void d(int i) {
            this.g = i;
        }

        public long b() {
            return this.f8133a;
        }

        public void d(long j) {
            this.f8133a = j;
        }

        public long e() {
            return this.e;
        }

        public void b(long j) {
            this.e = j;
        }

        public PendingIntent j() {
            return this.h;
        }

        private void a(Context context) {
            this.h = e(context, n());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public String n() {
            if (this.f8135c == 258) {
                return "SEND_START_BROADCAST";
            }
            return "SEND_START_WALK_BROADCAST";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public String l() {
            if (this.f8135c == 258) {
                return "SEND_STOP_BROADCAST";
            }
            return "SEND_STOP_WALK_BROADCAST";
        }

        private void c(Context context) {
            this.f = e(context, l());
        }

        private PendingIntent e(Context context, String str) {
            Intent intent = new Intent();
            intent.setPackage(context.getPackageName());
            intent.setClass(context, DaemonService.class);
            intent.setAction(str);
            return PendingIntent.getService(context, 0, intent, 201326592);
        }
    }
}

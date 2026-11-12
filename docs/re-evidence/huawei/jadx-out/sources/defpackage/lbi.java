package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import android.os.RemoteException;
import android.text.TextUtils;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hihealth.ICommonCallback;
import com.huawei.hihealth.model.EventTypeInfo;
import com.huawei.hihealth.model.Goal;
import com.huawei.hihealth.model.GoalInfo;
import com.huawei.hihealth.model.HealthAlarmInfo;
import com.huawei.hihealth.model.MetricGoal;
import com.huawei.hihealth.model.SampleEvent;
import com.huawei.hihealth.model.SportStatusInfo;
import com.huawei.hihealth.model.Subscriber;
import com.huawei.hihealth.model.Subscription;
import com.huawei.hwcommonmodel.application.BaseApplication;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import health.compact.a.util.LogUtil;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

/* JADX INFO: loaded from: classes2.dex */
public class lbi {
    private static Context e;
    private Timer d;

    private lbi() {
    }

    /* JADX INFO: loaded from: classes10.dex */
    static class e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final lbi f39824b = new lbi();
    }

    public static lbi a(Context context) {
        e = context;
        return e.f39824b;
    }

    public void a(Subscriber subscriber, EventTypeInfo eventTypeInfo, ICommonCallback iCommonCallback, len lenVar) throws RemoteException {
        int iB;
        int iA = a(subscriber, eventTypeInfo);
        if (iA != 0) {
            a(eventTypeInfo, subscriber, new ICommonCallback.Stub() { // from class: lbi.2
                @Override // com.huawei.hihealth.ICommonCallback
                public void onResult(int i, String str) {
                    ReleaseLogUtil.d("R_SubscribeProxy", "unsubscribe part type result ", Integer.valueOf(i));
                }
            }, (len) null);
            iCommonCallback.onResult(iA, lcr.b(iA));
            e(iA, lenVar);
            return;
        }
        int i = AnonymousClass3.f39822c[eventTypeInfo.getType().ordinal()];
        if (i != 1) {
            iB = 2;
            if (i == 2) {
                iB = a(subscriber, (HealthAlarmInfo) eventTypeInfo);
            } else if (i == 3) {
                iB = e(subscriber, (SportStatusInfo) eventTypeInfo);
            } else {
                iCommonCallback.onResult(2, lcr.b(2));
                e(2, lenVar);
            }
        } else {
            iB = b(subscriber, (GoalInfo) eventTypeInfo);
        }
        if (iB == 0) {
            ReleaseLogUtil.d("R_SubscribeProxy", "subscribe success");
            lez.h();
            ldw.getInstance(e).getDataAndReportNow();
        } else {
            ReleaseLogUtil.e("R_SubscribeProxy", "subscribe fail, delete subscribed result");
            a(eventTypeInfo, subscriber, new ICommonCallback.Stub() { // from class: lbi.1
                @Override // com.huawei.hihealth.ICommonCallback
                public void onResult(int i2, String str) {
                    ReleaseLogUtil.d("R_SubscribeProxy", "unsubscribe part type result ", Integer.valueOf(i2));
                }
            }, (len) null);
        }
        iCommonCallback.onResult(iB, lcr.b(iB));
        e(iB, lenVar);
    }

    /* JADX INFO: renamed from: lbi$3, reason: invalid class name */
    static /* synthetic */ class AnonymousClass3 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final /* synthetic */ int[] f39822c;

        static {
            int[] iArr = new int[SampleEvent.Type.values().length];
            f39822c = iArr;
            try {
                iArr[SampleEvent.Type.SCENARIO_GOAL_EVENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f39822c[SampleEvent.Type.HEALTH_ALARM_EVENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f39822c[SampleEvent.Type.SPORT_STATUS_EVENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public void a(EventTypeInfo eventTypeInfo, Subscriber subscriber, ICommonCallback iCommonCallback, len lenVar) throws RemoteException {
        if ("com.huawei.hiai".equals(lkf.d(e))) {
            eventTypeInfo.setOpenId(new lfi().a());
        }
        try {
            int i = AnonymousClass3.f39822c[eventTypeInfo.getType().ordinal()];
            if (i == 1) {
                c(subscriber, (GoalInfo) eventTypeInfo, iCommonCallback, lenVar);
                return;
            }
            if (i == 2) {
                a(subscriber, (HealthAlarmInfo) eventTypeInfo, iCommonCallback, lenVar);
            } else if (i != 3) {
                ReleaseLogUtil.d("R_SubscribeProxy", "wrong type");
                iCommonCallback.onResult(2, lcr.b(2));
            } else {
                e(subscriber, (SportStatusInfo) eventTypeInfo, iCommonCallback, lenVar);
            }
        } catch (ClassCastException e2) {
            ReleaseLogUtil.e("R_SubscribeProxy", "class cast exception: ", e2.getMessage());
            iCommonCallback.onResult(2, lcr.b(2));
        }
    }

    public void b() {
        LogUtil.a("SubscribeProxy", "enter autoRegisterSubscription.");
        ThreadPoolManager.c().execute(new Runnable() { // from class: lbo
            @Override // java.lang.Runnable
            public final void run() {
                this.e.c();
            }
        });
    }

    /* synthetic */ void c() {
        lfi lfiVar = new lfi();
        int iE = lfiVar.e();
        if (iE != 0 && iE != kud.a().e()) {
            ReleaseLogUtil.d("R_SubscribeProxy", "user changed, begin downloadSubscription.");
            a(BaseApplication.getContext()).d();
            lfiVar.c(kud.a().e());
            e();
            return;
        }
        lfiVar.c(kud.a().e());
        long jCurrentTimeMillis = System.currentTimeMillis();
        Long lValueOf = Long.valueOf(jCurrentTimeMillis);
        Long lC = lfiVar.c();
        lValueOf.getClass();
        if (jCurrentTimeMillis - lC.longValue() < 86400000) {
            ReleaseLogUtil.d("R_SubscribeProxy", "No more than 24 hours since the last synchronization.");
            ldn.c(lfiVar.b());
            return;
        }
        lValueOf.getClass();
        if ((jCurrentTimeMillis - lC.longValue()) / 8.64E7d >= 3.0d) {
            ReleaseLogUtil.d("R_SubscribeProxy", "more than 3 days since the last synchronization.");
            e();
            return;
        }
        int iG = g();
        lValueOf.getClass();
        long jLongValue = (lC.longValue() + ((long) iG)) - jCurrentTimeMillis;
        if (jLongValue <= 0) {
            ReleaseLogUtil.d("R_SubscribeProxy", "downloadSubscription immediately.");
            e();
        } else {
            ReleaseLogUtil.d("R_SubscribeProxy", "downloadSubscription delay ", Long.valueOf(jLongValue));
            a(jLongValue);
            ldn.c(lfiVar.b());
        }
    }

    public void a() {
        ldx.getInstance(e).clearSubscribeEvent();
        ldw.getInstance(e).clearSubscribeEvent();
    }

    public void d() {
        List<Subscriber> listC = ldn.c();
        ReleaseLogUtil.d("R_SubscribeProxy", "broadUserChange size:", Integer.valueOf(listC.size()));
        List<Subscription> listB = new lfi().b();
        HashMap map = new HashMap(16);
        for (Subscription subscription : listB) {
            if (map.get(subscription.getSubscriberId()) == null) {
                map.put(subscription.getSubscriberId(), true);
                EventTypeInfo eventTypeInfoD = ldn.d(subscription);
                if (eventTypeInfoD != null) {
                    ley.d(e, listC, eventTypeInfoD, subscription.getSubscriberId());
                }
            }
        }
    }

    public void a(Intent intent) {
        ReleaseLogUtil.d("R_SubscribeProxy", "device connection state changed.");
        Parcelable parcelableExtra = intent.getParcelableExtra("deviceinfo");
        if (!(parcelableExtra instanceof DeviceInfo)) {
            ReleaseLogUtil.e("R_SubscribeProxy", "current device model is wrong.");
            return;
        }
        DeviceInfo deviceInfo = (DeviceInfo) parcelableExtra;
        if (ldr.hasObservableInit()) {
            ldr.getInstance(e).notifyConnectionStateChange(deviceInfo);
        }
        if (lec.hasObservableInit()) {
            lec.getInstance(e).notifyConnectionStateChange(deviceInfo);
        }
    }

    private int b(Subscriber subscriber, GoalInfo goalInfo) {
        boolean zRegisterObserver = true;
        for (Goal goal : goalInfo.getGoals()) {
            if ((goal instanceof MetricGoal) && ldx.containDataType(goal.getDataType())) {
                ReleaseLogUtil.d("R_SubscribeProxy", "enter openSdk observable, register goalType is:", Integer.valueOf(goal.getDataType()));
                zRegisterObserver = ldx.getInstance(e).registerObserver((EventTypeInfo) goalInfo, subscriber);
            } else if (ldw.supportType(goal.getDataType())) {
                ReleaseLogUtil.d("R_SubscribeProxy", "enter platform observable, register goalType is:", Integer.valueOf(goal.getDataType()));
                zRegisterObserver = ldw.getInstance(e).registerObserver((Parcelable) goalInfo, subscriber);
            } else {
                LogUtil.d("SubscribeProxy", lcr.b(2));
                zRegisterObserver = false;
            }
            if (!zRegisterObserver) {
                break;
            }
        }
        return zRegisterObserver ? 0 : 2;
    }

    private void c(Subscriber subscriber, GoalInfo goalInfo, ICommonCallback iCommonCallback, len lenVar) throws RemoteException {
        boolean zUnregisterObserver = true;
        for (Goal goal : goalInfo.getGoals()) {
            if ((goal instanceof MetricGoal) && ldx.containDataType(goal.getDataType())) {
                ReleaseLogUtil.d("R_SubscribeProxy", "enter opensdk observable");
                zUnregisterObserver = ldx.getInstance(e).unregisterObserver((EventTypeInfo) goalInfo, subscriber);
            } else if (ldw.supportType(goal.getDataType())) {
                ReleaseLogUtil.d("R_SubscribeProxy", "enter platform observable");
                zUnregisterObserver = ldw.getInstance(e).unregisterObserver((EventTypeInfo) goalInfo, subscriber);
            } else {
                LogUtil.d("SubscribeProxy", lcr.b(2));
                zUnregisterObserver = false;
            }
            if (!zUnregisterObserver) {
                break;
            }
        }
        e(subscriber, goalInfo, iCommonCallback, lenVar, zUnregisterObserver);
    }

    private int a(Subscriber subscriber, HealthAlarmInfo healthAlarmInfo) {
        ReleaseLogUtil.d("R_SubscribeProxy", "enter device observable");
        return ldr.getInstance(e).registerObserver((Parcelable) healthAlarmInfo, subscriber) ? 0 : 2;
    }

    private void a(Subscriber subscriber, HealthAlarmInfo healthAlarmInfo, ICommonCallback iCommonCallback, len lenVar) throws RemoteException {
        e(subscriber, healthAlarmInfo, iCommonCallback, lenVar, ldr.getInstance(e).unregisterObserver((EventTypeInfo) healthAlarmInfo, subscriber));
    }

    private int e(Subscriber subscriber, SportStatusInfo sportStatusInfo) {
        ReleaseLogUtil.d("R_SubscribeProxy", "enter sport status observable");
        return lec.getInstance(e).registerObserver((Parcelable) sportStatusInfo, subscriber) ? 0 : 2;
    }

    private void e(Subscriber subscriber, SportStatusInfo sportStatusInfo, ICommonCallback iCommonCallback, len lenVar) throws RemoteException {
        e(subscriber, sportStatusInfo, iCommonCallback, lenVar, lec.getInstance(e).unregisterObserver((EventTypeInfo) sportStatusInfo, subscriber));
    }

    private void e(int i, len lenVar) {
        if (lenVar == null) {
            return;
        }
        lenVar.e().e(i);
        lenVar.a();
    }

    private void e(Subscriber subscriber, EventTypeInfo eventTypeInfo, ICommonCallback iCommonCallback, len lenVar, boolean z) throws RemoteException {
        ReleaseLogUtil.d("R_SubscribeProxy", "reportUnRegisterResult isSuccess:", Boolean.valueOf(z));
        if (z) {
            int iD = d(subscriber, eventTypeInfo);
            ReleaseLogUtil.d("R_SubscribeProxy", "deleteSubscription errCode is:", Integer.valueOf(iD));
            iCommonCallback.onResult(iD, lcr.b(iD));
            e(iD, lenVar);
            return;
        }
        ReleaseLogUtil.e("R_SubscribeProxy", "wrong parameter when unsubscribe");
        iCommonCallback.onResult(2, lcr.b(2));
        e(2, lenVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        ldn.b((List<String>) Arrays.asList(SampleEvent.Type.SCENARIO_GOAL_EVENT.getName(), SampleEvent.Type.HEALTH_ALARM_EVENT.getName()), (List<String>) Arrays.asList(String.valueOf(2)), (List<String>) null);
    }

    private int g() {
        return (new SecureRandom().nextInt(71) + 1) * 3600000;
    }

    private void a(long j) {
        if (this.d != null) {
            return;
        }
        Timer timer = new Timer("SubscribeProxy");
        this.d = timer;
        timer.schedule(new TimerTask() { // from class: lbi.4
            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() {
                lbi.this.e();
            }
        }, j);
        LogUtil.a("SubscribeProxy", "start background sync timer.");
    }

    private int a(Subscriber subscriber, EventTypeInfo eventTypeInfo) {
        if (eventTypeInfo instanceof SportStatusInfo) {
            c(subscriber, eventTypeInfo);
            return 0;
        }
        if (TextUtils.isEmpty(eventTypeInfo.getSubscriptionId())) {
            return ldn.e(subscriber, eventTypeInfo);
        }
        return 0;
    }

    private int d(Subscriber subscriber, EventTypeInfo eventTypeInfo) {
        if (eventTypeInfo instanceof SportStatusInfo) {
            b(subscriber, eventTypeInfo);
            return 0;
        }
        if (!TextUtils.isEmpty(eventTypeInfo.getSubscriptionId())) {
            return 0;
        }
        ReleaseLogUtil.d("R_SubscribeProxy", "reportUnRegisterResult eventInfo:", peh.c(eventTypeInfo));
        return ldn.e(eventTypeInfo, subscriber);
    }

    private void c(Subscriber subscriber, EventTypeInfo eventTypeInfo) {
        Subscription subscriptionE = e(subscriber, eventTypeInfo);
        lfi lfiVar = new lfi();
        List<Subscription> listB = lfiVar.b();
        Iterator<Subscription> it = listB.iterator();
        while (it.hasNext()) {
            if (it.next().equals(subscriptionE)) {
                return;
            }
        }
        listB.add(subscriptionE);
        lfiVar.d(listB);
    }

    private void b(Subscriber subscriber, EventTypeInfo eventTypeInfo) {
        Subscription subscriptionE = e(subscriber, eventTypeInfo);
        lfi lfiVar = new lfi();
        List<Subscription> listB = lfiVar.b();
        Iterator<Subscription> it = listB.iterator();
        while (it.hasNext()) {
            if (it.next().equals(subscriptionE)) {
                it.remove();
            }
        }
        lfiVar.d(listB);
    }

    private Subscription e(Subscriber subscriber, EventTypeInfo eventTypeInfo) {
        Subscription subscription = new Subscription(eventTypeInfo.getType(), eventTypeInfo.getSubType(), eventTypeInfo.getOpenId(), eventTypeInfo.getStartDay());
        subscription.setSubscriptionMode(eventTypeInfo.getSubscriptionMode());
        subscription.setAppId(subscriber.getAppId());
        subscription.setSubscriberId(subscriber.getSubscriberId());
        return subscription;
    }
}

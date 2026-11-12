package com.xiaomi.hm.health.sensorhub;

import android.content.ContentProviderClient;
import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.net.Uri;
import com.huami.device.core.sync.impl.job.hub.SensorHub;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bt.device.HMCallback;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.error.HMDeviceSyncDataError;
import com.xiaomi.hm.health.bt.profile.base.RealtimeStep;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.ActivityData;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.ActivityDataFragment;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.IHMActivityDataCallback;
import com.xiaomi.hm.health.dataprocess.SportDay;
import com.xiaomi.hm.health.datautil.HMDataCacheCenter;
import com.xiaomi.hm.health.device.HMDeviceManager;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

/* JADX INFO: loaded from: classes21.dex */
public class SensorHubController implements SensorHub {
    private static final String k = "SensorHubController";
    private static final String l = "support_steps_provider";
    private static final int m = 86400000;
    private static SensorHubController n;
    private com.xiaomi.hm.health.sensorhub.a a;
    private final SensorManager b;
    private Sensor c;
    private final c d = new c();
    private int e = 0;
    private SportDay f = null;
    private boolean g = false;
    private HMCallback<RealtimeStep> h = null;
    private Timer i = null;
    private TimerTask j = null;

    public class a extends TimerTask {
        public a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            SensorHubController.this.u();
        }
    }

    public class b implements Runnable {
        public final /* synthetic */ IHMActivityDataCallback a;
        public final /* synthetic */ Calendar b;

        public b(final IHMActivityDataCallback val$callback, final Calendar val$calendar) {
            this.a = val$callback;
            this.b = val$calendar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.a.onSyncStart();
            SensorHubController.this.u();
            LinkedList<Step> linkedListE = SensorHubController.this.a.e(this.b.getTimeInMillis(), Calendar.getInstance().getTimeInMillis());
            ArrayList arrayList = new ArrayList();
            ActivityDataFragment activityDataFragmentT = SensorHubController.this.t(linkedListE);
            if (activityDataFragmentT != null) {
                arrayList.add(activityDataFragmentT);
                Calendar calendar = Calendar.getInstance();
                calendar.setTimeInMillis(linkedListE.getLast().getEndTime());
                arrayList.add(new ActivityDataFragment(calendar, true));
            }
            this.a.onSyncStop(arrayList);
            this.a.onSyncFinish(new HMDeviceSyncDataError(0));
        }
    }

    public class c implements SensorEventListener {
        private c() {
        }

        @Override // android.hardware.SensorEventListener
        public void onAccuracyChanged(Sensor sensor, int accuracy) {
        }

        @Override // android.hardware.SensorEventListener
        public void onSensorChanged(SensorEvent event) {
            HMLog.d(SensorHubController.k, "Step:" + String.valueOf(event.values[0]), new Object[0]);
            StringBuilder sb = new StringBuilder();
            sb.append("Step:");
            SensorHubController sensorHubController = SensorHubController.this;
            int i = (int) (sensorHubController.e + event.values[0]);
            sensorHubController.e = i;
            sb.append(String.valueOf(i));
            HMLog.d(SensorHubController.k, sb.toString(), new Object[0]);
            if (SensorHubController.this.h != null) {
                SensorHubController.this.h.onData(new RealtimeStep(SensorHubController.this.e, -1));
            }
        }
    }

    private SensorHubController(Context c2) {
        this.a = null;
        this.a = new com.xiaomi.hm.health.sensorhub.a(c2.getContentResolver());
        SensorManager sensorManager = (SensorManager) c2.getSystemService("sensor");
        this.b = sensorManager;
        this.c = sensorManager.getDefaultSensor(18);
    }

    public static void create(Context context, HMCallback<RealtimeStep> callback) {
        SensorHubController sensorHubController = new SensorHubController(context);
        n = sensorHubController;
        sensorHubController.s(callback);
        n.j(true);
        n.r();
    }

    public static void destroy() {
        SensorHubController sensorHubController = n;
        if (sensorHubController != null) {
            sensorHubController.s(null);
            n.j(false);
            n.g();
        }
    }

    private void g() {
        TimerTask timerTask = this.j;
        if (timerTask != null) {
            timerTask.cancel();
        }
        Timer timer = this.i;
        if (timer != null) {
            timer.cancel();
            this.i.purge();
        }
        this.j = null;
        this.i = null;
    }

    public static SensorHubController getInstance() {
        return n;
    }

    private void h() {
        SensorManager sensorManager;
        HMLog.d(k, "disableSensor", new Object[0]);
        if (this.g && (sensorManager = this.b) != null) {
            sensorManager.unregisterListener(this.d);
            this.g = false;
        }
    }

    private void i(LinkedList<Step> steps) {
        int steps2 = 0;
        for (Step step : steps) {
            steps2 += step.getSteps();
            HMLog.d(k, "Step:" + step.toString(), new Object[0]);
        }
        Step first = steps.getFirst();
        Step last = steps.getLast();
        HMLog.d(k, "start time:" + new Date(first.getBeginTime()).toString(), new Object[0]);
        HMLog.d(k, "stop time:" + new Date(last.getEndTime()).toString(), new Object[0]);
        HMLog.d(k, "total minutes:" + m(first.getBeginTime(), last.getEndTime()), new Object[0]);
        HMLog.d(k, "total steps:" + steps2, new Object[0]);
    }

    public static boolean isSupportSensorHub(Context c2) {
        if (n(l)) {
            return ((SensorManager) c2.getSystemService("sensor")).getDefaultSensor(18) != null && p(c2, com.xiaomi.hm.health.sensorhub.b.i) && com.xiaomi.hm.health.sensorhub.a.c(c2.getContentResolver());
        }
        HMLog.i(k, "not support miui sensorhub!!!", new Object[0]);
        return false;
    }

    private boolean j(final boolean enable) {
        if (!enable) {
            h();
            return true;
        }
        boolean zK = k();
        if (!zK) {
            return zK;
        }
        u();
        return zK;
    }

    private boolean k() {
        HMLog.d(k, "enableSensor", new Object[0]);
        if (this.g) {
            return true;
        }
        Sensor sensor = this.c;
        if (sensor == null) {
            HMLog.i(k, "sensor detector is null!!", new Object[0]);
            return false;
        }
        boolean zRegisterListener = this.b.registerListener(this.d, sensor, 2);
        if (zRegisterListener) {
            this.g = true;
        }
        return zRegisterListener;
    }

    private List<ActivityData> l(Step s) {
        HMLog.i(k, "getActivityDataFromStep:" + s.toString(), new Object[0]);
        ArrayList arrayList = new ArrayList();
        int mode = s.getMode();
        byte b2 = -1;
        byte b3 = 126;
        if (mode != 0 && mode != 1 && mode != 2 && mode != 3) {
            b2 = 0;
            b3 = 0;
        }
        int iM = m(s.getBeginTime(), s.getEndTime());
        if (iM == 0) {
            arrayList.add(new ActivityData(b2, s.getSteps(), b3));
        } else {
            int steps = s.getSteps() / iM;
            int steps2 = s.getSteps() % iM;
            HMLog.d(k, "aveStep:" + steps + ",modSteps:" + steps2, new Object[0]);
            for (int i = 0; i < iM - 1; i++) {
                arrayList.add(new ActivityData(b2, steps, b3));
            }
            arrayList.add(new ActivityData(b2, steps + steps2, b3));
        }
        HMDataCacheCenter.printActivityData("sensorhub activity data", arrayList);
        return arrayList;
    }

    private int m(long timestamp1, long timestamp2) {
        return (int) ((timestamp2 - timestamp1) / 60000);
    }

    private static boolean n(String key) {
        try {
            Class<?> cls = Class.forName("miui.util.FeatureParser");
            return ((Boolean) cls.getMethod("getBoolean", String.class, Boolean.TYPE).invoke(cls, key, Boolean.FALSE)).booleanValue();
        } catch (IllegalArgumentException e) {
            HMLog.i(k, "iAE:" + e.getMessage(), new Object[0]);
            return false;
        } catch (Exception e2) {
            HMLog.i(k, "exception:" + e2.getMessage(), new Object[0]);
            return false;
        }
    }

    private int o() {
        HMLog.d(k, "getRealtimeStepInternal", new Object[0]);
        Calendar calendar = Calendar.getInstance();
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        Calendar deviceBoundTime = HMDeviceManager.getInstance().getDeviceBoundTime(HMDeviceType.SENSORHUB);
        int steps = 0;
        for (Step step : this.a.e(deviceBoundTime.getTimeInMillis() > calendar.getTimeInMillis() ? deviceBoundTime.getTimeInMillis() : calendar.getTimeInMillis(), Calendar.getInstance().getTimeInMillis())) {
            HMLog.d(k, "nearbyStep:" + step.toString(), new Object[0]);
            steps += step.getSteps();
        }
        HMLog.d(k, "totalStep:" + steps, new Object[0]);
        return steps;
    }

    private static boolean p(final Context context, final Uri uri) {
        if (context == null || uri == null) {
            throw new IllegalArgumentException();
        }
        try {
            ContentProviderClient contentProviderClientAcquireContentProviderClient = context.getContentResolver().acquireContentProviderClient(uri);
            boolean z = contentProviderClientAcquireContentProviderClient != null;
            if (contentProviderClientAcquireContentProviderClient != null) {
                contentProviderClientAcquireContentProviderClient.release();
            }
            return z;
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0048  */
    private LinkedList<Step> q(LinkedList<Step> steps) {
        Step step;
        LinkedList<Step> linkedList = new LinkedList<>();
        Step step2 = null;
        for (Step step3 : steps) {
            if (step2 != null) {
                int iM = m(step2.getBeginTime(), step3.getEndTime());
                int iM2 = m(step2.getEndTime(), step3.getBeginTime());
                int iM3 = m(step3.getBeginTime(), step3.getEndTime());
                boolean z = true;
                if (iM2 == 0) {
                    if (iM == 0 && iM3 == 0) {
                        step = step2;
                    } else if (iM == 0) {
                        step = step3;
                    } else if (iM3 == 0) {
                        step = step2;
                    } else {
                        step = step2;
                        z = false;
                    }
                    if (z) {
                        step3 = new Step(step.getId(), step2.getBeginTime(), step3.getEndTime(), step.getMode(), step3.getSteps() + step2.getSteps());
                    } else {
                        linkedList.add(step2);
                    }
                } else if (iM2 == 1) {
                    linkedList.add(step2);
                    if (iM3 > 0) {
                        linkedList.add(new Step(-1, step2.getEndTime(), step3.getBeginTime(), 1, 0));
                    }
                } else {
                    linkedList.add(step2);
                    long beginTime = step3.getBeginTime();
                    if (iM3 == 0) {
                        beginTime -= 60000;
                    }
                    linkedList.add(new Step(-1, step2.getEndTime(), beginTime, 1, 0));
                }
            }
            step2 = step3;
        }
        linkedList.add(step2);
        return linkedList;
    }

    private void r() {
        this.i = new Timer(k);
        this.j = new a();
        Calendar calendar = Calendar.getInstance();
        calendar.add(11, 1);
        calendar.clear(12);
        calendar.clear(13);
        calendar.clear(14);
        calendar.add(13, 1);
        this.i.schedule(this.j, calendar.getTimeInMillis() - Calendar.getInstance().getTimeInMillis(), 86400000L);
    }

    private void s(HMCallback<RealtimeStep> callback) {
        this.h = callback;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ActivityDataFragment t(LinkedList<Step> steps) {
        if (steps == null || steps.size() == 0) {
            HMLog.i(k, "toActivitiesNew steps is null!!!", new Object[0]);
            return null;
        }
        Step first = steps.getFirst();
        int iM = m(first.getBeginTime(), first.getEndTime());
        long beginTime = first.getBeginTime();
        if (Math.abs(iM) >= 1) {
            beginTime += 60000;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(beginTime);
        ArrayList arrayList = new ArrayList();
        HMLog.i(k, "=======================origin<I>steps=======================", new Object[0]);
        i(steps);
        HMLog.i(k, "=======================origin<O>steps=======================", new Object[0]);
        LinkedList<Step> linkedListQ = q(steps);
        HMLog.i(k, "************************merged<I>steps************************", new Object[0]);
        i(linkedListQ);
        HMLog.i(k, "************************merged<O>steps************************", new Object[0]);
        Iterator<Step> it2 = linkedListQ.iterator();
        while (it2.hasNext()) {
            arrayList.addAll(l(it2.next()));
        }
        HMLog.i(k, "data date:" + calendar.getTime().toString() + ",date size:" + arrayList.size(), new Object[0]);
        return new ActivityDataFragment(calendar, arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void u() {
        SportDay sportDay = new SportDay();
        SportDay sportDay2 = this.f;
        if (sportDay2 == null || !sportDay2.equals(sportDay)) {
            this.f = sportDay;
            int iO = o();
            this.e = iO;
            HMCallback<RealtimeStep> hMCallback = this.h;
            if (hMCallback != null) {
                hMCallback.onData(new RealtimeStep(iO, -1));
            }
        }
    }

    public RealtimeStep getRealtimeStep() {
        return new RealtimeStep(this.e);
    }

    @Override // com.huami.device.core.sync.impl.job.hub.SensorHub
    public void syncSensorHubData(final Calendar calendar, final IHMActivityDataCallback callback) {
        new Thread(new b(callback, calendar)).start();
    }
}

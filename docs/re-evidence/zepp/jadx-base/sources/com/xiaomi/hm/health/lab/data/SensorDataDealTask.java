package com.xiaomi.hm.health.lab.data;

import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.lab.data.SensorDataDealTask;
import com.xiaomi.hm.health.lab.model.BehaviorTagEnity;
import com.xiaomi.hm.health.lab.model.CommonSensorRecord;
import com.xiaomi.hm.health.lab.model.GSensorRecord;
import com.xiaomi.hm.health.lab.model.GyroSensorRecord;
import com.xiaomi.hm.health.lab.model.MagnRecord;
import com.xiaomi.hm.health.lab.model.NmeaRecord;
import com.xiaomi.hm.health.lab.model.PPGSensorRecord;
import com.xiaomi.hm.health.lab.model.SensorRecordsEnity;
import com.xiaomi.hm.health.lab.utils.TaggingFileUtils;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.LinkedBlockingQueue;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes21.dex */
public class SensorDataDealTask<T> extends Thread {
    private static final String e = "SensorDataDealTask";
    private BehaviorTagEnity b;
    private SensorRecordsEnity c;
    private final LinkedBlockingQueue<List<T>> a = new LinkedBlockingQueue<>();
    private volatile boolean d = true;

    public SensorDataDealTask(BehaviorTagEnity behaviorTagEnity, SensorRecordsEnity sensorRecordsEnity) {
        this.b = behaviorTagEnity;
        this.c = sensorRecordsEnity;
    }

    private void d() throws Throwable {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        this.a.drainTo(arrayList2);
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            arrayList.addAll((List) it2.next());
        }
        h(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String e() {
        return "in SensorDataDealTask";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String f(Exception exc) {
        return "InterruptedException:" + exc.getMessage();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String g() {
        return "out SensorDataDealTask";
    }

    private void h(List<T> list) throws Throwable {
        if (list == null || list.size() == 0) {
            return;
        }
        T t = list.get(0);
        if (t instanceof GSensorRecord) {
            TaggingFileUtils.logOutByLabGSensor(list, this.b, this.c);
        } else if (t instanceof PPGSensorRecord) {
            TaggingFileUtils.logOutByLabPPGSensor(list, this.b, this.c);
        } else if (t instanceof GyroSensorRecord) {
            TaggingFileUtils.logOutByLabGyro(list, this.b, this.c);
        } else if (t instanceof MagnRecord) {
            TaggingFileUtils.logOutByLabGeo(list, this.b, this.c);
        } else if (t instanceof NmeaRecord) {
            TaggingFileUtils.logOutByLabNmea(list, this.b, this.c);
        } else if (t instanceof CommonSensorRecord) {
            TaggingFileUtils.logOutByLabCommonSensor(list, this.b, this.c);
        }
        this.c.setEndTaggingTime(Calendar.getInstance(Locale.getDefault()).getTimeInMillis() + TaggingFileUtils.offset());
        TaggingFileUtils.updateSensorDataEndTagTime(this.c);
    }

    public void addDataToQueue(List<T> list) {
        if (list == null || list.size() <= 0) {
            return;
        }
        this.a.offer(list);
    }

    public void i() {
        this.d = false;
        interrupt();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() throws Throwable {
        HMLog.info(e, new Function0() { // from class: vn6
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SensorDataDealTask.e();
            }
        });
        while (this.d) {
            try {
                d();
                Thread.sleep(1000L);
            } catch (Exception e2) {
                HMLog.info(e, new Function0() { // from class: tn6
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return SensorDataDealTask.f(e2);
                    }
                });
            }
        }
        d();
        HMLog.info(e, new Function0() { // from class: un6
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SensorDataDealTask.g();
            }
        });
    }
}

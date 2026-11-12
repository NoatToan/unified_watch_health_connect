package com.huawei.hms.health;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Intent;
import android.text.TextUtils;
import com.huawei.agconnect.apms.Agent;
import com.huawei.hmf.tasks.Task;
import com.huawei.hms.common.internal.Preconditions;
import com.huawei.hms.hihealth.HiHealthKitClient;
import com.huawei.hms.hihealth.HiHealthStatusCodes;
import com.huawei.hms.hihealth.data.ActivityRecord;
import com.huawei.hms.hihealth.data.AppInfo;
import com.huawei.hms.hihealth.data.ComponentInfo;
import com.huawei.hms.hihealth.data.HealthKitApiInvoker;
import com.huawei.hms.hihealth.options.ActivityRecordDeleteOptions;
import com.huawei.hms.hihealth.options.ActivityRecordInsertOptions;
import com.huawei.hms.hihealth.options.ActivityRecordReadOptions;
import com.huawei.hms.hihealth.options.OnActivityRecordListener;
import com.huawei.hms.hihealth.result.ActivityRecordResult;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: loaded from: classes34.dex */
public class aace implements com.huawei.hms.hihealth.aabd {
    private static volatile aace aaba;
    private static volatile HealthKitApiInvoker aabb;
    private final String aab = HiHealthKitClient.getInstance().getContext().getPackageName();

    static class aabc implements Callable<ComponentInfo> {
        /* synthetic */ aabc(aab aabVar) {
        }

        @Override // java.util.concurrent.Callable
        public ComponentInfo call() throws Exception {
            return aack.aabe().aab().aabe();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Void aab(HealthKitApiInvoker healthKitApiInvoker, ActivityRecordInsertOptions activityRecordInsertOptions) throws Exception {
        healthKitApiInvoker.setInterfaceProvider("ActivityRecordsController");
        healthKitApiInvoker.setInterfaceInvoked("addActivityRecord");
        String strAab = aacs.aab(activityRecordInsertOptions);
        if (strAab != null) {
            if (strAab.length() > 256000.0f) {
                String str = "";
                if (TextUtils.isEmpty(strAab)) {
                    aabz.aabc("util", "compressGzip input is empty!");
                } else {
                    try {
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        try {
                            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                            try {
                                gZIPOutputStream.write(strAab.getBytes(StandardCharsets.UTF_8));
                                gZIPOutputStream.flush();
                                gZIPOutputStream.close();
                                String str2 = new String(byteArrayOutputStream.toByteArray(), StandardCharsets.ISO_8859_1);
                                try {
                                    gZIPOutputStream.close();
                                    try {
                                        byteArrayOutputStream.close();
                                        str = str2;
                                    } catch (IOException unused) {
                                        str = str2;
                                        aabz.aab("util", "compressGzip IOException");
                                    }
                                } catch (Throwable th) {
                                    th = th;
                                    str = str2;
                                    try {
                                        byteArrayOutputStream.close();
                                    } catch (Throwable th2) {
                                        th.addSuppressed(th2);
                                    }
                                    throw th;
                                }
                            } catch (Throwable th3) {
                                try {
                                    gZIPOutputStream.close();
                                } catch (Throwable th4) {
                                    th3.addSuppressed(th4);
                                }
                                throw th3;
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            byteArrayOutputStream.close();
                            throw th;
                        }
                    } catch (IOException unused2) {
                    }
                }
                StringBuilder sbAab = com.huawei.hms.health.aab.aab("compressing rate is ");
                sbAab.append(strAab.length() / str.length());
                aabz.aabb("util", sbAab.toString());
                healthKitApiInvoker.setRequestBody(str);
                healthKitApiInvoker.setGzip(true);
            } else {
                healthKitApiInvoker.setRequestBody(strAab);
            }
        }
        aaci.aabc().aab(healthKitApiInvoker);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ActivityRecord aaba(ActivityRecord activityRecord) {
        String timeZone = TextUtils.isEmpty(activityRecord.getTimeZone()) ? new SimpleDateFormat("Z", Locale.getDefault()).format(new Date()) : activityRecord.getTimeZone();
        long startTime = activityRecord.getStartTime(TimeUnit.MILLISECONDS);
        long endTime = activityRecord.getEndTime(TimeUnit.MILLISECONDS);
        String name = activityRecord.getName();
        String id = activityRecord.getId();
        String desc = activityRecord.getDesc();
        int iAab = aacc.aab(activityRecord.getActivityType());
        long durationTime = activityRecord.getDurationTime(TimeUnit.MILLISECONDS);
        String str = this.aab;
        return new ActivityRecord(startTime, endTime, name, id, desc, iAab, Long.valueOf(durationTime), new AppInfo(str, str, str, str), activityRecord.getActivitySummary(), timeZone, activityRecord.getDetails(), activityRecord.getMetadata(), activityRecord.getDeviceInfo(), activityRecord.getSubDataRelationList(), activityRecord.getGzipDetail());
    }

    public Task<List<ActivityRecord>> aaba(final String str) {
        final HealthKitApiInvoker healthKitApiInvoker = new HealthKitApiInvoker(aabb);
        return aacq.aab(new Callable() { // from class: com.huawei.hms.health.aace$$ExternalSyntheticLambda1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return aace.aab(healthKitApiInvoker, str);
            }
        });
    }

    public Task<Void> aaba(PendingIntent pendingIntent) {
        throw new SecurityException(String.valueOf(HiHealthStatusCodes.API_FUNCTION_UNAVAILABLE));
    }

    public Task<Void> aab(String str) {
        Preconditions.checkNotNull(str, "activityRecordId cannot be null.");
        return aacq.aabb(2, new aabb(str));
    }

    public Task<ActivityRecordResult> aab(final ActivityRecordReadOptions activityRecordReadOptions) {
        final HealthKitApiInvoker healthKitApiInvoker = new HealthKitApiInvoker(aabb);
        return aacq.aab(new Callable() { // from class: com.huawei.hms.health.aace$$ExternalSyntheticLambda2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return aace.aab(healthKitApiInvoker, activityRecordReadOptions);
            }
        });
    }

    public Task<Void> aab(final ActivityRecordInsertOptions activityRecordInsertOptions) {
        final HealthKitApiInvoker healthKitApiInvoker = new HealthKitApiInvoker(aabb);
        return aacq.aab(new Callable() { // from class: com.huawei.hms.health.aace$$ExternalSyntheticLambda3
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return aace.aab(healthKitApiInvoker, activityRecordInsertOptions);
            }
        });
    }

    public Task<Void> aab(final ActivityRecordDeleteOptions activityRecordDeleteOptions) {
        final HealthKitApiInvoker healthKitApiInvoker = new HealthKitApiInvoker(aabb);
        return aacq.aab(new Callable() { // from class: com.huawei.hms.health.aace$$ExternalSyntheticLambda0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return aace.aab(healthKitApiInvoker, activityRecordDeleteOptions);
            }
        });
    }

    public Task<Void> aab(ActivityRecord activityRecord, ComponentName componentName, OnActivityRecordListener onActivityRecordListener) {
        Preconditions.checkNotNull(activityRecord, "ActivityRecord cannot be null.");
        Preconditions.checkArgument(activityRecord.getEndTime(TimeUnit.MILLISECONDS) == 0, "Cannot start the activityRecord which has already ended.");
        Preconditions.checkArgument(activityRecord.getStartTime(TimeUnit.MILLISECONDS) <= System.currentTimeMillis(), "can not start an ActivityRecord in the future time.");
        return aacq.aabb(2, new aaba(activityRecord, componentName, onActivityRecordListener));
    }

    public Task<Void> aab(ActivityRecord activityRecord) {
        Preconditions.checkNotNull(activityRecord, "ActivityRecord cannot be null.");
        Preconditions.checkArgument(activityRecord.getEndTime(TimeUnit.MILLISECONDS) == 0, "Cannot start the activityRecord which has already ended.");
        Preconditions.checkArgument(activityRecord.getStartTime(TimeUnit.MILLISECONDS) <= System.currentTimeMillis(), "can not start an ActivityRecord in the future time.");
        return aacq.aab(new aab(activityRecord, new HealthKitApiInvoker(aabb)));
    }

    public Task<Void> aab(PendingIntent pendingIntent) {
        throw new SecurityException(String.valueOf(HiHealthStatusCodes.API_FUNCTION_UNAVAILABLE));
    }

    public Task<ComponentInfo> aab() {
        return aacq.aab(2, new aabc(null));
    }

    public static aace aaba() {
        if (aaba == null) {
            synchronized (aace.class) {
                if (aaba == null) {
                    aaba = new aace();
                    aabb = aaci.aabc().aaba();
                }
            }
        }
        return aaba;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ List aab(HealthKitApiInvoker healthKitApiInvoker, String str) throws Exception {
        healthKitApiInvoker.setInterfaceProvider("ActivityRecordsController");
        healthKitApiInvoker.setInterfaceInvoked("endActivityRecord");
        healthKitApiInvoker.setRequestBody(str);
        return aacs.aab(aaci.aabc().aab(healthKitApiInvoker), ActivityRecord.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Void aab(HealthKitApiInvoker healthKitApiInvoker, ActivityRecordDeleteOptions activityRecordDeleteOptions) throws Exception {
        healthKitApiInvoker.setInterfaceProvider("ActivityRecordsController");
        healthKitApiInvoker.setInterfaceInvoked("deleteActivityRecord");
        healthKitApiInvoker.setRequestBody(aacs.aab(activityRecordDeleteOptions));
        aaci.aabc().aab(healthKitApiInvoker);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ActivityRecordResult aab(HealthKitApiInvoker healthKitApiInvoker, ActivityRecordReadOptions activityRecordReadOptions) throws Exception {
        healthKitApiInvoker.setInterfaceProvider("ActivityRecordsController");
        healthKitApiInvoker.setInterfaceInvoked("getActivityRecord");
        healthKitApiInvoker.setRequestBody(aacs.aab(activityRecordReadOptions));
        return (ActivityRecordResult) aacs.aab(aaci.aabc().aaba(healthKitApiInvoker), (Type) ActivityRecordResult.class);
    }

    class aaba implements Callable<Void> {
        private final ActivityRecord aab;
        private final ComponentName aaba;
        private final OnActivityRecordListener aabb;

        @Override // java.util.concurrent.Callable
        public Void call() throws Exception {
            ActivityRecord activityRecordAaba = TextUtils.isEmpty(this.aab.getPackageName()) ? aace.this.aaba(this.aab) : this.aab;
            ComponentInfo componentInfo = new ComponentInfo();
            componentInfo.setAppType(Agent.OS_NAME);
            if (this.aaba != null) {
                Intent intent = new Intent();
                intent.setComponent(this.aaba);
                intent.addCategory("android.intent.category.BROWSABLE");
                if (intent.resolveActivity(HiHealthKitClient.getInstance().getContext().getPackageManager()) == null) {
                    throw new IllegalArgumentException("can not resolve the component");
                }
                componentInfo.setPackageName(this.aaba.getPackageName());
                componentInfo.setClassName(this.aaba.getClassName());
            }
            aack.aabe().aab().aab(activityRecordAaba, componentInfo, new aacf(this));
            return null;
        }

        public aaba(ActivityRecord activityRecord, ComponentName componentName, OnActivityRecordListener onActivityRecordListener) {
            this.aab = activityRecord;
            this.aaba = componentName;
            this.aabb = onActivityRecordListener;
        }
    }

    class aab implements Callable<Void> {
        final /* synthetic */ ActivityRecord aab;
        final /* synthetic */ HealthKitApiInvoker aaba;

        @Override // java.util.concurrent.Callable
        public Void call() throws Exception {
            ActivityRecord activityRecordAaba = TextUtils.isEmpty(this.aab.getPackageName()) ? aace.this.aaba(this.aab) : this.aab;
            this.aaba.setInterfaceProvider("ActivityRecordsController");
            this.aaba.setInterfaceInvoked("beginActivityRecord");
            this.aaba.setRequestBody(aacs.aab(activityRecordAaba));
            aaci.aabc().aab(this.aaba);
            return null;
        }

        aab(ActivityRecord activityRecord, HealthKitApiInvoker healthKitApiInvoker) {
            this.aab = activityRecord;
            this.aaba = healthKitApiInvoker;
        }
    }

    static class aabb implements Callable<Void> {
        private final String aab;

        @Override // java.util.concurrent.Callable
        public Void call() throws Exception {
            aack.aabe().aab().aab(this.aab);
            return null;
        }

        public aabb(String str) {
            this.aab = str;
        }
    }
}

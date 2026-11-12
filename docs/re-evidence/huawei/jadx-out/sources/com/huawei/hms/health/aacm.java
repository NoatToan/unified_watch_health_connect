package com.huawei.hms.health;

import com.huawei.hmf.tasks.Task;
import com.huawei.hms.hihealth.data.HealthKitApiInvoker;
import com.huawei.hms.hihealth.options.HealthRecordDeleteOptions;
import com.huawei.hms.hihealth.options.HealthRecordInsertOptions;
import com.huawei.hms.hihealth.options.HealthRecordReadOptions;
import com.huawei.hms.hihealth.options.HealthRecordUpdateOptions;
import com.huawei.hms.hihealth.result.HealthRecordResult;
import java.lang.reflect.Type;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes34.dex */
public class aacm {
    private static volatile aacm aab;
    private static volatile HealthKitApiInvoker aaba;

    public Task<Void> aab(final HealthRecordUpdateOptions healthRecordUpdateOptions) {
        final HealthKitApiInvoker healthKitApiInvoker = new HealthKitApiInvoker(aaba);
        return aacq.aab(new Callable() { // from class: com.huawei.hms.health.aacm$$ExternalSyntheticLambda3
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return aacm.aab(healthKitApiInvoker, healthRecordUpdateOptions);
            }
        });
    }

    public Task<HealthRecordResult> aab(final HealthRecordReadOptions healthRecordReadOptions) {
        final HealthKitApiInvoker healthKitApiInvoker = new HealthKitApiInvoker(aaba);
        return aacq.aab(new Callable() { // from class: com.huawei.hms.health.aacm$$ExternalSyntheticLambda2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return aacm.aab(healthKitApiInvoker, healthRecordReadOptions);
            }
        });
    }

    public Task<String> aab(final HealthRecordInsertOptions healthRecordInsertOptions) {
        final HealthKitApiInvoker healthKitApiInvoker = new HealthKitApiInvoker(aaba);
        return aacq.aab(new Callable() { // from class: com.huawei.hms.health.aacm$$ExternalSyntheticLambda1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return aacm.aab(healthKitApiInvoker, healthRecordInsertOptions);
            }
        });
    }

    public Task<Void> aab(final HealthRecordDeleteOptions healthRecordDeleteOptions) {
        final HealthKitApiInvoker healthKitApiInvoker = new HealthKitApiInvoker(aaba);
        return aacq.aab(new Callable() { // from class: com.huawei.hms.health.aacm$$ExternalSyntheticLambda0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return aacm.aab(healthKitApiInvoker, healthRecordDeleteOptions);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Void aab(HealthKitApiInvoker healthKitApiInvoker, HealthRecordUpdateOptions healthRecordUpdateOptions) throws Exception {
        healthKitApiInvoker.setInterfaceProvider("HealthRecordsController");
        healthKitApiInvoker.setInterfaceInvoked("updateHealthRecord");
        healthKitApiInvoker.setRequestBody(aacs.aab(healthRecordUpdateOptions));
        aaci.aabc().aab(healthKitApiInvoker);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Void aab(HealthKitApiInvoker healthKitApiInvoker, HealthRecordDeleteOptions healthRecordDeleteOptions) throws Exception {
        healthKitApiInvoker.setInterfaceProvider("HealthRecordsController");
        healthKitApiInvoker.setInterfaceInvoked("deleteHealthRecord");
        healthKitApiInvoker.setRequestBody(aacs.aab(healthRecordDeleteOptions));
        aaci.aabc().aab(healthKitApiInvoker);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String aab(HealthKitApiInvoker healthKitApiInvoker, HealthRecordInsertOptions healthRecordInsertOptions) throws Exception {
        healthKitApiInvoker.setInterfaceProvider("HealthRecordsController");
        healthKitApiInvoker.setInterfaceInvoked("addHealthRecord");
        healthKitApiInvoker.setRequestBody(aacs.aab(healthRecordInsertOptions));
        return aaci.aabc().aab(healthKitApiInvoker);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ HealthRecordResult aab(HealthKitApiInvoker healthKitApiInvoker, HealthRecordReadOptions healthRecordReadOptions) throws Exception {
        healthKitApiInvoker.setInterfaceProvider("HealthRecordsController");
        healthKitApiInvoker.setInterfaceInvoked("getHealthRecord");
        healthKitApiInvoker.setRequestBody(aacs.aab(healthRecordReadOptions));
        return (HealthRecordResult) aacs.aab(aaci.aabc().aaba(healthKitApiInvoker), (Type) HealthRecordResult.class);
    }

    public static aacm aab() {
        if (aab == null) {
            synchronized (aacm.class) {
                if (aab == null) {
                    aab = new aacm();
                    aaba = aaci.aabc().aaba();
                }
            }
        }
        return aab;
    }
}

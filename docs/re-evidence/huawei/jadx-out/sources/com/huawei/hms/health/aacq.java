package com.huawei.hms.health;

import android.os.IInterface;
import com.huawei.hmf.tasks.Task;
import com.huawei.hmf.tasks.Tasks;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.hihealth.HiHealthKitClient;
import com.huawei.hms.hihealth.HiHealthStatusCodes;
import com.huawei.hms.support.api.client.Status;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes10.dex */
public class aacq {
    static /* synthetic */ IInterface aab(int i) throws ApiException {
        IInterface iInterfaceBindService = HiHealthKitClient.getInstance().bindService(i);
        if (iInterfaceBindService != null) {
            return iInterfaceBindService;
        }
        throw new ApiException(new Status(HiHealthStatusCodes.API_EXCEPTION_ERROR, "the client is not connected"));
    }

    static /* synthetic */ void aab() {
        HiHealthKitClient.getInstance().delayedDisconnect();
    }

    static <T> Task<T> aabb(int i, Callable<T> callable) {
        return Tasks.callInBackground(new aabc(i, callable));
    }

    static class aab<T> implements Callable<T> {
        private Callable<T> aab;

        @Override // java.util.concurrent.Callable
        public T call() throws Exception {
            try {
                return this.aab.call();
            } finally {
                aacq.aab();
            }
        }

        aab(Callable<T> callable) {
            this.aab = callable;
        }
    }

    /* JADX INFO: loaded from: classes34.dex */
    static class aaba<T> implements Callable<T> {
        private int aab;
        private Callable<T> aaba;

        @Override // java.util.concurrent.Callable
        public T call() throws Exception {
            try {
                aacq.aab(this.aab);
                return this.aaba.call();
            } finally {
                aacq.aab();
            }
        }

        aaba(int i, Callable<T> callable) {
            this.aab = i;
            this.aaba = callable;
        }
    }

    /* JADX INFO: loaded from: classes34.dex */
    static class aabc<T> implements Callable<T> {
        private int aab;
        private Callable<T> aaba;

        @Override // java.util.concurrent.Callable
        public T call() throws Exception {
            aacq.aab(this.aab);
            return this.aaba.call();
        }

        aabc(int i, Callable<T> callable) {
            this.aab = i;
            this.aaba = callable;
        }
    }

    static <T> Task<T> aaba(int i, Callable<T> callable) {
        return Tasks.callInBackground(new aabb(i, callable));
    }

    static class aabb<T> implements Callable<T> {
        private int aab;
        private Callable<T> aaba;

        @Override // java.util.concurrent.Callable
        public T call() throws Exception {
            try {
                if (HiHealthKitClient.getInstance().bindServiceWithOutCheckEmui(this.aab) == null) {
                    throw new ApiException(new Status(HiHealthStatusCodes.API_EXCEPTION_ERROR, "the client is not connected"));
                }
                T tCall = this.aaba.call();
                aacq.aab();
                return tCall;
            } catch (Throwable th) {
                aacq.aab();
                throw th;
            }
        }

        aabb(int i, Callable<T> callable) {
            this.aab = i;
            this.aaba = callable;
        }
    }

    public static <T> Task<T> aab(Callable<T> callable) {
        return Tasks.callInBackground(new aab(callable));
    }

    public static <T> Task<T> aab(int i, Callable<T> callable) {
        return Tasks.callInBackground(new aaba(i, callable));
    }
}

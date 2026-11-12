package defpackage;

import android.annotation.SuppressLint;
import android.app.job.JobInfo;
import android.content.ComponentName;
import android.content.Context;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.work.BackoffPolicy;
import androidx.work.Constraints;
import androidx.work.NetworkType;
import androidx.work.impl.background.systemjob.SystemJobInfoConverterExtKt;
import androidx.work.impl.background.systemjob.SystemJobService;
import androidx.work.impl.model.WorkSpec;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(api = 23)
@SuppressLint({"ClassVerificationFailure"})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class dwo {
    public static final String d = ppe.i("SystemJobInfoConverter");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ComponentName f15996a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h14 f15997b;
    public final boolean c;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f15998a;

        static {
            int[] iArr = new int[NetworkType.values().length];
            f15998a = iArr;
            try {
                iArr[NetworkType.NOT_REQUIRED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15998a[NetworkType.CONNECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15998a[NetworkType.UNMETERED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15998a[NetworkType.NOT_ROAMING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15998a[NetworkType.METERED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public dwo(Context context, h14 h14Var, boolean z) {
        this.f15997b = h14Var;
        this.f15996a = new ComponentName(context.getApplicationContext(), (Class<?>) SystemJobService.class);
        this.c = z;
    }

    @RequiresApi(24)
    public static JobInfo.TriggerContentUri b(Constraints.ContentUriTrigger contentUriTrigger) {
        return new JobInfo.TriggerContentUri(contentUriTrigger.getUri(), contentUriTrigger.getIsTriggeredForDescendants() ? 1 : 0);
    }

    public static int c(NetworkType networkType) {
        int i = a.f15998a[networkType.ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 3) {
            return 2;
        }
        if (i == 4) {
            return 3;
        }
        if (i == 5) {
            return 4;
        }
        ppe.e().a(d, "API version too low. Cannot convert network type value " + networkType);
        return 1;
    }

    public static void d(JobInfo.Builder builder, NetworkType networkType) {
        if (Build.VERSION.SDK_INT < 30 || networkType != NetworkType.TEMPORARILY_UNMETERED) {
            builder.setRequiredNetworkType(c(networkType));
        } else {
            builder.setRequiredNetwork(new NetworkRequest.Builder().addCapability(25).build());
        }
    }

    public JobInfo a(WorkSpec workSpec, int i) {
        String traceTag;
        Constraints constraints = workSpec.constraints;
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("EXTRA_WORK_SPEC_ID", workSpec.id);
        persistableBundle.putInt("EXTRA_WORK_SPEC_GENERATION", workSpec.getGeneration());
        persistableBundle.putBoolean("EXTRA_IS_PERIODIC", workSpec.isPeriodic());
        JobInfo.Builder extras = new JobInfo.Builder(i, this.f15996a).setRequiresCharging(constraints.getRequiresCharging()).setRequiresDeviceIdle(constraints.getRequiresDeviceIdle()).setExtras(persistableBundle);
        NetworkRequest requiredNetworkRequest = constraints.getRequiredNetworkRequest();
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 28 || requiredNetworkRequest == null) {
            d(extras, constraints.getRequiredNetworkType());
        } else {
            SystemJobInfoConverterExtKt.setRequiredNetworkRequest(extras, requiredNetworkRequest);
        }
        if (!constraints.getRequiresDeviceIdle()) {
            extras.setBackoffCriteria(workSpec.backoffDelayDuration, workSpec.backoffPolicy == BackoffPolicy.LINEAR ? 0 : 1);
        }
        long jMax = Math.max(workSpec.calculateNextRunTime() - this.f15997b.currentTimeMillis(), 0L);
        if (i2 <= 28 || jMax > 0) {
            extras.setMinimumLatency(jMax);
        } else if (!workSpec.expedited && this.c) {
            extras.setImportantWhileForeground(true);
        }
        if (constraints.hasContentUriTriggers()) {
            Iterator<Constraints.ContentUriTrigger> it = constraints.getContentUriTriggers().iterator();
            while (it.hasNext()) {
                extras.addTriggerContentUri(b(it.next()));
            }
            extras.setTriggerContentUpdateDelay(constraints.getContentTriggerUpdateDelayMillis());
            extras.setTriggerContentMaxDelay(constraints.getContentTriggerMaxDelayMillis());
        }
        extras.setPersisted(false);
        int i3 = Build.VERSION.SDK_INT;
        extras.setRequiresBatteryNotLow(constraints.getRequiresBatteryNotLow());
        extras.setRequiresStorageNotLow(constraints.getRequiresStorageNotLow());
        boolean z = workSpec.runAttemptCount > 0;
        boolean z2 = jMax > 0;
        if (i3 >= 31 && workSpec.expedited && !z && !z2) {
            extras.setExpedited(true);
        }
        if (i3 >= 35 && (traceTag = workSpec.getTraceTag()) != null) {
            extras.setTraceTag(traceTag);
        }
        return extras.build();
    }
}

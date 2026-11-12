package com.mapbox.common.movement;

import android.app.PendingIntent;
import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.location.ActivityRecognition;
import com.google.android.gms.location.ActivityTransitionRequest;
import com.google.android.gms.tasks.Task;
import com.mapbox.common.location.FailedTask;
import com.mapbox.common.location.IncompatibleGooglePlayServicesActivityRecognitionVersion;
import java.lang.reflect.Method;
import o13.l;
import o13.m;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\nJ\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\nJ\u001c\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\nJ\u001c\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\nR\u000e\u0010\u0005\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/mapbox/common/movement/ProxyGoogleActivityRecognitionClient;", "", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "(Landroid/content/Context;)V", "googleActivityRecognitionClient", "removeActivityTransitionUpdates", "Lcom/google/android/gms/tasks/Task;", "Ljava/lang/Void;", BaseGmsClient.KEY_PENDING_INTENT, "Landroid/app/PendingIntent;", "removeActivityUpdates", "requestActivityTransitionUpdates", "activityTransitionRequest", "Lcom/google/android/gms/location/ActivityTransitionRequest;", "requestActivityUpdates", "detectionIntervalMillis", "", "callbackIntent", "Companion", "common_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class ProxyGoogleActivityRecognitionClient {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final l<Boolean> available$delegate = m.b(ProxyGoogleActivityRecognitionClient$Companion$available$2.INSTANCE);
    private static Method removeActivityTransitionUpdates;
    private static Method removeActivityUpdates;
    private static Method requestActivityTransitionUpdates;
    private static Method requestActivityUpdates;
    private final Object googleActivityRecognitionClient;

    public ProxyGoogleActivityRecognitionClient(Context context) {
        context.getClass();
        com.google.android.gms.location.ActivityRecognitionClient client = ActivityRecognition.getClient(context);
        client.getClass();
        this.googleActivityRecognitionClient = client;
    }

    public final Task<Void> removeActivityTransitionUpdates(PendingIntent pendingIntent) {
        pendingIntent.getClass();
        try {
            Method method = removeActivityTransitionUpdates;
            if (method == null) {
                s.m("removeActivityTransitionUpdates");
                throw null;
            }
            Object objInvoke = method.invoke(this.googleActivityRecognitionClient, pendingIntent);
            objInvoke.getClass();
            return (Task) objInvoke;
        } catch (Exception e4) {
            return new FailedTask(e4);
        }
    }

    public final Task<Void> removeActivityUpdates(PendingIntent pendingIntent) {
        pendingIntent.getClass();
        try {
            Method method = removeActivityUpdates;
            if (method == null) {
                s.m("removeActivityUpdates");
                throw null;
            }
            Object objInvoke = method.invoke(this.googleActivityRecognitionClient, pendingIntent);
            objInvoke.getClass();
            return (Task) objInvoke;
        } catch (Exception e4) {
            return new FailedTask(e4);
        }
    }

    public final Task<Void> requestActivityTransitionUpdates(ActivityTransitionRequest activityTransitionRequest, PendingIntent pendingIntent) {
        activityTransitionRequest.getClass();
        pendingIntent.getClass();
        try {
            Method method = requestActivityTransitionUpdates;
            if (method == null) {
                s.m("requestActivityTransitionUpdates");
                throw null;
            }
            Object objInvoke = method.invoke(this.googleActivityRecognitionClient, activityTransitionRequest, pendingIntent);
            objInvoke.getClass();
            return (Task) objInvoke;
        } catch (Exception e4) {
            return new FailedTask(e4);
        }
    }

    public final Task<Void> requestActivityUpdates(long detectionIntervalMillis, PendingIntent callbackIntent) {
        callbackIntent.getClass();
        try {
            Method method = requestActivityUpdates;
            if (method == null) {
                s.m("requestActivityUpdates");
                throw null;
            }
            Object objInvoke = method.invoke(this.googleActivityRecognitionClient, Long.valueOf(detectionIntervalMillis), callbackIntent);
            objInvoke.getClass();
            return (Task) objInvoke;
        } catch (Exception e4) {
            return new FailedTask(e4);
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0005\u0010\u0003R\u001b\u0010\f\u001a\u00020\u00078@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u000e\u001a\u00020\r8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0010\u001a\u00020\r8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0010\u0010\u000fR\u0016\u0010\u0011\u001a\u00020\r8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0011\u0010\u000fR\u0016\u0010\u0012\u001a\u00020\r8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0012\u0010\u000f¨\u0006\u0013"}, d2 = {"Lcom/mapbox/common/movement/ProxyGoogleActivityRecognitionClient$Companion;", "", "<init>", "()V", "", "verifyAndCacheMethods$common_release", "verifyAndCacheMethods", "", "available$delegate", "Lo13/l;", "getAvailable$common_release", "()Z", "available", "Ljava/lang/reflect/Method;", "removeActivityTransitionUpdates", "Ljava/lang/reflect/Method;", "removeActivityUpdates", "requestActivityTransitionUpdates", "requestActivityUpdates", "common_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(j jVar) {
            this();
        }

        public final boolean getAvailable$common_release() {
            return ((Boolean) ProxyGoogleActivityRecognitionClient.available$delegate.getValue()).booleanValue();
        }

        public final void verifyAndCacheMethods$common_release() throws IncompatibleGooglePlayServicesActivityRecognitionVersion {
            try {
                Companion companion = ProxyGoogleActivityRecognitionClient.INSTANCE;
                Method method = com.google.android.gms.location.ActivityRecognitionClient.class.getMethod("requestActivityTransitionUpdates", ActivityTransitionRequest.class, PendingIntent.class);
                method.getClass();
                ProxyGoogleActivityRecognitionClient.requestActivityTransitionUpdates = method;
                Method method2 = com.google.android.gms.location.ActivityRecognitionClient.class.getMethod("requestActivityUpdates", Long.TYPE, PendingIntent.class);
                method2.getClass();
                ProxyGoogleActivityRecognitionClient.requestActivityUpdates = method2;
                Method method3 = com.google.android.gms.location.ActivityRecognitionClient.class.getMethod("removeActivityTransitionUpdates", PendingIntent.class);
                method3.getClass();
                ProxyGoogleActivityRecognitionClient.removeActivityTransitionUpdates = method3;
                Method method4 = com.google.android.gms.location.ActivityRecognitionClient.class.getMethod("removeActivityUpdates", PendingIntent.class);
                method4.getClass();
                ProxyGoogleActivityRecognitionClient.removeActivityUpdates = method4;
            } catch (ClassNotFoundException e4) {
                throw new IncompatibleGooglePlayServicesActivityRecognitionVersion(e4);
            } catch (NoSuchMethodException e14) {
                throw new IncompatibleGooglePlayServicesActivityRecognitionVersion(e14);
            } catch (SecurityException e15) {
                throw new IncompatibleGooglePlayServicesActivityRecognitionVersion(e15);
            }
        }

        private Companion() {
        }
    }
}

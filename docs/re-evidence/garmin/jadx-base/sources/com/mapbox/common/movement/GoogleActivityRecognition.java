package com.mapbox.common.movement;

import a7.b;
import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import aq.s1;
import ch.qos.logback.core.CoreConstants;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.android.gms.location.ActivityRecognitionResult;
import com.google.android.gms.location.ActivityTransition;
import com.google.android.gms.location.ActivityTransitionEvent;
import com.google.android.gms.location.ActivityTransitionRequest;
import com.google.android.gms.location.ActivityTransitionResult;
import com.google.android.gms.location.DetectedActivity;
import com.google.android.gms.tasks.Task;
import com.google.gson.internal.a;
import com.mapbox.common.MapboxCommonLogger;
import com.mapbox.common.MovementInfo;
import com.mapbox.common.MovementMode;
import com.mapbox.common.MovementModeProvider;
import com.mapbox.common.location.GoogleDeviceLocationProviderKt;
import com.mapbox.common.location.LocationServiceUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import o13.l;
import o13.m;
import o13.p;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p13.u0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000]\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\b\u0006*\u0001+\b\u0001\u0018\u0000 .2\u00020\u0001:\u0002./B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0017¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0017¢\u0006\u0004\b\u0011\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0012\u0010\nJ\u0017\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0017\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0019R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00130\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001d\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u001b\u0010*\u001a\u00020%8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0014\u0010,\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-¨\u00060"}, d2 = {"Lcom/mapbox/common/movement/GoogleActivityRecognition;", "Lcom/mapbox/common/movement/ActivityRecognitionClient;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lcom/mapbox/common/movement/GoogleActivityRecognition$Mode;", "mode", "<init>", "(Landroid/content/Context;Lcom/mapbox/common/movement/GoogleActivityRecognition$Mode;)V", "", "hasActivityRecognitionPermission", "()Z", "", "activityRecognitionPermissionName", "()Ljava/lang/String;", "", TtmlNode.START, "()V", "stop", "isPlatformActivityRecognitionAvailable", "Lcom/mapbox/common/movement/ActivityRecognitionClient$Observer;", "observer", "addObserver", "(Lcom/mapbox/common/movement/ActivityRecognitionClient$Observer;)V", "removeObserver", "Landroid/content/Context;", "Lcom/mapbox/common/movement/GoogleActivityRecognition$Mode;", "Ljava/util/concurrent/CopyOnWriteArrayList;", "observers", "Ljava/util/concurrent/CopyOnWriteArrayList;", "isSubscribed", "Z", "Lcom/mapbox/common/movement/ProxyGoogleActivityRecognitionClient;", "activityClient", "Lcom/mapbox/common/movement/ProxyGoogleActivityRecognitionClient;", "Landroid/content/IntentFilter;", "activityUpdatesIntentFilter", "Landroid/content/IntentFilter;", "Landroid/app/PendingIntent;", "activityUpdatesPendingIntent$delegate", "Lo13/l;", "getActivityUpdatesPendingIntent", "()Landroid/app/PendingIntent;", "activityUpdatesPendingIntent", "com/mapbox/common/movement/GoogleActivityRecognition$broadcast$1", "broadcast", "Lcom/mapbox/common/movement/GoogleActivityRecognition$broadcast$1;", "Companion", "Mode", "common_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class GoogleActivityRecognition implements ActivityRecognitionClient {
    private static final long ACTIVITY_DETECTION_INTERVAL_MILLIS = 1000;
    public static final String ACTIVITY_UPDATES_ACTION = "com.mapbox.common.movement.action.ACTIVITY_RECOGNITION_UPDATES";
    private static final int ACTIVITY_UPDATES_CODE = 1000;
    public static final String TAG = "ActivityRecognitionObserver";
    private static final int TRANSITION_API_CONFIDENCE_SCORE = 85;
    private final ProxyGoogleActivityRecognitionClient activityClient;
    private final IntentFilter activityUpdatesIntentFilter;

    /* JADX INFO: renamed from: activityUpdatesPendingIntent$delegate, reason: from kotlin metadata */
    private final l activityUpdatesPendingIntent;
    private final GoogleActivityRecognition$broadcast$1 broadcast;
    private final Context context;
    private boolean isSubscribed;
    private final Mode mode;
    private final CopyOnWriteArrayList<ActivityRecognitionClient.Observer> observers;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final l<List<ActivityTransition>> TRANSITION_API_MONITORING_TYPES$delegate = m.b(GoogleActivityRecognition$Companion$TRANSITION_API_MONITORING_TYPES$2.INSTANCE);
    public static final String GOOGLE_ACTIVITY_RECOGNITION_CLIENT = "com.google.android.gms.location.ActivityRecognitionClient";
    private static boolean googlePlayActivityRecognitionBundled = LocationServiceUtils.isOnClasspath(GOOGLE_ACTIVITY_RECOGNITION_CLIENT);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/mapbox/common/movement/GoogleActivityRecognition$Mode;", "", "(Ljava/lang/String;I)V", "TRANSITION_API", "SAMPLING_API", "common_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public enum Mode {
        TRANSITION_API,
        SAMPLING_API
    }

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Mode.values().length];
            try {
                iArr[Mode.TRANSITION_API.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Mode.SAMPLING_API.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [com.mapbox.common.movement.GoogleActivityRecognition$broadcast$1] */
    public GoogleActivityRecognition(Context context, Mode mode) {
        context.getClass();
        mode.getClass();
        this.context = context;
        this.mode = mode;
        this.observers = new CopyOnWriteArrayList<>();
        this.activityClient = new ProxyGoogleActivityRecognitionClient(context);
        this.activityUpdatesIntentFilter = new IntentFilter(ACTIVITY_UPDATES_ACTION);
        this.activityUpdatesPendingIntent = m.b(new GoogleActivityRecognition$activityUpdatesPendingIntent$2(this));
        this.broadcast = new BroadcastReceiver() { // from class: com.mapbox.common.movement.GoogleActivityRecognition$broadcast$1

            @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[GoogleActivityRecognition.Mode.values().length];
                    try {
                        iArr[GoogleActivityRecognition.Mode.TRANSITION_API.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[GoogleActivityRecognition.Mode.SAMPLING_API.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context2, Intent intent) {
                MovementInfo movementInfo$default;
                MovementInfo movementInfo$default2;
                context2.getClass();
                intent.getClass();
                int i14 = WhenMappings.$EnumSwitchMapping$0[this.this$0.mode.ordinal()];
                if (i14 == 1) {
                    if (ActivityTransitionResult.hasResult(intent)) {
                        MapboxCommonLogger.INSTANCE.logD$common_release(GoogleActivityRecognition.TAG, "Activity transition result received");
                        ActivityTransitionResult activityTransitionResultExtractResult = ActivityTransitionResult.extractResult(intent);
                        if (activityTransitionResultExtractResult == null || (movementInfo$default = GoogleActivityRecognition.Companion.toMovementInfo$default(GoogleActivityRecognition.INSTANCE, activityTransitionResultExtractResult, (MovementModeProvider) null, 1, (Object) null)) == null) {
                            return;
                        }
                        Iterator it = this.this$0.observers.iterator();
                        while (it.hasNext()) {
                            ((ActivityRecognitionClient.Observer) it.next()).onMovementInfo(movementInfo$default);
                        }
                        return;
                    }
                    return;
                }
                if (i14 == 2 && ActivityRecognitionResult.hasResult(intent)) {
                    MapboxCommonLogger.INSTANCE.logD$common_release(GoogleActivityRecognition.TAG, "Activity recognition result received");
                    ActivityRecognitionResult activityRecognitionResultExtractResult = ActivityRecognitionResult.extractResult(intent);
                    if (activityRecognitionResultExtractResult == null || (movementInfo$default2 = GoogleActivityRecognition.Companion.toMovementInfo$default(GoogleActivityRecognition.INSTANCE, activityRecognitionResultExtractResult, (MovementModeProvider) null, 1, (Object) null)) == null) {
                        return;
                    }
                    Iterator it3 = this.this$0.observers.iterator();
                    while (it3.hasNext()) {
                        ((ActivityRecognitionClient.Observer) it3.next()).onMovementInfo(movementInfo$default2);
                    }
                }
            }
        };
    }

    private final String activityRecognitionPermissionName() {
        return Build.VERSION.SDK_INT >= 29 ? "android.permission.ACTIVITY_RECOGNITION" : "com.google.android.gms.permission.ACTIVITY_RECOGNITION";
    }

    private final PendingIntent getActivityUpdatesPendingIntent() {
        Object value = this.activityUpdatesPendingIntent.getValue();
        value.getClass();
        return (PendingIntent) value;
    }

    private final boolean hasActivityRecognitionPermission() {
        return b.checkSelfPermission(this.context, activityRecognitionPermissionName()) == 0;
    }

    @Override // com.mapbox.common.movement.ActivityRecognitionClient
    public void addObserver(ActivityRecognitionClient.Observer observer) {
        observer.getClass();
        this.observers.add(observer);
    }

    @Override // com.mapbox.common.movement.ActivityRecognitionClient
    public boolean isPlatformActivityRecognitionAvailable() {
        return hasActivityRecognitionPermission();
    }

    @Override // com.mapbox.common.movement.ActivityRecognitionClient
    public void removeObserver(ActivityRecognitionClient.Observer observer) {
        observer.getClass();
        this.observers.remove(observer);
    }

    @Override // com.mapbox.common.movement.ActivityRecognitionClient
    @SuppressLint({"MissingPermission"})
    public synchronized void start() {
        try {
            if (!this.isSubscribed && hasActivityRecognitionPermission()) {
                this.isSubscribed = true;
                b.registerReceiver(this.context, this.broadcast, this.activityUpdatesIntentFilter, 2);
                int i14 = WhenMappings.$EnumSwitchMapping$0[this.mode.ordinal()];
                if (i14 == 1) {
                    Companion companion = INSTANCE;
                    companion.withLogs(this.activityClient.requestActivityTransitionUpdates(new ActivityTransitionRequest(companion.getTRANSITION_API_MONITORING_TYPES()), getActivityUpdatesPendingIntent()), "requestActivityTransitionUpdates");
                } else if (i14 == 2) {
                    INSTANCE.withLogs(this.activityClient.requestActivityUpdates(1000L, getActivityUpdatesPendingIntent()), "requestActivityUpdates");
                }
                return;
            }
            MapboxCommonLogger.INSTANCE.logD$common_release(TAG, "start() skipped. isSubscribed: " + this.isSubscribed + ", has permission: " + hasActivityRecognitionPermission());
        } catch (Throwable th3) {
            throw th3;
        }
    }

    @Override // com.mapbox.common.movement.ActivityRecognitionClient
    @SuppressLint({"MissingPermission"})
    public synchronized void stop() {
        try {
            if (this.isSubscribed && hasActivityRecognitionPermission()) {
                this.isSubscribed = false;
                this.context.unregisterReceiver(this.broadcast);
                int i14 = WhenMappings.$EnumSwitchMapping$0[this.mode.ordinal()];
                if (i14 == 1) {
                    INSTANCE.withLogs(this.activityClient.removeActivityTransitionUpdates(getActivityUpdatesPendingIntent()), "removeActivityTransitionUpdates");
                } else if (i14 == 2) {
                    INSTANCE.withLogs(this.activityClient.removeActivityUpdates(getActivityUpdatesPendingIntent()), "removeActivityUpdates");
                }
                return;
            }
            MapboxCommonLogger.INSTANCE.logD$common_release(TAG, "stop() skipped. isSubscribed: " + this.isSubscribed + ", has permission: " + hasActivityRecognitionPermission());
        } catch (Throwable th3) {
            throw th3;
        }
    }

    @Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\b\u001a\u0004\u0018\u00010\u0007*\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ!\u0010\b\u001a\u0004\u0018\u00010\u0007*\u0004\u0018\u00010\n2\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\u000bJ\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J-\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012\"\u0004\b\u0000\u0010\u0011*\b\u0012\u0004\u0012\u00028\u00000\u00122\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u001a\u001a\u00020\u0017H\u0000¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\u00020\u00138\u0006X\u0087T¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u0012\u0004\b\u001d\u0010\u0003R!\u0010$\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R(\u0010%\u001a\u00020\u00178\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b%\u0010&\u0012\u0004\b*\u0010\u0003\u001a\u0004\b'\u0010\u0019\"\u0004\b(\u0010)R\u0014\u0010,\u001a\u00020+8\u0002X\u0082T¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010.\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00100\u001a\u00020\u00138\u0000X\u0080T¢\u0006\u0006\n\u0004\b0\u0010\u001cR\u0014\u00101\u001a\u00020\u00138\u0000X\u0080T¢\u0006\u0006\n\u0004\b1\u0010\u001cR\u0014\u00102\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b2\u0010/¨\u00063"}, d2 = {"Lcom/mapbox/common/movement/GoogleActivityRecognition$Companion;", "", "<init>", "()V", "Lcom/google/android/gms/location/ActivityTransitionResult;", "Lcom/mapbox/common/MovementModeProvider;", "provider", "Lcom/mapbox/common/MovementInfo;", "toMovementInfo", "(Lcom/google/android/gms/location/ActivityTransitionResult;Lcom/mapbox/common/MovementModeProvider;)Lcom/mapbox/common/MovementInfo;", "Lcom/google/android/gms/location/ActivityRecognitionResult;", "(Lcom/google/android/gms/location/ActivityRecognitionResult;Lcom/mapbox/common/MovementModeProvider;)Lcom/mapbox/common/MovementInfo;", "", "activityType", "Lcom/mapbox/common/MovementMode;", "fromGmsType", "(I)Lcom/mapbox/common/MovementMode;", "T", "Lcom/google/android/gms/tasks/Task;", "", "name", "withLogs", "(Lcom/google/android/gms/tasks/Task;Ljava/lang/String;)Lcom/google/android/gms/tasks/Task;", "", "isAvailable$common_release", "()Z", "isAvailable", "ACTIVITY_UPDATES_ACTION", "Ljava/lang/String;", "getACTIVITY_UPDATES_ACTION$annotations", "", "Lcom/google/android/gms/location/ActivityTransition;", "TRANSITION_API_MONITORING_TYPES$delegate", "Lo13/l;", "getTRANSITION_API_MONITORING_TYPES", "()Ljava/util/List;", "TRANSITION_API_MONITORING_TYPES", "googlePlayActivityRecognitionBundled", "Z", "getGooglePlayActivityRecognitionBundled$common_release", "setGooglePlayActivityRecognitionBundled$common_release", "(Z)V", "getGooglePlayActivityRecognitionBundled$common_release$annotations", "", "ACTIVITY_DETECTION_INTERVAL_MILLIS", "J", "ACTIVITY_UPDATES_CODE", "I", "GOOGLE_ACTIVITY_RECOGNITION_CLIENT", "TAG", "TRANSITION_API_CONFIDENCE_SCORE", "common_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(j jVar) {
            this();
        }

        private final MovementMode fromGmsType(int activityType) {
            if (activityType == 0) {
                return MovementMode.IN_VEHICLE;
            }
            if (activityType == 1) {
                return MovementMode.CYCLING;
            }
            if (activityType == 2) {
                return MovementMode.ON_FOOT;
            }
            if (activityType == 3) {
                return MovementMode.STATIONARY;
            }
            if (activityType == 7) {
                return MovementMode.WALKING;
            }
            if (activityType != 8) {
                return null;
            }
            return MovementMode.RUNNING;
        }

        public static /* synthetic */ void getACTIVITY_UPDATES_ACTION$annotations() {
        }

        public static /* synthetic */ void getGooglePlayActivityRecognitionBundled$common_release$annotations() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final List<ActivityTransition> getTRANSITION_API_MONITORING_TYPES() {
            return (List) GoogleActivityRecognition.TRANSITION_API_MONITORING_TYPES$delegate.getValue();
        }

        private final MovementInfo toMovementInfo(ActivityTransitionResult activityTransitionResult, MovementModeProvider movementModeProvider) {
            List<ActivityTransitionEvent> transitionEvents;
            MovementMode movementModeFromGmsType;
            if (activityTransitionResult == null || (transitionEvents = activityTransitionResult.getTransitionEvents()) == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (ActivityTransitionEvent activityTransitionEvent : transitionEvents) {
                p pVar = (activityTransitionEvent.getTransitionType() == 0 && (movementModeFromGmsType = GoogleActivityRecognition.INSTANCE.fromGmsType(activityTransitionEvent.getActivityType())) != null) ? new p(movementModeFromGmsType, 85) : null;
                if (pVar != null) {
                    arrayList.add(pVar);
                }
            }
            return new MovementInfo(new HashMap(u0.l(arrayList)), movementModeProvider);
        }

        public static /* synthetic */ MovementInfo toMovementInfo$default(Companion companion, ActivityTransitionResult activityTransitionResult, MovementModeProvider movementModeProvider, int i14, Object obj) {
            if ((i14 & 1) != 0) {
                movementModeProvider = MovementModeProvider.SYSTEM;
            }
            return companion.toMovementInfo(activityTransitionResult, movementModeProvider);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final <T> Task<T> withLogs(Task<T> task, String str) {
            Task<T> taskAddOnFailureListener = task.addOnSuccessListener(new s1(new GoogleActivityRecognition$Companion$withLogs$1(str), 6)).addOnFailureListener(new a(str, 6));
            taskAddOnFailureListener.getClass();
            return taskAddOnFailureListener;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void withLogs$lambda$6(e23.l lVar, Object obj) {
            lVar.getClass();
            lVar.invoke(obj);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void withLogs$lambda$7(String str, Exception exc) {
            str.getClass();
            exc.getClass();
            MapboxCommonLogger.INSTANCE.logD$common_release(GoogleActivityRecognition.TAG, str + " failure: " + exc);
        }

        public final boolean getGooglePlayActivityRecognitionBundled$common_release() {
            return GoogleActivityRecognition.googlePlayActivityRecognitionBundled;
        }

        public final boolean isAvailable$common_release() {
            return LocationServiceUtils.getGooglePlayServicesBundled() && getGooglePlayActivityRecognitionBundled$common_release() && ProxyGoogleActivityRecognitionClient.INSTANCE.getAvailable$common_release() && GoogleDeviceLocationProviderKt.getGooglePlayServicesHelper().isGooglePlayServicesReady();
        }

        public final void setGooglePlayActivityRecognitionBundled$common_release(boolean z14) {
            GoogleActivityRecognition.googlePlayActivityRecognitionBundled = z14;
        }

        private Companion() {
        }

        public static /* synthetic */ MovementInfo toMovementInfo$default(Companion companion, ActivityRecognitionResult activityRecognitionResult, MovementModeProvider movementModeProvider, int i14, Object obj) {
            if ((i14 & 1) != 0) {
                movementModeProvider = MovementModeProvider.SYSTEM;
            }
            return companion.toMovementInfo(activityRecognitionResult, movementModeProvider);
        }

        private final MovementInfo toMovementInfo(ActivityRecognitionResult activityRecognitionResult, MovementModeProvider movementModeProvider) {
            List<DetectedActivity> probableActivities;
            if (activityRecognitionResult == null || (probableActivities = activityRecognitionResult.getProbableActivities()) == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (DetectedActivity detectedActivity : probableActivities) {
                MovementMode movementModeFromGmsType = GoogleActivityRecognition.INSTANCE.fromGmsType(detectedActivity.getType());
                p pVar = movementModeFromGmsType != null ? new p(movementModeFromGmsType, Integer.valueOf(detectedActivity.getConfidence())) : null;
                if (pVar != null) {
                    arrayList.add(pVar);
                }
            }
            return new MovementInfo(new HashMap(u0.l(arrayList)), movementModeProvider);
        }
    }

    public /* synthetic */ GoogleActivityRecognition(Context context, Mode mode, int i14, j jVar) {
        this(context, (i14 & 2) != 0 ? Mode.TRANSITION_API : mode);
    }
}

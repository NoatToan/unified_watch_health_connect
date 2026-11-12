package com.mapbox.common.movement;

import android.os.Handler;
import android.os.Looper;
import cd0.f;
import com.mapbox.bindgen.Expected;
import com.mapbox.bindgen.ExpectedFactory;
import com.mapbox.common.MapboxSDKCommon;
import com.mapbox.common.MovementInfo;
import com.mapbox.common.MovementInfoCallback;
import com.mapbox.common.MovementModeObserver;
import com.mapbox.common.MovementModeProvider;
import com.mapbox.common.MovementMonitorInterface;
import java.util.LinkedHashMap;
import java.util.Map;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0001\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\nH\u0002J\u0010\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\nH\u0002J\u0010\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0007H\u0016J\u0010\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\nH\u0016J\u0010\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0007H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/mapbox/common/movement/AndroidMovementMonitor;", "Lcom/mapbox/common/MovementMonitorInterface;", "activityRecognition", "Lcom/mapbox/common/movement/ActivityRecognitionClient;", "(Lcom/mapbox/common/movement/ActivityRecognitionClient;)V", "observers", "", "Lcom/mapbox/common/MovementModeObserver;", "Landroid/os/Handler;", "sdkMovementInfo", "Lcom/mapbox/common/MovementInfo;", "systemMovementInfo", "getMovementInfo", "", "callback", "Lcom/mapbox/common/MovementInfoCallback;", "notifyObservers", "movementInfo", "onPlatformMovementInfoAvailable", "info", "registerObserver", "observer", "setMovementInfo", "unregisterObserver", "Companion", "common_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class AndroidMovementMonitor implements MovementMonitorInterface {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String NO_MOVEMENT_INFO_ERROR = "Movement is not available";
    private final ActivityRecognitionClient activityRecognition;
    private final Map<MovementModeObserver, Handler> observers;
    private MovementInfo sdkMovementInfo;
    private MovementInfo systemMovementInfo;

    public AndroidMovementMonitor(ActivityRecognitionClient activityRecognitionClient) {
        activityRecognitionClient.getClass();
        this.activityRecognition = activityRecognitionClient;
        this.observers = new LinkedHashMap();
        activityRecognitionClient.addObserver(new ActivityRecognitionClient.Observer() { // from class: com.mapbox.common.movement.AndroidMovementMonitor.1
            @Override // com.mapbox.common.movement.ActivityRecognitionClient.Observer
            public synchronized void onMovementInfo(MovementInfo info) {
                info.getClass();
                AndroidMovementMonitor.this.onPlatformMovementInfoAvailable(info);
            }
        });
    }

    public static final MovementMonitorInterface create() {
        return INSTANCE.create();
    }

    private final void notifyObservers(MovementInfo movementInfo) {
        for (Map.Entry<MovementModeObserver, Handler> entry : this.observers.entrySet()) {
            MovementModeObserver key = entry.getKey();
            Handler value = entry.getValue();
            if (value == null || s.g(value.getLooper(), Looper.myLooper())) {
                key.onMovementModeChanged(movementInfo);
            } else {
                value.post(new f(25, key, movementInfo));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void notifyObservers$lambda$2$lambda$1(MovementModeObserver movementModeObserver, MovementInfo movementInfo) {
        movementModeObserver.getClass();
        movementInfo.getClass();
        movementModeObserver.onMovementModeChanged(movementInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void onPlatformMovementInfoAvailable(MovementInfo info) {
        this.systemMovementInfo = info;
        notifyObservers(info);
    }

    @Override // com.mapbox.common.MovementMonitorInterface
    public synchronized void getMovementInfo(MovementInfoCallback callback) {
        Expected<String, MovementInfo> expectedCreateError;
        try {
            callback.getClass();
            MovementInfo movementInfo = this.systemMovementInfo;
            if (movementInfo == null) {
                movementInfo = this.sdkMovementInfo;
            }
            if (movementInfo != null) {
                expectedCreateError = ExpectedFactory.createValue(movementInfo);
                expectedCreateError.getClass();
            } else {
                expectedCreateError = ExpectedFactory.createError(NO_MOVEMENT_INFO_ERROR);
                expectedCreateError.getClass();
            }
            callback.run(expectedCreateError);
        } catch (Throwable th3) {
            throw th3;
        }
    }

    @Override // com.mapbox.common.MovementMonitorInterface
    public synchronized void registerObserver(MovementModeObserver observer) {
        try {
            observer.getClass();
            Map<MovementModeObserver, Handler> map = this.observers;
            Looper looperMyLooper = Looper.myLooper();
            map.put(observer, looperMyLooper != null ? new Handler(looperMyLooper) : null);
            if (this.observers.size() == 1) {
                this.activityRecognition.start();
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    @Override // com.mapbox.common.MovementMonitorInterface
    public synchronized void setMovementInfo(MovementInfo movementInfo) {
        movementInfo.getClass();
        if (!this.activityRecognition.isPlatformActivityRecognitionAvailable()) {
            this.sdkMovementInfo = new MovementInfo(movementInfo.getMovementMode(), MovementModeProvider.SDK);
            notifyObservers(movementInfo);
        }
    }

    @Override // com.mapbox.common.MovementMonitorInterface
    public synchronized void unregisterObserver(MovementModeObserver observer) {
        observer.getClass();
        this.observers.remove(observer);
        if (this.observers.isEmpty()) {
            this.activityRecognition.stop();
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/mapbox/common/movement/AndroidMovementMonitor$Companion;", "", "()V", "NO_MOVEMENT_INFO_ERROR", "", "create", "Lcom/mapbox/common/MovementMonitorInterface;", "common_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(j jVar) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final MovementMonitorInterface create() {
            ActivityRecognitionClient googleActivityRecognition;
            if (GoogleActivityRecognition.INSTANCE.isAvailable$common_release()) {
                googleActivityRecognition = new GoogleActivityRecognition(MapboxSDKCommon.INSTANCE.getContext(), null, 2, 0 == true ? 1 : 0);
            } else {
                googleActivityRecognition = StubActivityRecognition.INSTANCE;
            }
            return new AndroidMovementMonitor(googleActivityRecognition);
        }

        private Companion() {
        }
    }
}

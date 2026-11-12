package com.mapbox.maps.plugin.viewport;

import android.animation.ValueAnimator;
import android.os.Handler;
import android.os.Looper;
import at0.c;
import com.mapbox.common.Cancelable;
import com.mapbox.maps.plugin.animation.CameraAnimationsLifecycleListener;
import com.mapbox.maps.plugin.animation.CameraAnimationsPlugin;
import com.mapbox.maps.plugin.animation.CameraAnimationsUtils;
import com.mapbox.maps.plugin.animation.CameraAnimatorType;
import com.mapbox.maps.plugin.animation.MapAnimationOwnerRegistry;
import com.mapbox.maps.plugin.delegates.MapDelegateProvider;
import com.mapbox.maps.plugin.viewport.data.DefaultViewportTransitionOptions;
import com.mapbox.maps.plugin.viewport.data.FollowPuckViewportStateOptions;
import com.mapbox.maps.plugin.viewport.data.OverviewViewportStateOptions;
import com.mapbox.maps.plugin.viewport.data.ViewportOptions;
import com.mapbox.maps.plugin.viewport.data.ViewportStatusChangeReason;
import com.mapbox.maps.plugin.viewport.state.FollowPuckViewportState;
import com.mapbox.maps.plugin.viewport.state.FollowPuckViewportStateImpl;
import com.mapbox.maps.plugin.viewport.state.OverviewViewportState;
import com.mapbox.maps.plugin.viewport.state.OverviewViewportStateImpl;
import com.mapbox.maps.plugin.viewport.state.ViewportState;
import com.mapbox.maps.plugin.viewport.transition.DefaultViewportTransition;
import com.mapbox.maps.plugin.viewport.transition.DefaultViewportTransitionImpl;
import com.mapbox.maps.plugin.viewport.transition.ImmediateViewportTransition;
import com.mapbox.maps.plugin.viewport.transition.ViewportTransition;
import com.mapbox.maps.plugin.viewport.util.ViewportTelemetryEvents;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.m0;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u008f\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0006\b\u0001\u0018\u0000 @2\u00020\u0001:\u0001@B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u001cH\u0016J\b\u0010%\u001a\u00020#H\u0016J\b\u0010&\u001a\u00020#H\u0016J\u0010\u0010'\u001a\u00020(2\u0006\u0010\u0014\u001a\u00020)H\u0016J\u0010\u0010*\u001a\u00020+2\u0006\u0010\u0014\u001a\u00020,H\u0016J\b\u0010-\u001a\u00020\rH\u0016J\u0010\u0010.\u001a\u00020/2\u0006\u0010\u0014\u001a\u000200H\u0016J \u00101\u001a\u00020#2\u0006\u00102\u001a\u00020\u001e2\u0006\u00103\u001a\u00020\u001e2\u0006\u00104\u001a\u000205H\u0002J\u0010\u00106\u001a\u00020#2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0010\u00107\u001a\u00020#2\u0006\u0010$\u001a\u00020\u001cH\u0016J$\u00108\u001a\u00020#2\u0006\u00109\u001a\u00020:2\b\u0010;\u001a\u0004\u0018\u00010\r2\b\u0010<\u001a\u0004\u0018\u00010=H\u0016J\u0018\u0010>\u001a\u00020#2\u0006\u0010?\u001a\u00020\u001e2\u0006\u00104\u001a\u000205H\u0002R\u0010\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u00020\rX\u0096.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0014\u001a\u00020\u0015X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u001e@RX\u0096\u000e¢\u0006\b\n\u0000\u001a\u0004\b \u0010!¨\u0006A"}, d2 = {"Lcom/mapbox/maps/plugin/viewport/ViewportPluginImpl;", "Lcom/mapbox/maps/plugin/viewport/ViewportPlugin;", "handler", "Landroid/os/Handler;", "(Landroid/os/Handler;)V", "cameraAnimationsLifecycleListener", "com/mapbox/maps/plugin/viewport/ViewportPluginImpl$cameraAnimationsLifecycleListener$1", "Lcom/mapbox/maps/plugin/viewport/ViewportPluginImpl$cameraAnimationsLifecycleListener$1;", "cameraPlugin", "Lcom/mapbox/maps/plugin/animation/CameraAnimationsPlugin;", "currentCancelable", "Lcom/mapbox/common/Cancelable;", "defaultTransition", "Lcom/mapbox/maps/plugin/viewport/transition/ViewportTransition;", "getDefaultTransition", "()Lcom/mapbox/maps/plugin/viewport/transition/ViewportTransition;", "setDefaultTransition", "(Lcom/mapbox/maps/plugin/viewport/transition/ViewportTransition;)V", "delegateProvider", "Lcom/mapbox/maps/plugin/delegates/MapDelegateProvider;", "options", "Lcom/mapbox/maps/plugin/viewport/data/ViewportOptions;", "getOptions", "()Lcom/mapbox/maps/plugin/viewport/data/ViewportOptions;", "setOptions", "(Lcom/mapbox/maps/plugin/viewport/data/ViewportOptions;)V", "registeredStatusObservers", "Ljava/util/concurrent/CopyOnWriteArraySet;", "Lcom/mapbox/maps/plugin/viewport/ViewportStatusObserver;", "<set-?>", "Lcom/mapbox/maps/plugin/viewport/ViewportStatus;", "status", "getStatus", "()Lcom/mapbox/maps/plugin/viewport/ViewportStatus;", "addStatusObserver", "", "viewportStatusObserver", "cleanup", "idle", "makeDefaultViewportTransition", "Lcom/mapbox/maps/plugin/viewport/transition/DefaultViewportTransition;", "Lcom/mapbox/maps/plugin/viewport/data/DefaultViewportTransitionOptions;", "makeFollowPuckViewportState", "Lcom/mapbox/maps/plugin/viewport/state/FollowPuckViewportState;", "Lcom/mapbox/maps/plugin/viewport/data/FollowPuckViewportStateOptions;", "makeImmediateViewportTransition", "makeOverviewViewportState", "Lcom/mapbox/maps/plugin/viewport/state/OverviewViewportState;", "Lcom/mapbox/maps/plugin/viewport/data/OverviewViewportStateOptions;", "notifyStatusChanged", "previousStatus", "currentStatus", "reason", "Lcom/mapbox/maps/plugin/viewport/data/ViewportStatusChangeReason;", "onDelegateProvider", "removeStatusObserver", "transitionTo", "targetState", "Lcom/mapbox/maps/plugin/viewport/state/ViewportState;", "transition", "completionListener", "Lcom/mapbox/maps/plugin/viewport/CompletionListener;", "updateStatus", "targetStatus", "Companion", "plugin-viewport_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class ViewportPluginImpl implements ViewportPlugin {
    public static final String VIEWPORT_CAMERA_OWNER = "VIEWPORT_CAMERA_OWNER";
    private final ViewportPluginImpl$cameraAnimationsLifecycleListener$1 cameraAnimationsLifecycleListener;
    private CameraAnimationsPlugin cameraPlugin;
    private Cancelable currentCancelable;
    public ViewportTransition defaultTransition;
    private MapDelegateProvider delegateProvider;
    private final Handler handler;
    private ViewportOptions options;
    private final CopyOnWriteArraySet<ViewportStatusObserver> registeredStatusObservers;
    private ViewportStatus status;

    /* JADX WARN: Type inference failed for: r1v2, types: [com.mapbox.maps.plugin.viewport.ViewportPluginImpl$cameraAnimationsLifecycleListener$1] */
    public ViewportPluginImpl(Handler handler) {
        handler.getClass();
        this.handler = handler;
        this.registeredStatusObservers = new CopyOnWriteArraySet<>();
        this.cameraAnimationsLifecycleListener = new CameraAnimationsLifecycleListener() { // from class: com.mapbox.maps.plugin.viewport.ViewportPluginImpl$cameraAnimationsLifecycleListener$1
            @Override // com.mapbox.maps.plugin.animation.CameraAnimationsLifecycleListener
            public void onAnimatorCancelling(CameraAnimatorType type, ValueAnimator animator, String owner) {
                type.getClass();
                animator.getClass();
            }

            @Override // com.mapbox.maps.plugin.animation.CameraAnimationsLifecycleListener
            public void onAnimatorEnding(CameraAnimatorType type, ValueAnimator animator, String owner) {
                type.getClass();
                animator.getClass();
            }

            @Override // com.mapbox.maps.plugin.animation.CameraAnimationsLifecycleListener
            public void onAnimatorInterrupting(CameraAnimatorType type, ValueAnimator runningAnimator, String runningAnimatorOwner, ValueAnimator newAnimator, String newAnimatorOwner) {
                type.getClass();
                runningAnimator.getClass();
                newAnimator.getClass();
            }

            @Override // com.mapbox.maps.plugin.animation.CameraAnimationsLifecycleListener
            public void onAnimatorStarting(CameraAnimatorType type, ValueAnimator animator, String owner) {
                type.getClass();
                animator.getClass();
                if (!s.g(owner, ViewportPluginImpl.VIEWPORT_CAMERA_OWNER) && s.g(owner, MapAnimationOwnerRegistry.GESTURES) && this.this$0.getOptions().getTransitionsToIdleUponUserInteraction()) {
                    Cancelable cancelable = this.this$0.currentCancelable;
                    if (cancelable != null) {
                        cancelable.cancel();
                    }
                    this.this$0.currentCancelable = null;
                    this.this$0.updateStatus(ViewportStatus.Idle.INSTANCE, ViewportStatusChangeReason.USER_INTERACTION);
                }
            }
        };
        this.status = ViewportStatus.Idle.INSTANCE;
        this.options = new ViewportOptions.Builder().build();
    }

    private final void notifyStatusChanged(ViewportStatus previousStatus, ViewportStatus currentStatus, ViewportStatusChangeReason reason) {
        Iterator<T> it = this.registeredStatusObservers.iterator();
        while (it.hasNext()) {
            this.handler.post(new c((ViewportStatusObserver) it.next(), previousStatus, currentStatus, reason, 9));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void notifyStatusChanged$lambda$4$lambda$3(ViewportStatusObserver viewportStatusObserver, ViewportStatus viewportStatus, ViewportStatus viewportStatus2, ViewportStatusChangeReason viewportStatusChangeReason) {
        viewportStatus.getClass();
        viewportStatus2.getClass();
        viewportStatusChangeReason.getClass();
        viewportStatusObserver.onViewportStatusChanged(viewportStatus, viewportStatus2, viewportStatusChangeReason);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void transitionTo$lambda$2(m0 m0Var, ViewportState viewportState, ViewportPluginImpl viewportPluginImpl, CompletionListener completionListener, boolean z14) {
        m0Var.getClass();
        viewportState.getClass();
        viewportPluginImpl.getClass();
        m0Var.f105804a = true;
        if (z14) {
            viewportState.startUpdatingCamera();
            viewportPluginImpl.currentCancelable = new a(viewportState, 0);
            viewportPluginImpl.updateStatus(new ViewportStatus.State(viewportState), ViewportStatusChangeReason.TRANSITION_SUCCEEDED);
        } else {
            viewportPluginImpl.currentCancelable = null;
            viewportPluginImpl.updateStatus(ViewportStatus.Idle.INSTANCE, ViewportStatusChangeReason.TRANSITION_FAILED);
        }
        if (completionListener != null) {
            completionListener.onComplete(z14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void transitionTo$lambda$2$lambda$1(ViewportState viewportState) {
        viewportState.getClass();
        viewportState.stopUpdatingCamera();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateStatus(ViewportStatus targetStatus, ViewportStatusChangeReason reason) {
        if (s.g(targetStatus, getStatus())) {
            return;
        }
        ViewportStatus status = getStatus();
        this.status = targetStatus;
        notifyStatusChanged(status, targetStatus, reason);
    }

    @Override // com.mapbox.maps.plugin.viewport.ViewportPlugin
    public void addStatusObserver(ViewportStatusObserver viewportStatusObserver) {
        viewportStatusObserver.getClass();
        this.registeredStatusObservers.add(viewportStatusObserver);
    }

    @Override // com.mapbox.maps.plugin.MapPlugin
    public void cleanup() {
        CameraAnimationsPlugin cameraAnimationsPlugin = this.cameraPlugin;
        if (cameraAnimationsPlugin != null) {
            cameraAnimationsPlugin.removeCameraAnimationsLifecycleListener(this.cameraAnimationsLifecycleListener);
        } else {
            s.m("cameraPlugin");
            throw null;
        }
    }

    @Override // com.mapbox.maps.plugin.viewport.ViewportPlugin
    public ViewportTransition getDefaultTransition() {
        ViewportTransition viewportTransition = this.defaultTransition;
        if (viewportTransition != null) {
            return viewportTransition;
        }
        s.m("defaultTransition");
        throw null;
    }

    @Override // com.mapbox.maps.plugin.viewport.ViewportPlugin
    public ViewportOptions getOptions() {
        return this.options;
    }

    @Override // com.mapbox.maps.plugin.viewport.ViewportPlugin
    public ViewportStatus getStatus() {
        return this.status;
    }

    @Override // com.mapbox.maps.plugin.viewport.ViewportPlugin
    public void idle() {
        ViewportStatus status = getStatus();
        ViewportStatus.Idle idle = ViewportStatus.Idle.INSTANCE;
        if (s.g(status, idle)) {
            return;
        }
        Cancelable cancelable = this.currentCancelable;
        if (cancelable != null) {
            cancelable.cancel();
        }
        this.currentCancelable = null;
        updateStatus(idle, ViewportStatusChangeReason.IDLE_REQUESTED);
    }

    @Override // com.mapbox.maps.plugin.MapPlugin
    public void initialize() {
        ViewportPlugin.DefaultImpls.initialize(this);
    }

    @Override // com.mapbox.maps.plugin.viewport.ViewportPlugin
    public DefaultViewportTransition makeDefaultViewportTransition(DefaultViewportTransitionOptions options) {
        options.getClass();
        MapDelegateProvider mapDelegateProvider = this.delegateProvider;
        if (mapDelegateProvider != null) {
            return new DefaultViewportTransitionImpl(mapDelegateProvider, options, null, 4, null);
        }
        s.m("delegateProvider");
        throw null;
    }

    @Override // com.mapbox.maps.plugin.viewport.ViewportPlugin
    public FollowPuckViewportState makeFollowPuckViewportState(FollowPuckViewportStateOptions options) {
        options.getClass();
        ViewportTelemetryEvents.INSTANCE.getStateFollowPuck().increment();
        MapDelegateProvider mapDelegateProvider = this.delegateProvider;
        if (mapDelegateProvider != null) {
            return new FollowPuckViewportStateImpl(mapDelegateProvider, options, null, 4, null);
        }
        s.m("delegateProvider");
        throw null;
    }

    @Override // com.mapbox.maps.plugin.viewport.ViewportPlugin
    public ViewportTransition makeImmediateViewportTransition() {
        MapDelegateProvider mapDelegateProvider = this.delegateProvider;
        if (mapDelegateProvider != null) {
            return new ImmediateViewportTransition(mapDelegateProvider);
        }
        s.m("delegateProvider");
        throw null;
    }

    @Override // com.mapbox.maps.plugin.viewport.ViewportPlugin
    public OverviewViewportState makeOverviewViewportState(OverviewViewportStateOptions options) {
        options.getClass();
        ViewportTelemetryEvents.INSTANCE.getStateOverview().increment();
        MapDelegateProvider mapDelegateProvider = this.delegateProvider;
        if (mapDelegateProvider != null) {
            return new OverviewViewportStateImpl(mapDelegateProvider, options, null, 4, null);
        }
        s.m("delegateProvider");
        throw null;
    }

    @Override // com.mapbox.maps.plugin.MapPlugin
    public void onDelegateProvider(MapDelegateProvider delegateProvider) {
        delegateProvider.getClass();
        this.delegateProvider = delegateProvider;
        CameraAnimationsPlugin camera = CameraAnimationsUtils.getCamera(delegateProvider.getMapPluginProviderDelegate());
        this.cameraPlugin = camera;
        if (camera == null) {
            s.m("cameraPlugin");
            throw null;
        }
        camera.addCameraAnimationsLifecycleListener(this.cameraAnimationsLifecycleListener);
        setDefaultTransition(new DefaultViewportTransitionImpl(delegateProvider, new DefaultViewportTransitionOptions.Builder().build(), null, 4, null));
    }

    @Override // com.mapbox.maps.plugin.viewport.ViewportPlugin
    public void removeStatusObserver(ViewportStatusObserver viewportStatusObserver) {
        viewportStatusObserver.getClass();
        this.registeredStatusObservers.remove(viewportStatusObserver);
    }

    @Override // com.mapbox.maps.plugin.viewport.ViewportPlugin
    public void setDefaultTransition(ViewportTransition viewportTransition) {
        viewportTransition.getClass();
        this.defaultTransition = viewportTransition;
    }

    @Override // com.mapbox.maps.plugin.viewport.ViewportPlugin
    public void setOptions(ViewportOptions viewportOptions) {
        viewportOptions.getClass();
        this.options = viewportOptions;
    }

    @Override // com.mapbox.maps.plugin.viewport.ViewportPlugin
    public void transitionTo(final ViewportState targetState, ViewportTransition transition, final CompletionListener completionListener) {
        targetState.getClass();
        ViewportTelemetryEvents.INSTANCE.getStateTransition().increment();
        ViewportStatus status = getStatus();
        if (status instanceof ViewportStatus.State) {
            if (((ViewportStatus.State) status).getState() == targetState) {
                if (completionListener != null) {
                    completionListener.onComplete(true);
                    return;
                }
                return;
            }
        } else if ((status instanceof ViewportStatus.Transition) && ((ViewportStatus.Transition) status).getToState() == targetState) {
            if (completionListener != null) {
                completionListener.onComplete(false);
                return;
            }
            return;
        }
        Cancelable cancelable = this.currentCancelable;
        if (cancelable != null) {
            cancelable.cancel();
        }
        this.currentCancelable = null;
        if (transition == null) {
            transition = getDefaultTransition();
        }
        final m0 m0Var = new m0();
        Cancelable cancelableRun = transition.run(targetState, new CompletionListener() { // from class: com.mapbox.maps.plugin.viewport.b
            @Override // com.mapbox.maps.plugin.viewport.CompletionListener
            public final void onComplete(boolean z14) {
                ViewportPluginImpl.transitionTo$lambda$2(m0Var, targetState, this, completionListener, z14);
            }
        });
        if (m0Var.f105804a) {
            return;
        }
        this.currentCancelable = cancelableRun;
        updateStatus(new ViewportStatus.Transition(transition, targetState), ViewportStatusChangeReason.TRANSITION_STARTED);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ViewportPluginImpl() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public /* synthetic */ ViewportPluginImpl(Handler handler, int i14, j jVar) {
        this((i14 & 1) != 0 ? new Handler(Looper.getMainLooper()) : handler);
    }
}

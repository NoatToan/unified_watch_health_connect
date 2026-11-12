package com.mapbox.maps.plugin.viewport;

import com.mapbox.maps.plugin.MapPlugin;
import com.mapbox.maps.plugin.delegates.MapDelegateProvider;
import com.mapbox.maps.plugin.viewport.data.DefaultViewportTransitionOptions;
import com.mapbox.maps.plugin.viewport.data.FollowPuckViewportStateOptions;
import com.mapbox.maps.plugin.viewport.data.OverviewViewportStateOptions;
import com.mapbox.maps.plugin.viewport.data.ViewportOptions;
import com.mapbox.maps.plugin.viewport.state.FollowPuckViewportState;
import com.mapbox.maps.plugin.viewport.state.OverviewViewportState;
import com.mapbox.maps.plugin.viewport.state.ViewportState;
import com.mapbox.maps.plugin.viewport.transition.DefaultViewportTransition;
import com.mapbox.maps.plugin.viewport.transition.ViewportTransition;
import org.apache.commons.lang3.e;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H&J\b\u0010\u0016\u001a\u00020\u0013H&J\u0012\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\b\u001a\u00020\u0019H&J\u0012\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\b\u001a\u00020\u001cH&J\b\u0010\u001d\u001a\u00020\u0003H&J\u0010\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\b\u001a\u00020 H&J\u0010\u0010!\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H&J(\u0010\"\u001a\u00020\u00132\u0006\u0010#\u001a\u00020$2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010&\u001a\u0004\u0018\u00010'H&R\u0018\u0010\u0002\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u0018\u0010\b\u001a\u00020\tX¦\u000e¢\u0006\f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0012\u0010\u000e\u001a\u00020\u000fX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006("}, d2 = {"Lcom/mapbox/maps/plugin/viewport/ViewportPlugin;", "Lcom/mapbox/maps/plugin/MapPlugin;", "defaultTransition", "Lcom/mapbox/maps/plugin/viewport/transition/ViewportTransition;", "getDefaultTransition", "()Lcom/mapbox/maps/plugin/viewport/transition/ViewportTransition;", "setDefaultTransition", "(Lcom/mapbox/maps/plugin/viewport/transition/ViewportTransition;)V", "options", "Lcom/mapbox/maps/plugin/viewport/data/ViewportOptions;", "getOptions", "()Lcom/mapbox/maps/plugin/viewport/data/ViewportOptions;", "setOptions", "(Lcom/mapbox/maps/plugin/viewport/data/ViewportOptions;)V", "status", "Lcom/mapbox/maps/plugin/viewport/ViewportStatus;", "getStatus", "()Lcom/mapbox/maps/plugin/viewport/ViewportStatus;", "addStatusObserver", "", "viewportStatusObserver", "Lcom/mapbox/maps/plugin/viewport/ViewportStatusObserver;", "idle", "makeDefaultViewportTransition", "Lcom/mapbox/maps/plugin/viewport/transition/DefaultViewportTransition;", "Lcom/mapbox/maps/plugin/viewport/data/DefaultViewportTransitionOptions;", "makeFollowPuckViewportState", "Lcom/mapbox/maps/plugin/viewport/state/FollowPuckViewportState;", "Lcom/mapbox/maps/plugin/viewport/data/FollowPuckViewportStateOptions;", "makeImmediateViewportTransition", "makeOverviewViewportState", "Lcom/mapbox/maps/plugin/viewport/state/OverviewViewportState;", "Lcom/mapbox/maps/plugin/viewport/data/OverviewViewportStateOptions;", "removeStatusObserver", "transitionTo", "targetState", "Lcom/mapbox/maps/plugin/viewport/state/ViewportState;", "transition", "completionListener", "Lcom/mapbox/maps/plugin/viewport/CompletionListener;", "sdk-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public interface ViewportPlugin extends MapPlugin {

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class DefaultImpls {
        public static void cleanup(ViewportPlugin viewportPlugin) {
            MapPlugin.DefaultImpls.cleanup(viewportPlugin);
        }

        public static void initialize(ViewportPlugin viewportPlugin) {
            MapPlugin.DefaultImpls.initialize(viewportPlugin);
        }

        public static /* synthetic */ DefaultViewportTransition makeDefaultViewportTransition$default(ViewportPlugin viewportPlugin, DefaultViewportTransitionOptions defaultViewportTransitionOptions, int i14, Object obj) {
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: makeDefaultViewportTransition");
                return null;
            }
            if ((i14 & 1) != 0) {
                defaultViewportTransitionOptions = new DefaultViewportTransitionOptions.Builder().build();
            }
            return viewportPlugin.makeDefaultViewportTransition(defaultViewportTransitionOptions);
        }

        public static /* synthetic */ FollowPuckViewportState makeFollowPuckViewportState$default(ViewportPlugin viewportPlugin, FollowPuckViewportStateOptions followPuckViewportStateOptions, int i14, Object obj) {
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: makeFollowPuckViewportState");
                return null;
            }
            if ((i14 & 1) != 0) {
                followPuckViewportStateOptions = new FollowPuckViewportStateOptions.Builder().build();
            }
            return viewportPlugin.makeFollowPuckViewportState(followPuckViewportStateOptions);
        }

        public static void onDelegateProvider(ViewportPlugin viewportPlugin, MapDelegateProvider mapDelegateProvider) {
            mapDelegateProvider.getClass();
            MapPlugin.DefaultImpls.onDelegateProvider(viewportPlugin, mapDelegateProvider);
        }

        public static /* synthetic */ void transitionTo$default(ViewportPlugin viewportPlugin, ViewportState viewportState, ViewportTransition viewportTransition, CompletionListener completionListener, int i14, Object obj) {
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: transitionTo");
                return;
            }
            if ((i14 & 2) != 0) {
                viewportTransition = null;
            }
            if ((i14 & 4) != 0) {
                completionListener = null;
            }
            viewportPlugin.transitionTo(viewportState, viewportTransition, completionListener);
        }
    }

    void addStatusObserver(ViewportStatusObserver viewportStatusObserver);

    ViewportTransition getDefaultTransition();

    ViewportOptions getOptions();

    ViewportStatus getStatus();

    void idle();

    DefaultViewportTransition makeDefaultViewportTransition(DefaultViewportTransitionOptions options);

    FollowPuckViewportState makeFollowPuckViewportState(FollowPuckViewportStateOptions options);

    ViewportTransition makeImmediateViewportTransition();

    OverviewViewportState makeOverviewViewportState(OverviewViewportStateOptions options);

    void removeStatusObserver(ViewportStatusObserver viewportStatusObserver);

    void setDefaultTransition(ViewportTransition viewportTransition);

    void setOptions(ViewportOptions viewportOptions);

    void transitionTo(ViewportState targetState, ViewportTransition transition, CompletionListener completionListener);
}

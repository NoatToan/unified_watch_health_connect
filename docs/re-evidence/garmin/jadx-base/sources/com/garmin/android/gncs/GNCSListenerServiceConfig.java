package com.garmin.android.gncs;

import am.j;
import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import gh2.n;
import j20.x;

/* JADX INFO: loaded from: classes11.dex */
public final class GNCSListenerServiceConfig {
    private IGNCSAppCallback appCallback;
    private Context appContext;
    private boolean musicControlsSupported;
    private n remoteConfig;
    private boolean smartNotificationsSupported;

    public static class GNCSListenerServiceConfigBuilder {
        private boolean smartNotificationsSupported;
        private Context appContext = null;
        private n remoteConfig = null;
        private IGNCSAppCallback appCallback = null;
        private boolean musicControlsSupported = false;

        public GNCSListenerServiceConfigBuilder appCallback(IGNCSAppCallback iGNCSAppCallback) {
            this.appCallback = iGNCSAppCallback;
            return this;
        }

        public GNCSListenerServiceConfig build() {
            Context context = this.appContext;
            if (context == null) {
                x.l("missing appContext, should call 'GNCSListenerServiceConfigBuilder.context'");
                return null;
            }
            IGNCSAppCallback iGNCSAppCallback = this.appCallback;
            if (iGNCSAppCallback == null) {
                x.l("missing appCallback, should call 'GNCSListenerServiceConfigBuilder.appCallback'");
                return null;
            }
            boolean z14 = this.smartNotificationsSupported;
            if (z14 || this.musicControlsSupported) {
                return new GNCSListenerServiceConfig(context, this.remoteConfig, iGNCSAppCallback, z14, this.musicControlsSupported, 0);
            }
            org.apache.commons.lang3.e.w("at least one of 'GNCSListenerServiceConfigBuilder.smartNotificationsSupported(true)' or 'GNCSListenerServiceConfigBuilder.musicControlsSupported(true)' must be called");
            return null;
        }

        public GNCSListenerServiceConfigBuilder context(Context context) {
            this.appContext = context.getApplicationContext();
            return this;
        }

        public GNCSListenerServiceConfigBuilder musicControlsSupported(boolean z14) {
            this.musicControlsSupported = z14;
            return this;
        }

        public GNCSListenerServiceConfigBuilder remoteConfig(n nVar) {
            this.remoteConfig = nVar;
            return this;
        }

        public GNCSListenerServiceConfigBuilder smartNotificationsSupported(boolean z14) {
            this.smartNotificationsSupported = z14;
            return this;
        }
    }

    private GNCSListenerServiceConfig(Context context, n nVar, IGNCSAppCallback iGNCSAppCallback, boolean z14, boolean z15) {
        this.appContext = context;
        this.remoteConfig = nVar;
        this.appCallback = iGNCSAppCallback;
        this.smartNotificationsSupported = z14;
        this.musicControlsSupported = z15;
    }

    public IGNCSAppCallback getAppCallback() {
        return this.appCallback;
    }

    public Context getAppContext() {
        return this.appContext;
    }

    public n getRemoteConfig() {
        return this.remoteConfig;
    }

    public boolean isMusicControlsSupported() {
        return this.musicControlsSupported;
    }

    public boolean isSmartNotificationsSupported() {
        return this.smartNotificationsSupported;
    }

    public String toString() {
        StringBuilder sb3 = new StringBuilder("GNCSListenerServiceConfig{appContext=");
        sb3.append(this.appContext);
        sb3.append(", remoteConfig=");
        sb3.append(this.remoteConfig);
        sb3.append(", appCallback=");
        sb3.append(this.appCallback);
        sb3.append(", smartNotificationsSupported=");
        sb3.append(this.smartNotificationsSupported);
        sb3.append(", musicControlsSupported=");
        return j.t(sb3, this.musicControlsSupported, CoreConstants.CURLY_RIGHT);
    }

    private GNCSListenerServiceConfig() {
    }

    public /* synthetic */ GNCSListenerServiceConfig(Context context, n nVar, IGNCSAppCallback iGNCSAppCallback, boolean z14, boolean z15, int i14) {
        this(context, nVar, iGNCSAppCallback, z14, z15);
    }
}

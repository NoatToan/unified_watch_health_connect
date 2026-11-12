package com.google.firebase.crashlytics;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.analytics.connector.AnalyticsConnector;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.analytics.AnalyticsEventReceiver;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
class a implements AnalyticsConnector.AnalyticsConnectorListener {
    public static final String c = "_o";
    public static final String d = "name";
    public static final String e = "params";
    public static final String f = "clx";
    private AnalyticsEventReceiver a;
    private AnalyticsEventReceiver b;

    private static void a(@Nullable AnalyticsEventReceiver analyticsEventReceiver, @NonNull String str, @NonNull Bundle bundle) {
        if (analyticsEventReceiver == null) {
            return;
        }
        analyticsEventReceiver.onEvent(str, bundle);
    }

    private void b(@NonNull String str, @NonNull Bundle bundle) {
        a("clx".equals(bundle.getString(c)) ? this.a : this.b, str, bundle);
    }

    public void c(@Nullable AnalyticsEventReceiver analyticsEventReceiver) {
        this.b = analyticsEventReceiver;
    }

    public void d(@Nullable AnalyticsEventReceiver analyticsEventReceiver) {
        this.a = analyticsEventReceiver;
    }

    @Override // com.google.firebase.analytics.connector.AnalyticsConnector.AnalyticsConnectorListener
    public void onMessageTriggered(int i, @Nullable Bundle bundle) {
        String string;
        Logger.getLogger().v(String.format(Locale.US, "Analytics listener received message. ID: %d, Extras: %s", Integer.valueOf(i), bundle));
        if (bundle == null || (string = bundle.getString("name")) == null) {
            return;
        }
        Bundle bundle2 = bundle.getBundle("params");
        if (bundle2 == null) {
            bundle2 = new Bundle();
        }
        b(string, bundle2);
    }
}

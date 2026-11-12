package com.google.firebase.abt.component;

import android.content.Context;
import androidx.annotation.GuardedBy;
import androidx.annotation.VisibleForTesting;
import com.google.firebase.abt.FirebaseABTesting;
import com.google.firebase.analytics.connector.AnalyticsConnector;
import com.google.firebase.inject.Provider;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class AbtComponent {

    @GuardedBy("this")
    private final Map<String, FirebaseABTesting> a = new HashMap();
    private final Context b;
    private final Provider<AnalyticsConnector> c;

    @VisibleForTesting(otherwise = 3)
    public AbtComponent(Context context, Provider<AnalyticsConnector> provider) {
        this.b = context;
        this.c = provider;
    }

    @VisibleForTesting
    public FirebaseABTesting createAbtInstance(String str) {
        return new FirebaseABTesting(this.b, this.c, str);
    }

    public synchronized FirebaseABTesting get(String str) {
        if (!this.a.containsKey(str)) {
            this.a.put(str, createAbtInstance(str));
        }
        return this.a.get(str);
    }
}

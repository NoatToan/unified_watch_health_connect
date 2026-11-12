package mq0;

import android.content.Context;
import android.content.SharedPreferences;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lmq0/c;", "", "<init>", "()V", "gcm-insights_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f120214a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static SharedPreferences f120215b;

    private c() {
    }

    public static SharedPreferences a(Context context) {
        if (f120215b == null) {
            SharedPreferences sharedPreferences = context.getSharedPreferences(context.getString(R.string.key_shared_preferences_name), 0);
            sharedPreferences.getClass();
            f120215b = sharedPreferences;
        }
        SharedPreferences sharedPreferences2 = f120215b;
        if (sharedPreferences2 != null) {
            return sharedPreferences2;
        }
        s.m("gcmSettingManagerPrefs");
        throw null;
    }
}

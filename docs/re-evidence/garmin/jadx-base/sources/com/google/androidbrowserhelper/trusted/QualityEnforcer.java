package com.google.androidbrowserhelper.trusted;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import r.b;

/* JADX INFO: loaded from: classes14.dex */
public class QualityEnforcer extends b {
    static final String CRASH = "quality_enforcement.crash";
    static final String KEY_CRASH_REASON = "crash_reason";
    static final String KEY_SUCCESS = "success";
    private static final String TAG = "TwaQualityEnforcement";
    private final Delegate mDelegate;

    public interface Delegate {
        void crash(String str);
    }

    public QualityEnforcer() {
        this.mDelegate = new a(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$new$0(String str) {
        throw new RuntimeException(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$new$1(String str) {
        new Handler(Looper.getMainLooper()).post(new com.garmin.android.gncs.telephony.a(str, 3));
    }

    @Override // r.b
    public Bundle extraCallbackWithResult(String str, Bundle bundle) {
        String string = bundle != null ? bundle.getString(KEY_CRASH_REASON) : null;
        if (string == null) {
            return Bundle.EMPTY;
        }
        Bundle bundle2 = new Bundle();
        if (str.equals(CRASH)) {
            bundle2.putBoolean("success", true);
            this.mDelegate.crash(string);
        }
        return bundle2;
    }

    public QualityEnforcer(Delegate delegate) {
        this.mDelegate = delegate;
    }
}

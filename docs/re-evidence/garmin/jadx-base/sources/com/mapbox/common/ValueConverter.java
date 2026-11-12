package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.bindgen.Expected;
import com.mapbox.bindgen.Value;

/* JADX INFO: loaded from: classes2.dex */
public final class ValueConverter {
    protected long peer;

    public static class ValueConverterPeerCleaner implements Runnable {
        private long peer;

        public ValueConverterPeerCleaner(long j8) {
            this.peer = j8;
        }

        @Override // java.lang.Runnable
        public void run() {
            ValueConverter.cleanNativePeer(this.peer);
        }
    }

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
    }

    public ValueConverter(long j8) {
        setPeer(j8);
    }

    public static native void cleanNativePeer(long j8);

    public static native Expected<String, Value> fromJson(String str);

    private void setPeer(long j8) {
        this.peer = j8;
        if (j8 == 0) {
            return;
        }
        CleanerService.register(this, new ValueConverterPeerCleaner(j8));
    }

    public static native String toJson(Value value);

    public static native String toJson(Value value, int i14);
}

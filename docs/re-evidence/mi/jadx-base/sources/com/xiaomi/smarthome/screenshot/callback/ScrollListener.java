package com.xiaomi.smarthome.screenshot.callback;

/* JADX INFO: loaded from: classes2.dex */
public interface ScrollListener {

    public static abstract class Adapter implements ScrollListener {
        @Override // com.xiaomi.smarthome.screenshot.callback.ScrollListener
        public void onFail() {
        }

        @Override // com.xiaomi.smarthome.screenshot.callback.ScrollListener
        public void onPreScroll() {
        }
    }

    void onFail();

    void onPreScroll();

    void onSuccess();
}

package com.xiaomi.hm.health.generated.callback;

import android.view.View;

/* JADX INFO: loaded from: classes21.dex */
public final class OnClickListener implements View.OnClickListener {
    public final Listener a;
    public final int b;

    public interface Listener {
        void _internalCallbackOnClick(int sourceId, View callbackArg_0);
    }

    public OnClickListener(Listener listener, int sourceId) {
        this.a = listener;
        this.b = sourceId;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View callbackArg_0) {
        this.a._internalCallbackOnClick(this.b, callbackArg_0);
    }
}

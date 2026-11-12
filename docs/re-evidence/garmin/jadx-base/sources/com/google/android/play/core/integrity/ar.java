package com.google.android.play.core.integrity;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;

/* JADX INFO: loaded from: classes14.dex */
final class ar extends ResultReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ as f53308a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ar(as asVar, Handler handler) {
        super(handler);
        this.f53308a = asVar;
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i14, Bundle bundle) {
        if (i14 == 1) {
            this.f53308a.f53309a.trySetResult(3);
        } else if (i14 == 2) {
            this.f53308a.f53309a.trySetResult(2);
        } else {
            if (i14 != 3) {
                return;
            }
            this.f53308a.f53309a.trySetResult(1);
        }
    }
}

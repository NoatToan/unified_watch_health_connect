package com.google.firebase.messaging;

import android.content.Intent;
import android.os.Binder;
import android.os.Process;
import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: classes2.dex */
class WithinAppServiceBinder extends Binder {
    private final IntentHandler intentHandler;

    public interface IntentHandler {
        Task<Void> handle(Intent intent);
    }

    public WithinAppServiceBinder(IntentHandler intentHandler) {
        this.intentHandler = intentHandler;
    }

    public void send(WithinAppServiceConnection.BindRequest bindRequest) {
        if (Binder.getCallingUid() == Process.myUid()) {
            this.intentHandler.handle(bindRequest.intent).addOnCompleteListener(new bv2.g(1), new k(bindRequest, 2));
        } else {
            com.garmin.proto.generated.a.h("Binding only allowed within app");
        }
    }
}

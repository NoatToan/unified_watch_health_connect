package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.base.zas;

/* JADX INFO: loaded from: classes3.dex */
final class u0 extends zas {
    private final /* synthetic */ zacn b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(zacn zacnVar, Looper looper) {
        super(looper);
        this.b = zacnVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            PendingResult<?> pendingResult = (PendingResult) message.obj;
            synchronized (this.b.e) {
                zacn zacnVar = (zacn) Preconditions.checkNotNull(this.b.b);
                if (pendingResult == null) {
                    zacnVar.d(new Status(13, "Transform returned null"));
                } else if (pendingResult instanceof zacc) {
                    zacnVar.d(((zacc) pendingResult).a());
                } else {
                    zacnVar.zaa(pendingResult);
                }
            }
            return;
        }
        if (i == 1) {
            RuntimeException runtimeException = (RuntimeException) message.obj;
            String strValueOf = String.valueOf(runtimeException.getMessage());
            Log.e("TransformedResultImpl", strValueOf.length() != 0 ? "Runtime exception on the transformation worker thread: ".concat(strValueOf) : new String("Runtime exception on the transformation worker thread: "));
            throw runtimeException;
        }
        StringBuilder sb = new StringBuilder(70);
        sb.append("TransformationResultHandler received unknown message type: ");
        sb.append(i);
        Log.e("TransformedResultImpl", sb.toString());
    }
}

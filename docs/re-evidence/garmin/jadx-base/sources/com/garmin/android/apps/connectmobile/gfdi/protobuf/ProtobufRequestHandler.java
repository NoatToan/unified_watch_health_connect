package com.garmin.android.apps.connectmobile.gfdi.protobuf;

import android.content.Context;
import com.garmin.proto.generated.GDISmartProto;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes8.dex */
public abstract class ProtobufRequestHandler implements Runnable {
    protected WeakReference<Context> contextRef;
    protected long deviceId;
    protected int requestId;
    protected GDISmartProto.Smart requestMsg;

    public ProtobufRequestHandler(Context context, long j8, int i14, GDISmartProto.Smart smart) {
        this.contextRef = new WeakReference<>(context);
        this.deviceId = j8;
        this.requestId = i14;
        this.requestMsg = smart;
    }
}

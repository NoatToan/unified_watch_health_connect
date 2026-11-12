package com.xiaomi.continuity.channel;

import android.content.Context;
import com.xiaomi.continuity.ServiceName;
import com.xiaomi.continuity.jni.NObject;
import com.xiaomi.continuity.netbus.LinkAddress;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes7.dex */
class NChannelManager extends NObject {

    public static class a implements Executor {
        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public NChannelManager(Context context, ContinuityConnectionManager continuityConnectionManager) {
        NObject.setClassLoader(context.getClassLoader());
        initialize(context, continuityConnectionManager, new a());
    }

    private native void initialize(Context context, ContinuityConnectionManager continuityConnectionManager, Executor executor);

    public native int confirmChannel(int i, int i2, String str);

    public native int createChannel(String str, ServiceName serviceName, ClientChannelOptionsV2 clientChannelOptionsV2, ChannelListener channelListener, Executor executor);

    public native int createChannel2(LinkAddress linkAddress, ServiceName serviceName, ClientChannelOptionsV2 clientChannelOptionsV2, ChannelListener channelListener, Executor executor);

    public native int destroyChannel(int i);

    public native int registerChannelListener(ServiceName serviceName, ServerChannelOptions serverChannelOptions, ChannelListener channelListener, Executor executor);

    public native int unregisterChannelListener(ServiceName serviceName);
}

package com.garmin.feature.garminpay.devicedrivensocket;

import com.garmin.android.gncs.NotificationConstants;
import ig2.d;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0014\b\u0007\u0018\u00002\u00020\u0001:\u0001!B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J(\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0096 ¢\u0006\u0004\b\b\u0010\tJH\u0010\u0010\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0096 ¢\u0006\u0004\b\u0010\u0010\u0011J(\u0010\u0014\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0004H\u0096 ¢\u0006\u0004\b\u0014\u0010\u0015J(\u0010\u0016\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0004H\u0096 ¢\u0006\u0004\b\u0016\u0010\u0015J \u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u000eH\u0096 ¢\u0006\u0004\b\u0018\u0010\u0019J \u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u000eH\u0096 ¢\u0006\u0004\b\u001a\u0010\u0019J\u0018\u0010\u001b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004H\u0096 ¢\u0006\u0004\b\u001b\u0010\u001cJ\u0018\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0004H\u0096 ¢\u0006\u0004\b\u001d\u0010\u001cJ \u0010\u001f\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u0004H\u0096 ¢\u0006\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"Lcom/garmin/feature/garminpay/devicedrivensocket/NativeDeviceDrivenSocketApi;", "Lin2/a;", "<init>", "()V", "", "af", NotificationConstants.KEY_DATA_MIME_TYPE, "protocol", "socket", "(III)I", "sockfd", "", "node", "service", "", "ip", "connectByName", "(IIIILjava/lang/String;Ljava/lang/String;[B)I", "buf", "flags", "recv", "(I[BI)I", "send", "fd", "read", "(I[B)I", "write", "select", "(I)I", "close", "timeoutInMs", "setRecvTimeout", "(II)I", "a", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class NativeDeviceDrivenSocketApi implements in2.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f50945a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final d f50946b = new d(25);

    private NativeDeviceDrivenSocketApi() {
        System.loadLibrary("dds");
    }

    public static NativeDeviceDrivenSocketApi a(Scope scope, ParametersHolder parametersHolder) {
        scope.getClass();
        parametersHolder.getClass();
        return new NativeDeviceDrivenSocketApi();
    }

    @Override // in2.a
    public native int close(int fd3);

    @Override // in2.a
    public native int connectByName(int sockfd, int af3, int type, int protocol, String node, String service, byte[] ip3);

    @Override // in2.a
    public native int read(int fd3, byte[] buf);

    @Override // in2.a
    public native int recv(int sockfd, byte[] buf, int flags);

    @Override // in2.a
    public native int select(int sockfd);

    @Override // in2.a
    public native int send(int sockfd, byte[] buf, int flags);

    @Override // in2.a
    public native int setRecvTimeout(int fd3, int timeoutInMs);

    @Override // in2.a
    public native int socket(int af3, int type, int protocol);

    @Override // in2.a
    public native int write(int fd3, byte[] buf);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/feature/garminpay/devicedrivensocket/NativeDeviceDrivenSocketApi$a;", "", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}

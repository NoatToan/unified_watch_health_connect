package com.xiaomi.fitness.device.contact.remote;

import android.os.RemoteException;
import com.xiaomi.wearable.core.client.IDataHandler;
import defpackage.nl5;
import defpackage.utc;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\b&\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\b\u0010\t¨\u0006\r"}, d2 = {"Lcom/xiaomi/fitness/device/contact/remote/DeviceContactEngineInternal;", "Lcom/xiaomi/fitness/device/contact/remote/a$a;", "", "did", "Lcom/xiaomi/wearable/core/client/IDataHandler;", "getDataHandler", "(Ljava/lang/String;)Lcom/xiaomi/wearable/core/client/IDataHandler;", "", "removeDataHandler", "(Ljava/lang/String;)V", "<init>", "()V", "Companion", "device-contact_release"}, k = 1, mv = {2, 0, 0})
public abstract class DeviceContactEngineInternal extends a.AbstractBinderC0416a {
    public abstract /* synthetic */ void addDataHandler(nl5 nl5Var) throws RemoteException;

    public abstract /* synthetic */ int call(String str, byte[] bArr, boolean z, com.xiaomi.fitness.device.contact.export.a aVar) throws RemoteException;

    public abstract /* synthetic */ int callTimeout(String str, byte[] bArr, boolean z, com.xiaomi.fitness.device.contact.export.a aVar, int i) throws RemoteException;

    public abstract /* synthetic */ int callTimeoutWithData(String str, int i, byte[] bArr, boolean z, com.xiaomi.fitness.device.contact.export.a aVar, int i2) throws RemoteException;

    public abstract /* synthetic */ int callWithData(String str, int i, byte[] bArr, boolean z, com.xiaomi.fitness.device.contact.export.a aVar) throws RemoteException;

    public abstract /* synthetic */ void cancelTask(int i) throws RemoteException;

    @NotNull
    public abstract IDataHandler getDataHandler(@NotNull String did);

    public abstract /* synthetic */ boolean isIDLE() throws RemoteException;

    public abstract /* synthetic */ void removeDataHandler(int i, nl5 nl5Var) throws RemoteException;

    public abstract void removeDataHandler(@NotNull String did);

    public abstract /* synthetic */ int sendFile(String str, int i, int i2, String str2, int i3, utc utcVar) throws RemoteException;
}

package com.xiaomi.fitness.eco.device.contact.remote;

import android.os.RemoteException;
import com.xiaomi.eco.common.connect.IEcoMassDataCallback;
import com.xiaomi.fitness.eco.device.contact.export.b;
import defpackage.zrc;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/xiaomi/fitness/eco/device/contact/remote/EcoDeviceContactEngineInternal;", "Lcom/xiaomi/fitness/eco/device/contact/remote/a$a;", "", "did", "Lzrc;", "getDataHandler", "(Ljava/lang/String;)Lzrc;", "<init>", "()V", "Companion", "eco-device-contact_release"}, k = 1, mv = {2, 0, 0})
public abstract class EcoDeviceContactEngineInternal extends a.AbstractBinderC0547a {
    public abstract /* synthetic */ void addDataHandler(int i, com.xiaomi.fitness.eco.device.contact.export.a aVar) throws RemoteException;

    public abstract /* synthetic */ int callEco(String str, byte[] bArr, boolean z, b bVar) throws RemoteException;

    public abstract /* synthetic */ int callEcoTimeout(String str, byte[] bArr, boolean z, b bVar, int i) throws RemoteException;

    public abstract /* synthetic */ void cancelTask(String str, int i) throws RemoteException;

    @NotNull
    public abstract zrc getDataHandler(@NotNull String did);

    public abstract /* synthetic */ boolean isIDLE() throws RemoteException;

    public abstract /* synthetic */ void removeDataHandler(int i, com.xiaomi.fitness.eco.device.contact.export.a aVar) throws RemoteException;

    public abstract /* synthetic */ int sendFile(String str, int i, int i2, String str2, int i3, int i4, IEcoMassDataCallback iEcoMassDataCallback) throws RemoteException;
}

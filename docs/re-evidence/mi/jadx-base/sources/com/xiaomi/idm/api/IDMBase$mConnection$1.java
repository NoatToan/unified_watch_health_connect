package com.xiaomi.idm.api;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.xiaomi.idm.api.IDMBase$mConnection$1;
import com.xiaomi.idm.constant.ResponseCode;
import com.xiaomi.mi_connect_service.IMiConnect;
import defpackage.gpe;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0018\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0012\u0010\u000b\u001a\u00020\f2\b\u0010\b\u001a\u0004\u0018\u00010\rH\u0002¨\u0006\u000e"}, d2 = {"com/xiaomi/idm/api/IDMBase$mConnection$1", "Landroid/content/ServiceConnection;", "onBindingDied", "", "name", "Landroid/content/ComponentName;", "onNullBinding", "onServiceConnected", "service", "Landroid/os/IBinder;", "onServiceDisconnected", "tryGetServiceApiVersion", "", "Lcom/xiaomi/mi_connect_service/IMiConnect;", "IDMSdk_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class IDMBase$mConnection$1 implements ServiceConnection {
    final /* synthetic */ IDMBase this$0;

    public IDMBase$mConnection$1(IDMBase iDMBase) {
        this.this$0 = iDMBase;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onBindingDied$lambda-5, reason: not valid java name */
    public static final void m664onBindingDied$lambda5(IDMBase this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        IDMBase.access$getProcessCallback$p(this$0);
        ResponseCode.MiConnectCode miConnectCode = ResponseCode.MiConnectCode.MI_CONNECT_DISCONNECTED;
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onNullBinding$lambda-6, reason: not valid java name */
    public static final void m665onNullBinding$lambda6(IDMBase this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        IDMBase.access$getProcessCallback$p(this$0);
        ResponseCode.MiConnectCode miConnectCode = ResponseCode.MiConnectCode.MI_CONNECT_DISCONNECTED;
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onServiceConnected$lambda-0, reason: not valid java name */
    public static final void m666onServiceConnected$lambda0(IDMBase this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        IDMBase.access$getProcessCallback$p(this$0);
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onServiceConnected$lambda-1, reason: not valid java name */
    public static final void m667onServiceConnected$lambda1(IDMBase this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        IDMBase.access$getProcessCallback$p(this$0);
        ResponseCode.MiConnectCode miConnectCode = ResponseCode.MiConnectCode.MI_CONNECT_DISCONNECTED;
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onServiceDisconnected$lambda-4, reason: not valid java name */
    public static final void m668onServiceDisconnected$lambda4(IDMBase this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        IDMBase.access$getProcessCallback$p(this$0);
        throw null;
    }

    private final int tryGetServiceApiVersion(IMiConnect service) {
        Object objM886constructorimpl;
        if (service == null) {
            return -1;
        }
        try {
            Result.Companion companion = Result.Companion;
            objM886constructorimpl = Result.m886constructorimpl(Integer.valueOf(service.getServiceApiVersion()));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM886constructorimpl = Result.m886constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM889exceptionOrNullimpl = Result.m889exceptionOrNullimpl(objM886constructorimpl);
        if (thM889exceptionOrNullimpl != null) {
            gpe.b("IDMBase", thM889exceptionOrNullimpl.getMessage(), thM889exceptionOrNullimpl);
        }
        if (Result.m892isFailureimpl(objM886constructorimpl)) {
            objM886constructorimpl = -1;
        }
        Integer num = (Integer) objM886constructorimpl;
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    @Override // android.content.ServiceConnection
    public void onBindingDied(@NotNull ComponentName name) {
        Intrinsics.checkNotNullParameter(name, "name");
        gpe.h("IDMBase", "Id[" + this.this$0.getClientId() + "]: onBindingDied:  name[" + name + AbstractJsonLexerKt.END_LIST, new Object[0]);
        this.this$0.unbindService();
        final IDMBase iDMBase = this.this$0;
        iDMBase.handler.post(new Runnable() { // from class: uqc
            @Override // java.lang.Runnable
            public final void run() {
                IDMBase$mConnection$1.m664onBindingDied$lambda5(iDMBase);
            }
        });
    }

    @Override // android.content.ServiceConnection
    public void onNullBinding(@NotNull ComponentName name) {
        Intrinsics.checkNotNullParameter(name, "name");
        gpe.h("IDMBase", "Id[" + this.this$0.getClientId() + "]: onNullBinding:  name[" + name + AbstractJsonLexerKt.END_LIST, new Object[0]);
        this.this$0.unbindService();
        final IDMBase iDMBase = this.this$0;
        iDMBase.handler.post(new Runnable() { // from class: vqc
            @Override // java.lang.Runnable
            public final void run() {
                IDMBase$mConnection$1.m665onNullBinding$lambda6(iDMBase);
            }
        });
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(@NotNull ComponentName name, @NotNull IBinder service) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(service, "service");
        gpe.h("IDMBase", "Id[" + this.this$0.getClientId() + "]: onServiceConnected:  name[" + name + "] service[" + service + AbstractJsonLexerKt.END_LIST, new Object[0]);
        this.this$0._iMiConnect = IMiConnect.Stub.asInterface(service);
        IDMBase iDMBase = this.this$0;
        iDMBase.serviceApiVersion = tryGetServiceApiVersion(iDMBase.getIMiConnect());
        if (this.this$0.getServiceApiVersion() >= 6) {
            final IDMBase iDMBase2 = this.this$0;
            iDMBase2.handler.post(new Runnable() { // from class: sqc
                @Override // java.lang.Runnable
                public final void run() {
                    IDMBase$mConnection$1.m666onServiceConnected$lambda0(iDMBase2);
                }
            });
        } else {
            final IDMBase iDMBase3 = this.this$0;
            iDMBase3.handler.post(new Runnable() { // from class: tqc
                @Override // java.lang.Runnable
                public final void run() {
                    IDMBase$mConnection$1.m667onServiceConnected$lambda1(iDMBase3);
                }
            });
            this.this$0.unbindService();
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(@NotNull ComponentName name) {
        Intrinsics.checkNotNullParameter(name, "name");
        gpe.h("IDMBase", "Id[" + this.this$0.getClientId() + "]: onServiceDisconnected:  name[" + name + AbstractJsonLexerKt.END_LIST, new Object[0]);
        this.this$0.unbindService();
        final IDMBase iDMBase = this.this$0;
        iDMBase.handler.post(new Runnable() { // from class: wqc
            @Override // java.lang.Runnable
            public final void run() {
                IDMBase$mConnection$1.m668onServiceDisconnected$lambda4(iDMBase);
            }
        });
    }
}

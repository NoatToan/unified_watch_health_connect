package com.mi.fitness.lpamanagement.service;

import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.chinatelecom.multisimservice.model.MultiSimDeviceInfo;
import com.chinatelecom.multisimservice.model.SimInfo;
import com.chinatelecom.multisimservice.model.SmartWearServiceInfo;
import com.xiaomi.fitness.common.log.Logger;
import defpackage.fyc;
import defpackage.ivc;
import defpackage.jvc;
import defpackage.pyc;
import defpackage.uhr;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 02\u00020\u0001:\u00010B\u0007¢\u0006\u0004\b/\u0010\u0004J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u0004J\u000f\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0004J\u0017\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u0002¢\u0006\u0004\b\u0014\u0010\u0004R\"\u0010\u0016\u001a\u00020\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018\"\u0004\b\u0019\u0010\u001aR$\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R$\u0010#\u001a\u0004\u0018\u00010\"8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u0014\u0010*\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010-\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.¨\u00061"}, d2 = {"Lcom/mi/fitness/lpamanagement/service/CtESimService;", "Lcom/mi/fitness/lpamanagement/service/BaseESimService;", "", "callBackForTestMode", "()V", "", "activationCode", "downloadESim", "(Ljava/lang/String;)V", "Landroid/content/Intent;", "intent", "Landroid/os/IBinder;", "onBind", "(Landroid/content/Intent;)Landroid/os/IBinder;", "onDeviceMultiSimInfoCallBack", "clearSimInfoList", "", "status", "onProfileDownloadStatusCallBack", "(I)V", "getEsimList", "", "isInterfaceTestMode", "Z", "()Z", "setInterfaceTestMode", "(Z)V", "Lpyc;", "mServiceInfoCallback", "Lpyc;", "getMServiceInfoCallback", "()Lpyc;", "setMServiceInfoCallback", "(Lpyc;)V", "Ljvc;", "mOpenMultiSimCalbcak", "Ljvc;", "getMOpenMultiSimCalbcak", "()Ljvc;", "setMOpenMultiSimCalbcak", "(Ljvc;)V", "Livc$a;", "mOpenMultiSimBinder", "Livc$a;", "Lfyc$a;", "mServiceBinder", "Lfyc$a;", "<init>", "Companion", "lpa-management_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class CtESimService extends BaseESimService {

    @NotNull
    private static final String CT_VERSION_CODE = "1.0";

    @NotNull
    private static final String TAG = "CtESimService";
    private boolean isInterfaceTestMode;

    @Nullable
    private jvc mOpenMultiSimCalbcak;

    @Nullable
    private pyc mServiceInfoCallback;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static List<SimInfo> mSimInfoList = new ArrayList();

    @NotNull
    private final ivc.a mOpenMultiSimBinder = new ivc.a() { // from class: com.mi.fitness.lpamanagement.service.CtESimService$mOpenMultiSimBinder$1
        @Override // defpackage.ivc
        public void downloadESimProfile(String activationCode) throws RemoteException {
            Intrinsics.checkNotNullParameter(activationCode, "activationCode");
            CtESimService ctESimService = this.this$0;
            if (ctESimService.mShouldResetService) {
                throw new RemoteException("watch switched!");
            }
            ctESimService.downloadESim(activationCode);
        }

        @Override // defpackage.ivc
        public void getAttachedDeviceMultiSimInfo() throws RemoteException {
            CtESimService ctESimService = this.this$0;
            if (ctESimService.mShouldResetService) {
                throw new RemoteException("watch switched!");
            }
            if (ctESimService.getIsInterfaceTestMode()) {
                this.this$0.callBackForTestMode();
            } else {
                this.this$0.getEsimList();
            }
        }

        @Override // defpackage.ivc
        public void registerCallback(jvc callback) {
            Intrinsics.checkNotNullParameter(callback, "callback");
            this.this$0.setMOpenMultiSimCalbcak(callback);
        }

        @Override // defpackage.ivc
        public void unRegisterCallback(jvc callback) {
            Intrinsics.checkNotNullParameter(callback, "callback");
            this.this$0.setMOpenMultiSimCalbcak(null);
        }
    };

    @NotNull
    private final fyc.a mServiceBinder = new fyc.a() { // from class: com.mi.fitness.lpamanagement.service.CtESimService$mServiceBinder$1
        @Override // defpackage.fyc
        public IBinder getServiceBinder(String packageName, String versionCode) {
            ivc.a aVar;
            Intrinsics.checkNotNullParameter(packageName, "packageName");
            Intrinsics.checkNotNullParameter(versionCode, "versionCode");
            this.this$0.mShouldResetService = false;
            Logger.i("CtESimService", "getServiceBinder: " + packageName + " versionCode" + versionCode);
            if (this.this$0.getApplication() == null) {
                Logger.i("CtESimService", "context null! not initialized, return null");
                return null;
            }
            if (!uhr.a().d(Binder.getCallingUid()) || !Intrinsics.areEqual("1.0", versionCode)) {
                Logger.i("CtESimService", "mVerified = false");
                return null;
            }
            if (this.this$0.isConnected()) {
                Logger.i("CtESimService", "mVerified = true");
                aVar = this.this$0.mOpenMultiSimBinder;
            } else {
                for (int i = 0; !this.this$0.isConnected() && i < 5; i++) {
                    try {
                        Thread.sleep(1000L);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                aVar = this.this$0.mOpenMultiSimBinder;
            }
            return aVar;
        }

        @Override // defpackage.fyc
        public void getSmartWearServiceInfo() {
            SmartWearServiceInfo smartWearServiceInfoCreateFromParcel = SmartWearServiceInfo.CREATOR.createFromParcel(Parcel.obtain());
            smartWearServiceInfoCreateFromParcel.a("com.xiaomi.wearable");
            smartWearServiceInfoCreateFromParcel.c("1.0");
            if (this.this$0.getMServiceInfoCallback() != null) {
                try {
                    pyc mServiceInfoCallback = this.this$0.getMServiceInfoCallback();
                    if (mServiceInfoCallback != null) {
                        mServiceInfoCallback.p(smartWearServiceInfoCreateFromParcel);
                    }
                } catch (RemoteException e) {
                    e.printStackTrace();
                    this.this$0.setMServiceInfoCallback(null);
                }
            }
        }

        @Override // defpackage.fyc
        public void registCallback(pyc callback) {
            Intrinsics.checkNotNullParameter(callback, "callback");
            this.this$0.setMServiceInfoCallback(callback);
        }

        @Override // defpackage.fyc
        public void unRegistCallback(pyc callback) {
            Intrinsics.checkNotNullParameter(callback, "callback");
            this.this$0.setMServiceInfoCallback(null);
        }
    };

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/mi/fitness/lpamanagement/service/CtESimService$Companion;", "", "<init>", "()V", "TAG", "", "CT_VERSION_CODE", "mSimInfoList", "", "Lcom/chinatelecom/multisimservice/model/SimInfo;", "getMSimInfoList", "()Ljava/util/List;", "setMSimInfoList", "(Ljava/util/List;)V", "lpa-management_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final List<SimInfo> getMSimInfoList() {
            return CtESimService.mSimInfoList;
        }

        public final void setMSimInfoList(@NotNull List<SimInfo> list) {
            Intrinsics.checkNotNullParameter(list, "<set-?>");
            CtESimService.mSimInfoList = list;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void callBackForTestMode() {
        Logger.i(TAG, "onDeviceMultiSimInfoCallBack testMode Fake data");
        MultiSimDeviceInfo multiSimDeviceInfo = new MultiSimDeviceInfo();
        multiSimDeviceInfo.a("861423039911542");
        multiSimDeviceInfo.c("");
        multiSimDeviceInfo.e("89033023001211360000000001913290");
        multiSimDeviceInfo.d(BaseESimService.INSTANCE.getSDeviceType());
        multiSimDeviceInfo.f("Mi Watch");
        multiSimDeviceInfo.g(1);
        multiSimDeviceInfo.h(mSimInfoList);
        jvc jvcVar = this.mOpenMultiSimCalbcak;
        if (jvcVar != null) {
            try {
                Intrinsics.checkNotNull(jvcVar);
                jvcVar.N0(multiSimDeviceInfo);
            } catch (RemoteException e) {
                e.printStackTrace();
                this.mOpenMultiSimCalbcak = null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void downloadESim(String activationCode) {
        if (this.isInterfaceTestMode) {
            onProfileDownloadStatusCallBack(1);
        } else {
            downloadESim(activationCode, 3);
        }
    }

    @Override // com.mi.fitness.lpamanagement.service.BaseESimService
    public void clearSimInfoList() {
        super.clearSimInfoList();
        mSimInfoList.clear();
    }

    public final void getEsimList() {
        if (isConnected()) {
            BaseESimService.INSTANCE.setSResultCode(1);
            getESimList();
        } else {
            BaseESimService.INSTANCE.setSResultCode(-2);
            onDeviceMultiSimInfoCallBack();
        }
    }

    @Nullable
    public final jvc getMOpenMultiSimCalbcak() {
        return this.mOpenMultiSimCalbcak;
    }

    @Nullable
    public final pyc getMServiceInfoCallback() {
        return this.mServiceInfoCallback;
    }

    /* JADX INFO: renamed from: isInterfaceTestMode, reason: from getter */
    public final boolean getIsInterfaceTestMode() {
        return this.isInterfaceTestMode;
    }

    @Override // com.mi.fitness.lpamanagement.service.BaseESimService, android.app.Service
    @Nullable
    public IBinder onBind(@NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        return this.mServiceBinder;
    }

    @Override // com.mi.fitness.lpamanagement.service.BaseESimService
    public void onDeviceMultiSimInfoCallBack() {
        BaseESimService.Companion companion = BaseESimService.INSTANCE;
        if (companion.getSResultCode() != 1) {
            Logger.i(TAG, "onDeviceMultiSimInfoCallBack sResultCode:" + companion.getSResultCode());
            companion.setSDeviceIMEI("");
            companion.setSEID("");
            mSimInfoList.clear();
            MultiSimDeviceInfo multiSimDeviceInfo = new MultiSimDeviceInfo();
            multiSimDeviceInfo.g(companion.getSResultCode());
            jvc jvcVar = this.mOpenMultiSimCalbcak;
            if (jvcVar != null && jvcVar != null) {
                try {
                    jvcVar.N0(multiSimDeviceInfo);
                } catch (RemoteException e) {
                    e.printStackTrace();
                    this.mOpenMultiSimCalbcak = null;
                }
            }
            BaseESimService.isGetAttachedDeviceMultiSimInfoInProgress = false;
            return;
        }
        if (this.mOpenMultiSimCalbcak != null) {
            MultiSimDeviceInfo multiSimDeviceInfo2 = new MultiSimDeviceInfo();
            multiSimDeviceInfo2.a(companion.getSDeviceIMEI());
            multiSimDeviceInfo2.c(companion.getSDeviceSerialNumber());
            multiSimDeviceInfo2.e(companion.getSEID());
            multiSimDeviceInfo2.d(companion.getSDeviceType());
            multiSimDeviceInfo2.f(companion.getSProductName());
            multiSimDeviceInfo2.g(companion.getSResultCode());
            if (true ^ companion.getEsimInfoList().isEmpty()) {
                BaseESimService.ESimInfo eSimInfo = companion.getEsimInfoList().get(0);
                SimInfo simInfo = new SimInfo();
                simInfo.d(eSimInfo.getIccid());
                simInfo.c(eSimInfo.getActive());
                mSimInfoList.add(simInfo);
            }
            multiSimDeviceInfo2.h(mSimInfoList);
            Logger.i(TAG, "onDeviceMultiSimInfoCallBack simInfoList:" + mSimInfoList);
            try {
                jvc jvcVar2 = this.mOpenMultiSimCalbcak;
                if (jvcVar2 != null) {
                    jvcVar2.N0(multiSimDeviceInfo2);
                }
                Logger.i(TAG, "mOpenMultiSimCalbcak?.getDeviceMultiSimInfo success");
            } catch (RemoteException e2) {
                e2.printStackTrace();
                Logger.i(TAG, "mOpenMultiSimCalbcak?.getDeviceMultiSimInfo error:" + e2.getMessage());
                this.mOpenMultiSimCalbcak = null;
            }
        }
    }

    @Override // com.mi.fitness.lpamanagement.service.BaseESimService
    public void onProfileDownloadStatusCallBack(int status) {
        Logger.i(TAG, "onProfileDownloadStatusCallBack status : " + status);
        jvc jvcVar = this.mOpenMultiSimCalbcak;
        if (jvcVar == null) {
            Logger.i(TAG, "no callback registered");
            return;
        }
        if (jvcVar != null) {
            try {
                jvcVar.c(status);
                Unit unit = Unit.INSTANCE;
            } catch (RemoteException e) {
                e.printStackTrace();
                this.mOpenMultiSimCalbcak = null;
                Unit unit2 = Unit.INSTANCE;
            }
        }
    }

    public final void setInterfaceTestMode(boolean z) {
        this.isInterfaceTestMode = z;
    }

    public final void setMOpenMultiSimCalbcak(@Nullable jvc jvcVar) {
        this.mOpenMultiSimCalbcak = jvcVar;
    }

    public final void setMServiceInfoCallback(@Nullable pyc pycVar) {
        this.mServiceInfoCallback = pycVar;
    }
}

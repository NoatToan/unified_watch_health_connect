package com.xiaomi.hm.health.bt.profile.dfu;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.tools.analytics.EventConst;
import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.profile.base.HMBaseTask;
import com.xiaomi.hm.health.bt.profile.observe.LogObservable;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.StringWriter;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u001f\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u0010\u001a\u00020\u000b\u0012\u0006\u0010\u0016\u001a\u00020\u0011¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0014R\u0016\u0010\n\u001a\u00020\u00078\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0019\u0010\u0010\u001a\u00020\u000b8\u0006@\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0016\u001a\u00020\u00118\u0006@\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001e"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/dfu/NewDfuTask;", "Lcom/xiaomi/hm/health/bt/profile/base/HMBaseTask;", "", EventConst.c, "", "a", "doWork", "Lcom/xiaomi/hm/health/bt/profile/dfu/DfuApi;", "b", "Lcom/xiaomi/hm/health/bt/profile/dfu/DfuApi;", "dfuApi", "Lcom/xiaomi/hm/health/bt/profile/dfu/HMFirmwareInfo;", "c", "Lcom/xiaomi/hm/health/bt/profile/dfu/HMFirmwareInfo;", "getInfo", "()Lcom/xiaomi/hm/health/bt/profile/dfu/HMFirmwareInfo;", "info", "Lcom/xiaomi/hm/health/bt/profile/dfu/IFirmwareUpgradeCallback;", GoogleApiAvailabilityLight.a, "Lcom/xiaomi/hm/health/bt/profile/dfu/IFirmwareUpgradeCallback;", "getCallback", "()Lcom/xiaomi/hm/health/bt/profile/dfu/IFirmwareUpgradeCallback;", "callback", "Lcom/xiaomi/hm/health/bt/profile/observe/LogObservable;", "e", "Lcom/xiaomi/hm/health/bt/profile/observe/LogObservable;", "logObservable", "<init>", "(Lcom/xiaomi/hm/health/bt/profile/dfu/DfuApi;Lcom/xiaomi/hm/health/bt/profile/dfu/HMFirmwareInfo;Lcom/xiaomi/hm/health/bt/profile/dfu/IFirmwareUpgradeCallback;)V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class NewDfuTask extends HMBaseTask {

    @NotNull
    private static final String f = "NewDfuTask";

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final DfuApi dfuApi;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final HMFirmwareInfo info;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final IFirmwareUpgradeCallback callback;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    private LogObservable logObservable;

    public NewDfuTask(@NotNull DfuApi dfuApi, @NotNull HMFirmwareInfo hMFirmwareInfo, @NotNull IFirmwareUpgradeCallback iFirmwareUpgradeCallback) {
        this.dfuApi = dfuApi;
        this.info = hMFirmwareInfo;
        this.callback = iFirmwareUpgradeCallback;
        if (iFirmwareUpgradeCallback instanceof LogObservable) {
            this.logObservable = (LogObservable) iFirmwareUpgradeCallback;
        }
    }

    private final void a(Throwable ex) {
        if (ex == null) {
            Debug.fi(f, "Throwable is null!!!");
            return;
        }
        StringBuffer stringBuffer = new StringBuffer();
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        ex.printStackTrace(printWriter);
        for (Throwable cause = ex.getCause(); cause != null; cause = cause.getCause()) {
            cause.printStackTrace(printWriter);
        }
        printWriter.close();
        stringBuffer.append(stringWriter.toString());
        Debug.fi(f, Intrinsics.stringPlus("\n", stringBuffer));
    }

    @Override // com.xiaomi.hm.health.bt.profile.base.HMBaseTask
    public void doWork() {
        Object objM3845constructorimpl;
        try {
            Result.Companion companion = Result.Companion;
            this.dfuApi.setRunning(true);
            getCallback().onFwStart(0);
            if (this.dfuApi.initApi()) {
                DfuProtocolInfo dfuProtocolInfoQueryProtocolInfo = this.dfuApi.queryProtocolInfo();
                Debug.fi(f, dfuProtocolInfoQueryProtocolInfo.toString());
                LogObservable logObservable = this.logObservable;
                if (logObservable != null) {
                    logObservable.onLogMessage(dfuProtocolInfoQueryProtocolInfo.toString());
                }
                Boolean boolProcess = DfuProcessorFactory.INSTANCE.create(dfuProtocolInfoQueryProtocolInfo.getVersion()).process(this.dfuApi, dfuProtocolInfoQueryProtocolInfo, getInfo(), getCallback());
                LogObservable logObservable2 = this.logObservable;
                if (logObservable2 != null) {
                    logObservable2.onLogMessage(Intrinsics.stringPlus("Upgrade result: ", boolProcess));
                }
                Debug.fi(f, Intrinsics.stringPlus("Upgrade result:", boolProcess));
                if (boolProcess != null) {
                    boolProcess.booleanValue();
                    getCallback().onFwStop(boolProcess.booleanValue());
                }
            } else {
                Debug.fi(f, "Init dfu api failed");
                LogObservable logObservable3 = this.logObservable;
                if (logObservable3 != null) {
                    logObservable3.onLogMessage("Init dfu api failed");
                }
                getCallback().onFwStop(false);
            }
            objM3845constructorimpl = Result.m3845constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
        if (thM3848exceptionOrNullimpl != null) {
            a(thM3848exceptionOrNullimpl);
            getCallback().onFwStop(false);
            LogObservable logObservable4 = this.logObservable;
            if (logObservable4 != null) {
                logObservable4.onLogMessage(Intrinsics.stringPlus("upgrade failure with error ", thM3848exceptionOrNullimpl.getMessage()));
            }
            if (thM3848exceptionOrNullimpl instanceof FileNotFoundException) {
                getCallback().onError(MyDfuError.FILE_NOT_FOUND.getCode());
            } else {
                getCallback().onError(MyDfuError.UNKNOW.getCode());
            }
        }
        Debug.fi(f, "DeInit");
        LogObservable logObservable5 = this.logObservable;
        if (logObservable5 != null) {
            logObservable5.onLogMessage("destruction .....");
        }
        this.dfuApi.deInit();
        this.dfuApi.setRunning(false);
    }

    @NotNull
    public final IFirmwareUpgradeCallback getCallback() {
        return this.callback;
    }

    @NotNull
    public final HMFirmwareInfo getInfo() {
        return this.info;
    }
}

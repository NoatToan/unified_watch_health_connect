package com.mi.command.receive;

import android.os.RemoteException;
import com.mi.command.data.CalibrationResponse;
import com.mi.command.receive.ResearchPacketReceiver;
import com.mi.command.remote.ResearchCommandServer;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import defpackage.gpk;
import defpackage.nt9;
import defpackage.qpk;
import defpackage.s7r;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Lcom/mi/command/receive/ResearchPacketReceiver;", "", "", "type", "Ls7r;", "packet", "", "onReceive", "(ILs7r;)V", "<init>", "()V", "Companion", "research-support_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class ResearchPacketReceiver {

    @NotNull
    private static final String TAG = "Research_handlePacket";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Lazy<ResearchPacketReceiver> mInstance$delegate = LazyKt__LazyJVMKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, new Function0() { // from class: opk
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ResearchPacketReceiver.mInstance_delegate$lambda$0();
        }
    });

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\f\u001a\u00020\u0007H\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\t¨\u0006\r"}, d2 = {"Lcom/mi/command/receive/ResearchPacketReceiver$Companion;", "", "<init>", "()V", "TAG", "", "mInstance", "Lcom/mi/command/receive/ResearchPacketReceiver;", "getMInstance", "()Lcom/mi/command/receive/ResearchPacketReceiver;", "mInstance$delegate", "Lkotlin/Lazy;", "get", "research-support_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final ResearchPacketReceiver getMInstance() {
            return (ResearchPacketReceiver) ResearchPacketReceiver.mInstance$delegate.getValue();
        }

        @JvmStatic
        @NotNull
        public final ResearchPacketReceiver get() {
            return getMInstance();
        }
    }

    @JvmStatic
    @NotNull
    public static final ResearchPacketReceiver get() {
        return INSTANCE.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ResearchPacketReceiver mInstance_delegate$lambda$0() {
        return new ResearchPacketReceiver();
    }

    public final void onReceive(int type, @Nullable s7r packet) throws RemoteException {
        if (packet == null || packet.e != 8) {
            FitnessLogUtils.e("Research_handlePacket", "not packet , type:" + type);
            return;
        }
        nt9 nt9VarK = packet.u().K();
        if (nt9VarK == null) {
            FitnessLogUtils.i("Research_handlePacket", "researchCaliResponse == null");
            return;
        }
        CalibrationResponse calibrationResponse = new CalibrationResponse(nt9VarK.c, nt9VarK.d);
        int i = packet.f;
        if (i == 80) {
            FitnessLogUtils.i("Research_handlePacket", "REPORT_RESEARCH_CALIBRATION_STEP1 , response" + calibrationResponse);
            gpk researchCalibrationCallback = ResearchCommandServer.INSTANCE.getResearchCalibrationCallback();
            if (researchCalibrationCallback != null) {
                researchCalibrationCallback.u3(calibrationResponse);
                return;
            }
            return;
        }
        if (i == 81) {
            FitnessLogUtils.i("Research_handlePacket", "REPORT_RESEARCH_CALIBRATION_STEP2 , response" + calibrationResponse);
            gpk researchCalibrationCallback2 = ResearchCommandServer.INSTANCE.getResearchCalibrationCallback();
            if (researchCalibrationCallback2 != null) {
                researchCalibrationCallback2.k3(calibrationResponse);
                return;
            }
            return;
        }
        if (i != 89) {
            return;
        }
        FitnessLogUtils.i("Research_handlePacket", "REPORT_RESEARCH_CALIBRATION , response" + calibrationResponse);
        qpk researchReportCalibrationCallback = ResearchCommandServer.INSTANCE.getResearchReportCalibrationCallback();
        if (researchReportCalibrationCallback != null) {
            researchReportCalibrationCallback.s0(calibrationResponse);
        }
    }
}

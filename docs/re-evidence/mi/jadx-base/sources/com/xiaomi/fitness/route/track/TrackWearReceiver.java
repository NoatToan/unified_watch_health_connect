package com.xiaomi.fitness.route.track;

import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fitness.common.bus.LiveDataBus;
import com.xiaomi.fitness.device.contact.export.DataHandlerWrapper;
import com.xiaomi.fitness.device.contact.export.DeviceContact;
import com.xiaomi.fitness.device.contact.export.DeviceSyncExtKt;
import com.xiaomi.fitness.route.track.TrackWearReceiver;
import defpackage.ps9;
import defpackage.s7r;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u0000 \u000b2\u00020\u0001:\u0002\u000b\fB\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\r"}, d2 = {"Lcom/xiaomi/fitness/route/track/TrackWearReceiver;", "", "", "type", "Ls7r;", "packet", "", "onReceive", "(ILs7r;)V", "<init>", "()V", "Companion", "DataHandlerImpl", "route_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class TrackWearReceiver {

    @NotNull
    public static final String ROUTE_RESULE = "ROUTE_RESULE";

    @NotNull
    private static final String TAG = "TrackWearReceiver";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Lazy<TrackWearReceiver> mInstance$delegate = LazyKt__LazyJVMKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, new Function0() { // from class: oop
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return TrackWearReceiver.mInstance_delegate$lambda$0();
        }
    });

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\r\u001a\u00020\bH\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u001b\u0010\u0007\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/fitness/route/track/TrackWearReceiver$Companion;", "", "<init>", "()V", TrackWearReceiver.ROUTE_RESULE, "", "TAG", "mInstance", "Lcom/xiaomi/fitness/route/track/TrackWearReceiver;", "getMInstance", "()Lcom/xiaomi/fitness/route/track/TrackWearReceiver;", "mInstance$delegate", "Lkotlin/Lazy;", "get", "route_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final TrackWearReceiver getMInstance() {
            return (TrackWearReceiver) TrackWearReceiver.mInstance$delegate.getValue();
        }

        @JvmStatic
        @NotNull
        public final TrackWearReceiver get() {
            return getMInstance();
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000b\u0010\fJ)\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/xiaomi/fitness/route/track/TrackWearReceiver$DataHandlerImpl;", "Lcom/xiaomi/fitness/device/contact/export/DataHandlerWrapper;", "", "did", "", "type", "Ls7r;", "packet", "", "handlePacket", "(Ljava/lang/String;ILs7r;)Z", "<init>", "(Lcom/xiaomi/fitness/route/track/TrackWearReceiver;)V", "route_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public final class DataHandlerImpl extends DataHandlerWrapper {
        public DataHandlerImpl() {
        }

        @Override // com.xiaomi.fitness.device.contact.export.DataHandlerWrapper, com.xiaomi.fitness.device.contact.export.DataHandler
        public boolean handlePacket(@NotNull String did, int type, @Nullable s7r packet) {
            Intrinsics.checkNotNullParameter(did, "did");
            TrackWearReceiver.this.onReceive(type, packet);
            return false;
        }
    }

    public TrackWearReceiver() {
        DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE).addDataHandler(8, new DataHandlerImpl());
    }

    @JvmStatic
    @NotNull
    public static final TrackWearReceiver get() {
        return INSTANCE.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TrackWearReceiver mInstance_delegate$lambda$0() {
        return new TrackWearReceiver();
    }

    public final void onReceive(int type, @Nullable s7r packet) {
        if (packet == null || packet.e != 8) {
            FitnessLogUtils.w(TAG, "not packet , type:" + type);
            return;
        }
        if (packet.f == 59) {
            ps9.c cVarE = packet.u().E();
            String id = cVarE.c;
            Intrinsics.checkNotNullExpressionValue(id, "id");
            RouteResult routeResult = new RouteResult(id, cVarE.d);
            FitnessLogUtils.i(TAG, "routeResult:" + routeResult);
            LiveDataBus.INSTANCE.get().with(ROUTE_RESULE).postValue(routeResult);
        }
    }
}

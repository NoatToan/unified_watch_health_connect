package com.huami.treadmill.util;

import com.huami.tools.log.HMLog;
import com.huami.treadmill.data.BoltSportCommand;
import com.huami.treadmill.data.InMachineStatus;
import com.huami.treadmill.data.InTreadmillData;
import com.huami.treadmill.eventbus.SportCommandEvent;
import com.huami.treadmill.eventbus.SportFTMEvent;
import com.huami.treadmill.proxy.ProxyTreadmill;
import de.greenrobot.event.EventBus;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\u0018\u0000 #2\u00020\u0001:\u0001#B\u0007¢\u0006\u0004\b!\u0010\"J\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u0006\u0010\u0007\u001a\u00020\u0004J\b\u0010\t\u001a\u0004\u0018\u00010\bJ\b\u0010\u000b\u001a\u0004\u0018\u00010\nR\"\u0010\u0012\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R$\u0010\u0019\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R$\u0010 \u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f¨\u0006$"}, d2 = {"Lcom/huami/treadmill/util/SportDataHelper;", "", "", "registerSportData", "", "router", "setIsRouterLine", "getIsRouterLine", "Lcom/huami/treadmill/data/InTreadmillData;", "getTreadmillData", "Lcom/huami/treadmill/data/InMachineStatus;", "getMachineStatus", "a", "Z", "getMIsRouterLine", "()Z", "setMIsRouterLine", "(Z)V", "mIsRouterLine", "b", "Lcom/huami/treadmill/data/InTreadmillData;", "getMTreadmillData", "()Lcom/huami/treadmill/data/InTreadmillData;", "setMTreadmillData", "(Lcom/huami/treadmill/data/InTreadmillData;)V", "mTreadmillData", "c", "Lcom/huami/treadmill/data/InMachineStatus;", "getMMachineStatus", "()Lcom/huami/treadmill/data/InMachineStatus;", "setMMachineStatus", "(Lcom/huami/treadmill/data/InMachineStatus;)V", "mMachineStatus", "<init>", "()V", "Companion", "treadmill_release"}, k = 1, mv = {1, 5, 1})
public final class SportDataHelper {

    @Nullable
    private static SportDataHelper d;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private boolean mIsRouterLine;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private InTreadmillData mTreadmillData;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private InMachineStatus mMachineStatus;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String e = SportDataHelper.class.getSimpleName();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u0006\u0010\u0003\u001a\u00020\u0002R\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/huami/treadmill/util/SportDataHelper$Companion;", "", "Lcom/huami/treadmill/util/SportDataHelper;", "getInstance", "", "TAG", "Ljava/lang/String;", "singleton", "Lcom/huami/treadmill/util/SportDataHelper;", "<init>", "()V", "treadmill_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final SportDataHelper getInstance() {
            if (SportDataHelper.d == null) {
                synchronized (SportDataHelper.class) {
                    if (SportDataHelper.d == null) {
                        Companion companion = SportDataHelper.INSTANCE;
                        SportDataHelper.d = new SportDataHelper();
                    }
                    Unit unit = Unit.INSTANCE;
                }
            }
            return SportDataHelper.d;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/treadmill/data/BoltSportCommand;", "command", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<BoltSportCommand, Unit> {
        public static final a a = new a();

        public a() {
            super(1);
        }

        public final void a(@NotNull BoltSportCommand boltSportCommand) {
            HMLog.i(SportDataHelper.e, Intrinsics.stringPlus("Command:", boltSportCommand), new Object[0]);
            EventBus.getDefault().post(new SportCommandEvent(boltSportCommand));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(BoltSportCommand boltSportCommand) {
            a(boltSportCommand);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u00042\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n"}, d2 = {"Lcom/huami/treadmill/data/InTreadmillData;", "treadmillData", "Lcom/huami/treadmill/data/InMachineStatus;", "machineStatus", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function2<InTreadmillData, InMachineStatus, Unit> {
        public b() {
            super(2);
        }

        public final void a(@Nullable InTreadmillData inTreadmillData, @Nullable InMachineStatus inMachineStatus) {
            SportDataHelper.this.setMTreadmillData(inTreadmillData);
            SportDataHelper.this.setMMachineStatus(inMachineStatus);
            if (inMachineStatus != null) {
                HMLog.i(SportDataHelper.e, Intrinsics.stringPlus("OP:", Byte.valueOf(inMachineStatus.getOp())), new Object[0]);
            }
            EventBus.getDefault().post(new SportFTMEvent(inTreadmillData, inMachineStatus));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(InTreadmillData inTreadmillData, InMachineStatus inMachineStatus) {
            a(inTreadmillData, inMachineStatus);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: getIsRouterLine, reason: from getter */
    public final boolean getMIsRouterLine() {
        return this.mIsRouterLine;
    }

    public final boolean getMIsRouterLine() {
        return this.mIsRouterLine;
    }

    @Nullable
    public final InMachineStatus getMMachineStatus() {
        return this.mMachineStatus;
    }

    @Nullable
    public final InTreadmillData getMTreadmillData() {
        return this.mTreadmillData;
    }

    @Nullable
    public final InMachineStatus getMachineStatus() {
        return this.mMachineStatus;
    }

    @Nullable
    public final InTreadmillData getTreadmillData() {
        return this.mTreadmillData;
    }

    public final void registerSportData() {
        ProxyTreadmill.Companion companion = ProxyTreadmill.INSTANCE;
        companion.getInstance().setSportListener(a.a);
        companion.getInstance().setFTMSListener(new b());
    }

    public final void setIsRouterLine(boolean router) {
        this.mIsRouterLine = router;
    }

    public final void setMIsRouterLine(boolean z) {
        this.mIsRouterLine = z;
    }

    public final void setMMachineStatus(@Nullable InMachineStatus inMachineStatus) {
        this.mMachineStatus = inMachineStatus;
    }

    public final void setMTreadmillData(@Nullable InTreadmillData inTreadmillData) {
        this.mTreadmillData = inTreadmillData;
    }
}

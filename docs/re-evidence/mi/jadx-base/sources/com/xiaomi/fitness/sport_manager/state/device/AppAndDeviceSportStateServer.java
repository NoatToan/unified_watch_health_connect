package com.xiaomi.fitness.sport_manager.state.device;

import android.os.RemoteException;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.mibi.sdk.component.Constants;
import com.xiaomi.fit.fitness.parser.schema.DailyRecordKey;
import com.xiaomi.fitness.service.BinderDelegate;
import com.xiaomi.fitness.sport_manager.state.device.AppAndDeviceSportStateServer;
import com.xiaomi.fitness.sport_manager_export.data.FinishSportData;
import com.xiaomi.fitness.sport_manager_export.data.SportRequestData;
import com.xiaomi.fitness.sport_manager_export.listener.ISportStateChangedListener;
import defpackage.f2o;
import defpackage.ixc;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\t\n\u0002\b\u0005\u0018\u0000 .2\u00020\u0001:\u0001.B\u0007¢\u0006\u0004\b-\u0010\u0019J\u001d\u0010\u0005\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00032\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\u00032\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u000b\u0010\nJ\u0015\u0010\u000e\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ7\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u001a\u0010\u0019J+\u0010!\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0016¢\u0006\u0004\b!\u0010\"R/\u0010)\u001a\u0004\u0018\u00010\u00072\b\u0010#\u001a\u0004\u0018\u00010\u00078B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010\nR\u0016\u0010+\u001a\u00020*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,¨\u0006/"}, d2 = {"Lcom/xiaomi/fitness/sport_manager/state/device/AppAndDeviceSportStateServer;", "Lcom/xiaomi/fitness/sport_manager_export/listener/ISportStateChangedListener;", "Lkotlin/Function0;", "", "block", "checkSportState", "(Lkotlin/jvm/functions/Function0;)V", "Lixc;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "addAppAndDeviceSportStateListener", "(Lixc;)V", "removeAppAndDeviceSportStateListener", "Lcom/xiaomi/fitness/sport_manager_export/data/SportRequestData;", Constants.KEY_REQUEST_DATA, "notifyDeviceAloneSportStateChanged", "(Lcom/xiaomi/fitness/sport_manager_export/data/SportRequestData;)V", "", "code", "startTime", "timeZone", DailyRecordKey.sportType, "sportLaunchType", "onSportStarted", "(IIIII)V", "onSportRestarted", "()V", "onSportPaused", "", "validSport", "", "ids", "Lcom/xiaomi/fitness/sport_manager_export/data/FinishSportData;", "finishSportData", "onSportFinished", "(Z[BLcom/xiaomi/fitness/sport_manager_export/data/FinishSportData;)V", "<set-?>", "iRemoteAppAndDeviceSportStateChangedListener$delegate", "Lcom/xiaomi/fitness/service/BinderDelegate;", "getIRemoteAppAndDeviceSportStateChangedListener", "()Lixc;", "setIRemoteAppAndDeviceSportStateChangedListener", "iRemoteAppAndDeviceSportStateChangedListener", "", "preReceiveSportStateTime", "J", "<init>", "Companion", "sport-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class AppAndDeviceSportStateServer implements ISportStateChangedListener {
    public static final int INTERVAL_TIME = 500;

    /* JADX INFO: renamed from: iRemoteAppAndDeviceSportStateChangedListener$delegate, reason: from kotlin metadata */
    @NotNull
    private final BinderDelegate iRemoteAppAndDeviceSportStateChangedListener = new BinderDelegate("iRemoteAppAndDeviceSportStateChangedListener");
    private long preReceiveSportStateTime;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(AppAndDeviceSportStateServer.class, "iRemoteAppAndDeviceSportStateChangedListener", "getIRemoteAppAndDeviceSportStateChangedListener()Lcom/xiaomi/fitness/sport_manager_export/listener/IRemoteSportStateChangedListener;", 0))};

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final AppAndDeviceSportStateServer instance = new AppAndDeviceSportStateServer();

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0006\u0010\u0003\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/xiaomi/fitness/sport_manager/state/device/AppAndDeviceSportStateServer$Companion;", "", "<init>", "()V", "instance", "Lcom/xiaomi/fitness/sport_manager/state/device/AppAndDeviceSportStateServer;", "getInstance$annotations", "getInstance", "()Lcom/xiaomi/fitness/sport_manager/state/device/AppAndDeviceSportStateServer;", "INTERVAL_TIME", "", "sport-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public static /* synthetic */ void getInstance$annotations() {
        }

        @NotNull
        public final AppAndDeviceSportStateServer getInstance() {
            return AppAndDeviceSportStateServer.instance;
        }
    }

    private final void checkSportState(Function0<Unit> block) {
        if (System.currentTimeMillis() - this.preReceiveSportStateTime < 500) {
            return;
        }
        block.invoke();
        this.preReceiveSportStateTime = System.currentTimeMillis();
    }

    private final ixc getIRemoteAppAndDeviceSportStateChangedListener() {
        return (ixc) this.iRemoteAppAndDeviceSportStateChangedListener.getValue((Object) this, $$delegatedProperties[0]);
    }

    @NotNull
    public static final AppAndDeviceSportStateServer getInstance() {
        return INSTANCE.getInstance();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit notifyDeviceAloneSportStateChanged$lambda$0(SportRequestData requestData, AppAndDeviceSportStateServer this$0) {
        Intrinsics.checkNotNullParameter(requestData, "$requestData");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        int i = requestData.sportState;
        if (i == 1) {
            this$0.onSportStarted(requestData.code, requestData.timeStamp, requestData.timeZone, requestData.sportType, requestData.sportLaunchType);
        } else if (i == 2) {
            this$0.onSportPaused();
        } else if (i == 3) {
            this$0.onSportRestarted();
        } else if (i == 4) {
            this$0.onSportFinished(true, null, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onSportFinished$lambda$4(AppAndDeviceSportStateServer this$0, boolean z) throws RemoteException {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ixc iRemoteAppAndDeviceSportStateChangedListener = this$0.getIRemoteAppAndDeviceSportStateChangedListener();
        if (iRemoteAppAndDeviceSportStateChangedListener != null) {
            iRemoteAppAndDeviceSportStateChangedListener.onSportFinished(z);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onSportPaused$lambda$3(AppAndDeviceSportStateServer this$0) throws RemoteException {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ixc iRemoteAppAndDeviceSportStateChangedListener = this$0.getIRemoteAppAndDeviceSportStateChangedListener();
        if (iRemoteAppAndDeviceSportStateChangedListener != null) {
            iRemoteAppAndDeviceSportStateChangedListener.onSportPaused();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onSportRestarted$lambda$2(AppAndDeviceSportStateServer this$0) throws RemoteException {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ixc iRemoteAppAndDeviceSportStateChangedListener = this$0.getIRemoteAppAndDeviceSportStateChangedListener();
        if (iRemoteAppAndDeviceSportStateChangedListener != null) {
            iRemoteAppAndDeviceSportStateChangedListener.onSportRestarted();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onSportStarted$lambda$1(AppAndDeviceSportStateServer this$0, int i, int i2, int i3, int i4, int i5) throws RemoteException {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ixc iRemoteAppAndDeviceSportStateChangedListener = this$0.getIRemoteAppAndDeviceSportStateChangedListener();
        if (iRemoteAppAndDeviceSportStateChangedListener != null) {
            iRemoteAppAndDeviceSportStateChangedListener.onSportStarted(i, i2, i3, i4, i5);
        }
        return Unit.INSTANCE;
    }

    private final void setIRemoteAppAndDeviceSportStateChangedListener(ixc ixcVar) {
        this.iRemoteAppAndDeviceSportStateChangedListener.setValue((Object) this, $$delegatedProperties[0], ixcVar);
    }

    public final void addAppAndDeviceSportStateListener(@Nullable ixc listener) {
        setIRemoteAppAndDeviceSportStateChangedListener(listener);
        f2o.x().h(AppAndDeviceSportStateServer.class, this);
    }

    public final void notifyDeviceAloneSportStateChanged(@NotNull final SportRequestData requestData) {
        Intrinsics.checkNotNullParameter(requestData, "requestData");
        checkSportState(new Function0() { // from class: pe1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AppAndDeviceSportStateServer.notifyDeviceAloneSportStateChanged$lambda$0(requestData, this);
            }
        });
    }

    @Override // com.xiaomi.fitness.sport_manager_export.listener.ISportStateChangedListener
    public void onSportFinished(final boolean validSport, @Nullable byte[] ids, @Nullable FinishSportData finishSportData) {
        checkSportState(new Function0() { // from class: ve1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AppAndDeviceSportStateServer.onSportFinished$lambda$4(this.f36789a, validSport);
            }
        });
    }

    @Override // com.xiaomi.fitness.sport_manager_export.listener.ISportStateChangedListener
    public void onSportPaused() {
        checkSportState(new Function0() { // from class: xe1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AppAndDeviceSportStateServer.onSportPaused$lambda$3(this.f39038a);
            }
        });
    }

    @Override // com.xiaomi.fitness.sport_manager_export.listener.ISportStateChangedListener
    public void onSportRestarted() {
        checkSportState(new Function0() { // from class: re1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AppAndDeviceSportStateServer.onSportRestarted$lambda$2(this.f32458a);
            }
        });
    }

    @Override // com.xiaomi.fitness.sport_manager_export.listener.ISportStateChangedListener
    public void onSportSegment(int i, int i2) {
        ISportStateChangedListener.DefaultImpls.onSportSegment(this, i, i2);
    }

    @Override // com.xiaomi.fitness.sport_manager_export.listener.ISportStateChangedListener
    public void onSportStarted(final int code, final int startTime, final int timeZone, final int sportType, final int sportLaunchType) {
        checkSportState(new Function0() { // from class: te1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AppAndDeviceSportStateServer.onSportStarted$lambda$1(this.f34614a, code, startTime, timeZone, sportType, sportLaunchType);
            }
        });
    }

    @Override // com.xiaomi.fitness.sport_manager_export.listener.ISportStateChangedListener
    public void preSport() {
        ISportStateChangedListener.DefaultImpls.preSport(this);
    }

    public final void removeAppAndDeviceSportStateListener(@Nullable ixc listener) {
        setIRemoteAppAndDeviceSportStateChangedListener(null);
        f2o.x().j0(AppAndDeviceSportStateServer.class, this);
    }
}

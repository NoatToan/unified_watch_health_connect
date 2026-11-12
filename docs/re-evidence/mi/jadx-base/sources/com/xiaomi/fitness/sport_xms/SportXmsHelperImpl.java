package com.xiaomi.fitness.sport_xms;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.xiaomi.fit.data.common.util.FitnessDateUtils;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.sport_xms.data.SensorData;
import com.xiaomi.fitness.sport_xms.data.SportXmsRequestData;
import com.xiaomi.fitness.sport_xms.data.WearSensorData;
import com.xiaomi.fitness.sport_xms_export.JDSportStateChangeListener;
import com.xiaomi.fitness.sport_xms_export.SportXmsHelper;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.SportSummary;
import defpackage.hzc;
import defpackage.lxc;
import defpackage.mxc;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 %2\u00020\u0001:\u0002&%B\t\b\u0007¢\u0006\u0004\b#\u0010$J3\u0010\b\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0012\u001a\u00020\u00052\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u0012\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0013\u0010\u0011J\u0017\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J+\u0010\u001b\u001a\u00020\u00052\u001a\u0010\u0015\u001a\u0016\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0019\u0012\u0004\u0012\u00020\u00050\u0018H\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001c\u0010!\u001a\b\u0018\u00010 R\u00020\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006'"}, d2 = {"Lcom/xiaomi/fitness/sport_xms/SportXmsHelperImpl;", "Lcom/xiaomi/fitness/sport_xms_export/SportXmsHelper;", "Landroid/content/Context;", "context", "Lkotlin/Function0;", "", "onInit", LifecycleConstantKt.ON_DESTROY, "bindXmsService", "(Landroid/content/Context;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "", "time", "", "did", "startSport", "(JLjava/lang/String;)V", "pauseSport", "(Ljava/lang/String;)V", "resumeSport", "finishSport", "Lcom/xiaomi/fitness/sport_xms_export/JDSportStateChangeListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setSportStateChangedListener", "(Lcom/xiaomi/fitness/sport_xms_export/JDSportStateChangeListener;)V", "Lkotlin/Function1;", "", "Lcom/xiaomi/fitness/sport_xms/data/SensorData;", "setSportXmsSensorDataChangedListener", "(Lkotlin/jvm/functions/Function1;)V", "Lhzc;", "proxy", "Lhzc;", "Lcom/xiaomi/fitness/sport_xms/SportXmsHelperImpl$SportXmsServiceConnection;", "mConnection", "Lcom/xiaomi/fitness/sport_xms/SportXmsHelperImpl$SportXmsServiceConnection;", "<init>", "()V", "Companion", "SportXmsServiceConnection", "sport-xms_release"}, k = 1, mv = {2, 0, 0})
public final class SportXmsHelperImpl implements SportXmsHelper {

    @NotNull
    private static final String HEALTH_PACKAGE = "com.mi.health";

    @NotNull
    private static final String SPORT_XMS_ACTION = "com.xiaomi.fitness.SPORT_XMS_SERVICE";

    @NotNull
    private static final String TAG = "SportXmsHelperImpl";

    @NotNull
    private static final String WEAR_PACKAGE = "com.xiaomi.wearable";

    @Nullable
    private SportXmsServiceConnection mConnection;

    @Nullable
    private hzc proxy;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J\u0012\u0010\r\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/fitness/sport_xms/SportXmsHelperImpl$SportXmsServiceConnection;", "Landroid/content/ServiceConnection;", "onInit", "Lkotlin/Function0;", "", LifecycleConstantKt.ON_DESTROY, "<init>", "(Lcom/xiaomi/fitness/sport_xms/SportXmsHelperImpl;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "onServiceConnected", "name", "Landroid/content/ComponentName;", "service", "Landroid/os/IBinder;", "onServiceDisconnected", "sport-xms_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class SportXmsServiceConnection implements ServiceConnection {

        @NotNull
        private final Function0<Unit> onDestroy;

        @NotNull
        private final Function0<Unit> onInit;
        final /* synthetic */ SportXmsHelperImpl this$0;

        public SportXmsServiceConnection(@NotNull SportXmsHelperImpl sportXmsHelperImpl, @NotNull Function0<Unit> onInit, Function0<Unit> onDestroy) {
            Intrinsics.checkNotNullParameter(onInit, "onInit");
            Intrinsics.checkNotNullParameter(onDestroy, "onDestroy");
            this.this$0 = sportXmsHelperImpl;
            this.onInit = onInit;
            this.onDestroy = onDestroy;
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(@Nullable ComponentName name, @Nullable IBinder service) {
            Logger.i(SportXmsHelperImpl.TAG, "onServiceConnected");
            this.this$0.proxy = hzc.a.asInterface(service);
            this.onInit.invoke();
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(@Nullable ComponentName name) {
            Logger.i(SportXmsHelperImpl.TAG, "onServiceDisconnected");
            this.this$0.proxy = null;
            this.onDestroy.invoke();
        }
    }

    @Override // com.xiaomi.fitness.sport_xms_export.SportXmsHelper
    public void bindXmsService(@NotNull Context context, @NotNull Function0<Unit> onInit, @NotNull Function0<Unit> onDestroy) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(onInit, "onInit");
        Intrinsics.checkNotNullParameter(onDestroy, "onDestroy");
        this.mConnection = new SportXmsServiceConnection(this, onInit, onDestroy);
        Intent intent = new Intent();
        intent.setAction(SPORT_XMS_ACTION);
        intent.setPackage("com.mi.health");
        if (context.getPackageManager().resolveService(intent, 0) == null) {
            intent.setPackage("com.xiaomi.wearable");
        }
        if (Build.VERSION.SDK_INT >= 34) {
            SportXmsServiceConnection sportXmsServiceConnection = this.mConnection;
            Intrinsics.checkNotNull(sportXmsServiceConnection);
            context.bindService(intent, sportXmsServiceConnection, SportSummary.VRESION_201);
        } else {
            SportXmsServiceConnection sportXmsServiceConnection2 = this.mConnection;
            Intrinsics.checkNotNull(sportXmsServiceConnection2);
            context.bindService(intent, sportXmsServiceConnection2, 1);
        }
    }

    @Override // com.xiaomi.fitness.sport_xms_export.SportXmsHelper
    public void finishSport(@NotNull String did) throws RemoteException {
        Intrinsics.checkNotNullParameter(did, "did");
        hzc hzcVar = this.proxy;
        if (hzcVar != null) {
            hzcVar.finishSportByType(did, 812);
        }
    }

    @Override // com.xiaomi.fitness.sport_xms_export.SportXmsHelper
    public void pauseSport(@NotNull String did) throws RemoteException {
        Intrinsics.checkNotNullParameter(did, "did");
        hzc hzcVar = this.proxy;
        if (hzcVar != null) {
            hzcVar.pauseSport(did, 812);
        }
    }

    @Override // com.xiaomi.fitness.sport_xms_export.SportXmsHelper
    public void resumeSport(@Nullable String did) throws RemoteException {
        hzc hzcVar = this.proxy;
        if (hzcVar != null) {
            hzcVar.restartSport(did, 812);
        }
    }

    @Override // com.xiaomi.fitness.sport_xms_export.SportXmsHelper
    public void setSportStateChangedListener(@NotNull final JDSportStateChangeListener listener) throws RemoteException {
        Intrinsics.checkNotNullParameter(listener, "listener");
        hzc hzcVar = this.proxy;
        if (hzcVar != null) {
            hzcVar.setSportStateChangedListener(new mxc.a() { // from class: com.xiaomi.fitness.sport_xms.SportXmsHelperImpl.setSportStateChangedListener.1
                @Override // defpackage.mxc
                public void onSportFinished(int code, boolean validSport) {
                    listener.onSportFinish();
                }

                @Override // defpackage.mxc
                public void onSportPaused(int code) {
                    listener.onSportPause();
                }

                @Override // defpackage.mxc
                public void onSportRestarted(int code) {
                }

                @Override // defpackage.mxc
                public void onSportStarted(int code, int startTime, int sportType, int interval) {
                    listener.onSportStart();
                }
            });
        }
    }

    @Override // com.xiaomi.fitness.sport_xms_export.SportXmsHelper
    public void setSportXmsSensorDataChangedListener(@NotNull final Function1<? super List<SensorData>, Unit> listener) throws RemoteException {
        Intrinsics.checkNotNullParameter(listener, "listener");
        hzc hzcVar = this.proxy;
        if (hzcVar != null) {
            hzcVar.setSportXmsSensorDataChangedListener(new lxc.a() { // from class: com.xiaomi.fitness.sport_xms.SportXmsHelperImpl.setSportXmsSensorDataChangedListener.1
                @Override // defpackage.lxc
                public void onSportXmsSensorDataChanged(WearSensorData wearSensorData) {
                    listener.invoke(wearSensorData != null ? wearSensorData.getAccel() : null);
                }
            });
        }
    }

    @Override // com.xiaomi.fitness.sport_xms_export.SportXmsHelper
    public void startSport(long time, @NotNull String did) throws RemoteException {
        Intrinsics.checkNotNullParameter(did, "did");
        SportXmsRequestData sportXmsRequestData = new SportXmsRequestData((int) (time / ((long) 1000)), (int) (TimeUnit.MILLISECONDS.toMinutes(FitnessDateUtils.getTZOffsetInMilli(time)) / ((long) 15)), 812, 1, 0);
        hzc hzcVar = this.proxy;
        if (hzcVar != null) {
            hzcVar.startSport(did, sportXmsRequestData);
        }
    }
}

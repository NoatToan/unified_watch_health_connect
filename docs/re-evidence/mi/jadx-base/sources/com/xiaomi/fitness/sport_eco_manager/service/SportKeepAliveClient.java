package com.xiaomi.fitness.sport_eco_manager.service;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.fitness.parser.schema.DailyRecordKey;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.service.BinderDelegate;
import com.xiaomi.fitness.sport_eco_manager.service.SportKeepAliveClient;
import com.xiaomi.fitness.sport_eco_manager_export.listener.ISportStateChangedListener;
import defpackage.hy7;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 $2\u00020\u0001:\u0001$B\u0007¢\u0006\u0004\b#\u0010\u0004J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J/\u0010\n\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\u0004J\u000f\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u0004J!\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R/\u0010\u001c\u001a\u0004\u0018\u00010\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00148B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001e\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006%"}, d2 = {"Lcom/xiaomi/fitness/sport_eco_manager/service/SportKeepAliveClient;", "Lcom/xiaomi/fitness/sport_eco_manager_export/listener/ISportStateChangedListener;", "", "bindService", "()V", "", "startTime", "timeZone", DailyRecordKey.sportType, "sportLaunchType", "onSportStarted", "(IIII)V", "onSportRestarted", "onSportPaused", "", "validSport", "", "ids", "onSportFinished", "(Z[B)V", "Lhy7;", "<set-?>", "sportKeepAliveListener$delegate", "Lcom/xiaomi/fitness/service/BinderDelegate;", "getSportKeepAliveListener", "()Lhy7;", "setSportKeepAliveListener", "(Lhy7;)V", "sportKeepAliveListener", "", "preFinishSportTime", "J", "Landroid/content/ServiceConnection;", "serviceConnection", "Landroid/content/ServiceConnection;", "<init>", "Companion", "sport-eco-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class SportKeepAliveClient implements ISportStateChangedListener {

    @NotNull
    public static final String TAG = "SportKeepAliveClient";
    private long preFinishSportTime;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(SportKeepAliveClient.class, "sportKeepAliveListener", "getSportKeepAliveListener()Lcom/xiaomi/fitness/sport_eco_manager_export/keep_alive/EcoSportKeepAliveListener;", 0))};

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Lazy<SportKeepAliveClient> mInstance$delegate = LazyKt__LazyJVMKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, new Function0() { // from class: xon
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SportKeepAliveClient.mInstance_delegate$lambda$0();
        }
    });

    /* JADX INFO: renamed from: sportKeepAliveListener$delegate, reason: from kotlin metadata */
    @NotNull
    private final BinderDelegate sportKeepAliveListener = new BinderDelegate("SportKeepAliveListener");

    @NotNull
    private final ServiceConnection serviceConnection = new ServiceConnection() { // from class: com.xiaomi.fitness.sport_eco_manager.service.SportKeepAliveClient$serviceConnection$1
        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName name, IBinder service) throws RemoteException {
            this.this$0.setSportKeepAliveListener(hy7.a.asInterface(service));
            hy7 sportKeepAliveListener = this.this$0.getSportKeepAliveListener();
            if (sportKeepAliveListener != null) {
                sportKeepAliveListener.onStartSport();
            }
            FitnessLogUtils.i("SportKeepAliveClient", "onServiceConnected , name : " + name + " , sportKeepAliveListener : " + this.this$0.getSportKeepAliveListener());
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName name) {
            FitnessLogUtils.i("SportKeepAliveClient", "onServiceDisconnected , name:" + name);
            this.this$0.setSportKeepAliveListener(null);
        }
    };

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\f\u001a\u00020\u0007H\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\t¨\u0006\r"}, d2 = {"Lcom/xiaomi/fitness/sport_eco_manager/service/SportKeepAliveClient$Companion;", "", "<init>", "()V", "TAG", "", "mInstance", "Lcom/xiaomi/fitness/sport_eco_manager/service/SportKeepAliveClient;", "getMInstance", "()Lcom/xiaomi/fitness/sport_eco_manager/service/SportKeepAliveClient;", "mInstance$delegate", "Lkotlin/Lazy;", "get", "sport-eco-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final SportKeepAliveClient getMInstance() {
            return (SportKeepAliveClient) SportKeepAliveClient.mInstance$delegate.getValue();
        }

        @JvmStatic
        @NotNull
        public final SportKeepAliveClient get() {
            return getMInstance();
        }
    }

    private final void bindService() {
        Intent intent = new Intent();
        intent.setClassName(ApplicationExtKt.getApplication(), "com.xiaomi.fitness.sport_eco.service.SportKeepAliveService");
        ApplicationExtKt.getApplication().bindService(intent, this.serviceConnection, 1);
    }

    @JvmStatic
    @NotNull
    public static final SportKeepAliveClient get() {
        return INSTANCE.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final hy7 getSportKeepAliveListener() {
        return (hy7) this.sportKeepAliveListener.getValue((Object) this, $$delegatedProperties[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SportKeepAliveClient mInstance_delegate$lambda$0() {
        return new SportKeepAliveClient();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setSportKeepAliveListener(hy7 hy7Var) {
        this.sportKeepAliveListener.setValue((Object) this, $$delegatedProperties[0], hy7Var);
    }

    @Override // com.xiaomi.fitness.sport_eco_manager_export.listener.ISportStateChangedListener
    public void onSportFinished(boolean validSport, @Nullable byte[] ids) throws RemoteException {
        if (System.currentTimeMillis() - this.preFinishSportTime > 1000) {
            FitnessLogUtils.i("SportKeepAliveClient", "onSportFinished , sportKeepAliveListener: " + getSportKeepAliveListener());
            hy7 sportKeepAliveListener = getSportKeepAliveListener();
            if (sportKeepAliveListener != null) {
                sportKeepAliveListener.onFinishSport();
            }
            try {
                ApplicationExtKt.getApplication().unbindService(this.serviceConnection);
            } catch (Exception e) {
                FitnessLogUtils.w("SportKeepAliveClient", e.toString());
            }
            this.preFinishSportTime = System.currentTimeMillis();
        }
    }

    @Override // com.xiaomi.fitness.sport_eco_manager_export.listener.ISportStateChangedListener
    public void onSportPaused() throws RemoteException {
        FitnessLogUtils.i("SportKeepAliveClient", "onSportPaused , sportKeepAliveListener:" + getSportKeepAliveListener());
        hy7 sportKeepAliveListener = getSportKeepAliveListener();
        if (sportKeepAliveListener != null) {
            sportKeepAliveListener.onPauseSport();
        }
    }

    @Override // com.xiaomi.fitness.sport_eco_manager_export.listener.ISportStateChangedListener
    public void onSportRestarted() throws RemoteException {
        FitnessLogUtils.i("SportKeepAliveClient", "onSportRestarted");
        hy7 sportKeepAliveListener = getSportKeepAliveListener();
        if (sportKeepAliveListener != null) {
            sportKeepAliveListener.onRestartSport();
        }
    }

    @Override // com.xiaomi.fitness.sport_eco_manager_export.listener.ISportStateChangedListener
    public void onSportRested() {
        ISportStateChangedListener.DefaultImpls.onSportRested(this);
    }

    @Override // com.xiaomi.fitness.sport_eco_manager_export.listener.ISportStateChangedListener
    public void onSportShutdown() {
        ISportStateChangedListener.DefaultImpls.onSportShutdown(this);
    }

    @Override // com.xiaomi.fitness.sport_eco_manager_export.listener.ISportStateChangedListener
    public void onSportStarted(int startTime, int timeZone, int sportType, int sportLaunchType) {
        bindService();
        FitnessLogUtils.i("SportKeepAliveClient", "onSportStarted");
    }

    @Override // com.xiaomi.fitness.sport_eco_manager_export.listener.ISportStateChangedListener
    public void preSport() {
        ISportStateChangedListener.DefaultImpls.preSport(this);
    }
}

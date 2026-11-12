package com.xiaomi.fitness.sport_manager.server;

import android.os.RemoteException;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fitness.service.BinderDelegate;
import com.xiaomi.fitness.sport_manager_export.data.PhoneSportData;
import com.xiaomi.fitness.sport_manager_export.data.SportLocationResult;
import com.xiaomi.fitness.sport_manager_export.data.SportWrapperKt;
import com.xiaomi.fitness.sport_manager_export.listener.ISportDataChangedListener;
import com.xiaomi.fitness.sport_manager_export.listener.ISportSensorDataChangedListener;
import com.xiaomi.fitness.sport_xms.data.WearSensorData;
import defpackage.bzc;
import defpackage.exc;
import defpackage.f2o;
import defpackage.jdn;
import defpackage.x7r;
import defpackage.ywc;
import kotlin.Metadata;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\u0018\u0000 02\u00020\u00012\u00020\u00022\u00020\u0003:\u00010B\t\b\u0007¢\u0006\u0004\b/\u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\u000b\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\r\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\r\u0010\fJ#\u0010\u000f\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\n\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0011\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\n\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0010J\u0019\u0010\u0014\u001a\u00020\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0018\u001a\u00020\u00042\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001c\u001a\u00020\u00042\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0019\u0010 \u001a\u00020\u00042\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0016¢\u0006\u0004\b \u0010!R/\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\"\u001a\u0004\u0018\u00010\t8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R/\u0010.\u001a\u0004\u0018\u00010\u000e2\b\u0010\"\u001a\u0004\u0018\u00010\u000e8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b)\u0010$\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-¨\u00061"}, d2 = {"Lcom/xiaomi/fitness/sport_manager/server/SportDataServer;", "Lbzc$a;", "Lcom/xiaomi/fitness/sport_manager_export/listener/ISportDataChangedListener;", "Lcom/xiaomi/fitness/sport_manager_export/listener/ISportSensorDataChangedListener;", "", "checkSportDataListener", "()V", "", "clazz", "Lywc;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "addSportDataChangedListener", "(Ljava/lang/String;Lywc;)V", "removeSportDataChangedListener", "Lexc;", "addSportSensorDataChangedListener", "(Ljava/lang/String;Lexc;)V", "removeSportSensorDataChangedListener", "Lx7r;", "wearSportData", "onReceiveWearData", "(Lx7r;)V", "Lcom/xiaomi/fitness/sport_manager_export/data/PhoneSportData;", "phoneSportData", "onPhoneDataChanged", "(Lcom/xiaomi/fitness/sport_manager_export/data/PhoneSportData;)V", "Lcom/xiaomi/fitness/sport_manager_export/data/SportLocationResult;", "location", "onLocationChanged", "(Lcom/xiaomi/fitness/sport_manager_export/data/SportLocationResult;)V", "Lcom/xiaomi/fitness/sport_xms/data/WearSensorData;", "wearSensorData", "onReceiveWearSensorData", "(Lcom/xiaomi/fitness/sport_xms/data/WearSensorData;)V", "<set-?>", "listener$delegate", "Lcom/xiaomi/fitness/service/BinderDelegate;", "getListener", "()Lywc;", "setListener", "(Lywc;)V", "sensorListener$delegate", "getSensorListener", "()Lexc;", "setSensorListener", "(Lexc;)V", "sensorListener", "<init>", "Companion", "sport-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class SportDataServer extends bzc.a implements ISportDataChangedListener, ISportSensorDataChangedListener {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(SportDataServer.class, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "getListener()Lcom/xiaomi/fitness/sport_manager_export/listener/IRemoteDataChangedListener;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(SportDataServer.class, "sensorListener", "getSensorListener()Lcom/xiaomi/fitness/sport_manager_export/listener/IRemoteSensorDataChangedListener;", 0))};
    public static final int KEY_SPORT_DATA_BINDER = 23;

    /* JADX INFO: renamed from: listener$delegate, reason: from kotlin metadata */
    @NotNull
    private final BinderDelegate listener = new BinderDelegate("IRemoteDataChangedListener");

    /* JADX INFO: renamed from: sensorListener$delegate, reason: from kotlin metadata */
    @NotNull
    private final BinderDelegate sensorListener = new BinderDelegate("IRemoteSensorDataChangedListener");

    private final void checkSportDataListener() {
        boolean zK = jdn.h().k(this);
        FitnessLogUtils.i(SportDataServerKt.TAG, "checkSportDataListener , curListenerRegisterSportData ：" + zK);
        if (zK) {
            return;
        }
        jdn.h().e(SportDataServer.class, this);
    }

    private final ywc getListener() {
        return (ywc) this.listener.getValue((Object) this, $$delegatedProperties[0]);
    }

    private final exc getSensorListener() {
        return (exc) this.sensorListener.getValue((Object) this, $$delegatedProperties[1]);
    }

    private final void setListener(ywc ywcVar) {
        this.listener.setValue((Object) this, $$delegatedProperties[0], ywcVar);
    }

    private final void setSensorListener(exc excVar) {
        this.sensorListener.setValue((Object) this, $$delegatedProperties[1], excVar);
    }

    @Override // defpackage.bzc
    public void addSportDataChangedListener(@Nullable String clazz, @Nullable ywc listener) {
        setListener(listener);
        FitnessLogUtils.i(SportDataServerKt.TAG, "addSportDataChangedListener , listener : " + listener);
        jdn.h().e(SportDataServer.class, this);
        checkSportDataListener();
    }

    @Override // defpackage.bzc
    public void addSportSensorDataChangedListener(@Nullable String clazz, @Nullable exc listener) {
        setSensorListener(listener);
        jdn.h().f(SportDataServer.class.toString(), this);
    }

    @Override // com.xiaomi.fitness.sport_manager_export.listener.ISportDataChangedListener
    public void onLocationChanged(@Nullable SportLocationResult location) {
        FitnessLogUtils.d(SportDataServerKt.TAG, "server phoneSportData : " + location);
        try {
            ywc listener = getListener();
            if (listener != null) {
                listener.onLocationChanged(SportWrapperKt.wrap(location));
            } else {
                FitnessLogUtils.i(SportDataServerKt.TAG, "location data listener is null");
            }
        } catch (Exception e) {
            FitnessLogUtils.i(SportDataServerKt.TAG, "onLocationChanged error: " + e);
            e.printStackTrace();
        }
    }

    @Override // com.xiaomi.fitness.sport_manager_export.listener.ISportDataChangedListener
    public void onPhoneDataChanged(@Nullable PhoneSportData phoneSportData) {
        FitnessLogUtils.d(SportDataServerKt.TAG, "phoneSportData : " + phoneSportData);
        if (phoneSportData == null) {
            return;
        }
        FitnessLogUtils.d(SportDataServerKt.TAG, "server phoneSportData : " + phoneSportData + " , listener : " + getListener());
        if (f2o.x().E() != null) {
            phoneSportData.step += f2o.x().E().totalStep;
        }
        try {
            ywc listener = getListener();
            if (listener != null) {
                listener.onPhoneDataChanged(SportWrapperKt.wrap(phoneSportData));
            } else {
                FitnessLogUtils.i(SportDataServerKt.TAG, "Phone data listener is null");
            }
        } catch (Exception e) {
            FitnessLogUtils.i(SportDataServerKt.TAG, "onPhoneDataChanged error: " + e);
            e.printStackTrace();
        }
    }

    @Override // com.xiaomi.fitness.sport_manager_export.listener.ISportDataChangedListener
    public void onReceiveWearData(@Nullable x7r wearSportData) {
    }

    @Override // com.xiaomi.fitness.sport_manager_export.listener.ISportSensorDataChangedListener
    public void onReceiveWearSensorData(@Nullable WearSensorData wearSensorData) throws RemoteException {
        exc sensorListener = getSensorListener();
        if (sensorListener != null) {
            sensorListener.onSensorDataChanged(SportWrapperKt.wrap(wearSensorData));
        }
    }

    @Override // defpackage.bzc
    public void removeSportDataChangedListener(@Nullable String clazz, @Nullable ywc listener) {
        FitnessLogUtils.i(SportDataServerKt.TAG, "removeSportDataChangedListener , listener : " + listener);
        setListener(null);
        jdn.h().r(SportDataServer.class, this);
    }

    @Override // defpackage.bzc
    public void removeSportSensorDataChangedListener(@Nullable String clazz, @Nullable exc listener) {
        setSensorListener(null);
        jdn.h().s(SportDataServer.class.toString(), this);
    }
}

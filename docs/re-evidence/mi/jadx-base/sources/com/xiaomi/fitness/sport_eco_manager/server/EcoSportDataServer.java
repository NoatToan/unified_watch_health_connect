package com.xiaomi.fitness.sport_eco_manager.server;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fitness.service.BinderDelegate;
import com.xiaomi.fitness.sport_eco_manager_export.data.PhoneSportData;
import com.xiaomi.fitness.sport_eco_manager_export.data.SportWrapperKt;
import com.xiaomi.fitness.sport_eco_manager_export.listener.ISportDataChangedListener;
import defpackage.dsc;
import defpackage.g2o;
import defpackage.hsc;
import defpackage.kdn;
import defpackage.y7r;
import kotlin.Metadata;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u0000 \u001d2\u00020\u00012\u00020\u0002:\u0001\u001dB\t\b\u0007¢\u0006\u0004\b\u001c\u0010\u0005J\u000f\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\n\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\f\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\f\u0010\u000bJ\u0019\u0010\u000f\u001a\u00020\u00032\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0013\u001a\u00020\u00032\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R/\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u0015\u001a\u0004\u0018\u00010\b8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, d2 = {"Lcom/xiaomi/fitness/sport_eco_manager/server/EcoSportDataServer;", "Lhsc$a;", "Lcom/xiaomi/fitness/sport_eco_manager_export/listener/ISportDataChangedListener;", "", "checkSportDataListener", "()V", "", "clazz", "Ldsc;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "addSportDataChangedListener", "(Ljava/lang/String;Ldsc;)V", "removeSportDataChangedListener", "Ly7r;", "wearSportData", "onReceiveWearData", "(Ly7r;)V", "Lcom/xiaomi/fitness/sport_eco_manager_export/data/PhoneSportData;", "phoneSportData", "onPhoneDataChanged", "(Lcom/xiaomi/fitness/sport_eco_manager_export/data/PhoneSportData;)V", "<set-?>", "listener$delegate", "Lcom/xiaomi/fitness/service/BinderDelegate;", "getListener", "()Ldsc;", "setListener", "(Ldsc;)V", "<init>", "Companion", "sport-eco-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class EcoSportDataServer extends hsc.a implements ISportDataChangedListener {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(EcoSportDataServer.class, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "getListener()Lcom/xiaomi/fitness/sport_eco_manager_export/listener/IEcoRemoteDataChangedListener;", 0))};
    public static final int KEY_SPORT_DATA_BINDER = 123;

    /* JADX INFO: renamed from: listener$delegate, reason: from kotlin metadata */
    @NotNull
    private final BinderDelegate listener = new BinderDelegate("IRemoteDataChangedListener");

    private final void checkSportDataListener() {
        boolean zI = kdn.f().i(this);
        FitnessLogUtils.i(EcoSportDataServerKt.TAG, "checkSportDataListener , curListenerRegisterSportData ：" + zI);
        if (zI) {
            return;
        }
        kdn.f().d(EcoSportDataServer.class, this);
    }

    private final dsc getListener() {
        return (dsc) this.listener.getValue((Object) this, $$delegatedProperties[0]);
    }

    private final void setListener(dsc dscVar) {
        this.listener.setValue((Object) this, $$delegatedProperties[0], dscVar);
    }

    @Override // defpackage.hsc
    public void addSportDataChangedListener(@Nullable String clazz, @Nullable dsc listener) {
        setListener(listener);
        FitnessLogUtils.i(EcoSportDataServerKt.TAG, "addSportDataChangedListener , listener : " + listener);
        kdn.f().d(EcoSportDataServer.class, this);
        checkSportDataListener();
    }

    @Override // com.xiaomi.fitness.sport_eco_manager_export.listener.ISportDataChangedListener
    public void onPhoneDataChanged(@Nullable PhoneSportData phoneSportData) {
        FitnessLogUtils.i(EcoSportDataServerKt.TAG, "phoneSportData : " + phoneSportData);
        if (phoneSportData == null) {
            return;
        }
        FitnessLogUtils.d(EcoSportDataServerKt.TAG, "server phoneSportData : " + phoneSportData + " , listener : " + getListener());
        if (g2o.s().z() != null) {
            phoneSportData.step += g2o.s().z().totalStep;
        }
        try {
            dsc listener = getListener();
            if (listener != null) {
                listener.onPhoneDataChanged(SportWrapperKt.wrap(phoneSportData));
            } else {
                FitnessLogUtils.i(EcoSportDataServerKt.TAG, "Phone data listener is null");
            }
        } catch (Exception e) {
            FitnessLogUtils.i(EcoSportDataServerKt.TAG, "onPhoneDataChanged error: " + e);
            e.printStackTrace();
        }
    }

    @Override // com.xiaomi.fitness.sport_eco_manager_export.listener.ISportDataChangedListener
    public void onReceiveWearData(@Nullable y7r wearSportData) {
    }

    @Override // defpackage.hsc
    public void removeSportDataChangedListener(@Nullable String clazz, @Nullable dsc listener) {
        FitnessLogUtils.i(EcoSportDataServerKt.TAG, "removeSportDataChangedListener , listener : " + listener);
        setListener(null);
        kdn.f().o(EcoSportDataServer.class, this);
    }
}

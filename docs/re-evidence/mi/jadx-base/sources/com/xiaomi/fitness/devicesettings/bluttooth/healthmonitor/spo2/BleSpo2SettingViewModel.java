package com.xiaomi.fitness.devicesettings.bluttooth.healthmonitor.spo2;

import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.contact.export.SyncResult;
import com.xiaomi.fitness.devicesettings.bluttooth.healthmonitor.BaseHealthMonitorViewModel;
import com.xiaomi.fitness.devicesettings.bluttooth.healthmonitor.spo2.BleSpo2SettingViewModel;
import com.xiaomi.onetrack.c.q;
import defpackage.av9;
import defpackage.fr9;
import defpackage.s7r;
import defpackage.ur9;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\b\b\u0017\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b$\u0010\nJ\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u000f¢\u0006\u0004\b\u0014\u0010\u0012J\u0015\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0015\u0010\u0012J\u0015\u0010\u0016\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0016\u0010\u000eJ\r\u0010\u0017\u001a\u00020\u000b¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\u00020\u00028\u0016X\u0096D¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\"\u0010\u001e\u001a\u00020\u001d8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#¨\u0006%"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/healthmonitor/spo2/BleSpo2SettingViewModel;", "Lcom/xiaomi/fitness/devicesettings/bluttooth/healthmonitor/BaseHealthMonitorViewModel;", "", "method", "Lfr9;", q.f13857a, "", "setBloodOxygenConfig", "(Ljava/lang/String;Lfr9;)V", "loadBloodOxygenConfig", "()V", "", "isOpen", "setSpoOpen", "(Z)V", "", "index", "setBloodOxygenMode", "(I)V", "freq", "setFrequency", "setBlodLowValue", "setLowSwitch", "isSupportAllDay", "()Z", "TAG", "Ljava/lang/String;", "getTAG", "()Ljava/lang/String;", "Lcom/xiaomi/fitness/devicesettings/bluttooth/healthmonitor/spo2/BleSpo2Model;", "spo2Model", "Lcom/xiaomi/fitness/devicesettings/bluttooth/healthmonitor/spo2/BleSpo2Model;", "getSpo2Model", "()Lcom/xiaomi/fitness/devicesettings/bluttooth/healthmonitor/spo2/BleSpo2Model;", "setSpo2Model", "(Lcom/xiaomi/fitness/devicesettings/bluttooth/healthmonitor/spo2/BleSpo2Model;)V", "<init>", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nBleSpo2SettingViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleSpo2SettingViewModel.kt\ncom/xiaomi/fitness/devicesettings/bluttooth/healthmonitor/spo2/BleSpo2SettingViewModel\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,119:1\n1#2:120\n*E\n"})
public class BleSpo2SettingViewModel extends BaseHealthMonitorViewModel {

    @NotNull
    private final String TAG = "BleSpo2SettingViewModel";
    public BleSpo2Model spo2Model;

    public BleSpo2SettingViewModel() {
        getType().postValue(2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit loadBloodOxygenConfig$lambda$2(BleSpo2SettingViewModel this$0, SyncResult result) {
        ur9 ur9VarU;
        fr9 fr9VarQ;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(result, "result");
        s7r packet = result.getPacket();
        if (packet != null && (ur9VarU = packet.u()) != null && (fr9VarQ = ur9VarU.q()) != null) {
            Logger.d(this$0.getTAG(), "loadBloodOxygenConfig:" + fr9VarQ);
            this$0.getSpo2Model().updateConfig(fr9VarQ, true);
        }
        return Unit.INSTANCE;
    }

    private final void setBloodOxygenConfig(String method, final fr9 config) {
        s7r s7rVar = new s7r();
        s7rVar.e = 8;
        s7rVar.f = 9;
        ur9 ur9Var = new ur9();
        ur9Var.h0(config);
        s7rVar.S(ur9Var);
        BaseHealthMonitorViewModel.deviceApiCall$default(this, s7rVar, true, method, new Function1() { // from class: pu2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BleSpo2SettingViewModel.setBloodOxygenConfig$lambda$10(this.f30770a, config, (SyncResult) obj);
            }
        }, null, 16, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setBloodOxygenConfig$lambda$10(BleSpo2SettingViewModel this$0, fr9 config, SyncResult it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(config, "$config");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.getSpo2Model().updateConfig(config, false);
        return Unit.INSTANCE;
    }

    @NotNull
    public final BleSpo2Model getSpo2Model() {
        BleSpo2Model bleSpo2Model = this.spo2Model;
        if (bleSpo2Model != null) {
            return bleSpo2Model;
        }
        Intrinsics.throwUninitializedPropertyAccessException("spo2Model");
        return null;
    }

    @Override // com.xiaomi.fitness.devicesettings.bluttooth.healthmonitor.BaseHealthMonitorViewModel
    @NotNull
    public String getTAG() {
        return this.TAG;
    }

    public final boolean isSupportAllDay() {
        return getSpo2Model().getIsSupportAllDay();
    }

    public final void loadBloodOxygenConfig() {
        s7r s7rVar = new s7r();
        s7rVar.e = 8;
        s7rVar.f = 8;
        BaseHealthMonitorViewModel.deviceApiCall$default(this, s7rVar, true, "loadBloodOxygenConfig", new Function1() { // from class: qu2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BleSpo2SettingViewModel.loadBloodOxygenConfig$lambda$2(this.f31845a, (SyncResult) obj);
            }
        }, null, 16, null);
    }

    public final void setBlodLowValue(int index) {
        fr9 config = getSpo2Model().getConfig();
        int iIntValue = getSpo2Model().getBlodLowList().get(index).intValue();
        getSpo2Model().getConfig().f.c = true;
        getSpo2Model().getConfig().f.d = iIntValue;
        setBloodOxygenConfig("setBlodLowValue(" + index + ")", config);
    }

    public final void setBloodOxygenMode(int index) {
        int size = getSpo2Model().getKModeList().size();
        if (index >= size) {
            Logger.e("setBloodOxygenMode error:out of index " + index + " " + size, new Object[0]);
            return;
        }
        fr9 config = getSpo2Model().getConfig();
        config.d = getSpo2Model().getKModeList().get(index).intValue();
        setBloodOxygenConfig("setBloodOxygenMode(" + index + ")", config);
    }

    public final void setFrequency(int freq) {
        fr9 config = getSpo2Model().getConfig();
        config.e = freq;
        setBloodOxygenConfig("setBloodOxygenFreq(" + freq + ")", config);
    }

    public final void setLowSwitch(boolean isOpen) {
        fr9 config = getSpo2Model().getConfig();
        config.f.c = isOpen;
        setBloodOxygenConfig("setLowSwitch(" + isOpen + ")", config);
    }

    public final void setSpo2Model(@NotNull BleSpo2Model bleSpo2Model) {
        Intrinsics.checkNotNullParameter(bleSpo2Model, "<set-?>");
        this.spo2Model = bleSpo2Model;
    }

    public final void setSpoOpen(boolean isOpen) {
        int i;
        fr9 config = getSpo2Model().getConfig();
        if (isOpen) {
            i = 2;
        } else {
            av9 av9Var = config.f;
            if (av9Var != null) {
                av9Var.c = false;
            }
            i = 0;
        }
        config.d = i;
        setBloodOxygenConfig("setSpoOpen(" + isOpen + ")", config);
    }
}

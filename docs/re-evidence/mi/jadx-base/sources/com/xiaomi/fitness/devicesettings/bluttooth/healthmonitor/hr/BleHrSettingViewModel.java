package com.xiaomi.fitness.devicesettings.bluttooth.healthmonitor.hr;

import com.google.gson.Gson;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.contact.export.SyncResult;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.devicesettings.bluttooth.healthmonitor.BaseHealthMonitorViewModel;
import com.xiaomi.fitness.devicesettings.bluttooth.healthmonitor.hr.BleHrSettingViewModel;
import com.xiaomi.fitness.devicesettings.common.extensions.HeartRateMonitorExtKt;
import com.xiaomi.fitness.devicesettings.utils.DeviceSettingsPreference;
import com.xiaomi.onetrack.c.q;
import defpackage.av9;
import defpackage.ls9;
import defpackage.s7r;
import defpackage.ur9;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\b\u0017\u0018\u0000 32\u00020\u0001:\u00013B\t\b\u0007¢\u0006\u0004\b2\u0010\fJ\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\t\u001a\u00020\u0004*\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0011¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0011¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u001a\u0010\u0017J\u0015\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u001b\u0010\u0010R\u001a\u0010\u001c\u001a\u00020\u00028\u0016X\u0096D¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\"\u0010!\u001a\u00020 8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\"\u0010(\u001a\u00020'8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u0016\u0010.\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010\u001dR\u0014\u0010/\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010\u001dR\u0016\u00100\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101¨\u00064"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/healthmonitor/hr/BleHrSettingViewModel;", "Lcom/xiaomi/fitness/devicesettings/bluttooth/healthmonitor/BaseHealthMonitorViewModel;", "", "method", "Lls9;", q.f13857a, "", "setHeartRateSettingConfig", "(Ljava/lang/String;Lls9;)V", "deepCopy", "(Lls9;)Lls9;", "loadHeartRateSettingConfig", "()V", "", "freq", "setHrFreq", "(I)V", "", "switch", "isHigh", "setWarningSwitch", "(ZZ)V", "setHrHeathySwitch", "(Z)V", "setWarningFreq", "(IZ)V", "setSportHrWarningSwitch", "setSportHrWarningFreq", "TAG", "Ljava/lang/String;", "getTAG", "()Ljava/lang/String;", "Lcom/xiaomi/fitness/devicesettings/bluttooth/healthmonitor/hr/BleHeartRateModel;", "heartRateModel", "Lcom/xiaomi/fitness/devicesettings/bluttooth/healthmonitor/hr/BleHeartRateModel;", "getHeartRateModel", "()Lcom/xiaomi/fitness/devicesettings/bluttooth/healthmonitor/hr/BleHeartRateModel;", "setHeartRateModel", "(Lcom/xiaomi/fitness/devicesettings/bluttooth/healthmonitor/hr/BleHeartRateModel;)V", "Lcom/google/gson/Gson;", "gson", "Lcom/google/gson/Gson;", "getGson", "()Lcom/google/gson/Gson;", "setGson", "(Lcom/google/gson/Gson;)V", "did", "warningSupposeKey", "mWarningSupposed", "Z", "<init>", "Companion", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nBleHrSettingViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleHrSettingViewModel.kt\ncom/xiaomi/fitness/devicesettings/bluttooth/healthmonitor/hr/BleHrSettingViewModel\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,149:1\n1#2:150\n*E\n"})
public class BleHrSettingViewModel extends BaseHealthMonitorViewModel {

    @NotNull
    public static final String KEY_WARNING_SUPPOSED = "key_warning_supposed";

    @NotNull
    private final String TAG = "BleHrSettingViewModel";

    @Nullable
    private final String did;
    public Gson gson;
    public BleHeartRateModel heartRateModel;
    private boolean mWarningSupposed;

    @NotNull
    private final String warningSupposeKey;

    /* JADX WARN: Code duplicated, block: B:10:0x004c  */
    public BleHrSettingViewModel() {
        String str;
        WearableDeviceManager.Companion companion = WearableDeviceManager.INSTANCE;
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(companion).getCurrentDeviceModel();
        this.did = wearableDeviceModel != null ? wearableDeviceModel.getDid() : null;
        getType().postValue(1);
        WearableDeviceModel wearableDeviceModel2 = (WearableDeviceModel) DeviceManagerExtKt.getInstance(companion).getCurrentDeviceModel();
        if (wearableDeviceModel2 != null) {
            str = wearableDeviceModel2.getDid() + "_key_warning_supposed";
            str = str == null ? "key_warning_supposed" : str;
        }
        this.warningSupposeKey = str;
        this.mWarningSupposed = ((Boolean) DeviceSettingsPreference.INSTANCE.getNonNulValue(str, Boolean.FALSE)).booleanValue();
    }

    private final ls9 deepCopy(ls9 ls9Var) {
        Object objFromJson = getGson().fromJson(getGson().toJson(ls9Var), (Class<Object>) ls9.class);
        Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
        return (ls9) objFromJson;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit loadHeartRateSettingConfig$lambda$3(BleHrSettingViewModel this$0, SyncResult it) {
        ur9 ur9VarU;
        ls9 ls9VarZ;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        s7r packet = it.getPacket();
        if (packet != null && (ur9VarU = packet.u()) != null && (ls9VarZ = ur9VarU.z()) != null) {
            Logger.i(this$0.getTAG(), "abnormalCardiac get:" + ls9VarZ.i + "  config.warningLow is null:" + (ls9VarZ.h == null));
            this$0.getHeartRateModel().postConfig(ls9VarZ, true);
        }
        return Unit.INSTANCE;
    }

    private final void setHeartRateSettingConfig(String method, final ls9 config) {
        s7r s7rVar = new s7r();
        s7rVar.e = 8;
        s7rVar.f = 11;
        ur9 ur9Var = new ur9();
        ur9Var.o0(config);
        s7rVar.S(ur9Var);
        BaseHealthMonitorViewModel.deviceApiCall$default(this, s7rVar, true, method, new Function1() { // from class: fr2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BleHrSettingViewModel.setHeartRateSettingConfig$lambda$21(this.f18116a, config, (SyncResult) obj);
            }
        }, null, 16, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setHeartRateSettingConfig$lambda$21(BleHrSettingViewModel this$0, ls9 config, SyncResult it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(config, "$config");
        Intrinsics.checkNotNullParameter(it, "it");
        Logger.i(this$0.getTAG(), "abnormalCardiac set:" + config.i);
        BleHeartRateModel.postConfig$default(this$0.getHeartRateModel(), config, false, 2, null);
        return Unit.INSTANCE;
    }

    @NotNull
    public final Gson getGson() {
        Gson gson = this.gson;
        if (gson != null) {
            return gson;
        }
        Intrinsics.throwUninitializedPropertyAccessException("gson");
        return null;
    }

    @NotNull
    public final BleHeartRateModel getHeartRateModel() {
        BleHeartRateModel bleHeartRateModel = this.heartRateModel;
        if (bleHeartRateModel != null) {
            return bleHeartRateModel;
        }
        Intrinsics.throwUninitializedPropertyAccessException("heartRateModel");
        return null;
    }

    @Override // com.xiaomi.fitness.devicesettings.bluttooth.healthmonitor.BaseHealthMonitorViewModel
    @NotNull
    public String getTAG() {
        return this.TAG;
    }

    public final void loadHeartRateSettingConfig() {
        s7r s7rVar = new s7r();
        s7rVar.e = 8;
        s7rVar.f = 10;
        BaseHealthMonitorViewModel.deviceApiCall$default(this, s7rVar, true, "loadHeartRateSettingConfig", new Function1() { // from class: gr2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BleHrSettingViewModel.loadHeartRateSettingConfig$lambda$3(this.f19258a, (SyncResult) obj);
            }
        }, null, 16, null);
    }

    public final void setGson(@NotNull Gson gson) {
        Intrinsics.checkNotNullParameter(gson, "<set-?>");
        this.gson = gson;
    }

    public final void setHeartRateModel(@NotNull BleHeartRateModel bleHeartRateModel) {
        Intrinsics.checkNotNullParameter(bleHeartRateModel, "<set-?>");
        this.heartRateModel = bleHeartRateModel;
    }

    public final void setHrFreq(int freq) {
        ls9 ls9VarDeepCopy;
        ls9 value = getHeartRateModel().getHrConfig().getValue();
        if (value == null || (ls9VarDeepCopy = deepCopy(value)) == null) {
            ls9VarDeepCopy = null;
        } else {
            ls9VarDeepCopy.c = freq <= -1 ? 1 : 0;
            if (freq > -1) {
                ls9VarDeepCopy.d = freq;
            }
            boolean z = ls9VarDeepCopy.f && HeartRateMonitorExtKt.isWarningAvailable(ls9VarDeepCopy);
            ls9VarDeepCopy.f = z;
            av9 av9Var = ls9VarDeepCopy.h;
            if (av9Var != null) {
                boolean z2 = av9Var.c;
                av9Var.c = (!z2 || z) ? z2 : false;
            }
        }
        if (ls9VarDeepCopy != null) {
            setHeartRateSettingConfig("setHrFreq " + freq, ls9VarDeepCopy);
        }
    }

    public final void setHrHeathySwitch(boolean z) {
        ls9 ls9VarDeepCopy;
        ls9 value = getHeartRateModel().getHrConfig().getValue();
        if (value == null || (ls9VarDeepCopy = deepCopy(value)) == null) {
            ls9VarDeepCopy = null;
        } else {
            ls9VarDeepCopy.i = z ? 1 : 2;
        }
        if (ls9VarDeepCopy != null) {
            setHeartRateSettingConfig("setHrHeathySwitch " + z, ls9VarDeepCopy);
        }
    }

    public final void setSportHrWarningFreq(int freq) {
        ls9 ls9VarDeepCopy;
        ls9 value = getHeartRateModel().getHrConfig().getValue();
        if (value == null || (ls9VarDeepCopy = deepCopy(value)) == null) {
            ls9VarDeepCopy = null;
        } else {
            av9 av9Var = ls9VarDeepCopy.m;
            if (av9Var != null) {
                av9Var.d = freq;
            }
        }
        if (ls9VarDeepCopy != null) {
            setHeartRateSettingConfig("setSportHrWarningFreq " + freq, ls9VarDeepCopy);
        }
    }

    public final void setSportHrWarningSwitch(boolean z) {
        ls9 ls9VarDeepCopy;
        ls9 value = getHeartRateModel().getHrConfig().getValue();
        if (value == null || (ls9VarDeepCopy = deepCopy(value)) == null) {
            ls9VarDeepCopy = null;
        } else {
            av9 av9Var = ls9VarDeepCopy.m;
            if (av9Var != null) {
                av9Var.c = z;
            }
        }
        if (ls9VarDeepCopy != null) {
            setHeartRateSettingConfig("setSportHrWarningSwitch " + z, ls9VarDeepCopy);
        }
    }

    public final void setWarningFreq(int freq, boolean isHigh) {
        ls9 ls9VarDeepCopy;
        ls9 ls9Var = null;
        if (isHigh) {
            ls9 value = getHeartRateModel().getHrConfig().getValue();
            if (value != null && (ls9VarDeepCopy = deepCopy(value)) != null) {
                ls9VarDeepCopy.f = true;
                ls9VarDeepCopy.g = freq;
                ls9Var = ls9VarDeepCopy;
            }
        } else {
            ls9 value2 = getHeartRateModel().getHrConfig().getValue();
            if (value2 != null && (ls9VarDeepCopy = deepCopy(value2)) != null) {
                av9 av9Var = ls9VarDeepCopy.h;
                if (av9Var != null) {
                    av9Var.c = true;
                }
                if (av9Var != null) {
                    av9Var.d = freq;
                }
                ls9Var = ls9VarDeepCopy;
            }
        }
        if (ls9Var != null) {
            setHeartRateSettingConfig("setWarningFreq " + freq, ls9Var);
        }
    }

    public final void setWarningSwitch(boolean z, boolean isHigh) {
        ls9 ls9VarDeepCopy;
        ls9 ls9Var = null;
        if (isHigh) {
            ls9 value = getHeartRateModel().getHrConfig().getValue();
            if (value != null && (ls9VarDeepCopy = deepCopy(value)) != null) {
                ls9VarDeepCopy.f = z;
                ls9Var = ls9VarDeepCopy;
            }
        } else {
            ls9 value2 = getHeartRateModel().getHrConfig().getValue();
            if (value2 != null && (ls9VarDeepCopy = deepCopy(value2)) != null) {
                av9 av9Var = ls9VarDeepCopy.h;
                if (av9Var != null) {
                    av9Var.c = z;
                }
                ls9Var = ls9VarDeepCopy;
            }
        }
        if (ls9Var != null) {
            setHeartRateSettingConfig("setHrWarningSwitch " + z, ls9Var);
        }
    }
}

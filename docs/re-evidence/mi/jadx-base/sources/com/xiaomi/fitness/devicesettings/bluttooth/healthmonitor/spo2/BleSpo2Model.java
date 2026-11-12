package com.xiaomi.fitness.devicesettings.bluttooth.healthmonitor.spo2;

import androidx.lifecycle.MutableLiveData;
import com.miui.tsmclient.net.TSMAuthContants;
import com.miui.tsmclient.nfc.NfcConstants;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.devicesettings.bluttooth.healthmonitor.spo2.BleSpo2Model;
import com.xiaomi.fitness.devicesettings.widget.SetRadioGroup;
import com.xiaomi.onetrack.c.q;
import defpackage.av9;
import defpackage.fr9;
import defpackage.qyi;
import defpackage.wzi;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0018\u0018\u0000 <2\u00020\u0001:\u0002=<B\t\b\u0007¢\u0006\u0004\b:\u0010;J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0012\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0017\u001a\u0016\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0015\u0012\u0004\u0012\u00020\u00160\u0014¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u0019\u001a\u0016\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0015\u0012\u0004\u0012\u00020\u00160\u0014¢\u0006\u0004\b\u0019\u0010\u0018R\u0017\u0010\u001a\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u0007R!\u0010 \u001a\b\u0012\u0004\u0012\u00020\r0\f8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\u000fR\u001d\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00160!8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001d\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00160&8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010\u000fR\"\u0010*\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b*\u0010,\"\u0004\b-\u0010.R%\u00100\u001a\u0010\u0012\f\u0012\n /*\u0004\u0018\u00010\u00100\u00100!8\u0006¢\u0006\f\n\u0004\b0\u0010#\u001a\u0004\b0\u0010%R%\u00101\u001a\u0010\u0012\f\u0012\n /*\u0004\u0018\u00010\u00100\u00100!8\u0006¢\u0006\f\n\u0004\b1\u0010#\u001a\u0004\b1\u0010%R%\u00102\u001a\u0010\u0012\f\u0012\n /*\u0004\u0018\u00010\u00100\u00100!8\u0006¢\u0006\f\n\u0004\b2\u0010#\u001a\u0004\b2\u0010%R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050!8\u0006¢\u0006\f\n\u0004\b\u0006\u0010#\u001a\u0004\b3\u0010%R%\u00104\u001a\u0010\u0012\f\u0012\n /*\u0004\u0018\u00010\u00100\u00100!8\u0006¢\u0006\f\n\u0004\b4\u0010#\u001a\u0004\b4\u0010%R\"\u0010\b\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u00105\u001a\u0004\b6\u0010\u0004\"\u0004\b7\u0010\u000bR\u001d\u00108\u001a\b\u0012\u0004\u0012\u00020\u00160\f8\u0006¢\u0006\f\n\u0004\b8\u0010(\u001a\u0004\b9\u0010\u000f¨\u0006>"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/healthmonitor/spo2/BleSpo2Model;", "", "Lfr9;", "defaultConfig", "()Lfr9;", "", "blodLowReminder", "()Ljava/lang/String;", q.f13857a, "", "updateSupportModes", "(Lfr9;)V", "", "Lcom/xiaomi/fitness/devicesettings/widget/SetRadioGroup$RadioItem;", "buildSpo2FreqRadioItems", "()Ljava/util/List;", "", "isFirstLoad", "updateConfig", "(Lfr9;Z)V", "Lkotlin/Pair;", "", "", "buildBloodOxygenModeItems", "()Lkotlin/Pair;", "buildHypoxemiaNoticeThresholdPair", "radioGroupTitle", "Ljava/lang/String;", "getRadioGroupTitle", "radioItems$delegate", "Lkotlin/Lazy;", "getRadioItems", "radioItems", "Landroidx/lifecycle/MutableLiveData;", "frequency", "Landroidx/lifecycle/MutableLiveData;", "getFrequency", "()Landroidx/lifecycle/MutableLiveData;", "", "kModeList", "Ljava/util/List;", "getKModeList", "isSupportAllDay", "Z", "()Z", "setSupportAllDay", "(Z)V", "kotlin.jvm.PlatformType", "isLDevice", "isLowShow", "isSpoSwitchOpen", "getBlodLowReminder", "isModeOn", "Lfr9;", "getConfig", NfcConstants.METHOD_SET_CONFIG, "blodLowList", "getBlodLowList", "<init>", "()V", "Companion", "Spo2ModelHelper", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nBleSpo2Model.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleSpo2Model.kt\ncom/xiaomi/fitness/devicesettings/bluttooth/healthmonitor/spo2/BleSpo2Model\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,176:1\n1872#2,3:177\n1872#2,3:184\n37#3:180\n36#3,3:181\n37#3:187\n36#3,3:188\n*S KotlinDebug\n*F\n+ 1 BleSpo2Model.kt\ncom/xiaomi/fitness/devicesettings/bluttooth/healthmonitor/spo2/BleSpo2Model\n*L\n100#1:177,3\n110#1:184,3\n104#1:180\n104#1:181,3\n115#1:187\n115#1:188,3\n*E\n"})
public final class BleSpo2Model {
    public static final int SPO2_FREQ_10 = 10;
    public static final int SPO2_FREQ_30 = 30;

    @NotNull
    private final List<Integer> blodLowList;

    @NotNull
    private final MutableLiveData<String> blodLowReminder;

    @NotNull
    private fr9 config;

    @NotNull
    private final MutableLiveData<Boolean> isLDevice;

    @NotNull
    private final MutableLiveData<Boolean> isLowShow;

    @NotNull
    private final MutableLiveData<Boolean> isModeOn;

    @NotNull
    private final MutableLiveData<Boolean> isSpoSwitchOpen;

    @NotNull
    private final String radioGroupTitle = ResourceExtKt.getString(wzi.F7);

    /* JADX INFO: renamed from: radioItems$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy radioItems = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: ju2
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return BleSpo2Model.radioItems_delegate$lambda$0(this.f23131a);
        }
    });

    @NotNull
    private final MutableLiveData<Integer> frequency = new MutableLiveData<>();

    @NotNull
    private final List<Integer> kModeList = CollectionsKt__CollectionsKt.mutableListOf(0, 1);
    private boolean isSupportAllDay = true;

    public BleSpo2Model() {
        Boolean bool = Boolean.FALSE;
        this.isLDevice = new MutableLiveData<>(bool);
        this.isLowShow = new MutableLiveData<>(bool);
        this.isSpoSwitchOpen = new MutableLiveData<>(bool);
        this.blodLowReminder = new MutableLiveData<>();
        this.isModeOn = new MutableLiveData<>(bool);
        this.config = defaultConfig();
        this.blodLowList = CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{80, 85, 90});
    }

    private final String blodLowReminder() {
        av9 av9Var = this.config.f;
        if (av9Var != null && av9Var.c) {
            return Spo2ModelHelper.INSTANCE.getBlodLowString(av9Var.d);
        }
        return ResourceExtKt.getString(wzi.q3);
    }

    private final List<SetRadioGroup.RadioItem> buildSpo2FreqRadioItems() {
        Spo2ModelHelper spo2ModelHelper = Spo2ModelHelper.INSTANCE;
        return CollectionsKt__CollectionsKt.listOf((Object[]) new SetRadioGroup.RadioItem[]{new SetRadioGroup.RadioItem(30, spo2ModelHelper.getBlodLowStringMin(30), ResourceExtKt.getString(wzi.D7), false, 8, null), new SetRadioGroup.RadioItem(10, spo2ModelHelper.getBlodLowStringMin(10), ResourceExtKt.getString(wzi.E7), false, 8, null)});
    }

    private final fr9 defaultConfig() {
        return new fr9();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List radioItems_delegate$lambda$0(BleSpo2Model this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return this$0.buildSpo2FreqRadioItems();
    }

    private final void updateSupportModes(fr9 config) {
        this.kModeList.clear();
        List listMutableListOf = CollectionsKt__CollectionsKt.mutableListOf(0, 1);
        if (config.c) {
            listMutableListOf.add(2);
        }
        this.kModeList.addAll(listMutableListOf);
    }

    @NotNull
    public final Pair<String[], Integer> buildBloodOxygenModeItems() {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        int i2 = 0;
        for (Object obj : this.kModeList) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            int iIntValue = ((Number) obj).intValue();
            if (this.config.d == iIntValue) {
                i = i2;
            }
            arrayList.add(Spo2ModelHelper.INSTANCE.getBloodOxygenModeStr(iIntValue));
            i2 = i3;
        }
        return new Pair<>(arrayList.toArray(new String[0]), Integer.valueOf(i));
    }

    @NotNull
    public final Pair<String[], Integer> buildHypoxemiaNoticeThresholdPair() {
        int size = this.blodLowList.size();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (Object obj : this.blodLowList) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            int iIntValue = ((Number) obj).intValue();
            av9 av9Var = this.config.f;
            if (av9Var != null && av9Var.c && av9Var != null && av9Var.d == iIntValue) {
                size = i;
            }
            arrayList.add(Spo2ModelHelper.INSTANCE.getBlodLowString(iIntValue));
            i = i2;
        }
        arrayList.add(ResourceExtKt.getString(wzi.q3));
        return new Pair<>(arrayList.toArray(new String[0]), Integer.valueOf(size));
    }

    @NotNull
    public final List<Integer> getBlodLowList() {
        return this.blodLowList;
    }

    @NotNull
    public final MutableLiveData<String> getBlodLowReminder() {
        return this.blodLowReminder;
    }

    @NotNull
    public final fr9 getConfig() {
        return this.config;
    }

    @NotNull
    public final MutableLiveData<Integer> getFrequency() {
        return this.frequency;
    }

    @NotNull
    public final List<Integer> getKModeList() {
        return this.kModeList;
    }

    @NotNull
    public final String getRadioGroupTitle() {
        return this.radioGroupTitle;
    }

    @NotNull
    public final List<SetRadioGroup.RadioItem> getRadioItems() {
        return (List) this.radioItems.getValue();
    }

    @NotNull
    public final MutableLiveData<Boolean> isLDevice() {
        return this.isLDevice;
    }

    @NotNull
    public final MutableLiveData<Boolean> isLowShow() {
        return this.isLowShow;
    }

    @NotNull
    public final MutableLiveData<Boolean> isModeOn() {
        return this.isModeOn;
    }

    @NotNull
    public final MutableLiveData<Boolean> isSpoSwitchOpen() {
        return this.isSpoSwitchOpen;
    }

    /* JADX INFO: renamed from: isSupportAllDay, reason: from getter */
    public final boolean getIsSupportAllDay() {
        return this.isSupportAllDay;
    }

    public final void setConfig(@NotNull fr9 fr9Var) {
        Intrinsics.checkNotNullParameter(fr9Var, "<set-?>");
        this.config = fr9Var;
    }

    public final void setSupportAllDay(boolean z) {
        this.isSupportAllDay = z;
    }

    public final void updateConfig(@NotNull fr9 config, boolean isFirstLoad) {
        Intrinsics.checkNotNullParameter(config, "config");
        if (isFirstLoad) {
            updateSupportModes(config);
        }
        fr9 fr9Var = this.config;
        fr9Var.f = config.f;
        fr9Var.d = config.d;
        fr9Var.c = config.c;
        fr9Var.e = config.e;
        boolean z = config.e == 0;
        this.isLDevice.postValue(Boolean.valueOf(z));
        this.isLowShow.postValue(Boolean.valueOf(config.f != null));
        this.isSpoSwitchOpen.postValue(Boolean.valueOf(config.d == 2));
        this.blodLowReminder.postValue(z ? blodLowReminder() : Spo2ModelHelper.INSTANCE.getBloodOxygenModeStr(config));
        this.isModeOn.postValue(Boolean.valueOf(Spo2ModelHelper.INSTANCE.isModeOn(config)));
        this.frequency.postValue(Integer.valueOf(config.e));
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\tJ\u0015\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\u0006J\u0015\u0010\f\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\u0006J\u001d\u0010\u0010\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0012\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/healthmonitor/spo2/BleSpo2Model$Spo2ModelHelper;", "", "", "mode", "", "getBloodOxygenModeStr", "(I)Ljava/lang/String;", "Lfr9;", q.f13857a, "(Lfr9;)Ljava/lang/String;", TSMAuthContants.PARAM_THRESHOLD, "getBlodLowString", "getBlodLowStringMin", "", PluginDeviceInfo.FMODEL, PluginDeviceInfo.FDESC, "loginAnd", "(ZZ)Z", "isModeOn", "(Lfr9;)Z", "<init>", "()V", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public static final class Spo2ModelHelper {

        @NotNull
        public static final Spo2ModelHelper INSTANCE = new Spo2ModelHelper();

        private Spo2ModelHelper() {
        }

        @NotNull
        public final String getBlodLowString(int threshold) {
            return ResourceExtKt.getQuantityString(ApplicationExtKt.getApplication(), qyi.m, threshold, Integer.valueOf(threshold));
        }

        @NotNull
        public final String getBlodLowStringMin(int threshold) {
            return ResourceExtKt.getQuantityString(ApplicationExtKt.getApplication(), qyi.t, threshold, Integer.valueOf(threshold));
        }

        @Nullable
        public final String getBloodOxygenModeStr(@NotNull fr9 config) {
            Intrinsics.checkNotNullParameter(config, "config");
            return getBloodOxygenModeStr(config.d);
        }

        public final boolean isModeOn(@NotNull fr9 config) {
            Intrinsics.checkNotNullParameter(config, "config");
            return config.d != 0;
        }

        public final boolean loginAnd(boolean a2, boolean b2) {
            return a2 && b2;
        }

        @Nullable
        public final String getBloodOxygenModeStr(int mode) {
            if (mode == 0) {
                return ResourceExtKt.getString(wzi.J7);
            }
            if (mode == 1) {
                return ResourceExtKt.getString(wzi.K7);
            }
            if (mode != 2) {
                return null;
            }
            return ResourceExtKt.getString(wzi.I7);
        }
    }
}

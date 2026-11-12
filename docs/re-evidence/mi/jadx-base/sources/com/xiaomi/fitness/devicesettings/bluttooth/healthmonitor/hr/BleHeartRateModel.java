package com.xiaomi.fitness.devicesettings.bluttooth.healthmonitor.hr;

import androidx.lifecycle.MutableLiveData;
import com.google.gson.Gson;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.onetrack.c.q;
import defpackage.av9;
import defpackage.ls9;
import defpackage.qyi;
import defpackage.wzi;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt___RangesKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 =2\u00020\u0001:\u0001=B\t\b\u0007¢\u0006\u0004\b;\u0010<J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\t¢\u0006\u0004\b\u0010\u0010\u0011J7\u0010\u0018\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u0016\u0012\u0004\u0012\u00020\f0\u00152\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\t¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\f¢\u0006\u0004\b\u001b\u0010\u001cJ\u001d\u0010\u001e\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\t¢\u0006\u0004\b\u001e\u0010\u001fJ\r\u0010 \u001a\u00020\f¢\u0006\u0004\b \u0010!R\"\u0010#\u001a\u00020\"8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u001d\u0010*\u001a\b\u0012\u0004\u0012\u00020\f0)8\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u001d\u0010.\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006¢\u0006\f\n\u0004\b.\u0010+\u001a\u0004\b/\u0010-R\u001d\u00100\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006¢\u0006\f\n\u0004\b0\u0010+\u001a\u0004\b1\u0010-R\u001d\u00102\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006¢\u0006\f\n\u0004\b2\u0010+\u001a\u0004\b3\u0010-R\u001d\u00105\u001a\b\u0012\u0004\u0012\u00020\u0002048\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u0011\u0010:\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b9\u0010!¨\u0006>"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/healthmonitor/hr/BleHeartRateModel;", "", "Lls9;", q.f13857a, "", "initFreq", "(Lls9;)V", "defaultConfig", "()Lls9;", "", "supportIntelligent", "", "", "createHrFreq", "(Z)Ljava/util/List;", "init", "postConfig", "(Lls9;Z)V", "warningValue", "isHigh", "isOpen", "Lkotlin/Pair;", "", "", "getFrequencyStr", "(IZZ)Lkotlin/Pair;", "freq", "getHrWarningStr", "(I)Ljava/lang/String;", "index", "getFrequencyValue", "(IZ)I", "getCurHrFreqIndex", "()I", "Lcom/google/gson/Gson;", "gson", "Lcom/google/gson/Gson;", "getGson", "()Lcom/google/gson/Gson;", "setGson", "(Lcom/google/gson/Gson;)V", "", "hrFreq", "Ljava/util/List;", "getHrFreq", "()Ljava/util/List;", "highList", "getHighList", "lowList", "getLowList", "warningSportFreq", "getWarningSportFreq", "Landroidx/lifecycle/MutableLiveData;", "hrConfig", "Landroidx/lifecycle/MutableLiveData;", "getHrConfig", "()Landroidx/lifecycle/MutableLiveData;", "getCurSportWarningValue", "curSportWarningValue", "<init>", "()V", "Companion", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nBleHeartRateModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleHeartRateModel.kt\ncom/xiaomi/fitness/devicesettings/bluttooth/healthmonitor/hr/BleHeartRateModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,91:1\n1872#2,3:92\n37#3:95\n36#3,3:96\n*S KotlinDebug\n*F\n+ 1 BleHeartRateModel.kt\ncom/xiaomi/fitness/devicesettings/bluttooth/healthmonitor/hr/BleHeartRateModel\n*L\n46#1:92,3\n51#1:95\n51#1:96,3\n*E\n"})
public final class BleHeartRateModel {
    public static final int FREQ_CLOSE = -1;
    public static final int FREQ_CONTINUOUS = 1;
    public static final int FREQ_INTELLIGENT = 0;
    public Gson gson;

    @NotNull
    private final List<Integer> hrFreq = new ArrayList();

    @NotNull
    private final List<Integer> highList = CollectionsKt___CollectionsKt.toList(RangesKt___RangesKt.step(new IntRange(100, 150), 10));

    @NotNull
    private final List<Integer> lowList = CollectionsKt___CollectionsKt.toList(RangesKt___RangesKt.step(new IntRange(40, 50), 5));

    @NotNull
    private final List<Integer> warningSportFreq = CollectionsKt___CollectionsKt.toList(new IntRange(160, 200));

    @NotNull
    private final MutableLiveData<ls9> hrConfig = new MutableLiveData<>(defaultConfig());

    private final List<Integer> createHrFreq(boolean supportIntelligent) {
        return supportIntelligent ? CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{-1, 0, 1, 10, 30}) : CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{-1, 1, 5, 10, 30});
    }

    private final ls9 defaultConfig() {
        return new ls9();
    }

    private final void initFreq(ls9 config) {
        this.hrFreq.clear();
        this.hrFreq.addAll(createHrFreq(config.e));
    }

    public static /* synthetic */ void postConfig$default(BleHeartRateModel bleHeartRateModel, ls9 ls9Var, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        bleHeartRateModel.postConfig(ls9Var, z);
    }

    public final int getCurHrFreqIndex() {
        ls9 value = this.hrConfig.getValue();
        if (value != null) {
            return value.c == 0 ? this.hrFreq.indexOf(Integer.valueOf(value.d)) : this.hrFreq.indexOf(-1);
        }
        return -1;
    }

    public final int getCurSportWarningValue() {
        av9 av9Var;
        ls9 value = this.hrConfig.getValue();
        return (value == null || (av9Var = value.m) == null) ? ((Number) CollectionsKt___CollectionsKt.first((List) this.warningSportFreq)).intValue() : av9Var.d;
    }

    @NotNull
    public final Pair<String[], Integer> getFrequencyStr(int warningValue, boolean isHigh, boolean isOpen) {
        List<Integer> list = isHigh ? this.highList : this.lowList;
        int size = list.size();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            int iIntValue = ((Number) obj).intValue();
            if (isOpen && warningValue == iIntValue) {
                size = i;
            }
            arrayList.add(getHrWarningStr(iIntValue));
            i = i2;
        }
        arrayList.add(ResourceExtKt.getString(wzi.q3));
        return new Pair<>(arrayList.toArray(new String[0]), Integer.valueOf(size));
    }

    public final int getFrequencyValue(int index, boolean isHigh) {
        List<Integer> list = isHigh ? this.highList : this.lowList;
        if (index == list.size()) {
            return -1;
        }
        return list.get(index).intValue();
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
    public final List<Integer> getHighList() {
        return this.highList;
    }

    @NotNull
    public final MutableLiveData<ls9> getHrConfig() {
        return this.hrConfig;
    }

    @NotNull
    public final List<Integer> getHrFreq() {
        return this.hrFreq;
    }

    @NotNull
    public final String getHrWarningStr(int freq) {
        String quantityString = AppUtil.getApp().getResources().getQuantityString(qyi.j, freq, Integer.valueOf(freq));
        Intrinsics.checkNotNullExpressionValue(quantityString, "getQuantityString(...)");
        return quantityString;
    }

    @NotNull
    public final List<Integer> getLowList() {
        return this.lowList;
    }

    @NotNull
    public final List<Integer> getWarningSportFreq() {
        return this.warningSportFreq;
    }

    public final void postConfig(@NotNull ls9 config, boolean init) {
        Intrinsics.checkNotNullParameter(config, "config");
        Logger.d("BleHeartRateModel", " postConfig " + getGson().toJson(config));
        if (init) {
            initFreq(config);
        }
        this.hrConfig.postValue(config);
    }

    public final void setGson(@NotNull Gson gson) {
        Intrinsics.checkNotNullParameter(gson, "<set-?>");
        this.gson = gson;
    }
}

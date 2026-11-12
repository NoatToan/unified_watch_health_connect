package com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.language.vo;

import com.baidu.ocr.sdk.utils.LogUtil;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0002\u0012\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0004\b#\u0010$J\u0006\u0010\u0003\u001a\u00020\u0002J\u000f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0002HÆ\u0003J\u0017\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J;\u0010\r\u001a\u00020\u00002\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u00022\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0001J\t\u0010\u000e\u001a\u00020\bHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003R(\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\"\u0010\u000b\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR'\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0006@\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"¨\u0006%"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/language/vo/CommonLanguageConfig;", "", "", "getCurrLanguageKey", "", "component1", "component2", "Lkotlin/Function1;", "", "component3", "languageKeys", "currIndex", "toDesc", "copy", "toString", "hashCode", "other", "", "equals", "a", "Ljava/util/List;", "getLanguageKeys", "()Ljava/util/List;", "setLanguageKeys", "(Ljava/util/List;)V", "b", LogUtil.I, "getCurrIndex", "()I", "setCurrIndex", "(I)V", "c", "Lkotlin/jvm/functions/Function1;", "getToDesc", "()Lkotlin/jvm/functions/Function1;", "<init>", "(Ljava/util/List;ILkotlin/jvm/functions/Function1;)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final /* data */ class CommonLanguageConfig {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private List<Integer> languageKeys;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private int currIndex;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @Nullable
    private final Function1<Integer, String> toDesc;

    public CommonLanguageConfig() {
        this(null, 0, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CommonLanguageConfig(@NotNull List<Integer> list, int i, @Nullable Function1<? super Integer, String> function1) {
        this.languageKeys = list;
        this.currIndex = i;
        this.toDesc = function1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CommonLanguageConfig copy$default(CommonLanguageConfig commonLanguageConfig, List list, int i, Function1 function1, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            list = commonLanguageConfig.languageKeys;
        }
        if ((i2 & 2) != 0) {
            i = commonLanguageConfig.currIndex;
        }
        if ((i2 & 4) != 0) {
            function1 = commonLanguageConfig.toDesc;
        }
        return commonLanguageConfig.copy(list, i, function1);
    }

    @NotNull
    public final List<Integer> component1() {
        return this.languageKeys;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getCurrIndex() {
        return this.currIndex;
    }

    @Nullable
    public final Function1<Integer, String> component3() {
        return this.toDesc;
    }

    @NotNull
    public final CommonLanguageConfig copy(@NotNull List<Integer> languageKeys, int currIndex, @Nullable Function1<? super Integer, String> toDesc) {
        return new CommonLanguageConfig(languageKeys, currIndex, toDesc);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CommonLanguageConfig)) {
            return false;
        }
        CommonLanguageConfig commonLanguageConfig = (CommonLanguageConfig) other;
        return Intrinsics.areEqual(this.languageKeys, commonLanguageConfig.languageKeys) && this.currIndex == commonLanguageConfig.currIndex && Intrinsics.areEqual(this.toDesc, commonLanguageConfig.toDesc);
    }

    public final int getCurrIndex() {
        return this.currIndex;
    }

    public final int getCurrLanguageKey() {
        return this.languageKeys.get(this.currIndex).intValue();
    }

    @NotNull
    public final List<Integer> getLanguageKeys() {
        return this.languageKeys;
    }

    @Nullable
    public final Function1<Integer, String> getToDesc() {
        return this.toDesc;
    }

    public int hashCode() {
        int iHashCode = ((this.languageKeys.hashCode() * 31) + this.currIndex) * 31;
        Function1<Integer, String> function1 = this.toDesc;
        return iHashCode + (function1 == null ? 0 : function1.hashCode());
    }

    public final void setCurrIndex(int i) {
        this.currIndex = i;
    }

    public final void setLanguageKeys(@NotNull List<Integer> list) {
        this.languageKeys = list;
    }

    @NotNull
    public String toString() {
        return "CommonLanguageConfig(languageKeys=" + this.languageKeys + ", currIndex=" + this.currIndex + ", toDesc=" + this.toDesc + ")";
    }

    public /* synthetic */ CommonLanguageConfig(List list, int i, Function1 function1, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? new ArrayList() : list, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? null : function1);
    }
}

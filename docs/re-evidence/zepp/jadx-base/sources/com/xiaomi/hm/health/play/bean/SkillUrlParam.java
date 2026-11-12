package com.xiaomi.hm.health.play.bean;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0005HÆ\u0003J#\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\b\u001a\u00020\u0005HÆ\u0001J\t\u0010\n\u001a\u00020\u0005HÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0019\u0010\b\u001a\u00020\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\b\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, d2 = {"Lcom/xiaomi/hm/health/play/bean/SkillUrlParam;", "", "", "Lcom/xiaomi/hm/health/play/bean/SkillUrlDeviceInfo;", "component1", "", "component2", "device", "lang", "copy", "toString", "", "hashCode", "other", "", "equals", "Ljava/util/List;", "getDevice", "()Ljava/util/List;", "Ljava/lang/String;", "getLang", "()Ljava/lang/String;", "<init>", "(Ljava/util/List;Ljava/lang/String;)V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final /* data */ class SkillUrlParam {

    @NotNull
    private final List<SkillUrlDeviceInfo> device;

    @NotNull
    private final String lang;

    public SkillUrlParam(@NotNull List<SkillUrlDeviceInfo> list, @NotNull String str) {
        this.device = list;
        this.lang = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SkillUrlParam copy$default(SkillUrlParam skillUrlParam, List list, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            list = skillUrlParam.device;
        }
        if ((i & 2) != 0) {
            str = skillUrlParam.lang;
        }
        return skillUrlParam.copy(list, str);
    }

    @NotNull
    public final List<SkillUrlDeviceInfo> component1() {
        return this.device;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getLang() {
        return this.lang;
    }

    @NotNull
    public final SkillUrlParam copy(@NotNull List<SkillUrlDeviceInfo> device, @NotNull String lang) {
        return new SkillUrlParam(device, lang);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SkillUrlParam)) {
            return false;
        }
        SkillUrlParam skillUrlParam = (SkillUrlParam) other;
        return Intrinsics.areEqual(this.device, skillUrlParam.device) && Intrinsics.areEqual(this.lang, skillUrlParam.lang);
    }

    @NotNull
    public final List<SkillUrlDeviceInfo> getDevice() {
        return this.device;
    }

    @NotNull
    public final String getLang() {
        return this.lang;
    }

    public int hashCode() {
        return (this.device.hashCode() * 31) + this.lang.hashCode();
    }

    @NotNull
    public String toString() {
        return "SkillUrlParam(device=" + this.device + ", lang=" + this.lang + ")";
    }
}

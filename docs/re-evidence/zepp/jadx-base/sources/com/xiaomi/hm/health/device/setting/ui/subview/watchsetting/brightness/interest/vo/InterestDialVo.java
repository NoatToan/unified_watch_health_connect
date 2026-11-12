package com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.brightness.interest.vo;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u001a\u0010\u001bJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u000f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003J#\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00022\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001J\t\u0010\n\u001a\u00020\u0002HÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u0007\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001c"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/brightness/interest/vo/InterestDialVo;", "", "", "component1", "", "Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/brightness/interest/vo/InterestWatchFaceVo;", "component2", "selectedId", "watchFaceVos", "copy", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "getSelectedId", "()Ljava/lang/String;", "setSelectedId", "(Ljava/lang/String;)V", "b", "Ljava/util/List;", "getWatchFaceVos", "()Ljava/util/List;", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final /* data */ class InterestDialVo {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private String selectedId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private final List<InterestWatchFaceVo> watchFaceVos;

    public InterestDialVo(@NotNull String str, @NotNull List<InterestWatchFaceVo> list) {
        this.selectedId = str;
        this.watchFaceVos = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ InterestDialVo copy$default(InterestDialVo interestDialVo, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = interestDialVo.selectedId;
        }
        if ((i & 2) != 0) {
            list = interestDialVo.watchFaceVos;
        }
        return interestDialVo.copy(str, list);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSelectedId() {
        return this.selectedId;
    }

    @NotNull
    public final List<InterestWatchFaceVo> component2() {
        return this.watchFaceVos;
    }

    @NotNull
    public final InterestDialVo copy(@NotNull String selectedId, @NotNull List<InterestWatchFaceVo> watchFaceVos) {
        return new InterestDialVo(selectedId, watchFaceVos);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InterestDialVo)) {
            return false;
        }
        InterestDialVo interestDialVo = (InterestDialVo) other;
        return Intrinsics.areEqual(this.selectedId, interestDialVo.selectedId) && Intrinsics.areEqual(this.watchFaceVos, interestDialVo.watchFaceVos);
    }

    @NotNull
    public final String getSelectedId() {
        return this.selectedId;
    }

    @NotNull
    public final List<InterestWatchFaceVo> getWatchFaceVos() {
        return this.watchFaceVos;
    }

    public int hashCode() {
        return (this.selectedId.hashCode() * 31) + this.watchFaceVos.hashCode();
    }

    public final void setSelectedId(@NotNull String str) {
        this.selectedId = str;
    }

    @NotNull
    public String toString() {
        return "InterestDialVo(selectedId=" + this.selectedId + ", watchFaceVos=" + this.watchFaceVos + ")";
    }
}

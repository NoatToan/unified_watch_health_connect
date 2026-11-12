package com.huami.sky.ui.play;

import com.baidu.ocr.sdk.utils.LogUtil;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u001c\u0010\u001dJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\u000f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J-\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\t\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015R\u001f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, d2 = {"Lcom/huami/sky/ui/play/SkyPlaybackParam;", "", "", "component1", "component2", "", "", "component3", "requestNextMusicTime", "playNextMusicAnimTime", "volumeFadeInOut", "copy", "", "toString", "hashCode", "other", "", "equals", "a", LogUtil.I, "getRequestNextMusicTime", "()I", "b", "getPlayNextMusicAnimTime", "c", "Ljava/util/List;", "getVolumeFadeInOut", "()Ljava/util/List;", "<init>", "(IILjava/util/List;)V", "sky-ui_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class SkyPlaybackParam {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final int requestNextMusicTime;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final int playNextMusicAnimTime;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @NotNull
    private final List<Float> volumeFadeInOut;

    public SkyPlaybackParam() {
        this(0, 0, null, 7, null);
    }

    public SkyPlaybackParam(int i, int i2, @NotNull List<Float> list) {
        this.requestNextMusicTime = i;
        this.playNextMusicAnimTime = i2;
        this.volumeFadeInOut = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SkyPlaybackParam copy$default(SkyPlaybackParam skyPlaybackParam, int i, int i2, List list, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = skyPlaybackParam.requestNextMusicTime;
        }
        if ((i3 & 2) != 0) {
            i2 = skyPlaybackParam.playNextMusicAnimTime;
        }
        if ((i3 & 4) != 0) {
            list = skyPlaybackParam.volumeFadeInOut;
        }
        return skyPlaybackParam.copy(i, i2, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getRequestNextMusicTime() {
        return this.requestNextMusicTime;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getPlayNextMusicAnimTime() {
        return this.playNextMusicAnimTime;
    }

    @NotNull
    public final List<Float> component3() {
        return this.volumeFadeInOut;
    }

    @NotNull
    public final SkyPlaybackParam copy(int requestNextMusicTime, int playNextMusicAnimTime, @NotNull List<Float> volumeFadeInOut) {
        return new SkyPlaybackParam(requestNextMusicTime, playNextMusicAnimTime, volumeFadeInOut);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SkyPlaybackParam)) {
            return false;
        }
        SkyPlaybackParam skyPlaybackParam = (SkyPlaybackParam) other;
        return this.requestNextMusicTime == skyPlaybackParam.requestNextMusicTime && this.playNextMusicAnimTime == skyPlaybackParam.playNextMusicAnimTime && Intrinsics.areEqual(this.volumeFadeInOut, skyPlaybackParam.volumeFadeInOut);
    }

    public final int getPlayNextMusicAnimTime() {
        return this.playNextMusicAnimTime;
    }

    public final int getRequestNextMusicTime() {
        return this.requestNextMusicTime;
    }

    @NotNull
    public final List<Float> getVolumeFadeInOut() {
        return this.volumeFadeInOut;
    }

    public int hashCode() {
        return (((this.requestNextMusicTime * 31) + this.playNextMusicAnimTime) * 31) + this.volumeFadeInOut.hashCode();
    }

    @NotNull
    public String toString() {
        return "SkyPlaybackParam(requestNextMusicTime=" + this.requestNextMusicTime + ", playNextMusicAnimTime=" + this.playNextMusicAnimTime + ", volumeFadeInOut=" + this.volumeFadeInOut + ")";
    }

    public /* synthetic */ SkyPlaybackParam(int i, int i2, List list, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 20 : i, (i3 & 2) != 0 ? 5 : i2, (i3 & 4) != 0 ? CollectionsKt__CollectionsKt.mutableListOf(Float.valueOf(0.01f), Float.valueOf(0.04f), Float.valueOf(0.09f), Float.valueOf(0.16f), Float.valueOf(0.25f), Float.valueOf(0.36f), Float.valueOf(0.49f), Float.valueOf(0.64f), Float.valueOf(0.81f), Float.valueOf(1.0f)) : list);
    }
}

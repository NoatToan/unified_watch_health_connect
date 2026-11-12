package com.huami.snore.ui.adapter;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.snore.core.vo.VoiceShowInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u001b\u0010\u001cJ\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u001f\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\t\u0010\u000b\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R$\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\"\u0010\u0007\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, d2 = {"Lcom/huami/snore/ui/adapter/WrapVoiceInfo;", "", "Lcom/huami/snore/core/vo/VoiceShowInfo;", "component1", "", "component2", "voiceInfo", "position", "copy", "", "toString", "hashCode", "other", "", "equals", "a", "Lcom/huami/snore/core/vo/VoiceShowInfo;", "getVoiceInfo", "()Lcom/huami/snore/core/vo/VoiceShowInfo;", "setVoiceInfo", "(Lcom/huami/snore/core/vo/VoiceShowInfo;)V", "b", LogUtil.I, "getPosition", "()I", "setPosition", "(I)V", "<init>", "(Lcom/huami/snore/core/vo/VoiceShowInfo;I)V", "snore_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class WrapVoiceInfo {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @Nullable
    private VoiceShowInfo voiceInfo;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private int position;

    public WrapVoiceInfo(@Nullable VoiceShowInfo voiceShowInfo, int i) {
        this.voiceInfo = voiceShowInfo;
        this.position = i;
    }

    public static /* synthetic */ WrapVoiceInfo copy$default(WrapVoiceInfo wrapVoiceInfo, VoiceShowInfo voiceShowInfo, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            voiceShowInfo = wrapVoiceInfo.voiceInfo;
        }
        if ((i2 & 2) != 0) {
            i = wrapVoiceInfo.position;
        }
        return wrapVoiceInfo.copy(voiceShowInfo, i);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final VoiceShowInfo getVoiceInfo() {
        return this.voiceInfo;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getPosition() {
        return this.position;
    }

    @NotNull
    public final WrapVoiceInfo copy(@Nullable VoiceShowInfo voiceInfo, int position) {
        return new WrapVoiceInfo(voiceInfo, position);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WrapVoiceInfo)) {
            return false;
        }
        WrapVoiceInfo wrapVoiceInfo = (WrapVoiceInfo) other;
        return Intrinsics.areEqual(this.voiceInfo, wrapVoiceInfo.voiceInfo) && this.position == wrapVoiceInfo.position;
    }

    public final int getPosition() {
        return this.position;
    }

    @Nullable
    public final VoiceShowInfo getVoiceInfo() {
        return this.voiceInfo;
    }

    public int hashCode() {
        VoiceShowInfo voiceShowInfo = this.voiceInfo;
        return ((voiceShowInfo == null ? 0 : voiceShowInfo.hashCode()) * 31) + this.position;
    }

    public final void setPosition(int i) {
        this.position = i;
    }

    public final void setVoiceInfo(@Nullable VoiceShowInfo voiceShowInfo) {
        this.voiceInfo = voiceShowInfo;
    }

    @NotNull
    public String toString() {
        return "WrapVoiceInfo(voiceInfo=" + this.voiceInfo + ", position=" + this.position + ")";
    }
}

package com.xiaomi.hm.health.play.card;

import com.xiaomi.hm.health.play.PlayTool;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0018\u0010\u0019J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u001d\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0006\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0007\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Lcom/xiaomi/hm/health/play/card/CardUiData;", "", "Lcom/xiaomi/hm/health/play/PlayTool;", "component1", "Lcom/xiaomi/hm/health/play/card/ICardRender;", "component2", "playTool", "cardRender", "copy", "", "toString", "", "hashCode", "other", "", "equals", "a", "Lcom/xiaomi/hm/health/play/PlayTool;", "getPlayTool", "()Lcom/xiaomi/hm/health/play/PlayTool;", "b", "Lcom/xiaomi/hm/health/play/card/ICardRender;", "getCardRender", "()Lcom/xiaomi/hm/health/play/card/ICardRender;", "<init>", "(Lcom/xiaomi/hm/health/play/PlayTool;Lcom/xiaomi/hm/health/play/card/ICardRender;)V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final /* data */ class CardUiData {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private final PlayTool playTool;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private final ICardRender cardRender;

    public CardUiData(@NotNull PlayTool playTool, @NotNull ICardRender iCardRender) {
        this.playTool = playTool;
        this.cardRender = iCardRender;
    }

    public static /* synthetic */ CardUiData copy$default(CardUiData cardUiData, PlayTool playTool, ICardRender iCardRender, int i, Object obj) {
        if ((i & 1) != 0) {
            playTool = cardUiData.playTool;
        }
        if ((i & 2) != 0) {
            iCardRender = cardUiData.cardRender;
        }
        return cardUiData.copy(playTool, iCardRender);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final PlayTool getPlayTool() {
        return this.playTool;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final ICardRender getCardRender() {
        return this.cardRender;
    }

    @NotNull
    public final CardUiData copy(@NotNull PlayTool playTool, @NotNull ICardRender cardRender) {
        return new CardUiData(playTool, cardRender);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CardUiData)) {
            return false;
        }
        CardUiData cardUiData = (CardUiData) other;
        return Intrinsics.areEqual(this.playTool, cardUiData.playTool) && Intrinsics.areEqual(this.cardRender, cardUiData.cardRender);
    }

    @NotNull
    public final ICardRender getCardRender() {
        return this.cardRender;
    }

    @NotNull
    public final PlayTool getPlayTool() {
        return this.playTool;
    }

    public int hashCode() {
        return (this.playTool.hashCode() * 31) + this.cardRender.hashCode();
    }

    @NotNull
    public String toString() {
        return "CardUiData(playTool=" + this.playTool + ", cardRender=" + this.cardRender + ")";
    }
}

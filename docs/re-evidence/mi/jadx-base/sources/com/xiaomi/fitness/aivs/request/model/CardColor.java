package com.xiaomi.fitness.aivs.request.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003JO\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\r¨\u0006\""}, d2 = {"Lcom/xiaomi/fitness/aivs/request/model/CardColor;", "", "background_color", "", "bubble_color", "gradient_color", "pressed_color", "pressed_gradient_color", "query_color", "subtitle_color", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBackground_color", "()Ljava/lang/String;", "getBubble_color", "getGradient_color", "getPressed_color", "getPressed_gradient_color", "getQuery_color", "getSubtitle_color", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "aivs_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class CardColor {

    @NotNull
    private final String background_color;

    @NotNull
    private final String bubble_color;

    @NotNull
    private final String gradient_color;

    @NotNull
    private final String pressed_color;

    @NotNull
    private final String pressed_gradient_color;

    @NotNull
    private final String query_color;

    @NotNull
    private final String subtitle_color;

    public CardColor(@NotNull String background_color, @NotNull String bubble_color, @NotNull String gradient_color, @NotNull String pressed_color, @NotNull String pressed_gradient_color, @NotNull String query_color, @NotNull String subtitle_color) {
        Intrinsics.checkNotNullParameter(background_color, "background_color");
        Intrinsics.checkNotNullParameter(bubble_color, "bubble_color");
        Intrinsics.checkNotNullParameter(gradient_color, "gradient_color");
        Intrinsics.checkNotNullParameter(pressed_color, "pressed_color");
        Intrinsics.checkNotNullParameter(pressed_gradient_color, "pressed_gradient_color");
        Intrinsics.checkNotNullParameter(query_color, "query_color");
        Intrinsics.checkNotNullParameter(subtitle_color, "subtitle_color");
        this.background_color = background_color;
        this.bubble_color = bubble_color;
        this.gradient_color = gradient_color;
        this.pressed_color = pressed_color;
        this.pressed_gradient_color = pressed_gradient_color;
        this.query_color = query_color;
        this.subtitle_color = subtitle_color;
    }

    public static /* synthetic */ CardColor copy$default(CardColor cardColor, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, Object obj) {
        if ((i & 1) != 0) {
            str = cardColor.background_color;
        }
        if ((i & 2) != 0) {
            str2 = cardColor.bubble_color;
        }
        String str8 = str2;
        if ((i & 4) != 0) {
            str3 = cardColor.gradient_color;
        }
        String str9 = str3;
        if ((i & 8) != 0) {
            str4 = cardColor.pressed_color;
        }
        String str10 = str4;
        if ((i & 16) != 0) {
            str5 = cardColor.pressed_gradient_color;
        }
        String str11 = str5;
        if ((i & 32) != 0) {
            str6 = cardColor.query_color;
        }
        String str12 = str6;
        if ((i & 64) != 0) {
            str7 = cardColor.subtitle_color;
        }
        return cardColor.copy(str, str8, str9, str10, str11, str12, str7);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getBackground_color() {
        return this.background_color;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getBubble_color() {
        return this.bubble_color;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getGradient_color() {
        return this.gradient_color;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getPressed_color() {
        return this.pressed_color;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getPressed_gradient_color() {
        return this.pressed_gradient_color;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getQuery_color() {
        return this.query_color;
    }

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getSubtitle_color() {
        return this.subtitle_color;
    }

    @NotNull
    public final CardColor copy(@NotNull String background_color, @NotNull String bubble_color, @NotNull String gradient_color, @NotNull String pressed_color, @NotNull String pressed_gradient_color, @NotNull String query_color, @NotNull String subtitle_color) {
        Intrinsics.checkNotNullParameter(background_color, "background_color");
        Intrinsics.checkNotNullParameter(bubble_color, "bubble_color");
        Intrinsics.checkNotNullParameter(gradient_color, "gradient_color");
        Intrinsics.checkNotNullParameter(pressed_color, "pressed_color");
        Intrinsics.checkNotNullParameter(pressed_gradient_color, "pressed_gradient_color");
        Intrinsics.checkNotNullParameter(query_color, "query_color");
        Intrinsics.checkNotNullParameter(subtitle_color, "subtitle_color");
        return new CardColor(background_color, bubble_color, gradient_color, pressed_color, pressed_gradient_color, query_color, subtitle_color);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CardColor)) {
            return false;
        }
        CardColor cardColor = (CardColor) other;
        return Intrinsics.areEqual(this.background_color, cardColor.background_color) && Intrinsics.areEqual(this.bubble_color, cardColor.bubble_color) && Intrinsics.areEqual(this.gradient_color, cardColor.gradient_color) && Intrinsics.areEqual(this.pressed_color, cardColor.pressed_color) && Intrinsics.areEqual(this.pressed_gradient_color, cardColor.pressed_gradient_color) && Intrinsics.areEqual(this.query_color, cardColor.query_color) && Intrinsics.areEqual(this.subtitle_color, cardColor.subtitle_color);
    }

    @NotNull
    public final String getBackground_color() {
        return this.background_color;
    }

    @NotNull
    public final String getBubble_color() {
        return this.bubble_color;
    }

    @NotNull
    public final String getGradient_color() {
        return this.gradient_color;
    }

    @NotNull
    public final String getPressed_color() {
        return this.pressed_color;
    }

    @NotNull
    public final String getPressed_gradient_color() {
        return this.pressed_gradient_color;
    }

    @NotNull
    public final String getQuery_color() {
        return this.query_color;
    }

    @NotNull
    public final String getSubtitle_color() {
        return this.subtitle_color;
    }

    public int hashCode() {
        return (((((((((((this.background_color.hashCode() * 31) + this.bubble_color.hashCode()) * 31) + this.gradient_color.hashCode()) * 31) + this.pressed_color.hashCode()) * 31) + this.pressed_gradient_color.hashCode()) * 31) + this.query_color.hashCode()) * 31) + this.subtitle_color.hashCode();
    }

    @NotNull
    public String toString() {
        return "CardColor(background_color=" + this.background_color + ", bubble_color=" + this.bubble_color + ", gradient_color=" + this.gradient_color + ", pressed_color=" + this.pressed_color + ", pressed_gradient_color=" + this.pressed_gradient_color + ", query_color=" + this.query_color + ", subtitle_color=" + this.subtitle_color + ")";
    }
}

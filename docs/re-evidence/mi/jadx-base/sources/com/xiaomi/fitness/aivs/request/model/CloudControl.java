package com.xiaomi.fitness.aivs.request.model;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, d2 = {"Lcom/xiaomi/fitness/aivs/request/model/CloudControl;", "", "card_fade_time_ms", "", "card_position_refresh_time_ms", "show_layout", "with_double_quotation", "<init>", "(IIII)V", "getCard_fade_time_ms", "()I", "getCard_position_refresh_time_ms", "getShow_layout", "getWith_double_quotation", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "aivs_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class CloudControl {
    private final int card_fade_time_ms;
    private final int card_position_refresh_time_ms;
    private final int show_layout;
    private final int with_double_quotation;

    public CloudControl(int i, int i2, int i3, int i4) {
        this.card_fade_time_ms = i;
        this.card_position_refresh_time_ms = i2;
        this.show_layout = i3;
        this.with_double_quotation = i4;
    }

    public static /* synthetic */ CloudControl copy$default(CloudControl cloudControl, int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = cloudControl.card_fade_time_ms;
        }
        if ((i5 & 2) != 0) {
            i2 = cloudControl.card_position_refresh_time_ms;
        }
        if ((i5 & 4) != 0) {
            i3 = cloudControl.show_layout;
        }
        if ((i5 & 8) != 0) {
            i4 = cloudControl.with_double_quotation;
        }
        return cloudControl.copy(i, i2, i3, i4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getCard_fade_time_ms() {
        return this.card_fade_time_ms;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getCard_position_refresh_time_ms() {
        return this.card_position_refresh_time_ms;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getShow_layout() {
        return this.show_layout;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getWith_double_quotation() {
        return this.with_double_quotation;
    }

    @NotNull
    public final CloudControl copy(int card_fade_time_ms, int card_position_refresh_time_ms, int show_layout, int with_double_quotation) {
        return new CloudControl(card_fade_time_ms, card_position_refresh_time_ms, show_layout, with_double_quotation);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CloudControl)) {
            return false;
        }
        CloudControl cloudControl = (CloudControl) other;
        return this.card_fade_time_ms == cloudControl.card_fade_time_ms && this.card_position_refresh_time_ms == cloudControl.card_position_refresh_time_ms && this.show_layout == cloudControl.show_layout && this.with_double_quotation == cloudControl.with_double_quotation;
    }

    public final int getCard_fade_time_ms() {
        return this.card_fade_time_ms;
    }

    public final int getCard_position_refresh_time_ms() {
        return this.card_position_refresh_time_ms;
    }

    public final int getShow_layout() {
        return this.show_layout;
    }

    public final int getWith_double_quotation() {
        return this.with_double_quotation;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.card_fade_time_ms) * 31) + Integer.hashCode(this.card_position_refresh_time_ms)) * 31) + Integer.hashCode(this.show_layout)) * 31) + Integer.hashCode(this.with_double_quotation);
    }

    @NotNull
    public String toString() {
        return "CloudControl(card_fade_time_ms=" + this.card_fade_time_ms + ", card_position_refresh_time_ms=" + this.card_position_refresh_time_ms + ", show_layout=" + this.show_layout + ", with_double_quotation=" + this.with_double_quotation + ")";
    }
}

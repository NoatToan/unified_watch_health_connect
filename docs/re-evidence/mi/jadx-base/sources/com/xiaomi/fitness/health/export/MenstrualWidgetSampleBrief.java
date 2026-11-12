package com.xiaomi.fitness.health.export;

import com.miui.tsmclient.entity.CardUIInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/xiaomi/fitness/health/export/MenstrualWidgetSampleBrief;", "", "title", "", CardUIInfo.KEY_SUBTITILE, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getSubTitle", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "health-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class MenstrualWidgetSampleBrief {

    @Nullable
    private final String subTitle;

    @Nullable
    private final String title;

    public MenstrualWidgetSampleBrief(@Nullable String str, @Nullable String str2) {
        this.title = str;
        this.subTitle = str2;
    }

    public static /* synthetic */ MenstrualWidgetSampleBrief copy$default(MenstrualWidgetSampleBrief menstrualWidgetSampleBrief, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = menstrualWidgetSampleBrief.title;
        }
        if ((i & 2) != 0) {
            str2 = menstrualWidgetSampleBrief.subTitle;
        }
        return menstrualWidgetSampleBrief.copy(str, str2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSubTitle() {
        return this.subTitle;
    }

    @NotNull
    public final MenstrualWidgetSampleBrief copy(@Nullable String title, @Nullable String subTitle) {
        return new MenstrualWidgetSampleBrief(title, subTitle);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MenstrualWidgetSampleBrief)) {
            return false;
        }
        MenstrualWidgetSampleBrief menstrualWidgetSampleBrief = (MenstrualWidgetSampleBrief) other;
        return Intrinsics.areEqual(this.title, menstrualWidgetSampleBrief.title) && Intrinsics.areEqual(this.subTitle, menstrualWidgetSampleBrief.subTitle);
    }

    @Nullable
    public final String getSubTitle() {
        return this.subTitle;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.subTitle;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "MenstrualWidgetSampleBrief(title=" + this.title + ", subTitle=" + this.subTitle + ")";
    }
}

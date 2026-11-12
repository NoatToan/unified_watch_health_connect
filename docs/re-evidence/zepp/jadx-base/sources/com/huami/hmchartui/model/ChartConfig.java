package com.huami.hmchartui.model;

import androidx.annotation.ColorInt;
import androidx.core.internal.view.SupportMenu;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.facebook.share.model.ShareStoryContent;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.chart.util.ChartGradientColor;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u00012B\u0011\b\u0002\u0012\u0006\u0010/\u001a\u00020.¢\u0006\u0004\b0\u00101R\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\r\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0004\u001a\u0004\b\u000b\u0010\u0006\"\u0004\b\f\u0010\bR\"\u0010\u0011\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u0004\u001a\u0004\b\u000f\u0010\u0006\"\u0004\b\u0010\u0010\bR\"\u0010\u0015\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0004\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR\"\u0010\u001d\u001a\u00020\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\"\u0010!\u001a\u00020\u001e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R*\u0010-\u001a\n\u0012\u0004\u0012\u00020&\u0018\u00010%8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,¨\u00063"}, d2 = {"Lcom/huami/hmchartui/model/ChartConfig;", "", "", "a", LogUtil.I, "getBarColor", "()I", "setBarColor", "(I)V", "barColor", "b", "getLabelColor", "setLabelColor", "labelColor", "c", "getLineColor", "setLineColor", "lineColor", GoogleApiAvailabilityLight.a, "getEmptyTextColor", "setEmptyTextColor", "emptyTextColor", "", "e", "Ljava/lang/String;", "getEmptyText", "()Ljava/lang/String;", "setEmptyText", "(Ljava/lang/String;)V", "emptyText", "", "f", "Z", "isSupportRadian", "()Z", "setSupportRadian", "(Z)V", "", "Lcom/huami/chart/util/ChartGradientColor;", "g", "[Lcom/huami/chart/util/ChartGradientColor;", "getBarGradientColors", "()[Lcom/huami/chart/util/ChartGradientColor;", "setBarGradientColors", "([Lcom/huami/chart/util/ChartGradientColor;)V", "barGradientColors", "Lcom/huami/hmchartui/model/ChartConfig$Builder;", "builder", "<init>", "(Lcom/huami/hmchartui/model/ChartConfig$Builder;)V", ShareStoryContent.Builder.k, "hmchartui_release"}, k = 1, mv = {1, 5, 1})
public final class ChartConfig {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private int barColor;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private int labelColor;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private int lineColor;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private int emptyTextColor;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private String emptyText;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private boolean isSupportRadian;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    private ChartGradientColor[] barGradientColors;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b%\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b6\u00107J\u0010\u0010\u0004\u001a\u00020\u00002\b\b\u0001\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\u0005\u001a\u00020\u00002\b\b\u0001\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\u0006\u001a\u00020\u00002\b\b\u0001\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\u0007\u001a\u00020\u00002\b\b\u0001\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\n\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\bJ\u000e\u0010\r\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000bJ\u001b\u0010\u0011\u001a\u00020\u00002\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u0006\u0010\u0014\u001a\u00020\u0013R\"\u0010\u001a\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0004\u0010\u0019R\"\u0010\u001d\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u001c\u0010\u0018\"\u0004\b\u0005\u0010\u0019R\"\u0010 \u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u0016\u001a\u0004\b\u001f\u0010\u0018\"\u0004\b\u0006\u0010\u0019R\"\u0010#\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\u0016\u001a\u0004\b\"\u0010\u0018\"\u0004\b\u0007\u0010\u0019R\"\u0010)\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b\n\u0010(R\"\u0010,\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b\r\u0010.R*\u00105\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104¨\u00068"}, d2 = {"Lcom/huami/hmchartui/model/ChartConfig$Builder;", "", "", "color", "setBarColor", "setLabelColor", "setLineColor", "setEmptyTextColor", "", "text", "setEmptyText", "", "enable", "setSupportRadian", "", "Lcom/huami/chart/util/ChartGradientColor;", "colors", "setGradientColors", "([Lcom/huami/chart/util/ChartGradientColor;)Lcom/huami/hmchartui/model/ChartConfig$Builder;", "Lcom/huami/hmchartui/model/ChartConfig;", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "a", LogUtil.I, "getBarColor", "()I", "(I)V", "barColor", "b", "getLabelColor", "labelColor", "c", "getLineColor", "lineColor", GoogleApiAvailabilityLight.a, "getEmptyTextColor", "emptyTextColor", "e", "Ljava/lang/String;", "getEmptyText", "()Ljava/lang/String;", "(Ljava/lang/String;)V", "emptyText", "f", "Z", "isSupportRadian", "()Z", "(Z)V", "g", "[Lcom/huami/chart/util/ChartGradientColor;", "getBarGradientColors", "()[Lcom/huami/chart/util/ChartGradientColor;", "setBarGradientColors", "([Lcom/huami/chart/util/ChartGradientColor;)V", "barGradientColors", "<init>", "()V", "hmchartui_release"}, k = 1, mv = {1, 5, 1})
    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private int barColor = SupportMenu.CATEGORY_MASK;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private int labelColor = -3355444;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private int lineColor = -3355444;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private int emptyTextColor = -16777216;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @NotNull
        private String emptyText = "";

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private boolean isSupportRadian = true;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        @Nullable
        private ChartGradientColor[] barGradientColors;

        @NotNull
        public final ChartConfig build() {
            return new ChartConfig(this, null);
        }

        public final int getBarColor() {
            return this.barColor;
        }

        @Nullable
        public final ChartGradientColor[] getBarGradientColors() {
            return this.barGradientColors;
        }

        @NotNull
        public final String getEmptyText() {
            return this.emptyText;
        }

        public final int getEmptyTextColor() {
            return this.emptyTextColor;
        }

        public final int getLabelColor() {
            return this.labelColor;
        }

        public final int getLineColor() {
            return this.lineColor;
        }

        /* JADX INFO: renamed from: isSupportRadian, reason: from getter */
        public final boolean getIsSupportRadian() {
            return this.isSupportRadian;
        }

        /* JADX INFO: renamed from: setBarColor, reason: collision with other method in class */
        public final void m3362setBarColor(int i) {
            this.barColor = i;
        }

        public final void setBarGradientColors(@Nullable ChartGradientColor[] chartGradientColorArr) {
            this.barGradientColors = chartGradientColorArr;
        }

        /* JADX INFO: renamed from: setEmptyText, reason: collision with other method in class */
        public final void m3363setEmptyText(@NotNull String str) {
            this.emptyText = str;
        }

        /* JADX INFO: renamed from: setEmptyTextColor, reason: collision with other method in class */
        public final void m3364setEmptyTextColor(int i) {
            this.emptyTextColor = i;
        }

        @NotNull
        public final Builder setGradientColors(@NotNull ChartGradientColor[] colors) {
            this.barGradientColors = colors;
            return this;
        }

        /* JADX INFO: renamed from: setLabelColor, reason: collision with other method in class */
        public final void m3365setLabelColor(int i) {
            this.labelColor = i;
        }

        /* JADX INFO: renamed from: setLineColor, reason: collision with other method in class */
        public final void m3366setLineColor(int i) {
            this.lineColor = i;
        }

        /* JADX INFO: renamed from: setSupportRadian, reason: collision with other method in class */
        public final void m3367setSupportRadian(boolean z) {
            this.isSupportRadian = z;
        }

        @NotNull
        public final Builder setBarColor(@ColorInt int color) {
            this.barColor = color;
            return this;
        }

        @NotNull
        public final Builder setEmptyText(@NotNull String text) {
            this.emptyText = text;
            return this;
        }

        @NotNull
        public final Builder setEmptyTextColor(@ColorInt int color) {
            this.emptyTextColor = color;
            return this;
        }

        @NotNull
        public final Builder setLabelColor(@ColorInt int color) {
            this.labelColor = color;
            return this;
        }

        @NotNull
        public final Builder setLineColor(@ColorInt int color) {
            this.lineColor = color;
            return this;
        }

        @NotNull
        public final Builder setSupportRadian(boolean enable) {
            this.isSupportRadian = enable;
            return this;
        }
    }

    private ChartConfig(Builder builder) {
        this.emptyText = "";
        this.isSupportRadian = true;
        this.barColor = builder.getBarColor();
        this.labelColor = builder.getLabelColor();
        this.lineColor = builder.getLineColor();
        this.emptyTextColor = builder.getEmptyTextColor();
        this.emptyText = builder.getEmptyText();
        this.isSupportRadian = builder.getIsSupportRadian();
        this.barGradientColors = builder.getBarGradientColors();
    }

    public /* synthetic */ ChartConfig(Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
        this(builder);
    }

    public final int getBarColor() {
        return this.barColor;
    }

    @Nullable
    public final ChartGradientColor[] getBarGradientColors() {
        return this.barGradientColors;
    }

    @NotNull
    public final String getEmptyText() {
        return this.emptyText;
    }

    public final int getEmptyTextColor() {
        return this.emptyTextColor;
    }

    public final int getLabelColor() {
        return this.labelColor;
    }

    public final int getLineColor() {
        return this.lineColor;
    }

    /* JADX INFO: renamed from: isSupportRadian, reason: from getter */
    public final boolean getIsSupportRadian() {
        return this.isSupportRadian;
    }

    public final void setBarColor(int i) {
        this.barColor = i;
    }

    public final void setBarGradientColors(@Nullable ChartGradientColor[] chartGradientColorArr) {
        this.barGradientColors = chartGradientColorArr;
    }

    public final void setEmptyText(@NotNull String str) {
        this.emptyText = str;
    }

    public final void setEmptyTextColor(int i) {
        this.emptyTextColor = i;
    }

    public final void setLabelColor(int i) {
        this.labelColor = i;
    }

    public final void setLineColor(int i) {
        this.lineColor = i;
    }

    public final void setSupportRadian(boolean z) {
        this.isSupportRadian = z;
    }
}

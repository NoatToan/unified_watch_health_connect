package com.huami.chart.helper;

import android.content.Context;
import com.huami.chart.R;
import com.huami.chart.provider.RenderConfig;
import com.huami.chart.style.BarStyle;
import com.huami.tools.analytics.DbUtils;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aY\u0010\u000e\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00032\u001b\b\u0002\u0010\r\u001a\u0015\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t¢\u0006\u0002\b\fH\u0007¨\u0006\u000f"}, d2 = {"Lcom/huami/chart/provider/RenderConfig$Builder;", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "barInteractiveLineType", "barStyle", "", "minHeight", "priority", "Lkotlin/Function1;", "Lcom/huami/chart/style/BarStyle$Builder;", "", "Lkotlin/ExtensionFunctionType;", "addStyle", "unifiedBarConfig", "chart_release"}, k = 2, mv = {1, 5, 1})
public final class UnifiedChartKt {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lcom/huami/chart/style/BarStyle$Builder;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<BarStyle.Builder, Unit> {
        public final /* synthetic */ int a;
        public final /* synthetic */ Context b;
        public final /* synthetic */ Function1<BarStyle.Builder, Unit> c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(int i, Context context, Function1<? super BarStyle.Builder, Unit> function1) {
            super(1);
            this.a = i;
            this.b = context;
            this.c = function1;
        }

        public final void a(@NotNull BarStyle.Builder builder) {
            int i = this.a;
            if (i == 4) {
                builder.setInteractiveType(i);
                builder.setInteractiveUpCancel(false);
                builder.setInteractiveSlide(true);
                builder.setHighlightBorderColor(HMChartHelperKt.getResColor$default(this.b, R.color.s38, 0.0f, 4, null));
                builder.setInteractiveLineColor(HMChartHelperKt.getResColor$default(this.b, R.color.s3, 0.0f, 4, null));
                builder.setHighlightBorderStrokeWidth(HMChartHelperKt.getDpToPx(2.0f));
            }
            Function1<BarStyle.Builder, Unit> function1 = this.c;
            if (function1 == null) {
                return;
            }
            function1.invoke(builder);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(BarStyle.Builder builder) {
            a(builder);
            return Unit.INSTANCE;
        }
    }

    @JvmOverloads
    @NotNull
    public static final RenderConfig.Builder unifiedBarConfig(@NotNull RenderConfig.Builder builder, @NotNull Context context) {
        return unifiedBarConfig$default(builder, context, 0, 0, 0.0f, 0, null, 62, null);
    }

    @JvmOverloads
    @NotNull
    public static final RenderConfig.Builder unifiedBarConfig(@NotNull RenderConfig.Builder builder, @NotNull Context context, int i) {
        return unifiedBarConfig$default(builder, context, i, 0, 0.0f, 0, null, 60, null);
    }

    @JvmOverloads
    @NotNull
    public static final RenderConfig.Builder unifiedBarConfig(@NotNull RenderConfig.Builder builder, @NotNull Context context, int i, int i2) {
        return unifiedBarConfig$default(builder, context, i, i2, 0.0f, 0, null, 56, null);
    }

    @JvmOverloads
    @NotNull
    public static final RenderConfig.Builder unifiedBarConfig(@NotNull RenderConfig.Builder builder, @NotNull Context context, int i, int i2, float f) {
        return unifiedBarConfig$default(builder, context, i, i2, f, 0, null, 48, null);
    }

    @JvmOverloads
    @NotNull
    public static final RenderConfig.Builder unifiedBarConfig(@NotNull RenderConfig.Builder builder, @NotNull Context context, int i, int i2, float f, int i3) {
        return unifiedBarConfig$default(builder, context, i, i2, f, i3, null, 32, null);
    }

    @JvmOverloads
    @NotNull
    public static final RenderConfig.Builder unifiedBarConfig(@NotNull RenderConfig.Builder builder, @NotNull Context context, int i, int i2, float f, int i3, @Nullable Function1<? super BarStyle.Builder, Unit> function1) {
        return ChartBuildKt.barConfig(builder, context, i2, f, i3, new a(i, context, function1));
    }

    public static /* synthetic */ RenderConfig.Builder unifiedBarConfig$default(RenderConfig.Builder builder, Context context, int i, int i2, float f, int i3, Function1 function1, int i4, Object obj) {
        int i5 = (i4 & 2) != 0 ? 4 : i;
        int i6 = (i4 & 4) != 0 ? 8 : i2;
        if ((i4 & 8) != 0) {
            f = HMChartHelperKt.getDpToPx(3.0f);
        }
        float f2 = f;
        int i7 = (i4 & 16) != 0 ? 102 : i3;
        if ((i4 & 32) != 0) {
            function1 = null;
        }
        return unifiedBarConfig(builder, context, i5, i6, f2, i7, function1);
    }
}

package com.xiaomi.fitness.health.sleep.interfere.report.charts;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.miui.circulate.device.api.Column;
import defpackage.eri;
import defpackage.jui;
import defpackage.pah;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0016J\u0016\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0016J\b\u0010\u0019\u001a\u00020\u0014H\u0002R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/xiaomi/fitness/health/sleep/interfere/report/charts/SleepInterfereReportChartInfo2ColumnView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "startTitle", "Landroid/widget/TextView;", "startSubtitle", "endTitle", "endSubtitle", "divideLine", "Landroid/view/View;", "startTextLayout", "endTextLayout", "setStartInfo", "", "title", "", Column.SUBTITLE, "setEndInfo", "updateDividerHeight", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSleepInterfereReportChartInfo2ColumnView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SleepInterfereReportChartInfo2ColumnView.kt\ncom/xiaomi/fitness/health/sleep/interfere/report/charts/SleepInterfereReportChartInfo2ColumnView\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,63:1\n81#2:64\n*S KotlinDebug\n*F\n+ 1 SleepInterfereReportChartInfo2ColumnView.kt\ncom/xiaomi/fitness/health/sleep/interfere/report/charts/SleepInterfereReportChartInfo2ColumnView\n*L\n39#1:64\n*E\n"})
public final class SleepInterfereReportChartInfo2ColumnView extends LinearLayout {

    @NotNull
    private final View divideLine;

    @NotNull
    private final TextView endSubtitle;

    @NotNull
    private final View endTextLayout;

    @NotNull
    private final TextView endTitle;

    @NotNull
    private final TextView startSubtitle;

    @NotNull
    private final View startTextLayout;

    @NotNull
    private final TextView startTitle;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SleepInterfereReportChartInfo2ColumnView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateDividerHeight() {
        int iMax = Math.max(this.startTextLayout.getHeight(), this.endTextLayout.getHeight());
        ViewGroup.LayoutParams layoutParams = this.divideLine.getLayoutParams();
        layoutParams.height = iMax;
        this.divideLine.setLayoutParams(layoutParams);
    }

    public final void setEndInfo(@NotNull String title, @NotNull String subtitle) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        this.endTitle.setText(title);
        this.endSubtitle.setText(subtitle);
    }

    public final void setStartInfo(@NotNull String title, @NotNull String subtitle) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        this.startTitle.setText(title);
        this.startSubtitle.setText(subtitle);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SleepInterfereReportChartInfo2ColumnView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ SleepInterfereReportChartInfo2ColumnView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SleepInterfereReportChartInfo2ColumnView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        setOrientation(1);
        LayoutInflater.from(context).inflate(jui.Q8, (ViewGroup) this, true);
        this.startTitle = (TextView) findViewById(eri.kh);
        this.startSubtitle = (TextView) findViewById(eri.ih);
        this.endTitle = (TextView) findViewById(eri.H4);
        this.endSubtitle = (TextView) findViewById(eri.F4);
        this.divideLine = findViewById(eri.X3);
        this.startTextLayout = findViewById(eri.jh);
        this.endTextLayout = findViewById(eri.G4);
        pah.a(this, new Runnable() { // from class: com.xiaomi.fitness.health.sleep.interfere.report.charts.SleepInterfereReportChartInfo2ColumnView$special$$inlined$doOnPreDraw$1
            @Override // java.lang.Runnable
            public final void run() {
                this.updateDividerHeight();
            }
        });
    }
}

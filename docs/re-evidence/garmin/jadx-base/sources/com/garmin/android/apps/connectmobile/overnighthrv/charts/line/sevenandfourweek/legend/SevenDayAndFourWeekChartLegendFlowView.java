package com.garmin.android.apps.connectmobile.overnighthrv.charts.line.sevenandfourweek.legend;

import android.content.Context;
import android.util.AttributeSet;
import ch.qos.logback.core.CoreConstants;
import com.google.android.flexbox.FlexboxLayout;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/garmin/android/apps/connectmobile/overnighthrv/charts/line/sevenandfourweek/legend/SevenDayAndFourWeekChartLegendFlowView;", "Lcom/google/android/flexbox/FlexboxLayout;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "gcm-domain-wellness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class SevenDayAndFourWeekChartLegendFlowView extends FlexboxLayout {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SevenDayAndFourWeekChartLegendFlowView(Context context, AttributeSet attributeSet, int i14) {
        super(context, attributeSet, i14);
        context.getClass();
        setFlexDirection(0);
        setJustifyContent(2);
        setAlignItems(2);
        setAlignContent(2);
        setFlexWrap(1);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SevenDayAndFourWeekChartLegendFlowView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SevenDayAndFourWeekChartLegendFlowView(Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }

    public /* synthetic */ SevenDayAndFourWeekChartLegendFlowView(Context context, AttributeSet attributeSet, int i14, int i15, j jVar) {
        this(context, (i15 & 2) != 0 ? null : attributeSet, (i15 & 4) != 0 ? 0 : i14);
    }
}

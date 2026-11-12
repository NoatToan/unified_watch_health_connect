package com.garmin.android.apps.connectmobile.charts.mpchart3.wrapper;

import android.content.Context;
import android.util.AttributeSet;
import ch.qos.logback.core.CoreConstants;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\nB)\b\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/charts/mpchart3/wrapper/HorseshoePieChart;", "Lcom/garmin/android/apps/connectmobile/charts/mpchart3/wrapper/CustomPieChart;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "a", "gcm-charts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class HorseshoePieChart extends CustomPieChart {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f31354c = 0;

    static {
        new a(null);
    }

    public HorseshoePieChart(Context context, AttributeSet attributeSet, int i14) {
        super(context, attributeSet, i14);
        setMaxAngle(304.0f);
        setDrawRoundedSlices(true);
        setRotationAngle(118.0f);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/charts/mpchart3/wrapper/HorseshoePieChart$a;", "", "<init>", "()V", "", "MAX_ANGLE", "F", "gcm-charts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }

    public HorseshoePieChart(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public HorseshoePieChart(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ HorseshoePieChart(Context context, AttributeSet attributeSet, int i14, int i15, j jVar) {
        this(context, (i15 & 2) != 0 ? null : attributeSet, (i15 & 4) != 0 ? 0 : i14);
    }
}

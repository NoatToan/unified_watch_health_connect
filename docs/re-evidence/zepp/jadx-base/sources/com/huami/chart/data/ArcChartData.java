package com.huami.chart.data;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\f\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0018\u001a\u00020\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u0014\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u000f¢\u0006\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\n\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0019\u0010\u0014\u001a\u00020\u000f8\u0006@\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0017\u001a\u00020\u000f8\u0006@\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0011\u001a\u0004\b\u0016\u0010\u0013¨\u0006\u001b"}, d2 = {"Lcom/huami/chart/data/ArcChartData;", "Lcom/huami/chart/data/BaseData;", "", "c", "F", "getStartAngle", "()F", "startAngle", GoogleApiAvailabilityLight.a, "getEndAngle", "endAngle", "", "e", "Ljava/lang/String;", "label", "", "f", LogUtil.I, "getStartColor", "()I", "startColor", "g", "getEndColor", "endColor", "index", "<init>", "(IFFLjava/lang/String;II)V", "chart_release"}, k = 1, mv = {1, 5, 1})
public final class ArcChartData extends BaseData {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final float startAngle;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final float endAngle;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    private final String label;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final int startColor;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final int endColor;

    public /* synthetic */ ArcChartData(int i, float f, float f2, String str, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, f, f2, (i4 & 8) != 0 ? null : str, i2, (i4 & 32) != 0 ? i2 : i3);
    }

    public final float getEndAngle() {
        return this.endAngle;
    }

    public final int getEndColor() {
        return this.endColor;
    }

    public final float getStartAngle() {
        return this.startAngle;
    }

    public final int getStartColor() {
        return this.startColor;
    }

    public ArcChartData(int i, float f, float f2, @Nullable String str, int i2, int i3) {
        super(new BaseIndex(i));
        this.startAngle = f;
        this.endAngle = f2;
        this.label = str;
        this.startColor = i2;
        this.endColor = i3;
    }
}

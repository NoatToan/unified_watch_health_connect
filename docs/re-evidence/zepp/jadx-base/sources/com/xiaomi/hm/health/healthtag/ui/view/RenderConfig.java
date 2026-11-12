package com.xiaomi.hm.health.healthtag.ui.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import androidx.core.content.ContextCompat;
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.exoplayer2.text.ttml.b;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.lib.view.ViewUtils;
import com.huami.sleep.ext.ViewExKt;
import com.huami.tools.analytics.DbUtils;
import com.huami.watch.hmwatchmanager.R;
import com.loc.z;
import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u0007\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 M2\u00020\u0001:\u0001MB\u000f\u0012\u0006\u0010J\u001a\u00020I¢\u0006\u0004\bK\u0010LR\u0016\u0010\u0005\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\t\u001a\u00020\u00068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\"\u0010\u000f\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\b\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\"\u0010\u0017\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0019\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0012R*\u0010\u001e\u001a\n \u001a*\u0004\u0018\u00010\u00100\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u0012\u001a\u0004\b\u001c\u0010\u0014\"\u0004\b\u001d\u0010\u0016R*\u0010\"\u001a\n \u001a*\u0004\u0018\u00010\u00100\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\u0012\u001a\u0004\b \u0010\u0014\"\u0004\b!\u0010\u0016R\"\u0010&\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010\b\u001a\u0004\b$\u0010\f\"\u0004\b%\u0010\u000eR\"\u0010*\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010\b\u001a\u0004\b(\u0010\f\"\u0004\b)\u0010\u000eR\"\u00102\u001a\u00020+8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\"\u00106\u001a\u00020+8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b3\u0010-\u001a\u0004\b4\u0010/\"\u0004\b5\u00101R\"\u0010:\u001a\u00020+8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b7\u0010-\u001a\u0004\b8\u0010/\"\u0004\b9\u00101R\"\u0010>\u001a\u00020+8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b;\u0010-\u001a\u0004\b<\u0010/\"\u0004\b=\u00101R\"\u0010B\u001a\u00020+8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b?\u0010-\u001a\u0004\b@\u0010/\"\u0004\bA\u00101R\u0019\u0010E\u001a\u00020+8\u0006@\u0006¢\u0006\f\n\u0004\bC\u0010-\u001a\u0004\bD\u0010/R\u0019\u0010H\u001a\u00020+8\u0006@\u0006¢\u0006\f\n\u0004\bF\u0010-\u001a\u0004\bG\u0010/¨\u0006N"}, d2 = {"Lcom/xiaomi/hm/health/healthtag/ui/view/RenderConfig;", "", "Landroid/graphics/Matrix;", "a", "Landroid/graphics/Matrix;", "rotateMatrix", "", "b", LogUtil.I, "circleBitmapSize", "c", "getMMaxTagNum", "()I", "setMMaxTagNum", "(I)V", "mMaxTagNum", "Landroid/graphics/Bitmap;", GoogleApiAvailabilityLight.a, "Landroid/graphics/Bitmap;", "getMBitmap", "()Landroid/graphics/Bitmap;", "setMBitmap", "(Landroid/graphics/Bitmap;)V", "mBitmap", "e", "mBottomBitmap", "kotlin.jvm.PlatformType", "f", "getRbBitmap", "setRbBitmap", "rbBitmap", "g", "getLbBitmap", "setLbBitmap", "lbBitmap", "h", "getMColor", "setMColor", "mColor", "i", "getMTagTextColor", "setMTagTextColor", "mTagTextColor", "", z.j, "F", "getMTagTextSize", "()F", "setMTagTextSize", "(F)V", "mTagTextSize", hl.k, "getMTagBgHeight", "setMTagBgHeight", "mTagBgHeight", "l", "getMTagBgWithBarDis", "setMTagBgWithBarDis", "mTagBgWithBarDis", "m", "getMTagRLPadding", "setMTagRLPadding", "mTagRLPadding", GoogleApiAvailabilityLight.b, "getMBarHeight", "setMBarHeight", "mBarHeight", "o", "getChartRightPadding", "chartRightPadding", b.r, "getChartLeftPadding", "chartLeftPadding", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "<init>", "(Landroid/content/Context;)V", "Companion", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class RenderConfig {
    private static final double q = 0.39d;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Matrix rotateMatrix;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int circleBitmapSize;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private int mMaxTagNum;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private Bitmap mBitmap;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private Bitmap mBottomBitmap;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private Bitmap rbBitmap;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private Bitmap lbBitmap;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private int mColor;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private int mTagTextColor;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private float mTagTextSize;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private float mTagBgHeight;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private float mTagBgWithBarDis;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private float mTagRLPadding;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private float mBarHeight;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private final float chartRightPadding;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private final float chartLeftPadding;

    public RenderConfig(@NotNull Context context) {
        Matrix matrix = new Matrix();
        this.rotateMatrix = matrix;
        int iDp2px = (int) ViewUtils.dp2px(context, 9.0f);
        this.circleBitmapSize = iDp2px;
        this.mMaxTagNum = 4;
        this.mBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.sleep_tag_bg);
        Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(context.getResources(), R.drawable.slp_icon_drag);
        this.mBottomBitmap = bitmapDecodeResource;
        matrix.setRotate(180.0f);
        Unit unit = Unit.INSTANCE;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapDecodeResource, 0, 0, iDp2px, iDp2px, matrix, true);
        this.rbBitmap = bitmapCreateBitmap;
        matrix.setRotate(90.0f);
        this.lbBitmap = Bitmap.createBitmap(bitmapCreateBitmap, 0, 0, iDp2px, iDp2px, matrix, true);
        this.mColor = ViewExKt.addAlpha(ContextCompat.getColor(context, R.color.p3), q);
        this.mTagTextColor = ContextCompat.getColor(context, R.color.white);
        this.mTagTextSize = context.getResources().getDimension(R.dimen.slp_size_11sp);
        this.mTagBgHeight = ViewUtils.dp2px(context, 20.0f);
        this.mTagBgWithBarDis = ViewUtils.dp2px(context, 2.0f);
        this.mTagRLPadding = ViewUtils.dp2px(context, 4.0f);
        this.mBarHeight = ViewUtils.dp2px(context, 4.0f);
        this.chartRightPadding = ViewUtils.dp2px(context, 30.0f);
        this.chartLeftPadding = ViewUtils.dp2px(context, 30.0f);
    }

    public final float getChartLeftPadding() {
        return this.chartLeftPadding;
    }

    public final float getChartRightPadding() {
        return this.chartRightPadding;
    }

    public final Bitmap getLbBitmap() {
        return this.lbBitmap;
    }

    public final float getMBarHeight() {
        return this.mBarHeight;
    }

    @NotNull
    public final Bitmap getMBitmap() {
        return this.mBitmap;
    }

    public final int getMColor() {
        return this.mColor;
    }

    public final int getMMaxTagNum() {
        return this.mMaxTagNum;
    }

    public final float getMTagBgHeight() {
        return this.mTagBgHeight;
    }

    public final float getMTagBgWithBarDis() {
        return this.mTagBgWithBarDis;
    }

    public final float getMTagRLPadding() {
        return this.mTagRLPadding;
    }

    public final int getMTagTextColor() {
        return this.mTagTextColor;
    }

    public final float getMTagTextSize() {
        return this.mTagTextSize;
    }

    public final Bitmap getRbBitmap() {
        return this.rbBitmap;
    }

    public final void setLbBitmap(Bitmap bitmap) {
        this.lbBitmap = bitmap;
    }

    public final void setMBarHeight(float f) {
        this.mBarHeight = f;
    }

    public final void setMBitmap(@NotNull Bitmap bitmap) {
        this.mBitmap = bitmap;
    }

    public final void setMColor(int i) {
        this.mColor = i;
    }

    public final void setMMaxTagNum(int i) {
        this.mMaxTagNum = i;
    }

    public final void setMTagBgHeight(float f) {
        this.mTagBgHeight = f;
    }

    public final void setMTagBgWithBarDis(float f) {
        this.mTagBgWithBarDis = f;
    }

    public final void setMTagRLPadding(float f) {
        this.mTagRLPadding = f;
    }

    public final void setMTagTextColor(int i) {
        this.mTagTextColor = i;
    }

    public final void setMTagTextSize(float f) {
        this.mTagTextSize = f;
    }

    public final void setRbBitmap(Bitmap bitmap) {
        this.rbBitmap = bitmap;
    }
}

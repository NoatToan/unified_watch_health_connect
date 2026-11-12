package com.huami.pai.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import androidx.viewpager.widget.ViewPager;
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.exoplayer2.text.ttml.b;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.maps.android.kml.KmlPoint;
import com.huami.pai.lib.R;
import com.huami.tools.analytics.DbUtils;
import com.loc.z;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Unit;
import org.cybergarage.soap.SOAP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b'\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001:\u0004_`abB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\\\u001a\u00020\u0004¢\u0006\u0004\b]\u0010^J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\b\u001a\u00020\u0006H\u0002J\u0010\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0002J\u0010\u0010\f\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0002J\b\u0010\r\u001a\u00020\u0006H\u0002J\u0010\u0010\u000e\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0014J\u001e\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013J\u000e\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0011J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0018\u001a\u00020\u0011J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u001a\u001a\u00020\u000fJ\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u001c\u001a\u00020\u000fJ\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u001e\u001a\u00020\u0011J\u0010\u0010\"\u001a\u0004\u0018\u00010\u00002\u0006\u0010!\u001a\u00020 J\u0018\u0010\"\u001a\u0004\u0018\u00010\u00002\u0006\u0010#\u001a\u00020 2\u0006\u0010$\u001a\u00020\u0011J\u0018\u0010\"\u001a\u0004\u0018\u00010\u00002\u0006\u0010!\u001a\u00020 2\u0006\u0010%\u001a\u00020\u0013J\u001e\u0010\"\u001a\u00020\u00002\u0006\u0010#\u001a\u00020 2\u0006\u0010$\u001a\u00020\u00112\u0006\u0010%\u001a\u00020\u0013R\u0016\u0010(\u001a\u00020&8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\r\u0010'R\u0016\u0010+\u001a\u00020)8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\f\u0010*R\u0016\u0010,\u001a\u00020)8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000b\u0010*R\u0016\u0010.\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010-R\u0016\u00100\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010/R\u0016\u00102\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u0010/R\u0016\u00104\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u0010/R\u0016\u00106\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u0010/R\u0016\u00108\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u0010/R\u0016\u0010:\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010-R\u0016\u0010<\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010-R\u0016\u0010>\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010-R\u0016\u0010\u001e\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010-R\u0016\u0010A\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010/R\u0016\u0010C\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010-R\u0016\u0010E\u001a\u00020\u000f8\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\bD\u0010/R\u0016\u0010G\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010/R\u0016\u0010J\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010IR\u0016\u0010L\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010IR\u0016\u0010N\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010IR\u0016\u0010P\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010/R\u001e\u0010U\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010R0Q8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010TR\u001e\u0010W\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010R0Q8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bV\u0010TR\u0016\u0010[\u001a\u00020X8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010Z¨\u0006c"}, d2 = {"Lcom/huami/pai/view/PaiViewPagerIndicator;", "Landroid/view/View;", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Landroid/util/AttributeSet;", "attrs", "", "e", GoogleApiAvailabilityLight.a, "Landroid/graphics/Canvas;", "canvas", "c", "b", "a", "onDraw", "", "percent", "", "position", "", "isLeft", "move", "num", "setNum", "indicatorType", "setType", "radius", "setRadius", "distance", "setDistance", "mDistanceType", "setDistanceType", "Landroidx/viewpager/widget/ViewPager;", "viewPager", "setViewPager", "viewpager", "CycleNumber", "isInfiniteCircle", "Landroid/graphics/Path;", "Landroid/graphics/Path;", "mPath", "Landroid/graphics/Paint;", "Landroid/graphics/Paint;", "paintFill", "paintStroke", LogUtil.I, "mNum", "F", "mRadius", "f", "mRadiusSelected", "g", "mLength", "h", "mHeight", "i", "mOffset", z.j, "mSelected_color", hl.k, "mDefault_color", "l", "mIndicatorType", "m", GoogleApiAvailabilityLight.b, "mDistance", "o", "mPosition", b.r, "M", DTransferConstants.SEARCH_KEY, "mPercent", "r", "Z", "mIsLeft", SOAP.XMLNS, "mIsInfiniteCircle", "t", "mAnimation", "u", "mUnSelectedLength", "", "Lcom/huami/pai/view/PaiViewPagerIndicator$Point;", "v", "[Lcom/huami/pai/view/PaiViewPagerIndicator$Point;", "mSpringPoint", "w", "mControlPoint", "Lcom/huami/pai/view/PaiViewPagerIndicator$CenterPoint;", "x", "Lcom/huami/pai/view/PaiViewPagerIndicator$CenterPoint;", "mCenterPoint", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "CenterPoint", "DistanceType", "IndicatorType", KmlPoint.GEOMETRY_TYPE, "lib_release"}, k = 1, mv = {1, 5, 1})
public final class PaiViewPagerIndicator extends View {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private Path mPath;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private Paint paintFill;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private Paint paintStroke;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private int mNum;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private float mRadius;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private float mRadiusSelected;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private float mLength;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private float mHeight;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private float mOffset;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private int mSelected_color;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private int mDefault_color;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private int mIndicatorType;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private int mDistanceType;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private float mDistance;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private int mPosition;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private final float M;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private float mPercent;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private boolean mIsLeft;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private boolean mIsInfiniteCircle;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    private boolean mAnimation;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    private float mUnSelectedLength;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    @NotNull
    private Point[] mSpringPoint;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    @NotNull
    private Point[] mControlPoint;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    @NotNull
    private final CenterPoint mCenterPoint;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u000e\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000e\u0010\u000fR\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\r\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0004\u001a\u0004\b\u000b\u0010\u0006\"\u0004\b\f\u0010\b¨\u0006\u0010"}, d2 = {"Lcom/huami/pai/view/PaiViewPagerIndicator$CenterPoint;", "", "", "a", "F", "getX", "()F", "setX", "(F)V", "x", "b", "getY", "setY", "y", "<init>", "()V", "lib_release"}, k = 1, mv = {1, 5, 1})
    public static final class CenterPoint {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private float x;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private float y;

        public final float getX() {
            return this.x;
        }

        public final float getY() {
            return this.y;
        }

        public final void setX(float f) {
            this.x = f;
        }

        public final void setY(float f) {
            this.y = f;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/huami/pai/view/PaiViewPagerIndicator$DistanceType;", "", "Companion", "lib_release"}, k = 1, mv = {1, 5, 1})
    public interface DistanceType {
        public static final int BY_DISTANCE = 1;
        public static final int BY_LAYOUT = 2;
        public static final int BY_RADIUS = 0;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = Companion.a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004¨\u0006\t"}, d2 = {"Lcom/huami/pai/view/PaiViewPagerIndicator$DistanceType$Companion;", "", "", "BY_RADIUS", LogUtil.I, "BY_DISTANCE", "BY_LAYOUT", "<init>", "()V", "lib_release"}, k = 1, mv = {1, 5, 1})
        public static final class Companion {
            public static final int BY_DISTANCE = 1;
            public static final int BY_LAYOUT = 2;
            public static final int BY_RADIUS = 0;
            public static final /* synthetic */ Companion a = new Companion();

            private Companion() {
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/huami/pai/view/PaiViewPagerIndicator$IndicatorType;", "", "Companion", "lib_release"}, k = 1, mv = {1, 5, 1})
    public interface IndicatorType {
        public static final int BEZIER = 3;
        public static final int CIRCLE = 1;
        public static final int CIRCLE_LINE = 2;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = Companion.a;
        public static final int LINE = 0;
        public static final int PROGRESS = 5;
        public static final int SPRING = 4;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0016\u0010\u0007\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0016\u0010\b\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0016\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0004¨\u0006\f"}, d2 = {"Lcom/huami/pai/view/PaiViewPagerIndicator$IndicatorType$Companion;", "", "", "LINE", LogUtil.I, "CIRCLE", "CIRCLE_LINE", "BEZIER", "SPRING", "PROGRESS", "<init>", "()V", "lib_release"}, k = 1, mv = {1, 5, 1})
        public static final class Companion {
            public static final int BEZIER = 3;
            public static final int CIRCLE = 1;
            public static final int CIRCLE_LINE = 2;
            public static final int LINE = 0;
            public static final int PROGRESS = 5;
            public static final int SPRING = 4;
            public static final /* synthetic */ Companion a = new Companion();

            private Companion() {
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u000e\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000e\u0010\u000fR\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\r\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0004\u001a\u0004\b\u000b\u0010\u0006\"\u0004\b\f\u0010\b¨\u0006\u0010"}, d2 = {"Lcom/huami/pai/view/PaiViewPagerIndicator$Point;", "", "", "a", "F", "getX", "()F", "setX", "(F)V", "x", "b", "getY", "setY", "y", "<init>", "()V", "lib_release"}, k = 1, mv = {1, 5, 1})
    public static final class Point {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private float x;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private float y;

        public final float getX() {
            return this.x;
        }

        public final float getY() {
            return this.y;
        }

        public final void setX(float f) {
            this.x = f;
        }

        public final void setY(float f) {
            this.y = f;
        }
    }

    public PaiViewPagerIndicator(@NotNull Context context, @NotNull AttributeSet attributeSet) {
        super(context, attributeSet);
        this.M = 0.55191505f;
        e(context, attributeSet);
        d();
        this.mSpringPoint = new Point[6];
        this.mControlPoint = new Point[9];
        this.mCenterPoint = new CenterPoint();
    }

    private final void a() {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        this.mCenterPoint.setY(0.0f);
        float f6 = this.M;
        this.mControlPoint[2].setY(this.mRadius);
        this.mControlPoint[8].setY(-this.mRadius);
        int i = this.mPosition;
        int i2 = this.mNum;
        if (i == i2 - 1 && !this.mIsLeft) {
            float f7 = this.mPercent;
            if (f7 <= 0.2d) {
                CenterPoint centerPoint = this.mCenterPoint;
                float f8 = this.mDistance;
                centerPoint.setX(((-(i2 - 1)) * 0.5f * f8) + ((i2 - 1) * f8));
            } else if (f7 <= 0.8d) {
                CenterPoint centerPoint2 = this.mCenterPoint;
                float f9 = this.mDistance;
                centerPoint2.setX(((-(i2 - 1)) * 0.5f * f9) + ((1 - ((f7 - 0.2f) / 0.6f)) * (i2 - 1) * f9));
            } else if (f7 <= 0.8d || f7 >= 1.0f) {
                if (f7 == 1.0f) {
                    this.mCenterPoint.setX((-(i2 - 1)) * 0.5f * this.mDistance);
                }
            } else {
                this.mCenterPoint.setX((-(i2 - 1)) * 0.5f * this.mDistance);
            }
            float f10 = this.mPercent;
            if (f10 > 0.8d && f10 <= 1.0f) {
                this.mControlPoint[5].setX(this.mCenterPoint.getX() + (this.mRadius * (2 - ((this.mPercent - 0.8f) / 0.2f))));
                this.mControlPoint[0].setX(this.mCenterPoint.getX() - this.mRadius);
            } else if (f10 > 0.5d && f10 <= 0.8d) {
                this.mControlPoint[5].setX(this.mCenterPoint.getX() + (2 * this.mRadius));
                f = 1;
                this.mControlPoint[0].setX(this.mCenterPoint.getX() - (this.mRadius * (((0.8f - this.mPercent) / 0.3f) + f)));
                this.mControlPoint[2].setY(this.mRadius * ((((this.mPercent - 0.8f) / 0.3f) * 0.1f) + f));
                this.mControlPoint[8].setY((-this.mRadius) * ((((this.mPercent - 0.8f) / 0.3f) * 0.1f) + f));
                f3 = this.mPercent;
                f5 = (-f3) + 0.8f;
                f4 = f + ((f5 / 0.3f) * 0.3f);
                f6 *= f4;
            } else if (f10 > 0.2d && f10 <= 0.5d) {
                f = 1;
                this.mControlPoint[5].setX(this.mCenterPoint.getX() + (this.mRadius * (((this.mPercent - 0.2f) / 0.3f) + f)));
                this.mControlPoint[0].setX(this.mCenterPoint.getX() - (this.mRadius * (((this.mPercent - 0.2f) / 0.3f) + f)));
                this.mControlPoint[2].setY(this.mRadius * (f - (((this.mPercent - 0.2f) / 0.3f) * 0.1f)));
                this.mControlPoint[8].setY((-this.mRadius) * (f - (((this.mPercent - 0.2f) / 0.3f) * 0.1f)));
                f2 = this.mPercent;
                f5 = f2 - 0.2f;
                f4 = f + ((f5 / 0.3f) * 0.3f);
                f6 *= f4;
            } else if (f10 > 0.1d && f10 <= 0.2d) {
                this.mControlPoint[5].setX(this.mCenterPoint.getX() + this.mRadius);
                this.mControlPoint[0].setX(this.mCenterPoint.getX() - (this.mRadius * (1 - (((0.2f - this.mPercent) / 0.1f) * 0.5f))));
            } else if (f10 >= 0.0f && f10 <= 0.1d) {
                this.mControlPoint[5].setX(this.mCenterPoint.getX() + this.mRadius);
                this.mControlPoint[0].setX(this.mCenterPoint.getX() - (this.mRadius * (1 - ((this.mPercent / 0.1f) * 0.5f))));
            }
        } else if (i == i2 - 1 && this.mIsLeft) {
            float f11 = this.mPercent;
            if (f11 <= 0.2d) {
                CenterPoint centerPoint3 = this.mCenterPoint;
                float f12 = this.mDistance;
                centerPoint3.setX(((-(i2 - 1)) * 0.5f * f12) + ((i2 - 1) * f12));
            } else if (f11 <= 0.8d) {
                CenterPoint centerPoint4 = this.mCenterPoint;
                float f13 = this.mDistance;
                centerPoint4.setX(((-(i2 - 1)) * 0.5f * f13) + ((1 - ((f11 - 0.2f) / 0.6f)) * (i2 - 1) * f13));
            } else if (f11 <= 0.8d || f11 >= 1.0f) {
                if (f11 == 1.0f) {
                    CenterPoint centerPoint5 = this.mCenterPoint;
                    float f14 = this.mDistance;
                    centerPoint5.setX(((-(i2 - 1)) * 0.5f * f14) + (i * f14));
                }
            } else {
                this.mCenterPoint.setX((-(i2 - 1)) * 0.5f * this.mDistance);
            }
            float f15 = this.mPercent;
            if (f15 > 0.0f) {
                if (f15 <= 0.2d && f15 >= 0.0f) {
                    this.mControlPoint[5].setX(this.mCenterPoint.getX() + this.mRadius);
                    this.mControlPoint[0].setX(this.mCenterPoint.getX() - (this.mRadius * (1 + (this.mPercent / 0.2f))));
                } else if (f15 > 0.2d && f15 <= 0.5d) {
                    f = 1;
                    this.mControlPoint[5].setX(this.mCenterPoint.getX() + (this.mRadius * (((this.mPercent - 0.2f) / 0.3f) + f)));
                    this.mControlPoint[0].setX(this.mCenterPoint.getX() - (2 * this.mRadius));
                    this.mControlPoint[2].setY(this.mRadius * (f - (((this.mPercent - 0.2f) / 0.3f) * 0.1f)));
                    this.mControlPoint[8].setY((-this.mRadius) * (f - (((this.mPercent - 0.2f) / 0.3f) * 0.1f)));
                    f2 = this.mPercent;
                    f5 = f2 - 0.2f;
                    f4 = f + ((f5 / 0.3f) * 0.3f);
                    f6 *= f4;
                } else if (f15 > 0.5d && f15 <= 0.8d) {
                    float f16 = 1;
                    this.mControlPoint[5].setX(this.mCenterPoint.getX() + (this.mRadius * (((0.8f - this.mPercent) / 0.3f) + f16)));
                    this.mControlPoint[0].setX(this.mCenterPoint.getX() - (this.mRadius * (((0.8f - this.mPercent) / 0.3f) + f16)));
                    this.mControlPoint[2].setY(this.mRadius * ((((this.mPercent - 0.8f) / 0.3f) * 0.1f) + f16));
                    this.mControlPoint[8].setY((-this.mRadius) * ((((this.mPercent - 0.8f) / 0.3f) * 0.1f) + f16));
                    f4 = f16 + (((0.8f - this.mPercent) / 0.3f) * 0.3f);
                    f6 *= f4;
                } else if (f15 > 0.8d && f15 <= 0.9d) {
                    this.mControlPoint[5].setX(this.mCenterPoint.getX() + (this.mRadius * (1 - (((this.mPercent - 0.8f) / 0.1f) * 0.5f))));
                    this.mControlPoint[0].setX(this.mCenterPoint.getX() - this.mRadius);
                } else if (f15 > 0.9d && f15 <= 1.0f) {
                    this.mControlPoint[5].setX(this.mCenterPoint.getX() + (this.mRadius * (1 - (((this.mPercent - 0.9f) / 0.1f) * 0.5f))));
                    this.mControlPoint[0].setX(this.mCenterPoint.getX() - this.mRadius);
                }
            }
        } else {
            float f17 = this.mPercent;
            if (f17 <= 0.2d) {
                CenterPoint centerPoint6 = this.mCenterPoint;
                float f18 = this.mDistance;
                centerPoint6.setX(((-(i2 - 1)) * 0.5f * f18) + (i * f18));
            } else if (f17 <= 0.8d) {
                CenterPoint centerPoint7 = this.mCenterPoint;
                float f19 = this.mDistance;
                centerPoint7.setX(((-(i2 - 1)) * 0.5f * f19) + ((i + f17) * f19));
                CenterPoint centerPoint8 = this.mCenterPoint;
                float f20 = (-(this.mNum - 1)) * 0.5f;
                float f21 = this.mDistance;
                centerPoint8.setX((f20 * f21) + ((this.mPosition + ((this.mPercent - 0.2f) / 0.6f)) * f21));
            } else if (f17 <= 0.8d || f17 >= 1.0f) {
                if (f17 == 1.0f) {
                    CenterPoint centerPoint9 = this.mCenterPoint;
                    float f22 = this.mDistance;
                    centerPoint9.setX(((-(i2 - 1)) * 0.5f * f22) + (i * f22));
                }
            } else {
                CenterPoint centerPoint10 = this.mCenterPoint;
                float f23 = this.mDistance;
                centerPoint10.setX(((-(i2 - 1)) * 0.5f * f23) + ((i + 1) * f23));
            }
            if (this.mIsLeft) {
                float f24 = this.mPercent;
                if (f24 >= 0.0f && f24 <= 0.2d) {
                    this.mControlPoint[5].setX(this.mCenterPoint.getX() + (this.mRadius * (2 - ((0.2f - this.mPercent) / 0.2f))));
                    this.mControlPoint[0].setX(this.mCenterPoint.getX() - this.mRadius);
                } else if (f24 > 0.2d && f24 <= 0.5d) {
                    this.mControlPoint[5].setX(this.mCenterPoint.getX() + (2 * this.mRadius));
                    f = 1;
                    this.mControlPoint[0].setX(this.mCenterPoint.getX() - (this.mRadius * (((this.mPercent - 0.2f) / 0.3f) + f)));
                    this.mControlPoint[2].setY(this.mRadius * (f - (((this.mPercent - 0.2f) / 0.3f) * 0.1f)));
                    this.mControlPoint[8].setY((-this.mRadius) * (f - (((this.mPercent - 0.2f) / 0.3f) * 0.1f)));
                    f2 = this.mPercent;
                    f5 = f2 - 0.2f;
                    f4 = f + ((f5 / 0.3f) * 0.3f);
                    f6 *= f4;
                } else if (f24 > 0.5d && f24 <= 0.8d) {
                    f = 1;
                    this.mControlPoint[5].setX(this.mCenterPoint.getX() + (this.mRadius * (((0.8f - this.mPercent) / 0.3f) + f)));
                    this.mControlPoint[0].setX(this.mCenterPoint.getX() - (this.mRadius * (((0.8f - this.mPercent) / 0.3f) + f)));
                    this.mControlPoint[2].setY(this.mRadius * ((((this.mPercent - 0.8f) / 0.3f) * 0.1f) + f));
                    this.mControlPoint[8].setY((-this.mRadius) * ((((this.mPercent - 0.8f) / 0.3f) * 0.1f) + f));
                    f3 = this.mPercent;
                    f5 = (-f3) + 0.8f;
                    f4 = f + ((f5 / 0.3f) * 0.3f);
                    f6 *= f4;
                } else if (f24 > 0.8d && f24 <= 0.9d) {
                    this.mControlPoint[5].setX(this.mCenterPoint.getX() + this.mRadius);
                    this.mControlPoint[0].setX(this.mCenterPoint.getX() - (this.mRadius * (1 - (((this.mPercent - 0.8f) / 0.1f) * 0.5f))));
                } else if (f24 > 0.9d && f24 <= 1.0f) {
                    this.mControlPoint[5].setX(this.mCenterPoint.getX() + this.mRadius);
                    this.mControlPoint[0].setX(this.mCenterPoint.getX() - (this.mRadius * (1 - (((1.0f - this.mPercent) / 0.1f) * 0.5f))));
                }
            } else {
                float f25 = this.mPercent;
                if (f25 <= 1.0f && f25 >= 0.8d) {
                    this.mControlPoint[5].setX(this.mCenterPoint.getX() + this.mRadius);
                    this.mControlPoint[0].setX(this.mCenterPoint.getX() - (this.mRadius * (2 - ((this.mPercent - 0.8f) / 0.2f))));
                } else if (f25 > 0.5d && f25 <= 0.8d) {
                    float f26 = 2;
                    this.mControlPoint[5].setX(this.mCenterPoint.getX() + (this.mRadius * (f26 - ((this.mPercent - 0.5f) / 0.3f))));
                    this.mControlPoint[0].setX(this.mCenterPoint.getX() - (f26 * this.mRadius));
                    float f27 = 1;
                    this.mControlPoint[2].setY(this.mRadius * (f27 - (((0.8f - this.mPercent) / 0.3f) * 0.1f)));
                    this.mControlPoint[8].setY((-this.mRadius) * (f27 - (((0.8f - this.mPercent) / 0.3f) * 0.1f)));
                    f6 *= f27 + (((0.8f - this.mPercent) / 0.3f) * 0.3f);
                } else if (f25 > 0.2d && f25 <= 0.5d) {
                    f = 1;
                    this.mControlPoint[5].setX(this.mCenterPoint.getX() + (this.mRadius * (((this.mPercent - 0.2f) / 0.3f) + f)));
                    this.mControlPoint[0].setX(this.mCenterPoint.getX() - (this.mRadius * (((this.mPercent - 0.2f) / 0.3f) + f)));
                    this.mControlPoint[2].setY(this.mRadius * (f - (((this.mPercent - 0.2f) / 0.3f) * 0.1f)));
                    this.mControlPoint[8].setY((-this.mRadius) * (f - (((this.mPercent - 0.2f) / 0.3f) * 0.1f)));
                    f2 = this.mPercent;
                    f5 = f2 - 0.2f;
                    f4 = f + ((f5 / 0.3f) * 0.3f);
                    f6 *= f4;
                } else if (f25 > 0.1d && f25 <= 0.2d) {
                    this.mControlPoint[5].setX(this.mCenterPoint.getX() + (this.mRadius * (1 - (((0.2f - this.mPercent) / 0.1f) * 0.5f))));
                    this.mControlPoint[0].setX(this.mCenterPoint.getX() - this.mRadius);
                } else if (f25 >= 0.0f && f25 <= 0.1d) {
                    this.mControlPoint[5].setX(this.mCenterPoint.getX() + (this.mRadius * (1 - ((this.mPercent / 0.1f) * 0.5f))));
                    this.mControlPoint[0].setX(this.mCenterPoint.getX() - this.mRadius);
                }
            }
        }
        this.mControlPoint[0].setY(0.0f);
        this.mControlPoint[1].setX(this.mControlPoint[0].getX());
        this.mControlPoint[1].setY(this.mRadius * f6);
        this.mControlPoint[11].setX(this.mControlPoint[0].getX());
        this.mControlPoint[11].setY((-this.mRadius) * f6);
        this.mControlPoint[2].setX(this.mCenterPoint.getX() - (this.mRadius * f6));
        this.mControlPoint[3].setX(this.mCenterPoint.getX());
        this.mControlPoint[3].setY(this.mControlPoint[2].getY());
        this.mControlPoint[4].setX(this.mCenterPoint.getX() + (this.mRadius * f6));
        this.mControlPoint[4].setY(this.mControlPoint[2].getY());
        this.mControlPoint[5].setY(this.mRadius * f6);
        this.mControlPoint[6].setX(this.mControlPoint[5].getX());
        this.mControlPoint[6].setY(0.0f);
        this.mControlPoint[7].setX(this.mControlPoint[5].getX());
        this.mControlPoint[7].setY((-this.mRadius) * f6);
        this.mControlPoint[8].setX(this.mCenterPoint.getX() + (this.mRadius * f6));
        this.mControlPoint[9].setX(this.mCenterPoint.getX());
        this.mControlPoint[9].setY(this.mControlPoint[8].getY());
        this.mControlPoint[10].setX(this.mCenterPoint.getX() - (this.mRadius * f6));
        this.mControlPoint[10].setY(this.mControlPoint[8].getY());
    }

    private final void b(Canvas canvas) {
        a();
        Path path = this.mPath;
        Objects.requireNonNull(path);
        path.reset();
        Path path2 = this.mPath;
        Objects.requireNonNull(path2);
        path2.moveTo(this.mControlPoint[0].getX(), this.mControlPoint[0].getY());
        Path path3 = this.mPath;
        Objects.requireNonNull(path3);
        path3.cubicTo(this.mControlPoint[1].getX(), this.mControlPoint[1].getY(), this.mControlPoint[2].getX(), this.mControlPoint[2].getY(), this.mControlPoint[3].getX(), this.mControlPoint[3].getY());
        Path path4 = this.mPath;
        Objects.requireNonNull(path4);
        path4.cubicTo(this.mControlPoint[4].getX(), this.mControlPoint[4].getY(), this.mControlPoint[5].getX(), this.mControlPoint[5].getY(), this.mControlPoint[6].getX(), this.mControlPoint[6].getY());
        Path path5 = this.mPath;
        Objects.requireNonNull(path5);
        path5.cubicTo(this.mControlPoint[7].getX(), this.mControlPoint[7].getY(), this.mControlPoint[8].getX(), this.mControlPoint[8].getY(), this.mControlPoint[9].getX(), this.mControlPoint[9].getY());
        Path path6 = this.mPath;
        Objects.requireNonNull(path6);
        path6.cubicTo(this.mControlPoint[10].getX(), this.mControlPoint[10].getY(), this.mControlPoint[11].getX(), this.mControlPoint[11].getY(), this.mControlPoint[0].getX(), this.mControlPoint[0].getY());
        Path path7 = this.mPath;
        Objects.requireNonNull(path7);
        Paint paint = this.paintFill;
        Objects.requireNonNull(paint);
        canvas.drawPath(path7, paint);
    }

    private final void c(Canvas canvas) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10 = this.mRadius;
        float f11 = 2;
        float f12 = f10 / f11;
        int i = this.mPosition;
        int i2 = this.mNum;
        if (i != i2 - 1 || this.mIsLeft) {
            if (i == i2 - 1 && this.mIsLeft) {
                float f13 = this.mPercent;
                if (f13 >= 0.5d) {
                    f12 += ((f10 - f12) * ((-0.5f) + f13)) / 0.5f;
                    float f14 = this.mDistance;
                    f8 = (-(i2 - 1)) * 0.5f * f14;
                    f9 = ((-(i2 - 1)) * 0.5f * f14) + (((1 - f13) / 0.5f) * (i2 - 1) * f14);
                } else {
                    float f15 = this.mDistance;
                    f8 = ((-(i2 - 1)) * 0.5f * f15) + (((0.5f - f13) / 0.5f) * (i2 - 1) * f15);
                    f9 = ((-(i2 - 1)) * 0.5f * f15) + ((i2 - 1) * f15);
                }
                float f16 = f9;
                f4 = f8;
                f3 = f16;
                f5 = f10 * (1 - f13);
            } else if (this.mIsLeft) {
                float f17 = this.mPercent;
                float f18 = this.mDistance;
                this.mOffset = (i + f17) * f18;
                f11 = f11;
                if (f17 >= 0.5d) {
                    f12 += ((f10 - f12) * (f17 - 0.5f)) / 0.5f;
                    f4 = ((-(i2 - 1)) * 0.5f * f18) + ((((f17 - 0.5f) / 0.5f) + i) * f18);
                    f6 = ((-(i2 - 1)) * 0.5f * f18) + ((i + 1) * f18);
                } else {
                    f6 = ((-(i2 - 1)) * 0.5f * f18) + (((f17 / 0.5f) + i) * f18);
                    f4 = ((-(i2 - 1)) * 0.5f * f18) + (i * f18);
                }
                f7 = f10 * (1 - f17);
                f3 = f6;
            } else {
                float f19 = this.mPercent;
                float f20 = this.mDistance;
                this.mOffset = (i + f19) * f20;
                if (f19 <= 0.5d) {
                    f = ((-(i2 - 1)) * 0.5f * f20) + (i * f20);
                    f2 = ((-(i2 - 1)) * 0.5f * f20) + (((f19 / 0.5f) + i) * f20);
                    f12 += ((f10 - f12) * (0.5f - f19)) / 0.5f;
                } else {
                    f = ((-(i2 - 1)) * 0.5f * f20) + ((((f19 - 0.5f) / 0.5f) + i) * f20);
                    f2 = ((-(i2 - 1)) * 0.5f * f20) + ((i + 1) * f20);
                }
                f3 = f2;
                f4 = f;
                f5 = f10 * f19;
            }
            float f21 = f12;
            f12 = f5;
            f7 = f21;
        } else {
            float f22 = this.mPercent;
            if (f22 <= 0.5d) {
                float f23 = this.mDistance;
                f3 = ((-(i2 - 1)) * 0.5f * f23) + ((i2 - 1) * f23);
                f4 = ((-(i2 - 1)) * 0.5f * f23) + (((0.5f - f22) / 0.5f) * (i2 - 1) * f23);
                f12 += ((f10 - f12) * (0.5f - f22)) / 0.5f;
            } else {
                float f24 = this.mDistance;
                f3 = ((-(i2 - 1)) * 0.5f * f24) + (((1.0f - f22) / 0.5f) * (i2 - 1) * f24);
                f4 = (-(i2 - 1)) * 0.5f * f24;
            }
            f7 = f10 * f22;
            f11 = f11;
        }
        Paint paint = this.paintFill;
        Objects.requireNonNull(paint);
        canvas.drawCircle(f3, 0.0f, f12, paint);
        Paint paint2 = this.paintFill;
        Objects.requireNonNull(paint2);
        canvas.drawCircle(f4, 0.0f, f7, paint2);
        this.mSpringPoint[0].setX(f4);
        float f25 = -f7;
        this.mSpringPoint[0].setY(f25);
        this.mSpringPoint[5].setX(this.mSpringPoint[0].getX());
        this.mSpringPoint[5].setY(f7);
        this.mSpringPoint[1].setX((f4 + f3) / f11);
        this.mSpringPoint[1].setY(f25 / f11);
        this.mSpringPoint[4].setX(this.mSpringPoint[1].getX());
        this.mSpringPoint[4].setY(f7 / f11);
        this.mSpringPoint[2].setX(f3);
        this.mSpringPoint[2].setY(-f12);
        this.mSpringPoint[3].setX(this.mSpringPoint[2].getX());
        this.mSpringPoint[3].setY(f12);
        Path path = this.mPath;
        Objects.requireNonNull(path);
        path.reset();
        Path path2 = this.mPath;
        Objects.requireNonNull(path2);
        path2.moveTo(this.mSpringPoint[0].getX(), this.mSpringPoint[0].getY());
        Path path3 = this.mPath;
        Objects.requireNonNull(path3);
        path3.quadTo(this.mSpringPoint[1].getX(), this.mSpringPoint[1].getY(), this.mSpringPoint[2].getX(), this.mSpringPoint[2].getY());
        Path path4 = this.mPath;
        Objects.requireNonNull(path4);
        path4.lineTo(this.mSpringPoint[3].getX(), this.mSpringPoint[3].getY());
        Path path5 = this.mPath;
        Objects.requireNonNull(path5);
        path5.quadTo(this.mSpringPoint[4].getX(), this.mSpringPoint[4].getY(), this.mSpringPoint[5].getX(), this.mSpringPoint[5].getY());
        Path path6 = this.mPath;
        Objects.requireNonNull(path6);
        Paint paint3 = this.paintFill;
        Objects.requireNonNull(paint3);
        canvas.drawPath(path6, paint3);
    }

    private final void d() {
        this.paintStroke = new Paint();
        this.paintFill = new Paint();
        this.mPath = new Path();
        Paint paint = this.paintFill;
        Objects.requireNonNull(paint);
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        Paint paint2 = this.paintFill;
        Objects.requireNonNull(paint2);
        paint2.setColor(this.mSelected_color);
        Paint paint3 = this.paintFill;
        Objects.requireNonNull(paint3);
        paint3.setAntiAlias(true);
        Paint paint4 = this.paintFill;
        Objects.requireNonNull(paint4);
        paint4.setStrokeWidth(this.mHeight);
        Paint paint5 = this.paintStroke;
        Objects.requireNonNull(paint5);
        paint5.setStyle(Paint.Style.FILL_AND_STROKE);
        Paint paint6 = this.paintStroke;
        Objects.requireNonNull(paint6);
        paint6.setColor(this.mDefault_color);
        Paint paint7 = this.paintStroke;
        Objects.requireNonNull(paint7);
        paint7.setAntiAlias(true);
        Paint paint8 = this.paintStroke;
        Objects.requireNonNull(paint8);
        paint8.setStrokeWidth(this.mHeight);
    }

    private final void e(Context context, AttributeSet attrs) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrs, R.styleable.PaiPagerIndicator);
        this.mSelected_color = typedArrayObtainStyledAttributes.getColor(R.styleable.PaiPagerIndicator_ppi_selected_color, -1);
        this.mDefault_color = typedArrayObtainStyledAttributes.getColor(R.styleable.PaiPagerIndicator_ppi_default_color, -3289651);
        float dimension = typedArrayObtainStyledAttributes.getDimension(R.styleable.PaiPagerIndicator_ppi_radius, 20.0f);
        this.mRadius = dimension;
        this.mRadiusSelected = typedArrayObtainStyledAttributes.getDimension(R.styleable.PaiPagerIndicator_ppi_radius_selected, dimension);
        this.mLength = typedArrayObtainStyledAttributes.getDimension(R.styleable.PaiPagerIndicator_ppi_length, 2 * this.mRadius);
        this.mHeight = typedArrayObtainStyledAttributes.getDimension(R.styleable.PaiPagerIndicator_ppi_height, 2.0f);
        this.mUnSelectedLength = typedArrayObtainStyledAttributes.getDimension(R.styleable.PaiPagerIndicator_ppi_unselected_length, this.mLength);
        this.mDistance = typedArrayObtainStyledAttributes.getDimension(R.styleable.PaiPagerIndicator_ppi_distance, 3 * this.mRadius);
        this.mDistanceType = typedArrayObtainStyledAttributes.getInteger(R.styleable.PaiPagerIndicator_ppi_distanceType, 0);
        this.mIndicatorType = typedArrayObtainStyledAttributes.getInteger(R.styleable.PaiPagerIndicator_ppi_indicatorType, 1);
        this.mNum = typedArrayObtainStyledAttributes.getInteger(R.styleable.PaiPagerIndicator_ppi_num, 0);
        this.mAnimation = typedArrayObtainStyledAttributes.getBoolean(R.styleable.PaiPagerIndicator_ppi_animation, true);
        typedArrayObtainStyledAttributes.recycle();
        int i = this.mIndicatorType;
        if (i == 3) {
            this.mControlPoint = new Point[]{new Point(), new Point(), new Point(), new Point(), new Point(), new Point(), new Point(), new Point(), new Point(), new Point(), new Point(), new Point()};
        } else if (i == 4) {
            this.mSpringPoint = new Point[]{new Point(), new Point(), new Point(), new Point(), new Point(), new Point()};
        }
        invalidate();
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0035  */
    /* JADX WARN: Code duplicated, block: B:23:0x004a  */
    /* JADX WARN: Code duplicated, block: B:25:0x004e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:27:0x005d  */
    public final void move(float percent, int position, boolean isLeft) {
        int i;
        this.mPosition = position;
        this.mPercent = percent;
        this.mIsLeft = isLeft;
        int i2 = this.mIndicatorType;
        if (i2 == 0 || i2 == 1) {
            i = this.mNum;
            if (position != i - 1 && !isLeft) {
                this.mOffset = (1 - percent) * (i - 1) * this.mDistance;
            } else if (position == i - 1 || !isLeft) {
                this.mOffset = (percent + position) * this.mDistance;
            } else {
                this.mOffset = (1 - percent) * (i - 1) * this.mDistance;
            }
        } else if (i2 == 2) {
            int i3 = this.mNum;
            if (position == i3 - 1 && !isLeft) {
                this.mOffset = this.mDistance * percent;
            }
            if (position != i3 - 1 || isLeft) {
                this.mOffset = percent * this.mDistance;
            } else {
                this.mOffset = percent * this.mDistance;
            }
        } else if (i2 == 5) {
            i = this.mNum;
            if (position != i - 1) {
                if (position == i - 1) {
                    this.mOffset = (percent + position) * this.mDistance;
                } else {
                    this.mOffset = (percent + position) * this.mDistance;
                }
            } else if (position == i - 1) {
                this.mOffset = (percent + position) * this.mDistance;
            } else {
                this.mOffset = (percent + position) * this.mDistance;
            }
        }
        invalidate();
    }

    @Override // android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        super.onDraw(canvas);
        if (this.mNum <= 0) {
            return;
        }
        float width = canvas.getWidth();
        canvas.translate(width / 2.0f, canvas.getHeight() / 2.0f);
        d();
        int i = this.mDistanceType;
        if (i == 0) {
            this.mDistance = 3 * this.mRadius;
        } else if (i == 2) {
            if (this.mIndicatorType == 2) {
                this.mDistance = width / (this.mNum + 1);
            } else {
                this.mDistance = width / this.mNum;
            }
        }
        int i2 = this.mIndicatorType;
        int i3 = 0;
        if (i2 == 0) {
            Paint paint = this.paintStroke;
            Objects.requireNonNull(paint);
            paint.setStrokeWidth(this.mRadius);
            int i4 = this.mNum;
            float f = this.mDistance;
            float f2 = this.mUnSelectedLength;
            float f3 = 2;
            float f4 = (((-(i4 - 1)) * 0.5f) * f) - (f2 / f3);
            float f5 = ((-(i4 - 1)) * 0.5f * f) + (f2 / f3);
            while (i3 < this.mNum) {
                float f6 = i3;
                float f7 = this.mDistance;
                RectF rectF = new RectF((f6 * f7) + f4, 0.0f, (f6 * f7) + f5, this.mHeight);
                float f8 = this.mRadius;
                Paint paint2 = this.paintStroke;
                Objects.requireNonNull(paint2);
                canvas.drawRoundRect(rectF, f8, f8, paint2);
                i3++;
            }
            Paint paint3 = this.paintFill;
            Objects.requireNonNull(paint3);
            paint3.setStrokeWidth(this.mRadius);
            int i5 = this.mNum;
            float f9 = this.mDistance;
            float f10 = this.mLength;
            float f11 = this.mOffset;
            RectF rectF2 = new RectF(((((-(i5 - 1)) * 0.5f) * f9) - (f10 / f3)) + f11, 0.0f, ((-(i5 - 1)) * 0.5f * f9) + (f10 / f3) + f11, this.mHeight);
            float f12 = this.mRadiusSelected;
            Paint paint4 = this.paintFill;
            Objects.requireNonNull(paint4);
            canvas.drawRoundRect(rectF2, f12, f12, paint4);
            return;
        }
        if (i2 == 1) {
            while (true) {
                int i6 = this.mNum;
                if (i3 >= i6) {
                    Paint paint5 = this.paintFill;
                    Objects.requireNonNull(paint5);
                    canvas.drawCircle(((-(i6 - 1)) * 0.5f * this.mDistance) + this.mOffset, 0.0f, this.mRadiusSelected, paint5);
                    Unit unit = Unit.INSTANCE;
                    return;
                }
                Paint paint6 = this.paintStroke;
                Objects.requireNonNull(paint6);
                float f13 = this.mDistance;
                canvas.drawCircle(((-(i6 - 1)) * 0.5f * f13) + (i3 * f13), 0.0f, this.mRadius, paint6);
                Unit unit2 = Unit.INSTANCE;
                i3++;
            }
        } else {
            if (i2 == 2) {
                int i7 = this.mPosition;
                int i8 = this.mNum;
                if (i7 == i8 - 1) {
                    float f14 = (-i8) * 0.5f * this.mDistance;
                    float f15 = this.mRadius;
                    float f16 = f14 - f15;
                    float f17 = 2;
                    float f18 = (f17 * f15) + f16 + this.mOffset;
                    RectF rectF3 = new RectF(f16, -f15, f18, f15);
                    float f19 = this.mRadius;
                    Paint paint7 = this.paintStroke;
                    Objects.requireNonNull(paint7);
                    canvas.drawRoundRect(rectF3, f19, f19, paint7);
                    int i9 = this.mNum;
                    float f20 = this.mDistance;
                    float f21 = ((-i9) * 0.5f * f20) + (i9 * f20);
                    float f22 = this.mRadius;
                    float f23 = f21 + f22;
                    RectF rectF4 = new RectF(((f23 - (f17 * f22)) - f20) + this.mOffset, -f22, f23, f22);
                    float f24 = this.mRadius;
                    Paint paint8 = this.paintStroke;
                    Objects.requireNonNull(paint8);
                    canvas.drawRoundRect(rectF4, f24, f24, paint8);
                    for (int i10 = 1; i10 < this.mNum; i10++) {
                        Paint paint9 = this.paintStroke;
                        Objects.requireNonNull(paint9);
                        float f25 = this.mRadius;
                        canvas.drawCircle((f18 - f25) + (i10 * this.mDistance), 0.0f, f25, paint9);
                        Unit unit3 = Unit.INSTANCE;
                    }
                    return;
                }
                float f26 = this.mDistance;
                float f27 = ((-i8) * 0.5f * f26) + (i7 * f26);
                float f28 = this.mRadius;
                float f29 = f27 - f28;
                float f30 = 2;
                RectF rectF5 = new RectF(f29, -f28, (((f30 * f28) + f29) + f26) - this.mOffset, f28);
                float f31 = this.mRadius;
                Paint paint10 = this.paintStroke;
                Objects.requireNonNull(paint10);
                canvas.drawRoundRect(rectF5, f31, f31, paint10);
                int i11 = this.mPosition;
                int i12 = this.mNum;
                if (i11 < i12 - 1) {
                    float f32 = this.mDistance;
                    float f33 = ((-i12) * 0.5f * f32) + ((i11 + 2) * f32);
                    float f34 = this.mRadius;
                    float f35 = f33 + f34;
                    RectF rectF6 = new RectF((f35 - (f30 * f34)) - this.mOffset, -f34, f35, f34);
                    float f36 = this.mRadius;
                    Paint paint11 = this.paintStroke;
                    Objects.requireNonNull(paint11);
                    canvas.drawRoundRect(rectF6, f36, f36, paint11);
                }
                int i13 = this.mPosition + 3;
                while (true) {
                    int i14 = this.mNum;
                    if (i13 > i14) {
                        break;
                    }
                    float f37 = this.mDistance;
                    float f38 = ((-i14) * 0.5f * f37) + (i13 * f37);
                    float f39 = this.mRadius;
                    Paint paint12 = this.paintStroke;
                    Objects.requireNonNull(paint12);
                    canvas.drawCircle(f38, 0.0f, f39, paint12);
                    i13++;
                }
                Unit unit4 = Unit.INSTANCE;
                for (int i15 = this.mPosition - 1; i15 >= 0; i15--) {
                    float f40 = (-this.mNum) * 0.5f;
                    float f41 = this.mDistance;
                    float f42 = (f40 * f41) + (i15 * f41);
                    float f43 = this.mRadius;
                    Paint paint13 = this.paintStroke;
                    Objects.requireNonNull(paint13);
                    canvas.drawCircle(f42, 0.0f, f43, paint13);
                }
                return;
            }
            if (i2 == 3) {
                while (true) {
                    int i16 = this.mNum;
                    if (i3 >= i16) {
                        b(canvas);
                        return;
                    }
                    float f44 = this.mDistance;
                    float f45 = ((-(i16 - 1)) * 0.5f * f44) + (i3 * f44);
                    float f46 = this.mRadius;
                    Paint paint14 = this.paintStroke;
                    Objects.requireNonNull(paint14);
                    canvas.drawCircle(f45, 0.0f, f46, paint14);
                    i3++;
                }
            } else if (i2 == 4) {
                while (true) {
                    int i17 = this.mNum;
                    if (i3 >= i17) {
                        c(canvas);
                        return;
                    }
                    float f47 = this.mDistance;
                    float f48 = ((-(i17 - 1)) * 0.5f * f47) + (i3 * f47);
                    float f49 = this.mRadius;
                    Paint paint15 = this.paintStroke;
                    Objects.requireNonNull(paint15);
                    canvas.drawCircle(f48, 0.0f, f49, paint15);
                    i3++;
                }
            } else {
                if (i2 != 5) {
                    return;
                }
                while (true) {
                    int i18 = this.mNum;
                    if (i3 >= i18) {
                        float f50 = this.mDistance;
                        float f51 = ((-(i18 - 1)) * 0.5f * f50) + this.mOffset;
                        float f52 = this.mRadius;
                        RectF rectF7 = new RectF((((-(i18 - 1)) * 0.5f) * f50) - f52, -f52, f51 + f52, f52);
                        float f53 = this.mRadius;
                        Paint paint16 = this.paintFill;
                        Objects.requireNonNull(paint16);
                        canvas.drawRoundRect(rectF7, f53, f53, paint16);
                        return;
                    }
                    float f54 = this.mDistance;
                    float f55 = ((-(i18 - 1)) * 0.5f * f54) + (i3 * f54);
                    float f56 = this.mRadius;
                    Paint paint17 = this.paintStroke;
                    Objects.requireNonNull(paint17);
                    canvas.drawCircle(f55, 0.0f, f56, paint17);
                    i3++;
                }
            }
        }
    }

    @Nullable
    public final PaiViewPagerIndicator setDistance(float distance) {
        this.mDistance = distance;
        invalidate();
        return this;
    }

    @Nullable
    public final PaiViewPagerIndicator setDistanceType(int mDistanceType) {
        this.mDistanceType = mDistanceType;
        invalidate();
        return this;
    }

    @NotNull
    public final PaiViewPagerIndicator setNum(int num) {
        this.mNum = num;
        invalidate();
        return this;
    }

    @Nullable
    public final PaiViewPagerIndicator setRadius(float radius) {
        this.mRadius = radius;
        invalidate();
        return this;
    }

    @Nullable
    public final PaiViewPagerIndicator setType(int indicatorType) {
        this.mIndicatorType = indicatorType;
        invalidate();
        return this;
    }

    @Nullable
    public final PaiViewPagerIndicator setViewPager(@NotNull ViewPager viewPager) {
        setViewPager(viewPager, viewPager.getAdapter().getCount(), false);
        return this;
    }

    @Nullable
    public final PaiViewPagerIndicator setViewPager(@NotNull ViewPager viewpager, int CycleNumber) {
        setViewPager(viewpager, CycleNumber, false);
        return this;
    }

    @Nullable
    public final PaiViewPagerIndicator setViewPager(@NotNull ViewPager viewPager, boolean isInfiniteCircle) {
        if (isInfiniteCircle) {
            setViewPager(viewPager, viewPager.getAdapter().getCount() - 2, isInfiniteCircle);
        } else {
            setViewPager(viewPager, viewPager.getAdapter().getCount(), isInfiniteCircle);
        }
        return this;
    }

    @NotNull
    public final PaiViewPagerIndicator setViewPager(@NotNull ViewPager viewpager, int CycleNumber, boolean isInfiniteCircle) {
        this.mNum = CycleNumber;
        this.mIsInfiniteCircle = isInfiniteCircle;
        viewpager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() { // from class: com.huami.pai.view.PaiViewPagerIndicator.setViewPager.1

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            private int lastValue = -1;

            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public void onPageScrollStateChanged(int state) {
            }

            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                if (PaiViewPagerIndicator.this.mAnimation) {
                    boolean z = PaiViewPagerIndicator.this.mIsLeft;
                    int i = this.lastValue;
                    int i2 = positionOffsetPixels / 10;
                    int i3 = 0;
                    if (i / 10 > i2) {
                        z = false;
                    } else if (i / 10 < i2) {
                        z = true;
                    }
                    if (PaiViewPagerIndicator.this.mNum > 0 && !PaiViewPagerIndicator.this.mIsInfiniteCircle) {
                        PaiViewPagerIndicator paiViewPagerIndicator = PaiViewPagerIndicator.this;
                        paiViewPagerIndicator.move(positionOffset, position % paiViewPagerIndicator.mNum, z);
                    } else if (PaiViewPagerIndicator.this.mNum > 0 && PaiViewPagerIndicator.this.mIsInfiniteCircle) {
                        if (position == 0) {
                            i3 = PaiViewPagerIndicator.this.mNum - 1;
                        } else if (position != PaiViewPagerIndicator.this.mNum + 1) {
                            i3 = position - 1;
                        }
                        PaiViewPagerIndicator.this.move(positionOffset, i3, z);
                    }
                    this.lastValue = positionOffsetPixels;
                }
            }

            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public void onPageSelected(int position) {
                int i;
                if (PaiViewPagerIndicator.this.mAnimation) {
                    return;
                }
                if (PaiViewPagerIndicator.this.mNum > 0 && !PaiViewPagerIndicator.this.mIsInfiniteCircle) {
                    PaiViewPagerIndicator paiViewPagerIndicator = PaiViewPagerIndicator.this;
                    paiViewPagerIndicator.move(0.0f, position % paiViewPagerIndicator.mNum, false);
                } else {
                    if (PaiViewPagerIndicator.this.mNum <= 0 || !PaiViewPagerIndicator.this.mIsInfiniteCircle) {
                        return;
                    }
                    if (position == 0) {
                        i = PaiViewPagerIndicator.this.mNum - 1;
                    } else {
                        i = position == PaiViewPagerIndicator.this.mNum + 1 ? 0 : position - 1;
                    }
                    PaiViewPagerIndicator.this.move(0.0f, i, false);
                }
            }
        });
        return this;
    }
}

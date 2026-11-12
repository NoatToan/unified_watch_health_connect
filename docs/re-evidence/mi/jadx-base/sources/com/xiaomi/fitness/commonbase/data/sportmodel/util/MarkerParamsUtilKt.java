package com.xiaomi.fitness.commonbase.data.sportmodel.util;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.mi.health.map.data.LocationMarker;
import com.mi.health.map.data.sportmodel.view.CircleMarker;
import com.xiaomi.fitness.common.utils.DisplayUtil;
import com.xiaomi.fitness.statistics.StatConstants;
import defpackage.gso;
import defpackage.i5f;
import defpackage.qqi;
import defpackage.uti;
import defpackage.vii;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b%\u0010&J9\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ9\u0010\u000b\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u000b\u0010\nJ9\u0010\r\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0014\u001a\u00020\b¢\u0006\u0004\b\u0016\u0010\u0017J!\u0010\u0019\u001a\u0004\u0018\u00010\u00182\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0014\u001a\u00020\b¢\u0006\u0004\b\u0019\u0010\u001aJ\u001d\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\b¢\u0006\u0004\b\u001c\u0010\u0017J!\u0010\u001d\u001a\u0004\u0018\u00010\u00152\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0014\u001a\u00020\b¢\u0006\u0004\b\u001d\u0010\u0017J!\u0010\u001e\u001a\u0004\u0018\u00010\u00182\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0014\u001a\u00020\b¢\u0006\u0004\b\u001e\u0010\u001aJ'\u0010\u001f\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u001f\u0010 J'\u0010!\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b!\u0010 R\u0014\u0010\"\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010$\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b$\u0010#¨\u0006'"}, d2 = {"Lcom/xiaomi/fitness/commonbase/data/sportmodel/util/MarkerParamsUtilKt;", "", "", "contentWidth", "contentHeight", "radius", "", "showShader", "Li5f;", "createStartMarkerParams", "(IIIZ)Li5f;", "createEndMarkerParams", "txtSize", "createMarkerParams", "(IIII)Li5f;", "kilometer", "createShareVideoMarkerParams", "(I)Li5f;", "Landroid/content/Context;", "context", "markerParams", "Landroid/graphics/Bitmap;", "createMarkerBitmap", "(Landroid/content/Context;Li5f;)Landroid/graphics/Bitmap;", "Landroid/view/View;", "createMarkerView", "(Landroid/content/Context;Li5f;)Landroid/view/View;", "mContext", "createCircleMarker", "createCircleMarkerBitmap", "createCircleMarkerView", "createCircleStartMarkerParams", "(III)Li5f;", "createCircleEndMarkerParams", "KILOMETER_START", "I", "KILOMETER_END", "<init>", "()V", "map-base_release"}, k = 1, mv = {2, 0, 0})
public final class MarkerParamsUtilKt {

    @NotNull
    public static final MarkerParamsUtilKt INSTANCE = new MarkerParamsUtilKt();
    public static final int KILOMETER_END = 101;
    public static final int KILOMETER_START = 100;

    private MarkerParamsUtilKt() {
    }

    public static /* synthetic */ i5f createEndMarkerParams$default(MarkerParamsUtilKt markerParamsUtilKt, int i, int i2, int i3, boolean z, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = 40;
        }
        if ((i4 & 2) != 0) {
            i2 = 40;
        }
        if ((i4 & 4) != 0) {
            i3 = 12;
        }
        if ((i4 & 8) != 0) {
            z = true;
        }
        return markerParamsUtilKt.createEndMarkerParams(i, i2, i3, z);
    }

    public static /* synthetic */ i5f createMarkerParams$default(MarkerParamsUtilKt markerParamsUtilKt, int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = 30;
        }
        if ((i5 & 2) != 0) {
            i2 = 40;
        }
        if ((i5 & 4) != 0) {
            i3 = 10;
        }
        if ((i5 & 8) != 0) {
            i4 = 11;
        }
        return markerParamsUtilKt.createMarkerParams(i, i2, i3, i4);
    }

    public static /* synthetic */ i5f createStartMarkerParams$default(MarkerParamsUtilKt markerParamsUtilKt, int i, int i2, int i3, boolean z, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = 40;
        }
        if ((i4 & 2) != 0) {
            i2 = 40;
        }
        if ((i4 & 4) != 0) {
            i3 = 12;
        }
        if ((i4 & 8) != 0) {
            z = true;
        }
        return markerParamsUtilKt.createStartMarkerParams(i, i2, i3, z);
    }

    @Nullable
    public final i5f createCircleEndMarkerParams(int contentWidth, int contentHeight, int radius) {
        return new i5f.a().h(StatConstants.PARAM_END).c(vii.common_white).k(vii.d).i(DisplayUtil.dip2px(radius)).e(DisplayUtil.dip2px(contentHeight)).f(DisplayUtil.dip2px(contentWidth)).a();
    }

    @NotNull
    public final Bitmap createCircleMarker(@NotNull Context mContext, @NotNull i5f markerParams) {
        Intrinsics.checkNotNullParameter(mContext, "mContext");
        Intrinsics.checkNotNullParameter(markerParams, "markerParams");
        int i = markerParams.f20801a;
        String str = markerParams.e;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i * 2, i * 2, Bitmap.Config.ARGB_8888);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        float f = i;
        float f2 = f / 8.0f;
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(-1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(f2);
        Paint paint2 = new Paint();
        paint2.setAntiAlias(true);
        paint2.setColor(mContext.getColor(vii.g));
        paint2.setStyle(Paint.Style.FILL);
        float f3 = 2;
        canvas.drawCircle(f, f, f - (f2 / f3), paint);
        canvas.drawCircle(f, f, f - f2, paint2);
        Paint paint3 = new Paint();
        paint3.setColor(-1);
        paint3.setTextSize(DisplayUtil.sp2px(mContext, markerParams.c));
        paint3.setTypeface(Typeface.create("mipro-medium", 1));
        paint3.setTextAlign(Paint.Align.CENTER);
        Paint.FontMetrics fontMetrics = paint3.getFontMetrics();
        canvas.drawText(str.toString(), f, f - ((fontMetrics.ascent + fontMetrics.descent) / f3), paint3);
        return bitmapCreateBitmap;
    }

    @Nullable
    public final Bitmap createCircleMarkerBitmap(@Nullable Context context, @NotNull i5f markerParams) {
        Intrinsics.checkNotNullParameter(markerParams, "markerParams");
        View viewCreateCircleMarkerView = createCircleMarkerView(context, markerParams);
        Intrinsics.checkNotNull(viewCreateCircleMarkerView);
        return gso.a(viewCreateCircleMarkerView);
    }

    @Nullable
    public final View createCircleMarkerView(@Nullable Context context, @NotNull i5f markerParams) {
        Intrinsics.checkNotNullParameter(markerParams, "markerParams");
        View viewInflate = View.inflate(context, uti.f36120a, null);
        RelativeLayout relativeLayout = (RelativeLayout) viewInflate.findViewById(qqi.f31750a);
        ViewGroup.LayoutParams layoutParams = relativeLayout.getLayoutParams();
        layoutParams.width = markerParams.f;
        layoutParams.height = markerParams.g;
        relativeLayout.setLayoutParams(layoutParams);
        relativeLayout.addView(new CircleMarker(context, markerParams));
        return viewInflate;
    }

    @Nullable
    public final i5f createCircleStartMarkerParams(int contentWidth, int contentHeight, int radius) {
        return new i5f.a().h("begin").c(vii.common_white).k(vii.h).i(DisplayUtil.dip2px(radius)).e(DisplayUtil.dip2px(contentHeight)).f(DisplayUtil.dip2px(contentWidth)).a();
    }

    @JvmOverloads
    @Nullable
    public final i5f createEndMarkerParams() {
        return createEndMarkerParams$default(this, 0, 0, 0, false, 15, null);
    }

    @Nullable
    public final Bitmap createMarkerBitmap(@Nullable Context context, @NotNull i5f markerParams) {
        Intrinsics.checkNotNullParameter(markerParams, "markerParams");
        View viewCreateMarkerView = createMarkerView(context, markerParams);
        Intrinsics.checkNotNull(viewCreateMarkerView);
        return gso.a(viewCreateMarkerView);
    }

    @JvmOverloads
    @Nullable
    public final i5f createMarkerParams() {
        return createMarkerParams$default(this, 0, 0, 0, 0, 15, null);
    }

    @Nullable
    public final View createMarkerView(@Nullable Context context, @NotNull i5f markerParams) {
        Intrinsics.checkNotNullParameter(markerParams, "markerParams");
        View viewInflate = View.inflate(context, uti.f36120a, null);
        RelativeLayout relativeLayout = (RelativeLayout) viewInflate.findViewById(qqi.f31750a);
        ViewGroup.LayoutParams layoutParams = relativeLayout.getLayoutParams();
        layoutParams.width = markerParams.f;
        layoutParams.height = markerParams.g;
        relativeLayout.setLayoutParams(layoutParams);
        relativeLayout.addView(new LocationMarker(context, markerParams));
        return viewInflate;
    }

    @Nullable
    public final i5f createShareVideoMarkerParams(int kilometer) {
        i5f i5fVarCreateStartMarkerParams$default;
        if (kilometer == 100) {
            i5fVarCreateStartMarkerParams$default = createStartMarkerParams$default(this, 30, 40, 10, false, 8, null);
        } else if (kilometer != 101) {
            i5fVarCreateStartMarkerParams$default = createMarkerParams$default(this, 0, 0, 0, 0, 15, null);
            Intrinsics.checkNotNull(i5fVarCreateStartMarkerParams$default);
            i5fVarCreateStartMarkerParams$default.e = String.valueOf(kilometer);
        } else {
            i5fVarCreateStartMarkerParams$default = createEndMarkerParams$default(this, 30, 40, 10, false, 8, null);
        }
        Intrinsics.checkNotNull(i5fVarCreateStartMarkerParams$default);
        i5fVarCreateStartMarkerParams$default.d = kilometer;
        return i5fVarCreateStartMarkerParams$default;
    }

    @JvmOverloads
    @Nullable
    public final i5f createStartMarkerParams() {
        return createStartMarkerParams$default(this, 0, 0, 0, false, 15, null);
    }

    @JvmOverloads
    @Nullable
    public final i5f createEndMarkerParams(int i) {
        return createEndMarkerParams$default(this, i, 0, 0, false, 14, null);
    }

    @JvmOverloads
    @Nullable
    public final i5f createMarkerParams(int i) {
        return createMarkerParams$default(this, i, 0, 0, 0, 14, null);
    }

    @JvmOverloads
    @Nullable
    public final i5f createStartMarkerParams(int i) {
        return createStartMarkerParams$default(this, i, 0, 0, false, 14, null);
    }

    @JvmOverloads
    @Nullable
    public final i5f createEndMarkerParams(int i, int i2) {
        return createEndMarkerParams$default(this, i, i2, 0, false, 12, null);
    }

    @JvmOverloads
    @Nullable
    public final i5f createMarkerParams(int i, int i2) {
        return createMarkerParams$default(this, i, i2, 0, 0, 12, null);
    }

    @JvmOverloads
    @Nullable
    public final i5f createStartMarkerParams(int i, int i2) {
        return createStartMarkerParams$default(this, i, i2, 0, false, 12, null);
    }

    @JvmOverloads
    @Nullable
    public final i5f createEndMarkerParams(int i, int i2, int i3) {
        return createEndMarkerParams$default(this, i, i2, i3, false, 8, null);
    }

    @JvmOverloads
    @Nullable
    public final i5f createMarkerParams(int i, int i2, int i3) {
        return createMarkerParams$default(this, i, i2, i3, 0, 8, null);
    }

    @JvmOverloads
    @Nullable
    public final i5f createStartMarkerParams(int i, int i2, int i3) {
        return createStartMarkerParams$default(this, i, i2, i3, false, 8, null);
    }

    @JvmOverloads
    @Nullable
    public final i5f createEndMarkerParams(int contentWidth, int contentHeight, int radius, boolean showShader) {
        int iDip2px = DisplayUtil.dip2px(radius);
        return new i5f.a().h(StatConstants.PARAM_END).j(0).b(vii.c).c(vii.common_white).k(vii.e).i(iDip2px).d((iDip2px * 2) / 5).e(DisplayUtil.dip2px(contentHeight)).f(DisplayUtil.dip2px(contentWidth)).g(showShader).a();
    }

    @JvmOverloads
    @Nullable
    public final i5f createMarkerParams(int contentWidth, int contentHeight, int radius, int txtSize) {
        int iDip2px = DisplayUtil.dip2px(radius);
        return new i5f.a().b(vii.f36927a).c(vii.f).k(vii.x).i(iDip2px).d((iDip2px * 4) / 5).j(txtSize).e(DisplayUtil.dip2px(contentHeight)).f(DisplayUtil.dip2px(contentWidth)).a();
    }

    @JvmOverloads
    @Nullable
    public final i5f createStartMarkerParams(int contentWidth, int contentHeight, int radius, boolean showShader) {
        int iDip2px = DisplayUtil.dip2px(radius);
        return new i5f.a().h("begin").j(0).b(vii.f36927a).c(vii.common_white).k(vii.x).i(iDip2px).d((iDip2px * 2) / 5).e(DisplayUtil.dip2px(contentHeight)).f(DisplayUtil.dip2px(contentWidth)).g(showShader).a();
    }
}

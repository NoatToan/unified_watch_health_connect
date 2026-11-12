package com.huami.sky.ui.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.ColorInt;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.ContextCompat;
import androidx.exifinterface.media.ExifInterface;
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.module.ktx.NumberExtKt;
import com.huami.sky.ui.R;
import com.huami.sky.ui.utils.ExtFuncKt;
import com.huami.tools.analytics.DbUtils;
import com.loc.z;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.cybergarage.soap.SOAP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0018\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b7\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010u\u001a\u00020t\u0012\n\b\u0002\u0010w\u001a\u0004\u0018\u00010v\u0012\b\b\u0002\u0010x\u001a\u00020\u0002¢\u0006\u0004\by\u0010zJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0002J \u0010\r\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002H\u0002J0\u0010\u0014\u001a\u00020\u00062\b\b\u0001\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u000fH\u0002J\u0018\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\nH\u0002J\b\u0010\u0019\u001a\u00020\u0006H\u0014J(\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u0002H\u0014J\u0018\u0010!\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u0002H\u0014J\u000e\u0010#\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020\u0002J\u000e\u0010&\u001a\u00020\u00062\u0006\u0010%\u001a\u00020$J\u0010\u0010'\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0014R\u0018\u0010*\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010)R\u001d\u0010.\u001a\u00020\u00028B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010+\u001a\u0004\b,\u0010-R\u001d\u00100\u001a\u00020\u00028B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010+\u001a\u0004\b/\u0010-R\u001d\u00102\u001a\u00020\u00028B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010+\u001a\u0004\b1\u0010-R\u001d\u00105\u001a\u00020\u00028B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b3\u0010+\u001a\u0004\b4\u0010-R\u001d\u00108\u001a\u00020\u00028B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b6\u0010+\u001a\u0004\b7\u0010-R\u0016\u0010;\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u001d\u0010=\u001a\u00020\u00028B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010+\u001a\u0004\b<\u0010-R\u001d\u0010@\u001a\u00020\u00028B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b>\u0010+\u001a\u0004\b?\u0010-R\u001d\u0010C\u001a\u00020\u00028B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bA\u0010+\u001a\u0004\bB\u0010-R\u001d\u0010F\u001a\u00020\u00028B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bD\u0010+\u001a\u0004\bE\u0010-R\u001d\u0010I\u001a\u00020\u00028B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bG\u0010+\u001a\u0004\bH\u0010-R\u001d\u0010L\u001a\u00020\u00028B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bJ\u0010+\u001a\u0004\bK\u0010-R\u001d\u0010O\u001a\u00020\u00028B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bM\u0010+\u001a\u0004\bN\u0010-R\u0016\u0010Q\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010:R\u0016\u0010T\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010SR\u0016\u0010V\u001a\u00020\u00028\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\bU\u0010:R\u0016\u0010X\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bW\u0010:R\u0016\u0010Z\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bY\u0010:R\u0016\u0010\\\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b[\u0010:R\u0016\u0010_\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b]\u0010^R\u0016\u0010c\u001a\u00020`8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\ba\u0010bR\u0016\u0010e\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010dR\u0018\u0010i\u001a\u0004\u0018\u00010f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bg\u0010hR\u0018\u0010k\u001a\u0004\u0018\u00010f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bj\u0010hR\u0018\u0010m\u001a\u0004\u0018\u00010f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bl\u0010hR\u0018\u0010o\u001a\u0004\u0018\u00010f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bn\u0010hR\u0018\u0010q\u001a\u0004\u0018\u00010f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bp\u0010hR\u0018\u0010s\u001a\u0004\u0018\u00010f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\br\u0010h¨\u0006{"}, d2 = {"Lcom/huami/sky/ui/view/WeekPlanProcessView;", "Landroidx/appcompat/widget/AppCompatTextView;", "", "getCustomHeight", ViewHierarchyConstants.DIMENSION_WIDTH_KEY, "height", "", "c", "Landroid/graphics/Canvas;", "canvas", "Landroid/graphics/RectF;", "tempRectF", "curPosition", "a", "color", "", "textSize", "Landroid/graphics/Paint$Style;", "paintStyle", "strokeWidth", GoogleApiAvailabilityLight.a, "Landroid/graphics/Paint;", "paint", "rectF", "b", "onDetachedFromWindow", "w", "h", "oldw", "oldh", "onSizeChanged", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "process", "setProgress", "", "doneArray", "setDoneArray", "onDraw", "", "Ljava/lang/CharSequence;", "todayStr", "Lkotlin/Lazy;", "getWhite20Color", "()I", "white20Color", "getWhite33Color", "white33Color", "getBlackColor", "blackColor", "e", "getB2Color", "b2Color", "f", "getD6Color", "d6Color", "g", LogUtil.I, "mImageHeight", "getSize2", "size2", "i", "getSize4", "size4", z.j, "getSize6", "size6", hl.k, "getSize8", "size8", "l", "getSize10", "size10", "m", "getSize14", "size14", GoogleApiAvailabilityLight.b, "getSize16", "size16", "o", "currProgress", com.google.android.exoplayer2.text.ttml.b.r, "[Z", "currArray", DTransferConstants.SEARCH_KEY, "MAX_PROGRESS", "r", "widthInterval", SOAP.XMLNS, "mHeight", "t", "mWidth", "u", "Landroid/graphics/Paint;", "imgPaint", "Landroid/text/TextPaint;", "v", "Landroid/text/TextPaint;", "textPaint", "Landroid/graphics/RectF;", "mRectF", "Landroid/graphics/Bitmap;", "x", "Landroid/graphics/Bitmap;", "midIconSvg", "y", "leftIconSvg", "z", "curIcon", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "curIconSnap", "B", "doneIconSvg", "C", "dashIcon", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "sky-ui_release"}, k = 1, mv = {1, 5, 1})
public final class WeekPlanProcessView extends AppCompatTextView {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @Nullable
    private Bitmap curIconSnap;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    @Nullable
    private Bitmap doneIconSvg;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    @Nullable
    private Bitmap dashIcon;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private CharSequence todayStr;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy white20Color;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Lazy white33Color;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Lazy blackColor;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final Lazy b2Color;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final Lazy d6Color;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private int mImageHeight;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final Lazy size2;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private final Lazy size4;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    private final Lazy size6;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    private final Lazy size8;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    private final Lazy size10;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    private final Lazy size14;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @NotNull
    private final Lazy size16;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private int currProgress;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @NotNull
    private boolean[] currArray;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private final int MAX_PROGRESS;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private int widthInterval;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private int mHeight;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    private int mWidth;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    @NotNull
    private Paint imgPaint;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    @NotNull
    private TextPaint textPaint;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    @NotNull
    private RectF mRectF;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    @Nullable
    private Bitmap midIconSvg;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    @Nullable
    private Bitmap leftIconSvg;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    @Nullable
    private Bitmap curIcon;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\b\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<Integer> {
        public final /* synthetic */ Context a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context) {
            super(0);
            this.a = context;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Integer invoke() {
            return Integer.valueOf(invoke2());
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final int invoke2() {
            return ContextCompat.getColor(this.a, R.color.weekplan_b2);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\b\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<Integer> {
        public final /* synthetic */ Context a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Context context) {
            super(0);
            this.a = context;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Integer invoke() {
            return Integer.valueOf(invoke2());
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final int invoke2() {
            return ContextCompat.getColor(this.a, R.color.weekplan_black);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\b\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<Integer> {
        public final /* synthetic */ Context a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Context context) {
            super(0);
            this.a = context;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Integer invoke() {
            return Integer.valueOf(invoke2());
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final int invoke2() {
            return ExtFuncKt.addAlpha(ContextCompat.getColor(this.a, R.color.weekplan_d6), 0.9d);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\b\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<Integer> {
        public static final d a = new d();

        public d() {
            super(0);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final int invoke2() {
            return NumberExtKt.getDp(10);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Integer invoke() {
            return Integer.valueOf(invoke2());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\b\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<Integer> {
        public static final e a = new e();

        public e() {
            super(0);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final int invoke2() {
            return NumberExtKt.getDp(14);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Integer invoke() {
            return Integer.valueOf(invoke2());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\b\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<Integer> {
        public static final f a = new f();

        public f() {
            super(0);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final int invoke2() {
            return NumberExtKt.getDp(16);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Integer invoke() {
            return Integer.valueOf(invoke2());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\b\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function0<Integer> {
        public static final g a = new g();

        public g() {
            super(0);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final int invoke2() {
            return NumberExtKt.getDp(2);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Integer invoke() {
            return Integer.valueOf(invoke2());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\b\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class h extends Lambda implements Function0<Integer> {
        public static final h a = new h();

        public h() {
            super(0);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final int invoke2() {
            return NumberExtKt.getDp(4);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Integer invoke() {
            return Integer.valueOf(invoke2());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\b\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class i extends Lambda implements Function0<Integer> {
        public static final i a = new i();

        public i() {
            super(0);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final int invoke2() {
            return NumberExtKt.getDp(6);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Integer invoke() {
            return Integer.valueOf(invoke2());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\b\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class j extends Lambda implements Function0<Integer> {
        public static final j a = new j();

        public j() {
            super(0);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final int invoke2() {
            return NumberExtKt.getDp(8);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Integer invoke() {
            return Integer.valueOf(invoke2());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\b\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class k extends Lambda implements Function0<Integer> {
        public final /* synthetic */ Context a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(Context context) {
            super(0);
            this.a = context;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Integer invoke() {
            return Integer.valueOf(invoke2());
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final int invoke2() {
            return ExtFuncKt.addAlpha(ContextCompat.getColor(this.a, R.color.white100), 0.2d);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\b\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class l extends Lambda implements Function0<Integer> {
        public final /* synthetic */ Context a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(Context context) {
            super(0);
            this.a = context;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Integer invoke() {
            return Integer.valueOf(invoke2());
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final int invoke2() {
            return ContextCompat.getColor(this.a, R.color.white_33);
        }
    }

    @JvmOverloads
    public WeekPlanProcessView(@NotNull Context context) {
        this(context, null, 0, 6, null);
    }

    @JvmOverloads
    public WeekPlanProcessView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ WeekPlanProcessView(Context context, AttributeSet attributeSet, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i2);
    }

    private final void a(Canvas canvas, RectF tempRectF, int curPosition) {
        int i2 = this.currProgress;
        boolean z = false;
        if (curPosition < i2) {
            if (curPosition == 0) {
                Bitmap bitmap = this.leftIconSvg;
                if (bitmap != null) {
                    canvas.drawBitmap(bitmap, (Rect) null, tempRectF, this.imgPaint);
                }
            } else {
                Bitmap bitmap2 = this.midIconSvg;
                if (bitmap2 != null) {
                    canvas.drawBitmap(bitmap2, (Rect) null, tempRectF, this.imgPaint);
                }
            }
            boolean[] zArr = this.currArray;
            if (curPosition >= 0 && curPosition <= ArraysKt___ArraysKt.getLastIndex(zArr)) {
                z = zArr[curPosition];
            }
            if (!z) {
                e(this, getBlackColor(), 0.0f, null, 0.0f, 14, null);
                canvas.drawText(String.valueOf(curPosition + 1), tempRectF.centerX(), b(this.textPaint, tempRectF), this.textPaint);
                return;
            }
            this.mRectF.set(tempRectF.centerX() - ((this.mImageHeight - getSize8()) / 2), tempRectF.centerY() - ((this.mImageHeight - getSize8()) / 2), tempRectF.centerX() + ((this.mImageHeight - getSize8()) / 2), tempRectF.centerY() + ((this.mImageHeight - getSize8()) / 2));
            Bitmap bitmap3 = this.doneIconSvg;
            if (bitmap3 == null) {
                return;
            }
            canvas.drawBitmap(bitmap3, (Rect) null, this.mRectF, this.imgPaint);
            return;
        }
        if (curPosition != i2) {
            e(this, getWhite33Color(), 0.0f, Paint.Style.STROKE, getSize2(), 2, null);
            canvas.drawCircle(tempRectF.centerX(), tempRectF.centerY(), (this.mImageHeight - getSize4()) / 2, this.textPaint);
            e(this, getWhite20Color(), 0.0f, null, 0.0f, 14, null);
            canvas.drawText(String.valueOf(curPosition + 1), tempRectF.centerX(), b(this.textPaint, tempRectF), this.textPaint);
            Bitmap bitmap4 = this.dashIcon;
            if (bitmap4 == null) {
                return;
            }
            this.mRectF.set((tempRectF.centerX() - (this.mImageHeight / 2)) - (this.widthInterval / 3), tempRectF.centerY() - NumberExtKt.getDp(1), tempRectF.centerX() - (this.mImageHeight / 2), tempRectF.centerY() + NumberExtKt.getDp(1));
            canvas.drawBitmap(bitmap4, (Rect) null, this.mRectF, this.imgPaint);
            return;
        }
        if (i2 == 0) {
            Bitmap bitmap5 = this.curIconSnap;
            if (bitmap5 != null) {
                this.mRectF.set(tempRectF.centerX() - (bitmap5.getWidth() / 2), tempRectF.top, tempRectF.centerX() + (bitmap5.getWidth() / 2), tempRectF.bottom);
                canvas.drawBitmap(bitmap5, (Rect) null, this.mRectF, this.imgPaint);
            }
        } else {
            Bitmap bitmap6 = this.curIcon;
            if (bitmap6 != null) {
                canvas.drawBitmap(bitmap6, (Rect) null, tempRectF, this.imgPaint);
            }
        }
        boolean[] zArr2 = this.currArray;
        if (curPosition >= 0 && curPosition <= ArraysKt___ArraysKt.getLastIndex(zArr2)) {
            z = zArr2[curPosition];
        }
        if (z) {
            this.mRectF.set(tempRectF.centerX() - ((this.mImageHeight - getSize8()) / 2), tempRectF.centerY() - ((this.mImageHeight - getSize8()) / 2), tempRectF.centerX() + ((this.mImageHeight - getSize8()) / 2), tempRectF.centerY() + ((this.mImageHeight - getSize8()) / 2));
            Bitmap bitmap7 = this.doneIconSvg;
            if (bitmap7 != null) {
                canvas.drawBitmap(bitmap7, (Rect) null, this.mRectF, this.imgPaint);
            }
        } else {
            e(this, getB2Color(), 0.0f, null, 0.0f, 14, null);
            canvas.drawCircle(tempRectF.centerX(), tempRectF.centerY(), (this.mImageHeight - getSize8()) / 2, this.textPaint);
            e(this, getBlackColor(), 0.0f, null, 0.0f, 14, null);
            canvas.drawText(String.valueOf(curPosition + 1), tempRectF.centerX(), b(this.textPaint, tempRectF), this.textPaint);
        }
        CharSequence charSequence = this.todayStr;
        if (charSequence == null) {
            return;
        }
        this.mRectF.set(tempRectF.left, tempRectF.bottom + getSize6(), tempRectF.right, tempRectF.bottom + getSize6() + getSize14());
        e(this, getD6Color(), getSize10(), null, 0.0f, 12, null);
        canvas.drawText(charSequence.toString(), tempRectF.centerX(), b(this.textPaint, this.mRectF), this.textPaint);
    }

    private final float b(Paint paint, RectF rectF) {
        Paint.FontMetrics fontMetrics = paint.getFontMetrics();
        float f2 = fontMetrics.bottom;
        return rectF.centerY() + (((f2 - fontMetrics.top) / 2) - f2);
    }

    private final void c(int width, int height) {
        this.mHeight = height;
        this.mWidth = width;
        int i2 = width / this.MAX_PROGRESS;
        this.widthInterval = i2;
        this.mImageHeight = (int) ((i2 / 3) * 2);
        this.curIcon = ExtFuncKt.obtainBitmap(getContext(), this.widthInterval, R.drawable.ic_weekplan_process_cur);
        this.curIconSnap = ExtFuncKt.obtainBitmap(getContext(), this.mImageHeight, R.drawable.ic_weekplan_process_cur_snop);
        this.midIconSvg = ExtFuncKt.getBitmapFromSVG(getContext(), R.drawable.ic_weekplan_process_mid);
        this.leftIconSvg = ExtFuncKt.getBitmapFromSVG(getContext(), R.drawable.ic_weekplan_process_left);
        this.doneIconSvg = ExtFuncKt.getBitmapFromSVG(getContext(), R.drawable.ic_weekplan_progress_done);
        this.dashIcon = ExtFuncKt.obtainBitmap(getContext(), this.widthInterval / 3, R.drawable.ic_weekplan_process_dash);
    }

    private final void d(@ColorInt int color, float textSize, Paint.Style paintStyle, float strokeWidth) {
        TextPaint textPaint = this.textPaint;
        textPaint.reset();
        textPaint.setTextAlign(Paint.Align.CENTER);
        textPaint.setAntiAlias(true);
        textPaint.setTypeface(Typeface.DEFAULT_BOLD);
        textPaint.setColor(color);
        textPaint.setTextSize(textSize);
        textPaint.setStyle(paintStyle);
        textPaint.setStrokeWidth(strokeWidth);
    }

    public static /* synthetic */ void e(WeekPlanProcessView weekPlanProcessView, int i2, float f2, Paint.Style style, float f3, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            f2 = weekPlanProcessView.getSize14();
        }
        if ((i3 & 4) != 0) {
            style = Paint.Style.FILL_AND_STROKE;
        }
        if ((i3 & 8) != 0) {
            f3 = 0.0f;
        }
        weekPlanProcessView.d(i2, f2, style, f3);
    }

    private final int getB2Color() {
        return ((Number) this.b2Color.getValue()).intValue();
    }

    private final int getBlackColor() {
        return ((Number) this.blackColor.getValue()).intValue();
    }

    private final int getCustomHeight() {
        return this.mImageHeight + getPaddingBottom() + (this.todayStr == null ? 0 : getSize6() + getSize14());
    }

    private final int getD6Color() {
        return ((Number) this.d6Color.getValue()).intValue();
    }

    private final int getSize10() {
        return ((Number) this.size10.getValue()).intValue();
    }

    private final int getSize14() {
        return ((Number) this.size14.getValue()).intValue();
    }

    private final int getSize16() {
        return ((Number) this.size16.getValue()).intValue();
    }

    private final int getSize2() {
        return ((Number) this.size2.getValue()).intValue();
    }

    private final int getSize4() {
        return ((Number) this.size4.getValue()).intValue();
    }

    private final int getSize6() {
        return ((Number) this.size6.getValue()).intValue();
    }

    private final int getSize8() {
        return ((Number) this.size8.getValue()).intValue();
    }

    private final int getWhite20Color() {
        return ((Number) this.white20Color.getValue()).intValue();
    }

    private final int getWhite33Color() {
        return ((Number) this.white33Color.getValue()).intValue();
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Bitmap bitmap = this.midIconSvg;
        if (bitmap != null) {
            bitmap.recycle();
        }
        Bitmap bitmap2 = this.curIcon;
        if (bitmap2 != null) {
            bitmap2.recycle();
        }
        Bitmap bitmap3 = this.curIconSnap;
        if (bitmap3 != null) {
            bitmap3.recycle();
        }
        Bitmap bitmap4 = this.doneIconSvg;
        if (bitmap4 != null) {
            bitmap4.recycle();
        }
        Bitmap bitmap5 = this.leftIconSvg;
        if (bitmap5 == null) {
            return;
        }
        bitmap5.recycle();
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        super.onDraw(canvas);
        int i2 = this.MAX_PROGRESS;
        if (i2 <= 0) {
            return;
        }
        int i3 = 0;
        while (true) {
            int i4 = i3 + 1;
            RectF rectF = this.mRectF;
            int i5 = this.widthInterval;
            rectF.set(i3 * i5, 0.0f, i4 * i5, this.mImageHeight);
            a(canvas, this.mRectF, i3);
            if (i4 >= i2) {
                return;
            } else {
                i3 = i4;
            }
        }
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        int size = View.MeasureSpec.getSize(widthMeasureSpec);
        int size2 = View.MeasureSpec.getSize(heightMeasureSpec);
        c(getMeasuredWidth(), getMeasuredHeight());
        if (getLayoutParams().width == -2 && getLayoutParams().height == -2) {
            setMeasuredDimension(this.mWidth, this.mHeight);
        } else if (getLayoutParams().width == -2) {
            setMeasuredDimension(this.mWidth, size2);
        } else if (getLayoutParams().height == -2) {
            setMeasuredDimension(size, getCustomHeight());
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int w, int h2, int oldw, int oldh) {
        super.onSizeChanged(w, h2, oldw, oldh);
        c(w, h2);
    }

    public final void setDoneArray(@NotNull boolean[] doneArray) {
        this.currArray = doneArray;
        invalidate();
    }

    public final void setProgress(int process) {
        this.currProgress = process % this.MAX_PROGRESS;
        invalidate();
    }

    @JvmOverloads
    public WeekPlanProcessView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.white20Color = LazyKt__LazyJVMKt.lazy(new k(context));
        this.white33Color = LazyKt__LazyJVMKt.lazy(new l(context));
        this.blackColor = LazyKt__LazyJVMKt.lazy(new b(context));
        this.b2Color = LazyKt__LazyJVMKt.lazy(new a(context));
        this.d6Color = LazyKt__LazyJVMKt.lazy(new c(context));
        this.size2 = LazyKt__LazyJVMKt.lazy(g.a);
        this.size4 = LazyKt__LazyJVMKt.lazy(h.a);
        this.size6 = LazyKt__LazyJVMKt.lazy(i.a);
        this.size8 = LazyKt__LazyJVMKt.lazy(j.a);
        this.size10 = LazyKt__LazyJVMKt.lazy(d.a);
        this.size14 = LazyKt__LazyJVMKt.lazy(e.a);
        this.size16 = LazyKt__LazyJVMKt.lazy(f.a);
        this.currArray = new boolean[]{false, false, false, false, false, false, false};
        this.MAX_PROGRESS = 7;
        this.mHeight = 400;
        this.mWidth = 400;
        this.mRectF = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.WeekPlanProcessView, i2, 0);
        try {
            this.currProgress = typedArrayObtainStyledAttributes.getInt(R.styleable.WeekPlanProcessView_weekViewProcess, 0) % 7;
            this.todayStr = typedArrayObtainStyledAttributes.getText(R.styleable.WeekPlanProcessView_weekViewToday);
            typedArrayObtainStyledAttributes.recycle();
            Paint paint = new Paint();
            paint.setFlags(1);
            paint.setAntiAlias(true);
            paint.setFilterBitmap(true);
            Unit unit = Unit.INSTANCE;
            this.imgPaint = paint;
            TextPaint textPaint = new TextPaint();
            textPaint.setTextAlign(Paint.Align.CENTER);
            textPaint.setAntiAlias(true);
            textPaint.setTypeface(Typeface.DEFAULT_BOLD);
            textPaint.setStyle(Paint.Style.FILL_AND_STROKE);
            textPaint.setStrokeWidth(0.0f);
            this.textPaint = textPaint;
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }
}

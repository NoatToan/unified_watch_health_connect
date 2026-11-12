package com.huami.sleepassistant.lib.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.WindowManager;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.exifinterface.media.ExifInterface;
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.exoplayer2.text.ttml.b;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.sleepassistant.lib.R;
import com.huami.tools.analytics.DbUtils;
import com.loc.z;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.e;
import org.cybergarage.soap.SOAP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0003pqrB'\b\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010l\u001a\u0004\u0018\u00010k\u0012\b\b\u0002\u0010m\u001a\u00020\r¢\u0006\u0004\bn\u0010oJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\b\u001a\u00020\u0004H\u0002J\u0018\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0002J\b\u0010\u000f\u001a\u00020\u0004H\u0002J\b\u0010\u0010\u001a\u00020\u0004H\u0002J\b\u0010\u0011\u001a\u00020\u0004H\u0002J\u0010\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u000bH\u0002J\u0018\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u000bH\u0002J\u0018\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u000bH\u0002J\u0006\u0010\u0018\u001a\u00020\u0004J\b\u0010\u0019\u001a\u00020\u0004H\u0014J\b\u0010\u001a\u001a\u00020\u0004H\u0014J\u0006\u0010\u001b\u001a\u00020\u0004J\u000e\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\rJ\u000e\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\rJ\u0006\u0010\u001f\u001a\u00020\u0004J\u0012\u0010 \u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\u000e\u0010#\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020!J\u000e\u0010&\u001a\u00020\u00042\u0006\u0010%\u001a\u00020$R\u0016\u0010(\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010'R\u0016\u0010)\u001a\u00020\r8\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0007\u0010'R\u0016\u0010+\u001a\u00020\u000b8\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0006\u0010*R\u0016\u0010,\u001a\u00020\r8\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0005\u0010'R\u0018\u0010/\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010.R\u0016\u00100\u001a\u00020-8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0017\u0010.R\u0018\u00103\u001a\u0004\u0018\u0001018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u00102R\u0016\u00104\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010*R\u0018\u00107\u001a\u0004\u0018\u0001058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u00106R\u001c\u0010;\u001a\b\u0012\u0004\u0012\u000209088\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010:R\u0016\u0010>\u001a\u00020<8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010=R\u0016\u0010@\u001a\u00020\r8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010'R\u0016\u0010B\u001a\u00020\r8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010'R\u0016\u0010D\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010*R\u0016\u0010F\u001a\u00020\r8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010'R\u0016\u0010H\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010*R\u0018\u0010L\u001a\u0004\u0018\u00010I8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010KR\u0016\u0010N\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010'R\u0016\u0010P\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010'R\u0016\u0010R\u001a\u00020\u000b8\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\bQ\u0010*R\u0016\u0010V\u001a\u00020S8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010UR\u0016\u0010X\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bW\u0010*R\u0016\u0010Z\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bY\u0010*R\u0016\u0010[\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010*R\u0016\u0010\\\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010*R\u0016\u0010^\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b]\u0010*R\u0016\u0010`\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b_\u0010*R\u0016\u0010b\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\ba\u0010*R\u0016\u0010d\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bc\u0010*R\u0016\u0010g\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\be\u0010fR\u0018\u0010j\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bh\u0010i¨\u0006s"}, d2 = {"Lcom/huami/sleepassistant/lib/widget/BubbleMaskView;", "Landroid/view/View;", "Landroid/graphics/Canvas;", "canvas", "", GoogleApiAvailabilityLight.a, "c", "b", "i", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "spValue", "", "h", hl.k, "g", z.j, "dpValue", "a", "x", "y", "e", "f", "initBubble", "onAttachedToWindow", "onDetachedFromWindow", "startStatusSync", "time", "startBigSync", "startSmallSync", "clearBubble", "onDraw", "", "isPause", "pauseBubbleView", "Lcom/huami/sleepassistant/lib/widget/BubbleMaskView$AlphaChangeCallback;", "callback", "setAlphaChangeCallback", LogUtil.I, "mBubbleMaxSize", "mBubbleRefreshTime", "F", "mBubbleMaxSpeed", "mBubbleAlpha", "Landroid/graphics/Paint;", "Landroid/graphics/Paint;", "mBubblePaint", "mPaint", "Landroid/graphics/RectF;", "Landroid/graphics/RectF;", "mWaterRectF", "speed", "Lkotlinx/coroutines/Job;", "Lkotlinx/coroutines/Job;", "job", "", "Lcom/huami/sleepassistant/lib/widget/BubbleMaskView$Bubble;", "Ljava/util/List;", "mBubbles", "Ljava/util/Random;", "Ljava/util/Random;", "random", "l", "screenWidth", "m", "screenHeight", GoogleApiAvailabilityLight.b, "threshold", "o", "difference", b.r, "rotate", "Landroid/graphics/Rect;", DTransferConstants.SEARCH_KEY, "Landroid/graphics/Rect;", "dst", "r", "maxThreshold", SOAP.XMLNS, "minThreshold", "t", "topCoefficient", "Lcom/huami/sleepassistant/lib/widget/BubbleMaskView$IsADD;", "u", "Lcom/huami/sleepassistant/lib/widget/BubbleMaskView$IsADD;", "isAdd", "v", "maxAlpha", "w", "minAlpha", "bgAlpha", "differenceScale", "z", "differenceAlphas", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "differenceSpeed", "B", "actualMaxThreshold", "C", "actualMaxAlpha", LogUtil.D, "Z", "mIsPause", "E", "Lcom/huami/sleepassistant/lib/widget/BubbleMaskView$AlphaChangeCallback;", "mAlphaCallback", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "AlphaChangeCallback", "Bubble", "IsADD", "lib_release"}, k = 1, mv = {1, 5, 1})
public final class BubbleMaskView extends View {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private float differenceSpeed;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    private float actualMaxThreshold;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    private float actualMaxAlpha;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    private boolean mIsPause;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    @Nullable
    private AlphaChangeCallback mAlphaCallback;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private int mBubbleMaxSize;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int mBubbleRefreshTime;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final float mBubbleMaxSpeed;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final int mBubbleAlpha;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    private Paint mBubblePaint;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private Paint mPaint;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    private RectF mWaterRectF;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private float speed;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    private Job job;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    private final List<Bubble> mBubbles;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    private final Random random;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final int screenWidth;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final int screenHeight;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private float threshold;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private final int difference;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private float rotate;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    @Nullable
    private Rect dst;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private int maxThreshold;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private int minThreshold;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    private final float topCoefficient;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    @NotNull
    private IsADD isAdd;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    private float maxAlpha;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private float minAlpha;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private float bgAlpha;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private float differenceScale;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private float differenceAlphas;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, d2 = {"Lcom/huami/sleepassistant/lib/widget/BubbleMaskView$AlphaChangeCallback;", "", "", "alpha", "", "alphaChange", "lib_release"}, k = 1, mv = {1, 5, 1})
    public interface AlphaChangeCallback {
        void alphaChange(float alpha);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/huami/sleepassistant/lib/widget/BubbleMaskView$IsADD;", "", "<init>", "(Ljava/lang/String;I)V", "ADD", "PAUSE", "BACK", "NO_BUBBLE", "lib_release"}, k = 1, mv = {1, 5, 1})
    public enum IsADD {
        ADD,
        PAUSE,
        BACK,
        NO_BUBBLE
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[IsADD.values().length];
            iArr[IsADD.BACK.ordinal()] = 1;
            iArr[IsADD.ADD.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.sleepassistant.lib.widget.BubbleMaskView$startBubbleSync$1", f = "BubbleMaskView.kt", i = {}, l = {TypedValues.AttributesType.TYPE_EASING, 323}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return BubbleMaskView.this.new a(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i != 0 && i != 1 && i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            while (true) {
                if (BubbleMaskView.this.mIsPause) {
                    long j = BubbleMaskView.this.mBubbleRefreshTime;
                    this.a = 1;
                    if (DelayKt.delay(j, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    BubbleMaskView.this.k();
                    BubbleMaskView.this.g();
                    BubbleMaskView.this.postInvalidate();
                    long j2 = BubbleMaskView.this.mBubbleRefreshTime;
                    this.a = 2;
                    if (DelayKt.delay(j2, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            }
        }
    }

    @JvmOverloads
    public BubbleMaskView(@NotNull Context context) {
        this(context, null, 0, 6, null);
    }

    @JvmOverloads
    public BubbleMaskView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ BubbleMaskView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    private final float a(float dpValue) {
        return TypedValue.applyDimension(1, dpValue, getResources().getDisplayMetrics());
    }

    private final void b(Canvas canvas) {
        IsADD isADD = this.isAdd;
        if (isADD == IsADD.ADD) {
            float f = this.threshold - this.differenceScale;
            this.threshold = f;
            int i = this.maxThreshold;
            if (f < i) {
                this.threshold = i;
            }
            float f2 = this.bgAlpha - this.differenceAlphas;
            this.bgAlpha = f2;
            if (f2 < 0.7f) {
                this.bgAlpha = 0.7f;
            }
            AlphaChangeCallback alphaChangeCallback = this.mAlphaCallback;
            if (alphaChangeCallback != null) {
                alphaChangeCallback.alphaChange(this.bgAlpha);
            }
            this.speed -= this.differenceSpeed;
        } else if (isADD == IsADD.BACK) {
            float f3 = this.threshold + this.differenceScale;
            this.threshold = f3;
            int i2 = this.minThreshold;
            if (f3 > i2) {
                this.threshold = i2;
            }
            float f4 = this.bgAlpha + this.differenceAlphas;
            this.bgAlpha = f4;
            float f5 = this.maxAlpha;
            if (f4 > f5) {
                this.bgAlpha = f5;
            }
            AlphaChangeCallback alphaChangeCallback2 = this.mAlphaCallback;
            if (alphaChangeCallback2 != null) {
                alphaChangeCallback2.alphaChange(this.bgAlpha);
            }
            this.speed += this.differenceSpeed;
        }
        Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(getResources(), R.drawable.sls_breathe_line);
        Rect rect = new Rect(0, 0, bitmapDecodeResource.getWidth(), bitmapDecodeResource.getHeight());
        float f6 = this.threshold;
        int i3 = this.difference;
        this.dst = new Rect((int) f6, ((int) f6) + i3, this.screenWidth - ((int) f6), (((int) (this.screenHeight * this.topCoefficient)) - i3) - ((int) f6));
        Matrix matrix = new Matrix();
        float f7 = this.rotate + 1.0f;
        this.rotate = f7;
        matrix.setRotate(f7, this.screenWidth / 2, ((int) (this.screenHeight * this.topCoefficient)) / 2);
        canvas.setMatrix(matrix);
        Rect rect2 = this.dst;
        Objects.requireNonNull(rect2, "null cannot be cast to non-null type android.graphics.Rect");
        canvas.drawBitmap(bitmapDecodeResource, rect, rect2, (Paint) null);
    }

    private final void c(Canvas canvas) {
        for (Bubble bubble : new ArrayList(this.mBubbles)) {
            if (bubble != null) {
                canvas.drawCircle(bubble.getX(), bubble.getY(), bubble.getRadius(), this.mBubblePaint);
            }
        }
    }

    private final void d(Canvas canvas) {
        String string;
        int i = WhenMappings.$EnumSwitchMapping$0[this.isAdd.ordinal()];
        if (i != 1) {
            string = i != 2 ? getContext().getString(R.string.sls_hold_your_breath) : getContext().getString(R.string.sls_training_card_title1);
        } else {
            string = getContext().getString(R.string.sls_training_card_title2);
        }
        Paint paint = this.mPaint;
        Objects.requireNonNull(paint);
        float fMeasureText = this.screenWidth - paint.measureText(string);
        float f = 2;
        float f2 = fMeasureText / f;
        Paint paint2 = this.mPaint;
        Objects.requireNonNull(paint2);
        Paint.FontMetrics fontMetrics = paint2.getFontMetrics();
        float fAbs = (((int) (this.screenHeight * this.topCoefficient)) / 2) + ((Math.abs(fontMetrics.ascent) - fontMetrics.descent) / f);
        Paint paint3 = this.mPaint;
        Objects.requireNonNull(paint3);
        canvas.drawText(string, f2, fAbs, paint3);
    }

    private final float e(float x, float y) {
        return Math.abs(((this.screenHeight * this.topCoefficient) / 2) - y) / Math.abs((this.screenWidth / 2) - x);
    }

    private final float f(float x, float y) {
        return Math.abs((this.screenWidth / 2) - x) / Math.abs(((this.screenHeight * this.topCoefficient) / 2) - y);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g() {
        for (Bubble bubble : new ArrayList(this.mBubbles)) {
            int iIndexOf = this.mBubbles.indexOf(bubble);
            bubble.setX(bubble.getX() + bubble.getSpeedX());
            bubble.setY(bubble.getY() - bubble.getSpeedY());
            this.mBubbles.set(iIndexOf, bubble);
            if (bubble.getY() - bubble.getSpeedY() >= this.mWaterRectF.top + bubble.getRadius()) {
                this.mBubbles.remove(bubble);
            }
            if (bubble.getY() - bubble.getSpeedY() <= this.mWaterRectF.bottom + bubble.getRadius()) {
                this.mBubbles.remove(bubble);
            }
            if (bubble.getX() + bubble.getSpeedX() <= this.mWaterRectF.left + bubble.getRadius()) {
                this.mBubbles.remove(bubble);
            }
            if (bubble.getX() + bubble.getSpeedX() >= this.mWaterRectF.right - bubble.getRadius()) {
                this.mBubbles.remove(bubble);
            }
            if (new RectF(this.dst).contains(bubble.getX(), bubble.getY())) {
                this.mBubbles.remove(bubble);
            }
        }
    }

    private final int h(Context context, float spValue) {
        return (int) ((spValue * context.getResources().getDisplayMetrics().scaledDensity) + 0.5f);
    }

    private final void i() {
        this.job = e.f(GlobalScope.INSTANCE, Dispatchers.getMain(), null, new a(null), 2, null);
    }

    private final void j() {
        Job job = this.job;
        if (job == null) {
            return;
        }
        Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void k() {
        if (this.mBubbles.size() < this.mBubbleMaxSize && this.random.nextFloat() >= this.speed && this.dst != null) {
            Bubble bubble = new Bubble(0, 0.0f, 0.0f, 0.0f, 0.0f, 31, null);
            bubble.setRadius((int) a(2.5f));
            boolean zNextBoolean = this.random.nextBoolean();
            boolean zNextBoolean2 = this.random.nextBoolean();
            IsADD isADD = this.isAdd;
            if (isADD == IsADD.ADD) {
                if (zNextBoolean) {
                    float fNextFloat = this.random.nextFloat();
                    bubble.setX(this.screenWidth * fNextFloat);
                    if (fNextFloat - 0.5f > 0.0f) {
                        bubble.setSpeedX(-this.mBubbleMaxSpeed);
                    } else {
                        bubble.setSpeedX(this.mBubbleMaxSpeed);
                    }
                    if (zNextBoolean2) {
                        bubble.setY(10.0f);
                        bubble.setSpeedY((-this.mBubbleMaxSpeed) * e(bubble.getX(), bubble.getY()));
                    } else {
                        bubble.setY(this.screenHeight - 10.0f);
                        bubble.setSpeedY(this.mBubbleMaxSpeed * e(bubble.getX(), bubble.getY()));
                    }
                } else {
                    float fNextFloat2 = this.random.nextFloat();
                    bubble.setY(this.screenHeight * fNextFloat2);
                    if (fNextFloat2 - 0.5f > 0.0f) {
                        bubble.setSpeedY(this.mBubbleMaxSpeed);
                    } else {
                        bubble.setSpeedY(-this.mBubbleMaxSpeed);
                    }
                    if (zNextBoolean2) {
                        bubble.setX(10.0f);
                        bubble.setSpeedX(this.mBubbleMaxSpeed * f(bubble.getX(), bubble.getY()));
                    } else {
                        bubble.setX(this.screenWidth - 10.0f);
                        bubble.setSpeedX((-this.mBubbleMaxSpeed) * f(bubble.getX(), bubble.getY()));
                    }
                }
            } else {
                if (isADD != IsADD.BACK) {
                    return;
                }
                if (zNextBoolean) {
                    float fNextFloat3 = this.random.nextFloat();
                    Rect rect = this.dst;
                    bubble.setX(((rect != null ? rect.width() : 0) * fNextFloat3) + this.dst.left);
                    if (fNextFloat3 - 0.5f > 0.0f) {
                        bubble.setSpeedX(this.mBubbleMaxSpeed);
                    } else {
                        bubble.setSpeedX(-this.mBubbleMaxSpeed);
                    }
                    if (zNextBoolean2) {
                        bubble.setY(this.dst.top - 10.0f);
                        bubble.setSpeedY(this.mBubbleMaxSpeed * e(bubble.getX(), bubble.getY()));
                    } else {
                        bubble.setY(this.dst.bottom + 10.0f);
                        bubble.setSpeedY((-this.mBubbleMaxSpeed) * e(bubble.getX(), bubble.getY()));
                    }
                } else {
                    float fNextFloat4 = this.random.nextFloat();
                    Rect rect2 = this.dst;
                    bubble.setY(((rect2 != null ? rect2.height() : 0) * fNextFloat4) + this.dst.top);
                    if (fNextFloat4 - 0.5f > 0.0f) {
                        bubble.setSpeedY(-this.mBubbleMaxSpeed);
                    } else {
                        bubble.setSpeedY(this.mBubbleMaxSpeed);
                    }
                    if (zNextBoolean2) {
                        bubble.setX(this.dst.left - 10.0f);
                        bubble.setSpeedX((-this.mBubbleMaxSpeed) * f(bubble.getX(), bubble.getY()));
                    } else {
                        bubble.setX(this.dst.right + 10.0f);
                        bubble.setSpeedX(this.mBubbleMaxSpeed * f(bubble.getX(), bubble.getY()));
                    }
                }
            }
            if (new RectF(this.dst).contains(bubble.getX(), bubble.getY())) {
                return;
            }
            this.mBubbles.add(bubble);
        }
    }

    public void _$_clearFindViewByIdCache() {
    }

    public final void clearBubble() {
        this.isAdd = IsADD.NO_BUBBLE;
    }

    public final void initBubble() {
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(-1);
        paint.setAlpha(this.mBubbleAlpha);
        Unit unit = Unit.INSTANCE;
        this.mBubblePaint = paint;
        Paint paint2 = new Paint(1);
        paint2.setAntiAlias(true);
        paint2.setColor(-1);
        paint2.setTextSize(h(getContext(), 25.0f));
        this.mPaint = paint2;
        int i = this.screenWidth;
        this.maxThreshold = ((int) (((double) i) * 0.2d)) / 2;
        int i2 = ((int) (((double) i) * 0.7d)) / 2;
        this.minThreshold = i2;
        this.threshold = i2;
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        i();
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        j();
    }

    @Override // android.view.View
    public void onDraw(@Nullable Canvas canvas) {
        super.onDraw(canvas);
        if (canvas != null) {
            d(canvas);
        }
        if (canvas != null) {
            c(canvas);
        }
        if (canvas != null) {
            b(canvas);
        }
    }

    public final void pauseBubbleView(boolean isPause) {
        this.mIsPause = isPause;
    }

    public final void setAlphaChangeCallback(@NotNull AlphaChangeCallback callback) {
        this.mAlphaCallback = callback;
    }

    public final void startBigSync(int time) {
        int i = this.minThreshold;
        this.actualMaxThreshold = i;
        float f = this.minAlpha;
        this.actualMaxAlpha = f;
        this.isAdd = IsADD.ADD;
        this.speed = 0.5f;
        int i2 = i - this.maxThreshold;
        float f2 = time / this.mBubbleRefreshTime;
        this.differenceScale = i2 / f2;
        this.differenceAlphas = (this.maxAlpha - f) / f2;
        this.differenceSpeed = 1.0f / f2;
        this.threshold = i;
    }

    public final void startSmallSync(int time) {
        float f = this.actualMaxThreshold;
        float f2 = this.threshold;
        if (f > f2) {
            this.actualMaxThreshold = f2;
        }
        float f3 = this.actualMaxAlpha;
        float f4 = this.bgAlpha;
        if (f3 < f4) {
            this.actualMaxAlpha = f4;
        }
        this.isAdd = IsADD.BACK;
        this.speed = 0.5f;
        int i = this.minThreshold - this.maxThreshold;
        float f5 = time / this.mBubbleRefreshTime;
        this.differenceScale = i / f5;
        this.differenceAlphas = (this.maxAlpha - this.minAlpha) / f5;
        this.bgAlpha = this.actualMaxAlpha;
        this.threshold = this.actualMaxThreshold;
    }

    public final void startStatusSync() {
        float f = this.actualMaxThreshold;
        float f2 = this.threshold;
        if (f > f2) {
            this.actualMaxThreshold = f2;
        }
        float f3 = this.actualMaxAlpha;
        float f4 = this.bgAlpha;
        if (f3 < f4) {
            this.actualMaxAlpha = f4;
        }
        this.isAdd = IsADD.PAUSE;
        this.bgAlpha = this.actualMaxAlpha;
        this.threshold = this.actualMaxThreshold;
    }

    @JvmOverloads
    public BubbleMaskView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mBubbleMaxSize = 20;
        this.mBubbleRefreshTime = 20;
        this.mBubbleMaxSpeed = 5.0f;
        this.mBubbleAlpha = 128;
        this.speed = 0.5f;
        this.mBubbles = new ArrayList();
        this.random = new Random();
        this.threshold = 100.0f;
        this.maxThreshold = 100;
        this.minThreshold = 300;
        this.topCoefficient = 0.8f;
        this.isAdd = IsADD.ADD;
        this.maxAlpha = 1.0f;
        this.bgAlpha = 1.0f;
        Object systemService = context.getSystemService("window");
        Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        WindowManager windowManager = (WindowManager) systemService;
        this.mWaterRectF = new RectF(0.0f, windowManager.getDefaultDisplay().getHeight(), windowManager.getDefaultDisplay().getWidth(), 0.0f);
        int width = windowManager.getDefaultDisplay().getWidth();
        this.screenWidth = width;
        int height = windowManager.getDefaultDisplay().getHeight();
        this.screenHeight = height;
        this.difference = (((int) (height * 0.8f)) - width) / 2;
        initBubble();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0019\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\f\u001a\u00020\u0004\u0012\b\b\u0002\u0010\r\u001a\u00020\u0004¢\u0006\u0004\b*\u0010+J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0004HÆ\u0003J\t\u0010\b\u001a\u00020\u0004HÆ\u0003J;\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u0004HÆ\u0001J\t\u0010\u0010\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\"\u0010\n\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\"\u0010\u000b\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\u001c\u001a\u0004\b\"\u0010\u001e\"\u0004\b#\u0010 R\"\u0010\f\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010\u001c\u001a\u0004\b%\u0010\u001e\"\u0004\b&\u0010 R\"\u0010\r\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010\u001c\u001a\u0004\b(\u0010\u001e\"\u0004\b)\u0010 ¨\u0006,"}, d2 = {"Lcom/huami/sleepassistant/lib/widget/BubbleMaskView$Bubble;", "", "", "component1", "", "component2", "component3", "component4", "component5", "radius", "speedY", "speedX", "x", "y", "copy", "", "toString", "hashCode", "other", "", "equals", "a", LogUtil.I, "getRadius", "()I", "setRadius", "(I)V", "b", "F", "getSpeedY", "()F", "setSpeedY", "(F)V", "c", "getSpeedX", "setSpeedX", GoogleApiAvailabilityLight.a, "getX", "setX", "e", "getY", "setY", "<init>", "(IFFFF)V", "lib_release"}, k = 1, mv = {1, 5, 1})
    public static final /* data */ class Bubble {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        private int radius;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        private float speedY;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
        private float speedX;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
        private float x;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
        private float y;

        public Bubble() {
            this(0, 0.0f, 0.0f, 0.0f, 0.0f, 31, null);
        }

        public Bubble(int i, float f, float f2, float f3, float f4) {
            this.radius = i;
            this.speedY = f;
            this.speedX = f2;
            this.x = f3;
            this.y = f4;
        }

        public static /* synthetic */ Bubble copy$default(Bubble bubble, int i, float f, float f2, float f3, float f4, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = bubble.radius;
            }
            if ((i2 & 2) != 0) {
                f = bubble.speedY;
            }
            float f5 = f;
            if ((i2 & 4) != 0) {
                f2 = bubble.speedX;
            }
            float f6 = f2;
            if ((i2 & 8) != 0) {
                f3 = bubble.x;
            }
            float f7 = f3;
            if ((i2 & 16) != 0) {
                f4 = bubble.y;
            }
            return bubble.copy(i, f5, f6, f7, f4);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getRadius() {
            return this.radius;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final float getSpeedY() {
            return this.speedY;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final float getSpeedX() {
            return this.speedX;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final float getX() {
            return this.x;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final float getY() {
            return this.y;
        }

        @NotNull
        public final Bubble copy(int radius, float speedY, float speedX, float x, float y) {
            return new Bubble(radius, speedY, speedX, x, y);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Bubble)) {
                return false;
            }
            Bubble bubble = (Bubble) other;
            return this.radius == bubble.radius && Intrinsics.areEqual((Object) Float.valueOf(this.speedY), (Object) Float.valueOf(bubble.speedY)) && Intrinsics.areEqual((Object) Float.valueOf(this.speedX), (Object) Float.valueOf(bubble.speedX)) && Intrinsics.areEqual((Object) Float.valueOf(this.x), (Object) Float.valueOf(bubble.x)) && Intrinsics.areEqual((Object) Float.valueOf(this.y), (Object) Float.valueOf(bubble.y));
        }

        public final int getRadius() {
            return this.radius;
        }

        public final float getSpeedX() {
            return this.speedX;
        }

        public final float getSpeedY() {
            return this.speedY;
        }

        public final float getX() {
            return this.x;
        }

        public final float getY() {
            return this.y;
        }

        public int hashCode() {
            return (((((((this.radius * 31) + Float.floatToIntBits(this.speedY)) * 31) + Float.floatToIntBits(this.speedX)) * 31) + Float.floatToIntBits(this.x)) * 31) + Float.floatToIntBits(this.y);
        }

        public final void setRadius(int i) {
            this.radius = i;
        }

        public final void setSpeedX(float f) {
            this.speedX = f;
        }

        public final void setSpeedY(float f) {
            this.speedY = f;
        }

        public final void setX(float f) {
            this.x = f;
        }

        public final void setY(float f) {
            this.y = f;
        }

        @NotNull
        public String toString() {
            return "Bubble(radius=" + this.radius + ", speedY=" + this.speedY + ", speedX=" + this.speedX + ", x=" + this.x + ", y=" + this.y + ')';
        }

        public /* synthetic */ Bubble(int i, float f, float f2, float f3, float f4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? 0.0f : f, (i2 & 4) != 0 ? 0.0f : f2, (i2 & 8) != 0 ? 0.0f : f3, (i2 & 16) == 0 ? f4 : 0.0f);
        }
    }
}

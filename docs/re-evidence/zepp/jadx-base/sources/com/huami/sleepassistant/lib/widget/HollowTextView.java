package com.huami.sleepassistant.lib.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.os.Build;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.sleepassistant.lib.R;
import com.huami.sleepassistant.lib.ui.base.ext.ViewExKt;
import com.huami.tools.analytics.DbUtils;
import com.loc.z;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010.\u001a\u00020-\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b/\u00100J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\b\u001a\u00020\u0006H\u0002J\u0012\u0010\u000b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002J(\u0010\u0010\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0004H\u0014J\u0010\u0010\u0011\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0014J\b\u0010\u0012\u001a\u00020\u0006H\u0007R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u0014R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u0014R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u0018R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u0018\u0010\u001e\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0018\u0010 \u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010\u001dR\u0018\u0010$\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010&\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010%R\u0016\u0010(\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010%R\u0018\u0010,\u001a\u0004\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+¨\u00061"}, d2 = {"Lcom/huami/sleepassistant/lib/widget/HollowTextView;", "Landroidx/appcompat/widget/AppCompatTextView;", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "", "b", "c", "Landroid/graphics/Canvas;", "canvas", "a", "w", "h", "oldw", "oldh", "onSizeChanged", "onDraw", "startAnim", "Landroid/graphics/Paint;", "Landroid/graphics/Paint;", "mTextPaint", "mBackgroundPaint", "Landroid/graphics/Bitmap;", "Landroid/graphics/Bitmap;", "mBackgroundBitmap", GoogleApiAvailabilityLight.a, "mTextBitmap", "e", "Landroid/graphics/Canvas;", "mBackgroundCanvas", "f", "mTextCanvas", "Landroid/graphics/RectF;", "g", "Landroid/graphics/RectF;", "mBackgroundRect", LogUtil.I, "mBackgroundColor", "i", "mCornerRadius", "Lkotlinx/coroutines/Job;", z.j, "Lkotlinx/coroutines/Job;", "job", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "lib_release"}, k = 1, mv = {1, 5, 1})
public final class HollowTextView extends AppCompatTextView {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private Paint mTextPaint;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private Paint mBackgroundPaint;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private Bitmap mBackgroundBitmap;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    private Bitmap mTextBitmap;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    private Canvas mBackgroundCanvas;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    private Canvas mTextCanvas;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    private RectF mBackgroundRect;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private int mBackgroundColor;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private int mCornerRadius;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @Nullable
    private Job job;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.sleepassistant.lib.widget.HollowTextView$startAnim$1", f = "HollowTextView.kt", i = {}, l = {136, 142}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public float a;
        public int b;
        public int c;

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return HollowTextView.this.new a(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:11:0x0035 A[PHI: r1 r5 r9
          0x0035: PHI (r1v2 int) = (r1v1 int), (r1v4 int) binds: [B:10:0x002d, B:14:0x006d] A[DONT_GENERATE, DONT_INLINE]
          0x0035: PHI (r5v1 com.huami.sleepassistant.lib.widget.HollowTextView$a) = 
          (r5v0 com.huami.sleepassistant.lib.widget.HollowTextView$a)
          (r5v2 com.huami.sleepassistant.lib.widget.HollowTextView$a)
         binds: [B:10:0x002d, B:14:0x006d] A[DONT_GENERATE, DONT_INLINE]
          0x0035: PHI (r9v2 float) = (r9v1 float), (r9v4 float) binds: [B:10:0x002d, B:14:0x006d] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:13:0x006c A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:15:0x006f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x006a -> B:14:0x006d). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0085 -> B:19:0x0088). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r8.c
                r2 = 990057071(0x3b03126f, float:0.002)
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L2d
                if (r1 == r4) goto L23
                if (r1 != r3) goto L1b
                int r1 = r8.b
                float r5 = r8.a
                kotlin.ResultKt.throwOnFailure(r9)
                r9 = r5
                r5 = r8
                goto L88
            L1b:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L23:
                int r1 = r8.b
                float r5 = r8.a
                kotlin.ResultKt.throwOnFailure(r9)
                r9 = r5
                r5 = r8
                goto L6d
            L2d:
                kotlin.ResultKt.throwOnFailure(r9)
                r9 = 1065353216(0x3f800000, float:1.0)
                r1 = 180(0xb4, float:2.52E-43)
                r5 = r8
            L35:
                int r1 = r1 + (-1)
                com.huami.sleepassistant.lib.widget.HollowTextView r6 = com.huami.sleepassistant.lib.widget.HollowTextView.this
                android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
                com.huami.sleepassistant.lib.widget.HollowTextView r7 = com.huami.sleepassistant.lib.widget.HollowTextView.this
                android.view.ViewGroup$LayoutParams r7 = r7.getLayoutParams()
                int r7 = r7.height
                int r7 = r7 + r3
                r6.height = r7
                com.huami.sleepassistant.lib.widget.HollowTextView r7 = com.huami.sleepassistant.lib.widget.HollowTextView.this
                android.view.ViewGroup$LayoutParams r7 = r7.getLayoutParams()
                int r7 = r7.width
                int r7 = r7 + r3
                r6.width = r7
                com.huami.sleepassistant.lib.widget.HollowTextView r7 = com.huami.sleepassistant.lib.widget.HollowTextView.this
                r7.setLayoutParams(r6)
                float r9 = r9 - r2
                com.huami.sleepassistant.lib.widget.HollowTextView r6 = com.huami.sleepassistant.lib.widget.HollowTextView.this
                r6.setAlpha(r9)
                r6 = 2
                r5.a = r9
                r5.b = r1
                r5.c = r4
                java.lang.Object r6 = kotlinx.coroutines.DelayKt.delay(r6, r5)
                if (r6 != r0) goto L6d
                return r0
            L6d:
                if (r4 <= r1) goto L35
                r1 = 100
            L71:
                int r1 = r1 + (-1)
                float r9 = r9 - r2
                com.huami.sleepassistant.lib.widget.HollowTextView r6 = com.huami.sleepassistant.lib.widget.HollowTextView.this
                r6.setAlpha(r9)
                r6 = 1
                r5.a = r9
                r5.b = r1
                r5.c = r3
                java.lang.Object r6 = kotlinx.coroutines.DelayKt.delay(r6, r5)
                if (r6 != r0) goto L88
                return r0
            L88:
                if (r4 <= r1) goto L71
                kotlin.Unit r9 = kotlin.Unit.INSTANCE
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huami.sleepassistant.lib.widget.HollowTextView.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @JvmOverloads
    public HollowTextView(@NotNull Context context) {
        this(context, null, 0, 6, null);
    }

    @JvmOverloads
    public HollowTextView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ HollowTextView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? -1 : i);
    }

    private final void a(Canvas canvas) {
        if (this.mCornerRadius > 0) {
            canvas.drawArc(this.mBackgroundRect, 0.0f, 360.0f, true, this.mBackgroundPaint);
        } else {
            canvas.drawColor(this.mBackgroundColor);
        }
    }

    private final void b(AttributeSet attrs, int defStyleAttr) {
        if (attrs == null) {
            return;
        }
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attrs, R.styleable.Sls_HollowTextView, defStyleAttr, 0);
        this.mBackgroundColor = typedArrayObtainStyledAttributes.getColor(R.styleable.Sls_HollowTextView_sls_background_color, 0);
        this.mCornerRadius = typedArrayObtainStyledAttributes.getDimensionPixelOffset(R.styleable.Sls_HollowTextView_sls_corner_radius, 0);
        typedArrayObtainStyledAttributes.recycle();
    }

    private final void c() {
        Paint paint = new Paint();
        this.mTextPaint = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        this.mTextPaint.setAntiAlias(true);
        Paint paint2 = new Paint();
        this.mBackgroundPaint = paint2;
        paint2.setColor(this.mBackgroundColor);
        this.mBackgroundPaint.setAntiAlias(true);
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        super.onDraw(this.mTextCanvas);
        a(this.mBackgroundCanvas);
        int iSaveLayer = Build.VERSION.SDK_INT >= 21 ? canvas.saveLayer(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), null) : canvas.saveLayer(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), null, 31);
        canvas.drawBitmap(this.mBackgroundBitmap, 0.0f, 0.0f, (Paint) null);
        canvas.drawBitmap(this.mTextBitmap, 0.0f, 0.0f, this.mTextPaint);
        canvas.restoreToCount(iSaveLayer);
    }

    @Override // android.view.View
    public void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        this.mBackgroundBitmap = Bitmap.createBitmap(w, h, Bitmap.Config.ARGB_4444);
        this.mBackgroundCanvas = new Canvas(this.mBackgroundBitmap);
        this.mTextBitmap = Bitmap.createBitmap(w, h, Bitmap.Config.ARGB_4444);
        this.mTextCanvas = new Canvas(this.mTextBitmap);
        this.mBackgroundRect = new RectF(0.0f, 0.0f, getWidth(), getHeight());
    }

    @SuppressLint({"ObjectAnimatorBinding"})
    public final void startAnim() {
        Job job = this.job;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.height = (int) ViewExKt.dpToPx(this, 2.0f);
        layoutParams.width = (int) ViewExKt.dpToPx(this, 2.0f);
        setLayoutParams(layoutParams);
        setAlpha(1.0f);
        this.job = e.f(GlobalScope.INSTANCE, Dispatchers.getMain(), null, new a(null), 2, null);
    }

    @JvmOverloads
    public HollowTextView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        b(attributeSet, i);
        c();
    }
}

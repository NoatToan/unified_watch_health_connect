package com.huami.watch.companion.ecg.view.voice;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.RequiresApi;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.huami.tools.analytics.DbUtils;
import com.huami.watch.companion.ecg.R;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 \"2\u00020\u0001:\u0001\"B\u0011\b\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bB\u001b\b\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u001a\u0010\u001dB#\b\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u001e\u001a\u00020\t¢\u0006\u0004\b\u001a\u0010\u001fB+\b\u0017\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u001e\u001a\u00020\t\u0012\u0006\u0010 \u001a\u00020\t¢\u0006\u0004\b\u001a\u0010!J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0002J\u0018\u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002J\u000e\u0010\f\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tJ\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0014R\u0016\u0010\u000f\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u000eR\u0016\u0010\u0010\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u000eR\u0016\u0010\u0011\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u000eR\u001d\u0010\u0017\u001a\u00020\u00128B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006#"}, d2 = {"Lcom/huami/watch/companion/ecg/view/voice/VoiceAnimView;", "Landroid/view/View;", "Landroid/util/AttributeSet;", "attr", "", "b", "c", "Landroid/graphics/Canvas;", "canvas", "", FirebaseAnalytics.Param.LEVEL, "a", "setLevel", "onDraw", LogUtil.I, "mMaxLevel", "mColor", "mCurrentLevel", "Landroid/graphics/Paint;", GoogleApiAvailabilityLight.a, "Lkotlin/Lazy;", "getMPaint", "()Landroid/graphics/Paint;", "mPaint", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "<init>", "(Landroid/content/Context;)V", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "Companion", "ecg-companion_release"}, k = 1, mv = {1, 5, 1})
public final class VoiceAnimView extends View {
    private static final int e = 9;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private int mMaxLevel;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private int mColor;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private int mCurrentLevel;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Lazy mPaint;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/graphics/Paint;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<Paint> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Paint invoke() {
            return new Paint();
        }
    }

    public VoiceAnimView(@NotNull Context context) {
        super(context);
        this.mMaxLevel = 9;
        this.mColor = -1;
        this.mPaint = LazyKt__LazyJVMKt.lazy(a.a);
    }

    private final void a(Canvas canvas, int level) {
        int height = getHeight() / (((this.mMaxLevel - 1) * 2) + 1);
        int width = (getWidth() / this.mMaxLevel) * level;
        float height2 = getHeight() - (((level - 1) * height) * 2);
        canvas.drawRect(0.0f, height2, width, height2 - height, getMPaint());
    }

    private final void b(AttributeSet attr) {
        TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(attr, R.styleable.VoiceAnimView, 0, 0);
        this.mMaxLevel = typedArrayObtainStyledAttributes.getInt(R.styleable.VoiceAnimView_maxLevel, 9);
        this.mColor = typedArrayObtainStyledAttributes.getColor(R.styleable.VoiceAnimView_levelColor, -1);
        this.mCurrentLevel = this.mMaxLevel;
    }

    private final void c() {
        getMPaint().reset();
        getMPaint().setAntiAlias(true);
        getMPaint().setColor(this.mColor);
        getMPaint().setStyle(Paint.Style.FILL);
    }

    private final Paint getMPaint() {
        return (Paint) this.mPaint.getValue();
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        super.onDraw(canvas);
        c();
        int i = this.mCurrentLevel;
        if (i < 0) {
            return;
        }
        int i2 = 0;
        while (true) {
            int i3 = i2 + 1;
            a(canvas, i2);
            if (i2 == i) {
                return;
            } else {
                i2 = i3;
            }
        }
    }

    public final void setLevel(int level) {
        if (level <= 0 || level > this.mMaxLevel) {
            return;
        }
        this.mCurrentLevel = level;
        invalidate();
    }

    public VoiceAnimView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mMaxLevel = 9;
        this.mColor = -1;
        this.mPaint = LazyKt__LazyJVMKt.lazy(a.a);
        b(attributeSet);
    }

    public VoiceAnimView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mMaxLevel = 9;
        this.mColor = -1;
        this.mPaint = LazyKt__LazyJVMKt.lazy(a.a);
        b(attributeSet);
    }

    @RequiresApi(21)
    public VoiceAnimView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.mMaxLevel = 9;
        this.mColor = -1;
        this.mPaint = LazyKt__LazyJVMKt.lazy(a.a);
        b(attributeSet);
    }
}

package com.xiaomi.xms.wearable.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.devicesettings.bluttooth.todo.miui.MiuiCursorConstants;
import com.xiaomi.wearable.hm.BroadcastsKt;
import defpackage.d5j;
import defpackage.pki;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0018\u0018\u0000 H2\u00020\u0001:\u0003HIJB!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tB\u0011\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\nB\u001b\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\u000bJ$\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010\u001f2\b\b\u0002\u0010/\u001a\u00020&2\b\b\u0002\u00100\u001a\u00020\u0007J\u0010\u00101\u001a\u00020-2\u0006\u00102\u001a\u000203H\u0014J\u0010\u00104\u001a\u00020-2\u0006\u00102\u001a\u000203H\u0002J\u0010\u00105\u001a\u00020-2\u0006\u00102\u001a\u000203H\u0002J\u0010\u00106\u001a\u00020-2\u0006\u00102\u001a\u000203H\u0002J\u0010\u00107\u001a\u00020\u001c2\u0006\u00108\u001a\u00020\u001cH\u0002J\u0010\u00109\u001a\u00020\u001c2\u0006\u0010:\u001a\u00020\u001cH\u0002J\b\u0010;\u001a\u00020\rH\u0002J\u0012\u0010F\u001a\u00020\u00072\b\b\u0001\u0010G\u001a\u00020\u0007H\u0002R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u001e\u001a\u0004\u0018\u00010\u001f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b \u0010!R\u0014\u0010\"\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0014\u0010%\u001a\u00020&8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0014\u0010)\u001a\u00020\u001c8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+R\u0014\u0010<\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b=\u0010$R\u0014\u0010>\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b?\u0010$R\u0014\u0010@\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bA\u0010$R\u0014\u0010B\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bC\u0010$R\u0014\u0010D\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bE\u0010$¨\u0006K"}, d2 = {"Lcom/xiaomi/xms/wearable/widget/ProgressButton;", "Landroid/view/View;", "context", "Landroid/content/Context;", "attr", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "mPaint", "Landroid/graphics/Paint;", "mTextPaint", "mBgRectF", "Landroid/graphics/RectF;", "mDataLock", "Ljava/lang/Object;", "mPendingData", "Lcom/xiaomi/xms/wearable/widget/ProgressButton$DateInfo;", "mDataInfo", "mNormalTextColor", "mNormalBgColor", "mProgressTextColor", "mProgressBgColor", "mProgressHighlightColor", "mBgCorner", "", "mMaxProgress", "mText", "", "getMText", "()Ljava/lang/String;", "mCurProgress", "getMCurProgress", "()I", "mDisplayMode", "Lcom/xiaomi/xms/wearable/widget/ProgressButton$DisplayMode;", "getMDisplayMode", "()Lcom/xiaomi/xms/wearable/widget/ProgressButton$DisplayMode;", "mProgressPercent", "getMProgressPercent", "()F", "setBtnText", "", MiuiCursorConstants.CONTENT, "mode", BroadcastsKt.SILENT_PUSHING_PROGRESS, "onDraw", "canvas", "Landroid/graphics/Canvas;", "drawBackground", "drawProgress", "drawText", "dp2px", "dp", "sp2px", "sp", "newFillPaint", "defaultTextColor", "getDefaultTextColor", "defaultBgColor", "getDefaultBgColor", "defaultProgressTextColor", "getDefaultProgressTextColor", "defaultProgressBgColor", "getDefaultProgressBgColor", "defaultProgressHighlightColor", "getDefaultProgressHighlightColor", "getColor", "color", "Companion", "DisplayMode", "DateInfo", "xmswearable_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ProgressButton extends View {
    private static final float DEFAULT_BG_CORNER = 100.0f;
    private static final float DEFAULT_TEXT_SIZE = 12.0f;

    @NotNull
    public static final String TAG = "ProgressButton";
    private float mBgCorner;

    @NotNull
    private RectF mBgRectF;

    @NotNull
    private DateInfo mDataInfo;

    @NotNull
    private final Object mDataLock;
    private int mMaxProgress;
    private int mNormalBgColor;
    private int mNormalTextColor;

    @NotNull
    private final Paint mPaint;

    @NotNull
    private DateInfo mPendingData;
    private int mProgressBgColor;
    private int mProgressHighlightColor;
    private int mProgressTextColor;

    @NotNull
    private final Paint mTextPaint;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final DateInfo NOT_SET = new DateInfo();

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/xiaomi/xms/wearable/widget/ProgressButton$Companion;", "", "<init>", "()V", "TAG", "", "NOT_SET", "Lcom/xiaomi/xms/wearable/widget/ProgressButton$DateInfo;", "getNOT_SET", "()Lcom/xiaomi/xms/wearable/widget/ProgressButton$DateInfo;", "DEFAULT_BG_CORNER", "", "DEFAULT_TEXT_SIZE", "xmswearable_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final DateInfo getNOT_SET() {
            return ProgressButton.NOT_SET;
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tB\t\b\u0016¢\u0006\u0004\b\b\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J)\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001a"}, d2 = {"Lcom/xiaomi/xms/wearable/widget/ProgressButton$DateInfo;", "", "displayMode", "Lcom/xiaomi/xms/wearable/widget/ProgressButton$DisplayMode;", "text", "", BroadcastsKt.SILENT_PUSHING_PROGRESS, "", "<init>", "(Lcom/xiaomi/xms/wearable/widget/ProgressButton$DisplayMode;Ljava/lang/String;I)V", "()V", "getDisplayMode", "()Lcom/xiaomi/xms/wearable/widget/ProgressButton$DisplayMode;", "getText", "()Ljava/lang/String;", "getProgress", "()I", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "xmswearable_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class DateInfo {

        @NotNull
        private final DisplayMode displayMode;
        private final int progress;

        @Nullable
        private final String text;

        public DateInfo(@NotNull DisplayMode displayMode, @Nullable String str, int i) {
            Intrinsics.checkNotNullParameter(displayMode, "displayMode");
            this.displayMode = displayMode;
            this.text = str;
            this.progress = i;
        }

        public static /* synthetic */ DateInfo copy$default(DateInfo dateInfo, DisplayMode displayMode, String str, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                displayMode = dateInfo.displayMode;
            }
            if ((i2 & 2) != 0) {
                str = dateInfo.text;
            }
            if ((i2 & 4) != 0) {
                i = dateInfo.progress;
            }
            return dateInfo.copy(displayMode, str, i);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final DisplayMode getDisplayMode() {
            return this.displayMode;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getText() {
            return this.text;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final int getProgress() {
            return this.progress;
        }

        @NotNull
        public final DateInfo copy(@NotNull DisplayMode displayMode, @Nullable String text, int progress) {
            Intrinsics.checkNotNullParameter(displayMode, "displayMode");
            return new DateInfo(displayMode, text, progress);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DateInfo)) {
                return false;
            }
            DateInfo dateInfo = (DateInfo) other;
            return Intrinsics.areEqual(this.displayMode, dateInfo.displayMode) && Intrinsics.areEqual(this.text, dateInfo.text) && this.progress == dateInfo.progress;
        }

        @NotNull
        public final DisplayMode getDisplayMode() {
            return this.displayMode;
        }

        public final int getProgress() {
            return this.progress;
        }

        @Nullable
        public final String getText() {
            return this.text;
        }

        public int hashCode() {
            int iHashCode = this.displayMode.hashCode() * 31;
            String str = this.text;
            return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Integer.hashCode(this.progress);
        }

        @NotNull
        public String toString() {
            return "DateInfo(displayMode=" + this.displayMode + ", text=" + this.text + ", progress=" + this.progress + ")";
        }

        public DateInfo() {
            this(DisplayMode.NORMAL.INSTANCE, null, 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/xiaomi/xms/wearable/widget/ProgressButton$DisplayMode;", "", "<init>", "()V", "NORMAL", "PROGRESS", "Lcom/xiaomi/xms/wearable/widget/ProgressButton$DisplayMode$NORMAL;", "Lcom/xiaomi/xms/wearable/widget/ProgressButton$DisplayMode$PROGRESS;", "xmswearable_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class DisplayMode {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/xms/wearable/widget/ProgressButton$DisplayMode$NORMAL;", "Lcom/xiaomi/xms/wearable/widget/ProgressButton$DisplayMode;", "<init>", "()V", "xmswearable_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class NORMAL extends DisplayMode {

            @NotNull
            public static final NORMAL INSTANCE = new NORMAL();

            private NORMAL() {
                super(null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/xms/wearable/widget/ProgressButton$DisplayMode$PROGRESS;", "Lcom/xiaomi/xms/wearable/widget/ProgressButton$DisplayMode;", "<init>", "()V", "xmswearable_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class PROGRESS extends DisplayMode {

            @NotNull
            public static final PROGRESS INSTANCE = new PROGRESS();

            private PROGRESS() {
                super(null);
            }
        }

        private DisplayMode() {
        }

        public /* synthetic */ DisplayMode(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProgressButton(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.mPaint = newFillPaint();
        Paint paintNewFillPaint = newFillPaint();
        this.mTextPaint = paintNewFillPaint;
        this.mBgRectF = new RectF();
        this.mDataLock = new Object();
        DateInfo dateInfo = NOT_SET;
        this.mPendingData = dateInfo;
        this.mDataInfo = dateInfo;
        this.mMaxProgress = 100;
        paintNewFillPaint.setTextAlign(Paint.Align.CENTER);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, d5j.s4);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        paintNewFillPaint.setTextSize(typedArrayObtainStyledAttributes.getDimension(d5j.z4, sp2px(DEFAULT_TEXT_SIZE)));
        this.mNormalTextColor = typedArrayObtainStyledAttributes.getColor(d5j.y4, getDefaultTextColor());
        this.mNormalBgColor = typedArrayObtainStyledAttributes.getColor(d5j.u4, getDefaultBgColor());
        this.mBgCorner = typedArrayObtainStyledAttributes.getDimension(d5j.t4, dp2px(100.0f));
        this.mProgressTextColor = typedArrayObtainStyledAttributes.getColor(d5j.x4, getDefaultProgressTextColor());
        this.mProgressBgColor = typedArrayObtainStyledAttributes.getColor(d5j.v4, getDefaultProgressBgColor());
        this.mProgressHighlightColor = typedArrayObtainStyledAttributes.getColor(d5j.w4, getDefaultProgressHighlightColor());
        typedArrayObtainStyledAttributes.recycle();
    }

    private final float dp2px(float dp) {
        return TypedValue.applyDimension(1, dp, getContext().getResources().getDisplayMetrics());
    }

    private final void drawBackground(Canvas canvas) {
        this.mPaint.setColor(Intrinsics.areEqual(getMDisplayMode(), DisplayMode.PROGRESS.INSTANCE) ? this.mProgressBgColor : this.mNormalBgColor);
        RectF rectF = this.mBgRectF;
        float f = this.mBgCorner;
        canvas.drawRoundRect(rectF, f, f, this.mPaint);
    }

    private final void drawProgress(Canvas canvas) {
        if (getMCurProgress() == 0 || !Intrinsics.areEqual(getMDisplayMode(), DisplayMode.PROGRESS.INSTANCE)) {
            return;
        }
        int iSave = canvas.save();
        float fWidth = this.mBgRectF.width() * getMProgressPercent();
        RectF rectF = this.mBgRectF;
        canvas.clipRect(rectF.left, rectF.top, fWidth, rectF.bottom);
        this.mPaint.setColor(this.mProgressHighlightColor);
        RectF rectF2 = this.mBgRectF;
        float f = this.mBgCorner;
        canvas.drawRoundRect(rectF2, f, f, this.mPaint);
        canvas.restoreToCount(iSave);
    }

    private final void drawText(Canvas canvas) {
        if (TextUtils.isEmpty(getMText())) {
            return;
        }
        this.mTextPaint.setColor(Intrinsics.areEqual(getMDisplayMode(), DisplayMode.PROGRESS.INSTANCE) ? this.mProgressTextColor : this.mNormalTextColor);
        Paint.FontMetrics fontMetrics = this.mTextPaint.getFontMetrics();
        float f = 2;
        float fCenterY = (this.mBgRectF.centerY() - (fontMetrics.top / f)) - (fontMetrics.bottom / f);
        String mText = getMText();
        if (mText == null) {
            mText = "";
        }
        canvas.drawText(mText, this.mBgRectF.centerX(), fCenterY, this.mTextPaint);
    }

    private final int getColor(int color) {
        return ApplicationExtKt.getApplication().getResources().getColor(color, null);
    }

    private final int getDefaultBgColor() {
        return getColor(pki.f30504b);
    }

    private final int getDefaultProgressBgColor() {
        return getColor(pki.d);
    }

    private final int getDefaultProgressHighlightColor() {
        return getColor(pki.e);
    }

    private final int getDefaultProgressTextColor() {
        return getColor(pki.f30503a);
    }

    private final int getDefaultTextColor() {
        return getColor(pki.c);
    }

    private final int getMCurProgress() {
        return this.mDataInfo.getProgress();
    }

    private final DisplayMode getMDisplayMode() {
        return this.mDataInfo.getDisplayMode();
    }

    private final float getMProgressPercent() {
        return (this.mDataInfo.getProgress() * 1.0f) / this.mMaxProgress;
    }

    private final String getMText() {
        return this.mDataInfo.getText();
    }

    private final Paint newFillPaint() {
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        return paint;
    }

    public static /* synthetic */ void setBtnText$default(ProgressButton progressButton, String str, DisplayMode displayMode, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            displayMode = DisplayMode.NORMAL.INSTANCE;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        progressButton.setBtnText(str, displayMode, i);
    }

    private final float sp2px(float sp) {
        return TypedValue.applyDimension(2, sp, getContext().getResources().getDisplayMetrics());
    }

    @Override // android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        synchronized (this.mDataLock) {
            try {
                DateInfo dateInfo = this.mPendingData;
                DateInfo dateInfo2 = NOT_SET;
                if (dateInfo != dateInfo2) {
                    this.mDataInfo = dateInfo;
                }
                this.mPendingData = dateInfo2;
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
        Logger.d(TAG, "onDraw: %s ", this.mDataInfo.toString(), new Object[0]);
        this.mBgRectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        drawBackground(canvas);
        drawProgress(canvas);
        drawText(canvas);
    }

    public final void setBtnText(@Nullable String content, @NotNull DisplayMode mode, int progress) {
        boolean z;
        Intrinsics.checkNotNullParameter(mode, "mode");
        synchronized (this.mDataLock) {
            z = this.mPendingData == NOT_SET;
            this.mPendingData = new DateInfo(mode, content, progress);
            Unit unit = Unit.INSTANCE;
        }
        Logger.d(TAG, "setBtnText " + z + " " + mode + " " + progress);
        if (z) {
            postInvalidate();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ProgressButton(@NotNull Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ProgressButton(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}

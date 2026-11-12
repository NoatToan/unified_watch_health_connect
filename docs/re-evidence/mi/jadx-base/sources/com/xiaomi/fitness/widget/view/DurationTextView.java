package com.xiaomi.fitness.widget.view;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.xiaomi.fitness.common.utils.DisplayUtil;
import com.xiaomi.passport.ui.internal.MenuBuilder;
import defpackage.b5j;
import defpackage.hyi;
import defpackage.ksi;
import defpackage.qvi;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\n\n\u0002\u0010 \n\u0002\b\u0006\u0018\u0000 H2\u00020\u0001:\u0001HB'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u0019H\u0002J\b\u0010&\u001a\u00020$H\u0002J\u0010\u0010'\u001a\u00020$2\u0006\u0010%\u001a\u00020\u0019H\u0002J:\u0010(\u001a\u00020$2\u0006\u0010%\u001a\u00020\u00192\u0006\u0010)\u001a\u00020\u00072\u0006\u0010*\u001a\u00020\u00072\b\u0010+\u001a\u0004\u0018\u00010\u000b2\u0006\u0010,\u001a\u00020\u00072\u0006\u0010-\u001a\u00020\u0007H\u0002J\u001a\u0010.\u001a\u00020/2\b\u0010+\u001a\u0004\u0018\u00010\u000b2\u0006\u00100\u001a\u00020\u0007H\u0002J\u000e\u00101\u001a\u00020$2\u0006\u00102\u001a\u000203J\u000e\u00104\u001a\u00020$2\u0006\u00105\u001a\u000203J#\u00106\u001a\u00020$2\u0016\u00107\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u000b08\"\u0004\u0018\u00010\u000b¢\u0006\u0002\u00109J.\u0010:\u001a\u00020$2\b\u0010;\u001a\u0004\u0018\u00010\u000b2\b\u0010<\u001a\u0004\u0018\u00010\u000b2\b\u0010=\u001a\u0004\u0018\u00010\u000b2\b\u0010>\u001a\u0004\u0018\u00010\u000bJ\u001a\u00106\u001a\u00020$2\b\u0010?\u001a\u0004\u0018\u00010\u000b2\u0006\u0010%\u001a\u00020\u0019H\u0002J\u0016\u0010:\u001a\u00020$2\u000e\u00107\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010CJ\u0006\u0010D\u001a\u00020$J\u0018\u0010E\u001a\u00020$2\u0006\u0010F\u001a\u00020\u00192\u0006\u0010G\u001a\u00020\u0019H\u0002R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\"X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010@\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\bA\u0010B¨\u0006I"}, d2 = {"Lcom/xiaomi/fitness/widget/view/DurationTextView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "mDataFirst", "", "mUnitFirst", "mDataSecond", "mUnitSecond", "mDataTextSize", "mDataTextColor", "mUnitTextSize", "mUnitTextColor", "mInternalGapSize", "mDataFontFamily", "mUnitFontFamily", "mHintText", "mUnitMarginStart", "mTvDataFirst", "Landroid/widget/TextView;", "mTvUnitFirst", "mTvDataSecond", "mTvUnitSecond", "mDataFontResId", "mDataFontTextStyle", "mUnitFontResId", "mUnitFontTextStyle", "mIsBold", "", "updateUnitTextMargin", "", "textView", "setHintTextIfNeed", "setInternalGap", "setTextViewAttr", "textSize", "textColor", "fontFamily", "fontResId", "textStyle", "getTypeface", "Landroid/graphics/Typeface;", "style", "setDuration", "timeInMillis", "", "setDurationInSecond", "second", "setText", "strings", "", "([Ljava/lang/String;)V", "setDurationText", "dataFirst", "unitFirst", "dataSecond", "unitSecond", "text", "durationText", "getDurationText", "()Ljava/lang/String;", "", "clearText", "updateUnitTextPosition", "dataText", "unitText", "Companion", "widget_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDurationTextView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DurationTextView.kt\ncom/xiaomi/fitness/widget/view/DurationTextView\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,303:1\n1#2:304\n*E\n"})
public final class DurationTextView extends ConstraintLayout {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private String mDataFirst;

    @Nullable
    private final String mDataFontFamily;
    private final int mDataFontResId;
    private final int mDataFontTextStyle;

    @Nullable
    private String mDataSecond;
    private int mDataTextColor;
    private int mDataTextSize;

    @Nullable
    private final String mHintText;
    private int mInternalGapSize;
    private final boolean mIsBold;

    @NotNull
    private final TextView mTvDataFirst;

    @NotNull
    private final TextView mTvDataSecond;

    @NotNull
    private final TextView mTvUnitFirst;

    @NotNull
    private final TextView mTvUnitSecond;

    @Nullable
    private String mUnitFirst;

    @Nullable
    private final String mUnitFontFamily;
    private final int mUnitFontResId;
    private final int mUnitFontTextStyle;
    private int mUnitMarginStart;

    @Nullable
    private String mUnitSecond;
    private int mUnitTextColor;
    private int mUnitTextSize;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\nH\u0002¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/fitness/widget/view/DurationTextView$Companion;", "", "<init>", "()V", "getHmDurationStrings", "", "", "cxt", "Landroid/content/Context;", "timeInMillis", "", "getHourMinuteAndSecond", "", "ms", "widget_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final List<String> getHmDurationStrings(Context cxt, long timeInMillis) {
            Objects.requireNonNull(cxt);
            Resources resources = cxt.getResources();
            int[] hourMinuteAndSecond = getHourMinuteAndSecond(timeInMillis);
            int i = hourMinuteAndSecond[0];
            int i2 = hourMinuteAndSecond[1];
            LinkedList linkedList = new LinkedList();
            if (i == 0) {
                linkedList.add(String.valueOf(i2));
                String quantityString = resources.getQuantityString(hyi.f20610b, i2);
                Intrinsics.checkNotNullExpressionValue(quantityString, "getQuantityString(...)");
                linkedList.add(quantityString);
                linkedList.add("");
                linkedList.add("");
            } else if (i2 == 0) {
                linkedList.add(String.valueOf(i));
                String quantityString2 = resources.getQuantityString(hyi.f20609a, i);
                Intrinsics.checkNotNullExpressionValue(quantityString2, "getQuantityString(...)");
                linkedList.add(quantityString2);
                linkedList.add("");
                linkedList.add("");
            } else {
                String quantityString3 = resources.getQuantityString(hyi.f20609a, i);
                Intrinsics.checkNotNullExpressionValue(quantityString3, "getQuantityString(...)");
                String quantityString4 = resources.getQuantityString(hyi.f20610b, i2);
                Intrinsics.checkNotNullExpressionValue(quantityString4, "getQuantityString(...)");
                linkedList.add(String.valueOf(i));
                linkedList.add(quantityString3);
                linkedList.add(String.valueOf(i2));
                linkedList.add(quantityString4);
            }
            return linkedList;
        }

        private final int[] getHourMinuteAndSecond(long ms) {
            int[] iArr = new int[3];
            if (ms <= 0) {
                return iArr;
            }
            int i = (int) (ms / ((long) 1000));
            int i2 = i / 60;
            iArr[0] = i2 / 60;
            iArr[1] = i2 % 60;
            iArr[2] = i % 60;
            return iArr;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public DurationTextView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final Typeface getTypeface(String fontFamily, int style) {
        Typeface typefaceCreate = Typeface.create(fontFamily, style);
        Intrinsics.checkNotNullExpressionValue(typefaceCreate, "create(...)");
        return typefaceCreate;
    }

    private final void setHintTextIfNeed() {
        if (TextUtils.isEmpty(this.mHintText)) {
            return;
        }
        this.mTvDataFirst.setText(this.mHintText);
    }

    private final void setInternalGap(TextView textView) {
        ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
        layoutParams2.setMarginEnd(this.mInternalGapSize);
        textView.setLayoutParams(layoutParams2);
    }

    private final void setTextViewAttr(TextView textView, int textSize, int textColor, String fontFamily, int fontResId, int textStyle) {
        textView.setTextColor(textColor);
        textView.setTextSize(0, textSize);
        if (!TextUtils.isEmpty(fontFamily)) {
            textView.setTypeface(getTypeface(fontFamily, textStyle));
        }
        if (fontResId > 0) {
            textView.setTypeface(DisplayUtil.getTypefaceAsResourceId(getContext(), fontResId));
        }
    }

    private final void updateUnitTextMargin(TextView textView) {
        if (this.mUnitMarginStart != 0) {
            ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
            Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
            layoutParams2.setMarginStart(this.mUnitMarginStart);
            textView.setLayoutParams(layoutParams2);
        }
    }

    private final void updateUnitTextPosition(TextView dataText, TextView unitText) {
        unitText.setY((unitText.getY() - (dataText.getPaint().getFontMetricsInt().bottom - unitText.getPaint().getFontMetricsInt().descent)) - 3);
    }

    public final void clearText() {
        setDurationText("", "", "", "");
    }

    @NotNull
    public final String getDurationText() {
        if (TextUtils.isEmpty(this.mDataFirst)) {
            this.mDataFirst = "";
        }
        if (TextUtils.isEmpty(this.mUnitFirst)) {
            this.mUnitFirst = "";
        }
        if (TextUtils.isEmpty(this.mDataSecond)) {
            this.mDataSecond = "";
        }
        if (TextUtils.isEmpty(this.mUnitSecond)) {
            this.mUnitSecond = "";
        }
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format(Locale.US, "%s%s%s%s", Arrays.copyOf(new Object[]{this.mDataFirst, this.mUnitFirst, this.mDataSecond, this.mUnitSecond}, 4));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    public final void setDuration(long timeInMillis) {
        Companion companion = INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        setDurationText(companion.getHmDurationStrings(context, timeInMillis));
    }

    public final void setDurationInSecond(long second) {
        setDuration(second * ((long) 1000));
    }

    public final void setDurationText(@Nullable String dataFirst, @Nullable String unitFirst, @Nullable String dataSecond, @Nullable String unitSecond) {
        this.mDataFirst = dataFirst;
        this.mUnitFirst = unitFirst;
        this.mDataSecond = dataSecond;
        this.mUnitSecond = unitSecond;
        setText(dataFirst, this.mTvDataFirst);
        setText(this.mUnitFirst, this.mTvUnitFirst);
        setText(this.mDataSecond, this.mTvDataSecond);
        setText(this.mUnitSecond, this.mTvUnitSecond);
        setContentDescription(getDurationText());
        requestLayout();
    }

    public final void setText(@NotNull String... strings) {
        Intrinsics.checkNotNullParameter(strings, "strings");
        LinkedList linkedList = new LinkedList(CollectionsKt__CollectionsKt.listOf(Arrays.copyOf(strings, strings.length)));
        int length = 4 - strings.length;
        for (int i = 0; i < length; i++) {
            linkedList.add("");
        }
        setDurationText(linkedList);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public DurationTextView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ DurationTextView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public DurationTextView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.mDataFirst = "24";
        this.mUnitFirst = "Hrs";
        this.mDataSecond = "60";
        this.mUnitSecond = "Mins";
        this.mDataTextSize = 140;
        this.mDataTextColor = MenuBuilder.CATEGORY_MASK;
        this.mUnitTextSize = 40;
        this.mUnitTextColor = -16776961;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b5j.o0);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        this.mDataTextSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(b5j.t0, this.mDataTextSize);
        this.mDataTextColor = typedArrayObtainStyledAttributes.getColor(b5j.r0, this.mDataTextColor);
        this.mUnitTextSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(b5j.B0, this.mUnitTextSize);
        this.mUnitTextColor = typedArrayObtainStyledAttributes.getColor(b5j.z0, this.mUnitTextColor);
        this.mUnitMarginStart = typedArrayObtainStyledAttributes.getDimensionPixelOffset(b5j.y0, this.mUnitMarginStart);
        String string = typedArrayObtainStyledAttributes.getString(b5j.s0);
        this.mDataFontFamily = string;
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(b5j.q0, 0);
        this.mDataFontResId = resourceId;
        String string2 = typedArrayObtainStyledAttributes.getString(b5j.A0);
        this.mUnitFontFamily = string2;
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(b5j.x0, 0);
        this.mUnitFontResId = resourceId2;
        int i2 = typedArrayObtainStyledAttributes.getInt(b5j.C0, 0);
        this.mUnitFontTextStyle = i2;
        int i3 = typedArrayObtainStyledAttributes.getInt(b5j.u0, 0);
        this.mDataFontTextStyle = i3;
        this.mInternalGapSize = typedArrayObtainStyledAttributes.getDimensionPixelOffset(b5j.v0, this.mInternalGapSize);
        this.mHintText = typedArrayObtainStyledAttributes.getString(b5j.w0);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(b5j.p0, false);
        this.mIsBold = z;
        typedArrayObtainStyledAttributes.recycle();
        View viewInflate = LayoutInflater.from(context).inflate(qvi.f31889k, (ViewGroup) this, true);
        TextView textView = (TextView) viewInflate.findViewById(ksi.J);
        this.mTvDataFirst = textView;
        TextView textView2 = (TextView) viewInflate.findViewById(ksi.Q);
        this.mTvUnitFirst = textView2;
        TextView textView3 = (TextView) viewInflate.findViewById(ksi.K);
        this.mTvDataSecond = textView3;
        TextView textView4 = (TextView) viewInflate.findViewById(ksi.R);
        this.mTvUnitSecond = textView4;
        if (z) {
            textView.setTypeface(null, 1);
            textView2.setTypeface(null, 1);
            textView3.setTypeface(null, 1);
            textView4.setTypeface(null, 1);
        }
        setInternalGap(textView);
        setInternalGap(textView2);
        setInternalGap(textView3);
        setTextViewAttr(textView, this.mDataTextSize, this.mDataTextColor, string, resourceId, i3);
        setTextViewAttr(textView3, this.mDataTextSize, this.mDataTextColor, string, resourceId, i3);
        setTextViewAttr(textView2, this.mUnitTextSize, this.mUnitTextColor, string2, resourceId2, i2);
        setTextViewAttr(textView4, this.mUnitTextSize, this.mUnitTextColor, string2, resourceId2, i2);
        setHintTextIfNeed();
        updateUnitTextMargin(textView2);
        updateUnitTextMargin(textView4);
        updateUnitTextPosition(textView, textView2);
        updateUnitTextPosition(textView3, textView4);
    }

    private final void setText(String text, TextView textView) {
        if (TextUtils.isEmpty(text)) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
            textView.setText(text);
        }
    }

    public final void setDurationText(@Nullable List<String> strings) {
        if (strings != null && !strings.isEmpty()) {
            if (strings.size() == 4) {
                setDurationText(strings.get(0), strings.get(1), strings.get(2), strings.get(3));
                return;
            }
            throw new IllegalStateException("strings size must be 4".toString());
        }
        this.mUnitSecond = null;
        this.mDataSecond = null;
        this.mUnitFirst = null;
        this.mDataFirst = null;
    }
}

package com.xiaomi.fitness.health.todayhealth.ui.items;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.RelativeSizeSpan;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.LocalLanguageUtil;
import com.xiaomi.fitness.health.todayhealth.ui.items.HeartChartTitleView;
import defpackage.eri;
import defpackage.jui;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u00101\u001a\u000202H\u0014JF\u00103\u001a\u0002022\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u00104\u001a\u0004\u0018\u0001052\b\u00106\u001a\u0004\u0018\u0001052\b\u00107\u001a\u0004\u0018\u0001052\n\b\u0002\u00108\u001a\u0004\u0018\u0001052\n\b\u0002\u00109\u001a\u0004\u0018\u000105J\u0010\u00103\u001a\u0002022\b\u0010:\u001a\u0004\u0018\u000105R\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u000b\"\u0004\b\u0010\u0010\rR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0001X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u000b\"\u0004\b\u0018\u0010\rR\u001c\u0010\u0019\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u000b\"\u0004\b\u001b\u0010\rR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u000b\"\u0004\b\u001e\u0010\rR\u001a\u0010\u001f\u001a\u00020 X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001a\u0010%\u001a\u00020 X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\"\"\u0004\b'\u0010$R\u001a\u0010(\u001a\u00020 X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\"\"\u0004\b*\u0010$R\u001c\u0010+\u001a\u0004\u0018\u00010,X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100¨\u0006;"}, d2 = {"Lcom/xiaomi/fitness/health/todayhealth/ui/items/HeartChartTitleView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "txtValue", "Landroid/widget/TextView;", "getTxtValue", "()Landroid/widget/TextView;", "setTxtValue", "(Landroid/widget/TextView;)V", "txtDesc", "getTxtDesc", "setTxtDesc", "txtContainer", "getTxtContainer", "()Landroid/widget/LinearLayout;", "setTxtContainer", "(Landroid/widget/LinearLayout;)V", "txtEmpty", "getTxtEmpty", "setTxtEmpty", "markingText", "getMarkingText", "setMarkingText", "tipText", "getTipText", "setTipText", "titleValueSize", "", "getTitleValueSize", "()F", "setTitleValueSize", "(F)V", "titleEmptySize", "getTitleEmptySize", "setTitleEmptySize", "txtDescSize", "getTxtDescSize", "setTxtDescSize", "titleImage", "Landroid/widget/ImageView;", "getTitleImage", "()Landroid/widget/ImageView;", "setTitleImage", "(Landroid/widget/ImageView;)V", "onFinishInflate", "", "bindData", "parentStr", "", "childStr", "descStr", "tipStr", "markingStr", "emptyStr", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class HeartChartTitleView extends LinearLayout {

    @Nullable
    private TextView markingText;

    @Nullable
    private TextView tipText;
    private float titleEmptySize;

    @Nullable
    private ImageView titleImage;
    private float titleValueSize;

    @Nullable
    private LinearLayout txtContainer;

    @Nullable
    private TextView txtDesc;
    private float txtDescSize;

    @Nullable
    private TextView txtEmpty;

    @Nullable
    private TextView txtValue;

    public HeartChartTitleView(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.titleValueSize = 33.0f;
        this.titleEmptySize = 20.0f;
        this.txtDescSize = 12.0f;
        LayoutInflater.from(context).inflate(jui.h7, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindData$lambda$1$lambda$0(HeartChartTitleView this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        TextView textView = this$0.txtValue;
        if (textView != null) {
            textView.requestLayout();
        }
    }

    public final void bindData(@Nullable Context context, @Nullable String parentStr, @Nullable String childStr, @Nullable String descStr, @Nullable String tipStr, @Nullable String markingStr) {
        int iIndexOf$default;
        TextView textView = this.txtEmpty;
        Intrinsics.checkNotNull(textView);
        textView.setVisibility(8);
        LinearLayout linearLayout = this.txtContainer;
        Intrinsics.checkNotNull(linearLayout);
        linearLayout.setVisibility(0);
        if (parentStr != null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(parentStr);
            if (childStr == null || childStr.length() == 0 || (iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) parentStr, childStr, 0, false, 6, (Object) null)) < 0) {
                spannableStringBuilder.setSpan(new RelativeSizeSpan(0.5f), 0, parentStr.length(), 33);
            } else {
                int length = childStr.length() + iIndexOf$default;
                spannableStringBuilder.setSpan(new RelativeSizeSpan(1.0f), iIndexOf$default, length, 33);
                if (iIndexOf$default > 0) {
                    spannableStringBuilder.setSpan(new RelativeSizeSpan(0.5f), 0, iIndexOf$default, 33);
                }
                if (length < parentStr.length()) {
                    spannableStringBuilder.setSpan(new RelativeSizeSpan(0.5f), length, parentStr.length(), 33);
                }
            }
            TextView textView2 = this.txtValue;
            if (textView2 != null) {
                textView2.setText(spannableStringBuilder);
            }
            TextView textView3 = this.txtValue;
            if (textView3 != null) {
                textView3.post(new Runnable() { // from class: y4c
                    @Override // java.lang.Runnable
                    public final void run() {
                        HeartChartTitleView.bindData$lambda$1$lambda$0(this.f39777a);
                    }
                });
            }
        }
        TextView textView4 = this.txtValue;
        Intrinsics.checkNotNull(textView4);
        textView4.setIncludeFontPadding(false);
        TextView textView5 = this.txtDesc;
        Intrinsics.checkNotNull(textView5);
        textView5.setVisibility(0);
        TextView textView6 = this.txtDesc;
        Intrinsics.checkNotNull(textView6);
        textView6.setText(descStr);
        TextView textView7 = this.txtDesc;
        Intrinsics.checkNotNull(textView7);
        textView7.setTextSize(this.txtDescSize);
        if (tipStr != null) {
            if (StringsKt__StringsKt.isBlank(tipStr)) {
                TextView textView8 = this.tipText;
                Intrinsics.checkNotNull(textView8);
                textView8.setVisibility(8);
            } else {
                TextView textView9 = this.tipText;
                Intrinsics.checkNotNull(textView9);
                textView9.setVisibility(0);
                TextView textView10 = this.tipText;
                Intrinsics.checkNotNull(textView10);
                textView10.setText(tipStr);
            }
        }
        if (markingStr != null) {
            if (StringsKt__StringsKt.isBlank(markingStr)) {
                TextView textView11 = this.markingText;
                Intrinsics.checkNotNull(textView11);
                textView11.setVisibility(8);
            } else {
                TextView textView12 = this.markingText;
                Intrinsics.checkNotNull(textView12);
                textView12.setVisibility(0);
                TextView textView13 = this.markingText;
                Intrinsics.checkNotNull(textView13);
                textView13.setText(markingStr);
            }
        }
    }

    @Nullable
    public final TextView getMarkingText() {
        return this.markingText;
    }

    @Nullable
    public final TextView getTipText() {
        return this.tipText;
    }

    public final float getTitleEmptySize() {
        return this.titleEmptySize;
    }

    @Nullable
    public final ImageView getTitleImage() {
        return this.titleImage;
    }

    public final float getTitleValueSize() {
        return this.titleValueSize;
    }

    @Nullable
    public final LinearLayout getTxtContainer() {
        return this.txtContainer;
    }

    @Nullable
    public final TextView getTxtDesc() {
        return this.txtDesc;
    }

    public final float getTxtDescSize() {
        return this.txtDescSize;
    }

    @Nullable
    public final TextView getTxtEmpty() {
        return this.txtEmpty;
    }

    @Nullable
    public final TextView getTxtValue() {
        return this.txtValue;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.txtContainer = (LinearLayout) findViewById(eri.Za);
        this.txtValue = (TextView) findViewById(eri.yn);
        this.txtDesc = (TextView) findViewById(eri.vn);
        this.txtEmpty = (TextView) findViewById(eri.C4);
        this.markingText = (TextView) findViewById(eri.ib);
        this.tipText = (TextView) findViewById(eri.Zi);
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        if (AppUtil.getTxtFontSize(context) >= 1.25f) {
            this.titleValueSize = 22.0f;
            this.titleEmptySize = 17.0f;
            this.txtDescSize = 8.0f;
        }
    }

    public final void setMarkingText(@Nullable TextView textView) {
        this.markingText = textView;
    }

    public final void setTipText(@Nullable TextView textView) {
        this.tipText = textView;
    }

    public final void setTitleEmptySize(float f) {
        this.titleEmptySize = f;
    }

    public final void setTitleImage(@Nullable ImageView imageView) {
        this.titleImage = imageView;
    }

    public final void setTitleValueSize(float f) {
        this.titleValueSize = f;
    }

    public final void setTxtContainer(@Nullable LinearLayout linearLayout) {
        this.txtContainer = linearLayout;
    }

    public final void setTxtDesc(@Nullable TextView textView) {
        this.txtDesc = textView;
    }

    public final void setTxtDescSize(float f) {
        this.txtDescSize = f;
    }

    public final void setTxtEmpty(@Nullable TextView textView) {
        this.txtEmpty = textView;
    }

    public final void setTxtValue(@Nullable TextView textView) {
        this.txtValue = textView;
    }

    public final void bindData(@Nullable String emptyStr) {
        TextView textView = this.txtEmpty;
        Intrinsics.checkNotNull(textView);
        textView.setVisibility(0);
        LinearLayout linearLayout = this.txtContainer;
        Intrinsics.checkNotNull(linearLayout);
        linearLayout.setVisibility(8);
        if (LocalLanguageUtil.INSTANCE.languageGreek()) {
            TextView textView2 = this.txtEmpty;
            Intrinsics.checkNotNull(textView2);
            textView2.setTextSize(this.titleEmptySize);
        }
        TextView textView3 = this.txtEmpty;
        Intrinsics.checkNotNull(textView3);
        textView3.setText(emptyStr);
    }
}

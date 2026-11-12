package com.xiaomi.fitness.common.utils;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import android.widget.TextView;
import com.xiaomi.fitness.statistics.StatConstants;
import com.xiaomi.fitness.watch.face.edit.entity.SlotType;
import defpackage.o8p;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JI\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0001\u0010\f\u001a\u00020\r2\u0016\u0010\u000e\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u000b0\u000f\"\u0004\u0018\u00010\u000bH\u0007¢\u0006\u0002\u0010\u0010JK\u0010\u0004\u001a\u00020\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0016\u0010\u000e\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u000b0\u000f\"\u0004\u0018\u00010\u000bH\u0007¢\u0006\u0002\u0010\u0013J&\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\rJ\u001e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\rJ\"\u0010\u001e\u001a\u00020\u0015*\u00020\u001f2\u0006\u0010 \u001a\u00020\r2\u0006\u0010!\u001a\u00020\r2\u0006\u0010\"\u001a\u00020\rR\u000e\u0010\u001a\u001a\u00020\rX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\rX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\rX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\rX\u0086T¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lcom/xiaomi/fitness/common/utils/TextSpannableUtil;", "", "<init>", "()V", "getSpannableWithTypeface", "Landroid/text/SpannableStringBuilder;", "context", "Landroid/content/Context;", "texSize", "", "parentStr", "", SlotType.FONT, "", "strArgs", "", "(Landroid/content/Context;FLjava/lang/String;I[Ljava/lang/String;)Landroid/text/SpannableStringBuilder;", "typeface", "Landroid/graphics/Typeface;", "(Landroid/graphics/Typeface;Landroid/content/Context;FLjava/lang/String;[Ljava/lang/String;)Landroid/text/SpannableStringBuilder;", "setCompoundDrawables", "", "textView", "Landroid/widget/TextView;", "drawableResource", "position", "POSITION_START", "POSITION_TOP", "POSITION_END", "POSITION_BOTTOM", "setFontWeight", "Landroid/text/SpannableString;", StatConstants.PARAM_START, StatConstants.PARAM_END, "fontWeight", "common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class TextSpannableUtil {

    @NotNull
    public static final TextSpannableUtil INSTANCE = new TextSpannableUtil();
    public static final int POSITION_BOTTOM = 3;
    public static final int POSITION_END = 2;
    public static final int POSITION_START = 0;
    public static final int POSITION_TOP = 1;

    private TextSpannableUtil() {
    }

    @JvmStatic
    @NotNull
    public static final SpannableStringBuilder getSpannableWithTypeface(@NotNull Context context, float texSize, @Nullable String parentStr, int font, @NotNull String... strArgs) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(strArgs, "strArgs");
        Typeface typeface = Typeface.DEFAULT;
        return getSpannableWithTypeface(context.getResources().getFont(font), context, texSize, parentStr, (String[]) Arrays.copyOf(strArgs, strArgs.length));
    }

    public final void setCompoundDrawables(@NotNull Context context, @NotNull TextView textView, int drawableResource, int position) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(textView, "textView");
        Drawable drawable = context.getDrawable(drawableResource);
        if (position == 0) {
            textView.setCompoundDrawablesWithIntrinsicBounds(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
            return;
        }
        if (position == 1) {
            textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, drawable, (Drawable) null, (Drawable) null);
            textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, drawable, (Drawable) null);
            textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, drawable);
            textView.setCompoundDrawablesWithIntrinsicBounds(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
            return;
        }
        if (position == 2) {
            textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, drawable, (Drawable) null);
            textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, drawable);
            textView.setCompoundDrawablesWithIntrinsicBounds(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
        } else if (position != 3) {
            textView.setCompoundDrawablesWithIntrinsicBounds(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
        } else {
            textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, drawable);
            textView.setCompoundDrawablesWithIntrinsicBounds(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
        }
    }

    public final void setFontWeight(@NotNull SpannableString spannableString, int i, int i2, final int i3) {
        Intrinsics.checkNotNullParameter(spannableString, "<this>");
        spannableString.setSpan(new MetricAffectingSpan() { // from class: com.xiaomi.fitness.common.utils.TextSpannableUtil.setFontWeight.1
            private final void applyFontWeight(TextPaint paint, int fontWeight) {
                paint.setFontVariationSettings("'wght' " + fontWeight);
            }

            @Override // android.text.style.CharacterStyle
            public void updateDrawState(TextPaint ds) {
                Intrinsics.checkNotNullParameter(ds, "ds");
                applyFontWeight(ds, i3);
            }

            @Override // android.text.style.MetricAffectingSpan
            public void updateMeasureState(TextPaint paint) {
                Intrinsics.checkNotNullParameter(paint, "paint");
                applyFontWeight(paint, i3);
            }
        }, i, i2, 33);
    }

    @JvmStatic
    @NotNull
    public static final SpannableStringBuilder getSpannableWithTypeface(@Nullable Typeface typeface, @Nullable Context context, float texSize, @Nullable String parentStr, @NotNull String... strArgs) {
        Intrinsics.checkNotNullParameter(strArgs, "strArgs");
        SpannableStringBuilder spannableStringBuilderG = o8p.g(typeface, context, texSize, null, parentStr, (String[]) Arrays.copyOf(strArgs, strArgs.length));
        Intrinsics.checkNotNullExpressionValue(spannableStringBuilderG, "getSpannableWithTypeface(...)");
        return spannableStringBuilderG;
    }

    public final void setCompoundDrawables(@NotNull Context context, @NotNull TextView textView, int drawableResource) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(textView, "textView");
        setCompoundDrawables(context, textView, drawableResource, 0);
    }
}

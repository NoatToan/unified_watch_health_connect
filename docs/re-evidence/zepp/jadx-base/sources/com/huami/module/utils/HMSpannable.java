package com.huami.module.utils;

import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.LineHeightSpan;
import android.text.style.MetricAffectingSpan;
import android.text.style.StyleSpan;
import android.view.View;
import androidx.annotation.ColorInt;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.google.android.exoplayer2.source.rtsp.SessionDescription;
import com.google.android.exoplayer2.text.ttml.b;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010!\n\u0002\b\n\u0018\u00002\u00020\u0001:\u0004-./0B\u0007¢\u0006\u0004\b+\u0010,J \u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0002J\u001c\u0010\r\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nJ[\u0010\r\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00102\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\r\u0010\u0016J\u0006\u0010\u0017\u001a\u00020\u0000J\u000e\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0003J\u0006\u0010\u001a\u001a\u00020\u0000J\u0006\u0010\u001c\u001a\u00020\u001bJ-\u0010!\u001a\u00020\u001b2%\b\u0002\u0010 \u001a\u001f\u0012\u0013\u0012\u00110\b¢\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u001dR\u0016\u0010#\u001a\u00020\u001b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\"R\u0016\u0010&\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u001c\u0010*\u001a\b\u0012\u0004\u0012\u00020\u000b0'8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)¨\u00061"}, d2 = {"Lcom/huami/module/utils/HMSpannable;", "", "what", "", "start", "end", "", "a", "", "text", "", "Lcom/huami/module/utils/HMSpannable$Span;", "spans", "append", "color", "sizeDp", "", b.k0, "spaceTop", "Landroid/graphics/Typeface;", "typeface", "linkUrl", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;ZLjava/lang/Integer;Landroid/graphics/Typeface;Ljava/lang/String;)Lcom/huami/module/utils/HMSpannable;", "addNewline", "bottom", "addNewlineWithBottom", "addSpaceBlank", "Landroid/text/SpannableStringBuilder;", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "webLaunch", "buildWithWebLaunch", "Landroid/text/SpannableStringBuilder;", "ssb", "b", LogUtil.I, SessionDescription.p, "", "c", "Ljava/util/List;", "list", "<init>", "()V", "FontSpan", "LinkClickSpan", "Span", "TextSpaceHeightSpan", "hm-ktx_release"}, k = 1, mv = {1, 5, 1})
public final class HMSpannable {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private int length;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final SpannableStringBuilder ssb = new SpannableStringBuilder();

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final List<Span> list = new ArrayList();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0016R\u0016\u0010\u000b\u001a\u00020\b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/huami/module/utils/HMSpannable$FontSpan;", "Landroid/text/style/MetricAffectingSpan;", "Landroid/text/TextPaint;", "tp", "", "updateDrawState", "textPaint", "updateMeasureState", "Landroid/graphics/Typeface;", "a", "Landroid/graphics/Typeface;", "typeface", "<init>", "(Landroid/graphics/Typeface;)V", "hm-ktx_release"}, k = 1, mv = {1, 5, 1})
    public static final class FontSpan extends MetricAffectingSpan {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        private final Typeface typeface;

        public FontSpan(@NotNull Typeface typeface) {
            this.typeface = typeface;
        }

        @Override // android.text.style.CharacterStyle
        public void updateDrawState(@NotNull TextPaint tp) {
            tp.setTypeface(this.typeface);
        }

        @Override // android.text.style.MetricAffectingSpan
        public void updateMeasureState(@NotNull TextPaint textPaint) {
            textPaint.setTypeface(this.typeface);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00040\r\u0012\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016R\u0016\u0010\f\u001a\u00020\t8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\"\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00040\r8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, d2 = {"Lcom/huami/module/utils/HMSpannable$LinkClickSpan;", "Landroid/text/style/ClickableSpan;", "Landroid/view/View;", "widget", "", "onClick", "Landroid/text/TextPaint;", "ds", "updateDrawState", "", "a", "Ljava/lang/String;", "linkUrl", "Lkotlin/Function1;", "b", "Lkotlin/jvm/functions/Function1;", "webViewLaunch", "", "c", "Ljava/lang/Integer;", "linkColor", "<init>", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Ljava/lang/Integer;)V", "hm-ktx_release"}, k = 1, mv = {1, 5, 1})
    public static final class LinkClickSpan extends ClickableSpan {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        private final String linkUrl;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        private final Function1<String, Unit> webViewLaunch;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @Nullable
        private final Integer linkColor;

        /* JADX WARN: Multi-variable type inference failed */
        public LinkClickSpan(@NotNull String str, @NotNull Function1<? super String, Unit> function1, @ColorInt @Nullable Integer num) {
            this.linkUrl = str;
            this.webViewLaunch = function1;
            this.linkColor = num;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(@NotNull View widget) {
            this.webViewLaunch.invoke(this.linkUrl);
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(@NotNull TextPaint ds) {
            ds.setUnderlineText(false);
            Integer num = this.linkColor;
            if (num == null) {
                return;
            }
            ds.setColor(num.intValue());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000f\u001a\u00020\u0004\u0012\u0006\u0010\u0011\u001a\u00020\u0004¢\u0006\u0004\b\u0012\u0010\u0013J:\u0010\f\u001a\u00020\u000b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0016R\u0016\u0010\u000f\u001a\u00020\u00048\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u0011\u001a\u00020\u00048\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u000e¨\u0006\u0014"}, d2 = {"Lcom/huami/module/utils/HMSpannable$TextSpaceHeightSpan;", "Landroid/text/style/LineHeightSpan;", "", "text", "", "start", "end", "spanstartv", "lineHeight", "Landroid/graphics/Paint$FontMetricsInt;", "fm", "", "chooseHeight", "a", LogUtil.I, "spaceTopHeight", "b", "spaceBottomHeight", "<init>", "(II)V", "hm-ktx_release"}, k = 1, mv = {1, 5, 1})
    public static final class TextSpaceHeightSpan implements LineHeightSpan {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final int spaceTopHeight;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final int spaceBottomHeight;

        public TextSpaceHeightSpan(int i, int i2) {
            this.spaceTopHeight = i;
            this.spaceBottomHeight = i2;
        }

        @Override // android.text.style.LineHeightSpan
        public void chooseHeight(@Nullable CharSequence text, int start, int end, int spanstartv, int lineHeight, @NotNull Paint.FontMetricsInt fm) {
            Objects.requireNonNull(text, "null cannot be cast to non-null type android.text.Spanned");
            Spanned spanned = (Spanned) text;
            int spanStart = spanned.getSpanStart(this);
            int spanEnd = spanned.getSpanEnd(this);
            if (start == spanStart) {
                int i = fm.ascent;
                int i2 = this.spaceTopHeight;
                fm.ascent = i - i2;
                fm.top -= i2;
            }
            if (end == spanEnd) {
                int i3 = fm.descent;
                int i4 = this.spaceBottomHeight;
                fm.descent = i3 + i4;
                fm.bottom += i4;
            }
        }
    }

    private final void a(Object what, int start, int end) {
        this.ssb.setSpan(what, start, end, 34);
    }

    public static /* synthetic */ HMSpannable append$default(HMSpannable hMSpannable, String str, Integer num, Integer num2, boolean z, Integer num3, Typeface typeface, String str2, int i, Object obj) {
        return hMSpannable.append(str, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : num2, (i & 8) != 0 ? false : z, (i & 16) != 0 ? null : num3, (i & 32) != 0 ? null : typeface, (i & 64) == 0 ? str2 : null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SpannableStringBuilder buildWithWebLaunch$default(HMSpannable hMSpannable, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            function1 = null;
        }
        return hMSpannable.buildWithWebLaunch(function1);
    }

    @NotNull
    public final HMSpannable addNewline() {
        this.ssb.append((CharSequence) "\n");
        this.length++;
        return this;
    }

    @NotNull
    public final HMSpannable addNewlineWithBottom(int bottom) {
        append$default(this, "\n", null, null, false, null, null, null, 126, null);
        append$default(this, "\n", null, null, false, Integer.valueOf(-bottom), null, null, 110, null);
        return this;
    }

    @NotNull
    public final HMSpannable addSpaceBlank() {
        this.ssb.append((CharSequence) " ");
        this.length++;
        return this;
    }

    @NotNull
    public final HMSpannable append(@NotNull String text, @NotNull List<Span> spans) {
        this.ssb.append((CharSequence) text);
        for (Span span : spans) {
            Pair<Integer, Integer> range = span.getRange();
            this.list.add(Span.copy$default(span, TuplesKt.to(Integer.valueOf(this.length + range.getFirst().intValue()), Integer.valueOf(this.length + range.getSecond().intValue())), null, null, false, null, null, null, 126, null));
        }
        this.length += text.length();
        return this;
    }

    @NotNull
    public final SpannableStringBuilder build() {
        return buildWithWebLaunch$default(this, null, 1, null);
    }

    @NotNull
    public final SpannableStringBuilder buildWithWebLaunch(@Nullable Function1<? super String, Unit> webLaunch) {
        for (Span span : this.list) {
            if (span.getColor() != null) {
                a(new ForegroundColorSpan(span.getColor().intValue()), span.getRange().getFirst().intValue(), span.getRange().getSecond().intValue());
            }
            if (span.getSizeDp() != null) {
                a(new AbsoluteSizeSpan(span.getSizeDp().intValue(), true), span.getRange().getFirst().intValue(), span.getRange().getSecond().intValue());
            }
            if (span.getBold()) {
                a(new StyleSpan(1), span.getRange().getFirst().intValue(), span.getRange().getSecond().intValue());
            }
            if (span.getSpaceTop() != null) {
                a(new TextSpaceHeightSpan(span.getSpaceTop().intValue(), 0), span.getRange().getFirst().intValue(), span.getRange().getSecond().intValue());
            }
            if (span.getTypeface() != null) {
                a(new FontSpan(span.getTypeface()), span.getRange().getFirst().intValue(), span.getRange().getSecond().intValue());
            }
            if (span.getLinkUrl() != null && webLaunch != null) {
                a(new LinkClickSpan(span.getLinkUrl(), webLaunch, span.getColor()), span.getRange().getFirst().intValue(), span.getRange().getSecond().intValue());
            }
        }
        return this.ssb;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b(\b\u0086\b\u0018\u00002\u00020\u0001Ba\u0012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0012\u001a\u00020\b\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b3\u00104J\u0015\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u0007\u0010\u0006J\t\u0010\t\u001a\u00020\bHÆ\u0003J\u0012\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\n\u0010\u0006J\u000b\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\rHÆ\u0003Jl\u0010\u0016\u001a\u00020\u00002\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0012\u001a\u00020\b2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\rHÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\t\u0010\u0018\u001a\u00020\rHÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001J\u0013\u0010\u001b\u001a\u00020\b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003R%\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001b\u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0006@\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010\u0006R\u001b\u0010\u0011\u001a\u0004\u0018\u00010\u00038\u0006@\u0006¢\u0006\f\n\u0004\b#\u0010!\u001a\u0004\b$\u0010\u0006R\u0019\u0010\u0012\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u001b\u0010\u0013\u001a\u0004\u0018\u00010\u00038\u0006@\u0006¢\u0006\f\n\u0004\b)\u0010!\u001a\u0004\b*\u0010\u0006R\u001b\u0010\u0014\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u001b\u0010\u0015\u001a\u0004\u0018\u00010\r8\u0006@\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102¨\u00065"}, d2 = {"Lcom/huami/module/utils/HMSpannable$Span;", "", "Lkotlin/Pair;", "", "component1", "component2", "()Ljava/lang/Integer;", "component3", "", "component4", "component5", "Landroid/graphics/Typeface;", "component6", "", "component7", "range", "color", "sizeDp", b.k0, "spaceTop", "typeface", "linkUrl", "copy", "(Lkotlin/Pair;Ljava/lang/Integer;Ljava/lang/Integer;ZLjava/lang/Integer;Landroid/graphics/Typeface;Ljava/lang/String;)Lcom/huami/module/utils/HMSpannable$Span;", "toString", "hashCode", "other", "equals", "a", "Lkotlin/Pair;", "getRange", "()Lkotlin/Pair;", "b", "Ljava/lang/Integer;", "getColor", "c", "getSizeDp", GoogleApiAvailabilityLight.a, "Z", "getBold", "()Z", "e", "getSpaceTop", "f", "Landroid/graphics/Typeface;", "getTypeface", "()Landroid/graphics/Typeface;", "g", "Ljava/lang/String;", "getLinkUrl", "()Ljava/lang/String;", "<init>", "(Lkotlin/Pair;Ljava/lang/Integer;Ljava/lang/Integer;ZLjava/lang/Integer;Landroid/graphics/Typeface;Ljava/lang/String;)V", "hm-ktx_release"}, k = 1, mv = {1, 5, 1})
    public static final /* data */ class Span {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        @NotNull
        private final Pair<Integer, Integer> range;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        @Nullable
        private final Integer color;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
        @Nullable
        private final Integer sizeDp;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
        private final boolean bold;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
        @Nullable
        private final Integer spaceTop;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
        @Nullable
        private final Typeface typeface;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
        @Nullable
        private final String linkUrl;

        public Span(@NotNull Pair<Integer, Integer> pair, @ColorInt @Nullable Integer num, @Nullable Integer num2, boolean z, @Nullable Integer num3, @Nullable Typeface typeface, @Nullable String str) {
            this.range = pair;
            this.color = num;
            this.sizeDp = num2;
            this.bold = z;
            this.spaceTop = num3;
            this.typeface = typeface;
            this.linkUrl = str;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Span copy$default(Span span, Pair pair, Integer num, Integer num2, boolean z, Integer num3, Typeface typeface, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                pair = span.range;
            }
            if ((i & 2) != 0) {
                num = span.color;
            }
            Integer num4 = num;
            if ((i & 4) != 0) {
                num2 = span.sizeDp;
            }
            Integer num5 = num2;
            if ((i & 8) != 0) {
                z = span.bold;
            }
            boolean z2 = z;
            if ((i & 16) != 0) {
                num3 = span.spaceTop;
            }
            Integer num6 = num3;
            if ((i & 32) != 0) {
                typeface = span.typeface;
            }
            Typeface typeface2 = typeface;
            if ((i & 64) != 0) {
                str = span.linkUrl;
            }
            return span.copy(pair, num4, num5, z2, num6, typeface2, str);
        }

        @NotNull
        public final Pair<Integer, Integer> component1() {
            return this.range;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final Integer getColor() {
            return this.color;
        }

        @Nullable
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final Integer getSizeDp() {
            return this.sizeDp;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final boolean getBold() {
            return this.bold;
        }

        @Nullable
        /* JADX INFO: renamed from: component5, reason: from getter */
        public final Integer getSpaceTop() {
            return this.spaceTop;
        }

        @Nullable
        /* JADX INFO: renamed from: component6, reason: from getter */
        public final Typeface getTypeface() {
            return this.typeface;
        }

        @Nullable
        /* JADX INFO: renamed from: component7, reason: from getter */
        public final String getLinkUrl() {
            return this.linkUrl;
        }

        @NotNull
        public final Span copy(@NotNull Pair<Integer, Integer> range, @ColorInt @Nullable Integer color, @Nullable Integer sizeDp, boolean bold, @Nullable Integer spaceTop, @Nullable Typeface typeface, @Nullable String linkUrl) {
            return new Span(range, color, sizeDp, bold, spaceTop, typeface, linkUrl);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Span)) {
                return false;
            }
            Span span = (Span) other;
            return Intrinsics.areEqual(this.range, span.range) && Intrinsics.areEqual(this.color, span.color) && Intrinsics.areEqual(this.sizeDp, span.sizeDp) && this.bold == span.bold && Intrinsics.areEqual(this.spaceTop, span.spaceTop) && Intrinsics.areEqual(this.typeface, span.typeface) && Intrinsics.areEqual(this.linkUrl, span.linkUrl);
        }

        public final boolean getBold() {
            return this.bold;
        }

        @Nullable
        public final Integer getColor() {
            return this.color;
        }

        @Nullable
        public final String getLinkUrl() {
            return this.linkUrl;
        }

        @NotNull
        public final Pair<Integer, Integer> getRange() {
            return this.range;
        }

        @Nullable
        public final Integer getSizeDp() {
            return this.sizeDp;
        }

        @Nullable
        public final Integer getSpaceTop() {
            return this.spaceTop;
        }

        @Nullable
        public final Typeface getTypeface() {
            return this.typeface;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v7, types: [int] */
        /* JADX WARN: Type inference failed for: r1v17 */
        /* JADX WARN: Type inference failed for: r1v20 */
        /* JADX WARN: Type inference failed for: r1v7, types: [int] */
        public int hashCode() {
            int iHashCode = this.range.hashCode() * 31;
            Integer num = this.color;
            int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.sizeDp;
            int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
            boolean z = this.bold;
            ?? r1 = z;
            if (z) {
                r1 = 1;
            }
            int i = (iHashCode3 + r1) * 31;
            Integer num3 = this.spaceTop;
            int iHashCode4 = (i + (num3 == null ? 0 : num3.hashCode())) * 31;
            Typeface typeface = this.typeface;
            int iHashCode5 = (iHashCode4 + (typeface == null ? 0 : typeface.hashCode())) * 31;
            String str = this.linkUrl;
            return iHashCode5 + (str != null ? str.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "Span(range=" + this.range + ", color=" + this.color + ", sizeDp=" + this.sizeDp + ", bold=" + this.bold + ", spaceTop=" + this.spaceTop + ", typeface=" + this.typeface + ", linkUrl=" + this.linkUrl + ")";
        }

        public /* synthetic */ Span(Pair pair, Integer num, Integer num2, boolean z, Integer num3, Typeface typeface, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(pair, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : num2, (i & 8) != 0 ? false : z, (i & 16) != 0 ? null : num3, (i & 32) != 0 ? null : typeface, (i & 64) == 0 ? str : null);
        }
    }

    @NotNull
    public final HMSpannable append(@NotNull String text, @Nullable Integer color, @Nullable Integer sizeDp, boolean bold, @Nullable Integer spaceTop, @Nullable Typeface typeface, @Nullable String linkUrl) {
        this.ssb.append((CharSequence) text);
        List<Span> list = this.list;
        Integer numValueOf = Integer.valueOf(this.length);
        Integer numValueOf2 = Integer.valueOf(this.length + text.length());
        this.length = numValueOf2.intValue();
        Unit unit = Unit.INSTANCE;
        list.add(new Span(new Pair(numValueOf, numValueOf2), color, sizeDp, bold, spaceTop, typeface, linkUrl));
        return this;
    }
}

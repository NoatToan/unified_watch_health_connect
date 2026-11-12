package com.google.android.exoplayer2.ui;

import android.content.Context;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.RelativeSizeSpan;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.CaptioningManager;
import android.widget.FrameLayout;
import defpackage.gj3;
import defpackage.h55;
import defpackage.j8p;
import defpackage.wlq;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class SubtitleView extends FrameLayout implements j8p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List<h55> f8373a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public gj3 f8374b;
    public int c;
    public float d;
    public float e;
    public boolean f;
    public boolean g;
    public int h;
    public a i;
    public View j;

    public interface a {
        void a(List<h55> list, gj3 gj3Var, float f, int i, float f2);
    }

    public SubtitleView(Context context) {
        this(context, null);
    }

    private List<h55> getCuesWithStylingPreferencesApplied() {
        if (this.f && this.g) {
            return this.f8373a;
        }
        ArrayList arrayList = new ArrayList(this.f8373a.size());
        for (int i = 0; i < this.f8373a.size(); i++) {
            arrayList.add(a(this.f8373a.get(i)));
        }
        return arrayList;
    }

    private float getUserCaptionFontScale() {
        CaptioningManager captioningManager;
        if (wlq.f38110a < 19 || isInEditMode() || (captioningManager = (CaptioningManager) getContext().getSystemService("captioning")) == null || !captioningManager.isEnabled()) {
            return 1.0f;
        }
        return captioningManager.getFontScale();
    }

    private gj3 getUserCaptionStyle() {
        if (wlq.f38110a < 19 || isInEditMode()) {
            return gj3.g;
        }
        CaptioningManager captioningManager = (CaptioningManager) getContext().getSystemService("captioning");
        return (captioningManager == null || !captioningManager.isEnabled()) ? gj3.g : gj3.a(captioningManager.getUserStyle());
    }

    private <T extends View & a> void setView(T t) {
        removeView(this.j);
        View view = this.j;
        if (view instanceof WebViewSubtitleOutput) {
            ((WebViewSubtitleOutput) view).g();
        }
        this.j = t;
        this.i = t;
        addView(t);
    }

    public final h55 a(h55 h55Var) {
        CharSequence charSequence = h55Var.f19701a;
        if (!this.f) {
            h55.b bVarB = h55Var.a().q(-3.4028235E38f, Integer.MIN_VALUE).b();
            if (charSequence != null) {
                bVarB.o(charSequence.toString());
            }
            return bVarB.a();
        }
        if (this.g || charSequence == null) {
            return h55Var;
        }
        h55.b bVarQ = h55Var.a().q(-3.4028235E38f, Integer.MIN_VALUE);
        if (charSequence instanceof Spanned) {
            SpannableString spannableStringValueOf = SpannableString.valueOf(charSequence);
            for (AbsoluteSizeSpan absoluteSizeSpan : (AbsoluteSizeSpan[]) spannableStringValueOf.getSpans(0, spannableStringValueOf.length(), AbsoluteSizeSpan.class)) {
                spannableStringValueOf.removeSpan(absoluteSizeSpan);
            }
            for (RelativeSizeSpan relativeSizeSpan : (RelativeSizeSpan[]) spannableStringValueOf.getSpans(0, spannableStringValueOf.length(), RelativeSizeSpan.class)) {
                spannableStringValueOf.removeSpan(relativeSizeSpan);
            }
            bVarQ.o(spannableStringValueOf);
        }
        return bVarQ.a();
    }

    public void b(float f, boolean z) {
        c(z ? 1 : 0, f);
    }

    public final void c(int i, float f) {
        this.c = i;
        this.d = f;
        f();
    }

    public void d() {
        setStyle(getUserCaptionStyle());
    }

    public void e() {
        setFractionalTextSize(getUserCaptionFontScale() * 0.0533f);
    }

    public final void f() {
        this.i.a(getCuesWithStylingPreferencesApplied(), this.f8374b, this.d, this.c, this.e);
    }

    @Override // defpackage.j8p, com.google.android.exoplayer2.q.e
    public void onCues(List<h55> list) {
        setCues(list);
    }

    public void setApplyEmbeddedFontSizes(boolean z) {
        this.g = z;
        f();
    }

    public void setApplyEmbeddedStyles(boolean z) {
        this.f = z;
        f();
    }

    public void setBottomPaddingFraction(float f) {
        this.e = f;
        f();
    }

    public void setCues(List<h55> list) {
        if (list == null) {
            list = Collections.emptyList();
        }
        this.f8373a = list;
        f();
    }

    public void setFractionalTextSize(float f) {
        b(f, false);
    }

    public void setStyle(gj3 gj3Var) {
        this.f8374b = gj3Var;
        f();
    }

    public void setViewType(int i) {
        if (this.h == i) {
            return;
        }
        if (i == 1) {
            setView(new CanvasSubtitleOutput(getContext()));
        } else {
            if (i != 2) {
                throw new IllegalArgumentException();
            }
            setView(new WebViewSubtitleOutput(getContext()));
        }
        this.h = i;
    }

    public SubtitleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f8373a = Collections.emptyList();
        this.f8374b = gj3.g;
        this.c = 0;
        this.d = 0.0533f;
        this.e = 0.08f;
        this.f = true;
        this.g = true;
        CanvasSubtitleOutput canvasSubtitleOutput = new CanvasSubtitleOutput(context, attributeSet);
        this.i = canvasSubtitleOutput;
        this.j = canvasSubtitleOutput;
        addView(canvasSubtitleOutput);
        this.h = 1;
    }
}

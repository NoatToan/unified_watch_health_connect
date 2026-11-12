package androidx.media3.ui;

import android.content.Context;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.CaptioningManager;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kc.j;
import vb.h;

/* JADX INFO: loaded from: classes.dex */
public final class SubtitleView extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List<ea.a> f9982a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public kc.a f9983b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f9984c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f9985d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f9986e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f9987f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f9988g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public a f9989h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public View f9990i;

    public interface a {
        void a(List list, kc.a aVar, float f14, float f15);
    }

    public SubtitleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f9982a = Collections.EMPTY_LIST;
        this.f9983b = kc.a.f103841g;
        this.f9984c = 0.0533f;
        this.f9985d = 0.08f;
        this.f9986e = true;
        this.f9987f = true;
        androidx.media3.ui.a aVar = new androidx.media3.ui.a(context);
        this.f9989h = aVar;
        this.f9990i = aVar;
        addView(aVar);
        this.f9988g = 1;
    }

    private List<ea.a> getCuesWithStylingPreferencesApplied() {
        if (this.f9986e && this.f9987f) {
            return this.f9982a;
        }
        ArrayList arrayList = new ArrayList(this.f9982a.size());
        for (int i14 = 0; i14 < this.f9982a.size(); i14++) {
            ea.a aVar = this.f9982a.get(i14);
            aVar.getClass();
            ea.a.b bVar = new ea.a.b();
            if (!this.f9986e) {
                bVar.f63581n = false;
                CharSequence charSequence = bVar.f63568a;
                if (charSequence instanceof Spanned) {
                    if (!(charSequence instanceof Spannable)) {
                        bVar.f63568a = SpannableString.valueOf(charSequence);
                    }
                    CharSequence charSequence2 = bVar.f63568a;
                    charSequence2.getClass();
                    Spannable spannable = (Spannable) charSequence2;
                    for (Object obj : spannable.getSpans(0, spannable.length(), Object.class)) {
                        if (!(obj instanceof ea.e)) {
                            spannable.removeSpan(obj);
                        }
                    }
                }
                j.a(bVar);
            } else if (!this.f9987f) {
                j.a(bVar);
            }
            arrayList.add(bVar.a());
        }
        return arrayList;
    }

    private float getUserCaptionFontScale() {
        CaptioningManager captioningManager;
        if (isInEditMode() || (captioningManager = (CaptioningManager) getContext().getSystemService("captioning")) == null || !captioningManager.isEnabled()) {
            return 1.0f;
        }
        return captioningManager.getFontScale();
    }

    private kc.a getUserCaptionStyle() {
        if (isInEditMode()) {
            return kc.a.f103841g;
        }
        CaptioningManager captioningManager = (CaptioningManager) getContext().getSystemService("captioning");
        if (captioningManager == null || !captioningManager.isEnabled()) {
            return kc.a.f103841g;
        }
        CaptioningManager.CaptionStyle userStyle = captioningManager.getUserStyle();
        kc.a aVar = kc.a.f103841g;
        return new kc.a(userStyle.hasForegroundColor() ? userStyle.foregroundColor : aVar.f103842a, userStyle.hasBackgroundColor() ? userStyle.backgroundColor : aVar.f103843b, userStyle.hasWindowColor() ? userStyle.windowColor : aVar.f103844c, userStyle.hasEdgeType() ? userStyle.edgeType : aVar.f103845d, userStyle.hasEdgeColor() ? userStyle.edgeColor : aVar.f103846e, userStyle.getTypeface());
    }

    private <T extends View & a> void setView(T t7) {
        removeView(this.f9990i);
        View view2 = this.f9990i;
        if (view2 instanceof f) {
            ((f) view2).f10118b.destroy();
        }
        this.f9990i = t7;
        this.f9989h = t7;
        addView(t7);
    }

    public final void a() {
        setStyle(getUserCaptionStyle());
    }

    public final void b() {
        setFractionalTextSize(getUserCaptionFontScale() * 0.0533f);
    }

    public final void c() {
        this.f9989h.a(getCuesWithStylingPreferencesApplied(), this.f9983b, this.f9984c, this.f9985d);
    }

    public void setApplyEmbeddedFontSizes(boolean z14) {
        this.f9987f = z14;
        c();
    }

    public void setApplyEmbeddedStyles(boolean z14) {
        this.f9986e = z14;
        c();
    }

    public void setBottomPaddingFraction(float f14) {
        this.f9985d = f14;
        c();
    }

    public void setCues(List<ea.a> list) {
        if (list == null) {
            list = Collections.EMPTY_LIST;
        }
        this.f9982a = list;
        c();
    }

    public void setFractionalTextSize(float f14) {
        this.f9984c = f14;
        c();
    }

    public void setStyle(kc.a aVar) {
        this.f9983b = aVar;
        c();
    }

    public void setViewType(int i14) {
        if (this.f9988g == i14) {
            return;
        }
        if (i14 == 1) {
            setView(new androidx.media3.ui.a(getContext()));
        } else {
            if (i14 != 2) {
                h.w();
                return;
            }
            setView(new f(getContext()));
        }
        this.f9988g = i14;
    }

    public SubtitleView(Context context) {
        this(context, null);
    }
}

package com.google.android.exoplayer2.ui;

import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.MotionEvent;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.exoplayer2.text.Cue;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import com.google.common.base.Charsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class WebViewSubtitleOutput extends FrameLayout implements SubtitleView.a {
    private static final float h = 1.2f;
    private static final String i = "default_bg";
    private final CanvasSubtitleOutput a;
    private final WebView b;
    private List<Cue> c;
    private CaptionStyleCompat d;
    private float e;
    private int f;
    private float g;

    public class a extends WebView {
        public a(final WebViewSubtitleOutput this$0, Context context, AttributeSet attrs) {
            super(context, attrs);
        }

        @Override // android.webkit.WebView, android.view.View
        public boolean onTouchEvent(MotionEvent event) {
            super.onTouchEvent(event);
            return false;
        }

        @Override // android.view.View
        public boolean performClick() {
            super.performClick();
            return false;
        }
    }

    public static /* synthetic */ class b {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[Layout.Alignment.values().length];
            a = iArr;
            try {
                iArr[Layout.Alignment.ALIGN_NORMAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[Layout.Alignment.ALIGN_OPPOSITE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[Layout.Alignment.ALIGN_CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public WebViewSubtitleOutput(Context context) {
        this(context, null);
    }

    private static int b(int anchorType) {
        if (anchorType != 1) {
            return anchorType != 2 ? 0 : -100;
        }
        return -50;
    }

    private static String c(@Nullable Layout.Alignment alignment) {
        if (alignment == null) {
            return com.google.android.exoplayer2.text.ttml.b.m0;
        }
        int i2 = b.a[alignment.ordinal()];
        if (i2 != 1) {
            return i2 != 2 ? com.google.android.exoplayer2.text.ttml.b.m0 : "end";
        }
        return "start";
    }

    private static String d(CaptionStyleCompat style) {
        int i2 = style.edgeType;
        if (i2 == 1) {
            return Util.formatInvariant("1px 1px 0 %1$s, 1px -1px 0 %1$s, -1px 1px 0 %1$s, -1px -1px 0 %1$s", com.google.android.exoplayer2.ui.a.b(style.edgeColor));
        }
        if (i2 == 2) {
            return Util.formatInvariant("0.1em 0.12em 0.15em %s", com.google.android.exoplayer2.ui.a.b(style.edgeColor));
        }
        if (i2 != 3) {
            return i2 != 4 ? "unset" : Util.formatInvariant("-0.05em -0.05em 0.15em %s", com.google.android.exoplayer2.ui.a.b(style.edgeColor));
        }
        return Util.formatInvariant("0.06em 0.08em 0.15em %s", com.google.android.exoplayer2.ui.a.b(style.edgeColor));
    }

    private String e(int type, float size) {
        float fH = c0.h(type, size, getHeight(), (getHeight() - getPaddingTop()) - getPaddingBottom());
        return fH == -3.4028235E38f ? "unset" : Util.formatInvariant("%.2fpx", Float.valueOf(fH / getContext().getResources().getDisplayMetrics().density));
    }

    private static String f(int verticalType) {
        if (verticalType != 1) {
            return verticalType != 2 ? "horizontal-tb" : "vertical-lr";
        }
        return "vertical-rl";
    }

    private static String h(Cue cue) {
        float f = cue.shearDegrees;
        if (f == 0.0f) {
            return "";
        }
        int i2 = cue.verticalType;
        return Util.formatInvariant("%s(%.2fdeg)", (i2 == 2 || i2 == 1) ? "skewY" : "skewX", Float.valueOf(f));
    }

    /* JADX WARN: Code duplicated, block: B:25:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:26:0x010b  */
    /* JADX WARN: Code duplicated, block: B:29:0x0125  */
    /* JADX WARN: Code duplicated, block: B:30:0x0128  */
    /* JADX WARN: Code duplicated, block: B:33:0x013f  */
    /* JADX WARN: Code duplicated, block: B:35:0x0142 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:36:0x0144  */
    /* JADX WARN: Code duplicated, block: B:38:0x0148 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:40:0x014b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x014d  */
    /* JADX WARN: Code duplicated, block: B:48:0x015f  */
    /* JADX WARN: Code duplicated, block: B:52:0x0187  */
    /* JADX WARN: Code duplicated, block: B:58:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:62:0x0223  */
    /* JADX WARN: Code duplicated, block: B:63:0x023f  */
    private void i() {
        String invariant;
        int iB;
        boolean z;
        float f;
        String invariant2;
        int i2;
        int i3;
        int i4;
        String str;
        String str2;
        int i5;
        String str3;
        String str4;
        int i6;
        SpannedToHtmlConverter.HtmlAndCss htmlAndCssA;
        Iterator it2;
        SpannedToHtmlConverter.HtmlAndCss htmlAndCss;
        Layout.Alignment alignment;
        String str5;
        boolean z2;
        WebViewSubtitleOutput webViewSubtitleOutput = this;
        StringBuilder sb = new StringBuilder();
        char c = 0;
        String strE = webViewSubtitleOutput.e(webViewSubtitleOutput.f, webViewSubtitleOutput.e);
        int i7 = 1;
        float f2 = h;
        sb.append(Util.formatInvariant("<body><div style='-webkit-user-select:none;position:fixed;top:0;bottom:0;left:0;right:0;color:%s;font-size:%s;line-height:%.2f;text-shadow:%s;'>", com.google.android.exoplayer2.ui.a.b(webViewSubtitleOutput.d.foregroundColor), strE, Float.valueOf(h), d(webViewSubtitleOutput.d)));
        HashMap map = new HashMap();
        map.put(com.google.android.exoplayer2.ui.a.a(i), Util.formatInvariant("background-color:%s;", com.google.android.exoplayer2.ui.a.b(webViewSubtitleOutput.d.backgroundColor)));
        int i8 = 0;
        while (i8 < webViewSubtitleOutput.c.size()) {
            Cue cue = webViewSubtitleOutput.c.get(i8);
            float f3 = cue.position;
            float f4 = f3 != -3.4028235E38f ? f3 * 100.0f : 50.0f;
            int iB2 = b(cue.positionAnchor);
            float f5 = cue.line;
            if (f5 == -3.4028235E38f) {
                Object[] objArr = new Object[i7];
                objArr[c] = Float.valueOf((1.0f - webViewSubtitleOutput.g) * 100.0f);
                invariant = Util.formatInvariant("%.2f%%", objArr);
                iB = -100;
            } else if (cue.lineType != i7) {
                Object[] objArr2 = new Object[i7];
                objArr2[c] = Float.valueOf(f5 * 100.0f);
                invariant = Util.formatInvariant("%.2f%%", objArr2);
                iB = cue.verticalType == i7 ? -b(cue.lineAnchor) : b(cue.lineAnchor);
            } else {
                if (f5 >= 0.0f) {
                    Object[] objArr3 = new Object[i7];
                    objArr3[c] = Float.valueOf(f5 * f2);
                    invariant = Util.formatInvariant("%.2fem", objArr3);
                    iB = 0;
                } else {
                    Object[] objArr4 = new Object[i7];
                    objArr4[c] = Float.valueOf(((-f5) - 1.0f) * f2);
                    invariant = Util.formatInvariant("%.2fem", objArr4);
                    iB = 0;
                    z = true;
                }
                f = cue.size;
                if (f != -3.4028235E38f) {
                    Object[] objArr5 = new Object[i7];
                    objArr5[0] = Float.valueOf(f * 100.0f);
                    invariant2 = Util.formatInvariant("%.2f%%", objArr5);
                } else {
                    invariant2 = "fit-content";
                }
                String strC = c(cue.textAlignment);
                String strF = f(cue.verticalType);
                String strE2 = webViewSubtitleOutput.e(cue.textSizeType, cue.textSize);
                if (cue.windowColorSet) {
                    i2 = cue.windowColor;
                } else {
                    i2 = webViewSubtitleOutput.d.windowColor;
                }
                String strB = com.google.android.exoplayer2.ui.a.b(i2);
                i3 = iB;
                i4 = cue.verticalType;
                str = "right";
                str2 = "left";
                if (i4 != 1) {
                    if (z) {
                        str = "left";
                    }
                    str2 = "top";
                    i5 = 2;
                    str3 = str;
                } else if (i4 != 2) {
                    str3 = z ? "bottom" : "top";
                    i5 = 2;
                } else {
                    if (!z) {
                        str = "left";
                    }
                    str2 = "top";
                    i5 = 2;
                    str3 = str;
                }
                if (i4 != i5 || i4 == 1) {
                    str4 = "height";
                    i6 = i3;
                    i3 = iB2;
                } else {
                    str4 = ViewHierarchyConstants.DIMENSION_WIDTH_KEY;
                    i6 = iB2;
                }
                htmlAndCssA = SpannedToHtmlConverter.a(cue.text, getContext().getResources().getDisplayMetrics().density);
                it2 = map.keySet().iterator();
                while (it2.hasNext()) {
                    Iterator it3 = it2;
                    String str6 = (String) it2.next();
                    SpannedToHtmlConverter.HtmlAndCss htmlAndCss2 = htmlAndCssA;
                    str5 = (String) map.put(str6, (String) map.get(str6));
                    if (str5 != null || str5.equals(map.get(str6))) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    Assertions.checkState(z2);
                    it2 = it3;
                    htmlAndCssA = htmlAndCss2;
                }
                htmlAndCss = htmlAndCssA;
                sb.append(Util.formatInvariant("<div style='position:absolute;z-index:%s;%s:%.2f%%;%s:%s;%s:%s;text-align:%s;writing-mode:%s;font-size:%s;background-color:%s;transform:translate(%s%%,%s%%)%s;'>", Integer.valueOf(i8), str2, Float.valueOf(f4), str3, invariant, str4, invariant2, strC, strF, strE2, strB, Integer.valueOf(i6), Integer.valueOf(i3), h(cue)));
                sb.append(Util.formatInvariant("<span class='%s'>", i));
                alignment = cue.multiRowAlignment;
                if (alignment != null) {
                    sb.append(Util.formatInvariant("<span style='display:inline-block; text-align:%s;'>", c(alignment)));
                    sb.append(htmlAndCss.html);
                    sb.append("</span>");
                } else {
                    sb.append(htmlAndCss.html);
                }
                sb.append("</span>");
                sb.append("</div>");
                i8++;
                f2 = h;
                c = 0;
                webViewSubtitleOutput = this;
                i7 = 1;
            }
            z = false;
            f = cue.size;
            if (f != -3.4028235E38f) {
                Object[] objArr6 = new Object[i7];
                objArr6[0] = Float.valueOf(f * 100.0f);
                invariant2 = Util.formatInvariant("%.2f%%", objArr6);
            } else {
                invariant2 = "fit-content";
            }
            String strC2 = c(cue.textAlignment);
            String strF2 = f(cue.verticalType);
            String strE3 = webViewSubtitleOutput.e(cue.textSizeType, cue.textSize);
            if (cue.windowColorSet) {
                i2 = cue.windowColor;
            } else {
                i2 = webViewSubtitleOutput.d.windowColor;
            }
            String strB2 = com.google.android.exoplayer2.ui.a.b(i2);
            i3 = iB;
            i4 = cue.verticalType;
            str = "right";
            str2 = "left";
            if (i4 != 1) {
                if (z) {
                    str = "left";
                }
                str2 = "top";
                i5 = 2;
                str3 = str;
            } else if (i4 != 2) {
                if (z) {
                }
                i5 = 2;
            } else {
                if (!z) {
                    str = "left";
                }
                str2 = "top";
                i5 = 2;
                str3 = str;
            }
            if (i4 != i5) {
                str4 = "height";
                i6 = i3;
                i3 = iB2;
            } else {
                str4 = "height";
                i6 = i3;
                i3 = iB2;
            }
            htmlAndCssA = SpannedToHtmlConverter.a(cue.text, getContext().getResources().getDisplayMetrics().density);
            it2 = map.keySet().iterator();
            while (it2.hasNext()) {
                Iterator it4 = it2;
                String str7 = (String) it2.next();
                SpannedToHtmlConverter.HtmlAndCss htmlAndCss3 = htmlAndCssA;
                str5 = (String) map.put(str7, (String) map.get(str7));
                if (str5 != null) {
                    z2 = true;
                } else {
                    z2 = true;
                }
                Assertions.checkState(z2);
                it2 = it4;
                htmlAndCssA = htmlAndCss3;
            }
            htmlAndCss = htmlAndCssA;
            sb.append(Util.formatInvariant("<div style='position:absolute;z-index:%s;%s:%.2f%%;%s:%s;%s:%s;text-align:%s;writing-mode:%s;font-size:%s;background-color:%s;transform:translate(%s%%,%s%%)%s;'>", Integer.valueOf(i8), str2, Float.valueOf(f4), str3, invariant, str4, invariant2, strC2, strF2, strE3, strB2, Integer.valueOf(i6), Integer.valueOf(i3), h(cue)));
            sb.append(Util.formatInvariant("<span class='%s'>", i));
            alignment = cue.multiRowAlignment;
            if (alignment != null) {
                sb.append(Util.formatInvariant("<span style='display:inline-block; text-align:%s;'>", c(alignment)));
                sb.append(htmlAndCss.html);
                sb.append("</span>");
            } else {
                sb.append(htmlAndCss.html);
            }
            sb.append("</span>");
            sb.append("</div>");
            i8++;
            f2 = h;
            c = 0;
            webViewSubtitleOutput = this;
            i7 = 1;
        }
        sb.append("</div></body></html>");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("<html><head><style>");
        for (String str8 : map.keySet()) {
            sb2.append(str8);
            sb2.append("{");
            sb2.append((String) map.get(str8));
            sb2.append(com.alipay.sdk.m.u.i.d);
        }
        sb2.append("</style></head>");
        sb.insert(0, sb2.toString());
        this.b.loadData(Base64.encodeToString(sb.toString().getBytes(Charsets.UTF_8), 1), "text/html", "base64");
    }

    @Override // com.google.android.exoplayer2.ui.SubtitleView.a
    public void a(List<Cue> cues, CaptionStyleCompat style, float textSize, int textSizeType, float bottomPaddingFraction) {
        this.d = style;
        this.e = textSize;
        this.f = textSizeType;
        this.g = bottomPaddingFraction;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i2 = 0; i2 < cues.size(); i2++) {
            Cue cue = cues.get(i2);
            if (cue.bitmap != null) {
                arrayList.add(cue);
            } else {
                arrayList2.add(cue);
            }
        }
        if (!this.c.isEmpty() || !arrayList2.isEmpty()) {
            this.c = arrayList2;
            i();
        }
        this.a.a(arrayList, style, textSize, textSizeType, bottomPaddingFraction);
        invalidate();
    }

    public void g() {
        this.b.destroy();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        if (!changed || this.c.isEmpty()) {
            return;
        }
        i();
    }

    public WebViewSubtitleOutput(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        this.c = Collections.emptyList();
        this.d = CaptionStyleCompat.DEFAULT;
        this.e = 0.0533f;
        this.f = 0;
        this.g = 0.08f;
        CanvasSubtitleOutput canvasSubtitleOutput = new CanvasSubtitleOutput(context, attrs);
        this.a = canvasSubtitleOutput;
        a aVar = new a(this, context, attrs);
        this.b = aVar;
        aVar.setBackgroundColor(0);
        addView(canvasSubtitleOutput);
        addView(aVar);
    }
}

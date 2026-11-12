package com.google.android.exoplayer2.ui;

import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.MotionEvent;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.google.android.exoplayer2.text.Cue;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import com.google.common.base.Charsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import org.apache.commons.text.StringSubstitutor;

/* JADX INFO: loaded from: classes14.dex */
final class WebViewSubtitleOutput extends FrameLayout implements SubtitleView.Output {
    private static final float CSS_LINE_HEIGHT = 1.2f;
    private static final String DEFAULT_BACKGROUND_CSS_CLASS = "default_bg";
    private float bottomPaddingFraction;
    private final CanvasSubtitleOutput canvasSubtitleOutput;
    private float defaultTextSize;
    private int defaultTextSizeType;
    private CaptionStyleCompat style;
    private List<Cue> textCues;
    private final WebView webView;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.ui.WebViewSubtitleOutput$2, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$android$text$Layout$Alignment;

        static {
            int[] iArr = new int[Layout.Alignment.values().length];
            $SwitchMap$android$text$Layout$Alignment = iArr;
            try {
                iArr[Layout.Alignment.ALIGN_NORMAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$android$text$Layout$Alignment[Layout.Alignment.ALIGN_OPPOSITE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$android$text$Layout$Alignment[Layout.Alignment.ALIGN_CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public WebViewSubtitleOutput(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.textCues = Collections.EMPTY_LIST;
        this.style = CaptionStyleCompat.DEFAULT;
        this.defaultTextSize = 0.0533f;
        this.defaultTextSizeType = 0;
        this.bottomPaddingFraction = 0.08f;
        CanvasSubtitleOutput canvasSubtitleOutput = new CanvasSubtitleOutput(context, attributeSet);
        this.canvasSubtitleOutput = canvasSubtitleOutput;
        WebView webView = new WebView(this, context, attributeSet) { // from class: com.google.android.exoplayer2.ui.WebViewSubtitleOutput.1
            @Override // android.webkit.WebView, android.view.View
            public boolean onTouchEvent(MotionEvent motionEvent) {
                super.onTouchEvent(motionEvent);
                return false;
            }

            @Override // android.view.View
            public boolean performClick() {
                super.performClick();
                return false;
            }
        };
        this.webView = webView;
        webView.setBackgroundColor(0);
        addView(canvasSubtitleOutput);
        addView(webView);
    }

    private static int anchorTypeToTranslatePercent(int i14) {
        if (i14 != 1) {
            return i14 != 2 ? 0 : -100;
        }
        return -50;
    }

    private static String convertAlignmentToCss(Layout.Alignment alignment) {
        if (alignment == null) {
            return TtmlNode.CENTER;
        }
        int i14 = AnonymousClass2.$SwitchMap$android$text$Layout$Alignment[alignment.ordinal()];
        if (i14 != 1) {
            return i14 != 2 ? TtmlNode.CENTER : TtmlNode.END;
        }
        return TtmlNode.START;
    }

    private static String convertCaptionStyleToCssTextShadow(CaptionStyleCompat captionStyleCompat) {
        int i14 = captionStyleCompat.edgeType;
        if (i14 == 1) {
            return Util.formatInvariant("1px 1px 0 %1$s, 1px -1px 0 %1$s, -1px 1px 0 %1$s, -1px -1px 0 %1$s", HtmlUtils.toCssRgba(captionStyleCompat.edgeColor));
        }
        if (i14 == 2) {
            return Util.formatInvariant("0.1em 0.12em 0.15em %s", HtmlUtils.toCssRgba(captionStyleCompat.edgeColor));
        }
        if (i14 != 3) {
            return i14 != 4 ? "unset" : Util.formatInvariant("-0.05em -0.05em 0.15em %s", HtmlUtils.toCssRgba(captionStyleCompat.edgeColor));
        }
        return Util.formatInvariant("0.06em 0.08em 0.15em %s", HtmlUtils.toCssRgba(captionStyleCompat.edgeColor));
    }

    private String convertTextSizeToCss(int i14, float f14) {
        float fResolveTextSize = SubtitleViewUtils.resolveTextSize(i14, f14, getHeight(), (getHeight() - getPaddingTop()) - getPaddingBottom());
        return fResolveTextSize == -3.4028235E38f ? "unset" : Util.formatInvariant("%.2fpx", Float.valueOf(fResolveTextSize / getContext().getResources().getDisplayMetrics().density));
    }

    private static String convertVerticalTypeToCss(int i14) {
        if (i14 != 1) {
            return i14 != 2 ? "horizontal-tb" : "vertical-lr";
        }
        return "vertical-rl";
    }

    private static String getBlockShearTransformFunction(Cue cue) {
        float f14 = cue.shearDegrees;
        if (f14 == 0.0f) {
            return "";
        }
        int i14 = cue.verticalType;
        return Util.formatInvariant("%s(%.2fdeg)", (i14 == 2 || i14 == 1) ? "skewY" : "skewX", Float.valueOf(f14));
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:28:0x0107  */
    /* JADX WARN: Code duplicated, block: B:31:0x0122  */
    /* JADX WARN: Code duplicated, block: B:32:0x0125  */
    /* JADX WARN: Code duplicated, block: B:35:0x0138 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:36:0x013a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:37:0x013c  */
    /* JADX WARN: Code duplicated, block: B:39:0x0143 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x0146  */
    /* JADX WARN: Code duplicated, block: B:43:0x014c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:50:0x0159  */
    /* JADX WARN: Code duplicated, block: B:54:0x0183  */
    /* JADX WARN: Code duplicated, block: B:60:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:64:0x01db  */
    /* JADX WARN: Code duplicated, block: B:65:0x01f7  */
    private void updateWebView() {
        float f14;
        String invariant;
        int iAnchorTypeToTranslatePercent;
        boolean z14;
        String str;
        float f15;
        String invariant2;
        int i14;
        int i15;
        String str2;
        String str3;
        Object obj;
        String str4;
        SpannedToHtmlConverter.HtmlAndCss htmlAndCssConvert;
        Layout.Alignment alignment;
        String str5;
        boolean z15;
        StringBuilder sb3 = new StringBuilder();
        String cssRgba = HtmlUtils.toCssRgba(this.style.foregroundColor);
        String strConvertTextSizeToCss = convertTextSizeToCss(this.defaultTextSizeType, this.defaultTextSize);
        float f16 = CSS_LINE_HEIGHT;
        sb3.append(Util.formatInvariant("<body><div style='-webkit-user-select:none;position:fixed;top:0;bottom:0;left:0;right:0;color:%s;font-size:%s;line-height:%.2f;text-shadow:%s;'>", cssRgba, strConvertTextSizeToCss, Float.valueOf(CSS_LINE_HEIGHT), convertCaptionStyleToCssTextShadow(this.style)));
        HashMap map = new HashMap();
        map.put(HtmlUtils.cssAllClassDescendantsSelector(DEFAULT_BACKGROUND_CSS_CLASS), Util.formatInvariant("background-color:%s;", HtmlUtils.toCssRgba(this.style.backgroundColor)));
        int i16 = 0;
        while (i16 < this.textCues.size()) {
            Cue cue = this.textCues.get(i16);
            float f17 = cue.position;
            float f18 = f17 != -3.4028235E38f ? f17 * 100.0f : 50.0f;
            int iAnchorTypeToTranslatePercent2 = anchorTypeToTranslatePercent(cue.positionAnchor);
            float f19 = cue.line;
            float f22 = f16;
            if (f19 != -3.4028235E38f) {
                if (cue.lineType != 1) {
                    String invariant3 = Util.formatInvariant("%.2f%%", Float.valueOf(f19 * 100.0f));
                    int i17 = cue.verticalType;
                    int i18 = cue.lineAnchor;
                    iAnchorTypeToTranslatePercent = i17 == 1 ? -anchorTypeToTranslatePercent(i18) : anchorTypeToTranslatePercent(i18);
                    f14 = -3.4028235E38f;
                    str = invariant3;
                    z14 = false;
                } else {
                    f14 = -3.4028235E38f;
                    if (f19 >= 0.0f) {
                        invariant = Util.formatInvariant("%.2fem", Float.valueOf(f19 * f22));
                        z14 = false;
                        iAnchorTypeToTranslatePercent = 0;
                    } else {
                        invariant = Util.formatInvariant("%.2fem", Float.valueOf(((-f19) - 1.0f) * f22));
                        iAnchorTypeToTranslatePercent = 0;
                        z14 = true;
                    }
                }
                f15 = cue.size;
                if (f15 != f14) {
                    invariant2 = Util.formatInvariant("%.2f%%", Float.valueOf(f15 * 100.0f));
                } else {
                    invariant2 = "fit-content";
                }
                String str6 = invariant2;
                String strConvertAlignmentToCss = convertAlignmentToCss(cue.textAlignment);
                String strConvertVerticalTypeToCss = convertVerticalTypeToCss(cue.verticalType);
                String strConvertTextSizeToCss2 = convertTextSizeToCss(cue.textSizeType, cue.textSize);
                if (cue.windowColorSet) {
                    i14 = cue.windowColor;
                } else {
                    i14 = this.style.windowColor;
                }
                String cssRgba2 = HtmlUtils.toCssRgba(i14);
                i15 = cue.verticalType;
                str2 = TtmlNode.RIGHT;
                if (i15 != 1) {
                    if (z14) {
                        str2 = TtmlNode.LEFT;
                    }
                    str3 = str2;
                    obj = "top";
                } else if (i15 != 2) {
                    String str7 = z14 ? "bottom" : "top";
                    obj = TtmlNode.LEFT;
                    str3 = str7;
                } else {
                    if (!z14) {
                        str2 = TtmlNode.LEFT;
                    }
                    str3 = str2;
                    obj = "top";
                }
                if (i15 != 2 || i15 == 1) {
                    str4 = "height";
                    int i19 = iAnchorTypeToTranslatePercent;
                    iAnchorTypeToTranslatePercent = iAnchorTypeToTranslatePercent2;
                    iAnchorTypeToTranslatePercent2 = i19;
                } else {
                    str4 = "width";
                }
                String str8 = str4;
                htmlAndCssConvert = SpannedToHtmlConverter.convert(cue.text, getContext().getResources().getDisplayMetrics().density);
                for (String str9 : map.keySet()) {
                    str5 = (String) map.put(str9, (String) map.get(str9));
                    if (str5 != null || str5.equals(map.get(str9))) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    Assertions.checkState(z15);
                }
                sb3.append(Util.formatInvariant("<div style='position:absolute;z-index:%s;%s:%.2f%%;%s:%s;%s:%s;text-align:%s;writing-mode:%s;font-size:%s;background-color:%s;transform:translate(%s%%,%s%%)%s;'>", Integer.valueOf(i16), obj, Float.valueOf(f18), str3, str, str8, str6, strConvertAlignmentToCss, strConvertVerticalTypeToCss, strConvertTextSizeToCss2, cssRgba2, Integer.valueOf(iAnchorTypeToTranslatePercent2), Integer.valueOf(iAnchorTypeToTranslatePercent), getBlockShearTransformFunction(cue)));
                sb3.append(Util.formatInvariant("<span class='%s'>", DEFAULT_BACKGROUND_CSS_CLASS));
                alignment = cue.multiRowAlignment;
                if (alignment != null) {
                    sb3.append(Util.formatInvariant("<span style='display:inline-block; text-align:%s;'>", convertAlignmentToCss(alignment)));
                    sb3.append(htmlAndCssConvert.html);
                    sb3.append("</span>");
                } else {
                    sb3.append(htmlAndCssConvert.html);
                }
                sb3.append("</span></div>");
                i16++;
                f16 = f22;
            } else {
                f14 = -3.4028235E38f;
                invariant = Util.formatInvariant("%.2f%%", Float.valueOf((1.0f - this.bottomPaddingFraction) * 100.0f));
                iAnchorTypeToTranslatePercent = -100;
                z14 = false;
            }
            str = invariant;
            f15 = cue.size;
            if (f15 != f14) {
                invariant2 = Util.formatInvariant("%.2f%%", Float.valueOf(f15 * 100.0f));
            } else {
                invariant2 = "fit-content";
            }
            String str10 = invariant2;
            String strConvertAlignmentToCss2 = convertAlignmentToCss(cue.textAlignment);
            String strConvertVerticalTypeToCss2 = convertVerticalTypeToCss(cue.verticalType);
            String strConvertTextSizeToCss3 = convertTextSizeToCss(cue.textSizeType, cue.textSize);
            if (cue.windowColorSet) {
                i14 = cue.windowColor;
            } else {
                i14 = this.style.windowColor;
            }
            String cssRgba3 = HtmlUtils.toCssRgba(i14);
            i15 = cue.verticalType;
            str2 = TtmlNode.RIGHT;
            if (i15 != 1) {
                if (z14) {
                    str2 = TtmlNode.LEFT;
                }
                str3 = str2;
                obj = "top";
            } else if (i15 != 2) {
                if (z14) {
                }
                obj = TtmlNode.LEFT;
                str3 = str7;
            } else {
                if (!z14) {
                    str2 = TtmlNode.LEFT;
                }
                str3 = str2;
                obj = "top";
            }
            if (i15 != 2) {
                str4 = "height";
                int i110 = iAnchorTypeToTranslatePercent;
                iAnchorTypeToTranslatePercent = iAnchorTypeToTranslatePercent2;
                iAnchorTypeToTranslatePercent2 = i110;
            } else {
                str4 = "height";
                int i111 = iAnchorTypeToTranslatePercent;
                iAnchorTypeToTranslatePercent = iAnchorTypeToTranslatePercent2;
                iAnchorTypeToTranslatePercent2 = i111;
            }
            String str11 = str4;
            htmlAndCssConvert = SpannedToHtmlConverter.convert(cue.text, getContext().getResources().getDisplayMetrics().density);
            while (r10.hasNext()) {
                str5 = (String) map.put(str9, (String) map.get(str9));
                if (str5 != null) {
                    z15 = true;
                } else {
                    z15 = true;
                }
                Assertions.checkState(z15);
            }
            sb3.append(Util.formatInvariant("<div style='position:absolute;z-index:%s;%s:%.2f%%;%s:%s;%s:%s;text-align:%s;writing-mode:%s;font-size:%s;background-color:%s;transform:translate(%s%%,%s%%)%s;'>", Integer.valueOf(i16), obj, Float.valueOf(f18), str3, str, str11, str10, strConvertAlignmentToCss2, strConvertVerticalTypeToCss2, strConvertTextSizeToCss3, cssRgba3, Integer.valueOf(iAnchorTypeToTranslatePercent2), Integer.valueOf(iAnchorTypeToTranslatePercent), getBlockShearTransformFunction(cue)));
            sb3.append(Util.formatInvariant("<span class='%s'>", DEFAULT_BACKGROUND_CSS_CLASS));
            alignment = cue.multiRowAlignment;
            if (alignment != null) {
                sb3.append(Util.formatInvariant("<span style='display:inline-block; text-align:%s;'>", convertAlignmentToCss(alignment)));
                sb3.append(htmlAndCssConvert.html);
                sb3.append("</span>");
            } else {
                sb3.append(htmlAndCssConvert.html);
            }
            sb3.append("</span></div>");
            i16++;
            f16 = f22;
        }
        sb3.append("</div></body></html>");
        StringBuilder sb4 = new StringBuilder("<html><head><style>");
        for (String str12 : map.keySet()) {
            sb4.append(str12);
            sb4.append("{");
            sb4.append((String) map.get(str12));
            sb4.append(StringSubstitutor.DEFAULT_VAR_END);
        }
        sb4.append("</style></head>");
        sb3.insert(0, sb4.toString());
        this.webView.loadData(Base64.encodeToString(sb3.toString().getBytes(Charsets.UTF_8), 1), "text/html", "base64");
    }

    public void destroy() {
        this.webView.destroy();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z14, int i14, int i15, int i16, int i17) {
        super.onLayout(z14, i14, i15, i16, i17);
        if (!z14 || this.textCues.isEmpty()) {
            return;
        }
        updateWebView();
    }

    @Override // com.google.android.exoplayer2.ui.SubtitleView.Output
    public void update(List<Cue> list, CaptionStyleCompat captionStyleCompat, float f14, int i14, float f15) {
        this.style = captionStyleCompat;
        this.defaultTextSize = f14;
        this.defaultTextSizeType = i14;
        this.bottomPaddingFraction = f15;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i15 = 0; i15 < list.size(); i15++) {
            Cue cue = list.get(i15);
            if (cue.bitmap != null) {
                arrayList.add(cue);
            } else {
                arrayList2.add(cue);
            }
        }
        if (!this.textCues.isEmpty() || !arrayList2.isEmpty()) {
            this.textCues = arrayList2;
            updateWebView();
        }
        this.canvasSubtitleOutput.update(arrayList, captionStyleCompat, f14, i14, f15);
        invalidate();
    }

    public WebViewSubtitleOutput(Context context) {
        this(context, null);
    }
}

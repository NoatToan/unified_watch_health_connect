package com.google.android.exoplayer2.ui;

import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.MotionEvent;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.miui.tsmclient.net.TSMAuthContants;
import com.xiaomi.fitness.statistics.StatConstants;
import com.xiaomi.smarthome.framework.plugin.rn.viewshot.ViewShot;
import defpackage.bu3;
import defpackage.gj3;
import defpackage.h55;
import defpackage.ofc;
import defpackage.rk1;
import defpackage.wlq;
import defpackage.yoo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
final class WebViewSubtitleOutput extends FrameLayout implements SubtitleView.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CanvasSubtitleOutput f8381a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WebView f8382b;
    public List<h55> c;
    public gj3 d;
    public float e;
    public int f;
    public float g;

    public class a extends WebView {
        public a(WebViewSubtitleOutput webViewSubtitleOutput, Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

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
    }

    public static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f8383a;

        static {
            int[] iArr = new int[Layout.Alignment.values().length];
            f8383a = iArr;
            try {
                iArr[Layout.Alignment.ALIGN_NORMAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f8383a[Layout.Alignment.ALIGN_OPPOSITE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f8383a[Layout.Alignment.ALIGN_CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public WebViewSubtitleOutput(Context context) {
        this(context, null);
    }

    public static int b(int i) {
        if (i != 1) {
            return i != 2 ? 0 : -100;
        }
        return -50;
    }

    public static String c(Layout.Alignment alignment) {
        if (alignment == null) {
            return "center";
        }
        int i = b.f8383a[alignment.ordinal()];
        if (i != 1) {
            return i != 2 ? "center" : StatConstants.PARAM_END;
        }
        return StatConstants.PARAM_START;
    }

    public static String d(gj3 gj3Var) {
        int i = gj3Var.d;
        if (i == 1) {
            return wlq.D("1px 1px 0 %1$s, 1px -1px 0 %1$s, -1px 1px 0 %1$s, -1px -1px 0 %1$s", ofc.b(gj3Var.e));
        }
        if (i == 2) {
            return wlq.D("0.1em 0.12em 0.15em %s", ofc.b(gj3Var.e));
        }
        if (i != 3) {
            return i != 4 ? "unset" : wlq.D("-0.05em -0.05em 0.15em %s", ofc.b(gj3Var.e));
        }
        return wlq.D("0.06em 0.08em 0.15em %s", ofc.b(gj3Var.e));
    }

    public static String f(int i) {
        if (i != 1) {
            return i != 2 ? "horizontal-tb" : "vertical-lr";
        }
        return "vertical-rl";
    }

    public static String h(h55 h55Var) {
        float f = h55Var.q;
        if (f == 0.0f) {
            return "";
        }
        int i = h55Var.p;
        return wlq.D("%s(%.2fdeg)", (i == 2 || i == 1) ? "skewY" : "skewX", Float.valueOf(f));
    }

    @Override // com.google.android.exoplayer2.ui.SubtitleView.a
    public void a(List<h55> list, gj3 gj3Var, float f, int i, float f2) {
        this.d = gj3Var;
        this.e = f;
        this.f = i;
        this.g = f2;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i2 = 0; i2 < list.size(); i2++) {
            h55 h55Var = list.get(i2);
            if (h55Var.d != null) {
                arrayList.add(h55Var);
            } else {
                arrayList2.add(h55Var);
            }
        }
        if (!this.c.isEmpty() || !arrayList2.isEmpty()) {
            this.c = arrayList2;
            i();
        }
        this.f8381a.a(arrayList, gj3Var, f, i, f2);
        invalidate();
    }

    public final String e(int i, float f) {
        float fA = yoo.a(i, f, getHeight(), (getHeight() - getPaddingTop()) - getPaddingBottom());
        return fA == -3.4028235E38f ? "unset" : wlq.D("%.2fpx", Float.valueOf(fA / getContext().getResources().getDisplayMetrics().density));
    }

    public void g() {
        this.f8382b.destroy();
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:28:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:31:0x0119  */
    /* JADX WARN: Code duplicated, block: B:32:0x011c  */
    /* JADX WARN: Code duplicated, block: B:35:0x0130 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:36:0x0132 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:37:0x0134  */
    /* JADX WARN: Code duplicated, block: B:39:0x013b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x013e  */
    /* JADX WARN: Code duplicated, block: B:43:0x0144 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:50:0x0152  */
    /* JADX WARN: Code duplicated, block: B:54:0x017d  */
    /* JADX WARN: Code duplicated, block: B:60:0x019e  */
    /* JADX WARN: Code duplicated, block: B:64:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:65:0x01f1  */
    public final void i() {
        String strD;
        int iB;
        String strD2;
        boolean z;
        float f;
        String strD3;
        int i;
        int i2;
        String str;
        String str2;
        Object obj;
        Object obj2;
        com.google.android.exoplayer2.ui.a.b bVarA;
        Layout.Alignment alignment;
        String str3;
        boolean z2;
        StringBuilder sb = new StringBuilder();
        float f2 = 1.2f;
        sb.append(wlq.D("<body><div style='-webkit-user-select:none;position:fixed;top:0;bottom:0;left:0;right:0;color:%s;font-size:%s;line-height:%.2f;text-shadow:%s;'>", ofc.b(this.d.f19045a), e(this.f, this.e), Float.valueOf(1.2f), d(this.d)));
        HashMap map = new HashMap();
        map.put(ofc.a("default_bg"), wlq.D("background-color:%s;", ofc.b(this.d.f19046b)));
        int i3 = 0;
        while (i3 < this.c.size()) {
            h55 h55Var = this.c.get(i3);
            float f3 = h55Var.h;
            float f4 = f3 != -3.4028235E38f ? f3 * 100.0f : 50.0f;
            int iB2 = b(h55Var.i);
            float f5 = h55Var.e;
            if (f5 != -3.4028235E38f) {
                if (h55Var.f != 1) {
                    strD = wlq.D("%.2f%%", Float.valueOf(f5 * 100.0f));
                    iB = h55Var.p == 1 ? -b(h55Var.g) : b(h55Var.g);
                } else {
                    if (f5 >= 0.0f) {
                        strD2 = wlq.D("%.2fem", Float.valueOf(f5 * f2));
                        z = false;
                    } else {
                        strD2 = wlq.D("%.2fem", Float.valueOf(((-f5) - 1.0f) * f2));
                        z = true;
                    }
                    iB = 0;
                }
                f = h55Var.j;
                if (f != -3.4028235E38f) {
                    strD3 = wlq.D("%.2f%%", Float.valueOf(f * 100.0f));
                } else {
                    strD3 = "fit-content";
                }
                String str4 = strD3;
                String strC = c(h55Var.f19702b);
                String strF = f(h55Var.p);
                String strE = e(h55Var.n, h55Var.o);
                if (h55Var.l) {
                    i = h55Var.m;
                } else {
                    i = this.d.c;
                }
                String strB = ofc.b(i);
                i2 = h55Var.p;
                str = TSMAuthContants.PARAM_KEY_RIGHT;
                if (i2 != 1) {
                    if (z) {
                        str = "left";
                    }
                    str2 = str;
                    obj = "top";
                } else if (i2 != 2) {
                    str2 = z ? "bottom" : "top";
                    obj = "left";
                } else {
                    if (!z) {
                        str = "left";
                    }
                    str2 = str;
                    obj = "top";
                }
                if (i2 != 2 || i2 == 1) {
                    obj2 = "height";
                    int i4 = iB;
                    iB = iB2;
                    iB2 = i4;
                } else {
                    obj2 = "width";
                }
                bVarA = com.google.android.exoplayer2.ui.a.a(h55Var.f19701a, getContext().getResources().getDisplayMetrics().density);
                for (String str5 : map.keySet()) {
                    str3 = (String) map.put(str5, (String) map.get(str5));
                    if (str3 != null || str3.equals(map.get(str5))) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    rk1.g(z2);
                }
                sb.append(wlq.D("<div style='position:absolute;z-index:%s;%s:%.2f%%;%s:%s;%s:%s;text-align:%s;writing-mode:%s;font-size:%s;background-color:%s;transform:translate(%s%%,%s%%)%s;'>", Integer.valueOf(i3), obj, Float.valueOf(f4), str2, strD2, obj2, str4, strC, strF, strE, strB, Integer.valueOf(iB2), Integer.valueOf(iB), h(h55Var)));
                sb.append(wlq.D("<span class='%s'>", "default_bg"));
                alignment = h55Var.c;
                if (alignment != null) {
                    sb.append(wlq.D("<span style='display:inline-block; text-align:%s;'>", c(alignment)));
                    sb.append(bVarA.f8385a);
                    sb.append("</span>");
                } else {
                    sb.append(bVarA.f8385a);
                }
                sb.append("</span>");
                sb.append("</div>");
                i3++;
                f2 = 1.2f;
            } else {
                strD = wlq.D("%.2f%%", Float.valueOf((1.0f - this.g) * 100.0f));
                iB = -100;
            }
            strD2 = strD;
            z = false;
            f = h55Var.j;
            if (f != -3.4028235E38f) {
                strD3 = wlq.D("%.2f%%", Float.valueOf(f * 100.0f));
            } else {
                strD3 = "fit-content";
            }
            String str6 = strD3;
            String strC2 = c(h55Var.f19702b);
            String strF2 = f(h55Var.p);
            String strE2 = e(h55Var.n, h55Var.o);
            if (h55Var.l) {
                i = h55Var.m;
            } else {
                i = this.d.c;
            }
            String strB2 = ofc.b(i);
            i2 = h55Var.p;
            str = TSMAuthContants.PARAM_KEY_RIGHT;
            if (i2 != 1) {
                if (z) {
                    str = "left";
                }
                str2 = str;
                obj = "top";
            } else if (i2 != 2) {
                str2 = z ? "bottom" : "top";
                obj = "left";
            } else {
                if (!z) {
                    str = "left";
                }
                str2 = str;
                obj = "top";
            }
            if (i2 != 2) {
                obj2 = "height";
                int i5 = iB;
                iB = iB2;
                iB2 = i5;
            } else {
                obj2 = "height";
                int i6 = iB;
                iB = iB2;
                iB2 = i6;
            }
            bVarA = com.google.android.exoplayer2.ui.a.a(h55Var.f19701a, getContext().getResources().getDisplayMetrics().density);
            while (r5.hasNext()) {
                str3 = (String) map.put(str5, (String) map.get(str5));
                if (str3 != null) {
                    z2 = true;
                } else {
                    z2 = true;
                }
                rk1.g(z2);
            }
            sb.append(wlq.D("<div style='position:absolute;z-index:%s;%s:%.2f%%;%s:%s;%s:%s;text-align:%s;writing-mode:%s;font-size:%s;background-color:%s;transform:translate(%s%%,%s%%)%s;'>", Integer.valueOf(i3), obj, Float.valueOf(f4), str2, strD2, obj2, str6, strC2, strF2, strE2, strB2, Integer.valueOf(iB2), Integer.valueOf(iB), h(h55Var)));
            sb.append(wlq.D("<span class='%s'>", "default_bg"));
            alignment = h55Var.c;
            if (alignment != null) {
                sb.append(wlq.D("<span style='display:inline-block; text-align:%s;'>", c(alignment)));
                sb.append(bVarA.f8385a);
                sb.append("</span>");
            } else {
                sb.append(bVarA.f8385a);
            }
            sb.append("</span>");
            sb.append("</div>");
            i3++;
            f2 = 1.2f;
        }
        sb.append("</div></body></html>");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("<html><head><style>");
        for (String str7 : map.keySet()) {
            sb2.append(str7);
            sb2.append("{");
            sb2.append((String) map.get(str7));
            sb2.append("}");
        }
        sb2.append("</style></head>");
        sb.insert(0, sb2.toString());
        this.f8382b.loadData(Base64.encodeToString(sb.toString().getBytes(bu3.c), 1), "text/html", ViewShot.Results.BASE_64);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (!z || this.c.isEmpty()) {
            return;
        }
        i();
    }

    public WebViewSubtitleOutput(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = Collections.emptyList();
        this.d = gj3.g;
        this.e = 0.0533f;
        this.f = 0;
        this.g = 0.08f;
        CanvasSubtitleOutput canvasSubtitleOutput = new CanvasSubtitleOutput(context, attributeSet);
        this.f8381a = canvasSubtitleOutput;
        a aVar = new a(this, context, attributeSet);
        this.f8382b = aVar;
        aVar.setBackgroundColor(0);
        addView(canvasSubtitleOutput);
        addView(aVar);
    }
}

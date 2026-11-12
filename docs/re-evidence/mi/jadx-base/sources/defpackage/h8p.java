package defpackage;

import android.content.Context;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.LruCache;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.views.text.ReactAbsoluteSizeSpan;
import com.facebook.react.views.text.ReactBackgroundColorSpan;
import com.facebook.react.views.text.ReactForegroundColorSpan;
import com.facebook.react.views.text.ReactStrikethroughSpan;
import com.facebook.react.views.text.ReactUnderlineSpan;
import com.facebook.react.views.text.TextTransform;
import com.facebook.yoga.YogaMeasureMode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class h8p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final TextPaint f19809a = new TextPaint(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f19810b = new Object();
    public static LruCache<String, Spannable> c = new LruCache<>(100);

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f19811a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f19812b;
        public xej c;

        public a(int i, int i2, xej xejVar) {
            this.f19811a = i;
            this.f19812b = i2;
            this.c = xejVar;
        }

        public void a(SpannableStringBuilder spannableStringBuilder, int i) {
            int i2 = this.f19811a;
            spannableStringBuilder.setSpan(this.c, i2, this.f19812b, ((i << 16) & 16711680) | ((i2 == 0 ? 18 : 34) & (-16711681)));
        }
    }

    public static void a(Context context, ReadableArray readableArray, SpannableStringBuilder spannableStringBuilder, List<a> list) {
        int size = readableArray.size();
        for (int i = 0; i < size; i++) {
            ReadableMap map = readableArray.getMap(i);
            int length = spannableStringBuilder.length();
            m7p m7pVar = new m7p(new yej(map.getMap("textAttributes")));
            spannableStringBuilder.append((CharSequence) TextTransform.apply(map.getString("string"), m7pVar.p));
            int length2 = spannableStringBuilder.length();
            if (length2 >= length) {
                if (m7pVar.c) {
                    list.add(new a(length, length2, new ReactForegroundColorSpan(m7pVar.e)));
                }
                if (m7pVar.f) {
                    list.add(new a(length, length2, new ReactBackgroundColorSpan(m7pVar.g)));
                }
                if (!Float.isNaN(m7pVar.f25853b)) {
                    list.add(new a(length, length2, new wd5(m7pVar.f25853b)));
                }
                list.add(new a(length, length2, new ReactAbsoluteSizeSpan(m7pVar.i)));
                if (m7pVar.x != -1 || m7pVar.y != -1 || m7pVar.z != null) {
                    list.add(new a(length, length2, new je5(m7pVar.x, m7pVar.y, m7pVar.z, context.getAssets())));
                }
                if (m7pVar.u) {
                    list.add(new a(length, length2, new ReactUnderlineSpan()));
                }
                if (m7pVar.v) {
                    list.add(new a(length, length2, new ReactStrikethroughSpan()));
                }
                if (m7pVar.q != 0.0f || m7pVar.f25855r != 0.0f) {
                    list.add(new a(length, length2, new o2m(m7pVar.q, m7pVar.f25855r, m7pVar.s, m7pVar.t)));
                }
                if (!Float.isNaN(m7pVar.c())) {
                    list.add(new a(length, length2, new be5(m7pVar.c())));
                }
                list.add(new a(length, length2, new bfj(map.getInt("reactTag"))));
            }
        }
    }

    public static Spannable b(Context context, ReadableMap readableMap) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayList arrayList = new ArrayList();
        a(context, readableMap.getArray("fragments"), spannableStringBuilder, arrayList);
        Iterator it = arrayList.iterator();
        int i = 0;
        while (it.hasNext()) {
            ((a) it.next()).a(spannableStringBuilder, i);
            i++;
        }
        return spannableStringBuilder;
    }

    public static Spannable c(Context context, ReadableMap readableMap) {
        String string = readableMap.toString();
        Object obj = f19810b;
        synchronized (obj) {
            try {
                Spannable spannable = c.get(string);
                if (spannable != null) {
                    return spannable;
                }
                Spannable spannableB = b(context, readableMap);
                synchronized (obj) {
                    c.put(string, spannableB);
                }
                return spannableB;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static long d(Context context, ReadableMap readableMap, ReadableMap readableMap2, float f, YogaMeasureMode yogaMeasureMode, float f2, YogaMeasureMode yogaMeasureMode2) {
        Layout layoutBuild;
        TextPaint textPaint = f19809a;
        Spannable spannableC = c(context, readableMap);
        if (spannableC == null) {
            throw new IllegalStateException("Spannable element has not been prepared in onBeforeLayout");
        }
        BoringLayout.Metrics metricsIsBoring = BoringLayout.isBoring(spannableC, textPaint);
        float desiredWidth = metricsIsBoring == null ? Layout.getDesiredWidth(spannableC, textPaint) : Float.NaN;
        boolean z = yogaMeasureMode == YogaMeasureMode.UNDEFINED || f < 0.0f;
        if (metricsIsBoring != null || (!z && (j0s.a(desiredWidth) || desiredWidth > f))) {
            layoutBuild = (metricsIsBoring == null || (!z && ((float) metricsIsBoring.width) > f)) ? StaticLayout.Builder.obtain(spannableC, 0, spannableC.length(), textPaint, (int) f).setAlignment(Layout.Alignment.ALIGN_NORMAL).setLineSpacing(0.0f, 1.0f).setIncludePad(true).setBreakStrategy(1).setHyphenationFrequency(1).build() : BoringLayout.make(spannableC, textPaint, metricsIsBoring.width, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, metricsIsBoring, true);
        } else {
            layoutBuild = StaticLayout.Builder.obtain(spannableC, 0, spannableC.length(), textPaint, (int) Math.ceil(desiredWidth)).setAlignment(Layout.Alignment.ALIGN_NORMAL).setLineSpacing(0.0f, 1.0f).setIncludePad(true).setBreakStrategy(1).setHyphenationFrequency(1).build();
        }
        int i = readableMap2.hasKey("maximumNumberOfLines") ? readableMap2.getInt("maximumNumberOfLines") : -1;
        int width = layoutBuild.getWidth();
        if (edj.g != 1.0f) {
            width = (int) Math.ceil(layoutBuild.getWidth() * edj.g);
        }
        return k0s.a(exh.f(width), exh.f((i == -1 || i == 0 || i >= layoutBuild.getLineCount()) ? layoutBuild.getHeight() : layoutBuild.getLineBottom(i - 1)));
    }
}

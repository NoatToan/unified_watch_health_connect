package defpackage;

import android.annotation.TargetApi;
import android.os.Build;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.Spannable;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextPaint;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.e;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.facebook.yoga.YogaDirection;
import com.facebook.yoga.YogaMeasureFunction;
import com.facebook.yoga.YogaMeasureMode;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
@TargetApi(23)
public class tfj extends ncj {
    public static final TextPaint A = new TextPaint(1);
    public Spannable x;
    public boolean y;
    public final YogaMeasureFunction z = new a();

    public class a implements YogaMeasureFunction {
        public a() {
        }

        @Override // com.facebook.yoga.YogaMeasureFunction
        public long measure(l0s l0sVar, float f, YogaMeasureMode yogaMeasureMode, float f2, YogaMeasureMode yogaMeasureMode2) {
            Layout layoutBuild;
            TextPaint textPaint = tfj.A;
            textPaint.density = tfj.this.getThemedContext().getResources().getDisplayMetrics().density;
            textPaint.setTextSize(tfj.this.f27781a.c());
            Spanned spanned = (Spanned) sk1.d(tfj.this.x, "Spannable element has not been prepared in onBeforeLayout");
            BoringLayout.Metrics metricsIsBoring = BoringLayout.isBoring(spanned, textPaint);
            float desiredWidth = metricsIsBoring == null ? Layout.getDesiredWidth(spanned, textPaint) : Float.NaN;
            boolean z = yogaMeasureMode == YogaMeasureMode.UNDEFINED || f < 0.0f;
            Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
            int iH = tfj.this.h();
            if (iH == 1) {
                alignment = Layout.Alignment.ALIGN_CENTER;
            } else if (iH != 3 && iH == 5) {
                alignment = Layout.Alignment.ALIGN_OPPOSITE;
            }
            Layout.Alignment alignment2 = alignment;
            if (metricsIsBoring == null && (z || (!j0s.a(desiredWidth) && desiredWidth <= f))) {
                int iCeil = (int) Math.ceil(desiredWidth);
                int i = Build.VERSION.SDK_INT;
                StaticLayout.Builder hyphenationFrequency = StaticLayout.Builder.obtain(spanned, 0, spanned.length(), textPaint, iCeil).setAlignment(alignment2).setLineSpacing(0.0f, 1.0f).setIncludePad(tfj.this.f27784r).setBreakStrategy(tfj.this.h).setHyphenationFrequency(tfj.this.i);
                hyphenationFrequency.setJustificationMode(tfj.this.j);
                if (i >= 28) {
                    hyphenationFrequency.setUseLineSpacingFromFallbacks(true);
                }
                layoutBuild = hyphenationFrequency.build();
            } else if (metricsIsBoring == null || (!z && metricsIsBoring.width > f)) {
                int i2 = Build.VERSION.SDK_INT;
                StaticLayout.Builder hyphenationFrequency2 = StaticLayout.Builder.obtain(spanned, 0, spanned.length(), textPaint, (int) f).setAlignment(alignment2).setLineSpacing(0.0f, 1.0f).setIncludePad(tfj.this.f27784r).setBreakStrategy(tfj.this.h).setHyphenationFrequency(tfj.this.i);
                if (i2 >= 28) {
                    hyphenationFrequency2.setUseLineSpacingFromFallbacks(true);
                }
                layoutBuild = hyphenationFrequency2.build();
            } else {
                layoutBuild = BoringLayout.make(spanned, textPaint, metricsIsBoring.width, alignment2, 1.0f, 0.0f, metricsIsBoring, tfj.this.f27784r);
            }
            if (tfj.this.y) {
                WritableArray writableArrayA = zz9.a(spanned, layoutBuild, textPaint, tfj.this.getThemedContext());
                WritableMap writableMapCreateMap = Arguments.createMap();
                writableMapCreateMap.putArray("lines", writableArrayA);
                ((RCTEventEmitter) tfj.this.getThemedContext().getJSModule(RCTEventEmitter.class)).receiveEvent(tfj.this.getReactTag(), "topTextLayout", writableMapCreateMap);
            }
            int width = layoutBuild.getWidth();
            if (edj.g != 1.0f) {
                width = (int) Math.ceil(layoutBuild.getWidth() * edj.g);
            }
            int i3 = tfj.this.f;
            return (i3 == -1 || i3 >= layoutBuild.getLineCount()) ? k0s.b(width, layoutBuild.getHeight()) : k0s.b(width, layoutBuild.getLineBottom(tfj.this.f - 1));
        }
    }

    public tfj() {
        i();
    }

    private void i() {
        if (isVirtual()) {
            return;
        }
        setMeasureFunction(this.z);
    }

    @Override // defpackage.pej, defpackage.oej
    public Iterable<? extends oej> calculateLayoutOnChildren() {
        Map<Integer, oej> map = this.w;
        if (map == null || map.isEmpty()) {
            return null;
        }
        Spanned spanned = (Spanned) sk1.d(this.x, "Spannable element has not been prepared in onBeforeLayout");
        e8p[] e8pVarArr = (e8p[]) spanned.getSpans(0, spanned.length(), e8p.class);
        ArrayList arrayList = new ArrayList(e8pVarArr.length);
        for (e8p e8pVar : e8pVarArr) {
            oej oejVar = this.w.get(Integer.valueOf(e8pVar.b()));
            oejVar.calculateLayout();
            arrayList.add(oejVar);
        }
        return arrayList;
    }

    public final int h() {
        int i = this.g;
        if (getLayoutDirection() != YogaDirection.RTL) {
            return i;
        }
        if (i == 5) {
            return 3;
        }
        if (i == 3) {
            return 5;
        }
        return i;
    }

    @Override // defpackage.pej
    public boolean hoistNativeChildren() {
        return true;
    }

    @Override // defpackage.pej
    public boolean isVirtualAnchor() {
        return false;
    }

    @Override // defpackage.pej
    public void markUpdated() {
        super.markUpdated();
        super.dirty();
    }

    @Override // defpackage.pej, defpackage.oej
    public void onBeforeLayout(aig aigVar) {
        this.x = c(this, null, true, aigVar);
        markUpdated();
    }

    @Override // defpackage.pej
    public void onCollectExtraUpdates(e eVar) {
        super.onCollectExtraUpdates(eVar);
        Spannable spannable = this.x;
        if (spannable != null) {
            eVar.K(getReactTag(), new ufj(spannable, -1, this.v, getPadding(4), getPadding(1), getPadding(5), getPadding(3), h(), this.h, this.j));
        }
    }

    @iej(name = "onTextLayout")
    public void setShouldNotifyOnTextLayout(boolean z) {
        this.y = z;
    }
}

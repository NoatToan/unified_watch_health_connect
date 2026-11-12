package t5;

import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lt5/x;", "", "<init>", "()V", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final x f162461a = new x();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final s f162462b = new s();

    private x() {
    }

    public static StaticLayout a(CharSequence charSequence, TextPaint textPaint, int i14, int i15, TextDirectionHeuristic textDirectionHeuristic, Layout.Alignment alignment, int i16, TextUtils.TruncateAt truncateAt, int i17, float f14, float f15, int i18, boolean z14, boolean z15, int i19, int i24, int i25, int i26, int[] iArr, int[] iArr2) {
        y yVar = new y(charSequence, 0, i15, textPaint, i14, textDirectionHeuristic, alignment, i16, truncateAt, i17, f14, f15, i18, z14, z15, i19, i24, i25, i26, iArr, iArr2);
        f162462b.getClass();
        StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(yVar.f162463a, yVar.f162464b, yVar.f162465c, yVar.f162466d, yVar.f162467e);
        builderObtain.setTextDirection(yVar.f162468f);
        builderObtain.setAlignment(yVar.f162469g);
        builderObtain.setMaxLines(yVar.f162470h);
        builderObtain.setEllipsize(yVar.f162471i);
        builderObtain.setEllipsizedWidth(yVar.f162472j);
        builderObtain.setLineSpacing(yVar.f162474l, yVar.f162473k);
        builderObtain.setIncludePad(yVar.f162476n);
        builderObtain.setBreakStrategy(yVar.f162478p);
        builderObtain.setHyphenationFrequency(yVar.f162481s);
        builderObtain.setIndents(yVar.f162482t, yVar.f162483u);
        int i27 = t.f162457a;
        builderObtain.setJustificationMode(yVar.f162475m);
        int i28 = u.f162458a;
        builderObtain.setUseLineSpacingFromFallbacks(yVar.f162477o);
        int i29 = Build.VERSION.SDK_INT;
        if (i29 >= 33) {
            int i30 = v.f162459a;
            builderObtain.setLineBreakConfig(sf0.d.a().setLineBreakStyle(yVar.f162479q).setLineBreakWordStyle(yVar.f162480r).build());
        }
        if (i29 >= 35) {
            int i34 = w.f162460a;
            builderObtain.setUseBoundsForWidth(false);
        }
        return builderObtain.build();
    }
}

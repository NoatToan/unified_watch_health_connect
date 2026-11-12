package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ProgressBar;
import com.facebook.react.views.progressbar.ReactProgressBarViewManager;
import com.facebook.yoga.YogaMeasureFunction;
import com.facebook.yoga.YogaMeasureMode;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public class dci extends cbe implements YogaMeasureFunction {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f15368a = "Normal";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SparseIntArray f15369b = new SparseIntArray();
    public final SparseIntArray c = new SparseIntArray();
    public final Set<Integer> d = new HashSet();

    public dci() {
        b();
    }

    public String a() {
        return this.f15368a;
    }

    public final void b() {
        setMeasureFunction(this);
    }

    @Override // com.facebook.yoga.YogaMeasureFunction
    public long measure(l0s l0sVar, float f, YogaMeasureMode yogaMeasureMode, float f2, YogaMeasureMode yogaMeasureMode2) {
        int styleFromString = ReactProgressBarViewManager.getStyleFromString(a());
        if (!this.d.contains(Integer.valueOf(styleFromString))) {
            ProgressBar progressBarCreateProgressBar = ReactProgressBarViewManager.createProgressBar(getThemedContext(), styleFromString);
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(-2, 0);
            progressBarCreateProgressBar.measure(iMakeMeasureSpec, iMakeMeasureSpec);
            this.f15369b.put(styleFromString, progressBarCreateProgressBar.getMeasuredHeight());
            this.c.put(styleFromString, progressBarCreateProgressBar.getMeasuredWidth());
            this.d.add(Integer.valueOf(styleFromString));
        }
        return k0s.b(this.c.get(styleFromString), this.f15369b.get(styleFromString));
    }

    @iej(name = "styleAttr")
    public void setStyle(String str) {
        if (str == null) {
            str = "Normal";
        }
        this.f15368a = str;
    }
}

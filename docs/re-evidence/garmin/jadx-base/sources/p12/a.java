package p12;

import android.content.Context;
import android.graphics.Shader;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.github.mikephil.charting.data.BarDataSet;
import java.util.ArrayList;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p13.j0;
import p13.u;
import p13.w;
import qz.c;
import xz.e;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0013\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\bB\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lp12/a;", "Lqz/c;", "", "Lcom/github/mikephil/charting/data/BarDataSet;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "a", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a implements c<double[], BarDataSet> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f134907a;

    static {
        new C2561a(null);
    }

    public a(Context context) {
        context.getClass();
        this.f134907a = context;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [p13.j0] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.util.ArrayList] */
    @Override // qz.c
    public final List<BarDataSet> a(double[] dArr) {
        ?? arrayList;
        double[] dArr2 = dArr;
        if (dArr2 != null) {
            arrayList = new ArrayList(dArr2.length);
            int length = dArr2.length;
            int i14 = 0;
            int i15 = 0;
            while (i14 < length) {
                arrayList.add(new e(i15, (float) dArr2[i14], (Object) null, new int[0], 0.0f, false, false, 116, (j) null));
                i14++;
                i15++;
            }
        } else {
            arrayList = j0.f134944a;
        }
        BarDataSet barDataSet = new BarDataSet(arrayList, "");
        barDataSet.setDrawValues(false);
        barDataSet.setColor(a7.b.getColor(this.f134907a, R.color.gcm_chart_indicator));
        barDataSet.setBarBorderWidth(0.0f);
        return w.c(barDataSet);
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ Shader b(float f14, float f15, Object obj) {
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ Integer c(double[] dArr) {
        return 12;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ boolean d(double[] dArr) {
        return false;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ float e(double[] dArr) {
        return -0.5f;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ List f(double[] dArr) {
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ List g(double[] dArr) {
        return null;
    }

    @Override // qz.c
    public final float i(double[] dArr) {
        double[] dArr2 = dArr;
        if (dArr2 != null) {
            return (float) u.T(dArr2);
        }
        return 0.0f;
    }

    @Override // qz.c
    public final Integer j(double[] dArr) {
        double[] dArr2 = dArr;
        if ((dArr2 != null ? (float) u.T(dArr2) : 0.0f) < 6.0f) {
            return Integer.valueOf(Math.round(dArr2 != null ? (float) u.T(dArr2) : 0.0f) + 1);
        }
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ float m(double[] dArr) {
        return 0.0f;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ List o(double[] dArr) {
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ Integer p(double[] dArr) {
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ float q(double[] dArr) {
        return 11.5f;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ String r(double[] dArr) {
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ float t(double[] dArr) {
        return 0.0f;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ List u(double[] dArr) {
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ List v(double[] dArr) {
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ float w(double[] dArr) {
        return 0.0f;
    }

    /* JADX INFO: renamed from: p12.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lp12/a$a;", "", "<init>", "()V", "", "MONTHLY_X_AXIS_LABELS_COUNT", "I", "", "X_AXIS_OFFSET", "F", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C2561a {
        public /* synthetic */ C2561a(j jVar) {
            this();
        }

        private C2561a() {
        }
    }
}

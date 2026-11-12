package qm;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.compose.ui.platform.ComposeView;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lqm/p0;", "Lzm/q;", "Landroid/content/Context;", "mContext", "Lzm/p;", "mActivityChartData", "<init>", "(Landroid/content/Context;Lzm/p;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class p0 implements zm.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f145435a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final im.d0 f145436b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final im.d0 f145437c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f145438d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final oq.a f145439e;

    public p0(Context context, zm.p pVar) {
        context.getClass();
        pVar.getClass();
        this.f145435a = context;
        this.f145436b = pVar.C3();
        this.f145437c = pVar.D2();
        this.f145438d = pVar.getF113508r1();
        this.f145439e = new oq.a(this, 11);
    }

    @Override // zm.q
    public final void a(LinearLayout linearLayout) {
        linearLayout.getClass();
    }

    @Override // zm.q
    public final void b() {
    }

    @Override // zm.q
    public final void c(LinearLayout linearLayout) {
        linearLayout.getClass();
    }

    @Override // zm.q
    public final View d(ViewGroup viewGroup) {
        ComposeView composeView;
        View viewInflate = LayoutInflater.from(this.f145435a).inflate(R.layout.activity_composable_container, viewGroup, false);
        im.d0 d0Var = this.f145436b;
        double d14 = d0Var != null ? d0Var.f94139a : Double.NaN;
        im.d0 d0Var2 = this.f145437c;
        double d15 = d0Var2 != null ? d0Var2.f94139a : Double.NaN;
        if (viewInflate != null && (composeView = (ComposeView) viewInflate.findViewById(R.id.composable_container)) != null) {
            composeView.setContent(new z3.e(-1204506428, true, new cg1.l(d14, d15, this, viewGroup)));
        }
        viewInflate.getClass();
        return viewInflate;
    }
}

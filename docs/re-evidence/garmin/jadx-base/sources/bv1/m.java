package bv1;

import android.view.View;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lbv1/m;", "", "Landroid/view/View;", "view", "<init>", "(Landroid/view/View;)V", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f21420a;

    public m(View view2) {
        view2.getClass();
        this.f21420a = view2;
    }

    public final void a() {
        this.f21420a.setVisibility(8);
    }

    public final void b(boolean z14) {
        View view2 = this.f21420a;
        if (z14) {
            view2.setVisibility(0);
        } else {
            view2.setVisibility(8);
        }
    }
}

package n7;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public class g implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f123993a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f123994b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f123995c;

    public g(ViewGroup viewGroup, View view2, int i14) {
        this.f123993a = viewGroup;
        this.f123994b = view2;
        this.f123995c = i14;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view2) {
        this.f123993a.addView(this.f123994b, this.f123995c);
        view2.removeOnAttachStateChangeListener(this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view2) {
        this.f123993a.addView(this.f123994b, this.f123995c);
        view2.removeOnAttachStateChangeListener(this);
    }
}

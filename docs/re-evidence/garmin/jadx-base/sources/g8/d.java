package g8;

import am.j;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.FragmentContainerView;
import e23.l;
import p005kotlin.Metadata;
import v.e0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lg8/d;", "Lkotlin/Function1;", "Landroid/content/Context;", "Landroid/view/View;", "", "containerId", "<init>", "(I)V", "fragment-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class d implements l<Context, View> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f76237a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public FragmentContainerView f76238b;

    public d(int i14) {
        this.f76237a = i14;
    }

    public final FragmentContainerView a() {
        FragmentContainerView fragmentContainerView = this.f76238b;
        if (fragmentContainerView != null) {
            return fragmentContainerView;
        }
        e0.n(j.q(new StringBuilder("AndroidView has not created a container for "), this.f76237a, " yet"));
        return null;
    }

    @Override // e23.l
    public final View invoke(Context context) {
        FragmentContainerView fragmentContainerView = new FragmentContainerView(context);
        fragmentContainerView.setId(this.f76237a);
        this.f76238b = fragmentContainerView;
        return fragmentContainerView;
    }
}

package bv2;

import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import androidx.fragment.app.Fragment;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u0000B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\t¨\u0006\n"}, d2 = {"Lbv2/p;", "Landroidx/fragment/app/Fragment;", "fragment", "Landroid/view/MenuItem;", "menuItem", "<init>", "(Landroidx/fragment/app/Fragment;Landroid/view/MenuItem;)V", "Lbx2/b;", "transform", "(Landroidx/fragment/app/Fragment;Lbx2/b;Landroid/view/MenuItem;)V", "real-time-settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Fragment f21555a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MenuItem f21556b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final cx2.h f21557c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final bx2.b f21558d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public View f21559e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public p(Fragment fragment, bx2.b bVar, MenuItem menuItem) {
        this(fragment, menuItem);
        fragment.getClass();
        bVar.getClass();
        menuItem.getClass();
        androidx.fragment.app.m activity = fragment.getActivity();
        this.f21559e = activity != null ? activity.findViewById(menuItem.getItemId()) : null;
        bVar.n(this);
        this.f21558d = bVar;
        this.f21557c.getClass();
        if (bVar.m()) {
            View viewA = a();
            if (viewA != null) {
                viewA.setVisibility(0);
            }
            if (bVar.l()) {
                b();
                return;
            }
            return;
        }
        View viewA2 = a();
        if (viewA2 != null) {
            viewA2.clearAnimation();
            viewA2.setClickable(true);
        }
        View viewA3 = a();
        if (viewA3 != null) {
            viewA3.setVisibility(4);
        }
    }

    public final View a() {
        View viewFindViewById = this.f21559e;
        if (viewFindViewById == null) {
            androidx.fragment.app.m activity = this.f21555a.getActivity();
            viewFindViewById = activity != null ? activity.findViewById(this.f21556b.getItemId()) : null;
            this.f21559e = viewFindViewById;
        }
        return viewFindViewById;
    }

    public final void b() {
        View viewA;
        View viewA2 = a();
        if (viewA2 != null) {
            if (viewA2.getVisibility() != 0 && (viewA = a()) != null) {
                viewA.setVisibility(0);
            }
            Animation animationLoadAnimation = AnimationUtils.loadAnimation(viewA2.getContext(), R.anim.rotation);
            animationLoadAnimation.setRepeatCount(-1);
            viewA2.startAnimation(animationLoadAnimation);
            viewA2.setClickable(false);
        }
    }

    public final void c() {
        this.f21557c.getClass();
        View viewA = a();
        if (viewA != null) {
            viewA.clearAnimation();
            viewA.setClickable(true);
        }
    }

    public final void d() {
        this.f21557c.getClass();
        b();
    }

    public final void e(boolean z14) {
        this.f21557c.getClass();
        if (z14) {
            View viewA = a();
            if (viewA != null) {
                viewA.setVisibility(0);
                return;
            }
            return;
        }
        View viewA2 = a();
        if (viewA2 != null) {
            viewA2.clearAnimation();
            viewA2.setClickable(true);
        }
        View viewA3 = a();
        if (viewA3 != null) {
            viewA3.setVisibility(4);
        }
    }

    public p(Fragment fragment, MenuItem menuItem) {
        fragment.getClass();
        menuItem.getClass();
        this.f21555a = fragment;
        this.f21556b = menuItem;
        this.f21557c = new cx2.h("SyncMenuView", null, 2, null);
    }
}

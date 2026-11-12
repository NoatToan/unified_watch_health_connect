package lh2;

import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import androidx.fragment.app.Fragment;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\t¨\u0006\n"}, d2 = {"Llh2/u;", "Landroidx/fragment/app/Fragment;", "fragment", "Landroid/view/MenuItem;", "menuItem", "<init>", "(Landroidx/fragment/app/Fragment;Landroid/view/MenuItem;)V", "Lgi2/b;", "transform", "(Landroidx/fragment/app/Fragment;Lgi2/b;Landroid/view/MenuItem;)V", "androiddynamicsettings_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Fragment f112556a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MenuItem f112557b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final hi2.d f112558c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final gi2.b f112559d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public View f112560e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public u(Fragment fragment, gi2.b bVar, MenuItem menuItem) {
        this(fragment, menuItem);
        fragment.getClass();
        bVar.getClass();
        menuItem.getClass();
        androidx.fragment.app.m activity = fragment.getActivity();
        this.f112560e = activity != null ? activity.findViewById(menuItem.getItemId()) : null;
        bVar.u(this);
        this.f112559d = bVar;
        this.f112558c.getClass();
        if (bVar.t()) {
            View viewA = a();
            if (viewA != null) {
                viewA.setVisibility(0);
            }
            if (bVar.s()) {
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
        View viewFindViewById = this.f112560e;
        if (viewFindViewById == null) {
            androidx.fragment.app.m activity = this.f112556a.getActivity();
            viewFindViewById = activity != null ? activity.findViewById(this.f112557b.getItemId()) : null;
            this.f112560e = viewFindViewById;
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
        this.f112558c.getClass();
        View viewA = a();
        if (viewA != null) {
            viewA.clearAnimation();
            viewA.setClickable(true);
        }
    }

    public final void d() {
        this.f112558c.getClass();
        b();
    }

    public final void e(boolean z14) {
        this.f112558c.getClass();
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

    public u(Fragment fragment, MenuItem menuItem) {
        fragment.getClass();
        menuItem.getClass();
        this.f112556a = fragment;
        this.f112557b = menuItem;
        this.f112558c = new hi2.d("SyncMenuView", null, 2, null);
    }
}

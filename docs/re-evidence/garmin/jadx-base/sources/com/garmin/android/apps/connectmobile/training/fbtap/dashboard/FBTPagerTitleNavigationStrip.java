package com.garmin.android.apps.connectmobile.training.fbtap.dashboard;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager.widget.ViewPager;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import jy.b;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import v22.e;
import vb.h;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\"\u0010\u0011\u001a\u00020\n8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lcom/garmin/android/apps/connectmobile/training/fbtap/dashboard/FBTPagerTitleNavigationStrip;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroidx/compose/ui/platform/ComposeView;", "d", "Landroidx/compose/ui/platform/ComposeView;", "getComposeView", "()Landroidx/compose/ui/platform/ComposeView;", "setComposeView", "(Landroidx/compose/ui/platform/ComposeView;)V", "composeView", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@ViewPager.e
public final class FBTPagerTitleNavigationStrip extends ConstraintLayout {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f45473i = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f45474a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ImageView f45475b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ImageView f45476c;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public ComposeView composeView;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ViewPager f45478e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public WeakReference<fe.a> f45479f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final jy.a f45480g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final a f45481h;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/training/fbtap/dashboard/FBTPagerTitleNavigationStrip$a", "Landroidx/viewpager/widget/ViewPager$j;", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a implements ViewPager.j {
        public a() {
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public final void onPageScrollStateChanged(int i14) {
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public final void onPageScrolled(int i14, float f14, int i15) {
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public final void onPageSelected(int i14) {
            FBTPagerTitleNavigationStrip.this.i(i14);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FBTPagerTitleNavigationStrip(Context context, AttributeSet attributeSet, int i14) {
        super(context, attributeSet, i14);
        context.getClass();
        LayoutInflater.from(context).inflate(R.layout.fbt_pager_title_navigation_strip_layout, (ViewGroup) this, true);
        View viewFindViewById = findViewById(R.id.title);
        viewFindViewById.getClass();
        this.f45474a = (TextView) viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.navigate_left);
        viewFindViewById2.getClass();
        this.f45475b = (ImageView) viewFindViewById2;
        View viewFindViewById3 = findViewById(R.id.navigate_right);
        viewFindViewById3.getClass();
        this.f45476c = (ImageView) viewFindViewById3;
        View viewFindViewById4 = findViewById(R.id.calendar_square_list_view);
        viewFindViewById4.getClass();
        setComposeView((ComposeView) viewFindViewById4);
        this.f45480g = new jy.a(this, 1);
        this.f45481h = new a();
    }

    public final ComposeView getComposeView() {
        ComposeView composeView = this.composeView;
        if (composeView != null) {
            return composeView;
        }
        s.m("composeView");
        throw null;
    }

    public final void i(int i14) {
        fe.a aVar;
        fe.a aVar2;
        WeakReference<fe.a> weakReference = this.f45479f;
        this.f45474a.setText((weakReference == null || (aVar2 = weakReference.get()) == null) ? null : aVar2.getPageTitle(i14));
        WeakReference<fe.a> weakReference2 = this.f45479f;
        ImageView imageView = this.f45476c;
        if (weakReference2 == null || (aVar = weakReference2.get()) == null || i14 != aVar.getF149591t() - 1) {
            e.q(imageView);
        } else {
            e.l(imageView);
        }
        ImageView imageView2 = this.f45475b;
        if (i14 == 0) {
            e.l(imageView2);
        } else {
            e.q(imageView2);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        ViewPager viewPager = parent instanceof ViewPager ? (ViewPager) parent : null;
        if (viewPager == null) {
            h.z("PagerTitleNavigationStrip must be a direct child of a ViewPager.");
            return;
        }
        this.f45478e = viewPager;
        this.f45479f = new WeakReference<>(viewPager.getAdapter());
        i(viewPager.getCurrentItem());
        viewPager.b(this.f45480g);
        viewPager.c(this.f45481h);
        this.f45475b.setOnClickListener(new b(viewPager, 2));
        this.f45476c.setOnClickListener(new b(viewPager, 3));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ViewPager viewPager = this.f45478e;
        if (viewPager != null) {
            ArrayList arrayList = viewPager.V0;
            if (arrayList != null) {
                arrayList.remove(this.f45480g);
            }
            viewPager.z(this.f45481h);
        }
        this.f45475b.setOnClickListener(null);
        this.f45476c.setOnClickListener(null);
        this.f45479f = null;
    }

    public final void setComposeView(ComposeView composeView) {
        composeView.getClass();
        this.composeView = composeView;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FBTPagerTitleNavigationStrip(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FBTPagerTitleNavigationStrip(Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }

    public /* synthetic */ FBTPagerTitleNavigationStrip(Context context, AttributeSet attributeSet, int i14, int i15, j jVar) {
        this(context, (i15 & 2) != 0 ? null : attributeSet, (i15 & 4) != 0 ? 0 : i14);
    }
}

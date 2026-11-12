package com.garmin.android.apps.connectmobile.view.pager;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager.widget.ViewPager;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import jy.b;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import v22.e;
import vb.h;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/garmin/android/apps/connectmobile/view/pager/PagerTitleNavigationStrip;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@ViewPager.e
public final class PagerTitleNavigationStrip extends ConstraintLayout {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f47675h = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f47676a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ImageView f47677b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ImageView f47678c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ViewPager f47679d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public WeakReference<fe.a> f47680e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final jy.a f47681f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final a f47682g;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/view/pager/PagerTitleNavigationStrip$a", "Landroidx/viewpager/widget/ViewPager$j;", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
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
            PagerTitleNavigationStrip.this.i(i14);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PagerTitleNavigationStrip(Context context, AttributeSet attributeSet, int i14) {
        super(context, attributeSet, i14);
        context.getClass();
        LayoutInflater.from(context).inflate(R.layout.pager_title_navigation_strip_layout, (ViewGroup) this, true);
        View viewFindViewById = findViewById(R.id.title);
        viewFindViewById.getClass();
        this.f47676a = (TextView) viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.navigate_left);
        viewFindViewById2.getClass();
        this.f47677b = (ImageView) viewFindViewById2;
        View viewFindViewById3 = findViewById(R.id.navigate_right);
        viewFindViewById3.getClass();
        this.f47678c = (ImageView) viewFindViewById3;
        this.f47681f = new jy.a(this, 2);
        this.f47682g = new a();
    }

    public final void i(int i14) {
        fe.a aVar;
        fe.a aVar2;
        WeakReference<fe.a> weakReference = this.f47680e;
        this.f47676a.setText((weakReference == null || (aVar2 = weakReference.get()) == null) ? null : aVar2.getPageTitle(i14));
        WeakReference<fe.a> weakReference2 = this.f47680e;
        ImageView imageView = this.f47678c;
        if (weakReference2 == null || (aVar = weakReference2.get()) == null || i14 != aVar.getF149591t() - 1) {
            e.q(imageView);
        } else {
            e.l(imageView);
        }
        ImageView imageView2 = this.f47677b;
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
        this.f47679d = viewPager;
        this.f47680e = new WeakReference<>(viewPager.getAdapter());
        i(viewPager.getCurrentItem());
        viewPager.b(this.f47681f);
        viewPager.c(this.f47682g);
        this.f47677b.setOnClickListener(new b(viewPager, 4));
        this.f47678c.setOnClickListener(new b(viewPager, 5));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ViewPager viewPager = this.f47679d;
        if (viewPager != null) {
            ArrayList arrayList = viewPager.V0;
            if (arrayList != null) {
                arrayList.remove(this.f47681f);
            }
            viewPager.z(this.f47682g);
        }
        this.f47677b.setOnClickListener(null);
        this.f47678c.setOnClickListener(null);
        this.f47680e = null;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PagerTitleNavigationStrip(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PagerTitleNavigationStrip(Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }

    public /* synthetic */ PagerTitleNavigationStrip(Context context, AttributeSet attributeSet, int i14, int i15, j jVar) {
        this(context, (i15 & 2) != 0 ? null : attributeSet, (i15 & 4) != 0 ? 0 : i14);
    }
}

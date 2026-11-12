package i;

import android.R;
import android.app.ActionBar;
import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;

/* JADX INFO: loaded from: classes.dex */
public class b implements DrawerLayout.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC1717b f86546a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DrawerLayout f86547b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k.b f86548c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f86549d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f86550e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f86551f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f86552g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f86553h;

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view2) {
            b bVar = b.this;
            if (bVar.f86550e) {
                DrawerLayout drawerLayout = bVar.f86547b;
                int iG = drawerLayout.g(8388611);
                View viewE = drawerLayout.e(8388611);
                if ((viewE != null ? DrawerLayout.n(viewE) : false) && iG != 2) {
                    drawerLayout.b(8388611);
                } else if (iG != 1) {
                    drawerLayout.o(8388611);
                }
            }
        }
    }

    /* JADX INFO: renamed from: i.b$b, reason: collision with other inner class name */
    public interface InterfaceC1717b {
        void a(Drawable drawable, int i14);

        void b(int i14);

        Context c();

        boolean d();

        Drawable e();
    }

    public interface c {
        InterfaceC1717b getDrawerToggleDelegate();
    }

    public static class d implements InterfaceC1717b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Activity f86555a;

        public d(Activity activity) {
            this.f86555a = activity;
        }

        @Override // i.b.InterfaceC1717b
        public final void a(Drawable drawable, int i14) {
            ActionBar actionBar = this.f86555a.getActionBar();
            if (actionBar != null) {
                actionBar.setHomeAsUpIndicator(drawable);
                actionBar.setHomeActionContentDescription(i14);
            }
        }

        @Override // i.b.InterfaceC1717b
        public final void b(int i14) {
            ActionBar actionBar = this.f86555a.getActionBar();
            if (actionBar != null) {
                actionBar.setHomeActionContentDescription(i14);
            }
        }

        @Override // i.b.InterfaceC1717b
        public final Context c() {
            Activity activity = this.f86555a;
            ActionBar actionBar = activity.getActionBar();
            return actionBar != null ? actionBar.getThemedContext() : activity;
        }

        @Override // i.b.InterfaceC1717b
        public final boolean d() {
            ActionBar actionBar = this.f86555a.getActionBar();
            return (actionBar == null || (actionBar.getDisplayOptions() & 4) == 0) ? false : true;
        }

        @Override // i.b.InterfaceC1717b
        public final Drawable e() {
            TypedArray typedArrayObtainStyledAttributes = c().obtainStyledAttributes(null, new int[]{R.attr.homeAsUpIndicator}, R.attr.actionBarStyle, 0);
            Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(0);
            typedArrayObtainStyledAttributes.recycle();
            return drawable;
        }
    }

    public static class e implements InterfaceC1717b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Toolbar f86556a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Drawable f86557b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final CharSequence f86558c;

        public e(Toolbar toolbar) {
            this.f86556a = toolbar;
            this.f86557b = toolbar.getNavigationIcon();
            this.f86558c = toolbar.getNavigationContentDescription();
        }

        @Override // i.b.InterfaceC1717b
        public final void a(Drawable drawable, int i14) {
            this.f86556a.setNavigationIcon(drawable);
            b(i14);
        }

        @Override // i.b.InterfaceC1717b
        public final void b(int i14) {
            Toolbar toolbar = this.f86556a;
            if (i14 == 0) {
                toolbar.setNavigationContentDescription(this.f86558c);
            } else {
                toolbar.setNavigationContentDescription(i14);
            }
        }

        @Override // i.b.InterfaceC1717b
        public final Context c() {
            return this.f86556a.getContext();
        }

        @Override // i.b.InterfaceC1717b
        public final boolean d() {
            return true;
        }

        @Override // i.b.InterfaceC1717b
        public final Drawable e() {
            return this.f86557b;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b(Activity activity, Toolbar toolbar, DrawerLayout drawerLayout, k.b bVar, int i14, int i15) {
        this.f86549d = true;
        this.f86550e = true;
        this.f86553h = false;
        if (toolbar != null) {
            this.f86546a = new e(toolbar);
            toolbar.setNavigationOnClickListener(new a());
        } else if (activity instanceof c) {
            this.f86546a = ((c) activity).getDrawerToggleDelegate();
        } else {
            this.f86546a = new d(activity);
        }
        this.f86547b = drawerLayout;
        this.f86551f = i14;
        this.f86552g = i15;
        if (bVar == null) {
            this.f86548c = new k.b(this.f86546a.c());
        } else {
            this.f86548c = bVar;
        }
        this.f86546a.e();
    }

    public final void a(float f14) {
        k.b bVar = this.f86548c;
        if (f14 == 1.0f) {
            if (!bVar.f101919i) {
                bVar.f101919i = true;
                bVar.invalidateSelf();
            }
        } else if (f14 == 0.0f && bVar.f101919i) {
            bVar.f101919i = false;
            bVar.invalidateSelf();
        }
        bVar.setProgress(f14);
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout.e
    public void onDrawerClosed(View view2) {
        a(0.0f);
        if (this.f86550e) {
            this.f86546a.b(this.f86551f);
        }
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout.e
    public void onDrawerOpened(View view2) {
        a(1.0f);
        if (this.f86550e) {
            this.f86546a.b(this.f86552g);
        }
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout.e
    public final void onDrawerSlide(View view2, float f14) {
        if (this.f86549d) {
            a(Math.min(1.0f, Math.max(0.0f, f14)));
        } else {
            a(0.0f);
        }
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout.e
    public final void onDrawerStateChanged(int i14) {
    }

    public b(Activity activity, DrawerLayout drawerLayout, Toolbar toolbar, int i14, int i15) {
        this(activity, toolbar, drawerLayout, null, i14, i15);
    }

    public b(Activity activity, DrawerLayout drawerLayout, int i14, int i15) {
        this(activity, null, drawerLayout, null, i14, i15);
    }
}

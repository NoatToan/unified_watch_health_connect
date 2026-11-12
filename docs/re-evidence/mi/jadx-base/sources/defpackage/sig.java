package defpackage;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.navigation.NavController;
import androidx.navigation.h;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.navigation.NavigationView;
import java.lang.ref.WeakReference;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class sig {

    public class a implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ NavController f33666a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ze1 f33667b;

        public a(NavController navController, ze1 ze1Var) {
            this.f33666a = navController;
            this.f33667b = ze1Var;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            sig.e(this.f33666a, this.f33667b);
        }
    }

    public class b implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ NavController f33668a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ze1 f33669b;

        public b(NavController navController, ze1 ze1Var) {
            this.f33668a = navController;
            this.f33669b = ze1Var;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            sig.e(this.f33668a, this.f33669b);
        }
    }

    public class c implements NavigationView.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ NavController f33670a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ NavigationView f33671b;

        public c(NavController navController, NavigationView navigationView) {
            this.f33670a = navController;
            this.f33671b = navigationView;
        }

        @Override // com.google.android.material.navigation.NavigationView.c
        public boolean a(MenuItem menuItem) {
            boolean zF = sig.f(menuItem, this.f33670a);
            if (zF) {
                ViewParent parent = this.f33671b.getParent();
                if (parent instanceof fbh) {
                    ((fbh) parent).close();
                } else {
                    BottomSheetBehavior bottomSheetBehaviorA = sig.a(this.f33671b);
                    if (bottomSheetBehaviorA != null) {
                        bottomSheetBehaviorA.setState(5);
                    }
                }
            }
            return zF;
        }
    }

    public class d implements NavController.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ WeakReference f33672a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ NavController f33673b;

        public d(WeakReference weakReference, NavController navController) {
            this.f33672a = weakReference;
            this.f33673b = navController;
        }

        @Override // androidx.navigation.NavController.b
        public void a(NavController navController, androidx.navigation.d dVar, Bundle bundle) {
            NavigationView navigationView = (NavigationView) this.f33672a.get();
            if (navigationView == null) {
                this.f33673b.removeOnDestinationChangedListener(this);
                return;
            }
            Menu menu = navigationView.getMenu();
            int size = menu.size();
            for (int i = 0; i < size; i++) {
                MenuItem item = menu.getItem(i);
                item.setChecked(sig.c(dVar, item.getItemId()));
            }
        }
    }

    public class e implements BottomNavigationView.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ NavController f33674a;

        public e(NavController navController) {
            this.f33674a = navController;
        }

        @Override // com.google.android.material.navigation.NavigationBarView.c
        public boolean a(MenuItem menuItem) {
            return sig.f(menuItem, this.f33674a);
        }
    }

    public class f implements NavController.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ WeakReference f33675a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ NavController f33676b;

        public f(WeakReference weakReference, NavController navController) {
            this.f33675a = weakReference;
            this.f33676b = navController;
        }

        @Override // androidx.navigation.NavController.b
        public void a(NavController navController, androidx.navigation.d dVar, Bundle bundle) {
            BottomNavigationView bottomNavigationView = (BottomNavigationView) this.f33675a.get();
            if (bottomNavigationView == null) {
                this.f33676b.removeOnDestinationChangedListener(this);
                return;
            }
            Menu menu = bottomNavigationView.getMenu();
            int size = menu.size();
            for (int i = 0; i < size; i++) {
                MenuItem item = menu.getItem(i);
                if (sig.c(dVar, item.getItemId())) {
                    item.setChecked(true);
                }
            }
        }
    }

    public static BottomSheetBehavior a(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof CoordinatorLayout.e) {
            CoordinatorLayout.Behavior behaviorF = ((CoordinatorLayout.e) layoutParams).f();
            if (behaviorF instanceof BottomSheetBehavior) {
                return (BottomSheetBehavior) behaviorF;
            }
            return null;
        }
        Object parent = view.getParent();
        if (parent instanceof View) {
            return a((View) parent);
        }
        return null;
    }

    public static androidx.navigation.d b(androidx.navigation.e eVar) {
        androidx.navigation.d dVarF = eVar;
        while (dVarF instanceof androidx.navigation.e) {
            androidx.navigation.e eVar2 = (androidx.navigation.e) dVarF;
            dVarF = eVar2.F(eVar2.I());
        }
        return dVarF;
    }

    public static boolean c(androidx.navigation.d dVar, int i) {
        while (dVar.m() != i && dVar.r() != null) {
            dVar = dVar.r();
        }
        return dVar.m() == i;
    }

    public static boolean d(androidx.navigation.d dVar, Set<Integer> set) {
        while (!set.contains(Integer.valueOf(dVar.m()))) {
            dVar = dVar.r();
            if (dVar == null) {
                return false;
            }
        }
        return true;
    }

    public static boolean e(NavController navController, ze1 ze1Var) {
        fbh fbhVarB = ze1Var.b();
        androidx.navigation.d dVarH = navController.h();
        Set<Integer> setC = ze1Var.c();
        if (fbhVarB != null && dVarH != null && d(dVarH, setC)) {
            fbhVarB.open();
            return true;
        }
        if (navController.v()) {
            return true;
        }
        if (ze1Var.a() != null) {
            return ze1Var.a().onNavigateUp();
        }
        return false;
    }

    public static boolean f(MenuItem menuItem, NavController navController) {
        h.a aVarD = new h.a().d(true);
        if (navController.h().r().F(menuItem.getItemId()) instanceof androidx.navigation.a.C0045a) {
            aVarD.b(wgi.f37945a).c(wgi.f37946b).e(wgi.c).f(wgi.d);
        } else {
            aVarD.b(xgi.f39099a).c(xgi.f39100b).e(xgi.c).f(xgi.d);
        }
        if ((menuItem.getOrder() & 196608) == 0) {
            aVarD.g(b(navController.j()).m(), false);
        }
        try {
            navController.p(menuItem.getItemId(), null, aVarD.a());
            return true;
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    public static void g(AppCompatActivity appCompatActivity, NavController navController, ze1 ze1Var) {
        navController.addOnDestinationChangedListener(new jd0(appCompatActivity, ze1Var));
    }

    public static void h(Toolbar toolbar, NavController navController, ze1 ze1Var) {
        navController.addOnDestinationChangedListener(new rip(toolbar, ze1Var));
        toolbar.setNavigationOnClickListener(new a(navController, ze1Var));
    }

    public static void i(CollapsingToolbarLayout collapsingToolbarLayout, Toolbar toolbar, NavController navController, ze1 ze1Var) {
        navController.addOnDestinationChangedListener(new c44(collapsingToolbarLayout, toolbar, ze1Var));
        toolbar.setNavigationOnClickListener(new b(navController, ze1Var));
    }

    public static void j(BottomNavigationView bottomNavigationView, NavController navController) {
        bottomNavigationView.setOnNavigationItemSelectedListener(new e(navController));
        navController.addOnDestinationChangedListener(new f(new WeakReference(bottomNavigationView), navController));
    }

    public static void k(NavigationView navigationView, NavController navController) {
        navigationView.setNavigationItemSelectedListener(new c(navController, navigationView));
        navController.addOnDestinationChangedListener(new d(new WeakReference(navigationView), navController));
    }
}

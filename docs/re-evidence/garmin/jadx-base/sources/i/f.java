package i;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.location.Location;
import android.location.LocationManager;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.view.menu.ExpandedMenuView;
import androidx.appcompat.view.menu.f.a;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.ViewStubCompat;
import androidx.appcompat.widget.a0;
import androidx.appcompat.widget.b1;
import androidx.appcompat.widget.l0;
import androidx.appcompat.widget.w0;
import androidx.appcompat.widget.y0;
import androidx.core.view.g1;
import androidx.core.view.i1;
import androidx.core.view.s0;
import androidx.lifecycle.b0;
import androidx.lifecycle.n0;
import com.garmin.android.apps.connectmobile.u1;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.material.internal.ViewUtils;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Calendar;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.WeakHashMap;
import p1.k1;
import p1.z;

/* JADX INFO: loaded from: classes.dex */
public class f extends i.e implements androidx.appcompat.view.menu.h.a, LayoutInflater.Factory2 {

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    public static final k1<String, Integer> f86574e1 = new k1<>();

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    public static final int[] f86575f1 = {R.attr.windowBackground};

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    public static final boolean f86576g1 = !"robolectric".equals(Build.FINGERPRINT);
    public g1 A;
    public final boolean B;
    public boolean C;
    public ViewGroup D;
    public TextView E;
    public View F;
    public boolean H0;
    public boolean I;
    public n[] I0;
    public n J0;
    public boolean K0;
    public boolean L0;
    public boolean M0;
    public boolean N0;
    public Configuration O0;
    public boolean P;
    public final int P0;
    public int Q0;
    public int R0;
    public boolean S0;
    public boolean T;
    public l T0;
    public j U0;
    public boolean V0;
    public int W0;
    public boolean X;
    public final a X0;
    public boolean Y;
    public boolean Y0;
    public boolean Z;
    public Rect Z0;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    public Rect f86577a1;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    public i.n f86578b1;

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    public OnBackInvokedDispatcher f86579c1;

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    public OnBackInvokedCallback f86580d1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Object f86581j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Context f86582k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public boolean f86583k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Window f86584l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public i f86585m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final i.d f86586n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public i.a f86587o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public m.g f86588p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public CharSequence f86589q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public a0 f86590r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public d f86591t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public o f86592v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public m.b f86593w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public ActionBarContextView f86594x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public PopupWindow f86595y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public i.i f86596z;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            f fVar = f.this;
            if ((fVar.W0 & 1) != 0) {
                fVar.L(0);
            }
            if ((fVar.W0 & 4096) != 0) {
                fVar.L(108);
            }
            fVar.V0 = false;
            fVar.W0 = 0;
        }
    }

    public class b implements i.b.InterfaceC1717b {
        public b() {
        }

        @Override // i.b.InterfaceC1717b
        public final void a(Drawable drawable, int i14) {
            f fVar = f.this;
            fVar.R();
            i.a aVar = fVar.f86587o;
            if (aVar != null) {
                aVar.w(drawable);
                aVar.u(i14);
            }
        }

        @Override // i.b.InterfaceC1717b
        public final void b(int i14) {
            f fVar = f.this;
            fVar.R();
            i.a aVar = fVar.f86587o;
            if (aVar != null) {
                aVar.u(i14);
            }
        }

        @Override // i.b.InterfaceC1717b
        public final Context c() {
            return f.this.O();
        }

        @Override // i.b.InterfaceC1717b
        public final boolean d() {
            f fVar = f.this;
            fVar.R();
            i.a aVar = fVar.f86587o;
            return (aVar == null || (aVar.d() & 4) == 0) ? false : true;
        }

        @Override // i.b.InterfaceC1717b
        public final Drawable e() {
            w0 w0VarF = w0.f(f.this.O(), null, new int[]{com.garmin.android.apps.connectmobile.R.attr.homeAsUpIndicator});
            Drawable drawableB = w0VarF.b(0);
            w0VarF.h();
            return drawableB;
        }
    }

    public interface c {
    }

    public final class d implements androidx.appcompat.view.menu.n.a {
        public d() {
        }

        @Override // androidx.appcompat.view.menu.n.a
        public final boolean a(androidx.appcompat.view.menu.h hVar) {
            Window.Callback callback = f.this.f86584l.getCallback();
            if (callback == null) {
                return true;
            }
            callback.onMenuOpened(108, hVar);
            return true;
        }

        @Override // androidx.appcompat.view.menu.n.a
        public final void onCloseMenu(androidx.appcompat.view.menu.h hVar, boolean z14) {
            f.this.H(hVar);
        }
    }

    public class e implements m.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final m.b.a f86600a;

        public class a extends i1 {
            public a() {
            }

            @Override // androidx.core.view.i1, androidx.core.view.h1
            public final void onAnimationEnd() {
                e eVar = e.this;
                f.this.f86594x.setVisibility(8);
                f fVar = f.this;
                PopupWindow popupWindow = fVar.f86595y;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (fVar.f86594x.getParent() instanceof View) {
                    View view2 = (View) fVar.f86594x.getParent();
                    WeakHashMap<View, g1> weakHashMap = s0.f6563a;
                    view2.requestApplyInsets();
                }
                fVar.f86594x.h();
                fVar.A.d(null);
                fVar.A = null;
                ViewGroup viewGroup = fVar.D;
                WeakHashMap<View, g1> weakHashMap2 = s0.f6563a;
                viewGroup.requestApplyInsets();
            }
        }

        public e(m.b.a aVar) {
            this.f86600a = aVar;
        }

        @Override // m.b.a
        public final void a(m.b bVar) {
            this.f86600a.a(bVar);
            f fVar = f.this;
            if (fVar.f86595y != null) {
                fVar.f86584l.getDecorView().removeCallbacks(fVar.f86596z);
            }
            if (fVar.f86594x != null) {
                g1 g1Var = fVar.A;
                if (g1Var != null) {
                    g1Var.b();
                }
                g1 g1VarC = s0.c(fVar.f86594x);
                g1VarC.a(0.0f);
                fVar.A = g1VarC;
                g1VarC.d(new a());
            }
            i.d dVar = fVar.f86586n;
            if (dVar != null) {
                dVar.onSupportActionModeFinished(fVar.f86593w);
            }
            fVar.f86593w = null;
            ViewGroup viewGroup = fVar.D;
            WeakHashMap<View, g1> weakHashMap = s0.f6563a;
            viewGroup.requestApplyInsets();
            fVar.Z();
        }

        @Override // m.b.a
        public final boolean b(m.b bVar, Menu menu) {
            ViewGroup viewGroup = f.this.D;
            WeakHashMap<View, g1> weakHashMap = s0.f6563a;
            viewGroup.requestApplyInsets();
            return this.f86600a.b(bVar, menu);
        }

        @Override // m.b.a
        public final boolean c(m.b bVar, Menu menu) {
            return this.f86600a.c(bVar, menu);
        }

        @Override // m.b.a
        public final boolean d(m.b bVar, MenuItem menuItem) {
            return this.f86600a.d(bVar, menuItem);
        }
    }

    /* JADX INFO: renamed from: i.f$f, reason: collision with other inner class name */
    public static class C1718f {
        private C1718f() {
        }

        public static boolean a(PowerManager powerManager) {
            return powerManager.isPowerSaveMode();
        }

        public static String b(Locale locale) {
            return locale.toLanguageTag();
        }
    }

    public static class g {
        private g() {
        }

        public static void a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            LocaleList locales = configuration.getLocales();
            LocaleList locales2 = configuration2.getLocales();
            if (locales.equals(locales2)) {
                return;
            }
            configuration3.setLocales(locales2);
            configuration3.locale = configuration2.locale;
        }

        public static h7.g b(Configuration configuration) {
            return h7.g.a(configuration.getLocales().toLanguageTags());
        }

        public static void c(h7.g gVar) {
            LocaleList.setDefault(LocaleList.forLanguageTags(gVar.f82328a.a()));
        }

        public static void d(Configuration configuration, h7.g gVar) {
            configuration.setLocales(LocaleList.forLanguageTags(gVar.f82328a.a()));
        }
    }

    public static class h {
        private h() {
        }

        public static OnBackInvokedDispatcher a(Activity activity) {
            return activity.getOnBackInvokedDispatcher();
        }

        public static OnBackInvokedCallback b(Object obj, f fVar) {
            Objects.requireNonNull(fVar);
            y0 y0Var = new y0(fVar, 2);
            h91.a.c(obj).registerOnBackInvokedCallback(1000000, y0Var);
            return y0Var;
        }

        public static void c(Object obj, Object obj2) {
            h91.a.c(obj).unregisterOnBackInvokedCallback(h91.a.a(obj2));
        }
    }

    public class j extends k {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final PowerManager f86608c;

        public j(Context context) {
            super();
            this.f86608c = (PowerManager) context.getApplicationContext().getSystemService("power");
        }

        @Override // i.f.k
        public final IntentFilter b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
            return intentFilter;
        }

        @Override // i.f.k
        public final int c() {
            return C1718f.a(this.f86608c) ? 2 : 1;
        }

        @Override // i.f.k
        public final void d() {
            f.this.D(true, true);
        }
    }

    public abstract class k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public a f86610a;

        public class a extends BroadcastReceiver {
            public a() {
            }

            @Override // android.content.BroadcastReceiver
            public final void onReceive(Context context, Intent intent) {
                k.this.d();
            }
        }

        public k() {
        }

        public final void a() {
            a aVar = this.f86610a;
            if (aVar != null) {
                try {
                    f.this.f86582k.unregisterReceiver(aVar);
                } catch (IllegalArgumentException unused) {
                }
                this.f86610a = null;
            }
        }

        public abstract IntentFilter b();

        public abstract int c();

        public abstract void d();

        public final void e() {
            a();
            IntentFilter intentFilterB = b();
            if (intentFilterB.countActions() == 0) {
                return;
            }
            if (this.f86610a == null) {
                this.f86610a = new a();
            }
            f.this.f86582k.registerReceiver(this.f86610a, intentFilterB);
        }
    }

    public class l extends k {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final s f86613c;

        public l(s sVar) {
            super();
            this.f86613c = sVar;
        }

        @Override // i.f.k
        public final IntentFilter b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.TIME_SET");
            intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
            intentFilter.addAction("android.intent.action.TIME_TICK");
            return intentFilter;
        }

        /* JADX WARN: Code duplicated, block: B:12:0x002f  */
        @Override // i.f.k
        public final int c() {
            Location lastKnownLocation;
            boolean z14;
            long j8;
            s sVar = this.f86613c;
            s.a aVar = sVar.f86666c;
            LocationManager locationManager = sVar.f86665b;
            if (aVar.f86668b > System.currentTimeMillis()) {
                z14 = aVar.f86667a;
            } else {
                Context context = sVar.f86664a;
                Location lastKnownLocation2 = null;
                if (a7.g.a(context, "android.permission.ACCESS_COARSE_LOCATION") == 0) {
                    try {
                        if (locationManager.isProviderEnabled("network")) {
                            lastKnownLocation = locationManager.getLastKnownLocation("network");
                        } else {
                            lastKnownLocation = null;
                        }
                    } catch (Exception unused) {
                    }
                } else {
                    lastKnownLocation = null;
                }
                if (a7.g.a(context, "android.permission.ACCESS_FINE_LOCATION") == 0) {
                    try {
                        if (locationManager.isProviderEnabled("gps")) {
                            lastKnownLocation2 = locationManager.getLastKnownLocation("gps");
                        }
                    } catch (Exception unused2) {
                    }
                }
                if (lastKnownLocation2 == null || lastKnownLocation == null ? lastKnownLocation2 != null : lastKnownLocation2.getTime() > lastKnownLocation.getTime()) {
                    lastKnownLocation = lastKnownLocation2;
                }
                z14 = false;
                if (lastKnownLocation != null) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    if (r.f86659d == null) {
                        r.f86659d = new r();
                    }
                    r rVar = r.f86659d;
                    rVar.a(lastKnownLocation.getLatitude(), lastKnownLocation.getLongitude(), jCurrentTimeMillis - 86400000);
                    rVar.a(lastKnownLocation.getLatitude(), lastKnownLocation.getLongitude(), jCurrentTimeMillis);
                    z14 = rVar.f86662c == 1;
                    long j14 = rVar.f86661b;
                    long j15 = rVar.f86660a;
                    rVar.a(lastKnownLocation.getLatitude(), lastKnownLocation.getLongitude(), jCurrentTimeMillis + 86400000);
                    long j16 = rVar.f86661b;
                    if (j14 == -1 || j15 == -1) {
                        j8 = jCurrentTimeMillis + 43200000;
                    } else {
                        if (jCurrentTimeMillis > j15) {
                            j14 = j16;
                        } else if (jCurrentTimeMillis > j14) {
                            j14 = j15;
                        }
                        j8 = j14 + 60000;
                    }
                    aVar.f86667a = z14;
                    aVar.f86668b = j8;
                } else {
                    int i14 = Calendar.getInstance().get(11);
                    if (i14 < 6 || i14 >= 22) {
                        z14 = true;
                    }
                }
            }
            return z14 ? 2 : 1;
        }

        @Override // i.f.k
        public final void d() {
            f.this.D(true, true);
        }
    }

    public class m extends ContentFrameLayout {
        public m(Context context) {
            super(context);
        }

        @Override // android.view.ViewGroup, android.view.View
        public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return f.this.K(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // android.view.ViewGroup
        public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() == 0) {
                int x14 = (int) motionEvent.getX();
                int y14 = (int) motionEvent.getY();
                if (x14 < -5 || y14 < -5 || x14 > getWidth() + 5 || y14 > getHeight() + 5) {
                    f fVar = f.this;
                    fVar.I(fVar.Q(0), true);
                    return true;
                }
            }
            return super.onInterceptTouchEvent(motionEvent);
        }

        @Override // android.view.View
        public final void setBackgroundResource(int i14) {
            setBackgroundDrawable(j.a.a(getContext(), i14));
        }
    }

    public static final class n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f86616a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f86617b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f86618c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f86619d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public m f86620e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public View f86621f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public View f86622g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public androidx.appcompat.view.menu.h f86623h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public androidx.appcompat.view.menu.f f86624i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public m.d f86625j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public boolean f86626k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public boolean f86627l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public boolean f86628m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public boolean f86629n = false;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public boolean f86630o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public Bundle f86631p;

        public n(int i14) {
            this.f86616a = i14;
        }
    }

    public final class o implements androidx.appcompat.view.menu.n.a {
        public o() {
        }

        @Override // androidx.appcompat.view.menu.n.a
        public final boolean a(androidx.appcompat.view.menu.h hVar) {
            Window.Callback callback;
            if (hVar != hVar.getRootMenu()) {
                return true;
            }
            f fVar = f.this;
            if (!fVar.T || (callback = fVar.f86584l.getCallback()) == null || fVar.N0) {
                return true;
            }
            callback.onMenuOpened(108, hVar);
            return true;
        }

        @Override // androidx.appcompat.view.menu.n.a
        public final void onCloseMenu(androidx.appcompat.view.menu.h hVar, boolean z14) {
            n nVar;
            androidx.appcompat.view.menu.h rootMenu = hVar.getRootMenu();
            int i14 = 0;
            boolean z15 = rootMenu != hVar;
            if (z15) {
                hVar = rootMenu;
            }
            f fVar = f.this;
            n[] nVarArr = fVar.I0;
            int length = nVarArr != null ? nVarArr.length : 0;
            while (true) {
                if (i14 < length) {
                    nVar = nVarArr[i14];
                    if (nVar != null && nVar.f86623h == hVar) {
                        break;
                    } else {
                        i14++;
                    }
                } else {
                    nVar = null;
                    break;
                }
            }
            if (nVar != null) {
                if (!z15) {
                    fVar.I(nVar, z14);
                } else {
                    fVar.G(nVar.f86616a, nVar, rootMenu);
                    fVar.I(nVar, true);
                }
            }
        }
    }

    private f(Context context, Window window, i.d dVar, Object obj) {
        i.c cVar = null;
        this.A = null;
        this.B = true;
        this.P0 = -100;
        this.X0 = new a();
        this.f86582k = context;
        this.f86586n = dVar;
        this.f86581j = obj;
        if (obj instanceof Dialog) {
            while (context != null) {
                if (!(context instanceof i.c)) {
                    if (!(context instanceof ContextWrapper)) {
                        break;
                    } else {
                        context = ((ContextWrapper) context).getBaseContext();
                    }
                } else {
                    cVar = (i.c) context;
                    break;
                }
            }
            if (cVar != null) {
                this.P0 = cVar.getDelegate().g();
            }
        }
        if (this.P0 == -100) {
            String name = this.f86581j.getClass().getName();
            k1<String, Integer> k1Var = f86574e1;
            Integer num = k1Var.get(name);
            if (num != null) {
                this.P0 = num.intValue();
                k1Var.remove(this.f86581j.getClass().getName());
            }
        }
        if (window != null) {
            E(window);
        }
        androidx.appcompat.widget.i.d();
    }

    public static h7.g F(Context context) {
        h7.g gVar;
        h7.g gVarB;
        if (Build.VERSION.SDK_INT >= 33 || (gVar = i.e.f86563c) == null) {
            return null;
        }
        h7.g gVarB2 = g.b(context.getApplicationContext().getResources().getConfiguration());
        h7.h hVar = gVar.f82328a;
        if (hVar.isEmpty()) {
            gVarB = h7.g.f82327b;
        } else {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int i14 = 0;
            while (i14 < gVarB2.f82328a.size() + hVar.size()) {
                Locale locale = i14 < hVar.size() ? hVar.get(i14) : gVarB2.f82328a.get(i14 - hVar.size());
                if (locale != null) {
                    linkedHashSet.add(locale);
                }
                i14++;
            }
            gVarB = h7.g.b(new LocaleList((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()])));
        }
        return gVarB.f82328a.isEmpty() ? gVarB2 : gVarB;
    }

    public static Configuration J(Context context, int i14, h7.g gVar, Configuration configuration, boolean z14) {
        int i15;
        if (i14 == 1) {
            i15 = 16;
        } else if (i14 != 2) {
            i15 = z14 ? 0 : context.getApplicationContext().getResources().getConfiguration().uiMode & 48;
        } else {
            i15 = 32;
        }
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i15 | (configuration2.uiMode & (-49));
        if (gVar != null) {
            g.d(configuration2, gVar);
        }
        return configuration2;
    }

    @Override // i.e
    public final void A(int i14) {
        this.Q0 = i14;
    }

    @Override // i.e
    public final void B(CharSequence charSequence) {
        this.f86589q = charSequence;
        a0 a0Var = this.f86590r;
        if (a0Var != null) {
            a0Var.setWindowTitle(charSequence);
            return;
        }
        i.a aVar = this.f86587o;
        if (aVar != null) {
            aVar.D(charSequence);
            return;
        }
        TextView textView = this.E;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    @Override // i.e
    public final m.b C(m.b.a aVar) {
        m.b bVarOnWindowStartingSupportActionMode;
        ViewGroup viewGroup;
        if (aVar == null) {
            vb.h.s("ActionMode callback can not be null.");
            return null;
        }
        m.b bVar = this.f86593w;
        if (bVar != null) {
            bVar.a();
        }
        e eVar = new e(aVar);
        R();
        i.a aVar2 = this.f86587o;
        i.d dVar = this.f86586n;
        if (aVar2 != null) {
            m.b bVarF = aVar2.F(eVar);
            this.f86593w = bVarF;
            if (bVarF != null && dVar != null) {
                dVar.onSupportActionModeStarted(bVarF);
            }
        }
        if (this.f86593w == null) {
            g1 g1Var = this.A;
            if (g1Var != null) {
                g1Var.b();
            }
            m.b bVar2 = this.f86593w;
            if (bVar2 != null) {
                bVar2.a();
            }
            if (dVar == null || this.N0) {
                bVarOnWindowStartingSupportActionMode = null;
            } else {
                try {
                    bVarOnWindowStartingSupportActionMode = dVar.onWindowStartingSupportActionMode(eVar);
                } catch (AbstractMethodError unused) {
                    bVarOnWindowStartingSupportActionMode = null;
                }
            }
            if (bVarOnWindowStartingSupportActionMode != null) {
                this.f86593w = bVarOnWindowStartingSupportActionMode;
            } else {
                if (this.f86594x == null) {
                    if (this.Z) {
                        TypedValue typedValue = new TypedValue();
                        Context context = this.f86582k;
                        Resources.Theme theme = context.getTheme();
                        theme.resolveAttribute(com.garmin.android.apps.connectmobile.R.attr.actionBarTheme, typedValue, true);
                        if (typedValue.resourceId != 0) {
                            Resources.Theme themeNewTheme = context.getResources().newTheme();
                            themeNewTheme.setTo(theme);
                            themeNewTheme.applyStyle(typedValue.resourceId, true);
                            m.d dVar2 = new m.d(context, 0);
                            dVar2.getTheme().setTo(themeNewTheme);
                            context = dVar2;
                        }
                        this.f86594x = new ActionBarContextView(context);
                        PopupWindow popupWindow = new PopupWindow(context, (AttributeSet) null, com.garmin.android.apps.connectmobile.R.attr.actionModePopupWindowStyle);
                        this.f86595y = popupWindow;
                        popupWindow.setWindowLayoutType(2);
                        this.f86595y.setContentView(this.f86594x);
                        this.f86595y.setWidth(-1);
                        context.getTheme().resolveAttribute(com.garmin.android.apps.connectmobile.R.attr.actionBarSize, typedValue, true);
                        this.f86594x.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics()));
                        this.f86595y.setHeight(-2);
                        this.f86596z = new i.i(this);
                    } else {
                        ViewStubCompat viewStubCompat = (ViewStubCompat) this.D.findViewById(com.garmin.android.apps.connectmobile.R.id.action_mode_bar_stub);
                        if (viewStubCompat != null) {
                            viewStubCompat.setLayoutInflater(LayoutInflater.from(O()));
                            this.f86594x = (ActionBarContextView) viewStubCompat.a();
                        }
                    }
                }
                if (this.f86594x != null) {
                    g1 g1Var2 = this.A;
                    if (g1Var2 != null) {
                        g1Var2.b();
                    }
                    this.f86594x.h();
                    m.e eVar2 = new m.e(this.f86594x.getContext(), this.f86594x, eVar, this.f86595y == null);
                    if (eVar.f86600a.c(eVar2, eVar2.f115435h)) {
                        eVar2.g();
                        this.f86594x.f(eVar2);
                        this.f86593w = eVar2;
                        boolean z14 = this.C && (viewGroup = this.D) != null && viewGroup.isLaidOut();
                        ActionBarContextView actionBarContextView = this.f86594x;
                        if (z14) {
                            actionBarContextView.setAlpha(0.0f);
                            g1 g1VarC = s0.c(this.f86594x);
                            g1VarC.a(1.0f);
                            this.A = g1VarC;
                            g1VarC.d(new i.j(this));
                        } else {
                            actionBarContextView.setAlpha(1.0f);
                            this.f86594x.setVisibility(0);
                            if (this.f86594x.getParent() instanceof View) {
                                View view2 = (View) this.f86594x.getParent();
                                WeakHashMap<View, g1> weakHashMap = s0.f6563a;
                                view2.requestApplyInsets();
                            }
                        }
                        if (this.f86595y != null) {
                            this.f86584l.getDecorView().post(this.f86596z);
                        }
                    } else {
                        this.f86593w = null;
                    }
                }
            }
            m.b bVar3 = this.f86593w;
            if (bVar3 != null && dVar != null) {
                dVar.onSupportActionModeStarted(bVar3);
            }
            Z();
            this.f86593w = this.f86593w;
        }
        Z();
        return this.f86593w;
    }

    /* JADX WARN: Code duplicated, block: B:66:0x00db  */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean D(boolean z14, boolean z15) {
        int i14;
        boolean z16;
        if (this.N0) {
            return false;
        }
        int i15 = this.P0;
        if (i15 == -100) {
            i15 = i.e.f86562b;
        }
        Context context = this.f86582k;
        int iT = T(i15, context);
        int i16 = Build.VERSION.SDK_INT;
        h7.g gVarF = i16 < 33 ? F(context) : null;
        if (!z15 && gVarF != null) {
            gVarF = g.b(context.getResources().getConfiguration());
        }
        Configuration configurationJ = J(context, iT, gVarF, null, false);
        boolean z17 = this.S0;
        boolean z18 = true;
        Object obj = this.f86581j;
        if (z17 || !(obj instanceof Activity)) {
            this.S0 = true;
            i14 = this.R0;
        } else {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                i14 = 0;
            } else {
                try {
                    ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(context, obj.getClass()), i16 >= 29 ? 269221888 : 786432);
                    if (activityInfo != null) {
                        this.R0 = activityInfo.configChanges;
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                    this.R0 = 0;
                }
                this.S0 = true;
                i14 = this.R0;
            }
        }
        Configuration configuration = this.O0;
        if (configuration == null) {
            configuration = context.getResources().getConfiguration();
        }
        int i17 = configuration.uiMode & 48;
        int i18 = configurationJ.uiMode & 48;
        h7.g gVarB = g.b(configuration);
        h7.g gVarB2 = gVarF == null ? null : g.b(configurationJ);
        int i19 = i17 != i18 ? 512 : 0;
        if (gVarB2 != null && !gVarB.equals(gVarB2)) {
            i19 |= 8196;
        }
        if (((~i14) & i19) != 0 && z14 && this.L0 && ((f86576g1 || this.M0) && (obj instanceof Activity))) {
            Activity activity = (Activity) obj;
            if (activity.isChild()) {
                z16 = false;
            } else {
                if (Build.VERSION.SDK_INT >= 31 && (i19 & 8192) != 0) {
                    activity.getWindow().getDecorView().setLayoutDirection(configurationJ.getLayoutDirection());
                }
                activity.recreate();
                z16 = true;
            }
        } else {
            z16 = false;
        }
        if (z16 || i19 == 0) {
            z18 = z16;
        } else {
            boolean z19 = (i19 & i14) == i19;
            Resources resources = context.getResources();
            Configuration configuration2 = new Configuration(resources.getConfiguration());
            configuration2.uiMode = (resources.getConfiguration().uiMode & (-49)) | i18;
            if (gVarB2 != null) {
                g.d(configuration2, gVarB2);
            }
            resources.updateConfiguration(configuration2, null);
            int i24 = this.Q0;
            if (i24 != 0) {
                context.setTheme(i24);
                context.getTheme().applyStyle(this.Q0, true);
            }
            if (z19 && (obj instanceof Activity)) {
                Activity activity2 = (Activity) obj;
                if (activity2 instanceof n0) {
                    if (((n0) activity2).getF158016a().getF7973d().a(b0.b.CREATED)) {
                        activity2.onConfigurationChanged(configuration2);
                    }
                } else if (this.M0 && !this.N0) {
                    activity2.onConfigurationChanged(configuration2);
                }
            }
        }
        if (z18 && (obj instanceof i.c)) {
            if ((i19 & 512) != 0) {
                ((i.c) obj).onNightModeChanged(iT);
            }
            if ((i19 & 4) != 0) {
                ((i.c) obj).onLocalesChanged(gVarF);
            }
        }
        if (gVarB2 != null) {
            g.c(g.b(context.getResources().getConfiguration()));
        }
        if (i15 == 0) {
            P(context).e();
        } else {
            l lVar = this.T0;
            if (lVar != null) {
                lVar.a();
            }
        }
        j jVar = this.U0;
        if (i15 == 3) {
            if (jVar == null) {
                this.U0 = new j(context);
            }
            this.U0.e();
        } else if (jVar != null) {
            jVar.a();
        }
        return z18;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x005a  */
    public final void E(Window window) {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        OnBackInvokedCallback onBackInvokedCallback;
        if (this.f86584l != null) {
            vb.h.z("AppCompat has already installed itself into the Window");
            return;
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof i) {
            vb.h.z("AppCompat has already installed itself into the Window");
            return;
        }
        i iVar = new i(callback);
        this.f86585m = iVar;
        window.setCallback(iVar);
        w0 w0VarF = w0.f(this.f86582k, null, f86575f1);
        Drawable drawableC = w0VarF.c(0);
        if (drawableC != null) {
            window.setBackgroundDrawable(drawableC);
        }
        w0VarF.h();
        this.f86584l = window;
        if (Build.VERSION.SDK_INT < 33 || (onBackInvokedDispatcher = this.f86579c1) != null) {
            return;
        }
        if (onBackInvokedDispatcher != null && (onBackInvokedCallback = this.f86580d1) != null) {
            h.c(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f86580d1 = null;
        }
        Object obj = this.f86581j;
        if (obj instanceof Activity) {
            Activity activity = (Activity) obj;
            if (activity.getWindow() != null) {
                this.f86579c1 = h.a(activity);
            } else {
                this.f86579c1 = null;
            }
        } else {
            this.f86579c1 = null;
        }
        Z();
    }

    public final void G(int i14, n nVar, androidx.appcompat.view.menu.h hVar) {
        if (hVar == null) {
            if (nVar == null && i14 >= 0) {
                n[] nVarArr = this.I0;
                if (i14 < nVarArr.length) {
                    nVar = nVarArr[i14];
                }
            }
            if (nVar != null) {
                hVar = nVar.f86623h;
            }
        }
        if ((nVar == null || nVar.f86628m) && !this.N0) {
            i iVar = this.f86585m;
            Window.Callback callback = this.f86584l.getCallback();
            iVar.getClass();
            try {
                iVar.f86606e = true;
                callback.onPanelClosed(i14, hVar);
            } finally {
                iVar.f86606e = false;
            }
        }
    }

    public final void H(androidx.appcompat.view.menu.h hVar) {
        if (this.H0) {
            return;
        }
        this.H0 = true;
        this.f86590r.i();
        Window.Callback callback = this.f86584l.getCallback();
        if (callback != null && !this.N0) {
            callback.onPanelClosed(108, hVar);
        }
        this.H0 = false;
    }

    public final void I(n nVar, boolean z14) {
        m mVar;
        a0 a0Var;
        if (z14 && nVar.f86616a == 0 && (a0Var = this.f86590r) != null && a0Var.f()) {
            H(nVar.f86623h);
            return;
        }
        WindowManager windowManager = (WindowManager) this.f86582k.getSystemService("window");
        if (windowManager != null && nVar.f86628m && (mVar = nVar.f86620e) != null) {
            windowManager.removeView(mVar);
            if (z14) {
                G(nVar.f86616a, nVar, null);
            }
        }
        nVar.f86626k = false;
        nVar.f86627l = false;
        nVar.f86628m = false;
        nVar.f86621f = null;
        nVar.f86629n = true;
        if (this.J0 == nVar) {
            this.J0 = null;
        }
        if (nVar.f86616a == 0) {
            Z();
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0039  */
    /* JADX WARN: Code duplicated, block: B:21:0x0044 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:22:0x0046 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x004a  */
    /* JADX WARN: Code duplicated, block: B:26:0x0050  */
    /* JADX WARN: Code duplicated, block: B:28:0x0058  */
    /* JADX WARN: Code duplicated, block: B:30:0x005c  */
    /* JADX WARN: Code duplicated, block: B:33:0x0065  */
    /* JADX WARN: Code duplicated, block: B:36:0x0069 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:37:0x006b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:39:0x006f  */
    /* JADX WARN: Code duplicated, block: B:42:0x0075  */
    /* JADX WARN: Code duplicated, block: B:56:0x00af  */
    /* JADX WARN: Code duplicated, block: B:58:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:69:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:70:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:76:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:79:0x00f0 A[RETURN] */
    public final boolean K(KeyEvent keyEvent) {
        int keyCode;
        n nVarQ;
        a0 a0Var;
        boolean z14;
        boolean zA;
        boolean zX;
        AudioManager audioManager;
        n nVarQ2;
        Object obj = this.f86581j;
        if (((obj instanceof androidx.core.view.n) || (obj instanceof i.l)) && this.f86584l.getDecorView() != null) {
            WeakHashMap<View, g1> weakHashMap = s0.f6563a;
        }
        if (keyEvent.getKeyCode() == 82) {
            i iVar = this.f86585m;
            Window.Callback callback = this.f86584l.getCallback();
            iVar.getClass();
            try {
                iVar.f86605d = true;
                boolean zDispatchKeyEvent = callback.dispatchKeyEvent(keyEvent);
                iVar.f86605d = false;
                if (!zDispatchKeyEvent) {
                    keyCode = keyEvent.getKeyCode();
                    if (keyEvent.getAction() == 0) {
                        if (keyCode != 4) {
                            this.K0 = (keyEvent.getFlags() & 128) != 0;
                            return false;
                        }
                        if (keyCode == 82) {
                            if (keyEvent.getRepeatCount() == 0) {
                                nVarQ2 = Q(0);
                                if (!nVarQ2.f86628m) {
                                    X(nVarQ2, keyEvent);
                                    return true;
                                }
                            }
                        }
                        return false;
                    }
                    if (keyCode != 4) {
                        if (keyCode == 82) {
                            if (this.f86593w == null) {
                                nVarQ = Q(0);
                                a0Var = this.f86590r;
                                Context context = this.f86582k;
                                if (a0Var != null || !a0Var.d() || ViewConfiguration.get(context).hasPermanentMenuKey()) {
                                    z14 = nVarQ.f86628m;
                                    if (!z14 || nVarQ.f86627l) {
                                        I(nVarQ, true);
                                        zA = z14;
                                    } else if (nVarQ.f86626k) {
                                        if (nVarQ.f86630o) {
                                            nVarQ.f86626k = false;
                                            zX = X(nVarQ, keyEvent);
                                        } else {
                                            zX = true;
                                        }
                                        if (zX) {
                                            V(nVarQ, keyEvent);
                                            zA = true;
                                        } else {
                                            zA = false;
                                        }
                                    } else {
                                        zA = false;
                                    }
                                } else if (this.f86590r.f()) {
                                    zA = this.f86590r.a();
                                } else if (this.N0 || !X(nVarQ, keyEvent)) {
                                    zA = false;
                                } else {
                                    zA = this.f86590r.e();
                                }
                                if (zA && (audioManager = (AudioManager) context.getApplicationContext().getSystemService(MimeTypes.BASE_TYPE_AUDIO)) != null) {
                                    audioManager.playSoundEffect(0);
                                    return true;
                                }
                            }
                        }
                        return false;
                    }
                    if (U()) {
                        return false;
                    }
                }
            } catch (Throwable th3) {
                iVar.f86605d = false;
                throw th3;
            }
        } else {
            keyCode = keyEvent.getKeyCode();
            if (keyEvent.getAction() == 0) {
                if (keyCode != 4) {
                    this.K0 = (keyEvent.getFlags() & 128) != 0;
                    return false;
                }
                if (keyCode == 82) {
                    if (keyEvent.getRepeatCount() == 0) {
                        nVarQ2 = Q(0);
                        if (!nVarQ2.f86628m) {
                            X(nVarQ2, keyEvent);
                            return true;
                        }
                    }
                }
                return false;
            }
            if (keyCode != 4) {
                if (keyCode == 82) {
                    if (this.f86593w == null) {
                        nVarQ = Q(0);
                        a0Var = this.f86590r;
                        Context context2 = this.f86582k;
                        if (a0Var != null) {
                            z14 = nVarQ.f86628m;
                            if (z14) {
                                I(nVarQ, true);
                                zA = z14;
                            } else {
                                I(nVarQ, true);
                                zA = z14;
                            }
                        } else {
                            z14 = nVarQ.f86628m;
                            if (z14) {
                                I(nVarQ, true);
                                zA = z14;
                            } else {
                                I(nVarQ, true);
                                zA = z14;
                            }
                        }
                        if (zA) {
                            audioManager.playSoundEffect(0);
                            return true;
                        }
                    }
                }
                return false;
            }
            if (U()) {
                return false;
            }
        }
        return true;
    }

    public final void L(int i14) {
        n nVarQ = Q(i14);
        if (nVarQ.f86623h != null) {
            Bundle bundle = new Bundle();
            nVarQ.f86623h.saveActionViewStates(bundle);
            if (bundle.size() > 0) {
                nVarQ.f86631p = bundle;
            }
            nVarQ.f86623h.stopDispatchingItemsChanged();
            nVarQ.f86623h.clear();
        }
        nVarQ.f86630o = true;
        nVarQ.f86629n = true;
        if ((i14 == 108 || i14 == 0) && this.f86590r != null) {
            n nVarQ2 = Q(0);
            nVarQ2.f86626k = false;
            X(nVarQ2, null);
        }
    }

    public final void M() {
        ViewGroup viewGroup;
        if (this.C) {
            return;
        }
        Context context = this.f86582k;
        int[] iArr = h.a.f80430j;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(iArr);
        if (!typedArrayObtainStyledAttributes.hasValue(117)) {
            typedArrayObtainStyledAttributes.recycle();
            vb.h.z("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
            return;
        }
        if (typedArrayObtainStyledAttributes.getBoolean(126, false)) {
            u(1);
        } else if (typedArrayObtainStyledAttributes.getBoolean(117, false)) {
            u(108);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(118, false)) {
            u(109);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(119, false)) {
            u(10);
        }
        this.Z = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        N();
        this.f86584l.getDecorView();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        if (this.f86583k0) {
            viewGroup = this.Y ? (ViewGroup) layoutInflaterFrom.inflate(com.garmin.android.apps.connectmobile.R.layout.abc_screen_simple_overlay_action_mode, (ViewGroup) null) : (ViewGroup) layoutInflaterFrom.inflate(com.garmin.android.apps.connectmobile.R.layout.abc_screen_simple, (ViewGroup) null);
        } else if (this.Z) {
            viewGroup = (ViewGroup) layoutInflaterFrom.inflate(com.garmin.android.apps.connectmobile.R.layout.abc_dialog_title_material, (ViewGroup) null);
            this.X = false;
            this.T = false;
        } else if (this.T) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(com.garmin.android.apps.connectmobile.R.attr.actionBarTheme, typedValue, true);
            viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new m.d(context, typedValue.resourceId) : context).inflate(com.garmin.android.apps.connectmobile.R.layout.abc_screen_toolbar, (ViewGroup) null);
            a0 a0Var = (a0) viewGroup.findViewById(com.garmin.android.apps.connectmobile.R.id.decor_content_parent);
            this.f86590r = a0Var;
            a0Var.setWindowCallback(this.f86584l.getCallback());
            if (this.X) {
                this.f86590r.h(109);
            }
            if (this.I) {
                this.f86590r.h(2);
            }
            if (this.P) {
                this.f86590r.h(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            StringBuilder sb3 = new StringBuilder("AppCompat does not support the current theme features: { windowActionBar: ");
            sb3.append(this.T);
            sb3.append(", windowActionBarOverlay: ");
            sb3.append(this.X);
            sb3.append(", android:windowIsFloating: ");
            sb3.append(this.Z);
            sb3.append(", windowActionModeOverlay: ");
            sb3.append(this.Y);
            sb3.append(", windowNoTitle: ");
            vb.h.s(hb.a.k(sb3, this.f86583k0, " }"));
            return;
        }
        i.g gVar = new i.g(this);
        WeakHashMap<View, g1> weakHashMap = s0.f6563a;
        s0.d.c(viewGroup, gVar);
        if (this.f86590r == null) {
            this.E = (TextView) viewGroup.findViewById(com.garmin.android.apps.connectmobile.R.id.title);
        }
        try {
            Method method = viewGroup.getClass().getMethod("makeOptionalFitsSystemWindows", null);
            if (!method.isAccessible()) {
                method.setAccessible(true);
            }
            method.invoke(viewGroup, null);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
        }
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(com.garmin.android.apps.connectmobile.R.id.action_bar_activity_content);
        ViewGroup viewGroup2 = (ViewGroup) this.f86584l.findViewById(R.id.content);
        if (viewGroup2 != null) {
            while (viewGroup2.getChildCount() > 0) {
                View childAt = viewGroup2.getChildAt(0);
                viewGroup2.removeViewAt(0);
                contentFrameLayout.addView(childAt);
            }
            viewGroup2.setId(-1);
            contentFrameLayout.setId(R.id.content);
            if (viewGroup2 instanceof FrameLayout) {
                ((FrameLayout) viewGroup2).setForeground(null);
            }
        }
        this.f86584l.setContentView(viewGroup);
        contentFrameLayout.setAttachListener(new i.h(this));
        this.D = viewGroup;
        Object obj = this.f86581j;
        CharSequence title = obj instanceof Activity ? ((Activity) obj).getTitle() : this.f86589q;
        if (!TextUtils.isEmpty(title)) {
            a0 a0Var2 = this.f86590r;
            if (a0Var2 != null) {
                a0Var2.setWindowTitle(title);
            } else {
                i.a aVar = this.f86587o;
                if (aVar != null) {
                    aVar.D(title);
                } else {
                    TextView textView = this.E;
                    if (textView != null) {
                        textView.setText(title);
                    }
                }
            }
        }
        ContentFrameLayout contentFrameLayout2 = (ContentFrameLayout) this.D.findViewById(R.id.content);
        View decorView = this.f86584l.getDecorView();
        contentFrameLayout2.f4957g.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        if (contentFrameLayout2.isLaidOut()) {
            contentFrameLayout2.requestLayout();
        }
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(iArr);
        typedArrayObtainStyledAttributes2.getValue(124, contentFrameLayout2.getMinWidthMajor());
        typedArrayObtainStyledAttributes2.getValue(125, contentFrameLayout2.getMinWidthMinor());
        if (typedArrayObtainStyledAttributes2.hasValue(122)) {
            typedArrayObtainStyledAttributes2.getValue(122, contentFrameLayout2.getFixedWidthMajor());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(123)) {
            typedArrayObtainStyledAttributes2.getValue(123, contentFrameLayout2.getFixedWidthMinor());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(120)) {
            typedArrayObtainStyledAttributes2.getValue(120, contentFrameLayout2.getFixedHeightMajor());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(121)) {
            typedArrayObtainStyledAttributes2.getValue(121, contentFrameLayout2.getFixedHeightMinor());
        }
        typedArrayObtainStyledAttributes2.recycle();
        contentFrameLayout2.requestLayout();
        this.C = true;
        n nVarQ = Q(0);
        if (this.N0 || nVarQ.f86623h != null) {
            return;
        }
        S(108);
    }

    public final void N() {
        if (this.f86584l == null) {
            Object obj = this.f86581j;
            if (obj instanceof Activity) {
                E(((Activity) obj).getWindow());
            }
        }
        if (this.f86584l != null) {
            return;
        }
        vb.h.z("We have not been given a Window");
    }

    public final Context O() {
        R();
        i.a aVar = this.f86587o;
        Context contextE = aVar != null ? aVar.e() : null;
        return contextE == null ? this.f86582k : contextE;
    }

    public final k P(Context context) {
        if (this.T0 == null) {
            if (s.f86663d == null) {
                Context applicationContext = context.getApplicationContext();
                s.f86663d = new s(applicationContext, (LocationManager) applicationContext.getSystemService(FirebaseAnalytics.Param.LOCATION));
            }
            this.T0 = new l(s.f86663d);
        }
        return this.T0;
    }

    public final n Q(int i14) {
        n[] nVarArr = this.I0;
        if (nVarArr == null || nVarArr.length <= i14) {
            n[] nVarArr2 = new n[i14 + 1];
            if (nVarArr != null) {
                System.arraycopy(nVarArr, 0, nVarArr2, 0, nVarArr.length);
            }
            this.I0 = nVarArr2;
            nVarArr = nVarArr2;
        }
        n nVar = nVarArr[i14];
        if (nVar != null) {
            return nVar;
        }
        n nVar2 = new n(i14);
        nVarArr[i14] = nVar2;
        return nVar2;
    }

    public final void R() {
        M();
        if (this.T && this.f86587o == null) {
            Object obj = this.f86581j;
            if (obj instanceof Activity) {
                this.f86587o = new t((Activity) obj, this.X);
            } else if (obj instanceof Dialog) {
                this.f86587o = new t((Dialog) obj);
            }
            i.a aVar = this.f86587o;
            if (aVar != null) {
                aVar.p(this.Y0);
            }
        }
    }

    public final void S(int i14) {
        this.W0 = (1 << i14) | this.W0;
        if (this.V0) {
            return;
        }
        View decorView = this.f86584l.getDecorView();
        WeakHashMap<View, g1> weakHashMap = s0.f6563a;
        decorView.postOnAnimation(this.X0);
        this.V0 = true;
    }

    public final int T(int i14, Context context) {
        if (i14 != -100) {
            if (i14 == -1) {
                return i14;
            }
            if (i14 != 0) {
                if (i14 == 1 || i14 == 2) {
                    return i14;
                }
                if (i14 != 3) {
                    vb.h.z("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                    return 0;
                }
                if (this.U0 == null) {
                    this.U0 = new j(context);
                }
                return this.U0.c();
            }
            if (((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() != 0) {
                return P(context).c();
            }
        }
        return -1;
    }

    public final boolean U() {
        boolean z14 = this.K0;
        this.K0 = false;
        n nVarQ = Q(0);
        if (!nVarQ.f86628m) {
            m.b bVar = this.f86593w;
            if (bVar != null) {
                bVar.a();
                return true;
            }
            R();
            i.a aVar = this.f86587o;
            if (aVar == null || !aVar.b()) {
                return false;
            }
        } else if (!z14) {
            I(nVarQ, true);
            return true;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:102:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:97:0x01c7  */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x016b, code lost:
    
        if (r15.f4761h.getCount() > 0) goto L85;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void V(n nVar, KeyEvent keyEvent) {
        ExpandedMenuView expandedMenuView;
        int i14;
        ViewGroup.LayoutParams layoutParams;
        boolean z14 = nVar.f86628m;
        int i15 = nVar.f86616a;
        if (z14 || this.N0) {
            return;
        }
        Context context = this.f86582k;
        if (i15 == 0 && (context.getResources().getConfiguration().screenLayout & 15) == 4) {
            return;
        }
        Window.Callback callback = this.f86584l.getCallback();
        if (callback != null && !callback.onMenuOpened(i15, nVar.f86623h)) {
            I(nVar, true);
            return;
        }
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager != null && X(nVar, keyEvent)) {
            m mVar = nVar.f86620e;
            if (mVar != null && !nVar.f86629n) {
                View view2 = nVar.f86622g;
                if (view2 != null && (layoutParams = view2.getLayoutParams()) != null && layoutParams.width == -1) {
                    i14 = -1;
                }
                nVar.f86627l = false;
                WindowManager.LayoutParams layoutParams2 = new WindowManager.LayoutParams(i14, -2, 0, 0, 1002, 8519680, -3);
                layoutParams2.gravity = nVar.f86618c;
                layoutParams2.windowAnimations = nVar.f86619d;
                windowManager.addView(nVar.f86620e, layoutParams2);
                nVar.f86628m = true;
                if (i15 == 0) {
                    Z();
                }
            }
            if (mVar == null) {
                Context contextO = O();
                TypedValue typedValue = new TypedValue();
                Resources.Theme themeNewTheme = contextO.getResources().newTheme();
                themeNewTheme.setTo(contextO.getTheme());
                themeNewTheme.resolveAttribute(com.garmin.android.apps.connectmobile.R.attr.actionBarPopupTheme, typedValue, true);
                int i16 = typedValue.resourceId;
                if (i16 != 0) {
                    themeNewTheme.applyStyle(i16, true);
                }
                themeNewTheme.resolveAttribute(com.garmin.android.apps.connectmobile.R.attr.panelMenuListTheme, typedValue, true);
                int i17 = typedValue.resourceId;
                if (i17 != 0) {
                    themeNewTheme.applyStyle(i17, true);
                } else {
                    themeNewTheme.applyStyle(2132149210, true);
                }
                m.d dVar = new m.d(contextO, 0);
                dVar.getTheme().setTo(themeNewTheme);
                nVar.f86625j = dVar;
                TypedArray typedArrayObtainStyledAttributes = dVar.obtainStyledAttributes(h.a.f80430j);
                nVar.f86617b = typedArrayObtainStyledAttributes.getResourceId(86, 0);
                nVar.f86619d = typedArrayObtainStyledAttributes.getResourceId(1, 0);
                typedArrayObtainStyledAttributes.recycle();
                nVar.f86620e = new m(nVar.f86625j);
                nVar.f86618c = 81;
            } else if (nVar.f86629n && mVar.getChildCount() > 0) {
                nVar.f86620e.removeAllViews();
            }
            View view3 = nVar.f86622g;
            if (view3 == null) {
                if (nVar.f86623h != null) {
                    if (this.f86592v == null) {
                        this.f86592v = new o();
                    }
                    o oVar = this.f86592v;
                    if (nVar.f86623h == null) {
                        expandedMenuView = null;
                    } else {
                        if (nVar.f86624i == null) {
                            androidx.appcompat.view.menu.f fVar = new androidx.appcompat.view.menu.f(nVar.f86625j, com.garmin.android.apps.connectmobile.R.layout.abc_list_menu_item_layout);
                            nVar.f86624i = fVar;
                            fVar.f4760g = oVar;
                            nVar.f86623h.addMenuPresenter(fVar);
                        }
                        androidx.appcompat.view.menu.f fVar2 = nVar.f86624i;
                        m mVar2 = nVar.f86620e;
                        if (fVar2.f4757d == null) {
                            fVar2.f4757d = (ExpandedMenuView) fVar2.f4755b.inflate(com.garmin.android.apps.connectmobile.R.layout.abc_expanded_menu_layout, (ViewGroup) mVar2, false);
                            if (fVar2.f4761h == null) {
                                fVar2.f4761h = fVar2.new a();
                            }
                            fVar2.f4757d.setAdapter((ListAdapter) fVar2.f4761h);
                            fVar2.f4757d.setOnItemClickListener(fVar2);
                        }
                        expandedMenuView = fVar2.f4757d;
                    }
                    nVar.f86621f = expandedMenuView;
                    if (expandedMenuView != null) {
                    }
                }
                nVar.f86629n = true;
                return;
            }
            nVar.f86621f = view3;
            if (nVar.f86621f != null) {
                if (nVar.f86622g == null) {
                    androidx.appcompat.view.menu.f fVar3 = nVar.f86624i;
                    if (fVar3.f4761h == null) {
                        fVar3.f4761h = fVar3.new a();
                    }
                }
                ViewGroup.LayoutParams layoutParams3 = nVar.f86621f.getLayoutParams();
                if (layoutParams3 == null) {
                    layoutParams3 = new ViewGroup.LayoutParams(-2, -2);
                }
                nVar.f86620e.setBackgroundResource(nVar.f86617b);
                ViewParent parent = nVar.f86621f.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(nVar.f86621f);
                }
                nVar.f86620e.addView(nVar.f86621f, layoutParams3);
                if (!nVar.f86621f.hasFocus()) {
                    nVar.f86621f.requestFocus();
                }
            }
            nVar.f86629n = true;
            return;
            i14 = -2;
            nVar.f86627l = false;
            WindowManager.LayoutParams layoutParams4 = new WindowManager.LayoutParams(i14, -2, 0, 0, 1002, 8519680, -3);
            layoutParams4.gravity = nVar.f86618c;
            layoutParams4.windowAnimations = nVar.f86619d;
            windowManager.addView(nVar.f86620e, layoutParams4);
            nVar.f86628m = true;
            if (i15 == 0) {
                Z();
            }
        }
    }

    public final boolean W(n nVar, int i14, KeyEvent keyEvent) {
        androidx.appcompat.view.menu.h hVar;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((nVar.f86626k || X(nVar, keyEvent)) && (hVar = nVar.f86623h) != null) {
            return hVar.performShortcut(i14, keyEvent, 1);
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:62:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:67:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:71:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:74:0x00fb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:75:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:82:0x0110  */
    public final boolean X(n nVar, KeyEvent keyEvent) {
        androidx.appcompat.view.menu.h hVar;
        a0 a0Var;
        Resources.Theme themeNewTheme;
        a0 a0Var2;
        a0 a0Var3;
        if (!this.N0) {
            boolean z14 = nVar.f86626k;
            int i14 = nVar.f86616a;
            if (z14) {
                return true;
            }
            n nVar2 = this.J0;
            if (nVar2 != null && nVar2 != nVar) {
                I(nVar2, false);
            }
            Window.Callback callback = this.f86584l.getCallback();
            if (callback != null) {
                nVar.f86622g = callback.onCreatePanelView(i14);
            }
            boolean z15 = i14 == 0 || i14 == 108;
            if (z15 && (a0Var3 = this.f86590r) != null) {
                a0Var3.g();
            }
            if (nVar.f86622g == null && (!z15 || !(this.f86587o instanceof q))) {
                androidx.appcompat.view.menu.h hVar2 = nVar.f86623h;
                if (hVar2 == null || nVar.f86630o) {
                    if (hVar2 == null) {
                        Context context = this.f86582k;
                        if ((i14 == 0 || i14 == 108) && this.f86590r != null) {
                            TypedValue typedValue = new TypedValue();
                            Resources.Theme theme = context.getTheme();
                            theme.resolveAttribute(com.garmin.android.apps.connectmobile.R.attr.actionBarTheme, typedValue, true);
                            if (typedValue.resourceId != 0) {
                                themeNewTheme = context.getResources().newTheme();
                                themeNewTheme.setTo(theme);
                                themeNewTheme.applyStyle(typedValue.resourceId, true);
                                themeNewTheme.resolveAttribute(com.garmin.android.apps.connectmobile.R.attr.actionBarWidgetTheme, typedValue, true);
                            } else {
                                theme.resolveAttribute(com.garmin.android.apps.connectmobile.R.attr.actionBarWidgetTheme, typedValue, true);
                                themeNewTheme = null;
                            }
                            if (typedValue.resourceId != 0) {
                                if (themeNewTheme == null) {
                                    themeNewTheme = context.getResources().newTheme();
                                    themeNewTheme.setTo(theme);
                                }
                                themeNewTheme.applyStyle(typedValue.resourceId, true);
                            }
                            if (themeNewTheme != null) {
                                m.d dVar = new m.d(context, 0);
                                dVar.getTheme().setTo(themeNewTheme);
                                context = dVar;
                            }
                        }
                        androidx.appcompat.view.menu.h hVar3 = new androidx.appcompat.view.menu.h(context);
                        hVar3.setCallback(this);
                        androidx.appcompat.view.menu.h hVar4 = nVar.f86623h;
                        if (hVar3 != hVar4) {
                            if (hVar4 != null) {
                                hVar4.removeMenuPresenter(nVar.f86624i);
                            }
                            nVar.f86623h = hVar3;
                            androidx.appcompat.view.menu.f fVar = nVar.f86624i;
                            if (fVar != null) {
                                hVar3.addMenuPresenter(fVar);
                            }
                        }
                        if (nVar.f86623h != null) {
                            if (z15 && this.f86590r != null) {
                                if (this.f86591t == null) {
                                    this.f86591t = new d();
                                }
                                this.f86590r.b(nVar.f86623h, this.f86591t);
                            }
                            nVar.f86623h.stopDispatchingItemsChanged();
                            if (callback.onCreatePanelMenu(i14, nVar.f86623h)) {
                                nVar.f86630o = false;
                            } else {
                                hVar = nVar.f86623h;
                                if (hVar != null) {
                                    if (hVar != null) {
                                        hVar.removeMenuPresenter(nVar.f86624i);
                                    }
                                    nVar.f86623h = null;
                                }
                                if (z15 && (a0Var = this.f86590r) != null) {
                                    a0Var.b(null, this.f86591t);
                                }
                            }
                        }
                    } else {
                        if (z15) {
                            if (this.f86591t == null) {
                                this.f86591t = new d();
                            }
                            this.f86590r.b(nVar.f86623h, this.f86591t);
                        }
                        nVar.f86623h.stopDispatchingItemsChanged();
                        if (callback.onCreatePanelMenu(i14, nVar.f86623h)) {
                            hVar = nVar.f86623h;
                            if (hVar != null) {
                                if (hVar != null) {
                                    hVar.removeMenuPresenter(nVar.f86624i);
                                }
                                nVar.f86623h = null;
                            }
                            if (z15) {
                                a0Var.b(null, this.f86591t);
                            }
                        } else {
                            nVar.f86630o = false;
                        }
                    }
                }
                nVar.f86623h.stopDispatchingItemsChanged();
                Bundle bundle = nVar.f86631p;
                if (bundle != null) {
                    nVar.f86623h.restoreActionViewStates(bundle);
                    nVar.f86631p = null;
                }
                if (!callback.onPreparePanel(0, nVar.f86622g, nVar.f86623h)) {
                    if (z15 && (a0Var2 = this.f86590r) != null) {
                        a0Var2.b(null, this.f86591t);
                    }
                    nVar.f86623h.startDispatchingItemsChanged();
                    return false;
                }
                nVar.f86623h.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
                nVar.f86623h.startDispatchingItemsChanged();
            }
            nVar.f86626k = true;
            nVar.f86627l = false;
            this.J0 = nVar;
            return true;
        }
        return false;
    }

    public final void Y() {
        if (this.C) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    public final void Z() {
        OnBackInvokedCallback onBackInvokedCallback;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean z14 = false;
            if (this.f86579c1 != null && (Q(0).f86628m || this.f86593w != null)) {
                z14 = true;
            }
            if (z14 && this.f86580d1 == null) {
                this.f86580d1 = h.b(this.f86579c1, this);
            } else {
                if (z14 || (onBackInvokedCallback = this.f86580d1) == null) {
                    return;
                }
                h.c(this.f86579c1, onBackInvokedCallback);
                this.f86580d1 = null;
            }
        }
    }

    @Override // i.e
    public final void a(View view2, ViewGroup.LayoutParams layoutParams) {
        M();
        ((ViewGroup) this.D.findViewById(R.id.content)).addView(view2, layoutParams);
        this.f86585m.a(this.f86584l.getCallback());
    }

    @Override // i.e
    public final boolean b() {
        return D(true, true);
    }

    @Override // i.e
    public final Context c(Context context) {
        Configuration configuration;
        this.L0 = true;
        int i14 = this.P0;
        if (i14 == -100) {
            i14 = i.e.f86562b;
        }
        int iT = T(i14, context);
        if (i.e.l(context) && i.e.l(context)) {
            if (Build.VERSION.SDK_INT < 33) {
                synchronized (i.e.f86569i) {
                    try {
                        h7.g gVar = i.e.f86563c;
                        if (gVar == null) {
                            if (i.e.f86564d == null) {
                                i.e.f86564d = h7.g.a(z6.c.b(context));
                            }
                            if (!i.e.f86564d.f82328a.isEmpty()) {
                                i.e.f86563c = i.e.f86564d;
                            }
                        } else if (!gVar.equals(i.e.f86564d)) {
                            h7.g gVar2 = i.e.f86563c;
                            i.e.f86564d = gVar2;
                            z6.c.a(context, gVar2.f82328a.a());
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
            } else if (!i.e.f86566f) {
                i.e.f86561a.execute(new u1(context, 5));
            }
        }
        h7.g gVarF = F(context);
        if (context instanceof ContextThemeWrapper) {
            try {
                ((ContextThemeWrapper) context).applyOverrideConfiguration(J(context, iT, gVarF, null, false));
                return context;
            } catch (IllegalStateException unused) {
            }
        }
        if (context instanceof m.d) {
            try {
                ((m.d) context).a(J(context, iT, gVarF, null, false));
                return context;
            } catch (IllegalStateException unused2) {
            }
        }
        if (!f86576g1) {
            return context;
        }
        Configuration configuration2 = new Configuration();
        configuration2.uiMode = -1;
        configuration2.fontScale = 0.0f;
        Configuration configuration3 = context.createConfigurationContext(configuration2).getResources().getConfiguration();
        Configuration configuration4 = context.getResources().getConfiguration();
        configuration3.uiMode = configuration4.uiMode;
        if (configuration3.equals(configuration4)) {
            configuration = null;
        } else {
            configuration = new Configuration();
            configuration.fontScale = 0.0f;
            if (configuration3.diff(configuration4) != 0) {
                float f14 = configuration3.fontScale;
                float f15 = configuration4.fontScale;
                if (f14 != f15) {
                    configuration.fontScale = f15;
                }
                int i15 = configuration3.mcc;
                int i16 = configuration4.mcc;
                if (i15 != i16) {
                    configuration.mcc = i16;
                }
                int i17 = configuration3.mnc;
                int i18 = configuration4.mnc;
                if (i17 != i18) {
                    configuration.mnc = i18;
                }
                g.a(configuration3, configuration4, configuration);
                int i19 = configuration3.touchscreen;
                int i24 = configuration4.touchscreen;
                if (i19 != i24) {
                    configuration.touchscreen = i24;
                }
                int i25 = configuration3.keyboard;
                int i26 = configuration4.keyboard;
                if (i25 != i26) {
                    configuration.keyboard = i26;
                }
                int i27 = configuration3.keyboardHidden;
                int i28 = configuration4.keyboardHidden;
                if (i27 != i28) {
                    configuration.keyboardHidden = i28;
                }
                int i29 = configuration3.navigation;
                int i30 = configuration4.navigation;
                if (i29 != i30) {
                    configuration.navigation = i30;
                }
                int i34 = configuration3.navigationHidden;
                int i35 = configuration4.navigationHidden;
                if (i34 != i35) {
                    configuration.navigationHidden = i35;
                }
                int i36 = configuration3.orientation;
                int i37 = configuration4.orientation;
                if (i36 != i37) {
                    configuration.orientation = i37;
                }
                int i38 = configuration3.screenLayout & 15;
                int i39 = configuration4.screenLayout & 15;
                if (i38 != i39) {
                    configuration.screenLayout |= i39;
                }
                int i44 = configuration3.screenLayout & 192;
                int i45 = configuration4.screenLayout & 192;
                if (i44 != i45) {
                    configuration.screenLayout |= i45;
                }
                int i46 = configuration3.screenLayout & 48;
                int i47 = configuration4.screenLayout & 48;
                if (i46 != i47) {
                    configuration.screenLayout |= i47;
                }
                int i48 = configuration3.screenLayout & ViewUtils.EDGE_TO_EDGE_FLAGS;
                int i49 = configuration4.screenLayout & ViewUtils.EDGE_TO_EDGE_FLAGS;
                if (i48 != i49) {
                    configuration.screenLayout |= i49;
                }
                int i54 = configuration3.colorMode & 3;
                int i55 = configuration4.colorMode & 3;
                if (i54 != i55) {
                    configuration.colorMode |= i55;
                }
                int i56 = configuration3.colorMode & 12;
                int i57 = configuration4.colorMode & 12;
                if (i56 != i57) {
                    configuration.colorMode |= i57;
                }
                int i58 = configuration3.uiMode & 15;
                int i59 = configuration4.uiMode & 15;
                if (i58 != i59) {
                    configuration.uiMode |= i59;
                }
                int i64 = configuration3.uiMode & 48;
                int i65 = configuration4.uiMode & 48;
                if (i64 != i65) {
                    configuration.uiMode |= i65;
                }
                int i66 = configuration3.screenWidthDp;
                int i67 = configuration4.screenWidthDp;
                if (i66 != i67) {
                    configuration.screenWidthDp = i67;
                }
                int i68 = configuration3.screenHeightDp;
                int i69 = configuration4.screenHeightDp;
                if (i68 != i69) {
                    configuration.screenHeightDp = i69;
                }
                int i74 = configuration3.smallestScreenWidthDp;
                int i75 = configuration4.smallestScreenWidthDp;
                if (i74 != i75) {
                    configuration.smallestScreenWidthDp = i75;
                }
                int i76 = configuration3.densityDpi;
                int i77 = configuration4.densityDpi;
                if (i76 != i77) {
                    configuration.densityDpi = i77;
                }
            }
        }
        Configuration configurationJ = J(context, iT, gVarF, configuration, true);
        m.d dVar = new m.d(context, 2132149222);
        dVar.a(configurationJ);
        try {
            if (context.getTheme() != null) {
                Resources.Theme theme = dVar.getTheme();
                if (Build.VERSION.SDK_INT >= 29) {
                    b7.i.a(theme);
                } else {
                    synchronized (b7.h.f16263a) {
                        if (!b7.h.f16265c) {
                            try {
                                Method declaredMethod = Resources.Theme.class.getDeclaredMethod("rebase", null);
                                b7.h.f16264b = declaredMethod;
                                declaredMethod.setAccessible(true);
                            } catch (NoSuchMethodException unused3) {
                            }
                            b7.h.f16265c = true;
                        }
                        Method method = b7.h.f16264b;
                        if (method != null) {
                            try {
                                method.invoke(theme, null);
                            } catch (IllegalAccessException | InvocationTargetException unused4) {
                                b7.h.f16264b = null;
                            }
                        }
                    }
                }
            }
        } catch (NullPointerException unused5) {
        }
        return dVar;
    }

    @Override // i.e
    public final <T extends View> T d(int i14) {
        M();
        return (T) this.f86584l.findViewById(i14);
    }

    @Override // i.e
    public final Context e() {
        return this.f86582k;
    }

    @Override // i.e
    public final b f() {
        return new b();
    }

    @Override // i.e
    public final int g() {
        return this.P0;
    }

    @Override // i.e
    public final MenuInflater h() {
        if (this.f86588p == null) {
            R();
            i.a aVar = this.f86587o;
            this.f86588p = new m.g(aVar != null ? aVar.e() : this.f86582k);
        }
        return this.f86588p;
    }

    @Override // i.e
    public final i.a i() {
        R();
        return this.f86587o;
    }

    @Override // i.e
    public final void j() {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.f86582k);
        if (layoutInflaterFrom.getFactory() == null) {
            layoutInflaterFrom.setFactory2(this);
        } else {
            layoutInflaterFrom.getFactory2();
        }
    }

    @Override // i.e
    public final void k() {
        if (this.f86587o != null) {
            R();
            if (this.f86587o.h()) {
                return;
            }
            S(0);
        }
    }

    @Override // i.e
    public final void m(Configuration configuration) {
        if (this.T && this.C) {
            R();
            i.a aVar = this.f86587o;
            if (aVar != null) {
                aVar.j();
            }
        }
        androidx.appcompat.widget.i iVarA = androidx.appcompat.widget.i.a();
        Context context = this.f86582k;
        synchronized (iVarA) {
            l0 l0Var = iVarA.f5125a;
            synchronized (l0Var) {
                z<WeakReference<Drawable.ConstantState>> zVar = l0Var.f5173b.get(context);
                if (zVar != null) {
                    zVar.a();
                }
            }
        }
        this.O0 = new Configuration(this.f86582k.getResources().getConfiguration());
        D(false, false);
    }

    @Override // i.e
    public final void n() {
        String strC;
        this.L0 = true;
        D(false, true);
        N();
        Object obj = this.f86581j;
        if (obj instanceof Activity) {
            try {
                Activity activity = (Activity) obj;
                try {
                    strC = z6.i.c(activity, activity.getComponentName());
                } catch (PackageManager.NameNotFoundException e4) {
                    throw new IllegalArgumentException(e4);
                }
            } catch (IllegalArgumentException unused) {
                strC = null;
            }
            if (strC != null) {
                i.a aVar = this.f86587o;
                if (aVar == null) {
                    this.Y0 = true;
                } else {
                    aVar.p(true);
                }
            }
            synchronized (i.e.f86568h) {
                i.e.t(this);
                i.e.f86567g.add(new WeakReference<>(this));
            }
        }
        this.O0 = new Configuration(this.f86582k.getResources().getConfiguration());
        this.M0 = true;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x004d  */
    @Override // i.e
    public final void o() {
        if (this.f86581j instanceof Activity) {
            synchronized (i.e.f86568h) {
                i.e.t(this);
            }
        }
        if (this.V0) {
            this.f86584l.getDecorView().removeCallbacks(this.X0);
        }
        this.N0 = true;
        if (this.P0 != -100) {
            Object obj = this.f86581j;
            if ((obj instanceof Activity) && ((Activity) obj).isChangingConfigurations()) {
                f86574e1.put(this.f86581j.getClass().getName(), Integer.valueOf(this.P0));
            } else {
                f86574e1.remove(this.f86581j.getClass().getName());
            }
        } else {
            f86574e1.remove(this.f86581j.getClass().getName());
        }
        i.a aVar = this.f86587o;
        if (aVar != null) {
            aVar.k();
        }
        l lVar = this.T0;
        if (lVar != null) {
            lVar.a();
        }
        j jVar = this.U0;
        if (jVar != null) {
            jVar.a();
        }
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view2, String str, Context context, AttributeSet attributeSet) {
        if (this.f86578b1 == null) {
            int[] iArr = h.a.f80430j;
            Context context2 = this.f86582k;
            TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(iArr);
            String string = typedArrayObtainStyledAttributes.getString(116);
            typedArrayObtainStyledAttributes.recycle();
            if (string == null) {
                this.f86578b1 = new i.n();
            } else {
                try {
                    this.f86578b1 = (i.n) context2.getClassLoader().loadClass(string).getDeclaredConstructor(null).newInstance(null);
                } catch (Throwable unused) {
                    this.f86578b1 = new i.n();
                }
            }
        }
        i.n nVar = this.f86578b1;
        int i14 = b1.f5036c;
        return nVar.createView(view2, str, context, attributeSet, false, false, true, false);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x002a  */
    @Override // androidx.appcompat.view.menu.h.a
    public final boolean onMenuItemSelected(androidx.appcompat.view.menu.h hVar, MenuItem menuItem) {
        n nVar;
        Window.Callback callback = this.f86584l.getCallback();
        if (callback != null && !this.N0) {
            androidx.appcompat.view.menu.h rootMenu = hVar.getRootMenu();
            n[] nVarArr = this.I0;
            int length = nVarArr != null ? nVarArr.length : 0;
            for (int i14 = 0; i14 < length; i14++) {
                nVar = nVarArr[i14];
                if (nVar != null && nVar.f86623h == rootMenu) {
                    if (nVar != null) {
                        return callback.onMenuItemSelected(nVar.f86616a, menuItem);
                    }
                }
            }
            nVar = null;
            if (nVar != null) {
                return callback.onMenuItemSelected(nVar.f86616a, menuItem);
            }
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.h.a
    public final void onMenuModeChange(androidx.appcompat.view.menu.h hVar) {
        a0 a0Var = this.f86590r;
        if (a0Var == null || !a0Var.d() || (ViewConfiguration.get(this.f86582k).hasPermanentMenuKey() && !this.f86590r.c())) {
            n nVarQ = Q(0);
            nVarQ.f86629n = true;
            I(nVarQ, false);
            V(nVarQ, null);
            return;
        }
        Window.Callback callback = this.f86584l.getCallback();
        if (this.f86590r.f()) {
            this.f86590r.a();
            if (this.N0) {
                return;
            }
            callback.onPanelClosed(108, Q(0).f86623h);
            return;
        }
        if (callback == null || this.N0) {
            return;
        }
        if (this.V0 && (1 & this.W0) != 0) {
            View decorView = this.f86584l.getDecorView();
            a aVar = this.X0;
            decorView.removeCallbacks(aVar);
            aVar.run();
        }
        n nVarQ2 = Q(0);
        androidx.appcompat.view.menu.h hVar2 = nVarQ2.f86623h;
        if (hVar2 == null || nVarQ2.f86630o || !callback.onPreparePanel(0, nVarQ2.f86622g, hVar2)) {
            return;
        }
        callback.onMenuOpened(108, nVarQ2.f86623h);
        this.f86590r.e();
    }

    @Override // i.e
    public final void p() {
        M();
    }

    @Override // i.e
    public final void q() {
        R();
        i.a aVar = this.f86587o;
        if (aVar != null) {
            aVar.B(true);
        }
    }

    @Override // i.e
    public final void r() {
        D(true, false);
    }

    @Override // i.e
    public final void s() {
        R();
        i.a aVar = this.f86587o;
        if (aVar != null) {
            aVar.B(false);
        }
    }

    @Override // i.e
    public final boolean u(int i14) {
        if (i14 == 8) {
            i14 = 108;
        } else if (i14 == 9) {
            i14 = 109;
        }
        if (this.f86583k0 && i14 == 108) {
            return false;
        }
        if (this.T && i14 == 1) {
            this.T = false;
        }
        if (i14 == 1) {
            Y();
            this.f86583k0 = true;
            return true;
        }
        if (i14 == 2) {
            Y();
            this.I = true;
            return true;
        }
        if (i14 == 5) {
            Y();
            this.P = true;
            return true;
        }
        if (i14 == 10) {
            Y();
            this.Y = true;
            return true;
        }
        if (i14 == 108) {
            Y();
            this.T = true;
            return true;
        }
        if (i14 != 109) {
            return this.f86584l.requestFeature(i14);
        }
        Y();
        this.X = true;
        return true;
    }

    @Override // i.e
    public final void v(int i14) {
        M();
        ViewGroup viewGroup = (ViewGroup) this.D.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f86582k).inflate(i14, viewGroup);
        this.f86585m.a(this.f86584l.getCallback());
    }

    @Override // i.e
    public final void w(View view2) {
        M();
        ViewGroup viewGroup = (ViewGroup) this.D.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view2);
        this.f86585m.a(this.f86584l.getCallback());
    }

    @Override // i.e
    public final void x(View view2, ViewGroup.LayoutParams layoutParams) {
        M();
        ViewGroup viewGroup = (ViewGroup) this.D.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view2, layoutParams);
        this.f86585m.a(this.f86584l.getCallback());
    }

    @Override // i.e
    public final void z(Toolbar toolbar) {
        Object obj = this.f86581j;
        if (obj instanceof Activity) {
            R();
            i.a aVar = this.f86587o;
            if (aVar instanceof t) {
                vb.h.z("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
                return;
            }
            this.f86588p = null;
            if (aVar != null) {
                aVar.k();
            }
            this.f86587o = null;
            if (toolbar != null) {
                q qVar = new q(toolbar, obj instanceof Activity ? ((Activity) obj).getTitle() : this.f86589q, this.f86585m);
                this.f86587o = qVar;
                this.f86585m.f86603b = qVar.f86647c;
                toolbar.setBackInvokedCallbackEnabled(true);
            } else {
                this.f86585m.f86603b = null;
            }
            k();
        }
    }

    public class i extends m.i {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public c f86603b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f86604c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f86605d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f86606e;

        public i(Window.Callback callback) {
            super(callback);
        }

        public final void a(Window.Callback callback) {
            try {
                this.f86604c = true;
                callback.onContentChanged();
            } finally {
                this.f86604c = false;
            }
        }

        @Override // m.i, android.view.Window.Callback
        public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
            boolean z14 = this.f86605d;
            Window.Callback callback = this.f115486a;
            if (z14) {
                return callback.dispatchKeyEvent(keyEvent);
            }
            return f.this.K(keyEvent) || callback.dispatchKeyEvent(keyEvent);
        }

        @Override // m.i, android.view.Window.Callback
        public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
            if (!this.f115486a.dispatchKeyShortcutEvent(keyEvent)) {
                int keyCode = keyEvent.getKeyCode();
                f fVar = f.this;
                fVar.R();
                i.a aVar = fVar.f86587o;
                if (aVar == null || !aVar.l(keyCode, keyEvent)) {
                    n nVar = fVar.J0;
                    if (nVar == null || !fVar.W(nVar, keyEvent.getKeyCode(), keyEvent)) {
                        if (fVar.J0 == null) {
                            n nVarQ = fVar.Q(0);
                            fVar.X(nVarQ, keyEvent);
                            boolean zW = fVar.W(nVarQ, keyEvent.getKeyCode(), keyEvent);
                            nVarQ.f86626k = false;
                            if (zW) {
                            }
                        }
                        return false;
                    }
                    n nVar2 = fVar.J0;
                    if (nVar2 != null) {
                        nVar2.f86627l = true;
                        return true;
                    }
                }
            }
            return true;
        }

        @Override // m.i, android.view.Window.Callback
        public final void onContentChanged() {
            if (this.f86604c) {
                this.f115486a.onContentChanged();
            }
        }

        @Override // m.i, android.view.Window.Callback
        public final boolean onCreatePanelMenu(int i14, Menu menu) {
            if (i14 != 0 || (menu instanceof androidx.appcompat.view.menu.h)) {
                return this.f115486a.onCreatePanelMenu(i14, menu);
            }
            return false;
        }

        @Override // m.i, android.view.Window.Callback
        public final View onCreatePanelView(int i14) {
            c cVar = this.f86603b;
            if (cVar != null) {
                View view2 = i14 == 0 ? new View(q.this.f86645a.f5291a.getContext()) : null;
                if (view2 != null) {
                    return view2;
                }
            }
            return this.f115486a.onCreatePanelView(i14);
        }

        @Override // m.i, android.view.Window.Callback
        public final boolean onMenuOpened(int i14, Menu menu) {
            super.onMenuOpened(i14, menu);
            f fVar = f.this;
            if (i14 != 108) {
                fVar.getClass();
                return true;
            }
            fVar.R();
            i.a aVar = fVar.f86587o;
            if (aVar != null) {
                aVar.c(true);
            }
            return true;
        }

        @Override // m.i, android.view.Window.Callback
        public final void onPanelClosed(int i14, Menu menu) {
            if (this.f86606e) {
                this.f115486a.onPanelClosed(i14, menu);
                return;
            }
            super.onPanelClosed(i14, menu);
            f fVar = f.this;
            if (i14 == 108) {
                fVar.R();
                i.a aVar = fVar.f86587o;
                if (aVar != null) {
                    aVar.c(false);
                    return;
                }
                return;
            }
            if (i14 != 0) {
                fVar.getClass();
                return;
            }
            n nVarQ = fVar.Q(i14);
            if (nVarQ.f86628m) {
                fVar.I(nVarQ, false);
            }
        }

        @Override // m.i, android.view.Window.Callback
        public final boolean onPreparePanel(int i14, View view2, Menu menu) {
            androidx.appcompat.view.menu.h hVar = menu instanceof androidx.appcompat.view.menu.h ? (androidx.appcompat.view.menu.h) menu : null;
            if (i14 == 0 && hVar == null) {
                return false;
            }
            if (hVar != null) {
                hVar.setOverrideVisibleItems(true);
            }
            c cVar = this.f86603b;
            if (cVar != null) {
                q.e eVar = (q.e) cVar;
                if (i14 == 0) {
                    q qVar = q.this;
                    if (!qVar.f86648d) {
                        qVar.f86645a.f5304n = true;
                        qVar.f86648d = true;
                    }
                }
            }
            boolean zOnPreparePanel = this.f115486a.onPreparePanel(i14, view2, menu);
            if (hVar != null) {
                hVar.setOverrideVisibleItems(false);
            }
            return zOnPreparePanel;
        }

        @Override // m.i, android.view.Window.Callback
        public final void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i14) {
            androidx.appcompat.view.menu.h hVar = f.this.Q(0).f86623h;
            if (hVar != null) {
                super.onProvideKeyboardShortcuts(list, hVar, i14);
            } else {
                super.onProvideKeyboardShortcuts(list, menu, i14);
            }
        }

        @Override // m.i, android.view.Window.Callback
        public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i14) {
            f fVar = f.this;
            if (!fVar.B || i14 != 0) {
                return m.i.a.b(this.f115486a, callback, i14);
            }
            m.f.a aVar = new m.f.a(fVar.f86582k, callback);
            m.b bVarC = fVar.C(aVar);
            if (bVarC != null) {
                return aVar.e(bVarC);
            }
            return null;
        }

        @Override // m.i, android.view.Window.Callback
        public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            return null;
        }
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    public f(Dialog dialog, i.d dVar) {
        this(dialog.getContext(), dialog.getWindow(), dVar, dialog);
    }

    public f(Context context, Window window, i.d dVar) {
        this(context, window, dVar, context);
    }

    public f(Context context, Activity activity, i.d dVar) {
        this(context, null, dVar, activity);
    }

    public f(Activity activity, i.d dVar) {
        this(activity, null, dVar, activity);
    }
}

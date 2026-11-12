package androidx.appcompat.app;

import android.R;
import android.annotation.SuppressLint;
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
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.TypedValue;
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
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.appcompat.view.ActionMode;
import androidx.appcompat.view.menu.MenuView;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.ViewStubCompat;
import androidx.collection.SimpleArrayMap;
import androidx.core.view.WindowInsetsCompat;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.mipay.sdk.Mipay;
import defpackage.cae;
import defpackage.cqi;
import defpackage.dae;
import defpackage.df1;
import defpackage.dli;
import defpackage.eyq;
import defpackage.goq;
import defpackage.if1;
import defpackage.j4q;
import defpackage.jf1;
import defpackage.jrk;
import defpackage.lig;
import defpackage.lwq;
import defpackage.m4i;
import defpackage.mwi;
import defpackage.n3j;
import defpackage.ni4;
import defpackage.o7h;
import defpackage.of1;
import defpackage.owq;
import defpackage.qii;
import defpackage.skr;
import defpackage.tf1;
import defpackage.ui4;
import defpackage.vs5;
import defpackage.wpo;
import defpackage.xfp;
import defpackage.yzd;
import defpackage.z5j;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class AppCompatDelegateImpl extends AppCompatDelegate implements androidx.appcompat.view.menu.e.a, LayoutInflater.Factory2 {
    public static final SimpleArrayMap<String, Integer> b0 = new SimpleArrayMap<>();
    public static final boolean c0 = false;
    public static final int[] d0 = {R.attr.windowBackground};
    public static final boolean e0 = !"robolectric".equals(Build.FINGERPRINT);
    public static final boolean f0 = true;
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean D;
    public boolean E;
    public boolean F;
    public PanelFeatureState[] G;
    public PanelFeatureState H;
    public boolean I;
    public boolean J;
    public boolean K;
    public boolean L;
    public Configuration M;
    public int N;
    public int O;
    public boolean P;
    public boolean Q;
    public p R;
    public p S;
    public boolean T;
    public int U;
    public final Runnable V;
    public boolean W;
    public Rect X;
    public Rect Y;
    public tf1 Z;
    public cae a0;
    public final Object d;
    public final Context e;
    public Window f;
    public n g;
    public final df1 h;
    public ActionBar i;
    public MenuInflater j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public CharSequence f1427k;
    public vs5 l;
    public h m;
    public t n;
    public ActionMode o;
    public ActionBarContextView p;
    public PopupWindow q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Runnable f1428r;
    public lwq s;
    public boolean t;
    public boolean u;
    public ViewGroup v;
    public TextView w;
    public View x;
    public boolean y;
    public boolean z;

    public static final class PanelFeatureState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f1429a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f1430b;
        public int c;
        public int d;
        public int e;
        public int f;
        public ViewGroup g;
        public View h;
        public View i;
        public androidx.appcompat.view.menu.e j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public androidx.appcompat.view.menu.c f1431k;
        public Context l;
        public boolean m;
        public boolean n;
        public boolean o;
        public boolean p;
        public boolean q = false;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public boolean f1432r;
        public Bundle s;

        @SuppressLint({"BanParcelableUsage"})
        public static class SavedState implements Parcelable {
            public static final Parcelable.Creator<SavedState> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f1433a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public boolean f1434b;
            public Bundle c;

            public class a implements Parcelable.ClassLoaderCreator<SavedState> {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public SavedState createFromParcel(Parcel parcel) {
                    return SavedState.a(parcel, null);
                }

                @Override // android.os.Parcelable.ClassLoaderCreator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                    return SavedState.a(parcel, classLoader);
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
                public SavedState[] newArray(int i) {
                    return new SavedState[i];
                }
            }

            public static SavedState a(Parcel parcel, ClassLoader classLoader) {
                SavedState savedState = new SavedState();
                savedState.f1433a = parcel.readInt();
                boolean z = parcel.readInt() == 1;
                savedState.f1434b = z;
                if (z) {
                    savedState.c = parcel.readBundle(classLoader);
                }
                return savedState;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(this.f1433a);
                parcel.writeInt(this.f1434b ? 1 : 0);
                if (this.f1434b) {
                    parcel.writeBundle(this.c);
                }
            }
        }

        public PanelFeatureState(int i) {
            this.f1429a = i;
        }

        public MenuView a(androidx.appcompat.view.menu.i.a aVar) {
            if (this.j == null) {
                return null;
            }
            if (this.f1431k == null) {
                androidx.appcompat.view.menu.c cVar = new androidx.appcompat.view.menu.c(this.l, mwi.l);
                this.f1431k = cVar;
                cVar.f(aVar);
                this.j.b(this.f1431k);
            }
            return this.f1431k.h(this.g);
        }

        public boolean b() {
            if (this.h == null) {
                return false;
            }
            return this.i != null || this.f1431k.a().getCount() > 0;
        }

        public void c(androidx.appcompat.view.menu.e eVar) {
            androidx.appcompat.view.menu.c cVar;
            androidx.appcompat.view.menu.e eVar2 = this.j;
            if (eVar == eVar2) {
                return;
            }
            if (eVar2 != null) {
                eVar2.Q(this.f1431k);
            }
            this.j = eVar;
            if (eVar == null || (cVar = this.f1431k) == null) {
                return;
            }
            eVar.b(cVar);
        }

        public void d(Context context) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme themeNewTheme = context.getResources().newTheme();
            themeNewTheme.setTo(context.getTheme());
            themeNewTheme.resolveAttribute(qii.f31548a, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                themeNewTheme.applyStyle(i, true);
            }
            themeNewTheme.resolveAttribute(qii.I, typedValue, true);
            int i2 = typedValue.resourceId;
            if (i2 != 0) {
                themeNewTheme.applyStyle(i2, true);
            } else {
                themeNewTheme.applyStyle(n3j.c, true);
            }
            ui4 ui4Var = new ui4(context, 0);
            ui4Var.getTheme().setTo(themeNewTheme);
            this.l = ui4Var;
            TypedArray typedArrayObtainStyledAttributes = ui4Var.obtainStyledAttributes(z5j.A0);
            this.f1430b = typedArrayObtainStyledAttributes.getResourceId(z5j.D0, 0);
            this.f = typedArrayObtainStyledAttributes.getResourceId(z5j.C0, 0);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            if ((appCompatDelegateImpl.U & 1) != 0) {
                appCompatDelegateImpl.b0(0);
            }
            AppCompatDelegateImpl appCompatDelegateImpl2 = AppCompatDelegateImpl.this;
            if ((appCompatDelegateImpl2.U & 4096) != 0) {
                appCompatDelegateImpl2.b0(108);
            }
            AppCompatDelegateImpl appCompatDelegateImpl3 = AppCompatDelegateImpl.this;
            appCompatDelegateImpl3.T = false;
            appCompatDelegateImpl3.U = 0;
        }
    }

    public class b implements o7h {
        public b() {
        }

        @Override // defpackage.o7h
        public WindowInsetsCompat a(View view, WindowInsetsCompat windowInsetsCompat) {
            int iM = windowInsetsCompat.m();
            int iR0 = AppCompatDelegateImpl.this.R0(windowInsetsCompat, null);
            if (iM != iR0) {
                windowInsetsCompat = windowInsetsCompat.r(windowInsetsCompat.k(), iR0, windowInsetsCompat.l(), windowInsetsCompat.j());
            }
            return androidx.core.view.c.c0(view, windowInsetsCompat);
        }
    }

    public class c implements ContentFrameLayout.a {
        public c() {
        }

        @Override // androidx.appcompat.widget.ContentFrameLayout.a
        public void a() {
        }

        @Override // androidx.appcompat.widget.ContentFrameLayout.a
        public void onDetachedFromWindow() {
            AppCompatDelegateImpl.this.Z();
        }
    }

    public class d implements Runnable {

        public class a extends owq {
            public a() {
            }

            @Override // defpackage.nwq
            public void b(View view) {
                AppCompatDelegateImpl.this.p.setAlpha(1.0f);
                AppCompatDelegateImpl.this.s.h(null);
                AppCompatDelegateImpl.this.s = null;
            }

            @Override // defpackage.owq, defpackage.nwq
            public void c(View view) {
                AppCompatDelegateImpl.this.p.setVisibility(0);
            }
        }

        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            appCompatDelegateImpl.q.showAtLocation(appCompatDelegateImpl.p, 55, 0, 0);
            AppCompatDelegateImpl.this.c0();
            if (!AppCompatDelegateImpl.this.K0()) {
                AppCompatDelegateImpl.this.p.setAlpha(1.0f);
                AppCompatDelegateImpl.this.p.setVisibility(0);
            } else {
                AppCompatDelegateImpl.this.p.setAlpha(0.0f);
                AppCompatDelegateImpl appCompatDelegateImpl2 = AppCompatDelegateImpl.this;
                appCompatDelegateImpl2.s = androidx.core.view.c.e(appCompatDelegateImpl2.p).b(1.0f);
                AppCompatDelegateImpl.this.s.h(new a());
            }
        }
    }

    public class e extends owq {
        public e() {
        }

        @Override // defpackage.nwq
        public void b(View view) {
            AppCompatDelegateImpl.this.p.setAlpha(1.0f);
            AppCompatDelegateImpl.this.s.h(null);
            AppCompatDelegateImpl.this.s = null;
        }

        @Override // defpackage.owq, defpackage.nwq
        public void c(View view) {
            AppCompatDelegateImpl.this.p.setVisibility(0);
            if (AppCompatDelegateImpl.this.p.getParent() instanceof View) {
                androidx.core.view.c.n0((View) AppCompatDelegateImpl.this.p.getParent());
            }
        }
    }

    public class f implements ActionBarDrawerToggle$Delegate {
        public f() {
        }

        @Override // androidx.appcompat.app.ActionBarDrawerToggle$Delegate
        public Context a() {
            return AppCompatDelegateImpl.this.h0();
        }

        @Override // androidx.appcompat.app.ActionBarDrawerToggle$Delegate
        public void b(Drawable drawable, int i) {
            ActionBar actionBarP = AppCompatDelegateImpl.this.p();
            if (actionBarP != null) {
                actionBarP.setHomeAsUpIndicator(drawable);
                actionBarP.setHomeActionContentDescription(i);
            }
        }
    }

    public interface g {
        boolean a(int i);

        View onCreatePanelView(int i);
    }

    public final class h implements androidx.appcompat.view.menu.i.a {
        public h() {
        }

        @Override // androidx.appcompat.view.menu.i.a
        public void b(androidx.appcompat.view.menu.e eVar, boolean z) {
            AppCompatDelegateImpl.this.S(eVar);
        }

        @Override // androidx.appcompat.view.menu.i.a
        public boolean c(androidx.appcompat.view.menu.e eVar) {
            Window.Callback callbackM0 = AppCompatDelegateImpl.this.m0();
            if (callbackM0 == null) {
                return true;
            }
            callbackM0.onMenuOpened(108, eVar);
            return true;
        }
    }

    public class i implements ActionMode.Callback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public ActionMode.Callback f1443a;

        public class a extends owq {
            public a() {
            }

            @Override // defpackage.nwq
            public void b(View view) {
                AppCompatDelegateImpl.this.p.setVisibility(8);
                AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
                PopupWindow popupWindow = appCompatDelegateImpl.q;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (appCompatDelegateImpl.p.getParent() instanceof View) {
                    androidx.core.view.c.n0((View) AppCompatDelegateImpl.this.p.getParent());
                }
                AppCompatDelegateImpl.this.p.k();
                AppCompatDelegateImpl.this.s.h(null);
                AppCompatDelegateImpl appCompatDelegateImpl2 = AppCompatDelegateImpl.this;
                appCompatDelegateImpl2.s = null;
                androidx.core.view.c.n0(appCompatDelegateImpl2.v);
            }
        }

        public i(ActionMode.Callback callback) {
            this.f1443a = callback;
        }

        @Override // androidx.appcompat.view.ActionMode.Callback
        public boolean a(ActionMode actionMode, Menu menu) {
            return this.f1443a.a(actionMode, menu);
        }

        @Override // androidx.appcompat.view.ActionMode.Callback
        public boolean b(ActionMode actionMode, MenuItem menuItem) {
            return this.f1443a.b(actionMode, menuItem);
        }

        @Override // androidx.appcompat.view.ActionMode.Callback
        public boolean c(ActionMode actionMode, Menu menu) {
            androidx.core.view.c.n0(AppCompatDelegateImpl.this.v);
            return this.f1443a.c(actionMode, menu);
        }

        @Override // androidx.appcompat.view.ActionMode.Callback
        public void d(ActionMode actionMode) {
            this.f1443a.d(actionMode);
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            if (appCompatDelegateImpl.q != null) {
                appCompatDelegateImpl.f.getDecorView().removeCallbacks(AppCompatDelegateImpl.this.f1428r);
            }
            AppCompatDelegateImpl appCompatDelegateImpl2 = AppCompatDelegateImpl.this;
            if (appCompatDelegateImpl2.p != null) {
                appCompatDelegateImpl2.c0();
                AppCompatDelegateImpl appCompatDelegateImpl3 = AppCompatDelegateImpl.this;
                appCompatDelegateImpl3.s = androidx.core.view.c.e(appCompatDelegateImpl3.p).b(0.0f);
                AppCompatDelegateImpl.this.s.h(new a());
            }
            AppCompatDelegateImpl appCompatDelegateImpl4 = AppCompatDelegateImpl.this;
            df1 df1Var = appCompatDelegateImpl4.h;
            if (df1Var != null) {
                df1Var.onSupportActionModeFinished(appCompatDelegateImpl4.o);
            }
            AppCompatDelegateImpl appCompatDelegateImpl5 = AppCompatDelegateImpl.this;
            appCompatDelegateImpl5.o = null;
            androidx.core.view.c.n0(appCompatDelegateImpl5.v);
        }
    }

    @RequiresApi(17)
    public static class j {
        public static Context a(Context context, Configuration configuration) {
            return context.createConfigurationContext(configuration);
        }

        public static void b(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            int i = configuration.densityDpi;
            int i2 = configuration2.densityDpi;
            if (i != i2) {
                configuration3.densityDpi = i2;
            }
        }
    }

    @RequiresApi(21)
    public static class k {
        public static boolean a(PowerManager powerManager) {
            return powerManager.isPowerSaveMode();
        }
    }

    @RequiresApi(24)
    public static class l {
        public static void a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            LocaleList locales = configuration.getLocales();
            LocaleList locales2 = configuration2.getLocales();
            if (locales.equals(locales2)) {
                return;
            }
            configuration3.setLocales(locales2);
            configuration3.locale = configuration2.locale;
        }
    }

    @RequiresApi(26)
    public static class m {
        public static void a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            int i = configuration.colorMode & 3;
            int i2 = configuration2.colorMode;
            if (i != (i2 & 3)) {
                configuration3.colorMode |= i2 & 3;
            }
            int i3 = configuration.colorMode & 12;
            int i4 = configuration2.colorMode;
            if (i3 != (i4 & 12)) {
                configuration3.colorMode |= i4 & 12;
            }
        }
    }

    public class n extends skr {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public g f1446b;
        public boolean c;
        public boolean d;
        public boolean e;

        public n(Window.Callback callback) {
            super(callback);
        }

        public boolean b(Window.Callback callback, KeyEvent keyEvent) {
            try {
                this.d = true;
                return callback.dispatchKeyEvent(keyEvent);
            } finally {
                this.d = false;
            }
        }

        public void c(Window.Callback callback) {
            try {
                this.c = true;
                callback.onContentChanged();
            } finally {
                this.c = false;
            }
        }

        public void d(Window.Callback callback, int i, Menu menu) {
            try {
                this.e = true;
                callback.onPanelClosed(i, menu);
            } finally {
                this.e = false;
            }
        }

        @Override // defpackage.skr, android.view.Window.Callback
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            if (this.d) {
                return a().dispatchKeyEvent(keyEvent);
            }
            return AppCompatDelegateImpl.this.a0(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // defpackage.skr, android.view.Window.Callback
        public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
            return super.dispatchKeyShortcutEvent(keyEvent) || AppCompatDelegateImpl.this.y0(keyEvent.getKeyCode(), keyEvent);
        }

        public void e(g gVar) {
            this.f1446b = gVar;
        }

        public final android.view.ActionMode f(android.view.ActionMode.Callback callback) {
            androidx.appcompat.view.b.a aVar = new androidx.appcompat.view.b.a(AppCompatDelegateImpl.this.e, callback);
            ActionMode actionModeM = AppCompatDelegateImpl.this.M(aVar);
            if (actionModeM != null) {
                return aVar.e(actionModeM);
            }
            return null;
        }

        @Override // android.view.Window.Callback
        public void onContentChanged() {
            if (this.c) {
                a().onContentChanged();
            }
        }

        @Override // defpackage.skr, android.view.Window.Callback
        public boolean onCreatePanelMenu(int i, Menu menu) {
            if (i != 0 || (menu instanceof androidx.appcompat.view.menu.e)) {
                return super.onCreatePanelMenu(i, menu);
            }
            return false;
        }

        @Override // defpackage.skr, android.view.Window.Callback
        public View onCreatePanelView(int i) {
            View viewOnCreatePanelView;
            g gVar = this.f1446b;
            return (gVar == null || (viewOnCreatePanelView = gVar.onCreatePanelView(i)) == null) ? super.onCreatePanelView(i) : viewOnCreatePanelView;
        }

        @Override // defpackage.skr, android.view.Window.Callback
        public boolean onMenuOpened(int i, Menu menu) {
            super.onMenuOpened(i, menu);
            AppCompatDelegateImpl.this.B0(i);
            return true;
        }

        @Override // defpackage.skr, android.view.Window.Callback
        public void onPanelClosed(int i, Menu menu) {
            if (this.e) {
                a().onPanelClosed(i, menu);
            } else {
                super.onPanelClosed(i, menu);
                AppCompatDelegateImpl.this.C0(i);
            }
        }

        @Override // defpackage.skr, android.view.Window.Callback
        public boolean onPreparePanel(int i, View view, Menu menu) {
            androidx.appcompat.view.menu.e eVar = menu instanceof androidx.appcompat.view.menu.e ? (androidx.appcompat.view.menu.e) menu : null;
            if (i == 0 && eVar == null) {
                return false;
            }
            if (eVar != null) {
                eVar.e0(true);
            }
            g gVar = this.f1446b;
            boolean zOnPreparePanel = gVar != null && gVar.a(i);
            if (!zOnPreparePanel) {
                zOnPreparePanel = super.onPreparePanel(i, view, menu);
            }
            if (eVar != null) {
                eVar.e0(false);
            }
            return zOnPreparePanel;
        }

        @Override // defpackage.skr, android.view.Window.Callback
        @RequiresApi(24)
        public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i) {
            androidx.appcompat.view.menu.e eVar;
            PanelFeatureState panelFeatureStateK0 = AppCompatDelegateImpl.this.k0(0, true);
            if (panelFeatureStateK0 == null || (eVar = panelFeatureStateK0.j) == null) {
                super.onProvideKeyboardShortcuts(list, menu, i);
            } else {
                super.onProvideKeyboardShortcuts(list, eVar, i);
            }
        }

        @Override // defpackage.skr, android.view.Window.Callback
        public android.view.ActionMode onWindowStartingActionMode(android.view.ActionMode.Callback callback) {
            return null;
        }

        @Override // defpackage.skr, android.view.Window.Callback
        @RequiresApi(23)
        public android.view.ActionMode onWindowStartingActionMode(android.view.ActionMode.Callback callback, int i) {
            return (AppCompatDelegateImpl.this.t0() && i == 0) ? f(callback) : super.onWindowStartingActionMode(callback, i);
        }
    }

    public class o extends p {
        public final PowerManager c;

        public o(Context context) {
            super();
            this.c = (PowerManager) context.getApplicationContext().getSystemService("power");
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.p
        public IntentFilter b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
            return intentFilter;
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.p
        public int c() {
            return k.a(this.c) ? 2 : 1;
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.p
        public void d() {
            AppCompatDelegateImpl.this.e();
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @VisibleForTesting
    public abstract class p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public BroadcastReceiver f1447a;

        public class a extends BroadcastReceiver {
            public a() {
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                p.this.d();
            }
        }

        public p() {
        }

        public void a() {
            BroadcastReceiver broadcastReceiver = this.f1447a;
            if (broadcastReceiver != null) {
                try {
                    AppCompatDelegateImpl.this.e.unregisterReceiver(broadcastReceiver);
                } catch (IllegalArgumentException unused) {
                }
                this.f1447a = null;
            }
        }

        public abstract IntentFilter b();

        public abstract int c();

        public abstract void d();

        public void e() {
            a();
            IntentFilter intentFilterB = b();
            if (intentFilterB == null || intentFilterB.countActions() == 0) {
                return;
            }
            if (this.f1447a == null) {
                this.f1447a = new a();
            }
            AppCompatDelegateImpl.this.e.registerReceiver(this.f1447a, intentFilterB);
        }
    }

    public class q extends p {
        public final j4q c;

        public q(j4q j4qVar) {
            super();
            this.c = j4qVar;
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.p
        public IntentFilter b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.TIME_SET");
            intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
            intentFilter.addAction("android.intent.action.TIME_TICK");
            return intentFilter;
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.p
        public int c() {
            return this.c.d() ? 2 : 1;
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.p
        public void d() {
            AppCompatDelegateImpl.this.e();
        }
    }

    @RequiresApi(17)
    public static class r {
        public static void a(ContextThemeWrapper contextThemeWrapper, Configuration configuration) {
            contextThemeWrapper.applyOverrideConfiguration(configuration);
        }
    }

    public class s extends ContentFrameLayout {
        public s(Context context) {
            super(context);
        }

        public final boolean b(int i, int i2) {
            return i < -5 || i2 < -5 || i > getWidth() + 5 || i2 > getHeight() + 5;
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return AppCompatDelegateImpl.this.a0(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() != 0 || !b((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return super.onInterceptTouchEvent(motionEvent);
            }
            AppCompatDelegateImpl.this.U(0);
            return true;
        }

        @Override // android.view.View
        public void setBackgroundResource(int i) {
            setBackgroundDrawable(of1.b(getContext(), i));
        }
    }

    public final class t implements androidx.appcompat.view.menu.i.a {
        public t() {
        }

        @Override // androidx.appcompat.view.menu.i.a
        public void b(androidx.appcompat.view.menu.e eVar, boolean z) {
            androidx.appcompat.view.menu.e eVarF = eVar.F();
            boolean z2 = eVarF != eVar;
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            if (z2) {
                eVar = eVarF;
            }
            PanelFeatureState panelFeatureStateF0 = appCompatDelegateImpl.f0(eVar);
            if (panelFeatureStateF0 != null) {
                if (!z2) {
                    AppCompatDelegateImpl.this.V(panelFeatureStateF0, z);
                } else {
                    AppCompatDelegateImpl.this.R(panelFeatureStateF0.f1429a, panelFeatureStateF0, eVarF);
                    AppCompatDelegateImpl.this.V(panelFeatureStateF0, true);
                }
            }
        }

        @Override // androidx.appcompat.view.menu.i.a
        public boolean c(androidx.appcompat.view.menu.e eVar) {
            Window.Callback callbackM0;
            if (eVar != eVar.F()) {
                return true;
            }
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            if (!appCompatDelegateImpl.A || (callbackM0 = appCompatDelegateImpl.m0()) == null || AppCompatDelegateImpl.this.L) {
                return true;
            }
            callbackM0.onMenuOpened(108, eVar);
            return true;
        }
    }

    public AppCompatDelegateImpl(Activity activity, df1 df1Var) {
        this(activity, null, df1Var, activity);
    }

    public static Configuration g0(Configuration configuration, Configuration configuration2) {
        Configuration configuration3 = new Configuration();
        configuration3.fontScale = 0.0f;
        if (configuration2 != null && configuration.diff(configuration2) != 0) {
            float f2 = configuration.fontScale;
            float f3 = configuration2.fontScale;
            if (f2 != f3) {
                configuration3.fontScale = f3;
            }
            int i2 = configuration.mcc;
            int i3 = configuration2.mcc;
            if (i2 != i3) {
                configuration3.mcc = i3;
            }
            int i4 = configuration.mnc;
            int i5 = configuration2.mnc;
            if (i4 != i5) {
                configuration3.mnc = i5;
            }
            l.a(configuration, configuration2, configuration3);
            int i6 = configuration.touchscreen;
            int i7 = configuration2.touchscreen;
            if (i6 != i7) {
                configuration3.touchscreen = i7;
            }
            int i8 = configuration.keyboard;
            int i9 = configuration2.keyboard;
            if (i8 != i9) {
                configuration3.keyboard = i9;
            }
            int i10 = configuration.keyboardHidden;
            int i11 = configuration2.keyboardHidden;
            if (i10 != i11) {
                configuration3.keyboardHidden = i11;
            }
            int i12 = configuration.navigation;
            int i13 = configuration2.navigation;
            if (i12 != i13) {
                configuration3.navigation = i13;
            }
            int i14 = configuration.navigationHidden;
            int i15 = configuration2.navigationHidden;
            if (i14 != i15) {
                configuration3.navigationHidden = i15;
            }
            int i16 = configuration.orientation;
            int i17 = configuration2.orientation;
            if (i16 != i17) {
                configuration3.orientation = i17;
            }
            int i18 = configuration.screenLayout & 15;
            int i19 = configuration2.screenLayout;
            if (i18 != (i19 & 15)) {
                configuration3.screenLayout |= i19 & 15;
            }
            int i20 = configuration.screenLayout & 192;
            int i21 = configuration2.screenLayout;
            if (i20 != (i21 & 192)) {
                configuration3.screenLayout |= i21 & 192;
            }
            int i22 = configuration.screenLayout & 48;
            int i23 = configuration2.screenLayout;
            if (i22 != (i23 & 48)) {
                configuration3.screenLayout |= i23 & 48;
            }
            int i24 = configuration.screenLayout & 768;
            int i25 = configuration2.screenLayout;
            if (i24 != (i25 & 768)) {
                configuration3.screenLayout |= i25 & 768;
            }
            m.a(configuration, configuration2, configuration3);
            int i26 = configuration.uiMode & 15;
            int i27 = configuration2.uiMode;
            if (i26 != (i27 & 15)) {
                configuration3.uiMode |= i27 & 15;
            }
            int i28 = configuration.uiMode & 48;
            int i29 = configuration2.uiMode;
            if (i28 != (i29 & 48)) {
                configuration3.uiMode |= i29 & 48;
            }
            int i30 = configuration.screenWidthDp;
            int i31 = configuration2.screenWidthDp;
            if (i30 != i31) {
                configuration3.screenWidthDp = i31;
            }
            int i32 = configuration.screenHeightDp;
            int i33 = configuration2.screenHeightDp;
            if (i32 != i33) {
                configuration3.screenHeightDp = i33;
            }
            int i34 = configuration.smallestScreenWidthDp;
            int i35 = configuration2.smallestScreenWidthDp;
            if (i34 != i35) {
                configuration3.smallestScreenWidthDp = i35;
            }
            j.b(configuration, configuration2, configuration3);
        }
        return configuration3;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0060  */
    public final boolean A0(int i2, KeyEvent keyEvent) {
        AudioManager audioManager;
        vs5 vs5Var;
        if (this.o != null) {
            return false;
        }
        boolean zD = true;
        PanelFeatureState panelFeatureStateK0 = k0(i2, true);
        if (i2 != 0 || (vs5Var = this.l) == null || !vs5Var.a() || ViewConfiguration.get(this.e).hasPermanentMenuKey()) {
            boolean z = panelFeatureStateK0.o;
            if (z || panelFeatureStateK0.n) {
                V(panelFeatureStateK0, true);
                zD = z;
            } else if (panelFeatureStateK0.m) {
                if (panelFeatureStateK0.f1432r) {
                    panelFeatureStateK0.m = false;
                    if (!H0(panelFeatureStateK0, keyEvent)) {
                        zD = false;
                    }
                }
                E0(panelFeatureStateK0, keyEvent);
            } else {
                zD = false;
            }
        } else if (this.l.c()) {
            zD = this.l.d();
        } else if (this.L || !H0(panelFeatureStateK0, keyEvent)) {
            zD = false;
        } else {
            zD = this.l.b();
        }
        if (zD && (audioManager = (AudioManager) this.e.getApplicationContext().getSystemService("audio")) != null) {
            audioManager.playSoundEffect(0);
        }
        return zD;
    }

    public void B0(int i2) {
        ActionBar actionBarP;
        if (i2 != 108 || (actionBarP = p()) == null) {
            return;
        }
        actionBarP.dispatchMenuVisibilityChanged(true);
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public boolean C(int i2) {
        int iJ0 = J0(i2);
        if (this.E && iJ0 == 108) {
            return false;
        }
        if (this.A && iJ0 == 1) {
            this.A = false;
        }
        if (iJ0 == 1) {
            N0();
            this.E = true;
            return true;
        }
        if (iJ0 == 2) {
            N0();
            this.y = true;
            return true;
        }
        if (iJ0 == 5) {
            N0();
            this.z = true;
            return true;
        }
        if (iJ0 == 10) {
            N0();
            this.C = true;
            return true;
        }
        if (iJ0 == 108) {
            N0();
            this.A = true;
            return true;
        }
        if (iJ0 != 109) {
            return this.f.requestFeature(iJ0);
        }
        N0();
        this.B = true;
        return true;
    }

    public void C0(int i2) {
        if (i2 == 108) {
            ActionBar actionBarP = p();
            if (actionBarP != null) {
                actionBarP.dispatchMenuVisibilityChanged(false);
                return;
            }
            return;
        }
        if (i2 == 0) {
            PanelFeatureState panelFeatureStateK0 = k0(i2, true);
            if (panelFeatureStateK0.o) {
                V(panelFeatureStateK0, false);
            }
        }
    }

    public void D0(ViewGroup viewGroup) {
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public void E(int i2) {
        d0();
        ViewGroup viewGroup = (ViewGroup) this.v.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.e).inflate(i2, viewGroup);
        this.g.c(this.f.getCallback());
    }

    public final void E0(PanelFeatureState panelFeatureState, KeyEvent keyEvent) {
        int i2;
        ViewGroup.LayoutParams layoutParams;
        if (panelFeatureState.o || this.L) {
            return;
        }
        if (panelFeatureState.f1429a == 0 && (this.e.getResources().getConfiguration().screenLayout & 15) == 4) {
            return;
        }
        Window.Callback callbackM0 = m0();
        if (callbackM0 != null && !callbackM0.onMenuOpened(panelFeatureState.f1429a, panelFeatureState.j)) {
            V(panelFeatureState, true);
            return;
        }
        WindowManager windowManager = (WindowManager) this.e.getSystemService("window");
        if (windowManager != null && H0(panelFeatureState, keyEvent)) {
            ViewGroup viewGroup = panelFeatureState.g;
            if (viewGroup != null && !panelFeatureState.q) {
                View view = panelFeatureState.i;
                if (view != null && (layoutParams = view.getLayoutParams()) != null && layoutParams.width == -1) {
                    i2 = -1;
                }
                panelFeatureState.n = false;
                WindowManager.LayoutParams layoutParams2 = new WindowManager.LayoutParams(i2, -2, panelFeatureState.d, panelFeatureState.e, 1002, 8519680, -3);
                layoutParams2.gravity = panelFeatureState.c;
                layoutParams2.windowAnimations = panelFeatureState.f;
                windowManager.addView(panelFeatureState.g, layoutParams2);
                panelFeatureState.o = true;
            }
            if (viewGroup == null) {
                if (!p0(panelFeatureState) || panelFeatureState.g == null) {
                    return;
                }
            } else if (panelFeatureState.q && viewGroup.getChildCount() > 0) {
                panelFeatureState.g.removeAllViews();
            }
            if (!o0(panelFeatureState) || !panelFeatureState.b()) {
                panelFeatureState.q = true;
                return;
            }
            ViewGroup.LayoutParams layoutParams3 = panelFeatureState.h.getLayoutParams();
            if (layoutParams3 == null) {
                layoutParams3 = new ViewGroup.LayoutParams(-2, -2);
            }
            panelFeatureState.g.setBackgroundResource(panelFeatureState.f1430b);
            ViewParent parent = panelFeatureState.h.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(panelFeatureState.h);
            }
            panelFeatureState.g.addView(panelFeatureState.h, layoutParams3);
            if (!panelFeatureState.h.hasFocus()) {
                panelFeatureState.h.requestFocus();
            }
            i2 = -2;
            panelFeatureState.n = false;
            WindowManager.LayoutParams layoutParams4 = new WindowManager.LayoutParams(i2, -2, panelFeatureState.d, panelFeatureState.e, 1002, 8519680, -3);
            layoutParams4.gravity = panelFeatureState.c;
            layoutParams4.windowAnimations = panelFeatureState.f;
            windowManager.addView(panelFeatureState.g, layoutParams4);
            panelFeatureState.o = true;
        }
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public void F(View view) {
        d0();
        ViewGroup viewGroup = (ViewGroup) this.v.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.g.c(this.f.getCallback());
    }

    public final ActionBar F0() {
        return this.i;
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public void G(View view, ViewGroup.LayoutParams layoutParams) {
        d0();
        ViewGroup viewGroup = (ViewGroup) this.v.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.g.c(this.f.getCallback());
    }

    public final boolean G0(PanelFeatureState panelFeatureState, int i2, KeyEvent keyEvent, int i3) {
        androidx.appcompat.view.menu.e eVar;
        boolean zPerformShortcut = false;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((panelFeatureState.m || H0(panelFeatureState, keyEvent)) && (eVar = panelFeatureState.j) != null) {
            zPerformShortcut = eVar.performShortcut(i2, keyEvent, i3);
        }
        if (zPerformShortcut && (i3 & 1) == 0 && this.l == null) {
            V(panelFeatureState, true);
        }
        return zPerformShortcut;
    }

    public final boolean H0(PanelFeatureState panelFeatureState, KeyEvent keyEvent) {
        vs5 vs5Var;
        vs5 vs5Var2;
        vs5 vs5Var3;
        if (this.L) {
            return false;
        }
        if (panelFeatureState.m) {
            return true;
        }
        PanelFeatureState panelFeatureState2 = this.H;
        if (panelFeatureState2 != null && panelFeatureState2 != panelFeatureState) {
            V(panelFeatureState2, false);
        }
        Window.Callback callbackM0 = m0();
        if (callbackM0 != null) {
            panelFeatureState.i = callbackM0.onCreatePanelView(panelFeatureState.f1429a);
        }
        int i2 = panelFeatureState.f1429a;
        boolean z = i2 == 0 || i2 == 108;
        if (z && (vs5Var3 = this.l) != null) {
            vs5Var3.f();
        }
        if (panelFeatureState.i == null && (!z || !(F0() instanceof androidx.appcompat.app.c))) {
            androidx.appcompat.view.menu.e eVar = panelFeatureState.j;
            if (eVar == null || panelFeatureState.f1432r) {
                if (eVar == null && (!q0(panelFeatureState) || panelFeatureState.j == null)) {
                    return false;
                }
                if (z && this.l != null) {
                    if (this.m == null) {
                        this.m = new h();
                    }
                    this.l.e(panelFeatureState.j, this.m);
                }
                panelFeatureState.j.h0();
                if (!callbackM0.onCreatePanelMenu(panelFeatureState.f1429a, panelFeatureState.j)) {
                    panelFeatureState.c(null);
                    if (z && (vs5Var = this.l) != null) {
                        vs5Var.e(null, this.m);
                    }
                    return false;
                }
                panelFeatureState.f1432r = false;
            }
            panelFeatureState.j.h0();
            Bundle bundle = panelFeatureState.s;
            if (bundle != null) {
                panelFeatureState.j.R(bundle);
                panelFeatureState.s = null;
            }
            if (!callbackM0.onPreparePanel(0, panelFeatureState.i, panelFeatureState.j)) {
                if (z && (vs5Var2 = this.l) != null) {
                    vs5Var2.e(null, this.m);
                }
                panelFeatureState.j.g0();
                return false;
            }
            boolean z2 = KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1;
            panelFeatureState.p = z2;
            panelFeatureState.j.setQwertyMode(z2);
            panelFeatureState.j.g0();
        }
        panelFeatureState.m = true;
        panelFeatureState.n = false;
        this.H = panelFeatureState;
        return true;
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    @RequiresApi(17)
    public void I(int i2) {
        if (this.N != i2) {
            this.N = i2;
            if (this.J) {
                e();
            }
        }
    }

    public final void I0(boolean z) {
        vs5 vs5Var = this.l;
        if (vs5Var == null || !vs5Var.a() || (ViewConfiguration.get(this.e).hasPermanentMenuKey() && !this.l.g())) {
            PanelFeatureState panelFeatureStateK0 = k0(0, true);
            panelFeatureStateK0.q = true;
            V(panelFeatureStateK0, false);
            E0(panelFeatureStateK0, null);
            return;
        }
        Window.Callback callbackM0 = m0();
        if (this.l.c() && z) {
            this.l.d();
            if (this.L) {
                return;
            }
            callbackM0.onPanelClosed(108, k0(0, true).j);
            return;
        }
        if (callbackM0 == null || this.L) {
            return;
        }
        if (this.T && (this.U & 1) != 0) {
            this.f.getDecorView().removeCallbacks(this.V);
            this.V.run();
        }
        PanelFeatureState panelFeatureStateK1 = k0(0, true);
        androidx.appcompat.view.menu.e eVar = panelFeatureStateK1.j;
        if (eVar == null || panelFeatureStateK1.f1432r || !callbackM0.onPreparePanel(0, panelFeatureStateK1.i, eVar)) {
            return;
        }
        callbackM0.onMenuOpened(108, panelFeatureStateK1.j);
        this.l.b();
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public void J(Toolbar toolbar) {
        if (this.d instanceof Activity) {
            ActionBar actionBarP = p();
            if (actionBarP instanceof androidx.appcompat.app.d) {
                throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
            }
            this.j = null;
            if (actionBarP != null) {
                actionBarP.onDestroy();
            }
            this.i = null;
            if (toolbar != null) {
                androidx.appcompat.app.c cVar = new androidx.appcompat.app.c(toolbar, l0(), this.g);
                this.i = cVar;
                this.g.e(cVar.c);
            } else {
                this.g.e(null);
            }
            r();
        }
    }

    public final int J0(int i2) {
        if (i2 == 8) {
            return 108;
        }
        if (i2 == 9) {
            return 109;
        }
        return i2;
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public void K(int i2) {
        this.O = i2;
    }

    public final boolean K0() {
        ViewGroup viewGroup;
        return this.u && (viewGroup = this.v) != null && androidx.core.view.c.U(viewGroup);
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public final void L(CharSequence charSequence) {
        this.f1427k = charSequence;
        vs5 vs5Var = this.l;
        if (vs5Var != null) {
            vs5Var.setWindowTitle(charSequence);
            return;
        }
        if (F0() != null) {
            F0().setWindowTitle(charSequence);
            return;
        }
        TextView textView = this.w;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public final boolean L0(ViewParent viewParent) {
        if (viewParent == null) {
            return false;
        }
        View decorView = this.f.getDecorView();
        while (viewParent != null) {
            if (viewParent == decorView || !(viewParent instanceof View) || androidx.core.view.c.T((View) viewParent)) {
                return false;
            }
            viewParent = viewParent.getParent();
        }
        return true;
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public ActionMode M(ActionMode.Callback callback) {
        df1 df1Var;
        if (callback == null) {
            throw new IllegalArgumentException("ActionMode callback can not be null.");
        }
        ActionMode actionMode = this.o;
        if (actionMode != null) {
            actionMode.c();
        }
        i iVar = new i(callback);
        ActionBar actionBarP = p();
        if (actionBarP != null) {
            ActionMode actionModeStartActionMode = actionBarP.startActionMode(iVar);
            this.o = actionModeStartActionMode;
            if (actionModeStartActionMode != null && (df1Var = this.h) != null) {
                df1Var.onSupportActionModeStarted(actionModeStartActionMode);
            }
        }
        if (this.o == null) {
            this.o = M0(iVar);
        }
        return this.o;
    }

    public ActionMode M0(ActionMode.Callback callback) {
        ActionMode actionModeOnWindowStartingSupportActionMode;
        Context ui4Var;
        df1 df1Var;
        c0();
        ActionMode actionMode = this.o;
        if (actionMode != null) {
            actionMode.c();
        }
        if (!(callback instanceof i)) {
            callback = new i(callback);
        }
        df1 df1Var2 = this.h;
        if (df1Var2 == null || this.L) {
            actionModeOnWindowStartingSupportActionMode = null;
        } else {
            try {
                actionModeOnWindowStartingSupportActionMode = df1Var2.onWindowStartingSupportActionMode(callback);
            } catch (AbstractMethodError unused) {
                actionModeOnWindowStartingSupportActionMode = null;
            }
        }
        if (actionModeOnWindowStartingSupportActionMode != null) {
            this.o = actionModeOnWindowStartingSupportActionMode;
        } else {
            if (this.p == null) {
                if (this.D) {
                    TypedValue typedValue = new TypedValue();
                    Resources.Theme theme = this.e.getTheme();
                    theme.resolveAttribute(qii.g, typedValue, true);
                    if (typedValue.resourceId != 0) {
                        Resources.Theme themeNewTheme = this.e.getResources().newTheme();
                        themeNewTheme.setTo(theme);
                        themeNewTheme.applyStyle(typedValue.resourceId, true);
                        ui4Var = new ui4(this.e, 0);
                        ui4Var.getTheme().setTo(themeNewTheme);
                    } else {
                        ui4Var = this.e;
                    }
                    this.p = new ActionBarContextView(ui4Var);
                    PopupWindow popupWindow = new PopupWindow(ui4Var, (AttributeSet) null, qii.j);
                    this.q = popupWindow;
                    m4i.b(popupWindow, 2);
                    this.q.setContentView(this.p);
                    this.q.setWidth(-1);
                    ui4Var.getTheme().resolveAttribute(qii.f31549b, typedValue, true);
                    this.p.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, ui4Var.getResources().getDisplayMetrics()));
                    this.q.setHeight(-2);
                    this.f1428r = new d();
                } else {
                    ViewStubCompat viewStubCompat = (ViewStubCompat) this.v.findViewById(cqi.h);
                    if (viewStubCompat != null) {
                        viewStubCompat.setLayoutInflater(LayoutInflater.from(h0()));
                        this.p = (ActionBarContextView) viewStubCompat.a();
                    }
                }
            }
            if (this.p != null) {
                c0();
                this.p.k();
                androidx.appcompat.view.a aVar = new androidx.appcompat.view.a(this.p.getContext(), this.p, callback, this.q == null);
                if (callback.a(aVar, aVar.e())) {
                    aVar.k();
                    this.p.h(aVar);
                    this.o = aVar;
                    if (K0()) {
                        this.p.setAlpha(0.0f);
                        lwq lwqVarB = androidx.core.view.c.e(this.p).b(1.0f);
                        this.s = lwqVarB;
                        lwqVarB.h(new e());
                    } else {
                        this.p.setAlpha(1.0f);
                        this.p.setVisibility(0);
                        if (this.p.getParent() instanceof View) {
                            androidx.core.view.c.n0((View) this.p.getParent());
                        }
                    }
                    if (this.q != null) {
                        this.f.getDecorView().post(this.f1428r);
                    }
                } else {
                    this.o = null;
                }
            }
        }
        ActionMode actionMode2 = this.o;
        if (actionMode2 != null && (df1Var = this.h) != null) {
            df1Var.onSupportActionModeStarted(actionMode2);
        }
        return this.o;
    }

    public final boolean N(boolean z) {
        if (this.L) {
            return false;
        }
        int iQ = Q();
        boolean zP0 = P0(u0(this.e, iQ), z);
        if (iQ == 0) {
            j0(this.e).e();
        } else {
            p pVar = this.R;
            if (pVar != null) {
                pVar.a();
            }
        }
        if (iQ == 3) {
            i0(this.e).e();
        } else {
            p pVar2 = this.S;
            if (pVar2 != null) {
                pVar2.a();
            }
        }
        return zP0;
    }

    public final void N0() {
        if (this.u) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    public final void O() {
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) this.v.findViewById(R.id.content);
        View decorView = this.f.getDecorView();
        contentFrameLayout.a(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        TypedArray typedArrayObtainStyledAttributes = this.e.obtainStyledAttributes(z5j.A0);
        typedArrayObtainStyledAttributes.getValue(z5j.M0, contentFrameLayout.getMinWidthMajor());
        typedArrayObtainStyledAttributes.getValue(z5j.N0, contentFrameLayout.getMinWidthMinor());
        if (typedArrayObtainStyledAttributes.hasValue(z5j.K0)) {
            typedArrayObtainStyledAttributes.getValue(z5j.K0, contentFrameLayout.getFixedWidthMajor());
        }
        if (typedArrayObtainStyledAttributes.hasValue(z5j.L0)) {
            typedArrayObtainStyledAttributes.getValue(z5j.L0, contentFrameLayout.getFixedWidthMinor());
        }
        if (typedArrayObtainStyledAttributes.hasValue(z5j.I0)) {
            typedArrayObtainStyledAttributes.getValue(z5j.I0, contentFrameLayout.getFixedHeightMajor());
        }
        if (typedArrayObtainStyledAttributes.hasValue(z5j.J0)) {
            typedArrayObtainStyledAttributes.getValue(z5j.J0, contentFrameLayout.getFixedHeightMinor());
        }
        typedArrayObtainStyledAttributes.recycle();
        contentFrameLayout.requestLayout();
    }

    public final AppCompatActivity O0() {
        for (Context baseContext = this.e; baseContext != null; baseContext = ((ContextWrapper) baseContext).getBaseContext()) {
            if (baseContext instanceof AppCompatActivity) {
                return (AppCompatActivity) baseContext;
            }
            if (!(baseContext instanceof ContextWrapper)) {
                break;
            }
        }
        return null;
    }

    public final void P(Window window) {
        if (this.f != null) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof n) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        n nVar = new n(callback);
        this.g = nVar;
        window.setCallback(nVar);
        xfp xfpVarU = xfp.u(this.e, null, d0);
        Drawable drawableH = xfpVarU.h(0);
        if (drawableH != null) {
            window.setBackgroundDrawable(drawableH);
        }
        xfpVarU.w();
        this.f = window;
    }

    public final boolean P0(int i2, boolean z) {
        boolean z2 = false;
        Configuration configurationW = W(this.e, i2, null, false);
        boolean zS0 = s0(this.e);
        Configuration configuration = this.M;
        if (configuration == null) {
            configuration = this.e.getResources().getConfiguration();
        }
        int i3 = configuration.uiMode & 48;
        int i4 = configurationW.uiMode & 48;
        boolean z3 = true;
        if (i3 != i4 && z && !zS0 && this.J && (e0 || this.K)) {
            Object obj = this.d;
            if ((obj instanceof Activity) && !((Activity) obj).isChild()) {
                androidx.core.app.a.u((Activity) this.d);
                z2 = true;
            }
        }
        if (z2 || i3 == i4) {
            z3 = z2;
        } else {
            Q0(i4, zS0, null);
        }
        if (z3) {
            Object obj2 = this.d;
            if (obj2 instanceof AppCompatActivity) {
                ((AppCompatActivity) obj2).onNightModeChanged(i2);
            }
        }
        return z3;
    }

    public final int Q() {
        int i2 = this.N;
        return i2 != -100 ? i2 : AppCompatDelegate.l();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void Q0(int i2, boolean z, Configuration configuration) {
        Resources resources = this.e.getResources();
        Configuration configuration2 = new Configuration(resources.getConfiguration());
        if (configuration != null) {
            configuration2.updateFrom(configuration);
        }
        configuration2.uiMode = i2 | (resources.getConfiguration().uiMode & (-49));
        resources.updateConfiguration(configuration2, null);
        int i3 = this.O;
        if (i3 != 0) {
            this.e.setTheme(i3);
            this.e.getTheme().applyStyle(this.O, true);
        }
        if (z) {
            Object obj = this.d;
            if (obj instanceof Activity) {
                Activity activity = (Activity) obj;
                if (activity instanceof LifecycleOwner) {
                    if (((LifecycleOwner) activity).getLifecycle().getState().isAtLeast(Lifecycle.State.CREATED)) {
                        activity.onConfigurationChanged(configuration2);
                    }
                } else {
                    if (!this.K || this.L) {
                        return;
                    }
                    activity.onConfigurationChanged(configuration2);
                }
            }
        }
    }

    public void R(int i2, PanelFeatureState panelFeatureState, Menu menu) {
        if (menu == null) {
            if (panelFeatureState == null && i2 >= 0) {
                PanelFeatureState[] panelFeatureStateArr = this.G;
                if (i2 < panelFeatureStateArr.length) {
                    panelFeatureState = panelFeatureStateArr[i2];
                }
            }
            if (panelFeatureState != null) {
                menu = panelFeatureState.j;
            }
        }
        if ((panelFeatureState == null || panelFeatureState.o) && !this.L) {
            this.g.d(this.f.getCallback(), i2, menu);
        }
    }

    public final int R0(WindowInsetsCompat windowInsetsCompat, Rect rect) {
        int iM;
        boolean z;
        boolean z2;
        if (windowInsetsCompat != null) {
            iM = windowInsetsCompat.m();
        } else {
            iM = rect != null ? rect.top : 0;
        }
        ActionBarContextView actionBarContextView = this.p;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.p.getLayoutParams();
            boolean z3 = true;
            if (this.p.isShown()) {
                if (this.X == null) {
                    this.X = new Rect();
                    this.Y = new Rect();
                }
                Rect rect2 = this.X;
                Rect rect3 = this.Y;
                if (windowInsetsCompat == null) {
                    rect2.set(rect);
                } else {
                    rect2.set(windowInsetsCompat.k(), windowInsetsCompat.m(), windowInsetsCompat.l(), windowInsetsCompat.j());
                }
                eyq.a(this.v, rect2, rect3);
                int i2 = rect2.top;
                int i3 = rect2.left;
                int i4 = rect2.right;
                WindowInsetsCompat windowInsetsCompatH = androidx.core.view.c.H(this.v);
                int iK = windowInsetsCompatH == null ? 0 : windowInsetsCompatH.k();
                int iL = windowInsetsCompatH == null ? 0 : windowInsetsCompatH.l();
                if (marginLayoutParams.topMargin == i2 && marginLayoutParams.leftMargin == i3 && marginLayoutParams.rightMargin == i4) {
                    z2 = false;
                } else {
                    marginLayoutParams.topMargin = i2;
                    marginLayoutParams.leftMargin = i3;
                    marginLayoutParams.rightMargin = i4;
                    z2 = true;
                }
                if (i2 <= 0 || this.x != null) {
                    View view = this.x;
                    if (view != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                        int i5 = marginLayoutParams2.height;
                        int i6 = marginLayoutParams.topMargin;
                        if (i5 != i6 || marginLayoutParams2.leftMargin != iK || marginLayoutParams2.rightMargin != iL) {
                            marginLayoutParams2.height = i6;
                            marginLayoutParams2.leftMargin = iK;
                            marginLayoutParams2.rightMargin = iL;
                            this.x.setLayoutParams(marginLayoutParams2);
                        }
                    }
                } else {
                    View view2 = new View(this.e);
                    this.x = view2;
                    view2.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = iK;
                    layoutParams.rightMargin = iL;
                    this.v.addView(this.x, -1, layoutParams);
                }
                View view3 = this.x;
                z3 = view3 != null;
                if (z3 && view3.getVisibility() != 0) {
                    S0(this.x);
                }
                if (!this.C && z3) {
                    iM = 0;
                }
                z = z3;
                z3 = z2;
            } else if (marginLayoutParams.topMargin != 0) {
                marginLayoutParams.topMargin = 0;
                z = false;
            } else {
                z = false;
                z3 = false;
            }
            if (z3) {
                this.p.setLayoutParams(marginLayoutParams);
            }
        }
        View view4 = this.x;
        if (view4 != null) {
            view4.setVisibility(z ? 0 : 8);
        }
        return iM;
    }

    public void S(androidx.appcompat.view.menu.e eVar) {
        if (this.F) {
            return;
        }
        this.F = true;
        this.l.i();
        Window.Callback callbackM0 = m0();
        if (callbackM0 != null && !this.L) {
            callbackM0.onPanelClosed(108, eVar);
        }
        this.F = false;
    }

    public final void S0(View view) {
        view.setBackgroundColor((androidx.core.view.c.M(view) & 8192) != 0 ? ni4.c(this.e, dli.f15662b) : ni4.c(this.e, dli.f15661a));
    }

    public final void T() {
        p pVar = this.R;
        if (pVar != null) {
            pVar.a();
        }
        p pVar2 = this.S;
        if (pVar2 != null) {
            pVar2.a();
        }
    }

    public void U(int i2) {
        V(k0(i2, true), true);
    }

    public void V(PanelFeatureState panelFeatureState, boolean z) {
        ViewGroup viewGroup;
        vs5 vs5Var;
        if (z && panelFeatureState.f1429a == 0 && (vs5Var = this.l) != null && vs5Var.c()) {
            S(panelFeatureState.j);
            return;
        }
        WindowManager windowManager = (WindowManager) this.e.getSystemService("window");
        if (windowManager != null && panelFeatureState.o && (viewGroup = panelFeatureState.g) != null) {
            windowManager.removeView(viewGroup);
            if (z) {
                R(panelFeatureState.f1429a, panelFeatureState, null);
            }
        }
        panelFeatureState.m = false;
        panelFeatureState.n = false;
        panelFeatureState.o = false;
        panelFeatureState.h = null;
        panelFeatureState.q = true;
        if (this.H == panelFeatureState) {
            this.H = null;
        }
    }

    public final Configuration W(Context context, int i2, Configuration configuration, boolean z) {
        int i3;
        if (i2 == 1) {
            i3 = 16;
        } else if (i2 != 2) {
            i3 = z ? 0 : context.getApplicationContext().getResources().getConfiguration().uiMode & 48;
        } else {
            i3 = 32;
        }
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i3 | (configuration2.uiMode & (-49));
        return configuration2;
    }

    public final ViewGroup X() {
        ViewGroup viewGroup;
        TypedArray typedArrayObtainStyledAttributes = this.e.obtainStyledAttributes(z5j.A0);
        if (!typedArrayObtainStyledAttributes.hasValue(z5j.F0)) {
            typedArrayObtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
        if (typedArrayObtainStyledAttributes.getBoolean(z5j.O0, false)) {
            C(1);
        } else if (typedArrayObtainStyledAttributes.getBoolean(z5j.F0, false)) {
            C(108);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(z5j.G0, false)) {
            C(109);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(z5j.H0, false)) {
            C(10);
        }
        this.D = typedArrayObtainStyledAttributes.getBoolean(z5j.B0, false);
        typedArrayObtainStyledAttributes.recycle();
        e0();
        this.f.getDecorView();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.e);
        if (this.E) {
            viewGroup = this.C ? (ViewGroup) layoutInflaterFrom.inflate(mwi.q, (ViewGroup) null) : (ViewGroup) layoutInflaterFrom.inflate(mwi.p, (ViewGroup) null);
        } else if (this.D) {
            viewGroup = (ViewGroup) layoutInflaterFrom.inflate(mwi.h, (ViewGroup) null);
            this.B = false;
            this.A = false;
        } else if (this.A) {
            TypedValue typedValue = new TypedValue();
            this.e.getTheme().resolveAttribute(qii.g, typedValue, true);
            viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new ui4(this.e, typedValue.resourceId) : this.e).inflate(mwi.f27294r, (ViewGroup) null);
            vs5 vs5Var = (vs5) viewGroup.findViewById(cqi.q);
            this.l = vs5Var;
            vs5Var.setWindowCallback(m0());
            if (this.B) {
                this.l.h(109);
            }
            if (this.y) {
                this.l.h(2);
            }
            if (this.z) {
                this.l.h(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.A + ", windowActionBarOverlay: " + this.B + ", android:windowIsFloating: " + this.D + ", windowActionModeOverlay: " + this.C + ", windowNoTitle: " + this.E + " }");
        }
        androidx.core.view.c.H0(viewGroup, new b());
        if (this.l == null) {
            this.w = (TextView) viewGroup.findViewById(cqi.R);
        }
        eyq.c(viewGroup);
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(cqi.f14620b);
        ViewGroup viewGroup2 = (ViewGroup) this.f.findViewById(R.id.content);
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
        this.f.setContentView(viewGroup);
        contentFrameLayout.setAttachListener(new c());
        return viewGroup;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View Y(View view, String str, Context context, AttributeSet attributeSet) {
        boolean z;
        boolean zL0 = false;
        if (this.Z == null) {
            String string = this.e.obtainStyledAttributes(z5j.A0).getString(z5j.E0);
            if (string == null) {
                this.Z = new tf1();
            } else {
                try {
                    this.Z = (tf1) this.e.getClassLoader().loadClass(string).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                } catch (Throwable unused) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Failed to instantiate custom view inflater ");
                    sb.append(string);
                    sb.append(". Falling back to default.");
                    this.Z = new tf1();
                }
            }
        }
        boolean z2 = c0;
        if (z2) {
            if (this.a0 == null) {
                this.a0 = new cae();
            }
            if (this.a0.a(attributeSet)) {
                z = true;
            } else {
                if (!(attributeSet instanceof XmlPullParser)) {
                    zL0 = L0((ViewParent) view);
                } else if (((XmlPullParser) attributeSet).getDepth() > 1) {
                    zL0 = true;
                }
                z = zL0;
            }
        } else {
            z = zL0;
        }
        return this.Z.r(view, str, context, attributeSet, z, z2, true, goq.d());
    }

    public void Z() {
        androidx.appcompat.view.menu.e eVar;
        vs5 vs5Var = this.l;
        if (vs5Var != null) {
            vs5Var.i();
        }
        if (this.q != null) {
            this.f.getDecorView().removeCallbacks(this.f1428r);
            if (this.q.isShowing()) {
                try {
                    this.q.dismiss();
                } catch (IllegalArgumentException unused) {
                }
            }
            this.q = null;
        }
        c0();
        PanelFeatureState panelFeatureStateK0 = k0(0, false);
        if (panelFeatureStateK0 == null || (eVar = panelFeatureStateK0.j) == null) {
            return;
        }
        eVar.close();
    }

    @Override // androidx.appcompat.view.menu.e.a
    public boolean a(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
        PanelFeatureState panelFeatureStateF0;
        Window.Callback callbackM0 = m0();
        if (callbackM0 == null || this.L || (panelFeatureStateF0 = f0(eVar.F())) == null) {
            return false;
        }
        return callbackM0.onMenuItemSelected(panelFeatureStateF0.f1429a, menuItem);
    }

    public boolean a0(KeyEvent keyEvent) {
        View decorView;
        Object obj = this.d;
        if (((obj instanceof yzd.a) || (obj instanceof if1)) && (decorView = this.f.getDecorView()) != null && yzd.d(decorView, keyEvent)) {
            return true;
        }
        if (keyEvent.getKeyCode() == 82 && this.g.b(this.f.getCallback(), keyEvent)) {
            return true;
        }
        int keyCode = keyEvent.getKeyCode();
        return keyEvent.getAction() == 0 ? w0(keyCode, keyEvent) : z0(keyCode, keyEvent);
    }

    @Override // androidx.appcompat.view.menu.e.a
    public void b(androidx.appcompat.view.menu.e eVar) {
        I0(true);
    }

    public void b0(int i2) {
        PanelFeatureState panelFeatureStateK0;
        PanelFeatureState panelFeatureStateK1 = k0(i2, true);
        if (panelFeatureStateK1.j != null) {
            Bundle bundle = new Bundle();
            panelFeatureStateK1.j.T(bundle);
            if (bundle.size() > 0) {
                panelFeatureStateK1.s = bundle;
            }
            panelFeatureStateK1.j.h0();
            panelFeatureStateK1.j.clear();
        }
        panelFeatureStateK1.f1432r = true;
        panelFeatureStateK1.q = true;
        if ((i2 != 108 && i2 != 0) || this.l == null || (panelFeatureStateK0 = k0(0, false)) == null) {
            return;
        }
        panelFeatureStateK0.m = false;
        H0(panelFeatureStateK0, null);
    }

    public void c0() {
        lwq lwqVar = this.s;
        if (lwqVar != null) {
            lwqVar.c();
        }
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public void d(View view, ViewGroup.LayoutParams layoutParams) {
        d0();
        ((ViewGroup) this.v.findViewById(R.id.content)).addView(view, layoutParams);
        this.g.c(this.f.getCallback());
    }

    public final void d0() {
        if (this.u) {
            return;
        }
        this.v = X();
        CharSequence charSequenceL0 = l0();
        if (!TextUtils.isEmpty(charSequenceL0)) {
            vs5 vs5Var = this.l;
            if (vs5Var != null) {
                vs5Var.setWindowTitle(charSequenceL0);
            } else if (F0() != null) {
                F0().setWindowTitle(charSequenceL0);
            } else {
                TextView textView = this.w;
                if (textView != null) {
                    textView.setText(charSequenceL0);
                }
            }
        }
        O();
        D0(this.v);
        this.u = true;
        PanelFeatureState panelFeatureStateK0 = k0(0, false);
        if (this.L) {
            return;
        }
        if (panelFeatureStateK0 == null || panelFeatureStateK0.j == null) {
            r0(108);
        }
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public boolean e() {
        return N(true);
    }

    public final void e0() {
        if (this.f == null) {
            Object obj = this.d;
            if (obj instanceof Activity) {
                P(((Activity) obj).getWindow());
            }
        }
        if (this.f == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    public PanelFeatureState f0(Menu menu) {
        PanelFeatureState[] panelFeatureStateArr = this.G;
        int length = panelFeatureStateArr != null ? panelFeatureStateArr.length : 0;
        for (int i2 = 0; i2 < length; i2++) {
            PanelFeatureState panelFeatureState = panelFeatureStateArr[i2];
            if (panelFeatureState != null && panelFeatureState.j == menu) {
                return panelFeatureState;
            }
        }
        return null;
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public Context h(Context context) {
        this.J = true;
        int iU0 = u0(context, Q());
        if (f0 && (context instanceof ContextThemeWrapper)) {
            try {
                r.a((ContextThemeWrapper) context, W(context, iU0, null, false));
                return context;
            } catch (IllegalStateException unused) {
            }
        }
        if (context instanceof ui4) {
            try {
                ((ui4) context).a(W(context, iU0, null, false));
                return context;
            } catch (IllegalStateException unused2) {
            }
        }
        if (!e0) {
            return super.h(context);
        }
        Configuration configuration = new Configuration();
        configuration.uiMode = -1;
        configuration.fontScale = 0.0f;
        Configuration configuration2 = j.a(context, configuration).getResources().getConfiguration();
        Configuration configuration3 = context.getResources().getConfiguration();
        configuration2.uiMode = configuration3.uiMode;
        Configuration configurationW = W(context, iU0, configuration2.equals(configuration3) ? null : g0(configuration2, configuration3), true);
        ui4 ui4Var = new ui4(context, n3j.d);
        ui4Var.a(configurationW);
        try {
            if (context.getTheme() != null) {
                jrk.f.a(ui4Var.getTheme());
            }
        } catch (NullPointerException unused3) {
        }
        return super.h(ui4Var);
    }

    public final Context h0() {
        ActionBar actionBarP = p();
        Context themedContext = actionBarP != null ? actionBarP.getThemedContext() : null;
        return themedContext == null ? this.e : themedContext;
    }

    public final p i0(Context context) {
        if (this.S == null) {
            this.S = new o(context);
        }
        return this.S;
    }

    public final p j0(Context context) {
        if (this.R == null) {
            this.R = new q(j4q.a(context));
        }
        return this.R;
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public <T extends View> T k(int i2) {
        d0();
        return (T) this.f.findViewById(i2);
    }

    public PanelFeatureState k0(int i2, boolean z) {
        PanelFeatureState[] panelFeatureStateArr = this.G;
        if (panelFeatureStateArr == null || panelFeatureStateArr.length <= i2) {
            PanelFeatureState[] panelFeatureStateArr2 = new PanelFeatureState[i2 + 1];
            if (panelFeatureStateArr != null) {
                System.arraycopy(panelFeatureStateArr, 0, panelFeatureStateArr2, 0, panelFeatureStateArr.length);
            }
            this.G = panelFeatureStateArr2;
            panelFeatureStateArr = panelFeatureStateArr2;
        }
        PanelFeatureState panelFeatureState = panelFeatureStateArr[i2];
        if (panelFeatureState != null) {
            return panelFeatureState;
        }
        PanelFeatureState panelFeatureState2 = new PanelFeatureState(i2);
        panelFeatureStateArr[i2] = panelFeatureState2;
        return panelFeatureState2;
    }

    public final CharSequence l0() {
        Object obj = this.d;
        return obj instanceof Activity ? ((Activity) obj).getTitle() : this.f1427k;
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public final ActionBarDrawerToggle$Delegate m() {
        return new f();
    }

    public final Window.Callback m0() {
        return this.f.getCallback();
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public int n() {
        return this.N;
    }

    public final void n0() {
        d0();
        if (this.A && this.i == null) {
            Object obj = this.d;
            if (obj instanceof Activity) {
                this.i = new androidx.appcompat.app.d((Activity) this.d, this.B);
            } else if (obj instanceof Dialog) {
                this.i = new androidx.appcompat.app.d((Dialog) this.d);
            }
            ActionBar actionBar = this.i;
            if (actionBar != null) {
                actionBar.setDefaultDisplayHomeAsUpEnabled(this.W);
            }
        }
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public MenuInflater o() {
        if (this.j == null) {
            n0();
            ActionBar actionBar = this.i;
            this.j = new wpo(actionBar != null ? actionBar.getThemedContext() : this.e);
        }
        return this.j;
    }

    public final boolean o0(PanelFeatureState panelFeatureState) {
        View view = panelFeatureState.i;
        if (view != null) {
            panelFeatureState.h = view;
            return true;
        }
        if (panelFeatureState.j == null) {
            return false;
        }
        if (this.n == null) {
            this.n = new t();
        }
        View view2 = (View) panelFeatureState.a(this.n);
        panelFeatureState.h = view2;
        return view2 != null;
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return Y(view, str, context, attributeSet);
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public ActionBar p() {
        n0();
        return this.i;
    }

    public final boolean p0(PanelFeatureState panelFeatureState) {
        panelFeatureState.d(h0());
        panelFeatureState.g = new s(panelFeatureState.l);
        panelFeatureState.c = 81;
        return true;
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public void q() {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.e);
        if (layoutInflaterFrom.getFactory() == null) {
            dae.a(layoutInflaterFrom, this);
        } else {
            boolean z = layoutInflaterFrom.getFactory2() instanceof AppCompatDelegateImpl;
        }
    }

    public final boolean q0(PanelFeatureState panelFeatureState) {
        Resources.Theme themeNewTheme;
        Context context = this.e;
        int i2 = panelFeatureState.f1429a;
        if ((i2 == 0 || i2 == 108) && this.l != null) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme theme = context.getTheme();
            theme.resolveAttribute(qii.g, typedValue, true);
            if (typedValue.resourceId != 0) {
                themeNewTheme = context.getResources().newTheme();
                themeNewTheme.setTo(theme);
                themeNewTheme.applyStyle(typedValue.resourceId, true);
                themeNewTheme.resolveAttribute(qii.h, typedValue, true);
            } else {
                theme.resolveAttribute(qii.h, typedValue, true);
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
                ui4 ui4Var = new ui4(context, 0);
                ui4Var.getTheme().setTo(themeNewTheme);
                context = ui4Var;
            }
        }
        androidx.appcompat.view.menu.e eVar = new androidx.appcompat.view.menu.e(context);
        eVar.V(this);
        panelFeatureState.c(eVar);
        return true;
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public void r() {
        if (F0() == null || p().invalidateOptionsMenu()) {
            return;
        }
        r0(0);
    }

    public final void r0(int i2) {
        this.U = (1 << i2) | this.U;
        if (this.T) {
            return;
        }
        androidx.core.view.c.i0(this.f.getDecorView(), this.V);
        this.T = true;
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public void s(Configuration configuration) {
        ActionBar actionBarP;
        if (this.A && this.u && (actionBarP = p()) != null) {
            actionBarP.onConfigurationChanged(configuration);
        }
        jf1.b().g(this.e);
        this.M = new Configuration(this.e.getResources().getConfiguration());
        N(false);
        configuration.updateFrom(this.e.getResources().getConfiguration());
    }

    public final boolean s0(Context context) {
        if (!this.Q && (this.d instanceof Activity)) {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                return false;
            }
            try {
                ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(context, this.d.getClass()), Build.VERSION.SDK_INT >= 29 ? 269221888 : 786432);
                this.P = (activityInfo == null || (activityInfo.configChanges & 512) == 0) ? false : true;
            } catch (PackageManager.NameNotFoundException unused) {
                this.P = false;
            }
        }
        this.Q = true;
        return this.P;
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public void t(Bundle bundle) {
        String strC;
        this.J = true;
        N(false);
        e0();
        Object obj = this.d;
        if (obj instanceof Activity) {
            try {
                strC = lig.c((Activity) obj);
            } catch (IllegalArgumentException unused) {
                strC = null;
            }
            if (strC != null) {
                ActionBar actionBarF0 = F0();
                if (actionBarF0 == null) {
                    this.W = true;
                } else {
                    actionBarF0.setDefaultDisplayHomeAsUpEnabled(true);
                }
            }
            AppCompatDelegate.c(this);
        }
        this.M = new Configuration(this.e.getResources().getConfiguration());
        this.K = true;
    }

    public boolean t0() {
        return this.t;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0045  */
    @Override // androidx.appcompat.app.AppCompatDelegate
    public void u() {
        if (this.d instanceof Activity) {
            AppCompatDelegate.A(this);
        }
        if (this.T) {
            this.f.getDecorView().removeCallbacks(this.V);
        }
        this.L = true;
        if (this.N != -100) {
            Object obj = this.d;
            if ((obj instanceof Activity) && ((Activity) obj).isChangingConfigurations()) {
                b0.put(this.d.getClass().getName(), Integer.valueOf(this.N));
            } else {
                b0.remove(this.d.getClass().getName());
            }
        } else {
            b0.remove(this.d.getClass().getName());
        }
        ActionBar actionBar = this.i;
        if (actionBar != null) {
            actionBar.onDestroy();
        }
        T();
    }

    public int u0(Context context, int i2) {
        if (i2 == -100) {
            return -1;
        }
        if (i2 != -1) {
            if (i2 == 0) {
                if (((UiModeManager) context.getApplicationContext().getSystemService(Mipay.KEY_UI_MODE)).getNightMode() == 0) {
                    return -1;
                }
                return j0(context).c();
            }
            if (i2 != 1 && i2 != 2) {
                if (i2 == 3) {
                    return i0(context).c();
                }
                throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
            }
        }
        return i2;
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public void v(Bundle bundle) {
        d0();
    }

    public boolean v0() {
        ActionMode actionMode = this.o;
        if (actionMode != null) {
            actionMode.c();
            return true;
        }
        ActionBar actionBarP = p();
        return actionBarP != null && actionBarP.collapseActionView();
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public void w() {
        ActionBar actionBarP = p();
        if (actionBarP != null) {
            actionBarP.setShowHideAnimationEnabled(true);
        }
    }

    public boolean w0(int i2, KeyEvent keyEvent) {
        if (i2 == 4) {
            this.I = (keyEvent.getFlags() & 128) != 0;
        } else if (i2 == 82) {
            x0(0, keyEvent);
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public void x(Bundle bundle) {
    }

    public final boolean x0(int i2, KeyEvent keyEvent) {
        if (keyEvent.getRepeatCount() != 0) {
            return false;
        }
        PanelFeatureState panelFeatureStateK0 = k0(i2, true);
        if (panelFeatureStateK0.o) {
            return false;
        }
        return H0(panelFeatureStateK0, keyEvent);
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public void y() {
        e();
    }

    public boolean y0(int i2, KeyEvent keyEvent) {
        ActionBar actionBarP = p();
        if (actionBarP != null && actionBarP.onKeyShortcut(i2, keyEvent)) {
            return true;
        }
        PanelFeatureState panelFeatureState = this.H;
        if (panelFeatureState != null && G0(panelFeatureState, keyEvent.getKeyCode(), keyEvent, 1)) {
            PanelFeatureState panelFeatureState2 = this.H;
            if (panelFeatureState2 != null) {
                panelFeatureState2.n = true;
            }
            return true;
        }
        if (this.H == null) {
            PanelFeatureState panelFeatureStateK0 = k0(0, true);
            H0(panelFeatureStateK0, keyEvent);
            boolean zG0 = G0(panelFeatureStateK0, keyEvent.getKeyCode(), keyEvent, 1);
            panelFeatureStateK0.m = false;
            if (zG0) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public void z() {
        ActionBar actionBarP = p();
        if (actionBarP != null) {
            actionBarP.setShowHideAnimationEnabled(false);
        }
    }

    public boolean z0(int i2, KeyEvent keyEvent) {
        if (i2 == 4) {
            boolean z = this.I;
            this.I = false;
            PanelFeatureState panelFeatureStateK0 = k0(0, false);
            if (panelFeatureStateK0 != null && panelFeatureStateK0.o) {
                if (!z) {
                    V(panelFeatureStateK0, true);
                }
                return true;
            }
            if (v0()) {
                return true;
            }
        } else if (i2 == 82) {
            A0(0, keyEvent);
            return true;
        }
        return false;
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    public AppCompatDelegateImpl(Dialog dialog, df1 df1Var) {
        this(dialog.getContext(), dialog.getWindow(), df1Var, dialog);
    }

    public AppCompatDelegateImpl(Context context, Window window, df1 df1Var, Object obj) {
        SimpleArrayMap<String, Integer> simpleArrayMap;
        Integer num;
        AppCompatActivity appCompatActivityO0;
        this.s = null;
        this.t = true;
        this.N = -100;
        this.V = new a();
        this.e = context;
        this.h = df1Var;
        this.d = obj;
        if (this.N == -100 && (obj instanceof Dialog) && (appCompatActivityO0 = O0()) != null) {
            this.N = appCompatActivityO0.getDelegate().n();
        }
        if (this.N == -100 && (num = (simpleArrayMap = b0).get(obj.getClass().getName())) != null) {
            this.N = num.intValue();
            simpleArrayMap.remove(obj.getClass().getName());
        }
        if (window != null) {
            P(window);
        }
        jf1.h();
    }
}

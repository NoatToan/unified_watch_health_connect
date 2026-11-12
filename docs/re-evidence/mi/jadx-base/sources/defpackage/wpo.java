package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.g;
import com.xiaomi.passport.ui.internal.MenuBuilder;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class wpo extends MenuInflater {
    public static final Class<?>[] e;
    public static final Class<?>[] f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object[] f38227a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object[] f38228b;
    public Context c;
    public Object d;

    public static class a implements MenuItem.OnMenuItemClickListener {
        public static final Class<?>[] c = {MenuItem.class};

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f38229a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Method f38230b;

        public a(Object obj, String str) {
            this.f38229a = obj;
            Class<?> cls = obj.getClass();
            try {
                this.f38230b = cls.getMethod(str, c);
            } catch (Exception e) {
                InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str + " in class " + cls.getName());
                inflateException.initCause(e);
                throw inflateException;
            }
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            try {
                if (this.f38230b.getReturnType() == Boolean.TYPE) {
                    return ((Boolean) this.f38230b.invoke(this.f38229a, menuItem)).booleanValue();
                }
                this.f38230b.invoke(this.f38229a, menuItem);
                return true;
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    public class b {
        public oe0 A;
        public CharSequence B;
        public CharSequence C;
        public ColorStateList D = null;
        public PorterDuff.Mode E = null;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Menu f38231a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f38232b;
        public int c;
        public int d;
        public int e;
        public boolean f;
        public boolean g;
        public boolean h;
        public int i;
        public int j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public CharSequence f38233k;
        public CharSequence l;
        public int m;
        public char n;
        public int o;
        public char p;
        public int q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f38234r;
        public boolean s;
        public boolean t;
        public boolean u;
        public int v;
        public int w;
        public String x;
        public String y;
        public String z;

        public b(Menu menu) {
            this.f38231a = menu;
            h();
        }

        public void a() {
            this.h = true;
            i(this.f38231a.add(this.f38232b, this.i, this.j, this.f38233k));
        }

        public SubMenu b() {
            this.h = true;
            SubMenu subMenuAddSubMenu = this.f38231a.addSubMenu(this.f38232b, this.i, this.j, this.f38233k);
            i(subMenuAddSubMenu.getItem());
            return subMenuAddSubMenu;
        }

        public final char c(String str) {
            if (str == null) {
                return (char) 0;
            }
            return str.charAt(0);
        }

        public boolean d() {
            return this.h;
        }

        public final <T> T e(String str, Class<?>[] clsArr, Object[] objArr) {
            try {
                Constructor<?> constructor = Class.forName(str, false, wpo.this.c.getClassLoader()).getConstructor(clsArr);
                constructor.setAccessible(true);
                return (T) constructor.newInstance(objArr);
            } catch (Exception unused) {
                StringBuilder sb = new StringBuilder();
                sb.append("Cannot instantiate class: ");
                sb.append(str);
                return null;
            }
        }

        public void f(AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = wpo.this.c.obtainStyledAttributes(attributeSet, z5j.y1);
            this.f38232b = typedArrayObtainStyledAttributes.getResourceId(z5j.A1, 0);
            this.c = typedArrayObtainStyledAttributes.getInt(z5j.C1, 0);
            this.d = typedArrayObtainStyledAttributes.getInt(z5j.D1, 0);
            this.e = typedArrayObtainStyledAttributes.getInt(z5j.E1, 0);
            this.f = typedArrayObtainStyledAttributes.getBoolean(z5j.B1, true);
            this.g = typedArrayObtainStyledAttributes.getBoolean(z5j.z1, true);
            typedArrayObtainStyledAttributes.recycle();
        }

        public void g(AttributeSet attributeSet) {
            xfp xfpVarU = xfp.u(wpo.this.c, attributeSet, z5j.F1);
            this.i = xfpVarU.n(z5j.I1, 0);
            this.j = (xfpVarU.k(z5j.L1, this.c) & MenuBuilder.CATEGORY_MASK) | (xfpVarU.k(z5j.M1, this.d) & 65535);
            this.f38233k = xfpVarU.p(z5j.N1);
            this.l = xfpVarU.p(z5j.O1);
            this.m = xfpVarU.n(z5j.G1, 0);
            this.n = c(xfpVarU.o(z5j.P1));
            this.o = xfpVarU.k(z5j.W1, 4096);
            this.p = c(xfpVarU.o(z5j.Q1));
            this.q = xfpVarU.k(z5j.a2, 4096);
            if (xfpVarU.s(z5j.R1)) {
                this.f38234r = xfpVarU.a(z5j.R1, false) ? 1 : 0;
            } else {
                this.f38234r = this.e;
            }
            this.s = xfpVarU.a(z5j.J1, false);
            this.t = xfpVarU.a(z5j.K1, this.f);
            this.u = xfpVarU.a(z5j.H1, this.g);
            this.v = xfpVarU.k(z5j.b2, -1);
            this.z = xfpVarU.o(z5j.S1);
            this.w = xfpVarU.n(z5j.T1, 0);
            this.x = xfpVarU.o(z5j.V1);
            String strO = xfpVarU.o(z5j.U1);
            this.y = strO;
            if (strO != null && this.w == 0 && this.x == null) {
                this.A = (oe0) e(strO, wpo.f, wpo.this.f38228b);
            } else {
                this.A = null;
            }
            this.B = xfpVarU.p(z5j.X1);
            this.C = xfpVarU.p(z5j.c2);
            if (xfpVarU.s(z5j.Z1)) {
                this.E = x47.e(xfpVarU.k(z5j.Z1, -1), this.E);
            } else {
                this.E = null;
            }
            if (xfpVarU.s(z5j.Y1)) {
                this.D = xfpVarU.c(z5j.Y1);
            } else {
                this.D = null;
            }
            xfpVarU.w();
            this.h = false;
        }

        public void h() {
            this.f38232b = 0;
            this.c = 0;
            this.d = 0;
            this.e = 0;
            this.f = true;
            this.g = true;
        }

        public final void i(MenuItem menuItem) {
            boolean z = false;
            menuItem.setChecked(this.s).setVisible(this.t).setEnabled(this.u).setCheckable(this.f38234r >= 1).setTitleCondensed(this.l).setIcon(this.m);
            int i = this.v;
            if (i >= 0) {
                menuItem.setShowAsAction(i);
            }
            if (this.z != null) {
                if (wpo.this.c.isRestricted()) {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
                menuItem.setOnMenuItemClickListener(new a(wpo.this.b(), this.z));
            }
            if (this.f38234r >= 2) {
                if (menuItem instanceof g) {
                    ((g) menuItem).t(true);
                } else if (menuItem instanceof nqf) {
                    ((nqf) menuItem).h(true);
                }
            }
            String str = this.x;
            if (str != null) {
                menuItem.setActionView((View) e(str, wpo.e, wpo.this.f38227a));
                z = true;
            }
            int i2 = this.w;
            if (i2 > 0 && !z) {
                menuItem.setActionView(i2);
            }
            oe0 oe0Var = this.A;
            if (oe0Var != null) {
                lqf.a(menuItem, oe0Var);
            }
            lqf.c(menuItem, this.B);
            lqf.g(menuItem, this.C);
            lqf.b(menuItem, this.n, this.o);
            lqf.f(menuItem, this.p, this.q);
            PorterDuff.Mode mode = this.E;
            if (mode != null) {
                lqf.e(menuItem, mode);
            }
            ColorStateList colorStateList = this.D;
            if (colorStateList != null) {
                lqf.d(menuItem, colorStateList);
            }
        }
    }

    static {
        Class<?>[] clsArr = {Context.class};
        e = clsArr;
        f = clsArr;
    }

    public wpo(Context context) {
        super(context);
        this.c = context;
        Object[] objArr = {context};
        this.f38227a = objArr;
        this.f38228b = objArr;
    }

    public final Object a(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    public Object b() {
        if (this.d == null) {
            this.d = a(this.c);
        }
        return this.d;
    }

    public final void c(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) throws XmlPullParserException, IOException {
        b bVar = new b(menu);
        int eventType = xmlPullParser.getEventType();
        do {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if (name.equals("menu")) {
                    eventType = xmlPullParser.next();
                    break;
                }
                throw new RuntimeException("Expecting menu, got " + name);
            }
            eventType = xmlPullParser.next();
        } while (eventType != 1);
        boolean z = false;
        boolean z2 = false;
        String str = null;
        while (!z) {
            if (eventType == 1) {
                throw new RuntimeException("Unexpected end of document");
            }
            if (eventType != 2) {
                if (eventType == 3) {
                    String name2 = xmlPullParser.getName();
                    if (z2 && name2.equals(str)) {
                        z2 = false;
                        str = null;
                    } else if (name2.equals("group")) {
                        bVar.h();
                    } else if (name2.equals("item")) {
                        if (!bVar.d()) {
                            oe0 oe0Var = bVar.A;
                            if (oe0Var == null || !oe0Var.a()) {
                                bVar.a();
                            } else {
                                bVar.b();
                            }
                        }
                    } else if (name2.equals("menu")) {
                        z = true;
                    }
                }
            } else if (!z2) {
                String name3 = xmlPullParser.getName();
                if (name3.equals("group")) {
                    bVar.f(attributeSet);
                } else if (name3.equals("item")) {
                    bVar.g(attributeSet);
                } else if (name3.equals("menu")) {
                    c(xmlPullParser, attributeSet, bVar.b());
                } else {
                    str = name3;
                    z2 = true;
                }
            }
            eventType = xmlPullParser.next();
        }
    }

    @Override // android.view.MenuInflater
    public void inflate(int i, Menu menu) {
        if (!(menu instanceof vpo)) {
            super.inflate(i, menu);
            return;
        }
        XmlResourceParser layout = null;
        try {
            try {
                try {
                    layout = this.c.getResources().getLayout(i);
                    c(layout, Xml.asAttributeSet(layout), menu);
                    if (layout != null) {
                        layout.close();
                    }
                } catch (IOException e2) {
                    throw new InflateException("Error inflating menu XML", e2);
                }
            } catch (XmlPullParserException e3) {
                throw new InflateException("Error inflating menu XML", e3);
            }
        } catch (Throwable th) {
            if (layout != null) {
                layout.close();
            }
            throw th;
        }
    }
}

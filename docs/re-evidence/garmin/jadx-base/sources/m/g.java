package m;

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
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.widget.c0;
import androidx.appcompat.widget.w0;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public class g extends MenuInflater {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Class<?>[] f115442e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Class<?>[] f115443f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object[] f115444a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object[] f115445b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f115446c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f115447d;

    public static class a implements MenuItem.OnMenuItemClickListener {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final Class<?>[] f115448c = {MenuItem.class};

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f115449a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Method f115450b;

        public a(Object obj, String str) {
            this.f115449a = obj;
            Class<?> cls = obj.getClass();
            try {
                this.f115450b = cls.getMethod(str, f115448c);
            } catch (Exception e4) {
                StringBuilder sbL = hb.a.l("Couldn't resolve menu item onClick handler ", str, " in class ");
                sbL.append(cls.getName());
                InflateException inflateException = new InflateException(sbL.toString());
                inflateException.initCause(e4);
                throw inflateException;
            }
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public final boolean onMenuItemClick(MenuItem menuItem) {
            Method method = this.f115450b;
            try {
                Class<?> returnType = method.getReturnType();
                Class<?> cls = Boolean.TYPE;
                Object obj = this.f115449a;
                if (returnType == cls) {
                    return ((Boolean) method.invoke(obj, menuItem)).booleanValue();
                }
                method.invoke(obj, menuItem);
                return true;
            } catch (Exception e4) {
                o2.c.p(e4);
                return false;
            }
        }
    }

    public class b {
        public CharSequence A;
        public CharSequence B;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Menu f115451a;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f115458h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f115459i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f115460j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public CharSequence f115461k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public CharSequence f115462l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f115463m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public char f115464n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public int f115465o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public char f115466p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public int f115467q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f115468r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public boolean f115469s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public boolean f115470t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public boolean f115471u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f115472v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f115473w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public String f115474x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public String f115475y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public androidx.core.view.b f115476z;
        public ColorStateList C = null;
        public PorterDuff.Mode D = null;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f115452b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f115453c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f115454d = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f115455e = 0;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f115456f = true;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f115457g = true;

        public b(Menu menu) {
            this.f115451a = menu;
        }

        public final <T> T a(String str, Class<?>[] clsArr, Object[] objArr) {
            try {
                Constructor<?> constructor = Class.forName(str, false, g.this.f115446c.getClassLoader()).getConstructor(clsArr);
                constructor.setAccessible(true);
                return (T) constructor.newInstance(objArr);
            } catch (Exception unused) {
                return null;
            }
        }

        public final void b(MenuItem menuItem) {
            boolean z14 = false;
            menuItem.setChecked(this.f115469s).setVisible(this.f115470t).setEnabled(this.f115471u).setCheckable(this.f115468r >= 1).setTitleCondensed(this.f115462l).setIcon(this.f115463m);
            int i14 = this.f115472v;
            if (i14 >= 0) {
                menuItem.setShowAsAction(i14);
            }
            String str = this.f115475y;
            g gVar = g.this;
            if (str != null) {
                if (gVar.f115446c.isRestricted()) {
                    vb.h.z("The android:onClick attribute cannot be used within a restricted context");
                    return;
                } else {
                    if (gVar.f115447d == null) {
                        gVar.f115447d = g.a(gVar.f115446c);
                    }
                    menuItem.setOnMenuItemClickListener(new a(gVar.f115447d, this.f115475y));
                }
            }
            if (this.f115468r >= 2) {
                if (menuItem instanceof j) {
                    ((j) menuItem).f(true);
                } else if (menuItem instanceof k) {
                    k kVar = (k) menuItem;
                    e7.b bVar = kVar.f4800d;
                    try {
                        if (kVar.f4801e == null) {
                            kVar.f4801e = bVar.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
                        }
                        kVar.f4801e.invoke(bVar, Boolean.TRUE);
                    } catch (Exception unused) {
                    }
                }
            }
            String str2 = this.f115474x;
            if (str2 != null) {
                menuItem.setActionView((View) a(str2, g.f115442e, gVar.f115444a));
                z14 = true;
            }
            int i15 = this.f115473w;
            if (i15 > 0 && !z14) {
                menuItem.setActionView(i15);
            }
            androidx.core.view.b bVar2 = this.f115476z;
            if (bVar2 != null && (menuItem instanceof e7.b)) {
                ((e7.b) menuItem).b(bVar2);
            }
            CharSequence charSequence = this.A;
            boolean z15 = menuItem instanceof e7.b;
            if (z15) {
                ((e7.b) menuItem).setContentDescription(charSequence);
            } else {
                menuItem.setContentDescription(charSequence);
            }
            CharSequence charSequence2 = this.B;
            if (z15) {
                ((e7.b) menuItem).setTooltipText(charSequence2);
            } else {
                menuItem.setTooltipText(charSequence2);
            }
            char c14 = this.f115464n;
            int i16 = this.f115465o;
            if (z15) {
                ((e7.b) menuItem).setAlphabeticShortcut(c14, i16);
            } else {
                menuItem.setAlphabeticShortcut(c14, i16);
            }
            char c15 = this.f115466p;
            int i17 = this.f115467q;
            if (z15) {
                ((e7.b) menuItem).setNumericShortcut(c15, i17);
            } else {
                menuItem.setNumericShortcut(c15, i17);
            }
            PorterDuff.Mode mode = this.D;
            if (mode != null) {
                if (z15) {
                    ((e7.b) menuItem).setIconTintMode(mode);
                } else {
                    menuItem.setIconTintMode(mode);
                }
            }
            ColorStateList colorStateList = this.C;
            if (colorStateList != null) {
                if (z15) {
                    ((e7.b) menuItem).setIconTintList(colorStateList);
                } else {
                    menuItem.setIconTintList(colorStateList);
                }
            }
        }
    }

    static {
        Class<?>[] clsArr = {Context.class};
        f115442e = clsArr;
        f115443f = clsArr;
    }

    public g(Context context) {
        super(context);
        this.f115446c = context;
        Object[] objArr = {context};
        this.f115444a = objArr;
        this.f115445b = objArr;
    }

    public static Object a(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0, types: [m.g] */
    /* JADX WARN: Type inference failed for: r3v13, types: [android.content.res.TypedArray] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v55 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    public final void b(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) throws XmlPullParserException, IOException {
        int i14;
        ?? r14;
        XmlPullParser xmlPullParser2;
        ?? r15;
        ColorStateList colorStateList;
        boolean z14;
        ?? r16;
        b bVar = new b(menu);
        int eventType = xmlPullParser.getEventType();
        do {
            i14 = 2;
            r14 = 1;
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if (name.equals("menu")) {
                    eventType = xmlPullParser.next();
                    break;
                } else {
                    kg.f.n("Expecting menu, got ".concat(name));
                    return;
                }
            }
            eventType = xmlPullParser.next();
        } while (eventType != 1);
        boolean z15 = false;
        boolean z16 = false;
        String str = null;
        while (!z15) {
            if (eventType == r14) {
                kg.f.n("Unexpected end of document");
                return;
            }
            if (eventType != i14) {
                if (eventType == 3) {
                    String name2 = xmlPullParser.getName();
                    if (z16 && name2.equals(str)) {
                        r15 = r14;
                        z16 = false;
                        str = null;
                        z15 = z15;
                    } else if (name2.equals("group")) {
                        bVar.f115452b = 0;
                        bVar.f115453c = 0;
                        bVar.f115454d = 0;
                        bVar.f115455e = 0;
                        bVar.f115456f = r14;
                        bVar.f115457g = r14;
                    } else if (!name2.equals("item")) {
                        if (name2.equals("menu")) {
                            ?? r17 = r14;
                            z14 = r17 == true ? 1 : 0;
                            r16 = r17;
                        }
                        r15 = r16;
                        z15 = z14;
                        z16 = z16;
                    } else if (!bVar.f115458h) {
                        androidx.core.view.b bVar2 = bVar.f115476z;
                        if (bVar2 == null || !bVar2.a()) {
                            bVar.f115458h = r14;
                            bVar.b(bVar.f115451a.add(bVar.f115452b, bVar.f115459i, bVar.f115460j, bVar.f115461k));
                        } else {
                            bVar.f115458h = r14;
                            bVar.b(bVar.f115451a.addSubMenu(bVar.f115452b, bVar.f115459i, bVar.f115460j, bVar.f115461k).getItem());
                        }
                    }
                }
                xmlPullParser2 = xmlPullParser;
                eventType = xmlPullParser2.next();
                r14 = r15;
                i14 = 2;
                z15 = z15;
                z16 = z16;
            } else if (!z16) {
                String name3 = xmlPullParser.getName();
                boolean zEquals = name3.equals("group");
                g gVar = g.this;
                if (zEquals) {
                    ?? ObtainStyledAttributes = gVar.f115446c.obtainStyledAttributes(attributeSet, h.a.f80437q);
                    bVar.f115452b = ObtainStyledAttributes.getResourceId(r14, 0);
                    bVar.f115453c = ObtainStyledAttributes.getInt(3, 0);
                    bVar.f115454d = ObtainStyledAttributes.getInt(4, 0);
                    bVar.f115455e = ObtainStyledAttributes.getInt(5, 0);
                    bVar.f115456f = ObtainStyledAttributes.getBoolean(2, r14);
                    bVar.f115457g = ObtainStyledAttributes.getBoolean(0, r14);
                    ObtainStyledAttributes.recycle();
                } else if (name3.equals("item")) {
                    w0 w0VarF = w0.f(gVar.f115446c, attributeSet, h.a.f80438r);
                    TypedArray typedArray = w0VarF.f5271b;
                    bVar.f115459i = typedArray.getResourceId(2, 0);
                    bVar.f115460j = (typedArray.getInt(5, bVar.f115453c) & (-65536)) | (typedArray.getInt(6, bVar.f115454d) & 65535);
                    bVar.f115461k = typedArray.getText(7);
                    bVar.f115462l = typedArray.getText(8);
                    bVar.f115463m = typedArray.getResourceId(0, 0);
                    String string = typedArray.getString(9);
                    bVar.f115464n = string == null ? (char) 0 : string.charAt(0);
                    bVar.f115465o = typedArray.getInt(16, 4096);
                    String string2 = typedArray.getString(10);
                    bVar.f115466p = string2 == null ? (char) 0 : string2.charAt(0);
                    bVar.f115467q = typedArray.getInt(20, 4096);
                    if (typedArray.hasValue(11)) {
                        bVar.f115468r = typedArray.getBoolean(11, false) ? 1 : 0;
                    } else {
                        bVar.f115468r = bVar.f115455e;
                    }
                    bVar.f115469s = typedArray.getBoolean(3, false);
                    bVar.f115470t = typedArray.getBoolean(4, bVar.f115456f);
                    bVar.f115471u = typedArray.getBoolean(1, bVar.f115457g);
                    bVar.f115472v = typedArray.getInt(21, -1);
                    bVar.f115475y = typedArray.getString(12);
                    bVar.f115473w = typedArray.getResourceId(13, 0);
                    bVar.f115474x = typedArray.getString(15);
                    String string3 = typedArray.getString(14);
                    if (string3 != null && bVar.f115473w == 0 && bVar.f115474x == null) {
                        bVar.f115476z = (androidx.core.view.b) bVar.a(string3, f115443f, gVar.f115445b);
                    } else {
                        bVar.f115476z = null;
                    }
                    bVar.A = typedArray.getText(17);
                    bVar.B = typedArray.getText(22);
                    if (typedArray.hasValue(19)) {
                        bVar.D = c0.c(typedArray.getInt(19, -1), bVar.D);
                        colorStateList = null;
                    } else {
                        colorStateList = null;
                        bVar.D = null;
                    }
                    if (typedArray.hasValue(18)) {
                        bVar.C = w0VarF.a(18);
                    } else {
                        bVar.C = colorStateList;
                    }
                    w0VarF.h();
                    bVar.f115458h = false;
                    xmlPullParser2 = xmlPullParser;
                    r15 = 1;
                } else if (name3.equals("menu")) {
                    r15 = 1;
                    bVar.f115458h = true;
                    SubMenu subMenuAddSubMenu = bVar.f115451a.addSubMenu(bVar.f115452b, bVar.f115459i, bVar.f115460j, bVar.f115461k);
                    bVar.b(subMenuAddSubMenu.getItem());
                    xmlPullParser2 = xmlPullParser;
                    b(xmlPullParser2, attributeSet, subMenuAddSubMenu);
                } else {
                    xmlPullParser2 = xmlPullParser;
                    r15 = 1;
                    str = name3;
                    z16 = true;
                }
                eventType = xmlPullParser2.next();
                r14 = r15;
                i14 = 2;
                z15 = z15;
                z16 = z16;
            }
            r16 = r14;
            z14 = z15;
            r15 = r16;
            z15 = z14;
            z16 = z16;
            xmlPullParser2 = xmlPullParser;
            eventType = xmlPullParser2.next();
            r14 = r15;
            i14 = 2;
            z15 = z15;
            z16 = z16;
        }
    }

    @Override // android.view.MenuInflater
    public final void inflate(int i14, Menu menu) {
        if (!(menu instanceof e7.a)) {
            super.inflate(i14, menu);
            return;
        }
        XmlResourceParser layout = null;
        boolean z14 = false;
        try {
            try {
                layout = this.f115446c.getResources().getLayout(i14);
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(layout);
                if (menu instanceof androidx.appcompat.view.menu.h) {
                    androidx.appcompat.view.menu.h hVar = (androidx.appcompat.view.menu.h) menu;
                    if (hVar.isDispatchingItemsChanged()) {
                        hVar.stopDispatchingItemsChanged();
                        z14 = true;
                    }
                }
                b(layout, attributeSetAsAttributeSet, menu);
                if (z14) {
                    ((androidx.appcompat.view.menu.h) menu).startDispatchingItemsChanged();
                }
                layout.close();
            } catch (IOException e4) {
                throw new InflateException("Error inflating menu XML", e4);
            } catch (XmlPullParserException e14) {
                throw new InflateException("Error inflating menu XML", e14);
            }
        } catch (Throwable th3) {
            if (z14) {
                ((androidx.appcompat.view.menu.h) menu).startDispatchingItemsChanged();
            }
            if (layout != null) {
                layout.close();
            }
            throw th3;
        }
    }
}

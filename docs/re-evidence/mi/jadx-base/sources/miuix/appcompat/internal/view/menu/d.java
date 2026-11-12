package miuix.appcompat.internal.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import com.android.internal.view.menu.MenuBuilder;
import defpackage.sii;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes3.dex */
public class d extends MenuBuilder {
    public static final int[] y = {1, 4, 5, 3, 2, 0};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f26537a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Resources f26538b;
    public boolean c;
    public boolean d;
    public b e;
    public ContextMenu.ContextMenuInfo m;
    public CharSequence n;
    public Drawable o;
    public View p;
    public f w;
    public int l = 0;
    public boolean q = false;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f26540r = false;
    public boolean s = false;
    public boolean t = false;
    public ArrayList<f> u = new ArrayList<>();
    public CopyOnWriteArrayList<WeakReference<h>> v = new CopyOnWriteArrayList<>();
    public final Comparator<f> x = new a();
    public ArrayList<f> f = new ArrayList<>();
    public ArrayList<f> g = new ArrayList<>();
    public boolean h = true;
    public ArrayList<f> i = new ArrayList<>();
    public ArrayList<f> j = new ArrayList<>();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f26539k = true;

    public class a implements Comparator<f> {
        public a() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(f fVar, f fVar2) {
            if (fVar.p() != fVar2.p()) {
                return fVar.p() ? -1 : 1;
            }
            if (fVar.o() != fVar2.o()) {
                return fVar.o() ? -1 : 1;
            }
            return fVar.getOrder() - fVar2.getOrder();
        }
    }

    public interface b {
        boolean d(d dVar, MenuItem menuItem);
    }

    public interface c {
        boolean a(f fVar, int i);
    }

    public d(Context context) {
        this.f26537a = context;
        this.f26538b = context.getResources();
        Y(true);
    }

    public static int m(ArrayList<f> arrayList, int i) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size).d() <= i) {
                return size + 1;
            }
        }
        return 0;
    }

    public static int z(int i) {
        int i2 = ((-65536) & i) >> 16;
        if (i2 >= 0) {
            int[] iArr = y;
            if (i2 < iArr.length) {
                return (i & 65535) | (iArr[i2] << 16);
            }
        }
        throw new IllegalArgumentException("order does not contain a valid category.");
    }

    public Resources A() {
        return this.f26538b;
    }

    public d B() {
        return this;
    }

    public ArrayList<f> C() {
        if (!this.h) {
            return this.g;
        }
        this.g.clear();
        for (f fVar : this.f) {
            if (fVar.isVisible()) {
                this.g.add(fVar);
            }
        }
        Collections.sort(this.g, this.x);
        this.h = false;
        this.f26539k = true;
        return this.g;
    }

    public boolean D() {
        return this.c;
    }

    public boolean E() {
        return this.d;
    }

    public void F(f fVar) {
        this.f26539k = true;
        H(true);
    }

    public void G(f fVar) {
        this.h = true;
        H(true);
    }

    public void H(boolean z) {
        if (this.q) {
            this.f26540r = true;
            return;
        }
        if (z) {
            this.h = true;
            this.f26539k = true;
        }
        h(z);
    }

    public boolean I(MenuItem menuItem, int i) {
        return J(menuItem, null, i);
    }

    public boolean J(MenuItem menuItem, h hVar, int i) {
        f fVar = (f) menuItem;
        if (fVar == null || !fVar.isEnabled()) {
            return false;
        }
        boolean zL = fVar.l();
        ActionProvider actionProviderG = fVar.g();
        boolean z = actionProviderG != null && actionProviderG.hasSubMenu();
        if (fVar.k()) {
            zL |= fVar.expandActionView();
            if (zL) {
                e(true);
            }
        } else if (fVar.hasSubMenu() || z) {
            if ((i & 4) == 0) {
                e(false);
            }
            if (!fVar.hasSubMenu()) {
                fVar.y(new j(s(), this, fVar));
            }
            j jVar = (j) fVar.getSubMenu();
            if (z) {
                actionProviderG.onPrepareSubMenu(jVar);
            }
            zL |= i(jVar, hVar);
            if (!zL) {
                e(true);
            }
        } else if ((i & 1) == 0) {
            e(true);
        }
        return zL;
    }

    public void K(int i) {
        L(i, true);
    }

    public final void L(int i, boolean z) {
        if (i < 0 || i >= this.f.size()) {
            return;
        }
        this.f.remove(i);
        if (z) {
            H(true);
        }
    }

    public void M(h hVar) {
        for (WeakReference<h> weakReference : this.v) {
            h hVar2 = weakReference.get();
            if (hVar2 == null || hVar2 == hVar) {
                this.v.remove(weakReference);
            }
        }
    }

    public void N(b bVar) {
        this.e = bVar;
    }

    public d O(int i) {
        this.l = i;
        return this;
    }

    public void P(MenuItem menuItem) {
        int groupId = menuItem.getGroupId();
        Iterator<f> it = this.f.iterator();
        while (it.hasNext()) {
            f next = it.next();
            if (next.getGroupId() == groupId && next.n() && next.isCheckable()) {
                next.t(next == menuItem);
            }
        }
    }

    public void Q(boolean z) {
        this.s = z;
    }

    public d R(int i) {
        T(0, null, i, null, null);
        return this;
    }

    public d S(Drawable drawable) {
        T(0, null, 0, drawable, null);
        return this;
    }

    public final void T(int i, CharSequence charSequence, int i2, Drawable drawable, View view) {
        Resources resourcesA = A();
        if (view != null) {
            this.p = view;
            this.n = null;
            this.o = null;
        } else {
            if (i > 0) {
                this.n = resourcesA.getText(i);
            } else if (charSequence != null) {
                this.n = charSequence;
            }
            if (i2 > 0) {
                this.o = resourcesA.getDrawable(i2);
            } else if (drawable != null) {
                this.o = drawable;
            }
            this.p = null;
        }
        H(false);
    }

    public d U(int i) {
        T(i, null, 0, null, null);
        return this;
    }

    public d V(CharSequence charSequence) {
        T(0, charSequence, 0, null, null);
        return this;
    }

    public d W(View view) {
        T(0, null, 0, null, view);
        return this;
    }

    public void X(boolean z) {
        this.q = z;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    public final void Y(boolean z) {
        boolean z2;
        if (z) {
            z2 = this.f26538b.getConfiguration().keyboard != 1 && this.f26538b.getBoolean(sii.f33680b);
        }
        this.d = z2;
    }

    public void Z() {
        this.q = false;
        if (this.f26540r) {
            this.f26540r = false;
            H(true);
        }
    }

    public MenuItem a(f fVar) {
        int iZ = z(fVar.getOrder());
        ContextMenu.ContextMenuInfo contextMenuInfo = this.m;
        if (contextMenuInfo != null) {
            fVar.x(contextMenuInfo);
        }
        ArrayList<f> arrayList = this.f;
        arrayList.add(m(arrayList, iZ), fVar);
        H(true);
        return fVar;
    }

    public void a0() {
        if (this.q) {
            return;
        }
        this.q = true;
        this.f26540r = false;
    }

    public MenuItem add(CharSequence charSequence) {
        return b(0, 0, 0, charSequence);
    }

    public int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        int i5;
        PackageManager packageManager = this.f26537a.getPackageManager();
        List<ResolveInfo> listQueryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = listQueryIntentActivityOptions != null ? listQueryIntentActivityOptions.size() : 0;
        if ((i4 & 1) == 0) {
            removeGroup(i);
        }
        for (int i6 = 0; i6 < size; i6++) {
            ResolveInfo resolveInfo = listQueryIntentActivityOptions.get(i6);
            int i7 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i7 < 0 ? intent : intentArr[i7]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            MenuItem intent3 = add(i, i2, i3, resolveInfo.loadLabel(packageManager)).setIcon(resolveInfo.loadIcon(packageManager)).setIntent(intent2);
            if (menuItemArr != null && (i5 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i5] = intent3;
            }
        }
        return size;
    }

    public SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public MenuItem b(int i, int i2, int i3, CharSequence charSequence) {
        int iZ = z(i3);
        f fVar = new f(this, i, i2, i3, iZ, charSequence, this.l);
        ContextMenu.ContextMenuInfo contextMenuInfo = this.m;
        if (contextMenuInfo != null) {
            fVar.x(contextMenuInfo);
        }
        ArrayList<f> arrayList = this.f;
        arrayList.add(m(arrayList, iZ), fVar);
        H(true);
        return fVar;
    }

    public void b0() {
        H(true);
    }

    public void c(h hVar) {
        this.v.add(new WeakReference<>(hVar));
        hVar.c(this.f26537a, this);
        this.f26539k = true;
    }

    public void clear() {
        f fVar = this.w;
        if (fVar != null) {
            f(fVar);
        }
        this.f.clear();
        H(true);
    }

    public void clearHeader() {
        this.o = null;
        this.n = null;
        this.p = null;
        H(false);
    }

    public void close() {
        e(true);
    }

    public void d() {
        this.q = true;
        clear();
        clearHeader();
        this.q = false;
        this.f26540r = false;
        H(true);
    }

    public final void e(boolean z) {
        if (this.t) {
            return;
        }
        this.t = true;
        for (WeakReference<h> weakReference : this.v) {
            h hVar = weakReference.get();
            if (hVar == null) {
                this.v.remove(weakReference);
            } else {
                hVar.b(this, z);
            }
        }
        this.t = false;
    }

    public boolean f(f fVar) {
        boolean zD = false;
        if (!this.v.isEmpty() && this.w == fVar) {
            a0();
            for (WeakReference<h> weakReference : this.v) {
                h hVar = weakReference.get();
                if (hVar != null) {
                    zD = hVar.d(this, fVar);
                    if (zD) {
                        break;
                    }
                } else {
                    this.v.remove(weakReference);
                }
            }
            Z();
            if (zD) {
                this.w = null;
            }
        }
        return zD;
    }

    public MenuItem findItem(int i) {
        MenuItem menuItemFindItem;
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            f fVar = this.f.get(i2);
            if (fVar.getItemId() == i) {
                return fVar;
            }
            if (fVar.hasSubMenu() && (menuItemFindItem = fVar.getSubMenu().findItem(i)) != null) {
                return menuItemFindItem;
            }
        }
        return null;
    }

    public boolean g(d dVar, MenuItem menuItem) {
        b bVar = this.e;
        return bVar != null && bVar.d(dVar, menuItem);
    }

    public MenuItem getItem(int i) {
        return this.f.get(i);
    }

    public final void h(boolean z) {
        if (this.v.isEmpty()) {
            return;
        }
        a0();
        for (WeakReference<h> weakReference : this.v) {
            h hVar = weakReference.get();
            if (hVar == null) {
                this.v.remove(weakReference);
            } else {
                hVar.updateMenuView(z);
            }
        }
        Z();
    }

    public boolean hasVisibleItems() {
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.f.get(i).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public final boolean i(j jVar, h hVar) {
        if (this.v.isEmpty()) {
            return false;
        }
        boolean zH = hVar != null ? hVar.h(jVar) : false;
        for (WeakReference<h> weakReference : this.v) {
            h hVar2 = weakReference.get();
            if (hVar2 == null) {
                this.v.remove(weakReference);
            } else if (!zH) {
                zH = hVar2.h(jVar);
            }
        }
        return zH;
    }

    public boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return o(i, keyEvent) != null;
    }

    public boolean j(f fVar) {
        boolean zF = false;
        if (this.v.isEmpty()) {
            return false;
        }
        a0();
        for (WeakReference<h> weakReference : this.v) {
            h hVar = weakReference.get();
            if (hVar != null) {
                zF = hVar.f(this, fVar);
                if (zF) {
                    break;
                }
            } else {
                this.v.remove(weakReference);
            }
        }
        Z();
        if (zF) {
            this.w = fVar;
        }
        return zF;
    }

    public int k(int i) {
        return l(i, 0);
    }

    public int l(int i, int i2) {
        int size = size();
        if (i2 < 0) {
            i2 = 0;
        }
        while (i2 < size) {
            if (this.f.get(i2).getGroupId() == i) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    public int n(int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            if (this.f.get(i2).getItemId() == i) {
                return i2;
            }
        }
        return -1;
    }

    public f o(int i, KeyEvent keyEvent) {
        ArrayList<f> arrayList = this.u;
        arrayList.clear();
        p(arrayList, i, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        if (arrayList.size() == 1) {
            return arrayList.get(0);
        }
        boolean zD = D();
        for (f fVar : arrayList) {
            char alphabeticShortcut = zD ? fVar.getAlphabeticShortcut() : fVar.getNumericShortcut();
            char[] cArr = keyData.meta;
            if ((alphabeticShortcut == cArr[0] && (metaState & 2) == 0) || ((alphabeticShortcut == cArr[2] && (metaState & 2) != 0) || (zD && alphabeticShortcut == '\b' && i == 67))) {
                return fVar;
            }
        }
        return null;
    }

    public void p(List<f> list, int i, KeyEvent keyEvent) {
        boolean zD = D();
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i == 67) {
            for (f fVar : this.f) {
                if (fVar.hasSubMenu()) {
                    ((d) fVar.getSubMenu()).p(list, i, keyEvent);
                }
                char alphabeticShortcut = zD ? fVar.getAlphabeticShortcut() : fVar.getNumericShortcut();
                if ((metaState & 5) == 0 && alphabeticShortcut != 0) {
                    char[] cArr = keyData.meta;
                    if (alphabeticShortcut == cArr[0] || alphabeticShortcut == cArr[2] || (zD && alphabeticShortcut == '\b' && i == 67)) {
                        if (fVar.isEnabled()) {
                            list.add(fVar);
                        }
                    }
                }
            }
        }
    }

    public boolean performIdentifierAction(int i, int i2) {
        return I(findItem(i), i2);
    }

    public boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        f fVarO = o(i, keyEvent);
        boolean zI = fVarO != null ? I(fVarO, i2) : false;
        if ((i2 & 2) != 0) {
            e(true);
        }
        return zI;
    }

    public void q() {
        if (this.f26539k) {
            boolean zFlagActionItems = false;
            for (WeakReference<h> weakReference : this.v) {
                h hVar = weakReference.get();
                if (hVar == null) {
                    this.v.remove(weakReference);
                } else {
                    zFlagActionItems |= hVar.flagActionItems();
                }
            }
            this.i.clear();
            this.j.clear();
            if (zFlagActionItems) {
                for (f fVar : C()) {
                    if (fVar.m()) {
                        this.i.add(fVar);
                    } else {
                        this.j.add(fVar);
                    }
                }
            } else {
                this.j.addAll(C());
            }
            this.f26539k = false;
        }
    }

    public b r() {
        return this.e;
    }

    public void removeGroup(int i) {
        int iK = k(i);
        if (iK >= 0) {
            int size = this.f.size() - iK;
            int i2 = 0;
            while (true) {
                int i3 = i2 + 1;
                if (i2 >= size || this.f.get(iK).getGroupId() != i) {
                    break;
                }
                L(iK, false);
                i2 = i3;
            }
            H(true);
        }
    }

    public void removeItem(int i) {
        L(n(i), true);
    }

    public Context s() {
        return this.f26537a;
    }

    public void setGroupCheckable(int i, boolean z, boolean z2) {
        for (f fVar : this.f) {
            if (fVar.getGroupId() == i) {
                fVar.u(z2);
                fVar.setCheckable(z);
            }
        }
    }

    public void setGroupEnabled(int i, boolean z) {
        for (f fVar : this.f) {
            if (fVar.getGroupId() == i) {
                fVar.setEnabled(z);
            }
        }
    }

    public void setGroupVisible(int i, boolean z) {
        boolean z2 = false;
        for (f fVar : this.f) {
            if (fVar.getGroupId() == i && fVar.B(z)) {
                z2 = true;
            }
        }
        if (z2) {
            H(true);
        }
    }

    public void setQwertyMode(boolean z) {
        this.c = z;
        H(false);
    }

    public int size() {
        return this.f.size();
    }

    public f t() {
        return this.w;
    }

    public Drawable u() {
        return this.o;
    }

    public CharSequence v() {
        return this.n;
    }

    public View w() {
        return this.p;
    }

    public ArrayList<f> x() {
        q();
        return this.j;
    }

    public boolean y() {
        return this.s;
    }

    public MenuItem add(int i) {
        return b(0, 0, 0, this.f26538b.getString(i));
    }

    public SubMenu addSubMenu(int i) {
        return addSubMenu(0, 0, 0, this.f26538b.getString(i));
    }

    public MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return b(i, i2, i3, charSequence);
    }

    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        f fVar = (f) b(i, i2, i3, charSequence);
        j jVar = new j(this.f26537a, this, fVar);
        fVar.y(jVar);
        return jVar;
    }

    public MenuItem add(int i, int i2, int i3, int i4) {
        return b(i, i2, i3, this.f26538b.getString(i4));
    }

    public SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return addSubMenu(i, i2, i3, this.f26538b.getString(i4));
    }
}

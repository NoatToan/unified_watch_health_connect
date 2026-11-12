package androidx.appcompat.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.annotation.RestrictTo;
import defpackage.msq;
import defpackage.ni4;
import defpackage.oe0;
import defpackage.vpo;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class e implements vpo {
    public static final int[] A = {1, 4, 5, 3, 2, 0};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f1502a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Resources f1503b;
    public boolean c;
    public boolean d;
    public a e;
    public ContextMenu.ContextMenuInfo m;
    public CharSequence n;
    public Drawable o;
    public View p;
    public g x;
    public boolean z;
    public int l = 0;
    public boolean q = false;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f1505r = false;
    public boolean s = false;
    public boolean t = false;
    public boolean u = false;
    public ArrayList<g> v = new ArrayList<>();
    public CopyOnWriteArrayList<WeakReference<i>> w = new CopyOnWriteArrayList<>();
    public boolean y = false;
    public ArrayList<g> f = new ArrayList<>();
    public ArrayList<g> g = new ArrayList<>();
    public boolean h = true;
    public ArrayList<g> i = new ArrayList<>();
    public ArrayList<g> j = new ArrayList<>();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f1504k = true;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public interface a {
        boolean a(e eVar, MenuItem menuItem);

        void b(e eVar);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public interface b {
        boolean f(g gVar);
    }

    public e(Context context) {
        this.f1502a = context;
        this.f1503b = context.getResources();
        f0(true);
    }

    public static int D(int i) {
        int i2 = ((-65536) & i) >> 16;
        if (i2 >= 0) {
            int[] iArr = A;
            if (i2 < iArr.length) {
                return (i & 65535) | (iArr[i2] << 16);
            }
        }
        throw new IllegalArgumentException("order does not contain a valid category.");
    }

    public static int p(ArrayList<g> arrayList, int i) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size).f() <= i) {
                return size + 1;
            }
        }
        return 0;
    }

    public View A() {
        return this.p;
    }

    public ArrayList<g> B() {
        t();
        return this.j;
    }

    public boolean C() {
        return this.t;
    }

    public Resources E() {
        return this.f1503b;
    }

    public e F() {
        return this;
    }

    public ArrayList<g> G() {
        if (!this.h) {
            return this.g;
        }
        this.g.clear();
        int size = this.f.size();
        for (int i = 0; i < size; i++) {
            g gVar = this.f.get(i);
            if (gVar.isVisible()) {
                this.g.add(gVar);
            }
        }
        this.h = false;
        this.f1504k = true;
        return this.g;
    }

    public boolean H() {
        return this.y;
    }

    public boolean I() {
        return this.c;
    }

    public boolean J() {
        return this.d;
    }

    public void K(g gVar) {
        this.f1504k = true;
        M(true);
    }

    public void L(g gVar) {
        this.h = true;
        M(true);
    }

    public void M(boolean z) {
        if (this.q) {
            this.f1505r = true;
            if (z) {
                this.s = true;
                return;
            }
            return;
        }
        if (z) {
            this.h = true;
            this.f1504k = true;
        }
        i(z);
    }

    public boolean N(MenuItem menuItem, int i) {
        return O(menuItem, null, i);
    }

    public boolean O(MenuItem menuItem, i iVar, int i) {
        g gVar = (g) menuItem;
        if (gVar == null || !gVar.isEnabled()) {
            return false;
        }
        boolean zK = gVar.k();
        oe0 oe0VarB = gVar.b();
        boolean z = oe0VarB != null && oe0VarB.a();
        if (gVar.j()) {
            zK |= gVar.expandActionView();
            if (zK) {
                e(true);
            }
        } else if (gVar.hasSubMenu() || z) {
            if ((i & 4) == 0) {
                e(false);
            }
            if (!gVar.hasSubMenu()) {
                gVar.x(new k(w(), this, gVar));
            }
            k kVar = (k) gVar.getSubMenu();
            if (z) {
                oe0VarB.f(kVar);
            }
            zK |= l(kVar, iVar);
            if (!zK) {
                e(true);
            }
        } else if ((i & 1) == 0) {
            e(true);
        }
        return zK;
    }

    public final void P(int i, boolean z) {
        if (i < 0 || i >= this.f.size()) {
            return;
        }
        this.f.remove(i);
        if (z) {
            M(true);
        }
    }

    public void Q(i iVar) {
        for (WeakReference<i> weakReference : this.w) {
            i iVar2 = weakReference.get();
            if (iVar2 == null || iVar2 == iVar) {
                this.w.remove(weakReference);
            }
        }
    }

    public void R(Bundle bundle) {
        MenuItem menuItemFindItem;
        if (bundle == null) {
            return;
        }
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(v());
        int size = size();
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((k) item.getSubMenu()).R(bundle);
            }
        }
        int i2 = bundle.getInt("android:menu:expandedactionview");
        if (i2 <= 0 || (menuItemFindItem = findItem(i2)) == null) {
            return;
        }
        menuItemFindItem.expandActionView();
    }

    public void S(Bundle bundle) {
        j(bundle);
    }

    public void T(Bundle bundle) {
        int size = size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((k) item.getSubMenu()).T(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(v(), sparseArray);
        }
    }

    public void U(Bundle bundle) {
        k(bundle);
    }

    public void V(a aVar) {
        this.e = aVar;
    }

    public e W(int i) {
        this.l = i;
        return this;
    }

    public void X(MenuItem menuItem) {
        int groupId = menuItem.getGroupId();
        int size = this.f.size();
        h0();
        for (int i = 0; i < size; i++) {
            g gVar = this.f.get(i);
            if (gVar.getGroupId() == groupId && gVar.m() && gVar.isCheckable()) {
                gVar.s(gVar == menuItem);
            }
        }
        g0();
    }

    public e Y(int i) {
        a0(0, null, i, null, null);
        return this;
    }

    public e Z(Drawable drawable) {
        a0(0, null, 0, drawable, null);
        return this;
    }

    public MenuItem a(int i, int i2, int i3, CharSequence charSequence) {
        int iD = D(i3);
        g gVarG = g(i, i2, i3, iD, charSequence, this.l);
        ContextMenu.ContextMenuInfo contextMenuInfo = this.m;
        if (contextMenuInfo != null) {
            gVarG.v(contextMenuInfo);
        }
        ArrayList<g> arrayList = this.f;
        arrayList.add(p(arrayList, iD), gVarG);
        M(true);
        return gVarG;
    }

    public final void a0(int i, CharSequence charSequence, int i2, Drawable drawable, View view) {
        Resources resourcesE = E();
        if (view != null) {
            this.p = view;
            this.n = null;
            this.o = null;
        } else {
            if (i > 0) {
                this.n = resourcesE.getText(i);
            } else if (charSequence != null) {
                this.n = charSequence;
            }
            if (i2 > 0) {
                this.o = ni4.e(w(), i2);
            } else if (drawable != null) {
                this.o = drawable;
            }
            this.p = null;
        }
        M(false);
    }

    @Override // android.view.Menu
    public MenuItem add(CharSequence charSequence) {
        return a(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        int i5;
        PackageManager packageManager = this.f1502a.getPackageManager();
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

    @Override // android.view.Menu
    public SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public void b(i iVar) {
        c(iVar, this.f1502a);
    }

    public e b0(int i) {
        a0(i, null, 0, null, null);
        return this;
    }

    public void c(i iVar, Context context) {
        this.w.add(new WeakReference<>(iVar));
        iVar.e(context, this);
        this.f1504k = true;
    }

    public e c0(CharSequence charSequence) {
        a0(0, charSequence, 0, null, null);
        return this;
    }

    @Override // android.view.Menu
    public void clear() {
        g gVar = this.x;
        if (gVar != null) {
            f(gVar);
        }
        this.f.clear();
        M(true);
    }

    public void clearHeader() {
        this.o = null;
        this.n = null;
        this.p = null;
        M(false);
    }

    @Override // android.view.Menu
    public void close() {
        e(true);
    }

    public void d() {
        a aVar = this.e;
        if (aVar != null) {
            aVar.b(this);
        }
    }

    public e d0(View view) {
        a0(0, null, 0, null, view);
        return this;
    }

    public final void e(boolean z) {
        if (this.u) {
            return;
        }
        this.u = true;
        for (WeakReference<i> weakReference : this.w) {
            i iVar = weakReference.get();
            if (iVar == null) {
                this.w.remove(weakReference);
            } else {
                iVar.b(this, z);
            }
        }
        this.u = false;
    }

    public void e0(boolean z) {
        this.z = z;
    }

    public boolean f(g gVar) {
        boolean zD = false;
        if (!this.w.isEmpty() && this.x == gVar) {
            h0();
            for (WeakReference<i> weakReference : this.w) {
                i iVar = weakReference.get();
                if (iVar != null) {
                    zD = iVar.d(this, gVar);
                    if (zD) {
                        break;
                    }
                } else {
                    this.w.remove(weakReference);
                }
            }
            g0();
            if (zD) {
                this.x = null;
            }
        }
        return zD;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    public final void f0(boolean z) {
        boolean z2;
        if (z) {
            z2 = this.f1503b.getConfiguration().keyboard != 1 && msq.j(ViewConfiguration.get(this.f1502a), this.f1502a);
        }
        this.d = z2;
    }

    @Override // android.view.Menu
    public MenuItem findItem(int i) {
        MenuItem menuItemFindItem;
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            g gVar = this.f.get(i2);
            if (gVar.getItemId() == i) {
                return gVar;
            }
            if (gVar.hasSubMenu() && (menuItemFindItem = gVar.getSubMenu().findItem(i)) != null) {
                return menuItemFindItem;
            }
        }
        return null;
    }

    public final g g(int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
        return new g(this, i, i2, i3, i4, charSequence, i5);
    }

    public void g0() {
        this.q = false;
        if (this.f1505r) {
            this.f1505r = false;
            M(this.s);
        }
    }

    @Override // android.view.Menu
    public MenuItem getItem(int i) {
        return this.f.get(i);
    }

    public boolean h(e eVar, MenuItem menuItem) {
        a aVar = this.e;
        return aVar != null && aVar.a(eVar, menuItem);
    }

    public void h0() {
        if (this.q) {
            return;
        }
        this.q = true;
        this.f1505r = false;
        this.s = false;
    }

    @Override // android.view.Menu
    public boolean hasVisibleItems() {
        if (this.z) {
            return true;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.f.get(i).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public final void i(boolean z) {
        if (this.w.isEmpty()) {
            return;
        }
        h0();
        for (WeakReference<i> weakReference : this.w) {
            i iVar = weakReference.get();
            if (iVar == null) {
                this.w.remove(weakReference);
            } else {
                iVar.updateMenuView(z);
            }
        }
        g0();
    }

    @Override // android.view.Menu
    public boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return r(i, keyEvent) != null;
    }

    public final void j(Bundle bundle) {
        Parcelable parcelable;
        SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:presenters");
        if (sparseParcelableArray == null || this.w.isEmpty()) {
            return;
        }
        for (WeakReference<i> weakReference : this.w) {
            i iVar = weakReference.get();
            if (iVar == null) {
                this.w.remove(weakReference);
            } else {
                int id = iVar.getId();
                if (id > 0 && (parcelable = (Parcelable) sparseParcelableArray.get(id)) != null) {
                    iVar.onRestoreInstanceState(parcelable);
                }
            }
        }
    }

    public final void k(Bundle bundle) {
        Parcelable parcelableOnSaveInstanceState;
        if (this.w.isEmpty()) {
            return;
        }
        SparseArray<? extends Parcelable> sparseArray = new SparseArray<>();
        for (WeakReference<i> weakReference : this.w) {
            i iVar = weakReference.get();
            if (iVar == null) {
                this.w.remove(weakReference);
            } else {
                int id = iVar.getId();
                if (id > 0 && (parcelableOnSaveInstanceState = iVar.onSaveInstanceState()) != null) {
                    sparseArray.put(id, parcelableOnSaveInstanceState);
                }
            }
        }
        bundle.putSparseParcelableArray("android:menu:presenters", sparseArray);
    }

    public final boolean l(k kVar, i iVar) {
        if (this.w.isEmpty()) {
            return false;
        }
        boolean zG = iVar != null ? iVar.g(kVar) : false;
        for (WeakReference<i> weakReference : this.w) {
            i iVar2 = weakReference.get();
            if (iVar2 == null) {
                this.w.remove(weakReference);
            } else if (!zG) {
                zG = iVar2.g(kVar);
            }
        }
        return zG;
    }

    public boolean m(g gVar) {
        boolean zC = false;
        if (this.w.isEmpty()) {
            return false;
        }
        h0();
        for (WeakReference<i> weakReference : this.w) {
            i iVar = weakReference.get();
            if (iVar != null) {
                zC = iVar.c(this, gVar);
                if (zC) {
                    break;
                }
            } else {
                this.w.remove(weakReference);
            }
        }
        g0();
        if (zC) {
            this.x = gVar;
        }
        return zC;
    }

    public int n(int i) {
        return o(i, 0);
    }

    public int o(int i, int i2) {
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

    @Override // android.view.Menu
    public boolean performIdentifierAction(int i, int i2) {
        return N(findItem(i), i2);
    }

    @Override // android.view.Menu
    public boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        g gVarR = r(i, keyEvent);
        boolean zN = gVarR != null ? N(gVarR, i2) : false;
        if ((i2 & 2) != 0) {
            e(true);
        }
        return zN;
    }

    public int q(int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            if (this.f.get(i2).getItemId() == i) {
                return i2;
            }
        }
        return -1;
    }

    public g r(int i, KeyEvent keyEvent) {
        ArrayList<g> arrayList = this.v;
        arrayList.clear();
        s(arrayList, i, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return arrayList.get(0);
        }
        boolean zI = I();
        for (int i2 = 0; i2 < size; i2++) {
            g gVar = arrayList.get(i2);
            char alphabeticShortcut = zI ? gVar.getAlphabeticShortcut() : gVar.getNumericShortcut();
            char[] cArr = keyData.meta;
            if ((alphabeticShortcut == cArr[0] && (metaState & 2) == 0) || ((alphabeticShortcut == cArr[2] && (metaState & 2) != 0) || (zI && alphabeticShortcut == '\b' && i == 67))) {
                return gVar;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public void removeGroup(int i) {
        int iN = n(i);
        if (iN >= 0) {
            int size = this.f.size() - iN;
            int i2 = 0;
            while (true) {
                int i3 = i2 + 1;
                if (i2 >= size || this.f.get(iN).getGroupId() != i) {
                    break;
                }
                P(iN, false);
                i2 = i3;
            }
            M(true);
        }
    }

    @Override // android.view.Menu
    public void removeItem(int i) {
        P(q(i), true);
    }

    public void s(List<g> list, int i, KeyEvent keyEvent) {
        boolean zI = I();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i == 67) {
            int size = this.f.size();
            for (int i2 = 0; i2 < size; i2++) {
                g gVar = this.f.get(i2);
                if (gVar.hasSubMenu()) {
                    ((e) gVar.getSubMenu()).s(list, i, keyEvent);
                }
                char alphabeticShortcut = zI ? gVar.getAlphabeticShortcut() : gVar.getNumericShortcut();
                if ((modifiers & 69647) == ((zI ? gVar.getAlphabeticModifiers() : gVar.getNumericModifiers()) & 69647) && alphabeticShortcut != 0) {
                    char[] cArr = keyData.meta;
                    if ((alphabeticShortcut == cArr[0] || alphabeticShortcut == cArr[2] || (zI && alphabeticShortcut == '\b' && i == 67)) && gVar.isEnabled()) {
                        list.add(gVar);
                    }
                }
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupCheckable(int i, boolean z, boolean z2) {
        int size = this.f.size();
        for (int i2 = 0; i2 < size; i2++) {
            g gVar = this.f.get(i2);
            if (gVar.getGroupId() == i) {
                gVar.t(z2);
                gVar.setCheckable(z);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z) {
        this.y = z;
    }

    @Override // android.view.Menu
    public void setGroupEnabled(int i, boolean z) {
        int size = this.f.size();
        for (int i2 = 0; i2 < size; i2++) {
            g gVar = this.f.get(i2);
            if (gVar.getGroupId() == i) {
                gVar.setEnabled(z);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupVisible(int i, boolean z) {
        int size = this.f.size();
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            g gVar = this.f.get(i2);
            if (gVar.getGroupId() == i && gVar.y(z)) {
                z2 = true;
            }
        }
        if (z2) {
            M(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z) {
        this.c = z;
        M(false);
    }

    @Override // android.view.Menu
    public int size() {
        return this.f.size();
    }

    public void t() {
        ArrayList<g> arrayListG = G();
        if (this.f1504k) {
            boolean zFlagActionItems = false;
            for (WeakReference<i> weakReference : this.w) {
                i iVar = weakReference.get();
                if (iVar == null) {
                    this.w.remove(weakReference);
                } else {
                    zFlagActionItems |= iVar.flagActionItems();
                }
            }
            if (zFlagActionItems) {
                this.i.clear();
                this.j.clear();
                int size = arrayListG.size();
                for (int i = 0; i < size; i++) {
                    g gVar = arrayListG.get(i);
                    if (gVar.l()) {
                        this.i.add(gVar);
                    } else {
                        this.j.add(gVar);
                    }
                }
            } else {
                this.i.clear();
                this.j.clear();
                this.j.addAll(G());
            }
            this.f1504k = false;
        }
    }

    public ArrayList<g> u() {
        t();
        return this.i;
    }

    public String v() {
        return "android:menu:actionviewstates";
    }

    public Context w() {
        return this.f1502a;
    }

    public g x() {
        return this.x;
    }

    public Drawable y() {
        return this.o;
    }

    public CharSequence z() {
        return this.n;
    }

    @Override // android.view.Menu
    public MenuItem add(int i) {
        return a(0, 0, 0, this.f1503b.getString(i));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i) {
        return addSubMenu(0, 0, 0, this.f1503b.getString(i));
    }

    @Override // android.view.Menu
    public MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return a(i, i2, i3, charSequence);
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        g gVar = (g) a(i, i2, i3, charSequence);
        k kVar = new k(this.f1502a, this, gVar);
        gVar.x(kVar);
        return kVar;
    }

    @Override // android.view.Menu
    public MenuItem add(int i, int i2, int i3, int i4) {
        return a(i, i2, i3, this.f1503b.getString(i4));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return addSubMenu(i, i2, i3, this.f1503b.getString(i4));
    }
}

package androidx.appcompat.view.menu;

import android.content.ActivityNotFoundException;
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
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public class h implements e7.a {
    private static final String ACTION_VIEW_STATES_KEY = "android:menu:actionviewstates";
    private static final String EXPANDED_ACTION_VIEW_ID = "android:menu:expandedactionview";
    private static final String PRESENTER_KEY = "android:menu:presenters";
    private static final String TAG = "MenuBuilder";
    private static final int[] sCategoryToOrder = {1, 4, 5, 3, 2, 0};
    private a mCallback;
    private final Context mContext;
    private ContextMenu.ContextMenuInfo mCurrentMenuInfo;
    private j mExpandedItem;
    Drawable mHeaderIcon;
    CharSequence mHeaderTitle;
    View mHeaderView;
    private boolean mOverrideVisibleItems;
    private boolean mQwertyMode;
    private final Resources mResources;
    private boolean mShortcutsVisible;
    private int mDefaultShowAsAction = 0;
    private boolean mPreventDispatchingItemsChanged = false;
    private boolean mItemsChangedWhileDispatchPrevented = false;
    private boolean mStructureChangedWhileDispatchPrevented = false;
    private boolean mOptionalIconsVisible = false;
    private boolean mIsClosing = false;
    private ArrayList<j> mTempShortcutItemList = new ArrayList<>();
    private CopyOnWriteArrayList<WeakReference<n>> mPresenters = new CopyOnWriteArrayList<>();
    private boolean mGroupDividerEnabled = false;
    private ArrayList<j> mItems = new ArrayList<>();
    private ArrayList<j> mVisibleItems = new ArrayList<>();
    private boolean mIsVisibleItemsStale = true;
    private ArrayList<j> mActionItems = new ArrayList<>();
    private ArrayList<j> mNonActionItems = new ArrayList<>();
    private boolean mIsActionItemsStale = true;

    public interface a {
        boolean onMenuItemSelected(h hVar, MenuItem menuItem);

        void onMenuModeChange(h hVar);
    }

    public interface b {
        boolean a(j jVar);
    }

    public h(Context context) {
        this.mContext = context;
        this.mResources = context.getResources();
        setShortcutsVisibleInner(true);
    }

    private j createNewMenuItem(int i14, int i15, int i16, int i17, CharSequence charSequence, int i18) {
        return new j(this, i14, i15, i16, i17, charSequence, i18);
    }

    private void dispatchPresenterUpdate(boolean z14) {
        if (this.mPresenters.isEmpty()) {
            return;
        }
        stopDispatchingItemsChanged();
        for (WeakReference<n> weakReference : this.mPresenters) {
            n nVar = weakReference.get();
            if (nVar == null) {
                this.mPresenters.remove(weakReference);
            } else {
                nVar.updateMenuView(z14);
            }
        }
        startDispatchingItemsChanged();
    }

    private void dispatchRestoreInstanceState(Bundle bundle) {
        Parcelable parcelable;
        SparseArray sparseParcelableArray = bundle.getSparseParcelableArray(PRESENTER_KEY);
        if (sparseParcelableArray == null || this.mPresenters.isEmpty()) {
            return;
        }
        for (WeakReference<n> weakReference : this.mPresenters) {
            n nVar = weakReference.get();
            if (nVar == null) {
                this.mPresenters.remove(weakReference);
            } else {
                int id3 = nVar.getId();
                if (id3 > 0 && (parcelable = (Parcelable) sparseParcelableArray.get(id3)) != null) {
                    nVar.onRestoreInstanceState(parcelable);
                }
            }
        }
    }

    private void dispatchSaveInstanceState(Bundle bundle) {
        Parcelable parcelableOnSaveInstanceState;
        if (this.mPresenters.isEmpty()) {
            return;
        }
        SparseArray<? extends Parcelable> sparseArray = new SparseArray<>();
        for (WeakReference<n> weakReference : this.mPresenters) {
            n nVar = weakReference.get();
            if (nVar == null) {
                this.mPresenters.remove(weakReference);
            } else {
                int id3 = nVar.getId();
                if (id3 > 0 && (parcelableOnSaveInstanceState = nVar.onSaveInstanceState()) != null) {
                    sparseArray.put(id3, parcelableOnSaveInstanceState);
                }
            }
        }
        bundle.putSparseParcelableArray(PRESENTER_KEY, sparseArray);
    }

    private boolean dispatchSubMenuSelected(s sVar, n nVar) {
        if (this.mPresenters.isEmpty()) {
            return false;
        }
        boolean zOnSubMenuSelected = nVar != null ? nVar.onSubMenuSelected(sVar) : false;
        for (WeakReference<n> weakReference : this.mPresenters) {
            n nVar2 = weakReference.get();
            if (nVar2 == null) {
                this.mPresenters.remove(weakReference);
            } else if (!zOnSubMenuSelected) {
                zOnSubMenuSelected = nVar2.onSubMenuSelected(sVar);
            }
        }
        return zOnSubMenuSelected;
    }

    private static int findInsertIndex(ArrayList<j> arrayList, int i14) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size).f4776d <= i14) {
                return size + 1;
            }
        }
        return 0;
    }

    private static int getOrdering(int i14) {
        int i15 = ((-65536) & i14) >> 16;
        if (i15 >= 0) {
            int[] iArr = sCategoryToOrder;
            if (i15 < iArr.length) {
                return (i14 & 65535) | (iArr[i15] << 16);
            }
        }
        vb.h.s("order does not contain a valid category.");
        return 0;
    }

    private void removeItemAtInt(int i14, boolean z14) {
        if (i14 < 0 || i14 >= this.mItems.size()) {
            return;
        }
        this.mItems.remove(i14);
        if (z14) {
            onItemsChanged(true);
        }
    }

    private void setHeaderInternal(int i14, CharSequence charSequence, int i15, Drawable drawable, View view2) {
        Resources resources = getResources();
        if (view2 != null) {
            this.mHeaderView = view2;
            this.mHeaderTitle = null;
            this.mHeaderIcon = null;
        } else {
            if (i14 > 0) {
                this.mHeaderTitle = resources.getText(i14);
            } else if (charSequence != null) {
                this.mHeaderTitle = charSequence;
            }
            if (i15 > 0) {
                this.mHeaderIcon = a7.b.getDrawable(getContext(), i15);
            } else if (drawable != null) {
                this.mHeaderIcon = drawable;
            }
            this.mHeaderView = null;
        }
        onItemsChanged(false);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    private void setShortcutsVisibleInner(boolean z14) {
        boolean z15;
        if (z14) {
            z15 = this.mResources.getConfiguration().keyboard != 1 && ViewConfiguration.get(this.mContext).shouldShowMenuShortcutsWhenKeyboardPresent();
        }
        this.mShortcutsVisible = z15;
    }

    @Override // android.view.Menu
    public MenuItem add(int i14) {
        return addInternal(0, 0, 0, this.mResources.getString(i14));
    }

    @Override // android.view.Menu
    public int addIntentOptions(int i14, int i15, int i16, ComponentName componentName, Intent[] intentArr, Intent intent, int i17, MenuItem[] menuItemArr) {
        int i18;
        PackageManager packageManager = this.mContext.getPackageManager();
        List<ResolveInfo> listQueryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = listQueryIntentActivityOptions != null ? listQueryIntentActivityOptions.size() : 0;
        if ((i17 & 1) == 0) {
            removeGroup(i14);
        }
        for (int i19 = 0; i19 < size; i19++) {
            ResolveInfo resolveInfo = listQueryIntentActivityOptions.get(i19);
            int i24 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i24 < 0 ? intent : intentArr[i24]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            MenuItem intent3 = add(i14, i15, i16, resolveInfo.loadLabel(packageManager)).setIcon(resolveInfo.loadIcon(packageManager)).setIntent(intent2);
            if (menuItemArr != null && (i18 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i18] = intent3;
            }
        }
        return size;
    }

    public MenuItem addInternal(int i14, int i15, int i16, CharSequence charSequence) {
        int ordering = getOrdering(i16);
        j jVarCreateNewMenuItem = createNewMenuItem(i14, i15, i16, ordering, charSequence, this.mDefaultShowAsAction);
        ContextMenu.ContextMenuInfo contextMenuInfo = this.mCurrentMenuInfo;
        if (contextMenuInfo != null) {
            jVarCreateNewMenuItem.D = contextMenuInfo;
        }
        ArrayList<j> arrayList = this.mItems;
        arrayList.add(findInsertIndex(arrayList, ordering), jVarCreateNewMenuItem);
        onItemsChanged(true);
        return jVarCreateNewMenuItem;
    }

    public void addMenuPresenter(n nVar, Context context) {
        this.mPresenters.add(new WeakReference<>(nVar));
        nVar.initForMenu(context, this);
        this.mIsActionItemsStale = true;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i14, int i15, int i16, CharSequence charSequence) {
        j jVar = (j) addInternal(i14, i15, i16, charSequence);
        s sVar = new s(this.mContext, this, jVar);
        jVar.f4787o = sVar;
        sVar.setHeaderTitle(jVar.f4777e);
        return sVar;
    }

    public void changeMenuMode() {
        a aVar = this.mCallback;
        if (aVar != null) {
            aVar.onMenuModeChange(this);
        }
    }

    @Override // android.view.Menu
    public void clear() {
        j jVar = this.mExpandedItem;
        if (jVar != null) {
            collapseItemActionView(jVar);
        }
        this.mItems.clear();
        onItemsChanged(true);
    }

    public void clearAll() {
        this.mPreventDispatchingItemsChanged = true;
        clear();
        clearHeader();
        this.mPresenters.clear();
        this.mPreventDispatchingItemsChanged = false;
        this.mItemsChangedWhileDispatchPrevented = false;
        this.mStructureChangedWhileDispatchPrevented = false;
        onItemsChanged(true);
    }

    public void clearHeader() {
        this.mHeaderIcon = null;
        this.mHeaderTitle = null;
        this.mHeaderView = null;
        onItemsChanged(false);
    }

    public final void close(boolean z14) {
        if (this.mIsClosing) {
            return;
        }
        this.mIsClosing = true;
        for (WeakReference<n> weakReference : this.mPresenters) {
            n nVar = weakReference.get();
            if (nVar == null) {
                this.mPresenters.remove(weakReference);
            } else {
                nVar.onCloseMenu(this, z14);
            }
        }
        this.mIsClosing = false;
    }

    public boolean collapseItemActionView(j jVar) {
        boolean zCollapseItemActionView = false;
        if (!this.mPresenters.isEmpty() && this.mExpandedItem == jVar) {
            stopDispatchingItemsChanged();
            for (WeakReference<n> weakReference : this.mPresenters) {
                n nVar = weakReference.get();
                if (nVar != null) {
                    zCollapseItemActionView = nVar.collapseItemActionView(this, jVar);
                    if (zCollapseItemActionView) {
                        break;
                    }
                } else {
                    this.mPresenters.remove(weakReference);
                }
            }
            startDispatchingItemsChanged();
            if (zCollapseItemActionView) {
                this.mExpandedItem = null;
            }
        }
        return zCollapseItemActionView;
    }

    public boolean dispatchMenuItemSelected(h hVar, MenuItem menuItem) {
        a aVar = this.mCallback;
        return aVar != null && aVar.onMenuItemSelected(hVar, menuItem);
    }

    public boolean expandItemActionView(j jVar) {
        boolean zExpandItemActionView = false;
        if (this.mPresenters.isEmpty()) {
            return false;
        }
        stopDispatchingItemsChanged();
        for (WeakReference<n> weakReference : this.mPresenters) {
            n nVar = weakReference.get();
            if (nVar != null) {
                zExpandItemActionView = nVar.expandItemActionView(this, jVar);
                if (zExpandItemActionView) {
                    break;
                }
            } else {
                this.mPresenters.remove(weakReference);
            }
        }
        startDispatchingItemsChanged();
        if (zExpandItemActionView) {
            this.mExpandedItem = jVar;
        }
        return zExpandItemActionView;
    }

    public int findGroupIndex(int i14, int i15) {
        int size = size();
        if (i15 < 0) {
            i15 = 0;
        }
        while (i15 < size) {
            if (this.mItems.get(i15).f4774b == i14) {
                return i15;
            }
            i15++;
        }
        return -1;
    }

    @Override // android.view.Menu
    public MenuItem findItem(int i14) {
        MenuItem menuItemFindItem;
        int size = size();
        for (int i15 = 0; i15 < size; i15++) {
            j jVar = this.mItems.get(i15);
            if (jVar.f4773a == i14) {
                return jVar;
            }
            if (jVar.hasSubMenu() && (menuItemFindItem = jVar.f4787o.findItem(i14)) != null) {
                return menuItemFindItem;
            }
        }
        return null;
    }

    public int findItemIndex(int i14) {
        int size = size();
        for (int i15 = 0; i15 < size; i15++) {
            if (this.mItems.get(i15).f4773a == i14) {
                return i15;
            }
        }
        return -1;
    }

    public j findItemWithShortcutForKey(int i14, KeyEvent keyEvent) {
        ArrayList<j> arrayList = this.mTempShortcutItemList;
        arrayList.clear();
        findItemsWithShortcutForKey(arrayList, i14, keyEvent);
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
        boolean zIsQwertyMode = isQwertyMode();
        for (int i15 = 0; i15 < size; i15++) {
            j jVar = arrayList.get(i15);
            char c14 = zIsQwertyMode ? jVar.f4782j : jVar.f4780h;
            char[] cArr = keyData.meta;
            if ((c14 == cArr[0] && (metaState & 2) == 0) || ((c14 == cArr[2] && (metaState & 2) != 0) || (zIsQwertyMode && c14 == '\b' && i14 == 67))) {
                return jVar;
            }
        }
        return null;
    }

    public void findItemsWithShortcutForKey(List<j> list, int i14, KeyEvent keyEvent) {
        boolean zIsQwertyMode = isQwertyMode();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i14 == 67) {
            int size = this.mItems.size();
            for (int i15 = 0; i15 < size; i15++) {
                j jVar = this.mItems.get(i15);
                if (jVar.hasSubMenu()) {
                    jVar.f4787o.findItemsWithShortcutForKey(list, i14, keyEvent);
                }
                char c14 = zIsQwertyMode ? jVar.f4782j : jVar.f4780h;
                if ((modifiers & 69647) == ((zIsQwertyMode ? jVar.f4783k : jVar.f4781i) & 69647) && c14 != 0) {
                    char[] cArr = keyData.meta;
                    if ((c14 == cArr[0] || c14 == cArr[2] || (zIsQwertyMode && c14 == '\b' && i14 == 67)) && jVar.isEnabled()) {
                        list.add(jVar);
                    }
                }
            }
        }
    }

    public void flagActionItems() {
        ArrayList<j> visibleItems = getVisibleItems();
        if (this.mIsActionItemsStale) {
            boolean zFlagActionItems = false;
            for (WeakReference<n> weakReference : this.mPresenters) {
                n nVar = weakReference.get();
                if (nVar == null) {
                    this.mPresenters.remove(weakReference);
                } else {
                    zFlagActionItems |= nVar.flagActionItems();
                }
            }
            ArrayList<j> arrayList = this.mActionItems;
            if (zFlagActionItems) {
                arrayList.clear();
                this.mNonActionItems.clear();
                int size = visibleItems.size();
                for (int i14 = 0; i14 < size; i14++) {
                    j jVar = visibleItems.get(i14);
                    if ((jVar.f4796x & 32) == 32) {
                        this.mActionItems.add(jVar);
                    } else {
                        this.mNonActionItems.add(jVar);
                    }
                }
            } else {
                arrayList.clear();
                this.mNonActionItems.clear();
                this.mNonActionItems.addAll(getVisibleItems());
            }
            this.mIsActionItemsStale = false;
        }
    }

    public ArrayList<j> getActionItems() {
        flagActionItems();
        return this.mActionItems;
    }

    public String getActionViewStatesKey() {
        return ACTION_VIEW_STATES_KEY;
    }

    public Context getContext() {
        return this.mContext;
    }

    public j getExpandedItem() {
        return this.mExpandedItem;
    }

    public Drawable getHeaderIcon() {
        return this.mHeaderIcon;
    }

    public CharSequence getHeaderTitle() {
        return this.mHeaderTitle;
    }

    public View getHeaderView() {
        return this.mHeaderView;
    }

    @Override // android.view.Menu
    public MenuItem getItem(int i14) {
        return this.mItems.get(i14);
    }

    public ArrayList<j> getNonActionItems() {
        flagActionItems();
        return this.mNonActionItems;
    }

    public boolean getOptionalIconsVisible() {
        return this.mOptionalIconsVisible;
    }

    public Resources getResources() {
        return this.mResources;
    }

    public h getRootMenu() {
        return this;
    }

    public ArrayList<j> getVisibleItems() {
        boolean z14 = this.mIsVisibleItemsStale;
        ArrayList<j> arrayList = this.mVisibleItems;
        if (!z14) {
            return arrayList;
        }
        arrayList.clear();
        int size = this.mItems.size();
        for (int i14 = 0; i14 < size; i14++) {
            j jVar = this.mItems.get(i14);
            if (jVar.isVisible()) {
                this.mVisibleItems.add(jVar);
            }
        }
        this.mIsVisibleItemsStale = false;
        this.mIsActionItemsStale = true;
        return this.mVisibleItems;
    }

    @Override // android.view.Menu
    public boolean hasVisibleItems() {
        if (this.mOverrideVisibleItems) {
            return true;
        }
        int size = size();
        for (int i14 = 0; i14 < size; i14++) {
            if (this.mItems.get(i14).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public boolean isDispatchingItemsChanged() {
        return !this.mPreventDispatchingItemsChanged;
    }

    public boolean isGroupDividerEnabled() {
        return this.mGroupDividerEnabled;
    }

    public boolean isQwertyMode() {
        return this.mQwertyMode;
    }

    @Override // android.view.Menu
    public boolean isShortcutKey(int i14, KeyEvent keyEvent) {
        return findItemWithShortcutForKey(i14, keyEvent) != null;
    }

    public boolean isShortcutsVisible() {
        return this.mShortcutsVisible;
    }

    public void onItemActionRequestChanged(j jVar) {
        this.mIsActionItemsStale = true;
        onItemsChanged(true);
    }

    public void onItemVisibleChanged(j jVar) {
        this.mIsVisibleItemsStale = true;
        onItemsChanged(true);
    }

    public void onItemsChanged(boolean z14) {
        if (this.mPreventDispatchingItemsChanged) {
            this.mItemsChangedWhileDispatchPrevented = true;
            if (z14) {
                this.mStructureChangedWhileDispatchPrevented = true;
                return;
            }
            return;
        }
        if (z14) {
            this.mIsVisibleItemsStale = true;
            this.mIsActionItemsStale = true;
        }
        dispatchPresenterUpdate(z14);
    }

    @Override // android.view.Menu
    public boolean performIdentifierAction(int i14, int i15) {
        return performItemAction(findItem(i14), i15);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001a  */
    /* JADX WARN: Code duplicated, block: B:30:0x0049  */
    /* JADX WARN: Code duplicated, block: B:33:0x0050  */
    /* JADX WARN: Code duplicated, block: B:35:0x0057  */
    /* JADX WARN: Code duplicated, block: B:36:0x005b  */
    /* JADX WARN: Code duplicated, block: B:43:0x006c  */
    /* JADX WARN: Code duplicated, block: B:45:0x0070  */
    /* JADX WARN: Code duplicated, block: B:48:0x0079  */
    /* JADX WARN: Code duplicated, block: B:51:0x008d  */
    /* JADX WARN: Code duplicated, block: B:54:0x0097  */
    public boolean performItemAction(MenuItem menuItem, n nVar, int i14) {
        androidx.core.view.b bVar;
        boolean zDispatchSubMenuSelected;
        androidx.core.view.b bVar2;
        boolean z14;
        s sVar;
        j jVar = (j) menuItem;
        if (jVar == null || !jVar.isEnabled()) {
            return false;
        }
        h hVar = jVar.f4786n;
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = jVar.f4788p;
        if ((onMenuItemClickListener != null && onMenuItemClickListener.onMenuItemClick(jVar)) || hVar.dispatchMenuItemSelected(hVar, jVar)) {
            zDispatchSubMenuSelected = true;
        } else if (jVar.f4779g != null) {
            try {
                hVar.getContext().startActivity(jVar.f4779g);
            } catch (ActivityNotFoundException unused) {
                bVar = jVar.A;
                if (bVar == null) {
                }
                zDispatchSubMenuSelected = false;
                bVar2 = jVar.A;
                if (bVar2 == null) {
                    z14 = false;
                } else {
                    z14 = false;
                }
                if (jVar.e()) {
                    zDispatchSubMenuSelected |= jVar.expandActionView();
                    if (zDispatchSubMenuSelected) {
                        close(true);
                    }
                } else if (jVar.hasSubMenu()) {
                    if ((i14 & 4) == 0) {
                        close(false);
                    }
                    if (!jVar.hasSubMenu()) {
                        s sVar2 = new s(getContext(), this, jVar);
                        jVar.f4787o = sVar2;
                        sVar2.setHeaderTitle(jVar.f4777e);
                    }
                    sVar = jVar.f4787o;
                    if (z14) {
                        bVar2.f(sVar);
                    }
                    zDispatchSubMenuSelected |= dispatchSubMenuSelected(sVar, nVar);
                    if (!zDispatchSubMenuSelected) {
                        close(true);
                    }
                } else {
                    if ((i14 & 4) == 0) {
                        close(false);
                    }
                    if (!jVar.hasSubMenu()) {
                        s sVar3 = new s(getContext(), this, jVar);
                        jVar.f4787o = sVar3;
                        sVar3.setHeaderTitle(jVar.f4777e);
                    }
                    sVar = jVar.f4787o;
                    if (z14) {
                        bVar2.f(sVar);
                    }
                    zDispatchSubMenuSelected |= dispatchSubMenuSelected(sVar, nVar);
                    if (!zDispatchSubMenuSelected) {
                        close(true);
                    }
                }
                return zDispatchSubMenuSelected;
            }
            zDispatchSubMenuSelected = true;
        } else {
            bVar = jVar.A;
            if (bVar == null && bVar.e()) {
                zDispatchSubMenuSelected = true;
            } else {
                zDispatchSubMenuSelected = false;
            }
        }
        bVar2 = jVar.A;
        if (bVar2 == null && bVar2.a()) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (jVar.e()) {
            zDispatchSubMenuSelected |= jVar.expandActionView();
            if (zDispatchSubMenuSelected) {
                close(true);
            }
        } else if (jVar.hasSubMenu() || z14) {
            if ((i14 & 4) == 0) {
                close(false);
            }
            if (!jVar.hasSubMenu()) {
                s sVar4 = new s(getContext(), this, jVar);
                jVar.f4787o = sVar4;
                sVar4.setHeaderTitle(jVar.f4777e);
            }
            sVar = jVar.f4787o;
            if (z14) {
                bVar2.f(sVar);
            }
            zDispatchSubMenuSelected |= dispatchSubMenuSelected(sVar, nVar);
            if (!zDispatchSubMenuSelected) {
                close(true);
            }
        } else if ((i14 & 1) == 0) {
            close(true);
        }
        return zDispatchSubMenuSelected;
    }

    @Override // android.view.Menu
    public boolean performShortcut(int i14, KeyEvent keyEvent, int i15) {
        j jVarFindItemWithShortcutForKey = findItemWithShortcutForKey(i14, keyEvent);
        boolean zPerformItemAction = jVarFindItemWithShortcutForKey != null ? performItemAction(jVarFindItemWithShortcutForKey, i15) : false;
        if ((i15 & 2) != 0) {
            close(true);
        }
        return zPerformItemAction;
    }

    @Override // android.view.Menu
    public void removeGroup(int i14) {
        int iFindGroupIndex = findGroupIndex(i14);
        if (iFindGroupIndex >= 0) {
            int size = this.mItems.size() - iFindGroupIndex;
            int i15 = 0;
            while (true) {
                int i16 = i15 + 1;
                if (i15 >= size || this.mItems.get(iFindGroupIndex).f4774b != i14) {
                    break;
                }
                removeItemAtInt(iFindGroupIndex, false);
                i15 = i16;
            }
            onItemsChanged(true);
        }
    }

    @Override // android.view.Menu
    public void removeItem(int i14) {
        removeItemAtInt(findItemIndex(i14), true);
    }

    public void removeItemAt(int i14) {
        removeItemAtInt(i14, true);
    }

    public void removeMenuPresenter(n nVar) {
        for (WeakReference<n> weakReference : this.mPresenters) {
            n nVar2 = weakReference.get();
            if (nVar2 == null || nVar2 == nVar) {
                this.mPresenters.remove(weakReference);
            }
        }
    }

    public void restoreActionViewStates(Bundle bundle) {
        MenuItem menuItemFindItem;
        if (bundle == null) {
            return;
        }
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(getActionViewStatesKey());
        int size = size();
        for (int i14 = 0; i14 < size; i14++) {
            MenuItem item = getItem(i14);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((s) item.getSubMenu()).restoreActionViewStates(bundle);
            }
        }
        int i15 = bundle.getInt(EXPANDED_ACTION_VIEW_ID);
        if (i15 <= 0 || (menuItemFindItem = findItem(i15)) == null) {
            return;
        }
        menuItemFindItem.expandActionView();
    }

    public void restorePresenterStates(Bundle bundle) {
        dispatchRestoreInstanceState(bundle);
    }

    public void saveActionViewStates(Bundle bundle) {
        int size = size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i14 = 0; i14 < size; i14++) {
            MenuItem item = getItem(i14);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt(EXPANDED_ACTION_VIEW_ID, item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((s) item.getSubMenu()).saveActionViewStates(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(getActionViewStatesKey(), sparseArray);
        }
    }

    public void savePresenterStates(Bundle bundle) {
        dispatchSaveInstanceState(bundle);
    }

    public void setCallback(a aVar) {
        this.mCallback = aVar;
    }

    public void setCurrentMenuInfo(ContextMenu.ContextMenuInfo contextMenuInfo) {
        this.mCurrentMenuInfo = contextMenuInfo;
    }

    public h setDefaultShowAsAction(int i14) {
        this.mDefaultShowAsAction = i14;
        return this;
    }

    public void setExclusiveItemChecked(MenuItem menuItem) {
        int groupId = menuItem.getGroupId();
        int size = this.mItems.size();
        stopDispatchingItemsChanged();
        for (int i14 = 0; i14 < size; i14++) {
            j jVar = this.mItems.get(i14);
            if (jVar.f4774b == groupId && (jVar.f4796x & 4) != 0 && jVar.isCheckable()) {
                boolean z14 = jVar == menuItem;
                int i15 = jVar.f4796x;
                int i16 = (z14 ? 2 : 0) | (i15 & (-3));
                jVar.f4796x = i16;
                if (i15 != i16) {
                    jVar.f4786n.onItemsChanged(false);
                }
            }
        }
        startDispatchingItemsChanged();
    }

    @Override // android.view.Menu
    public void setGroupCheckable(int i14, boolean z14, boolean z15) {
        int size = this.mItems.size();
        for (int i15 = 0; i15 < size; i15++) {
            j jVar = this.mItems.get(i15);
            if (jVar.f4774b == i14) {
                jVar.f(z15);
                jVar.setCheckable(z14);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z14) {
        this.mGroupDividerEnabled = z14;
    }

    @Override // android.view.Menu
    public void setGroupEnabled(int i14, boolean z14) {
        int size = this.mItems.size();
        for (int i15 = 0; i15 < size; i15++) {
            j jVar = this.mItems.get(i15);
            if (jVar.f4774b == i14) {
                jVar.setEnabled(z14);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupVisible(int i14, boolean z14) {
        int size = this.mItems.size();
        boolean z15 = false;
        for (int i15 = 0; i15 < size; i15++) {
            j jVar = this.mItems.get(i15);
            if (jVar.f4774b == i14) {
                int i16 = jVar.f4796x;
                int i17 = (i16 & (-9)) | (z14 ? 0 : 8);
                jVar.f4796x = i17;
                if (i16 != i17) {
                    z15 = true;
                }
            }
        }
        if (z15) {
            onItemsChanged(true);
        }
    }

    public h setHeaderIconInt(Drawable drawable) {
        setHeaderInternal(0, null, 0, drawable, null);
        return this;
    }

    public h setHeaderTitleInt(CharSequence charSequence) {
        setHeaderInternal(0, charSequence, 0, null, null);
        return this;
    }

    public h setHeaderViewInt(View view2) {
        setHeaderInternal(0, null, 0, null, view2);
        return this;
    }

    public void setOptionalIconsVisible(boolean z14) {
        this.mOptionalIconsVisible = z14;
    }

    public void setOverrideVisibleItems(boolean z14) {
        this.mOverrideVisibleItems = z14;
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z14) {
        this.mQwertyMode = z14;
        onItemsChanged(false);
    }

    public void setShortcutsVisible(boolean z14) {
        if (this.mShortcutsVisible == z14) {
            return;
        }
        setShortcutsVisibleInner(z14);
        onItemsChanged(false);
    }

    @Override // android.view.Menu
    public int size() {
        return this.mItems.size();
    }

    public void startDispatchingItemsChanged() {
        this.mPreventDispatchingItemsChanged = false;
        if (this.mItemsChangedWhileDispatchPrevented) {
            this.mItemsChangedWhileDispatchPrevented = false;
            onItemsChanged(this.mStructureChangedWhileDispatchPrevented);
        }
    }

    public void stopDispatchingItemsChanged() {
        if (this.mPreventDispatchingItemsChanged) {
            return;
        }
        this.mPreventDispatchingItemsChanged = true;
        this.mItemsChangedWhileDispatchPrevented = false;
        this.mStructureChangedWhileDispatchPrevented = false;
    }

    public h setHeaderIconInt(int i14) {
        setHeaderInternal(0, null, i14, null, null);
        return this;
    }

    public h setHeaderTitleInt(int i14) {
        setHeaderInternal(i14, null, 0, null, null);
        return this;
    }

    @Override // android.view.Menu
    public MenuItem add(CharSequence charSequence) {
        return addInternal(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public MenuItem add(int i14, int i15, int i16, CharSequence charSequence) {
        return addInternal(i14, i15, i16, charSequence);
    }

    @Override // android.view.Menu
    public MenuItem add(int i14, int i15, int i16, int i17) {
        return addInternal(i14, i15, i16, this.mResources.getString(i17));
    }

    public void addMenuPresenter(n nVar) {
        addMenuPresenter(nVar, this.mContext);
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i14) {
        return addSubMenu(0, 0, 0, this.mResources.getString(i14));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i14, int i15, int i16, int i17) {
        return addSubMenu(i14, i15, i16, this.mResources.getString(i17));
    }

    public int findGroupIndex(int i14) {
        return findGroupIndex(i14, 0);
    }

    @Override // android.view.Menu
    public void close() {
        close(true);
    }

    public boolean performItemAction(MenuItem menuItem, int i14) {
        return performItemAction(menuItem, null, i14);
    }
}

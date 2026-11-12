package com.google.android.material.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.n;
import androidx.appcompat.view.menu.o;
import androidx.appcompat.view.menu.s;
import androidx.core.view.g1;
import androidx.core.view.m1;
import androidx.core.view.s0;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.f0;
import com.google.android.material.R;
import java.util.ArrayList;
import java.util.WeakHashMap;
import l7.f;

/* JADX INFO: loaded from: classes14.dex */
public class NavigationMenuPresenter implements n {
    public static final int NO_TEXT_APPEARANCE_SET = 0;
    private static final String STATE_ADAPTER = "android:menu:adapter";
    private static final String STATE_HEADER = "android:menu:header";
    private static final String STATE_HIERARCHY = "android:menu:list";
    NavigationMenuAdapter adapter;
    private n.a callback;
    int dividerInsetEnd;
    int dividerInsetStart;
    boolean hasCustomItemIconSize;
    LinearLayout headerLayout;
    ColorStateList iconTintList;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private int f53209id;
    Drawable itemBackground;
    RippleDrawable itemForeground;
    int itemHorizontalPadding;
    int itemIconPadding;
    int itemIconSize;
    private int itemMaxLines;
    int itemVerticalPadding;
    LayoutInflater layoutInflater;
    h menu;
    private NavigationMenuView menuView;
    int paddingSeparator;
    private int paddingTopDefault;
    ColorStateList subheaderColor;
    int subheaderInsetEnd;
    int subheaderInsetStart;
    ColorStateList textColor;
    int subheaderTextAppearance = 0;
    int textAppearance = 0;
    boolean textAppearanceActiveBoldEnabled = true;
    boolean isBehindStatusBar = true;
    private int overScrollMode = -1;
    final View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.google.android.material.internal.NavigationMenuPresenter.1
        @Override // android.view.View.OnClickListener
        public void onClick(View view2) {
            boolean z14 = true;
            NavigationMenuPresenter.this.setUpdateSuspended(true);
            j itemData = ((NavigationMenuItemView) view2).getItemData();
            NavigationMenuPresenter navigationMenuPresenter = NavigationMenuPresenter.this;
            boolean zPerformItemAction = navigationMenuPresenter.menu.performItemAction(itemData, navigationMenuPresenter, 0);
            if (itemData != null && itemData.isCheckable() && zPerformItemAction) {
                NavigationMenuPresenter.this.adapter.setCheckedItem(itemData);
            } else {
                z14 = false;
            }
            NavigationMenuPresenter.this.setUpdateSuspended(false);
            if (z14) {
                NavigationMenuPresenter.this.updateMenuView(false);
            }
        }
    };

    public static class HeaderViewHolder extends ViewHolder {
        public HeaderViewHolder(View view2) {
            super(view2);
        }
    }

    public class NavigationMenuAdapter extends RecyclerView.h<ViewHolder> {
        private static final String STATE_ACTION_VIEWS = "android:menu:action_views";
        private static final String STATE_CHECKED_ITEM = "android:menu:checked";
        private static final int VIEW_TYPE_HEADER = 3;
        private static final int VIEW_TYPE_NORMAL = 0;
        private static final int VIEW_TYPE_SEPARATOR = 2;
        private static final int VIEW_TYPE_SUBHEADER = 1;
        private j checkedItem;
        private final ArrayList<NavigationMenuItem> items = new ArrayList<>();
        private boolean updateSuspended;

        public NavigationMenuAdapter() {
            prepareMenuItems();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public int adjustItemPositionForA11yDelegate(int i14) {
            int i15 = i14;
            for (int i16 = 0; i16 < i14; i16++) {
                if (NavigationMenuPresenter.this.adapter.getItemViewType(i16) == 2 || NavigationMenuPresenter.this.adapter.getItemViewType(i16) == 3) {
                    i15--;
                }
            }
            return i15;
        }

        private void appendTransparentIconIfMissing(int i14, int i15) {
            while (i14 < i15) {
                ((NavigationMenuTextItem) this.items.get(i14)).needsEmptyIcon = true;
                i14++;
            }
        }

        private void prepareMenuItems() {
            if (this.updateSuspended) {
                return;
            }
            boolean z14 = true;
            this.updateSuspended = true;
            this.items.clear();
            this.items.add(new NavigationMenuHeaderItem());
            int size = NavigationMenuPresenter.this.menu.getVisibleItems().size();
            int i14 = -1;
            int i15 = 0;
            boolean z15 = false;
            int size2 = 0;
            while (i15 < size) {
                j jVar = NavigationMenuPresenter.this.menu.getVisibleItems().get(i15);
                if (jVar.isChecked()) {
                    setCheckedItem(jVar);
                }
                if (jVar.isCheckable()) {
                    jVar.f(false);
                }
                if (jVar.hasSubMenu()) {
                    s sVar = jVar.f4787o;
                    if (sVar.hasVisibleItems()) {
                        if (i15 != 0) {
                            this.items.add(new NavigationMenuSeparatorItem(NavigationMenuPresenter.this.paddingSeparator, 0));
                        }
                        this.items.add(new NavigationMenuTextItem(jVar));
                        int size3 = this.items.size();
                        int size4 = sVar.size();
                        int i16 = 0;
                        boolean z16 = false;
                        while (i16 < size4) {
                            j jVar2 = (j) sVar.getItem(i16);
                            if (jVar2.isVisible()) {
                                if (!z16 && jVar2.getIcon() != null) {
                                    z16 = z14;
                                }
                                if (jVar2.isCheckable()) {
                                    jVar2.f(false);
                                }
                                if (jVar.isChecked()) {
                                    setCheckedItem(jVar);
                                }
                                this.items.add(new NavigationMenuTextItem(jVar2));
                            }
                            i16++;
                            z14 = true;
                        }
                        if (z16) {
                            appendTransparentIconIfMissing(size3, this.items.size());
                        }
                    }
                } else {
                    int i17 = jVar.f4774b;
                    if (i17 != i14) {
                        size2 = this.items.size();
                        z15 = jVar.getIcon() != null;
                        if (i15 != 0) {
                            size2++;
                            ArrayList<NavigationMenuItem> arrayList = this.items;
                            int i18 = NavigationMenuPresenter.this.paddingSeparator;
                            arrayList.add(new NavigationMenuSeparatorItem(i18, i18));
                        }
                    } else if (!z15 && jVar.getIcon() != null) {
                        appendTransparentIconIfMissing(size2, this.items.size());
                        z15 = true;
                    }
                    NavigationMenuTextItem navigationMenuTextItem = new NavigationMenuTextItem(jVar);
                    navigationMenuTextItem.needsEmptyIcon = z15;
                    this.items.add(navigationMenuTextItem);
                    i14 = i17;
                }
                i15++;
                z14 = true;
            }
            this.updateSuspended = false;
        }

        private void setAccessibilityDelegate(View view2, final int i14, final boolean z14) {
            s0.r(view2, new androidx.core.view.a() { // from class: com.google.android.material.internal.NavigationMenuPresenter.NavigationMenuAdapter.1
                @Override // androidx.core.view.a
                public void onInitializeAccessibilityNodeInfo(View view3, f fVar) {
                    super.onInitializeAccessibilityNodeInfo(view3, fVar);
                    fVar.q(f.h.a(NavigationMenuAdapter.this.adjustItemPositionForA11yDelegate(i14), 1, 1, 1, z14, view3.isSelected()));
                }
            });
        }

        public Bundle createInstanceState() {
            Bundle bundle = new Bundle();
            j jVar = this.checkedItem;
            if (jVar != null) {
                bundle.putInt(STATE_CHECKED_ITEM, jVar.f4773a);
            }
            SparseArray<? extends Parcelable> sparseArray = new SparseArray<>();
            int size = this.items.size();
            for (int i14 = 0; i14 < size; i14++) {
                NavigationMenuItem navigationMenuItem = this.items.get(i14);
                if (navigationMenuItem instanceof NavigationMenuTextItem) {
                    j menuItem = ((NavigationMenuTextItem) navigationMenuItem).getMenuItem();
                    View actionView = menuItem != null ? menuItem.getActionView() : null;
                    if (actionView != null) {
                        ParcelableSparseArray parcelableSparseArray = new ParcelableSparseArray();
                        actionView.saveHierarchyState(parcelableSparseArray);
                        sparseArray.put(menuItem.f4773a, parcelableSparseArray);
                    }
                }
            }
            bundle.putSparseParcelableArray(STATE_ACTION_VIEWS, sparseArray);
            return bundle;
        }

        public j getCheckedItem() {
            return this.checkedItem;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public int getItemCount() {
            return this.items.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public long getItemId(int i14) {
            return i14;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public int getItemViewType(int i14) {
            NavigationMenuItem navigationMenuItem = this.items.get(i14);
            if (navigationMenuItem instanceof NavigationMenuSeparatorItem) {
                return 2;
            }
            if (navigationMenuItem instanceof NavigationMenuHeaderItem) {
                return 3;
            }
            if (navigationMenuItem instanceof NavigationMenuTextItem) {
                return ((NavigationMenuTextItem) navigationMenuItem).getMenuItem().hasSubMenu() ? 1 : 0;
            }
            kg.f.n("Unknown item type.");
            return 0;
        }

        public int getRowCount() {
            int i14 = 0;
            for (int i15 = 0; i15 < NavigationMenuPresenter.this.adapter.getItemCount(); i15++) {
                int itemViewType = NavigationMenuPresenter.this.adapter.getItemViewType(i15);
                if (itemViewType == 0 || itemViewType == 1) {
                    i14++;
                }
            }
            return i14;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public void onBindViewHolder(ViewHolder viewHolder, int i14) {
            int itemViewType = getItemViewType(i14);
            if (itemViewType != 0) {
                if (itemViewType != 1) {
                    if (itemViewType != 2) {
                        return;
                    }
                    NavigationMenuSeparatorItem navigationMenuSeparatorItem = (NavigationMenuSeparatorItem) this.items.get(i14);
                    viewHolder.itemView.setPadding(NavigationMenuPresenter.this.dividerInsetStart, navigationMenuSeparatorItem.getPaddingTop(), NavigationMenuPresenter.this.dividerInsetEnd, navigationMenuSeparatorItem.getPaddingBottom());
                    return;
                }
                TextView textView = (TextView) viewHolder.itemView;
                textView.setText(((NavigationMenuTextItem) this.items.get(i14)).getMenuItem().f4777e);
                textView.setTextAppearance(NavigationMenuPresenter.this.subheaderTextAppearance);
                textView.setPadding(NavigationMenuPresenter.this.subheaderInsetStart, textView.getPaddingTop(), NavigationMenuPresenter.this.subheaderInsetEnd, textView.getPaddingBottom());
                ColorStateList colorStateList = NavigationMenuPresenter.this.subheaderColor;
                if (colorStateList != null) {
                    textView.setTextColor(colorStateList);
                }
                setAccessibilityDelegate(textView, i14, true);
                return;
            }
            NavigationMenuItemView navigationMenuItemView = (NavigationMenuItemView) viewHolder.itemView;
            navigationMenuItemView.setIconTintList(NavigationMenuPresenter.this.iconTintList);
            navigationMenuItemView.setTextAppearance(NavigationMenuPresenter.this.textAppearance);
            ColorStateList colorStateList2 = NavigationMenuPresenter.this.textColor;
            if (colorStateList2 != null) {
                navigationMenuItemView.setTextColor(colorStateList2);
            }
            Drawable drawable = NavigationMenuPresenter.this.itemBackground;
            Drawable drawableNewDrawable = drawable != null ? drawable.getConstantState().newDrawable() : null;
            WeakHashMap<View, g1> weakHashMap = s0.f6563a;
            navigationMenuItemView.setBackground(drawableNewDrawable);
            RippleDrawable rippleDrawable = NavigationMenuPresenter.this.itemForeground;
            if (rippleDrawable != null) {
                navigationMenuItemView.setForeground(rippleDrawable.getConstantState().newDrawable());
            }
            NavigationMenuTextItem navigationMenuTextItem = (NavigationMenuTextItem) this.items.get(i14);
            navigationMenuItemView.setNeedsEmptyIcon(navigationMenuTextItem.needsEmptyIcon);
            NavigationMenuPresenter navigationMenuPresenter = NavigationMenuPresenter.this;
            int i15 = navigationMenuPresenter.itemHorizontalPadding;
            int i16 = navigationMenuPresenter.itemVerticalPadding;
            navigationMenuItemView.setPadding(i15, i16, i15, i16);
            navigationMenuItemView.setIconPadding(NavigationMenuPresenter.this.itemIconPadding);
            NavigationMenuPresenter navigationMenuPresenter2 = NavigationMenuPresenter.this;
            if (navigationMenuPresenter2.hasCustomItemIconSize) {
                navigationMenuItemView.setIconSize(navigationMenuPresenter2.itemIconSize);
            }
            navigationMenuItemView.setMaxLines(NavigationMenuPresenter.this.itemMaxLines);
            navigationMenuItemView.initialize(navigationMenuTextItem.getMenuItem(), NavigationMenuPresenter.this.textAppearanceActiveBoldEnabled);
            setAccessibilityDelegate(navigationMenuItemView, i14, false);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i14) {
            if (i14 == 0) {
                NavigationMenuPresenter navigationMenuPresenter = NavigationMenuPresenter.this;
                return new NormalViewHolder(navigationMenuPresenter.layoutInflater, viewGroup, navigationMenuPresenter.onClickListener);
            }
            if (i14 == 1) {
                return new SubheaderViewHolder(NavigationMenuPresenter.this.layoutInflater, viewGroup);
            }
            if (i14 == 2) {
                return new SeparatorViewHolder(NavigationMenuPresenter.this.layoutInflater, viewGroup);
            }
            if (i14 != 3) {
                return null;
            }
            return new HeaderViewHolder(NavigationMenuPresenter.this.headerLayout);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public void onViewRecycled(ViewHolder viewHolder) {
            if (viewHolder instanceof NormalViewHolder) {
                ((NavigationMenuItemView) viewHolder.itemView).recycle();
            }
        }

        public void restoreInstanceState(Bundle bundle) {
            j menuItem;
            View actionView;
            ParcelableSparseArray parcelableSparseArray;
            j menuItem2;
            int i14 = bundle.getInt(STATE_CHECKED_ITEM, 0);
            if (i14 != 0) {
                this.updateSuspended = true;
                int size = this.items.size();
                for (int i15 = 0; i15 < size; i15++) {
                    NavigationMenuItem navigationMenuItem = this.items.get(i15);
                    if ((navigationMenuItem instanceof NavigationMenuTextItem) && (menuItem2 = ((NavigationMenuTextItem) navigationMenuItem).getMenuItem()) != null && menuItem2.f4773a == i14) {
                        setCheckedItem(menuItem2);
                        break;
                    }
                }
                this.updateSuspended = false;
                prepareMenuItems();
            }
            SparseArray sparseParcelableArray = bundle.getSparseParcelableArray(STATE_ACTION_VIEWS);
            if (sparseParcelableArray != null) {
                int size2 = this.items.size();
                for (int i16 = 0; i16 < size2; i16++) {
                    NavigationMenuItem navigationMenuItem2 = this.items.get(i16);
                    if ((navigationMenuItem2 instanceof NavigationMenuTextItem) && (menuItem = ((NavigationMenuTextItem) navigationMenuItem2).getMenuItem()) != null && (actionView = menuItem.getActionView()) != null && (parcelableSparseArray = (ParcelableSparseArray) sparseParcelableArray.get(menuItem.f4773a)) != null) {
                        actionView.restoreHierarchyState(parcelableSparseArray);
                    }
                }
            }
        }

        public void setCheckedItem(j jVar) {
            if (this.checkedItem == jVar || !jVar.isCheckable()) {
                return;
            }
            j jVar2 = this.checkedItem;
            if (jVar2 != null) {
                jVar2.setChecked(false);
            }
            this.checkedItem = jVar;
            jVar.setChecked(true);
        }

        public void setUpdateSuspended(boolean z14) {
            this.updateSuspended = z14;
        }

        public void update() {
            prepareMenuItems();
            notifyDataSetChanged();
        }
    }

    public static class NavigationMenuHeaderItem implements NavigationMenuItem {
    }

    public interface NavigationMenuItem {
    }

    public static class NavigationMenuSeparatorItem implements NavigationMenuItem {
        private final int paddingBottom;
        private final int paddingTop;

        public NavigationMenuSeparatorItem(int i14, int i15) {
            this.paddingTop = i14;
            this.paddingBottom = i15;
        }

        public int getPaddingBottom() {
            return this.paddingBottom;
        }

        public int getPaddingTop() {
            return this.paddingTop;
        }
    }

    public static class NavigationMenuTextItem implements NavigationMenuItem {
        private final j menuItem;
        boolean needsEmptyIcon;

        public NavigationMenuTextItem(j jVar) {
            this.menuItem = jVar;
        }

        public j getMenuItem() {
            return this.menuItem;
        }
    }

    public class NavigationMenuViewAccessibilityDelegate extends f0 {
        public NavigationMenuViewAccessibilityDelegate(RecyclerView recyclerView) {
            super(recyclerView);
        }

        @Override // androidx.recyclerview.widget.f0, androidx.core.view.a
        public void onInitializeAccessibilityNodeInfo(View view2, f fVar) {
            super.onInitializeAccessibilityNodeInfo(view2, fVar);
            fVar.p(new f.g(AccessibilityNodeInfo.CollectionInfo.obtain(NavigationMenuPresenter.this.adapter.getRowCount(), 1, false)));
        }
    }

    public static class NormalViewHolder extends ViewHolder {
        public NormalViewHolder(LayoutInflater layoutInflater, ViewGroup viewGroup, View.OnClickListener onClickListener) {
            super(layoutInflater.inflate(R.layout.design_navigation_item, viewGroup, false));
            this.itemView.setOnClickListener(onClickListener);
        }
    }

    public static class SeparatorViewHolder extends ViewHolder {
        public SeparatorViewHolder(LayoutInflater layoutInflater, ViewGroup viewGroup) {
            super(layoutInflater.inflate(R.layout.design_navigation_item_separator, viewGroup, false));
        }
    }

    public static class SubheaderViewHolder extends ViewHolder {
        public SubheaderViewHolder(LayoutInflater layoutInflater, ViewGroup viewGroup) {
            super(layoutInflater.inflate(R.layout.design_navigation_item_subheader, viewGroup, false));
        }
    }

    public static abstract class ViewHolder extends RecyclerView.f0 {
        public ViewHolder(View view2) {
            super(view2);
        }
    }

    private boolean hasHeader() {
        return getHeaderCount() > 0;
    }

    private void updateTopPadding() {
        int i14 = (hasHeader() || !this.isBehindStatusBar) ? 0 : this.paddingTopDefault;
        NavigationMenuView navigationMenuView = this.menuView;
        navigationMenuView.setPadding(0, i14, 0, navigationMenuView.getPaddingBottom());
    }

    public void addHeaderView(View view2) {
        this.headerLayout.addView(view2);
        NavigationMenuView navigationMenuView = this.menuView;
        navigationMenuView.setPadding(0, 0, 0, navigationMenuView.getPaddingBottom());
    }

    @Override // androidx.appcompat.view.menu.n
    public boolean collapseItemActionView(h hVar, j jVar) {
        return false;
    }

    public void dispatchApplyWindowInsets(m1 m1Var) {
        int iD = m1Var.d();
        if (this.paddingTopDefault != iD) {
            this.paddingTopDefault = iD;
            updateTopPadding();
        }
        NavigationMenuView navigationMenuView = this.menuView;
        navigationMenuView.setPadding(0, navigationMenuView.getPaddingTop(), 0, m1Var.a());
        s0.d(this.headerLayout, m1Var);
    }

    @Override // androidx.appcompat.view.menu.n
    public boolean expandItemActionView(h hVar, j jVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.n
    public boolean flagActionItems() {
        return false;
    }

    public j getCheckedItem() {
        return this.adapter.getCheckedItem();
    }

    public int getDividerInsetEnd() {
        return this.dividerInsetEnd;
    }

    public int getDividerInsetStart() {
        return this.dividerInsetStart;
    }

    public int getHeaderCount() {
        return this.headerLayout.getChildCount();
    }

    public View getHeaderView(int i14) {
        return this.headerLayout.getChildAt(i14);
    }

    @Override // androidx.appcompat.view.menu.n
    public int getId() {
        return this.f53209id;
    }

    public Drawable getItemBackground() {
        return this.itemBackground;
    }

    public int getItemHorizontalPadding() {
        return this.itemHorizontalPadding;
    }

    public int getItemIconPadding() {
        return this.itemIconPadding;
    }

    public int getItemMaxLines() {
        return this.itemMaxLines;
    }

    public ColorStateList getItemTextColor() {
        return this.textColor;
    }

    public ColorStateList getItemTintList() {
        return this.iconTintList;
    }

    public int getItemVerticalPadding() {
        return this.itemVerticalPadding;
    }

    public o getMenuView(ViewGroup viewGroup) {
        if (this.menuView == null) {
            NavigationMenuView navigationMenuView = (NavigationMenuView) this.layoutInflater.inflate(R.layout.design_navigation_menu, viewGroup, false);
            this.menuView = navigationMenuView;
            navigationMenuView.setAccessibilityDelegateCompat(new NavigationMenuViewAccessibilityDelegate(this.menuView));
            if (this.adapter == null) {
                NavigationMenuAdapter navigationMenuAdapter = new NavigationMenuAdapter();
                this.adapter = navigationMenuAdapter;
                navigationMenuAdapter.setHasStableIds(true);
            }
            int i14 = this.overScrollMode;
            if (i14 != -1) {
                this.menuView.setOverScrollMode(i14);
            }
            LinearLayout linearLayout = (LinearLayout) this.layoutInflater.inflate(R.layout.design_navigation_item_header, (ViewGroup) this.menuView, false);
            this.headerLayout = linearLayout;
            WeakHashMap<View, g1> weakHashMap = s0.f6563a;
            linearLayout.setImportantForAccessibility(2);
            this.menuView.setAdapter(this.adapter);
        }
        return this.menuView;
    }

    public int getSubheaderInsetEnd() {
        return this.subheaderInsetEnd;
    }

    public int getSubheaderInsetStart() {
        return this.subheaderInsetStart;
    }

    public View inflateHeaderView(int i14) {
        View viewInflate = this.layoutInflater.inflate(i14, (ViewGroup) this.headerLayout, false);
        addHeaderView(viewInflate);
        return viewInflate;
    }

    @Override // androidx.appcompat.view.menu.n
    public void initForMenu(Context context, h hVar) {
        this.layoutInflater = LayoutInflater.from(context);
        this.menu = hVar;
        this.paddingSeparator = context.getResources().getDimensionPixelOffset(R.dimen.design_navigation_separator_vertical_padding);
    }

    public boolean isBehindStatusBar() {
        return this.isBehindStatusBar;
    }

    @Override // androidx.appcompat.view.menu.n
    public void onCloseMenu(h hVar, boolean z14) {
        n.a aVar = this.callback;
        if (aVar != null) {
            aVar.onCloseMenu(hVar, z14);
        }
    }

    @Override // androidx.appcompat.view.menu.n
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(STATE_HIERARCHY);
            if (sparseParcelableArray != null) {
                this.menuView.restoreHierarchyState(sparseParcelableArray);
            }
            Bundle bundle2 = bundle.getBundle(STATE_ADAPTER);
            if (bundle2 != null) {
                this.adapter.restoreInstanceState(bundle2);
            }
            SparseArray<Parcelable> sparseParcelableArray2 = bundle.getSparseParcelableArray(STATE_HEADER);
            if (sparseParcelableArray2 != null) {
                this.headerLayout.restoreHierarchyState(sparseParcelableArray2);
            }
        }
    }

    @Override // androidx.appcompat.view.menu.n
    public Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        if (this.menuView != null) {
            SparseArray<Parcelable> sparseArray = new SparseArray<>();
            this.menuView.saveHierarchyState(sparseArray);
            bundle.putSparseParcelableArray(STATE_HIERARCHY, sparseArray);
        }
        NavigationMenuAdapter navigationMenuAdapter = this.adapter;
        if (navigationMenuAdapter != null) {
            bundle.putBundle(STATE_ADAPTER, navigationMenuAdapter.createInstanceState());
        }
        if (this.headerLayout != null) {
            SparseArray<Parcelable> sparseArray2 = new SparseArray<>();
            this.headerLayout.saveHierarchyState(sparseArray2);
            bundle.putSparseParcelableArray(STATE_HEADER, sparseArray2);
        }
        return bundle;
    }

    @Override // androidx.appcompat.view.menu.n
    public boolean onSubMenuSelected(s sVar) {
        return false;
    }

    public void removeHeaderView(View view2) {
        this.headerLayout.removeView(view2);
        if (hasHeader()) {
            return;
        }
        NavigationMenuView navigationMenuView = this.menuView;
        navigationMenuView.setPadding(0, this.paddingTopDefault, 0, navigationMenuView.getPaddingBottom());
    }

    public void setBehindStatusBar(boolean z14) {
        if (this.isBehindStatusBar != z14) {
            this.isBehindStatusBar = z14;
            updateTopPadding();
        }
    }

    @Override // androidx.appcompat.view.menu.n
    public void setCallback(n.a aVar) {
        this.callback = aVar;
    }

    public void setCheckedItem(j jVar) {
        this.adapter.setCheckedItem(jVar);
    }

    public void setDividerInsetEnd(int i14) {
        this.dividerInsetEnd = i14;
        updateMenuView(false);
    }

    public void setDividerInsetStart(int i14) {
        this.dividerInsetStart = i14;
        updateMenuView(false);
    }

    public void setId(int i14) {
        this.f53209id = i14;
    }

    public void setItemBackground(Drawable drawable) {
        this.itemBackground = drawable;
        updateMenuView(false);
    }

    public void setItemForeground(RippleDrawable rippleDrawable) {
        this.itemForeground = rippleDrawable;
        updateMenuView(false);
    }

    public void setItemHorizontalPadding(int i14) {
        this.itemHorizontalPadding = i14;
        updateMenuView(false);
    }

    public void setItemIconPadding(int i14) {
        this.itemIconPadding = i14;
        updateMenuView(false);
    }

    public void setItemIconSize(int i14) {
        if (this.itemIconSize != i14) {
            this.itemIconSize = i14;
            this.hasCustomItemIconSize = true;
            updateMenuView(false);
        }
    }

    public void setItemIconTintList(ColorStateList colorStateList) {
        this.iconTintList = colorStateList;
        updateMenuView(false);
    }

    public void setItemMaxLines(int i14) {
        this.itemMaxLines = i14;
        updateMenuView(false);
    }

    public void setItemTextAppearance(int i14) {
        this.textAppearance = i14;
        updateMenuView(false);
    }

    public void setItemTextAppearanceActiveBoldEnabled(boolean z14) {
        this.textAppearanceActiveBoldEnabled = z14;
        updateMenuView(false);
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.textColor = colorStateList;
        updateMenuView(false);
    }

    public void setItemVerticalPadding(int i14) {
        this.itemVerticalPadding = i14;
        updateMenuView(false);
    }

    public void setOverScrollMode(int i14) {
        this.overScrollMode = i14;
        NavigationMenuView navigationMenuView = this.menuView;
        if (navigationMenuView != null) {
            navigationMenuView.setOverScrollMode(i14);
        }
    }

    public void setSubheaderColor(ColorStateList colorStateList) {
        this.subheaderColor = colorStateList;
        updateMenuView(false);
    }

    public void setSubheaderInsetEnd(int i14) {
        this.subheaderInsetEnd = i14;
        updateMenuView(false);
    }

    public void setSubheaderInsetStart(int i14) {
        this.subheaderInsetStart = i14;
        updateMenuView(false);
    }

    public void setSubheaderTextAppearance(int i14) {
        this.subheaderTextAppearance = i14;
        updateMenuView(false);
    }

    public void setUpdateSuspended(boolean z14) {
        NavigationMenuAdapter navigationMenuAdapter = this.adapter;
        if (navigationMenuAdapter != null) {
            navigationMenuAdapter.setUpdateSuspended(z14);
        }
    }

    @Override // androidx.appcompat.view.menu.n
    public void updateMenuView(boolean z14) {
        NavigationMenuAdapter navigationMenuAdapter = this.adapter;
        if (navigationMenuAdapter != null) {
            navigationMenuAdapter.update();
        }
    }
}

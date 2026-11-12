package androidx.appcompat.view.menu;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import com.garmin.android.apps.connectmobile.R;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class f implements n, AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f4754a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public LayoutInflater f4755b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public h f4756c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ExpandedMenuView f4757d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f4758e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f4759f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public n.a f4760g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public a f4761h;

    public class a extends BaseAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f4762a = -1;

        public a() {
            a();
        }

        public final void a() {
            f fVar = f.this;
            j expandedItem = fVar.f4756c.getExpandedItem();
            if (expandedItem != null) {
                ArrayList<j> nonActionItems = fVar.f4756c.getNonActionItems();
                int size = nonActionItems.size();
                for (int i14 = 0; i14 < size; i14++) {
                    if (nonActionItems.get(i14) == expandedItem) {
                        this.f4762a = i14;
                        return;
                    }
                }
            }
            this.f4762a = -1;
        }

        @Override // android.widget.Adapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final j getItem(int i14) {
            f fVar = f.this;
            ArrayList<j> nonActionItems = fVar.f4756c.getNonActionItems();
            fVar.getClass();
            int i15 = this.f4762a;
            if (i15 >= 0 && i14 >= i15) {
                i14++;
            }
            return nonActionItems.get(i14);
        }

        @Override // android.widget.Adapter
        public final int getCount() {
            f fVar = f.this;
            int size = fVar.f4756c.getNonActionItems().size();
            fVar.getClass();
            return this.f4762a < 0 ? size : size - 1;
        }

        @Override // android.widget.Adapter
        public final long getItemId(int i14) {
            return i14;
        }

        @Override // android.widget.Adapter
        public final View getView(int i14, View view2, ViewGroup viewGroup) {
            if (view2 == null) {
                f fVar = f.this;
                view2 = fVar.f4755b.inflate(fVar.f4759f, viewGroup, false);
            }
            ((o.a) view2).initialize(getItem(i14), 0);
            return view2;
        }

        @Override // android.widget.BaseAdapter
        public final void notifyDataSetChanged() {
            a();
            super.notifyDataSetChanged();
        }
    }

    public f(Context context, int i14) {
        this(i14, 0);
        this.f4754a = context;
        this.f4755b = LayoutInflater.from(context);
    }

    @Override // androidx.appcompat.view.menu.n
    public final boolean collapseItemActionView(h hVar, j jVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.n
    public final boolean expandItemActionView(h hVar, j jVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.n
    public final boolean flagActionItems() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.n
    public final int getId() {
        return 0;
    }

    @Override // androidx.appcompat.view.menu.n
    public final void initForMenu(Context context, h hVar) {
        int i14 = this.f4758e;
        if (i14 != 0) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i14);
            this.f4754a = contextThemeWrapper;
            this.f4755b = LayoutInflater.from(contextThemeWrapper);
        } else if (this.f4754a != null) {
            this.f4754a = context;
            if (this.f4755b == null) {
                this.f4755b = LayoutInflater.from(context);
            }
        }
        this.f4756c = hVar;
        a aVar = this.f4761h;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.n
    public final void onCloseMenu(h hVar, boolean z14) {
        n.a aVar = this.f4760g;
        if (aVar != null) {
            aVar.onCloseMenu(hVar, z14);
        }
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView<?> adapterView, View view2, int i14, long j8) {
        this.f4756c.performItemAction(this.f4761h.getItem(i14), this, 0);
    }

    @Override // androidx.appcompat.view.menu.n
    public final void onRestoreInstanceState(Parcelable parcelable) {
        SparseArray<Parcelable> sparseParcelableArray = ((Bundle) parcelable).getSparseParcelableArray("android:menu:list");
        if (sparseParcelableArray != null) {
            this.f4757d.restoreHierarchyState(sparseParcelableArray);
        }
    }

    @Override // androidx.appcompat.view.menu.n
    public final Parcelable onSaveInstanceState() {
        if (this.f4757d == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        ExpandedMenuView expandedMenuView = this.f4757d;
        if (expandedMenuView != null) {
            expandedMenuView.saveHierarchyState(sparseArray);
        }
        bundle.putSparseParcelableArray("android:menu:list", sparseArray);
        return bundle;
    }

    @Override // androidx.appcompat.view.menu.n
    public final boolean onSubMenuSelected(s sVar) {
        if (!sVar.hasVisibleItems()) {
            return false;
        }
        i iVar = new i(sVar);
        h hVar = iVar.f4770a;
        androidx.appcompat.app.e.a aVar = new androidx.appcompat.app.e.a(hVar.getContext());
        f fVar = new f(aVar.getContext(), R.layout.abc_list_menu_item_layout);
        iVar.f4772c = fVar;
        fVar.f4760g = iVar;
        hVar.addMenuPresenter(fVar);
        f fVar2 = iVar.f4772c;
        if (fVar2.f4761h == null) {
            fVar2.f4761h = fVar2.new a();
        }
        aVar.setAdapter(fVar2.f4761h, iVar);
        View headerView = hVar.getHeaderView();
        if (headerView != null) {
            aVar.setCustomTitle(headerView);
        } else {
            aVar.setIcon(hVar.getHeaderIcon()).setTitle(hVar.getHeaderTitle());
        }
        aVar.setOnKeyListener(iVar);
        androidx.appcompat.app.e eVarCreate = aVar.create();
        iVar.f4771b = eVarCreate;
        eVarCreate.setOnDismissListener(iVar);
        WindowManager.LayoutParams attributes = iVar.f4771b.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        iVar.f4771b.show();
        n.a aVar2 = this.f4760g;
        if (aVar2 == null) {
            return true;
        }
        aVar2.a(sVar);
        return true;
    }

    @Override // androidx.appcompat.view.menu.n
    public final void setCallback(n.a aVar) {
        throw null;
    }

    @Override // androidx.appcompat.view.menu.n
    public final void updateMenuView(boolean z14) {
        a aVar = this.f4761h;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    public f(int i14, int i15) {
        this.f4759f = i14;
        this.f4758e = i15;
    }
}

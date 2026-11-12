package com.google.android.material.navigation;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.n;
import androidx.appcompat.view.menu.o;
import androidx.appcompat.view.menu.s;
import com.google.android.material.badge.BadgeUtils;
import com.google.android.material.internal.ParcelableSparseArray;

/* JADX INFO: loaded from: classes14.dex */
public class NavigationBarPresenter implements n {

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private int f53215id;
    private h menu;
    private NavigationBarMenuView menuView;
    private boolean updateSuspended = false;

    @Override // androidx.appcompat.view.menu.n
    public boolean collapseItemActionView(h hVar, j jVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.n
    public boolean expandItemActionView(h hVar, j jVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.n
    public boolean flagActionItems() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.n
    public int getId() {
        return this.f53215id;
    }

    public o getMenuView(ViewGroup viewGroup) {
        return this.menuView;
    }

    @Override // androidx.appcompat.view.menu.n
    public void initForMenu(Context context, h hVar) {
        this.menu = hVar;
        this.menuView.initialize(hVar);
    }

    @Override // androidx.appcompat.view.menu.n
    public void onCloseMenu(h hVar, boolean z14) {
    }

    @Override // androidx.appcompat.view.menu.n
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            this.menuView.tryRestoreSelectedItemId(savedState.selectedItemId);
            this.menuView.restoreBadgeDrawables(BadgeUtils.createBadgeDrawablesFromSavedStates(this.menuView.getContext(), savedState.badgeSavedStates));
        }
    }

    @Override // androidx.appcompat.view.menu.n
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState();
        savedState.selectedItemId = this.menuView.getSelectedItemId();
        savedState.badgeSavedStates = BadgeUtils.createParcelableBadgeStates(this.menuView.getBadgeDrawables());
        return savedState;
    }

    @Override // androidx.appcompat.view.menu.n
    public boolean onSubMenuSelected(s sVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.n
    public void setCallback(n.a aVar) {
    }

    public void setId(int i14) {
        this.f53215id = i14;
    }

    public void setMenuView(NavigationBarMenuView navigationBarMenuView) {
        this.menuView = navigationBarMenuView;
    }

    public void setUpdateSuspended(boolean z14) {
        this.updateSuspended = z14;
    }

    @Override // androidx.appcompat.view.menu.n
    public void updateMenuView(boolean z14) {
        if (this.updateSuspended) {
            return;
        }
        NavigationBarMenuView navigationBarMenuView = this.menuView;
        if (z14) {
            navigationBarMenuView.buildMenuView();
        } else {
            navigationBarMenuView.updateMenuView();
        }
    }

    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() { // from class: com.google.android.material.navigation.NavigationBarPresenter.SavedState.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public SavedState[] newArray(int i14) {
                return new SavedState[i14];
            }
        };
        ParcelableSparseArray badgeSavedStates;
        int selectedItemId;

        public SavedState(Parcel parcel) {
            this.selectedItemId = parcel.readInt();
            this.badgeSavedStates = (ParcelableSparseArray) parcel.readParcelable(getClass().getClassLoader());
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i14) {
            parcel.writeInt(this.selectedItemId);
            parcel.writeParcelable(this.badgeSavedStates, 0);
        }

        public SavedState() {
        }
    }
}

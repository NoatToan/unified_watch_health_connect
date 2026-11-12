package com.google.android.material.navigation;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.i;
import androidx.appcompat.view.menu.k;
import com.google.android.material.badge.b;
import com.google.android.material.internal.ParcelableSparseArray;

/* JADX INFO: loaded from: classes5.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class NavigationBarPresenter implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public e f8762a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public NavigationBarMenuView f8763b;
    public boolean c = false;
    public int d;

    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f8764a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public ParcelableSparseArray f8765b;

        public class a implements Parcelable.Creator<SavedState> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState() {
        }

        public SavedState(Parcel parcel) {
            this.f8764a = parcel.readInt();
            this.f8765b = (ParcelableSparseArray) parcel.readParcelable(getClass().getClassLoader());
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f8764a);
            parcel.writeParcelable(this.f8765b, 0);
        }
    }

    public void a(int i) {
        this.d = i;
    }

    @Override // androidx.appcompat.view.menu.i
    public void b(e eVar, boolean z) {
    }

    @Override // androidx.appcompat.view.menu.i
    public boolean c(e eVar, g gVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.i
    public boolean d(e eVar, g gVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.i
    public void e(Context context, e eVar) {
        this.f8762a = eVar;
        this.f8763b.b(eVar);
    }

    @Override // androidx.appcompat.view.menu.i
    public boolean flagActionItems() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.i
    public boolean g(k kVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.i
    public int getId() {
        return this.d;
    }

    public void h(NavigationBarMenuView navigationBarMenuView) {
        this.f8763b = navigationBarMenuView;
    }

    public void i(boolean z) {
        this.c = z;
    }

    @Override // androidx.appcompat.view.menu.i
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            this.f8763b.l(savedState.f8764a);
            this.f8763b.k(b.b(this.f8763b.getContext(), savedState.f8765b));
        }
    }

    @Override // androidx.appcompat.view.menu.i
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState();
        savedState.f8764a = this.f8763b.getSelectedItemId();
        savedState.f8765b = b.c(this.f8763b.getBadgeDrawables());
        return savedState;
    }

    @Override // androidx.appcompat.view.menu.i
    public void updateMenuView(boolean z) {
        if (this.c) {
            return;
        }
        if (z) {
            this.f8763b.d();
        } else {
            this.f8763b.m();
        }
    }
}

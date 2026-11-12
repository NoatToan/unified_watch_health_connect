package androidx.navigation;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.eig;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
final class NavBackStackEntryState implements Parcelable {
    public static final Parcelable.Creator<NavBackStackEntryState> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UUID f2650a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f2651b;
    public final Bundle c;
    public final Bundle d;

    public class a implements Parcelable.Creator<NavBackStackEntryState> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public NavBackStackEntryState createFromParcel(Parcel parcel) {
            return new NavBackStackEntryState(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public NavBackStackEntryState[] newArray(int i) {
            return new NavBackStackEntryState[i];
        }
    }

    public NavBackStackEntryState(eig eigVar) {
        this.f2650a = eigVar.f;
        this.f2651b = eigVar.b().m();
        this.c = eigVar.a();
        Bundle bundle = new Bundle();
        this.d = bundle;
        eigVar.g(bundle);
    }

    public Bundle a() {
        return this.c;
    }

    public int c() {
        return this.f2651b;
    }

    public Bundle d() {
        return this.d;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public UUID e() {
        return this.f2650a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f2650a.toString());
        parcel.writeInt(this.f2651b);
        parcel.writeBundle(this.c);
        parcel.writeBundle(this.d);
    }

    public NavBackStackEntryState(Parcel parcel) {
        this.f2650a = UUID.fromString(parcel.readString());
        this.f2651b = parcel.readInt();
        this.c = parcel.readBundle(NavBackStackEntryState.class.getClassLoader());
        this.d = parcel.readBundle(NavBackStackEntryState.class.getClassLoader());
    }
}

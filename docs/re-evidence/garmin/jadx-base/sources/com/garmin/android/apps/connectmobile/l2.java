package com.garmin.android.apps.connectmobile;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import ca0.d4;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\tB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\b¨\u0006\n"}, d2 = {"Lcom/garmin/android/apps/connectmobile/l2;", "Landroid/os/Parcelable;", "", "bundleId", "<init>", "(I)V", "Landroid/os/Bundle;", "bundle", "(ILandroid/os/Bundle;)V", "a", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class l2 implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f37137a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f37135b = new a(null);
    public static final Parcelable.Creator<l2> CREATOR = new b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final o13.t f37136c = o13.m.b(new d4(24));

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<l2> {
        @Override // android.os.Parcelable.Creator
        public final l2 createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new l2(parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final l2[] newArray(int i14) {
            return new l2[i14];
        }
    }

    public l2(int i14) {
        this.f37137a = i14;
        o13.m.b(new d4(23));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l2) && this.f37137a == ((l2) obj).f37137a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f37137a);
    }

    public final String toString() {
        return v.e0.f(this.f37137a, "LargeBundle(bundleId=", ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeInt(this.f37137a);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/l2$a;", "", "<init>", "()V", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static Bundle a(Intent intent) {
            return b().g(intent);
        }

        public static n2 b() {
            return (n2) l2.f37136c.getValue();
        }

        public static void c(Fragment fragment, Bundle bundle) {
            Parcelable parcelable;
            bundle.getClass();
            if (!fragment.isStateSaved()) {
                l2 l2Var = new l2(b().h(bundle), bundle);
                Bundle bundle2 = new Bundle();
                bundle2.putParcelable("GCM_extra_large_bundle", l2Var);
                fragment.setArguments(bundle2);
                return;
            }
            Bundle arguments = fragment.getArguments();
            if (arguments != null) {
                if (Build.VERSION.SDK_INT >= 33) {
                    parcelable = (Parcelable) arguments.getParcelable("GCM_extra_large_bundle", l2.class);
                } else {
                    Parcelable parcelable2 = arguments.getParcelable("GCM_extra_large_bundle");
                    if (!(parcelable2 instanceof l2)) {
                        parcelable2 = null;
                    }
                    parcelable = (l2) parcelable2;
                }
                l2 l2Var2 = (l2) parcelable;
                if (l2Var2 == null) {
                    return;
                }
                b().f(l2Var2.f37137a, bundle);
            }
        }

        private a() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public l2(int i14, Bundle bundle) {
        this(i14);
        bundle.getClass();
    }
}

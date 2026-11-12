package com.garmin.android.apps.connectmobile.performance.picker;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kg.f;
import lc.u0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
public interface b<T extends Parcelable> extends Parcelable {

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000*\b\b\u0001\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00010\u0003B\u000f\u0012\u0006\u0010\u0004\u001a\u00028\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/performance/picker/b$a;", "Landroid/os/Parcelable;", "T", "Lcom/garmin/android/apps/connectmobile/performance/picker/b;", "data", "<init>", "(Landroid/os/Parcelable;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a<T extends Parcelable> implements b<T> {
        public static final Parcelable.Creator<a<?>> CREATOR = new C0741a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final T f39995a;

        /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.performance.picker.b$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class C0741a implements Parcelable.Creator<a<?>> {
            @Override // android.os.Parcelable.Creator
            public final a<?> createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new a<>(parcel.readParcelable(a.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final a<?>[] newArray(int i14) {
                return new a[i14];
            }
        }

        public a(T t7) {
            t7.getClass();
            this.f39995a = t7;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i14) {
            parcel.getClass();
            parcel.writeParcelable(this.f39995a, i14);
        }
    }

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.performance.picker.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\b\u0007\u0018\u0000*\b\b\u0001\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00010\u0003B\u001d\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/garmin/android/apps/connectmobile/performance/picker/b$b;", "Landroid/os/Parcelable;", "T", "Lcom/garmin/android/apps/connectmobile/performance/picker/b;", "", "name", "", "data", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C0742b<T extends Parcelable> implements b<T> {
        public static final Parcelable.Creator<C0742b<?>> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f39996a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List<T> f39997b;

        /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.performance.picker.b$b$a */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<C0742b<?>> {
            @Override // android.os.Parcelable.Creator
            public final C0742b<?> createFromParcel(Parcel parcel) {
                parcel.getClass();
                String string = parcel.readString();
                int i14 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i14);
                int iD = 0;
                while (iD != i14) {
                    iD = u0.d(C0742b.class, parcel, arrayList, iD, 1);
                }
                return new C0742b<>(string, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final C0742b<?>[] newArray(int i14) {
                return new C0742b[i14];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public C0742b(String str, List<? extends T> list) {
            str.getClass();
            list.getClass();
            this.f39996a = str;
            this.f39997b = list;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i14) {
            parcel.getClass();
            parcel.writeString(this.f39996a);
            Iterator itE = f.e(this.f39997b, parcel);
            while (itE.hasNext()) {
                parcel.writeParcelable((Parcelable) itE.next(), i14);
            }
        }
    }
}

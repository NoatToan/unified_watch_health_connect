package com.garmin.android.apps.connectmobile.workouts.presentation.edit;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.UUID;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
public interface h extends Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/presentation/edit/h$a;", "Lcom/garmin/android/apps/connectmobile/workouts/presentation/edit/h;", "Ljava/util/UUID;", "nodeUuid", "<init>", "(Ljava/util/UUID;)V", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class a implements h {
        public static final Parcelable.Creator<a> CREATOR = new C0957a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final UUID f48996a;

        /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.workouts.presentation.edit.h$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class C0957a implements Parcelable.Creator<a> {
            @Override // android.os.Parcelable.Creator
            public final a createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new a((UUID) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final a[] newArray(int i14) {
                return new a[i14];
            }
        }

        public a(UUID uuid) {
            uuid.getClass();
            this.f48996a = uuid;
        }

        @Override // com.garmin.android.apps.connectmobile.workouts.presentation.edit.h
        /* JADX INFO: renamed from: b0, reason: from getter */
        public final UUID getF48998a() {
            return this.f48996a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f48996a.equals(((a) obj).f48996a);
        }

        public final int hashCode() {
            return this.f48996a.hashCode();
        }

        public final String toString() {
            return "RepeatEnd(nodeUuid=" + this.f48996a + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i14) {
            parcel.getClass();
            parcel.writeSerializable(this.f48996a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/presentation/edit/h$b;", "Lcom/garmin/android/apps/connectmobile/workouts/presentation/edit/h;", "Ljava/util/UUID;", "nodeUuid", "<init>", "(Ljava/util/UUID;)V", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class b implements h {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final UUID f48997a;

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<b> {
            @Override // android.os.Parcelable.Creator
            public final b createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new b((UUID) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final b[] newArray(int i14) {
                return new b[i14];
            }
        }

        public b(UUID uuid) {
            uuid.getClass();
            this.f48997a = uuid;
        }

        @Override // com.garmin.android.apps.connectmobile.workouts.presentation.edit.h
        /* JADX INFO: renamed from: b0, reason: from getter */
        public final UUID getF48998a() {
            return this.f48997a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.f48997a.equals(((b) obj).f48997a);
        }

        public final int hashCode() {
            return this.f48997a.hashCode();
        }

        public final String toString() {
            return "RepeatStart(nodeUuid=" + this.f48997a + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i14) {
            parcel.getClass();
            parcel.writeSerializable(this.f48997a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/presentation/edit/h$c;", "Lcom/garmin/android/apps/connectmobile/workouts/presentation/edit/h;", "Ljava/util/UUID;", "nodeUuid", "<init>", "(Ljava/util/UUID;)V", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class c implements h {
        public static final Parcelable.Creator<c> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final UUID f48998a;

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<c> {
            @Override // android.os.Parcelable.Creator
            public final c createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new c((UUID) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final c[] newArray(int i14) {
                return new c[i14];
            }
        }

        public c(UUID uuid) {
            uuid.getClass();
            this.f48998a = uuid;
        }

        @Override // com.garmin.android.apps.connectmobile.workouts.presentation.edit.h
        /* JADX INFO: renamed from: b0, reason: from getter */
        public final UUID getF48998a() {
            return this.f48998a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.f48998a.equals(((c) obj).f48998a);
        }

        public final int hashCode() {
            return this.f48998a.hashCode();
        }

        public final String toString() {
            return "SingleStep(nodeUuid=" + this.f48998a + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i14) {
            parcel.getClass();
            parcel.writeSerializable(this.f48998a);
        }
    }

    /* JADX INFO: renamed from: b0 */
    UUID getF48998a();
}

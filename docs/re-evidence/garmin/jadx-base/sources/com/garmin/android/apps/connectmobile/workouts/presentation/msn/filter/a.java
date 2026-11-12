package com.garmin.android.apps.connectmobile.workouts.presentation.msn.filter;

import android.os.Parcel;
import android.os.Parcelable;
import com.nimbusds.jose.jwk.JWKParameterNames;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p13.x;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\u0007\b\t\n\u000bB\u0019\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0001\u0004\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/presentation/msn/filter/a;", "Landroid/os/Parcelable;", "", "valRangeStart", "valRangeEnd", "<init>", "(II)V", "a", JWKParameterNames.RSA_EXPONENT, "c", "d", "b", "Lcom/garmin/android/apps/connectmobile/workouts/presentation/msn/filter/a$b;", "Lcom/garmin/android/apps/connectmobile/workouts/presentation/msn/filter/a$c;", "Lcom/garmin/android/apps/connectmobile/workouts/presentation/msn/filter/a$d;", "Lcom/garmin/android/apps/connectmobile/workouts/presentation/msn/filter/a$e;", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class a implements Parcelable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C0972a f49510c = new C0972a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f49511a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f49512b;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/presentation/msn/filter/a$b;", "Lcom/garmin/android/apps/connectmobile/workouts/presentation/msn/filter/a;", "<init>", "()V", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b extends a {
        public static final Parcelable.Creator<b> CREATOR = new C0973a();

        /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.workouts.presentation.msn.filter.a$b$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class C0973a implements Parcelable.Creator<b> {
            @Override // android.os.Parcelable.Creator
            public final b createFromParcel(Parcel parcel) {
                parcel.getClass();
                parcel.readInt();
                return new b();
            }

            @Override // android.os.Parcelable.Creator
            public final b[] newArray(int i14) {
                return new b[i14];
            }
        }

        public b() {
            super(61, Integer.MAX_VALUE, null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i14) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/presentation/msn/filter/a$c;", "Lcom/garmin/android/apps/connectmobile/workouts/presentation/msn/filter/a;", "<init>", "()V", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c extends a {
        public static final Parcelable.Creator<c> CREATOR = new C0974a();

        /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.workouts.presentation.msn.filter.a$c$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class C0974a implements Parcelable.Creator<c> {
            @Override // android.os.Parcelable.Creator
            public final c createFromParcel(Parcel parcel) {
                parcel.getClass();
                parcel.readInt();
                return new c();
            }

            @Override // android.os.Parcelable.Creator
            public final c[] newArray(int i14) {
                return new c[i14];
            }
        }

        public c() {
            super(20, 40, null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i14) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/presentation/msn/filter/a$d;", "Lcom/garmin/android/apps/connectmobile/workouts/presentation/msn/filter/a;", "<init>", "()V", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class d extends a {
        public static final Parcelable.Creator<d> CREATOR = new C0975a();

        /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.workouts.presentation.msn.filter.a$d$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class C0975a implements Parcelable.Creator<d> {
            @Override // android.os.Parcelable.Creator
            public final d createFromParcel(Parcel parcel) {
                parcel.getClass();
                parcel.readInt();
                return new d();
            }

            @Override // android.os.Parcelable.Creator
            public final d[] newArray(int i14) {
                return new d[i14];
            }
        }

        public d() {
            super(40, 60, null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i14) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/presentation/msn/filter/a$e;", "Lcom/garmin/android/apps/connectmobile/workouts/presentation/msn/filter/a;", "<init>", "()V", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class e extends a {
        public static final Parcelable.Creator<e> CREATOR = new C0976a();

        /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.workouts.presentation.msn.filter.a$e$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class C0976a implements Parcelable.Creator<e> {
            @Override // android.os.Parcelable.Creator
            public final e createFromParcel(Parcel parcel) {
                parcel.getClass();
                parcel.readInt();
                return new e();
            }

            @Override // android.os.Parcelable.Creator
            public final e[] newArray(int i14) {
                return new e[i14];
            }
        }

        public e() {
            super(0, 19, null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i14) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    private a(int i14, int i15) {
        this.f49511a = i14;
        this.f49512b = i15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f49511a == aVar.f49511a && this.f49512b == aVar.f49512b;
    }

    public final int hashCode() {
        return (this.f49511a * 31) + this.f49512b;
    }

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.workouts.presentation.msn.filter.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0006¨\u0006\u000e"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/presentation/msn/filter/a$a;", "", "<init>", "()V", "", "VERY_LOW_INTERVAL_START", "I", "VERY_LOW_INTERVAL_END", "LOW_INTERVAL_START", "LOW_INTERVAL_END", "MEDIUM_INTERVAL_START", "MEDIUM_INTERVAL_END", "HIGH_INTERVAL_START", "HIGH_INTERVAL_END", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C0972a {
        public /* synthetic */ C0972a(j jVar) {
            this();
        }

        public static List a() {
            return x.k(new e(), new c(), new d(), new b());
        }

        private C0972a() {
        }
    }

    public /* synthetic */ a(int i14, int i15, j jVar) {
        this(i14, i15);
    }
}

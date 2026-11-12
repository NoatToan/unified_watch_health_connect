package fr1;

import android.os.Parcel;
import android.os.Parcelable;
import com.garmin.android.apps.connectmobile.segments.model.StravaStatusDTO;
import com.garmin.android.apps.connectmobile.strava.StravaSegmentStatusDTO;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0007B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003B\u0011\b\u0014\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0002\u0010\u0006¨\u0006\b"}, d2 = {"Lfr1/h;", "Landroid/os/Parcelable;", "<init>", "()V", "Landroid/os/Parcel;", "in", "(Landroid/os/Parcel;)V", "b", "data_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class h implements Parcelable {
    public static final Parcelable.Creator<h> CREATOR;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public StravaSegmentStatusDTO f73306a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public StravaStatusDTO f73307b;

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"fr1/h$a", "Landroid/os/Parcelable$Creator;", "Lfr1/h;", "data_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<h> {
        @Override // android.os.Parcelable.Creator
        public final h createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new h(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final h[] newArray(int i14) {
            return new h[i14];
        }
    }

    static {
        new b(null);
        CREATOR = new a();
    }

    public h(Parcel parcel) {
        parcel.getClass();
        this.f73306a = (StravaSegmentStatusDTO) parcel.readParcelable(StravaSegmentStatusDTO.class.getClassLoader());
        this.f73307b = (StravaStatusDTO) parcel.readParcelable(StravaStatusDTO.class.getClassLoader());
    }

    public final boolean b() {
        StravaStatusDTO stravaStatusDTO = this.f73307b;
        if (stravaStatusDTO == null) {
            return false;
        }
        stravaStatusDTO.getClass();
        return stravaStatusDTO.f41330b;
    }

    public final boolean d() {
        StravaStatusDTO stravaStatusDTO = this.f73307b;
        if (stravaStatusDTO == null) {
            return false;
        }
        stravaStatusDTO.getClass();
        return stravaStatusDTO.f41332d;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean f() {
        StravaStatusDTO stravaStatusDTO = this.f73307b;
        if (stravaStatusDTO == null) {
            return false;
        }
        stravaStatusDTO.getClass();
        return stravaStatusDTO.f41331c;
    }

    public final boolean g() {
        return b() && f();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeParcelable(this.f73306a, i14);
        parcel.writeParcelable(this.f73307b, i14);
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lfr1/h$b;", "", "<init>", "()V", "Landroid/os/Parcelable$Creator;", "Lfr1/h;", "CREATOR", "Landroid/os/Parcelable$Creator;", "data_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private b() {
        }
    }

    public h() {
    }
}

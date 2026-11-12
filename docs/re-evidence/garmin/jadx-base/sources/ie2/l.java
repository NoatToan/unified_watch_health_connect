package ie2;

import android.os.Parcel;
import android.os.Parcelable;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B\u0091\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lie2/l;", "Landroid/os/Parcelable;", "", "mapType", "", "liteMode", "Lcom/garmin/android/library/mapsdkadapter/f;", "cameraTarget", "", "cameraZoom", "compassEnabled", "scrollGesturesEnabled", "rotateGesturesEnabled", "zoomControlsEnabled", "zoomGesturesEnabled", "tiltGesturesEnabled", "mapToolbarEnabled", "clusterTypeCount", "<init>", "(IZLcom/garmin/android/library/mapsdkadapter/f;FLjava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;)V", "map-sdk-adapter-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class l implements Parcelable {
    public static final Parcelable.Creator<l> CREATOR = new a();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f93135m = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f93136a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f93137b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public com.garmin.android.library.mapsdkadapter.f f93138c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f93139d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Boolean f93140e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Boolean f93141f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Boolean f93142g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Boolean f93143h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Boolean f93144i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Boolean f93145j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Boolean f93146k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Integer f93147l;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<l> {
        @Override // android.os.Parcelable.Creator
        public final l createFromParcel(Parcel parcel) {
            Parcel parcel2;
            com.garmin.android.library.mapsdkadapter.f fVarCreateFromParcel;
            Boolean boolValueOf;
            Boolean boolValueOf2;
            Boolean boolValueOf3;
            Boolean boolValueOf4;
            Boolean boolValueOf5;
            Boolean boolValueOf6;
            Boolean boolValueOf7;
            parcel.getClass();
            int i14 = parcel.readInt();
            boolean z14 = parcel.readInt() != 0;
            if (parcel.readInt() == 0) {
                parcel2 = parcel;
                fVarCreateFromParcel = null;
            } else {
                parcel2 = parcel;
                fVarCreateFromParcel = com.garmin.android.library.mapsdkadapter.f.CREATOR.createFromParcel(parcel2);
            }
            com.garmin.android.library.mapsdkadapter.f fVar = fVarCreateFromParcel;
            float f14 = parcel2.readFloat();
            if (parcel2.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel2.readInt() != 0);
            }
            if (parcel2.readInt() == 0) {
                boolValueOf2 = null;
            } else {
                boolValueOf2 = Boolean.valueOf(parcel2.readInt() != 0);
            }
            if (parcel2.readInt() == 0) {
                boolValueOf3 = null;
            } else {
                boolValueOf3 = Boolean.valueOf(parcel2.readInt() != 0);
            }
            if (parcel2.readInt() == 0) {
                boolValueOf4 = null;
            } else {
                boolValueOf4 = Boolean.valueOf(parcel2.readInt() != 0);
            }
            if (parcel2.readInt() == 0) {
                boolValueOf5 = null;
            } else {
                boolValueOf5 = Boolean.valueOf(parcel2.readInt() != 0);
            }
            if (parcel2.readInt() == 0) {
                boolValueOf6 = null;
            } else {
                boolValueOf6 = Boolean.valueOf(parcel2.readInt() != 0);
            }
            if (parcel2.readInt() == 0) {
                boolValueOf7 = null;
            } else {
                boolValueOf7 = Boolean.valueOf(parcel2.readInt() != 0);
            }
            return new l(i14, z14, fVar, f14, boolValueOf, boolValueOf2, boolValueOf3, boolValueOf4, boolValueOf5, boolValueOf6, boolValueOf7, parcel2.readInt() != 0 ? Integer.valueOf(parcel2.readInt()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final l[] newArray(int i14) {
            return new l[i14];
        }
    }

    public /* synthetic */ l(int i14, boolean z14, com.garmin.android.library.mapsdkadapter.f fVar, float f14, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Integer num, int i15, p005kotlin.jvm.internal.j jVar) {
        this((i15 & 1) != 0 ? -1 : i14, (i15 & 2) != 0 ? false : z14, (i15 & 4) != 0 ? null : fVar, (i15 & 8) != 0 ? 0.0f : f14, (i15 & 16) != 0 ? null : bool, (i15 & 32) != 0 ? null : bool2, (i15 & 64) != 0 ? null : bool3, (i15 & 128) != 0 ? null : bool4, (i15 & 256) != 0 ? null : bool5, (i15 & 512) != 0 ? null : bool6, (i15 & 1024) != 0 ? null : bool7, (i15 & 2048) != 0 ? null : num);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeInt(this.f93136a);
        parcel.writeInt(this.f93137b ? 1 : 0);
        com.garmin.android.library.mapsdkadapter.f fVar = this.f93138c;
        if (fVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            fVar.writeToParcel(parcel, i14);
        }
        parcel.writeFloat(this.f93139d);
        Boolean bool = this.f93140e;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool);
        }
        Boolean bool2 = this.f93141f;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool2);
        }
        Boolean bool3 = this.f93142g;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool3);
        }
        Boolean bool4 = this.f93143h;
        if (bool4 == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool4);
        }
        Boolean bool5 = this.f93144i;
        if (bool5 == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool5);
        }
        Boolean bool6 = this.f93145j;
        if (bool6 == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool6);
        }
        Boolean bool7 = this.f93146k;
        if (bool7 == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool7);
        }
        Integer num = this.f93147l;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num);
        }
    }

    public l(int i14, boolean z14, com.garmin.android.library.mapsdkadapter.f fVar, float f14, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Integer num) {
        this.f93136a = i14;
        this.f93137b = z14;
        this.f93138c = fVar;
        this.f93139d = f14;
        this.f93140e = bool;
        this.f93141f = bool2;
        this.f93142g = bool3;
        this.f93143h = bool4;
        this.f93144i = bool5;
        this.f93145j = bool6;
        this.f93146k = bool7;
        this.f93147l = num;
    }

    public l() {
        this(0, false, null, 0.0f, null, null, null, null, null, null, null, null, 4095, null);
    }
}

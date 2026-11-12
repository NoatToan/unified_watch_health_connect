package nr;

import android.os.Parcel;
import android.os.Parcelable;
import com.garmin.android.apps.connectmobile.R;
import i3.e5;
import java.util.List;
import p005kotlin.Metadata;
import r1.q2;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u000bB7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lnr/z0;", "Landroid/os/Parcelable;", "", "optionTag", "labelResId", "iconRawResId", "", "selected", "animateSelection", "<init>", "(IIIZZ)V", "a", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class z0 implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f127602a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f127603b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f127604c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f127605d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f127606e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f127601f = new a(null);
    public static final Parcelable.Creator<z0> CREATOR = new b();

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<z0> {
        @Override // android.os.Parcelable.Creator
        public final z0 createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new z0(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final z0[] newArray(int i14) {
            return new z0[i14];
        }
    }

    public /* synthetic */ z0(int i14, int i15, int i16, boolean z14, boolean z15, int i17, p005kotlin.jvm.internal.j jVar) {
        this(i14, i15, i16, (i17 & 8) != 0 ? false : z14, (i17 & 16) != 0 ? false : z15);
    }

    public static z0 b(z0 z0Var, boolean z14, boolean z15, int i14) {
        int i15 = z0Var.f127602a;
        int i16 = z0Var.f127603b;
        int i17 = z0Var.f127604c;
        if ((i14 & 8) != 0) {
            z14 = z0Var.f127605d;
        }
        boolean z16 = z14;
        if ((i14 & 16) != 0) {
            z15 = z0Var.f127606e;
        }
        z0Var.getClass();
        return new z0(i15, i16, i17, z16, z15);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z0)) {
            return false;
        }
        z0 z0Var = (z0) obj;
        return this.f127602a == z0Var.f127602a && this.f127603b == z0Var.f127603b && this.f127604c == z0Var.f127604c && this.f127605d == z0Var.f127605d && this.f127606e == z0Var.f127606e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f127606e) + q6.f.g(q2.d(this.f127604c, q2.d(this.f127603b, Integer.hashCode(this.f127602a) * 31, 31), 31), 31, this.f127605d);
    }

    public final String toString() {
        StringBuilder sbJ = e5.j(this.f127602a, this.f127603b, "WorkoutFeelOptionItem(optionTag=", ", labelResId=", ", iconRawResId=");
        fb1.c.x(sbJ, this.f127604c, ", selected=", this.f127605d, ", animateSelection=");
        return hb.a.k(sbJ, this.f127606e, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeInt(this.f127602a);
        parcel.writeInt(this.f127603b);
        parcel.writeInt(this.f127604c);
        parcel.writeInt(this.f127605d ? 1 : 0);
        parcel.writeInt(this.f127606e ? 1 : 0);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lnr/z0$a;", "", "<init>", "()V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static List a(Integer num) {
            return p13.x.k(new z0(0, R.string.workout_feel_very_weak, R.raw.icon_feel_1_very_weak, num != null && num.intValue() == 0, false, 16, null), new z0(25, R.string.workout_feel_weak, R.raw.icon_feel_2_weak, num != null && num.intValue() == 25, false, 16, null), new z0(50, R.string.workout_feel_normal, R.raw.icon_feel_3_normal, num != null && num.intValue() == 50, false, 16, null), new z0(75, R.string.workout_feel_strong, R.raw.icon_feel_4_strong, num != null && num.intValue() == 75, false, 16, null), new z0(100, R.string.workout_feel_very_strong, R.raw.icon_feel_5_very_strong, num != null && num.intValue() == 100, false, 16, null));
        }

        private a() {
        }
    }

    public z0(int i14, int i15, int i16, boolean z14, boolean z15) {
        this.f127602a = i14;
        this.f127603b = i15;
        this.f127604c = i16;
        this.f127605d = z14;
        this.f127606e = z15;
    }
}

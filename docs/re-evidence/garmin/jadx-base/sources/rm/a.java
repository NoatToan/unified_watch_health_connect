package rm;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import com.garmin.android.apps.connectmobile.activities.newmodel.y;
import com.github.mikephil.chartingv2.data.Entry;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes7.dex */
@SuppressLint({"UseSparseArrays"})
@Deprecated(since = "4.71")
public class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C2905a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ArrayList f153487a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayList f153488b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ArrayList f153489c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ArrayList f153490d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ArrayList f153491e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public HashMap f153492f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Float f153493g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Float f153494h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Float f153495i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Float f153496j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Float f153497k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Float f153498l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Float f153499m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f153500n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public y f153501o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public y f153502p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public y f153503q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public y f153504r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public y f153505t;

    /* JADX INFO: renamed from: rm.a$a, reason: collision with other inner class name */
    public class C2905a implements Parcelable.Creator<a> {
        @Override // android.os.Parcelable.Creator
        public final a createFromParcel(Parcel parcel) {
            return new a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final a[] newArray(int i14) {
            return new a[i14];
        }
    }

    public a(Parcel parcel) {
        Parcelable.Creator<Entry> creator = Entry.CREATOR;
        this.f153487a = parcel.createTypedArrayList(creator);
        this.f153488b = parcel.createTypedArrayList(creator);
        this.f153489c = parcel.createTypedArrayList(creator);
        this.f153490d = parcel.createTypedArrayList(creator);
        this.f153491e = parcel.createStringArrayList();
        this.f153500n = parcel.readString();
        this.f153501o = (y) parcel.readParcelable(y.class.getClassLoader());
        this.f153502p = (y) parcel.readParcelable(y.class.getClassLoader());
        this.f153503q = (y) parcel.readParcelable(y.class.getClassLoader());
        this.f153504r = (y) parcel.readParcelable(y.class.getClassLoader());
        this.f153505t = (y) parcel.readParcelable(y.class.getClassLoader());
        HashMap map = new HashMap();
        this.f153492f = map;
        parcel.readMap(map, HashMap.class.getClassLoader());
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.writeTypedList(this.f153487a);
        parcel.writeTypedList(this.f153488b);
        parcel.writeTypedList(this.f153489c);
        parcel.writeTypedList(this.f153490d);
        parcel.writeStringList(this.f153491e);
        parcel.writeString(this.f153500n);
        parcel.writeParcelable(this.f153501o, i14);
        parcel.writeParcelable(this.f153502p, i14);
        parcel.writeParcelable(this.f153503q, i14);
        parcel.writeParcelable(this.f153504r, i14);
        parcel.writeParcelable(this.f153505t, i14);
        parcel.writeMap(this.f153492f);
    }

    public a() {
    }
}

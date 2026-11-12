package hq;

import android.os.Parcel;
import android.os.Parcelable;
import com.garmin.android.apps.connectmobile.R;
import com.google.firebase.perf.util.Constants;
import java.util.Locale;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0002\n\u000bB'\b\u0004\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\t\u0082\u0001\u0002\f\r¨\u0006\u000e"}, d2 = {"Lhq/h;", "Landroid/os/Parcelable;", "", "", "translatedName", "", "isSelected", Constants.ENABLE_DISABLE, "<init>", "(Ljava/lang/String;ZZ)V", "b", "a", "Lhq/h$a;", "Lhq/h$b;", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class h implements Parcelable, Comparable<h> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f85026a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f85027b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f85028c;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lhq/h$a;", "Lhq/h;", "Lqu1/a;", "equipment", "<init>", "(Lqu1/a;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class a extends h {
        public static final Parcelable.Creator<a> CREATOR = new C1685a();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final qu1.a f85029d;

        /* JADX INFO: renamed from: hq.h$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class C1685a implements Parcelable.Creator<a> {
            @Override // android.os.Parcelable.Creator
            public final a createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new a(qu1.a.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final a[] newArray(int i14) {
                return new a[i14];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(qu1.a aVar) {
            super(null, false, false, 7, null);
            aVar.getClass();
            this.f85029d = aVar;
        }

        @Override // hq.h
        public final int b() {
            return R.drawable.gcm_equipment_icon;
        }

        @Override // hq.h
        public final int d() {
            return this.f85029d.f147900c;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f85029d == ((a) obj).f85029d;
        }

        @Override // hq.h
        public final String f() {
            return this.f85029d.f147898a;
        }

        public final int hashCode() {
            return this.f85029d.hashCode();
        }

        public final String toString() {
            return "EquipmentOption(equipment=" + this.f85029d + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i14) {
            parcel.getClass();
            parcel.writeString(this.f85029d.name());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lhq/h$b;", "Lhq/h;", "Lzw1/a;", "muscle", "<init>", "(Lzw1/a;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class b extends h {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final zw1.a f85030d;

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<b> {
            @Override // android.os.Parcelable.Creator
            public final b createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new b(zw1.a.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final b[] newArray(int i14) {
                return new b[i14];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(zw1.a aVar) {
            super(null, false, false, 7, null);
            aVar.getClass();
            this.f85030d = aVar;
        }

        @Override // hq.h
        public final int b() {
            return R.drawable.gcm_muscle_icon;
        }

        @Override // hq.h
        public final int d() {
            return this.f85030d.f207227c;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.f85030d == ((b) obj).f85030d;
        }

        @Override // hq.h
        public final String f() {
            return this.f85030d.f207225a;
        }

        public final int hashCode() {
            return this.f85030d.hashCode();
        }

        public final String toString() {
            return "MuscleOption(muscle=" + this.f85030d + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i14) {
            parcel.getClass();
            parcel.writeString(this.f85030d.name());
        }
    }

    public /* synthetic */ h(String str, boolean z14, boolean z15, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? "" : str, (i14 & 2) != 0 ? false : z14, (i14 & 4) != 0 ? true : z15, null);
    }

    public abstract int b();

    @Override // java.lang.Comparable
    public final int compareTo(h hVar) {
        h hVar2 = hVar;
        hVar2.getClass();
        boolean z14 = this instanceof b;
        if ((!z14 || !(hVar2 instanceof b)) && (!(this instanceof a) || !(hVar2 instanceof a))) {
            return z14 ? -1 : 1;
        }
        String strI = hb.a.i(this.f85026a);
        String str = hVar2.f85026a;
        Locale locale = Locale.getDefault();
        locale.getClass();
        String lowerCase = str.toLowerCase(locale);
        lowerCase.getClass();
        return strI.compareTo(lowerCase);
    }

    public abstract int d();

    public abstract String f();

    private h(String str, boolean z14, boolean z15) {
        this.f85026a = str;
        this.f85027b = z14;
        this.f85028c = z15;
    }

    public /* synthetic */ h(String str, boolean z14, boolean z15, p005kotlin.jvm.internal.j jVar) {
        this(str, z14, z15);
    }
}

package b11;

import android.os.Parcel;
import android.os.Parcelable;
import d53.w;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import p005kotlin.Metadata;
import p13.h0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\bB+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lb11/t;", "Landroid/os/Parcelable;", "", "smallImageUrl", "mediumImageUrl", "largeImageUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "a", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class t implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14378a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f14379b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f14380c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f14377d = new a(null);
    public static final Parcelable.Creator<t> CREATOR = new b();

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<t> {
        @Override // android.os.Parcelable.Creator
        public final t createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new t(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final t[] newArray(int i14) {
            return new t[i14];
        }
    }

    public /* synthetic */ t(String str, String str2, String str3, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : str, (i14 & 2) != 0 ? null : str2, (i14 & 4) != 0 ? null : str3);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return p005kotlin.jvm.internal.s.g(this.f14378a, tVar.f14378a) && p005kotlin.jvm.internal.s.g(this.f14379b, tVar.f14379b) && p005kotlin.jvm.internal.s.g(this.f14380c, tVar.f14380c);
    }

    public final int hashCode() {
        String str = this.f14378a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f14379b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f14380c;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        return am.j.o(this.f14380c, ")", p6.b.i("NutritionImagesUIModel(smallImageUrl=", this.f14378a, ", mediumImageUrl=", this.f14379b, ", largeImageUrl="));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.f14378a);
        parcel.writeString(this.f14379b);
        parcel.writeString(this.f14380c);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lb11/t$a;", "", "<init>", "()V", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: b11.t$a$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C0208a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f14381a;

            static {
                int[] iArr = new int[g01.u.values().length];
                try {
                    iArr[g01.u.FATSECRET.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[g01.u.GARMIN.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[g01.u.UNKNOWN.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f14381a = iArr;
            }
        }

        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static t a(List list, g01.u uVar) {
            Object next;
            String str;
            Object next2;
            String str2;
            String str3;
            list.getClass();
            uVar.getClass();
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str4 = ((g01.j) it.next()).f74200a;
                if (str4 != null) {
                    arrayList.add(str4);
                }
            }
            int i14 = C0208a.f14381a[uVar.ordinal()];
            Object obj = null;
            if (i14 == 1) {
                Iterator it3 = arrayList.iterator();
                do {
                    if (!it3.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it3.next();
                } while (!w.z((String) next, "72x72", false));
                str = (String) next;
            } else {
                if (i14 != 2 && i14 != 3) {
                    u0.r();
                    return null;
                }
                str = (String) h0.d0(arrayList);
            }
            int i15 = C0208a.f14381a[uVar.ordinal()];
            if (i15 == 1) {
                Iterator it4 = arrayList.iterator();
                do {
                    if (!it4.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it4.next();
                } while (!w.z((String) next2, "400x400", false));
                str2 = (String) next2;
            } else {
                if (i15 != 2 && i15 != 3) {
                    u0.r();
                    return null;
                }
                str2 = (String) h0.d0(arrayList);
            }
            int i16 = C0208a.f14381a[uVar.ordinal()];
            if (i16 == 1) {
                for (Object obj2 : arrayList) {
                    if (w.z((String) obj2, "1024x1024", false)) {
                        obj = obj2;
                        break;
                    }
                }
                str3 = (String) obj;
            } else {
                if (i16 != 2 && i16 != 3) {
                    u0.r();
                    return null;
                }
                str3 = (String) h0.d0(arrayList);
            }
            return new t(str, str2, str3);
        }

        private a() {
        }
    }

    public t(String str, String str2, String str3) {
        this.f14378a = str;
        this.f14379b = str2;
        this.f14380c = str3;
    }

    public t() {
        this(null, null, null, 7, null);
    }
}

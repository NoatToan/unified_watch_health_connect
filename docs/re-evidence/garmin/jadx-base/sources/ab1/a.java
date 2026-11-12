package ab1;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\t\nB!\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lab1/a;", "Landroid/os/Parcelable;", "", "Lab1/a$b;", "alertTypes", "Lab1/a$a;", "alertMode", "<init>", "(Ljava/util/List;Lab1/a$a;)V", "b", "a", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List<? extends b> f2532a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public AbstractC0027a f2533b;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements Parcelable.Creator<a> {
        @Override // android.os.Parcelable.Creator
        public final a createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            parcel.getClass();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i14 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i14);
                int iD = 0;
                while (iD != i14) {
                    iD = u0.d(a.class, parcel, arrayList2, iD, 1);
                }
                arrayList = arrayList2;
            }
            return new a(arrayList, (AbstractC0027a) parcel.readParcelable(a.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final a[] newArray(int i14) {
            return new a[i14];
        }
    }

    public a(List<? extends b> list, AbstractC0027a abstractC0027a) {
        this.f2532a = list;
        this.f2533b = abstractC0027a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return s.g(this.f2532a, aVar.f2532a) && s.g(this.f2533b, aVar.f2533b);
    }

    public final int hashCode() {
        List<? extends b> list = this.f2532a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        AbstractC0027a abstractC0027a = this.f2533b;
        return iHashCode + (abstractC0027a != null ? abstractC0027a.hashCode() : 0);
    }

    public final String toString() {
        return "AlertUserSettingsChangesDTO(alertTypes=" + this.f2532a + ", alertMode=" + this.f2533b + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        List<? extends b> list = this.f2532a;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itO = u0.o(parcel, list, 1);
            while (itO.hasNext()) {
                parcel.writeParcelable((Parcelable) itO.next(), i14);
            }
        }
        parcel.writeParcelable(this.f2533b, i14);
    }

    /* JADX INFO: renamed from: ab1.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lab1/a$a;", "Landroid/os/Parcelable;", "<init>", "()V", "a", "b", "Lab1/a$a$a;", "Lab1/a$a$b;", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class AbstractC0027a implements Parcelable {

        /* JADX INFO: renamed from: ab1.a$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lab1/a$a$a;", "Lab1/a$a;", "<init>", "()V", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class C0028a extends AbstractC0027a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0028a f2534a = new C0028a();
            public static final Parcelable.Creator<C0028a> CREATOR = new C0029a();

            /* JADX INFO: renamed from: ab1.a$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            public static final class C0029a implements Parcelable.Creator<C0028a> {
                @Override // android.os.Parcelable.Creator
                public final C0028a createFromParcel(Parcel parcel) {
                    parcel.getClass();
                    parcel.readInt();
                    return C0028a.f2534a;
                }

                @Override // android.os.Parcelable.Creator
                public final C0028a[] newArray(int i14) {
                    return new C0028a[i14];
                }
            }

            private C0028a() {
                super(null);
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

        /* JADX INFO: renamed from: ab1.a$a$b */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lab1/a$a$b;", "Lab1/a$a;", "<init>", "()V", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class b extends AbstractC0027a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f2535a = new b();
            public static final Parcelable.Creator<b> CREATOR = new C0030a();

            /* JADX INFO: renamed from: ab1.a$a$b$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            public static final class C0030a implements Parcelable.Creator<b> {
                @Override // android.os.Parcelable.Creator
                public final b createFromParcel(Parcel parcel) {
                    parcel.getClass();
                    parcel.readInt();
                    return b.f2535a;
                }

                @Override // android.os.Parcelable.Creator
                public final b[] newArray(int i14) {
                    return new b[i14];
                }
            }

            private b() {
                super(null);
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

        public /* synthetic */ AbstractC0027a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private AbstractC0027a() {
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lab1/a$b;", "Landroid/os/Parcelable;", "<init>", "()V", "a", "b", "Lab1/a$b$a;", "Lab1/a$b$b;", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class b implements Parcelable {

        /* JADX INFO: renamed from: ab1.a$b$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lab1/a$b$a;", "Lab1/a$b;", "", "currentUserFTP", "<init>", "(I)V", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class C0031a extends b {
            public static final Parcelable.Creator<C0031a> CREATOR = new C0032a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f2536a;

            /* JADX INFO: renamed from: ab1.a$b$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            public static final class C0032a implements Parcelable.Creator<C0031a> {
                @Override // android.os.Parcelable.Creator
                public final C0031a createFromParcel(Parcel parcel) {
                    parcel.getClass();
                    return new C0031a(parcel.readInt());
                }

                @Override // android.os.Parcelable.Creator
                public final C0031a[] newArray(int i14) {
                    return new C0031a[i14];
                }
            }

            public C0031a(int i14) {
                super(null);
                this.f2536a = i14;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i14) {
                parcel.getClass();
                parcel.writeInt(this.f2536a);
            }
        }

        /* JADX INFO: renamed from: ab1.a$b$b, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lab1/a$b$b;", "Lab1/a$b;", "", "currentRiderMass", "<init>", "(F)V", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class C0033b extends b {
            public static final Parcelable.Creator<C0033b> CREATOR = new C0034a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final float f2537a;

            /* JADX INFO: renamed from: ab1.a$b$b$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            public static final class C0034a implements Parcelable.Creator<C0033b> {
                @Override // android.os.Parcelable.Creator
                public final C0033b createFromParcel(Parcel parcel) {
                    parcel.getClass();
                    return new C0033b(parcel.readFloat());
                }

                @Override // android.os.Parcelable.Creator
                public final C0033b[] newArray(int i14) {
                    return new C0033b[i14];
                }
            }

            public C0033b(float f14) {
                super(null);
                this.f2537a = f14;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i14) {
                parcel.getClass();
                parcel.writeFloat(this.f2537a);
            }
        }

        public /* synthetic */ b(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private b() {
        }
    }
}

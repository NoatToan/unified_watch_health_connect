package pv;

import am.j;
import android.os.Parcel;
import android.os.Parcelable;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import v.e0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lpv/a;", "Landroid/os/Parcelable;", "<init>", "()V", "c", "b", "a", "Lpv/a$a;", "Lpv/a$b;", "Lpv/a$c;", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class a implements Parcelable {

    /* JADX INFO: renamed from: pv.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lpv/a$a;", "Lpv/a;", "", "drawable", "<init>", "(I)V", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class C2653a extends a {
        public static final Parcelable.Creator<C2653a> CREATOR = new C2654a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f141326a;

        /* JADX INFO: renamed from: pv.a$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class C2654a implements Parcelable.Creator<C2653a> {
            @Override // android.os.Parcelable.Creator
            public final C2653a createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new C2653a(parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            public final C2653a[] newArray(int i14) {
                return new C2653a[i14];
            }
        }

        public C2653a(int i14) {
            super(null);
            this.f141326a = i14;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C2653a) && this.f141326a == ((C2653a) obj).f141326a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f141326a);
        }

        public final String toString() {
            return e0.f(this.f141326a, "BicHelpImage(drawable=", ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i14) {
            parcel.getClass();
            parcel.writeInt(this.f141326a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lpv/a$b;", "Lpv/a;", "", "message", "<init>", "(Ljava/lang/String;)V", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class b extends a {
        public static final Parcelable.Creator<b> CREATOR = new C2655a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f141327a;

        /* JADX INFO: renamed from: pv.a$b$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class C2655a implements Parcelable.Creator<b> {
            @Override // android.os.Parcelable.Creator
            public final b createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new b(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final b[] newArray(int i14) {
                return new b[i14];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str) {
            super(null);
            str.getClass();
            this.f141327a = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && s.g(this.f141327a, ((b) obj).f141327a);
        }

        public final int hashCode() {
            return this.f141327a.hashCode();
        }

        public final String toString() {
            return j.m("BicHelpMessage(message=", this.f141327a, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i14) {
            parcel.getClass();
            parcel.writeString(this.f141327a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lpv/a$c;", "Lpv/a;", "", "message", "<init>", "(Ljava/lang/String;)V", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class c extends a {
        public static final Parcelable.Creator<c> CREATOR = new C2656a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f141328a;

        /* JADX INFO: renamed from: pv.a$c$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class C2656a implements Parcelable.Creator<c> {
            @Override // android.os.Parcelable.Creator
            public final c createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new c(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final c[] newArray(int i14) {
                return new c[i14];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str) {
            super(null);
            str.getClass();
            this.f141328a = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && s.g(this.f141328a, ((c) obj).f141328a);
        }

        public final int hashCode() {
            return this.f141328a.hashCode();
        }

        public final String toString() {
            return j.m("BicHelpTitle(message=", this.f141328a, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i14) {
            parcel.getClass();
            parcel.writeString(this.f141328a);
        }
    }

    public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
        this();
    }

    private a() {
    }
}

package hl;

import android.os.Parcel;
import android.os.Parcelable;
import i63.h;
import m63.u1;
import o13.m;
import o13.n;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \t2\u00020\u0001:\u0003\n\u000b\fB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003B\u001b\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0002\u0010\b\u0082\u0001\u0002\r\u000e¨\u0006\u000f"}, d2 = {"Lhl/a;", "Landroid/os/Parcelable;", "<init>", "()V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILm63/u1;)V", "Companion", "c", "b", "a", "Lhl/a$b;", "Lhl/a$c;", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@h
public abstract class a implements Parcelable {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f84251a = m.a(n.PUBLICATION, new ha0.a(15));

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lhl/a$c;", "Lhl/a;", "<init>", "()V", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class c extends a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final c f84256b = new c();
        public static final Parcelable.Creator<c> CREATOR = new C1672a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f84257c = 8;

        /* JADX INFO: renamed from: hl.a$c$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class C1672a implements Parcelable.Creator<c> {
            @Override // android.os.Parcelable.Creator
            public final c createFromParcel(Parcel parcel) {
                parcel.getClass();
                parcel.readInt();
                return c.f84256b;
            }

            @Override // android.os.Parcelable.Creator
            public final c[] newArray(int i14) {
                return new c[i14];
            }
        }

        private c() {
            super(null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -1887236313;
        }

        public final String toString() {
            return "Owner";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i14) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    public /* synthetic */ a(j jVar) {
        this();
    }

    /* JADX INFO: renamed from: hl.a$a, reason: collision with other inner class name and from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lhl/a$a;", "", "<init>", "()V", "Li63/c;", "Lhl/a;", "serializer", "()Li63/c;", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(j jVar) {
            this();
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
        public final i63.c<a> serializer() {
            return (i63.c) a.f84251a.getValue();
        }

        private Companion() {
        }
    }

    private a() {
    }

    public /* synthetic */ a(int i14, u1 u1Var) {
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lhl/a$b;", "Lhl/a;", "", "childId", "", "childName", "childPhoto", "childCountryCode", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class b extends a {
        public static final Parcelable.Creator<b> CREATOR = new C1671a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f84252b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f84253c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f84254d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final String f84255e;

        /* JADX INFO: renamed from: hl.a$b$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class C1671a implements Parcelable.Creator<b> {
            @Override // android.os.Parcelable.Creator
            public final b createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new b(parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final b[] newArray(int i14) {
                return new b[i14];
            }
        }

        public /* synthetic */ b(long j8, String str, String str2, String str3, int i14, j jVar) {
            this(j8, (i14 & 2) != 0 ? null : str, (i14 & 4) != 0 ? null : str2, (i14 & 8) != 0 ? null : str3);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f84252b == bVar.f84252b && s.g(this.f84253c, bVar.f84253c) && s.g(this.f84254d, bVar.f84254d) && s.g(this.f84255e, bVar.f84255e);
        }

        public final int hashCode() {
            int iHashCode = Long.hashCode(this.f84252b) * 31;
            String str = this.f84253c;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f84254d;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f84255e;
            return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbK = com.airbnb.lottie.animation.keyframe.a.k(this.f84252b, "DelegatedAdmin(childId=", ", childName=", this.f84253c);
            sn.a.t(sbK, ", childPhoto=", this.f84254d, ", childCountryCode=", this.f84255e);
            sbK.append(")");
            return sbK.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i14) {
            parcel.getClass();
            parcel.writeLong(this.f84252b);
            parcel.writeString(this.f84253c);
            parcel.writeString(this.f84254d);
            parcel.writeString(this.f84255e);
        }

        public b(long j8, String str, String str2, String str3) {
            super(null);
            this.f84252b = j8;
            this.f84253c = str;
            this.f84254d = str2;
            this.f84255e = str3;
        }
    }
}

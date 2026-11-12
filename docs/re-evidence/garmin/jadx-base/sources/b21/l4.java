package b21;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.nimbusds.jose.jwk.JWKParameterNames;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000ì\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b7\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \t2\u00020\u0001:4\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*+,-./0123456789:;<=B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003B\u001b\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0002\u0010\b\u0082\u00014>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_`abcdefghijklmnopq¨\u0006r"}, d2 = {"Lb21/l4;", "Landroid/os/Parcelable;", "<init>", "()V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILm63/u1;)V", "Companion", "x0", "y0", "a", JWKParameterNames.OCT_KEY_VALUE, "h", "v0", JWKParameterNames.ELLIPTIC_CURVE_Y_COORDINATE, JWKParameterNames.RSA_OTHER_PRIMES__PRIME_FACTOR, "m", "w0", "o", "z0", JWKParameterNames.RSA_SECOND_PRIME_FACTOR, "p", "i0", "m0", "k0", "l0", "o0", "n0", "q0", "t0", "r0", "p0", "s0", "j0", JWKParameterNames.RSA_OTHER_PRIMES__FACTOR_CRT_COEFFICIENT, "s", "x", "w", "e0", "z", "a0", "b0", "d0", "c0", "g0", "f0", "v", "u", JWKParameterNames.RSA_MODULUS, JWKParameterNames.RSA_EXPONENT, IntegerTokenConverter.CONVERTER_KEY, "j", "g", "f", "b", "c", "l", "u0", "h0", "d", "Lb21/c;", "Lb21/l4$a;", "Lb21/l4$b;", "Lb21/l4$c;", "Lb21/l4$e;", "Lb21/l4$f;", "Lb21/l4$g;", "Lb21/l4$h;", "Lb21/l4$i;", "Lb21/l4$j;", "Lb21/l4$k;", "Lb21/l4$l;", "Lb21/l4$m;", "Lb21/l4$n;", "Lb21/l4$o;", "Lb21/l4$p;", "Lb21/l4$q;", "Lb21/l4$r;", "Lb21/l4$s;", "Lb21/l4$t;", "Lb21/l4$u;", "Lb21/l4$v;", "Lb21/l4$w;", "Lb21/l4$x;", "Lb21/l4$y;", "Lb21/l4$z;", "Lb21/l4$a0;", "Lb21/l4$b0;", "Lb21/l4$c0;", "Lb21/l4$d0;", "Lb21/l4$e0;", "Lb21/l4$f0;", "Lb21/l4$g0;", "Lb21/l4$h0;", "Lb21/l4$i0;", "Lb21/l4$j0;", "Lb21/l4$k0;", "Lb21/l4$l0;", "Lb21/l4$m0;", "Lb21/l4$n0;", "Lb21/l4$o0;", "Lb21/l4$p0;", "Lb21/l4$q0;", "Lb21/l4$r0;", "Lb21/l4$s0;", "Lb21/l4$t0;", "Lb21/l4$u0;", "Lb21/l4$v0;", "Lb21/l4$w0;", "Lb21/l4$x0;", "Lb21/l4$y0;", "Lb21/l4$z0;", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@i63.h
public abstract class l4 implements Parcelable {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f14829a = o13.m.a(o13.n.PUBLICATION, new aw1.d(29));

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lb21/l4$e;", "Lb21/l4;", "<init>", "()V", "Li63/c;", "serializer", "()Li63/c;", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @i63.h
    public static final /* data */ class e extends l4 {
        public static final e INSTANCE = new e();
        public static final Parcelable.Creator<e> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ Object f14872b = o13.m.a(o13.n.PUBLICATION, new m4(0));

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<e> {
            @Override // android.os.Parcelable.Creator
            public final e createFromParcel(Parcel parcel) {
                parcel.getClass();
                parcel.readInt();
                return e.INSTANCE;
            }

            @Override // android.os.Parcelable.Creator
            public final e[] newArray(int i14) {
                return new e[i14];
            }
        }

        private e() {
            super(null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return -879602252;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
        public final i63.c<e> serializer() {
            return (i63.c) f14872b.getValue();
        }

        public final String toString() {
            return "CreateCustomFood";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i14) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lb21/l4$f0;", "Lb21/l4;", "<init>", "()V", "Li63/c;", "serializer", "()Li63/c;", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @i63.h
    public static final /* data */ class f0 extends l4 {
        public static final f0 INSTANCE = new f0();
        public static final Parcelable.Creator<f0> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ Object f14879b = o13.m.a(o13.n.PUBLICATION, new m4(9));

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<f0> {
            @Override // android.os.Parcelable.Creator
            public final f0 createFromParcel(Parcel parcel) {
                parcel.getClass();
                parcel.readInt();
                return f0.INSTANCE;
            }

            @Override // android.os.Parcelable.Creator
            public final f0[] newArray(int i14) {
                return new f0[i14];
            }
        }

        private f0() {
            super(null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof f0);
        }

        public final int hashCode() {
            return 1714491250;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
        public final i63.c<f0> serializer() {
            return (i63.c) f14879b.getValue();
        }

        public final String toString() {
            return "NutritionReminders";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i14) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lb21/l4$g0;", "Lb21/l4;", "<init>", "()V", "Li63/c;", "serializer", "()Li63/c;", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @i63.h
    public static final /* data */ class g0 extends l4 {
        public static final g0 INSTANCE = new g0();
        public static final Parcelable.Creator<g0> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ Object f14886b = o13.m.a(o13.n.PUBLICATION, new m4(10));

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<g0> {
            @Override // android.os.Parcelable.Creator
            public final g0 createFromParcel(Parcel parcel) {
                parcel.getClass();
                parcel.readInt();
                return g0.INSTANCE;
            }

            @Override // android.os.Parcelable.Creator
            public final g0[] newArray(int i14) {
                return new g0[i14];
            }
        }

        private g0() {
            super(null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof g0);
        }

        public final int hashCode() {
            return 1315803346;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
        public final i63.c<g0> serializer() {
            return (i63.c) f14886b.getValue();
        }

        public final String toString() {
            return "NutritionSettings";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i14) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lb21/l4$i0;", "Lb21/l4;", "<init>", "()V", "Li63/c;", "serializer", "()Li63/c;", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @i63.h
    public static final /* data */ class i0 extends l4 {
        public static final i0 INSTANCE = new i0();
        public static final Parcelable.Creator<i0> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ Object f14904b = o13.m.a(o13.n.PUBLICATION, new m4(12));

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<i0> {
            @Override // android.os.Parcelable.Creator
            public final i0 createFromParcel(Parcel parcel) {
                parcel.getClass();
                parcel.readInt();
                return i0.INSTANCE;
            }

            @Override // android.os.Parcelable.Creator
            public final i0[] newArray(int i14) {
                return new i0[i14];
            }
        }

        private i0() {
            super(null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof i0);
        }

        public final int hashCode() {
            return -1480120966;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
        public final i63.c<i0> serializer() {
            return (i63.c) f14904b.getValue();
        }

        public final String toString() {
            return "NutritionSetupCheck";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i14) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lb21/l4$k0;", "Lb21/l4;", "<init>", "()V", "Li63/c;", "serializer", "()Li63/c;", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @i63.h
    public static final /* data */ class k0 extends l4 {
        public static final k0 INSTANCE = new k0();
        public static final Parcelable.Creator<k0> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ Object f14917b = o13.m.a(o13.n.PUBLICATION, new m4(13));

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<k0> {
            @Override // android.os.Parcelable.Creator
            public final k0 createFromParcel(Parcel parcel) {
                parcel.getClass();
                parcel.readInt();
                return k0.INSTANCE;
            }

            @Override // android.os.Parcelable.Creator
            public final k0[] newArray(int i14) {
                return new k0[i14];
            }
        }

        private k0() {
            super(null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof k0);
        }

        public final int hashCode() {
            return -552883188;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
        public final i63.c<k0> serializer() {
            return (i63.c) f14917b.getValue();
        }

        public final String toString() {
            return "NutritionSetupConsent";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i14) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lb21/l4$l0;", "Lb21/l4;", "<init>", "()V", "Li63/c;", "serializer", "()Li63/c;", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @i63.h
    public static final /* data */ class l0 extends l4 {
        public static final l0 INSTANCE = new l0();
        public static final Parcelable.Creator<l0> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ Object f14925b = o13.m.a(o13.n.PUBLICATION, new m4(14));

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<l0> {
            @Override // android.os.Parcelable.Creator
            public final l0 createFromParcel(Parcel parcel) {
                parcel.getClass();
                parcel.readInt();
                return l0.INSTANCE;
            }

            @Override // android.os.Parcelable.Creator
            public final l0[] newArray(int i14) {
                return new l0[i14];
            }
        }

        private l0() {
            super(null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof l0);
        }

        public final int hashCode() {
            return -118986195;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
        public final i63.c<l0> serializer() {
            return (i63.c) f14925b.getValue();
        }

        public final String toString() {
            return "NutritionSetupDisconnectMFP";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i14) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lb21/l4$m0;", "Lb21/l4;", "<init>", "()V", "Li63/c;", "serializer", "()Li63/c;", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @i63.h
    public static final /* data */ class m0 extends l4 {
        public static final m0 INSTANCE = new m0();
        public static final Parcelable.Creator<m0> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ Object f14932b = o13.m.a(o13.n.PUBLICATION, new m4(15));

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<m0> {
            @Override // android.os.Parcelable.Creator
            public final m0 createFromParcel(Parcel parcel) {
                parcel.getClass();
                parcel.readInt();
                return m0.INSTANCE;
            }

            @Override // android.os.Parcelable.Creator
            public final m0[] newArray(int i14) {
                return new m0[i14];
            }
        }

        private m0() {
            super(null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof m0);
        }

        public final int hashCode() {
            return -1584531046;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
        public final i63.c<m0> serializer() {
            return (i63.c) f14932b.getValue();
        }

        public final String toString() {
            return "NutritionSetupGenesis";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i14) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lb21/l4$n0;", "Lb21/l4;", "<init>", "()V", "Li63/c;", "serializer", "()Li63/c;", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @i63.h
    public static final /* data */ class n0 extends l4 {
        public static final n0 INSTANCE = new n0();
        public static final Parcelable.Creator<n0> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ Object f14935b = o13.m.a(o13.n.PUBLICATION, new m4(16));

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<n0> {
            @Override // android.os.Parcelable.Creator
            public final n0 createFromParcel(Parcel parcel) {
                parcel.getClass();
                parcel.readInt();
                return n0.INSTANCE;
            }

            @Override // android.os.Parcelable.Creator
            public final n0[] newArray(int i14) {
                return new n0[i14];
            }
        }

        private n0() {
            super(null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof n0);
        }

        public final int hashCode() {
            return -2125830047;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
        public final i63.c<n0> serializer() {
            return (i63.c) f14935b.getValue();
        }

        public final String toString() {
            return "NutritionSetupGoal";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i14) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lb21/l4$p0;", "Lb21/l4;", "<init>", "()V", "Li63/c;", "serializer", "()Li63/c;", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @i63.h
    public static final /* data */ class p0 extends l4 {
        public static final p0 INSTANCE = new p0();
        public static final Parcelable.Creator<p0> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ Object f14949b = o13.m.a(o13.n.PUBLICATION, new m4(17));

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<p0> {
            @Override // android.os.Parcelable.Creator
            public final p0 createFromParcel(Parcel parcel) {
                parcel.getClass();
                parcel.readInt();
                return p0.INSTANCE;
            }

            @Override // android.os.Parcelable.Creator
            public final p0[] newArray(int i14) {
                return new p0[i14];
            }
        }

        private p0() {
            super(null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof p0);
        }

        public final int hashCode() {
            return 1223195732;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
        public final i63.c<p0> serializer() {
            return (i63.c) f14949b.getValue();
        }

        public final String toString() {
            return "NutritionSetupMealSettings";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i14) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lb21/l4$q0;", "Lb21/l4;", "<init>", "()V", "Li63/c;", "serializer", "()Li63/c;", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @i63.h
    public static final /* data */ class q0 extends l4 {
        public static final q0 INSTANCE = new q0();
        public static final Parcelable.Creator<q0> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ Object f14955b = o13.m.a(o13.n.PUBLICATION, new m4(18));

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<q0> {
            @Override // android.os.Parcelable.Creator
            public final q0 createFromParcel(Parcel parcel) {
                parcel.getClass();
                parcel.readInt();
                return q0.INSTANCE;
            }

            @Override // android.os.Parcelable.Creator
            public final q0[] newArray(int i14) {
                return new q0[i14];
            }
        }

        private q0() {
            super(null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof q0);
        }

        public final int hashCode() {
            return 1816573396;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
        public final i63.c<q0> serializer() {
            return (i63.c) f14955b.getValue();
        }

        public final String toString() {
            return "NutritionSetupPersonalDetails";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i14) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lb21/l4$r0;", "Lb21/l4;", "<init>", "()V", "Li63/c;", "serializer", "()Li63/c;", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @i63.h
    public static final /* data */ class r0 extends l4 {
        public static final r0 INSTANCE = new r0();
        public static final Parcelable.Creator<r0> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ Object f14961b = o13.m.a(o13.n.PUBLICATION, new m4(19));

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<r0> {
            @Override // android.os.Parcelable.Creator
            public final r0 createFromParcel(Parcel parcel) {
                parcel.getClass();
                parcel.readInt();
                return r0.INSTANCE;
            }

            @Override // android.os.Parcelable.Creator
            public final r0[] newArray(int i14) {
                return new r0[i14];
            }
        }

        private r0() {
            super(null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof r0);
        }

        public final int hashCode() {
            return -51814521;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
        public final i63.c<r0> serializer() {
            return (i63.c) f14961b.getValue();
        }

        public final String toString() {
            return "NutritionSetupRecommendation";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i14) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lb21/l4$s0;", "Lb21/l4;", "<init>", "()V", "Li63/c;", "serializer", "()Li63/c;", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @i63.h
    public static final /* data */ class s0 extends l4 {
        public static final s0 INSTANCE = new s0();
        public static final Parcelable.Creator<s0> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ Object f14967b = o13.m.a(o13.n.PUBLICATION, new m4(20));

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<s0> {
            @Override // android.os.Parcelable.Creator
            public final s0 createFromParcel(Parcel parcel) {
                parcel.getClass();
                parcel.readInt();
                return s0.INSTANCE;
            }

            @Override // android.os.Parcelable.Creator
            public final s0[] newArray(int i14) {
                return new s0[i14];
            }
        }

        private s0() {
            super(null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof s0);
        }

        public final int hashCode() {
            return -1016675985;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
        public final i63.c<s0> serializer() {
            return (i63.c) f14967b.getValue();
        }

        public final String toString() {
            return "NutritionSetupReviewPlan";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i14) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lb21/l4$t;", "Lb21/l4;", "<init>", "()V", "Li63/c;", "serializer", "()Li63/c;", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @i63.h
    public static final /* data */ class t extends l4 {
        public static final t INSTANCE = new t();
        public static final Parcelable.Creator<t> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ Object f14968b = o13.m.a(o13.n.PUBLICATION, new m4(3));

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<t> {
            @Override // android.os.Parcelable.Creator
            public final t createFromParcel(Parcel parcel) {
                parcel.getClass();
                parcel.readInt();
                return t.INSTANCE;
            }

            @Override // android.os.Parcelable.Creator
            public final t[] newArray(int i14) {
                return new t[i14];
            }
        }

        private t() {
            super(null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof t);
        }

        public final int hashCode() {
            return 9855469;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
        public final i63.c<t> serializer() {
            return (i63.c) f14968b.getValue();
        }

        public final String toString() {
            return "LegacyMealWindowsAndTimelineSettings";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i14) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lb21/l4$t0;", "Lb21/l4;", "<init>", "()V", "Li63/c;", "serializer", "()Li63/c;", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @i63.h
    public static final /* data */ class t0 extends l4 {
        public static final t0 INSTANCE = new t0();
        public static final Parcelable.Creator<t0> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ Object f14969b = o13.m.a(o13.n.PUBLICATION, new m4(21));

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<t0> {
            @Override // android.os.Parcelable.Creator
            public final t0 createFromParcel(Parcel parcel) {
                parcel.getClass();
                parcel.readInt();
                return t0.INSTANCE;
            }

            @Override // android.os.Parcelable.Creator
            public final t0[] newArray(int i14) {
                return new t0[i14];
            }
        }

        private t0() {
            super(null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof t0);
        }

        public final int hashCode() {
            return 1930825798;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
        public final i63.c<t0> serializer() {
            return (i63.c) f14969b.getValue();
        }

        public final String toString() {
            return "NutritionSetupWeight";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i14) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lb21/l4$v;", "Lb21/l4;", "<init>", "()V", "Li63/c;", "serializer", "()Li63/c;", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @i63.h
    public static final /* data */ class v extends l4 {
        public static final v INSTANCE = new v();
        public static final Parcelable.Creator<v> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ Object f14976b = o13.m.a(o13.n.PUBLICATION, new m4(5));

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<v> {
            @Override // android.os.Parcelable.Creator
            public final v createFromParcel(Parcel parcel) {
                parcel.getClass();
                parcel.readInt();
                return v.INSTANCE;
            }

            @Override // android.os.Parcelable.Creator
            public final v[] newArray(int i14) {
                return new v[i14];
            }
        }

        private v() {
            super(null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof v);
        }

        public final int hashCode() {
            return 1267195863;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
        public final i63.c<v> serializer() {
            return (i63.c) f14976b.getValue();
        }

        public final String toString() {
            return "LegacyNutritionMealGoals";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i14) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lb21/l4$w;", "Lb21/l4;", "<init>", "()V", "Li63/c;", "serializer", "()Li63/c;", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @i63.h
    public static final /* data */ class w extends l4 {
        public static final w INSTANCE = new w();
        public static final Parcelable.Creator<w> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ Object f14982b = o13.m.a(o13.n.PUBLICATION, new m4(6));

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<w> {
            @Override // android.os.Parcelable.Creator
            public final w createFromParcel(Parcel parcel) {
                parcel.getClass();
                parcel.readInt();
                return w.INSTANCE;
            }

            @Override // android.os.Parcelable.Creator
            public final w[] newArray(int i14) {
                return new w[i14];
            }
        }

        private w() {
            super(null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof w);
        }

        public final int hashCode() {
            return -603680705;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
        public final i63.c<w> serializer() {
            return (i63.c) f14982b.getValue();
        }

        public final String toString() {
            return "MealCalorieGoals";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i14) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lb21/l4$x;", "Lb21/l4;", "<init>", "()V", "Li63/c;", "serializer", "()Li63/c;", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @i63.h
    public static final /* data */ class x extends l4 {
        public static final x INSTANCE = new x();
        public static final Parcelable.Creator<x> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ Object f14987b = o13.m.a(o13.n.PUBLICATION, new m4(7));

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<x> {
            @Override // android.os.Parcelable.Creator
            public final x createFromParcel(Parcel parcel) {
                parcel.getClass();
                parcel.readInt();
                return x.INSTANCE;
            }

            @Override // android.os.Parcelable.Creator
            public final x[] newArray(int i14) {
                return new x[i14];
            }
        }

        private x() {
            super(null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof x);
        }

        public final int hashCode() {
            return -1173736017;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
        public final i63.c<x> serializer() {
            return (i63.c) f14987b.getValue();
        }

        public final String toString() {
            return "MealSettings";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i14) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lb21/l4$y0;", "Lb21/l4;", "<init>", "()V", "Li63/c;", "serializer", "()Li63/c;", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @i63.h
    public static final /* data */ class y0 extends l4 {
        public static final y0 INSTANCE = new y0();
        public static final Parcelable.Creator<y0> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ Object f14996b = o13.m.a(o13.n.PUBLICATION, new m4(22));

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<y0> {
            @Override // android.os.Parcelable.Creator
            public final y0 createFromParcel(Parcel parcel) {
                parcel.getClass();
                parcel.readInt();
                return y0.INSTANCE;
            }

            @Override // android.os.Parcelable.Creator
            public final y0[] newArray(int i14) {
                return new y0[i14];
            }
        }

        private y0() {
            super(null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof y0);
        }

        public final int hashCode() {
            return -1407985802;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
        public final i63.c<y0> serializer() {
            return (i63.c) f14996b.getValue();
        }

        public final String toString() {
            return "Reports";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i14) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    public /* synthetic */ l4(p005kotlin.jvm.internal.j jVar) {
        this();
    }

    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \"2\u00020\u0001:\u0002#$Bm\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013Bo\b\u0016\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u001cB\u008f\u0001\b\u0010\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010 \u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\b\u0012\u0010!¨\u0006%"}, d2 = {"Lb21/l4$a;", "Lb21/l4;", "", "_dateTime", "foodId", "", "servingQty", "servingId", "regionCode", RemoteConfigConstants.RequestFieldKey.LANGUAGE_CODE, "", "allowEditing", "scannedBarcode", "_source", "_logCategory", "_logDestination", "Lb11/m;", "mealViewNavArgs", "<init>", "(Ljava/lang/String;Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lb11/m;)V", "Lb63/u;", "dateTime", "Lg01/u;", "source", "Li01/i;", "logCategory", "Lj11/c;", "logDestination", "(Lb63/u;Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Lg01/u;Li01/i;Lj11/c;Lb11/m;)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lb11/m;Lm63/u1;)V", "Companion", "a", "b", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @i63.h
    public static final /* data */ class a extends l4 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f14830b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f14831c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final double f14832d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final String f14833e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final String f14834f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final String f14835g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final boolean f14836h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final String f14837i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final String f14838j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final String f14839k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final String f14840l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final b11.m f14841m;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final Parcelable.Creator<a> CREATOR = new c();

        /* JADX INFO: renamed from: b21.l4$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/nutrition/presentation/navigation/NutritionRoute.AddFood.$serializer", "Lm63/e0;", "Lb21/l4$a;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        @o13.e
        public static final /* synthetic */ class C0213a implements m63.e0<a> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0213a f14842a;
            private static final k63.e descriptor;

            static {
                C0213a c0213a = new C0213a();
                f14842a = c0213a;
                m63.m1 m1Var = new m63.m1("com.garmin.android.apps.connectmobile.nutrition.presentation.navigation.NutritionRoute.AddFood", c0213a, 12);
                m1Var.j("_dateTime", false);
                m1Var.j("foodId", false);
                m1Var.j("servingQty", false);
                m1Var.j("servingId", false);
                m1Var.j("regionCode", false);
                m1Var.j(RemoteConfigConstants.RequestFieldKey.LANGUAGE_CODE, false);
                m1Var.j("allowEditing", false);
                m1Var.j("scannedBarcode", true);
                m1Var.j("_source", false);
                m1Var.j("_logCategory", false);
                m1Var.j("_logDestination", false);
                m1Var.j("mealViewNavArgs", false);
                descriptor = m1Var;
            }

            private C0213a() {
            }

            @Override // m63.e0
            public final i63.c<?>[] childSerializers() {
                m63.y1 y1Var = m63.y1.f117048a;
                return new i63.c[]{y1Var, y1Var, m63.x.f117036a, j63.a.d(y1Var), y1Var, y1Var, m63.g.f116948a, j63.a.d(y1Var), y1Var, y1Var, y1Var, b11.m.a.f14340a};
            }

            @Override // i63.b
            public final Object deserialize(l63.e eVar) {
                eVar.getClass();
                k63.e eVar2 = descriptor;
                l63.c cVarC = eVar.c(eVar2);
                int i14 = l63.c.f110557a;
                Object obj = null;
                b11.m mVar = null;
                String strR = null;
                String strR2 = null;
                String str = null;
                String strR3 = null;
                String strR4 = null;
                String strR5 = null;
                String strR6 = null;
                String strR7 = null;
                double dT = 0.0d;
                int i15 = 0;
                boolean zG = false;
                boolean z14 = true;
                String str2 = null;
                while (z14) {
                    int iE = cVarC.e(eVar2);
                    switch (iE) {
                        case -1:
                            z14 = false;
                            continue;
                        case 0:
                            strR = cVarC.r(eVar2, 0);
                            i15 |= 1;
                            break;
                        case 1:
                            strR2 = cVarC.r(eVar2, 1);
                            i15 |= 2;
                            break;
                        case 2:
                            dT = cVarC.t(eVar2, 2);
                            i15 |= 4;
                            break;
                        case 3:
                            str = (String) cVarC.v(eVar2, 3, m63.y1.f117048a, str);
                            i15 |= 8;
                            break;
                        case 4:
                            strR3 = cVarC.r(eVar2, 4);
                            i15 |= 16;
                            break;
                        case 5:
                            strR4 = cVarC.r(eVar2, 5);
                            i15 |= 32;
                            break;
                        case 6:
                            zG = cVarC.g(eVar2, 6);
                            i15 |= 64;
                            break;
                        case 7:
                            str2 = (String) cVarC.v(eVar2, 7, m63.y1.f117048a, str2);
                            i15 |= 128;
                            break;
                        case 8:
                            strR5 = cVarC.r(eVar2, 8);
                            i15 |= 256;
                            break;
                        case 9:
                            strR6 = cVarC.r(eVar2, 9);
                            i15 |= 512;
                            break;
                        case 10:
                            strR7 = cVarC.r(eVar2, 10);
                            i15 |= 1024;
                            break;
                        case 11:
                            mVar = (b11.m) cVarC.l(eVar2, 11, b11.m.a.f14340a, mVar);
                            i15 |= 2048;
                            break;
                        default:
                            hb.a.o(iE);
                            return obj;
                    }
                    obj = null;
                }
                cVarC.b(eVar2);
                return new a(i15, strR, strR2, dT, str, strR3, strR4, zG, str2, strR5, strR6, strR7, mVar, (m63.u1) null);
            }

            @Override // i63.i, i63.b
            /* JADX INFO: renamed from: getDescriptor */
            public final k63.e getF158591b() {
                return descriptor;
            }

            @Override // i63.i
            public final void serialize(l63.f fVar, Object obj) {
                a aVar = (a) obj;
                aVar.getClass();
                k63.e eVar = descriptor;
                l63.d dVarC = fVar.c(eVar);
                String str = aVar.f14830b;
                String str2 = aVar.f14837i;
                dVarC.k(eVar, 0, str);
                dVarC.k(eVar, 1, aVar.f14831c);
                dVarC.B(eVar, 2, aVar.f14832d);
                m63.y1 y1Var = m63.y1.f117048a;
                dVarC.d(eVar, 3, y1Var, aVar.f14833e);
                dVarC.k(eVar, 4, aVar.f14834f);
                dVarC.k(eVar, 5, aVar.f14835g);
                dVarC.n(eVar, 6, aVar.f14836h);
                if (dVarC.C(eVar) || str2 != null) {
                    dVarC.d(eVar, 7, y1Var, str2);
                }
                dVarC.k(eVar, 8, aVar.f14838j);
                dVarC.k(eVar, 9, aVar.f14839k);
                dVarC.k(eVar, 10, aVar.f14840l);
                dVarC.e(eVar, 11, b11.m.a.f14340a, aVar.f14841m);
                dVarC.b(eVar);
            }
        }

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class c implements Parcelable.Creator<a> {
            @Override // android.os.Parcelable.Creator
            public final a createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new a(parcel.readString(), parcel.readString(), parcel.readDouble(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), b11.m.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final a[] newArray(int i14) {
                return new a[i14];
            }
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public a(b63.u uVar, String str, double d14, String str2, String str3, String str4, boolean z14, String str5, g01.u uVar2, i01.i iVar, j11.c cVar, b11.m mVar) {
            this(uVar.toString(), str, d14, str2, str3, str4, z14, str5, uVar2.name(), iVar.f86776a, cVar.name(), mVar);
            uVar.getClass();
            str.getClass();
            str3.getClass();
            str4.getClass();
            uVar2.getClass();
            iVar.getClass();
            cVar.getClass();
            mVar.getClass();
        }

        public final j11.c b() {
            w13.c cVar = j11.c.f96417f;
            p13.c.b bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar, cVar);
            while (bVarN.hasNext()) {
                j11.c cVar2 = (j11.c) bVarN.next();
                if (p005kotlin.jvm.internal.s.g(cVar2.name(), this.f14840l)) {
                    return cVar2;
                }
            }
            n23.j.s("Collection contains no element matching the predicate.");
            return null;
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
            return p005kotlin.jvm.internal.s.g(this.f14830b, aVar.f14830b) && p005kotlin.jvm.internal.s.g(this.f14831c, aVar.f14831c) && Double.compare(this.f14832d, aVar.f14832d) == 0 && p005kotlin.jvm.internal.s.g(this.f14833e, aVar.f14833e) && p005kotlin.jvm.internal.s.g(this.f14834f, aVar.f14834f) && p005kotlin.jvm.internal.s.g(this.f14835g, aVar.f14835g) && this.f14836h == aVar.f14836h && p005kotlin.jvm.internal.s.g(this.f14837i, aVar.f14837i) && p005kotlin.jvm.internal.s.g(this.f14838j, aVar.f14838j) && p005kotlin.jvm.internal.s.g(this.f14839k, aVar.f14839k) && p005kotlin.jvm.internal.s.g(this.f14840l, aVar.f14840l) && p005kotlin.jvm.internal.s.g(this.f14841m, aVar.f14841m);
        }

        public final int hashCode() {
            int iB = org.apache.commons.lang3.e.b(wr.g.j(this.f14830b.hashCode() * 31, 31, this.f14831c), 31, this.f14832d);
            String str = this.f14833e;
            int iG = q6.f.g(wr.g.j(wr.g.j((iB + (str == null ? 0 : str.hashCode())) * 31, 31, this.f14834f), 31, this.f14835g), 31, this.f14836h);
            String str2 = this.f14837i;
            return this.f14841m.hashCode() + wr.g.j(wr.g.j(wr.g.j((iG + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.f14838j), 31, this.f14839k), 31, this.f14840l);
        }

        public final String toString() {
            StringBuilder sbI = p6.b.i("AddFood(_dateTime=", this.f14830b, ", foodId=", this.f14831c, ", servingQty=");
            sbI.append(this.f14832d);
            sbI.append(", servingId=");
            sbI.append(this.f14833e);
            sn.a.t(sbI, ", regionCode=", this.f14834f, ", languageCode=", this.f14835g);
            sbI.append(", allowEditing=");
            sbI.append(this.f14836h);
            sbI.append(", scannedBarcode=");
            sbI.append(this.f14837i);
            sn.a.t(sbI, ", _source=", this.f14838j, ", _logCategory=", this.f14839k);
            sbI.append(", _logDestination=");
            sbI.append(this.f14840l);
            sbI.append(", mealViewNavArgs=");
            sbI.append(this.f14841m);
            sbI.append(")");
            return sbI.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i14) {
            parcel.getClass();
            parcel.writeString(this.f14830b);
            parcel.writeString(this.f14831c);
            parcel.writeDouble(this.f14832d);
            parcel.writeString(this.f14833e);
            parcel.writeString(this.f14834f);
            parcel.writeString(this.f14835g);
            parcel.writeInt(this.f14836h ? 1 : 0);
            parcel.writeString(this.f14837i);
            parcel.writeString(this.f14838j);
            parcel.writeString(this.f14839k);
            parcel.writeString(this.f14840l);
            this.f14841m.writeToParcel(parcel, i14);
        }

        /* JADX INFO: renamed from: b21.l4$a$b, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lb21/l4$a$b;", "", "<init>", "()V", "Li63/c;", "Lb21/l4$a;", "serializer", "()Li63/c;", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
                this();
            }

            public final i63.c<a> serializer() {
                return C0213a.f14842a;
            }

            private Companion() {
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ a(int i14, String str, String str2, double d14, String str3, String str4, String str5, boolean z14, String str6, String str7, String str8, String str9, b11.m mVar, m63.u1 u1Var) {
            super(i14, u1Var);
            if (3967 != (i14 & 3967)) {
                m63.k1.h(i14, 3967, C0213a.f14842a.getF158591b());
                throw null;
            }
            this.f14830b = str;
            this.f14831c = str2;
            this.f14832d = d14;
            this.f14833e = str3;
            this.f14834f = str4;
            this.f14835g = str5;
            this.f14836h = z14;
            if ((i14 & 128) == 0) {
                this.f14837i = null;
            } else {
                this.f14837i = str6;
            }
            this.f14838j = str7;
            this.f14839k = str8;
            this.f14840l = str9;
            this.f14841m = mVar;
        }

        public /* synthetic */ a(String str, String str2, double d14, String str3, String str4, String str5, boolean z14, String str6, String str7, String str8, String str9, b11.m mVar, int i14, p005kotlin.jvm.internal.j jVar) {
            this(str, str2, d14, str3, str4, str5, z14, (i14 & 128) != 0 ? null : str6, str7, str8, str9, mVar);
        }

        public /* synthetic */ a(b63.u uVar, String str, double d14, String str2, String str3, String str4, boolean z14, String str5, g01.u uVar2, i01.i iVar, j11.c cVar, b11.m mVar, int i14, p005kotlin.jvm.internal.j jVar) {
            this(uVar, str, d14, str2, str3, str4, z14, (i14 & 128) != 0 ? null : str5, uVar2, iVar, cVar, mVar);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, String str2, double d14, String str3, String str4, String str5, boolean z14, String str6, String str7, String str8, String str9, b11.m mVar) {
            super(null);
            hb.a.p(str, str2, str4, str5, str7);
            str8.getClass();
            str9.getClass();
            mVar.getClass();
            this.f14830b = str;
            this.f14831c = str2;
            this.f14832d = d14;
            this.f14833e = str3;
            this.f14834f = str4;
            this.f14835g = str5;
            this.f14836h = z14;
            this.f14837i = str6;
            this.f14838j = str7;
            this.f14839k = str8;
            this.f14840l = str9;
            this.f14841m = mVar;
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \f2\u00020\u0001:\u0002\r\u000eB\u001d\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B-\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0006\u0010\u000b¨\u0006\u000f"}, d2 = {"Lb21/l4$a0;", "Lb21/l4;", "", "initialWarningShown", "", "calories", "<init>", "(ZLjava/lang/Integer;)V", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(IZLjava/lang/Integer;Lm63/u1;)V", "Companion", "a", "b", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @i63.h
    public static final /* data */ class a0 extends l4 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f14843b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Integer f14844c;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final Parcelable.Creator<a0> CREATOR = new c();

        @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/nutrition/presentation/navigation/NutritionRoute.NutritionEditDailyCaloriesGoal.$serializer", "Lm63/e0;", "Lb21/l4$a0;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        @o13.e
        public static final /* synthetic */ class a implements m63.e0<a0> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f14845a;
            private static final k63.e descriptor;

            static {
                a aVar = new a();
                f14845a = aVar;
                m63.m1 m1Var = new m63.m1("com.garmin.android.apps.connectmobile.nutrition.presentation.navigation.NutritionRoute.NutritionEditDailyCaloriesGoal", aVar, 2);
                m1Var.j("initialWarningShown", true);
                m1Var.j("calories", true);
                descriptor = m1Var;
            }

            private a() {
            }

            @Override // m63.e0
            public final i63.c<?>[] childSerializers() {
                return new i63.c[]{m63.g.f116948a, j63.a.d(m63.m0.f116981a)};
            }

            @Override // i63.b
            public final Object deserialize(l63.e eVar) {
                eVar.getClass();
                k63.e eVar2 = descriptor;
                l63.c cVarC = eVar.c(eVar2);
                int i14 = l63.c.f110557a;
                m63.u1 u1Var = null;
                boolean z14 = true;
                int i15 = 0;
                boolean zG = false;
                Integer num = null;
                while (z14) {
                    int iE = cVarC.e(eVar2);
                    if (iE == -1) {
                        z14 = false;
                    } else if (iE == 0) {
                        zG = cVarC.g(eVar2, 0);
                        i15 |= 1;
                    } else {
                        if (iE != 1) {
                            hb.a.o(iE);
                            return null;
                        }
                        num = (Integer) cVarC.v(eVar2, 1, m63.m0.f116981a, num);
                        i15 |= 2;
                    }
                }
                cVarC.b(eVar2);
                return new a0(i15, zG, num, u1Var);
            }

            @Override // i63.i, i63.b
            /* JADX INFO: renamed from: getDescriptor */
            public final k63.e getF158591b() {
                return descriptor;
            }

            @Override // i63.i
            public final void serialize(l63.f fVar, Object obj) {
                a0 a0Var = (a0) obj;
                a0Var.getClass();
                Integer num = a0Var.f14844c;
                boolean z14 = a0Var.f14843b;
                k63.e eVar = descriptor;
                l63.d dVarC = fVar.c(eVar);
                if (dVarC.C(eVar) || z14) {
                    dVarC.n(eVar, 0, z14);
                }
                if (dVarC.C(eVar) || num != null) {
                    dVarC.d(eVar, 1, m63.m0.f116981a, num);
                }
                dVarC.b(eVar);
            }
        }

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class c implements Parcelable.Creator<a0> {
            @Override // android.os.Parcelable.Creator
            public final a0 createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new a0(parcel.readInt() != 0, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
            }

            @Override // android.os.Parcelable.Creator
            public final a0[] newArray(int i14) {
                return new a0[i14];
            }
        }

        public /* synthetic */ a0(int i14, boolean z14, Integer num, m63.u1 u1Var) {
            super(i14, u1Var);
            this.f14843b = (i14 & 1) == 0 ? false : z14;
            if ((i14 & 2) == 0) {
                this.f14844c = null;
            } else {
                this.f14844c = num;
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a0)) {
                return false;
            }
            a0 a0Var = (a0) obj;
            return this.f14843b == a0Var.f14843b && p005kotlin.jvm.internal.s.g(this.f14844c, a0Var.f14844c);
        }

        public final int hashCode() {
            int iHashCode = Boolean.hashCode(this.f14843b) * 31;
            Integer num = this.f14844c;
            return iHashCode + (num == null ? 0 : num.hashCode());
        }

        public final String toString() {
            return "NutritionEditDailyCaloriesGoal(initialWarningShown=" + this.f14843b + ", calories=" + this.f14844c + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i14) {
            parcel.getClass();
            parcel.writeInt(this.f14843b ? 1 : 0);
            Integer num = this.f14844c;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                kg.f.k(parcel, 1, num);
            }
        }

        /* JADX INFO: renamed from: b21.l4$a0$b, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lb21/l4$a0$b;", "", "<init>", "()V", "Li63/c;", "Lb21/l4$a0;", "serializer", "()Li63/c;", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
                this();
            }

            public final i63.c<a0> serializer() {
                return a.f14845a;
            }

            private Companion() {
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a0() {
            this(false, (Integer) null, 3, (p005kotlin.jvm.internal.j) (0 == true ? 1 : 0));
        }

        public a0(boolean z14, Integer num) {
            super(null);
            this.f14843b = z14;
            this.f14844c = num;
        }

        public /* synthetic */ a0(boolean z14, Integer num, int i14, p005kotlin.jvm.internal.j jVar) {
            this((i14 & 1) != 0 ? false : z14, (i14 & 2) != 0 ? null : num);
        }
    }

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u001b2\u00020\u0001:\u0002\u001c\u001dBG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eBI\b\u0016\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u0015Bi\b\u0010\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\r\u0010\u001a¨\u0006\u001e"}, d2 = {"Lb21/l4$b;", "Lb21/l4;", "", "_dateTime", "foodId", "", "servingQty", "regionCode", RemoteConfigConstants.RequestFieldKey.LANGUAGE_CODE, "_logCategory", "_logDestination", "Lb11/m;", "mealViewNavArgs", "<init>", "(Ljava/lang/String;Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lb11/m;)V", "Lb63/u;", "dateTime", "Li01/i;", "logCategory", "Lj11/c;", "logDestination", "(Lb63/u;Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;Li01/i;Lj11/c;Lb11/m;)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lb11/m;Lm63/u1;)V", "Companion", "a", "b", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @i63.h
    public static final /* data */ class b extends l4 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f14846b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f14847c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final double f14848d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final String f14849e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final String f14850f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final String f14851g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final String f14852h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final b11.m f14853i;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final Parcelable.Creator<b> CREATOR = new c();

        @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/nutrition/presentation/navigation/NutritionRoute.AddRecipe.$serializer", "Lm63/e0;", "Lb21/l4$b;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        @o13.e
        public static final /* synthetic */ class a implements m63.e0<b> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f14854a;
            private static final k63.e descriptor;

            static {
                a aVar = new a();
                f14854a = aVar;
                m63.m1 m1Var = new m63.m1("com.garmin.android.apps.connectmobile.nutrition.presentation.navigation.NutritionRoute.AddRecipe", aVar, 8);
                m1Var.j("_dateTime", false);
                m1Var.j("foodId", false);
                m1Var.j("servingQty", false);
                m1Var.j("regionCode", false);
                m1Var.j(RemoteConfigConstants.RequestFieldKey.LANGUAGE_CODE, false);
                m1Var.j("_logCategory", false);
                m1Var.j("_logDestination", false);
                m1Var.j("mealViewNavArgs", false);
                descriptor = m1Var;
            }

            private a() {
            }

            @Override // m63.e0
            public final i63.c<?>[] childSerializers() {
                m63.y1 y1Var = m63.y1.f117048a;
                return new i63.c[]{y1Var, y1Var, m63.x.f117036a, y1Var, y1Var, y1Var, y1Var, b11.m.a.f14340a};
            }

            @Override // i63.b
            public final Object deserialize(l63.e eVar) {
                eVar.getClass();
                k63.e eVar2 = descriptor;
                l63.c cVarC = eVar.c(eVar2);
                int i14 = l63.c.f110557a;
                Object obj = null;
                int i15 = 0;
                String strR = null;
                String strR2 = null;
                String strR3 = null;
                String strR4 = null;
                String strR5 = null;
                String strR6 = null;
                double dT = 0.0d;
                boolean z14 = true;
                b11.m mVar = null;
                while (z14) {
                    int iE = cVarC.e(eVar2);
                    switch (iE) {
                        case -1:
                            z14 = false;
                            continue;
                        case 0:
                            strR = cVarC.r(eVar2, 0);
                            i15 |= 1;
                            break;
                        case 1:
                            strR2 = cVarC.r(eVar2, 1);
                            i15 |= 2;
                            break;
                        case 2:
                            dT = cVarC.t(eVar2, 2);
                            i15 |= 4;
                            break;
                        case 3:
                            strR3 = cVarC.r(eVar2, 3);
                            i15 |= 8;
                            break;
                        case 4:
                            strR4 = cVarC.r(eVar2, 4);
                            i15 |= 16;
                            break;
                        case 5:
                            strR5 = cVarC.r(eVar2, 5);
                            i15 |= 32;
                            break;
                        case 6:
                            strR6 = cVarC.r(eVar2, 6);
                            i15 |= 64;
                            break;
                        case 7:
                            mVar = (b11.m) cVarC.l(eVar2, 7, b11.m.a.f14340a, mVar);
                            i15 |= 128;
                            break;
                        default:
                            hb.a.o(iE);
                            return obj;
                    }
                    obj = null;
                }
                cVarC.b(eVar2);
                return new b(i15, strR, strR2, dT, strR3, strR4, strR5, strR6, mVar, null);
            }

            @Override // i63.i, i63.b
            /* JADX INFO: renamed from: getDescriptor */
            public final k63.e getF158591b() {
                return descriptor;
            }

            @Override // i63.i
            public final void serialize(l63.f fVar, Object obj) {
                b bVar = (b) obj;
                bVar.getClass();
                k63.e eVar = descriptor;
                l63.d dVarC = fVar.c(eVar);
                dVarC.k(eVar, 0, bVar.f14846b);
                dVarC.k(eVar, 1, bVar.f14847c);
                dVarC.B(eVar, 2, bVar.f14848d);
                dVarC.k(eVar, 3, bVar.f14849e);
                dVarC.k(eVar, 4, bVar.f14850f);
                dVarC.k(eVar, 5, bVar.f14851g);
                dVarC.k(eVar, 6, bVar.f14852h);
                dVarC.e(eVar, 7, b11.m.a.f14340a, bVar.f14853i);
                dVarC.b(eVar);
            }
        }

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class c implements Parcelable.Creator<b> {
            @Override // android.os.Parcelable.Creator
            public final b createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new b(parcel.readString(), parcel.readString(), parcel.readDouble(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), b11.m.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final b[] newArray(int i14) {
                return new b[i14];
            }
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public b(b63.u uVar, String str, double d14, String str2, String str3, i01.i iVar, j11.c cVar, b11.m mVar) {
            this(uVar.toString(), str, d14, str2, str3, iVar.f86776a, cVar.name(), mVar);
            uVar.getClass();
            str.getClass();
            str2.getClass();
            str3.getClass();
            iVar.getClass();
            cVar.getClass();
            mVar.getClass();
        }

        public final j11.c b() {
            w13.c cVar = j11.c.f96417f;
            p13.c.b bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar, cVar);
            while (bVarN.hasNext()) {
                j11.c cVar2 = (j11.c) bVarN.next();
                if (p005kotlin.jvm.internal.s.g(cVar2.name(), this.f14852h)) {
                    return cVar2;
                }
            }
            n23.j.s("Collection contains no element matching the predicate.");
            return null;
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
            return p005kotlin.jvm.internal.s.g(this.f14846b, bVar.f14846b) && p005kotlin.jvm.internal.s.g(this.f14847c, bVar.f14847c) && Double.compare(this.f14848d, bVar.f14848d) == 0 && p005kotlin.jvm.internal.s.g(this.f14849e, bVar.f14849e) && p005kotlin.jvm.internal.s.g(this.f14850f, bVar.f14850f) && p005kotlin.jvm.internal.s.g(this.f14851g, bVar.f14851g) && p005kotlin.jvm.internal.s.g(this.f14852h, bVar.f14852h) && p005kotlin.jvm.internal.s.g(this.f14853i, bVar.f14853i);
        }

        public final int hashCode() {
            return this.f14853i.hashCode() + wr.g.j(wr.g.j(wr.g.j(wr.g.j(org.apache.commons.lang3.e.b(wr.g.j(this.f14846b.hashCode() * 31, 31, this.f14847c), 31, this.f14848d), 31, this.f14849e), 31, this.f14850f), 31, this.f14851g), 31, this.f14852h);
        }

        public final String toString() {
            StringBuilder sbI = p6.b.i("AddRecipe(_dateTime=", this.f14846b, ", foodId=", this.f14847c, ", servingQty=");
            sbI.append(this.f14848d);
            sbI.append(", regionCode=");
            sbI.append(this.f14849e);
            sn.a.t(sbI, ", languageCode=", this.f14850f, ", _logCategory=", this.f14851g);
            sbI.append(", _logDestination=");
            sbI.append(this.f14852h);
            sbI.append(", mealViewNavArgs=");
            sbI.append(this.f14853i);
            sbI.append(")");
            return sbI.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i14) {
            parcel.getClass();
            parcel.writeString(this.f14846b);
            parcel.writeString(this.f14847c);
            parcel.writeDouble(this.f14848d);
            parcel.writeString(this.f14849e);
            parcel.writeString(this.f14850f);
            parcel.writeString(this.f14851g);
            parcel.writeString(this.f14852h);
            this.f14853i.writeToParcel(parcel, i14);
        }

        /* JADX INFO: renamed from: b21.l4$b$b, reason: collision with other inner class name and from kotlin metadata */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lb21/l4$b$b;", "", "<init>", "()V", "Li63/c;", "Lb21/l4$b;", "serializer", "()Li63/c;", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
                this();
            }

            public final i63.c<b> serializer() {
                return a.f14854a;
            }

            private Companion() {
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ b(int i14, String str, String str2, double d14, String str3, String str4, String str5, String str6, b11.m mVar, m63.u1 u1Var) {
            super(i14, u1Var);
            if (255 != (i14 & 255)) {
                m63.k1.h(i14, 255, a.f14854a.getF158591b());
                throw null;
            }
            this.f14846b = str;
            this.f14847c = str2;
            this.f14848d = d14;
            this.f14849e = str3;
            this.f14850f = str4;
            this.f14851g = str5;
            this.f14852h = str6;
            this.f14853i = mVar;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, String str2, double d14, String str3, String str4, String str5, String str6, b11.m mVar) {
            super(null);
            hb.a.p(str, str2, str3, str4, str5);
            str6.getClass();
            mVar.getClass();
            this.f14846b = str;
            this.f14847c = str2;
            this.f14848d = d14;
            this.f14849e = str3;
            this.f14850f = str4;
            this.f14851g = str5;
            this.f14852h = str6;
            this.f14853i = mVar;
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \f2\u00020\u0001:\u0002\r\u000eB\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0006\u0010\u000b¨\u0006\u000f"}, d2 = {"Lb21/l4$b0;", "Lb21/l4;", "", "calorieGoal", "Ls21/g;", "macroGoals", "<init>", "(Ljava/lang/Integer;Ls21/g;)V", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILjava/lang/Integer;Ls21/g;Lm63/u1;)V", "Companion", "a", "b", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @i63.h
    public static final /* data */ class b0 extends l4 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Integer f14855b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final s21.g f14856c;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final Parcelable.Creator<b0> CREATOR = new c();

        @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/nutrition/presentation/navigation/NutritionRoute.NutritionEditMacroGoals.$serializer", "Lm63/e0;", "Lb21/l4$b0;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        @o13.e
        public static final /* synthetic */ class a implements m63.e0<b0> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f14857a;
            private static final k63.e descriptor;

            static {
                a aVar = new a();
                f14857a = aVar;
                m63.m1 m1Var = new m63.m1("com.garmin.android.apps.connectmobile.nutrition.presentation.navigation.NutritionRoute.NutritionEditMacroGoals", aVar, 2);
                m1Var.j("calorieGoal", true);
                m1Var.j("macroGoals", true);
                descriptor = m1Var;
            }

            private a() {
            }

            @Override // m63.e0
            public final i63.c<?>[] childSerializers() {
                return new i63.c[]{j63.a.d(m63.m0.f116981a), j63.a.d(s21.g.a.f156118a)};
            }

            @Override // i63.b
            public final Object deserialize(l63.e eVar) {
                eVar.getClass();
                k63.e eVar2 = descriptor;
                l63.c cVarC = eVar.c(eVar2);
                int i14 = l63.c.f110557a;
                m63.u1 u1Var = null;
                boolean z14 = true;
                int i15 = 0;
                Integer num = null;
                s21.g gVar = null;
                while (z14) {
                    int iE = cVarC.e(eVar2);
                    if (iE == -1) {
                        z14 = false;
                    } else if (iE == 0) {
                        num = (Integer) cVarC.v(eVar2, 0, m63.m0.f116981a, num);
                        i15 |= 1;
                    } else {
                        if (iE != 1) {
                            hb.a.o(iE);
                            return null;
                        }
                        gVar = (s21.g) cVarC.v(eVar2, 1, s21.g.a.f156118a, gVar);
                        i15 |= 2;
                    }
                }
                cVarC.b(eVar2);
                return new b0(i15, num, gVar, u1Var);
            }

            @Override // i63.i, i63.b
            /* JADX INFO: renamed from: getDescriptor */
            public final k63.e getF158591b() {
                return descriptor;
            }

            @Override // i63.i
            public final void serialize(l63.f fVar, Object obj) {
                b0 b0Var = (b0) obj;
                b0Var.getClass();
                s21.g gVar = b0Var.f14856c;
                Integer num = b0Var.f14855b;
                k63.e eVar = descriptor;
                l63.d dVarC = fVar.c(eVar);
                if (dVarC.C(eVar) || num != null) {
                    dVarC.d(eVar, 0, m63.m0.f116981a, num);
                }
                if (dVarC.C(eVar) || gVar != null) {
                    dVarC.d(eVar, 1, s21.g.a.f156118a, gVar);
                }
                dVarC.b(eVar);
            }
        }

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class c implements Parcelable.Creator<b0> {
            @Override // android.os.Parcelable.Creator
            public final b0 createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new b0(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? s21.g.CREATOR.createFromParcel(parcel) : null);
            }

            @Override // android.os.Parcelable.Creator
            public final b0[] newArray(int i14) {
                return new b0[i14];
            }
        }

        public /* synthetic */ b0(int i14, Integer num, s21.g gVar, m63.u1 u1Var) {
            super(i14, u1Var);
            if ((i14 & 1) == 0) {
                this.f14855b = null;
            } else {
                this.f14855b = num;
            }
            if ((i14 & 2) == 0) {
                this.f14856c = null;
            } else {
                this.f14856c = gVar;
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b0)) {
                return false;
            }
            b0 b0Var = (b0) obj;
            return p005kotlin.jvm.internal.s.g(this.f14855b, b0Var.f14855b) && p005kotlin.jvm.internal.s.g(this.f14856c, b0Var.f14856c);
        }

        public final int hashCode() {
            Integer num = this.f14855b;
            int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
            s21.g gVar = this.f14856c;
            return iHashCode + (gVar != null ? gVar.hashCode() : 0);
        }

        public final String toString() {
            return "NutritionEditMacroGoals(calorieGoal=" + this.f14855b + ", macroGoals=" + this.f14856c + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i14) {
            parcel.getClass();
            Integer num = this.f14855b;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                kg.f.k(parcel, 1, num);
            }
            s21.g gVar = this.f14856c;
            if (gVar == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                gVar.writeToParcel(parcel, i14);
            }
        }

        /* JADX INFO: renamed from: b21.l4$b0$b, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lb21/l4$b0$b;", "", "<init>", "()V", "Li63/c;", "Lb21/l4$b0;", "serializer", "()Li63/c;", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
                this();
            }

            public final i63.c<b0> serializer() {
                return a.f14857a;
            }

            private Companion() {
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public b0() {
            this((Integer) null, (s21.g) (0 == true ? 1 : 0), 3, (p005kotlin.jvm.internal.j) (0 == true ? 1 : 0));
        }

        public b0(Integer num, s21.g gVar) {
            super(null);
            this.f14855b = num;
            this.f14856c = gVar;
        }

        public /* synthetic */ b0(Integer num, s21.g gVar, int i14, p005kotlin.jvm.internal.j jVar) {
            this((i14 & 1) != 0 ? null : num, (i14 & 2) != 0 ? null : gVar);
        }
    }

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u001c2\u00020\u0001:\u0002\u001d\u001eBO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fBQ\b\u0016\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u0016Bs\b\u0010\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u000e\u0010\u001b¨\u0006\u001f"}, d2 = {"Lb21/l4$c;", "Lb21/l4;", "", "_dateTime", "foodId", "consumableId", "", "servingQty", "regionCode", RemoteConfigConstants.RequestFieldKey.LANGUAGE_CODE, "_logCategory", "_logDestination", "Lb11/m;", "mealViewNavArgs", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lb11/m;)V", "Lb63/u;", "dateTime", "Li01/i;", "logCategory", "Lj11/c;", "logDestination", "(Lb63/u;Ljava/lang/String;Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;Li01/i;Lj11/c;Lb11/m;)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lb11/m;Lm63/u1;)V", "Companion", "a", "b", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @i63.h
    public static final /* data */ class c extends l4 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f14858b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f14859c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f14860d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final double f14861e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final String f14862f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final String f14863g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final String f14864h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final String f14865i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final b11.m f14866j;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final Parcelable.Creator<c> CREATOR = new C0215c();

        @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/nutrition/presentation/navigation/NutritionRoute.AddRecipeToResults.$serializer", "Lm63/e0;", "Lb21/l4$c;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        @o13.e
        public static final /* synthetic */ class a implements m63.e0<c> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f14867a;
            private static final k63.e descriptor;

            static {
                a aVar = new a();
                f14867a = aVar;
                m63.m1 m1Var = new m63.m1("com.garmin.android.apps.connectmobile.nutrition.presentation.navigation.NutritionRoute.AddRecipeToResults", aVar, 9);
                m1Var.j("_dateTime", false);
                m1Var.j("foodId", false);
                m1Var.j("consumableId", false);
                m1Var.j("servingQty", false);
                m1Var.j("regionCode", false);
                m1Var.j(RemoteConfigConstants.RequestFieldKey.LANGUAGE_CODE, false);
                m1Var.j("_logCategory", false);
                m1Var.j("_logDestination", false);
                m1Var.j("mealViewNavArgs", false);
                descriptor = m1Var;
            }

            private a() {
            }

            @Override // m63.e0
            public final i63.c<?>[] childSerializers() {
                m63.y1 y1Var = m63.y1.f117048a;
                return new i63.c[]{y1Var, y1Var, y1Var, m63.x.f117036a, y1Var, y1Var, y1Var, y1Var, b11.m.a.f14340a};
            }

            @Override // i63.b
            public final Object deserialize(l63.e eVar) {
                eVar.getClass();
                k63.e eVar2 = descriptor;
                l63.c cVarC = eVar.c(eVar2);
                int i14 = l63.c.f110557a;
                Object obj = null;
                int i15 = 0;
                String strR = null;
                String strR2 = null;
                String strR3 = null;
                String strR4 = null;
                String strR5 = null;
                String strR6 = null;
                String strR7 = null;
                double dT = 0.0d;
                boolean z14 = true;
                b11.m mVar = null;
                while (z14) {
                    int iE = cVarC.e(eVar2);
                    switch (iE) {
                        case -1:
                            z14 = false;
                            continue;
                        case 0:
                            strR = cVarC.r(eVar2, 0);
                            i15 |= 1;
                            break;
                        case 1:
                            strR2 = cVarC.r(eVar2, 1);
                            i15 |= 2;
                            break;
                        case 2:
                            strR3 = cVarC.r(eVar2, 2);
                            i15 |= 4;
                            break;
                        case 3:
                            dT = cVarC.t(eVar2, 3);
                            i15 |= 8;
                            break;
                        case 4:
                            strR4 = cVarC.r(eVar2, 4);
                            i15 |= 16;
                            break;
                        case 5:
                            strR5 = cVarC.r(eVar2, 5);
                            i15 |= 32;
                            break;
                        case 6:
                            strR6 = cVarC.r(eVar2, 6);
                            i15 |= 64;
                            break;
                        case 7:
                            strR7 = cVarC.r(eVar2, 7);
                            i15 |= 128;
                            break;
                        case 8:
                            mVar = (b11.m) cVarC.l(eVar2, 8, b11.m.a.f14340a, mVar);
                            i15 |= 256;
                            break;
                        default:
                            hb.a.o(iE);
                            return obj;
                    }
                    obj = null;
                }
                cVarC.b(eVar2);
                return new c(i15, strR, strR2, strR3, dT, strR4, strR5, strR6, strR7, mVar, null);
            }

            @Override // i63.i, i63.b
            /* JADX INFO: renamed from: getDescriptor */
            public final k63.e getF158591b() {
                return descriptor;
            }

            @Override // i63.i
            public final void serialize(l63.f fVar, Object obj) {
                c cVar = (c) obj;
                cVar.getClass();
                k63.e eVar = descriptor;
                l63.d dVarC = fVar.c(eVar);
                dVarC.k(eVar, 0, cVar.f14858b);
                dVarC.k(eVar, 1, cVar.f14859c);
                dVarC.k(eVar, 2, cVar.f14860d);
                dVarC.B(eVar, 3, cVar.f14861e);
                dVarC.k(eVar, 4, cVar.f14862f);
                dVarC.k(eVar, 5, cVar.f14863g);
                dVarC.k(eVar, 6, cVar.f14864h);
                dVarC.k(eVar, 7, cVar.f14865i);
                dVarC.e(eVar, 8, b11.m.a.f14340a, cVar.f14866j);
                dVarC.b(eVar);
            }
        }

        /* JADX INFO: renamed from: b21.l4$c$c, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class C0215c implements Parcelable.Creator<c> {
            @Override // android.os.Parcelable.Creator
            public final c createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new c(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readDouble(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), b11.m.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final c[] newArray(int i14) {
                return new c[i14];
            }
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public c(b63.u uVar, String str, String str2, double d14, String str3, String str4, i01.i iVar, j11.c cVar, b11.m mVar) {
            this(uVar.toString(), str, str2, d14, str3, str4, iVar.f86776a, cVar.name(), mVar);
            uVar.getClass();
            str.getClass();
            str2.getClass();
            str3.getClass();
            str4.getClass();
            iVar.getClass();
            cVar.getClass();
            mVar.getClass();
        }

        public final j11.c b() {
            w13.c cVar = j11.c.f96417f;
            p13.c.b bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar, cVar);
            while (bVarN.hasNext()) {
                j11.c cVar2 = (j11.c) bVarN.next();
                if (p005kotlin.jvm.internal.s.g(cVar2.name(), this.f14865i)) {
                    return cVar2;
                }
            }
            n23.j.s("Collection contains no element matching the predicate.");
            return null;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return p005kotlin.jvm.internal.s.g(this.f14858b, cVar.f14858b) && p005kotlin.jvm.internal.s.g(this.f14859c, cVar.f14859c) && p005kotlin.jvm.internal.s.g(this.f14860d, cVar.f14860d) && Double.compare(this.f14861e, cVar.f14861e) == 0 && p005kotlin.jvm.internal.s.g(this.f14862f, cVar.f14862f) && p005kotlin.jvm.internal.s.g(this.f14863g, cVar.f14863g) && p005kotlin.jvm.internal.s.g(this.f14864h, cVar.f14864h) && p005kotlin.jvm.internal.s.g(this.f14865i, cVar.f14865i) && p005kotlin.jvm.internal.s.g(this.f14866j, cVar.f14866j);
        }

        public final int hashCode() {
            return this.f14866j.hashCode() + wr.g.j(wr.g.j(wr.g.j(wr.g.j(org.apache.commons.lang3.e.b(wr.g.j(wr.g.j(this.f14858b.hashCode() * 31, 31, this.f14859c), 31, this.f14860d), 31, this.f14861e), 31, this.f14862f), 31, this.f14863g), 31, this.f14864h), 31, this.f14865i);
        }

        public final String toString() {
            StringBuilder sbI = p6.b.i("AddRecipeToResults(_dateTime=", this.f14858b, ", foodId=", this.f14859c, ", consumableId=");
            sbI.append(this.f14860d);
            sbI.append(", servingQty=");
            sbI.append(this.f14861e);
            sn.a.t(sbI, ", regionCode=", this.f14862f, ", languageCode=", this.f14863g);
            sn.a.t(sbI, ", _logCategory=", this.f14864h, ", _logDestination=", this.f14865i);
            sbI.append(", mealViewNavArgs=");
            sbI.append(this.f14866j);
            sbI.append(")");
            return sbI.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i14) {
            parcel.getClass();
            parcel.writeString(this.f14858b);
            parcel.writeString(this.f14859c);
            parcel.writeString(this.f14860d);
            parcel.writeDouble(this.f14861e);
            parcel.writeString(this.f14862f);
            parcel.writeString(this.f14863g);
            parcel.writeString(this.f14864h);
            parcel.writeString(this.f14865i);
            this.f14866j.writeToParcel(parcel, i14);
        }

        /* JADX INFO: renamed from: b21.l4$c$b, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lb21/l4$c$b;", "", "<init>", "()V", "Li63/c;", "Lb21/l4$c;", "serializer", "()Li63/c;", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
                this();
            }

            public final i63.c<c> serializer() {
                return a.f14867a;
            }

            private Companion() {
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ c(int i14, String str, String str2, String str3, double d14, String str4, String str5, String str6, String str7, b11.m mVar, m63.u1 u1Var) {
            super(i14, u1Var);
            if (511 != (i14 & 511)) {
                m63.k1.h(i14, 511, a.f14867a.getF158591b());
                throw null;
            }
            this.f14858b = str;
            this.f14859c = str2;
            this.f14860d = str3;
            this.f14861e = d14;
            this.f14862f = str4;
            this.f14863g = str5;
            this.f14864h = str6;
            this.f14865i = str7;
            this.f14866j = mVar;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, String str2, String str3, double d14, String str4, String str5, String str6, String str7, b11.m mVar) {
            super(null);
            hb.a.p(str, str2, str3, str4, str5);
            str6.getClass();
            str7.getClass();
            mVar.getClass();
            this.f14858b = str;
            this.f14859c = str2;
            this.f14860d = str3;
            this.f14861e = d14;
            this.f14862f = str4;
            this.f14863g = str5;
            this.f14864h = str6;
            this.f14865i = str7;
            this.f14866j = mVar;
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u000b2\u00020\u0001:\u0002\f\rB\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\n¨\u0006\u000e"}, d2 = {"Lb21/l4$c0;", "Lb21/l4;", "Ls21/o;", "micronutrientsSettings", "<init>", "(Ls21/o;)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILs21/o;Lm63/u1;)V", "Companion", "a", "b", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @i63.h
    public static final /* data */ class c0 extends l4 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final s21.o f14868b;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final Parcelable.Creator<c0> CREATOR = new c();

        @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/nutrition/presentation/navigation/NutritionRoute.NutritionEditMicronutrients.$serializer", "Lm63/e0;", "Lb21/l4$c0;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        @o13.e
        public static final /* synthetic */ class a implements m63.e0<c0> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f14869a;
            private static final k63.e descriptor;

            static {
                a aVar = new a();
                f14869a = aVar;
                m63.m1 m1Var = new m63.m1("com.garmin.android.apps.connectmobile.nutrition.presentation.navigation.NutritionRoute.NutritionEditMicronutrients", aVar, 1);
                m1Var.j("micronutrientsSettings", true);
                descriptor = m1Var;
            }

            private a() {
            }

            @Override // m63.e0
            public final i63.c<?>[] childSerializers() {
                return new i63.c[]{j63.a.d(s21.o.a.f156161a)};
            }

            @Override // i63.b
            public final Object deserialize(l63.e eVar) {
                eVar.getClass();
                k63.e eVar2 = descriptor;
                l63.c cVarC = eVar.c(eVar2);
                int i14 = l63.c.f110557a;
                m63.u1 u1Var = null;
                boolean z14 = true;
                int i15 = 0;
                s21.o oVar = null;
                while (z14) {
                    int iE = cVarC.e(eVar2);
                    if (iE == -1) {
                        z14 = false;
                    } else {
                        if (iE != 0) {
                            hb.a.o(iE);
                            return null;
                        }
                        oVar = (s21.o) cVarC.v(eVar2, 0, s21.o.a.f156161a, oVar);
                        i15 = 1;
                    }
                }
                cVarC.b(eVar2);
                return new c0(i15, oVar, u1Var);
            }

            @Override // i63.i, i63.b
            /* JADX INFO: renamed from: getDescriptor */
            public final k63.e getF158591b() {
                return descriptor;
            }

            @Override // i63.i
            public final void serialize(l63.f fVar, Object obj) {
                c0 c0Var = (c0) obj;
                c0Var.getClass();
                s21.o oVar = c0Var.f14868b;
                k63.e eVar = descriptor;
                l63.d dVarC = fVar.c(eVar);
                if (dVarC.C(eVar) || oVar != null) {
                    dVarC.d(eVar, 0, s21.o.a.f156161a, oVar);
                }
                dVarC.b(eVar);
            }
        }

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class c implements Parcelable.Creator<c0> {
            @Override // android.os.Parcelable.Creator
            public final c0 createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new c0(parcel.readInt() == 0 ? null : s21.o.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final c0[] newArray(int i14) {
                return new c0[i14];
            }
        }

        public /* synthetic */ c0(int i14, s21.o oVar, m63.u1 u1Var) {
            super(i14, u1Var);
            if ((i14 & 1) == 0) {
                this.f14868b = null;
            } else {
                this.f14868b = oVar;
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c0) && p005kotlin.jvm.internal.s.g(this.f14868b, ((c0) obj).f14868b);
        }

        public final int hashCode() {
            s21.o oVar = this.f14868b;
            if (oVar == null) {
                return 0;
            }
            return oVar.hashCode();
        }

        public final String toString() {
            return "NutritionEditMicronutrients(micronutrientsSettings=" + this.f14868b + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i14) {
            parcel.getClass();
            s21.o oVar = this.f14868b;
            if (oVar == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                oVar.writeToParcel(parcel, i14);
            }
        }

        /* JADX INFO: renamed from: b21.l4$c0$b, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lb21/l4$c0$b;", "", "<init>", "()V", "Li63/c;", "Lb21/l4$c0;", "serializer", "()Li63/c;", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
                this();
            }

            public final i63.c<c0> serializer() {
                return a.f14869a;
            }

            private Companion() {
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public c0() {
            this((s21.o) null, 1, (p005kotlin.jvm.internal.j) (0 == true ? 1 : 0));
        }

        public c0(s21.o oVar) {
            super(null);
            this.f14868b = oVar;
        }

        public /* synthetic */ c0(s21.o oVar, int i14, p005kotlin.jvm.internal.j jVar) {
            this((i14 & 1) != 0 ? null : oVar);
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u000b2\u00020\u0001:\u0002\f\rB\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\n¨\u0006\u000e"}, d2 = {"Lb21/l4$d0;", "Lb21/l4;", "Ls21/o;", "micronutrientsSettings", "<init>", "(Ls21/o;)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILs21/o;Lm63/u1;)V", "Companion", "a", "b", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @i63.h
    public static final /* data */ class d0 extends l4 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final s21.o f14870b;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final Parcelable.Creator<d0> CREATOR = new c();

        @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/nutrition/presentation/navigation/NutritionRoute.NutritionMicronutrients.$serializer", "Lm63/e0;", "Lb21/l4$d0;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        @o13.e
        public static final /* synthetic */ class a implements m63.e0<d0> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f14871a;
            private static final k63.e descriptor;

            static {
                a aVar = new a();
                f14871a = aVar;
                m63.m1 m1Var = new m63.m1("com.garmin.android.apps.connectmobile.nutrition.presentation.navigation.NutritionRoute.NutritionMicronutrients", aVar, 1);
                m1Var.j("micronutrientsSettings", true);
                descriptor = m1Var;
            }

            private a() {
            }

            @Override // m63.e0
            public final i63.c<?>[] childSerializers() {
                return new i63.c[]{j63.a.d(s21.o.a.f156161a)};
            }

            @Override // i63.b
            public final Object deserialize(l63.e eVar) {
                eVar.getClass();
                k63.e eVar2 = descriptor;
                l63.c cVarC = eVar.c(eVar2);
                int i14 = l63.c.f110557a;
                m63.u1 u1Var = null;
                boolean z14 = true;
                int i15 = 0;
                s21.o oVar = null;
                while (z14) {
                    int iE = cVarC.e(eVar2);
                    if (iE == -1) {
                        z14 = false;
                    } else {
                        if (iE != 0) {
                            hb.a.o(iE);
                            return null;
                        }
                        oVar = (s21.o) cVarC.v(eVar2, 0, s21.o.a.f156161a, oVar);
                        i15 = 1;
                    }
                }
                cVarC.b(eVar2);
                return new d0(i15, oVar, u1Var);
            }

            @Override // i63.i, i63.b
            /* JADX INFO: renamed from: getDescriptor */
            public final k63.e getF158591b() {
                return descriptor;
            }

            @Override // i63.i
            public final void serialize(l63.f fVar, Object obj) {
                d0 d0Var = (d0) obj;
                d0Var.getClass();
                s21.o oVar = d0Var.f14870b;
                k63.e eVar = descriptor;
                l63.d dVarC = fVar.c(eVar);
                if (dVarC.C(eVar) || oVar != null) {
                    dVarC.d(eVar, 0, s21.o.a.f156161a, oVar);
                }
                dVarC.b(eVar);
            }
        }

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class c implements Parcelable.Creator<d0> {
            @Override // android.os.Parcelable.Creator
            public final d0 createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new d0(parcel.readInt() == 0 ? null : s21.o.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final d0[] newArray(int i14) {
                return new d0[i14];
            }
        }

        public /* synthetic */ d0(int i14, s21.o oVar, m63.u1 u1Var) {
            super(i14, u1Var);
            if ((i14 & 1) == 0) {
                this.f14870b = null;
            } else {
                this.f14870b = oVar;
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d0) && p005kotlin.jvm.internal.s.g(this.f14870b, ((d0) obj).f14870b);
        }

        public final int hashCode() {
            s21.o oVar = this.f14870b;
            if (oVar == null) {
                return 0;
            }
            return oVar.hashCode();
        }

        public final String toString() {
            return "NutritionMicronutrients(micronutrientsSettings=" + this.f14870b + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i14) {
            parcel.getClass();
            s21.o oVar = this.f14870b;
            if (oVar == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                oVar.writeToParcel(parcel, i14);
            }
        }

        /* JADX INFO: renamed from: b21.l4$d0$b, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lb21/l4$d0$b;", "", "<init>", "()V", "Li63/c;", "Lb21/l4$d0;", "serializer", "()Li63/c;", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
                this();
            }

            public final i63.c<d0> serializer() {
                return a.f14871a;
            }

            private Companion() {
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public d0() {
            this((s21.o) null, 1, (p005kotlin.jvm.internal.j) (0 == true ? 1 : 0));
        }

        public d0(s21.o oVar) {
            super(null);
            this.f14870b = oVar;
        }

        public /* synthetic */ d0(s21.o oVar, int i14, p005kotlin.jvm.internal.j jVar) {
            this((i14 & 1) != 0 ? null : oVar);
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u000b2\u00020\u0001:\u0002\f\rB\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\n¨\u0006\u000e"}, d2 = {"Lb21/l4$e0;", "Lb21/l4;", "Ll01/k;", "nutritionSettingsDTO", "<init>", "(Ll01/k;)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILl01/k;Lm63/u1;)V", "Companion", "a", "b", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @i63.h
    public static final /* data */ class e0 extends l4 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final l01.k f14873b;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final Parcelable.Creator<e0> CREATOR = new c();

        @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/nutrition/presentation/navigation/NutritionRoute.NutritionPlanReview.$serializer", "Lm63/e0;", "Lb21/l4$e0;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        @o13.e
        public static final /* synthetic */ class a implements m63.e0<e0> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f14874a;
            private static final k63.e descriptor;

            static {
                a aVar = new a();
                f14874a = aVar;
                m63.m1 m1Var = new m63.m1("com.garmin.android.apps.connectmobile.nutrition.presentation.navigation.NutritionRoute.NutritionPlanReview", aVar, 1);
                m1Var.j("nutritionSettingsDTO", true);
                descriptor = m1Var;
            }

            private a() {
            }

            @Override // m63.e0
            public final i63.c<?>[] childSerializers() {
                return new i63.c[]{j63.a.d(l01.k.a.f107896a)};
            }

            @Override // i63.b
            public final Object deserialize(l63.e eVar) {
                eVar.getClass();
                k63.e eVar2 = descriptor;
                l63.c cVarC = eVar.c(eVar2);
                int i14 = l63.c.f110557a;
                m63.u1 u1Var = null;
                boolean z14 = true;
                int i15 = 0;
                l01.k kVar = null;
                while (z14) {
                    int iE = cVarC.e(eVar2);
                    if (iE == -1) {
                        z14 = false;
                    } else {
                        if (iE != 0) {
                            hb.a.o(iE);
                            return null;
                        }
                        kVar = (l01.k) cVarC.v(eVar2, 0, l01.k.a.f107896a, kVar);
                        i15 = 1;
                    }
                }
                cVarC.b(eVar2);
                return new e0(i15, kVar, u1Var);
            }

            @Override // i63.i, i63.b
            /* JADX INFO: renamed from: getDescriptor */
            public final k63.e getF158591b() {
                return descriptor;
            }

            @Override // i63.i
            public final void serialize(l63.f fVar, Object obj) {
                e0 e0Var = (e0) obj;
                e0Var.getClass();
                l01.k kVar = e0Var.f14873b;
                k63.e eVar = descriptor;
                l63.d dVarC = fVar.c(eVar);
                if (dVarC.C(eVar) || kVar != null) {
                    dVarC.d(eVar, 0, l01.k.a.f107896a, kVar);
                }
                dVarC.b(eVar);
            }
        }

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class c implements Parcelable.Creator<e0> {
            @Override // android.os.Parcelable.Creator
            public final e0 createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new e0((l01.k) parcel.readValue(e0.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final e0[] newArray(int i14) {
                return new e0[i14];
            }
        }

        public /* synthetic */ e0(int i14, l01.k kVar, m63.u1 u1Var) {
            super(i14, u1Var);
            if ((i14 & 1) == 0) {
                this.f14873b = null;
            } else {
                this.f14873b = kVar;
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e0) && p005kotlin.jvm.internal.s.g(this.f14873b, ((e0) obj).f14873b);
        }

        public final int hashCode() {
            l01.k kVar = this.f14873b;
            if (kVar == null) {
                return 0;
            }
            return kVar.hashCode();
        }

        public final String toString() {
            return "NutritionPlanReview(nutritionSettingsDTO=" + this.f14873b + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i14) {
            parcel.getClass();
            parcel.writeValue(this.f14873b);
        }

        /* JADX INFO: renamed from: b21.l4$e0$b, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lb21/l4$e0$b;", "", "<init>", "()V", "Li63/c;", "Lb21/l4$e0;", "serializer", "()Li63/c;", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
                this();
            }

            public final i63.c<e0> serializer() {
                return a.f14874a;
            }

            private Companion() {
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public e0() {
            this((l01.k) null, 1, (p005kotlin.jvm.internal.j) (0 == true ? 1 : 0));
        }

        public e0(l01.k kVar) {
            super(null);
            this.f14873b = kVar;
        }

        public /* synthetic */ e0(l01.k kVar, int i14, p005kotlin.jvm.internal.j jVar) {
            this((i14 & 1) != 0 ? null : kVar);
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00112\u00020\u0001:\u0002\u0012\u0013B#\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB%\b\u0016\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0007\u0010\u000bB9\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0007\u0010\u0010¨\u0006\u0014"}, d2 = {"Lb21/l4$f;", "Lb21/l4;", "", "foodId", "_dateTime", "Lb11/m;", "mealViewNavArgs", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lb11/m;)V", "Lb63/u;", "dateTime", "(Ljava/lang/String;Lb11/m;Lb63/u;)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lb11/m;Lm63/u1;)V", "Companion", "a", "b", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @i63.h
    public static final /* data */ class f extends l4 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f14875b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f14876c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final b11.m f14877d;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final Parcelable.Creator<f> CREATOR = new c();

        @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/nutrition/presentation/navigation/NutritionRoute.CreateEditRecipe.$serializer", "Lm63/e0;", "Lb21/l4$f;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        @o13.e
        public static final /* synthetic */ class a implements m63.e0<f> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f14878a;
            private static final k63.e descriptor;

            static {
                a aVar = new a();
                f14878a = aVar;
                m63.m1 m1Var = new m63.m1("com.garmin.android.apps.connectmobile.nutrition.presentation.navigation.NutritionRoute.CreateEditRecipe", aVar, 3);
                m1Var.j("foodId", true);
                m1Var.j("_dateTime", false);
                m1Var.j("mealViewNavArgs", false);
                descriptor = m1Var;
            }

            private a() {
            }

            @Override // m63.e0
            public final i63.c<?>[] childSerializers() {
                m63.y1 y1Var = m63.y1.f117048a;
                return new i63.c[]{j63.a.d(y1Var), y1Var, b11.m.a.f14340a};
            }

            @Override // i63.b
            public final Object deserialize(l63.e eVar) {
                eVar.getClass();
                k63.e eVar2 = descriptor;
                l63.c cVarC = eVar.c(eVar2);
                int i14 = l63.c.f110557a;
                boolean z14 = true;
                int i15 = 0;
                String str = null;
                String strR = null;
                b11.m mVar = null;
                while (z14) {
                    int iE = cVarC.e(eVar2);
                    if (iE == -1) {
                        z14 = false;
                    } else if (iE == 0) {
                        str = (String) cVarC.v(eVar2, 0, m63.y1.f117048a, str);
                        i15 |= 1;
                    } else if (iE == 1) {
                        strR = cVarC.r(eVar2, 1);
                        i15 |= 2;
                    } else {
                        if (iE != 2) {
                            hb.a.o(iE);
                            return null;
                        }
                        mVar = (b11.m) cVarC.l(eVar2, 2, b11.m.a.f14340a, mVar);
                        i15 |= 4;
                    }
                }
                cVarC.b(eVar2);
                return new f(i15, str, strR, mVar, (m63.u1) null);
            }

            @Override // i63.i, i63.b
            /* JADX INFO: renamed from: getDescriptor */
            public final k63.e getF158591b() {
                return descriptor;
            }

            @Override // i63.i
            public final void serialize(l63.f fVar, Object obj) {
                f fVar2 = (f) obj;
                fVar2.getClass();
                String str = fVar2.f14875b;
                k63.e eVar = descriptor;
                l63.d dVarC = fVar.c(eVar);
                if (dVarC.C(eVar) || str != null) {
                    dVarC.d(eVar, 0, m63.y1.f117048a, str);
                }
                dVarC.k(eVar, 1, fVar2.f14876c);
                dVarC.e(eVar, 2, b11.m.a.f14340a, fVar2.f14877d);
                dVarC.b(eVar);
            }
        }

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class c implements Parcelable.Creator<f> {
            @Override // android.os.Parcelable.Creator
            public final f createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new f(parcel.readString(), parcel.readString(), b11.m.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final f[] newArray(int i14) {
                return new f[i14];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ f(int i14, String str, String str2, b11.m mVar, m63.u1 u1Var) {
            super(i14, u1Var);
            if (6 != (i14 & 6)) {
                m63.k1.h(i14, 6, a.f14878a.getF158591b());
                throw null;
            }
            if ((i14 & 1) == 0) {
                this.f14875b = null;
            } else {
                this.f14875b = str;
            }
            this.f14876c = str2;
            this.f14877d = mVar;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return p005kotlin.jvm.internal.s.g(this.f14875b, fVar.f14875b) && p005kotlin.jvm.internal.s.g(this.f14876c, fVar.f14876c) && p005kotlin.jvm.internal.s.g(this.f14877d, fVar.f14877d);
        }

        public final int hashCode() {
            String str = this.f14875b;
            return this.f14877d.hashCode() + wr.g.j((str == null ? 0 : str.hashCode()) * 31, 31, this.f14876c);
        }

        public final String toString() {
            StringBuilder sbI = p6.b.i("CreateEditRecipe(foodId=", this.f14875b, ", _dateTime=", this.f14876c, ", mealViewNavArgs=");
            sbI.append(this.f14877d);
            sbI.append(")");
            return sbI.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i14) {
            parcel.getClass();
            parcel.writeString(this.f14875b);
            parcel.writeString(this.f14876c);
            this.f14877d.writeToParcel(parcel, i14);
        }

        /* JADX INFO: renamed from: b21.l4$f$b, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lb21/l4$f$b;", "", "<init>", "()V", "Li63/c;", "Lb21/l4$f;", "serializer", "()Li63/c;", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
                this();
            }

            public final i63.c<f> serializer() {
                return a.f14878a;
            }

            private Companion() {
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str, String str2, b11.m mVar) {
            super(null);
            str2.getClass();
            mVar.getClass();
            this.f14875b = str;
            this.f14876c = str2;
            this.f14877d = mVar;
        }

        public /* synthetic */ f(String str, String str2, b11.m mVar, int i14, p005kotlin.jvm.internal.j jVar) {
            this((i14 & 1) != 0 ? null : str, str2, mVar);
        }

        public /* synthetic */ f(String str, b11.m mVar, b63.u uVar, int i14, p005kotlin.jvm.internal.j jVar) {
            this((i14 & 1) != 0 ? null : str, mVar, uVar);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public f(String str, b11.m mVar, b63.u uVar) {
            this(str, uVar.toString(), mVar);
            mVar.getClass();
            uVar.getClass();
        }
    }

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00182\u00020\u0001:\u0002\u0019\u001aB/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bB1\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u0012BK\b\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\n\u0010\u0017¨\u0006\u001b"}, d2 = {"Lb21/l4$g;", "Lb21/l4;", "", "customMealId", "", "_dateTime", "_logCategory", "_logDestination", "Lb11/m;", "mealViewNavArgs", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lb11/m;)V", "Lb63/u;", "dateTime", "Li01/i;", "logCategory", "Lj11/c;", "logDestination", "(JLb63/u;Li01/i;Lj11/c;Lb11/m;)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(IJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lb11/m;Lm63/u1;)V", "Companion", "a", "b", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @i63.h
    public static final /* data */ class g extends l4 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f14880b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f14881c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f14882d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final String f14883e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final b11.m f14884f;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final Parcelable.Creator<g> CREATOR = new c();

        @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/nutrition/presentation/navigation/NutritionRoute.CustomMealDetails.$serializer", "Lm63/e0;", "Lb21/l4$g;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        @o13.e
        public static final /* synthetic */ class a implements m63.e0<g> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f14885a;
            private static final k63.e descriptor;

            static {
                a aVar = new a();
                f14885a = aVar;
                m63.m1 m1Var = new m63.m1("com.garmin.android.apps.connectmobile.nutrition.presentation.navigation.NutritionRoute.CustomMealDetails", aVar, 5);
                m1Var.j("customMealId", false);
                m1Var.j("_dateTime", false);
                m1Var.j("_logCategory", false);
                m1Var.j("_logDestination", false);
                m1Var.j("mealViewNavArgs", false);
                descriptor = m1Var;
            }

            private a() {
            }

            @Override // m63.e0
            public final i63.c<?>[] childSerializers() {
                m63.y1 y1Var = m63.y1.f117048a;
                return new i63.c[]{m63.v0.f117027a, y1Var, y1Var, y1Var, b11.m.a.f14340a};
            }

            @Override // i63.b
            public final Object deserialize(l63.e eVar) {
                eVar.getClass();
                k63.e eVar2 = descriptor;
                l63.c cVarC = eVar.c(eVar2);
                int i14 = l63.c.f110557a;
                int i15 = 0;
                long jW = 0;
                String strR = null;
                String strR2 = null;
                String strR3 = null;
                b11.m mVar = null;
                boolean z14 = true;
                while (z14) {
                    int iE = cVarC.e(eVar2);
                    if (iE == -1) {
                        z14 = false;
                    } else if (iE == 0) {
                        jW = cVarC.w(eVar2, 0);
                        i15 |= 1;
                    } else if (iE == 1) {
                        strR = cVarC.r(eVar2, 1);
                        i15 |= 2;
                    } else if (iE == 2) {
                        strR2 = cVarC.r(eVar2, 2);
                        i15 |= 4;
                    } else if (iE == 3) {
                        strR3 = cVarC.r(eVar2, 3);
                        i15 |= 8;
                    } else {
                        if (iE != 4) {
                            hb.a.o(iE);
                            return null;
                        }
                        mVar = (b11.m) cVarC.l(eVar2, 4, b11.m.a.f14340a, mVar);
                        i15 |= 16;
                    }
                }
                cVarC.b(eVar2);
                return new g(i15, jW, strR, strR2, strR3, mVar, null);
            }

            @Override // i63.i, i63.b
            /* JADX INFO: renamed from: getDescriptor */
            public final k63.e getF158591b() {
                return descriptor;
            }

            @Override // i63.i
            public final void serialize(l63.f fVar, Object obj) {
                g gVar = (g) obj;
                gVar.getClass();
                k63.e eVar = descriptor;
                l63.d dVarC = fVar.c(eVar);
                dVarC.z(eVar, 0, gVar.f14880b);
                dVarC.k(eVar, 1, gVar.f14881c);
                dVarC.k(eVar, 2, gVar.f14882d);
                dVarC.k(eVar, 3, gVar.f14883e);
                dVarC.e(eVar, 4, b11.m.a.f14340a, gVar.f14884f);
                dVarC.b(eVar);
            }
        }

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class c implements Parcelable.Creator<g> {
            @Override // android.os.Parcelable.Creator
            public final g createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new g(parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString(), b11.m.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final g[] newArray(int i14) {
                return new g[i14];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ g(int i14, long j8, String str, String str2, String str3, b11.m mVar, m63.u1 u1Var) {
            super(i14, u1Var);
            if (31 != (i14 & 31)) {
                m63.k1.h(i14, 31, a.f14885a.getF158591b());
                throw null;
            }
            this.f14880b = j8;
            this.f14881c = str;
            this.f14882d = str2;
            this.f14883e = str3;
            this.f14884f = mVar;
        }

        public final j11.c b() {
            w13.c cVar = j11.c.f96417f;
            p13.c.b bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar, cVar);
            while (bVarN.hasNext()) {
                j11.c cVar2 = (j11.c) bVarN.next();
                if (p005kotlin.jvm.internal.s.g(cVar2.name(), this.f14883e)) {
                    return cVar2;
                }
            }
            n23.j.s("Collection contains no element matching the predicate.");
            return null;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return this.f14880b == gVar.f14880b && p005kotlin.jvm.internal.s.g(this.f14881c, gVar.f14881c) && p005kotlin.jvm.internal.s.g(this.f14882d, gVar.f14882d) && p005kotlin.jvm.internal.s.g(this.f14883e, gVar.f14883e) && p005kotlin.jvm.internal.s.g(this.f14884f, gVar.f14884f);
        }

        public final int hashCode() {
            return this.f14884f.hashCode() + wr.g.j(wr.g.j(wr.g.j(Long.hashCode(this.f14880b) * 31, 31, this.f14881c), 31, this.f14882d), 31, this.f14883e);
        }

        public final String toString() {
            StringBuilder sbK = com.airbnb.lottie.animation.keyframe.a.k(this.f14880b, "CustomMealDetails(customMealId=", ", _dateTime=", this.f14881c);
            sn.a.t(sbK, ", _logCategory=", this.f14882d, ", _logDestination=", this.f14883e);
            sbK.append(", mealViewNavArgs=");
            sbK.append(this.f14884f);
            sbK.append(")");
            return sbK.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i14) {
            parcel.getClass();
            parcel.writeLong(this.f14880b);
            parcel.writeString(this.f14881c);
            parcel.writeString(this.f14882d);
            parcel.writeString(this.f14883e);
            this.f14884f.writeToParcel(parcel, i14);
        }

        /* JADX INFO: renamed from: b21.l4$g$b, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lb21/l4$g$b;", "", "<init>", "()V", "Li63/c;", "Lb21/l4$g;", "serializer", "()Li63/c;", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
                this();
            }

            public final i63.c<g> serializer() {
                return a.f14885a;
            }

            private Companion() {
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(long j8, String str, String str2, String str3, b11.m mVar) {
            super(null);
            str.getClass();
            str2.getClass();
            str3.getClass();
            mVar.getClass();
            this.f14880b = j8;
            this.f14881c = str;
            this.f14882d = str2;
            this.f14883e = str3;
            this.f14884f = mVar;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public g(long j8, b63.u uVar, i01.i iVar, j11.c cVar, b11.m mVar) {
            this(j8, uVar.toString(), iVar.f86776a, cVar.name(), mVar);
            uVar.getClass();
            iVar.getClass();
            cVar.getClass();
            mVar.getClass();
        }
    }

    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000  2\u00020\u0001:\u0002!\"Bc\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011Be\b\u0016\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u001aB\u0087\u0001\b\u0010\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b\u0010\u0010\u001f¨\u0006#"}, d2 = {"Lb21/l4$h;", "Lb21/l4;", "", "_dateTime", "consumableId", "foodId", "servingId", "", "servingQty", "regionCode", RemoteConfigConstants.RequestFieldKey.LANGUAGE_CODE, "_source", "_logCategory", "_logDestination", "Lb11/m;", "mealViewNavArgs", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lb11/m;)V", "Lb63/u;", "dateTime", "Lg01/u;", "source", "Li01/i;", "logCategory", "Lj11/c;", "logDestination", "(Lb63/u;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;Lg01/u;Li01/i;Lj11/c;Lb11/m;)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lb11/m;Lm63/u1;)V", "Companion", "a", "b", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @i63.h
    public static final /* data */ class h extends l4 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f14887b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f14888c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f14889d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final String f14890e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final double f14891f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final String f14892g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final String f14893h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final String f14894i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final String f14895j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final String f14896k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final b11.m f14897l;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final Parcelable.Creator<h> CREATOR = new c();

        @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/nutrition/presentation/navigation/NutritionRoute.EditCustomConsumableFood.$serializer", "Lm63/e0;", "Lb21/l4$h;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        @o13.e
        public static final /* synthetic */ class a implements m63.e0<h> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f14898a;
            private static final k63.e descriptor;

            static {
                a aVar = new a();
                f14898a = aVar;
                m63.m1 m1Var = new m63.m1("com.garmin.android.apps.connectmobile.nutrition.presentation.navigation.NutritionRoute.EditCustomConsumableFood", aVar, 11);
                m1Var.j("_dateTime", false);
                m1Var.j("consumableId", false);
                m1Var.j("foodId", false);
                m1Var.j("servingId", false);
                m1Var.j("servingQty", false);
                m1Var.j("regionCode", false);
                m1Var.j(RemoteConfigConstants.RequestFieldKey.LANGUAGE_CODE, false);
                m1Var.j("_source", false);
                m1Var.j("_logCategory", false);
                m1Var.j("_logDestination", false);
                m1Var.j("mealViewNavArgs", true);
                descriptor = m1Var;
            }

            private a() {
            }

            @Override // m63.e0
            public final i63.c<?>[] childSerializers() {
                i63.c<?> cVarD = j63.a.d(b11.m.a.f14340a);
                m63.y1 y1Var = m63.y1.f117048a;
                return new i63.c[]{y1Var, y1Var, y1Var, y1Var, m63.x.f117036a, y1Var, y1Var, y1Var, y1Var, y1Var, cVarD};
            }

            @Override // i63.b
            public final Object deserialize(l63.e eVar) {
                eVar.getClass();
                k63.e eVar2 = descriptor;
                l63.c cVarC = eVar.c(eVar2);
                int i14 = l63.c.f110557a;
                Object obj = null;
                int i15 = 0;
                String strR = null;
                String strR2 = null;
                String strR3 = null;
                String strR4 = null;
                String strR5 = null;
                String strR6 = null;
                String strR7 = null;
                String strR8 = null;
                String strR9 = null;
                double dT = 0.0d;
                boolean z14 = true;
                b11.m mVar = null;
                while (z14) {
                    int iE = cVarC.e(eVar2);
                    switch (iE) {
                        case -1:
                            z14 = false;
                            continue;
                        case 0:
                            strR = cVarC.r(eVar2, 0);
                            i15 |= 1;
                            break;
                        case 1:
                            strR2 = cVarC.r(eVar2, 1);
                            i15 |= 2;
                            break;
                        case 2:
                            strR3 = cVarC.r(eVar2, 2);
                            i15 |= 4;
                            break;
                        case 3:
                            strR4 = cVarC.r(eVar2, 3);
                            i15 |= 8;
                            break;
                        case 4:
                            dT = cVarC.t(eVar2, 4);
                            i15 |= 16;
                            break;
                        case 5:
                            strR5 = cVarC.r(eVar2, 5);
                            i15 |= 32;
                            break;
                        case 6:
                            strR6 = cVarC.r(eVar2, 6);
                            i15 |= 64;
                            break;
                        case 7:
                            strR7 = cVarC.r(eVar2, 7);
                            i15 |= 128;
                            break;
                        case 8:
                            strR8 = cVarC.r(eVar2, 8);
                            i15 |= 256;
                            break;
                        case 9:
                            strR9 = cVarC.r(eVar2, 9);
                            i15 |= 512;
                            break;
                        case 10:
                            mVar = (b11.m) cVarC.v(eVar2, 10, b11.m.a.f14340a, mVar);
                            i15 |= 1024;
                            break;
                        default:
                            hb.a.o(iE);
                            return obj;
                    }
                    obj = null;
                }
                cVarC.b(eVar2);
                return new h(i15, strR, strR2, strR3, strR4, dT, strR5, strR6, strR7, strR8, strR9, mVar, (m63.u1) null);
            }

            @Override // i63.i, i63.b
            /* JADX INFO: renamed from: getDescriptor */
            public final k63.e getF158591b() {
                return descriptor;
            }

            @Override // i63.i
            public final void serialize(l63.f fVar, Object obj) {
                h hVar = (h) obj;
                hVar.getClass();
                k63.e eVar = descriptor;
                l63.d dVarC = fVar.c(eVar);
                String str = hVar.f14887b;
                b11.m mVar = hVar.f14897l;
                dVarC.k(eVar, 0, str);
                dVarC.k(eVar, 1, hVar.f14888c);
                dVarC.k(eVar, 2, hVar.f14889d);
                dVarC.k(eVar, 3, hVar.f14890e);
                dVarC.B(eVar, 4, hVar.f14891f);
                dVarC.k(eVar, 5, hVar.f14892g);
                dVarC.k(eVar, 6, hVar.f14893h);
                dVarC.k(eVar, 7, hVar.f14894i);
                dVarC.k(eVar, 8, hVar.f14895j);
                dVarC.k(eVar, 9, hVar.f14896k);
                if (dVarC.C(eVar) || mVar != null) {
                    dVarC.d(eVar, 10, b11.m.a.f14340a, mVar);
                }
                dVarC.b(eVar);
            }
        }

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class c implements Parcelable.Creator<h> {
            @Override // android.os.Parcelable.Creator
            public final h createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new h(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readDouble(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : b11.m.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final h[] newArray(int i14) {
                return new h[i14];
            }
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public h(b63.u uVar, String str, String str2, String str3, double d14, String str4, String str5, g01.u uVar2, i01.i iVar, j11.c cVar, b11.m mVar) {
            this(uVar.toString(), str, str2, str3, d14, str4, str5, uVar2.name(), iVar.f86776a, cVar.name(), mVar);
            uVar.getClass();
            str.getClass();
            str2.getClass();
            str3.getClass();
            str4.getClass();
            str5.getClass();
            uVar2.getClass();
            iVar.getClass();
            cVar.getClass();
        }

        public final j11.c b() {
            w13.c cVar = j11.c.f96417f;
            p13.c.b bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar, cVar);
            while (bVarN.hasNext()) {
                j11.c cVar2 = (j11.c) bVarN.next();
                if (p005kotlin.jvm.internal.s.g(cVar2.name(), this.f14896k)) {
                    return cVar2;
                }
            }
            n23.j.s("Collection contains no element matching the predicate.");
            return null;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return p005kotlin.jvm.internal.s.g(this.f14887b, hVar.f14887b) && p005kotlin.jvm.internal.s.g(this.f14888c, hVar.f14888c) && p005kotlin.jvm.internal.s.g(this.f14889d, hVar.f14889d) && p005kotlin.jvm.internal.s.g(this.f14890e, hVar.f14890e) && Double.compare(this.f14891f, hVar.f14891f) == 0 && p005kotlin.jvm.internal.s.g(this.f14892g, hVar.f14892g) && p005kotlin.jvm.internal.s.g(this.f14893h, hVar.f14893h) && p005kotlin.jvm.internal.s.g(this.f14894i, hVar.f14894i) && p005kotlin.jvm.internal.s.g(this.f14895j, hVar.f14895j) && p005kotlin.jvm.internal.s.g(this.f14896k, hVar.f14896k) && p005kotlin.jvm.internal.s.g(this.f14897l, hVar.f14897l);
        }

        public final int hashCode() {
            int iJ = wr.g.j(wr.g.j(wr.g.j(wr.g.j(wr.g.j(org.apache.commons.lang3.e.b(wr.g.j(wr.g.j(wr.g.j(this.f14887b.hashCode() * 31, 31, this.f14888c), 31, this.f14889d), 31, this.f14890e), 31, this.f14891f), 31, this.f14892g), 31, this.f14893h), 31, this.f14894i), 31, this.f14895j), 31, this.f14896k);
            b11.m mVar = this.f14897l;
            return iJ + (mVar == null ? 0 : mVar.hashCode());
        }

        public final String toString() {
            StringBuilder sbI = p6.b.i("EditCustomConsumableFood(_dateTime=", this.f14887b, ", consumableId=", this.f14888c, ", foodId=");
            sn.a.t(sbI, this.f14889d, ", servingId=", this.f14890e, ", servingQty=");
            sbI.append(this.f14891f);
            sbI.append(", regionCode=");
            sbI.append(this.f14892g);
            sn.a.t(sbI, ", languageCode=", this.f14893h, ", _source=", this.f14894i);
            sn.a.t(sbI, ", _logCategory=", this.f14895j, ", _logDestination=", this.f14896k);
            sbI.append(", mealViewNavArgs=");
            sbI.append(this.f14897l);
            sbI.append(")");
            return sbI.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i14) {
            parcel.getClass();
            parcel.writeString(this.f14887b);
            parcel.writeString(this.f14888c);
            parcel.writeString(this.f14889d);
            parcel.writeString(this.f14890e);
            parcel.writeDouble(this.f14891f);
            parcel.writeString(this.f14892g);
            parcel.writeString(this.f14893h);
            parcel.writeString(this.f14894i);
            parcel.writeString(this.f14895j);
            parcel.writeString(this.f14896k);
            b11.m mVar = this.f14897l;
            if (mVar == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                mVar.writeToParcel(parcel, i14);
            }
        }

        /* JADX INFO: renamed from: b21.l4$h$b, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lb21/l4$h$b;", "", "<init>", "()V", "Li63/c;", "Lb21/l4$h;", "serializer", "()Li63/c;", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
                this();
            }

            public final i63.c<h> serializer() {
                return a.f14898a;
            }

            private Companion() {
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ h(int i14, String str, String str2, String str3, String str4, double d14, String str5, String str6, String str7, String str8, String str9, b11.m mVar, m63.u1 u1Var) {
            super(i14, u1Var);
            if (1023 != (i14 & 1023)) {
                m63.k1.h(i14, 1023, a.f14898a.getF158591b());
                throw null;
            }
            this.f14887b = str;
            this.f14888c = str2;
            this.f14889d = str3;
            this.f14890e = str4;
            this.f14891f = d14;
            this.f14892g = str5;
            this.f14893h = str6;
            this.f14894i = str7;
            this.f14895j = str8;
            this.f14896k = str9;
            if ((i14 & 1024) == 0) {
                this.f14897l = null;
            } else {
                this.f14897l = mVar;
            }
        }

        public /* synthetic */ h(String str, String str2, String str3, String str4, double d14, String str5, String str6, String str7, String str8, String str9, b11.m mVar, int i14, p005kotlin.jvm.internal.j jVar) {
            this(str, str2, str3, str4, d14, str5, str6, str7, str8, str9, (i14 & 1024) != 0 ? null : mVar);
        }

        public /* synthetic */ h(b63.u uVar, String str, String str2, String str3, double d14, String str4, String str5, g01.u uVar2, i01.i iVar, j11.c cVar, b11.m mVar, int i14, p005kotlin.jvm.internal.j jVar) {
            this(uVar, str, str2, str3, d14, str4, str5, uVar2, iVar, cVar, (i14 & 1024) != 0 ? null : mVar);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(String str, String str2, String str3, String str4, double d14, String str5, String str6, String str7, String str8, String str9, b11.m mVar) {
            super(null);
            hb.a.p(str, str2, str3, str4, str5);
            kg.f.p(str6, str7, str8, str9);
            this.f14887b = str;
            this.f14888c = str2;
            this.f14889d = str3;
            this.f14890e = str4;
            this.f14891f = d14;
            this.f14892g = str5;
            this.f14893h = str6;
            this.f14894i = str7;
            this.f14895j = str8;
            this.f14896k = str9;
            this.f14897l = mVar;
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \n2\u00020\u0001:\u0002\u000b\fB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004B%\b\u0010\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0003\u0010\t¨\u0006\r"}, d2 = {"Lb21/l4$h0;", "Lb21/l4;", "route", "<init>", "(Lb21/l4;)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILb21/l4;Lm63/u1;)V", "Companion", "a", "b", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @i63.h
    public static final /* data */ class h0 extends l4 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final l4 f14900b;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final Parcelable.Creator<h0> CREATOR = new c();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final o13.l<i63.c<Object>>[] f14899c = {o13.m.a(o13.n.PUBLICATION, new m4(11))};

        @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/nutrition/presentation/navigation/NutritionRoute.NutritionSettingsSearchRouter.$serializer", "Lm63/e0;", "Lb21/l4$h0;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        @o13.e
        public static final /* synthetic */ class a implements m63.e0<h0> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f14901a;
            private static final k63.e descriptor;

            static {
                a aVar = new a();
                f14901a = aVar;
                m63.m1 m1Var = new m63.m1("com.garmin.android.apps.connectmobile.nutrition.presentation.navigation.NutritionRoute.NutritionSettingsSearchRouter", aVar, 1);
                m1Var.j("route", false);
                descriptor = m1Var;
            }

            private a() {
            }

            @Override // m63.e0
            public final i63.c<?>[] childSerializers() {
                return new i63.c[]{h0.f14899c[0].getValue()};
            }

            @Override // i63.b
            public final Object deserialize(l63.e eVar) {
                eVar.getClass();
                k63.e eVar2 = descriptor;
                l63.c cVarC = eVar.c(eVar2);
                o13.l<i63.c<Object>>[] lVarArr = h0.f14899c;
                int i14 = l63.c.f110557a;
                m63.u1 u1Var = null;
                boolean z14 = true;
                int i15 = 0;
                l4 l4Var = null;
                while (z14) {
                    int iE = cVarC.e(eVar2);
                    if (iE == -1) {
                        z14 = false;
                    } else {
                        if (iE != 0) {
                            hb.a.o(iE);
                            return null;
                        }
                        l4Var = (l4) cVarC.l(eVar2, 0, lVarArr[0].getValue(), l4Var);
                        i15 = 1;
                    }
                }
                cVarC.b(eVar2);
                return new h0(i15, l4Var, u1Var);
            }

            @Override // i63.i, i63.b
            /* JADX INFO: renamed from: getDescriptor */
            public final k63.e getF158591b() {
                return descriptor;
            }

            @Override // i63.i
            public final void serialize(l63.f fVar, Object obj) {
                h0 h0Var = (h0) obj;
                h0Var.getClass();
                k63.e eVar = descriptor;
                l63.d dVarC = fVar.c(eVar);
                dVarC.e(eVar, 0, h0.f14899c[0].getValue(), h0Var.f14900b);
                dVarC.b(eVar);
            }
        }

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class c implements Parcelable.Creator<h0> {
            @Override // android.os.Parcelable.Creator
            public final h0 createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new h0((l4) parcel.readParcelable(h0.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final h0[] newArray(int i14) {
                return new h0[i14];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ h0(int i14, l4 l4Var, m63.u1 u1Var) {
            super(i14, u1Var);
            if (1 != (i14 & 1)) {
                m63.k1.h(i14, 1, a.f14901a.getF158591b());
                throw null;
            }
            this.f14900b = l4Var;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h0) && p005kotlin.jvm.internal.s.g(this.f14900b, ((h0) obj).f14900b);
        }

        public final int hashCode() {
            return this.f14900b.hashCode();
        }

        public final String toString() {
            return "NutritionSettingsSearchRouter(route=" + this.f14900b + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i14) {
            parcel.getClass();
            parcel.writeParcelable(this.f14900b, i14);
        }

        /* JADX INFO: renamed from: b21.l4$h0$b, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lb21/l4$h0$b;", "", "<init>", "()V", "Li63/c;", "Lb21/l4$h0;", "serializer", "()Li63/c;", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
                this();
            }

            public final i63.c<h0> serializer() {
                return a.f14901a;
            }

            private Companion() {
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h0(l4 l4Var) {
            super(null);
            l4Var.getClass();
            this.f14900b = l4Var;
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u000b2\u00020\u0001:\u0002\f\rB\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\n¨\u0006\u000e"}, d2 = {"Lb21/l4$i;", "Lb21/l4;", "", "customFoodId", "<init>", "(Ljava/lang/String;)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILjava/lang/String;Lm63/u1;)V", "Companion", "a", "b", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @i63.h
    public static final /* data */ class i extends l4 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f14902b;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final Parcelable.Creator<i> CREATOR = new c();

        @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/nutrition/presentation/navigation/NutritionRoute.EditCustomFood.$serializer", "Lm63/e0;", "Lb21/l4$i;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        @o13.e
        public static final /* synthetic */ class a implements m63.e0<i> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f14903a;
            private static final k63.e descriptor;

            static {
                a aVar = new a();
                f14903a = aVar;
                m63.m1 m1Var = new m63.m1("com.garmin.android.apps.connectmobile.nutrition.presentation.navigation.NutritionRoute.EditCustomFood", aVar, 1);
                m1Var.j("customFoodId", true);
                descriptor = m1Var;
            }

            private a() {
            }

            @Override // m63.e0
            public final i63.c<?>[] childSerializers() {
                return new i63.c[]{j63.a.d(m63.y1.f117048a)};
            }

            @Override // i63.b
            public final Object deserialize(l63.e eVar) {
                eVar.getClass();
                k63.e eVar2 = descriptor;
                l63.c cVarC = eVar.c(eVar2);
                int i14 = l63.c.f110557a;
                m63.u1 u1Var = null;
                boolean z14 = true;
                int i15 = 0;
                String str = null;
                while (z14) {
                    int iE = cVarC.e(eVar2);
                    if (iE == -1) {
                        z14 = false;
                    } else {
                        if (iE != 0) {
                            hb.a.o(iE);
                            return null;
                        }
                        str = (String) cVarC.v(eVar2, 0, m63.y1.f117048a, str);
                        i15 = 1;
                    }
                }
                cVarC.b(eVar2);
                return new i(i15, str, u1Var);
            }

            @Override // i63.i, i63.b
            /* JADX INFO: renamed from: getDescriptor */
            public final k63.e getF158591b() {
                return descriptor;
            }

            @Override // i63.i
            public final void serialize(l63.f fVar, Object obj) {
                i iVar = (i) obj;
                iVar.getClass();
                String str = iVar.f14902b;
                k63.e eVar = descriptor;
                l63.d dVarC = fVar.c(eVar);
                if (dVarC.C(eVar) || str != null) {
                    dVarC.d(eVar, 0, m63.y1.f117048a, str);
                }
                dVarC.b(eVar);
            }
        }

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class c implements Parcelable.Creator<i> {
            @Override // android.os.Parcelable.Creator
            public final i createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new i(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final i[] newArray(int i14) {
                return new i[i14];
            }
        }

        public /* synthetic */ i(int i14, String str, m63.u1 u1Var) {
            super(i14, u1Var);
            if ((i14 & 1) == 0) {
                this.f14902b = null;
            } else {
                this.f14902b = str;
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i) && p005kotlin.jvm.internal.s.g(this.f14902b, ((i) obj).f14902b);
        }

        public final int hashCode() {
            String str = this.f14902b;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return am.j.m("EditCustomFood(customFoodId=", this.f14902b, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i14) {
            parcel.getClass();
            parcel.writeString(this.f14902b);
        }

        /* JADX INFO: renamed from: b21.l4$i$b, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lb21/l4$i$b;", "", "<init>", "()V", "Li63/c;", "Lb21/l4$i;", "serializer", "()Li63/c;", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
                this();
            }

            public final i63.c<i> serializer() {
                return a.f14903a;
            }

            private Companion() {
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public i() {
            this((String) null, 1, (p005kotlin.jvm.internal.j) (0 == true ? 1 : 0));
        }

        public i(String str) {
            super(null);
            this.f14902b = str;
        }

        public /* synthetic */ i(String str, int i14, p005kotlin.jvm.internal.j jVar) {
            this((i14 & 1) != 0 ? null : str);
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00122\u00020\u0001:\u0002\u0013\u0014B#\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB%\b\u0016\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\fB9\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\b\u0010\u0011¨\u0006\u0015"}, d2 = {"Lb21/l4$j;", "Lb21/l4;", "", "customMealId", "", "_dateTime", "Lb11/m;", "mealViewNavArgs", "<init>", "(Ljava/lang/Long;Ljava/lang/String;Lb11/m;)V", "Lb63/u;", "dateTime", "(Ljava/lang/Long;Lb63/u;Lb11/m;)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILjava/lang/Long;Ljava/lang/String;Lb11/m;Lm63/u1;)V", "Companion", "a", "b", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @i63.h
    public static final /* data */ class j extends l4 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Long f14905b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f14906c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final b11.m f14907d;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final Parcelable.Creator<j> CREATOR = new c();

        @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/nutrition/presentation/navigation/NutritionRoute.EditCustomMeal.$serializer", "Lm63/e0;", "Lb21/l4$j;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        @o13.e
        public static final /* synthetic */ class a implements m63.e0<j> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f14908a;
            private static final k63.e descriptor;

            static {
                a aVar = new a();
                f14908a = aVar;
                m63.m1 m1Var = new m63.m1("com.garmin.android.apps.connectmobile.nutrition.presentation.navigation.NutritionRoute.EditCustomMeal", aVar, 3);
                m1Var.j("customMealId", true);
                m1Var.j("_dateTime", false);
                m1Var.j("mealViewNavArgs", false);
                descriptor = m1Var;
            }

            private a() {
            }

            @Override // m63.e0
            public final i63.c<?>[] childSerializers() {
                return new i63.c[]{j63.a.d(m63.v0.f117027a), m63.y1.f117048a, b11.m.a.f14340a};
            }

            @Override // i63.b
            public final Object deserialize(l63.e eVar) {
                eVar.getClass();
                k63.e eVar2 = descriptor;
                l63.c cVarC = eVar.c(eVar2);
                int i14 = l63.c.f110557a;
                boolean z14 = true;
                int i15 = 0;
                Long l14 = null;
                String strR = null;
                b11.m mVar = null;
                while (z14) {
                    int iE = cVarC.e(eVar2);
                    if (iE == -1) {
                        z14 = false;
                    } else if (iE == 0) {
                        l14 = (Long) cVarC.v(eVar2, 0, m63.v0.f117027a, l14);
                        i15 |= 1;
                    } else if (iE == 1) {
                        strR = cVarC.r(eVar2, 1);
                        i15 |= 2;
                    } else {
                        if (iE != 2) {
                            hb.a.o(iE);
                            return null;
                        }
                        mVar = (b11.m) cVarC.l(eVar2, 2, b11.m.a.f14340a, mVar);
                        i15 |= 4;
                    }
                }
                cVarC.b(eVar2);
                return new j(i15, l14, strR, mVar, (m63.u1) null);
            }

            @Override // i63.i, i63.b
            /* JADX INFO: renamed from: getDescriptor */
            public final k63.e getF158591b() {
                return descriptor;
            }

            @Override // i63.i
            public final void serialize(l63.f fVar, Object obj) {
                j jVar = (j) obj;
                jVar.getClass();
                Long l14 = jVar.f14905b;
                k63.e eVar = descriptor;
                l63.d dVarC = fVar.c(eVar);
                if (dVarC.C(eVar) || l14 != null) {
                    dVarC.d(eVar, 0, m63.v0.f117027a, l14);
                }
                dVarC.k(eVar, 1, jVar.f14906c);
                dVarC.e(eVar, 2, b11.m.a.f14340a, jVar.f14907d);
                dVarC.b(eVar);
            }
        }

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class c implements Parcelable.Creator<j> {
            @Override // android.os.Parcelable.Creator
            public final j createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new j(parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), b11.m.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final j[] newArray(int i14) {
                return new j[i14];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ j(int i14, Long l14, String str, b11.m mVar, m63.u1 u1Var) {
            super(i14, u1Var);
            if (6 != (i14 & 6)) {
                m63.k1.h(i14, 6, a.f14908a.getF158591b());
                throw null;
            }
            if ((i14 & 1) == 0) {
                this.f14905b = null;
            } else {
                this.f14905b = l14;
            }
            this.f14906c = str;
            this.f14907d = mVar;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            return p005kotlin.jvm.internal.s.g(this.f14905b, jVar.f14905b) && p005kotlin.jvm.internal.s.g(this.f14906c, jVar.f14906c) && p005kotlin.jvm.internal.s.g(this.f14907d, jVar.f14907d);
        }

        public final int hashCode() {
            Long l14 = this.f14905b;
            return this.f14907d.hashCode() + wr.g.j((l14 == null ? 0 : l14.hashCode()) * 31, 31, this.f14906c);
        }

        public final String toString() {
            StringBuilder sbJ = b71.i.j("EditCustomMeal(customMealId=", ", _dateTime=", this.f14906c, this.f14905b, ", mealViewNavArgs=");
            sbJ.append(this.f14907d);
            sbJ.append(")");
            return sbJ.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i14) {
            parcel.getClass();
            Long l14 = this.f14905b;
            if (l14 == null) {
                parcel.writeInt(0);
            } else {
                sn.a.n(parcel, 1, l14);
            }
            parcel.writeString(this.f14906c);
            this.f14907d.writeToParcel(parcel, i14);
        }

        /* JADX INFO: renamed from: b21.l4$j$b, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lb21/l4$j$b;", "", "<init>", "()V", "Li63/c;", "Lb21/l4$j;", "serializer", "()Li63/c;", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
                this();
            }

            public final i63.c<j> serializer() {
                return a.f14908a;
            }

            private Companion() {
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(Long l14, String str, b11.m mVar) {
            super(null);
            str.getClass();
            mVar.getClass();
            this.f14905b = l14;
            this.f14906c = str;
            this.f14907d = mVar;
        }

        public /* synthetic */ j(Long l14, String str, b11.m mVar, int i14, p005kotlin.jvm.internal.j jVar) {
            this((i14 & 1) != 0 ? null : l14, str, mVar);
        }

        public /* synthetic */ j(Long l14, b63.u uVar, b11.m mVar, int i14, p005kotlin.jvm.internal.j jVar) {
            this((i14 & 1) != 0 ? null : l14, uVar, mVar);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public j(Long l14, b63.u uVar, b11.m mVar) {
            this(l14, uVar.toString(), mVar);
            uVar.getClass();
            mVar.getClass();
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u000b2\u00020\u0001:\u0002\f\rB\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\n¨\u0006\u000e"}, d2 = {"Lb21/l4$j0;", "Lb21/l4;", "Ll01/k;", "nutritionSettingsDTO", "<init>", "(Ll01/k;)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILl01/k;Lm63/u1;)V", "Companion", "a", "b", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @i63.h
    public static final /* data */ class j0 extends l4 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final l01.k f14909b;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final Parcelable.Creator<j0> CREATOR = new c();

        @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/nutrition/presentation/navigation/NutritionRoute.NutritionSetupCompletePlan.$serializer", "Lm63/e0;", "Lb21/l4$j0;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        @o13.e
        public static final /* synthetic */ class a implements m63.e0<j0> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f14910a;
            private static final k63.e descriptor;

            static {
                a aVar = new a();
                f14910a = aVar;
                m63.m1 m1Var = new m63.m1("com.garmin.android.apps.connectmobile.nutrition.presentation.navigation.NutritionRoute.NutritionSetupCompletePlan", aVar, 1);
                m1Var.j("nutritionSettingsDTO", true);
                descriptor = m1Var;
            }

            private a() {
            }

            @Override // m63.e0
            public final i63.c<?>[] childSerializers() {
                return new i63.c[]{j63.a.d(l01.k.a.f107896a)};
            }

            @Override // i63.b
            public final Object deserialize(l63.e eVar) {
                eVar.getClass();
                k63.e eVar2 = descriptor;
                l63.c cVarC = eVar.c(eVar2);
                int i14 = l63.c.f110557a;
                m63.u1 u1Var = null;
                boolean z14 = true;
                int i15 = 0;
                l01.k kVar = null;
                while (z14) {
                    int iE = cVarC.e(eVar2);
                    if (iE == -1) {
                        z14 = false;
                    } else {
                        if (iE != 0) {
                            hb.a.o(iE);
                            return null;
                        }
                        kVar = (l01.k) cVarC.v(eVar2, 0, l01.k.a.f107896a, kVar);
                        i15 = 1;
                    }
                }
                cVarC.b(eVar2);
                return new j0(i15, kVar, u1Var);
            }

            @Override // i63.i, i63.b
            /* JADX INFO: renamed from: getDescriptor */
            public final k63.e getF158591b() {
                return descriptor;
            }

            @Override // i63.i
            public final void serialize(l63.f fVar, Object obj) {
                j0 j0Var = (j0) obj;
                j0Var.getClass();
                l01.k kVar = j0Var.f14909b;
                k63.e eVar = descriptor;
                l63.d dVarC = fVar.c(eVar);
                if (dVarC.C(eVar) || kVar != null) {
                    dVarC.d(eVar, 0, l01.k.a.f107896a, kVar);
                }
                dVarC.b(eVar);
            }
        }

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class c implements Parcelable.Creator<j0> {
            @Override // android.os.Parcelable.Creator
            public final j0 createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new j0((l01.k) parcel.readValue(j0.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final j0[] newArray(int i14) {
                return new j0[i14];
            }
        }

        public /* synthetic */ j0(int i14, l01.k kVar, m63.u1 u1Var) {
            super(i14, u1Var);
            if ((i14 & 1) == 0) {
                this.f14909b = null;
            } else {
                this.f14909b = kVar;
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j0) && p005kotlin.jvm.internal.s.g(this.f14909b, ((j0) obj).f14909b);
        }

        public final int hashCode() {
            l01.k kVar = this.f14909b;
            if (kVar == null) {
                return 0;
            }
            return kVar.hashCode();
        }

        public final String toString() {
            return "NutritionSetupCompletePlan(nutritionSettingsDTO=" + this.f14909b + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i14) {
            parcel.getClass();
            parcel.writeValue(this.f14909b);
        }

        /* JADX INFO: renamed from: b21.l4$j0$b, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lb21/l4$j0$b;", "", "<init>", "()V", "Li63/c;", "Lb21/l4$j0;", "serializer", "()Li63/c;", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
                this();
            }

            public final i63.c<j0> serializer() {
                return a.f14910a;
            }

            private Companion() {
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public j0() {
            this((l01.k) null, 1, (p005kotlin.jvm.internal.j) (0 == true ? 1 : 0));
        }

        public j0(l01.k kVar) {
            super(null);
            this.f14909b = kVar;
        }

        public /* synthetic */ j0(l01.k kVar, int i14, p005kotlin.jvm.internal.j jVar) {
            this((i14 & 1) != 0 ? null : kVar);
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00172\u00020\u0001:\u0002\u0018\u0019B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nB1\b\u0016\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\u0011BM\b\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\t\u0010\u0016¨\u0006\u001a"}, d2 = {"Lb21/l4$k;", "Lb21/l4;", "", "_dateTime", "loggedFoodId", "_logCategory", "_logDestination", "Lb11/m;", "mealViewNavArgs", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lb11/m;)V", "Lb63/u;", "dateTime", "Li01/i;", "logCategory", "Lj11/c;", "logDestination", "(Lb63/u;Ljava/lang/String;Li01/i;Lj11/c;Lb11/m;)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lb11/m;Lm63/u1;)V", "Companion", "a", "b", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @i63.h
    public static final /* data */ class k extends l4 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f14911b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f14912c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f14913d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final String f14914e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final b11.m f14915f;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final Parcelable.Creator<k> CREATOR = new c();

        @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/nutrition/presentation/navigation/NutritionRoute.EditFood.$serializer", "Lm63/e0;", "Lb21/l4$k;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        @o13.e
        public static final /* synthetic */ class a implements m63.e0<k> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f14916a;
            private static final k63.e descriptor;

            static {
                a aVar = new a();
                f14916a = aVar;
                m63.m1 m1Var = new m63.m1("com.garmin.android.apps.connectmobile.nutrition.presentation.navigation.NutritionRoute.EditFood", aVar, 5);
                m1Var.j("_dateTime", false);
                m1Var.j("loggedFoodId", false);
                m1Var.j("_logCategory", false);
                m1Var.j("_logDestination", false);
                m1Var.j("mealViewNavArgs", false);
                descriptor = m1Var;
            }

            private a() {
            }

            @Override // m63.e0
            public final i63.c<?>[] childSerializers() {
                m63.y1 y1Var = m63.y1.f117048a;
                return new i63.c[]{y1Var, y1Var, y1Var, y1Var, b11.m.a.f14340a};
            }

            @Override // i63.b
            public final Object deserialize(l63.e eVar) {
                eVar.getClass();
                k63.e eVar2 = descriptor;
                l63.c cVarC = eVar.c(eVar2);
                int i14 = l63.c.f110557a;
                boolean z14 = true;
                int i15 = 0;
                String strR = null;
                String strR2 = null;
                String strR3 = null;
                String strR4 = null;
                b11.m mVar = null;
                while (z14) {
                    int iE = cVarC.e(eVar2);
                    if (iE == -1) {
                        z14 = false;
                    } else if (iE == 0) {
                        strR = cVarC.r(eVar2, 0);
                        i15 |= 1;
                    } else if (iE == 1) {
                        strR2 = cVarC.r(eVar2, 1);
                        i15 |= 2;
                    } else if (iE == 2) {
                        strR3 = cVarC.r(eVar2, 2);
                        i15 |= 4;
                    } else if (iE == 3) {
                        strR4 = cVarC.r(eVar2, 3);
                        i15 |= 8;
                    } else {
                        if (iE != 4) {
                            hb.a.o(iE);
                            return null;
                        }
                        mVar = (b11.m) cVarC.l(eVar2, 4, b11.m.a.f14340a, mVar);
                        i15 |= 16;
                    }
                }
                cVarC.b(eVar2);
                return new k(i15, strR, strR2, strR3, strR4, mVar, null);
            }

            @Override // i63.i, i63.b
            /* JADX INFO: renamed from: getDescriptor */
            public final k63.e getF158591b() {
                return descriptor;
            }

            @Override // i63.i
            public final void serialize(l63.f fVar, Object obj) {
                k kVar = (k) obj;
                kVar.getClass();
                k63.e eVar = descriptor;
                l63.d dVarC = fVar.c(eVar);
                dVarC.k(eVar, 0, kVar.f14911b);
                dVarC.k(eVar, 1, kVar.f14912c);
                dVarC.k(eVar, 2, kVar.f14913d);
                dVarC.k(eVar, 3, kVar.f14914e);
                dVarC.e(eVar, 4, b11.m.a.f14340a, kVar.f14915f);
                dVarC.b(eVar);
            }
        }

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class c implements Parcelable.Creator<k> {
            @Override // android.os.Parcelable.Creator
            public final k createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new k(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), b11.m.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final k[] newArray(int i14) {
                return new k[i14];
            }
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public k(b63.u uVar, String str, i01.i iVar, j11.c cVar, b11.m mVar) {
            this(uVar.toString(), str, iVar.f86776a, cVar.name(), mVar);
            uVar.getClass();
            str.getClass();
            iVar.getClass();
            cVar.getClass();
            mVar.getClass();
        }

        public final j11.c b() {
            w13.c cVar = j11.c.f96417f;
            p13.c.b bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar, cVar);
            while (bVarN.hasNext()) {
                j11.c cVar2 = (j11.c) bVarN.next();
                if (p005kotlin.jvm.internal.s.g(cVar2.name(), this.f14914e)) {
                    return cVar2;
                }
            }
            n23.j.s("Collection contains no element matching the predicate.");
            return null;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof k)) {
                return false;
            }
            k kVar = (k) obj;
            return p005kotlin.jvm.internal.s.g(this.f14911b, kVar.f14911b) && p005kotlin.jvm.internal.s.g(this.f14912c, kVar.f14912c) && p005kotlin.jvm.internal.s.g(this.f14913d, kVar.f14913d) && p005kotlin.jvm.internal.s.g(this.f14914e, kVar.f14914e) && p005kotlin.jvm.internal.s.g(this.f14915f, kVar.f14915f);
        }

        public final int hashCode() {
            return this.f14915f.hashCode() + wr.g.j(wr.g.j(wr.g.j(this.f14911b.hashCode() * 31, 31, this.f14912c), 31, this.f14913d), 31, this.f14914e);
        }

        public final String toString() {
            StringBuilder sbI = p6.b.i("EditFood(_dateTime=", this.f14911b, ", loggedFoodId=", this.f14912c, ", _logCategory=");
            sn.a.t(sbI, this.f14913d, ", _logDestination=", this.f14914e, ", mealViewNavArgs=");
            sbI.append(this.f14915f);
            sbI.append(")");
            return sbI.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i14) {
            parcel.getClass();
            parcel.writeString(this.f14911b);
            parcel.writeString(this.f14912c);
            parcel.writeString(this.f14913d);
            parcel.writeString(this.f14914e);
            this.f14915f.writeToParcel(parcel, i14);
        }

        /* JADX INFO: renamed from: b21.l4$k$b, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lb21/l4$k$b;", "", "<init>", "()V", "Li63/c;", "Lb21/l4$k;", "serializer", "()Li63/c;", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
                this();
            }

            public final i63.c<k> serializer() {
                return a.f14916a;
            }

            private Companion() {
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(String str, String str2, String str3, String str4, b11.m mVar) {
            super(null);
            str.getClass();
            str2.getClass();
            str3.getClass();
            str4.getClass();
            mVar.getClass();
            this.f14911b = str;
            this.f14912c = str2;
            this.f14913d = str3;
            this.f14914e = str4;
            this.f14915f = mVar;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ k(int i14, String str, String str2, String str3, String str4, b11.m mVar, m63.u1 u1Var) {
            super(i14, u1Var);
            if (31 != (i14 & 31)) {
                m63.k1.h(i14, 31, a.f14916a.getF158591b());
                throw null;
            }
            this.f14911b = str;
            this.f14912c = str2;
            this.f14913d = str3;
            this.f14914e = str4;
            this.f14915f = mVar;
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00182\u00020\u0001:\u0002\u0019\u001aB7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bB9\b\u0016\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u0012BW\b\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\n\u0010\u0017¨\u0006\u001b"}, d2 = {"Lb21/l4$l;", "Lb21/l4;", "", "_dateTime", "foodId", "logId", "_logCategory", "_logDestination", "Lb11/m;", "mealViewNavArgs", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lb11/m;)V", "Lb63/u;", "dateTime", "Li01/i;", "logCategory", "Lj11/c;", "logDestination", "(Lb63/u;Ljava/lang/String;Ljava/lang/String;Li01/i;Lj11/c;Lb11/m;)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lb11/m;Lm63/u1;)V", "Companion", "a", "b", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @i63.h
    public static final /* data */ class l extends l4 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f14918b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f14919c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f14920d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final String f14921e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final String f14922f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final b11.m f14923g;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final Parcelable.Creator<l> CREATOR = new c();

        @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/nutrition/presentation/navigation/NutritionRoute.EditRecipe.$serializer", "Lm63/e0;", "Lb21/l4$l;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        @o13.e
        public static final /* synthetic */ class a implements m63.e0<l> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f14924a;
            private static final k63.e descriptor;

            static {
                a aVar = new a();
                f14924a = aVar;
                m63.m1 m1Var = new m63.m1("com.garmin.android.apps.connectmobile.nutrition.presentation.navigation.NutritionRoute.EditRecipe", aVar, 6);
                m1Var.j("_dateTime", false);
                m1Var.j("foodId", false);
                m1Var.j("logId", false);
                m1Var.j("_logCategory", false);
                m1Var.j("_logDestination", false);
                m1Var.j("mealViewNavArgs", false);
                descriptor = m1Var;
            }

            private a() {
            }

            @Override // m63.e0
            public final i63.c<?>[] childSerializers() {
                m63.y1 y1Var = m63.y1.f117048a;
                return new i63.c[]{y1Var, y1Var, y1Var, y1Var, y1Var, b11.m.a.f14340a};
            }

            @Override // i63.b
            public final Object deserialize(l63.e eVar) {
                eVar.getClass();
                k63.e eVar2 = descriptor;
                l63.c cVarC = eVar.c(eVar2);
                int i14 = l63.c.f110557a;
                boolean z14 = true;
                int i15 = 0;
                String strR = null;
                String strR2 = null;
                String strR3 = null;
                String strR4 = null;
                String strR5 = null;
                b11.m mVar = null;
                while (z14) {
                    int iE = cVarC.e(eVar2);
                    switch (iE) {
                        case -1:
                            z14 = false;
                            break;
                        case 0:
                            strR = cVarC.r(eVar2, 0);
                            i15 |= 1;
                            break;
                        case 1:
                            strR2 = cVarC.r(eVar2, 1);
                            i15 |= 2;
                            break;
                        case 2:
                            strR3 = cVarC.r(eVar2, 2);
                            i15 |= 4;
                            break;
                        case 3:
                            strR4 = cVarC.r(eVar2, 3);
                            i15 |= 8;
                            break;
                        case 4:
                            strR5 = cVarC.r(eVar2, 4);
                            i15 |= 16;
                            break;
                        case 5:
                            mVar = (b11.m) cVarC.l(eVar2, 5, b11.m.a.f14340a, mVar);
                            i15 |= 32;
                            break;
                        default:
                            hb.a.o(iE);
                            return null;
                    }
                }
                cVarC.b(eVar2);
                return new l(i15, strR, strR2, strR3, strR4, strR5, mVar, null);
            }

            @Override // i63.i, i63.b
            /* JADX INFO: renamed from: getDescriptor */
            public final k63.e getF158591b() {
                return descriptor;
            }

            @Override // i63.i
            public final void serialize(l63.f fVar, Object obj) {
                l lVar = (l) obj;
                lVar.getClass();
                k63.e eVar = descriptor;
                l63.d dVarC = fVar.c(eVar);
                dVarC.k(eVar, 0, lVar.f14918b);
                dVarC.k(eVar, 1, lVar.f14919c);
                dVarC.k(eVar, 2, lVar.f14920d);
                dVarC.k(eVar, 3, lVar.f14921e);
                dVarC.k(eVar, 4, lVar.f14922f);
                dVarC.e(eVar, 5, b11.m.a.f14340a, lVar.f14923g);
                dVarC.b(eVar);
            }
        }

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class c implements Parcelable.Creator<l> {
            @Override // android.os.Parcelable.Creator
            public final l createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new l(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), b11.m.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final l[] newArray(int i14) {
                return new l[i14];
            }
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public l(b63.u uVar, String str, String str2, i01.i iVar, j11.c cVar, b11.m mVar) {
            this(uVar.toString(), str, str2, iVar.f86776a, cVar.name(), mVar);
            uVar.getClass();
            str.getClass();
            str2.getClass();
            iVar.getClass();
            cVar.getClass();
            mVar.getClass();
        }

        public final j11.c b() {
            w13.c cVar = j11.c.f96417f;
            p13.c.b bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar, cVar);
            while (bVarN.hasNext()) {
                j11.c cVar2 = (j11.c) bVarN.next();
                if (p005kotlin.jvm.internal.s.g(cVar2.name(), this.f14922f)) {
                    return cVar2;
                }
            }
            n23.j.s("Collection contains no element matching the predicate.");
            return null;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof l)) {
                return false;
            }
            l lVar = (l) obj;
            return p005kotlin.jvm.internal.s.g(this.f14918b, lVar.f14918b) && p005kotlin.jvm.internal.s.g(this.f14919c, lVar.f14919c) && p005kotlin.jvm.internal.s.g(this.f14920d, lVar.f14920d) && p005kotlin.jvm.internal.s.g(this.f14921e, lVar.f14921e) && p005kotlin.jvm.internal.s.g(this.f14922f, lVar.f14922f) && p005kotlin.jvm.internal.s.g(this.f14923g, lVar.f14923g);
        }

        public final int hashCode() {
            return this.f14923g.hashCode() + wr.g.j(wr.g.j(wr.g.j(wr.g.j(this.f14918b.hashCode() * 31, 31, this.f14919c), 31, this.f14920d), 31, this.f14921e), 31, this.f14922f);
        }

        public final String toString() {
            StringBuilder sbI = p6.b.i("EditRecipe(_dateTime=", this.f14918b, ", foodId=", this.f14919c, ", logId=");
            sn.a.t(sbI, this.f14920d, ", _logCategory=", this.f14921e, ", _logDestination=");
            sbI.append(this.f14922f);
            sbI.append(", mealViewNavArgs=");
            sbI.append(this.f14923g);
            sbI.append(")");
            return sbI.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i14) {
            parcel.getClass();
            parcel.writeString(this.f14918b);
            parcel.writeString(this.f14919c);
            parcel.writeString(this.f14920d);
            parcel.writeString(this.f14921e);
            parcel.writeString(this.f14922f);
            this.f14923g.writeToParcel(parcel, i14);
        }

        /* JADX INFO: renamed from: b21.l4$l$b, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lb21/l4$l$b;", "", "<init>", "()V", "Li63/c;", "Lb21/l4$l;", "serializer", "()Li63/c;", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
                this();
            }

            public final i63.c<l> serializer() {
                return a.f14924a;
            }

            private Companion() {
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ l(int i14, String str, String str2, String str3, String str4, String str5, b11.m mVar, m63.u1 u1Var) {
            super(i14, u1Var);
            if (63 != (i14 & 63)) {
                m63.k1.h(i14, 63, a.f14924a.getF158591b());
                throw null;
            }
            this.f14918b = str;
            this.f14919c = str2;
            this.f14920d = str3;
            this.f14921e = str4;
            this.f14922f = str5;
            this.f14923g = mVar;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(String str, String str2, String str3, String str4, String str5, b11.m mVar) {
            super(null);
            hb.a.p(str, str2, str3, str4, str5);
            mVar.getClass();
            this.f14918b = str;
            this.f14919c = str2;
            this.f14920d = str3;
            this.f14921e = str4;
            this.f14922f = str5;
            this.f14923g = mVar;
        }
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00142\u00020\u0001:\u0002\u0015\u0016B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bB/\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\f\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000eBA\b\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\n\u0010\u0013¨\u0006\u0017"}, d2 = {"Lb21/l4$m;", "Lb21/l4;", "Lm21/b;", "mode", "", "_dateTime", "Lb11/k;", "initialMeal", "", "fromVoice", "<init>", "(Lm21/b;Ljava/lang/String;Lb11/k;Z)V", "Lb63/u;", "dateTime", "(Lm21/b;Lb63/u;Lb11/k;Z)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILm21/b;Ljava/lang/String;Lb11/k;ZLm63/u1;)V", "Companion", "a", "b", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @i63.h
    public static final /* data */ class m extends l4 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final m21.b f14927b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f14928c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final b11.k f14929d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f14930e;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final Parcelable.Creator<m> CREATOR = new c();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final o13.l<i63.c<Object>>[] f14926f = {o13.m.a(o13.n.PUBLICATION, new m4(1)), null, null, null};

        @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/nutrition/presentation/navigation/NutritionRoute.FoodSearch.$serializer", "Lm63/e0;", "Lb21/l4$m;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        @o13.e
        public static final /* synthetic */ class a implements m63.e0<m> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f14931a;
            private static final k63.e descriptor;

            static {
                a aVar = new a();
                f14931a = aVar;
                m63.m1 m1Var = new m63.m1("com.garmin.android.apps.connectmobile.nutrition.presentation.navigation.NutritionRoute.FoodSearch", aVar, 4);
                m1Var.j("mode", false);
                m1Var.j("_dateTime", false);
                m1Var.j("initialMeal", true);
                m1Var.j("fromVoice", true);
                descriptor = m1Var;
            }

            private a() {
            }

            @Override // m63.e0
            public final i63.c<?>[] childSerializers() {
                return new i63.c[]{m.f14926f[0].getValue(), m63.y1.f117048a, j63.a.d(b11.k.a.f14330a), m63.g.f116948a};
            }

            @Override // i63.b
            public final Object deserialize(l63.e eVar) {
                eVar.getClass();
                k63.e eVar2 = descriptor;
                l63.c cVarC = eVar.c(eVar2);
                o13.l<i63.c<Object>>[] lVarArr = m.f14926f;
                int i14 = l63.c.f110557a;
                boolean z14 = true;
                int i15 = 0;
                boolean zG = false;
                m21.b bVar = null;
                String strR = null;
                b11.k kVar = null;
                while (z14) {
                    int iE = cVarC.e(eVar2);
                    if (iE == -1) {
                        z14 = false;
                    } else if (iE == 0) {
                        bVar = (m21.b) cVarC.l(eVar2, 0, lVarArr[0].getValue(), bVar);
                        i15 |= 1;
                    } else if (iE == 1) {
                        strR = cVarC.r(eVar2, 1);
                        i15 |= 2;
                    } else if (iE == 2) {
                        kVar = (b11.k) cVarC.v(eVar2, 2, b11.k.a.f14330a, kVar);
                        i15 |= 4;
                    } else {
                        if (iE != 3) {
                            hb.a.o(iE);
                            return null;
                        }
                        zG = cVarC.g(eVar2, 3);
                        i15 |= 8;
                    }
                }
                cVarC.b(eVar2);
                return new m(i15, bVar, strR, kVar, zG, (m63.u1) null);
            }

            @Override // i63.i, i63.b
            /* JADX INFO: renamed from: getDescriptor */
            public final k63.e getF158591b() {
                return descriptor;
            }

            @Override // i63.i
            public final void serialize(l63.f fVar, Object obj) {
                m mVar = (m) obj;
                mVar.getClass();
                k63.e eVar = descriptor;
                l63.d dVarC = fVar.c(eVar);
                i63.c<Object> value = m.f14926f[0].getValue();
                m21.b bVar = mVar.f14927b;
                boolean z14 = mVar.f14930e;
                b11.k kVar = mVar.f14929d;
                dVarC.e(eVar, 0, value, bVar);
                dVarC.k(eVar, 1, mVar.f14928c);
                if (dVarC.C(eVar) || kVar != null) {
                    dVarC.d(eVar, 2, b11.k.a.f14330a, kVar);
                }
                if (dVarC.C(eVar) || z14) {
                    dVarC.n(eVar, 3, z14);
                }
                dVarC.b(eVar);
            }
        }

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class c implements Parcelable.Creator<m> {
            @Override // android.os.Parcelable.Creator
            public final m createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new m((m21.b) parcel.readParcelable(m.class.getClassLoader()), parcel.readString(), parcel.readInt() == 0 ? null : b11.k.CREATOR.createFromParcel(parcel), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final m[] newArray(int i14) {
                return new m[i14];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ m(int i14, m21.b bVar, String str, b11.k kVar, boolean z14, m63.u1 u1Var) {
            super(i14, u1Var);
            if (3 != (i14 & 3)) {
                m63.k1.h(i14, 3, a.f14931a.getF158591b());
                throw null;
            }
            this.f14927b = bVar;
            this.f14928c = str;
            if ((i14 & 4) == 0) {
                this.f14929d = null;
            } else {
                this.f14929d = kVar;
            }
            if ((i14 & 8) == 0) {
                this.f14930e = false;
            } else {
                this.f14930e = z14;
            }
        }

        public final b63.u b() {
            return b63.u.Companion.a(b63.u.INSTANCE, this.f14928c);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof m)) {
                return false;
            }
            m mVar = (m) obj;
            return p005kotlin.jvm.internal.s.g(this.f14927b, mVar.f14927b) && p005kotlin.jvm.internal.s.g(this.f14928c, mVar.f14928c) && p005kotlin.jvm.internal.s.g(this.f14929d, mVar.f14929d) && this.f14930e == mVar.f14930e;
        }

        public final int hashCode() {
            int iJ = wr.g.j(this.f14927b.hashCode() * 31, 31, this.f14928c);
            b11.k kVar = this.f14929d;
            return Boolean.hashCode(this.f14930e) + ((iJ + (kVar == null ? 0 : kVar.hashCode())) * 31);
        }

        public final String toString() {
            return "FoodSearch(mode=" + this.f14927b + ", _dateTime=" + this.f14928c + ", initialMeal=" + this.f14929d + ", fromVoice=" + this.f14930e + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i14) {
            parcel.getClass();
            parcel.writeParcelable(this.f14927b, i14);
            parcel.writeString(this.f14928c);
            b11.k kVar = this.f14929d;
            if (kVar == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                kVar.writeToParcel(parcel, i14);
            }
            parcel.writeInt(this.f14930e ? 1 : 0);
        }

        /* JADX INFO: renamed from: b21.l4$m$b, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lb21/l4$m$b;", "", "<init>", "()V", "Li63/c;", "Lb21/l4$m;", "serializer", "()Li63/c;", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
                this();
            }

            public final i63.c<m> serializer() {
                return a.f14931a;
            }

            private Companion() {
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(m21.b bVar, String str, b11.k kVar, boolean z14) {
            super(null);
            bVar.getClass();
            str.getClass();
            this.f14927b = bVar;
            this.f14928c = str;
            this.f14929d = kVar;
            this.f14930e = z14;
        }

        public /* synthetic */ m(m21.b bVar, String str, b11.k kVar, boolean z14, int i14, p005kotlin.jvm.internal.j jVar) {
            this(bVar, str, (i14 & 4) != 0 ? null : kVar, (i14 & 8) != 0 ? false : z14);
        }

        public /* synthetic */ m(m21.b bVar, b63.u uVar, b11.k kVar, boolean z14, int i14, p005kotlin.jvm.internal.j jVar) {
            this(bVar, uVar, (i14 & 4) != 0 ? null : kVar, (i14 & 8) != 0 ? false : z14);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public m(m21.b bVar, b63.u uVar, b11.k kVar, boolean z14) {
            this(bVar, uVar.toString(), kVar, z14);
            bVar.getClass();
            uVar.getClass();
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \f2\u00020\u00012\u00020\u0002:\u0002\r\u000eB\u0011\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B%\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000b¨\u0006\u000f"}, d2 = {"Lb21/l4$n;", "Lb21/l4;", "", "Lro0/i;", "extras", "<init>", "(Lro0/i;)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILro0/i;Lm63/u1;)V", "Companion", "a", "b", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @i63.h
    public static final /* data */ class n extends l4 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ro0.i f14933b;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final Parcelable.Creator<n> CREATOR = new c();

        @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/nutrition/presentation/navigation/NutritionRoute.Help.$serializer", "Lm63/e0;", "Lb21/l4$n;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        @o13.e
        public static final /* synthetic */ class a implements m63.e0<n> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f14934a;
            private static final k63.e descriptor;

            static {
                a aVar = new a();
                f14934a = aVar;
                m63.m1 m1Var = new m63.m1("com.garmin.android.apps.connectmobile.nutrition.presentation.navigation.NutritionRoute.Help", aVar, 1);
                m1Var.j("extras", true);
                descriptor = m1Var;
            }

            private a() {
            }

            @Override // m63.e0
            public final i63.c<?>[] childSerializers() {
                return new i63.c[]{ro0.i.a.f153770a};
            }

            @Override // i63.b
            public final Object deserialize(l63.e eVar) {
                eVar.getClass();
                k63.e eVar2 = descriptor;
                l63.c cVarC = eVar.c(eVar2);
                int i14 = l63.c.f110557a;
                m63.u1 u1Var = null;
                boolean z14 = true;
                int i15 = 0;
                ro0.i iVar = null;
                while (z14) {
                    int iE = cVarC.e(eVar2);
                    if (iE == -1) {
                        z14 = false;
                    } else {
                        if (iE != 0) {
                            hb.a.o(iE);
                            return null;
                        }
                        iVar = (ro0.i) cVarC.l(eVar2, 0, ro0.i.a.f153770a, iVar);
                        i15 = 1;
                    }
                }
                cVarC.b(eVar2);
                return new n(i15, iVar, u1Var);
            }

            @Override // i63.i, i63.b
            /* JADX INFO: renamed from: getDescriptor */
            public final k63.e getF158591b() {
                return descriptor;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0023  */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // i63.i
            public final void serialize(l63.f fVar, Object obj) {
                n nVar = (n) obj;
                nVar.getClass();
                ro0.i iVar = nVar.f14933b;
                k63.e eVar = descriptor;
                l63.d dVarC = fVar.c(eVar);
                if (dVarC.C(eVar)) {
                    dVarC.e(eVar, 0, ro0.i.a.f153770a, iVar);
                } else {
                    if (!p005kotlin.jvm.internal.s.g(iVar, new ro0.i(ro0.l.NUTRITION, (String) null, 2, (p005kotlin.jvm.internal.j) (0 == true ? 1 : 0)))) {
                        dVarC.e(eVar, 0, ro0.i.a.f153770a, iVar);
                    }
                }
                dVarC.b(eVar);
            }
        }

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class c implements Parcelable.Creator<n> {
            @Override // android.os.Parcelable.Creator
            public final n createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new n((ro0.i) parcel.readValue(n.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final n[] newArray(int i14) {
                return new n[i14];
            }
        }

        static {
            ro0.i.Companion bVar = ro0.i.INSTANCE;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public /* synthetic */ n(int i14, ro0.i iVar, m63.u1 u1Var) {
            super(i14, u1Var);
            if ((i14 & 1) != 0) {
                this.f14933b = iVar;
            } else {
                this.f14933b = new ro0.i(ro0.l.NUTRITION, (String) null, 2, (p005kotlin.jvm.internal.j) (0 == true ? 1 : 0));
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof n) && p005kotlin.jvm.internal.s.g(this.f14933b, ((n) obj).f14933b);
        }

        public final int hashCode() {
            return this.f14933b.hashCode();
        }

        public final String toString() {
            return "Help(extras=" + this.f14933b + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i14) {
            parcel.getClass();
            parcel.writeValue(this.f14933b);
        }

        /* JADX INFO: renamed from: b21.l4$n$b, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lb21/l4$n$b;", "", "<init>", "()V", "Li63/c;", "Lb21/l4$n;", "serializer", "()Li63/c;", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
                this();
            }

            public final i63.c<n> serializer() {
                return a.f14934a;
            }

            private Companion() {
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public n() {
            this((ro0.i) null, 1, (p005kotlin.jvm.internal.j) (0 == true ? 1 : 0));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(ro0.i iVar) {
            super(null);
            iVar.getClass();
            this.f14933b = iVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public /* synthetic */ n(ro0.i iVar, int i14, p005kotlin.jvm.internal.j jVar) {
            if ((i14 & 1) != 0) {
                iVar = new ro0.i(ro0.l.NUTRITION, (String) null, 2, (p005kotlin.jvm.internal.j) (0 == true ? 1 : 0));
            }
            this(iVar);
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00152\u00020\u0001:\u0002\u0016\u0017B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nB5\b\u0016\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\u000fBM\b\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\t\u0010\u0014¨\u0006\u0018"}, d2 = {"Lb21/l4$o;", "Lb21/l4;", "", "_mode", "_dateTime", "regionCode", RemoteConfigConstants.RequestFieldKey.LANGUAGE_CODE, "Lb11/m;", "mealViewNavArgs", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lb11/m;)V", "Lb21/o4;", "mode", "Lb63/u;", "dateTime", "(Lb21/o4;Lb63/u;Ljava/lang/String;Ljava/lang/String;Lb11/m;)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lb11/m;Lm63/u1;)V", "Companion", "a", "b", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @i63.h
    public static final /* data */ class o extends l4 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f14936b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f14937c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f14938d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final String f14939e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final b11.m f14940f;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final Parcelable.Creator<o> CREATOR = new c();

        @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/nutrition/presentation/navigation/NutritionRoute.ImageRecognitionAndBarcodeScanner.$serializer", "Lm63/e0;", "Lb21/l4$o;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        @o13.e
        public static final /* synthetic */ class a implements m63.e0<o> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f14941a;
            private static final k63.e descriptor;

            static {
                a aVar = new a();
                f14941a = aVar;
                m63.m1 m1Var = new m63.m1("com.garmin.android.apps.connectmobile.nutrition.presentation.navigation.NutritionRoute.ImageRecognitionAndBarcodeScanner", aVar, 5);
                m1Var.j("_mode", false);
                m1Var.j("_dateTime", false);
                m1Var.j("regionCode", false);
                m1Var.j(RemoteConfigConstants.RequestFieldKey.LANGUAGE_CODE, false);
                m1Var.j("mealViewNavArgs", false);
                descriptor = m1Var;
            }

            private a() {
            }

            @Override // m63.e0
            public final i63.c<?>[] childSerializers() {
                m63.y1 y1Var = m63.y1.f117048a;
                return new i63.c[]{y1Var, y1Var, j63.a.d(y1Var), j63.a.d(y1Var), b11.m.a.f14340a};
            }

            @Override // i63.b
            public final Object deserialize(l63.e eVar) {
                eVar.getClass();
                k63.e eVar2 = descriptor;
                l63.c cVarC = eVar.c(eVar2);
                int i14 = l63.c.f110557a;
                boolean z14 = true;
                int i15 = 0;
                String strR = null;
                String strR2 = null;
                String str = null;
                String str2 = null;
                b11.m mVar = null;
                while (z14) {
                    int iE = cVarC.e(eVar2);
                    if (iE == -1) {
                        z14 = false;
                    } else if (iE == 0) {
                        strR = cVarC.r(eVar2, 0);
                        i15 |= 1;
                    } else if (iE == 1) {
                        strR2 = cVarC.r(eVar2, 1);
                        i15 |= 2;
                    } else if (iE == 2) {
                        str = (String) cVarC.v(eVar2, 2, m63.y1.f117048a, str);
                        i15 |= 4;
                    } else if (iE == 3) {
                        str2 = (String) cVarC.v(eVar2, 3, m63.y1.f117048a, str2);
                        i15 |= 8;
                    } else {
                        if (iE != 4) {
                            hb.a.o(iE);
                            return null;
                        }
                        mVar = (b11.m) cVarC.l(eVar2, 4, b11.m.a.f14340a, mVar);
                        i15 |= 16;
                    }
                }
                cVarC.b(eVar2);
                return new o(i15, strR, strR2, str, str2, mVar, null);
            }

            @Override // i63.i, i63.b
            /* JADX INFO: renamed from: getDescriptor */
            public final k63.e getF158591b() {
                return descriptor;
            }

            @Override // i63.i
            public final void serialize(l63.f fVar, Object obj) {
                o oVar = (o) obj;
                oVar.getClass();
                k63.e eVar = descriptor;
                l63.d dVarC = fVar.c(eVar);
                dVarC.k(eVar, 0, oVar.f14936b);
                dVarC.k(eVar, 1, oVar.f14937c);
                m63.y1 y1Var = m63.y1.f117048a;
                dVarC.d(eVar, 2, y1Var, oVar.f14938d);
                dVarC.d(eVar, 3, y1Var, oVar.f14939e);
                dVarC.e(eVar, 4, b11.m.a.f14340a, oVar.f14940f);
                dVarC.b(eVar);
            }
        }

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class c implements Parcelable.Creator<o> {
            @Override // android.os.Parcelable.Creator
            public final o createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new o(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), b11.m.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final o[] newArray(int i14) {
                return new o[i14];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ o(int i14, String str, String str2, String str3, String str4, b11.m mVar, m63.u1 u1Var) {
            super(i14, u1Var);
            if (31 != (i14 & 31)) {
                m63.k1.h(i14, 31, a.f14941a.getF158591b());
                throw null;
            }
            this.f14936b = str;
            this.f14937c = str2;
            this.f14938d = str3;
            this.f14939e = str4;
            this.f14940f = mVar;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof o)) {
                return false;
            }
            o oVar = (o) obj;
            return p005kotlin.jvm.internal.s.g(this.f14936b, oVar.f14936b) && p005kotlin.jvm.internal.s.g(this.f14937c, oVar.f14937c) && p005kotlin.jvm.internal.s.g(this.f14938d, oVar.f14938d) && p005kotlin.jvm.internal.s.g(this.f14939e, oVar.f14939e) && p005kotlin.jvm.internal.s.g(this.f14940f, oVar.f14940f);
        }

        public final int hashCode() {
            int iJ = wr.g.j(this.f14936b.hashCode() * 31, 31, this.f14937c);
            String str = this.f14938d;
            int iHashCode = (iJ + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f14939e;
            return this.f14940f.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder sbI = p6.b.i("ImageRecognitionAndBarcodeScanner(_mode=", this.f14936b, ", _dateTime=", this.f14937c, ", regionCode=");
            sn.a.t(sbI, this.f14938d, ", languageCode=", this.f14939e, ", mealViewNavArgs=");
            sbI.append(this.f14940f);
            sbI.append(")");
            return sbI.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i14) {
            parcel.getClass();
            parcel.writeString(this.f14936b);
            parcel.writeString(this.f14937c);
            parcel.writeString(this.f14938d);
            parcel.writeString(this.f14939e);
            this.f14940f.writeToParcel(parcel, i14);
        }

        /* JADX INFO: renamed from: b21.l4$o$b, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lb21/l4$o$b;", "", "<init>", "()V", "Li63/c;", "Lb21/l4$o;", "serializer", "()Li63/c;", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
                this();
            }

            public final i63.c<o> serializer() {
                return a.f14941a;
            }

            private Companion() {
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(String str, String str2, String str3, String str4, b11.m mVar) {
            super(null);
            str.getClass();
            str2.getClass();
            mVar.getClass();
            this.f14936b = str;
            this.f14937c = str2;
            this.f14938d = str3;
            this.f14939e = str4;
            this.f14940f = mVar;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public o(o4 o4Var, b63.u uVar, String str, String str2, b11.m mVar) {
            this(o4Var.name(), uVar.toString(), str, str2, mVar);
            o4Var.getClass();
            uVar.getClass();
            mVar.getClass();
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \r2\u00020\u0001:\u0002\u000e\u000fB\u001d\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B-\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\f¨\u0006\u0010"}, d2 = {"Lb21/l4$o0;", "Lb21/l4;", "", "openedFromSettings", "Ll01/k;", "nutritionSettingsDTO", "<init>", "(ZLl01/k;)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(IZLl01/k;Lm63/u1;)V", "Companion", "a", "b", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @i63.h
    public static final /* data */ class o0 extends l4 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f14942b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final l01.k f14943c;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final Parcelable.Creator<o0> CREATOR = new c();

        @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/nutrition/presentation/navigation/NutritionRoute.NutritionSetupLocation.$serializer", "Lm63/e0;", "Lb21/l4$o0;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        @o13.e
        public static final /* synthetic */ class a implements m63.e0<o0> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f14944a;
            private static final k63.e descriptor;

            static {
                a aVar = new a();
                f14944a = aVar;
                m63.m1 m1Var = new m63.m1("com.garmin.android.apps.connectmobile.nutrition.presentation.navigation.NutritionRoute.NutritionSetupLocation", aVar, 2);
                m1Var.j("openedFromSettings", true);
                m1Var.j("nutritionSettingsDTO", true);
                descriptor = m1Var;
            }

            private a() {
            }

            @Override // m63.e0
            public final i63.c<?>[] childSerializers() {
                return new i63.c[]{m63.g.f116948a, j63.a.d(l01.k.a.f107896a)};
            }

            @Override // i63.b
            public final Object deserialize(l63.e eVar) {
                eVar.getClass();
                k63.e eVar2 = descriptor;
                l63.c cVarC = eVar.c(eVar2);
                int i14 = l63.c.f110557a;
                m63.u1 u1Var = null;
                boolean z14 = true;
                int i15 = 0;
                boolean zG = false;
                l01.k kVar = null;
                while (z14) {
                    int iE = cVarC.e(eVar2);
                    if (iE == -1) {
                        z14 = false;
                    } else if (iE == 0) {
                        zG = cVarC.g(eVar2, 0);
                        i15 |= 1;
                    } else {
                        if (iE != 1) {
                            hb.a.o(iE);
                            return null;
                        }
                        kVar = (l01.k) cVarC.v(eVar2, 1, l01.k.a.f107896a, kVar);
                        i15 |= 2;
                    }
                }
                cVarC.b(eVar2);
                return new o0(i15, zG, kVar, u1Var);
            }

            @Override // i63.i, i63.b
            /* JADX INFO: renamed from: getDescriptor */
            public final k63.e getF158591b() {
                return descriptor;
            }

            @Override // i63.i
            public final void serialize(l63.f fVar, Object obj) {
                o0 o0Var = (o0) obj;
                o0Var.getClass();
                l01.k kVar = o0Var.f14943c;
                boolean z14 = o0Var.f14942b;
                k63.e eVar = descriptor;
                l63.d dVarC = fVar.c(eVar);
                if (dVarC.C(eVar) || z14) {
                    dVarC.n(eVar, 0, z14);
                }
                if (dVarC.C(eVar) || kVar != null) {
                    dVarC.d(eVar, 1, l01.k.a.f107896a, kVar);
                }
                dVarC.b(eVar);
            }
        }

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class c implements Parcelable.Creator<o0> {
            @Override // android.os.Parcelable.Creator
            public final o0 createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new o0(parcel.readInt() != 0, (l01.k) parcel.readValue(o0.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final o0[] newArray(int i14) {
                return new o0[i14];
            }
        }

        public /* synthetic */ o0(int i14, boolean z14, l01.k kVar, m63.u1 u1Var) {
            super(i14, u1Var);
            this.f14942b = (i14 & 1) == 0 ? false : z14;
            if ((i14 & 2) == 0) {
                this.f14943c = null;
            } else {
                this.f14943c = kVar;
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof o0)) {
                return false;
            }
            o0 o0Var = (o0) obj;
            return this.f14942b == o0Var.f14942b && p005kotlin.jvm.internal.s.g(this.f14943c, o0Var.f14943c);
        }

        public final int hashCode() {
            int iHashCode = Boolean.hashCode(this.f14942b) * 31;
            l01.k kVar = this.f14943c;
            return iHashCode + (kVar == null ? 0 : kVar.hashCode());
        }

        public final String toString() {
            return "NutritionSetupLocation(openedFromSettings=" + this.f14942b + ", nutritionSettingsDTO=" + this.f14943c + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i14) {
            parcel.getClass();
            parcel.writeInt(this.f14942b ? 1 : 0);
            parcel.writeValue(this.f14943c);
        }

        /* JADX INFO: renamed from: b21.l4$o0$b, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lb21/l4$o0$b;", "", "<init>", "()V", "Li63/c;", "Lb21/l4$o0;", "serializer", "()Li63/c;", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
                this();
            }

            public final i63.c<o0> serializer() {
                return a.f14944a;
            }

            private Companion() {
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public o0() {
            this(false, (l01.k) null, 3, (p005kotlin.jvm.internal.j) (0 == true ? 1 : 0));
        }

        public o0(boolean z14, l01.k kVar) {
            super(null);
            this.f14942b = z14;
            this.f14943c = kVar;
        }

        public /* synthetic */ o0(boolean z14, l01.k kVar, int i14, p005kotlin.jvm.internal.j jVar) {
            this((i14 & 1) != 0 ? false : z14, (i14 & 2) != 0 ? null : kVar);
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00122\u00020\u0001:\u0002\u0013\u0014B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB#\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\fB7\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\b\u0010\u0011¨\u0006\u0015"}, d2 = {"Lb21/l4$p;", "Lb21/l4;", "", "_dateTime", "Lb11/m;", "mealViewNavArgs", "", "fromVoice", "<init>", "(Ljava/lang/String;Lb11/m;Z)V", "Lb63/u;", "dateTime", "(Lb63/u;Lb11/m;Z)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILjava/lang/String;Lb11/m;ZLm63/u1;)V", "Companion", "a", "b", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @i63.h
    public static final /* data */ class p extends l4 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f14945b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final b11.m f14946c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f14947d;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final Parcelable.Creator<p> CREATOR = new c();

        @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/nutrition/presentation/navigation/NutritionRoute.ImageRecognitionConfirmation.$serializer", "Lm63/e0;", "Lb21/l4$p;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        @o13.e
        public static final /* synthetic */ class a implements m63.e0<p> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f14948a;
            private static final k63.e descriptor;

            static {
                a aVar = new a();
                f14948a = aVar;
                m63.m1 m1Var = new m63.m1("com.garmin.android.apps.connectmobile.nutrition.presentation.navigation.NutritionRoute.ImageRecognitionConfirmation", aVar, 3);
                m1Var.j("_dateTime", false);
                m1Var.j("mealViewNavArgs", false);
                m1Var.j("fromVoice", true);
                descriptor = m1Var;
            }

            private a() {
            }

            @Override // m63.e0
            public final i63.c<?>[] childSerializers() {
                return new i63.c[]{m63.y1.f117048a, b11.m.a.f14340a, m63.g.f116948a};
            }

            @Override // i63.b
            public final Object deserialize(l63.e eVar) {
                eVar.getClass();
                k63.e eVar2 = descriptor;
                l63.c cVarC = eVar.c(eVar2);
                int i14 = l63.c.f110557a;
                boolean z14 = true;
                int i15 = 0;
                boolean zG = false;
                String strR = null;
                b11.m mVar = null;
                while (z14) {
                    int iE = cVarC.e(eVar2);
                    if (iE == -1) {
                        z14 = false;
                    } else if (iE == 0) {
                        strR = cVarC.r(eVar2, 0);
                        i15 |= 1;
                    } else if (iE == 1) {
                        mVar = (b11.m) cVarC.l(eVar2, 1, b11.m.a.f14340a, mVar);
                        i15 |= 2;
                    } else {
                        if (iE != 2) {
                            hb.a.o(iE);
                            return null;
                        }
                        zG = cVarC.g(eVar2, 2);
                        i15 |= 4;
                    }
                }
                cVarC.b(eVar2);
                return new p(i15, strR, mVar, zG, (m63.u1) null);
            }

            @Override // i63.i, i63.b
            /* JADX INFO: renamed from: getDescriptor */
            public final k63.e getF158591b() {
                return descriptor;
            }

            @Override // i63.i
            public final void serialize(l63.f fVar, Object obj) {
                p pVar = (p) obj;
                pVar.getClass();
                k63.e eVar = descriptor;
                l63.d dVarC = fVar.c(eVar);
                String str = pVar.f14945b;
                boolean z14 = pVar.f14947d;
                dVarC.k(eVar, 0, str);
                dVarC.e(eVar, 1, b11.m.a.f14340a, pVar.f14946c);
                if (dVarC.C(eVar) || z14) {
                    dVarC.n(eVar, 2, z14);
                }
                dVarC.b(eVar);
            }
        }

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class c implements Parcelable.Creator<p> {
            @Override // android.os.Parcelable.Creator
            public final p createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new p(parcel.readString(), b11.m.CREATOR.createFromParcel(parcel), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final p[] newArray(int i14) {
                return new p[i14];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ p(int i14, String str, b11.m mVar, boolean z14, m63.u1 u1Var) {
            super(i14, u1Var);
            if (3 != (i14 & 3)) {
                m63.k1.h(i14, 3, a.f14948a.getF158591b());
                throw null;
            }
            this.f14945b = str;
            this.f14946c = mVar;
            if ((i14 & 4) == 0) {
                this.f14947d = false;
            } else {
                this.f14947d = z14;
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof p)) {
                return false;
            }
            p pVar = (p) obj;
            return p005kotlin.jvm.internal.s.g(this.f14945b, pVar.f14945b) && p005kotlin.jvm.internal.s.g(this.f14946c, pVar.f14946c) && this.f14947d == pVar.f14947d;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f14947d) + ((this.f14946c.hashCode() + (this.f14945b.hashCode() * 31)) * 31);
        }

        public final String toString() {
            StringBuilder sb3 = new StringBuilder("ImageRecognitionConfirmation(_dateTime=");
            sb3.append(this.f14945b);
            sb3.append(", mealViewNavArgs=");
            sb3.append(this.f14946c);
            sb3.append(", fromVoice=");
            return hb.a.k(sb3, this.f14947d, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i14) {
            parcel.getClass();
            parcel.writeString(this.f14945b);
            this.f14946c.writeToParcel(parcel, i14);
            parcel.writeInt(this.f14947d ? 1 : 0);
        }

        /* JADX INFO: renamed from: b21.l4$p$b, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lb21/l4$p$b;", "", "<init>", "()V", "Li63/c;", "Lb21/l4$p;", "serializer", "()Li63/c;", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
                this();
            }

            public final i63.c<p> serializer() {
                return a.f14948a;
            }

            private Companion() {
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(String str, b11.m mVar, boolean z14) {
            super(null);
            str.getClass();
            mVar.getClass();
            this.f14945b = str;
            this.f14946c = mVar;
            this.f14947d = z14;
        }

        public /* synthetic */ p(String str, b11.m mVar, boolean z14, int i14, p005kotlin.jvm.internal.j jVar) {
            this(str, mVar, (i14 & 4) != 0 ? false : z14);
        }

        public /* synthetic */ p(b63.u uVar, b11.m mVar, boolean z14, int i14, p005kotlin.jvm.internal.j jVar) {
            this(uVar, mVar, (i14 & 4) != 0 ? false : z14);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public p(b63.u uVar, b11.m mVar, boolean z14) {
            this(uVar.toString(), mVar, z14);
            uVar.getClass();
            mVar.getClass();
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00152\u00020\u0001:\u0002\u0016\u0017B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nB+\b\u0016\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\u000fBA\b\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\t\u0010\u0014¨\u0006\u0018"}, d2 = {"Lb21/l4$q;", "Lb21/l4;", "", "_mode", "_dateTime", "Lb11/m;", "mealViewNavArgs", "", "fromVoice", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lb11/m;Z)V", "Lb21/o4;", "mode", "Lb63/u;", "dateTime", "(Lb21/o4;Lb63/u;Lb11/m;Z)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lb11/m;ZLm63/u1;)V", "Companion", "a", "b", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @i63.h
    public static final /* data */ class q extends l4 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f14950b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f14951c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final b11.m f14952d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f14953e;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final Parcelable.Creator<q> CREATOR = new c();

        @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/nutrition/presentation/navigation/NutritionRoute.ImageRecognitionResults.$serializer", "Lm63/e0;", "Lb21/l4$q;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        @o13.e
        public static final /* synthetic */ class a implements m63.e0<q> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f14954a;
            private static final k63.e descriptor;

            static {
                a aVar = new a();
                f14954a = aVar;
                m63.m1 m1Var = new m63.m1("com.garmin.android.apps.connectmobile.nutrition.presentation.navigation.NutritionRoute.ImageRecognitionResults", aVar, 4);
                m1Var.j("_mode", false);
                m1Var.j("_dateTime", false);
                m1Var.j("mealViewNavArgs", false);
                m1Var.j("fromVoice", true);
                descriptor = m1Var;
            }

            private a() {
            }

            @Override // m63.e0
            public final i63.c<?>[] childSerializers() {
                m63.y1 y1Var = m63.y1.f117048a;
                return new i63.c[]{y1Var, y1Var, b11.m.a.f14340a, m63.g.f116948a};
            }

            @Override // i63.b
            public final Object deserialize(l63.e eVar) {
                eVar.getClass();
                k63.e eVar2 = descriptor;
                l63.c cVarC = eVar.c(eVar2);
                int i14 = l63.c.f110557a;
                boolean z14 = true;
                int i15 = 0;
                boolean zG = false;
                String strR = null;
                String strR2 = null;
                b11.m mVar = null;
                while (z14) {
                    int iE = cVarC.e(eVar2);
                    if (iE == -1) {
                        z14 = false;
                    } else if (iE == 0) {
                        strR = cVarC.r(eVar2, 0);
                        i15 |= 1;
                    } else if (iE == 1) {
                        strR2 = cVarC.r(eVar2, 1);
                        i15 |= 2;
                    } else if (iE == 2) {
                        mVar = (b11.m) cVarC.l(eVar2, 2, b11.m.a.f14340a, mVar);
                        i15 |= 4;
                    } else {
                        if (iE != 3) {
                            hb.a.o(iE);
                            return null;
                        }
                        zG = cVarC.g(eVar2, 3);
                        i15 |= 8;
                    }
                }
                cVarC.b(eVar2);
                return new q(i15, strR, strR2, mVar, zG, (m63.u1) null);
            }

            @Override // i63.i, i63.b
            /* JADX INFO: renamed from: getDescriptor */
            public final k63.e getF158591b() {
                return descriptor;
            }

            @Override // i63.i
            public final void serialize(l63.f fVar, Object obj) {
                q qVar = (q) obj;
                qVar.getClass();
                k63.e eVar = descriptor;
                l63.d dVarC = fVar.c(eVar);
                String str = qVar.f14950b;
                boolean z14 = qVar.f14953e;
                dVarC.k(eVar, 0, str);
                dVarC.k(eVar, 1, qVar.f14951c);
                dVarC.e(eVar, 2, b11.m.a.f14340a, qVar.f14952d);
                if (dVarC.C(eVar) || z14) {
                    dVarC.n(eVar, 3, z14);
                }
                dVarC.b(eVar);
            }
        }

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class c implements Parcelable.Creator<q> {
            @Override // android.os.Parcelable.Creator
            public final q createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new q(parcel.readString(), parcel.readString(), b11.m.CREATOR.createFromParcel(parcel), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final q[] newArray(int i14) {
                return new q[i14];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ q(int i14, String str, String str2, b11.m mVar, boolean z14, m63.u1 u1Var) {
            super(i14, u1Var);
            if (7 != (i14 & 7)) {
                m63.k1.h(i14, 7, a.f14954a.getF158591b());
                throw null;
            }
            this.f14950b = str;
            this.f14951c = str2;
            this.f14952d = mVar;
            if ((i14 & 8) == 0) {
                this.f14953e = false;
            } else {
                this.f14953e = z14;
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof q)) {
                return false;
            }
            q qVar = (q) obj;
            return p005kotlin.jvm.internal.s.g(this.f14950b, qVar.f14950b) && p005kotlin.jvm.internal.s.g(this.f14951c, qVar.f14951c) && p005kotlin.jvm.internal.s.g(this.f14952d, qVar.f14952d) && this.f14953e == qVar.f14953e;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f14953e) + ((this.f14952d.hashCode() + wr.g.j(this.f14950b.hashCode() * 31, 31, this.f14951c)) * 31);
        }

        public final String toString() {
            StringBuilder sbI = p6.b.i("ImageRecognitionResults(_mode=", this.f14950b, ", _dateTime=", this.f14951c, ", mealViewNavArgs=");
            sbI.append(this.f14952d);
            sbI.append(", fromVoice=");
            sbI.append(this.f14953e);
            sbI.append(")");
            return sbI.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i14) {
            parcel.getClass();
            parcel.writeString(this.f14950b);
            parcel.writeString(this.f14951c);
            this.f14952d.writeToParcel(parcel, i14);
            parcel.writeInt(this.f14953e ? 1 : 0);
        }

        /* JADX INFO: renamed from: b21.l4$q$b, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lb21/l4$q$b;", "", "<init>", "()V", "Li63/c;", "Lb21/l4$q;", "serializer", "()Li63/c;", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
                this();
            }

            public final i63.c<q> serializer() {
                return a.f14954a;
            }

            private Companion() {
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(String str, String str2, b11.m mVar, boolean z14) {
            super(null);
            str.getClass();
            str2.getClass();
            mVar.getClass();
            this.f14950b = str;
            this.f14951c = str2;
            this.f14952d = mVar;
            this.f14953e = z14;
        }

        public /* synthetic */ q(String str, String str2, b11.m mVar, boolean z14, int i14, p005kotlin.jvm.internal.j jVar) {
            this(str, str2, mVar, (i14 & 8) != 0 ? false : z14);
        }

        public /* synthetic */ q(o4 o4Var, b63.u uVar, b11.m mVar, boolean z14, int i14, p005kotlin.jvm.internal.j jVar) {
            this(o4Var, uVar, mVar, (i14 & 8) != 0 ? false : z14);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public q(o4 o4Var, b63.u uVar, b11.m mVar, boolean z14) {
            this(o4Var.name(), uVar.toString(), mVar, z14);
            o4Var.getClass();
            uVar.getClass();
            mVar.getClass();
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00142\u00020\u0001:\u0002\u0015\u0016B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB'\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005¢\u0006\u0004\b\u0007\u0010\u000eB?\b\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0005\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0007\u0010\u0013¨\u0006\u0017"}, d2 = {"Lb21/l4$r;", "Lb21/l4;", "", "_action", "_date", "", "foodIds", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "Li01/a;", "action", "Lb63/o;", "date", "loggedFoodIds", "(Li01/a;Lb63/o;Ljava/util/List;)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Lm63/u1;)V", "Companion", "a", "b", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @i63.h
    public static final /* data */ class r extends l4 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f14957b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f14958c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final List<String> f14959d;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final Parcelable.Creator<r> CREATOR = new c();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final o13.l<i63.c<Object>>[] f14956e = {null, null, o13.m.a(o13.n.PUBLICATION, new m4(2))};

        @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/nutrition/presentation/navigation/NutritionRoute.LegacyBulkEditFood.$serializer", "Lm63/e0;", "Lb21/l4$r;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        @o13.e
        public static final /* synthetic */ class a implements m63.e0<r> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f14960a;
            private static final k63.e descriptor;

            static {
                a aVar = new a();
                f14960a = aVar;
                m63.m1 m1Var = new m63.m1("com.garmin.android.apps.connectmobile.nutrition.presentation.navigation.NutritionRoute.LegacyBulkEditFood", aVar, 3);
                m1Var.j("_action", false);
                m1Var.j("_date", false);
                m1Var.j("foodIds", false);
                descriptor = m1Var;
            }

            private a() {
            }

            @Override // m63.e0
            public final i63.c<?>[] childSerializers() {
                o13.l<i63.c<Object>>[] lVarArr = r.f14956e;
                m63.y1 y1Var = m63.y1.f117048a;
                return new i63.c[]{y1Var, y1Var, lVarArr[2].getValue()};
            }

            @Override // i63.b
            public final Object deserialize(l63.e eVar) {
                eVar.getClass();
                k63.e eVar2 = descriptor;
                l63.c cVarC = eVar.c(eVar2);
                o13.l<i63.c<Object>>[] lVarArr = r.f14956e;
                int i14 = l63.c.f110557a;
                boolean z14 = true;
                int i15 = 0;
                String strR = null;
                String strR2 = null;
                List list = null;
                while (z14) {
                    int iE = cVarC.e(eVar2);
                    if (iE == -1) {
                        z14 = false;
                    } else if (iE == 0) {
                        strR = cVarC.r(eVar2, 0);
                        i15 |= 1;
                    } else if (iE == 1) {
                        strR2 = cVarC.r(eVar2, 1);
                        i15 |= 2;
                    } else {
                        if (iE != 2) {
                            hb.a.o(iE);
                            return null;
                        }
                        list = (List) cVarC.l(eVar2, 2, lVarArr[2].getValue(), list);
                        i15 |= 4;
                    }
                }
                cVarC.b(eVar2);
                return new r(i15, strR, strR2, list, null);
            }

            @Override // i63.i, i63.b
            /* JADX INFO: renamed from: getDescriptor */
            public final k63.e getF158591b() {
                return descriptor;
            }

            @Override // i63.i
            public final void serialize(l63.f fVar, Object obj) {
                r rVar = (r) obj;
                rVar.getClass();
                k63.e eVar = descriptor;
                l63.d dVarC = fVar.c(eVar);
                o13.l<i63.c<Object>>[] lVarArr = r.f14956e;
                dVarC.k(eVar, 0, rVar.f14957b);
                dVarC.k(eVar, 1, rVar.f14958c);
                dVarC.e(eVar, 2, lVarArr[2].getValue(), rVar.f14959d);
                dVarC.b(eVar);
            }
        }

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class c implements Parcelable.Creator<r> {
            @Override // android.os.Parcelable.Creator
            public final r createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new r(parcel.readString(), parcel.readString(), parcel.createStringArrayList());
            }

            @Override // android.os.Parcelable.Creator
            public final r[] newArray(int i14) {
                return new r[i14];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ r(int i14, String str, String str2, List list, m63.u1 u1Var) {
            super(i14, u1Var);
            if (7 != (i14 & 7)) {
                m63.k1.h(i14, 7, a.f14960a.getF158591b());
                throw null;
            }
            this.f14957b = str;
            this.f14958c = str2;
            this.f14959d = list;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof r)) {
                return false;
            }
            r rVar = (r) obj;
            return p005kotlin.jvm.internal.s.g(this.f14957b, rVar.f14957b) && p005kotlin.jvm.internal.s.g(this.f14958c, rVar.f14958c) && p005kotlin.jvm.internal.s.g(this.f14959d, rVar.f14959d);
        }

        public final int hashCode() {
            return this.f14959d.hashCode() + wr.g.j(this.f14957b.hashCode() * 31, 31, this.f14958c);
        }

        public final String toString() {
            return u62.z.c(p6.b.i("LegacyBulkEditFood(_action=", this.f14957b, ", _date=", this.f14958c, ", foodIds="), this.f14959d, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i14) {
            parcel.getClass();
            parcel.writeString(this.f14957b);
            parcel.writeString(this.f14958c);
            parcel.writeStringList(this.f14959d);
        }

        /* JADX INFO: renamed from: b21.l4$r$b, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lb21/l4$r$b;", "", "<init>", "()V", "Li63/c;", "Lb21/l4$r;", "serializer", "()Li63/c;", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
                this();
            }

            public final i63.c<r> serializer() {
                return a.f14960a;
            }

            private Companion() {
            }
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public r(i01.a aVar, b63.o oVar, List<String> list) {
            this(aVar.f86723a, oVar.toString(), list);
            aVar.getClass();
            oVar.getClass();
            list.getClass();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(String str, String str2, List<String> list) {
            super(null);
            str.getClass();
            str2.getClass();
            list.getClass();
            this.f14957b = str;
            this.f14958c = str2;
            this.f14959d = list;
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00132\u00020\u0001:\u0002\u0014\u0015B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tB)\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n¢\u0006\u0004\b\b\u0010\rBA\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\b\u0010\u0012¨\u0006\u0016"}, d2 = {"Lb21/l4$s;", "Lb21/l4;", "", "mealId", "", "mealName", "_startTime", "_endTime", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Lb63/v;", "startTime", "endTime", "(JLjava/lang/String;Lb63/v;Lb63/v;)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(IJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lm63/u1;)V", "Companion", "a", "b", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @i63.h
    public static final /* data */ class s extends l4 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f14962b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f14963c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f14964d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final String f14965e;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final Parcelable.Creator<s> CREATOR = new c();

        @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/nutrition/presentation/navigation/NutritionRoute.LegacyMealWindow.$serializer", "Lm63/e0;", "Lb21/l4$s;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        @o13.e
        public static final /* synthetic */ class a implements m63.e0<s> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f14966a;
            private static final k63.e descriptor;

            static {
                a aVar = new a();
                f14966a = aVar;
                m63.m1 m1Var = new m63.m1("com.garmin.android.apps.connectmobile.nutrition.presentation.navigation.NutritionRoute.LegacyMealWindow", aVar, 4);
                m1Var.j("mealId", false);
                m1Var.j("mealName", false);
                m1Var.j("_startTime", false);
                m1Var.j("_endTime", false);
                descriptor = m1Var;
            }

            private a() {
            }

            @Override // m63.e0
            public final i63.c<?>[] childSerializers() {
                m63.y1 y1Var = m63.y1.f117048a;
                return new i63.c[]{m63.v0.f117027a, y1Var, y1Var, y1Var};
            }

            @Override // i63.b
            public final Object deserialize(l63.e eVar) {
                eVar.getClass();
                k63.e eVar2 = descriptor;
                l63.c cVarC = eVar.c(eVar2);
                int i14 = l63.c.f110557a;
                int i15 = 0;
                long jW = 0;
                String strR = null;
                String strR2 = null;
                String strR3 = null;
                boolean z14 = true;
                while (z14) {
                    int iE = cVarC.e(eVar2);
                    if (iE == -1) {
                        z14 = false;
                    } else if (iE == 0) {
                        jW = cVarC.w(eVar2, 0);
                        i15 |= 1;
                    } else if (iE == 1) {
                        strR = cVarC.r(eVar2, 1);
                        i15 |= 2;
                    } else if (iE == 2) {
                        strR2 = cVarC.r(eVar2, 2);
                        i15 |= 4;
                    } else {
                        if (iE != 3) {
                            hb.a.o(iE);
                            return null;
                        }
                        strR3 = cVarC.r(eVar2, 3);
                        i15 |= 8;
                    }
                }
                cVarC.b(eVar2);
                return new s(i15, jW, strR, strR2, strR3, null);
            }

            @Override // i63.i, i63.b
            /* JADX INFO: renamed from: getDescriptor */
            public final k63.e getF158591b() {
                return descriptor;
            }

            @Override // i63.i
            public final void serialize(l63.f fVar, Object obj) {
                s sVar = (s) obj;
                sVar.getClass();
                k63.e eVar = descriptor;
                l63.d dVarC = fVar.c(eVar);
                dVarC.z(eVar, 0, sVar.f14962b);
                dVarC.k(eVar, 1, sVar.f14963c);
                dVarC.k(eVar, 2, sVar.f14964d);
                dVarC.k(eVar, 3, sVar.f14965e);
                dVarC.b(eVar);
            }
        }

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class c implements Parcelable.Creator<s> {
            @Override // android.os.Parcelable.Creator
            public final s createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new s(parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final s[] newArray(int i14) {
                return new s[i14];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ s(int i14, long j8, String str, String str2, String str3, m63.u1 u1Var) {
            super(i14, u1Var);
            if (15 != (i14 & 15)) {
                m63.k1.h(i14, 15, a.f14966a.getF158591b());
                throw null;
            }
            this.f14962b = j8;
            this.f14963c = str;
            this.f14964d = str2;
            this.f14965e = str3;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof s)) {
                return false;
            }
            s sVar = (s) obj;
            return this.f14962b == sVar.f14962b && p005kotlin.jvm.internal.s.g(this.f14963c, sVar.f14963c) && p005kotlin.jvm.internal.s.g(this.f14964d, sVar.f14964d) && p005kotlin.jvm.internal.s.g(this.f14965e, sVar.f14965e);
        }

        public final int hashCode() {
            return this.f14965e.hashCode() + wr.g.j(wr.g.j(Long.hashCode(this.f14962b) * 31, 31, this.f14963c), 31, this.f14964d);
        }

        public final String toString() {
            StringBuilder sbK = com.airbnb.lottie.animation.keyframe.a.k(this.f14962b, "LegacyMealWindow(mealId=", ", mealName=", this.f14963c);
            sn.a.t(sbK, ", _startTime=", this.f14964d, ", _endTime=", this.f14965e);
            sbK.append(")");
            return sbK.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i14) {
            parcel.getClass();
            parcel.writeLong(this.f14962b);
            parcel.writeString(this.f14963c);
            parcel.writeString(this.f14964d);
            parcel.writeString(this.f14965e);
        }

        /* JADX INFO: renamed from: b21.l4$s$b, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lb21/l4$s$b;", "", "<init>", "()V", "Li63/c;", "Lb21/l4$s;", "serializer", "()Li63/c;", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
                this();
            }

            public final i63.c<s> serializer() {
                return a.f14966a;
            }

            private Companion() {
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s(long j8, String str, String str2, String str3) {
            super(null);
            com.airbnb.lottie.animation.keyframe.a.y(str, str2, str3);
            this.f14962b = j8;
            this.f14963c = str;
            this.f14964d = str2;
            this.f14965e = str3;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public s(long j8, String str, b63.v vVar, b63.v vVar2) {
            this(j8, str, vVar.toString(), vVar2.toString());
            str.getClass();
            vVar.getClass();
            vVar2.getClass();
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \r2\u00020\u0001:\u0002\u000e\u000fB!\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bB5\b\u0010\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0007\u0010\f¨\u0006\u0010"}, d2 = {"Lb21/l4$u;", "Lb21/l4;", "Lg01/z;", "meals", "", "", "percentages", "<init>", "(Lg01/z;Ljava/util/List;)V", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILg01/z;Ljava/util/List;Lm63/u1;)V", "Companion", "a", "b", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @i63.h
    public static final /* data */ class u extends l4 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final g01.z f14971b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List<Integer> f14972c;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final Parcelable.Creator<u> CREATOR = new c();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final o13.l<i63.c<Object>>[] f14970d = {null, o13.m.a(o13.n.PUBLICATION, new m4(4))};

        @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/nutrition/presentation/navigation/NutritionRoute.LegacyNutritionEditMealGoals.$serializer", "Lm63/e0;", "Lb21/l4$u;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        @o13.e
        public static final /* synthetic */ class a implements m63.e0<u> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f14973a;
            private static final k63.e descriptor;

            static {
                a aVar = new a();
                f14973a = aVar;
                m63.m1 m1Var = new m63.m1("com.garmin.android.apps.connectmobile.nutrition.presentation.navigation.NutritionRoute.LegacyNutritionEditMealGoals", aVar, 2);
                m1Var.j("meals", true);
                m1Var.j("percentages", false);
                descriptor = m1Var;
            }

            private a() {
            }

            @Override // m63.e0
            public final i63.c<?>[] childSerializers() {
                return new i63.c[]{j63.a.d(g01.z.a.f74299a), u.f14970d[1].getValue()};
            }

            @Override // i63.b
            public final Object deserialize(l63.e eVar) {
                eVar.getClass();
                k63.e eVar2 = descriptor;
                l63.c cVarC = eVar.c(eVar2);
                o13.l<i63.c<Object>>[] lVarArr = u.f14970d;
                int i14 = l63.c.f110557a;
                m63.u1 u1Var = null;
                boolean z14 = true;
                int i15 = 0;
                g01.z zVar = null;
                List list = null;
                while (z14) {
                    int iE = cVarC.e(eVar2);
                    if (iE == -1) {
                        z14 = false;
                    } else if (iE == 0) {
                        zVar = (g01.z) cVarC.v(eVar2, 0, g01.z.a.f74299a, zVar);
                        i15 |= 1;
                    } else {
                        if (iE != 1) {
                            hb.a.o(iE);
                            return null;
                        }
                        list = (List) cVarC.l(eVar2, 1, lVarArr[1].getValue(), list);
                        i15 |= 2;
                    }
                }
                cVarC.b(eVar2);
                return new u(i15, zVar, list, u1Var);
            }

            @Override // i63.i, i63.b
            /* JADX INFO: renamed from: getDescriptor */
            public final k63.e getF158591b() {
                return descriptor;
            }

            @Override // i63.i
            public final void serialize(l63.f fVar, Object obj) {
                u uVar = (u) obj;
                uVar.getClass();
                g01.z zVar = uVar.f14971b;
                k63.e eVar = descriptor;
                l63.d dVarC = fVar.c(eVar);
                o13.l<i63.c<Object>>[] lVarArr = u.f14970d;
                if (dVarC.C(eVar) || zVar != null) {
                    dVarC.d(eVar, 0, g01.z.a.f74299a, zVar);
                }
                dVarC.e(eVar, 1, lVarArr[1].getValue(), uVar.f14972c);
                dVarC.b(eVar);
            }
        }

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class c implements Parcelable.Creator<u> {
            @Override // android.os.Parcelable.Creator
            public final u createFromParcel(Parcel parcel) {
                parcel.getClass();
                g01.z zVar = (g01.z) parcel.readValue(u.class.getClassLoader());
                int i14 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i14);
                for (int i15 = 0; i15 != i14; i15++) {
                    arrayList.add(Integer.valueOf(parcel.readInt()));
                }
                return new u(zVar, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final u[] newArray(int i14) {
                return new u[i14];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ u(int i14, g01.z zVar, List list, m63.u1 u1Var) {
            super(i14, u1Var);
            if (2 != (i14 & 2)) {
                m63.k1.h(i14, 2, a.f14973a.getF158591b());
                throw null;
            }
            if ((i14 & 1) == 0) {
                this.f14971b = null;
            } else {
                this.f14971b = zVar;
            }
            this.f14972c = list;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof u)) {
                return false;
            }
            u uVar = (u) obj;
            return p005kotlin.jvm.internal.s.g(this.f14971b, uVar.f14971b) && p005kotlin.jvm.internal.s.g(this.f14972c, uVar.f14972c);
        }

        public final int hashCode() {
            g01.z zVar = this.f14971b;
            return this.f14972c.hashCode() + ((zVar == null ? 0 : zVar.hashCode()) * 31);
        }

        public final String toString() {
            return "LegacyNutritionEditMealGoals(meals=" + this.f14971b + ", percentages=" + this.f14972c + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i14) {
            parcel.getClass();
            parcel.writeValue(this.f14971b);
            Iterator itE = kg.f.e(this.f14972c, parcel);
            while (itE.hasNext()) {
                parcel.writeInt(((Number) itE.next()).intValue());
            }
        }

        /* JADX INFO: renamed from: b21.l4$u$b, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lb21/l4$u$b;", "", "<init>", "()V", "Li63/c;", "Lb21/l4$u;", "serializer", "()Li63/c;", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
                this();
            }

            public final i63.c<u> serializer() {
                return a.f14973a;
            }

            private Companion() {
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public u(g01.z zVar, List<Integer> list) {
            super(null);
            list.getClass();
            this.f14971b = zVar;
            this.f14972c = list;
        }

        public /* synthetic */ u(g01.z zVar, List list, int i14, p005kotlin.jvm.internal.j jVar) {
            this((i14 & 1) != 0 ? null : zVar, list);
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \f2\u00020\u00012\u00020\u0002:\u0002\r\u000eB\u0011\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B%\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000b¨\u0006\u000f"}, d2 = {"Lb21/l4$u0;", "Lb21/l4;", "", "Lz10/f0;", "extras", "<init>", "(Lz10/f0;)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILz10/f0;Lm63/u1;)V", "Companion", "a", "b", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @i63.h
    public static final /* data */ class u0 extends l4 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final z10.f0 f14974b;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final Parcelable.Creator<u0> CREATOR = new c();

        @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/nutrition/presentation/navigation/NutritionRoute.NutritionStorageAndProcessing.$serializer", "Lm63/e0;", "Lb21/l4$u0;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        @o13.e
        public static final /* synthetic */ class a implements m63.e0<u0> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f14975a;
            private static final k63.e descriptor;

            static {
                a aVar = new a();
                f14975a = aVar;
                m63.m1 m1Var = new m63.m1("com.garmin.android.apps.connectmobile.nutrition.presentation.navigation.NutritionRoute.NutritionStorageAndProcessing", aVar, 1);
                m1Var.j("extras", true);
                descriptor = m1Var;
            }

            private a() {
            }

            @Override // m63.e0
            public final i63.c<?>[] childSerializers() {
                return new i63.c[]{z10.f0.a.f200986a};
            }

            @Override // i63.b
            public final Object deserialize(l63.e eVar) {
                eVar.getClass();
                k63.e eVar2 = descriptor;
                l63.c cVarC = eVar.c(eVar2);
                int i14 = l63.c.f110557a;
                m63.u1 u1Var = null;
                boolean z14 = true;
                int i15 = 0;
                z10.f0 f0Var = null;
                while (z14) {
                    int iE = cVarC.e(eVar2);
                    if (iE == -1) {
                        z14 = false;
                    } else {
                        if (iE != 0) {
                            hb.a.o(iE);
                            return null;
                        }
                        f0Var = (z10.f0) cVarC.l(eVar2, 0, z10.f0.a.f200986a, f0Var);
                        i15 = 1;
                    }
                }
                cVarC.b(eVar2);
                return new u0(i15, f0Var, u1Var);
            }

            @Override // i63.i, i63.b
            /* JADX INFO: renamed from: getDescriptor */
            public final k63.e getF158591b() {
                return descriptor;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0027  */
            @Override // i63.i
            public final void serialize(l63.f fVar, Object obj) {
                u0 u0Var = (u0) obj;
                u0Var.getClass();
                z10.f0 f0Var = u0Var.f14974b;
                k63.e eVar = descriptor;
                l63.d dVarC = fVar.c(eVar);
                if (dVarC.C(eVar)) {
                    dVarC.e(eVar, 0, z10.f0.a.f200986a, f0Var);
                } else {
                    if (!p005kotlin.jvm.internal.s.g(f0Var, new z10.f0(q92.x.DI_CONNECT_UPLOAD, false, (hl.a) null, false, 12, (p005kotlin.jvm.internal.j) null))) {
                        dVarC.e(eVar, 0, z10.f0.a.f200986a, f0Var);
                    }
                }
                dVarC.b(eVar);
            }
        }

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class c implements Parcelable.Creator<u0> {
            @Override // android.os.Parcelable.Creator
            public final u0 createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new u0((z10.f0) parcel.readValue(u0.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final u0[] newArray(int i14) {
                return new u0[i14];
            }
        }

        static {
            z10.f0.Companion bVar = z10.f0.INSTANCE;
        }

        public /* synthetic */ u0(int i14, z10.f0 f0Var, m63.u1 u1Var) {
            super(i14, u1Var);
            if ((i14 & 1) != 0) {
                this.f14974b = f0Var;
                return;
            }
            this.f14974b = new z10.f0(q92.x.DI_CONNECT_UPLOAD, false, (hl.a) null, false, 12, (p005kotlin.jvm.internal.j) null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof u0) && p005kotlin.jvm.internal.s.g(this.f14974b, ((u0) obj).f14974b);
        }

        public final int hashCode() {
            return this.f14974b.hashCode();
        }

        public final String toString() {
            return "NutritionStorageAndProcessing(extras=" + this.f14974b + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i14) {
            parcel.getClass();
            parcel.writeValue(this.f14974b);
        }

        /* JADX INFO: renamed from: b21.l4$u0$b, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lb21/l4$u0$b;", "", "<init>", "()V", "Li63/c;", "Lb21/l4$u0;", "serializer", "()Li63/c;", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
                this();
            }

            public final i63.c<u0> serializer() {
                return a.f14975a;
            }

            private Companion() {
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public u0() {
            this((z10.f0) null, 1, (p005kotlin.jvm.internal.j) (0 == true ? 1 : 0));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public u0(z10.f0 f0Var) {
            super(null);
            f0Var.getClass();
            this.f14974b = f0Var;
        }

        public /* synthetic */ u0(z10.f0 f0Var, int i14, p005kotlin.jvm.internal.j jVar) {
            if ((i14 & 1) != 0) {
                f0Var = new z10.f0(q92.x.DI_CONNECT_UPLOAD, false, (hl.a) null, false, 12, (p005kotlin.jvm.internal.j) null);
            }
            this(f0Var);
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00142\u00020\u0001:\u0002\u0015\u0016B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tB)\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\u000eB?\b\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\b\u0010\u0013¨\u0006\u0017"}, d2 = {"Lb21/l4$v0;", "Lb21/l4;", "", "_action", "_date", "", "isTimelineView", "isNutrition2Enabled", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZZ)V", "Lq11/a;", "action", "Lb63/o;", "date", "(Lq11/a;Lb63/o;ZZ)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;ZZLm63/u1;)V", "Companion", "a", "b", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @i63.h
    public static final /* data */ class v0 extends l4 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f14977b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f14978c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f14979d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f14980e;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final Parcelable.Creator<v0> CREATOR = new c();

        @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/nutrition/presentation/navigation/NutritionRoute.PickFoodToBulkEdit.$serializer", "Lm63/e0;", "Lb21/l4$v0;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        @o13.e
        public static final /* synthetic */ class a implements m63.e0<v0> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f14981a;
            private static final k63.e descriptor;

            static {
                a aVar = new a();
                f14981a = aVar;
                m63.m1 m1Var = new m63.m1("com.garmin.android.apps.connectmobile.nutrition.presentation.navigation.NutritionRoute.PickFoodToBulkEdit", aVar, 4);
                m1Var.j("_action", false);
                m1Var.j("_date", false);
                m1Var.j("isTimelineView", false);
                m1Var.j("isNutrition2Enabled", false);
                descriptor = m1Var;
            }

            private a() {
            }

            @Override // m63.e0
            public final i63.c<?>[] childSerializers() {
                m63.y1 y1Var = m63.y1.f117048a;
                m63.g gVar = m63.g.f116948a;
                return new i63.c[]{y1Var, y1Var, gVar, gVar};
            }

            @Override // i63.b
            public final Object deserialize(l63.e eVar) {
                eVar.getClass();
                k63.e eVar2 = descriptor;
                l63.c cVarC = eVar.c(eVar2);
                int i14 = l63.c.f110557a;
                boolean z14 = true;
                int i15 = 0;
                boolean zG = false;
                boolean zG2 = false;
                String strR = null;
                String strR2 = null;
                while (z14) {
                    int iE = cVarC.e(eVar2);
                    if (iE == -1) {
                        z14 = false;
                    } else if (iE == 0) {
                        strR = cVarC.r(eVar2, 0);
                        i15 |= 1;
                    } else if (iE == 1) {
                        strR2 = cVarC.r(eVar2, 1);
                        i15 |= 2;
                    } else if (iE == 2) {
                        zG = cVarC.g(eVar2, 2);
                        i15 |= 4;
                    } else {
                        if (iE != 3) {
                            hb.a.o(iE);
                            return null;
                        }
                        zG2 = cVarC.g(eVar2, 3);
                        i15 |= 8;
                    }
                }
                cVarC.b(eVar2);
                return new v0(i15, strR, strR2, zG, zG2, null);
            }

            @Override // i63.i, i63.b
            /* JADX INFO: renamed from: getDescriptor */
            public final k63.e getF158591b() {
                return descriptor;
            }

            @Override // i63.i
            public final void serialize(l63.f fVar, Object obj) {
                v0 v0Var = (v0) obj;
                v0Var.getClass();
                k63.e eVar = descriptor;
                l63.d dVarC = fVar.c(eVar);
                dVarC.k(eVar, 0, v0Var.f14977b);
                dVarC.k(eVar, 1, v0Var.f14978c);
                dVarC.n(eVar, 2, v0Var.f14979d);
                dVarC.n(eVar, 3, v0Var.f14980e);
                dVarC.b(eVar);
            }
        }

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class c implements Parcelable.Creator<v0> {
            @Override // android.os.Parcelable.Creator
            public final v0 createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new v0(parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final v0[] newArray(int i14) {
                return new v0[i14];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ v0(int i14, String str, String str2, boolean z14, boolean z15, m63.u1 u1Var) {
            super(i14, u1Var);
            if (15 != (i14 & 15)) {
                m63.k1.h(i14, 15, a.f14981a.getF158591b());
                throw null;
            }
            this.f14977b = str;
            this.f14978c = str2;
            this.f14979d = z14;
            this.f14980e = z15;
        }

        public final q11.a b() {
            Object next;
            q11.a.INSTANCE.getClass();
            Iterator<T> it = q11.a.f142071i.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!p005kotlin.jvm.internal.s.g(((q11.a) next).f142072a, this.f14977b));
            q11.a aVar = (q11.a) next;
            return aVar == null ? q11.a.MOVE : aVar;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof v0)) {
                return false;
            }
            v0 v0Var = (v0) obj;
            return p005kotlin.jvm.internal.s.g(this.f14977b, v0Var.f14977b) && p005kotlin.jvm.internal.s.g(this.f14978c, v0Var.f14978c) && this.f14979d == v0Var.f14979d && this.f14980e == v0Var.f14980e;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f14980e) + q6.f.g(wr.g.j(this.f14977b.hashCode() * 31, 31, this.f14978c), 31, this.f14979d);
        }

        public final String toString() {
            return com.airbnb.lottie.animation.keyframe.a.f(", isNutrition2Enabled=", ")", p6.b.i("PickFoodToBulkEdit(_action=", this.f14977b, ", _date=", this.f14978c, ", isTimelineView="), this.f14979d, this.f14980e);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i14) {
            parcel.getClass();
            parcel.writeString(this.f14977b);
            parcel.writeString(this.f14978c);
            parcel.writeInt(this.f14979d ? 1 : 0);
            parcel.writeInt(this.f14980e ? 1 : 0);
        }

        /* JADX INFO: renamed from: b21.l4$v0$b, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lb21/l4$v0$b;", "", "<init>", "()V", "Li63/c;", "Lb21/l4$v0;", "serializer", "()Li63/c;", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
                this();
            }

            public final i63.c<v0> serializer() {
                return a.f14981a;
            }

            private Companion() {
            }
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public v0(q11.a aVar, b63.o oVar, boolean z14, boolean z15) {
            this(aVar.f142072a, oVar.toString(), z14, z15);
            aVar.getClass();
            oVar.getClass();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public v0(String str, String str2, boolean z14, boolean z15) {
            super(null);
            str.getClass();
            str2.getClass();
            this.f14977b = str;
            this.f14978c = str2;
            this.f14979d = z14;
            this.f14980e = z15;
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00112\u00020\u0001:\u0002\u0012\u0013B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB%\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\u000bB9\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0007\u0010\u0010¨\u0006\u0014"}, d2 = {"Lb21/l4$w0;", "Lb21/l4;", "", "_dateTime", "logId", "Lb11/m;", "mealViewNavArgs", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lb11/m;)V", "Lb63/u;", "dateTime", "(Lb63/u;Ljava/lang/String;Lb11/m;)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lb11/m;Lm63/u1;)V", "Companion", "a", "b", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @i63.h
    public static final /* data */ class w0 extends l4 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f14983b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f14984c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final b11.m f14985d;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final Parcelable.Creator<w0> CREATOR = new c();

        @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/nutrition/presentation/navigation/NutritionRoute.QuickAddFood.$serializer", "Lm63/e0;", "Lb21/l4$w0;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        @o13.e
        public static final /* synthetic */ class a implements m63.e0<w0> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f14986a;
            private static final k63.e descriptor;

            static {
                a aVar = new a();
                f14986a = aVar;
                m63.m1 m1Var = new m63.m1("com.garmin.android.apps.connectmobile.nutrition.presentation.navigation.NutritionRoute.QuickAddFood", aVar, 3);
                m1Var.j("_dateTime", false);
                m1Var.j("logId", false);
                m1Var.j("mealViewNavArgs", false);
                descriptor = m1Var;
            }

            private a() {
            }

            @Override // m63.e0
            public final i63.c<?>[] childSerializers() {
                m63.y1 y1Var = m63.y1.f117048a;
                return new i63.c[]{y1Var, j63.a.d(y1Var), b11.m.a.f14340a};
            }

            @Override // i63.b
            public final Object deserialize(l63.e eVar) {
                eVar.getClass();
                k63.e eVar2 = descriptor;
                l63.c cVarC = eVar.c(eVar2);
                int i14 = l63.c.f110557a;
                boolean z14 = true;
                int i15 = 0;
                String strR = null;
                String str = null;
                b11.m mVar = null;
                while (z14) {
                    int iE = cVarC.e(eVar2);
                    if (iE == -1) {
                        z14 = false;
                    } else if (iE == 0) {
                        strR = cVarC.r(eVar2, 0);
                        i15 |= 1;
                    } else if (iE == 1) {
                        str = (String) cVarC.v(eVar2, 1, m63.y1.f117048a, str);
                        i15 |= 2;
                    } else {
                        if (iE != 2) {
                            hb.a.o(iE);
                            return null;
                        }
                        mVar = (b11.m) cVarC.l(eVar2, 2, b11.m.a.f14340a, mVar);
                        i15 |= 4;
                    }
                }
                cVarC.b(eVar2);
                return new w0(i15, strR, str, mVar, (m63.u1) null);
            }

            @Override // i63.i, i63.b
            /* JADX INFO: renamed from: getDescriptor */
            public final k63.e getF158591b() {
                return descriptor;
            }

            @Override // i63.i
            public final void serialize(l63.f fVar, Object obj) {
                w0 w0Var = (w0) obj;
                w0Var.getClass();
                k63.e eVar = descriptor;
                l63.d dVarC = fVar.c(eVar);
                dVarC.k(eVar, 0, w0Var.f14983b);
                dVarC.d(eVar, 1, m63.y1.f117048a, w0Var.f14984c);
                dVarC.e(eVar, 2, b11.m.a.f14340a, w0Var.f14985d);
                dVarC.b(eVar);
            }
        }

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class c implements Parcelable.Creator<w0> {
            @Override // android.os.Parcelable.Creator
            public final w0 createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new w0(parcel.readString(), parcel.readString(), b11.m.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final w0[] newArray(int i14) {
                return new w0[i14];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ w0(int i14, String str, String str2, b11.m mVar, m63.u1 u1Var) {
            super(i14, u1Var);
            if (7 != (i14 & 7)) {
                m63.k1.h(i14, 7, a.f14986a.getF158591b());
                throw null;
            }
            this.f14983b = str;
            this.f14984c = str2;
            this.f14985d = mVar;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof w0)) {
                return false;
            }
            w0 w0Var = (w0) obj;
            return p005kotlin.jvm.internal.s.g(this.f14983b, w0Var.f14983b) && p005kotlin.jvm.internal.s.g(this.f14984c, w0Var.f14984c) && p005kotlin.jvm.internal.s.g(this.f14985d, w0Var.f14985d);
        }

        public final int hashCode() {
            int iHashCode = this.f14983b.hashCode() * 31;
            String str = this.f14984c;
            return this.f14985d.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
        }

        public final String toString() {
            StringBuilder sbI = p6.b.i("QuickAddFood(_dateTime=", this.f14983b, ", logId=", this.f14984c, ", mealViewNavArgs=");
            sbI.append(this.f14985d);
            sbI.append(")");
            return sbI.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i14) {
            parcel.getClass();
            parcel.writeString(this.f14983b);
            parcel.writeString(this.f14984c);
            this.f14985d.writeToParcel(parcel, i14);
        }

        /* JADX INFO: renamed from: b21.l4$w0$b, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lb21/l4$w0$b;", "", "<init>", "()V", "Li63/c;", "Lb21/l4$w0;", "serializer", "()Li63/c;", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
                this();
            }

            public final i63.c<w0> serializer() {
                return a.f14986a;
            }

            private Companion() {
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public w0(String str, String str2, b11.m mVar) {
            super(null);
            str.getClass();
            mVar.getClass();
            this.f14983b = str;
            this.f14984c = str2;
            this.f14985d = mVar;
        }

        public /* synthetic */ w0(b63.u uVar, String str, b11.m mVar, int i14, p005kotlin.jvm.internal.j jVar) {
            this(uVar, (i14 & 2) != 0 ? null : str, mVar);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public w0(b63.u uVar, String str, b11.m mVar) {
            this(uVar.toString(), str, mVar);
            uVar.getClass();
            mVar.getClass();
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u000b2\u00020\u0001:\u0002\f\rB\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\n¨\u0006\u000e"}, d2 = {"Lb21/l4$x0;", "Lb21/l4;", "", "reminderKey", "<init>", "(Ljava/lang/String;)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILjava/lang/String;Lm63/u1;)V", "Companion", "a", "b", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @i63.h
    public static final /* data */ class x0 extends l4 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f14988b;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final Parcelable.Creator<x0> CREATOR = new c();

        @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/nutrition/presentation/navigation/NutritionRoute.Reminder.$serializer", "Lm63/e0;", "Lb21/l4$x0;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        @o13.e
        public static final /* synthetic */ class a implements m63.e0<x0> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f14989a;
            private static final k63.e descriptor;

            static {
                a aVar = new a();
                f14989a = aVar;
                m63.m1 m1Var = new m63.m1("com.garmin.android.apps.connectmobile.nutrition.presentation.navigation.NutritionRoute.Reminder", aVar, 1);
                m1Var.j("reminderKey", false);
                descriptor = m1Var;
            }

            private a() {
            }

            @Override // m63.e0
            public final i63.c<?>[] childSerializers() {
                return new i63.c[]{j63.a.d(m63.y1.f117048a)};
            }

            @Override // i63.b
            public final Object deserialize(l63.e eVar) {
                eVar.getClass();
                k63.e eVar2 = descriptor;
                l63.c cVarC = eVar.c(eVar2);
                int i14 = l63.c.f110557a;
                m63.u1 u1Var = null;
                boolean z14 = true;
                int i15 = 0;
                String str = null;
                while (z14) {
                    int iE = cVarC.e(eVar2);
                    if (iE == -1) {
                        z14 = false;
                    } else {
                        if (iE != 0) {
                            hb.a.o(iE);
                            return null;
                        }
                        str = (String) cVarC.v(eVar2, 0, m63.y1.f117048a, str);
                        i15 = 1;
                    }
                }
                cVarC.b(eVar2);
                return new x0(i15, str, u1Var);
            }

            @Override // i63.i, i63.b
            /* JADX INFO: renamed from: getDescriptor */
            public final k63.e getF158591b() {
                return descriptor;
            }

            @Override // i63.i
            public final void serialize(l63.f fVar, Object obj) {
                x0 x0Var = (x0) obj;
                x0Var.getClass();
                k63.e eVar = descriptor;
                l63.d dVarC = fVar.c(eVar);
                dVarC.d(eVar, 0, m63.y1.f117048a, x0Var.f14988b);
                dVarC.b(eVar);
            }
        }

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class c implements Parcelable.Creator<x0> {
            @Override // android.os.Parcelable.Creator
            public final x0 createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new x0(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final x0[] newArray(int i14) {
                return new x0[i14];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ x0(int i14, String str, m63.u1 u1Var) {
            super(i14, u1Var);
            if (1 != (i14 & 1)) {
                m63.k1.h(i14, 1, a.f14989a.getF158591b());
                throw null;
            }
            this.f14988b = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof x0) && p005kotlin.jvm.internal.s.g(this.f14988b, ((x0) obj).f14988b);
        }

        public final int hashCode() {
            String str = this.f14988b;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return am.j.m("Reminder(reminderKey=", this.f14988b, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i14) {
            parcel.getClass();
            parcel.writeString(this.f14988b);
        }

        /* JADX INFO: renamed from: b21.l4$x0$b, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lb21/l4$x0$b;", "", "<init>", "()V", "Li63/c;", "Lb21/l4$x0;", "serializer", "()Li63/c;", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
                this();
            }

            public final i63.c<x0> serializer() {
                return a.f14989a;
            }

            private Companion() {
            }
        }

        public x0(String str) {
            super(null);
            this.f14988b = str;
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00162\u00020\u0001:\u0002\u0017\u0018B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nB/\b\u0016\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\u0010BG\b\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\t\u0010\u0015¨\u0006\u0019"}, d2 = {"Lb21/l4$y;", "Lb21/l4;", "", "_action", "_date", "", "foodIds", "", "isTimelineView", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Z)V", "Li01/a;", "action", "Lb63/o;", "date", "loggedFoodIds", "(Li01/a;Lb63/o;Ljava/util/List;Z)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/util/List;ZLm63/u1;)V", "Companion", "a", "b", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @i63.h
    public static final /* data */ class y extends l4 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f14991b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f14992c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final List<String> f14993d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f14994e;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final Parcelable.Creator<y> CREATOR = new c();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final o13.l<i63.c<Object>>[] f14990f = {null, null, o13.m.a(o13.n.PUBLICATION, new m4(8)), null};

        @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/nutrition/presentation/navigation/NutritionRoute.MoveCopyFood.$serializer", "Lm63/e0;", "Lb21/l4$y;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        @o13.e
        public static final /* synthetic */ class a implements m63.e0<y> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f14995a;
            private static final k63.e descriptor;

            static {
                a aVar = new a();
                f14995a = aVar;
                m63.m1 m1Var = new m63.m1("com.garmin.android.apps.connectmobile.nutrition.presentation.navigation.NutritionRoute.MoveCopyFood", aVar, 4);
                m1Var.j("_action", false);
                m1Var.j("_date", false);
                m1Var.j("foodIds", false);
                m1Var.j("isTimelineView", false);
                descriptor = m1Var;
            }

            private a() {
            }

            @Override // m63.e0
            public final i63.c<?>[] childSerializers() {
                o13.l<i63.c<Object>>[] lVarArr = y.f14990f;
                m63.y1 y1Var = m63.y1.f117048a;
                return new i63.c[]{y1Var, y1Var, lVarArr[2].getValue(), m63.g.f116948a};
            }

            @Override // i63.b
            public final Object deserialize(l63.e eVar) {
                eVar.getClass();
                k63.e eVar2 = descriptor;
                l63.c cVarC = eVar.c(eVar2);
                o13.l<i63.c<Object>>[] lVarArr = y.f14990f;
                int i14 = l63.c.f110557a;
                boolean z14 = true;
                int i15 = 0;
                boolean zG = false;
                String strR = null;
                String strR2 = null;
                List list = null;
                while (z14) {
                    int iE = cVarC.e(eVar2);
                    if (iE == -1) {
                        z14 = false;
                    } else if (iE == 0) {
                        strR = cVarC.r(eVar2, 0);
                        i15 |= 1;
                    } else if (iE == 1) {
                        strR2 = cVarC.r(eVar2, 1);
                        i15 |= 2;
                    } else if (iE == 2) {
                        list = (List) cVarC.l(eVar2, 2, lVarArr[2].getValue(), list);
                        i15 |= 4;
                    } else {
                        if (iE != 3) {
                            hb.a.o(iE);
                            return null;
                        }
                        zG = cVarC.g(eVar2, 3);
                        i15 |= 8;
                    }
                }
                cVarC.b(eVar2);
                return new y(i15, strR, strR2, list, zG, null);
            }

            @Override // i63.i, i63.b
            /* JADX INFO: renamed from: getDescriptor */
            public final k63.e getF158591b() {
                return descriptor;
            }

            @Override // i63.i
            public final void serialize(l63.f fVar, Object obj) {
                y yVar = (y) obj;
                yVar.getClass();
                k63.e eVar = descriptor;
                l63.d dVarC = fVar.c(eVar);
                o13.l<i63.c<Object>>[] lVarArr = y.f14990f;
                dVarC.k(eVar, 0, yVar.f14991b);
                dVarC.k(eVar, 1, yVar.f14992c);
                dVarC.e(eVar, 2, lVarArr[2].getValue(), yVar.f14993d);
                dVarC.n(eVar, 3, yVar.f14994e);
                dVarC.b(eVar);
            }
        }

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class c implements Parcelable.Creator<y> {
            @Override // android.os.Parcelable.Creator
            public final y createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new y(parcel.readString(), parcel.readString(), parcel.createStringArrayList(), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final y[] newArray(int i14) {
                return new y[i14];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ y(int i14, String str, String str2, List list, boolean z14, m63.u1 u1Var) {
            super(i14, u1Var);
            if (15 != (i14 & 15)) {
                m63.k1.h(i14, 15, a.f14995a.getF158591b());
                throw null;
            }
            this.f14991b = str;
            this.f14992c = str2;
            this.f14993d = list;
            this.f14994e = z14;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof y)) {
                return false;
            }
            y yVar = (y) obj;
            return p005kotlin.jvm.internal.s.g(this.f14991b, yVar.f14991b) && p005kotlin.jvm.internal.s.g(this.f14992c, yVar.f14992c) && p005kotlin.jvm.internal.s.g(this.f14993d, yVar.f14993d) && this.f14994e == yVar.f14994e;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f14994e) + lc.u0.b(wr.g.j(this.f14991b.hashCode() * 31, 31, this.f14992c), 31, this.f14993d);
        }

        public final String toString() {
            StringBuilder sbI = p6.b.i("MoveCopyFood(_action=", this.f14991b, ", _date=", this.f14992c, ", foodIds=");
            sbI.append(this.f14993d);
            sbI.append(", isTimelineView=");
            sbI.append(this.f14994e);
            sbI.append(")");
            return sbI.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i14) {
            parcel.getClass();
            parcel.writeString(this.f14991b);
            parcel.writeString(this.f14992c);
            parcel.writeStringList(this.f14993d);
            parcel.writeInt(this.f14994e ? 1 : 0);
        }

        /* JADX INFO: renamed from: b21.l4$y$b, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lb21/l4$y$b;", "", "<init>", "()V", "Li63/c;", "Lb21/l4$y;", "serializer", "()Li63/c;", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
                this();
            }

            public final i63.c<y> serializer() {
                return a.f14995a;
            }

            private Companion() {
            }
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public y(i01.a aVar, b63.o oVar, List<String> list, boolean z14) {
            this(aVar.f86723a, oVar.toString(), list, z14);
            aVar.getClass();
            oVar.getClass();
            list.getClass();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public y(String str, String str2, List<String> list, boolean z14) {
            super(null);
            str.getClass();
            str2.getClass();
            list.getClass();
            this.f14991b = str;
            this.f14992c = str2;
            this.f14993d = list;
            this.f14994e = z14;
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00132\u00020\u0001:\u0002\u0014\u0015B-\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tB/\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eBC\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\b\u0010\u0012¨\u0006\u0016"}, d2 = {"Lb21/l4$z;", "Lb21/l4;", "", "activeCaloriesGoal", "customActiveCalories", "", "_selectedOption", "_activityMultiplierType", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V", "Ls21/a;", "selectedOption", "Ll01/a;", "activityMultiplierType", "(Ljava/lang/Integer;Ljava/lang/Integer;Ls21/a;Ll01/a;)V", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lm63/u1;)V", "Companion", "a", "b", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @i63.h
    public static final /* data */ class z extends l4 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Integer f14997b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Integer f14998c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f14999d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final String f15000e;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final Parcelable.Creator<z> CREATOR = new c();

        @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/nutrition/presentation/navigation/NutritionRoute.NutritionActivityLevel.$serializer", "Lm63/e0;", "Lb21/l4$z;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        @o13.e
        public static final /* synthetic */ class a implements m63.e0<z> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f15001a;
            private static final k63.e descriptor;

            static {
                a aVar = new a();
                f15001a = aVar;
                m63.m1 m1Var = new m63.m1("com.garmin.android.apps.connectmobile.nutrition.presentation.navigation.NutritionRoute.NutritionActivityLevel", aVar, 4);
                m1Var.j("activeCaloriesGoal", false);
                m1Var.j("customActiveCalories", false);
                m1Var.j("_selectedOption", false);
                m1Var.j("_activityMultiplierType", false);
                descriptor = m1Var;
            }

            private a() {
            }

            @Override // m63.e0
            public final i63.c<?>[] childSerializers() {
                m63.m0 m0Var = m63.m0.f116981a;
                i63.c<?> cVarD = j63.a.d(m0Var);
                i63.c<?> cVarD2 = j63.a.d(m0Var);
                m63.y1 y1Var = m63.y1.f117048a;
                return new i63.c[]{cVarD, cVarD2, y1Var, j63.a.d(y1Var)};
            }

            @Override // i63.b
            public final Object deserialize(l63.e eVar) {
                eVar.getClass();
                k63.e eVar2 = descriptor;
                l63.c cVarC = eVar.c(eVar2);
                int i14 = l63.c.f110557a;
                boolean z14 = true;
                int i15 = 0;
                Integer num = null;
                Integer num2 = null;
                String strR = null;
                String str = null;
                while (z14) {
                    int iE = cVarC.e(eVar2);
                    if (iE == -1) {
                        z14 = false;
                    } else if (iE == 0) {
                        num = (Integer) cVarC.v(eVar2, 0, m63.m0.f116981a, num);
                        i15 |= 1;
                    } else if (iE == 1) {
                        num2 = (Integer) cVarC.v(eVar2, 1, m63.m0.f116981a, num2);
                        i15 |= 2;
                    } else if (iE == 2) {
                        strR = cVarC.r(eVar2, 2);
                        i15 |= 4;
                    } else {
                        if (iE != 3) {
                            hb.a.o(iE);
                            return null;
                        }
                        str = (String) cVarC.v(eVar2, 3, m63.y1.f117048a, str);
                        i15 |= 8;
                    }
                }
                cVarC.b(eVar2);
                return new z(i15, num, num2, strR, str, null);
            }

            @Override // i63.i, i63.b
            /* JADX INFO: renamed from: getDescriptor */
            public final k63.e getF158591b() {
                return descriptor;
            }

            @Override // i63.i
            public final void serialize(l63.f fVar, Object obj) {
                z zVar = (z) obj;
                zVar.getClass();
                k63.e eVar = descriptor;
                l63.d dVarC = fVar.c(eVar);
                m63.m0 m0Var = m63.m0.f116981a;
                dVarC.d(eVar, 0, m0Var, zVar.f14997b);
                dVarC.d(eVar, 1, m0Var, zVar.f14998c);
                dVarC.k(eVar, 2, zVar.f14999d);
                dVarC.d(eVar, 3, m63.y1.f117048a, zVar.f15000e);
                dVarC.b(eVar);
            }
        }

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class c implements Parcelable.Creator<z> {
            @Override // android.os.Parcelable.Creator
            public final z createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new z(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final z[] newArray(int i14) {
                return new z[i14];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ z(int i14, Integer num, Integer num2, String str, String str2, m63.u1 u1Var) {
            super(i14, u1Var);
            if (15 != (i14 & 15)) {
                m63.k1.h(i14, 15, a.f15001a.getF158591b());
                throw null;
            }
            this.f14997b = num;
            this.f14998c = num2;
            this.f14999d = str;
            this.f15000e = str2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof z)) {
                return false;
            }
            z zVar = (z) obj;
            return p005kotlin.jvm.internal.s.g(this.f14997b, zVar.f14997b) && p005kotlin.jvm.internal.s.g(this.f14998c, zVar.f14998c) && p005kotlin.jvm.internal.s.g(this.f14999d, zVar.f14999d) && p005kotlin.jvm.internal.s.g(this.f15000e, zVar.f15000e);
        }

        public final int hashCode() {
            Integer num = this.f14997b;
            int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
            Integer num2 = this.f14998c;
            int iJ = wr.g.j((iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31, 31, this.f14999d);
            String str = this.f15000e;
            return iJ + (str != null ? str.hashCode() : 0);
        }

        public final String toString() {
            return i3.e5.h(com.airbnb.lottie.animation.keyframe.a.l(this.f14997b, "NutritionActivityLevel(activeCaloriesGoal=", ", customActiveCalories=", ", _selectedOption=", this.f14998c), this.f14999d, ", _activityMultiplierType=", this.f15000e, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i14) {
            parcel.getClass();
            Integer num = this.f14997b;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                kg.f.k(parcel, 1, num);
            }
            Integer num2 = this.f14998c;
            if (num2 == null) {
                parcel.writeInt(0);
            } else {
                kg.f.k(parcel, 1, num2);
            }
            parcel.writeString(this.f14999d);
            parcel.writeString(this.f15000e);
        }

        /* JADX INFO: renamed from: b21.l4$z$b, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lb21/l4$z$b;", "", "<init>", "()V", "Li63/c;", "Lb21/l4$z;", "serializer", "()Li63/c;", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
                this();
            }

            public final i63.c<z> serializer() {
                return a.f15001a;
            }

            private Companion() {
            }
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public z(Integer num, Integer num2, s21.a aVar, l01.a aVar2) {
            this(num, num2, aVar.f156035a, aVar2 != null ? aVar2.f107836a : null);
            aVar.getClass();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public z(Integer num, Integer num2, String str, String str2) {
            super(null);
            str.getClass();
            this.f14997b = num;
            this.f14998c = num2;
            this.f14999d = str;
            this.f15000e = str2;
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00172\u00020\u0001:\u0002\u0018\u0019B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fB?\b\u0016\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\u0011BU\b\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u000b\u0010\u0016¨\u0006\u001a"}, d2 = {"Lb21/l4$z0;", "Lb21/l4;", "", "_mode", "_dateTime", "regionCode", RemoteConfigConstants.RequestFieldKey.LANGUAGE_CODE, "", "addToPhotoResult", "Lb11/m;", "mealViewNavArgs", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLb11/m;)V", "Lb21/o4;", "mode", "Lb63/u;", "dateTime", "(Lb21/o4;Lb63/u;Ljava/lang/String;Ljava/lang/String;Lb11/m;Z)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLb11/m;Lm63/u1;)V", "Companion", "a", "b", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @i63.h
    public static final /* data */ class z0 extends l4 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f15002b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f15003c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f15004d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final String f15005e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final boolean f15006f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final b11.m f15007g;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final Parcelable.Creator<z0> CREATOR = new c();

        @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/nutrition/presentation/navigation/NutritionRoute.VoiceDictation.$serializer", "Lm63/e0;", "Lb21/l4$z0;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        @o13.e
        public static final /* synthetic */ class a implements m63.e0<z0> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f15008a;
            private static final k63.e descriptor;

            static {
                a aVar = new a();
                f15008a = aVar;
                m63.m1 m1Var = new m63.m1("com.garmin.android.apps.connectmobile.nutrition.presentation.navigation.NutritionRoute.VoiceDictation", aVar, 6);
                m1Var.j("_mode", false);
                m1Var.j("_dateTime", false);
                m1Var.j("regionCode", false);
                m1Var.j(RemoteConfigConstants.RequestFieldKey.LANGUAGE_CODE, false);
                m1Var.j("addToPhotoResult", true);
                m1Var.j("mealViewNavArgs", false);
                descriptor = m1Var;
            }

            private a() {
            }

            @Override // m63.e0
            public final i63.c<?>[] childSerializers() {
                m63.y1 y1Var = m63.y1.f117048a;
                return new i63.c[]{y1Var, y1Var, j63.a.d(y1Var), j63.a.d(y1Var), m63.g.f116948a, b11.m.a.f14340a};
            }

            @Override // i63.b
            public final Object deserialize(l63.e eVar) {
                eVar.getClass();
                k63.e eVar2 = descriptor;
                l63.c cVarC = eVar.c(eVar2);
                int i14 = l63.c.f110557a;
                boolean z14 = true;
                int i15 = 0;
                boolean zG = false;
                String strR = null;
                String strR2 = null;
                String str = null;
                String str2 = null;
                b11.m mVar = null;
                while (z14) {
                    int iE = cVarC.e(eVar2);
                    switch (iE) {
                        case -1:
                            z14 = false;
                            break;
                        case 0:
                            strR = cVarC.r(eVar2, 0);
                            i15 |= 1;
                            break;
                        case 1:
                            strR2 = cVarC.r(eVar2, 1);
                            i15 |= 2;
                            break;
                        case 2:
                            str = (String) cVarC.v(eVar2, 2, m63.y1.f117048a, str);
                            i15 |= 4;
                            break;
                        case 3:
                            str2 = (String) cVarC.v(eVar2, 3, m63.y1.f117048a, str2);
                            i15 |= 8;
                            break;
                        case 4:
                            zG = cVarC.g(eVar2, 4);
                            i15 |= 16;
                            break;
                        case 5:
                            mVar = (b11.m) cVarC.l(eVar2, 5, b11.m.a.f14340a, mVar);
                            i15 |= 32;
                            break;
                        default:
                            hb.a.o(iE);
                            return null;
                    }
                }
                cVarC.b(eVar2);
                return new z0(i15, strR, strR2, str, str2, zG, mVar, (m63.u1) null);
            }

            @Override // i63.i, i63.b
            /* JADX INFO: renamed from: getDescriptor */
            public final k63.e getF158591b() {
                return descriptor;
            }

            @Override // i63.i
            public final void serialize(l63.f fVar, Object obj) {
                z0 z0Var = (z0) obj;
                z0Var.getClass();
                k63.e eVar = descriptor;
                l63.d dVarC = fVar.c(eVar);
                String str = z0Var.f15002b;
                boolean z14 = z0Var.f15006f;
                dVarC.k(eVar, 0, str);
                dVarC.k(eVar, 1, z0Var.f15003c);
                m63.y1 y1Var = m63.y1.f117048a;
                dVarC.d(eVar, 2, y1Var, z0Var.f15004d);
                dVarC.d(eVar, 3, y1Var, z0Var.f15005e);
                if (dVarC.C(eVar) || z14) {
                    dVarC.n(eVar, 4, z14);
                }
                dVarC.e(eVar, 5, b11.m.a.f14340a, z0Var.f15007g);
                dVarC.b(eVar);
            }
        }

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class c implements Parcelable.Creator<z0> {
            @Override // android.os.Parcelable.Creator
            public final z0 createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new z0(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, b11.m.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final z0[] newArray(int i14) {
                return new z0[i14];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ z0(int i14, String str, String str2, String str3, String str4, boolean z14, b11.m mVar, m63.u1 u1Var) {
            super(i14, u1Var);
            if (47 != (i14 & 47)) {
                m63.k1.h(i14, 47, a.f15008a.getF158591b());
                throw null;
            }
            this.f15002b = str;
            this.f15003c = str2;
            this.f15004d = str3;
            this.f15005e = str4;
            if ((i14 & 16) == 0) {
                this.f15006f = false;
            } else {
                this.f15006f = z14;
            }
            this.f15007g = mVar;
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
            return p005kotlin.jvm.internal.s.g(this.f15002b, z0Var.f15002b) && p005kotlin.jvm.internal.s.g(this.f15003c, z0Var.f15003c) && p005kotlin.jvm.internal.s.g(this.f15004d, z0Var.f15004d) && p005kotlin.jvm.internal.s.g(this.f15005e, z0Var.f15005e) && this.f15006f == z0Var.f15006f && p005kotlin.jvm.internal.s.g(this.f15007g, z0Var.f15007g);
        }

        public final int hashCode() {
            int iJ = wr.g.j(this.f15002b.hashCode() * 31, 31, this.f15003c);
            String str = this.f15004d;
            int iHashCode = (iJ + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f15005e;
            return this.f15007g.hashCode() + q6.f.g((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.f15006f);
        }

        public final String toString() {
            StringBuilder sbI = p6.b.i("VoiceDictation(_mode=", this.f15002b, ", _dateTime=", this.f15003c, ", regionCode=");
            sn.a.t(sbI, this.f15004d, ", languageCode=", this.f15005e, ", addToPhotoResult=");
            sbI.append(this.f15006f);
            sbI.append(", mealViewNavArgs=");
            sbI.append(this.f15007g);
            sbI.append(")");
            return sbI.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i14) {
            parcel.getClass();
            parcel.writeString(this.f15002b);
            parcel.writeString(this.f15003c);
            parcel.writeString(this.f15004d);
            parcel.writeString(this.f15005e);
            parcel.writeInt(this.f15006f ? 1 : 0);
            this.f15007g.writeToParcel(parcel, i14);
        }

        /* JADX INFO: renamed from: b21.l4$z0$b, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lb21/l4$z0$b;", "", "<init>", "()V", "Li63/c;", "Lb21/l4$z0;", "serializer", "()Li63/c;", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
                this();
            }

            public final i63.c<z0> serializer() {
                return a.f15008a;
            }

            private Companion() {
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public z0(String str, String str2, String str3, String str4, boolean z14, b11.m mVar) {
            super(null);
            str.getClass();
            str2.getClass();
            mVar.getClass();
            this.f15002b = str;
            this.f15003c = str2;
            this.f15004d = str3;
            this.f15005e = str4;
            this.f15006f = z14;
            this.f15007g = mVar;
        }

        public /* synthetic */ z0(String str, String str2, String str3, String str4, boolean z14, b11.m mVar, int i14, p005kotlin.jvm.internal.j jVar) {
            this(str, str2, str3, str4, (i14 & 16) != 0 ? false : z14, mVar);
        }

        public /* synthetic */ z0(o4 o4Var, b63.u uVar, String str, String str2, b11.m mVar, boolean z14, int i14, p005kotlin.jvm.internal.j jVar) {
            this(o4Var, uVar, str, str2, mVar, (i14 & 32) != 0 ? false : z14);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public z0(o4 o4Var, b63.u uVar, String str, String str2, b11.m mVar, boolean z14) {
            this(o4Var.name(), uVar.toString(), str, str2, z14, mVar);
            o4Var.getClass();
            uVar.getClass();
            mVar.getClass();
        }
    }

    /* JADX INFO: renamed from: b21.l4$d, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lb21/l4$d;", "", "<init>", "()V", "Li63/c;", "Lb21/l4;", "serializer", "()Li63/c;", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
        public final i63.c<l4> serializer() {
            return (i63.c) l4.f14829a.getValue();
        }

        private Companion() {
        }
    }

    private l4() {
    }

    public /* synthetic */ l4(int i14, m63.u1 u1Var) {
    }
}

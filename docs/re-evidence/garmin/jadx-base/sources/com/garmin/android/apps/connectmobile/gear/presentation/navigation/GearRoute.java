package com.garmin.android.apps.connectmobile.gear.presentation.navigation;

import am.x0;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import c80.u;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.mapbox.maps.plugin.locationcomponent.ModelSourceWrapper;
import com.nimbusds.jose.jwk.JWKParameterNames;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k63.e;
import lc.u0;
import m63.e0;
import m63.f1;
import m63.k1;
import m63.m1;
import m63.u1;
import m63.v0;
import m63.y1;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.t0;
import rk0.f0;
import rk0.w0;
import sk0.l0;
import y22.w;

/* JADX INFO: loaded from: classes8.dex */
@Keep
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00112\u00020\u0001:\u0013\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003B\u001b\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0002\u0010\bJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u0082\u0001\u0012%&'()*+,-./0123456¨\u00067"}, d2 = {"Lcom/garmin/android/apps/connectmobile/gear/presentation/navigation/GearRoute;", "Landroid/os/Parcelable;", "<init>", "()V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILm63/u1;)V", "self", "Ll63/d;", "output", "Lk63/e;", "serialDesc", "", "write$Self", "(Lcom/garmin/android/apps/connectmobile/gear/presentation/navigation/GearRoute;Ll63/d;Lk63/e;)V", "Companion", "j", IntegerTokenConverter.CONVERTER_KEY, "d", "b", JWKParameterNames.RSA_OTHER_PRIMES__PRIME_FACTOR, "a", JWKParameterNames.OCT_KEY_VALUE, "l", "o", "p", JWKParameterNames.RSA_SECOND_PRIME_FACTOR, "c", "h", "f", "g", "s", JWKParameterNames.RSA_MODULUS, "m", JWKParameterNames.RSA_EXPONENT, "Lcom/garmin/android/apps/connectmobile/gear/presentation/navigation/GearRoute$a;", "Lcom/garmin/android/apps/connectmobile/gear/presentation/navigation/GearRoute$b;", "Lcom/garmin/android/apps/connectmobile/gear/presentation/navigation/GearRoute$c;", "Lcom/garmin/android/apps/connectmobile/gear/presentation/navigation/GearRoute$d;", "Lcom/garmin/android/apps/connectmobile/gear/presentation/navigation/GearRoute$f;", "Lcom/garmin/android/apps/connectmobile/gear/presentation/navigation/GearRoute$g;", "Lcom/garmin/android/apps/connectmobile/gear/presentation/navigation/GearRoute$h;", "Lcom/garmin/android/apps/connectmobile/gear/presentation/navigation/GearRoute$i;", "Lcom/garmin/android/apps/connectmobile/gear/presentation/navigation/GearRoute$j;", "Lcom/garmin/android/apps/connectmobile/gear/presentation/navigation/GearRoute$k;", "Lcom/garmin/android/apps/connectmobile/gear/presentation/navigation/GearRoute$l;", "Lcom/garmin/android/apps/connectmobile/gear/presentation/navigation/GearRoute$m;", "Lcom/garmin/android/apps/connectmobile/gear/presentation/navigation/GearRoute$n;", "Lcom/garmin/android/apps/connectmobile/gear/presentation/navigation/GearRoute$o;", "Lcom/garmin/android/apps/connectmobile/gear/presentation/navigation/GearRoute$p;", "Lcom/garmin/android/apps/connectmobile/gear/presentation/navigation/GearRoute$q;", "Lcom/garmin/android/apps/connectmobile/gear/presentation/navigation/GearRoute$r;", "Lcom/garmin/android/apps/connectmobile/gear/presentation/navigation/GearRoute$s;", "gcm-gear_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@i63.h
public abstract class GearRoute implements Parcelable {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final o13.l<i63.c<Object>> $cachedSerializer$delegate = o13.m.a(o13.n.PUBLICATION, new ta0.g(26));

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/gear/presentation/navigation/GearRoute$a;", "Lcom/garmin/android/apps/connectmobile/gear/presentation/navigation/GearRoute;", "<init>", "()V", "Li63/c;", "serializer", "()Li63/c;", "gcm-gear_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @i63.h
    public static final /* data */ class a extends GearRoute {
        public static final a INSTANCE = new a();
        public static final Parcelable.Creator<a> CREATOR = new C0617a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Object f35622a = o13.m.a(o13.n.PUBLICATION, new ta0.g(27));

        /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.gear.presentation.navigation.GearRoute$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class C0617a implements Parcelable.Creator<a> {
            @Override // android.os.Parcelable.Creator
            public final a createFromParcel(Parcel parcel) {
                parcel.getClass();
                parcel.readInt();
                return a.INSTANCE;
            }

            @Override // android.os.Parcelable.Creator
            public final a[] newArray(int i14) {
                return new a[i14];
            }
        }

        private a() {
            super(null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 767747262;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
        public final i63.c<a> serializer() {
            return (i63.c) f35622a.getValue();
        }

        public final String toString() {
            return "AddCollection";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i14) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/gear/presentation/navigation/GearRoute$j;", "Lcom/garmin/android/apps/connectmobile/gear/presentation/navigation/GearRoute;", "<init>", "()V", "Li63/c;", "serializer", "()Li63/c;", "gcm-gear_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @i63.h
    public static final /* data */ class j extends GearRoute {
        public static final j INSTANCE = new j();
        public static final Parcelable.Creator<j> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Object f35647a = o13.m.a(o13.n.PUBLICATION, new tk0.a(1));

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<j> {
            @Override // android.os.Parcelable.Creator
            public final j createFromParcel(Parcel parcel) {
                parcel.getClass();
                parcel.readInt();
                return j.INSTANCE;
            }

            @Override // android.os.Parcelable.Creator
            public final j[] newArray(int i14) {
                return new j[i14];
            }
        }

        private j() {
            super(null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof j);
        }

        public final int hashCode() {
            return 26067150;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
        public final i63.c<j> serializer() {
            return (i63.c) f35647a.getValue();
        }

        public final String toString() {
            return "GearList";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i14) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    public /* synthetic */ GearRoute(p005kotlin.jvm.internal.j jVar) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i63.c _init_$_anonymous_() {
        t0 t0Var = s0.f105811a;
        return new i63.g("com.garmin.android.apps.connectmobile.gear.presentation.navigation.GearRoute", t0Var.b(GearRoute.class), new k23.d[]{t0Var.b(a.class), t0Var.b(b.class), t0Var.b(c.class), t0Var.b(d.class), t0Var.b(f.class), t0Var.b(g.class), t0Var.b(h.class), t0Var.b(i.class), t0Var.b(j.class), t0Var.b(k.class), t0Var.b(l.class), t0Var.b(m.class), t0Var.b(n.class), t0Var.b(o.class), t0Var.b(p.class), t0Var.b(q.class), t0Var.b(r.class), t0Var.b(s.class)}, new i63.c[]{new f1("com.garmin.android.apps.connectmobile.gear.presentation.navigation.GearRoute.AddCollection", a.INSTANCE, new Annotation[0]), b.a.f35626a, c.a.f35633a, d.a.f35635a, f.a.f35637a, g.a.f35641a, h.a.f35643a, i.a.f35646a, new f1("com.garmin.android.apps.connectmobile.gear.presentation.navigation.GearRoute.GearList", j.INSTANCE, new Annotation[0]), k.a.f35653a, l.a.f35656a, m.a.f35660a, n.a.f35664a, o.a.f35668a, p.a.f35674a, q.a.f35680a, r.a.f35682a, s.a.f35685a}, new Annotation[0]);
    }

    public static final /* synthetic */ void write$Self(GearRoute self, l63.d output, e serialDesc) {
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \r2\u00020\u0001:\u0002\u000e\u000fB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B-\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/garmin/android/apps/connectmobile/gear/presentation/navigation/GearRoute$b;", "Lcom/garmin/android/apps/connectmobile/gear/presentation/navigation/GearRoute;", "", "goToDetails", "Lc80/u;", "defaultGearType", "<init>", "(ZLc80/u;)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(IZLc80/u;Lm63/u1;)V", "Companion", "a", "b", "gcm-gear_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @i63.h
    public static final /* data */ class b extends GearRoute {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f35624a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final u f35625b;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final Parcelable.Creator<b> CREATOR = new c();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final o13.l<i63.c<Object>>[] f35623c = {null, o13.m.a(o13.n.PUBLICATION, new ta0.g(28))};

        @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/gear/presentation/navigation/GearRoute.AddGear.$serializer", "Lm63/e0;", "Lcom/garmin/android/apps/connectmobile/gear/presentation/navigation/GearRoute$b;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-gear_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        @o13.e
        public static final /* synthetic */ class a implements e0<b> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f35626a;
            private static final e descriptor;

            static {
                a aVar = new a();
                f35626a = aVar;
                m1 m1Var = new m1("com.garmin.android.apps.connectmobile.gear.presentation.navigation.GearRoute.AddGear", aVar, 2);
                m1Var.j("goToDetails", false);
                m1Var.j("defaultGearType", false);
                descriptor = m1Var;
            }

            private a() {
            }

            @Override // m63.e0
            public final i63.c<?>[] childSerializers() {
                return new i63.c[]{m63.g.f116948a, b.f35623c[1].getValue()};
            }

            @Override // i63.b
            public final Object deserialize(l63.e eVar) {
                eVar.getClass();
                e eVar2 = descriptor;
                l63.c cVarC = eVar.c(eVar2);
                o13.l<i63.c<Object>>[] lVarArr = b.f35623c;
                int i14 = l63.c.f110557a;
                u1 u1Var = null;
                boolean z14 = true;
                int i15 = 0;
                boolean zG = false;
                u uVar = null;
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
                        uVar = (u) cVarC.l(eVar2, 1, lVarArr[1].getValue(), uVar);
                        i15 |= 2;
                    }
                }
                cVarC.b(eVar2);
                return new b(i15, zG, uVar, u1Var);
            }

            @Override // i63.i, i63.b
            /* JADX INFO: renamed from: getDescriptor */
            public final e getF158591b() {
                return descriptor;
            }

            @Override // i63.i
            public final void serialize(l63.f fVar, Object obj) {
                b bVar = (b) obj;
                bVar.getClass();
                e eVar = descriptor;
                l63.d dVarC = fVar.c(eVar);
                GearRoute.write$Self(bVar, dVarC, eVar);
                o13.l<i63.c<Object>>[] lVarArr = b.f35623c;
                dVarC.n(eVar, 0, bVar.f35624a);
                dVarC.e(eVar, 1, lVarArr[1].getValue(), bVar.f35625b);
                dVarC.b(eVar);
            }
        }

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class c implements Parcelable.Creator<b> {
            @Override // android.os.Parcelable.Creator
            public final b createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new b(parcel.readInt() != 0, u.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final b[] newArray(int i14) {
                return new b[i14];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ b(int i14, boolean z14, u uVar, u1 u1Var) {
            super(i14, u1Var);
            if (3 != (i14 & 3)) {
                k1.h(i14, 3, a.f35626a.getF158591b());
                throw null;
            }
            this.f35624a = z14;
            this.f35625b = uVar;
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
            return this.f35624a == bVar.f35624a && this.f35625b == bVar.f35625b;
        }

        public final int hashCode() {
            return this.f35625b.hashCode() + (Boolean.hashCode(this.f35624a) * 31);
        }

        public final String toString() {
            return "AddGear(goToDetails=" + this.f35624a + ", defaultGearType=" + this.f35625b + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i14) {
            parcel.getClass();
            parcel.writeInt(this.f35624a ? 1 : 0);
            parcel.writeString(this.f35625b.name());
        }

        /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.gear.presentation.navigation.GearRoute$b$b, reason: collision with other inner class name and from kotlin metadata */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/gear/presentation/navigation/GearRoute$b$b;", "", "<init>", "()V", "Li63/c;", "Lcom/garmin/android/apps/connectmobile/gear/presentation/navigation/GearRoute$b;", "serializer", "()Li63/c;", "gcm-gear_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
                this();
            }

            public final i63.c<b> serializer() {
                return a.f35626a;
            }

            private Companion() {
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(boolean z14, u uVar) {
            super(null);
            uVar.getClass();
            this.f35624a = z14;
            this.f35625b = uVar;
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00112\u00020\u0001:\u0002\u0012\u0013B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bBI\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010¨\u0006\u0014"}, d2 = {"Lcom/garmin/android/apps/connectmobile/gear/presentation/navigation/GearRoute$c;", "Lcom/garmin/android/apps/connectmobile/gear/presentation/navigation/GearRoute;", "Lc80/u;", "gearType", "", "initialBrand", "initialModel", "", "enterOtherBrand", "enterOtherModel", "<init>", "(Lc80/u;Ljava/lang/String;Ljava/lang/String;ZZ)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILc80/u;Ljava/lang/String;Ljava/lang/String;ZZLm63/u1;)V", "Companion", "a", "b", "gcm-gear_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @i63.h
    public static final /* data */ class c extends GearRoute {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final u f35628a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f35629b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f35630c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f35631d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f35632e;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final Parcelable.Creator<c> CREATOR = new C0619c();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final o13.l<i63.c<Object>>[] f35627f = {o13.m.a(o13.n.PUBLICATION, new ta0.g(29)), null, null, null, null};

        @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/gear/presentation/navigation/GearRoute.BrandModelManualEntry.$serializer", "Lm63/e0;", "Lcom/garmin/android/apps/connectmobile/gear/presentation/navigation/GearRoute$c;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-gear_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        @o13.e
        public static final /* synthetic */ class a implements e0<c> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f35633a;
            private static final e descriptor;

            static {
                a aVar = new a();
                f35633a = aVar;
                m1 m1Var = new m1("com.garmin.android.apps.connectmobile.gear.presentation.navigation.GearRoute.BrandModelManualEntry", aVar, 5);
                m1Var.j("gearType", false);
                m1Var.j("initialBrand", false);
                m1Var.j("initialModel", false);
                m1Var.j("enterOtherBrand", true);
                m1Var.j("enterOtherModel", true);
                descriptor = m1Var;
            }

            private a() {
            }

            @Override // m63.e0
            public final i63.c<?>[] childSerializers() {
                y1 y1Var = y1.f117048a;
                m63.g gVar = m63.g.f116948a;
                return new i63.c[]{c.f35627f[0].getValue(), j63.a.d(y1Var), j63.a.d(y1Var), gVar, gVar};
            }

            @Override // i63.b
            public final Object deserialize(l63.e eVar) {
                eVar.getClass();
                e eVar2 = descriptor;
                l63.c cVarC = eVar.c(eVar2);
                o13.l<i63.c<Object>>[] lVarArr = c.f35627f;
                int i14 = l63.c.f110557a;
                boolean z14 = true;
                int i15 = 0;
                boolean zG = false;
                boolean zG2 = false;
                u uVar = null;
                String str = null;
                String str2 = null;
                while (z14) {
                    int iE = cVarC.e(eVar2);
                    if (iE == -1) {
                        z14 = false;
                    } else if (iE == 0) {
                        uVar = (u) cVarC.l(eVar2, 0, lVarArr[0].getValue(), uVar);
                        i15 |= 1;
                    } else if (iE == 1) {
                        str = (String) cVarC.v(eVar2, 1, y1.f117048a, str);
                        i15 |= 2;
                    } else if (iE == 2) {
                        str2 = (String) cVarC.v(eVar2, 2, y1.f117048a, str2);
                        i15 |= 4;
                    } else if (iE == 3) {
                        zG = cVarC.g(eVar2, 3);
                        i15 |= 8;
                    } else {
                        if (iE != 4) {
                            hb.a.o(iE);
                            return null;
                        }
                        zG2 = cVarC.g(eVar2, 4);
                        i15 |= 16;
                    }
                }
                cVarC.b(eVar2);
                return new c(i15, uVar, str, str2, zG, zG2, (u1) null);
            }

            @Override // i63.i, i63.b
            /* JADX INFO: renamed from: getDescriptor */
            public final e getF158591b() {
                return descriptor;
            }

            @Override // i63.i
            public final void serialize(l63.f fVar, Object obj) {
                c cVar = (c) obj;
                cVar.getClass();
                e eVar = descriptor;
                l63.d dVarC = fVar.c(eVar);
                GearRoute.write$Self(cVar, dVarC, eVar);
                i63.c<Object> value = c.f35627f[0].getValue();
                u uVar = cVar.f35628a;
                boolean z14 = cVar.f35632e;
                boolean z15 = cVar.f35631d;
                dVarC.e(eVar, 0, value, uVar);
                y1 y1Var = y1.f117048a;
                dVarC.d(eVar, 1, y1Var, cVar.f35629b);
                dVarC.d(eVar, 2, y1Var, cVar.f35630c);
                if (dVarC.C(eVar) || z15) {
                    dVarC.n(eVar, 3, z15);
                }
                if (dVarC.C(eVar) || z14) {
                    dVarC.n(eVar, 4, z14);
                }
                dVarC.b(eVar);
            }
        }

        /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.gear.presentation.navigation.GearRoute$c$c, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class C0619c implements Parcelable.Creator<c> {
            @Override // android.os.Parcelable.Creator
            public final c createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new c(u.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final c[] newArray(int i14) {
                return new c[i14];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ c(int i14, u uVar, String str, String str2, boolean z14, boolean z15, u1 u1Var) {
            super(i14, u1Var);
            if (7 != (i14 & 7)) {
                k1.h(i14, 7, a.f35633a.getF158591b());
                throw null;
            }
            this.f35628a = uVar;
            this.f35629b = str;
            this.f35630c = str2;
            if ((i14 & 8) == 0) {
                this.f35631d = false;
            } else {
                this.f35631d = z14;
            }
            if ((i14 & 16) == 0) {
                this.f35632e = false;
            } else {
                this.f35632e = z15;
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
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f35628a == cVar.f35628a && p005kotlin.jvm.internal.s.g(this.f35629b, cVar.f35629b) && p005kotlin.jvm.internal.s.g(this.f35630c, cVar.f35630c) && this.f35631d == cVar.f35631d && this.f35632e == cVar.f35632e;
        }

        public final int hashCode() {
            int iHashCode = this.f35628a.hashCode() * 31;
            String str = this.f35629b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f35630c;
            return Boolean.hashCode(this.f35632e) + q6.f.g((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.f35631d);
        }

        public final String toString() {
            StringBuilder sb3 = new StringBuilder("BrandModelManualEntry(gearType=");
            sb3.append(this.f35628a);
            sb3.append(", initialBrand=");
            sb3.append(this.f35629b);
            sb3.append(", initialModel=");
            v.h.C(this.f35630c, ", enterOtherBrand=", ", enterOtherModel=", sb3, this.f35631d);
            return hb.a.k(sb3, this.f35632e, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i14) {
            parcel.getClass();
            parcel.writeString(this.f35628a.name());
            parcel.writeString(this.f35629b);
            parcel.writeString(this.f35630c);
            parcel.writeInt(this.f35631d ? 1 : 0);
            parcel.writeInt(this.f35632e ? 1 : 0);
        }

        /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.gear.presentation.navigation.GearRoute$c$b, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/gear/presentation/navigation/GearRoute$c$b;", "", "<init>", "()V", "Li63/c;", "Lcom/garmin/android/apps/connectmobile/gear/presentation/navigation/GearRoute$c;", "serializer", "()Li63/c;", "gcm-gear_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
                this();
            }

            public final i63.c<c> serializer() {
                return a.f35633a;
            }

            private Companion() {
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(u uVar, String str, String str2, boolean z14, boolean z15) {
            super(null);
            uVar.getClass();
            this.f35628a = uVar;
            this.f35629b = str;
            this.f35630c = str2;
            this.f35631d = z14;
            this.f35632e = z15;
        }

        public /* synthetic */ c(u uVar, String str, String str2, boolean z14, boolean z15, int i14, p005kotlin.jvm.internal.j jVar) {
            this(uVar, str, str2, (i14 & 8) != 0 ? false : z14, (i14 & 16) != 0 ? false : z15);
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u000b2\u00020\u0001:\u0002\f\rB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/garmin/android/apps/connectmobile/gear/presentation/navigation/GearRoute$d;", "Lcom/garmin/android/apps/connectmobile/gear/presentation/navigation/GearRoute;", "", "collectionId", "<init>", "(Ljava/lang/String;)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILjava/lang/String;Lm63/u1;)V", "Companion", "a", "b", "gcm-gear_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @i63.h
    public static final /* data */ class d extends GearRoute {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f35634a;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final Parcelable.Creator<d> CREATOR = new c();

        @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/gear/presentation/navigation/GearRoute.CollectionDetails.$serializer", "Lm63/e0;", "Lcom/garmin/android/apps/connectmobile/gear/presentation/navigation/GearRoute$d;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-gear_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        @o13.e
        public static final /* synthetic */ class a implements e0<d> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f35635a;
            private static final e descriptor;

            static {
                a aVar = new a();
                f35635a = aVar;
                m1 m1Var = new m1("com.garmin.android.apps.connectmobile.gear.presentation.navigation.GearRoute.CollectionDetails", aVar, 1);
                m1Var.j("collectionId", false);
                descriptor = m1Var;
            }

            private a() {
            }

            @Override // m63.e0
            public final i63.c<?>[] childSerializers() {
                return new i63.c[]{y1.f117048a};
            }

            @Override // i63.b
            public final Object deserialize(l63.e eVar) {
                eVar.getClass();
                e eVar2 = descriptor;
                l63.c cVarC = eVar.c(eVar2);
                int i14 = l63.c.f110557a;
                u1 u1Var = null;
                boolean z14 = true;
                int i15 = 0;
                String strR = null;
                while (z14) {
                    int iE = cVarC.e(eVar2);
                    if (iE == -1) {
                        z14 = false;
                    } else {
                        if (iE != 0) {
                            hb.a.o(iE);
                            return null;
                        }
                        strR = cVarC.r(eVar2, 0);
                        i15 = 1;
                    }
                }
                cVarC.b(eVar2);
                return new d(i15, strR, u1Var);
            }

            @Override // i63.i, i63.b
            /* JADX INFO: renamed from: getDescriptor */
            public final e getF158591b() {
                return descriptor;
            }

            @Override // i63.i
            public final void serialize(l63.f fVar, Object obj) {
                d dVar = (d) obj;
                dVar.getClass();
                e eVar = descriptor;
                l63.d dVarC = fVar.c(eVar);
                GearRoute.write$Self(dVar, dVarC, eVar);
                dVarC.k(eVar, 0, dVar.f35634a);
                dVarC.b(eVar);
            }
        }

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class c implements Parcelable.Creator<d> {
            @Override // android.os.Parcelable.Creator
            public final d createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new d(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final d[] newArray(int i14) {
                return new d[i14];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ d(int i14, String str, u1 u1Var) {
            super(i14, u1Var);
            if (1 != (i14 & 1)) {
                k1.h(i14, 1, a.f35635a.getF158591b());
                throw null;
            }
            this.f35634a = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && p005kotlin.jvm.internal.s.g(this.f35634a, ((d) obj).f35634a);
        }

        public final int hashCode() {
            return this.f35634a.hashCode();
        }

        public final String toString() {
            return am.j.m("CollectionDetails(collectionId=", this.f35634a, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i14) {
            parcel.getClass();
            parcel.writeString(this.f35634a);
        }

        /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.gear.presentation.navigation.GearRoute$d$b, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/gear/presentation/navigation/GearRoute$d$b;", "", "<init>", "()V", "Li63/c;", "Lcom/garmin/android/apps/connectmobile/gear/presentation/navigation/GearRoute$d;", "serializer", "()Li63/c;", "gcm-gear_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
                this();
            }

            public final i63.c<d> serializer() {
                return a.f35635a;
            }

            private Companion() {
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str) {
            super(null);
            str.getClass();
            this.f35634a = str;
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u000b2\u00020\u0001:\u0002\f\rB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/garmin/android/apps/connectmobile/gear/presentation/navigation/GearRoute$f;", "Lcom/garmin/android/apps/connectmobile/gear/presentation/navigation/GearRoute;", "Lcom/garmin/android/apps/connectmobile/gear/presentation/navigation/b;", "gearDTO", "<init>", "(Lcom/garmin/android/apps/connectmobile/gear/presentation/navigation/b;)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILcom/garmin/android/apps/connectmobile/gear/presentation/navigation/b;Lm63/u1;)V", "Companion", "a", "b", "gcm-gear_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @i63.h
    public static final /* data */ class f extends GearRoute {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.garmin.android.apps.connectmobile.gear.presentation.navigation.b f35636a;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final Parcelable.Creator<f> CREATOR = new c();

        @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/gear/presentation/navigation/GearRoute.DuplicateGear.$serializer", "Lm63/e0;", "Lcom/garmin/android/apps/connectmobile/gear/presentation/navigation/GearRoute$f;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-gear_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        @o13.e
        public static final /* synthetic */ class a implements e0<f> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f35637a;
            private static final e descriptor;

            static {
                a aVar = new a();
                f35637a = aVar;
                m1 m1Var = new m1("com.garmin.android.apps.connectmobile.gear.presentation.navigation.GearRoute.DuplicateGear", aVar, 1);
                m1Var.j("gearDTO", false);
                descriptor = m1Var;
            }

            private a() {
            }

            @Override // m63.e0
            public final i63.c<?>[] childSerializers() {
                return new i63.c[]{com.garmin.android.apps.connectmobile.gear.presentation.navigation.b.a.f35718a};
            }

            @Override // i63.b
            public final Object deserialize(l63.e eVar) {
                eVar.getClass();
                e eVar2 = descriptor;
                l63.c cVarC = eVar.c(eVar2);
                int i14 = l63.c.f110557a;
                u1 u1Var = null;
                boolean z14 = true;
                int i15 = 0;
                com.garmin.android.apps.connectmobile.gear.presentation.navigation.b bVar = null;
                while (z14) {
                    int iE = cVarC.e(eVar2);
                    if (iE == -1) {
                        z14 = false;
                    } else {
                        if (iE != 0) {
                            hb.a.o(iE);
                            return null;
                        }
                        bVar = (com.garmin.android.apps.connectmobile.gear.presentation.navigation.b) cVarC.l(eVar2, 0, com.garmin.android.apps.connectmobile.gear.presentation.navigation.b.a.f35718a, bVar);
                        i15 = 1;
                    }
                }
                cVarC.b(eVar2);
                return new f(i15, bVar, u1Var);
            }

            @Override // i63.i, i63.b
            /* JADX INFO: renamed from: getDescriptor */
            public final e getF158591b() {
                return descriptor;
            }

            @Override // i63.i
            public final void serialize(l63.f fVar, Object obj) {
                f fVar2 = (f) obj;
                fVar2.getClass();
                e eVar = descriptor;
                l63.d dVarC = fVar.c(eVar);
                GearRoute.write$Self(fVar2, dVarC, eVar);
                dVarC.e(eVar, 0, com.garmin.android.apps.connectmobile.gear.presentation.navigation.b.a.f35718a, fVar2.f35636a);
                dVarC.b(eVar);
            }
        }

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class c implements Parcelable.Creator<f> {
            @Override // android.os.Parcelable.Creator
            public final f createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new f(com.garmin.android.apps.connectmobile.gear.presentation.navigation.b.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final f[] newArray(int i14) {
                return new f[i14];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ f(int i14, com.garmin.android.apps.connectmobile.gear.presentation.navigation.b bVar, u1 u1Var) {
            super(i14, u1Var);
            if (1 != (i14 & 1)) {
                k1.h(i14, 1, a.f35637a.getF158591b());
                throw null;
            }
            this.f35636a = bVar;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && p005kotlin.jvm.internal.s.g(this.f35636a, ((f) obj).f35636a);
        }

        public final int hashCode() {
            return this.f35636a.hashCode();
        }

        public final String toString() {
            return "DuplicateGear(gearDTO=" + this.f35636a + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i14) {
            parcel.getClass();
            this.f35636a.writeToParcel(parcel, i14);
        }

        /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.gear.presentation.navigation.GearRoute$f$b, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/gear/presentation/navigation/GearRoute$f$b;", "", "<init>", "()V", "Li63/c;", "Lcom/garmin/android/apps/connectmobile/gear/presentation/navigation/GearRoute$f;", "serializer", "()Li63/c;", "gcm-gear_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
                this();
            }

            public final i63.c<f> serializer() {
                return a.f35637a;
            }

            private Companion() {
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(com.garmin.android.apps.connectmobile.gear.presentation.navigation.b bVar) {
            super(null);
            bVar.getClass();
            this.f35636a = bVar;
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u000e2\u00020\u0001:\u0002\u000f\u0010B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bB5\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\r¨\u0006\u0011"}, d2 = {"Lcom/garmin/android/apps/connectmobile/gear/presentation/navigation/GearRoute$g;", "Lcom/garmin/android/apps/connectmobile/gear/presentation/navigation/GearRoute;", "Lsk0/l0;", "collectionData", "", "Lcom/garmin/android/apps/connectmobile/gear/presentation/navigation/a;", "images", "<init>", "(Lsk0/l0;Ljava/util/List;)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILsk0/l0;Ljava/util/List;Lm63/u1;)V", "Companion", "a", "b", "gcm-gear_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @i63.h
    public static final /* data */ class g extends GearRoute {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final l0 f35639a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List<com.garmin.android.apps.connectmobile.gear.presentation.navigation.a> f35640b;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final Parcelable.Creator<g> CREATOR = new c();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final o13.l<i63.c<Object>>[] f35638c = {null, o13.m.a(o13.n.PUBLICATION, new tk0.a(0))};

        @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/gear/presentation/navigation/GearRoute.EditCollection.$serializer", "Lm63/e0;", "Lcom/garmin/android/apps/connectmobile/gear/presentation/navigation/GearRoute$g;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-gear_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        @o13.e
        public static final /* synthetic */ class a implements e0<g> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f35641a;
            private static final e descriptor;

            static {
                a aVar = new a();
                f35641a = aVar;
                m1 m1Var = new m1("com.garmin.android.apps.connectmobile.gear.presentation.navigation.GearRoute.EditCollection", aVar, 2);
                m1Var.j("collectionData", false);
                m1Var.j("images", false);
                descriptor = m1Var;
            }

            private a() {
            }

            @Override // m63.e0
            public final i63.c<?>[] childSerializers() {
                return new i63.c[]{l0.a.f159728a, g.f35638c[1].getValue()};
            }

            @Override // i63.b
            public final Object deserialize(l63.e eVar) {
                eVar.getClass();
                e eVar2 = descriptor;
                l63.c cVarC = eVar.c(eVar2);
                o13.l<i63.c<Object>>[] lVarArr = g.f35638c;
                int i14 = l63.c.f110557a;
                u1 u1Var = null;
                boolean z14 = true;
                int i15 = 0;
                l0 l0Var = null;
                List list = null;
                while (z14) {
                    int iE = cVarC.e(eVar2);
                    if (iE == -1) {
                        z14 = false;
                    } else if (iE == 0) {
                        l0Var = (l0) cVarC.l(eVar2, 0, l0.a.f159728a, l0Var);
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
                return new g(i15, l0Var, list, u1Var);
            }

            @Override // i63.i, i63.b
            /* JADX INFO: renamed from: getDescriptor */
            public final e getF158591b() {
                return descriptor;
            }

            @Override // i63.i
            public final void serialize(l63.f fVar, Object obj) {
                g gVar = (g) obj;
                gVar.getClass();
                e eVar = descriptor;
                l63.d dVarC = fVar.c(eVar);
                GearRoute.write$Self(gVar, dVarC, eVar);
                o13.l<i63.c<Object>>[] lVarArr = g.f35638c;
                dVarC.e(eVar, 0, l0.a.f159728a, gVar.f35639a);
                dVarC.e(eVar, 1, lVarArr[1].getValue(), gVar.f35640b);
                dVarC.b(eVar);
            }
        }

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class c implements Parcelable.Creator<g> {
            @Override // android.os.Parcelable.Creator
            public final g createFromParcel(Parcel parcel) {
                parcel.getClass();
                l0 l0VarCreateFromParcel = l0.CREATOR.createFromParcel(parcel);
                int i14 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i14);
                int iA = 0;
                while (iA != i14) {
                    iA = kg.f.a(com.garmin.android.apps.connectmobile.gear.presentation.navigation.a.CREATOR, parcel, arrayList, iA, 1);
                }
                return new g(l0VarCreateFromParcel, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final g[] newArray(int i14) {
                return new g[i14];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ g(int i14, l0 l0Var, List list, u1 u1Var) {
            super(i14, u1Var);
            if (3 != (i14 & 3)) {
                k1.h(i14, 3, a.f35641a.getF158591b());
                throw null;
            }
            this.f35639a = l0Var;
            this.f35640b = list;
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
            return p005kotlin.jvm.internal.s.g(this.f35639a, gVar.f35639a) && p005kotlin.jvm.internal.s.g(this.f35640b, gVar.f35640b);
        }

        public final int hashCode() {
            return this.f35640b.hashCode() + (this.f35639a.hashCode() * 31);
        }

        public final String toString() {
            return "EditCollection(collectionData=" + this.f35639a + ", images=" + this.f35640b + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i14) {
            parcel.getClass();
            this.f35639a.writeToParcel(parcel, i14);
            Iterator itE = kg.f.e(this.f35640b, parcel);
            while (itE.hasNext()) {
                ((com.garmin.android.apps.connectmobile.gear.presentation.navigation.a) itE.next()).writeToParcel(parcel, i14);
            }
        }

        /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.gear.presentation.navigation.GearRoute$g$b, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/gear/presentation/navigation/GearRoute$g$b;", "", "<init>", "()V", "Li63/c;", "Lcom/garmin/android/apps/connectmobile/gear/presentation/navigation/GearRoute$g;", "serializer", "()Li63/c;", "gcm-gear_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
                this();
            }

            public final i63.c<g> serializer() {
                return a.f35641a;
            }

            private Companion() {
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(l0 l0Var, List<com.garmin.android.apps.connectmobile.gear.presentation.navigation.a> list) {
            super(null);
            l0Var.getClass();
            list.getClass();
            this.f35639a = l0Var;
            this.f35640b = list;
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u000b2\u00020\u0001:\u0002\f\rB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/garmin/android/apps/connectmobile/gear/presentation/navigation/GearRoute$h;", "Lcom/garmin/android/apps/connectmobile/gear/presentation/navigation/GearRoute;", "Lcom/garmin/android/apps/connectmobile/gear/presentation/navigation/b;", "gearDTO", "<init>", "(Lcom/garmin/android/apps/connectmobile/gear/presentation/navigation/b;)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILcom/garmin/android/apps/connectmobile/gear/presentation/navigation/b;Lm63/u1;)V", "Companion", "a", "b", "gcm-gear_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @i63.h
    public static final /* data */ class h extends GearRoute {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.garmin.android.apps.connectmobile.gear.presentation.navigation.b f35642a;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final Parcelable.Creator<h> CREATOR = new c();

        @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/gear/presentation/navigation/GearRoute.EditGear.$serializer", "Lm63/e0;", "Lcom/garmin/android/apps/connectmobile/gear/presentation/navigation/GearRoute$h;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-gear_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        @o13.e
        public static final /* synthetic */ class a implements e0<h> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f35643a;
            private static final e descriptor;

            static {
                a aVar = new a();
                f35643a = aVar;
                m1 m1Var = new m1("com.garmin.android.apps.connectmobile.gear.presentation.navigation.GearRoute.EditGear", aVar, 1);
                m1Var.j("gearDTO", false);
                descriptor = m1Var;
            }

            private a() {
            }

            @Override // m63.e0
            public final i63.c<?>[] childSerializers() {
                return new i63.c[]{com.garmin.android.apps.connectmobile.gear.presentation.navigation.b.a.f35718a};
            }

            @Override // i63.b
            public final Object deserialize(l63.e eVar) {
                eVar.getClass();
                e eVar2 = descriptor;
                l63.c cVarC = eVar.c(eVar2);
                int i14 = l63.c.f110557a;
                u1 u1Var = null;
                boolean z14 = true;
                int i15 = 0;
                com.garmin.android.apps.connectmobile.gear.presentation.navigation.b bVar = null;
                while (z14) {
                    int iE = cVarC.e(eVar2);
                    if (iE == -1) {
                        z14 = false;
                    } else {
                        if (iE != 0) {
                            hb.a.o(iE);
                            return null;
                        }
                        bVar = (com.garmin.android.apps.connectmobile.gear.presentation.navigation.b) cVarC.l(eVar2, 0, com.garmin.android.apps.connectmobile.gear.presentation.navigation.b.a.f35718a, bVar);
                        i15 = 1;
                    }
                }
                cVarC.b(eVar2);
                return new h(i15, bVar, u1Var);
            }

            @Override // i63.i, i63.b
            /* JADX INFO: renamed from: getDescriptor */
            public final e getF158591b() {
                return descriptor;
            }

            @Override // i63.i
            public final void serialize(l63.f fVar, Object obj) {
                h hVar = (h) obj;
                hVar.getClass();
                e eVar = descriptor;
                l63.d dVarC = fVar.c(eVar);
                GearRoute.write$Self(hVar, dVarC, eVar);
                dVarC.e(eVar, 0, com.garmin.android.apps.connectmobile.gear.presentation.navigation.b.a.f35718a, hVar.f35642a);
                dVarC.b(eVar);
            }
        }

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class c implements Parcelable.Creator<h> {
            @Override // android.os.Parcelable.Creator
            public final h createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new h(com.garmin.android.apps.connectmobile.gear.presentation.navigation.b.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final h[] newArray(int i14) {
                return new h[i14];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ h(int i14, com.garmin.android.apps.connectmobile.gear.presentation.navigation.b bVar, u1 u1Var) {
            super(i14, u1Var);
            if (1 != (i14 & 1)) {
                k1.h(i14, 1, a.f35643a.getF158591b());
                throw null;
            }
            this.f35642a = bVar;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && p005kotlin.jvm.internal.s.g(this.f35642a, ((h) obj).f35642a);
        }

        public final int hashCode() {
            return this.f35642a.hashCode();
        }

        public final String toString() {
            return "EditGear(gearDTO=" + this.f35642a + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i14) {
            parcel.getClass();
            this.f35642a.writeToParcel(parcel, i14);
        }

        /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.gear.presentation.navigation.GearRoute$h$b, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/gear/presentation/navigation/GearRoute$h$b;", "", "<init>", "()V", "Li63/c;", "Lcom/garmin/android/apps/connectmobile/gear/presentation/navigation/GearRoute$h;", "serializer", "()Li63/c;", "gcm-gear_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
                this();
            }

            public final i63.c<h> serializer() {
                return a.f35643a;
            }

            private Companion() {
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(com.garmin.android.apps.connectmobile.gear.presentation.navigation.b bVar) {
            super(null);
            bVar.getClass();
            this.f35642a = bVar;
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \r2\u00020\u0001:\u0002\u000e\u000fB\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/garmin/android/apps/connectmobile/gear/presentation/navigation/GearRoute$i;", "Lcom/garmin/android/apps/connectmobile/gear/presentation/navigation/GearRoute;", "Lrk0/f0;", ModelSourceWrapper.TYPE, "", "activityId", "<init>", "(Lrk0/f0;Ljava/lang/Long;)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILrk0/f0;Ljava/lang/Long;Lm63/u1;)V", "Companion", "a", "b", "gcm-gear_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @i63.h
    public static final /* data */ class i extends GearRoute {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final f0 f35644a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Long f35645b;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final Parcelable.Creator<i> CREATOR = new c();

        @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/gear/presentation/navigation/GearRoute.GearDetails.$serializer", "Lm63/e0;", "Lcom/garmin/android/apps/connectmobile/gear/presentation/navigation/GearRoute$i;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-gear_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        @o13.e
        public static final /* synthetic */ class a implements e0<i> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f35646a;
            private static final e descriptor;

            static {
                a aVar = new a();
                f35646a = aVar;
                m1 m1Var = new m1("com.garmin.android.apps.connectmobile.gear.presentation.navigation.GearRoute.GearDetails", aVar, 2);
                m1Var.j(ModelSourceWrapper.TYPE, false);
                m1Var.j("activityId", true);
                descriptor = m1Var;
            }

            private a() {
            }

            @Override // m63.e0
            public final i63.c<?>[] childSerializers() {
                return new i63.c[]{f0.a.f153123a, j63.a.d(v0.f117027a)};
            }

            @Override // i63.b
            public final Object deserialize(l63.e eVar) {
                eVar.getClass();
                e eVar2 = descriptor;
                l63.c cVarC = eVar.c(eVar2);
                int i14 = l63.c.f110557a;
                u1 u1Var = null;
                boolean z14 = true;
                int i15 = 0;
                f0 f0Var = null;
                Long l14 = null;
                while (z14) {
                    int iE = cVarC.e(eVar2);
                    if (iE == -1) {
                        z14 = false;
                    } else if (iE == 0) {
                        f0Var = (f0) cVarC.l(eVar2, 0, f0.a.f153123a, f0Var);
                        i15 |= 1;
                    } else {
                        if (iE != 1) {
                            hb.a.o(iE);
                            return null;
                        }
                        l14 = (Long) cVarC.v(eVar2, 1, v0.f117027a, l14);
                        i15 |= 2;
                    }
                }
                cVarC.b(eVar2);
                return new i(i15, f0Var, l14, u1Var);
            }

            @Override // i63.i, i63.b
            /* JADX INFO: renamed from: getDescriptor */
            public final e getF158591b() {
                return descriptor;
            }

            @Override // i63.i
            public final void serialize(l63.f fVar, Object obj) {
                i iVar = (i) obj;
                iVar.getClass();
                e eVar = descriptor;
                l63.d dVarC = fVar.c(eVar);
                GearRoute.write$Self(iVar, dVarC, eVar);
                f0.a aVar = f0.a.f153123a;
                f0 f0Var = iVar.f35644a;
                Long l14 = iVar.f35645b;
                dVarC.e(eVar, 0, aVar, f0Var);
                if (dVarC.C(eVar) || l14 != null) {
                    dVarC.d(eVar, 1, v0.f117027a, l14);
                }
                dVarC.b(eVar);
            }
        }

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class c implements Parcelable.Creator<i> {
            @Override // android.os.Parcelable.Creator
            public final i createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new i(f0.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()));
            }

            @Override // android.os.Parcelable.Creator
            public final i[] newArray(int i14) {
                return new i[i14];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ i(int i14, f0 f0Var, Long l14, u1 u1Var) {
            super(i14, u1Var);
            if (1 != (i14 & 1)) {
                k1.h(i14, 1, a.f35646a.getF158591b());
                throw null;
            }
            this.f35644a = f0Var;
            if ((i14 & 2) == 0) {
                this.f35645b = null;
            } else {
                this.f35645b = l14;
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
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return p005kotlin.jvm.internal.s.g(this.f35644a, iVar.f35644a) && p005kotlin.jvm.internal.s.g(this.f35645b, iVar.f35645b);
        }

        public final int hashCode() {
            int iHashCode = this.f35644a.hashCode() * 31;
            Long l14 = this.f35645b;
            return iHashCode + (l14 == null ? 0 : l14.hashCode());
        }

        public final String toString() {
            return "GearDetails(model=" + this.f35644a + ", activityId=" + this.f35645b + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i14) {
            parcel.getClass();
            this.f35644a.writeToParcel(parcel, i14);
            Long l14 = this.f35645b;
            if (l14 == null) {
                parcel.writeInt(0);
            } else {
                sn.a.n(parcel, 1, l14);
            }
        }

        /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.gear.presentation.navigation.GearRoute$i$b, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/gear/presentation/navigation/GearRoute$i$b;", "", "<init>", "()V", "Li63/c;", "Lcom/garmin/android/apps/connectmobile/gear/presentation/navigation/GearRoute$i;", "serializer", "()Li63/c;", "gcm-gear_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
                this();
            }

            public final i63.c<i> serializer() {
                return a.f35646a;
            }

            private Companion() {
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(f0 f0Var, Long l14) {
            super(null);
            f0Var.getClass();
            this.f35644a = f0Var;
            this.f35645b = l14;
        }

        public /* synthetic */ i(f0 f0Var, Long l14, int i14, p005kotlin.jvm.internal.j jVar) {
            this(f0Var, (i14 & 2) != 0 ? null : l14);
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00122\u00020\u0001:\u0002\u0013\u0014B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fBG\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011¨\u0006\u0015"}, d2 = {"Lcom/garmin/android/apps/connectmobile/gear/presentation/navigation/GearRoute$k;", "Lcom/garmin/android/apps/connectmobile/gear/presentation/navigation/GearRoute;", "", "activityId", "Lb63/o;", "onOrBeforeLocalDate", "", "Luk0/a;", "selectedGears", "Lam/x0;", "activityType", "<init>", "(JLb63/o;Ljava/util/List;Lam/x0;)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(IJLb63/o;Ljava/util/List;Lam/x0;Lm63/u1;)V", "Companion", "a", "b", "gcm-gear_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @i63.h
    public static final /* data */ class k extends GearRoute {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final o13.l<i63.c<Object>>[] f35648e;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f35649a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final b63.o f35650b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List<uk0.a> f35651c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final x0 f35652d;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final Parcelable.Creator<k> CREATOR = new c();

        @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/gear/presentation/navigation/GearRoute.ManageActivityGear.$serializer", "Lm63/e0;", "Lcom/garmin/android/apps/connectmobile/gear/presentation/navigation/GearRoute$k;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-gear_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        @o13.e
        public static final /* synthetic */ class a implements e0<k> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f35653a;
            private static final e descriptor;

            static {
                a aVar = new a();
                f35653a = aVar;
                m1 m1Var = new m1("com.garmin.android.apps.connectmobile.gear.presentation.navigation.GearRoute.ManageActivityGear", aVar, 4);
                m1Var.j("activityId", false);
                m1Var.j("onOrBeforeLocalDate", false);
                m1Var.j("selectedGears", false);
                m1Var.j("activityType", false);
                descriptor = m1Var;
            }

            private a() {
            }

            @Override // m63.e0
            public final i63.c<?>[] childSerializers() {
                o13.l<i63.c<Object>>[] lVarArr = k.f35648e;
                return new i63.c[]{v0.f117027a, h63.k.f82304a, lVarArr[2].getValue(), lVarArr[3].getValue()};
            }

            @Override // i63.b
            public final Object deserialize(l63.e eVar) {
                eVar.getClass();
                e eVar2 = descriptor;
                l63.c cVarC = eVar.c(eVar2);
                o13.l<i63.c<Object>>[] lVarArr = k.f35648e;
                int i14 = l63.c.f110557a;
                int i15 = 0;
                long jW = 0;
                b63.o oVar = null;
                List list = null;
                x0 x0Var = null;
                boolean z14 = true;
                while (z14) {
                    int iE = cVarC.e(eVar2);
                    if (iE == -1) {
                        z14 = false;
                    } else if (iE == 0) {
                        jW = cVarC.w(eVar2, 0);
                        i15 |= 1;
                    } else if (iE == 1) {
                        oVar = (b63.o) cVarC.l(eVar2, 1, h63.k.f82304a, oVar);
                        i15 |= 2;
                    } else if (iE == 2) {
                        list = (List) cVarC.l(eVar2, 2, lVarArr[2].getValue(), list);
                        i15 |= 4;
                    } else {
                        if (iE != 3) {
                            hb.a.o(iE);
                            return null;
                        }
                        x0Var = (x0) cVarC.l(eVar2, 3, lVarArr[3].getValue(), x0Var);
                        i15 |= 8;
                    }
                }
                cVarC.b(eVar2);
                return new k(i15, jW, oVar, list, x0Var, null);
            }

            @Override // i63.i, i63.b
            /* JADX INFO: renamed from: getDescriptor */
            public final e getF158591b() {
                return descriptor;
            }

            @Override // i63.i
            public final void serialize(l63.f fVar, Object obj) {
                k kVar = (k) obj;
                kVar.getClass();
                e eVar = descriptor;
                l63.d dVarC = fVar.c(eVar);
                GearRoute.write$Self(kVar, dVarC, eVar);
                o13.l<i63.c<Object>>[] lVarArr = k.f35648e;
                dVarC.z(eVar, 0, kVar.f35649a);
                dVarC.e(eVar, 1, h63.k.f82304a, kVar.f35650b);
                dVarC.e(eVar, 2, lVarArr[2].getValue(), kVar.f35651c);
                dVarC.e(eVar, 3, lVarArr[3].getValue(), kVar.f35652d);
                dVarC.b(eVar);
            }
        }

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class c implements Parcelable.Creator<k> {
            @Override // android.os.Parcelable.Creator
            public final k createFromParcel(Parcel parcel) {
                parcel.getClass();
                long j8 = parcel.readLong();
                b63.o oVarA = vk0.g.f178573a.a(parcel);
                int i14 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i14);
                int iA = 0;
                while (iA != i14) {
                    iA = kg.f.a(uk0.a.CREATOR, parcel, arrayList, iA, 1);
                }
                return new k(j8, oVarA, arrayList, (x0) parcel.readParcelable(k.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final k[] newArray(int i14) {
                return new k[i14];
            }
        }

        static {
            o13.n nVar = o13.n.PUBLICATION;
            f35648e = new o13.l[]{null, null, o13.m.a(nVar, new tk0.a(2)), o13.m.a(nVar, new tk0.a(3))};
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ k(int i14, long j8, b63.o oVar, List list, x0 x0Var, u1 u1Var) {
            super(i14, u1Var);
            if (15 != (i14 & 15)) {
                k1.h(i14, 15, a.f35653a.getF158591b());
                throw null;
            }
            this.f35649a = j8;
            this.f35650b = oVar;
            this.f35651c = list;
            this.f35652d = x0Var;
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
            return this.f35649a == kVar.f35649a && p005kotlin.jvm.internal.s.g(this.f35650b, kVar.f35650b) && p005kotlin.jvm.internal.s.g(this.f35651c, kVar.f35651c) && this.f35652d == kVar.f35652d;
        }

        public final int hashCode() {
            return this.f35652d.hashCode() + u0.b(n23.j.a(this.f35650b.f16206a, Long.hashCode(this.f35649a) * 31, 31), 31, this.f35651c);
        }

        public final String toString() {
            return "ManageActivityGear(activityId=" + this.f35649a + ", onOrBeforeLocalDate=" + this.f35650b + ", selectedGears=" + this.f35651c + ", activityType=" + this.f35652d + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i14) {
            parcel.getClass();
            parcel.writeLong(this.f35649a);
            vk0.g.f178573a.b(this.f35650b, parcel);
            Iterator itE = kg.f.e(this.f35651c, parcel);
            while (itE.hasNext()) {
                ((uk0.a) itE.next()).writeToParcel(parcel, i14);
            }
            parcel.writeParcelable(this.f35652d, i14);
        }

        /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.gear.presentation.navigation.GearRoute$k$b, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/gear/presentation/navigation/GearRoute$k$b;", "", "<init>", "()V", "Li63/c;", "Lcom/garmin/android/apps/connectmobile/gear/presentation/navigation/GearRoute$k;", "serializer", "()Li63/c;", "gcm-gear_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
                this();
            }

            public final i63.c<k> serializer() {
                return a.f35653a;
            }

            private Companion() {
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(long j8, b63.o oVar, List<uk0.a> list, x0 x0Var) {
            super(null);
            oVar.getClass();
            list.getClass();
            x0Var.getClass();
            this.f35649a = j8;
            this.f35650b = oVar;
            this.f35651c = list;
            this.f35652d = x0Var;
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \f2\u00020\u0001:\u0002\r\u000eB\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006B+\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000b¨\u0006\u000f"}, d2 = {"Lcom/garmin/android/apps/connectmobile/gear/presentation/navigation/GearRoute$l;", "Lcom/garmin/android/apps/connectmobile/gear/presentation/navigation/GearRoute;", "", "Luk0/a;", "selectedGears", "<init>", "(Ljava/util/List;)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILjava/util/List;Lm63/u1;)V", "Companion", "a", "b", "gcm-gear_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @i63.h
    public static final /* data */ class l extends GearRoute {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<uk0.a> f35655a;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final Parcelable.Creator<l> CREATOR = new c();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final o13.l<i63.c<Object>>[] f35654b = {o13.m.a(o13.n.PUBLICATION, new tk0.a(4))};

        @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/gear/presentation/navigation/GearRoute.ManageCollectionGear.$serializer", "Lm63/e0;", "Lcom/garmin/android/apps/connectmobile/gear/presentation/navigation/GearRoute$l;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-gear_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        @o13.e
        public static final /* synthetic */ class a implements e0<l> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f35656a;
            private static final e descriptor;

            static {
                a aVar = new a();
                f35656a = aVar;
                m1 m1Var = new m1("com.garmin.android.apps.connectmobile.gear.presentation.navigation.GearRoute.ManageCollectionGear", aVar, 1);
                m1Var.j("selectedGears", false);
                descriptor = m1Var;
            }

            private a() {
            }

            @Override // m63.e0
            public final i63.c<?>[] childSerializers() {
                return new i63.c[]{l.f35654b[0].getValue()};
            }

            @Override // i63.b
            public final Object deserialize(l63.e eVar) {
                eVar.getClass();
                e eVar2 = descriptor;
                l63.c cVarC = eVar.c(eVar2);
                o13.l<i63.c<Object>>[] lVarArr = l.f35654b;
                int i14 = l63.c.f110557a;
                u1 u1Var = null;
                boolean z14 = true;
                int i15 = 0;
                List list = null;
                while (z14) {
                    int iE = cVarC.e(eVar2);
                    if (iE == -1) {
                        z14 = false;
                    } else {
                        if (iE != 0) {
                            hb.a.o(iE);
                            return null;
                        }
                        list = (List) cVarC.l(eVar2, 0, lVarArr[0].getValue(), list);
                        i15 = 1;
                    }
                }
                cVarC.b(eVar2);
                return new l(i15, list, u1Var);
            }

            @Override // i63.i, i63.b
            /* JADX INFO: renamed from: getDescriptor */
            public final e getF158591b() {
                return descriptor;
            }

            @Override // i63.i
            public final void serialize(l63.f fVar, Object obj) {
                l lVar = (l) obj;
                lVar.getClass();
                e eVar = descriptor;
                l63.d dVarC = fVar.c(eVar);
                GearRoute.write$Self(lVar, dVarC, eVar);
                dVarC.e(eVar, 0, l.f35654b[0].getValue(), lVar.f35655a);
                dVarC.b(eVar);
            }
        }

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class c implements Parcelable.Creator<l> {
            @Override // android.os.Parcelable.Creator
            public final l createFromParcel(Parcel parcel) {
                parcel.getClass();
                int i14 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i14);
                int iA = 0;
                while (iA != i14) {
                    iA = kg.f.a(uk0.a.CREATOR, parcel, arrayList, iA, 1);
                }
                return new l(arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final l[] newArray(int i14) {
                return new l[i14];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ l(int i14, List list, u1 u1Var) {
            super(i14, u1Var);
            if (1 != (i14 & 1)) {
                k1.h(i14, 1, a.f35656a.getF158591b());
                throw null;
            }
            this.f35655a = list;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof l) && p005kotlin.jvm.internal.s.g(this.f35655a, ((l) obj).f35655a);
        }

        public final int hashCode() {
            return this.f35655a.hashCode();
        }

        public final String toString() {
            return tn.k.h("ManageCollectionGear(selectedGears=", ")", this.f35655a);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i14) {
            parcel.getClass();
            Iterator itE = kg.f.e(this.f35655a, parcel);
            while (itE.hasNext()) {
                ((uk0.a) itE.next()).writeToParcel(parcel, i14);
            }
        }

        /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.gear.presentation.navigation.GearRoute$l$b, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/gear/presentation/navigation/GearRoute$l$b;", "", "<init>", "()V", "Li63/c;", "Lcom/garmin/android/apps/connectmobile/gear/presentation/navigation/GearRoute$l;", "serializer", "()Li63/c;", "gcm-gear_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
                this();
            }

            public final i63.c<l> serializer() {
                return a.f35656a;
            }

            private Companion() {
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(List<uk0.a> list) {
            super(null);
            list.getClass();
            this.f35655a = list;
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u000e2\u00020\u0001:\u0002\u000f\u0010B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bB5\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\r¨\u0006\u0011"}, d2 = {"Lcom/garmin/android/apps/connectmobile/gear/presentation/navigation/GearRoute$m;", "Lcom/garmin/android/apps/connectmobile/gear/presentation/navigation/GearRoute;", "", "collectionId", "", "Ly22/w;", "photos", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/List;Lm63/u1;)V", "Companion", "a", "b", "gcm-gear_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @i63.h
    public static final /* data */ class m extends GearRoute {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f35658a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List<w> f35659b;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final Parcelable.Creator<m> CREATOR = new c();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final o13.l<i63.c<Object>>[] f35657c = {null, o13.m.a(o13.n.PUBLICATION, new tk0.a(5))};

        @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/gear/presentation/navigation/GearRoute.ManageCollectionPhotos.$serializer", "Lm63/e0;", "Lcom/garmin/android/apps/connectmobile/gear/presentation/navigation/GearRoute$m;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-gear_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        @o13.e
        public static final /* synthetic */ class a implements e0<m> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f35660a;
            private static final e descriptor;

            static {
                a aVar = new a();
                f35660a = aVar;
                m1 m1Var = new m1("com.garmin.android.apps.connectmobile.gear.presentation.navigation.GearRoute.ManageCollectionPhotos", aVar, 2);
                m1Var.j("collectionId", false);
                m1Var.j("photos", false);
                descriptor = m1Var;
            }

            private a() {
            }

            @Override // m63.e0
            public final i63.c<?>[] childSerializers() {
                return new i63.c[]{y1.f117048a, m.f35657c[1].getValue()};
            }

            @Override // i63.b
            public final Object deserialize(l63.e eVar) {
                eVar.getClass();
                e eVar2 = descriptor;
                l63.c cVarC = eVar.c(eVar2);
                o13.l<i63.c<Object>>[] lVarArr = m.f35657c;
                int i14 = l63.c.f110557a;
                u1 u1Var = null;
                boolean z14 = true;
                int i15 = 0;
                String strR = null;
                List list = null;
                while (z14) {
                    int iE = cVarC.e(eVar2);
                    if (iE == -1) {
                        z14 = false;
                    } else if (iE == 0) {
                        strR = cVarC.r(eVar2, 0);
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
                return new m(i15, strR, list, u1Var);
            }

            @Override // i63.i, i63.b
            /* JADX INFO: renamed from: getDescriptor */
            public final e getF158591b() {
                return descriptor;
            }

            @Override // i63.i
            public final void serialize(l63.f fVar, Object obj) {
                m mVar = (m) obj;
                mVar.getClass();
                e eVar = descriptor;
                l63.d dVarC = fVar.c(eVar);
                GearRoute.write$Self(mVar, dVarC, eVar);
                o13.l<i63.c<Object>>[] lVarArr = m.f35657c;
                dVarC.k(eVar, 0, mVar.f35658a);
                dVarC.e(eVar, 1, lVarArr[1].getValue(), mVar.f35659b);
                dVarC.b(eVar);
            }
        }

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class c implements Parcelable.Creator<m> {
            @Override // android.os.Parcelable.Creator
            public final m createFromParcel(Parcel parcel) {
                parcel.getClass();
                String string = parcel.readString();
                int i14 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i14);
                int iD = 0;
                while (iD != i14) {
                    iD = u0.d(m.class, parcel, arrayList, iD, 1);
                }
                return new m(string, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final m[] newArray(int i14) {
                return new m[i14];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ m(int i14, String str, List list, u1 u1Var) {
            super(i14, u1Var);
            if (3 != (i14 & 3)) {
                k1.h(i14, 3, a.f35660a.getF158591b());
                throw null;
            }
            this.f35658a = str;
            this.f35659b = list;
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
            return p005kotlin.jvm.internal.s.g(this.f35658a, mVar.f35658a) && p005kotlin.jvm.internal.s.g(this.f35659b, mVar.f35659b);
        }

        public final int hashCode() {
            return this.f35659b.hashCode() + (this.f35658a.hashCode() * 31);
        }

        public final String toString() {
            return fb1.c.o("ManageCollectionPhotos(collectionId=", this.f35658a, ", photos=", this.f35659b, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i14) {
            parcel.getClass();
            parcel.writeString(this.f35658a);
            Iterator itE = kg.f.e(this.f35659b, parcel);
            while (itE.hasNext()) {
                parcel.writeParcelable((Parcelable) itE.next(), i14);
            }
        }

        /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.gear.presentation.navigation.GearRoute$m$b, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/gear/presentation/navigation/GearRoute$m$b;", "", "<init>", "()V", "Li63/c;", "Lcom/garmin/android/apps/connectmobile/gear/presentation/navigation/GearRoute$m;", "serializer", "()Li63/c;", "gcm-gear_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
                this();
            }

            public final i63.c<m> serializer() {
                return a.f35660a;
            }

            private Companion() {
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(String str, List<w> list) {
            super(null);
            str.getClass();
            list.getClass();
            this.f35658a = str;
            this.f35659b = list;
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u000e2\u00020\u0001:\u0002\u000f\u0010B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bB5\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\r¨\u0006\u0011"}, d2 = {"Lcom/garmin/android/apps/connectmobile/gear/presentation/navigation/GearRoute$n;", "Lcom/garmin/android/apps/connectmobile/gear/presentation/navigation/GearRoute;", "", "gearId", "", "Ly22/w;", "photos", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/List;Lm63/u1;)V", "Companion", "a", "b", "gcm-gear_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @i63.h
    public static final /* data */ class n extends GearRoute {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f35662a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List<w> f35663b;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final Parcelable.Creator<n> CREATOR = new c();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final o13.l<i63.c<Object>>[] f35661c = {null, o13.m.a(o13.n.PUBLICATION, new tk0.a(6))};

        @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/gear/presentation/navigation/GearRoute.ManageGearPhotos.$serializer", "Lm63/e0;", "Lcom/garmin/android/apps/connectmobile/gear/presentation/navigation/GearRoute$n;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-gear_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        @o13.e
        public static final /* synthetic */ class a implements e0<n> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f35664a;
            private static final e descriptor;

            static {
                a aVar = new a();
                f35664a = aVar;
                m1 m1Var = new m1("com.garmin.android.apps.connectmobile.gear.presentation.navigation.GearRoute.ManageGearPhotos", aVar, 2);
                m1Var.j("gearId", false);
                m1Var.j("photos", false);
                descriptor = m1Var;
            }

            private a() {
            }

            @Override // m63.e0
            public final i63.c<?>[] childSerializers() {
                return new i63.c[]{y1.f117048a, n.f35661c[1].getValue()};
            }

            @Override // i63.b
            public final Object deserialize(l63.e eVar) {
                eVar.getClass();
                e eVar2 = descriptor;
                l63.c cVarC = eVar.c(eVar2);
                o13.l<i63.c<Object>>[] lVarArr = n.f35661c;
                int i14 = l63.c.f110557a;
                u1 u1Var = null;
                boolean z14 = true;
                int i15 = 0;
                String strR = null;
                List list = null;
                while (z14) {
                    int iE = cVarC.e(eVar2);
                    if (iE == -1) {
                        z14 = false;
                    } else if (iE == 0) {
                        strR = cVarC.r(eVar2, 0);
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
                return new n(i15, strR, list, u1Var);
            }

            @Override // i63.i, i63.b
            /* JADX INFO: renamed from: getDescriptor */
            public final e getF158591b() {
                return descriptor;
            }

            @Override // i63.i
            public final void serialize(l63.f fVar, Object obj) {
                n nVar = (n) obj;
                nVar.getClass();
                e eVar = descriptor;
                l63.d dVarC = fVar.c(eVar);
                GearRoute.write$Self(nVar, dVarC, eVar);
                o13.l<i63.c<Object>>[] lVarArr = n.f35661c;
                dVarC.k(eVar, 0, nVar.f35662a);
                dVarC.e(eVar, 1, lVarArr[1].getValue(), nVar.f35663b);
                dVarC.b(eVar);
            }
        }

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class c implements Parcelable.Creator<n> {
            @Override // android.os.Parcelable.Creator
            public final n createFromParcel(Parcel parcel) {
                parcel.getClass();
                String string = parcel.readString();
                int i14 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i14);
                int iD = 0;
                while (iD != i14) {
                    iD = u0.d(n.class, parcel, arrayList, iD, 1);
                }
                return new n(string, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final n[] newArray(int i14) {
                return new n[i14];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ n(int i14, String str, List list, u1 u1Var) {
            super(i14, u1Var);
            if (3 != (i14 & 3)) {
                k1.h(i14, 3, a.f35664a.getF158591b());
                throw null;
            }
            this.f35662a = str;
            this.f35663b = list;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof n)) {
                return false;
            }
            n nVar = (n) obj;
            return p005kotlin.jvm.internal.s.g(this.f35662a, nVar.f35662a) && p005kotlin.jvm.internal.s.g(this.f35663b, nVar.f35663b);
        }

        public final int hashCode() {
            return this.f35663b.hashCode() + (this.f35662a.hashCode() * 31);
        }

        public final String toString() {
            return fb1.c.o("ManageGearPhotos(gearId=", this.f35662a, ", photos=", this.f35663b, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i14) {
            parcel.getClass();
            parcel.writeString(this.f35662a);
            Iterator itE = kg.f.e(this.f35663b, parcel);
            while (itE.hasNext()) {
                parcel.writeParcelable((Parcelable) itE.next(), i14);
            }
        }

        /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.gear.presentation.navigation.GearRoute$n$b, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/gear/presentation/navigation/GearRoute$n$b;", "", "<init>", "()V", "Li63/c;", "Lcom/garmin/android/apps/connectmobile/gear/presentation/navigation/GearRoute$n;", "serializer", "()Li63/c;", "gcm-gear_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
                this();
            }

            public final i63.c<n> serializer() {
                return a.f35664a;
            }

            private Companion() {
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(String str, List<w> list) {
            super(null);
            str.getClass();
            list.getClass();
            this.f35662a = str;
            this.f35663b = list;
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u000e2\u00020\u0001:\u0002\u000f\u0010B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB5\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\r¨\u0006\u0011"}, d2 = {"Lcom/garmin/android/apps/connectmobile/gear/presentation/navigation/GearRoute$o;", "Lcom/garmin/android/apps/connectmobile/gear/presentation/navigation/GearRoute;", "", "Lam/x0;", "selected", "Lqk0/c;", "selectionContext", "<init>", "(Ljava/util/List;Lqk0/c;)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILjava/util/List;Lqk0/c;Lm63/u1;)V", "Companion", "a", "b", "gcm-gear_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @i63.h
    public static final /* data */ class o extends GearRoute {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<x0> f35666a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final qk0.c f35667b;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final Parcelable.Creator<o> CREATOR = new c();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final o13.l<i63.c<Object>>[] f35665c = {o13.m.a(o13.n.PUBLICATION, new tk0.a(7)), null};

        @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/gear/presentation/navigation/GearRoute.SelectActivities.$serializer", "Lm63/e0;", "Lcom/garmin/android/apps/connectmobile/gear/presentation/navigation/GearRoute$o;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-gear_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        @o13.e
        public static final /* synthetic */ class a implements e0<o> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f35668a;
            private static final e descriptor;

            static {
                a aVar = new a();
                f35668a = aVar;
                m1 m1Var = new m1("com.garmin.android.apps.connectmobile.gear.presentation.navigation.GearRoute.SelectActivities", aVar, 2);
                m1Var.j("selected", false);
                m1Var.j("selectionContext", false);
                descriptor = m1Var;
            }

            private a() {
            }

            @Override // m63.e0
            public final i63.c<?>[] childSerializers() {
                return new i63.c[]{o.f35665c[0].getValue(), qk0.c.a.f145085a};
            }

            @Override // i63.b
            public final Object deserialize(l63.e eVar) {
                eVar.getClass();
                e eVar2 = descriptor;
                l63.c cVarC = eVar.c(eVar2);
                o13.l<i63.c<Object>>[] lVarArr = o.f35665c;
                int i14 = l63.c.f110557a;
                u1 u1Var = null;
                boolean z14 = true;
                int i15 = 0;
                List list = null;
                qk0.c cVar = null;
                while (z14) {
                    int iE = cVarC.e(eVar2);
                    if (iE == -1) {
                        z14 = false;
                    } else if (iE == 0) {
                        list = (List) cVarC.l(eVar2, 0, lVarArr[0].getValue(), list);
                        i15 |= 1;
                    } else {
                        if (iE != 1) {
                            hb.a.o(iE);
                            return null;
                        }
                        cVar = (qk0.c) cVarC.l(eVar2, 1, qk0.c.a.f145085a, cVar);
                        i15 |= 2;
                    }
                }
                cVarC.b(eVar2);
                return new o(i15, list, cVar, u1Var);
            }

            @Override // i63.i, i63.b
            /* JADX INFO: renamed from: getDescriptor */
            public final e getF158591b() {
                return descriptor;
            }

            @Override // i63.i
            public final void serialize(l63.f fVar, Object obj) {
                o oVar = (o) obj;
                oVar.getClass();
                e eVar = descriptor;
                l63.d dVarC = fVar.c(eVar);
                GearRoute.write$Self(oVar, dVarC, eVar);
                dVarC.e(eVar, 0, o.f35665c[0].getValue(), oVar.f35666a);
                dVarC.e(eVar, 1, qk0.c.a.f145085a, oVar.f35667b);
                dVarC.b(eVar);
            }
        }

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class c implements Parcelable.Creator<o> {
            @Override // android.os.Parcelable.Creator
            public final o createFromParcel(Parcel parcel) {
                parcel.getClass();
                int i14 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i14);
                int iD = 0;
                while (iD != i14) {
                    iD = u0.d(o.class, parcel, arrayList, iD, 1);
                }
                return new o(arrayList, qk0.c.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final o[] newArray(int i14) {
                return new o[i14];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ o(int i14, List list, qk0.c cVar, u1 u1Var) {
            super(i14, u1Var);
            if (3 != (i14 & 3)) {
                k1.h(i14, 3, a.f35668a.getF158591b());
                throw null;
            }
            this.f35666a = list;
            this.f35667b = cVar;
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
            return p005kotlin.jvm.internal.s.g(this.f35666a, oVar.f35666a) && p005kotlin.jvm.internal.s.g(this.f35667b, oVar.f35667b);
        }

        public final int hashCode() {
            return this.f35667b.hashCode() + (this.f35666a.hashCode() * 31);
        }

        public final String toString() {
            return "SelectActivities(selected=" + this.f35666a + ", selectionContext=" + this.f35667b + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i14) {
            parcel.getClass();
            Iterator itE = kg.f.e(this.f35666a, parcel);
            while (itE.hasNext()) {
                parcel.writeParcelable((Parcelable) itE.next(), i14);
            }
            this.f35667b.writeToParcel(parcel, i14);
        }

        /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.gear.presentation.navigation.GearRoute$o$b, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/gear/presentation/navigation/GearRoute$o$b;", "", "<init>", "()V", "Li63/c;", "Lcom/garmin/android/apps/connectmobile/gear/presentation/navigation/GearRoute$o;", "serializer", "()Li63/c;", "gcm-gear_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
                this();
            }

            public final i63.c<o> serializer() {
                return a.f35668a;
            }

            private Companion() {
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public o(List<? extends x0> list, qk0.c cVar) {
            super(null);
            list.getClass();
            cVar.getClass();
            this.f35666a = list;
            this.f35667b = cVar;
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00102\u00020\u0001:\u0002\u0011\u0012B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nBA\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000f¨\u0006\u0013"}, d2 = {"Lcom/garmin/android/apps/connectmobile/gear/presentation/navigation/GearRoute$p;", "Lcom/garmin/android/apps/connectmobile/gear/presentation/navigation/GearRoute;", "Lc80/u;", "gearType", "", "selectedBrand", "selectedModel", "", "returnToManualEntry", "<init>", "(Lc80/u;Ljava/lang/String;Ljava/lang/String;Z)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILc80/u;Ljava/lang/String;Ljava/lang/String;ZLm63/u1;)V", "Companion", "a", "b", "gcm-gear_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @i63.h
    public static final /* data */ class p extends GearRoute {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final u f35670a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f35671b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f35672c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f35673d;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final Parcelable.Creator<p> CREATOR = new c();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final o13.l<i63.c<Object>>[] f35669e = {o13.m.a(o13.n.PUBLICATION, new tk0.a(8)), null, null, null};

        @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/gear/presentation/navigation/GearRoute.SelectGearBrand.$serializer", "Lm63/e0;", "Lcom/garmin/android/apps/connectmobile/gear/presentation/navigation/GearRoute$p;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-gear_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        @o13.e
        public static final /* synthetic */ class a implements e0<p> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f35674a;
            private static final e descriptor;

            static {
                a aVar = new a();
                f35674a = aVar;
                m1 m1Var = new m1("com.garmin.android.apps.connectmobile.gear.presentation.navigation.GearRoute.SelectGearBrand", aVar, 4);
                m1Var.j("gearType", false);
                m1Var.j("selectedBrand", false);
                m1Var.j("selectedModel", false);
                m1Var.j("returnToManualEntry", true);
                descriptor = m1Var;
            }

            private a() {
            }

            @Override // m63.e0
            public final i63.c<?>[] childSerializers() {
                y1 y1Var = y1.f117048a;
                return new i63.c[]{p.f35669e[0].getValue(), j63.a.d(y1Var), j63.a.d(y1Var), m63.g.f116948a};
            }

            @Override // i63.b
            public final Object deserialize(l63.e eVar) {
                eVar.getClass();
                e eVar2 = descriptor;
                l63.c cVarC = eVar.c(eVar2);
                o13.l<i63.c<Object>>[] lVarArr = p.f35669e;
                int i14 = l63.c.f110557a;
                boolean z14 = true;
                int i15 = 0;
                boolean zG = false;
                u uVar = null;
                String str = null;
                String str2 = null;
                while (z14) {
                    int iE = cVarC.e(eVar2);
                    if (iE == -1) {
                        z14 = false;
                    } else if (iE == 0) {
                        uVar = (u) cVarC.l(eVar2, 0, lVarArr[0].getValue(), uVar);
                        i15 |= 1;
                    } else if (iE == 1) {
                        str = (String) cVarC.v(eVar2, 1, y1.f117048a, str);
                        i15 |= 2;
                    } else if (iE == 2) {
                        str2 = (String) cVarC.v(eVar2, 2, y1.f117048a, str2);
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
                return new p(i15, uVar, str, str2, zG, (u1) null);
            }

            @Override // i63.i, i63.b
            /* JADX INFO: renamed from: getDescriptor */
            public final e getF158591b() {
                return descriptor;
            }

            @Override // i63.i
            public final void serialize(l63.f fVar, Object obj) {
                p pVar = (p) obj;
                pVar.getClass();
                e eVar = descriptor;
                l63.d dVarC = fVar.c(eVar);
                GearRoute.write$Self(pVar, dVarC, eVar);
                i63.c<Object> value = p.f35669e[0].getValue();
                u uVar = pVar.f35670a;
                boolean z14 = pVar.f35673d;
                dVarC.e(eVar, 0, value, uVar);
                y1 y1Var = y1.f117048a;
                dVarC.d(eVar, 1, y1Var, pVar.f35671b);
                dVarC.d(eVar, 2, y1Var, pVar.f35672c);
                if (dVarC.C(eVar) || z14) {
                    dVarC.n(eVar, 3, z14);
                }
                dVarC.b(eVar);
            }
        }

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class c implements Parcelable.Creator<p> {
            @Override // android.os.Parcelable.Creator
            public final p createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new p(u.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final p[] newArray(int i14) {
                return new p[i14];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ p(int i14, u uVar, String str, String str2, boolean z14, u1 u1Var) {
            super(i14, u1Var);
            if (7 != (i14 & 7)) {
                k1.h(i14, 7, a.f35674a.getF158591b());
                throw null;
            }
            this.f35670a = uVar;
            this.f35671b = str;
            this.f35672c = str2;
            if ((i14 & 8) == 0) {
                this.f35673d = false;
            } else {
                this.f35673d = z14;
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
            return this.f35670a == pVar.f35670a && p005kotlin.jvm.internal.s.g(this.f35671b, pVar.f35671b) && p005kotlin.jvm.internal.s.g(this.f35672c, pVar.f35672c) && this.f35673d == pVar.f35673d;
        }

        public final int hashCode() {
            int iHashCode = this.f35670a.hashCode() * 31;
            String str = this.f35671b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f35672c;
            return Boolean.hashCode(this.f35673d) + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder sb3 = new StringBuilder("SelectGearBrand(gearType=");
            sb3.append(this.f35670a);
            sb3.append(", selectedBrand=");
            sb3.append(this.f35671b);
            sb3.append(", selectedModel=");
            return am.j.n(this.f35672c, ", returnToManualEntry=", ")", sb3, this.f35673d);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i14) {
            parcel.getClass();
            parcel.writeString(this.f35670a.name());
            parcel.writeString(this.f35671b);
            parcel.writeString(this.f35672c);
            parcel.writeInt(this.f35673d ? 1 : 0);
        }

        /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.gear.presentation.navigation.GearRoute$p$b, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/gear/presentation/navigation/GearRoute$p$b;", "", "<init>", "()V", "Li63/c;", "Lcom/garmin/android/apps/connectmobile/gear/presentation/navigation/GearRoute$p;", "serializer", "()Li63/c;", "gcm-gear_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
                this();
            }

            public final i63.c<p> serializer() {
                return a.f35674a;
            }

            private Companion() {
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(u uVar, String str, String str2, boolean z14) {
            super(null);
            uVar.getClass();
            this.f35670a = uVar;
            this.f35671b = str;
            this.f35672c = str2;
            this.f35673d = z14;
        }

        public /* synthetic */ p(u uVar, String str, String str2, boolean z14, int i14, p005kotlin.jvm.internal.j jVar) {
            this(uVar, str, str2, (i14 & 8) != 0 ? false : z14);
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00102\u00020\u0001:\u0002\u0011\u0012B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nBA\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000f¨\u0006\u0013"}, d2 = {"Lcom/garmin/android/apps/connectmobile/gear/presentation/navigation/GearRoute$q;", "Lcom/garmin/android/apps/connectmobile/gear/presentation/navigation/GearRoute;", "Lc80/u;", "gearType", "", "brandName", "selectedModel", "", "returnToManualEntry", "<init>", "(Lc80/u;Ljava/lang/String;Ljava/lang/String;Z)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILc80/u;Ljava/lang/String;Ljava/lang/String;ZLm63/u1;)V", "Companion", "a", "b", "gcm-gear_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @i63.h
    public static final /* data */ class q extends GearRoute {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final u f35676a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f35677b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f35678c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f35679d;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final Parcelable.Creator<q> CREATOR = new c();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final o13.l<i63.c<Object>>[] f35675e = {o13.m.a(o13.n.PUBLICATION, new tk0.a(9)), null, null, null};

        @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/gear/presentation/navigation/GearRoute.SelectGearModel.$serializer", "Lm63/e0;", "Lcom/garmin/android/apps/connectmobile/gear/presentation/navigation/GearRoute$q;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-gear_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        @o13.e
        public static final /* synthetic */ class a implements e0<q> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f35680a;
            private static final e descriptor;

            static {
                a aVar = new a();
                f35680a = aVar;
                m1 m1Var = new m1("com.garmin.android.apps.connectmobile.gear.presentation.navigation.GearRoute.SelectGearModel", aVar, 4);
                m1Var.j("gearType", false);
                m1Var.j("brandName", false);
                m1Var.j("selectedModel", false);
                m1Var.j("returnToManualEntry", true);
                descriptor = m1Var;
            }

            private a() {
            }

            @Override // m63.e0
            public final i63.c<?>[] childSerializers() {
                y1 y1Var = y1.f117048a;
                return new i63.c[]{q.f35675e[0].getValue(), y1Var, j63.a.d(y1Var), m63.g.f116948a};
            }

            @Override // i63.b
            public final Object deserialize(l63.e eVar) {
                eVar.getClass();
                e eVar2 = descriptor;
                l63.c cVarC = eVar.c(eVar2);
                o13.l<i63.c<Object>>[] lVarArr = q.f35675e;
                int i14 = l63.c.f110557a;
                boolean z14 = true;
                int i15 = 0;
                boolean zG = false;
                u uVar = null;
                String strR = null;
                String str = null;
                while (z14) {
                    int iE = cVarC.e(eVar2);
                    if (iE == -1) {
                        z14 = false;
                    } else if (iE == 0) {
                        uVar = (u) cVarC.l(eVar2, 0, lVarArr[0].getValue(), uVar);
                        i15 |= 1;
                    } else if (iE == 1) {
                        strR = cVarC.r(eVar2, 1);
                        i15 |= 2;
                    } else if (iE == 2) {
                        str = (String) cVarC.v(eVar2, 2, y1.f117048a, str);
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
                return new q(i15, uVar, strR, str, zG, (u1) null);
            }

            @Override // i63.i, i63.b
            /* JADX INFO: renamed from: getDescriptor */
            public final e getF158591b() {
                return descriptor;
            }

            @Override // i63.i
            public final void serialize(l63.f fVar, Object obj) {
                q qVar = (q) obj;
                qVar.getClass();
                e eVar = descriptor;
                l63.d dVarC = fVar.c(eVar);
                GearRoute.write$Self(qVar, dVarC, eVar);
                i63.c<Object> value = q.f35675e[0].getValue();
                u uVar = qVar.f35676a;
                boolean z14 = qVar.f35679d;
                dVarC.e(eVar, 0, value, uVar);
                dVarC.k(eVar, 1, qVar.f35677b);
                dVarC.d(eVar, 2, y1.f117048a, qVar.f35678c);
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
                return new q(u.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final q[] newArray(int i14) {
                return new q[i14];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ q(int i14, u uVar, String str, String str2, boolean z14, u1 u1Var) {
            super(i14, u1Var);
            if (7 != (i14 & 7)) {
                k1.h(i14, 7, a.f35680a.getF158591b());
                throw null;
            }
            this.f35676a = uVar;
            this.f35677b = str;
            this.f35678c = str2;
            if ((i14 & 8) == 0) {
                this.f35679d = false;
            } else {
                this.f35679d = z14;
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
            return this.f35676a == qVar.f35676a && p005kotlin.jvm.internal.s.g(this.f35677b, qVar.f35677b) && p005kotlin.jvm.internal.s.g(this.f35678c, qVar.f35678c) && this.f35679d == qVar.f35679d;
        }

        public final int hashCode() {
            int iJ = wr.g.j(this.f35676a.hashCode() * 31, 31, this.f35677b);
            String str = this.f35678c;
            return Boolean.hashCode(this.f35679d) + ((iJ + (str == null ? 0 : str.hashCode())) * 31);
        }

        public final String toString() {
            StringBuilder sb3 = new StringBuilder("SelectGearModel(gearType=");
            sb3.append(this.f35676a);
            sb3.append(", brandName=");
            sb3.append(this.f35677b);
            sb3.append(", selectedModel=");
            return am.j.n(this.f35678c, ", returnToManualEntry=", ")", sb3, this.f35679d);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i14) {
            parcel.getClass();
            parcel.writeString(this.f35676a.name());
            parcel.writeString(this.f35677b);
            parcel.writeString(this.f35678c);
            parcel.writeInt(this.f35679d ? 1 : 0);
        }

        /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.gear.presentation.navigation.GearRoute$q$b, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/gear/presentation/navigation/GearRoute$q$b;", "", "<init>", "()V", "Li63/c;", "Lcom/garmin/android/apps/connectmobile/gear/presentation/navigation/GearRoute$q;", "serializer", "()Li63/c;", "gcm-gear_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
                this();
            }

            public final i63.c<q> serializer() {
                return a.f35680a;
            }

            private Companion() {
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(u uVar, String str, String str2, boolean z14) {
            super(null);
            uVar.getClass();
            str.getClass();
            this.f35676a = uVar;
            this.f35677b = str;
            this.f35678c = str2;
            this.f35679d = z14;
        }

        public /* synthetic */ q(u uVar, String str, String str2, boolean z14, int i14, p005kotlin.jvm.internal.j jVar) {
            this(uVar, str, str2, (i14 & 8) != 0 ? false : z14);
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u000b2\u00020\u0001:\u0002\f\rB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B#\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/garmin/android/apps/connectmobile/gear/presentation/navigation/GearRoute$r;", "Lcom/garmin/android/apps/connectmobile/gear/presentation/navigation/GearRoute;", "", "goToDetails", "<init>", "(Z)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(IZLm63/u1;)V", "Companion", "a", "b", "gcm-gear_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @i63.h
    public static final /* data */ class r extends GearRoute {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f35681a;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final Parcelable.Creator<r> CREATOR = new c();

        @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/gear/presentation/navigation/GearRoute.SelectGearType.$serializer", "Lm63/e0;", "Lcom/garmin/android/apps/connectmobile/gear/presentation/navigation/GearRoute$r;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-gear_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        @o13.e
        public static final /* synthetic */ class a implements e0<r> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f35682a;
            private static final e descriptor;

            static {
                a aVar = new a();
                f35682a = aVar;
                m1 m1Var = new m1("com.garmin.android.apps.connectmobile.gear.presentation.navigation.GearRoute.SelectGearType", aVar, 1);
                m1Var.j("goToDetails", false);
                descriptor = m1Var;
            }

            private a() {
            }

            @Override // m63.e0
            public final i63.c<?>[] childSerializers() {
                return new i63.c[]{m63.g.f116948a};
            }

            @Override // i63.b
            public final Object deserialize(l63.e eVar) {
                eVar.getClass();
                e eVar2 = descriptor;
                l63.c cVarC = eVar.c(eVar2);
                int i14 = l63.c.f110557a;
                boolean z14 = true;
                int i15 = 0;
                boolean zG = false;
                while (true) {
                    u1 u1Var = null;
                    if (!z14) {
                        cVarC.b(eVar2);
                        return new r(i15, zG, u1Var);
                    }
                    int iE = cVarC.e(eVar2);
                    if (iE == -1) {
                        z14 = false;
                    } else {
                        if (iE != 0) {
                            hb.a.o(iE);
                            return null;
                        }
                        zG = cVarC.g(eVar2, 0);
                        i15 = 1;
                    }
                }
            }

            @Override // i63.i, i63.b
            /* JADX INFO: renamed from: getDescriptor */
            public final e getF158591b() {
                return descriptor;
            }

            @Override // i63.i
            public final void serialize(l63.f fVar, Object obj) {
                r rVar = (r) obj;
                rVar.getClass();
                e eVar = descriptor;
                l63.d dVarC = fVar.c(eVar);
                GearRoute.write$Self(rVar, dVarC, eVar);
                dVarC.n(eVar, 0, rVar.f35681a);
                dVarC.b(eVar);
            }
        }

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class c implements Parcelable.Creator<r> {
            @Override // android.os.Parcelable.Creator
            public final r createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new r(parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final r[] newArray(int i14) {
                return new r[i14];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ r(int i14, boolean z14, u1 u1Var) {
            super(i14, u1Var);
            if (1 != (i14 & 1)) {
                k1.h(i14, 1, a.f35682a.getF158591b());
                throw null;
            }
            this.f35681a = z14;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof r) && this.f35681a == ((r) obj).f35681a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f35681a);
        }

        public final String toString() {
            return com.airbnb.lottie.animation.keyframe.a.g("SelectGearType(goToDetails=", ")", this.f35681a);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i14) {
            parcel.getClass();
            parcel.writeInt(this.f35681a ? 1 : 0);
        }

        /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.gear.presentation.navigation.GearRoute$r$b, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/gear/presentation/navigation/GearRoute$r$b;", "", "<init>", "()V", "Li63/c;", "Lcom/garmin/android/apps/connectmobile/gear/presentation/navigation/GearRoute$r;", "serializer", "()Li63/c;", "gcm-gear_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
                this();
            }

            public final i63.c<r> serializer() {
                return a.f35682a;
            }

            private Companion() {
            }
        }

        public r(boolean z14) {
            super(null);
            this.f35681a = z14;
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \r2\u00020\u0001:\u0002\u000e\u000fB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/garmin/android/apps/connectmobile/gear/presentation/navigation/GearRoute$s;", "Lcom/garmin/android/apps/connectmobile/gear/presentation/navigation/GearRoute;", "", "gearUUID", "Lrk0/w0;", "screenData", "<init>", "(Ljava/lang/String;Lrk0/w0;)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILjava/lang/String;Lrk0/w0;Lm63/u1;)V", "Companion", "a", "b", "gcm-gear_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @i63.h
    public static final /* data */ class s extends GearRoute {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f35683a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final w0 f35684b;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final Parcelable.Creator<s> CREATOR = new c();

        @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/gear/presentation/navigation/GearRoute.TrackedActivities.$serializer", "Lm63/e0;", "Lcom/garmin/android/apps/connectmobile/gear/presentation/navigation/GearRoute$s;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-gear_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        @o13.e
        public static final /* synthetic */ class a implements e0<s> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f35685a;
            private static final e descriptor;

            static {
                a aVar = new a();
                f35685a = aVar;
                m1 m1Var = new m1("com.garmin.android.apps.connectmobile.gear.presentation.navigation.GearRoute.TrackedActivities", aVar, 2);
                m1Var.j("gearUUID", false);
                m1Var.j("screenData", false);
                descriptor = m1Var;
            }

            private a() {
            }

            @Override // m63.e0
            public final i63.c<?>[] childSerializers() {
                return new i63.c[]{y1.f117048a, w0.a.f153292a};
            }

            @Override // i63.b
            public final Object deserialize(l63.e eVar) {
                eVar.getClass();
                e eVar2 = descriptor;
                l63.c cVarC = eVar.c(eVar2);
                int i14 = l63.c.f110557a;
                u1 u1Var = null;
                boolean z14 = true;
                int i15 = 0;
                String strR = null;
                w0 w0Var = null;
                while (z14) {
                    int iE = cVarC.e(eVar2);
                    if (iE == -1) {
                        z14 = false;
                    } else if (iE == 0) {
                        strR = cVarC.r(eVar2, 0);
                        i15 |= 1;
                    } else {
                        if (iE != 1) {
                            hb.a.o(iE);
                            return null;
                        }
                        w0Var = (w0) cVarC.l(eVar2, 1, w0.a.f153292a, w0Var);
                        i15 |= 2;
                    }
                }
                cVarC.b(eVar2);
                return new s(i15, strR, w0Var, u1Var);
            }

            @Override // i63.i, i63.b
            /* JADX INFO: renamed from: getDescriptor */
            public final e getF158591b() {
                return descriptor;
            }

            @Override // i63.i
            public final void serialize(l63.f fVar, Object obj) {
                s sVar = (s) obj;
                sVar.getClass();
                e eVar = descriptor;
                l63.d dVarC = fVar.c(eVar);
                GearRoute.write$Self(sVar, dVarC, eVar);
                dVarC.k(eVar, 0, sVar.f35683a);
                dVarC.e(eVar, 1, w0.a.f153292a, sVar.f35684b);
                dVarC.b(eVar);
            }
        }

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class c implements Parcelable.Creator<s> {
            @Override // android.os.Parcelable.Creator
            public final s createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new s(parcel.readString(), w0.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final s[] newArray(int i14) {
                return new s[i14];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ s(int i14, String str, w0 w0Var, u1 u1Var) {
            super(i14, u1Var);
            if (3 != (i14 & 3)) {
                k1.h(i14, 3, a.f35685a.getF158591b());
                throw null;
            }
            this.f35683a = str;
            this.f35684b = w0Var;
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
            return p005kotlin.jvm.internal.s.g(this.f35683a, sVar.f35683a) && p005kotlin.jvm.internal.s.g(this.f35684b, sVar.f35684b);
        }

        public final int hashCode() {
            return this.f35684b.hashCode() + (this.f35683a.hashCode() * 31);
        }

        public final String toString() {
            return "TrackedActivities(gearUUID=" + this.f35683a + ", screenData=" + this.f35684b + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i14) {
            parcel.getClass();
            parcel.writeString(this.f35683a);
            this.f35684b.writeToParcel(parcel, i14);
        }

        /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.gear.presentation.navigation.GearRoute$s$b, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/gear/presentation/navigation/GearRoute$s$b;", "", "<init>", "()V", "Li63/c;", "Lcom/garmin/android/apps/connectmobile/gear/presentation/navigation/GearRoute$s;", "serializer", "()Li63/c;", "gcm-gear_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
                this();
            }

            public final i63.c<s> serializer() {
                return a.f35685a;
            }

            private Companion() {
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s(String str, w0 w0Var) {
            super(null);
            str.getClass();
            w0Var.getClass();
            this.f35683a = str;
            this.f35684b = w0Var;
        }
    }

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.gear.presentation.navigation.GearRoute$e, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/gear/presentation/navigation/GearRoute$e;", "", "<init>", "()V", "Li63/c;", "Lcom/garmin/android/apps/connectmobile/gear/presentation/navigation/GearRoute;", "serializer", "()Li63/c;", "gcm-gear_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public final i63.c<GearRoute> serializer() {
            return (i63.c) GearRoute.$cachedSerializer$delegate.getValue();
        }

        private Companion() {
        }
    }

    private GearRoute() {
    }

    public /* synthetic */ GearRoute(int i14, u1 u1Var) {
    }
}

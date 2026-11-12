package d90;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.room.a0;
import m63.e0;
import m63.m0;
import m63.m1;
import m63.u1;
import o13.m;
import o13.n;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \t2\u00020\u0001:\u0004\n\u000b\f\rB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003B\u001b\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0002\u0010\b\u0082\u0001\u0003\u000e\u000f\u0010¨\u0006\u0011"}, d2 = {"Ld90/c;", "Landroid/os/Parcelable;", "<init>", "()V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILm63/u1;)V", "Companion", "d", "c", "b", "a", "Ld90/c$b;", "Ld90/c$c;", "Ld90/c$d;", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@i63.h
public abstract class c implements Parcelable {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f58429a = m.a(n.PUBLICATION, new d4.h(7));

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ld90/c$b;", "Ld90/c;", "<init>", "()V", "Li63/c;", "serializer", "()Li63/c;", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @i63.h
    public static final /* data */ class b extends c {
        public static final b INSTANCE = new b();
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ Object f58430b = m.a(n.PUBLICATION, new d4.h(8));

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<b> {
            @Override // android.os.Parcelable.Creator
            public final b createFromParcel(Parcel parcel) {
                parcel.getClass();
                parcel.readInt();
                return b.INSTANCE;
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

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 912443139;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
        public final i63.c<b> serializer() {
            return (i63.c) f58430b.getValue();
        }

        public final String toString() {
            return "CustomVivofit3";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i14) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ld90/c$d;", "Ld90/c;", "<init>", "()V", "Li63/c;", "serializer", "()Li63/c;", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @i63.h
    public static final /* data */ class d extends c {
        public static final d INSTANCE = new d();
        public static final Parcelable.Creator<d> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ Object f58433b = m.a(n.PUBLICATION, new d4.h(9));

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<d> {
            @Override // android.os.Parcelable.Creator
            public final d createFromParcel(Parcel parcel) {
                parcel.getClass();
                parcel.readInt();
                return d.INSTANCE;
            }

            @Override // android.os.Parcelable.Creator
            public final d[] newArray(int i14) {
                return new d[i14];
            }
        }

        private d() {
            super(null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -466601570;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
        public final i63.c<d> serializer() {
            return (i63.c) f58433b.getValue();
        }

        public final String toString() {
            return "DeviceServerImage";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i14) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    public /* synthetic */ c(p005kotlin.jvm.internal.j jVar) {
        this();
    }

    /* JADX INFO: renamed from: d90.c$c, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \n2\u00020\u0001:\u0002\u000b\fB\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0004\u0010\t¨\u0006\r"}, d2 = {"Ld90/c$c;", "Ld90/c;", "", "imageRes", "<init>", "(Ljava/lang/Integer;)V", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILjava/lang/Integer;Lm63/u1;)V", "Companion", "a", "b", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @i63.h
    public static final /* data */ class C1246c extends c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Integer f58431b;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final Parcelable.Creator<C1246c> CREATOR = new C1247c();

        /* JADX INFO: renamed from: d90.c$c$a */
        @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/device/setup/domain/config/model/DeviceScanInstructionsType.DeviceLocalImage.$serializer", "Lm63/e0;", "Ld90/c$c;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        @o13.e
        public static final /* synthetic */ class a implements e0<C1246c> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f58432a;
            private static final k63.e descriptor;

            static {
                a aVar = new a();
                f58432a = aVar;
                m1 m1Var = new m1("com.garmin.android.apps.connectmobile.device.setup.domain.config.model.DeviceScanInstructionsType.DeviceLocalImage", aVar, 1);
                m1Var.j("imageRes", true);
                descriptor = m1Var;
            }

            private a() {
            }

            @Override // m63.e0
            public final i63.c<?>[] childSerializers() {
                return new i63.c[]{j63.a.d(m0.f116981a)};
            }

            @Override // i63.b
            public final Object deserialize(l63.e eVar) {
                eVar.getClass();
                k63.e eVar2 = descriptor;
                l63.c cVarC = eVar.c(eVar2);
                int i14 = l63.c.f110557a;
                u1 u1Var = null;
                boolean z14 = true;
                int i15 = 0;
                Integer num = null;
                while (z14) {
                    int iE = cVarC.e(eVar2);
                    if (iE == -1) {
                        z14 = false;
                    } else {
                        if (iE != 0) {
                            hb.a.o(iE);
                            return null;
                        }
                        num = (Integer) cVarC.v(eVar2, 0, m0.f116981a, num);
                        i15 = 1;
                    }
                }
                cVarC.b(eVar2);
                return new C1246c(i15, num, u1Var);
            }

            @Override // i63.i, i63.b
            /* JADX INFO: renamed from: getDescriptor */
            public final k63.e getF158591b() {
                return descriptor;
            }

            @Override // i63.i
            public final void serialize(l63.f fVar, Object obj) {
                C1246c c1246c = (C1246c) obj;
                c1246c.getClass();
                Integer num = c1246c.f58431b;
                k63.e eVar = descriptor;
                l63.d dVarC = fVar.c(eVar);
                if (dVarC.C(eVar) || num != null) {
                    dVarC.d(eVar, 0, m0.f116981a, num);
                }
                dVarC.b(eVar);
            }
        }

        /* JADX INFO: renamed from: d90.c$c$c, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class C1247c implements Parcelable.Creator<C1246c> {
            @Override // android.os.Parcelable.Creator
            public final C1246c createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new C1246c(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
            }

            @Override // android.os.Parcelable.Creator
            public final C1246c[] newArray(int i14) {
                return new C1246c[i14];
            }
        }

        public /* synthetic */ C1246c(int i14, Integer num, u1 u1Var) {
            super(i14, u1Var);
            if ((i14 & 1) == 0) {
                this.f58431b = null;
            } else {
                this.f58431b = num;
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
            return (obj instanceof C1246c) && s.g(this.f58431b, ((C1246c) obj).f58431b);
        }

        public final int hashCode() {
            Integer num = this.f58431b;
            if (num == null) {
                return 0;
            }
            return num.hashCode();
        }

        public final String toString() {
            return a0.i("DeviceLocalImage(imageRes=", this.f58431b, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i14) {
            parcel.getClass();
            Integer num = this.f58431b;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                kg.f.k(parcel, 1, num);
            }
        }

        /* JADX INFO: renamed from: d90.c$c$b, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ld90/c$c$b;", "", "<init>", "()V", "Li63/c;", "Ld90/c$c;", "serializer", "()Li63/c;", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
                this();
            }

            public final i63.c<C1246c> serializer() {
                return a.f58432a;
            }

            private Companion() {
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public C1246c() {
            this((Integer) null, 1, (p005kotlin.jvm.internal.j) (0 == true ? 1 : 0));
        }

        public C1246c(Integer num) {
            super(null);
            this.f58431b = num;
        }

        public /* synthetic */ C1246c(Integer num, int i14, p005kotlin.jvm.internal.j jVar) {
            this((i14 & 1) != 0 ? null : num);
        }
    }

    /* JADX INFO: renamed from: d90.c$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ld90/c$a;", "", "<init>", "()V", "Li63/c;", "Ld90/c;", "serializer", "()Li63/c;", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
        public final i63.c<c> serializer() {
            return (i63.c) c.f58429a.getValue();
        }

        private Companion() {
        }
    }

    private c() {
    }

    public /* synthetic */ c(int i14, u1 u1Var) {
    }
}

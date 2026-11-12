package oz0;

import android.os.Parcel;
import android.os.Parcelable;
import m63.e0;
import m63.k1;
import m63.m1;
import m63.u1;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u000f2\u00020\u0001:\u0002\u0010\u0011B9\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tBM\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000e¨\u0006\u0012"}, d2 = {"Loz0/g;", "Landroid/os/Parcelable;", "Loz0/f;", "default", "medium", "high", "standard", "maxres", "<init>", "(Loz0/f;Loz0/f;Loz0/f;Loz0/f;Loz0/f;)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILoz0/f;Loz0/f;Loz0/f;Loz0/f;Loz0/f;Lm63/u1;)V", "Companion", "a", "b", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@i63.h
public final /* data */ class g implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f134473a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f134474b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f134475c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f f134476d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final f f134477e;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<g> CREATOR = new c();

    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/newsfeed/model/Thumbnails.$serializer", "Lm63/e0;", "Loz0/g;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @o13.e
    public static final /* synthetic */ class a implements e0<g> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f134478a;
        private static final k63.e descriptor;

        static {
            a aVar = new a();
            f134478a = aVar;
            m1 m1Var = new m1("com.garmin.android.apps.connectmobile.newsfeed.model.Thumbnails", aVar, 5);
            m1Var.j("default", false);
            m1Var.j("medium", false);
            m1Var.j("high", false);
            m1Var.j("standard", false);
            m1Var.j("maxres", false);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // m63.e0
        public final i63.c<?>[] childSerializers() {
            f.a aVar = f.a.f134472a;
            return new i63.c[]{j63.a.d(aVar), j63.a.d(aVar), j63.a.d(aVar), j63.a.d(aVar), j63.a.d(aVar)};
        }

        @Override // i63.b
        public final Object deserialize(l63.e eVar) {
            eVar.getClass();
            k63.e eVar2 = descriptor;
            l63.c cVarC = eVar.c(eVar2);
            int i14 = l63.c.f110557a;
            boolean z14 = true;
            int i15 = 0;
            f fVar = null;
            f fVar2 = null;
            f fVar3 = null;
            f fVar4 = null;
            f fVar5 = null;
            while (z14) {
                int iE = cVarC.e(eVar2);
                if (iE == -1) {
                    z14 = false;
                } else if (iE == 0) {
                    fVar = (f) cVarC.v(eVar2, 0, f.a.f134472a, fVar);
                    i15 |= 1;
                } else if (iE == 1) {
                    fVar2 = (f) cVarC.v(eVar2, 1, f.a.f134472a, fVar2);
                    i15 |= 2;
                } else if (iE == 2) {
                    fVar3 = (f) cVarC.v(eVar2, 2, f.a.f134472a, fVar3);
                    i15 |= 4;
                } else if (iE == 3) {
                    fVar4 = (f) cVarC.v(eVar2, 3, f.a.f134472a, fVar4);
                    i15 |= 8;
                } else {
                    if (iE != 4) {
                        hb.a.o(iE);
                        return null;
                    }
                    fVar5 = (f) cVarC.v(eVar2, 4, f.a.f134472a, fVar5);
                    i15 |= 16;
                }
            }
            cVarC.b(eVar2);
            return new g(i15, fVar, fVar2, fVar3, fVar4, fVar5, null);
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
            f.a aVar = f.a.f134472a;
            dVarC.d(eVar, 0, aVar, gVar.f134473a);
            dVarC.d(eVar, 1, aVar, gVar.f134474b);
            dVarC.d(eVar, 2, aVar, gVar.f134475c);
            dVarC.d(eVar, 3, aVar, gVar.f134476d);
            dVarC.d(eVar, 4, aVar, gVar.f134477e);
            dVarC.b(eVar);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements Parcelable.Creator<g> {
        @Override // android.os.Parcelable.Creator
        public final g createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new g(parcel.readInt() == 0 ? null : f.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : f.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : f.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : f.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? f.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final g[] newArray(int i14) {
            return new g[i14];
        }
    }

    public /* synthetic */ g(int i14, f fVar, f fVar2, f fVar3, f fVar4, f fVar5, u1 u1Var) {
        if (31 != (i14 & 31)) {
            k1.h(i14, 31, a.f134478a.getF158591b());
            throw null;
        }
        this.f134473a = fVar;
        this.f134474b = fVar2;
        this.f134475c = fVar3;
        this.f134476d = fVar4;
        this.f134477e = fVar5;
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
        return s.g(this.f134473a, gVar.f134473a) && s.g(this.f134474b, gVar.f134474b) && s.g(this.f134475c, gVar.f134475c) && s.g(this.f134476d, gVar.f134476d) && s.g(this.f134477e, gVar.f134477e);
    }

    public final int hashCode() {
        f fVar = this.f134473a;
        int iHashCode = (fVar == null ? 0 : fVar.hashCode()) * 31;
        f fVar2 = this.f134474b;
        int iHashCode2 = (iHashCode + (fVar2 == null ? 0 : fVar2.hashCode())) * 31;
        f fVar3 = this.f134475c;
        int iHashCode3 = (iHashCode2 + (fVar3 == null ? 0 : fVar3.hashCode())) * 31;
        f fVar4 = this.f134476d;
        int iHashCode4 = (iHashCode3 + (fVar4 == null ? 0 : fVar4.hashCode())) * 31;
        f fVar5 = this.f134477e;
        return iHashCode4 + (fVar5 != null ? fVar5.hashCode() : 0);
    }

    public final String toString() {
        return "Thumbnails(default=" + this.f134473a + ", medium=" + this.f134474b + ", high=" + this.f134475c + ", standard=" + this.f134476d + ", maxres=" + this.f134477e + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        f fVar = this.f134473a;
        if (fVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            fVar.writeToParcel(parcel, i14);
        }
        f fVar2 = this.f134474b;
        if (fVar2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            fVar2.writeToParcel(parcel, i14);
        }
        f fVar3 = this.f134475c;
        if (fVar3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            fVar3.writeToParcel(parcel, i14);
        }
        f fVar4 = this.f134476d;
        if (fVar4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            fVar4.writeToParcel(parcel, i14);
        }
        f fVar5 = this.f134477e;
        if (fVar5 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            fVar5.writeToParcel(parcel, i14);
        }
    }

    /* JADX INFO: renamed from: oz0.g$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Loz0/g$b;", "", "<init>", "()V", "Li63/c;", "Loz0/g;", "serializer", "()Li63/c;", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(j jVar) {
            this();
        }

        public final i63.c<g> serializer() {
            return a.f134478a;
        }

        private Companion() {
        }
    }

    public g(f fVar, f fVar2, f fVar3, f fVar4, f fVar5) {
        this.f134473a = fVar;
        this.f134474b = fVar2;
        this.f134475c = fVar3;
        this.f134476d = fVar4;
        this.f134477e = fVar5;
    }
}

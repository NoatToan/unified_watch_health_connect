package s21;

import android.os.Parcel;
import android.os.Parcelable;
import m63.k1;
import m63.m1;
import m63.u1;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \r2\u00020\u0001:\u0002\u000e\u000fB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007B9\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\f¨\u0006\u0010"}, d2 = {"Ls21/g;", "Landroid/os/Parcelable;", "Ls21/f;", "protein", "fat", "carbs", "<init>", "(Ls21/f;Ls21/f;Ls21/f;)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILs21/f;Ls21/f;Ls21/f;Lm63/u1;)V", "Companion", "a", "b", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@i63.h
public final /* data */ class g implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f156115a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f156116b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f156117c;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<g> CREATOR = new c();

    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/nutrition/presentation/setup/model/MacronutrientsGoals.$serializer", "Lm63/e0;", "Ls21/g;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @o13.e
    public static final /* synthetic */ class a implements m63.e0<g> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f156118a;
        private static final k63.e descriptor;

        static {
            a aVar = new a();
            f156118a = aVar;
            m1 m1Var = new m1("com.garmin.android.apps.connectmobile.nutrition.presentation.setup.model.MacronutrientsGoals", aVar, 3);
            m1Var.j("protein", false);
            m1Var.j("fat", false);
            m1Var.j("carbs", false);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // m63.e0
        public final i63.c<?>[] childSerializers() {
            f.a aVar = f.a.f156106a;
            return new i63.c[]{aVar, aVar, aVar};
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
            while (z14) {
                int iE = cVarC.e(eVar2);
                if (iE == -1) {
                    z14 = false;
                } else if (iE == 0) {
                    fVar = (f) cVarC.l(eVar2, 0, f.a.f156106a, fVar);
                    i15 |= 1;
                } else if (iE == 1) {
                    fVar2 = (f) cVarC.l(eVar2, 1, f.a.f156106a, fVar2);
                    i15 |= 2;
                } else {
                    if (iE != 2) {
                        hb.a.o(iE);
                        return null;
                    }
                    fVar3 = (f) cVarC.l(eVar2, 2, f.a.f156106a, fVar3);
                    i15 |= 4;
                }
            }
            cVarC.b(eVar2);
            return new g(i15, fVar, fVar2, fVar3, null);
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
            f.a aVar = f.a.f156106a;
            dVarC.e(eVar, 0, aVar, gVar.f156115a);
            dVarC.e(eVar, 1, aVar, gVar.f156116b);
            dVarC.e(eVar, 2, aVar, gVar.f156117c);
            dVarC.b(eVar);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements Parcelable.Creator<g> {
        @Override // android.os.Parcelable.Creator
        public final g createFromParcel(Parcel parcel) {
            parcel.getClass();
            Parcelable.Creator<f> creator = f.CREATOR;
            return new g(creator.createFromParcel(parcel), creator.createFromParcel(parcel), creator.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final g[] newArray(int i14) {
            return new g[i14];
        }
    }

    public /* synthetic */ g(int i14, f fVar, f fVar2, f fVar3, u1 u1Var) {
        if (7 != (i14 & 7)) {
            k1.h(i14, 7, a.f156118a.getF158591b());
            throw null;
        }
        this.f156115a = fVar;
        this.f156116b = fVar2;
        this.f156117c = fVar3;
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
        return p005kotlin.jvm.internal.s.g(this.f156115a, gVar.f156115a) && p005kotlin.jvm.internal.s.g(this.f156116b, gVar.f156116b) && p005kotlin.jvm.internal.s.g(this.f156117c, gVar.f156117c);
    }

    public final int hashCode() {
        return this.f156117c.hashCode() + ((this.f156116b.hashCode() + (this.f156115a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "MacronutrientsGoals(protein=" + this.f156115a + ", fat=" + this.f156116b + ", carbs=" + this.f156117c + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        this.f156115a.writeToParcel(parcel, i14);
        this.f156116b.writeToParcel(parcel, i14);
        this.f156117c.writeToParcel(parcel, i14);
    }

    /* JADX INFO: renamed from: s21.g$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ls21/g$b;", "", "<init>", "()V", "Li63/c;", "Ls21/g;", "serializer", "()Li63/c;", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public final i63.c<g> serializer() {
            return a.f156118a;
        }

        private Companion() {
        }
    }

    public g(f fVar, f fVar2, f fVar3) {
        fVar.getClass();
        fVar2.getClass();
        fVar3.getClass();
        this.f156115a = fVar;
        this.f156116b = fVar2;
        this.f156117c = fVar3;
    }
}

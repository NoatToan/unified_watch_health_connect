package bg2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import m63.e0;
import m63.m1;
import m63.u1;
import m63.y1;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u0000 \u00132\u00020\u0001:\u0002\f\u000eB\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR$\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\r\u001a\u0004\b\u0010\u0010\u000f\"\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lbg2/d;", "Landroid/os/Parcelable;", "", "instructions", "stepImage", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lm63/u1;)V", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "getStepImage", "setStepImage", "(Ljava/lang/String;)V", "Companion", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
@i63.h
public final /* data */ class d implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("instructions")
    private final String instructions;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("stepImage")
    private String stepImage;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<d> CREATOR = new c();

    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/livesessionview/msnworkouts/ExerciseStepDTO.$serializer", "Lm63/e0;", "Lbg2/d;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @o13.e
    public static final /* synthetic */ class a implements e0<d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f17859a;
        private static final k63.e descriptor;

        static {
            a aVar = new a();
            f17859a = aVar;
            m1 m1Var = new m1("com.garmin.android.livesessionview.msnworkouts.ExerciseStepDTO", aVar, 2);
            m1Var.j("instructions", true);
            m1Var.j("stepImage", true);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // m63.e0
        public final i63.c<?>[] childSerializers() {
            y1 y1Var = y1.f117048a;
            return new i63.c[]{j63.a.d(y1Var), j63.a.d(y1Var)};
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
            String str = null;
            String str2 = null;
            while (z14) {
                int iE = cVarC.e(eVar2);
                if (iE == -1) {
                    z14 = false;
                } else if (iE == 0) {
                    str = (String) cVarC.v(eVar2, 0, y1.f117048a, str);
                    i15 |= 1;
                } else {
                    if (iE != 1) {
                        hb.a.o(iE);
                        return null;
                    }
                    str2 = (String) cVarC.v(eVar2, 1, y1.f117048a, str2);
                    i15 |= 2;
                }
            }
            cVarC.b(eVar2);
            return new d(i15, str, str2, u1Var);
        }

        @Override // i63.i, i63.b
        /* JADX INFO: renamed from: getDescriptor */
        public final k63.e getF158591b() {
            return descriptor;
        }

        @Override // i63.i
        public final void serialize(l63.f fVar, Object obj) {
            d dVar = (d) obj;
            dVar.getClass();
            k63.e eVar = descriptor;
            l63.d dVarC = fVar.c(eVar);
            d.d(dVar, dVarC, eVar);
            dVarC.b(eVar);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements Parcelable.Creator<d> {
        @Override // android.os.Parcelable.Creator
        public final d createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new d(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final d[] newArray(int i14) {
            return new d[i14];
        }
    }

    public /* synthetic */ d(int i14, String str, String str2, u1 u1Var) {
        if ((i14 & 1) == 0) {
            this.instructions = null;
        } else {
            this.instructions = str;
        }
        if ((i14 & 2) == 0) {
            this.stepImage = null;
        } else {
            this.stepImage = str2;
        }
    }

    public static final /* synthetic */ void d(d dVar, l63.d dVar2, k63.e eVar) {
        if (dVar2.C(eVar) || dVar.instructions != null) {
            dVar2.d(eVar, 0, y1.f117048a, dVar.instructions);
        }
        if (!dVar2.C(eVar) && dVar.stepImage == null) {
            return;
        }
        dVar2.d(eVar, 1, y1.f117048a, dVar.stepImage);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getInstructions() {
        return this.instructions;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return s.g(this.instructions, dVar.instructions) && s.g(this.stepImage, dVar.stepImage);
    }

    public final int hashCode() {
        String str = this.instructions;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.stepImage;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return v.e0.g("ExerciseStepDTO(instructions=", this.instructions, ", stepImage=", this.stepImage, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.instructions);
        parcel.writeString(this.stepImage);
    }

    /* JADX INFO: renamed from: bg2.d$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lbg2/d$b;", "", "<init>", "()V", "Li63/c;", "Lbg2/d;", "serializer", "()Li63/c;", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public final i63.c<d> serializer() {
            return a.f17859a;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d() {
        this((String) null, (String) (0 == true ? 1 : 0), 3, (p005kotlin.jvm.internal.j) (0 == true ? 1 : 0));
    }

    public d(String str, String str2) {
        this.instructions = str;
        this.stepImage = str2;
    }

    public /* synthetic */ d(String str, String str2, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : str, (i14 & 2) != 0 ? null : str2);
    }
}

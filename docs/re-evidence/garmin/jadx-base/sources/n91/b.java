package n91;

import am.j;
import android.os.Parcel;
import android.os.Parcelable;
import c22.t;
import ch.qos.logback.core.joran.action.Action;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import d53.u;
import i63.h;
import java.util.Iterator;
import l63.d;
import l63.f;
import m63.e0;
import m63.g;
import m63.k1;
import m63.m1;
import m63.u1;
import m63.v0;
import m63.x;
import m63.y1;
import o13.e;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0087\b\u0018\u0000 &2\u00020\u0001:\u0002\u0013\u0017B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rBO\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\f\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0018\u001a\u0004\b\u001f\u0010\u001aR\u001a\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001a\u0010\u000b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010!\u001a\u0004\b%\u0010#¨\u0006'"}, d2 = {"Ln91/b;", "Landroid/os/Parcelable;", "", TtmlNode.ATTR_ID, "", Action.KEY_ATTRIBUTE, "", "visible", "sportTypeKey", "", "minValue", "maxValue", "<init>", "(JLjava/lang/String;ZLjava/lang/String;DD)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(IJLjava/lang/String;ZLjava/lang/String;DDLm63/u1;)V", "a", "J", "d", "()J", "b", "Ljava/lang/String;", "getKey", "()Ljava/lang/String;", "c", "Z", "g", "()Z", "getSportTypeKey", JWKParameterNames.RSA_EXPONENT, "D", "getMinValue", "()D", "f", "getMaxValue", "Companion", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@h
public final /* data */ class b implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName(TtmlNode.ATTR_ID)
    private final long id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName(Action.KEY_ATTRIBUTE)
    private final String key;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("visible")
    private final boolean visible;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("sport")
    private final String sportTypeKey;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("minValue")
    private final double minValue;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("maxValue")
    private final double maxValue;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<b> CREATOR = new c();

    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/personalrecords/data/model/PersonalRecordTypeDTO.$serializer", "Lm63/e0;", "Ln91/b;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @e
    public static final /* synthetic */ class a implements e0<b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f125055a;
        private static final k63.e descriptor;

        static {
            a aVar = new a();
            f125055a = aVar;
            m1 m1Var = new m1("com.garmin.android.apps.connectmobile.personalrecords.data.model.PersonalRecordTypeDTO", aVar, 6);
            m1Var.j(TtmlNode.ATTR_ID, false);
            m1Var.j(Action.KEY_ATTRIBUTE, false);
            m1Var.j("visible", false);
            m1Var.j("sportTypeKey", false);
            m1Var.j("minValue", false);
            m1Var.j("maxValue", false);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // m63.e0
        public final i63.c<?>[] childSerializers() {
            y1 y1Var = y1.f117048a;
            x xVar = x.f117036a;
            return new i63.c[]{v0.f117027a, y1Var, g.f116948a, y1Var, xVar, xVar};
        }

        @Override // i63.b
        public final Object deserialize(l63.e eVar) {
            eVar.getClass();
            k63.e eVar2 = descriptor;
            l63.c cVarC = eVar.c(eVar2);
            int i14 = l63.c.f110557a;
            int i15 = 0;
            boolean zG = false;
            long jW = 0;
            String strR = null;
            String strR2 = null;
            double dT = 0.0d;
            double dT2 = 0.0d;
            boolean z14 = true;
            while (z14) {
                int iE = cVarC.e(eVar2);
                switch (iE) {
                    case -1:
                        z14 = false;
                        break;
                    case 0:
                        jW = cVarC.w(eVar2, 0);
                        i15 |= 1;
                        break;
                    case 1:
                        strR = cVarC.r(eVar2, 1);
                        i15 |= 2;
                        break;
                    case 2:
                        zG = cVarC.g(eVar2, 2);
                        i15 |= 4;
                        break;
                    case 3:
                        strR2 = cVarC.r(eVar2, 3);
                        i15 |= 8;
                        break;
                    case 4:
                        dT = cVarC.t(eVar2, 4);
                        i15 |= 16;
                        break;
                    case 5:
                        dT2 = cVarC.t(eVar2, 5);
                        i15 |= 32;
                        break;
                    default:
                        hb.a.o(iE);
                        return null;
                }
            }
            cVarC.b(eVar2);
            return new b(i15, jW, strR, zG, strR2, dT, dT2, null);
        }

        @Override // i63.i, i63.b
        /* JADX INFO: renamed from: getDescriptor */
        public final k63.e getF158591b() {
            return descriptor;
        }

        @Override // i63.i
        public final void serialize(f fVar, Object obj) {
            b bVar = (b) obj;
            bVar.getClass();
            k63.e eVar = descriptor;
            d dVarC = fVar.c(eVar);
            b.h(bVar, dVarC, eVar);
            dVarC.b(eVar);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements Parcelable.Creator<b> {
        @Override // android.os.Parcelable.Creator
        public final b createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new b(parcel.readLong(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readDouble(), parcel.readDouble());
        }

        @Override // android.os.Parcelable.Creator
        public final b[] newArray(int i14) {
            return new b[i14];
        }
    }

    public /* synthetic */ b(int i14, long j8, String str, boolean z14, String str2, double d14, double d15, u1 u1Var) {
        if (63 != (i14 & 63)) {
            k1.h(i14, 63, a.f125055a.getF158591b());
            throw null;
        }
        this.id = j8;
        this.key = str;
        this.visible = z14;
        this.sportTypeKey = str2;
        this.minValue = d14;
        this.maxValue = d15;
    }

    public static b b(b bVar, boolean z14) {
        long j8 = bVar.id;
        String str = bVar.key;
        String str2 = bVar.sportTypeKey;
        double d14 = bVar.minValue;
        double d15 = bVar.maxValue;
        str.getClass();
        str2.getClass();
        return new b(j8, str, z14, str2, d14, d15);
    }

    public static final /* synthetic */ void h(b bVar, d dVar, k63.e eVar) {
        dVar.z(eVar, 0, bVar.id);
        dVar.k(eVar, 1, bVar.key);
        dVar.n(eVar, 2, bVar.visible);
        dVar.k(eVar, 3, bVar.sportTypeKey);
        dVar.B(eVar, 4, bVar.minValue);
        dVar.B(eVar, 5, bVar.maxValue);
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final long getId() {
        return this.id;
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
        return this.id == bVar.id && s.g(this.key, bVar.key) && this.visible == bVar.visible && s.g(this.sportTypeKey, bVar.sportTypeKey) && Double.compare(this.minValue, bVar.minValue) == 0 && Double.compare(this.maxValue, bVar.maxValue) == 0;
    }

    public final q91.g f() {
        Object next;
        q91.g.Companion companion = q91.g.INSTANCE;
        String str = this.sportTypeKey;
        companion.getClass();
        Iterator<T> it = q91.g.f143596l.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!u.q(str, ((q91.g) next).f143597a, true));
        q91.g gVar = (q91.g) next;
        return gVar == null ? q91.g.STEPS : gVar;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final boolean getVisible() {
        return this.visible;
    }

    public final int hashCode() {
        return Double.hashCode(this.maxValue) + org.apache.commons.lang3.e.b(wr.g.j(q6.f.g(wr.g.j(Long.hashCode(this.id) * 31, 31, this.key), 31, this.visible), 31, this.sportTypeKey), 31, this.minValue);
    }

    public final String toString() {
        long j8 = this.id;
        String str = this.key;
        boolean z14 = this.visible;
        String str2 = this.sportTypeKey;
        double d14 = this.minValue;
        double d15 = this.maxValue;
        StringBuilder sbK = com.airbnb.lottie.animation.keyframe.a.k(j8, "PersonalRecordTypeDTO(id=", ", key=", str);
        sbK.append(", visible=");
        sbK.append(z14);
        sbK.append(", sportTypeKey=");
        sbK.append(str2);
        j.x(sbK, ", minValue=", d14, ", maxValue=");
        return t.d(d15, ")", sbK);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeLong(this.id);
        parcel.writeString(this.key);
        parcel.writeInt(this.visible ? 1 : 0);
        parcel.writeString(this.sportTypeKey);
        parcel.writeDouble(this.minValue);
        parcel.writeDouble(this.maxValue);
    }

    /* JADX INFO: renamed from: n91.b$b, reason: collision with other inner class name and from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ln91/b$b;", "", "<init>", "()V", "Li63/c;", "Ln91/b;", "serializer", "()Li63/c;", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public final i63.c<b> serializer() {
            return a.f125055a;
        }

        private Companion() {
        }
    }

    public b(long j8, String str, boolean z14, String str2, double d14, double d15) {
        str.getClass();
        str2.getClass();
        this.id = j8;
        this.key = str;
        this.visible = z14;
        this.sportTypeKey = str2;
        this.minValue = d14;
        this.maxValue = d15;
    }
}

package n91;

import am.j;
import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import i63.h;
import l63.d;
import l63.f;
import m63.e0;
import m63.k1;
import m63.m1;
import m63.u1;
import m63.v0;
import m63.x;
import m63.y1;
import o13.e;
import o13.l;
import o13.m;
import o13.n;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import ps.z1;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b!\b\u0087\b\u0018\u0000 72\u00020\u0001:\u0002\u001a\u001eB\u008f\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014B\u008f\u0001\b\u0010\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0013\u0010\u0019R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010\u001b\u001a\u0004\b&\u0010\u001dR\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u001c\u0010\n\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010(\u001a\u0004\b+\u0010*R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b,\u0010\u001b\u001a\u0004\b,\u0010\u001dR\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b-\u0010\u001b\u001a\u0004\b-\u0010\u001dR\u001a\u0010\u000e\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010.\u001a\u0004\b/\u00100R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001b\u001a\u0004\b1\u0010\u001dR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b1\u0010\u001b\u001a\u0004\b2\u0010\u001dR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106¨\u00068"}, d2 = {"Ln91/a;", "Landroid/os/Parcelable;", "", TtmlNode.ATTR_ID, "typeId", "Lq91/c;", "status", "activityId", "", "activityName", "activityType", "activityStartDateTimeInGMT", "activityStartDateTimeLocal", "", "value", "prStartTimeGmt", "prStartTimeLocal", "Lps/z1;", "poolLengthUnit", "<init>", "(Ljava/lang/Long;JLq91/c;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;DLjava/lang/Long;Ljava/lang/Long;Lps/z1;)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILjava/lang/Long;JLq91/c;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;DLjava/lang/Long;Ljava/lang/Long;Lps/z1;Lm63/u1;)V", "a", "Ljava/lang/Long;", "j", "()Ljava/lang/Long;", "b", "J", "o", "()J", "c", "Lq91/c;", "getStatus", "()Lq91/c;", "d", JWKParameterNames.RSA_EXPONENT, "Ljava/lang/String;", "f", "()Ljava/lang/String;", IntegerTokenConverter.CONVERTER_KEY, "g", "h", "D", JWKParameterNames.RSA_SECOND_PRIME_FACTOR, "()D", JWKParameterNames.OCT_KEY_VALUE, "m", "l", "Lps/z1;", "getPoolLengthUnit", "()Lps/z1;", "Companion", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@h
public final /* data */ class a implements Parcelable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final l<i63.c<Object>>[] f125035m;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName(TtmlNode.ATTR_ID)
    private final Long id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("typeId")
    private final long typeId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("status")
    private final q91.c status;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("activityId")
    private final Long activityId;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("activityName")
    private final String activityName;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("activityType")
    private final String activityType;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("activityStartDateTimeInGMT")
    private final Long activityStartDateTimeInGMT;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @SerializedName("activityStartDateTimeLocal")
    private final Long activityStartDateTimeLocal;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @SerializedName("value")
    private final double value;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @SerializedName("prStartTimeGmt")
    private final Long prStartTimeGmt;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @SerializedName("prStartTimeLocal")
    private final Long prStartTimeLocal;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @SerializedName("poolLengthUnit")
    private final z1 poolLengthUnit;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<a> CREATOR = new c();

    /* JADX INFO: renamed from: n91.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/personalrecords/data/model/PersonalRecordDTO.$serializer", "Lm63/e0;", "Ln91/a;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @e
    public static final /* synthetic */ class C2408a implements e0<a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C2408a f125048a;
        private static final k63.e descriptor;

        static {
            C2408a c2408a = new C2408a();
            f125048a = c2408a;
            m1 m1Var = new m1("com.garmin.android.apps.connectmobile.personalrecords.data.model.PersonalRecordDTO", c2408a, 12);
            m1Var.j(TtmlNode.ATTR_ID, true);
            m1Var.j("typeId", false);
            m1Var.j("status", true);
            m1Var.j("activityId", true);
            m1Var.j("activityName", true);
            m1Var.j("activityType", true);
            m1Var.j("activityStartDateTimeInGMT", true);
            m1Var.j("activityStartDateTimeLocal", true);
            m1Var.j("value", false);
            m1Var.j("prStartTimeGmt", true);
            m1Var.j("prStartTimeLocal", true);
            m1Var.j("poolLengthUnit", true);
            descriptor = m1Var;
        }

        private C2408a() {
        }

        @Override // m63.e0
        public final i63.c<?>[] childSerializers() {
            l<i63.c<Object>>[] lVarArr = a.f125035m;
            v0 v0Var = v0.f117027a;
            i63.c<?> cVarD = j63.a.d(v0Var);
            i63.c<?> cVarD2 = j63.a.d(lVarArr[2].getValue());
            i63.c<?> cVarD3 = j63.a.d(v0Var);
            y1 y1Var = y1.f117048a;
            return new i63.c[]{cVarD, v0Var, cVarD2, cVarD3, j63.a.d(y1Var), j63.a.d(y1Var), j63.a.d(v0Var), j63.a.d(v0Var), x.f117036a, j63.a.d(v0Var), j63.a.d(v0Var), j63.a.d(z1.a.f140453a)};
        }

        @Override // i63.b
        public final Object deserialize(l63.e eVar) {
            eVar.getClass();
            k63.e eVar2 = descriptor;
            l63.c cVarC = eVar.c(eVar2);
            l<i63.c<Object>>[] lVarArr = a.f125035m;
            int i14 = l63.c.f110557a;
            long jW = 0;
            double dT = 0.0d;
            z1 z1Var = null;
            Long l14 = null;
            Long l15 = null;
            Long l16 = null;
            boolean z14 = true;
            Long l17 = null;
            String str = null;
            String str2 = null;
            Long l18 = null;
            int i15 = 0;
            Long l19 = null;
            q91.c cVar = null;
            while (z14) {
                int iE = cVarC.e(eVar2);
                switch (iE) {
                    case -1:
                        jW = jW;
                        z14 = false;
                        jW = jW;
                        break;
                    case 0:
                        l19 = (Long) cVarC.v(eVar2, 0, v0.f117027a, l19);
                        i15 |= 1;
                        z14 = z14;
                        jW = jW;
                        break;
                    case 1:
                        jW = cVarC.w(eVar2, 1);
                        i15 |= 2;
                        z14 = z14;
                        break;
                    case 2:
                        cVar = (q91.c) cVarC.v(eVar2, 2, lVarArr[2].getValue(), cVar);
                        i15 |= 4;
                        z14 = z14;
                        jW = jW;
                        break;
                    case 3:
                        l17 = (Long) cVarC.v(eVar2, 3, v0.f117027a, l17);
                        i15 |= 8;
                        z14 = z14;
                        jW = jW;
                        break;
                    case 4:
                        str = (String) cVarC.v(eVar2, 4, y1.f117048a, str);
                        i15 |= 16;
                        z14 = z14;
                        jW = jW;
                        break;
                    case 5:
                        str2 = (String) cVarC.v(eVar2, 5, y1.f117048a, str2);
                        i15 |= 32;
                        z14 = z14;
                        jW = jW;
                        break;
                    case 6:
                        l18 = (Long) cVarC.v(eVar2, 6, v0.f117027a, l18);
                        i15 |= 64;
                        z14 = z14;
                        jW = jW;
                        break;
                    case 7:
                        l16 = (Long) cVarC.v(eVar2, 7, v0.f117027a, l16);
                        i15 |= 128;
                        z14 = z14;
                        jW = jW;
                        break;
                    case 8:
                        dT = cVarC.t(eVar2, 8);
                        i15 |= 256;
                        z14 = z14;
                        break;
                    case 9:
                        l15 = (Long) cVarC.v(eVar2, 9, v0.f117027a, l15);
                        i15 |= 512;
                        z14 = z14;
                        jW = jW;
                        break;
                    case 10:
                        l14 = (Long) cVarC.v(eVar2, 10, v0.f117027a, l14);
                        i15 |= 1024;
                        z14 = z14;
                        jW = jW;
                        break;
                    case 11:
                        z1Var = (z1) cVarC.v(eVar2, 11, z1.a.f140453a, z1Var);
                        i15 |= 2048;
                        z14 = z14;
                        jW = jW;
                        break;
                    default:
                        hb.a.o(iE);
                        return null;
                }
            }
            cVarC.b(eVar2);
            return new a(i15, l19, jW, cVar, l17, str, str2, l18, l16, dT, l15, l14, z1Var, (u1) null);
        }

        @Override // i63.i, i63.b
        /* JADX INFO: renamed from: getDescriptor */
        public final k63.e getF116202c() {
            return descriptor;
        }

        @Override // i63.i
        public final void serialize(f fVar, Object obj) {
            a aVar = (a) obj;
            aVar.getClass();
            k63.e eVar = descriptor;
            d dVarC = fVar.c(eVar);
            a.t(aVar, dVarC, eVar);
            dVarC.b(eVar);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements Parcelable.Creator<a> {
        @Override // android.os.Parcelable.Creator
        public final a createFromParcel(Parcel parcel) {
            Long lValueOf;
            Long lValueOf2;
            parcel.getClass();
            Long lValueOf3 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            long j8 = parcel.readLong();
            q91.c cVarCreateFromParcel = parcel.readInt() == 0 ? null : q91.c.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                lValueOf = null;
                lValueOf2 = null;
            } else {
                lValueOf = Long.valueOf(parcel.readLong());
                lValueOf2 = null;
            }
            Long l14 = lValueOf3;
            String string = parcel.readString();
            Long l15 = lValueOf;
            String string2 = parcel.readString();
            Long lValueOf4 = parcel.readInt() == 0 ? lValueOf2 : Long.valueOf(parcel.readLong());
            Long lValueOf5 = parcel.readInt() == 0 ? lValueOf2 : Long.valueOf(parcel.readLong());
            double d14 = parcel.readDouble();
            Long lValueOf6 = parcel.readInt() == 0 ? lValueOf2 : Long.valueOf(parcel.readLong());
            if (parcel.readInt() != 0) {
                lValueOf2 = Long.valueOf(parcel.readLong());
            }
            return new a(l14, j8, cVarCreateFromParcel, l15, string, string2, lValueOf4, lValueOf5, d14, lValueOf6, lValueOf2, (z1) parcel.readParcelable(a.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final a[] newArray(int i14) {
            return new a[i14];
        }
    }

    static {
        z1.Companion companion = z1.INSTANCE;
        f125035m = new l[]{null, null, m.a(n.PUBLICATION, new n61.h(16)), null, null, null, null, null, null, null, null, null};
    }

    public /* synthetic */ a(int i14, Long l14, long j8, q91.c cVar, Long l15, String str, String str2, Long l16, Long l17, double d14, Long l18, Long l19, z1 z1Var, u1 u1Var) {
        if (258 != (i14 & 258)) {
            k1.h(i14, 258, C2408a.f125048a.getF116202c());
            throw null;
        }
        if ((i14 & 1) == 0) {
            this.id = null;
        } else {
            this.id = l14;
        }
        this.typeId = j8;
        if ((i14 & 4) == 0) {
            this.status = null;
        } else {
            this.status = cVar;
        }
        if ((i14 & 8) == 0) {
            this.activityId = null;
        } else {
            this.activityId = l15;
        }
        if ((i14 & 16) == 0) {
            this.activityName = null;
        } else {
            this.activityName = str;
        }
        if ((i14 & 32) == 0) {
            this.activityType = null;
        } else {
            this.activityType = str2;
        }
        if ((i14 & 64) == 0) {
            this.activityStartDateTimeInGMT = null;
        } else {
            this.activityStartDateTimeInGMT = l16;
        }
        if ((i14 & 128) == 0) {
            this.activityStartDateTimeLocal = null;
        } else {
            this.activityStartDateTimeLocal = l17;
        }
        this.value = d14;
        if ((i14 & 512) == 0) {
            this.prStartTimeGmt = null;
        } else {
            this.prStartTimeGmt = l18;
        }
        if ((i14 & 1024) == 0) {
            this.prStartTimeLocal = null;
        } else {
            this.prStartTimeLocal = l19;
        }
        if ((i14 & 2048) == 0) {
            this.poolLengthUnit = null;
        } else {
            this.poolLengthUnit = z1Var;
        }
    }

    public static a b(a aVar, q91.c cVar, int i14) {
        Long l14 = aVar.id;
        long j8 = aVar.typeId;
        q91.c cVar2 = (i14 & 4) != 0 ? aVar.status : cVar;
        Long l15 = aVar.activityId;
        String str = aVar.activityName;
        String str2 = aVar.activityType;
        Long l16 = aVar.activityStartDateTimeInGMT;
        Long l17 = aVar.activityStartDateTimeLocal;
        double d14 = aVar.value;
        Long l18 = aVar.prStartTimeGmt;
        Long l19 = aVar.prStartTimeLocal;
        z1 z1Var = aVar.poolLengthUnit;
        aVar.getClass();
        return new a(l14, j8, cVar2, l15, str, str2, l16, l17, d14, l18, l19, z1Var);
    }

    public static final /* synthetic */ void t(a aVar, d dVar, k63.e eVar) {
        if (dVar.C(eVar) || aVar.id != null) {
            dVar.d(eVar, 0, v0.f117027a, aVar.id);
        }
        dVar.z(eVar, 1, aVar.typeId);
        if (dVar.C(eVar) || aVar.status != null) {
            dVar.d(eVar, 2, f125035m[2].getValue(), aVar.status);
        }
        if (dVar.C(eVar) || aVar.activityId != null) {
            dVar.d(eVar, 3, v0.f117027a, aVar.activityId);
        }
        if (dVar.C(eVar) || aVar.activityName != null) {
            dVar.d(eVar, 4, y1.f117048a, aVar.activityName);
        }
        if (dVar.C(eVar) || aVar.activityType != null) {
            dVar.d(eVar, 5, y1.f117048a, aVar.activityType);
        }
        if (dVar.C(eVar) || aVar.activityStartDateTimeInGMT != null) {
            dVar.d(eVar, 6, v0.f117027a, aVar.activityStartDateTimeInGMT);
        }
        if (dVar.C(eVar) || aVar.activityStartDateTimeLocal != null) {
            dVar.d(eVar, 7, v0.f117027a, aVar.activityStartDateTimeLocal);
        }
        dVar.B(eVar, 8, aVar.value);
        if (dVar.C(eVar) || aVar.prStartTimeGmt != null) {
            dVar.d(eVar, 9, v0.f117027a, aVar.prStartTimeGmt);
        }
        if (dVar.C(eVar) || aVar.prStartTimeLocal != null) {
            dVar.d(eVar, 10, v0.f117027a, aVar.prStartTimeLocal);
        }
        if (!dVar.C(eVar) && aVar.poolLengthUnit == null) {
            return;
        }
        dVar.d(eVar, 11, z1.a.f140453a, aVar.poolLengthUnit);
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Long getActivityId() {
        return this.activityId;
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
        return s.g(this.id, aVar.id) && this.typeId == aVar.typeId && this.status == aVar.status && s.g(this.activityId, aVar.activityId) && s.g(this.activityName, aVar.activityName) && s.g(this.activityType, aVar.activityType) && s.g(this.activityStartDateTimeInGMT, aVar.activityStartDateTimeInGMT) && s.g(this.activityStartDateTimeLocal, aVar.activityStartDateTimeLocal) && Double.compare(this.value, aVar.value) == 0 && s.g(this.prStartTimeGmt, aVar.prStartTimeGmt) && s.g(this.prStartTimeLocal, aVar.prStartTimeLocal) && s.g(this.poolLengthUnit, aVar.poolLengthUnit);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getActivityName() {
        return this.activityName;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final Long getActivityStartDateTimeInGMT() {
        return this.activityStartDateTimeInGMT;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final Long getActivityStartDateTimeLocal() {
        return this.activityStartDateTimeLocal;
    }

    public final int hashCode() {
        Long l14 = this.id;
        int iE = q6.f.e((l14 == null ? 0 : l14.hashCode()) * 31, 31, this.typeId);
        q91.c cVar = this.status;
        int iHashCode = (iE + (cVar == null ? 0 : cVar.hashCode())) * 31;
        Long l15 = this.activityId;
        int iHashCode2 = (iHashCode + (l15 == null ? 0 : l15.hashCode())) * 31;
        String str = this.activityName;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.activityType;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l16 = this.activityStartDateTimeInGMT;
        int iHashCode5 = (iHashCode4 + (l16 == null ? 0 : l16.hashCode())) * 31;
        Long l17 = this.activityStartDateTimeLocal;
        int iB = org.apache.commons.lang3.e.b((iHashCode5 + (l17 == null ? 0 : l17.hashCode())) * 31, 31, this.value);
        Long l18 = this.prStartTimeGmt;
        int iHashCode6 = (iB + (l18 == null ? 0 : l18.hashCode())) * 31;
        Long l19 = this.prStartTimeLocal;
        int iHashCode7 = (iHashCode6 + (l19 == null ? 0 : l19.hashCode())) * 31;
        z1 z1Var = this.poolLengthUnit;
        return iHashCode7 + (z1Var != null ? z1Var.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getActivityType() {
        return this.activityType;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final Long getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final Long getPrStartTimeGmt() {
        return this.prStartTimeGmt;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final Long getPrStartTimeLocal() {
        return this.prStartTimeLocal;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final long getTypeId() {
        return this.typeId;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final double getValue() {
        return this.value;
    }

    public final boolean r() {
        return this.status == q91.c.CANDIDATE;
    }

    public final boolean s() {
        return this.status == q91.c.ACCEPTED;
    }

    public final String toString() {
        Long l14 = this.id;
        long j8 = this.typeId;
        q91.c cVar = this.status;
        Long l15 = this.activityId;
        String str = this.activityName;
        String str2 = this.activityType;
        Long l16 = this.activityStartDateTimeInGMT;
        Long l17 = this.activityStartDateTimeLocal;
        double d14 = this.value;
        Long l18 = this.prStartTimeGmt;
        Long l19 = this.prStartTimeLocal;
        z1 z1Var = this.poolLengthUnit;
        StringBuilder sb3 = new StringBuilder("PersonalRecordDTO(id=");
        sb3.append(l14);
        sb3.append(", typeId=");
        sb3.append(j8);
        sb3.append(", status=");
        sb3.append(cVar);
        sb3.append(", activityId=");
        sb3.append(l15);
        sn.a.t(sb3, ", activityName=", str, ", activityType=", str2);
        sb3.append(", activityStartDateTimeInGMT=");
        sb3.append(l16);
        sb3.append(", activityStartDateTimeLocal=");
        sb3.append(l17);
        j.x(sb3, ", value=", d14, ", prStartTimeGmt=");
        kg.f.s(sb3, l18, ", prStartTimeLocal=", l19, ", poolLengthUnit=");
        sb3.append(z1Var);
        sb3.append(")");
        return sb3.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        Long l14 = this.id;
        if (l14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l14);
        }
        parcel.writeLong(this.typeId);
        q91.c cVar = this.status;
        if (cVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            cVar.writeToParcel(parcel, i14);
        }
        Long l15 = this.activityId;
        if (l15 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l15);
        }
        parcel.writeString(this.activityName);
        parcel.writeString(this.activityType);
        Long l16 = this.activityStartDateTimeInGMT;
        if (l16 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l16);
        }
        Long l17 = this.activityStartDateTimeLocal;
        if (l17 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l17);
        }
        parcel.writeDouble(this.value);
        Long l18 = this.prStartTimeGmt;
        if (l18 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l18);
        }
        Long l19 = this.prStartTimeLocal;
        if (l19 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l19);
        }
        parcel.writeParcelable(this.poolLengthUnit, i14);
    }

    /* JADX INFO: renamed from: n91.a$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ln91/a$b;", "", "<init>", "()V", "Li63/c;", "Ln91/a;", "serializer", "()Li63/c;", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public final i63.c<a> serializer() {
            return C2408a.f125048a;
        }

        private Companion() {
        }
    }

    public a(Long l14, long j8, q91.c cVar, Long l15, String str, String str2, Long l16, Long l17, double d14, Long l18, Long l19, z1 z1Var) {
        this.id = l14;
        this.typeId = j8;
        this.status = cVar;
        this.activityId = l15;
        this.activityName = str;
        this.activityType = str2;
        this.activityStartDateTimeInGMT = l16;
        this.activityStartDateTimeLocal = l17;
        this.value = d14;
        this.prStartTimeGmt = l18;
        this.prStartTimeLocal = l19;
        this.poolLengthUnit = z1Var;
    }

    public /* synthetic */ a(Long l14, long j8, q91.c cVar, Long l15, String str, String str2, Long l16, Long l17, double d14, Long l18, Long l19, z1 z1Var, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : l14, j8, (i14 & 4) != 0 ? null : cVar, (i14 & 8) != 0 ? null : l15, (i14 & 16) != 0 ? null : str, (i14 & 32) != 0 ? null : str2, (i14 & 64) != 0 ? null : l16, (i14 & 128) != 0 ? null : l17, d14, (i14 & 512) != 0 ? null : l18, (i14 & 1024) != 0 ? null : l19, (i14 & 2048) != 0 ? null : z1Var);
    }
}

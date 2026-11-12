package bg2;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import i3.e5;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import m63.e0;
import m63.m1;
import m63.u1;
import m63.y1;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b1\b\u0087\b\u0018\u0000 I2\u00020\u0001:\u0002\u001c\u001eBÁ\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\t\u0012\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\t\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0015\u0010\u0016B¹\u0001\b\u0010\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\t\u0012\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\t\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u0015\u0010\u001bR$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R$\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001d\u001a\u0004\b\"\u0010\u001f\"\u0004\b#\u0010!R$\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b$\u0010\u001d\u001a\u0004\b%\u0010\u001f\"\u0004\b&\u0010!R$\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b%\u0010\u001d\u001a\u0004\b'\u0010\u001f\"\u0004\b(\u0010!R$\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b)\u0010\u001d\u001a\u0004\b*\u0010\u001f\"\u0004\b+\u0010!R$\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b'\u0010\u001d\u001a\u0004\b,\u0010\u001f\"\u0004\b-\u0010!R*\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b.\u00100\"\u0004\b1\u00102R$\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b3\u0010\u001d\u001a\u0004\b4\u0010\u001f\"\u0004\b5\u0010!R$\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b6\u0010\u001d\u001a\u0004\b7\u0010\u001f\"\u0004\b8\u0010!R$\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R*\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b?\u0010/\u001a\u0004\b3\u00100\"\u0004\b@\u00102R*\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bA\u0010/\u001a\u0004\b6\u00100\"\u0004\bB\u00102R$\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bC\u0010\u001d\u001a\u0004\bD\u0010\u001f\"\u0004\bE\u0010!R$\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bF\u0010\u001d\u001a\u0004\bG\u0010\u001f\"\u0004\bH\u0010!¨\u0006J"}, d2 = {"Lbg2/h;", "Landroid/os/Parcelable;", "", "bodyParts", "description", "difficulty", "equipment", "exerciseCategory", "exerciseName", "", "Lbg2/d;", "exerciseSteps", "focuses", "locale", "Lbg2/n;", "sportType", "tips", "Lbg2/o;", "videos", "exerciseSourceId", "heroImage", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lbg2/n;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lbg2/n;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lm63/u1;)V", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "setBodyParts", "(Ljava/lang/String;)V", "getDescription", "setDescription", "c", "d", "setDifficulty", "f", "setEquipment", JWKParameterNames.RSA_EXPONENT, "getExerciseCategory", "setExerciseCategory", "getExerciseName", "setExerciseName", "g", "Ljava/util/List;", "()Ljava/util/List;", "setExerciseSteps", "(Ljava/util/List;)V", "h", "getFocuses", "setFocuses", IntegerTokenConverter.CONVERTER_KEY, "getLocale", "setLocale", "j", "Lbg2/n;", "getSportType", "()Lbg2/n;", "setSportType", "(Lbg2/n;)V", JWKParameterNames.OCT_KEY_VALUE, "setTips", "l", "setVideos", "m", "getExerciseSourceId", "setExerciseSourceId", JWKParameterNames.RSA_MODULUS, "getHeroImage", "setHeroImage", "Companion", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
@i63.h
public final /* data */ class h implements Parcelable {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final o13.l<i63.c<Object>>[] f17873o;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("bodyParts")
    private String bodyParts;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("description")
    private String description;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("difficulty")
    private String difficulty;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("equipment")
    private String equipment;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("exerciseCategory")
    private String exerciseCategory;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("exerciseName")
    private String exerciseName;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("exerciseSteps")
    private List<d> exerciseSteps;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @SerializedName("focuses")
    private String focuses;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @SerializedName("locale")
    private String locale;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @SerializedName("sportType")
    private n sportType;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @SerializedName("tips")
    private List<String> tips;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @SerializedName("videos")
    private List<o> videos;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @SerializedName("exerciseSourceId")
    private String exerciseSourceId;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @SerializedName("heroImage")
    private String heroImage;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<h> CREATOR = new c();

    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/livesessionview/msnworkouts/MSNWorkoutExerciseDTO.$serializer", "Lm63/e0;", "Lbg2/h;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @o13.e
    public static final /* synthetic */ class a implements e0<h> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f17888a;
        private static final k63.e descriptor;

        static {
            a aVar = new a();
            f17888a = aVar;
            m1 m1Var = new m1("com.garmin.android.livesessionview.msnworkouts.MSNWorkoutExerciseDTO", aVar, 14);
            m1Var.j("bodyParts", true);
            m1Var.j("description", true);
            m1Var.j("difficulty", true);
            m1Var.j("equipment", true);
            m1Var.j("exerciseCategory", true);
            m1Var.j("exerciseName", true);
            m1Var.j("exerciseSteps", true);
            m1Var.j("focuses", true);
            m1Var.j("locale", true);
            m1Var.j("sportType", true);
            m1Var.j("tips", true);
            m1Var.j("videos", true);
            m1Var.j("exerciseSourceId", true);
            m1Var.j("heroImage", true);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // m63.e0
        public final i63.c<?>[] childSerializers() {
            o13.l<i63.c<Object>>[] lVarArr = h.f17873o;
            y1 y1Var = y1.f117048a;
            return new i63.c[]{j63.a.d(y1Var), j63.a.d(y1Var), j63.a.d(y1Var), j63.a.d(y1Var), j63.a.d(y1Var), j63.a.d(y1Var), j63.a.d(lVarArr[6].getValue()), j63.a.d(y1Var), j63.a.d(y1Var), j63.a.d(n.a.f17904a), j63.a.d(lVarArr[10].getValue()), j63.a.d(lVarArr[11].getValue()), j63.a.d(y1Var), j63.a.d(y1Var)};
        }

        @Override // i63.b
        public final Object deserialize(l63.e eVar) {
            eVar.getClass();
            k63.e eVar2 = descriptor;
            l63.c cVarC = eVar.c(eVar2);
            o13.l<i63.c<Object>>[] lVarArr = h.f17873o;
            int i14 = l63.c.f110557a;
            List list = null;
            List list2 = null;
            n nVar = null;
            String str = null;
            String str2 = null;
            String str3 = null;
            int i15 = 0;
            String str4 = null;
            String str5 = null;
            String str6 = null;
            String str7 = null;
            String str8 = null;
            String str9 = null;
            List list3 = null;
            boolean z14 = true;
            String str10 = null;
            while (z14) {
                int iE = cVarC.e(eVar2);
                switch (iE) {
                    case -1:
                        z14 = false;
                        list2 = list2;
                        str6 = str6;
                        list = list;
                        break;
                    case 0:
                        str10 = (String) cVarC.v(eVar2, 0, y1.f117048a, str10);
                        i15 |= 1;
                        str5 = str5;
                        list2 = list2;
                        str6 = str6;
                        list = list;
                        break;
                    case 1:
                        list = list;
                        str6 = str6;
                        str5 = (String) cVarC.v(eVar2, 1, y1.f117048a, str5);
                        i15 |= 2;
                        str6 = str6;
                        list = list;
                        break;
                    case 2:
                        list = list;
                        str6 = (String) cVarC.v(eVar2, 2, y1.f117048a, str6);
                        i15 |= 4;
                        str5 = str5;
                        list = list;
                        break;
                    case 3:
                        str7 = (String) cVarC.v(eVar2, 3, y1.f117048a, str7);
                        i15 |= 8;
                        str5 = str5;
                        str6 = str6;
                        break;
                    case 4:
                        str8 = (String) cVarC.v(eVar2, 4, y1.f117048a, str8);
                        i15 |= 16;
                        str5 = str5;
                        str6 = str6;
                        break;
                    case 5:
                        str9 = (String) cVarC.v(eVar2, 5, y1.f117048a, str9);
                        i15 |= 32;
                        str5 = str5;
                        str6 = str6;
                        break;
                    case 6:
                        list3 = (List) cVarC.v(eVar2, 6, lVarArr[6].getValue(), list3);
                        i15 |= 64;
                        str5 = str5;
                        str6 = str6;
                        break;
                    case 7:
                        str3 = (String) cVarC.v(eVar2, 7, y1.f117048a, str3);
                        i15 |= 128;
                        str5 = str5;
                        str6 = str6;
                        break;
                    case 8:
                        str = (String) cVarC.v(eVar2, 8, y1.f117048a, str);
                        i15 |= 256;
                        str5 = str5;
                        str6 = str6;
                        break;
                    case 9:
                        nVar = (n) cVarC.v(eVar2, 9, n.a.f17904a, nVar);
                        i15 |= 512;
                        str5 = str5;
                        str6 = str6;
                        break;
                    case 10:
                        list2 = (List) cVarC.v(eVar2, 10, lVarArr[10].getValue(), list2);
                        i15 |= 1024;
                        str5 = str5;
                        str6 = str6;
                        break;
                    case 11:
                        list = (List) cVarC.v(eVar2, 11, lVarArr[11].getValue(), list);
                        i15 |= 2048;
                        str5 = str5;
                        str6 = str6;
                        break;
                    case 12:
                        str2 = (String) cVarC.v(eVar2, 12, y1.f117048a, str2);
                        i15 |= 4096;
                        str5 = str5;
                        str6 = str6;
                        break;
                    case 13:
                        str4 = (String) cVarC.v(eVar2, 13, y1.f117048a, str4);
                        i15 |= 8192;
                        str5 = str5;
                        str6 = str6;
                        break;
                    default:
                        hb.a.o(iE);
                        return null;
                }
            }
            List list4 = list;
            String str11 = str6;
            String str12 = str10;
            cVarC.b(eVar2);
            return new h(i15, str12, str5, str11, str7, str8, str9, list3, str3, str, nVar, list2, list4, str2, str4, (u1) null);
        }

        @Override // i63.i, i63.b
        /* JADX INFO: renamed from: getDescriptor */
        public final k63.e getF116202c() {
            return descriptor;
        }

        @Override // i63.i
        public final void serialize(l63.f fVar, Object obj) {
            h hVar = (h) obj;
            hVar.getClass();
            k63.e eVar = descriptor;
            l63.d dVarC = fVar.c(eVar);
            h.j(hVar, dVarC, eVar);
            dVarC.b(eVar);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements Parcelable.Creator<h> {
        @Override // android.os.Parcelable.Creator
        public final h createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            parcel.getClass();
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i14 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i14);
                int iA = 0;
                while (iA != i14) {
                    iA = kg.f.a(d.CREATOR, parcel, arrayList3, iA, 1);
                }
                arrayList = arrayList3;
            }
            String string7 = parcel.readString();
            int iA2 = 0;
            String string8 = parcel.readString();
            n nVarCreateFromParcel = parcel.readInt() == 0 ? null : n.CREATOR.createFromParcel(parcel);
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i15 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(i15);
                while (iA2 != i15) {
                    iA2 = kg.f.a(o.CREATOR, parcel, arrayList4, iA2, 1);
                    string = string;
                }
                arrayList2 = arrayList4;
            }
            return new h(string, string2, string3, string4, string5, string6, arrayList, string7, string8, nVarCreateFromParcel, arrayListCreateStringArrayList, arrayList2, parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final h[] newArray(int i14) {
            return new h[i14];
        }
    }

    static {
        o13.n nVar = o13.n.PUBLICATION;
        f17873o = new o13.l[]{null, null, null, null, null, null, o13.m.a(nVar, new b4.b(16)), null, null, null, o13.m.a(nVar, new b4.b(17)), o13.m.a(nVar, new b4.b(18)), null, null};
    }

    public /* synthetic */ h(String str, String str2, String str3, String str4, String str5, String str6, List list, String str7, String str8, n nVar, List list2, List list3, String str9, String str10, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : str, (i14 & 2) != 0 ? null : str2, (i14 & 4) != 0 ? null : str3, (i14 & 8) != 0 ? null : str4, (i14 & 16) != 0 ? null : str5, (i14 & 32) != 0 ? null : str6, (i14 & 64) != 0 ? null : list, (i14 & 128) != 0 ? null : str7, (i14 & 256) != 0 ? null : str8, (i14 & 512) != 0 ? null : nVar, (i14 & 1024) != 0 ? null : list2, (i14 & 2048) != 0 ? null : list3, (i14 & 4096) != 0 ? null : str9, (i14 & 8192) != 0 ? null : str10);
    }

    public static final /* synthetic */ void j(h hVar, l63.d dVar, k63.e eVar) {
        if (dVar.C(eVar) || hVar.bodyParts != null) {
            dVar.d(eVar, 0, y1.f117048a, hVar.bodyParts);
        }
        if (dVar.C(eVar) || hVar.description != null) {
            dVar.d(eVar, 1, y1.f117048a, hVar.description);
        }
        if (dVar.C(eVar) || hVar.difficulty != null) {
            dVar.d(eVar, 2, y1.f117048a, hVar.difficulty);
        }
        if (dVar.C(eVar) || hVar.equipment != null) {
            dVar.d(eVar, 3, y1.f117048a, hVar.equipment);
        }
        if (dVar.C(eVar) || hVar.exerciseCategory != null) {
            dVar.d(eVar, 4, y1.f117048a, hVar.exerciseCategory);
        }
        if (dVar.C(eVar) || hVar.exerciseName != null) {
            dVar.d(eVar, 5, y1.f117048a, hVar.exerciseName);
        }
        boolean zC = dVar.C(eVar);
        o13.l<i63.c<Object>>[] lVarArr = f17873o;
        if (zC || hVar.exerciseSteps != null) {
            dVar.d(eVar, 6, lVarArr[6].getValue(), hVar.exerciseSteps);
        }
        if (dVar.C(eVar) || hVar.focuses != null) {
            dVar.d(eVar, 7, y1.f117048a, hVar.focuses);
        }
        if (dVar.C(eVar) || hVar.locale != null) {
            dVar.d(eVar, 8, y1.f117048a, hVar.locale);
        }
        if (dVar.C(eVar) || hVar.sportType != null) {
            dVar.d(eVar, 9, n.a.f17904a, hVar.sportType);
        }
        if (dVar.C(eVar) || hVar.tips != null) {
            dVar.d(eVar, 10, lVarArr[10].getValue(), hVar.tips);
        }
        if (dVar.C(eVar) || hVar.videos != null) {
            dVar.d(eVar, 11, lVarArr[11].getValue(), hVar.videos);
        }
        if (dVar.C(eVar) || hVar.exerciseSourceId != null) {
            dVar.d(eVar, 12, y1.f117048a, hVar.exerciseSourceId);
        }
        if (!dVar.C(eVar) && hVar.heroImage == null) {
            return;
        }
        dVar.d(eVar, 13, y1.f117048a, hVar.heroImage);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getBodyParts() {
        return this.bodyParts;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getDifficulty() {
        return this.difficulty;
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
        return s.g(this.bodyParts, hVar.bodyParts) && s.g(this.description, hVar.description) && s.g(this.difficulty, hVar.difficulty) && s.g(this.equipment, hVar.equipment) && s.g(this.exerciseCategory, hVar.exerciseCategory) && s.g(this.exerciseName, hVar.exerciseName) && s.g(this.exerciseSteps, hVar.exerciseSteps) && s.g(this.focuses, hVar.focuses) && s.g(this.locale, hVar.locale) && s.g(this.sportType, hVar.sportType) && s.g(this.tips, hVar.tips) && s.g(this.videos, hVar.videos) && s.g(this.exerciseSourceId, hVar.exerciseSourceId) && s.g(this.heroImage, hVar.heroImage);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getEquipment() {
        return this.equipment;
    }

    public final List<d> g() {
        return this.exerciseSteps;
    }

    public final List<String> h() {
        return this.tips;
    }

    public final int hashCode() {
        String str = this.bodyParts;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.description;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.difficulty;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.equipment;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.exerciseCategory;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.exerciseName;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        List<d> list = this.exerciseSteps;
        int iHashCode7 = (iHashCode6 + (list == null ? 0 : list.hashCode())) * 31;
        String str7 = this.focuses;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.locale;
        int iHashCode9 = (iHashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        n nVar = this.sportType;
        int iHashCode10 = (iHashCode9 + (nVar == null ? 0 : nVar.hashCode())) * 31;
        List<String> list2 = this.tips;
        int iHashCode11 = (iHashCode10 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<o> list3 = this.videos;
        int iHashCode12 = (iHashCode11 + (list3 == null ? 0 : list3.hashCode())) * 31;
        String str9 = this.exerciseSourceId;
        int iHashCode13 = (iHashCode12 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.heroImage;
        return iHashCode13 + (str10 != null ? str10.hashCode() : 0);
    }

    public final List<o> i() {
        return this.videos;
    }

    public final String toString() {
        String str = this.bodyParts;
        String str2 = this.description;
        String str3 = this.difficulty;
        String str4 = this.equipment;
        String str5 = this.exerciseCategory;
        String str6 = this.exerciseName;
        List<d> list = this.exerciseSteps;
        String str7 = this.focuses;
        String str8 = this.locale;
        n nVar = this.sportType;
        List<String> list2 = this.tips;
        List<o> list3 = this.videos;
        String str9 = this.exerciseSourceId;
        String str10 = this.heroImage;
        StringBuilder sbI = p6.b.i("MSNWorkoutExerciseDTO(bodyParts=", str, ", description=", str2, ", difficulty=");
        sn.a.t(sbI, str3, ", equipment=", str4, ", exerciseCategory=");
        sn.a.t(sbI, str5, ", exerciseName=", str6, ", exerciseSteps=");
        o2.c.n(", focuses=", str7, ", locale=", sbI, list);
        sbI.append(str8);
        sbI.append(", sportType=");
        sbI.append(nVar);
        sbI.append(", tips=");
        n23.j.z(sbI, list2, ", videos=", list3, ", exerciseSourceId=");
        return e5.h(sbI, str9, ", heroImage=", str10, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.bodyParts);
        parcel.writeString(this.description);
        parcel.writeString(this.difficulty);
        parcel.writeString(this.equipment);
        parcel.writeString(this.exerciseCategory);
        parcel.writeString(this.exerciseName);
        List<d> list = this.exerciseSteps;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itO = u0.o(parcel, list, 1);
            while (itO.hasNext()) {
                ((d) itO.next()).writeToParcel(parcel, i14);
            }
        }
        parcel.writeString(this.focuses);
        parcel.writeString(this.locale);
        n nVar = this.sportType;
        if (nVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            nVar.writeToParcel(parcel, i14);
        }
        parcel.writeStringList(this.tips);
        List<o> list2 = this.videos;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itO2 = u0.o(parcel, list2, 1);
            while (itO2.hasNext()) {
                ((o) itO2.next()).writeToParcel(parcel, i14);
            }
        }
        parcel.writeString(this.exerciseSourceId);
        parcel.writeString(this.heroImage);
    }

    /* JADX INFO: renamed from: bg2.h$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lbg2/h$b;", "", "<init>", "()V", "Li63/c;", "Lbg2/h;", "serializer", "()Li63/c;", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public final i63.c<h> serializer() {
            return a.f17888a;
        }

        private Companion() {
        }
    }

    public /* synthetic */ h(int i14, String str, String str2, String str3, String str4, String str5, String str6, List list, String str7, String str8, n nVar, List list2, List list3, String str9, String str10, u1 u1Var) {
        if ((i14 & 1) == 0) {
            this.bodyParts = null;
        } else {
            this.bodyParts = str;
        }
        if ((i14 & 2) == 0) {
            this.description = null;
        } else {
            this.description = str2;
        }
        if ((i14 & 4) == 0) {
            this.difficulty = null;
        } else {
            this.difficulty = str3;
        }
        if ((i14 & 8) == 0) {
            this.equipment = null;
        } else {
            this.equipment = str4;
        }
        if ((i14 & 16) == 0) {
            this.exerciseCategory = null;
        } else {
            this.exerciseCategory = str5;
        }
        if ((i14 & 32) == 0) {
            this.exerciseName = null;
        } else {
            this.exerciseName = str6;
        }
        if ((i14 & 64) == 0) {
            this.exerciseSteps = null;
        } else {
            this.exerciseSteps = list;
        }
        if ((i14 & 128) == 0) {
            this.focuses = null;
        } else {
            this.focuses = str7;
        }
        if ((i14 & 256) == 0) {
            this.locale = null;
        } else {
            this.locale = str8;
        }
        if ((i14 & 512) == 0) {
            this.sportType = null;
        } else {
            this.sportType = nVar;
        }
        if ((i14 & 1024) == 0) {
            this.tips = null;
        } else {
            this.tips = list2;
        }
        if ((i14 & 2048) == 0) {
            this.videos = null;
        } else {
            this.videos = list3;
        }
        if ((i14 & 4096) == 0) {
            this.exerciseSourceId = null;
        } else {
            this.exerciseSourceId = str9;
        }
        if ((i14 & 8192) == 0) {
            this.heroImage = null;
        } else {
            this.heroImage = str10;
        }
    }

    public h(String str, String str2, String str3, String str4, String str5, String str6, List<d> list, String str7, String str8, n nVar, List<String> list2, List<o> list3, String str9, String str10) {
        this.bodyParts = str;
        this.description = str2;
        this.difficulty = str3;
        this.equipment = str4;
        this.exerciseCategory = str5;
        this.exerciseName = str6;
        this.exerciseSteps = list;
        this.focuses = str7;
        this.locale = str8;
        this.sportType = nVar;
        this.tips = list2;
        this.videos = list3;
        this.exerciseSourceId = str9;
        this.heroImage = str10;
    }

    public h() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (String) null, (String) null, (n) null, (List) null, (List) null, (String) null, (String) null, 16383, (p005kotlin.jvm.internal.j) null);
    }
}

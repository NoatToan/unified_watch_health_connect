package jk0;

import android.os.Parcel;
import android.os.Parcelable;
import com.garmin.proto.generated.GDIInReachMessaging;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import com.mapbox.maps.plugin.locationcomponent.ModelSourceWrapper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import m63.e0;
import m63.k1;
import m63.m0;
import m63.m1;
import m63.u1;
import m63.v0;
import m63.y1;
import p005kotlin.Metadata;
import p13.y;
import u62.z;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 -2\u00020\u0001:\u0002./B§\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u000f\u0012\u0010\b\u0002\u0010 \u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\b\u0012\u0010\b\u0002\u0010\"\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010\b\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#\u0012\u0010\b\u0002\u0010&\u001a\n\u0012\u0004\u0012\u00020%\u0018\u00010\b¢\u0006\u0004\b'\u0010(B\u0099\u0002\b\u0010\u0012\u0006\u0010)\u001a\u00020\u001a\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u000f\u0012\u000e\u0010 \u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\b\u0012\u000e\u0010\"\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010\b\u0012\b\u0010$\u001a\u0004\u0018\u00010#\u0012\u000e\u0010&\u001a\n\u0012\u0004\u0012\u00020%\u0018\u00010\b\u0012\b\u0010+\u001a\u0004\u0018\u00010*¢\u0006\u0004\b'\u0010,¨\u00060"}, d2 = {"Ljk0/x;", "Landroid/os/Parcelable;", "Lc80/u;", "gearType", "Lb63/o;", "firstUseDate", "Lc80/w;", "usageType", "", "Ljk0/g;", "defaultActivityTypes", "Ljk0/p;", "status", "", "uuid", "", "userProfilePk", "name", "brand", ModelSourceWrapper.TYPE, "notes", "retireDate", "maxUsageDate", "", "maxUsageDistanceMeters", "maxUsageDurationSeconds", "", "numActivitiesLinked", "durationUsedSeconds", "distanceUsedMeters", "daysUsed", "Ljk0/e;", "_countsByActivityType", "Ljk0/n;", "images", "", "processing", "Ljk0/k;", "collections", "<init>", "(Lc80/u;Lb63/o;Lc80/w;Ljava/util/List;Ljk0/p;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lb63/o;Lb63/o;Ljava/lang/Double;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Double;Ljava/lang/Long;Ljava/util/List;Ljava/util/List;Ljava/lang/Boolean;Ljava/util/List;)V", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILc80/u;Lb63/o;Lc80/w;Ljava/util/List;Ljk0/p;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lb63/o;Lb63/o;Ljava/lang/Double;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Double;Ljava/lang/Long;Ljava/util/List;Ljava/util/List;Ljava/lang/Boolean;Ljava/util/List;Lm63/u1;)V", "Companion", "a", "b", "gcm-gear_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@i63.h
public final /* data */ class x implements Parcelable {
    public static final o13.l<i63.c<Object>>[] A;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c80.u f99351a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b63.o f99352b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c80.w f99353c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<g> f99354d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p f99355e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f99356f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Long f99357g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f99358h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f99359i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f99360j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f99361k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final b63.o f99362l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final b63.o f99363m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Double f99364n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Long f99365o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Integer f99366p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Long f99367q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Double f99368r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Long f99369t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final List<e> f99370v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final List<n> f99371w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Boolean f99372x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final List<k> f99373y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final o13.t f99374z;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<x> CREATOR = new c();

    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/gear/data/model/GearV2DTO.$serializer", "Lm63/e0;", "Ljk0/x;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-gear_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @o13.e
    public static final /* synthetic */ class a implements e0<x> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f99375a;
        private static final k63.e descriptor;

        static {
            a aVar = new a();
            f99375a = aVar;
            m1 m1Var = new m1("com.garmin.android.apps.connectmobile.gear.data.model.GearV2DTO", aVar, 23);
            m1Var.j("gearType", false);
            m1Var.j("firstUseDate", false);
            m1Var.j("usageType", false);
            m1Var.j("associatedActivityTypes", true);
            m1Var.j("status", true);
            m1Var.j("uuid", true);
            m1Var.j("userProfilePk", true);
            m1Var.j("name", true);
            m1Var.j("brand", true);
            m1Var.j(ModelSourceWrapper.TYPE, true);
            m1Var.j("notes", true);
            m1Var.j("retireDate", true);
            m1Var.j("maxUsageDate", true);
            m1Var.j("maxUsageDistanceMeters", true);
            m1Var.j("maxUsageDurationSeconds", true);
            m1Var.j("numActivitiesLinked", true);
            m1Var.j("durationUsedSeconds", true);
            m1Var.j("distanceUsedMeters", true);
            m1Var.j("daysUsed", true);
            m1Var.j("countsByActivityType", true);
            m1Var.j("images", true);
            m1Var.j("processing", true);
            m1Var.j("collections", true);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // m63.e0
        public final i63.c<?>[] childSerializers() {
            o13.l<i63.c<Object>>[] lVarArr = x.A;
            h63.k kVar = h63.k.f82304a;
            y1 y1Var = y1.f117048a;
            v0 v0Var = v0.f117027a;
            m63.x xVar = m63.x.f117036a;
            return new i63.c[]{lVarArr[0].getValue(), kVar, lVarArr[2].getValue(), j63.a.d(lVarArr[3].getValue()), j63.a.d(lVarArr[4].getValue()), j63.a.d(y1Var), j63.a.d(v0Var), j63.a.d(y1Var), j63.a.d(y1Var), j63.a.d(y1Var), j63.a.d(y1Var), j63.a.d(kVar), j63.a.d(kVar), j63.a.d(xVar), j63.a.d(v0Var), j63.a.d(m0.f116981a), j63.a.d(v0Var), j63.a.d(xVar), j63.a.d(v0Var), j63.a.d(lVarArr[19].getValue()), j63.a.d(lVarArr[20].getValue()), j63.a.d(m63.g.f116948a), j63.a.d(lVarArr[22].getValue())};
        }

        @Override // i63.b
        public final Object deserialize(l63.e eVar) {
            String str;
            int i14;
            eVar.getClass();
            k63.e eVar2 = descriptor;
            l63.c cVarC = eVar.c(eVar2);
            o13.l<i63.c<Object>>[] lVarArr = x.A;
            int i15 = l63.c.f110557a;
            b63.o oVar = null;
            String str2 = null;
            List list = null;
            Boolean bool = null;
            b63.o oVar2 = null;
            List list2 = null;
            int i16 = 0;
            Double d14 = null;
            Long l14 = null;
            Integer num = null;
            Long l15 = null;
            Double d15 = null;
            Long l16 = null;
            List list3 = null;
            int i17 = 0;
            int i18 = 1;
            c80.u uVar = null;
            b63.o oVar3 = null;
            c80.w wVar = null;
            List list4 = null;
            p pVar = null;
            String str3 = null;
            Long l17 = null;
            String str4 = null;
            String str5 = null;
            String str6 = null;
            while (i18 != 0) {
                int iE = cVarC.e(eVar2);
                switch (iE) {
                    case -1:
                        i18 = i17;
                        list = list;
                        i17 = i18;
                        str2 = str2;
                        break;
                    case 0:
                        List list5 = list;
                        int i19 = i17;
                        uVar = (c80.u) cVarC.l(eVar2, i19, lVarArr[i17].getValue(), uVar);
                        i16 |= 1;
                        oVar3 = oVar3;
                        list = list5;
                        oVar = oVar;
                        i17 = i19;
                        str2 = str2;
                        break;
                    case 1:
                        str = str2;
                        oVar3 = (b63.o) cVarC.l(eVar2, 1, h63.k.f82304a, oVar3);
                        i16 |= 2;
                        wVar = wVar;
                        str2 = str;
                        list = list;
                        oVar = oVar;
                        break;
                    case 2:
                        str = str2;
                        wVar = (c80.w) cVarC.l(eVar2, 2, lVarArr[2].getValue(), wVar);
                        i16 |= 4;
                        str2 = str;
                        list = list;
                        oVar = oVar;
                        break;
                    case 3:
                        str = str2;
                        list4 = (List) cVarC.v(eVar2, 3, lVarArr[3].getValue(), list4);
                        i16 |= 8;
                        str2 = str;
                        list = list;
                        oVar = oVar;
                        break;
                    case 4:
                        str = str2;
                        pVar = (p) cVarC.v(eVar2, 4, lVarArr[4].getValue(), pVar);
                        i16 |= 16;
                        str2 = str;
                        list = list;
                        oVar = oVar;
                        break;
                    case 5:
                        str = str2;
                        str3 = (String) cVarC.v(eVar2, 5, y1.f117048a, str3);
                        i16 |= 32;
                        str2 = str;
                        list = list;
                        oVar = oVar;
                        break;
                    case 6:
                        str = str2;
                        l17 = (Long) cVarC.v(eVar2, 6, v0.f117027a, l17);
                        i16 |= 64;
                        str2 = str;
                        list = list;
                        oVar = oVar;
                        break;
                    case 7:
                        str = str2;
                        str4 = (String) cVarC.v(eVar2, 7, y1.f117048a, str4);
                        i16 |= 128;
                        str2 = str;
                        list = list;
                        oVar = oVar;
                        break;
                    case 8:
                        str = str2;
                        str5 = (String) cVarC.v(eVar2, 8, y1.f117048a, str5);
                        i16 |= 256;
                        str2 = str;
                        list = list;
                        oVar = oVar;
                        break;
                    case 9:
                        str = str2;
                        str6 = (String) cVarC.v(eVar2, 9, y1.f117048a, str6);
                        i16 |= 512;
                        str2 = str;
                        list = list;
                        oVar = oVar;
                        break;
                    case 10:
                        list = list;
                        b63.o oVar4 = oVar;
                        oVar = oVar4;
                        str2 = (String) cVarC.v(eVar2, 10, y1.f117048a, str2);
                        i16 |= 1024;
                        list = list;
                        oVar = oVar;
                        break;
                    case 11:
                        oVar = (b63.o) cVarC.v(eVar2, 11, h63.k.f82304a, oVar);
                        i16 |= 2048;
                        str2 = str2;
                        list = list;
                        break;
                    case 12:
                        oVar = oVar;
                        str2 = str2;
                        oVar2 = (b63.o) cVarC.v(eVar2, 12, h63.k.f82304a, oVar2);
                        i16 |= 4096;
                        str2 = str2;
                        oVar = oVar;
                        break;
                    case 13:
                        oVar = oVar;
                        str2 = str2;
                        d14 = (Double) cVarC.v(eVar2, 13, m63.x.f117036a, d14);
                        i16 |= 8192;
                        str2 = str2;
                        oVar = oVar;
                        break;
                    case 14:
                        oVar = oVar;
                        str2 = str2;
                        l14 = (Long) cVarC.v(eVar2, 14, v0.f117027a, l14);
                        i16 |= 16384;
                        str2 = str2;
                        oVar = oVar;
                        break;
                    case 15:
                        num = (Integer) cVarC.v(eVar2, 15, m0.f116981a, num);
                        i14 = 32768;
                        i16 |= i14;
                        str2 = str2;
                        oVar = oVar;
                        break;
                    case 16:
                        l15 = (Long) cVarC.v(eVar2, 16, v0.f117027a, l15);
                        i14 = 65536;
                        i16 |= i14;
                        str2 = str2;
                        oVar = oVar;
                        break;
                    case 17:
                        d15 = (Double) cVarC.v(eVar2, 17, m63.x.f117036a, d15);
                        i14 = 131072;
                        i16 |= i14;
                        str2 = str2;
                        oVar = oVar;
                        break;
                    case 18:
                        l16 = (Long) cVarC.v(eVar2, 18, v0.f117027a, l16);
                        i14 = GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE;
                        i16 |= i14;
                        str2 = str2;
                        oVar = oVar;
                        break;
                    case 19:
                        list3 = (List) cVarC.v(eVar2, 19, lVarArr[19].getValue(), list3);
                        i14 = 524288;
                        i16 |= i14;
                        str2 = str2;
                        oVar = oVar;
                        break;
                    case 20:
                        list2 = (List) cVarC.v(eVar2, 20, lVarArr[20].getValue(), list2);
                        i14 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                        i16 |= i14;
                        str2 = str2;
                        oVar = oVar;
                        break;
                    case 21:
                        bool = (Boolean) cVarC.v(eVar2, 21, m63.g.f116948a, bool);
                        i14 = 2097152;
                        i16 |= i14;
                        str2 = str2;
                        oVar = oVar;
                        break;
                    case 22:
                        list = (List) cVarC.v(eVar2, 22, lVarArr[22].getValue(), list);
                        i14 = 4194304;
                        i16 |= i14;
                        str2 = str2;
                        oVar = oVar;
                        break;
                    default:
                        hb.a.o(iE);
                        return null;
                }
            }
            String str7 = str2;
            List list6 = list;
            c80.u uVar2 = uVar;
            b63.o oVar5 = oVar3;
            c80.w wVar2 = wVar;
            cVarC.b(eVar2);
            String str8 = str4;
            Long l18 = l16;
            String str9 = str5;
            List list7 = list3;
            return new x(i16, uVar2, oVar5, wVar2, list4, pVar, str3, l17, str8, str9, str6, str7, oVar, oVar2, d14, l14, num, l15, d15, l18, list7, list2, bool, list6, (u1) null);
        }

        @Override // i63.i, i63.b
        /* JADX INFO: renamed from: getDescriptor */
        public final k63.e getF94809a() {
            return descriptor;
        }

        @Override // i63.i
        public final void serialize(l63.f fVar, Object obj) {
            x xVar = (x) obj;
            xVar.getClass();
            List<k> list = xVar.f99373y;
            Boolean bool = xVar.f99372x;
            List<n> list2 = xVar.f99371w;
            List<e> list3 = xVar.f99370v;
            Long l14 = xVar.f99369t;
            Double d14 = xVar.f99368r;
            Long l15 = xVar.f99367q;
            Integer num = xVar.f99366p;
            Long l16 = xVar.f99365o;
            Double d15 = xVar.f99364n;
            b63.o oVar = xVar.f99363m;
            b63.o oVar2 = xVar.f99362l;
            k63.e eVar = descriptor;
            l63.d dVarC = fVar.c(eVar);
            o13.l<i63.c<Object>>[] lVarArr = x.A;
            i63.c<Object> value = lVarArr[0].getValue();
            c80.u uVar = xVar.f99351a;
            String str = xVar.f99361k;
            String str2 = xVar.f99360j;
            String str3 = xVar.f99359i;
            String str4 = xVar.f99358h;
            Long l17 = xVar.f99357g;
            String str5 = xVar.f99356f;
            p pVar = xVar.f99355e;
            List<g> list4 = xVar.f99354d;
            dVarC.e(eVar, 0, value, uVar);
            h63.k kVar = h63.k.f82304a;
            dVarC.e(eVar, 1, kVar, xVar.f99352b);
            dVarC.e(eVar, 2, lVarArr[2].getValue(), xVar.f99353c);
            if (dVarC.C(eVar) || list4 != null) {
                dVarC.d(eVar, 3, lVarArr[3].getValue(), list4);
            }
            if (dVarC.C(eVar) || pVar != null) {
                dVarC.d(eVar, 4, lVarArr[4].getValue(), pVar);
            }
            if (dVarC.C(eVar) || str5 != null) {
                dVarC.d(eVar, 5, y1.f117048a, str5);
            }
            if (dVarC.C(eVar) || l17 != null) {
                dVarC.d(eVar, 6, v0.f117027a, l17);
            }
            if (dVarC.C(eVar) || str4 != null) {
                dVarC.d(eVar, 7, y1.f117048a, str4);
            }
            if (dVarC.C(eVar) || str3 != null) {
                dVarC.d(eVar, 8, y1.f117048a, str3);
            }
            if (dVarC.C(eVar) || str2 != null) {
                dVarC.d(eVar, 9, y1.f117048a, str2);
            }
            if (dVarC.C(eVar) || str != null) {
                dVarC.d(eVar, 10, y1.f117048a, str);
            }
            if (dVarC.C(eVar) || oVar2 != null) {
                dVarC.d(eVar, 11, kVar, oVar2);
            }
            if (dVarC.C(eVar) || oVar != null) {
                dVarC.d(eVar, 12, kVar, oVar);
            }
            if (dVarC.C(eVar) || d15 != null) {
                dVarC.d(eVar, 13, m63.x.f117036a, d15);
            }
            if (dVarC.C(eVar) || l16 != null) {
                dVarC.d(eVar, 14, v0.f117027a, l16);
            }
            if (dVarC.C(eVar) || num != null) {
                dVarC.d(eVar, 15, m0.f116981a, num);
            }
            if (dVarC.C(eVar) || l15 != null) {
                dVarC.d(eVar, 16, v0.f117027a, l15);
            }
            if (dVarC.C(eVar) || d14 != null) {
                dVarC.d(eVar, 17, m63.x.f117036a, d14);
            }
            if (dVarC.C(eVar) || l14 != null) {
                dVarC.d(eVar, 18, v0.f117027a, l14);
            }
            if (dVarC.C(eVar) || list3 != null) {
                dVarC.d(eVar, 19, lVarArr[19].getValue(), list3);
            }
            if (dVarC.C(eVar) || list2 != null) {
                dVarC.d(eVar, 20, lVarArr[20].getValue(), list2);
            }
            if (dVarC.C(eVar) || bool != null) {
                dVarC.d(eVar, 21, m63.g.f116948a, bool);
            }
            if (dVarC.C(eVar) || list != null) {
                dVarC.d(eVar, 22, lVarArr[22].getValue(), list);
            }
            dVarC.b(eVar);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements Parcelable.Creator<x> {
        @Override // android.os.Parcelable.Creator
        public final x createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            c80.u uVar;
            ArrayList arrayList3;
            Boolean boolValueOf;
            ArrayList arrayList4;
            ArrayList arrayList5;
            parcel.getClass();
            c80.u uVarValueOf = c80.u.valueOf(parcel.readString());
            b63.o oVarA = vk0.g.f178573a.a(parcel);
            c80.w wVarValueOf = c80.w.valueOf(parcel.readString());
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i14 = parcel.readInt();
                arrayList = new ArrayList(i14);
                int iA = 0;
                while (iA != i14) {
                    iA = kg.f.a(g.CREATOR, parcel, arrayList, iA, 1);
                }
            }
            p pVarValueOf = parcel.readInt() == 0 ? null : p.valueOf(parcel.readString());
            ArrayList arrayList6 = arrayList;
            String string = parcel.readString();
            Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            String string2 = parcel.readString();
            Long l14 = lValueOf;
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            vk0.i iVar = vk0.i.f178575a;
            b63.o oVarA2 = iVar.a(parcel);
            b63.o oVarA3 = iVar.a(parcel);
            Double dValueOf = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            Long lValueOf2 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Long lValueOf3 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            Double dValueOf2 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            Long lValueOf4 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            if (parcel.readInt() != 0) {
                int i15 = parcel.readInt();
                arrayList2 = new ArrayList(i15);
                int iA2 = 0;
                while (true) {
                    uVar = uVarValueOf;
                    if (iA2 == i15) {
                        break;
                    }
                    iA2 = kg.f.a(e.CREATOR, parcel, arrayList2, iA2, 1);
                    uVarValueOf = uVar;
                    oVarA = oVarA;
                }
            } else {
                arrayList2 = null;
                uVar = uVarValueOf;
            }
            b63.o oVar = oVarA;
            if (parcel.readInt() == 0) {
                arrayList3 = null;
            } else {
                int i16 = parcel.readInt();
                arrayList3 = new ArrayList(i16);
                int iA3 = 0;
                while (iA3 != i16) {
                    iA3 = kg.f.a(n.CREATOR, parcel, arrayList3, iA3, 1);
                    i16 = i16;
                }
            }
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() != 0) {
                int i17 = parcel.readInt();
                arrayList4 = new ArrayList(i17);
                int iA4 = 0;
                while (true) {
                    arrayList5 = arrayList2;
                    if (iA4 == i17) {
                        break;
                    }
                    iA4 = kg.f.a(k.CREATOR, parcel, arrayList4, iA4, 1);
                    arrayList2 = arrayList5;
                    arrayList3 = arrayList3;
                }
            } else {
                arrayList4 = null;
                arrayList5 = arrayList2;
            }
            return new x(uVar, oVar, wVarValueOf, arrayList6, pVarValueOf, string, l14, string2, string3, string4, string5, oVarA2, oVarA3, dValueOf, lValueOf2, numValueOf, lValueOf3, dValueOf2, lValueOf4, arrayList5, arrayList3, boolValueOf, arrayList4);
        }

        @Override // android.os.Parcelable.Creator
        public final x[] newArray(int i14) {
            return new x[i14];
        }
    }

    static {
        o13.n nVar = o13.n.PUBLICATION;
        A = new o13.l[]{o13.m.a(nVar, new je0.o(28)), null, o13.m.a(nVar, new je0.o(29)), o13.m.a(nVar, new w(0)), o13.m.a(nVar, new w(1)), null, null, null, null, null, null, null, null, null, null, null, null, null, null, o13.m.a(nVar, new w(2)), o13.m.a(nVar, new w(3)), null, o13.m.a(nVar, new w(4))};
    }

    public /* synthetic */ x(int i14, c80.u uVar, b63.o oVar, c80.w wVar, List list, p pVar, String str, Long l14, String str2, String str3, String str4, String str5, b63.o oVar2, b63.o oVar3, Double d14, Long l15, Integer num, Long l16, Double d15, Long l17, List list2, List list3, Boolean bool, List list4, u1 u1Var) {
        if (7 != (i14 & 7)) {
            k1.h(i14, 7, a.f99375a.getF94809a());
            throw null;
        }
        this.f99351a = uVar;
        this.f99352b = oVar;
        this.f99353c = wVar;
        if ((i14 & 8) == 0) {
            this.f99354d = null;
        } else {
            this.f99354d = list;
        }
        if ((i14 & 16) == 0) {
            this.f99355e = null;
        } else {
            this.f99355e = pVar;
        }
        if ((i14 & 32) == 0) {
            this.f99356f = null;
        } else {
            this.f99356f = str;
        }
        if ((i14 & 64) == 0) {
            this.f99357g = null;
        } else {
            this.f99357g = l14;
        }
        if ((i14 & 128) == 0) {
            this.f99358h = null;
        } else {
            this.f99358h = str2;
        }
        if ((i14 & 256) == 0) {
            this.f99359i = null;
        } else {
            this.f99359i = str3;
        }
        if ((i14 & 512) == 0) {
            this.f99360j = null;
        } else {
            this.f99360j = str4;
        }
        if ((i14 & 1024) == 0) {
            this.f99361k = null;
        } else {
            this.f99361k = str5;
        }
        if ((i14 & 2048) == 0) {
            this.f99362l = null;
        } else {
            this.f99362l = oVar2;
        }
        if ((i14 & 4096) == 0) {
            this.f99363m = null;
        } else {
            this.f99363m = oVar3;
        }
        if ((i14 & 8192) == 0) {
            this.f99364n = null;
        } else {
            this.f99364n = d14;
        }
        if ((i14 & 16384) == 0) {
            this.f99365o = null;
        } else {
            this.f99365o = l15;
        }
        if ((32768 & i14) == 0) {
            this.f99366p = null;
        } else {
            this.f99366p = num;
        }
        if ((65536 & i14) == 0) {
            this.f99367q = null;
        } else {
            this.f99367q = l16;
        }
        if ((131072 & i14) == 0) {
            this.f99368r = null;
        } else {
            this.f99368r = d15;
        }
        if ((262144 & i14) == 0) {
            this.f99369t = null;
        } else {
            this.f99369t = l17;
        }
        if ((524288 & i14) == 0) {
            this.f99370v = null;
        } else {
            this.f99370v = list2;
        }
        if ((1048576 & i14) == 0) {
            this.f99371w = null;
        } else {
            this.f99371w = list3;
        }
        if ((2097152 & i14) == 0) {
            this.f99372x = null;
        } else {
            this.f99372x = bool;
        }
        if ((i14 & 4194304) == 0) {
            this.f99373y = null;
        } else {
            this.f99373y = list4;
        }
        final int i15 = 1;
        this.f99374z = o13.m.b(new e23.a(this) { // from class: jk0.v

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ x f99349b;

            {
                this.f99349b = this;
            }

            /* JADX WARN: Code duplicated, block: B:38:0x0045 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:41:0x0015 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:46:0x0094 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:49:0x0064 A[SYNTHETIC] */
            /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r5v4 java.lang.Object, still in use, count: 2, list:
                  (r5v4 java.lang.Object) from 0x0090: PHI (r5 I:??) = (r5v1 java.lang.Object), (r5v4 java.lang.Object) binds: [B:32:0x008f, B:52:0x0090] A[DONT_GENERATE, DONT_INLINE]
                  (r5v4 java.lang.Object) from 0x0081: CHECK_CAST (am.x0) (r5v4 java.lang.Object)
                	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
                	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
                	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
                	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
                	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
                	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
                	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
                	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
                	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
                	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
                	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
                */
            @Override // e23.a
            public final java.lang.Object invoke() {
                /*
                    r9 = this;
                    int r0 = r2
                    switch(r0) {
                        case 0: goto L54;
                        default: goto L5;
                    }
                L5:
                    jk0.x r0 = r9.f99349b
                    java.util.List<jk0.e> r0 = r0.f99370v
                    r1 = 0
                    if (r0 == 0) goto L53
                    q13.c r2 = new q13.c
                    r2.<init>()
                    java.util.Iterator r0 = r0.iterator()
                L15:
                    boolean r3 = r0.hasNext()
                    if (r3 == 0) goto L4f
                    java.lang.Object r3 = r0.next()
                    jk0.e r3 = (jk0.e) r3
                    w13.c r4 = am.x0.H3
                    java.util.Iterator r4 = r4.iterator()
                L27:
                    boolean r5 = r4.hasNext()
                    if (r5 == 0) goto L40
                    java.lang.Object r5 = r4.next()
                    r6 = r5
                    am.x0 r6 = (am.x0) r6
                    java.lang.String r6 = r6.f4358a
                    java.lang.String r7 = r3.f99243a
                    r8 = 1
                    boolean r6 = d53.u.q(r6, r7, r8)
                    if (r6 == 0) goto L27
                    goto L41
                L40:
                    r5 = r1
                L41:
                    am.x0 r5 = (am.x0) r5
                    if (r5 == 0) goto L15
                    int r3 = r3.f99244b
                    java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                    r2.put(r5, r3)
                    goto L15
                L4f:
                    q13.c r1 = r2.b()
                L53:
                    return r1
                L54:
                    jk0.x r0 = r9.f99349b
                    java.util.List<jk0.e> r0 = r0.f99370v
                    r1 = 0
                    if (r0 == 0) goto La2
                    q13.c r2 = new q13.c
                    r2.<init>()
                    java.util.Iterator r0 = r0.iterator()
                L64:
                    boolean r3 = r0.hasNext()
                    if (r3 == 0) goto L9e
                    java.lang.Object r3 = r0.next()
                    jk0.e r3 = (jk0.e) r3
                    w13.c r4 = am.x0.H3
                    java.util.Iterator r4 = r4.iterator()
                L76:
                    boolean r5 = r4.hasNext()
                    if (r5 == 0) goto L8f
                    java.lang.Object r5 = r4.next()
                    r6 = r5
                    am.x0 r6 = (am.x0) r6
                    java.lang.String r6 = r6.f4358a
                    java.lang.String r7 = r3.f99243a
                    r8 = 1
                    boolean r6 = d53.u.q(r6, r7, r8)
                    if (r6 == 0) goto L76
                    goto L90
                L8f:
                    r5 = r1
                L90:
                    am.x0 r5 = (am.x0) r5
                    if (r5 == 0) goto L64
                    int r3 = r3.f99244b
                    java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                    r2.put(r5, r3)
                    goto L64
                L9e:
                    q13.c r1 = r2.b()
                La2:
                    return r1
                */
                throw new UnsupportedOperationException("Method not decompiled: jk0.v.invoke():java.lang.Object");
            }
        });
    }

    public static x b(x xVar, c80.u uVar, b63.o oVar, c80.w wVar, ArrayList arrayList, p pVar, String str, String str2, String str3, String str4, b63.o oVar2, b63.o oVar3, Double d14, Long l14, List list, List list2, int i14) {
        c80.u uVar2 = (i14 & 1) != 0 ? xVar.f99351a : uVar;
        b63.o oVar4 = (i14 & 2) != 0 ? xVar.f99352b : oVar;
        c80.w wVar2 = (i14 & 4) != 0 ? xVar.f99353c : wVar;
        List<g> list3 = (i14 & 8) != 0 ? xVar.f99354d : arrayList;
        p pVar2 = (i14 & 16) != 0 ? xVar.f99355e : pVar;
        String str5 = xVar.f99356f;
        Long l15 = xVar.f99357g;
        String str6 = (i14 & 128) != 0 ? xVar.f99358h : str;
        String str7 = (i14 & 256) != 0 ? xVar.f99359i : str2;
        String str8 = (i14 & 512) != 0 ? xVar.f99360j : str3;
        String str9 = (i14 & 1024) != 0 ? xVar.f99361k : str4;
        b63.o oVar5 = (i14 & 2048) != 0 ? xVar.f99362l : oVar2;
        b63.o oVar6 = (i14 & 4096) != 0 ? xVar.f99363m : oVar3;
        Double d15 = (i14 & 8192) != 0 ? xVar.f99364n : d14;
        Long l16 = (i14 & 16384) != 0 ? xVar.f99365o : l14;
        Integer num = xVar.f99366p;
        Long l17 = xVar.f99367q;
        Double d16 = xVar.f99368r;
        Long l18 = xVar.f99369t;
        List<e> list4 = xVar.f99370v;
        List list5 = (i14 & ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? xVar.f99371w : list;
        Boolean bool = xVar.f99372x;
        List list6 = (i14 & 4194304) != 0 ? xVar.f99373y : list2;
        xVar.getClass();
        uVar2.getClass();
        oVar4.getClass();
        wVar2.getClass();
        return new x(uVar2, oVar4, wVar2, list3, pVar2, str5, l15, str6, str7, str8, str9, oVar5, oVar6, d15, l16, num, l17, d16, l18, list4, list5, bool, list6);
    }

    public final com.garmin.android.apps.connectmobile.gear.presentation.navigation.b d() {
        ArrayList arrayList;
        List<n> list = this.f99371w;
        if (list != null) {
            arrayList = new ArrayList(y.r(list, 10));
            for (n nVar : list) {
                nVar.getClass();
                arrayList.add(new com.garmin.android.apps.connectmobile.gear.presentation.navigation.a(nVar.f99295a, nVar.f99296b, nVar.f99297c, nVar.f99298d, nVar.f99299e, nVar.f99300f));
            }
        } else {
            arrayList = null;
        }
        return new com.garmin.android.apps.connectmobile.gear.presentation.navigation.b(this.f99351a, this.f99352b, this.f99353c, this.f99354d, this.f99355e, this.f99356f, this.f99357g, this.f99358h, this.f99359i, this.f99360j, this.f99361k, this.f99362l, this.f99363m, this.f99364n, this.f99365o, this.f99366p, this.f99367q, this.f99368r, this.f99369t, this.f99370v, arrayList, this.f99372x, this.f99373y);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return this.f99351a == xVar.f99351a && p005kotlin.jvm.internal.s.g(this.f99352b, xVar.f99352b) && this.f99353c == xVar.f99353c && p005kotlin.jvm.internal.s.g(this.f99354d, xVar.f99354d) && this.f99355e == xVar.f99355e && p005kotlin.jvm.internal.s.g(this.f99356f, xVar.f99356f) && p005kotlin.jvm.internal.s.g(this.f99357g, xVar.f99357g) && p005kotlin.jvm.internal.s.g(this.f99358h, xVar.f99358h) && p005kotlin.jvm.internal.s.g(this.f99359i, xVar.f99359i) && p005kotlin.jvm.internal.s.g(this.f99360j, xVar.f99360j) && p005kotlin.jvm.internal.s.g(this.f99361k, xVar.f99361k) && p005kotlin.jvm.internal.s.g(this.f99362l, xVar.f99362l) && p005kotlin.jvm.internal.s.g(this.f99363m, xVar.f99363m) && p005kotlin.jvm.internal.s.g(this.f99364n, xVar.f99364n) && p005kotlin.jvm.internal.s.g(this.f99365o, xVar.f99365o) && p005kotlin.jvm.internal.s.g(this.f99366p, xVar.f99366p) && p005kotlin.jvm.internal.s.g(this.f99367q, xVar.f99367q) && p005kotlin.jvm.internal.s.g(this.f99368r, xVar.f99368r) && p005kotlin.jvm.internal.s.g(this.f99369t, xVar.f99369t) && p005kotlin.jvm.internal.s.g(this.f99370v, xVar.f99370v) && p005kotlin.jvm.internal.s.g(this.f99371w, xVar.f99371w) && p005kotlin.jvm.internal.s.g(this.f99372x, xVar.f99372x) && p005kotlin.jvm.internal.s.g(this.f99373y, xVar.f99373y);
    }

    public final int hashCode() {
        int iHashCode = (this.f99353c.hashCode() + n23.j.a(this.f99352b.f16206a, this.f99351a.hashCode() * 31, 31)) * 31;
        List<g> list = this.f99354d;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        p pVar = this.f99355e;
        int iHashCode3 = (iHashCode2 + (pVar == null ? 0 : pVar.hashCode())) * 31;
        String str = this.f99356f;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        Long l14 = this.f99357g;
        int iHashCode5 = (iHashCode4 + (l14 == null ? 0 : l14.hashCode())) * 31;
        String str2 = this.f99358h;
        int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f99359i;
        int iHashCode7 = (iHashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f99360j;
        int iHashCode8 = (iHashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f99361k;
        int iHashCode9 = (iHashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        b63.o oVar = this.f99362l;
        int iHashCode10 = (iHashCode9 + (oVar == null ? 0 : oVar.f16206a.hashCode())) * 31;
        b63.o oVar2 = this.f99363m;
        int iHashCode11 = (iHashCode10 + (oVar2 == null ? 0 : oVar2.f16206a.hashCode())) * 31;
        Double d14 = this.f99364n;
        int iHashCode12 = (iHashCode11 + (d14 == null ? 0 : d14.hashCode())) * 31;
        Long l15 = this.f99365o;
        int iHashCode13 = (iHashCode12 + (l15 == null ? 0 : l15.hashCode())) * 31;
        Integer num = this.f99366p;
        int iHashCode14 = (iHashCode13 + (num == null ? 0 : num.hashCode())) * 31;
        Long l16 = this.f99367q;
        int iHashCode15 = (iHashCode14 + (l16 == null ? 0 : l16.hashCode())) * 31;
        Double d15 = this.f99368r;
        int iHashCode16 = (iHashCode15 + (d15 == null ? 0 : d15.hashCode())) * 31;
        Long l17 = this.f99369t;
        int iHashCode17 = (iHashCode16 + (l17 == null ? 0 : l17.hashCode())) * 31;
        List<e> list2 = this.f99370v;
        int iHashCode18 = (iHashCode17 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<n> list3 = this.f99371w;
        int iHashCode19 = (iHashCode18 + (list3 == null ? 0 : list3.hashCode())) * 31;
        Boolean bool = this.f99372x;
        int iHashCode20 = (iHashCode19 + (bool == null ? 0 : bool.hashCode())) * 31;
        List<k> list4 = this.f99373y;
        return iHashCode20 + (list4 != null ? list4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("GearV2DTO(gearType=");
        sb3.append(this.f99351a);
        sb3.append(", firstUseDate=");
        sb3.append(this.f99352b);
        sb3.append(", usageType=");
        sb3.append(this.f99353c);
        sb3.append(", defaultActivityTypes=");
        sb3.append(this.f99354d);
        sb3.append(", status=");
        sb3.append(this.f99355e);
        sb3.append(", uuid=");
        sb3.append(this.f99356f);
        sb3.append(", userProfilePk=");
        b71.i.q(this.f99357g, ", name=", this.f99358h, ", brand=", sb3);
        sn.a.t(sb3, this.f99359i, ", model=", this.f99360j, ", notes=");
        sb3.append(this.f99361k);
        sb3.append(", retireDate=");
        sb3.append(this.f99362l);
        sb3.append(", maxUsageDate=");
        sb3.append(this.f99363m);
        sb3.append(", maxUsageDistanceMeters=");
        sb3.append(this.f99364n);
        sb3.append(", maxUsageDurationSeconds=");
        sb3.append(this.f99365o);
        sb3.append(", numActivitiesLinked=");
        sb3.append(this.f99366p);
        sb3.append(", durationUsedSeconds=");
        sb3.append(this.f99367q);
        sb3.append(", distanceUsedMeters=");
        sb3.append(this.f99368r);
        sb3.append(", daysUsed=");
        sb3.append(this.f99369t);
        sb3.append(", _countsByActivityType=");
        sb3.append(this.f99370v);
        sb3.append(", images=");
        sb3.append(this.f99371w);
        sb3.append(", processing=");
        sb3.append(this.f99372x);
        sb3.append(", collections=");
        return z.c(sb3, this.f99373y, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.f99351a.name());
        vk0.g.f178573a.b(this.f99352b, parcel);
        parcel.writeString(this.f99353c.name());
        List<g> list = this.f99354d;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itO = u0.o(parcel, list, 1);
            while (itO.hasNext()) {
                ((g) itO.next()).writeToParcel(parcel, i14);
            }
        }
        p pVar = this.f99355e;
        if (pVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(pVar.name());
        }
        parcel.writeString(this.f99356f);
        Long l14 = this.f99357g;
        if (l14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l14);
        }
        parcel.writeString(this.f99358h);
        parcel.writeString(this.f99359i);
        parcel.writeString(this.f99360j);
        parcel.writeString(this.f99361k);
        vk0.i iVar = vk0.i.f178575a;
        iVar.b(this.f99362l, parcel);
        iVar.b(this.f99363m, parcel);
        Double d14 = this.f99364n;
        if (d14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d14);
        }
        Long l15 = this.f99365o;
        if (l15 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l15);
        }
        Integer num = this.f99366p;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num);
        }
        Long l16 = this.f99367q;
        if (l16 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l16);
        }
        Double d15 = this.f99368r;
        if (d15 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d15);
        }
        Long l17 = this.f99369t;
        if (l17 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l17);
        }
        List<e> list2 = this.f99370v;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itO2 = u0.o(parcel, list2, 1);
            while (itO2.hasNext()) {
                ((e) itO2.next()).writeToParcel(parcel, i14);
            }
        }
        List<n> list3 = this.f99371w;
        if (list3 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itO3 = u0.o(parcel, list3, 1);
            while (itO3.hasNext()) {
                ((n) itO3.next()).writeToParcel(parcel, i14);
            }
        }
        Boolean bool = this.f99372x;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool);
        }
        List<k> list4 = this.f99373y;
        if (list4 == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itO4 = u0.o(parcel, list4, 1);
        while (itO4.hasNext()) {
            ((k) itO4.next()).writeToParcel(parcel, i14);
        }
    }

    /* JADX INFO: renamed from: jk0.x$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ljk0/x$b;", "", "<init>", "()V", "Li63/c;", "Ljk0/x;", "serializer", "()Li63/c;", "gcm-gear_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public final i63.c<x> serializer() {
            return a.f99375a;
        }

        private Companion() {
        }
    }

    public x(c80.u uVar, b63.o oVar, c80.w wVar, List<g> list, p pVar, String str, Long l14, String str2, String str3, String str4, String str5, b63.o oVar2, b63.o oVar3, Double d14, Long l15, Integer num, Long l16, Double d15, Long l17, List<e> list2, List<n> list3, Boolean bool, List<k> list4) {
        uVar.getClass();
        oVar.getClass();
        wVar.getClass();
        this.f99351a = uVar;
        this.f99352b = oVar;
        this.f99353c = wVar;
        this.f99354d = list;
        this.f99355e = pVar;
        this.f99356f = str;
        this.f99357g = l14;
        this.f99358h = str2;
        this.f99359i = str3;
        this.f99360j = str4;
        this.f99361k = str5;
        this.f99362l = oVar2;
        this.f99363m = oVar3;
        this.f99364n = d14;
        this.f99365o = l15;
        this.f99366p = num;
        this.f99367q = l16;
        this.f99368r = d15;
        this.f99369t = l17;
        this.f99370v = list2;
        this.f99371w = list3;
        this.f99372x = bool;
        this.f99373y = list4;
        final int i14 = 0;
        this.f99374z = o13.m.b(new e23.a(this) { // from class: jk0.v

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ x f99349b;

            {
                this.f99349b = this;
            }

            /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r5v4 java.lang.Object, still in use, count: 2, list:
                  (r5v4 java.lang.Object) from 0x0090: PHI (r5 I:??) = (r5v1 java.lang.Object), (r5v4 java.lang.Object) binds: [B:32:0x008f, B:52:0x0090] A[DONT_GENERATE, DONT_INLINE]
                  (r5v4 java.lang.Object) from 0x0081: CHECK_CAST (am.x0) (r5v4 java.lang.Object)
                	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
                	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
                	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
                	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
                	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
                	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
                	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
                	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
                	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
                	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
                */
            @Override // e23.a
            public final java.lang.Object invoke() {
                /*
                    r9 = this;
                    int r0 = r2
                    switch(r0) {
                        case 0: goto L54;
                        default: goto L5;
                    }
                L5:
                    jk0.x r0 = r9.f99349b
                    java.util.List<jk0.e> r0 = r0.f99370v
                    r1 = 0
                    if (r0 == 0) goto L53
                    q13.c r2 = new q13.c
                    r2.<init>()
                    java.util.Iterator r0 = r0.iterator()
                L15:
                    boolean r3 = r0.hasNext()
                    if (r3 == 0) goto L4f
                    java.lang.Object r3 = r0.next()
                    jk0.e r3 = (jk0.e) r3
                    w13.c r4 = am.x0.H3
                    java.util.Iterator r4 = r4.iterator()
                L27:
                    boolean r5 = r4.hasNext()
                    if (r5 == 0) goto L40
                    java.lang.Object r5 = r4.next()
                    r6 = r5
                    am.x0 r6 = (am.x0) r6
                    java.lang.String r6 = r6.f4358a
                    java.lang.String r7 = r3.f99243a
                    r8 = 1
                    boolean r6 = d53.u.q(r6, r7, r8)
                    if (r6 == 0) goto L27
                    goto L41
                L40:
                    r5 = r1
                L41:
                    am.x0 r5 = (am.x0) r5
                    if (r5 == 0) goto L15
                    int r3 = r3.f99244b
                    java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                    r2.put(r5, r3)
                    goto L15
                L4f:
                    q13.c r1 = r2.b()
                L53:
                    return r1
                L54:
                    jk0.x r0 = r9.f99349b
                    java.util.List<jk0.e> r0 = r0.f99370v
                    r1 = 0
                    if (r0 == 0) goto La2
                    q13.c r2 = new q13.c
                    r2.<init>()
                    java.util.Iterator r0 = r0.iterator()
                L64:
                    boolean r3 = r0.hasNext()
                    if (r3 == 0) goto L9e
                    java.lang.Object r3 = r0.next()
                    jk0.e r3 = (jk0.e) r3
                    w13.c r4 = am.x0.H3
                    java.util.Iterator r4 = r4.iterator()
                L76:
                    boolean r5 = r4.hasNext()
                    if (r5 == 0) goto L8f
                    java.lang.Object r5 = r4.next()
                    r6 = r5
                    am.x0 r6 = (am.x0) r6
                    java.lang.String r6 = r6.f4358a
                    java.lang.String r7 = r3.f99243a
                    r8 = 1
                    boolean r6 = d53.u.q(r6, r7, r8)
                    if (r6 == 0) goto L76
                    goto L90
                L8f:
                    r5 = r1
                L90:
                    am.x0 r5 = (am.x0) r5
                    if (r5 == 0) goto L64
                    int r3 = r3.f99244b
                    java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                    r2.put(r5, r3)
                    goto L64
                L9e:
                    q13.c r1 = r2.b()
                La2:
                    return r1
                */
                throw new UnsupportedOperationException("Method not decompiled: jk0.v.invoke():java.lang.Object");
            }
        });
    }

    public /* synthetic */ x(c80.u uVar, b63.o oVar, c80.w wVar, List list, p pVar, String str, Long l14, String str2, String str3, String str4, String str5, b63.o oVar2, b63.o oVar3, Double d14, Long l15, Integer num, Long l16, Double d15, Long l17, List list2, List list3, Boolean bool, List list4, int i14, p005kotlin.jvm.internal.j jVar) {
        this(uVar, oVar, wVar, (i14 & 8) != 0 ? null : list, (i14 & 16) != 0 ? null : pVar, (i14 & 32) != 0 ? null : str, (i14 & 64) != 0 ? null : l14, (i14 & 128) != 0 ? null : str2, (i14 & 256) != 0 ? null : str3, (i14 & 512) != 0 ? null : str4, (i14 & 1024) != 0 ? null : str5, (i14 & 2048) != 0 ? null : oVar2, (i14 & 4096) != 0 ? null : oVar3, (i14 & 8192) != 0 ? null : d14, (i14 & 16384) != 0 ? null : l15, (32768 & i14) != 0 ? null : num, (65536 & i14) != 0 ? null : l16, (131072 & i14) != 0 ? null : d15, (262144 & i14) != 0 ? null : l17, (524288 & i14) != 0 ? null : list2, (1048576 & i14) != 0 ? null : list3, (2097152 & i14) != 0 ? null : bool, (i14 & 4194304) != 0 ? null : list4);
    }
}

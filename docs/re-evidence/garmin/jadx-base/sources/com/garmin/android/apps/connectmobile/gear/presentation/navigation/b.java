package com.garmin.android.apps.connectmobile.gear.presentation.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import b63.o;
import c80.u;
import c80.w;
import com.garmin.proto.generated.GDIInReachMessaging;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import com.mapbox.maps.plugin.locationcomponent.ModelSourceWrapper;
import i63.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jk0.e;
import jk0.g;
import jk0.k;
import jk0.p;
import l63.d;
import l63.f;
import lc.u0;
import m63.e0;
import m63.k1;
import m63.m0;
import m63.m1;
import m63.u1;
import m63.v0;
import m63.x;
import m63.y1;
import n23.j;
import o13.l;
import o13.m;
import o13.n;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import u62.z;
import vk0.i;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 -2\u00020\u0001:\u0002./B§\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u000f\u0012\u0010\b\u0002\u0010 \u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\b\u0012\u0010\b\u0002\u0010\"\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010\b\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#\u0012\u0010\b\u0002\u0010&\u001a\n\u0012\u0004\u0012\u00020%\u0018\u00010\b¢\u0006\u0004\b'\u0010(B\u0099\u0002\b\u0010\u0012\u0006\u0010)\u001a\u00020\u001a\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u000f\u0012\u000e\u0010 \u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\b\u0012\u000e\u0010\"\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010\b\u0012\b\u0010$\u001a\u0004\u0018\u00010#\u0012\u000e\u0010&\u001a\n\u0012\u0004\u0012\u00020%\u0018\u00010\b\u0012\b\u0010+\u001a\u0004\u0018\u00010*¢\u0006\u0004\b'\u0010,¨\u00060"}, d2 = {"Lcom/garmin/android/apps/connectmobile/gear/presentation/navigation/b;", "Landroid/os/Parcelable;", "Lc80/u;", "gearType", "Lb63/o;", "firstUseDate", "Lc80/w;", "usageType", "", "Ljk0/g;", "defaultActivityTypes", "Ljk0/p;", "status", "", "uuid", "", "userProfilePk", "name", "brand", ModelSourceWrapper.TYPE, "notes", "retireDate", "maxUsageDate", "", "maxUsageDistanceMeters", "maxUsageDurationSeconds", "", "numActivitiesLinked", "durationUsedSeconds", "distanceUsedMeters", "daysUsed", "Ljk0/e;", "countsByActivityType", "Lcom/garmin/android/apps/connectmobile/gear/presentation/navigation/a;", "images", "", "processing", "Ljk0/k;", "collections", "<init>", "(Lc80/u;Lb63/o;Lc80/w;Ljava/util/List;Ljk0/p;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lb63/o;Lb63/o;Ljava/lang/Double;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Double;Ljava/lang/Long;Ljava/util/List;Ljava/util/List;Ljava/lang/Boolean;Ljava/util/List;)V", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILc80/u;Lb63/o;Lc80/w;Ljava/util/List;Ljk0/p;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lb63/o;Lb63/o;Ljava/lang/Double;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Double;Ljava/lang/Long;Ljava/util/List;Ljava/util/List;Ljava/lang/Boolean;Ljava/util/List;Lm63/u1;)V", "Companion", "a", "b", "gcm-gear_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@h
public final /* data */ class b implements Parcelable {

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final l<i63.c<Object>>[] f35694z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u f35695a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f35696b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w f35697c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<g> f35698d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p f35699e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f35700f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Long f35701g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f35702h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f35703i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f35704j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f35705k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final o f35706l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final o f35707m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Double f35708n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Long f35709o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Integer f35710p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Long f35711q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Double f35712r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Long f35713t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final List<e> f35714v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final List<com.garmin.android.apps.connectmobile.gear.presentation.navigation.a> f35715w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Boolean f35716x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final List<k> f35717y;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<b> CREATOR = new c();

    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/gear/presentation/navigation/GearV2NavigationDTO.$serializer", "Lm63/e0;", "Lcom/garmin/android/apps/connectmobile/gear/presentation/navigation/b;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-gear_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @o13.e
    public static final /* synthetic */ class a implements e0<b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f35718a;
        private static final k63.e descriptor;

        static {
            a aVar = new a();
            f35718a = aVar;
            m1 m1Var = new m1("com.garmin.android.apps.connectmobile.gear.presentation.navigation.GearV2NavigationDTO", aVar, 23);
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
            l<i63.c<Object>>[] lVarArr = b.f35694z;
            h63.k kVar = h63.k.f82304a;
            y1 y1Var = y1.f117048a;
            v0 v0Var = v0.f117027a;
            x xVar = x.f117036a;
            return new i63.c[]{lVarArr[0].getValue(), kVar, lVarArr[2].getValue(), j63.a.d(lVarArr[3].getValue()), j63.a.d(lVarArr[4].getValue()), j63.a.d(y1Var), j63.a.d(v0Var), j63.a.d(y1Var), j63.a.d(y1Var), j63.a.d(y1Var), j63.a.d(y1Var), j63.a.d(kVar), j63.a.d(kVar), j63.a.d(xVar), j63.a.d(v0Var), j63.a.d(m0.f116981a), j63.a.d(v0Var), j63.a.d(xVar), j63.a.d(v0Var), j63.a.d(lVarArr[19].getValue()), j63.a.d(lVarArr[20].getValue()), j63.a.d(m63.g.f116948a), j63.a.d(lVarArr[22].getValue())};
        }

        @Override // i63.b
        public final Object deserialize(l63.e eVar) {
            String str;
            int i14;
            eVar.getClass();
            k63.e eVar2 = descriptor;
            l63.c cVarC = eVar.c(eVar2);
            l<i63.c<Object>>[] lVarArr = b.f35694z;
            int i15 = l63.c.f110557a;
            o oVar = null;
            String str2 = null;
            List list = null;
            Boolean bool = null;
            o oVar2 = null;
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
            u uVar = null;
            o oVar3 = null;
            w wVar = null;
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
                        uVar = (u) cVarC.l(eVar2, i19, lVarArr[i17].getValue(), uVar);
                        i16 |= 1;
                        oVar3 = oVar3;
                        list = list5;
                        oVar = oVar;
                        i17 = i19;
                        str2 = str2;
                        break;
                    case 1:
                        str = str2;
                        oVar3 = (o) cVarC.l(eVar2, 1, h63.k.f82304a, oVar3);
                        i16 |= 2;
                        wVar = wVar;
                        str2 = str;
                        list = list;
                        oVar = oVar;
                        break;
                    case 2:
                        str = str2;
                        wVar = (w) cVarC.l(eVar2, 2, lVarArr[2].getValue(), wVar);
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
                        o oVar4 = oVar;
                        oVar = oVar4;
                        str2 = (String) cVarC.v(eVar2, 10, y1.f117048a, str2);
                        i16 |= 1024;
                        list = list;
                        oVar = oVar;
                        break;
                    case 11:
                        oVar = (o) cVarC.v(eVar2, 11, h63.k.f82304a, oVar);
                        i16 |= 2048;
                        str2 = str2;
                        list = list;
                        break;
                    case 12:
                        oVar = oVar;
                        str2 = str2;
                        oVar2 = (o) cVarC.v(eVar2, 12, h63.k.f82304a, oVar2);
                        i16 |= 4096;
                        str2 = str2;
                        oVar = oVar;
                        break;
                    case 13:
                        oVar = oVar;
                        str2 = str2;
                        d14 = (Double) cVarC.v(eVar2, 13, x.f117036a, d14);
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
                        d15 = (Double) cVarC.v(eVar2, 17, x.f117036a, d15);
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
            u uVar2 = uVar;
            o oVar5 = oVar3;
            w wVar2 = wVar;
            cVarC.b(eVar2);
            String str8 = str4;
            Long l18 = l16;
            String str9 = str5;
            List list7 = list3;
            return new b(i16, uVar2, oVar5, wVar2, list4, pVar, str3, l17, str8, str9, str6, str7, oVar, oVar2, d14, l14, num, l15, d15, l18, list7, list2, bool, list6, (u1) null);
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
            List<k> list = bVar.f35717y;
            Boolean bool = bVar.f35716x;
            List<com.garmin.android.apps.connectmobile.gear.presentation.navigation.a> list2 = bVar.f35715w;
            List<e> list3 = bVar.f35714v;
            Long l14 = bVar.f35713t;
            Double d14 = bVar.f35712r;
            Long l15 = bVar.f35711q;
            Integer num = bVar.f35710p;
            Long l16 = bVar.f35709o;
            Double d15 = bVar.f35708n;
            o oVar = bVar.f35707m;
            o oVar2 = bVar.f35706l;
            k63.e eVar = descriptor;
            d dVarC = fVar.c(eVar);
            l<i63.c<Object>>[] lVarArr = b.f35694z;
            i63.c<Object> value = lVarArr[0].getValue();
            u uVar = bVar.f35695a;
            String str = bVar.f35705k;
            String str2 = bVar.f35704j;
            String str3 = bVar.f35703i;
            String str4 = bVar.f35702h;
            Long l17 = bVar.f35701g;
            String str5 = bVar.f35700f;
            p pVar = bVar.f35699e;
            List<g> list4 = bVar.f35698d;
            dVarC.e(eVar, 0, value, uVar);
            h63.k kVar = h63.k.f82304a;
            dVarC.e(eVar, 1, kVar, bVar.f35696b);
            dVarC.e(eVar, 2, lVarArr[2].getValue(), bVar.f35697c);
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
                dVarC.d(eVar, 13, x.f117036a, d15);
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
                dVarC.d(eVar, 17, x.f117036a, d14);
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
    public static final class c implements Parcelable.Creator<b> {
        @Override // android.os.Parcelable.Creator
        public final b createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            u uVar;
            ArrayList arrayList3;
            Boolean boolValueOf;
            ArrayList arrayList4;
            ArrayList arrayList5;
            parcel.getClass();
            u uVarValueOf = u.valueOf(parcel.readString());
            o oVarA = vk0.g.f178573a.a(parcel);
            w wVarValueOf = w.valueOf(parcel.readString());
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
            i iVar = i.f178575a;
            o oVarA2 = iVar.a(parcel);
            o oVarA3 = iVar.a(parcel);
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
            o oVar = oVarA;
            if (parcel.readInt() == 0) {
                arrayList3 = null;
            } else {
                int i16 = parcel.readInt();
                arrayList3 = new ArrayList(i16);
                int iA3 = 0;
                while (iA3 != i16) {
                    iA3 = kg.f.a(com.garmin.android.apps.connectmobile.gear.presentation.navigation.a.CREATOR, parcel, arrayList3, iA3, 1);
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
            return new b(uVar, oVar, wVarValueOf, arrayList6, pVarValueOf, string, l14, string2, string3, string4, string5, oVarA2, oVarA3, dValueOf, lValueOf2, numValueOf, lValueOf3, dValueOf2, lValueOf4, arrayList5, arrayList3, boolValueOf, arrayList4);
        }

        @Override // android.os.Parcelable.Creator
        public final b[] newArray(int i14) {
            return new b[i14];
        }
    }

    static {
        n nVar = n.PUBLICATION;
        f35694z = new l[]{m.a(nVar, new tk0.a(10)), null, m.a(nVar, new tk0.a(11)), m.a(nVar, new tk0.a(12)), m.a(nVar, new tk0.a(13)), null, null, null, null, null, null, null, null, null, null, null, null, null, null, m.a(nVar, new tk0.a(14)), m.a(nVar, new tk0.a(15)), null, m.a(nVar, new tk0.a(16))};
    }

    public /* synthetic */ b(int i14, u uVar, o oVar, w wVar, List list, p pVar, String str, Long l14, String str2, String str3, String str4, String str5, o oVar2, o oVar3, Double d14, Long l15, Integer num, Long l16, Double d15, Long l17, List list2, List list3, Boolean bool, List list4, u1 u1Var) {
        if (7 != (i14 & 7)) {
            k1.h(i14, 7, a.f35718a.getF158591b());
            throw null;
        }
        this.f35695a = uVar;
        this.f35696b = oVar;
        this.f35697c = wVar;
        if ((i14 & 8) == 0) {
            this.f35698d = null;
        } else {
            this.f35698d = list;
        }
        if ((i14 & 16) == 0) {
            this.f35699e = null;
        } else {
            this.f35699e = pVar;
        }
        if ((i14 & 32) == 0) {
            this.f35700f = null;
        } else {
            this.f35700f = str;
        }
        if ((i14 & 64) == 0) {
            this.f35701g = null;
        } else {
            this.f35701g = l14;
        }
        if ((i14 & 128) == 0) {
            this.f35702h = null;
        } else {
            this.f35702h = str2;
        }
        if ((i14 & 256) == 0) {
            this.f35703i = null;
        } else {
            this.f35703i = str3;
        }
        if ((i14 & 512) == 0) {
            this.f35704j = null;
        } else {
            this.f35704j = str4;
        }
        if ((i14 & 1024) == 0) {
            this.f35705k = null;
        } else {
            this.f35705k = str5;
        }
        if ((i14 & 2048) == 0) {
            this.f35706l = null;
        } else {
            this.f35706l = oVar2;
        }
        if ((i14 & 4096) == 0) {
            this.f35707m = null;
        } else {
            this.f35707m = oVar3;
        }
        if ((i14 & 8192) == 0) {
            this.f35708n = null;
        } else {
            this.f35708n = d14;
        }
        if ((i14 & 16384) == 0) {
            this.f35709o = null;
        } else {
            this.f35709o = l15;
        }
        if ((32768 & i14) == 0) {
            this.f35710p = null;
        } else {
            this.f35710p = num;
        }
        if ((65536 & i14) == 0) {
            this.f35711q = null;
        } else {
            this.f35711q = l16;
        }
        if ((131072 & i14) == 0) {
            this.f35712r = null;
        } else {
            this.f35712r = d15;
        }
        if ((262144 & i14) == 0) {
            this.f35713t = null;
        } else {
            this.f35713t = l17;
        }
        if ((524288 & i14) == 0) {
            this.f35714v = null;
        } else {
            this.f35714v = list2;
        }
        if ((1048576 & i14) == 0) {
            this.f35715w = null;
        } else {
            this.f35715w = list3;
        }
        if ((2097152 & i14) == 0) {
            this.f35716x = null;
        } else {
            this.f35716x = bool;
        }
        if ((i14 & 4194304) == 0) {
            this.f35717y = null;
        } else {
            this.f35717y = list4;
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
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f35695a == bVar.f35695a && s.g(this.f35696b, bVar.f35696b) && this.f35697c == bVar.f35697c && s.g(this.f35698d, bVar.f35698d) && this.f35699e == bVar.f35699e && s.g(this.f35700f, bVar.f35700f) && s.g(this.f35701g, bVar.f35701g) && s.g(this.f35702h, bVar.f35702h) && s.g(this.f35703i, bVar.f35703i) && s.g(this.f35704j, bVar.f35704j) && s.g(this.f35705k, bVar.f35705k) && s.g(this.f35706l, bVar.f35706l) && s.g(this.f35707m, bVar.f35707m) && s.g(this.f35708n, bVar.f35708n) && s.g(this.f35709o, bVar.f35709o) && s.g(this.f35710p, bVar.f35710p) && s.g(this.f35711q, bVar.f35711q) && s.g(this.f35712r, bVar.f35712r) && s.g(this.f35713t, bVar.f35713t) && s.g(this.f35714v, bVar.f35714v) && s.g(this.f35715w, bVar.f35715w) && s.g(this.f35716x, bVar.f35716x) && s.g(this.f35717y, bVar.f35717y);
    }

    public final int hashCode() {
        int iHashCode = (this.f35697c.hashCode() + j.a(this.f35696b.f16206a, this.f35695a.hashCode() * 31, 31)) * 31;
        List<g> list = this.f35698d;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        p pVar = this.f35699e;
        int iHashCode3 = (iHashCode2 + (pVar == null ? 0 : pVar.hashCode())) * 31;
        String str = this.f35700f;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        Long l14 = this.f35701g;
        int iHashCode5 = (iHashCode4 + (l14 == null ? 0 : l14.hashCode())) * 31;
        String str2 = this.f35702h;
        int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f35703i;
        int iHashCode7 = (iHashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f35704j;
        int iHashCode8 = (iHashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f35705k;
        int iHashCode9 = (iHashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        o oVar = this.f35706l;
        int iHashCode10 = (iHashCode9 + (oVar == null ? 0 : oVar.f16206a.hashCode())) * 31;
        o oVar2 = this.f35707m;
        int iHashCode11 = (iHashCode10 + (oVar2 == null ? 0 : oVar2.f16206a.hashCode())) * 31;
        Double d14 = this.f35708n;
        int iHashCode12 = (iHashCode11 + (d14 == null ? 0 : d14.hashCode())) * 31;
        Long l15 = this.f35709o;
        int iHashCode13 = (iHashCode12 + (l15 == null ? 0 : l15.hashCode())) * 31;
        Integer num = this.f35710p;
        int iHashCode14 = (iHashCode13 + (num == null ? 0 : num.hashCode())) * 31;
        Long l16 = this.f35711q;
        int iHashCode15 = (iHashCode14 + (l16 == null ? 0 : l16.hashCode())) * 31;
        Double d15 = this.f35712r;
        int iHashCode16 = (iHashCode15 + (d15 == null ? 0 : d15.hashCode())) * 31;
        Long l17 = this.f35713t;
        int iHashCode17 = (iHashCode16 + (l17 == null ? 0 : l17.hashCode())) * 31;
        List<e> list2 = this.f35714v;
        int iHashCode18 = (iHashCode17 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<com.garmin.android.apps.connectmobile.gear.presentation.navigation.a> list3 = this.f35715w;
        int iHashCode19 = (iHashCode18 + (list3 == null ? 0 : list3.hashCode())) * 31;
        Boolean bool = this.f35716x;
        int iHashCode20 = (iHashCode19 + (bool == null ? 0 : bool.hashCode())) * 31;
        List<k> list4 = this.f35717y;
        return iHashCode20 + (list4 != null ? list4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("GearV2NavigationDTO(gearType=");
        sb3.append(this.f35695a);
        sb3.append(", firstUseDate=");
        sb3.append(this.f35696b);
        sb3.append(", usageType=");
        sb3.append(this.f35697c);
        sb3.append(", defaultActivityTypes=");
        sb3.append(this.f35698d);
        sb3.append(", status=");
        sb3.append(this.f35699e);
        sb3.append(", uuid=");
        sb3.append(this.f35700f);
        sb3.append(", userProfilePk=");
        b71.i.q(this.f35701g, ", name=", this.f35702h, ", brand=", sb3);
        sn.a.t(sb3, this.f35703i, ", model=", this.f35704j, ", notes=");
        sb3.append(this.f35705k);
        sb3.append(", retireDate=");
        sb3.append(this.f35706l);
        sb3.append(", maxUsageDate=");
        sb3.append(this.f35707m);
        sb3.append(", maxUsageDistanceMeters=");
        sb3.append(this.f35708n);
        sb3.append(", maxUsageDurationSeconds=");
        sb3.append(this.f35709o);
        sb3.append(", numActivitiesLinked=");
        sb3.append(this.f35710p);
        sb3.append(", durationUsedSeconds=");
        sb3.append(this.f35711q);
        sb3.append(", distanceUsedMeters=");
        sb3.append(this.f35712r);
        sb3.append(", daysUsed=");
        sb3.append(this.f35713t);
        sb3.append(", countsByActivityType=");
        sb3.append(this.f35714v);
        sb3.append(", images=");
        sb3.append(this.f35715w);
        sb3.append(", processing=");
        sb3.append(this.f35716x);
        sb3.append(", collections=");
        return z.c(sb3, this.f35717y, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.f35695a.name());
        vk0.g.f178573a.b(this.f35696b, parcel);
        parcel.writeString(this.f35697c.name());
        List<g> list = this.f35698d;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itO = u0.o(parcel, list, 1);
            while (itO.hasNext()) {
                ((g) itO.next()).writeToParcel(parcel, i14);
            }
        }
        p pVar = this.f35699e;
        if (pVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(pVar.name());
        }
        parcel.writeString(this.f35700f);
        Long l14 = this.f35701g;
        if (l14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l14);
        }
        parcel.writeString(this.f35702h);
        parcel.writeString(this.f35703i);
        parcel.writeString(this.f35704j);
        parcel.writeString(this.f35705k);
        i iVar = i.f178575a;
        iVar.b(this.f35706l, parcel);
        iVar.b(this.f35707m, parcel);
        Double d14 = this.f35708n;
        if (d14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d14);
        }
        Long l15 = this.f35709o;
        if (l15 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l15);
        }
        Integer num = this.f35710p;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num);
        }
        Long l16 = this.f35711q;
        if (l16 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l16);
        }
        Double d15 = this.f35712r;
        if (d15 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d15);
        }
        Long l17 = this.f35713t;
        if (l17 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l17);
        }
        List<e> list2 = this.f35714v;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itO2 = u0.o(parcel, list2, 1);
            while (itO2.hasNext()) {
                ((e) itO2.next()).writeToParcel(parcel, i14);
            }
        }
        List<com.garmin.android.apps.connectmobile.gear.presentation.navigation.a> list3 = this.f35715w;
        if (list3 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itO3 = u0.o(parcel, list3, 1);
            while (itO3.hasNext()) {
                ((com.garmin.android.apps.connectmobile.gear.presentation.navigation.a) itO3.next()).writeToParcel(parcel, i14);
            }
        }
        Boolean bool = this.f35716x;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool);
        }
        List<k> list4 = this.f35717y;
        if (list4 == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itO4 = u0.o(parcel, list4, 1);
        while (itO4.hasNext()) {
            ((k) itO4.next()).writeToParcel(parcel, i14);
        }
    }

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.gear.presentation.navigation.b$b, reason: collision with other inner class name and from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/gear/presentation/navigation/b$b;", "", "<init>", "()V", "Li63/c;", "Lcom/garmin/android/apps/connectmobile/gear/presentation/navigation/b;", "serializer", "()Li63/c;", "gcm-gear_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public final i63.c<b> serializer() {
            return a.f35718a;
        }

        private Companion() {
        }
    }

    public b(u uVar, o oVar, w wVar, List<g> list, p pVar, String str, Long l14, String str2, String str3, String str4, String str5, o oVar2, o oVar3, Double d14, Long l15, Integer num, Long l16, Double d15, Long l17, List<e> list2, List<com.garmin.android.apps.connectmobile.gear.presentation.navigation.a> list3, Boolean bool, List<k> list4) {
        uVar.getClass();
        oVar.getClass();
        wVar.getClass();
        this.f35695a = uVar;
        this.f35696b = oVar;
        this.f35697c = wVar;
        this.f35698d = list;
        this.f35699e = pVar;
        this.f35700f = str;
        this.f35701g = l14;
        this.f35702h = str2;
        this.f35703i = str3;
        this.f35704j = str4;
        this.f35705k = str5;
        this.f35706l = oVar2;
        this.f35707m = oVar3;
        this.f35708n = d14;
        this.f35709o = l15;
        this.f35710p = num;
        this.f35711q = l16;
        this.f35712r = d15;
        this.f35713t = l17;
        this.f35714v = list2;
        this.f35715w = list3;
        this.f35716x = bool;
        this.f35717y = list4;
    }

    public /* synthetic */ b(u uVar, o oVar, w wVar, List list, p pVar, String str, Long l14, String str2, String str3, String str4, String str5, o oVar2, o oVar3, Double d14, Long l15, Integer num, Long l16, Double d15, Long l17, List list2, List list3, Boolean bool, List list4, int i14, p005kotlin.jvm.internal.j jVar) {
        this(uVar, oVar, wVar, (i14 & 8) != 0 ? null : list, (i14 & 16) != 0 ? null : pVar, (i14 & 32) != 0 ? null : str, (i14 & 64) != 0 ? null : l14, (i14 & 128) != 0 ? null : str2, (i14 & 256) != 0 ? null : str3, (i14 & 512) != 0 ? null : str4, (i14 & 1024) != 0 ? null : str5, (i14 & 2048) != 0 ? null : oVar2, (i14 & 4096) != 0 ? null : oVar3, (i14 & 8192) != 0 ? null : d14, (i14 & 16384) != 0 ? null : l15, (32768 & i14) != 0 ? null : num, (65536 & i14) != 0 ? null : l16, (131072 & i14) != 0 ? null : d15, (262144 & i14) != 0 ? null : l17, (524288 & i14) != 0 ? null : list2, (1048576 & i14) != 0 ? null : list3, (2097152 & i14) != 0 ? null : bool, (i14 & 4194304) != 0 ? null : list4);
    }
}

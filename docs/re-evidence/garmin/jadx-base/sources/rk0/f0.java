package rk0;

import android.os.Parcel;
import android.os.Parcelable;
import com.garmin.proto.generated.GDIInReachMessaging;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.mapbox.maps.plugin.locationcomponent.ModelSourceWrapper;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import m63.k1;
import m63.m1;
import m63.u1;
import m63.y1;
import p005kotlin.Metadata;
import yc.l2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0002+,B\u009d\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0019\u0012\u0016\b\u0002\u0010!\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u001d\u0018\u00010 \u0012\u0010\b\u0002\u0010#\u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010\u0004¢\u0006\u0004\b$\u0010%B\u008b\u0002\b\u0010\u0012\u0006\u0010&\u001a\u00020\u001d\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0004\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0019\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0019\u0012\u0014\u0010!\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u001d\u0018\u00010 \u0012\u000e\u0010#\u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010\u0004\u0012\b\u0010(\u001a\u0004\u0018\u00010'¢\u0006\u0004\b$\u0010)¨\u0006-"}, d2 = {"Lrk0/f0;", "Landroid/os/Parcelable;", "", TtmlNode.ATTR_ID, "Li53/c;", "Lrk0/p0;", "images", "Lc80/u;", "gearType", "", "retired", "nickname", "brand", ModelSourceWrapper.TYPE, "notes", "Lb63/o;", "retireDate", "firstUseDate", "Lc80/w;", "usageType", "Lam/x0;", "defaultActivityTypes", "maxUsageDate", "", "maxUsageDistanceMeters", "", "maxUsageDurationSeconds", "durationUsedSeconds", "distanceUsedMeters", "", "numActivitiesLinked", "daysUsed", "Li53/d;", "countsByActivityType", "Lrk0/l;", "collectionItems", "<init>", "(Ljava/lang/String;Li53/c;Lc80/u;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lb63/o;Lb63/o;Lc80/w;Li53/c;Lb63/o;Ljava/lang/Double;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Long;Li53/d;Li53/c;)V", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILjava/lang/String;Li53/c;Lc80/u;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lb63/o;Lb63/o;Lc80/w;Li53/c;Lb63/o;Ljava/lang/Double;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Long;Li53/d;Li53/c;Lm63/u1;)V", "Companion", "b", "a", "gcm-gear_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@i63.h
public final /* data */ class f0 implements Parcelable {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final o13.l<i63.c<Object>>[] f153100y;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f153101a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i53.c<p0> f153102b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c80.u f153103c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Boolean f153104d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f153105e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f153106f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f153107g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f153108h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final b63.o f153109i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final b63.o f153110j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final c80.w f153111k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final i53.c<am.x0> f153112l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final b63.o f153113m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Double f153114n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Long f153115o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Long f153116p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Double f153117q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Integer f153118r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Long f153119t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final i53.d<am.x0, Integer> f153120v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final i53.c<l> f153121w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final o13.t f153122x;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<f0> CREATOR = new c();

    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/gear/presentation/details/GearDetailsUIModel.$serializer", "Lm63/e0;", "Lrk0/f0;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-gear_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @o13.e
    public static final /* synthetic */ class a implements m63.e0<f0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f153123a;
        private static final k63.e descriptor;

        static {
            a aVar = new a();
            f153123a = aVar;
            m1 m1Var = new m1("com.garmin.android.apps.connectmobile.gear.presentation.details.GearDetailsUIModel", aVar, 21);
            m1Var.j(TtmlNode.ATTR_ID, false);
            m1Var.j("images", true);
            m1Var.j("gearType", true);
            m1Var.j("retired", true);
            m1Var.j("nickname", true);
            m1Var.j("brand", true);
            m1Var.j(ModelSourceWrapper.TYPE, true);
            m1Var.j("notes", true);
            m1Var.j("retireDate", true);
            m1Var.j("firstUseDate", true);
            m1Var.j("usageType", true);
            m1Var.j("defaultActivityTypes", true);
            m1Var.j("maxUsageDate", true);
            m1Var.j("maxUsageDistanceMeters", true);
            m1Var.j("maxUsageDurationSeconds", true);
            m1Var.j("durationUsedSeconds", true);
            m1Var.j("distanceUsedMeters", true);
            m1Var.j("numActivitiesLinked", true);
            m1Var.j("daysUsed", true);
            m1Var.j("countsByActivityType", true);
            m1Var.j("collectionItems", true);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // m63.e0
        public final i63.c<?>[] childSerializers() {
            o13.l<i63.c<Object>>[] lVarArr = f0.f153100y;
            y1 y1Var = y1.f117048a;
            i63.c<?> cVarD = j63.a.d(lVarArr[1].getValue());
            i63.c<?> cVarD2 = j63.a.d(lVarArr[2].getValue());
            i63.c<?> cVarD3 = j63.a.d(m63.g.f116948a);
            i63.c<?> cVarD4 = j63.a.d(y1Var);
            i63.c<?> cVarD5 = j63.a.d(y1Var);
            i63.c<?> cVarD6 = j63.a.d(y1Var);
            i63.c<?> cVarD7 = j63.a.d(y1Var);
            h63.k kVar = h63.k.f82304a;
            i63.c<?> cVarD8 = j63.a.d(kVar);
            i63.c<?> cVarD9 = j63.a.d(kVar);
            i63.c<?> cVarD10 = j63.a.d(lVarArr[10].getValue());
            i63.c<?> cVarD11 = j63.a.d(lVarArr[11].getValue());
            i63.c<?> cVarD12 = j63.a.d(kVar);
            m63.x xVar = m63.x.f117036a;
            i63.c<?> cVarD13 = j63.a.d(xVar);
            m63.v0 v0Var = m63.v0.f117027a;
            return new i63.c[]{y1Var, cVarD, cVarD2, cVarD3, cVarD4, cVarD5, cVarD6, cVarD7, cVarD8, cVarD9, cVarD10, cVarD11, cVarD12, cVarD13, j63.a.d(v0Var), j63.a.d(v0Var), j63.a.d(xVar), j63.a.d(m63.m0.f116981a), j63.a.d(v0Var), j63.a.d(lVarArr[19].getValue()), j63.a.d(lVarArr[20].getValue())};
        }

        @Override // i63.b
        public final Object deserialize(l63.e eVar) {
            b63.o oVar;
            int i14;
            int i15;
            eVar.getClass();
            k63.e eVar2 = descriptor;
            l63.c cVarC = eVar.c(eVar2);
            o13.l<i63.c<Object>>[] lVarArr = f0.f153100y;
            int i16 = l63.c.f110557a;
            i53.c cVar = null;
            c80.w wVar = null;
            b63.o oVar2 = null;
            b63.o oVar3 = null;
            b63.o oVar4 = null;
            i53.c cVar2 = null;
            int i17 = 0;
            Double d14 = null;
            Long l14 = null;
            Long l15 = null;
            Double d15 = null;
            Integer num = null;
            Long l16 = null;
            i53.d dVar = null;
            int i18 = 1;
            boolean z14 = true;
            String strR = null;
            i53.c cVar3 = null;
            c80.u uVar = null;
            Boolean bool = null;
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            while (z14) {
                int iE = cVarC.e(eVar2);
                switch (iE) {
                    case -1:
                        i15 = i18;
                        z14 = false;
                        oVar3 = oVar3;
                        oVar2 = oVar2;
                        i18 = i15;
                        cVar = cVar;
                        break;
                    case 0:
                        i15 = i18;
                        strR = cVarC.r(eVar2, 0);
                        i17 |= 1;
                        oVar3 = oVar3;
                        oVar2 = oVar2;
                        i18 = i15;
                        cVar = cVar;
                        break;
                    case 1:
                        i63.c<Object> value = lVarArr[i18].getValue();
                        i15 = i18;
                        cVar3 = (i53.c) cVarC.v(eVar2, i15, value, cVar3);
                        i17 |= 2;
                        uVar = uVar;
                        oVar3 = oVar3;
                        oVar2 = oVar2;
                        i18 = i15;
                        cVar = cVar;
                        break;
                    case 2:
                        oVar = oVar3;
                        uVar = (c80.u) cVarC.v(eVar2, 2, lVarArr[2].getValue(), uVar);
                        i17 |= 4;
                        oVar3 = oVar;
                        cVar = cVar;
                        oVar2 = oVar2;
                        break;
                    case 3:
                        oVar = oVar3;
                        bool = (Boolean) cVarC.v(eVar2, 3, m63.g.f116948a, bool);
                        i17 |= 8;
                        oVar3 = oVar;
                        cVar = cVar;
                        oVar2 = oVar2;
                        break;
                    case 4:
                        oVar = oVar3;
                        str = (String) cVarC.v(eVar2, 4, y1.f117048a, str);
                        i17 |= 16;
                        oVar3 = oVar;
                        cVar = cVar;
                        oVar2 = oVar2;
                        break;
                    case 5:
                        oVar = oVar3;
                        str2 = (String) cVarC.v(eVar2, 5, y1.f117048a, str2);
                        i17 |= 32;
                        oVar3 = oVar;
                        cVar = cVar;
                        oVar2 = oVar2;
                        break;
                    case 6:
                        oVar = oVar3;
                        str3 = (String) cVarC.v(eVar2, 6, y1.f117048a, str3);
                        i17 |= 64;
                        oVar3 = oVar;
                        cVar = cVar;
                        oVar2 = oVar2;
                        break;
                    case 7:
                        oVar = oVar3;
                        str4 = (String) cVarC.v(eVar2, 7, y1.f117048a, str4);
                        i17 |= 128;
                        oVar3 = oVar;
                        cVar = cVar;
                        oVar2 = oVar2;
                        break;
                    case 8:
                        cVar = cVar;
                        oVar2 = oVar2;
                        oVar3 = (b63.o) cVarC.v(eVar2, 8, h63.k.f82304a, oVar3);
                        i17 |= 256;
                        cVar = cVar;
                        oVar2 = oVar2;
                        break;
                    case 9:
                        cVar = cVar;
                        oVar2 = (b63.o) cVarC.v(eVar2, 9, h63.k.f82304a, oVar2);
                        i17 |= 512;
                        oVar3 = oVar3;
                        cVar = cVar;
                        break;
                    case 10:
                        oVar2 = oVar2;
                        oVar3 = oVar3;
                        wVar = (c80.w) cVarC.v(eVar2, 10, lVarArr[10].getValue(), wVar);
                        i17 |= 1024;
                        oVar3 = oVar3;
                        oVar2 = oVar2;
                        break;
                    case 11:
                        oVar2 = oVar2;
                        oVar3 = oVar3;
                        cVar = (i53.c) cVarC.v(eVar2, 11, lVarArr[11].getValue(), cVar);
                        i17 |= 2048;
                        oVar3 = oVar3;
                        oVar2 = oVar2;
                        break;
                    case 12:
                        oVar2 = oVar2;
                        oVar3 = oVar3;
                        oVar4 = (b63.o) cVarC.v(eVar2, 12, h63.k.f82304a, oVar4);
                        i17 |= 4096;
                        oVar3 = oVar3;
                        oVar2 = oVar2;
                        break;
                    case 13:
                        oVar2 = oVar2;
                        oVar3 = oVar3;
                        d14 = (Double) cVarC.v(eVar2, 13, m63.x.f117036a, d14);
                        i17 |= 8192;
                        oVar3 = oVar3;
                        oVar2 = oVar2;
                        break;
                    case 14:
                        oVar2 = oVar2;
                        oVar3 = oVar3;
                        l14 = (Long) cVarC.v(eVar2, 14, m63.v0.f117027a, l14);
                        i17 |= 16384;
                        oVar3 = oVar3;
                        oVar2 = oVar2;
                        break;
                    case 15:
                        l15 = (Long) cVarC.v(eVar2, 15, m63.v0.f117027a, l15);
                        i14 = 32768;
                        i17 |= i14;
                        oVar3 = oVar3;
                        oVar2 = oVar2;
                        break;
                    case 16:
                        d15 = (Double) cVarC.v(eVar2, 16, m63.x.f117036a, d15);
                        i14 = 65536;
                        i17 |= i14;
                        oVar3 = oVar3;
                        oVar2 = oVar2;
                        break;
                    case 17:
                        num = (Integer) cVarC.v(eVar2, 17, m63.m0.f116981a, num);
                        i14 = 131072;
                        i17 |= i14;
                        oVar3 = oVar3;
                        oVar2 = oVar2;
                        break;
                    case 18:
                        l16 = (Long) cVarC.v(eVar2, 18, m63.v0.f117027a, l16);
                        i14 = GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE;
                        i17 |= i14;
                        oVar3 = oVar3;
                        oVar2 = oVar2;
                        break;
                    case 19:
                        dVar = (i53.d) cVarC.v(eVar2, 19, lVarArr[19].getValue(), dVar);
                        i14 = 524288;
                        i17 |= i14;
                        oVar3 = oVar3;
                        oVar2 = oVar2;
                        break;
                    case 20:
                        cVar2 = (i53.c) cVarC.v(eVar2, 20, lVarArr[20].getValue(), cVar2);
                        i14 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                        i17 |= i14;
                        oVar3 = oVar3;
                        oVar2 = oVar2;
                        break;
                    default:
                        hb.a.o(iE);
                        return null;
                }
            }
            b63.o oVar5 = oVar2;
            b63.o oVar6 = oVar3;
            i53.c cVar4 = cVar3;
            c80.u uVar2 = uVar;
            cVarC.b(eVar2);
            String str5 = str4;
            Long l17 = l16;
            return new f0(i17, strR, cVar4, uVar2, bool, str, str2, str3, str5, oVar6, oVar5, wVar, cVar, oVar4, d14, l14, l15, d15, num, l17, dVar, cVar2, (u1) null);
        }

        @Override // i63.i, i63.b
        /* JADX INFO: renamed from: getDescriptor */
        public final k63.e getF158591b() {
            return descriptor;
        }

        @Override // i63.i
        public final void serialize(l63.f fVar, Object obj) {
            f0 f0Var = (f0) obj;
            f0Var.getClass();
            i53.c<l> cVar = f0Var.f153121w;
            i53.d<am.x0, Integer> dVar = f0Var.f153120v;
            Long l14 = f0Var.f153119t;
            Integer num = f0Var.f153118r;
            Double d14 = f0Var.f153117q;
            Long l15 = f0Var.f153116p;
            Long l16 = f0Var.f153115o;
            Double d15 = f0Var.f153114n;
            b63.o oVar = f0Var.f153113m;
            i53.c<am.x0> cVar2 = f0Var.f153112l;
            c80.w wVar = f0Var.f153111k;
            k63.e eVar = descriptor;
            l63.d dVarC = fVar.c(eVar);
            o13.l<i63.c<Object>>[] lVarArr = f0.f153100y;
            String str = f0Var.f153101a;
            b63.o oVar2 = f0Var.f153110j;
            b63.o oVar3 = f0Var.f153109i;
            String str2 = f0Var.f153108h;
            String str3 = f0Var.f153107g;
            String str4 = f0Var.f153106f;
            String str5 = f0Var.f153105e;
            Boolean bool = f0Var.f153104d;
            c80.u uVar = f0Var.f153103c;
            i53.c<p0> cVar3 = f0Var.f153102b;
            dVarC.k(eVar, 0, str);
            if (dVarC.C(eVar) || cVar3 != null) {
                dVarC.d(eVar, 1, lVarArr[1].getValue(), cVar3);
            }
            if (dVarC.C(eVar) || uVar != null) {
                dVarC.d(eVar, 2, lVarArr[2].getValue(), uVar);
            }
            if (dVarC.C(eVar) || bool != null) {
                dVarC.d(eVar, 3, m63.g.f116948a, bool);
            }
            if (dVarC.C(eVar) || str5 != null) {
                dVarC.d(eVar, 4, y1.f117048a, str5);
            }
            if (dVarC.C(eVar) || str4 != null) {
                dVarC.d(eVar, 5, y1.f117048a, str4);
            }
            if (dVarC.C(eVar) || str3 != null) {
                dVarC.d(eVar, 6, y1.f117048a, str3);
            }
            if (dVarC.C(eVar) || str2 != null) {
                dVarC.d(eVar, 7, y1.f117048a, str2);
            }
            if (dVarC.C(eVar) || oVar3 != null) {
                dVarC.d(eVar, 8, h63.k.f82304a, oVar3);
            }
            if (dVarC.C(eVar) || oVar2 != null) {
                dVarC.d(eVar, 9, h63.k.f82304a, oVar2);
            }
            if (dVarC.C(eVar) || wVar != null) {
                dVarC.d(eVar, 10, lVarArr[10].getValue(), wVar);
            }
            if (dVarC.C(eVar) || cVar2 != null) {
                dVarC.d(eVar, 11, lVarArr[11].getValue(), cVar2);
            }
            if (dVarC.C(eVar) || oVar != null) {
                dVarC.d(eVar, 12, h63.k.f82304a, oVar);
            }
            if (dVarC.C(eVar) || d15 != null) {
                dVarC.d(eVar, 13, m63.x.f117036a, d15);
            }
            if (dVarC.C(eVar) || l16 != null) {
                dVarC.d(eVar, 14, m63.v0.f117027a, l16);
            }
            if (dVarC.C(eVar) || l15 != null) {
                dVarC.d(eVar, 15, m63.v0.f117027a, l15);
            }
            if (dVarC.C(eVar) || d14 != null) {
                dVarC.d(eVar, 16, m63.x.f117036a, d14);
            }
            if (dVarC.C(eVar) || num != null) {
                dVarC.d(eVar, 17, m63.m0.f116981a, num);
            }
            if (dVarC.C(eVar) || l14 != null) {
                dVarC.d(eVar, 18, m63.v0.f117027a, l14);
            }
            if (dVarC.C(eVar) || dVar != null) {
                dVarC.d(eVar, 19, lVarArr[19].getValue(), dVar);
            }
            if (dVarC.C(eVar) || cVar != null) {
                dVarC.d(eVar, 20, lVarArr[20].getValue(), cVar);
            }
            dVarC.b(eVar);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements Parcelable.Creator<f0> {
        @Override // android.os.Parcelable.Creator
        public final f0 createFromParcel(Parcel parcel) {
            i53.f fVarJ;
            Boolean boolValueOf;
            i53.f fVarJ2;
            i53.g gVarK;
            i53.g gVar;
            i53.f fVarJ3;
            parcel.getClass();
            String string = parcel.readString();
            Class<f0> cls = f0.class;
            if (parcel.readInt() == 0) {
                fVarJ = null;
            } else {
                int i14 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i14);
                int iD = 0;
                while (iD != i14) {
                    iD = lc.u0.d(cls, parcel, arrayList, iD, 1);
                }
                fVarJ = i53.a.j(arrayList);
            }
            c80.u uVarValueOf = parcel.readInt() == 0 ? null : c80.u.valueOf(parcel.readString());
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            c80.u uVar = uVarValueOf;
            String string4 = parcel.readString();
            Boolean bool = boolValueOf;
            String string5 = parcel.readString();
            vk0.i iVar = vk0.i.f178575a;
            b63.o oVarA = iVar.a(parcel);
            b63.o oVarA2 = iVar.a(parcel);
            c80.w wVarValueOf = parcel.readInt() == 0 ? null : c80.w.valueOf(parcel.readString());
            if (parcel.readInt() == 0) {
                fVarJ2 = null;
            } else {
                int i15 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i15);
                int iD2 = 0;
                while (iD2 != i15) {
                    iD2 = lc.u0.d(cls, parcel, arrayList2, iD2, 1);
                }
                fVarJ2 = i53.a.j(arrayList2);
            }
            b63.o oVarA3 = vk0.i.f178575a.a(parcel);
            Double dValueOf = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            Long lValueOf2 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            Double dValueOf2 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Long lValueOf3 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            if (parcel.readInt() == 0) {
                gVarK = null;
            } else {
                int i16 = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(i16);
                int i17 = 0;
                while (i17 != i16) {
                    linkedHashMap.put(parcel.readParcelable(cls.getClassLoader()), Integer.valueOf(parcel.readInt()));
                    i17++;
                    cls = cls;
                }
                gVarK = i53.a.k(linkedHashMap);
            }
            if (parcel.readInt() == 0) {
                gVar = gVarK;
                fVarJ3 = null;
            } else {
                int i18 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i18);
                int iA = 0;
                while (true) {
                    gVar = gVarK;
                    if (iA == i18) {
                        break;
                    }
                    iA = kg.f.a(l.CREATOR, parcel, arrayList3, iA, 1);
                    gVarK = gVar;
                    i18 = i18;
                }
                fVarJ3 = i53.a.j(arrayList3);
            }
            return new f0(string, fVarJ, uVar, bool, string2, string3, string4, string5, oVarA, oVarA2, wVarValueOf, fVarJ2, oVarA3, dValueOf, lValueOf, lValueOf2, dValueOf2, numValueOf, lValueOf3, gVar, fVarJ3);
        }

        @Override // android.os.Parcelable.Creator
        public final f0[] newArray(int i14) {
            return new f0[i14];
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t7, T t14) {
            return r13.a.b(Integer.valueOf(((am.x0) t7).r()), Integer.valueOf(((am.x0) t14).r()));
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class e<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t7, T t14) {
            return r13.a.b(Integer.valueOf(((am.x0) t7).r()), Integer.valueOf(((am.x0) t14).r()));
        }
    }

    static {
        o13.n nVar = o13.n.PUBLICATION;
        f153100y = new o13.l[]{null, o13.m.a(nVar, new ri1.b(21)), o13.m.a(nVar, new ri1.b(22)), null, null, null, null, null, null, null, o13.m.a(nVar, new ri1.b(23)), o13.m.a(nVar, new ri1.b(24)), null, null, null, null, null, null, null, o13.m.a(nVar, new ri1.b(25)), o13.m.a(nVar, new ri1.b(26))};
    }

    public /* synthetic */ f0(int i14, String str, i53.c cVar, c80.u uVar, Boolean bool, String str2, String str3, String str4, String str5, b63.o oVar, b63.o oVar2, c80.w wVar, i53.c cVar2, b63.o oVar3, Double d14, Long l14, Long l15, Double d15, Integer num, Long l16, i53.d dVar, i53.c cVar3, u1 u1Var) {
        if (1 != (i14 & 1)) {
            k1.h(i14, 1, a.f153123a.getF158591b());
            throw null;
        }
        this.f153101a = str;
        if ((i14 & 2) == 0) {
            this.f153102b = null;
        } else {
            this.f153102b = cVar;
        }
        if ((i14 & 4) == 0) {
            this.f153103c = null;
        } else {
            this.f153103c = uVar;
        }
        if ((i14 & 8) == 0) {
            this.f153104d = null;
        } else {
            this.f153104d = bool;
        }
        if ((i14 & 16) == 0) {
            this.f153105e = null;
        } else {
            this.f153105e = str2;
        }
        if ((i14 & 32) == 0) {
            this.f153106f = null;
        } else {
            this.f153106f = str3;
        }
        if ((i14 & 64) == 0) {
            this.f153107g = null;
        } else {
            this.f153107g = str4;
        }
        if ((i14 & 128) == 0) {
            this.f153108h = null;
        } else {
            this.f153108h = str5;
        }
        if ((i14 & 256) == 0) {
            this.f153109i = null;
        } else {
            this.f153109i = oVar;
        }
        if ((i14 & 512) == 0) {
            this.f153110j = null;
        } else {
            this.f153110j = oVar2;
        }
        if ((i14 & 1024) == 0) {
            this.f153111k = null;
        } else {
            this.f153111k = wVar;
        }
        if ((i14 & 2048) == 0) {
            this.f153112l = null;
        } else {
            this.f153112l = cVar2;
        }
        if ((i14 & 4096) == 0) {
            this.f153113m = null;
        } else {
            this.f153113m = oVar3;
        }
        if ((i14 & 8192) == 0) {
            this.f153114n = null;
        } else {
            this.f153114n = d14;
        }
        if ((i14 & 16384) == 0) {
            this.f153115o = null;
        } else {
            this.f153115o = l14;
        }
        if ((32768 & i14) == 0) {
            this.f153116p = null;
        } else {
            this.f153116p = l15;
        }
        if ((65536 & i14) == 0) {
            this.f153117q = null;
        } else {
            this.f153117q = d15;
        }
        if ((131072 & i14) == 0) {
            this.f153118r = null;
        } else {
            this.f153118r = num;
        }
        if ((262144 & i14) == 0) {
            this.f153119t = null;
        } else {
            this.f153119t = l16;
        }
        if ((524288 & i14) == 0) {
            this.f153120v = null;
        } else {
            this.f153120v = dVar;
        }
        if ((i14 & ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) == 0) {
            this.f153121w = null;
        } else {
            this.f153121w = cVar3;
        }
        final int i15 = 0;
        this.f153122x = o13.m.b(new e23.a(this) { // from class: rk0.e0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f0 f153096b;

            {
                this.f153096b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                i53.e eVar;
                i53.e eVar2;
                switch (i15) {
                    case 0:
                        i53.d<am.x0, Integer> dVar2 = this.f153096b.f153120v;
                        if (dVar2 == null || (eVar = (i53.e) dVar2.entrySet()) == null) {
                            return null;
                        }
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        for (Object obj : eVar) {
                            Map.Entry entry = (Map.Entry) obj;
                            am.x0 x0VarD = am.z0.d((am.x0) entry.getKey(), (am.x0) entry.getKey());
                            Object arrayList = linkedHashMap.get(x0VarD);
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                                linkedHashMap.put(x0VarD, arrayList);
                            }
                            ((List) arrayList).add(obj);
                        }
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap(p13.t0.a(linkedHashMap.size()));
                        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                            Object key = entry2.getKey();
                            Iterator it = ((List) entry2.getValue()).iterator();
                            int iIntValue = 0;
                            while (it.hasNext()) {
                                iIntValue += ((Number) ((Map.Entry) it.next()).getValue()).intValue();
                            }
                            linkedHashMap2.put(key, Integer.valueOf(iIntValue));
                        }
                        TreeMap treeMap = new TreeMap(new f0.d());
                        treeMap.putAll(linkedHashMap2);
                        return i53.a.k(treeMap);
                    default:
                        i53.d<am.x0, Integer> dVar3 = this.f153096b.f153120v;
                        if (dVar3 == null || (eVar2 = (i53.e) dVar3.entrySet()) == null) {
                            return null;
                        }
                        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                        for (Object obj2 : eVar2) {
                            Map.Entry entry3 = (Map.Entry) obj2;
                            am.x0 x0VarD2 = am.z0.d((am.x0) entry3.getKey(), (am.x0) entry3.getKey());
                            Object arrayList2 = linkedHashMap3.get(x0VarD2);
                            if (arrayList2 == null) {
                                arrayList2 = new ArrayList();
                                linkedHashMap3.put(x0VarD2, arrayList2);
                            }
                            ((List) arrayList2).add(obj2);
                        }
                        LinkedHashMap linkedHashMap4 = new LinkedHashMap(p13.t0.a(linkedHashMap3.size()));
                        for (Map.Entry entry4 : linkedHashMap3.entrySet()) {
                            Object key2 = entry4.getKey();
                            Iterator it3 = ((List) entry4.getValue()).iterator();
                            int iIntValue2 = 0;
                            while (it3.hasNext()) {
                                iIntValue2 += ((Number) ((Map.Entry) it3.next()).getValue()).intValue();
                            }
                            linkedHashMap4.put(key2, Integer.valueOf(iIntValue2));
                        }
                        TreeMap treeMap2 = new TreeMap(new f0.e());
                        treeMap2.putAll(linkedHashMap4);
                        return i53.a.k(treeMap2);
                }
            }
        });
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj;
        return p005kotlin.jvm.internal.s.g(this.f153101a, f0Var.f153101a) && p005kotlin.jvm.internal.s.g(this.f153102b, f0Var.f153102b) && this.f153103c == f0Var.f153103c && p005kotlin.jvm.internal.s.g(this.f153104d, f0Var.f153104d) && p005kotlin.jvm.internal.s.g(this.f153105e, f0Var.f153105e) && p005kotlin.jvm.internal.s.g(this.f153106f, f0Var.f153106f) && p005kotlin.jvm.internal.s.g(this.f153107g, f0Var.f153107g) && p005kotlin.jvm.internal.s.g(this.f153108h, f0Var.f153108h) && p005kotlin.jvm.internal.s.g(this.f153109i, f0Var.f153109i) && p005kotlin.jvm.internal.s.g(this.f153110j, f0Var.f153110j) && this.f153111k == f0Var.f153111k && p005kotlin.jvm.internal.s.g(this.f153112l, f0Var.f153112l) && p005kotlin.jvm.internal.s.g(this.f153113m, f0Var.f153113m) && p005kotlin.jvm.internal.s.g(this.f153114n, f0Var.f153114n) && p005kotlin.jvm.internal.s.g(this.f153115o, f0Var.f153115o) && p005kotlin.jvm.internal.s.g(this.f153116p, f0Var.f153116p) && p005kotlin.jvm.internal.s.g(this.f153117q, f0Var.f153117q) && p005kotlin.jvm.internal.s.g(this.f153118r, f0Var.f153118r) && p005kotlin.jvm.internal.s.g(this.f153119t, f0Var.f153119t) && p005kotlin.jvm.internal.s.g(this.f153120v, f0Var.f153120v) && p005kotlin.jvm.internal.s.g(this.f153121w, f0Var.f153121w);
    }

    public final int hashCode() {
        int iHashCode = this.f153101a.hashCode() * 31;
        i53.c<p0> cVar = this.f153102b;
        int iHashCode2 = (iHashCode + (cVar == null ? 0 : cVar.hashCode())) * 31;
        c80.u uVar = this.f153103c;
        int iHashCode3 = (iHashCode2 + (uVar == null ? 0 : uVar.hashCode())) * 31;
        Boolean bool = this.f153104d;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.f153105e;
        int iHashCode5 = (iHashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f153106f;
        int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f153107g;
        int iHashCode7 = (iHashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f153108h;
        int iHashCode8 = (iHashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        b63.o oVar = this.f153109i;
        int iHashCode9 = (iHashCode8 + (oVar == null ? 0 : oVar.f16206a.hashCode())) * 31;
        b63.o oVar2 = this.f153110j;
        int iHashCode10 = (iHashCode9 + (oVar2 == null ? 0 : oVar2.f16206a.hashCode())) * 31;
        c80.w wVar = this.f153111k;
        int iHashCode11 = (iHashCode10 + (wVar == null ? 0 : wVar.hashCode())) * 31;
        i53.c<am.x0> cVar2 = this.f153112l;
        int iHashCode12 = (iHashCode11 + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
        b63.o oVar3 = this.f153113m;
        int iHashCode13 = (iHashCode12 + (oVar3 == null ? 0 : oVar3.f16206a.hashCode())) * 31;
        Double d14 = this.f153114n;
        int iHashCode14 = (iHashCode13 + (d14 == null ? 0 : d14.hashCode())) * 31;
        Long l14 = this.f153115o;
        int iHashCode15 = (iHashCode14 + (l14 == null ? 0 : l14.hashCode())) * 31;
        Long l15 = this.f153116p;
        int iHashCode16 = (iHashCode15 + (l15 == null ? 0 : l15.hashCode())) * 31;
        Double d15 = this.f153117q;
        int iHashCode17 = (iHashCode16 + (d15 == null ? 0 : d15.hashCode())) * 31;
        Integer num = this.f153118r;
        int iHashCode18 = (iHashCode17 + (num == null ? 0 : num.hashCode())) * 31;
        Long l16 = this.f153119t;
        int iHashCode19 = (iHashCode18 + (l16 == null ? 0 : l16.hashCode())) * 31;
        i53.d<am.x0, Integer> dVar = this.f153120v;
        int iHashCode20 = (iHashCode19 + (dVar == null ? 0 : dVar.hashCode())) * 31;
        i53.c<l> cVar3 = this.f153121w;
        return iHashCode20 + (cVar3 != null ? cVar3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("GearDetailsUIModel(id=");
        sb3.append(this.f153101a);
        sb3.append(", images=");
        sb3.append(this.f153102b);
        sb3.append(", gearType=");
        sb3.append(this.f153103c);
        sb3.append(", retired=");
        sb3.append(this.f153104d);
        sb3.append(", nickname=");
        sn.a.t(sb3, this.f153105e, ", brand=", this.f153106f, ", model=");
        sn.a.t(sb3, this.f153107g, ", notes=", this.f153108h, ", retireDate=");
        sb3.append(this.f153109i);
        sb3.append(", firstUseDate=");
        sb3.append(this.f153110j);
        sb3.append(", usageType=");
        sb3.append(this.f153111k);
        sb3.append(", defaultActivityTypes=");
        sb3.append(this.f153112l);
        sb3.append(", maxUsageDate=");
        sb3.append(this.f153113m);
        sb3.append(", maxUsageDistanceMeters=");
        sb3.append(this.f153114n);
        sb3.append(", maxUsageDurationSeconds=");
        kg.f.s(sb3, this.f153115o, ", durationUsedSeconds=", this.f153116p, ", distanceUsedMeters=");
        b71.i.t(sb3, this.f153117q, ", numActivitiesLinked=", this.f153118r, ", daysUsed=");
        sb3.append(this.f153119t);
        sb3.append(", countsByActivityType=");
        sb3.append(this.f153120v);
        sb3.append(", collectionItems=");
        return l2.e(sb3, this.f153121w, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.f153101a);
        i53.c<p0> cVar = this.f153102b;
        if (cVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(cVar.size());
            Iterator<p0> it = cVar.iterator();
            while (it.hasNext()) {
                parcel.writeParcelable(it.next(), i14);
            }
        }
        c80.u uVar = this.f153103c;
        if (uVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(uVar.name());
        }
        Boolean bool = this.f153104d;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool);
        }
        parcel.writeString(this.f153105e);
        parcel.writeString(this.f153106f);
        parcel.writeString(this.f153107g);
        parcel.writeString(this.f153108h);
        vk0.i iVar = vk0.i.f178575a;
        iVar.b(this.f153109i, parcel);
        iVar.b(this.f153110j, parcel);
        c80.w wVar = this.f153111k;
        if (wVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(wVar.name());
        }
        i53.c<am.x0> cVar2 = this.f153112l;
        if (cVar2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(cVar2.size());
            Iterator<am.x0> it3 = cVar2.iterator();
            while (it3.hasNext()) {
                parcel.writeParcelable(it3.next(), i14);
            }
        }
        vk0.i.f178575a.b(this.f153113m, parcel);
        Double d14 = this.f153114n;
        if (d14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d14);
        }
        Long l14 = this.f153115o;
        if (l14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l14);
        }
        Long l15 = this.f153116p;
        if (l15 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l15);
        }
        Double d15 = this.f153117q;
        if (d15 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d15);
        }
        Integer num = this.f153118r;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num);
        }
        Long l16 = this.f153119t;
        if (l16 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l16);
        }
        i53.d<am.x0, Integer> dVar = this.f153120v;
        if (dVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(dVar.size());
            for (Map.Entry entry : (i53.e) dVar.entrySet()) {
                parcel.writeParcelable((Parcelable) entry.getKey(), i14);
                parcel.writeInt(((Number) entry.getValue()).intValue());
            }
        }
        i53.c<l> cVar3 = this.f153121w;
        if (cVar3 == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(cVar3.size());
        Iterator<l> it4 = cVar3.iterator();
        while (it4.hasNext()) {
            it4.next().writeToParcel(parcel, i14);
        }
    }

    /* JADX INFO: renamed from: rk0.f0$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lrk0/f0$b;", "", "<init>", "()V", "Li63/c;", "Lrk0/f0;", "serializer", "()Li63/c;", "gcm-gear_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: rk0.f0$b$a */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class a<T> implements Comparator {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Comparator f153124a;

            public a(Comparator comparator) {
                this.f153124a = comparator;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t7, T t14) {
                return this.f153124a.compare(((l) t7).f153209a, ((l) t14).f153209a);
            }
        }

        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static f0 a(jk0.x xVar) {
            i53.c cVarE;
            i53.c cVarE2;
            i53.d dVar;
            Long l14;
            c80.u uVar;
            xVar.getClass();
            String str = xVar.f99356f;
            if (str == null) {
                vb.h.z("Gear uuid is required. Did you get the dto from API?");
                return null;
            }
            List<jk0.n> list = xVar.f99371w;
            if (list != null) {
                ArrayList arrayList = new ArrayList(p13.y.r(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(new p0.c(((jk0.n) it.next()).f99298d));
                }
                cVarE = i53.a.e(arrayList);
            } else {
                cVarE = null;
            }
            String str2 = xVar.f99361k;
            b63.o oVar = xVar.f99362l;
            c80.u uVar2 = xVar.f99351a;
            String str3 = xVar.f99359i;
            if (str3 == null) {
                str3 = "";
            }
            String str4 = str3;
            String str5 = xVar.f99360j;
            String str6 = xVar.f99358h;
            b63.o oVar2 = xVar.f99352b;
            c80.w wVar = xVar.f99353c;
            List<jk0.g> list2 = xVar.f99354d;
            if (list2 != null) {
                ArrayList arrayList2 = new ArrayList();
                Iterator<T> it3 = list2.iterator();
                while (it3.hasNext()) {
                    am.x0 x0Var = (am.x0) ((jk0.g) it3.next()).f99251d.getValue();
                    if (x0Var != null) {
                        arrayList2.add(x0Var);
                    }
                }
                cVarE2 = i53.a.e(arrayList2);
            } else {
                cVarE2 = null;
            }
            b63.o oVar3 = xVar.f99363m;
            Double d14 = xVar.f99364n;
            Long l15 = xVar.f99365o;
            Long l16 = xVar.f99367q;
            Double d15 = xVar.f99368r;
            Integer num = xVar.f99366p;
            i53.c cVar = cVarE;
            boolean z14 = xVar.f99355e == jk0.p.Retired;
            Long l17 = xVar.f99369t;
            boolean z15 = z14;
            Map map = (Map) xVar.f99374z.getValue();
            i53.d dVarG = map != null ? i53.a.g(map) : null;
            List<jk0.k> list3 = xVar.f99373y;
            if (list3 != null) {
                ArrayList arrayList3 = new ArrayList();
                for (jk0.k kVar : list3) {
                    i53.d dVar2 = dVarG;
                    Long l18 = l17;
                    String str7 = kVar.f99274c;
                    c80.u uVar3 = uVar2;
                    l lVar = str7 != null ? new l(kVar.f99272a, str7) : null;
                    if (lVar != null) {
                        arrayList3.add(lVar);
                    }
                    l17 = l18;
                    dVarG = dVar2;
                    uVar2 = uVar3;
                }
                dVar = dVarG;
                l14 = l17;
                uVar = uVar2;
                d53.u.s(p005kotlin.jvm.internal.x0.f105818a);
                List listN0 = p13.h0.N0(arrayList3, new a(String.CASE_INSENSITIVE_ORDER));
                i53.c cVarE3 = listN0 != null ? i53.a.e(listN0) : null;
                return new f0(str, cVar, uVar, Boolean.valueOf(z15), str6, str4, str5, str2, oVar, oVar2, wVar, cVarE2, oVar3, d14, l15, l16, d15, num, l14, dVar, cVarE3);
            }
            dVar = dVarG;
            l14 = l17;
            uVar = uVar2;
            return new f0(str, cVar, uVar, Boolean.valueOf(z15), str6, str4, str5, str2, oVar, oVar2, wVar, cVarE2, oVar3, d14, l15, l16, d15, num, l14, dVar, cVarE3);
        }

        public final i63.c<f0> serializer() {
            return a.f153123a;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public f0(String str, i53.c<? extends p0> cVar, c80.u uVar, Boolean bool, String str2, String str3, String str4, String str5, b63.o oVar, b63.o oVar2, c80.w wVar, i53.c<? extends am.x0> cVar2, b63.o oVar3, Double d14, Long l14, Long l15, Double d15, Integer num, Long l16, i53.d<am.x0, Integer> dVar, i53.c<l> cVar3) {
        str.getClass();
        this.f153101a = str;
        this.f153102b = cVar;
        this.f153103c = uVar;
        this.f153104d = bool;
        this.f153105e = str2;
        this.f153106f = str3;
        this.f153107g = str4;
        this.f153108h = str5;
        this.f153109i = oVar;
        this.f153110j = oVar2;
        this.f153111k = wVar;
        this.f153112l = cVar2;
        this.f153113m = oVar3;
        this.f153114n = d14;
        this.f153115o = l14;
        this.f153116p = l15;
        this.f153117q = d15;
        this.f153118r = num;
        this.f153119t = l16;
        this.f153120v = dVar;
        this.f153121w = cVar3;
        final int i14 = 1;
        this.f153122x = o13.m.b(new e23.a(this) { // from class: rk0.e0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f0 f153096b;

            {
                this.f153096b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                i53.e eVar;
                i53.e eVar2;
                switch (i14) {
                    case 0:
                        i53.d<am.x0, Integer> dVar2 = this.f153096b.f153120v;
                        if (dVar2 == null || (eVar = (i53.e) dVar2.entrySet()) == null) {
                            return null;
                        }
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        for (Object obj : eVar) {
                            Map.Entry entry = (Map.Entry) obj;
                            am.x0 x0VarD = am.z0.d((am.x0) entry.getKey(), (am.x0) entry.getKey());
                            Object arrayList = linkedHashMap.get(x0VarD);
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                                linkedHashMap.put(x0VarD, arrayList);
                            }
                            ((List) arrayList).add(obj);
                        }
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap(p13.t0.a(linkedHashMap.size()));
                        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                            Object key = entry2.getKey();
                            Iterator it = ((List) entry2.getValue()).iterator();
                            int iIntValue = 0;
                            while (it.hasNext()) {
                                iIntValue += ((Number) ((Map.Entry) it.next()).getValue()).intValue();
                            }
                            linkedHashMap2.put(key, Integer.valueOf(iIntValue));
                        }
                        TreeMap treeMap = new TreeMap(new f0.d());
                        treeMap.putAll(linkedHashMap2);
                        return i53.a.k(treeMap);
                    default:
                        i53.d<am.x0, Integer> dVar3 = this.f153096b.f153120v;
                        if (dVar3 == null || (eVar2 = (i53.e) dVar3.entrySet()) == null) {
                            return null;
                        }
                        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                        for (Object obj2 : eVar2) {
                            Map.Entry entry3 = (Map.Entry) obj2;
                            am.x0 x0VarD2 = am.z0.d((am.x0) entry3.getKey(), (am.x0) entry3.getKey());
                            Object arrayList2 = linkedHashMap3.get(x0VarD2);
                            if (arrayList2 == null) {
                                arrayList2 = new ArrayList();
                                linkedHashMap3.put(x0VarD2, arrayList2);
                            }
                            ((List) arrayList2).add(obj2);
                        }
                        LinkedHashMap linkedHashMap4 = new LinkedHashMap(p13.t0.a(linkedHashMap3.size()));
                        for (Map.Entry entry4 : linkedHashMap3.entrySet()) {
                            Object key2 = entry4.getKey();
                            Iterator it3 = ((List) entry4.getValue()).iterator();
                            int iIntValue2 = 0;
                            while (it3.hasNext()) {
                                iIntValue2 += ((Number) ((Map.Entry) it3.next()).getValue()).intValue();
                            }
                            linkedHashMap4.put(key2, Integer.valueOf(iIntValue2));
                        }
                        TreeMap treeMap2 = new TreeMap(new f0.e());
                        treeMap2.putAll(linkedHashMap4);
                        return i53.a.k(treeMap2);
                }
            }
        });
    }

    public /* synthetic */ f0(String str, i53.c cVar, c80.u uVar, Boolean bool, String str2, String str3, String str4, String str5, b63.o oVar, b63.o oVar2, c80.w wVar, i53.c cVar2, b63.o oVar3, Double d14, Long l14, Long l15, Double d15, Integer num, Long l16, i53.d dVar, i53.c cVar3, int i14, p005kotlin.jvm.internal.j jVar) {
        this(str, (i14 & 2) != 0 ? null : cVar, (i14 & 4) != 0 ? null : uVar, (i14 & 8) != 0 ? null : bool, (i14 & 16) != 0 ? null : str2, (i14 & 32) != 0 ? null : str3, (i14 & 64) != 0 ? null : str4, (i14 & 128) != 0 ? null : str5, (i14 & 256) != 0 ? null : oVar, (i14 & 512) != 0 ? null : oVar2, (i14 & 1024) != 0 ? null : wVar, (i14 & 2048) != 0 ? null : cVar2, (i14 & 4096) != 0 ? null : oVar3, (i14 & 8192) != 0 ? null : d14, (i14 & 16384) != 0 ? null : l14, (i14 & 32768) != 0 ? null : l15, (i14 & 65536) != 0 ? null : d15, (i14 & 131072) != 0 ? null : num, (i14 & GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE) != 0 ? null : l16, (i14 & 524288) != 0 ? null : dVar, (i14 & ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : cVar3);
    }
}

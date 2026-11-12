package com.garmin.android.apps.connectmobile.pacepro.data.dto;

import android.os.Parcel;
import android.os.Parcelable;
import i63.h;
import l63.d;
import l63.f;
import m63.d0;
import m63.e0;
import m63.g;
import m63.m1;
import m63.u1;
import m63.v0;
import m63.x;
import m63.y1;
import o13.e;
import o13.l;
import o13.m;
import o13.n;
import org.joda.time.LocalDateTime;
import org.joda.time.ReadablePartial;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import t41.i;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 #2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0002$%BÕ\u0001\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0012\u001a\u00020\r\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0016\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u001c\u0010\u001dBÇ\u0001\b\u0010\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\u0006\u0010\u0012\u001a\u00020\r\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010!\u001a\u0004\u0018\u00010 ¢\u0006\u0004\b\u001c\u0010\"¨\u0006&"}, d2 = {"Lcom/garmin/android/apps/connectmobile/pacepro/data/dto/b;", "Landroid/os/Parcelable;", "", "", "paceBandPk", "", "name", "courseId", "userProfilePk", "Lt41/i;", "splitsDisplayType", "Lt41/a;", "distanceUnitType", "", "totalDistance", "uphillEffort", "pacingStrategy", "goalTime", "goalSpeed", "createdDate", "lastUpdatedDate", "eventDate", "", "manualPaceEdit", "", "elevationSegmentationTolerance", "elevationSegmentMinLength", "paceFactor", "<init>", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Lt41/i;Lt41/a;DLjava/lang/Double;Ljava/lang/Double;JDLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILjava/lang/Long;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Lt41/i;Lt41/a;DLjava/lang/Double;Ljava/lang/Double;JDLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Lm63/u1;)V", "Companion", "b", "a", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@h
public final /* data */ class b implements Parcelable, Comparable<b> {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final l<i63.c<Object>>[] f39763v;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f39764a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f39765b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Long f39766c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Long f39767d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final i f39768e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final t41.a f39769f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final double f39770g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Double f39771h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Double f39772i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f39773j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final double f39774k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f39775l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f39776m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f39777n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f39778o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Float f39779p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Float f39780q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Float f39781r;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<b> CREATOR = new c();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f39762t = 8;

    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/pacepro/data/dto/PaceBandSummaryDTO.$serializer", "Lm63/e0;", "Lcom/garmin/android/apps/connectmobile/pacepro/data/dto/b;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @e
    public static final /* synthetic */ class a implements e0<b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f39782a;
        private static final k63.e descriptor;

        static {
            a aVar = new a();
            f39782a = aVar;
            m1 m1Var = new m1("com.garmin.android.apps.connectmobile.pacepro.data.dto.PaceBandSummaryDTO", aVar, 18);
            m1Var.j("paceBandPk", true);
            m1Var.j("name", true);
            m1Var.j("courseId", true);
            m1Var.j("userProfilePk", true);
            m1Var.j("splitType", true);
            m1Var.j("distanceUnit", true);
            m1Var.j("totalDistance", true);
            m1Var.j("uphillEffort", true);
            m1Var.j("pacingStrategy", true);
            m1Var.j("goalTime", true);
            m1Var.j("goalSpeed", true);
            m1Var.j("createdDate", true);
            m1Var.j("lastUpdatedDate", true);
            m1Var.j("eventDate", true);
            m1Var.j("manualPaceEdit", true);
            m1Var.j("elevationSegmentationTolerance", true);
            m1Var.j("elevationSegmentMinLength", true);
            m1Var.j("paceFactor", true);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // m63.e0
        public final i63.c<?>[] childSerializers() {
            l<i63.c<Object>>[] lVarArr = b.f39763v;
            v0 v0Var = v0.f117027a;
            i63.c<?> cVarD = j63.a.d(v0Var);
            y1 y1Var = y1.f117048a;
            i63.c<?> cVarD2 = j63.a.d(v0Var);
            i63.c<?> cVarD3 = j63.a.d(v0Var);
            i63.c<?> cVarD4 = j63.a.d(lVarArr[4].getValue());
            i63.c<?> cVarD5 = j63.a.d(lVarArr[5].getValue());
            x xVar = x.f117036a;
            i63.c<?> cVarD6 = j63.a.d(xVar);
            i63.c<?> cVarD7 = j63.a.d(xVar);
            i63.c<?> cVarD8 = j63.a.d(y1Var);
            i63.c<?> cVarD9 = j63.a.d(y1Var);
            i63.c<?> cVarD10 = j63.a.d(y1Var);
            d0 d0Var = d0.f116930a;
            return new i63.c[]{cVarD, y1Var, cVarD2, cVarD3, cVarD4, cVarD5, xVar, cVarD6, cVarD7, v0Var, xVar, cVarD8, cVarD9, cVarD10, g.f116948a, j63.a.d(d0Var), j63.a.d(d0Var), j63.a.d(d0Var)};
        }

        @Override // i63.b
        public final Object deserialize(l63.e eVar) {
            int i14;
            eVar.getClass();
            k63.e eVar2 = descriptor;
            l63.c cVarC = eVar.c(eVar2);
            l<i63.c<Object>>[] lVarArr = b.f39763v;
            int i15 = l63.c.f110557a;
            double dT = 0.0d;
            double dT2 = 0.0d;
            long jW = 0;
            Float f14 = null;
            String str = null;
            String str2 = null;
            String str3 = null;
            Float f15 = null;
            i iVar = null;
            t41.a aVar = null;
            Double d14 = null;
            Double d15 = null;
            int i16 = 0;
            Long l14 = null;
            Float f16 = null;
            Long l15 = null;
            Long l16 = null;
            boolean z14 = true;
            String strR = null;
            boolean zG = false;
            while (z14) {
                int iE = cVarC.e(eVar2);
                switch (iE) {
                    case -1:
                        f14 = f14;
                        z14 = false;
                        f14 = f14;
                        break;
                    case 0:
                        f14 = f14;
                        l14 = (Long) cVarC.v(eVar2, 0, v0.f117027a, l14);
                        i16 |= 1;
                        l15 = l15;
                        f14 = f14;
                        break;
                    case 1:
                        strR = cVarC.r(eVar2, 1);
                        i16 |= 2;
                        l14 = l14;
                        f14 = f14;
                        break;
                    case 2:
                        l15 = (Long) cVarC.v(eVar2, 2, v0.f117027a, l15);
                        i16 |= 4;
                        l14 = l14;
                        f14 = f14;
                        break;
                    case 3:
                        l14 = l14;
                        l15 = l15;
                        l16 = (Long) cVarC.v(eVar2, 3, v0.f117027a, l16);
                        i16 |= 8;
                        l14 = l14;
                        l15 = l15;
                        break;
                    case 4:
                        l14 = l14;
                        l15 = l15;
                        iVar = (i) cVarC.v(eVar2, 4, lVarArr[4].getValue(), iVar);
                        i16 |= 16;
                        l14 = l14;
                        l15 = l15;
                        break;
                    case 5:
                        l14 = l14;
                        l15 = l15;
                        aVar = (t41.a) cVarC.v(eVar2, 5, lVarArr[5].getValue(), aVar);
                        i16 |= 32;
                        l14 = l14;
                        l15 = l15;
                        break;
                    case 6:
                        dT = cVarC.t(eVar2, 6);
                        i16 |= 64;
                        l14 = l14;
                        break;
                    case 7:
                        l14 = l14;
                        l15 = l15;
                        d14 = (Double) cVarC.v(eVar2, 7, x.f117036a, d14);
                        i16 |= 128;
                        l14 = l14;
                        l15 = l15;
                        break;
                    case 8:
                        l14 = l14;
                        l15 = l15;
                        d15 = (Double) cVarC.v(eVar2, 8, x.f117036a, d15);
                        i16 |= 256;
                        l14 = l14;
                        l15 = l15;
                        break;
                    case 9:
                        jW = cVarC.w(eVar2, 9);
                        i16 |= 512;
                        l14 = l14;
                        break;
                    case 10:
                        dT2 = cVarC.t(eVar2, 10);
                        i16 |= 1024;
                        l14 = l14;
                        break;
                    case 11:
                        l14 = l14;
                        l15 = l15;
                        str3 = (String) cVarC.v(eVar2, 11, y1.f117048a, str3);
                        i16 |= 2048;
                        l14 = l14;
                        l15 = l15;
                        break;
                    case 12:
                        l14 = l14;
                        l15 = l15;
                        str2 = (String) cVarC.v(eVar2, 12, y1.f117048a, str2);
                        i16 |= 4096;
                        l14 = l14;
                        l15 = l15;
                        break;
                    case 13:
                        l14 = l14;
                        l15 = l15;
                        str = (String) cVarC.v(eVar2, 13, y1.f117048a, str);
                        i16 |= 8192;
                        l14 = l14;
                        l15 = l15;
                        break;
                    case 14:
                        zG = cVarC.g(eVar2, 14);
                        i16 |= 16384;
                        l14 = l14;
                        break;
                    case 15:
                        f14 = (Float) cVarC.v(eVar2, 15, d0.f116930a, f14);
                        i14 = 32768;
                        i16 |= i14;
                        l14 = l14;
                        l15 = l15;
                        break;
                    case 16:
                        f15 = (Float) cVarC.v(eVar2, 16, d0.f116930a, f15);
                        i14 = 65536;
                        i16 |= i14;
                        l14 = l14;
                        l15 = l15;
                        break;
                    case 17:
                        f16 = (Float) cVarC.v(eVar2, 17, d0.f116930a, f16);
                        i14 = 131072;
                        i16 |= i14;
                        l14 = l14;
                        l15 = l15;
                        break;
                    default:
                        hb.a.o(iE);
                        return null;
                }
            }
            cVarC.b(eVar2);
            return new b(i16, l14, strR, l15, l16, iVar, aVar, dT, d14, d15, jW, dT2, str3, str2, str, zG, f14, f15, f16, (u1) null);
        }

        @Override // i63.i, i63.b
        /* JADX INFO: renamed from: getDescriptor */
        public final k63.e getF116202c() {
            return descriptor;
        }

        /* JADX WARN: Code duplicated, block: B:100:0x01b1  */
        /* JADX WARN: Code duplicated, block: B:69:0x012e  */
        /* JADX WARN: Code duplicated, block: B:74:0x0140  */
        /* JADX WARN: Code duplicated, block: B:79:0x0152  */
        /* JADX WARN: Code duplicated, block: B:84:0x0164  */
        /* JADX WARN: Code duplicated, block: B:87:0x0171  */
        /* JADX WARN: Code duplicated, block: B:88:0x0174  */
        /* JADX WARN: Code duplicated, block: B:93:0x018f  */
        /* JADX WARN: Code duplicated, block: B:94:0x0192  */
        /* JADX WARN: Code duplicated, block: B:99:0x01ae  */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // i63.i
        public final void serialize(f fVar, Object obj) {
            double d14;
            Float f14;
            Float f15;
            Float f16;
            b bVar = (b) obj;
            bVar.getClass();
            Float f17 = bVar.f39781r;
            Float f18 = bVar.f39780q;
            Float f19 = bVar.f39779p;
            boolean z14 = bVar.f39778o;
            String str = bVar.f39777n;
            String str2 = bVar.f39776m;
            String str3 = bVar.f39775l;
            double d15 = bVar.f39774k;
            long j8 = bVar.f39773j;
            Double d16 = bVar.f39772i;
            Double d17 = bVar.f39771h;
            double d18 = bVar.f39770g;
            t41.a aVar = bVar.f39769f;
            i iVar = bVar.f39768e;
            Long l14 = bVar.f39767d;
            Long l15 = bVar.f39766c;
            String str4 = bVar.f39765b;
            Long l16 = bVar.f39764a;
            k63.e eVar = descriptor;
            d dVarC = fVar.c(eVar);
            Double dValueOf = Double.valueOf(0.0d);
            l<i63.c<Object>>[] lVarArr = b.f39763v;
            if (dVarC.C(eVar) || l16 != null) {
                dVarC.d(eVar, 0, v0.f117027a, l16);
            }
            if (dVarC.C(eVar) || !s.g(str4, "")) {
                dVarC.k(eVar, 1, str4);
            }
            if (dVarC.C(eVar) || l15 != null) {
                dVarC.d(eVar, 2, v0.f117027a, l15);
            }
            if (dVarC.C(eVar) || l14 != null) {
                dVarC.d(eVar, 3, v0.f117027a, l14);
            }
            if (dVarC.C(eVar) || iVar != null) {
                dVarC.d(eVar, 4, (i63.i) lVarArr[4].getValue(), iVar);
            }
            if (dVarC.C(eVar) || aVar != null) {
                dVarC.d(eVar, 5, lVarArr[5].getValue(), aVar);
            }
            if (dVarC.C(eVar) || Double.compare(d18, 0.0d) != 0) {
                dVarC.B(eVar, 6, d18);
            }
            if (dVarC.C(eVar) || !s.g(d17, dValueOf)) {
                dVarC.d(eVar, 7, x.f117036a, d17);
            }
            if (dVarC.C(eVar) || !s.g(d16, dValueOf)) {
                dVarC.d(eVar, 8, x.f117036a, d16);
            }
            if (dVarC.C(eVar) || j8 != 0) {
                dVarC.z(eVar, 9, j8);
            }
            if (!dVarC.C(eVar)) {
                d14 = d15;
                if (Double.compare(d14, 0.0d) != 0) {
                }
                if (dVarC.C(eVar) || str3 != null) {
                    dVarC.d(eVar, 11, y1.f117048a, str3);
                }
                if (dVarC.C(eVar) || str2 != null) {
                    dVarC.d(eVar, 12, y1.f117048a, str2);
                }
                if (dVarC.C(eVar) || str != null) {
                    dVarC.d(eVar, 13, y1.f117048a, str);
                }
                if (dVarC.C(eVar) || z14) {
                    dVarC.n(eVar, 14, z14);
                }
                if (dVarC.C(eVar)) {
                    f14 = f19;
                    if (!s.g(f14, Float.valueOf(50.0f))) {
                    }
                    if (dVarC.C(eVar)) {
                        f15 = f18;
                        if (!s.g(f15, Float.valueOf(1700.0f))) {
                        }
                        if (dVarC.C(eVar)) {
                            if (!s.g(f16, Float.valueOf(2.0f))) {
                            }
                            f16 = f17;
                            dVarC.b(eVar);
                        }
                        f16 = f17;
                        f16 = f17;
                        dVarC.d(eVar, 17, d0.f116930a, f16);
                        f16 = f17;
                        dVarC.b(eVar);
                    }
                    f15 = f18;
                    dVarC.d(eVar, 16, d0.f116930a, f15);
                    if (dVarC.C(eVar)) {
                        if (!s.g(f16, Float.valueOf(2.0f))) {
                        }
                        f16 = f17;
                        dVarC.b(eVar);
                    }
                    f16 = f17;
                    f16 = f17;
                    dVarC.d(eVar, 17, d0.f116930a, f16);
                    f16 = f17;
                    dVarC.b(eVar);
                }
                f14 = f19;
                dVarC.d(eVar, 15, d0.f116930a, f14);
                if (dVarC.C(eVar)) {
                    f15 = f18;
                    if (!s.g(f15, Float.valueOf(1700.0f))) {
                    }
                    if (dVarC.C(eVar)) {
                        if (!s.g(f16, Float.valueOf(2.0f))) {
                        }
                        f16 = f17;
                        dVarC.b(eVar);
                    }
                    f16 = f17;
                    f16 = f17;
                    dVarC.d(eVar, 17, d0.f116930a, f16);
                    f16 = f17;
                    dVarC.b(eVar);
                }
                f15 = f18;
                dVarC.d(eVar, 16, d0.f116930a, f15);
                if (dVarC.C(eVar)) {
                    if (!s.g(f16, Float.valueOf(2.0f))) {
                    }
                    f16 = f17;
                    dVarC.b(eVar);
                }
                f16 = f17;
                f16 = f17;
                dVarC.d(eVar, 17, d0.f116930a, f16);
                f16 = f17;
                dVarC.b(eVar);
            }
            d14 = d15;
            dVarC.B(eVar, 10, d14);
            if (dVarC.C(eVar)) {
                dVarC.d(eVar, 11, y1.f117048a, str3);
            } else {
                dVarC.d(eVar, 11, y1.f117048a, str3);
            }
            if (dVarC.C(eVar)) {
                dVarC.d(eVar, 12, y1.f117048a, str2);
            } else {
                dVarC.d(eVar, 12, y1.f117048a, str2);
            }
            if (dVarC.C(eVar)) {
                dVarC.d(eVar, 13, y1.f117048a, str);
            } else {
                dVarC.d(eVar, 13, y1.f117048a, str);
            }
            if (dVarC.C(eVar)) {
                dVarC.n(eVar, 14, z14);
            } else {
                dVarC.n(eVar, 14, z14);
            }
            if (dVarC.C(eVar)) {
                f14 = f19;
                if (!s.g(f14, Float.valueOf(50.0f))) {
                }
                if (dVarC.C(eVar)) {
                    f15 = f18;
                    if (!s.g(f15, Float.valueOf(1700.0f))) {
                    }
                    if (dVarC.C(eVar)) {
                        if (!s.g(f16, Float.valueOf(2.0f))) {
                        }
                        f16 = f17;
                        dVarC.b(eVar);
                    }
                    f16 = f17;
                    f16 = f17;
                    dVarC.d(eVar, 17, d0.f116930a, f16);
                    f16 = f17;
                    dVarC.b(eVar);
                }
                f15 = f18;
                dVarC.d(eVar, 16, d0.f116930a, f15);
                if (dVarC.C(eVar)) {
                    if (!s.g(f16, Float.valueOf(2.0f))) {
                    }
                    f16 = f17;
                    dVarC.b(eVar);
                }
                f16 = f17;
                f16 = f17;
                dVarC.d(eVar, 17, d0.f116930a, f16);
                f16 = f17;
                dVarC.b(eVar);
            }
            f14 = f19;
            dVarC.d(eVar, 15, d0.f116930a, f14);
            if (dVarC.C(eVar)) {
                f15 = f18;
                if (!s.g(f15, Float.valueOf(1700.0f))) {
                }
                if (dVarC.C(eVar)) {
                    if (!s.g(f16, Float.valueOf(2.0f))) {
                    }
                    f16 = f17;
                    dVarC.b(eVar);
                }
                f16 = f17;
                f16 = f17;
                dVarC.d(eVar, 17, d0.f116930a, f16);
                f16 = f17;
                dVarC.b(eVar);
            }
            f15 = f18;
            dVarC.d(eVar, 16, d0.f116930a, f15);
            if (dVarC.C(eVar)) {
                if (!s.g(f16, Float.valueOf(2.0f))) {
                }
                f16 = f17;
                dVarC.b(eVar);
            }
            f16 = f17;
            f16 = f17;
            dVarC.d(eVar, 17, d0.f116930a, f16);
            f16 = f17;
            dVarC.b(eVar);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements Parcelable.Creator<b> {
        @Override // android.os.Parcelable.Creator
        public final b createFromParcel(Parcel parcel) {
            parcel.getClass();
            Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            String string = parcel.readString();
            Long lValueOf2 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            Long lValueOf3 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            i iVarCreateFromParcel = parcel.readInt() == 0 ? null : i.CREATOR.createFromParcel(parcel);
            t41.a aVarCreateFromParcel = parcel.readInt() == 0 ? null : t41.a.CREATOR.createFromParcel(parcel);
            Long l14 = lValueOf;
            Long l15 = lValueOf2;
            Long l16 = lValueOf3;
            double d14 = parcel.readDouble();
            Double dValueOf = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            Double dValueOf2 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            long j8 = parcel.readLong();
            Double d15 = dValueOf;
            Double d16 = dValueOf2;
            double d17 = parcel.readDouble();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            Float fValueOf = null;
            String string4 = parcel.readString();
            boolean z14 = parcel.readInt() != 0;
            Float fValueOf2 = parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat());
            Float fValueOf3 = parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat());
            if (parcel.readInt() != 0) {
                fValueOf = Float.valueOf(parcel.readFloat());
            }
            return new b(l14, string, l15, l16, iVarCreateFromParcel, aVarCreateFromParcel, d14, d15, d16, j8, d17, string2, string3, string4, z14, fValueOf2, fValueOf3, fValueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final b[] newArray(int i14) {
            return new b[i14];
        }
    }

    static {
        n nVar = n.PUBLICATION;
        f39763v = new l[]{null, null, null, null, m.a(nVar, new pk0.m(27)), m.a(nVar, new pk0.m(28)), null, null, null, null, null, null, null, null, null, null, null, null};
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ b(Long l14, String str, Long l15, Long l16, i iVar, t41.a aVar, double d14, Double d15, Double d16, long j8, double d17, String str2, String str3, String str4, boolean z14, Float f14, Float f15, Float f16, int i14, j jVar) {
        Double dValueOf = Double.valueOf(0.0d);
        this((i14 & 1) != 0 ? null : l14, (i14 & 2) != 0 ? "" : str, (i14 & 4) != 0 ? null : l15, (i14 & 8) != 0 ? null : l16, (i14 & 16) != 0 ? null : iVar, (i14 & 32) != 0 ? null : aVar, (i14 & 64) != 0 ? 0.0d : d14, (i14 & 128) != 0 ? dValueOf : d15, (i14 & 256) == 0 ? d16 : dValueOf, (i14 & 512) != 0 ? 0L : j8, (i14 & 1024) != 0 ? 0.0d : d17, (i14 & 2048) != 0 ? null : str2, (i14 & 4096) != 0 ? null : str3, (i14 & 8192) != 0 ? null : str4, (i14 & 16384) != 0 ? false : z14, (i14 & 32768) != 0 ? Float.valueOf(50.0f) : f14, (i14 & 65536) != 0 ? Float.valueOf(1700.0f) : f15, (i14 & 131072) != 0 ? Float.valueOf(2.0f) : f16);
    }

    public static b b(b bVar, String str, Long l14, i iVar, t41.a aVar, double d14, Double d15, Double d16, long j8, double d17, boolean z14, Float f14, Float f15, Float f16, int i14) {
        Long l15 = (i14 & 1) != 0 ? bVar.f39764a : null;
        String str2 = (i14 & 2) != 0 ? bVar.f39765b : str;
        Long l16 = (i14 & 4) != 0 ? bVar.f39766c : l14;
        Long l17 = bVar.f39767d;
        i iVar2 = (i14 & 16) != 0 ? bVar.f39768e : iVar;
        t41.a aVar2 = (i14 & 32) != 0 ? bVar.f39769f : aVar;
        double d18 = (i14 & 64) != 0 ? bVar.f39770g : d14;
        Double d19 = (i14 & 128) != 0 ? bVar.f39771h : d15;
        Double d24 = (i14 & 256) != 0 ? bVar.f39772i : d16;
        long j14 = (i14 & 512) != 0 ? bVar.f39773j : j8;
        double d25 = (i14 & 1024) != 0 ? bVar.f39774k : d17;
        String str3 = bVar.f39775l;
        String str4 = bVar.f39776m;
        String str5 = bVar.f39777n;
        boolean z15 = (i14 & 16384) != 0 ? bVar.f39778o : z14;
        Float f17 = (32768 & i14) != 0 ? bVar.f39779p : f14;
        Float f18 = (65536 & i14) != 0 ? bVar.f39780q : f15;
        Float f19 = (i14 & 131072) != 0 ? bVar.f39781r : f16;
        bVar.getClass();
        str2.getClass();
        return new b(l15, str2, l16, l17, iVar2, aVar2, d18, d19, d24, j14, d25, str3, str4, str5, z15, f17, f18, f19);
    }

    public static boolean g() {
        return ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).y();
    }

    @Override // java.lang.Comparable
    public final int compareTo(b bVar) {
        b bVar2 = bVar;
        bVar2.getClass();
        return new LocalDateTime(bVar2.f39776m).compareTo((ReadablePartial) new LocalDateTime(this.f39776m));
    }

    public final boolean d() {
        t41.a aVar = this.f39769f;
        if (aVar != null) {
            return aVar == t41.a.KILOMETER;
        }
        return f();
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
        return s.g(this.f39764a, bVar.f39764a) && s.g(this.f39765b, bVar.f39765b) && s.g(this.f39766c, bVar.f39766c) && s.g(this.f39767d, bVar.f39767d) && this.f39768e == bVar.f39768e && this.f39769f == bVar.f39769f && Double.compare(this.f39770g, bVar.f39770g) == 0 && s.g(this.f39771h, bVar.f39771h) && s.g(this.f39772i, bVar.f39772i) && this.f39773j == bVar.f39773j && Double.compare(this.f39774k, bVar.f39774k) == 0 && s.g(this.f39775l, bVar.f39775l) && s.g(this.f39776m, bVar.f39776m) && s.g(this.f39777n, bVar.f39777n) && this.f39778o == bVar.f39778o && s.g(this.f39779p, bVar.f39779p) && s.g(this.f39780q, bVar.f39780q) && s.g(this.f39781r, bVar.f39781r);
    }

    public final boolean f() {
        i iVar = i.EVERY_KM;
        i iVar2 = this.f39768e;
        if (iVar2 != iVar) {
            return iVar2 == i.ELEVATION_BASED && g();
        }
        return true;
    }

    public final int hashCode() {
        Long l14 = this.f39764a;
        int iJ = wr.g.j((l14 == null ? 0 : l14.hashCode()) * 31, 31, this.f39765b);
        Long l15 = this.f39766c;
        int iHashCode = (iJ + (l15 == null ? 0 : l15.hashCode())) * 31;
        Long l16 = this.f39767d;
        int iHashCode2 = (iHashCode + (l16 == null ? 0 : l16.hashCode())) * 31;
        i iVar = this.f39768e;
        int iHashCode3 = (iHashCode2 + (iVar == null ? 0 : iVar.hashCode())) * 31;
        t41.a aVar = this.f39769f;
        int iB = org.apache.commons.lang3.e.b((iHashCode3 + (aVar == null ? 0 : aVar.hashCode())) * 31, 31, this.f39770g);
        Double d14 = this.f39771h;
        int iHashCode4 = (iB + (d14 == null ? 0 : d14.hashCode())) * 31;
        Double d15 = this.f39772i;
        int iB2 = org.apache.commons.lang3.e.b(q6.f.e((iHashCode4 + (d15 == null ? 0 : d15.hashCode())) * 31, 31, this.f39773j), 31, this.f39774k);
        String str = this.f39775l;
        int iHashCode5 = (iB2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f39776m;
        int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f39777n;
        int iG = q6.f.g((iHashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.f39778o);
        Float f14 = this.f39779p;
        int iHashCode7 = (iG + (f14 == null ? 0 : f14.hashCode())) * 31;
        Float f15 = this.f39780q;
        int iHashCode8 = (iHashCode7 + (f15 == null ? 0 : f15.hashCode())) * 31;
        Float f16 = this.f39781r;
        return iHashCode8 + (f16 != null ? f16.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbJ = b71.i.j("PaceBandSummaryDTO(paceBandPk=", ", name=", this.f39765b, this.f39764a, ", courseId=");
        kg.f.s(sbJ, this.f39766c, ", userProfilePk=", this.f39767d, ", splitsDisplayType=");
        sbJ.append(this.f39768e);
        sbJ.append(", distanceUnitType=");
        sbJ.append(this.f39769f);
        sbJ.append(", totalDistance=");
        sbJ.append(this.f39770g);
        sbJ.append(", uphillEffort=");
        sbJ.append(this.f39771h);
        sbJ.append(", pacingStrategy=");
        sbJ.append(this.f39772i);
        sbJ.append(", goalTime=");
        sbJ.append(this.f39773j);
        am.j.x(sbJ, ", goalSpeed=", this.f39774k, ", createdDate=");
        sn.a.t(sbJ, this.f39775l, ", lastUpdatedDate=", this.f39776m, ", eventDate=");
        v.h.C(this.f39777n, ", manualPaceEdit=", ", elevationSegmentationTolerance=", sbJ, this.f39778o);
        sbJ.append(this.f39779p);
        sbJ.append(", elevationSegmentMinLength=");
        sbJ.append(this.f39780q);
        sbJ.append(", paceFactor=");
        sbJ.append(this.f39781r);
        sbJ.append(")");
        return sbJ.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        Long l14 = this.f39764a;
        if (l14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l14);
        }
        parcel.writeString(this.f39765b);
        Long l15 = this.f39766c;
        if (l15 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l15);
        }
        Long l16 = this.f39767d;
        if (l16 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l16);
        }
        i iVar = this.f39768e;
        if (iVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            iVar.writeToParcel(parcel, i14);
        }
        t41.a aVar = this.f39769f;
        if (aVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            aVar.writeToParcel(parcel, i14);
        }
        parcel.writeDouble(this.f39770g);
        Double d14 = this.f39771h;
        if (d14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d14);
        }
        Double d15 = this.f39772i;
        if (d15 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d15);
        }
        parcel.writeLong(this.f39773j);
        parcel.writeDouble(this.f39774k);
        parcel.writeString(this.f39775l);
        parcel.writeString(this.f39776m);
        parcel.writeString(this.f39777n);
        parcel.writeInt(this.f39778o ? 1 : 0);
        Float f14 = this.f39779p;
        if (f14 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeFloat(f14.floatValue());
        }
        Float f15 = this.f39780q;
        if (f15 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeFloat(f15.floatValue());
        }
        Float f16 = this.f39781r;
        if (f16 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeFloat(f16.floatValue());
        }
    }

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.pacepro.data.dto.b$b, reason: collision with other inner class name and from kotlin metadata */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\n¨\u0006\f"}, d2 = {"Lcom/garmin/android/apps/connectmobile/pacepro/data/dto/b$b;", "", "<init>", "()V", "Li63/c;", "Lcom/garmin/android/apps/connectmobile/pacepro/data/dto/b;", "serializer", "()Li63/c;", "", "MIN_DISTANCE_IN_METERS", "I", "MAX_DISTANCE_IN_METERS", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(j jVar) {
            this();
        }

        public final i63.c<b> serializer() {
            return a.f39782a;
        }

        private Companion() {
        }
    }

    public b(Long l14, String str, Long l15, Long l16, i iVar, t41.a aVar, double d14, Double d15, Double d16, long j8, double d17, String str2, String str3, String str4, boolean z14, Float f14, Float f15, Float f16) {
        str.getClass();
        this.f39764a = l14;
        this.f39765b = str;
        this.f39766c = l15;
        this.f39767d = l16;
        this.f39768e = iVar;
        this.f39769f = aVar;
        this.f39770g = d14;
        this.f39771h = d15;
        this.f39772i = d16;
        this.f39773j = j8;
        this.f39774k = d17;
        this.f39775l = str2;
        this.f39776m = str3;
        this.f39777n = str4;
        this.f39778o = z14;
        this.f39779p = f14;
        this.f39780q = f15;
        this.f39781r = f16;
    }

    public /* synthetic */ b(int i14, Long l14, String str, Long l15, Long l16, i iVar, t41.a aVar, double d14, Double d15, Double d16, long j8, double d17, String str2, String str3, String str4, boolean z14, Float f14, Float f15, Float f16, u1 u1Var) {
        Double dValueOf = Double.valueOf(0.0d);
        if ((i14 & 1) == 0) {
            this.f39764a = null;
        } else {
            this.f39764a = l14;
        }
        if ((i14 & 2) == 0) {
            this.f39765b = "";
        } else {
            this.f39765b = str;
        }
        if ((i14 & 4) == 0) {
            this.f39766c = null;
        } else {
            this.f39766c = l15;
        }
        if ((i14 & 8) == 0) {
            this.f39767d = null;
        } else {
            this.f39767d = l16;
        }
        if ((i14 & 16) == 0) {
            this.f39768e = null;
        } else {
            this.f39768e = iVar;
        }
        if ((i14 & 32) == 0) {
            this.f39769f = null;
        } else {
            this.f39769f = aVar;
        }
        if ((i14 & 64) == 0) {
            this.f39770g = 0.0d;
        } else {
            this.f39770g = d14;
        }
        if ((i14 & 128) == 0) {
            this.f39771h = dValueOf;
        } else {
            this.f39771h = d15;
        }
        if ((i14 & 256) == 0) {
            this.f39772i = dValueOf;
        } else {
            this.f39772i = d16;
        }
        this.f39773j = (i14 & 512) == 0 ? 0L : j8;
        if ((i14 & 1024) == 0) {
            this.f39774k = 0.0d;
        } else {
            this.f39774k = d17;
        }
        if ((i14 & 2048) == 0) {
            this.f39775l = null;
        } else {
            this.f39775l = str2;
        }
        if ((i14 & 4096) == 0) {
            this.f39776m = null;
        } else {
            this.f39776m = str3;
        }
        if ((i14 & 8192) == 0) {
            this.f39777n = null;
        } else {
            this.f39777n = str4;
        }
        this.f39778o = (i14 & 16384) == 0 ? false : z14;
        this.f39779p = (32768 & i14) == 0 ? Float.valueOf(50.0f) : f14;
        this.f39780q = (65536 & i14) == 0 ? Float.valueOf(1700.0f) : f15;
        this.f39781r = (i14 & 131072) == 0 ? Float.valueOf(2.0f) : f16;
    }

    public b() {
        this((Long) null, (String) null, (Long) null, (Long) null, (i) null, (t41.a) null, 0.0d, (Double) null, (Double) null, 0L, 0.0d, (String) null, (String) null, (String) null, false, (Float) null, (Float) null, (Float) null, 262143, (j) null);
    }
}

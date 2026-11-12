package a02;

import bb2.k;
import bb2.o;
import cf.b0;
import cf.f0;
import cf.t;
import com.garmin.android.apps.connectmobile.workouts.presentation.details.MultiSportsDetailsActivity;
import com.garmin.android.apps.connectmobile.workouts.presentation.details.WorkoutDetailsActivity;
import com.google.android.exoplayer2.offline.DownloadService;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import df.m;
import e23.l;
import java.util.ArrayList;
import o13.p;
import o4.d0;
import o4.g1;
import o4.w;
import p005kotlin.Unit;
import p13.x;
import q4.j;
import ue.h0;
import ue.v;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class a implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f56a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f57b;

    public /* synthetic */ a(long j8, int i14) {
        this.f56a = i14;
        this.f57b = j8;
    }

    private final Object a(Object obj) {
        q4.f fVar = (q4.f) obj;
        fVar.getClass();
        float f14 = 2;
        g6.f.a aVar = g6.f.f75994b;
        float fS0 = fVar.s0(f14);
        float fS1 = fVar.s0(4);
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (fVar.b() & 4294967295L)) / f14)) & 4294967295L) | (((long) Float.floatToRawIntBits(0.0f)) << 32);
        n4.c.a aVar2 = n4.c.f123541b;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (fVar.b() >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (fVar.b() & 4294967295L)) / f14;
        long jFloatToRawIntBits2 = Float.floatToRawIntBits(fIntBitsToFloat);
        q4.f.G1(fVar, this.f57b, jFloatToRawIntBits, (4294967295L & ((long) Float.floatToRawIntBits(fIntBitsToFloat2))) | (jFloatToRawIntBits2 << 32), fVar.s0(f14), 0, g1.a.b(g1.f128855a, new float[]{fS0, fS1}), 0, 464);
        return Unit.INSTANCE;
    }

    @Override // e23.l
    public final Object invoke(Object obj) throws Exception {
        bb2.l lVar;
        Boolean boolValueOf;
        int i14 = this.f56a;
        long j8 = this.f57b;
        switch (i14) {
            case 0:
                q4.f fVar = (q4.f) obj;
                fVar.getClass();
                long jB = n4.g.b(fVar.b());
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (jB >> 32)))) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (jB & 4294967295L)))) & 4294967295L);
                n4.c.a aVar = n4.c.f123541b;
                q4.f.o0(fVar, this.f57b, 0.0f, jFloatToRawIntBits, null, 0, 122);
                return Unit.INSTANCE;
            case 1:
                ud.a aVar2 = (ud.a) obj;
                bb2.c.C0243c c0243c = bb2.c.f17328d;
                aVar2.getClass();
                ud.c cVarM0 = aVar2.M0("DELETE FROM activity_polyline WHERE activityId = ?");
                try {
                    cVarM0.h(1, j8);
                    cVarM0.J0();
                    return Unit.INSTANCE;
                } finally {
                    cVarM0.close();
                }
            case 2:
                ud.a aVar3 = (ud.a) obj;
                k.b bVar = k.f17367c;
                aVar3.getClass();
                ud.c cVarM1 = aVar3.M0("DELETE FROM device_needs_bond WHERE DEVICE_UNIT_ID = ?");
                try {
                    cVarM1.h(1, j8);
                    cVarM1.J0();
                    return Unit.INSTANCE;
                } finally {
                    cVarM1.close();
                }
            case 3:
                ud.a aVar4 = (ud.a) obj;
                k.b bVar2 = k.f17367c;
                aVar4.getClass();
                ud.c cVarM2 = aVar4.M0("UPDATE device_needs_bond SET DEVICE_DIALOG_SHOWN = 1 WHERE DEVICE_UNIT_ID = ?");
                try {
                    cVarM2.h(1, j8);
                    cVarM2.J0();
                    return Unit.INSTANCE;
                } finally {
                    cVarM2.close();
                }
            case 4:
                ud.a aVar5 = (ud.a) obj;
                o.c cVar = o.f17378d;
                aVar5.getClass();
                ud.c cVarM3 = aVar5.M0("SELECT * FROM device_work_input WHERE inputTimestamp = ?");
                try {
                    cVarM3.h(1, j8);
                    int iB = ge1.b.B(cVarM3, "inputTimestamp");
                    int iB2 = ge1.b.B(cVarM3, "inputAction");
                    int iB3 = ge1.b.B(cVarM3, "unitId");
                    int iB4 = ge1.b.B(cVarM3, "remoteDeviceProfile");
                    int iB5 = ge1.b.B(cVarM3, "deviceXML");
                    if (cVarM3.J0()) {
                        lVar = new bb2.l(cVarM3.getLong(iB), cVarM3.M1(iB2), cVarM3.getLong(iB3), cVarM3.M1(iB4), cVarM3.isNull(iB5) ? null : cVarM3.getBlob(iB5));
                    } else {
                        lVar = null;
                    }
                    return lVar;
                } finally {
                    cVarM3.close();
                }
            case 5:
                ud.a aVar6 = (ud.a) obj;
                com.garmin.android.apps.connectmobile.onboarding.data.local.a.b bVar3 = com.garmin.android.apps.connectmobile.onboarding.data.local.a.f39662d;
                aVar6.getClass();
                ud.c cVarM4 = aVar6.M0("DELETE FROM device_onboarding_items WHERE deviceId = ?");
                try {
                    cVarM4.h(1, j8);
                    cVarM4.J0();
                    return Unit.INSTANCE;
                } finally {
                    cVarM4.close();
                }
            case 6:
                MultiSportsDetailsActivity.a aVar7 = MultiSportsDetailsActivity.f48440z;
                return new p(Long.valueOf(j8), null);
            case 7:
                WorkoutDetailsActivity.a aVar8 = WorkoutDetailsActivity.f48482f;
                return new p(Long.valueOf(j8), null);
            case 8:
                WorkoutDetailsActivity.a aVar9 = WorkoutDetailsActivity.f48482f;
                return new p(Long.valueOf(j8), null);
            case 9:
                ud.a aVar10 = (ud.a) obj;
                b0.c cVar2 = b0.f26898d;
                aVar10.getClass();
                ud.c cVarM5 = aVar10.M0("SELECT * FROM workspec WHERE last_enqueue_time >= ? AND state IN (2, 3, 5) ORDER BY last_enqueue_time DESC");
                try {
                    cVarM5.h(1, j8);
                    int iB6 = ge1.b.B(cVarM5, TtmlNode.ATTR_ID);
                    int iB7 = ge1.b.B(cVarM5, RemoteConfigConstants.ResponseFieldKey.STATE);
                    int iB8 = ge1.b.B(cVarM5, "worker_class_name");
                    int iB9 = ge1.b.B(cVarM5, "input_merger_class_name");
                    int iB10 = ge1.b.B(cVarM5, "input");
                    int iB11 = ge1.b.B(cVarM5, "output");
                    int iB12 = ge1.b.B(cVarM5, "initial_delay");
                    int iB13 = ge1.b.B(cVarM5, "interval_duration");
                    int iB14 = ge1.b.B(cVarM5, "flex_duration");
                    int iB15 = ge1.b.B(cVarM5, "run_attempt_count");
                    int iB16 = ge1.b.B(cVarM5, "backoff_policy");
                    int iB17 = ge1.b.B(cVarM5, "backoff_delay_duration");
                    int iB18 = ge1.b.B(cVarM5, "last_enqueue_time");
                    int iB19 = ge1.b.B(cVarM5, "minimum_retention_duration");
                    int iB20 = ge1.b.B(cVarM5, "schedule_requested_at");
                    int iB21 = ge1.b.B(cVarM5, "run_in_foreground");
                    int iB22 = ge1.b.B(cVarM5, "out_of_quota_policy");
                    int iB23 = ge1.b.B(cVarM5, "period_count");
                    int iB24 = ge1.b.B(cVarM5, "generation");
                    int iB25 = ge1.b.B(cVarM5, "next_schedule_time_override");
                    int iB26 = ge1.b.B(cVarM5, "next_schedule_time_override_generation");
                    int iB27 = ge1.b.B(cVarM5, DownloadService.KEY_STOP_REASON);
                    int iB28 = ge1.b.B(cVarM5, "trace_tag");
                    int iB29 = ge1.b.B(cVarM5, "backoff_on_system_interruptions");
                    int iB30 = ge1.b.B(cVarM5, "required_network_type");
                    int iB31 = ge1.b.B(cVarM5, "required_network_request");
                    int iB32 = ge1.b.B(cVarM5, "requires_charging");
                    int iB33 = ge1.b.B(cVarM5, "requires_device_idle");
                    int iB34 = ge1.b.B(cVarM5, "requires_battery_not_low");
                    int iB35 = ge1.b.B(cVarM5, "requires_storage_not_low");
                    int iB36 = ge1.b.B(cVarM5, "trigger_content_update_delay");
                    int iB37 = ge1.b.B(cVarM5, "trigger_max_content_delay");
                    int iB38 = ge1.b.B(cVarM5, "content_uri_triggers");
                    ArrayList arrayList = new ArrayList();
                    while (cVarM5.J0()) {
                        String strM1 = cVarM5.M1(iB6);
                        int i15 = iB6;
                        ArrayList arrayList2 = arrayList;
                        h0.c cVarF = f0.f((int) cVarM5.getLong(iB7));
                        String strM2 = cVarM5.M1(iB8);
                        String strM3 = cVarM5.M1(iB9);
                        byte[] blob = cVarM5.getBlob(iB10);
                        androidx.work.c.f11464b.getClass();
                        androidx.work.c cVarA = androidx.work.c.b.a(blob);
                        androidx.work.c cVarA2 = androidx.work.c.b.a(cVarM5.getBlob(iB11));
                        long j14 = cVarM5.getLong(iB12);
                        long j15 = cVarM5.getLong(iB13);
                        long j16 = cVarM5.getLong(iB14);
                        int i16 = (int) cVarM5.getLong(iB15);
                        ue.a aVarC = f0.c((int) cVarM5.getLong(iB16));
                        long j17 = cVarM5.getLong(iB17);
                        long j18 = cVarM5.getLong(iB18);
                        long j19 = cVarM5.getLong(iB19);
                        int i17 = iB20;
                        long j24 = cVarM5.getLong(i17);
                        int i18 = iB7;
                        int i19 = iB21;
                        int i24 = iB8;
                        boolean z14 = ((int) cVarM5.getLong(i19)) != 0;
                        int i25 = iB22;
                        ue.b0 b0VarE = f0.e((int) cVarM5.getLong(i25));
                        int i26 = iB23;
                        int i27 = (int) cVarM5.getLong(i26);
                        int i28 = iB24;
                        int i29 = (int) cVarM5.getLong(i28);
                        int i30 = iB25;
                        long j25 = cVarM5.getLong(i30);
                        int i34 = iB26;
                        int i35 = (int) cVarM5.getLong(i34);
                        int i36 = iB27;
                        int i37 = (int) cVarM5.getLong(i36);
                        int i38 = iB28;
                        String strM4 = cVarM5.isNull(i38) ? null : cVarM5.M1(i38);
                        int i39 = iB29;
                        Integer numValueOf = cVarM5.isNull(i39) ? null : Integer.valueOf((int) cVarM5.getLong(i39));
                        if (numValueOf != null) {
                            boolValueOf = Boolean.valueOf(numValueOf.intValue() != 0);
                        } else {
                            boolValueOf = null;
                        }
                        iB29 = i39;
                        int i44 = iB30;
                        v vVarD = f0.d((int) cVarM5.getLong(i44));
                        int i45 = iB31;
                        m mVarJ = f0.j(cVarM5.getBlob(i45));
                        iB30 = i44;
                        int i46 = iB32;
                        boolean z15 = ((int) cVarM5.getLong(i46)) != 0;
                        iB32 = i46;
                        int i47 = iB33;
                        boolean z16 = ((int) cVarM5.getLong(i47)) != 0;
                        iB33 = i47;
                        int i48 = iB34;
                        boolean z17 = ((int) cVarM5.getLong(i48)) != 0;
                        iB34 = i48;
                        int i49 = iB35;
                        int i54 = iB36;
                        int i55 = iB37;
                        iB36 = i54;
                        int i56 = iB38;
                        t tVar = new t(strM1, cVarF, strM2, strM3, cVarA, cVarA2, j14, j15, j16, new ue.f(mVarJ, vVarD, z15, z16, z17, ((int) cVarM5.getLong(i49)) != 0, cVarM5.getLong(i54), cVarM5.getLong(i55), f0.a(cVarM5.getBlob(i56))), i16, aVarC, j17, j18, j19, j24, z14, b0VarE, i27, i29, j25, i35, i37, strM4, boolValueOf);
                        iB38 = i56;
                        iB37 = i55;
                        arrayList = arrayList2;
                        arrayList.add(tVar);
                        iB35 = i49;
                        iB6 = i15;
                        iB7 = i18;
                        iB20 = i17;
                        iB23 = i26;
                        iB24 = i28;
                        iB25 = i30;
                        iB26 = i34;
                        iB27 = i36;
                        iB28 = i38;
                        iB31 = i45;
                        iB8 = i24;
                        iB21 = i19;
                        iB22 = i25;
                        break;
                    }
                    return arrayList;
                } finally {
                    cVarM5.close();
                }
            case 10:
                q4.f fVar2 = (q4.f) obj;
                fVar2.getClass();
                q4.f.o0(fVar2, this.f57b, 0.0f, 0L, j.f142560a, 0, 110);
                return Unit.INSTANCE;
            case 11:
                q4.f fVar3 = (q4.f) obj;
                fVar3.getClass();
                q4.f.o0(fVar3, this.f57b, 0.0f, 0L, j.f142560a, 0, 110);
                return Unit.INSTANCE;
            case 12:
                l4.f fVar4 = (l4.f) obj;
                fVar4.getClass();
                float fIntBitsToFloat = Float.intBitsToFloat((int) (fVar4.f109845a.b() & 4294967295L)) * 0.85f;
                w.a aVar11 = w.f129023a;
                d0.f128823b.getClass();
                return fVar4.e(new ck0.g(w.a.i(aVar11, x.k(d0.a(d0.f128831j), d0.a(j8)), fIntBitsToFloat, 12), 0));
            case 13:
                q4.f fVar5 = (q4.f) obj;
                fVar5.getClass();
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (fVar5.b() >> 32));
                float fIntBitsToFloat3 = Float.intBitsToFloat((int) (fVar5.b() & 4294967295L));
                g6.f.a aVar12 = g6.f.f75994b;
                float fS0 = fVar5.s0((float) 2.5d);
                float fS1 = fVar5.s0(6);
                float fS2 = fVar5.s0(3);
                float f14 = 2;
                float f15 = fIntBitsToFloat2 / f14;
                long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(f15)) << 32) | (((long) Float.floatToRawIntBits(fS0 + fS1)) & 4294967295L);
                n4.c.a aVar13 = n4.c.f123541b;
                long j26 = this.f57b;
                q4.f.o0(fVar5, j26, fS0, jFloatToRawIntBits2, null, 0, 120);
                q4.f.G1(fVar5, j26, (((long) Float.floatToRawIntBits(f15)) << 32) | (((long) Float.floatToRawIntBits((fS0 * f14) + fS1 + fS2)) & 4294967295L), (((long) Float.floatToRawIntBits(f15)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat3)) & 4294967295L), 0.0f, 0, null, 0, 504);
                return Unit.INSTANCE;
            case 14:
                ud.a aVar14 = (ud.a) obj;
                com.garmin.android.library.promotionlibrary.database.a.c cVar3 = com.garmin.android.library.promotionlibrary.database.a.f50541c;
                aVar14.getClass();
                ud.c cVarM6 = aVar14.M0("SELECT * from campaigns WHERE ? BETWEEN campaignBeginTimestamp AND campaignEndTimestamp ORDER BY campaignEndTimestamp ASC");
                try {
                    cVarM6.h(1, j8);
                    int iB39 = ge1.b.B(cVarM6, "campaignId");
                    int iB40 = ge1.b.B(cVarM6, "offerType");
                    int iB41 = ge1.b.B(cVarM6, "campaignBeginTimestamp");
                    int iB42 = ge1.b.B(cVarM6, "campaignEndTimestamp");
                    int iB43 = ge1.b.B(cVarM6, "updateTimestamp");
                    int iB44 = ge1.b.B(cVarM6, "offerBodyText");
                    int iB45 = ge1.b.B(cVarM6, "offerHeaderText");
                    int iB46 = ge1.b.B(cVarM6, "offerImageUrl");
                    int iB47 = ge1.b.B(cVarM6, "offerImageName");
                    int iB48 = ge1.b.B(cVarM6, "offerShopNowButtonText");
                    int iB49 = ge1.b.B(cVarM6, "offerTitleText");
                    int iB50 = ge1.b.B(cVarM6, "offerViewDetailsButtonText");
                    int iB51 = ge1.b.B(cVarM6, "detailEmailOfferButtonText");
                    int iB52 = ge1.b.B(cVarM6, "detailImageUrl");
                    int iB53 = ge1.b.B(cVarM6, "detailImageName");
                    int iB54 = ge1.b.B(cVarM6, "detailPromoCode");
                    int iB55 = ge1.b.B(cVarM6, "detailPromoCodeDetailText");
                    int iB56 = ge1.b.B(cVarM6, "detailPromoCodeExpirationDate");
                    int iB57 = ge1.b.B(cVarM6, "detailShopNowUrl");
                    int iB58 = ge1.b.B(cVarM6, "detailTitleText");
                    int iB59 = ge1.b.B(cVarM6, "detailBodyText");
                    int iB60 = ge1.b.B(cVarM6, "detailBodyDetailText");
                    ArrayList arrayList3 = new ArrayList();
                    while (cVarM6.J0()) {
                        long j27 = cVarM6.getLong(iB39);
                        String strM5 = cVarM6.M1(iB40);
                        long j28 = cVarM6.getLong(iB41);
                        long j29 = cVarM6.getLong(iB42);
                        long j34 = cVarM6.getLong(iB43);
                        String strM6 = cVarM6.M1(iB44);
                        String strM7 = cVarM6.M1(iB45);
                        String strM8 = cVarM6.M1(iB46);
                        String strM9 = cVarM6.M1(iB47);
                        String strM10 = cVarM6.M1(iB48);
                        String strM11 = cVarM6.M1(iB49);
                        String strM12 = cVarM6.M1(iB50);
                        String strM13 = cVarM6.M1(iB51);
                        String strM14 = cVarM6.M1(iB52);
                        int i57 = iB39;
                        int i58 = iB53;
                        String strM15 = cVarM6.M1(i58);
                        iB53 = i58;
                        int i59 = iB54;
                        String strM16 = cVarM6.M1(i59);
                        iB54 = i59;
                        int i64 = iB55;
                        String strM17 = cVarM6.M1(i64);
                        iB55 = i64;
                        int i65 = iB56;
                        long j35 = cVarM6.getLong(i65);
                        iB56 = i65;
                        int i66 = iB57;
                        String strM18 = cVarM6.M1(i66);
                        iB57 = i66;
                        int i67 = iB58;
                        String strM19 = cVarM6.M1(i67);
                        iB58 = i67;
                        int i68 = iB59;
                        String strM20 = cVarM6.M1(i68);
                        iB59 = i68;
                        int i69 = iB60;
                        iB60 = i69;
                        arrayList3.add(new df2.c(j27, strM5, j28, j29, j34, strM6, strM7, strM8, strM9, strM10, strM11, strM12, strM13, strM14, strM15, strM16, strM17, j35, strM18, strM19, strM20, cVarM6.M1(i69)));
                        iB39 = i57;
                    }
                    cVarM6.close();
                    return arrayList3;
                } catch (Throwable th3) {
                    cVarM6.close();
                    throw th3;
                }
            case 15:
                ud.a aVar15 = (ud.a) obj;
                com.garmin.android.library.promotionlibrary.database.a.c cVar4 = com.garmin.android.library.promotionlibrary.database.a.f50541c;
                aVar15.getClass();
                ud.c cVarM7 = aVar15.M0("DELETE from campaigns where campaignId = ?");
                try {
                    cVarM7.h(1, j8);
                    cVarM7.J0();
                    return Unit.INSTANCE;
                } finally {
                    cVarM7.close();
                }
            case 16:
                l4.f fVar6 = (l4.f) obj;
                fVar6.getClass();
                float fIntBitsToFloat4 = Float.intBitsToFloat((int) (fVar6.f109845a.b() & 4294967295L)) * 0.75f;
                w.a aVar16 = w.f129023a;
                d0.f128823b.getClass();
                return fVar6.e(new ck0.g(w.a.i(aVar16, x.k(d0.a(d0.f128831j), d0.a(j8)), fIntBitsToFloat4, 12), 2));
            case 17:
                ud.a aVar17 = (ud.a) obj;
                es2.f.b bVar4 = es2.f.f65227d;
                aVar17.getClass();
                ud.c cVarM8 = aVar17.M0("delete from wallet_items where unit_id = ?");
                try {
                    cVarM8.h(1, j8);
                    cVarM8.J0();
                    return Unit.INSTANCE;
                } finally {
                    cVarM8.close();
                }
            case 18:
                ud.a aVar18 = (ud.a) obj;
                fu0.f.b bVar5 = fu0.f.f73502c;
                aVar18.getClass();
                ud.c cVarM9 = aVar18.M0("DELETE FROM transitions_counter WHERE device_id = ?");
                try {
                    cVarM9.h(1, j8);
                    cVarM9.J0();
                    return Unit.INSTANCE;
                } finally {
                    cVarM9.close();
                }
            case 19:
                ud.a aVar19 = (ud.a) obj;
                fu0.f.b bVar6 = fu0.f.f73502c;
                aVar19.getClass();
                ud.c cVarM10 = aVar19.M0("SELECT * FROM transitions_counter WHERE device_id = ? LIMIT 1");
                try {
                    cVarM10.h(1, j8);
                    int iB61 = ge1.b.B(cVarM10, "device_id");
                    int iB62 = ge1.b.B(cVarM10, "counter");
                    if (!cVarM10.J0()) {
                        throw new IllegalStateException("The query result was empty, but expected a single row to return a NON-NULL object of type 'com.garmin.android.apps.connectmobile.liveeventsharing.database.entities.TransitionCounterRecord'.");
                    }
                    gu0.c cVar5 = new gu0.c(cVarM10.getLong(iB61), (int) cVarM10.getLong(iB62));
                    cVarM10.close();
                    return cVar5;
                } catch (Throwable th4) {
                    cVarM10.close();
                    throw th4;
                }
            case 20:
                q4.f fVar7 = (q4.f) obj;
                fVar7.getClass();
                q4.f.A0(fVar7, this.f57b, 0L, 0L, 0.0f, null, null, 126);
                return Unit.INSTANCE;
            case 21:
                l4.f fVar8 = (l4.f) obj;
                fVar8.getClass();
                float fIntBitsToFloat5 = Float.intBitsToFloat((int) (fVar8.f109845a.b() & 4294967295L)) * 0.75f;
                w.a aVar20 = w.f129023a;
                d0.f128823b.getClass();
                return fVar8.e(new ck0.g(w.a.i(aVar20, x.k(d0.a(d0.f128831j), d0.a(j8)), fIntBitsToFloat5, 12), 3));
            case 22:
                ud.a aVar21 = (ud.a) obj;
                com.garmin.android.apps.connectmobile.webtranslation.b.c cVar6 = com.garmin.android.apps.connectmobile.webtranslation.b.f47973e;
                aVar21.getClass();
                ud.c cVarM11 = aVar21.M0("SELECT * FROM translation WHERE record_id = ?");
                try {
                    cVarM11.h(1, j8);
                    int iB63 = ge1.b.B(cVarM11, "record_id");
                    int iB64 = ge1.b.B(cVarM11, "handle");
                    int iB65 = ge1.b.B(cVarM11, "text");
                    int iB66 = ge1.b.B(cVarM11, "hash");
                    ArrayList arrayList4 = new ArrayList();
                    while (cVarM11.J0()) {
                        arrayList4.add(new i42.e(cVarM11.getLong(iB63), cVarM11.M1(iB64), cVarM11.M1(iB65), cVarM11.M1(iB66)));
                    }
                    cVarM11.close();
                    return arrayList4;
                } catch (Throwable th5) {
                    cVarM11.close();
                    throw th5;
                }
            case 23:
                ud.a aVar22 = (ud.a) obj;
                com.garmin.android.apps.connectmobile.activities.stats.exercises.database.a.b bVar7 = com.garmin.android.apps.connectmobile.activities.stats.exercises.database.a.f29923c;
                aVar22.getClass();
                ud.c cVarM12 = aVar22.M0("DELETE from recent_selected_exercises where selectTimestamp <=?");
                try {
                    cVarM12.h(1, j8);
                    cVarM12.J0();
                    return Unit.INSTANCE;
                } finally {
                    cVarM12.close();
                }
            case 24:
                q4.f fVar9 = (q4.f) obj;
                fVar9.getClass();
                float f16 = 2;
                long jFloatToRawIntBits3 = (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (fVar9.b() & 4294967295L)) / f16)) & 4294967295L);
                n4.c.a aVar23 = n4.c.f123541b;
                long jFloatToRawIntBits4 = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (fVar9.b() >> 32)))) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (fVar9.b() & 4294967295L)) / f16)) & 4294967295L);
                g6.f.a aVar24 = g6.f.f75994b;
                q4.f.G1(fVar9, this.f57b, jFloatToRawIntBits3, jFloatToRawIntBits4, fVar9.s0(f16), 0, null, 0, 496);
                return Unit.INSTANCE;
            case 25:
                q4.f fVar10 = (q4.f) obj;
                fVar10.getClass();
                g6.f.a aVar25 = g6.f.f75994b;
                float fS3 = fVar10.s0(4);
                float f17 = 2;
                float fS4 = fVar10.s0(f17);
                long jFloatToRawIntBits5 = (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (fVar10.b() & 4294967295L)) / f17)) & 4294967295L);
                n4.c.a aVar26 = n4.c.f123541b;
                float fIntBitsToFloat6 = Float.intBitsToFloat((int) (fVar10.b() >> 32));
                q4.f.G1(fVar10, this.f57b, jFloatToRawIntBits5, (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (fVar10.b() & 4294967295L)) / f17)) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat6) << 32), fVar10.s0(f17), 0, g1.a.b(g1.f128855a, new float[]{fS3, fS4}), 0, 464);
                return Unit.INSTANCE;
            case 26:
                q4.f fVar11 = (q4.f) obj;
                fVar11.getClass();
                g6.f.a aVar27 = g6.f.f75994b;
                float fS5 = fVar11.s0(4);
                float f18 = 2;
                float fS6 = fVar11.s0(f18);
                long jFloatToRawIntBits6 = (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (fVar11.b() & 4294967295L)) / f18)) & 4294967295L);
                n4.c.a aVar28 = n4.c.f123541b;
                q4.f.G1(fVar11, this.f57b, jFloatToRawIntBits6, (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (fVar11.b() >> 32)))) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (fVar11.b() & 4294967295L)) / f18)) & 4294967295L), fVar11.s0(f18), 0, g1.a.b(g1.f128855a, new float[]{fS5, fS6}), 0, 464);
                return Unit.INSTANCE;
            case 27:
                q4.f fVar12 = (q4.f) obj;
                fVar12.getClass();
                float f19 = 2;
                long jFloatToRawIntBits7 = (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (fVar12.b() & 4294967295L)) / f19)) & 4294967295L);
                n4.c.a aVar29 = n4.c.f123541b;
                long jFloatToRawIntBits8 = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (fVar12.b() >> 32)))) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (fVar12.b() & 4294967295L)) / f19)) & 4294967295L);
                g6.f.a aVar30 = g6.f.f75994b;
                q4.f.G1(fVar12, this.f57b, jFloatToRawIntBits7, jFloatToRawIntBits8, fVar12.s0(f19), 0, null, 0, 496);
                return Unit.INSTANCE;
            case 28:
                return a(obj);
            default:
                q4.f fVar13 = (q4.f) obj;
                fVar13.getClass();
                float f22 = 2;
                long jFloatToRawIntBits9 = (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (fVar13.b() & 4294967295L)) / f22)) & 4294967295L);
                n4.c.a aVar31 = n4.c.f123541b;
                float fIntBitsToFloat7 = Float.intBitsToFloat((int) (fVar13.b() >> 32));
                float fIntBitsToFloat8 = Float.intBitsToFloat((int) (fVar13.b() & 4294967295L)) / f22;
                long jFloatToRawIntBits10 = Float.floatToRawIntBits(fIntBitsToFloat7);
                long jFloatToRawIntBits11 = Float.floatToRawIntBits(fIntBitsToFloat8);
                g6.f.a aVar32 = g6.f.f75994b;
                q4.f.G1(fVar13, this.f57b, jFloatToRawIntBits9, (jFloatToRawIntBits10 << 32) | (jFloatToRawIntBits11 & 4294967295L), fVar13.s0(f22), 0, null, 0, 496);
                return Unit.INSTANCE;
        }
    }
}

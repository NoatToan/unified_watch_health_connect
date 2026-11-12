package cf;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.widget.NestedScrollView;
import com.google.android.exoplayer2.offline.DownloadService;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import f2.n0;
import java.util.ArrayList;
import p005kotlin.Unit;
import p5.k0;
import ue.h0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class a0 implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26896a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f26897b;

    public /* synthetic */ a0(int i14, int i15) {
        this.f26896a = i15;
        this.f26897b = i14;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x009f  */
    @Override // e23.l
    public final Object invoke(Object obj) {
        Boolean boolValueOf;
        int i14 = this.f26896a;
        int i15 = this.f26897b;
        switch (i14) {
            case 0:
                ud.a aVar = (ud.a) obj;
                b0.c cVar = b0.f26898d;
                aVar.getClass();
                ud.c cVarM0 = aVar.M0("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY last_enqueue_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND LENGTH(content_uri_triggers)=0 AND state NOT IN (2, 3, 5))");
                try {
                    cVarM0.h(1, i15);
                    int iB = ge1.b.B(cVarM0, TtmlNode.ATTR_ID);
                    int iB2 = ge1.b.B(cVarM0, RemoteConfigConstants.ResponseFieldKey.STATE);
                    int iB3 = ge1.b.B(cVarM0, "worker_class_name");
                    int iB4 = ge1.b.B(cVarM0, "input_merger_class_name");
                    int iB5 = ge1.b.B(cVarM0, "input");
                    int iB6 = ge1.b.B(cVarM0, "output");
                    int iB7 = ge1.b.B(cVarM0, "initial_delay");
                    int iB8 = ge1.b.B(cVarM0, "interval_duration");
                    int iB9 = ge1.b.B(cVarM0, "flex_duration");
                    int iB10 = ge1.b.B(cVarM0, "run_attempt_count");
                    int iB11 = ge1.b.B(cVarM0, "backoff_policy");
                    int iB12 = ge1.b.B(cVarM0, "backoff_delay_duration");
                    int iB13 = ge1.b.B(cVarM0, "last_enqueue_time");
                    int iB14 = ge1.b.B(cVarM0, "minimum_retention_duration");
                    int iB15 = ge1.b.B(cVarM0, "schedule_requested_at");
                    int iB16 = ge1.b.B(cVarM0, "run_in_foreground");
                    int iB17 = ge1.b.B(cVarM0, "out_of_quota_policy");
                    int iB18 = ge1.b.B(cVarM0, "period_count");
                    int iB19 = ge1.b.B(cVarM0, "generation");
                    int iB20 = ge1.b.B(cVarM0, "next_schedule_time_override");
                    int iB21 = ge1.b.B(cVarM0, "next_schedule_time_override_generation");
                    int iB22 = ge1.b.B(cVarM0, DownloadService.KEY_STOP_REASON);
                    int iB23 = ge1.b.B(cVarM0, "trace_tag");
                    int iB24 = ge1.b.B(cVarM0, "backoff_on_system_interruptions");
                    int iB25 = ge1.b.B(cVarM0, "required_network_type");
                    int iB26 = ge1.b.B(cVarM0, "required_network_request");
                    int iB27 = ge1.b.B(cVarM0, "requires_charging");
                    int iB28 = ge1.b.B(cVarM0, "requires_device_idle");
                    int iB29 = ge1.b.B(cVarM0, "requires_battery_not_low");
                    int iB30 = ge1.b.B(cVarM0, "requires_storage_not_low");
                    int iB31 = ge1.b.B(cVarM0, "trigger_content_update_delay");
                    int iB32 = ge1.b.B(cVarM0, "trigger_max_content_delay");
                    int iB33 = ge1.b.B(cVarM0, "content_uri_triggers");
                    ArrayList arrayList = new ArrayList();
                    while (cVarM0.J0()) {
                        String strM1 = cVarM0.M1(iB);
                        int i16 = iB;
                        ArrayList arrayList2 = arrayList;
                        h0.c cVarF = f0.f((int) cVarM0.getLong(iB2));
                        String strM2 = cVarM0.M1(iB3);
                        String strM3 = cVarM0.M1(iB4);
                        byte[] blob = cVarM0.getBlob(iB5);
                        androidx.work.c.f11464b.getClass();
                        androidx.work.c cVarA = androidx.work.c.b.a(blob);
                        androidx.work.c cVarA2 = androidx.work.c.b.a(cVarM0.getBlob(iB6));
                        long j8 = cVarM0.getLong(iB7);
                        long j14 = cVarM0.getLong(iB8);
                        long j15 = cVarM0.getLong(iB9);
                        int i17 = (int) cVarM0.getLong(iB10);
                        ue.a aVarC = f0.c((int) cVarM0.getLong(iB11));
                        long j16 = cVarM0.getLong(iB12);
                        long j17 = cVarM0.getLong(iB13);
                        long j18 = cVarM0.getLong(iB14);
                        int i18 = iB15;
                        long j19 = cVarM0.getLong(i18);
                        int i19 = iB12;
                        int i24 = iB16;
                        int i25 = iB13;
                        boolean z14 = ((int) cVarM0.getLong(i24)) != 0;
                        int i26 = iB17;
                        ue.b0 b0VarE = f0.e((int) cVarM0.getLong(i26));
                        int i27 = iB18;
                        int i28 = (int) cVarM0.getLong(i27);
                        int i29 = iB19;
                        int i30 = (int) cVarM0.getLong(i29);
                        int i34 = iB20;
                        long j24 = cVarM0.getLong(i34);
                        int i35 = iB21;
                        int i36 = (int) cVarM0.getLong(i35);
                        int i37 = iB22;
                        int i38 = (int) cVarM0.getLong(i37);
                        int i39 = iB23;
                        String strM4 = cVarM0.isNull(i39) ? null : cVarM0.M1(i39);
                        int i44 = iB24;
                        Integer numValueOf = cVarM0.isNull(i44) ? null : Integer.valueOf((int) cVarM0.getLong(i44));
                        Boolean boolValueOf2 = numValueOf != null ? Boolean.valueOf(numValueOf.intValue() != 0) : null;
                        int i45 = iB25;
                        ue.v vVarD = f0.d((int) cVarM0.getLong(i45));
                        int i46 = iB26;
                        df.m mVarJ = f0.j(cVarM0.getBlob(i46));
                        int i47 = iB27;
                        boolean z15 = ((int) cVarM0.getLong(i47)) != 0;
                        int i48 = iB28;
                        boolean z16 = ((int) cVarM0.getLong(i48)) != 0;
                        int i49 = iB29;
                        boolean z17 = ((int) cVarM0.getLong(i49)) != 0;
                        int i54 = iB30;
                        int i55 = iB31;
                        int i56 = iB32;
                        iB31 = i55;
                        int i57 = iB33;
                        t tVar = new t(strM1, cVarF, strM2, strM3, cVarA, cVarA2, j8, j14, j15, new ue.f(mVarJ, vVarD, z15, z16, z17, ((int) cVarM0.getLong(i54)) != 0, cVarM0.getLong(i55), cVarM0.getLong(i56), f0.a(cVarM0.getBlob(i57))), i17, aVarC, j16, j17, j18, j19, z14, b0VarE, i28, i30, j24, i36, i38, strM4, boolValueOf2);
                        iB33 = i57;
                        iB32 = i56;
                        arrayList = arrayList2;
                        arrayList.add(tVar);
                        iB12 = i19;
                        iB15 = i18;
                        iB25 = i45;
                        iB27 = i47;
                        iB29 = i49;
                        iB30 = i54;
                        iB28 = i48;
                        iB13 = i25;
                        iB16 = i24;
                        iB17 = i26;
                        iB18 = i27;
                        iB19 = i29;
                        iB20 = i34;
                        iB21 = i35;
                        iB22 = i37;
                        iB23 = i39;
                        iB24 = i44;
                        iB26 = i46;
                        iB = i16;
                        break;
                    }
                    return arrayList;
                } finally {
                    cVarM0.close();
                }
            case 1:
                return Integer.valueOf(((n0.a) obj).f68244a - i15);
            case 2:
                ((Integer) obj).intValue();
                return Integer.valueOf(i15);
            case 3:
                p5.h0.E((k0) obj, i15 + 1.0f);
                return Unit.INSTANCE;
            case 4:
                p5.h0.E((k0) obj, 12 + i15);
                return Unit.INSTANCE;
            case 5:
                ud.a aVar2 = (ud.a) obj;
                kz0.b.C2069b c2069b = kz0.b.f107780b;
                aVar2.getClass();
                ud.c cVarM1 = aVar2.M0("SELECT disconnected FROM edited_connections WHERE profilePk = ?");
                try {
                    cVarM1.h(1, i15);
                    if (cVarM1.J0()) {
                        Integer numValueOf2 = cVarM1.isNull(0) ? null : Integer.valueOf((int) cVarM1.getLong(0));
                        if (numValueOf2 != null) {
                            boolValueOf = Boolean.valueOf(numValueOf2.intValue() != 0);
                        } else {
                            boolValueOf = null;
                        }
                        break;
                    } else {
                        boolValueOf = null;
                    }
                    return boolValueOf;
                } finally {
                    cVarM1.close();
                }
            case 6:
                ((Integer) obj).intValue();
                throw new IndexOutOfBoundsException(ds.e0.i("Collection doesn't contain element at index ", i15, '.'));
            case 7:
                com.garmin.android.library.mapsdkadapter.i iVar = (com.garmin.android.library.mapsdkadapter.i) obj;
                iVar.getClass();
                iVar.setMapType(i15);
                return Unit.INSTANCE;
            case 8:
                com.garmin.android.library.mapsdkadapter.i iVar2 = (com.garmin.android.library.mapsdkadapter.i) obj;
                iVar2.getClass();
                iVar2.setPadding(0, 0, 0, i15);
                return Unit.INSTANCE;
            case 9:
                return vn2.s.z1(i15, (rn2.v) obj);
            default:
                Context context = (Context) obj;
                context.getClass();
                NestedScrollView nestedScrollView = new NestedScrollView(context);
                nestedScrollView.setFillViewport(true);
                FrameLayout frameLayout = new FrameLayout(context);
                frameLayout.setId(i15);
                nestedScrollView.addView(frameLayout, new ViewGroup.LayoutParams(-1, -2));
                return nestedScrollView;
        }
    }
}

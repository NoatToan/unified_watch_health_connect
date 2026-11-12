package c31;

import android.content.Context;
import android.content.Intent;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.handalignment.HandsCalibrationActivity;
import com.garmin.android.apps.connectmobile.traininginitiative.ui.a0;
import com.garmin.android.apps.connectmobile.traininginitiative.viewmodels.AddTIEventViewModel;
import com.garmin.android.gncs.NotificationConstants;
import com.garmin.feature.garminpay.providers.gpay.pushprovisioning.PushProvMainActivity;
import com.garmin.feature.garminpay.ui.selectcarddestination.CardDestinationSelectionActivity;
import com.garmin.feature.garminpay.ui.userwallet.PaymentCardDetailsActivity;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import e23.l;
import ho2.m;
import java.util.ArrayList;
import java.util.Arrays;
import lc.p0;
import lc.u0;
import lc.y;
import lc.y0;
import mz1.e0;
import o13.p;
import o53.f0;
import org.slf4j.Logger;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import ps2.w;
import yc.l2;
import zn2.q3;
import zn2.z0;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class e implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24082a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f24083b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f24084c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f24085d;

    public /* synthetic */ e(long j8, com.garmin.android.apps.connectmobile.onboarding.data.local.a aVar, Enum r14, int i14) {
        this.f24082a = i14;
        this.f24083b = j8;
        this.f24084c = aVar;
        this.f24085d = r14;
    }

    /* JADX WARN: Code duplicated, block: B:135:0x0345  */
    /* JADX WARN: Code duplicated, block: B:66:0x01a0  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.l
    public final Object invoke(Object obj) {
        d31.a aVar;
        Object objT;
        String str;
        Object objT2;
        int i14 = this.f24082a;
        long j8 = this.f24083b;
        Object obj2 = this.f24085d;
        Object obj3 = this.f24084c;
        switch (i14) {
            case 0:
                com.garmin.android.apps.connectmobile.onboarding.data.local.a aVar2 = (com.garmin.android.apps.connectmobile.onboarding.data.local.a) obj3;
                d31.d dVar = (d31.d) obj2;
                ud.a aVar3 = (ud.a) obj;
                com.garmin.android.apps.connectmobile.onboarding.data.local.a.b bVar = com.garmin.android.apps.connectmobile.onboarding.data.local.a.f39662d;
                aVar3.getClass();
                ud.c cVarM0 = aVar3.M0("SELECT * FROM device_onboarding_items WHERE deviceId = ? AND type = ?");
                try {
                    cVarM0.h(1, j8);
                    aVar2.f39665c.getClass();
                    cVarM0.q3(2, a.f(dVar));
                    int iB = ge1.b.B(cVarM0, "deviceId");
                    int iB2 = ge1.b.B(cVarM0, "deviceRegistrationSortOrder");
                    int iB3 = ge1.b.B(cVarM0, "deviceName");
                    int iB4 = ge1.b.B(cVarM0, "deviceProductNumber");
                    int iB5 = ge1.b.B(cVarM0, "sortOrder");
                    int iB6 = ge1.b.B(cVarM0, NotificationConstants.KEY_DATA_MIME_TYPE);
                    int iB7 = ge1.b.B(cVarM0, "associationType");
                    int iB8 = ge1.b.B(cVarM0, "status");
                    int iB9 = ge1.b.B(cVarM0, "coreItem");
                    int iB10 = ge1.b.B(cVarM0, "reminderDate");
                    int iB11 = ge1.b.B(cVarM0, "deviceImageUrl");
                    if (cVarM0.J0()) {
                        aVar = new d31.a(cVarM0.getLong(iB), (int) cVarM0.getLong(iB2), cVarM0.isNull(iB3) ? null : cVarM0.M1(iB3), cVarM0.isNull(iB4) ? null : cVarM0.M1(iB4), (int) cVarM0.getLong(iB5), a.d(cVarM0.M1(iB6)), a.a(cVarM0.M1(iB7)), a.c(cVarM0.M1(iB8)), ((int) cVarM0.getLong(iB9)) != 0, a.b(cVarM0.isNull(iB10) ? null : cVarM0.M1(iB10)), cVarM0.isNull(iB11) ? null : cVarM0.M1(iB11));
                    } else {
                        aVar = null;
                    }
                    return aVar;
                } finally {
                    cVarM0.close();
                }
            case 1:
                com.garmin.android.apps.connectmobile.onboarding.data.local.a aVar4 = (com.garmin.android.apps.connectmobile.onboarding.data.local.a) obj3;
                d31.c cVar = (d31.c) obj2;
                ud.a aVar5 = (ud.a) obj;
                com.garmin.android.apps.connectmobile.onboarding.data.local.a.b bVar2 = com.garmin.android.apps.connectmobile.onboarding.data.local.a.f39662d;
                aVar5.getClass();
                ud.c cVarM1 = aVar5.M0("SELECT * FROM device_onboarding_items WHERE deviceId = ? AND status = ?");
                try {
                    cVarM1.h(1, j8);
                    aVar4.f39665c.getClass();
                    cVarM1.q3(2, a.e(cVar));
                    int iB12 = ge1.b.B(cVarM1, "deviceId");
                    int iB13 = ge1.b.B(cVarM1, "deviceRegistrationSortOrder");
                    int iB14 = ge1.b.B(cVarM1, "deviceName");
                    int iB15 = ge1.b.B(cVarM1, "deviceProductNumber");
                    int iB16 = ge1.b.B(cVarM1, "sortOrder");
                    int iB17 = ge1.b.B(cVarM1, NotificationConstants.KEY_DATA_MIME_TYPE);
                    int iB18 = ge1.b.B(cVarM1, "associationType");
                    int iB19 = ge1.b.B(cVarM1, "status");
                    int iB20 = ge1.b.B(cVarM1, "coreItem");
                    int iB21 = ge1.b.B(cVarM1, "reminderDate");
                    int iB22 = ge1.b.B(cVarM1, "deviceImageUrl");
                    ArrayList arrayList = new ArrayList();
                    while (cVarM1.J0()) {
                        int i15 = iB12;
                        arrayList.add(new d31.a(cVarM1.getLong(iB12), (int) cVarM1.getLong(iB13), cVarM1.isNull(iB14) ? null : cVarM1.M1(iB14), cVarM1.isNull(iB15) ? null : cVarM1.M1(iB15), (int) cVarM1.getLong(iB16), a.d(cVarM1.M1(iB17)), a.a(cVarM1.M1(iB18)), a.c(cVarM1.M1(iB19)), ((int) cVarM1.getLong(iB20)) != 0, a.b(cVarM1.isNull(iB21) ? null : cVarM1.M1(iB21)), cVarM1.isNull(iB22) ? null : cVarM1.M1(iB22)));
                        iB12 = i15;
                        break;
                    }
                    return arrayList;
                } finally {
                    cVarM1.close();
                }
            case 2:
                Context context = (Context) obj3;
                String str2 = (String) obj2;
                com.garmin.android.apps.connectmobile.handalignment.e.a aVar6 = com.garmin.android.apps.connectmobile.handalignment.e.f36611b;
                if (((Boolean) obj).booleanValue()) {
                    HandsCalibrationActivity.f36565z.getClass();
                    if (context != null) {
                        Intent intentD = l2.d(context, HandsCalibrationActivity.class, "GCM_deviceUnitID", j8);
                        intentD.putExtra("GCM_deviceName", str2);
                        context.startActivity(intentD);
                    }
                } else {
                    com.garmin.android.apps.connectmobile.handalignment.e.f36611b.getClass();
                    com.garmin.android.apps.connectmobile.handalignment.e.a.a(context, str2);
                }
                return Unit.INSTANCE;
            case 3:
                String str3 = (String) obj3;
                y yVar = (y) obj2;
                p0 p0Var = (p0) obj;
                p0Var.getClass();
                if (str3 != null) {
                    y0 y0VarI = kg.f.i(p0Var, yVar.f111904b.k().f111791g.f144354c);
                    y0VarI.f111914a = true;
                    Unit unit = Unit.INSTANCE;
                    p0Var.f111833f = true;
                    p0Var.f111834g = y0VarI.f111915b;
                    yVar.f111904b.k().q(new gl1.e(j8, str3));
                }
                return Unit.INSTANCE;
            case 4:
                int i16 = 0;
                PushProvMainActivity pushProvMainActivity = (PushProvMainActivity) obj3;
                String str4 = (String) obj2;
                q3.a aVar7 = (q3.a) obj;
                Logger logger = PushProvMainActivity.f51162v;
                logger.debug("checkAvailableSpaceForDevice: " + aVar7);
                if (aVar7 instanceof q3.a.C3843a) {
                    m mVar = pushProvMainActivity.f51165i;
                    if (mVar == null) {
                        s.m("pushProvViewModel");
                        throw null;
                    }
                    qs2.a aVar8 = mVar.f84878i;
                    ms2.g gVarA = aVar8 != null ? w.f140538a.a(aVar8.f147396a) : null;
                    z0 z0Var = gVarA instanceof z0 ? (z0) gVarA : null;
                    pushProvMainActivity.f51167k = z0Var;
                    if (z0Var == null) {
                        pushProvMainActivity.ka();
                        Unit unit2 = Unit.INSTANCE;
                    } else {
                        m mVar2 = pushProvMainActivity.f51165i;
                        if (mVar2 == null) {
                            s.m("pushProvViewModel");
                            throw null;
                        }
                        qs2.a aVar9 = mVar2.f84878i;
                        if (aVar9 != null) {
                            qs2.e[] eVarArr = aVar9.f147397b;
                            int length = eVarArr.length;
                            while (true) {
                                if (i16 >= length) {
                                    hn2.c.ba(pushProvMainActivity, Boolean.FALSE, null, null, 14);
                                    objT = ge1.b.T(f0.w(pushProvMainActivity), null, null, new ho2.i(pushProvMainActivity, null), 3);
                                } else if (eVarArr[i16] == qs2.e.PAYMENT) {
                                    m mVar3 = pushProvMainActivity.f51165i;
                                    if (mVar3 == null) {
                                        s.m("pushProvViewModel");
                                        throw null;
                                    }
                                    zq2.g gVarY4 = mVar3.y4(pushProvMainActivity.f51166j);
                                    gVarY4.getClass();
                                    ns2.c cVarJ = z0Var.j(gVarY4, j8);
                                    if (cVarJ instanceof ns2.c.b) {
                                        hn2.c.ba(pushProvMainActivity, Boolean.FALSE, null, null, 14);
                                        objT = ge1.b.T(f0.w(pushProvMainActivity), null, null, new ho2.i(pushProvMainActivity, null), 3);
                                    } else {
                                        if (!(cVarJ instanceof ns2.c.a)) {
                                            u0.r();
                                            return null;
                                        }
                                        ns2.c.a aVar10 = (ns2.c.a) cVarJ;
                                        String strB = aVar10.f127824a;
                                        String strA = aVar10.f127825b;
                                        logger.debug("showCannotAddCardDialog");
                                        br2.c cVar2 = br2.c.f19585a;
                                        if (strB == null) {
                                            kj0.c.f104941a.getClass();
                                            strB = kj0.c.b();
                                        }
                                        if (strA == null) {
                                            kj0.c.f104941a.getClass();
                                            strA = kj0.c.a();
                                        }
                                        androidx.appcompat.app.e eVarQ = br2.c.q(cVar2, pushProvMainActivity, strB, strA, new p(pushProvMainActivity.getString(R.string.lbl_ok), new ho2.b(pushProvMainActivity, 4)), null, null, false, PsExtractor.VIDEO_STREAM_MASK);
                                        if (eVarQ != null) {
                                            eVarQ.show();
                                        }
                                        objT = Unit.INSTANCE;
                                    }
                                } else {
                                    i16++;
                                }
                            }
                        } else {
                            pushProvMainActivity.fa();
                            objT = Unit.INSTANCE;
                        }
                        if (objT == null) {
                            pushProvMainActivity.ka();
                            Unit unit3 = Unit.INSTANCE;
                        }
                    }
                } else if (aVar7 instanceof q3.a.c) {
                    hn2.c.ba(pushProvMainActivity, Boolean.FALSE, null, null, 14);
                    logger.debug("showDeviceMemoryIsFullDialog");
                    br2.c cVar3 = br2.c.f19585a;
                    String string = pushProvMainActivity.getString(R.string.common_se_memory_full_title);
                    string.getClass();
                    String string2 = pushProvMainActivity.getString(R.string.common_se_memory_full_description, str4);
                    string2.getClass();
                    androidx.appcompat.app.e eVarQ2 = br2.c.q(cVar3, pushProvMainActivity, string, string2, new p(pushProvMainActivity.getString(R.string.lbl_ok), new ho2.b(pushProvMainActivity, 10)), null, null, false, PsExtractor.VIDEO_STREAM_MASK);
                    if (eVarQ2 != null) {
                        eVarQ2.show();
                    }
                    Unit unit4 = Unit.INSTANCE;
                } else {
                    if (!(aVar7 instanceof q3.a.b)) {
                        u0.r();
                        return null;
                    }
                    hn2.c.ba(pushProvMainActivity, Boolean.FALSE, null, null, 14);
                    pushProvMainActivity.ka();
                    Unit unit5 = Unit.INSTANCE;
                }
                return Unit.INSTANCE;
            case 5:
                CardDestinationSelectionActivity cardDestinationSelectionActivity = (CardDestinationSelectionActivity) obj3;
                String str5 = (String) obj2;
                Boolean bool = (Boolean) obj;
                CardDestinationSelectionActivity.f52144o.debug("wasWalletResetSuccessful=" + bool);
                if (s.g(bool, Boolean.TRUE)) {
                    cardDestinationSelectionActivity.da(j8, str5);
                    str = null;
                } else {
                    str = null;
                    br2.c.f19585a.g(null, cardDestinationSelectionActivity);
                }
                hn2.c.ba(cardDestinationSelectionActivity, Boolean.FALSE, str, str, 14);
                return Unit.INSTANCE;
            case 6:
                PaymentCardDetailsActivity paymentCardDetailsActivity = (PaymentCardDetailsActivity) obj3;
                String str6 = (String) obj2;
                q3.a aVar11 = (q3.a) obj;
                Logger logger2 = PaymentCardDetailsActivity.f52178q;
                logger2.debug("checkAvailableSpaceForDevice: " + aVar11);
                if (!(aVar11 instanceof q3.a.C3843a)) {
                    if (aVar11 instanceof q3.a.c) {
                        hn2.c.ba(paymentCardDetailsActivity, Boolean.FALSE, null, null, 14);
                        logger2.debug("showDeviceMemoryIsFullDialog");
                        br2.c cVar4 = br2.c.f19585a;
                        String string3 = paymentCardDetailsActivity.getString(R.string.common_se_memory_full_title);
                        string3.getClass();
                        String string4 = paymentCardDetailsActivity.getString(R.string.common_se_memory_full_description, str6);
                        string4.getClass();
                        androidx.appcompat.app.e eVarQ3 = br2.c.q(cVar4, paymentCardDetailsActivity, string3, string4, new p(paymentCardDetailsActivity.getString(R.string.lbl_ok), new tr2.i(paymentCardDetailsActivity, 1)), null, null, false, PsExtractor.VIDEO_STREAM_MASK);
                        if (eVarQ3 != null) {
                            eVarQ3.show();
                        }
                        Unit unit6 = Unit.INSTANCE;
                    } else {
                        if (!(aVar11 instanceof q3.a.b)) {
                            u0.r();
                            return null;
                        }
                        hn2.c.ba(paymentCardDetailsActivity, Boolean.FALSE, null, null, 14);
                        paymentCardDetailsActivity.ia();
                        Unit unit7 = Unit.INSTANCE;
                    }
                    return Unit.INSTANCE;
                }
                vr2.i iVar = paymentCardDetailsActivity.f52180h;
                if (iVar == null) {
                    s.m("paymentCardDetailsViewModel");
                    throw null;
                }
                z0 z0Var2 = iVar.f179606i;
                if (z0Var2 == null) {
                    z0Var2 = null;
                }
                if (z0Var2 == null) {
                    paymentCardDetailsActivity.ia();
                    Unit unit8 = Unit.INSTANCE;
                } else {
                    qs2.a aVar12 = iVar.f179602e;
                    if (aVar12 != null) {
                        qs2.e[] eVarArr2 = aVar12.f147397b;
                        int length2 = eVarArr2.length;
                        int i17 = 0;
                        while (true) {
                            if (i17 >= length2) {
                                hn2.c.ba(paymentCardDetailsActivity, Boolean.FALSE, null, null, 14);
                                objT2 = ge1.b.T(f0.w(paymentCardDetailsActivity), null, null, new tr2.m(paymentCardDetailsActivity, null), 3);
                            } else if (eVarArr2[i17] == qs2.e.PAYMENT) {
                                vr2.i iVar2 = paymentCardDetailsActivity.f52180h;
                                if (iVar2 == null) {
                                    s.m("paymentCardDetailsViewModel");
                                    throw null;
                                }
                                zq2.g gVarY5 = iVar2.y4();
                                gVarY5.getClass();
                                ns2.c cVarJ2 = z0Var2.j(gVarY5, j8);
                                if (cVarJ2 instanceof ns2.c.b) {
                                    objT2 = ge1.b.T(f0.w(paymentCardDetailsActivity), null, null, new tr2.m(paymentCardDetailsActivity, null), 3);
                                } else {
                                    if (!(cVarJ2 instanceof ns2.c.a)) {
                                        u0.r();
                                        return null;
                                    }
                                    ns2.c.a aVar13 = (ns2.c.a) cVarJ2;
                                    String strB2 = aVar13.f127824a;
                                    String strA2 = aVar13.f127825b;
                                    logger2.debug("showCannotAddCardDialog");
                                    br2.c cVar5 = br2.c.f19585a;
                                    if (strB2 == null) {
                                        kj0.c.f104941a.getClass();
                                        strB2 = kj0.c.b();
                                    }
                                    if (strA2 == null) {
                                        kj0.c.f104941a.getClass();
                                        strA2 = kj0.c.a();
                                    }
                                    androidx.appcompat.app.e eVarQ4 = br2.c.q(cVar5, paymentCardDetailsActivity, strB2, strA2, new p(paymentCardDetailsActivity.getString(R.string.lbl_ok), new tr2.i(paymentCardDetailsActivity, 0)), null, null, false, PsExtractor.VIDEO_STREAM_MASK);
                                    if (eVarQ4 != null) {
                                        eVarQ4.show();
                                    }
                                    objT2 = Unit.INSTANCE;
                                }
                            } else {
                                i17++;
                            }
                        }
                    } else {
                        paymentCardDetailsActivity.fa();
                        objT2 = Unit.INSTANCE;
                    }
                    if (objT2 == null) {
                        paymentCardDetailsActivity.ia();
                        Unit unit9 = Unit.INSTANCE;
                    }
                }
                return Unit.INSTANCE;
            case 7:
                com.garmin.android.apps.connectmobile.traininginitiative.ui.a aVar14 = (com.garmin.android.apps.connectmobile.traininginitiative.ui.a) obj3;
                g3 g3Var = (g3) obj2;
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                com.garmin.android.apps.connectmobile.traininginitiative.ui.a.C0883a c0883a = com.garmin.android.apps.connectmobile.traininginitiative.ui.a.T0;
                if (zBooleanValue) {
                    e0 e0VarZ6 = aVar14.z6();
                    gg0.d dVar2 = (gg0.d) g3Var.f35301b;
                    if (dVar2 == null) {
                        dVar2 = gg0.d.DELETED;
                    }
                    e0VarZ6.R4(j8, false, dVar2);
                } else {
                    aVar14.A6(g3Var.f35301b == gg0.d.DELETED, false);
                }
                return Unit.INSTANCE;
            case 8:
                a0 a0Var = (a0) obj3;
                g3 g3Var2 = (g3) obj2;
                boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                a0.a aVar15 = a0.I1;
                if (zBooleanValue2) {
                    AddTIEventViewModel addTIEventViewModelF6 = a0Var.F6();
                    gg0.d dVar3 = (gg0.d) g3Var2.f35301b;
                    if (dVar3 == null) {
                        dVar3 = gg0.d.DELETED;
                    }
                    addTIEventViewModelF6.R4(j8, false, dVar3);
                } else {
                    a0Var.Y6();
                }
                return Unit.INSTANCE;
            default:
                androidx.appcompat.app.e.a aVar16 = (androidx.appcompat.app.e.a) obj;
                int i18 = vq2.b.f179457y0;
                aVar16.getClass();
                aVar16.setTitle(R.string.device_text_watch_not_connected);
                String string5 = aVar16.getContext().getString(R.string.device_text_how_to_connect);
                string5.getClass();
                aVar16.setMessage(String.format(string5, Arrays.copyOf(new Object[]{(String) obj3}, 1)));
                aVar16.setCancelable(false);
                aVar16.setPositiveButton(R.string.lbl_ok, new com.garmin.android.apps.connectmobile.gfdi.protobuf.e((l) obj2, 16));
                aVar16.setNegativeButton(R.string.common_learn_more, new jr2.e(j8, aVar16));
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ e(Object obj, long j8, Object obj2, int i14) {
        this.f24082a = i14;
        this.f24084c = obj;
        this.f24083b = j8;
        this.f24085d = obj2;
    }

    public /* synthetic */ e(Object obj, Object obj2, long j8, int i14) {
        this.f24082a = i14;
        this.f24084c = obj;
        this.f24085d = obj2;
        this.f24083b = j8;
    }
}

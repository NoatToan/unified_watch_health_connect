package es2;

import com.garmin.android.gncs.NotificationConstants;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.firebase.analytics.FirebaseAnalytics;
import e23.l;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class d implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f65221a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f65222b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f65223c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f f65224d;

    public /* synthetic */ d(String str, long j8, f fVar) {
        this.f65221a = 2;
        this.f65223c = str;
        this.f65222b = j8;
        this.f65224d = fVar;
    }

    @Override // e23.l
    public final Object invoke(Object obj) throws Exception {
        int i14 = this.f65221a;
        fs2.a aVar = null;
        String strM1 = null;
        f fVar = this.f65224d;
        long j8 = this.f65222b;
        String str = this.f65223c;
        switch (i14) {
            case 0:
                f fVar2 = fVar;
                ud.a aVar2 = (ud.a) obj;
                f.b bVar = f.f65227d;
                aVar2.getClass();
                ud.c cVarM0 = aVar2.M0("select * from wallet_items where unit_id = ? and provider_type = ?");
                try {
                    cVarM0.h(1, j8);
                    cVarM0.q3(2, str);
                    int iB = ge1.b.B(cVarM0, FirebaseAnalytics.Param.ITEM_ID);
                    int iB2 = ge1.b.B(cVarM0, "provider_type");
                    int iB3 = ge1.b.B(cVarM0, "business_operator");
                    int iB4 = ge1.b.B(cVarM0, "display_name");
                    int iB5 = ge1.b.B(cVarM0, TtmlNode.ATTR_ID);
                    int iB6 = ge1.b.B(cVarM0, "unit_id");
                    int iB7 = ge1.b.B(cVarM0, NotificationConstants.KEY_DATA_MIME_TYPE);
                    int iB8 = ge1.b.B(cVarM0, "status");
                    int iB9 = ge1.b.B(cVarM0, "provider_specific_id");
                    int iB10 = ge1.b.B(cVarM0, "json_string");
                    int iB11 = ge1.b.B(cVarM0, "last_update_time");
                    ArrayList arrayList = new ArrayList();
                    while (cVarM0.J0()) {
                        fs2.a aVar3 = new fs2.a();
                        aVar3.h(cVarM0.M1(iB));
                        String strM2 = cVarM0.isNull(iB2) ? null : cVarM0.M1(iB2);
                        int i15 = iB;
                        f fVar3 = fVar2;
                        fVar3.f65230c.getClass();
                        aVar3.f73427b = gs2.a.d(strM2);
                        aVar3.f73428c = gs2.a.a(cVarM0.isNull(iB3) ? null : cVarM0.M1(iB3));
                        aVar3.g(cVarM0.M1(iB4));
                        int i16 = iB2;
                        aVar3.f73430e = cVarM0.getLong(iB5);
                        aVar3.f73431f = cVarM0.getLong(iB6);
                        aVar3.f73432g = gs2.a.c(cVarM0.isNull(iB7) ? null : cVarM0.M1(iB7));
                        aVar3.f73433h = gs2.a.b(cVarM0.isNull(iB8) ? null : cVarM0.M1(iB8));
                        aVar3.j(cVarM0.M1(iB9));
                        aVar3.i(cVarM0.M1(iB10));
                        aVar3.f73436k = cVarM0.getLong(iB11);
                        arrayList.add(aVar3);
                        iB = i15;
                        iB2 = i16;
                        fVar2 = fVar3;
                        break;
                    }
                    return arrayList;
                } finally {
                    cVarM0.close();
                }
            case 1:
                ud.a aVar4 = (ud.a) obj;
                f.b bVar2 = f.f65227d;
                aVar4.getClass();
                f fVar4 = fVar;
                ud.c cVarM1 = aVar4.M0("select * from wallet_items where unit_id = ? and provider_type = ?");
                try {
                    cVarM1.h(1, j8);
                    cVarM1.q3(2, str);
                    int iB12 = ge1.b.B(cVarM1, FirebaseAnalytics.Param.ITEM_ID);
                    int iB13 = ge1.b.B(cVarM1, "provider_type");
                    int iB14 = ge1.b.B(cVarM1, "business_operator");
                    int iB15 = ge1.b.B(cVarM1, "display_name");
                    int iB16 = ge1.b.B(cVarM1, TtmlNode.ATTR_ID);
                    int iB17 = ge1.b.B(cVarM1, "unit_id");
                    int iB18 = ge1.b.B(cVarM1, NotificationConstants.KEY_DATA_MIME_TYPE);
                    int iB19 = ge1.b.B(cVarM1, "status");
                    int iB20 = ge1.b.B(cVarM1, "provider_specific_id");
                    int iB21 = ge1.b.B(cVarM1, "json_string");
                    int iB22 = ge1.b.B(cVarM1, "last_update_time");
                    ArrayList arrayList2 = new ArrayList();
                    while (cVarM1.J0()) {
                        fs2.a aVar5 = new fs2.a();
                        aVar5.h(cVarM1.M1(iB12));
                        String strM3 = cVarM1.isNull(iB13) ? null : cVarM1.M1(iB13);
                        int i17 = iB12;
                        f fVar5 = fVar4;
                        fVar5.f65230c.getClass();
                        aVar5.f73427b = gs2.a.d(strM3);
                        aVar5.f73428c = gs2.a.a(cVarM1.isNull(iB14) ? null : cVarM1.M1(iB14));
                        aVar5.g(cVarM1.M1(iB15));
                        int i18 = iB13;
                        aVar5.f73430e = cVarM1.getLong(iB16);
                        aVar5.f73431f = cVarM1.getLong(iB17);
                        aVar5.f73432g = gs2.a.c(cVarM1.isNull(iB18) ? null : cVarM1.M1(iB18));
                        aVar5.f73433h = gs2.a.b(cVarM1.isNull(iB19) ? null : cVarM1.M1(iB19));
                        aVar5.j(cVarM1.M1(iB20));
                        aVar5.i(cVarM1.M1(iB21));
                        aVar5.f73436k = cVarM1.getLong(iB22);
                        arrayList2.add(aVar5);
                        iB12 = i17;
                        iB13 = i18;
                        fVar4 = fVar5;
                        break;
                    }
                    return arrayList2;
                } finally {
                    cVarM1.close();
                }
            default:
                ud.a aVar6 = (ud.a) obj;
                f.b bVar3 = f.f65227d;
                aVar6.getClass();
                ud.c cVarM2 = aVar6.M0("select * from wallet_items where item_id = ? and unit_id = ? order by id asc limit 1");
                try {
                    cVarM2.q3(1, str);
                    cVarM2.h(2, j8);
                    int iB23 = ge1.b.B(cVarM2, FirebaseAnalytics.Param.ITEM_ID);
                    int iB24 = ge1.b.B(cVarM2, "provider_type");
                    int iB25 = ge1.b.B(cVarM2, "business_operator");
                    int iB26 = ge1.b.B(cVarM2, "display_name");
                    int iB27 = ge1.b.B(cVarM2, TtmlNode.ATTR_ID);
                    int iB28 = ge1.b.B(cVarM2, "unit_id");
                    int iB29 = ge1.b.B(cVarM2, NotificationConstants.KEY_DATA_MIME_TYPE);
                    int iB30 = ge1.b.B(cVarM2, "status");
                    int iB31 = ge1.b.B(cVarM2, "provider_specific_id");
                    int iB32 = ge1.b.B(cVarM2, "json_string");
                    int iB33 = ge1.b.B(cVarM2, "last_update_time");
                    if (cVarM2.J0()) {
                        fs2.a aVar7 = new fs2.a();
                        aVar7.h(cVarM2.M1(iB23));
                        String strM4 = cVarM2.isNull(iB24) ? null : cVarM2.M1(iB24);
                        fVar.f65230c.getClass();
                        aVar7.f73427b = gs2.a.d(strM4);
                        aVar7.f73428c = gs2.a.a(cVarM2.isNull(iB25) ? null : cVarM2.M1(iB25));
                        aVar7.g(cVarM2.M1(iB26));
                        aVar7.f73430e = cVarM2.getLong(iB27);
                        aVar7.f73431f = cVarM2.getLong(iB28);
                        aVar7.f73432g = gs2.a.c(cVarM2.isNull(iB29) ? null : cVarM2.M1(iB29));
                        if (!cVarM2.isNull(iB30)) {
                            strM1 = cVarM2.M1(iB30);
                        }
                        aVar7.f73433h = gs2.a.b(strM1);
                        aVar7.j(cVarM2.M1(iB31));
                        aVar7.i(cVarM2.M1(iB32));
                        aVar7.f73436k = cVarM2.getLong(iB33);
                        aVar = aVar7;
                    }
                    return aVar;
                } finally {
                    cVarM2.close();
                }
        }
    }

    public /* synthetic */ d(long j8, String str, f fVar, int i14) {
        this.f65221a = i14;
        this.f65222b = j8;
        this.f65223c = str;
        this.f65224d = fVar;
    }
}

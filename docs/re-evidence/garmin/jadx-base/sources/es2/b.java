package es2;

import com.garmin.android.gncs.NotificationConstants;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.firebase.analytics.FirebaseAnalytics;
import e23.l;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class b implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f65215a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f65216b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f65217c;

    public /* synthetic */ b(long j8, f fVar, int i14) {
        this.f65215a = i14;
        this.f65216b = j8;
        this.f65217c = fVar;
    }

    @Override // e23.l
    public final Object invoke(Object obj) throws Exception {
        int i14 = this.f65215a;
        f fVar = this.f65217c;
        long j8 = this.f65216b;
        switch (i14) {
            case 0:
                ud.a aVar = (ud.a) obj;
                f.b bVar = f.f65227d;
                aVar.getClass();
                ud.c cVarM0 = aVar.M0("select * from wallet_items where unit_id = ?");
                try {
                    cVarM0.h(1, j8);
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
                        fs2.a aVar2 = new fs2.a();
                        aVar2.h(cVarM0.M1(iB));
                        String strM1 = cVarM0.isNull(iB2) ? null : cVarM0.M1(iB2);
                        int i15 = iB2;
                        fVar.f65230c.getClass();
                        aVar2.f73427b = gs2.a.d(strM1);
                        aVar2.f73428c = gs2.a.a(cVarM0.isNull(iB3) ? null : cVarM0.M1(iB3));
                        aVar2.g(cVarM0.M1(iB4));
                        int i16 = iB4;
                        int i17 = iB3;
                        aVar2.f73430e = cVarM0.getLong(iB5);
                        aVar2.f73431f = cVarM0.getLong(iB6);
                        aVar2.f73432g = gs2.a.c(cVarM0.isNull(iB7) ? null : cVarM0.M1(iB7));
                        aVar2.f73433h = gs2.a.b(cVarM0.isNull(iB8) ? null : cVarM0.M1(iB8));
                        aVar2.j(cVarM0.M1(iB9));
                        aVar2.i(cVarM0.M1(iB10));
                        aVar2.f73436k = cVarM0.getLong(iB11);
                        arrayList.add(aVar2);
                        iB3 = i17;
                        iB4 = i16;
                        iB2 = i15;
                        break;
                    }
                    return arrayList;
                } finally {
                    cVarM0.close();
                }
            default:
                ud.a aVar3 = (ud.a) obj;
                f.b bVar2 = f.f65227d;
                aVar3.getClass();
                ud.c cVarM1 = aVar3.M0("select * from wallet_items where unit_id = ?");
                try {
                    cVarM1.h(1, j8);
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
                        fs2.a aVar4 = new fs2.a();
                        aVar4.h(cVarM1.M1(iB12));
                        String strM2 = cVarM1.isNull(iB13) ? null : cVarM1.M1(iB13);
                        int i18 = iB12;
                        f fVar2 = fVar;
                        fVar2.f65230c.getClass();
                        aVar4.f73427b = gs2.a.d(strM2);
                        aVar4.f73428c = gs2.a.a(cVarM1.isNull(iB14) ? null : cVarM1.M1(iB14));
                        aVar4.g(cVarM1.M1(iB15));
                        int i19 = iB15;
                        int i24 = iB14;
                        aVar4.f73430e = cVarM1.getLong(iB16);
                        aVar4.f73431f = cVarM1.getLong(iB17);
                        aVar4.f73432g = gs2.a.c(cVarM1.isNull(iB18) ? null : cVarM1.M1(iB18));
                        aVar4.f73433h = gs2.a.b(cVarM1.isNull(iB19) ? null : cVarM1.M1(iB19));
                        aVar4.j(cVarM1.M1(iB20));
                        aVar4.i(cVarM1.M1(iB21));
                        aVar4.f73436k = cVarM1.getLong(iB22);
                        arrayList2.add(aVar4);
                        fVar = fVar2;
                        iB14 = i24;
                        iB15 = i19;
                        iB12 = i18;
                        break;
                    }
                    return arrayList2;
                } finally {
                    cVarM1.close();
                }
        }
    }
}

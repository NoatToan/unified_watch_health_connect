package i42;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.nimbusds.jose.HeaderParameterNames;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class i implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f91007a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.webtranslation.b f91008b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f91009c;

    public /* synthetic */ i(com.garmin.android.apps.connectmobile.webtranslation.b bVar, String str, int i14) {
        this.f91007a = i14;
        this.f91008b = bVar;
        this.f91009c = str;
    }

    @Override // e23.l
    public final Object invoke(Object obj) throws Exception {
        int i14 = this.f91007a;
        String str = this.f91009c;
        com.garmin.android.apps.connectmobile.webtranslation.b bVar = this.f91008b;
        switch (i14) {
            case 0:
                com.garmin.android.apps.connectmobile.webtranslation.c.b bVar2 = bVar.f47977d;
                ud.a aVar = (ud.a) obj;
                com.garmin.android.apps.connectmobile.webtranslation.b.c cVar = com.garmin.android.apps.connectmobile.webtranslation.b.f47973e;
                aVar.getClass();
                ud.c cVarM0 = aVar.M0("SELECT * FROM installation_record WHERE locale = ?");
                try {
                    bVar2.getClass();
                    str.getClass();
                    cVarM0.q3(1, str);
                    int iB = ge1.b.B(cVarM0, TtmlNode.ATTR_ID);
                    int iB2 = ge1.b.B(cVarM0, "locale");
                    int iB3 = ge1.b.B(cVarM0, "version_name");
                    int iB4 = ge1.b.B(cVarM0, HeaderParameterNames.AUTHENTICATION_TAG);
                    ArrayList arrayList = new ArrayList();
                    while (cVarM0.J0()) {
                        long j8 = cVarM0.getLong(iB);
                        String strM1 = cVarM0.M1(iB2);
                        bVar2.getClass();
                        strM1.getClass();
                        com.garmin.android.apps.connectmobile.webtranslation.c.a aVar2 = com.garmin.android.apps.connectmobile.webtranslation.c.f47979b;
                        arrayList.add(new d(j8, strM1, cVarM0.M1(iB3), cVarM0.M1(iB4), null));
                    }
                    cVarM0.close();
                    return arrayList;
                } catch (Throwable th3) {
                    cVarM0.close();
                    throw th3;
                }
            default:
                ud.a aVar3 = (ud.a) obj;
                com.garmin.android.apps.connectmobile.webtranslation.b.c cVar2 = com.garmin.android.apps.connectmobile.webtranslation.b.f47973e;
                aVar3.getClass();
                ud.c cVarM1 = aVar3.M0("SELECT translation.* FROM translation JOIN installation_record ON translation.record_id = installation_record.id WHERE version_name = ? AND locale = ?");
                try {
                    cVarM1.q3(1, "5.30.1");
                    bVar.f47977d.getClass();
                    str.getClass();
                    cVarM1.q3(2, str);
                    int iB5 = ge1.b.B(cVarM1, "record_id");
                    int iB6 = ge1.b.B(cVarM1, "handle");
                    int iB7 = ge1.b.B(cVarM1, "text");
                    int iB8 = ge1.b.B(cVarM1, "hash");
                    ArrayList arrayList2 = new ArrayList();
                    while (cVarM1.J0()) {
                        arrayList2.add(new e(cVarM1.getLong(iB5), cVarM1.M1(iB6), cVarM1.M1(iB7), cVarM1.M1(iB8)));
                    }
                    cVarM1.close();
                    return arrayList2;
                } catch (Throwable th4) {
                    cVarM1.close();
                    throw th4;
                }
        }
    }
}

package uj1;

import com.garmin.android.apps.connectmobile.view.StyledInlineButtonFieldViewDark;
import java.util.Map;
import r22.y1;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class s implements y1.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f171561a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.d f171562b;

    public /* synthetic */ s(com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.d dVar, int i14) {
        this.f171561a = i14;
        this.f171562b = dVar;
    }

    @Override // r22.y1.d
    public final void c(Object obj) {
        String str;
        l20.q qVarB;
        String str2;
        l20.q qVarB2;
        int i14 = this.f171561a;
        boolean z14 = true;
        com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.d dVar = this.f171562b;
        switch (i14) {
            case 0:
                com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.d.a aVar = com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.d.X;
                obj.getClass();
                Map map = (Map) dVar.w6().f137910l.d();
                if (map == null || (str = (String) map.get(obj)) == null) {
                    return;
                }
                StyledInlineButtonFieldViewDark styledInlineButtonFieldViewDark = dVar.f43756o;
                if (styledInlineButtonFieldViewDark == null) {
                    p005kotlin.jvm.internal.s.m("countryOfCitizenship");
                    throw null;
                }
                styledInlineButtonFieldViewDark.i(new h32.h.c(str, null, null, null, null, null, new o(dVar, 3), null, 0, false, null, null, 4030, null));
                yj1.h hVar = dVar.f43759r;
                if (hVar == null) {
                    p005kotlin.jvm.internal.s.m("informationUIModel");
                    throw null;
                }
                l20.q qVar = hVar.f197548b;
                if (qVar != null) {
                    pj1.s sVarW6 = dVar.w6();
                    String string = obj.toString();
                    string.getClass();
                    ((tj1.h) sVarW6.f137899a.getValue()).getClass();
                    qVarB = l20.q.b(qVar, null, null, null, null, (String) tj1.h.a().get(string), null, null, null, null, null, null, null, null, 16777183);
                } else {
                    qVarB = null;
                }
                yj1.h hVarA = yj1.h.a(hVar, qVarB);
                dVar.f43759r = hVarA;
                StyledInlineButtonFieldViewDark styledInlineButtonFieldViewDark2 = dVar.f43756o;
                if (styledInlineButtonFieldViewDark2 == null) {
                    p005kotlin.jvm.internal.s.m("countryOfCitizenship");
                    throw null;
                }
                l20.q qVar2 = hVarA.f197548b;
                String countryOfCitizenship = qVar2 != null ? qVar2.getCountryOfCitizenship() : null;
                if (countryOfCitizenship != null && countryOfCitizenship.length() != 0) {
                    z14 = false;
                }
                styledInlineButtonFieldViewDark2.setHasError(z14);
                dVar.u6();
                StyledInlineButtonFieldViewDark styledInlineButtonFieldViewDark3 = dVar.f43756o;
                if (styledInlineButtonFieldViewDark3 != null) {
                    styledInlineButtonFieldViewDark3.invalidate();
                    return;
                } else {
                    p005kotlin.jvm.internal.s.m("countryOfCitizenship");
                    throw null;
                }
            default:
                com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.d.a aVar2 = com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.d.X;
                obj.getClass();
                Map map2 = (Map) dVar.w6().f137908j.d();
                if (map2 == null || (str2 = (String) map2.get(obj)) == null) {
                    return;
                }
                StyledInlineButtonFieldViewDark styledInlineButtonFieldViewDark4 = dVar.f43752k;
                if (styledInlineButtonFieldViewDark4 == null) {
                    p005kotlin.jvm.internal.s.m("country");
                    throw null;
                }
                styledInlineButtonFieldViewDark4.i(new h32.h.c(str2, null, null, null, null, null, new o(dVar, 4), null, 0, false, null, null, 4030, null));
                yj1.h hVar2 = dVar.f43759r;
                if (hVar2 == null) {
                    p005kotlin.jvm.internal.s.m("informationUIModel");
                    throw null;
                }
                l20.q qVar3 = hVar2.f197548b;
                if (qVar3 != null) {
                    pj1.s sVarW7 = dVar.w6();
                    String string2 = obj.toString();
                    string2.getClass();
                    ((tj1.h) sVarW7.f137899a.getValue()).getClass();
                    qVarB2 = l20.q.b(qVar3, null, null, null, (String) tj1.h.a().get(string2), null, null, null, null, null, null, null, null, null, 16777199);
                } else {
                    qVarB2 = null;
                }
                yj1.h hVarA2 = yj1.h.a(hVar2, qVarB2);
                dVar.f43759r = hVarA2;
                StyledInlineButtonFieldViewDark styledInlineButtonFieldViewDark5 = dVar.f43752k;
                if (styledInlineButtonFieldViewDark5 == null) {
                    p005kotlin.jvm.internal.s.m("country");
                    throw null;
                }
                l20.q qVar4 = hVarA2.f197548b;
                String country = qVar4 != null ? qVar4.getCountry() : null;
                if (country != null && country.length() != 0) {
                    z14 = false;
                }
                styledInlineButtonFieldViewDark5.setHasError(z14);
                StyledInlineButtonFieldViewDark styledInlineButtonFieldViewDark6 = dVar.f43752k;
                if (styledInlineButtonFieldViewDark6 != null) {
                    styledInlineButtonFieldViewDark6.invalidate();
                    return;
                } else {
                    p005kotlin.jvm.internal.s.m("country");
                    throw null;
                }
        }
    }
}

package mt0;

import android.content.Context;
import android.graphics.Bitmap;
import android.widget.Toast;
import com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.WorkoutStepTargetTypeActivity;
import i3.e5;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import n70.i6;
import n70.o6;
import org.apache.commons.lang3.StringUtils;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class s1 implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f120851a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f120852b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f120853c;

    public /* synthetic */ s1(int i14, Object obj, Object obj2) {
        this.f120851a = i14;
        this.f120852b = obj;
        this.f120853c = obj2;
    }

    @Override // e23.a
    public final Object invoke() {
        String lowerCase;
        String[] strArrNames;
        int i14 = this.f120851a;
        boolean z14 = true;
        Object obj = this.f120853c;
        Object obj2 = this.f120852b;
        switch (i14) {
            case 0:
                ((com.garmin.android.apps.connectmobile.leaderboard.challenges.w) obj2).f37933a.a((com.garmin.android.apps.connectmobile.leaderboard.model.p) obj);
                return Unit.INSTANCE;
            case 1:
                com.garmin.android.apps.connectmobile.liveeventsharing.ui.e.a aVar = com.garmin.android.apps.connectmobile.liveeventsharing.ui.e.D;
                ((z10.d2) ((com.garmin.android.apps.connectmobile.liveeventsharing.ui.e) obj2).A.getValue()).z4(((z10.a1.f) ((z10.a1) obj)).f200881a);
                return Unit.INSTANCE;
            case 2:
                return Integer.valueOf(((w13.a) obj2).indexOf(((gw0.h0) ((p3.x3) obj).getF182175a()).f79610b));
            case 3:
                ((e23.l) obj2).invoke((lw1.g) obj);
                return Unit.INSTANCE;
            case 4:
                String str = (String) obj2;
                c22.l3.a aVar2 = c22.l3.f23124b;
                int intValue = ((p3.n1) obj).getIntValue();
                aVar2.getClass();
                return p3.p0.n(c22.l3.a.w0(intValue).concat(str != null ? StringUtils.SPACE.concat(str) : ""));
            case 5:
                ((n70.h) obj2).f124246a.r((lp.k) obj);
                return Unit.INSTANCE;
            case 6:
                ((n70.d3) obj2).f124136b.r((lp.k) obj);
                return Unit.INSTANCE;
            case 7:
                j70.i iVar = (j70.i) obj;
                if (((o13.p) obj2).f128594a == 0) {
                    if ((iVar != null ? iVar.f97540h : null) == null) {
                        z14 = false;
                    }
                }
                return Boolean.valueOf(z14);
            case 8:
                ((i6) obj2).f124289b.r((lp.k) obj);
                return Unit.INSTANCE;
            case 9:
                ((o6) obj2).f124464a.r((lp.k) obj);
                return Unit.INSTANCE;
            case 10:
                p3.x3 x3Var = (p3.x3) obj;
                ((e23.p) obj2).invoke(Integer.valueOf(((na0.i) x3Var.getF182175a()).f125126b), ((na0.i) x3Var.getF182175a()).f125125a);
                return Unit.INSTANCE;
            case 11:
                ((nc.k) obj2).i((lc.v) obj, false);
                return Unit.INSTANCE;
            case 12:
                int i15 = ne2.s.M0;
                ((com.garmin.android.library.mapsdkadapter.i.o) obj2).onSnapshotReady((Bitmap) obj);
                return Unit.INSTANCE;
            case 13:
                mg0.a aVar3 = (mg0.a) obj;
                ng0.b bVar = ng0.b.f125905a;
                ((e23.q) obj2).invoke(aVar3.f118368e, aVar3.f118369f, aVar3.f118364a);
                return Unit.INSTANCE;
            case 14:
                ((e23.l) obj2).invoke((qg2.c) obj);
                return Unit.INSTANCE;
            case 15:
                ((e23.l) obj2).invoke(((qp.c) obj).f145999a);
                return Unit.INSTANCE;
            case 16:
                ((e23.l) obj2).invoke((nv.e) obj);
                return Unit.INSTANCE;
            case 17:
                p11.a aVar4 = (p11.a) obj2;
                boolean z15 = !((Boolean) ((p3.x3) obj).getF182175a()).booleanValue();
                aVar4.f134892a.x(z15);
                aVar4.f134893b.k(null, Boolean.valueOf(z15));
                return Unit.INSTANCE;
            case 18:
                int i16 = o62.l.f129705g;
                Locale locale = Locale.getDefault();
                String language = locale.getLanguage();
                String country = locale.getCountry();
                p005kotlin.jvm.internal.x0 x0Var = p005kotlin.jvm.internal.x0.f105818a;
                h82.c.f((o62.l) obj2, (Context) obj, String.format("https://www.garmin.com/%1$s/performance-data/cycling/", Arrays.copyOf(new Object[]{e5.g(language, "-", country)}, 1)));
                return Unit.INSTANCE;
            case 19:
                m52.a aVar5 = (m52.a) obj2;
                e23.l lVar = (e23.l) obj;
                if (aVar5 == null) {
                    return null;
                }
                lVar.invoke(aVar5);
                return Unit.INSTANCE;
            case 20:
                ((e23.l) obj2).invoke((com.garmin.android.apps.connectmobile.workouts.data.model.j0.c) obj);
                return Unit.INSTANCE;
            case 21:
                int i17 = WorkoutStepTargetTypeActivity.f49603b;
                ((r22.u1) obj2).B((r22.t1) obj);
                return Unit.INSTANCE;
            case 22:
                k63.e eVar = (k63.e) obj2;
                n63.b bVar2 = (n63.b) obj;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                z14 = bVar2.f123893a.f123931m && p005kotlin.jvm.internal.s.g(eVar.getF103234b(), k63.l.b.f103252a);
                o63.o.e(eVar, bVar2);
                int f116985c = eVar.getF103235c();
                for (int i18 = 0; i18 < f116985c; i18++) {
                    List<Annotation> listE = eVar.e(i18);
                    ArrayList arrayList = new ArrayList();
                    for (Object obj3 : listE) {
                        if (obj3 instanceof n63.s) {
                            arrayList.add(obj3);
                        }
                    }
                    n63.s sVar = (n63.s) p13.h0.K0(arrayList);
                    if (sVar != null && (strArrNames = sVar.names()) != null) {
                        for (String lowerCase2 : strArrNames) {
                            if (z14) {
                                lowerCase2 = lowerCase2.toLowerCase(Locale.ROOT);
                                lowerCase2.getClass();
                            }
                            o63.o.a(linkedHashMap, eVar, lowerCase2, i18);
                        }
                    }
                    if (z14) {
                        lowerCase = eVar.d(i18).toLowerCase(Locale.ROOT);
                        lowerCase.getClass();
                    } else {
                        lowerCase = null;
                    }
                    if (lowerCase != null) {
                        o63.o.a(linkedHashMap, eVar, lowerCase, i18);
                    }
                }
                if (!linkedHashMap.isEmpty()) {
                    return linkedHashMap;
                }
                p13.k0 k0Var = p13.k0.f134949a;
                k0Var.getClass();
                return k0Var;
            case 23:
                o71.e.a aVar6 = (o71.e.a) obj2;
                c53.g gVarP = c53.c0.p(aVar6.f130182a.f130210c.invoke(aVar6.f130183b), new o50.a(2, aVar6, (List) obj));
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                c53.g.a aVar7 = new c53.g.a(gVarP);
                while (aVar7.hasNext()) {
                    o13.p pVar = (o13.p) aVar7.next();
                    linkedHashMap2.put(pVar.f128594a, pVar.f128595b);
                }
                return p13.u0.g(linkedHashMap2);
            case 24:
                String lowerCase3 = ((l72.o0) obj).name().toLowerCase(Locale.ROOT);
                lowerCase3.getClass();
                Toast.makeText((Context) obj2, p72.d.g(lowerCase3).concat(" button clicked"), 0).show();
                return Unit.INSTANCE;
            case 25:
                String lowerCase4 = ((l72.c2) obj).name().toLowerCase(Locale.ROOT);
                lowerCase4.getClass();
                Toast.makeText((Context) obj2, p72.d.g(lowerCase4).concat(" button clicked"), 0).show();
                return Unit.INSTANCE;
            case 26:
                ((e23.l) obj2).invoke((o82.g) obj);
                return Unit.INSTANCE;
            case 27:
                ge1.b.T((o53.b0) obj2, null, null, new o72.e3.a((u1.d2) obj, null), 3);
                return Unit.INSTANCE;
            case 28:
                ((p3.p1) obj).setValue((j90.o) obj2);
                return Unit.INSTANCE;
            default:
                ((oe.k) obj2).f131234c.b((oe.h) obj);
                return Unit.INSTANCE;
        }
    }
}

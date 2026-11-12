package y80;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.settings.model.UserSettingsDTO;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Lz80/l;", "<anonymous>", "(Lo53/b0;)Lz80/l;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.device.setup.data.UserProfileRepositoryImpl$getUserProfileData$2", f = "UserProfileRepositoryImpl.kt", l = {}, m = "invokeSuspend", v = 2)
public final class u0 extends v13.i implements e23.p<o53.b0, t13.d<? super z80.l>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f195225a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t0 f195226b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(t0 t0Var, t13.d<? super u0> dVar) {
        super(2, dVar);
        this.f195226b = t0Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        u0 u0Var = new u0(this.f195226b, dVar);
        u0Var.f195225a = obj;
        return u0Var;
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super z80.l> dVar) {
        return ((u0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x007e  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        UserSettingsDTO userSettingsDTOD;
        z80.k kVar;
        gg1.o0 o0VarB;
        z80.m mVar;
        ArrayList arrayList;
        mb0.h hVarValueOf;
        String str;
        Object next;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        qd2.a aVarB = qd2.a.b();
        t0 t0Var = this.f195226b;
        if (aVarB != null) {
            int i14 = t0.f195220b;
            t0Var.getClass();
            userSettingsDTOD = t0.d(aVarB);
        } else {
            userSettingsDTOD = null;
        }
        if (userSettingsDTOD == null) {
            a2 a2Var = a2.DEVICE_SETUP;
            i2.f36769a.getClass();
            i2.a.b(a2Var, "UserProfileRepository", "No user settings cached");
            return new z80.l(null, null, null, null, null, 0L, null, null, null, null, false, null, null, 8191, null);
        }
        new s90.e();
        long jM = userSettingsDTOD.M();
        long jZ = userSettingsDTOD.Z();
        Double dValueOf = Double.valueOf(userSettingsDTOD.I());
        Double dValueOf2 = Double.valueOf(userSettingsDTOD.E2());
        UserSettingsDTO.c cVarG = userSettingsDTOD.G();
        if (cVarG == null || (str = cVarG.f43537a) == null) {
            kVar = null;
        } else {
            if (str.length() <= 0) {
                str = null;
            }
            if (str != null) {
                z80.k.f203065b.getClass();
                Iterator<T> it = z80.k.f203070g.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!p005kotlin.jvm.internal.s.g(((z80.k) next).f203071a, str));
                z80.k kVar2 = (z80.k) next;
                if (kVar2 == null) {
                    kVar2 = z80.k.MALE;
                }
                kVar = kVar2;
            } else {
                kVar = null;
            }
        }
        LocalDate localDateF = userSettingsDTOD.F();
        b63.o oVar = localDateF != null ? new b63.o(localDateF.getYear(), localDateF.getMonthOfYear(), localDateF.getDayOfMonth()) : null;
        wi1.j jVar = userSettingsDTOD.f43524b;
        if (jVar != null) {
            gg1.o0.a aVar2 = gg1.o0.f77285d;
            String str2 = jVar.f185544g;
            aVar2.getClass();
            o0VarB = gg1.o0.a.b(str2);
        } else {
            o0VarB = gg1.o0.STATUTE_US;
        }
        boolean z14 = true;
        gg1.o0 o0Var = (o0VarB == null || !o0VarB.a()) ? gg1.o0.STATUTE_US : gg1.o0.METRIC;
        if (jM < 0 || jZ < 0) {
            mVar = null;
        } else {
            int i15 = (int) jM;
            int i16 = (int) jZ;
            wi1.k kVar3 = userSettingsDTOD.f43525c;
            boolean z15 = kVar3 == null || kVar3.f185577c;
            if (kVar3 != null && !kVar3.f185578d) {
                z14 = false;
            }
            mVar = new z80.m(i15, i16, z15, z14);
        }
        wi1.j jVar2 = userSettingsDTOD.f43524b;
        z80.l lVar = new z80.l(dValueOf, dValueOf2, kVar, oVar, o0Var, 0L, mVar, null, null, jVar2 != null ? Boolean.valueOf(jVar2.f185559x) : null, false, null, null, 7584, null);
        List<wi1.l> list = userSettingsDTOD.f43526d;
        if (list != null) {
            int i17 = t0.f195220b;
            t0Var.getClass();
            ArrayList<wi1.l> arrayList2 = new ArrayList();
            for (Object obj2 : list) {
                if (!p005kotlin.jvm.internal.s.g(((wi1.l) obj2).getSleepWindowFrequency(), "DAILY")) {
                    arrayList2.add(obj2);
                }
            }
            ArrayList<o13.p> arrayList3 = new ArrayList();
            for (wi1.l lVar2 : arrayList2) {
                try {
                    String upperCase = lVar2.getSleepWindowFrequency().toUpperCase(Locale.ROOT);
                    upperCase.getClass();
                    hVarValueOf = mb0.h.valueOf(upperCase);
                } catch (IllegalArgumentException unused) {
                    hVarValueOf = null;
                }
                o13.p pVar = hVarValueOf != null ? new o13.p(hVarValueOf, lVar2) : null;
                if (pVar != null) {
                    arrayList3.add(pVar);
                }
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (o13.p pVar2 : arrayList3) {
                wi1.l lVar3 = (wi1.l) pVar2.f128595b;
                o13.p pVar3 = new o13.p(Integer.valueOf(lVar3.getStartSleepTimeSecondsFromMidnight()), Integer.valueOf(lVar3.getEndSleepTimeSecondsFromMidnight()));
                Object arrayList4 = linkedHashMap.get(pVar3);
                if (arrayList4 == null) {
                    arrayList4 = new ArrayList();
                    linkedHashMap.put(pVar3, arrayList4);
                }
                ((List) arrayList4).add((mb0.h) pVar2.f128594a);
            }
            ArrayList arrayList5 = new ArrayList(linkedHashMap.size());
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                o13.p pVar4 = (o13.p) entry.getKey();
                List list2 = (List) entry.getValue();
                int iIntValue = ((Number) pVar4.f128594a).intValue();
                int iIntValue2 = ((Number) pVar4.f128595b).intValue();
                List listM0 = p13.h0.M0(list2);
                b63.v.INSTANCE.getClass();
                arrayList5.add(new z80.j(listM0, b63.v.Companion.a(iIntValue), b63.v.Companion.a(iIntValue2)));
            }
            arrayList = arrayList5;
        } else {
            arrayList = null;
        }
        f12.l.f68084a.getClass();
        String strQ4 = f12.l.a.a().q4();
        String str3 = strQ4.length() > 0 ? strQ4 : null;
        wi1.j jVar3 = userSettingsDTOD.f43524b;
        z80.l lVarA = z80.l.a(lVar, null, null, null, null, null, jVar3 != null ? jVar3.f185551n : -1L, null, arrayList, str3, null, false, null, null, 7775);
        i2.f36769a.getClass();
        i2.a.b(a2.DEVICE_SETUP, "UserProfileRepository", "User settings loaded from cache: " + lVarA);
        return lVarA;
    }
}

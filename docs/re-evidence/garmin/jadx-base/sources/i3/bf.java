package i3;

import com.garmin.android.apps.connectmobile.R;
import java.util.Arrays;
import java.util.List;
import org.slf4j.Logger;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class bf implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f87597a;

    public /* synthetic */ bf(int i14) {
        this.f87597a = i14;
    }

    @Override // e23.l
    public final Object invoke(Object obj) throws Exception {
        switch (this.f87597a) {
            case 0:
                cf.a aVar = cf.f87780c;
                return Boolean.TRUE;
            case 1:
                return Unit.INSTANCE;
            case 2:
                return Unit.INSTANCE;
            case 3:
                return Unit.INSTANCE;
            case 4:
                return Unit.INSTANCE;
            case 5:
                p5.h0.D((p5.k0) obj);
                return Unit.INSTANCE;
            case 6:
                p5.h0.D((p5.k0) obj);
                return Unit.INSTANCE;
            case 7:
                k23.l<Object>[] lVarArr = p5.h0.f136016a;
                p5.d0.f135959a.getClass();
                p5.j0<Unit> j0Var = p5.d0.f135964f;
                Unit unit = Unit.INSTANCE;
                ((p5.k0) obj).a(j0Var, unit);
                return unit;
            case 8:
                List list = (List) obj;
                Object obj2 = list.get(0);
                obj2.getClass();
                int iIntValue = ((Integer) obj2).intValue();
                Object obj3 = list.get(1);
                obj3.getClass();
                int iIntValue2 = ((Integer) obj3).intValue();
                Object obj4 = list.get(2);
                obj4.getClass();
                return new si(iIntValue, iIntValue2, ((Boolean) obj4).booleanValue());
            case 9:
                int i14 = tj.f89836c;
                return Unit.INSTANCE;
            case 10:
                n63.e eVar = (n63.e) obj;
                int i15 = i31.s.f90747b;
                eVar.getClass();
                eVar.f123904c = true;
                return Unit.INSTANCE;
            case 11:
                Byte b14 = (Byte) obj;
                b14.byteValue();
                Logger logger = com.garmin.android.apps.connectmobile.webtranslation.a.f47968e;
                return String.format("%02x", Arrays.copyOf(new Object[]{b14}, 1));
            case 12:
                ud.a aVar2 = (ud.a) obj;
                com.garmin.android.apps.connectmobile.webtranslation.b.c cVar = com.garmin.android.apps.connectmobile.webtranslation.b.f47973e;
                aVar2.getClass();
                ud.c cVarM0 = aVar2.M0("DELETE from installation_record");
                try {
                    cVarM0.J0();
                    return Unit.INSTANCE;
                } finally {
                    cVarM0.close();
                }
            case 13:
                ((p5.k0) obj).getClass();
                return Unit.INSTANCE;
            case 14:
                ((p5.k0) obj).getClass();
                return Unit.INSTANCE;
            case 15:
                oi0.b bVar = (oi0.b) obj;
                bVar.getClass();
                String str = bVar.f132238b;
                l22.b bVar2 = bVar.f132237a;
                String strV = d53.u.v(str, bVar2.getString(R.string.hiit_timers_amrap_help_label), bVar2.getString(R.string.lbl_as_many_rounds_as_possible), false);
                bVar.f132238b = strV;
                bVar.f132238b = d53.u.v(strV, bVar2.getString(R.string.hiit_timers_emom_help_label), bVar2.getString(R.string.lbl_every_minute_on_the_minute), false);
                return Unit.INSTANCE;
            case 16:
                oi0.b bVar3 = (oi0.b) obj;
                bVar3.getClass();
                String str2 = bVar3.f132238b;
                l22.b bVar4 = bVar3.f132237a;
                String strV2 = d53.u.v(str2, bVar4.getString(R.string.hiit_timers_amrap_help_label), bVar4.getString(R.string.lbl_as_many_rounds_as_possible), false);
                bVar3.f132238b = strV2;
                bVar3.f132238b = d53.u.v(strV2, bVar4.getString(R.string.hiit_timers_emom_help_label), bVar4.getString(R.string.lbl_every_minute_on_the_minute), false);
                return Unit.INSTANCE;
            case 17:
                k23.d dVar = (k23.d) obj;
                dVar.getClass();
                i63.c cVarL = gl1.y.L(dVar);
                if (cVarL != null) {
                    return cVarL;
                }
                if (dh.b.u(dVar).isInterface()) {
                    return new i63.e(dVar);
                }
                return null;
            case 18:
                k23.d dVar2 = (k23.d) obj;
                dVar2.getClass();
                i63.c cVarL2 = gl1.y.L(dVar2);
                if (cVarL2 == null) {
                    cVarL2 = dh.b.u(dVar2).isInterface() ? new i63.e(dVar2) : null;
                }
                if (cVarL2 != null) {
                    return j63.a.d(cVarL2);
                }
                return null;
            case 19:
                i91.a aVar3 = i91.a.f92320a;
                ((String) obj).getClass();
                return Unit.INSTANCE;
            case 20:
                i91.a aVar4 = i91.a.f92320a;
                ((String) obj).getClass();
                return Unit.INSTANCE;
            case 21:
                i91.a aVar5 = i91.a.f92320a;
                ((String) obj).getClass();
                return Unit.INSTANCE;
            case 22:
                p5.k0 k0Var = (p5.k0) obj;
                k0Var.getClass();
                p5.h0.D(k0Var);
                return Unit.INSTANCE;
            case 23:
                p5.k0 k0Var2 = (p5.k0) obj;
                k0Var2.getClass();
                p5.h0.f(k0Var2);
                return Unit.INSTANCE;
            case 24:
                p5.k0 k0Var3 = (p5.k0) obj;
                k0Var3.getClass();
                p5.h0.E(k0Var3, 1.0f);
                return Unit.INSTANCE;
            case 25:
                p5.k0 k0Var4 = (p5.k0) obj;
                k0Var4.getClass();
                p5.h0.f(k0Var4);
                return Unit.INSTANCE;
            case 26:
                j90.b bVar5 = (j90.b) obj;
                bVar5.getClass();
                return Boolean.valueOf(bVar5.f97790c || bVar5.f97789b);
            case 27:
                ((p5.k0) obj).getClass();
                return Unit.INSTANCE;
            case 28:
                n63.e eVar2 = (n63.e) obj;
                int i16 = ic0.f.f92589f;
                eVar2.getClass();
                eVar2.f123904c = true;
                return Unit.INSTANCE;
            default:
                ic1.i.a aVar6 = ic1.i.f92620g;
                ((p5.k0) obj).getClass();
                return Unit.INSTANCE;
        }
    }
}

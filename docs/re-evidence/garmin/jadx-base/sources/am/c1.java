package am;

import com.garmin.android.apps.connectmobile.connections.groups.details.GroupSettingsPrivacyActivity;
import com.garmin.android.apps.connectmobile.connections.groups.services.model.GroupDTO;
import com.garmin.android.apps.connectmobile.settings.developersettings.TestGoogleAgeSignalsActivity;
import ew1.m2;
import java.util.ArrayList;
import java.util.Calendar;
import l72.i3;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class c1 implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3886a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p3.p1 f3887b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p3.p1 f3888c;

    public /* synthetic */ c1(String str, p3.p1 p1Var, p3.p1 p1Var2) {
        this.f3886a = 3;
        this.f3887b = p1Var;
        this.f3888c = p1Var2;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0034  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.l
    public final Object invoke(Object obj) {
        String string;
        int i14 = this.f3886a;
        Object string2 = null;
        boolean z14 = true;
        p3.p1 p1Var = this.f3888c;
        p3.p1 p1Var2 = this.f3887b;
        switch (i14) {
            case 0:
                i3 i3Var = (i3) obj;
                i3Var.getClass();
                if (p005kotlin.jvm.internal.s.g(i3Var.f111063a, "SEARCH")) {
                    Boolean bool = Boolean.TRUE;
                    p1Var2.setValue(bool);
                    p1Var.setValue(bool);
                }
                return Unit.INSTANCE;
            case 1:
                Long l14 = (Long) obj;
                if (l14 != null) {
                    long jLongValue = l14.longValue();
                    b63.o.INSTANCE.getClass();
                    p1Var2.setValue(b63.o.Companion.a(jLongValue / 86400000));
                }
                p1Var.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            case 2:
                ((i3) obj).getClass();
                if (((ge2.b) p1Var2.getF182175a()) != null) {
                    p1Var.setValue(Boolean.TRUE);
                }
                return Unit.INSTANCE;
            case 3:
                b82.t0.a aVar = (b82.t0.a) obj;
                aVar.getClass();
                int i15 = cw1.w.a.f56240a[aVar.ordinal()];
                if (i15 == 1) {
                    Boolean bool2 = Boolean.FALSE;
                    p1Var2.setValue(bool2);
                    p1Var.setValue(bool2);
                } else {
                    if (i15 != 2) {
                        lc.u0.r();
                        return null;
                    }
                    p1Var.setValue(Boolean.TRUE);
                }
                return Unit.INSTANCE;
            case 4:
                Double d14 = (Double) obj;
                p1Var2.setValue(Boolean.valueOf(p005kotlin.jvm.internal.s.c(d14, -1.0d)));
                if (!((Boolean) p1Var2.getF182175a()).booleanValue()) {
                    p1Var.setValue(d14);
                }
                return Unit.INSTANCE;
            case 5:
                String str = (String) obj;
                ew1.f1.a aVar2 = ew1.f1.f66451c;
                str.getClass();
                p1Var2.setValue(str);
                p1Var.setValue(Boolean.valueOf(str.length() > 0));
                return Unit.INSTANCE;
            case 6:
                m2.a aVar3 = m2.f66581d;
                p1Var2.setValue(Boolean.TRUE);
                p1Var.setValue((vt1.d) obj);
                return Unit.INSTANCE;
            case 7:
                ((p3.i0) obj).getClass();
                androidx.lifecycle.b0 f158016a = ((androidx.lifecycle.n0) p1Var2.getF182175a()).getF158016a();
                g02.f0 f0Var = new g02.f0(p1Var, 0);
                f158016a.a(f0Var);
                return new g02.g0.a(f158016a, f0Var);
            case 8:
                ((jf.d.c.b) obj).getClass();
                p1Var2.setValue(Boolean.TRUE);
                p1Var.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            case 9:
                x5.l0 l0Var = (x5.l0) obj;
                l0Var.getClass();
                p1Var.setValue(l0Var);
                p1Var2.setValue(l0Var.f188878a.f157138b);
                return Unit.INSTANCE;
            case 10:
                j23.f fVar = (j23.f) obj;
                fVar.getClass();
                int iFloatValue = (int) ((Number) fVar.getStart()).floatValue();
                Integer numValueOf = Integer.valueOf(iFloatValue);
                if (iFloatValue <= 0) {
                    numValueOf = null;
                }
                p1Var2.setValue(numValueOf);
                int iFloatValue2 = (int) ((Number) fVar.b()).floatValue();
                p1Var.setValue(iFloatValue2 < 1440 ? Integer.valueOf(iFloatValue2) : null);
                return Unit.INSTANCE;
            case 11:
                f5.c0 c0Var = (f5.c0) obj;
                c0Var.getClass();
                p1Var2.setValue(n4.c.a(f5.d0.e(c0Var)));
                p1Var.setValue(g6.m.a(c0Var.a()));
                return Unit.INSTANCE;
            case 12:
                GroupDTO.e eVar = (GroupDTO.e) obj;
                GroupSettingsPrivacyActivity.a aVar4 = GroupSettingsPrivacyActivity.f31458b;
                eVar.getClass();
                p1Var2.setValue(eVar);
                if (((GroupDTO.e) p1Var2.getF182175a()) == GroupDTO.e.HIDDEN) {
                    p1Var.setValue(GroupDTO.d.INVITE);
                }
                return Unit.INSTANCE;
            case 13:
                e2.f0 f0Var2 = (e2.f0) obj;
                f0Var2.getClass();
                jt1.a.f100804a.getClass();
                e2.f0.b(f0Var2, null, jt1.a.f100806c, 3);
                e2.f0.b(f0Var2, null, new z3.e(989347438, true, new eb0.a(p1Var2, 6)), 3);
                if (((us1.b) p1Var2.getF182175a()) == us1.b.OTHER) {
                    e2.f0.b(f0Var2, null, jt1.a.f100807d, 3);
                    e2.f0.b(f0Var2, null, new z3.e(-1818740663, true, new eb0.a(p1Var, 7)), 3);
                }
                return Unit.INSTANCE;
            case 14:
                Calendar calendar = (Calendar) obj;
                calendar.getClass();
                p1Var2.setValue(calendar);
                p1Var.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            case 15:
                Calendar calendar2 = (Calendar) obj;
                calendar2.getClass();
                p1Var2.setValue(calendar2);
                p1Var.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            case 16:
                l90.b bVar = (l90.b) obj;
                bVar.getClass();
                p1Var2.setValue(bVar);
                p1Var.setValue(Boolean.TRUE);
                return Unit.INSTANCE;
            case 17:
                p1Var2.setValue((n4.c) obj);
                p1Var.setValue(Boolean.TRUE);
                return Unit.INSTANCE;
            case 18:
                String str2 = (String) obj;
                int i16 = TestGoogleAgeSignalsActivity.f41746b;
                str2.getClass();
                p1Var2.setValue("");
                p1Var.setValue(str2);
                return Unit.INSTANCE;
            case 19:
                String str3 = (String) obj;
                int i17 = TestGoogleAgeSignalsActivity.f41746b;
                str3.getClass();
                p1Var2.setValue("");
                p1Var.setValue(str3);
                return Unit.INSTANCE;
            case 20:
                m4.g0 g0Var = (m4.g0) obj;
                g0Var.getClass();
                p1Var2.setValue(Boolean.valueOf(g0Var.a()));
                if (g0Var.a()) {
                    String str4 = ((x5.l0) p1Var.getF182175a()).f188878a.f157138b;
                    int length = ((x5.l0) p1Var.getF182175a()).f188878a.f157138b.length();
                    p1Var.setValue(new x5.l0(str4, og.a.l(length, length), (s5.w0) null, 4, (p005kotlin.jvm.internal.j) null));
                }
                return Unit.INSTANCE;
            case 21:
                Boolean bool3 = (Boolean) obj;
                if (bool3.booleanValue()) {
                    p1Var2.setValue(Boolean.FALSE);
                }
                p1Var.setValue(bool3);
                return Unit.INSTANCE;
            case 22:
                String str5 = (String) obj;
                str5.getClass();
                p1Var2.setValue(str5);
                p1Var.setValue(Boolean.valueOf(str5.length() > 0));
                return Unit.INSTANCE;
            case 23:
                i3 i3Var2 = (i3) obj;
                i3Var2.getClass();
                String str6 = i3Var2.f111063a;
                if (p005kotlin.jvm.internal.s.g(str6, "SEARCH")) {
                    p1Var2.setValue(Boolean.TRUE);
                } else if (p005kotlin.jvm.internal.s.g(str6, "FILTER")) {
                    p1Var.setValue(Boolean.TRUE);
                }
                return Unit.INSTANCE;
            case 24:
                qk0.d dVar = (qk0.d) obj;
                dVar.getClass();
                p1Var2.setValue(sk0.l0.b((sk0.l0) p1Var2.getF182175a(), null, null, null, i53.a.e(dVar.f145086a), false, null, null, 239));
                p1Var.setValue(dVar.f145087b);
                return Unit.INSTANCE;
            case 25:
                ArrayList arrayList = (ArrayList) obj;
                arrayList.getClass();
                p1Var2.setValue(sk0.l0.b((sk0.l0) p1Var2.getF182175a(), null, i53.a.e(arrayList), null, null, false, null, null, 251));
                if (p13.h0.L(arrayList)) {
                    p1Var.setValue(sk0.m0.b((sk0.m0) p1Var.getF182175a(), false, false, false, 3));
                }
                return Unit.INSTANCE;
            case 26:
                String str7 = (String) obj;
                str7.getClass();
                if (str7.length() > 250) {
                    p1Var2.setValue(sk0.m0.b((sk0.m0) p1Var2.getF182175a(), false, true, false, 4));
                } else if (((sk0.m0) p1Var2.getF182175a()).f159753b || ((sk0.m0) p1Var2.getF182175a()).f159752a) {
                    p1Var2.setValue(sk0.m0.b((sk0.m0) p1Var2.getF182175a(), false, false, false, 4));
                }
                p1Var.setValue(sk0.l0.b((sk0.l0) p1Var.getF182175a(), str7, null, null, null, false, null, null, 253));
                return Unit.INSTANCE;
            case 27:
                b63.o oVar = (b63.o) obj;
                if (oVar != null) {
                    p1Var2.setValue(sk0.l0.b((sk0.l0) p1Var2.getF182175a(), null, null, oVar, null, false, null, null, 247));
                }
                p1Var.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            case 28:
                qk0.d dVar2 = (qk0.d) obj;
                dVar2.getClass();
                p1Var2.setValue(sk0.n0.b((sk0.n0) p1Var2.getF182175a(), null, null, null, null, null, null, null, null, null, i53.a.e(dVar2.f145086a), false, null, null, 7679));
                p1Var.setValue(dVar2.f145087b);
                return Unit.INSTANCE;
            default:
                pk0.f fVar2 = (pk0.f) obj;
                fVar2.getClass();
                String str8 = fVar2.f138220a;
                if (str8 == null) {
                    string = null;
                } else {
                    if (d53.w.J(str8)) {
                        str8 = null;
                    }
                    if (str8 != null) {
                        string = d53.w.i0(str8).toString();
                    } else {
                        string = null;
                    }
                }
                String str9 = fVar2.f138221b;
                if (str9 != null) {
                    if (d53.w.J(str9)) {
                        str9 = null;
                    }
                    if (str9 != null) {
                        string2 = d53.w.i0(str9).toString();
                    }
                }
                String str10 = string2;
                boolean z15 = (string != null ? string.length() : 0) > 250;
                p1Var2.setValue(sk0.n0.b((sk0.n0) p1Var2.getF182175a(), null, string, str10, null, null, null, null, null, null, null, false, null, null, 8185));
                sk0.o0 o0Var = (sk0.o0) p1Var.getF182175a();
                if (string != null && !d53.w.J(string)) {
                    z14 = false;
                }
                p1Var.setValue(sk0.o0.b(o0Var, z14 ? ((sk0.o0) p1Var.getF182175a()).f159789a : false, z15, false, false, false, 28));
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ c1(p3.p1 p1Var, p3.p1 p1Var2, int i14) {
        this.f3886a = i14;
        this.f3887b = p1Var;
        this.f3888c = p1Var2;
    }
}

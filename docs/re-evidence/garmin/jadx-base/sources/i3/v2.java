package i3;

import com.garmin.android.apps.connectmobile.connections.groups.details.GroupSettingsPrivacyActivity;
import com.garmin.android.apps.connectmobile.connections.groups.services.model.GroupDTO;
import org.joda.time.DateTime;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class v2 implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f89982a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p3.p1 f89983b;

    public /* synthetic */ v2(p3.p1 p1Var, int i14) {
        this.f89982a = i14;
        this.f89983b = p1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.l
    public final Object invoke(Object obj) {
        int i14 = this.f89982a;
        p3.p1 p1Var = this.f89983b;
        switch (i14) {
            case 0:
                p5.k0 k0Var = (p5.k0) obj;
                if (!d53.w.J((CharSequence) p1Var.getF182175a())) {
                    String str = (String) p1Var.getF182175a();
                    k23.l<Object>[] lVarArr = p5.h0.f136016a;
                    p5.d0.f135959a.getClass();
                    k0Var.a(p5.d0.N, str);
                }
                return Unit.INSTANCE;
            case 1:
                float f14 = bi.f87631a;
                p1Var.setValue((x5.l0) obj);
                return Unit.INSTANCE;
            case 2:
                float f15 = bi.f87631a;
                p1Var.setValue((x5.l0) obj);
                return Unit.INSTANCE;
            case 3:
                p1Var.setValue((f5.c0) obj);
                return Unit.INSTANCE;
            case 4:
                n02.f fVar = (n02.f) obj;
                fVar.getClass();
                p1Var.setValue(fVar);
                return Unit.INSTANCE;
            case 5:
                p1Var.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            case 6:
                String str2 = (String) obj;
                str2.getClass();
                if (str2.length() == 0) {
                    str2 = null;
                }
                p1Var.setValue(str2);
                return Unit.INSTANCE;
            case 7:
                DateTime dateTime = (DateTime) obj;
                dateTime.getClass();
                p1Var.setValue(dateTime);
                return Unit.INSTANCE;
            case 8:
                DateTime dateTime2 = (DateTime) obj;
                dateTime2.getClass();
                p1Var.setValue(dateTime2);
                return Unit.INSTANCE;
            case 9:
                lv0.a aVar = (lv0.a) obj;
                aVar.getClass();
                p1Var.setValue(aVar);
                return Unit.INSTANCE;
            case 10:
                f5.c0 c0Var = (f5.c0) obj;
                c0Var.getClass();
                p1Var.setValue(n4.c.a(f5.d0.e(c0Var)));
                return Unit.INSTANCE;
            case 11:
                GroupDTO.d dVar = (GroupDTO.d) obj;
                GroupSettingsPrivacyActivity.a aVar2 = GroupSettingsPrivacyActivity.f31458b;
                dVar.getClass();
                p1Var.setValue(dVar);
                return Unit.INSTANCE;
            case 12:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                p1Var.setValue(bool);
                return Unit.INSTANCE;
            case 13:
                p1Var.setValue((cy0.e) obj);
                return Unit.INSTANCE;
            case 14:
                pc pcVar = (pc) obj;
                pcVar.getClass();
                return Boolean.valueOf(k11.m.h.f102246a[pcVar.ordinal()] == 1 ? ((Boolean) p1Var.getF182175a()).booleanValue() : true);
            case 15:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                p1Var.setValue(bool2);
                return Unit.INSTANCE;
            case 16:
                Boolean bool3 = (Boolean) obj;
                bool3.booleanValue();
                p1Var.setValue(bool3);
                return Unit.INSTANCE;
            case 17:
                Boolean bool4 = (Boolean) obj;
                bool4.booleanValue();
                p1Var.setValue(bool4);
                return Unit.INSTANCE;
            case 18:
                Boolean bool5 = (Boolean) obj;
                bool5.booleanValue();
                p1Var.setValue(bool5);
                return Unit.INSTANCE;
            case 19:
                Boolean bool6 = (Boolean) obj;
                bool6.booleanValue();
                p1Var.setValue(bool6);
                return Unit.INSTANCE;
            case 20:
                Boolean bool7 = (Boolean) obj;
                bool7.booleanValue();
                p1Var.setValue(bool7);
                return Unit.INSTANCE;
            case 21:
                s5.q0 q0Var = (s5.q0) obj;
                q0Var.getClass();
                p1Var.setValue(Boolean.valueOf(q0Var.e()));
                return Unit.INSTANCE;
            case 22:
                Boolean bool8 = (Boolean) obj;
                bool8.booleanValue();
                p1Var.setValue(bool8);
                return Unit.INSTANCE;
            case 23:
                Boolean bool9 = (Boolean) obj;
                bool9.booleanValue();
                p1Var.setValue(bool9);
                return Unit.INSTANCE;
            case 24:
                Boolean bool10 = (Boolean) obj;
                bool10.booleanValue();
                p1Var.setValue(bool10);
                return Unit.INSTANCE;
            case 25:
                f.a aVar3 = (f.a) obj;
                aVar3.getClass();
                if (aVar3.f67585a == -1) {
                    p1Var.setValue(Boolean.TRUE);
                }
                return Unit.INSTANCE;
            case 26:
                jf.d.c cVar = (jf.d.c) obj;
                cVar.getClass();
                p1Var.setValue(Boolean.valueOf(!(cVar instanceof jf.d.c.b)));
                return Unit.INSTANCE;
            case 27:
                f5.c0 c0Var2 = (f5.c0) obj;
                c0Var2.getClass();
                p1Var.setValue(n4.g.a(g6.n.c(c0Var2.a())));
                return Unit.INSTANCE;
            case 28:
                f5.c0 c0Var3 = (f5.c0) obj;
                c0Var3.getClass();
                p1Var.setValue(n4.g.a(g6.n.c(c0Var3.a())));
                return Unit.INSTANCE;
            default:
                com.garmin.android.library.mapsdkadapter.i.d dVar2 = (com.garmin.android.library.mapsdkadapter.i.d) obj;
                dVar2.getClass();
                p1Var.setValue(dVar2);
                return Unit.INSTANCE;
        }
    }
}

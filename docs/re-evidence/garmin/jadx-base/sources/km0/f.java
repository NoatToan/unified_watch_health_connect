package km0;

import com.garmin.android.apps.connectmobile.connections.groups.services.model.GroupDTO;
import d53.w;
import java.util.Set;
import p005kotlin.Unit;
import p13.c1;
import r53.p2;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class f implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f105323a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f105324b;

    public /* synthetic */ f(i iVar, int i14) {
        this.f105323a = i14;
        this.f105324b = iVar;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        Object value;
        Object value2;
        Object value3;
        Object value4;
        Object value5;
        Object value6;
        Object value7;
        Object value8;
        Object value9;
        Object value10;
        Object value11;
        switch (this.f105323a) {
            case 0:
                Long l14 = (Long) obj;
                l14.longValue();
                p2 p2Var = this.f105324b.f105342i;
                do {
                    value = p2Var.getValue();
                } while (!p2Var.b(value, c1.i((Set) value, l14)));
                break;
            case 1:
                String str = (String) obj;
                p2 p2Var2 = this.f105324b.f105337d;
                do {
                    value2 = p2Var2.getValue();
                } while (!p2Var2.b(value2, b.a((b) value2, null, null, null, null, null, str, null, null, null, null, null, 2015)));
                break;
            case 2:
                String str2 = (String) obj;
                p2 p2Var3 = this.f105324b.f105337d;
                do {
                    value3 = p2Var3.getValue();
                } while (!p2Var3.b(value3, b.a((b) value3, null, null, null, null, null, null, str2, null, null, null, null, 1983)));
                break;
            case 3:
                com.garmin.android.apps.connectmobile.connections.groups.services.model.e eVar = (com.garmin.android.apps.connectmobile.connections.groups.services.model.e) obj;
                eVar.getClass();
                this.f105324b.x4(eVar);
                break;
            case 4:
                com.garmin.android.apps.connectmobile.connections.groups.services.model.e eVar2 = (com.garmin.android.apps.connectmobile.connections.groups.services.model.e) obj;
                eVar2.getClass();
                this.f105324b.y4(eVar2);
                break;
            case 5:
                String str3 = (String) obj;
                i iVar = this.f105324b;
                p2 p2Var4 = iVar.f105337d;
                do {
                    value4 = p2Var4.getValue();
                } while (!p2Var4.b(value4, b.a((b) value4, null, null, null, null, null, null, null, null, null, null, str3, 1023)));
                if (str3 == null || w.J(str3)) {
                    iVar.y4(com.garmin.android.apps.connectmobile.connections.groups.services.model.e.ACT_OTHER);
                } else {
                    iVar.x4(com.garmin.android.apps.connectmobile.connections.groups.services.model.e.ACT_OTHER);
                }
                break;
            case 6:
                Long l15 = (Long) obj;
                l15.longValue();
                p2 p2Var5 = this.f105324b.f105342i;
                do {
                    value5 = p2Var5.getValue();
                } while (!p2Var5.b(value5, c1.f((Set) value5, l15)));
                break;
            case 7:
                GroupDTO.e eVar3 = (GroupDTO.e) obj;
                eVar3.getClass();
                i iVar2 = this.f105324b;
                iVar2.getClass();
                p2 p2Var6 = iVar2.f105337d;
                do {
                    value6 = p2Var6.getValue();
                } while (!p2Var6.b(value6, b.a((b) value6, null, null, null, null, null, null, null, eVar3, null, null, null, 1919)));
                if (eVar3 == GroupDTO.e.HIDDEN) {
                    iVar2.z4(GroupDTO.d.INVITE);
                }
                break;
            case 8:
                GroupDTO.d dVar = (GroupDTO.d) obj;
                dVar.getClass();
                this.f105324b.z4(dVar);
                break;
            case 9:
                String str4 = (String) obj;
                str4.getClass();
                i iVar3 = this.f105324b;
                iVar3.getClass();
                p2 p2Var7 = iVar3.f105337d;
                do {
                    value7 = p2Var7.getValue();
                } while (!p2Var7.b(value7, b.a((b) value7, str4, null, null, null, null, null, null, null, null, null, null, 2046)));
                break;
            case 10:
                e eVar4 = (e) obj;
                eVar4.getClass();
                i iVar4 = this.f105324b;
                iVar4.getClass();
                p2 p2Var8 = iVar4.f105337d;
                do {
                    value8 = p2Var8.getValue();
                } while (!p2Var8.b(value8, b.a((b) value8, null, eVar4, null, null, null, null, null, null, null, null, null, 2045)));
                break;
            case 11:
                String str5 = (String) obj;
                p2 p2Var9 = this.f105324b.f105337d;
                do {
                    value9 = p2Var9.getValue();
                } while (!p2Var9.b(value9, b.a((b) value9, null, null, str5, null, null, null, null, null, null, null, null, 2043)));
                break;
            case 12:
                String str6 = (String) obj;
                p2 p2Var10 = this.f105324b.f105337d;
                do {
                    value10 = p2Var10.getValue();
                } while (!p2Var10.b(value10, b.a((b) value10, null, null, null, str6, null, null, null, null, null, null, null, 2039)));
                break;
            default:
                String str7 = (String) obj;
                p2 p2Var11 = this.f105324b.f105337d;
                do {
                    value11 = p2Var11.getValue();
                } while (!p2Var11.b(value11, b.a((b) value11, null, null, null, null, str7, null, null, null, null, null, null, 2031)));
                break;
        }
        return Unit.INSTANCE;
    }
}

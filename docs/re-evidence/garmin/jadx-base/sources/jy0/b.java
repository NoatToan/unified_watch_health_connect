package jy0;

import am.x0;
import com.garmin.android.apps.connectmobile.activities.model.ActivityListItemDTO;
import java.io.File;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class b implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f101677a;

    public /* synthetic */ b(int i14) {
        this.f101677a = i14;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        switch (this.f101677a) {
            case 0:
                c cVar = c.f101678a;
                return Unit.INSTANCE;
            case 1:
                ((Boolean) obj).booleanValue();
                e eVar = e.f101684a;
                return Unit.INSTANCE;
            case 2:
                f fVar = f.f101690a;
                ((x0) obj).getClass();
                return Unit.INSTANCE;
            case 3:
                f fVar2 = f.f101690a;
                ((x0) obj).getClass();
                return Unit.INSTANCE;
            case 4:
                ((Boolean) obj).booleanValue();
                f fVar3 = f.f101690a;
                return Unit.INSTANCE;
            case 5:
                f fVar4 = f.f101690a;
                ((ActivityListItemDTO) obj).getClass();
                return Unit.INSTANCE;
            case 6:
                x0 x0Var = (x0) obj;
                x0Var.getClass();
                return x0Var.f4358a;
            case 7:
                ActivityListItemDTO activityListItemDTO = (ActivityListItemDTO) obj;
                activityListItemDTO.getClass();
                return Long.valueOf(activityListItemDTO.f29250b);
            case 8:
                k11.b bVar = k11.b.f102183a;
                ((String) obj).getClass();
                return Unit.INSTANCE;
            case 9:
                k11.b bVar2 = k11.b.f102183a;
                ((String) obj).getClass();
                return Unit.INSTANCE;
            case 10:
                ((Boolean) obj).booleanValue();
                return Unit.INSTANCE;
            case 11:
                ((b63.v) obj).getClass();
                return Unit.INSTANCE;
            case 12:
                ((b11.l) obj).getClass();
                return Unit.INSTANCE;
            case 13:
                ((Double) obj).doubleValue();
                return Unit.INSTANCE;
            case 14:
                ((a11.r) obj).getClass();
                return Unit.INSTANCE;
            case 15:
                return new k3.g((k3.h) obj);
            case 16:
                oi0.b bVar3 = (oi0.b) obj;
                int i14 = k32.s.f102728f;
                bVar3.getClass();
                bVar3.M();
                return Unit.INSTANCE;
            case 17:
                oi0.b bVar4 = (oi0.b) obj;
                int i15 = k32.s.f102728f;
                bVar4.getClass();
                bVar4.M();
                return Unit.INSTANCE;
            case 18:
                oi0.b bVar5 = (oi0.b) obj;
                int i16 = k32.u.f102736h;
                bVar5.getClass();
                bVar5.M();
                return Unit.INSTANCE;
            case 19:
                oi0.b bVar6 = (oi0.b) obj;
                int i17 = k32.u.f102736h;
                bVar6.getClass();
                bVar6.M();
                return Unit.INSTANCE;
            case 20:
                oi0.b bVar7 = (oi0.b) obj;
                k51.a aVar = k51.a.f102935a;
                bVar7.getClass();
                bVar7.B();
                bVar7.s();
                return Unit.INSTANCE;
            case 21:
                oi0.b bVar8 = (oi0.b) obj;
                k51.a aVar2 = k51.a.f102935a;
                bVar8.getClass();
                bVar8.B();
                bVar8.s();
                return Unit.INSTANCE;
            case 22:
                oi0.b bVar9 = (oi0.b) obj;
                k51.a aVar3 = k51.a.f102935a;
                bVar9.getClass();
                bVar9.B();
                bVar9.s();
                return Unit.INSTANCE;
            case 23:
                oi0.b bVar10 = (oi0.b) obj;
                k51.a aVar4 = k51.a.f102935a;
                bVar10.getClass();
                bVar10.B();
                bVar10.s();
                return Unit.INSTANCE;
            case 24:
                oi0.b bVar11 = (oi0.b) obj;
                k51.a aVar5 = k51.a.f102935a;
                bVar11.getClass();
                bVar11.y();
                bVar11.g();
                return Unit.INSTANCE;
            case 25:
                File file = (File) obj;
                int i18 = k80.a.f103330g;
                file.getClass();
                return Boolean.valueOf(file.isFile() && !p005kotlin.jvm.internal.s.g(file.getName(), "tutorials.zip"));
            case 26:
                k80.n nVar = (k80.n) obj;
                int i19 = k80.a.f103330g;
                nVar.getClass();
                File parentFile = nVar.f103372b.getParentFile();
                if (parentFile != null && !parentFile.exists()) {
                    parentFile.mkdirs();
                }
                return nVar;
            case 27:
                k80.n nVar2 = (k80.n) obj;
                int i24 = k80.a.f103330g;
                nVar2.getClass();
                return Boolean.valueOf(!nVar2.f103371a.isDirectory());
            case 28:
                String str = (String) obj;
                str.getClass();
                return str;
            default:
                ka0.i iVar = ka0.i.f103747a;
                ((la0.b) obj).getClass();
                return Unit.INSTANCE;
        }
    }
}

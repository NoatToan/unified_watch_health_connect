package j10;

import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.connections.groups.details.GroupSettingsActivitiesActivity;
import f4.w;
import gl1.y;
import p005kotlin.Unit;
import p3.p1;
import p3.x1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class e implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f96366a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ GroupSettingsActivitiesActivity f96367b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ w f96368c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p1 f96369d;

    public /* synthetic */ e(GroupSettingsActivitiesActivity groupSettingsActivitiesActivity, w wVar, p1 p1Var, int i14) {
        this.f96366a = i14;
        this.f96367b = groupSettingsActivitiesActivity;
        this.f96368c = wVar;
        this.f96369d = p1Var;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0046  */
    /* JADX WARN: Code duplicated, block: B:28:0x00b3  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f96366a;
        p3.m.a aVar = p3.m.f135153a;
        final p1 p1Var = this.f96369d;
        final w wVar = this.f96368c;
        final GroupSettingsActivitiesActivity groupSettingsActivitiesActivity = this.f96367b;
        Object[] objArr = 0;
        final int i15 = 1;
        p3.m mVar = (p3.m) obj;
        switch (i14) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                GroupSettingsActivitiesActivity.a aVar2 = GroupSettingsActivitiesActivity.f31417b;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    z02.d.a(false, z3.f.c(1525431004, new e(groupSettingsActivitiesActivity, wVar, p1Var, i15), mVar), null, null, null, z3.f.c(1405615584, new i20.b(13, wVar, p1Var), mVar), mVar, 196656, 29);
                    boolean zR = mVar.r(groupSettingsActivitiesActivity);
                    Object objQ = mVar.q();
                    if (zR) {
                        final Object[] objArr2 = objArr == true ? 1 : 0;
                        objQ = new e23.a() { // from class: j10.f
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // e23.a
                            public final Object invoke() {
                                int i16 = objArr2;
                                p1 p1Var2 = p1Var;
                                w wVar2 = wVar;
                                GroupSettingsActivitiesActivity groupSettingsActivitiesActivity2 = groupSettingsActivitiesActivity;
                                switch (i16) {
                                    case 0:
                                        GroupSettingsActivitiesActivity.a aVar3 = GroupSettingsActivitiesActivity.f31417b;
                                        groupSettingsActivitiesActivity2.da((String) p1Var2.getF182175a(), wVar2);
                                        break;
                                    default:
                                        GroupSettingsActivitiesActivity.a aVar4 = GroupSettingsActivitiesActivity.f31417b;
                                        groupSettingsActivitiesActivity2.da((String) p1Var2.getF182175a(), wVar2);
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar.K(objQ);
                    } else {
                        aVar.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            final int objArr3 = objArr == true ? 1 : 0;
                            objQ = new e23.a() { // from class: j10.f
                                /* JADX WARN: Multi-variable type inference failed */
                                @Override // e23.a
                                public final Object invoke() {
                                    int i16 = objArr3;
                                    p1 p1Var2 = p1Var;
                                    w wVar2 = wVar;
                                    GroupSettingsActivitiesActivity groupSettingsActivitiesActivity2 = groupSettingsActivitiesActivity;
                                    switch (i16) {
                                        case 0:
                                            GroupSettingsActivitiesActivity.a aVar3 = GroupSettingsActivitiesActivity.f31417b;
                                            groupSettingsActivitiesActivity2.da((String) p1Var2.getF182175a(), wVar2);
                                            break;
                                        default:
                                            GroupSettingsActivitiesActivity.a aVar4 = GroupSettingsActivitiesActivity.f31417b;
                                            groupSettingsActivitiesActivity2.da((String) p1Var2.getF182175a(), wVar2);
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar.K(objQ);
                        }
                    }
                    c.w.a(0, 1, (e23.a) objQ, mVar, false);
                } else {
                    mVar.e();
                }
                break;
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                GroupSettingsActivitiesActivity.a aVar3 = GroupSettingsActivitiesActivity.f31417b;
                if (mVar.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    String strQ = y.Q(mVar, R.string.lbl_group_activities_title);
                    boolean zR2 = mVar.r(groupSettingsActivitiesActivity);
                    Object objQ2 = mVar.q();
                    if (zR2) {
                        objQ2 = new e23.a() { // from class: j10.f
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // e23.a
                            public final Object invoke() {
                                int i16 = i15;
                                p1 p1Var2 = p1Var;
                                w wVar2 = wVar;
                                GroupSettingsActivitiesActivity groupSettingsActivitiesActivity2 = groupSettingsActivitiesActivity;
                                switch (i16) {
                                    case 0:
                                        GroupSettingsActivitiesActivity.a aVar4 = GroupSettingsActivitiesActivity.f31417b;
                                        groupSettingsActivitiesActivity2.da((String) p1Var2.getF182175a(), wVar2);
                                        break;
                                    default:
                                        GroupSettingsActivitiesActivity.a aVar5 = GroupSettingsActivitiesActivity.f31417b;
                                        groupSettingsActivitiesActivity2.da((String) p1Var2.getF182175a(), wVar2);
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar.K(objQ2);
                    } else {
                        aVar.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            objQ2 = new e23.a() { // from class: j10.f
                                /* JADX WARN: Multi-variable type inference failed */
                                @Override // e23.a
                                public final Object invoke() {
                                    int i16 = i15;
                                    p1 p1Var2 = p1Var;
                                    w wVar2 = wVar;
                                    GroupSettingsActivitiesActivity groupSettingsActivitiesActivity2 = groupSettingsActivitiesActivity;
                                    switch (i16) {
                                        case 0:
                                            GroupSettingsActivitiesActivity.a aVar4 = GroupSettingsActivitiesActivity.f31417b;
                                            groupSettingsActivitiesActivity2.da((String) p1Var2.getF182175a(), wVar2);
                                            break;
                                        default:
                                            GroupSettingsActivitiesActivity.a aVar5 = GroupSettingsActivitiesActivity.f31417b;
                                            groupSettingsActivitiesActivity2.da((String) p1Var2.getF182175a(), wVar2);
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar.K(objQ2);
                        }
                    }
                    z02.f.c(0, 54, null, (e23.a) objQ2, null, strQ, mVar, null);
                } else {
                    mVar.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}

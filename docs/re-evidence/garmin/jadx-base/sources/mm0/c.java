package mm0;

import com.garmin.android.apps.connectmobile.group.details.GroupDetailActivity;
import p005kotlin.Unit;
import p3.x1;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class c implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f119499a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ GroupDetailActivity.b f119500b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ GroupDetailActivity f119501c;

    public /* synthetic */ c(GroupDetailActivity.b bVar, GroupDetailActivity groupDetailActivity, int i14) {
        this.f119499a = i14;
        this.f119500b = bVar;
        this.f119501c = groupDetailActivity;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f119499a;
        GroupDetailActivity groupDetailActivity = this.f119501c;
        GroupDetailActivity.b bVar = this.f119500b;
        Object[] objArr = 0;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                GroupDetailActivity.a aVar = GroupDetailActivity.f36137j;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    u4.d dVar = bVar.f36147a;
                    String string = groupDetailActivity.getString(bVar.f36148b);
                    String string2 = groupDetailActivity.getString(bVar.f36149c);
                    string2.getClass();
                    b82.n.c(dVar, string, string2, null, null, mVar, 0, 24);
                } else {
                    mVar.e();
                }
                break;
            default:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                GroupDetailActivity.a aVar2 = GroupDetailActivity.f36137j;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    z02.b.a(false, null, null, null, false, z3.f.c(-623555848, new c(bVar, groupDetailActivity, objArr == true ? 1 : 0), mVar2), mVar2, 196608, 31);
                } else {
                    mVar2.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}

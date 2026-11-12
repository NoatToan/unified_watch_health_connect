package xn2;

import com.garmin.android.apps.connectmobile.R;
import java.util.ArrayList;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class b implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f191684a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f191685b;

    public /* synthetic */ b(e eVar, int i14) {
        this.f191684a = i14;
        this.f191685b = eVar;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        int i14 = this.f191684a;
        e eVar = this.f191685b;
        switch (i14) {
            case 0:
                e.a aVar = e.f191693i;
                eVar.z6();
                break;
            case 1:
                e.a aVar2 = e.f191693i;
                eVar.z6();
                break;
            case 2:
                e.a aVar3 = e.f191693i;
                eVar.z6();
                break;
            default:
                androidx.appcompat.app.e.a aVar4 = (androidx.appcompat.app.e.a) obj;
                e.a aVar5 = e.f191693i;
                aVar4.getClass();
                pn2.u[] uVarArrValues = pn2.u.values();
                pn2.u uVar = eVar.f191700g;
                if (uVar == null) {
                    uVar = pn2.u.MALE;
                }
                int iM = p13.u.M(uVarArrValues, uVar);
                ArrayList arrayList = new ArrayList(uVarArrValues.length);
                for (pn2.u uVar2 : uVarArrValues) {
                    arrayList.add(eVar.getString(uVar2.f138812b));
                }
                aVar4.setSingleChoiceItems((CharSequence[]) arrayList.toArray(new String[0]), iM, new wq.c(7, eVar, uVarArrValues));
                aVar4.setPositiveButton(R.string.lbl_done, new xk1.v(2));
                aVar4.setCancelable(false);
                break;
        }
        return Unit.INSTANCE;
    }
}

package c2;

import android.content.Context;
import com.garmin.android.apps.connectmobile.R;
import i3.pb;
import i3.qb;
import i3.vb;
import java.util.ArrayList;
import java.util.List;
import p005kotlin.Unit;
import p3.x3;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class r implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22848a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f22849b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f22850c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f22851d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f22852e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f22853f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f22854g;

    public /* synthetic */ r(int i14, String str, int i15, e23.l lVar, yn2.b bVar, String str2) {
        this.f22848a = 5;
        this.f22849b = i14;
        this.f22852e = str;
        this.f22850c = i15;
        this.f22853f = lVar;
        this.f22851d = bVar;
        this.f22854g = str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v4, types: [c2.f0] */
    @Override // e23.l
    public final Object invoke(Object obj) {
        ?? r14;
        int iA;
        f0 f0Var;
        int i14 = this.f22848a;
        p2 p2Var = null;
        int i15 = 0;
        int i16 = this.f22850c;
        int iIntValue = this.f22849b;
        Object obj2 = this.f22854g;
        Object obj3 = this.f22851d;
        Object obj4 = this.f22853f;
        Object obj5 = this.f22852e;
        switch (i14) {
            case 0:
                q.b((f5.v1.a) obj, (f5.v1) obj5, (f5.y0) obj4, ((f5.b1) obj3).getF68910b(), this.f22849b, this.f22850c, ((s) obj2).f22864a);
                return Unit.INSTANCE;
            case 1:
                f5.v1[] v1VarArr = (f5.v1[]) obj5;
                z zVar = (z) obj4;
                f5.b1 b1Var = (f5.b1) obj3;
                int[] iArr = (int[]) obj2;
                f5.v1.a aVar = (f5.v1.a) obj;
                int length = v1VarArr.length;
                int i17 = 0;
                while (i15 < length) {
                    f5.v1 v1Var = v1VarArr[i15];
                    int i18 = i17 + 1;
                    v1Var.getClass();
                    Object objE = v1Var.getF81969t();
                    p2 p2Var2 = objE instanceof p2 ? (p2) objE : p2Var;
                    g6.o f69049a = b1Var.getF68910b();
                    if (p2Var2 != null) {
                        f0Var = p2Var2.f22813c;
                    } else {
                        r14 = p2Var;
                    }
                    if (r14 != 0) {
                        r14 = f0Var;
                        iA = r14.a(iIntValue, f69049a, v1Var, i16);
                    } else {
                        r14 = f0Var;
                        iA = zVar.f22960b.a(v1Var.f69144a, iIntValue, f69049a);
                    }
                    aVar.r(v1Var, iA, iArr[i17], 0.0f);
                    i15++;
                    i17 = i18;
                    p2Var = null;
                }
                return Unit.INSTANCE;
            case 2:
                ((p3.i0) obj).getClass();
                ge1.b.T((o53.b0) obj5, null, null, new ct1.i((e2.i0) obj4, iIntValue, i16, null), 3);
                return new ct1.j((e23.l) obj3, (x3) obj2);
            case 3:
                ArrayList arrayList = (ArrayList) obj5;
                f5.b1 b1Var2 = (f5.b1) obj3;
                pb pbVar = (pb) obj4;
                ArrayList arrayList2 = (ArrayList) obj2;
                f5.v1.a aVar2 = (f5.v1.a) obj;
                int size = arrayList.size();
                for (int i19 = 0; i19 < size; i19++) {
                    f5.v1 v1Var2 = (f5.v1) arrayList.get(i19);
                    aVar2.r(v1Var2, 0, (i16 - v1Var2.f69145b) / 2, 0.0f);
                }
                qb.f89432a.getClass();
                int iF0 = b1Var2.f0(vb.f90008a) + b1Var2.f0(qb.f89434c);
                s1.b<Integer, s1.n> bVar = pbVar.f89305c;
                if (bVar != null) {
                    iIntValue = bVar.e().intValue();
                }
                int i24 = iF0 + iIntValue;
                int size2 = arrayList2.size();
                while (i15 < size2) {
                    f5.v1 v1Var3 = (f5.v1) arrayList2.get(i15);
                    aVar2.r(v1Var3, i24, (i16 - v1Var3.f69145b) / 2, 0.0f);
                    i15++;
                }
                return Unit.INSTANCE;
            case 4:
                ov1.p pVar = (ov1.p) obj5;
                p3.p1 p1Var = (p3.p1) obj4;
                List list = (List) obj;
                ov1.p.a aVar3 = ov1.p.f134204c;
                list.getClass();
                p1Var.setValue(new ArrayList(list));
                Context contextRequireContext = pVar.requireContext();
                contextRequireContext.getClass();
                o13.p<String, Boolean> pVarW6 = pVar.w6(contextRequireContext, (List) p1Var.getF182175a(), iIntValue, i16);
                String str = pVarW6.f128594a;
                Boolean bool = pVarW6.f128595b;
                bool.getClass();
                ((p3.p1) obj3).setValue(str);
                ((p3.p1) obj2).setValue(bool);
                return Unit.INSTANCE;
            default:
                e23.l lVar = (e23.l) obj4;
                androidx.appcompat.app.e.a aVar4 = (androidx.appcompat.app.e.a) obj;
                int i25 = yn2.b.G0;
                aVar4.getClass();
                aVar4.setTitle(iIntValue);
                aVar4.setMessage((String) obj5);
                aVar4.setCancelable(false);
                aVar4.setPositiveButton(R.string.wallet_call, new yn2.a(lVar, i15, (yn2.b) obj3, (String) obj2));
                aVar4.setNegativeButton(i16, new com.garmin.android.apps.connectmobile.gfdi.protobuf.e(lVar, 21));
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ r(int i14, int i15, int i16, Object obj, Object obj2, Object obj3, Object obj4) {
        this.f22848a = i16;
        this.f22852e = obj;
        this.f22853f = obj2;
        this.f22849b = i14;
        this.f22850c = i15;
        this.f22851d = obj3;
        this.f22854g = obj4;
    }

    public /* synthetic */ r(f5.v1 v1Var, f5.y0 y0Var, f5.b1 b1Var, int i14, int i15, s sVar) {
        this.f22848a = 0;
        this.f22852e = v1Var;
        this.f22853f = y0Var;
        this.f22851d = b1Var;
        this.f22849b = i14;
        this.f22850c = i15;
        this.f22854g = sVar;
    }

    public /* synthetic */ r(ArrayList arrayList, f5.b1 b1Var, pb pbVar, int i14, ArrayList arrayList2, int i15) {
        this.f22848a = 3;
        this.f22852e = arrayList;
        this.f22851d = b1Var;
        this.f22853f = pbVar;
        this.f22849b = i14;
        this.f22854g = arrayList2;
        this.f22850c = i15;
    }

    public /* synthetic */ r(ov1.p pVar, int i14, int i15, p3.p1 p1Var, p3.p1 p1Var2, p3.p1 p1Var3) {
        this.f22848a = 4;
        this.f22852e = pVar;
        this.f22849b = i14;
        this.f22850c = i15;
        this.f22853f = p1Var;
        this.f22851d = p1Var2;
        this.f22854g = p1Var3;
    }
}

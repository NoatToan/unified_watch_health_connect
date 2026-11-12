package ap;

import androidx.lifecycle.v1;
import androidx.lifecycle.w0;
import java.util.List;
import java.util.Map;
import o53.s0;
import p005kotlin.Unit;
import p13.j0;
import ps.d1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class c implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11584a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f11585b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f11586c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ w0 f11587d;

    public /* synthetic */ c(int i14, d dVar, w0 w0Var, int i15) {
        this.f11584a = i15;
        this.f11586c = i14;
        this.f11585b = dVar;
        this.f11587d = w0Var;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        switch (this.f11584a) {
            case 0:
                List list = (List) obj;
                int i14 = d.f11588o;
                if (list != null) {
                    int size = list.size();
                    int i15 = this.f11586c;
                    if (i15 < size) {
                        d dVar = this.f11585b;
                        int iIntValue = ((Number) dVar.f11595g.getOrDefault(Integer.valueOf(i15), 0)).intValue();
                        w9.a aVarA = v1.a(dVar);
                        x53.c cVar = s0.f129406a;
                        ge1.b.T(aVarA, x53.b.f189152a, null, new j(list, i15, dVar, iIntValue, this.f11587d, null), 2);
                    }
                }
                break;
            case 1:
                Map map = (Map) obj;
                d dVar2 = this.f11585b;
                List<d1> listD = dVar2.f11593e.f198239i.d();
                if (listD == null) {
                    listD = j0.f134944a;
                }
                List<d1> list2 = listD;
                if (map != null) {
                    int size2 = list2.size();
                    int i16 = this.f11586c;
                    if (i16 < size2) {
                        int iIntValue2 = ((Number) dVar2.f11595g.getOrDefault(Integer.valueOf(i16), 0)).intValue();
                        w9.a aVarA2 = v1.a(dVar2);
                        x53.c cVar2 = s0.f129406a;
                        ge1.b.T(aVarA2, x53.b.f189152a, null, new j(list2, i16, dVar2, iIntValue2, this.f11587d, null), 2);
                    }
                }
                break;
            case 2:
                List list3 = (List) obj;
                int i17 = d.f11588o;
                if (list3 != null) {
                    int size3 = list3.size();
                    int i18 = this.f11586c;
                    if (i18 < size3) {
                        d dVar3 = this.f11585b;
                        int iIntValue3 = ((Number) dVar3.f11595g.getOrDefault(Integer.valueOf(i18), 0)).intValue();
                        w9.a aVarA3 = v1.a(dVar3);
                        x53.c cVar3 = s0.f129406a;
                        ge1.b.T(aVarA3, x53.b.f189152a, null, new i(list3, i18, dVar3, iIntValue3, this.f11587d, null), 2);
                    }
                }
                break;
            default:
                Map map2 = (Map) obj;
                d dVar4 = this.f11585b;
                List<d1> listD2 = dVar4.f11593e.f198239i.d();
                if (listD2 == null) {
                    listD2 = j0.f134944a;
                }
                List<d1> list4 = listD2;
                if (map2 != null) {
                    int size4 = list4.size();
                    int i19 = this.f11586c;
                    if (i19 < size4) {
                        int iIntValue4 = ((Number) dVar4.f11595g.getOrDefault(Integer.valueOf(i19), 0)).intValue();
                        w9.a aVarA4 = v1.a(dVar4);
                        x53.c cVar4 = s0.f129406a;
                        ge1.b.T(aVarA4, x53.b.f189152a, null, new i(list4, i19, dVar4, iIntValue4, this.f11587d, null), 2);
                    }
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ c(d dVar, int i14, w0 w0Var, int i15) {
        this.f11584a = i15;
        this.f11585b = dVar;
        this.f11586c = i14;
        this.f11587d = w0Var;
    }
}

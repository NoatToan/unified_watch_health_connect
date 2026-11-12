package ad;

import j23.l;
import java.util.List;
import lc.u0;
import p005kotlin.Metadata;
import p13.h0;
import p13.x;
import v13.c;
import yc.h3;
import yc.i3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010 \n\u0002\b\u0004\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u0003B\u0015\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lad/a;", "", "Value", "Lyc/h3;", "", "", "dataList", "<init>", "(Ljava/util/List;)V", "paging-testing_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class a<Value> extends h3<Integer, Value> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<Value> f2713b;

    /* JADX WARN: Multi-variable type inference failed */
    public a(List<? extends Value> list) {
        list.getClass();
        this.f2713b = list;
    }

    @Override // yc.h3
    public final Integer c(i3 i3Var) {
        Integer num = i3Var.f196062b;
        if (num == null) {
            return null;
        }
        int iIntValue = num.intValue() - (i3Var.f196063c.f196513d / 2);
        if (iIntValue < 0) {
            iIntValue = 0;
        }
        return Integer.valueOf(iIntValue);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0031  */
    @Override // yc.h3
    public final Object e(h3.a aVar, c cVar) {
        int size;
        Object objA = aVar.a();
        int i14 = aVar.f196007a;
        Integer num = (Integer) objA;
        int iIntValue = num != null ? num.intValue() : 0;
        boolean z14 = aVar instanceof h3.a.c;
        List<Value> list = this.f2713b;
        if (z14) {
            size = (iIntValue - i14) + 1;
        } else if (aVar instanceof h3.a.C3655a) {
            size = iIntValue;
        } else {
            if (!(aVar instanceof h3.a.d)) {
                u0.r();
                return null;
            }
            if (iIntValue >= x.j(list)) {
                size = list.size() - i14;
            } else {
                size = iIntValue;
            }
        }
        int i15 = size < 0 ? 0 : size;
        int i16 = (i14 + i15) - 1;
        if (!z14 ? i16 <= (iIntValue = x.j(list)) : i16 <= iIntValue) {
            iIntValue = i16;
        }
        List listL0 = h0.L0(list, new l(i15, iIntValue));
        return new h3.b.c(listL0, (i15 <= 0 || listL0.isEmpty()) ? null : new Integer(i15 - 1), (iIntValue >= list.size() + (-1) || listL0.isEmpty()) ? null : new Integer(iIntValue + 1), i15, (list.size() - 1) - iIntValue);
    }
}

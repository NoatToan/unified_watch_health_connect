package i3;

import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l4 implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f88826a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ bc f88827b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Locale f88828c;

    public /* synthetic */ l4(bc bcVar, Locale locale, int i14) {
        this.f88826a = i14;
        this.f88827b = bcVar;
        this.f88828c = locale;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        switch (this.f88826a) {
            case 0:
                List list = (List) obj;
                Long l14 = (Long) list.get(0);
                Long l15 = (Long) list.get(1);
                Object obj2 = list.get(2);
                obj2.getClass();
                int iIntValue = ((Integer) obj2).intValue();
                Object obj3 = list.get(3);
                obj3.getClass();
                j23.l lVar = new j23.l(iIntValue, ((Integer) obj3).intValue());
                Object obj4 = list.get(4);
                obj4.getClass();
                int iIntValue2 = ((Integer) obj4).intValue();
                q5.a aVar = q5.f89410b;
                return new m4(l14, l15, lVar, iIntValue2, this.f88827b, this.f88828c, null);
            default:
                List list2 = (List) obj;
                Long l16 = (Long) list2.get(0);
                Long l17 = (Long) list2.get(1);
                Long l18 = (Long) list2.get(2);
                Object obj5 = list2.get(3);
                obj5.getClass();
                int iIntValue3 = ((Integer) obj5).intValue();
                Object obj6 = list2.get(4);
                obj6.getClass();
                j23.l lVar2 = new j23.l(iIntValue3, ((Integer) obj6).intValue());
                Object obj7 = list2.get(5);
                obj7.getClass();
                int iIntValue4 = ((Integer) obj7).intValue();
                q5.a aVar2 = q5.f89410b;
                return new d5(l16, l17, l18, lVar2, iIntValue4, this.f88827b, this.f88828c, null);
        }
    }
}

package wr1;

import android.net.Uri;
import com.garmin.android.apps.connectmobile.R;
import d53.s;
import e23.l;
import f5.c0;
import g6.m;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p13.w;
import p13.y;
import tq0.k;
import y22.x;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class d implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f186811a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f186812b;

    public /* synthetic */ d(l lVar, int i14) {
        this.f186811a = i14;
        this.f186812b = lVar;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        int i14 = this.f186811a;
        l lVar = this.f186812b;
        switch (i14) {
            case 0:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                lVar.invoke(bool);
                return Unit.INSTANCE;
            case 1:
                ((Boolean) obj).booleanValue();
                lVar.invoke(Boolean.TRUE);
                return Unit.INSTANCE;
            case 2:
                ((Boolean) obj).booleanValue();
                lVar.invoke(Boolean.FALSE);
                return Unit.INSTANCE;
            case 3:
                Calendar calendar = (Calendar) obj;
                calendar.getClass();
                lVar.invoke(Long.valueOf(calendar.getTimeInMillis()));
                return Unit.INSTANCE;
            case 4:
                lVar.invoke(String.valueOf(((Integer) obj).intValue()));
                return Unit.INSTANCE;
            case 5:
                lVar.invoke(yd1.b.f196759f.get(((Integer) obj).intValue()));
                return Unit.INSTANCE;
            case 6:
                List list = (List) obj;
                list.getClass();
                ArrayList arrayList = new ArrayList(y.r(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(new x((Uri) it.next(), (String) null, false, 6, (j) null));
                }
                lVar.invoke(arrayList);
                return Unit.INSTANCE;
            case 7:
                Uri uri = (Uri) obj;
                uri.getClass();
                lVar.invoke(w.c(new x(uri, (String) null, false, 6, (j) null)));
                return Unit.INSTANCE;
            case 8:
                Uri uri2 = (Uri) obj;
                if (uri2 != null) {
                    lVar.invoke(w.c(uri2));
                }
                return Unit.INSTANCE;
            case 9:
                List list2 = (List) obj;
                list2.getClass();
                lVar.invoke(list2);
                return Unit.INSTANCE;
            case 10:
                c0 c0Var = (c0) obj;
                c0Var.getClass();
                lVar.invoke(m.a(c0Var.a()));
                return Unit.INSTANCE;
            case 11:
                n50.f fVar = (n50.f) obj;
                fVar.getClass();
                lVar.invoke(new a50.c.h(fVar));
                return Unit.INSTANCE;
            case 12:
                n50.c cVar = (n50.c) obj;
                cVar.getClass();
                lVar.invoke(new a50.c.g(cVar));
                return Unit.INSTANCE;
            case 13:
                Integer num = (Integer) obj;
                num.intValue();
                lVar.invoke(num);
                return Unit.INSTANCE;
            case 14:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                lVar.invoke(bool2);
                return Unit.INSTANCE;
            case 15:
                androidx.appcompat.app.e.a aVar = (androidx.appcompat.app.e.a) obj;
                int i15 = yn2.b.G0;
                aVar.getClass();
                aVar.setTitle(R.string.wallet_title_maintenance_notice);
                aVar.setMessage(R.string.wallet_message_urgent_maintenance_notice);
                aVar.setCancelable(false);
                aVar.setPositiveButton(R.string.lbl_ok, new com.garmin.android.apps.connectmobile.gfdi.protobuf.e(lVar, 22));
                return Unit.INSTANCE;
            case 16:
                androidx.appcompat.app.e.a aVar2 = (androidx.appcompat.app.e.a) obj;
                int i16 = yn2.b.G0;
                aVar2.getClass();
                aVar2.setTitle(R.string.wallet_unable_to_remove_card);
                aVar2.setMessage(R.string.wallet_suica_error_in_transit);
                aVar2.setCancelable(false);
                aVar2.setPositiveButton(R.string.lbl_ok, new com.garmin.android.apps.connectmobile.gfdi.protobuf.e(lVar, 20));
                return Unit.INSTANCE;
            case 17:
                tq0.l lVar2 = (tq0.l) obj;
                lVar2.getClass();
                lVar.invoke(lVar2);
                return Unit.INSTANCE;
            case 18:
                k kVar = (k) obj;
                kVar.getClass();
                return (String) lVar.invoke(kVar);
            case 19:
                tq0.l lVar3 = (tq0.l) obj;
                lVar3.getClass();
                lVar.invoke(lVar3);
                return Unit.INSTANCE;
            case 20:
                lVar.invoke(new w41.a.m(new w41.b.e(((Long) obj).longValue())));
                return Unit.INSTANCE;
            case 21:
                String str = (String) obj;
                str.getClass();
                lVar.invoke(new w41.a.u(str));
                return Unit.INSTANCE;
            case 22:
                lVar.invoke(new w41.a.v(((Float) obj).floatValue()));
                return Unit.INSTANCE;
            case 23:
                lVar.invoke(new w41.a.y(((Float) obj).floatValue()));
                return Unit.INSTANCE;
            case 24:
                lVar.invoke(new w41.a.p(((Float) obj).floatValue()));
                return Unit.INSTANCE;
            case 25:
                String str2 = (String) obj;
                str2.getClass();
                lVar.invoke(s.f(str2));
                return Unit.INSTANCE;
            case 26:
                String str3 = (String) obj;
                str3.getClass();
                lVar.invoke(new a60.a.g(str3));
                return Unit.INSTANCE;
            case 27:
                k30.k kVar2 = (k30.k) obj;
                kVar2.getClass();
                lVar.invoke(new a60.a.h(kVar2));
                return Unit.INSTANCE;
            case 28:
                lVar.invoke(new a60.a.c(((Boolean) obj).booleanValue()));
                return Unit.INSTANCE;
            default:
                lVar.invoke(new a60.a.b(((Boolean) obj).booleanValue()));
                return Unit.INSTANCE;
        }
    }
}

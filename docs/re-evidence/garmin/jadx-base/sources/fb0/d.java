package fb0;

import android.content.Intent;
import com.garmin.android.library.mapsdkadapter.MapView;
import e23.l;
import gg1.o0;
import i3.cf;
import i3.df;
import i3.td;
import i50.i;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class d implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f70193a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f70194b;

    public /* synthetic */ d(l lVar, int i14) {
        this.f70193a = i14;
        this.f70194b = lVar;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        Intent intent;
        String stringExtra;
        Intent intent2;
        String stringExtra2;
        Intent intent3;
        String stringExtra3;
        int i14 = this.f70193a;
        l lVar = this.f70194b;
        switch (i14) {
            case 0:
                o0 o0Var = (o0) obj;
                o0Var.getClass();
                lVar.invoke(o0Var);
                return Unit.INSTANCE;
            case 1:
                jo.b bVar = (jo.b) obj;
                bVar.getClass();
                lVar.invoke(bVar);
                return Unit.INSTANCE;
            case 2:
                q4.f fVar = (q4.f) obj;
                fVar.getClass();
                lVar.invoke(fVar);
                return Unit.INSTANCE;
            case 3:
                lVar.invoke(yd1.b.f196759f.get(((Integer) obj).intValue()));
                return Unit.INSTANCE;
            case 4:
                f.a aVar = (f.a) obj;
                aVar.getClass();
                lVar.invoke(Boolean.valueOf(aVar.f67585a == -1));
                return Unit.INSTANCE;
            case 5:
                f.a aVar2 = (f.a) obj;
                aVar2.getClass();
                if (aVar2.f67585a == -1 && (intent = aVar2.f67586b) != null && (stringExtra = intent.getStringExtra("GCM_RESULT_EXTRA_CONTACT_ID")) != null) {
                    lVar.invoke(stringExtra);
                }
                return Unit.INSTANCE;
            case 6:
                pv0.c cVar = (pv0.c) obj;
                cVar.getClass();
                lVar.invoke(cVar);
                return Unit.INSTANCE;
            case 7:
                Integer num = (Integer) obj;
                num.intValue();
                lVar.invoke(num);
                return Unit.INSTANCE;
            case 8:
                Integer num2 = (Integer) obj;
                num2.intValue();
                lVar.invoke(num2);
                return Unit.INSTANCE;
            case 9:
                Integer num3 = (Integer) obj;
                num3.intValue();
                lVar.invoke(num3);
                return Unit.INSTANCE;
            case 10:
                i iVar = (i) obj;
                iVar.getClass();
                lVar.invoke(new i50.a.q(iVar));
                return Unit.INSTANCE;
            case 11:
                zf2.d dVar = (zf2.d) obj;
                dVar.getClass();
                lVar.invoke(dVar);
                return Unit.INSTANCE;
            case 12:
                zf2.d dVar2 = (zf2.d) obj;
                dVar2.getClass();
                lVar.invoke(dVar2);
                return Unit.INSTANCE;
            case 13:
                zf2.d dVar3 = (zf2.d) obj;
                dVar3.getClass();
                lVar.invoke(dVar3);
                return Unit.INSTANCE;
            case 14:
                zf2.d dVar4 = (zf2.d) obj;
                dVar4.getClass();
                lVar.invoke(dVar4);
                return Unit.INSTANCE;
            case 15:
                zf2.d dVar5 = (zf2.d) obj;
                dVar5.getClass();
                lVar.invoke(dVar5);
                return Unit.INSTANCE;
            case 16:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                lVar.invoke(bool);
                return Unit.INSTANCE;
            case 17:
                Integer num4 = (Integer) obj;
                num4.intValue();
                lVar.invoke(num4);
                return Unit.INSTANCE;
            case 18:
                Integer num5 = (Integer) obj;
                num5.intValue();
                lVar.invoke(num5);
                return Unit.INSTANCE;
            case 19:
                td tdVar = (td) obj;
                lVar.invoke(new j23.e(td.c(tdVar.f89802a), td.b(tdVar.f89802a)));
                return Unit.INSTANCE;
            case 20:
                return new cf((df) obj, lVar);
            case 21:
                j90.b bVar2 = (j90.b) obj;
                bVar2.getClass();
                lVar.invoke(bVar2);
                return Unit.INSTANCE;
            case 22:
                Float f14 = (Float) obj;
                f14.floatValue();
                lVar.invoke(f14);
                return Unit.INSTANCE;
            case 23:
                com.garmin.android.library.mapsdkadapter.i iVar2 = (com.garmin.android.library.mapsdkadapter.i) obj;
                int i15 = MapView.f50234j;
                iVar2.getClass();
                lVar.invoke(iVar2);
                return Unit.INSTANCE;
            case 24:
                String str = (String) obj;
                str.getClass();
                lVar.invoke(str);
                return Unit.INSTANCE;
            case 25:
                f.a aVar3 = (f.a) obj;
                aVar3.getClass();
                if (aVar3.f67585a == -1 && (intent2 = aVar3.f67586b) != null && (stringExtra2 = intent2.getStringExtra("GCM_RESULT_EXTRA_CONTACT_ID")) != null) {
                    lVar.invoke(stringExtra2);
                }
                return Unit.INSTANCE;
            case 26:
                f.a aVar4 = (f.a) obj;
                aVar4.getClass();
                if (aVar4.f67585a == -1 && (intent3 = aVar4.f67586b) != null && (stringExtra3 = intent3.getStringExtra("GCM_RESULT_EXTRA_CONTACT_ID")) != null) {
                    lVar.invoke(stringExtra3);
                }
                return Unit.INSTANCE;
            case 27:
                String str2 = (String) obj;
                str2.getClass();
                lVar.invoke(str2);
                return Unit.INSTANCE;
            case 28:
                String str3 = (String) obj;
                str3.getClass();
                lVar.invoke(str3);
                return Unit.INSTANCE;
            default:
                String str4 = (String) obj;
                str4.getClass();
                lVar.invoke(str4);
                return Unit.INSTANCE;
        }
    }
}

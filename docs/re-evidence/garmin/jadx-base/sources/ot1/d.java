package ot1;

import android.net.Uri;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class d implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f133783a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c.q f133784b;

    public /* synthetic */ d(c.q qVar, int i14) {
        this.f133783a = i14;
        this.f133784b = qVar;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        int i14 = this.f133783a;
        c.q qVar = this.f133784b;
        switch (i14) {
            case 0:
                e eVar = e.f133785a;
                qVar.a(null, null);
                break;
            case 1:
                String str = (String) obj;
                l lVar = l.f133804a;
                str.getClass();
                qVar.a(Uri.parse(str), null);
                break;
            case 2:
                String str2 = (String) obj;
                u uVar = u.f133824a;
                str2.getClass();
                qVar.a(str2, null);
                break;
            case 3:
                String str3 = (String) obj;
                u uVar2 = u.f133824a;
                str3.getClass();
                qVar.a(Uri.parse(str3), null);
                break;
            case 4:
                u uVar3 = u.f133824a;
                qVar.a((Long) obj, null);
                break;
            case 5:
                com.garmin.android.apps.connectmobile.courses.model.e eVar2 = (com.garmin.android.apps.connectmobile.courses.model.e) obj;
                u uVar4 = u.f133824a;
                eVar2.getClass();
                qVar.a(eVar2, null);
                break;
            default:
                String str4 = (String) obj;
                w wVar = w.f133841a;
                str4.getClass();
                qVar.a(Uri.parse(str4), null);
                break;
        }
        return Unit.INSTANCE;
    }
}

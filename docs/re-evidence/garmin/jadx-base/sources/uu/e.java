package uu;

import android.net.Uri;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class e implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f172666a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.badges.redesign.b f172667b;

    public /* synthetic */ e(com.garmin.android.apps.connectmobile.badges.redesign.b bVar, int i14) {
        this.f172666a = i14;
        this.f172667b = bVar;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        switch (this.f172666a) {
            case 0:
                Uri uri = (Uri) obj;
                com.garmin.android.apps.connectmobile.badges.redesign.b.InterfaceC0478b interfaceC0478b = this.f172667b.f30424z;
                if (interfaceC0478b != null) {
                    interfaceC0478b.M1(uri);
                }
                break;
            default:
                this.f172667b.T = ((Integer) obj).intValue();
                break;
        }
        return Unit.INSTANCE;
    }
}

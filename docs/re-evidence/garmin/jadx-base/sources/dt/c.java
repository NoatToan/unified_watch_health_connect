package dt;

import android.content.Context;
import android.os.Bundle;
import com.garmin.android.apps.connectmobile.help.HelpActivity;
import p005kotlin.Unit;
import ro0.l;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class c implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f61101a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f61102b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ zs.c f61103c;

    public /* synthetic */ c(Context context, zs.c cVar, int i14) {
        this.f61101a = i14;
        this.f61102b = context;
        this.f61103c = cVar;
    }

    @Override // e23.a
    public final Object invoke() {
        String str;
        String str2;
        switch (this.f61101a) {
            case 0:
                HelpActivity.a aVar = HelpActivity.f36653a;
                l lVar = l.ACTIVITY_RECORDING;
                et.c.a aVar2 = et.c.f65235g;
                vs.d dVar = (vs.d) this.f61103c.f206795k.getValue();
                if (dVar == null || (str = dVar.f179703a) == null) {
                    str = "";
                }
                aVar2.getClass();
                Bundle bundle = new Bundle();
                bundle.putString("EXTRA_DEVICE_NAME_KEY", str);
                HelpActivity.a.e(aVar, this.f61102b, lVar, null, bundle, 4);
                break;
            default:
                HelpActivity.a aVar3 = HelpActivity.f36653a;
                l lVar2 = l.ACTIVITY_RECORDING;
                et.c.a aVar4 = et.c.f65235g;
                vs.d dVar2 = (vs.d) this.f61103c.f206795k.getValue();
                if (dVar2 == null || (str2 = dVar2.f179703a) == null) {
                    str2 = "";
                }
                aVar4.getClass();
                Bundle bundle2 = new Bundle();
                bundle2.putString("EXTRA_DEVICE_NAME_KEY", str2);
                HelpActivity.a.e(aVar3, this.f61102b, lVar2, null, bundle2, 4);
                break;
        }
        return Unit.INSTANCE;
    }
}

package z10;

import android.content.Intent;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class b implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f200889a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.consent.a f200890b;

    public /* synthetic */ b(com.garmin.android.apps.connectmobile.consent.a aVar, int i14) {
        this.f200889a = i14;
        this.f200890b = aVar;
    }

    @Override // e23.a
    public final Object invoke() {
        int i14 = this.f200889a;
        com.garmin.android.apps.connectmobile.consent.a aVar = this.f200890b;
        switch (i14) {
            case 0:
                int i15 = com.garmin.android.apps.connectmobile.consent.a.f32246n;
                Intent intent = new Intent();
                intent.putExtra("extra_too_many_retries", true);
                aVar.setResult(0, intent);
                aVar.finish();
                break;
            default:
                int i16 = com.garmin.android.apps.connectmobile.consent.a.f32246n;
                aVar.pa().y4(aVar.ma());
                break;
        }
        return Unit.INSTANCE;
    }
}

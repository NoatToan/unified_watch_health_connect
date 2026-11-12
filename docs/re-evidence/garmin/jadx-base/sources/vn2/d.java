package vn2;

import android.content.Intent;
import android.net.Uri;
import android.os.PowerManager;
import com.garmin.feature.garminpay.providers.felica.ui.FelicaAddCardActivity;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class d implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f178868a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FelicaAddCardActivity f178869b;

    public /* synthetic */ d(FelicaAddCardActivity felicaAddCardActivity, int i14) {
        this.f178868a = i14;
        this.f178869b = felicaAddCardActivity;
    }

    @Override // e23.a
    public final Object invoke() {
        int i14 = this.f178868a;
        FelicaAddCardActivity felicaAddCardActivity = this.f178869b;
        switch (i14) {
            case 0:
                FelicaAddCardActivity.a aVar = FelicaAddCardActivity.f50949l;
                return new un2.a(felicaAddCardActivity, pn2.a.d.f138714a);
            case 1:
                FelicaAddCardActivity.a aVar2 = FelicaAddCardActivity.f50949l;
                Object systemService = felicaAddCardActivity.getSystemService("power");
                systemService.getClass();
                return ((PowerManager) systemService).newWakeLock(1, "FN#:power.lock.tag");
            case 2:
                FelicaAddCardActivity.a aVar3 = FelicaAddCardActivity.f50949l;
                return new FelicaAddCardActivity.d(felicaAddCardActivity);
            default:
                felicaAddCardActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://support.garmin.com/ja-JP/?faq=rLEa8AJLxg0aJgNexFx11A")));
                return Unit.INSTANCE;
        }
    }
}

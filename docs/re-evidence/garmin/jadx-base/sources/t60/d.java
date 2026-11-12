package t60;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class d implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f162705a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f162706b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g f162707c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Context f162708d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f162709e;

    public /* synthetic */ d(String str, g gVar, Context context, String str2, int i14) {
        this.f162705a = i14;
        this.f162706b = str;
        this.f162707c = gVar;
        this.f162708d = context;
        this.f162709e = str2;
    }

    @Override // e23.a
    public final Object invoke() {
        switch (this.f162705a) {
            case 0:
                String str = this.f162706b;
                if (str != null) {
                    this.f162707c.a();
                    this.f162708d.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str.concat(this.f162709e))));
                }
                break;
            default:
                String str2 = this.f162706b;
                if (str2 != null) {
                    this.f162707c.a();
                    this.f162708d.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str2.concat(this.f162709e))));
                }
                break;
        }
        return Unit.INSTANCE;
    }
}

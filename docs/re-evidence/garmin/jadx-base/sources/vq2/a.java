package vq2;

import android.os.Handler;
import android.os.Looper;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import e23.l;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class a implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f179453a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f179454b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f179455c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l f179456d;

    public /* synthetic */ a(String str, int i14, String str2, l lVar) {
        this.f179453a = i14;
        this.f179454b = str;
        this.f179455c = str2;
        this.f179456d = lVar;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        zb1.a aVar;
        int i14 = this.f179453a;
        l lVar = this.f179456d;
        String str = this.f179455c;
        String str2 = this.f179454b;
        switch (i14) {
            case 0:
                androidx.appcompat.app.e.a aVar2 = (androidx.appcompat.app.e.a) obj;
                int i15 = b.f179457y0;
                aVar2.getClass();
                aVar2.setTitle(R.string.title_error_occurred);
                String string = aVar2.getContext().getString(R.string.wallet_message_general_error_try_again, str2);
                if (str != null) {
                    string = com.nimbusds.jose.shaded.gson.internal.a.h(string, " (", str, ")");
                }
                aVar2.setMessage(string);
                aVar2.setCancelable(false);
                aVar2.setNegativeButton(R.string.lbl_ok, new com.garmin.android.apps.connectmobile.gfdi.protobuf.e(lVar, 18));
                break;
            default:
                al2.c cVar = (al2.c) obj;
                yr1.e eVar = yr1.e.f199078a;
                cVar.getClass();
                i2.a aVar3 = i2.f36769a;
                aVar3.getClass();
                i2.a.b(a2.SYNC, str2, "syncNow - listener batchTransferEventDetails[" + cVar + "]");
                if (yr1.e.d(str) && (aVar = (zb1.a) yr1.d.b(cVar.f3775a)) != null) {
                    aVar.c();
                }
                new Handler(Looper.getMainLooper()).post(new vg1.d(21, lVar, cVar));
                break;
        }
        return Unit.INSTANCE;
    }
}

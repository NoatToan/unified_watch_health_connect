package defpackage;

import android.content.Context;
import com.huawei.ads.adsrec.c0;

/* JADX INFO: loaded from: classes4.dex */
public class axl {

    static class d implements c0 {
        @Override // com.huawei.ads.adsrec.c0
        public void a(Context context, ayc aycVar, axi axiVar) {
        }

        d() {
        }
    }

    public static c0 e(int i) {
        return i == 1 ? new axk() : new d();
    }
}

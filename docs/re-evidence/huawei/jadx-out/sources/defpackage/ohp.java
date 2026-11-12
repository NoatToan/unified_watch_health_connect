package defpackage;

import android.util.Log;
import com.huawei.openplatform.abl.log.a;
import com.huawei.openplatform.abl.log.i;

/* JADX INFO: loaded from: classes12.dex */
public final class ohp extends a {
    @Override // com.huawei.openplatform.abl.log.i
    public void a(ohn ohnVar, int i, String str) {
        if (ohnVar == null) {
            return;
        }
        d(ohnVar.c(), i, str);
        i iVar = this.f21530a;
        if (iVar != null) {
            iVar.a(ohnVar, i, str);
        }
    }

    @Override // com.huawei.openplatform.abl.log.i
    public i a(String str, String str2) {
        i iVar = this.f21530a;
        if (iVar != null) {
            iVar.a(str, str2);
        }
        return this;
    }

    private void d(String str, int i, String str2) {
        if (str == null) {
            return;
        }
        if (i == 3) {
            Log.d(str2, str);
            return;
        }
        if (i == 5) {
            Log.w(str2, str);
        } else if (i != 6) {
            Log.i(str2, str);
        } else {
            Log.e(str2, str);
        }
    }

    public static i a() {
        return new ohp();
    }

    private ohp() {
    }
}

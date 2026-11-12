package g;

import android.content.Context;
import android.content.Intent;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lg/g;", "Lg/a;", "", "", "<init>", "()V", "activity"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class g extends a<String, Boolean> {
    @Override // g.a
    public final Intent a(Context context, String str) {
        String str2 = str;
        context.getClass();
        str2.getClass();
        f.f74076a.getClass();
        Intent intentPutExtra = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", new String[]{str2});
        intentPutExtra.getClass();
        return intentPutExtra;
    }

    @Override // g.a
    public final a.C1502a<Boolean> b(Context context, String str) {
        String str2 = str;
        context.getClass();
        str2.getClass();
        if (a7.b.checkSelfPermission(context, str2) == 0) {
            return new a.C1502a<>(Boolean.TRUE);
        }
        return null;
    }

    @Override // g.a
    public final Boolean c(int i14, Intent intent) {
        if (intent == null || i14 != -1) {
            return Boolean.FALSE;
        }
        int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
        boolean z14 = false;
        if (intArrayExtra != null) {
            for (int i15 : intArrayExtra) {
                if (i15 == 0) {
                    z14 = true;
                    break;
                }
            }
        }
        return Boolean.valueOf(z14);
    }
}

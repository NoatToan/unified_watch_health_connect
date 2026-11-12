package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.xiaomi.mipush.sdk.d;

/* JADX INFO: loaded from: classes11.dex */
public class j5s {
    public static m10 a(Context context, d dVar) {
        return b(context, dVar);
    }

    public static m10 b(Context context, d dVar) {
        z2t.a aVarC = z2t.c(dVar);
        if (aVarC == null || TextUtils.isEmpty(aVarC.f40824a) || TextUtils.isEmpty(aVarC.f40825b)) {
            return null;
        }
        return (m10) zbs.g(aVarC.f40824a, aVarC.f40825b, context);
    }
}

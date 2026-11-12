package defpackage;

import android.content.Context;
import com.alipay.sdk.m.j0.a;

/* JADX INFO: loaded from: classes4.dex */
public class mq implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static a f42161a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static com.alipay.sdk.m.g0.a f42162c;

    @Override // com.alipay.sdk.m.j0.a
    public boolean logCollect(String str) {
        return f42162c.logCollect(str);
    }

    @Override // com.alipay.sdk.m.j0.a
    public md a(ml mlVar) {
        return mf.e(f42162c.a(mf.b(mlVar)));
    }

    public static a b(Context context, String str) {
        if (context == null) {
            return null;
        }
        if (f42161a == null) {
            f42162c = ly.d(context, str);
            f42161a = new mq();
        }
        return f42161a;
    }
}

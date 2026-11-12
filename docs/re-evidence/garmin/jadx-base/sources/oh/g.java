package oh;

import android.content.Context;
import android.os.ConditionVariable;
import android.text.TextUtils;
import com.alipay.apmobilesecuritysdk.face.APSecuritySdk;
import java.util.HashMap;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes7.dex */
public final class g implements Callable<String> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f132155a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f132156b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f132157c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lh.a f132158d;

    public g(String str, String str2, Context context, lh.a aVar) {
        this.f132155a = str;
        this.f132156b = str2;
        this.f132157c = context;
        this.f132158d = aVar;
    }

    @Override // java.util.concurrent.Callable
    public final String call() {
        lh.a aVar = this.f132158d;
        HashMap map = new HashMap();
        map.put("tid", this.f132155a);
        map.put("utdid", this.f132156b);
        String[] strArr = {""};
        try {
            APSecuritySdk aPSecuritySdk = APSecuritySdk.getInstance(this.f132157c);
            ConditionVariable conditionVariable = new ConditionVariable();
            aPSecuritySdk.initToken(0, map, new f(this, strArr, conditionVariable));
            conditionVariable.block(3000L);
        } catch (Throwable th3) {
            nh.d.a(th3);
            wg.a.g(aVar, "third", "GetApdidEx", th3.getClass().getName());
        }
        if (TextUtils.isEmpty(strArr[0])) {
            wg.a.g(aVar, "third", "GetApdidNull", "missing token");
        }
        return strArr[0];
    }
}

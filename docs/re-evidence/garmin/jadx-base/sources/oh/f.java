package oh;

import android.os.ConditionVariable;
import com.alipay.apmobilesecuritysdk.face.APSecuritySdk;

/* JADX INFO: loaded from: classes7.dex */
public class f implements APSecuritySdk.InitResultListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String[] f132153a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ConditionVariable f132154b;

    public f(g gVar, String[] strArr, ConditionVariable conditionVariable) {
        this.f132153a = strArr;
        this.f132154b = conditionVariable;
    }

    @Override // com.alipay.apmobilesecuritysdk.face.APSecuritySdk.InitResultListener
    public final void onResult(APSecuritySdk.TokenResult tokenResult) {
        if (tokenResult != null) {
            this.f132153a[0] = tokenResult.apdidToken;
        }
        this.f132154b.open();
    }
}

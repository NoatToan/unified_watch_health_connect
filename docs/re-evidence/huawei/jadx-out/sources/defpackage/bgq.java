package defpackage;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.IntentSender;
import android.text.TextUtils;
import com.huawei.appgallery.coreservice.api.ApiCode;
import com.huawei.appgallery.coreservice.api.IConnectionResult;
import java.util.Arrays;

/* JADX INFO: loaded from: classes23.dex */
public class bgq implements IConnectionResult {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f1102a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f1103b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final PendingIntent f1104c;

    @Override // com.huawei.appgallery.coreservice.api.IConnectionResult
    public void startResolutionForResult(Activity activity, int i) throws IntentSender.SendIntentException {
        if (hasResolution()) {
            activity.startIntentSenderForResult(this.f1104c.getIntentSender(), i, null, 0, 0, 0);
        }
    }

    public int hashCode() {
        int i = this.f1102a;
        return Arrays.hashCode(new Object[]{Integer.valueOf(i), this.f1104c, this.f1103b});
    }

    @Override // com.huawei.appgallery.coreservice.api.IConnectionResult
    public boolean hasResolution() {
        return (this.f1102a == 0 || this.f1104c == null) ? false : true;
    }

    @Override // com.huawei.appgallery.coreservice.api.IConnectionResult
    public int getStatusCode() {
        return this.f1102a;
    }

    @Override // com.huawei.appgallery.coreservice.api.IConnectionResult
    public PendingIntent getResolution() {
        return this.f1104c;
    }

    @Override // com.huawei.appgallery.coreservice.api.IConnectionResult
    public String getErrorMessage() {
        return this.f1103b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bgq)) {
            return false;
        }
        bgq bgqVar = (bgq) obj;
        return !(this.f1102a == bgqVar.f1102a && this.f1104c == null) ? !(this.f1104c.equals(bgqVar.f1104c) && TextUtils.equals(this.f1103b, bgqVar.f1103b)) : bgqVar.f1104c != null;
    }

    public bgq(int i, PendingIntent pendingIntent, String str) {
        this.f1102a = i;
        this.f1104c = pendingIntent;
        this.f1103b = str;
    }

    public bgq(int i, PendingIntent pendingIntent) {
        this(i, pendingIntent, ApiCode.getStatusCodeString(i));
    }

    public bgq(int i) {
        this(i, null);
    }
}

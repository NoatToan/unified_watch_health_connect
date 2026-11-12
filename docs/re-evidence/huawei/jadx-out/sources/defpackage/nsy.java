package defpackage;

import android.content.Context;
import com.huawei.hihealth.HiUserPreference;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;

/* JADX INFO: loaded from: classes11.dex */
public class nsy {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f43629b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile nsy f43630c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f43631a;
    private HiUserPreference d;

    private boolean b(char c2) {
        return c2 == '1';
    }

    private nsy(Context context) {
        if (context == null) {
            LogUtil.a("SMART_UserPrefHelper", "context is null");
        } else {
            this.f43631a = context.getApplicationContext();
        }
    }

    public static nsy a(Context context) {
        if (f43630c == null) {
            synchronized (f43629b) {
                if (f43630c == null) {
                    if (context == null) {
                        f43630c = new nsy(BaseApplication.getContext());
                    } else {
                        f43630c = new nsy(context);
                    }
                }
            }
        }
        return f43630c;
    }

    public void e() {
        this.d = HiHealthManager.d(this.f43631a).getUserPreference("custom.onboarding_concern_status");
    }

    public boolean a(int i) {
        if (this.d == null) {
            e();
        }
        HiUserPreference hiUserPreference = this.d;
        String value = hiUserPreference == null ? "" : hiUserPreference.getValue();
        if (value == null || value.length() <= i) {
            return false;
        }
        return b(value.charAt(i));
    }
}

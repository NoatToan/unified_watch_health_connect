package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Message;
import com.huawei.multisimsdk.multidevicemanager.common.AbsPairedDevice;
import com.huawei.multisimsdk.multidevicemanager.common.AbsPrimaryDevice;
import com.huawei.multisimsdk.multidevicemanager.common.AuthParam;
import com.huawei.multisimsdk.multidevicemanager.model.BaseAuthenAbs;
import com.huawei.multisimsdk.odsa.view.LoginWebActivity;

/* JADX INFO: loaded from: classes12.dex */
public class odc extends BaseAuthenAbs {
    private static odc d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ode f44177a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private AbsPrimaryDevice f44178b;
    private AbsPairedDevice e;

    public odc(Context context, AuthParam authParam, AbsPrimaryDevice absPrimaryDevice, AbsPairedDevice absPairedDevice, Message message) {
        super(context, authParam, message);
        this.f44178b = absPrimaryDevice;
        this.e = absPairedDevice;
        this.f44177a = ode.e(this.mContext, this.mAuthParam.getSlotId());
        b(this);
    }

    private static void b(odc odcVar) {
        d = odcVar;
    }

    public static odc e() {
        return d;
    }

    public AbsPrimaryDevice b() {
        return this.f44178b;
    }

    public AbsPairedDevice c() {
        return this.e;
    }

    public void e(int i) {
        if (this.mMessage != null) {
            ocq.e("OpenIdAuth", "response result " + i + " to " + this.mMessage.getTarget());
            this.mMessage.arg1 = i;
            oco.a(this.mMessage);
            this.mMessage = null;
        }
    }

    @Override // com.huawei.multisimsdk.multidevicemanager.model.BaseAuthenAbs
    public void startAuthLogin() {
        Intent intent = new Intent();
        intent.setClass(this.mContext, LoginWebActivity.class);
        intent.setFlags(268435456);
        intent.putExtra("slotId", this.mAuthParam.getSlotId());
        ocq.e("OpenIdAuth", "start auth login " + intent);
        this.mContext.startActivity(intent);
    }
}

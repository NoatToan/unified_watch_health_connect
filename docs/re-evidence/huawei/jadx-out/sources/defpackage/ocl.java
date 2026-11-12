package defpackage;

import android.content.Context;
import android.os.Message;
import android.text.TextUtils;
import com.huawei.multisimsdk.multidevicemanager.common.AuthParam;
import com.huawei.multisimsdk.multidevicemanager.model.BaseAuthenAbs;
import com.huawei.multisimsdk.multidevicemanager.util.ResponseHandler;

/* JADX INFO: loaded from: classes12.dex */
public class ocl extends BaseAuthenAbs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f44125a = "GBAAuthen";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ResponseHandler f44126b;

    public ocl(Context context, AuthParam authParam, Message message) {
        super(context, authParam, message);
        this.f44126b = new ResponseHandler() { // from class: ocl.3
            @Override // com.huawei.multisimsdk.multidevicemanager.util.ResponseHandler
            public void onCallback(String str) {
                if (ocq.f44154c.booleanValue()) {
                    ocq.e(ocl.f44125a, "Start GBA AUTH Second result =" + str);
                }
                occ occVar = new occ();
                if (oco.g(str)) {
                    occVar.b(str);
                } else {
                    occVar.e(str);
                }
                int iB = occVar.b();
                String strE = occVar.e();
                if (ocq.f44154c.booleanValue()) {
                    ocq.e(ocl.f44125a, "Start GBA AUTH Second resultcode =" + iB);
                }
                if (iB == 1000) {
                    if (ocl.this.mMessage != null) {
                        String strE2 = obf.e(ocl.this.mContext, ocl.this.mAuthParam.getSlotId());
                        if (!TextUtils.isEmpty(strE2)) {
                            oco.b(ocl.this.mContext, strE2, "authen_Token", occVar.a());
                        }
                        if (!TextUtils.isEmpty(strE)) {
                            oco.b(ocl.this.mContext, strE, "authen_Token", occVar.a());
                        }
                        if (!TextUtils.isEmpty(strE2) && !TextUtils.isEmpty(strE)) {
                            oco.a(ocl.this.mContext, strE, strE2);
                        }
                        ocl.this.mMessage.arg1 = iB;
                        ocl.this.mMessage.obj = strE;
                        oco.a(ocl.this.mMessage);
                        return;
                    }
                    return;
                }
                oco.d(ocl.this.mMessage, iB);
            }
        };
    }

    @Override // com.huawei.multisimsdk.multidevicemanager.model.BaseAuthenAbs
    public void startAuthLogin() {
        ocp ocpVarD = ocp.d();
        String authenParam = getAuthenParam(this.mContext, this.mAuthParam);
        String imsi = this.mAuthParam.getImsi();
        int slotId = this.mAuthParam.getSlotId();
        ocpVarD.e(this.mContext, authenParam, imsi, slotId, this.f44126b);
        if (ocq.f44154c.booleanValue()) {
            ocq.e(f44125a, "startAuthLogin slotId =" + slotId);
        }
    }
}

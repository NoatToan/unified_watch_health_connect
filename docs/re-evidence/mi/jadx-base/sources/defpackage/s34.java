package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import com.xiaomi.aicr.constant.Constants;
import com.xiaomi.aicr.constant.ResultCode;
import com.xiaomi.passport.ui.internal.SNSAuthProvider;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: loaded from: classes7.dex */
public class s34 extends t34 {
    public static final ArrayList<String> l = new ArrayList<>(Arrays.asList("degas", "ruyi", "goku", "peridot", "chenfeng", "aurora", "shennong", "shennong_t", "houji", "manet", "vermeer", "duchamp"));
    public Context j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public fqc f33227k;

    public s34(Context context, u34 u34Var, int[] iArr) {
        super(context, u34Var, iArr);
        this.j = context;
    }

    public static boolean u5(Context context, int[] iArr) {
        int i;
        int length = iArr.length;
        for (int i2 = 0; i2 < length && (i = iArr[i2]) != 8008; i2++) {
            String[] strArr = Constants.f11095a.get(Integer.valueOf(i));
            if (strArr == null || strArr.length != 3 || !t34.r5(context, strArr[0], strArr[1]) || !t34.r5(context, "com.xiaomi.aicr.cognition.ICognitionEngineInterface", strArr[2])) {
                return false;
            }
            if (i == 1010) {
                if (!l.contains(Build.PRODUCT)) {
                    return false;
                }
            }
        }
        return true;
    }

    public int N(int i, int[] iArr, String str, Bundle bundle) {
        fqc fqcVar = this.f33227k;
        if (fqcVar != null) {
            try {
                return fqcVar.N(i, iArr, str, bundle);
            } catch (Exception e) {
                s2n.c("CognitiveManager", "unListen: ", e);
                return ResultCode.RESULT_UNKNOWN_ERROR.getCode();
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("unListen: ");
        ResultCode resultCode = ResultCode.RESULT_SERVICE_CONNECT_FAILED;
        sb.append(resultCode.getMsg());
        s2n.b("CognitiveManager", sb.toString());
        return resultCode.getCode();
    }

    public int U3(int i, int[] iArr, String str, Bundle bundle) {
        fqc fqcVar = this.f33227k;
        if (fqcVar != null) {
            try {
                return fqcVar.U3(i, iArr, str, bundle);
            } catch (Exception e) {
                s2n.c("CognitiveManager", "listen: ", e);
                return ResultCode.RESULT_UNKNOWN_ERROR.getCode();
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("listen: ");
        ResultCode resultCode = ResultCode.RESULT_SERVICE_CONNECT_FAILED;
        sb.append(resultCode.getMsg());
        s2n.b("CognitiveManager", sb.toString());
        return resultCode.getCode();
    }

    @Override // defpackage.t34
    public void h4(String str, long j) {
        s2n.a("CognitiveManager", "speed :" + j);
    }

    @Override // defpackage.t34
    public void s5(bpc bpcVar) {
        s2n.d("CognitiveManager", "onBaseServiceConnected: ");
        try {
            if (this.f != null) {
                s2n.a("CognitiveManager", "is support");
                Iterator<String> it = this.g.iterator();
                while (it.hasNext()) {
                    String next = it.next();
                    s2n.a("CognitiveManager", "register " + next);
                    Bundle bundle = new Bundle();
                    bpcVar.X2(this, super.toString(), next, "", bundle);
                    int i = bundle.getInt("status");
                    if (i == Constants.STATUS_DEFINE.DOWNLOADING_FIRST_USE.ordinal()) {
                        s2n.a("CognitiveManager", "first use downloading");
                        return;
                    } else {
                        if (i != Constants.STATUS_DEFINE.OK.ordinal()) {
                            this.c.onError(i);
                            return;
                        }
                        it.remove();
                    }
                }
                Bundle bundle2 = new Bundle();
                IBinder iBinderX2 = bpcVar.X2(this, super.toString(), "com.xiaomi.aicr.cognition.ICognitionEngineInterface", this.e, bundle2);
                int i2 = bundle2.getInt("status");
                if (i2 == Constants.STATUS_DEFINE.DOWNLOADING_FIRST_USE.ordinal()) {
                    s2n.a("CognitiveManager", "first use downloading");
                    return;
                } else if (i2 != Constants.STATUS_DEFINE.OK.ordinal()) {
                    this.c.onError(i2);
                    return;
                } else {
                    s2n.a("CognitiveManager", SNSAuthProvider.VALUE_SNS_OK);
                    this.f33227k = fqc.a.s2(iBinderX2);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.d = this.f33227k != null;
        if (this.d) {
            s2n.a("CognitiveManager", "callback ok");
            this.c.onServiceConnected(Constants.STATUS_DEFINE.OK.ordinal());
        }
    }

    @Override // defpackage.t34
    public void t5() {
        s2n.a("CognitiveManager", "Service 断开连接");
        u34 u34Var = this.c;
        if (u34Var != null) {
            u34Var.onServiceDisconnected();
        }
    }

    public int y3(int i, int i2, int i3, Bundle bundle) {
        fqc fqcVar = this.f33227k;
        if (fqcVar != null) {
            try {
                return fqcVar.y3(i, i2, i3, bundle);
            } catch (Exception e) {
                s2n.c("CognitiveManager", "setSceneMessage: ", e);
                return ResultCode.RESULT_UNKNOWN_ERROR.getCode();
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("setSceneMessage: ");
        ResultCode resultCode = ResultCode.RESULT_SERVICE_CONNECT_FAILED;
        sb.append(resultCode.getMsg());
        s2n.b("CognitiveManager", sb.toString());
        return resultCode.getCode();
    }
}

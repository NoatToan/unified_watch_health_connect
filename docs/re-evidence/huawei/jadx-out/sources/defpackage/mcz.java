package defpackage;

import com.huawei.hwdevice.mainprocess.mgr.hwwatchfacemgr.touchtransfer.initese.tsm.operator.TsmOperatorResponse;
import com.huawei.hwlogsmodel.LogUtil;

/* JADX INFO: loaded from: classes10.dex */
public class mcz implements TsmOperatorResponse {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private mcl f41448b;
    private int d = 100000;

    public mcz() {
        mcl mclVar = new mcl();
        this.f41448b = mclVar;
        mclVar.d(this);
    }

    private int e(mcy mcyVar) {
        if (mcyVar == null) {
            LogUtil.j("TsmOperator", "checkCommonRequestParams request is null.");
            return 100001;
        }
        if (mcyVar.d() == null) {
            LogUtil.j("TsmOperator", "checkCommonRequestParams request.getCplc() is null.");
            return 100008;
        }
        if (mcyVar.a() == null) {
            LogUtil.j("TsmOperator", "checkCommonRequestParams request.getServiceId() is null.");
            return 100003;
        }
        if (mcyVar.e() != null) {
            return -1;
        }
        LogUtil.j("TsmOperator", "checkCommonRequestParams request.getFunCallId() is null.");
        return 100004;
    }

    @Override // com.huawei.hwdevice.mainprocess.mgr.hwwatchfacemgr.touchtransfer.initese.tsm.operator.TsmOperatorResponse
    public void onOperatorSuccess(String str) {
        this.d = 100000;
    }

    @Override // com.huawei.hwdevice.mainprocess.mgr.hwwatchfacemgr.touchtransfer.initese.tsm.operator.TsmOperatorResponse
    public void onOperatorFailure(int i, Error error) {
        this.d = i;
    }

    public int b(mcy mcyVar) {
        int iE = e(mcyVar);
        if (iE != -1) {
            return iE;
        }
        this.f41448b.b(mcyVar);
        return this.d;
    }
}

package defpackage;

import android.text.TextUtils;
import com.huawei.hwdevice.mainprocess.mgr.hwwatchfacemgr.touchtransfer.initese.tsm.laser.LaserTsmService;
import com.huawei.hwlogsmodel.LogUtil;

/* JADX INFO: loaded from: classes10.dex */
public final class mdb implements LaserTsmService {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private mcz f41454c = new mcz();

    @Override // com.huawei.hwdevice.mainprocess.mgr.hwwatchfacemgr.touchtransfer.initese.tsm.laser.LaserTsmService
    public int executeTsmCommand(mcy mcyVar) {
        LogUtil.a("LaserTsmServiceImpl", "tsm executeTsmCommand now.");
        if (mcyVar == null || TextUtils.isEmpty(mcyVar.a()) || TextUtils.isEmpty(mcyVar.e()) || TextUtils.isEmpty(mcyVar.d())) {
            LogUtil.j("LaserTsmServiceImpl", "tsm executeTsmCommand, params illegal.");
            return LaserTsmService.EXECUTE_RESULT_DEFAULT_ERROR;
        }
        int iB = this.f41454c.b(mcyVar);
        LogUtil.a("LaserTsmServiceImpl", "tsm executeTsmCommand, result:", Integer.valueOf(iB));
        return iB;
    }
}

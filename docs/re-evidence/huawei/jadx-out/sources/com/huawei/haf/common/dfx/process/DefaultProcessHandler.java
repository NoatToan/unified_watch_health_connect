package com.huawei.haf.common.dfx.process;

import com.huawei.haf.common.dfx.DfxBaseHandler;
import com.huawei.haf.common.dfx.DfxUtils;
import com.huawei.haf.common.utils.CollectionUtils;
import com.huawei.hms.network.embedded.g4;
import health.compact.a.LogUtil;
import health.compact.a.ProcessUtil;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class DefaultProcessHandler extends DfxBaseHandler implements ProcessCallback {
    protected void c(String str, String str2, long j, String str3) {
    }

    protected void c(String str, List<String> list, String str2) {
    }

    public DefaultProcessHandler(String str) {
        super(str, "_processLog_%d", 2, 409600, true);
    }

    @Override // com.huawei.haf.common.dfx.process.ProcessCallback
    public void processStart(List<String> list, String str, ProcessCallback.StartInfo startInfo, List<String> list2) {
        if (!CollectionUtils.a(list2)) {
            c(list, list2, startInfo.getStartTime());
        }
        if (startInfo.getLastPid() > 0) {
            a(list, str, startInfo);
            return;
        }
        StringBuilder sbC = c("process start", str);
        sbC.append(", pid=");
        sbC.append(startInfo.getPid());
        sbC.append(", startTime=");
        sbC.append(DfxUtils.e(startInfo.getStartTime()));
        String string = sbC.toString();
        LogUtil.b(this.mTag, string);
        d(list, "process start", str, 0L, string);
    }

    @Override // com.huawei.haf.common.dfx.process.ProcessCallback
    public void processStop(List<String> list, String str, long j, long j2, long j3) {
        long j4 = (j3 - j2) / 1000;
        StringBuilder sbC = c("process stop", str);
        sbC.append(", runDuration(s)=");
        sbC.append(j4);
        sbC.append(", startTime=");
        sbC.append(DfxUtils.e(j2));
        sbC.append(", pid=");
        sbC.append(j);
        String string = sbC.toString();
        LogUtil.b(this.mTag, string, ", ", ProcessUtil.c());
        d(list, "process stop", str, j4, string);
    }

    private void c(List<String> list, List<String> list2, long j) {
        StringBuilder sb = new StringBuilder(256);
        sb.append("process kill, names=");
        sb.append(list2);
        sb.append(", checkTime=");
        sb.append(DfxUtils.e(j));
        String string = sb.toString();
        LogUtil.b(this.mTag, string, ", ", ProcessUtil.c());
        a(list, "process kill", list2, string);
    }

    private void a(List<String> list, String str, ProcessCallback.StartInfo startInfo) {
        long startTime = (startInfo.getStartTime() - startInfo.getLastDieTime()) / 1000;
        StringBuilder sbC = c("process restart", str);
        sbC.append(", dieDuration(s)=");
        sbC.append(startTime);
        sbC.append(", startTime=");
        sbC.append(DfxUtils.e(startInfo.getStartTime()));
        sbC.append(", pid=(");
        sbC.append(startInfo.getLastPid());
        sbC.append(" --> ");
        sbC.append(startInfo.getPid());
        sbC.append(g4.l);
        String string = sbC.toString();
        LogUtil.b(this.mTag, string);
        d(list, "process restart", str, startTime, string);
    }

    private void a(List<String> list, String str, List<String> list2, String str2) {
        String strC = c(list, str2);
        c(str, list2, strC);
        if (saveInfo(strC, getSaveFile())) {
            return;
        }
        LogUtil.e(this.mTag, "handleKillProcessInfo fail.");
    }

    private void d(List<String> list, String str, String str2, long j, String str3) {
        String strC = c(list, str3);
        c(str, str2, j, strC);
        if (saveInfo(strC, getSaveFile())) {
            return;
        }
        LogUtil.e(this.mTag, "handleProcessInfo fail.");
    }

    private StringBuilder c(String str, String str2) {
        StringBuilder sb = new StringBuilder(256);
        sb.append(str);
        sb.append(", name=");
        sb.append(str2);
        return sb;
    }

    private String c(List<String> list, String str) {
        StringBuilder sb = new StringBuilder(512);
        fillSaveBaseInfo(sb, null, null, System.currentTimeMillis(), "AliveInfo:" + list);
        sb.append(str);
        sb.append(System.lineSeparator());
        return sb.toString();
    }
}

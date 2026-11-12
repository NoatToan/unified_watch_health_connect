package com.huami.firstbeat.dbproxy;

import com.huami.firstbeat.ete.EteResultWrapper;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class EteResultProxy implements IEteResult {
    private IEteResult a;

    public static class b {
        private static final EteResultProxy a = new EteResultProxy();

        private b() {
        }
    }

    public static EteResultProxy getInstance() {
        return b.a;
    }

    @Override // com.huami.firstbeat.dbproxy.IEteResult
    public List<EteResultWrapper> getEteResultsByTime(long j, long j2, boolean z) {
        IEteResult iEteResult = this.a;
        if (iEteResult != null) {
            return iEteResult.getEteResultsByTime(j, j2, z);
        }
        return null;
    }

    @Override // com.huami.firstbeat.dbproxy.IEteResult
    public void saveEteResult(EteResultWrapper eteResultWrapper, boolean z) {
        IEteResult iEteResult = this.a;
        if (iEteResult != null) {
            iEteResult.saveEteResult(eteResultWrapper, z);
        }
    }

    @Override // com.huami.firstbeat.dbproxy.IEteResult
    public void saveEteResultList(List<EteResultWrapper> list, boolean z) {
        IEteResult iEteResult = this.a;
        if (iEteResult != null) {
            iEteResult.saveEteResultList(list, z);
        }
    }

    public void setEteClient(IEteResult iEteResult) {
        this.a = iEteResult;
    }

    private EteResultProxy() {
    }
}

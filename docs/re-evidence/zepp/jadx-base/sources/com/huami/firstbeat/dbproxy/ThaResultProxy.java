package com.huami.firstbeat.dbproxy;

import com.huami.firstbeat.tha.ThaDataWrapper;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class ThaResultProxy implements IThaResult {
    private IThaResult a;

    public static class b {
        private static final ThaResultProxy a = new ThaResultProxy();

        private b() {
        }
    }

    public static ThaResultProxy getInstance() {
        return b.a;
    }

    @Override // com.huami.firstbeat.dbproxy.IThaResult
    public ThaDataWrapper getLatestThaResult() {
        IThaResult iThaResult = this.a;
        if (iThaResult != null) {
            return iThaResult.getLatestThaResult();
        }
        return null;
    }

    @Override // com.huami.firstbeat.dbproxy.IThaResult
    public List<ThaDataWrapper> getThaResultList() {
        IThaResult iThaResult = this.a;
        if (iThaResult != null) {
            return iThaResult.getThaResultList();
        }
        return null;
    }

    @Override // com.huami.firstbeat.dbproxy.IThaResult
    public void saveThaResult(ThaDataWrapper thaDataWrapper, boolean z) {
        IThaResult iThaResult = this.a;
        if (iThaResult != null) {
            iThaResult.saveThaResult(thaDataWrapper, z);
        }
    }

    @Override // com.huami.firstbeat.dbproxy.IThaResult
    public void saveThaResultList(List<ThaDataWrapper> list, boolean z) {
        IThaResult iThaResult = this.a;
        if (iThaResult != null) {
            iThaResult.saveThaResultList(list, z);
        }
    }

    public void setThaClient(IThaResult iThaResult) {
        this.a = iThaResult;
    }

    private ThaResultProxy() {
    }
}

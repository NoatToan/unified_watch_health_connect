package com.huami.firstbeat.dbproxy;

import com.huami.firstbeat.tha.ThaDataWrapper;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public interface IThaResult {
    ThaDataWrapper getLatestThaResult();

    List<ThaDataWrapper> getThaResultList();

    void saveThaResult(ThaDataWrapper thaDataWrapper, boolean z);

    void saveThaResultList(List<ThaDataWrapper> list, boolean z);
}

package com.huami.firstbeat.dbproxy;

import com.huami.firstbeat.ete.EteResultWrapper;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public interface IEteResult {
    List<EteResultWrapper> getEteResultsByTime(long j, long j2, boolean z);

    void saveEteResult(EteResultWrapper eteResultWrapper, boolean z);

    void saveEteResultList(List<EteResultWrapper> list, boolean z);
}

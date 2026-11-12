package com.huawei.pluginsport.multilingualaudio;

import defpackage.pqk;
import defpackage.pqp;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
public interface MultilingualAudioApi {
    List<String> getScenarioAudioPaths(String str, pqk pqkVar);

    void init(pqp pqpVar);

    default boolean isInitSuccess() {
        return false;
    }

    void release();
}

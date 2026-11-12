package com.xiaomi.hm.health.bt.sdk;

import com.xiaomi.hm.health.bt.profile.gdsp.raw.HmAfData;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public interface IAtrialFibCallback extends Serializable {
    public static final long serialVersionUID = 1;

    void onResult(boolean z);

    void onResultData(List<? extends HmAfData> list);
}

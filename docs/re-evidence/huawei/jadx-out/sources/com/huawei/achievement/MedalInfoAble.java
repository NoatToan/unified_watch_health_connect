package com.huawei.achievement;

import com.huawei.hmf.tasks.Task;
import defpackage.ouq;
import defpackage.our;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public interface MedalInfoAble {
    Task<ArrayList<our>> obtainCurrentMedalGainStatus(List<Integer> list);

    Task<ArrayList<our>> obtainMedalGainStatus(List<Integer> list);

    Task<ouq> obtainMedalInfo(String str);
}

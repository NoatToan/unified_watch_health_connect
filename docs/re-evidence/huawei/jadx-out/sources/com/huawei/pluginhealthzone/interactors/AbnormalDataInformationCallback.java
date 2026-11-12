package com.huawei.pluginhealthzone.interactors;

import defpackage.pfy;
import java.util.List;

/* JADX INFO: loaded from: classes42.dex */
public interface AbnormalDataInformationCallback {
    void onFailure(int i, String str);

    void onSuccess(List<pfy> list);
}

package com.huawei.health.suggestion;

import java.util.List;

/* JADX INFO: loaded from: classes31.dex */
public interface RunCourseRecommendCallback {
    void onFailure(int i, String str);

    void onSuccess(String str);

    void onSuccess(List<String> list);
}

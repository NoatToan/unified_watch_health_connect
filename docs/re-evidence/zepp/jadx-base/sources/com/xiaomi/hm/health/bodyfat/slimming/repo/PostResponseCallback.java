package com.xiaomi.hm.health.bodyfat.slimming.repo;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0004\u001a\u00020\u0002H&¨\u0006\u0005"}, d2 = {"Lcom/xiaomi/hm/health/bodyfat/slimming/repo/PostResponseCallback;", "", "", "onPostSuccess", "onPostFailure", "bodyfat_midongRelease"}, k = 1, mv = {1, 5, 1})
public interface PostResponseCallback {
    void onPostFailure();

    void onPostSuccess();
}

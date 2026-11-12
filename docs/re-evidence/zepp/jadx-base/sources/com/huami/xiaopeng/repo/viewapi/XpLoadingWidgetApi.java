package com.huami.xiaopeng.repo.viewapi;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&J\b\u0010\u0007\u001a\u00020\u0002H&J\u0010\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH&¨\u0006\n"}, d2 = {"Lcom/huami/xiaopeng/repo/viewapi/XpLoadingWidgetApi;", "", "", "showLoading", "", "e", "showError", "dismiss", "", "message", "xiaopeng-repo_release"}, k = 1, mv = {1, 5, 1})
public interface XpLoadingWidgetApi {
    void dismiss();

    void showError(@NotNull Throwable e);

    void showLoading();

    void showLoading(@NotNull CharSequence message);
}

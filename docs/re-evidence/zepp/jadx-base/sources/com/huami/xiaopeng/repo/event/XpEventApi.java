package com.huami.xiaopeng.repo.event;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0004\u001a\u00020\u0002H&J\b\u0010\u0005\u001a\u00020\u0002H&J\b\u0010\u0006\u001a\u00020\u0002H&J\b\u0010\u0007\u001a\u00020\u0002H&J\b\u0010\b\u001a\u00020\u0002H&J\b\u0010\t\u001a\u00020\u0002H&J\u0010\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH&J\b\u0010\r\u001a\u00020\u0002H&J\u0010\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH&J\b\u0010\u000f\u001a\u00020\u0002H&J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH&¨\u0006\u0011"}, d2 = {"Lcom/huami/xiaopeng/repo/event/XpEventApi;", "", "", "enter", "detailToFaq", "detailToDelete", "detailToAdd", "detailToQuery", "detailToCreate", "installVCardAndKeyCardSuccess", "", "error", "installVCardAndKeyCardFail", "installKeyCardSuccess", "installKeyCardFail", "deleteCardSuccess", "deleteCardFail", "xiaopeng-repo_release"}, k = 1, mv = {1, 5, 1})
public interface XpEventApi {
    void deleteCardFail(@NotNull String error);

    void deleteCardSuccess();

    void detailToAdd();

    void detailToCreate();

    void detailToDelete();

    void detailToFaq();

    void detailToQuery();

    void enter();

    void installKeyCardFail(@NotNull String error);

    void installKeyCardSuccess();

    void installVCardAndKeyCardFail(@NotNull String error);

    void installVCardAndKeyCardSuccess();
}

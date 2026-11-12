package com.huami.account.service;

import com.huami.account.service.model.Area;
import com.huami.watch.companion.ui.activity.BaseDeviceStatusActivity;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H&J\b\u0010\u0007\u001a\u00020\u0005H&J\u0012\u0010\n\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\bH&¨\u0006\u000b"}, d2 = {"Lcom/huami/account/service/EdmService;", "", "", "isEdmChecked", "isAgree", "", "updateEdmStatus", "checkEdmStatus", "Lcom/huami/account/service/model/Area;", BaseDeviceStatusActivity.KEY_AREA, "shouldShowEdm", "service_release"}, k = 1, mv = {1, 5, 1})
public interface EdmService {
    void checkEdmStatus();

    boolean isEdmChecked();

    boolean shouldShowEdm(@Nullable Area area);

    void updateEdmStatus(boolean isAgree);
}

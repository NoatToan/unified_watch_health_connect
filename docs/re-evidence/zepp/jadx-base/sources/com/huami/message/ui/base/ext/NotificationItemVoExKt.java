package com.huami.message.ui.base.ext;

import com.huami.message.vo.NotificationItemVo;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\f\u0010\u0002\u001a\u00020\u0001*\u0004\u0018\u00010\u0000¨\u0006\u0003"}, d2 = {"Lcom/huami/message/vo/NotificationItemVo;", "", "getTypeForRecord", "common-message_release"}, k = 2, mv = {1, 5, 1})
public final class NotificationItemVoExKt {
    @NotNull
    public static final String getTypeForRecord(@Nullable NotificationItemVo notificationItemVo) {
        if (notificationItemVo == null || notificationItemVo.getSubType() == null || notificationItemVo.getNoticeType() == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append((Object) notificationItemVo.getSubType());
        sb.append('/');
        sb.append((Object) notificationItemVo.getNoticeType());
        return sb.toString();
    }
}

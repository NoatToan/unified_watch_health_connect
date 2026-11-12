package com.xiaomi.hm.health.relation;

import com.baidu.ocr.sdk.utils.LogUtil;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0016\u0010\u0007\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004¨\u0006\n"}, d2 = {"Lcom/xiaomi/hm/health/relation/MessageType;", "", "", "TYPE_CARE", LogUtil.I, "TYPE_ADD_FRIEND", "TYPE_REFUSE", "TYPE_ACCEPT", "<init>", "()V", "relatives_release"}, k = 1, mv = {1, 5, 1})
public final class MessageType {

    @NotNull
    public static final MessageType INSTANCE = new MessageType();
    public static final int TYPE_ACCEPT = 3;
    public static final int TYPE_ADD_FRIEND = 1;
    public static final int TYPE_CARE = 0;
    public static final int TYPE_REFUSE = 2;

    private MessageType() {
    }
}

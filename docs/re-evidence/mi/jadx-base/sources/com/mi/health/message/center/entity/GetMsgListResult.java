package com.mi.health.message.center.entity;

import com.google.gson.annotations.SerializedName;
import com.mi.health.message.center.entity.ExtraData;
import com.xiaomi.fitness.sport.route.detail.server.RouteRequest;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0013\u001a\u00020\u0010H\u0016R$\u0010\u0006\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u000b\u001a\u00020\f8\u0006X\u0087D¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lcom/mi/health/message/center/entity/GetMsgListResult;", "T", "Lcom/mi/health/message/center/entity/ExtraData;", "", "<init>", "()V", "messageList", "", "Lcom/mi/health/message/center/entity/MessageData;", "getMessageList", "()Ljava/util/List;", "msgTotal", "", "getMsgTotal", "()I", "nextKey", "", "getNextKey", "()Ljava/lang/String;", "toString", "message-center_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class GetMsgListResult<T extends ExtraData> {

    @SerializedName("messages")
    @Nullable
    private final List<MessageData<T>> messageList;

    @SerializedName("msg_total")
    private final int msgTotal;

    @SerializedName(RouteRequest.KEY_NEXT_KEY)
    @Nullable
    private final String nextKey;

    @Nullable
    public final List<MessageData<T>> getMessageList() {
        return this.messageList;
    }

    public final int getMsgTotal() {
        return this.msgTotal;
    }

    @Nullable
    public final String getNextKey() {
        return this.nextKey;
    }

    @NotNull
    public String toString() {
        return "GetMsgListResult(messageList=" + this.messageList + ", msgTotal=" + this.msgTotal + ", nextKey=" + this.nextKey + ")";
    }
}

package com.xiaomi.hm.health.relation.event;

import com.xiaomi.hm.health.databases.model.FriendMessage;
import java.util.List;

/* JADX INFO: loaded from: classes21.dex */
public class FriendMessagesEvent {
    private List<FriendMessage> messageList;

    public FriendMessagesEvent(List<FriendMessage> list) {
        this.messageList = list;
    }

    public List<FriendMessage> getMessageList() {
        return this.messageList;
    }
}

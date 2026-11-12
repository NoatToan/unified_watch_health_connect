package com.xiaomi.hm.health.relation.event;

import com.xiaomi.hm.health.databases.model.Friend;
import java.util.List;

/* JADX INFO: loaded from: classes21.dex */
public class EventFriendLoad {
    public static final int CLOUD_SERVER_ERROR = -1;
    public static final int NO_NETWORK_CONN_ERROR = -2;
    public static final int SUCCESS = 0;
    public boolean errorTips;
    public List<Friend> friends;
    public boolean hasMore;
    public boolean isRefresh;
    public int resultCode;

    public EventFriendLoad(int i, boolean z, boolean z2, boolean z3, List<Friend> list) {
        this.isRefresh = false;
        this.hasMore = true;
        this.errorTips = false;
        this.friends = null;
        this.friends = list;
        this.resultCode = i;
        this.isRefresh = z;
        this.hasMore = z2;
        this.errorTips = z3;
    }
}

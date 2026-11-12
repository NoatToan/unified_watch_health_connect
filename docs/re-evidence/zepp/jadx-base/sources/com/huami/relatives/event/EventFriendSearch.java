package com.huami.relatives.event;

import com.google.gson.Gson;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class EventFriendSearch {
    public static final int CODE_CANNT_ADD = -1;
    public static final int CODE_FRIEND = 1;
    public static final int CODE_NOT_FRIEND = 0;
    public static final int TYPE_SCAN = 0;
    public static final int TYPE_SEARCH_ID = 1;
    public List<Friend> friends;
    public int type;

    public static class Friend {
        public int code;
        public String iconUrl;
        public String token;
        public long uid;
        public String userName;
    }

    public boolean hasData() {
        List<Friend> list = this.friends;
        return list != null && list.size() > 0;
    }

    public String toString() {
        return new Gson().toJson(this);
    }
}

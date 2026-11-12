package com.huami.watch.companion.common;

import com.google.gson.annotations.SerializedName;
import org.cybergarage.upnp.std.av.server.object.SearchCriteria;

/* JADX INFO: loaded from: classes16.dex */
public class SyncState {
    public static final int STATE_NEED_SYNC = 0;
    public static final int STATE_SYNCED = 1;

    @SerializedName("syncState")
    private int a = 0;

    public boolean isNeedSync() {
        return this.a == 0;
    }

    public boolean isSynced() {
        return this.a == 1;
    }

    public void setNeedSync() {
        this.a = 0;
    }

    public void setSynced() {
        this.a = 1;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(SearchCriteria.LT);
        int i = this.a;
        if (i == 0) {
            sb.append("NeedSync");
        } else if (i == 1) {
            sb.append("Synced");
        }
        sb.append(", " + this.a);
        sb.append(SearchCriteria.GT);
        return sb.toString();
    }
}

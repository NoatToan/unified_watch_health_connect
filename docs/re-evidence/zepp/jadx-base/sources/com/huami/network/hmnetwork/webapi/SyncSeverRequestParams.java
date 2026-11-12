package com.huami.network.hmnetwork.webapi;

/* JADX INFO: loaded from: classes6.dex */
public class SyncSeverRequestParams {
    public int mType;
    public String mDevicedId = "";
    public int mRange = -1;
    public String mFromDate = null;
    public String mToDate = null;
    public int mSource = 0;
    public long mTrackId = 0;
    public String mTrackIdsString = null;
    public String mDate = null;

    public SyncSeverRequestParams(int i) {
        this.mType = i;
    }
}

package com.ximalaya.ting.android.opensdk.model.history;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes22.dex */
public class PlayHistory {
    private int breakSecond;

    @SerializedName("content_type")
    private int contentType;
    private PlayHistoryAlbum mHistoryAlbum;
    private PlayHistoryRadio mHistoryRadio;
    private long playBeginAt;
    private long playEndAt;

    public PlayHistory(JSONObject jSONObject, Gson gson) {
        if (jSONObject != null) {
            int iOptInt = jSONObject.optInt("content_type");
            this.contentType = iOptInt;
            if (iOptInt == 1) {
                this.mHistoryAlbum = (PlayHistoryAlbum) gson.fromJson(jSONObject.toString(), PlayHistoryAlbum.class);
            } else if (iOptInt == 2) {
                this.mHistoryRadio = (PlayHistoryRadio) gson.fromJson(jSONObject.toString(), PlayHistoryRadio.class);
            }
            this.breakSecond = jSONObject.optInt("break_second");
            this.playBeginAt = jSONObject.optLong("play_begin_at");
            this.playEndAt = jSONObject.optLong("play_end_at");
        }
    }

    public int getBreakSecond() {
        return this.breakSecond;
    }

    public int getContentType() {
        return this.contentType;
    }

    public PlayHistoryAlbum getHistoryAlbum() {
        return this.mHistoryAlbum;
    }

    public PlayHistoryRadio getHistoryRadio() {
        return this.mHistoryRadio;
    }

    public long getPlayBeginAt() {
        return this.playBeginAt;
    }

    public long getPlayEndAt() {
        return this.playEndAt;
    }

    public void setBreakSecond(int i) {
        this.breakSecond = i;
    }

    public void setContentType(int i) {
        this.contentType = i;
    }

    public void setHistoryAlbum(PlayHistoryAlbum playHistoryAlbum) {
        this.mHistoryAlbum = playHistoryAlbum;
    }

    public void setHistoryRadio(PlayHistoryRadio playHistoryRadio) {
        this.mHistoryRadio = playHistoryRadio;
    }

    public void setPlayBeginAt(long j) {
        this.playBeginAt = j;
    }

    public void setPlayEndAt(long j) {
        this.playEndAt = j;
    }
}

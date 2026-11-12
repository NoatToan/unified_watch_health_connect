package com.huawei.watchface.videoedit.param;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes45.dex */
public class Config {

    @SerializedName("adjust_max_index")
    @Expose
    private int adjustMaxIndex;

    @SerializedName("extract_audio_last_index")
    @Expose
    private int extractAudioLastIndex;

    @SerializedName("lyrics_recognition_id")
    @Expose
    private String lyricsRecognitionId;

    @SerializedName("lyrics_sync")
    @Expose
    private boolean lyricsSync;

    @SerializedName("record_audio_last_index")
    @Expose
    private int recordAudioLastIndex;

    @SerializedName("sticker_max_index")
    @Expose
    private int stickerMaxIndex;

    @SerializedName("subtitle_recognition_id")
    @Expose
    private String subtitleRecognitionId;

    @SerializedName("subtitle_sync")
    @Expose
    private boolean subtitleSync;

    @SerializedName("video_mute")
    @Expose
    private boolean videoMute;

    public int getAdjustMaxIndex() {
        return this.adjustMaxIndex;
    }

    public int getExtractAudioLastIndex() {
        return this.extractAudioLastIndex;
    }

    public String getLyricsRecognitionId() {
        return this.lyricsRecognitionId;
    }

    public boolean getLyricsSync() {
        return this.lyricsSync;
    }

    public int getRecordAudioLastIndex() {
        return this.recordAudioLastIndex;
    }

    public int getStickerMaxIndex() {
        return this.stickerMaxIndex;
    }

    public String getSubtitleRecognitionId() {
        return this.subtitleRecognitionId;
    }

    public boolean getSubtitleSync() {
        return this.subtitleSync;
    }

    public boolean getVideoMute() {
        return this.videoMute;
    }

    public void setAdjustMaxIndex(int i) {
        this.adjustMaxIndex = i;
    }

    public void setExtractAudioLastIndex(int i) {
        this.extractAudioLastIndex = i;
    }

    public void setLyricsRecognitionId(String str) {
        this.lyricsRecognitionId = str;
    }

    public void setLyricsSync(boolean z) {
        this.lyricsSync = z;
    }

    public void setRecordAudioLastIndex(int i) {
        this.recordAudioLastIndex = i;
    }

    public void setStickerMaxIndex(int i) {
        this.stickerMaxIndex = i;
    }

    public void setSubtitleRecognitionId(String str) {
        this.subtitleRecognitionId = str;
    }

    public void setSubtitleSync(boolean z) {
        this.subtitleSync = z;
    }

    public void setVideoMute(boolean z) {
        this.videoMute = z;
    }

    public Config withAdjustMaxIndex(int i) {
        this.adjustMaxIndex = i;
        return this;
    }

    public Config withExtractAudioLastIndex(int i) {
        this.extractAudioLastIndex = i;
        return this;
    }

    public Config withLyricsRecognitionId(String str) {
        this.lyricsRecognitionId = str;
        return this;
    }

    public Config withLyricsSync(boolean z) {
        this.lyricsSync = z;
        return this;
    }

    public Config withRecordAudioLastIndex(int i) {
        this.recordAudioLastIndex = i;
        return this;
    }

    public Config withStickerMaxIndex(int i) {
        this.stickerMaxIndex = i;
        return this;
    }

    public Config withSubtitleRecognitionId(String str) {
        this.subtitleRecognitionId = str;
        return this;
    }

    public Config withSubtitleSync(boolean z) {
        this.subtitleSync = z;
        return this;
    }

    public Config withVideoMute(boolean z) {
        this.videoMute = z;
        return this;
    }
}

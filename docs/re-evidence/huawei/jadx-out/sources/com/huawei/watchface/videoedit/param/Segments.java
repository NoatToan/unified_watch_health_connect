package com.huawei.watchface.videoedit.param;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes20.dex */
public class Segments {

    @SerializedName("attachedExtraMaterialRefs")
    @Expose
    private List<String> attachedExtraMaterialRefs;

    @SerializedName("id")
    @Expose
    private String id;

    @SerializedName("is_intensifies_audio")
    @Expose
    private boolean isIntensifiesAudio;

    @SerializedName("is_mirror")
    @Expose
    private boolean isMirror;

    @SerializedName("is_reverse")
    @Expose
    private boolean isReverse;

    @SerializedName("is_tone_modify")
    @Expose
    private boolean isToneModify;

    @SerializedName("last_nonzero_volume")
    @Expose
    private int lastNonzeroVolume;
    private int mFadeInDuration;
    private int mFadeOutDuration;

    @SerializedName("mainMaterialId")
    @Expose
    private String mainMaterialId;
    private int overlapGapAtLast;
    private int overlapGapAtTop;

    @SerializedName("playSpeed")
    @Expose
    private float playSpeed;

    @SerializedName("render_index")
    @Expose
    private int renderIndex;

    @SerializedName("timeRangeInSource")
    @Expose
    private SourceTimeRange timeRangeInSource;

    @SerializedName("timeRangeInTarget")
    @Expose
    private TargetTimeRange timeRangeInTarget;

    @SerializedName("volume")
    @Expose
    private int volume;

    public Segments() {
        this.overlapGapAtTop = 0;
        this.overlapGapAtLast = 0;
    }

    public List<String> getExtraMaterialRefs() {
        return this.attachedExtraMaterialRefs;
    }

    public int getFadeInDuration() {
        return this.mFadeInDuration;
    }

    public int getFadeOutDuration() {
        return this.mFadeOutDuration;
    }

    public String getId() {
        return this.id;
    }

    public boolean getIntensifiesAudio() {
        return this.isIntensifiesAudio;
    }

    public boolean getIsToneModify() {
        return this.isToneModify;
    }

    public int getLastNonzeroVolume() {
        return this.lastNonzeroVolume;
    }

    public String getMaterialId() {
        return this.mainMaterialId;
    }

    public boolean getMirror() {
        return this.isMirror;
    }

    public int getOverlapGapAtLast() {
        return this.overlapGapAtLast;
    }

    public int getOverlapGapAtTop() {
        return this.overlapGapAtTop;
    }

    public int getRenderIndex() {
        return this.renderIndex;
    }

    public boolean getReverse() {
        return this.isReverse;
    }

    public SourceTimeRange getSegmentsSourceTimeRange() {
        return this.timeRangeInSource;
    }

    public TargetTimeRange getSegmentsTargetTimerange() {
        return this.timeRangeInTarget;
    }

    public float getSpeed() {
        return this.playSpeed;
    }

    public int getVolume() {
        return this.volume;
    }

    public void setExtraMaterialRefs(List<String> list) {
        this.attachedExtraMaterialRefs = list;
    }

    public void setId(String str) {
        this.id = str;
    }

    public void setIntensifiesAudio(boolean z) {
        this.isIntensifiesAudio = z;
    }

    public void setIsToneModify(boolean z) {
        this.isToneModify = z;
    }

    public void setLastNonzeroVolume(int i) {
        this.lastNonzeroVolume = i;
    }

    public void setMaterialId(String str) {
        this.mainMaterialId = str;
    }

    public void setMirror(boolean z) {
        this.isMirror = z;
    }

    public void setOverlapGapAtLast(int i) {
        this.overlapGapAtLast = i;
    }

    public void setOverlapGapAtTop(int i) {
        this.overlapGapAtTop = i;
    }

    public void setRenderIndex(int i) {
        this.renderIndex = i;
    }

    public void setReverse(boolean z) {
        this.isReverse = z;
    }

    public void setSourceTimerange(SourceTimeRange sourceTimeRange) {
        this.timeRangeInSource = sourceTimeRange;
    }

    public void setSpeed(float f) {
        this.playSpeed = f;
    }

    public void setTargetTimerange(TargetTimeRange targetTimeRange) {
        this.timeRangeInTarget = targetTimeRange;
    }

    public void setVolume(int i) {
        this.volume = i;
    }

    public String toString() {
        return "Segments{id='" + this.id + "', timeRangeInSource=" + this.timeRangeInSource + ", timeRangeInTarget=" + this.timeRangeInTarget + ", playSpeed=" + this.playSpeed + ", isToneModify=" + this.isToneModify + ", isMirror=" + this.isMirror + ", isReverse=" + this.isReverse + ", isIntensifiesAudio=" + this.isIntensifiesAudio + ", volume=" + this.volume + ", lastNonzeroVolume=" + this.lastNonzeroVolume + ", mainMaterialId='" + this.mainMaterialId + "', attachedExtraMaterialRefs=" + this.attachedExtraMaterialRefs + ", renderIndex=" + this.renderIndex + ", mFadeInDuration=" + this.mFadeInDuration + ", mFadeOutDuration=" + this.mFadeOutDuration + ", overlapGapAtTop=" + this.overlapGapAtTop + ", overlapGapAtLast=" + this.overlapGapAtLast + '}';
    }

    public Segments withExtraMaterialRefs(List<String> list) {
        this.attachedExtraMaterialRefs = list;
        return this;
    }

    public Segments withFadeInDuration(int i) {
        this.mFadeInDuration = i;
        return this;
    }

    public Segments withFadeOutDuration(int i) {
        this.mFadeOutDuration = i;
        return this;
    }

    public Segments withId(String str) {
        this.id = str;
        return this;
    }

    public Segments withIntensifiesAudio(boolean z) {
        this.isIntensifiesAudio = z;
        return this;
    }

    public Segments withIsToneModify(boolean z) {
        this.isToneModify = z;
        return this;
    }

    public Segments withLastNonzeroVolume(int i) {
        this.lastNonzeroVolume = i;
        return this;
    }

    public Segments withMaterialId(String str) {
        this.mainMaterialId = str;
        return this;
    }

    public Segments withMirror(boolean z) {
        this.isMirror = z;
        return this;
    }

    public Segments withRenderIndex(int i) {
        this.renderIndex = i;
        return this;
    }

    public Segments withReverse(boolean z) {
        this.isReverse = z;
        return this;
    }

    public Segments withSourceTimerange(SourceTimeRange sourceTimeRange) {
        this.timeRangeInSource = sourceTimeRange;
        return this;
    }

    public Segments withSpeed(float f) {
        this.playSpeed = f;
        return this;
    }

    public Segments withTargetTimerange(TargetTimeRange targetTimeRange) {
        this.timeRangeInTarget = targetTimeRange;
        return this;
    }

    public Segments withVolume(int i) {
        this.volume = i;
        return this;
    }

    public Segments(String str, String str2) {
        this.overlapGapAtTop = 0;
        this.overlapGapAtLast = 0;
        this.id = str;
        this.mainMaterialId = str2;
        this.playSpeed = 1.0f;
        this.renderIndex = 1;
        this.volume = 0;
        this.timeRangeInSource = new SourceTimeRange(0, 0);
        this.timeRangeInTarget = new TargetTimeRange(0, 0);
        this.attachedExtraMaterialRefs = new ArrayList();
    }
}

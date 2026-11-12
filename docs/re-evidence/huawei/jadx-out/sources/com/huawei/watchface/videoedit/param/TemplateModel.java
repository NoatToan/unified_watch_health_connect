package com.huawei.watchface.videoedit.param;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.huawei.hms.network.inner.api.NetworkService;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.constant.WatchFaceConstant;
import com.huawei.watchface.videoedit.utils.UuidManager;
import java.util.List;

/* JADX INFO: loaded from: classes20.dex */
public class TemplateModel {
    private static OperationStack sOperationStack = new OperationStack();

    @SerializedName("canvas_config")
    @Expose
    private CanvasConfig canvasConfig;

    @SerializedName("canvas_info")
    @Expose
    private List<CanvasInfo> canvasInfo;

    @SerializedName(NetworkService.Constants.CONFIG_SERVICE)
    @Expose
    private Config config;

    @SerializedName("duration")
    @Expose
    private long duration;

    @SerializedName("editMaterials")
    @Expose
    private Materials editMaterials;

    @SerializedName("editTracks")
    @Expose
    private List<Tracks> editTracks;

    @SerializedName("headSubTitle")
    @Expose
    private String headSubTitle;

    @SerializedName("headTitle")
    @Expose
    private String headTitle;

    @SerializedName("id")
    @Expose
    private String id;

    @SerializedName("isFormedByTheme")
    @Expose
    private boolean isFormedByTheme = false;
    private List<SourceTimeRange> mEssentialTimeRanges;
    private UuidManager mUuidManager;

    @SerializedName("mediaPath")
    @Expose
    private String mediaPath;

    @SerializedName("mutable_config")
    @Expose
    private String mutableConfig;

    @SerializedName("name")
    @Expose
    private String name;

    @SerializedName("platform")
    @Expose
    private Platform platform;

    @SerializedName(WatchFaceConstant.PREVIEW_RES)
    @Expose
    private String preview;

    @SerializedName("previewVideo")
    @Expose
    private String previewVideo;

    @SerializedName("timeCreated")
    @Expose
    private long timeCreated;

    @SerializedName("timeModified")
    @Expose
    private long timeModified;

    @SerializedName("type")
    @Expose
    private String type;

    @SerializedName("version")
    @Expose
    private long version;

    public TemplateModel(UuidManager uuidManager) {
        this.mUuidManager = uuidManager;
    }

    public CanvasConfig getCanvasConfig() {
        return this.canvasConfig;
    }

    public List<CanvasInfo> getCanvasInfo() {
        return this.canvasInfo;
    }

    public Config getConfig() {
        return this.config;
    }

    public long getCreateTime() {
        return this.timeCreated;
    }

    public long getDuration() {
        return this.duration;
    }

    public List<SourceTimeRange> getEssentialTimeRanges() {
        return this.mEssentialTimeRanges;
    }

    public String getHeadSubTitle() {
        return this.headSubTitle;
    }

    public String getHeadTitle() {
        return this.headTitle;
    }

    public String getId() {
        return this.id;
    }

    public boolean getIsFormedByTheme() {
        return this.isFormedByTheme;
    }

    public Materials getMaterials() {
        return this.editMaterials;
    }

    public String getMediaPath() {
        return this.mediaPath;
    }

    public String getMutableConfig() {
        return this.mutableConfig;
    }

    public String getName() {
        return this.name;
    }

    public OperationStack getOperationStack() {
        return sOperationStack;
    }

    public Platform getPlatform() {
        return this.platform;
    }

    public String getPreview() {
        return this.preview;
    }

    public String getPreviewVideo() {
        return this.previewVideo;
    }

    public List<Tracks> getTracks() {
        return this.editTracks;
    }

    public String getType() {
        return this.type;
    }

    public long getUpdateTime() {
        return this.timeModified;
    }

    public UuidManager getUuidManager() {
        return this.mUuidManager;
    }

    public long getVersion() {
        return this.version;
    }

    public void setCanvasConfig(CanvasConfig canvasConfig) {
        this.canvasConfig = canvasConfig;
    }

    public void setCanvasInfo(List<CanvasInfo> list) {
        this.canvasInfo = list;
    }

    public void setConfig(Config config) {
        this.config = config;
    }

    public void setCreateTime(long j) {
        this.timeCreated = j;
    }

    public void setDuration(long j) {
        this.duration = j;
    }

    public void setEssentialTimeRanges(List<SourceTimeRange> list) {
        this.mEssentialTimeRanges = list;
    }

    public void setHeadSubTitle(String str) {
        this.headSubTitle = str;
    }

    public void setHeadTitle(String str) {
        this.headTitle = str;
    }

    public void setId(String str) {
        this.id = str;
    }

    public void setIsFormedByTheme(boolean z) {
        this.isFormedByTheme = z;
    }

    public void setMaterials(Materials materials) {
        this.editMaterials = materials;
    }

    public void setMediaPath(String str) {
        this.mediaPath = str;
    }

    public void setMutableConfig(String str) {
        this.mutableConfig = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setPlatform(Platform platform) {
        this.platform = platform;
    }

    public void setPreview(String str) {
        this.preview = str;
    }

    public void setPreviewVideo(String str) {
        this.previewVideo = str;
    }

    public void setTracks(List<Tracks> list) {
        this.editTracks = list;
    }

    public void setType(String str) {
        this.type = str;
    }

    public void setUpdateTime(long j) {
        this.timeModified = j;
    }

    public void setVersion(long j) {
        this.version = j;
    }

    public TemplateModel withCanvasConfig(CanvasConfig canvasConfig) {
        this.canvasConfig = canvasConfig;
        return this;
    }

    public TemplateModel withConfig(Config config) {
        this.config = config;
        return this;
    }

    public TemplateModel withCreateTime(long j) {
        this.timeCreated = j;
        return this;
    }

    public TemplateModel withDuration(long j) {
        this.duration = j;
        return this;
    }

    public TemplateModel withId(String str) {
        this.id = str;
        return this;
    }

    public TemplateModel withMaterials(Materials materials) {
        this.editMaterials = materials;
        return this;
    }

    public TemplateModel withMutableConfig(String str) {
        this.mutableConfig = str;
        return this;
    }

    public TemplateModel withName(String str) {
        this.name = str;
        return this;
    }

    public TemplateModel withPlatform(Platform platform) {
        this.platform = platform;
        return this;
    }

    public TemplateModel withTracks(List<Tracks> list) {
        this.editTracks = list;
        return this;
    }

    public TemplateModel withUpdateTime(long j) {
        this.timeModified = j;
        return this;
    }

    public TemplateModel withVersion(long j) {
        this.version = j;
        return this;
    }
}

package com.huawei.watchface.videoedit.param;

import androidx.constraintlayout.motion.widget.Key;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.huawei.operation.ble.BleConstants;

/* JADX INFO: loaded from: classes20.dex */
public class Videos {

    @SerializedName("category_id")
    @Expose
    private String categoryId;

    @SerializedName("category_name")
    @Expose
    private String categoryName;

    @SerializedName("crop")
    @Expose
    private Crop crop;

    @SerializedName("crop_ratio")
    @Expose
    private String cropRatio;

    @SerializedName("crop_scale")
    @Expose
    private int cropScale;

    @SerializedName("duration")
    @Expose
    private int duration;

    @SerializedName("height")
    @Expose
    private int height;

    @SerializedName("id")
    @Expose
    private String id;

    @SerializedName("intensifies_audio_path")
    @Expose
    private String intensifiesAudioPath;

    @SerializedName("intensifies_path")
    @Expose
    private String intensifiesPath;

    @SerializedName("material_id")
    @Expose
    private String materialId;

    @SerializedName("material_name")
    @Expose
    private String materialName;

    @SerializedName(BleConstants.KEY_PATH)
    @Expose
    private String path;

    @SerializedName("pathUri")
    @Expose
    private String pathUri;

    @SerializedName("reverse_intensifies_path")
    @Expose
    private String reverseIntensifiesPath;

    @SerializedName("reverse_path")
    @Expose
    private String reversePath;

    @SerializedName(Key.ROTATION)
    @Expose
    private float rotation;

    @SerializedName("type")
    @Expose
    private String type;

    @SerializedName("width")
    @Expose
    private int width;

    public Videos(MaterialInfo materialInfo) {
        this.type = materialInfo.getType();
        this.width = materialInfo.getWidth();
        this.height = materialInfo.getHeight();
        this.rotation = materialInfo.getRotation();
        this.categoryName = materialInfo.getCategoryName();
        this.path = materialInfo.getPath();
        this.pathUri = materialInfo.getPathUri();
        this.reversePath = materialInfo.getMontagePath();
        this.duration = materialInfo.getDuration();
    }

    public String getCategoryId() {
        return this.categoryId;
    }

    public String getCategoryName() {
        return this.categoryName;
    }

    public Crop getCrop() {
        return this.crop;
    }

    public String getCropRatio() {
        return this.cropRatio;
    }

    public int getCropScale() {
        return this.cropScale;
    }

    public int getDuration() {
        return this.duration;
    }

    public int getHeight() {
        return this.height;
    }

    public String getId() {
        return this.id;
    }

    public String getIntensifiesAudioPath() {
        return this.intensifiesAudioPath;
    }

    public String getIntensifiesPath() {
        return this.intensifiesPath;
    }

    public String getMaterialId() {
        return this.materialId;
    }

    public String getMaterialName() {
        return this.materialName;
    }

    public String getPath() {
        return this.path;
    }

    public String getPathUri() {
        return this.pathUri;
    }

    public String getReverseIntensifiesPath() {
        return this.reverseIntensifiesPath;
    }

    public String getReversePath() {
        return this.reversePath;
    }

    public float getRotation() {
        return this.rotation;
    }

    public String getType() {
        return this.type;
    }

    public int getWidth() {
        return this.width;
    }

    public void setCategoryId(String str) {
        this.categoryId = str;
    }

    public void setCategoryName(String str) {
        this.categoryName = str;
    }

    public void setCrop(Crop crop) {
        this.crop = crop;
    }

    public void setCropRatio(String str) {
        this.cropRatio = str;
    }

    public void setCropScale(int i) {
        this.cropScale = i;
    }

    public void setDuration(int i) {
        this.duration = i;
    }

    public void setHeight(int i) {
        this.height = i;
    }

    public void setId(String str) {
        this.id = str;
    }

    public void setIntensifiesAudioPath(String str) {
        this.intensifiesAudioPath = str;
    }

    public void setIntensifiesPath(String str) {
        this.intensifiesPath = str;
    }

    public void setMaterialId(String str) {
        this.materialId = str;
    }

    public void setMaterialName(String str) {
        this.materialName = str;
    }

    public void setPath(String str) {
        this.path = str;
    }

    public void setReverseIntensifiesPath(String str) {
        this.reverseIntensifiesPath = str;
    }

    public void setReversePath(String str) {
        this.reversePath = str;
    }

    public void setRotation(float f) {
        this.rotation = f;
    }

    public void setType(String str) {
        this.type = str;
    }

    public void setWidth(int i) {
        this.width = i;
    }

    public Videos withCategoryId(String str) {
        this.categoryId = str;
        return this;
    }

    public Videos withCategoryName(String str) {
        this.categoryName = str;
        return this;
    }

    public Videos withCrop(Crop crop) {
        this.crop = crop;
        return this;
    }

    public Videos withCropRatio(String str) {
        this.cropRatio = str;
        return this;
    }

    public Videos withCropScale(int i) {
        this.cropScale = i;
        return this;
    }

    public Videos withDuration(int i) {
        this.duration = i;
        return this;
    }

    public Videos withHeight(int i) {
        this.height = i;
        return this;
    }

    public Videos withId(String str) {
        this.id = str;
        return this;
    }

    public Videos withIntensifiesAudioPath(String str) {
        this.intensifiesAudioPath = str;
        return this;
    }

    public Videos withIntensifiesPath(String str) {
        this.intensifiesPath = str;
        return this;
    }

    public Videos withMaterialId(String str) {
        this.materialId = str;
        return this;
    }

    public Videos withMaterialName(String str) {
        this.materialName = str;
        return this;
    }

    public Videos withPath(String str) {
        this.path = str;
        return this;
    }

    public Videos withPathUri(String str) {
        this.pathUri = str;
        return this;
    }

    public Videos withReverseIntensifiesPath(String str) {
        this.reverseIntensifiesPath = str;
        return this;
    }

    public Videos withReversePath(String str) {
        this.reversePath = str;
        return this;
    }

    public Videos withRotation(float f) {
        this.rotation = f;
        return this;
    }

    public Videos withType(String str) {
        this.type = str;
        return this;
    }

    public Videos withWidth(int i) {
        this.width = i;
        return this;
    }
}

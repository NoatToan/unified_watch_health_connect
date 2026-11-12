package com.xiaomi.fitness.sport_eco.view.environmental.model;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\t\"\u0004\b\r\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\t\"\u0004\b\u000f\u0010\u000b¨\u0006\u001a"}, d2 = {"Lcom/xiaomi/fitness/sport_eco/view/environmental/model/EcoEnvrionmentalBean;", "", "title", "", "imgResource", "des", "<init>", "(III)V", "getTitle", "()I", "setTitle", "(I)V", "getImgResource", "setImgResource", "getDes", "setDes", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "sport-eco_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class EcoEnvrionmentalBean {
    private int des;
    private int imgResource;
    private int title;

    public EcoEnvrionmentalBean(int i, int i2, int i3) {
        this.title = i;
        this.imgResource = i2;
        this.des = i3;
    }

    public static /* synthetic */ EcoEnvrionmentalBean copy$default(EcoEnvrionmentalBean ecoEnvrionmentalBean, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = ecoEnvrionmentalBean.title;
        }
        if ((i4 & 2) != 0) {
            i2 = ecoEnvrionmentalBean.imgResource;
        }
        if ((i4 & 4) != 0) {
            i3 = ecoEnvrionmentalBean.des;
        }
        return ecoEnvrionmentalBean.copy(i, i2, i3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getImgResource() {
        return this.imgResource;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getDes() {
        return this.des;
    }

    @NotNull
    public final EcoEnvrionmentalBean copy(int title, int imgResource, int des) {
        return new EcoEnvrionmentalBean(title, imgResource, des);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EcoEnvrionmentalBean)) {
            return false;
        }
        EcoEnvrionmentalBean ecoEnvrionmentalBean = (EcoEnvrionmentalBean) other;
        return this.title == ecoEnvrionmentalBean.title && this.imgResource == ecoEnvrionmentalBean.imgResource && this.des == ecoEnvrionmentalBean.des;
    }

    public final int getDes() {
        return this.des;
    }

    public final int getImgResource() {
        return this.imgResource;
    }

    public final int getTitle() {
        return this.title;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.title) * 31) + Integer.hashCode(this.imgResource)) * 31) + Integer.hashCode(this.des);
    }

    public final void setDes(int i) {
        this.des = i;
    }

    public final void setImgResource(int i) {
        this.imgResource = i;
    }

    public final void setTitle(int i) {
        this.title = i;
    }

    @NotNull
    public String toString() {
        return "EcoEnvrionmentalBean(title=" + this.title + ", imgResource=" + this.imgResource + ", des=" + this.des + ")";
    }
}

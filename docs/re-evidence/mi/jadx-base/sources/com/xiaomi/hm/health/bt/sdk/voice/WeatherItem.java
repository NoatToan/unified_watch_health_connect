package com.xiaomi.hm.health.bt.sdk.voice;

import java.io.Serializable;

/* JADX INFO: loaded from: classes11.dex */
public class WeatherItem implements Serializable {
    private static final long serialVersionUID = 1;
    private String aqi;
    private String cTemperature;
    private String date;
    private String description;
    private String hTemperature;
    private Image image;
    private String lTemperature;
    private String location;
    private String subTitle;
    private String title;

    public String getAqi() {
        return this.aqi;
    }

    public String getDate() {
        return this.date;
    }

    public String getDescription() {
        return this.description;
    }

    public Image getImage() {
        return this.image;
    }

    public String getLocation() {
        return this.location;
    }

    public String getSubTitle() {
        return this.subTitle;
    }

    public String getTitle() {
        return this.title;
    }

    public String getcTemperature() {
        return this.cTemperature;
    }

    public String gethTemperature() {
        return this.hTemperature;
    }

    public String getlTemperature() {
        return this.lTemperature;
    }

    public void setAqi(String str) {
        this.aqi = str;
    }

    public void setDate(String str) {
        this.date = str;
    }

    public void setDescription(String str) {
        this.description = str;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public void setLocation(String str) {
        this.location = str;
    }

    public void setSubTitle(String str) {
        this.subTitle = str;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public void setcTemperature(String str) {
        this.cTemperature = str;
    }

    public void sethTemperature(String str) {
        this.hTemperature = str;
    }

    public void setlTemperature(String str) {
        this.lTemperature = str;
    }
}

package com.huami.watch.companion.watchface.bean;

import java.io.Serializable;
import java.util.List;
import kotlin.text.Typography;

/* JADX INFO: loaded from: classes16.dex */
public class WatchFaceBean implements Serializable {
    public static final int WATCH_FACE_CURRENT = 1;
    public static final int WATCH_FACE_TYPE_NOT_STARTED = 0;
    public static final int WATCH_FACE_TYPE_STARTED = 1;
    private int cloudId;
    private int current;
    private String dialName;
    private boolean editable;
    private int enable;
    private int id;
    private String image;
    private int index;
    private String pkgNmae;
    private String srvName;
    private int system;
    private int type;
    private int watcFaceBg;
    private List<WatchFaceWidget> widget;

    public WatchFaceBean() {
    }

    public int getCloudId() {
        return this.cloudId;
    }

    public int getCurrent() {
        return this.current;
    }

    public String getDialName() {
        return this.dialName;
    }

    public int getEnable() {
        return this.enable;
    }

    public int getId() {
        return this.id;
    }

    public String getImage() {
        return this.image;
    }

    public int getIndex() {
        return this.index;
    }

    public String getPkgNmae() {
        return this.pkgNmae;
    }

    public String getSrvName() {
        return this.srvName;
    }

    public int getSystem() {
        return this.system;
    }

    public int getType() {
        return this.type;
    }

    public int getWatcFaceBg() {
        return this.watcFaceBg;
    }

    public List<WatchFaceWidget> getWidget() {
        return this.widget;
    }

    public boolean isEditable() {
        List<WatchFaceWidget> list = this.widget;
        return (list == null || list.size() == 0) ? false : true;
    }

    public void setCloudId(int i) {
        this.cloudId = i;
    }

    public void setCurrent(int i) {
        this.current = i;
    }

    public void setDialName(String str) {
        this.dialName = str;
    }

    public void setEditable(boolean z) {
        this.editable = z;
    }

    public void setEnable(int i) {
        this.enable = i;
    }

    public void setId(int i) {
        this.id = i;
    }

    public void setImage(String str) {
        this.image = str;
    }

    public void setIndex(int i) {
        this.index = i;
    }

    public void setPkgNmae(String str) {
        this.pkgNmae = str;
    }

    public void setSrvName(String str) {
        this.srvName = str;
    }

    public void setSystem(int i) {
        this.system = i;
    }

    public void setType(int i) {
        this.type = i;
    }

    public void setWatcFaceBg(int i) {
        this.watcFaceBg = i;
    }

    public void setWidget(List<WatchFaceWidget> list) {
        this.widget = list;
    }

    public String toString() {
        return "<Id: " + this.id + "<cloudId: " + this.cloudId + ", PkgNmae: '" + this.pkgNmae + "', SrvName: '" + this.srvName + "', Enable: " + this.enable + ", Widget: " + this.widget + ", Index: " + this.index + ", Current: " + this.current + ", DialName: '" + this.dialName + "', System: " + this.system + ", System: " + this.system + ", WatcFaceBg: " + this.watcFaceBg + ", Editable: " + this.editable + ", Image: '" + this.image + '\'' + Typography.greater;
    }

    public WatchFaceBean(String str, String str2) {
        this.pkgNmae = str;
        this.srvName = str2;
    }
}

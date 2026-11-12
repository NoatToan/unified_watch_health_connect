package com.huami.watch.companion.watchface.bean;

import java.io.Serializable;
import kotlin.text.Typography;

/* JADX INFO: loaded from: classes16.dex */
public class WatchFaceConfigBean implements Serializable {
    private int childId;
    private int dataType;
    private int groupId;
    private String providerName;
    private String providerPkg;
    private String providerTitle;
    private String providerType;

    public int getChildId() {
        return this.childId;
    }

    public int getDataType() {
        return this.dataType;
    }

    public int getGroupId() {
        return this.groupId;
    }

    public String getProviderName() {
        return this.providerName;
    }

    public String getProviderPkg() {
        return this.providerPkg;
    }

    public String getProviderTitle() {
        return this.providerTitle;
    }

    public String getProviderType() {
        return this.providerType;
    }

    public void setChildId(int i) {
        this.childId = i;
    }

    public void setDataType(int i) {
        this.dataType = i;
    }

    public void setGroupId(int i) {
        this.groupId = i;
    }

    public void setProviderName(String str) {
        this.providerName = str;
    }

    public void setProviderPkg(String str) {
        this.providerPkg = str;
    }

    public void setProviderTitle(String str) {
        this.providerTitle = str;
    }

    public void setProviderType(String str) {
        this.providerType = str;
    }

    public String toString() {
        return "<DataType: " + this.dataType + ", ProviderName: '" + this.providerName + "', ProviderPkg: '" + this.providerPkg + "', ProviderType: '" + this.providerType + "', ProviderTitle: '" + this.providerTitle + "', GroupId: " + this.groupId + ", ChildId: " + this.childId + Typography.greater;
    }
}

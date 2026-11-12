package com.huami.watch.companion.watchface.bean;

import androidx.annotation.RequiresApi;
import com.huami.watch.companion.ui.view.WheelAdapter;
import java.io.Serializable;
import java.util.Objects;
import kotlin.text.Typography;

/* JADX INFO: loaded from: classes16.dex */
public class WatchFaceChildBean implements WheelAdapter.Item, Serializable {
    private int childId;
    private int dataType;
    private WatchFaceOptionBean parent;
    private String providerName;
    private String providerPkg;
    private String providerType;
    private String title;

    public WatchFaceChildBean(String str) {
        this.title = str;
    }

    @RequiresApi(api = 19)
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        WatchFaceChildBean watchFaceChildBean = (WatchFaceChildBean) obj;
        return this.childId == watchFaceChildBean.childId && Objects.equals(this.title, watchFaceChildBean.title);
    }

    public int getChildId() {
        return this.childId;
    }

    public int getDataType() {
        return this.dataType;
    }

    @Override // com.huami.watch.companion.ui.view.WheelAdapter.Item
    public String getKey() {
        return this.childId + "";
    }

    public WatchFaceOptionBean getParent() {
        return this.parent;
    }

    public String getProviderName() {
        return this.providerName;
    }

    public String getProviderPkg() {
        return this.providerPkg;
    }

    public String getProviderType() {
        return this.providerType;
    }

    public String getTitle() {
        return this.title;
    }

    @Override // com.huami.watch.companion.ui.view.WheelAdapter.Item
    public String getValue() {
        return this.title;
    }

    @RequiresApi(api = 19)
    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.childId), this.title);
    }

    public void setChildId(int i) {
        this.childId = i;
    }

    public void setDataType(int i) {
        this.dataType = i;
    }

    public void setParent(WatchFaceOptionBean watchFaceOptionBean) {
        this.parent = watchFaceOptionBean;
    }

    public void setProviderName(String str) {
        this.providerName = str;
    }

    public void setProviderPkg(String str) {
        this.providerPkg = str;
    }

    public void setProviderType(String str) {
        this.providerType = str;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public String toString() {
        return "<ChildId: " + this.childId + ", Title: '" + this.title + '\'' + Typography.greater;
    }

    public WatchFaceChildBean(int i, String str) {
        this.childId = i;
        this.title = str;
    }
}

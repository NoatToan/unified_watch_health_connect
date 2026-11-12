package com.huami.watch.companion.watchface.bean;

import androidx.annotation.RequiresApi;
import com.huami.watch.companion.ui.view.WheelAdapter;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes16.dex */
public class WatchFaceOptionBean implements WheelAdapter.Item, Serializable {
    private List<WatchFaceChildBean> childs;
    private int groupId;
    private String groupName;
    private WatchFaceChildBean selectChildBean;

    public WatchFaceOptionBean(String str) {
        this.groupName = str;
    }

    @RequiresApi(api = 19)
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        WatchFaceOptionBean watchFaceOptionBean = (WatchFaceOptionBean) obj;
        return this.groupId == watchFaceOptionBean.groupId && Objects.equals(this.groupName, watchFaceOptionBean.groupName);
    }

    public List<WatchFaceChildBean> getChilds() {
        return this.childs;
    }

    public int getGroupId() {
        return this.groupId;
    }

    public String getGroupName() {
        return this.groupName;
    }

    @Override // com.huami.watch.companion.ui.view.WheelAdapter.Item
    public String getKey() {
        return this.groupId + "";
    }

    public WatchFaceChildBean getSelectChildBean() {
        return this.selectChildBean;
    }

    @Override // com.huami.watch.companion.ui.view.WheelAdapter.Item
    public String getValue() {
        return this.groupName;
    }

    @RequiresApi(api = 19)
    public int hashCode() {
        return Objects.hash(this.groupName, Integer.valueOf(this.groupId));
    }

    public void setChilds(List<WatchFaceChildBean> list) {
        this.childs = list;
    }

    public void setGroupId(int i) {
        this.groupId = i;
    }

    public void setGroupName(String str) {
        this.groupName = str;
    }

    public void setSelectChildBean(WatchFaceChildBean watchFaceChildBean) {
        this.selectChildBean = watchFaceChildBean;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("<GroupName: '");
        sb.append(this.groupName);
        sb.append('\'');
        sb.append(", GroupId: ");
        sb.append(this.groupId);
        sb.append(", Childs: ");
        sb.append(this.childs);
        sb.append(", SelectChildBean: ");
        sb.append(this.selectChildBean);
        return sb.toString() == null ? "为空" : "不为空>";
    }

    public WatchFaceOptionBean(int i) {
        this.groupId = i;
    }
}

package com.huami.watch.companion.watchface.bean;

import java.io.Serializable;
import java.util.List;
import kotlin.text.Typography;

/* JADX INFO: loaded from: classes16.dex */
public class WatchFaceWidget implements Serializable {
    public static final int WIDGET_TYPE_ARC = 1;
    public static final int WIDGET_TYPE_CIRCLE = 3;
    public static final int WIDGET_TYPE_CIRCLE_RECT = 4;
    public static final int WIDGET_TYPE_RECT = 5;
    public static final int WIDGET_TYPE_STRIP = 2;
    private WatchFaceConfigBean config;
    private boolean expand;
    private int id;
    private List<WatchFaceOptionBean> optionalData;
    private WatchFaceOptionBean selectOption;
    private String widgetTitle;
    private int widgetType;

    public WatchFaceConfigBean getConfig() {
        return this.config;
    }

    public int getId() {
        return this.id;
    }

    public List<WatchFaceOptionBean> getOptionalData() {
        return this.optionalData;
    }

    public WatchFaceOptionBean getSelectOption() {
        return this.selectOption;
    }

    public String getWidgetTitle() {
        return this.widgetTitle;
    }

    public int getWidgetType() {
        return this.widgetType;
    }

    public boolean isExpand() {
        return this.expand;
    }

    public void setConfig(WatchFaceConfigBean watchFaceConfigBean) {
        this.config = watchFaceConfigBean;
    }

    public void setExpand(boolean z) {
        this.expand = z;
    }

    public void setId(int i) {
        this.id = i;
    }

    public void setOptionalData(List<WatchFaceOptionBean> list) {
        this.optionalData = list;
    }

    public void setSelectOption(WatchFaceOptionBean watchFaceOptionBean) {
        this.selectOption = watchFaceOptionBean;
    }

    public void setWidgetTitle(String str) {
        this.widgetTitle = str;
    }

    public void setWidgetType(int i) {
        this.widgetType = i;
    }

    public String toString() {
        return "<Id: " + this.id + ", WidgetType: " + this.widgetType + ", WidgetTitle: '" + this.widgetTitle + "', Config: " + this.config + ", OptionalData: " + this.optionalData + ", Expand: " + this.expand + ", SelectOption: " + this.selectOption + Typography.greater;
    }
}

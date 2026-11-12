package com.huami.watch.companion.app;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;
import com.amazon.identity.auth.device.datastore.DatabaseHelper;
import kotlin.text.Typography;

/* JADX INFO: loaded from: classes16.dex */
@Table(name = "WatchWidgets")
public class WatchWidget extends Model implements Cloneable {

    @Column(name = "Enable")
    public boolean enable;

    @Column(name = "IconByte")
    public byte[] iconByte;
    public int iconRes;

    @Column(name = "WidgetIndex")
    public int index;

    @Column(name = DatabaseHelper.appInfo_PackageName)
    public String packageName;

    @Column(name = "Title")
    public String title;
    public int type;

    @Column(name = "WidgetClass")
    public String widgetClass;

    public WatchWidget() {
        this.enable = true;
    }

    @Override // com.activeandroid.Model
    public boolean equals(Object obj) {
        return obj instanceof WatchWidget ? ((WatchWidget) obj).getIdentify().equals(getIdentify()) : super.equals(obj);
    }

    public String getIdentify() {
        return this.packageName + " " + this.widgetClass;
    }

    public void setEnable(boolean z) {
        this.enable = z;
    }

    public void setIndex(int i) {
        this.index = i;
    }

    @Override // com.activeandroid.Model
    public String toString() {
        return "<PackageName: '" + this.packageName + "', WidgetClass: '" + this.widgetClass + "', Index: " + this.index + ", Title: '" + this.title + "', IconBytes: " + this.iconByte + ", Enable: " + this.enable + ", Type: " + this.type + Typography.greater;
    }

    public WatchWidget(WatchWidget watchWidget) {
        this.enable = true;
        this.index = watchWidget.index;
        this.packageName = watchWidget.packageName;
        this.widgetClass = watchWidget.widgetClass;
        this.title = watchWidget.title;
        this.iconByte = watchWidget.iconByte;
    }

    public WatchWidget(String str, String str2, String str3, byte[] bArr) {
        this.enable = true;
        this.packageName = str;
        this.widgetClass = str2;
        this.title = str3;
        this.iconByte = bArr;
    }

    public WatchWidget(String str, String str2, String str3, int i) {
        this.enable = true;
        this.packageName = str;
        this.widgetClass = str2;
        this.title = str3;
        this.iconRes = i;
    }

    public WatchWidget(String str, String str2, String str3, int i, int i2) {
        this.enable = true;
        this.packageName = str;
        this.widgetClass = str2;
        this.title = str3;
        this.iconRes = i;
        this.type = i2;
    }

    public WatchWidget(int i, String str, String str2, String str3, int i2, boolean z, int i3) {
        this.enable = true;
        this.index = i;
        this.packageName = str;
        this.widgetClass = str2;
        this.title = str3;
        this.iconRes = i2;
        this.enable = z;
        this.type = i3;
    }

    public WatchWidget(int i, String str, String str2, String str3, byte[] bArr) {
        this.enable = true;
        this.index = i;
        this.packageName = str;
        this.widgetClass = str2;
        this.title = str3;
        this.iconByte = bArr;
    }

    public WatchWidget(int i, String str, String str2, String str3, byte[] bArr, boolean z) {
        this.enable = true;
        this.index = i;
        this.packageName = str;
        this.widgetClass = str2;
        this.title = str3;
        this.iconByte = bArr;
        this.enable = z;
    }
}

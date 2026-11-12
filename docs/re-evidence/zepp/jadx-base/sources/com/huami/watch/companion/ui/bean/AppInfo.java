package com.huami.watch.companion.ui.bean;

import androidx.annotation.RequiresApi;
import java.util.Objects;
import kotlin.text.Typography;

/* JADX INFO: loaded from: classes16.dex */
public class AppInfo {
    public static final int TYPE_CONFIG = 1;
    public static final int TYPE_CORE = 1;
    public static final int TYPE_NOT_CONFIG = 0;
    public static final int TYPE_NOT_CORE = 0;
    public static final int TYPE_STATUS_NOT_INSTALLED = 0;
    public static final int TYPE_STATUS_SHOW = 1;
    private int core;
    private int iconRes;
    private String pkgname;
    private int status;
    private String title;
    private int type;

    public AppInfo(String str, int i) {
        this(str, "", 0, i);
    }

    @RequiresApi(api = 19)
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.pkgname, ((AppInfo) obj).pkgname);
    }

    public int getCore() {
        return this.core;
    }

    public int getIconRes() {
        return this.iconRes;
    }

    public String getPkgname() {
        return this.pkgname;
    }

    public int getStatus() {
        return this.status;
    }

    public String getTitle() {
        return this.title;
    }

    public int getType() {
        return this.type;
    }

    @RequiresApi(api = 19)
    public int hashCode() {
        return Objects.hash(this.pkgname);
    }

    public void setCore(int i) {
        this.core = i;
    }

    public void setIconRes(int i) {
        this.iconRes = i;
    }

    public void setPkgname(String str) {
        this.pkgname = str;
    }

    public void setStatus(int i) {
        this.status = i;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public void setType(int i) {
        this.type = i;
    }

    public String toString() {
        return "<Title: '" + this.title + "', Pkgname: '" + this.pkgname + "', Status: " + this.status + ", Core: " + this.core + ", IconRes: " + this.iconRes + ", Type: " + this.type + Typography.greater;
    }

    public AppInfo(String str, String str2, int i) {
        this(str, str2, 0, i);
    }

    public AppInfo(String str, String str2, int i, int i2) {
        this(str, str2, 1, i, i2);
    }

    public AppInfo(String str, String str2, int i, int i2, int i3) {
        this(str, str2, i, 0, i2, i3);
    }

    public AppInfo(String str, String str2, int i, int i2, int i3, int i4) {
        this.title = str2;
        this.pkgname = str;
        this.status = i;
        this.core = i2;
        this.iconRes = i4;
        this.type = i3;
    }
}

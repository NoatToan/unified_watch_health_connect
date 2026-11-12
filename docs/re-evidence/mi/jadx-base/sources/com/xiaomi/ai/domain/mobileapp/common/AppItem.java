package com.xiaomi.ai.domain.mobileapp.common;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class AppItem implements Comparable<AppItem> {
    private List<String> aliasList;
    private List<List<String>> aliasWordPinyinList;
    private long appId;
    private String dataSource;
    private String debugInfo;
    private String deviceType;
    private String displayName;
    private int downTimes;
    private String iconUrl;
    private boolean isNative;
    private boolean isOnline;
    private boolean isTop;
    private String packageName;
    private List<String> pinyinList;
    private double score;
    private List<String> tagsList;

    public AppItem(long j, int i, String str, String str2, String str3, double d) {
        this.isOnline = true;
        this.appId = j;
        this.downTimes = i;
        this.displayName = str;
        this.packageName = str2;
        this.iconUrl = str3;
        this.score = d;
        this.aliasList = new ArrayList();
        this.tagsList = new ArrayList();
        this.pinyinList = new ArrayList();
        this.aliasWordPinyinList = new ArrayList();
        this.isTop = false;
        this.deviceType = "universal";
    }

    public void addAlias(String str) {
        if (this.aliasList.contains(str)) {
            return;
        }
        this.aliasList.add(str);
    }

    public void addTag(String str) {
        if (this.tagsList.contains(str)) {
            return;
        }
        this.tagsList.add(str);
    }

    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        return ((AppItem) obj).getPackageName().equals(this.packageName);
    }

    public List<String> getAliasList() {
        return this.aliasList;
    }

    public List<List<String>> getAliasWordPinyinList() {
        return this.aliasWordPinyinList;
    }

    public long getAppId() {
        return this.appId;
    }

    public String getDataSource() {
        return this.dataSource;
    }

    public String getDebugInfo() {
        return this.debugInfo;
    }

    public String getDeviceType() {
        return this.deviceType;
    }

    public String getDisplayName() {
        return this.displayName;
    }

    public int getDownTimes() {
        return this.downTimes;
    }

    public String getIconUrl() {
        return this.iconUrl;
    }

    public String getPackageName() {
        return this.packageName;
    }

    public List<String> getPinyinList() {
        return this.pinyinList;
    }

    public double getScore() {
        return this.score;
    }

    public List<String> getTagsList() {
        return this.tagsList;
    }

    public boolean hasName(String str) {
        return this.displayName.equalsIgnoreCase(str) || this.aliasList.contains(str);
    }

    public int hashCode() {
        return this.packageName.hashCode();
    }

    public boolean isNative() {
        return this.isNative;
    }

    public boolean isOnline() {
        return this.isOnline;
    }

    public boolean isTop() {
        return this.isTop;
    }

    public void setAliasList(List<String> list) {
        this.aliasList = this.aliasList;
    }

    public void setAliasWordPinyinList(List<List<String>> list) {
        this.aliasWordPinyinList = list;
    }

    public void setAppId(long j) {
        this.appId = j;
    }

    public void setDataSource(String str) {
        this.dataSource = str;
    }

    public void setDebugInfo(String str) {
        this.debugInfo = str;
    }

    public void setDeviceType(String str) {
        this.deviceType = str;
    }

    public void setDisplayName(String str) {
        this.displayName = str;
    }

    public void setDownTimes(int i) {
        this.downTimes = i;
    }

    public void setIconUrl(String str) {
        this.iconUrl = str;
    }

    public void setNative(boolean z) {
        this.isNative = z;
    }

    public void setOnline(boolean z) {
        this.isOnline = z;
    }

    public void setPackageName(String str) {
        this.packageName = str;
    }

    public void setPinyinList(List<String> list) {
        this.pinyinList = list;
    }

    public void setScore(double d) {
        this.score = d;
    }

    public void setTagsList(List<String> list) {
        this.tagsList = list;
    }

    public void setTop(boolean z) {
        this.isTop = z;
    }

    @Override // java.lang.Comparable
    public int compareTo(AppItem appItem) {
        return Double.valueOf(this.score).compareTo(Double.valueOf(appItem.score));
    }

    public AppItem() {
        this.isOnline = true;
        this.appId = 0L;
        this.downTimes = 0;
        this.displayName = "";
        this.score = 0.0d;
        this.packageName = "";
        this.iconUrl = "";
        this.aliasList = new ArrayList();
        this.tagsList = new ArrayList();
        this.pinyinList = new ArrayList();
        this.aliasWordPinyinList = new ArrayList();
        this.isTop = false;
        this.deviceType = "universal";
        this.isNative = false;
        this.isOnline = true;
    }
}

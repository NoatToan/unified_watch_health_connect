package com.huawei.ui.main.stories.recommendcloud.data;

import com.huawei.hihealth.ResultUtils;

/* JADX INFO: loaded from: classes19.dex */
public class SleepRecommendData {
    private String category;
    private String description;
    private String imageUrl;
    private String suggestion;
    private String title;
    private String url;

    public String getSuggestion() {
        return (String) ResultUtils.c(this.suggestion);
    }

    public String getCategory() {
        return (String) ResultUtils.c(this.category);
    }

    public String getDescription() {
        return (String) ResultUtils.c(this.description);
    }

    public String getUrl() {
        return (String) ResultUtils.c(this.url);
    }

    public String getTitle() {
        return (String) ResultUtils.c(this.title);
    }

    public String toString() {
        return "SleepRecommendData{imageUrl='" + this.imageUrl + "', suggestion='" + this.suggestion + "', category='" + this.category + "', description='" + this.description + "', url='" + this.url + "', title='" + this.title + "'}";
    }
}

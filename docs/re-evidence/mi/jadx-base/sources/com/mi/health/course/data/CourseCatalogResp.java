package com.mi.health.course.data;

import com.google.gson.annotations.SerializedName;
import com.xiaomi.fitness.feedback.util.FeedbackConstants;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class CourseCatalogResp {

    @SerializedName(FeedbackConstants.KEY_TAG_LIST)
    public List<Catalog> tags;

    @SerializedName("type_list")
    public List<Catalog> types;

    public static class Catalog {

        @SerializedName("name")
        public String name;
        public boolean selected;

        @SerializedName("tag")
        public String tag;

        @SerializedName("type")
        public int type;
    }
}

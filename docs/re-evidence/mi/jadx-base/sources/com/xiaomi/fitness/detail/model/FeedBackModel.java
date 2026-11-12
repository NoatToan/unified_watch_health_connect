package com.xiaomi.fitness.detail.model;

import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public class FeedBackModel {

    public class FeedBackType implements Serializable {
        public List<SubTypeItem> tagList;
        final /* synthetic */ FeedBackModel this$0;
        public String wideTagContent;
        public int wideTagId;

        public class SubTypeItem implements Serializable {
            public String showContent;
            public int tagId;

            public SubTypeItem() {
            }
        }

        public FeedBackType(FeedBackModel feedBackModel) {
        }
    }
}

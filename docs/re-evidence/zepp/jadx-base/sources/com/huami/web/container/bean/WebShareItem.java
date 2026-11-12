package com.huami.web.container.bean;

import com.alipay.sdk.m.u.i;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes17.dex */
public class WebShareItem {
    private Share a;
    private String b;

    @SerializedName("show_dialog")
    private boolean c;

    public static class Share {
        private static final String k = "default";
        private static final String l = "weibo";
        private static final String m = "moments";
        private static final String n = "weChat";
        private static final String o = "qq";
        private static final String p = "qzone";
        private static final String q = "miTalk";
        private static final String r = "facebook";
        private static final String s = "twitter";
        private static final String t = "line";

        @SerializedName("default")
        private ShareItem a;

        @SerializedName("weibo")
        private ShareItem b;

        @SerializedName("moments")
        private ShareItem c;

        @SerializedName("weChat")
        private ShareItem d;

        @SerializedName("qq")
        private ShareItem e;

        @SerializedName("qzone")
        private ShareItem f;

        @SerializedName("miTalk")
        private ShareItem g;

        @SerializedName("facebook")
        private ShareItem h;

        @SerializedName("twitter")
        private ShareItem i;

        @SerializedName("line")
        private ShareItem j;

        public ShareItem getDefaultShareItem() {
            ShareItem shareItem = this.a;
            if (shareItem != null) {
                shareItem.setItemName("default");
            }
            return this.a;
        }

        public ShareItem getFacebookShareItem() {
            ShareItem shareItem = this.h;
            if (shareItem != null) {
                shareItem.setItemName("facebook");
            }
            return this.h;
        }

        public ShareItem getLineShareItem() {
            ShareItem shareItem = this.j;
            if (shareItem != null) {
                shareItem.setItemName("line");
            }
            return this.j;
        }

        public ShareItem getMiTalkShareItem() {
            ShareItem shareItem = this.g;
            if (shareItem != null) {
                shareItem.setItemName("miTalk");
            }
            return this.g;
        }

        public ShareItem getMomentsShareItem() {
            ShareItem shareItem = this.c;
            if (shareItem != null) {
                shareItem.setItemName("moments");
            }
            return this.c;
        }

        public ShareItem getQqShareItem() {
            ShareItem shareItem = this.e;
            if (shareItem != null) {
                shareItem.setItemName("qq");
            }
            return this.e;
        }

        public ShareItem getQzoneShareItem() {
            ShareItem shareItem = this.f;
            if (shareItem != null) {
                shareItem.setItemName("qzone");
            }
            return this.f;
        }

        public ShareItem getTwitterShareItem() {
            ShareItem shareItem = this.i;
            if (shareItem != null) {
                shareItem.setItemName("twitter");
            }
            return this.i;
        }

        public ShareItem getWeChatShareItem() {
            ShareItem shareItem = this.d;
            if (shareItem != null) {
                shareItem.setItemName("weChat");
            }
            return this.d;
        }

        public ShareItem getWeiboShareItem() {
            ShareItem shareItem = this.b;
            if (shareItem != null) {
                shareItem.setItemName("weibo");
            }
            return this.b;
        }
    }

    public static class ShareItem {
        private String a;
        private String b;
        private String c;
        private String d;
        private String e;

        public String getContent() {
            return this.d;
        }

        public String getIcon() {
            return this.c;
        }

        public String getItemName() {
            return this.e;
        }

        public String getTitle() {
            return this.a;
        }

        public String getUrl() {
            return this.b;
        }

        public void setContent(String str) {
            this.d = str;
        }

        public void setIcon(String str) {
            this.c = str;
        }

        public void setItemName(String str) {
            this.e = str;
        }

        public void setTitle(String str) {
            this.a = str;
        }

        public void setUrl(String str) {
            this.b = str;
        }

        public String toString() {
            return "{ title:" + this.a + ", url:" + this.b + ", icon:" + this.c + ", content:" + this.d + ", itemName:" + this.e + i.d;
        }
    }

    public String getCallback() {
        return this.b;
    }

    public Share getShare() {
        return this.a;
    }

    public boolean isShowDialog() {
        return this.c;
    }

    public void setCallback(String str) {
        this.b = str;
    }

    public void setShare(Share share) {
        this.a = share;
    }
}

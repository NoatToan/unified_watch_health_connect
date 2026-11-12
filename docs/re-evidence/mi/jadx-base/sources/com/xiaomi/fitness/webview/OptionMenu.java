package com.xiaomi.fitness.webview;

import android.text.TextUtils;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class OptionMenu implements Serializable {
    public static final String SHARE_TYPE_SCREEN_SHORT = "screenshot";
    private boolean enabled;
    private List<MenuItem> items;

    public class MenuItem implements Serializable {
        private String badge;
        private String icon;
        private int index;
        private String shareType;
        private String title;
        private String type;

        public MenuItem() {
        }

        public String getBadge() {
            return this.badge;
        }

        public String getIcon() {
            return this.icon;
        }

        public int getIndex() {
            return this.index;
        }

        public String getShareType() {
            return this.shareType;
        }

        public String getTitle() {
            return this.title;
        }

        public String getType() {
            return this.type;
        }

        public boolean isShareTypeScreenShot() {
            if (TextUtils.isEmpty(this.shareType)) {
                return false;
            }
            return "screenshot".equals(this.shareType);
        }

        public void setBadge(String str) {
            this.badge = str;
        }

        public void setIcon(String str) {
            this.icon = str;
        }

        public void setIndex(int i) {
            this.index = i;
        }

        public void setShareType(String str) {
            this.shareType = str;
        }

        public void setTitle(String str) {
            this.title = str;
        }

        public void setType(String str) {
            this.type = str;
        }
    }

    public List<MenuItem> getItems() {
        return this.items;
    }

    public boolean isEnabled() {
        return this.enabled;
    }

    public void setEnabled(boolean z) {
        this.enabled = z;
    }

    public void setItems(List<MenuItem> list) {
        this.items = list;
    }
}

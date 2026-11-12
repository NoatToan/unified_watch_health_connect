package com.xiaomi.fitness.webview;

import android.text.TextUtils;
import java.io.Serializable;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes10.dex */
public class OptionButton implements Serializable {
    public static final String SHARE_TYPE_SCREEN_SHORT = "screenshot";
    private List<MenuItem> items;

    public static class MenuItem implements Serializable {
        private String badge;
        private boolean cancelable;
        private boolean disabled;
        private float endPercent;
        private String icon;
        public int index;
        private String shareType;
        private float startPercent;
        private String type;

        public MenuItem(String str) {
            this.type = str;
        }

        public float getEndPercent() {
            return this.endPercent;
        }

        public String getIcon() {
            return this.icon;
        }

        public String getShareType() {
            return this.shareType;
        }

        public float getStartPercent() {
            return this.startPercent;
        }

        public String getType() {
            return this.type;
        }

        public boolean isCancelable() {
            return this.cancelable;
        }

        public boolean isDisabled() {
            return this.disabled;
        }

        public boolean isShareTypeScreenShot() {
            if (TextUtils.isEmpty(this.shareType)) {
                return false;
            }
            return "screenshot".equals(this.shareType);
        }

        public String toString() {
            return "MenuItem{type='" + this.type + "', icon='" + this.icon + "', badge='" + this.badge + "', shareType='" + this.shareType + "', disabled=" + this.disabled + ", startPercent=" + this.startPercent + ", endPercent=" + this.endPercent + ", cancelable=" + this.cancelable + ", index=" + this.index + AbstractJsonLexerKt.END_OBJ;
        }
    }

    public List<MenuItem> getItems() {
        return this.items;
    }

    public String toString() {
        return "OptionButton{items=" + this.items + AbstractJsonLexerKt.END_OBJ;
    }
}

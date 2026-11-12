package com.xiaomi.ai.domain.mobileapp.common;

import java.io.Serializable;

/* JADX INFO: loaded from: classes7.dex */
public class BaseAppItem implements Serializable {
    private static final long serialVersionUID = 1;
    protected String displayName;
    protected String packageName;

    public BaseAppItem(String str, String str2) {
        this.displayName = str;
        this.packageName = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BaseAppItem baseAppItem = (BaseAppItem) obj;
        return this.displayName.equals(baseAppItem.displayName) && this.packageName.equals(baseAppItem.packageName);
    }

    public String getDisplayName() {
        return this.displayName;
    }

    public String getPackageName() {
        return this.packageName;
    }

    public int hashCode() {
        String str = this.displayName;
        if (str == null || this.packageName == null) {
            return 0;
        }
        return str.hashCode() + this.packageName.hashCode();
    }

    public void setDisplayName(String str) {
        this.displayName = str;
    }

    public void setPackageName(String str) {
        this.packageName = str;
    }
}

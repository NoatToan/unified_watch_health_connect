package com.xiaomi.hm.health.bt.model.appsort;

import java.io.Serializable;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes11.dex */
public class AppItem implements Serializable {
    private static final long serialVersionUID = 1;
    public boolean enable;
    public int index;
    public int parentType;
    public int type;
    public boolean updated;

    public AppItem(int i, int i2, int i3, boolean z) {
        this(i2, i3, z);
        this.parentType = i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.type == ((AppItem) obj).type;
    }

    public int getIndex() {
        return this.index;
    }

    public int getParentType() {
        return this.parentType;
    }

    public int getType() {
        return this.type;
    }

    public boolean isEnable() {
        return this.enable;
    }

    public boolean isUpdated() {
        return this.updated;
    }

    public void setEnable(boolean z) {
        this.enable = z;
    }

    public void setIndex(int i) {
        this.index = i;
    }

    public void setParentType(int i) {
        this.parentType = i;
    }

    public void setType(int i) {
        this.type = i;
    }

    public void setUpdated(boolean z) {
        this.updated = z;
    }

    public String toString() {
        return "{parentType=" + this.parentType + ", type=" + this.type + ", index=" + this.index + ", enable=" + this.enable + AbstractJsonLexerKt.END_OBJ;
    }

    public AppItem(int i, int i2, boolean z) {
        this.updated = false;
        this.parentType = -1;
        this.type = i;
        this.index = i2;
        this.enable = z;
    }
}

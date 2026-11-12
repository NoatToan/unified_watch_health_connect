package com.xiaomi.hm.health.bt.model.appsort;

import java.io.Serializable;

/* JADX INFO: loaded from: classes19.dex */
public class AppItem implements Serializable {
    private static final long serialVersionUID = 1;
    public int a;
    public boolean enable;
    public int index;
    public int type;
    public boolean updated;

    public AppItem(int parentType, int type, int index, boolean enable) {
        this(type, index, enable);
        this.a = parentType;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        return o != null && getClass() == o.getClass() && this.type == ((AppItem) o).type;
    }

    public int getIndex() {
        return this.index;
    }

    public int getParentType() {
        return this.a;
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

    public void setEnable(boolean enable) {
        this.enable = enable;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public void setParentType(int parentType) {
        this.a = parentType;
    }

    public void setType(int type) {
        this.type = type;
    }

    public void setUpdated(boolean updated) {
        this.updated = updated;
    }

    public String toString() {
        return "{parentType=" + this.a + ", type=" + this.type + ", index=" + this.index + ", enable=" + this.enable + '}';
    }

    public AppItem(int type, int index, boolean enable) {
        this.updated = false;
        this.a = -1;
        this.type = type;
        this.index = index;
        this.enable = enable;
    }
}

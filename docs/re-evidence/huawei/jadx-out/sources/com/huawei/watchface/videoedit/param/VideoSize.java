package com.huawei.watchface.videoedit.param;

/* JADX INFO: loaded from: classes45.dex */
public class VideoSize {
    public int height;
    public int width;

    public VideoSize(int i, int i2) {
        this.width = i;
        this.height = i2;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof VideoSize)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        VideoSize videoSize = (VideoSize) obj;
        return this.width == videoSize.width && this.height == videoSize.height;
    }

    public int hashCode() {
        return super.hashCode();
    }
}

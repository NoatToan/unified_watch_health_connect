package com.ingenic.iwds.datatransactor.elf;

import java.io.Serializable;

/* JADX INFO: loaded from: classes18.dex */
public class CameraPreviewSizeInfo implements Serializable {
    private static final long serialVersionUID = 3088957725138490091L;
    public boolean isFrontCamera = false;
    public int width = 0;
    public int heigth = 0;

    public String toString() {
        return "CameraPreviewSizeInfo [isFrontCamera=" + this.isFrontCamera + ", width=" + this.width + ", heigth=" + this.heigth + "]";
    }
}

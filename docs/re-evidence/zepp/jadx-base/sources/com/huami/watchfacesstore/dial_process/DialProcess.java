package com.huami.watchfacesstore.dial_process;

import com.baidu.ocr.sdk.utils.LogUtil;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0086 R\u0016\u0010\b\u001a\u00020\u00058\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0016\u0010\n\u001a\u00020\u00058\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0016\u0010\u000b\u001a\u00020\u00058\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\tR\u0016\u0010\f\u001a\u00020\u00058\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\tR\u0016\u0010\r\u001a\u00020\u00058\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\t¨\u0006\u0010"}, d2 = {"Lcom/huami/watchfacesstore/dial_process/DialProcess;", "", "", "pngPath", "tgaPath", "", "imageFmt", "png2tga", "TGA_L8_ARGB8888_GCNANOLITE", LogUtil.I, "TGA_L8_ARGB8888_DAVE2D", "TGA_BITMAP_ARGB8888", "TGA_RGB565_GCNANOLITE", "TGA_RGB565_DAVE2D", "<init>", "()V", "dial-process_release"}, k = 1, mv = {1, 5, 1})
public final class DialProcess {

    @NotNull
    public static final DialProcess INSTANCE = new DialProcess();
    public static final int TGA_BITMAP_ARGB8888 = 2;
    public static final int TGA_L8_ARGB8888_DAVE2D = 1;
    public static final int TGA_L8_ARGB8888_GCNANOLITE = 0;
    public static final int TGA_RGB565_DAVE2D = 4;
    public static final int TGA_RGB565_GCNANOLITE = 3;

    static {
        System.loadLibrary("png2tga");
    }

    private DialProcess() {
    }

    public static /* synthetic */ int png2tga$default(DialProcess dialProcess, String str, String str2, int i, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            i = 3;
        }
        return dialProcess.png2tga(str, str2, i);
    }

    public final native int png2tga(@NotNull String pngPath, @NotNull String tgaPath, int imageFmt);
}

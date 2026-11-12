package com.huami.watchfacesstore.dial_process;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ#\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0086 ¨\u0006\n"}, d2 = {"Lcom/huami/watchfacesstore/dial_process/DialProcess;", "", "", "pngPath", "tgaPath", "", "imageFmt", "png2tga", "<init>", "()V", "dial-process_release"}, k = 1, mv = {1, 5, 1})
public final class DialProcess {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final DialProcess f9903a = new DialProcess();

    static {
        System.loadLibrary("png2tga");
    }

    public static /* synthetic */ int a(DialProcess dialProcess, String str, String str2, int i, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            i = 3;
        }
        return dialProcess.png2tga(str, str2, i);
    }

    public final native int png2tga(@NotNull String pngPath, @NotNull String tgaPath, int imageFmt);
}

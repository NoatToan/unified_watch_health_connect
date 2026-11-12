package com.xiaomi.fitness.watch.face.data;

import defpackage.uw8;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000\"\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"EXPIRE_TIME", "", "KEY_VERSION", "", "TAG", "ZIP_PATH", "ICON_PATH", "getICON_PATH", "()Ljava/lang/String;", "setICON_PATH", "(Ljava/lang/String;)V", "watch-face_chinaProductRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class FaceFunUtilKt {
    private static final int EXPIRE_TIME = 86400000;

    @NotNull
    private static String ICON_PATH = null;

    @NotNull
    private static final String KEY_VERSION = "face_data_version";

    @NotNull
    private static final String TAG = "FaceFunUtil";

    @NotNull
    private static String ZIP_PATH;

    static {
        String strC = uw8.c();
        String str = File.separator;
        ZIP_PATH = strC + str + "data.zip";
        ICON_PATH = uw8.d() + str + "DataIcon";
    }

    @NotNull
    public static final String getICON_PATH() {
        return ICON_PATH;
    }

    public static final void setICON_PATH(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        ICON_PATH = str;
    }
}

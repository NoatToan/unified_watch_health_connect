package com.xiaomi.fitness.watch.face;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\u001a\u000e\u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u0001\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"EXTRA_PATH", "", "EXTRA_MD5", "EXTRA_STYLES", "EXTRA_STYLE", "EXTRA_RET_PNG", "EXTRA_BG", "getPngPath", "path", "TAG", "watch-face_chinaProductRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class FaceBlePhotoFragmentKt {

    @NotNull
    public static final String EXTRA_BG = "extra_bg";

    @NotNull
    public static final String EXTRA_MD5 = "extra_md5";

    @NotNull
    public static final String EXTRA_PATH = "extra_path";

    @NotNull
    public static final String EXTRA_RET_PNG = "extra_png";

    @NotNull
    public static final String EXTRA_STYLE = "extra_cur_style";

    @NotNull
    public static final String EXTRA_STYLES = "extra_styles";

    @NotNull
    private static final String TAG = "FaceBlePhoto";

    @NotNull
    public static final String getPngPath(@NotNull String path) {
        Intrinsics.checkNotNullParameter(path, "path");
        return path + ".png";
    }
}

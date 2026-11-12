package com.xiaomi.fitness.watch.face.viewmodel;

import com.xiaomi.fitness.common.utils.MD5Util;
import com.xiaomi.fitness.watch.face.data.FaceManager;
import defpackage.p1j;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\u000e\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0003\u001a\u0010\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0003X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0003X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0003X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0003X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\u0003X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\u0003X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\u0003X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000b\u001a\u00020\u0003X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\f\u001a\u00020\u0003X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\r\u001a\u00020\u0003X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000e\u001a\u00020\u0003X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000f\u001a\u00020\u0003X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0010\u001a\u00020\u0003X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"TAG", "", "CODE_SUCCESS", "", "CODE_FAIL", "CODE_EDIT_SUCCESS_STORAGE", "CODE_EDIT_FAIL_STORAGE", "CODE_USED_NO_EDIT", "CODE_INSTALL_BUSY", "CODE_INSTALL_LOW_BATTERY", "CODE_INSTALL_LOW_STORAGE", "CODE_INSTALL_LOW_STORAGE_CAN_REPLACE", "PROGRESS_DOWNLOAD", "PROGRESS_SPIRIT", "PROGRESS", "CODE_FILE_INVALID", "CODE_DOWNLOAD_FAILED", "getTip", "code", "validZip", "", "fileMd5", "watch-face_chinaProductRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class FaceBleInfoViewModelKt {
    public static final int CODE_DOWNLOAD_FAILED = -1;
    public static final int CODE_EDIT_FAIL_STORAGE = 13;
    public static final int CODE_EDIT_SUCCESS_STORAGE = 12;
    public static final int CODE_FAIL = 20;
    public static final int CODE_FILE_INVALID = -2;
    public static final int CODE_INSTALL_BUSY = 14;
    public static final int CODE_INSTALL_LOW_BATTERY = 15;
    public static final int CODE_INSTALL_LOW_STORAGE = 11;
    public static final int CODE_INSTALL_LOW_STORAGE_CAN_REPLACE = 17;
    public static final int CODE_SUCCESS = 10;
    public static final int CODE_USED_NO_EDIT = 16;
    public static final int PROGRESS = 100;
    public static final int PROGRESS_DOWNLOAD = 1;
    public static final int PROGRESS_SPIRIT = 6;

    @NotNull
    public static final String TAG = "FaceBleEdit";

    public static final int getTip(int i) {
        if (i == -2) {
            return p1j.a0;
        }
        if (i == -1) {
            return p1j.common_download_fail;
        }
        if (i == 20) {
            return p1j.common_set_error;
        }
        switch (i) {
            case 11:
                return p1j.d0;
            case 12:
            case 13:
                return p1j.d0;
            case 14:
                return p1j.common_hint_device_busy;
            case 15:
                return p1j.common_hint_battery_low;
            case 16:
                return p1j.n2;
            default:
                return p1j.common_set_success;
        }
    }

    public static final boolean validZip(@Nullable String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        File file = new File(FaceManager.INSTANCE.getBleZip(str));
        return file.exists() && Intrinsics.areEqual(str, MD5Util.getFileMD5(file));
    }
}

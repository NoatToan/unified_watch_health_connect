package com.huami.bluetooth.profile.channel.module.file_transfer;

import com.baidu.ocr.sdk.utils.LogUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0001\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0019\u0010\u0003\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/file_transfer/FileType;", "", "", "value", LogUtil.I, "getValue", "()I", "<init>", "(Ljava/lang/String;II)V", "Companion", "FILE_UNKNOWN", "FILE_SYSTEM", "FILE_FLASH", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public enum FileType {
    FILE_UNKNOWN(255),
    FILE_SYSTEM(0),
    FILE_FLASH(1);


    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final int value;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/file_transfer/FileType$Companion;", "", "", "value", "Lcom/huami/bluetooth/profile/channel/module/file_transfer/FileType;", "fromValue", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final FileType fromValue(int value) {
            FileType[] fileTypeArrValues = FileType.values();
            int length = fileTypeArrValues.length;
            int i = 0;
            while (i < length) {
                FileType fileType = fileTypeArrValues[i];
                i++;
                if (fileType.getValue() == value) {
                    return fileType;
                }
            }
            return FileType.FILE_UNKNOWN;
        }
    }

    FileType(int i) {
        this.value = i;
    }

    public final int getValue() {
        return this.value;
    }
}

package com.huami.bluetooth.profile.channel.module.media;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.xiaomi.ai.api.AIApiConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\r\b\u0086\u0001\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0019\u0010\u0003\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/media/MediaSource;", "", "", "source", LogUtil.I, "getSource", "()I", "<init>", "(Ljava/lang/String;II)V", "Companion", "UNKNOWN", "ALEXA", AIApiConstants.NFC.NAME, "PHOTO_ALBUM", "SCHEDULE", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public enum MediaSource {
    UNKNOWN(0),
    ALEXA(1),
    NFC(2),
    PHOTO_ALBUM(3),
    SCHEDULE(4);


    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int DATA_SIZE = 2;
    private final int source;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0016\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/media/MediaSource$Companion;", "", "", "data", "Lcom/huami/bluetooth/profile/channel/module/media/MediaSource;", "fromBytes", "DATA_SIZE", LogUtil.I, "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final MediaSource fromBytes(int data) {
            MediaSource[] mediaSourceArrValues = MediaSource.values();
            int length = mediaSourceArrValues.length;
            int i = 0;
            while (i < length) {
                MediaSource mediaSource = mediaSourceArrValues[i];
                i++;
                if (mediaSource.getSource() == data) {
                    return mediaSource;
                }
            }
            return MediaSource.UNKNOWN;
        }
    }

    MediaSource(int i) {
        this.source = i;
    }

    public final int getSource() {
        return this.source;
    }
}

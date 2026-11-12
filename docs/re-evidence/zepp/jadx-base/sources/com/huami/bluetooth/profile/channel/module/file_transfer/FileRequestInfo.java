package com.huami.bluetooth.profile.channel.module.file_transfer;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.bluetooth.utils.BufByteDecoder;
import com.xiaomi.hm.health.bt.gatt.GattUtils;
import com.xiaomi.hm.health.bt.utils.ByteArrayKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.m;
import org.cybergarage.http.HTTP;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\t\n\u0002\b\u000f\b\u0016\u0018\u0000 #2\u00020\u0001:\u0001#BE\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\u0006\u0010\u0014\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0015\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0004\u0012\b\b\u0002\u0010 \u001a\u00020\u0004¢\u0006\u0004\b!\u0010\"J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0019\u0010\t\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0019\u0010\u000e\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0019\u0010\u0011\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\u0010\u0010\rR\u0019\u0010\u0014\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0006\u001a\u0004\b\u0013\u0010\bR\u0019\u0010\u001a\u001a\u00020\u00158\u0006@\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u001d\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0006\u001a\u0004\b\u001c\u0010\bR\u0019\u0010 \u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0006\u001a\u0004\b\u001f\u0010\b¨\u0006$"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/file_transfer/FileRequestInfo;", "", "", "toString", "", "a", LogUtil.I, "getSessionID", "()I", SDKConstants.PARAM_SESSION_ID, "b", "Ljava/lang/String;", "getUrl", "()Ljava/lang/String;", "url", "c", "getFileName", "fileName", GoogleApiAvailabilityLight.a, "getFileSize", "fileSize", "", "e", "J", "getFileCRC32", "()J", "fileCRC32", "f", "getCompressType", "compressType", "g", "getCompressBufSize", "compressBufSize", "<init>", "(ILjava/lang/String;Ljava/lang/String;IJII)V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public class FileRequestInfo {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final int sessionID;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private final String url;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @NotNull
    private final String fileName;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    private final int fileSize;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    private final long fileCRC32;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final int compressType;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final int compressBufSize;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002¨\u0006\n"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/file_transfer/FileRequestInfo$Companion;", "", "", "data", "Lcom/huami/bluetooth/profile/channel/module/file_transfer/FileRequestInfo;", "parseV2", HTTP.CONTENT_RANGE_BYTES, "parseV1", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {

        @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[FileType.values().length];
                iArr[FileType.FILE_SYSTEM.ordinal()] = 1;
                iArr[FileType.FILE_FLASH.ordinal()] = 2;
                $EnumSwitchMapping$0 = iArr;
            }
        }

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final FileRequestInfo parseV1(@NotNull byte[] bytes) throws Exception {
            String string;
            BufByteDecoder bufByteDecoder = new BufByteDecoder(null, 0, 3, null);
            bufByteDecoder.append(bytes);
            int i = bufByteDecoder.readByte();
            int i2 = WhenMappings.$EnumSwitchMapping$0[FileType.INSTANCE.fromValue(bufByteDecoder.readByte() & 255).ordinal()];
            if (i2 == 1) {
                string = bufByteDecoder.readString();
            } else {
                if (i2 != 2) {
                    throw new Exception("Not support file type");
                }
                string = m.replace$default(ByteArrayKt.toHexString(GattUtils.intToBytes(BufByteDecoder.readInt$default(bufByteDecoder, 0, 1, null))), " ", "", false, 4, (Object) null);
            }
            return new FileRequestInfo(i, "", string, BufByteDecoder.readInt$default(bufByteDecoder, 0, 1, null), 0L, 0, 0, 112, null);
        }

        @NotNull
        public final FileRequestInfo parseV2(@NotNull byte[] data) {
            Object objM3845constructorimpl;
            Object objM3845constructorimpl2;
            Object obj = 0;
            BufByteDecoder bufByteDecoder = new BufByteDecoder(null, 0, 3, null);
            bufByteDecoder.append(data);
            int i = bufByteDecoder.readByte();
            String string = bufByteDecoder.readString();
            String string2 = bufByteDecoder.readString();
            int int$default = BufByteDecoder.readInt$default(bufByteDecoder, 0, 1, null);
            long j = bufByteDecoder.readLong(4);
            try {
                Result.Companion companion = Result.Companion;
                objM3845constructorimpl = Result.m3845constructorimpl(Integer.valueOf(bufByteDecoder.readByte()));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
            }
            if (Result.m3848exceptionOrNullimpl(objM3845constructorimpl) != null) {
                objM3845constructorimpl = obj;
            }
            int iIntValue = ((Number) objM3845constructorimpl).intValue();
            try {
                Result.Companion companion3 = Result.Companion;
                objM3845constructorimpl2 = Result.m3845constructorimpl(Integer.valueOf(BufByteDecoder.readInt$default(bufByteDecoder, 0, 1, null)));
            } catch (Throwable th2) {
                Result.Companion companion4 = Result.Companion;
                objM3845constructorimpl2 = Result.m3845constructorimpl(ResultKt.createFailure(th2));
            }
            return new FileRequestInfo(i, string, string2, int$default, j, iIntValue, ((Number) (Result.m3848exceptionOrNullimpl(objM3845constructorimpl2) == null ? objM3845constructorimpl2 : 0)).intValue());
        }
    }

    public FileRequestInfo(int i, @NotNull String str, @NotNull String str2, int i2, long j, int i3, int i4) {
        this.sessionID = i;
        this.url = str;
        this.fileName = str2;
        this.fileSize = i2;
        this.fileCRC32 = j;
        this.compressType = i3;
        this.compressBufSize = i4;
    }

    public final int getCompressBufSize() {
        return this.compressBufSize;
    }

    public final int getCompressType() {
        return this.compressType;
    }

    public final long getFileCRC32() {
        return this.fileCRC32;
    }

    @NotNull
    public final String getFileName() {
        return this.fileName;
    }

    public final int getFileSize() {
        return this.fileSize;
    }

    public final int getSessionID() {
        return this.sessionID;
    }

    @NotNull
    public final String getUrl() {
        return this.url;
    }

    @NotNull
    public String toString() {
        return "FileRequestInfo(sessionID=" + this.sessionID + ", url='" + this.url + "', fileName='" + this.fileName + "', fileSize=" + this.fileSize + ", fileCRC32=" + this.fileCRC32 + ')';
    }

    public /* synthetic */ FileRequestInfo(int i, String str, String str2, int i2, long j, int i3, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, str2, i2, (i5 & 16) != 0 ? 0L : j, (i5 & 32) != 0 ? 0 : i3, (i5 & 64) != 0 ? 0 : i4);
    }
}

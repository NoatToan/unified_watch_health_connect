package com.mi.fitness.checkupdate.ota;

import com.xiaomi.fitness.common.utils.ByteUtilKt;
import com.xiaomi.fitness.common.utils.CRCUtil;
import com.xiaomi.onetrack.OneTrack;
import com.xiaomi.wearable.hm.BroadcastsKt;
import defpackage.u73;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0005\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\bÆ\u0002\u0018\u00002\u00020\u0001:\n\"#$%&'()*+B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u00012\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bJ\u0014\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00112\u0006\u0010\u001a\u001a\u00020\u001bJ\u0016\u0010\u001f\u001a\u00020\u00052\u0006\u0010 \u001a\u00020\u001b2\u0006\u0010!\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000¨\u0006,"}, d2 = {"Lcom/mi/fitness/checkupdate/ota/HyOtaModel;", "", "<init>", "()V", "MAX_SEGMENT_DATA_SIZE", "", "SERVICE_ID", "", "CMD_REQUIRE", "CMD_START", "CMD_DATA", "CMD_ERROR", "CMD_RESET", "CMD_PROGRESS", "CMD_SILENT_START", "CMD_SILENT_PAUSE", "BuildDataRequest", "", "Lcom/mi/fitness/checkupdate/ota/HyOtaModel$DataRequest;", "file", "Ljava/io/RandomAccessFile;", "requireResponse", "Lcom/mi/fitness/checkupdate/ota/HyOtaModel$DeviceRequireResponse;", "dataResponse", "Lcom/mi/fitness/checkupdate/ota/HyOtaModel$DataResponse;", "ParseResponse", "data", "", "ParseSegment", "Lcom/mi/fitness/checkupdate/ota/HyOtaModel$Segment;", "BuildRequest", "getBitmap", "retransmission", "index", "DeviceRequireRequest", "StartRequest", "ResetRequest", "DeviceRequireResponse", "DataResponse", "ErrorResponse", "ProgressReponse", "DataRequest", "PauseRequest", "Segment", "checkupdate_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class HyOtaModel {
    public static final byte CMD_DATA = 2;
    public static final byte CMD_ERROR = 3;
    public static final byte CMD_PROGRESS = 5;
    public static final byte CMD_REQUIRE = 0;
    public static final byte CMD_RESET = 4;
    public static final byte CMD_SILENT_PAUSE = 7;
    public static final byte CMD_SILENT_START = 6;
    public static final byte CMD_START = 1;

    @NotNull
    public static final HyOtaModel INSTANCE = new HyOtaModel();
    public static final int MAX_SEGMENT_DATA_SIZE = 4217;
    public static final byte SERVICE_ID = 10;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u0012\n\u0002\b\u0003\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000f\"\u0004\b\u0013\u0010\u0011R\u001a\u0010\u0007\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u000f\"\u0004\b\u0015\u0010\u0011R\u0011\u0010\u0016\u001a\u00020\u00178F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcom/mi/fitness/checkupdate/ota/HyOtaModel$DataRequest;", "", "file", "Ljava/io/RandomAccessFile;", "pageNo", "", "offset", "length", "<init>", "(Ljava/io/RandomAccessFile;III)V", "getFile", "()Ljava/io/RandomAccessFile;", "setFile", "(Ljava/io/RandomAccessFile;)V", "getPageNo", "()I", "setPageNo", "(I)V", "getOffset", "setOffset", "getLength", "setLength", "data", "", "getData", "()[B", "checkupdate_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class DataRequest {

        @NotNull
        private RandomAccessFile file;
        private int length;
        private int offset;
        private int pageNo;

        public DataRequest(@NotNull RandomAccessFile file, int i, int i2, int i3) {
            Intrinsics.checkNotNullParameter(file, "file");
            this.file = file;
            this.pageNo = i;
            this.offset = i2;
            this.length = i3;
        }

        @NotNull
        public final byte[] getData() throws IOException {
            byte[] bArr = new byte[this.length + 3];
            bArr[0] = 10;
            bArr[1] = 2;
            bArr[2] = (byte) this.pageNo;
            this.file.seek(this.offset);
            this.file.read(bArr, 3, this.length);
            return bArr;
        }

        @NotNull
        public final RandomAccessFile getFile() {
            return this.file;
        }

        public final int getLength() {
            return this.length;
        }

        public final int getOffset() {
            return this.offset;
        }

        public final int getPageNo() {
            return this.pageNo;
        }

        public final void setFile(@NotNull RandomAccessFile randomAccessFile) {
            Intrinsics.checkNotNullParameter(randomAccessFile, "<set-?>");
            this.file = randomAccessFile;
        }

        public final void setLength(int i) {
            this.length = i;
        }

        public final void setOffset(int i) {
            this.offset = i;
        }

        public final void setPageNo(int i) {
            this.pageNo = i;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0012\n\u0002\b\u0006\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u001a\u0010\r\u001a\u00020\u000eX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lcom/mi/fitness/checkupdate/ota/HyOtaModel$DataResponse;", "", "<init>", "()V", "offset", "", "getOffset", "()I", "setOffset", "(I)V", "length", "getLength", "setLength", "retransmission", "", "getRetransmission", "()[B", "setRetransmission", "([B)V", "Companion", "checkupdate_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class DataResponse {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);
        private int length;
        private int offset;
        public byte[] retransmission;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¨\u0006\b"}, d2 = {"Lcom/mi/fitness/checkupdate/ota/HyOtaModel$DataResponse$Companion;", "", "<init>", "()V", "parse", "Lcom/mi/fitness/checkupdate/ota/HyOtaModel$DataResponse;", "data", "", "checkupdate_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final DataResponse parse(@Nullable byte[] data) {
                DataResponse dataResponse = new DataResponse();
                dataResponse.setOffset(u73.g(u73.e(data, 0, 4), false));
                dataResponse.setLength(u73.g(u73.e(data, 4, 4), false));
                dataResponse.setRetransmission(u73.d(data, 8));
                return dataResponse;
            }
        }

        public final int getLength() {
            return this.length;
        }

        public final int getOffset() {
            return this.offset;
        }

        @NotNull
        public final byte[] getRetransmission() {
            byte[] bArr = this.retransmission;
            if (bArr != null) {
                return bArr;
            }
            Intrinsics.throwUninitializedPropertyAccessException("retransmission");
            return null;
        }

        public final void setLength(int i) {
            this.length = i;
        }

        public final void setOffset(int i) {
            this.offset = i;
        }

        public final void setRetransmission(@NotNull byte[] bArr) {
            Intrinsics.checkNotNullParameter(bArr, "<set-?>");
            this.retransmission = bArr;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/mi/fitness/checkupdate/ota/HyOtaModel$DeviceRequireRequest;", "", "<init>", "()V", "body", "", "getBody", "()[B", "checkupdate_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class DeviceRequireRequest {

        @NotNull
        public static final DeviceRequireRequest INSTANCE = new DeviceRequireRequest();

        private DeviceRequireRequest() {
        }

        @NotNull
        public final byte[] getBody() {
            return new byte[]{10, 0};
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\t\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000f¨\u0006\u0014"}, d2 = {"Lcom/mi/fitness/checkupdate/ota/HyOtaModel$DeviceRequireResponse;", "", "<init>", "()V", "packageMaxSize", "", "getPackageMaxSize", "()I", "setPackageMaxSize", "(I)V", "packageInterval", "", "getPackageInterval", "()J", "setPackageInterval", "(J)V", "timeout", "getTimeout", "setTimeout", "Companion", "checkupdate_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class DeviceRequireResponse {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);
        private long packageInterval;
        private int packageMaxSize;
        private long timeout;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/mi/fitness/checkupdate/ota/HyOtaModel$DeviceRequireResponse$Companion;", "", "<init>", "()V", "parse", "Lcom/mi/fitness/checkupdate/ota/HyOtaModel$DeviceRequireResponse;", "data", "", "checkupdate_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final DeviceRequireResponse parse(@NotNull byte[] data) {
                Intrinsics.checkNotNullParameter(data, "data");
                DeviceRequireResponse deviceRequireResponse = new DeviceRequireResponse();
                deviceRequireResponse.setPackageMaxSize(ByteUtilKt.and(data[0], 255) * 32);
                deviceRequireResponse.setPackageInterval(ByteUtilKt.and(data[1], 255) * 10);
                deviceRequireResponse.setTimeout(ByteUtilKt.and(data[2], 255) * 100);
                return deviceRequireResponse;
            }
        }

        public final long getPackageInterval() {
            return this.packageInterval;
        }

        public final int getPackageMaxSize() {
            return this.packageMaxSize;
        }

        public final long getTimeout() {
            return this.timeout;
        }

        public final void setPackageInterval(long j) {
            this.packageInterval = j;
        }

        public final void setPackageMaxSize(int i) {
            this.packageMaxSize = i;
        }

        public final void setTimeout(long j) {
            this.timeout = j;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lcom/mi/fitness/checkupdate/ota/HyOtaModel$ErrorResponse;", "", "<init>", "()V", "code", "", "getCode", "()I", "setCode", "(I)V", "desc", "", "getDesc", "()Ljava/lang/String;", "setDesc", "(Ljava/lang/String;)V", "Companion", "checkupdate_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ErrorResponse {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);
        private int code;

        @Nullable
        private String desc;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/mi/fitness/checkupdate/ota/HyOtaModel$ErrorResponse$Companion;", "", "<init>", "()V", "parse", "Lcom/mi/fitness/checkupdate/ota/HyOtaModel$ErrorResponse;", "data", "", "checkupdate_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final ErrorResponse parse(@NotNull byte[] data) {
                Intrinsics.checkNotNullParameter(data, "data");
                ErrorResponse errorResponse = new ErrorResponse();
                errorResponse.setCode(ByteUtilKt.and(data[0], 255));
                try {
                    byte[] bArrD = u73.d(data, 1);
                    Intrinsics.checkNotNullExpressionValue(bArrD, "get(...)");
                    errorResponse.setDesc(new String(bArrD, Charsets.UTF_8));
                } catch (UnsupportedEncodingException e) {
                    e.printStackTrace();
                    errorResponse.setDesc(u73.a(u73.d(data, 1)));
                }
                return errorResponse;
            }
        }

        public final int getCode() {
            return this.code;
        }

        @Nullable
        public final String getDesc() {
            return this.desc;
        }

        public final void setCode(int i) {
            this.code = i;
        }

        public final void setDesc(@Nullable String str) {
            this.desc = str;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/mi/fitness/checkupdate/ota/HyOtaModel$PauseRequest;", "", "<init>", "()V", "body", "", "getBody", "()[B", "checkupdate_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class PauseRequest {

        @NotNull
        public static final PauseRequest INSTANCE = new PauseRequest();

        private PauseRequest() {
        }

        @NotNull
        public final byte[] getBody() {
            return new byte[]{10, 7};
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/mi/fitness/checkupdate/ota/HyOtaModel$ProgressReponse;", "", "<init>", "()V", BroadcastsKt.SILENT_PUSHING_PROGRESS, "", "getProgress", "()I", "setProgress", "(I)V", "Companion", "checkupdate_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ProgressReponse {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);
        private int progress;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/mi/fitness/checkupdate/ota/HyOtaModel$ProgressReponse$Companion;", "", "<init>", "()V", "parse", "Lcom/mi/fitness/checkupdate/ota/HyOtaModel$ProgressReponse;", "data", "", "checkupdate_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final ProgressReponse parse(@NotNull byte[] data) {
                Intrinsics.checkNotNullParameter(data, "data");
                ProgressReponse progressReponse = new ProgressReponse();
                progressReponse.setProgress(ByteUtilKt.and(data[0], 255));
                return progressReponse;
            }
        }

        public final int getProgress() {
            return this.progress;
        }

        public final void setProgress(int i) {
            this.progress = i;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/mi/fitness/checkupdate/ota/HyOtaModel$ResetRequest;", "", "<init>", "()V", "body", "", "getBody", "()[B", "checkupdate_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ResetRequest {

        @NotNull
        public static final ResetRequest INSTANCE = new ResetRequest();

        private ResetRequest() {
        }

        @NotNull
        public final byte[] getBody() {
            return new byte[]{10, 4};
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t¨\u0006\n"}, d2 = {"Lcom/mi/fitness/checkupdate/ota/HyOtaModel$StartRequest;", "", "<init>", "()V", "getBody", "", "silent", "", "fileSize", "", "checkupdate_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class StartRequest {

        @NotNull
        public static final StartRequest INSTANCE = new StartRequest();

        private StartRequest() {
        }

        @NotNull
        public final byte[] getBody(boolean silent, long fileSize) {
            byte[] bArrB = u73.b((int) fileSize, false);
            byte[] bArrB2 = u73.b(1024, false);
            byte[] bArr = new byte[10];
            bArr[0] = 10;
            bArr[1] = silent ? (byte) 6 : (byte) 1;
            System.arraycopy(bArrB, 0, bArr, 2, 4);
            System.arraycopy(bArrB2, 0, bArr, 6, 4);
            return bArr;
        }
    }

    private HyOtaModel() {
    }

    @NotNull
    public final List<DataRequest> BuildDataRequest(@NotNull RandomAccessFile file, @NotNull DeviceRequireResponse requireResponse, @NotNull DataResponse dataResponse) throws IOException {
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(requireResponse, "requireResponse");
        Intrinsics.checkNotNullParameter(dataResponse, "dataResponse");
        ArrayList arrayList = new ArrayList();
        int length = dataResponse.getLength();
        int packageMaxSize = requireResponse.getPackageMaxSize();
        int i = length % packageMaxSize == 0 ? length / packageMaxSize : (length / packageMaxSize) + 1;
        for (int i2 = 0; i2 < i; i2++) {
            if (getBitmap(dataResponse.getRetransmission(), i2) == 1) {
                arrayList.add(new DataRequest(file, i2, dataResponse.getOffset() + (i2 * packageMaxSize), (i2 + 1) * packageMaxSize > length ? length - (i2 * packageMaxSize) : packageMaxSize));
            }
        }
        return arrayList;
    }

    @NotNull
    public final List<Segment> BuildRequest(@NotNull byte[] data) {
        byte b2;
        Intrinsics.checkNotNullParameter(data, "data");
        ArrayList arrayList = new ArrayList();
        int length = data.length;
        int i = length % MAX_SEGMENT_DATA_SIZE == 0 ? length / MAX_SEGMENT_DATA_SIZE : (length / MAX_SEGMENT_DATA_SIZE) + 1;
        int i2 = 0;
        while (i2 < i) {
            int i3 = i2 + 1;
            int i4 = i3 * MAX_SEGMENT_DATA_SIZE > length ? length - (i2 * MAX_SEGMENT_DATA_SIZE) : MAX_SEGMENT_DATA_SIZE;
            if (i <= 1) {
                b2 = 0;
            } else if (i2 == 0) {
                b2 = 1;
            } else {
                b2 = i2 == i + (-1) ? (byte) 3 : (byte) 2;
            }
            arrayList.add(new Segment(u73.e(data, i2 * MAX_SEGMENT_DATA_SIZE, i4), b2, i2));
            i2 = i3;
        }
        return arrayList;
    }

    @Nullable
    public final Object ParseResponse(@Nullable byte[] data) {
        if (data == null) {
            return null;
        }
        try {
            if (data.length < 2 || data[0] != 10) {
                return null;
            }
            byte b2 = data[1];
            if (b2 == 0) {
                DeviceRequireResponse.Companion companion = DeviceRequireResponse.INSTANCE;
                byte[] bArrD = u73.d(data, 2);
                Intrinsics.checkNotNullExpressionValue(bArrD, "get(...)");
                return companion.parse(bArrD);
            }
            if (b2 == 2) {
                return DataResponse.INSTANCE.parse(u73.d(data, 2));
            }
            if (b2 == 3) {
                ErrorResponse.Companion companion2 = ErrorResponse.INSTANCE;
                byte[] bArrD2 = u73.d(data, 2);
                Intrinsics.checkNotNullExpressionValue(bArrD2, "get(...)");
                return companion2.parse(bArrD2);
            }
            if (b2 != 5) {
                return null;
            }
            ProgressReponse.Companion companion3 = ProgressReponse.INSTANCE;
            byte[] bArrD3 = u73.d(data, 2);
            Intrinsics.checkNotNullExpressionValue(bArrD3, "get(...)");
            return companion3.parse(bArrD3);
        } catch (Exception unused) {
            return null;
        }
    }

    @Nullable
    public final Segment ParseSegment(@Nullable byte[] data) {
        if (data != null && data.length > 5 && data[0] == 90) {
            short sI = u73.i(u73.e(data, 1, 2), false);
            if (sI + 5 == data.length) {
                return new Segment(u73.e(data, 5, sI - 2), data[3], ByteUtilKt.and(data[4], 255));
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0019  */
    /* JADX WARN: Code duplicated, block: B:20:0x0026  */
    /* JADX WARN: Code duplicated, block: B:22:0x002a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:27:0x0036  */
    public final int getBitmap(@NotNull byte[] retransmission, int index) {
        int i;
        Intrinsics.checkNotNullParameter(retransmission, "retransmission");
        int i2 = 8;
        if (index >= 8) {
            if (8 <= index || index >= 16 || retransmission.length <= 1) {
                i2 = 24;
                if (16 > index && index < 24 && retransmission.length > 2) {
                    i = retransmission[2];
                    index -= 16;
                } else {
                    if (24 <= index || index >= 32 || retransmission.length <= 3) {
                        return 0;
                    }
                    i = retransmission[3];
                }
            } else {
                i = retransmission[1];
            }
            index -= i2;
        } else {
            if (!(!(retransmission.length == 0))) {
                if (8 <= index) {
                    i2 = 24;
                    if (16 > index) {
                    }
                    if (24 <= index) {
                    }
                    return 0;
                }
                i2 = 24;
                if (16 > index) {
                }
                if (24 <= index) {
                }
                return 0;
            }
            i = retransmission[0];
        }
        return (i >> index) & 1;
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001b\u0018\u00002\u00020\u0001B#\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tB3\b\u0016\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\u0006\u0010\r\u001a\u00020\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\u000eJ\u0006\u0010%\u001a\u00020\u0003R\u001a\u0010\u000f\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001a\u0010\f\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0016\"\u0004\b\"\u0010\u0018R\u001a\u0010\r\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0016\"\u0004\b$\u0010\u0018¨\u0006&"}, d2 = {"Lcom/mi/fitness/checkupdate/ota/HyOtaModel$Segment;", "", "data", "", "flag", "", "num", "", "<init>", "([BBI)V", "file", "Ljava/io/RandomAccessFile;", "offset", "length", "(Ljava/io/RandomAccessFile;IIBI)V", "segmentFlag", "getSegmentFlag", "()B", "setSegmentFlag", "(B)V", "frameNumber", "getFrameNumber", "()I", "setFrameNumber", "(I)V", "getData", "()[B", "setData", "([B)V", "getFile", "()Ljava/io/RandomAccessFile;", "setFile", "(Ljava/io/RandomAccessFile;)V", "getOffset", "setOffset", "getLength", "setLength", OneTrack.Param.BUILD, "checkupdate_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Segment {

        @Nullable
        private byte[] data;

        @Nullable
        private RandomAccessFile file;
        private int frameNumber;
        private int length;
        private int offset;
        private byte segmentFlag;

        public Segment(@Nullable byte[] bArr, byte b2, int i) {
            this.data = bArr;
            this.segmentFlag = b2;
            this.frameNumber = i;
        }

        @NotNull
        public final byte[] build() throws IOException {
            byte[] bArr = this.data;
            if (bArr != null) {
                Intrinsics.checkNotNull(bArr);
                int length = bArr.length;
                byte[] bArr2 = new byte[length + 7];
                bArr2[0] = 90;
                byte[] bArrC = u73.c(length + 2, false, 2);
                bArr2[1] = bArrC[0];
                bArr2[2] = bArrC[1];
                bArr2[3] = this.segmentFlag;
                bArr2[4] = (byte) this.frameNumber;
                System.arraycopy(this.data, 0, bArr2, 5, length);
                int i = length + 4;
                byte[] bArrE = u73.e(bArr2, 1, i);
                Intrinsics.checkNotNullExpressionValue(bArrE, "get(...)");
                byte[] bArrC2 = u73.c(CRCUtil.CRC16(i, bArrE), false, 2);
                bArr2[length + 5] = bArrC2[0];
                bArr2[length + 6] = bArrC2[1];
                return bArr2;
            }
            int i2 = this.length;
            byte[] bArr3 = new byte[i2 + 7];
            bArr3[0] = 90;
            byte[] bArrC3 = u73.c(i2 + 2, false, 2);
            bArr3[1] = bArrC3[0];
            bArr3[2] = bArrC3[1];
            bArr3[3] = this.segmentFlag;
            bArr3[4] = (byte) this.frameNumber;
            RandomAccessFile randomAccessFile = this.file;
            Intrinsics.checkNotNull(randomAccessFile);
            randomAccessFile.seek(this.offset);
            RandomAccessFile randomAccessFile2 = this.file;
            Intrinsics.checkNotNull(randomAccessFile2);
            randomAccessFile2.read(bArr3, 5, this.length);
            int i3 = this.length;
            int i4 = i3 + 4;
            byte[] bArrE2 = u73.e(bArr3, 1, i3 + 4);
            Intrinsics.checkNotNullExpressionValue(bArrE2, "get(...)");
            byte[] bArrC4 = u73.c(CRCUtil.CRC16(i4, bArrE2), false, 2);
            int i5 = this.length;
            bArr3[i5 + 5] = bArrC4[0];
            bArr3[i5 + 6] = bArrC4[1];
            return bArr3;
        }

        @Nullable
        public final byte[] getData() {
            return this.data;
        }

        @Nullable
        public final RandomAccessFile getFile() {
            return this.file;
        }

        public final int getFrameNumber() {
            return this.frameNumber;
        }

        public final int getLength() {
            return this.length;
        }

        public final int getOffset() {
            return this.offset;
        }

        public final byte getSegmentFlag() {
            return this.segmentFlag;
        }

        public final void setData(@Nullable byte[] bArr) {
            this.data = bArr;
        }

        public final void setFile(@Nullable RandomAccessFile randomAccessFile) {
            this.file = randomAccessFile;
        }

        public final void setFrameNumber(int i) {
            this.frameNumber = i;
        }

        public final void setLength(int i) {
            this.length = i;
        }

        public final void setOffset(int i) {
            this.offset = i;
        }

        public final void setSegmentFlag(byte b2) {
            this.segmentFlag = b2;
        }

        public Segment(@Nullable RandomAccessFile randomAccessFile, int i, int i2, byte b2, int i3) {
            this.file = randomAccessFile;
            this.offset = i;
            this.length = i2;
            this.segmentFlag = b2;
            this.frameNumber = i3;
        }
    }
}

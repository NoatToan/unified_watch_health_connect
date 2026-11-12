package com.xiaomi.fit.data.common.data.mi;

import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\u0004\u0010\bJ\b\u0010\u001b\u001a\u00020\u0007H\u0002J\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0007H\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006 "}, d2 = {"Lcom/xiaomi/fit/data/common/data/mi/FitnessDataHeader;", "", "dataId", "Lcom/xiaomi/fit/data/common/data/mi/FitnessDataId;", "<init>", "(Lcom/xiaomi/fit/data/common/data/mi/FitnessDataId;)V", "dataValid", "", "(Lcom/xiaomi/fit/data/common/data/mi/FitnessDataId;[B)V", "getDataId", "()Lcom/xiaomi/fit/data/common/data/mi/FitnessDataId;", "headerLen", "", "getHeaderLen", "()I", "dataValidLen", "getDataValidLen", "getDataValid", "()[B", "setDataValid", "([B)V", "dataInvalidVersion", "", "getDataInvalidVersion", "()Z", "setDataInvalidVersion", "(Z)V", "toHeaderBytes", "parseDataValid", "", "headerBytes", "Companion", "fitness-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nFitnessDataHeader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FitnessDataHeader.kt\ncom/xiaomi/fit/data/common/data/mi/FitnessDataHeader\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,151:1\n1#2:152\n*E\n"})
public final class FitnessDataHeader {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String TAG = "FitnessDataHeader";

    @NotNull
    private final FitnessDataId dataId;
    private boolean dataInvalidVersion;

    @Nullable
    private byte[] dataValid;
    private final int dataValidLen;
    private final int headerLen;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ\u0016\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000bJ\u0018\u0010\u000e\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0010J \u0010\u0011\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0010R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/xiaomi/fit/data/common/data/mi/FitnessDataHeader$Companion;", "", "<init>", "()V", "TAG", "", "parseDataHeader", "Lcom/xiaomi/fit/data/common/data/mi/FitnessDataHeader;", "dataId", "Lcom/xiaomi/fit/data/common/data/mi/FitnessDataId;", "headerBytes", "", "toDataHeaderBytes", "dataValid", "getSportDataId", "fileType", "", "getDailyDataId", "dailyType", "fitness-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final FitnessDataId getDailyDataId(@NotNull byte[] headerBytes, int dailyType, int fileType) {
            Intrinsics.checkNotNullParameter(headerBytes, "headerBytes");
            int length = headerBytes.length;
            if (length >= 6) {
                ByteBuffer byteBufferOrder = ByteBuffer.wrap(headerBytes).order(ByteOrder.LITTLE_ENDIAN);
                long j = ((long) byteBufferOrder.getInt()) & 4294967295L;
                return new FitnessDataId.Builder().timeStampInSec(j).timeZoneIn15Min(byteBufferOrder.get()).version(byteBufferOrder.get()).dailyType(dailyType).fileType(fileType).build();
            }
            FitnessLogUtils.w(FitnessDataHeader.TAG, "headerLen(" + length + ") < 6");
            return null;
        }

        @Nullable
        public final FitnessDataId getSportDataId(@NotNull byte[] headerBytes, int fileType) {
            Intrinsics.checkNotNullParameter(headerBytes, "headerBytes");
            if (headerBytes.length < 7) {
                return null;
            }
            ByteBuffer byteBufferOrder = ByteBuffer.wrap(headerBytes).order(ByteOrder.LITTLE_ENDIAN);
            long j = ((long) byteBufferOrder.getInt()) & 4294967295L;
            byte b2 = byteBufferOrder.get();
            byte b3 = byteBufferOrder.get();
            return new FitnessDataId.Builder().timeStampInSec(j).timeZoneIn15Min(b2).version(b3).sportType(byteBufferOrder.get()).fileType(fileType).build();
        }

        @Nullable
        public final FitnessDataHeader parseDataHeader(@NotNull FitnessDataId dataId, @NotNull byte[] headerBytes) {
            Intrinsics.checkNotNullParameter(dataId, "dataId");
            Intrinsics.checkNotNullParameter(headerBytes, "headerBytes");
            FitnessDataHeader fitnessDataHeader = new FitnessDataHeader(dataId);
            fitnessDataHeader.parseDataValid(headerBytes);
            if (fitnessDataHeader.getDataValid() != null || FitnessDataValidity.INSTANCE.checkSupport(fitnessDataHeader.getDataValidLen())) {
                return fitnessDataHeader;
            }
            fitnessDataHeader.setDataInvalidVersion(true);
            return fitnessDataHeader;
        }

        @NotNull
        public final byte[] toDataHeaderBytes(@NotNull FitnessDataId dataId, @NotNull byte[] dataValid) {
            Intrinsics.checkNotNullParameter(dataId, "dataId");
            Intrinsics.checkNotNullParameter(dataValid, "dataValid");
            return new FitnessDataHeader(dataId, dataValid).toHeaderBytes();
        }
    }

    public FitnessDataHeader(@NotNull FitnessDataId dataId) {
        Intrinsics.checkNotNullParameter(dataId, "dataId");
        this.dataId = dataId;
        int serverDataIdLen = dataId.getServerDataIdLen();
        int dataValidityLen = FitnessDataValidity.INSTANCE.getDataValidityLen(dataId);
        this.dataValidLen = dataValidityLen;
        this.headerLen = serverDataIdLen + 1 + dataValidityLen;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void parseDataValid(byte[] headerBytes) {
        if (headerBytes.length == 0) {
            FitnessLogUtils.w(TAG, "empty header data");
            return;
        }
        if (!FitnessDataValidity.INSTANCE.checkSupport(this.dataValidLen)) {
            FitnessLogUtils.w(TAG, "not support dataValidLen = " + this.dataValidLen);
            return;
        }
        int length = headerBytes.length;
        int i = this.headerLen;
        if (length < i) {
            FitnessLogUtils.w(TAG, "invalid header data, headerLen = " + i);
            return;
        }
        int i2 = this.dataValidLen;
        if (i > i2) {
            ByteBuffer byteBufferOrder = ByteBuffer.wrap(headerBytes).order(ByteOrder.LITTLE_ENDIAN);
            byteBufferOrder.get(new byte[this.headerLen - this.dataValidLen]);
            byte[] bArr = new byte[this.dataValidLen];
            byteBufferOrder.get(bArr);
            this.dataValid = bArr;
            return;
        }
        FitnessLogUtils.w(TAG, "dataValidLen = " + i2 + " is more length than headerLen = " + i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final byte[] toHeaderBytes() {
        if (this.dataValid == null) {
            throw new IllegalArgumentException("empty data valid".toString());
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(this.headerLen);
        byteBufferAllocate.put(this.dataId.convertToServerDataId()).put((byte) 0).put(this.dataValid);
        byte[] bArrArray = byteBufferAllocate.array();
        Intrinsics.checkNotNullExpressionValue(bArrArray, "array(...)");
        return bArrArray;
    }

    @NotNull
    public final FitnessDataId getDataId() {
        return this.dataId;
    }

    public final boolean getDataInvalidVersion() {
        return this.dataInvalidVersion;
    }

    @Nullable
    public final byte[] getDataValid() {
        return this.dataValid;
    }

    public final int getDataValidLen() {
        return this.dataValidLen;
    }

    public final int getHeaderLen() {
        return this.headerLen;
    }

    public final void setDataInvalidVersion(boolean z) {
        this.dataInvalidVersion = z;
    }

    public final void setDataValid(@Nullable byte[] bArr) {
        this.dataValid = bArr;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FitnessDataHeader(@NotNull FitnessDataId dataId, @NotNull byte[] dataValid) {
        this(dataId);
        Intrinsics.checkNotNullParameter(dataId, "dataId");
        Intrinsics.checkNotNullParameter(dataValid, "dataValid");
        this.dataValid = dataValid;
        int i = this.dataValidLen;
        if (i == dataValid.length) {
            return;
        }
        throw new IllegalArgumentException(("not equal data valid len = " + i).toString());
    }
}

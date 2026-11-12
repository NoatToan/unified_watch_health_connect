package com.xiaomi.fitness.research.sync.receive;

import com.xiaomi.fit.data.common.data.mi.FitnessDataId;
import com.xiaomi.fit.fitness.parser.schema.DailyRecordKey;
import com.xiaomi.fitness.sport_eco.SportConstants;
import com.xiaomi.onetrack.OneTrack;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0011\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 .2\u00020\u0001:\u0002-.B\u0011\b\u0012\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005B\u0013\b\u0016\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0004\u0010\bJ\u0006\u0010 \u001a\u00020\u0007J\u0006\u0010!\u001a\u00020\nJ\u0006\u0010\"\u001a\u00020\u0007J\u0006\u0010#\u001a\u00020$J\b\u0010%\u001a\u00020&H\u0016J\u0006\u0010'\u001a\u00020\nJ\u0013\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\u0006\u0010+\u001a\u00020,R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\f\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0017\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\fR\u0011\u0010\u0019\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\fR\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u001d\u001a\u00020\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0014\"\u0004\b\u001f\u0010\u0016¨\u0006/"}, d2 = {"Lcom/xiaomi/fitness/research/sync/receive/ResearchDataId;", "", "builder", "Lcom/xiaomi/fitness/research/sync/receive/ResearchDataId$Builder;", "<init>", "(Lcom/xiaomi/fitness/research/sync/receive/ResearchDataId$Builder;)V", "bytes", "", "([B)V", "fileType", "", "getFileType", "()I", "dailyType", "getDailyType", "setDailyType", "(I)V", SportConstants.KEY_TIMESTAMP, "", "getTimeStamp", "()J", "setTimeStamp", "(J)V", "tzIn15Min", "getTzIn15Min", "version", "getVersion", "dataIdBytes", "serverIdBytes", "researchId", "getResearchId", "setResearchId", "convertToServerDataId", "getServerDataIdLen", "toByteArray", "genDataTypeByte", "", "toString", "", "getTzOffsetInSec", "equals", "", "other", "copy", "Lcom/xiaomi/fit/data/common/data/mi/FitnessDataId$Builder;", "Builder", "Companion", "research-support_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nResearchDataId.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ResearchDataId.kt\ncom/xiaomi/fitness/research/sync/receive/ResearchDataId\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,192:1\n1#2:193\n*E\n"})
public final class ResearchDataId {
    public static final int LENGTH_DATA_ID = 11;
    public static final int LENGTH_SERVER_DAILY_ID = 6;
    public static final int LENGTH_SERVER_SPORT_ID = 7;
    private int dailyType;

    @Nullable
    private byte[] dataIdBytes;
    private final int fileType;
    private long researchId;

    @Nullable
    private byte[] serverIdBytes;
    private long timeStamp;
    private final int tzIn15Min;
    private final int version;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u001f\u001a\u00020 J\u000e\u0010!\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0014J\u0016\u0010\"\u001a\u00020\u00002\u0006\u0010#\u001a\u00020\u00142\u0006\u0010\u001f\u001a\u00020 J\u000e\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u0005J\u000e\u0010$\u001a\u00020\u00002\u0006\u0010\"\u001a\u00020\u0005J\u000e\u0010\r\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u0005J\u000e\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0005J\u000e\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0005J\u0006\u0010%\u001a\u00020&R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u001a\u0010\r\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0007\"\u0004\b\u000f\u0010\tR\u001a\u0010\u0010\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0007\"\u0004\b\u0012\u0010\tR\u001a\u0010\u0013\u001a\u00020\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0007\"\u0004\b\u001b\u0010\tR\u001a\u0010\u001c\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0007\"\u0004\b\u001e\u0010\t¨\u0006'"}, d2 = {"Lcom/xiaomi/fitness/research/sync/receive/ResearchDataId$Builder;", "", "<init>", "()V", "fileType", "", "getFileType", "()I", "setFileType", "(I)V", "dataType", "getDataType", "setDataType", DailyRecordKey.sportType, "getSportType", "setSportType", "dailyType", "getDailyType", "setDailyType", SportConstants.KEY_TIMESTAMP, "", "getTimeStamp", "()J", "setTimeStamp", "(J)V", "tzIn15Min", "getTzIn15Min", "setTzIn15Min", "version", "getVersion", "setVersion", "unit", "Ljava/util/concurrent/TimeUnit;", "timeStampInSec", "timeZone", "offset", "timeZoneIn15Min", OneTrack.Param.BUILD, "Lcom/xiaomi/fitness/research/sync/receive/ResearchDataId;", "research-support_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Builder {
        private int dailyType;
        private int dataType;
        private int fileType;
        private int sportType;
        private long timeStamp;
        private int tzIn15Min;
        private int version;

        @NotNull
        public final ResearchDataId build() {
            return new ResearchDataId(this, null);
        }

        @NotNull
        public final Builder dailyType(int dailyType) {
            this.dataType = 0;
            this.dailyType = dailyType;
            return this;
        }

        @NotNull
        public final Builder fileType(int fileType) {
            this.fileType = fileType;
            return this;
        }

        public final int getDailyType() {
            return this.dailyType;
        }

        public final int getDataType() {
            return this.dataType;
        }

        public final int getFileType() {
            return this.fileType;
        }

        public final int getSportType() {
            return this.sportType;
        }

        public final long getTimeStamp() {
            return this.timeStamp;
        }

        public final int getTzIn15Min() {
            return this.tzIn15Min;
        }

        public final int getVersion() {
            return this.version;
        }

        public final void setDailyType(int i) {
            this.dailyType = i;
        }

        public final void setDataType(int i) {
            this.dataType = i;
        }

        public final void setFileType(int i) {
            this.fileType = i;
        }

        public final void setSportType(int i) {
            this.sportType = i;
        }

        public final void setTimeStamp(long j) {
            this.timeStamp = j;
        }

        public final void setTzIn15Min(int i) {
            this.tzIn15Min = i;
        }

        public final void setVersion(int i) {
            this.version = i;
        }

        @NotNull
        public final Builder sportType(int sportType) {
            this.dataType = 1;
            this.sportType = sportType;
            return this;
        }

        @NotNull
        public final Builder timeStamp(long timeStamp, @NotNull TimeUnit unit) {
            Intrinsics.checkNotNullParameter(unit, "unit");
            this.timeStamp = unit.toSeconds(timeStamp);
            return this;
        }

        @NotNull
        public final Builder timeStampInSec(long timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }

        @NotNull
        public final Builder timeZone(long offset, @NotNull TimeUnit unit) {
            Intrinsics.checkNotNullParameter(unit, "unit");
            this.tzIn15Min = (int) (unit.toMinutes(offset) / ((long) 15));
            return this;
        }

        @NotNull
        public final Builder timeZoneIn15Min(int timeZone) {
            this.tzIn15Min = timeZone;
            return this;
        }

        @NotNull
        public final Builder version(int version) {
            this.version = version;
            return this;
        }
    }

    public /* synthetic */ ResearchDataId(Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
        this(builder);
    }

    @NotNull
    public final byte[] convertToServerDataId() {
        byte[] bArr = this.serverIdBytes;
        if (bArr != null) {
            Intrinsics.checkNotNull(bArr);
            return bArr;
        }
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(getServerDataIdLen()).order(ByteOrder.LITTLE_ENDIAN);
        byteBufferOrder.putInt((int) this.timeStamp);
        byteBufferOrder.put((byte) this.tzIn15Min);
        byteBufferOrder.put((byte) this.version);
        byteBufferOrder.put(genDataTypeByte());
        byteBufferOrder.putInt((int) this.researchId);
        byte[] bArrArray = byteBufferOrder.array();
        this.serverIdBytes = bArrArray;
        Intrinsics.checkNotNull(bArrArray);
        return bArrArray;
    }

    @NotNull
    public final FitnessDataId.Builder copy() {
        FitnessDataId.Builder builderVersion = new FitnessDataId.Builder().timeStampInSec(this.timeStamp).timeZoneIn15Min(this.tzIn15Min).fileType(this.fileType).version(this.version);
        builderVersion.dailyType(this.dailyType);
        return builderVersion;
    }

    public boolean equals(@Nullable Object other) {
        if (other == null || !(other instanceof ResearchDataId)) {
            return false;
        }
        if (other == this) {
            return true;
        }
        return Arrays.equals(toByteArray(), ((ResearchDataId) other).toByteArray());
    }

    public final byte genDataTypeByte() {
        return (byte) (this.fileType + (this.dailyType << 2));
    }

    public final int getDailyType() {
        return this.dailyType;
    }

    public final int getFileType() {
        return this.fileType;
    }

    public final long getResearchId() {
        return this.researchId;
    }

    public final int getServerDataIdLen() {
        return 11;
    }

    public final long getTimeStamp() {
        return this.timeStamp;
    }

    public final int getTzIn15Min() {
        return this.tzIn15Min;
    }

    public final int getTzOffsetInSec() {
        return (int) TimeUnit.MINUTES.toSeconds(this.tzIn15Min * 15);
    }

    public final int getVersion() {
        return this.version;
    }

    public final void setDailyType(int i) {
        this.dailyType = i;
    }

    public final void setResearchId(long j) {
        this.researchId = j;
    }

    public final void setTimeStamp(long j) {
        this.timeStamp = j;
    }

    @NotNull
    public final byte[] toByteArray() {
        if (this.dataIdBytes == null) {
            ByteBuffer byteBufferOrder = ByteBuffer.allocate(11).order(ByteOrder.LITTLE_ENDIAN);
            byteBufferOrder.putInt((int) this.timeStamp);
            byteBufferOrder.put((byte) this.tzIn15Min);
            byteBufferOrder.put((byte) this.version);
            byteBufferOrder.put(genDataTypeByte());
            byteBufferOrder.putInt((int) this.researchId);
            this.dataIdBytes = byteBufferOrder.array();
        }
        byte[] bArr = this.dataIdBytes;
        Intrinsics.checkNotNull(bArr);
        return bArr;
    }

    @NotNull
    public String toString() {
        return "timeStamp = " + this.timeStamp + ", timeZone = " + this.tzIn15Min + ", dailyType = " + this.dailyType + ", fileType = " + this.fileType + ", version = " + this.version + ",researchId = " + this.researchId;
    }

    private ResearchDataId(Builder builder) {
        this.fileType = builder.getFileType();
        this.dailyType = builder.getDailyType();
        this.timeStamp = builder.getTimeStamp();
        this.tzIn15Min = builder.getTzIn15Min();
        this.version = builder.getVersion();
    }

    public ResearchDataId(@Nullable byte[] bArr) {
        if (bArr != null && bArr.length >= 11) {
            ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
            this.timeStamp = ((long) byteBufferOrder.getInt()) & 4294967295L;
            this.tzIn15Min = byteBufferOrder.get();
            this.version = byteBufferOrder.get();
            byte b2 = byteBufferOrder.get();
            this.dailyType = (b2 & 255) >>> 2;
            this.fileType = b2 & 3;
            this.researchId = ((long) byteBufferOrder.getInt()) & 4294967295L;
            return;
        }
        throw new IllegalArgumentException("illegal dataId".toString());
    }
}

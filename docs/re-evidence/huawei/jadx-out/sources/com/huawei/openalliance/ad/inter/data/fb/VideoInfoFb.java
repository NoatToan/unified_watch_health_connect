package com.huawei.openalliance.ad.inter.data.fb;

import com.google.flatbuffers.BaseVector;
import com.google.flatbuffers.Constants;
import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.Table;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes41.dex */
public final class VideoInfoFb extends Table {
    public int videoType() {
        int i__offset = __offset(52);
        if (i__offset != 0) {
            return this.bb.getInt(i__offset + this.bb_pos);
        }
        return 0;
    }

    public float videoRatio() {
        int i__offset = __offset(40);
        if (i__offset != 0) {
            return this.bb.getFloat(i__offset + this.bb_pos);
        }
        return 0.0f;
    }

    public int videoPlayMode() {
        int i__offset = __offset(26);
        if (i__offset != 0) {
            return this.bb.getInt(i__offset + this.bb_pos);
        }
        return 1;
    }

    public int videoFileSize() {
        int i__offset = __offset(10);
        if (i__offset != 0) {
            return this.bb.getInt(i__offset + this.bb_pos);
        }
        return 0;
    }

    public int videoDuration() {
        int i__offset = __offset(8);
        if (i__offset != 0) {
            return this.bb.getInt(i__offset + this.bb_pos);
        }
        return 0;
    }

    public ByteBuffer videoDownloadUrlInByteBuffer(ByteBuffer byteBuffer) {
        return __vector_in_bytebuffer(byteBuffer, 4, 1);
    }

    public ByteBuffer videoDownloadUrlAsByteBuffer() {
        return __vector_as_bytebuffer(4, 1);
    }

    public String videoDownloadUrl() {
        int i__offset = __offset(4);
        if (i__offset != 0) {
            return __string(i__offset + this.bb_pos);
        }
        return null;
    }

    public ByteBuffer videoAutoPlayWithSoundInByteBuffer(ByteBuffer byteBuffer) {
        return __vector_in_bytebuffer(byteBuffer, 16, 1);
    }

    public ByteBuffer videoAutoPlayWithSoundAsByteBuffer() {
        return __vector_as_bytebuffer(16, 1);
    }

    public String videoAutoPlayWithSound() {
        int i__offset = __offset(16);
        if (i__offset != 0) {
            return __string(i__offset + this.bb_pos);
        }
        return null;
    }

    public ByteBuffer videoAutoPlayInByteBuffer(ByteBuffer byteBuffer) {
        return __vector_in_bytebuffer(byteBuffer, 12, 1);
    }

    public ByteBuffer videoAutoPlayAsByteBuffer() {
        return __vector_as_bytebuffer(12, 1);
    }

    public String videoAutoPlay() {
        int i__offset = __offset(12);
        if (i__offset != 0) {
            return __string(i__offset + this.bb_pos);
        }
        return null;
    }

    public ByteBuffer useTemplateInByteBuffer(ByteBuffer byteBuffer) {
        return __vector_in_bytebuffer(byteBuffer, 50, 1);
    }

    public ByteBuffer useTemplateAsByteBuffer() {
        return __vector_as_bytebuffer(50, 1);
    }

    public String useTemplate() {
        int i__offset = __offset(50);
        if (i__offset != 0) {
            return __string(i__offset + this.bb_pos);
        }
        return null;
    }

    public int timeBeforeVideoAutoPlay() {
        int i__offset = __offset(18);
        if (i__offset != 0) {
            return this.bb.getInt(i__offset + this.bb_pos);
        }
        return 200;
    }

    public float splashSwitchTime() {
        int i__offset = __offset(46);
        if (i__offset != 0) {
            return this.bb.getFloat(i__offset + this.bb_pos);
        }
        return 0.0f;
    }

    public ByteBuffer soundSwitchInByteBuffer(ByteBuffer byteBuffer) {
        return __vector_in_bytebuffer(byteBuffer, 24, 1);
    }

    public ByteBuffer soundSwitchAsByteBuffer() {
        return __vector_as_bytebuffer(24, 1);
    }

    public String soundSwitch() {
        int i__offset = __offset(24);
        if (i__offset != 0) {
            return __string(i__offset + this.bb_pos);
        }
        return null;
    }

    public boolean showSoundIcon() {
        int i__offset = __offset(42);
        return i__offset == 0 || this.bb.get(i__offset + this.bb_pos) != 0;
    }

    public ByteBuffer sha256InByteBuffer(ByteBuffer byteBuffer) {
        return __vector_in_bytebuffer(byteBuffer, 20, 1);
    }

    public ByteBuffer sha256AsByteBuffer() {
        return __vector_as_bytebuffer(20, 1);
    }

    public String sha256() {
        int i__offset = __offset(20);
        if (i__offset != 0) {
            return __string(i__offset + this.bb_pos);
        }
        return null;
    }

    public int playProgress() {
        int i__offset = __offset(22);
        if (i__offset != 0) {
            return this.bb.getInt(i__offset + this.bb_pos);
        }
        return 0;
    }

    public ByteBuffer originUrlInByteBuffer(ByteBuffer byteBuffer) {
        return __vector_in_bytebuffer(byteBuffer, 6, 1);
    }

    public ByteBuffer originUrlAsByteBuffer() {
        return __vector_as_bytebuffer(6, 1);
    }

    public String originUrl() {
        int i__offset = __offset(6);
        if (i__offset != 0) {
            return __string(i__offset + this.bb_pos);
        }
        return null;
    }

    public boolean needContinueAutoPlay() {
        int i__offset = __offset(30);
        return i__offset == 0 || this.bb.get(i__offset + this.bb_pos) != 0;
    }

    public ByteBuffer liveRoomNameInByteBuffer(ByteBuffer byteBuffer) {
        return __vector_in_bytebuffer(byteBuffer, 54, 1);
    }

    public ByteBuffer liveRoomNameAsByteBuffer() {
        return __vector_as_bytebuffer(54, 1);
    }

    public String liveRoomName() {
        int i__offset = __offset(54);
        if (i__offset != 0) {
            return __string(i__offset + this.bb_pos);
        }
        return null;
    }

    public int downloadNetwork() {
        int i__offset = __offset(38);
        if (i__offset != 0) {
            return this.bb.getInt(i__offset + this.bb_pos);
        }
        return 0;
    }

    public boolean directReturnVideoAd() {
        int i__offset = __offset(44);
        return (i__offset == 0 || this.bb.get(i__offset + this.bb_pos) == 0) ? false : true;
    }

    public int customExposureType() {
        int i__offset = __offset(48);
        if (i__offset != 0) {
            return this.bb.getInt(i__offset + this.bb_pos);
        }
        return 0;
    }

    public boolean checkSha256() {
        int i__offset = __offset(28);
        return (i__offset == 0 || this.bb.get(i__offset + this.bb_pos) == 0) ? false : true;
    }

    public boolean backFromFullScreen() {
        int i__offset = __offset(32);
        return (i__offset == 0 || this.bb.get(i__offset + this.bb_pos) == 0) ? false : true;
    }

    public int autoStopPlayAreaRatio() {
        int i__offset = __offset(36);
        if (i__offset != 0) {
            return this.bb.getInt(i__offset + this.bb_pos);
        }
        return 90;
    }

    public int autoPlayNetwork() {
        int i__offset = __offset(14);
        if (i__offset != 0) {
            return this.bb.getInt(i__offset + this.bb_pos);
        }
        return 0;
    }

    public int autoPlayAreaRatio() {
        int i__offset = __offset(34);
        if (i__offset != 0) {
            return this.bb.getInt(i__offset + this.bb_pos);
        }
        return 100;
    }

    public void __init(int i, ByteBuffer byteBuffer) {
        __reset(i, byteBuffer);
    }

    public VideoInfoFb __assign(int i, ByteBuffer byteBuffer) {
        __init(i, byteBuffer);
        return this;
    }

    public static void startVideoInfoFb(FlatBufferBuilder flatBufferBuilder) {
        flatBufferBuilder.startTable(26);
    }

    public static VideoInfoFb getRootAsVideoInfoFb(ByteBuffer byteBuffer, VideoInfoFb videoInfoFb) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return videoInfoFb.__assign(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public static VideoInfoFb getRootAsVideoInfoFb(ByteBuffer byteBuffer) {
        return getRootAsVideoInfoFb(byteBuffer, new VideoInfoFb());
    }

    public static int endVideoInfoFb(FlatBufferBuilder flatBufferBuilder) {
        return flatBufferBuilder.endTable();
    }

    public static int createVideoInfoFb(FlatBufferBuilder flatBufferBuilder, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, boolean z, boolean z2, boolean z3, int i13, int i14, int i15, float f, boolean z4, boolean z5, float f2, int i16, int i17, int i18, int i19) {
        flatBufferBuilder.startTable(26);
        addLiveRoomName(flatBufferBuilder, i19);
        addVideoType(flatBufferBuilder, i18);
        addUseTemplate(flatBufferBuilder, i17);
        addCustomExposureType(flatBufferBuilder, i16);
        addSplashSwitchTime(flatBufferBuilder, f2);
        addVideoRatio(flatBufferBuilder, f);
        addDownloadNetwork(flatBufferBuilder, i15);
        addAutoStopPlayAreaRatio(flatBufferBuilder, i14);
        addAutoPlayAreaRatio(flatBufferBuilder, i13);
        addVideoPlayMode(flatBufferBuilder, i12);
        addSoundSwitch(flatBufferBuilder, i11);
        addPlayProgress(flatBufferBuilder, i10);
        addSha256(flatBufferBuilder, i9);
        addTimeBeforeVideoAutoPlay(flatBufferBuilder, i8);
        addVideoAutoPlayWithSound(flatBufferBuilder, i7);
        addAutoPlayNetwork(flatBufferBuilder, i6);
        addVideoAutoPlay(flatBufferBuilder, i5);
        addVideoFileSize(flatBufferBuilder, i4);
        addVideoDuration(flatBufferBuilder, i3);
        addOriginUrl(flatBufferBuilder, i2);
        addVideoDownloadUrl(flatBufferBuilder, i);
        addDirectReturnVideoAd(flatBufferBuilder, z5);
        addShowSoundIcon(flatBufferBuilder, z4);
        addBackFromFullScreen(flatBufferBuilder, z3);
        addNeedContinueAutoPlay(flatBufferBuilder, z2);
        addCheckSha256(flatBufferBuilder, z);
        return endVideoInfoFb(flatBufferBuilder);
    }

    public static void addVideoType(FlatBufferBuilder flatBufferBuilder, int i) {
        flatBufferBuilder.addInt(24, i, 0);
    }

    public static void addVideoRatio(FlatBufferBuilder flatBufferBuilder, float f) {
        flatBufferBuilder.addFloat(18, f, 0.0d);
    }

    public static void addVideoPlayMode(FlatBufferBuilder flatBufferBuilder, int i) {
        flatBufferBuilder.addInt(11, i, 1);
    }

    public static void addVideoFileSize(FlatBufferBuilder flatBufferBuilder, int i) {
        flatBufferBuilder.addInt(3, i, 0);
    }

    public static void addVideoDuration(FlatBufferBuilder flatBufferBuilder, int i) {
        flatBufferBuilder.addInt(2, i, 0);
    }

    public static void addVideoDownloadUrl(FlatBufferBuilder flatBufferBuilder, int i) {
        flatBufferBuilder.addOffset(0, i, 0);
    }

    public static void addVideoAutoPlayWithSound(FlatBufferBuilder flatBufferBuilder, int i) {
        flatBufferBuilder.addOffset(6, i, 0);
    }

    public static void addVideoAutoPlay(FlatBufferBuilder flatBufferBuilder, int i) {
        flatBufferBuilder.addOffset(4, i, 0);
    }

    public static void addUseTemplate(FlatBufferBuilder flatBufferBuilder, int i) {
        flatBufferBuilder.addOffset(23, i, 0);
    }

    public static void addTimeBeforeVideoAutoPlay(FlatBufferBuilder flatBufferBuilder, int i) {
        flatBufferBuilder.addInt(7, i, 200);
    }

    public static void addSplashSwitchTime(FlatBufferBuilder flatBufferBuilder, float f) {
        flatBufferBuilder.addFloat(21, f, 0.0d);
    }

    public static void addSoundSwitch(FlatBufferBuilder flatBufferBuilder, int i) {
        flatBufferBuilder.addOffset(10, i, 0);
    }

    public static void addShowSoundIcon(FlatBufferBuilder flatBufferBuilder, boolean z) {
        flatBufferBuilder.addBoolean(19, z, true);
    }

    public static void addSha256(FlatBufferBuilder flatBufferBuilder, int i) {
        flatBufferBuilder.addOffset(8, i, 0);
    }

    public static void addPlayProgress(FlatBufferBuilder flatBufferBuilder, int i) {
        flatBufferBuilder.addInt(9, i, 0);
    }

    public static void addOriginUrl(FlatBufferBuilder flatBufferBuilder, int i) {
        flatBufferBuilder.addOffset(1, i, 0);
    }

    public static void addNeedContinueAutoPlay(FlatBufferBuilder flatBufferBuilder, boolean z) {
        flatBufferBuilder.addBoolean(13, z, true);
    }

    public static void addLiveRoomName(FlatBufferBuilder flatBufferBuilder, int i) {
        flatBufferBuilder.addOffset(25, i, 0);
    }

    public static void addDownloadNetwork(FlatBufferBuilder flatBufferBuilder, int i) {
        flatBufferBuilder.addInt(17, i, 0);
    }

    public static void addDirectReturnVideoAd(FlatBufferBuilder flatBufferBuilder, boolean z) {
        flatBufferBuilder.addBoolean(20, z, false);
    }

    public static void addCustomExposureType(FlatBufferBuilder flatBufferBuilder, int i) {
        flatBufferBuilder.addInt(22, i, 0);
    }

    public static void addCheckSha256(FlatBufferBuilder flatBufferBuilder, boolean z) {
        flatBufferBuilder.addBoolean(12, z, false);
    }

    public static void addBackFromFullScreen(FlatBufferBuilder flatBufferBuilder, boolean z) {
        flatBufferBuilder.addBoolean(14, z, false);
    }

    public static void addAutoStopPlayAreaRatio(FlatBufferBuilder flatBufferBuilder, int i) {
        flatBufferBuilder.addInt(16, i, 90);
    }

    public static final class Vector extends BaseVector {
        public VideoInfoFb get(VideoInfoFb videoInfoFb, int i) {
            return videoInfoFb.__assign(VideoInfoFb.__indirect(__element(i), this.bb), this.bb);
        }

        public VideoInfoFb get(int i) {
            return get(new VideoInfoFb(), i);
        }

        public Vector __assign(int i, int i2, ByteBuffer byteBuffer) {
            __reset(i, i2, byteBuffer);
            return this;
        }
    }

    public static void addAutoPlayNetwork(FlatBufferBuilder flatBufferBuilder, int i) {
        flatBufferBuilder.addInt(5, i, 0);
    }

    public static void addAutoPlayAreaRatio(FlatBufferBuilder flatBufferBuilder, int i) {
        flatBufferBuilder.addInt(15, i, 100);
    }

    public static void ValidateVersion() {
        Constants.FLATBUFFERS_23_5_26();
    }
}

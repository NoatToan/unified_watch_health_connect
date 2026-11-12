package androidx.media3.muxer;

import android.media.MediaCodec;
import androidx.core.internal.view.SupportMenu;
import androidx.media3.common.ColorInfo;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Util;
import androidx.media3.container.MdtaMetadataEntry;
import androidx.media3.container.Mp4LocationData;
import androidx.media3.container.NalUnitUtil;
import com.google.common.base.Ascii;
import com.google.common.collect.ImmutableList;
import com.huawei.health.device.open.data.model.HealthData;
import defpackage.amn;
import defpackage.apt;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes21.dex */
final class Boxes {
    public static final int BOX_HEADER_SIZE = 8;
    private static final int BYTES_PER_INTEGER = 4;
    private static final int MAX_FIXED_LEAF_BOX_SIZE = 200;
    public static final int MFHD_BOX_CONTENT_SIZE = 8;
    private static final long MVHD_TIMEBASE = 10000;
    public static final int TFHD_BOX_CONTENT_SIZE = 16;
    private static final int TRUN_BOX_NON_SYNC_SAMPLE_FLAGS = 16842752;
    private static final int TRUN_BOX_SYNC_SAMPLE_FLAGS = 33554432;
    public static final ImmutableList<Byte> XMP_UUID = ImmutableList.of((byte) -66, (byte) 122, (byte) -49, (byte) -53, (byte) -105, (byte) -87, (byte) 66, (byte) -24, (byte) -100, (byte) 113, (byte) -103, (byte) -108, (byte) -111, (byte) -29, (byte) -81, (byte) -84);

    public static int getTrunBoxContentSize(int i, boolean z) {
        return ((z ? 4 : 3) * i * 4) + 12;
    }

    private Boxes() {
    }

    public static ByteBuffer tkhd(int i, long j, int i2, int i3, int i4, Format format) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(200);
        byteBufferAllocate.putInt(7);
        byteBufferAllocate.putInt(i2);
        byteBufferAllocate.putInt(i3);
        byteBufferAllocate.putInt(i);
        byteBufferAllocate.putInt(0);
        byteBufferAllocate.putInt((int) vuFromUs(j, 10000L));
        byteBufferAllocate.putInt(0);
        byteBufferAllocate.putInt(0);
        byteBufferAllocate.putInt(0);
        byteBufferAllocate.putShort(MimeTypes.isAudio(format.sampleMimeType) ? (short) 256 : (short) 0);
        byteBufferAllocate.putShort((short) 0);
        byteBufferAllocate.put(rotationMatrixFromOrientation(i4));
        int i5 = format.width != -1 ? format.width : 0;
        int i6 = format.height != -1 ? format.height : 0;
        byteBufferAllocate.putInt(i5 << 16);
        byteBufferAllocate.putInt(i6 << 16);
        byteBufferAllocate.flip();
        return BoxUtils.wrapIntoBox("tkhd", byteBufferAllocate);
    }

    public static ByteBuffer mvhd(int i, int i2, int i3, long j) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(200);
        byteBufferAllocate.putInt(0);
        byteBufferAllocate.putInt(i2);
        byteBufferAllocate.putInt(i3);
        byteBufferAllocate.putInt(10000);
        byteBufferAllocate.putInt((int) vuFromUs(j, 10000L));
        byteBufferAllocate.putInt(65536);
        byteBufferAllocate.putShort((short) 256);
        byteBufferAllocate.putShort((short) 0);
        byteBufferAllocate.putInt(0);
        byteBufferAllocate.putInt(0);
        int[] iArr = {65536, 0, 0, 0, 65536, 0, 0, 0, 1073741824};
        for (int i4 = 0; i4 < 9; i4++) {
            byteBufferAllocate.putInt(iArr[i4]);
        }
        for (int i5 = 0; i5 < 6; i5++) {
            byteBufferAllocate.putInt(0);
        }
        byteBufferAllocate.putInt(i);
        byteBufferAllocate.flip();
        return BoxUtils.wrapIntoBox("mvhd", byteBufferAllocate);
    }

    public static ByteBuffer mdhd(long j, int i, int i2, int i3, String str) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(200);
        byteBufferAllocate.putInt(0);
        byteBufferAllocate.putInt(i2);
        byteBufferAllocate.putInt(i3);
        byteBufferAllocate.putInt(i);
        byteBufferAllocate.putInt((int) j);
        byteBufferAllocate.putShort(languageCodeFromString(str));
        byteBufferAllocate.putShort((short) 0);
        byteBufferAllocate.flip();
        return BoxUtils.wrapIntoBox("mdhd", byteBufferAllocate);
    }

    public static ByteBuffer vmhd() {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(200);
        byteBufferAllocate.putInt(0);
        byteBufferAllocate.putShort((short) 0);
        byteBufferAllocate.putShort((short) 0);
        byteBufferAllocate.putShort((short) 0);
        byteBufferAllocate.putShort((short) 0);
        byteBufferAllocate.flip();
        return BoxUtils.wrapIntoBox("vmhd", byteBufferAllocate);
    }

    public static ByteBuffer smhd() {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(200);
        byteBufferAllocate.putInt(0);
        byteBufferAllocate.putShort((short) 0);
        byteBufferAllocate.putShort((short) 0);
        byteBufferAllocate.flip();
        return BoxUtils.wrapIntoBox("smhd", byteBufferAllocate);
    }

    public static ByteBuffer nmhd() {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(200);
        byteBufferAllocate.putInt(0);
        byteBufferAllocate.flip();
        return BoxUtils.wrapIntoBox("nmhd", byteBufferAllocate);
    }

    public static ByteBuffer textMetaDataSampleEntry(Format format) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(200);
        byte[] utf8Bytes = Util.getUtf8Bytes((String) Assertions.checkNotNull(format.sampleMimeType));
        byteBufferAllocate.put(utf8Bytes);
        byteBufferAllocate.put((byte) 0);
        byteBufferAllocate.put(utf8Bytes);
        byteBufferAllocate.put((byte) 0);
        byteBufferAllocate.flip();
        return BoxUtils.wrapIntoBox("mett", byteBufferAllocate);
    }

    public static ByteBuffer minf(ByteBuffer... byteBufferArr) {
        return BoxUtils.wrapBoxesIntoBox("minf", Arrays.asList(byteBufferArr));
    }

    public static ByteBuffer dref(ByteBuffer... byteBufferArr) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        byteBufferAllocate.putInt(0);
        byteBufferAllocate.putInt(byteBufferArr.length);
        byteBufferAllocate.flip();
        ArrayList arrayList = new ArrayList();
        arrayList.add(byteBufferAllocate);
        Collections.addAll(arrayList, byteBufferArr);
        return BoxUtils.wrapBoxesIntoBox("dref", arrayList);
    }

    public static ByteBuffer dinf(ByteBuffer byteBuffer) {
        return BoxUtils.wrapIntoBox("dinf", byteBuffer);
    }

    public static ByteBuffer localUrl() {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
        byteBufferAllocate.putInt(1);
        byteBufferAllocate.flip();
        return BoxUtils.wrapIntoBox("url ", byteBufferAllocate);
    }

    public static ByteBuffer hdlr(String str, String str2) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(200);
        byteBufferAllocate.putInt(0);
        byteBufferAllocate.putInt(0);
        byteBufferAllocate.put(Util.getUtf8Bytes(str));
        byteBufferAllocate.putInt(0);
        byteBufferAllocate.putInt(0);
        byteBufferAllocate.putInt(0);
        byteBufferAllocate.put(Util.getUtf8Bytes(str2));
        byteBufferAllocate.put((byte) 0);
        byteBufferAllocate.flip();
        return BoxUtils.wrapIntoBox("hdlr", byteBufferAllocate);
    }

    public static ByteBuffer mdia(ByteBuffer... byteBufferArr) {
        return BoxUtils.wrapBoxesIntoBox("mdia", Arrays.asList(byteBufferArr));
    }

    public static ByteBuffer trak(ByteBuffer... byteBufferArr) {
        return BoxUtils.wrapBoxesIntoBox("trak", Arrays.asList(byteBufferArr));
    }

    public static ByteBuffer udta(Mp4LocationData mp4LocationData) {
        if (mp4LocationData == null) {
            return ByteBuffer.allocate(0);
        }
        String invariant = Util.formatInvariant("%+.4f%+.4f/", Float.valueOf(mp4LocationData.latitude), Float.valueOf(mp4LocationData.longitude));
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(invariant.length() + 4);
        byteBufferAllocate.putShort((short) (byteBufferAllocate.capacity() - 4));
        byteBufferAllocate.putShort((short) 5575);
        byteBufferAllocate.put(Util.getUtf8Bytes(invariant));
        Assertions.checkState(byteBufferAllocate.limit() == byteBufferAllocate.capacity());
        byteBufferAllocate.flip();
        return BoxUtils.wrapIntoBox("udta", BoxUtils.wrapIntoBox(new byte[]{-87, 120, 121, 122}, byteBufferAllocate));
    }

    public static ByteBuffer keys(List<MdtaMetadataEntry> list) {
        int length = 0;
        for (int i = 0; i < list.size(); i++) {
            length += list.get(i).key.length() + 8;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length + 8);
        byteBufferAllocate.putInt(0);
        byteBufferAllocate.putInt(list.size());
        for (int i2 = 0; i2 < list.size(); i2++) {
            byteBufferAllocate.put(BoxUtils.wrapIntoBox("mdta", ByteBuffer.wrap(Util.getUtf8Bytes(list.get(i2).key))));
        }
        byteBufferAllocate.flip();
        return BoxUtils.wrapIntoBox("keys", byteBufferAllocate);
    }

    public static ByteBuffer ilst(List<MdtaMetadataEntry> list) {
        int i = 0;
        int length = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            length += list.get(i2).value.length + 24;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length);
        while (i < list.size()) {
            int i3 = i + 1;
            MdtaMetadataEntry mdtaMetadataEntry = list.get(i);
            ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(mdtaMetadataEntry.value.length + 8);
            byteBufferAllocate2.putInt(mdtaMetadataEntry.typeIndicator);
            byteBufferAllocate2.putInt(mdtaMetadataEntry.localeIndicator);
            byteBufferAllocate2.put(mdtaMetadataEntry.value);
            byteBufferAllocate2.flip();
            ByteBuffer byteBufferWrapIntoBox = BoxUtils.wrapIntoBox("data", byteBufferAllocate2);
            byteBufferAllocate.putInt(byteBufferWrapIntoBox.remaining() + 8);
            byteBufferAllocate.putInt(i3);
            byteBufferAllocate.put(byteBufferWrapIntoBox);
            i = i3;
        }
        byteBufferAllocate.flip();
        return BoxUtils.wrapIntoBox("ilst", byteBufferAllocate);
    }

    public static ByteBuffer meta(ByteBuffer... byteBufferArr) {
        return BoxUtils.wrapBoxesIntoBox("meta", Arrays.asList(byteBufferArr));
    }

    public static ByteBuffer uuid(List<Byte> list, ByteBuffer byteBuffer) {
        Assertions.checkArgument(byteBuffer.remaining() > 0);
        return BoxUtils.wrapBoxesIntoBox("uuid", ImmutableList.of(ByteBuffer.wrap(apt.a(list)), byteBuffer));
    }

    public static ByteBuffer moov(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, List<ByteBuffer> list, ByteBuffer byteBuffer4) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(byteBuffer);
        arrayList.add(byteBuffer2);
        arrayList.add(byteBuffer3);
        arrayList.addAll(list);
        arrayList.add(byteBuffer4);
        return BoxUtils.wrapBoxesIntoBox("moov", arrayList);
    }

    public static ByteBuffer audioSampleEntry(Format format) {
        String strCodecSpecificFourcc = codecSpecificFourcc(format);
        ByteBuffer byteBufferCodecSpecificBox = codecSpecificBox(format);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(byteBufferCodecSpecificBox.remaining() + 200);
        byteBufferAllocate.putInt(0);
        byteBufferAllocate.putShort((short) 0);
        byteBufferAllocate.putShort((short) 1);
        byteBufferAllocate.putInt(0);
        byteBufferAllocate.putInt(0);
        byteBufferAllocate.putShort((short) format.channelCount);
        byteBufferAllocate.putShort((short) 16);
        byteBufferAllocate.putShort((short) 0);
        byteBufferAllocate.putShort((short) 0);
        byteBufferAllocate.putInt(format.sampleRate << 16);
        byteBufferAllocate.put(byteBufferCodecSpecificBox);
        byteBufferAllocate.flip();
        return BoxUtils.wrapIntoBox(strCodecSpecificFourcc, byteBufferAllocate);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:45:0x0088  */
    public static ByteBuffer codecSpecificBox(Format format) {
        String str = (String) Assertions.checkNotNull(format.sampleMimeType);
        str.hashCode();
        switch (str) {
            case "video/3gpp":
                return d263Box();
            case "video/av01":
                return av1CBox(format);
            case "video/hevc":
                return hvcCBox(format);
            case "audio/amr-wb":
                return damrBox((short) -31745);
            case "audio/vorbis":
            case "audio/mp4a-latm":
                return esdsBox(format);
            case "video/mp4v-es":
                return esdsBox(format);
            case "video/avc":
                return avcCBox(format);
            case "audio/3gpp":
                return damrBox((short) -32257);
            case "audio/opus":
                return dOpsBox(format);
            default:
                throw new IllegalArgumentException("Unsupported format: " + str);
        }
    }

    public static ByteBuffer videoSampleEntry(Format format) {
        ByteBuffer byteBufferCodecSpecificBox = codecSpecificBox(format);
        String strCodecSpecificFourcc = codecSpecificFourcc(format);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(byteBufferCodecSpecificBox.limit() + 200);
        byteBufferAllocate.putInt(0);
        byteBufferAllocate.putShort((short) 0);
        byteBufferAllocate.putShort((short) 1);
        byteBufferAllocate.putShort((short) 0);
        byteBufferAllocate.putShort((short) 0);
        byteBufferAllocate.putInt(0);
        byteBufferAllocate.putInt(0);
        byteBufferAllocate.putInt(0);
        byteBufferAllocate.putShort(format.width != -1 ? (short) format.width : (short) 0);
        byteBufferAllocate.putShort(format.height != -1 ? (short) format.height : (short) 0);
        byteBufferAllocate.putInt(4718592);
        byteBufferAllocate.putInt(4718592);
        byteBufferAllocate.putInt(0);
        byteBufferAllocate.putShort((short) 1);
        byteBufferAllocate.putLong(0L);
        byteBufferAllocate.putLong(0L);
        byteBufferAllocate.putLong(0L);
        byteBufferAllocate.putLong(0L);
        byteBufferAllocate.putShort((short) 24);
        byteBufferAllocate.putShort((short) -1);
        byteBufferAllocate.put(byteBufferCodecSpecificBox);
        byteBufferAllocate.put(paspBox());
        if (format.colorInfo != null && (format.colorInfo.colorSpace != 0 || format.colorInfo.colorTransfer != 0 || format.colorInfo.colorRange != 0)) {
            byteBufferAllocate.put(colrBox(format.colorInfo));
        }
        byteBufferAllocate.flip();
        return BoxUtils.wrapIntoBox(strCodecSpecificFourcc, byteBufferAllocate);
    }

    public static List<Long> convertPresentationTimestampsToDurationsVu(List<MediaCodec.BufferInfo> list, long j, int i, int i2) {
        int i3;
        ArrayList arrayList = new ArrayList(list.size());
        ArrayList arrayList2 = new ArrayList(list.size());
        if (list.isEmpty()) {
            return arrayList2;
        }
        int i4 = 0;
        long j2 = 0;
        boolean z = false;
        while (true) {
            i3 = 1;
            if (i4 >= list.size()) {
                break;
            }
            long j3 = list.get(i4).presentationTimeUs;
            arrayList.add(Long.valueOf(j3));
            if (j3 < j2) {
                z = true;
            }
            i4++;
            j2 = j3;
        }
        if (z) {
            Collections.sort(arrayList);
        }
        long j4 = j;
        while (i3 < arrayList.size()) {
            long jLongValue = ((Long) arrayList.get(i3)).longValue();
            long j5 = i;
            long jVuFromUs = vuFromUs(jLongValue, j5) - vuFromUs(j4, j5);
            if (jVuFromUs > 2147483647L) {
                throw new IllegalArgumentException(String.format(Locale.US, "Timestamp delta %d doesn't fit into an int", Long.valueOf(jVuFromUs)));
            }
            arrayList2.add(Long.valueOf(jVuFromUs));
            i3++;
            j4 = jLongValue;
        }
        arrayList2.add(0L);
        adjustLastSampleDuration(arrayList2, i2);
        return arrayList2;
    }

    public static ByteBuffer stts(List<Long> list) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate((list.size() * 8) + 200);
        byteBufferAllocate.putInt(0);
        int iPosition = byteBufferAllocate.position();
        byteBufferAllocate.putInt(0);
        long j = -1;
        int iPosition2 = -1;
        int i = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            long jLongValue = list.get(i2).longValue();
            if (j != jLongValue) {
                iPosition2 = byteBufferAllocate.position();
                byteBufferAllocate.putInt(1);
                byteBufferAllocate.putInt((int) jLongValue);
                i++;
                j = jLongValue;
            } else {
                byteBufferAllocate.putInt(iPosition2, byteBufferAllocate.getInt(iPosition2) + 1);
            }
        }
        byteBufferAllocate.putInt(iPosition, i);
        byteBufferAllocate.flip();
        return BoxUtils.wrapIntoBox("stts", byteBufferAllocate);
    }

    public static ByteBuffer ctts(List<MediaCodec.BufferInfo> list, List<Long> list2, int i) {
        List<Integer> listCalculateSampleCompositionTimeOffsets = calculateSampleCompositionTimeOffsets(list, list2, i);
        if (listCalculateSampleCompositionTimeOffsets.isEmpty()) {
            return ByteBuffer.allocate(0);
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate((listCalculateSampleCompositionTimeOffsets.size() * 8) + 8);
        byteBufferAllocate.putInt(1);
        int iPosition = byteBufferAllocate.position();
        byteBufferAllocate.putInt(0);
        int i2 = -1;
        int i3 = -1;
        int i4 = 0;
        for (int i5 = 0; i5 < listCalculateSampleCompositionTimeOffsets.size(); i5++) {
            int iIntValue = listCalculateSampleCompositionTimeOffsets.get(i5).intValue();
            if (i2 != iIntValue) {
                int iPosition2 = byteBufferAllocate.position();
                byteBufferAllocate.putInt(1);
                byteBufferAllocate.putInt(iIntValue);
                i4++;
                i3 = iPosition2;
                i2 = iIntValue;
            } else {
                byteBufferAllocate.putInt(i3, byteBufferAllocate.getInt(i3) + 1);
            }
        }
        byteBufferAllocate.putInt(iPosition, i4);
        byteBufferAllocate.flip();
        return BoxUtils.wrapIntoBox("ctts", byteBufferAllocate);
    }

    public static List<Integer> calculateSampleCompositionTimeOffsets(List<MediaCodec.BufferInfo> list, List<Long> list2, int i) {
        List<MediaCodec.BufferInfo> list3 = list;
        ArrayList arrayList = new ArrayList(list.size());
        if (!list.isEmpty()) {
            boolean z = false;
            long j = list3.get(0).presentationTimeUs;
            long jLongValue = 0;
            int i2 = 0;
            boolean z2 = false;
            long j2 = 0;
            while (i2 < list.size()) {
                long j3 = list3.get(i2).presentationTimeUs - j;
                long jVuFromUs = vuFromUs(j3, i) - jLongValue;
                if (jVuFromUs <= 2147483647L) {
                    z = true;
                }
                Assertions.checkState(z, "Only 32-bit offset is allowed");
                jLongValue += list2.get(i2).longValue();
                arrayList.add(Integer.valueOf((int) jVuFromUs));
                if (j3 < j2) {
                    z2 = true;
                }
                i2++;
                list3 = list;
                j2 = j3;
                z = false;
            }
            if (!z2) {
                arrayList.clear();
            }
        }
        return arrayList;
    }

    public static ByteBuffer stsz(List<MediaCodec.BufferInfo> list) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate((list.size() * 4) + 200);
        byteBufferAllocate.putInt(0);
        byteBufferAllocate.putInt(0);
        byteBufferAllocate.putInt(list.size());
        for (int i = 0; i < list.size(); i++) {
            byteBufferAllocate.putInt(list.get(i).size);
        }
        byteBufferAllocate.flip();
        return BoxUtils.wrapIntoBox("stsz", byteBufferAllocate);
    }

    public static ByteBuffer stsc(List<Integer> list) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate((list.size() * 12) + 200);
        byteBufferAllocate.putInt(0);
        byteBufferAllocate.putInt(list.size());
        int i = 1;
        for (int i2 = 0; i2 < list.size(); i2++) {
            int iIntValue = list.get(i2).intValue();
            byteBufferAllocate.putInt(i);
            byteBufferAllocate.putInt(iIntValue);
            byteBufferAllocate.putInt(1);
            i++;
        }
        byteBufferAllocate.flip();
        return BoxUtils.wrapIntoBox("stsc", byteBufferAllocate);
    }

    public static ByteBuffer stco(List<Long> list) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate((list.size() * 4) + 8);
        byteBufferAllocate.putInt(0);
        byteBufferAllocate.putInt(list.size());
        for (int i = 0; i < list.size(); i++) {
            long jLongValue = list.get(i).longValue();
            Assertions.checkState(jLongValue <= Mp4Utils.UNSIGNED_INT_MAX_VALUE, "Only 32-bit chunk offset is allowed");
            byteBufferAllocate.putInt((int) jLongValue);
        }
        byteBufferAllocate.flip();
        return BoxUtils.wrapIntoBox("stco", byteBufferAllocate);
    }

    public static ByteBuffer co64(List<Long> list) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate((list.size() * 8) + 8);
        byteBufferAllocate.putInt(0);
        byteBufferAllocate.putInt(list.size());
        for (int i = 0; i < list.size(); i++) {
            byteBufferAllocate.putLong(list.get(i).longValue());
        }
        byteBufferAllocate.flip();
        return BoxUtils.wrapIntoBox("co64", byteBufferAllocate);
    }

    public static ByteBuffer stss(List<MediaCodec.BufferInfo> list) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate((list.size() * 4) + 200);
        byteBufferAllocate.putInt(0);
        int iPosition = byteBufferAllocate.position();
        byteBufferAllocate.putInt(list.size());
        int i = 0;
        int i2 = 1;
        for (int i3 = 0; i3 < list.size(); i3++) {
            if ((list.get(i3).flags & 1) > 0) {
                byteBufferAllocate.putInt(i2);
                i++;
            }
            i2++;
        }
        byteBufferAllocate.putInt(iPosition, i);
        byteBufferAllocate.flip();
        return BoxUtils.wrapIntoBox("stss", byteBufferAllocate);
    }

    public static ByteBuffer stsd(ByteBuffer byteBuffer) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(byteBuffer.limit() + 200);
        byteBufferAllocate.putInt(0);
        byteBufferAllocate.putInt(1);
        byteBufferAllocate.put(byteBuffer);
        byteBufferAllocate.flip();
        return BoxUtils.wrapIntoBox("stsd", byteBufferAllocate);
    }

    public static ByteBuffer stbl(ByteBuffer... byteBufferArr) {
        return BoxUtils.wrapBoxesIntoBox("stbl", Arrays.asList(byteBufferArr));
    }

    public static ByteBuffer ftyp() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(ByteBuffer.wrap(Util.getUtf8Bytes("isom")));
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
        byteBufferAllocate.putInt(131072);
        byteBufferAllocate.flip();
        arrayList.add(byteBufferAllocate);
        String[] strArr = {"isom", "iso2", "mp41"};
        for (int i = 0; i < 3; i++) {
            arrayList.add(ByteBuffer.wrap(Util.getUtf8Bytes(strArr[i])));
        }
        return BoxUtils.wrapBoxesIntoBox("ftyp", arrayList);
    }

    public static ByteBuffer moof(ByteBuffer byteBuffer, List<ByteBuffer> list) {
        return BoxUtils.wrapBoxesIntoBox("moof", new ImmutableList.c().add(byteBuffer).addAll(list).build());
    }

    public static ByteBuffer mfhd(int i) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        byteBufferAllocate.putInt(0);
        byteBufferAllocate.putInt(i);
        byteBufferAllocate.flip();
        return BoxUtils.wrapIntoBox("mfhd", byteBufferAllocate);
    }

    public static ByteBuffer traf(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        return BoxUtils.wrapBoxesIntoBox("traf", ImmutableList.of(byteBuffer, byteBuffer2));
    }

    public static ByteBuffer tfhd(int i, long j) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(16);
        byteBufferAllocate.putInt(1);
        byteBufferAllocate.putInt(i);
        byteBufferAllocate.putLong(j);
        byteBufferAllocate.flip();
        return BoxUtils.wrapIntoBox("tfhd", byteBufferAllocate);
    }

    public static ByteBuffer trun(List<FragmentedMp4Writer.SampleMetadata> list, int i, boolean z) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(getTrunBoxContentSize(list.size(), z));
        byteBufferAllocate.putInt(z ? 16781057 : 16779009);
        byteBufferAllocate.putInt(list.size());
        byteBufferAllocate.putInt(i);
        for (int i2 = 0; i2 < list.size(); i2++) {
            FragmentedMp4Writer.SampleMetadata sampleMetadata = list.get(i2);
            byteBufferAllocate.putInt((int) sampleMetadata.durationVu);
            byteBufferAllocate.putInt(sampleMetadata.size);
            byteBufferAllocate.putInt((sampleMetadata.flags & 1) != 0 ? 33554432 : 16842752);
            if (z) {
                byteBufferAllocate.putInt(sampleMetadata.compositionTimeOffsetVu);
            }
        }
        byteBufferAllocate.flip();
        return BoxUtils.wrapIntoBox("trun", byteBufferAllocate);
    }

    public static ByteBuffer mvex(List<ByteBuffer> list) {
        return BoxUtils.wrapBoxesIntoBox("mvex", list);
    }

    public static ByteBuffer trex(int i) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(24);
        byteBufferAllocate.putInt(0);
        byteBufferAllocate.putInt(i);
        byteBufferAllocate.putInt(1);
        byteBufferAllocate.putInt(0);
        byteBufferAllocate.putInt(0);
        byteBufferAllocate.putInt(0);
        byteBufferAllocate.flip();
        return BoxUtils.wrapIntoBox("trex", byteBufferAllocate);
    }

    private static void adjustLastSampleDuration(List<Long> list, int i) {
        if (list.size() <= 2) {
            return;
        }
        if (i == 0) {
            Assertions.checkState(((Long) amn.a(list)).longValue() == 0);
        } else if (i == 1) {
            list.set(list.size() - 1, list.get(list.size() - 2));
        } else {
            throw new IllegalArgumentException("Unexpected value for the last frame duration behavior " + i);
        }
    }

    private static ByteBuffer d263Box() {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(7);
        byteBufferAllocate.put("    ".getBytes(StandardCharsets.UTF_8));
        byteBufferAllocate.put((byte) 0);
        byteBufferAllocate.put((byte) 16);
        byteBufferAllocate.put((byte) 0);
        byteBufferAllocate.flip();
        return BoxUtils.wrapIntoBox("d263", byteBufferAllocate);
    }

    private static ByteBuffer avcCBox(Format format) {
        Assertions.checkArgument(format.initializationData.size() >= 2, "csd-0 and/or csd-1 not found in the format.");
        byte[] bArr = format.initializationData.get(0);
        Assertions.checkArgument(bArr.length > 0, "csd-0 is empty.");
        byte[] bArr2 = format.initializationData.get(1);
        Assertions.checkArgument(bArr2.length > 0, "csd-1 is empty.");
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        ByteBuffer byteBufferWrap2 = ByteBuffer.wrap(bArr2);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(byteBufferWrap.limit() + byteBufferWrap2.limit() + 200);
        byteBufferAllocate.put((byte) 1);
        ImmutableList<ByteBuffer> immutableListFindNalUnits = AnnexBUtils.findNalUnits(byteBufferWrap);
        Assertions.checkArgument(immutableListFindNalUnits.size() == 1, "SPS data not found in csd0.");
        ByteBuffer byteBuffer = immutableListFindNalUnits.get(0);
        int iRemaining = byteBuffer.remaining();
        byte[] bArr3 = new byte[iRemaining];
        byteBuffer.get(bArr3);
        byteBuffer.rewind();
        NalUnitUtil.SpsData spsNalUnit = NalUnitUtil.parseSpsNalUnit(bArr3, 0, iRemaining);
        byteBufferAllocate.put((byte) spsNalUnit.profileIdc);
        byteBufferAllocate.put((byte) spsNalUnit.constraintsFlagsAndReservedZero2Bits);
        byteBufferAllocate.put((byte) spsNalUnit.levelIdc);
        byteBufferAllocate.put((byte) -1);
        byteBufferAllocate.put((byte) -31);
        byteBufferAllocate.putShort((short) byteBuffer.remaining());
        byteBufferAllocate.put(byteBuffer);
        byteBuffer.rewind();
        ImmutableList<ByteBuffer> immutableListFindNalUnits2 = AnnexBUtils.findNalUnits(byteBufferWrap2);
        Assertions.checkState(immutableListFindNalUnits2.size() == 1, "PPS data not found in csd1.");
        byteBufferAllocate.put((byte) 1);
        ByteBuffer byteBuffer2 = immutableListFindNalUnits2.get(0);
        byteBufferAllocate.putShort((short) byteBuffer2.remaining());
        byteBufferAllocate.put(byteBuffer2);
        byteBuffer2.rewind();
        byteBufferAllocate.flip();
        return BoxUtils.wrapIntoBox("avcC", byteBufferAllocate);
    }

    private static ByteBuffer hvcCBox(Format format) {
        Assertions.checkArgument(!format.initializationData.isEmpty(), "csd-0 not found in the format.");
        byte[] bArr = format.initializationData.get(0);
        Assertions.checkArgument(bArr.length > 0, "csd-0 is empty.");
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(byteBufferWrap.limit() + 200);
        ImmutableList<ByteBuffer> immutableListFindNalUnits = AnnexBUtils.findNalUnits(byteBufferWrap);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < immutableListFindNalUnits.size(); i++) {
            arrayList.add(AnnexBUtils.stripEmulationPrevention(immutableListFindNalUnits.get(i)));
        }
        byteBufferAllocate.put((byte) 1);
        ByteBuffer byteBuffer = (ByteBuffer) arrayList.get(0);
        if (byteBuffer.get(byteBuffer.position()) != 64) {
            throw new IllegalArgumentException("First NALU in csd-0 is not the VPS.");
        }
        byteBufferAllocate.put(byteBuffer.get(6));
        byteBufferAllocate.putInt(byteBuffer.getInt(7));
        byteBufferAllocate.putInt(byteBuffer.getInt(11));
        byteBufferAllocate.putShort(byteBuffer.getShort(15));
        byteBufferAllocate.put(byteBuffer.get(17));
        byteBufferAllocate.putShort((short) -4096);
        byteBufferAllocate.put((byte) -4);
        ByteBuffer byteBuffer2 = immutableListFindNalUnits.get(1);
        int iRemaining = byteBuffer2.remaining();
        byte[] bArr2 = new byte[iRemaining];
        byteBuffer2.get(bArr2);
        byteBuffer2.rewind();
        NalUnitUtil.H265SpsData h265SpsNalUnit = NalUnitUtil.parseH265SpsNalUnit(bArr2, 0, iRemaining);
        byte b2 = (byte) (h265SpsNalUnit.chromaFormatIdc | 252);
        byte b3 = (byte) (h265SpsNalUnit.bitDepthLumaMinus8 | 248);
        byte b4 = (byte) (h265SpsNalUnit.bitDepthChromaMinus8 | 248);
        byteBufferAllocate.put(b2);
        byteBufferAllocate.put(b3);
        byteBufferAllocate.put(b4);
        byteBufferAllocate.putShort((short) 0);
        byteBufferAllocate.put((byte) 15);
        byteBufferAllocate.put((byte) immutableListFindNalUnits.size());
        for (int i2 = 0; i2 < immutableListFindNalUnits.size(); i2++) {
            ByteBuffer byteBuffer3 = immutableListFindNalUnits.get(i2);
            byteBufferAllocate.put((byte) ((byteBuffer3.get(0) >> 1) & 63));
            byteBufferAllocate.putShort((short) 1);
            byteBufferAllocate.putShort((short) byteBuffer3.limit());
            byteBufferAllocate.put(byteBuffer3);
        }
        byteBufferAllocate.flip();
        return BoxUtils.wrapIntoBox("hvcC", byteBufferAllocate);
    }

    private static ByteBuffer av1CBox(Format format) {
        Assertions.checkArgument(!format.initializationData.isEmpty(), "csd-0 is not found in the format");
        byte[] bArr = format.initializationData.get(0);
        Assertions.checkArgument(bArr.length > 0, "csd-0 is empty.");
        return BoxUtils.wrapIntoBox("av1C", ByteBuffer.wrap(bArr));
    }

    private static ByteBuffer paspBox() {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        byteBufferAllocate.putInt(65536);
        byteBufferAllocate.putInt(65536);
        byteBufferAllocate.rewind();
        return BoxUtils.wrapIntoBox("pasp", byteBufferAllocate);
    }

    private static ByteBuffer colrBox(ColorInfo colorInfo) {
        short sShortValue;
        short sShortValue2;
        short sShortValue3;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(20);
        byteBufferAllocate.put((byte) 110);
        byteBufferAllocate.put((byte) 99);
        byteBufferAllocate.put((byte) 108);
        byteBufferAllocate.put((byte) 120);
        byte b2 = 0;
        if (colorInfo.colorSpace != -1) {
            int i = colorInfo.colorSpace;
            if (i < 0 || i >= ColorUtils.MEDIAFORMAT_STANDARD_TO_PRIMARIES_AND_MATRIX.size()) {
                throw new IllegalArgumentException("Color standard not implemented: " + i);
            }
            sShortValue2 = ColorUtils.MEDIAFORMAT_STANDARD_TO_PRIMARIES_AND_MATRIX.get(i).get(0).shortValue();
            sShortValue = ColorUtils.MEDIAFORMAT_STANDARD_TO_PRIMARIES_AND_MATRIX.get(i).get(1).shortValue();
        } else {
            sShortValue = 0;
            sShortValue2 = 0;
        }
        if (colorInfo.colorTransfer != -1) {
            int i2 = colorInfo.colorTransfer;
            if (i2 < 0 || i2 >= ColorUtils.MEDIAFORMAT_TRANSFER_TO_MP4_TRANSFER.size()) {
                throw new IllegalArgumentException("Color transfer not implemented: " + i2);
            }
            sShortValue3 = ColorUtils.MEDIAFORMAT_TRANSFER_TO_MP4_TRANSFER.get(i2).shortValue();
        } else {
            sShortValue3 = 0;
        }
        if (colorInfo.colorRange != -1) {
            int i3 = colorInfo.colorRange;
            if (i3 < 0 || i3 > 2) {
                throw new IllegalArgumentException("Color range not implemented: " + i3);
            }
            if (i3 == 1) {
                b2 = -128;
            }
        }
        byteBufferAllocate.putShort(sShortValue2);
        byteBufferAllocate.putShort(sShortValue3);
        byteBufferAllocate.putShort(sShortValue);
        byteBufferAllocate.put(b2);
        byteBufferAllocate.flip();
        return BoxUtils.wrapIntoBox("colr", byteBufferAllocate);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:45:0x0088  */
    private static String codecSpecificFourcc(Format format) {
        String str = (String) Assertions.checkNotNull(format.sampleMimeType);
        str.hashCode();
        switch (str) {
            case "video/3gpp":
                return "s263";
            case "video/av01":
                return "av01";
            case "video/hevc":
                return "hvc1";
            case "audio/amr-wb":
                return "sawb";
            case "audio/vorbis":
            case "audio/mp4a-latm":
                return "mp4a";
            case "video/mp4v-es":
                return "mp4v-es";
            case "video/avc":
                return "avc1";
            case "audio/3gpp":
                return "samr";
            case "audio/opus":
                return "Opus";
            default:
                throw new IllegalArgumentException("Unsupported format: " + str);
        }
    }

    private static ByteBuffer esdsBox(Format format) {
        Assertions.checkArgument(!format.initializationData.isEmpty(), "csd-0 not found in the format.");
        byte[] bArr = format.initializationData.get(0);
        Assertions.checkArgument(bArr.length > 0, "csd-0 is empty.");
        String str = (String) Assertions.checkNotNull(format.sampleMimeType);
        ByteBuffer vorbisInitializationData = str.equals(MimeTypes.AUDIO_VORBIS) ? getVorbisInitializationData(format) : ByteBuffer.wrap(bArr);
        int i = format.peakBitrate;
        int i2 = format.averageBitrate;
        boolean zIsVideo = MimeTypes.isVideo(str);
        int iRemaining = vorbisInitializationData.remaining();
        ByteBuffer sizeBuffer = getSizeBuffer(iRemaining);
        ByteBuffer sizeBuffer2 = getSizeBuffer(sizeBuffer.remaining() + iRemaining + 14);
        ByteBuffer sizeBuffer3 = getSizeBuffer(sizeBuffer.remaining() + iRemaining + sizeBuffer2.remaining() + 21);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(iRemaining + 200);
        byteBufferAllocate.putInt(0);
        byteBufferAllocate.put((byte) 3);
        byteBufferAllocate.put(sizeBuffer3);
        byteBufferAllocate.putShort((short) 0);
        byteBufferAllocate.put(zIsVideo ? Ascii.US : (byte) 0);
        byteBufferAllocate.put((byte) 4);
        byteBufferAllocate.put(sizeBuffer2);
        byteBufferAllocate.put(((Byte) Assertions.checkNotNull(MimeTypes.getMp4ObjectTypeFromMimeType(str))).byteValue());
        byteBufferAllocate.put((byte) ((zIsVideo ? 16 : 20) | 1));
        byteBufferAllocate.putShort((short) (((zIsVideo ? 96000 : HealthData.TIMELINE) >> 8) & 65535));
        byteBufferAllocate.put((byte) 0);
        if (i == -1) {
            i = 0;
        }
        byteBufferAllocate.putInt(i);
        byteBufferAllocate.putInt(i2 != -1 ? i2 : 0);
        byteBufferAllocate.put((byte) 5);
        byteBufferAllocate.put(sizeBuffer);
        byteBufferAllocate.put(vorbisInitializationData);
        vorbisInitializationData.rewind();
        byteBufferAllocate.put((byte) 6);
        byteBufferAllocate.put((byte) 1);
        byteBufferAllocate.put((byte) 2);
        byteBufferAllocate.flip();
        return BoxUtils.wrapIntoBox("esds", byteBufferAllocate);
    }

    private static ByteBuffer getSizeBuffer(int i) {
        ArrayDeque arrayDeque = new ArrayDeque();
        int i2 = 0;
        while (true) {
            arrayDeque.push(Byte.valueOf((byte) (i2 | (i & 127))));
            i >>= 7;
            if (i <= 0) {
                break;
            }
            i2 = 128;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(arrayDeque.size());
        while (!arrayDeque.isEmpty()) {
            byteBufferAllocate.put(((Byte) arrayDeque.removeFirst()).byteValue());
        }
        byteBufferAllocate.flip();
        return byteBufferAllocate;
    }

    private static ByteBuffer getVorbisInitializationData(Format format) {
        Assertions.checkArgument(format.initializationData.size() > 1, "csd-1 should contain setup header for Vorbis.");
        byte[] bArr = format.initializationData.get(0);
        int length = bArr.length / 255;
        int i = length + 1;
        byte[] bArr2 = new byte[i];
        Arrays.fill(bArr2, (byte) -1);
        bArr2[length] = (byte) (bArr.length % 255);
        byte[] bArr3 = format.initializationData.get(1);
        Assertions.checkArgument(bArr3.length > 0, "csd-1 should be present and contain setup header for Vorbis.");
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i + bArr.length + bArr3.length + 2);
        byteBufferAllocate.put((byte) 2);
        byteBufferAllocate.put(bArr2);
        byteBufferAllocate.put((byte) 0);
        byteBufferAllocate.put(bArr);
        byteBufferAllocate.put(bArr3);
        byteBufferAllocate.flip();
        return byteBufferAllocate;
    }

    private static ByteBuffer damrBox(short s) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(200);
        byteBufferAllocate.put("    ".getBytes(StandardCharsets.UTF_8));
        byteBufferAllocate.put((byte) 0);
        byteBufferAllocate.putShort(s);
        byteBufferAllocate.put((byte) 0);
        byteBufferAllocate.put((byte) 1);
        byteBufferAllocate.flip();
        return BoxUtils.wrapIntoBox("damr", byteBufferAllocate);
    }

    private static ByteBuffer dOpsBox(Format format) {
        Assertions.checkArgument(!format.initializationData.isEmpty());
        byte[] bArr = format.initializationData.get(0);
        Assertions.checkArgument(bArr.length >= 8, "As csd0 contains 'OpusHead' in first 8 bytes, csd0 length should be greater than 8");
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bArr.length);
        byteBufferAllocate.put(bArr, 8, bArr.length - 8);
        byteBufferAllocate.flip();
        return BoxUtils.wrapIntoBox("dOps", byteBufferAllocate);
    }

    private static short languageCodeFromString(String str) {
        if (str == null) {
            return (short) 0;
        }
        byte[] utf8Bytes = Util.getUtf8Bytes(str);
        if (utf8Bytes.length != 3) {
            throw new IllegalArgumentException("Non-length-3 language code: " + str);
        }
        int i = (utf8Bytes[2] & Ascii.US) + ((utf8Bytes[1] & Ascii.US) << 5) + ((utf8Bytes[0] & Ascii.US) << 10);
        Assertions.checkState((32768 & i) == 0);
        return (short) (i & 65535);
    }

    private static byte[] rotationMatrixFromOrientation(int i) {
        if (i == 0) {
            return Util.toByteArray(65536, 0, 0, 0, 65536, 0, 0, 0, 1073741824);
        }
        if (i == 90) {
            return Util.toByteArray(0, 65536, 0, SupportMenu.CATEGORY_MASK, 0, 0, 0, 0, 1073741824);
        }
        if (i == 180) {
            return Util.toByteArray(SupportMenu.CATEGORY_MASK, 0, 0, 0, SupportMenu.CATEGORY_MASK, 0, 0, 0, 1073741824);
        }
        if (i == 270) {
            return Util.toByteArray(0, SupportMenu.CATEGORY_MASK, 0, 65536, 0, 0, 0, 0, 1073741824);
        }
        throw new IllegalArgumentException("invalid orientation " + i);
    }

    private static long vuFromUs(long j, long j2) {
        return (j * j2) / 1000000;
    }
}

package androidx.profileinstaller;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(19)
class ProfileTranscoder {
    private static final int HOT = 1;
    private static final int INLINE_CACHE_MEGAMORPHIC_ENCODING = 7;
    private static final int INLINE_CACHE_MISSING_TYPES_ENCODING = 6;
    public static final byte[] MAGIC = {112, 114, 111, 0};
    private static final int POST_STARTUP = 4;
    private static final int STARTUP = 2;

    private ProfileTranscoder() {
    }

    @NonNull
    private static byte[] createCompressibleBody(@NonNull List<DexProfileData> lines) throws IOException {
        int iUtf8Length = 0;
        for (int i = 0; i < lines.size(); i++) {
            DexProfileData dexProfileData = lines.get(i);
            iUtf8Length += Encoding.utf8Length(dexProfileData.key) + 16 + (dexProfileData.classSetSize * 2) + dexProfileData.hotMethodRegionSize + getMethodBitmapStorageSize(dexProfileData.numMethodIds);
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(iUtf8Length);
        for (int i2 = 0; i2 < lines.size(); i2++) {
            writeLineHeader(byteArrayOutputStream, lines.get(i2));
        }
        for (int i3 = 0; i3 < lines.size(); i3++) {
            writeLineData(byteArrayOutputStream, lines.get(i3));
        }
        if (byteArrayOutputStream.size() == iUtf8Length) {
            return byteArrayOutputStream.toByteArray();
        }
        throw Encoding.error("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + iUtf8Length);
    }

    private static int getMethodBitmapStorageSize(int numMethodIds) {
        return roundUpToByte(numMethodIds * 2) / 8;
    }

    private static int methodFlagBitmapIndex(int flag, int methodIndex, int numMethodIds) {
        if (flag == 1) {
            throw Encoding.error("HOT methods are not stored in the bitmap");
        }
        if (flag == 2) {
            return methodIndex;
        }
        if (flag == 4) {
            return methodIndex + numMethodIds;
        }
        throw Encoding.error("Unexpected flag: " + flag);
    }

    @NonNull
    private static String profileKey(@NonNull String apkName, @NonNull String dexName) {
        if ("classes.dex".equals(dexName)) {
            return apkName;
        }
        if (dexName.contains("!") || dexName.endsWith(".apk")) {
            return dexName;
        }
        return apkName + '!' + dexName;
    }

    private static void readClasses(@NonNull InputStream is, @NonNull DexProfileData data) throws IOException {
        int uInt16 = 0;
        for (int i = 0; i < data.classSetSize; i++) {
            uInt16 += Encoding.readUInt16(is);
            data.classes.add(Integer.valueOf(uInt16));
        }
    }

    private static int readFlagsFromBitmap(@NonNull BitSet bs, int methodIndex, int numMethodIds) {
        int i = bs.get(methodFlagBitmapIndex(2, methodIndex, numMethodIds)) ? 2 : 0;
        return bs.get(methodFlagBitmapIndex(4, methodIndex, numMethodIds)) ? i | 4 : i;
    }

    public static byte[] readHeader(@NonNull InputStream is) throws IOException {
        byte[] bArr = MAGIC;
        if (Arrays.equals(bArr, Encoding.read(is, bArr.length))) {
            return Encoding.read(is, ProfileVersion.V010_P.length);
        }
        throw Encoding.error("Invalid magic");
    }

    private static void readHotMethodRegion(@NonNull InputStream is, @NonNull DexProfileData data) throws IOException {
        int iAvailable = is.available() - data.hotMethodRegionSize;
        int uInt16 = 0;
        while (is.available() > iAvailable) {
            uInt16 += Encoding.readUInt16(is);
            data.methods.put(Integer.valueOf(uInt16), 1);
            for (int uInt17 = Encoding.readUInt16(is); uInt17 > 0; uInt17--) {
                skipInlineCache(is);
            }
        }
        if (is.available() != iAvailable) {
            throw Encoding.error("Read too much data during profile line parse");
        }
    }

    private static void readMethodBitmap(@NonNull InputStream is, @NonNull DexProfileData data) throws IOException {
        BitSet bitSetValueOf = BitSet.valueOf(Encoding.read(is, Encoding.bitsToBytes(data.numMethodIds * 2)));
        int i = 0;
        while (true) {
            int i2 = data.numMethodIds;
            if (i >= i2) {
                return;
            }
            int flagsFromBitmap = readFlagsFromBitmap(bitSetValueOf, i, i2);
            if (flagsFromBitmap != 0) {
                Integer num = data.methods.get(Integer.valueOf(i));
                if (num == null) {
                    num = 0;
                }
                data.methods.put(Integer.valueOf(i), Integer.valueOf(flagsFromBitmap | num.intValue()));
            }
            i++;
        }
    }

    @NonNull
    public static Map<String, DexProfileData> readProfile(@NonNull InputStream is, @NonNull byte[] version, @NonNull String apkName) throws IOException {
        if (!Arrays.equals(version, ProfileVersion.V010_P)) {
            throw Encoding.error("Unsupported version");
        }
        int uInt8 = Encoding.readUInt8(is);
        byte[] compressed = Encoding.readCompressed(is, (int) Encoding.readUInt32(is), (int) Encoding.readUInt32(is));
        if (is.read() > 0) {
            throw Encoding.error("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(compressed);
        try {
            Map<String, DexProfileData> uncompressedBody = readUncompressedBody(byteArrayInputStream, apkName, uInt8);
            byteArrayInputStream.close();
            return uncompressedBody;
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @NonNull
    private static Map<String, DexProfileData> readUncompressedBody(@NonNull InputStream is, @NonNull String apkName, int numberOfDexFiles) throws IOException {
        if (is.available() == 0) {
            return new HashMap();
        }
        DexProfileData[] dexProfileDataArr = new DexProfileData[numberOfDexFiles];
        for (int i = 0; i < numberOfDexFiles; i++) {
            int uInt16 = Encoding.readUInt16(is);
            int uInt17 = Encoding.readUInt16(is);
            long uInt32 = Encoding.readUInt32(is);
            dexProfileDataArr[i] = new DexProfileData(profileKey(apkName, Encoding.readString(is, uInt16)), Encoding.readUInt32(is), uInt17, (int) uInt32, (int) Encoding.readUInt32(is), new LinkedHashSet(), new LinkedHashMap());
        }
        HashMap map = new HashMap(numberOfDexFiles);
        for (int i2 = 0; i2 < numberOfDexFiles; i2++) {
            DexProfileData dexProfileData = dexProfileDataArr[i2];
            readHotMethodRegion(is, dexProfileData);
            readClasses(is, dexProfileData);
            readMethodBitmap(is, dexProfileData);
            map.put(dexProfileData.key, dexProfileData);
        }
        return map;
    }

    private static int roundUpToByte(int bits) {
        return ((bits + 8) - 1) & (-8);
    }

    private static void setMethodBitmapBit(@NonNull byte[] bitmap, int flag, int methodIndex, @NonNull DexProfileData dexData) {
        int iMethodFlagBitmapIndex = methodFlagBitmapIndex(flag, methodIndex, dexData.numMethodIds);
        int i = iMethodFlagBitmapIndex / 8;
        bitmap[i] = (byte) ((1 << (iMethodFlagBitmapIndex % 8)) | bitmap[i]);
    }

    private static void skipInlineCache(@NonNull InputStream is) throws IOException {
        Encoding.readUInt16(is);
        int uInt8 = Encoding.readUInt8(is);
        if (uInt8 == 6 || uInt8 == 7) {
            return;
        }
        while (uInt8 > 0) {
            Encoding.readUInt8(is);
            for (int uInt9 = Encoding.readUInt8(is); uInt9 > 0; uInt9--) {
                Encoding.readUInt16(is);
            }
            uInt8--;
        }
    }

    public static boolean transcodeAndWriteBody(@NonNull OutputStream os, @NonNull byte[] desiredVersion, @NonNull Map<String, DexProfileData> data) throws IOException {
        if (Arrays.equals(desiredVersion, ProfileVersion.V010_P)) {
            writeProfileForP(os, data);
            return true;
        }
        if (Arrays.equals(desiredVersion, ProfileVersion.V005_O)) {
            writeProfileForO(os, data);
            return true;
        }
        if (!Arrays.equals(desiredVersion, ProfileVersion.V001_N)) {
            return false;
        }
        writeProfileForN(os, data);
        return true;
    }

    private static void writeClasses(@NonNull OutputStream os, @NonNull DexProfileData dexData) throws IOException {
        int iIntValue = 0;
        for (Integer num : dexData.classes) {
            Encoding.writeUInt16(os, num.intValue() - iIntValue);
            iIntValue = num.intValue();
        }
    }

    public static void writeHeader(@NonNull OutputStream os, byte[] version) throws IOException {
        os.write(MAGIC);
        os.write(version);
    }

    private static void writeLineData(@NonNull OutputStream os, @NonNull DexProfileData dexData) throws IOException {
        writeMethodsWithInlineCaches(os, dexData);
        writeClasses(os, dexData);
        writeMethodBitmap(os, dexData);
    }

    private static void writeLineHeader(@NonNull OutputStream os, @NonNull DexProfileData dexData) throws IOException {
        Encoding.writeUInt16(os, Encoding.utf8Length(dexData.key));
        Encoding.writeUInt16(os, dexData.classSetSize);
        Encoding.writeUInt32(os, dexData.hotMethodRegionSize);
        Encoding.writeUInt32(os, dexData.dexChecksum);
        Encoding.writeUInt32(os, dexData.numMethodIds);
        Encoding.writeString(os, dexData.key);
    }

    private static void writeMethodBitmap(@NonNull OutputStream os, @NonNull DexProfileData dexData) throws IOException {
        byte[] bArr = new byte[getMethodBitmapStorageSize(dexData.numMethodIds)];
        for (Map.Entry<Integer, Integer> entry : dexData.methods.entrySet()) {
            int iIntValue = entry.getKey().intValue();
            int iIntValue2 = entry.getValue().intValue();
            if ((iIntValue2 & 2) != 0) {
                setMethodBitmapBit(bArr, 2, iIntValue, dexData);
            }
            if ((iIntValue2 & 4) != 0) {
                setMethodBitmapBit(bArr, 4, iIntValue, dexData);
            }
        }
        os.write(bArr);
    }

    private static void writeMethodsWithInlineCaches(@NonNull OutputStream os, @NonNull DexProfileData dexData) throws IOException {
        int i = 0;
        for (Map.Entry<Integer, Integer> entry : dexData.methods.entrySet()) {
            int iIntValue = entry.getKey().intValue();
            if ((entry.getValue().intValue() & 1) != 0) {
                Encoding.writeUInt16(os, iIntValue - i);
                Encoding.writeUInt16(os, 0);
                i = iIntValue;
            }
        }
    }

    private static void writeProfileForN(@NonNull OutputStream os, @NonNull Map<String, DexProfileData> lines) throws IOException {
        Encoding.writeUInt16(os, lines.size());
        for (Map.Entry<String, DexProfileData> entry : lines.entrySet()) {
            String key = entry.getKey();
            DexProfileData value = entry.getValue();
            Encoding.writeUInt16(os, Encoding.utf8Length(key));
            Encoding.writeUInt16(os, value.methods.size());
            Encoding.writeUInt16(os, value.classes.size());
            Encoding.writeUInt32(os, value.dexChecksum);
            Encoding.writeString(os, key);
            Iterator<Integer> it2 = value.methods.keySet().iterator();
            while (it2.hasNext()) {
                Encoding.writeUInt16(os, it2.next().intValue());
            }
            Iterator<Integer> it3 = value.classes.iterator();
            while (it3.hasNext()) {
                Encoding.writeUInt16(os, it3.next().intValue());
            }
        }
    }

    private static void writeProfileForO(@NonNull OutputStream os, @NonNull Map<String, DexProfileData> lines) throws IOException {
        Encoding.writeUInt8(os, lines.size());
        for (Map.Entry<String, DexProfileData> entry : lines.entrySet()) {
            String key = entry.getKey();
            DexProfileData value = entry.getValue();
            int size = value.methods.size() * 4;
            Encoding.writeUInt16(os, Encoding.utf8Length(key));
            Encoding.writeUInt16(os, value.classes.size());
            Encoding.writeUInt32(os, size);
            Encoding.writeUInt32(os, value.dexChecksum);
            Encoding.writeString(os, key);
            Iterator<Integer> it2 = value.methods.keySet().iterator();
            while (it2.hasNext()) {
                Encoding.writeUInt16(os, it2.next().intValue());
                Encoding.writeUInt16(os, 0);
            }
            Iterator<Integer> it3 = value.classes.iterator();
            while (it3.hasNext()) {
                Encoding.writeUInt16(os, it3.next().intValue());
            }
        }
    }

    private static void writeProfileForP(@NonNull OutputStream os, @NonNull Map<String, DexProfileData> lines) throws IOException {
        byte[] bArrCreateCompressibleBody = createCompressibleBody(new ArrayList(lines.values()));
        Encoding.writeUInt8(os, lines.size());
        Encoding.writeCompressed(os, bArrCreateCompressibleBody);
    }
}

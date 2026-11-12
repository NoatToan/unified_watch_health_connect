package com.google.android.material.color;

import android.content.Context;
import android.util.Pair;
import com.airbnb.lottie.animation.keyframe.a;
import com.google.common.primitives.UnsignedBytes;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.apache.commons.lang3.e;
import vb.h;

/* JADX INFO: loaded from: classes14.dex */
final class ColorResourcesTableCreator {
    private static final byte ANDROID_PACKAGE_ID = 1;
    private static final byte APPLICATION_PACKAGE_ID = 127;
    private static final short HEADER_TYPE_PACKAGE = 512;
    private static final short HEADER_TYPE_RES_TABLE = 2;
    private static final short HEADER_TYPE_STRING_POOL = 1;
    private static final short HEADER_TYPE_TYPE = 513;
    private static final short HEADER_TYPE_TYPE_SPEC = 514;
    private static final String RESOURCE_TYPE_NAME_COLOR = "color";
    private static byte typeIdColor;
    private static final PackageInfo ANDROID_PACKAGE_INFO = new PackageInfo(1, "android");
    private static final Comparator<ColorResource> COLOR_RESOURCE_COMPARATOR = new Comparator<ColorResource>() { // from class: com.google.android.material.color.ColorResourcesTableCreator.1
        @Override // java.util.Comparator
        public int compare(ColorResource colorResource, ColorResource colorResource2) {
            return colorResource.entryId - colorResource2.entryId;
        }
    };

    public static class ColorResource {
        private final short entryId;
        private final String name;
        private final byte packageId;
        private final byte typeId;
        private final int value;

        public ColorResource(int i14, String str, int i15) {
            this.name = str;
            this.value = i15;
            this.entryId = (short) (65535 & i14);
            this.typeId = (byte) ((i14 >> 16) & 255);
            this.packageId = (byte) ((i14 >> 24) & 255);
        }
    }

    public static class PackageChunk {
        private static final short HEADER_SIZE = 288;
        private static final int PACKAGE_NAME_MAX_LENGTH = 128;
        private final ResChunkHeader header;
        private final StringPoolChunk keyStrings;
        private final PackageInfo packageInfo;
        private final TypeSpecChunk typeSpecChunk;
        private final StringPoolChunk typeStrings = new StringPoolChunk(false, "?1", "?2", "?3", "?4", "?5", "color");

        public PackageChunk(PackageInfo packageInfo, List<ColorResource> list) {
            this.packageInfo = packageInfo;
            String[] strArr = new String[list.size()];
            for (int i14 = 0; i14 < list.size(); i14++) {
                strArr[i14] = list.get(i14).name;
            }
            this.keyStrings = new StringPoolChunk(true, strArr);
            this.typeSpecChunk = new TypeSpecChunk(list);
            this.header = new ResChunkHeader(ColorResourcesTableCreator.HEADER_TYPE_PACKAGE, HEADER_SIZE, getChunkSize());
        }

        public int getChunkSize() {
            return this.typeStrings.getChunkSize() + 288 + this.keyStrings.getChunkSize() + this.typeSpecChunk.getChunkSizeWithTypeChunk();
        }

        public void writeTo(ByteArrayOutputStream byteArrayOutputStream) throws IOException {
            this.header.writeTo(byteArrayOutputStream);
            byteArrayOutputStream.write(ColorResourcesTableCreator.intToByteArray(this.packageInfo.f53173id));
            char[] charArray = this.packageInfo.name.toCharArray();
            for (int i14 = 0; i14 < 128; i14++) {
                if (i14 < charArray.length) {
                    byteArrayOutputStream.write(ColorResourcesTableCreator.charToByteArray(charArray[i14]));
                } else {
                    byteArrayOutputStream.write(ColorResourcesTableCreator.charToByteArray((char) 0));
                }
            }
            byteArrayOutputStream.write(ColorResourcesTableCreator.intToByteArray(288));
            byteArrayOutputStream.write(ColorResourcesTableCreator.intToByteArray(0));
            byteArrayOutputStream.write(ColorResourcesTableCreator.intToByteArray(this.typeStrings.getChunkSize() + 288));
            byteArrayOutputStream.write(ColorResourcesTableCreator.intToByteArray(0));
            byteArrayOutputStream.write(ColorResourcesTableCreator.intToByteArray(0));
            this.typeStrings.writeTo(byteArrayOutputStream);
            this.keyStrings.writeTo(byteArrayOutputStream);
            this.typeSpecChunk.writeTo(byteArrayOutputStream);
        }
    }

    public static class PackageInfo {

        /* JADX INFO: renamed from: id, reason: collision with root package name */
        private final int f53173id;
        private final String name;

        public PackageInfo(int i14, String str) {
            this.f53173id = i14;
            this.name = str;
        }
    }

    public static class ResChunkHeader {
        private final int chunkSize;
        private final short headerSize;
        private final short type;

        public ResChunkHeader(short s8, short s14, int i14) {
            this.type = s8;
            this.headerSize = s14;
            this.chunkSize = i14;
        }

        public void writeTo(ByteArrayOutputStream byteArrayOutputStream) throws IOException {
            byteArrayOutputStream.write(ColorResourcesTableCreator.shortToByteArray(this.type));
            byteArrayOutputStream.write(ColorResourcesTableCreator.shortToByteArray(this.headerSize));
            byteArrayOutputStream.write(ColorResourcesTableCreator.intToByteArray(this.chunkSize));
        }
    }

    public static class ResEntry {
        private static final byte DATA_TYPE_AARRGGBB = 28;
        private static final short ENTRY_SIZE = 8;
        private static final short FLAG_PUBLIC = 2;
        private static final int SIZE = 16;
        private static final short VALUE_SIZE = 8;
        private final int data;
        private final int keyStringIndex;

        public ResEntry(int i14, int i15) {
            this.keyStringIndex = i14;
            this.data = i15;
        }

        public void writeTo(ByteArrayOutputStream byteArrayOutputStream) throws IOException {
            byteArrayOutputStream.write(ColorResourcesTableCreator.shortToByteArray((short) 8));
            byteArrayOutputStream.write(ColorResourcesTableCreator.shortToByteArray(FLAG_PUBLIC));
            byteArrayOutputStream.write(ColorResourcesTableCreator.intToByteArray(this.keyStringIndex));
            byteArrayOutputStream.write(ColorResourcesTableCreator.shortToByteArray((short) 8));
            byteArrayOutputStream.write(new byte[]{0, 28});
            byteArrayOutputStream.write(ColorResourcesTableCreator.intToByteArray(this.data));
        }
    }

    public static class ResTable {
        private static final short HEADER_SIZE = 12;
        private final ResChunkHeader header;
        private final int packageCount;
        private final List<PackageChunk> packageChunks = new ArrayList();
        private final StringPoolChunk stringPool = new StringPoolChunk(new String[0]);

        public ResTable(Map<PackageInfo, List<ColorResource>> map) {
            this.packageCount = map.size();
            for (Map.Entry<PackageInfo, List<ColorResource>> entry : map.entrySet()) {
                List<ColorResource> value = entry.getValue();
                Collections.sort(value, ColorResourcesTableCreator.COLOR_RESOURCE_COMPARATOR);
                this.packageChunks.add(new PackageChunk(entry.getKey(), value));
            }
            this.header = new ResChunkHeader(ColorResourcesTableCreator.HEADER_TYPE_RES_TABLE, HEADER_SIZE, getOverallSize());
        }

        private int getOverallSize() {
            Iterator<PackageChunk> it = this.packageChunks.iterator();
            int chunkSize = 0;
            while (it.hasNext()) {
                chunkSize += it.next().getChunkSize();
            }
            return this.stringPool.getChunkSize() + 12 + chunkSize;
        }

        public void writeTo(ByteArrayOutputStream byteArrayOutputStream) throws IOException {
            this.header.writeTo(byteArrayOutputStream);
            byteArrayOutputStream.write(ColorResourcesTableCreator.intToByteArray(this.packageCount));
            this.stringPool.writeTo(byteArrayOutputStream);
            Iterator<PackageChunk> it = this.packageChunks.iterator();
            while (it.hasNext()) {
                it.next().writeTo(byteArrayOutputStream);
            }
        }
    }

    public static class StringStyledSpan {
        private int firstCharacterIndex;
        private int lastCharacterIndex;
        private int nameReference;
        private byte[] styleString;

        private StringStyledSpan() {
        }

        public void writeTo(ByteArrayOutputStream byteArrayOutputStream) throws IOException {
            byteArrayOutputStream.write(ColorResourcesTableCreator.intToByteArray(this.nameReference));
            byteArrayOutputStream.write(ColorResourcesTableCreator.intToByteArray(this.firstCharacterIndex));
            byteArrayOutputStream.write(ColorResourcesTableCreator.intToByteArray(this.lastCharacterIndex));
        }
    }

    public static class TypeChunk {
        private static final byte CONFIG_SIZE = 64;
        private static final short HEADER_SIZE = 84;
        private static final int OFFSET_NO_ENTRY = -1;
        private final byte[] config;
        private final int entryCount;
        private final ResChunkHeader header;
        private final int[] offsetTable;
        private final ResEntry[] resEntries;

        public TypeChunk(List<ColorResource> list, Set<Short> set, int i14) {
            byte[] bArr = new byte[64];
            this.config = bArr;
            this.entryCount = i14;
            bArr[0] = 64;
            this.resEntries = new ResEntry[list.size()];
            for (int i15 = 0; i15 < list.size(); i15++) {
                this.resEntries[i15] = new ResEntry(i15, list.get(i15).value);
            }
            this.offsetTable = new int[i14];
            int i16 = 0;
            for (short s8 = 0; s8 < i14; s8 = (short) (s8 + ColorResourcesTableCreator.HEADER_TYPE_STRING_POOL)) {
                boolean zContains = set.contains(Short.valueOf(s8));
                int[] iArr = this.offsetTable;
                if (zContains) {
                    iArr[s8] = i16;
                    i16 += 16;
                } else {
                    iArr[s8] = -1;
                }
            }
            this.header = new ResChunkHeader(ColorResourcesTableCreator.HEADER_TYPE_TYPE, HEADER_SIZE, getChunkSize());
        }

        private int getEntryStart() {
            return getOffsetTableSize() + 84;
        }

        private int getOffsetTableSize() {
            return this.offsetTable.length * 4;
        }

        public int getChunkSize() {
            return (this.resEntries.length * 16) + getEntryStart();
        }

        public void writeTo(ByteArrayOutputStream byteArrayOutputStream) throws IOException {
            this.header.writeTo(byteArrayOutputStream);
            byteArrayOutputStream.write(new byte[]{ColorResourcesTableCreator.typeIdColor, 0, 0, 0});
            byteArrayOutputStream.write(ColorResourcesTableCreator.intToByteArray(this.entryCount));
            byteArrayOutputStream.write(ColorResourcesTableCreator.intToByteArray(getEntryStart()));
            byteArrayOutputStream.write(this.config);
            for (int i14 : this.offsetTable) {
                byteArrayOutputStream.write(ColorResourcesTableCreator.intToByteArray(i14));
            }
            for (ResEntry resEntry : this.resEntries) {
                resEntry.writeTo(byteArrayOutputStream);
            }
        }
    }

    public static class TypeSpecChunk {
        private static final short HEADER_SIZE = 16;
        private static final int SPEC_PUBLIC = 1073741824;
        private final int entryCount;
        private final int[] entryFlags;
        private final ResChunkHeader header;
        private final TypeChunk typeChunk;

        public TypeSpecChunk(List<ColorResource> list) {
            this.entryCount = ((ColorResource) a.c(1, list)).entryId + ColorResourcesTableCreator.HEADER_TYPE_STRING_POOL;
            HashSet hashSet = new HashSet();
            Iterator<ColorResource> it = list.iterator();
            while (it.hasNext()) {
                hashSet.add(Short.valueOf(it.next().entryId));
            }
            this.entryFlags = new int[this.entryCount];
            for (short s8 = 0; s8 < this.entryCount; s8 = (short) (s8 + ColorResourcesTableCreator.HEADER_TYPE_STRING_POOL)) {
                if (hashSet.contains(Short.valueOf(s8))) {
                    this.entryFlags[s8] = 1073741824;
                }
            }
            this.header = new ResChunkHeader(ColorResourcesTableCreator.HEADER_TYPE_TYPE_SPEC, HEADER_SIZE, getChunkSize());
            this.typeChunk = new TypeChunk(list, hashSet, this.entryCount);
        }

        private int getChunkSize() {
            return (this.entryCount * 4) + 16;
        }

        public int getChunkSizeWithTypeChunk() {
            return getChunkSize() + this.typeChunk.getChunkSize();
        }

        public void writeTo(ByteArrayOutputStream byteArrayOutputStream) throws IOException {
            this.header.writeTo(byteArrayOutputStream);
            byteArrayOutputStream.write(new byte[]{ColorResourcesTableCreator.typeIdColor, 0, 0, 0});
            byteArrayOutputStream.write(ColorResourcesTableCreator.intToByteArray(this.entryCount));
            for (int i14 : this.entryFlags) {
                byteArrayOutputStream.write(ColorResourcesTableCreator.intToByteArray(i14));
            }
            this.typeChunk.writeTo(byteArrayOutputStream);
        }
    }

    private ColorResourcesTableCreator() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte[] charToByteArray(char c14) {
        return new byte[]{(byte) (c14 & 255), (byte) ((c14 >> '\b') & 255)};
    }

    public static byte[] create(Context context, Map<Integer, Integer> map) throws IOException {
        PackageInfo packageInfo;
        if (map.entrySet().isEmpty()) {
            h.s("No color resources provided for harmonization.");
            return null;
        }
        PackageInfo packageInfo2 = new PackageInfo(127, context.getPackageName());
        HashMap map2 = new HashMap();
        ColorResource colorResource = null;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            ColorResource colorResource2 = new ColorResource(entry.getKey().intValue(), context.getResources().getResourceName(entry.getKey().intValue()), entry.getValue().intValue());
            if (!context.getResources().getResourceTypeName(entry.getKey().intValue()).equals("color")) {
                e.m("Non color resource found: name=", colorResource2.name, ", typeId=", Integer.toHexString(colorResource2.typeId & UnsignedBytes.MAX_VALUE));
                return null;
            }
            if (colorResource2.packageId == 1) {
                packageInfo = ANDROID_PACKAGE_INFO;
            } else {
                if (colorResource2.packageId != 127) {
                    sn.a.z(colorResource2.packageId, "Not supported with unknown package id: ");
                    return null;
                }
                packageInfo = packageInfo2;
            }
            if (!map2.containsKey(packageInfo)) {
                map2.put(packageInfo, new ArrayList());
            }
            ((List) map2.get(packageInfo)).add(colorResource2);
            colorResource = colorResource2;
        }
        byte b14 = colorResource.typeId;
        typeIdColor = b14;
        if (b14 == 0) {
            h.s("No color resources found for harmonization.");
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        new ResTable(map2).writeTo(byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte[] intToByteArray(int i14) {
        return new byte[]{(byte) (i14 & 255), (byte) ((i14 >> 8) & 255), (byte) ((i14 >> 16) & 255), (byte) ((i14 >> 24) & 255)};
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte[] shortToByteArray(short s8) {
        return new byte[]{(byte) (s8 & 255), (byte) ((s8 >> 8) & 255)};
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte[] stringToByteArray(String str) {
        char[] charArray = str.toCharArray();
        int length = charArray.length * 2;
        byte[] bArr = new byte[length + 4];
        byte[] bArrShortToByteArray = shortToByteArray((short) charArray.length);
        bArr[0] = bArrShortToByteArray[0];
        bArr[1] = bArrShortToByteArray[1];
        for (int i14 = 0; i14 < charArray.length; i14++) {
            byte[] bArrCharToByteArray = charToByteArray(charArray[i14]);
            int i15 = i14 * 2;
            bArr[i15 + 2] = bArrCharToByteArray[0];
            bArr[i15 + 3] = bArrCharToByteArray[1];
        }
        bArr[length + 2] = 0;
        bArr[length + 3] = 0;
        return bArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte[] stringToByteArrayUtf8(String str) {
        byte[] bytes = str.getBytes(Charset.forName("UTF-8"));
        byte length = (byte) bytes.length;
        int length2 = bytes.length;
        byte[] bArr = new byte[length2 + 3];
        System.arraycopy(bytes, 0, bArr, 2, length);
        bArr[1] = length;
        bArr[0] = length;
        bArr[length2 + 2] = 0;
        return bArr;
    }

    public static class StringPoolChunk {
        private static final int FLAG_UTF8 = 256;
        private static final short HEADER_SIZE = 28;
        private static final int STYLED_SPAN_LIST_END = -1;
        private final int chunkSize;
        private final ResChunkHeader header;
        private final int stringCount;
        private final List<Integer> stringIndex;
        private final List<byte[]> strings;
        private final int stringsPaddingSize;
        private final int stringsStart;
        private final int styledSpanCount;
        private final List<Integer> styledSpanIndex;
        private final List<List<StringStyledSpan>> styledSpans;
        private final int styledSpansStart;
        private final boolean utf8Encode;

        public StringPoolChunk(boolean z14, String... strArr) {
            this.stringIndex = new ArrayList();
            this.styledSpanIndex = new ArrayList();
            this.strings = new ArrayList();
            this.styledSpans = new ArrayList();
            this.utf8Encode = z14;
            int length = 0;
            for (String str : strArr) {
                Pair<byte[], List<StringStyledSpan>> pairProcessString = processString(str);
                this.stringIndex.add(Integer.valueOf(length));
                Object obj = pairProcessString.first;
                length += ((byte[]) obj).length;
                this.strings.add((byte[]) obj);
                this.styledSpans.add((List) pairProcessString.second);
            }
            int size = 0;
            for (List<StringStyledSpan> list : this.styledSpans) {
                for (StringStyledSpan stringStyledSpan : list) {
                    this.stringIndex.add(Integer.valueOf(length));
                    length += stringStyledSpan.styleString.length;
                    this.strings.add(stringStyledSpan.styleString);
                }
                this.styledSpanIndex.add(Integer.valueOf(size));
                size += (list.size() * 12) + 4;
            }
            int i14 = length % 4;
            int i15 = i14 == 0 ? 0 : 4 - i14;
            this.stringsPaddingSize = i15;
            int size2 = this.strings.size();
            this.stringCount = size2;
            this.styledSpanCount = this.strings.size() - strArr.length;
            boolean z15 = this.strings.size() - strArr.length > 0;
            if (!z15) {
                this.styledSpanIndex.clear();
                this.styledSpans.clear();
            }
            int iC = e.c(4, (size2 * 4) + 28, this.styledSpanIndex);
            this.stringsStart = iC;
            int i16 = length + i15;
            this.styledSpansStart = z15 ? iC + i16 : 0;
            int i17 = iC + i16 + (z15 ? size : 0);
            this.chunkSize = i17;
            this.header = new ResChunkHeader(ColorResourcesTableCreator.HEADER_TYPE_STRING_POOL, HEADER_SIZE, i17);
        }

        private Pair<byte[], List<StringStyledSpan>> processString(String str) {
            return new Pair<>(this.utf8Encode ? ColorResourcesTableCreator.stringToByteArrayUtf8(str) : ColorResourcesTableCreator.stringToByteArray(str), Collections.EMPTY_LIST);
        }

        public int getChunkSize() {
            return this.chunkSize;
        }

        public void writeTo(ByteArrayOutputStream byteArrayOutputStream) throws IOException {
            this.header.writeTo(byteArrayOutputStream);
            byteArrayOutputStream.write(ColorResourcesTableCreator.intToByteArray(this.stringCount));
            byteArrayOutputStream.write(ColorResourcesTableCreator.intToByteArray(this.styledSpanCount));
            byteArrayOutputStream.write(ColorResourcesTableCreator.intToByteArray(this.utf8Encode ? 256 : 0));
            byteArrayOutputStream.write(ColorResourcesTableCreator.intToByteArray(this.stringsStart));
            byteArrayOutputStream.write(ColorResourcesTableCreator.intToByteArray(this.styledSpansStart));
            Iterator<Integer> it = this.stringIndex.iterator();
            while (it.hasNext()) {
                byteArrayOutputStream.write(ColorResourcesTableCreator.intToByteArray(it.next().intValue()));
            }
            Iterator<Integer> it3 = this.styledSpanIndex.iterator();
            while (it3.hasNext()) {
                byteArrayOutputStream.write(ColorResourcesTableCreator.intToByteArray(it3.next().intValue()));
            }
            Iterator<byte[]> it4 = this.strings.iterator();
            while (it4.hasNext()) {
                byteArrayOutputStream.write(it4.next());
            }
            int i14 = this.stringsPaddingSize;
            if (i14 > 0) {
                byteArrayOutputStream.write(new byte[i14]);
            }
            Iterator<List<StringStyledSpan>> it5 = this.styledSpans.iterator();
            while (it5.hasNext()) {
                Iterator<StringStyledSpan> it6 = it5.next().iterator();
                while (it6.hasNext()) {
                    it6.next().writeTo(byteArrayOutputStream);
                }
                byteArrayOutputStream.write(ColorResourcesTableCreator.intToByteArray(-1));
            }
        }

        public StringPoolChunk(String... strArr) {
            this(false, strArr);
        }
    }
}

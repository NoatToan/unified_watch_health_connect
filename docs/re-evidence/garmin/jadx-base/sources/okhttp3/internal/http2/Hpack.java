package okhttp3.internal.http2;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.Constants;
import com.google.firebase.perf.FirebasePerformance;
import com.mapbox.common.HttpHeaders;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import o2.c;
import okhttp3.internal.Util;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p13.h0;
import p13.s;
import w63.b0;
import w63.e;
import w63.g;
import w63.g0;
import w63.h;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\u001c\u001dB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\rR\u0014\u0010\u000f\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\rR\u0014\u0010\u0011\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\rR\u0014\u0010\u0012\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\rR\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R#\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\b¨\u0006\u001e"}, d2 = {"Lokhttp3/internal/http2/Hpack;", "", "<init>", "()V", "", "Lw63/h;", "", "nameToFirstIndex", "()Ljava/util/Map;", "name", "checkLowercase", "(Lw63/h;)Lw63/h;", "PREFIX_4_BITS", "I", "PREFIX_5_BITS", "PREFIX_6_BITS", "PREFIX_7_BITS", "SETTINGS_HEADER_TABLE_SIZE", "SETTINGS_HEADER_TABLE_SIZE_LIMIT", "", "Lokhttp3/internal/http2/Header;", "STATIC_HEADER_TABLE", "[Lokhttp3/internal/http2/Header;", "getSTATIC_HEADER_TABLE", "()[Lokhttp3/internal/http2/Header;", "NAME_TO_FIRST_INDEX", "Ljava/util/Map;", "getNAME_TO_FIRST_INDEX", "Reader", "Writer", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class Hpack {
    public static final Hpack INSTANCE;
    private static final Map<h, Integer> NAME_TO_FIRST_INDEX;
    private static final int PREFIX_4_BITS = 15;
    private static final int PREFIX_5_BITS = 31;
    private static final int PREFIX_6_BITS = 63;
    private static final int PREFIX_7_BITS = 127;
    private static final int SETTINGS_HEADER_TABLE_SIZE = 4096;
    private static final int SETTINGS_HEADER_TABLE_SIZE_LIMIT = 16384;
    private static final Header[] STATIC_HEADER_TABLE;

    static {
        Hpack hpack = new Hpack();
        INSTANCE = hpack;
        Header header = new Header(Header.TARGET_AUTHORITY, "");
        h hVar = Header.TARGET_METHOD;
        Header header2 = new Header(hVar, FirebasePerformance.HttpMethod.GET);
        Header header3 = new Header(hVar, FirebasePerformance.HttpMethod.POST);
        h hVar2 = Header.TARGET_PATH;
        Header header4 = new Header(hVar2, "/");
        Header header5 = new Header(hVar2, "/index.html");
        h hVar3 = Header.TARGET_SCHEME;
        Header header6 = new Header(hVar3, "http");
        Header header7 = new Header(hVar3, "https");
        h hVar4 = Header.RESPONSE_STATUS;
        STATIC_HEADER_TABLE = new Header[]{header, header2, header3, header4, header5, header6, header7, new Header(hVar4, "200"), new Header(hVar4, "204"), new Header(hVar4, "206"), new Header(hVar4, "304"), new Header(hVar4, "400"), new Header(hVar4, "404"), new Header(hVar4, "500"), new Header("accept-charset", ""), new Header("accept-encoding", "gzip, deflate"), new Header("accept-language", ""), new Header("accept-ranges", ""), new Header(HttpHeaders.ACCEPT, ""), new Header("access-control-allow-origin", ""), new Header(HttpHeaders.AGE, ""), new Header("allow", ""), new Header("authorization", ""), new Header(HttpHeaders.CACHE_CONTROL, ""), new Header("content-disposition", ""), new Header(HttpHeaders.CONTENT_ENCODING, ""), new Header("content-language", ""), new Header(HttpHeaders.CONTENT_LENGTH, ""), new Header("content-location", ""), new Header("content-range", ""), new Header(HttpHeaders.CONTENT_TYPE, ""), new Header("cookie", ""), new Header("date", ""), new Header(HttpHeaders.ETAG, ""), new Header("expect", ""), new Header("expires", ""), new Header(Constants.MessagePayloadKeys.FROM, ""), new Header("host", ""), new Header("if-match", ""), new Header("if-modified-since", ""), new Header(HttpHeaders.IF_NONE_MATCH, ""), new Header("if-range", ""), new Header("if-unmodified-since", ""), new Header(HttpHeaders.LAST_MODIFIED, ""), new Header("link", ""), new Header(FirebaseAnalytics.Param.LOCATION, ""), new Header("max-forwards", ""), new Header("proxy-authenticate", ""), new Header("proxy-authorization", ""), new Header("range", ""), new Header("referer", ""), new Header("refresh", ""), new Header(HttpHeaders.RETRY_AFTER, ""), new Header("server", ""), new Header("set-cookie", ""), new Header("strict-transport-security", ""), new Header("transfer-encoding", ""), new Header(HttpHeaders.USER_AGENT, ""), new Header("vary", ""), new Header("via", ""), new Header("www-authenticate", "")};
        NAME_TO_FIRST_INDEX = hpack.nameToFirstIndex();
    }

    private Hpack() {
    }

    private final Map<h, Integer> nameToFirstIndex() {
        Header[] headerArr = STATIC_HEADER_TABLE;
        LinkedHashMap linkedHashMap = new LinkedHashMap(headerArr.length);
        int length = headerArr.length;
        for (int i14 = 0; i14 < length; i14++) {
            Header[] headerArr2 = STATIC_HEADER_TABLE;
            if (!linkedHashMap.containsKey(headerArr2[i14].name)) {
                linkedHashMap.put(headerArr2[i14].name, Integer.valueOf(i14));
            }
        }
        Map<h, Integer> mapUnmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        mapUnmodifiableMap.getClass();
        return mapUnmodifiableMap;
    }

    public final h checkLowercase(h name) throws IOException {
        name.getClass();
        int iD = name.d();
        for (int i14 = 0; i14 < iD; i14++) {
            byte bI = name.i(i14);
            if (65 <= bI && bI < 91) {
                vb.h.C("PROTOCOL_ERROR response malformed: mixed case name: ".concat(name.s()));
                return null;
            }
        }
        return name;
    }

    public final Map<h, Integer> getNAME_TO_FIRST_INDEX() {
        return NAME_TO_FIRST_INDEX;
    }

    public final Header[] getSTATIC_HEADER_TABLE() {
        return STATIC_HEADER_TABLE;
    }

    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0011\n\u0002\b\u0006\u0018\u00002\u00020\u0001B%\b\u0007\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0014\u0010\fJ\u001b\u0010\u0017\u001a\u00020\n2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00100\u0015¢\u0006\u0004\b\u0017\u0010\u0018J%\u0010\u001c\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010 \u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!J\u0015\u0010\"\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\"\u0010#R\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010$R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010%R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010&R\u0016\u0010'\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010$R\u0016\u0010(\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010%R\u0016\u0010)\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b)\u0010$R\u001e\u0010+\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100*8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u0010-\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010$R\u0016\u0010.\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b.\u0010$R\u0016\u0010/\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b/\u0010$¨\u00060"}, d2 = {"Lokhttp3/internal/http2/Hpack$Writer;", "", "", "headerTableSizeSetting", "", "useCompression", "Lw63/e;", "out", "<init>", "(IZLw63/e;)V", "", "clearDynamicTable", "()V", "bytesToRecover", "evictToRecoverBytes", "(I)I", "Lokhttp3/internal/http2/Header;", "entry", "insertIntoDynamicTable", "(Lokhttp3/internal/http2/Header;)V", "adjustDynamicTableByteCount", "", "headerBlock", "writeHeaders", "(Ljava/util/List;)V", "value", "prefixMask", "bits", "writeInt", "(III)V", "Lw63/h;", "data", "writeByteString", "(Lw63/h;)V", "resizeHeaderTable", "(I)V", "I", "Z", "Lw63/e;", "smallestHeaderTableSizeSetting", "emitDynamicTableSizeUpdate", "maxDynamicTableByteCount", "", "dynamicTable", "[Lokhttp3/internal/http2/Header;", "nextHeaderIndex", "headerCount", "dynamicTableByteCount", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Writer {
        public Header[] dynamicTable;
        public int dynamicTableByteCount;
        private boolean emitDynamicTableSizeUpdate;
        public int headerCount;
        public int headerTableSizeSetting;
        public int maxDynamicTableByteCount;
        private int nextHeaderIndex;
        private final e out;
        private int smallestHeaderTableSizeSetting;
        private final boolean useCompression;

        public Writer(int i14, boolean z14, e eVar) {
            eVar.getClass();
            this.headerTableSizeSetting = i14;
            this.useCompression = z14;
            this.out = eVar;
            this.smallestHeaderTableSizeSetting = Integer.MAX_VALUE;
            this.maxDynamicTableByteCount = i14;
            Header[] headerArr = new Header[8];
            this.dynamicTable = headerArr;
            this.nextHeaderIndex = headerArr.length - 1;
        }

        private final void adjustDynamicTableByteCount() {
            int i14 = this.maxDynamicTableByteCount;
            int i15 = this.dynamicTableByteCount;
            if (i14 < i15) {
                if (i14 == 0) {
                    clearDynamicTable();
                } else {
                    evictToRecoverBytes(i15 - i14);
                }
            }
        }

        private final void clearDynamicTable() {
            Header[] headerArr = this.dynamicTable;
            s.m(0, headerArr.length, null, headerArr);
            this.nextHeaderIndex = this.dynamicTable.length - 1;
            this.headerCount = 0;
            this.dynamicTableByteCount = 0;
        }

        private final int evictToRecoverBytes(int bytesToRecover) {
            int i14;
            int i15 = 0;
            if (bytesToRecover > 0) {
                int length = this.dynamicTable.length;
                while (true) {
                    length--;
                    i14 = this.nextHeaderIndex;
                    if (length < i14 || bytesToRecover <= 0) {
                        break;
                    }
                    Header header = this.dynamicTable[length];
                    header.getClass();
                    bytesToRecover -= header.hpackSize;
                    int i16 = this.dynamicTableByteCount;
                    Header header2 = this.dynamicTable[length];
                    header2.getClass();
                    this.dynamicTableByteCount = i16 - header2.hpackSize;
                    this.headerCount--;
                    i15++;
                }
                Header[] headerArr = this.dynamicTable;
                System.arraycopy(headerArr, i14 + 1, headerArr, i14 + 1 + i15, this.headerCount);
                Header[] headerArr2 = this.dynamicTable;
                int i17 = this.nextHeaderIndex;
                Arrays.fill(headerArr2, i17 + 1, i17 + 1 + i15, (Object) null);
                this.nextHeaderIndex += i15;
            }
            return i15;
        }

        private final void insertIntoDynamicTable(Header entry) {
            int i14 = entry.hpackSize;
            int i15 = this.maxDynamicTableByteCount;
            if (i14 > i15) {
                clearDynamicTable();
                return;
            }
            evictToRecoverBytes((this.dynamicTableByteCount + i14) - i15);
            int i16 = this.headerCount + 1;
            Header[] headerArr = this.dynamicTable;
            if (i16 > headerArr.length) {
                Header[] headerArr2 = new Header[headerArr.length * 2];
                System.arraycopy(headerArr, 0, headerArr2, headerArr.length, headerArr.length);
                this.nextHeaderIndex = this.dynamicTable.length - 1;
                this.dynamicTable = headerArr2;
            }
            int i17 = this.nextHeaderIndex;
            this.nextHeaderIndex = i17 - 1;
            this.dynamicTable[i17] = entry;
            this.headerCount++;
            this.dynamicTableByteCount += i14;
        }

        public final void resizeHeaderTable(int headerTableSizeSetting) {
            this.headerTableSizeSetting = headerTableSizeSetting;
            int iMin = Math.min(headerTableSizeSetting, 16384);
            int i14 = this.maxDynamicTableByteCount;
            if (i14 == iMin) {
                return;
            }
            if (iMin < i14) {
                this.smallestHeaderTableSizeSetting = Math.min(this.smallestHeaderTableSizeSetting, iMin);
            }
            this.emitDynamicTableSizeUpdate = true;
            this.maxDynamicTableByteCount = iMin;
            adjustDynamicTableByteCount();
        }

        public final void writeByteString(h data) throws EOFException {
            data.getClass();
            if (this.useCompression) {
                Huffman huffman = Huffman.INSTANCE;
                if (huffman.encodedLength(data) < data.d()) {
                    e eVar = new e();
                    huffman.encode(data, eVar);
                    h hVarH0 = eVar.h0(eVar.f183349b);
                    writeInt(hVarH0.d(), 127, 128);
                    this.out.E(hVarH0);
                    return;
                }
            }
            writeInt(data.d(), 127, 0);
            this.out.E(data);
        }

        /* JADX WARN: Code duplicated, block: B:22:0x0075  */
        public final void writeHeaders(List<Header> headerBlock) throws EOFException {
            int length;
            int length2;
            headerBlock.getClass();
            if (this.emitDynamicTableSizeUpdate) {
                int i14 = this.smallestHeaderTableSizeSetting;
                if (i14 < this.maxDynamicTableByteCount) {
                    writeInt(i14, 31, 32);
                }
                this.emitDynamicTableSizeUpdate = false;
                this.smallestHeaderTableSizeSetting = Integer.MAX_VALUE;
                writeInt(this.maxDynamicTableByteCount, 31, 32);
            }
            int size = headerBlock.size();
            for (int i15 = 0; i15 < size; i15++) {
                Header header = headerBlock.get(i15);
                h hVarR = header.name.r();
                h hVar = header.value;
                Hpack hpack = Hpack.INSTANCE;
                Integer num = hpack.getNAME_TO_FIRST_INDEX().get(hVarR);
                if (num != null) {
                    int iIntValue = num.intValue();
                    length2 = iIntValue + 1;
                    if (2 > length2 || length2 >= 8) {
                        length = length2;
                        length2 = -1;
                    } else if (p005kotlin.jvm.internal.s.g(hpack.getSTATIC_HEADER_TABLE()[iIntValue].value, hVar)) {
                        length = length2;
                    } else if (p005kotlin.jvm.internal.s.g(hpack.getSTATIC_HEADER_TABLE()[length2].value, hVar)) {
                        length = length2;
                        length2 = iIntValue + 2;
                    } else {
                        length = length2;
                        length2 = -1;
                    }
                } else {
                    length = -1;
                    length2 = -1;
                }
                if (length2 == -1) {
                    int length3 = this.dynamicTable.length;
                    for (int i16 = this.nextHeaderIndex + 1; i16 < length3; i16++) {
                        Header header2 = this.dynamicTable[i16];
                        header2.getClass();
                        if (p005kotlin.jvm.internal.s.g(header2.name, hVarR)) {
                            Header header3 = this.dynamicTable[i16];
                            header3.getClass();
                            if (p005kotlin.jvm.internal.s.g(header3.value, hVar)) {
                                length2 = Hpack.INSTANCE.getSTATIC_HEADER_TABLE().length + (i16 - this.nextHeaderIndex);
                                break;
                            } else if (length == -1) {
                                length = (i16 - this.nextHeaderIndex) + Hpack.INSTANCE.getSTATIC_HEADER_TABLE().length;
                            }
                        }
                    }
                }
                if (length2 != -1) {
                    writeInt(length2, 127, 128);
                } else if (length == -1) {
                    this.out.H(64);
                    writeByteString(hVarR);
                    writeByteString(hVar);
                    insertIntoDynamicTable(header);
                } else {
                    h hVar2 = Header.PSEUDO_PREFIX;
                    hVarR.getClass();
                    hVar2.getClass();
                    if (!hVarR.n(0, hVar2, hVar2.d()) || p005kotlin.jvm.internal.s.g(Header.TARGET_AUTHORITY, hVarR)) {
                        writeInt(length, 63, 64);
                        writeByteString(hVar);
                        insertIntoDynamicTable(header);
                    } else {
                        writeInt(length, 15, 0);
                        writeByteString(hVar);
                    }
                }
            }
        }

        public final void writeInt(int value, int prefixMask, int bits) {
            e eVar = this.out;
            if (value < prefixMask) {
                eVar.H(value | bits);
                return;
            }
            eVar.H(bits | prefixMask);
            int i14 = value - prefixMask;
            while (true) {
                e eVar2 = this.out;
                if (i14 < 128) {
                    eVar2.H(i14);
                    return;
                } else {
                    eVar2.H(128 | (i14 & 127));
                    i14 >>>= 7;
                }
            }
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Writer(e eVar) {
            this(0, false, eVar, 3, null);
            eVar.getClass();
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Writer(int i14, e eVar) {
            this(i14, false, eVar, 2, null);
            eVar.getClass();
        }

        public /* synthetic */ Writer(int i14, boolean z14, e eVar, int i15, j jVar) {
            this((i15 & 1) != 0 ? 4096 : i14, (i15 & 2) != 0 ? true : z14, eVar);
        }
    }

    @Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\n\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0006\u0018\u00002\u00020\u0001B#\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0013\u0010\u000fJ\u0017\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0014\u0010\u0012J\u000f\u0010\u0015\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0015\u0010\u000bJ\u0017\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0017\u0010\u0012J\u000f\u0010\u0018\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0018\u0010\u000bJ\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0010\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0010\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010!\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0004H\u0002¢\u0006\u0004\b#\u0010$J\u0013\u0010&\u001a\b\u0012\u0004\u0012\u00020\u001f0%¢\u0006\u0004\b&\u0010'J\r\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010$J\r\u0010(\u001a\u00020\t¢\u0006\u0004\b(\u0010\u000bJ\u001d\u0010+\u001a\u00020\u00042\u0006\u0010)\u001a\u00020\u00042\u0006\u0010*\u001a\u00020\u0004¢\u0006\u0004\b+\u0010,J\r\u0010-\u001a\u00020\u0019¢\u0006\u0004\b-\u0010.R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010/R\u0016\u0010\u0006\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010/R\u001a\u00101\u001a\b\u0012\u0004\u0012\u00020\u001f008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u0010\u0003\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u00104R\u001e\u00106\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f058\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u0016\u00108\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u0010/R\u0016\u00109\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b9\u0010/R\u0016\u0010:\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b:\u0010/¨\u0006;"}, d2 = {"Lokhttp3/internal/http2/Hpack$Reader;", "", "Lw63/g0;", "source", "", "headerTableSizeSetting", "maxDynamicTableByteCount", "<init>", "(Lw63/g0;II)V", "", "adjustDynamicTableByteCount", "()V", "clearDynamicTable", "bytesToRecover", "evictToRecoverBytes", "(I)I", FirebaseAnalytics.Param.INDEX, "readIndexedHeader", "(I)V", "dynamicTableIndex", "readLiteralHeaderWithoutIndexingIndexedName", "readLiteralHeaderWithoutIndexingNewName", "nameIndex", "readLiteralHeaderWithIncrementalIndexingIndexedName", "readLiteralHeaderWithIncrementalIndexingNewName", "Lw63/h;", "getName", "(I)Lw63/h;", "", "isStaticHeader", "(I)Z", "Lokhttp3/internal/http2/Header;", "entry", "insertIntoDynamicTable", "(ILokhttp3/internal/http2/Header;)V", "readByte", "()I", "", "getAndResetHeaderList", "()Ljava/util/List;", "readHeaders", "firstByte", "prefixMask", "readInt", "(II)I", "readByteString", "()Lw63/h;", "I", "", "headerList", "Ljava/util/List;", "Lw63/g;", "Lw63/g;", "", "dynamicTable", "[Lokhttp3/internal/http2/Header;", "nextHeaderIndex", "headerCount", "dynamicTableByteCount", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Reader {
        public Header[] dynamicTable;
        public int dynamicTableByteCount;
        public int headerCount;
        private final List<Header> headerList;
        private final int headerTableSizeSetting;
        private int maxDynamicTableByteCount;
        private int nextHeaderIndex;
        private final g source;

        public Reader(g0 g0Var, int i14, int i15) {
            g0Var.getClass();
            this.headerTableSizeSetting = i14;
            this.maxDynamicTableByteCount = i15;
            this.headerList = new ArrayList();
            this.source = new b0(g0Var);
            Header[] headerArr = new Header[8];
            this.dynamicTable = headerArr;
            this.nextHeaderIndex = headerArr.length - 1;
        }

        private final void adjustDynamicTableByteCount() {
            int i14 = this.maxDynamicTableByteCount;
            int i15 = this.dynamicTableByteCount;
            if (i14 < i15) {
                if (i14 == 0) {
                    clearDynamicTable();
                } else {
                    evictToRecoverBytes(i15 - i14);
                }
            }
        }

        private final void clearDynamicTable() {
            Header[] headerArr = this.dynamicTable;
            s.m(0, headerArr.length, null, headerArr);
            this.nextHeaderIndex = this.dynamicTable.length - 1;
            this.headerCount = 0;
            this.dynamicTableByteCount = 0;
        }

        private final int dynamicTableIndex(int index) {
            return this.nextHeaderIndex + 1 + index;
        }

        private final int evictToRecoverBytes(int bytesToRecover) {
            int i14;
            int i15 = 0;
            if (bytesToRecover > 0) {
                int length = this.dynamicTable.length;
                while (true) {
                    length--;
                    i14 = this.nextHeaderIndex;
                    if (length < i14 || bytesToRecover <= 0) {
                        break;
                    }
                    Header header = this.dynamicTable[length];
                    header.getClass();
                    int i16 = header.hpackSize;
                    bytesToRecover -= i16;
                    this.dynamicTableByteCount -= i16;
                    this.headerCount--;
                    i15++;
                }
                Header[] headerArr = this.dynamicTable;
                System.arraycopy(headerArr, i14 + 1, headerArr, i14 + 1 + i15, this.headerCount);
                this.nextHeaderIndex += i15;
            }
            return i15;
        }

        private final h getName(int index) throws IOException {
            if (isStaticHeader(index)) {
                return Hpack.INSTANCE.getSTATIC_HEADER_TABLE()[index].name;
            }
            int iDynamicTableIndex = dynamicTableIndex(index - Hpack.INSTANCE.getSTATIC_HEADER_TABLE().length);
            if (iDynamicTableIndex >= 0) {
                Header[] headerArr = this.dynamicTable;
                if (iDynamicTableIndex < headerArr.length) {
                    Header header = headerArr[iDynamicTableIndex];
                    header.getClass();
                    return header.name;
                }
            }
            c.r(index + 1, "Header index too large ");
            return null;
        }

        private final void insertIntoDynamicTable(int index, Header entry) {
            this.headerList.add(entry);
            int i14 = entry.hpackSize;
            if (index != -1) {
                Header header = this.dynamicTable[dynamicTableIndex(index)];
                header.getClass();
                i14 -= header.hpackSize;
            }
            int i15 = this.maxDynamicTableByteCount;
            if (i14 > i15) {
                clearDynamicTable();
                return;
            }
            int iEvictToRecoverBytes = evictToRecoverBytes((this.dynamicTableByteCount + i14) - i15);
            if (index == -1) {
                int i16 = this.headerCount + 1;
                Header[] headerArr = this.dynamicTable;
                if (i16 > headerArr.length) {
                    Header[] headerArr2 = new Header[headerArr.length * 2];
                    System.arraycopy(headerArr, 0, headerArr2, headerArr.length, headerArr.length);
                    this.nextHeaderIndex = this.dynamicTable.length - 1;
                    this.dynamicTable = headerArr2;
                }
                int i17 = this.nextHeaderIndex;
                this.nextHeaderIndex = i17 - 1;
                this.dynamicTable[i17] = entry;
                this.headerCount++;
            } else {
                this.dynamicTable[dynamicTableIndex(index) + iEvictToRecoverBytes + index] = entry;
            }
            this.dynamicTableByteCount += i14;
        }

        private final boolean isStaticHeader(int index) {
            return index >= 0 && index <= Hpack.INSTANCE.getSTATIC_HEADER_TABLE().length - 1;
        }

        private final int readByte() {
            return Util.and(this.source.readByte(), 255);
        }

        private final void readIndexedHeader(int index) throws IOException {
            if (isStaticHeader(index)) {
                this.headerList.add(Hpack.INSTANCE.getSTATIC_HEADER_TABLE()[index]);
                return;
            }
            int iDynamicTableIndex = dynamicTableIndex(index - Hpack.INSTANCE.getSTATIC_HEADER_TABLE().length);
            if (iDynamicTableIndex >= 0) {
                Header[] headerArr = this.dynamicTable;
                if (iDynamicTableIndex < headerArr.length) {
                    List<Header> list = this.headerList;
                    Header header = headerArr[iDynamicTableIndex];
                    header.getClass();
                    list.add(header);
                    return;
                }
            }
            c.r(index + 1, "Header index too large ");
        }

        private final void readLiteralHeaderWithIncrementalIndexingIndexedName(int nameIndex) {
            insertIntoDynamicTable(-1, new Header(getName(nameIndex), readByteString()));
        }

        private final void readLiteralHeaderWithIncrementalIndexingNewName() {
            insertIntoDynamicTable(-1, new Header(Hpack.INSTANCE.checkLowercase(readByteString()), readByteString()));
        }

        private final void readLiteralHeaderWithoutIndexingIndexedName(int index) throws IOException {
            this.headerList.add(new Header(getName(index), readByteString()));
        }

        private final void readLiteralHeaderWithoutIndexingNewName() throws IOException {
            this.headerList.add(new Header(Hpack.INSTANCE.checkLowercase(readByteString()), readByteString()));
        }

        public final List<Header> getAndResetHeaderList() {
            List<Header> listB1 = h0.b1(this.headerList);
            this.headerList.clear();
            return listB1;
        }

        /* JADX INFO: renamed from: maxDynamicTableByteCount, reason: from getter */
        public final int getMaxDynamicTableByteCount() {
            return this.maxDynamicTableByteCount;
        }

        public final h readByteString() {
            int i14 = readByte();
            boolean z14 = (i14 & 128) == 128;
            long j8 = readInt(i14, 127);
            if (!z14) {
                return this.source.h0(j8);
            }
            e eVar = new e();
            Huffman.INSTANCE.decode(this.source, j8, eVar);
            return eVar.h0(eVar.f183349b);
        }

        public final void readHeaders() throws IOException {
            while (!this.source.F1()) {
                int iAnd = Util.and(this.source.readByte(), 255);
                if (iAnd == 128) {
                    vb.h.C("index == 0");
                    return;
                }
                if ((iAnd & 128) == 128) {
                    readIndexedHeader(readInt(iAnd, 127) - 1);
                } else if (iAnd == 64) {
                    readLiteralHeaderWithIncrementalIndexingNewName();
                } else if ((iAnd & 64) == 64) {
                    readLiteralHeaderWithIncrementalIndexingIndexedName(readInt(iAnd, 63) - 1);
                } else if ((iAnd & 32) == 32) {
                    int i14 = readInt(iAnd, 31);
                    this.maxDynamicTableByteCount = i14;
                    if (i14 < 0 || i14 > this.headerTableSizeSetting) {
                        c.r(this.maxDynamicTableByteCount, "Invalid dynamic table size update ");
                        return;
                    }
                    adjustDynamicTableByteCount();
                } else if (iAnd == 16 || iAnd == 0) {
                    readLiteralHeaderWithoutIndexingNewName();
                } else {
                    readLiteralHeaderWithoutIndexingIndexedName(readInt(iAnd, 15) - 1);
                }
            }
        }

        public final int readInt(int firstByte, int prefixMask) {
            int i14 = firstByte & prefixMask;
            if (i14 < prefixMask) {
                return i14;
            }
            int i15 = 0;
            while (true) {
                int i16 = readByte();
                if ((i16 & 128) == 0) {
                    return prefixMask + (i16 << i15);
                }
                prefixMask += (i16 & 127) << i15;
                i15 += 7;
            }
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Reader(g0 g0Var, int i14) {
            this(g0Var, i14, 0, 4, null);
            g0Var.getClass();
        }

        public /* synthetic */ Reader(g0 g0Var, int i14, int i15, int i16, j jVar) {
            this(g0Var, i14, (i16 & 4) != 0 ? i14 : i15);
        }
    }
}

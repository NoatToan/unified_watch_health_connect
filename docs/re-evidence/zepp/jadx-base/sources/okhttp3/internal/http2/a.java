package okhttp3.internal.http2;

import com.amazon.identity.auth.device.endpoint.AbstractJSONTokenResponse;
import com.huami.account.utils.ResponseConstant;
import com.liulishuo.filedownloader.model.FileDownloadModel;
import com.xiaomi.infra.galaxy.fds.Common;
import io.flutter.embedding.android.FlutterActivityLaunchConfigs;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import okhttp3.internal.Util;
import okio.Buffer;
import okio.BufferedSource;
import okio.ByteString;
import okio.Okio;
import okio.Source;

/* JADX INFO: loaded from: classes23.dex */
final class a {
    private static final int a = 15;
    private static final int b = 31;
    private static final int c = 63;
    private static final int d = 127;
    public static final Header[] e;
    public static final Map<ByteString, Integer> f;

    /* JADX INFO: renamed from: okhttp3.internal.http2.a$a, reason: collision with other inner class name */
    public static final class C1189a {
        private final List<Header> a;
        private final BufferedSource b;
        private final int c;
        private int d;
        public Header[] e;
        public int f;
        public int g;
        public int h;

        public C1189a(int i, Source source) {
            this(i, i, source);
        }

        private void a() {
            int i = this.d;
            int i2 = this.h;
            if (i < i2) {
                if (i == 0) {
                    b();
                } else {
                    d(i2 - i);
                }
            }
        }

        private void b() {
            Arrays.fill(this.e, (Object) null);
            this.f = this.e.length - 1;
            this.g = 0;
            this.h = 0;
        }

        private int c(int i) {
            return this.f + 1 + i;
        }

        private int d(int i) {
            int i2;
            int i3 = 0;
            if (i > 0) {
                int length = this.e.length;
                while (true) {
                    length--;
                    i2 = this.f;
                    if (length < i2 || i <= 0) {
                        break;
                    }
                    Header[] headerArr = this.e;
                    i -= headerArr[length].a;
                    this.h -= headerArr[length].a;
                    this.g--;
                    i3++;
                }
                Header[] headerArr2 = this.e;
                System.arraycopy(headerArr2, i2 + 1, headerArr2, i2 + 1 + i3, this.g);
                this.f += i3;
            }
            return i3;
        }

        private ByteString f(int i) throws IOException {
            if (h(i)) {
                return a.e[i].name;
            }
            int iC = c(i - a.e.length);
            if (iC >= 0) {
                Header[] headerArr = this.e;
                if (iC < headerArr.length) {
                    return headerArr[iC].name;
                }
            }
            throw new IOException("Header index too large " + (i + 1));
        }

        private void g(int i, Header header) {
            this.a.add(header);
            int i2 = header.a;
            if (i != -1) {
                i2 -= this.e[c(i)].a;
            }
            int i3 = this.d;
            if (i2 > i3) {
                b();
                return;
            }
            int iD = d((this.h + i2) - i3);
            if (i == -1) {
                int i4 = this.g + 1;
                Header[] headerArr = this.e;
                if (i4 > headerArr.length) {
                    Header[] headerArr2 = new Header[headerArr.length * 2];
                    System.arraycopy(headerArr, 0, headerArr2, headerArr.length, headerArr.length);
                    this.f = this.e.length - 1;
                    this.e = headerArr2;
                }
                int i5 = this.f;
                this.f = i5 - 1;
                this.e[i5] = header;
                this.g++;
            } else {
                this.e[i + c(i) + iD] = header;
            }
            this.h += i2;
        }

        private boolean h(int i) {
            return i >= 0 && i <= a.e.length - 1;
        }

        private int j() throws IOException {
            return this.b.readByte() & 255;
        }

        private void m(int i) throws IOException {
            if (h(i)) {
                this.a.add(a.e[i]);
                return;
            }
            int iC = c(i - a.e.length);
            if (iC >= 0) {
                Header[] headerArr = this.e;
                if (iC < headerArr.length) {
                    this.a.add(headerArr[iC]);
                    return;
                }
            }
            throw new IOException("Header index too large " + (i + 1));
        }

        private void o(int i) throws IOException {
            g(-1, new Header(f(i), k()));
        }

        private void p() throws IOException {
            g(-1, new Header(a.a(k()), k()));
        }

        private void q(int i) throws IOException {
            this.a.add(new Header(f(i), k()));
        }

        private void r() throws IOException {
            this.a.add(new Header(a.a(k()), k()));
        }

        public List<Header> e() {
            ArrayList arrayList = new ArrayList(this.a);
            this.a.clear();
            return arrayList;
        }

        public int i() {
            return this.d;
        }

        public ByteString k() throws IOException {
            int iJ = j();
            boolean z = (iJ & 128) == 128;
            int iN = n(iJ, 127);
            return z ? ByteString.of(d.f().c(this.b.readByteArray(iN))) : this.b.readByteString(iN);
        }

        public void l() throws IOException {
            while (!this.b.exhausted()) {
                int i = this.b.readByte() & 255;
                if (i == 128) {
                    throw new IOException("index == 0");
                }
                if ((i & 128) == 128) {
                    m(n(i, 127) - 1);
                } else if (i == 64) {
                    p();
                } else if ((i & 64) == 64) {
                    o(n(i, 63) - 1);
                } else if ((i & 32) == 32) {
                    int iN = n(i, 31);
                    this.d = iN;
                    if (iN < 0 || iN > this.c) {
                        throw new IOException("Invalid dynamic table size update " + this.d);
                    }
                    a();
                } else if (i == 16 || i == 0) {
                    r();
                } else {
                    q(n(i, 15) - 1);
                }
            }
        }

        public int n(int i, int i2) throws IOException {
            int i3 = i & i2;
            if (i3 < i2) {
                return i3;
            }
            int i4 = 0;
            while (true) {
                int iJ = j();
                if ((iJ & 128) == 0) {
                    return i2 + (iJ << i4);
                }
                i2 += (iJ & 127) << i4;
                i4 += 7;
            }
        }

        public C1189a(int i, int i2, Source source) {
            this.a = new ArrayList();
            Header[] headerArr = new Header[8];
            this.e = headerArr;
            this.f = headerArr.length - 1;
            this.g = 0;
            this.h = 0;
            this.c = i;
            this.d = i2;
            this.b = Okio.buffer(source);
        }
    }

    public static final class b {
        private static final int k = 4096;
        private static final int l = 16384;
        private final Buffer a;
        private final boolean b;
        private int c;
        private boolean d;
        public int e;
        public int f;
        public Header[] g;
        public int h;
        public int i;
        public int j;

        public b(Buffer buffer) {
            this(4096, true, buffer);
        }

        private void a() {
            int i = this.f;
            int i2 = this.j;
            if (i < i2) {
                if (i == 0) {
                    b();
                } else {
                    c(i2 - i);
                }
            }
        }

        private void b() {
            Arrays.fill(this.g, (Object) null);
            this.h = this.g.length - 1;
            this.i = 0;
            this.j = 0;
        }

        private int c(int i) {
            int i2;
            int i3 = 0;
            if (i > 0) {
                int length = this.g.length;
                while (true) {
                    length--;
                    i2 = this.h;
                    if (length < i2 || i <= 0) {
                        break;
                    }
                    Header[] headerArr = this.g;
                    i -= headerArr[length].a;
                    this.j -= headerArr[length].a;
                    this.i--;
                    i3++;
                }
                Header[] headerArr2 = this.g;
                System.arraycopy(headerArr2, i2 + 1, headerArr2, i2 + 1 + i3, this.i);
                Header[] headerArr3 = this.g;
                int i4 = this.h;
                Arrays.fill(headerArr3, i4 + 1, i4 + 1 + i3, (Object) null);
                this.h += i3;
            }
            return i3;
        }

        private void d(Header header) {
            int i = header.a;
            int i2 = this.f;
            if (i > i2) {
                b();
                return;
            }
            c((this.j + i) - i2);
            int i3 = this.i + 1;
            Header[] headerArr = this.g;
            if (i3 > headerArr.length) {
                Header[] headerArr2 = new Header[headerArr.length * 2];
                System.arraycopy(headerArr, 0, headerArr2, headerArr.length, headerArr.length);
                this.h = this.g.length - 1;
                this.g = headerArr2;
            }
            int i4 = this.h;
            this.h = i4 - 1;
            this.g[i4] = header;
            this.i++;
            this.j += i;
        }

        public void e(int i) {
            this.e = i;
            int iMin = Math.min(i, 16384);
            int i2 = this.f;
            if (i2 == iMin) {
                return;
            }
            if (iMin < i2) {
                this.c = Math.min(this.c, iMin);
            }
            this.d = true;
            this.f = iMin;
            a();
        }

        public void f(ByteString byteString) throws IOException {
            if (!this.b || d.f().e(byteString) >= byteString.size()) {
                h(byteString.size(), 127, 0);
                this.a.write(byteString);
                return;
            }
            Buffer buffer = new Buffer();
            d.f().d(byteString, buffer);
            ByteString byteString2 = buffer.readByteString();
            h(byteString2.size(), 127, 128);
            this.a.write(byteString2);
        }

        /* JADX WARN: Code duplicated, block: B:22:0x006a  */
        public void g(List<Header> list) throws IOException {
            int length;
            int length2;
            if (this.d) {
                int i = this.c;
                if (i < this.f) {
                    h(i, 31, 32);
                }
                this.d = false;
                this.c = Integer.MAX_VALUE;
                h(this.f, 31, 32);
            }
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                Header header = list.get(i2);
                ByteString asciiLowercase = header.name.toAsciiLowercase();
                ByteString byteString = header.value;
                Integer num = a.f.get(asciiLowercase);
                if (num != null) {
                    length = num.intValue() + 1;
                    if (length <= 1 || length >= 8) {
                        length2 = length;
                        length = -1;
                    } else {
                        Header[] headerArr = a.e;
                        if (Util.equal(headerArr[length - 1].value, byteString)) {
                            length2 = length;
                        } else if (Util.equal(headerArr[length].value, byteString)) {
                            length2 = length;
                            length++;
                        } else {
                            length2 = length;
                            length = -1;
                        }
                    }
                } else {
                    length = -1;
                    length2 = -1;
                }
                if (length == -1) {
                    int length3 = this.g.length;
                    for (int i3 = this.h + 1; i3 < length3; i3++) {
                        if (Util.equal(this.g[i3].name, asciiLowercase)) {
                            if (Util.equal(this.g[i3].value, byteString)) {
                                length = a.e.length + (i3 - this.h);
                                break;
                            } else if (length2 == -1) {
                                length2 = (i3 - this.h) + a.e.length;
                            }
                        }
                    }
                }
                if (length != -1) {
                    h(length, 127, 128);
                } else if (length2 == -1) {
                    this.a.writeByte(64);
                    f(asciiLowercase);
                    f(byteString);
                    d(header);
                } else if (!asciiLowercase.startsWith(Header.PSEUDO_PREFIX) || Header.TARGET_AUTHORITY.equals(asciiLowercase)) {
                    h(length2, 63, 64);
                    f(byteString);
                    d(header);
                } else {
                    h(length2, 15, 0);
                    f(byteString);
                }
            }
        }

        public void h(int i, int i2, int i3) {
            if (i < i2) {
                this.a.writeByte(i | i3);
                return;
            }
            this.a.writeByte(i3 | i2);
            int i4 = i - i2;
            while (i4 >= 128) {
                this.a.writeByte(128 | (i4 & 127));
                i4 >>>= 7;
            }
            this.a.writeByte(i4);
        }

        public b(int i, boolean z, Buffer buffer) {
            this.c = Integer.MAX_VALUE;
            Header[] headerArr = new Header[8];
            this.g = headerArr;
            this.h = headerArr.length - 1;
            this.i = 0;
            this.j = 0;
            this.e = i;
            this.f = i;
            this.b = z;
            this.a = buffer;
        }
    }

    static {
        ByteString byteString = Header.TARGET_METHOD;
        ByteString byteString2 = Header.TARGET_PATH;
        ByteString byteString3 = Header.TARGET_SCHEME;
        ByteString byteString4 = Header.RESPONSE_STATUS;
        e = new Header[]{new Header(Header.TARGET_AUTHORITY, ""), new Header(byteString, "GET"), new Header(byteString, "POST"), new Header(byteString2, FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE), new Header(byteString2, "/index.html"), new Header(byteString3, "http"), new Header(byteString3, "https"), new Header(byteString4, "200"), new Header(byteString4, "204"), new Header(byteString4, "206"), new Header(byteString4, "304"), new Header(byteString4, ResponseConstant.ERROR_400), new Header(byteString4, "404"), new Header(byteString4, "500"), new Header("accept-charset", ""), new Header("accept-encoding", "gzip, deflate"), new Header("accept-language", ""), new Header("accept-ranges", ""), new Header("accept", ""), new Header("access-control-allow-origin", ""), new Header("age", ""), new Header("allow", ""), new Header(Common.AUTHORIZATION, ""), new Header(Common.CACHE_CONTROL, ""), new Header("content-disposition", ""), new Header(Common.CONTENT_ENCODING, ""), new Header("content-language", ""), new Header(Common.CONTENT_LENGTH, ""), new Header("content-location", ""), new Header(Common.CONTENT_RANGE, ""), new Header("content-type", ""), new Header(AbstractJSONTokenResponse.COOKIE, ""), new Header("date", ""), new Header(FileDownloadModel.ETAG, ""), new Header("expect", ""), new Header("expires", ""), new Header("from", ""), new Header("host", ""), new Header("if-match", ""), new Header("if-modified-since", ""), new Header("if-none-match", ""), new Header("if-range", ""), new Header("if-unmodified-since", ""), new Header(Common.LAST_MODIFIED, ""), new Header("link", ""), new Header("location", ""), new Header("max-forwards", ""), new Header("proxy-authenticate", ""), new Header("proxy-authorization", ""), new Header("range", ""), new Header("referer", ""), new Header("refresh", ""), new Header("retry-after", ""), new Header("server", ""), new Header("set-cookie", ""), new Header("strict-transport-security", ""), new Header("transfer-encoding", ""), new Header(Common.USER_AGENT, ""), new Header("vary", ""), new Header("via", ""), new Header("www-authenticate", "")};
        f = b();
    }

    private a() {
    }

    public static ByteString a(ByteString byteString) throws IOException {
        int size = byteString.size();
        for (int i = 0; i < size; i++) {
            byte b2 = byteString.getByte(i);
            if (b2 >= 65 && b2 <= 90) {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: " + byteString.utf8());
            }
        }
        return byteString;
    }

    private static Map<ByteString, Integer> b() {
        LinkedHashMap linkedHashMap = new LinkedHashMap(e.length);
        int i = 0;
        while (true) {
            Header[] headerArr = e;
            if (i >= headerArr.length) {
                return Collections.unmodifiableMap(linkedHashMap);
            }
            if (!linkedHashMap.containsKey(headerArr[i].name)) {
                linkedHashMap.put(headerArr[i].name, Integer.valueOf(i));
            }
            i++;
        }
    }
}

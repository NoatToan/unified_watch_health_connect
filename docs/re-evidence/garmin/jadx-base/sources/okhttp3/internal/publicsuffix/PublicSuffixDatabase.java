package okhttp3.internal.publicsuffix;

import c53.c0;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.IDN;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import jg.b;
import okhttp3.internal.Util;
import okhttp3.internal.platform.Platform;
import org.slf4j.Marker;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.r0;
import p005kotlin.jvm.internal.s;
import p13.h0;
import p13.j0;
import p13.w;
import vb.h;
import w5.r;
import w63.b0;
import w63.q;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0005¢\u0006\u0002\u0010\u0002J\u001c\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002J\u0010\u0010\u000e\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000f\u001a\u00020\fJ\b\u0010\u0010\u001a\u00020\u0011H\u0002J\b\u0010\u0012\u001a\u00020\u0011H\u0002J\u0016\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0006J\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u000f\u001a\u00020\fH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;", "", "()V", "listRead", "Ljava/util/concurrent/atomic/AtomicBoolean;", "publicSuffixExceptionListBytes", "", "publicSuffixListBytes", "readCompleteLatch", "Ljava/util/concurrent/CountDownLatch;", "findMatchingRule", "", "", "domainLabels", "getEffectiveTldPlusOne", "domain", "readTheList", "", "readTheListUninterruptibly", "setListBytes", "splitDomain", "Companion", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class PublicSuffixDatabase {
    private static final char EXCEPTION_MARKER = '!';
    public static final String PUBLIC_SUFFIX_RESOURCE = "publicsuffixes.gz";
    private byte[] publicSuffixExceptionListBytes;
    private byte[] publicSuffixListBytes;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final byte[] WILDCARD_LABEL = {42};
    private static final List<String> PREVAILING_RULE = w.c(Marker.ANY_MARKER);
    private static final PublicSuffixDatabase instance = new PublicSuffixDatabase();
    private final AtomicBoolean listRead = new AtomicBoolean(false);
    private final CountDownLatch readCompleteLatch = new CountDownLatch(1);

    private final List<String> findMatchingRule(List<String> domainLabels) {
        String strBinarySearch;
        String strBinarySearch2;
        if (this.listRead.get() || !this.listRead.compareAndSet(false, true)) {
            try {
                this.readCompleteLatch.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        } else {
            readTheListUninterruptibly();
        }
        String str = null;
        if (this.publicSuffixListBytes == null) {
            h.z("Unable to load publicsuffixes.gz resource from the classpath.");
            return null;
        }
        int size = domainLabels.size();
        byte[][] bArr = new byte[size][];
        for (int i14 = 0; i14 < size; i14++) {
            String str2 = domainLabels.get(i14);
            Charset charset = StandardCharsets.UTF_8;
            charset.getClass();
            byte[] bytes = str2.getBytes(charset);
            bytes.getClass();
            bArr[i14] = bytes;
        }
        int i15 = 0;
        while (true) {
            if (i15 >= size) {
                strBinarySearch = null;
                break;
            }
            Companion companion = INSTANCE;
            byte[] bArr2 = this.publicSuffixListBytes;
            if (bArr2 == null) {
                s.m("publicSuffixListBytes");
                throw null;
            }
            strBinarySearch = companion.binarySearch(bArr2, bArr, i15);
            if (strBinarySearch != null) {
                break;
            }
            i15++;
        }
        if (size <= 1) {
            strBinarySearch2 = null;
            break;
        }
        byte[][] bArr3 = (byte[][]) bArr.clone();
        int length = bArr3.length - 1;
        int i16 = 0;
        while (true) {
            if (i16 >= length) {
                strBinarySearch2 = null;
                break;
            }
            bArr3[i16] = WILDCARD_LABEL;
            Companion companion2 = INSTANCE;
            byte[] bArr4 = this.publicSuffixListBytes;
            if (bArr4 == null) {
                s.m("publicSuffixListBytes");
                throw null;
            }
            strBinarySearch2 = companion2.binarySearch(bArr4, bArr3, i16);
            if (strBinarySearch2 != null) {
                break;
            }
            i16++;
        }
        if (strBinarySearch2 != null) {
            int i17 = size - 1;
            for (int i18 = 0; i18 < i17; i18++) {
                Companion companion3 = INSTANCE;
                byte[] bArr5 = this.publicSuffixExceptionListBytes;
                if (bArr5 == null) {
                    s.m("publicSuffixExceptionListBytes");
                    throw null;
                }
                String strBinarySearch3 = companion3.binarySearch(bArr5, bArr, i18);
                if (strBinarySearch3 != null) {
                    str = strBinarySearch3;
                    break;
                }
            }
        }
        if (str != null) {
            return d53.w.X("!".concat(str), new char[]{'.'});
        }
        if (strBinarySearch == null && strBinarySearch2 == null) {
            return PREVAILING_RULE;
        }
        List<String> listX = strBinarySearch != null ? d53.w.X(strBinarySearch, new char[]{'.'}) : j0.f134944a;
        List<String> listX2 = strBinarySearch2 != null ? d53.w.X(strBinarySearch2, new char[]{'.'}) : j0.f134944a;
        return listX.size() > listX2.size() ? listX : listX2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v4, types: [T, byte[]] */
    /* JADX WARN: Type inference failed for: r3v7, types: [T, byte[]] */
    private final void readTheList() {
        try {
            r0 r0Var = new r0();
            r0 r0Var2 = new r0();
            InputStream resourceAsStream = PublicSuffixDatabase.class.getResourceAsStream(PUBLIC_SUFFIX_RESOURCE);
            if (resourceAsStream != null) {
                b0 b0Var = new b0(new q(r.y(resourceAsStream)));
                try {
                    long j8 = b0Var.readInt();
                    b0Var.E3(j8);
                    r0Var.f105810a = b0Var.f183329b.s(j8);
                    long j14 = b0Var.readInt();
                    b0Var.E3(j14);
                    r0Var2.f105810a = b0Var.f183329b.s(j14);
                    Unit unit = Unit.INSTANCE;
                    b0Var.close();
                    synchronized (this) {
                        T t7 = r0Var.f105810a;
                        t7.getClass();
                        this.publicSuffixListBytes = (byte[]) t7;
                        T t14 = r0Var2.f105810a;
                        t14.getClass();
                        this.publicSuffixExceptionListBytes = (byte[]) t14;
                    }
                } catch (Throwable th3) {
                    try {
                        throw th3;
                    } catch (Throwable th4) {
                        b.l(b0Var, th3);
                        throw th4;
                    }
                }
            }
            this.readCompleteLatch.countDown();
        } catch (Throwable th5) {
            this.readCompleteLatch.countDown();
            throw th5;
        }
    }

    private final void readTheListUninterruptibly() {
        boolean z14 = false;
        while (true) {
            try {
                try {
                    readTheList();
                    break;
                } catch (InterruptedIOException unused) {
                    Thread.interrupted();
                    z14 = true;
                } catch (IOException e4) {
                    Platform.INSTANCE.get().log("Failed to read public suffix list", 5, e4);
                    if (!z14) {
                        return;
                    }
                }
            } catch (Throwable th3) {
                if (z14) {
                    Thread.currentThread().interrupt();
                }
                throw th3;
            }
        }
        if (!z14) {
            return;
        }
        Thread.currentThread().interrupt();
    }

    private final List<String> splitDomain(String domain) {
        List<String> listX = d53.w.X(domain, new char[]{'.'});
        return s.g(h0.m0(listX), "") ? h0.V(1, listX) : listX;
    }

    public final String getEffectiveTldPlusOne(String domain) {
        int size;
        int size2;
        domain.getClass();
        String unicode = IDN.toUnicode(domain);
        unicode.getClass();
        List<String> listSplitDomain = splitDomain(unicode);
        List<String> listFindMatchingRule = findMatchingRule(listSplitDomain);
        if (listSplitDomain.size() == listFindMatchingRule.size() && listFindMatchingRule.get(0).charAt(0) != '!') {
            return null;
        }
        if (listFindMatchingRule.get(0).charAt(0) == '!') {
            size = listSplitDomain.size();
            size2 = listFindMatchingRule.size();
        } else {
            size = listSplitDomain.size();
            size2 = listFindMatchingRule.size() + 1;
        }
        return c0.m(c0.g(h0.M(splitDomain(domain)), size - size2), ".");
    }

    public final void setListBytes(byte[] publicSuffixListBytes, byte[] publicSuffixExceptionListBytes) {
        publicSuffixListBytes.getClass();
        publicSuffixExceptionListBytes.getClass();
        this.publicSuffixListBytes = publicSuffixListBytes;
        this.publicSuffixExceptionListBytes = publicSuffixExceptionListBytes;
        this.listRead.set(true);
        this.readCompleteLatch.countDown();
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\f\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\r\u001a\u00020\fJ)\u0010\u000e\u001a\u0004\u0018\u00010\u0007*\u00020\n2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002¢\u0006\u0002\u0010\u0013R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lokhttp3/internal/publicsuffix/PublicSuffixDatabase$Companion;", "", "()V", "EXCEPTION_MARKER", "", "PREVAILING_RULE", "", "", "PUBLIC_SUFFIX_RESOURCE", "WILDCARD_LABEL", "", "instance", "Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;", "get", "binarySearch", "labels", "", "labelIndex", "", "([B[[BI)Ljava/lang/String;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(j jVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String binarySearch(byte[] bArr, byte[][] bArr2, int i14) {
            int i15;
            int iAnd;
            boolean z14;
            int iAnd2;
            int length = bArr.length;
            int i16 = 0;
            while (i16 < length) {
                int i17 = (i16 + length) / 2;
                while (i17 > -1 && bArr[i17] != 10) {
                    i17--;
                }
                int i18 = i17 + 1;
                int i19 = 1;
                while (true) {
                    i15 = i18 + i19;
                    if (bArr[i15] == 10) {
                        break;
                    }
                    i19++;
                }
                int i24 = i15 - i18;
                int i25 = i14;
                boolean z15 = false;
                int i26 = 0;
                int i27 = 0;
                while (true) {
                    if (z15) {
                        iAnd = 46;
                        z14 = false;
                    } else {
                        boolean z16 = z15;
                        iAnd = Util.and(bArr2[i25][i26], 255);
                        z14 = z16;
                    }
                    iAnd2 = iAnd - Util.and(bArr[i18 + i27], 255);
                    if (iAnd2 != 0) {
                        break;
                    }
                    i27++;
                    i26++;
                    if (i27 == i24) {
                        break;
                    }
                    if (bArr2[i25].length != i26) {
                        z15 = z14;
                    } else {
                        if (i25 == bArr2.length - 1) {
                            break;
                        }
                        i25++;
                        z15 = true;
                        i26 = -1;
                    }
                }
                if (iAnd2 >= 0) {
                    if (iAnd2 <= 0) {
                        int i28 = i24 - i27;
                        int length2 = bArr2[i25].length - i26;
                        int length3 = bArr2.length;
                        for (int i29 = i25 + 1; i29 < length3; i29++) {
                            length2 += bArr2[i29].length;
                        }
                        if (length2 >= i28) {
                            if (length2 <= i28) {
                                Charset charset = StandardCharsets.UTF_8;
                                charset.getClass();
                                return new String(bArr, i18, i24, charset);
                            }
                        }
                    }
                    i16 = i15 + 1;
                }
                length = i17;
            }
            return null;
        }

        public final PublicSuffixDatabase get() {
            return PublicSuffixDatabase.instance;
        }

        private Companion() {
        }
    }
}

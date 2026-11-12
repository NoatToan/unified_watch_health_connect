package cr0;

import android.util.SparseArray;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcr0/d;", "Lcr0/c;", "<init>", "()V", "a", "instant-input_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f55327a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final SparseArray<String> f55328b;

    static {
        SparseArray<String> sparseArray = new SparseArray<>();
        sparseArray.put(950, "ms950");
        sparseArray.put(936, "CP936");
        sparseArray.put(874, "ms874");
        sparseArray.put(949, "ms949");
        sparseArray.put(932, "MS932");
        sparseArray.put(1258, "cp1258");
        sparseArray.put(1252, "cp1252");
        sparseArray.put(1256, "cp1256");
        sparseArray.put(1255, "cp1255");
        sparseArray.put(65001, "UTF8");
        sparseArray.put(65002, "UTF16LE");
        sparseArray.put(65003, "UTF32LE");
        f55328b = sparseArray;
    }

    @Override // cr0.c
    public final int a(String str) {
        try {
            f55327a.getClass();
            CharsetEncoder charsetEncoderNewEncoder = Charset.forName(f55328b.get(65001)).newEncoder();
            charsetEncoderNewEncoder.getClass();
            if (!charsetEncoderNewEncoder.canEncode(str)) {
                str.getClass();
                StringBuilder sb3 = new StringBuilder(str.length());
                int length = str.length();
                for (int i14 = 0; i14 < length; i14++) {
                    char cCharAt = str.charAt(i14);
                    if (charsetEncoderNewEncoder.canEncode(cCharAt)) {
                        sb3.append(cCharAt);
                    } else {
                        sb3.append('?');
                    }
                }
                str = sb3.toString();
            }
            return charsetEncoderNewEncoder.encode(CharBuffer.wrap(str)).remaining();
        } catch (Exception unused) {
            return -1;
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcr0/d$a;", "", "<init>", "()V", "", "INVALID_SIZE", "I", "UTF8", "Landroid/util/SparseArray;", "", "charsetNameMap", "Landroid/util/SparseArray;", "instant-input_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}

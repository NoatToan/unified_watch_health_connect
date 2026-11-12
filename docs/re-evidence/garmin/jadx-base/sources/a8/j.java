package a8;

import java.nio.ByteBuffer;
import org.apache.commons.lang3.StringUtils;

/* JADX INFO: loaded from: classes.dex */
public class j {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ThreadLocal<b8.a> f1920d = new ThreadLocal<>();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1921a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final androidx.emoji2.text.h f1922b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile int f1923c = 0;

    public j(androidx.emoji2.text.h hVar, int i14) {
        this.f1922b = hVar;
        this.f1921a = i14;
    }

    public final int a(int i14) {
        b8.a aVarB = b();
        int iA = aVarB.a(16);
        if (iA == 0) {
            return 0;
        }
        ByteBuffer byteBuffer = aVarB.f16373b;
        int i15 = iA + aVarB.f16372a;
        return byteBuffer.getInt((i14 * 4) + byteBuffer.getInt(i15) + i15 + 4);
    }

    public final b8.a b() {
        ThreadLocal<b8.a> threadLocal = f1920d;
        b8.a aVar = threadLocal.get();
        if (aVar == null) {
            aVar = new b8.a();
            threadLocal.set(aVar);
        }
        b8.b bVar = this.f1922b.f7079a;
        int iA = bVar.a(6);
        if (iA != 0) {
            int i14 = iA + bVar.f16372a;
            int i15 = (this.f1921a * 4) + bVar.f16373b.getInt(i14) + i14 + 4;
            int i16 = bVar.f16373b.getInt(i15) + i15;
            ByteBuffer byteBuffer = bVar.f16373b;
            aVar.f16373b = byteBuffer;
            if (byteBuffer != null) {
                aVar.f16372a = i16;
                int i17 = i16 - byteBuffer.getInt(i16);
                aVar.f16374c = i17;
                aVar.f16375d = aVar.f16373b.getShort(i17);
                return aVar;
            }
            aVar.f16372a = 0;
            aVar.f16374c = 0;
            aVar.f16375d = 0;
        }
        return aVar;
    }

    public final String toString() {
        int i14;
        StringBuilder sb3 = new StringBuilder();
        sb3.append(super.toString());
        sb3.append(", id:");
        b8.a aVarB = b();
        int iA = aVarB.a(4);
        sb3.append(Integer.toHexString(iA != 0 ? aVarB.f16373b.getInt(iA + aVarB.f16372a) : 0));
        sb3.append(", codepoints:");
        b8.a aVarB2 = b();
        int iA2 = aVarB2.a(16);
        if (iA2 != 0) {
            int i15 = iA2 + aVarB2.f16372a;
            i14 = aVarB2.f16373b.getInt(aVarB2.f16373b.getInt(i15) + i15);
        } else {
            i14 = 0;
        }
        for (int i16 = 0; i16 < i14; i16++) {
            sb3.append(Integer.toHexString(a(i16)));
            sb3.append(StringUtils.SPACE);
        }
        return sb3.toString();
    }
}

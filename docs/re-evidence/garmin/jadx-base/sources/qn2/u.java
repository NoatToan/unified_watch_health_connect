package qn2;

import android.os.Build;
import android.util.Base64;
import ch.qos.logback.core.net.ssl.SSL;
import java.nio.ByteBuffer;
import java.security.SecureRandom;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lqn2/u;", "", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u f145900a = new u();

    private u() {
    }

    public final synchronized k a(String str, String str2, String str3) {
        y yVar;
        o oVar;
        String strA;
        str.getClass();
        str2.getClass();
        str3.getClass();
        pn2.a.f138690a.getClass();
        yVar = new y(pn2.a.a().f138709b);
        pn2.c cVar = pn2.c.f138766a;
        String str4 = Build.MODEL;
        str4.getClass();
        cVar.getClass();
        String strA2 = pn2.c.a(str4);
        String str5 = Build.VERSION.RELEASE;
        str5.getClass();
        oVar = new o(strA2, "Android", pn2.c.a(str5));
        ((hn2.a) KoinJavaComponent.get$default(hn2.a.class, null, null, 6, null)).getClass();
        strA = pn2.c.a("com.garmin.android.apps.connectmobile");
        ((hn2.a) KoinJavaComponent.get$default(hn2.a.class, null, null, 6, null)).getClass();
        return new k(yVar, oVar, new z(strA, pn2.c.a("5.30.1")), new m(pn2.a.a().f138710c, "Garmin", str2, "JPN", str, pn2.c.a(str3), "3"));
    }

    public final synchronized String b() {
        String strEncodeToString;
        String strEncodeToString2;
        pn2.c.f138766a.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        byteBufferAllocate.putLong(jCurrentTimeMillis);
        byte[] bArrArray = byteBufferAllocate.array();
        bArrArray.getClass();
        strEncodeToString = Base64.encodeToString(bArrArray, 11);
        strEncodeToString.getClass();
        byte[] bArr = new byte[16];
        SecureRandom.getInstance(SSL.DEFAULT_SECURE_RANDOM_ALGORITHM).nextBytes(bArr);
        strEncodeToString2 = Base64.encodeToString(bArr, 11);
        strEncodeToString2.getClass();
        return "OP" + strEncodeToString + "SS" + strEncodeToString2;
    }

    public final synchronized String c() {
        String strEncodeToString;
        String strEncodeToString2;
        pn2.c.f138766a.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        byteBufferAllocate.putLong(jCurrentTimeMillis);
        byte[] bArrArray = byteBufferAllocate.array();
        bArrArray.getClass();
        strEncodeToString = Base64.encodeToString(bArrArray, 11);
        strEncodeToString.getClass();
        byte[] bArr = new byte[16];
        SecureRandom.getInstance(SSL.DEFAULT_SECURE_RANDOM_ALGORITHM).nextBytes(bArr);
        strEncodeToString2 = Base64.encodeToString(bArr, 11);
        strEncodeToString2.getClass();
        return "RQ" + strEncodeToString + "SS" + strEncodeToString2;
    }
}

package defpackage;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.smarthome.homeroom.model.Home;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.SecretKeySpec;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J \u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0006\u001a\u00020\bH\u0016J\u0018\u0010\u0006\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0002J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\u000e\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0004H\u0002J\u0018\u0010\u0006\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0004H\u0002¨\u0006\u0013"}, d2 = {"Li9;", "Lh9;", "", "sessionId", "", "data", PluginDeviceInfo.FMODEL, "dataSize", "", "", "crc32Value", "", "src", "key", PluginDeviceInfo.FDESC, "", Home.JSON_KEY_ADDRESS, "<init>", "(Ljava/lang/String;)V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final class i9 implements h9 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f20892b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f20893a;

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Li9$a;", "", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public i9(@NotNull String address) {
        Intrinsics.checkNotNullParameter(address, "address");
        this.f20893a = address;
    }

    @Override // defpackage.h9
    @NotNull
    public byte[] a(int sessionId, @NotNull byte[] data) throws Exception {
        Intrinsics.checkNotNullParameter(data, "data");
        EncryptKeyStore encryptKeyStoreA = sj.f33689a.a(this.f20893a);
        if (encryptKeyStoreA == null) {
            throw new Exception("No encrypt key when encrypt data");
        }
        long r0 = encryptKeyStoreA.getR0();
        byte[] bArrR = tet.r(r0, 4);
        Intrinsics.checkNotNullExpressionValue(bArrR, "numberToBytes(nOnce, 4)");
        long jA = f3.a(ArraysKt___ArraysJvmKt.plus(data, bArrR), 0, 2, null);
        byte[] bArrA = a(sessionId);
        byte[] bArrR2 = tet.r(r0, 4);
        Intrinsics.checkNotNullExpressionValue(bArrR2, "numberToBytes(nOnce, 4)");
        byte[] bArrPlus = ArraysKt___ArraysJvmKt.plus(data, bArrR2);
        byte[] bArrR3 = tet.r(jA, 4);
        Intrinsics.checkNotNullExpressionValue(bArrR3, "numberToBytes(crc32, 4)");
        byte[] bArrPlus2 = ArraysKt___ArraysJvmKt.plus(bArrPlus, bArrR3);
        return b(ArraysKt___ArraysJvmKt.plus(bArrPlus2, new byte[(16 - (bArrPlus2.length % 16)) % 16]), bArrA);
    }

    public final byte[] b(byte[] src, byte[] key) throws BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException {
        SecretKeySpec secretKeySpec = new SecretKeySpec(key, "AES");
        Cipher cipher = Cipher.getInstance("AES/ECB/NoPadding");
        cipher.init(1, secretKeySpec);
        byte[] bArrDoFinal = cipher.doFinal(src);
        Intrinsics.checkNotNullExpressionValue(bArrDoFinal, "cipher.doFinal(src)");
        return bArrDoFinal;
    }

    @Override // defpackage.h9
    @NotNull
    public byte[] a(int sessionId, int dataSize, @NotNull byte[] data) throws Exception {
        Intrinsics.checkNotNullParameter(data, "data");
        w2 w2Var = new w2(a(data, a(sessionId)), 0, 2, null);
        byte[] bArrA = w2Var.a(dataSize);
        long jD = w2Var.d(4);
        long jD2 = w2Var.d(4);
        byte[] bArrR = tet.r(jD, 4);
        Intrinsics.checkNotNullExpressionValue(bArrR, "numberToBytes(nonce, 4)");
        if (a(ArraysKt___ArraysJvmKt.plus(bArrA, bArrR), jD2)) {
            if (bArrA.length != 0) {
                EncryptKeyStore encryptKeyStoreA = sj.f33689a.a(this.f20893a);
                if (encryptKeyStoreA != null) {
                    if (encryptKeyStoreA.a(jD)) {
                        return bArrA;
                    }
                    throw new Exception("NOnce not valid,may be replay attacks");
                }
                throw new Exception("No encrypt key when decrypt data");
            }
            throw new Exception("Wrong play load");
        }
        throw new Exception("CRC not match");
    }

    @Override // defpackage.h9
    public void a() {
        EncryptKeyStore encryptKeyStoreA = sj.f33689a.a(this.f20893a);
        if (encryptKeyStoreA == null) {
            return;
        }
        encryptKeyStoreA.c();
    }

    public final boolean a(byte[] data, long crc32Value) {
        return f3.a(data, data.length) == crc32Value;
    }

    public final byte[] a(int sessionId) throws Exception {
        EncryptKeyStore encryptKeyStoreA = sj.f33689a.a(this.f20893a);
        if (encryptKeyStoreA != null) {
            byte[] key = encryptKeyStoreA.getKey();
            ArrayList arrayList = new ArrayList(key.length);
            for (byte b2 : key) {
                arrayList.add(Byte.valueOf((byte) (b2 ^ ((byte) sessionId))));
            }
            return CollectionsKt___CollectionsKt.toByteArray(arrayList);
        }
        throw new Exception("No encrypt key when generate key");
    }

    public final byte[] a(byte[] src, byte[] key) throws BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException {
        SecretKeySpec secretKeySpec = new SecretKeySpec(key, "AES");
        Cipher cipher = Cipher.getInstance("AES/ECB/NoPadding");
        cipher.init(2, secretKeySpec);
        byte[] bArrDoFinal = cipher.doFinal(src);
        Intrinsics.checkNotNullExpressionValue(bArrDoFinal, "cipher.doFinal(src)");
        return bArrDoFinal;
    }
}

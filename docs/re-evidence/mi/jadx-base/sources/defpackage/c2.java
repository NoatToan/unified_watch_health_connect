package defpackage;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.List;
import java.util.zip.GZIPOutputStream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001:\u0001\u000bB\u0019\b\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002¨\u0006\f"}, d2 = {"Lc2;", "", "", "data", "", PluginDeviceInfo.FMODEL, "unGzip", "mEncryptKey16", "mEncryptIv16", "<init>", "([B[B)V", PluginDeviceInfo.FDESC, "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final class c2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final b f4844b = new b(null);

    @NotNull
    public static final Lazy<c2> c = LazyKt__LazyJVMKt.lazy(a.t);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public Cipher f4845a;

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lc2;", PluginDeviceInfo.FMODEL, "()Lc2;"}, k = 3, mv = {1, 7, 1})
    public static final class a extends Lambda implements Function0<c2> {
        public static final a t = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final c2 invoke() {
            Charset charset = Charsets.UTF_8;
            byte[] bytes = "sCVR2miVJwi9QPdD".getBytes(charset);
            Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
            byte[] bytes2 = "pSWPKvl2ND74ZwJI".getBytes(charset);
            Intrinsics.checkNotNullExpressionValue(bytes2, "this as java.lang.String).getBytes(charset)");
            return new c2(bytes, bytes2, null);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rR\u001b\u0010\u0007\u001a\u00020\u00028FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\n¨\u0006\u000e"}, d2 = {"Lc2$b;", "", "Lc2;", "instance$delegate", "Lkotlin/Lazy;", PluginDeviceInfo.FMODEL, "()Lc2;", "instance", "", "ALGORITHM", "Ljava/lang/String;", "ALGORITHM_TYPE", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class b {
        public b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final c2 a() {
            return (c2) c2.c.getValue();
        }
    }

    public /* synthetic */ c2(byte[] bArr, byte[] bArr2, DefaultConstructorMarker defaultConstructorMarker) {
        this(bArr, bArr2);
    }

    public c2(byte[] bArr, byte[] bArr2) {
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        try {
            Cipher cipher = Cipher.getInstance("AES/CBC/NoPadding");
            this.f4845a = cipher;
            if (cipher != null) {
                cipher.init(1, secretKeySpec, new IvParameterSpec(bArr2));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @NotNull
    public final byte[] a(@NotNull String data) {
        Intrinsics.checkNotNullParameter(data, "data");
        Cipher cipher = this.f4845a;
        if (cipher == null) {
            return new byte[0];
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byteArrayOutputStream.write(1);
            byte[] bytes = data.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
            List mutableList = ArraysKt___ArraysKt.toMutableList(ArraysKt___ArraysJvmKt.toTypedArray(a(bytes)));
            while (mutableList.size() % 16 != 0) {
                mutableList.add((byte) 0);
            }
            byte[] bArrDoFinal = cipher.doFinal(CollectionsKt___CollectionsKt.toByteArray(mutableList));
            byte[] lengthArr = tet.p(bArrDoFinal.length);
            Intrinsics.checkNotNullExpressionValue(lengthArr, "lengthArr");
            ArraysKt___ArraysKt.reverse(lengthArr);
            byteArrayOutputStream.write(lengthArr);
            byteArrayOutputStream.write(bArrDoFinal);
            byteArrayOutputStream.write(0);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            Intrinsics.checkNotNullExpressionValue(byteArray, "result.toByteArray()");
            CloseableKt.closeFinally(byteArrayOutputStream, null);
            return byteArray;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                CloseableKt.closeFinally(byteArrayOutputStream, th);
                throw th2;
            }
        }
    }

    public final byte[] a(byte[] unGzip) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
        gZIPOutputStream.write(unGzip);
        gZIPOutputStream.close();
        byte[] encode = byteArrayOutputStream.toByteArray();
        byteArrayOutputStream.flush();
        byteArrayOutputStream.close();
        Intrinsics.checkNotNullExpressionValue(encode, "encode");
        return encode;
    }
}

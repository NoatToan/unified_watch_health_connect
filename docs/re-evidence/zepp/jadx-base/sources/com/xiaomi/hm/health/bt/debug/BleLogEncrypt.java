package com.xiaomi.hm.health.bt.debug;

import com.google.firebase.crashlytics.internal.settings.network.DefaultSettingsSpiCall;
import com.xiaomi.hm.health.bt.gatt.GattUtils;
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
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0019\b\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u000e\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005R\u0018\u0010\n\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010\t¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/hm/health/bt/debug/BleLogEncrypt;", "", "", "unGzip", "a", "", "data", "encrypt", "Ljavax/crypto/Cipher;", "Ljavax/crypto/Cipher;", "mEncryptCipher", "mEncryptKey16", "mEncryptIv16", "<init>", "([B[B)V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class BleLogEncrypt {

    @NotNull
    private static final String b = "AES";

    @NotNull
    private static final String c = "AES/CBC/NoPadding";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private Cipher mEncryptCipher;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Lazy<BleLogEncrypt> d = LazyKt__LazyJVMKt.lazy(a.a);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rR\u001d\u0010\u0007\u001a\u00020\u00028F@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0016\u0010\u000b\u001a\u00020\b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/hm/health/bt/debug/BleLogEncrypt$Companion;", "", "Lcom/xiaomi/hm/health/bt/debug/BleLogEncrypt;", "instance$delegate", "Lkotlin/Lazy;", "getInstance", "()Lcom/xiaomi/hm/health/bt/debug/BleLogEncrypt;", DefaultSettingsSpiCall.n, "", "ALGORITHM", "Ljava/lang/String;", "ALGORITHM_TYPE", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        public static final /* synthetic */ KProperty<Object>[] a = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(Companion.class), DefaultSettingsSpiCall.n, "getInstance()Lcom/xiaomi/hm/health/bt/debug/BleLogEncrypt;"))};

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final BleLogEncrypt getInstance() {
            return (BleLogEncrypt) BleLogEncrypt.d.getValue();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/bt/debug/BleLogEncrypt;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<BleLogEncrypt> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final BleLogEncrypt invoke() {
            Charset charset = Charsets.UTF_8;
            return new BleLogEncrypt("sCVR2miVJwi9QPdD".getBytes(charset), "pSWPKvl2ND74ZwJI".getBytes(charset), null);
        }
    }

    private BleLogEncrypt(byte[] bArr, byte[] bArr2) {
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        try {
            Cipher cipher = Cipher.getInstance(c);
            this.mEncryptCipher = cipher;
            if (cipher == null) {
                return;
            }
            cipher.init(1, secretKeySpec, new IvParameterSpec(bArr2));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public /* synthetic */ BleLogEncrypt(byte[] bArr, byte[] bArr2, DefaultConstructorMarker defaultConstructorMarker) {
        this(bArr, bArr2);
    }

    private final byte[] a(byte[] unGzip) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
        gZIPOutputStream.write(unGzip);
        gZIPOutputStream.close();
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        byteArrayOutputStream.flush();
        byteArrayOutputStream.close();
        return byteArray;
    }

    @NotNull
    public final byte[] encrypt(@NotNull String data) {
        Cipher cipher = this.mEncryptCipher;
        if (cipher == null) {
            return new byte[0];
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byteArrayOutputStream.write(1);
            List mutableList = ArraysKt___ArraysKt.toMutableList(ArraysKt___ArraysJvmKt.toTypedArray(a(data.getBytes(Charsets.UTF_8))));
            while (mutableList.size() % 16 != 0) {
                mutableList.add((byte) 0);
            }
            byte[] bArrDoFinal = cipher.doFinal(CollectionsKt___CollectionsKt.toByteArray(mutableList));
            byte[] bArrIntToBytes = GattUtils.intToBytes(bArrDoFinal.length);
            ArraysKt___ArraysKt.reverse(bArrIntToBytes);
            byteArrayOutputStream.write(bArrIntToBytes);
            byteArrayOutputStream.write(bArrDoFinal);
            byteArrayOutputStream.write(0);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
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
}

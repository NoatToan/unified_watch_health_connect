package com.xiaomi.fitness.common.utils;

import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.devicesettings.bluttooth.todo.miui.MiuiCursorConstants;
import com.xiaomi.fitness.statistics.StatConstants;
import com.xiaomi.smarthome.library.crypto.rc4coder.Coder;
import java.io.File;
import java.io.FileInputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0007J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0006\u001a\u00020\u0005H\u0007J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\bH\u0007J\u0014\u0010\t\u001a\u0004\u0018\u00010\u00052\b\u0010\n\u001a\u0004\u0018\u00010\bH\u0002J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u00052\u0006\u0010\f\u001a\u00020\rH\u0007J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000e\u001a\u00020\u0005H\u0007J\u0012\u0010\u000f\u001a\u0004\u0018\u00010\b2\u0006\u0010\f\u001a\u00020\rH\u0007J\u0018\u0010\u000f\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\r¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/fitness/common/utils/MD5Util;", "", "<init>", "()V", Coder.KEY_MD5, "", MiuiCursorConstants.CONTENT, "MD5ForBytes", "", "bytesToHexString", "bytes", "getFileMD5", "file", "Ljava/io/File;", "path", "getFileMD5Bytes", StatConstants.PARAM_START, "", "common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nMD5Util.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MD5Util.kt\ncom/xiaomi/fitness/common/utils/MD5Util\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,116:1\n1#2:117\n*E\n"})
public final class MD5Util {

    @NotNull
    public static final MD5Util INSTANCE = new MD5Util();

    private MD5Util() {
    }

    @JvmStatic
    @NotNull
    public static final String MD5(@NotNull String content) {
        Intrinsics.checkNotNullParameter(content, "content");
        byte[] bytes = content.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        return MD5(bytes);
    }

    @JvmStatic
    @Nullable
    public static final byte[] MD5ForBytes(@NotNull String content) {
        Intrinsics.checkNotNullParameter(content, "content");
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(Coder.KEY_MD5);
            byte[] bytes = content.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
            messageDigest.update(bytes);
            return messageDigest.digest();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        }
    }

    private final String bytesToHexString(byte[] bytes) {
        StringBuilder sb = new StringBuilder();
        if (bytes == null || bytes.length == 0) {
            return null;
        }
        for (byte b2 : bytes) {
            String hexString = Integer.toHexString(b2 & 255);
            if (hexString.length() < 2) {
                sb.append(0);
            }
            sb.append(hexString);
        }
        return sb.toString();
    }

    @JvmStatic
    @Nullable
    public static final String getFileMD5(@NotNull File file) {
        Intrinsics.checkNotNullParameter(file, "file");
        return INSTANCE.bytesToHexString(getFileMD5Bytes(file));
    }

    @JvmStatic
    @Nullable
    public static final byte[] getFileMD5Bytes(@NotNull File file) {
        Intrinsics.checkNotNullParameter(file, "file");
        if (!file.isFile()) {
            return null;
        }
        byte[] bArr = new byte[1024];
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(Coder.KEY_MD5);
            FileInputStream fileInputStream = new FileInputStream(file);
            while (true) {
                int i = fileInputStream.read(bArr, 0, 1024);
                if (i == -1) {
                    fileInputStream.close();
                    return messageDigest.digest();
                }
                messageDigest.update(bArr, 0, i);
            }
        } catch (Exception e) {
            Logger.e("getFileMD5Bytes", e);
            e.printStackTrace();
            return null;
        }
    }

    @JvmStatic
    @NotNull
    public static final String MD5(@Nullable byte[] content) {
        String strBytesToHexString;
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(Coder.KEY_MD5);
            messageDigest.update(content);
            strBytesToHexString = INSTANCE.bytesToHexString(messageDigest.digest());
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            strBytesToHexString = null;
        }
        return strBytesToHexString == null ? "" : strBytesToHexString;
    }

    @JvmStatic
    @Nullable
    public static final String getFileMD5(@NotNull String path) {
        Intrinsics.checkNotNullParameter(path, "path");
        return INSTANCE.bytesToHexString(getFileMD5Bytes(new File(path)));
    }

    @Nullable
    public final byte[] getFileMD5Bytes(int start, @NotNull File file) {
        Intrinsics.checkNotNullParameter(file, "file");
        if (!file.isFile()) {
            return null;
        }
        byte[] bArr = new byte[1024];
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(Coder.KEY_MD5);
            FileInputStream fileInputStream = new FileInputStream(file);
            while (true) {
                int i = fileInputStream.read(bArr, 0, 1024);
                if (i != -1) {
                    messageDigest.update(bArr, 0, i);
                } else {
                    fileInputStream.close();
                    return messageDigest.digest();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}

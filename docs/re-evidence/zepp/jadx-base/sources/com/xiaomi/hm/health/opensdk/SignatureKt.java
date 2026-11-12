package com.xiaomi.hm.health.opensdk;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import com.xiaomi.hm.health.baseutil.String2XUtil;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import kotlin.Metadata;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u0006\u001a#\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001c\u0010\b\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0001H\u0002\u001a\u001c\u0010\u000b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0007\u001a\u00020\u0001H\u0002\u001a\u0012\u0010\f\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001\u001a\u0012\u0010\r\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001\u001a\u0012\u0010\u000e\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¨\u0006\u000f"}, d2 = {"Landroid/content/Context;", "", "packageName", "", "Landroid/content/pm/Signature;", "getAppSignature", "(Landroid/content/Context;Ljava/lang/String;)[Landroid/content/pm/Signature;", "algorithm", "a", "", "data", "b", "getAppSignatureSHA1", "getAppSignatureSHA256", "getAppSignatureMD5", "app_midongPlayRelease"}, k = 2, mv = {1, 5, 1})
public final class SignatureKt {
    private static final String a(Context context, String str, String str2) {
        Signature[] appSignature = getAppSignature(context, str);
        if (appSignature == null) {
            return "";
        }
        if (appSignature.length == 0) {
            return "";
        }
        return new Regex("(?<=[0-9A-F]{2})[0-9A-F]{2}").replace(String2XUtil.bytes2HexString(b(appSignature[0].toByteArray(), str2)), ":$0");
    }

    private static final byte[] b(byte[] bArr, String str) {
        if (bArr == null) {
            return null;
        }
        if (bArr.length == 0) {
            return null;
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(str);
            messageDigest.update(bArr);
            return messageDigest.digest();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        }
    }

    @SuppressLint({"PackageManagerGetSignatures"})
    @Nullable
    public static final Signature[] getAppSignature(@NotNull Context context, @NotNull String str) {
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(str, 64);
            if (packageInfo == null) {
                return null;
            }
            return packageInfo.signatures;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }

    @NotNull
    public static final String getAppSignatureMD5(@NotNull Context context, @NotNull String str) {
        return a(context, str, "MD5");
    }

    @NotNull
    public static final String getAppSignatureSHA1(@NotNull Context context, @NotNull String str) {
        return a(context, str, "SHA1");
    }

    @NotNull
    public static final String getAppSignatureSHA256(@NotNull Context context, @NotNull String str) {
        return a(context, str, "SHA256");
    }
}

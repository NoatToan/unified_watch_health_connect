package com.xiaomi.fitness.common.utils;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.os.Build;
import androidx.annotation.RequiresApi;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.onetrack.OneTrack;
import com.xiaomi.onetrack.api.c;
import com.xiaomi.smarthome.framework.api.UserConfig;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0005\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000bJ\u0018\u0010\f\u001a\u0004\u0018\u00010\u00052\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0005J\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0011\u001a\u00020\u0005J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u001a\u0010\u0014\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u001a\u0010\u0018\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0017H\u0003J#\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000b0\u001a2\u000e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u0007H\u0002¢\u0006\u0002\u0010\u001dJ\u001a\u0010\u001e\u001a\u0004\u0018\u00010\u00052\u000e\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u001aH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\b¨\u0006 "}, d2 = {"Lcom/xiaomi/fitness/common/utils/SignatureUtils;", "", "<init>", "()V", "TAG", "", "HEX", "", "[Ljava/lang/String;", "toHexString", "bytes", "", "getSignature", "context", "Landroid/content/Context;", "packageName", "getSha1SignatureByFile", "filePath", "bt", "", "getSignatureDefault", OneTrack.Param.PKG, "pm", "Landroid/content/pm/PackageManager;", "getSignatureAndroidP", "toByteArrayList", "", "signatures", "Landroid/content/pm/Signature;", "([Landroid/content/pm/Signature;)Ljava/util/List;", "getSHA1StringSignatures", "buff", "common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SignatureUtils {

    @NotNull
    public static final String TAG = "SignatureValidator";

    @NotNull
    public static final SignatureUtils INSTANCE = new SignatureUtils();

    @NotNull
    private static final String[] HEX = {"0", "1", "2", "3", "4", UserConfig.KEY_DEVICE_LITE_SORT_GROUP, "6", UserConfig.KEY_HOME_SCENE_FRAGMENT_TOP, UserConfig.KEY_MI_BRAIN_SETTING, UserConfig.KEY_LITE_SCENE_ORDER, "A", c.f13755a, "C", "D", "E", "F"};

    private SignatureUtils() {
    }

    private final String getSHA1StringSignatures(List<byte[]> buff) {
        List<byte[]> list = buff;
        if (list != null && !list.isEmpty()) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
                Iterator<byte[]> it = buff.iterator();
                while (it.hasNext()) {
                    messageDigest.update(it.next());
                }
                byte[] bArrDigest = messageDigest.digest();
                Intrinsics.checkNotNullExpressionValue(bArrDigest, "digest(...)");
                return toHexString(bArrDigest);
            } catch (NoSuchAlgorithmException e) {
                Logger.e(TAG, "getSHA1StringSignatures error " + e);
            }
        }
        return null;
    }

    @RequiresApi(api = 28)
    private final String getSignatureAndroidP(String pkg, PackageManager pm) throws PackageManager.NameNotFoundException {
        Signature[] signingCertificateHistory;
        SigningInfo signingInfo = pm.getPackageInfo(pkg, 134217728).signingInfo;
        if (signingInfo == null) {
            return null;
        }
        if (signingInfo.hasMultipleSigners()) {
            signingCertificateHistory = signingInfo.getApkContentsSigners();
            Intrinsics.checkNotNull(signingCertificateHistory);
        } else {
            signingCertificateHistory = signingInfo.getSigningCertificateHistory();
            Intrinsics.checkNotNull(signingCertificateHistory);
        }
        return getSHA1StringSignatures(toByteArrayList(signingCertificateHistory));
    }

    private final String getSignatureDefault(String pkg, PackageManager pm) throws PackageManager.NameNotFoundException {
        return getSHA1StringSignatures(toByteArrayList(pm.getPackageInfo(pkg, 64).signatures));
    }

    private final List<byte[]> toByteArrayList(Signature[] signatures) {
        if (signatures == null) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        LinkedList linkedList = new LinkedList();
        Iterator it = ArrayIteratorKt.iterator(signatures);
        while (it.hasNext()) {
            byte[] byteArray = ((Signature) it.next()).toByteArray();
            Intrinsics.checkNotNullExpressionValue(byteArray, "toByteArray(...)");
            linkedList.add(byteArray);
        }
        return linkedList;
    }

    @Nullable
    public final String getSha1SignatureByFile(@NotNull String filePath) {
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        try {
            PackageManager packageManager = ApplicationExtKt.getApplication().getPackageManager();
            PackageInfo packageArchiveInfo = Build.VERSION.SDK_INT >= 33 ? packageManager.getPackageArchiveInfo(filePath, PackageManager.PackageInfoFlags.of(64L)) : packageManager.getPackageArchiveInfo(filePath, 64);
            String str = packageArchiveInfo != null ? packageArchiveInfo.packageName : null;
            String sHA1StringSignatures = getSHA1StringSignatures(toByteArrayList(packageArchiveInfo != null ? packageArchiveInfo.signatures : null));
            Logger.i(TAG, "getSignatureByFile " + str + " result " + sHA1StringSignatures);
            return sHA1StringSignatures;
        } catch (Exception e) {
            e.printStackTrace();
            Logger.e(TAG, "getSignatureByFile " + filePath + " error " + Unit.INSTANCE);
            return null;
        }
    }

    @Nullable
    public final String getSignature(@NotNull Context context, @NotNull String packageName) {
        String signatureDefault;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Objects.requireNonNull(packageName);
        PackageManager packageManager = context.getPackageManager();
        try {
            if (Build.VERSION.SDK_INT >= 28) {
                Intrinsics.checkNotNull(packageName);
                Intrinsics.checkNotNull(packageManager);
                signatureDefault = getSignatureAndroidP(packageName, packageManager);
            } else {
                Intrinsics.checkNotNull(packageName);
                Intrinsics.checkNotNull(packageManager);
                signatureDefault = getSignatureDefault(packageName, packageManager);
            }
            return signatureDefault;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    @NotNull
    public final String toHexString(@NotNull byte[] bytes) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        Objects.requireNonNull(bytes);
        StringBuilder sb = new StringBuilder();
        for (byte b2 : bytes) {
            sb.append(toHexString(b2));
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    private final String toHexString(byte bt) {
        int i = bt;
        if (bt < 0) {
            i = bt + 256;
        }
        String[] strArr = HEX;
        return strArr[i / 16] + strArr[i % 16];
    }
}

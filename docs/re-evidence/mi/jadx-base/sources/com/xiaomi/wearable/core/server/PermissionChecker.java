package com.xiaomi.wearable.core.server;

import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.os.Build;
import com.miui.tsmclientsdk.MiTsmConstants;
import com.xiaomi.smarthome.library.crypto.rc4coder.Coder;
import com.xiaomi.wearable.CoreExtKt;
import com.xiaomi.wearable.utils.ByteUtil;
import java.security.MessageDigest;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0014B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0006J\u0018\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0006H\u0002J\u000e\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0006R \u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/xiaomi/wearable/core/server/PermissionChecker;", "", "<init>", "()V", "whiteListApps", "", "", "", "Lcom/xiaomi/wearable/core/server/PermissionChecker$AppCert;", "checkCallPermission", "", "checkCert", "packageName", "getSignatureInfo", MiTsmConstants.KEY_SIGNATURE, "Landroid/content/pm/Signature;", "key", "checkPermission", "permission", "TAG", "AppCert", "miwear-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nPermissionChecker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PermissionChecker.kt\ncom/xiaomi/wearable/core/server/PermissionChecker\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,92:1\n13402#2:93\n13402#2,2:94\n13403#2:96\n*S KotlinDebug\n*F\n+ 1 PermissionChecker.kt\ncom/xiaomi/wearable/core/server/PermissionChecker\n*L\n61#1:93\n64#1:94,2\n61#1:96\n*E\n"})
public final class PermissionChecker {

    @NotNull
    private static final String TAG = "PermissionChecker";

    @NotNull
    public static final PermissionChecker INSTANCE = new PermissionChecker();

    @NotNull
    private static final Map<String, AppCert[]> whiteListApps = MapsKt__MapsKt.mapOf(TuplesKt.to("com.mi.health", new AppCert[]{new AppCert("8D:DB:34:2F:2D:A5:40:84:02:D7:56:8A:F2:1E:29:F9", "27:19:6E:38:6B:87:5E:76:AD:F7:00:E7:EA:84:E4:C6:EE:E3:3D:FA", "C8:A2:E9:BC:CF:59:7C:2F:B6:DC:66:BE:E2:93:FC:13:F2:FC:47:EC:77:BC:6B:2B:0D:52:C1:1F:51:19:2A:B8"), new AppCert("70:14:78:A1:E3:B4:B7:E3:97:8E:A6:94:69:41:0F:13", "7B:6D:C7:07:9C:34:73:9C:E8:11:59:71:9F:B5:EB:61:D2:A0:32:25", "C9:00:9D:01:EB:F9:F5:D0:30:2B:C7:1B:2F:E9:AA:9A:47:A4:32:BB:A1:73:08:A3:11:1B:75:D7:B2:14:90:25")}), TuplesKt.to("com.xiaomi.wearable", new AppCert[]{new AppCert("D5:2E:03:3C:39:B6:F4:7A:02:48:B2:50:5A:2D:6A:91", "1D:A2:0E:2B:DF:A6:78:AE:88:8E:81:E5:CA:0E:C4:74:4E:BB:BB:BD", "C8:A2:E9:BC:CF:59:7C:2F:B6:DC:66:BE:E2:93:FC:13:F2:FC:47:EC:77:BC:6B:2B:0D:52:C1:1F:51:19:2A:B8")}));

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/wearable/core/server/PermissionChecker$AppCert;", "", Coder.KEY_MD5, "", "SHA1", "SHA256", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getMD5", "()Ljava/lang/String;", "getSHA1", "getSHA256", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "miwear-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class AppCert {

        @NotNull
        private final String MD5;

        @NotNull
        private final String SHA1;

        @NotNull
        private final String SHA256;

        public AppCert(@NotNull String MD5, @NotNull String SHA1, @NotNull String SHA256) {
            Intrinsics.checkNotNullParameter(MD5, "MD5");
            Intrinsics.checkNotNullParameter(SHA1, "SHA1");
            Intrinsics.checkNotNullParameter(SHA256, "SHA256");
            this.MD5 = MD5;
            this.SHA1 = SHA1;
            this.SHA256 = SHA256;
        }

        public static /* synthetic */ AppCert copy$default(AppCert appCert, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = appCert.MD5;
            }
            if ((i & 2) != 0) {
                str2 = appCert.SHA1;
            }
            if ((i & 4) != 0) {
                str3 = appCert.SHA256;
            }
            return appCert.copy(str, str2, str3);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getMD5() {
            return this.MD5;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getSHA1() {
            return this.SHA1;
        }

        @NotNull
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getSHA256() {
            return this.SHA256;
        }

        @NotNull
        public final AppCert copy(@NotNull String MD5, @NotNull String SHA1, @NotNull String SHA256) {
            Intrinsics.checkNotNullParameter(MD5, "MD5");
            Intrinsics.checkNotNullParameter(SHA1, "SHA1");
            Intrinsics.checkNotNullParameter(SHA256, "SHA256");
            return new AppCert(MD5, SHA1, SHA256);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AppCert)) {
                return false;
            }
            AppCert appCert = (AppCert) other;
            return Intrinsics.areEqual(this.MD5, appCert.MD5) && Intrinsics.areEqual(this.SHA1, appCert.SHA1) && Intrinsics.areEqual(this.SHA256, appCert.SHA256);
        }

        @NotNull
        public final String getMD5() {
            return this.MD5;
        }

        @NotNull
        public final String getSHA1() {
            return this.SHA1;
        }

        @NotNull
        public final String getSHA256() {
            return this.SHA256;
        }

        public int hashCode() {
            return (((this.MD5.hashCode() * 31) + this.SHA1.hashCode()) * 31) + this.SHA256.hashCode();
        }

        @NotNull
        public String toString() {
            return "AppCert(MD5=" + this.MD5 + ", SHA1=" + this.SHA1 + ", SHA256=" + this.SHA256 + ")";
        }
    }

    private PermissionChecker() {
    }

    private final String getSignatureInfo(Signature signature, String key) {
        try {
            return ByteUtil.byteToStringSplit(MessageDigest.getInstance(key).digest(signature.toByteArray()), ":");
        } catch (Exception unused) {
            return "";
        }
    }

    public final boolean checkCallPermission() {
        String callingPackage = CoreExtKt.getCallingPackage();
        return Intrinsics.areEqual(callingPackage, "com.mi.health") || Intrinsics.areEqual(callingPackage, "com.xiaomi.wearable");
    }

    public final boolean checkCert(@NotNull String packageName) {
        SigningInfo signingInfo;
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        if (Build.VERSION.SDK_INT < 28) {
            return false;
        }
        com.xiaomi.wearable.core.CoreExtKt.getLogger().i(TAG, "checkCert() called " + packageName);
        try {
            AppCert[] appCertArr = whiteListApps.get(packageName);
            if (appCertArr == null || (signingInfo = CoreExtKt.getContext().getPackageManager().getPackageInfo(packageName, 134217728).signingInfo) == null) {
                return false;
            }
            Signature[] signingCertificateHistory = signingInfo.getSigningCertificateHistory();
            Intrinsics.checkNotNullExpressionValue(signingCertificateHistory, "getSigningCertificateHistory(...)");
            for (Signature signature : signingCertificateHistory) {
                String signatureInfo = INSTANCE.getSignatureInfo(signature, Coder.KEY_MD5);
                com.xiaomi.wearable.core.CoreExtKt.getLogger().d(TAG, "checkCert() called " + signatureInfo);
                int length = appCertArr.length;
                for (int i = 0; i < length; i++) {
                    if (Intrinsics.areEqual(signatureInfo, appCertArr[i].getMD5())) {
                        return true;
                    }
                }
            }
            return false;
        } catch (Exception e) {
            com.xiaomi.wearable.core.CoreExtKt.getLogger().e(TAG, "checkCert: e: ", e);
            return false;
        }
    }

    public final boolean checkPermission(@NotNull String permission) {
        Intrinsics.checkNotNullParameter(permission, "permission");
        return CoreExtKt.getContext().checkSelfPermission(permission) == 0;
    }
}

package com.facebook.internal;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import com.facebook.share.internal.MessengerShareContentUtility;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.tools.analytics.DbUtils;
import java.util.HashSet;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.y;
import kotlin.jvm.JvmStatic;
import kotlin.text.m;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007R\u0016\u0010\n\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0016\u0010\f\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\tR\u0016\u0010\u000e\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\tR\u0016\u0010\u0010\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\tR\u0016\u0010\u0012\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\tR\u0016\u0010\u0014\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\tR\u0016\u0010\u0016\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\tR&\u0010\u001b\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0017j\b\u0012\u0004\u0012\u00020\u0004`\u00188\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001e"}, d2 = {"Lcom/facebook/internal/FacebookSignatureValidator;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "packageName", "", "validateSignature", "a", "Ljava/lang/String;", "FBI_HASH", "b", "FBL_HASH", "c", "FBR_HASH", GoogleApiAvailabilityLight.a, "FBR2_HASH", "e", "MSR_HASH", "f", "FBF_HASH", "g", "IGR_HASH", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "h", "Ljava/util/HashSet;", "validAppSignatureHashes", "<init>", "()V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
public final class FacebookSignatureValidator {

    @NotNull
    public static final FacebookSignatureValidator INSTANCE = new FacebookSignatureValidator();

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private static final String FBR_HASH = "8a3c4b262d721acd49a4bf97d5213199c86fa2b9";

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private static final String FBR2_HASH = "cc2751449a350f668590264ed76692694a80308a";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private static final String FBI_HASH = "a4b7452e2ed8f5f191058ca7bbfd26b0d3214bfc";

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static final String FBL_HASH = "df6b721c8b4d3b6eb44c861d4415007e5a35fc95";

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private static final String MSR_HASH = "9b8f518b086098de3d77736f9458a3d2f6f95a37";

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private static final String FBF_HASH = "2438bce1ddb7bd026d5ff89f598b3b5e5bb824b3";

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private static final String IGR_HASH = "c56fb7d591ba6704df047fd98f535372fea00211";

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private static final HashSet<String> validAppSignatureHashes = y.hashSetOf(FBR_HASH, FBR2_HASH, FBI_HASH, FBL_HASH, MSR_HASH, FBF_HASH, IGR_HASH);

    private FacebookSignatureValidator() {
    }

    @JvmStatic
    public static final boolean validateSignature(@NotNull Context context, @NotNull String packageName) {
        String str = Build.BRAND;
        int i = context.getApplicationInfo().flags;
        if (m.startsWith$default(str, MessengerShareContentUtility.TEMPLATE_GENERIC_TYPE, false, 2, null) && (i & 2) != 0) {
            return true;
        }
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 64);
            Signature[] signatureArr = packageInfo.signatures;
            if (signatureArr == null) {
                return false;
            }
            if (signatureArr.length == 0) {
                return false;
            }
            for (Signature signature : packageInfo.signatures) {
                if (!CollectionsKt___CollectionsKt.contains(validAppSignatureHashes, Utility.sha1hash(signature.toByteArray()))) {
                    return false;
                }
            }
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }
}

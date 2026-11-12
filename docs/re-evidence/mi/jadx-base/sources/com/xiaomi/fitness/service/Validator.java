package com.xiaomi.fitness.service;

import android.content.Context;
import android.os.Binder;
import com.miui.tsmclientsdk.MiTsmConstants;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.SignatureUtils;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\u000b\u001a\u00020\f2\u0012\u0010\r\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u000e\"\u00020\u0005¢\u0006\u0002\u0010\u000fJ\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/xiaomi/fitness/service/Validator;", "", "<init>", "()V", "TAG", "", "sInternalSignatures", "Ljava/util/ArrayList;", "mGrantedApps", "", "", "addSignature", "", MiTsmConstants.KEY_SIGNATURE, "", "([Ljava/lang/String;)V", "isPrivilegedPackage", "", "context", "Landroid/content/Context;", "service_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Validator {

    @NotNull
    private static final String TAG = "SignVerifier";

    @NotNull
    public static final Validator INSTANCE = new Validator();

    @NotNull
    private static final ArrayList<String> sInternalSignatures = new ArrayList<>();

    @NotNull
    private static final Map<Integer, String> mGrantedApps = new ConcurrentHashMap();

    private Validator() {
    }

    public final void addSignature(@NotNull String... signature) {
        Intrinsics.checkNotNullParameter(signature, "signature");
        CollectionsKt__MutableCollectionsKt.addAll(sInternalSignatures, signature);
    }

    public final boolean isPrivilegedPackage(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        int callingUid = Binder.getCallingUid();
        String[] packagesForUid = context.getPackageManager().getPackagesForUid(callingUid);
        String str = packagesForUid != null ? (String) ArraysKt___ArraysKt.firstOrNull(packagesForUid) : null;
        if (str == null || str.length() == 0) {
            Logger.i(TAG, "cannot get package from uid(" + callingUid + ")");
            return false;
        }
        if (Intrinsics.areEqual(str, context.getPackageName())) {
            Logger.i(TAG, "Privileged -- for app itself");
            return true;
        }
        Map<Integer, String> map = mGrantedApps;
        String str2 = map.get(Integer.valueOf(callingUid));
        if (str2 != null && Intrinsics.areEqual(str2, str)) {
            return true;
        }
        if (CollectionsKt___CollectionsKt.contains(sInternalSignatures, SignatureUtils.INSTANCE.getSignature(context, str))) {
            Logger.i(TAG, "Privileged type: internal");
            map.put(Integer.valueOf(callingUid), str);
            return true;
        }
        if ((context.getApplicationInfo().flags & 2) != 0) {
            Logger.i(TAG, "Privileged -- for debug");
            return true;
        }
        Logger.i(TAG, "Have no Privileged");
        return false;
    }
}

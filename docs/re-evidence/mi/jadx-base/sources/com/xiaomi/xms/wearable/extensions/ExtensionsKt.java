package com.xiaomi.xms.wearable.extensions;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.graphics.drawable.Drawable;
import android.os.Binder;
import android.text.TextUtils;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import defpackage.xg1;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u001a\"\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u001a\u0006\u0010\u0006\u001a\u00020\u0001\u001a\u0006\u0010\u0007\u001a\u00020\u0003\u001a\b\u0010\b\u001a\u0004\u0018\u00010\t\u001a\u0010\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u000b\u001a\u00020\u0003\u001a\u000e\u0010\f\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0003\u001a\u0010\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000b\u001a\u00020\u0003¨\u0006\u000f"}, d2 = {"checkVersionSupport", "", "curVersion", "", "supportVersion", "split", "isBleDeviceConnected", "getCallingPackage", "getCurFingerPrint", "", "getFingerPrintByPackage", "packageName", "getAppName", "getAppIcon", "Landroid/graphics/drawable/Drawable;", "xmswearable_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nExtensions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Extensions.kt\ncom/xiaomi/xms/wearable/extensions/ExtensionsKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,119:1\n1557#2:120\n1628#2,3:121\n1557#2:124\n1628#2,3:125\n*S KotlinDebug\n*F\n+ 1 Extensions.kt\ncom/xiaomi/xms/wearable/extensions/ExtensionsKt\n*L\n34#1:120\n34#1:121,3\n35#1:124\n35#1:125,3\n*E\n"})
public final class ExtensionsKt {
    public static final boolean checkVersionSupport(@NotNull String curVersion, @Nullable String str, @NotNull String split) {
        Intrinsics.checkNotNullParameter(curVersion, "curVersion");
        Intrinsics.checkNotNullParameter(split, "split");
        if (TextUtils.isEmpty(str) || TextUtils.equals(curVersion, str)) {
            return true;
        }
        try {
            List listSplit$default = StringsKt__StringsKt.split$default((CharSequence) curVersion, new String[]{split}, false, 0, 6, (Object) null);
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listSplit$default, 10));
            Iterator it = listSplit$default.iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(Integer.parseInt((String) it.next())));
            }
            Intrinsics.checkNotNull(str);
            List listSplit$default2 = StringsKt__StringsKt.split$default((CharSequence) str, new String[]{split}, false, 0, 6, (Object) null);
            ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listSplit$default2, 10));
            Iterator it2 = listSplit$default2.iterator();
            while (it2.hasNext()) {
                arrayList2.add(Integer.valueOf(Integer.parseInt((String) it2.next())));
            }
            int iCoerceAtLeast = RangesKt___RangesKt.coerceAtLeast(arrayList.size(), arrayList2.size());
            int i = 0;
            while (i < iCoerceAtLeast) {
                int iIntValue = i < arrayList.size() ? ((Number) arrayList.get(i)).intValue() : 0;
                int iIntValue2 = i < arrayList2.size() ? ((Number) arrayList2.get(i)).intValue() : 0;
                if (iIntValue != iIntValue2) {
                    return iIntValue >= iIntValue2;
                }
                i++;
            }
            return true;
        } catch (Exception e) {
            Logger.e("checkVersionSupport(" + curVersion + ", " + str + ", " + split + ") error:", e);
            return false;
        }
    }

    public static /* synthetic */ boolean checkVersionSupport$default(String str, String str2, String str3, int i, Object obj) {
        if ((i & 4) != 0) {
            str3 = ".";
        }
        return checkVersionSupport(str, str2, str3);
    }

    @Nullable
    public static final Drawable getAppIcon(@NotNull String packageName) {
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        try {
            PackageManager packageManager = ApplicationExtKt.getApplication().getPackageManager();
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(packageName, 0);
            Intrinsics.checkNotNullExpressionValue(applicationInfo, "getApplicationInfo(...)");
            return applicationInfo.loadIcon(packageManager);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    @NotNull
    public static final String getAppName(@NotNull String packageName) {
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        try {
            PackageManager packageManager = ApplicationExtKt.getApplication().getPackageManager();
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(packageName, 0);
            Intrinsics.checkNotNullExpressionValue(applicationInfo, "getApplicationInfo(...)");
            return applicationInfo.loadLabel(packageManager).toString();
        } catch (PackageManager.NameNotFoundException unused) {
            return "";
        }
    }

    @NotNull
    public static final String getCallingPackage() {
        String nameForUid = ApplicationExtKt.getApplication().getPackageManager().getNameForUid(Binder.getCallingUid());
        return nameForUid == null ? "" : nameForUid;
    }

    @Nullable
    public static final byte[] getCurFingerPrint() {
        String callingPackage = getCallingPackage();
        xg1.d("callingPackage:" + callingPackage);
        return getFingerPrintByPackage(callingPackage);
    }

    @Nullable
    public static final byte[] getFingerPrintByPackage(@NotNull String packageName) {
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        byte[] bArr = new byte[0];
        PackageManager packageManager = ApplicationExtKt.getApplication().getPackageManager();
        if (packageManager != null) {
            try {
                Signature[] signatureArr = packageManager.getPackageInfo(packageName, 64).signatures;
                if (signatureArr != null && signatureArr.length != 0 && signatureArr.length == 1) {
                    try {
                        return MessageDigest.getInstance("SHA1").digest(signatureArr[0].toByteArray());
                    } catch (NoSuchAlgorithmException unused) {
                        return bArr;
                    }
                }
                return bArr;
            } catch (PackageManager.NameNotFoundException e) {
                e.printStackTrace();
            }
        }
        return bArr;
    }

    public static final boolean isBleDeviceConnected() {
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        return wearableDeviceModel != null && wearableDeviceModel.getIsDeviceConnected() && com.xiaomi.fitness.device.manager.DeviceModelExtKt.isBluetooth(wearableDeviceModel);
    }
}

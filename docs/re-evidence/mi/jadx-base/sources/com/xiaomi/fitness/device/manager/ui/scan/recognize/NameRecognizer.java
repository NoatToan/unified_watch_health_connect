package com.xiaomi.fitness.device.manager.ui.scan.recognize;

import android.annotation.SuppressLint;
import com.xiaomi.fit.device.extensions.DeviceModelExtKt;
import com.xiaomi.fitness.common.utils.ByteUtilKt;
import com.xiaomi.fitness.device.manager.bean.Product;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableProductManager;
import com.xiaomi.fitness.device.manager.export.bean.WearableProduct;
import com.xiaomi.fitness.device.manager.export.scan.BleDevice;
import com.xiaomi.fitness.device.manager.export.scan.beacon.Beacon;
import com.xiaomi.fitness.device.manager.export.scan.beacon.BeaconItem;
import com.xiaomi.fitness.device.manager.export.scan.beacon.PacketReader;
import com.xiaomi.fitness.device.manager.ui.scan.recognize.NameRecognizer;
import defpackage.ydl;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.UByte;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.UStringsKt;
import no.nordicsemi.android.support.v18.scanner.ScanResult;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0006\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u0015\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00020\u0019¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\b\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\b\u0010\u0007J\u001f\u0010\t\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\t\u0010\u0007J\u001f\u0010\n\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\n\u0010\u0007J\u001f\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000b\u0010\u0007J\u0019\u0010\u000e\u001a\u00020\u00052\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0011\u001a\u00020\u0005*\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0013\u001a\u00020\u00052\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u0013\u0010\u000fJ\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0017¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001f"}, d2 = {"Lcom/xiaomi/fitness/device/manager/ui/scan/recognize/NameRecognizer;", "Lcom/xiaomi/fitness/device/manager/ui/scan/recognize/Recognizer;", "", "bleName", "namePrefix", "", "fitMiSmartBand5", "(Ljava/lang/String;Ljava/lang/String;)Z", "fitMiSmartBand6", "fitMiSmartBand7", "fitL61W", "fitM61C", "Lydl;", "scanRecord", "parseM61PhoneSwitching", "(Lydl;)Z", "Lcom/xiaomi/fitness/device/manager/bean/Product;", "isPangu", "(Lcom/xiaomi/fitness/device/manager/bean/Product;)Z", "isUnlockBeacon", "Lno/nordicsemi/android/support/v18/scanner/ScanResult;", "scanResult", "Lcom/xiaomi/fitness/device/manager/export/scan/BleDevice;", "recognize", "(Lno/nordicsemi/android/support/v18/scanner/ScanResult;)Lcom/xiaomi/fitness/device/manager/export/scan/BleDevice;", "", "mNamePrefixList", "Ljava/util/List;", "<init>", "(Ljava/util/List;)V", "Companion", "device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nNameRecognizer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NameRecognizer.kt\ncom/xiaomi/fitness/device/manager/ui/scan/recognize/NameRecognizer\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,144:1\n11168#2:145\n11503#2,3:146\n37#3:149\n36#3,3:150\n*S KotlinDebug\n*F\n+ 1 NameRecognizer.kt\ncom/xiaomi/fitness/device/manager/ui/scan/recognize/NameRecognizer\n*L\n103#1:145\n103#1:146,3\n104#1:149\n104#1:150,3\n*E\n"})
public final class NameRecognizer implements Recognizer {
    private static final int GOOGLE_MANUFACTURE = 224;

    @NotNull
    private final List<String> mNamePrefixList;

    public NameRecognizer(@NotNull List<String> mNamePrefixList) {
        Intrinsics.checkNotNullParameter(mNamePrefixList, "mNamePrefixList");
        this.mNamePrefixList = mNamePrefixList;
    }

    private final boolean fitL61W(String bleName, String namePrefix) {
        if (StringsKt__StringsJVMKt.startsWith$default(namePrefix, "m61w", false, 2, null) || StringsKt__StringsJVMKt.startsWith$default(namePrefix, "m61t", false, 2, null)) {
            return StringsKt__StringsJVMKt.startsWith(bleName, "xiaomi ", false) || StringsKt__StringsJVMKt.startsWith(bleName, "M2233W1", false) || StringsKt__StringsJVMKt.startsWith(bleName, "M2234W1", false) || StringsKt__StringsJVMKt.startsWith$default(bleName, "Xiaomi Watch 2", false, 2, null) || StringsKt__StringsJVMKt.startsWith$default(bleName, "Xiaomi Watch 2 Pro", false, 2, null);
        }
        return false;
    }

    private final boolean fitM61C(String bleName, String namePrefix) {
        return StringsKt__StringsJVMKt.startsWith$default(namePrefix, "m61c", false, 2, null) && StringsKt__StringsJVMKt.startsWith$default(bleName, "Xiaomi Watch 2", false, 2, null) && !StringsKt__StringsKt.contains$default((CharSequence) bleName, (CharSequence) "Pro", false, 2, (Object) null);
    }

    private final boolean fitMiSmartBand5(String bleName, String namePrefix) {
        return StringsKt__StringsJVMKt.startsWith$default(bleName, Product.KONG_MING_NAME, false, 2, null) && Intrinsics.areEqual(namePrefix, Product.KONG_MING_NAME_2);
    }

    private final boolean fitMiSmartBand6(String bleName, String namePrefix) {
        return (StringsKt__StringsJVMKt.startsWith$default(bleName, Product.PAN_GU_NAME, false, 2, null) || StringsKt__StringsJVMKt.startsWith$default(bleName, Product.PAN_GU_NAME_2, false, 2, null)) && Intrinsics.areEqual(namePrefix, Product.PAN_GU_NAME);
    }

    private final boolean fitMiSmartBand7(String bleName, String namePrefix) {
        return StringsKt__StringsJVMKt.startsWith$default(bleName, "L66", false, 2, null) && StringsKt__StringsJVMKt.startsWith$default(namePrefix, Product.HUAMI_BAND_7, false, 2, null);
    }

    private final boolean isPangu(Product product) {
        return StringsKt__StringsJVMKt.equals(Product.PAN_GU_NAME, product.getBltNamePrefix(), true) || StringsKt__StringsJVMKt.equals(Product.PAN_GU_NAME_2, product.getBltNamePrefix(), true);
    }

    private final boolean isUnlockBeacon(ydl scanRecord) {
        if (scanRecord == null) {
            return false;
        }
        for (BeaconItem beaconItem : new Beacon(scanRecord.c()).getMItems()) {
            if (beaconItem.getType() == 22 && new PacketReader(beaconItem).getShort() == 64939) {
                return true;
            }
        }
        return false;
    }

    private final boolean parseM61PhoneSwitching(ydl scanRecord) {
        byte[] bArrE;
        if (scanRecord == null || (bArrE = scanRecord.e(224)) == null) {
            return false;
        }
        ArrayList arrayList = new ArrayList(bArrE.length);
        for (byte b2 : bArrE) {
            arrayList.add(StringsKt__StringsKt.padStart(UStringsKt.m2228toStringLxnNnR4(UByte.m904constructorimpl(b2), 2), 8, '0'));
        }
        String string = Arrays.toString(arrayList.toArray(new String[0]));
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        DeviceModelExtKt.logi("manufacture: " + string);
        if (bArrE.length < 8) {
            return false;
        }
        return bArrE[0] == 7 && bArrE[1] == 20 && bArrE[2] == 0 && ByteUtilKt.and(bArrE[7], 2) == 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean recognize$lambda$0(String namePrefix, WearableProduct it) {
        Intrinsics.checkNotNullParameter(namePrefix, "$namePrefix");
        Intrinsics.checkNotNullParameter(it, "it");
        return Intrinsics.areEqual(it.getBltNamePrefix(), namePrefix) && (it.getProductId() == it.getGroupId() || it.getGroupId() == 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean recognize$lambda$1(String namePrefix, WearableProduct it) {
        Intrinsics.checkNotNullParameter(namePrefix, "$namePrefix");
        Intrinsics.checkNotNullParameter(it, "it");
        return Intrinsics.areEqual(it.getBltNamePrefix(), namePrefix);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.device.manager.ui.scan.recognize.Recognizer
    @SuppressLint({"MissingPermission"})
    @Nullable
    public BleDevice recognize(@NotNull ScanResult scanResult) {
        Intrinsics.checkNotNullParameter(scanResult, "scanResult");
        String name = scanResult.a().getName();
        DeviceModelExtKt.logi("name: " + name + " mac:" + scanResult.a().getAddress() + ", namePrefix: " + this.mNamePrefixList);
        if (name == null) {
            return null;
        }
        for (final String str : this.mNamePrefixList) {
            if (StringsKt__StringsJVMKt.startsWith$default(name, str, false, 2, null) || fitMiSmartBand5(name, str) || fitMiSmartBand6(name, str) || fitMiSmartBand7(name, str)) {
                if (isUnlockBeacon(scanResult.d())) {
                    DeviceModelExtKt.logi("unlock beacon");
                    return null;
                }
                WearableProduct wearableProduct = (WearableProduct) DeviceManagerExtKt.getInstance(WearableProductManager.INSTANCE).findProduct(new Function1() { // from class: mgg
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj) {
                        return Boolean.valueOf(NameRecognizer.recognize$lambda$0(str, (WearableProduct) obj));
                    }
                });
                if (wearableProduct == null) {
                    return null;
                }
                DeviceModelExtKt.logi("NameRecognize product " + wearableProduct);
                String address = scanResult.a().getAddress();
                Intrinsics.checkNotNullExpressionValue(address, "getAddress(...)");
                return new BleDevice(address, null, wearableProduct.getProductId(), wearableProduct.getModel(), null, name, scanResult.c(), false, 128, null);
            }
            if (fitL61W(name, str) || fitM61C(name, str)) {
                WearableProduct wearableProduct2 = (WearableProduct) DeviceManagerExtKt.getInstance(WearableProductManager.INSTANCE).findProduct(new Function1() { // from class: ngg
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj) {
                        return Boolean.valueOf(NameRecognizer.recognize$lambda$1(str, (WearableProduct) obj));
                    }
                });
                if (wearableProduct2 == null) {
                    return null;
                }
                DeviceModelExtKt.logi("NameRecognize product " + wearableProduct2.getBltNamePrefix() + " , " + wearableProduct2.getProductName());
                ydl ydlVarD = scanResult.d();
                byte[] bArrE = ydlVarD != null ? ydlVarD.e(224) : null;
                if (bArrE != null && bArrE.length >= 8) {
                    String address2 = scanResult.a().getAddress();
                    Intrinsics.checkNotNullExpressionValue(address2, "getAddress(...)");
                    return new BleDevice(address2, null, wearableProduct2.getProductId(), wearableProduct2.getModel(), null, name, scanResult.c(), parseM61PhoneSwitching(ydlVarD));
                }
            }
        }
        return null;
    }
}

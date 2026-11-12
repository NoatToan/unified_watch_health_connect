package com.xiaomi.hm.health.device.introduce.recocver;

import android.app.Activity;
import com.amazon.identity.auth.device.datastore.AESEncryptionHelper;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.device.introduce.RestoreItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0012\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000\u001a,\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u00010\bj\b\u0012\u0004\u0012\u00020\u0001`\t*\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006\"\u0016\u0010\u000b\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"", "Lcom/xiaomi/hm/health/device/introduce/RestoreItem;", "", "toConfigStr", "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "deviceSource", "Landroid/app/Activity;", "activity", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "fromConfigStr", "DEVICE_RESTORE_CONFIG", "Ljava/lang/String;", "devicex_zeppRelease"}, k = 2, mv = {1, 5, 1})
public final class RestoreParserKt {

    @NotNull
    public static final String DEVICE_RESTORE_CONFIG = "DeviceConfigRestore,true";

    @NotNull
    public static final ArrayList<RestoreItem> fromConfigStr(@Nullable String str, @NotNull HMDeviceSource hMDeviceSource, @NotNull Activity activity) {
        if (str == null || m.isBlank(str)) {
            return new ArrayList<>();
        }
        ArrayList<RestoreItem> arrayList = new ArrayList<>();
        Iterator it2 = StringsKt__StringsKt.split$default((CharSequence) str, new String[]{AESEncryptionHelper.SEPARATOR}, false, 0, 6, (Object) null).iterator();
        while (it2.hasNext()) {
            List listSplit$default = StringsKt__StringsKt.split$default((CharSequence) it2.next(), new String[]{","}, false, 0, 6, (Object) null);
            boolean zAreEqual = Intrinsics.areEqual(listSplit$default.get(1), "true");
            if (Intrinsics.areEqual(listSplit$default.get(0), DeviceConfigRestore.TAG)) {
                DeviceConfigRestore deviceConfigRestore = new DeviceConfigRestore(hMDeviceSource, activity);
                deviceConfigRestore.setRestore(zAreEqual);
                Unit unit = Unit.INSTANCE;
                arrayList.add(deviceConfigRestore);
            } else if (Intrinsics.areEqual(listSplit$default.get(0), PaiRestore.TAG)) {
                PaiRestore paiRestore = new PaiRestore();
                paiRestore.setRestore(zAreEqual);
                Unit unit2 = Unit.INSTANCE;
                arrayList.add(paiRestore);
            }
        }
        return arrayList;
    }

    @NotNull
    public static final String toConfigStr(@Nullable List<? extends RestoreItem> list) {
        if (list == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (RestoreItem restoreItem : list) {
            if (restoreItem instanceof DeviceConfigRestore) {
                sb.append("DeviceConfigRestore," + restoreItem.getRestore() + AESEncryptionHelper.SEPARATOR);
            } else if (restoreItem instanceof PaiRestore) {
                sb.append("PaiRestore," + restoreItem.getRestore() + AESEncryptionHelper.SEPARATOR);
            }
        }
        return sb.substring(0, sb.length() - 1);
    }
}

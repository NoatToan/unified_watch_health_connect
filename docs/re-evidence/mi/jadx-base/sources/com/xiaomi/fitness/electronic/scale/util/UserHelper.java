package com.xiaomi.fitness.electronic.scale.util;

import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceManager;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceManagerExtKt;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceModel;
import com.xiaomi.fitness.eco.device.manager.export.bean.EcoDeviceInfo;
import com.xiaomi.fitness.electronic.scale.export.bean.VirtualAccount;
import com.xiaomi.fitness.electronic.scale.export.sp.ElectronicScalePreference;
import defpackage.bu7;
import defpackage.f4b;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u001c\u0010\b\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bJ\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/fitness/electronic/scale/util/UserHelper;", "", "<init>", "()V", "getMainUserType", "", "did", "", "saveVirtualUserToSp", "", "virtualAccounts", "", "Lcom/xiaomi/fitness/electronic/scale/export/bean/VirtualAccount;", "getVirtualUserFromSp", "electronic-scale_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class UserHelper {

    @NotNull
    public static final UserHelper INSTANCE = new UserHelper();

    private UserHelper() {
    }

    public final int getMainUserType(@NotNull String did) {
        EcoDeviceInfo deviceInfo;
        Intrinsics.checkNotNullParameter(did, "did");
        EcoDeviceModel ecoDeviceModel = (EcoDeviceModel) EcoDeviceManagerExtKt.getInstance(EcoDeviceManager.INSTANCE).getDeviceModel(did);
        return (ecoDeviceModel == null || (deviceInfo = ecoDeviceModel.getDeviceInfo()) == null || !deviceInfo.isOwner()) ? 2 : 0;
    }

    @NotNull
    public final List<VirtualAccount> getVirtualUserFromSp(@NotNull String did) {
        Intrinsics.checkNotNullParameter(did, "did");
        String string = ElectronicScalePreference.getString(ElectronicScalePreference.SCALE_VUSER_LIST_KEY + did);
        Logger.i("getVirtualUserFromSp() : " + string, new Object[0]);
        List listB = bu7.b(string, VirtualAccount.class);
        Intrinsics.checkNotNull(listB, "null cannot be cast to non-null type kotlin.collections.MutableList<com.xiaomi.fitness.electronic.scale.export.bean.VirtualAccount>");
        return TypeIntrinsics.asMutableList(listB);
    }

    public final void saveVirtualUserToSp(@NotNull String did, @NotNull List<VirtualAccount> virtualAccounts) {
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(virtualAccounts, "virtualAccounts");
        String str = ElectronicScalePreference.SCALE_VUSER_LIST_KEY + did;
        String strC = f4b.c(virtualAccounts);
        Logger.i("saveVirtualUserToSp() : " + strC, new Object[0]);
        Intrinsics.checkNotNull(strC);
        ElectronicScalePreference.putString(str, strC);
    }
}

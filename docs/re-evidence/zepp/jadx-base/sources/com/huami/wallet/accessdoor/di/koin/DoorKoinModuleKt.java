package com.huami.wallet.accessdoor.di.koin;

import com.huami.wallet.accessdoor.resource.IAccessDoorRes;
import kotlin.Metadata;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.koin.core.Koin;
import org.koin.core.context.GlobalContext;
import org.koin.core.qualifier.QualifierKt;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u001a\u0006\u0010\u0001\u001a\u00020\u0000\u001a\u0006\u0010\u0003\u001a\u00020\u0002\"\u0016\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006\"\u0016\u0010\u0007\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006\"\u0016\u0010\b\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/huami/wallet/accessdoor/resource/IAccessDoorRes;", "getDoorRes", "Lcom/huami/wallet/accessdoor/di/koin/INfcDoorToolkits;", "getNfcDoorToolkits", "", DoorKoinModuleKt.DOOR_CONFIG_APP_NAME, "Ljava/lang/String;", DoorKoinModuleKt.DOOR_SCOPE_DEVICE_RES, DoorKoinModuleKt.DOOR_SCOPE_DEVICE, "access-door_release"}, k = 2, mv = {1, 5, 1})
public final class DoorKoinModuleKt {

    @NotNull
    public static final String DOOR_CONFIG_APP_NAME = "DOOR_CONFIG_APP_NAME";

    @NotNull
    public static final String DOOR_SCOPE_DEVICE = "DOOR_SCOPE_DEVICE";

    @NotNull
    public static final String DOOR_SCOPE_DEVICE_RES = "DOOR_SCOPE_DEVICE_RES";

    @NotNull
    public static final IAccessDoorRes getDoorRes() {
        return (IAccessDoorRes) Koin.getOrCreateScope$default(GlobalContext.INSTANCE.get(), DOOR_SCOPE_DEVICE, QualifierKt.named(DOOR_SCOPE_DEVICE), null, 4, null).get(Reflection.getOrCreateKotlinClass(IAccessDoorRes.class), QualifierKt.named(DOOR_SCOPE_DEVICE_RES), null);
    }

    @NotNull
    public static final INfcDoorToolkits getNfcDoorToolkits() {
        return (INfcDoorToolkits) GlobalContext.INSTANCE.get().getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(INfcDoorToolkits.class), null, null);
    }
}

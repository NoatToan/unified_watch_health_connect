package com.huami.account.userinfo.usecase;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.account.service.model.Area;
import com.huami.account.ui.areas.SelectAreaManager;
import com.huami.account.userinfo.UserinfoExternalsKt;
import com.tekartik.sqflite.Constant;
import com.xiaomi.hm.health.model.account.HMPersonInfo;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0006\u0010\u0003\u001a\u00020\u0002R\u0016\u0010\u0007\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0016\u0010\t\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\f"}, d2 = {"Lcom/huami/account/userinfo/usecase/SetupDefaultUnitUseCase;", "", "", Constant.METHOD_EXECUTE, "", "a", LogUtil.I, "TEMP_UNIT_C", "b", "TEMP_UNIT_F", "<init>", "()V", "userinfo_release"}, k = 1, mv = {1, 5, 1})
public final class SetupDefaultUnitUseCase {

    @NotNull
    public static final SetupDefaultUnitUseCase INSTANCE = new SetupDefaultUnitUseCase();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private static final int TEMP_UNIT_C = 0;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static final int TEMP_UNIT_F = 1;

    private SetupDefaultUnitUseCase() {
    }

    public final void execute() {
        SelectAreaManager selectAreaManager = SelectAreaManager.INSTANCE;
        Area area = selectAreaManager.getArea();
        HMPersonInfo hMPersonInfo = HMPersonInfo.getInstance();
        if (selectAreaManager.isUS(area)) {
            UserinfoExternalsKt.getUserinfoDelegate().setupTemperatureUnit(1);
            hMPersonInfo.getMiliConfig().setUnit(1);
            hMPersonInfo.getMiliConfig().setWeightUnit(1);
        } else if (selectAreaManager.isGB(area)) {
            UserinfoExternalsKt.getUserinfoDelegate().setupTemperatureUnit(0);
            hMPersonInfo.getMiliConfig().setUnit(1);
            hMPersonInfo.getMiliConfig().setWeightUnit(1);
        } else if (selectAreaManager.isCN(area)) {
            UserinfoExternalsKt.getUserinfoDelegate().setupTemperatureUnit(0);
            hMPersonInfo.getMiliConfig().setUnit(0);
            hMPersonInfo.getMiliConfig().setWeightUnit(16);
        } else {
            UserinfoExternalsKt.getUserinfoDelegate().setupTemperatureUnit(0);
            hMPersonInfo.getMiliConfig().setUnit(0);
            hMPersonInfo.getMiliConfig().setWeightUnit(0);
        }
    }
}

package com.huami.account.ui.areas;

import android.content.Context;
import com.huami.account.selectArea.datasource.AreaMapper;
import com.huami.account.service.model.Area;
import com.huami.account.service.model.UnknownArea;
import com.huami.account.service.proxy.KoinProxyKt;
import com.huami.account.ui.R;
import com.xiaomi.hm.health.baseutil.Country;
import com.xiaomi.hm.health.device.webapi.device.HMDeviceWebAPI;
import kotlin.Metadata;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\"\u0017\u0010\u0004\u001a\u00020\u0001*\u00020\u00008F@\u0006¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/huami/account/service/model/Area;", "", "getDisplayName", "(Lcom/huami/account/service/model/Area;)Ljava/lang/String;", HMDeviceWebAPI.PARAM_UPDATE_DEVICE_INFO_DISPLAY_NAME, "accountui_release"}, k = 2, mv = {1, 5, 1})
public final class AreasKt {
    @NotNull
    public static final String getDisplayName(@NotNull Area area) {
        String string;
        if (!(area instanceof UnknownArea)) {
            return (Country.isTW() && SelectAreaHelper.isTW(area)) ? "台灣" : AreaMapper.INSTANCE.exec(area.getValue());
        }
        Context context = (Context) KoinProxyKt.getKoinProxy().getScopeRegistry().getRootScope().getOrNull(Reflection.getOrCreateKotlinClass(Context.class), null, null);
        return (context == null || (string = context.getString(R.string.account_ui_select_area_other_str)) == null) ? "" : string;
    }
}

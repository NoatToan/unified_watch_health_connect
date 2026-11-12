package com.huami.core.device.feature.gps.filter;

import androidx.annotation.Keep;
import com.huami.nfc.web.Constant;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\n\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0004\u001a\u00020\u0002H&J\b\u0010\u0005\u001a\u00020\u0002H&J\b\u0010\u0006\u001a\u00020\u0002H&J\b\u0010\b\u001a\u00020\u0007H&J\b\u0010\t\u001a\u00020\u0002H&¨\u0006\n"}, d2 = {"Lcom/huami/core/device/feature/gps/filter/GpsPointWrapper;", "", "", "time", Constant.KEY_LATITUDE, Constant.KEY_LONGITUDE, "altitude", "", "state", "pace", "gps-filter_release"}, k = 1, mv = {1, 4, 0})
public interface GpsPointWrapper {
    int altitude();

    int latitude();

    int longitude();

    int pace();

    short state();

    int time();
}

package com.huami.device.core.agps.api;

import com.huami.watch.companion.agps.AGpsSyncHelper;
import com.huami.watch.companion.cloud.Cloud;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0019\u0010\u0003\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"Lcom/huami/device/core/agps/api/DownloadResourceType;", "", "", "value", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "AGPS", Cloud.FILE_TYPE_AGPS_ZIP, "WATCHDIAL", "EPHZIP", Cloud.FILE_TYPE_AGPS_ALM_ZIP, "CEP_PAK_HA", AGpsSyncHelper.FILE_TYPE_SONY_LLE, "EPO_GR_3", "EPO", "agps-api_release"}, k = 1, mv = {1, 4, 0})
public enum DownloadResourceType {
    AGPS("AGPS"),
    AGPSZIP(Cloud.FILE_TYPE_AGPS_ZIP),
    WATCHDIAL("WATCHDIAL"),
    EPHZIP("EPHZIP"),
    AGPS_ALM(Cloud.FILE_TYPE_AGPS_ALM_ZIP),
    CEP_PAK_HA("CEP_PAK_HA"),
    LLE(AGpsSyncHelper.FILE_TYPE_SONY_LLE),
    EPO_GR_3("EPO_GR_3"),
    EPO("EPO");


    @NotNull
    private final String value;

    DownloadResourceType(String str) {
        this.value = str;
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }
}

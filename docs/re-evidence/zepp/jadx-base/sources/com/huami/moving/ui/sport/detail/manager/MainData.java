package com.huami.moving.ui.sport.detail.manager;

import com.huami.moving.webapi.SportWebParams;
import com.xiaomi.hm.health.device.fw_upgrade.HMFwOnlineAnalyticsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0003\u001a\u00020\u0002H&j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/huami/moving/ui/sport/detail/manager/MainData;", "", "", "getValue", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "COST", "DISTANCE", "SPORT_TIME", "COUNT_TOTAL", "FLOOR_NUMBER", "DOWNHILL_DISTANCE", "moving_release"}, k = 1, mv = {1, 5, 1})
public enum MainData {
    COST { // from class: com.huami.moving.ui.sport.detail.manager.MainData.a
        @Override // com.huami.moving.ui.sport.detail.manager.MainData
        @NotNull
        public String getValue() {
            return HMFwOnlineAnalyticsKt.COST;
        }
    },
    DISTANCE { // from class: com.huami.moving.ui.sport.detail.manager.MainData.c
        @Override // com.huami.moving.ui.sport.detail.manager.MainData
        @NotNull
        public String getValue() {
            return "distance";
        }
    },
    SPORT_TIME { // from class: com.huami.moving.ui.sport.detail.manager.MainData.f
        @Override // com.huami.moving.ui.sport.detail.manager.MainData
        @NotNull
        public String getValue() {
            return "sport_time";
        }
    },
    COUNT_TOTAL { // from class: com.huami.moving.ui.sport.detail.manager.MainData.b
        @Override // com.huami.moving.ui.sport.detail.manager.MainData
        @NotNull
        public String getValue() {
            return "count_total";
        }
    },
    FLOOR_NUMBER { // from class: com.huami.moving.ui.sport.detail.manager.MainData.e
        @Override // com.huami.moving.ui.sport.detail.manager.MainData
        @NotNull
        public String getValue() {
            return SportWebParams.PARAM_SUMMARY_FLOOR_NUMBER;
        }
    },
    DOWNHILL_DISTANCE { // from class: com.huami.moving.ui.sport.detail.manager.MainData.d
        @Override // com.huami.moving.ui.sport.detail.manager.MainData
        @NotNull
        public String getValue() {
            return "downhill_distance";
        }
    };

    MainData(String str) {
    }

    /* synthetic */ MainData(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    @NotNull
    public abstract String getValue();
}

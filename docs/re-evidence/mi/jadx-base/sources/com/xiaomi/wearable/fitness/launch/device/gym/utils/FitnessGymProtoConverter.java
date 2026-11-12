package com.xiaomi.wearable.fitness.launch.device.gym.utils;

import com.mibi.sdk.component.Constants;
import com.xiaomi.fit.data.common.util.FitnessDateUtils;
import com.xiaomi.fitness.sport_manager_export.data.SportRequestData;
import com.xiaomi.fitness.sport_manager_export.data.SportResponseData;
import defpackage.bs9;
import defpackage.ds9;
import defpackage.tv9;
import defpackage.v64;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/xiaomi/wearable/fitness/launch/device/gym/utils/FitnessGymProtoConverter;", "", "<init>", "()V", "Companion", "sport-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FitnessGymProtoConverter {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/wearable/fitness/launch/device/gym/utils/FitnessGymProtoConverter$Companion;", "", "Lcom/xiaomi/fitness/sport_manager_export/data/SportRequestData;", Constants.KEY_REQUEST_DATA, "Lbs9;", "convertToProtoGymRequest", "(Lcom/xiaomi/fitness/sport_manager_export/data/SportRequestData;)Lbs9;", "Lds9;", "data", "Lcom/xiaomi/fitness/sport_manager_export/data/SportResponseData;", "convertProtoToGymResponseData", "(Lds9;)Lcom/xiaomi/fitness/sport_manager_export/data/SportResponseData;", "<init>", "()V", "sport-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final SportResponseData convertProtoToGymResponseData(@NotNull ds9 data) {
            Intrinsics.checkNotNullParameter(data, "data");
            ds9 ds9Var = new ds9();
            return new SportResponseData(ds9Var.c, ds9Var.e, null);
        }

        @Nullable
        public final bs9 convertToProtoGymRequest(@NotNull SportRequestData requestData) {
            Intrinsics.checkNotNullParameter(requestData, "requestData");
            bs9 bs9Var = new bs9();
            bs9Var.g = requestData.sportState;
            bs9Var.c = requestData.timeStamp;
            bs9Var.e = requestData.sportType;
            tv9.v(requestData);
            v64 v64Var = new v64();
            v64Var.c = (int) (TimeUnit.MILLISECONDS.toMinutes(FitnessDateUtils.getTZOffsetInMilli(System.currentTimeMillis())) / ((long) 15));
            bs9Var.d = v64Var;
            return bs9Var;
        }
    }
}

package com.huami.device.feature.health.device.init;

import androidx.fragment.app.Fragment;
import com.huami.device.feature.health.device.blood_pressure.IBloodPressureApi;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0003\u001a\u00020\u0002H&R\u0016\u0010\u0007\u001a\u00020\u00048&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/huami/device/feature/health/device/init/BloodPressureInit;", "Lcom/huami/device/feature/health/device/init/BaseHealthInit;", "Landroidx/fragment/app/Fragment;", "getPersonInfoFragment", "Lcom/huami/device/feature/health/device/blood_pressure/IBloodPressureApi;", "getBloodPressureApi", "()Lcom/huami/device/feature/health/device/blood_pressure/IBloodPressureApi;", "bloodPressureApi", "<init>", "()V", "health-base_release"}, k = 1, mv = {1, 5, 1})
public abstract class BloodPressureInit extends BaseHealthInit {
    @NotNull
    public abstract IBloodPressureApi getBloodPressureApi();

    @NotNull
    public abstract Fragment getPersonInfoFragment();
}

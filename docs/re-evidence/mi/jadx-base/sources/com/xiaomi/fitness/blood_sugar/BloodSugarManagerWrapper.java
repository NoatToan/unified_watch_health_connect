package com.xiaomi.fitness.blood_sugar;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import defpackage.mvc;
import defpackage.nzc;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH&¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000e\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\rH&¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lcom/xiaomi/fitness/blood_sugar/BloodSugarManagerWrapper;", "", "Lcom/xiaomi/fitness/blood_sugar/DeviceTime;", "getDeviceTime", "()Lcom/xiaomi/fitness/blood_sugar/DeviceTime;", "", "getHistoryDeviceSize", "()I", "Lnzc;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "setStepCallback", "(Lnzc;)V", "Lmvc;", "setOtaProgressListener", "(Lmvc;)V", "Companion", "blood-sugar-export_release"}, k = 1, mv = {2, 0, 0})
public interface BloodSugarManagerWrapper {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/fitness/blood_sugar/BloodSugarManagerWrapper$Companion;", "", "<init>", "()V", "blood-sugar-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }
    }

    @NotNull
    DeviceTime getDeviceTime();

    int getHistoryDeviceSize();

    void setOtaProgressListener(@Nullable mvc listener);

    void setStepCallback(@Nullable nzc listener);
}

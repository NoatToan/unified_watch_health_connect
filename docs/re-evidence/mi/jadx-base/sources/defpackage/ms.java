package defpackage;

import com.huami.bluetooth.profile.channel.module.sleep.DataType;
import com.huami.bluetooth.profile.channel.module.sleep.SleepData;
import com.huami.bluetooth.profile.channel.module.sleep.SleepStage;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.hm.health.bt.profile.base.ProfileUtils;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.List;
import kotlin.Metadata;
import kotlin.NotImplementedError;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0014\u0010\u0005\u001a\u00020\b*\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¨\u0006\u000b"}, d2 = {"Lms;", "Lu4;", "Lcom/huami/bluetooth/profile/channel/module/sleep/SleepData;", "", "value", PluginDeviceInfo.FMODEL, "Lcom/huami/bluetooth/profile/channel/module/sleep/DataType;", "type", "", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final class ms implements u4<SleepData, byte[]> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f27145a = new a(null);

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0014\u0010\n\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0004¨\u0006\r"}, d2 = {"Lms$a;", "", "", "FLAG_LEN", "I", "RESTING_HR_LEN", "SLEEP_DUR_LEN", "SLEEP_SCORE_LEN", "SLEEP_STAGES_COUNT_LEN", "STAGES_LEN", "TIMESTAMP_LEN", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // defpackage.u4
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public byte[] encode(@NotNull SleepData value) throws IOException {
        Intrinsics.checkNotNullParameter(value, "value");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(c3.a(value.getTimestamp$bluetooth_release(), 4));
        byteArrayOutputStream.write(c3.a(value.getUpdateTimestamp(), 4));
        byteArrayOutputStream.write(ProfileUtils.getTimezoneKey(value.getTimeZone()));
        byteArrayOutputStream.write(c3.a(value.getDataFlag().getFlag$bluetooth_release(), 4));
        byteArrayOutputStream.write(c3.a(value.getStart(), 2));
        byteArrayOutputStream.write(c3.a(value.getStop(), 2));
        byteArrayOutputStream.write(c3.a(value.getSleepDuration(), 2));
        if (a(value, DataType.c.t)) {
            Integer sleepScore = value.getSleepScore();
            byteArrayOutputStream.write(c3.a(sleepScore != null ? sleepScore.intValue() : 0, 1));
        }
        if (a(value, DataType.b.t)) {
            Integer restingHr = value.getRestingHr();
            byteArrayOutputStream.write(c3.a(restingHr != null ? restingHr.intValue() : 0, 1));
        }
        if (a(value, DataType.d.t)) {
            List<SleepStage> stages = value.getStages();
            byteArrayOutputStream.write(c3.a(stages != null ? stages.size() : 0, 2));
            List<SleepStage> stages2 = value.getStages();
            if (stages2 != null) {
                for (SleepStage sleepStage : stages2) {
                    byteArrayOutputStream.write(c3.a(sleepStage.getStart(), 2));
                    byteArrayOutputStream.write(c3.a(sleepStage.getStop(), 2));
                    byteArrayOutputStream.write(c3.a(sleepStage.getStatus(), 2));
                }
            }
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        Intrinsics.checkNotNullExpressionValue(byteArray, "ByteArrayOutputStream().…}\n        }.toByteArray()");
        return byteArray;
    }

    @Override // defpackage.u4
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public SleepData decode(@NotNull byte[] value) {
        Intrinsics.checkNotNullParameter(value, "value");
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    public final boolean a(SleepData sleepData, DataType dataType) {
        return sleepData.getDataFlag().isSupport(dataType);
    }
}

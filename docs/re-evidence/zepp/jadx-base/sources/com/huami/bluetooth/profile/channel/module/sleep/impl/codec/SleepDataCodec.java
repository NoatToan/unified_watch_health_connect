package com.huami.bluetooth.profile.channel.module.sleep.impl.codec;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.bluetooth.profile.channel.module.base.Codec;
import com.huami.bluetooth.profile.channel.module.sleep.DataType;
import com.huami.bluetooth.profile.channel.module.sleep.SleepData;
import com.huami.bluetooth.profile.channel.module.sleep.SleepStage;
import com.huami.bluetooth.utils.ByteUtilsKt;
import com.xiaomi.hm.health.bt.profile.base.ProfileUtils;
import java.io.ByteArrayOutputStream;
import java.util.List;
import kotlin.Metadata;
import kotlin.NotImplementedError;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0000\u0018\u0000 \u00072\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0007B\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0014\u0010\u0007\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0016J\u0010\u0010\n\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0003H\u0016¨\u0006\r"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/sleep/impl/codec/SleepDataCodec;", "Lcom/huami/bluetooth/profile/channel/module/base/Codec;", "Lcom/huami/bluetooth/profile/channel/module/sleep/SleepData;", "", "Lcom/huami/bluetooth/profile/channel/module/sleep/DataType;", "type", "", "a", "value", "encode", "decode", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class SleepDataCodec implements Codec<SleepData, byte[]> {

    @Deprecated
    public static final int FLAG_LEN = 4;

    @Deprecated
    public static final int RESTING_HR_LEN = 1;

    @Deprecated
    public static final int SLEEP_DUR_LEN = 2;

    @Deprecated
    public static final int SLEEP_SCORE_LEN = 1;

    @Deprecated
    public static final int SLEEP_STAGES_COUNT_LEN = 2;

    @Deprecated
    public static final int STAGES_LEN = 2;

    @Deprecated
    public static final int TIMESTAMP_LEN = 4;

    @NotNull
    private static final a a = new a(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0016\u0010\u0007\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0016\u0010\b\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0016\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0016\u0010\n\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0004¨\u0006\r"}, d2 = {"com/huami/bluetooth/profile/channel/module/sleep/impl/codec/SleepDataCodec$a", "", "", "FLAG_LEN", LogUtil.I, "RESTING_HR_LEN", "SLEEP_DUR_LEN", "SLEEP_SCORE_LEN", "SLEEP_STAGES_COUNT_LEN", "STAGES_LEN", "TIMESTAMP_LEN", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private final boolean a(SleepData sleepData, DataType dataType) {
        return sleepData.getDataFlag().isSupport(dataType);
    }

    @Override // com.huami.bluetooth.profile.channel.module.base.Codec
    @NotNull
    public SleepData decode(@NotNull byte[] value) {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // com.huami.bluetooth.profile.channel.module.base.Codec
    @NotNull
    public byte[] encode(@NotNull SleepData value) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(ByteUtilsKt.toByteArray(value.getTimestamp$bluetooth_release(), 4));
        byteArrayOutputStream.write(ByteUtilsKt.toByteArray(value.getUpdateTimestamp(), 4));
        byteArrayOutputStream.write(ProfileUtils.getTimezoneKey(value.getTimeZone()));
        byteArrayOutputStream.write(ByteUtilsKt.toByteArray(value.getDataFlag().getFlag$bluetooth_release(), 4));
        byteArrayOutputStream.write(ByteUtilsKt.toByteArray(value.getStart(), 2));
        byteArrayOutputStream.write(ByteUtilsKt.toByteArray(value.getStop(), 2));
        byteArrayOutputStream.write(ByteUtilsKt.toByteArray(value.getSleepDuration(), 2));
        if (a(value, DataType.SleepScore.INSTANCE)) {
            Integer sleepScore = value.getSleepScore();
            byteArrayOutputStream.write(ByteUtilsKt.toByteArray(sleepScore == null ? 0 : sleepScore.intValue(), 1));
        }
        if (a(value, DataType.RestingHr.INSTANCE)) {
            Integer restingHr = value.getRestingHr();
            byteArrayOutputStream.write(ByteUtilsKt.toByteArray(restingHr == null ? 0 : restingHr.intValue(), 1));
        }
        if (a(value, DataType.SleepStage.INSTANCE)) {
            List<SleepStage> stages = value.getStages();
            byteArrayOutputStream.write(ByteUtilsKt.toByteArray(stages != null ? stages.size() : 0, 2));
            List<SleepStage> stages2 = value.getStages();
            if (stages2 != null) {
                for (SleepStage sleepStage : stages2) {
                    byteArrayOutputStream.write(ByteUtilsKt.toByteArray(sleepStage.getStart(), 2));
                    byteArrayOutputStream.write(ByteUtilsKt.toByteArray(sleepStage.getStop(), 2));
                    byteArrayOutputStream.write(ByteUtilsKt.toByteArray(sleepStage.getStatus(), 2));
                }
            }
        }
        return byteArrayOutputStream.toByteArray();
    }
}

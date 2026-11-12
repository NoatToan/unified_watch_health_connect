package com.huami.sleep.api.converter;

import androidx.exifinterface.media.ExifInterface;
import com.huami.sleep.api.EventType;
import com.huami.sleep.api.SubType;
import com.huami.sleep.api.pojo.UserEventsItem;
import com.huami.sleep.daysleep.sleepstagechart.vo.SleepTagDataVo;
import com.huami.sleep.daysleep.sleepstagechart.vo.SleepTagInfo;
import com.huami.sleep.daysleep.sleepstagechart.vo.SleepUserTagInfo;
import com.huami.sleep.util.SerializationKtxKt;
import com.huami.tools.log.HMLog;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.json.Json;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ/\u0010\u0007\u001a\u00020\u0006\"\b\b\u0000\u0010\u0002*\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0005\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0007\u0010\bJ1\u0010\n\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0002*\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000e\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fJ\u000e\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\fJ\u0016\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0010J\u0016\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000eJ\u000e\u0010\u0016\u001a\u00020\u00152\u0006\u0010\r\u001a\u00020\u0010R\u0016\u0010\u0018\u001a\u00020\u00068\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\n\u0010\u0017¨\u0006\u001b"}, d2 = {"Lcom/huami/sleep/api/converter/DataTypeConverter;", "", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/serialization/KSerializer;", "kSerializer", "t", "", "b", "(Lkotlinx/serialization/KSerializer;Ljava/lang/Object;)Ljava/lang/String;", "jsonString", "a", "(Lkotlinx/serialization/KSerializer;Ljava/lang/String;)Ljava/lang/Object;", "Lcom/huami/sleep/api/pojo/UserEventsItem;", "info", "Lcom/huami/sleep/daysleep/sleepstagechart/vo/SleepUserTagInfo;", "convertToSleepUserTagInfo", "Lcom/huami/sleep/daysleep/sleepstagechart/vo/SleepTagInfo;", "convertToSleepSelfDefTagInfo", "uid", "convertToSleepSelfDefTagRequest", "convertToSleepTagRequest", "Lcom/huami/sleep/daysleep/sleepstagechart/vo/SleepTagDataVo;", "convertToSleepTagDataVo", "Ljava/lang/String;", "mTag", "<init>", "()V", "sleep_release"}, k = 1, mv = {1, 5, 1})
public final class DataTypeConverter {

    @NotNull
    public static final DataTypeConverter INSTANCE = new DataTypeConverter();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final String mTag = "DataTypeConverter";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0003\u001a\u0004\u0018\u00010\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n"}, d2 = {"", ExifInterface.GPS_DIRECTION_TRUE, "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ Throwable a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Throwable th) {
            super(0);
            this.a = th;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "解析json失败" + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0003\u001a\u0004\u0018\u00010\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n"}, d2 = {"", ExifInterface.GPS_DIRECTION_TRUE, "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ Throwable a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Throwable th) {
            super(0);
            this.a = th;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "转json失败" + this.a;
        }
    }

    private DataTypeConverter() {
    }

    private final <T> T a(KSerializer<T> kSerializer, String jsonString) {
        try {
            return (T) SerializationKtxKt.getNonStrictInstance(Json.INSTANCE).decodeFromString(kSerializer, jsonString);
        } catch (Throwable th) {
            HMLog.warn$default(mTag, null, new a(th), 2, null);
            return null;
        }
    }

    private final <T> String b(KSerializer<T> kSerializer, T t) {
        try {
            return SerializationKtxKt.getNonStrictInstance(Json.INSTANCE).encodeToString(kSerializer, t);
        } catch (Throwable th) {
            HMLog.warn$default(mTag, null, new b(th), 2, null);
            return "";
        }
    }

    @NotNull
    public final SleepTagInfo convertToSleepSelfDefTagInfo(@NotNull UserEventsItem info) {
        SleepTagInfo sleepTagInfo = info.getExtra() == null ? null : (SleepTagInfo) INSTANCE.a(SleepTagInfo.INSTANCE.serializer(), info.getExtra());
        return sleepTagInfo == null ? new SleepTagInfo((String) null, 0, 3, (DefaultConstructorMarker) null) : sleepTagInfo;
    }

    @NotNull
    public final UserEventsItem convertToSleepSelfDefTagRequest(@NotNull String uid, @NotNull SleepTagInfo info) {
        return new UserEventsItem(EventType.HEALTH_TAG_RECORD.getValue(), SubType.SLEEP_SELF_DEFINE.getValue(), System.currentTimeMillis(), uid, b(SleepTagInfo.INSTANCE.serializer(), info));
    }

    @NotNull
    public final SleepTagDataVo convertToSleepTagDataVo(@NotNull SleepTagInfo info) {
        return new SleepTagDataVo(info.getTag(), info.getTagType(), false);
    }

    @NotNull
    public final UserEventsItem convertToSleepTagRequest(@NotNull String uid, @NotNull SleepUserTagInfo info) {
        return new UserEventsItem(EventType.HEALTH_TAG_RECORD.getValue(), SubType.SLEEP_SIGN.getValue(), info.getTimestamp(), uid, b(SleepUserTagInfo.INSTANCE.serializer(), info));
    }

    @NotNull
    public final SleepUserTagInfo convertToSleepUserTagInfo(@NotNull UserEventsItem info) {
        SleepUserTagInfo sleepUserTagInfo = info.getExtra() == null ? null : (SleepUserTagInfo) INSTANCE.a(SleepUserTagInfo.INSTANCE.serializer(), info.getExtra());
        return sleepUserTagInfo == null ? new SleepUserTagInfo(0, 0, (String) null, 0, 0L, 31, (DefaultConstructorMarker) null) : sleepUserTagInfo;
    }
}

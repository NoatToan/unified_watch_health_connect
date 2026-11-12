package com.xiaomi.hm.health.healthtag.api.convert;

import androidx.exifinterface.media.ExifInterface;
import com.huami.stress.domain.utils.LogTagUtilsKt;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.healthdata.api.pojo.UserEventsItem;
import com.xiaomi.hm.health.healthdata.core.converter.DataTypeConverter;
import com.xiaomi.hm.health.healthtag.core.dto.TagInfoDto;
import com.xiaomi.hm.health.healthtag.core.dto.UserMakeTagDto;
import com.xiaomi.hm.health.utils.SerialzationKtxKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.json.Json;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ/\u0010\u0007\u001a\u00020\u0006\"\b\b\u0000\u0010\u0002*\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0005\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0007\u0010\bJ1\u0010\n\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0002*\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\u0013\u001a\u00020\u00122\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010J\u001e\u0010\u0013\u001a\u00020\u00122\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0014J\u000e\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012J\u000e\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u0012R\u001e\u0010\u0019\u001a\n \u0017*\u0004\u0018\u00010\u00060\u00068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0018¨\u0006\u001c"}, d2 = {"Lcom/xiaomi/hm/health/healthtag/api/convert/DataTypeConvert;", "", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/serialization/KSerializer;", "kSerializer", "t", "", "b", "(Lkotlinx/serialization/KSerializer;Ljava/lang/Object;)Ljava/lang/String;", "jsonString", "a", "(Lkotlinx/serialization/KSerializer;Ljava/lang/String;)Ljava/lang/Object;", "uid", "subType", "", "timeStamp", "Lcom/xiaomi/hm/health/healthtag/core/dto/UserMakeTagDto;", "info", "Lcom/xiaomi/hm/health/healthdata/api/pojo/UserEventsItem;", "convert2Request", "Lcom/xiaomi/hm/health/healthtag/core/dto/TagInfoDto;", "convert2UserMakeTagDto", "convert2TagInfoDto", "kotlin.jvm.PlatformType", "Ljava/lang/String;", "tag", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class DataTypeConvert {

    @NotNull
    public static final DataTypeConvert INSTANCE;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private static final String tag;

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

    static {
        DataTypeConvert dataTypeConvert = new DataTypeConvert();
        INSTANCE = dataTypeConvert;
        tag = dataTypeConvert.getClass().getSimpleName();
    }

    private DataTypeConvert() {
    }

    private final <T> T a(KSerializer<T> kSerializer, String jsonString) {
        try {
            return (T) SerialzationKtxKt.getNonStrictInstance(Json.INSTANCE).decodeFromString(kSerializer, jsonString);
        } catch (Throwable th) {
            HMLog.warn$default(LogTagUtilsKt.getTAG(DataTypeConverter.INSTANCE), null, new a(th), 2, null);
            return null;
        }
    }

    private final <T> String b(KSerializer<T> kSerializer, T t) {
        try {
            return SerialzationKtxKt.getNonStrictInstance(Json.INSTANCE).encodeToString(kSerializer, t);
        } catch (Throwable th) {
            HMLog.warn$default(LogTagUtilsKt.getTAG(DataTypeConverter.INSTANCE), null, new b(th), 2, null);
            return "";
        }
    }

    @NotNull
    public final UserEventsItem convert2Request(@NotNull String uid, @NotNull String subType, long timeStamp, @NotNull UserMakeTagDto info) {
        return new UserEventsItem("HealthTagRecord", 0L, subType, timeStamp, uid, b(UserMakeTagDto.INSTANCE.serializer(), info), (Integer) null, (Integer) null, (Float) null, (Integer) null, (String) null, (Integer) null, (String) null, (String) null, (String) null, 32706, (DefaultConstructorMarker) null);
    }

    @NotNull
    public final TagInfoDto convert2TagInfoDto(@NotNull UserEventsItem info) {
        TagInfoDto tagInfoDto = info.getExtra() == null ? null : (TagInfoDto) INSTANCE.a(TagInfoDto.INSTANCE.serializer(), info.getExtra());
        return tagInfoDto == null ? new TagInfoDto((String) null, 0, 3, (DefaultConstructorMarker) null) : tagInfoDto;
    }

    @NotNull
    public final UserMakeTagDto convert2UserMakeTagDto(@NotNull UserEventsItem info) {
        UserMakeTagDto userMakeTagDto = info.getExtra() == null ? null : (UserMakeTagDto) INSTANCE.a(UserMakeTagDto.INSTANCE.serializer(), info.getExtra());
        return userMakeTagDto == null ? new UserMakeTagDto(0, 0, (String) null, 0, 15, (DefaultConstructorMarker) null) : userMakeTagDto;
    }

    @NotNull
    public final UserEventsItem convert2Request(@NotNull String uid, @NotNull String subType, @NotNull TagInfoDto info) {
        return new UserEventsItem("HealthTagRecord", 0L, subType, 0L, uid, b(TagInfoDto.INSTANCE.serializer(), info), (Integer) null, (Integer) null, (Float) null, (Integer) null, (String) null, (Integer) null, (String) null, (String) null, (String) null, 32714, (DefaultConstructorMarker) null);
    }
}

package com.huami.pai.web;

import androidx.core.graphics.drawable.IconCompat;
import com.xiaomi.hm.health.training.api.constant.TrainingWebConst;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializer;
import kotlinx.serialization.descriptors.PrimitiveKind;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptorsKt;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u0000 \u00142\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0014B\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0002H\u0016R\u001c\u0010\u0011\u001a\u00020\f8\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0015"}, d2 = {"Lcom/huami/pai/web/CalendarDaySerializer;", "Lkotlinx/serialization/KSerializer;", "", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Long;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", IconCompat.EXTRA_OBJ, "", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "a", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "Companion", "lib_release"}, k = 1, mv = {1, 5, 1})
@Serializer(forClass = String.class)
public final class CalendarDaySerializer implements KSerializer<Long> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Regex b = new Regex("(\\d{4}-\\d{1,2}-\\d{1,2}).+");

    @NotNull
    private static final SimpleDateFormat c = new SimpleDateFormat("yyyy-MM-dd", Locale.CHINA);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final SerialDescriptor descriptor = SerialDescriptorsKt.PrimitiveSerialDescriptor("CalendarDaySerializer", PrimitiveKind.LONG.INSTANCE);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0004R\u0016\u0010\u0007\u001a\u00020\b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\tR\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/huami/pai/web/CalendarDaySerializer$Companion;", "", "", "calendarString", "", "parse", "time", TrainingWebConst.QueryParam.VIDEO_FORMAT, "Ljava/text/SimpleDateFormat;", "Ljava/text/SimpleDateFormat;", "Lkotlin/text/Regex;", "pattern", "Lkotlin/text/Regex;", "<init>", "()V", "lib_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final String format(long time) {
            return CalendarDaySerializer.c.format(Long.valueOf(time));
        }

        public final long parse(@NotNull String calendarString) {
            Date date;
            List<String> groupValues;
            String str = null;
            MatchResult matchResultFind$default = Regex.find$default(CalendarDaySerializer.b, calendarString, 0, 2, null);
            if (matchResultFind$default != null && (groupValues = matchResultFind$default.getGroupValues()) != null) {
                str = (String) CollectionsKt.getOrNull(groupValues, 1);
            }
            if (str == null || (date = CalendarDaySerializer.c.parse(str)) == null) {
                return 0L;
            }
            return date.getTime();
        }
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    @NotNull
    public SerialDescriptor getDescriptor() {
        return this.descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        serialize(encoder, ((Number) obj).longValue());
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    @NotNull
    public Long deserialize(@NotNull Decoder decoder) {
        return Long.valueOf(INSTANCE.parse(decoder.decodeString()));
    }

    public void serialize(@NotNull Encoder encoder, long obj) {
        encoder.encodeString(INSTANCE.format(obj));
    }
}

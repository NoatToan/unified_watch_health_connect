package com.xiaomi.hm.health.bt.profile.gdsp.breathrate;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.bluetooth.utils.ByteUtilsKt;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bt.profile.base.ProfileUtils;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.serialization.json.internal.JsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\n"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/breathrate/BreathRateEventParser;", "", "", "data", "", "Lcom/xiaomi/hm/health/bt/profile/gdsp/breathrate/BreathRateEvent;", "parse", "<init>", "()V", "a", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class BreathRateEventParser {

    @Deprecated
    public static final int ACC_UNIT_LEN = 192;

    @Deprecated
    public static final int BYTE_SIZE_ACC_UNIT = 2;

    @Deprecated
    public static final int BYTE_SIZE_PEAK_UNIT = 2;

    @Deprecated
    public static final int BYTE_SIZE_TIMESTAMP = 4;

    @Deprecated
    public static final int BYTE_SIZE_TIMEZONE = 1;

    @Deprecated
    public static final int DATA_UNIT_SIZE = 569;

    @Deprecated
    public static final int PEAK_UNIT_LEN = 90;

    @Deprecated
    @NotNull
    public static final String TAG = "BreathRateEventParser";

    @NotNull
    private static final a a = new a(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0016\u0010\u0007\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0016\u0010\b\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0016\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0016\u0010\n\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0016\u0010\f\u001a\u00020\u000b8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"com/xiaomi/hm/health/bt/profile/gdsp/breathrate/BreathRateEventParser$a", "", "", "ACC_UNIT_LEN", LogUtil.I, "BYTE_SIZE_ACC_UNIT", "BYTE_SIZE_PEAK_UNIT", "BYTE_SIZE_TIMESTAMP", "BYTE_SIZE_TIMEZONE", "DATA_UNIT_SIZE", "PEAK_UNIT_LEN", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ SimpleDateFormat a;
        public final /* synthetic */ Calendar b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(SimpleDateFormat simpleDateFormat, Calendar calendar) {
            super(0);
            this.a = simpleDateFormat;
            this.b = calendar;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "Time: " + ((Object) this.a.format(this.b.getTime())) + JsonLexerKt.BEGIN_LIST + ((Object) this.b.getTimeZone().getID()) + JsonLexerKt.END_LIST;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ byte[] a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(byte[] bArr) {
            super(0);
            this.a = bArr;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("Parser warn size! - ", Integer.valueOf(this.a.length));
        }
    }

    @NotNull
    public final List<BreathRateEvent> parse(@NotNull byte[] data) {
        if (data.length < 569) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault());
        int length = data.length / DATA_UNIT_SIZE;
        for (int i = 0; i < length; i++) {
            int i2 = i * DATA_UNIT_SIZE;
            byte[] bArrCopyOfRange = ArraysKt___ArraysJvmKt.copyOfRange(data, i2, i2 + DATA_UNIT_SIZE);
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(ByteUtilsKt.toLong$default(bArrCopyOfRange, 4, 0, 2, null) * ((long) 1000));
            calendar.setTimeZone(ProfileUtils.getTimezone(bArrCopyOfRange[4]));
            HMLog.info(TAG, new b(simpleDateFormat, calendar));
            arrayList.add(new BreathRateEvent(calendar, bArrCopyOfRange));
        }
        if (data.length % DATA_UNIT_SIZE > 0) {
            HMLog.warn$default(TAG, null, new c(data), 2, null);
        }
        return arrayList;
    }
}

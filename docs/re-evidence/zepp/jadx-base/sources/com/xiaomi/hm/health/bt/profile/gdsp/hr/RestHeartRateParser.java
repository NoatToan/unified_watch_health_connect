package com.xiaomi.hm.health.bt.profile.gdsp.hr;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.bluetooth.utils.ByteUtilsKt;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bt.profile.base.ProfileUtils;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\n"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/hr/RestHeartRateParser;", "", "", "data", "", "Lcom/xiaomi/hm/health/bt/profile/gdsp/hr/RestHeartRate;", "parse", "<init>", "()V", "a", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class RestHeartRateParser {

    @Deprecated
    public static final int BYTE_SIZE_TIMESTAMP = 4;

    @Deprecated
    public static final int BYTE_SIZE_TIMEZONE = 1;

    @Deprecated
    public static final int BYTE_SIZE_VALUE = 1;

    @Deprecated
    public static final int DATA_UNIT_SIZE = 6;

    @Deprecated
    @NotNull
    public static final String TAG = "RestHeartRateParser";

    @NotNull
    private static final a a = new a(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0016\u0010\u0007\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0016\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"com/xiaomi/hm/health/bt/profile/gdsp/hr/RestHeartRateParser$a", "", "", "BYTE_SIZE_TIMESTAMP", LogUtil.I, "BYTE_SIZE_TIMEZONE", "BYTE_SIZE_VALUE", "DATA_UNIT_SIZE", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ byte[] a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(byte[] bArr) {
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
    public final List<RestHeartRate> parse(@NotNull byte[] data) {
        if (data.length < 6) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        int length = data.length / 6;
        for (int i = 0; i < length; i++) {
            Calendar calendar = Calendar.getInstance();
            int i2 = i * 6;
            calendar.setTimeInMillis(ByteUtilsKt.toLong(data, 4, i2) * ((long) 1000));
            int i3 = i2 + 4;
            calendar.setTimeZone(ProfileUtils.getTimezone(data[i3]));
            arrayList.add(new RestHeartRate(calendar, ByteUtilsKt.toInt(data, 1, i3 + 1)));
        }
        if (data.length % 6 > 0) {
            HMLog.warn$default("RestHeartRateParser", null, new b(data), 2, null);
        }
        return arrayList;
    }
}

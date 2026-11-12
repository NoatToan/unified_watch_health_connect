package com.xiaomi.hm.health.bt.profile.gdsp.hr;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.bluetooth.utils.ByteUtilsKt;
import com.huami.tools.log.HMLog;
import java.util.ArrayList;
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
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\n"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/hr/HighOrLowHrNotificationParser;", "", "", "data", "", "Lcom/xiaomi/hm/health/bt/profile/gdsp/hr/HighOrLowHrNotificationData;", "parse", "<init>", "()V", "a", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class HighOrLowHrNotificationParser {

    @Deprecated
    public static final int BYTE_SIZE_THRESHOLD = 1;

    @Deprecated
    public static final int BYTE_SIZE_TIMESTAMP = 4;

    @Deprecated
    public static final int BYTE_SIZE_VALUE = 1;

    @Deprecated
    public static final int BYTE_VALUE_LENGTH = 10;

    @Deprecated
    public static final int DATA_UNIT_SIZE = 15;

    @Deprecated
    @NotNull
    public static final String TAG = "HighOrLowHrNotificationParser";

    @NotNull
    private static final a a = new a(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rR\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0016\u0010\u0007\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0016\u0010\b\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0016\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"com/xiaomi/hm/health/bt/profile/gdsp/hr/HighOrLowHrNotificationParser$a", "", "", "BYTE_SIZE_THRESHOLD", LogUtil.I, "BYTE_SIZE_TIMESTAMP", "BYTE_SIZE_VALUE", "BYTE_VALUE_LENGTH", "DATA_UNIT_SIZE", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
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
            return Intrinsics.stringPlus("HighOrLowHrNotificationData warn size! - ", Integer.valueOf(this.a.length));
        }
    }

    @NotNull
    public final List<HighOrLowHrNotificationData> parse(@NotNull byte[] data) {
        if (data.length < 15) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        int length = data.length / 15;
        for (int i = 0; i < length; i++) {
            int i2 = i * 15;
            long j = ByteUtilsKt.toLong(data, 4, i2) * ((long) 1000);
            int i3 = i2 + 4;
            int i4 = ByteUtilsKt.toInt(data, 1, i3);
            int i5 = 0;
            while (true) {
                int i6 = i5 + 1;
                arrayList.add(new HighOrLowHrNotificationData(j - ((long) ((((10 - i5) - 1) * 60) * 1000)), i4, ByteUtilsKt.toInt(data, 1, i3 + 1 + (i5 * 1))));
                if (i6 >= 10) {
                    break;
                }
                i5 = i6;
            }
        }
        if (data.length % 15 > 0) {
            HMLog.warn$default(TAG, null, new b(data), 2, null);
        }
        return arrayList;
    }
}

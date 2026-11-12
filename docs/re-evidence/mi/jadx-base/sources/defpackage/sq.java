package defpackage;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.hm.health.bt.profile.base.ProfileUtils;
import com.xiaomi.hm.health.bt.profile.gdsp.hr.RestHeartRate;
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

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\t"}, d2 = {"Lsq;", "", "", "data", "", "Lcom/xiaomi/hm/health/bt/profile/gdsp/hr/RestHeartRate;", PluginDeviceInfo.FMODEL, "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final class sq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f33875a = new a(null);

    @Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\t\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lsq$a;", "", "", "BYTE_SIZE_TIMESTAMP", "I", "BYTE_SIZE_TIMEZONE", "BYTE_SIZE_VALUE", "DATA_UNIT_SIZE", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", PluginDeviceInfo.FMODEL, "()Ljava/lang/String;"}, k = 3, mv = {1, 7, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ byte[] t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(byte[] bArr) {
            super(0);
            this.t = bArr;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Parser warn size! - " + this.t.length;
        }
    }

    @NotNull
    public final List<RestHeartRate> a(@NotNull byte[] data) {
        Intrinsics.checkNotNullParameter(data, "data");
        if (data.length < 6) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        int length = data.length / 6;
        for (int i = 0; i < length; i++) {
            Calendar calendar = Calendar.getInstance();
            int i2 = i * 6;
            calendar.setTimeInMillis(c3.b(data, 4, i2) * ((long) 1000));
            calendar.setTimeZone(ProfileUtils.getTimezone(data[i2 + 4]));
            Intrinsics.checkNotNullExpressionValue(calendar, "calendar");
            arrayList.add(new RestHeartRate(calendar, c3.a(data, 1, i2 + 5)));
        }
        if (data.length % 6 > 0) {
            le.a("RestHeartRateParser", (Throwable) null, new b(data), 2, (Object) null);
        }
        return arrayList;
    }
}

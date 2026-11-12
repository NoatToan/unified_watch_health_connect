package defpackage;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.hm.health.bt.profile.gdsp.spo2.LowOsaNotificationData;
import com.xiaomi.hm.health.bt.profile.gdsp.spo2.LowOsaValue;
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

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\t"}, d2 = {"Lvk;", "", "", "data", "", "Lcom/xiaomi/hm/health/bt/profile/gdsp/spo2/LowOsaNotificationData;", PluginDeviceInfo.FMODEL, "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final class vk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f36967a = new a(null);

    @Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0014\u0010\n\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004R\u0014\u0010\f\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0004R\u0014\u0010\r\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0004R\u0014\u0010\u000f\u001a\u00020\u000e8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lvk$a;", "", "", "BYTE_LENGTH_AVG_OSA_PER_MIN", "I", "BYTE_LENGTH_OSA_VALUE", "BYTE_LENGTH_REALTIME_OSA", "BYTE_SIZE_END_TIME", "BYTE_SIZE_START_TIME", "BYTE_SIZE_THRESHOLD", "BYTE_SIZE_TIMESTAMP", "BYTE_SIZE_VALUE", "DATA_ITEM_SIZE", "DATA_UNIT_SIZE", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
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
            return "LowOsaNotificationData warn size! - " + this.t.length;
        }
    }

    @NotNull
    public final List<LowOsaNotificationData> a(@NotNull byte[] data) {
        long j;
        int i;
        int i2;
        Intrinsics.checkNotNullParameter(data, "data");
        if (data.length < 312) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        int length = data.length / 312;
        int i3 = 0;
        while (i3 < length) {
            int i4 = i3 * 312;
            int i5 = 4;
            long j2 = 1000;
            long jB = c3.b(data, 4, i4) * j2;
            long jB2 = c3.b(data, 4, i4 + 4) * j2;
            long jB3 = c3.b(data, 4, i4 + 8);
            int i6 = i4 + 12;
            ArrayList arrayList2 = new ArrayList();
            int i7 = 0;
            while (true) {
                j = 0;
                i = 1;
                if (i7 >= 40) {
                    break;
                }
                int i8 = length;
                long jB4 = c3.b(data, 4, i6);
                int iA = c3.a(data, 1, i6 + 4);
                i6 += 5;
                if (jB4 > 0 && iA > 0) {
                    arrayList2.add(new LowOsaValue(jB4, iA));
                }
                i7++;
                length = i8;
            }
            int i9 = length;
            ArrayList arrayList3 = new ArrayList();
            int i10 = 0;
            while (true) {
                if (i10 >= 10) {
                    break;
                }
                long jB5 = c3.b(data, i5, i6);
                int iA2 = c3.a(data, 1, i6 + 4);
                i6 += 5;
                if (jB5 > j && iA2 > 0) {
                    arrayList3.add(new LowOsaValue(jB5, iA2));
                }
                i10++;
                i5 = 4;
                j = 0;
            }
            ArrayList arrayList4 = new ArrayList();
            int i11 = 0;
            for (i2 = 10; i11 < i2; i2 = 10) {
                long jB6 = c3.b(data, 4, i6);
                int iA3 = c3.a(data, i, i6 + 4);
                i6 += 5;
                if (jB6 > 0 && iA3 > 0) {
                    arrayList4.add(new LowOsaValue(jB6, iA3));
                }
                i11++;
                i = 1;
            }
            arrayList.add(new LowOsaNotificationData(jB, jB2, jB3, arrayList2, arrayList3, arrayList4));
            i3++;
            length = i9;
        }
        if (data.length % 312 > 0) {
            le.a("LowOsaNotificationParser", (Throwable) null, new b(data), 2, (Object) null);
        }
        return arrayList;
    }
}

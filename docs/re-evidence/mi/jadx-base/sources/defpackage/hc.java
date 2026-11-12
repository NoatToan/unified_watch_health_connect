package defpackage;

import com.miui.circulate.device.api.Constant;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.hm.health.bt.profile.base.ProfileUtils;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001:\u0001\bB\u001b\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ)\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000b2\u0006\u0010\u0006\u001a\u00020\n¢\u0006\u0004\b\b\u0010\fR\"\u0010\u000e\u001a\u00020\r8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R&\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\b\u0010\u0017¨\u0006\u001d"}, d2 = {"Lhc;", "Lf1;", "", "Lvzs;", "Lf4s;", "header", "data", "Ljava/util/Calendar;", PluginDeviceInfo.FMODEL, "(Lf4s;Ljava/util/List;)Ljava/util/Calendar;", "", "Ljava/util/ArrayList;", "([B)Ljava/util/ArrayList;", "", "isLoop", "Z", Constant.KeyValue.KEY_COLUMN, "()Z", "setLoop", "(Z)V", "Lbi;", "dataReceiver", "Lbi;", "()Lbi;", "startTime", "", "gdspVersion", "<init>", "(Ljava/util/Calendar;I)V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final class hc extends f1<List<? extends vzs>> {

    @NotNull
    public static final a j = new a(null);
    public boolean h;

    @NotNull
    public final bi<List<vzs>> i;

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lhc$a;", "", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(d1 = {"\u0000\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001J\u0015\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"hc$b", "Le1;", "", "Lvzs;", PluginDeviceInfo.FICONOFFLINE, "()Ljava/util/List;", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class b extends e1<List<? extends vzs>> {
        public b() {
        }

        @Override // defpackage.bi
        @NotNull
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public List<vzs> b() {
            f4s v = getV();
            if (v != null) {
                if (v.f17407b <= 0) {
                    v = null;
                }
                if (v != null) {
                    hc hcVar = hc.this;
                    byte[] byteArray = d().toByteArray();
                    Intrinsics.checkNotNullExpressionValue(byteArray, "mDataStream.toByteArray()");
                    ArrayList<vzs> arrayListA = hcVar.a(byteArray);
                    if (arrayListA != null) {
                        return arrayListA;
                    }
                }
            }
            return CollectionsKt__CollectionsKt.emptyList();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hc(@NotNull Calendar startTime, int i) {
        super(startTime, 2, i);
        Intrinsics.checkNotNullParameter(startTime, "startTime");
        this.i = new b();
    }

    @Override // defpackage.f1
    @Nullable
    public Calendar a(@Nullable f4s header, @NotNull List<? extends vzs> data) {
        Intrinsics.checkNotNullParameter(data, "data");
        return null;
    }

    @Override // defpackage.f1
    /* JADX INFO: renamed from: k, reason: from getter */
    public boolean getH() {
        return this.h;
    }

    @Override // defpackage.f1
    @NotNull
    public bi<List<? extends vzs>> a() {
        return this.i;
    }

    @Nullable
    public final synchronized ArrayList<vzs> a(@NotNull byte[] data) {
        Intrinsics.checkNotNullParameter(data, "data");
        ArrayList<vzs> arrayList = new ArrayList<>();
        int length = data.length;
        if (length % 6 != 0) {
            return arrayList;
        }
        for (int i = 0; i < length; i += 6) {
            int i2 = (data[i] & 255) | ((data[i + 1] & 255) << 8) | ((data[i + 2] & 255) << 16) | ((data[i + 3] & 255) << 24);
            byte b2 = data[i + 4];
            int i3 = data[i + 5] & 255;
            long j2 = ((long) i2) * 1000;
            Calendar calendar = Calendar.getInstance(ProfileUtils.getTimezone(b2));
            calendar.setTimeInMillis(j2);
            t5t.d("GdspProHrParam", "HR_Log Key-Manual:" + i3 + '(' + calendar.getTime() + ')');
            arrayList.add(new vzs(calendar, i3));
        }
        return arrayList;
    }
}

package defpackage;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import java.util.Calendar;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001:\u0001\u0007B\u001b\u0012\b\b\u0002\u0010\r\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J%\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bR\"\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\u0007\u0010\f¨\u0006\u0012"}, d2 = {"Lcc;", "Lf1;", "Ludt;", "Lf4s;", "header", "data", "Ljava/util/Calendar;", PluginDeviceInfo.FMODEL, "(Lf4s;Ludt;)Ljava/util/Calendar;", "Lbi;", "dataReceiver", "Lbi;", "()Lbi;", "startTime", "", "gdspVersion", "<init>", "(Ljava/util/Calendar;I)V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final class cc extends f1<udt> {

    @NotNull
    public static final a i = new a(null);

    @NotNull
    public final bi<udt> h;

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcc$a;", "", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u0011\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"cc$b", "Le1;", "Ludt;", PluginDeviceInfo.FICONOFFLINE, "()Ludt;", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class b extends e1<udt> {
        @Override // defpackage.bi
        @Nullable
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public udt b() {
            f4s u = getU();
            if (u == null) {
                return null;
            }
            if (u.f17407b <= 0) {
                u = null;
            }
            if (u == null) {
                return null;
            }
            try {
                return egs.i(d().toByteArray());
            } catch (Exception e) {
                t5t.d("GdspPaiParam", e.getMessage());
                return null;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cc(@NotNull Calendar startTime, int i2) {
        super(startTime, 13, i2);
        Intrinsics.checkNotNullParameter(startTime, "startTime");
        this.h = new b();
    }

    @Override // defpackage.f1
    @NotNull
    public bi<udt> a() {
        return this.h;
    }

    @Override // defpackage.f1
    @Nullable
    public Calendar a(@Nullable f4s header, @Nullable udt data) {
        if (header == null) {
            return getF17275a();
        }
        if (data == null) {
            return null;
        }
        boolean z = data.S() == 1;
        if (z) {
            t5t.d("HMSyncPaiDataTask", "return as realtime pai data!!!");
        }
        if (!(!z)) {
            data = null;
        }
        if (data == null) {
            return null;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(data.P() + ((long) 60000));
        return calendar;
    }
}

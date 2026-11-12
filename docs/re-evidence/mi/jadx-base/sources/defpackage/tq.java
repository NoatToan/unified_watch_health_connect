package defpackage;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.hm.health.bt.profile.gdsp.hr.RestHeartRate;
import com.xiaomi.onetrack.b.e;
import java.util.Calendar;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u0007¢\u0006\u0004\b\u0015\u0010\u0016J)\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\b\u0010\tR&\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\b\u0010\rR\u001b\u0010\u0013\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0017"}, d2 = {"Ltq;", "Lf1;", "", "Lcom/xiaomi/hm/health/bt/profile/gdsp/hr/RestHeartRate;", "Lf4s;", "header", "data", "Ljava/util/Calendar;", PluginDeviceInfo.FMODEL, "(Lf4s;Ljava/util/List;)Ljava/util/Calendar;", "Lbi;", "dataReceiver", "Lbi;", "()Lbi;", "Lsq;", "parser$delegate", "Lkotlin/Lazy;", e.f13808a, "()Lsq;", "parser", "startTime", "<init>", "(Ljava/util/Calendar;)V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final class tq extends f1<List<? extends RestHeartRate>> {

    @NotNull
    public final Lazy h;

    @NotNull
    public final bi<List<RestHeartRate>> i;

    @Metadata(bv = {}, d1 = {"\u0000\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¨\u0006\u0005"}, d2 = {"tq$a", "Le1;", "", "Lcom/xiaomi/hm/health/bt/profile/gdsp/hr/RestHeartRate;", PluginDeviceInfo.FICONOFFLINE, "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class a extends e1<List<? extends RestHeartRate>> {
        public a() {
        }

        @Override // defpackage.bi
        @NotNull
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public List<RestHeartRate> b() {
            if (getV() == null) {
                return CollectionsKt__CollectionsKt.emptyList();
            }
            sq sqVarL = tq.this.l();
            byte[] byteArray = d().toByteArray();
            Intrinsics.checkNotNullExpressionValue(byteArray, "mDataStream.toByteArray()");
            return sqVarL.a(byteArray);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lsq;", PluginDeviceInfo.FMODEL, "()Lsq;"}, k = 3, mv = {1, 7, 1})
    public static final class b extends Lambda implements Function0<sq> {
        public static final b t = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final sq invoke() {
            return new sq();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tq(@NotNull Calendar startTime) {
        super(startTime, 58, 0, 4, null);
        Intrinsics.checkNotNullParameter(startTime, "startTime");
        this.h = LazyKt__LazyJVMKt.lazy(b.t);
        this.i = new a();
    }

    public final sq l() {
        return (sq) this.h.getValue();
    }

    @Override // defpackage.f1
    public /* bridge */ /* synthetic */ Calendar a(f4s f4sVar, List<? extends RestHeartRate> list) {
        return a2(f4sVar, (List<RestHeartRate>) list);
    }

    @Override // defpackage.f1
    @NotNull
    public bi<List<? extends RestHeartRate>> a() {
        return this.i;
    }

    @Nullable
    /* JADX INFO: renamed from: a, reason: avoid collision after fix types in other method */
    public Calendar a2(@Nullable f4s header, @NotNull List<RestHeartRate> data) {
        Intrinsics.checkNotNullParameter(data, "data");
        RestHeartRate restHeartRate = (RestHeartRate) CollectionsKt___CollectionsKt.lastOrNull((List) data);
        if (restHeartRate == null) {
            return null;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(restHeartRate.getCalendar().getTimeInMillis() + ((long) 1000));
        return calendar;
    }
}

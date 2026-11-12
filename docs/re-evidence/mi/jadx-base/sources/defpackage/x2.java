package defpackage;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.RtSpo2Info;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.SportRtPressure;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.SportRtTemperature;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000.\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u00052\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003\u001a\u001c\u0010\t\u001a\u00020\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00002\u0006\u0010\u0004\u001a\u00020\u0003\u001a\u001c\u0010\f\u001a\u00020\u00052\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00002\u0006\u0010\u0004\u001a\u00020\u0003\u001a@\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\u0000\"\u0004\b\u0000\u0010\r\"\u0004\b\u0001\u0010\u000e*\b\u0012\u0004\u0012\u00028\u00000\u00002\u001a\u0010\u0010\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000fH\u0002¨\u0006\u0011"}, d2 = {"", "Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/RtSpo2Info;", "spo2List", "", "trackId", "", PluginDeviceInfo.FDESC, "Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/SportRtPressure;", "pressureList", PluginDeviceInfo.FMODEL, "Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/SportRtTemperature;", "temperatureList", PluginDeviceInfo.FICONON, "T", "R", "Lkotlin/Function2;", "transform", "btData_wearRelease"}, k = 2, mv = {1, 7, 1})
public final class x2 {

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0003\u001a\u00020\u00002\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/SportRtPressure;", "previous", "current", PluginDeviceInfo.FMODEL, "(Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/SportRtPressure;Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/SportRtPressure;)Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/SportRtPressure;"}, k = 3, mv = {1, 7, 1})
    public static final class a extends Lambda implements Function2<SportRtPressure, SportRtPressure, SportRtPressure> {
        public final /* synthetic */ long t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(long j) {
            super(2);
            this.t = j;
        }

        @Override // kotlin.jvm.functions.Function2
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SportRtPressure invoke(@Nullable SportRtPressure sportRtPressure, @NotNull SportRtPressure current) {
            Intrinsics.checkNotNullParameter(current, "current");
            if (sportRtPressure == null) {
                return new SportRtPressure((current.getTime() / ((long) 1000)) - this.t, current.getPressure());
            }
            long j = 1000;
            return new SportRtPressure((current.getTime() / j) - (sportRtPressure.getTime() / j), current.getPressure() - sportRtPressure.getPressure());
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/SportRtPressure;", "it", "", PluginDeviceInfo.FMODEL, "(Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/SportRtPressure;)Ljava/lang/CharSequence;"}, k = 3, mv = {1, 7, 1})
    public static final class b extends Lambda implements Function1<SportRtPressure, CharSequence> {
        public static final b t = new b();

        public b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke2(@NotNull SportRtPressure it) {
            Intrinsics.checkNotNullParameter(it, "it");
            StringBuilder sb = new StringBuilder();
            sb.append(it.getTime());
            sb.append(',');
            sb.append(it.getPressure());
            return sb.toString();
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0003\u001a\u00020\u00002\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/SportRtTemperature;", "previous", "current", PluginDeviceInfo.FMODEL, "(Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/SportRtTemperature;Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/SportRtTemperature;)Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/SportRtTemperature;"}, k = 3, mv = {1, 7, 1})
    public static final class c extends Lambda implements Function2<SportRtTemperature, SportRtTemperature, SportRtTemperature> {
        public final /* synthetic */ long t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(long j) {
            super(2);
            this.t = j;
        }

        @Override // kotlin.jvm.functions.Function2
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SportRtTemperature invoke(@Nullable SportRtTemperature sportRtTemperature, @NotNull SportRtTemperature current) {
            Intrinsics.checkNotNullParameter(current, "current");
            if (sportRtTemperature == null) {
                return new SportRtTemperature((current.getTime() / ((long) 1000)) - this.t, current.getTemperature());
            }
            long j = 1000;
            return new SportRtTemperature((current.getTime() / j) - (sportRtTemperature.getTime() / j), current.getTemperature() - sportRtTemperature.getTemperature());
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/SportRtTemperature;", "it", "", PluginDeviceInfo.FMODEL, "(Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/SportRtTemperature;)Ljava/lang/CharSequence;"}, k = 3, mv = {1, 7, 1})
    public static final class d extends Lambda implements Function1<SportRtTemperature, CharSequence> {
        public static final d t = new d();

        public d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke2(@NotNull SportRtTemperature it) {
            Intrinsics.checkNotNullParameter(it, "it");
            StringBuilder sb = new StringBuilder();
            sb.append(it.getTime());
            sb.append(',');
            sb.append(it.getTemperature());
            return sb.toString();
        }
    }

    @NotNull
    public static final String a(@NotNull List<SportRtPressure> pressureList, long j) {
        Intrinsics.checkNotNullParameter(pressureList, "pressureList");
        return pressureList.isEmpty() ? "" : CollectionsKt___CollectionsKt.joinToString$default(a(pressureList, new a(j)), ";", null, null, 0, null, b.t, 30, null);
    }

    @Nullable
    public static final String b(@NotNull List<RtSpo2Info> spo2List, long j) {
        Intrinsics.checkNotNullParameter(spo2List, "spo2List");
        StringBuilder sb = new StringBuilder();
        if (spo2List.isEmpty()) {
            return sb.toString();
        }
        RtSpo2Info rtSpo2Info = (RtSpo2Info) CollectionsKt___CollectionsKt.first((List) spo2List);
        long j2 = 1000;
        sb.append((rtSpo2Info.getTime() / j2) - j);
        sb.append(",");
        sb.append(rtSpo2Info.getSpo2());
        int size = spo2List.size();
        for (int i = 1; i < size; i++) {
            RtSpo2Info rtSpo2Info2 = spo2List.get(i);
            RtSpo2Info rtSpo2Info3 = spo2List.get(i - 1);
            long time = (rtSpo2Info2.getTime() / j2) - (rtSpo2Info3.getTime() / j2);
            sb.append(";");
            sb.append(time == 1 ? "" : Long.valueOf(time));
            sb.append(",");
            sb.append(rtSpo2Info2.getSpo2() - rtSpo2Info3.getSpo2());
        }
        return sb.toString();
    }

    @NotNull
    public static final String c(@NotNull List<SportRtTemperature> temperatureList, long j) {
        Intrinsics.checkNotNullParameter(temperatureList, "temperatureList");
        return temperatureList.isEmpty() ? "" : CollectionsKt___CollectionsKt.joinToString$default(a(temperatureList, new c(j)), ";", null, null, 0, null, d.t, 30, null);
    }

    public static final <T, R> List<R> a(List<? extends T> list, Function2<? super T, ? super T, ? extends R> function2) {
        ArrayList arrayList = new ArrayList(list.size());
        ListIterator<? extends T> listIterator = list.listIterator();
        a0.a aVar = null;
        while (listIterator.hasNext()) {
            T next = listIterator.next();
            Unit unit = Unit.INSTANCE;
            arrayList.add(function2.invoke(aVar, next));
            aVar = next;
        }
        return arrayList;
    }
}

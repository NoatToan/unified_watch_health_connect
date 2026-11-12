package com.xiaomi.hm.health.device.callback;

import androidx.exifinterface.media.ExifInterface;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.AltitudePoint;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.GolfRtInfo;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.RtPowerInfo;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.RtSpo2Info;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.SportRtPressure;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.SportRtTemperature;
import defpackage.a05;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u00052\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003\u001a\u001c\u0010\t\u001a\u00020\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00002\u0006\u0010\u0004\u001a\u00020\u0003\u001a\u001c\u0010\f\u001a\u00020\u00052\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00002\u0006\u0010\u0004\u001a\u00020\u0003\u001a@\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00010\u0000\"\u0004\b\u0000\u0010\r\"\u0004\b\u0001\u0010\u000e*\b\u0012\u0004\u0012\u00028\u00000\u00002\u001a\u0010\u0010\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000fH\u0002\u001a\u001c\u0010\u0014\u001a\u00020\u00052\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00002\u0006\u0010\u0004\u001a\u00020\u0003\u001a\u001c\u0010\u0017\u001a\u00020\u00052\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00002\u0006\u0010\u0004\u001a\u00020\u0003\u001a\u001c\u0010\u0019\u001a\u00020\u00052\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u00002\u0006\u0010\u0004\u001a\u00020\u0003\"\u0016\u0010\u001b\u001a\u00020\u00038\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u001a¨\u0006\u001c"}, d2 = {"", "Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/RtSpo2Info;", "spo2List", "", "trackId", "", "spo2BulkString", "Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/SportRtPressure;", "pressureList", "pressureBulkString", "Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/SportRtTemperature;", "temperatureList", "temperatureBulkString", ExifInterface.GPS_DIRECTION_TRUE, "R", "Lkotlin/Function2;", "transform", "a", "Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/AltitudePoint;", "altitudePoints", "altitudeBulkString", "Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/GolfRtInfo;", "nodes", "toGolfBulk", "Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/RtPowerInfo;", "powerRtBulk", "J", "SECOND_2_MILLIS", "devicex_zeppRelease"}, k = 2, mv = {1, 5, 1})
public final class BulkUtilsKt {
    private static final long a = 1000;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u00002\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/SportRtPressure;", "previous", "current", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function2<SportRtPressure, SportRtPressure, SportRtPressure> {
        public final /* synthetic */ long a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(long j) {
            super(2);
            this.a = j;
        }

        @Override // kotlin.jvm.functions.Function2
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SportRtPressure invoke(@Nullable SportRtPressure sportRtPressure, @NotNull SportRtPressure sportRtPressure2) {
            if (sportRtPressure == null) {
                return new SportRtPressure((sportRtPressure2.getTime() / ((long) 1000)) - this.a, sportRtPressure2.getPressure());
            }
            long j = 1000;
            return new SportRtPressure((sportRtPressure2.getTime() / j) - (sportRtPressure.getTime() / j), sportRtPressure2.getPressure() - sportRtPressure.getPressure());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/SportRtPressure;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function1<SportRtPressure, CharSequence> {
        public static final b a = new b();

        public b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(@NotNull SportRtPressure sportRtPressure) {
            return sportRtPressure.getTime() + "," + sportRtPressure.getPressure();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u00002\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/SportRtTemperature;", "previous", "current", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function2<SportRtTemperature, SportRtTemperature, SportRtTemperature> {
        public final /* synthetic */ long a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(long j) {
            super(2);
            this.a = j;
        }

        @Override // kotlin.jvm.functions.Function2
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SportRtTemperature invoke(@Nullable SportRtTemperature sportRtTemperature, @NotNull SportRtTemperature sportRtTemperature2) {
            if (sportRtTemperature == null) {
                return new SportRtTemperature((sportRtTemperature2.getTime() / ((long) 1000)) - this.a, sportRtTemperature2.getTemperature());
            }
            long j = 1000;
            return new SportRtTemperature((sportRtTemperature2.getTime() / j) - (sportRtTemperature.getTime() / j), sportRtTemperature2.getTemperature() - sportRtTemperature.getTemperature());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/SportRtTemperature;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function1<SportRtTemperature, CharSequence> {
        public static final d a = new d();

        public d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(@NotNull SportRtTemperature sportRtTemperature) {
            return sportRtTemperature.getTime() + "," + sportRtTemperature.getTemperature();
        }
    }

    private static final <T, R> List<R> a(List<? extends T> list, Function2<? super T, ? super T, ? extends R> function2) {
        ArrayList arrayList = new ArrayList(list.size());
        ListIterator<? extends T> listIterator = list.listIterator();
        a05 a05Var = null;
        while (listIterator.hasNext()) {
            T next = listIterator.next();
            Unit unit = Unit.INSTANCE;
            arrayList.add(function2.invoke(a05Var, next));
            a05Var = next;
        }
        return arrayList;
    }

    @NotNull
    public static final String altitudeBulkString(@NotNull List<AltitudePoint> list, long j) {
        if (list.isEmpty()) {
            return "";
        }
        long time = j * 1000;
        StringBuilder sb = new StringBuilder();
        for (AltitudePoint altitudePoint : list) {
            sb.append((altitudePoint.getTime() / 1000) - (time / 1000));
            sb.append(",");
            sb.append(altitudePoint.getAltitude());
            sb.append(";");
            time = altitudePoint.getTime();
        }
        return sb.toString();
    }

    @NotNull
    public static final String powerRtBulk(@NotNull List<RtPowerInfo> list, long j) {
        if (list.isEmpty()) {
            return "";
        }
        long time = j * 1000;
        StringBuilder sb = new StringBuilder();
        for (RtPowerInfo rtPowerInfo : list) {
            sb.append((rtPowerInfo.getTime() / 1000) - (time / 1000));
            sb.append(",");
            sb.append(rtPowerInfo.getPower());
            sb.append(";");
            time = rtPowerInfo.getTime();
        }
        return sb.toString();
    }

    @NotNull
    public static final String pressureBulkString(@NotNull List<SportRtPressure> list, long j) {
        return list.isEmpty() ? "" : CollectionsKt___CollectionsKt.joinToString$default(a(list, new a(j)), ";", null, null, 0, null, b.a, 30, null);
    }

    @Nullable
    public static final String spo2BulkString(@NotNull List<RtSpo2Info> list, long j) {
        StringBuilder sb = new StringBuilder();
        if (list.isEmpty()) {
            return sb.toString();
        }
        RtSpo2Info rtSpo2Info = (RtSpo2Info) CollectionsKt.first((List) list);
        long j2 = 1000;
        sb.append((rtSpo2Info.getTime() / j2) - j);
        sb.append(",");
        sb.append(rtSpo2Info.getSpo2());
        int size = list.size();
        if (1 < size) {
            int i = 1;
            while (true) {
                int i2 = i + 1;
                RtSpo2Info rtSpo2Info2 = list.get(i);
                RtSpo2Info rtSpo2Info3 = list.get(i - 1);
                long time = (rtSpo2Info2.getTime() / j2) - (rtSpo2Info3.getTime() / j2);
                sb.append(";");
                sb.append(time == 1 ? "" : Long.valueOf(time));
                sb.append(",");
                sb.append(rtSpo2Info2.getSpo2() - rtSpo2Info3.getSpo2());
                if (i2 >= size) {
                    break;
                }
                i = i2;
            }
        }
        return sb.toString();
    }

    @NotNull
    public static final String temperatureBulkString(@NotNull List<SportRtTemperature> list, long j) {
        return list.isEmpty() ? "" : CollectionsKt___CollectionsKt.joinToString$default(a(list, new c(j)), ";", null, null, 0, null, d.a, 30, null);
    }

    @NotNull
    public static final String toGolfBulk(@NotNull List<GolfRtInfo> list, long j) {
        if (list.isEmpty()) {
            return "";
        }
        long time = j * 1000;
        StringBuilder sb = new StringBuilder();
        for (GolfRtInfo golfRtInfo : list) {
            sb.append((golfRtInfo.getTime() / 1000) - (time / 1000));
            sb.append(",");
            sb.append(golfRtInfo.getAngle());
            sb.append(",");
            sb.append(golfRtInfo.getBeat());
            sb.append(",");
            sb.append(golfRtInfo.getUpTime());
            sb.append(",");
            sb.append(golfRtInfo.getDownTime());
            sb.append(";");
            time = golfRtInfo.getTime();
        }
        return sb.toString();
    }
}

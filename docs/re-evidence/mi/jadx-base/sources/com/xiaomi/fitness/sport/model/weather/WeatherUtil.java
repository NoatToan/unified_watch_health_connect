package com.xiaomi.fitness.sport.model.weather;

import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.log.Logger;
import defpackage.eoi;
import java.util.Calendar;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\t\u001a\u00020\nH\u0002J\b\u0010\u000b\u001a\u00020\nH\u0002¨\u0006\f"}, d2 = {"Lcom/xiaomi/fitness/sport/model/weather/WeatherUtil;", "", "<init>", "()V", "getWeatherDrawable", "", "weatherCode", "", "(Ljava/lang/String;)Ljava/lang/Integer;", "isNight", "", "useDarkTheme", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class WeatherUtil {

    @NotNull
    public static final WeatherUtil INSTANCE = new WeatherUtil();

    private WeatherUtil() {
    }

    private final boolean isNight() {
        Calendar calendar = Calendar.getInstance();
        Intrinsics.checkNotNullExpressionValue(calendar, "getInstance(...)");
        int i = calendar.get(11);
        boolean z = i < 6 || i > 18;
        Logger.d("Is it at night now?  " + z, new Object[0]);
        return z;
    }

    private final boolean useDarkTheme() {
        return (ApplicationExtKt.getApplication().getResources().getConfiguration().uiMode & 48) == 32;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:32:0x00b5 A[Catch: Exception -> 0x0148, TryCatch #0 {Exception -> 0x0148, blocks: (B:3:0x001d, B:5:0x0025, B:7:0x002b, B:8:0x002e, B:10:0x0033, B:11:0x003b, B:12:0x0043, B:13:0x004b, B:14:0x0053, B:15:0x005b, B:16:0x0063, B:17:0x006b, B:18:0x0073, B:19:0x007b, B:20:0x0083, B:21:0x008b, B:22:0x0093, B:24:0x0099, B:26:0x009e, B:25:0x009c, B:27:0x00a4, B:29:0x00aa, B:31:0x00af, B:30:0x00ad, B:32:0x00b5, B:33:0x00bd, B:35:0x00c3, B:36:0x00c6, B:38:0x00cb, B:39:0x00d3, B:40:0x00db, B:41:0x00e3, B:42:0x00ea, B:43:0x00f1, B:44:0x00f8, B:45:0x00ff, B:46:0x0106, B:47:0x010d, B:48:0x0114, B:49:0x011b, B:50:0x0122, B:52:0x0128, B:54:0x012d, B:53:0x012b, B:55:0x0132, B:57:0x0138, B:59:0x013d, B:58:0x013b, B:60:0x0142), top: B:64:0x001d }] */
    /* JADX WARN: Code duplicated, block: B:60:0x0142 A[Catch: Exception -> 0x0148, TRY_LEAVE, TryCatch #0 {Exception -> 0x0148, blocks: (B:3:0x001d, B:5:0x0025, B:7:0x002b, B:8:0x002e, B:10:0x0033, B:11:0x003b, B:12:0x0043, B:13:0x004b, B:14:0x0053, B:15:0x005b, B:16:0x0063, B:17:0x006b, B:18:0x0073, B:19:0x007b, B:20:0x0083, B:21:0x008b, B:22:0x0093, B:24:0x0099, B:26:0x009e, B:25:0x009c, B:27:0x00a4, B:29:0x00aa, B:31:0x00af, B:30:0x00ad, B:32:0x00b5, B:33:0x00bd, B:35:0x00c3, B:36:0x00c6, B:38:0x00cb, B:39:0x00d3, B:40:0x00db, B:41:0x00e3, B:42:0x00ea, B:43:0x00f1, B:44:0x00f8, B:45:0x00ff, B:46:0x0106, B:47:0x010d, B:48:0x0114, B:49:0x011b, B:50:0x0122, B:52:0x0128, B:54:0x012d, B:53:0x012b, B:55:0x0132, B:57:0x0138, B:59:0x013d, B:58:0x013b, B:60:0x0142), top: B:64:0x001d }] */
    @Nullable
    public final Integer getWeatherDrawable(@NotNull String weatherCode) {
        Intrinsics.checkNotNullParameter(weatherCode, "weatherCode");
        Logger.d("weatherCode is " + weatherCode, new Object[0]);
        Integer numValueOf = null;
        try {
            if (useDarkTheme()) {
                int i = Integer.parseInt(weatherCode);
                if (i != 49) {
                    switch (i) {
                        case 0:
                            numValueOf = Integer.valueOf(isNight() ? eoi.u1 : eoi.A1);
                            break;
                        case 1:
                            numValueOf = Integer.valueOf(isNight() ? eoi.s1 : eoi.V0);
                            break;
                        case 2:
                            numValueOf = Integer.valueOf(eoi.w1);
                            break;
                        case 3:
                        case 7:
                            numValueOf = Integer.valueOf(eoi.j1);
                            break;
                        case 4:
                            numValueOf = Integer.valueOf(eoi.C1);
                            break;
                        case 5:
                            numValueOf = Integer.valueOf(eoi.b1);
                            break;
                        case 6:
                        case 19:
                            numValueOf = Integer.valueOf(eoi.y1);
                            break;
                        case 8:
                        case 21:
                            numValueOf = Integer.valueOf(eoi.n1);
                            break;
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                            numValueOf = Integer.valueOf(eoi.f1);
                            break;
                        case 13:
                        case 14:
                        case 33:
                            numValueOf = Integer.valueOf(eoi.l1);
                            break;
                        case 15:
                        case 26:
                            numValueOf = Integer.valueOf(eoi.p1);
                            break;
                        case 16:
                        case 17:
                        case 27:
                        case 28:
                            numValueOf = Integer.valueOf(eoi.h1);
                            break;
                        case 18:
                        case 32:
                            numValueOf = Integer.valueOf(eoi.Z0);
                            break;
                        case 20:
                        case 29:
                        case 30:
                        case 31:
                            numValueOf = Integer.valueOf(eoi.X0);
                            break;
                        default:
                            switch (i) {
                                case 53:
                                case 54:
                                case 55:
                                case 56:
                                    numValueOf = Integer.valueOf(eoi.d1);
                                    break;
                                case 57:
                                case 58:
                                    numValueOf = Integer.valueOf(eoi.Z0);
                                    break;
                            }
                            break;
                    }
                } else {
                    numValueOf = Integer.valueOf(eoi.Z0);
                }
            } else {
                int i2 = Integer.parseInt(weatherCode);
                if (i2 != 49) {
                    switch (i2) {
                        case 0:
                            numValueOf = Integer.valueOf(isNight() ? eoi.v1 : eoi.B1);
                            break;
                        case 1:
                            numValueOf = Integer.valueOf(isNight() ? eoi.t1 : eoi.W0);
                            break;
                        case 2:
                            numValueOf = Integer.valueOf(eoi.x1);
                            break;
                        case 3:
                        case 7:
                            numValueOf = Integer.valueOf(eoi.k1);
                            break;
                        case 4:
                            numValueOf = Integer.valueOf(eoi.D1);
                            break;
                        case 5:
                            numValueOf = Integer.valueOf(eoi.c1);
                            break;
                        case 6:
                        case 19:
                            numValueOf = Integer.valueOf(eoi.z1);
                            break;
                        case 8:
                        case 21:
                            numValueOf = Integer.valueOf(eoi.o1);
                            break;
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                            numValueOf = Integer.valueOf(eoi.g1);
                            break;
                        case 13:
                        case 14:
                        case 33:
                            numValueOf = Integer.valueOf(eoi.m1);
                            break;
                        case 15:
                        case 26:
                            numValueOf = Integer.valueOf(eoi.q1);
                            break;
                        case 16:
                        case 17:
                        case 27:
                        case 28:
                            numValueOf = Integer.valueOf(eoi.i1);
                            break;
                        case 18:
                        case 32:
                            numValueOf = Integer.valueOf(eoi.a1);
                            break;
                        case 20:
                        case 29:
                        case 30:
                        case 31:
                            numValueOf = Integer.valueOf(eoi.Y0);
                            break;
                        default:
                            switch (i2) {
                                case 53:
                                case 54:
                                case 55:
                                case 56:
                                    numValueOf = Integer.valueOf(eoi.e1);
                                    break;
                                case 57:
                                case 58:
                                    numValueOf = Integer.valueOf(eoi.a1);
                                    break;
                            }
                            break;
                    }
                } else {
                    numValueOf = Integer.valueOf(eoi.a1);
                }
            }
        } catch (Exception unused) {
        }
        Logger.d("drawable resource id is " + numValueOf, new Object[0]);
        return numValueOf;
    }
}

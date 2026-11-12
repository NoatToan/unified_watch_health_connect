package com.xiaomi.hm.health.speech.speech.koin.alexa;

import android.content.Context;
import androidx.core.content.ContextCompat;
import com.huami.ai.speech.alexa.GeoLocation;
import com.huami.ai.speech.alexa.entity.payload.Altitude;
import com.huami.ai.speech.alexa.entity.payload.Coordinate;
import com.huami.ai.speech.alexa.entity.payload.Speed;
import com.huami.dev.Logcat;
import com.huami.dev.LogcatKt;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.locweather.LocWeatherKeeper;
import com.xiaomi.hm.health.locweather.location.MyLocation;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\n\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\n\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J\n\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\fR\u0016\u0010\u0010\u001a\u00020\r8\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0014"}, d2 = {"Lcom/xiaomi/hm/health/speech/speech/koin/alexa/GeoLocationImpl;", "Lcom/huami/ai/speech/alexa/GeoLocation;", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "a", "Lcom/huami/ai/speech/alexa/entity/payload/Altitude;", "getAltitude", "Lcom/huami/ai/speech/alexa/entity/payload/Coordinate;", "getCoordinate", "Lcom/huami/ai/speech/alexa/entity/payload/Speed;", "getSpeed", "Landroid/content/Context;", "", "b", "Ljava/lang/String;", "tag", "<init>", "(Landroid/content/Context;)V", "Companion", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class GeoLocationImpl implements GeoLocation {
    private static final int c = 10;
    private static final int d = 0;
    private static final float e = 0.0f;
    private static final float f = 0.0f;
    private static final float g = 0.0f;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final String tag = "speech";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "Has no location permission!";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public static final b a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "Has no location permission!";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0000\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<Object> {
        public final /* synthetic */ Coordinate a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Coordinate coordinate) {
            super(0);
            this.a = coordinate;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final Object invoke() {
            return this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public static final d a = new d();

        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "Has no location permission!";
        }
    }

    public GeoLocationImpl(@NotNull Context context) {
        this.context = context;
    }

    private final boolean a(Context context) {
        return (ContextCompat.checkSelfPermission(context, "android.permission.ACCESS_FINE_LOCATION") == 0) || (ContextCompat.checkSelfPermission(context, "android.permission.ACCESS_COARSE_LOCATION") == 0);
    }

    @Override // com.huami.ai.speech.alexa.GeoLocation
    @Nullable
    public Altitude getAltitude() {
        if (a(this.context)) {
            MyLocation lastLocation = LocWeatherKeeper.getLastLocation();
            return new Altitude(lastLocation == null ? 0.0f : (float) lastLocation.getAltitude(), 10);
        }
        HMLog.info(this.tag, a.a);
        return null;
    }

    @Override // com.huami.ai.speech.alexa.GeoLocation
    @Nullable
    public Coordinate getCoordinate() {
        if (!a(this.context)) {
            HMLog.info(this.tag, b.a);
            return null;
        }
        MyLocation lastLocation = LocWeatherKeeper.getLastLocation();
        float latitude = lastLocation == null ? 0.0f : (float) lastLocation.getLatitude();
        MyLocation lastLocation2 = LocWeatherKeeper.getLastLocation();
        Coordinate coordinate = new Coordinate(latitude, lastLocation2 != null ? (float) lastLocation2.getLongitude() : 0.0f, 10);
        LogcatKt.debug$default(Logcat.INSTANCE, null, new c(coordinate), 1, null);
        return coordinate;
    }

    @Override // com.huami.ai.speech.alexa.GeoLocation
    @Nullable
    public Speed getSpeed() {
        if (a(this.context)) {
            return new Speed(0);
        }
        HMLog.info(this.tag, d.a);
        return null;
    }
}

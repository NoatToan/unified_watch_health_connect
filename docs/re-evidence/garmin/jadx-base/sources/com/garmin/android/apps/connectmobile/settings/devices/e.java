package com.garmin.android.apps.connectmobile.settings.devices;

import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import java.util.Locale;

/* JADX INFO: loaded from: classes10.dex */
public class e extends com.garmin.android.library.backgroundtaskmanagement.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static e f42893b;

    public enum a {
        RUNNING,
        CYCLING,
        CARDIO,
        WALKING,
        TRAINING,
        SWIMMING,
        ELLIPTICAL,
        FITNESS_EQUIPMENT,
        /* JADX INFO: Fake field, exist only in values array */
        TOETOTOE,
        OTHER,
        GENERIC,
        ROWING,
        HIIT,
        MEDITATION,
        DANCE,
        JUMP_ROPE,
        TENNIS,
        RACKET,
        HIKING,
        MOUNTAINEERING,
        DISC_GOLF,
        HORSEBACK_RIDING,
        ARCHERY,
        INLINE_SKATING,
        GOLF,
        /* JADX INFO: Fake field, exist only in values array */
        SKI,
        BOXING,
        ROCK_CLIMBING,
        MIXED_MARTIAL_ARTS,
        MOBILITY,
        SOCCER,
        AMERICAN_FOOTBALL,
        BASKETBALL,
        BASEBALL,
        /* JADX INFO: Fake field, exist only in values array */
        SOFTBALL_SLOW_PITCH,
        SOFTBALL_FAST_PITCH,
        VOLLEYBALL,
        LACROSSE,
        HOCKEY,
        RUGBY,
        CRICKET,
        VIDEO_GAMING,
        ALPINE_SKIING,
        SNOWBOARDING,
        CROSS_COUNTRY_SKIING,
        SNOWSHOEING,
        ICE_SKATING,
        /* JADX INFO: Fake field, exist only in values array */
        SKI,
        STAND_UP_PADDLEBOARDING,
        KAYAKING,
        SNORKELING,
        BOATING,
        FISHING,
        WHEELCHAIR_PUSH_RUN,
        WHEELCHAIR_PUSH_WALK
    }

    public enum b {
        INDOOR_WALKING,
        INDOOR_RUNNING,
        TRAIL,
        TRACK,
        TREADMILL,
        OBSTACLE,
        LAP_SWIMMING,
        OPEN_WATER,
        PICKLEBALL,
        PADEL,
        RACQUETBALL,
        SQUASH,
        BADMINTON,
        TABLE_TENNIS,
        /* JADX INFO: Fake field, exist only in values array */
        PLATFORM,
        INDOOR_CYCLING,
        MOUNTAIN,
        COMMUTING,
        E_BIKE_FITNESS,
        E_BIKE_ENDURO,
        GRAVEL_CYCLING,
        MIXED_SURFACE,
        ROAD,
        BMX,
        CARDIO_TRAINING,
        STRENGTH_TRAINING,
        ELLIPTICAL,
        YOGA,
        PILATES,
        BREATHING,
        INDOOR_ROWING,
        ALL,
        GENERIC,
        STAIR_CLIMBING,
        CHALLENGE,
        INDOOR_CLIMBING,
        BOULDERING,
        ULTIMATE,
        FIELD,
        ICE,
        SKATE_SKIING,
        ESPORT,
        ACTIVITY_TIMER,
        INDOOR_WHEELCHAIR_RUN,
        HAND_CYCLING,
        INDOOR_HAND_CYCLING,
        INDOOR_WHEELCHAIR_WALK
    }

    private e() {
    }

    public static d80.f M(long j8, a aVar, b bVar, d80.b bVar2) {
        String strValueOf = String.valueOf(j8);
        String strName = aVar.name();
        Locale locale = Locale.US;
        d80.f.b bVar3 = new d80.f.b(new Object[]{strValueOf, strName.toLowerCase(locale), bVar.name().toLowerCase(locale)}, lj0.f.B);
        bVar3.f58273c = com.garmin.android.apps.connectmobile.devices.model.f.class;
        bVar3.f58274d = bVar2;
        bVar3.f58275e = d80.g.JSON_OBJECT;
        d80.f fVarA = bVar3.a();
        fVarA.b();
        return fVarA;
    }

    public static synchronized e N() {
        try {
            if (f42893b == null) {
                f42893b = new e();
            }
        } catch (Throwable th3) {
            throw th3;
        }
        return f42893b;
    }

    public static d80.f O(long j8, a aVar, b bVar, String str, d80.b bVar2) {
        Locale locale = Locale.US;
        lj0.f fVar = lj0.f.D;
        Object[] objArr = {String.valueOf(j8), aVar.name().toLowerCase(locale), bVar.name().toLowerCase(locale)};
        fVar.f113007i = str;
        d80.f.b bVar3 = new d80.f.b(objArr, fVar);
        bVar3.f58274d = bVar2;
        bVar3.f58275e = d80.g.NO_PARSING;
        d80.f fVarA = bVar3.a();
        fVarA.b();
        return fVarA;
    }

    public static d80.f P(long j8, a aVar, String str, d80.b bVar) {
        Locale locale = Locale.US;
        lj0.f fVar = lj0.f.C;
        Object[] objArr = {String.valueOf(j8), aVar.name().toLowerCase(locale)};
        fVar.f113007i = str;
        d80.f.b bVar2 = new d80.f.b(objArr, fVar);
        bVar2.f58274d = bVar;
        bVar2.f58275e = d80.g.NO_PARSING;
        d80.f fVarA = bVar2.a();
        fVarA.b();
        return fVarA;
    }

    public static d80.f Q(long j8, String str, d80.b bVar) {
        lj0.f fVar = lj0.f.f112991q;
        Object[] objArr = {String.valueOf(j8)};
        fVar.f113007i = str;
        d80.f.b bVar2 = new d80.f.b(objArr, fVar);
        bVar2.f58274d = bVar;
        bVar2.f58275e = d80.g.NO_PARSING;
        d80.f fVarA = bVar2.a();
        fVarA.b();
        return fVarA;
    }

    public final d80.f<DeviceSettingsDTO> r(long j8, d80.b bVar) {
        d80.f.b bVar2 = new d80.f.b(new Object[]{String.valueOf(j8)}, lj0.f.f112987m);
        bVar2.f58273c = DeviceSettingsDTO.class;
        bVar2.f58274d = bVar;
        bVar2.f58275e = d80.g.JSON_OBJECT;
        d80.f<DeviceSettingsDTO> fVarA = bVar2.a();
        fVarA.b();
        return fVarA;
    }
}

package hu;

import com.garmin.android.library.backgroundtaskmanagement.d;
import com.garmin.proto.generated.GDIAudioPromptsProto;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001:\u0001\tB\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lhu/c;", "Lcom/garmin/android/library/backgroundtaskmanagement/b;", "", "", "deviceId", "Lcom/garmin/android/library/backgroundtaskmanagement/b$a;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "<init>", "(JLcom/garmin/android/library/backgroundtaskmanagement/b$a;)V", "b", "data_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c extends com.garmin.android.library.backgroundtaskmanagement.b<Object> {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f85689m = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f85690l;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"hu/c$a", "Lcom/garmin/android/library/backgroundtaskmanagement/d;", "data_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a extends d {
        public a() {
            super(c.this);
        }

        @Override // com.garmin.android.library.backgroundtaskmanagement.f
        public final void a() {
            int i14 = c.f85689m;
            c cVar = c.this;
            cVar.getClass();
            GDIAudioPromptsProto.LapNotification.Builder builderNewBuilder = GDIAudioPromptsProto.LapNotification.newBuilder();
            builderNewBuilder.setLapNumber(3);
            builderNewBuilder.setLapTime(298L);
            GDIAudioPromptsProto.AudioPromptsService audioPromptsServiceBuild = GDIAudioPromptsProto.AudioPromptsService.newBuilder().setLapNotification(builderNewBuilder).build();
            audioPromptsServiceBuild.getClass();
            cVar.k("TestAlertVolumeOperation.lap", audioPromptsServiceBuild);
            GDIAudioPromptsProto.SpeedNotification.Builder builderNewBuilder2 = GDIAudioPromptsProto.SpeedNotification.newBuilder();
            builderNewBuilder2.setDeviceIsDisplayingMetricUnits(false);
            hu.a.C1699a c1699a = hu.a.f85684b;
            hu.a aVarA = c1699a.a();
            long j8 = cVar.f85690l;
            aVarA.getClass();
            int i15 = C1701c.f85692a[hu.a.T(j8).ordinal()];
            if (i15 == 1) {
                builderNewBuilder2.setAverageSpeed(2.548128f);
            } else if (i15 == 2) {
                builderNewBuilder2.setCurrentSpeed(2.548128f);
            } else if (i15 != 3) {
                Unit unit = Unit.INSTANCE;
            } else {
                builderNewBuilder2.setLapSpeed(2.548128f);
            }
            GDIAudioPromptsProto.AudioPromptsService audioPromptsServiceBuild2 = GDIAudioPromptsProto.AudioPromptsService.newBuilder().setSpeedNotification(builderNewBuilder2).build();
            audioPromptsServiceBuild2.getClass();
            cVar.k("TestAlertVolumeOperation.speed", audioPromptsServiceBuild2);
            GDIAudioPromptsProto.HeartRateNotification.Builder builderNewBuilder3 = GDIAudioPromptsProto.HeartRateNotification.newBuilder();
            c1699a.a().getClass();
            int i16 = C1701c.f85693b[hu.a.R(j8).ordinal()];
            if (i16 == 1) {
                builderNewBuilder3.setBpm(80);
            } else if (i16 == 2) {
                builderNewBuilder3.setPercentageHrr(88);
            } else if (i16 == 3) {
                builderNewBuilder3.setPercentageMax(77);
            } else if (i16 != 4) {
                Unit unit2 = Unit.INSTANCE;
            } else {
                builderNewBuilder3.setZone(2.4f);
            }
            GDIAudioPromptsProto.AudioPromptsService audioPromptsServiceBuild3 = GDIAudioPromptsProto.AudioPromptsService.newBuilder().setHeartRateNotification(builderNewBuilder3).build();
            audioPromptsServiceBuild3.getClass();
            cVar.k("TestAlertVolumeOperation.heart.rate", audioPromptsServiceBuild3);
            c(com.garmin.android.library.backgroundtaskmanagement.b.c.SUCCESS);
        }

        @Override // com.garmin.android.library.backgroundtaskmanagement.d
        public final void b() {
        }
    }

    /* JADX INFO: renamed from: hu.c$c, reason: collision with other inner class name */
    public static final /* synthetic */ class C1701c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f85692a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f85693b;

        static {
            int[] iArr = new int[lu.d.values().length];
            try {
                iArr[lu.d.AVERAGE_PACE_SPEED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[lu.d.CURRENT_PACE_SPEED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[lu.d.LAP_PACE_SPEED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f85692a = iArr;
            int[] iArr2 = new int[lu.c.values().length];
            try {
                iArr2[lu.c.HEART_RATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[lu.c.PERCENTAGE_HEART_RATE_RESERVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[lu.c.PERCENTAGE_MAX_HEART_RATE.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[lu.c.HEART_RATE_ZONE.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            f85693b = iArr2;
        }
    }

    static {
        new b(null);
    }

    public c(long j8, com.garmin.android.library.backgroundtaskmanagement.b.a aVar) {
        super(com.garmin.android.library.backgroundtaskmanagement.b.d.BACKGROUND_PRIORITY, aVar);
        this.f85690l = j8;
        b(new a());
    }

    public final void k(String str, GDIAudioPromptsProto.AudioPromptsService audioPromptsService) {
        iu.c.f95001a.getClass();
        iu.b bVarA = iu.b.a(iu.c.a(audioPromptsService), str, this.f85690l);
        iu.a.f94990a.getClass();
        iu.a.f94991b.offer(bVarA);
        com.garmin.android.apps.connectmobile.audioprompts.b.f30221d.getClass();
        com.garmin.android.apps.connectmobile.audioprompts.b.d(com.garmin.android.apps.connectmobile.audioprompts.b.a.a(), str, audioPromptsService, this.f85690l, 8);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lhu/c$b;", "", "<init>", "()V", "", "TEST_ID_LAP", "Ljava/lang/String;", "TEST_ID_SPEED", "TEST_ID_HEART_RATE", "data_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(j jVar) {
            this();
        }

        private b() {
        }
    }
}

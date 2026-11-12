package e12;

import c22.s3;
import com.google.gson.annotations.SerializedName;
import d53.u;
import java.util.Locale;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u000f\u0010\u0015R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Le12/e;", "", "Le12/a;", "deviceBasedIndicators", "Le12/c;", "profileBasedIndicators", "Le12/b;", "historicalDeviceBasedIndicators", "Le12/d;", "reportAvailability", "<init>", "(Le12/a;Le12/c;Le12/b;Le12/d;)V", "a", "Le12/a;", "()Le12/a;", "b", "Le12/c;", "getProfileBasedIndicators", "()Le12/c;", "c", "Le12/b;", "()Le12/b;", "d", "Le12/d;", "getReportAvailability", "()Le12/d;", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("deviceBasedIndicators")
    private final a deviceBasedIndicators;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("profileBasedIndicators")
    private final c profileBasedIndicators;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("historicalDeviceBasedIndicators")
    private final b historicalDeviceBasedIndicators;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("ReportAvailability")
    private final d reportAvailability;

    public /* synthetic */ e(a aVar, c cVar, b bVar, d dVar, int i14, j jVar) {
        this((i14 & 1) != 0 ? null : aVar, (i14 & 2) != 0 ? null : cVar, (i14 & 4) != 0 ? null : bVar, (i14 & 8) != 0 ? null : dVar);
    }

    public final boolean A() {
        a aVar = this.deviceBasedIndicators;
        if (aVar != null ? s.g(aVar.getHasContactManagementCapableDevice(), Boolean.TRUE) : false) {
            return true;
        }
        b bVar = this.historicalDeviceBasedIndicators;
        return bVar != null ? s.g(bVar.getHasContactManagementCapableDevice(), Boolean.TRUE) : false;
    }

    public final boolean A0() {
        if (z0()) {
            return true;
        }
        b bVar = this.historicalDeviceBasedIndicators;
        return bVar != null ? s.g(bVar.getHasSleepScoreCapableDevice(), Boolean.TRUE) : false;
    }

    public final boolean B() {
        a aVar = this.deviceBasedIndicators;
        if (aVar != null) {
            return s.g(aVar.getHasCriticalSwimSpeedCapableDevice(), Boolean.TRUE);
        }
        return false;
    }

    public final boolean B0() {
        a aVar = this.deviceBasedIndicators;
        if (aVar != null) {
            return s.g(aVar.getHasSleepSkinTemperatureCapableDevice(), Boolean.TRUE);
        }
        return false;
    }

    public final boolean C() {
        a aVar = this.deviceBasedIndicators;
        if (aVar != null) {
            return s.g(aVar.getHasCustomIntensityMinsCapableDevice(), Boolean.TRUE);
        }
        return false;
    }

    public final boolean C0() {
        if (B0()) {
            return true;
        }
        b bVar = this.historicalDeviceBasedIndicators;
        return bVar != null ? s.g(bVar.getHasSleepSkinTemperatureCapableDevice(), Boolean.TRUE) : false;
    }

    public final boolean D() {
        a aVar = this.deviceBasedIndicators;
        if (aVar != null ? s.g(aVar.getHasCyclingAbilityCapableDevice(), Boolean.TRUE) : false) {
            return true;
        }
        b bVar = this.historicalDeviceBasedIndicators;
        return bVar != null ? s.g(bVar.getHasCyclingAbilityCapableDevice(), Boolean.TRUE) : false;
    }

    public final boolean D0() {
        a aVar = this.deviceBasedIndicators;
        if (aVar != null) {
            return s.g(aVar.getHasSleepTimeCapableDevice(), Boolean.TRUE);
        }
        return false;
    }

    public final boolean E() {
        a aVar = this.deviceBasedIndicators;
        if (aVar != null) {
            return s.g(aVar.getHasDogTaggingCapableDevice(), Boolean.TRUE);
        }
        return false;
    }

    public final boolean E0() {
        a aVar = this.deviceBasedIndicators;
        if (aVar != null) {
            return s.g(aVar.getHasSportingEventCapableDevice(), Boolean.TRUE);
        }
        return false;
    }

    public final boolean F() {
        a aVar = this.deviceBasedIndicators;
        if (aVar != null) {
            return s.g(aVar.getHasEmergencyCallingCapableDevice(), Boolean.TRUE);
        }
        return false;
    }

    public final boolean F0() {
        a aVar = this.deviceBasedIndicators;
        if (aVar != null ? s.g(aVar.getHasStaminaCurveCapableDevice(), Boolean.TRUE) : false) {
            return true;
        }
        b bVar = this.historicalDeviceBasedIndicators;
        return bVar != null ? s.g(bVar.getHasStaminaCurveCapableDevice(), Boolean.TRUE) : false;
    }

    public final boolean G() {
        a aVar = this.deviceBasedIndicators;
        if (aVar != null ? s.g(aVar.getHasFTPCapable(), Boolean.TRUE) : false) {
            return true;
        }
        b bVar = this.historicalDeviceBasedIndicators;
        return bVar != null ? s.g(bVar.getHasFTPCapable(), Boolean.TRUE) : false;
    }

    public final boolean G0() {
        a aVar = this.deviceBasedIndicators;
        if (aVar != null) {
            return s.g(aVar.getHasStrengthTrainingPlanCapableDevice(), Boolean.TRUE);
        }
        return false;
    }

    public final boolean H() {
        a aVar = this.deviceBasedIndicators;
        if (aVar != null) {
            return s.g(aVar.getHasFallDetectionCapableDevice(), Boolean.TRUE);
        }
        return false;
    }

    public final boolean H0() {
        Boolean boolS0;
        a aVar = this.deviceBasedIndicators;
        if (aVar == null || (boolS0 = aVar.getHasSyncActivityEditsCapableDevice()) == null) {
            return false;
        }
        return boolS0.booleanValue();
    }

    public final boolean I() {
        a aVar = this.deviceBasedIndicators;
        if (aVar != null ? s.g(aVar.getHasFitnessAgeV2CapableDevice(), Boolean.TRUE) : false) {
            return true;
        }
        b bVar = this.historicalDeviceBasedIndicators;
        return bVar != null ? s.g(bVar.getHasFitnessAgeV2CapableDevice(), Boolean.TRUE) : false;
    }

    public final boolean I0() {
        d dVar = this.reportAvailability;
        if (dVar != null) {
            return s.g(dVar.getHasTotalSteps(), Boolean.TRUE);
        }
        return false;
    }

    public final boolean J() {
        a aVar = this.deviceBasedIndicators;
        if (aVar != null ? s.g(aVar.getHasFloorCountCapableDevice(), Boolean.TRUE) : false) {
            return true;
        }
        b bVar = this.historicalDeviceBasedIndicators;
        return bVar != null ? s.g(bVar.getHasFloorCountCapableDevice(), Boolean.TRUE) : false;
    }

    public final boolean J0() {
        a aVar = this.deviceBasedIndicators;
        if (aVar != null ? s.g(aVar.getHasTrainingEffectLabelCapableDevice(), Boolean.TRUE) : false) {
            return true;
        }
        b bVar = this.historicalDeviceBasedIndicators;
        return bVar != null ? s.g(bVar.getHasTrainingEffectLabelCapableDevice(), Boolean.TRUE) : false;
    }

    public final boolean K() {
        d dVar = this.reportAvailability;
        if (dVar != null) {
            return s.g(dVar.getHasFloorsAscended(), Boolean.TRUE);
        }
        return false;
    }

    public final boolean K0() {
        a aVar = this.deviceBasedIndicators;
        if (aVar != null ? s.g(aVar.getHasTrainingReadinessCapableDevice(), Boolean.TRUE) : false) {
            return true;
        }
        b bVar = this.historicalDeviceBasedIndicators;
        return bVar != null ? s.g(bVar.getHasTrainingReadinessCapableDevice(), Boolean.TRUE) : false;
    }

    public final boolean L() {
        d dVar = this.reportAvailability;
        if (dVar != null) {
            return s.g(dVar.getHasFloorsDescended(), Boolean.TRUE);
        }
        return false;
    }

    public final boolean L0() {
        a aVar = this.deviceBasedIndicators;
        if (aVar != null ? s.g(aVar.getHasTrainingStatusCapableDevice(), Boolean.TRUE) : false) {
            return true;
        }
        b bVar = this.historicalDeviceBasedIndicators;
        return bVar != null ? s.g(bVar.getHasTrainingStatusCapableDevice(), Boolean.TRUE) : false;
    }

    public final boolean M() {
        a aVar = this.deviceBasedIndicators;
        if (aVar != null) {
            return s.g(aVar.getHasGpsTrackCapableDevice(), Boolean.TRUE);
        }
        return false;
    }

    public final boolean M0() {
        a aVar = this.deviceBasedIndicators;
        if (aVar != null) {
            return s.g(aVar.getHasTrainingStatusPauseCapableDevice(), Boolean.TRUE);
        }
        return false;
    }

    public final boolean N() {
        a aVar = this.deviceBasedIndicators;
        if (aVar != null) {
            return s.g(aVar.getHasHrvStatusCapableDevice(), Boolean.TRUE);
        }
        return false;
    }

    public final boolean N0() {
        a aVar = this.deviceBasedIndicators;
        if (aVar != null ? s.g(aVar.getHasVO2MaxBikeCapable(), Boolean.TRUE) : false) {
            return true;
        }
        b bVar = this.historicalDeviceBasedIndicators;
        return bVar != null ? s.g(bVar.getHasVO2MaxBikeCapable(), Boolean.TRUE) : false;
    }

    public final boolean O() {
        if (N()) {
            return true;
        }
        b bVar = this.historicalDeviceBasedIndicators;
        return bVar != null ? s.g(bVar.getHasHrvStatusCapableDevice(), Boolean.TRUE) : false;
    }

    public final boolean O0() {
        a aVar = this.deviceBasedIndicators;
        if (aVar != null ? s.g(aVar.getHasVO2MaxRunCapable(), Boolean.TRUE) : false) {
            return true;
        }
        b bVar = this.historicalDeviceBasedIndicators;
        return bVar != null ? s.g(bVar.getHasVO2MaxRunCapable(), Boolean.TRUE) : false;
    }

    public final boolean P() {
        a aVar = this.deviceBasedIndicators;
        if (aVar != null ? s.g(aVar.getHasHRVStressCapableDevice(), Boolean.TRUE) : false) {
            return true;
        }
        b bVar = this.historicalDeviceBasedIndicators;
        return bVar != null ? s.g(bVar.getHasHRVStressCapableDevice(), Boolean.TRUE) : false;
    }

    public final boolean P0() {
        Integer numC0;
        a aVar = this.deviceBasedIndicators;
        return ((aVar == null || (numC0 = aVar.getWeightScaleDeviceCount()) == null) ? 0 : numC0.intValue()) >= 1;
    }

    public final boolean Q() {
        a aVar = this.deviceBasedIndicators;
        if (aVar != null ? s.g(aVar.getHasHealthSnapshotCapableDevice(), Boolean.TRUE) : false) {
            return true;
        }
        b bVar = this.historicalDeviceBasedIndicators;
        return bVar != null ? s.g(bVar.getHasHealthSnapshotCapableDevice(), Boolean.TRUE) : false;
    }

    public final boolean Q0() {
        a aVar = this.deviceBasedIndicators;
        if (aVar != null) {
            return s.g(aVar.getHasWheelchairCapableDevice(), Boolean.TRUE);
        }
        return false;
    }

    public final boolean R() {
        a aVar = this.deviceBasedIndicators;
        if (aVar != null ? s.g(aVar.getHasHealthStatusCapableDevice(), Boolean.TRUE) : false) {
            return true;
        }
        b bVar = this.historicalDeviceBasedIndicators;
        return bVar != null ? s.g(bVar.getHasHealthStatusCapableDevice(), Boolean.TRUE) : false;
    }

    public final boolean R0() {
        d dVar = this.reportAvailability;
        if (dVar != null) {
            return s.g(dVar.getHasWheelchairPushes(), Boolean.TRUE);
        }
        return false;
    }

    public final boolean S() {
        a aVar = this.deviceBasedIndicators;
        if (aVar != null ? s.g(aVar.getHasHeatAndAltitudeAcclimationCapableDevice(), Boolean.TRUE) : false) {
            return true;
        }
        b bVar = this.historicalDeviceBasedIndicators;
        return bVar != null ? s.g(bVar.getHasHeatAndAltitudeAcclimationCapableDevice(), Boolean.TRUE) : false;
    }

    public final boolean S0() {
        a aVar = this.deviceBasedIndicators;
        if (aVar != null ? s.g(aVar.getHasWorkoutAudioPromptsCapableDevice(), Boolean.TRUE) : false) {
            return true;
        }
        b bVar = this.historicalDeviceBasedIndicators;
        return bVar != null ? s.g(bVar.getHasWorkoutAudioPromptsCapableDevice(), Boolean.TRUE) : false;
    }

    public final boolean T() {
        a aVar = this.deviceBasedIndicators;
        if (aVar != null ? s.g(aVar.getHasHillScoreAndEnduranceScoreCapableDevice(), Boolean.TRUE) : false) {
            return true;
        }
        b bVar = this.historicalDeviceBasedIndicators;
        return bVar != null ? s.g(bVar.getHasHillScoreAndEnduranceScoreCapableDevice(), Boolean.TRUE) : false;
    }

    public final boolean T0() {
        c cVar = this.profileBasedIndicators;
        return (cVar != null ? s.g(cVar.getIsPulseOxAllowed(), Boolean.TRUE) : false) || u.q(Locale.getDefault().getLanguage(), "ja", true);
    }

    public final boolean U() {
        b bVar = this.historicalDeviceBasedIndicators;
        if (bVar != null) {
            return s.g(bVar.getHasGpsTrackCapableDevice(), Boolean.TRUE);
        }
        return false;
    }

    public final boolean U0() {
        a aVar = this.deviceBasedIndicators;
        if (aVar != null ? s.g(aVar.getHasSkipLastWorkoutStepInRepeatBlockCapableDevice(), Boolean.TRUE) : false) {
            return true;
        }
        b bVar = this.historicalDeviceBasedIndicators;
        return bVar != null ? s.g(bVar.getHasSkipLastWorkoutStepInRepeatBlockCapableDevice(), Boolean.TRUE) : false;
    }

    public final boolean V() {
        b bVar = this.historicalDeviceBasedIndicators;
        if (bVar != null) {
            return s.g(bVar.getHasWheelchairCapableDevice(), Boolean.TRUE);
        }
        return false;
    }

    public final boolean V0() {
        b bVar = this.historicalDeviceBasedIndicators;
        if (bVar != null ? s.g(bVar.getHasTrainableTriathlonEventCapableDevice(), Boolean.TRUE) : false) {
            return true;
        }
        a aVar = this.deviceBasedIndicators;
        if (aVar != null ? s.g(aVar.getHasTrainableTriathlonEventCapableDevice(), Boolean.TRUE) : false) {
            return true;
        }
        s3.f23252a.getClass();
        return s3.a("ROLE_MBTESTER");
    }

    public final boolean W() {
        a aVar = this.deviceBasedIndicators;
        if (aVar != null ? s.g(aVar.getHasIntensityMinuteCapableDevice(), Boolean.TRUE) : false) {
            return true;
        }
        b bVar = this.historicalDeviceBasedIndicators;
        return bVar != null ? s.g(bVar.getHasIntensityMinuteCapableDevice(), Boolean.TRUE) : false;
    }

    public final boolean W0() {
        c cVar = this.profileBasedIndicators;
        if (cVar != null) {
            return s.g(cVar.getShowEmergencyContactAlert(), Boolean.TRUE);
        }
        return false;
    }

    public final boolean X() {
        a aVar = this.deviceBasedIndicators;
        if (aVar != null ? s.g(aVar.getHasIntensityMinutesV2CapableDevice(), Boolean.TRUE) : false) {
            return true;
        }
        b bVar = this.historicalDeviceBasedIndicators;
        return bVar != null ? s.g(bVar.getHasIntensityMinutesV2CapableDevice(), Boolean.TRUE) : false;
    }

    public final boolean X0() {
        c cVar = this.profileBasedIndicators;
        if (cVar != null) {
            return s.g(cVar.getShowLiveTrackContactAlert(), Boolean.TRUE);
        }
        return false;
    }

    public final boolean Y() {
        a aVar = this.deviceBasedIndicators;
        if (aVar != null) {
            return s.g(aVar.getHasJetLagCapableDevice(), Boolean.TRUE);
        }
        return false;
    }

    public final boolean Z() {
        a aVar = this.deviceBasedIndicators;
        if (aVar != null ? s.g(aVar.getHasJetLagCapableDevice(), Boolean.TRUE) : false) {
            return true;
        }
        b bVar = this.historicalDeviceBasedIndicators;
        return bVar != null ? s.g(bVar.getHasJetLagCapableDevice(), Boolean.TRUE) : false;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final a getDeviceBasedIndicators() {
        return this.deviceBasedIndicators;
    }

    public final boolean a0() {
        a aVar = this.deviceBasedIndicators;
        if (aVar != null ? s.g(aVar.getHasLactateThresholdCapable(), Boolean.TRUE) : false) {
            return true;
        }
        b bVar = this.historicalDeviceBasedIndicators;
        return bVar != null ? s.g(bVar.getHasLactateThresholdCapable(), Boolean.TRUE) : false;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final b getHistoricalDeviceBasedIndicators() {
        return this.historicalDeviceBasedIndicators;
    }

    public final boolean b0() {
        a aVar = this.deviceBasedIndicators;
        return (aVar != null ? s.g(aVar.getHasLteLiveEventSharingCapableDevice(), Boolean.TRUE) : false) && !((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).f();
    }

    public final boolean c() {
        a aVar = this.deviceBasedIndicators;
        if (aVar != null) {
            return s.g(aVar.getHasATPWorkoutCapableDevice(), Boolean.TRUE);
        }
        return false;
    }

    public final boolean c0() {
        a aVar = this.deviceBasedIndicators;
        if (aVar != null) {
            return s.g(aVar.getHasMultiSportWorkoutCapableDevice(), Boolean.TRUE);
        }
        return false;
    }

    public final boolean d() {
        a aVar = this.deviceBasedIndicators;
        if (aVar != null ? s.g(aVar.getHasAcuteChronicWorkloadRatioCapableDevice(), Boolean.TRUE) : false) {
            return true;
        }
        b bVar = this.historicalDeviceBasedIndicators;
        return bVar != null ? s.g(bVar.getHasAcuteChronicWorkloadRatioCapableDevice(), Boolean.TRUE) : false;
    }

    public final boolean d0() {
        a aVar = this.deviceBasedIndicators;
        if (aVar != null ? s.g(aVar.getHasMultiSportWorkoutCapableDevice(), Boolean.TRUE) : false) {
            return true;
        }
        b bVar = this.historicalDeviceBasedIndicators;
        return bVar != null ? s.g(bVar.getHasMultiSportWorkoutCapableDevice(), Boolean.TRUE) : false;
    }

    public final boolean e() {
        a aVar = this.deviceBasedIndicators;
        if (aVar != null ? s.g(aVar.getHasAcuteTrainingLoadCapableDevice(), Boolean.TRUE) : false) {
            return true;
        }
        b bVar = this.historicalDeviceBasedIndicators;
        return bVar != null ? s.g(bVar.getHasAcuteTrainingLoadCapableDevice(), Boolean.TRUE) : false;
    }

    public final boolean e0() {
        a aVar = this.deviceBasedIndicators;
        if (aVar != null ? s.g(aVar.getHasPendingActivityCapableDevice(), Boolean.TRUE) : false) {
            return true;
        }
        b bVar = this.historicalDeviceBasedIndicators;
        return bVar != null ? s.g(bVar.getHasPendingActivityCapableDevice(), Boolean.TRUE) : false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return s.g(this.deviceBasedIndicators, eVar.deviceBasedIndicators) && s.g(this.profileBasedIndicators, eVar.profileBasedIndicators) && s.g(this.historicalDeviceBasedIndicators, eVar.historicalDeviceBasedIndicators) && s.g(this.reportAvailability, eVar.reportAvailability);
    }

    public final boolean f() {
        a aVar = this.deviceBasedIndicators;
        if (aVar != null) {
            return s.g(aVar.getHasAdaptiveCoachingNoviceCapableDevice(), Boolean.TRUE);
        }
        return false;
    }

    public final boolean f0() {
        c cVar = this.profileBasedIndicators;
        if (cVar != null) {
            return s.g(cVar.getHasPerformanceDashboard(), Boolean.TRUE);
        }
        return false;
    }

    public final boolean g() {
        a aVar = this.deviceBasedIndicators;
        if (aVar != null) {
            return s.g(aVar.getHasAdaptiveCoachingNoviceCyclingCapableDevice(), Boolean.TRUE);
        }
        return false;
    }

    public final boolean g0() {
        a aVar = this.deviceBasedIndicators;
        if (aVar != null ? s.g(aVar.getHasPowerGuidanceCapableDevice(), Boolean.TRUE) : false) {
            return true;
        }
        b bVar = this.historicalDeviceBasedIndicators;
        return bVar != null ? s.g(bVar.getHasPowerGuidanceCapableDevice(), Boolean.TRUE) : false;
    }

    public final boolean h() {
        a aVar = this.deviceBasedIndicators;
        if (aVar != null) {
            return s.g(aVar.getHasAdaptiveCoachingScheduleCapableDevice(), Boolean.TRUE);
        }
        return false;
    }

    public final boolean h0() {
        a aVar = this.deviceBasedIndicators;
        if (aVar != null) {
            return s.g(aVar.getHasPowerZonesCapableDevice(), Boolean.TRUE);
        }
        return false;
    }

    public final int hashCode() {
        a aVar = this.deviceBasedIndicators;
        int iHashCode = (aVar == null ? 0 : aVar.hashCode()) * 31;
        c cVar = this.profileBasedIndicators;
        int iHashCode2 = (iHashCode + (cVar == null ? 0 : cVar.hashCode())) * 31;
        b bVar = this.historicalDeviceBasedIndicators;
        int iHashCode3 = (iHashCode2 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        d dVar = this.reportAvailability;
        return iHashCode3 + (dVar != null ? dVar.hashCode() : 0);
    }

    public final boolean i() {
        a aVar = this.deviceBasedIndicators;
        if (aVar != null) {
            return s.g(aVar.getHasAdaptiveCoachingStrengthCapableDevice(), Boolean.TRUE);
        }
        return false;
    }

    public final boolean i0() {
        a aVar = this.deviceBasedIndicators;
        if (aVar != null) {
            return s.g(aVar.getHasPrimaryTrainingCapableDevice(), Boolean.TRUE);
        }
        return false;
    }

    public final boolean j() {
        a aVar = this.deviceBasedIndicators;
        if (aVar != null) {
            return s.g(aVar.getHasAdaptiveCoachingWalkCapableDevice(), Boolean.TRUE);
        }
        return false;
    }

    public final boolean j0() {
        a aVar = this.deviceBasedIndicators;
        if (aVar != null) {
            return s.g(aVar.getHasPulseOxSleepCapableDevice(), Boolean.TRUE);
        }
        return false;
    }

    public final boolean k() {
        a aVar = this.deviceBasedIndicators;
        if (aVar != null) {
            return s.g(aVar.getHasAdaptiveCoachingWorkoutSettingsCapableDevice(), Boolean.TRUE);
        }
        return false;
    }

    public final boolean k0() {
        if (j0()) {
            return true;
        }
        b bVar = this.historicalDeviceBasedIndicators;
        return bVar != null ? s.g(bVar.getHasPulseOxSleepCapableDevice(), Boolean.TRUE) : false;
    }

    public final boolean l() {
        a aVar = this.deviceBasedIndicators;
        if (aVar != null ? s.g(aVar.getHasAerobicTrainingEffectCapableDevice(), Boolean.TRUE) : false) {
            return true;
        }
        b bVar = this.historicalDeviceBasedIndicators;
        return bVar != null ? s.g(bVar.getHasAerobicTrainingEffectCapableDevice(), Boolean.TRUE) : false;
    }

    public final boolean l0() {
        a aVar = this.deviceBasedIndicators;
        if (aVar != null ? s.g(aVar.getHasRacePredictionsRunCapableDevice(), Boolean.TRUE) : false) {
            return true;
        }
        b bVar = this.historicalDeviceBasedIndicators;
        return bVar != null ? s.g(bVar.getHasRacePredictionsRunCapableDevice(), Boolean.TRUE) : false;
    }

    public final boolean m() {
        a aVar = this.deviceBasedIndicators;
        if (aVar != null) {
            return s.g(aVar.getHasAllDayHeartRateCapableDevice(), Boolean.TRUE);
        }
        return false;
    }

    public final boolean m0() {
        a aVar = this.deviceBasedIndicators;
        if (aVar != null) {
            return s.g(aVar.getHasRespirationCapableDevice(), Boolean.TRUE);
        }
        return false;
    }

    public final boolean n() {
        if (m()) {
            return true;
        }
        b bVar = this.historicalDeviceBasedIndicators;
        return bVar != null ? s.g(bVar.getHasAllDayHeartRateCapableDevice(), Boolean.TRUE) : false;
    }

    public final boolean n0() {
        if (m0()) {
            return true;
        }
        b bVar = this.historicalDeviceBasedIndicators;
        return bVar != null ? s.g(bVar.getHasRespirationCapableDevice(), Boolean.TRUE) : false;
    }

    public final boolean o() {
        a aVar = this.deviceBasedIndicators;
        if (aVar != null ? s.g(aVar.getHasPulseOxAllDayCapableDevice(), Boolean.TRUE) : false) {
            return true;
        }
        b bVar = this.historicalDeviceBasedIndicators;
        return bVar != null ? s.g(bVar.getHasPulseOxAllDayCapableDevice(), Boolean.TRUE) : false;
    }

    public final boolean o0() {
        a aVar = this.deviceBasedIndicators;
        if (aVar != null ? s.g(aVar.getHasRowingCapableDevice(), Boolean.TRUE) : false) {
            return true;
        }
        b bVar = this.historicalDeviceBasedIndicators;
        return bVar != null ? s.g(bVar.getHasRowingCapableDevice(), Boolean.TRUE) : false;
    }

    public final boolean p() {
        a aVar = this.deviceBasedIndicators;
        if (aVar != null) {
            return s.g(aVar.getHasAllDayStressCapableDevice(), Boolean.TRUE);
        }
        return false;
    }

    public final boolean p0() {
        a aVar = this.deviceBasedIndicators;
        if (aVar != null ? s.g(aVar.getHasRuckingWorkoutsCapableDevice(), Boolean.TRUE) : false) {
            return true;
        }
        b bVar = this.historicalDeviceBasedIndicators;
        return bVar != null ? s.g(bVar.getHasRuckingWorkoutsCapableDevice(), Boolean.TRUE) : false;
    }

    public final boolean q() {
        if (p()) {
            return true;
        }
        b bVar = this.historicalDeviceBasedIndicators;
        return bVar != null ? s.g(bVar.getHasAllDayStressCapableDevice(), Boolean.TRUE) : false;
    }

    public final boolean q0() {
        a aVar = this.deviceBasedIndicators;
        if (aVar != null) {
            return s.g(aVar.getHasRunWorkoutCapableDevice(), Boolean.TRUE);
        }
        return false;
    }

    public final boolean r() {
        a aVar = this.deviceBasedIndicators;
        if (aVar != null ? s.g(aVar.getHasAltitudeAcclimationPercentageCapableDevice(), Boolean.TRUE) : false) {
            return true;
        }
        b bVar = this.historicalDeviceBasedIndicators;
        return bVar != null ? s.g(bVar.getHasAltitudeAcclimationPercentageCapableDevice(), Boolean.TRUE) : false;
    }

    public final boolean r0() {
        a aVar = this.deviceBasedIndicators;
        if (aVar != null ? s.g(aVar.getHasRunningEconomyCapableDevice(), Boolean.TRUE) : false) {
            return true;
        }
        b bVar = this.historicalDeviceBasedIndicators;
        return bVar != null ? s.g(bVar.getHasRunningEconomyCapableDevice(), Boolean.TRUE) : false;
    }

    public final boolean s() {
        a aVar = this.deviceBasedIndicators;
        if (aVar != null ? s.g(aVar.getHasAnaerobicTrainingEffectCapableDevice(), Boolean.TRUE) : false) {
            return true;
        }
        b bVar = this.historicalDeviceBasedIndicators;
        return bVar != null ? s.g(bVar.getHasAnaerobicTrainingEffectCapableDevice(), Boolean.TRUE) : false;
    }

    public final boolean s0() {
        a aVar = this.deviceBasedIndicators;
        if (aVar != null ? s.g(aVar.getHasRunningLactateThresholdCapableDevice(), Boolean.TRUE) : false) {
            return true;
        }
        b bVar = this.historicalDeviceBasedIndicators;
        return bVar != null ? s.g(bVar.getHasRunningLactateThresholdCapableDevice(), Boolean.TRUE) : false;
    }

    public final boolean t() {
        a aVar = this.deviceBasedIndicators;
        if (aVar != null) {
            return s.g(aVar.getHasAssistancePlusCapableDevice(), Boolean.TRUE);
        }
        return false;
    }

    public final boolean t0() {
        a aVar = this.deviceBasedIndicators;
        if (aVar != null ? s.g(aVar.getHasRunningPowerZonesCapableDevice(), Boolean.TRUE) : false) {
            return true;
        }
        b bVar = this.historicalDeviceBasedIndicators;
        return bVar != null ? s.g(bVar.getHasRunningPowerZonesCapableDevice(), Boolean.TRUE) : false;
    }

    public final String toString() {
        return "UsageIndicatorsDTO(deviceBasedIndicators=" + this.deviceBasedIndicators + ", profileBasedIndicators=" + this.profileBasedIndicators + ", historicalDeviceBasedIndicators=" + this.historicalDeviceBasedIndicators + ", reportAvailability=" + this.reportAvailability + ")";
    }

    public final boolean u() {
        a aVar = this.deviceBasedIndicators;
        if (aVar != null) {
            return s.g(aVar.getHasBenchmarkExerciseCapableDevice(), Boolean.TRUE);
        }
        return false;
    }

    public final boolean u0() {
        a aVar = this.deviceBasedIndicators;
        if (aVar != null ? s.g(aVar.getHasRunningToleranceCapableDevice(), Boolean.TRUE) : false) {
            return true;
        }
        b bVar = this.historicalDeviceBasedIndicators;
        return bVar != null ? s.g(bVar.getHasRunningToleranceCapableDevice(), Boolean.TRUE) : false;
    }

    public final boolean v() {
        a aVar = this.deviceBasedIndicators;
        if (aVar != null ? s.g(aVar.getHasBenchmarkExerciseCapableDevice(), Boolean.TRUE) : false) {
            return true;
        }
        b bVar = this.historicalDeviceBasedIndicators;
        return bVar != null ? s.g(bVar.getHasBenchmarkExerciseCapableDevice(), Boolean.TRUE) : false;
    }

    public final boolean v0() {
        a aVar = this.deviceBasedIndicators;
        if (aVar != null) {
            return s.g(aVar.getHasSetBodyCompositionCapableDevice(), Boolean.TRUE);
        }
        return false;
    }

    public final boolean w() {
        a aVar = this.deviceBasedIndicators;
        if (aVar != null) {
            return s.g(aVar.getHasBikeWorkoutCapableDevice(), Boolean.TRUE);
        }
        return false;
    }

    public final boolean w0() {
        a aVar = this.deviceBasedIndicators;
        if (aVar != null ? s.g(aVar.getHasSleepAlignmentCapableDevice(), Boolean.TRUE) : false) {
            return true;
        }
        b bVar = this.historicalDeviceBasedIndicators;
        return bVar != null ? s.g(bVar.getHasSleepAlignmentCapableDevice(), Boolean.TRUE) : false;
    }

    public final boolean x() {
        a aVar = this.deviceBasedIndicators;
        if (aVar != null ? s.g(aVar.getHasBodyBatteryCapableDevice(), Boolean.TRUE) : false) {
            return true;
        }
        b bVar = this.historicalDeviceBasedIndicators;
        return bVar != null ? s.g(bVar.getHasBodyBatteryCapableDevice(), Boolean.TRUE) : false;
    }

    public final boolean x0() {
        a aVar = this.deviceBasedIndicators;
        if (aVar != null ? s.g(aVar.getHasSleepNeedCapableDevice(), Boolean.TRUE) : false) {
            return true;
        }
        b bVar = this.historicalDeviceBasedIndicators;
        return bVar != null ? s.g(bVar.getHasSleepNeedCapableDevice(), Boolean.TRUE) : false;
    }

    public final boolean y() {
        a aVar = this.deviceBasedIndicators;
        if (aVar != null ? s.g(aVar.getHasBreathingDisruptionsCapableDevice(), Boolean.TRUE) : false) {
            return true;
        }
        b bVar = this.historicalDeviceBasedIndicators;
        return bVar != null ? s.g(bVar.getHasBreathingDisruptionsCapableDevice(), Boolean.TRUE) : false;
    }

    public final boolean y0() {
        a aVar = this.deviceBasedIndicators;
        if (aVar != null ? s.g(aVar.getHasRemSleepCapableDevice(), Boolean.TRUE) : false) {
            return true;
        }
        b bVar = this.historicalDeviceBasedIndicators;
        return bVar != null ? s.g(bVar.getHasRemSleepCapableDevice(), Boolean.TRUE) : false;
    }

    public final boolean z() {
        a aVar = this.deviceBasedIndicators;
        if (aVar != null) {
            return s.g(aVar.getHasConnectedGpsCapableDevice(), Boolean.TRUE);
        }
        return false;
    }

    public final boolean z0() {
        a aVar = this.deviceBasedIndicators;
        if (aVar != null) {
            return s.g(aVar.getHasSleepScoreCapableDevice(), Boolean.TRUE);
        }
        return false;
    }

    public e(a aVar, c cVar, b bVar, d dVar) {
        this.deviceBasedIndicators = aVar;
        this.profileBasedIndicators = cVar;
        this.historicalDeviceBasedIndicators = bVar;
        this.reportAvailability = dVar;
    }

    public e() {
        this(null, null, null, null, 15, null);
    }
}

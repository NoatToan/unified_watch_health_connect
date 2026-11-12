package vv1;

import com.garmin.android.apps.connectmobile.performance.model.TrainingStatusReportDTO;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lvv1/e;", "", "Lorg/joda/time/LocalDate;", "fromCalendarDate", "toCalendarDate", "Lcom/garmin/android/apps/connectmobile/performance/model/TrainingStatusReportDTO;", "trainingLoadDTO", "<init>", "(Lorg/joda/time/LocalDate;Lorg/joda/time/LocalDate;Lcom/garmin/android/apps/connectmobile/performance/model/TrainingStatusReportDTO;)V", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDate f180542a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDate f180543b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TrainingStatusReportDTO f180544c;

    public e(LocalDate localDate, LocalDate localDate2, TrainingStatusReportDTO trainingStatusReportDTO) {
        localDate.getClass();
        localDate2.getClass();
        trainingStatusReportDTO.getClass();
        this.f180542a = localDate;
        this.f180543b = localDate2;
        this.f180544c = trainingStatusReportDTO;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f180542a.equals(eVar.f180542a) && this.f180543b.equals(eVar.f180543b) && this.f180544c.equals(eVar.f180544c);
    }

    public final int hashCode() {
        return this.f180544c.hashCode() + ((this.f180543b.hashCode() + (this.f180542a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "TrainingLoadData(fromCalendarDate=" + this.f180542a + ", toCalendarDate=" + this.f180543b + ", trainingLoadDTO=" + this.f180544c + ")";
    }
}

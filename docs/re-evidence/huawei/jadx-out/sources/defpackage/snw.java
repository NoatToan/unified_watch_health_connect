package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.HwExerciseConstants;
import java.util.Objects;

/* JADX INFO: loaded from: classes17.dex */
public class snw {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName(HwExerciseConstants.METHOD_PARAM_WORKOUT_ID)
    private String f48443b;

    @SerializedName("onlineDate")
    private String e;

    public String e() {
        return this.e;
    }

    public String toString() {
        return "TimeDaoBean{workoutId='" + this.f48443b + "', onlineDate='" + this.e + "'}";
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        snw snwVar = (snw) obj;
        return Objects.equals(this.f48443b, snwVar.f48443b) && Objects.equals(this.e, snwVar.e);
    }

    public int hashCode() {
        return Objects.hash(this.f48443b, this.e);
    }
}

package androidx.health.connect.client.records;

import com.huawei.hms.network.embedded.g4;
import com.huawei.pluginachievement.manager.model.MedalConstants;
import com.huawei.watchface.utils.constants.WatchFaceConstant;
import defpackage.zcm;
import defpackage.zcp;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0003H\u0016J\b\u0010\u0015\u001a\u00020\bH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0016"}, d2 = {"Landroidx/health/connect/client/records/PlannedExerciseBlock;", "", "repetitions", "", MedalConstants.EVENT_STEPS, "", "Landroidx/health/connect/client/records/PlannedExerciseStep;", "description", "", "<init>", "(ILjava/util/List;Ljava/lang/String;)V", "getRepetitions", "()I", "getSteps", "()Ljava/util/List;", "getDescription", "()Ljava/lang/String;", "equals", "", "other", WatchFaceConstant.HASHCODE, "toString", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PlannedExerciseBlock {
    private final String description;
    private final int repetitions;
    private final List<PlannedExerciseStep> steps;

    public PlannedExerciseBlock(int i, List<PlannedExerciseStep> list, String str) {
        zcp.c(list, "");
        this.repetitions = i;
        this.steps = list;
        this.description = str;
    }

    public /* synthetic */ PlannedExerciseBlock(int i, List list, String str, int i2, zcm zcmVar) {
        this(i, list, (i2 & 4) != 0 ? null : str);
    }

    public final int getRepetitions() {
        return this.repetitions;
    }

    public final List<PlannedExerciseStep> getSteps() {
        return this.steps;
    }

    public final String getDescription() {
        return this.description;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PlannedExerciseBlock)) {
            return false;
        }
        PlannedExerciseBlock plannedExerciseBlock = (PlannedExerciseBlock) other;
        return this.repetitions == plannedExerciseBlock.repetitions && zcp.b((Object) this.description, (Object) plannedExerciseBlock.description) && zcp.b(this.steps, plannedExerciseBlock.steps);
    }

    public int hashCode() {
        int i = this.repetitions;
        String str = this.description;
        return (((i * 31) + (str != null ? str.hashCode() : 0)) * 31) + this.steps.hashCode();
    }

    public String toString() {
        return "PlannedExerciseBlock(repetitions=" + this.repetitions + ", description=" + this.description + ", steps=" + this.steps + g4.l;
    }
}

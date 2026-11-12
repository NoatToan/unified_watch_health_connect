package y8;

import ch.qos.logback.core.CoreConstants;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u000eB9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Ly8/o0;", "", "", "exerciseType", "exercisePhase", "Ly8/p;", "completionGoal", "", "Ly8/r;", "performanceTargets", "", "description", "<init>", "(IILy8/p;Ljava/util/List;Ljava/lang/String;)V", "a", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f194924a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f194925b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p f194926c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<r> f194927d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f194928e;

    static {
        new a(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public o0(int i14, int i15, p pVar, List<? extends r> list, String str) {
        pVar.getClass();
        list.getClass();
        this.f194924a = i14;
        this.f194925b = i15;
        this.f194926c = pVar;
        this.f194927d = list;
        this.f194928e = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o0)) {
            return false;
        }
        o0 o0Var = (o0) obj;
        return this.f194924a == o0Var.f194924a && this.f194925b == o0Var.f194925b && p005kotlin.jvm.internal.s.g(this.f194928e, o0Var.f194928e) && p005kotlin.jvm.internal.s.g(this.f194926c, o0Var.f194926c) && p005kotlin.jvm.internal.s.g(this.f194927d, o0Var.f194927d);
    }

    public final int hashCode() {
        int i14 = ((this.f194924a * 31) + this.f194925b) * 31;
        String str = this.f194928e;
        return this.f194927d.hashCode() + ((this.f194926c.hashCode() + ((i14 + (str != null ? str.hashCode() : 0)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("PlannedExerciseStep(exerciseType=");
        sb3.append(this.f194924a);
        sb3.append(", exerciseCategory=");
        sb3.append(this.f194925b);
        sb3.append(", description=");
        sb3.append(this.f194928e);
        sb3.append(", completionGoal=");
        sb3.append(this.f194926c);
        sb3.append(", performanceTargets=");
        return o2.c.d(CoreConstants.RIGHT_PARENTHESIS_CHAR, this.f194927d, sb3);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006¨\u0006\f"}, d2 = {"Ly8/o0$a;", "", "<init>", "()V", "", "EXERCISE_PHASE_UNKNOWN", "I", "EXERCISE_PHASE_WARMUP", "EXERCISE_PHASE_REST", "EXERCISE_PHASE_ACTIVE", "EXERCISE_PHASE_COOLDOWN", "EXERCISE_PHASE_RECOVERY", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ o0(int i14, int i15, p pVar, List list, String str, int i16, p005kotlin.jvm.internal.j jVar) {
        this(i14, i15, pVar, list, (i16 & 16) != 0 ? null : str);
    }
}

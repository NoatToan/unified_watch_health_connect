package jx1;

import c83.a0;
import i83.f;
import i83.o;
import i83.s;
import ix1.h;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import t13.d;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\b\b\u0001\u0010\t\u001a\u00020\bH§@¢\u0006\u0004\b\n\u0010\u000b¨\u0006\fÀ\u0006\u0003"}, d2 = {"Ljx1/a;", "", "Lix1/h;", "strengthTrainingPlanDTO", "Lc83/a0;", "", "b", "(Lix1/h;Lt13/d;)Ljava/lang/Object;", "", "trainingPlanId", "a", "(JLt13/d;)Ljava/lang/Object;", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface a {
    @f("/trainingplan-service/trainingplan/strength/{trainingPlanId}/original-request")
    Object a(@s("trainingPlanId") long j8, d<? super a0<h>> dVar);

    @o("/trainingplan-service/trainingplan/strength")
    Object b(@i83.a h hVar, d<? super a0<Unit>> dVar);
}

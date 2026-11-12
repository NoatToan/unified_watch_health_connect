package defpackage;

import com.huami.moving.webapi.GetSportStatAPI;
import com.xiaomi.hm.health.traininglib.model.TrainingRecordStatInfo;
import com.xiaomi.hm.health.ui.sportfitness.manager.HistoryRecordManager;
import rx.functions.Func2;

/* JADX INFO: loaded from: classes24.dex */
public final /* synthetic */ class f14 implements Func2 {
    public final /* synthetic */ HistoryRecordManager a;

    public /* synthetic */ f14(HistoryRecordManager historyRecordManager) {
        this.a = historyRecordManager;
    }

    @Override // rx.functions.Func2
    public final Object call(Object obj, Object obj2) {
        return this.a.g0((GetSportStatAPI.StatDataEntity) obj, (TrainingRecordStatInfo) obj2);
    }
}

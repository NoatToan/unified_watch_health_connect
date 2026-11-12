package defpackage;

import com.xiaomi.hm.health.training.api.function.Consumer;
import com.xiaomi.hm.health.traininglib.model.TrainerInfo;
import rx.functions.Action1;

/* JADX INFO: loaded from: classes24.dex */
public final /* synthetic */ class tc6 implements Action1 {
    public final /* synthetic */ Consumer a;

    @Override // rx.functions.Action1
    public final void call(Object obj) {
        this.a.accept((TrainerInfo) obj);
    }
}

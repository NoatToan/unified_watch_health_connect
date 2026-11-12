package defpackage;

import com.xiaomi.hm.health.running.EnergyItemAdapter;
import java.util.ArrayList;
import rx.functions.Action1;

/* JADX INFO: loaded from: classes24.dex */
public final /* synthetic */ class sl1 implements Action1 {
    public final /* synthetic */ EnergyItemAdapter a;

    @Override // rx.functions.Action1
    public final void call(Object obj) {
        this.a.setNewData((ArrayList) obj);
    }
}

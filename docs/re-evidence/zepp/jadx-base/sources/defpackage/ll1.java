package defpackage;

import com.huami.sport.service.model.HistoryRecord;
import rx.functions.Func1;

/* JADX INFO: loaded from: classes24.dex */
public final /* synthetic */ class ll1 implements Func1 {
    public static final /* synthetic */ ll1 a = new ll1();

    @Override // rx.functions.Func1
    public final Object call(Object obj) {
        return ((HistoryRecord) obj).getDistinctKey();
    }
}

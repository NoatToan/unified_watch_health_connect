package defpackage;

import com.huami.sport.service.model.HistoryRecord;
import rx.functions.Func2;

/* JADX INFO: loaded from: classes24.dex */
public final /* synthetic */ class cw1 implements Func2 {
    public static final /* synthetic */ cw1 a = new cw1();

    @Override // rx.functions.Func2
    public final Object call(Object obj, Object obj2) {
        return Integer.valueOf(((HistoryRecord) obj).compareTo((HistoryRecord) obj2));
    }
}

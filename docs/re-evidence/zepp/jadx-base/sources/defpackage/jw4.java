package defpackage;

import java.util.List;
import rx.Observable;
import rx.functions.Func1;

/* JADX INFO: loaded from: classes24.dex */
public final /* synthetic */ class jw4 implements Func1 {
    public static final /* synthetic */ jw4 a = new jw4();

    @Override // rx.functions.Func1
    public final Object call(Object obj) {
        return Observable.from((List) obj);
    }
}

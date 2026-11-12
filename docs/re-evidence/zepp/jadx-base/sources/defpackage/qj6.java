package defpackage;

import androidx.p008lifecycle.MutableLiveData;
import io.reactivex.functions.Consumer;
import java.util.List;

/* JADX INFO: loaded from: classes24.dex */
public final /* synthetic */ class qj6 implements Consumer {
    public final /* synthetic */ MutableLiveData a;

    @Override // io.reactivex.functions.Consumer
    public final void accept(Object obj) {
        this.a.setValue((List) obj);
    }
}

package defpackage;

import androidx.p008lifecycle.MutableLiveData;
import com.huami.watch.companion.arch.Result;
import io.reactivex.functions.Consumer;

/* JADX INFO: loaded from: classes24.dex */
public final /* synthetic */ class pj6 implements Consumer {
    public final /* synthetic */ MutableLiveData a;

    @Override // io.reactivex.functions.Consumer
    public final void accept(Object obj) {
        this.a.setValue((Result) obj);
    }
}

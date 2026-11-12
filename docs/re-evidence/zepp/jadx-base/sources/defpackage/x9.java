package defpackage;

import androidx.p008lifecycle.MutableLiveData;
import com.unionpay.entity.UnionPayResource;
import io.reactivex.functions.Consumer;

/* JADX INFO: loaded from: classes13.dex */
public final /* synthetic */ class x9 implements Consumer {
    public final /* synthetic */ MutableLiveData a;

    @Override // io.reactivex.functions.Consumer
    public final void accept(Object obj) {
        this.a.setValue((UnionPayResource) obj);
    }
}

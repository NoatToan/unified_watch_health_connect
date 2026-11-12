package defpackage;

import androidx.p008lifecycle.MutableLiveData;
import com.huami.wallet.lib.entity.Resource;
import io.reactivex.functions.Consumer;

/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class rx implements Consumer {
    public final /* synthetic */ MutableLiveData a;

    @Override // io.reactivex.functions.Consumer
    public final void accept(Object obj) {
        this.a.setValue((Resource) obj);
    }
}

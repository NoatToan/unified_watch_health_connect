package defpackage;

import androidx.p008lifecycle.MediatorLiveData;
import com.huami.wallet.lib.entity.Resource;
import io.reactivex.functions.Consumer;

/* JADX INFO: loaded from: classes24.dex */
public final /* synthetic */ class il5 implements Consumer {
    public final /* synthetic */ MediatorLiveData a;

    @Override // io.reactivex.functions.Consumer
    public final void accept(Object obj) {
        this.a.setValue((Resource) obj);
    }
}

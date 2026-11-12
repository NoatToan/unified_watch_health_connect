package defpackage;

import androidx.p008lifecycle.MutableLiveData;
import com.xiaomi.hm.health.training.api.entity.Resource;
import io.reactivex.functions.Consumer;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class lu0 implements Consumer {
    public final /* synthetic */ MutableLiveData a;

    @Override // io.reactivex.functions.Consumer
    public final void accept(Object obj) {
        this.a.setValue((Resource) obj);
    }
}

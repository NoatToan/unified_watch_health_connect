package defpackage;

import com.xiaomi.hm.health.training.api.entity.Resource;
import io.reactivex.functions.Function;
import java.util.List;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class uv0 implements Function {
    public static final /* synthetic */ uv0 a = new uv0();

    @Override // io.reactivex.functions.Function
    public final Object apply(Object obj) {
        return Resource.success((List) obj);
    }
}

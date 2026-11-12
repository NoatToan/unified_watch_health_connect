package lq2;

import com.garmin.android.apps.connectmobile.util.GsonUtil;
import com.google.common.base.Optional;
import e23.l;
import java.util.List;
import p005kotlin.Metadata;
import p13.h0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class f implements l<List<String>, Optional<jq2.c>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f114365a = new f();

    @Override // e23.l
    public final Optional<jq2.c> invoke(List<String> list) {
        List<String> list2 = list;
        list2.getClass();
        String str = (String) h0.d0(list2);
        return Optional.fromNullable(str != null ? GsonUtil.f47253b.fromJson(str, jq2.c.class) : null);
    }
}

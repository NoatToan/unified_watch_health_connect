package defpackage;

import android.content.Context;
import android.os.Bundle;
import com.miui.tsmclient.entity.EidCardInfo;
import com.miui.tsmclient.model.BaseResponse;
import com.miui.tsmclient.model.mitsm.g;

/* JADX INFO: loaded from: classes2.dex */
public class kas extends g<v3s, EidCardInfo> {
    @Override // com.miui.tsmclient.model.mitsm.g, com.miui.tsmclient.model.j
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public BaseResponse b(Context context, EidCardInfo eidCardInfo) {
        return ((v3s) this.f10380a).a(context, eidCardInfo);
    }

    @Override // com.miui.tsmclient.model.mitsm.g, com.miui.tsmclient.model.j
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public BaseResponse c(Context context, EidCardInfo eidCardInfo, Bundle bundle) {
        return ((v3s) this.f10380a).a(context, eidCardInfo);
    }

    @Override // com.miui.tsmclient.model.mitsm.g
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public v3s b() {
        return new v3s();
    }
}

package com.miui.tsmclient.model.mitsm;

import android.content.Context;
import android.os.Bundle;
import com.miui.tsmclient.entity.CardInfo;
import com.miui.tsmclient.model.BaseResponse;

/* JADX INFO: loaded from: classes6.dex */
public class b extends g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c f10377b = new c(this.f10380a);

    @Override // com.miui.tsmclient.model.mitsm.g, com.miui.tsmclient.model.j
    public BaseResponse l(Context context, CardInfo cardInfo, Bundle bundle) {
        return this.f10377b.issue(context, cardInfo, bundle);
    }
}

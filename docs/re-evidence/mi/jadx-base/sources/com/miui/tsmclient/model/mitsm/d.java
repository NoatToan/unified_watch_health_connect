package com.miui.tsmclient.model.mitsm;

import android.content.Context;
import android.os.Bundle;
import com.miui.tsmclient.entity.CardInfo;
import com.miui.tsmclient.model.BaseResponse;
import com.miui.tsmclient.seitsm.TsmRpcModels;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public class d extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public f f10379a;

    public d(f fVar) {
        this.f10379a = fVar;
    }

    @Override // com.miui.tsmclient.model.mitsm.f
    public BaseResponse delete(Context context, CardInfo cardInfo, Bundle bundle) {
        return this.f10379a.delete(context, cardInfo, bundle);
    }

    @Override // com.miui.tsmclient.model.mitsm.f
    public BaseResponse executeCommands(Context context, CardInfo cardInfo, Bundle bundle) {
        return this.f10379a.executeCommands(context, cardInfo, bundle);
    }

    @Override // com.miui.tsmclient.model.mitsm.f
    public BaseResponse fixApdu(Context context, CardInfo cardInfo, Bundle bundle) {
        return this.f10379a.fixApdu(context, cardInfo, bundle);
    }

    @Override // com.miui.tsmclient.model.mitsm.f
    public TsmRpcModels.TsmSessionInfo getSession(Context context, CardInfo cardInfo, k.a aVar) throws r.a {
        return this.f10379a.getSession(context, cardInfo, aVar);
    }

    @Override // com.miui.tsmclient.model.mitsm.f
    public BaseResponse issue(Context context, CardInfo cardInfo, Bundle bundle) {
        return this.f10379a.issue(context, cardInfo, bundle);
    }

    @Override // com.miui.tsmclient.model.mitsm.f
    public BaseResponse lock(Context context, CardInfo cardInfo, Bundle bundle) {
        return this.f10379a.lock(context, cardInfo, bundle);
    }

    @Override // com.miui.tsmclient.model.mitsm.f
    public BaseResponse returnCard(Context context, CardInfo cardInfo, Bundle bundle) {
        return this.f10379a.returnCard(context, cardInfo, bundle);
    }

    @Override // com.miui.tsmclient.model.mitsm.f
    public BaseResponse syncEse(Context context, CardInfo cardInfo, TsmRpcModels.TsmSessionInfo tsmSessionInfo, Bundle bundle) throws r.a, InterruptedException, IOException {
        return this.f10379a.syncEse(context, cardInfo, tsmSessionInfo, bundle);
    }

    @Override // com.miui.tsmclient.model.mitsm.f
    public BaseResponse transferIn(Context context, CardInfo cardInfo, Bundle bundle) {
        return this.f10379a.transferIn(context, cardInfo, bundle);
    }

    @Override // com.miui.tsmclient.model.mitsm.f
    public BaseResponse transferOut(Context context, CardInfo cardInfo, Bundle bundle) {
        return this.f10379a.transferOut(context, cardInfo, bundle);
    }

    @Override // com.miui.tsmclient.model.mitsm.f
    public TsmRpcModels.TsmSessionInfo getSession(Context context, CardInfo cardInfo, k.a aVar, boolean z) throws r.a {
        return this.f10379a.getSession(context, cardInfo, aVar, z);
    }
}

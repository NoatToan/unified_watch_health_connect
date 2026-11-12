package com.ximalaya.ting.android.opensdk.model.xdcs;

import com.ximalaya.ting.android.player.xdcs.IStatToServer;
import com.ximalaya.ting.android.player.xdcs.IStatToServerFactory;

/* JADX INFO: loaded from: classes22.dex */
public class StatToServerFactoryImplForOpen implements IStatToServerFactory {
    @Override // com.ximalaya.ting.android.player.xdcs.IStatToServerFactory
    public IStatToServer getStatToServer() {
        return new StatToServerForOpen();
    }
}

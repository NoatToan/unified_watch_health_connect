package com.miui.tsmclient.model.mitsm;

import android.content.Context;
import com.miui.tsmclient.entity.CardInfo;
import com.miui.tsmclient.seitsm.TsmRpcModels;
import com.xiaomi.fitness.login.region.RegionManagerImpl;
import defpackage.b4s;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class k {
    public static k c = new k();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b4s f10389a = new b4s();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Map<String, TsmRpcModels.TsmSessionInfo> f10390b = new HashMap();

    public enum a {
        INSTALL,
        DELETE,
        RECHARGE,
        LOCK,
        QUERY,
        PREPARE_PAY,
        PERSO,
        SAVEKEY,
        TRANSFER_OUT,
        TRANSFER_IN,
        OUT_INSTALL,
        OUT_RECHARGE,
        OUT_RETURN,
        OUT_EXECUTE,
        INTERNAL_RETURN,
        READ_CARD,
        UPDATE
    }

    public static k a() {
        return c;
    }

    public TsmRpcModels.TsmSessionInfo b(CardInfo cardInfo, a aVar) {
        TsmRpcModels.TsmSessionInfo tsmSessionInfoRemove;
        synchronized (this.f10390b) {
            tsmSessionInfoRemove = this.f10390b.remove(a(cardInfo, aVar));
        }
        return tsmSessionInfoRemove;
    }

    public final String a(CardInfo cardInfo, a aVar) {
        if (cardInfo == null || aVar == null) {
            return null;
        }
        return cardInfo.mCardType + RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR + aVar.toString();
    }

    public TsmRpcModels.TsmSessionInfo a(Context context, CardInfo cardInfo) throws r.a {
        return this.f10389a.createSession(context, cardInfo);
    }

    public TsmRpcModels.TsmSessionInfo a(Context context, CardInfo cardInfo, a aVar, boolean z) throws r.a {
        TsmRpcModels.TsmSessionInfo tsmSessionInfo;
        String strA = a(cardInfo, aVar);
        synchronized (this.f10390b) {
            if (!this.f10390b.containsKey(strA) || z) {
                this.f10390b.put(strA, this.f10389a.createSession(context, cardInfo));
            }
            tsmSessionInfo = this.f10390b.get(strA);
        }
        return tsmSessionInfo;
    }
}

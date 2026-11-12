package com.xiaomi.hm.health.ui.sportfitness.utils;

import com.huami.widget.share.ShareExerClassifyTimesCallback;

/* JADX INFO: loaded from: classes22.dex */
public class ShareSportTimesGetter implements ShareExerClassifyTimesCallback {
    private static volatile ShareSportTimesGetter b;
    private ShareExerClassifyTimesCallback a;

    private ShareSportTimesGetter() {
    }

    public static ShareSportTimesGetter getInstance() {
        if (b == null) {
            synchronized (ShareSportTimesGetter.class) {
                if (b == null) {
                    b = new ShareSportTimesGetter();
                }
            }
        }
        return b;
    }

    @Override // com.huami.widget.share.ShareExerClassifyTimesCallback
    public int getExerTimesBySportType(int sportType) {
        ShareExerClassifyTimesCallback shareExerClassifyTimesCallback = this.a;
        if (shareExerClassifyTimesCallback != null) {
            return shareExerClassifyTimesCallback.getExerTimesBySportType(sportType);
        }
        return 0;
    }

    public void setClient(ShareExerClassifyTimesCallback client) {
        this.a = client;
    }
}

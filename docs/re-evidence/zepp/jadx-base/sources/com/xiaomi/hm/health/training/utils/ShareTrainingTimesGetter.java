package com.xiaomi.hm.health.training.utils;

import com.huami.widget.share.ShareExerClassifyTimesCallback;

/* JADX INFO: loaded from: classes22.dex */
public class ShareTrainingTimesGetter implements ShareExerClassifyTimesCallback {
    private static volatile ShareTrainingTimesGetter b;
    private ShareExerClassifyTimesCallback a;

    private ShareTrainingTimesGetter() {
    }

    public static ShareTrainingTimesGetter getInstance() {
        if (b == null) {
            synchronized (ShareTrainingTimesGetter.class) {
                if (b == null) {
                    b = new ShareTrainingTimesGetter();
                }
            }
        }
        return b;
    }

    @Override // com.huami.widget.share.ShareExerClassifyTimesCallback
    public int getExerTimesBySportType(int i) {
        ShareExerClassifyTimesCallback shareExerClassifyTimesCallback = this.a;
        if (shareExerClassifyTimesCallback != null) {
            return shareExerClassifyTimesCallback.getExerTimesBySportType(i);
        }
        return 0;
    }

    public void setClient(ShareExerClassifyTimesCallback shareExerClassifyTimesCallback) {
        this.a = shareExerClassifyTimesCallback;
    }
}

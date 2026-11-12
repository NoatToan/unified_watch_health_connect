package com.huawei.openalliance.ad.views.interfaces;

import android.content.Context;
import android.view.View;
import com.huawei.hms.ads.uiengine.common.MediaStateApi;
import com.huawei.openalliance.ad.beans.parameter.AdSlotParam;
import com.huawei.openalliance.ad.constant.AdLoadMode;
import com.huawei.openalliance.ad.db.bean.ContentRecord;
import com.huawei.openalliance.ad.ht;
import com.huawei.openalliance.ad.js;
import com.huawei.openalliance.ad.lu;

/* JADX INFO: loaded from: classes12.dex */
public interface l extends js, lu {
    n a(int i);

    void a();

    void a(int i, int i2, String str, boolean z, Integer num);

    void a(int i, boolean z);

    void a(View view, ContentRecord contentRecord);

    void a(AdLoadMode adLoadMode);

    void a(ContentRecord contentRecord);

    void a(ContentRecord contentRecord, int i);

    void a(ht htVar);

    void a(n nVar, ContentRecord contentRecord);

    Integer b(ContentRecord contentRecord);

    void b();

    void b(int i);

    AdSlotParam getAdSlotParam();

    int getAdType();

    int getAudioFocusType();

    Context getContext();

    MediaStateApi getMediaProxy();
}

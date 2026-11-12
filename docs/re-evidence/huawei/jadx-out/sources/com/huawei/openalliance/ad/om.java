package com.huawei.openalliance.ad;

import android.view.View;
import com.huawei.hms.ads.uiengine.IRemoteCreator;
import com.huawei.openalliance.ad.db.bean.ContentRecord;
import com.huawei.openalliance.ad.inter.data.MaterialClickInfo;
import com.huawei.openalliance.ad.inter.listeners.IRewardAdStatusListener;
import com.huawei.openalliance.ad.views.interfaces.k;

/* JADX INFO: loaded from: classes12.dex */
public interface om<V extends com.huawei.openalliance.ad.views.interfaces.k> {
    int a(ContentRecord contentRecord, int i);

    View a(IRemoteCreator iRemoteCreator, by byVar, ContentRecord contentRecord, com.huawei.openalliance.ad.inter.data.i iVar);

    String a(int i, int i2, com.huawei.openalliance.ad.inter.data.i iVar);

    void a();

    void a(long j);

    void a(long j, int i, int i2, int i3);

    void a(long j, int i, Integer num);

    void a(long j, long j2);

    void a(String str);

    void a(String str, ContentRecord contentRecord);

    void a(String str, com.huawei.openalliance.ad.inter.data.i iVar, IRewardAdStatusListener iRewardAdStatusListener);

    void a(boolean z);

    boolean a(int i, MaterialClickInfo materialClickInfo);

    boolean a(com.huawei.openalliance.ad.inter.data.i iVar);

    boolean a(String str, int i);

    void b();

    void b(String str);

    void b(String str, com.huawei.openalliance.ad.inter.data.i iVar, IRewardAdStatusListener iRewardAdStatusListener);

    boolean b(ContentRecord contentRecord);

    boolean b(com.huawei.openalliance.ad.inter.data.i iVar);

    void c(com.huawei.openalliance.ad.inter.data.i iVar);

    boolean c();
}

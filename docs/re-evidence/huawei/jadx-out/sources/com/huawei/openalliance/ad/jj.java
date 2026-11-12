package com.huawei.openalliance.ad;

import com.huawei.openalliance.ad.constant.AdLoadState;
import com.huawei.openalliance.ad.db.bean.ContentRecord;
import com.huawei.openalliance.ad.inter.data.BiddingInfo;
import com.huawei.openalliance.ad.inter.data.MaterialClickInfo;
import com.huawei.openalliance.ad.inter.data.RewardVerifyConfig;
import com.huawei.openalliance.ad.inter.listeners.AdActionListener;
import com.huawei.openalliance.ad.inter.listeners.AdListener;
import com.huawei.openalliance.ad.inter.listeners.AdShowListener;

/* JADX INFO: loaded from: classes12.dex */
public interface jj {
    void A();

    void B();

    void a(int i);

    void a(int i, int i2);

    void a(long j);

    void a(ContentRecord contentRecord);

    void a(ContentRecord contentRecord, long j, int i);

    void a(RewardVerifyConfig rewardVerifyConfig);

    void a(AdActionListener adActionListener);

    void a(AdListener adListener);

    void a(AdShowListener adShowListener);

    boolean a(int i, int i2, ContentRecord contentRecord, Long l, MaterialClickInfo materialClickInfo, int i3);

    AdLoadState b();

    void b(int i);

    void b(long j);

    void c(int i);

    boolean c(ContentRecord contentRecord);

    int d();

    void e();

    void e(int i);

    void f();

    void f(int i);

    void f(ContentRecord contentRecord);

    void i();

    void j();

    void s();

    boolean t();

    void u();

    void v();

    String w();

    BiddingInfo x();

    String y();
}

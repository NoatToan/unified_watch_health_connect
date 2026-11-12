package com.huawei.openalliance.ad.views.interfaces;

import android.view.View;
import com.huawei.openalliance.ad.db.bean.ContentRecord;
import com.huawei.openalliance.ad.jj;
import com.huawei.openalliance.ad.js;
import com.huawei.openalliance.ad.lu;
import com.huawei.openalliance.ad.mh;

/* JADX INFO: loaded from: classes41.dex */
public interface n extends js, lu, IViewLifeCycle {
    void a(int i);

    void a(int i, int i2);

    void a(int i, int i2, int i3);

    void a(View view, Integer num);

    void a(mh mhVar);

    void b();

    void c();

    void c(int i);

    void d();

    boolean e();

    void g();

    jj getAdMediator();

    void h();

    boolean i();

    void setAdContent(ContentRecord contentRecord);

    void setAdMediator(jj jjVar);

    void setAudioFocusType(int i);
}

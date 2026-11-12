package com.huawei.openalliance.ad;

import android.content.Context;
import com.huawei.openalliance.ad.beans.metadata.ReduceDisturbRule;
import com.huawei.openalliance.ad.beans.metadata.Rule;
import com.huawei.openalliance.ad.db.bean.UserCloseRecord;
import java.util.Date;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class sq implements te {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private gn f20275a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private gk f20276b;

    @Override // com.huawei.openalliance.ad.te
    public void b() {
        com.huawei.openalliance.ad.utils.o.a(new Runnable() { // from class: com.huawei.openalliance.ad.sq.2
            @Override // java.lang.Runnable
            public void run() {
                String strB = com.huawei.openalliance.ad.utils.as.b("yyyy-MM-dd");
                if (!strB.equals(sq.this.f20276b.be())) {
                    sq.this.f20276b.e(strB);
                    sq.this.f20276b.e(0);
                }
                sq.this.f20276b.e(sq.this.f20276b.bd() + 1);
            }
        });
    }

    @Override // com.huawei.openalliance.ad.te
    public void a() {
        final UserCloseRecord userCloseRecord = new UserCloseRecord();
        userCloseRecord.a(com.huawei.openalliance.ad.utils.as.c());
        userCloseRecord.a(com.huawei.openalliance.ad.utils.as.b("yyyy-MM-dd HH:mm:ss"));
        final long time = com.huawei.openalliance.ad.utils.as.a(new Date(), this.f20276b.bq()).getTime();
        com.huawei.openalliance.ad.utils.o.a(new Runnable() { // from class: com.huawei.openalliance.ad.sq.1
            @Override // java.lang.Runnable
            public void run() {
                sq.this.f20275a.a(userCloseRecord);
                sq.this.f20275a.a(time);
                sq.this.c();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        ReduceDisturbRule reduceDisturbRule;
        List<Rule> listA;
        String strA = this.f20276b.a();
        if (com.huawei.openalliance.ad.utils.dg.b(strA) || (reduceDisturbRule = (ReduceDisturbRule) com.huawei.openalliance.ad.utils.bk.b(strA, ReduceDisturbRule.class, new Class[0])) == null || (listA = reduceDisturbRule.a()) == null) {
            return;
        }
        long jC = com.huawei.openalliance.ad.utils.as.c();
        long jD = 0;
        for (Rule rule : listA) {
            if (a(rule)) {
                int size = this.f20275a.a(com.huawei.openalliance.ad.utils.as.a(new Date(), rule.a()).getTime(), jC).size();
                if (size >= rule.b() && size <= rule.c() && jD <= rule.d()) {
                    jD = rule.d();
                }
            }
        }
        this.f20276b.d(jD + jC);
    }

    private boolean a(Rule rule) {
        return rule != null && rule.a() <= this.f20276b.bq() && rule.a() >= 1 && rule.b() > 0 && rule.c() > 0 && rule.d() > 0;
    }

    public sq(Context context) {
        this.f20276b = null;
        this.f20276b = fp.b(context);
        this.f20275a = fu.a(context);
    }
}

package com.huawei.basichealthmodel.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import com.huawei.health.healthmodel.bean.HealthLifeBean;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.checkbox.HealthCheckBox;
import defpackage.cap;
import defpackage.cbg;
import defpackage.cbk;
import defpackage.njy;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes23.dex */
public class HealthModelCheckBox extends HealthCheckBox {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<cap> f5369b;
    private cap d;
    private boolean e;

    public HealthModelCheckBox(Context context) {
        this(context, null);
    }

    public HealthModelCheckBox(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public HealthModelCheckBox(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public void setData(List<cap> list, cap capVar, boolean z) {
        boolean z2;
        HealthLifeBean healthLifeBeanE;
        if (njy.e(list) || capVar == null) {
            LogUtil.j("HL_HealthModelCheckBox", "setData dataList is empty or bean is null");
            return;
        }
        Iterator<cap> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                z2 = false;
                break;
            }
            cap next = it.next();
            if (next != null && (healthLifeBeanE = next.e()) != null && healthLifeBeanE.getTaskType() == 1) {
                LogUtil.a("HL_HealthModelCheckBox", "setData isBasicType true dbBean ", healthLifeBeanE.toString());
                z2 = true;
                break;
            }
        }
        this.f5369b = list;
        this.d = capVar;
        this.e = true;
        HealthLifeBean healthLifeBeanE2 = capVar.e();
        if (healthLifeBeanE2 == null) {
            LogUtil.j("HL_HealthModelCheckBox", "setData healthTaskSubscriptionDbBean is null");
            return;
        }
        super.setChecked(healthLifeBeanE2.getAddStatus() == 1);
        if (z2) {
            if (healthLifeBeanE2.getTaskType() == 1) {
                healthLifeBeanE2.setAddStatus(1);
                super.setChecked(true);
            }
        } else if (cbg.c().contains(Integer.valueOf(healthLifeBeanE2.getId()))) {
            healthLifeBeanE2.setAddStatus(1);
            super.setChecked(true);
        }
        this.e = z;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        cap capVar;
        if (this.f5369b == null || (capVar = this.d) == null || !this.e) {
            return;
        }
        HealthLifeBean healthLifeBeanE = capVar.e();
        if (healthLifeBeanE == null) {
            LogUtil.j("HL_HealthModelCheckBox", "setChecked tomorrowBean is null");
            return;
        }
        int id = healthLifeBeanE.getId();
        if (!cbg.b(id)) {
            LogUtil.j("HL_HealthModelCheckBox", "setChecked taskId is not support");
            return;
        }
        super.setChecked(z);
        cbk.c(id, z);
        if (z) {
            if (healthLifeBeanE.getAddStatus() != 1 && this.d.d() != 3001) {
                LogUtil.a("HL_HealthModelCheckBox", "setChecked tomorrowBean newType is HEALTH_MODEL_NEW_TASK_TYPE");
                this.d.c(3000);
            } else {
                this.d.c(0);
            }
        } else if (this.d.d() == 3000) {
            this.d.c(0);
        } else {
            this.d.c(3001);
        }
        healthLifeBeanE.setAddStatus(z ? 1 : 0);
    }
}

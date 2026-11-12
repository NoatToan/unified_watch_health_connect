package com.huawei.hianalytics.visual;

import android.app.Activity;
import com.huawei.hianalytics.core.log.HiLog;
import com.huawei.hianalytics.visual.autocollect.exposure.ViewMark;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes33.dex */
public final class q1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final q1 f11686b = new q1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f11687a = new HashMap();

    public final void a() {
        synchronized (this) {
            if (w.a().f()) {
                this.f11687a.clear();
                HiLog.d("ViewMarkCache", "view mark clear: auto collect disabled");
                return;
            }
            u uVar = u.f11699c;
            Activity activityB = uVar.b();
            Activity activityC = uVar.c();
            if (activityB == null && activityC == null) {
                this.f11687a.clear();
                HiLog.d("ViewMarkCache", "view mark clear: activity null");
                return;
            }
            List list = activityC != null ? (List) this.f11687a.get(Integer.valueOf(activityC.hashCode())) : (List) this.f11687a.get(Integer.valueOf(activityB.hashCode()));
            this.f11687a.clear();
            if (list != null && !list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    w.a().a((ViewMark) it.next());
                }
            }
        }
    }
}

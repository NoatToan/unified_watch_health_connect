package com.huawei.hianalytics.framework.datahandler;

import android.text.TextUtils;
import com.huawei.hianalytics.core.log.HiLog;
import com.huawei.hianalytics.core.storage.Event;
import com.huawei.hianalytics.core.storage.IStorageHandler;
import com.huawei.hianalytics.framework.b;
import com.huawei.hianalytics.framework.config.IMandatoryParameters;
import com.huawei.hianalytics.framework.j;
import com.huawei.hianalytics.framework.w;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class ReportTask implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11514a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f11515b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f11516c;
    public final IMandatoryParameters d = b.e.f11498a;
    public final int e;
    public final int f;
    public boolean g;

    public ReportTask(String str, String str2, String str3, int i, int i2) {
        this.f11514a = str;
        this.f11515b = str2;
        this.f11516c = str3;
        this.e = i;
        this.f = i2;
    }

    public final void a(String str, String str2) {
        IStorageHandler iStorageHandlerC = j.c(str);
        if (iStorageHandlerC == null) {
            HiLog.e("ReportTask", "storage handler is null");
            return;
        }
        List<Event> oldEvents = this.g ? iStorageHandlerC.readOldEvents(str, str2) : iStorageHandlerC.readEvents(str, str2);
        if (oldEvents != null && !oldEvents.isEmpty()) {
            new w(str, str2, oldEvents, null, this.f11516c, this.e, this.f).a();
            return;
        }
        HiLog.sw("ReportTask", "events size is empty, tag: " + str);
    }

    @Override // java.lang.Runnable
    public void run() {
        if (TextUtils.isEmpty(this.f11514a) && TextUtils.isEmpty(this.f11515b)) {
            this.g = true;
            for (String str : this.d.getAllTags()) {
                a(str, "oper");
                a(str, "maint");
            }
            return;
        }
        if (!"_default_config_tag".equals(this.f11514a) || !"allType".equals(this.f11515b)) {
            a(this.f11514a, this.f11515b);
            return;
        }
        String str2 = this.f11514a;
        a(str2, "oper");
        a(str2, "maint");
    }
}

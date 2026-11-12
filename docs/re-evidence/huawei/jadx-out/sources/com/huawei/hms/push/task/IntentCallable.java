package com.huawei.hms.push.task;

import android.content.Context;
import android.content.Intent;
import com.huawei.hms.aaid.constant.ErrorEnum;
import com.huawei.hms.push.utils.PushBiUtil;
import com.huawei.hms.support.api.entity.push.PushNaming;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes10.dex */
public class IntentCallable implements Callable<Void> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f15881a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Intent f15882b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f15883c;

    public IntentCallable(Context context, Intent intent, String str) {
        this.f15881a = context;
        this.f15882b = intent;
        this.f15883c = str;
    }

    @Override // java.util.concurrent.Callable
    public Void call() throws Exception {
        this.f15881a.sendBroadcast(this.f15882b);
        PushBiUtil.reportExit(this.f15881a, PushNaming.SET_NOTIFY_FLAG, this.f15883c, ErrorEnum.SUCCESS);
        return null;
    }
}

package com.huawei.hms.opendevice;

import android.content.Context;
import com.huawei.hms.aaid.constant.ErrorEnum;
import com.huawei.hms.aaid.entity.AAIDResult;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes34.dex */
public class a implements Callable<AAIDResult> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f15803a;

    public a(Context context) {
        this.f15803a = context;
    }

    @Override // java.util.concurrent.Callable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public AAIDResult call() throws Exception {
        Context context = this.f15803a;
        if (context == null) {
            throw ErrorEnum.ERROR_ARGUMENTS_INVALID.toApiException();
        }
        String strB = b.b(context);
        AAIDResult aAIDResult = new AAIDResult();
        aAIDResult.setId(strB);
        return aAIDResult;
    }
}

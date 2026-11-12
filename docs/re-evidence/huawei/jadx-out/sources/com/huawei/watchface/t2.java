package com.huawei.watchface;

import android.text.TextUtils;
import com.huawei.watchface.api.ResponseListener;
import com.huawei.watchface.mvp.model.helper.GsonHelper;
import com.huawei.watchface.mvp.model.thread.BaseHttpRequest;
import com.huawei.watchface.utils.BackgroundTaskUtils;
import com.huawei.watchface.utils.HwLog;
import java.lang.reflect.ParameterizedType;

/* JADX INFO: loaded from: classes20.dex */
public abstract class t2 extends BaseHttpRequest {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f30575b = "t2";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Class f30576a;

    public void a(final ResponseListener responseListener, final String str, Class cls) {
        this.f30576a = cls;
        if (responseListener == null) {
            return;
        }
        BackgroundTaskUtils.submit(new Runnable() { // from class: com.huawei.watchface.t2$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.a(str, responseListener);
            }
        });
    }

    public Object b(String str) {
        Class cls;
        try {
            cls = (Class) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
        } catch (Exception e) {
            HwLog.e(f30575b, "dealReceive Exception:" + HwLog.printException(e));
            cls = null;
        }
        if (cls == null) {
            HwLog.i(f30575b, "dealReceive cls is null");
            cls = this.f30576a;
        }
        return a(str, cls);
    }

    public abstract String c(String str);

    public final /* synthetic */ void a(String str, ResponseListener responseListener) {
        String strC = c(str);
        if (strC != null && !TextUtils.isEmpty(strC)) {
            Object objB = b(strC);
            if (objB != null) {
                responseListener.onResponse(objB);
                return;
            } else {
                responseListener.onError();
                return;
            }
        }
        HwLog.e(f30575b, "response is null or empty");
        responseListener.onError();
    }

    public Object a(String str, Class cls) {
        try {
            return GsonHelper.fromJson(str, cls);
        } catch (Exception e) {
            HwLog.e(f30575b, "handleJsonData exception: " + HwLog.printException(e));
            return null;
        }
    }
}

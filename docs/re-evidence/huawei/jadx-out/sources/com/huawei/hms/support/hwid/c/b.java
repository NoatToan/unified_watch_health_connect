package com.huawei.hms.support.hwid.c;

import android.app.PendingIntent;
import android.text.TextUtils;
import com.huawei.hmf.tasks.TaskCompletionSource;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.common.ResolvableApiException;
import com.huawei.hms.common.internal.ResponseErrorCode;
import com.huawei.hms.common.internal.TaskApiCall;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.huawei.hms.utils.Util;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes10.dex */
public abstract class b<T> extends TaskApiCall<com.huawei.hms.support.hwid.a.a, T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final String f16603a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f16604b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f16605c;

    protected boolean a() {
        return true;
    }

    @Override // com.huawei.hms.common.internal.TaskApiCall
    public int getApiLevel() {
        return 1;
    }

    public b(String str, String str2, String str3) {
        super(str, str2, str3);
        this.f16603a = "[HUAWEIIDSDK]" + getClass().getSimpleName();
        this.f16604b = 40004300;
        this.f16605c = str;
    }

    public b(String str, String str2, int i) {
        this(str, str2, (String) null);
        this.f16604b = i;
        this.f16605c = str;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.huawei.hms.common.internal.TaskApiCall
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void doExecute(com.huawei.hms.support.hwid.a.a aVar, ResponseErrorCode responseErrorCode, String str, TaskCompletionSource<T> taskCompletionSource) {
        a(responseErrorCode, str);
        if (responseErrorCode.getErrorCode() != 0) {
            if (CommonCode.Resolution.HAS_RESOLUTION.equals(responseErrorCode.getResolution())) {
                com.huawei.hms.support.hwid.common.e.e.a(this.f16603a, "hms apk version is low or is not exist.");
                taskCompletionSource.setException(new ResolvableApiException(new Status(responseErrorCode.getErrorCode(), responseErrorCode.getErrorReason(), (PendingIntent) responseErrorCode.getParcelable())));
                a(aVar, responseErrorCode.getErrorCode());
                return;
            }
            if (a()) {
                com.huawei.hms.support.hwid.common.e.e.a(this.f16603a, " error.");
                a(aVar, responseErrorCode.getErrorCode());
                taskCompletionSource.setException(new ApiException(new Status(responseErrorCode.getErrorCode(), responseErrorCode.getErrorReason())));
                return;
            }
        }
        a(aVar, responseErrorCode.getErrorCode());
        a(responseErrorCode, str, taskCompletionSource);
    }

    @Override // com.huawei.hms.common.internal.TaskApiCall
    @Deprecated
    public int getMinApkVersion() {
        return this.f16604b;
    }

    private String a(Class cls) {
        try {
            ArrayList<String> arrayListB = b(cls);
            com.huawei.hms.support.hwid.common.e.e.a(this.f16603a, "Generic names : " + arrayListB.toString());
            if (arrayListB.contains(com.huawei.hms.support.hwid.a.a.class.getName())) {
                arrayListB.remove(com.huawei.hms.support.hwid.a.a.class.getName());
            }
            if (arrayListB.size() < 1) {
                return "";
            }
            return arrayListB.get(0);
        } catch (RuntimeException unused) {
            com.huawei.hms.support.hwid.common.e.e.a(this.f16603a, "Generic name ：unknown runtimeException");
            return "";
        } catch (Exception unused2) {
            com.huawei.hms.support.hwid.common.e.e.a(this.f16603a, "Generic name ：unknown exception");
            return "";
        }
    }

    private ArrayList<String> b(Class cls) {
        Type[] actualTypeArguments;
        ArrayList<String> arrayList = new ArrayList<>();
        if (cls != null) {
            try {
                Type genericSuperclass = cls.getGenericSuperclass();
                if (genericSuperclass != null && (actualTypeArguments = ((ParameterizedType) genericSuperclass).getActualTypeArguments()) != null && actualTypeArguments.length >= 1) {
                    for (Type type : actualTypeArguments) {
                        arrayList.add(type.toString().replace("class", "").trim());
                    }
                }
            } catch (RuntimeException unused) {
                com.huawei.hms.support.hwid.common.e.e.a(this.f16603a, "Generic names ：unknown runtimeException");
                return new ArrayList<>();
            } catch (Exception unused2) {
                com.huawei.hms.support.hwid.common.e.e.a(this.f16603a, "Generic names ：unknown exception");
                return new ArrayList<>();
            }
        }
        return arrayList;
    }

    protected void a(ResponseErrorCode responseErrorCode, String str, TaskCompletionSource<T> taskCompletionSource) {
        if (TextUtils.isEmpty(str)) {
            com.huawei.hms.support.hwid.common.e.e.a(this.f16603a, "body is null");
            taskCompletionSource.setException(new ApiException(new Status(responseErrorCode.getErrorCode(), responseErrorCode.getErrorReason())));
            return;
        }
        String strA = a(getClass());
        com.huawei.hms.support.hwid.common.e.e.a(this.f16603a, "Generic name  = " + strA);
        if (strA.contains(String.class.getName())) {
            taskCompletionSource.setResult(str);
        } else if (strA.contains(Void.class.getName())) {
            taskCompletionSource.setResult(null);
        }
    }

    private void a(ResponseErrorCode responseErrorCode, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("headerErrorCode:" + responseErrorCode.getErrorCode());
        sb.append(",headerErrorReason:" + responseErrorCode.getErrorReason());
        com.huawei.hms.support.hwid.common.e.e.a(this.f16603a, sb.toString(), false);
    }

    private void a(com.huawei.hms.support.hwid.a.a aVar, int i) {
        if (aVar != null) {
            com.huawei.hms.support.hwid.common.e.e.a(this.f16603a, "report:, apiName:" + this.f16605c + ", transId:" + getTransactionId() + ", statusCode:" + i + ", appId:" + Util.getAppId(aVar.getContext()));
        }
    }
}

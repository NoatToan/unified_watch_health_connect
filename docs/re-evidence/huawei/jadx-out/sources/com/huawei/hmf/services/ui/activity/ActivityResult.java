package com.huawei.hmf.services.ui.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.huawei.hmf.annotation.ActivityDefine;
import com.huawei.hmf.services.codec.MessageCodec;
import com.huawei.hmf.services.ui.internal.ActivityData;
import com.huawei.hmf.services.ui.internal.PojoGenerator;
import com.huawei.hmf.services.ui.internal.SecurityIntent;

/* JADX INFO: loaded from: classes33.dex */
public class ActivityResult<T> {
    private static final String TAG = "ActivityResult";
    private PojoGenerator<T> mPojoGenerator;
    private T mResult;
    private String mResultType;

    private ActivityResult(Activity activity) {
        this.mResultType = new ActivityData(activity.getIntent()).getResultType();
        Class<?> clsResult = ((ActivityDefine) activity.getClass().getAnnotation(ActivityDefine.class)).result();
        if (clsResult.isInterface()) {
            PojoGenerator<T> pojoGenerator = new PojoGenerator<>(clsResult);
            this.mPojoGenerator = pojoGenerator;
            this.mResult = pojoGenerator.get();
        } else {
            try {
                this.mResult = (T) clsResult.newInstance();
            } catch (Exception unused) {
            }
        }
    }

    private ActivityResult(Intent intent) {
        T t;
        if (intent == null) {
            return;
        }
        SecurityIntent securityIntentFrom = SecurityIntent.from(intent);
        String stringExtra = securityIntentFrom.getStringExtra("__ResultClassname__");
        this.mResultType = stringExtra;
        if (stringExtra == null) {
            return;
        }
        try {
            Class<?> cls = Class.forName(stringExtra);
            if (cls.isInterface()) {
                t = (T) new PojoGenerator(cls);
            } else {
                t = (T) cls.newInstance();
            }
            new MessageCodec().decode(securityIntentFrom.getBundleExtra("__Result__"), t);
            if (t instanceof PojoGenerator) {
                this.mResult = (T) ((PojoGenerator) t).get();
            } else {
                this.mResult = t;
            }
        } catch (Exception e) {
            Log.e(TAG, "Instancing ActivityResult exception.", e);
        }
    }

    public T get() {
        return this.mResult;
    }

    public Intent toIntent() {
        Intent intent = new Intent();
        Object obj = this.mResult;
        if (obj == null) {
            return intent;
        }
        PojoGenerator<T> pojoGenerator = this.mPojoGenerator;
        if (pojoGenerator != null) {
            obj = pojoGenerator;
        }
        intent.putExtra("__ResultClassname__", this.mResultType);
        intent.putExtra("__Result__", new MessageCodec().encode(obj, new Bundle()));
        return intent;
    }

    public static <R> ActivityResult<R> create(Activity activity) {
        return new ActivityResult<>(activity);
    }

    public static <R> ActivityResult<R> createFromResultIntent(Intent intent) {
        return new ActivityResult<>(intent);
    }
}

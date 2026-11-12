package com.huami.watch.companion.ecg.ui.activity;

import android.os.Bundle;
import com.chenenyu.router.template.ParamInjector;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes16.dex */
public class EcgDetailActivity$$Router$$ParamInjector implements ParamInjector {
    @Override // com.chenenyu.router.template.ParamInjector
    public void inject(Object obj) {
        EcgDetailActivity ecgDetailActivity = (EcgDetailActivity) obj;
        Bundle extras = ecgDetailActivity.getIntent().getExtras();
        try {
            Field declaredField = EcgDetailActivity.class.getDeclaredField("c");
            declaredField.setAccessible(true);
            declaredField.set(ecgDetailActivity, Long.valueOf(extras.getLong("timestamp", ((Long) declaredField.get(ecgDetailActivity)).longValue())));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

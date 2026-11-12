package com.huawei.health.knit.section.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class BaseBiItemView extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected Map<String, Object> f7578a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected Context f7579b;

    public void c() {
    }

    public BaseBiItemView(Context context, int i) {
        super(context);
        this.f7579b = context;
        a(context, i);
    }

    private void a(Context context, int i) {
        LayoutInflater.from(context).inflate(i, (ViewGroup) this, true);
    }

    public void a(Map<String, Object> map) {
        this.f7578a = map;
    }
}

package com.huawei.health.h5pro.vengine;

import android.view.View;

/* JADX INFO: loaded from: classes7.dex */
public class H5ProNativeView {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private View f7006c;
    private String d;
    private H5ProEventInterceptor e;

    public H5ProNativeView() {
    }

    public H5ProNativeView(View view) {
        this.f7006c = view;
    }

    public H5ProNativeView(View view, String str) {
        this.f7006c = view;
        this.d = str;
    }

    public View getView() {
        return this.f7006c;
    }

    public void setView(View view) {
        this.f7006c = view;
    }

    public String getData() {
        return this.d;
    }

    public void setData(String str) {
        this.d = str;
    }

    public H5ProEventInterceptor getEventInterceptor() {
        return this.e;
    }

    public void setEventInterceptor(H5ProEventInterceptor h5ProEventInterceptor) {
        this.e = h5ProEventInterceptor;
    }
}

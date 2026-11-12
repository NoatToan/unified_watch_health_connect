package com.huawei.phoneservice.feedback.entity;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import java.io.Serializable;

/* JADX INFO: loaded from: classes13.dex */
public class c implements Serializable {
    private static final long serialVersionUID = -3865037260659453289L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ImageView f21641a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private TextView f21642b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private View f21643c;
    private ImageView d;
    private String e;
    private int i;
    private String j;

    public View j() {
        return this.f21643c;
    }

    public TextView i() {
        return this.f21642b;
    }

    public String d() {
        return this.j;
    }

    public String c() {
        return this.e;
    }

    public int a() {
        return this.i;
    }

    public void d(String str) {
        this.j = str;
    }

    public void a(ImageView imageView) {
        this.d = imageView;
    }

    public ImageView e() {
        return this.d;
    }

    public void a(String str) {
        this.e = str;
    }

    public void a(TextView textView) {
        this.f21642b = textView;
    }

    public void c(ImageView imageView) {
        this.f21641a = imageView;
    }

    public void c(View view) {
        this.f21643c = view;
    }

    public void b(int i) {
        this.i = i;
    }

    public ImageView b() {
        return this.f21641a;
    }
}

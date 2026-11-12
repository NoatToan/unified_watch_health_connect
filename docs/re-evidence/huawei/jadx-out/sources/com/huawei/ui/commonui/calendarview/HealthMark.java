package com.huawei.ui.commonui.calendarview;

import android.graphics.drawable.Drawable;
import android.view.View;
import java.io.Serializable;

/* JADX INFO: loaded from: classes16.dex */
public class HealthMark implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f23328a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private transient Drawable f23329b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f23330c;
    private int d;
    private int e;
    private transient View f;
    private MarkType i;
    private int j;

    public enum MarkType {
        TEXT,
        COLOR,
        DRAWABLE,
        TEXT_DRAWABLE,
        VIEW
    }

    public HealthMark() {
        this.i = MarkType.DRAWABLE;
    }

    public HealthMark(MarkType markType) {
        MarkType markType2 = MarkType.DRAWABLE;
        this.i = markType;
    }

    public HealthMark(Drawable drawable, String str, int i) {
        this.i = MarkType.DRAWABLE;
        this.f23329b = drawable;
        this.f23330c = str;
        this.e = i;
        this.i = MarkType.DRAWABLE;
        this.f23328a = true;
    }

    public boolean f() {
        return this.f23328a;
    }

    public MarkType h() {
        return this.i;
    }

    public void a(MarkType markType) {
        this.i = markType;
    }

    public int b() {
        return this.e;
    }

    public void b(int i) {
        this.e = i;
        this.f23328a = true;
        this.i = MarkType.COLOR;
    }

    public void e(Drawable drawable) {
        this.f23329b = drawable;
        this.i = MarkType.DRAWABLE;
    }

    public String a() {
        return this.f23330c;
    }

    public View j() {
        return this.f;
    }

    public Drawable d() {
        return this.f23329b;
    }

    public void e(View view) {
        this.f = view;
        this.i = MarkType.VIEW;
    }

    public void e(int i) {
        View view = this.f;
        if (view == null || view.getMeasuredHeight() > 0) {
            return;
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i, 1073741824);
        this.f.measure(iMakeMeasureSpec, iMakeMeasureSpec);
        this.f.layout(0, 0, this.f.getMeasuredWidth(), this.f.getMeasuredHeight());
    }

    public int e() {
        return this.j;
    }

    public void a(int i) {
        this.j = i;
    }

    public int c() {
        return this.d;
    }
}

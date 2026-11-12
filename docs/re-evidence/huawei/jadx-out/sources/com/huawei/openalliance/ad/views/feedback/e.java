package com.huawei.openalliance.ad.views.feedback;

import android.view.View;
import com.huawei.openalliance.ad.hw;
import com.huawei.openalliance.ad.utils.bm;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f21210b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<View> f21209a = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f21211c = 0;

    public void a(View view) {
        this.f21209a.add(view);
        if (this.f21210b < view.getMeasuredHeight()) {
            this.f21210b = view.getMeasuredHeight();
        }
    }

    public void a(int i, int i2, int i3, int i4, int i5, int i6) {
        if (bm.a(this.f21209a)) {
            return;
        }
        if (i == -1) {
            int measuredWidth = i3 + (i5 - this.f21211c) + i2 + i6;
            for (int size = this.f21209a.size() - 1; size >= 0; size--) {
                this.f21209a.get(size).layout(measuredWidth, i4, this.f21209a.get(size).getMeasuredWidth() + measuredWidth, this.f21209a.get(size).getMeasuredHeight() + i4);
                measuredWidth += this.f21209a.get(size).getMeasuredWidth() + i6;
            }
            return;
        }
        if (i == 0) {
            int size2 = ((((this.f21209a.size() - 1) * i6) + i5) - this.f21211c) / (this.f21209a.size() + 1);
            for (View view : this.f21209a) {
                int i7 = i3 + size2;
                view.layout(i7, i4, view.getMeasuredWidth() + i7, view.getMeasuredHeight() + i4);
                i3 = i7 + view.getMeasuredWidth();
            }
            return;
        }
        if (i != 1) {
            hw.b("FlowLayoutLine", "lineMode error");
            return;
        }
        for (View view2 : this.f21209a) {
            view2.layout(i3, i4, view2.getMeasuredWidth() + i3, view2.getMeasuredHeight() + i4);
            i3 += view2.getMeasuredWidth() + i6;
        }
    }

    public void a(int i) {
        this.f21211c = i;
    }

    public int a() {
        return this.f21210b;
    }
}

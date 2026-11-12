package com.huawei.ui.commonui.calendarview;

import android.graphics.Rect;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.customview.widget.ExploreByTouchHelper;
import com.huawei.ui.commonui.R;
import defpackage.qjk;
import defpackage.qre;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes43.dex */
public class CalendarTouchHelper extends ExploreByTouchHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<qjk> f23299a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f23300b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f23301c;
    private Map<String, Integer> d;
    private String e;
    private String i;
    private String j;

    @Override // androidx.customview.widget.ExploreByTouchHelper
    public boolean onPerformActionForVirtualView(int i, int i2, Bundle bundle) {
        return false;
    }

    public CalendarTouchHelper(View view) {
        super(view);
        this.f23299a = new ArrayList();
        this.d = new HashMap();
        this.j = qre.f(R.string.IDS_detail_sleep_bottom_btu_day_txt);
        this.i = null;
        this.f23301c = null;
        this.e = null;
        this.f23300b = -1;
    }

    public void d(qjk qjkVar) {
        this.f23299a.add(qjkVar);
    }

    public int c() {
        return this.f23299a.size();
    }

    public boolean d(String str) {
        return this.d.containsKey(str);
    }

    public void d(String str, Integer num) {
        this.d.put(str, num);
    }

    @Override // androidx.customview.widget.ExploreByTouchHelper
    public int getVirtualViewAt(float f, float f2) {
        int i = (int) f;
        int i2 = (int) f2;
        for (int i3 = 0; i3 < this.f23299a.size(); i3++) {
            qjk qjkVar = this.f23299a.get(i3);
            int iD = qjkVar.d();
            if (iD * iD > ((i - qjkVar.b()) * (i - qjkVar.b())) + ((i2 - qjkVar.c()) * (i2 - qjkVar.c()))) {
                return i3;
            }
        }
        return -1;
    }

    @Override // androidx.customview.widget.ExploreByTouchHelper
    public void getVisibleVirtualViews(List<Integer> list) {
        for (int i = 0; i < this.f23299a.size(); i++) {
            list.add(Integer.valueOf(i));
        }
    }

    @Override // androidx.customview.widget.ExploreByTouchHelper
    public void onPopulateNodeForVirtualView(int i, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        if (i < 0 || i >= this.f23299a.size()) {
            return;
        }
        qjk qjkVar = this.f23299a.get(i);
        int iB = qjkVar.b();
        int iD = qjkVar.d();
        int iB2 = qjkVar.b();
        int iD2 = qjkVar.d();
        accessibilityNodeInfoCompat.setBoundsInParent(new Rect(iB - iD, qjkVar.c() - qjkVar.d(), iB2 + iD2, qjkVar.c() + qjkVar.d()));
        e(qjkVar, accessibilityNodeInfoCompat);
        accessibilityNodeInfoCompat.setSelected(qjkVar.i());
    }

    public void b(Object[] objArr) {
        if (objArr.length != 4) {
            return;
        }
        Object obj = objArr[0];
        if (obj instanceof String) {
            this.j = (String) obj;
        }
        Object obj2 = objArr[1];
        if (obj2 instanceof String) {
            this.i = (String) obj2;
        }
        Object obj3 = objArr[2];
        if (obj3 instanceof String) {
            this.f23301c = (String) obj3;
        }
        Object obj4 = objArr[3];
        if (obj4 instanceof String) {
            this.e = (String) obj4;
        }
    }

    private void e(qjk qjkVar, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        String strE;
        if (!TextUtils.isEmpty(this.i) && qjkVar.i()) {
            strE = qre.a(R.string.IDS_two_parts, qjkVar.e(), this.i);
        } else if (!TextUtils.isEmpty(this.j) && qjkVar.h()) {
            strE = qre.a(R.string.IDS_two_parts, qjkVar.e(), this.j);
        } else if (!TextUtils.isEmpty(this.f23301c) && qjkVar.a()) {
            strE = qre.a(R.string.IDS_two_parts, qjkVar.e(), this.f23301c);
        } else if (!TextUtils.isEmpty(this.e)) {
            strE = qre.a(R.string.IDS_two_parts, qjkVar.e(), this.e);
        } else {
            strE = qjkVar.e();
        }
        accessibilityNodeInfoCompat.setContentDescription(strE);
    }

    public void c(int i, qjk qjkVar) {
        this.f23299a.set(i, qjkVar);
    }

    public int a(String str) {
        return this.d.get(str).intValue();
    }
}

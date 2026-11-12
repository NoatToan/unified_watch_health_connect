package com.huawei.ui.commonui.searchview;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import com.huawei.ui.commonui.R;
import com.huawei.uikit.phone.hwsearchview.widget.HwSearchView;
import defpackage.lrd;
import defpackage.qre;
import defpackage.qrs;
import health.compact.a.ReleaseLogUtil;

/* JADX INFO: loaded from: classes16.dex */
public class HealthSearchView extends HwSearchView {
    public HealthSearchView(Context context) {
        super(context);
        qrs.b(this);
        a();
        b();
    }

    public HealthSearchView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        qrs.b(this);
        a();
        b();
    }

    public HealthSearchView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        qrs.b(this);
        a();
        b();
    }

    private void a() {
        View viewFindViewById = findViewById(R.id.search_close_btn);
        if (!(viewFindViewById instanceof ImageView)) {
            ReleaseLogUtil.d("HealthSearchView", "setClearContentDescription view ", viewFindViewById);
        } else {
            lrd.b(viewFindViewById, qre.i(R.string.accessibility_clear));
        }
    }

    private void b() {
        lrd.c(findViewById(R.id.search_plate), 2);
        lrd.c(findViewById(R.id.search_src_text), 2);
        lrd.c(findViewById(R.id.search_edit_frame), 2);
        lrd.c(findViewById(R.id.hwsearchview_search_src_icon), 2);
    }

    public void setSearchBarContentDescription() {
        String strA;
        CharSequence queryHint = getQueryHint();
        if (TextUtils.isEmpty(queryHint)) {
            strA = qre.f(R.string.accessibility_search);
        } else {
            strA = qre.a(R.string.accessibility_search_hint, queryHint);
        }
        lrd.a(findViewById(R.id.hwsearchview_search_bar), strA, (Class<?>) EditText.class);
    }
}

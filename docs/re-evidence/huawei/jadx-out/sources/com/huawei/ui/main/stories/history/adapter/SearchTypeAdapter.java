package com.huawei.ui.main.stories.history.adapter;

import android.content.res.Resources;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.adapter.BaseRecyclerAdapter;
import com.huawei.ui.commonui.adapter.RecyclerHolder;
import com.huawei.ui.main.R;
import defpackage.vqx;
import defpackage.vre;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes19.dex */
public class SearchTypeAdapter extends BaseRecyclerAdapter<vre> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f28290b;
    private int d;
    private String e;

    public SearchTypeAdapter(List<vre> list) {
        super(list, R.layout.item_search_motion_type_info);
        this.d = BaseApplication.getContext().getResources().getColor(R.color.colorAccent);
        this.f28290b = BaseApplication.getContext().getResources().getColor(R.color.white);
    }

    @Override // com.huawei.ui.commonui.adapter.BaseRecyclerAdapter
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void convert(RecyclerHolder recyclerHolder, int i, vre vreVar) {
        if (vreVar != null) {
            c(recyclerHolder, vreVar);
            b(recyclerHolder, i);
        }
    }

    private void c(RecyclerHolder recyclerHolder, vre vreVar) {
        if (!TextUtils.isEmpty(this.e)) {
            recyclerHolder.a(R.id.select_sport_content, a(this.d, vqx.e(vreVar), this.e));
        }
        int i = vreVar.g() ? R.drawable.motion_type_item_presse : R.drawable.motion_type_item_normal;
        View viewD = recyclerHolder.d(R.id.select_sport_motion_item_layout);
        if (viewD instanceof LinearLayout) {
            ((LinearLayout) viewD).setBackgroundResource(i);
        }
        b(recyclerHolder, vreVar);
    }

    private void b(RecyclerHolder recyclerHolder, int i) {
        if (i + 1 >= getItemCount()) {
            recyclerHolder.e(R.id.select_sport_summary_line, 8);
        } else {
            recyclerHolder.e(R.id.select_sport_summary_line, 0);
        }
    }

    private void b(RecyclerHolder recyclerHolder, vre vreVar) {
        Resources resources = recyclerHolder.itemView.getResources();
        View viewD = recyclerHolder.d(R.id.select_sport_icon);
        if (viewD == null || resources == null) {
            LogUtil.j("Track_SearchTypeAdapter", "view or resource is null");
            return;
        }
        if (!(viewD instanceof ImageView)) {
            LogUtil.j("Track_SearchTypeAdapter", "view is not instanceof ImageView");
            return;
        }
        ((ImageView) viewD).setPadding(4, 4, 4, 4);
        if (vreVar.g()) {
            recyclerHolder.a(R.id.select_sport_icon, vqx.e(vreVar.e(), this.f28290b));
        } else {
            recyclerHolder.a(R.id.select_sport_icon, vqx.e(vreVar.e(), vqx.d()));
        }
    }

    public void b(String str) {
        this.e = str;
    }

    private SpannableString a(int i, String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            LogUtil.j("Track_SearchTypeAdapter", "deviceText or searchKey is empty");
            return new SpannableString("");
        }
        String strReplaceAll = str2.toLowerCase(Locale.ENGLISH).replaceAll("\\s*", "");
        String lowerCase = str.toLowerCase(Locale.ENGLISH);
        int length = lowerCase.length();
        SpannableString spannableString = new SpannableString(str);
        int i2 = 0;
        while (i2 < length) {
            int i3 = i2 + 1;
            if (length < i3) {
                break;
            }
            String strSubstring = lowerCase.substring(i2, i3);
            if (!TextUtils.isEmpty(strSubstring) && strReplaceAll.contains(strSubstring)) {
                spannableString.setSpan(new ForegroundColorSpan(i), i2, i3, 33);
            }
            i2 = i3;
        }
        return spannableString;
    }
}

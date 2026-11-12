package com.huawei.sim.multisim.adapter;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.sim.R;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import defpackage.pxk;
import health.compact.a.LanguageUtil;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
public class EsimFaqAdapter extends BaseAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f23152a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f23153b;
    private OnItemClickListener h;
    private List<String> d = j();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<String> f23154c = i();
    private List<String> e = g();

    public interface OnItemClickListener {
        void onClick(String str, String str2);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return 0L;
    }

    public EsimFaqAdapter(Context context, String str) {
        this.f23152a = context;
        this.f23153b = str;
        LogUtil.a("EsimFaqAdapter", "mFaqTextList.length = ", Integer.valueOf(this.d.size()), ",mFaqUrlList.length = ", Integer.valueOf(this.f23154c.size()));
    }

    @Override // android.widget.Adapter
    public int getCount() {
        List<String> list = this.d;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override // android.widget.Adapter
    public Object getItem(int i) {
        List<String> list = this.d;
        if (list == null) {
            LogUtil.j("EsimFaqAdapter", "getItem mFaqTextList is null");
            return null;
        }
        if (i < 0 || i >= list.size()) {
            LogUtil.j("EsimFaqAdapter", "getItem mFaqTextList is out of range");
            return null;
        }
        return this.d.get(i);
    }

    public void b(OnItemClickListener onItemClickListener) {
        this.h = onItemClickListener;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        c cVar = null;
        if (view == null) {
            c cVar2 = new c();
            View viewInflate = LayoutInflater.from(this.f23152a).inflate(R.layout.esim_faq_item, (ViewGroup) null);
            cVar2.e = (HealthTextView) viewInflate.findViewById(R.id.tv_esim_faq);
            cVar2.f23158b = (ImageView) viewInflate.findViewById(R.id.iv_esim_faq);
            cVar2.f23159c = (LinearLayout) viewInflate.findViewById(R.id.esim_faq_layout);
            cVar2.f23157a = viewInflate.findViewById(R.id.esim_faq_item_line);
            viewInflate.setTag(cVar2);
            cVar = cVar2;
            view = viewInflate;
        } else {
            Object tag = view.getTag();
            if (tag instanceof c) {
                cVar = (c) tag;
            }
        }
        if (cVar != null) {
            e(i, cVar);
            return view;
        }
        LogUtil.j("EsimFaqAdapter", "getView() holder is null");
        return view;
    }

    private void e(final int i, c cVar) {
        List<String> list = this.d;
        if (list == null || this.e == null) {
            LogUtil.j("EsimFaqAdapter", "setViewContent mFaqTextList or mFaqTitleList is null");
            return;
        }
        if (i < 0 || i >= list.size() || i >= this.e.size()) {
            LogUtil.j("EsimFaqAdapter", "position is out of range");
        }
        cVar.f23158b.setBackgroundResource(LanguageUtil.ba(this.f23152a) ? R.drawable.common_ui_arrow_left : R.drawable.common_ui_arrow_right);
        cVar.e.setText(this.d.get(i));
        cVar.f23159c.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.sim.multisim.adapter.EsimFaqAdapter.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (EsimFaqAdapter.this.h != null) {
                    EsimFaqAdapter.this.h.onClick((String) EsimFaqAdapter.this.e.get(i), (String) EsimFaqAdapter.this.f23154c.get(i));
                }
            }
        });
        if (i == this.d.size() - 1) {
            cVar.f23157a.setVisibility(4);
        } else {
            cVar.f23157a.setVisibility(0);
        }
    }

    private List<String> g() {
        ArrayList arrayList = new ArrayList();
        if (LanguageUtil.l(this.f23152a)) {
            arrayList.add(this.f23152a.getString(R.string.IDS_multi_sim_faq_title));
        }
        arrayList.add(this.f23152a.getString(R.string.IDS_esim_faq_query_city));
        arrayList.add(this.f23152a.getString(R.string.IDS_esim_faq_replace));
        if (!TextUtils.isEmpty(this.f23153b)) {
            arrayList.add(this.f23152a.getString(R.string.IDS_esim_faq_logout));
        }
        arrayList.add(this.f23152a.getString(R.string.IDS_esim_usage_guide));
        return arrayList;
    }

    private List<String> j() {
        ArrayList arrayList = new ArrayList();
        if (LanguageUtil.l(this.f23152a)) {
            arrayList.add(this.f23152a.getString(R.string.IDS_multi_sim_faq_title));
        }
        arrayList.add(this.f23152a.getString(R.string.IDS_esim_faq_query_city));
        arrayList.add(this.f23152a.getString(R.string.IDS_esim_faq_replace));
        if (!TextUtils.isEmpty(this.f23153b)) {
            arrayList.add(this.f23152a.getString(R.string.IDS_esim_faq_logout));
        }
        arrayList.add(this.f23152a.getString(R.string.IDS_esim_usage_guide));
        return arrayList;
    }

    private List<String> i() {
        ArrayList arrayList = new ArrayList();
        if (LanguageUtil.l(this.f23152a)) {
            arrayList.add(h());
        }
        arrayList.add(f());
        arrayList.add(c());
        if (!TextUtils.isEmpty(this.f23153b)) {
            arrayList.add(e());
        }
        arrayList.add(k());
        return arrayList;
    }

    private String e() {
        if (pxk.d(this.f23153b)) {
            LogUtil.a("EsimFaqAdapter", "getOperatorUrl operator is CMCC");
            return d();
        }
        if (pxk.h(this.f23153b)) {
            return b();
        }
        if (pxk.a(this.f23153b)) {
            return a();
        }
        LogUtil.j("EsimFaqAdapter", "getFaqLogoutUrl is not operator imsi");
        return "";
    }

    private String k() {
        if (LanguageUtil.l(this.f23152a)) {
            return "/SmartWear/eSIM_GLL/EMUI8.0/C001B001/zh-CN/index.html";
        }
        return "/SmartWear/eSIM_GLL/EMUI8.0/C001B001/en-US/index.html";
    }

    private String d() {
        if (LanguageUtil.l(this.f23152a)) {
            return "/hwtips/topic/M005/zh-CN/SF-10190314_f2262.html?cid=11065";
        }
        return "/hwtips/topic/M005/en-US/SF-10190314_f2262.html?cid=11065";
    }

    private String b() {
        if (LanguageUtil.l(this.f23152a)) {
            return "/hwtips/topic/M005/zh-CN/SF-10190314_f2264.html?cid=11065";
        }
        return "/hwtips/topic/M005/en-US/SF-10190314_f2264.html?cid=11065";
    }

    private String a() {
        if (LanguageUtil.l(this.f23152a)) {
            return "/hwtips/topic/M005/zh-CN/SF-10190314_f2266.html?cid=11065";
        }
        return "/hwtips/topic/M005/en-US/SF-10190314_f2266.html?cid=11065";
    }

    private String c() {
        if (LanguageUtil.l(this.f23152a)) {
            return "/hwtips/topic/M005/zh-CN/SF-10190354_f2101.html?cid=11065";
        }
        return "/hwtips/topic/M005/en-US/SF-10190354_f2150.html?cid=11065";
    }

    private String f() {
        if (LanguageUtil.l(this.f23152a)) {
            return "/hwtips/topic/M005/zh-CN/SF-10190314_f2260.html";
        }
        return "/hwtips/topic/M005/en-US/SF-10190314_f2260.html";
    }

    private String h() {
        return "/eSIM_FAQ/EMUI8.0/C001B001/zh-CN/index.html";
    }

    static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        View f23157a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        ImageView f23158b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        LinearLayout f23159c;
        HealthTextView e;

        c() {
        }
    }
}

package com.huawei.health.section.section;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.health.marketing.request.GlobalSearchContent;
import com.huawei.health.marketrouter.api.MarketRouterApi;
import com.huawei.health.servicesui.R;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import defpackage.fxk;
import health.compact.a.GRSManager;
import health.compact.a.LanguageUtil;
import health.compact.a.Services;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public class SimpleListAdapter extends RecyclerView.Adapter<ItemHolder> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<GlobalSearchContent> f8769a = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f8770c;
    private static final String d = GRSManager.c(BaseApplication.getContext()).getUrl("knowledgeUrl");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f8768b = GRSManager.c(BaseApplication.getContext()).getUrl("knowledgeContextUrl");

    public SimpleListAdapter(Context context) {
        this.f8770c = context;
    }

    public void a(List<GlobalSearchContent> list) {
        this.f8769a.clear();
        if (list != null) {
            this.f8769a.addAll(list);
        }
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public ItemHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new ItemHolder(LayoutInflater.from(this.f8770c).inflate(R.layout.section_simple_list_item, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(ItemHolder itemHolder, int i) {
        itemHolder.b(this.f8769a, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f8769a.size();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static final class ItemHolder extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final HealthTextView f8771b;
        private final View d;

        ItemHolder(View view) {
            super(view);
            this.f8771b = (HealthTextView) view.findViewById(R.id.simple_title);
            this.d = view.findViewById(R.id.item_divider);
        }

        void b(List<GlobalSearchContent> list, int i) {
            GlobalSearchContent globalSearchContent = list.get(i);
            int size = list.size();
            String title = globalSearchContent.getTitle();
            SpannableString spannableStringE = e(title);
            this.f8771b.setText(spannableStringE);
            if (i == size - 1) {
                this.d.setVisibility(8);
            }
            String strA = a(globalSearchContent, spannableStringE.toString());
            if (TextUtils.isEmpty(strA)) {
                LogUtil.e("SimpleListAdapter", "set link value for title ", title, ", failed, cause linkValue is empty!");
            } else {
                this.itemView.setOnClickListener(new AnonymousClass5(strA, title));
            }
        }

        /* JADX INFO: renamed from: com.huawei.health.section.section.SimpleListAdapter$ItemHolder$5, reason: invalid class name */
        public class AnonymousClass5 implements View.OnClickListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f8772a;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f8774c;

            AnonymousClass5(String str, String str2) {
                this.f8774c = str;
                this.f8772a = str2;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (!fxk.b(this.f8774c)) {
                    ItemHolder.this.a(this.f8774c);
                    return;
                }
                LoginInit loginInit = LoginInit.getInstance(BaseApplication.getContext());
                final String str = this.f8774c;
                final String str2 = this.f8772a;
                loginInit.browsingToLogin(new IBaseResponseCallback() { // from class: gvw
                    @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                    /* JADX INFO: renamed from: onResponse */
                    public final void a(int i, Object obj) {
                        this.f36107c.a(str, str2, i, obj);
                    }
                }, "");
            }

            public /* synthetic */ void a(String str, String str2, int i, Object obj) {
                if (i == 0) {
                    ItemHolder.this.a(str);
                } else {
                    LogUtil.j("SimpleListAdapter", "click simple item: ", str2, " go to detail failed, errorCode = ", Integer.valueOf(i));
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(String str) {
            MarketRouterApi marketRouterApi = (MarketRouterApi) Services.d("FeatureMarketing", MarketRouterApi.class);
            if (marketRouterApi != null) {
                marketRouterApi.router(str);
            }
        }

        SpannableString e(String str) {
            if (str == null) {
                return null;
            }
            String strReplace = str.replace("</em><em>", "");
            int iIndexOf = strReplace.indexOf("<em>");
            String strReplace2 = strReplace.replace("<em>", "");
            int iIndexOf2 = strReplace2.indexOf("</em>");
            String strReplace3 = strReplace2.replace("</em>", "");
            SpannableString spannableString = new SpannableString(strReplace3);
            if (iIndexOf >= 0 && iIndexOf < strReplace3.length() && iIndexOf2 >= 0 && iIndexOf2 <= strReplace3.length()) {
                spannableString.setSpan(new ForegroundColorSpan(ContextCompat.getColor(this.itemView.getContext(), R.color.colorAccent)), iIndexOf, iIndexOf2, 33);
            }
            return spannableString;
        }

        private static String a(GlobalSearchContent globalSearchContent, String str) {
            if (globalSearchContent == null) {
                return "";
            }
            if (globalSearchContent.getType() != 207) {
                return globalSearchContent.getDeepLink();
            }
            if (globalSearchContent.getId() == null) {
                return "";
            }
            Context context = BaseApplication.getContext();
            String strB = LanguageUtil.f(context) ? "zh-CN" : LanguageUtil.b(context);
            StringBuilder sb = new StringBuilder();
            String str2 = SimpleListAdapter.f8768b + "?knowId=" + globalSearchContent.getId();
            sb.append(SimpleListAdapter.d);
            sb.append("?lang=");
            sb.append(strB);
            sb.append("&prodId=health_help_all&title=");
            sb.append(str);
            sb.append("&url=");
            sb.append(str2);
            return sb.toString();
        }
    }
}

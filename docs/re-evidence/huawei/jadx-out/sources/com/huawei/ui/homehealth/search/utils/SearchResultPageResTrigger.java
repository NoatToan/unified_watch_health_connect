package com.huawei.ui.homehealth.search.utils;

import android.app.Activity;
import android.content.Context;
import android.os.Message;
import android.view.View;
import com.huawei.haf.design.pattern.ObserverManagerUtil;
import com.huawei.haf.handler.BaseHandler;
import com.huawei.health.knit.section.listener.BasePageResTrigger;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.gvi;

/* JADX INFO: loaded from: classes43.dex */
public class SearchResultPageResTrigger extends BasePageResTrigger {
    public static final int RESULT_ITEM_WAIT_TIME = 500;
    private static final String TAG = "SearchResultPageResTrigger";
    private d mHandler;
    private final int pageType;

    public SearchResultPageResTrigger(Context context, int i) {
        super(context, 0, null);
        this.pageType = i;
        this.mHandler = new d(this);
    }

    @Override // com.huawei.health.knit.section.listener.BasePageResTrigger, com.huawei.health.knit.section.listener.IPageResTrigger
    public void onPageCreated(Activity activity, View view) {
        super.onPageCreated(activity, view);
        if (activity == null || view == null || activity.getWindow() == null || activity.getWindow().getDecorView() == null) {
            return;
        }
        gvi.e(BaseApplication.getContext(), this.pageType);
    }

    @Override // com.huawei.health.knit.section.listener.BasePageResTrigger, com.huawei.health.knit.section.listener.IPageResTrigger
    public void onPageVisibilityChanged(Activity activity, boolean z, View view) {
        super.onPageVisibilityChanged(activity, z, view);
        if (activity == null || activity.getWindow() == null || activity.getWindow().getDecorView() == null || !z) {
            return;
        }
        LogUtil.a(TAG, "on visible send delayed bi message, pageType: ", Integer.valueOf(this.pageType));
        this.mHandler.postDelayed(new Runnable() { // from class: com.huawei.ui.homehealth.search.utils.SearchResultPageResTrigger.4
            @Override // java.lang.Runnable
            public void run() {
                ObserverManagerUtil.e(gvi.b(SearchResultPageResTrigger.this.pageType), "");
            }
        }, 500L);
    }

    static class d extends BaseHandler<SearchResultPageResTrigger> {
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.huawei.haf.handler.BaseHandler
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void handleMessageWhenReferenceNotNull(SearchResultPageResTrigger searchResultPageResTrigger, Message message) {
        }

        d(SearchResultPageResTrigger searchResultPageResTrigger) {
            super(searchResultPageResTrigger);
        }
    }
}

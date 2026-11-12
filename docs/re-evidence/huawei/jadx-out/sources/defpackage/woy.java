package defpackage;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.health.main.api.MainNavigationApi;
import com.huawei.health.marketrouter.api.MarketRouterApi;
import com.huawei.health.messagecenter.model.MessageObject;
import com.huawei.health.operationbundle.R;
import com.huawei.hwcloudmodel.callback.GrsQueryCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.operation.utils.ActivityHtmlPathApi;
import com.huawei.operation.utils.Constants;
import com.huawei.operation.utils.OperationUtilsApi;
import com.huawei.operation.utils.OperationWebActivityIntentBuilderApi;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.cardview.HealthCardView;
import com.huawei.ui.commonui.dotspageindicator.HealthDotsPageIndicator;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import com.huawei.ui.commonui.viewpager.HealthViewPager;
import com.huawei.ui.main.stories.soical.NewSocialFragment;
import com.huawei.ui.main.stories.soical.SocialFragmentHelper;
import com.huawei.ui.main.stories.soical.interactor.OperationInteractorsApi;
import com.huawei.ui.main.stories.soical.views.RecyclerItemDecoration;
import health.compact.a.GRSManager;
import health.compact.a.LanguageUtil;
import health.compact.a.Services;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.Utils;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes43.dex */
public class woy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f52285a = "com.huawei.ui.main.stories.soical.views.BannerInteractor";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<MessageObject> f52286b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final WeakReference<NewSocialFragment> f52287c;
    private HealthViewPager d;
    private List<ImageView> e;
    private HealthDotsPageIndicator g;
    private wpc h;
    private final Context i;
    private HealthViewPager j;
    private HealthRecycleView k;
    private final OperationInteractorsApi l;
    private View m;
    private int[] o;
    private final OperationUtilsApi r;
    private final OperationWebActivityIntentBuilderApi t;
    private final Set<String> n = new HashSet();
    private final Pair<Integer, Integer> s = BaseActivity.getSafeRegionWidth();
    private volatile int f = 41;

    public int c(int i) {
        if (i == 37 || i == 38) {
            return i;
        }
        return 41;
    }

    public int e(boolean z, int i) {
        if (z) {
            return i;
        }
        return 0;
    }

    public woy(NewSocialFragment newSocialFragment, OperationInteractorsApi operationInteractorsApi, OperationWebActivityIntentBuilderApi operationWebActivityIntentBuilderApi, OperationUtilsApi operationUtilsApi) {
        this.r = operationUtilsApi;
        this.l = operationInteractorsApi;
        this.t = operationWebActivityIntentBuilderApi;
        this.f52287c = new WeakReference<>(newSocialFragment);
        this.i = newSocialFragment.getActivity();
    }

    public void a(HealthViewPager healthViewPager, HealthViewPager healthViewPager2, HealthRecycleView healthRecycleView, HealthDotsPageIndicator healthDotsPageIndicator) {
        this.d = healthViewPager;
        this.j = healthViewPager2;
        this.k = healthRecycleView;
        this.g = healthDotsPageIndicator;
    }

    public void b(View view) {
        this.m = view;
    }

    public void c(List<ImageView> list, List<MessageObject> list2) {
        this.e = list;
        this.f52286b = list2;
    }

    public OperationUtilsApi b() {
        return this.r;
    }

    public void c(View view) {
        view.setOnClickListener(new View.OnClickListener() { // from class: wpb
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.d.a(view2);
            }
        });
    }

    /* synthetic */ void a(View view) {
        SocialFragmentHelper.b(this.i, "0", "0", "0");
        GRSManager.c(this.i).d("domainContentcenterDbankcdnNew", new GrsQueryCallback() { // from class: woy.5
            @Override // com.huawei.hwcloudmodel.callback.GrsQueryCallback
            public void onCallBackFail(int i) {
            }

            @Override // com.huawei.hwcloudmodel.callback.GrsQueryCallback
            public void onCallBackSuccess(String str) {
                LogUtil.a(woy.f52285a, "GRSManager onCallBackSuccess ACTIVITY_KEY");
                woy.this.e(str);
            }
        });
    }

    public void e(String str) {
        this.l.setNeedUpdateActivity(this.i, true);
        try {
            this.i.startActivity(this.t.builder(this.i, str + ((ActivityHtmlPathApi) Services.b("PluginOperation", ActivityHtmlPathApi.class)).getActivityHtmlPath() + Constants.ACTIVITY_HTML).setFlags(268435456).build());
        } catch (ActivityNotFoundException e2) {
            LogUtil.e(f52285a, "ActivityNotFoundException", e2.getMessage());
        }
    }

    public void b(osg osgVar, TextView textView) {
        if (fya.d()) {
            ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
            layoutParams.width = -2;
            layoutParams.height = -2;
            textView.setLayoutParams(layoutParams);
        }
        String strT = osgVar.t();
        if (TextUtils.equals(strT, String.valueOf(0))) {
            textView.setText(osgVar.aa());
            textView.setVisibility(0);
        } else if (TextUtils.equals(strT, String.valueOf(1))) {
            textView.setText(osgVar.ab());
            textView.setVisibility(0);
        } else {
            textView.setVisibility(8);
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0077  */
    /* JADX WARN: Code duplicated, block: B:21:0x0084  */
    /* JADX WARN: Code duplicated, block: B:24:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:27:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:29:? A[RETURN, SYNTHETIC] */
    public void a(MessageObject messageObject, long j, int i) {
        boolean z;
        String strD;
        HashMap map;
        String msgId = messageObject.getMsgId();
        if (messageObject instanceof tsr) {
            tsr tsrVar = (tsr) messageObject;
            boolean zA = tsrVar.a();
            if (zA) {
                String strH = tsrVar.b().h();
                strD = wvg.d(tsrVar.b().i());
                msgId = strH;
                z = zA;
            } else {
                msgId = tsrVar.getMsgId();
                z = zA;
            }
            if (i != 1 && this.n.contains(msgId)) {
                LogUtil.a(f52285a, "has shown id: ", msgId, " name: ", messageObject.getMsgTitle());
                return;
            }
            map = new HashMap();
            map.put("resourcePositionId", 1002);
            map.put("resourceId", msgId);
            map.put("resourceName", messageObject.getMsgTitle());
            if (z) {
                map.put("itemCardName", strD);
                map.put("itemId", "");
            }
            if (i == 2) {
                LogUtil.a(f52285a, "VALUE_EVENT_CLICK: ", Long.valueOf(System.currentTimeMillis() - j));
                map.put("durationTime", Long.valueOf(System.currentTimeMillis() - j));
            }
            map.put("event", Integer.valueOf(i));
            map.put("pullOrder", 1);
            if (messageObject.getResBriefInfo() != null) {
                map.put("algId", "");
                map.put("smartRecommend", Boolean.valueOf(messageObject.getResBriefInfo().getSmartRecommend()));
            }
            lmf.d().c(this.i, AnalyticsValue.MARKETING_RESOURCE.value(), map, 0);
            LogUtil.a(f52285a, "biEvent, event: ", Integer.valueOf(i), " id: ", msgId, " name: ", messageObject.getMsgTitle());
            if (i == 1) {
                this.n.add(msgId);
            }
        }
        z = false;
        strD = "";
        if (i != 1) {
        }
        map = new HashMap();
        map.put("resourcePositionId", 1002);
        map.put("resourceId", msgId);
        map.put("resourceName", messageObject.getMsgTitle());
        if (z) {
            map.put("itemCardName", strD);
            map.put("itemId", "");
        }
        if (i == 2) {
            LogUtil.a(f52285a, "VALUE_EVENT_CLICK: ", Long.valueOf(System.currentTimeMillis() - j));
            map.put("durationTime", Long.valueOf(System.currentTimeMillis() - j));
        }
        map.put("event", Integer.valueOf(i));
        map.put("pullOrder", 1);
        if (messageObject.getResBriefInfo() != null) {
            map.put("algId", "");
            map.put("smartRecommend", Boolean.valueOf(messageObject.getResBriefInfo().getSmartRecommend()));
        }
        lmf.d().c(this.i, AnalyticsValue.MARKETING_RESOURCE.value(), map, 0);
        LogUtil.a(f52285a, "biEvent, event: ", Integer.valueOf(i), " id: ", msgId, " name: ", messageObject.getMsgTitle());
        if (i == 1) {
            this.n.add(msgId);
        }
    }

    public void a(String str) {
        MarketRouterApi marketRouterApi = (MarketRouterApi) Services.d("FeatureMarketing", MarketRouterApi.class);
        if (marketRouterApi != null) {
            marketRouterApi.router(str);
        }
    }

    public static class e implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WeakReference<woy> f52292a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final WeakReference<MessageObject> f52293b;

        public e(woy woyVar, MessageObject messageObject) {
            this.f52292a = new WeakReference<>(woyVar);
            this.f52293b = new WeakReference<>(messageObject);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MessageObject messageObject = this.f52293b.get();
            woy woyVar = this.f52292a.get();
            if (messageObject == null || qrs.r() || woyVar == null) {
                return;
            }
            Object tag = view.getTag(R.layout.layout_new_social_cardview);
            long jLongValue = tag instanceof Long ? ((Long) tag).longValue() : 0L;
            LogUtil.a(woy.f52285a, "tmpObj: ", Long.valueOf(jLongValue));
            woyVar.d(messageObject, jLongValue);
        }
    }

    public void d(MessageObject messageObject, long j) {
        String msgId = messageObject.getMsgId();
        String msgTitle = messageObject.getMsgTitle();
        String module = messageObject.getModule();
        String detailUri = messageObject.getDetailUri();
        boolean z = messageObject instanceof tsr;
        tsr tsrVar = (tsr) messageObject;
        if (z && tsrVar.a()) {
            a(messageObject, j, 2);
            if (!TextUtils.equals(tsrVar.b().t(), String.valueOf(1))) {
                if (z) {
                    ddq.d().goToTaskPage(this.i, tsrVar.b());
                    return;
                }
                return;
            } else {
                NewSocialFragment newSocialFragment = this.f52287c.get();
                if (newSocialFragment != null && newSocialFragment.isVisible() && newSocialFragment.isAdded()) {
                    newSocialFragment.e(tsrVar);
                    return;
                }
                return;
            }
        }
        if (Utils.o() && !ddv.b().switchToMarketingTwo()) {
            SocialFragmentHelper.b(this.i, msgId, msgTitle, module);
            try {
                this.i.startActivity(this.t.builder(this.i, detailUri).setBI(msgId, msgTitle, "SOCIALBANNER", "SHOW_TIME_BI").build());
                return;
            } catch (ActivityNotFoundException e2) {
                LogUtil.e(f52285a, "ActivityNotFoundException", e2.getMessage());
                return;
            }
        }
        a(messageObject, j, 2);
        a(c(detailUri, messageObject));
    }

    public String c(String str, MessageObject messageObject) {
        String msgId = messageObject.getMsgId();
        if (messageObject instanceof tsr) {
            tsr tsrVar = (tsr) messageObject;
            if (tsrVar.a()) {
                msgId = tsrVar.b().h();
            } else {
                msgId = tsrVar.getMsgId();
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str.contains("?") ? "&pullfrom=" : "?pullfrom=");
        return sb.toString() + "1002&resourceName=" + messageObject.getMsgTitle() + "&resourceId=" + msgId + "&pullOrder=1&itemId=" + msgId;
    }

    private boolean i() {
        return this.f != 38;
    }

    public boolean d(osg osgVar) {
        String strT = osgVar.t();
        return TextUtils.equals(strT, String.valueOf(0)) || TextUtils.equals(strT, String.valueOf(1)) || osgVar.ac() == 1;
    }

    public void a(int i) {
        this.d.getAdapter().notifyDataSetChanged();
        if (i != this.f) {
            this.d.setPageTransformer(false, null);
        }
        this.j.getAdapter().notifyDataSetChanged();
        if (i != this.f) {
            this.j.setPageTransformer(false, null);
        }
        this.d.setVisibility(8);
        this.j.setVisibility(8);
        this.g.setVisibility(8);
        this.k.getAdapter().notifyDataSetChanged();
        this.k.setVisibility(8);
    }

    public void c(wpc wpcVar) {
        this.h = wpcVar;
    }

    public void e(List<MessageObject> list) {
        int i = this.f;
        if (njy.e(list)) {
            this.f = 41;
        } else {
            MessageObject messageObject = list.get(0);
            if (messageObject instanceof tsr) {
                this.f = c(((tsr) messageObject).e());
            } else {
                this.f = 41;
            }
        }
        woo.a(this.f);
        int i2 = this.f;
        if (i2 == 37) {
            this.d.getAdapter().notifyDataSetChanged();
            this.d.setPageTransformer(false, null);
            wpc wpcVar = this.h;
            if (wpcVar != null) {
                this.d.removeOnPageChangeListener(wpcVar);
                this.h.e();
            }
            this.d.setVisibility(8);
            this.j.getAdapter().notifyDataSetChanged();
            this.j.setVisibility(0);
            this.g.setVisibility(8);
            this.k.getAdapter().notifyDataSetChanged();
            this.k.setVisibility(8);
            return;
        }
        if (i2 == 38) {
            this.d.setVisibility(8);
            this.d.getAdapter().notifyDataSetChanged();
            this.d.setPageTransformer(false, null);
            wpc wpcVar2 = this.h;
            if (wpcVar2 != null) {
                this.d.removeOnPageChangeListener(wpcVar2);
                this.h.e();
            }
            this.j.setVisibility(8);
            this.j.getAdapter().notifyDataSetChanged();
            this.g.setVisibility(8);
            this.k.getAdapter().notifyDataSetChanged();
            this.k.setVisibility(0);
            return;
        }
        a(i);
    }

    public void j() {
        if (this.e == null || this.g == null || !i()) {
            return;
        }
        if (this.e.size() > 1) {
            if (qrs.af(this.i) && this.e.size() <= 2) {
                this.g.d();
                return;
            } else {
                this.g.b(4000);
                return;
            }
        }
        this.g.d();
    }

    public void a() {
        HealthDotsPageIndicator healthDotsPageIndicator = this.g;
        if (healthDotsPageIndicator != null) {
            healthDotsPageIndicator.d();
        }
    }

    public void b(ViewGroup viewGroup) {
        int dimension;
        int i;
        int iB;
        int i2;
        int i3;
        if (viewGroup == null || njy.e(this.e)) {
            LogUtil.j(f52285a, "resizeViewPager() mADImageShowList is empty.");
            return;
        }
        boolean z = viewGroup instanceof HealthViewPager;
        boolean z2 = viewGroup instanceof RecyclerView;
        int i4 = qrs.i(this.i);
        int i5 = 0;
        try {
            dimension = (int) this.i.getResources().getDimension(R.dimen.defaultPaddingStart);
        } catch (Resources.NotFoundException unused) {
            LogUtil.e(f52285a, "resizeViewPager() dimen id is not found.");
            dimension = 0;
        }
        int iA = woo.a(this.i);
        if (qrs.af(this.i)) {
            iB = qqp.b(this.i);
            int size = this.e.size();
            if (size == 1) {
                i3 = (i4 - iA) / 2;
                iB = e(z2, iB);
                a(z, viewGroup, false);
            } else {
                if (size == 2) {
                    int i6 = ((i4 - (iA * 2)) - iB) / 2;
                    a(z, viewGroup, false);
                    i2 = (i4 - iA) - i6;
                    i3 = i6;
                } else if (size >= 3) {
                    i3 = (i4 - iA) / 2;
                    a(z, viewGroup, true);
                } else {
                    LogUtil.j(f52285a, "resizeViewPager() imageListSize <= 0.");
                    i = 0;
                }
                LogUtil.a(f52285a, "resizePageMargin ", Integer.valueOf(iB), " startPadding ", Integer.valueOf(i3), " endPadding ", Integer.valueOf(i2));
                e(viewGroup, iB, i3, i2);
            }
            i2 = i3;
            LogUtil.a(f52285a, "resizePageMargin ", Integer.valueOf(iB), " startPadding ", Integer.valueOf(i3), " endPadding ", Integer.valueOf(i2));
            e(viewGroup, iB, i3, i2);
        }
        LogUtil.a(f52285a, "not bigCD");
        int iIntValue = ((Integer) this.s.second).intValue() + ((int) this.i.getResources().getDimension(R.dimen.defaultPaddingStart)) + ((Integer) this.s.first).intValue();
        int iC = c(i4, iA, dimension);
        e(viewGroup, z);
        i = iIntValue;
        i5 = iC;
        iB = i;
        i2 = i5;
        i3 = i2;
        LogUtil.a(f52285a, "resizePageMargin ", Integer.valueOf(iB), " startPadding ", Integer.valueOf(i3), " endPadding ", Integer.valueOf(i2));
        e(viewGroup, iB, i3, i2);
    }

    public void a(boolean z, ViewGroup viewGroup, boolean z2) {
        if (z) {
            ((HealthViewPager) viewGroup).setIsScroll(z2);
        }
    }

    public int c(int i, int i2, int i3) {
        if (this.f == 37) {
            return (i - i2) / 2;
        }
        return i3 + ((Integer) this.s.first).intValue();
    }

    public void e(ViewGroup viewGroup, boolean z) {
        int size = this.e.size();
        if (z) {
            ((HealthViewPager) viewGroup).setIsScroll(size > 1);
        }
    }

    public void e(ViewGroup viewGroup, int i, int i2, int i3) {
        boolean z = viewGroup instanceof RecyclerView;
        if (viewGroup instanceof HealthViewPager) {
            try {
                ((HealthViewPager) viewGroup).setPageMargin(this.f == 41 ? i : 0);
            } catch (IllegalStateException unused) {
                LogUtil.e(f52285a, "AdViewPager setPageMargin llegalStateException.");
                return;
            }
        }
        if (z) {
            RecyclerView recyclerView = (RecyclerView) viewGroup;
            for (int itemDecorationCount = recyclerView.getItemDecorationCount() - 1; itemDecorationCount >= 0; itemDecorationCount--) {
                recyclerView.removeItemDecorationAt(itemDecorationCount);
            }
            recyclerView.addItemDecoration(new RecyclerItemDecoration(i, 0, new int[]{i, 0, i, 0}));
        }
        if (this.f == 38) {
            viewGroup.setPadding(0, 0, 0, 0);
        } else {
            viewGroup.setPadding(i2, 0, i3, 0);
        }
    }

    public void b(int i) {
        String str = f52285a;
        LogUtil.a(str, "updateAdSelector, mBannerStyle: ", Integer.valueOf(this.f), "size: ", Integer.valueOf(i));
        if (!i()) {
            this.d.setVisibility(8);
            this.j.setVisibility(8);
            this.g.setVisibility(8);
            return;
        }
        if (i == 1) {
            this.d.setVisibility(8);
            this.j.setVisibility(0);
            this.g.setViewPager(this.j);
            this.g.setVisibility(8);
            g();
            return;
        }
        if (i == 2) {
            if (this.f == 37 || (this.f == 41 && !qrs.af(this.i))) {
                this.d.setVisibility(0);
                this.j.setVisibility(8);
                this.g.setViewPager(this.d);
                this.g.setVisibility(0);
                return;
            }
            this.d.setVisibility(8);
            this.j.setVisibility(0);
            this.g.setViewPager(this.j);
            this.g.setVisibility(8);
            return;
        }
        if (i == 3) {
            this.d.setVisibility(0);
            this.j.setVisibility(8);
            this.g.setViewPager(this.d);
            this.g.setVisibility(0);
            g();
            return;
        }
        LogUtil.d(str, "mAdImageShowList size is illegal");
        this.d.setVisibility(0);
        this.j.setVisibility(8);
        this.g.setViewPager(this.d);
        this.g.setVisibility(0);
    }

    private void g() {
        HandlerExecutor.c(new Runnable() { // from class: woy.1
            @Override // java.lang.Runnable
            public void run() {
                if (woy.this.j == null || woy.this.j.getVisibility() != 0) {
                    LogUtil.j(woy.f52285a, "mCantLoopViewPager is not visible any more");
                    return;
                }
                NewSocialFragment newSocialFragment = woy.this.f52287c != null ? (NewSocialFragment) woy.this.f52287c.get() : null;
                if (newSocialFragment == null) {
                    LogUtil.e(woy.f52285a, "setAllBannerShowEvent fragment is null");
                    return;
                }
                int size = woy.this.f52286b != null ? woy.this.f52286b.size() : 0;
                LogUtil.a(woy.f52285a, "setAllBannerShowEvent, size: ", Integer.valueOf(size));
                for (int i = 0; i < size; i++) {
                    newSocialFragment.d(i);
                }
            }
        }, 500L);
    }

    public static class c implements View.OnClickListener {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final WeakReference<woy> f52290c;

        public c(woy woyVar) {
            this.f52290c = new WeakReference<>(woyVar);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            woy woyVar = this.f52290c.get();
            if (woyVar == null) {
                return;
            }
            woyVar.d(view, woyVar.m);
        }
    }

    public static class d implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final WeakReference<woy> f52291b;

        d(woy woyVar) {
            this.f52291b = new WeakReference<>(woyVar);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            woy woyVar = this.f52291b.get();
            if (woyVar == null) {
                return;
            }
            woyVar.d();
        }
    }

    public void d(View view, View view2) {
        if (qrs.e(view)) {
            return;
        }
        if (view2 != null && view2.getVisibility() == 0) {
            view2.performClick();
        }
        if (!LoginInit.getInstance(BaseApplication.getContext()).isBrowseMode()) {
            d();
            return;
        }
        Activity activity = BaseApplication.getActivity();
        if (activity instanceof BaseActivity) {
            qji.b(new d(this), (BaseActivity) activity, LoginInit.getInstance(BaseApplication.getContext()).isBrowseMode(), "").onClick(view);
        }
    }

    public void d() {
        MainNavigationApi mainNavigationApi = (MainNavigationApi) Services.d("Main", MainNavigationApi.class);
        if (mainNavigationApi != null) {
            mainNavigationApi.goToAchieveKaka(this.i);
        }
    }

    public void b(View view, CustomTitleBar customTitleBar, View view2) {
        if (view == null) {
            return;
        }
        boolean zB = wvg.b();
        String str = f52285a;
        LogUtil.a(str, "canShowDiscoverKaka", Boolean.valueOf(!zB));
        if (!zB) {
            view.setVisibility(4);
            return;
        }
        String strE = SharedPreferenceManager.e(this.i, Integer.toString(10005), "discover_first_login_show_kaka_tips");
        if (!TextUtils.isEmpty(strE) && !"true".equals(strE)) {
            view.setVisibility(4);
            return;
        }
        Context context = this.i;
        if (!(context instanceof Activity) || ((Activity) context).isDestroyed() || ((Activity) this.i).isFinishing()) {
            return;
        }
        LogUtil.a(str, "PopupWindow = show");
        View rightSoftKey = customTitleBar.getRightSoftKey();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            float x = (((customTitleBar.getX() + view2.getX()) + rightSoftKey.getX()) + (rightSoftKey.getMeasuredWidth() / 2.0f)) - (view.getMeasuredWidth() / 2.0f);
            if (LanguageUtil.ba(this.i)) {
                marginLayoutParams.rightMargin = (int) ((fxk.c() - x) - view.getMeasuredWidth());
            } else {
                marginLayoutParams.leftMargin = (int) x;
            }
            view.setLayoutParams(marginLayoutParams);
        }
        view.setLayoutParams(layoutParams);
        view.setVisibility(0);
        view.setOnClickListener(new View.OnClickListener() { // from class: woz
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                this.f52294a.d(view3);
            }
        });
    }

    /* synthetic */ void d(View view) {
        view.setVisibility(4);
        view.setOnClickListener(null);
        SharedPreferenceManager.e(this.i, Integer.toString(10005), "discover_first_login_show_kaka_tips", "false", null);
    }

    public int c() {
        return this.f;
    }

    public View b(Drawable drawable, ViewGroup viewGroup, int i, View view) {
        int i2;
        ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
        layoutParams.width = -1;
        int iA = woo.a(this.i);
        if (woo.e(this.o)) {
            int[] iArr = this.o;
            i2 = (iArr[1] * iA) / iArr[0];
        } else {
            i2 = (iA * 9) / 21;
        }
        layoutParams.height = i2;
        viewGroup.setLayoutParams(layoutParams);
        RelativeLayout relativeLayout = (RelativeLayout) view.findViewById(R.id.banner);
        ViewGroup.LayoutParams layoutParams2 = relativeLayout.getLayoutParams();
        layoutParams2.width = iA;
        relativeLayout.setLayoutParams(layoutParams2);
        HealthCardView healthCardView = (HealthCardView) view.findViewById(R.id.card_view);
        ViewGroup.LayoutParams layoutParams3 = healthCardView.getLayoutParams();
        layoutParams3.width = iA;
        layoutParams3.height = i2;
        healthCardView.setLayoutParams(layoutParams3);
        ImageView imageView = (ImageView) view.findViewById(R.id.card_image);
        ViewGroup.LayoutParams layoutParams4 = imageView.getLayoutParams();
        layoutParams4.width = iA;
        layoutParams4.height = i2;
        imageView.setLayoutParams(layoutParams4);
        imageView.setImageDrawable(drawable);
        if (this.f == 37 && this.d.getCurrentItem() != i) {
            view.setScaleX(0.9f);
            view.setScaleY(0.9f);
        }
        return view;
    }

    public void a(int[] iArr) {
        if (iArr == null || iArr.length <= 0) {
            return;
        }
        this.o = Arrays.copyOf(iArr, iArr.length);
    }
}

package com.huawei.ui.main.stories.soical.store;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.IntentFilter;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.huawei.haf.handler.BaseHandler;
import com.huawei.haf.router.AppRouter;
import com.huawei.health.messagecenter.api.MessageCenterApi;
import com.huawei.health.messagecenter.model.MessageExt;
import com.huawei.health.messagecenter.model.MessageObject;
import com.huawei.health.operationbundle.R;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwcloudmodel.callback.GrsQueryCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.hwsmartinteractmgr.util.SmartRulesApi;
import com.huawei.operation.utils.ActivityHtmlPathApi;
import com.huawei.operation.utils.Constants;
import com.huawei.operation.utils.OperationWebActivityIntentBuilder;
import com.huawei.operation.utils.OperationWebActivityIntentBuilderApi;
import com.huawei.pluginachievement.AchieveNavigationApi;
import com.huawei.pluginmessagecenter.util.HttpResCallback;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.dotspageindicator.HealthDotsPageIndicator;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;
import com.huawei.ui.commonui.scrollview.HealthScrollView;
import com.huawei.ui.commonui.scrollview.ScrollViewListener;
import com.huawei.ui.commonui.viewpager.HealthViewPager;
import com.huawei.ui.main.stories.soical.SocialFragmentHelper;
import com.huawei.ui.main.stories.soical.interactor.OperationInteractorsApi;
import com.huawei.uikit.hwviewpager.widget.HwPagerAdapter;
import defpackage.dlp;
import defpackage.lmf;
import defpackage.pee;
import defpackage.qrs;
import defpackage.wom;
import defpackage.woo;
import health.compact.a.CommonUtil;
import health.compact.a.GRSManager;
import health.compact.a.LanguageUtil;
import health.compact.a.Services;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageParams;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes43.dex */
public class StoreDemoNewSocialFragment extends Fragment implements View.OnClickListener, ScrollViewListener {
    private HealthScrollView ae;
    private RelativeLayout ag;
    private LinearLayout aj;
    private SocialFragmentHelper ak;
    private View al;
    private LinearLayout am;
    private LinearLayout an;
    private LinearLayout ao;
    private LinearLayout aq;
    private LinearLayout ar;
    private LinearLayout as;
    private HealthRecycleView at;
    private SocialRecyclerview au;
    private RelativeLayout aw;
    private HealthViewPager ax;
    private HealthViewPager i;
    private HealthButton j;
    private HealthDotsPageIndicator l;
    private Context n;
    private d o;
    private wom p;
    private d q;
    private View y;
    private ImageView z;
    private long g = 0;
    private long s = 1000;
    private final List<MessageObject> f = new ArrayList(10);
    private final List<MessageObject> e = new ArrayList(10);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<MessageObject> f28939a = new ArrayList(10);
    private final List<ImageView> d = new ArrayList(10);
    private final List<MessageObject> h = new ArrayList(10);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ArrayList<ImageView> f28940b = new ArrayList<>(3);
    private HandlerThread k = null;
    private Handler ap = null;
    private JSONArray t = null;
    private String v = "";
    private String w = null;
    private boolean r = false;
    private String u = null;
    private final List<dlp> aa = new ArrayList(10);
    private final List<dlp> ab = new ArrayList(10);
    private SocialActRecyclerAdapter ah = null;
    private final Handler m = new BaseHandler<StoreDemoNewSocialFragment>(this) { // from class: com.huawei.ui.main.stories.soical.store.StoreDemoNewSocialFragment.4
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.huawei.haf.handler.BaseHandler
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void handleMessageWhenReferenceNotNull(StoreDemoNewSocialFragment storeDemoNewSocialFragment, Message message) {
            storeDemoNewSocialFragment.b(message);
        }
    };
    private final Runnable ai = new Runnable() { // from class: wou
        @Override // java.lang.Runnable
        public final void run() {
            this.f52280a.d();
        }
    };
    private final OperationWebActivityIntentBuilderApi ac = (OperationWebActivityIntentBuilderApi) Services.d("PluginOperation", OperationWebActivityIntentBuilderApi.class);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AchieveNavigationApi f28941c = (AchieveNavigationApi) Services.d("PluginAchievement", AchieveNavigationApi.class);
    private final MessageCenterApi x = (MessageCenterApi) Services.b("PluginMessageCenter", MessageCenterApi.class);
    private final SmartRulesApi af = (SmartRulesApi) Services.d("HWSmartInteractMgr", SmartRulesApi.class);
    private final OperationInteractorsApi ad = (OperationInteractorsApi) Services.d("OperationBundle", OperationInteractorsApi.class);

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        CommonUtil.u("TimeEat_StoreDemoNewSocialFragmentEnter onCreateView");
        FragmentActivity activity = getActivity();
        this.n = activity;
        this.ak = new SocialFragmentHelper(activity);
        this.al = layoutInflater.inflate(R.layout.fragment_main_circle_new, viewGroup, false);
        this.p = wom.a(this.n);
        this.y = this.al.findViewById(R.id.fragment_social_ad);
        HealthScrollView healthScrollView = (HealthScrollView) this.al.findViewById(R.id.fragment_social_sroll);
        this.ae = healthScrollView;
        healthScrollView.setScrollViewListener(this);
        this.ao = (LinearLayout) this.al.findViewById(R.id.social_message_container);
        ((LinearLayout) this.al.findViewById(R.id.fragment_item)).setVisibility(8);
        e(this.al);
        HandlerThread handlerThread = new HandlerThread("UIDV_StoreDemoNewSocialFragment");
        this.k = handlerThread;
        handlerThread.start();
        Handler handler = new Handler(this.k.getLooper());
        this.ap = handler;
        handler.post(new Runnable() { // from class: wot
            @Override // java.lang.Runnable
            public final void run() {
                this.e.e();
            }
        });
        CommonUtil.u("TimeEat_StoreDemoNewSocialFragmentLeave onCreateView");
        return this.al;
    }

    public /* synthetic */ void e() {
        o();
        l();
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        CommonUtil.u("TimeEat_StoreDemoNewSocialFragmentEnter onActivityCreated");
        k();
        g();
        CommonUtil.u("TimeEat_StoreDemoNewSocialFragmentLeave onActivityCreated");
    }

    private void k() {
        LogUtil.a("UIDV_StoreDemoNewSocialFragment", "Enter initView");
        this.am = (LinearLayout) this.al.findViewById(R.id.social_activity_card);
        this.aq = (LinearLayout) this.al.findViewById(R.id.social_shop_card);
        this.aj = (LinearLayout) this.al.findViewById(R.id.social_information_card);
        this.as = (LinearLayout) this.al.findViewById(R.id.social_service_card);
        this.am.setVisibility(8);
        this.aq.setVisibility(8);
        this.aj.setVisibility(8);
        this.as.setVisibility(8);
        this.an = (LinearLayout) this.al.findViewById(R.id.social_activity_container);
        this.ar = (LinearLayout) this.al.findViewById(R.id.social_root_lyt);
        this.aw = (RelativeLayout) this.al.findViewById(R.id.social_net_work_layout);
        this.ag = (RelativeLayout) this.al.findViewById(R.id.social_reload_layout);
        this.j = (HealthButton) this.al.findViewById(R.id.social_btn_no_net_work);
        this.at = (HealthRecycleView) this.al.findViewById(R.id.social_activity_recycle_view);
        this.ah = new SocialActRecyclerAdapter(this.n, this.ab);
    }

    private void g() {
        if (qrs.af(this.n)) {
            this.at.setLayoutManager(new GridLayoutManager(this.n, 2, 1, false));
        } else {
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.n);
            linearLayoutManager.setOrientation(1);
            this.at.setLayoutManager(linearLayoutManager);
        }
        this.at.setAdapter(this.ah);
        this.at.setNestedScrollingEnabled(false);
        this.at.setHasFixedSize(true);
        this.am.setOnClickListener(this);
        this.aq.setOnClickListener(this);
        this.as.setOnClickListener(this);
        this.aj.setOnClickListener(this);
        this.aw.setOnClickListener(this);
        this.ag.setOnClickListener(this);
        this.j.setOnClickListener(this);
        ((RelativeLayout) this.al.findViewById(R.id.social_activity_title)).setOnClickListener(this);
        LinearLayout linearLayout = (LinearLayout) this.al.findViewById(R.id.social_activity_more_layout);
        ImageView imageView = (ImageView) this.al.findViewById(R.id.activity_more_arrow);
        imageView.setVisibility(8);
        linearLayout.setVisibility(8);
        this.z = (ImageView) this.al.findViewById(R.id.activity_red_dot);
        if (LanguageUtil.ba(this.n)) {
            imageView.setBackgroundResource(R.drawable.common_ui_arrow_left);
        } else {
            imageView.setBackgroundResource(R.drawable.common_ui_arrow_right);
        }
        this.ad.setNeedUpdateActivity(this.n, false);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("main_social_red_dot_friend_show");
        intentFilter.addAction("main_social_red_dot_friend_dismiss");
        intentFilter.addAction("main_social_update_ranking");
        q();
        b((List<MessageObject>) null);
    }

    private void q() {
        this.aw.setVisibility(8);
        this.ar.setVisibility(0);
    }

    public void b() {
        this.m.sendEmptyMessageDelayed(12289, 2000L);
        this.ap.post(new Runnable() { // from class: com.huawei.ui.main.stories.soical.store.StoreDemoNewSocialFragment.5
            @Override // java.lang.Runnable
            public void run() {
                StoreDemoNewSocialFragment.this.x.refreshMessages();
                StoreDemoNewSocialFragment.this.i();
                StoreDemoNewSocialFragment.this.j();
            }
        });
    }

    private void e(View view) {
        this.e.clear();
        this.f28939a.clear();
        this.d.clear();
        this.h.clear();
        this.f28940b.clear();
        this.ax = (HealthViewPager) view.findViewById(R.id.view_pager_common_top_banner);
        this.i = (HealthViewPager) view.findViewById(R.id.view_pager_common_top_banner_cant_loop);
        this.l = (HealthDotsPageIndicator) view.findViewById(R.id.indicator);
        this.o = new d(this.f28940b);
        this.q = new d(this.f28940b);
        this.ax.setAdapter(this.o);
        this.i.setAdapter(this.q);
        this.ax.setOnTouchListener(new View.OnTouchListener() { // from class: com.huawei.ui.main.stories.soical.store.StoreDemoNewSocialFragment.3
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view2, MotionEvent motionEvent) {
                int action = motionEvent.getAction();
                if (action == 1 || action == 3 || action == 4) {
                    StoreDemoNewSocialFragment.this.d();
                    return false;
                }
                if (action == 0) {
                    StoreDemoNewSocialFragment.this.f();
                    return false;
                }
                LogUtil.j("UIDV_StoreDemoNewSocialFragment", "no branch!");
                return false;
            }
        });
        this.i.setOnTouchListener(new View.OnTouchListener() { // from class: com.huawei.ui.main.stories.soical.store.StoreDemoNewSocialFragment.1
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view2, MotionEvent motionEvent) {
                int action = motionEvent.getAction();
                if (action == 1 || action == 3 || action == 4) {
                    StoreDemoNewSocialFragment.this.d();
                    return false;
                }
                if (action == 0) {
                    StoreDemoNewSocialFragment.this.f();
                    return false;
                }
                LogUtil.j("UIDV_StoreDemoNewSocialFragment", "no branch!");
                return false;
            }
        });
    }

    private void e(HealthViewPager healthViewPager) {
        boolean zAf = qrs.af(this.n);
        int iH = h();
        int iC = (iH - c(360.0f)) / 2;
        int iC2 = (!zAf || this.f28940b.size() <= 1) ? iC : (iH - (c(360.0f) * 2)) / 2;
        LogUtil.a("UIDV_StoreDemoNewSocialFragment", "resizeViewPager() Window width ", Integer.valueOf(iH), " banner padding ", Integer.valueOf(iC), " pageMargin ", Integer.valueOf(iC2));
        healthViewPager.setPageMargin(iC2);
        healthViewPager.setPadding(iC, 0, iC, 0);
    }

    private int h() {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((Activity) this.n).getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics.widthPixels;
    }

    private int c(float f) {
        return (int) ((f * this.n.getResources().getDisplayMetrics().density) + 0.5f);
    }

    private void a(ImageView imageView, MessageObject messageObject) {
        LogUtil.a("UIDV_StoreDemoNewSocialFragment", "addImageToShow");
        if (c(imageView, messageObject)) {
            this.ak.c(this.f28939a, messageObject, this.d, imageView);
            if (this.f28939a.size() >= 1 && this.f28939a.size() <= 3) {
                this.y.setVisibility(0);
                this.h.clear();
                this.h.addAll(this.f28939a);
                this.f28940b.clear();
                this.f28940b.addAll(this.d);
            }
            LogUtil.a("UIDV_StoreDemoNewSocialFragment", "mADImageShowList size = ", Integer.valueOf(this.f28940b.size()));
            if (this.f28939a.size() == 1) {
                this.ax.setVisibility(8);
                this.i.setVisibility(0);
                this.l.setViewPager(this.i);
                this.l.setVisibility(8);
                return;
            }
            if (this.f28939a.size() == 2) {
                this.ax.setVisibility(0);
                this.i.setVisibility(8);
                this.l.setViewPager(this.ax);
                this.l.setVisibility(0);
                return;
            }
            if (this.f28939a.size() == 3) {
                this.ax.setVisibility(0);
                this.i.setVisibility(8);
                this.l.setViewPager(this.ax);
                this.l.setVisibility(0);
                return;
            }
            LogUtil.d("UIDV_StoreDemoNewSocialFragment", "mAdImageShowList size is illegal");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public View b(Drawable drawable) {
        View viewInflate = LayoutInflater.from(this.n).inflate(R.layout.layout_social_cardview, (ViewGroup) null);
        ((ImageView) viewInflate.findViewById(R.id.card_image)).setImageDrawable(drawable);
        return viewInflate;
    }

    private boolean c(ImageView imageView, MessageObject messageObject) {
        boolean z;
        if (imageView == null || messageObject == null) {
            LogUtil.a("UIDV_StoreDemoNewSocialFragment", "imageView||messageObject is null");
            z = false;
        } else {
            z = true;
        }
        ArrayList arrayList = new ArrayList(10);
        arrayList.addAll(this.e);
        boolean z2 = false;
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) != null && messageObject != null && messageObject.getMsgId().equals(((MessageObject) arrayList.get(i)).getMsgId())) {
                z2 = true;
            }
        }
        if (z2) {
            return z;
        }
        LogUtil.a("UIDV_StoreDemoNewSocialFragment", "this ad is not in display list");
        return false;
    }

    private void b(List<MessageObject> list) {
        this.f28940b.clear();
        this.ax.removeAllViews();
        this.i.removeAllViews();
        LogUtil.a("UIDV_StoreDemoNewSocialFragment", "no Ad message in database");
        this.y.setVisibility(8);
        this.l.setVisibility(8);
    }

    public class d extends HwPagerAdapter {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private ArrayList<ImageView> f28948b;

        @Override // com.huawei.uikit.hwviewpager.widget.HwPagerAdapter
        public int getItemPosition(Object obj) {
            return -2;
        }

        @Override // com.huawei.uikit.hwviewpager.widget.HwPagerAdapter
        public boolean isViewFromObject(View view, Object obj) {
            return view == obj;
        }

        d(ArrayList<ImageView> arrayList) {
            this.f28948b = arrayList;
        }

        @Override // com.huawei.uikit.hwviewpager.widget.HwPagerAdapter
        public int getCount() {
            return this.f28948b.size();
        }

        @Override // com.huawei.uikit.hwviewpager.widget.HwPagerAdapter
        public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
            if (obj instanceof View) {
                viewGroup.removeView((View) obj);
            }
        }

        @Override // com.huawei.uikit.hwviewpager.widget.HwPagerAdapter
        public Object instantiateItem(ViewGroup viewGroup, final int i) {
            if (this.f28948b.size() == 0 || this.f28948b.size() <= i) {
                return null;
            }
            View viewB = StoreDemoNewSocialFragment.this.b(this.f28948b.get(i).getDrawable());
            viewGroup.addView(viewB);
            viewB.setOnClickListener(new View.OnClickListener() { // from class: wox
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.e.c(i, view);
                }
            });
            return viewB;
        }

        public /* synthetic */ void c(int i, View view) {
            String msgId;
            String module;
            String msgTitle;
            String detailUri;
            LogUtil.a("UIDV_StoreDemoNewSocialFragment", "Enter gotoNotifyCard");
            if (StoreDemoNewSocialFragment.this.h == null || StoreDemoNewSocialFragment.this.h.isEmpty()) {
                SocialFragmentHelper.b(StoreDemoNewSocialFragment.this.n, "0", "0", "0");
                GRSManager.c(StoreDemoNewSocialFragment.this.n).d("domainContentcenterDbankcdnNew", new GrsQueryCallback() { // from class: com.huawei.ui.main.stories.soical.store.StoreDemoNewSocialFragment.d.3
                    @Override // com.huawei.hwcloudmodel.callback.GrsQueryCallback
                    public void onCallBackFail(int i2) {
                    }

                    @Override // com.huawei.hwcloudmodel.callback.GrsQueryCallback
                    public void onCallBackSuccess(String str) {
                        StoreDemoNewSocialFragment.this.a(str);
                    }
                });
                return;
            }
            if (i < StoreDemoNewSocialFragment.this.h.size() && StoreDemoNewSocialFragment.this.h.get(i) != null) {
                msgId = ((MessageObject) StoreDemoNewSocialFragment.this.h.get(i)).getMsgId();
                msgTitle = ((MessageObject) StoreDemoNewSocialFragment.this.h.get(i)).getMsgTitle();
                detailUri = ((MessageObject) StoreDemoNewSocialFragment.this.h.get(i)).getDetailUri();
                module = ((MessageObject) StoreDemoNewSocialFragment.this.h.get(i)).getModule();
            } else {
                msgId = "";
                module = "";
                msgTitle = module;
                detailUri = msgTitle;
            }
            if (!TextUtils.isEmpty(msgId) && !TextUtils.isEmpty(detailUri)) {
                SocialFragmentHelper.b(StoreDemoNewSocialFragment.this.n, msgId, msgTitle, module);
                try {
                    StoreDemoNewSocialFragment.this.n.startActivity(StoreDemoNewSocialFragment.this.ac.builder(StoreDemoNewSocialFragment.this.n, detailUri).setBI(msgId, msgTitle, "SOCIALBANNER", "SHOW_TIME_BI").build());
                    return;
                } catch (ActivityNotFoundException e) {
                    LogUtil.e("UIDV_StoreDemoNewSocialFragment", "ActivityNotFoundException", e.getMessage());
                    return;
                }
            }
            LogUtil.a("UIDV_StoreDemoNewSocialFragment", "messageId||detailUrl is null");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public void d() {
        ArrayList<ImageView> arrayList = this.f28940b;
        if (arrayList == null || this.l == null) {
            return;
        }
        if (arrayList.size() > 1) {
            this.l.b(4000);
        } else {
            this.l.d();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        HealthDotsPageIndicator healthDotsPageIndicator = this.l;
        if (healthDotsPageIndicator != null) {
            healthDotsPageIndicator.d();
        }
    }

    private void o() {
        LogUtil.a("UIDV_StoreDemoNewSocialFragment", "initOperationList");
        String strE = SharedPreferenceManager.e(this.n, Integer.toString(10011), "OPERATION_SOCIAL_ACTIVITY_SAVE");
        this.w = SharedPreferenceManager.e(this.n, Integer.toString(10011), OperationInteractorsApi.OPERATION_ACTIVITY_CURRENT_TIME);
        this.v = SharedPreferenceManager.e(this.n, Integer.toString(10011), " OPERATION_ACTIVITY_MAX_ID");
        try {
            this.aa.clear();
            if (!TextUtils.isEmpty(strE)) {
                JSONArray jSONArray = new JSONArray(strE);
                for (int i = 0; i < jSONArray.length(); i++) {
                    this.aa.add(this.ad.expoundOperationActivity(jSONArray.getJSONObject(i)));
                }
            }
            this.m.sendEmptyMessage(24);
        } catch (JSONException e) {
            LogUtil.e("UIDV_StoreDemoNewSocialFragment", "1Json data error! JSONException:", e.getMessage());
        }
        j();
    }

    private String e(String str, String str2) {
        String str3 = "";
        InputStream inputStream = null;
        try {
            try {
                InputStream inputStreamE = pee.e(str, str2 + ".txt");
                if (inputStreamE == null) {
                    LogUtil.j("UIDV_StoreDemoNewSocialFragment", "readTXTDataFile inputStream is null.");
                    if (inputStreamE != null) {
                        try {
                            inputStreamE.close();
                            return "";
                        } catch (IOException e) {
                            LogUtil.e("UIDV_StoreDemoNewSocialFragment", "getBetaFile e is ", e.getMessage());
                        }
                    }
                    return "";
                }
                byte[] bArr = new byte[inputStreamE.available()];
                str3 = inputStreamE.read(bArr) > 0 ? new String(bArr, "UTF-8") : "";
                if (inputStreamE != null) {
                    try {
                        inputStreamE.close();
                    } catch (IOException e2) {
                        LogUtil.e("UIDV_StoreDemoNewSocialFragment", "getBetaFile e is ", e2.getMessage());
                    }
                }
                return str3;
            } catch (IOException e3) {
                LogUtil.e("UIDV_StoreDemoNewSocialFragment", "getBetaFile e is ", e3.getMessage());
                if (0 != 0) {
                    try {
                        inputStream.close();
                    } catch (IOException e4) {
                        LogUtil.e("UIDV_StoreDemoNewSocialFragment", "getBetaFile e is ", e4.getMessage());
                    }
                }
            }
        } catch (Throwable th) {
            if (0 != 0) {
                try {
                    inputStream.close();
                } catch (IOException e5) {
                    LogUtil.e("UIDV_StoreDemoNewSocialFragment", "getBetaFile e is ", e5.getMessage());
                }
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        LogUtil.a("UIDV_StoreDemoNewSocialFragment", "getActivityFromCloud()");
        this.m.sendEmptyMessage(12289);
        try {
            JSONObject jSONObject = new JSONObject(e("operation", "activity"));
            String string = jSONObject.getString("resultCode");
            LogUtil.a("UIDV_StoreDemoNewSocialFragment", "HttpPost result:resultCode = ", string);
            if ("0".equals(string)) {
                this.w = jSONObject.optString("currentTime");
                StorageParams storageParams = new StorageParams();
                a(OperationInteractorsApi.OPERATION_ACTIVITY_CURRENT_TIME, this.w, storageParams);
                JSONArray jSONArray = jSONObject.getJSONArray("activities");
                this.t = jSONArray;
                if (jSONArray.length() < 1) {
                    LogUtil.j("UIDV_StoreDemoNewSocialFragment", "no activity");
                    return;
                }
                this.aa.clear();
                LogUtil.a("UIDV_StoreDemoNewSocialFragment", "jsonArrayOperationActivity ", this.t);
                JSONArray jSONArray2 = new JSONArray();
                for (int i = 0; i < this.t.length(); i++) {
                    JSONObject jSONObject2 = this.t.getJSONObject(i);
                    LogUtil.a("UIDV_StoreDemoNewSocialFragment", "jsonObjectActivity ", jSONObject2);
                    dlp dlpVarExpoundOperationActivity = this.ad.expoundOperationActivity(jSONObject2);
                    if (dlpVarExpoundOperationActivity != null && dlpVarExpoundOperationActivity.p() > 0 && this.ad.getActivityStatus(this.w, dlpVarExpoundOperationActivity.s(), dlpVarExpoundOperationActivity.o()) != -1) {
                        jSONArray2.put(jSONObject2);
                        this.aa.add(dlpVarExpoundOperationActivity);
                    }
                }
                a("OPERATION_SOCIAL_ACTIVITY_SAVE", jSONArray2.toString(), storageParams);
                this.m.sendEmptyMessage(24);
                a(storageParams);
            }
        } catch (JSONException e) {
            LogUtil.e("UIDV_StoreDemoNewSocialFragment", "Json data error! JSONException:", e.getMessage());
        }
    }

    private void a(StorageParams storageParams) {
        for (int i = 0; i < this.t.length(); i++) {
            try {
                JSONObject jSONObject = this.t.getJSONObject(i);
                try {
                    if (((Integer) jSONObject.get("activityPosition")).intValue() == 2) {
                        a("OPERATION_ACTIVITY_STEP", jSONObject.toString(), storageParams);
                        return;
                    }
                } catch (JSONException unused) {
                }
            } catch (JSONException e) {
                LogUtil.e("UIDV_StoreDemoNewSocialFragment", "Json data error! JSONException:", e.getMessage());
                return;
            }
        }
        a("OPERATION_ACTIVITY_STEP", "", storageParams);
    }

    private void a(String str, String str2, StorageParams storageParams) {
        SharedPreferenceManager.e(this.n, Integer.toString(10011), str, str2, storageParams);
    }

    private void t() {
        LogUtil.a("UIDV_StoreDemoNewSocialFragment", "updateOperationActivity()");
        if (this.aa != null) {
            this.ab.clear();
            this.ab.addAll(this.aa);
            if (this.ab.size() <= 0) {
                this.an.setVisibility(8);
            } else {
                this.an.setVisibility(0);
                this.m.sendEmptyMessage(30);
            }
            this.ah.notifyDataSetChanged();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        LogUtil.a("UIDV_StoreDemoNewSocialFragment", "getMoreInfoUrlFromCloud()");
        this.p.d(new HttpResCallback() { // from class: com.huawei.ui.main.stories.soical.store.StoreDemoNewSocialFragment.2
            @Override // com.huawei.pluginmessagecenter.util.HttpResCallback
            public void onSucceed(String str, String str2, String str3) {
                StoreDemoNewSocialFragment.this.m.sendEmptyMessage(12289);
                if (str == null || "".equals(str)) {
                    return;
                }
                StoreDemoNewSocialFragment.this.u = str;
                SharedPreferenceManager.e(StoreDemoNewSocialFragment.this.n, Integer.toString(10011), "SOCIAL_MORE_INFO_URL", StoreDemoNewSocialFragment.this.u, new StorageParams());
            }

            @Override // com.huawei.pluginmessagecenter.util.HttpResCallback
            public void onFailed(int i) {
                LogUtil.a("UIDV_StoreDemoNewSocialFragment", "getMoreInfoUrlFromCloud doPostReq onFailed ==> resCode == " + i);
            }
        });
    }

    private void l() {
        this.ap.post(new Runnable() { // from class: wow
            @Override // java.lang.Runnable
            public final void run() {
                this.d.c();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public void c() {
        ArrayList arrayList = new ArrayList(10);
        e(arrayList);
        StringBuilder sb = new StringBuilder("{\"groupMsgId\":1259,");
        sb.append(" \"title\":\"50米防水！智能手环的功能可以多强大？！\", \"imgUrl\":\"file:///android_asset/operation/MessageH5/image/intelligent_hand's_ring.jpg\", \"jumpType\":0, \"jumpUrl\":\"file:///android_asset/operation/MessageH5/html/honorBracelet.html\", \"beginTime\":1542643201000, \"endTime\":1543569831000, \"weight\":35, \"description\":\"50米防水！智能手环的功能可以多强大？！\"}");
        String string = sb.toString();
        sb.setLength(0);
        arrayList.add((MessageExt) HiJsonUtil.d(string, MessageExt.class));
        sb.append("{\"groupMsgId\":1260,");
        sb.append(" \"title\":\"你不得不知道的马拉松入门秘籍！\",");
        sb.append(" \"imgUrl\":\"file:///android_asset/operation/MessageH5/image/marathon.jpg\",");
        sb.append(" \"jumpType\":0,");
        sb.append(" \"jumpUrl\":\"file:///android_asset/operation/MessageH5/html/recommendIndex2.html\",");
        sb.append(" \"beginTime\":1542643201000,");
        sb.append(" \"endTime\":1543569831000,");
        sb.append(" \"weight\":35,");
        sb.append(" \"description\":\"你不得不知道的马拉松入门秘籍！\"}");
        String string2 = sb.toString();
        sb.setLength(0);
        arrayList.add((MessageExt) HiJsonUtil.d(string2, MessageExt.class));
        sb.append("{\"groupMsgId\":1261,");
        sb.append(" \"title\":\"最美夏夜之梦 华为运动手环助你一夜好眠\",");
        sb.append(" \"imgUrl\":\"file:///android_asset/operation/MessageH5/image/sleep.jpg\",");
        sb.append(" \"jumpType\":0,");
        sb.append(" \"jumpUrl\":\"file:///android_asset/operation/MessageH5/html/huaweiBracelet.html\",");
        sb.append(" \"beginTime\":1542643201000,");
        sb.append(" \"endTime\":1543569831000,");
        sb.append(" \"weight\":34,");
        sb.append(" \"description\":\"最美夏夜之梦 华为运动手环助你一夜好眠\"}");
        String string3 = sb.toString();
        sb.setLength(0);
        arrayList.add((MessageExt) HiJsonUtil.d(string3, MessageExt.class));
        this.m.obtainMessage(27, new MessageObject[]{null, c(arrayList)}).sendToTarget();
    }

    private void e(List<MessageExt> list) {
        StringBuilder sb = new StringBuilder("{\"groupMsgId\":1257,");
        sb.append(" \"title\":\"大家都想减脂，为什么他们吃得多还瘦了？\", \"imgUrl\":\"file:///android_asset/operation/MessageH5/image/banner_eat_thin.webp\", \"jumpType\":0, \"jumpUrl\":\"file:///android_asset/operation/MessageH5/html/recommendBohee.html\", \"beginTime\":1542643201000, \"endTime\":1543569831000, \"weight\":33, \"description\":\"大家都想减脂，为什么他们吃得多还瘦了？\"}");
        list.add((MessageExt) HiJsonUtil.d(sb.toString(), MessageExt.class));
        sb.setLength(0);
        sb.append("{\"groupMsgId\":1258,");
        sb.append(" \"title\":\"5分钟，4个参数，华为智能穿戴带你告别运动文盲！\",");
        sb.append(" \"imgUrl\":\"file:///android_asset/operation/MessageH5/image/huawei_wear.webp\",");
        sb.append(" \"jumpType\":0,");
        sb.append(" \"jumpUrl\":\"file:///android_asset/operation/MessageH5/html/recommendIndex1.html\",");
        sb.append(" \"beginTime\":1542643201000,");
        sb.append(" \"endTime\":1543569831000,");
        sb.append(" \"weight\":34,");
        sb.append(" \"description\":\"5分钟，4个参数，华为智能穿戴带你告别运动文盲！\"}");
        list.add((MessageExt) HiJsonUtil.d(sb.toString(), MessageExt.class));
    }

    private MessageObject c(List<MessageExt> list) {
        MessageObject messageObject = new MessageObject();
        messageObject.setMsgId("G1257");
        messageObject.setModule("5");
        messageObject.setMsgType(1);
        messageObject.setFlag(0);
        messageObject.setWeight(1);
        messageObject.setMsgTitle("热门文章");
        messageObject.setCreateTime(1542643201000L);
        messageObject.setExpireTime(1543569831000L);
        messageObject.setReceiveTime(1542783106021L);
        messageObject.setPosition(1);
        messageObject.setMsgPosition(28);
        messageObject.setReadFlag(0);
        messageObject.setNotified(0);
        messageObject.setInfoRecommend(0);
        messageObject.setMsgUserLabel(null);
        messageObject.setLayout(4);
        messageObject.setMessageExtList(list);
        return messageObject;
    }

    private void d(MessageObject messageObject, MessageObject messageObject2) {
        this.ao.removeAllViews();
        SocialRecyclerview socialRecyclerview = new SocialRecyclerview(this.n);
        this.au = socialRecyclerview;
        socialRecyclerview.c(messageObject2);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 1;
        this.ao.addView(this.au, layoutParams);
    }

    @Override // com.huawei.ui.commonui.scrollview.ScrollViewListener
    public void onScrollChanged(HealthScrollView healthScrollView, int i, int i2, int i3, int i4) {
        if (this.n == null || !getUserVisibleHint()) {
            return;
        }
        int scrollY = healthScrollView.getScrollY();
        int height = healthScrollView.getHeight();
        int paddingTop = healthScrollView.getPaddingTop();
        if (healthScrollView.getChildAt(0).getHeight() != ((scrollY + height) - paddingTop) - healthScrollView.getPaddingBottom() || System.currentTimeMillis() - this.s <= 1000) {
            return;
        }
        HashMap map = new HashMap();
        map.put("scroll", "1");
        map.put(com.huawei.health.messagecenter.model.CommonUtil.PAGE_TYPE, 1);
        lmf.d().c(this.n, AnalyticsValue.HEALTH_DISCOVER_SCROLL_TO_BOTTOM_2020014.value(), map, 0);
        lmf.d().b(this.n);
        this.s = System.currentTimeMillis();
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        LogUtil.a("UIDV_StoreDemoNewSocialFragment", "Enter onPause begin");
        super.onPause();
        f();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        CommonUtil.u("TimeEat_StoreDemoNewSocialFragmentEnter onResume");
        this.m.removeCallbacks(this.ai);
        this.m.postDelayed(this.ai, 700L);
        boolean needUpdateActivity = this.ad.getNeedUpdateActivity(this.n);
        boolean z = this.r;
        if (z && needUpdateActivity) {
            LogUtil.d("UIDV_StoreDemoNewSocialFragment", "isHideRedDot = ", Boolean.valueOf(z));
            this.m.sendEmptyMessage(26);
        }
        if (needUpdateActivity) {
            LogUtil.a("UIDV_StoreDemoNewSocialFragment", "isNeedUpdateActivity = ", Boolean.valueOf(needUpdateActivity));
            j();
            this.ad.setNeedUpdateActivity(this.n, false);
        }
        CommonUtil.u("TimeEat_StoreDemoNewSocialFragmentLeave onResume");
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.social_activity_card) {
            m();
            return;
        }
        boolean z = SystemClock.elapsedRealtime() - this.g > 2000;
        if (id == R.id.social_shop_card && z) {
            s();
            return;
        }
        if (id == R.id.social_information_card && z) {
            HashMap map = new HashMap();
            map.put("click", "1");
            lmf.d().c(this.n, AnalyticsValue.HEALTH_DISCOVER_SCROLL_INDEED_2020022.value(), map, 0);
            a();
            return;
        }
        if (id == R.id.social_service_card && z) {
            AppRouter.c("/OpenService/1.0/OpenServiceActivity").b(this.n);
            woo.c(this.n, AnalyticsValue.OPEN_SERVICE_MORE_20100060.value());
            return;
        }
        if (id == R.id.social_activity_title && z) {
            HashMap map2 = new HashMap();
            map2.put("click", "1");
            map2.put("type", "1");
            map2.put("from", "3");
            lmf.d().c(BaseApplication.getContext(), AnalyticsValue.SUCCESSES_ACTIVITY_1100005.value(), map2, 0);
            GRSManager.c(this.n).d("domainContentcenterDbankcdnNew", new GrsQueryCallback() { // from class: com.huawei.ui.main.stories.soical.store.StoreDemoNewSocialFragment.10
                @Override // com.huawei.hwcloudmodel.callback.GrsQueryCallback
                public void onCallBackFail(int i) {
                }

                @Override // com.huawei.hwcloudmodel.callback.GrsQueryCallback
                public void onCallBackSuccess(String str) {
                    LogUtil.d("UIDV_StoreDemoNewSocialFragment", "GRSManager onCallBackSuccess ACTIVITY_KEY url = ", str);
                    StoreDemoNewSocialFragment.this.b(str);
                }
            });
            return;
        }
        if (id == R.id.social_btn_no_net_work && z) {
            CommonUtil.t(this.n);
            this.g = SystemClock.elapsedRealtime();
        } else if (id == R.id.social_reload_layout && z) {
            b();
            this.g = SystemClock.elapsedRealtime();
        } else {
            LogUtil.j("UIDV_StoreDemoNewSocialFragment", "no branch!");
        }
    }

    private void s() {
        HashMap map = new HashMap();
        map.put("click", "1");
        lmf.d().c(this.n, AnalyticsValue.HEALTH_SHOP_FEATURE_TAB_CLICK_2120017.value(), map, 0);
        GRSManager.c(this.n).d("healthRecommendUrl", new GrsQueryCallback() { // from class: com.huawei.ui.main.stories.soical.store.StoreDemoNewSocialFragment.8
            @Override // com.huawei.hwcloudmodel.callback.GrsQueryCallback
            public void onCallBackSuccess(String str) {
                LogUtil.d("UIDV_StoreDemoNewSocialFragment", "GRSManager onCallBackSuccess HEALTH_RECOMMEND url = ", str);
                try {
                    StoreDemoNewSocialFragment.this.n.startActivity(StoreDemoNewSocialFragment.this.ac.builder(StoreDemoNewSocialFragment.this.n, str + "/miniShop/html/homePage.html").setIntType(3001).setFlags(268435456).build());
                } catch (ActivityNotFoundException e) {
                    LogUtil.e("UIDV_StoreDemoNewSocialFragment", "ActivityNotFoundException", e.getMessage());
                }
            }

            @Override // com.huawei.hwcloudmodel.callback.GrsQueryCallback
            public void onCallBackFail(int i) {
                LogUtil.d("UIDV_StoreDemoNewSocialFragment", "GRSManager onCallBackFail HEALTH_RECOMMEND i = ", Integer.valueOf(i));
            }
        });
    }

    private void m() {
        GRSManager.c(this.n).d("domainContentcenterDbankcdnNew", new GrsQueryCallback() { // from class: com.huawei.ui.main.stories.soical.store.StoreDemoNewSocialFragment.6
            @Override // com.huawei.hwcloudmodel.callback.GrsQueryCallback
            public void onCallBackSuccess(String str) {
                LogUtil.d("UIDV_StoreDemoNewSocialFragment", "GRSManager onCallBackSuccess ACTIVITY_KEY url = ", str);
                try {
                    StoreDemoNewSocialFragment.this.n.startActivity(StoreDemoNewSocialFragment.this.ac.builder(StoreDemoNewSocialFragment.this.n, str + ((ActivityHtmlPathApi) Services.b("PluginOperation", ActivityHtmlPathApi.class)).getActivityHtmlPath() + Constants.ACTIVITY_HTML).setFlags(268435456).build());
                } catch (ActivityNotFoundException e) {
                    LogUtil.e("UIDV_StoreDemoNewSocialFragment", "ActivityNotFoundException", e.getMessage());
                }
            }

            @Override // com.huawei.hwcloudmodel.callback.GrsQueryCallback
            public void onCallBackFail(int i) {
                LogUtil.d("UIDV_StoreDemoNewSocialFragment", "GRSManager onCallBackFail ACTIVITY_KEY i = ", Integer.valueOf(i));
            }
        });
        woo.c(this.n, AnalyticsValue.HEALTH_DISCOVER_SCROLL_ACT_2020021.value());
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        this.m.removeCallbacks(this.ai);
        this.k.quit();
        super.onDestroy();
    }

    public void b(String str) {
        String str2 = this.v;
        if (str2 != null && !"".equals(str2) && !"-1".equals(this.v)) {
            SharedPreferenceManager.e(this.n, Integer.toString(10011), " OPERATION_ACTIVITY_MAX_ID", this.v, new StorageParams());
            LogUtil.d("UIDV_StoreDemoNewSocialFragment", "setSharedPreference：", this.v);
        }
        this.ad.setNeedUpdateActivity(this.n, true);
        this.r = true;
        OperationWebActivityIntentBuilder operationWebActivityIntentBuilderBuilder = this.ac.builder(this.n, str + ((ActivityHtmlPathApi) Services.b("PluginOperation", ActivityHtmlPathApi.class)).getActivityHtmlPath() + Constants.ACTIVITY_HTML);
        try {
            Context context = this.n;
            context.startActivity(operationWebActivityIntentBuilderBuilder.setBI("", context.getResources().getString(R.string.IDS_main_home_bottom_text_activity), "ACT_MORE", "SHOW_TIME_BI").build());
        } catch (ActivityNotFoundException e) {
            LogUtil.e("UIDV_StoreDemoNewSocialFragment", "openHwActivity exception", e.getMessage());
        }
        this.g = SystemClock.elapsedRealtime();
    }

    public void a(String str) {
        this.ad.setNeedUpdateActivity(this.n, true);
        try {
            this.n.startActivity(this.ac.builder(this.n, str + ((ActivityHtmlPathApi) Services.b("PluginOperation", ActivityHtmlPathApi.class)).getActivityHtmlPath() + Constants.ACTIVITY_HTML).setFlags(268435456).build());
        } catch (ActivityNotFoundException e) {
            LogUtil.e("UIDV_StoreDemoNewSocialFragment", "openHwActivityFromAds exception", e.getMessage());
        }
        this.g = SystemClock.elapsedRealtime();
    }

    public boolean d(JSONArray jSONArray) {
        int i;
        int i2;
        if (jSONArray == null) {
            LogUtil.j("UIDV_StoreDemoNewSocialFragment", "jsonArrayOperation is empty!");
            return false;
        }
        this.v = this.ad.getMaxActivityId(jSONArray);
        String strE = SharedPreferenceManager.e(this.n, Integer.toString(10011), " OPERATION_ACTIVITY_MAX_ID");
        if (strE == null || "".equals(strE)) {
            return true;
        }
        String str = this.v;
        if (str != null && !"".equals(str)) {
            try {
                i = Integer.parseInt(this.v);
            } catch (NumberFormatException e) {
                LogUtil.e("UIDV_StoreDemoNewSocialFragment", "NumberFormatException e = ", e.getMessage());
                i = 0;
            }
            try {
                i2 = Integer.parseInt(strE);
            } catch (NumberFormatException e2) {
                LogUtil.e("UIDV_StoreDemoNewSocialFragment", "NumberFormatException exception = ", e2.getMessage());
                i2 = 0;
            }
            if (i > i2) {
                LogUtil.d("UIDV_StoreDemoNewSocialFragment", "There is new activity!");
                return true;
            }
            LogUtil.d("UIDV_StoreDemoNewSocialFragment", "There is no new activity!");
        }
        return false;
    }

    public void a() {
        if (this.n != null) {
            boolean zIsRuleOpen = this.af.isRuleOpen(30004, SmartRulesApi.AI_INFORMATION_MODULE);
            LogUtil.a("UIDV_StoreDemoNewSocialFragment", "openHWInformation = ", Boolean.valueOf(zIsRuleOpen));
            if (zIsRuleOpen) {
                this.u = this.af.getRuleData(30004, SmartRulesApi.AI_INFORMATION_MODULE, SmartRulesApi.INFORMATION_MORE_URL);
            }
            try {
                Context context = this.n;
                context.startActivity(this.ac.builder(context, this.u).setStringType("RecommendInfo").setBI("", this.n.getResources().getString(R.string.IDS_social_information), "INFO_MORE", "SHOW_TIME_BI").build());
            } catch (ActivityNotFoundException e) {
                LogUtil.e("UIDV_StoreDemoNewSocialFragment", "openHwInformation exception", e.getMessage());
            }
        } else {
            LogUtil.j("UIDV_StoreDemoNewSocialFragment", "openHWInformation mContext is null");
        }
        this.g = SystemClock.elapsedRealtime();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(Message message) {
        int i = message.what;
        if (i == 21) {
            if (message.obj != null) {
                b((List<MessageObject>) message.obj);
            }
            this.o.notifyDataSetChanged();
            this.q.notifyDataSetChanged();
            return;
        }
        if (i == 30) {
            q();
            return;
        }
        if (i == 23) {
            SocialFragmentHelper.a aVar = (SocialFragmentHelper.a) message.obj;
            if (aVar != null) {
                a(aVar.b(), aVar.c());
                e(this.ax);
                this.ax.getAdapter().notifyDataSetChanged();
                e(this.i);
                this.i.getAdapter().notifyDataSetChanged();
                d();
                return;
            }
            return;
        }
        if (i != 24) {
            if (i == 26) {
                this.z.setVisibility(8);
                return;
            } else {
                if (i != 27) {
                    return;
                }
                MessageObject[] messageObjectArr = (MessageObject[]) message.obj;
                d(messageObjectArr[0], messageObjectArr[1]);
                return;
            }
        }
        if (d(this.t) && !this.r) {
            this.r = false;
            LogUtil.d("UIDV_StoreDemoNewSocialFragment", "To display the red dot!");
            this.z.setVisibility(0);
        } else {
            LogUtil.d("UIDV_StoreDemoNewSocialFragment", "Not display the red dot!");
            this.z.setVisibility(8);
        }
        t();
    }
}

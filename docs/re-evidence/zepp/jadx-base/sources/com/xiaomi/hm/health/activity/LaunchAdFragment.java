package com.xiaomi.hm.health.activity;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import com.airbnb.lottie.LottieAnimationView;
import com.huami.account.HMLoginManager;
import com.huami.account.ui.areas.SelectAreaHelper;
import com.huami.ad.AdLoadListener;
import com.huami.ad.AdRepository;
import com.huami.ad.ITimeListener;
import com.huami.ad.entity.LaunchViewEntity;
import com.huami.ad.repo.LaunchRepo;
import com.huami.mifit.analytics.Analytics;
import com.huami.mifit.analytics.builder.CountEventBuilder;
import com.huami.tools.log.HMLog;
import com.huami.watch.hmwatchmanager.R;
import com.huami.web.service.WebItem;
import com.xiaomi.hm.health.device.event.StatEvent;
import com.xiaomi.hm.health.discovery.WebActivityUtil;
import com.xiaomi.hm.health.discovery.WebHelper;
import com.xiaomi.hm.health.manager.HMAdManager;
import com.xiaomi.hm.health.view.BaseAdView;
import com.xiaomi.hm.health.view.LaunchAdView;
import java.lang.ref.WeakReference;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes19.dex */
public class LaunchAdFragment extends Fragment {
    private static final String m = "LaunchAdFragment";
    private static final int n = 100;
    private static boolean o = true;
    private Context a;
    private String b;
    private String c;
    private View d;
    private LottieAnimationView e;
    private LaunchAdView f;
    private d g;
    private ViewStub j;
    private LaunchRepo l;
    private boolean h = false;
    private boolean i = false;
    private boolean k = false;

    public class a implements ITimeListener {
        public a() {
        }

        @Override // com.huami.ad.ITimeListener
        public void onAdShowTimeout() {
            HMLog.i(LaunchAdFragment.m, "onVideoTimeout = ", new Object[0]);
            if (LaunchAdFragment.this.h) {
                return;
            }
            LaunchAdFragment.this.m();
        }

        @Override // com.huami.ad.ITimeListener
        public void onRequestTimeout(boolean showingAd) {
        }

        @Override // com.huami.ad.ITimeListener
        public void onTotallyTimeout() {
            HMLog.i(LaunchAdFragment.m, "onTotallyTimeOut =  ", new Object[0]);
            if (LaunchAdFragment.this.h) {
                return;
            }
            LaunchAdFragment.this.m();
        }
    }

    public class b implements AdLoadListener<LaunchViewEntity> {
        public b() {
        }

        @Override // com.huami.ad.AdLoadListener
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onError(String msg, LaunchViewEntity data) {
            LaunchAdFragment.this.m();
        }

        @Override // com.huami.ad.AdLoadListener
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onSuccess(LaunchViewEntity entity) {
            if (LaunchAdFragment.this.isDetached() || LaunchAdFragment.this.isRemoving() || LaunchAdFragment.this.getActivity() == null) {
                HMLog.d(LaunchAdFragment.m, "LaunchAdFragment host activity has been destroyed and return", new Object[0]);
                return;
            }
            if (entity == null) {
                HMLog.d(LaunchAdFragment.m, "LaunchViewEntity is null", new Object[0]);
                return;
            }
            LaunchAdFragment.this.n();
            LaunchAdFragment.this.g.b(entity);
            LaunchAdFragment.this.f.updateView(entity);
            Analytics.recordEvent(new CountEventBuilder(StatEvent.EVENT_LAUNCH_VIEW_AD_NUM).setAnonymous(false).setIdentified(true).addExtra("id", String.valueOf(entity.id)).addExtra("name", entity.title));
            String strValueOf = String.valueOf(entity.id);
            String str = entity.extensions;
            if (TextUtils.isEmpty(str)) {
                AdRepository.getInstance().requestMonitor("", strValueOf, true);
            } else {
                try {
                    JSONObject jSONObjectOptJSONObject = new JSONObject(str).optJSONObject("ad");
                    if (jSONObjectOptJSONObject == null) {
                        AdRepository.getInstance().requestMonitor("", strValueOf, true);
                    } else {
                        LaunchAdFragment.this.c = jSONObjectOptJSONObject.toString();
                        AdRepository.getInstance().requestMonitor(LaunchAdFragment.this.c, strValueOf, true);
                    }
                } catch (JSONException e) {
                    HMLog.i(LaunchAdFragment.m, e.getMessage(), new Object[0]);
                }
            }
            if (TextUtils.isEmpty(entity.url)) {
                LaunchAdFragment.this.b = StatEvent.EVENT_LAUNCH_OUT_AD_NOT_CLICK;
            } else {
                LaunchAdFragment.this.b = StatEvent.EVENT_LAUNCH_OUT_AD;
            }
        }

        @Override // com.huami.ad.AdLoadListener
        public void onLoading() {
        }
    }

    public static class c extends Handler {
        private final WeakReference<LaunchAdFragment> a;

        public c(LaunchAdFragment fragment) {
            this.a = new WeakReference<>(fragment);
        }

        @Override // android.os.Handler
        public void handleMessage(Message msg) {
            LaunchAdFragment launchAdFragment = this.a.get();
            if (launchAdFragment == null || launchAdFragment.getActivity() == null || launchAdFragment.isDetached() || msg.what != 100) {
                return;
            }
            HMLog.d(LaunchAdFragment.m, "go main page", new Object[0]);
            launchAdFragment.m();
        }
    }

    public class d implements LaunchAdView.LaunchOnClickedListener {
        private LaunchViewEntity a;

        private d() {
        }

        private void a() {
            if (LaunchAdFragment.this.h) {
                return;
            }
            LaunchAdFragment.this.h = true;
            Analytics.event(LaunchAdFragment.this.a, LaunchAdFragment.this.b, StatEvent.VALUE_CLICK_AD);
            AdRepository.getInstance().requestMonitor(LaunchAdFragment.this.c, String.valueOf(this.a.id), false);
            try {
                LaunchAdFragment.this.m();
                if (this.a.mode.intValue() == 1) {
                    WebItem webItem = WebActivityUtil.toWebItem(this.a);
                    webItem.from = "FROM_STARTUP";
                    WebHelper.launch(webItem);
                } else {
                    Context context = LaunchAdFragment.this.a;
                    LaunchViewEntity launchViewEntity = this.a;
                    HMAdManager.doJumpAction(context, launchViewEntity.mode, launchViewEntity.url, null, null);
                }
                Analytics.recordEvent(new CountEventBuilder(StatEvent.EVENT_LAUNCH_VIEW_AD_DETAIL_NUM).setAnonymous(false).setIdentified(true).addExtra("id", String.valueOf(this.a.id)).addExtra("name", this.a.title));
            } catch (Exception e) {
                e.printStackTrace();
                HMLog.i(LaunchAdFragment.m, "goAdvPage Exception : " + e.getMessage(), new Object[0]);
            }
        }

        public void b(LaunchViewEntity data) {
            this.a = data;
        }

        @Override // com.xiaomi.hm.health.view.LaunchAdView.LaunchOnClickedListener
        public void onAdImageClicked(LaunchAdView view) {
            a();
        }

        @Override // com.xiaomi.hm.health.view.LaunchAdView.LaunchOnClickedListener
        public void onGifClicked(LaunchAdView view) {
            a();
        }

        @Override // com.xiaomi.hm.health.view.LaunchAdView.LaunchOnClickedListener
        public void onVideoClicked(LaunchAdView view) {
            a();
        }

        @Override // com.xiaomi.hm.health.view.LaunchAdView.LaunchOnClickedListener
        public void onVideoFinished(LaunchAdView view) {
            LaunchAdFragment.this.m();
        }
    }

    public class e implements BaseAdView.OnEnterClickedListener {
        private e() {
        }

        @Override // com.xiaomi.hm.health.view.BaseAdView.OnEnterClickedListener
        public void onEnterClicked(BaseAdView view) {
            HMLog.d(LaunchAdFragment.m, "onEnterClicked ", new Object[0]);
            Analytics.event(LaunchAdFragment.this.a, LaunchAdFragment.this.b, StatEvent.VALUE_CLICK_LEAVE);
            LaunchAdFragment.this.m();
            if (LaunchAdFragment.this.f != null) {
                LaunchAdFragment.this.f.destroy();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() {
        if (isDetached() || isRemoving() || this.i) {
            HMLog.d(m, "ad fragment is detached or already Left", new Object[0]);
            return;
        }
        this.i = true;
        HMLog.d(m, "goMainPage: ", new Object[0]);
        StartUpActivity startUpActivity = (StartUpActivity) getActivity();
        if (startUpActivity != null) {
            startUpActivity.goNextPage();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public void n() {
        this.f = (LaunchAdView) this.j.inflate();
        d dVar = new d();
        this.g = dVar;
        this.f.setLaunchOnClickedListener(dVar);
        this.f.setonEnterClickedListener(new e());
        this.f.setAdViewLoadListener(new LaunchAdView.AdViewLoadListener() { // from class: wl4
            @Override // com.xiaomi.hm.health.view.LaunchAdView.AdViewLoadListener
            public final void onFinish() {
                this.a.o();
            }
        });
    }

    public static LaunchAdFragment newInstance(boolean b2) {
        o = b2;
        return new LaunchAdFragment();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void o() {
        this.d.setVisibility(8);
    }

    private void p() {
        if (this.k) {
            m();
        } else {
            this.k = true;
        }
    }

    private void q() {
        this.l.setTimeListener(new a());
        this.l.setAdLoadListener(new b());
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        StringBuilder sb = new StringBuilder();
        sb.append("null ");
        sb.append(getActivity() == null ? " null " : "not null");
        HMLog.d(m, sb.toString(), new Object[0]);
        DisplayMetrics displayMetrics = new DisplayMetrics();
        getActivity().getWindowManager().getDefaultDisplay().getRealMetrics(displayMetrics);
        int i = displayMetrics.heightPixels;
        int i2 = displayMetrics.widthPixels;
        HMLog.d(m, "real: " + i + " " + i2, new Object[0]);
        c cVar = new c(this);
        this.l = new LaunchRepo(i2, i, false, HMLoginManager.getRegion(), SelectAreaHelper.getArea().getValue());
        q();
        if (o) {
            HMLog.d(m, "showAd and updateLaunch", new Object[0]);
            this.l.updateLaunch();
        } else {
            HMLog.d(m, "no ad and go main page", new Object[0]);
            cVar.sendEmptyMessageDelayed(100, 500L);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        this.a = getActivity();
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Analytics.event(this.a, StatEvent.EVENT_CONNECTED_INTERNET, "OffLine");
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_launch_ad, container, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        HMLog.d(m, "onDestroy ", new Object[0]);
        LaunchAdView launchAdView = this.f;
        if (launchAdView != null) {
            launchAdView.destroy();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        HMLog.d(m, "onPause", new Object[0]);
        this.k = false;
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        HMLog.d(m, "onResume", new Object[0]);
        if (this.k) {
            p();
        } else {
            this.k = true;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        View viewFindViewById = view.findViewById(R.id.default_view);
        this.d = viewFindViewById;
        this.e = (LottieAnimationView) viewFindViewById.findViewById(R.id.start_animation);
        this.j = (ViewStub) view.findViewById(R.id.view_stub_ad);
    }
}

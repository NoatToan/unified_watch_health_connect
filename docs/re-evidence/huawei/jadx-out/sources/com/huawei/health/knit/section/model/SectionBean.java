package com.huawei.health.knit.section.model;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Looper;
import android.view.KeyEvent;
import android.view.View;
import androidx.core.util.Consumer;
import androidx.fragment.app.Fragment;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.health.knit.data.KnitDataProvider;
import com.huawei.health.knit.model.KnitFragmentModel;
import com.huawei.health.knit.section.view.BaseSection;
import com.huawei.health.marketing.datatype.ResourceBriefInfo;
import com.huawei.health.marketing.datatype.ResourceContentBase;
import com.huawei.health.marketing.utils.MarketingBiUtils;
import com.huawei.health.marketing.views.IViewVisibilityChange;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.ftb;
import defpackage.ftv;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class SectionBean {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected Consumer<Boolean> f7546a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected Object f7547b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected boolean f7548c;
    protected KnitDataProvider d;
    protected Operation e;
    private HashMap<String, Object> f;
    private WeakReference<Context> g;
    private boolean h;
    protected KnitFragmentModel i;
    private boolean j;
    private String k;
    private boolean l;
    private JSONObject m;
    private boolean n;
    private LoadReason o;
    private int p;
    private boolean q;
    private int r;
    private ResourceBriefInfo s;
    private int t;
    private WeakReference<BaseSection> u;
    private View v;
    private int w;

    public enum LoadReason {
        NONE,
        LIST_READY,
        FORCE
    }

    public enum Operation {
        UNKNOWN,
        INSERT,
        CHANGE,
        REMOVE
    }

    public void d(KnitDataProvider knitDataProvider, Object obj) {
    }

    public ftb.c e(KnitDataProvider knitDataProvider) {
        return null;
    }

    public SectionBean(ResourceBriefInfo resourceBriefInfo, View view, int i, int i2, boolean z) {
        this(resourceBriefInfo.getContentType(), resourceBriefInfo.getPriority(), i, ftv.d(resourceBriefInfo), i2);
        this.s = resourceBriefInfo;
        ab();
        this.v = view;
        this.l = z;
    }

    public SectionBean(int i, int i2, int i3, KnitDataProvider knitDataProvider, int i4) {
        this.f7548c = false;
        this.e = Operation.UNKNOWN;
        this.f = new HashMap<>();
        this.u = new WeakReference<>(null);
        this.o = LoadReason.NONE;
        this.q = false;
        this.l = false;
        this.n = true;
        this.h = false;
        this.j = false;
        this.w = i;
        this.p = i2;
        this.t = i3;
        this.d = knitDataProvider;
        this.r = i4;
    }

    public SectionBean(int i, int i2, int i3, KnitDataProvider knitDataProvider, int i4, String str) {
        this.f7548c = false;
        this.e = Operation.UNKNOWN;
        this.f = new HashMap<>();
        this.u = new WeakReference<>(null);
        this.o = LoadReason.NONE;
        this.q = false;
        this.l = false;
        this.n = true;
        this.h = false;
        this.j = false;
        this.w = i;
        this.p = i2;
        this.t = i3;
        this.d = knitDataProvider;
        this.r = i4;
        this.k = str;
    }

    public SectionBean(int i, int i2, int i3, KnitDataProvider knitDataProvider, int i4, JSONObject jSONObject) {
        this.f7548c = false;
        this.e = Operation.UNKNOWN;
        this.f = new HashMap<>();
        this.u = new WeakReference<>(null);
        this.o = LoadReason.NONE;
        this.q = false;
        this.l = false;
        this.n = true;
        this.h = false;
        this.j = false;
        this.w = i;
        this.p = i2;
        this.t = i3;
        this.d = knitDataProvider;
        this.r = i4;
        this.m = jSONObject;
    }

    public void d(BaseSection baseSection) {
        this.u = new WeakReference<>(baseSection);
    }

    public WeakReference<BaseSection> k() {
        return this.u;
    }

    public void b(Consumer<Boolean> consumer) {
        this.f7546a = consumer;
    }

    public Consumer<Boolean> i() {
        return this.f7546a;
    }

    public Fragment e() {
        BaseSection baseSection = this.u.get();
        if (baseSection != null) {
            return baseSection.getKnitFragment();
        }
        return null;
    }

    public List<Bitmap> m() {
        BaseSection baseSection = this.u.get();
        if (baseSection == null) {
            return new ArrayList();
        }
        return baseSection.getShareBitmap();
    }

    public HashMap<String, Object> a() {
        return this.f;
    }

    public void c(HashMap<String, Object> map) {
        this.f = map;
    }

    public void d(Context context, LoadReason loadReason) {
        JSONObject jSONObject;
        if (this.d == null) {
            LogUtil.j("SectionBean", "loadData mKnitDataProvider == null");
            return;
        }
        this.g = new WeakReference<>(context);
        if (this.o == LoadReason.LIST_READY && loadReason == LoadReason.LIST_READY) {
            LogUtil.a("SectionBean", "loadData mLoadReason ", this.o, " loadReason ", loadReason);
            boolean z = this.q;
            if (!z && (jSONObject = this.m) != null) {
                LogUtil.a("SectionBean", "loadData mOnLineDataRefresh ", Boolean.valueOf(z), " mOnLineData ", jSONObject);
                this.q = true;
                this.d.loadData(z(), this);
                return;
            }
            LogUtil.a("SectionBean", "refresh again");
            return;
        }
        this.o = loadReason;
        this.d.loadData(z(), this);
    }

    private Context z() {
        WeakReference<Context> weakReference = this.g;
        if (weakReference == null) {
            return BaseApplication.getContext();
        }
        Context context = weakReference.get();
        return context == null ? BaseApplication.getContext() : context;
    }

    public void b(Context context) {
        KnitDataProvider knitDataProvider = this.d;
        if (knitDataProvider == null) {
            return;
        }
        knitDataProvider.loadDataLite(context);
    }

    public void y() {
        KnitDataProvider knitDataProvider = this.d;
        if (knitDataProvider == null) {
            return;
        }
        knitDataProvider.loadDefaultData(this);
    }

    public void w() {
        KnitDataProvider knitDataProvider = this.d;
        if (knitDataProvider == null) {
            return;
        }
        knitDataProvider.onCreate();
    }

    public void ad() {
        if (this.n) {
            e(true);
        }
        KnitDataProvider knitDataProvider = this.d;
        if (knitDataProvider == null) {
            return;
        }
        knitDataProvider.onResume();
    }

    public void aa() {
        KnitDataProvider knitDataProvider = this.d;
        if (knitDataProvider == null) {
            return;
        }
        knitDataProvider.onPause();
    }

    public void ac() {
        if (this.n) {
            e(false);
        }
    }

    public void d(boolean z) {
        this.n = z;
        if (z && this.l) {
            MarketingBiUtils.e(this.r, this.s);
        }
        e(z);
    }

    public void v() {
        KnitDataProvider knitDataProvider = this.d;
        if (knitDataProvider == null) {
            return;
        }
        knitDataProvider.onConfigurationChanged();
    }

    public void c(final Object obj) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            HandlerExecutor.c(new Runnable() { // from class: com.huawei.health.knit.section.model.SectionBean.5
                @Override // java.lang.Runnable
                public void run() {
                    SectionBean.this.b(obj);
                }
            });
        } else {
            b(obj);
        }
    }

    private void e(boolean z) {
        KeyEvent.Callback callback = this.v;
        if (callback instanceof IViewVisibilityChange) {
            ((IViewVisibilityChange) callback).onVisibilityChange(z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(Object obj) {
        boolean z;
        KnitDataProvider knitDataProvider = this.d;
        boolean z2 = knitDataProvider != null && knitDataProvider.isActive(BaseApplication.getContext());
        Object obj2 = this.f7547b;
        if ((obj2 == null && obj != null) || (!(z = this.f7548c) && z2)) {
            this.e = Operation.INSERT;
        } else if ((obj2 != null && obj == null) || (z && !z2)) {
            this.e = Operation.REMOVE;
        } else if (obj2 != null && obj != null) {
            this.e = Operation.CHANGE;
        } else {
            this.e = Operation.UNKNOWN;
            return;
        }
        this.f7548c = z2;
        this.f7547b = obj;
        KnitFragmentModel knitFragmentModel = this.i;
        if (knitFragmentModel != null) {
            knitFragmentModel.e(this);
        }
    }

    public KnitDataProvider c() {
        return this.d;
    }

    public int h() {
        return this.t;
    }

    public View q() {
        return this.v;
    }

    public int g() {
        return this.p;
    }

    public int l() {
        return this.w;
    }

    public String x() {
        return this.k;
    }

    public Operation f() {
        return this.e;
    }

    public void c(Operation operation) {
        this.e = operation;
    }

    public int o() {
        return this.r;
    }

    public JSONObject j() {
        return this.m;
    }

    public List<String> b() {
        return ftv.b(this.s);
    }

    public boolean r() {
        Context context = BaseApplication.getContext();
        KnitDataProvider knitDataProvider = this.d;
        boolean z = knitDataProvider == null || knitDataProvider.isActive(context);
        this.f7548c = z;
        return z && !this.j;
    }

    public void b(boolean z) {
        this.j = z;
    }

    public boolean s() {
        return this.j;
    }

    public boolean p() {
        return this.d != null && this.f7547b == null;
    }

    public Object d() {
        return this.f7547b;
    }

    public void d(KnitFragmentModel knitFragmentModel) {
        this.i = knitFragmentModel;
    }

    public void a(int i) {
        KnitDataProvider knitDataProvider = this.d;
        if (knitDataProvider == null) {
            return;
        }
        knitDataProvider.updateGpsSignal(i);
    }

    public boolean t() {
        return this.h;
    }

    public void a(boolean z) {
        this.h = z;
    }

    public void u() {
        KnitDataProvider knitDataProvider = this.d;
        if (knitDataProvider != null) {
            knitDataProvider.onDestroy();
        }
        this.f7547b = null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("SectionBean{mTemplate=");
        sb.append(this.w);
        sb.append(", mKnitDataProvider=");
        KnitDataProvider knitDataProvider = this.d;
        sb.append(knitDataProvider == null ? null : knitDataProvider.toString());
        sb.append(", isDataInvalid=");
        sb.append(p());
        sb.append(", hashCode=");
        sb.append(hashCode());
        sb.append(", isActive=");
        sb.append(r());
        sb.append(", mLastActive=");
        sb.append(this.f7548c);
        sb.append(", mIsHide = ");
        sb.append(this.j);
        sb.append(", mData=");
        sb.append(this.f7547b);
        sb.append(", mOperation=");
        sb.append(this.e);
        sb.append(", mView=");
        sb.append(this.v);
        sb.append(", mPriority=");
        sb.append(this.p);
        sb.append(", mPageType=");
        sb.append(this.t);
        sb.append(", mDefaultViewMap=");
        sb.append(this.f);
        sb.append(", mResPosId=");
        sb.append(this.r);
        sb.append('}');
        return sb.toString();
    }

    public ResourceBriefInfo n() {
        return this.s;
    }

    private void ab() {
        ResourceContentBase content;
        String content2;
        ResourceBriefInfo resourceBriefInfo = this.s;
        if (resourceBriefInfo == null || (content = resourceBriefInfo.getContent()) == null || (content2 = content.getContent()) == null) {
            return;
        }
        try {
            if ("hide".equals(new JSONObject(content2).optString("extend"))) {
                KnitDataProvider knitDataProvider = this.d;
                if (knitDataProvider != null) {
                    knitDataProvider.setIsActive(false);
                }
                this.j = true;
            }
        } catch (JSONException e) {
            LogUtil.e("SectionBean", "updateActiveStatus exception happened = ", ExceptionUtils.c(e));
        }
    }

    public void e(SectionBean sectionBean) {
        if (sectionBean == null) {
            return;
        }
        if (sectionBean.s != null) {
            if (this.s == null) {
                this.o = LoadReason.FORCE;
            }
            this.s = sectionBean.s;
            ab();
        }
        View view = sectionBean.v;
        if (view != null) {
            this.v = view;
        }
        int i = sectionBean.w;
        if (i != 0) {
            this.w = i;
        }
        this.p = sectionBean.p;
        int i2 = sectionBean.t;
        if (i2 != 0) {
            this.t = i2;
        }
        int i3 = sectionBean.r;
        if (i3 != 0) {
            this.r = i3;
        }
        JSONObject jSONObject = sectionBean.m;
        if (jSONObject != null) {
            this.m = jSONObject;
        }
    }
}

package com.huawei.health.marketing.views.dialog;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Interpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.RequestOptions;
import com.bumptech.glide.request.target.Target;
import com.huawei.haf.handler.BaseHandler;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.marketing.datatype.ResourceBriefInfo;
import com.huawei.health.marketing.datatype.templates.PopUpCombinationTemplate;
import com.huawei.health.marketing.views.CouponInfoAdapter;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.trade.PayApi;
import com.huawei.trade.datatype.Coupon;
import com.huawei.trade.datatype.CouponResult;
import com.huawei.ui.commonui.R;
import com.huawei.ui.commonui.base.BaseDialog;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import defpackage.njy;
import defpackage.qhu;
import defpackage.qpx;
import defpackage.qqf;
import defpackage.qrs;
import health.compact.a.Services;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes29.dex */
public class ReceiveCouponDialog extends BaseDialog implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f8466a;
    private RelativeLayout aa;
    private RelativeLayout ac;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f8467b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f8468c;
    private boolean d;
    private boolean e;
    private CouponInfoAdapter f;
    private Context g;
    private ImageView h;
    private ImageView i;
    private ResourceBriefInfo j;
    private ImageView k;
    private ImageView l;
    private LinearLayout m;
    private RecyclerView n;
    private LinearLayout o;
    private List<Coupon> p;
    private int q;
    private List<String> r;
    private final DialogHandler s;
    private List<com.huawei.health.marketing.datatype.Coupon> t;
    private ImageView u;
    private ImageView v;
    private List<String> w;
    private HealthTextView x;
    private HealthTextView y;
    private PopUpCombinationTemplate z;

    public ReceiveCouponDialog(Context context) {
        super(context, R.style.CustomDialog);
        this.q = 0;
        this.t = new ArrayList();
        this.d = false;
        this.f8468c = false;
        this.e = false;
        this.p = new CopyOnWriteArrayList();
        this.w = new CopyOnWriteArrayList();
        this.r = new CopyOnWriteArrayList();
        this.s = new DialogHandler();
        this.f8466a = true;
        this.f8467b = false;
        this.g = context;
    }

    public void d(int i, ResourceBriefInfo resourceBriefInfo, PopUpCombinationTemplate popUpCombinationTemplate) {
        if (popUpCombinationTemplate == null) {
            LogUtil.j("ReceiveCouponDialog", "template = null");
            return;
        }
        this.j = resourceBriefInfo;
        this.q = i;
        this.z = popUpCombinationTemplate;
        List<com.huawei.health.marketing.datatype.Coupon> coupon = popUpCombinationTemplate.getCoupon();
        this.t = coupon;
        if (njy.e(coupon)) {
            LogUtil.j("ReceiveCouponDialog", "mMarketingCoupon is empty");
            return;
        }
        LogUtil.a("ReceiveCouponDialog", "template:", popUpCombinationTemplate.toString());
        setContentView(LayoutInflater.from(getContext()).inflate(com.huawei.health.servicesui.R.layout.common_dialog_receive_coupon, (ViewGroup) null));
        b();
        c();
    }

    private void c() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(BaseApplication.getContext());
        linearLayoutManager.setOrientation(1);
        this.n.setLayoutManager(linearLayoutManager);
        e(this.n);
        CouponInfoAdapter couponInfoAdapter = new CouponInfoAdapter(this.g, new ArrayList());
        this.f = couponInfoAdapter;
        this.n.setAdapter(couponInfoAdapter);
        ThreadPoolManager.c().execute(new Runnable() { // from class: com.huawei.health.marketing.views.dialog.ReceiveCouponDialog.5
            @Override // java.lang.Runnable
            public void run() {
                ReceiveCouponDialog.this.a();
            }
        });
    }

    private void b() {
        this.o = (LinearLayout) findViewById(com.huawei.health.servicesui.R.id.coupon_dialog);
        this.l = (ImageView) findViewById(com.huawei.health.servicesui.R.id.coupon_img);
        this.x = (HealthTextView) findViewById(com.huawei.health.servicesui.R.id.coupon_submit);
        this.i = (ImageView) findViewById(com.huawei.health.servicesui.R.id.coupon_close_dialog);
        this.v = (ImageView) findViewById(com.huawei.health.servicesui.R.id.submit_img);
        this.aa = (RelativeLayout) findViewById(com.huawei.health.servicesui.R.id.submit_view);
        this.ac = (RelativeLayout) findViewById(com.huawei.health.servicesui.R.id.submit_view_success);
        this.m = (LinearLayout) findViewById(com.huawei.health.servicesui.R.id.coupon_dialog_success);
        this.k = (ImageView) findViewById(com.huawei.health.servicesui.R.id.coupon_img_success);
        this.y = (HealthTextView) findViewById(com.huawei.health.servicesui.R.id.coupon_submit_success);
        this.h = (ImageView) findViewById(com.huawei.health.servicesui.R.id.coupon_close_dialog_success);
        this.u = (ImageView) findViewById(com.huawei.health.servicesui.R.id.submit_img_success);
        this.n = (RecyclerView) findViewById(com.huawei.health.servicesui.R.id.coupon_recycle_success);
        Context context = BaseApplication.getContext();
        qqf.c(context, this.z.getPicture(), new RequestOptions().diskCacheStrategy(DiskCacheStrategy.AUTOMATIC), new d(this, 1));
        qqf.c(context, this.z.getPicture(), new RequestOptions().diskCacheStrategy(DiskCacheStrategy.AUTOMATIC), new d(this, 2));
        qqf.c(context, this.z.getPicture(), new RequestOptions().diskCacheStrategy(DiskCacheStrategy.AUTOMATIC), new d(this, 3));
        this.y.setText(this.z.getViewButtonName());
        this.x.setText(this.z.getButtonName());
        this.i.setOnClickListener(this);
        this.h.setOnClickListener(this);
        this.aa.setOnClickListener(this);
        this.ac.setOnClickListener(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        LogUtil.a("ReceiveCouponDialog", "enter getCouponInfo");
        ((PayApi) Services.d("TradeService", PayApi.class)).couponListQuery(null, null, new e(this, 1));
    }

    private void e(final List<String> list) {
        final e eVar = new e(this, 2);
        ThreadPoolManager.c().execute(new Runnable() { // from class: com.huawei.health.marketing.views.dialog.ReceiveCouponDialog.2
            @Override // java.lang.Runnable
            public void run() {
                ((PayApi) Services.d("TradeService", PayApi.class)).receiveCouponList(list, eVar);
            }
        });
    }

    static class e implements IBaseResponseCallback {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private WeakReference<ReceiveCouponDialog> f8474c;
        private int d;

        e(ReceiveCouponDialog receiveCouponDialog, int i) {
            this.f8474c = new WeakReference<>(receiveCouponDialog);
            this.d = i;
        }

        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            ReceiveCouponDialog receiveCouponDialog = this.f8474c.get();
            if (receiveCouponDialog != null) {
                if (receiveCouponDialog.s == null) {
                    LogUtil.j("ReceiveCouponDialog", "handler is null");
                    return;
                }
                LogUtil.a("ReceiveCouponDialog", "GetAssetInfoResponseCallback errorCode = ", Integer.valueOf(i), " mResultType = ", Integer.valueOf(this.d));
                int i2 = this.d;
                if (i2 == 1) {
                    receiveCouponDialog.c(i, obj);
                    return;
                } else if (i2 == 2) {
                    receiveCouponDialog.d(i, obj);
                    return;
                } else {
                    LogUtil.j("ReceiveCouponDialog", "GetAssetInfoResponseCallback error type ");
                    return;
                }
            }
            LogUtil.j("ReceiveCouponDialog", "personalCenterFragment is null");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(int i, Object obj) {
        LogUtil.a("ReceiveCouponDialog", "enter dealCouponInfo");
        if (i == 0 && (obj instanceof List)) {
            LogUtil.a("ReceiveCouponDialog", "dealReceiveInfo errorCode:", Integer.valueOf(i), "objData:", obj);
            HashMap map = new HashMap();
            for (Coupon coupon : (List) obj) {
                map.put(coupon.getCouponId(), coupon);
            }
            ArrayList arrayList = new ArrayList();
            boolean z = false;
            for (com.huawei.health.marketing.datatype.Coupon coupon2 : this.t) {
                if (map.containsKey(coupon2.getCouponsId())) {
                    if (!((Coupon) map.get(coupon2.getCouponsId())).isOutOfStockFlag()) {
                        z = true;
                    }
                    arrayList.add((Coupon) map.get(coupon2.getCouponsId()));
                }
            }
            if (!z) {
                LogUtil.a("ReceiveCouponDialog", "coupon has been received, not show dialog");
                this.f8467b = false;
                return;
            }
            this.p.clear();
            this.p.addAll(arrayList);
            this.f8467b = true;
            this.s.sendEmptyMessage(1);
            this.s.sendEmptyMessage(2);
            return;
        }
        LogUtil.j("ReceiveCouponDialog", "GET_COUPON_INFO couponListQuery fail:", Integer.valueOf(i));
        this.f8467b = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(int i, Object obj) {
        LogUtil.a("ReceiveCouponDialog", "enter dealReceiveInfo");
        if (i == 0) {
            this.f8466a = true;
            this.s.sendEmptyMessage(3);
            return;
        }
        LogUtil.d("ReceiveCouponDialog", "dealReceiveInfo errorCode:", Integer.valueOf(i), "objData:", obj);
        if (obj instanceof List) {
            LogUtil.a("ReceiveCouponDialog", "enter RECEIVE_COUPON");
            this.w.clear();
            this.r.clear();
            for (CouponResult couponResult : (List) obj) {
                if (couponResult.getResultCode() == 0 || couponResult.getResultCode() == 3090004) {
                    LogUtil.a("ReceiveCouponDialog", "receive success");
                } else if (couponResult.getResultCode() == 3090005) {
                    LogUtil.j("ReceiveCouponDialog", "receive limit", couponResult.getCouponId());
                    b(couponResult);
                    this.r.add(couponResult.getCouponId());
                } else {
                    LogUtil.a("ReceiveCouponDialog", "code:", Integer.valueOf(couponResult.getResultCode()));
                    this.w.add(couponResult.getCouponId());
                }
            }
            if (njy.e(this.w) && njy.e(this.r)) {
                this.f8466a = true;
                this.s.sendEmptyMessage(3);
                return;
            } else if (njy.e(this.w) && njy.b(this.r)) {
                LogUtil.a("ReceiveCouponDialog", "mLimitIds:", this.r.toString());
                d();
                return;
            } else {
                this.f8466a = false;
                this.s.sendEmptyMessage(4);
                return;
            }
        }
        this.f8466a = false;
        this.s.sendEmptyMessage(4);
    }

    private void b(CouponResult couponResult) {
        for (Coupon coupon : this.p) {
            if (coupon.getCouponId().equals(couponResult.getCouponId())) {
                coupon.setOutOfStockFlag(true);
            }
        }
    }

    private void d() {
        if (this.r.size() == this.t.size()) {
            this.f8466a = false;
            this.s.sendEmptyMessage(5);
        } else {
            this.f8466a = true;
            this.s.sendEmptyMessage(2);
            this.s.sendEmptyMessage(3);
        }
    }

    static class d implements RequestListener<Drawable> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final SoftReference<ReceiveCouponDialog> f8473a;
        private int d;

        d(ReceiveCouponDialog receiveCouponDialog, int i) {
            this.f8473a = new SoftReference<>(receiveCouponDialog);
            this.d = i;
        }

        @Override // com.bumptech.glide.request.RequestListener
        public boolean onLoadFailed(GlideException glideException, Object obj, Target<Drawable> target, boolean z) {
            LogUtil.a("ReceiveCouponDialog", "onLoadFailed");
            return false;
        }

        @Override // com.bumptech.glide.request.RequestListener
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean onResourceReady(Drawable drawable, Object obj, Target<Drawable> target, DataSource dataSource, boolean z) {
            ReceiveCouponDialog receiveCouponDialog = this.f8473a.get();
            if (receiveCouponDialog == null || receiveCouponDialog.e()) {
                return false;
            }
            LogUtil.a("ReceiveCouponDialog", "mResultType:", Integer.valueOf(this.d));
            int i = this.d;
            if (i == 1) {
                receiveCouponDialog.d = true;
                receiveCouponDialog.s.sendEmptyMessage(1);
            } else if (i == 2) {
                receiveCouponDialog.f8468c = true;
                receiveCouponDialog.s.sendEmptyMessage(1);
            } else if (i == 3) {
                receiveCouponDialog.e = true;
                receiveCouponDialog.s.sendEmptyMessage(1);
            } else {
                LogUtil.j("ReceiveCouponDialog", "not match");
            }
            return true;
        }
    }

    static final class DialogHandler extends BaseHandler<ReceiveCouponDialog> {
        private DialogHandler(ReceiveCouponDialog receiveCouponDialog) {
            super(receiveCouponDialog);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.huawei.haf.handler.BaseHandler
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void handleMessageWhenReferenceNotNull(ReceiveCouponDialog receiveCouponDialog, Message message) {
            if (receiveCouponDialog.e()) {
                LogUtil.j("ReceiveCouponDialog", "object.isDestory()");
                return;
            }
            LogUtil.a("ReceiveCouponDialog", "message.what:", Integer.valueOf(message.what));
            int i = message.what;
            if (i != 1) {
                if (i == 2) {
                    receiveCouponDialog.f();
                    return;
                }
                if (i == 3) {
                    receiveCouponDialog.o.setVisibility(8);
                    receiveCouponDialog.m.setVisibility(0);
                    receiveCouponDialog.d(receiveCouponDialog.m, 400);
                    return;
                } else if (i == 4) {
                    qpx.e(com.huawei.haf.application.BaseApplication.b(), com.huawei.haf.application.BaseApplication.b().getString(com.huawei.health.servicesui.R.string.IDS_receive_fail));
                    return;
                } else if (i == 5) {
                    receiveCouponDialog.dismiss();
                    qpx.e(com.huawei.haf.application.BaseApplication.b(), com.huawei.haf.application.BaseApplication.b().getString(com.huawei.health.servicesui.R.string.IDS_receive_limit));
                    return;
                } else {
                    LogUtil.j("ReceiveCouponDialog", "handleMessageWhenReferenceNotNull not match");
                    return;
                }
            }
            if (receiveCouponDialog.d && receiveCouponDialog.f8468c && receiveCouponDialog.e && receiveCouponDialog.f8467b) {
                qqf.e(receiveCouponDialog.z.getPicture(), receiveCouponDialog.l);
                qqf.e(receiveCouponDialog.z.getVibesPicture(), receiveCouponDialog.k);
                qqf.e(receiveCouponDialog.z.getButtonPicture(), receiveCouponDialog.v);
                qqf.e(receiveCouponDialog.z.getButtonPicture(), receiveCouponDialog.u);
                if (receiveCouponDialog.isShowing()) {
                    return;
                }
                LogUtil.a("MarketingResourceSetting", "dialog.setBackground: dialog show");
                receiveCouponDialog.show();
                receiveCouponDialog.setCancelable(false);
                receiveCouponDialog.d(receiveCouponDialog.o, 400);
                return;
            }
            LogUtil.j("ReceiveCouponDialog", "not ready");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean e() {
        Context context = this.g;
        return context == null || ((Activity) context).isFinishing();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view == null || qrs.r()) {
            LogUtil.j("ReceiveCouponDialog", "onClick view is null or isFaskClick");
            return;
        }
        int id = view.getId();
        if (id == com.huawei.health.servicesui.R.id.submit_view) {
            if (this.f8466a) {
                List<com.huawei.health.marketing.datatype.Coupon> coupon = this.z.getCoupon();
                ArrayList arrayList = new ArrayList();
                Iterator<com.huawei.health.marketing.datatype.Coupon> it = coupon.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().getCouponsId());
                }
                e(arrayList);
                return;
            }
            e(this.w);
            return;
        }
        if (id == com.huawei.health.servicesui.R.id.coupon_close_dialog) {
            dismiss();
            return;
        }
        if (id == com.huawei.health.servicesui.R.id.submit_view_success) {
            qhu.e(4, 3);
            dismiss();
        } else if (id != com.huawei.health.servicesui.R.id.coupon_close_dialog_success) {
            LogUtil.j("ReceiveCouponDialog", "id not match");
        } else {
            dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        LogUtil.a("ReceiveCouponDialog", "showSuccessInfo");
        this.f.d(this.p);
    }

    @Override // com.huawei.ui.commonui.base.BaseDialog, android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
    }

    @Override // com.huawei.ui.commonui.base.BaseDialog, android.app.Dialog
    public void show() {
        if (isShowing()) {
            return;
        }
        super.show();
        Window window = getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        window.setAttributes(attributes);
    }

    public void e(RecyclerView recyclerView) {
        if (recyclerView == null || this.g == null) {
            return;
        }
        recyclerView.addItemDecoration(new RecyclerView.ItemDecoration() { // from class: com.huawei.health.marketing.views.dialog.ReceiveCouponDialog.1
            @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
            public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView2, RecyclerView.State state) {
                super.getItemOffsets(rect, view, recyclerView2, state);
                int childAdapterPosition = recyclerView2.getChildAdapterPosition(view);
                int dimension = (int) ReceiveCouponDialog.this.g.getResources().getDimension(R.dimen.health_common_12dp);
                if (childAdapterPosition != 0) {
                    rect.top = dimension;
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(View view, int i) {
        LogUtil.a("ReceiveCouponDialog", "enter setAnimator");
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "rotationY", 280.0f, 360.0f);
        long j = i;
        objectAnimatorOfFloat.setDuration(j);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view, "alpha", 0.1f, 1.0f);
        objectAnimatorOfFloat2.setStartDelay(50L);
        objectAnimatorOfFloat2.setDuration(j);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(view, "scaleY", 0.3f, 1.0f);
        objectAnimatorOfFloat3.setDuration(j);
        ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(view, "scaleX", 0.3f, 1.0f);
        objectAnimatorOfFloat3.setDuration(j);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2, objectAnimatorOfFloat4, objectAnimatorOfFloat3);
        animatorSet.setStartDelay(500L);
        animatorSet.setInterpolator(new Interpolator() { // from class: com.huawei.health.marketing.views.dialog.ReceiveCouponDialog.4
            @Override // android.animation.TimeInterpolator
            public float getInterpolation(float f) {
                return (float) Math.sin((float) (((double) f) * 1.5707963267948966d));
            }
        });
        animatorSet.start();
    }
}

package com.huawei.openalliance.ad.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Toast;
import com.huawei.android.widget.ToastEx;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.hmf.tasks.OnCanceledListener;
import com.huawei.hmf.tasks.OnFailureListener;
import com.huawei.hmf.tasks.OnSuccessListener;
import com.huawei.hmf.tasks.Task;
import com.huawei.hms.ads.AdFeedbackExtraListener;
import com.huawei.hms.ads.AdFeedbackListener;
import com.huawei.openalliance.ad.R;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.openalliance.ad.constant.MapKeyNames;
import com.huawei.openalliance.ad.cx;
import com.huawei.openalliance.ad.db.bean.ContentRecord;
import com.huawei.openalliance.ad.df;
import com.huawei.openalliance.ad.ho;
import com.huawei.openalliance.ad.hw;
import com.huawei.openalliance.ad.inter.HiAd;
import com.huawei.openalliance.ad.inter.data.FeedbackInfo;
import com.huawei.openalliance.ad.pc;
import com.huawei.openalliance.ad.pl;
import com.huawei.openalliance.ad.rc;
import com.huawei.openalliance.ad.sw;
import com.huawei.openalliance.ad.utils.ah;
import com.huawei.openalliance.ad.utils.dk;
import com.huawei.openalliance.ad.views.feedback.FeedbackView;
import com.huawei.openalliance.ad.views.i;
import java.lang.ref.WeakReference;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class FeedbackActivity extends com.huawei.openalliance.ad.activity.a implements com.huawei.openalliance.ad.views.feedback.b, i.a {
    private static WeakReference<Context> w;
    private ContentRecord q;
    private com.huawei.openalliance.ad.inter.data.e r;
    private rc s;
    private cx v;
    private int y;
    private static Map<Integer, AdFeedbackListener> t = new HashMap();
    private static Map<Integer, AdFeedbackListener> u = new HashMap();
    private static SecureRandom x = new SecureRandom();
    private static WeakReference<View> A = null;
    private static int[] B = null;
    private boolean z = false;
    private ho C = null;

    @Override // com.huawei.openalliance.ad.activity.a, com.huawei.openalliance.ad.activity.e
    protected void a() {
    }

    @Override // com.huawei.openalliance.ad.activity.a, com.huawei.openalliance.ad.activity.f, android.app.Activity
    protected void onDestroy() {
        View view;
        super.onDestroy();
        df.a((com.huawei.openalliance.ad.inter.data.e) null);
        hw.b("FeedbackActivity", "onDestroy %s, instance: %s", Integer.valueOf(hashCode()), Integer.valueOf(this.y));
        a(this.y);
        if (this.l != null) {
            this.l.setScreenLockCallBack(null);
        }
        WeakReference<View> weakReference = A;
        if (weakReference == null || (view = weakReference.get()) == null || this.C == null) {
            return;
        }
        view.getViewTreeObserver().removeOnGlobalLayoutListener(this.C);
    }

    @Override // com.huawei.openalliance.ad.activity.a, com.huawei.openalliance.ad.activity.e, com.huawei.openalliance.ad.activity.f, android.app.Activity
    protected void onCreate(Bundle bundle) {
        View view;
        try {
            super.onCreate(bundle);
            WeakReference<View> weakReference = A;
            if (weakReference != null && (view = weakReference.get()) != null) {
                this.C = new ho(this, view, B);
                view.getViewTreeObserver().addOnGlobalLayoutListener(this.C);
            }
            if (Constants.MAGEZINE_PKG_NAME.equalsIgnoreCase(getApplicationContext().getPackageName())) {
                if (Build.VERSION.SDK_INT >= 27) {
                    setShowWhenLocked(true);
                } else {
                    hw.c("FeedbackActivity", "api is too low to support showWhenLocked.");
                }
            }
            if (dk.b((Context) this)) {
                this.z = true;
            }
            m();
            com.huawei.openalliance.ad.analysis.i iVar = new com.huawei.openalliance.ad.analysis.i(this);
            this.v = iVar;
            iVar.f(this.q, "0");
            pc pcVar = new pc(this, sw.a(this, this.q.f()));
            this.s = pcVar;
            pcVar.a(this.q);
            WeakReference<Context> weakReference2 = w;
            if (weakReference2 != null) {
                dk.a(this, weakReference2.get());
            }
            try {
                getWindow().clearFlags(1048576);
            } catch (Throwable th) {
                hw.c("FeedbackActivity", "clear flag err: %s.", th.getClass().getSimpleName());
            }
            b(u.get(Integer.valueOf(this.y)));
            hw.b("FeedbackActivity", "onCreate: %s, instance: %s", Integer.valueOf(hashCode()), Integer.valueOf(this.y));
        } catch (Throwable th2) {
            hw.c("FeedbackActivity", "init error: %s", th2.getClass().getSimpleName());
            a(u.get(Integer.valueOf(this.y)));
            finish();
        }
    }

    @Override // com.huawei.openalliance.ad.activity.a, com.huawei.openalliance.ad.activity.f, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }

    @Override // com.huawei.openalliance.ad.views.i.a
    public void l() {
        hw.b("FeedbackActivity", "onLockScreenOpen.");
        try {
            Task<Boolean> taskA = HiAd.getInstance(this).getAskForUnlockScreen().a(this);
            hw.b("FeedbackActivity", "task is set.");
            c cVar = new c(this, this.l);
            a aVar = new a();
            b bVar = new b();
            taskA.addOnSuccessListener(cVar);
            taskA.addOnCanceledListener(aVar);
            taskA.addOnFailureListener(bVar);
        } catch (NullPointerException unused) {
            hw.c("FeedbackActivity", "get task err, NullPointerException");
        } catch (Throwable th) {
            hw.c("FeedbackActivity", "listen task err: %s.", th.getClass().getSimpleName());
        }
    }

    @Override // com.huawei.openalliance.ad.activity.a
    protected boolean i() {
        SafeIntent safeIntent = new SafeIntent(getIntent());
        this.r = (com.huawei.openalliance.ad.inter.data.e) safeIntent.getSerializableExtra(MapKeyNames.NATIVE_AD);
        this.y = safeIntent.getIntExtra(MapKeyNames.INSTANCE_ID, 0);
        com.huawei.openalliance.ad.inter.data.e eVar = this.r;
        ContentRecord contentRecordM = eVar == null ? df.m() : pl.a(eVar);
        this.q = contentRecordM;
        if (contentRecordM == null) {
            return false;
        }
        return super.i();
    }

    @Override // com.huawei.openalliance.ad.activity.a
    public void e() {
        f();
        this.l.a(this.h, this.i);
        this.l.setAdContent(this.q);
        this.l.setFeedbackListener(this);
        this.l.setScreenLockCallBack(this);
    }

    @Override // com.huawei.openalliance.ad.activity.a
    protected int d() {
        return R.layout.hiad_activity_feedback;
    }

    @Override // com.huawei.openalliance.ad.activity.a
    protected void c() {
        this.e = (RelativeLayout) findViewById(R.id.feedback_activity_root);
        this.f = findViewById(R.id.margin_view);
        this.g = findViewById(R.id.feedback_anchor_view);
        this.j = (FeedbackView) findViewById(R.id.top_feedback_view);
        this.m = (ImageView) findViewById(R.id.top_feedback_iv);
        this.k = (FeedbackView) findViewById(R.id.bottom_feedback_view);
        this.n = (ImageView) findViewById(R.id.bottom_feedback_iv);
        a(dk.r(getApplicationContext()));
    }

    @Override // com.huawei.openalliance.ad.activity.a
    protected void b() {
        a(u.get(Integer.valueOf(this.y)));
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001d A[Catch: all -> 0x0021, TRY_LEAVE, TryCatch #0 {all -> 0x0021, blocks: (B:3:0x0002, B:9:0x0013, B:10:0x0019, B:11:0x001d), top: B:18:0x0002 }] */
    @Override // com.huawei.openalliance.ad.views.feedback.b
    public void a(int i, FeedbackInfo feedbackInfo) {
        try {
            ArrayList arrayList = new ArrayList();
            arrayList.add(feedbackInfo);
            if (i == 1) {
                a(i, arrayList);
            } else if (i == 2) {
                a(arrayList);
            } else if (i != 3) {
                hw.a("FeedbackActivity", "invalid feedback type");
            } else {
                a(i, arrayList);
            }
        } catch (Throwable th) {
            hw.c("FeedbackActivity", "itemClickAction error: %s", th.getClass().getSimpleName());
        }
        finish();
    }

    private void m() {
        this.e.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.openalliance.ad.activity.FeedbackActivity.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (FeedbackActivity.this.v != null) {
                    FeedbackActivity.this.v.f(FeedbackActivity.this.q, "3");
                }
                FeedbackActivity.this.finish();
            }
        });
    }

    private static void b(AdFeedbackListener adFeedbackListener) {
        if (adFeedbackListener instanceof AdFeedbackExtraListener) {
            ((AdFeedbackExtraListener) adFeedbackListener).onAdFeedBackExtra(1, null);
        }
    }

    private void a(boolean z) {
        if (z) {
            Drawable drawable = getResources().getDrawable(R.drawable.hiad_feedback_sharp_dark);
            if (this.m != null) {
                this.m.setImageDrawable(drawable);
            }
            if (this.n != null) {
                this.n.setImageDrawable(drawable);
            }
        }
    }

    private void a(List<FeedbackInfo> list) {
        Toast toastMakeText = Toast.makeText(getApplicationContext(), R.string.hiad_feedback_had_feedback, 0);
        if (this.z) {
            a(toastMakeText);
        } else {
            toastMakeText.show();
        }
        rc rcVar = this.s;
        if (rcVar != null) {
            rcVar.b(list);
        }
        cx cxVar = this.v;
        if (cxVar != null) {
            cxVar.f(this.q, "1");
        }
        AdFeedbackListener adFeedbackListener = t.get(Integer.valueOf(this.y));
        AdFeedbackListener adFeedbackListener2 = u.get(Integer.valueOf(this.y));
        hw.b("FeedbackActivity", "pos, innerListener: %s, listener: %s", Boolean.valueOf(adFeedbackListener != null), Boolean.valueOf(adFeedbackListener2 != null));
        if (adFeedbackListener != null) {
            adFeedbackListener.onAdLiked();
        }
        if (adFeedbackListener2 != null) {
            adFeedbackListener2.onAdLiked();
        }
    }

    private static void a(com.huawei.openalliance.ad.views.feedback.c cVar, View view) {
        if (cVar.d() != null) {
            w = new WeakReference<>(cVar.d());
        } else {
            w = new WeakReference<>(view.getContext());
        }
    }

    private static void a(AdFeedbackListener adFeedbackListener) {
        if (adFeedbackListener != null) {
            adFeedbackListener.onAdFeedbackShowFailed();
        }
    }

    private void a(Toast toast) {
        String str;
        if (toast == null) {
            str = "toast is null.";
        } else {
            try {
                WindowManager.LayoutParams windowParams = ToastEx.getWindowParams(toast);
                if (windowParams != null) {
                    windowParams.flags |= 524288;
                    toast.show();
                    return;
                }
                str = "params is null.";
            } catch (Throwable th) {
                hw.c("FeedbackActivity", "show toast err: %s.", th.getClass().getSimpleName());
                return;
            }
        }
        hw.b("FeedbackActivity", str);
    }

    public static void a(Context context, com.huawei.openalliance.ad.views.feedback.c cVar) {
        if (cVar == null) {
            return;
        }
        if (ah.a()) {
            hw.b("FeedbackActivity", "fast click");
            return;
        }
        AdFeedbackListener adFeedbackListenerC = cVar.c();
        com.huawei.openalliance.ad.inter.data.e eVarL = df.l();
        if (eVarL == null || cVar.a() == null || !ah.a(eVarL.getFeedbackInfoList())) {
            hw.d("FeedbackActivity", "startFeedbackActivity fail: invalid parameter.");
            a(adFeedbackListenerC);
            return;
        }
        int iNextInt = x.nextInt(Integer.MAX_VALUE);
        t.put(Integer.valueOf(iNextInt), cVar.b());
        u.put(Integer.valueOf(iNextInt), adFeedbackListenerC);
        try {
            View viewA = cVar.a();
            A = new WeakReference<>(viewA);
            int[] iArr = new int[2];
            a(cVar, viewA);
            viewA.getLocationInWindow(iArr);
            hw.b("FeedbackActivity", "startFeedbackActivity, anchorView.getLocationInWindow [x,y]= %d, %d", Integer.valueOf(iArr[0]), Integer.valueOf(iArr[1]));
            int[] iArr2 = new int[2];
            viewA.getLocationOnScreen(iArr2);
            B = iArr2;
            int[] iArr3 = {viewA.getMeasuredWidth(), viewA.getMeasuredHeight()};
            Intent intent = new Intent(context, (Class<?>) FeedbackActivity.class);
            intent.putExtra(MapKeyNames.ANCHOR_LOCATION, iArr);
            intent.putExtra(MapKeyNames.ANCHOR_SIZE, iArr3);
            intent.setFlags(65536);
            intent.putExtra(MapKeyNames.NATIVE_AD, eVarL);
            intent.putExtra(MapKeyNames.INSTANCE_ID, iNextInt);
            if (!(context instanceof Activity)) {
                intent.addFlags(268435456);
            }
            intent.setClipData(Constants.CLIP_DATA);
            context.startActivity(intent);
        } catch (Throwable th) {
            hw.c("FeedbackActivity", "startFeedbackActivity error: %s", th.getClass().getSimpleName());
            a(adFeedbackListenerC);
            a(iNextInt);
        }
    }

    private void a(int i, List<FeedbackInfo> list) {
        Toast toastMakeText = Toast.makeText(getApplicationContext(), R.string.hiad_feedback_reduce_such_content, 0);
        if (this.z) {
            a(toastMakeText);
        } else {
            toastMakeText.show();
        }
        rc rcVar = this.s;
        if (rcVar != null) {
            rcVar.c(list);
        }
        cx cxVar = this.v;
        if (cxVar != null) {
            cxVar.f(this.q, 1 == i ? "2" : "4");
        }
        AdFeedbackListener adFeedbackListener = t.get(Integer.valueOf(this.y));
        AdFeedbackListener adFeedbackListener2 = u.get(Integer.valueOf(this.y));
        hw.b("FeedbackActivity", "neg, innerListener: %s, listener: %s", Boolean.valueOf(adFeedbackListener != null), Boolean.valueOf(adFeedbackListener2 != null));
        if (adFeedbackListener != null) {
            adFeedbackListener.onAdDisliked();
        }
        if (adFeedbackListener2 != null) {
            adFeedbackListener2.onAdDisliked();
        }
    }

    /* JADX INFO: loaded from: classes12.dex */
    static class a implements OnCanceledListener {
        @Override // com.huawei.hmf.tasks.OnCanceledListener
        public void onCanceled() {
            hw.c("FeedbackActivity", "unlock screen canceled.");
        }

        private a() {
        }
    }

    /* JADX INFO: loaded from: classes12.dex */
    static class b implements OnFailureListener {
        @Override // com.huawei.hmf.tasks.OnFailureListener
        public void onFailure(Exception exc) {
            hw.c("FeedbackActivity", "unlock fail, exception is %s.", exc.getMessage());
        }

        private b() {
        }
    }

    private static void a(int i) {
        t.remove(Integer.valueOf(i));
        u.remove(Integer.valueOf(i));
    }

    /* JADX INFO: loaded from: classes12.dex */
    static class c implements OnSuccessListener<Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private WeakReference<FeedbackActivity> f18126a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private WeakReference<i> f18127b;

        @Override // com.huawei.hmf.tasks.OnSuccessListener
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Boolean bool) {
            String str;
            hw.b("FeedbackActivity", "unlock result is %s.", bool);
            FeedbackActivity feedbackActivity = this.f18126a.get();
            i iVar = this.f18127b.get();
            if (bool.booleanValue()) {
                if (iVar != null) {
                    iVar.e();
                    return;
                }
                str = "weak reference PPSBaseDialogContentView is null";
            } else {
                if (feedbackActivity != null) {
                    feedbackActivity.finish();
                    return;
                }
                str = "weak reference feedback activity is null.";
            }
            hw.c("FeedbackActivity", str);
        }

        public c(FeedbackActivity feedbackActivity, i iVar) {
            this.f18126a = new WeakReference<>(feedbackActivity);
            this.f18127b = new WeakReference<>(iVar);
        }
    }
}

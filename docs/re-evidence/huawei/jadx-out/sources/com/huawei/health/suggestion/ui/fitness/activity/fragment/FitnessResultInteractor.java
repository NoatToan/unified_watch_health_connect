package com.huawei.health.suggestion.ui.fitness.activity.fragment;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.format.DateUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.RelativeLayout;
import com.huawei.haf.handler.BaseHandler;
import com.huawei.health.ecologydevice.ui.measure.fragment.device.DeviceCategoryFragment;
import com.huawei.health.socialshare.api.SocialShareCenterApi;
import com.huawei.health.suggestion.model.FitnessShareRecord;
import com.huawei.health.suggestion.ui.view.share.FitnessShareNewDetailView;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.R;
import com.huawei.ui.commonui.dialog.CommonDialog21;
import com.huawei.ui.commonui.viewpager.HealthPagerAdapter;
import com.huawei.ui.commonui.viewpager.HealthViewPager;
import defpackage.gxt;
import defpackage.gxy;
import defpackage.gxz;
import defpackage.gyd;
import defpackage.hdq;
import defpackage.idy;
import defpackage.lmf;
import defpackage.lrp;
import defpackage.lsv;
import defpackage.njy;
import defpackage.ped;
import defpackage.qsp;
import defpackage.xji;
import health.compact.a.LanguageUtil;
import health.compact.a.LogAnonymous;
import health.compact.a.Services;
import health.compact.a.Utils;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.apache.commons.io.FileUtils;

/* JADX INFO: loaded from: classes9.dex */
public class FitnessResultInteractor {
    private static final int[] e = {R.drawable.fitness_background_1, R.drawable.share_geometry_1, R.drawable.share_geometry_2, R.drawable.share_geometry_3};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f9188a;
    private float aa;
    private View ac;
    private gyd ad;
    private String af;
    private ArrayList<View> ai;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private c f9189b;
    private Activity d;
    private Context f;
    private int g;
    private float i;
    private String j;
    private int k;
    private int l;
    private int n;
    private long o;
    private FitnessShareNewDetailView p;
    private boolean q;
    private String r;
    private String s;
    private int t;
    private File u;
    private float v;
    private RelativeLayout w;
    private HealthViewPager z;
    private int m = 0;
    private int x = 0;
    private int[] h = {5};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ArrayList<Integer> f9190c = new ArrayList<>(16);
    private CommonDialog21 ae = null;
    private Handler y = new b(Looper.getMainLooper(), this);
    private SocialShareCenterApi ab = (SocialShareCenterApi) Services.b("PluginSocialShare", SocialShareCenterApi.class);

    public FitnessResultInteractor(Context context) {
        this.f = null;
        this.f = context;
    }

    public void d(Activity activity, Bundle bundle) {
        if (bundle == null || this.f == null) {
            LogUtil.j("Suggestion_FitnessResultInteractor", "onCreate ", "bundle is null or mContext is null");
            return;
        }
        e(activity.getResources().getString(com.huawei.health.servicesui.R.string.IDS_motiontrack_common_ui_waiting));
        this.d = activity;
        this.s = bundle.getString("train_name", "--");
        this.aa = bundle.getFloat("train_duration", 0.0f);
        this.i = bundle.getFloat("calorie", 0.0f);
        this.f9188a = bundle.getFloat("active_calorie", 0.0f);
        this.n = bundle.getInt("heart_rate", 0);
        this.v = bundle.getFloat("percent", 0.0f);
        this.t = bundle.getInt("levels_count", 0);
        this.o = bundle.getLong("exercise_current_time", System.currentTimeMillis());
        this.m = bundle.getInt("entrance", 0);
        this.af = bundle.getString("workoutid", null);
        this.k = bundle.getInt("action_count", 0);
        this.l = bundle.getInt("exercise_count", 0);
        this.g = bundle.getInt(DeviceCategoryFragment.DEVICE_TYPE, 0);
        this.j = DateUtils.formatDateTime(this.f.getApplicationContext(), this.o, 21);
        e(activity);
        View view = this.ac;
        if (view != null) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.huawei.health.suggestion.ui.fitness.activity.fragment.FitnessResultInteractor.2
                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public void onGlobalLayout() {
                    LogUtil.a("Suggestion_FitnessResultInteractor", "onGlobalLayout");
                    FitnessResultInteractor.this.y.sendEmptyMessage(1);
                    FitnessResultInteractor.this.ac.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                }
            });
        }
        if (this.g == 3) {
            this.x = bundle.getInt("product_id", 0);
        }
        this.r = bundle.getString("isAICourse");
    }

    static class b extends BaseHandler<FitnessResultInteractor> {
        public b(Looper looper, FitnessResultInteractor fitnessResultInteractor) {
            super(looper, fitnessResultInteractor);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.huawei.haf.handler.BaseHandler
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void handleMessageWhenReferenceNotNull(FitnessResultInteractor fitnessResultInteractor, Message message) {
            if (message.what != 1) {
                return;
            }
            fitnessResultInteractor.g();
            fitnessResultInteractor.c();
        }
    }

    private void e(Activity activity) {
        if (activity == null) {
            LogUtil.j("Suggestion_FitnessResultInteractor", "initShareView ", "activity is null");
            return;
        }
        this.w = (RelativeLayout) qsp.a(activity, com.huawei.health.suggestion.R.id.share_viewpager_layout);
        this.ai = new ArrayList<>(1);
        i();
        HealthViewPager healthViewPager = (HealthViewPager) qsp.a(activity, com.huawei.health.suggestion.R.id.view_pager);
        this.z = healthViewPager;
        healthViewPager.setOffscreenPageLimit(1);
        this.z.setPageTransformer(true, new HealthViewPager.PageTransformer() { // from class: com.huawei.health.suggestion.ui.fitness.activity.fragment.FitnessResultInteractor.4
            @Override // com.huawei.uikit.hwviewpager.widget.HwViewPager.PageTransformer
            public void transformPage(View view, float f) {
            }
        });
        this.w.setOnTouchListener(new View.OnTouchListener() { // from class: com.huawei.health.suggestion.ui.fitness.activity.fragment.FitnessResultInteractor.3
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                return FitnessResultInteractor.this.z.dispatchTouchEvent(motionEvent);
            }
        });
        c cVar = new c(this.ai);
        this.f9189b = cVar;
        this.z.setAdapter(cVar);
    }

    private void i() {
        Context context = this.f;
        if (context == null) {
            LogUtil.j("Suggestion_FitnessResultInteractor", "initShareNewDetail ", "mContext is null");
            return;
        }
        FitnessShareNewDetailView fitnessShareNewDetailView = (FitnessShareNewDetailView) View.inflate(context, com.huawei.health.suggestion.R.layout.sug_layout_share_new, null).findViewById(com.huawei.health.suggestion.R.id.fitness_share_new_detail);
        this.p = fitnessShareNewDetailView;
        this.ac = fitnessShareNewDetailView;
        j();
        this.ai.add(this.p);
    }

    private void j() {
        this.ad = b();
        this.q = Utils.o() || !LanguageUtil.l(this.f);
        h();
    }

    private List<gxz> d() {
        ArrayList arrayList;
        ArrayList arrayList2 = new ArrayList(Arrays.asList(1005, 1020, 1021, 1022));
        if (LanguageUtil.l(this.f)) {
            arrayList = new ArrayList(Arrays.asList(Integer.valueOf(R.drawable.sport_share_watermark_1005), Integer.valueOf(R.drawable.sport_share_watermark_1020), Integer.valueOf(R.drawable.sport_share_watermark_1021), Integer.valueOf(R.drawable.sport_share_watermark_1022)));
        } else {
            arrayList = new ArrayList(Arrays.asList(Integer.valueOf(R.drawable.sport_share_watermark_1005_english), Integer.valueOf(R.drawable.sport_share_watermark_1020_english), Integer.valueOf(R.drawable.sport_share_watermark_1021_english), Integer.valueOf(R.drawable.sport_share_watermark_1022_english)));
        }
        ArrayList arrayList3 = new ArrayList(4);
        for (int i = 0; i < 4; i++) {
            gxz gxzVar = new gxz();
            gxzVar.b(((Integer) arrayList.get(i)).intValue());
            gxzVar.a(((Integer) arrayList2.get(i)).intValue());
            arrayList3.add(gxzVar);
        }
        return arrayList3;
    }

    private void h() {
        this.f9190c.clear();
        d(this.f9190c, e);
    }

    private void d(List<Integer> list, int[] iArr) {
        for (int i : iArr) {
            list.add(Integer.valueOf(i));
        }
    }

    static class c extends HealthPagerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private ArrayList<View> f9193a;

        @Override // com.huawei.uikit.hwviewpager.widget.HwPagerAdapter
        public int getItemPosition(Object obj) {
            return -2;
        }

        @Override // com.huawei.uikit.hwviewpager.widget.HwPagerAdapter
        public boolean isViewFromObject(View view, Object obj) {
            return view == obj;
        }

        c(ArrayList arrayList) {
            this.f9193a = arrayList;
        }

        @Override // com.huawei.uikit.hwviewpager.widget.HwPagerAdapter
        public Object instantiateItem(ViewGroup viewGroup, int i) {
            if (njy.e(this.f9193a, i)) {
                LogUtil.j("Suggestion_FitnessResultInteractor", "The position is out of bound");
                return null;
            }
            ViewParent parent = this.f9193a.get(i).getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeAllViews();
            }
            viewGroup.addView(this.f9193a.get(i));
            return this.f9193a.get(i);
        }

        @Override // com.huawei.uikit.hwviewpager.widget.HwPagerAdapter
        public int getCount() {
            return this.f9193a.size();
        }

        @Override // com.huawei.uikit.hwviewpager.widget.HwPagerAdapter
        public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
            if (obj instanceof View) {
                viewGroup.removeView((View) obj);
            }
        }
    }

    private List<Bitmap> e(List<View> list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<View> it = list.iterator();
        while (it.hasNext()) {
            Bitmap bitmapE = lsv.e(it.next());
            if (bitmapE == null) {
                LogUtil.j("Suggestion_FitnessResultInteractor", "screenShotBitmap is null");
            } else {
                arrayList.add(bitmapE);
            }
        }
        return arrayList;
    }

    private List<String> f() {
        ArrayList arrayList = new ArrayList(this.ai.size());
        List<Bitmap> listE = e(this.ai);
        LogUtil.a("Suggestion_FitnessResultInteractor", "saveShareBitmap shareBitmapList size", Integer.valueOf(listE.size()));
        for (int i = 0; i < listE.size(); i++) {
            arrayList.add(e(listE.get(i), i));
        }
        return arrayList;
    }

    private String e(Bitmap bitmap, int i) {
        String canonicalPath;
        File file = new File(lrp.g);
        if (!file.exists() && !file.mkdirs()) {
            LogUtil.j("Suggestion_FitnessResultInteractor", "saveBitmapToFile:mkdirs error");
        }
        File file2 = new File(file, i + ".jpg");
        this.u = file2;
        try {
            canonicalPath = file2.getCanonicalPath();
        } catch (IOException unused) {
            LogUtil.j("Suggestion_FitnessResultInteractor", "saveBitmapToFile getCanonicalPath exception");
            canonicalPath = "";
        }
        try {
            FileOutputStream fileOutputStreamOpenOutputStream = FileUtils.openOutputStream(this.u);
            try {
                if (!xji.b(this.u, canonicalPath)) {
                    LogUtil.j("Suggestion_FitnessResultInteractor", "invalidate file path");
                    if (this.u.exists()) {
                        this.u.deleteOnExit();
                    }
                    if (fileOutputStreamOpenOutputStream == null) {
                        return null;
                    }
                    fileOutputStreamOpenOutputStream.close();
                    return null;
                }
                bitmap.compress(Bitmap.CompressFormat.JPEG, 90, fileOutputStreamOpenOutputStream);
                this.u.deleteOnExit();
                fileOutputStreamOpenOutputStream.flush();
                if (fileOutputStreamOpenOutputStream != null) {
                    fileOutputStreamOpenOutputStream.close();
                }
                return canonicalPath;
            } catch (Throwable th) {
                if (fileOutputStreamOpenOutputStream != null) {
                    try {
                        fileOutputStreamOpenOutputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (IOException unused2) {
            LogUtil.j("Suggestion_FitnessResultInteractor", "saveBitmapToFile:IOException ");
        } catch (IllegalArgumentException e2) {
            LogUtil.j("Suggestion_FitnessResultInteractor", "saveBitmapToFile:IllegalArgumentException ", LogAnonymous.b(e2));
        }
    }

    public void a() {
        File file = this.u;
        if (file != null && file.exists() && !this.u.delete()) {
            LogUtil.a("Suggestion_FitnessResultInteractor", "onDestroy, delete file failed");
        }
        Handler handler = this.y;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    private FitnessShareRecord e() {
        FitnessShareRecord fitnessShareRecord = new FitnessShareRecord();
        fitnessShareRecord.setCalorie(this.i);
        fitnessShareRecord.setActiveCalorie(this.f9188a);
        fitnessShareRecord.setPercent(this.v);
        fitnessShareRecord.setActionCount(this.k);
        fitnessShareRecord.setHeartRate(this.n);
        int i = this.g;
        if (i == 3) {
            fitnessShareRecord.setDeviceType(this.x);
        } else {
            fitnessShareRecord.setDeviceType(i);
        }
        fitnessShareRecord.setExerciseName(this.s);
        fitnessShareRecord.setExerciseTime(this.o);
        fitnessShareRecord.setExerciseTimes(this.l);
        fitnessShareRecord.setDuration(this.aa);
        fitnessShareRecord.setLevelCount(this.t);
        return fitnessShareRecord;
    }

    private gyd b() {
        hdq hdqVar = new hdq(this.f, e());
        hdqVar.b();
        return hdqVar.d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        List<String> listF = f();
        if (njy.e(listF)) {
            LogUtil.e("Suggestion_FitnessResultInteractor", "shareImage shareBitmapList size is error 0, pls try again");
            return;
        }
        LogUtil.a("Suggestion_FitnessResultInteractor", "shareImage shareBitmapList size", Integer.valueOf(listF.size()));
        lmf.d().c(this.f, "1130014", e(0), 0);
        gxy gxyVar = new gxy();
        gxyVar.e(true);
        gxyVar.e(listF.get(0));
        gxyVar.a(this.f9190c);
        gxyVar.c(10001);
        gxyVar.c(this.ad);
        gxyVar.d(e(0));
        gxt gxtVar = new gxt(13);
        gxyVar.d(d());
        gxtVar.d(gxyVar);
        this.ab.exeShare(a(gxtVar), this.f);
    }

    private gxt a(gxt gxtVar) {
        gxtVar.d(AnalyticsValue.HEALTH_SHARE_FITNESS_REPORT_SHARE_2100009.value());
        gxtVar.f(false);
        gxtVar.d(2);
        return gxtVar;
    }

    private Map<String, Object> e(int i) {
        HashMap map = new HashMap(16);
        map.put("workout_name", this.s);
        if (idy.d()) {
            map.put("finish_rate", idy.c(this.v));
            map.put("workout_TimeInMinutes", ped.i(this.aa));
        }
        if (i >= 0) {
            int[] iArr = this.h;
            if (i < iArr.length) {
                map.put("share_result", Integer.valueOf(iArr[i]));
            }
        }
        map.put("entrance", Integer.valueOf(this.m));
        map.put("workout_id", this.af);
        map.put("wear_type", Integer.valueOf(this.g));
        map.put("isAICourse", this.r);
        return map;
    }

    public void e(String str) {
        LogUtil.a("Suggestion_FitnessResultInteractor", "openWaitingDialog");
        if (this.ae != null && !this.d.isDestroyed() && !this.d.isFinishing()) {
            this.ae.dismiss();
            this.ae = null;
        }
        new CommonDialog21(this.f, R.style.app_update_dialogActivity);
        CommonDialog21 commonDialog21B = CommonDialog21.b(this.f);
        this.ae = commonDialog21B;
        commonDialog21B.b(str);
        this.ae.setCancelable(false);
        this.ae.c();
    }

    public void c() {
        LogUtil.a("Suggestion_FitnessResultInteractor", "closeWaitingDialog");
        if (this.ae != null) {
            if (!this.d.isDestroyed() && !this.d.isFinishing() && this.ae.isShowing()) {
                this.ae.dismiss();
            }
            this.ae = null;
        }
    }
}

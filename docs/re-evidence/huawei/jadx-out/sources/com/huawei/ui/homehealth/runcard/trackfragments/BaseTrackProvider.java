package com.huawei.ui.homehealth.runcard.trackfragments;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import com.huawei.haf.handler.BaseHandler;
import com.huawei.health.knit.data.BaseKnitDataProvider;
import com.huawei.health.knit.section.model.SectionBean;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.ui.homehealth.R;
import com.huawei.ui.homehealth.runcard.utils.TargetChoicePickerUtils;
import com.zhangyue.iReader.sdk.scheme.ISchemeListener;
import defpackage.iwn;
import defpackage.jqq;
import defpackage.njy;
import defpackage.nkb;
import defpackage.qqf;
import defpackage.qre;
import defpackage.qrs;
import defpackage.tfi;
import defpackage.vdo;
import defpackage.yto;
import health.compact.a.UnitUtil;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes43.dex */
public class BaseTrackProvider extends BaseKnitDataProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected int f25856a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Activity f25857b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Context f25858c;
    protected Resources d;
    private SectionBean f;
    private Drawable i;
    private String n;
    private String t;
    private int h = 16;
    private int o = -1;
    private float k = -1.0f;
    private HashMap<String, Object> m = new HashMap<>();
    private HiHealthData g = new HiHealthData();
    private Handler j = new a(Looper.getMainLooper(), this);
    private e l = new e(this);
    private List<Drawable> e = new ArrayList(2);

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    public boolean isActive(Context context) {
        return true;
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    public void loadDefaultData(SectionBean sectionBean) {
        sectionBean.c(this.g);
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    public void updateGpsSignal(int i) {
        Message messageObtainMessage = this.j.obtainMessage();
        messageObtainMessage.what = 100;
        messageObtainMessage.arg1 = i;
        this.j.sendMessage(messageObtainMessage);
    }

    protected void d() {
        this.f25856a = 258;
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    /* JADX INFO: renamed from: loadData */
    public void b(Context context, SectionBean sectionBean) {
        this.f = sectionBean;
        this.f25858c = context;
        this.d = context.getResources();
        d();
        e();
        c();
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    public void parseParams(Context context, HashMap map, Object obj) {
        Context context2 = context == null ? BaseApplication.getContext() : context;
        this.f25858c = context2;
        this.f25857b = d(context2);
        this.d = this.f25858c.getResources();
        this.h = qrs.d(this.f25858c, 4.0f);
        e(context, map, obj);
        if (obj instanceof HiHealthData) {
            d((HashMap<String, Object>) map, (HiHealthData) obj);
        }
        if (obj.equals("CLIMB_NULL_DATA")) {
            e((HashMap<String, Object>) map);
        }
    }

    private void e(HashMap<String, Object> map) {
        String strA;
        if (UnitUtil.f()) {
            strA = TargetChoicePickerUtils.a(UnitUtil.e(0.0d, 3), this.f25858c);
        } else {
            strA = TargetChoicePickerUtils.a(0.0d, this.f25858c);
        }
        map.put("SUM_VALUE_TEXT", strA);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0030  */
    protected void d(HashMap<String, Object> map, HiHealthData hiHealthData) {
        double d;
        String strA;
        LogUtil.a("BaseTrackProvider", "updateDistance");
        if (hiHealthData == null) {
            d = 0.0d;
        } else {
            int i = this.f25856a;
            if (i == 260) {
                String[] strArrE = jqq.e(this.f25858c, 260);
                if (strArrE.length > 0) {
                    d = hiHealthData.getDouble(strArrE[0]);
                } else {
                    d = 0.0d;
                }
            } else if (i != 282) {
                d = 0.0d;
            } else {
                d = hiHealthData.getDouble("Track_Walk_Distance_Sum");
            }
        }
        if (UnitUtil.f()) {
            strA = TargetChoicePickerUtils.a(UnitUtil.e(d / 1000.0d, 3), this.f25858c);
        } else {
            strA = TargetChoicePickerUtils.a(d / 1000.0d, this.f25858c);
        }
        map.put("SUM_VALUE_TEXT", strA);
    }

    protected void c() {
        int i = this.f25856a;
        if (i == 282) {
            nkb.d().b(0L, System.currentTimeMillis(), 7, this.f25856a, this.l);
        } else if (i == 260) {
            iwn.a(this.f25858c).e(0L, System.currentTimeMillis(), 7, this.f25856a, this.l);
        } else {
            LogUtil.a("BaseTrackProvider", "no data sporttype");
        }
    }

    protected void e(Context context, HashMap map, Object obj) {
        Drawable drawable;
        String string;
        Log.i("BaseTrackProvider", "setViewData: " + obj);
        if (obj instanceof HiHealthData) {
            if (UnitUtil.f()) {
                string = this.d.getString(R.string.IDS_band_data_sport_distance_unit_en);
            } else {
                string = this.d.getString(R.string.IDS_hw_health_show_distance_unit);
            }
            map.put("ACCUMULATED_DURATION_TEXT", this.d.getString(R.string.IDS_track_total_walk, string));
        }
        map.put("RIGHT_ICON_TEXT", Integer.valueOf(R.string.IDS_hwh_motiontrack_music));
        map.put("MIDDLE_TIP_TEXT", Integer.valueOf(R.string.IDS_user_profile_target));
        map.put("RIGHT_ICON_IMAGE", Integer.valueOf(R.drawable.ic_sport_entrance_music));
        map.put("RIGHT_ICON_BACKGROUND", Integer.valueOf(R.drawable.ic_warmup_music_bg));
        map.put("SUM_TITLE_IMAGE", Integer.valueOf(R.drawable.sport_tab_arrow_right));
        if (qrs.af(this.f25858c)) {
            drawable = this.d.getDrawable(R.drawable.ic_sport_tab_bg_map_ws);
        } else {
            drawable = this.d.getDrawable(R.drawable.ic_sport_tab_bg_map);
        }
        Bitmap bitmapA = qqf.a(drawable);
        if (bitmapA == null) {
            Log.i("BaseTrackProvider", "Bitmap is null");
            return;
        }
        Drawable drawableD = qqf.d(qqf.d(bitmapA, bitmapA.getWidth(), bitmapA.getHeight(), qqf.d));
        Drawable drawable2 = this.d.getDrawable(R.drawable.ic_sport_tab_loction_new);
        this.e.add(drawableD);
        this.e.add(drawable2);
        map.put("BACKGROUND_MASK_DEFULT", this.e);
        c(obj, map);
    }

    public void e() {
        this.o = tfi.e(this.f25858c, this.f25856a);
        float fD = tfi.d(this.f25858c, this.f25856a);
        this.k = fD;
        d(this.o, fD, false, false);
    }

    private void d(HashMap map, int i) {
        Drawable drawable = this.i;
        if (drawable instanceof AnimationDrawable) {
            ((AnimationDrawable) drawable).stop();
        }
        if (i == 0) {
            drawable = this.d.getDrawable(R.drawable.track_ic_health_running_signal_close);
        } else if (i == 1) {
            drawable = this.d.getDrawable(R.drawable.track_ic_health_running_signal_searching);
        } else if (i == 2) {
            drawable = this.d.getDrawable(R.drawable.track_ic_health_running_signal1);
        } else if (i == 3) {
            drawable = this.d.getDrawable(R.drawable.track_ic_health_running_signal2);
        } else if (i == 4) {
            drawable = this.d.getDrawable(R.drawable.track_ic_health_running_signal3);
        } else {
            LogUtil.e("BaseTrackProvider", "Wrong GPS signal");
        }
        this.i = drawable;
        map.put("RIGHT_TOP_IMAGE", drawable);
        map.put("RIGHT_TOP_TEXT", Integer.valueOf(R.string.IDS_motiontrack_page_gps));
        map.put("RIGHT_TOP_TEXT_WIDTH", Integer.valueOf(vdo.b(this.f25858c, 73.0f)));
        map.put("RIGHT_TOP_TEXT_PADDING", Integer.valueOf(this.h));
    }

    static class a extends BaseHandler<BaseTrackProvider> {
        a(Looper looper, BaseTrackProvider baseTrackProvider) {
            super(looper, baseTrackProvider);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.huawei.haf.handler.BaseHandler
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void handleMessageWhenReferenceNotNull(BaseTrackProvider baseTrackProvider, Message message) {
            if (message.what != 100) {
                return;
            }
            baseTrackProvider.e(message.arg1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(int i) {
        if (this.f != null) {
            this.m.put("GPS_SIGNAL_DATA", Integer.valueOf(i));
            this.f.c((Object) this.m);
        }
    }

    public static void a() {
        qrs.b("com.huawei.hwireader", com.huawei.haf.application.BaseApplication.j(), qre.f(R.string.IDS_reader_app_name), new View.OnClickListener() { // from class: com.huawei.ui.homehealth.runcard.trackfragments.BaseTrackProvider.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                yto.b(new ISchemeListener() { // from class: com.huawei.ui.homehealth.runcard.trackfragments.BaseTrackProvider.5.1
                    @Override // com.zhangyue.iReader.sdk.scheme.ISchemeListener
                    public void onSuccess(Object obj) {
                        LogUtil.a("BaseTrackProvider", "openTingChannel is onSuccess");
                    }

                    @Override // com.zhangyue.iReader.sdk.scheme.ISchemeListener
                    public void onError(int i, String str) {
                        LogUtil.a("BaseTrackProvider", "openTingChannel is onError");
                    }
                });
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(HiHealthData hiHealthData) {
        if (hiHealthData != null) {
            this.g = hiHealthData.copyData();
            Log.i("BaseTrackProvider", "updateHealthData: " + this.g);
        }
        this.f.c(this.g);
    }

    private void d(int i, float f, boolean z, boolean z2) {
        this.m.put("GOAL_TIPS_VISIBILITY_DATA", 0);
        this.m.put("GOAL_UNIT_VISIBILITY_DATA", 0);
        this.f.c((Object) this.m);
        if (i == -1) {
            b();
        } else if (i == 0) {
            float f2 = f / 60.0f;
            this.t = UnitUtil.e(f2, 1, 0);
            this.n = this.d.getQuantityString(R.plurals.IDS_hwh_motiontrack_start_track_sport_min, (int) f2);
            this.m.put("GOAL_VALUE_TEXT_DATA", this.t);
            this.m.put("GOAL_UNIT_TEXT_DATA", this.n);
            j();
        } else if (i == 1) {
            a(f);
            j();
        } else if (i == 2) {
            this.t = UnitUtil.e(f / 1000.0f, 1, 0);
            this.n = this.d.getString(R.string.IDS_hw_health_show_calorie_unit);
            this.m.put("GOAL_VALUE_TEXT_DATA", this.t);
            this.m.put("GOAL_UNIT_TEXT_DATA", this.n);
            j();
        }
        if (z) {
            tfi.b(this.f25858c, this.f25856a, i);
            tfi.a(this.f25858c, f, this.f25856a);
            tfi.a(this.f25858c, this.f25856a, z2);
            if (z2) {
                tfi.b(this.f25858c, this.f25856a, i, f);
            } else {
                tfi.b(this.f25858c, this.f25856a, i, -1.0f);
            }
        }
    }

    private void j() {
        if (LoginInit.getInstance(this.f25857b).getIsLogined()) {
            this.m.put("GOAL_VISIBILITY_DATA", 0);
        } else {
            this.m.put("GOAL_VISIBILITY_DATA", 4);
        }
        this.f.c((Object) this.m);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0010  */
    private void b() {
        String string;
        int i = this.f25856a;
        if (i == 264 || i == 282) {
            string = this.d.getString(R.string.IDS_hwh_motiontrack_set_target);
        } else {
            switch (i) {
                case 257:
                case 258:
                case 259:
                case 260:
                    string = this.d.getString(R.string.IDS_hwh_motiontrack_set_target);
                    break;
                default:
                    string = "";
                    break;
            }
        }
        if (!TextUtils.isEmpty(string)) {
            this.m.put("GOAL_VALUE_TEXT_DATA", string);
            this.m.put("GOAL_UNIT_VISIBILITY_DATA", 8);
            this.m.put("GOAL_TIPS_VISIBILITY_DATA", 8);
            j();
            return;
        }
        this.m.put("GOAL_VISIBILITY_DATA", 8);
        this.f.c((Object) this.m);
    }

    private void a(float f) {
        if (UnitUtil.f()) {
            this.t = UnitUtil.e(UnitUtil.e(f, 3), 1, 2);
            this.m.put("GOAL_UNIT_VISIBILITY_DATA", 0);
            this.n = this.d.getString(R.string.IDS_band_data_sport_distance_unit_en);
        } else {
            this.n = this.d.getString(R.string.IDS_hw_health_show_distance_unit);
            double d = f;
            if (Math.abs(d - 42.195d) < 1.0E-5d) {
                this.t = UnitUtil.e(d, 1, 3);
            } else if (Math.abs(d - 21.0975d) >= 1.0E-5d) {
                this.m.put("GOAL_UNIT_VISIBILITY_DATA", 0);
                this.t = UnitUtil.e(d, 1, 2);
            } else {
                this.t = UnitUtil.e(d, 1, 4);
            }
        }
        this.m.put("GOAL_VALUE_TEXT_DATA", this.t);
        this.m.put("GOAL_UNIT_TEXT_DATA", this.n);
        this.f.c((Object) this.m);
    }

    private Activity d(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return d(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    static class e implements IBaseResponseCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        WeakReference<BaseTrackProvider> f25859a;

        e(BaseTrackProvider baseTrackProvider) {
            this.f25859a = new WeakReference<>(baseTrackProvider);
        }

        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            BaseTrackProvider baseTrackProvider = this.f25859a.get();
            if (baseTrackProvider == null) {
                return;
            }
            if (!LoginInit.getInstance(null).getIsLogined()) {
                baseTrackProvider.c(new HiHealthData());
                return;
            }
            LogUtil.a("BaseTrackProvider", "onResponse ", Integer.valueOf(baseTrackProvider.f25856a));
            if (!(obj instanceof SparseArray)) {
                if (njy.b(obj, HiHealthData.class)) {
                    List list = (List) obj;
                    if (njy.b(list)) {
                        baseTrackProvider.c((HiHealthData) list.get(0));
                    } else {
                        baseTrackProvider.c(new HiHealthData());
                    }
                    LogUtil.a("BaseTrackProvider", "data is " + list);
                    return;
                }
                LogUtil.a("BaseTrackProvider", "wrong data : ", Integer.valueOf(i));
                baseTrackProvider.h();
                return;
            }
            try {
                List list2 = (List) ((SparseArray) obj).get(0);
                if (njy.b(list2)) {
                    baseTrackProvider.c((HiHealthData) list2.get(0));
                } else {
                    baseTrackProvider.c(new HiHealthData());
                }
                LogUtil.a("BaseTrackProvider", "data is " + list2);
            } catch (ClassCastException e) {
                LogUtil.j("BaseTrackProvider", e.getMessage());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        this.f.c("CLIMB_NULL_DATA");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:38:0x007c  */
    private void c(Object obj, HashMap map) {
        if (obj instanceof HashMap) {
            for (Map.Entry entry : ((HashMap) obj).entrySet()) {
                String str = (String) entry.getKey();
                Object value = entry.getValue();
                str.hashCode();
                switch (str) {
                    case "GOAL_TIPS_VISIBILITY_DATA":
                        if (value instanceof Integer) {
                            map.put("MIDDLE_TIP_TEXT_VISIBILITY", (Integer) value);
                            break;
                        } else {
                            break;
                        }
                        break;
                    case "GOAL_VALUE_VISIBILITY_DATA":
                        if (value instanceof Integer) {
                            map.put("MIDDLE_VALUE_TEXT_VISIBILITY", (Integer) value);
                            break;
                        } else {
                            break;
                        }
                        break;
                    case "GOAL_VISIBILITY_DATA":
                        if (value instanceof Integer) {
                            map.put("MIDDLE_TEXT_LAYOUT_VISIBILITY", (Integer) value);
                            break;
                        } else {
                            break;
                        }
                        break;
                    case "GOAL_UNIT_TEXT_DATA":
                        if (value instanceof String) {
                            map.put("MIDDLE_UNIT_TEXT", (String) value);
                            break;
                        } else {
                            break;
                        }
                        break;
                    case "GPS_SIGNAL_DATA":
                        if (value instanceof Integer) {
                            d(map, ((Integer) value).intValue());
                            break;
                        } else {
                            break;
                        }
                        break;
                    case "GOAL_VALUE_TEXT_DATA":
                        if (value instanceof String) {
                            map.put("MIDDLE_VALUE_TEXT", (String) value);
                            break;
                        } else {
                            break;
                        }
                        break;
                    case "GOAL_UNIT_VISIBILITY_DATA":
                        if (value instanceof Integer) {
                            map.put("MIDDLE_UNIT_TEXT_VISIBILITY", (Integer) value);
                            break;
                        } else {
                            break;
                        }
                        break;
                }
            }
        }
    }
}

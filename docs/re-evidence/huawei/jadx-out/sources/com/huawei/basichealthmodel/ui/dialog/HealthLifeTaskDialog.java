package com.huawei.basichealthmodel.ui.dialog;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.RoundedBitmapDrawable;
import androidx.core.graphics.drawable.RoundedBitmapDrawableFactory;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.gson.reflect.TypeToken;
import com.huawei.basichealthmodel.listener.TaskDataListener;
import com.huawei.basichealthmodel.ui.adapter.TaskDialogEventRecyclerAdapter;
import com.huawei.basichealthmodel.ui.adapter.TaskDialogGridAdapter;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.healthmodel.bean.BloodPressurePlanResultBean;
import com.huawei.health.healthmodel.bean.HealthLifeBean;
import com.huawei.health.healthmodel.bean.HealthLifeTaskBean;
import com.huawei.health.healthmodel.bean.ImageBean;
import com.huawei.health.healthmodel.bean.PictureBean;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwbasemgr.ResponseCallback;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwcommonmodel.utils.DateFormatUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.R;
import com.huawei.ui.commonui.base.BaseDialog;
import com.huawei.ui.commonui.columnsystem.HealthColumnSystem;
import com.huawei.ui.commonui.gridview.HealthGridView;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;
import com.huawei.ui.commonui.recycleview.RecyclerItemDecoration;
import defpackage.bwc;
import defpackage.bwk;
import defpackage.bwr;
import defpackage.bxc;
import defpackage.byu;
import defpackage.caw;
import defpackage.cbg;
import defpackage.cbk;
import defpackage.cfp;
import defpackage.cgc;
import defpackage.ezl;
import defpackage.fff;
import defpackage.lsl;
import defpackage.njy;
import defpackage.qqf;
import defpackage.qrk;
import defpackage.qrs;
import health.compact.a.CommonUtils;
import health.compact.a.UnitUtil;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes23.dex */
public class HealthLifeTaskDialog extends BaseDialog {
    private HealthLifeTaskDialog(Context context) {
        super(context, R.style.CustomDialog, 0);
    }

    public static class Builder implements View.OnTouchListener, View.OnClickListener, AdapterView.OnItemClickListener, ResponseCallback<bwc> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f5356a;
        private int aa;
        private final int ab;
        private final ImageBean ac;
        private HealthGridView ad;
        private final boolean ae;
        private final boolean af;
        private boolean ag;
        private boolean ah;
        private final boolean ai;
        private String aj;
        private HealthTextView ak;
        private HealthTextView al;
        private LinearLayout am;
        private final int an;
        private HealthTextView ao;
        private HealthRecycleView ap;
        private HealthTextView aq;
        private HealthTextView ar;
        private HealthTextView as;
        private int at;
        private SparseArray<List<HealthLifeBean>> au;
        private HealthTextView av;
        private final Resources aw;
        private final String ax;
        private HealthTextView ay;
        private HealthTextView az;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final HealthLifeBean f5357b;
        private View ba;
        private final String bb;
        private final HealthLifeTaskBean bc;
        private int bd;
        private SparseIntArray bh;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Drawable f5358c;
        private Drawable d;
        private FrameLayout e;
        private ImageView f;
        private View g;
        private HealthTextView h;
        private List<BloodPressurePlanResultBean> i;
        private final ResponseCallback<HealthLifeTaskBean> j;
        private int k;
        private LinearLayout l;
        private final Context m;
        private int n;
        private HealthTextView o;
        private TaskDialogEventRecyclerAdapter p;
        private HealthLifeTaskDialog q;
        private HealthTextView r;
        private LinearLayout s;
        private LinearLayout t;
        private final String u;
        private int v;
        private Drawable w;
        private int x;
        private final ArrayList<Drawable> y;
        private final caw z;

        public Builder(Context context, HealthLifeTaskBean healthLifeTaskBean, String str, ResponseCallback<HealthLifeTaskBean> responseCallback) {
            Context contextB = BaseApplication.b();
            this.m = contextB;
            this.aw = contextB.getResources();
            this.y = new ArrayList<>();
            this.i = new ArrayList();
            if (context instanceof Activity) {
                this.f5356a = context;
            } else {
                LogUtil.j("HL_HealthLifeTaskDialog", "Builder activity instanceof Activity false");
                this.f5356a = BaseApplication.j();
            }
            if (healthLifeTaskBean == null) {
                LogUtil.j("HL_HealthLifeTaskDialog", "Builder taskBean is null");
                this.bc = new HealthLifeTaskBean();
            } else {
                this.bc = healthLifeTaskBean;
            }
            if (TextUtils.isEmpty(str)) {
                this.u = "";
            } else {
                this.u = str;
            }
            this.j = responseCallback;
            this.an = cbg.r();
            this.z = new caw(this);
            this.ac = this.bc.getDialogImageBean();
            HealthLifeBean healthLifeBean = this.bc.getHealthLifeBean();
            if (healthLifeBean == null) {
                LogUtil.j("HL_HealthLifeTaskDialog", "Builder mBean is null");
                this.f5357b = new HealthLifeBean();
            } else {
                this.f5357b = healthLifeBean;
            }
            int id = this.f5357b.getId();
            this.ab = id;
            this.ax = this.f5357b.getResult();
            this.bb = this.f5357b.getTarget();
            int complete = this.f5357b.getComplete();
            this.k = complete;
            this.ae = complete > 0;
            this.ai = id == 3;
            this.af = id == 12;
            this.au = cgc.b();
        }

        public HealthLifeTaskDialog d() {
            int iD = cfp.d(this.au, this.ab);
            this.at = iD;
            this.aj = cfp.d(this.f5357b, iD);
            f();
            g();
            m();
            i();
            h();
            cfp.e(this.az, cfp.h(this.f5357b));
            o();
            y();
            cfp.e(this.av, cfp.f(this.f5357b));
            t();
            if (this.ai) {
                n();
            }
            if (this.af && !cbg.ad()) {
                c();
            }
            return this.q;
        }

        private void n() {
            List<bwc> listA = cfp.a(this.f5357b);
            if (njy.e(listA)) {
                LogUtil.j("HL_HealthLifeTaskDialog", "initLayoutForForIntensity list ", listA);
                return;
            }
            View viewInflate = View.inflate(this.m, com.huawei.basichealthmodel.R.layout.dialog_task_recycler_event, null);
            this.ap = (HealthRecycleView) viewInflate.findViewById(com.huawei.basichealthmodel.R.id.dialog_task_recycler_event);
            ArrayList arrayList = new ArrayList(4);
            arrayList.add(0);
            arrayList.add(0);
            arrayList.add(0);
            arrayList.add(0);
            int i = this.bd;
            int dimensionPixelSize = this.aw.getDimensionPixelSize(R.dimen.dialogMarginStart);
            this.ap.addItemDecoration(new RecyclerItemDecoration((((i - dimensionPixelSize) - this.aw.getDimensionPixelSize(R.dimen.dialogMarginEnd)) - (this.aw.getDimensionPixelSize(R.dimen.health_common_66dp) * 3)) / 2, 0, arrayList));
            this.t.addView(viewInflate);
            this.t.setVisibility(0);
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.m);
            linearLayoutManager.setOrientation(0);
            this.ap.setLayoutManager(linearLayoutManager);
            TaskDialogEventRecyclerAdapter taskDialogEventRecyclerAdapter = new TaskDialogEventRecyclerAdapter(listA);
            this.p = taskDialogEventRecyclerAdapter;
            taskDialogEventRecyclerAdapter.e(this);
            this.ap.setAdapter(this.p);
        }

        private void f() {
            ImageBean imageBean = this.ac;
            if (imageBean == null) {
                this.d = b(qqf.c(R.drawable.health_life_background));
                return;
            }
            if (this.ab != imageBean.getId() || !"1".equals(this.ac.getImageScenario())) {
                this.d = b(qqf.c(R.drawable.health_life_background));
                return;
            }
            ArrayList<PictureBean> pictureList = this.ac.getPictureList();
            if (njy.e(pictureList)) {
                this.d = b(qqf.c(R.drawable.health_life_background));
                return;
            }
            for (PictureBean pictureBean : pictureList) {
                if (pictureBean != null) {
                    String path = pictureBean.getPath();
                    if (!cbg.f(path)) {
                        int scenario = pictureBean.getScenario();
                        if (scenario == 100) {
                            this.d = b(qqf.f(path));
                        } else if (scenario == 101) {
                            this.f5358c = b(qqf.f(path));
                        } else if (scenario == 110) {
                            this.w = b(qqf.f(path));
                        } else {
                            LogUtil.d("HL_HealthLifeTaskDialog", "initImageList scenario ", Integer.valueOf(scenario));
                        }
                    }
                }
            }
        }

        private Drawable b(Bitmap bitmap) {
            if (bitmap == null) {
                LogUtil.j("HL_HealthLifeTaskDialog", "getRoundedDrawable bitmap is null");
            } else {
                this.bd = bitmap.getWidth();
                this.aa = bitmap.getHeight();
            }
            RoundedBitmapDrawable roundedBitmapDrawableCreate = RoundedBitmapDrawableFactory.create(this.aw, bitmap);
            roundedBitmapDrawableCreate.setAntiAlias(true);
            roundedBitmapDrawableCreate.setDither(true);
            roundedBitmapDrawableCreate.setCornerRadius(this.aw.getDimensionPixelSize(R.dimen.emui_corner_radius_dialog));
            return roundedBitmapDrawableCreate;
        }

        private void g() {
            if (this.ba == null) {
                this.ba = View.inflate(this.m, com.huawei.basichealthmodel.R.layout.dialog_task, null);
            }
            if (this.q == null) {
                HealthLifeTaskDialog healthLifeTaskDialog = new HealthLifeTaskDialog(this.f5356a);
                this.q = healthLifeTaskDialog;
                healthLifeTaskDialog.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: caz
                    @Override // android.content.DialogInterface.OnDismissListener
                    public final void onDismiss(DialogInterface dialogInterface) {
                        this.d.a(dialogInterface);
                    }
                });
            }
            this.m.getTheme().resolveAttribute(R.attr.customDialogStyleRefer, new TypedValue(), true);
            boolean zY = qrs.y(this.f5356a);
            this.ag = zY;
            int iD = ezl.d(this.f5356a, zY);
            if (this.aa <= 0) {
                this.aa = 1764;
            }
            if (this.bd <= 0) {
                this.bd = 984;
            }
            this.aa = ezl.a(this.f5356a, this.ag, (this.aa * iD) / this.bd);
            this.bd = iD;
            Window window = this.q.getWindow();
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.width = this.bd;
            attributes.height = this.aa;
            if (new HealthColumnSystem(this.m, 0).a()) {
                attributes.y = this.aw.getDimensionPixelSize(R.dimen.dialogMarginBottom);
                window.setGravity(80);
            } else {
                window.setGravity(17);
            }
            window.setAttributes(attributes);
            this.q.setContentView(this.ba);
        }

        public /* synthetic */ void a(DialogInterface dialogInterface) {
            s();
        }

        private void m() {
            this.e = (FrameLayout) this.ba.findViewById(com.huawei.basichealthmodel.R.id.dialog_base_task_background);
            this.s = (LinearLayout) this.ba.findViewById(com.huawei.basichealthmodel.R.id.dialog_base_task_foreground);
            this.am = (LinearLayout) this.ba.findViewById(com.huawei.basichealthmodel.R.id.dialog_base_task_layout);
            this.az = (HealthTextView) this.ba.findViewById(com.huawei.basichealthmodel.R.id.dialog_base_task_title);
            this.ay = (HealthTextView) this.ba.findViewById(com.huawei.basichealthmodel.R.id.dialog_base_task_subtitle);
            this.o = (HealthTextView) this.ba.findViewById(com.huawei.basichealthmodel.R.id.dialog_base_task_content);
            this.av = (HealthTextView) this.ba.findViewById(com.huawei.basichealthmodel.R.id.dialog_base_task_rule);
            this.l = (LinearLayout) this.ba.findViewById(com.huawei.basichealthmodel.R.id.dialog_base_task_custom);
            this.t = (LinearLayout) this.ba.findViewById(com.huawei.basichealthmodel.R.id.dialog_base_task_event);
            this.aq = (HealthTextView) this.ba.findViewById(com.huawei.basichealthmodel.R.id.dialog_base_task_positive);
            this.as = (HealthTextView) this.ba.findViewById(com.huawei.basichealthmodel.R.id.dialog_base_task_neutral);
            this.ak = (HealthTextView) this.ba.findViewById(com.huawei.basichealthmodel.R.id.dialog_base_task_negative);
            this.r = (HealthTextView) this.ba.findViewById(com.huawei.basichealthmodel.R.id.dialog_base_task_detail);
            this.al = (HealthTextView) this.ba.findViewById(com.huawei.basichealthmodel.R.id.dialog_base_task_know);
            this.ba.findViewById(com.huawei.basichealthmodel.R.id.dialog_base_task_about).setOnClickListener(this);
        }

        private void i() {
            Drawable drawableB = this.d;
            Drawable drawable = this.ae ? this.f5358c : drawableB;
            if (drawable != null) {
                drawableB = drawable;
            }
            if (drawableB == null) {
                LogUtil.j("HL_HealthLifeTaskDialog", "initBackground drawable is null");
                drawableB = b(qqf.c(R.drawable.health_life_background));
            }
            this.e.setBackground(cfp.c(drawableB, this.ag));
            ViewGroup.LayoutParams layoutParams = this.e.getLayoutParams();
            layoutParams.width = this.bd;
            layoutParams.height = this.aa;
            this.e.setLayoutParams(layoutParams);
            this.s.setBackground(this.ag ? null : this.w);
            ViewGroup.LayoutParams layoutParams2 = this.am.getLayoutParams();
            if (layoutParams2 instanceof FrameLayout.LayoutParams) {
                FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) layoutParams2;
                layoutParams3.gravity = this.ag ? 48 : 80;
                this.am.setLayoutParams(layoutParams3);
            }
        }

        private void h() {
            c(this.aq, cfp.j(this.f5357b), true);
            c(this.as, cfp.c(this.f5357b), true);
            c(this.ak, this.aj, true);
            c(this.r, cfp.d(this.f5357b), true);
            c(this.al, cfp.b(this.f5357b), true);
            p();
            r();
        }

        private void c(HealthTextView healthTextView, String str, boolean z) {
            if (TextUtils.isEmpty(str)) {
                healthTextView.setVisibility(8);
                return;
            }
            healthTextView.setText(str);
            if (z) {
                healthTextView.setVisibility(0);
                healthTextView.setOnClickListener(this);
                healthTextView.setOnTouchListener(this);
                return;
            }
            healthTextView.setVisibility(4);
        }

        private void p() {
            if (this.aq.getVisibility() != 8) {
                e(this.aq, this.aw.getDimensionPixelSize(R.dimen.elementsMarginVerticalM));
                return;
            }
            if (this.as.getVisibility() != 8) {
                e(this.as, this.aw.getDimensionPixelSize(R.dimen.elementsMarginVerticalM));
                return;
            }
            if (this.ak.getVisibility() != 8) {
                e(this.ak, this.aw.getDimensionPixelSize(R.dimen.elementsMarginVerticalM));
                return;
            }
            if (this.r.getVisibility() != 8) {
                e(this.r, this.aw.getDimensionPixelSize(R.dimen.elementsMarginVerticalM));
            }
            if (this.al.getVisibility() != 8) {
                e(this.al, this.aw.getDimensionPixelSize(R.dimen.defaultPaddingBottomFixed));
            }
        }

        private void e(HealthTextView healthTextView, int i) {
            ViewGroup.LayoutParams layoutParams = healthTextView.getLayoutParams();
            if (layoutParams instanceof LinearLayout.LayoutParams) {
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                layoutParams2.topMargin = this.aw.getDimensionPixelSize(R.dimen.defaultPaddingTop);
                layoutParams2.bottomMargin = i;
                healthTextView.setLayoutParams(layoutParams2);
            }
        }

        private void r() {
            if (this.aq.getVisibility() == 0) {
                e(this.aq);
                return;
            }
            if (this.as.getVisibility() == 0) {
                e(this.as);
                return;
            }
            if (this.ak.getVisibility() == 0) {
                e(this.ak);
            } else if (this.r.getVisibility() == 0) {
                e(this.r);
            } else if (this.al.getVisibility() == 0) {
                e(this.al);
            }
        }

        private void e(HealthTextView healthTextView) {
            HealthTextView healthTextView2 = this.aq;
            if (healthTextView2 != null) {
                healthTextView2.setBackground(null);
            }
            HealthTextView healthTextView3 = this.as;
            if (healthTextView3 != null) {
                healthTextView3.setBackground(null);
            }
            HealthTextView healthTextView4 = this.ak;
            if (healthTextView4 != null) {
                healthTextView4.setBackground(null);
            }
            HealthTextView healthTextView5 = this.r;
            if (healthTextView5 != null) {
                healthTextView5.setBackground(null);
            }
            HealthTextView healthTextView6 = this.al;
            if (healthTextView6 != null) {
                healthTextView6.setBackground(null);
            }
            if (healthTextView != null) {
                healthTextView.setBackground(ContextCompat.getDrawable(this.m, R.drawable.button_background_model_dialog));
            }
        }

        private void o() {
            cbg.c(ThreadPoolManager.c(), "HealthModelQueryCompletedTask", new Runnable() { // from class: cay
                @Override // java.lang.Runnable
                public final void run() {
                    this.e.a();
                }
            });
        }

        public /* synthetic */ void a() {
            cbg.d(this.z, 2000, Integer.valueOf(bxc.b(this.an, this.f5357b.getRecordDay(), this.ab)));
        }

        private void y() {
            cfp.e(this.o, cfp.e(this.f5357b));
            if (this.k <= 0) {
                return;
            }
            k();
        }

        private void k() {
            int i = this.an;
            if (i <= 0) {
                LogUtil.j("HL_HealthLifeTaskDialog", "initRank mJoinTime", Integer.valueOf(i));
            } else {
                cbg.c(ThreadPoolManager.c(), "HealthModelGetHealthLifeStat", new Runnable() { // from class: cas
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f1408b.b();
                    }
                });
            }
        }

        public /* synthetic */ void b() {
            ArrayList arrayList = new ArrayList();
            arrayList.add(Integer.valueOf(this.ab));
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(Integer.valueOf(lsl.d(DateFormatUtil.d(this.an), System.currentTimeMillis(), 1)));
            bwk.d().e(arrayList, arrayList2, new IBaseResponseCallback() { // from class: cat
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public final void a(int i, Object obj) {
                    this.f1409c.c(i, obj);
                }
            });
        }

        public /* synthetic */ void c(int i, Object obj) {
            if (i == -1) {
                LogUtil.j("HL_HealthLifeTaskDialog", "initRank onFailure ");
                return;
            }
            if (obj instanceof bwr) {
                bwr bwrVar = (bwr) obj;
                if (!njy.e(bwrVar.d())) {
                    fff fffVar = bwrVar.d().get(0);
                    if (fffVar != null) {
                        cbg.d(this.z, 3000, Integer.valueOf(fffVar.b()));
                        return;
                    }
                    return;
                }
            }
            LogUtil.j("HL_HealthLifeTaskDialog", "initRank onSuccess stats is null or length less than zero");
        }

        private void t() {
            String string;
            if (cbg.d(byu.c(), this.ab).getGoalCycleType() != 2) {
                return;
            }
            SparseIntArray sparseIntArrayC = cfp.c(this.au, this.ab);
            this.bh = sparseIntArrayC;
            if (sparseIntArrayC.size() <= 0) {
                this.l.setVisibility(8);
                q();
                return;
            }
            this.l.setVisibility(0);
            View viewInflate = View.inflate(this.m, com.huawei.basichealthmodel.R.layout.dialog_task_week, null);
            this.l.addView(viewInflate);
            a(viewInflate);
            HealthTextView healthTextView = (HealthTextView) viewInflate.findViewById(com.huawei.basichealthmodel.R.id.dialog_task_week_description);
            if (cbg.u() == 7 && this.ae) {
                healthTextView.setVisibility(8);
                return;
            }
            healthTextView.setVisibility(0);
            if (this.at > 0) {
                Resources resources = this.aw;
                int i = com.huawei.basichealthmodel.R.string.IDS_health_model_rest_number;
                Resources resources2 = this.aw;
                int i2 = com.huawei.basichealthmodel.R.plurals.IDS_health_model_mission_complete_number;
                int i3 = this.at;
                string = resources.getString(i, resources2.getQuantityString(i2, i3, Integer.valueOf(i3)));
            } else {
                string = this.aw.getString(com.huawei.basichealthmodel.R.string.IDS_health_model_not_rest_number);
            }
            healthTextView.setText(string);
        }

        private void q() {
            final int iA = DateFormatUtil.a(System.currentTimeMillis());
            cbg.b(ThreadPoolManager.c(), new Runnable() { // from class: cau
                @Override // java.lang.Runnable
                public final void run() {
                    this.d.d(iA);
                }
            });
        }

        public /* synthetic */ void d(final int i) {
            byu.c().e(cbg.q(), i, new TaskDataListener() { // from class: com.huawei.basichealthmodel.ui.dialog.HealthLifeTaskDialog.Builder.4
                @Override // com.huawei.basichealthmodel.listener.TaskDataListener
                public void onDataChange(int i2, SparseArray<HealthLifeBean> sparseArray) {
                }

                @Override // com.huawei.basichealthmodel.listener.TaskDataListener
                public void onAllDataChange(int i2, SparseArray<List<HealthLifeBean>> sparseArray) {
                    if (i2 != 0 || sparseArray == null || sparseArray.size() <= 0 || DateFormatUtil.a(lsl.e(DateFormatUtil.d(i), 1, 0)) != DateFormatUtil.a(lsl.e(DateFormatUtil.d(byu.c().a(i)), 1, 0))) {
                        return;
                    }
                    cgc.d(sparseArray);
                }
            });
        }

        private void a(View view) {
            int[] iArr = {com.huawei.basichealthmodel.R.id.dialog_task_week_sunday, com.huawei.basichealthmodel.R.id.dialog_task_week_monday, com.huawei.basichealthmodel.R.id.dialog_task_week_tuesday, com.huawei.basichealthmodel.R.id.dialog_task_week_wednesday, com.huawei.basichealthmodel.R.id.dialog_task_week_thursday, com.huawei.basichealthmodel.R.id.dialog_task_week_friday, com.huawei.basichealthmodel.R.id.dialog_task_week_saturday};
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < 7; i++) {
                arrayList.add((ImageView) view.findViewById(iArr[i]));
            }
            int size = this.bh.size();
            ArrayList<Integer> arrayList2 = new ArrayList<>();
            SparseIntArray sparseIntArrayI = cbg.i();
            for (int i2 = 0; i2 < size; i2++) {
                int iKeyAt = this.bh.keyAt(i2);
                int i3 = this.bh.get(iKeyAt);
                if (i3 == 1) {
                    int iJ = CommonUtils.j(this.bb);
                    if (this.ai && iJ > 0 && CommonUtils.j(this.ax) >= iJ) {
                        d(arrayList2, sparseIntArrayI, iKeyAt);
                    } else {
                        arrayList2.add(Integer.valueOf(com.huawei.basichealthmodel.R.drawable.icon_status_rest_today));
                    }
                } else if (i3 == 200) {
                    if (this.ai) {
                        d(arrayList2, sparseIntArrayI, iKeyAt);
                    } else {
                        arrayList2.add(Integer.valueOf(com.huawei.basichealthmodel.R.drawable.icon_status_done_today));
                    }
                } else {
                    arrayList2.add(Integer.valueOf(com.huawei.basichealthmodel.R.drawable.icon_status_un_done_today));
                }
            }
            int iU = cbg.u();
            for (int i4 = 0; i4 < arrayList.size(); i4++) {
                ImageView imageView = (ImageView) arrayList.get(i4);
                if (imageView != null) {
                    int iIntValue = arrayList2.get(i4).intValue();
                    if (iU - 1 == i4) {
                        imageView.setImageResource(iIntValue);
                    } else {
                        imageView.setImageBitmap(cbg.e(iIntValue, R.color.common_white_60alpha));
                    }
                }
            }
        }

        private void d(ArrayList<Integer> arrayList, SparseIntArray sparseIntArray, int i) {
            if (sparseIntArray == null || sparseIntArray.size() <= 0) {
                arrayList.add(Integer.valueOf(com.huawei.basichealthmodel.R.drawable.icon_status_done_today));
                return;
            }
            int i2 = sparseIntArray.get(i);
            if (i2 == 300) {
                arrayList.add(Integer.valueOf(com.huawei.basichealthmodel.R.drawable.icon_status_running_today));
            } else if (i2 == 301) {
                arrayList.add(Integer.valueOf(com.huawei.basichealthmodel.R.drawable.icon_status_fitness_today));
            } else {
                arrayList.add(Integer.valueOf(com.huawei.basichealthmodel.R.drawable.icon_status_done_today));
            }
        }

        private void e() {
            this.l.setVisibility(0);
            View viewInflate = View.inflate(this.m, com.huawei.basichealthmodel.R.layout.dialog_task_grid, null);
            this.ad = (HealthGridView) viewInflate.findViewById(com.huawei.basichealthmodel.R.id.dialog_task_grid);
            this.l.addView(viewInflate);
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent == null || motionEvent.getAction() != 0) {
                return false;
            }
            int id = view.getId();
            if (id == com.huawei.basichealthmodel.R.id.dialog_base_task_positive) {
                e(this.aq);
                return false;
            }
            if (id == com.huawei.basichealthmodel.R.id.dialog_base_task_neutral) {
                e(this.as);
                return false;
            }
            if (id == com.huawei.basichealthmodel.R.id.dialog_base_task_negative) {
                e(this.ak);
                return false;
            }
            if (id == com.huawei.basichealthmodel.R.id.dialog_base_task_detail) {
                e(this.r);
                return false;
            }
            if (id == com.huawei.basichealthmodel.R.id.dialog_base_task_know) {
                e(this.al);
                return false;
            }
            LogUtil.j("HL_HealthLifeTaskDialog", "onTouch id ", Integer.valueOf(id));
            return false;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (view == null) {
                LogUtil.j("HL_HealthLifeTaskDialog", "onClick view is null");
                return;
            }
            int id = view.getId();
            if (id == com.huawei.basichealthmodel.R.id.dialog_base_task_about) {
                cbk.a(this.ab);
                cfp.d(this.f5357b, this.f5356a);
            } else if (id == com.huawei.basichealthmodel.R.id.dialog_base_task_positive) {
                cbk.d(this.ab, String.valueOf(this.aq.getText()));
                cfp.a(this.f5357b, this.f5356a);
            } else if (id == com.huawei.basichealthmodel.R.id.dialog_base_task_neutral) {
                cbk.d(this.ab, String.valueOf(this.as.getText()));
                a(AnalyticsValue.HEALTH_HEALTH_BLOODPRESS_DETAIL_RECORD_2030020);
                cfp.b(this.f5357b, this.f5356a, this.u);
            } else if (id == com.huawei.basichealthmodel.R.id.dialog_base_task_negative) {
                cbk.d(this.ab, String.valueOf(this.ak.getText()));
                a(AnalyticsValue.HEALTH_HOME_BLOOD_PRESSURE_DETAIL_2010025);
                cfp.d(this.bc, this.f5356a, this.j);
            } else if (id == com.huawei.basichealthmodel.R.id.dialog_base_task_detail) {
                cbk.d(this.ab, String.valueOf(this.r.getText()));
                cfp.e(this.f5357b, this.f5356a);
            } else if (id != com.huawei.basichealthmodel.R.id.dialog_base_task_know) {
                LogUtil.j("HL_HealthLifeTaskDialog", "onClick id ", Integer.valueOf(id));
            } else {
                cbk.d(this.ab, String.valueOf(this.al.getText()));
            }
            HealthLifeTaskDialog healthLifeTaskDialog = this.q;
            if (healthLifeTaskDialog != null) {
                healthLifeTaskDialog.dismiss();
            }
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            if (this.af && njy.c(this.i, this.v)) {
                this.v = i;
                d(this.i.get(i));
                w();
                return;
            }
            LogUtil.j("HL_HealthLifeTaskDialog", "onItemClick other!");
        }

        private void s() {
            ResponseCallback<HealthLifeTaskBean> responseCallback = this.j;
            if (responseCallback != null) {
                responseCallback.onResponse(0, this.bc);
            }
        }

        private void a(AnalyticsValue analyticsValue) {
            if (this.af) {
                cbk.d(analyticsValue, "/todoTask/TodoListActivity".equals(this.u) ? 3 : 2);
            }
        }

        public void e(int i) {
            int iMax = Math.max(i, 0);
            this.n = iMax;
            HealthTextView healthTextView = this.ay;
            if (healthTextView == null) {
                LogUtil.j("HL_HealthLifeTaskDialog", "setSubtitle mSubtitle is null");
                return;
            }
            if (iMax <= 0) {
                healthTextView.setVisibility(8);
                return;
            }
            healthTextView.setVisibility(0);
            HealthTextView healthTextView2 = this.ay;
            Resources resources = this.aw;
            int i2 = com.huawei.basichealthmodel.R.string.IDS_health_model_target_over_number;
            Resources resources2 = this.aw;
            int i3 = com.huawei.basichealthmodel.R.plurals.IDS_health_model_target_over_all_number;
            int i4 = this.n;
            healthTextView2.setText(resources.getString(i2, resources2.getQuantityString(i3, i4, Integer.valueOf(i4))));
        }

        public void c(int i) {
            HealthTextView healthTextView = this.o;
            if (healthTextView != null) {
                healthTextView.setVisibility(8);
            }
            HealthTextView healthTextView2 = this.ay;
            if (healthTextView2 == null) {
                LogUtil.j("HL_HealthLifeTaskDialog", "setRank mSubtitle is null");
                return;
            }
            if (i <= 0) {
                LogUtil.j("HL_HealthLifeTaskDialog", "setRank rank ", Integer.valueOf(i));
                return;
            }
            if (this.n <= 0) {
                healthTextView2.setVisibility(8);
                return;
            }
            healthTextView2.setVisibility(0);
            HealthTextView healthTextView3 = this.ay;
            Resources resources = this.aw;
            int i2 = com.huawei.basichealthmodel.R.string.IDS_dialog_subtitle;
            Resources resources2 = this.aw;
            int i3 = com.huawei.basichealthmodel.R.plurals.IDS_health_model_target_over_all_number;
            int i4 = this.n;
            healthTextView3.setText(resources.getString(i2, resources2.getQuantityString(i3, i4, Integer.valueOf(i4)), cbg.d(i, 2, 0)));
        }

        private void u() {
            View viewInflate = View.inflate(this.m, com.huawei.basichealthmodel.R.layout.dialog_task_time, null);
            HealthTextView healthTextView = (HealthTextView) viewInflate.findViewById(com.huawei.basichealthmodel.R.id.dialog_task_time_plan_content);
            this.ao = healthTextView;
            cbg.d(healthTextView, R.dimen.health_common_10dp, 1.2f);
            HealthTextView healthTextView2 = (HealthTextView) viewInflate.findViewById(com.huawei.basichealthmodel.R.id.dialog_task_time_punch_content);
            this.ar = healthTextView2;
            cbg.d(healthTextView2, R.dimen.health_common_10dp, 1.2f);
            if (this.af) {
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
                layoutParams.topMargin = this.aw.getDimensionPixelSize(R.dimen.elementsMarginVerticalM);
                layoutParams.bottomMargin = this.aw.getDimensionPixelSize(R.dimen.elementsMarginVerticalM);
                viewInflate.setLayoutParams(layoutParams);
            }
            this.l.addView(viewInflate);
        }

        private void w() {
            View childAt;
            int i;
            for (int i2 = 0; i2 < this.x; i2++) {
                View childAt2 = this.ad.getChildAt(i2);
                if (childAt2 instanceof LinearLayout) {
                    LinearLayout linearLayout = (LinearLayout) childAt2;
                    if (linearLayout.getChildCount() != 0 && (childAt = linearLayout.getChildAt(0)) != null) {
                        if (i2 == this.v) {
                            if (this.af) {
                                Context context = this.m;
                                if (this.ah) {
                                    i = com.huawei.basichealthmodel.R.drawable.health_model_task_dialog_icon_select_done;
                                } else {
                                    i = com.huawei.basichealthmodel.R.drawable.health_model_dialog_blood_pressure_select;
                                }
                                childAt.setBackground(ContextCompat.getDrawable(context, i));
                            } else {
                                LogUtil.j("HL_HealthLifeTaskDialog", "setGridSelectionForMedicine other");
                            }
                        } else {
                            childAt.setBackground(null);
                        }
                    }
                }
            }
        }

        public void c() {
            String extendInfo = this.f5357b.getExtendInfo();
            if (TextUtils.isEmpty(extendInfo)) {
                LogUtil.j("HL_HealthLifeTaskDialog", "initGridForBloodPressure extendInfo is empty");
                return;
            }
            List<BloodPressurePlanResultBean> list = (List) HiJsonUtil.d(extendInfo, new TypeToken<List<BloodPressurePlanResultBean>>() { // from class: com.huawei.basichealthmodel.ui.dialog.HealthLifeTaskDialog.Builder.2
            }.getType());
            this.i = list;
            if (njy.e(list)) {
                LogUtil.j("HL_HealthLifeTaskDialog", "initGridForBloodPressure mBloodPressureList is empty");
                return;
            }
            e();
            j();
            TaskDialogGridAdapter taskDialogGridAdapter = new TaskDialogGridAdapter(this.y, this.bd, false);
            taskDialogGridAdapter.c(true);
            this.ad.setAdapter((ListAdapter) taskDialogGridAdapter);
            this.ad.setNumColumns(5);
            this.ad.setEnabled(true);
            int dimensionPixelSize = this.aw.getDimensionPixelSize(R.dimen.health_common_2dp);
            int dimensionPixelSize2 = this.aw.getDimensionPixelSize(R.dimen.health_common_12dp);
            int dimensionPixelSize3 = this.aw.getDimensionPixelSize(R.dimen.health_common_6dp);
            this.ad.setVerticalSpacing(dimensionPixelSize);
            this.ad.setPadding(dimensionPixelSize2, dimensionPixelSize3, dimensionPixelSize2, dimensionPixelSize3);
            this.ad.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.huawei.basichealthmodel.ui.dialog.HealthLifeTaskDialog.Builder.1
                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public void onGlobalLayout() {
                    Builder.this.ad.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                    Builder.this.l();
                }
            });
            this.ad.setOnItemClickListener(this);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void l() {
            this.x = this.ad.getCount();
            u();
            View viewInflate = View.inflate(this.m, com.huawei.basichealthmodel.R.layout.item_task_dialog_blood_pressure, null);
            this.g = viewInflate;
            this.f = (ImageView) viewInflate.findViewById(com.huawei.basichealthmodel.R.id.item_blood_pressure_result_status);
            this.h = (HealthTextView) this.g.findViewById(com.huawei.basichealthmodel.R.id.item_blood_pressure_result_value);
            this.l.addView(this.g);
            d(this.i.get(this.v));
            w();
        }

        private void d(BloodPressurePlanResultBean bloodPressurePlanResultBean) {
            if (bloodPressurePlanResultBean == null) {
                LogUtil.j("HL_HealthLifeTaskDialog", "refreshTimeForBloodPressure alarmInfo is null");
                return;
            }
            LogUtil.d("HL_HealthLifeTaskDialog", "refreshTimeForBloodPressure: ", bloodPressurePlanResultBean.toString());
            this.ao.setText(this.aw.getString(com.huawei.basichealthmodel.R.string.IDS_card_plan, qrk.a(this.m, cbg.c(bloodPressurePlanResultBean.getHour(), bloodPressurePlanResultBean.getMinute()), 1)));
            long pressureTime = bloodPressurePlanResultBean.getPressureTime();
            if (pressureTime > 0) {
                this.ah = true;
                this.ar.setVisibility(0);
                this.ar.setText(this.aw.getString(com.huawei.basichealthmodel.R.string.IDS_card_clock, qrk.a(this.m, pressureTime, 1)));
            } else {
                this.ah = false;
                this.ar.setVisibility(8);
            }
            double bloodPressureDiastolic = bloodPressurePlanResultBean.getBloodPressureDiastolic();
            double bloodPressureSystolic = bloodPressurePlanResultBean.getBloodPressureSystolic();
            if (bloodPressureSystolic < 1.0d && bloodPressureDiastolic < 1.0d) {
                LogUtil.d("HL_HealthLifeTaskDialog", "refreshTimeForBloodPressure pressure result fail");
                this.g.setVisibility(4);
                return;
            }
            this.h.setText(this.aw.getQuantityString(com.huawei.basichealthmodel.R.plurals.IDS_blood_pressure_result, UnitUtil.e(bloodPressureDiastolic), cbg.d((int) bloodPressureSystolic, 1, 0), cbg.d((int) bloodPressureDiastolic, 1, 0)));
            if (bloodPressureSystolic <= 139.0d && bloodPressureSystolic > 90.0d && bloodPressureDiastolic > 60.0d && bloodPressureDiastolic <= 89.0d) {
                this.f.setImageResource(com.huawei.basichealthmodel.R.drawable.health_model_dialog_blood_pressure_normal);
            } else {
                this.f.setImageResource(com.huawei.basichealthmodel.R.drawable.health_model_dialog_blood_pressure_abnormal);
            }
            this.g.setVisibility(0);
        }

        private void j() {
            int size = this.i.size();
            int iE = cbg.e(System.currentTimeMillis());
            boolean z = false;
            for (int i = 0; i < size; i++) {
                BloodPressurePlanResultBean bloodPressurePlanResultBean = this.i.get(i);
                if (bloodPressurePlanResultBean != null) {
                    if (bloodPressurePlanResultBean.getPressureTime() > 0) {
                        if (i == 0 || i == size - 1) {
                            this.y.add(ContextCompat.getDrawable(this.m, com.huawei.basichealthmodel.R.drawable.icon_task_blood_pressure_default));
                        } else {
                            this.y.add(ContextCompat.getDrawable(this.m, R.drawable.health_life_icon_task_blood_pressure));
                        }
                    } else if (i == 0 || i == size - 1) {
                        this.y.add(ContextCompat.getDrawable(this.m, com.huawei.basichealthmodel.R.drawable.icon_task_blood_pressure_default_un_done));
                    } else {
                        this.y.add(ContextCompat.getDrawable(this.m, com.huawei.basichealthmodel.R.drawable.icon_task_blood_pressure_un_done));
                    }
                    int hour = (bloodPressurePlanResultBean.getHour() * 3600) + (bloodPressurePlanResultBean.getMinute() * 60);
                    LogUtil.a("HL_HealthLifeTaskDialog", "initGridDrawableForBloodPressure planSeconds ", Integer.valueOf(hour), ", seconds ", Integer.valueOf(iE));
                    if (Math.abs(hour - iE) >= 1800 || z) {
                        if (hour > iE && !z) {
                            this.v = i;
                            z = true;
                        } else {
                            LogUtil.j("HL_HealthLifeTaskDialog", "initGridDrawableForBloodPressure planSeconds ", Integer.valueOf(hour));
                        }
                    } else if (bloodPressurePlanResultBean.getPressureTime() > 0) {
                        this.v = i + 1;
                    } else {
                        this.v = i;
                        z = true;
                    }
                    if (i == size - 1 && !z) {
                        this.v = i;
                    }
                }
            }
            if (this.v >= size) {
                this.v = size - 1;
            }
        }

        @Override // com.huawei.hwbasemgr.ResponseCallback
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onResponse(int i, bwc bwcVar) {
            if (bwcVar == null) {
                LogUtil.j("HL_HealthLifeTaskDialog", "onResponse taskDialogEvent is null");
                return;
            }
            int iD = bwcVar.d();
            if (iD == 1) {
                cfp.a(this.f5356a);
            } else if (iD == 2) {
                cfp.d(this.f5356a);
            } else if (iD != 3) {
                LogUtil.j("HL_HealthLifeTaskDialog", "onResponse type ", Integer.valueOf(iD));
            } else {
                cfp.b(this.f5356a);
            }
            HealthLifeTaskDialog healthLifeTaskDialog = this.q;
            if (healthLifeTaskDialog != null) {
                healthLifeTaskDialog.dismiss();
            }
        }
    }
}

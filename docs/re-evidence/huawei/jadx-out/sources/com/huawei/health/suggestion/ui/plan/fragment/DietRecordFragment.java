package com.huawei.health.suggestion.ui.plan.fragment;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.basefitnessadvice.callback.DataCallback;
import com.huawei.basefitnessadvice.callback.UiCallback;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.suggestion.R;
import com.huawei.health.suggestion.ui.plan.adapter.DietRecordAdapter;
import com.huawei.health.suggestion.ui.plan.viewholder.AiPlanWeekDetailViewHolder;
import com.huawei.health.suggestion.util.JumpUtil;
import com.huawei.health.weight.bean.WeightTargetDifferences;
import com.huawei.hwbasemgr.ResponseCallback;
import com.huawei.hwcommonmodel.utils.DateFormatUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.ui.commonui.base.BaseFragment;
import com.huawei.ui.commonui.cardview.HealthCardView;
import com.huawei.ui.commonui.dialog.CustomViewDialog;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import defpackage.ezn;
import defpackage.hdi;
import defpackage.hdn;
import defpackage.hqk;
import defpackage.hqo;
import defpackage.iun;
import defpackage.njy;
import defpackage.qrs;
import defpackage.vfy;
import defpackage.vgo;
import defpackage.vgu;
import defpackage.vgw;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public class DietRecordFragment extends BaseFragment implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ImageView f9682a;
    private long ac;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ImageView f9683b;
    private ImageView d;
    private AiPlanWeekDetailViewHolder g;
    private LinearLayout i;
    private ImageView j;
    private HealthCardView k;
    private DietRecordAdapter l;
    private Context o;
    private int p;
    private boolean q;
    private float r;
    private RecyclerView u;
    private boolean v;
    private boolean w;
    private boolean x = true;
    private int f = 0;
    private int e = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f9684c = 0;
    private TreeMap<Integer, hqk> m = new TreeMap<>();
    private HashMap<Integer, Float> ad = new HashMap<>();
    private List<hqk> aa = new ArrayList();
    private Set<Integer> h = new HashSet();
    private Set<String> t = new HashSet();
    private Set<String> n = new HashSet();
    private int y = 0;
    private Handler s = new Handler(Looper.getMainLooper());

    public static DietRecordFragment a() {
        LogUtil.a("Suggestion_DietRecordFragment", "newInstance()");
        Bundle bundle = new Bundle();
        DietRecordFragment dietRecordFragment = new DietRecordFragment();
        dietRecordFragment.setArguments(bundle);
        return dietRecordFragment;
    }

    @Override // com.huawei.ui.commonui.base.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.o = getContext();
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_diet_record, viewGroup, false);
        b(viewInflate);
        return viewInflate;
    }

    private void b(View view) {
        LogUtil.a("Suggestion_DietRecordFragment", "initView()");
        view.measure(0, 0);
        int measuredHeight = view.getMeasuredHeight();
        this.p = measuredHeight;
        LogUtil.a("Suggestion_DietRecordFragment", "initView() mInitLayoutHeight: ", Integer.valueOf(measuredHeight));
        this.i = (LinearLayout) view.findViewById(R.id.diet_record_container_layout);
        this.k = (HealthCardView) view.findViewById(R.id.diet_record_card_view);
        ((LinearLayout) view.findViewById(R.id.diet_record_add_breakfast)).setOnClickListener(this);
        ((LinearLayout) view.findViewById(R.id.diet_record_add_lunch)).setOnClickListener(this);
        ((LinearLayout) view.findViewById(R.id.diet_record_add_dinner)).setOnClickListener(this);
        ((LinearLayout) view.findViewById(R.id.diet_record_add_meal)).setOnClickListener(this);
        this.f9683b = (ImageView) view.findViewById(R.id.diet_record_add_breakfast_icon);
        this.f9682a = (ImageView) view.findViewById(R.id.diet_record_add_lunch_icon);
        this.d = (ImageView) view.findViewById(R.id.diet_record_add_dinner_icon);
        this.j = (ImageView) view.findViewById(R.id.diet_record_add_meal_icon);
        this.u = (RecyclerView) view.findViewById(R.id.diet_record_recycler_view);
    }

    public void d() {
        LogUtil.a("Suggestion_DietRecordFragment", "resetLayout()");
        this.s.post(new Runnable() { // from class: hse
            @Override // java.lang.Runnable
            public final void run() {
                this.f37103b.b();
            }
        });
    }

    public /* synthetic */ void b() {
        this.k.setVisibility(0);
        this.f9683b.setImageResource(R.drawable.diet_record_breakfast);
        this.f9682a.setImageResource(R.drawable.diet_record_lunch);
        this.d.setImageResource(R.drawable.diet_record_dinner);
        this.j.setImageResource(R.drawable.diet_record_add_meal);
        f();
        this.u.setVisibility(8);
        this.g.b(1, this.p);
    }

    private void f() {
        this.f9683b.setAlpha(1.0f);
        this.f9682a.setAlpha(1.0f);
        this.d.setAlpha(1.0f);
        this.j.setAlpha(1.0f);
    }

    private void j() {
        this.s.post(new Runnable() { // from class: hsk
            @Override // java.lang.Runnable
            public final void run() {
                this.e.e();
            }
        });
    }

    public /* synthetic */ void e() {
        this.f9683b.setAlpha(0.6f);
        this.f9682a.setAlpha(0.6f);
        this.d.setAlpha(0.6f);
        this.j.setAlpha(0.6f);
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        LogUtil.a("Suggestion_DietRecordFragment", "onStart()");
        super.onStart();
    }

    @Override // com.huawei.ui.commonui.base.BaseFragment, androidx.fragment.app.Fragment
    public void onResume() {
        LogUtil.a("Suggestion_DietRecordFragment", "onResume()");
        super.onResume();
        if (this.v) {
            this.v = false;
            b(this.ac);
        }
    }

    public void d(AiPlanWeekDetailViewHolder aiPlanWeekDetailViewHolder) {
        this.g = aiPlanWeekDetailViewHolder;
    }

    public void d(boolean z, long j) {
        LogUtil.a("Suggestion_DietRecordFragment", "setInitData() isFutureTime: ", Boolean.valueOf(z), ", timeStamp: ", Long.valueOf(j), ", mTimeStamp: ", Long.valueOf(this.ac));
        this.w = z;
        if (z) {
            d();
            j();
            return;
        }
        long j2 = this.ac;
        if (j2 != 0 && j2 != j) {
            d();
        }
        this.ac = j;
        b(j);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (this.w) {
            LogUtil.j("Suggestion_DietRecordFragment", "onClick() mIsFutureTime = true, return");
            return;
        }
        if (view == null) {
            LogUtil.e("Suggestion_DietRecordFragment", "onClick() view is null");
            return;
        }
        if (qrs.c(500)) {
            LogUtil.j("Suggestion_DietRecordFragment", "onClick() isFastClick()");
            return;
        }
        if (view.getId() == R.id.diet_record_add_breakfast) {
            d(10, 0);
            return;
        }
        if (view.getId() == R.id.diet_record_add_lunch) {
            d(20, 0);
            return;
        }
        if (view.getId() == R.id.diet_record_add_dinner) {
            d(30, 0);
        } else if (view.getId() == R.id.diet_record_add_meal) {
            m();
        } else {
            LogUtil.j("Suggestion_DietRecordFragment", "error view id: ", view);
        }
    }

    private void m() {
        View viewInflate = ((LayoutInflater) this.o.getSystemService("layout_inflater")).inflate(R.layout.dialog_diet_record_add_meal, (ViewGroup) null);
        CustomViewDialog.Builder builder = new CustomViewDialog.Builder(this.o);
        if (viewInflate == null) {
            LogUtil.j("Suggestion_DietRecordFragment", "showAddMealDialog() layout error");
            return;
        }
        builder.b(viewInflate, 0, 0).d(R.string.IDS_hw_show_cancel, new View.OnClickListener() { // from class: com.huawei.health.suggestion.ui.plan.fragment.DietRecordFragment.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
            }
        });
        CustomViewDialog customViewDialogD = builder.d();
        c(viewInflate, customViewDialogD);
        customViewDialogD.show();
    }

    private void c(View view, final CustomViewDialog customViewDialog) {
        HealthTextView healthTextView = (HealthTextView) view.findViewById(R.id.dialog_add_meal_morning);
        HealthTextView healthTextView2 = (HealthTextView) view.findViewById(R.id.dialog_add_meal_afternoon);
        HealthTextView healthTextView3 = (HealthTextView) view.findViewById(R.id.dialog_add_meal_evening);
        healthTextView.setOnClickListener(new View.OnClickListener() { // from class: hsb
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f37101c.c(customViewDialog, view2);
            }
        });
        healthTextView2.setOnClickListener(new View.OnClickListener() { // from class: hrz
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f37098b.d(customViewDialog, view2);
            }
        });
        healthTextView3.setOnClickListener(new View.OnClickListener() { // from class: hry
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.d.b(customViewDialog, view2);
            }
        });
    }

    public /* synthetic */ void c(CustomViewDialog customViewDialog, View view) {
        d(11, this.f);
        customViewDialog.dismiss();
    }

    public /* synthetic */ void d(CustomViewDialog customViewDialog, View view) {
        d(21, this.e);
        customViewDialog.dismiss();
    }

    public /* synthetic */ void b(CustomViewDialog customViewDialog, View view) {
        d(31, this.f9684c);
        customViewDialog.dismiss();
    }

    private void d(int i, int i2) {
        LogUtil.a("Suggestion_DietRecordFragment", "jumpToH5RecordDietPage() mealType: ", Integer.valueOf(i), ", index: ", Integer.valueOf(i2), ", mTimeStamp: ", Long.valueOf(this.ac));
        this.v = true;
        JumpUtil.e(this.ac, i, i2);
    }

    private void b(final long j) {
        LogUtil.a("Suggestion_DietRecordFragment", "requestDietDataInThread() timeStamp: ", Long.valueOf(j), ", currentTime: ", Long.valueOf(System.currentTimeMillis()));
        if (j == 0) {
            LogUtil.j("Suggestion_DietRecordFragment", "requestDietDataInThread() timeStamp == 0L,return");
        } else {
            if (!this.x) {
                LogUtil.a("Suggestion_DietRecordFragment", "requestDietDataInThread() mIsRequestDataEnd = false");
                return;
            }
            this.x = false;
            o();
            ThreadPoolManager.c().execute(new Runnable() { // from class: hsh
                @Override // java.lang.Runnable
                public final void run() {
                    this.e.d(j);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void d(long j) {
        int iA = DateFormatUtil.a(j);
        ReleaseLogUtil.d("Suggestion_DietRecordFragment", "requestDietData dayFormat ", Integer.valueOf(iA));
        iun.c(iA, iA, new e(this));
    }

    static class e implements ResponseCallback<List<vgo>> {
        private final WeakReference<DietRecordFragment> e;

        e(DietRecordFragment dietRecordFragment) {
            this.e = new WeakReference<>(dietRecordFragment);
        }

        @Override // com.huawei.hwbasemgr.ResponseCallback
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void onResponse(int i, List<vgo> list) {
            vfy vfyVarD;
            LogUtil.a("Suggestion_DietRecordFragment", "InnerResponseCallback errorCode ", Integer.valueOf(i), " list ", list);
            DietRecordFragment dietRecordFragment = this.e.get();
            if (dietRecordFragment == null) {
                ReleaseLogUtil.e("Suggestion_DietRecordFragment", "InnerResponseCallback fragment is null");
                return;
            }
            if (njy.e(list)) {
                dietRecordFragment.x = true;
                dietRecordFragment.d();
                return;
            }
            for (vgo vgoVar : list) {
                if (vgoVar != null && (vfyVarD = vgoVar.d()) != null) {
                    dietRecordFragment.r = vfyVarD.e();
                    if (njy.e(vgoVar.a())) {
                        dietRecordFragment.x = true;
                        dietRecordFragment.d();
                        return;
                    }
                    dietRecordFragment.b(vgoVar);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(vgo vgoVar) {
        HashSet hashSet = new HashSet();
        List<vgw> listA = vgoVar.a();
        ArrayList arrayList = new ArrayList();
        for (vgw vgwVar : listA) {
            hashSet.add(Integer.valueOf(vgwVar.i()));
            for (vgu vguVar : vgwVar.c()) {
                hqo hqoVar = new hqo();
                hqoVar.c(vgwVar.i());
                hqoVar.c(vguVar.e());
                hqoVar.e(vguVar.a());
                hqoVar.c(vguVar.d());
                hqoVar.b(vguVar.j());
                hqoVar.a(vguVar.h());
                hqoVar.e(vguVar.g());
                if (vguVar.f() == 0) {
                    hqoVar.b(true);
                    this.n.add(vguVar.e());
                } else {
                    hqoVar.b(false);
                    this.t.add(vguVar.e());
                }
                arrayList.add(hqoVar);
            }
        }
        LogUtil.a("Suggestion_DietRecordFragment", "dietRecordItemDataList size: ", Integer.valueOf(arrayList.size()));
        b(hashSet);
        LogUtil.a("Suggestion_DietRecordFragment", "requestDietData() mFoodIdSet: ", this.t, ", mCustomFoodIdSet: ", this.n);
        if (njy.e(this.t) && njy.e(this.n)) {
            LogUtil.j("Suggestion_DietRecordFragment", "mFoodIdSet and mCustomFoodIdSet is empty");
            this.x = true;
            return;
        }
        if (njy.b(this.t) && njy.b(this.n)) {
            this.q = true;
            b(this.t, arrayList);
        } else if (njy.b(this.t)) {
            b(this.t, arrayList);
        } else if (njy.b(this.n)) {
            d(this.n, arrayList);
        } else {
            LogUtil.j("Suggestion_DietRecordFragment", "handleDietRecordData() wrong case");
            this.x = true;
        }
    }

    private void b(final Set<Integer> set) {
        LogUtil.a("Suggestion_DietRecordFragment", "displayColorIcon() iconSet: ", set);
        this.s.post(new Runnable() { // from class: hsf
            @Override // java.lang.Runnable
            public final void run() {
                this.f37104b.d(set);
            }
        });
    }

    public /* synthetic */ void d(Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            if (num.intValue() == 10) {
                this.f9683b.setImageResource(R.drawable.diet_record_breakfast_recorded);
            } else if (num.intValue() == 20) {
                this.f9682a.setImageResource(R.drawable.diet_record_lunch_recorded);
            } else if (num.intValue() == 30) {
                this.d.setImageResource(R.drawable.diet_record_dinner_recorded);
            } else if (num.intValue() == 11 || num.intValue() == 21 || num.intValue() == 31) {
                this.j.setImageResource(R.drawable.diet_record_add_meal_recorded);
            } else {
                LogUtil.j("Suggestion_DietRecordFragment", "wrong mealType: ", num);
            }
            f();
            this.k.setVisibility(0);
            this.g.b(1, this.p);
        }
    }

    private void b(Set<String> set, final List<hqo> list) {
        hdi.e().batchGetFood(set, new DataCallback() { // from class: com.huawei.health.suggestion.ui.plan.fragment.DietRecordFragment.5
            @Override // com.huawei.basefitnessadvice.callback.DataCallback
            public void onSuccess(JSONObject jSONObject) {
                LogUtil.d("Suggestion_DietRecordFragment", "requestFoodIconData() batchGetFood success data: ", jSONObject);
                if (jSONObject != null && jSONObject.has("foodList")) {
                    DietRecordFragment.this.a(jSONObject, (List<hqo>) list);
                }
                DietRecordFragment.this.x = true;
            }

            @Override // com.huawei.basefitnessadvice.callback.DataCallback
            public void onFailure(int i, String str) {
                LogUtil.e("Suggestion_DietRecordFragment", "requestFoodIconData() batchGetFood errorCode: ", Integer.valueOf(i), ", errorInfo: ", str);
                DietRecordFragment.this.x = true;
            }
        });
    }

    private void d(Set<String> set, final List<hqo> list) {
        int size = set.size();
        if (size > 100) {
            size = 100;
        }
        hdn.c().getCustomFoods(1, size, set, new UiCallback<JSONObject>() { // from class: com.huawei.health.suggestion.ui.plan.fragment.DietRecordFragment.1
            @Override // com.huawei.basefitnessadvice.callback.UiCallback
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public void onSuccess(JSONObject jSONObject) {
                LogUtil.d("Suggestion_DietRecordFragment", "getCustomFoods() data: ", jSONObject);
                if (jSONObject != null && jSONObject.has("customFoodList")) {
                    DietRecordFragment.this.d(jSONObject, (List<hqo>) list);
                }
                DietRecordFragment.this.x = true;
            }

            @Override // com.huawei.basefitnessadvice.callback.UiCallback
            public void onFailure(int i, String str) {
                LogUtil.j("Suggestion_DietRecordFragment", "getCustomFoods() errorCode: ", Integer.valueOf(i), ", errorInfo: ", str);
                DietRecordFragment.this.x = true;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(JSONObject jSONObject, List<hqo> list) {
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("foodList");
        if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() == 0) {
            LogUtil.j("Suggestion_DietRecordFragment", "handleFoodIconData() foodJsonArray is empty");
            return;
        }
        HashMap map = new HashMap();
        for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
            JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
            if (jSONObjectOptJSONObject != null) {
                map.put(jSONObjectOptJSONObject.optString("foodId"), jSONObjectOptJSONObject.optString("imageUrl"));
            }
        }
        for (hqo hqoVar : list) {
            if (hqoVar != null && !hqoVar.i()) {
                hqoVar.d((String) map.get(hqoVar.a()));
            }
        }
        if (this.q) {
            d(this.n, list);
        } else {
            c(list);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(JSONObject jSONObject, List<hqo> list) {
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("customFoodList");
        if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() == 0) {
            LogUtil.j("Suggestion_DietRecordFragment", "handleCustomFoodIconData() foodJsonArray is empty");
            return;
        }
        HashMap map = new HashMap();
        for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
            JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
            if (jSONObjectOptJSONObject != null) {
                String strOptString = jSONObjectOptJSONObject.optString("foodId");
                JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("foodInfo");
                if (jSONObjectOptJSONObject2 != null) {
                    map.put(strOptString, jSONObjectOptJSONObject2.optString("pictureUrl"));
                }
            }
        }
        for (hqo hqoVar : list) {
            if (hqoVar != null && hqoVar.i()) {
                String str = (String) map.get(hqoVar.a());
                if (!TextUtils.isEmpty(str) && !str.startsWith("http")) {
                    ReleaseLogUtil.e("Suggestion_DietRecordFragment", "wrong foodIconUrl, foodId: ", hqoVar.a(), ", url: ", str);
                }
                hqoVar.d(str);
            }
        }
        c(list);
    }

    private void c(List<hqo> list) {
        hqk hqkVar;
        LogUtil.a("Suggestion_DietRecordFragment", "mergeData() dietRecordItemDataList: ", list);
        for (hqo hqoVar : list) {
            int iJ = hqoVar.j();
            LogUtil.a("Suggestion_DietRecordFragment", "dataTreeMap mealType: ", Integer.valueOf(iJ), ", data: ", this.m.get(Integer.valueOf(iJ)));
            if (this.m.get(Integer.valueOf(iJ)) != null) {
                hqkVar = this.m.get(Integer.valueOf(iJ));
            } else {
                hqkVar = new hqk();
            }
            hqkVar.d(iJ);
            if (iJ == 11 || iJ == 21 || iJ == 31) {
                this.h.add(Integer.valueOf(iJ));
            }
            b(iJ, hqoVar.c());
            if (hqkVar.a() == null) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(hqoVar);
                hqkVar.a(arrayList);
            } else {
                hqkVar.a().add(hqoVar);
            }
            this.m.put(Integer.valueOf(iJ), hqkVar);
        }
        h();
    }

    private void b(int i, float f) {
        if (this.ad.get(Integer.valueOf(i)) != null) {
            f += this.ad.get(Integer.valueOf(i)).floatValue();
        }
        LogUtil.a("Suggestion_DietRecordFragment", "calculateTotalCalories() mealType: ", Integer.valueOf(i), ", tempCalories: ", Float.valueOf(f));
        this.ad.put(Integer.valueOf(i), Float.valueOf(f));
    }

    private void h() {
        iun.a((ResponseCallback<WeightTargetDifferences>) new ResponseCallback() { // from class: hsd
            @Override // com.huawei.hwbasemgr.ResponseCallback
            public final void onResponse(int i, Object obj) {
                this.e.a(i, (WeightTargetDifferences) obj);
            }
        });
    }

    public /* synthetic */ void a(int i, WeightTargetDifferences weightTargetDifferences) {
        if (weightTargetDifferences == null) {
            LogUtil.j("Suggestion_DietRecordFragment", "weightTargetDifferences is null");
            i();
            return;
        }
        WeightTargetDifferences.WeightTargetType weightTargetTypeE = weightTargetDifferences.e();
        if (weightTargetTypeE == null) {
            LogUtil.j("Suggestion_DietRecordFragment", "targetType is null");
            i();
            return;
        }
        int i2 = AnonymousClass4.f9686c[weightTargetTypeE.ordinal()];
        if (i2 == 1) {
            this.y = 0;
            k();
        } else if (i2 == 2) {
            this.y = 2;
            k();
        } else if (i2 != 3) {
            LogUtil.j("Suggestion_DietRecordFragment", "targetType error case");
            i();
        } else {
            this.y = 1;
            k();
        }
    }

    /* JADX INFO: renamed from: com.huawei.health.suggestion.ui.plan.fragment.DietRecordFragment$4, reason: invalid class name */
    static /* synthetic */ class AnonymousClass4 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final /* synthetic */ int[] f9686c;

        static {
            int[] iArr = new int[WeightTargetDifferences.WeightTargetType.values().length];
            f9686c = iArr;
            try {
                iArr[WeightTargetDifferences.WeightTargetType.WEIGHT_KEE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f9686c[WeightTargetDifferences.WeightTargetType.WEIGHT_GAIN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f9686c[WeightTargetDifferences.WeightTargetType.WEIGHT_LOSS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private void i() {
        iun.b((ResponseCallback<HashMap<String, Double>>) new ResponseCallback() { // from class: hsm
            @Override // com.huawei.hwbasemgr.ResponseCallback
            public final void onResponse(int i, Object obj) {
                this.d.b(i, (HashMap) obj);
            }
        });
    }

    public /* synthetic */ void b(int i, HashMap map) {
        if (map == null) {
            LogUtil.j("Suggestion_DietRecordFragment", "judgeUserPlanType() map == null");
            k();
            return;
        }
        Double d = (Double) map.get("startWeight");
        double dDoubleValue = d != null ? d.doubleValue() : 0.0d;
        Double d2 = (Double) map.get("targetWeight");
        double dDoubleValue2 = d2 != null ? d2.doubleValue() : 0.0d;
        if (dDoubleValue <= 0.0d || dDoubleValue2 <= 0.0d) {
            this.y = 0;
        } else if (dDoubleValue2 < dDoubleValue) {
            this.y = 1;
        } else if (dDoubleValue2 > dDoubleValue) {
            this.y = 2;
        } else {
            this.y = 0;
        }
        k();
    }

    private void k() {
        n();
        g();
    }

    private void n() {
        String lowerCase;
        String accountInfo = LoginInit.getInstance(BaseApplication.b()).getAccountInfo(1010);
        LogUtil.a("Suggestion_DietRecordFragment", "countryCode: ", accountInfo);
        if (!TextUtils.isEmpty(accountInfo) && ("de".equals(accountInfo.toLowerCase(Locale.ENGLISH)) || "it".equals(accountInfo.toLowerCase(Locale.ENGLISH)))) {
            lowerCase = accountInfo.toLowerCase(Locale.ENGLISH);
        } else {
            LogUtil.j("Suggestion_DietRecordFragment", "countryCode is error: ", accountInfo);
            lowerCase = "";
        }
        for (Map.Entry<Integer, hqk> entry : this.m.entrySet()) {
            if (entry == null || !(entry instanceof Map.Entry)) {
                LogUtil.j("Suggestion_DietRecordFragment", "dataEntry == null or not instanceof Map.Entry");
            } else {
                Integer key = entry.getKey();
                int iIntValue = key.intValue();
                if (!(entry.getValue() instanceof hqk)) {
                    LogUtil.j("Suggestion_DietRecordFragment", "entry.getValue() not instanceof DietRecordSummaryData");
                } else {
                    hqk value = entry.getValue();
                    value.e(this.ad.get(key).floatValue());
                    value.d(this.ac);
                    if (this.r > 0.0f && !TextUtils.isEmpty(lowerCase)) {
                        Pair<Float, Float> pairD = ezn.d((List<Integer>) Collections.EMPTY_LIST, this.y, iIntValue);
                        value.d(this.r * ((Float) pairD.first).floatValue());
                        value.c(this.r * ((Float) pairD.second).floatValue());
                    }
                    this.aa.add(value);
                }
            }
        }
    }

    private void g() {
        LogUtil.a("Suggestion_DietRecordFragment", "mSummaryDataList: ", this.aa);
        if (njy.b(this.aa)) {
            this.s.post(new Runnable() { // from class: hsg
                @Override // java.lang.Runnable
                public final void run() {
                    this.f37106a.c();
                }
            });
        }
    }

    public /* synthetic */ void c() {
        this.l = new DietRecordAdapter(this.o, this.aa);
        this.u.setLayoutManager(new LinearLayoutManager(this.o));
        this.u.setAdapter(this.l);
        this.u.setVisibility(0);
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.g.itemView.getMeasuredWidth(), Integer.MIN_VALUE);
        this.i.measure(iMakeMeasureSpec, 0);
        int measuredHeight = this.i.getMeasuredHeight();
        LogUtil.a("Suggestion_DietRecordFragment", "widthMeasureSpec: ", Integer.valueOf(iMakeMeasureSpec), ", getMeasuredHeight: ", Integer.valueOf(measuredHeight));
        this.g.b(1, measuredHeight);
    }

    private void o() {
        this.l = null;
        this.v = false;
        this.w = false;
        this.r = 0.0f;
        this.f = 0;
        this.e = 0;
        this.f9684c = 0;
        this.m.clear();
        this.ad.clear();
        this.aa.clear();
        this.h.clear();
        this.t.clear();
        this.n.clear();
        this.q = false;
        this.y = 0;
    }

    @Override // com.huawei.ui.commonui.base.BaseFragment, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        LogUtil.a("Suggestion_DietRecordFragment", "onPause()");
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        LogUtil.a("Suggestion_DietRecordFragment", "onStop()");
    }
}

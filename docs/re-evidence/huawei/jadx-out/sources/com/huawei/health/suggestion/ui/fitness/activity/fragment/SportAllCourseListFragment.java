package com.huawei.health.suggestion.ui.fitness.activity.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.fragment.app.FragmentActivity;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.huawei.basefitnessadvice.callback.OnFitnessStatusChangeCallback;
import com.huawei.basefitnessadvice.model.FilterCondition;
import com.huawei.basefitnessadvice.model.Navigation;
import com.huawei.haf.design.pattern.Observer;
import com.huawei.haf.design.pattern.ObserverManagerUtil;
import com.huawei.health.suggestion.R;
import com.huawei.health.suggestion.ui.adapter.SportAllCourseListAdapter;
import com.huawei.health.suggestion.ui.polymericpage.adapter.PolymericDataAdapter;
import com.huawei.health.suggestion.ui.polymericpage.view.PolymericDataFragment;
import com.huawei.health.suggestion.ui.run.activity.CustomCourseActivity;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.toolbar.HealthToolBar;
import defpackage.btq;
import defpackage.qrs;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes9.dex */
public class SportAllCourseListFragment extends PolymericDataFragment {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f9235a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f9236b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private LinearLayout f9237c;
    private OnFitnessStatusChangeCallback d = new OnFitnessStatusChangeCallback() { // from class: hie
        @Override // com.huawei.basefitnessadvice.callback.OnFitnessStatusChangeCallback
        public final void onUpdate() {
            this.e.d();
        }
    };
    private ArrayList<String> e;
    private HealthToolBar j;

    public /* synthetic */ void d() {
        if (this.mDataViewModel == null) {
            LogUtil.j("Suggestion_SportAllCourseListFragment", "mCustomCourseStatusChangeCallback, mAllCourseViewModel is null.");
            return;
        }
        if (TextUtils.equals(this.mDataViewModel.b(), "RUNNING_COURSE") && this.mDataViewModel.c() == 9999) {
            LogUtil.a("Suggestion_SportAllCourseListFragment", "mWorkoutStatusChangeCallback is refreshView");
            getPolymericData(this.mDataViewModel.b(this.mDataViewModel.c()), new ArrayList(), false);
            return;
        }
        LogUtil.e("Suggestion_SportAllCourseListFragment", "pageType:", this.mDataViewModel.b(), " cur nav:", Integer.valueOf(this.mDataViewModel.c()));
    }

    public static SportAllCourseListFragment e(boolean z, ArrayList<String> arrayList, boolean z2) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("KEY_SUG_COURSE_ADD_STATUS", z);
        bundle.putStringArrayList("KEY_SUG_COURSE_ADD_IDS", arrayList);
        bundle.putBoolean("KEY_SUG_COURSE_REPLACE_STATUS", z2);
        SportAllCourseListFragment sportAllCourseListFragment = new SportAllCourseListFragment();
        sportAllCourseListFragment.setArguments(bundle);
        return sportAllCourseListFragment;
    }

    @Override // com.huawei.health.suggestion.ui.polymericpage.view.PolymericDataFragment
    public View initView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInitView = super.initView(layoutInflater, viewGroup);
        this.f9237c = (LinearLayout) viewInitView.findViewById(R.id.plan_confirm_add_course);
        final HealthButton healthButton = (HealthButton) viewInitView.findViewById(R.id.plan_confirm_add_course_btn);
        if (this.f9235a || this.f9236b) {
            this.f9237c.setVisibility(0);
            healthButton.setEnabled(false);
        }
        ObserverManagerUtil.d(new Observer() { // from class: com.huawei.health.suggestion.ui.fitness.activity.fragment.SportAllCourseListFragment.4
            @Override // com.huawei.haf.design.pattern.Observer
            public void notify(String str, Object... objArr) {
                HealthButton healthButton2;
                if (objArr != null) {
                    Object obj = objArr[0];
                    if ((obj instanceof Boolean) && (healthButton2 = healthButton) != null) {
                        boolean zEquals = obj.equals(Boolean.valueOf(healthButton2.isEnabled()));
                        Boolean.valueOf(zEquals).getClass();
                        if (!zEquals) {
                            healthButton.setEnabled(((Boolean) objArr[0]).booleanValue());
                        } else {
                            LogUtil.a("Suggestion_SportAllCourseListFragment", "do not change the button status");
                        }
                    }
                }
            }
        }, "PLAN_CONFIRM_VISIBILITY");
        if (this.f9236b) {
            healthButton.setText(R.string.sug_coach_dialog_yes);
        }
        healthButton.setOnClickListener(new View.OnClickListener() { // from class: hig
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f36765c.c(view);
            }
        });
        a(viewInitView);
        return viewInitView;
    }

    public /* synthetic */ void c(View view) {
        e();
    }

    @Override // com.huawei.health.suggestion.ui.polymericpage.view.PolymericDataFragment
    public void showNoDataTips() {
        showTips((TextUtils.equals(this.mDataViewModel.b(), "RUNNING_COURSE") && this.mDataViewModel.c() == 1) ? R.string.IDS_sug_no_custom_course : R.string.IDS_hwh_sug_fitness_recom_nodata, R.drawable.ic_collect_course);
    }

    private void a(View view) {
        this.j = (HealthToolBar) view.findViewById(R.id.toolbar_new);
        this.j.d(View.inflate(getContext(), R.layout.hw_toolbar_bottomview, null));
        this.j.setIcon(2, R.drawable.ic_public_add);
        this.j.setIconTitle(2, getResources().getString(R.string.IDS_sug_new).toUpperCase(Locale.ENGLISH));
        this.j.setOnSingleTapListener(new HealthToolBar.OnSingleTapListener() { // from class: hid
            @Override // com.huawei.ui.commonui.toolbar.HealthToolBar.OnSingleTapListener
            public final void onSingleTap(int i) {
                this.f36763a.e(i);
            }
        });
        this.j.setVisibility(8);
    }

    public /* synthetic */ void e(int i) {
        if (qrs.c(500)) {
            LogUtil.j("Suggestion_SportAllCourseListFragment", "setOnSingleTapListener click button too fast.");
            return;
        }
        FragmentActivity activity = getActivity();
        if (i == 2 && activity != null && isAdded()) {
            Intent intent = new Intent();
            intent.setClass(activity, CustomCourseActivity.class);
            startActivity(intent);
        }
    }

    private void e() {
        if (this.mPolymericDataAdapter == null || !(this.mPolymericDataAdapter instanceof SportAllCourseListAdapter)) {
            LogUtil.j("Suggestion_SportAllCourseListFragment", "submitAddCourseInfo, mCourseAdapter is null.");
            return;
        }
        Intent intent = new Intent();
        SportAllCourseListAdapter sportAllCourseListAdapter = (SportAllCourseListAdapter) this.mPolymericDataAdapter;
        intent.putStringArrayListExtra("KEY_SUG_COURSE_IDS_RESULT", sportAllCourseListAdapter.e());
        intent.putStringArrayListExtra("KEY_SUG_COURSE_NAMES_RESULT", sportAllCourseListAdapter.a());
        intent.putExtra("KEY_SUG_COURSE_ADD_STATUS", this.f9235a);
        intent.putExtra("KEY_SUG_COURSE_REPLACE_STATUS", this.f9236b);
        JsonObject jsonObject = new JsonObject();
        final JsonArray jsonArray = new JsonArray();
        sportAllCourseListAdapter.e().forEach(new Consumer() { // from class: hif
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                jsonArray.add((String) obj);
            }
        });
        jsonObject.add("KEY_SUG_COURSE_IDS_RESULT", jsonArray);
        final JsonArray jsonArray2 = new JsonArray();
        sportAllCourseListAdapter.a().forEach(new Consumer() { // from class: hif
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                jsonArray2.add((String) obj);
            }
        });
        jsonObject.add("KEY_SUG_COURSE_NAMES_RESULT", jsonArray2);
        jsonObject.addProperty("KEY_SUG_COURSE_ADD_STATUS", Boolean.valueOf(this.f9235a));
        jsonObject.addProperty("KEY_SUG_COURSE_REPLACE_STATUS", Boolean.valueOf(this.f9236b));
        intent.putExtra("result", jsonObject.toString());
        requireActivity().setResult(-1, intent);
        requireActivity().finish();
    }

    @Override // com.huawei.health.suggestion.ui.polymericpage.view.PolymericDataFragment
    public void getPolymericData(Navigation navigation, List<FilterCondition> list, boolean z) {
        HealthToolBar healthToolBar = this.j;
        if (healthToolBar != null) {
            healthToolBar.setVisibility(navigation.getValue() == 9999 ? 0 : 8);
        }
        super.getPolymericData(navigation, list, z);
    }

    @Override // com.huawei.health.suggestion.ui.polymericpage.view.PolymericDataFragment
    public void initArgument() {
        Bundle arguments = getArguments();
        if (arguments == null) {
            LogUtil.a("Suggestion_SportAllCourseListFragment", "initArgument, arguments is null.");
            return;
        }
        this.f9235a = arguments.getBoolean("KEY_SUG_COURSE_ADD_STATUS", false);
        this.f9236b = arguments.getBoolean("KEY_SUG_COURSE_REPLACE_STATUS", false);
        try {
            this.e = arguments.getStringArrayList("KEY_SUG_COURSE_ADD_IDS");
        } catch (ArrayIndexOutOfBoundsException unused) {
            LogUtil.e("Suggestion_SportAllCourseListFragment", "get addCourseId list fail");
        }
        btq.e().c(this.d, "CUSTOM_COURSE_UPDATE");
    }

    @Override // com.huawei.health.suggestion.ui.polymericpage.view.PolymericDataFragment
    public PolymericDataAdapter newPolymericDataAdapter() {
        Navigation navigationB = this.mDataViewModel.b(this.mDataViewModel.c());
        return new SportAllCourseListAdapter(new ArrayList(), this.mRecycleViewFitWorks, R.layout.sug_item_sport_all_course_list, this.f9235a, this.e, this.mDataViewModel.b(), navigationB != null ? navigationB.getName() : "", this.f9236b);
    }

    @Override // com.huawei.health.suggestion.ui.polymericpage.view.PolymericDataFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        btq.e().d(this.d, "CUSTOM_COURSE_UPDATE");
        this.d = null;
        ObserverManagerUtil.a("PLAN_CONFIRM_VISIBILITY");
    }
}

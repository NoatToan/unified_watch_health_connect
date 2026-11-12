package com.huawei.health.suggestion.ui.fragment;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;
import androidx.appcompat.widget.SearchView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.huawei.health.suggestion.R;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.ui.commonui.searchview.HealthSearchView;
import defpackage.qrs;

/* JADX INFO: loaded from: classes31.dex */
public class FitnessSearchFragmentBar extends Fragment implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ImageView f9543a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private OnQueryTextListener f9544b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private View f9545c;
    private Context d;
    private HealthSearchView e;

    public interface OnQueryTextListener {
        boolean onQueryTextChange(String str);

        boolean onQueryTextSubmit(String str);
    }

    @Override // android.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // android.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(R.layout.sug_fragment_fit_search_bar, viewGroup, false);
        if (getActivity() != null) {
            this.d = getActivity().getApplicationContext();
        }
        c(viewInflate);
        e();
        return viewInflate;
    }

    private void c(View view) {
        this.f9545c = view.findViewById(R.id.statusbar_panel);
        HealthSearchView healthSearchView = (HealthSearchView) view.findViewById(R.id.course_search_view);
        this.e = healthSearchView;
        qrs.d(healthSearchView, R.id.hwsearchview_search_src_icon, R.drawable.search_bar_icon);
        if (this.d == null) {
            return;
        }
        ImageView imageView = (ImageView) this.e.findViewById(com.huawei.ui.commonui.R.id.hwsearchview_back_button);
        this.f9543a = imageView;
        imageView.setOnClickListener(this);
        c();
    }

    private void e() {
        this.e.setOnQueryTextListener(new SearchView.OnQueryTextListener() { // from class: com.huawei.health.suggestion.ui.fragment.FitnessSearchFragmentBar.4
            @Override // androidx.appcompat.widget.SearchView.OnQueryTextListener
            public boolean onQueryTextSubmit(String str) {
                FitnessSearchFragmentBar.this.a();
                FitnessSearchFragmentBar.this.f9544b.onQueryTextSubmit(str);
                return false;
            }

            @Override // androidx.appcompat.widget.SearchView.OnQueryTextListener
            public boolean onQueryTextChange(String str) {
                if (FitnessSearchFragmentBar.this.f9544b != null) {
                    return FitnessSearchFragmentBar.this.f9544b.onQueryTextChange(str);
                }
                return false;
            }
        });
        this.e.setFocusable(true);
        this.e.setFocusableInTouchMode(true);
    }

    @Override // android.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        c();
    }

    @Override // android.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        HealthSearchView healthSearchView = this.e;
        if (healthSearchView != null) {
            healthSearchView.setOnQueryTextListener(null);
        }
        if (this.f9544b != null) {
            this.f9544b = null;
        }
    }

    private void c() {
        ConstraintLayout.LayoutParams layoutParamsB = b(this.d);
        View view = this.f9545c;
        if (view != null) {
            view.setLayoutParams(layoutParamsB);
        }
    }

    public static ConstraintLayout.LayoutParams b(Context context) {
        int iS = qrs.s(context);
        ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(-1, iS);
        Activity activity = BaseApplication.getActivity();
        if (context instanceof Activity) {
            activity = (Activity) context;
        }
        if (activity != null) {
            boolean zIsInMultiWindowMode = activity.isInMultiWindowMode();
            boolean zB = qrs.b(activity);
            if (zIsInMultiWindowMode && zB) {
                layoutParams.topMargin = -iS;
            }
        }
        return layoutParams;
    }

    public void d() {
        this.e.requestFocus();
    }

    @Override // android.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
    }

    public void b(View.OnClickListener onClickListener) {
        ImageView imageView = this.f9543a;
        if (imageView != null) {
            imageView.setOnClickListener(onClickListener);
        }
    }

    public void c(String str) {
        if (str != null) {
            a();
            this.f9544b.onQueryTextSubmit(str);
            this.e.setQuery(str, true);
        }
    }

    public void b(OnQueryTextListener onQueryTextListener) {
        this.f9544b = onQueryTextListener;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view == null || view.getId() != com.huawei.ui.commonui.R.id.hwsearchview_back_button || getActivity() == null) {
            return;
        }
        getActivity().finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        Object systemService = getActivity().getApplicationContext().getSystemService("input_method");
        if (systemService instanceof InputMethodManager) {
            ((InputMethodManager) systemService).hideSoftInputFromWindow(getActivity().getWindow().getDecorView().getWindowToken(), 0);
        }
    }

    public void b(String str) {
        this.e.setQueryHint(str);
    }
}

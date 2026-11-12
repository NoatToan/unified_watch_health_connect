package com.huawei.healthcloud.plugintrack.runningroute.data;

import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.widget.CheckedTextView;
import android.widget.LinearLayout;
import androidx.core.content.ContextCompat;
import com.huawei.healthcloud.plugintrack.R;
import com.huawei.healthcloud.plugintrack.runningroute.data.RouteSiteDistanceSortDialog;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.adapter.BaseRecyclerAdapter;
import com.huawei.ui.commonui.adapter.RecyclerHolder;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.dialog.CustomAlertDialog;
import com.huawei.ui.commonui.dialog.HealthButtonBarLayout;
import com.huawei.ui.commonui.recycleview.HealthLinearLayoutManager;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;
import defpackage.gcm;
import defpackage.gdp;
import defpackage.jcs;
import defpackage.jct;
import defpackage.njy;
import health.compact.a.UnitUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class RouteSiteDistanceSortDialog {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f10559a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private LinearLayout f10561c;
    private HealthRecycleView e;
    private int f;
    private int g;
    private HealthButton h;
    private CustomAlertDialog.Builder k;
    private CustomAlertDialog l;
    private HealthRecycleView m;
    private View n;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<c> f10560b = new ArrayList();
    private final List<c> i = new ArrayList();
    private final e d = new e();
    private final e j = new e();

    public interface OnDialogClickListener {
        void onDialogClick(jct jctVar);
    }

    public RouteSiteDistanceSortDialog(Context context) {
        this.f10559a = context;
        this.n = View.inflate(context, R.layout.dialog_path_type_sort, null);
        this.k = new CustomAlertDialog.Builder(context).a(this.n);
        this.f10561c = (LinearLayout) this.n.findViewById(R.id.distance_layout);
        this.m = (HealthRecycleView) this.n.findViewById(R.id.pathType_recycle);
        this.e = (HealthRecycleView) this.n.findViewById(R.id.distance_recycle);
        CustomAlertDialog customAlertDialogB = this.k.b();
        this.l = customAlertDialogB;
        customAlertDialogB.setCancelable(false);
        ((HealthButtonBarLayout) this.l.findViewById(R.id.button_bar)).setDividerDrawable(ContextCompat.getDrawable(this.f10559a, R.drawable.custom_dialog_divider_vertical));
        this.h = (HealthButton) this.l.findViewById(R.id.dialog_btn_negative);
    }

    private void d(jct jctVar, OnDialogClickListener onDialogClickListener) {
        a(jctVar);
        e(jctVar);
        b(jctVar, onDialogClickListener);
        a(jctVar, onDialogClickListener);
    }

    private void b(final jct jctVar, final OnDialogClickListener onDialogClickListener) {
        this.k.d(R.string.IDS_contact_confirm, new DialogInterface.OnClickListener() { // from class: jcy
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                this.f38391b.b(jctVar, onDialogClickListener, dialogInterface, i);
            }
        }).a(R.string.IDS_track_runing_route_restore_default, new DialogInterface.OnClickListener() { // from class: jcx
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                RouteSiteDistanceSortDialog.a(onDialogClickListener, jctVar, dialogInterface, i);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(jct jctVar, OnDialogClickListener onDialogClickListener, DialogInterface dialogInterface, int i) {
        LogUtil.a("RouteSiteDistanceSortDialog", "showFeedBackDialog click cancel");
        jctVar.a(this.f);
        jctVar.e(this.g);
        onDialogClickListener.onDialogClick(jctVar);
    }

    public static /* synthetic */ void a(OnDialogClickListener onDialogClickListener, jct jctVar, DialogInterface dialogInterface, int i) {
        LogUtil.a("RouteSiteDistanceSortDialog", "showFeedBackDialog click cancel");
        onDialogClickListener.onDialogClick(jctVar);
    }

    private void a(final jct jctVar, final OnDialogClickListener onDialogClickListener) {
        this.h.setTextColor(BaseApplication.getContext().getResources().getColor(R.color.common_colorAccent_disabled, null));
        this.h.setOnClickListener(new View.OnClickListener() { // from class: jcz
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f38393c.c(jctVar, onDialogClickListener, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(jct jctVar, OnDialogClickListener onDialogClickListener, View view) {
        LogUtil.a("RouteSiteDistanceSortDialog", "initTypeSortItems click agree");
        if (this.h.getCurrentTextColor() == BaseApplication.getContext().getColor(R.color.health_commonui_healthbutton_text_normal)) {
            b(0);
            d(0);
            this.j.e(this.i);
            this.d.e(this.f10560b);
            jctVar.a(0);
            jctVar.e(0);
            this.l.dismiss();
        }
        onDialogClickListener.onDialogClick(jctVar);
    }

    public void e(jct jctVar, OnDialogClickListener onDialogClickListener) {
        if (jctVar == null || jctVar.b() == null || onDialogClickListener == null) {
            ReleaseLogUtil.e("RouteSiteDistanceSortDialog", "routeInfo or listener is null");
            return;
        }
        d(jctVar, onDialogClickListener);
        if (!a()) {
            this.h.setTextColor(BaseApplication.getContext().getResources().getColor(R.color.health_commonui_healthbutton_text_normal, null));
        } else {
            this.h.setTextColor(BaseApplication.getContext().getResources().getColor(R.color.common_colorAccent_disabled, null));
        }
        if (this.l.isShowing()) {
            return;
        }
        this.l.show();
        this.l.setCanceledOnTouchOutside(true);
    }

    private boolean a() {
        return this.f == 0 && this.g == 0;
    }

    private void a(jct jctVar) {
        if (UnitUtil.f()) {
            LogUtil.j("RouteSiteDistanceSortDialog", "ImperialUnit, hide distance");
            this.f10561c.setVisibility(8);
            this.e.setVisibility(8);
            return;
        }
        gcm gcmVarB = jctVar.b();
        this.f = jctVar.e();
        if (gcmVarB == null || njy.e(gcmVarB.c())) {
            LogUtil.e("RouteSiteDistanceSortDialog", "DistanceTypes is empty");
            return;
        }
        this.f10560b.clear();
        List<gdp> listC = gcmVarB.c();
        listC.sort(Comparator.comparingInt(new jcs()));
        for (gdp gdpVar : listC) {
            this.f10560b.add(new c(gdpVar, gdpVar.b() == this.f));
        }
        this.d.setOnItemClickListener(new BaseRecyclerAdapter.OnItemClickListener() { // from class: jcw
            @Override // com.huawei.ui.commonui.adapter.BaseRecyclerAdapter.OnItemClickListener
            public final void onItemClicked(RecyclerHolder recyclerHolder, int i, Object obj) {
                this.d.c(recyclerHolder, i, (RouteSiteDistanceSortDialog.c) obj);
            }
        });
        this.e.setAdapter(this.d);
        this.e.setLayoutManager(new HealthLinearLayoutManager(this.f10559a));
        this.d.e(this.f10560b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(RecyclerHolder recyclerHolder, int i, c cVar) {
        int iB = cVar.d().b();
        LogUtil.a("RouteSiteDistanceSortDialog", "item click with position: ", Integer.valueOf(i), " Id: ", Integer.valueOf(iB));
        if (this.f == iB) {
            return;
        }
        b(iB);
        e();
        this.d.e(this.f10560b);
    }

    private void e(jct jctVar) {
        gcm gcmVarB = jctVar.b();
        this.g = jctVar.a();
        if (gcmVarB == null || njy.e(gcmVarB.b())) {
            return;
        }
        this.i.clear();
        List<gdp> listB = gcmVarB.b();
        listB.sort(Comparator.comparingInt(new jcs()));
        for (gdp gdpVar : listB) {
            this.i.add(new c(gdpVar, gdpVar.b() == this.g));
        }
        this.j.setOnItemClickListener(new BaseRecyclerAdapter.OnItemClickListener() { // from class: jcu
            @Override // com.huawei.ui.commonui.adapter.BaseRecyclerAdapter.OnItemClickListener
            public final void onItemClicked(RecyclerHolder recyclerHolder, int i, Object obj) {
                this.e.e(recyclerHolder, i, (RouteSiteDistanceSortDialog.c) obj);
            }
        });
        this.m.setAdapter(this.j);
        this.m.setLayoutManager(new HealthLinearLayoutManager(this.f10559a));
        this.j.e(this.i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e(RecyclerHolder recyclerHolder, int i, c cVar) {
        int iB = cVar.d().b();
        LogUtil.a("RouteSiteDistanceSortDialog", "item click with position: ", Integer.valueOf(i), " Id: ", Integer.valueOf(iB));
        if (this.g == iB) {
            return;
        }
        d(iB);
        e();
        this.j.e(this.i);
    }

    public void b(int i) {
        this.f = i;
        for (c cVar : this.f10560b) {
            cVar.a(cVar.d().b() == this.f);
        }
    }

    public void d(int i) {
        this.g = i;
        for (c cVar : this.i) {
            cVar.a(cVar.d().b() == this.g);
        }
    }

    private void e() {
        if (a()) {
            this.h.setTextColor(BaseApplication.getContext().getColor(R.color.common_colorAccent_disabled));
        } else {
            this.h.setTextColor(BaseApplication.getContext().getColor(R.color.health_commonui_healthbutton_text_normal));
        }
    }

    static class e extends BaseRecyclerAdapter<c> {
        private List<c> d;

        e() {
            super(new ArrayList(), R.layout.dialog_path_type_sort_item);
            this.d = new ArrayList();
        }

        @Override // com.huawei.ui.commonui.adapter.BaseRecyclerAdapter
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void convert(RecyclerHolder recyclerHolder, int i, c cVar) {
            if (recyclerHolder == null || cVar == null || cVar.d() == null) {
                ReleaseLogUtil.e("RouteSiteDistanceSortDialog", "convert holder ", recyclerHolder, " itemData ", cVar, " position ", Integer.valueOf(i));
                return;
            }
            if (i == this.d.size() - 1) {
                recyclerHolder.e(R.id.item_divider, 8);
            } else {
                recyclerHolder.e(R.id.item_divider, 0);
            }
            CheckedTextView checkedTextView = (CheckedTextView) recyclerHolder.d(R.id.item_divider_checked_textview);
            if (checkedTextView != null) {
                checkedTextView.setText(cVar.d().d());
                checkedTextView.setChecked(cVar.b());
            }
        }

        public void e(List<c> list) {
            this.d = list;
            refreshDataChange(list);
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final gdp f10562a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f10563b;

        c(gdp gdpVar, boolean z) {
            this.f10562a = gdpVar;
            this.f10563b = z;
        }

        public gdp d() {
            return this.f10562a;
        }

        public boolean b() {
            return this.f10563b;
        }

        public void a(boolean z) {
            this.f10563b = z;
        }
    }
}

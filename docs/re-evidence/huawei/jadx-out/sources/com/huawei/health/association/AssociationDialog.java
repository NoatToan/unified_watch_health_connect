package com.huawei.health.association;

import android.content.Context;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.StyleSpan;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AlertDialog;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.gson.reflect.TypeToken;
import com.huawei.health.plan.association.SportEventAssociator;
import com.huawei.health.servicesui.R;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.HwExerciseConstants;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.recycleview.RecyclerItemDecoration;
import defpackage.ggm;
import defpackage.gnf;
import defpackage.lsb;
import defpackage.lua;
import defpackage.njy;
import defpackage.qre;
import defpackage.qri;
import health.compact.a.UnitUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import health.compact.a.utils.StringUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes6.dex */
public class AssociationDialog extends AlertDialog implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private AssociatorListAdapter f6191a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f6192b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private SportEventAssociator.c f6193c;
    private int d;
    private boolean e;
    private List<SportEventAssociator.c> f;
    private HealthButton g;
    private HealthButton h;
    private SportEventAssociator.Callback i;
    private Context j;
    private OnClickCallBack k;
    private RecyclerView l;
    private int m;
    private TextView n;
    private SportEventAssociator o;
    private HealthTextView p;

    public void a(boolean z) {
        this.e = z;
    }

    public SportEventAssociator.c d() {
        return this.f6193c;
    }

    public void c(SportEventAssociator.Callback callback) {
        this.i = callback;
    }

    public AssociationDialog(Context context, List<SportEventAssociator.c> list) {
        super(context, R.style.AssociationDialogStyle);
        this.d = -1;
        this.e = false;
        this.i = new SportEventAssociator.Callback() { // from class: com.huawei.health.association.AssociationDialog.5
            @Override // com.huawei.health.plan.association.SportEventAssociator.Callback
            public void onResult(int i, String str) {
                ReleaseLogUtil.a("R_AssociationDialog", "IassociatorCallback errCode:", Integer.valueOf(i));
            }
        };
        this.k = new OnClickCallBack() { // from class: com.huawei.health.association.AssociationDialog.1
            @Override // com.huawei.health.association.OnClickCallBack
            public void onClick(int i, int i2, int i3) {
                ReleaseLogUtil.d("R_AssociationDialog", "currentRecord is", Integer.valueOf(i), "  selectedPosition is ", Integer.valueOf(i3), "  clickposition is ", Integer.valueOf(i2));
                AssociationDialog.this.d = i3;
                if (i3 != -1) {
                    AssociationDialog.this.h.setEnabled(true);
                    AssociationDialog.this.h.setBackgroundResource(R.drawable.association_button_background_emphasize);
                } else {
                    AssociationDialog.this.h.setEnabled(false);
                    AssociationDialog.this.h.setBackgroundResource(R.drawable.button_background_emphasize_disable);
                }
            }
        };
        this.j = context;
        this.f = njy.e(list) ? Collections.EMPTY_LIST : list;
    }

    @Override // androidx.appcompat.app.AlertDialog, androidx.appcompat.app.AppCompatDialog, androidx.activity.ComponentDialog, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.dialog_association_layout);
        setCancelable(false);
        setCanceledOnTouchOutside(false);
        e();
        lsb.d().e(376833395);
    }

    private void e() {
        ImageView imageView = (ImageView) findViewById(R.id.ivClose);
        this.p = (HealthTextView) findViewById(R.id.tvPageNum);
        this.n = (TextView) findViewById(R.id.tvContent);
        this.h = (HealthButton) findViewById(R.id.association_button);
        this.g = (HealthButton) findViewById(R.id.ignore_button);
        this.h.setOnClickListener(this);
        this.g.setOnClickListener(this);
        this.h.setEnabled(false);
        this.h.setBackgroundResource(R.drawable.button_background_emphasize_disable);
        int size = this.f.size();
        this.m = size;
        if (size > 1) {
            this.h.setText(this.j.getString(R.string.IDS_association_sure));
            this.g.setVisibility(0);
        } else if (size == 1) {
            this.h.setText(this.j.getString(R.string.IDS_association_single_sure));
            this.g.setVisibility(8);
        }
        imageView.setOnClickListener(new View.OnClickListener() { // from class: ddf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f31667c.e(view);
            }
        });
        this.f6193c = null;
        d(this.f.get(0));
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.event_recycleView);
        this.l = recyclerView;
        b(this.j, recyclerView, 0, this.f.get(0).b(), this.k);
        a(1, this.m);
        this.o = new SportEventAssociator(this.j);
    }

    public /* synthetic */ void e(View view) {
        if (!this.e) {
            c();
        }
        dismiss();
    }

    private void d(SportEventAssociator.c cVar) {
        int i;
        if (cVar != null) {
            try {
                if (cVar.e() != null) {
                    ggm ggmVarE = cVar.e();
                    String strA = UnitUtil.a(new Date(ggmVarE.b()), 20);
                    double dE = ((double) ggmVarE.e()) / 1000.0d;
                    boolean zF = UnitUtil.f();
                    if (zF) {
                        i = R.plurals.IDS_association_record_distance_mi;
                    } else {
                        i = R.plurals.IDS_association_record_distance_km;
                    }
                    if (zF) {
                        dE = UnitUtil.e(dE, 3);
                    }
                    String strE = qre.e(i, UnitUtil.b(dE, Locale.getDefault()), UnitUtil.e(dE, 1, 2));
                    SpannableString spannableString = new SpannableString(this.j.getResources().getString(R.string.IDS_association_event_content, strA, strE));
                    qri.a(spannableString, strA, new StyleSpan(1));
                    qri.a(spannableString, strE, new StyleSpan(1));
                    this.n.setText(spannableString);
                    return;
                }
            } catch (Exception e) {
                ReleaseLogUtil.a("R_AssociationDialog", "updateTvContent fail:", e);
                this.n.setText("");
                return;
            }
        }
        ReleaseLogUtil.e("R_AssociationDialog", "parameter is unavailable");
    }

    private void a(int i, int i2) {
        String strE = UnitUtil.e(i, 1, 0);
        SpannableString spannableString = new SpannableString(qre.a(R.string.IDS_record_page_num, strE, UnitUtil.e(i2, 1, 0)));
        qri.a(spannableString, strE, new StyleSpan(1));
        this.p.setText(spannableString);
    }

    @Override // android.app.Dialog
    public void show() {
        super.show();
        Window window = getWindow();
        if (window == null) {
            return;
        }
        window.setGravity(80);
        window.setLayout(-1, -2);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (!a()) {
            ReleaseLogUtil.a("R_AssociationDialog", "Invalid data or index");
            return;
        }
        if (id == R.id.association_button) {
            b();
            i();
        } else if (id == R.id.ignore_button) {
            SportEventAssociator.c cVar = this.f.get(this.f6192b);
            ArrayList arrayList = new ArrayList();
            arrayList.add(cVar);
            e(arrayList);
            i();
        }
    }

    private boolean a() {
        int i;
        return !this.f.isEmpty() && (i = this.f6192b) >= 0 && i < this.f.size();
    }

    private void c() {
        ReleaseLogUtil.d("R_AssociationDialog", "enter handleIgnoreAllLogic");
        lua.c("ignore_related_records", "ignore_related_records", HiJsonUtil.d(d(HwExerciseConstants.MATCHED_COMPETITION)), null);
        lua.d(HwExerciseConstants.MATCHED_COMPETITION, HwExerciseConstants.MATCHED_COMPETITION);
    }

    private void e(List<SportEventAssociator.c> list) {
        ReleaseLogUtil.d("R_AssociationDialog", "enter handleIgnoreLogic");
        this.o.d("ignore_related_records", list);
        this.o.d(HwExerciseConstants.MATCHED_COMPETITION, d(HwExerciseConstants.MATCHED_COMPETITION));
    }

    private List<SportEventAssociator.c> d(String str) {
        String strH = lua.h(str, str);
        if (StringUtils.g(strH)) {
            return Collections.EMPTY_LIST;
        }
        return (List) HiJsonUtil.a(strH, new TypeToken<List<SportEventAssociator.c>>() { // from class: com.huawei.health.association.AssociationDialog.3
        }.getType());
    }

    private SportEventAssociator.c g() {
        int i;
        int i2;
        List<SportEventAssociator.c> list = this.f;
        if (list == null || (i = this.f6192b) < 0 || i >= list.size()) {
            ReleaseLogUtil.e("R_AssociationDialog", "selectAssociationResult Invalid data or index ");
            return null;
        }
        SportEventAssociator.c cVar = this.f.get(this.f6192b);
        if (cVar == null) {
            ReleaseLogUtil.e("R_AssociationDialog", "selectAssociationResult item is null");
            return null;
        }
        ggm ggmVarE = cVar.e();
        List<gnf.e> listB = cVar.b();
        if (ggmVarE == null || listB == null || (i2 = this.d) < 0 || i2 >= listB.size()) {
            ReleaseLogUtil.e("R_AssociationDialog", "selectAssociationResult Invalid data or index other");
            return null;
        }
        gnf.e eVar = listB.get(this.d);
        ArrayList arrayList = new ArrayList();
        arrayList.add(eVar);
        return new SportEventAssociator.c(ggmVarE, arrayList);
    }

    private void b() {
        ReleaseLogUtil.d("R_AssociationDialog", "enter handleAssociationLogic");
        this.f6193c = g();
        ArrayList arrayList = new ArrayList();
        SportEventAssociator.c cVar = this.f6193c;
        if (cVar != null) {
            arrayList.add(cVar);
        }
        String strH = lua.h(HwExerciseConstants.MATCHED_COMPETITION, HwExerciseConstants.MATCHED_COMPETITION);
        if (!StringUtils.g(strH)) {
            lua.c(HwExerciseConstants.MATCHED_COMPETITION, HwExerciseConstants.MATCHED_COMPETITION, HiJsonUtil.d(this.o.c((List<SportEventAssociator.c>) HiJsonUtil.a(strH, new TypeToken<List<SportEventAssociator.c>>() { // from class: com.huawei.health.association.AssociationDialog.4
            }.getType()), arrayList)), null);
        }
        this.o.a(this.f6193c, 227, this.i);
    }

    private void i() {
        int i = this.m;
        if (i <= 1 || this.f6192b >= i - 1) {
            dismiss();
            return;
        }
        this.h.setEnabled(false);
        this.h.setBackgroundResource(R.drawable.button_background_emphasize_disable);
        int i2 = this.f6192b + 1;
        this.f6192b = i2;
        if (i2 == this.m - 1) {
            this.h.setText(this.j.getString(R.string.IDS_association_single_sure));
        }
        this.f6191a.d(-1);
        this.f6191a.e(this.f6192b);
        this.f6191a.b(this.f.get(this.f6192b).b());
        d(this.f.get(this.f6192b));
        a(this.f6192b + 1, this.m);
    }

    private void b(Context context, RecyclerView recyclerView, int i, List<gnf.e> list, OnClickCallBack onClickCallBack) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(0);
        arrayList.add(0);
        arrayList.add(0);
        arrayList.add(0);
        recyclerView.addItemDecoration(new RecyclerItemDecoration(qre.b(R.dimen.hw_show_public_size_0), qre.b(R.dimen.hw_show_public_size_12), arrayList));
        recyclerView.setLayoutManager(new LinearLayoutManager(context, 1, false));
        ReleaseLogUtil.d("R_AssociationDialog", "initRecycleview competitions isEmpty? ", Boolean.valueOf(njy.e(list)));
        AssociatorListAdapter associatorListAdapter = new AssociatorListAdapter(context, i, list);
        this.f6191a = associatorListAdapter;
        associatorListAdapter.a(onClickCallBack);
        recyclerView.setAdapter(this.f6191a);
    }
}

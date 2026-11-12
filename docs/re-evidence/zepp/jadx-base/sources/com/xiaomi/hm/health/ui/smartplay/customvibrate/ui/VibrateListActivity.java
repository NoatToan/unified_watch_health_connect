package com.xiaomi.hm.health.ui.smartplay.customvibrate.ui;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.android.design.dialog.BaseDialogFragment;
import com.huami.android.design.dialog.loading.LoadingDialog;
import com.huami.lib.view.ViewUtils;
import com.huami.tools.log.HMLog;
import com.huami.view.basetitle.BaseTitleActivity;
import com.huami.watch.hmwatchmanager.R;
import com.huami.widget.toast.IconToast;
import com.xiaomi.hm.health.bt.device.HMCallback;
import com.xiaomi.hm.health.ui.BLEStatueListenerAdapter;
import com.xiaomi.hm.health.ui.BTStatusFragment;
import com.xiaomi.hm.health.ui.UnifyTitleBarStyle;
import com.xiaomi.hm.health.ui.smartplay.customvibrate.VibrateHelperKt;
import com.xiaomi.hm.health.ui.smartplay.customvibrate.device.VibrateSyncUtils;
import com.xiaomi.hm.health.ui.smartplay.customvibrate.model.VibrateEntity;
import com.xiaomi.hm.health.ui.smartplay.customvibrate.model.VibrateRepo;
import com.xiaomi.hm.health.ui.smartplay.customvibrate.model.VibrateType;
import com.xiaomi.hm.health.ui.smartplay.customvibrate.ui.VibrateListActivity;
import com.xiaomi.hm.health.utils.CincoAnalytics;
import com.xiaomi.hm.health.utils.Utils;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function0;
import rx.Observable;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action0;
import rx.functions.Action1;
import rx.functions.Func1;
import rx.schedulers.Schedulers;

/* JADX INFO: loaded from: classes22.dex */
public class VibrateListActivity extends BaseTitleActivity {
    private static final String J = "VibrateListActivity";
    private static final int K = 300;
    private static final String L = "type";
    private static final int M = 1;
    private static final int N = 6;
    private TextView A;
    private TextView B;
    private VibrateType C;
    private SingleSelectView D;
    private SingleSelectView E;
    private VibrateAdapter F;
    private LoadingDialog G;
    private VibrateRepo H;
    private long I;
    private RecyclerView x;
    private TextView y;
    private TextView z;

    public class VibrateAdapter extends RecyclerView.Adapter<d> {
        public int a = -1;
        private SingleSelectView.c b = SingleSelectView.c.NORMAL;
        private int c = 0;
        public d d;

        public class a extends HMCallback {
            public final /* synthetic */ List a;
            public final /* synthetic */ int b;

            public a(final List val$entities, final int val$adapterPosition) {
                this.a = val$entities;
                this.b = val$adapterPosition;
            }

            @Override // com.xiaomi.hm.health.bt.device.HMCallback
            public void onFinish(boolean ret) {
                VibrateEntity vibrateEntity = (VibrateEntity) this.a.get(this.b);
                HMLog.i(VibrateListActivity.J, "fromList, setToDevice: id: " + ((int) vibrateEntity.id) + ", name: " + vibrateEntity.name + ", ret: " + ret, new Object[0]);
            }
        }

        public VibrateAdapter() {
        }

        @SuppressLint({"NotifyDataSetChanged"})
        private void A(final VibrateEntity entity) {
            EditVibrateNameDialog editVibrateNameDialogNewInstance = EditVibrateNameDialog.newInstance();
            Bundle bundle = new Bundle();
            bundle.putString("name", entity.name);
            editVibrateNameDialogNewInstance.setArguments(bundle);
            editVibrateNameDialogNewInstance.setNameChangedListener(new EditVibrateNameDialog.INameChangedListener() { // from class: l98
                @Override // com.xiaomi.hm.health.ui.smartplay.customvibrate.ui.EditVibrateNameDialog.INameChangedListener
                public final void onDisplayNameChanged(BaseDialogFragment baseDialogFragment, String str) {
                    this.a.y(entity, baseDialogFragment, str);
                }
            });
            editVibrateNameDialogNewInstance.show(VibrateListActivity.this.getSupportFragmentManager());
        }

        private void B(final int position) {
            new AlertDialogFragment.Builder(VibrateListActivity.this).setCancelable(false).setMessage(R.string.custom_vibrate_used_by_other).setNegativeButton(R.string.cancel, (DialogInterface.OnClickListener) null).setPositiveButton(R.string.confirm, new DialogInterface.OnClickListener() { // from class: k98
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    this.a.z(position, dialogInterface, i);
                }
            }).show(VibrateListActivity.this.getSupportFragmentManager());
        }

        @SuppressLint({"NotifyDataSetChanged"})
        private void n(final int position) {
            if (position >= VibrateListActivity.this.H.getVibrateEntities().size()) {
                return;
            }
            final VibrateEntity vibrateEntity = VibrateListActivity.this.H.getVibrateEntities().get(position);
            VibrateSyncUtils.deleteVibrateToDevice(vibrateEntity).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).doOnSubscribe(new Action0() { // from class: n98
                @Override // rx.functions.Action0
                public final void call() {
                    this.a.q();
                }
            }).subscribe(new Action1() { // from class: p98
                @Override // rx.functions.Action1
                public final void call(Object obj) {
                    this.a.o(vibrateEntity, position, (Boolean) obj);
                }
            }, new Action1() { // from class: o98
                @Override // rx.functions.Action1
                public final void call(Object obj) {
                    this.a.p((Throwable) obj);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void o(VibrateEntity vibrateEntity, int i, Boolean bool) {
            if (!bool.booleanValue()) {
                VibrateListActivity.this.G.setFailed(VibrateListActivity.this.getString(R.string.alarm_delete_failed));
                return;
            }
            VibrateListActivity.this.H.deleteEntity(vibrateEntity);
            VibrateListActivity.this.G.dismiss();
            if (this.a == i) {
                this.a = -1;
                VibrateListActivity.this.D.setItemSelected(true);
            }
            notifyDataSetChanged();
            VibrateListActivity.this.G();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void p(Throwable th) {
            VibrateListActivity.this.G.setFailed(VibrateListActivity.this.getString(R.string.alarm_delete_failed));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void q() {
            VibrateListActivity vibrateListActivity = VibrateListActivity.this;
            vibrateListActivity.F(vibrateListActivity.getString(R.string.delete_alarm));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void r(List list, int i, d dVar, SingleSelectView singleSelectView, View view) {
            SingleSelectView.c cVar = this.b;
            if (cVar == SingleSelectView.c.EDIT || cVar == SingleSelectView.c.NORMAL_2_EDIT) {
                A((VibrateEntity) list.get(i));
                return;
            }
            int adapterPosition = dVar.getAdapterPosition();
            if (this.a == adapterPosition) {
                return;
            }
            VibrateListActivity.this.D.setItemSelected(false);
            if (VibrateListActivity.this.z()) {
                VibrateListActivity.this.E.setItemSelected(false);
            }
            m();
            this.a = adapterPosition;
            singleSelectView.setItemSelected(true);
            this.d = dVar;
            VibrateListActivity.this.H.setSelectedId(VibrateListActivity.this.C, VibrateListActivity.this.H.getVibrateEntities().get(adapterPosition).id);
            VibrateListActivity.this.H.save();
            VibrateSyncUtils.setCustomVibrateToDevice(VibrateListActivity.this.C, (VibrateEntity) list.get(adapterPosition), new a(list, adapterPosition));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void s(SingleSelectView.c cVar) {
            SingleSelectView.c cVar2 = this.b;
            if (cVar2 != cVar) {
                return;
            }
            int i = this.c + 1;
            this.c = i;
            if (SingleSelectView.c.NORMAL_2_EDIT == cVar2 && i >= 6) {
                this.b = SingleSelectView.c.EDIT;
                this.c = 0;
            } else {
                if (SingleSelectView.c.EDIT_2_NORMAL != cVar || i < 6) {
                    return;
                }
                this.b = SingleSelectView.c.NORMAL;
                this.c = 0;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ Boolean t(d dVar) {
            return Boolean.valueOf(dVar.getAdapterPosition() < VibrateListActivity.this.H.getVibrateEntities().size());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void u(d dVar) {
            int adapterPosition = dVar.getAdapterPosition();
            if (VibrateListActivity.this.H.isVibrateReferred(VibrateListActivity.this.H.getVibrateEntities().get(adapterPosition).id)) {
                B(adapterPosition);
            } else {
                n(adapterPosition);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String v() {
            return "";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void w(Throwable th) {
            HMLog.error(VibrateListActivity.J, "", th, new Function0() { // from class: m98
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public final Object getA() {
                    return VibrateListActivity.VibrateAdapter.v();
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void x(d dVar, View view) {
            Observable.just(dVar).debounce(1L, TimeUnit.SECONDS).filter(new Func1() { // from class: com.xiaomi.hm.health.ui.smartplay.customvibrate.ui.g
                @Override // rx.functions.Func1
                public final Object call(Object obj) {
                    return this.a.t((VibrateListActivity.d) obj);
                }
            }).subscribeOn(AndroidSchedulers.mainThread()).subscribe(new Action1() { // from class: com.xiaomi.hm.health.ui.smartplay.customvibrate.ui.f
                @Override // rx.functions.Action1
                public final void call(Object obj) {
                    this.a.u((VibrateListActivity.d) obj);
                }
            }, new Action1() { // from class: q98
                @Override // rx.functions.Action1
                public final void call(Object obj) {
                    VibrateListActivity.VibrateAdapter.w((Throwable) obj);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void y(VibrateEntity vibrateEntity, BaseDialogFragment baseDialogFragment, String str) {
            Utils.closeSoftInput(VibrateListActivity.this);
            baseDialogFragment.dismiss();
            if (TextUtils.equals(str, vibrateEntity.name)) {
                return;
            }
            vibrateEntity.name = VibrateRepo.getInstance().getValidName(str);
            VibrateRepo.getInstance().save();
            notifyDataSetChanged();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void z(int i, DialogInterface dialogInterface, int i2) {
            dialogInterface.dismiss();
            n(i);
        }

        @SuppressLint({"NotifyDataSetChanged"})
        public void C() {
            SingleSelectView.c cVar;
            this.c = 0;
            SingleSelectView.c cVar2 = SingleSelectView.c.NORMAL;
            SingleSelectView.c cVar3 = this.b;
            if (cVar2 == cVar3 || (cVar = SingleSelectView.c.EDIT_2_NORMAL) == cVar3) {
                this.b = SingleSelectView.c.NORMAL_2_EDIT;
            } else if (SingleSelectView.c.EDIT == cVar3 || SingleSelectView.c.NORMAL_2_EDIT == cVar3) {
                this.b = cVar;
            }
            notifyDataSetChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: getItemCount */
        public int getA() {
            return VibrateListActivity.this.H.getVibrateEntities().size();
        }

        public SingleSelectView.c getState() {
            return this.b;
        }

        public void m() {
            this.a = -1;
            d dVar = this.d;
            if (dVar == null) {
                return;
            }
            ((SingleSelectView) dVar.itemView).setItemSelected(false);
        }

        @SuppressLint({"NotifyDataSetChanged"})
        public void setState(SingleSelectView.c state) {
            this.b = state;
            notifyDataSetChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onBindViewHolder(@NonNull final d holder, final int position) {
            if (position == this.a) {
                this.d = holder;
            }
            final List<VibrateEntity> vibrateEntities = VibrateListActivity.this.H.getVibrateEntities();
            final SingleSelectView singleSelectView = (SingleSelectView) holder.itemView;
            if (vibrateEntities.get(position).id == VibrateListActivity.this.H.getSelectedId(VibrateListActivity.this.C)) {
                this.a = holder.getAdapterPosition();
                this.d = holder;
                singleSelectView.setItemSelected(true);
            } else {
                singleSelectView.setItemSelected(false);
            }
            singleSelectView.setText(vibrateEntities.get(position).name);
            singleSelectView.setDividerVisibility(position == vibrateEntities.size() - 1 ? 2 : 1);
            singleSelectView.setOnClickListener(new View.OnClickListener() { // from class: com.xiaomi.hm.health.ui.smartplay.customvibrate.ui.d
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.a.r(vibrateEntities, position, holder, singleSelectView, view);
                }
            });
            singleSelectView.setStateWithAnim(this.b);
            singleSelectView.setAnimListener(new SingleSelectView.b() { // from class: com.xiaomi.hm.health.ui.smartplay.customvibrate.ui.e
                @Override // com.xiaomi.hm.health.ui.smartplay.customvibrate.ui.SingleSelectView.b
                public final void a(SingleSelectView.c cVar) {
                    this.a.s(cVar);
                }
            });
            singleSelectView.c.setOnClickListener(new View.OnClickListener() { // from class: com.xiaomi.hm.health.ui.smartplay.customvibrate.ui.c
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.a.x(holder, view);
                }
            });
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        @NonNull
        public d onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            SingleSelectView singleSelectView = new SingleSelectView(parent.getContext());
            singleSelectView.setLayoutParams(new ViewGroup.LayoutParams(-1, (int) ViewUtils.dp2px(parent.getContext(), 58.0f)));
            return new d(singleSelectView);
        }
    }

    public class a extends BLEStatueListenerAdapter {
        public final /* synthetic */ View a;

        public a(final View val$maskView) {
            this.a = val$maskView;
        }

        @Override // com.xiaomi.hm.health.ui.BLEStatueListenerAdapter, com.xiaomi.hm.health.ui.BTStatusFragment.BLEStatueListener
        public void onEnableChange(boolean enable) {
            this.a.setVisibility(enable ? 8 : 0);
        }
    }

    public class b extends HMCallback {
        public b() {
        }

        @Override // com.xiaomi.hm.health.bt.device.HMCallback
        public void onFinish(boolean ret) {
            HMLog.i(VibrateListActivity.J, "fromDefault 1, setToDevice, ret: " + ret, new Object[0]);
        }
    }

    public class c extends HMCallback {
        public c() {
        }

        @Override // com.xiaomi.hm.health.bt.device.HMCallback
        public void onFinish(boolean ret) {
            HMLog.i(VibrateListActivity.J, "fromDefault 2, setToDevice, ret: " + ret, new Object[0]);
        }
    }

    public static class d extends RecyclerView.ViewHolder {
        public d(View itemView) {
            super(itemView);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void A(View view) {
        if (System.currentTimeMillis() - this.I <= 300) {
            return;
        }
        this.I = System.currentTimeMillis();
        this.F.C();
        this.y.setVisibility(8);
        this.A.setVisibility(8);
        this.z.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void B(View view) {
        if (System.currentTimeMillis() - this.I <= 300) {
            return;
        }
        this.I = System.currentTimeMillis();
        this.F.C();
        this.z.setVisibility(8);
        this.y.setVisibility(0);
        this.A.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void C(View view) {
        if (this.H.getVibrateEntities().size() >= 50) {
            IconToast.showError(this, getString(R.string.custom_vibrate_full));
            return;
        }
        HMLog.i(J, "vibrate size before add new vibrate： " + this.H.getVibrateEntities().size(), new Object[0]);
        startActivityForResult(new Intent(this, (Class<?>) EditVibrateActivity.class), 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void D(View view) {
        if (this.D.itemSelected()) {
            return;
        }
        this.F.m();
        this.D.setItemSelected(true);
        if (z()) {
            this.E.setItemSelected(false);
        }
        this.H.setSelectedId(this.C, -1);
        this.H.save();
        VibrateSyncUtils.setDefaultVibrateToDevice(this.C, new b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void E(View view) {
        if (this.E.itemSelected()) {
            return;
        }
        this.F.m();
        this.D.setItemSelected(false);
        this.E.setItemSelected(true);
        this.H.setSelectedId(this.C, -2);
        this.H.save();
        VibrateSyncUtils.setFadeInVibrateToDevice(this.C, new c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void F(CharSequence msg) {
        if (this.G == null) {
            this.G = new LoadingDialog(this);
        }
        this.G.setMessage(msg);
        this.G.setCancelable(false);
        this.G.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void G() {
        if (this.H.getVibrateEntities().size() != 0) {
            this.x.setVisibility(0);
            this.B.setVisibility(8);
            this.y.setEnabled(true);
            return;
        }
        this.x.setVisibility(8);
        this.B.setVisibility(0);
        this.y.setEnabled(false);
        this.y.setVisibility(0);
        this.A.setVisibility(0);
        this.z.setVisibility(8);
        this.F.setState(SingleSelectView.c.NORMAL);
    }

    private void initViews() {
        this.B = (TextView) findViewById(R.id.empty_tv);
        this.D = (SingleSelectView) findViewById(R.id.default_vibrate_sv_1);
        this.E = (SingleSelectView) findViewById(R.id.default_vibrate_sv_2);
        this.y = (TextView) findViewById(R.id.edit_vibrate_tv);
        this.A = (TextView) findViewById(R.id.add_vibrate_tv);
        this.z = (TextView) findViewById(R.id.done_vibrate_tv);
        this.y.setOnClickListener(new View.OnClickListener() { // from class: f98
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.A(view);
            }
        });
        this.z.setOnClickListener(new View.OnClickListener() { // from class: g98
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.B(view);
            }
        });
        this.A.setOnClickListener(new View.OnClickListener() { // from class: i98
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.C(view);
            }
        });
        if (-1 == this.H.getSelectedId(this.C)) {
            this.D.setItemSelected(true);
        } else if (-2 == this.H.getSelectedId(this.C)) {
            this.E.setItemSelected(true);
        }
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.vibrate_list);
        this.x = recyclerView;
        VibrateAdapter vibrateAdapter = new VibrateAdapter();
        this.F = vibrateAdapter;
        recyclerView.setAdapter(vibrateAdapter);
        this.x.setLayoutManager(new LinearLayoutManager(this));
        this.D.setText(VibrateHelperKt.getDefaultVibrateDescription(this, this.C));
        this.D.setOnClickListener(new View.OnClickListener() { // from class: j98
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.D(view);
            }
        });
        if (!z()) {
            this.D.setDividerVisibility(0);
            return;
        }
        this.E.setVisibility(0);
        this.E.setText(R.string.custom_vibrate_mode_fade_in);
        this.E.setDividerVisibility(0);
        this.D.setDividerVisibility(1);
        this.E.setOnClickListener(new View.OnClickListener() { // from class: h98
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.E(view);
            }
        });
    }

    public static void launch(Context context, VibrateType vibrateType) {
        CincoAnalytics.cincoVibrateAnalytics((Activity) context);
        context.startActivity(new Intent(context, (Class<?>) VibrateListActivity.class).putExtra("type", vibrateType));
    }

    private void y() {
        BTStatusFragment.newInstance(R.id.container, getSupportFragmentManager()).setBLEStatusListener(new a(findViewById(R.id.mask_view)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean z() {
        return false;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, android.app.Activity
    @SuppressLint({"NotifyDataSetChanged"})
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (1 == requestCode && -1 == resultCode) {
            G();
            int size = this.H.getVibrateEntities().size();
            if (size > 0) {
                HMLog.i(J, "vibrate size after add new vibrate： " + size, new Object[0]);
                this.F.notifyDataSetChanged();
            }
        }
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        setTheme(2132017904);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vibrate_list);
        UnifyTitleBarStyle.setUnifyTitleStyle(this, getString(R.string.custom_vibrate_mode), (String) null);
        this.C = (VibrateType) getIntent().getSerializableExtra("type");
        this.H = VibrateRepo.getInstance();
        initViews();
        y();
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        G();
    }
}

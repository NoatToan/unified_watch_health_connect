package com.huami.watch.companion.intervalrun.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.huami.watch.companion.R;
import com.huami.watch.companion.intervalrun.model.IntervalTrainingInfo;
import com.huami.watch.companion.sync.SyncUtil;
import com.huami.watch.companion.tips.TipCenter;
import com.huami.watch.companion.ui.view.ActionbarLayout;
import com.huami.watch.companion.usersettings.UserSettings;
import com.huami.watch.companion.usersettings.UserSettingsKeys;
import com.huami.watch.hmwatchmanager.view.AlertDialogFragment;
import com.huami.watch.transport.DataTransportResult;
import com.huami.watch.transport.Transporter;
import com.huami.watch.util.DeviceCompatibility;
import com.huami.watch.util.Log;
import com.huami.watch.util.Rx;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public class IntervalTrainingActivity extends Activity {
    private static final int g = 1;
    private static final String h = "IntervalTrainingActivity";
    private TipCenter a;
    private TextView b;
    private View c;
    private RecyclerView d;
    private k e;
    private List<IntervalTrainingInfo> f = new ArrayList();

    public class a implements View.OnClickListener {
        public final /* synthetic */ AlertDialogFragment a;

        public a(AlertDialogFragment alertDialogFragment) {
            this.a = alertDialogFragment;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.a.dismissAllowingStateLoss();
        }
    }

    public class b extends TypeToken<List<IntervalTrainingInfo>> {
        public b() {
        }
    }

    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IntervalTrainingActivity.this.onBackPressed();
        }
    }

    public class d implements View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IntervalTrainingActivity.this.n();
        }
    }

    public class e implements View.OnClickListener {
        public e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IntervalTrainingActivity.this.startActivityForResult(new Intent(IntervalTrainingActivity.this.getApplicationContext(), (Class<?>) EditTrainingActivity.class), 1);
        }
    }

    public class f implements Transporter.DataSendResultCallback {

        public class a implements Runnable {
            public final /* synthetic */ int a;

            public a(int i) {
                this.a = i;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (this.a == 0) {
                    IntervalTrainingActivity.this.m();
                } else {
                    IntervalTrainingActivity.this.l();
                }
            }
        }

        public f() {
        }

        @Override // com.huami.watch.transport.Transporter.DataSendResultCallback
        public void onResultBack(DataTransportResult dataTransportResult) {
            Rx.mainThread(new a(dataTransportResult.getResultCode()));
        }
    }

    public class g implements View.OnClickListener {
        public g() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IntervalTrainingActivity.this.a.getSyncTip().hide();
        }
    }

    public class h implements View.OnClickListener {
        public h() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IntervalTrainingActivity.this.a.getSyncTip().hide();
            IntervalTrainingActivity.this.n();
        }
    }

    public class i implements View.OnClickListener {
        public i() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IntervalTrainingActivity.this.a.getSyncTip().hide();
        }
    }

    public class j implements View.OnClickListener {
        public final /* synthetic */ AlertDialogFragment a;
        public final /* synthetic */ int b;

        public j(AlertDialogFragment alertDialogFragment, int i) {
            this.a = alertDialogFragment;
            this.b = i;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.a.dismissAllowingStateLoss();
            IntervalTrainingActivity.this.h(this.b);
        }
    }

    public class k extends RecyclerView.Adapter<c> {

        public class a implements View.OnClickListener {
            public final /* synthetic */ int a;

            public a(int i) {
                this.a = i;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IntervalTrainingActivity.this.k(this.a);
            }
        }

        public class b implements View.OnClickListener {
            public final /* synthetic */ int a;

            public b(int i) {
                this.a = i;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Intent intent = new Intent(IntervalTrainingActivity.this, (Class<?>) EditTrainingActivity.class);
                intent.putExtra("index", this.a);
                IntervalTrainingActivity.this.startActivityForResult(intent, 1);
            }
        }

        public class c extends RecyclerView.ViewHolder {
            public TextView a;
            public ImageView b;
            public View c;

            public c(View view) {
                super(view);
                this.a = (TextView) view.findViewById(R.id.title);
                this.b = (ImageView) view.findViewById(R.id.delete_icon);
                this.c = view.findViewById(R.id.root_view);
            }
        }

        public k() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(c cVar, int i) {
            cVar.a.setText(((IntervalTrainingInfo) IntervalTrainingActivity.this.f.get(i)).getTitle());
            cVar.b.setOnClickListener(new a(i));
            cVar.c.setOnClickListener(new b(i));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public c onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new c(LayoutInflater.from(IntervalTrainingActivity.this.getApplicationContext()).inflate(R.layout.list_item_training_record, viewGroup, false));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: getItemCount */
        public int getFragmentsCount() {
            if (IntervalTrainingActivity.this.f != null) {
                return IntervalTrainingActivity.this.f.size();
            }
            return 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h(int i2) {
        List<IntervalTrainingInfo> list = this.f;
        if (list != null) {
            int size = list.size();
            if (i2 < size) {
                this.f.remove(i2);
                this.e.notifyDataSetChanged();
                if (size == 1) {
                    o();
                }
            }
            String json = new Gson().toJson(this.f);
            UserSettings.put(getContentResolver(), UserSettingsKeys.KEY_INTERVAL_RUN, json);
            SyncUtil.syncIntervalRunToWatch(getApplicationContext(), json);
        }
    }

    private void i() {
        String str = UserSettings.get(getContentResolver(), UserSettingsKeys.KEY_INTERVAL_RUN);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            this.f = (List) new Gson().fromJson(str, new b().getType());
        } catch (Exception e2) {
            Log.d(h, "parse training info error:" + e2.getMessage(), new Object[0]);
            this.f = new ArrayList();
        }
    }

    private void j() {
        this.a = TipCenter.create((FrameLayout) findViewById(R.id.container));
        this.d = (RecyclerView) findViewById(R.id.recycler_view);
        this.c = findViewById(R.id.empty_tips);
        this.b = (TextView) findViewById(R.id.sync);
        o();
        this.d.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(this, 1);
        dividerItemDecoration.setDrawable(ContextCompat.getDrawable(this, R.drawable.divider_line_item));
        this.d.addItemDecoration(dividerItemDecoration);
        ActionbarLayout actionbarLayout = (ActionbarLayout) findViewById(R.id.actionbar);
        actionbarLayout.setTitleText(getString(R.string.interval_training));
        actionbarLayout.setBackArrowClickListener(new c());
        this.b.setOnClickListener(new d());
        findViewById(R.id.add).setOnClickListener(new e());
        k kVar = new k();
        this.e = kVar;
        this.d.setAdapter(kVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k(int i2) {
        AlertDialogFragment alertDialogFragmentNewInstance = AlertDialogFragment.newInstance(7);
        alertDialogFragmentNewInstance.setMessage(getString(R.string.delete_tips));
        alertDialogFragmentNewInstance.setConfirm(getString(R.string.btn_enter), new j(alertDialogFragmentNewInstance, i2));
        alertDialogFragmentNewInstance.setCancel(getString(R.string.btn_cancel), new a(alertDialogFragmentNewInstance));
        alertDialogFragmentNewInstance.show(getFragmentManager(), "delete_confirm_dialog");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        this.a.getSyncTip().setAnimDuration(400L).setLeftImg(R.drawable.ic_tips_icon_upgrade_red).setRightImg(R.drawable.ic_tips_btn_close_n).setRightBottomImg(R.drawable.ic_tips_btn_retry_n).setTitle(R.string.training_sync_title).setInfo(R.string.sync_data_fail).setBgColor(R.color.tip_bg_sync_failed).setOnRightImgClickListener(new i()).setOnRightBottomImgClickListener(new h()).autoHide(false).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() {
        this.a.getSyncTip().setAnimDuration(400L).setLeftImg(R.drawable.ic_tips_icon_upgrade_green).setRightImg(R.drawable.ic_tips_btn_down_n).setTitle(R.string.training_sync_title).setInfo(R.string.sync_data_success).setBgColor(R.color.tip_bg_sync_success).setOnRightImgClickListener(new g()).autoHide(true).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n() {
        SyncUtil.syncIntervalRunToWatch(getApplicationContext(), new Gson().toJson(this.f), new f());
    }

    private void o() {
        List<IntervalTrainingInfo> list = this.f;
        if (list == null || list.isEmpty()) {
            this.c.setVisibility(0);
            this.b.setEnabled(false);
        } else {
            this.c.setVisibility(8);
            this.b.setEnabled(true);
        }
    }

    @Override // android.app.Activity
    public void onActivityResult(int i2, int i3, Intent intent) {
        if (i3 != -1 || this.e == null) {
            return;
        }
        i();
        o();
        this.e.notifyDataSetChanged();
    }

    @Override // android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_interval_training);
        DeviceCompatibility.setStatusBarDarkMode(this, true);
        i();
        j();
    }
}

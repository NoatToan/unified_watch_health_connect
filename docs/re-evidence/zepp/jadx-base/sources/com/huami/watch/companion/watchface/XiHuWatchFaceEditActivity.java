package com.huami.watch.companion.watchface;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import android.widget.Toast;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.huami.wallet.ui.decoration.DividerDecoration;
import com.huami.wallet.ui.decoration.SpacingDecoration;
import com.huami.wallet.ui.utils.ListUtils;
import com.huami.watch.companion.R;
import com.huami.watch.companion.ui.view.ActionbarLayout;
import com.huami.watch.companion.watchface.adapter.WatchFaceComponentAdapter;
import com.huami.watch.companion.watchface.adapter.WatchFaceStyleAdapter;
import com.huami.watch.companion.watchface.bean.WatchFaceBean;
import com.huami.watch.companion.watchface.bean.WatchFaceChildBean;
import com.huami.watch.companion.watchface.bean.WatchFaceOptionBean;
import com.huami.watch.companion.watchface.bean.WatchFaceStyle;
import com.huami.watch.companion.watchface.bean.WatchFaceWidget;
import com.huami.watch.companion.watchface.manager.BaseWatchFaceController;
import com.huami.watch.companion.watchface.utils.WatchFaceUtils;
import com.huami.watch.transport.DataTransportResult;
import com.huami.watch.transport.TransportDataItem;
import com.huami.watch.transport.Transporter;
import com.huami.watch.ui.dialog.AlertDialog;
import com.huami.watch.util.DensityUtil;
import com.huami.watch.util.Log;
import com.huami.watch.util.Rx;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public class XiHuWatchFaceEditActivity extends BaseWatchFaceActivity implements View.OnClickListener, BaseQuickAdapter.OnItemClickListener, WatchFaceComponentAdapter.OnClickWidgetListener {
    private static final String m = "XiHuWatchFaceEditActivity";
    private RecyclerView b;
    private FrameLayout c;
    private WatchFaceComponentAdapter d;
    private List<WatchFaceWidget> e;
    private boolean f = false;
    private RecyclerView g;
    private List<WatchFaceStyle> h;
    private WatchFaceStyleAdapter i;
    private WatchFaceBean j;
    private CheckBox k;
    private BaseWatchFaceController l;

    private void A() {
        View viewInflate = LayoutInflater.from(this).inflate(R.layout.footer_watch_face_edit_xihu, (ViewGroup) this.b, false);
        CheckBox checkBox = (CheckBox) viewInflate.findViewById(R.id.cb);
        this.k = checkBox;
        checkBox.setVisibility(this.j.getCurrent() == 1 ? 8 : 0);
        this.k.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: wx8
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                this.a.D(compoundButton, z);
            }
        });
        viewInflate.findViewById(R.id.btn_save).setOnClickListener(this);
        this.d.addFooterView(viewInflate);
    }

    private void B() {
        View viewInflate = LayoutInflater.from(this).inflate(R.layout.header_watch_face_edit_xihu, (ViewGroup) this.b, false);
        viewInflate.findViewById(R.id.tv_style).setVisibility(this.f ? 0 : 8);
        RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(R.id.recycle_view);
        this.g = recyclerView;
        recyclerView.setVisibility(this.f ? 0 : 8);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, 0, false);
        this.g.addItemDecoration(new SpacingDecoration((int) DensityUtil.dpToPx(this, 10.0f), 0, false));
        this.g.setLayoutManager(linearLayoutManager);
        WatchFaceStyleAdapter watchFaceStyleAdapter = new WatchFaceStyleAdapter(this.h);
        this.i = watchFaceStyleAdapter;
        this.g.setAdapter(watchFaceStyleAdapter);
        this.i.setOnItemClickListener(this);
        this.d.addHeaderView(viewInflate);
    }

    private void C() {
        this.b.setLayoutManager(new LinearLayoutManager(this));
        this.b.addItemDecoration(new DividerDecoration(ListUtils.getMiddleDividerStyle(this).setIgnorePosition(0)));
        WatchFaceComponentAdapter watchFaceComponentAdapter = new WatchFaceComponentAdapter(this.j.getId(), this.e);
        this.d = watchFaceComponentAdapter;
        watchFaceComponentAdapter.setOnClickWidgetListener(this);
        this.b.setAdapter(this.d);
        B();
        A();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void D(CompoundButton compoundButton, boolean z) {
        if (z) {
            this.d.setmEditModel(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void E() {
        List<WatchFaceWidget> list = this.e;
        if (list != null && list.size() > 0) {
            Iterator<WatchFaceWidget> it2 = this.e.iterator();
            while (it2.hasNext()) {
                List<WatchFaceOptionBean> optionalData = it2.next().getOptionalData();
                WatchFaceOptionBean watchFaceOptionBean = new WatchFaceOptionBean("无");
                watchFaceOptionBean.setGroupId(-1);
                if (optionalData == null) {
                    optionalData = new ArrayList<>();
                }
                optionalData.add(0, watchFaceOptionBean);
            }
        }
        this.l.loadWidgetData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void F() throws Exception {
        dismissDialog(this.mLoadDialog);
        this.d.setNewData(this.e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void G(DialogInterface dialogInterface, int i) {
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void H(ObservableEmitter observableEmitter) throws Exception {
        observableEmitter.onNext(this.d.getComponentStr());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void I(DataTransportResult dataTransportResult) {
        Log.d(m, "saveWatchFaceConfig:result: " + dataTransportResult, new Object[0]);
        dismissDialog(this.mLoadDialog);
        if (dataTransportResult == null || dataTransportResult.getResultCode() != 0) {
            Toast.makeText(this, R.string.xihu_watch_face_save_failed, 0).show();
            return;
        }
        Toast.makeText(this, R.string.xihu_watch_face_save_success, 0).show();
        if (this.k.isChecked()) {
            setCurrentWatch(this.j.getId(), false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void J(String str) throws Exception {
        Log.e(m, "saveWatchFaceConfig:" + str, new Object[0]);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        syncDataToWatch(WatchFaceModule.ACTION_SAVE_WATCHFACE_DATA, str, new Transporter.DataSendResultCallback() { // from class: xx8
            @Override // com.huami.watch.transport.Transporter.DataSendResultCallback
            public final void onResultBack(DataTransportResult dataTransportResult) {
                this.a.I(dataTransportResult);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void K(DialogInterface dialogInterface, int i) {
        showLoadDialog(getString(R.string.xihu_saving), "saveWatchFaceDialog");
        Rx.io(new ObservableOnSubscribe() { // from class: yx8
            @Override // io.reactivex.ObservableOnSubscribe
            public final void subscribe(ObservableEmitter observableEmitter) throws Exception {
                this.a.H(observableEmitter);
            }
        }).subscribe(new Consumer() { // from class: ay8
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                this.a.J((String) obj);
            }
        });
    }

    private void initData() {
        showLoadDialog(getString(R.string.loading), "watchFaceWidgetLoadDialog");
        Rx.io(new Runnable() { // from class: by8
            @Override // java.lang.Runnable
            public final void run() {
                this.a.E();
            }
        }).subscribe(new Action() { // from class: zx8
            @Override // io.reactivex.functions.Action
            public final void run() throws Exception {
                this.a.F();
            }
        });
        if (this.f) {
            for (int i = 0; i < 6; i++) {
                WatchFaceStyle watchFaceStyle = new WatchFaceStyle();
                if (i == 3) {
                    watchFaceStyle.setIconRes(R.drawable.watchface_default_everest);
                } else {
                    watchFaceStyle.setIconRes(R.drawable.watch_face_normal_bg);
                }
                this.h.add(watchFaceStyle);
            }
            this.i.setNewData(this.h);
        }
    }

    private void initView() {
        BaseWatchFaceController watchFaceController = WatchFaceUtils.getWatchFaceController(this, this.j);
        this.l = watchFaceController;
        if (watchFaceController == null) {
            return;
        }
        this.c.addView(watchFaceController.getWatchFaceView());
    }

    @Override // androidx.view.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        WatchFaceComponentAdapter watchFaceComponentAdapter = this.d;
        if (watchFaceComponentAdapter == null || !watchFaceComponentAdapter.ismEditModel()) {
            super.onBackPressed();
        } else {
            AlertDialog.setTitle(getString(R.string.xihu_delete_app_dialog_title)).setMessage(getString(R.string.xihu_watch_face_edit_exit)).setNegativeBtn(getString(R.string.dialog_cancel)).setPositiveBtn(getString(R.string.dialog_confirm), new DialogInterface.OnClickListener() { // from class: ux8
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    this.a.G(dialogInterface, i);
                }
            }).show(getFragmentManager(), "editWatchFaceEditAlert");
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.btn_save) {
            if (this.d.ismEditModel()) {
                AlertDialog.setTitle(getString(R.string.xihu_delete_app_dialog_title)).setMessage(getString(R.string.xihu_watch_face_edit_save)).setPositiveBtn(getString(R.string.dialog_confirm), new DialogInterface.OnClickListener() { // from class: vx8
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        this.a.K(dialogInterface, i);
                    }
                }).setNegativeBtn(getString(R.string.dialog_cancel)).show(getFragmentManager(), "saveWatchFaceEditAlert");
            }
        } else if (id == R.id.btn_back) {
            onBackPressed();
        }
    }

    @Override // com.huami.watch.companion.watchface.adapter.WatchFaceComponentAdapter.OnClickWidgetListener
    public void onClickWidget(int i, int i2, WatchFaceChildBean watchFaceChildBean) {
        BaseWatchFaceController baseWatchFaceController = this.l;
        if (baseWatchFaceController == null) {
            return;
        }
        baseWatchFaceController.setData(i, i2, watchFaceChildBean);
    }

    @Override // com.huami.watch.companion.watchface.BaseWatchFaceActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_xi_hu_watch_face_edit);
        Intent intent = getIntent();
        if (intent == null || intent.getSerializableExtra("watchFace") == null) {
            return;
        }
        WatchFaceBean watchFaceBean = (WatchFaceBean) intent.getSerializableExtra("watchFace");
        this.j = watchFaceBean;
        if (watchFaceBean == null) {
            return;
        }
        this.b = (RecyclerView) findViewById(R.id.recycle_view);
        this.c = (FrameLayout) findViewById(R.id.layout_container);
        ActionbarLayout actionbarLayout = (ActionbarLayout) findViewById(R.id.action_bar);
        actionbarLayout.setTitleText(this.j.getDialName());
        actionbarLayout.setBackArrowClickListener(this);
        List<WatchFaceWidget> widget = this.j.getWidget();
        this.e = widget;
        if (widget == null || widget.size() == 0) {
            return;
        }
        this.h = new ArrayList();
        initView();
        C();
        initData();
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter.OnItemClickListener
    public void onItemClick(BaseQuickAdapter baseQuickAdapter, View view, int i) {
        BaseWatchFaceController baseWatchFaceController;
        WatchFaceStyle watchFaceStyle = this.h.get(i);
        if (watchFaceStyle == null || (baseWatchFaceController = this.l) == null) {
            return;
        }
        baseWatchFaceController.setWatchFaceBg(watchFaceStyle.getIconRes());
    }

    @Override // com.huami.watch.companion.watchface.BaseWatchFaceActivity
    public void r(TransportDataItem transportDataItem) {
    }
}

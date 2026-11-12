package com.huami.core.device.wifi_settings.ui;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.core.device.wifi_settings.R;
import com.huami.core.device.wifi_settings.bean.WifiBean;
import com.huami.core.device.wifi_settings.ui.WifiListActivity;
import com.huami.core.device.wifi_settings.ui.adapter.WifiListAdapter;
import com.huami.tools.log.HMLog;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 &2\u00020\u0001:\u0001&B\u0007¢\u0006\u0004\b$\u0010%J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0014\u0010\u0006\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002J\b\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\tH\u0016J\b\u0010\u000b\u001a\u00020\u0002H\u0016J\b\u0010\f\u001a\u00020\u0007H\u0016J\b\u0010\r\u001a\u00020\u0007H\u0016J\b\u0010\u000e\u001a\u00020\u0002H\u0016J\u0018\u0010\u0012\u001a\u00020\u00022\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fH\u0016J\b\u0010\u0013\u001a\u00020\u0002H\u0016J\b\u0010\u0014\u001a\u00020\u0002H\u0016R\u0016\u0010\u0018\u001a\u00020\u00158\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001c\u001a\u00020\u00198\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010 \u001a\u00020\u001d8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001c\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006'"}, d2 = {"Lcom/huami/core/device/wifi_settings/ui/WifiListActivity;", "Lcom/huami/core/device/wifi_settings/ui/BaseWifiActivity;", "", "v", "Landroid/content/Intent;", "intent", "x", "", "initLayout", "", "scanWifiEnable", "initData", "maskViewId", "statusContainerId", "initView", "", "Lcom/huami/core/device/wifi_settings/bean/WifiBean;", "list", "resultSuc", "onLeftClicked", "onBackPressed", "Landroidx/recyclerview/widget/RecyclerView;", "C", "Landroidx/recyclerview/widget/RecyclerView;", "mRecyclerView", "Landroidx/appcompat/widget/AppCompatTextView;", LogUtil.D, "Landroidx/appcompat/widget/AppCompatTextView;", "mTvEmpty", "Lcom/huami/core/device/wifi_settings/ui/adapter/WifiListAdapter;", "E", "Lcom/huami/core/device/wifi_settings/ui/adapter/WifiListAdapter;", "mAdapter", "F", "Ljava/util/List;", "mWifiData", "<init>", "()V", "Companion", "wifi-settings_release"}, k = 1, mv = {1, 5, 1})
public final class WifiListActivity extends BaseWifiActivity {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String TAG = "WifiList_Activity";

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    private RecyclerView mRecyclerView;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    private AppCompatTextView mTvEmpty;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private WifiListAdapter mAdapter;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    @NotNull
    private List<WifiBean> mWifiData = new ArrayList();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\u001e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004R\u0016\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/huami/core/device/wifi_settings/ui/WifiListActivity$Companion;", "", "Landroid/app/Activity;", "activity", "", "source", "requestCode", "", "startActivity", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "wifi-settings_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void startActivity(@NotNull Activity activity, int source, int requestCode) {
            Intent intent = new Intent(activity, (Class<?>) WifiListActivity.class);
            intent.putExtra("source", source);
            activity.startActivityForResult(intent, requestCode);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ List<WifiBean> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(List<WifiBean> list) {
            super(0);
            this.a = list;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("resultSuc:", this.a);
        }
    }

    private final void v() {
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView == null) {
            recyclerView = null;
        }
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        RecyclerView recyclerView2 = this.mRecyclerView;
        if (recyclerView2 == null) {
            recyclerView2 = null;
        }
        recyclerView2.setHasFixedSize(true);
        WifiListAdapter wifiListAdapter = new WifiListAdapter(this.mWifiData);
        this.mAdapter = wifiListAdapter;
        wifiListAdapter.setMListener(new View.OnClickListener() { // from class: ov8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                WifiListActivity.w(this.a, view);
            }
        });
        RecyclerView recyclerView3 = this.mRecyclerView;
        if (recyclerView3 == null) {
            recyclerView3 = null;
        }
        WifiListAdapter wifiListAdapter2 = this.mAdapter;
        recyclerView3.setAdapter(wifiListAdapter2 != null ? wifiListAdapter2 : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w(WifiListActivity wifiListActivity, View view) {
        Object tag;
        if (view == null || (tag = view.getTag()) == null) {
            return;
        }
        wifiListActivity.getIntent().putExtra(WifiSetActivity.KEY_CONNECT, (WifiBean) tag);
        wifiListActivity.x(wifiListActivity.getIntent());
    }

    private final void x(Intent intent) {
        setResult(-1, intent);
        finish();
    }

    public static /* synthetic */ void y(WifiListActivity wifiListActivity, Intent intent, int i, Object obj) {
        if ((i & 1) != 0) {
            intent = null;
        }
        wifiListActivity.x(intent);
    }

    @Override // com.huami.core.device.wifi_settings.ui.BaseWifiActivity
    public void _$_clearFindViewByIdCache() {
    }

    @Override // com.huami.core.device.wifi_settings.ui.BaseWifiActivity
    public void initData() {
    }

    @Override // com.huami.core.device.wifi_settings.ui.BaseWifiActivity
    public int initLayout() {
        return R.layout.wifi_setting_activity_wifi_list;
    }

    @Override // com.huami.core.device.wifi_settings.ui.BaseWifiActivity
    public void initView() {
        this.mRecyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        this.mTvEmpty = (AppCompatTextView) findViewById(R.id.tv_empty);
        v();
    }

    @Override // com.huami.core.device.wifi_settings.ui.BaseWifiActivity
    public int maskViewId() {
        return R.id.mask_view;
    }

    @Override // androidx.view.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        y(this, null, 1, null);
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity
    public void onLeftClicked() {
        super.onLeftClicked();
        onBackPressed();
    }

    @Override // com.huami.core.device.wifi_settings.ui.BaseWifiActivity, com.huami.core.device.wifi_settings.wifiscan.listener.ScanResultListener
    public void resultSuc(@Nullable List<WifiBean> list) {
        super.resultSuc(list);
        HMLog.debug(TAG, new a(list));
        this.mWifiData.clear();
        if ((list == null ? 0 : list.size()) == 0) {
            AppCompatTextView appCompatTextView = this.mTvEmpty;
            if (appCompatTextView == null) {
                appCompatTextView = null;
            }
            appCompatTextView.setVisibility(0);
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView == null) {
                recyclerView = null;
            }
            recyclerView.setVisibility(8);
        } else {
            AppCompatTextView appCompatTextView2 = this.mTvEmpty;
            if (appCompatTextView2 == null) {
                appCompatTextView2 = null;
            }
            appCompatTextView2.setVisibility(8);
            RecyclerView recyclerView2 = this.mRecyclerView;
            if (recyclerView2 == null) {
                recyclerView2 = null;
            }
            recyclerView2.setVisibility(0);
            this.mWifiData.addAll(list);
        }
        WifiListAdapter wifiListAdapter = this.mAdapter;
        (wifiListAdapter != null ? wifiListAdapter : null).notifyDataSetChanged();
    }

    @Override // com.huami.core.device.wifi_settings.ui.BaseWifiActivity
    /* JADX INFO: renamed from: scanWifiEnable */
    public boolean getWifiScanEnable() {
        return true;
    }

    @Override // com.huami.core.device.wifi_settings.ui.BaseWifiActivity
    public int statusContainerId() {
        return R.id.device_status;
    }
}

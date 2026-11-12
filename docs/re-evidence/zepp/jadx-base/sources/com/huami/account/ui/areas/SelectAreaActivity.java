package com.huami.account.ui.areas;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import androidx.p008lifecycle.SavedStateViewModelFactory;
import androidx.p008lifecycle.ViewModelProvider;
import com.huami.account.AccountStatEvent;
import com.huami.account.UserLegalInfoManager;
import com.huami.account.event.EventRegisterErrorTipExit;
import com.huami.account.keeper.HMAccountKeeper;
import com.huami.account.legal.ServerLegalTask;
import com.huami.account.selectArea.baseui.IndexBar;
import com.huami.account.selectArea.entity.RegionIndexBean;
import com.huami.account.service.model.Area;
import com.huami.account.service.model.SubArea;
import com.huami.account.ui.R;
import com.huami.account.ui.common.BaseTitleOauthActivity;
import com.huami.account.ui.common.LoadingDialogContainer;
import com.huami.account.ui.common.LoadingDialogContainerKt;
import com.huami.account.ui.common.LoadingDialogHelper;
import com.huami.account.ui.register.RegisterManager;
import com.huami.account.utils.UtilsKt;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.lib.rainbow.utils.RainbowUtils;
import com.huami.mifit.analytics.Analytics;
import com.huami.mifit.analytics.builder.CountEventBuilder;
import com.huami.passport.AccountManager;
import com.huami.passport.IAccount;
import com.huami.util.net.NetUtil;
import com.huami.view.basetitle.BaseTitleActivity;
import com.huami.widget.toast.IconToast;
import com.xiaomi.hm.health.baseutil.GlobalConfig;
import de.greenrobot.event.EventBus;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class SelectAreaActivity extends BaseTitleOauthActivity {
    public static final String EXTRA_SELECTED_AREA = "selectedArea";
    private static final String J = "SelectAreaActivity";
    public static final String PARAM_RESELECT_AREA = "RESELECT_AREA";
    public static final String REGISTER_ACCESS_TOKEN = "REGISTER_ACCESS_TOKEN";
    public static final String REGISTER_PROVIDER = "REGISTER_PROVIDER";
    public static final int REQUEST_SELECT_AREA_CODE = 222;
    public static final int REQUEST_SELECT_AREA_ONLY = 223;
    public static final String RESULT_RESELECT_AREA = "RESULT_RESELECT_AREA";
    public static final String SELECT_AREA_ONLY = "selectArea";
    public static final String TYPE_RESPONSE = "TYPE_RESPONSE";
    public static final String TYPE_RESPONSE_EMAIL = "TYPE_RESPONSE";
    public static final String TYPE_RESPONSE_PHONE = "TYPE_RESPONSE_PHONE";
    public static final String TYPE_RESPONSE_REGISTER_SUCCESS = "TYPE_RESPONSE_REGISTER_SUCCESS";
    private IndexBar A;
    private SelectAreaViewModel B;
    private boolean D;
    private String E;
    private LoadingDialogContainer G;
    private TextView H;
    private d I;
    private String C = IAccount.PROVIDER_UNKOWN;
    private WeakReference<SelectAreaActivity> F = new WeakReference<>(this);

    public class a implements AbsListView.OnScrollListener {
        public final /* synthetic */ List a;

        public a(List list) {
            this.a = list;
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int i, int i2, int i3) {
            SelectAreaActivity.this.A.setSelectIndex(((RegionIndexBean) this.a.get(i)).getBaseIndexTag());
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i) {
        }
    }

    public class b implements UserLegalInfoManager.AgreementDialogCallback {
        public b() {
        }

        @Override // com.huami.account.UserLegalInfoComponents.AgreementDialogCallback
        public void onAgree() {
            SelectAreaActivity.this.R();
        }

        @Override // com.huami.account.UserLegalInfoComponents.AgreementDialogCallback
        public void onCancel() {
            if (SelectAreaActivity.this.isFinishing()) {
                return;
            }
            SelectAreaActivity.this.finish();
        }
    }

    public class c implements RegisterManager.RegActionCallback {
        public c() {
        }

        @Override // com.huami.account.ui.register.RegisterManager.RegActionCallback
        public void hideLoading() {
            SelectAreaActivity.this.G.hideDialog();
        }

        @Override // com.huami.account.ui.register.RegisterManager.RegActionCallback
        public void onAlreadyRegisterConfirmed() {
            SelectAreaActivity.this.finish();
        }

        @Override // com.huami.account.ui.register.RegisterManager.RegActionCallback
        public void onRegisterSuccess() {
            SelectAreaActivity.this.S();
        }

        @Override // com.huami.account.ui.register.RegisterManager.RegActionCallback
        public void showLoading(int i) {
            LoadingDialogContainerKt.showLoadingDialog(SelectAreaActivity.this.G, i);
        }
    }

    public class d extends BaseAdapter {
        private final List<RegionIndexBean> a;

        public d(List<RegionIndexBean> list) {
            this.a = list;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void c(View view) {
            UtilsKt.conflictClick(view, new long[0]);
            notifyDataSetChanged();
            SelectAreaActivity.this.B.setSelectedArea(((RegionIndexBean) view.getTag()).getArea());
            SelectAreaActivity.this.O();
        }

        @Override // android.widget.Adapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public RegionIndexBean getItem(int i) {
            return this.a.get(i);
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return this.a.size();
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            return i;
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                view = LayoutInflater.from(SelectAreaActivity.this).inflate(R.layout.account_ui_item_select_area, viewGroup, false);
            }
            RegionIndexBean item = getItem(i);
            view.setTag(item);
            ImageView imageView = (ImageView) view.findViewById(R.id.item_checked);
            TextView textView = (TextView) view.findViewById(R.id.item_area);
            if (item.getArea() == null || !item.getArea().equals(SelectAreaActivity.this.I())) {
                imageView.setVisibility(4);
                textView.setTypeface(Typeface.create(textView.getTypeface(), 0), 0);
                textView.invalidate();
            } else {
                imageView.setVisibility(0);
                textView.setTypeface(Typeface.defaultFromStyle(1));
            }
            if (!SelectAreaManager.INSTANCE.isUS(SelectAreaActivity.this.I())) {
                item.getArea().setSubArea(null);
            }
            textView.setText(SelectAreaActivity.this.G(item.getArea()));
            view.setOnClickListener(new View.OnClickListener() { // from class: com.huami.account.ui.areas.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.a.c(view2);
                }
            });
            return view;
        }
    }

    private void D(String str) {
        RegisterManager.register(this.F.get(), str, this.E, I(), new c());
    }

    private void E() {
        HashMap map = new HashMap();
        SelectAreaManager selectAreaManager = SelectAreaManager.INSTANCE;
        map.put(AccountStatEvent.KEY_SELECT_AREA_RECOMMENDED_AREA_CODE, SelectAreaManager.getDefaultArea().getValue());
        map.put(AccountStatEvent.KEY_SELECT_AREA_CODE, I().getValue());
        Analytics.recordEvent(new CountEventBuilder(AccountStatEvent.EVENT_SELECT_AREA).putExtras(map));
    }

    private void F() {
        ServerLegalTask.executeServerLegalTask(this, this.G, I(), new ServerLegalTask.SuccessCallback() { // from class: nl6
            @Override // com.huami.account.legal.ServerLegalTask.SuccessCallback
            public final void onSuccess() {
                this.a.L();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String G(Area area) {
        return AreasKt.getDisplayName(area);
    }

    private Area H() {
        return (Area) getIntent().getSerializableExtra("selectedArea");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Nullable
    public Area I() {
        return this.B.getSelectedArea();
    }

    private void J() {
        final ListView listView = (ListView) findViewById(R.id.select_area_list_view);
        this.A = (IndexBar) findViewById(R.id.indexBar);
        List<RegionIndexBean> regions = this.B.getRegions();
        if (Build.VERSION.SDK_INT >= 24) {
            this.A.setSourceData(regions);
        }
        d dVar = new d(regions);
        this.I = dVar;
        listView.setAdapter((ListAdapter) dVar);
        listView.setOnScrollListener(new a(regions));
        this.A.setOnIndexChangeListener(new IndexBar.OnIndexChangeListener() { // from class: ol6
            @Override // com.huami.account.selectArea.baseui.IndexBar.OnIndexChangeListener
            public final void onChange(int i) {
                listView.setSelection(i);
            }
        });
    }

    private boolean K() {
        return getIntent().getBooleanExtra(SELECT_AREA_ONLY, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void L() {
        if (!K()) {
            V();
            return;
        }
        Intent intent = new Intent();
        intent.putExtra("selectedArea", I());
        setResult(-1, intent);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void M(Area area, View view) {
        UtilsKt.conflictClick(view, new long[0]);
        this.B.setSelectedArea(area);
        O();
        findViewById(R.id.item_checked).setVisibility(0);
        this.I.notifyDataSetChanged();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void N(DialogInterface dialogInterface, int i) {
        F();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void O() {
        if (!NetUtil.INSTANCE.networkInfo().isNetworkConnect()) {
            IconToast.showError(this, getString(R.string.account_ui_no_network_connection));
            return;
        }
        if (SelectAreaManager.INSTANCE.isUS(I())) {
            SelectStateActivity.start(this, I(), 113);
        } else {
            String value = SelectAreaManager.getDefaultArea().getValue();
            Area areaI = I();
            if (areaI == null || areaI.getValue().equals(value)) {
                F();
            } else {
                U();
            }
        }
        E();
    }

    private void P() {
        Q(R.string.account_ui_login_email_regist_failed);
    }

    private void Q(int i) {
        IconToast.showError(this, getString(i));
        this.G.hideDialog();
        HMAccountKeeper.INSTANCE.keepLoginData(null, null, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void R() {
        if (this.D) {
            Intent intent = new Intent();
            intent.putExtra(RESULT_RESELECT_AREA, I());
            setResult(-1, intent);
            finish();
            return;
        }
        if (TextUtils.isEmpty(this.C) || IAccount.PROVIDER_UNKOWN.equals(this.C)) {
            return;
        }
        D(this.C);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void S() {
        Intent intent = new Intent();
        intent.putExtra("TYPE_RESPONSE", TYPE_RESPONSE_REGISTER_SUCCESS);
        setResult(-1, intent);
        finish();
    }

    private void T() {
        getTitleTextView().setMaxLines(2);
        getTitleTextView().setSingleLine(false);
        View viewFindViewById = getTitleBarView().findViewById(R.id.common_title_center_layout);
        ViewGroup.LayoutParams layoutParams = viewFindViewById.getLayoutParams();
        layoutParams.width = -1;
        int iDp2px = (int) UtilsKt.dp2px(this, 54.0f);
        viewFindViewById.setPadding(iDp2px, 0, iDp2px, 0);
        viewFindViewById.setLayoutParams(layoutParams);
    }

    private void U() {
        new AlertDialogFragment.Builder(this).setTitle(R.string.account_ui_select_area_diff_tip).setMessage(R.string.account_ui_select_area_diff_message).setNegativeButton(R.string.account_ui_cancel, (DialogInterface.OnClickListener) null).setPositiveButton(R.string.account_ui_got_it, new DialogInterface.OnClickListener() { // from class: ll6
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                this.a.N(dialogInterface, i);
            }
        }).show(getSupportFragmentManager()).setGravity(17);
    }

    private void V() {
        UserLegalInfoManager.showAgreementDialogForReg(this, I(), new b());
    }

    private void init() {
        this.H = (TextView) findViewById(R.id.select_area_current_selected);
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.ll_current_area);
        SelectAreaManager selectAreaManager = SelectAreaManager.INSTANCE;
        final Area defaultArea = SelectAreaManager.getDefaultArea();
        if (!defaultArea.equals(selectAreaManager.getUnknownArea())) {
            linearLayout.setVisibility(0);
            this.H.setText(G(defaultArea) + getString(R.string.account_ui_current));
            linearLayout.setOnClickListener(new View.OnClickListener() { // from class: ml6
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.a.M(defaultArea, view);
                }
            });
        }
        this.B.setSelectedArea(H());
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        AccountManager.getDefault(this).onActivityResult(i, i2, intent);
        if (i == 111 && i2 == -1) {
            Intent intent2 = new Intent();
            intent2.putExtra("TYPE_RESPONSE", "TYPE_RESPONSE");
            setResult(-1, intent2);
            finish();
        }
        if (i == 112 && i2 == -1) {
            Intent intent3 = new Intent();
            intent3.putExtra("TYPE_RESPONSE", "TYPE_RESPONSE");
            setResult(-1, intent3);
            finish();
        }
        if (i == 113 && i2 == -1) {
            SubArea state = SelectStateActivity.parseState(intent);
            Area areaI = I();
            if (areaI == null) {
                P();
            } else {
                areaI.setSubArea(state);
                F();
            }
        }
    }

    @Override // com.huami.account.ui.common.BaseTitleOauthActivity, com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.account_ui_activity_select_area_layout);
        EventBus.getDefault().registerSticky(this);
        this.useSaveInstanceState = true;
        this.B = (SelectAreaViewModel) new ViewModelProvider(this, new SavedStateViewModelFactory(getApplication(), this)).get(SelectAreaViewModel.class);
        this.G = new LoadingDialogHelper(this);
        setStyle(BaseTitleActivity.STYLE.BACK_AND_TITLE, ContextCompat.getColor(this, GlobalConfig.get().isBuildMidong() ? R.color.s36 : R.color.s10), getString(R.string.account_ui_select_area_or_country_title), true ^ RainbowUtils.isDarkMode(this));
        T();
        setBaseTitleColor(ContextCompat.getColor(this, R.color.s1));
        this.C = getIntent().getStringExtra(REGISTER_PROVIDER);
        this.D = getIntent().getBooleanExtra(PARAM_RESELECT_AREA, false);
        this.E = getIntent().getStringExtra(REGISTER_ACCESS_TOKEN);
        init();
        J();
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        this.G.hideDialog();
        EventBus.getDefault().unregister(this);
        super.onDestroy();
    }

    public void onEventMainThread(EventRegisterErrorTipExit eventRegisterErrorTipExit) {
        finish();
    }
}

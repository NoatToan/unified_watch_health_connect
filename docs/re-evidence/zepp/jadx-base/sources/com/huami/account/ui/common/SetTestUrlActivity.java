package com.huami.account.ui.common;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.huami.account.AccountExternalsKt;
import com.huami.account.HMLoginManager;
import com.huami.account.keeper.HMAccountKeeper;
import com.huami.account.ui.R;
import com.huami.network.hmnetwork.server.HMServerDef;
import com.huami.passport.Configs;
import com.huami.tools.log.HMLog;
import com.huami.view.basetitle.BaseTitleActivity;
import com.huami.widget.toast.CustomToast;
import io.flutter.embedding.android.FlutterActivityLaunchConfigs;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class SetTestUrlActivity extends BaseTitleActivity {
    private static final String z = "SetTestUrlActivity";
    private final String x = "https://account.huami.com/";
    private final String y = "https://account-staging.huami.com/";

    public class a extends BaseAdapter {
        public final /* synthetic */ List a;

        public a(List list) {
            this.a = list;
        }

        @Override // android.widget.Adapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public String getItem(int i) {
            return (String) this.a.get(i);
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
            View viewInflate;
            d dVar;
            if (view == null) {
                dVar = SetTestUrlActivity.this.new d();
                viewInflate = View.inflate(SetTestUrlActivity.this, R.layout.account_ui_activity_set_test_url_spinner_item, null);
                dVar.a = (TextView) viewInflate.findViewById(R.id.activity_set_test_url_spinner_item_txt);
                viewInflate.setTag(dVar);
            } else {
                viewInflate = view;
                dVar = (d) view.getTag();
            }
            dVar.a.setText(getItem(i));
            return viewInflate;
        }
    }

    public class b implements AdapterView.OnItemSelectedListener {
        public final /* synthetic */ EditText a;
        public final /* synthetic */ List b;

        public b(EditText editText, List list) {
            this.a = editText;
            this.b = list;
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            this.a.setText((CharSequence) this.b.get(i));
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    public class c implements View.OnClickListener {
        private final EditText a;

        public c(EditText editText) {
            this.a = editText;
        }

        private void a(String str) {
            this.a.getText().insert(this.a.getSelectionStart(), str);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int id = view.getId();
            if (id == R.id.set_test_url_clear) {
                this.a.setText("");
                return;
            }
            if (id == R.id.set_test_url_txt_input_http) {
                a("http://");
                return;
            }
            if (id == R.id.set_test_url_txt_input_https) {
                a("https://");
                return;
            }
            if (id == R.id.set_test_url_txt_input_www) {
                a("www.");
                return;
            }
            if (id == R.id.set_test_url_txt_input_com) {
                a(".com");
                return;
            }
            if (id == R.id.set_test_url_txt_input_cn) {
                a(".cn");
            } else if (id == R.id.set_test_url_txt_input_dot) {
                a(".");
            } else if (id == R.id.set_test_url_txt_input_separator) {
                a(FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE);
            }
        }
    }

    public class d {
        public TextView a;

        public d() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h(View view) {
        HMLoginManager.forceRefreshHttpDns();
        finish();
    }

    private void init() {
        final List<String> listAsList = Arrays.asList(HMServerDef.HOST_COMMON);
        HMAccountKeeper hMAccountKeeper = HMAccountKeeper.INSTANCE;
        final List<String> testUrlList = hMAccountKeeper.getTestUrlList();
        final ArrayList arrayList = new ArrayList();
        final List<String> testAccountUrlList = hMAccountKeeper.getTestAccountUrlList();
        String oriHost = HMServerDef.getOriHost();
        String testAccountUrl = hMAccountKeeper.getTestAccountUrl();
        if (TextUtils.isEmpty(testAccountUrl)) {
            testAccountUrl = Configs.isDebugMode ? "https://account-staging.huami.com/" : "https://account.huami.com/";
        }
        arrayList.add("https://account.huami.com/");
        arrayList.add(Configs.ID_SERVER_CN_PRODUCT);
        arrayList.add(Configs.ID_SERVER_US_PRODUCT);
        arrayList.add("https://account-staging.huami.com/");
        arrayList.add(Configs.ID_SERVER_CN_TEST);
        arrayList.add(Configs.ID_SERVER_US_TEST);
        o(findViewById(R.id.set_business_url), listAsList, testUrlList, oriHost);
        o(findViewById(R.id.set_account_url), arrayList, testAccountUrlList, testAccountUrl);
        findViewById(R.id.set_test_url_commit).setOnClickListener(new View.OnClickListener() { // from class: hq6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.q(listAsList, testUrlList, arrayList, testAccountUrlList, view);
            }
        });
    }

    private void n(List<String> list, List<String> list2, List<String> list3, List<String> list4) {
        View viewFindViewById = findViewById(R.id.set_business_url);
        int i = R.id.set_test_url_txt;
        String string = ((EditText) viewFindViewById.findViewById(i)).getText().toString();
        String string2 = ((EditText) findViewById(R.id.set_account_url).findViewById(i)).getText().toString();
        String strR = r(string);
        if (!TextUtils.isEmpty(strR)) {
            String strR2 = r(string2);
            if (!TextUtils.isEmpty(strR2)) {
                if (!HMLoginManager.isUserValid()) {
                    AccountExternalsKt.getAccountDelegate().cleanApplicationData();
                }
                boolean zContains = list.contains(strR);
                boolean zContains2 = list2.contains(strR);
                boolean zContains3 = list3.contains(strR2);
                boolean zContains4 = list4.contains(strR2);
                if (!zContains && !zContains2) {
                    list2.add(strR);
                }
                if (!zContains3 && !zContains4) {
                    list4.add(strR2);
                }
                HMAccountKeeper hMAccountKeeper = HMAccountKeeper.INSTANCE;
                hMAccountKeeper.setTestUrl(strR);
                hMAccountKeeper.setTestUrlList(list2);
                hMAccountKeeper.setTestAccountUrl(strR2);
                hMAccountKeeper.setTestAccountUrlList(list4);
                HMServerDef.setTestHost(strR);
                if (HMServerDef.isProductUrl()) {
                    AccountExternalsKt.getAccountDelegate().updateCompanionHosts(false);
                    Configs.ID_SERVER_INDEX_PRODUCT = strR2;
                } else {
                    AccountExternalsKt.getAccountDelegate().updateCompanionHosts(true);
                    Configs.ID_SERVER_INDEX_STAGING = strR2;
                }
                HMLoginManager.init(getApplicationContext());
                AccountExternalsKt.getCommonDelegate().initHttpConfig();
                finish();
                HMLog.v(z, "HOST-BUSINESS:" + strR + "\nHOST-ACCOUNT:" + strR2, new Object[0]);
                return;
            }
        }
        CustomToast.makeText(this, "输入的地址为空或错误的地址", 0).show();
    }

    private void o(View view, List<String> list, List<String> list2, String str) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(list);
        arrayList.addAll(list2);
        EditText editText = (EditText) view.findViewById(R.id.set_test_url_txt);
        Spinner spinner = (Spinner) view.findViewById(R.id.set_test_url_txt_spinner);
        TextView textView = (TextView) view.findViewById(R.id.set_test_url_txt_input_http);
        TextView textView2 = (TextView) view.findViewById(R.id.set_test_url_txt_input_https);
        TextView textView3 = (TextView) view.findViewById(R.id.set_test_url_txt_input_www);
        TextView textView4 = (TextView) view.findViewById(R.id.set_test_url_clear);
        TextView textView5 = (TextView) view.findViewById(R.id.set_test_url_txt_input_com);
        TextView textView6 = (TextView) view.findViewById(R.id.set_test_url_txt_input_cn);
        TextView textView7 = (TextView) view.findViewById(R.id.set_test_url_txt_input_dot);
        TextView textView8 = (TextView) view.findViewById(R.id.set_test_url_txt_input_separator);
        editText.setText(str);
        p(spinner, editText, arrayList, str);
        c cVar = new c(editText);
        textView.setOnClickListener(cVar);
        textView2.setOnClickListener(cVar);
        textView3.setOnClickListener(cVar);
        textView5.setOnClickListener(cVar);
        textView6.setOnClickListener(cVar);
        textView7.setOnClickListener(cVar);
        textView8.setOnClickListener(cVar);
        textView4.setOnClickListener(cVar);
        view.findViewById(R.id.set_test_url_img).setOnTouchListener(null);
    }

    private void p(Spinner spinner, EditText editText, List<String> list, String str) {
        spinner.setAdapter((SpinnerAdapter) new a(list));
        spinner.setOnItemSelectedListener(new b(editText, list));
        int iIndexOf = list.indexOf(str);
        if (iIndexOf < 0 || iIndexOf >= list.size()) {
            return;
        }
        spinner.setSelection(iIndexOf);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void q(List list, List list2, List list3, List list4, View view) {
        n(list, list2, list3, list4);
    }

    private String r(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        if (!str.startsWith("http://") && !str.startsWith("https://")) {
            return "";
        }
        if (str.endsWith(FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE)) {
            return str;
        }
        return str + FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE;
    }

    public static void show(Context context) {
        context.startActivity(new Intent(context, (Class<?>) SetTestUrlActivity.class));
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.account_ui_activity_set_test_url);
        if (HMLoginManager.isUserValid()) {
            setStyle(BaseTitleActivity.STYLE.BACK_AND_TITLE_EXCHANGE, ContextCompat.getColor(this, R.color.account_ui_pale_grey), "设置地址", true);
            getRightImage().setOnClickListener(new View.OnClickListener() { // from class: gq6
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.a.h(view);
                }
            });
        } else {
            setStyle(BaseTitleActivity.STYLE.BACK_AND_TITLE, ContextCompat.getColor(this, R.color.account_ui_pale_grey), "设置地址", true);
        }
        setBaseTitleColor(ContextCompat.getColor(this, R.color.account_ui_black70));
        init();
    }
}

package com.xiaomi.hm.health.relation;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentTransaction;
import com.huami.view.basetitle.BaseTitleActivity;
import com.huami.widget.toast.IconToast;
import com.xiaomi.hm.health.baseutil.NetUtil;
import com.xiaomi.hm.health.model.account.HMPersonInfo;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes21.dex */
public class AddFriendActivityNew extends BaseTitleActivity {
    private static final String D = "data";
    private static final String E = "uid";
    private static final String F = "ftoken";
    private String A;
    private SearchResultFragment B;
    private a C;
    private EditText x;
    private ImageView y;
    private View z;

    public static class a extends Handler {
        public WeakReference<AddFriendActivityNew> a;

        public a(AddFriendActivityNew addFriendActivityNew) {
            this.a = new WeakReference<>(addFriendActivityNew);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            AddFriendActivityNew addFriendActivityNew = this.a.get();
            if (addFriendActivityNew != null) {
                addFriendActivityNew.y.performClick();
            }
        }
    }

    private void n() {
        if (TextUtils.isEmpty(this.x.getText().toString())) {
            return;
        }
        try {
            long jLongValue = Long.valueOf(this.x.getText().toString()).longValue();
            if (TextUtils.equals(HMPersonInfo.getInstance().getUserInfo().getUserid(), jLongValue + "")) {
                IconToast.showError(this, R.string.relatives_friend_not_add_yourself);
            } else if (!NetUtil.isNetworkConnected(this)) {
                IconToast.showError(this, R.string.relatives_not_connect_network);
            } else {
                this.B.showLoading(getString(R.string.relatives_friend_search_loading));
                FriendManager.getInstance().searchFriend(jLongValue, this.A, 1);
            }
        } catch (Exception unused) {
            IconToast.showError(this, R.string.relatives_friend_search_not_exist);
        }
    }

    private void o() {
        String stringExtra = getIntent().getStringExtra("data");
        if (TextUtils.isEmpty(stringExtra)) {
            return;
        }
        this.z.setVisibility(8);
        try {
            JSONObject jSONObject = new JSONObject(stringExtra);
            String strOptString = jSONObject.optString("uid", "");
            this.A = jSONObject.optString(F, "");
            if (TextUtils.isEmpty(strOptString) || TextUtils.isEmpty(this.A)) {
                return;
            }
            this.x.setText(strOptString);
            this.C.sendMessageDelayed(Message.obtain(), 2000L);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void p(View view) {
        n();
    }

    private void q() {
        FragmentTransaction fragmentTransactionBeginTransaction = getSupportFragmentManager().beginTransaction();
        SearchResultFragment searchResultFragmentNewInstance = SearchResultFragment.newInstance();
        this.B = searchResultFragmentNewInstance;
        fragmentTransactionBeginTransaction.replace(R.id.root, searchResultFragmentNewInstance);
        fragmentTransactionBeginTransaction.commit();
    }

    private void r() {
        this.x = (EditText) findViewById(R.id.edit_uid);
        this.y = (ImageView) findViewById(R.id.search);
        this.z = findViewById(R.id.root_search);
        this.y.setOnClickListener(new View.OnClickListener() { // from class: l8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.p(view);
            }
        });
        q();
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.relatives_activity_search_friend);
        this.C = new a(this);
        setStyle(BaseTitleActivity.STYLE.BACK_AND_TITLE, ContextCompat.getColor(this, R.color.relatives_relative_pale_grey), getString(R.string.relatives_title_friend_search), true);
        getTitleTextView().setTextColor(ContextCompat.getColor(this, R.color.relatives_black70));
        r();
        o();
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.C.removeCallbacksAndMessages(null);
        this.C = null;
    }
}

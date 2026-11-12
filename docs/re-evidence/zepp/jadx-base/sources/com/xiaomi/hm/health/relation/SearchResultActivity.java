package com.xiaomi.hm.health.relation;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.huami.android.design.dialog.loading.LoadingDialog;
import com.huami.view.basetitle.BaseTitleActivity;
import com.xiaomi.hm.health.databases.model.Friend;
import com.xiaomi.hm.health.push.MessageManager;
import com.xiaomi.hm.health.relation.copy.AvatarManager;
import com.xiaomi.hm.health.relation.copy.BaseRecyclerAdapter;
import com.xiaomi.hm.health.relation.event.EventAcceptInvite;
import com.xiaomi.hm.health.relation.event.EventAddFriend;

/* JADX INFO: loaded from: classes21.dex */
public class SearchResultActivity extends BaseTitleActivity {
    private static final String F = "isFriend";
    private static final String G = "uid";
    private static final String H = "username";
    private static final String I = "icon";
    private static final String J = "token";
    private String A;
    private LoadingDialog B;
    private boolean C;
    private BaseRecyclerAdapter<Friend> E;
    private String y;
    private String z;
    private long x = -1;
    private FriendManager D = FriendManager.getInstance();

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (SearchResultActivity.this.x > 0) {
                view.setEnabled(false);
                SearchResultActivity searchResultActivity = SearchResultActivity.this;
                searchResultActivity.B = LoadingDialog.showDialog(searchResultActivity, searchResultActivity.getString(R.string.relatives_sending));
                SearchResultActivity.this.B.setCancelable(false);
                SearchResultActivity.this.B.show();
                FriendManager friendManager = SearchResultActivity.this.D;
                SearchResultActivity searchResultActivity2 = SearchResultActivity.this;
                friendManager.sendFriendInvited(searchResultActivity2, searchResultActivity2.x, SearchResultActivity.this.A);
            }
        }
    }

    public class b implements LoadingDialog.OnAnimEndListener {
        public b() {
        }

        @Override // com.huami.android.design.dialog.loading.LoadingDialog.OnAnimEndListener
        public void onAnimEnd(LoadingDialog loadingDialog) {
        }

        @Override // com.huami.android.design.dialog.loading.LoadingDialog.OnAnimEndListener
        public void onDismiss(LoadingDialog loadingDialog) {
            SearchResultActivity.this.finish();
        }
    }

    public class c implements LoadingDialog.OnAnimEndListener {
        public c() {
        }

        @Override // com.huami.android.design.dialog.loading.LoadingDialog.OnAnimEndListener
        public void onAnimEnd(LoadingDialog loadingDialog) {
        }

        @Override // com.huami.android.design.dialog.loading.LoadingDialog.OnAnimEndListener
        public void onDismiss(LoadingDialog loadingDialog) {
            SearchResultActivity.this.finish();
        }
    }

    public static Intent createIntent(Context context, long j, String str, String str2, String str3, boolean z) {
        Intent intent = new Intent(context, (Class<?>) SearchResultActivity.class);
        intent.putExtra("uid", j);
        intent.putExtra("username", str);
        intent.putExtra("icon", str2);
        intent.putExtra("token", str3);
        intent.putExtra(F, z);
        return intent;
    }

    private void initView() {
        q(this.z, (ImageView) findViewById(R.id.icon));
        ((TextView) findViewById(R.id.username)).setText(this.y);
        ((TextView) findViewById(R.id.uid)).setText(getString(R.string.relatives_label_uid, new Object[]{this.x + ""}));
        TextView textView = (TextView) findViewById(R.id.add_button);
        if (!DifferenceManager.isBuildMidong()) {
            textView.setTextColor(ContextCompat.getColor(this, R.color.relatives_common_subject_mifit));
        }
        if (this.C) {
            textView.setText(R.string.relatives_label_friend_added);
        } else {
            textView.setText(R.string.relatives_title_add_friend);
            textView.setOnClickListener(new a());
        }
    }

    private void q(String str, ImageView imageView) {
        AvatarManager.updateAvatarUI(imageView, str, true, this.y);
    }

    private void r(int i) {
        if (AddFriendResult.isSuccess(i)) {
            this.B.setSuccess(getString(R.string.relatives_send_success), new b());
        } else {
            this.B.setFailed(getString(FriendUtils.toAddResultMessage(i)), new c());
        }
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        setTheme(R.style.Theme_App_Zepp);
        super.onCreate(bundle);
        setContentView(R.layout.relatives_activity_search_result);
        FriendFragKt.setUnifyTitleStyle(this, getString(R.string.relatives_title_activity_search_result));
        View viewFindViewById = findViewById(R.id.result_view);
        View viewFindViewById2 = findViewById(R.id.empty_view);
        Intent intent = getIntent();
        long longExtra = -1;
        if (intent != null) {
            longExtra = intent.getLongExtra("uid", -1L);
            this.y = intent.getStringExtra("username");
            this.z = intent.getStringExtra("icon");
            this.C = intent.getBooleanExtra(F, false);
            this.A = intent.getStringExtra("token");
        }
        this.x = longExtra;
        if (longExtra < 0) {
            viewFindViewById.setVisibility(8);
            viewFindViewById2.setVisibility(0);
        } else {
            viewFindViewById2.setVisibility(8);
            viewFindViewById.setVisibility(0);
            initView();
        }
        MessageManager.getDefault(getApplicationContext()).register(this);
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        MessageManager.getDefault(getApplicationContext()).unregister(this);
    }

    public void onEvent(EventAddFriend eventAddFriend) {
        if (this.x == eventAddFriend.toUid) {
            r(eventAddFriend.resultCode);
        }
    }

    public void onEvent(EventAcceptInvite eventAcceptInvite) {
        Friend friend = eventAcceptInvite.friend;
        if (friend != null && friend.uid.equals(String.valueOf(this.x))) {
            r(eventAcceptInvite.code);
        }
    }
}

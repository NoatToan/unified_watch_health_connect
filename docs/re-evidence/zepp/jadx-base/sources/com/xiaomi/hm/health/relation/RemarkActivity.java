package com.xiaomi.hm.health.relation;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import androidx.core.content.ContextCompat;
import com.huami.view.basetitle.BaseTitleActivity;
import com.huami.widget.toast.CustomToast;
import com.xiaomi.hm.health.databases.model.Friend;

/* JADX INFO: loaded from: classes21.dex */
public class RemarkActivity extends BaseTitleActivity {
    public static final String INPUT_FRIEND = "friend";
    public static final String OUTPUT_UID = "userid";
    public static final String OUTPUT_USERNAME = "username";
    private View.OnClickListener A;
    private Friend x;
    private FriendManager y;
    private EditText z;

    public static Intent createIntent(Context context, Friend friend) {
        Intent intent = new Intent(context, (Class<?>) RemarkActivity.class);
        intent.putExtra(INPUT_FRIEND, friend);
        return intent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h(View view) {
        String string = this.z.getText().toString();
        this.y.updateUserRemarkName(this, this.x.uid, string);
        Intent intent = new Intent();
        intent.putExtra("username", string);
        intent.putExtra("userid", this.x.uid);
        setResult(-1, intent);
        finish();
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        setTheme(R.style.Theme_App_Zepp);
        super.onCreate(bundle);
        setContentView(R.layout.relatives_activity_remark);
        FriendFragKt.setUnifyTitleStyle(this, getString(R.string.relatives_title_activity_remark));
        getRightTitle().setText(R.string.relatives_person_info_finish);
        if (DifferenceManager.isBuildMidong()) {
            getRightTitle().setTextColor(ContextCompat.getColor(this, R.color.p4));
        } else {
            getRightTitle().setTextColor(ContextCompat.getColor(this, R.color.relatives_common_subject_mifit));
        }
        getRightTitle().setTextSize(2, 15.0f);
        getRightTitle().setBackground(null);
        this.A = new View.OnClickListener() { // from class: za6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.h(view);
            }
        };
        findViewById(R.id.finish_button).setOnClickListener(this.A);
        Friend friend = (Friend) getIntent().getParcelableExtra(INPUT_FRIEND);
        this.x = friend;
        if (friend == null || Long.valueOf(friend.uid).longValue() < 0) {
            CustomToast.makeText(this, R.string.relatives_toast_user_info_error, 0);
            finish();
            return;
        }
        this.y = FriendManager.getInstance();
        this.z = (EditText) findViewById(R.id.remark_name);
        if (TextUtils.isEmpty(this.x.remarkName)) {
            return;
        }
        this.z.setText(this.x.remarkName);
        this.z.setSelection(this.x.remarkName.length());
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.relatives_menu_remark, menu);
        menu.findItem(R.id.action_save).getActionView();
        return true;
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != R.id.action_save) {
            return super.onOptionsItemSelected(menuItem);
        }
        String string = this.z.getText().toString();
        this.y.updateUserRemarkName(this, this.x.uid, string);
        Intent intent = new Intent();
        intent.putExtra("username", string);
        intent.putExtra("userid", this.x.uid);
        setResult(-1, intent);
        finish();
        return true;
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity
    public void onRightOnClicked(View view) {
        View.OnClickListener onClickListener = this.A;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
    }
}

package com.huami.watch.companion.ui.activity;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Switch;
import android.widget.TextView;
import com.huami.watch.companion.R;
import com.huami.watch.companion.notification.NotificationManager;
import com.huami.watch.companion.ui.view.ActionbarLayout;
import com.huami.watch.hmwatchmanager.view.AlertDialogFragment;
import com.huami.watch.util.DeviceCompatibility;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public class WechatFriendMsgSettingActivity extends Activity implements View.OnClickListener {
    private static final int m = 3;
    private Context a;
    private View b;
    private Switch c;
    private ListView d;
    private View e;
    private EditText f;
    private TextView g;
    private View h;
    private View i;
    private WechatFriendAdapter j;
    private NotificationManager k;
    private List<String> l;

    public class WechatFriendAdapter extends BaseAdapter {
        private boolean a = false;

        public class ViewHolder {
            public TextView a;
            public ImageView b;

            public ViewHolder() {
            }
        }

        public WechatFriendAdapter() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void d(AlertDialogFragment alertDialogFragment, int i, View view) {
            this.a = false;
            alertDialogFragment.dismiss();
            if (WechatFriendMsgSettingActivity.this.l.size() == 0) {
                return;
            }
            WechatFriendMsgSettingActivity.this.k.setDelKeywordDialogDisplayed(false);
            g((String) WechatFriendMsgSettingActivity.this.l.get(i));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void e(AlertDialogFragment alertDialogFragment, View view) {
            this.a = false;
            alertDialogFragment.dismiss();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void f(final int i, View view) {
            if (this.a) {
                return;
            }
            this.a = true;
            if (!WechatFriendMsgSettingActivity.this.k.isDelKeywordDialogDisplayed()) {
                g((String) WechatFriendMsgSettingActivity.this.l.get(i));
                this.a = false;
                return;
            }
            final AlertDialogFragment alertDialogFragmentNewInstance = AlertDialogFragment.newInstance(0);
            alertDialogFragmentNewInstance.setMessage(WechatFriendMsgSettingActivity.this.getString(R.string.del_keyword_msg));
            alertDialogFragmentNewInstance.setConfirm(WechatFriendMsgSettingActivity.this.getString(R.string.dialog_confirm), new View.OnClickListener() { // from class: jq8
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.a.d(alertDialogFragmentNewInstance, i, view2);
                }
            });
            alertDialogFragmentNewInstance.setCancel(WechatFriendMsgSettingActivity.this.getString(R.string.dialog_cancel), new View.OnClickListener() { // from class: iq8
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.a.e(alertDialogFragmentNewInstance, view2);
                }
            });
            alertDialogFragmentNewInstance.setCancelable(false);
            alertDialogFragmentNewInstance.show(WechatFriendMsgSettingActivity.this.getFragmentManager(), "");
        }

        private void g(String str) {
            WechatFriendMsgSettingActivity.this.k.removeKeyword(str);
            WechatFriendMsgSettingActivity wechatFriendMsgSettingActivity = WechatFriendMsgSettingActivity.this;
            wechatFriendMsgSettingActivity.l = wechatFriendMsgSettingActivity.k.getAllKeywords();
            notifyDataSetChanged();
            WechatFriendMsgSettingActivity.this.n();
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return WechatFriendMsgSettingActivity.this.l.size();
        }

        @Override // android.widget.Adapter
        public Object getItem(int i) {
            return WechatFriendMsgSettingActivity.this.l.get(i);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            return 0L;
        }

        @Override // android.widget.Adapter
        public View getView(final int i, View view, ViewGroup viewGroup) {
            ViewHolder viewHolder;
            if (view == null) {
                view = LayoutInflater.from(WechatFriendMsgSettingActivity.this.a).inflate(R.layout.list_item_wechat_friend, viewGroup, false);
                viewHolder = new ViewHolder();
                viewHolder.a = (TextView) view.findViewById(R.id.friend_name_tv);
                viewHolder.b = (ImageView) view.findViewById(R.id.delete_friend_iv);
                view.setTag(viewHolder);
            } else {
                viewHolder = (ViewHolder) view.getTag();
            }
            viewHolder.a.setText((CharSequence) WechatFriendMsgSettingActivity.this.l.get(i));
            viewHolder.b.setOnClickListener(new View.OnClickListener() { // from class: hq8
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.a.f(i, view2);
                }
            });
            return view;
        }
    }

    private void g() {
        String strTrim = this.f.getText().toString().trim();
        if (TextUtils.isEmpty(strTrim)) {
            return;
        }
        this.f.setText("");
        this.k.addKeyword(strTrim);
        this.l = this.k.getAllKeywords();
        this.j.notifyDataSetChanged();
        n();
    }

    private void h() {
        this.a = this;
        NotificationManager manager = NotificationManager.getManager(this);
        this.k = manager;
        this.c.setChecked(manager.isKeywordFilterON());
        this.l = this.k.getAllKeywords();
        WechatFriendAdapter wechatFriendAdapter = new WechatFriendAdapter();
        this.j = wechatFriendAdapter;
        this.d.setAdapter((ListAdapter) wechatFriendAdapter);
        n();
        m();
    }

    private void i() {
        this.b.setOnClickListener(this);
        this.c.setOnClickListener(this);
        this.g.setOnClickListener(this);
    }

    private void j() {
        ActionbarLayout actionbarLayout = (ActionbarLayout) findViewById(R.id.actionbar);
        actionbarLayout.setBackArrowClickListener(new View.OnClickListener() { // from class: gq8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.l(view);
            }
        });
        actionbarLayout.setTitleText(getString(R.string.noti_wechat_friends_msg_setting));
    }

    private void k() {
        this.b = findViewById(R.id.enable_filter_view);
        this.c = (Switch) findViewById(R.id.enable_filter_switch);
        this.d = (ListView) findViewById(R.id.friend_list);
        this.e = findViewById(R.id.add_wechat_friend_view);
        this.f = (EditText) findViewById(R.id.add_wechat_friend_et);
        this.g = (TextView) findViewById(R.id.add_wechat_friend_btn);
        this.h = findViewById(R.id.friend_list_view);
        this.i = findViewById(R.id.add_wechat_friend_container);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void l(View view) {
        onBackPressed();
    }

    private void m() {
        this.i.setVisibility(this.k.isKeywordFilterON() ? 0 : 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n() {
        if (this.l.size() == 3) {
            this.e.setVisibility(8);
            this.h.setVisibility(0);
        } else if (this.l.size() == 0) {
            this.e.setVisibility(0);
            this.h.setVisibility(8);
        } else {
            this.e.setVisibility(0);
            this.h.setVisibility(0);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.enable_filter_view) {
            boolean z = !this.c.isChecked();
            this.c.setChecked(z);
            this.k.setKeywordFilterON(z);
            m();
            return;
        }
        if (id == R.id.enable_filter_switch) {
            this.k.setKeywordFilterON(this.c.isChecked());
            m();
        } else if (id == R.id.add_wechat_friend_btn) {
            g();
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_wechat_friend_msg_setting);
        DeviceCompatibility.setStatusBarDarkMode(this, true);
        j();
        k();
        i();
        h();
    }
}

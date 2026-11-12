package com.xiaomi.hm.health.relation;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AbsListView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import com.chenenyu.router.Router;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.android.design.dialog.loading.LoadingDialog;
import com.huami.privacy.PrivacyProvider;
import com.huami.privacy.plugin.CreatedActivityClassNames;
import com.huami.relatives.event.EventCareSend;
import com.huami.view.basetitle.BaseTitleActivity;
import com.huami.widget.toast.IconToast;
import com.xiaomi.hm.health.baseutil.NetUtil;
import com.xiaomi.hm.health.databases.model.FriendMessage;
import com.xiaomi.hm.health.imageload.OtherUtils;
import com.xiaomi.hm.health.push.MessageManager;
import com.xiaomi.hm.health.relation.event.EventAcceptInvite;
import com.xiaomi.hm.health.relation.event.FriendMessagesEvent;
import com.xiaomi.hm.health.relation.utils.TimeUtils;
import com.xiaomi.hm.health.relation.view.CareButton;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes21.dex */
public class MessageActivity extends BaseTitleActivity implements AbsListView.OnScrollListener, View.OnClickListener, CareButton.OnStatusChangedListener {
    private static final String I = "MessageActivity";
    private static final int J = 100;
    private static final int K = 1;
    private e A;
    private LoadingDialog C;
    private View E;
    private ListView x;
    private View y;
    private View z;
    private FriendManager B = FriendManager.getInstance();
    private long D = -1;
    private boolean F = true;
    public boolean G = false;
    private boolean H = false;

    public class a implements FriendManager.DeleteMessageHandler {
        public final /* synthetic */ FriendMessage a;

        public a(FriendMessage friendMessage) {
            this.a = friendMessage;
        }

        @Override // com.xiaomi.hm.health.relation.FriendManager.DeleteMessageHandler
        public void onFailed() {
            IconToast.showError(MessageActivity.this, R.string.relatives_delete_failed);
        }

        @Override // com.xiaomi.hm.health.relation.FriendManager.DeleteMessageHandler
        public void onSuccess() {
            IconToast.showSuccess(MessageActivity.this, R.string.relatives_history_delete_success);
            MessageActivity.this.A.a.remove(this.a);
            MessageActivity.this.A.notifyDataSetChanged();
            MessageActivity messageActivity = MessageActivity.this;
            messageActivity.showView(messageActivity.A.isEmpty());
        }
    }

    public class b implements LoadingDialog.OnAnimEndListener {
        public final /* synthetic */ Intent a;

        public b(Intent intent) {
            this.a = intent;
        }

        @Override // com.huami.android.design.dialog.loading.LoadingDialog.OnAnimEndListener
        public void onAnimEnd(LoadingDialog loadingDialog) {
        }

        @Override // com.huami.android.design.dialog.loading.LoadingDialog.OnAnimEndListener
        public void onDismiss(LoadingDialog loadingDialog) {
            if (MessageActivity.this.F) {
                MessageActivity.this.startActivityForResult(this.a, 1);
                MessageActivity.this.F = false;
            }
        }
    }

    public static class c {
        public TextView a;
        public TextView b;
        public TextView c;
        public TextView d;
        public TextView e;
        public TextView f;
        public View g;
        public View h;
        public TextView i;
        public ImageView j;
    }

    public static class d {
        public TextView a;
        public TextView b;
        public TextView c;
        public TextView d;
        public ImageView e;
    }

    public class e extends BaseAdapter {
        private static final int c = 0;
        private static final int d = 1;
        private static final int e = 2;
        private final List<FriendMessage> a = new ArrayList();

        public e() {
        }

        private boolean g(@NonNull FriendMessage friendMessage) {
            if (friendMessage.type.intValue() != 1) {
                return false;
            }
            int iIntValue = friendMessage.status.intValue();
            return iIntValue == 2 || iIntValue == 3 || iIntValue == 4;
        }

        public void b(List<FriendMessage> list) {
            if (list == null) {
                return;
            }
            this.a.addAll(list);
        }

        public void c() {
            this.a.clear();
        }

        public List<FriendMessage> d() {
            return this.a;
        }

        @Override // android.widget.Adapter
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public FriendMessage getItem(int i) {
            return this.a.get(i);
        }

        public FriendMessage f(String str, int i) {
            for (FriendMessage friendMessage : this.a) {
                if (friendMessage.fromUid.equals(str) && friendMessage.type.intValue() == i) {
                    return friendMessage;
                }
            }
            return null;
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return this.a.size();
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            return i;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public int getItemViewType(int i) {
            int iIntValue = getItem(i).type.intValue();
            int i2 = 1;
            if (iIntValue != 1) {
                i2 = 2;
                if (iIntValue != 2 && iIntValue != 3) {
                    return 0;
                }
            }
            return i2;
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            d dVar;
            c cVar;
            f fVar;
            int itemViewType = getItemViewType(i);
            FriendMessage item = getItem(i);
            if (itemViewType == 0) {
                if (view == null || view.getTag() == null || !(view.getTag() instanceof d)) {
                    view = View.inflate(MessageActivity.this, R.layout.relatives_view_message_care_item, null);
                    dVar = new d();
                    dVar.e = (ImageView) view.findViewById(R.id.icon);
                    dVar.a = (TextView) view.findViewById(R.id.username);
                    dVar.b = (TextView) view.findViewById(R.id.notice);
                    dVar.c = (TextView) view.findViewById(R.id.notice_time);
                    TextView textView = (TextView) view.findViewById(R.id.care_button);
                    dVar.d = textView;
                    textView.setOnClickListener(MessageActivity.this);
                    view.setTag(dVar);
                } else {
                    dVar = (d) view.getTag();
                }
                if (DifferenceManager.isBuildMidong()) {
                    dVar.d.setTextColor(ContextCompat.getColor(MessageActivity.this, R.color.relatives_common_light_color));
                    dVar.d.setBackgroundDrawable(ContextCompat.getDrawable(MessageActivity.this, R.drawable.relatives_msg_friend_corner_rect));
                } else {
                    dVar.d.setTextColor(ContextCompat.getColor(MessageActivity.this, R.color.relatives_common_subject_mifit));
                    dVar.d.setBackgroundDrawable(ContextCompat.getDrawable(MessageActivity.this, R.drawable.relatives_msg_friend_corner_rect_mifit));
                }
                MessageActivity messageActivity = MessageActivity.this;
                ImageView imageView = dVar.e;
                String str = item.icon;
                int i2 = R.drawable.relatives_setting_avatar_default;
                OtherUtils.loadWithGlideCircle(messageActivity, imageView, str, i2, i2);
                dVar.a.setText(item.fromUsername);
                dVar.b.setText(MessageActivity.this.getString(R.string.relatives_label_care_time_by_other, new Object[]{item.count + ""}));
                dVar.c.setText(TimeUtils.formatDateTime(RelationExternalsKt.getFriendsAndFamilyInjectDelegate().getAppContext(), item.updateTime.longValue()));
                dVar.d.setTag(item);
            } else if (itemViewType == 1) {
                if (view == null || view.getTag() == null || !(view.getTag() instanceof c)) {
                    view = View.inflate(MessageActivity.this, R.layout.relatives_view_message_add_item, null);
                    cVar = new c();
                    cVar.j = (ImageView) view.findViewById(R.id.icon);
                    cVar.a = (TextView) view.findViewById(R.id.username);
                    cVar.b = (TextView) view.findViewById(R.id.notice);
                    cVar.c = (TextView) view.findViewById(R.id.notice_time);
                    cVar.d = (TextView) view.findViewById(R.id.ok_button);
                    cVar.e = (TextView) view.findViewById(R.id.refuse_button);
                    cVar.f = (TextView) view.findViewById(R.id.refuse_and_ignore_button);
                    cVar.h = view.findViewById(R.id.action_panel);
                    cVar.i = (TextView) view.findViewById(R.id.agree_flag);
                    cVar.g = view.findViewById(R.id.delete);
                    view.setTag(cVar);
                } else {
                    cVar = (c) view.getTag();
                }
                if (DifferenceManager.isBuildMidong()) {
                    cVar.d.setTextColor(ContextCompat.getColor(MessageActivity.this, R.color.relatives_common_light_color));
                    cVar.d.setBackgroundDrawable(ContextCompat.getDrawable(MessageActivity.this, R.drawable.relatives_msg_friend_corner_rect));
                } else {
                    cVar.d.setTextColor(ContextCompat.getColor(MessageActivity.this, R.color.relatives_common_subject_mifit));
                    cVar.d.setBackgroundDrawable(ContextCompat.getDrawable(MessageActivity.this, R.drawable.relatives_msg_friend_corner_rect_mifit));
                }
                cVar.a.setText(item.fromUsername);
                cVar.c.setText(TimeUtils.formatDateTime(RelationExternalsKt.getFriendsAndFamilyInjectDelegate().getAppContext(), item.updateTime.longValue()));
                cVar.b.setText(R.string.relatives_label_request_add_friend);
                cVar.g.setVisibility(g(item) ? 0 : 8);
                cVar.g.setOnClickListener(MessageActivity.this);
                cVar.g.setTag(item);
                MessageActivity messageActivity2 = MessageActivity.this;
                ImageView imageView2 = cVar.j;
                String str2 = item.icon;
                int i3 = R.drawable.relatives_setting_avatar_default;
                OtherUtils.loadWithGlideCircle(messageActivity2, imageView2, str2, i3, i3);
                if (item.status.intValue() == 0) {
                    cVar.h.setVisibility(0);
                    cVar.i.setVisibility(8);
                    cVar.d.setTag(item);
                    cVar.e.setTag(item);
                    cVar.f.setTag(item);
                    cVar.d.setOnClickListener(MessageActivity.this);
                    cVar.e.setOnClickListener(MessageActivity.this);
                    cVar.f.setOnClickListener(MessageActivity.this);
                } else if (item.status.intValue() == 3) {
                    cVar.i.setText(R.string.relatives_label_accepted);
                    cVar.i.setVisibility(0);
                    cVar.h.setVisibility(8);
                } else if (item.status.intValue() == 2) {
                    cVar.i.setText(R.string.relatives_label_refused);
                    cVar.i.setVisibility(0);
                    cVar.h.setVisibility(8);
                } else if (item.status.intValue() == 4) {
                    cVar.i.setText(R.string.relatives_label_refused_ignored);
                    cVar.i.setVisibility(0);
                    cVar.h.setVisibility(8);
                }
            } else if (itemViewType == 2) {
                if (view == null || view.getTag() == null || !(view.getTag() instanceof f)) {
                    view = View.inflate(MessageActivity.this, R.layout.relatives_view_message_refuse_item, null);
                    fVar = new f();
                    fVar.a = (ImageView) view.findViewById(R.id.icon);
                    fVar.c = (TextView) view.findViewById(R.id.username);
                    fVar.b = (TextView) view.findViewById(R.id.notice_time);
                    fVar.d = (TextView) view.findViewById(R.id.notice);
                    view.setTag(fVar);
                } else {
                    fVar = (f) view.getTag();
                }
                MessageActivity messageActivity3 = MessageActivity.this;
                ImageView imageView3 = fVar.a;
                String str3 = item.icon;
                int i4 = R.drawable.relatives_setting_avatar_default;
                OtherUtils.loadWithGlideCircle(messageActivity3, imageView3, str3, i4, i4);
                if (item.type.intValue() == 3) {
                    fVar.d.setText(R.string.relatives_label_accept_add_friend_by_him);
                } else {
                    fVar.d.setText(R.string.relatives_label_refuse_add_friend_by_him);
                }
                fVar.c.setText(item.fromUsername);
                fVar.b.setText(TimeUtils.formatDateTime(RelationExternalsKt.getFriendsAndFamilyInjectDelegate().getAppContext(), item.updateTime.longValue()));
            }
            return view;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public int getViewTypeCount() {
            return 3;
        }

        public void h(long j) {
            Iterator<FriendMessage> it2 = this.a.iterator();
            while (it2.hasNext()) {
                if (it2.next().fromUid.equals(String.valueOf(j))) {
                    it2.remove();
                }
            }
            notifyDataSetInvalidated();
        }

        public void i(FriendMessage friendMessage) {
            if (friendMessage == null) {
                return;
            }
            FriendMessage friendMessageF = f(friendMessage.fromUid, friendMessage.type.intValue());
            if (friendMessageF == null) {
                this.a.add(0, friendMessage);
                return;
            }
            friendMessageF.status = friendMessage.status;
            friendMessageF.updateTime = friendMessage.updateTime;
            friendMessageF.count = friendMessage.count;
            friendMessageF.type = friendMessage.type;
            friendMessageF.fromUid = friendMessage.fromUid;
            friendMessageF.fromUsername = friendMessage.fromUsername;
        }
    }

    public static class f {
        public ImageView a;
        public TextView b;
        public TextView c;
        public TextView d;
    }

    public static Intent createIntent(Context context) {
        return new Intent(context, (Class<?>) MessageActivity.class);
    }

    private void hideProgressDialog() {
        LoadingDialog loadingDialog = this.C;
        if (loadingDialog == null || !loadingDialog.isShowing()) {
            return;
        }
        this.C.hide();
        this.C.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void q(DialogInterface dialogInterface, int i) {
        FriendManager.getInstance().writeUserGuideState(this, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void r() {
        showView(false);
        this.A.notifyDataSetChanged();
    }

    public boolean isAppAlive() {
        return ((CreatedActivityClassNames) PrivacyProvider.get("亲友消息push是直接跳转到详情页，没有先跳转MainActivity。所以退出该页面时，需要判断主页面是否存活，从而判断是否启动MainActivity", CreatedActivityClassNames.class)).getValue().contains(ConstantKt.MAINTABACTIVITY_CLASS_PATH);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (1 == i && i2 == -1) {
            String stringExtra = intent.getStringExtra("username");
            if (TextUtils.isEmpty(stringExtra)) {
                return;
            }
            long longExtra = intent.getLongExtra("userid", -1L);
            for (FriendMessage friendMessage : this.A.d()) {
                if (friendMessage.fromUid.equals(String.valueOf(longExtra))) {
                    friendMessage.fromUsername = stringExtra;
                }
            }
            this.A.notifyDataSetChanged();
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        FriendMessage friendMessage = (FriendMessage) view.getTag();
        String str = (friendMessage.getUpdateTime().longValue() / 1000) + "";
        this.D = Long.valueOf(friendMessage.fromUid).longValue();
        if (id == R.id.ok_button) {
            if (!NetUtil.isNetworkConnected(this)) {
                IconToast.showError(this, getString(R.string.relatives_no_network));
                return;
            }
            this.H = true;
            LoadingDialog loadingDialogShowDialog = LoadingDialog.showDialog(this, getString(R.string.relatives_relation_loading));
            this.C = loadingDialogShowDialog;
            loadingDialogShowDialog.show();
            this.B.handleFriendInvited(this, this.D, ActionType.Accept, str);
            return;
        }
        if (id == R.id.refuse_button) {
            if (!NetUtil.isNetworkConnected(this)) {
                IconToast.showError(this, getString(R.string.relatives_no_network));
                return;
            }
            this.H = false;
            this.B.handleFriendInvited(this, this.D, ActionType.Refuse, str);
            LoadingDialog loadingDialogShowDialog2 = LoadingDialog.showDialog(this, getString(R.string.relatives_relation_loading));
            this.C = loadingDialogShowDialog2;
            loadingDialogShowDialog2.show();
            return;
        }
        if (id == R.id.refuse_and_ignore_button) {
            if (!NetUtil.isNetworkConnected(this)) {
                IconToast.showError(this, getString(R.string.relatives_no_network));
                return;
            }
            this.H = false;
            this.B.handleFriendInvited(this, this.D, ActionType.Ignore, str);
            LoadingDialog loadingDialogShowDialog3 = LoadingDialog.showDialog(this, getString(R.string.relatives_relation_loading));
            this.C = loadingDialogShowDialog3;
            loadingDialogShowDialog3.show();
            return;
        }
        if (id == R.id.delete) {
            if (NetUtil.isNetworkConnected(this)) {
                this.B.deleteHistoryMessage(friendMessage.fromUid, str, new a(friendMessage));
                return;
            } else {
                IconToast.showError(this, getString(R.string.relatives_no_network));
                return;
            }
        }
        if (id == R.id.care_button) {
            if (!NetUtil.isNetworkConnected(this)) {
                IconToast.showError(this, getString(R.string.relatives_no_network));
                return;
            }
            if (!this.B.readUserGuideState(this)) {
                new AlertDialogFragment.Builder(this).setMessage(R.string.relatives_friend_new_user_guide).setNeutralButton(R.string.relatives_friend_new_user_guide_ok, new DialogInterface.OnClickListener() { // from class: g05
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        this.a.q(dialogInterface, i);
                    }
                }).show(getSupportFragmentManager());
                return;
            }
            LoadingDialog loadingDialogShowDialog4 = LoadingDialog.showDialog(this, getString(R.string.relatives_relation_loading));
            this.C = loadingDialogShowDialog4;
            loadingDialogShowDialog4.show();
            this.B.sendCareToFriend(this, String.valueOf(this.D), false);
            this.A.notifyDataSetChanged();
        }
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        setTheme(R.style.Theme_App_Zepp);
        super.onCreate(bundle);
        setContentView(R.layout.relatives_activity_message);
        this.x = (ListView) findViewById(R.id.message_list);
        this.y = findViewById(R.id.logo_bracelet);
        this.z = findViewById(R.id.no_data_refresh);
        this.E = findViewById(R.id.toast_view);
        boolean zIsBuildMidong = DifferenceManager.isBuildMidong();
        FriendFragKt.setUnifyTitleStyle(this, getString(R.string.relatives_title_message));
        if (zIsBuildMidong) {
            getTitleTextView().setTextSize(2, 17.0f);
        }
        this.A = new e();
        this.B.clearFriendMessageTable();
        this.B.requestMessages(100);
        LoadingDialog loadingDialogShowDialog = LoadingDialog.showDialog(this, getString(R.string.relatives_relation_loading));
        this.C = loadingDialogShowDialog;
        loadingDialogShowDialog.setCancelable(false);
        this.C.show();
        this.x.setAdapter((ListAdapter) this.A);
        this.x.setOnScrollListener(this);
        MessageManager.getDefault(getApplicationContext()).register(this);
        showView(this.A.getCount() == 0);
        MessageManager.getDefault(this).markHasNewMessage(false);
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        MessageManager.getDefault(getApplicationContext()).unregister(this);
    }

    public void onEvent(EventCareSend eventCareSend) {
        if (Long.valueOf(eventCareSend.uid).longValue() == this.D) {
            this.A.f(eventCareSend.uid, 0).status = 0;
            if (eventCareSend.success) {
                this.C.setSuccess(getString(R.string.relatives_love_success));
            } else {
                hideProgressDialog();
                IconToast.showError(this, getString(R.string.relatives_love_fail));
            }
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4 && keyEvent.getAction() == 0) {
            try {
                if (!isAppAlive()) {
                    Router.build("main/MainTabActivity").with("tab_index", 0).go(this);
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            finish();
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        MessageManager.getDefault(this).markHasNewMessage(false);
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        if (NetUtil.isNetworkConnected(this)) {
            return;
        }
        hideProgressDialog();
        IconToast.showToast(this, R.drawable.relatives_icon_toast_error, getString(R.string.relatives_no_network), 0);
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        this.G = i + i2 == i3;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(AbsListView absListView, int i) {
    }

    @Override // com.xiaomi.hm.health.relation.view.CareButton.OnStatusChangedListener
    public void onStatusChanged(View view, int i) {
        if (i == 2) {
            this.E.setVisibility(0);
            Animation animationLoadAnimation = AnimationUtils.loadAnimation(this, R.anim.relatives_header_notify_in);
            if (animationLoadAnimation != null) {
                this.E.startAnimation(animationLoadAnimation);
            }
            View view2 = this.E;
            view2.postDelayed(new DetailActivity.TooBusyRunnable(view2, this), 1500L);
        }
    }

    public void showView(boolean z) {
        if (z) {
            this.x.setVisibility(8);
            this.y.setVisibility(0);
            this.z.setVisibility(0);
        } else {
            this.y.setVisibility(8);
            this.z.setVisibility(8);
            this.x.setVisibility(0);
        }
    }

    public void onEvent(EventAcceptInvite eventAcceptInvite) {
        FriendMessage friendMessageF = this.A.f(eventAcceptInvite.fromUid, 1);
        if (friendMessageF == null) {
            return;
        }
        long j = this.D;
        if (j <= 0 || j != Long.valueOf(friendMessageF.fromUid).longValue()) {
            return;
        }
        if (eventAcceptInvite.code == 1) {
            this.C.setSuccess(getString(R.string.relatives_refuse_success));
            this.B.requestMessages(100);
        }
        if (eventAcceptInvite.code != 1) {
            if (this.H) {
                IconToast.showError(this, getString(R.string.relatives_focus_fail));
            } else {
                IconToast.showError(this, getString(R.string.relatives_refuse_fail));
            }
            hideProgressDialog();
        } else if (eventAcceptInvite.accepted) {
            this.C.setSuccess(getString(R.string.relatives_focus_success), new b(RemarkActivity.createIntent(this, eventAcceptInvite.friend)));
        }
        this.D = -1L;
    }

    public void onEvent(FriendMessagesEvent friendMessagesEvent) {
        hideProgressDialog();
        if (friendMessagesEvent.getMessageList().isEmpty()) {
            return;
        }
        this.A.d().clear();
        this.A.b(friendMessagesEvent.getMessageList());
        this.x.post(new Runnable() { // from class: h05
            @Override // java.lang.Runnable
            public final void run() {
                this.a.r();
            }
        });
    }
}

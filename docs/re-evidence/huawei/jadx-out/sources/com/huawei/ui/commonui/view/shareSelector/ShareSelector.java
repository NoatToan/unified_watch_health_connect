package com.huawei.ui.commonui.view.shareSelector;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.huawei.ui.commonui.R;
import com.huawei.ui.commonui.healthtextview.HealthTextView;

/* JADX INFO: loaded from: classes16.dex */
public class ShareSelector extends LinearLayout implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f24012a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ShareSelectorClickCallback f24013b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private LinearLayout f24014c;
    private LinearLayout d;
    private LinearLayout e;
    private LinearLayout g;
    private LinearLayout i;

    public ShareSelector(Context context) {
        this(context, null);
    }

    public ShareSelector(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ShareSelector(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f24012a = context;
        c();
    }

    public void setClickCallback(ShareSelectorClickCallback shareSelectorClickCallback) {
        this.f24013b = shareSelectorClickCallback;
    }

    private void c() {
        View viewInflate = ((LayoutInflater) this.f24012a.getSystemService("layout_inflater")).inflate(R.layout.hw_health_share_selector_bar, this);
        this.i = (LinearLayout) viewInflate.findViewById(R.id.share_wechat_chat_layout);
        this.g = (LinearLayout) viewInflate.findViewById(R.id.share_wechat_friends_layout);
        this.f24014c = (LinearLayout) viewInflate.findViewById(R.id.share_weibo_layout);
        this.d = (LinearLayout) viewInflate.findViewById(R.id.share_save_to_local_layout);
        this.e = (LinearLayout) viewInflate.findViewById(R.id.share_more_layout);
        this.i.setClickable(true);
        this.g.setClickable(true);
        this.f24014c.setClickable(true);
        this.d.setClickable(true);
        this.e.setClickable(true);
        this.i.setOnClickListener(this);
        this.g.setOnClickListener(this);
        this.f24014c.setOnClickListener(this);
        this.d.setOnClickListener(this);
        this.e.setOnClickListener(this);
        d(this.g).setImageResource(R.drawable.share_wechat_friends_icon);
        d(this.i).setImageResource(R.drawable.share_wechat_chat_icon);
        d(this.f24014c).setImageResource(R.drawable.share_weibo_icon);
        d(this.e).setImageResource(R.drawable.share_more_icon);
        d(this.d).setImageResource(R.drawable.share_save_local);
        e(this.g).setText(R.string.IDS_plugin_socialshare_wechat_friends);
        e(this.g).setGravity(17);
        e(this.i).setText(R.string.IDS_plugin_socialshare_wechat_chat);
        e(this.i).setGravity(17);
        e(this.f24014c).setText(R.string.IDS_plugin_socialshare_weibo);
        e(this.e).setText(R.string.IDS_user_profile_more);
        e(this.d).setText(R.string.IDS_hwh_show_save_local);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view == null || this.f24013b == null) {
            return;
        }
        int id = view.getId();
        if (id == R.id.share_wechat_chat_layout) {
            this.f24013b.onWeChatShare();
            return;
        }
        if (id == R.id.share_wechat_friends_layout) {
            this.f24013b.onWeChatFriendShare();
            return;
        }
        if (id == R.id.share_weibo_layout) {
            this.f24013b.onSinaShare();
        } else if (id == R.id.share_save_to_local_layout) {
            this.f24013b.onLocalShare();
        } else if (id == R.id.share_more_layout) {
            this.f24013b.onMoreShare();
        }
    }

    public void setShareWeChatVisibility(int i) {
        this.i.setVisibility(i);
    }

    public void setShareWeChatFriendsVisibility(int i) {
        this.g.setVisibility(i);
    }

    public void setSinaVisibility(int i) {
        this.f24014c.setVisibility(i);
    }

    public void setLocalShareVisibility(int i) {
        this.d.setVisibility(i);
    }

    public void setMoreVisibility(int i) {
        this.e.setVisibility(i);
    }

    private HealthTextView e(LinearLayout linearLayout) {
        return (HealthTextView) linearLayout.findViewById(R.id.share_tv);
    }

    public void setMoreLayoutText(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        e(this.e).setText(str);
    }

    private ImageView d(LinearLayout linearLayout) {
        return (ImageView) linearLayout.findViewById(R.id.share_img);
    }
}

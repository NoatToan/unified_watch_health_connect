package com.huawei.healthcloud.plugintrack.trackanimation.shareselector;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.huawei.ui.commonui.R;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.horizontalscrollview.HealthHorizontalScrollView;
import defpackage.jhi;
import health.compact.a.LanguageUtil;

/* JADX INFO: loaded from: classes10.dex */
public class ShareSelector extends LinearLayout implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private LinearLayout f10741a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ShareSelectorClickCallback f10742b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f10743c;
    private int d;
    private LinearLayout e;
    private LinearLayout f;
    private HealthHorizontalScrollView g;
    private LinearLayout h;
    private LinearLayout i;
    private LinearLayout j;
    private LinearLayout k;
    private LinearLayout o;

    public ShareSelector(Context context) {
        this(context, null);
    }

    public ShareSelector(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ShareSelector(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f10743c = context;
        c();
    }

    public void setClickCallback(ShareSelectorClickCallback shareSelectorClickCallback) {
        this.f10742b = shareSelectorClickCallback;
    }

    private void c() {
        this.d = jhi.e(this.f10743c);
        View viewInflate = ((LayoutInflater) this.f10743c.getSystemService("layout_inflater")).inflate(R.layout.hw_health_share_selector_bar, this);
        this.o = (LinearLayout) viewInflate.findViewById(R.id.share_wechat_chat_layout);
        this.f = (LinearLayout) viewInflate.findViewById(R.id.share_wechat_friends_layout);
        this.j = (LinearLayout) viewInflate.findViewById(R.id.share_weibo_layout);
        this.f10741a = (LinearLayout) viewInflate.findViewById(R.id.share_family_layout);
        this.h = (LinearLayout) viewInflate.findViewById(R.id.share_save_to_local_layout);
        this.i = (LinearLayout) viewInflate.findViewById(R.id.share_more_layout);
        this.k = (LinearLayout) viewInflate.findViewById(R.id.share_xhs_layout);
        this.e = (LinearLayout) viewInflate.findViewById(R.id.share_douyin_layout);
        this.g = (HealthHorizontalScrollView) viewInflate.findViewById(R.id.share_container_scroll);
        this.o.setClickable(true);
        this.f.setClickable(true);
        this.j.setClickable(true);
        this.f10741a.setClickable(true);
        this.h.setClickable(true);
        this.i.setClickable(true);
        this.k.setClickable(true);
        this.e.setClickable(true);
        this.o.setOnClickListener(this);
        this.f.setOnClickListener(this);
        this.j.setOnClickListener(this);
        this.f10741a.setOnClickListener(this);
        this.h.setOnClickListener(this);
        this.i.setOnClickListener(this);
        this.k.setOnClickListener(this);
        this.e.setOnClickListener(this);
        this.f10741a.setVisibility(0);
        a(this.f).setImageResource(R.drawable.share_wechat_friends_icon);
        a(this.o).setImageResource(R.drawable.share_wechat_chat_icon);
        a(this.j).setImageResource(R.drawable.share_weibo_icon);
        a(this.f10741a).setImageResource(com.huawei.health.servicesui.R.mipmap.share_familygroup_icon);
        a(this.i).setImageResource(R.drawable.share_more_icon);
        a(this.h).setImageResource(R.mipmap.share_save_local_new);
        a(this.k).setImageResource(R.mipmap.xhs);
        a(this.e).setImageResource(R.mipmap.douyin);
        c(this.f).setText(R.string.IDS_plugin_socialshare_wechat_friends);
        c(this.o).setText(R.string.IDS_plugin_socialshare_wechat_chat);
        c(this.j).setText(R.string.IDS_plugin_socialshare_weibo);
        c(this.f10741a).setText(R.string.IDS_hwh_family_health_zone);
        c(this.i).setText(com.huawei.healthcloud.plugintrack.R.string.IDS_motiontrack_share_activity_btn_text);
        c(this.h).setText(R.string.IDS_hwh_show_save_local);
        c(this.k).setText(R.string.IDS_plugin_socialshare_xhs);
        c(this.e).setText(R.string.IDS_plugin_socialshare_douyin);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view == null || this.f10742b == null) {
            return;
        }
        int id = view.getId();
        if (id == R.id.share_wechat_chat_layout) {
            this.f10742b.onWeChatShare();
            return;
        }
        if (id == R.id.share_wechat_friends_layout) {
            this.f10742b.onWeChatFriendShare();
            return;
        }
        if (id == R.id.share_weibo_layout) {
            this.f10742b.onSinaShare();
            return;
        }
        if (id == R.id.share_family_layout) {
            this.f10742b.onFamilyShare();
            return;
        }
        if (id == R.id.share_save_to_local_layout) {
            this.f10742b.onLocalShare();
            return;
        }
        if (id == R.id.share_more_layout) {
            this.f10742b.onMoreShare();
        } else if (id == R.id.share_xhs_layout) {
            this.f10742b.onXHSShare();
        } else if (id == R.id.share_douyin_layout) {
            this.f10742b.onDouYinShare();
        }
    }

    public void setShareWeChatVisibility(int i) {
        this.o.setVisibility(i);
    }

    public void setShareWeChatFriendsVisibility(int i) {
        this.f.setVisibility(i);
    }

    public void setSinaVisibility(int i) {
        this.j.setVisibility(i);
    }

    public void setFamilyVisibility(int i) {
        this.f10741a.setVisibility(i);
    }

    public void setLocalShareVisibility(int i) {
        this.h.setVisibility(i);
    }

    public void setXHSShareVisibility(int i) {
        this.k.setVisibility(i);
    }

    public void setDouYinShareVisibility(int i) {
        this.e.setVisibility(i);
    }

    public void setMoreVisibility(int i) {
        this.i.setVisibility(i);
    }

    private HealthTextView c(LinearLayout linearLayout) {
        return (HealthTextView) linearLayout.findViewById(R.id.share_tv);
    }

    public void setMoreLayoutText(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        c(this.i).setText(str);
    }

    private ImageView a(LinearLayout linearLayout) {
        return (ImageView) linearLayout.findViewById(R.id.share_img);
    }

    public void e() {
        setVisibility(0);
        post(new Runnable() { // from class: jgz
            @Override // java.lang.Runnable
            public final void run() {
                this.f38602a.b();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b() {
        HealthHorizontalScrollView healthHorizontalScrollView = this.g;
        if (healthHorizontalScrollView != null) {
            healthHorizontalScrollView.smoothScrollTo(LanguageUtil.ba(this.f10743c) ? this.d : 0, 0);
        }
    }
}

package com.huawei.pluginsocialshare.view;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Toast;
import com.huawei.haf.application.BaseApplication;
import com.huawei.hms.kit.awareness.status.CapabilityStatus;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginsocialshare.R;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import defpackage.gxt;
import defpackage.lrp;
import defpackage.lsv;
import defpackage.pjm;
import defpackage.pmo;
import defpackage.pnq;
import defpackage.pns;
import defpackage.qqf;
import defpackage.qrs;
import health.compact.a.CommonUtil;
import health.compact.a.EnvironmentInfo;
import health.compact.a.LogAnonymous;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageParams;
import health.compact.a.Utils;
import java.util.HashMap;

/* JADX INFO: loaded from: classes15.dex */
public class ShareButtonView extends RelativeLayout implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private View f22611a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f22612b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private DoBeforeClick f22613c;
    private View d;
    private View e;
    private LinearLayout f;
    private LinearLayout g;
    private View h;
    private String i;
    private pjm j;
    private gxt k;
    private LinearLayout l;
    private View m;
    private LinearLayout n;
    private LinearLayout o;
    private LinearLayout p;
    private LinearLayout q;
    private LinearLayout r;
    private LinearLayout s;
    private LinearLayout t;
    private gxt x;
    private HashMap<String, String> y;

    public interface DoBeforeClick {
        void onBeforeClick();
    }

    public ShareButtonView(Context context) {
        super(context);
        this.y = new HashMap<>();
        c(context);
    }

    public ShareButtonView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.y = new HashMap<>();
        c(context);
    }

    public ShareButtonView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.y = new HashMap<>();
        c(context);
    }

    public void setShareBackground(int i) {
        View view = this.e;
        if (view == null) {
            return;
        }
        view.setBackgroundColor(i);
    }

    private void c(Context context) {
        this.f22612b = context;
        View viewInflate = View.inflate(context, R.layout.activity_share_layout, this);
        this.m = viewInflate;
        View viewFindViewById = viewInflate.findViewById(R.id.dst_selector_list);
        this.e = viewFindViewById;
        this.t = (LinearLayout) viewFindViewById.findViewById(R.id.share_wechat_friends_layout);
        this.p = (LinearLayout) this.e.findViewById(R.id.share_wechat_chat_layout);
        this.q = (LinearLayout) this.e.findViewById(R.id.share_xiaohongshu_layout);
        this.l = (LinearLayout) this.e.findViewById(R.id.share_douyin_layout);
        this.s = (LinearLayout) this.e.findViewById(R.id.share_weibo_layout);
        this.o = (LinearLayout) this.e.findViewById(R.id.share_family_group_layout);
        this.r = (LinearLayout) this.e.findViewById(R.id.share_more_layout);
        this.n = (LinearLayout) this.e.findViewById(R.id.share_save_pdf_layout);
        this.f = (LinearLayout) this.e.findViewById(R.id.share_print_layout);
        this.g = (LinearLayout) this.e.findViewById(R.id.share_save_to_local_layout);
        this.n.setVisibility(8);
        this.f.setVisibility(8);
        int iD = qrs.d(context, 0.0f);
        a(this.p, iD);
        a(this.t, iD);
        a(this.q, iD);
        a(this.l, iD);
        a(this.s, iD);
        a(this.o, iD);
        a(this.g, iD);
        if (EnvironmentInfo.m()) {
            this.r.setVisibility(8);
            this.g.setVisibility(8);
        }
        a(this.r, 0);
        b(this.t).setImageResource(R.drawable.share_wechat_friends_icon);
        b(this.p).setImageResource(R.drawable.share_wechat_chat_icon);
        ImageView imageViewB = b(this.q);
        ImageView imageViewB2 = b(this.l);
        imageViewB.setImageDrawable(pns.b(imageViewB));
        imageViewB2.setImageDrawable(pns.e(imageViewB2));
        b(this.s).setImageResource(R.drawable.share_weibo_icon);
        b(this.o).setImageResource(R.mipmap.share_familygroup_icon);
        b(this.r).setImageResource(R.drawable.share_more_icon);
        b(this.g).setImageResource(R.mipmap.share_save_local_new);
        d(this.t).setText(R.string.IDS_plugin_socialshare_wechat_friends);
        d(this.p).setText(R.string.IDS_plugin_socialshare_wechat_chat);
        d(this.q).setText(R.string.IDS_plugin_socialshare_xhs);
        d(this.l).setText(R.string.IDS_plugin_socialshare_douyin);
        d(this.s).setText(R.string.IDS_plugin_socialshare_weibo);
        d(this.o).setText(R.string.IDS_hwh_family_health_zone);
        d(this.r).setText(R.string.IDS_user_profile_more_new);
        d(this.g).setText(R.string.IDS_hwh_show_save_local);
        this.t.setOnClickListener(this);
        this.p.setOnClickListener(this);
        this.q.setOnClickListener(this);
        this.l.setOnClickListener(this);
        this.g.setOnClickListener(this);
        this.s.setOnClickListener(this);
        this.o.setOnClickListener(this);
        this.r.setOnClickListener(this);
    }

    private void a(LinearLayout linearLayout, int i) {
        if (linearLayout != null && (linearLayout.getLayoutParams() instanceof LinearLayout.LayoutParams)) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) linearLayout.getLayoutParams();
            layoutParams.setMarginEnd(i);
            linearLayout.setLayoutParams(layoutParams);
            return;
        }
        LogUtil.j("Share_ShareButtonView", "linearLayout is null or layoutParams isn't the instance of LinearLauout.LayoutParams");
    }

    public void setMap(HashMap<String, String> map) {
        this.y = map;
    }

    public void setBeforeClick(DoBeforeClick doBeforeClick) {
        this.f22613c = doBeforeClick;
    }

    private ImageView b(LinearLayout linearLayout) {
        return (ImageView) linearLayout.findViewById(R.id.share_img);
    }

    private HealthTextView d(LinearLayout linearLayout) {
        return (HealthTextView) linearLayout.findViewById(R.id.share_tv);
    }

    public void setOverSeaLayout() {
        this.e.setVisibility(8);
        View viewInflate = View.inflate(this.f22612b, R.layout.share_buttom_view, this);
        this.m = viewInflate;
        View viewFindViewById = viewInflate.findViewById(R.id.oversea_share_layout);
        this.f22611a = viewFindViewById;
        viewFindViewById.setVisibility(0);
        HealthButton healthButton = (HealthButton) this.m.findViewById(R.id.oversea_save_local_btn);
        HealthButton healthButton2 = (HealthButton) this.m.findViewById(R.id.oversea_share_btn);
        healthButton.setOnClickListener(this);
        healthButton2.setOnClickListener(this);
    }

    public void setPerViewImage(View view) {
        this.h = view;
    }

    public void setLogLayout(View view) {
        this.d = view;
    }

    public void setShareContent(gxt gxtVar) {
        if (gxtVar == null) {
            LogUtil.e("Share_ShareButtonView", "call setShareContent please ShareContent before!");
            return;
        }
        if (gxtVar.aa() == 0) {
            LogUtil.e("Share_ShareButtonView", "call setShareContent please setShareType before!");
            return;
        }
        this.k = gxtVar;
        if (!Utils.o() || this.k.u() == 7) {
            return;
        }
        setOverSeaLayout();
    }

    public void setToShareContent(gxt gxtVar) {
        if (gxtVar == null) {
            LogUtil.e("Share_ShareButtonView", "call setShareContent please ShareContent before!");
        } else {
            this.x = gxtVar;
        }
    }

    public void setShareWeChatFriendsVisibility(int i) {
        LinearLayout linearLayout = this.t;
        if (linearLayout != null) {
            linearLayout.setVisibility(i);
        }
    }

    public void setShareXhsVisibility(int i) {
        LinearLayout linearLayout = this.q;
        if (linearLayout != null) {
            linearLayout.setVisibility(i);
        }
    }

    public void setShareDouyinVisibility(int i) {
        LinearLayout linearLayout = this.l;
        if (linearLayout != null) {
            linearLayout.setVisibility(i);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        e(view);
    }

    private void e(View view) {
        if (qrs.c(500)) {
            LogUtil.a("Share_ShareButtonView", "onClick() if (isClickFast())");
            return;
        }
        gxt shareContent = getShareContent();
        if (shareContent == null) {
            return;
        }
        if (this.j == null) {
            this.j = pjm.d();
        }
        int id = view.getId();
        if (id == R.id.share_save_to_local_layout || id == R.id.oversea_save_local_btn) {
            LogUtil.a("Share_ShareButtonView", "share_save_to_local_layout");
            pjm pjmVar = this.j;
            Context contextJ = this.f22612b;
            if (!(contextJ instanceof Activity)) {
                contextJ = BaseApplication.j();
            }
            pjmVar.a(contextJ, 4, shareContent);
            b();
            return;
        }
        if (!CommonUtil.ab(com.huawei.hwcommonmodel.application.BaseApplication.getContext())) {
            Toast.makeText(this.f22612b, getResources().getString(R.string.IDS_connect_error), 0).show();
            return;
        }
        if (id == R.id.share_wechat_friends_layout) {
            LogUtil.a("Share_ShareButtonView", "share_wechat_friends_layout");
            this.j.a(this.f22612b, 1, shareContent);
            b();
            return;
        }
        if (id == R.id.share_wechat_chat_layout) {
            LogUtil.a("Share_ShareButtonView", "share_wechat_chat_layout");
            this.j.a(this.f22612b, 2, shareContent);
            b();
            return;
        }
        if (id == R.id.share_xiaohongshu_layout) {
            LogUtil.a("Share_ShareButtonView", "share_xiaohongshu_layout");
            this.j.a(this.f22612b, 10, shareContent);
            b();
            return;
        }
        if (id == R.id.share_douyin_layout) {
            LogUtil.a("Share_ShareButtonView", "share_douyin_layout");
            this.j.a(this.f22612b, 11, shareContent);
            b();
            return;
        }
        if (id == R.id.share_weibo_layout) {
            LogUtil.a("Share_ShareButtonView", "share_weibo_layout");
            this.j.a(this.f22612b, 3, shareContent);
            b();
            return;
        }
        if (id == R.id.share_family_group_layout) {
            LogUtil.a("Share_ShareButtonView", "share_family_group_layout");
            this.j.a(this.f22612b, 6, shareContent);
            b();
        } else {
            if (id == R.id.share_more_layout || id == R.id.oversea_share_btn) {
                pjm pjmVar2 = this.j;
                Context contextJ2 = this.f22612b;
                if (!(contextJ2 instanceof Activity)) {
                    contextJ2 = BaseApplication.j();
                }
                pjmVar2.a(contextJ2, 5, shareContent);
                b();
                return;
            }
            if (id == R.id.background_layout) {
                LogUtil.a("Share_ShareButtonView", "click background_layout, destroy!");
                d();
            } else {
                LogUtil.a("Share_ShareButtonView", "click outside activity! viewId:", Integer.valueOf(id));
            }
        }
    }

    private void d() {
        Context context = this.f22612b;
        if (context instanceof Activity) {
            ((Activity) context).finish();
        }
    }

    private void b() {
        DoBeforeClick doBeforeClick = this.f22613c;
        if (doBeforeClick != null) {
            doBeforeClick.onBeforeClick();
        }
        HashMap<String, String> map = this.y;
        if (map.size() == 0) {
            return;
        }
        String str = map.get("currentSportType");
        String str2 = map.get("shareLastRecommend" + str);
        String str3 = map.get("shareLastBackground" + str);
        String str4 = map.get("shareLastDataMark" + str);
        SharedPreferenceManager.e(this.f22612b, Integer.toString(20002), "shareLastRecommend" + str, str2, new StorageParams());
        SharedPreferenceManager.e(this.f22612b, Integer.toString(20002), "shareLastBackground" + str, str3, new StorageParams());
        SharedPreferenceManager.e(this.f22612b, Integer.toString(20002), "shareLastDataMark" + str, str4, new StorageParams());
        String str5 = map.get("shareLastSportDataAndMarkV2" + str);
        SharedPreferenceManager.e(this.f22612b, Integer.toString(20002), "shareLastSportDataAndMarkV2" + str, str5, new StorageParams());
        pmo.e(Integer.parseInt(str), pjm.b());
        SharedPreferenceManager.e(this.f22612b, Integer.toString(CapabilityStatus.AWA_CAP_CODE_DARK_MODE), "shareLastBackground" + str, "1001", new StorageParams());
        String str6 = map.get("shareLastTab" + str);
        if (TextUtils.isEmpty(str6)) {
            return;
        }
        try {
            pns.a("shareLastTab" + str, Integer.parseInt(str6));
        } catch (NumberFormatException e) {
            LogUtil.e("Share_ShareButtonView", "initFragments exception", LogAnonymous.b(e));
        }
    }

    private gxt getShareContent() {
        gxt gxtVar = this.x;
        if (gxtVar != null) {
            return gxtVar;
        }
        gxt gxtVar2 = this.k;
        if (gxtVar2 == null) {
            LogUtil.e("Share_ShareButtonView", "use ShareButtonView please call method setShareContent before!");
            return null;
        }
        gxtVar2.f(false);
        gxt gxtVarC = c(this.k);
        this.k = gxtVarC;
        return gxtVarC;
    }

    private gxt c(gxt gxtVar) {
        if (this.h == null) {
            LogUtil.e("Share_ShareButtonView", "use ShareButtonView please call method setPerViewImage before!");
            return null;
        }
        if (this.d == null) {
            LogUtil.e("Share_ShareButtonView", "use ShareButtonView please call method setLogLayout before!");
            return null;
        }
        Object objClone = gxtVar.clone();
        if (objClone instanceof gxt) {
            gxtVar = (gxt) objClone;
        }
        Bitmap bitmapE = lsv.e(this.h);
        if (bitmapE == null) {
            return gxtVar;
        }
        Bitmap bitmapE2 = qqf.e(bitmapE, 0, pnq.c(this.d), bitmapE.getHeight());
        LogUtil.a("Share_ShareButtonView", "onClick: screenCut: ", bitmapE2);
        if (bitmapE2 == null) {
            LogUtil.j("Share_ShareButtonView", "onClick: screenCut is null!");
            return gxtVar;
        }
        int iB = pnq.b(bitmapE2);
        LogUtil.a("Share_ShareButtonView", "initView all medal share bitmap size =", Integer.valueOf(iB));
        if ((iB / 1024) / 1024 >= 1) {
            String str = lrp.g + "step_day_detail.jpg";
            this.i = str;
            qqf.b(bitmapE2, str);
            gxtVar.c(this.i);
            gxtVar.e(4);
            return gxtVar;
        }
        gxtVar.d(bitmapE2);
        gxtVar.e(1);
        return gxtVar;
    }
}

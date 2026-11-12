package com.huawei.pluginmessagecenter.adapter;

import android.content.Context;
import android.text.TextUtils;
import android.text.format.DateFormat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bumptech.glide.request.RequestOptions;
import com.huawei.health.messagecenter.model.MessageConstant;
import com.huawei.health.messagecenter.model.MessageObject;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginmessagecenter.R;
import com.huawei.pluginmessagecenter.listener.OnItemVisibleListener;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import defpackage.ltb;
import defpackage.njy;
import defpackage.php;
import defpackage.qqf;
import defpackage.qqp;
import defpackage.qqr;
import defpackage.qrk;
import health.compact.a.LanguageUtil;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes14.dex */
public class MessageDetailAdapter extends BaseAdapter {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f22413b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<MessageObject> f22414c;
    private OnItemVisibleListener<View, MessageObject> e;

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i;
    }

    public MessageDetailAdapter(Context context, List<MessageObject> list) {
        this.f22414c = list;
        this.f22413b = context;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f22414c.size();
    }

    @Override // android.widget.Adapter
    public Object getItem(int i) {
        if (i >= this.f22414c.size() || i < 0) {
            LogUtil.a("MessageDetailAdapter", "getItem = ", Integer.valueOf(i));
            return null;
        }
        return this.f22414c.get(i);
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        d dVar;
        if (!njy.c(this.f22414c, i)) {
            LogUtil.j("MessageDetailAdapter", "getView outOfBounds, position = ", Integer.valueOf(i));
            return null;
        }
        MessageObject messageObject = this.f22414c.get(i);
        if (view == null) {
            LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.f22413b);
            if (String.valueOf(14).equalsIgnoreCase(messageObject.getModule())) {
                view = layoutInflaterFrom.inflate(R.layout.message_detail_layout, (ViewGroup) null);
                dVar = new d();
                dVar.h = (HealthTextView) view.findViewById(R.id.message_detail_title_tv);
                dVar.f22416b = (HealthTextView) view.findViewById(R.id.message_detail_content_tv);
                dVar.f22417c = (HealthTextView) view.findViewById(R.id.message_detail_date_tv);
                dVar.f = (ImageView) view.findViewById(R.id.iv_message_content);
                dVar.e = (ImageView) view.findViewById(R.id.iv_icon);
                dVar.f22415a = (ImageView) view.findViewById(R.id.iv_arrow);
                view.setTag(dVar);
            } else {
                view = layoutInflaterFrom.inflate(R.layout.message_detail_text_layout, (ViewGroup) null);
                dVar = new d();
                dVar.h = (HealthTextView) view.findViewById(R.id.message_detail_title_tv);
                dVar.j = (HealthTextView) view.findViewById(R.id.message_detail_text_subtitle_tv);
                dVar.f22416b = (HealthTextView) view.findViewById(R.id.message_detail_text_content_tv);
                dVar.d = (TextView) view.findViewById(R.id.message_detail_text_detail_tv);
                dVar.f22417c = (HealthTextView) view.findViewById(R.id.message_detail_date_tv);
                dVar.e = (ImageView) view.findViewById(R.id.iv_icon);
                dVar.f22415a = (ImageView) view.findViewById(R.id.iv_arrow);
                view.setTag(dVar);
            }
        } else {
            dVar = (d) view.getTag();
        }
        a(dVar, messageObject, view, i);
        return view;
    }

    private void a(d dVar, MessageObject messageObject, View view, int i) {
        OnItemVisibleListener<View, MessageObject> onItemVisibleListener;
        dVar.h.setText(messageObject.getInfoClassify());
        long createTime = String.valueOf(90).equals(messageObject.getModule()) ? messageObject.getCreateTime() : messageObject.getReceiveTime();
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(createTime);
        dVar.f22417c.setText(d(calendar.getTime()) + " " + qrk.a(BaseApplication.getContext(), createTime, 1));
        LogUtil.a("MessageDetailAdapter", "icon = ", Integer.valueOf(php.e(messageObject.getModule())));
        dVar.e.setImageDrawable(BaseApplication.getContext().getResources().getDrawable(php.e(messageObject.getModule())));
        if (String.valueOf(14).equalsIgnoreCase(messageObject.getModule())) {
            dVar.f22416b.setText(messageObject.getMsgTitle());
            String imgUri = messageObject.getImgUri();
            LogUtil.a("MessageDetailAdapter", "imgUri = ", imgUri);
            if (!imgUri.equals((String) dVar.f.getTag(R.id.imageloader_uri))) {
                dVar.f.setImageResource(R.mipmap.pic_recommend_empty);
            }
            if (!TextUtils.isEmpty(imgUri)) {
                dVar.f.setTag(R.id.imageloader_uri, imgUri);
                c(this.f22413b, imgUri, dVar.f, 4);
            }
        } else {
            dVar.f22416b.setText(messageObject.getMsgContent());
            c(dVar, null);
            dVar.j.setText(a(messageObject));
            boolean z = String.valueOf(90).equals(messageObject.getModule()) && TextUtils.isEmpty(messageObject.getDetailUri());
            if (String.valueOf(19).equals(messageObject.getModule()) && MessageConstant.VIEWING_OR_ENDED_LOCATION_MSG.equals(messageObject.getType())) {
                dVar.d.setText(this.f22413b.getResources().getString(R.string.IDS_hw_setting_permissions));
            }
            dVar.d.setVisibility(z ? 4 : 0);
        }
        if (LanguageUtil.ba(this.f22413b)) {
            dVar.f22415a.setImageResource(R.drawable.common_ui_arrow_left);
        }
        view.setTag(R.layout.message_detail_layout, Long.valueOf(System.currentTimeMillis()));
        if (messageObject.getPageType() != 43 || (onItemVisibleListener = this.e) == null) {
            return;
        }
        onItemVisibleListener.onItemVisible(view, i, messageObject);
    }

    private void c(d dVar, LinearLayout.LayoutParams layoutParams) {
        if (dVar.j.getLayoutParams() instanceof LinearLayout.LayoutParams) {
            layoutParams = (LinearLayout.LayoutParams) dVar.j.getLayoutParams();
        }
        if (layoutParams == null) {
            LogUtil.e("MessageDetailAdapter", "layoutParams=null");
        } else if (LanguageUtil.l(this.f22413b)) {
            layoutParams.setMarginStart(qqp.a(this.f22413b, 8.0f));
            dVar.j.setLayoutParams(layoutParams);
        } else {
            layoutParams.setMarginStart(qqp.a(this.f22413b, 16.0f));
            dVar.j.setLayoutParams(layoutParams);
        }
    }

    private String d(Date date) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(DateFormat.getBestDateTimePattern(Locale.getDefault(), "yyyyMd"));
        if (LanguageUtil.bs(com.huawei.haf.application.BaseApplication.b())) {
            return ltb.g(simpleDateFormat.format(date));
        }
        return simpleDateFormat.format(date);
    }

    private void c(Context context, String str, ImageView imageView, int i) {
        RequestOptions requestOptionsPlaceholder = new RequestOptions().skipMemoryCache(true).transform(new qqr(imageView.getContext().getApplicationContext(), qqp.a(context, i))).placeholder(R.drawable.blank_0911);
        qqf.b(requestOptionsPlaceholder, R.drawable.blank_0911);
        qqf.e(str, requestOptionsPlaceholder, imageView);
    }

    private String a(MessageObject messageObject) {
        if (String.valueOf(30).equalsIgnoreCase(messageObject.getModule())) {
            if (String.valueOf(35).equals(messageObject.getDetailUriExt())) {
                return e(R.string.IDS_hw_messagecenter_reward_notification);
            }
            return e(R.string.IDS_hw_messagecenter_luckydraw_notification);
        }
        if (String.valueOf(40).equalsIgnoreCase(messageObject.getModule())) {
            return e(R.string.IDS_hw_messagecenter_competition_notification);
        }
        if (String.valueOf(15).equalsIgnoreCase(messageObject.getModule())) {
            return e(R.string.IDS_hw_messagecenter_plan_notification);
        }
        if (String.valueOf(17).equalsIgnoreCase(messageObject.getModule()) && messageObject.getMsgId().equals("kakaMessage")) {
            return e(R.string.IDS_hw_kaka_unclaimed);
        }
        if (LanguageUtil.l(this.f22413b)) {
            return "【" + messageObject.getMsgTitle() + "】";
        }
        return messageObject.getMsgTitle();
    }

    private String e(int i) {
        if (LanguageUtil.l(this.f22413b)) {
            return "【" + BaseApplication.getContext().getString(i) + "】";
        }
        return BaseApplication.getContext().getString(i);
    }

    public void d(List<MessageObject> list) {
        this.f22414c = list;
    }

    public void e(OnItemVisibleListener<View, MessageObject> onItemVisibleListener) {
        this.e = onItemVisibleListener;
    }

    static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        ImageView f22415a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        HealthTextView f22416b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        HealthTextView f22417c;
        TextView d;
        ImageView e;
        ImageView f;
        HealthTextView h;
        HealthTextView j;

        private d() {
        }
    }
}

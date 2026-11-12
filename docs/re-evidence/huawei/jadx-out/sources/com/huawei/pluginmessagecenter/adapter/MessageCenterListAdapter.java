package com.huawei.pluginmessagecenter.adapter;

import android.content.Context;
import android.text.TextUtils;
import android.text.format.DateFormat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import com.huawei.health.messagecenter.model.MessageObject;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginachievement.AchieveDataApi;
import com.huawei.pluginmessagecenter.R;
import com.huawei.ui.commonui.divider.HealthDivider;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import defpackage.lmf;
import defpackage.php;
import defpackage.qrs;
import health.compact.a.LanguageUtil;
import health.compact.a.Services;
import health.compact.a.UnitUtil;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes14.dex */
public class MessageCenterListAdapter extends BaseAdapter {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f22408b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<MessageObject> f22409c;

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i;
    }

    public MessageCenterListAdapter(Context context, List<MessageObject> list) {
        this.f22409c = list;
        this.f22408b = context;
    }

    public void e(List<MessageObject> list) {
        this.f22409c = list;
    }

    public void b() {
        if (this.f22409c == null) {
            return;
        }
        for (int i = 0; i < this.f22409c.size(); i++) {
            if ("kakaMessage".equals(this.f22409c.get(i).getMsgId())) {
                this.f22409c.remove(i);
            }
        }
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f22409c.size();
    }

    @Override // android.widget.Adapter
    public Object getItem(int i) {
        if (i >= this.f22409c.size() || i < 0) {
            LogUtil.a("MessageCenterListAdapter", "getItem = ", Integer.valueOf(i));
            return null;
        }
        return this.f22409c.get(i);
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        a aVar;
        if (view == null) {
            view = LayoutInflater.from(this.f22408b).inflate(R.layout.message_center_item, (ViewGroup) null);
            aVar = new a();
            aVar.j = (HealthTextView) view.findViewById(R.id.MessageCenter_titleleft_tv);
            aVar.f22411b = (HealthTextView) view.findViewById(R.id.MessageCenter_content_tv);
            aVar.f22412c = (HealthTextView) view.findViewById(R.id.tv_message_date);
            aVar.e = (ImageView) view.findViewById(R.id.MessageCenter_head_40iv);
            aVar.d = (HealthDivider) view.findViewById(R.id.MessageCenter_content_underline);
            aVar.g = (HealthTextView) view.findViewById(R.id.message_red_num_dot);
            aVar.f22410a = (ImageView) view.findViewById(R.id.iv_arrow);
            view.setTag(aVar);
            aVar.h = (ImageView) view.findViewById(R.id.MessageCenter_titleright_redpoint);
        } else {
            aVar = (a) view.getTag();
        }
        MessageObject messageObject = this.f22409c.get(i);
        aVar.j.setText(messageObject.getMsgTitle());
        String msgContent = messageObject.getMsgContent();
        aVar.f22412c.setText(new SimpleDateFormat(DateFormat.getBestDateTimePattern(Locale.getDefault(), "M/d")).format(new Date(String.valueOf(90).equals(messageObject.getModule()) ? messageObject.getCreateTime() : messageObject.getReceiveTime())));
        aVar.d.setVisibility(i == this.f22409c.size() + (-1) ? 8 : 0);
        if (TextUtils.isEmpty(msgContent)) {
            aVar.f22411b.setVisibility(8);
        } else {
            aVar.f22411b.setVisibility(0);
            aVar.f22411b.setText(msgContent);
        }
        if (messageObject.getImgUri() == null) {
            aVar.e.setImageDrawable(this.f22408b.getResources().getDrawable(R.drawable.ic_default_message_icon));
            return view;
        }
        a(aVar, messageObject);
        return view;
    }

    private void a(a aVar, MessageObject messageObject) {
        LogUtil.a("MessageCenterListAdapter", "drawable id:" + php.e(messageObject.getModule()));
        int readFlag = messageObject.getReadFlag();
        AchieveDataApi achieveDataApi = (AchieveDataApi) Services.d("PluginAchievement", AchieveDataApi.class);
        if (messageObject.getModule().equals(String.valueOf(17)) && achieveDataApi != null && achieveDataApi.getKakaTaskRedDot(BaseApplication.getContext())) {
            LogUtil.a("MessageCenterListAdapter", "refreshView, still has unclaimedKaka, unread +1");
            readFlag++;
        }
        String module = messageObject.getModule();
        aVar.h.setVisibility(8);
        if (String.valueOf(14).equals(module) && readFlag > 0) {
            aVar.h.setVisibility(0);
        } else {
            aVar.h.setVisibility(8);
        }
        aVar.e.setImageDrawable(this.f22408b.getResources().getDrawable(php.e(messageObject.getModule())));
        if (!String.valueOf(14).equals(module)) {
            d(readFlag, aVar.g);
        } else {
            aVar.g.setVisibility(8);
        }
        if (LanguageUtil.ba(this.f22408b)) {
            aVar.f22410a.setImageResource(R.drawable.common_ui_arrow_left);
        }
        if (String.valueOf(17).equals(messageObject.getModule())) {
            if (messageObject.getType().equals("kakaExpiration") || readFlag == 2) {
                HashMap map = new HashMap(3);
                map.put("click", 1);
                map.put("event", 0);
                map.put("from", 1);
                lmf.d().c(com.huawei.haf.application.BaseApplication.b(), AnalyticsValue.SUCCESSES_KAKA_1100082.value(), map, 0);
            }
        }
    }

    private void d(int i, HealthTextView healthTextView) {
        LogUtil.a("MessageCenterListAdapter", "Enter setUnreadMessageNum unreadMessageNum:", Integer.valueOf(i));
        if (i <= 0) {
            healthTextView.setVisibility(8);
        } else if (i < 10) {
            healthTextView.setVisibility(0);
            if (qrs.ac()) {
                healthTextView.setTextSize(1, 16.0f);
                healthTextView.setBackgroundResource(R.drawable.messages_red_point_bg_circle_three_fold_fonts);
            } else {
                healthTextView.setBackgroundResource(R.drawable.messages_red_point_bg_circle);
            }
        } else {
            healthTextView.setBackgroundResource(R.drawable.messages_red_point_bg_rectangle);
            healthTextView.setVisibility(0);
        }
        healthTextView.setText(UnitUtil.e(i, 1, 0));
    }

    static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        ImageView f22410a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        HealthTextView f22411b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        HealthTextView f22412c;
        HealthDivider d;
        ImageView e;
        HealthTextView g;
        ImageView h;
        HealthTextView j;

        private a() {
        }
    }
}

package defpackage;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.huawei.health.messagecenter.model.MessageObject;
import com.huawei.health.operationbundle.R;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.viewpager.HealthPagerAdapter;
import com.huawei.ui.main.stories.soical.NewSocialFragment;
import java.lang.ref.WeakReference;
import java.util.List;

/* JADX INFO: loaded from: classes43.dex */
public class wpa extends HealthPagerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f52296a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<MessageObject> f52297b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final woy f52298c;
    private final WeakReference<NewSocialFragment> d;
    private final List<ImageView> e;

    @Override // com.huawei.uikit.hwviewpager.widget.HwPagerAdapter
    public int getItemPosition(Object obj) {
        return -2;
    }

    @Override // com.huawei.uikit.hwviewpager.widget.HwPagerAdapter
    public boolean isViewFromObject(View view, Object obj) {
        return obj == view;
    }

    public wpa(NewSocialFragment newSocialFragment, List<ImageView> list, List<MessageObject> list2, woy woyVar) {
        this.d = new WeakReference<>(newSocialFragment);
        this.f52296a = newSocialFragment.getActivity();
        this.e = list;
        this.f52297b = list2;
        this.f52298c = woyVar;
    }

    @Override // com.huawei.uikit.hwviewpager.widget.HwPagerAdapter
    public int getCount() {
        return this.e.size();
    }

    @Override // com.huawei.uikit.hwviewpager.widget.HwPagerAdapter
    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        if (obj instanceof View) {
            viewGroup.removeView((View) obj);
        }
    }

    @Override // com.huawei.uikit.hwviewpager.widget.HwPagerAdapter
    public Object instantiateItem(ViewGroup viewGroup, int i) {
        NewSocialFragment newSocialFragment = this.d.get();
        if (newSocialFragment == null || !newSocialFragment.isVisible() || newSocialFragment.isRemoving() || newSocialFragment.isDetached()) {
            return null;
        }
        return d(viewGroup, i, this.e);
    }

    private View d(ViewGroup viewGroup, int i, List<ImageView> list) {
        if (njy.e(list, i)) {
            return null;
        }
        View viewB = this.f52298c.b(list.get(i).getDrawable(), viewGroup, i, LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout_new_social_cardview, (ViewGroup) null));
        viewGroup.addView(viewB);
        viewB.setTag(Integer.valueOf(i));
        viewB.setTag(R.layout.layout_new_social_cardview, Long.valueOf(System.currentTimeMillis()));
        if (njy.e(this.f52297b, i)) {
            this.f52298c.c(viewB);
            return viewB;
        }
        MessageObject messageObject = this.f52297b.get(i);
        if (messageObject != null && !TextUtils.isEmpty(messageObject.getMsgId())) {
            c(messageObject, viewB);
        }
        return viewB;
    }

    private void c(MessageObject messageObject, View view) {
        if (messageObject instanceof tsr) {
            tsr tsrVar = (tsr) messageObject;
            TextView textView = (TextView) view.findViewById(R.id.card_txt_btn);
            if (tsrVar.a()) {
                osg osgVarB = tsrVar.b();
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setCornerRadius(this.f52296a.getResources().getDimensionPixelSize(R.dimen.health_common_14dp));
                gradientDrawable.setColor(Color.parseColor(osgVarB.y()));
                textView.setBackgroundDrawable(gradientDrawable);
                this.f52298c.b(osgVarB, textView);
            }
            textView.setVisibility(tsrVar.a() ? 0 : 8);
        }
        Context context = this.f52296a;
        if (context instanceof BaseActivity) {
            view.setOnClickListener(qji.b(new woy.e(this.f52298c, messageObject), (BaseActivity) context, this.f52298c.b().isNotSupportBrowseUrl(messageObject.getDetailUri()), AnalyticsValue.SOCIAL_1070004.value()));
        } else {
            view.setOnClickListener(new woy.e(this.f52298c, messageObject));
        }
    }
}

package com.garmin.android.apps.connectmobile.social;

import a51.m;
import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import c22.p0;
import com.garmin.android.apps.connectmobile.social.conversationservice.model.ConversationCommentDTO;
import com.garmin.android.apps.connectmobile.view.UserLevelImageView;
import cs1.h;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.joda.time.DateTime;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001BO\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/garmin/android/apps/connectmobile/social/e;", "Landroid/widget/ArrayAdapter;", "Lcom/garmin/android/apps/connectmobile/social/conversationservice/model/ConversationCommentDTO;", "Landroid/app/Activity;", "mActivity", "", "mOwnerDisplayName", "", "mCommentList", "Landroid/view/View$OnClickListener;", "mLikeUnlikeCommentOnClickListener", "mRemoveCommentOnClickListener", "mViewCommentLikesOnClickListener", "", "mDisableSocial", "mTaggingEnabled", "<init>", "(Landroid/app/Activity;Ljava/lang/String;Ljava/util/List;Landroid/view/View$OnClickListener;Landroid/view/View$OnClickListener;Landroid/view/View$OnClickListener;ZZ)V", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e extends ArrayAdapter<ConversationCommentDTO> {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f44576m = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Activity f44577a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f44578b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<ConversationCommentDTO> f44579c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final View.OnClickListener f44580d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final View.OnClickListener f44581e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final View.OnClickListener f44582f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f44583g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f44584h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f44585i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f44586j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f44587k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ArrayList f44588l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Activity activity, String str, List<ConversationCommentDTO> list, View.OnClickListener onClickListener, View.OnClickListener onClickListener2, View.OnClickListener onClickListener3, boolean z14, boolean z15) {
        super(activity, R.layout.simple_list_item_2, list);
        activity.getClass();
        list.getClass();
        onClickListener.getClass();
        onClickListener2.getClass();
        onClickListener3.getClass();
        this.f44577a = activity;
        this.f44578b = str;
        this.f44579c = list;
        this.f44580d = onClickListener;
        this.f44581e = onClickListener2;
        this.f44582f = onClickListener3;
        this.f44583g = z14;
        this.f44584h = z15;
        this.f44585i = ((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).getUserDisplayName();
        this.f44586j = activity.getColor(com.garmin.android.apps.connectmobile.R.color.gcm_text_secondary_disabled);
        this.f44587k = activity.getColor(com.garmin.android.apps.connectmobile.R.color.gcm_text_primary_action);
        this.f44588l = new ArrayList();
    }

    public final void a(String str) {
        str.getClass();
        this.f44588l.remove(str);
        notifyDataSetChanged();
    }

    public final int c(String str) {
        List<ConversationCommentDTO> list = this.f44579c;
        int size = list != null ? list.size() : 0;
        for (int i14 = 0; i14 < size; i14++) {
            list.getClass();
            if (s.g(list.get(i14).f44546a, str)) {
                return i14;
            }
        }
        return -1;
    }

    public final void d(String str) {
        str.getClass();
        this.f44588l.add(str);
        notifyDataSetChanged();
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i14, View view2, ViewGroup viewGroup) {
        d.a aVar;
        viewGroup.getClass();
        ConversationCommentDTO item = getItem(i14);
        if (view2 == null) {
            view2 = this.f44577a.getLayoutInflater().inflate(com.garmin.android.apps.connectmobile.R.layout.gcm_social_comment_list_item_3_0, viewGroup, false);
            aVar = new d.a();
            View viewFindViewById = view2.findViewById(com.garmin.android.apps.connectmobile.R.id.comment_row_display_picture);
            viewFindViewById.getClass();
            aVar.f44565a = (UserLevelImageView) viewFindViewById;
            View viewFindViewById2 = view2.findViewById(com.garmin.android.apps.connectmobile.R.id.comment_row_like_count);
            viewFindViewById2.getClass();
            aVar.f44570f = (TextView) viewFindViewById2;
            View viewFindViewById3 = view2.findViewById(com.garmin.android.apps.connectmobile.R.id.comment_row_progress);
            viewFindViewById3.getClass();
            aVar.f44574j = (ProgressBar) viewFindViewById3;
            View viewFindViewById4 = view2.findViewById(com.garmin.android.apps.connectmobile.R.id.comment_row_like_icon);
            viewFindViewById4.getClass();
            aVar.f44572h = (ImageView) viewFindViewById4;
            View viewFindViewById5 = view2.findViewById(com.garmin.android.apps.connectmobile.R.id.comment_row_like_layout);
            viewFindViewById5.getClass();
            aVar.f44573i = (LinearLayout) viewFindViewById5;
            View viewFindViewById6 = view2.findViewById(com.garmin.android.apps.connectmobile.R.id.comment_row_like_unlike_btn);
            viewFindViewById6.getClass();
            aVar.f44569e = (TextView) viewFindViewById6;
            View viewFindViewById7 = view2.findViewById(com.garmin.android.apps.connectmobile.R.id.comment_row_delete_btn);
            viewFindViewById7.getClass();
            aVar.f44571g = (TextView) viewFindViewById7;
            View viewFindViewById8 = view2.findViewById(com.garmin.android.apps.connectmobile.R.id.comment_row_display_name);
            viewFindViewById8.getClass();
            aVar.f44566b = (TextView) viewFindViewById8;
            View viewFindViewById9 = view2.findViewById(com.garmin.android.apps.connectmobile.R.id.comment_row_comment_body);
            viewFindViewById9.getClass();
            aVar.f44567c = (TextView) viewFindViewById9;
            View viewFindViewById10 = view2.findViewById(com.garmin.android.apps.connectmobile.R.id.comment_row_creation_time);
            viewFindViewById10.getClass();
            aVar.f44568d = (TextView) viewFindViewById10;
            view2.setTag(aVar);
        } else {
            Object tag = view2.getTag();
            tag.getClass();
            aVar = (d.a) tag;
        }
        if (item != null) {
            d.f44564a.getClass();
            String str = this.f44585i;
            str.getClass();
            UserLevelImageView userLevelImageView = aVar.f44565a;
            userLevelImageView.getClass();
            Context context = userLevelImageView.getContext();
            aVar.f44575k = item;
            UserLevelImageView userLevelImageView2 = aVar.f44565a;
            if (userLevelImageView2 != null) {
                b12.b bVar = item.f44561p;
                bVar.getClass();
                userLevelImageView2.setProfileImageData(bVar);
            }
            boolean z14 = true;
            boolean z15 = item.f44557l > 0;
            TextView textView = aVar.f44570f;
            textView.getClass();
            textView.setVisibility(z15 ? 0 : 4);
            TextView textView2 = aVar.f44570f;
            textView2.getClass();
            textView2.setText(String.valueOf(item.f44557l));
            ImageView imageView = aVar.f44572h;
            imageView.getClass();
            imageView.setVisibility(z15 ? 0 : 4);
            int i15 = item.f44556k ? com.garmin.android.apps.connectmobile.R.color.gcm_icon_primary_action : com.garmin.android.apps.connectmobile.R.color.gcm_icon_secondary;
            ImageView imageView2 = aVar.f44572h;
            imageView2.getClass();
            imageView2.setImageResource(com.garmin.android.apps.connectmobile.R.drawable.favorite_fill);
            ImageView imageView3 = aVar.f44572h;
            imageView3.getClass();
            imageView3.setImageTintList(ColorStateList.valueOf(a7.b.getColor(context, i15)));
            LinearLayout linearLayout = aVar.f44573i;
            linearLayout.getClass();
            linearLayout.setVisibility(z15 ? 0 : 4);
            LinearLayout linearLayout2 = aVar.f44573i;
            linearLayout2.getClass();
            linearLayout2.setOnClickListener(this.f44582f);
            LinearLayout linearLayout3 = aVar.f44573i;
            linearLayout3.getClass();
            linearLayout3.setTag(aVar);
            TextView textView3 = aVar.f44569e;
            textView3.getClass();
            textView3.setText(item.f44556k ? com.garmin.android.apps.connectmobile.R.string.lbl_unlike : com.garmin.android.apps.connectmobile.R.string.lbl_like);
            TextView textView4 = aVar.f44569e;
            textView4.getClass();
            textView4.setOnClickListener(this.f44580d);
            TextView textView5 = aVar.f44569e;
            textView5.getClass();
            textView5.setTag(aVar);
            TextView textView6 = aVar.f44571g;
            textView6.getClass();
            textView6.setOnClickListener(this.f44581e);
            TextView textView7 = aVar.f44571g;
            textView7.getClass();
            textView7.setTag(aVar);
            boolean z16 = item.f44560o;
            TextView textView8 = aVar.f44569e;
            if (z16) {
                textView8.getClass();
                textView8.setEnabled(false);
                TextView textView9 = aVar.f44571g;
                textView9.getClass();
                textView9.setEnabled(false);
            } else {
                textView8.getClass();
                textView8.setEnabled(true);
                TextView textView10 = aVar.f44571g;
                textView10.getClass();
                textView10.setEnabled(true);
            }
            boolean z17 = this.f44583g;
            if (z17) {
                TextView textView11 = aVar.f44571g;
                textView11.getClass();
                textView11.setVisibility(8);
            } else {
                if (!str.equals(item.f44550e) && !str.equals(this.f44578b)) {
                    z14 = false;
                }
                TextView textView12 = aVar.f44571g;
                textView12.getClass();
                textView12.setVisibility(z14 ? 0 : 4);
            }
            TextView textView13 = aVar.f44569e;
            textView13.getClass();
            textView13.setVisibility(z17 ? 8 : 0);
            TextView textView14 = aVar.f44566b;
            textView14.getClass();
            textView14.setText(p0.a(item.f44551f, item.f44550e));
            String str2 = item.f44555j;
            List<mo1.a> list = item.f44562q;
            list.getClass();
            if (list.isEmpty() || !this.f44584h) {
                TextView textView15 = aVar.f44567c;
                textView15.getClass();
                if (TextUtils.isEmpty(str2)) {
                    str2 = "";
                }
                textView15.setText(str2);
            } else {
                TextView textView16 = aVar.f44567c;
                textView16.getClass();
                List<mo1.a> list2 = item.f44562q;
                list2.getClass();
                context.getClass();
                textView16.setText(h.c(list2, context, new m(context, 9)));
                TextView textView17 = aVar.f44567c;
                textView17.getClass();
                textView17.setMovementMethod(LinkMovementMethod.getInstance());
            }
            Date date = item.f44549d;
            if (date == null || date.getTime() <= 0) {
                TextView textView18 = aVar.f44568d;
                textView18.getClass();
                textView18.setText("");
            } else {
                context.getClass();
                String strO = xy2.b.o(context, new DateTime(item.f44549d.getTime()));
                TextView textView19 = aVar.f44568d;
                textView19.getClass();
                textView19.setText(strO);
            }
        }
        item.getClass();
        boolean zContains = this.f44588l.contains(item.f44546a);
        ProgressBar progressBar = aVar.f44574j;
        if (progressBar != null) {
            progressBar.setVisibility(zContains ? 0 : 4);
        }
        TextView textView20 = aVar.f44570f;
        if (textView20 != null) {
            textView20.setTextColor(item.f44556k ? this.f44587k : this.f44586j);
        }
        TextView textView21 = aVar.f44571g;
        if (textView21 != null) {
            textView21.setEnabled(!zContains);
        }
        TextView textView22 = aVar.f44569e;
        if (textView22 != null) {
            textView22.setEnabled(!zContains);
        }
        if (zContains) {
            view2.setOnClickListener(null);
            return view2;
        }
        view2.setOnClickListener(new cw2.b(3, this, item));
        return view2;
    }
}

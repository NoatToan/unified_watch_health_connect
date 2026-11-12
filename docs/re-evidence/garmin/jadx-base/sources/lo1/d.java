package lo1;

import android.content.Context;
import android.content.res.ColorStateList;
import android.database.DataSetObserver;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import c22.p0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.social.conversationservice.model.ConversationCommentDTO;
import com.garmin.android.apps.connectmobile.social.conversationservice.model.VivoKidChallengeConversationCommentDTO;
import com.garmin.android.apps.connectmobile.view.UserLevelImageView;
import java.util.ArrayList;
import java.util.Date;
import org.joda.time.DateTime;
import uu.i0;

/* JADX INFO: loaded from: classes10.dex */
public class d<T extends ListAdapter> extends BaseAdapter {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Context f114017e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ArrayList f114018f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public T f114019g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final InterfaceC2172d f114020h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public lo1.c f114021i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f114023k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f114024l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f114013a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f114014b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f114015c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f114016d = 2;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f114022j = true;

    public class a extends DataSetObserver {
        public a() {
        }

        @Override // android.database.DataSetObserver
        public final void onChanged() {
            super.onChanged();
            d.this.notifyDataSetChanged();
        }
    }

    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view2) {
            InterfaceC2172d interfaceC2172d = d.this.f114020h;
            if (interfaceC2172d != null) {
                interfaceC2172d.A5();
            }
        }
    }

    public class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public TextView f114027a;

        public c(d dVar) {
        }
    }

    /* JADX INFO: renamed from: lo1.d$d, reason: collision with other inner class name */
    public interface InterfaceC2172d {
        void A5();

        void a0(ConversationCommentDTO conversationCommentDTO);

        void y0(ConversationCommentDTO conversationCommentDTO);
    }

    public class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public ViewGroup f114028a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public UserLevelImageView f114029b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public TextView f114030c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public TextView f114031d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public TextView f114032e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public TextView f114033f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public ImageView f114034g;

        public e(d dVar) {
        }
    }

    public d(Context context, InterfaceC2172d interfaceC2172d) {
        this.f114017e = context;
        this.f114020h = interfaceC2172d;
    }

    public final void a(String str, String str2, String str3) {
        if (this.f114018f != null) {
            for (int i14 = 0; i14 < this.f114018f.size(); i14++) {
                ConversationCommentDTO conversationCommentDTO = (ConversationCommentDTO) this.f114018f.get(i14);
                if (str.equals(conversationCommentDTO.f44547b) && str2.equals(conversationCommentDTO.f44546a) && str3.equals(conversationCommentDTO.f44548c)) {
                    this.f114018f.remove(i14);
                    return;
                }
            }
        }
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        int size;
        if (this.f114022j) {
            ArrayList arrayList = this.f114018f;
            size = arrayList != null ? arrayList.size() + 2 : 1;
        } else {
            size = 0;
        }
        T t7 = this.f114019g;
        return t7 != null ? t7.getCount() + size : size;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i14) {
        ArrayList arrayList;
        ArrayList arrayList2;
        T t7 = this.f114019g;
        if (t7 == null) {
            if (i14 == 0 || (arrayList = this.f114018f) == null || i14 == arrayList.size() + 1) {
                return null;
            }
            return this.f114018f.get(i14 - 1);
        }
        int count = t7.getCount();
        T t14 = this.f114019g;
        if (i14 < count) {
            return t14.getItem(i14);
        }
        int count2 = i14 - t14.getCount();
        if (count2 == 0 || (arrayList2 = this.f114018f) == null || count2 == arrayList2.size() + 1) {
            return null;
        }
        return this.f114018f.get(count2 - 1);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i14) {
        return i14;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final int getItemViewType(int i14) {
        T t7 = this.f114019g;
        if (t7 != null) {
            int count = t7.getCount();
            T t14 = this.f114019g;
            if (i14 < count) {
                return t14.getItemViewType(i14);
            }
            i14 -= t14.getCount();
        }
        if (i14 == 0) {
            return this.f114014b;
        }
        ArrayList arrayList = this.f114018f;
        return (arrayList == null || i14 != arrayList.size() + 1) ? this.f114015c : this.f114016d;
    }

    @Override // android.widget.Adapter
    public final View getView(int i14, View view2, ViewGroup viewGroup) {
        c cVar;
        c cVar2;
        ArrayList arrayList;
        e eVar;
        int i15;
        int itemViewType = getItemViewType(i14);
        int i16 = this.f114015c;
        Context context = this.f114017e;
        if (itemViewType != i16) {
            if (itemViewType == this.f114014b) {
                if (view2 == null) {
                    view2 = LayoutInflater.from(context).inflate(R.layout.view_previous_comments_list_item_3_0, viewGroup, false);
                    cVar2 = new c(this);
                    cVar2.f114027a = (TextView) view2.findViewById(R.id.view_previous_comments);
                    view2.setTag(cVar2);
                } else {
                    cVar2 = (c) view2.getTag();
                }
                if (!this.f114024l || (arrayList = this.f114018f) == null || arrayList.isEmpty()) {
                    cVar2.f114027a.setVisibility(8);
                } else {
                    cVar2.f114027a.setVisibility(0);
                }
                cVar2.f114027a.setOnClickListener(new b());
                return view2;
            }
            if (itemViewType != this.f114016d) {
                T t7 = this.f114019g;
                return t7 != null ? t7.getView(i14, view2, viewGroup) : view2;
            }
            if (view2 == null) {
                view2 = LayoutInflater.from(context).inflate(R.layout.activity_list_footer, viewGroup, false);
                cVar = new c(this);
                TextView textView = (TextView) view2.findViewById(R.id.footer_text);
                cVar.f114027a = textView;
                textView.setText(R.string.social_commeting_no_longer_available_message);
                cVar.f114027a.setBackgroundColor(a7.b.getColor(context, R.color.gcm_surface_3));
                view2.setTag(cVar);
            } else {
                cVar = (c) view2.getTag();
            }
            if (this.f114023k) {
                ArrayList arrayList2 = this.f114018f;
                if ((arrayList2 != null ? arrayList2.size() : 0) != 0) {
                    cVar.f114027a.setVisibility(0);
                    return view2;
                }
            }
            cVar.f114027a.setVisibility(8);
            return view2;
        }
        if (view2 == null) {
            view2 = LayoutInflater.from(context).inflate(R.layout.comments_list_item_3_0, viewGroup, false);
            eVar = new e(this);
            eVar.f114028a = (ViewGroup) view2.findViewById(R.id.comment_container);
            eVar.f114029b = (UserLevelImageView) view2.findViewById(R.id.comment_profile_image);
            eVar.f114030c = (TextView) view2.findViewById(R.id.comment_author);
            eVar.f114031d = (TextView) view2.findViewById(R.id.comment_text);
            eVar.f114032e = (TextView) view2.findViewById(R.id.comment_post_time);
            eVar.f114033f = (TextView) view2.findViewById(R.id.comment_likes_count);
            eVar.f114034g = (ImageView) view2.findViewById(R.id.comment_liked);
            int iC = (int) c22.b.c(context, context.getResources().getDimension(R.dimen.icon_default), 1.5f);
            eVar.f114034g.getLayoutParams().width = iC;
            eVar.f114034g.getLayoutParams().height = iC;
            view2.setTag(eVar);
        } else {
            eVar = (e) view2.getTag();
        }
        ConversationCommentDTO conversationCommentDTO = (ConversationCommentDTO) getItem(i14);
        lo1.e eVar2 = new lo1.e(this, conversationCommentDTO);
        if (!(conversationCommentDTO instanceof VivoKidChallengeConversationCommentDTO) || (i15 = ((VivoKidChallengeConversationCommentDTO) conversationCommentDTO).f44563r) == -1) {
            eVar.f114029b.setProfileImageData(conversationCommentDTO.f44561p);
        } else {
            eVar.f114029b.setImageUrl(i0.d(i15));
        }
        eVar.f114029b.setOnClickListener(eVar2);
        eVar.f114030c.setText(p0.a(conversationCommentDTO.f44551f, conversationCommentDTO.f44550e));
        eVar.f114030c.setOnClickListener(eVar2);
        eVar.f114031d.setText(conversationCommentDTO.f44555j);
        Date date = conversationCommentDTO.f44549d;
        if (date != null) {
            DateTime dateTime = new DateTime(date);
            eVar.f114032e.setVisibility(0);
            eVar.f114032e.setText(xy2.b.p(context, dateTime, dateTime, false, false));
        } else {
            eVar.f114032e.setVisibility(4);
        }
        int i17 = conversationCommentDTO.f44557l;
        TextView textView2 = eVar.f114033f;
        if (i17 > 0) {
            textView2.setVisibility(0);
            eVar.f114033f.setText(String.valueOf(i17));
        } else {
            textView2.setVisibility(4);
        }
        eVar.f114033f.setOnClickListener(new f(this, conversationCommentDTO));
        if (this.f114023k && i17 == 0) {
            eVar.f114034g.setVisibility(8);
        } else {
            eVar.f114034g.setVisibility(0);
        }
        eVar.f114034g.setEnabled(!this.f114023k);
        eVar.f114034g.setImageResource(conversationCommentDTO.f44556k ? R.drawable.favorite_fill : R.drawable.favorite_outline);
        eVar.f114034g.setImageTintList(ColorStateList.valueOf(a7.b.getColor(context, R.color.gcm_icon_primary_action)));
        eVar.f114034g.setOnClickListener(new g(this, conversationCommentDTO));
        if (this.f114021i != null) {
            eVar.f114028a.setOnLongClickListener(new h(this, conversationCommentDTO));
        }
        return view2;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final int getViewTypeCount() {
        T t7 = this.f114019g;
        if (t7 == null) {
            this.f114014b = 0;
            this.f114015c = 1;
            this.f114016d = 2;
            return 3;
        }
        int viewTypeCount = t7.getViewTypeCount() + 3;
        int viewTypeCount2 = this.f114019g.getViewTypeCount();
        this.f114014b = viewTypeCount2;
        this.f114015c = viewTypeCount2 + 1;
        this.f114016d = viewTypeCount2 + 2;
        return viewTypeCount;
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public final boolean isEnabled(int i14) {
        T t7 = this.f114019g;
        if (t7 == null || i14 >= t7.getCount()) {
            return getItemViewType(i14) != this.f114014b;
        }
        return this.f114019g.isEnabled(i14);
    }
}

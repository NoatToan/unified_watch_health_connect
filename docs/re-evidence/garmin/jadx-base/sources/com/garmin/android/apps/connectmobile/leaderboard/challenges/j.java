package com.garmin.android.apps.connectmobile.leaderboard.challenges;

import android.content.Context;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.leaderboard.challenges.AdHocChallengePlayersActivity;
import com.garmin.android.apps.connectmobile.view.UserLevelImageView;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001:\u0004\t\n\u000b\fB\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\r"}, d2 = {"Lcom/garmin/android/apps/connectmobile/leaderboard/challenges/j;", "Lh32/k;", "Lot0/a;", "Landroid/content/Context;", "mContext", "Lcom/garmin/android/apps/connectmobile/leaderboard/challenges/j$a;", "mChallengeParticipantsListListener", "<init>", "(Landroid/content/Context;Lcom/garmin/android/apps/connectmobile/leaderboard/challenges/j$a;)V", "a", "d", "c", "b", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class j extends h32.k<ot0.a> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Context f37619d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a f37620e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final LayoutInflater f37621f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f37622g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final SparseBooleanArray f37623h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f37624i;

    public interface a {
        void k1(AdHocChallengePlayersActivity.b bVar);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/leaderboard/challenges/j$c;", "", "<init>", "(Lcom/garmin/android/apps/connectmobile/leaderboard/challenges/j;)V", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public View f37625a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public TextView f37626b;

        public c(j jVar) {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/leaderboard/challenges/j$d;", "", "<init>", "(Lcom/garmin/android/apps/connectmobile/leaderboard/challenges/j;)V", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public UserLevelImageView f37627a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public TextView f37628b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public CheckBox f37629c;

        public d(j jVar) {
        }
    }

    static {
        new b(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(Context context, a aVar) {
        super(context);
        context.getClass();
        this.f37619d = context;
        this.f37620e = aVar;
        Object systemService = context.getSystemService("layout_inflater");
        systemService.getClass();
        this.f37621f = (LayoutInflater) systemService;
        this.f37622g = true;
        this.f37623h = new SparseBooleanArray();
    }

    @Override // h32.k
    public final View c(ViewGroup viewGroup) {
        viewGroup.getClass();
        View viewInflate = this.f37621f.inflate(R.layout.ad_hoc_challenge_participants_list_item_footer_3_0, viewGroup, false);
        c cVar = new c(this);
        cVar.f37625a = viewInflate.findViewById(R.id.footer_view_container);
        cVar.f37626b = (TextView) viewInflate.findViewById(R.id.footer_view_text);
        viewInflate.setTag(cVar);
        return viewInflate;
    }

    @Override // h32.k
    public final View f(ViewGroup viewGroup) {
        viewGroup.getClass();
        View viewInflate = this.f37621f.inflate(R.layout.gcm_adhoc_challenge_player_info_layout, viewGroup, false);
        d dVar = new d(this);
        dVar.f37627a = (UserLevelImageView) viewInflate.findViewById(R.id.player_image);
        dVar.f37628b = (TextView) viewInflate.findViewById(R.id.player_name);
        dVar.f37629c = (CheckBox) viewInflate.findViewById(R.id.player_check_box);
        viewInflate.setTag(dVar);
        return viewInflate;
    }

    @Override // h32.k
    public final void g(int i14, View view2) {
        view2.getClass();
        Object tag = view2.getTag();
        tag.getClass();
        c cVar = (c) tag;
        Context context = this.f37619d;
        if (i14 == 0) {
            TextView textView = cVar.f37626b;
            textView.getClass();
            textView.setText(context.getString(R.string.social_all_participants));
            TextView textView2 = cVar.f37626b;
            textView2.getClass();
            final int i15 = 0;
            textView2.setOnClickListener(new View.OnClickListener(this) { // from class: mt0.c0

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ com.garmin.android.apps.connectmobile.leaderboard.challenges.j f120553b;

                {
                    this.f120553b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    switch (i15) {
                        case 0:
                            com.garmin.android.apps.connectmobile.leaderboard.challenges.j.a aVar = this.f120553b.f37620e;
                            aVar.getClass();
                            aVar.k1(AdHocChallengePlayersActivity.b.ALL_PARTICIPANTS);
                            break;
                        default:
                            com.garmin.android.apps.connectmobile.leaderboard.challenges.j.a aVar2 = this.f120553b.f37620e;
                            aVar2.getClass();
                            aVar2.k1(AdHocChallengePlayersActivity.b.ALL_WAITING_FOR_RESPONSE);
                            break;
                    }
                }
            });
        } else if (i14 == 1) {
            TextView textView3 = cVar.f37626b;
            textView3.getClass();
            textView3.setText(context.getString(R.string.social_all_waiting_for_response));
            TextView textView4 = cVar.f37626b;
            textView4.getClass();
            final int i16 = 1;
            textView4.setOnClickListener(new View.OnClickListener(this) { // from class: mt0.c0

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ com.garmin.android.apps.connectmobile.leaderboard.challenges.j f120553b;

                {
                    this.f120553b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    switch (i16) {
                        case 0:
                            com.garmin.android.apps.connectmobile.leaderboard.challenges.j.a aVar = this.f120553b.f37620e;
                            aVar.getClass();
                            aVar.k1(AdHocChallengePlayersActivity.b.ALL_PARTICIPANTS);
                            break;
                        default:
                            com.garmin.android.apps.connectmobile.leaderboard.challenges.j.a aVar2 = this.f120553b.f37620e;
                            aVar2.getClass();
                            aVar2.k1(AdHocChallengePlayersActivity.b.ALL_WAITING_FOR_RESPONSE);
                            break;
                    }
                }
            });
        }
        if (((h32.k.a) this.f81385b.get(i14)).f81388b.size() < 50 || !this.f37622g) {
            View view3 = cVar.f37625a;
            view3.getClass();
            view3.setVisibility(8);
        } else {
            View view4 = cVar.f37625a;
            view4.getClass();
            view4.setVisibility(0);
        }
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final int getItemViewType(int i14) {
        return 0;
    }

    @Override // h32.k, android.widget.Adapter
    public final View getView(int i14, View view2, ViewGroup viewGroup) {
        viewGroup.getClass();
        return super.getView(i14, view2, viewGroup);
    }

    @Override // h32.k
    public final void h(int i14, View view2) {
        view2.getClass();
        Object tag = view2.getTag();
        tag.getClass();
        d dVar = (d) tag;
        ot0.a item = getItem(i14);
        item.getClass();
        TextView textView = dVar.f37628b;
        textView.getClass();
        textView.setText(c22.p0.a(item.f133712g, item.f133713h));
        if (p005kotlin.jvm.internal.s.g(item.f133714i, Boolean.TRUE)) {
            int i15 = item.f133715j;
            UserLevelImageView userLevelImageView = dVar.f37627a;
            if (userLevelImageView != null) {
                userLevelImageView.setImageUrl(uu.i0.d(i15));
            }
        } else {
            UserLevelImageView userLevelImageView2 = dVar.f37627a;
            if (userLevelImageView2 != null) {
                userLevelImageView2.setProfileImageData(item.f133717l);
            }
        }
        boolean zG = p005kotlin.jvm.internal.s.g(String.valueOf(((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).getUserProfilePk()), item.f133706a);
        if (!this.f37624i || zG) {
            CheckBox checkBox = dVar.f37629c;
            checkBox.getClass();
            checkBox.setVisibility(8);
        } else {
            CheckBox checkBox2 = dVar.f37629c;
            checkBox2.getClass();
            checkBox2.setVisibility(0);
        }
        CheckBox checkBox3 = dVar.f37629c;
        checkBox3.getClass();
        checkBox3.setChecked(this.f37623h.get(i14, false));
    }

    @Override // h32.k, android.widget.Adapter
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public final ot0.a getItem(int i14) {
        Object item = super.getItem(i14);
        if (item instanceof ot0.a) {
            return (ot0.a) item;
        }
        return null;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/leaderboard/challenges/j$b;", "", "<init>", "()V", "", "MAX_PARTICIPANTS_COUNT", "I", "VIEW_TYPE_PLAYER", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private b() {
        }
    }
}

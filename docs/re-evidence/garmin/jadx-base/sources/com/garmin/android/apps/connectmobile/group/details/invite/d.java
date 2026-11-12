package com.garmin.android.apps.connectmobile.group.details.invite;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.view.UserLevelImageView;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import vm0.e;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0002\b\tB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/garmin/android/apps/connectmobile/group/details/invite/d;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Landroid/view/View;", "itemView", "Lcom/garmin/android/apps/connectmobile/group/details/invite/d$a;", "callback", "<init>", "(Landroid/view/View;Lcom/garmin/android/apps/connectmobile/group/details/invite/d$a;)V", "a", "b", "gcm-group_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d extends RecyclerView.f0 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final b f36383j = new b(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f36384a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f36385b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final UserLevelImageView f36386c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextView f36387d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TextView f36388e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Button f36389f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Button f36390g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final TextView f36391h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Button f36392i;

    public interface a {
        void F3(int i14, e eVar);

        void K0(int i14, e eVar);

        void L2(int i14, e eVar);

        void n2(e eVar);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(View view2, a aVar) {
        super(view2);
        view2.getClass();
        aVar.getClass();
        this.f36384a = view2;
        this.f36385b = aVar;
        View viewFindViewById = view2.findViewById(R.id.profile_image_view);
        viewFindViewById.getClass();
        this.f36386c = (UserLevelImageView) viewFindViewById;
        View viewFindViewById2 = view2.findViewById(R.id.user_name_text_view);
        viewFindViewById2.getClass();
        this.f36387d = (TextView) viewFindViewById2;
        View viewFindViewById3 = view2.findViewById(R.id.location_text_view);
        viewFindViewById3.getClass();
        this.f36388e = (TextView) viewFindViewById3;
        View viewFindViewById4 = view2.findViewById(R.id.invite_button);
        viewFindViewById4.getClass();
        this.f36389f = (Button) viewFindViewById4;
        View viewFindViewById5 = view2.findViewById(R.id.accept_button);
        viewFindViewById5.getClass();
        this.f36390g = (Button) viewFindViewById5;
        View viewFindViewById6 = view2.findViewById(R.id.member_text_view);
        viewFindViewById6.getClass();
        this.f36391h = (TextView) viewFindViewById6;
        View viewFindViewById7 = view2.findViewById(R.id.invitation_sent_button);
        viewFindViewById7.getClass();
        this.f36392i = (Button) viewFindViewById7;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/group/details/invite/d$b;", "", "<init>", "()V", "gcm-group_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(j jVar) {
            this();
        }

        private b() {
        }
    }
}

package mt0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.view.UserLevelImageView;
import com.nimbusds.jose.jwk.JWKParameterNames;
import i3.e5;
import java.util.ArrayList;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0005\f\r\u000e\u000f\u0010B)\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0018\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0004\b\n\u0010\u000b¨\u0006\u0011"}, d2 = {"Lmt0/u;", "Lyc/x2;", "Lmt0/t;", "Lmt0/u$e;", "Lcom/garmin/android/apps/connectmobile/leaderboard/model/s;", "challengeActivityType", "Lkotlin/Function2;", "", "", "onItemClicked", "<init>", "(Lcom/garmin/android/apps/connectmobile/leaderboard/model/s;Le23/p;)V", JWKParameterNames.RSA_EXPONENT, "c", "d", "a", "b", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class u extends yc.x2<t, e> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.garmin.android.apps.connectmobile.leaderboard.model.s f120872d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final e23.p<Integer, t, Unit> f120873e;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lmt0/u$a;", "Lyc/a1;", "Lmt0/u$d;", "<init>", "()V", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a extends yc.a1<d> {
        @Override // yc.a1
        public final boolean r(yc.z0 z0Var) {
            z0Var.getClass();
            return (z0Var instanceof yc.z0.c) && z0Var.f196662a;
        }

        @Override // yc.a1
        public final void t(RecyclerView.f0 f0Var, yc.z0 z0Var) {
            z0Var.getClass();
        }

        @Override // yc.a1
        public final RecyclerView.f0 u(ViewGroup viewGroup, yc.z0 z0Var) {
            z0Var.getClass();
            View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout_challenge_invite_follower_activity_type_footer, viewGroup, false);
            ((TextView) viewInflate.findViewById(R.id.message)).setText(R.string.social_challenge_invitation_restriction_hint);
            return new d(viewInflate);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lmt0/u$b;", "Landroidx/recyclerview/widget/RecyclerView$h;", "Lmt0/u$b$a;", "<init>", "()V", "a", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b extends RecyclerView.h<a> {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lmt0/u$b$a;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Landroid/view/View;", "view", "<init>", "(Landroid/view/View;)V", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class a extends RecyclerView.f0 {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(View view2) {
                super(view2);
                view2.getClass();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public final int getItemCount() {
            return 1;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public final void onBindViewHolder(RecyclerView.f0 f0Var, int i14) {
            ((a) f0Var).getClass();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public final RecyclerView.f0 onCreateViewHolder(ViewGroup viewGroup, int i14) {
            View viewE = e5.e(viewGroup, R.layout.gcm_list_header_layout, viewGroup, false);
            viewE.getClass();
            return new a(viewE);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lmt0/u$c;", "Landroidx/recyclerview/widget/o$f;", "Lmt0/t;", "<init>", "()V", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c extends androidx.recyclerview.widget.o.f<t> {
        @Override // androidx.recyclerview.widget.o.f
        public final boolean a(t tVar, t tVar2) {
            t tVar3 = tVar;
            t tVar4 = tVar2;
            tVar3.getClass();
            tVar4.getClass();
            return tVar3.f120864g == tVar4.f120864g;
        }

        @Override // androidx.recyclerview.widget.o.f
        public final boolean b(t tVar, t tVar2) {
            t tVar3 = tVar;
            t tVar4 = tVar2;
            tVar3.getClass();
            tVar4.getClass();
            return tVar3.f120858a == tVar4.f120858a && tVar3.f120863f == tVar4.f120863f;
        }

        @Override // androidx.recyclerview.widget.o.f
        public final Object c(t tVar, t tVar2) {
            t tVar3 = tVar2;
            tVar.getClass();
            tVar3.getClass();
            return tVar3;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lmt0/u$d;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Landroid/view/View;", "view", "<init>", "(Landroid/view/View;)V", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class d extends RecyclerView.f0 {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(View view2) {
            super(view2);
            view2.getClass();
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0004¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lmt0/u$e;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Landroid/view/View;", "view", "Lkotlin/Function2;", "", "Lmt0/t;", "", "onItemClicked", "<init>", "(Landroid/view/View;Le23/p;)V", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class e extends RecyclerView.f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final e23.p<Integer, t, Unit> f120874a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final UserLevelImageView f120875b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final TextView f120876c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final TextView f120877d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final ImageView f120878e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public e(View view2, e23.p<? super Integer, ? super t, Unit> pVar) {
            super(view2);
            view2.getClass();
            pVar.getClass();
            this.f120874a = pVar;
            View viewFindViewById = view2.findViewById(R.id.player_image);
            viewFindViewById.getClass();
            this.f120875b = (UserLevelImageView) viewFindViewById;
            View viewFindViewById2 = view2.findViewById(R.id.player_name);
            viewFindViewById2.getClass();
            this.f120876c = (TextView) viewFindViewById2;
            View viewFindViewById3 = view2.findViewById(R.id.player_follow_status);
            viewFindViewById3.getClass();
            this.f120877d = (TextView) viewFindViewById3;
            View viewFindViewById4 = view2.findViewById(R.id.checkable_row_icon_right);
            viewFindViewById4.getClass();
            this.f120878e = (ImageView) viewFindViewById4;
        }

        public final void d(int i14, t tVar) {
            this.f120876c.setText(c22.p0.a(tVar.f120859b, tVar.f120860c));
            this.f120875b.setProfileImageData(tVar.f120861d);
            boolean z14 = tVar.f120863f;
            ImageView imageView = this.f120878e;
            TextView textView = this.f120877d;
            if (z14) {
                v22.e.q(textView);
                v22.e.l(imageView);
                this.itemView.setOnClickListener(null);
            } else {
                v22.e.l(textView);
                v22.e.r(imageView, tVar.f120864g);
                this.itemView.setOnClickListener(new g62.d0(this, i14, tVar, 2));
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public u(com.garmin.android.apps.connectmobile.leaderboard.model.s sVar, e23.p<? super Integer, ? super t, Unit> pVar) {
        super(new c(), (t13.g) null, (t13.g) null, 6, (p005kotlin.jvm.internal.j) null);
        sVar.getClass();
        pVar.getClass();
        this.f120872d = sVar;
        this.f120873e = pVar;
    }

    public final ArrayList A() {
        List<t> list = u().f196336d;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((t) obj).f120864g) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onBindViewHolder(RecyclerView.f0 f0Var, int i14, List list) {
        e eVar = (e) f0Var;
        eVar.getClass();
        list.getClass();
        if (list.isEmpty() || !(p13.h0.b0(list) instanceof t)) {
            super.onBindViewHolder(eVar, i14, list);
            return;
        }
        Object objB0 = p13.h0.b0(list);
        objB0.getClass();
        eVar.d(i14, (t) objB0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final RecyclerView.f0 onCreateViewHolder(ViewGroup viewGroup, int i14) {
        View viewE = e5.e(viewGroup, R.layout.gcm_adhoc_challenge_player_info_checked_layout, viewGroup, false);
        viewE.getClass();
        return new e(viewE, this.f120873e);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onBindViewHolder(RecyclerView.f0 f0Var, int i14) {
        e eVar = (e) f0Var;
        eVar.getClass();
        t tVarT = t(i14);
        if (tVarT == null) {
            return;
        }
        eVar.d(i14, tVarT);
    }
}

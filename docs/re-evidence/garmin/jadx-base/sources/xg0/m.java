package xg0;

import am.x0;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Layout;
import android.text.SpannableString;
import android.text.StaticLayout;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import c22.s3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.connections.groups.services.model.GroupAnnouncementDTO;
import com.garmin.android.apps.connectmobile.connections.groups.services.model.GroupDTO;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.k1;
import com.garmin.android.apps.connectmobile.view.UserLevelImageView;
import com.garmin.android.apps.connectmobile.view.conversation.CommentView;
import java.util.ArrayList;
import java.util.List;
import lc.u0;
import org.apache.commons.lang3.StringUtils;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.c2;
import p3.p0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0011B=\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lxg0/m;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Lu22/b;", "Landroid/view/View;", "itemView", "Lxg0/a;", "conversationEventListener", "Lxg0/n;", "mediaEventListener", "Lxg0/o;", "postEventListener", "", "fromCommentPage", "Lgo1/a;", "highlightedCommentEventListener", "<init>", "(Landroid/view/View;Lxg0/a;Lxg0/n;Lxg0/o;ZLgo1/a;)V", "a", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class m extends RecyclerView.f0 implements u22.b {
    public static final /* synthetic */ int I0 = 0;
    public final View A;
    public final TextView B;
    public final TextView C;
    public final TextView D;
    public final TextView E;
    public final TextView F;
    public final c2 H0;
    public final TextView I;
    public final View P;
    public final boolean T;
    public final ComposeView X;
    public final r Y;
    public final CommentView Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xg0.a f190789a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f190790b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o f190791c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f190792d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final go1.a f190793e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final View f190794f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final UserLevelImageView f190795g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final TextView f190796h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ImageView f190797i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final TextView f190798j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ImageView f190799k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public final View f190800k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final TextView f190801l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ImageView f190802m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ComposeView f190803n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final View f190804o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final TextView f190805p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ImageView f190806q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ImageView f190807r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ImageView f190808t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final TextView f190809v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final TextView f190810w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final ImageView f190811x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final View f190812y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f190813z;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f190814a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f190815b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f190816c;

        static {
            int[] iArr = new int[com.garmin.android.apps.connectmobile.connections.groups.services.model.f.values().length];
            try {
                iArr[com.garmin.android.apps.connectmobile.connections.groups.services.model.f.GUEST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[com.garmin.android.apps.connectmobile.connections.groups.services.model.f.MEMBER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[com.garmin.android.apps.connectmobile.connections.groups.services.model.f.ADMIN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[com.garmin.android.apps.connectmobile.connections.groups.services.model.f.OWNER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f190814a = iArr;
            int[] iArr2 = new int[wg0.h.values().length];
            try {
                iArr2[wg0.h.ACTIVITY_FEED.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[wg0.h.POST_FEED.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[wg0.h.ANNOUNCEMENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            f190815b = iArr2;
            int[] iArr3 = new int[u22.a.values().length];
            try {
                iArr3[u22.a.NORMAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[u22.a.EditBackgroundCell.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[u22.a.EditFocusCell.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            f190816c = iArr3;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ View f190817a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ m f190818b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ wg0.a f190819c;

        public c(View view2, m mVar, wg0.a aVar) {
            this.f190817a = view2;
            this.f190818b = mVar;
            this.f190819c = aVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            m mVar = this.f190818b;
            mVar.m(mVar.f190809v, this.f190819c);
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"xg0/m$d", "Lcom/garmin/android/apps/connectmobile/view/conversation/CommentView$b;", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class d extends CommentView.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ wg0.b f190821b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ wg0.a f190822c;

        public d(wg0.b bVar, wg0.a aVar) {
            this.f190821b = bVar;
            this.f190822c = aVar;
        }

        @Override // com.garmin.android.apps.connectmobile.view.conversation.CommentView.b
        public final void a() {
            m.this.f190789a.i2(this.f190822c);
        }

        @Override // com.garmin.android.apps.connectmobile.view.conversation.CommentView.b
        public final void b() {
            go1.a aVar = m.this.f190793e;
            if (aVar != null) {
                aVar.n(this.f190821b.f185075j);
            }
        }

        @Override // com.garmin.android.apps.connectmobile.view.conversation.CommentView.b
        public final void c() {
            o oVar = m.this.f190791c;
            wg0.b bVar = this.f190821b;
            oVar.V3(bVar.f185066a, bVar.f185067b);
        }

        @Override // com.garmin.android.apps.connectmobile.view.conversation.CommentView.b
        public final void h() {
            if (s3.b()) {
                return;
            }
            wg0.b bVar = this.f190821b;
            boolean z14 = bVar.f185074i;
            String str = bVar.f185075j;
            m mVar = m.this;
            mVar.Z.setLikeByUser(!z14);
            CommentView commentView = mVar.Z;
            int i14 = bVar.f185073h;
            commentView.setLikeCount(z14 ? i14 - 1 : i14 + 1);
            go1.a aVar = mVar.f190793e;
            if (aVar != null) {
                aVar.o(this.f190822c, str, z14);
            }
        }
    }

    static {
        new a(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(View view2, xg0.a aVar, n nVar, o oVar, boolean z14, go1.a aVar2) {
        super(view2);
        view2.getClass();
        aVar.getClass();
        nVar.getClass();
        oVar.getClass();
        this.f190789a = aVar;
        this.f190790b = nVar;
        this.f190791c = oVar;
        this.f190792d = z14;
        this.f190793e = aVar2;
        View viewFindViewById = view2.findViewById(R.id.post_header);
        viewFindViewById.getClass();
        this.f190794f = viewFindViewById;
        View viewFindViewById2 = view2.findViewById(R.id.profile_image);
        viewFindViewById2.getClass();
        this.f190795g = (UserLevelImageView) viewFindViewById2;
        View viewFindViewById3 = view2.findViewById(R.id.user_display_name);
        viewFindViewById3.getClass();
        this.f190796h = (TextView) viewFindViewById3;
        View viewFindViewById4 = view2.findViewById(R.id.favorite_user_icon);
        viewFindViewById4.getClass();
        this.f190797i = (ImageView) viewFindViewById4;
        View viewFindViewById5 = view2.findViewById(R.id.admin_tag);
        viewFindViewById5.getClass();
        this.f190798j = (TextView) viewFindViewById5;
        View viewFindViewById6 = view2.findViewById(R.id.activity_type_icon);
        viewFindViewById6.getClass();
        ImageView imageView = (ImageView) viewFindViewById6;
        this.f190799k = imageView;
        View viewFindViewById7 = view2.findViewById(R.id.start_time);
        viewFindViewById7.getClass();
        this.f190801l = (TextView) viewFindViewById7;
        View viewFindViewById8 = view2.findViewById(R.id.privacy_icon);
        viewFindViewById8.getClass();
        this.f190802m = (ImageView) viewFindViewById8;
        View viewFindViewById9 = view2.findViewById(R.id.activity_setting_button_compose);
        viewFindViewById9.getClass();
        this.f190803n = (ComposeView) viewFindViewById9;
        View viewFindViewById10 = view2.findViewById(R.id.post_body);
        viewFindViewById10.getClass();
        this.f190804o = viewFindViewById10;
        View viewFindViewById11 = view2.findViewById(R.id.activity_name);
        viewFindViewById11.getClass();
        this.f190805p = (TextView) viewFindViewById11;
        View viewFindViewById12 = view2.findViewById(R.id.race_icon);
        viewFindViewById12.getClass();
        this.f190806q = (ImageView) viewFindViewById12;
        View viewFindViewById13 = view2.findViewById(R.id.favorite_icon);
        viewFindViewById13.getClass();
        this.f190807r = (ImageView) viewFindViewById13;
        View viewFindViewById14 = view2.findViewById(R.id.personal_record_icon);
        viewFindViewById14.getClass();
        this.f190808t = (ImageView) viewFindViewById14;
        View viewFindViewById15 = view2.findViewById(R.id.description);
        viewFindViewById15.getClass();
        this.f190809v = (TextView) viewFindViewById15;
        View viewFindViewById16 = view2.findViewById(R.id.description_more_text);
        viewFindViewById16.getClass();
        this.f190810w = (TextView) viewFindViewById16;
        View viewFindViewById17 = view2.findViewById(R.id.description_more_arrow);
        viewFindViewById17.getClass();
        this.f190811x = (ImageView) viewFindViewById17;
        View viewFindViewById18 = view2.findViewById(R.id.description_more_text_clickable);
        viewFindViewById18.getClass();
        this.f190812y = viewFindViewById18;
        View viewFindViewById19 = view2.findViewById(R.id.activity_stats);
        viewFindViewById19.getClass();
        this.A = viewFindViewById19;
        View viewFindViewById20 = view2.findViewById(R.id.stats_value_1);
        viewFindViewById20.getClass();
        this.B = (TextView) viewFindViewById20;
        View viewFindViewById21 = view2.findViewById(R.id.stats_value_2);
        viewFindViewById21.getClass();
        this.C = (TextView) viewFindViewById21;
        View viewFindViewById22 = view2.findViewById(R.id.stats_value_3);
        viewFindViewById22.getClass();
        this.D = (TextView) viewFindViewById22;
        View viewFindViewById23 = view2.findViewById(R.id.stats_name_1);
        viewFindViewById23.getClass();
        this.E = (TextView) viewFindViewById23;
        View viewFindViewById24 = view2.findViewById(R.id.stats_name_2);
        viewFindViewById24.getClass();
        this.F = (TextView) viewFindViewById24;
        View viewFindViewById25 = view2.findViewById(R.id.stats_name_3);
        viewFindViewById25.getClass();
        this.I = (TextView) viewFindViewById25;
        View viewFindViewById26 = view2.findViewById(R.id.divider_3);
        viewFindViewById26.getClass();
        this.P = viewFindViewById26;
        this.T = s3.b();
        View viewFindViewById27 = view2.findViewById(R.id.media_component);
        viewFindViewById27.getClass();
        this.X = (ComposeView) viewFindViewById27;
        View viewFindViewById28 = view2.findViewById(R.id.social_section);
        viewFindViewById28.getClass();
        Context context = view2.getContext();
        context.getClass();
        this.Y = new r(viewFindViewById28, new do1.o(new l22.a(context)));
        View viewFindViewById29 = view2.findViewById(R.id.highlight_comment_view);
        viewFindViewById29.getClass();
        this.Z = (CommentView) viewFindViewById29;
        View viewFindViewById30 = view2.findViewById(R.id.spacer);
        viewFindViewById30.getClass();
        this.f190800k0 = viewFindViewById30;
        this.H0 = p0.n(Boolean.FALSE);
        if (z14) {
            viewFindViewById30.setVisibility(8);
        }
        Context context2 = imageView.getContext();
        context2.getClass();
        if (c22.b.e(context2)) {
            Resources resources = context2.getResources();
            resources.getClass();
            int iC = (int) c22.b.c(context2, xy2.b.n(resources, 18.0f), 1.5f);
            Resources resources2 = context2.getResources();
            resources2.getClass();
            int iC2 = (int) c22.b.c(context2, xy2.b.n(resources2, 14.0f), 1.5f);
            imageView.getLayoutParams().width = iC;
            imageView.getLayoutParams().height = iC2;
        }
    }

    @Override // u22.b
    public final void b(u22.a aVar) {
        aVar.getClass();
        int i14 = b.f190816c[aVar.ordinal()];
        if (i14 == 1) {
            this.itemView.setAlpha(1.0f);
            View view2 = this.itemView;
            view2.getClass();
            v22.e.i(view2, true);
            return;
        }
        if (i14 != 2) {
            if (i14 == 3) {
                return;
            }
            u0.r();
        } else {
            this.itemView.setAlpha(0.3f);
            View view3 = this.itemView;
            view3.getClass();
            v22.e.i(view3, false);
        }
    }

    public final void d(wg0.a aVar) {
        String str = aVar.f185051j;
        TextView textView = this.f190809v;
        if (str == null || d53.w.J(str)) {
            v22.e.j(textView);
            v22.e.j(this.f190810w);
            v22.e.j(this.f190811x);
        } else {
            v22.e.q(textView);
            if (textView.getMeasuredWidth() > 0) {
                m(textView, aVar);
            } else {
                androidx.core.view.c0.a(textView, new c(textView, this, aVar));
            }
        }
    }

    public final void e(wg0.a aVar) {
        aVar.getClass();
        wg0.m mVar = aVar.f185060t;
        wg0.b bVar = mVar != null ? mVar.f185112e : null;
        CommentView commentView = this.Z;
        if (bVar != null) {
            int i14 = bVar.f185073h;
            String str = bVar.f185069d;
            String str2 = bVar.f185068c;
            if (!this.f190792d) {
                v22.e.q(commentView);
                commentView.setProfileImageData(bVar.f185072g);
                commentView.setAuthorFullName(bVar.f185067b);
                if (bVar.f185071f) {
                    String string = this.itemView.getContext().getString(R.string.social_comment_edited, str2);
                    string.getClass();
                    String string2 = this.itemView.getContext().getString(R.string.social_comment_edited, str);
                    string2.getClass();
                    commentView.setCommentCreatedTime(string);
                    commentView.setCommentCreatedTimeContentDescription(string2);
                } else {
                    commentView.setCommentCreatedTime(str2);
                    commentView.setCommentCreatedTimeContentDescription(str);
                }
                commentView.setSocialEnabled(true);
                if (s3.b()) {
                    boolean z14 = i14 > 0;
                    v22.e.r(commentView.f47635g, z14);
                    v22.e.r(commentView.f47636h, z14 && commentView.likeCount > 0);
                }
                commentView.setLikeCount(i14);
                commentView.setLikeByUser(bVar.f185074i);
                commentView.setCommentBody(SpannableString.valueOf(bVar.f185070e));
                commentView.setOnCommentActionListener(new d(bVar, aVar));
                return;
            }
        }
        v22.e.j(commentView);
    }

    public final void f(wg0.a aVar) {
        aVar.getClass();
        wg0.l lVar = aVar.f185059r;
        ComposeView composeView = this.X;
        if (lVar == null) {
            v22.e.j(composeView);
            return;
        }
        ArrayList arrayListD = lVar.d();
        wg0.d dVar = lVar.f185102a;
        List<ps.i> list = dVar != null ? dVar.f185086i : null;
        composeView.setContent(new z3.e(-718297919, true, new ug2.p(aVar, this, lVar, arrayListD, list == null || list.isEmpty(), 10)));
        v22.e.r(composeView, !arrayListD.isEmpty());
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0058  */
    public final void g(wg0.a aVar, int i14) {
        GroupDTO.c cVar;
        boolean z14;
        aVar.getClass();
        String str = aVar.f185065z;
        String str2 = aVar.f185046e;
        this.f190795g.setProfileImageData(aVar.C);
        String str3 = aVar.f185047f;
        if (d53.w.J(str3)) {
            str3 = str2;
        }
        this.f190796h.setText(str3);
        v22.e.j(this.f190798j);
        x0 x0Var = aVar.f185044c;
        boolean zH = aVar.h();
        ImageView imageView = this.f190797i;
        wg0.h hVar = null;
        ImageView imageView2 = this.f190799k;
        if (zH) {
            v22.e.q(imageView2);
            if (p005kotlin.jvm.internal.s.g(str2, ((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).getUserDisplayName())) {
                bv.b.f21239a.getClass();
                bv.b.a();
                if (k1.f37122a.l0()) {
                    z14 = true;
                } else {
                    z14 = false;
                }
            } else {
                z14 = false;
            }
            imageView2.setImageResource(x0Var.u(z14));
            Context context = imageView2.getContext();
            imageView2.setContentDescription(context.getString(R.string.txt_activity_type) + ", " + dh.b.A(context, x0Var.f4360c));
            if (!p005kotlin.jvm.internal.s.g(aVar.D, Boolean.TRUE) || aVar.j()) {
                v22.e.j(imageView);
            } else {
                v22.e.q(imageView);
                ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
                if (layoutParams == null) {
                    j20.x.l("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                    return;
                }
                int i15 = (int) (20 * context.getResources().getDisplayMetrics().density * context.getResources().getConfiguration().fontScale);
                layoutParams.width = i15;
                layoutParams.height = i15;
                imageView.setLayoutParams(layoutParams);
            }
        } else {
            v22.e.j(imageView2);
            v22.e.j(imageView);
        }
        String str4 = str != null ? str : "";
        TextView textView = this.f190801l;
        textView.setText(str4);
        String str5 = aVar.B;
        if (str5 != null) {
            str = str5;
        } else if (str == null) {
            str = "";
        }
        textView.setContentDescription(str);
        v22.e.r(this.f190802m, aVar.f185050i == am.l.f4048d);
        this.f190794f.setOnClickListener(new k(this, aVar, 1));
        boolean zH2 = aVar.h();
        boolean z15 = this.f190792d;
        boolean z16 = (!zH2 || aVar.f185063x || z15 || aVar.A || this.T) ? false : true;
        boolean z17 = aVar.m() && (aVar.k() || (cVar = aVar.f185062w) == GroupDTO.c.ADMIN || cVar == GroupDTO.c.OWNER) && !z15;
        if (z16) {
            hVar = wg0.h.ACTIVITY_FEED;
        } else if (z17) {
            hVar = wg0.h.POST_FEED;
        }
        wg0.h hVar2 = hVar;
        Integer numValueOf = Integer.valueOf(i14);
        ComposeView composeView = this.f190803n;
        if (hVar2 != null) {
            composeView.setContent(new z3.e(1685308118, true, new l(this, hVar2, numValueOf, aVar, 0)));
        }
        v22.e.r(composeView, z16 || z17);
    }

    public final void h(wg0.a aVar) {
        final wg0.a aVar2;
        aVar.getClass();
        boolean zI = aVar.i();
        final r rVar = this.Y;
        if (zI) {
            rVar.f190831a.setVisibility(8);
            return;
        }
        final boolean z14 = aVar.A;
        ViewGroup viewGroup = rVar.f190834d;
        ViewGroup viewGroup2 = rVar.f190833c;
        final xg0.a aVar3 = this.f190789a;
        aVar3.getClass();
        final wg0.m mVar = aVar.f185060t;
        View view2 = rVar.f190831a;
        if (mVar == null) {
            view2.setVisibility(8);
            return;
        }
        view2.setVisibility(0);
        mVar.f185114g = false;
        rVar.a(mVar, z14);
        v22.e.n(viewGroup2, new wn2.f(mVar, 9, aVar3, aVar));
        if (s3.b()) {
            rVar.f190840j.setVisibility(8);
        }
        View view3 = rVar.f190839i;
        boolean z15 = !z14;
        view3.setEnabled(z15);
        if (view3.isEnabled()) {
            aVar2 = aVar;
            view3.setOnClickListener(new View.OnClickListener() { // from class: xg0.p
                @Override // android.view.View.OnClickListener
                public final void onClick(View view4) {
                    wg0.a aVar4;
                    String strF;
                    wg0.m mVar2 = mVar;
                    if (mVar2.f185114g || (strF = (aVar4 = aVar2).f()) == null) {
                        return;
                    }
                    mVar2.f185114g = true;
                    wg0.a aVarD = wg0.a.d(aVar4);
                    wg0.m mVar3 = aVarD.f185060t;
                    if (mVar3 == null) {
                        return;
                    }
                    mVar3.d();
                    rVar.a(mVar3, z14);
                    boolean z16 = mVar3.f185113f;
                    a aVar5 = aVar3;
                    if (z16) {
                        aVar5.r1(aVarD, strF);
                    } else {
                        aVar5.G1(aVarD);
                    }
                }
            });
        } else {
            aVar2 = aVar;
        }
        String strA = rVar.f190832b.a(mVar.f185108a);
        boolean z16 = !this.f190792d && g22.n.d(strA);
        v22.e.v(viewGroup, z16);
        rVar.f190835e.setText(strA);
        final int i14 = 0;
        v22.e.n(viewGroup, new e23.l() { // from class: xg0.q
            @Override // e23.l
            public final Object invoke(Object obj) {
                View view4 = (View) obj;
                switch (i14) {
                    case 0:
                        view4.getClass();
                        aVar3.Y1(aVar2);
                        break;
                    default:
                        view4.getClass();
                        aVar3.p2(aVar2);
                        break;
                }
                return Unit.INSTANCE;
            }
        });
        View view4 = rVar.f190836f;
        view4.setEnabled(z15);
        if (view4.isEnabled()) {
            final int i15 = 1;
            v22.e.n(view4, new e23.l() { // from class: xg0.q
                @Override // e23.l
                public final Object invoke(Object obj) {
                    View view5 = (View) obj;
                    switch (i15) {
                        case 0:
                            view5.getClass();
                            aVar3.Y1(aVar2);
                            break;
                        default:
                            view5.getClass();
                            aVar3.p2(aVar2);
                            break;
                    }
                    return Unit.INSTANCE;
                }
            });
        }
        w2.a0.q(rVar.f190837g, z14);
        ViewGroup.LayoutParams layoutParams = viewGroup2.getLayoutParams();
        if (layoutParams instanceof ConstraintLayout.b) {
            if (z16) {
                ((ConstraintLayout.b) layoutParams).f6134v = R.id.social_action_guideline;
            } else {
                ((ConstraintLayout.b) layoutParams).f6134v = 0;
            }
            viewGroup2.setLayoutParams(layoutParams);
        }
    }

    public final void i(wg0.a aVar, int i14) {
        boolean zH = aVar.h();
        List<aq.c> list = aVar.f185056o;
        View view2 = this.A;
        if (!zH) {
            v22.e.j(view2);
            return;
        }
        v22.e.q(view2);
        aq.c cVar = (aq.c) p13.h0.e0(0, list);
        if (cVar != null) {
            CharSequence charSequence = cVar.f11847a;
            CharSequence charSequence2 = cVar.f11849c;
            TextView textView = this.B;
            textView.setText(charSequence2);
            TextView textView2 = this.E;
            textView2.setText(charSequence);
            textView.setContentDescription(((Object) charSequence2) + StringUtils.SPACE + ((Object) charSequence));
            textView2.setImportantForAccessibility(2);
            if (aVar.f185055n) {
                int i15 = (int) (16 * this.itemView.getResources().getDisplayMetrics().density);
                Drawable drawable = a7.b.getDrawable(this.itemView.getContext(), 2131232532);
                textView.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, new BitmapDrawable(this.itemView.getContext().getResources(), drawable != null ? d7.b.b(drawable, i15, i15, 4) : null), (Drawable) null);
                textView.setCompoundDrawablePadding((int) this.itemView.getContext().getResources().getDimension(R.dimen.spacing_micro));
            } else {
                textView.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            }
        }
        aq.c cVar2 = (aq.c) p13.h0.e0(1, list);
        if (cVar2 != null) {
            CharSequence charSequence3 = cVar2.f11847a;
            CharSequence charSequence4 = cVar2.f11849c;
            TextView textView3 = this.C;
            textView3.setText(charSequence4);
            TextView textView4 = this.F;
            textView4.setText(charSequence3);
            textView3.setContentDescription(((Object) charSequence4) + StringUtils.SPACE + ((Object) charSequence3));
            textView4.setImportantForAccessibility(2);
        }
        aq.c cVar3 = (aq.c) p13.h0.e0(2, list);
        boolean z14 = cVar3 != null;
        TextView textView5 = this.D;
        v22.e.r(textView5, z14);
        boolean z15 = cVar3 != null;
        TextView textView6 = this.I;
        v22.e.r(textView6, z15);
        v22.e.r(this.P, cVar3 != null);
        if (cVar3 != null) {
            CharSequence charSequence5 = cVar3.f11847a;
            CharSequence charSequence6 = cVar3.f11849c;
            textView5.setText(charSequence6);
            textView6.setText(charSequence5);
            textView5.setContentDescription(((Object) charSequence6) + StringUtils.SPACE + ((Object) charSequence5));
            textView6.setImportantForAccessibility(2);
        }
        view2.setOnClickListener(new k(this, aVar, i14, 2));
    }

    public final void j(wg0.a aVar, int i14, u22.a aVar2) {
        boolean z14;
        wg0.m mVar;
        com.garmin.android.apps.connectmobile.connections.groups.services.model.f fVar;
        String string;
        ComposeView composeView;
        boolean z15;
        aVar.getClass();
        String str = aVar.f185065z;
        aVar2.getClass();
        boolean zI = aVar.i();
        CommentView commentView = this.Z;
        r rVar = this.Y;
        boolean z16 = this.T;
        View view2 = this.f190804o;
        ImageView imageView = this.f190808t;
        ImageView imageView2 = this.f190807r;
        ImageView imageView3 = this.f190806q;
        TextView textView = this.f190805p;
        if (!zI) {
            g(aVar, i14);
            boolean zH = aVar.h();
            String str2 = aVar.f185043b;
            if (zH) {
                textView.setText(str2);
                z14 = false;
                textView.setVisibility(0);
                textView.setImportantForAccessibility(2);
                view2.setFocusable(true);
                view2.setContentDescription(str2);
                view2.setOnClickListener(new k(this, aVar, i14, 0));
            } else {
                z14 = false;
                v22.e.j(textView);
                view2.setOnClickListener(null);
            }
            v22.e.r(imageView3, aVar.f185054m);
            v22.e.r(imageView2, (aVar.f185053l && aVar.j()) ? true : z14);
            v22.e.r(imageView, aVar.f185052k);
            d(aVar);
            f(aVar);
            i(aVar, i14);
            if (z16 && ((mVar = aVar.f185060t) == null || mVar.f185108a == 0 || mVar.f185109b == 0)) {
                rVar.f190831a.setVisibility(8);
                v22.e.j(commentView);
            } else {
                h(aVar);
                e(aVar);
            }
            b(aVar2);
            return;
        }
        this.f190795g.setProfileImageData(aVar.C);
        this.f190796h.setText(aVar.f185047f);
        GroupAnnouncementDTO groupAnnouncementDTO = aVar.f185064y;
        if (groupAnnouncementDTO == null || (fVar = groupAnnouncementDTO.f31511j) == null) {
            fVar = com.garmin.android.apps.connectmobile.connections.groups.services.model.f.GUEST;
        }
        int i15 = b.f190814a[fVar.ordinal()];
        TextView textView2 = this.f190798j;
        if (i15 == 1 || i15 == 2) {
            string = "";
        } else if (i15 == 3) {
            string = textView2.getContext().getString(R.string.lbl_admin);
            string.getClass();
        } else if (i15 != 4) {
            u0.r();
            return;
        } else {
            string = textView2.getContext().getString(R.string.lbl_owner);
            string.getClass();
        }
        textView2.setText(string);
        v22.e.r(textView2, string.length() > 0);
        ImageView imageView4 = this.f190799k;
        v22.e.q(imageView4);
        imageView4.setImageResource(2131232725);
        String str3 = str != null ? str : "";
        TextView textView3 = this.f190801l;
        textView3.setText(str3);
        String str4 = aVar.B;
        if (str4 == null) {
            str4 = str != null ? str : "";
        }
        textView3.setContentDescription(str4);
        v22.e.j(this.f190802m);
        Integer num = null;
        this.f190794f.setOnClickListener(null);
        GroupDTO.c cVar = aVar.f185062w;
        boolean z17 = cVar == GroupDTO.c.ADMIN || cVar == GroupDTO.c.OWNER;
        wg0.h hVar = z17 ? wg0.h.ANNOUNCEMENT : null;
        ComposeView composeView2 = this.f190803n;
        if (hVar == null) {
            composeView = composeView2;
            z15 = z17;
        } else {
            composeView = composeView2;
            composeView.setContent(new z3.e(1685308118, true, new l(this, hVar, num, aVar, 0)));
            z15 = z17;
        }
        v22.e.r(composeView, z15);
        v22.e.j(textView);
        v22.e.j(imageView3);
        v22.e.j(imageView2);
        v22.e.j(imageView);
        d(aVar);
        view2.setOnClickListener(null);
        f(aVar);
        i(aVar, i14);
        if (z16) {
            rVar.f190831a.setVisibility(8);
            v22.e.j(commentView);
        } else {
            h(aVar);
            e(aVar);
        }
        b(aVar2);
    }

    public final void l(boolean z14) {
        TextView textView = this.f190809v;
        ImageView imageView = this.f190811x;
        TextView textView2 = this.f190810w;
        if (z14) {
            textView2.setText(this.itemView.getContext().getString(R.string.lbl_read_less_capitalized));
            imageView.setImageResource(R.drawable.chevron_up);
            textView.setMaxLines(Integer.MAX_VALUE);
        } else {
            textView2.setText(this.itemView.getContext().getString(R.string.lbl_read_more_capitalized));
            imageView.setImageResource(R.drawable.chevron_down);
            textView.setMaxLines(3);
        }
        this.f190813z = z14;
    }

    public final void m(TextView textView, wg0.a aVar) {
        Layout.Alignment alignment;
        String str = aVar.f185051j;
        if (str == null) {
            return;
        }
        StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(str, 0, str.length(), textView.getPaint(), textView.getMeasuredWidth());
        Layout layout = textView.getLayout();
        if (layout == null || (alignment = layout.getAlignment()) == null) {
            alignment = Layout.Alignment.ALIGN_NORMAL;
        }
        StaticLayout.Builder useLineSpacingFromFallbacks = builderObtain.setAlignment(alignment).setLineSpacing(textView.getLineSpacingExtra(), textView.getLineSpacingMultiplier()).setIncludePad(textView.getIncludeFontPadding()).setBreakStrategy(textView.getBreakStrategy()).setHyphenationFrequency(textView.getHyphenationFrequency()).setJustificationMode(textView.getJustificationMode()).setUseLineSpacingFromFallbacks(textView.isFallbackLineSpacing());
        useLineSpacingFromFallbacks.getClass();
        if (Build.VERSION.SDK_INT >= 29) {
            useLineSpacingFromFallbacks.setTextDirection(textView.getTextDirectionHeuristic());
        }
        StaticLayout staticLayoutBuild = useLineSpacingFromFallbacks.build();
        staticLayoutBuild.getClass();
        int lineCount = staticLayoutBuild.getLineCount();
        String str2 = "descriptionView.text = " + ((Object) textView.getText());
        i2.a aVar2 = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar2.getClass();
        i2.a.b(a2Var, "ActivityFeedViewHolder", str2);
        i2.a.b(a2Var, "ActivityFeedViewHolder", "number of lines: " + lineCount);
        ImageView imageView = this.f190811x;
        View view2 = this.f190812y;
        TextView textView2 = this.f190810w;
        if (lineCount > 5) {
            v22.e.q(textView2);
            v22.e.q(imageView);
            l(aVar.f185058q);
            view2.setOnClickListener(new k(this, aVar, 3));
            view2.setClickable(true);
        } else {
            v22.e.j(textView2);
            v22.e.j(imageView);
            view2.setOnClickListener(null);
            view2.setClickable(false);
            textView.setMaxLines(5);
        }
        textView.setText(str);
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0014\u0010\u000b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\t¨\u0006\f"}, d2 = {"Lxg0/m$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "", "DESCRIPTION_MAX_LINES", "I", "MAX_LINE_SEE_MORE_DISPLAY", "FAVORITE_ICON_SIZE", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ m(View view2, xg0.a aVar, n nVar, o oVar, boolean z14, go1.a aVar2, int i14, p005kotlin.jvm.internal.j jVar) {
        this(view2, aVar, nVar, oVar, (i14 & 16) != 0 ? false : z14, (i14 & 32) != 0 ? null : aVar2);
    }
}

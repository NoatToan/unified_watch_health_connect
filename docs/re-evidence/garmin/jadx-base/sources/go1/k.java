package go1;

import am.x0;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.i0;
import androidx.lifecycle.n0;
import androidx.lifecycle.v1;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y0;
import androidx.lifecycle.y1;
import androidx.lifecycle.z0;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import c22.b3;
import c22.s3;
import com.daasuu.bl.BubbleLayout;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.social.VideoPlayerActivity;
import com.garmin.android.apps.connectmobile.social.conversation.ConversationActivity;
import com.garmin.android.apps.connectmobile.social.conversation.comments.LockableLayoutManager;
import com.garmin.android.apps.connectmobile.social.conversationservice.model.ConversationCommentDTO;
import com.garmin.android.apps.connectmobile.tag.TaggableEditText;
import com.garmin.android.apps.connectmobile.view.view_3_0.PostCommentView;
import ei0.q0;
import fo1.l1;
import fo1.o0;
import fo1.q1;
import fo1.r1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import o53.c2;
import o53.m0;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.t0;
import p13.j0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b2\u00020\t2\u00020\n:\u0001\rB\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lgo1/k;", "Landroidx/fragment/app/Fragment;", "Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$f;", "Lcom/garmin/android/apps/connectmobile/view/view_3_0/PostCommentView$b;", "Lgo1/v;", "Lxg0/o;", "Lxg0/n;", "Lxg0/a;", "Lpo1/b;", "Lcs1/f;", "Lcom/garmin/android/apps/connectmobile/pregnancytracking/ui/details/e$b;", "<init>", "()V", "a", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class k extends Fragment implements SwipeRefreshLayout.f, PostCommentView.b, v, xg0.o, xg0.n, xg0.a, po1.b, cs1.f, com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.e.b {
    public static final /* synthetic */ int C = 0;
    public final f.c<Intent> A;
    public final boolean B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w1 f78251a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o13.t f78252b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w1 f78253c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final do1.q f78254d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public SwipeRefreshLayout f78255e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public RecyclerView f78256f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public FrameLayout f78257g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public TextView f78258h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public PostCommentView f78259i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public BubbleLayout f78260j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public LockableLayoutManager f78261k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f78262l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f78263m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f78264n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f78265o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f78266p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f78267q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public c2 f78268r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final o13.t f78269t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final go1.c f78270v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final go1.c f78271w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final go1.c f78272x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final f.c<Intent> f78273y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final f.c<Intent> f78274z;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f78275a;

        static {
            int[] iArr = new int[fw.p.values().length];
            try {
                iArr[fw.p.LOADING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[fw.p.SUCCESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[fw.p.ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f78275a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements z0, p005kotlin.jvm.internal.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l f78276a;

        public c(e23.l lVar) {
            lVar.getClass();
            this.f78276a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof p005kotlin.jvm.internal.n)) {
                return p005kotlin.jvm.internal.s.g(getFunctionDelegate(), ((p005kotlin.jvm.internal.n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final o13.h<?> getFunctionDelegate() {
            return this.f78276a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f78276a.invoke(obj);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.social.conversation.comments.BaseCommentListFragment$setRecyclerViewScrollEnabled$1", f = "BaseCommentListFragment.kt", l = {843}, m = "invokeSuspend", v = 2)
    public static final class d extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f78277a;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.social.conversation.comments.BaseCommentListFragment$setRecyclerViewScrollEnabled$1$1", f = "BaseCommentListFragment.kt", l = {843}, m = "invokeSuspend", v = 2)
        public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f78279a;

            public a(t13.d<? super a> dVar) {
                super(2, dVar);
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new a(dVar);
            }

            @Override // e23.p
            public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
                return new a(dVar).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f78279a;
                if (i14 == 0) {
                    o13.r.b(obj);
                    this.f78279a = 1;
                    if (m0.b(300L, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i14 != 1) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o13.r.b(obj);
                }
                return Unit.INSTANCE;
            }
        }

        public d(t13.d<? super d> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return k.this.new d(dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:11:0x0027 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:14:0x0034  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:12:0x0028). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:11:0x0027
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // v13.a
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                u13.a r0 = u13.a.COROUTINE_SUSPENDED
                int r1 = r4.f78277a
                r2 = 1
                if (r1 == 0) goto L14
                if (r1 != r2) goto Ld
                o13.r.b(r5)
                goto L28
            Ld:
                java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                vb.h.z(r5)
                r5 = 0
                return r5
            L14:
                o13.r.b(r5)
            L17:
                x53.c r5 = o53.s0.f129406a
                go1.k$d$a r1 = new go1.k$d$a
                r3 = 0
                r1.<init>(r3)
                r4.f78277a = r2
                java.lang.Object r5 = ge1.b.e0(r5, r1, r4)
                if (r5 != r0) goto L28
                return r0
            L28:
                go1.k r5 = go1.k.this
                androidx.recyclerview.widget.RecyclerView r1 = r5.A6()
                int r1 = r1.getScrollState()
                if (r1 != 0) goto L17
                com.garmin.android.apps.connectmobile.social.conversation.comments.LockableLayoutManager r5 = r5.z6()
                r0 = 0
                r5.f44545a = r0
                kotlin.Unit r5 = p005kotlin.Unit.INSTANCE
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: go1.k.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/y1;", "invoke", "()Landroidx/lifecycle/y1;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class e extends p005kotlin.jvm.internal.w implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f78280a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Fragment fragment) {
            super(0);
            this.f78280a = fragment;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f78280a.requireActivity().getF189591b();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class f extends p005kotlin.jvm.internal.w implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f78281a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Fragment f78282b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(e23.a aVar, Fragment fragment) {
            super(0);
            this.f78281a = aVar;
            this.f78282b = fragment;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f78281a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f78282b.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/x1$c;", "invoke", "()Landroidx/lifecycle/x1$c;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class g extends p005kotlin.jvm.internal.w implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f78283a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Fragment fragment) {
            super(0);
            this.f78283a = fragment;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f78283a.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/y1;", "invoke", "()Landroidx/lifecycle/y1;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class h extends p005kotlin.jvm.internal.w implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f78284a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(Fragment fragment) {
            super(0);
            this.f78284a = fragment;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f78284a.requireActivity().getF189591b();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class i extends p005kotlin.jvm.internal.w implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f78285a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Fragment f78286b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(e23.a aVar, Fragment fragment) {
            super(0);
            this.f78285a = aVar;
            this.f78286b = fragment;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f78285a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f78286b.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/x1$c;", "invoke", "()Landroidx/lifecycle/x1$c;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class j extends p005kotlin.jvm.internal.w implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f78287a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(Fragment fragment) {
            super(0);
            this.f78287a = fragment;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f78287a.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    static {
        new a(null);
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [go1.c] */
    /* JADX WARN: Type inference failed for: r0v12, types: [go1.c] */
    /* JADX WARN: Type inference failed for: r0v13, types: [go1.c] */
    public k() {
        t0 t0Var = s0.f105811a;
        this.f78251a = new w1(t0Var.b(o0.class), new e(this), new g(this), new f(null, this));
        this.f78252b = o13.m.b(new fe2.z(this, 22));
        this.f78253c = new w1(t0Var.b(com.garmin.android.apps.connectmobile.tag.b.class), new h(this), new j(this), new i(null, this));
        this.f78254d = ((bv.g) KoinJavaComponent.get$default(bv.g.class, null, null, 6, null)).a();
        this.f78264n = true;
        this.f78267q = -1;
        o13.m.b(new go1.j(0));
        final int i14 = 1;
        this.f78269t = o13.m.b(new go1.j(1));
        this.f78270v = new z0(this) { // from class: go1.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ k f78218b;

            {
                this.f78218b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.lifecycle.z0
            public final void onChanged(Object obj) {
                int i15 = i14;
                k kVar = this.f78218b;
                int i16 = 1;
                g3 g3Var = (g3) obj;
                switch (i15) {
                    case 0:
                        int i17 = k.C;
                        g3Var.getClass();
                        T t7 = g3Var.f35301b;
                        int i18 = k.b.f78275a[g3Var.f35300a.ordinal()];
                        if (i18 != 1) {
                            if (i18 == 2) {
                                ConversationCommentDTO conversationCommentDTO = (ConversationCommentDTO) t7;
                                if (conversationCommentDTO != null) {
                                    Context contextRequireContext = kVar.requireContext();
                                    contextRequireContext.getClass();
                                    w wVarB = fo1.m0.b(conversationCommentDTO, contextRequireContext, kVar.C6().f72660g);
                                    c0 c0VarY6 = kVar.y6();
                                    c0VarY6.getClass();
                                    ArrayList arrayList = c0VarY6.f78226h;
                                    arrayList.add(wVarB);
                                    c0VarY6.notifyItemInserted(arrayList.size());
                                    kVar.A6().post(new h(kVar, i16));
                                    return;
                                }
                                return;
                            }
                            if (i18 != 3) {
                                u0.r();
                                return;
                            }
                            if (zy0.g.a(g3Var.f35304e)) {
                                Context context = kVar.getContext();
                                if (context == null) {
                                    return;
                                } else {
                                    b3.b(context);
                                }
                            } else if (az0.b.a()) {
                                g22.e.c(kVar);
                            } else {
                                kVar.C6().f72672r.j(Boolean.TRUE);
                            }
                            Exception exc = g3Var.f35303d;
                            i2.a aVar = i2.f36769a;
                            a2 a2Var = a2.GENERAL;
                            aVar.getClass();
                            i2.a.g(a2Var, "BaseCommentListFragment", exc);
                            ConversationCommentDTO conversationCommentDTO2 = (ConversationCommentDTO) t7;
                            if (conversationCommentDTO2 != null) {
                                PostCommentView postCommentView = kVar.f78259i;
                                if (postCommentView == null) {
                                    p005kotlin.jvm.internal.s.m("postCommentView");
                                    throw null;
                                }
                                String commentText = postCommentView.getCommentText();
                                if (commentText == null || commentText.length() == 0) {
                                    PostCommentView postCommentView2 = kVar.f78259i;
                                    if (postCommentView2 == null) {
                                        p005kotlin.jvm.internal.s.m("postCommentView");
                                        throw null;
                                    }
                                    Context contextRequireContext2 = kVar.requireContext();
                                    contextRequireContext2.getClass();
                                    postCommentView2.setCommentText(cs1.h.a(conversationCommentDTO2, contextRequireContext2));
                                }
                                o0 o0VarC6 = kVar.C6();
                                String str = conversationCommentDTO2.f44546a;
                                str.getClass();
                                o0VarC6.J4(str);
                                return;
                            }
                            return;
                        }
                        return;
                    case 1:
                        int i19 = k.C;
                        g3Var.getClass();
                        int i24 = k.b.f78275a[g3Var.f35300a.ordinal()];
                        if (i24 == 1) {
                            SwipeRefreshLayout swipeRefreshLayout = kVar.f78255e;
                            if (swipeRefreshLayout != null) {
                                swipeRefreshLayout.setRefreshing(true);
                                return;
                            } else {
                                p005kotlin.jvm.internal.s.m("swipeRefreshLayout");
                                throw null;
                            }
                        }
                        if (i24 == 2) {
                            kVar.F6();
                            return;
                        }
                        if (i24 != 3) {
                            u0.r();
                            return;
                        }
                        Exception exc2 = g3Var.f35303d;
                        if (exc2 != null) {
                            i2.a aVar2 = i2.f36769a;
                            a2 a2Var2 = a2.GENERAL;
                            aVar2.getClass();
                            i2.a.g(a2Var2, "BaseCommentListFragment", exc2);
                        }
                        kVar.F6();
                        g22.e.a(kVar, null);
                        return;
                    default:
                        int i25 = k.C;
                        g3Var.getClass();
                        int i26 = k.b.f78275a[g3Var.f35300a.ordinal()];
                        if (i26 == 1) {
                            g22.e.l(kVar);
                            return;
                        }
                        if (i26 == 2) {
                            g22.e.f(kVar);
                            return;
                        }
                        if (i26 != 3) {
                            u0.r();
                            return;
                        }
                        Exception exc3 = g3Var.f35303d;
                        if (exc3 != null) {
                            i2.a aVar3 = i2.f36769a;
                            a2 a2Var3 = a2.GENERAL;
                            aVar3.getClass();
                            i2.a.g(a2Var3, "BaseCommentListFragment", exc3);
                        }
                        g22.e.f(kVar);
                        g22.e.a(kVar, null);
                        return;
                }
            }
        };
        final int i15 = 2;
        this.f78271w = new z0(this) { // from class: go1.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ k f78218b;

            {
                this.f78218b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.lifecycle.z0
            public final void onChanged(Object obj) {
                int i16 = i15;
                k kVar = this.f78218b;
                int i17 = 1;
                g3 g3Var = (g3) obj;
                switch (i16) {
                    case 0:
                        int i18 = k.C;
                        g3Var.getClass();
                        T t7 = g3Var.f35301b;
                        int i19 = k.b.f78275a[g3Var.f35300a.ordinal()];
                        if (i19 != 1) {
                            if (i19 == 2) {
                                ConversationCommentDTO conversationCommentDTO = (ConversationCommentDTO) t7;
                                if (conversationCommentDTO != null) {
                                    Context contextRequireContext = kVar.requireContext();
                                    contextRequireContext.getClass();
                                    w wVarB = fo1.m0.b(conversationCommentDTO, contextRequireContext, kVar.C6().f72660g);
                                    c0 c0VarY6 = kVar.y6();
                                    c0VarY6.getClass();
                                    ArrayList arrayList = c0VarY6.f78226h;
                                    arrayList.add(wVarB);
                                    c0VarY6.notifyItemInserted(arrayList.size());
                                    kVar.A6().post(new h(kVar, i17));
                                    return;
                                }
                                return;
                            }
                            if (i19 != 3) {
                                u0.r();
                                return;
                            }
                            if (zy0.g.a(g3Var.f35304e)) {
                                Context context = kVar.getContext();
                                if (context == null) {
                                    return;
                                } else {
                                    b3.b(context);
                                }
                            } else if (az0.b.a()) {
                                g22.e.c(kVar);
                            } else {
                                kVar.C6().f72672r.j(Boolean.TRUE);
                            }
                            Exception exc = g3Var.f35303d;
                            i2.a aVar = i2.f36769a;
                            a2 a2Var = a2.GENERAL;
                            aVar.getClass();
                            i2.a.g(a2Var, "BaseCommentListFragment", exc);
                            ConversationCommentDTO conversationCommentDTO2 = (ConversationCommentDTO) t7;
                            if (conversationCommentDTO2 != null) {
                                PostCommentView postCommentView = kVar.f78259i;
                                if (postCommentView == null) {
                                    p005kotlin.jvm.internal.s.m("postCommentView");
                                    throw null;
                                }
                                String commentText = postCommentView.getCommentText();
                                if (commentText == null || commentText.length() == 0) {
                                    PostCommentView postCommentView2 = kVar.f78259i;
                                    if (postCommentView2 == null) {
                                        p005kotlin.jvm.internal.s.m("postCommentView");
                                        throw null;
                                    }
                                    Context contextRequireContext2 = kVar.requireContext();
                                    contextRequireContext2.getClass();
                                    postCommentView2.setCommentText(cs1.h.a(conversationCommentDTO2, contextRequireContext2));
                                }
                                o0 o0VarC6 = kVar.C6();
                                String str = conversationCommentDTO2.f44546a;
                                str.getClass();
                                o0VarC6.J4(str);
                                return;
                            }
                            return;
                        }
                        return;
                    case 1:
                        int i110 = k.C;
                        g3Var.getClass();
                        int i24 = k.b.f78275a[g3Var.f35300a.ordinal()];
                        if (i24 == 1) {
                            SwipeRefreshLayout swipeRefreshLayout = kVar.f78255e;
                            if (swipeRefreshLayout != null) {
                                swipeRefreshLayout.setRefreshing(true);
                                return;
                            } else {
                                p005kotlin.jvm.internal.s.m("swipeRefreshLayout");
                                throw null;
                            }
                        }
                        if (i24 == 2) {
                            kVar.F6();
                            return;
                        }
                        if (i24 != 3) {
                            u0.r();
                            return;
                        }
                        Exception exc2 = g3Var.f35303d;
                        if (exc2 != null) {
                            i2.a aVar2 = i2.f36769a;
                            a2 a2Var2 = a2.GENERAL;
                            aVar2.getClass();
                            i2.a.g(a2Var2, "BaseCommentListFragment", exc2);
                        }
                        kVar.F6();
                        g22.e.a(kVar, null);
                        return;
                    default:
                        int i25 = k.C;
                        g3Var.getClass();
                        int i26 = k.b.f78275a[g3Var.f35300a.ordinal()];
                        if (i26 == 1) {
                            g22.e.l(kVar);
                            return;
                        }
                        if (i26 == 2) {
                            g22.e.f(kVar);
                            return;
                        }
                        if (i26 != 3) {
                            u0.r();
                            return;
                        }
                        Exception exc3 = g3Var.f35303d;
                        if (exc3 != null) {
                            i2.a aVar3 = i2.f36769a;
                            a2 a2Var3 = a2.GENERAL;
                            aVar3.getClass();
                            i2.a.g(a2Var3, "BaseCommentListFragment", exc3);
                        }
                        g22.e.f(kVar);
                        g22.e.a(kVar, null);
                        return;
                }
            }
        };
        final int i16 = 0;
        this.f78272x = new z0(this) { // from class: go1.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ k f78218b;

            {
                this.f78218b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.lifecycle.z0
            public final void onChanged(Object obj) {
                int i17 = i16;
                k kVar = this.f78218b;
                int i18 = 1;
                g3 g3Var = (g3) obj;
                switch (i17) {
                    case 0:
                        int i19 = k.C;
                        g3Var.getClass();
                        T t7 = g3Var.f35301b;
                        int i110 = k.b.f78275a[g3Var.f35300a.ordinal()];
                        if (i110 != 1) {
                            if (i110 == 2) {
                                ConversationCommentDTO conversationCommentDTO = (ConversationCommentDTO) t7;
                                if (conversationCommentDTO != null) {
                                    Context contextRequireContext = kVar.requireContext();
                                    contextRequireContext.getClass();
                                    w wVarB = fo1.m0.b(conversationCommentDTO, contextRequireContext, kVar.C6().f72660g);
                                    c0 c0VarY6 = kVar.y6();
                                    c0VarY6.getClass();
                                    ArrayList arrayList = c0VarY6.f78226h;
                                    arrayList.add(wVarB);
                                    c0VarY6.notifyItemInserted(arrayList.size());
                                    kVar.A6().post(new h(kVar, i18));
                                    return;
                                }
                                return;
                            }
                            if (i110 != 3) {
                                u0.r();
                                return;
                            }
                            if (zy0.g.a(g3Var.f35304e)) {
                                Context context = kVar.getContext();
                                if (context == null) {
                                    return;
                                } else {
                                    b3.b(context);
                                }
                            } else if (az0.b.a()) {
                                g22.e.c(kVar);
                            } else {
                                kVar.C6().f72672r.j(Boolean.TRUE);
                            }
                            Exception exc = g3Var.f35303d;
                            i2.a aVar = i2.f36769a;
                            a2 a2Var = a2.GENERAL;
                            aVar.getClass();
                            i2.a.g(a2Var, "BaseCommentListFragment", exc);
                            ConversationCommentDTO conversationCommentDTO2 = (ConversationCommentDTO) t7;
                            if (conversationCommentDTO2 != null) {
                                PostCommentView postCommentView = kVar.f78259i;
                                if (postCommentView == null) {
                                    p005kotlin.jvm.internal.s.m("postCommentView");
                                    throw null;
                                }
                                String commentText = postCommentView.getCommentText();
                                if (commentText == null || commentText.length() == 0) {
                                    PostCommentView postCommentView2 = kVar.f78259i;
                                    if (postCommentView2 == null) {
                                        p005kotlin.jvm.internal.s.m("postCommentView");
                                        throw null;
                                    }
                                    Context contextRequireContext2 = kVar.requireContext();
                                    contextRequireContext2.getClass();
                                    postCommentView2.setCommentText(cs1.h.a(conversationCommentDTO2, contextRequireContext2));
                                }
                                o0 o0VarC6 = kVar.C6();
                                String str = conversationCommentDTO2.f44546a;
                                str.getClass();
                                o0VarC6.J4(str);
                                return;
                            }
                            return;
                        }
                        return;
                    case 1:
                        int i111 = k.C;
                        g3Var.getClass();
                        int i24 = k.b.f78275a[g3Var.f35300a.ordinal()];
                        if (i24 == 1) {
                            SwipeRefreshLayout swipeRefreshLayout = kVar.f78255e;
                            if (swipeRefreshLayout != null) {
                                swipeRefreshLayout.setRefreshing(true);
                                return;
                            } else {
                                p005kotlin.jvm.internal.s.m("swipeRefreshLayout");
                                throw null;
                            }
                        }
                        if (i24 == 2) {
                            kVar.F6();
                            return;
                        }
                        if (i24 != 3) {
                            u0.r();
                            return;
                        }
                        Exception exc2 = g3Var.f35303d;
                        if (exc2 != null) {
                            i2.a aVar2 = i2.f36769a;
                            a2 a2Var2 = a2.GENERAL;
                            aVar2.getClass();
                            i2.a.g(a2Var2, "BaseCommentListFragment", exc2);
                        }
                        kVar.F6();
                        g22.e.a(kVar, null);
                        return;
                    default:
                        int i25 = k.C;
                        g3Var.getClass();
                        int i26 = k.b.f78275a[g3Var.f35300a.ordinal()];
                        if (i26 == 1) {
                            g22.e.l(kVar);
                            return;
                        }
                        if (i26 == 2) {
                            g22.e.f(kVar);
                            return;
                        }
                        if (i26 != 3) {
                            u0.r();
                            return;
                        }
                        Exception exc3 = g3Var.f35303d;
                        if (exc3 != null) {
                            i2.a aVar3 = i2.f36769a;
                            a2 a2Var3 = a2.GENERAL;
                            aVar3.getClass();
                            i2.a.g(a2Var3, "BaseCommentListFragment", exc3);
                        }
                        g22.e.f(kVar);
                        g22.e.a(kVar, null);
                        return;
                }
            }
        };
        final int i17 = 0;
        f.c<Intent> cVarRegisterForActivityResult = registerForActivityResult(new g.h(), new f.b(this) { // from class: go1.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ k f78229b;

            {
                this.f78229b = this;
            }

            @Override // f.b
            public final void a(Object obj) {
                Intent intent;
                List<wg0.c> list;
                List<wg0.c> listT;
                List<wg0.c> list2;
                Intent intent2;
                List<wg0.c> list3;
                List<wg0.c> list4;
                int i18 = i17;
                k kVar = this.f78229b;
                switch (i18) {
                    case 0:
                        f.a aVar = (f.a) obj;
                        int i19 = k.C;
                        aVar.getClass();
                        i2.a aVar2 = i2.f36769a;
                        a2 a2Var = a2.GENERAL;
                        aVar2.getClass();
                        i2.a.k(a2Var, "BaseCommentListFragment", "View post feed image result");
                        if (aVar.f67585a == -1 && (intent = aVar.f67586b) != null && intent.getBooleanExtra("GCM_extra_image_list_changed", false)) {
                            String stringExtra = intent.getStringExtra("GCM_conversation_resource_id");
                            ArrayList parcelableArrayListExtra = Build.VERSION.SDK_INT >= 33 ? intent.getParcelableArrayListExtra("GCM_extra_images_data", jo1.f.class) : intent.getParcelableArrayListExtra("GCM_extra_images_data");
                            o0 o0VarC6 = kVar.C6();
                            if (stringExtra != null) {
                                w wVar = (w) o0VarC6.f72673t.get(0);
                                Parcelable parcelable = wVar.f78314d;
                                if (parcelable instanceof wg0.a) {
                                    wg0.a aVar3 = (wg0.a) parcelable;
                                    if (p005kotlin.jvm.internal.s.g(aVar3.f(), stringExtra) && aVar3.m()) {
                                        wg0.a aVarD = wg0.a.d(aVar3);
                                        wg0.l lVar = aVarD.f185059r;
                                        jo1.e eVar = aVarD.f185061v;
                                        if (eVar != null) {
                                            eVar.s(parcelableArrayListExtra);
                                        }
                                        if (lVar != null && (list2 = lVar.f185103b) != null) {
                                            list2.clear();
                                        }
                                        if (lVar != null && (list = lVar.f185103b) != null) {
                                            if (eVar == null || (listT = eVar.t()) == null) {
                                                listT = j0.f134944a;
                                            }
                                            list.addAll(listT);
                                        }
                                        o0VarC6.A = true;
                                        o0VarC6.f72669o.j(new o13.p<>(w.a(wVar, aVarD), 0));
                                        break;
                                    }
                                }
                            }
                        }
                        break;
                    case 1:
                        f.a aVar4 = (f.a) obj;
                        int i24 = k.C;
                        aVar4.getClass();
                        i2.a aVar5 = i2.f36769a;
                        a2 a2Var2 = a2.GENERAL;
                        aVar5.getClass();
                        i2.a.k(a2Var2, "BaseCommentListFragment", "View activity feed image result");
                        if (aVar4.f67585a == -1 && (intent2 = aVar4.f67586b) != null && intent2.getBooleanExtra("GCM_extra_image_list_changed", false)) {
                            intent2.getLongExtra("GCM_conversation_resource_id", 0L);
                            ArrayList parcelableArrayListExtra2 = Build.VERSION.SDK_INT >= 33 ? intent2.getParcelableArrayListExtra("GCM_extra_images_data", ps.j.class) : intent2.getParcelableArrayListExtra("GCM_extra_images_data");
                            o0 o0VarC7 = kVar.C6();
                            w wVar2 = (w) o0VarC7.f72673t.get(0);
                            Parcelable parcelable2 = wVar2.f78314d;
                            if (parcelable2 instanceof wg0.a) {
                                wg0.a aVar6 = (wg0.a) parcelable2;
                                if (p005kotlin.jvm.internal.s.g(aVar6.f(), o0VarC7.f72657d) && aVar6.h()) {
                                    wg0.a aVarD2 = wg0.a.d(aVar6);
                                    wg0.l lVar2 = aVarD2.f185059r;
                                    if (lVar2 != null && (list4 = lVar2.f185103b) != null) {
                                        list4.clear();
                                    }
                                    if (lVar2 != null && (list3 = lVar2.f185103b) != null) {
                                        list3.addAll(parcelableArrayListExtra2 != null ? wg0.j.d(parcelableArrayListExtra2) : j0.f134944a);
                                    }
                                    o0VarC7.A = true;
                                    o0VarC7.f72669o.j(new o13.p<>(w.a(wVar2, aVarD2), 0));
                                    break;
                                }
                            }
                        }
                        break;
                    default:
                        f.a aVar7 = (f.a) obj;
                        int i25 = k.C;
                        aVar7.getClass();
                        if (aVar7.f67585a == -1) {
                            Intent intent3 = aVar7.f67586b;
                            long longExtra = intent3 != null ? intent3.getLongExtra("GCM_extra_activity_id", -1L) : -1L;
                            o0 o0VarC8 = kVar.C6();
                            w wVar3 = (w) p13.h0.e0(0, o0VarC8.f72673t);
                            if (wVar3 != null) {
                                Parcelable parcelable3 = wVar3.f78314d;
                                if (parcelable3 instanceof wg0.a) {
                                    wg0.a aVar8 = (wg0.a) parcelable3;
                                    if (p005kotlin.jvm.internal.s.g(aVar8.f(), String.valueOf(longExtra)) && aVar8.h()) {
                                        wg0.l lVar3 = aVar8.f185059r;
                                        o0VarC8.f72669o.j(new o13.p<>(w.a(wVar3, wg0.a.b(aVar8, null, lVar3 != null ? wg0.l.b(lVar3, lVar3.f185102a, lVar3.f185103b, 24) : null, null, null, null, 536739839)), 0));
                                        o0VarC8.A = true;
                                        break;
                                    }
                                }
                            }
                        }
                        break;
                }
            }
        });
        cVarRegisterForActivityResult.getClass();
        this.f78273y = cVarRegisterForActivityResult;
        final int i18 = 1;
        f.c<Intent> cVarRegisterForActivityResult2 = registerForActivityResult(new g.h(), new f.b(this) { // from class: go1.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ k f78229b;

            {
                this.f78229b = this;
            }

            @Override // f.b
            public final void a(Object obj) {
                Intent intent;
                List<wg0.c> list;
                List<wg0.c> listT;
                List<wg0.c> list2;
                Intent intent2;
                List<wg0.c> list3;
                List<wg0.c> list4;
                int i19 = i18;
                k kVar = this.f78229b;
                switch (i19) {
                    case 0:
                        f.a aVar = (f.a) obj;
                        int i110 = k.C;
                        aVar.getClass();
                        i2.a aVar2 = i2.f36769a;
                        a2 a2Var = a2.GENERAL;
                        aVar2.getClass();
                        i2.a.k(a2Var, "BaseCommentListFragment", "View post feed image result");
                        if (aVar.f67585a == -1 && (intent = aVar.f67586b) != null && intent.getBooleanExtra("GCM_extra_image_list_changed", false)) {
                            String stringExtra = intent.getStringExtra("GCM_conversation_resource_id");
                            ArrayList parcelableArrayListExtra = Build.VERSION.SDK_INT >= 33 ? intent.getParcelableArrayListExtra("GCM_extra_images_data", jo1.f.class) : intent.getParcelableArrayListExtra("GCM_extra_images_data");
                            o0 o0VarC6 = kVar.C6();
                            if (stringExtra != null) {
                                w wVar = (w) o0VarC6.f72673t.get(0);
                                Parcelable parcelable = wVar.f78314d;
                                if (parcelable instanceof wg0.a) {
                                    wg0.a aVar3 = (wg0.a) parcelable;
                                    if (p005kotlin.jvm.internal.s.g(aVar3.f(), stringExtra) && aVar3.m()) {
                                        wg0.a aVarD = wg0.a.d(aVar3);
                                        wg0.l lVar = aVarD.f185059r;
                                        jo1.e eVar = aVarD.f185061v;
                                        if (eVar != null) {
                                            eVar.s(parcelableArrayListExtra);
                                        }
                                        if (lVar != null && (list2 = lVar.f185103b) != null) {
                                            list2.clear();
                                        }
                                        if (lVar != null && (list = lVar.f185103b) != null) {
                                            if (eVar == null || (listT = eVar.t()) == null) {
                                                listT = j0.f134944a;
                                            }
                                            list.addAll(listT);
                                        }
                                        o0VarC6.A = true;
                                        o0VarC6.f72669o.j(new o13.p<>(w.a(wVar, aVarD), 0));
                                        break;
                                    }
                                }
                            }
                        }
                        break;
                    case 1:
                        f.a aVar4 = (f.a) obj;
                        int i24 = k.C;
                        aVar4.getClass();
                        i2.a aVar5 = i2.f36769a;
                        a2 a2Var2 = a2.GENERAL;
                        aVar5.getClass();
                        i2.a.k(a2Var2, "BaseCommentListFragment", "View activity feed image result");
                        if (aVar4.f67585a == -1 && (intent2 = aVar4.f67586b) != null && intent2.getBooleanExtra("GCM_extra_image_list_changed", false)) {
                            intent2.getLongExtra("GCM_conversation_resource_id", 0L);
                            ArrayList parcelableArrayListExtra2 = Build.VERSION.SDK_INT >= 33 ? intent2.getParcelableArrayListExtra("GCM_extra_images_data", ps.j.class) : intent2.getParcelableArrayListExtra("GCM_extra_images_data");
                            o0 o0VarC7 = kVar.C6();
                            w wVar2 = (w) o0VarC7.f72673t.get(0);
                            Parcelable parcelable2 = wVar2.f78314d;
                            if (parcelable2 instanceof wg0.a) {
                                wg0.a aVar6 = (wg0.a) parcelable2;
                                if (p005kotlin.jvm.internal.s.g(aVar6.f(), o0VarC7.f72657d) && aVar6.h()) {
                                    wg0.a aVarD2 = wg0.a.d(aVar6);
                                    wg0.l lVar2 = aVarD2.f185059r;
                                    if (lVar2 != null && (list4 = lVar2.f185103b) != null) {
                                        list4.clear();
                                    }
                                    if (lVar2 != null && (list3 = lVar2.f185103b) != null) {
                                        list3.addAll(parcelableArrayListExtra2 != null ? wg0.j.d(parcelableArrayListExtra2) : j0.f134944a);
                                    }
                                    o0VarC7.A = true;
                                    o0VarC7.f72669o.j(new o13.p<>(w.a(wVar2, aVarD2), 0));
                                    break;
                                }
                            }
                        }
                        break;
                    default:
                        f.a aVar7 = (f.a) obj;
                        int i25 = k.C;
                        aVar7.getClass();
                        if (aVar7.f67585a == -1) {
                            Intent intent3 = aVar7.f67586b;
                            long longExtra = intent3 != null ? intent3.getLongExtra("GCM_extra_activity_id", -1L) : -1L;
                            o0 o0VarC8 = kVar.C6();
                            w wVar3 = (w) p13.h0.e0(0, o0VarC8.f72673t);
                            if (wVar3 != null) {
                                Parcelable parcelable3 = wVar3.f78314d;
                                if (parcelable3 instanceof wg0.a) {
                                    wg0.a aVar8 = (wg0.a) parcelable3;
                                    if (p005kotlin.jvm.internal.s.g(aVar8.f(), String.valueOf(longExtra)) && aVar8.h()) {
                                        wg0.l lVar3 = aVar8.f185059r;
                                        o0VarC8.f72669o.j(new o13.p<>(w.a(wVar3, wg0.a.b(aVar8, null, lVar3 != null ? wg0.l.b(lVar3, lVar3.f185102a, lVar3.f185103b, 24) : null, null, null, null, 536739839)), 0));
                                        o0VarC8.A = true;
                                        break;
                                    }
                                }
                            }
                        }
                        break;
                }
            }
        });
        cVarRegisterForActivityResult2.getClass();
        this.f78274z = cVarRegisterForActivityResult2;
        final int i19 = 2;
        f.c<Intent> cVarRegisterForActivityResult3 = registerForActivityResult(new g.h(), new f.b(this) { // from class: go1.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ k f78229b;

            {
                this.f78229b = this;
            }

            @Override // f.b
            public final void a(Object obj) {
                Intent intent;
                List<wg0.c> list;
                List<wg0.c> listT;
                List<wg0.c> list2;
                Intent intent2;
                List<wg0.c> list3;
                List<wg0.c> list4;
                int i110 = i19;
                k kVar = this.f78229b;
                switch (i110) {
                    case 0:
                        f.a aVar = (f.a) obj;
                        int i111 = k.C;
                        aVar.getClass();
                        i2.a aVar2 = i2.f36769a;
                        a2 a2Var = a2.GENERAL;
                        aVar2.getClass();
                        i2.a.k(a2Var, "BaseCommentListFragment", "View post feed image result");
                        if (aVar.f67585a == -1 && (intent = aVar.f67586b) != null && intent.getBooleanExtra("GCM_extra_image_list_changed", false)) {
                            String stringExtra = intent.getStringExtra("GCM_conversation_resource_id");
                            ArrayList parcelableArrayListExtra = Build.VERSION.SDK_INT >= 33 ? intent.getParcelableArrayListExtra("GCM_extra_images_data", jo1.f.class) : intent.getParcelableArrayListExtra("GCM_extra_images_data");
                            o0 o0VarC6 = kVar.C6();
                            if (stringExtra != null) {
                                w wVar = (w) o0VarC6.f72673t.get(0);
                                Parcelable parcelable = wVar.f78314d;
                                if (parcelable instanceof wg0.a) {
                                    wg0.a aVar3 = (wg0.a) parcelable;
                                    if (p005kotlin.jvm.internal.s.g(aVar3.f(), stringExtra) && aVar3.m()) {
                                        wg0.a aVarD = wg0.a.d(aVar3);
                                        wg0.l lVar = aVarD.f185059r;
                                        jo1.e eVar = aVarD.f185061v;
                                        if (eVar != null) {
                                            eVar.s(parcelableArrayListExtra);
                                        }
                                        if (lVar != null && (list2 = lVar.f185103b) != null) {
                                            list2.clear();
                                        }
                                        if (lVar != null && (list = lVar.f185103b) != null) {
                                            if (eVar == null || (listT = eVar.t()) == null) {
                                                listT = j0.f134944a;
                                            }
                                            list.addAll(listT);
                                        }
                                        o0VarC6.A = true;
                                        o0VarC6.f72669o.j(new o13.p<>(w.a(wVar, aVarD), 0));
                                        break;
                                    }
                                }
                            }
                        }
                        break;
                    case 1:
                        f.a aVar4 = (f.a) obj;
                        int i24 = k.C;
                        aVar4.getClass();
                        i2.a aVar5 = i2.f36769a;
                        a2 a2Var2 = a2.GENERAL;
                        aVar5.getClass();
                        i2.a.k(a2Var2, "BaseCommentListFragment", "View activity feed image result");
                        if (aVar4.f67585a == -1 && (intent2 = aVar4.f67586b) != null && intent2.getBooleanExtra("GCM_extra_image_list_changed", false)) {
                            intent2.getLongExtra("GCM_conversation_resource_id", 0L);
                            ArrayList parcelableArrayListExtra2 = Build.VERSION.SDK_INT >= 33 ? intent2.getParcelableArrayListExtra("GCM_extra_images_data", ps.j.class) : intent2.getParcelableArrayListExtra("GCM_extra_images_data");
                            o0 o0VarC7 = kVar.C6();
                            w wVar2 = (w) o0VarC7.f72673t.get(0);
                            Parcelable parcelable2 = wVar2.f78314d;
                            if (parcelable2 instanceof wg0.a) {
                                wg0.a aVar6 = (wg0.a) parcelable2;
                                if (p005kotlin.jvm.internal.s.g(aVar6.f(), o0VarC7.f72657d) && aVar6.h()) {
                                    wg0.a aVarD2 = wg0.a.d(aVar6);
                                    wg0.l lVar2 = aVarD2.f185059r;
                                    if (lVar2 != null && (list4 = lVar2.f185103b) != null) {
                                        list4.clear();
                                    }
                                    if (lVar2 != null && (list3 = lVar2.f185103b) != null) {
                                        list3.addAll(parcelableArrayListExtra2 != null ? wg0.j.d(parcelableArrayListExtra2) : j0.f134944a);
                                    }
                                    o0VarC7.A = true;
                                    o0VarC7.f72669o.j(new o13.p<>(w.a(wVar2, aVarD2), 0));
                                    break;
                                }
                            }
                        }
                        break;
                    default:
                        f.a aVar7 = (f.a) obj;
                        int i25 = k.C;
                        aVar7.getClass();
                        if (aVar7.f67585a == -1) {
                            Intent intent3 = aVar7.f67586b;
                            long longExtra = intent3 != null ? intent3.getLongExtra("GCM_extra_activity_id", -1L) : -1L;
                            o0 o0VarC8 = kVar.C6();
                            w wVar3 = (w) p13.h0.e0(0, o0VarC8.f72673t);
                            if (wVar3 != null) {
                                Parcelable parcelable3 = wVar3.f78314d;
                                if (parcelable3 instanceof wg0.a) {
                                    wg0.a aVar8 = (wg0.a) parcelable3;
                                    if (p005kotlin.jvm.internal.s.g(aVar8.f(), String.valueOf(longExtra)) && aVar8.h()) {
                                        wg0.l lVar3 = aVar8.f185059r;
                                        o0VarC8.f72669o.j(new o13.p<>(w.a(wVar3, wg0.a.b(aVar8, null, lVar3 != null ? wg0.l.b(lVar3, lVar3.f185102a, lVar3.f185103b, 24) : null, null, null, null, 536739839)), 0));
                                        o0VarC8.A = true;
                                        break;
                                    }
                                }
                            }
                        }
                        break;
                }
            }
        });
        cVarRegisterForActivityResult3.getClass();
        this.A = cVarRegisterForActivityResult3;
        this.B = s3.b();
    }

    public final RecyclerView A6() {
        RecyclerView recyclerView = this.f78256f;
        if (recyclerView != null) {
            return recyclerView;
        }
        p005kotlin.jvm.internal.s.m("recyclerView");
        throw null;
    }

    public final o0 C6() {
        return (o0) this.f78251a.getValue();
    }

    @Override // go1.v
    public final void D2() {
        View view2 = getView();
        if (view2 != null) {
            v22.e.b(view2);
        }
        PostCommentView postCommentView = this.f78259i;
        if (postCommentView == null) {
            p005kotlin.jvm.internal.s.m("postCommentView");
            throw null;
        }
        TaggableEditText taggableEditText = postCommentView.f47848c;
        if (taggableEditText != null) {
            taggableEditText.clearFocus();
        }
    }

    public final void E6() {
        int size = y6().f78226h.size() - 1;
        if (size < 0) {
            size = 0;
        }
        A6().scrollToPosition(size);
    }

    @Override // po1.b
    public final void F() {
        TextView textView = this.f78258h;
        if (textView != null) {
            textView.setVisibility(0);
        } else {
            p005kotlin.jvm.internal.s.m("newCommentButton");
            throw null;
        }
    }

    public final void F6() {
        SwipeRefreshLayout swipeRefreshLayout = this.f78255e;
        if (swipeRefreshLayout != null) {
            swipeRefreshLayout.setRefreshing(false);
        } else {
            p005kotlin.jvm.internal.s.m("swipeRefreshLayout");
            throw null;
        }
    }

    @Override // xg0.o
    public final void G(wg0.a aVar) {
        aVar.getClass();
    }

    @Override // xg0.a
    public final void G1(wg0.a aVar) {
        o0 o0VarC6 = C6();
        wg0.m mVar = aVar.f185060t;
        y0 y0VarK = xy2.b.K(o0VarC6, new q1(mVar != null ? mVar.f185111d : null, mVar != null ? mVar.f185110c : null, o0VarC6, null));
        n0 viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        dh.b.L(y0VarK, viewLifecycleOwner, new go1.e(aVar, this, 0));
    }

    public final void G6(int i14, String str, String str2, String str3) {
        com.airbnb.lottie.animation.keyframe.a.y(str, str2, str3);
        com.garmin.android.apps.connectmobile.q1.b bVar = com.garmin.android.apps.connectmobile.q1.f41066b;
        String string = getString(R.string.msg_conversation_confirm_delete);
        string.getClass();
        go1.i iVar = new go1.i(this, str, str2, str3, i14);
        bVar.getClass();
        com.garmin.android.apps.connectmobile.q1 q1VarA = com.garmin.android.apps.connectmobile.q1.b.a(R.string.title_conversation_confirm_delete, string, R.string.lbl_delete, R.string.lbl_cancel, iVar);
        androidx.fragment.app.v childFragmentManager = getChildFragmentManager();
        childFragmentManager.getClass();
        q1VarA.v6(childFragmentManager, "delete_comment_dialog_fragment");
    }

    public final void H6(boolean z14) {
        c2 c2Var;
        c2 c2Var2 = this.f78268r;
        if (c2Var2 != null && c2Var2.isActive() && (c2Var = this.f78268r) != null) {
            c2Var.c(null);
        }
        if (z14) {
            z6().f44545a = true;
            return;
        }
        i0 i0VarW = o53.f0.w(this);
        x53.c cVar = o53.s0.f129406a;
        this.f78268r = ge1.b.T(i0VarW, u53.o.f168762a, null, new d(null), 2);
    }

    public boolean I6(boolean z14) {
        return this.f78254d.a() && z14;
    }

    public final void J6(wg0.a aVar) {
        y6().r(w.a((w) y6().f78226h.get(0), aVar), 0);
    }

    @Override // xg0.o
    public final void L5(String str) {
        str.getClass();
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.f
    public final void M7() {
        v6(true);
        if (!this.f78264n) {
            this.f78262l = true;
        }
        PostCommentView postCommentView = this.f78259i;
        if (postCommentView != null) {
            postCommentView.k();
        } else {
            p005kotlin.jvm.internal.s.m("postCommentView");
            throw null;
        }
    }

    @Override // xg0.o
    public final void Q1(wg0.a aVar) {
        aVar.getClass();
    }

    @Override // xg0.n
    public final void R3(wg0.k kVar) {
        VideoPlayerActivity.a aVar = VideoPlayerActivity.f44499a;
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        aVar.getClass();
        this.A.a(VideoPlayerActivity.a.a(contextRequireContext, kVar), null);
    }

    @Override // xg0.n
    public final void S2(com.garmin.android.library.mapsdkadapter.i.d dVar, int i14) {
        dVar.getClass();
        o0 o0VarC6 = C6();
        androidx.fragment.app.m mVarRequireActivity = requireActivity();
        mVarRequireActivity.getClass();
        o0VarC6.H4().c(mVarRequireActivity, dVar, i14);
    }

    @Override // xg0.o
    public final void T5(String str) {
        str.getClass();
    }

    @Override // xg0.o
    public final void V3(String str, String str2) {
        str.getClass();
        o0 o0VarC6 = C6();
        androidx.fragment.app.m mVarRequireActivity = requireActivity();
        mVarRequireActivity.getClass();
        o0VarC6.H4().b(mVarRequireActivity, str, str2);
    }

    @Override // xg0.o
    public final void W5(wg0.a aVar) {
        aVar.getClass();
    }

    @Override // xg0.a
    public final void Y1(wg0.a aVar) {
        aVar.getClass();
    }

    @Override // xg0.o
    public final void c4(String str) {
        str.getClass();
    }

    @Override // com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.e.b
    public final void g0(boolean z14) {
        int i14;
        if (this.f78260j != null) {
            boolean zI6 = I6(z14);
            boolean z15 = this.f78265o || zI6;
            this.f78265o = zI6;
            BubbleLayout bubbleLayout = this.f78260j;
            if (bubbleLayout == null) {
                p005kotlin.jvm.internal.s.m("tooltip");
                throw null;
            }
            v22.e.r(bubbleLayout, z15);
        }
        boolean z16 = this.f78266p;
        if (z16 && z14 && (i14 = this.f78267q) != -1) {
            ge1.b.T(o53.f0.w(this), null, null, new p(this, i14, null), 3);
            return;
        }
        if (z14 && z16) {
            return;
        }
        v3(com.garmin.android.apps.connectmobile.tag.a.e.f45057a);
        int height = A6().getHeight();
        FrameLayout frameLayout = this.f78257g;
        if (frameLayout == null) {
            p005kotlin.jvm.internal.s.m("taggingSuggestionContainer");
            throw null;
        }
        ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
        layoutParams.height = height;
        FrameLayout frameLayout2 = this.f78257g;
        if (frameLayout2 != null) {
            frameLayout2.setLayoutParams(layoutParams);
        } else {
            p005kotlin.jvm.internal.s.m("taggingSuggestionContainer");
            throw null;
        }
    }

    @Override // pi2.b
    public final String getIdentifier() {
        String str = C6().f72657d;
        return str == null ? "" : str;
    }

    @Override // xg0.o
    public final void i1(wg0.a aVar) {
        aVar.getClass();
    }

    @Override // xg0.a
    public final void i2(wg0.a aVar) {
        aVar.getClass();
    }

    @Override // com.garmin.android.apps.connectmobile.view.view_3_0.PostCommentView.b
    public final void m6(Editable editable) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) editable);
        PostCommentView postCommentView = this.f78259i;
        if (postCommentView == null) {
            p005kotlin.jvm.internal.s.m("postCommentView");
            throw null;
        }
        postCommentView.setCommentText("");
        u6(spannableStringBuilder);
    }

    @Override // go1.v
    public final void n(String str) {
        ConversationActivity.a aVar = ConversationActivity.f44530c;
        androidx.fragment.app.m mVarRequireActivity = requireActivity();
        mVarRequireActivity.getClass();
        aVar.getClass();
        Intent intent = new Intent(mVarRequireActivity, (Class<?>) ConversationActivity.class);
        intent.setAction("GCM_action_view_comment_likes");
        intent.putExtra("GCM_conversation_comment_id", str);
        requireActivity().startActivity(intent);
    }

    @Override // go1.v
    public final void o1(int i14, boolean z14) {
        ConversationCommentDTO conversationCommentDTO;
        String str;
        String str2;
        View view2 = getView();
        if (view2 != null) {
            v22.e.b(view2);
        }
        this.f78267q = -1;
        c0 c0VarY6 = y6();
        Iterator it = c0VarY6.f78226h.iterator();
        while (it.hasNext()) {
            w.c cVar = ((w) it.next()).f78315e;
            u22.a aVar = u22.a.NORMAL;
            cVar.getClass();
            aVar.getClass();
            cVar.f78320e = aVar;
        }
        c0VarY6.notifyItemRangeChanged(0, c0VarY6.f78226h.size(), new t());
        PostCommentView postCommentView = this.f78259i;
        if (postCommentView == null) {
            p005kotlin.jvm.internal.s.m("postCommentView");
            throw null;
        }
        postCommentView.setVisibility(0);
        SwipeRefreshLayout swipeRefreshLayout = this.f78255e;
        if (swipeRefreshLayout == null) {
            p005kotlin.jvm.internal.s.m("swipeRefreshLayout");
            throw null;
        }
        swipeRefreshLayout.setEnabled(true);
        this.f78266p = false;
        H6(true);
        if (z14) {
            o0 o0VarC6 = C6();
            Context contextRequireContext = requireContext();
            contextRequireContext.getClass();
            w wVar = (w) p13.h0.e0(i14, o0VarC6.f72673t);
            if (wVar == null || (conversationCommentDTO = wVar.f78313c) == null || (str = conversationCommentDTO.f44547b) == null || (str2 = conversationCommentDTO.f44546a) == null) {
                return;
            }
            w9.a aVarA = v1.a(o0VarC6);
            x53.c cVar2 = o53.s0.f129406a;
            ge1.b.T(aVarA, x53.b.f189152a, null, new r1(o0VarC6, str, str2, wVar, i14, conversationCommentDTO, contextRequireContext, null), 2);
        }
    }

    @Override // xg0.n
    public final void o4(wg0.a aVar, ie2.c cVar) {
        aVar.getClass();
        Long l14 = aVar.f185042a;
        if (l14 != null) {
            long jLongValue = l14.longValue();
            o0 o0VarC6 = C6();
            androidx.fragment.app.m mVarRequireActivity = requireActivity();
            mVarRequireActivity.getClass();
            String str = aVar.f185043b;
            x0 x0Var = aVar.f185044c;
            x0Var.getClass();
            o0VarC6.H4().u(mVarRequireActivity, jLongValue, str, x0Var, null);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        TaggableEditText taggableEditText;
        layoutInflater.getClass();
        View viewInflate = layoutInflater.inflate(R.layout.conversation_comment_list, viewGroup, false);
        View viewFindViewById = viewInflate.findViewById(R.id.swipe_refresh_layout);
        viewFindViewById.getClass();
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) viewFindViewById;
        this.f78255e = swipeRefreshLayout;
        swipeRefreshLayout.setOnRefreshListener(this);
        this.f78262l = C6().f72661h;
        androidx.recyclerview.widget.s sVar = new androidx.recyclerview.widget.s(new n(this, requireContext().getResources(), a7.b.getColor(requireContext(), R.color.gcm_surface_danger_action), R.string.lbl_delete, a7.b.getColor(requireContext(), R.color.gcm_text_on_color), R.dimen.andfont_body_1));
        View viewFindViewById2 = viewInflate.findViewById(R.id.recycler_view);
        viewFindViewById2.getClass();
        this.f78256f = (RecyclerView) viewFindViewById2;
        sVar.e(A6());
        A6().setAdapter(y6());
        RecyclerView recyclerViewA6 = A6();
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        LockableLayoutManager lockableLayoutManager = new LockableLayoutManager(contextRequireContext);
        this.f78261k = lockableLayoutManager;
        recyclerViewA6.setLayoutManager(lockableLayoutManager);
        z6().setMeasurementCacheEnabled(false);
        View viewFindViewById3 = viewInflate.findViewById(R.id.suggestion_container);
        viewFindViewById3.getClass();
        this.f78257g = (FrameLayout) viewFindViewById3;
        Context contextRequireContext2 = requireContext();
        contextRequireContext2.getClass();
        ComposeView composeView = new ComposeView(contextRequireContext2, null, 0, 6, null);
        composeView.setContent(new z3.e(1592697331, true, new go1.g(this, 0)));
        FrameLayout frameLayout = this.f78257g;
        if (frameLayout == null) {
            p005kotlin.jvm.internal.s.m("taggingSuggestionContainer");
            throw null;
        }
        frameLayout.addView(composeView);
        View viewFindViewById4 = viewInflate.findViewById(R.id.new_comment_button);
        viewFindViewById4.getClass();
        this.f78258h = (TextView) viewFindViewById4;
        View viewFindViewById5 = viewInflate.findViewById(R.id.post_comment_view);
        viewFindViewById5.getClass();
        this.f78259i = (PostCommentView) viewFindViewById5;
        View viewFindViewById6 = viewInflate.findViewById(R.id.tool_tip_container);
        viewFindViewById6.getClass();
        this.f78260j = (BubbleLayout) viewFindViewById6;
        if (this.B) {
            FrameLayout frameLayout2 = this.f78257g;
            if (frameLayout2 == null) {
                p005kotlin.jvm.internal.s.m("taggingSuggestionContainer");
                throw null;
            }
            frameLayout2.setVisibility(8);
            TextView textView = this.f78258h;
            if (textView == null) {
                p005kotlin.jvm.internal.s.m("newCommentButton");
                throw null;
            }
            textView.setVisibility(8);
            PostCommentView postCommentView = this.f78259i;
            if (postCommentView == null) {
                p005kotlin.jvm.internal.s.m("postCommentView");
                throw null;
            }
            postCommentView.setVisibility(8);
            BubbleLayout bubbleLayout = this.f78260j;
            if (bubbleLayout != null) {
                bubbleLayout.setVisibility(8);
                return viewInflate;
            }
            p005kotlin.jvm.internal.s.m("tooltip");
            throw null;
        }
        TextView textView2 = this.f78258h;
        if (textView2 == null) {
            p005kotlin.jvm.internal.s.m("newCommentButton");
            throw null;
        }
        final int i14 = 0;
        textView2.setOnClickListener(new View.OnClickListener(this) { // from class: go1.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ k f78214b;

            {
                this.f78214b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i15 = i14;
                k kVar = this.f78214b;
                switch (i15) {
                    case 0:
                        TextView textView3 = kVar.f78258h;
                        if (textView3 == null) {
                            p005kotlin.jvm.internal.s.m("newCommentButton");
                            throw null;
                        }
                        textView3.setVisibility(8);
                        kVar.M7();
                        return;
                    default:
                        int i16 = k.C;
                        kVar.f78254d.b();
                        BubbleLayout bubbleLayout2 = kVar.f78260j;
                        if (bubbleLayout2 == null) {
                            p005kotlin.jvm.internal.s.m("tooltip");
                            throw null;
                        }
                        bubbleLayout2.setVisibility(8);
                        kVar.f78265o = false;
                        return;
                }
            }
        });
        PostCommentView postCommentView2 = this.f78259i;
        if (postCommentView2 == null) {
            p005kotlin.jvm.internal.s.m("postCommentView");
            throw null;
        }
        postCommentView2.setCommentHint(w6());
        postCommentView2.setPostCommentListener(this);
        if (C6().f72662i && (taggableEditText = postCommentView2.f47848c) != null) {
            taggableEditText.requestFocus();
        }
        postCommentView2.setSuggestionListener(this);
        m mVar = new m(this);
        TaggableEditText taggableEditText2 = postCommentView2.f47848c;
        if (taggableEditText2 != null) {
            taggableEditText2.addTextChangedListener(mVar);
        }
        BubbleLayout bubbleLayout2 = this.f78260j;
        if (bubbleLayout2 == null) {
            p005kotlin.jvm.internal.s.m("tooltip");
            throw null;
        }
        final int i15 = 1;
        bubbleLayout2.setOnClickListener(new View.OnClickListener(this) { // from class: go1.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ k f78214b;

            {
                this.f78214b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i16 = i15;
                k kVar = this.f78214b;
                switch (i16) {
                    case 0:
                        TextView textView3 = kVar.f78258h;
                        if (textView3 == null) {
                            p005kotlin.jvm.internal.s.m("newCommentButton");
                            throw null;
                        }
                        textView3.setVisibility(8);
                        kVar.M7();
                        return;
                    default:
                        int i17 = k.C;
                        kVar.f78254d.b();
                        BubbleLayout bubbleLayout3 = kVar.f78260j;
                        if (bubbleLayout3 == null) {
                            p005kotlin.jvm.internal.s.m("tooltip");
                            throw null;
                        }
                        bubbleLayout3.setVisibility(8);
                        kVar.f78265o = false;
                        return;
                }
            }
        });
        View viewFindViewById7 = viewInflate.findViewById(R.id.comment_tooltip);
        viewFindViewById7.getClass();
        ((TextView) viewFindViewById7).setText(getString(R.string.social_add_comment_tagging_hint));
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        this.f78263m = System.currentTimeMillis();
        super.onPause();
        po1.e.f139032b.remove(this);
        com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.e.f40568e.getClass();
        com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.e eVarRemove = com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.e.f40569f.remove(this);
        if (eVarRemove != null) {
            eVarRemove.f40570a = null;
            eVarRemove.f40571b.getViewTreeObserver().removeOnGlobalLayoutListener(eVarRemove);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        po1.e.f139032b.add(this);
        com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.e.a aVar = com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.e.f40568e;
        androidx.fragment.app.m mVarRequireActivity = requireActivity();
        mVarRequireActivity.getClass();
        aVar.getClass();
        com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.e.a.a(mVarRequireActivity, this);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        y0<List<w>> y0Var = C6().f72667m;
        n0 viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        dh.b.L(y0Var, viewLifecycleOwner, new c(new go1.f(this, 0)));
        y0<o13.p<List<w>, Boolean>> y0Var2 = C6().f72668n;
        n0 viewLifecycleOwner2 = getViewLifecycleOwner();
        viewLifecycleOwner2.getClass();
        dh.b.L(y0Var2, viewLifecycleOwner2, new c(new go1.f(this, 1)));
        y0<o13.p<w, Integer>> y0Var3 = C6().f72669o;
        n0 viewLifecycleOwner3 = getViewLifecycleOwner();
        viewLifecycleOwner3.getClass();
        dh.b.L(y0Var3, viewLifecycleOwner3, new c(new go1.f(this, 2)));
        y0<Integer> y0Var4 = C6().f72670p;
        n0 viewLifecycleOwner4 = getViewLifecycleOwner();
        viewLifecycleOwner4.getClass();
        dh.b.L(y0Var4, viewLifecycleOwner4, new c(new go1.f(this, 3)));
        y0<w> y0Var5 = C6().f72671q;
        n0 viewLifecycleOwner5 = getViewLifecycleOwner();
        viewLifecycleOwner5.getClass();
        dh.b.L(y0Var5, viewLifecycleOwner5, new c(new go1.f(this, 4)));
        y0<lj0.b> y0Var6 = C6().f72666l;
        n0 viewLifecycleOwner6 = getViewLifecycleOwner();
        viewLifecycleOwner6.getClass();
        dh.b.L(y0Var6, viewLifecycleOwner6, new c(new go1.f(this, 5)));
        M7();
    }

    @Override // go1.v
    public final void p0(String str, boolean z14) {
        str.getClass();
        o0 o0VarC6 = C6();
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        w9.a aVarA = v1.a(o0VarC6);
        x53.c cVar = o53.s0.f129406a;
        ge1.b.T(aVarA, x53.b.f189152a, null, new l1(z14, o0VarC6, str, contextRequireContext, null), 2);
        this.f78262l = false;
    }

    @Override // xg0.a
    public final void p2(wg0.a aVar) {
        aVar.getClass();
        PostCommentView postCommentView = this.f78259i;
        if (postCommentView == null) {
            p005kotlin.jvm.internal.s.m("postCommentView");
            throw null;
        }
        TaggableEditText taggableEditText = postCommentView.f47848c;
        if (taggableEditText != null) {
            taggableEditText.requestFocus();
        }
        TaggableEditText taggableEditText2 = postCommentView.f47848c;
        if (taggableEditText2 != null) {
            v22.e.t(taggableEditText2);
        }
    }

    @Override // go1.v
    public final void p4(w wVar, int i14) {
        wVar.getClass();
        ConversationCommentDTO conversationCommentDTO = wVar.f78313c;
        if (conversationCommentDTO == null) {
            return;
        }
        r.a aVar = r.f78297l;
        boolean zB = wVar.b();
        boolean z14 = !s3.b();
        aVar.getClass();
        r rVar = new r();
        Bundle bundle = new Bundle();
        bundle.putInt("ADAPTER_POSITION", i14);
        bundle.putParcelable("CONVERSATION_COMMENT_DTO", conversationCommentDTO);
        bundle.putBoolean("IS_DELETABLE", zB);
        bundle.putBoolean("IS_EDITABLE", z14);
        rVar.setArguments(bundle);
        rVar.f78308k = this;
        rVar.show(requireActivity().getSupportFragmentManager(), "");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [p13.j0] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.util.ArrayList] */
    @Override // xg0.n
    public final void r6(wg0.a aVar, wg0.c cVar) {
        jo1.e eVar;
        Intent intentD;
        ?? arrayList;
        Intent intentS;
        List<wg0.c> list;
        aVar.getClass();
        boolean zH = aVar.h();
        o13.t tVar = this.f78269t;
        if (!zH) {
            if (!aVar.m() || (eVar = aVar.f185061v) == null) {
                return;
            }
            String uuid = eVar.getUuid();
            List<jo1.f> listK = eVar.k();
            if (listK == null) {
                return;
            }
            if (listK.size() == 1) {
                iz0.a aVar2 = (iz0.a) tVar.getValue();
                androidx.fragment.app.m mVarRequireActivity = requireActivity();
                mVarRequireActivity.getClass();
                intentD = aVar2.p(mVarRequireActivity, uuid, listK, aVar.k());
            } else {
                iz0.a aVar3 = (iz0.a) tVar.getValue();
                androidx.fragment.app.m mVarRequireActivity2 = requireActivity();
                mVarRequireActivity2.getClass();
                intentD = aVar3.d(mVarRequireActivity2, uuid, listK, Boolean.valueOf(aVar.k()));
            }
            this.f78273y.a(intentD, null);
            return;
        }
        ps.q qVar = aVar.f185057p;
        if (qVar == null) {
            i2.a aVar4 = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar4.getClass();
            i2.a.f(a2Var, "BaseCommentListFragment", "activityStatsBrief should not be null in ActivityFeed!!");
            i2.a.f(a2Var, "BaseCommentListFragment", "activityFeed: " + aVar);
            Context contextRequireContext = requireContext();
            contextRequireContext.getClass();
            q0.b(contextRequireContext);
            return;
        }
        wg0.l lVar = aVar.f185059r;
        if (lVar == null || (list = lVar.f185103b) == null) {
            arrayList = j0.f134944a;
        } else {
            arrayList = new ArrayList(p13.y.r(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((wg0.c) it.next()).f185077b);
            }
        }
        ArrayList arrayList2 = new ArrayList((Collection) arrayList);
        if (arrayList2.size() == 1) {
            iz0.a aVar5 = (iz0.a) tVar.getValue();
            androidx.fragment.app.m mVarRequireActivity3 = requireActivity();
            mVarRequireActivity3.getClass();
            intentS = aVar5.h(mVarRequireActivity3, qVar, arrayList2, cVar, aVar.j());
        } else {
            iz0.a aVar6 = (iz0.a) tVar.getValue();
            androidx.fragment.app.m mVarRequireActivity4 = requireActivity();
            mVarRequireActivity4.getClass();
            intentS = aVar6.s(mVarRequireActivity4, qVar, arrayList2, Boolean.valueOf(aVar.j()));
        }
        this.f78274z.a(intentS, null);
    }

    @Override // go1.v
    public final void s1(String str, String str2) {
        str.getClass();
        bv.g gVar = (bv.g) KoinJavaComponent.get$default(bv.g.class, null, null, 6, null);
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        gVar.b(contextRequireContext, str, str2);
    }

    @Override // xg0.o
    public final void s3(wg0.a aVar) {
        aVar.getClass();
        if (C6().f72663j) {
            o0 o0VarC6 = C6();
            androidx.fragment.app.m mVarRequireActivity = requireActivity();
            mVarRequireActivity.getClass();
            o0VarC6.H4().k(mVarRequireActivity, aVar);
        }
    }

    @Override // xg0.o
    public final void u4() {
    }

    public abstract void u6(SpannableStringBuilder spannableStringBuilder);

    @Override // cs1.f
    public final void v3(com.garmin.android.apps.connectmobile.tag.a aVar) {
        aVar.getClass();
        boolean z14 = aVar instanceof com.garmin.android.apps.connectmobile.tag.a.c;
        FrameLayout frameLayout = this.f78257g;
        if (frameLayout == null) {
            p005kotlin.jvm.internal.s.m("taggingSuggestionContainer");
            throw null;
        }
        v22.e.r(frameLayout, z14);
        boolean z15 = !z14;
        SwipeRefreshLayout swipeRefreshLayout = this.f78255e;
        if (swipeRefreshLayout == null) {
            p005kotlin.jvm.internal.s.m("swipeRefreshLayout");
            throw null;
        }
        swipeRefreshLayout.setEnabled(z15);
        H6(z15);
        if (aVar instanceof com.garmin.android.apps.connectmobile.tag.a.C0860a) {
            g22.e.a(this, null);
        }
    }

    public abstract void v6(boolean z14);

    public void w3(String str) {
        str.getClass();
        int i14 = this.f78267q;
        if (i14 != -1) {
            A6().postDelayed(new androidx.media3.exoplayer.d(this, i14, 6), 100L);
        }
        ((com.garmin.android.apps.connectmobile.tag.b) this.f78253c.getValue()).x4(str, this);
    }

    @Override // xg0.o
    public final void w4(String str) {
        str.getClass();
    }

    public String w6() {
        String string = getString(R.string.social_add_comment_hint);
        string.getClass();
        return string;
    }

    @Override // go1.v
    public final void x2() {
        v6(false);
        this.f78262l = false;
    }

    public final c0 y6() {
        return (c0) this.f78252b.getValue();
    }

    public final LockableLayoutManager z6() {
        LockableLayoutManager lockableLayoutManager = this.f78261k;
        if (lockableLayoutManager != null) {
            return lockableLayoutManager;
        }
        p005kotlin.jvm.internal.s.m("layoutManager");
        throw null;
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0004X\u0084T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00048\u0004X\u0084T¢\u0006\u0006\n\u0004\b\n\u0010\u0006¨\u0006\u000b"}, d2 = {"Lgo1/k$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "", "SNAP_TO_BOTTOM_DELAY_MILLIS", "J", "CONFIRM_DELETE_DIALOG_TAG", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}

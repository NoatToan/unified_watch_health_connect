package i10;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.m;
import androidx.lifecycle.n0;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y0;
import androidx.lifecycle.y1;
import androidx.lifecycle.z0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import c22.j0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.connections.groups.challenges.GroupChallengeRulesActivity;
import com.garmin.android.apps.connectmobile.connections.groups.services.model.GroupChallengeDTO;
import com.garmin.android.apps.connectmobile.leaderboard.model.e0;
import com.garmin.android.apps.connectmobile.leaderboard.model.s;
import com.garmin.android.apps.connectmobile.m0;
import e23.l;
import fw.p;
import go1.g0;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import mt0.x0;
import o53.b0;
import o53.c2;
import org.joda.time.DateTime;
import org.joda.time.Days;
import org.joda.time.LocalTime;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.n;
import p005kotlin.jvm.internal.q;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.w;
import yc.v2;
import yc.y2;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Li10/c;", "Lcom/garmin/android/apps/connectmobile/m0;", "<init>", "()V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c extends m0 {
    public static final a A = new a(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final w1 f87003h = new w1(s0.f105811a.b(i10.h.class), new h(this), new j(this), new i(null, this));

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public i10.a f87004i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public FrameLayout f87005j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public LinearLayoutManager f87006k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public TextView f87007l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public TextView f87008m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public x0 f87009n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f87010o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f87011p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public GroupChallengeDTO f87012q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public RecyclerView f87013r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public TextView f87014t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public TextView f87015v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public MenuItem f87016w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public c2 f87017x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f87018y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f87019z;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f87020a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f87021b;

        static {
            int[] iArr = new int[p.values().length];
            try {
                iArr[p.LOADING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[p.SUCCESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[p.ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f87020a = iArr;
            int[] iArr2 = new int[s.values().length];
            try {
                iArr2[s.f38311g.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[s.f38313i.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[s.f38309e.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[s.f38310f.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[s.f38308d.ordinal()] = 5;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[s.f38307c.ordinal()] = 6;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[s.f38312h.ordinal()] = 7;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[s.f38316l.ordinal()] = 8;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[s.f38315k.ordinal()] = 9;
            } catch (NoSuchFieldError unused12) {
            }
            f87021b = iArr2;
        }
    }

    /* JADX INFO: renamed from: i10.c$c, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.connections.groups.challenges.GroupChallengeLeaderboardFragment$getGroupChallengesDetails$1$1$1", f = "GroupChallengeLeaderboardFragment.kt", l = {272}, m = "invokeSuspend", v = 2)
    public static final class C1728c extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f87022a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ GroupChallengeDTO f87024c;

        /* JADX INFO: renamed from: i10.c$c$a */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class a<T> implements r53.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ c f87025a;

            public a(c cVar) {
                this.f87025a = cVar;
            }

            @Override // r53.j
            public final Object emit(Object obj, t13.d dVar) {
                Object objX;
                v2<T> v2Var = (v2) obj;
                i10.a aVar = this.f87025a.f87004i;
                return (aVar == null || (objX = aVar.x(v2Var, dVar)) != u13.a.COROUTINE_SUSPENDED) ? Unit.INSTANCE : objX;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1728c(GroupChallengeDTO groupChallengeDTO, t13.d<? super C1728c> dVar) {
            super(2, dVar);
            this.f87024c = groupChallengeDTO;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return c.this.new C1728c(this.f87024c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((C1728c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type t13.d to i10.c$c for r14v1 'this'  t13.d
            	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
            	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
            	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
            	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
            */
        @Override // v13.a
        public final java.lang.Object invokeSuspend(java.lang.Object r15) {
            /*
                r14 = this;
                u13.a r0 = u13.a.COROUTINE_SUSPENDED
                int r1 = r14.f87022a
                r2 = 1
                if (r1 == 0) goto L14
                if (r1 != r2) goto Ld
                o13.r.b(r15)
                goto L61
            Ld:
                java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
                vb.h.z(r15)
                r15 = 0
                return r15
            L14:
                o13.r.b(r15)
                i10.c$a r15 = i10.c.A
                i10.c r15 = i10.c.this
                androidx.lifecycle.w1 r1 = r15.f87003h
                java.lang.Object r1 = r1.getValue()
                i10.h r1 = (i10.h) r1
                com.garmin.android.apps.connectmobile.connections.groups.services.model.GroupChallengeDTO r3 = r14.f87024c
                r3.getClass()
                yc.t2 r4 = new yc.t2
                yc.u2 r5 = new yc.u2
                r12 = 52
                r13 = 0
                r6 = 50
                r7 = 5
                r8 = 0
                r9 = 50
                r10 = 0
                r11 = 0
                r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13)
                gp.f r7 = new gp.f
                r6 = 25
                r7.<init>(r6, r3, r1)
                r8 = 2
                r9 = 0
                r6 = 0
                r4.<init>(r5, r6, r7, r8, r9)
                r53.i<yc.v2<Value>> r3 = r4.f196485a
                w9.a r1 = androidx.lifecycle.v1.a(r1)
                r53.a2 r1 = yc.o.a(r3, r1)
                i10.c$c$a r3 = new i10.c$c$a
                r3.<init>(r15)
                r14.f87022a = r2
                r53.d2<T> r15 = r1.f150526a
                java.lang.Object r15 = r15.collect(r3, r14)
                if (r15 != r0) goto L61
                return r0
            L61:
                kotlin.Unit r15 = p005kotlin.Unit.INSTANCE
                return r15
            */
            throw new UnsupportedOperationException("Method not decompiled: i10.c.C1728c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"i10/c$d", "Landroidx/core/view/s;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class d implements androidx.core.view.s {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ m f87027b;

        public d(m mVar) {
            this.f87027b = mVar;
        }

        @Override // androidx.core.view.s
        public final void Y3(Menu menu, MenuInflater menuInflater) {
            zl.a.f(menu, menuInflater, R.menu.group_challenge_rules, menu);
            MenuItem menuItemFindItem = menu.findItem(R.id.menu_group_challenge_details_item);
            c cVar = c.this;
            menuItemFindItem.setVisible(cVar.f87012q != null);
            cVar.f87016w = menuItemFindItem;
        }

        @Override // androidx.core.view.s
        public final boolean w5(MenuItem menuItem) {
            menuItem.getClass();
            if (menuItem.getItemId() != R.id.menu_group_challenge_details_item) {
                return false;
            }
            GroupChallengeRulesActivity.ca(this.f87027b, c.this.f87012q, 2);
            return true;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"i10/c$e", "Landroidx/recyclerview/widget/RecyclerView$u;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class e extends RecyclerView.u {
        public e() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.u
        public final void onScrolled(RecyclerView recyclerView, int i14, int i15) {
            LinearLayoutManager linearLayoutManager;
            recyclerView.getClass();
            super.onScrolled(recyclerView, i14, i15);
            int childCount = recyclerView.getChildCount();
            c cVar = c.this;
            boolean z14 = false;
            int iFindFirstCompletelyVisibleItemPosition = (childCount == 0 || (linearLayoutManager = cVar.f87006k) == null) ? 0 : linearLayoutManager.findFirstCompletelyVisibleItemPosition();
            if (cVar.f87018y && iFindFirstCompletelyVisibleItemPosition == 0) {
                z14 = true;
            }
            cVar.F6(z14);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class f extends q implements l<Integer, Unit> {
        public f(Object obj) {
            super(1, obj, c.class, "scrollToPosition", "scrollToPosition(I)V", 0);
        }

        @Override // e23.l
        public final Unit invoke(Integer num) {
            int iIntValue = num.intValue();
            c cVar = (c) this.receiver;
            RecyclerView recyclerView = cVar.f87013r;
            if (recyclerView != null) {
                recyclerView.post(new androidx.media3.exoplayer.d(cVar, iIntValue, 7));
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class g implements z0, n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f87029a;

        public g(l lVar) {
            lVar.getClass();
            this.f87029a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof n)) {
                return p005kotlin.jvm.internal.s.g(getFunctionDelegate(), ((n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final o13.h<?> getFunctionDelegate() {
            return this.f87029a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f87029a.invoke(obj);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/y1;", "invoke", "()Landroidx/lifecycle/y1;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class h extends w implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f87030a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(Fragment fragment) {
            super(0);
            this.f87030a = fragment;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f87030a.requireActivity().getF189591b();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class i extends w implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f87031a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Fragment f87032b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(e23.a aVar, Fragment fragment) {
            super(0);
            this.f87031a = aVar;
            this.f87032b = fragment;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f87031a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f87032b.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/x1$c;", "invoke", "()Landroidx/lifecycle/x1$c;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class j extends w implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f87033a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(Fragment fragment) {
            super(0);
            this.f87033a = fragment;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f87033a.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    @Override // com.garmin.android.apps.connectmobile.m0
    public final void E6() {
        I6();
    }

    public final void I6() {
        TextView textView = this.f87015v;
        if (textView != null) {
            textView.setVisibility(8);
        }
        F6(false);
        i10.h hVar = (i10.h) this.f87003h.getValue();
        String str = this.f87010o;
        str.getClass();
        androidx.lifecycle.m.a(null, new i10.i(hVar, str, null), 3).f(getViewLifecycleOwner(), new g(new i10.b(this, 1)));
    }

    /* JADX WARN: Code duplicated, block: B:55:0x012c  */
    /* JADX WARN: Code duplicated, block: B:57:0x012f  */
    /* JADX WARN: Multi-variable type inference failed */
    public final void J6() {
        String string;
        o13.p pVarB;
        TextView textView;
        Date date;
        Date date2;
        Date date3;
        TextView textView2 = this.f87007l;
        View view2 = null;
        if (textView2 != null) {
            GroupChallengeDTO groupChallengeDTO = this.f87012q;
            textView2.setText(groupChallengeDTO != null ? groupChallengeDTO.f31516e : null);
        }
        GroupChallengeDTO groupChallengeDTO2 = this.f87012q;
        if (groupChallengeDTO2 != null) {
            m mVarRequireActivity = requireActivity();
            mVarRequireActivity.getClass();
            jm0.e eVar = jm0.e.f99565a;
            GroupChallengeDTO.b bVar = groupChallengeDTO2.f31513b;
            if (bVar == GroupChallengeDTO.b.IN_PROGRESS) {
                Date date4 = new Date();
                String str = groupChallengeDTO2.f31521j;
                eVar.getClass();
                try {
                    date3 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS").parse(str);
                } catch (ParseException unused) {
                    date3 = null;
                }
                int days = date3 != null ? Days.daysBetween(new DateTime(date4.getTime()), new DateTime(date3.getTime())).getDays() : -1;
                if (days < 0) {
                    string = null;
                } else if (days != 0) {
                    string = days != 1 ? mVarRequireActivity.getString(R.string.lbl_days_remaining, NumberFormat.getInstance().format(days)) : mVarRequireActivity.getString(R.string.lbl_one_day_remaining);
                } else {
                    int hourOfDay = 23 - new LocalTime(date4.getTime()).getHourOfDay();
                    if (hourOfDay != 0) {
                        string = hourOfDay != 1 ? mVarRequireActivity.getString(R.string.lbl_hours_remaining_plural, NumberFormat.getInstance().format(hourOfDay)) : mVarRequireActivity.getString(R.string.lbl_hours_remaining_singular);
                    } else {
                        string = mVarRequireActivity.getString(R.string.lbl_ends_today);
                    }
                }
            } else if (bVar == GroupChallengeDTO.b.UPCOMING) {
                String str2 = groupChallengeDTO2.f31520i;
                eVar.getClass();
                try {
                    date2 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS").parse(str2);
                } catch (ParseException unused2) {
                    date2 = null;
                }
                String strA = date2 != null ? j0.a(new DateTime(date2.getTime()), 'L') : null;
                if (TextUtils.isEmpty(strA)) {
                    string = null;
                } else {
                    string = mVarRequireActivity.getString(R.string.lbl_starts, strA);
                }
            } else if (bVar == GroupChallengeDTO.b.COMPLETED) {
                String str3 = groupChallengeDTO2.f31521j;
                eVar.getClass();
                try {
                    date = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS").parse(str3);
                } catch (ParseException unused3) {
                    date = null;
                }
                String strA2 = date != null ? j0.a(new DateTime(date.getTime()), 'L') : null;
                if (TextUtils.isEmpty(strA2)) {
                    string = null;
                } else {
                    string = mVarRequireActivity.getString(R.string.lbl_group_this_challenge_ended, strA2);
                }
            } else {
                string = null;
            }
            if (string == null) {
                string = "";
            }
        } else {
            string = "";
        }
        boolean zIsEmpty = TextUtils.isEmpty(string);
        TextView textView3 = this.f87008m;
        if (!zIsEmpty) {
            if (textView3 != null) {
                textView3.setVisibility(0);
            }
            TextView textView4 = this.f87008m;
            if (textView4 != null) {
                textView4.setText(string);
            }
        } else if (textView3 != null) {
            textView3.setVisibility(8);
        }
        FrameLayout frameLayout = this.f87005j;
        if (frameLayout != null) {
            if (frameLayout.getChildCount() > 1) {
                frameLayout.removeViewAt(0);
            }
            frameLayout.setVisibility(4);
        }
        FrameLayout frameLayout2 = this.f87005j;
        GroupChallengeDTO groupChallengeDTO3 = this.f87012q;
        if (groupChallengeDTO3 != null) {
            boolean z14 = groupChallengeDTO3.f31528q == 1;
            boolean z15 = groupChallengeDTO3.f31513b == GroupChallengeDTO.b.COMPLETED;
            e0 e0Var = new e0(groupChallengeDTO3.f31524m, groupChallengeDTO3.f31525n, null, 4, null);
            e0 e0Var2 = new e0(groupChallengeDTO3.f31526o, groupChallengeDTO3.f31527p, null, 4, null);
            x0 x0Var = this.f87009n;
            if (x0Var == null) {
                x0Var = x0.STEPS;
            }
            m mVarRequireActivity2 = requireActivity();
            mVarRequireActivity2.getClass();
            e0 e0Var3 = new e0(groupChallengeDTO3.f31529r);
            int i14 = groupChallengeDTO3.f31523l;
            if (i14 > 0) {
                boolean z16 = groupChallengeDTO3.f31524m == i14;
                boolean z17 = (groupChallengeDTO3.f31526o == i14) || ((Math.abs(groupChallengeDTO3.f31527p - e0Var3.f38133b) > 1.0E-7d ? 1 : (Math.abs(groupChallengeDTO3.f31527p - e0Var3.f38133b) == 1.0E-7d ? 0 : -1)) < 0);
                if (z14) {
                    pVarB = mt0.z0.b(mVarRequireActivity2, x0Var, false, e0Var3);
                } else if (z16) {
                    if (z15 && (textView = this.f87014t) != null) {
                        textView.setVisibility(0);
                    }
                    pVarB = mt0.z0.b(mVarRequireActivity2, x0Var, true, e0Var3, e0Var2);
                } else {
                    pVarB = z17 ? mt0.z0.b(mVarRequireActivity2, x0Var, false, e0Var3, e0Var) : mt0.z0.b(mVarRequireActivity2, x0Var, false, e0Var3, e0Var, e0Var2);
                }
                View view3 = (View) pVarB.f128594a;
                View view4 = (View) pVarB.f128595b;
                if (view4 != null) {
                    view4.setOnClickListener(new g0(this, 14));
                }
                view2 = view3;
            } else {
                view2 = (View) mt0.z0.b(mVarRequireActivity2, x0Var, false, new e0(-1, 0.0d, null, 4, null), e0Var).f128594a;
            }
        }
        if (frameLayout2 == null || view2 == null) {
            return;
        }
        frameLayout2.addView(view2, 0);
        frameLayout2.setVisibility(0);
    }

    @Override // androidx.fragment.app.Fragment
    @o13.e
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        if (this.f87012q == null) {
            I6();
        } else {
            J6();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f87011p = arguments.getString("GCM_userDisplayName");
            this.f87010o = arguments.getString("GCM_challenge_uuid");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        View viewA6 = A6(viewGroup, layoutInflater, R.layout.gcm_group_challenge_leaderboard_layout_3_0);
        this.f87005j = (FrameLayout) viewA6.findViewById(R.id.leaderboard_header);
        this.f87007l = (TextView) viewA6.findViewById(R.id.challenge_name);
        this.f87008m = (TextView) viewA6.findViewById(R.id.challenge_duration);
        this.f87013r = (RecyclerView) viewA6.findViewById(R.id.leaderboard_list);
        this.f87014t = (TextView) viewA6.findViewById(R.id.leaderboard_winner_layout);
        this.f87015v = (TextView) viewA6.findViewById(R.id.leaderboard_error_label);
        return viewA6;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        m mVarRequireActivity = requireActivity();
        mVarRequireActivity.getClass();
        g22.e.k(this, new d(mVarRequireActivity), androidx.lifecycle.b0.b.RESUMED);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(mVarRequireActivity);
        this.f87006k = linearLayoutManager;
        RecyclerView recyclerView = this.f87013r;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(linearLayoutManager);
        }
        String str = this.f87011p;
        if (str == null) {
            str = "";
        }
        i10.a aVar = new i10.a(mVarRequireActivity, str, null, 4, null);
        this.f87004i = aVar;
        RecyclerView recyclerView2 = this.f87013r;
        int i14 = 0;
        if (recyclerView2 != null) {
            i10.a.b bVar = new i10.a.b();
            i10.a.b bVar2 = new i10.a.b();
            aVar.r(new y2(bVar, bVar2));
            recyclerView2.setAdapter(new androidx.recyclerview.widget.g((RecyclerView.h<? extends RecyclerView.f0>[]) new RecyclerView.h[]{bVar, aVar, bVar2}));
        }
        F6(false);
        RecyclerView recyclerView3 = this.f87013r;
        if (recyclerView3 != null) {
            recyclerView3.addOnScrollListener(new e());
        }
        w1 w1Var = this.f87003h;
        y0<Boolean> y0Var = ((i10.h) w1Var.getValue()).f87059c;
        n0 viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        dh.b.L(y0Var, viewLifecycleOwner, new g(new i10.b(this, i14)));
        y0<Integer> y0Var2 = ((i10.h) w1Var.getValue()).f87061e;
        n0 viewLifecycleOwner2 = getViewLifecycleOwner();
        viewLifecycleOwner2.getClass();
        dh.b.L(y0Var2, viewLifecycleOwner2, new g(new f(this)));
        this.f87019z = requireActivity().getResources().getDimensionPixelSize(R.dimen.leaderboard_row_height) * 4;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Li10/c$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}

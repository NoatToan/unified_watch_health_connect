package uu;

import android.content.Context;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import c22.l1;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.badges.service.model.SimpleBadgeDTO;
import com.garmin.android.apps.connectmobile.i2;
import com.google.android.flexbox.FlexboxLayout;
import java.util.ArrayList;
import java.util.List;
import o53.m1;
import o53.s0;
import org.joda.time.DateTime;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.m0;
import p005kotlin.jvm.internal.p0;
import p005kotlin.jvm.internal.r0;
import r53.p2;
import zd0.j1;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.badges.redesign.BadgeDetailsFragment$updateBadgeDetails$1", f = "BadgeDetailsFragment.kt", l = {391, 441}, m = "invokeSuspend", v = 2)
public final class g extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f172688a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f172689b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f172690c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f172691d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f172692e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f172693f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f172694g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f172695h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public com.garmin.android.apps.connectmobile.badges.redesign.b f172696i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public List f172697j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f172698k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.badges.service.model.m f172699l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.badges.redesign.b f172700m;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Lc80/p;", "<anonymous>", "(Lo53/b0;)Lc80/p;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.badges.redesign.BadgeDetailsFragment$updateBadgeDetails$1$premiumSocialFeatureStatus$1", f = "BadgeDetailsFragment.kt", l = {391}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super c80.p>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f172701a;

        public a(t13.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super c80.p> dVar) {
            return new a(dVar).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f172701a;
            if (i14 != 0) {
                if (i14 == 1) {
                    o13.r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            j1 j1Var = (j1) KoinJavaComponent.get$default(j1.class, null, null, 6, null);
            c80.q qVar = c80.q.SOCIAL;
            this.f172701a = 1;
            Object objJ = j1Var.j(qVar, this);
            return objJ == aVar ? aVar : objJ;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(com.garmin.android.apps.connectmobile.badges.service.model.m mVar, com.garmin.android.apps.connectmobile.badges.redesign.b bVar, t13.d<? super g> dVar) {
        super(2, dVar);
        this.f172699l = mVar;
        this.f172700m = bVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new g(this.f172699l, this.f172700m, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((g) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:132:0x037c  */
    /* JADX WARN: Code duplicated, block: B:170:0x046b  */
    /* JADX WARN: Code duplicated, block: B:172:0x0478  */
    /* JADX WARN: Code duplicated, block: B:175:0x0486  */
    /* JADX WARN: Code duplicated, block: B:176:0x0491  */
    /* JADX WARN: Code duplicated, block: B:178:0x049e  */
    /* JADX WARN: Code duplicated, block: B:179:0x04a3  */
    /* JADX WARN: Code duplicated, block: B:182:0x04a8  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v2, types: [int] */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4, types: [int] */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3, types: [int] */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v6, types: [int] */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v2, types: [int] */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r15v4, types: [int] */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r15v7 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v21, types: [int] */
    /* JADX WARN: Type inference failed for: r2v42 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v15, types: [int] */
    /* JADX WARN: Type inference failed for: r3v23 */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i14;
        int i15;
        boolean isBadgeEarned;
        Object objE0;
        ?? r14;
        int i16;
        TextView textView;
        ?? r15;
        ?? r16;
        ?? r17;
        u13.a aVar;
        bv.d dVar;
        boolean z14;
        DateTime dateTimeI0;
        com.garmin.android.apps.connectmobile.badges.service.model.m mVar;
        List<com.garmin.android.apps.connectmobile.badges.service.model.p> listF0;
        List<com.garmin.android.apps.connectmobile.badges.service.model.p> listF1;
        com.garmin.android.apps.connectmobile.badges.redesign.b bVar;
        com.garmin.android.apps.connectmobile.badges.service.model.m mVar2;
        List<SimpleBadgeDTO> listK0;
        String string;
        String string2;
        com.garmin.android.apps.connectmobile.badges.service.model.m mVar3;
        com.garmin.android.apps.connectmobile.badges.service.model.m mVar4;
        DateTime dateTimeJ0;
        com.garmin.android.apps.connectmobile.badges.service.model.m mVar5;
        com.garmin.android.apps.connectmobile.badges.service.model.m mVar6;
        com.garmin.android.apps.connectmobile.badges.service.model.m mVar7;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i17 = this.f172698k;
        com.garmin.android.apps.connectmobile.badges.service.model.m mVar8 = this.f172699l;
        int i18 = 1;
        com.garmin.android.apps.connectmobile.badges.redesign.b bVar2 = this.f172700m;
        if (i17 != 0) {
            if (i17 == 1) {
                i16 = this.f172694g;
                isBadgeEarned = this.f172695h;
                i15 = this.f172693f;
                i14 = this.f172692e;
                int i19 = this.f172691d;
                int i24 = this.f172690c;
                int i25 = this.f172689b;
                int i26 = this.f172688a;
                o13.r.b(obj);
                r14 = i26;
                objE0 = obj;
                r17 = i19;
                r16 = i24;
                r15 = i25;
            } else {
                if (i17 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                listF1 = this.f172697j;
                com.garmin.android.apps.connectmobile.badges.redesign.b bVar3 = this.f172696i;
                o13.r.b(obj);
                bVar = bVar3;
                dateTimeI0 = null;
            }
            LinearLayout linearLayout = bVar.f30418r;
            linearLayout.getClass();
            linearLayout.setVisibility(0);
            TextView textView2 = bVar.f30420v;
            textView2.getClass();
            textView2.setVisibility(8);
            ComposeView composeView = bVar.f30419t;
            composeView.getClass();
            composeView.post(new r0.h(16, listF1, bVar));
            mVar3 = bVar2.f30401a;
            mVar3.getClass();
            if (mVar3.b(com.garmin.android.apps.connectmobile.badges.service.model.j.REPEATABLE)) {
                TextView textView3 = bVar2.f30423y;
                textView3.getClass();
                Context contextRequireContext = bVar2.requireContext();
                mVar4 = bVar2.f30401a;
                if (mVar4 != null) {
                    dateTimeJ0 = mVar4.j0();
                } else {
                    dateTimeJ0 = dateTimeI0;
                }
                mVar5 = bVar2.f30401a;
                if (mVar5 != null) {
                    dateTimeI0 = mVar5.i0();
                }
                textView3.setText(k.b(contextRequireContext, dateTimeJ0, dateTimeI0));
                TextView textView4 = bVar2.f30423y;
                textView4.getClass();
                textView4.setVisibility(0);
            } else {
                mVar6 = bVar2.f30401a;
                mVar6.getClass();
                if (mVar6.b(com.garmin.android.apps.connectmobile.badges.service.model.j.LIMITED_SINGLE)) {
                    TextView textView5 = bVar2.f30423y;
                    textView5.getClass();
                    Context contextRequireContext2 = bVar2.requireContext();
                    mVar4 = bVar2.f30401a;
                    if (mVar4 != null) {
                        dateTimeJ0 = mVar4.j0();
                    } else {
                        dateTimeJ0 = dateTimeI0;
                    }
                    mVar5 = bVar2.f30401a;
                    if (mVar5 != null) {
                        dateTimeI0 = mVar5.i0();
                    }
                    textView5.setText(k.b(contextRequireContext2, dateTimeJ0, dateTimeI0));
                    TextView textView6 = bVar2.f30423y;
                    textView6.getClass();
                    textView6.setVisibility(0);
                } else {
                    mVar7 = bVar2.f30401a;
                    mVar7.getClass();
                    if (mVar7.b(com.garmin.android.apps.connectmobile.badges.service.model.j.LIMITED_ANNUAL)) {
                        TextView textView7 = bVar2.f30423y;
                        textView7.getClass();
                        Context contextRequireContext3 = bVar2.requireContext();
                        mVar4 = bVar2.f30401a;
                        if (mVar4 != null) {
                            dateTimeJ0 = mVar4.j0();
                        } else {
                            dateTimeJ0 = dateTimeI0;
                        }
                        mVar5 = bVar2.f30401a;
                        if (mVar5 != null) {
                            dateTimeI0 = mVar5.i0();
                        }
                        textView7.setText(k.b(contextRequireContext3, dateTimeJ0, dateTimeI0));
                        TextView textView8 = bVar2.f30423y;
                        textView8.getClass();
                        textView8.setVisibility(0);
                    } else {
                        TextView textView9 = bVar2.f30423y;
                        textView9.getClass();
                        textView9.setVisibility(8);
                    }
                }
            }
            return Unit.INSTANCE;
        }
        o13.r.b(obj);
        i2.a aVar3 = i2.f36769a;
        aVar3.getClass();
        i2.a.b(a2.BADGES, "BadgeDetailsFragment", "updateBadgeDetails: " + mVar8);
        bVar2.f30401a = mVar8;
        if (!bVar2.isAdded()) {
            return Unit.INSTANCE;
        }
        com.garmin.android.apps.connectmobile.badges.service.model.m mVar9 = bVar2.f30401a;
        View view2 = bVar2.f30403c;
        if (mVar9 != null) {
            view2.getClass();
            view2.setVisibility(0);
            m1 m1Var = bVar2.B;
            if (m1Var == null || !m1Var.isActive()) {
                zp0.c.a aVar4 = zp0.c.f206560v;
                androidx.fragment.app.m mVarRequireActivity = bVar2.requireActivity();
                mVarRequireActivity.getClass();
                aVar4.getClass();
                zp0.c cVar = new zp0.c(mVarRequireActivity);
                com.garmin.android.apps.connectmobile.badges.service.model.m mVar10 = bVar2.f30401a;
                mVar10.getClass();
                cVar.f206565e = mVar10.u();
                cVar.f206570j = 2131231128;
                cVar.f206578r = "cache_availability_today";
                bVar2.B = cVar.d(new s00.k(bVar2, i18));
            }
            MenuItem menuItem = bVar2.f30415o;
            if (menuItem != null) {
                com.garmin.android.apps.connectmobile.badges.service.model.m mVar11 = bVar2.f30401a;
                mVar11.getClass();
                menuItem.setVisible(mVar11.getIsBadgeEarned());
                if (bVar2.A != null) {
                    MenuItem menuItem2 = bVar2.f30415o;
                    menuItem2.getClass();
                    menuItem2.setEnabled(true);
                }
            }
            ImageView imageView = bVar2.f30404d;
            imageView.getClass();
            com.garmin.android.apps.connectmobile.badges.service.model.m mVar12 = bVar2.f30401a;
            mVar12.getClass();
            imageView.setColorFilter(p.c(!mVar12.getIsBadgeEarned()));
            TextView textView10 = bVar2.f30405e;
            if (textView10 != null) {
                com.garmin.android.apps.connectmobile.badges.service.model.m mVar13 = bVar2.f30401a;
                textView10.setText(mVar13 != null ? mVar13.A() : null);
            }
            com.garmin.android.apps.connectmobile.badges.service.model.m mVar14 = bVar2.f30401a;
            int i27 = mVar14 != null ? mVar14.o().f30564b : 1;
            r0 r0Var = new r0();
            r0Var.f105810a = "";
            r0 r0Var2 = new r0();
            r0Var2.f105810a = "";
            m0 m0Var = new m0();
            p0 p0Var = new p0();
            p0Var.f105807a = 1;
            androidx.lifecycle.i0 i0VarW = o53.f0.w(bVar2);
            x53.c cVar2 = s0.f129406a;
            x53.b bVar4 = x53.b.f189152a;
            ge1.b.T(i0VarW, bVar4, null, new f(m0Var, bVar2, p0Var, r0Var2, i27, r0Var, null), 2);
            TextView textView11 = bVar2.f30410j;
            textView11.getClass();
            textView11.setVisibility(8);
            TextView textView12 = bVar2.f30408h;
            textView12.getClass();
            textView12.setVisibility(8);
            TextView textView13 = bVar2.f30409i;
            textView13.getClass();
            textView13.setVisibility(8);
            TextView textView14 = bVar2.f30411k;
            if (textView14 != null) {
                textView14.setVisibility(8);
            }
            com.garmin.android.apps.connectmobile.badges.service.model.m mVar15 = bVar2.f30401a;
            ?? B = mVar15 != null ? mVar15.b(com.garmin.android.apps.connectmobile.badges.service.model.j.LIMITED_SINGLE) : 0;
            com.garmin.android.apps.connectmobile.badges.service.model.m mVar16 = bVar2.f30401a;
            ?? B2 = mVar16 != null ? mVar16.b(com.garmin.android.apps.connectmobile.badges.service.model.j.LIMITED_ANNUAL) : 0;
            com.garmin.android.apps.connectmobile.badges.service.model.m mVar17 = bVar2.f30401a;
            ?? B3 = mVar17 != null ? mVar17.b(com.garmin.android.apps.connectmobile.badges.service.model.j.REPEATABLE) : 0;
            com.garmin.android.apps.connectmobile.badges.service.model.m mVar18 = bVar2.f30401a;
            ?? B4 = mVar18 != null ? mVar18.b(com.garmin.android.apps.connectmobile.badges.service.model.j.SERIES_EVENTS) : 0;
            com.garmin.android.apps.connectmobile.badges.service.model.m mVar19 = bVar2.f30401a;
            i14 = (mVar19 == null || !mVar19.getIsPremium()) ? 0 : 1;
            i15 = ((B3 != 0 || B2 == 0) && B == 0 && B4 == 0) ? 0 : 1;
            if (i15 != 0 && (textView = bVar2.f30410j) != null) {
                textView.setVisibility(0);
            }
            com.garmin.android.apps.connectmobile.badges.service.model.m mVar20 = bVar2.f30401a;
            mVar20.getClass();
            if (mVar20.b(com.garmin.android.apps.connectmobile.badges.service.model.j.REPEATABLE)) {
                TextView textView15 = bVar2.f30408h;
                textView15.getClass();
                textView15.setVisibility(0);
            }
            com.garmin.android.apps.connectmobile.badges.service.model.m mVar21 = bVar2.f30401a;
            mVar21.getClass();
            if (mVar21.getAssocTypeId() == com.garmin.android.apps.connectmobile.badges.service.model.a.BADGE_CHALLENGE.f30551a) {
                TextView textView16 = bVar2.f30409i;
                textView16.getClass();
                textView16.setVisibility(0);
            }
            TextView textView17 = bVar2.f30411k;
            if (textView17 != null) {
                textView17.setVisibility(i14 != 0 ? 0 : 8);
            }
            FlexboxLayout flexboxLayout = bVar2.E;
            if (flexboxLayout != null) {
                flexboxLayout.post(new r0.h(15, flexboxLayout, bVar2));
            }
            isBadgeEarned = mVar8.getIsBadgeEarned();
            DateTime dateTimeI1 = mVar8.i0();
            int i28 = (dateTimeI1 == null || !dateTimeI1.isBeforeNow()) ? 0 : 1;
            a aVar5 = new a(null);
            this.f172688a = B;
            this.f172689b = B2;
            this.f172690c = B3;
            this.f172691d = B4;
            this.f172692e = i14;
            this.f172693f = i15;
            this.f172695h = isBadgeEarned;
            this.f172694g = i28;
            this.f172698k = 1;
            objE0 = ge1.b.e0(bVar4, aVar5, this);
            if (objE0 == aVar2) {
                return aVar2;
            }
            int i29 = i28;
            r14 = B;
            i16 = i29;
            r17 = B4;
            r16 = B3;
            r15 = B2;
        } else {
            view2.getClass();
            view2.setVisibility(8);
        }
        return Unit.INSTANCE;
        boolean z15 = ((c80.p) objE0) instanceof c80.p.c;
        TextView textView18 = bVar2.f30414n;
        bv.d dVar2 = bVar2.F;
        if (textView18 != null) {
            v22.e.r(textView18, isBadgeEarned || (i16 == 0 && (i14 == 0 || !z15)));
        }
        TextView textView19 = bVar2.f30414n;
        if (textView19 != null) {
            Context context = bVar2.getContext();
            int assocTypeId = mVar8.getAssocTypeId();
            String assocDataName = mVar8.getAssocDataName();
            String badgeEarnedDate = mVar8.getBadgeEarnedDate();
            int badgeEarnedNumber = mVar8.getBadgeEarnedNumber();
            int badgeLimitCount = mVar8.getBadgeLimitCount();
            boolean isUserJoined = mVar8.getIsUserJoined();
            com.garmin.android.apps.connectmobile.leaderboard.model.r rVarK = mVar8.k();
            if (TextUtils.isEmpty(badgeEarnedDate)) {
                z14 = true;
                dVar = dVar2;
                com.garmin.android.apps.connectmobile.badges.service.model.a aVarA = com.garmin.android.apps.connectmobile.badges.service.model.a.a(assocTypeId);
                aVar = aVar2;
                if (aVarA == com.garmin.android.apps.connectmobile.badges.service.model.a.BADGE_CHALLENGE) {
                    if (isUserJoined) {
                        string2 = rVarK == com.garmin.android.apps.connectmobile.leaderboard.model.r.END ? context.getString(R.string.social_msg_you_have_not_earned_this_badge) : context.getString(R.string.badges_details_challenge_joined_msg);
                    } else {
                        string2 = context.getString(R.string.badges_details_challenge_join_msg);
                    }
                    string = k.a(context, string2);
                } else {
                    string = context.getString(R.string.social_msg_you_have_not_earned_this_badge);
                }
            } else {
                string = k.c(context, assocTypeId, null, assocDataName, badgeEarnedDate, badgeEarnedNumber, badgeLimitCount, null);
                aVar = aVar2;
                dVar = dVar2;
                z14 = true;
            }
            string.getClass();
            textView19.setText(l1.a(string));
        } else {
            aVar = aVar2;
            dVar = dVar2;
            z14 = true;
        }
        com.garmin.android.apps.connectmobile.badges.service.model.m mVar22 = bVar2.f30401a;
        mVar22.getClass();
        if (mVar22.b(com.garmin.android.apps.connectmobile.badges.service.model.j.CUMULATIVE)) {
            com.garmin.android.apps.connectmobile.badges.service.model.m mVar23 = bVar2.f30401a;
            mVar23.getClass();
            if (!mVar23.getIsUserJoined()) {
                com.garmin.android.apps.connectmobile.badges.service.model.m mVar24 = bVar2.f30401a;
                mVar24.getClass();
                if (!mVar24.b(com.garmin.android.apps.connectmobile.badges.service.model.j.REPEATABLE)) {
                    ProgressBar progressBar = bVar2.f30412l;
                    progressBar.getClass();
                    progressBar.setVisibility(8);
                    TextView textView20 = bVar2.f30413m;
                    textView20.getClass();
                    textView20.setVisibility(8);
                }
            }
            ProgressBar progressBar2 = bVar2.f30412l;
            progressBar2.getClass();
            progressBar2.setVisibility(0);
            TextView textView21 = bVar2.f30413m;
            textView21.getClass();
            textView21.setVisibility(0);
            com.garmin.android.apps.connectmobile.badges.service.model.m mVar25 = bVar2.f30401a;
            mVar25.getClass();
            double badgeProgressValue = mVar25.getBadgeProgressValue();
            com.garmin.android.apps.connectmobile.badges.service.model.m mVar26 = bVar2.f30401a;
            mVar26.getClass();
            int badgeTargetValue = (int) ((badgeProgressValue / mVar26.getBadgeTargetValue()) * ((double) 100));
            ProgressBar progressBar3 = bVar2.f30412l;
            progressBar3.getClass();
            progressBar3.setProgress(badgeTargetValue);
            TextView textView22 = bVar2.f30413m;
            textView22.getClass();
            Context contextRequireContext4 = bVar2.requireContext();
            contextRequireContext4.getClass();
            com.garmin.android.apps.connectmobile.badges.service.model.m mVar27 = bVar2.f30401a;
            mVar27.getClass();
            double badgeProgressValue2 = mVar27.getBadgeProgressValue();
            com.garmin.android.apps.connectmobile.badges.service.model.m mVar28 = bVar2.f30401a;
            mVar28.getClass();
            double badgeTargetValue2 = mVar28.getBadgeTargetValue();
            com.garmin.android.apps.connectmobile.badges.service.model.m mVar29 = bVar2.f30401a;
            mVar29.getClass();
            textView22.setText(p.a(contextRequireContext4, badgeProgressValue2, badgeTargetValue2, mVar29.getBadgeProgressUnitId(), false, dVar.g(), false));
            TextView textView23 = bVar2.f30413m;
            textView23.getClass();
            Context contextRequireContext5 = bVar2.requireContext();
            contextRequireContext5.getClass();
            com.garmin.android.apps.connectmobile.badges.service.model.m mVar30 = bVar2.f30401a;
            mVar30.getClass();
            double badgeProgressValue3 = mVar30.getBadgeProgressValue();
            com.garmin.android.apps.connectmobile.badges.service.model.m mVar31 = bVar2.f30401a;
            mVar31.getClass();
            double badgeTargetValue3 = mVar31.getBadgeTargetValue();
            com.garmin.android.apps.connectmobile.badges.service.model.m mVar32 = bVar2.f30401a;
            mVar32.getClass();
            textView23.setContentDescription(p.a(contextRequireContext5, badgeProgressValue3, badgeTargetValue3, mVar32.getBadgeProgressUnitId(), true, dVar.g(), false));
        } else {
            ProgressBar progressBar4 = bVar2.f30412l;
            progressBar4.getClass();
            progressBar4.setVisibility(8);
            TextView textView24 = bVar2.f30413m;
            textView24.getClass();
            textView24.setVisibility(8);
        }
        com.garmin.android.apps.connectmobile.badges.service.model.m mVar33 = bVar2.f30401a;
        if ((mVar33 != null ? mVar33.k0() : null) == null || (mVar2 = bVar2.f30401a) == null || (listK0 = mVar2.k0()) == null || (!listK0.isEmpty()) != z14) {
            LinearLayout linearLayout2 = bVar2.f30416p;
            linearLayout2.getClass();
            linearLayout2.setVisibility(8);
        } else {
            LinearLayout linearLayout3 = bVar2.f30416p;
            linearLayout3.getClass();
            linearLayout3.setVisibility(0);
            com.garmin.android.apps.connectmobile.badges.redesign.l lVar = bVar2.f30402b;
            lVar.getClass();
            lVar.f30524a = bVar2.f30401a;
            com.garmin.android.apps.connectmobile.badges.redesign.l lVar2 = bVar2.f30402b;
            lVar2.getClass();
            lVar2.notifyDataSetChanged();
        }
        com.garmin.android.apps.connectmobile.badges.service.model.m mVar34 = bVar2.f30401a;
        if ((mVar34 != null ? mVar34.f0() : null) == null || (mVar = bVar2.f30401a) == null || (listF0 = mVar.f0()) == null || !(!listF0.isEmpty())) {
            dateTimeI0 = null;
            LinearLayout linearLayout4 = bVar2.f30418r;
            linearLayout4.getClass();
            linearLayout4.setVisibility(8);
            TextView textView25 = bVar2.f30420v;
            textView25.getClass();
            textView25.setVisibility(0);
        } else {
            com.garmin.android.apps.connectmobile.badges.service.model.m mVar35 = bVar2.f30401a;
            if (mVar35 == null || (listF1 = mVar35.f0()) == null) {
                dateTimeI0 = null;
            } else {
                p2 p2Var = bVar2.P;
                ArrayList arrayList = new ArrayList(listF1);
                this.f172696i = bVar2;
                this.f172697j = listF1;
                this.f172688a = r14;
                this.f172689b = r15;
                this.f172690c = r16;
                this.f172691d = r17;
                this.f172692e = i14;
                this.f172693f = i15;
                this.f172695h = isBadgeEarned;
                this.f172694g = i16;
                this.f172698k = 2;
                dateTimeI0 = null;
                p2Var.k(null, arrayList);
                u13.a aVar6 = aVar;
                if (Unit.INSTANCE == aVar6) {
                    return aVar6;
                }
                bVar = bVar2;
                LinearLayout linearLayout5 = bVar.f30418r;
                linearLayout5.getClass();
                linearLayout5.setVisibility(0);
                TextView textView26 = bVar.f30420v;
                textView26.getClass();
                textView26.setVisibility(8);
                ComposeView composeView2 = bVar.f30419t;
                composeView2.getClass();
                composeView2.post(new r0.h(16, listF1, bVar));
            }
        }
        mVar3 = bVar2.f30401a;
        mVar3.getClass();
        if (mVar3.b(com.garmin.android.apps.connectmobile.badges.service.model.j.REPEATABLE)) {
            mVar6 = bVar2.f30401a;
            mVar6.getClass();
            if (mVar6.b(com.garmin.android.apps.connectmobile.badges.service.model.j.LIMITED_SINGLE)) {
                mVar7 = bVar2.f30401a;
                mVar7.getClass();
                if (mVar7.b(com.garmin.android.apps.connectmobile.badges.service.model.j.LIMITED_ANNUAL)) {
                    TextView textView27 = bVar2.f30423y;
                    textView27.getClass();
                    Context contextRequireContext6 = bVar2.requireContext();
                    mVar4 = bVar2.f30401a;
                    if (mVar4 != null) {
                        dateTimeJ0 = mVar4.j0();
                    } else {
                        dateTimeJ0 = dateTimeI0;
                    }
                    mVar5 = bVar2.f30401a;
                    if (mVar5 != null) {
                        dateTimeI0 = mVar5.i0();
                    }
                    textView27.setText(k.b(contextRequireContext6, dateTimeJ0, dateTimeI0));
                    TextView textView28 = bVar2.f30423y;
                    textView28.getClass();
                    textView28.setVisibility(0);
                } else {
                    TextView textView29 = bVar2.f30423y;
                    textView29.getClass();
                    textView29.setVisibility(8);
                }
            } else {
                TextView textView210 = bVar2.f30423y;
                textView210.getClass();
                Context contextRequireContext7 = bVar2.requireContext();
                mVar4 = bVar2.f30401a;
                if (mVar4 != null) {
                    dateTimeJ0 = mVar4.j0();
                } else {
                    dateTimeJ0 = dateTimeI0;
                }
                mVar5 = bVar2.f30401a;
                if (mVar5 != null) {
                    dateTimeI0 = mVar5.i0();
                }
                textView210.setText(k.b(contextRequireContext7, dateTimeJ0, dateTimeI0));
                TextView textView211 = bVar2.f30423y;
                textView211.getClass();
                textView211.setVisibility(0);
            }
        } else {
            TextView textView212 = bVar2.f30423y;
            textView212.getClass();
            Context contextRequireContext8 = bVar2.requireContext();
            mVar4 = bVar2.f30401a;
            if (mVar4 != null) {
                dateTimeJ0 = mVar4.j0();
            } else {
                dateTimeJ0 = dateTimeI0;
            }
            mVar5 = bVar2.f30401a;
            if (mVar5 != null) {
                dateTimeI0 = mVar5.i0();
            }
            textView212.setText(k.b(contextRequireContext8, dateTimeJ0, dateTimeI0));
            TextView textView213 = bVar2.f30423y;
            textView213.getClass();
            textView213.setVisibility(0);
        }
        return Unit.INSTANCE;
    }
}

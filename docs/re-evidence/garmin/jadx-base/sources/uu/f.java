package uu;

import android.content.Context;
import android.widget.TextView;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import o53.s0;
import o53.t1;
import org.apache.commons.lang3.StringUtils;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.m0;
import p005kotlin.jvm.internal.p0;
import p005kotlin.jvm.internal.r0;
import zd0.j1;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.badges.redesign.BadgeDetailsFragment$displayBadgeDescription$1", f = "BadgeDetailsFragment.kt", l = {483, 484}, m = "invokeSuspend", v = 2)
public final class f extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f172671a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m0 f172672b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.badges.redesign.b f172673c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p0 f172674d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r0<CharSequence> f172675e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f172676f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r0<String> f172677g;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.badges.redesign.BadgeDetailsFragment$displayBadgeDescription$1$1", f = "BadgeDetailsFragment.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f172678a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ boolean f172679b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ m0 f172680c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ com.garmin.android.apps.connectmobile.badges.redesign.b f172681d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ p0 f172682e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ r0<CharSequence> f172683f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ int f172684g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ r0<String> f172685h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(boolean z14, m0 m0Var, com.garmin.android.apps.connectmobile.badges.redesign.b bVar, p0 p0Var, r0<CharSequence> r0Var, int i14, r0<String> r0Var2, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f172679b = z14;
            this.f172680c = m0Var;
            this.f172681d = bVar;
            this.f172682e = p0Var;
            this.f172683f = r0Var;
            this.f172684g = i14;
            this.f172685h = r0Var2;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            a aVar = new a(this.f172679b, this.f172680c, this.f172681d, this.f172682e, this.f172683f, this.f172684g, this.f172685h, dVar);
            aVar.f172678a = obj;
            return aVar;
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:19:0x0060  */
        /* JADX WARN: Type inference failed for: r0v11, types: [T, java.lang.Object, java.lang.String] */
        /* JADX WARN: Type inference failed for: r0v14, types: [T, java.lang.Object, java.lang.String] */
        /* JADX WARN: Type inference failed for: r0v20, types: [T, java.lang.Object, java.lang.String] */
        /* JADX WARN: Type inference failed for: r0v22, types: [T, java.lang.Object, java.lang.String] */
        /* JADX WARN: Type inference failed for: r11v12, types: [T, android.text.SpannableStringBuilder] */
        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            boolean z14;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            boolean z15 = this.f172679b;
            String strH = com.airbnb.lottie.animation.keyframe.a.h("displayBadgeDescription hasGCPlusSocialFeature = ", z15);
            i2.a aVar2 = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar2.getClass();
            i2.a.b(a2Var, "BadgeDetailsFragment", strH);
            p0 p0Var = this.f172682e;
            com.garmin.android.apps.connectmobile.badges.redesign.b bVar = this.f172681d;
            if (z15) {
                com.garmin.android.apps.connectmobile.badges.service.model.m mVar = bVar.f30401a;
                i2.a.b(a2Var, "BadgeDetailsFragment", "displayBadgeDescription isUserJoined = " + (mVar != null && mVar.getIsUserJoined()) + StringUtils.SPACE);
                com.garmin.android.apps.connectmobile.badges.service.model.m mVar2 = bVar.f30401a;
                p0Var.f105807a = mVar2 != null ? mVar2.g0() : 1;
                com.garmin.android.apps.connectmobile.badges.service.model.m mVar3 = bVar.f30401a;
                if (mVar3 == null || !mVar3.o0()) {
                    z14 = false;
                } else {
                    z14 = true;
                }
            } else {
                z14 = false;
            }
            m0 m0Var = this.f172680c;
            m0Var.f105804a = z14;
            i2.a.b(a2Var, "BadgeDetailsFragment", "displayBadgeDescription isDisplayMultiplierPoint = " + z14 + " , multiplier = " + p0Var.f105807a);
            boolean z16 = m0Var.f105804a;
            int i14 = this.f172684g;
            r0<CharSequence> r0Var = this.f172683f;
            if (z16) {
                i iVar = i.f172715a;
                Context contextRequireContext = bVar.requireContext();
                contextRequireContext.getClass();
                int i15 = p0Var.f105807a;
                iVar.getClass();
                ?? A = i.a(i15, i14, contextRequireContext);
                r0Var.f105810a = A;
                TextView textView = bVar.f30407g;
                if (textView != null) {
                    textView.setText((CharSequence) A);
                }
                TextView textView2 = bVar.f30407g;
                if (textView2 != null) {
                    textView2.setVisibility(0);
                }
                TextView textView3 = bVar.f30406f;
                if (textView3 != null) {
                    com.garmin.android.apps.connectmobile.badges.service.model.m mVar4 = bVar.f30401a;
                    textView3.setText(mVar4 != null ? mVar4.m() : null);
                }
            } else {
                TextView textView4 = bVar.f30407g;
                if (textView4 != null) {
                    textView4.setVisibility(8);
                }
                r0<String> r0Var2 = this.f172685h;
                if (i14 == 1) {
                    ?? string = bVar.getString(R.string.lbl_user_level_points_abbr_singular);
                    string.getClass();
                    r0Var2.f105810a = string;
                    ?? string2 = bVar.getString(R.string.social_one_point);
                    string2.getClass();
                    r0Var.f105810a = string2;
                } else {
                    ?? string3 = bVar.getString(R.string.social_points, String.valueOf(i14));
                    string3.getClass();
                    r0Var2.f105810a = string3;
                    ?? string4 = bVar.getString(R.string.lbl_number_points, String.valueOf(i14));
                    string4.getClass();
                    r0Var.f105810a = string4;
                }
                TextView textView5 = bVar.f30406f;
                if (textView5 != null) {
                    String str = r0Var2.f105810a;
                    com.garmin.android.apps.connectmobile.badges.service.model.m mVar5 = bVar.f30401a;
                    textView5.setText(bVar.getString(R.string.string_space_bullet_string_pattern, str, mVar5 != null ? mVar5.m() : null));
                }
                TextView textView6 = bVar.f30406f;
                if (textView6 != null) {
                    CharSequence charSequence = r0Var.f105810a;
                    com.garmin.android.apps.connectmobile.badges.service.model.m mVar6 = bVar.f30401a;
                    textView6.setContentDescription(bVar.getString(R.string.string_comma_string_pattern, charSequence, mVar6 != null ? mVar6.m() : null));
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(m0 m0Var, com.garmin.android.apps.connectmobile.badges.redesign.b bVar, p0 p0Var, r0<CharSequence> r0Var, int i14, r0<String> r0Var2, t13.d<? super f> dVar) {
        super(2, dVar);
        this.f172672b = m0Var;
        this.f172673c = bVar;
        this.f172674d = p0Var;
        this.f172675e = r0Var;
        this.f172676f = i14;
        this.f172677g = r0Var2;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new f(this.f172672b, this.f172673c, this.f172674d, this.f172675e, this.f172676f, this.f172677g, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((f) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0054, code lost:
    
        if (ge1.b.e0(r13, r3, r12) == r0) goto L15;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f172671a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
            } else {
                if (i14 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
        }
        o13.r.b(obj);
        j1 j1Var = (j1) KoinJavaComponent.get$default(j1.class, null, null, 6, null);
        c80.q qVar = c80.q.SOCIAL;
        this.f172671a = 1;
        obj = j1Var.l(qVar, this);
        if (obj != aVar) {
        }
        return aVar;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        x53.c cVar = s0.f129406a;
        t1 t1Var = u53.o.f168762a;
        a aVar2 = new a(zBooleanValue, this.f172672b, this.f172673c, this.f172674d, this.f172675e, this.f172676f, this.f172677g, null);
        this.f172671a = 2;
    }
}

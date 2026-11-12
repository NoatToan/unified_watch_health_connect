package com.garmin.android.apps.connectmobile.userprofile.presentation.privacy;

import android.content.Intent;
import android.os.Bundle;
import c.w;
import c2.b0;
import c2.j;
import c2.x2;
import c2.y;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.userprofile.model.o;
import com.garmin.android.apps.connectmobile.userprofile.presentation.privacy.TaggingPrivacyActivity;
import e23.l;
import e23.p;
import h4.k;
import h4.r;
import h5.e0;
import h5.g;
import i3.ff;
import i3.hf;
import i3.mh;
import j92.e;
import j92.f;
import java.util.Locale;
import l72.p2;
import ot1.i;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.x1;
import s5.x0;
import v.h;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007²\u0006\u000e\u0010\u0006\u001a\u00020\u00058\n@\nX\u008a\u008e\u0002"}, d2 = {"Lcom/garmin/android/apps/connectmobile/userprofile/presentation/privacy/TaggingPrivacyActivity;", "Lcom/garmin/android/apps/connectmobile/d;", "<init>", "()V", "a", "Lcom/garmin/android/apps/connectmobile/userprofile/model/o;", "permission", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class TaggingPrivacyActivity extends com.garmin.android.apps.connectmobile.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f47117a = new a(null);

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f47118a;

        static {
            int[] iArr = new int[o.values().length];
            try {
                iArr[o.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[o.FOLLOWINGS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[o.FOLLOWERS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[o.FOLLOWERS_AND_FOLLOWINGS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f47118a = iArr;
        }
    }

    public final void da(final o oVar, final l<? super Boolean, Unit> lVar, l<? super Boolean, Unit> lVar2, m mVar, int i14) {
        int i15;
        final l<? super Boolean, Unit> lVar3;
        o0 o0VarE = mVar.E(-656307123);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.k(oVar.ordinal()) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(lVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.r(lVar2) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= (i14 & 4096) == 0 ? o0VarE.B(this) : o0VarE.r(this) ? 2048 : 1024;
        }
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = n.f135158a;
            r.a aVar = r.S;
            r rVarD = x2.d(aVar, 1.0f);
            j.f22691a.getClass();
            j.k kVar = j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = k.c(rVarD, o0VarE);
            g.V.getClass();
            e0.a aVar2 = g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar2);
            } else {
                o0VarE.c();
            }
            b4.c(g.a.f81810g, zVarA, o0VarE);
            b4.c(g.a.f81809f, i2VarA0, o0VarE);
            g.a.b bVar = g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(g.a.f81807d, rVarC, o0VarE);
            b0 b0Var = b0.f22601a;
            d92.b.f58623a.getClass();
            f fVar = d92.b.f58624b;
            fVar.getClass();
            x0 x0VarF = d92.c.f(f.f97933j, o0VarE);
            String strQ = gl1.y.Q(o0VarE, R.string.privacy_setting_tagging_message);
            r rVarF = x2.f(aVar, 1.0f);
            j92.b bVar2 = d92.b.f58625c;
            bVar2.getClass();
            e eVar = j92.b.f97899b;
            mh.c(strQ, c2.l.y(rVarF, eVar.f97920e), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarF, o0VarE, 0, 0, 131068);
            fVar.getClass();
            x0 x0VarF2 = d92.c.f(f.f97934k, o0VarE);
            String upperCase = gl1.y.Q(o0VarE, R.string.privacy_setting_tagging_allow_tags_from).toUpperCase(Locale.ROOT);
            upperCase.getClass();
            r rVarF2 = x2.f(aVar, 1.0f);
            bVar2.getClass();
            float f14 = eVar.f97920e;
            bVar2.getClass();
            mh.c(upperCase, c2.l.z(rVarF2, f14, eVar.f97917b), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarF2, o0VarE, 0, 0, 131068);
            o0VarE = o0VarE;
            p2 p2Var = p2.f111205a;
            final int i16 = 1;
            p2Var.g(gl1.y.Q(o0VarE, R.string.privacy_setting_tagging_people_i_follow), null, null, null, z3.f.c(424155180, new p(this) { // from class: u12.q
                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    int i17 = i16;
                    com.garmin.android.apps.connectmobile.userprofile.model.o oVar2 = oVar;
                    switch (i17) {
                        case 0:
                            p3.m mVar2 = (p3.m) obj;
                            int iIntValue = ((Integer) obj2).intValue();
                            TaggingPrivacyActivity.a aVar3 = TaggingPrivacyActivity.f47117a;
                            if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                                x1 x1Var2 = p3.n.f135158a;
                                hf.a(oVar2 == com.garmin.android.apps.connectmobile.userprofile.model.o.FOLLOWERS_AND_FOLLOWINGS || oVar2 == com.garmin.android.apps.connectmobile.userprofile.model.o.FOLLOWERS, lVar, null, false, d92.c.a(ff.f88115a, mVar2), mVar2, 0, 92);
                            } else {
                                mVar2.e();
                            }
                            break;
                        default:
                            p3.m mVar3 = (p3.m) obj;
                            int iIntValue2 = ((Integer) obj2).intValue();
                            TaggingPrivacyActivity.a aVar4 = TaggingPrivacyActivity.f47117a;
                            if (mVar3.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                x1 x1Var3 = p3.n.f135158a;
                                hf.a(oVar2 == com.garmin.android.apps.connectmobile.userprofile.model.o.FOLLOWERS_AND_FOLLOWINGS || oVar2 == com.garmin.android.apps.connectmobile.userprofile.model.o.FOLLOWINGS, lVar, null, false, d92.c.a(ff.f88115a, mVar3), mVar3, 0, 92);
                            } else {
                                mVar3.e();
                            }
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }, o0VarE), false, false, null, o0VarE, 24576, 494);
            lVar3 = lVar2;
            final int i17 = 0;
            p2Var.g(gl1.y.Q(o0VarE, R.string.privacy_my_followers), null, null, null, z3.f.c(-449377323, new p(this) { // from class: u12.q
                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    int i18 = i17;
                    com.garmin.android.apps.connectmobile.userprofile.model.o oVar2 = oVar;
                    switch (i18) {
                        case 0:
                            p3.m mVar2 = (p3.m) obj;
                            int iIntValue = ((Integer) obj2).intValue();
                            TaggingPrivacyActivity.a aVar3 = TaggingPrivacyActivity.f47117a;
                            if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                                x1 x1Var2 = p3.n.f135158a;
                                hf.a(oVar2 == com.garmin.android.apps.connectmobile.userprofile.model.o.FOLLOWERS_AND_FOLLOWINGS || oVar2 == com.garmin.android.apps.connectmobile.userprofile.model.o.FOLLOWERS, lVar3, null, false, d92.c.a(ff.f88115a, mVar2), mVar2, 0, 92);
                            } else {
                                mVar2.e();
                            }
                            break;
                        default:
                            p3.m mVar3 = (p3.m) obj;
                            int iIntValue2 = ((Integer) obj2).intValue();
                            TaggingPrivacyActivity.a aVar4 = TaggingPrivacyActivity.f47117a;
                            if (mVar3.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                x1 x1Var3 = p3.n.f135158a;
                                hf.a(oVar2 == com.garmin.android.apps.connectmobile.userprofile.model.o.FOLLOWERS_AND_FOLLOWINGS || oVar2 == com.garmin.android.apps.connectmobile.userprofile.model.o.FOLLOWINGS, lVar3, null, false, d92.c.a(ff.f88115a, mVar3), mVar3, 0, 92);
                            } else {
                                mVar3.e();
                            }
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }, o0VarE), false, false, null, o0VarE, 24576, 494);
            o0VarE.g0(true);
        } else {
            lVar3 = lVar2;
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new i(this, oVar, lVar, lVar3, i14, 27);
        }
    }

    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v12 */
    public final void ea(o oVar, m mVar, int i14) {
        int i15;
        ?? r14;
        o0 o0VarE = mVar.E(-118816498);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.k(oVar.ordinal()) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= (i14 & 64) == 0 ? o0VarE.B(this) : o0VarE.r(this) ? 32 : 16;
        }
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            Object objQ = o0VarE.q();
            m.f135153a.getClass();
            m.a.C2565a c2565a = m.a.f135155b;
            if (objQ == c2565a) {
                objQ = p0.n(oVar);
                o0VarE.K(objQ);
            }
            p1 p1Var = (p1) objQ;
            z02.d.a(false, z3.f.c(585927187, new tb0.h(this, 9, oVar, p1Var), o0VarE), null, null, null, z3.f.c(1431210007, new t21.l(27, this, p1Var), o0VarE), o0VarE, 196662, 28);
            boolean z14 = ((i15 & 14) == 4) | ((i15 & 112) == 32 || ((i15 & 64) != 0 && o0VarE.r(this)));
            Object objQ2 = o0VarE.q();
            if (z14 || objQ2 == c2565a) {
                r14 = 0;
                objQ2 = new u12.r(this, oVar, p1Var, 0);
                o0VarE.K(objQ2);
            } else {
                r14 = 0;
            }
            w.a(r14, 1, (e23.a) objQ2, o0VarE, r14);
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new sg0.m(this, oVar, i14, 20);
        }
    }

    public final void fa(o oVar, o oVar2) {
        if (oVar != oVar2) {
            Intent intent = new Intent();
            intent.putExtras(h7.c.a(new o13.p("tagPermission", oVar2.f46938a)));
            setResult(-1, intent);
        }
        onNavigateUp();
    }

    /* JADX WARN: Code duplicated, block: B:6:0x001a  */
    @Override // com.garmin.android.apps.connectmobile.d, com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        o oVarA;
        super.onCreate(bundle);
        String stringExtra = getIntent().getStringExtra("tagPermission");
        if (stringExtra != null) {
            o.f46931b.getClass();
            oVarA = o.a.a(stringExtra);
            if (oVarA == null) {
                oVarA = o.NONE;
            }
        } else {
            oVarA = o.NONE;
        }
        initComposeScreen(new z3.e(-2070909372, true, new u12.p(this, oVarA, 0)));
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/userprofile/presentation/privacy/TaggingPrivacyActivity$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "PARAM_TAG_PERMISSION", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}

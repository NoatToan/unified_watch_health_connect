package com.garmin.android.apps.connectmobile.userprofile;

import androidx.lifecycle.t0;
import androidx.lifecycle.y0;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.userprofile.model.k;
import com.garmin.android.apps.connectmobile.userprofile.model.q;
import com.garmin.android.apps.connectmobile.v2;
import e23.p;
import ei0.p0;
import java.util.List;
import lc.u0;
import li0.d0;
import o13.r;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/lifecycle/t0;", "Lcom/garmin/android/apps/connectmobile/g3;", "Lcom/garmin/android/apps/connectmobile/userprofile/model/q;", "", "<anonymous>", "(Landroidx/lifecycle/t0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.userprofile.UserProfileViewModel$fetchProfileInfoV3$1", f = "UserProfileViewModel.kt", l = {378, 380, 399, 403}, m = "invokeSuspend", v = 2)
public final class j extends v13.i implements p<t0<g3<? extends q>>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public q f46792a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f46793b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f46794c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i f46795d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f46796e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ List<k> f46797f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public j(i iVar, String str, List<? extends k> list, t13.d<? super j> dVar) {
        super(2, dVar);
        this.f46795d = iVar;
        this.f46796e = str;
        this.f46797f = list;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        j jVar = new j(this.f46795d, this.f46796e, this.f46797f, dVar);
        jVar.f46794c = obj;
        return jVar;
    }

    @Override // e23.p
    public final Object invoke(t0<g3<? extends q>> t0Var, t13.d<? super Unit> dVar) {
        return ((j) create(t0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:107:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:109:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:111:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:116:0x0211  */
    /* JADX WARN: Code duplicated, block: B:22:0x0070  */
    /* JADX WARN: Code duplicated, block: B:27:0x0089  */
    /* JADX WARN: Code duplicated, block: B:30:0x009c  */
    /* JADX WARN: Code duplicated, block: B:32:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:33:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:37:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:39:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:40:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:44:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:52:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:54:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:55:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:59:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:63:0x0101  */
    /* JADX WARN: Code duplicated, block: B:67:0x010c  */
    /* JADX WARN: Code duplicated, block: B:69:0x0112  */
    /* JADX WARN: Code duplicated, block: B:70:0x0117  */
    /* JADX WARN: Code duplicated, block: B:74:0x0122  */
    /* JADX WARN: Code duplicated, block: B:79:0x0133  */
    /* JADX WARN: Code duplicated, block: B:83:0x0144  */
    /* JADX WARN: Code duplicated, block: B:84:0x0149  */
    /* JADX WARN: Code duplicated, block: B:87:0x014d  */
    /* JADX WARN: Code duplicated, block: B:90:0x016d  */
    /* JADX WARN: Code duplicated, block: B:93:0x0174  */
    /* JADX WARN: Code duplicated, block: B:94:0x0179  */
    /* JADX WARN: Code duplicated, block: B:98:0x01b0  */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x020b, code lost:
    
        if (r1.emit(r3, r26) == r2) goto L113;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object objK;
        v2 v2Var;
        q qVar;
        hi0.a userFollowProfile;
        long jLongValue;
        long jLongValue2;
        com.garmin.android.apps.connectmobile.userprofile.model.c userInfo;
        com.garmin.android.apps.connectmobile.userprofile.model.c userInfo2;
        com.garmin.android.apps.connectmobile.userprofile.model.c userInfo3;
        com.garmin.android.apps.connectmobile.userprofile.model.c userInfo4;
        com.garmin.android.apps.connectmobile.userprofile.model.c userInfo5;
        com.garmin.android.apps.connectmobile.userprofile.model.c userInfo6;
        com.garmin.android.apps.connectmobile.userprofile.model.c userInfo7;
        y0<g3<q>> y0Var;
        g3<q> g3VarD;
        q qVar2;
        hi0.a userFollowProfile2;
        d0 d0Var;
        g3 g3VarD2;
        q qVar3;
        hi0.a userFollowProfile3;
        int iIntValue;
        Integer userPoint;
        hi0.a userFollowProfile4;
        com.garmin.android.apps.connectmobile.userprofile.model.j profileImageUrls;
        hi0.a userFollowProfile5;
        com.garmin.android.apps.connectmobile.userprofile.model.h profileImageType;
        hi0.a userFollowProfile6;
        String location;
        hi0.a userFollowProfile7;
        Long userLevel;
        hi0.a userFollowProfile8;
        String fullName;
        hi0.a userFollowProfile9;
        String displayName;
        Long userId;
        com.garmin.android.apps.connectmobile.userprofile.model.c userInfo8;
        String displayName2;
        t0 t0Var = (t0) this.f46794c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f46793b;
        i iVar = this.f46795d;
        if (i14 == 0) {
            r.b(obj);
            g3 g3VarC = g3.a.c(g3.f35298f);
            this.f46794c = t0Var;
            this.f46793b = 1;
            if (t0Var.emit(g3VarC, this) != aVar) {
            }
            return aVar;
        }
        if (i14 == 1) {
            r.b(obj);
        } else {
            if (i14 == 2) {
                r.b(obj);
                objK = obj;
                v2Var = (v2) objK;
                if (v2Var instanceof v2.b) {
                    qVar = (q) ((v2.b) v2Var).f47386a;
                    userFollowProfile = qVar.getUserFollowProfile();
                    jLongValue = 0;
                    if (userFollowProfile != null || (userId = userFollowProfile.getUserId()) == null) {
                        jLongValue2 = 0;
                    } else {
                        jLongValue2 = userId.longValue();
                    }
                    qVar.t((int) jLongValue2);
                    qVar.u(new com.garmin.android.apps.connectmobile.userprofile.model.c());
                    userInfo = qVar.getUserInfo();
                    if (userInfo != null) {
                        userFollowProfile9 = qVar.getUserFollowProfile();
                        if (userFollowProfile9 != null) {
                            displayName = userFollowProfile9.getDisplayName();
                        } else {
                            displayName = null;
                        }
                        userInfo.m(displayName);
                    }
                    userInfo2 = qVar.getUserInfo();
                    if (userInfo2 != null) {
                        userFollowProfile8 = qVar.getUserFollowProfile();
                        if (userFollowProfile8 != null) {
                            fullName = userFollowProfile8.getFullName();
                        } else {
                            fullName = null;
                        }
                        userInfo2.o(fullName);
                    }
                    userInfo3 = qVar.getUserInfo();
                    if (userInfo3 != null) {
                        userFollowProfile7 = qVar.getUserFollowProfile();
                        if (userFollowProfile7 != null && (userLevel = userFollowProfile7.getUserLevel()) != null) {
                            jLongValue = userLevel.longValue();
                        }
                        userInfo3.t((int) jLongValue);
                    }
                    userInfo4 = qVar.getUserInfo();
                    if (userInfo4 != null) {
                        userFollowProfile6 = qVar.getUserFollowProfile();
                        if (userFollowProfile6 != null) {
                            location = userFollowProfile6.getLocation();
                        } else {
                            location = null;
                        }
                        userInfo4.q(location);
                    }
                    userInfo5 = qVar.getUserInfo();
                    if (userInfo5 != null) {
                        userFollowProfile5 = qVar.getUserFollowProfile();
                        if (userFollowProfile5 != null || (profileImageType = userFollowProfile5.getProfileImageType()) == null) {
                            profileImageType = com.garmin.android.apps.connectmobile.userprofile.model.h.UPLOADED_PHOTO;
                        }
                        userInfo5.r(profileImageType);
                    }
                    userInfo6 = qVar.getUserInfo();
                    if (userInfo6 != null) {
                        userFollowProfile4 = qVar.getUserFollowProfile();
                        if (userFollowProfile4 != null) {
                            profileImageUrls = userFollowProfile4.getProfileImageUrls();
                        } else {
                            profileImageUrls = null;
                        }
                        userInfo6.s(profileImageUrls);
                    }
                    userInfo7 = qVar.getUserInfo();
                    if (userInfo7 != null) {
                        userFollowProfile3 = qVar.getUserFollowProfile();
                        if (userFollowProfile3 != null || (userPoint = userFollowProfile3.getUserPoint()) == null) {
                            iIntValue = 0;
                        } else {
                            iIntValue = userPoint.intValue();
                        }
                        userInfo7.u(iIntValue);
                    }
                    iVar.getClass();
                    y0Var = iVar.f46756h;
                    g3VarD = y0Var.d();
                    if (g3VarD != null) {
                        qVar2 = g3VarD.f35301b;
                    } else {
                        qVar2 = null;
                    }
                    if (qVar2 != qVar) {
                        g3.f35298f.getClass();
                        y0Var.j(g3.a.d(qVar));
                    }
                    y0<i.d> y0Var2 = iVar.f46766r;
                    boolean z14 = qVar.getUserId() == ((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).getUserProfilePk();
                    userFollowProfile2 = qVar.getUserFollowProfile();
                    if (userFollowProfile2 != null) {
                        d0Var = hi0.b.a(userFollowProfile2);
                    } else {
                        d0Var = new d0(null, null, null, null, false, null, null, null, null, 511, null);
                    }
                    y0Var2.j(new i.d(z14, d0Var));
                    g3.f35298f.getClass();
                    g3VarD2 = g3.a.d(qVar);
                    this.f46794c = null;
                    this.f46792a = qVar;
                    this.f46793b = 3;
                    if (t0Var.emit(g3VarD2, this) != aVar) {
                        qVar3 = qVar;
                        int i15 = i.I;
                        iVar.getClass();
                        f12.b bVar = (f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null);
                        userInfo8 = qVar3.getUserInfo();
                        if (userInfo8 != null) {
                            oo1.a aVar2 = (oo1.a) KoinJavaComponent.get$default(oo1.a.class, null, null, 6, null);
                            com.garmin.android.apps.connectmobile.userprofile.model.c userInfo9 = qVar3.getUserInfo();
                            aVar2.a(userInfo9 != null ? userInfo9.getProfileImageUrls() : null);
                        }
                    }
                } else {
                    if (v2Var instanceof v2.a) {
                        u0.r();
                        return null;
                    }
                    v2.a aVar3 = (v2.a) v2Var;
                    g3 g3VarA = g3.a.a(g3.f35298f, aVar3.f47383a.toString(), aVar3.f47383a, null, aVar3.f47384b, 4);
                    this.f46794c = null;
                    this.f46793b = 4;
                }
                return aVar;
            }
            if (i14 == 3) {
                qVar3 = this.f46792a;
                r.b(obj);
                int i16 = i.I;
                iVar.getClass();
                f12.b bVar2 = (f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null);
                userInfo8 = qVar3.getUserInfo();
                if (userInfo8 != null && (displayName2 = userInfo8.getDisplayName()) != null && displayName2.equals(bVar2.getUserDisplayName())) {
                    oo1.a aVar4 = (oo1.a) KoinJavaComponent.get$default(oo1.a.class, null, null, 6, null);
                    com.garmin.android.apps.connectmobile.userprofile.model.c userInfo10 = qVar3.getUserInfo();
                    aVar4.a(userInfo10 != null ? userInfo10.getProfileImageUrls() : null);
                }
            } else {
                if (i14 != 4) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
        }
        return Unit.INSTANCE;
        iVar.f46768v.j(Boolean.FALSE);
        k12.a aVar5 = iVar.f46749a;
        this.f46794c = t0Var;
        this.f46793b = 2;
        objK = aVar5.k(this.f46796e, this.f46797f, p0.f64292c, this);
        if (objK != aVar) {
            v2Var = (v2) objK;
            if (v2Var instanceof v2.b) {
                qVar = (q) ((v2.b) v2Var).f47386a;
                userFollowProfile = qVar.getUserFollowProfile();
                jLongValue = 0;
                if (userFollowProfile != null) {
                    jLongValue2 = 0;
                } else {
                    jLongValue2 = 0;
                }
                qVar.t((int) jLongValue2);
                qVar.u(new com.garmin.android.apps.connectmobile.userprofile.model.c());
                userInfo = qVar.getUserInfo();
                if (userInfo != null) {
                    userFollowProfile9 = qVar.getUserFollowProfile();
                    if (userFollowProfile9 != null) {
                        displayName = userFollowProfile9.getDisplayName();
                    } else {
                        displayName = null;
                    }
                    userInfo.m(displayName);
                }
                userInfo2 = qVar.getUserInfo();
                if (userInfo2 != null) {
                    userFollowProfile8 = qVar.getUserFollowProfile();
                    if (userFollowProfile8 != null) {
                        fullName = userFollowProfile8.getFullName();
                    } else {
                        fullName = null;
                    }
                    userInfo2.o(fullName);
                }
                userInfo3 = qVar.getUserInfo();
                if (userInfo3 != null) {
                    userFollowProfile7 = qVar.getUserFollowProfile();
                    if (userFollowProfile7 != null) {
                        jLongValue = userLevel.longValue();
                    }
                    userInfo3.t((int) jLongValue);
                }
                userInfo4 = qVar.getUserInfo();
                if (userInfo4 != null) {
                    userFollowProfile6 = qVar.getUserFollowProfile();
                    if (userFollowProfile6 != null) {
                        location = userFollowProfile6.getLocation();
                    } else {
                        location = null;
                    }
                    userInfo4.q(location);
                }
                userInfo5 = qVar.getUserInfo();
                if (userInfo5 != null) {
                    userFollowProfile5 = qVar.getUserFollowProfile();
                    if (userFollowProfile5 != null) {
                        profileImageType = com.garmin.android.apps.connectmobile.userprofile.model.h.UPLOADED_PHOTO;
                    } else {
                        profileImageType = com.garmin.android.apps.connectmobile.userprofile.model.h.UPLOADED_PHOTO;
                    }
                    userInfo5.r(profileImageType);
                }
                userInfo6 = qVar.getUserInfo();
                if (userInfo6 != null) {
                    userFollowProfile4 = qVar.getUserFollowProfile();
                    if (userFollowProfile4 != null) {
                        profileImageUrls = userFollowProfile4.getProfileImageUrls();
                    } else {
                        profileImageUrls = null;
                    }
                    userInfo6.s(profileImageUrls);
                }
                userInfo7 = qVar.getUserInfo();
                if (userInfo7 != null) {
                    userFollowProfile3 = qVar.getUserFollowProfile();
                    if (userFollowProfile3 != null) {
                        iIntValue = 0;
                    } else {
                        iIntValue = 0;
                    }
                    userInfo7.u(iIntValue);
                }
                iVar.getClass();
                y0Var = iVar.f46756h;
                g3VarD = y0Var.d();
                if (g3VarD != null) {
                    qVar2 = g3VarD.f35301b;
                } else {
                    qVar2 = null;
                }
                if (qVar2 != qVar) {
                    g3.f35298f.getClass();
                    y0Var.j(g3.a.d(qVar));
                }
                y0<i.d> y0Var3 = iVar.f46766r;
                if (qVar.getUserId() == ((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).getUserProfilePk()) {
                }
                userFollowProfile2 = qVar.getUserFollowProfile();
                if (userFollowProfile2 != null) {
                    d0Var = hi0.b.a(userFollowProfile2);
                } else {
                    d0Var = new d0(null, null, null, null, false, null, null, null, null, 511, null);
                }
                y0Var3.j(new i.d(z14, d0Var));
                g3.f35298f.getClass();
                g3VarD2 = g3.a.d(qVar);
                this.f46794c = null;
                this.f46792a = qVar;
                this.f46793b = 3;
                if (t0Var.emit(g3VarD2, this) != aVar) {
                    qVar3 = qVar;
                    int i17 = i.I;
                    iVar.getClass();
                    f12.b bVar3 = (f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null);
                    userInfo8 = qVar3.getUserInfo();
                    if (userInfo8 != null) {
                        oo1.a aVar6 = (oo1.a) KoinJavaComponent.get$default(oo1.a.class, null, null, 6, null);
                        com.garmin.android.apps.connectmobile.userprofile.model.c userInfo11 = qVar3.getUserInfo();
                        aVar6.a(userInfo11 != null ? userInfo11.getProfileImageUrls() : null);
                    }
                    return Unit.INSTANCE;
                }
            } else {
                if (v2Var instanceof v2.a) {
                    u0.r();
                    return null;
                }
                v2.a aVar7 = (v2.a) v2Var;
                g3 g3VarA2 = g3.a.a(g3.f35298f, aVar7.f47383a.toString(), aVar7.f47383a, null, aVar7.f47384b, 4);
                this.f46794c = null;
                this.f46793b = 4;
            }
        }
        return aVar;
    }
}

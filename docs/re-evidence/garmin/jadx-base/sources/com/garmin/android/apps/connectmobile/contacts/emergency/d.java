package com.garmin.android.apps.connectmobile.contacts.emergency;

import am.j;
import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import androidx.lifecycle.y0;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import f20.e0;
import i3.f2;
import j20.n;
import j20.q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import lc.u0;
import m20.m0;
import m20.n0;
import m20.p0;
import m20.z;
import o13.l;
import o13.m;
import o13.p;
import o13.r;
import o13.t;
import o13.u;
import o53.b0;
import o53.c2;
import o53.s0;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.d0;
import p13.h0;
import p13.x;
import re0.o;
import tj1.s;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0011Ba\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u001c\b\u0002\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004j\n\u0012\u0004\u0012\u00020\u0005\u0018\u0001`\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\t\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lcom/garmin/android/apps/connectmobile/contacts/emergency/d;", "Landroidx/lifecycle/u1;", "Ll20/a;", "contact", "Ljava/util/ArrayList;", "Ll20/c;", "Lkotlin/collections/ArrayList;", "contactInfoList", "contactInfo", "", "fromEmergencyContactDetails", "isLiveTrackSetup", "isLiveTrackAndEmergencyContactSetup", "Lhl/a;", "screenAccessRole", "<init>", "(Ll20/a;Ljava/util/ArrayList;Ll20/c;ZZZLhl/a;)V", "a", "gcm-contacts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d extends u1 {

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public static final /* synthetic */ int f32641k0 = 0;
    public final y0<Boolean> A;
    public final y0 B;
    public final y0<g3<p<String, String>>> C;
    public final y0 D;
    public final y0<String> E;
    public final y0 F;
    public final y0<EmergencyContactSendRequestActivity.b> I;
    public final y0 P;
    public z T;
    public final o X;
    public final l Y;
    public final l Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f32642a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f32643b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f32644c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final hl.a f32645d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public l20.a f32646e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public l20.c f32647f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f32648g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f32649h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f32650i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f32651j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final y0<g3<u<l20.a, l20.c, Boolean>>> f32652k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final y0 f32653l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final t f32654m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f32655n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f32656o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f32657p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f32658q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public l20.l f32659r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public ArrayList f32660t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final ArrayList f32661v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final y0<g3<p<p0, l20.a>>> f32662w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final y0 f32663x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final y0<g3<String>> f32664y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final y0 f32665z;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.contacts.emergency.EmergencyContactViewModel$onSendButtonClicked$1", f = "EmergencyContactViewModel.kt", l = {567}, m = "invokeSuspend", v = 2)
    public static final class b extends i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f32666a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ long f32668c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(long j8, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f32668c = j8;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return d.this.new b(this.f32668c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f32666a;
            d dVar = d.this;
            if (i14 == 0) {
                r.b(obj);
                this.f32666a = 1;
                obj = d.x4(dVar, this.f32668c, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            if (((Boolean) obj).booleanValue()) {
                dVar.J4();
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.contacts.emergency.EmergencyContactViewModel$onSendButtonClicked$2", f = "EmergencyContactViewModel.kt", l = {573, 575}, m = "invokeSuspend", v = 2)
    public static final class c extends i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f32669a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ long f32671c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(long j8, t13.d<? super c> dVar) {
            super(2, dVar);
            this.f32671c = j8;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return d.this.new c(this.f32671c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0039, code lost:
        
            if (r6 == r0) goto L17;
         */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f32669a;
            d dVar = d.this;
            if (i14 == 0) {
                r.b(obj);
                this.f32669a = 1;
                obj = d.z4(dVar, this);
                if (obj != aVar) {
                }
                return aVar;
            }
            if (i14 == 1) {
                r.b(obj);
            } else {
                if (i14 != 2) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            if (((Boolean) obj).booleanValue()) {
                dVar.J4();
            }
            return Unit.INSTANCE;
            if (((Boolean) obj).booleanValue()) {
                this.f32669a = 2;
                obj = d.y4(dVar, this.f32671c, this);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.contacts.emergency.d$d, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.contacts.emergency.EmergencyContactViewModel$setEmergencyContactAndClose$1", f = "EmergencyContactViewModel.kt", l = {604, 605, 611, 615, 616}, m = "invokeSuspend", v = 2)
    public static final class C0537d extends i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f32672a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f32673b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f32675d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f32676e;

        /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.contacts.emergency.d$d$a */
        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f32677a;

            static {
                int[] iArr = new int[l20.l.values().length];
                try {
                    iArr[l20.l.EMERGENCY_CONTACT.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[l20.l.LIVETRACK.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f32677a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0537d(String str, String str2, t13.d<? super C0537d> dVar) {
            super(2, dVar);
            this.f32675d = str;
            this.f32676e = str2;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            C0537d c0537d = d.this.new C0537d(this.f32675d, this.f32676e, dVar);
            c0537d.f32673b = obj;
            return c0537d;
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((C0537d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:57:0x0126  */
        /* JADX WARN: Code duplicated, block: B:59:0x012c  */
        /* JADX WARN: Code duplicated, block: B:62:0x0148  */
        /* JADX WARN: Code duplicated, block: B:63:0x014f  */
        /* JADX WARN: Code duplicated, block: B:65:0x0153  */
        /* JADX WARN: Code duplicated, block: B:67:0x015d  */
        /* JADX WARN: Code duplicated, block: B:69:0x0167  */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0077, code lost:
        
            if (r3 == r2) goto L53;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x00aa, code lost:
        
            if (r3 == r2) goto L53;
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x00e2, code lost:
        
            if (r1 == r2) goto L53;
         */
        /* JADX WARN: Code restructure failed: missing block: B:46:0x0106, code lost:
        
            if (r1 == r2) goto L53;
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x011d, code lost:
        
            if (r1 == r2) goto L53;
         */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object objJ;
            Object objJ2;
            v2 v2Var;
            List<s> listB;
            Object objB;
            Object objL;
            Object objB2;
            v2 v2Var2;
            T t7;
            l20.c contactInfoDTO;
            b0 b0Var = (b0) this.f32673b;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f32672a;
            d dVar = d.this;
            if (i14 == 0) {
                r.b(obj);
                hl.a aVar2 = dVar.f32645d;
                if (p005kotlin.jvm.internal.s.g(aVar2, hl.a.c.f84256b)) {
                    z zVar = dVar.T;
                    tj1.a aVar3 = new tj1.a(this.f32675d, this.f32676e, null, null, 12, null);
                    this.f32673b = b0Var;
                    this.f32672a = 1;
                    zVar.getClass();
                    objJ2 = f0.J(zVar, new m20.h(zVar, aVar3, null), this);
                } else {
                    if (!(aVar2 instanceof hl.a.b)) {
                        u0.r();
                        return null;
                    }
                    z zVar2 = dVar.T;
                    tj1.a aVar4 = new tj1.a(this.f32675d, this.f32676e, null, ((hl.a.b) dVar.f32645d).f84253c, 4, null);
                    this.f32673b = b0Var;
                    this.f32672a = 2;
                    zVar2.getClass();
                    objJ = f0.J(zVar2, new m20.i(zVar2, aVar4, null), this);
                }
                return aVar;
            }
            if (i14 == 1) {
                r.b(obj);
                objJ2 = obj;
                v2Var = (v2) objJ2;
            } else {
                if (i14 != 2) {
                    if (i14 == 3) {
                        r.b(obj);
                        objB2 = obj;
                        v2Var2 = (v2) objB2;
                        if (v2Var2 instanceof v2.b) {
                            a2 a2Var = a2.SAFETY_FEATURES;
                            l20.c cVar = dVar.f32647f;
                            String strM = j.m("[setEmergencyContactAndClose] Setting email address ", cVar != null ? cVar.getCom.google.firebase.analytics.FirebaseAnalytics.Param.CONTENT java.lang.String() : null, " as an emergency contact method was successful.");
                            i2.f36769a.getClass();
                            i2.a.b(a2Var, "EmergencyContactViewModel", strM);
                            t7 = ((v2.b) v2Var2).f47386a;
                            if (t7 instanceof m20.f) {
                                contactInfoDTO = ((m20.f) t7).getContactInfoDTO();
                            } else {
                                if (!(t7 instanceof ue0.g)) {
                                    dVar.I.j(EmergencyContactSendRequestActivity.b.COULD_NOT_SEND_EMAIL);
                                    return Unit.INSTANCE;
                                }
                                contactInfoDTO = ((ue0.g) t7).getContactInfoDTO();
                            }
                            dVar.A4(contactInfoDTO);
                        } else {
                            a2 a2Var2 = a2.SAFETY_FEATURES;
                            i2.f36769a.getClass();
                            i2.a.f(a2Var2, "EmergencyContactViewModel", "[setEmergencyContactAndClose] Error! Setting the contact method to pending failed!");
                            dVar.I.j(EmergencyContactSendRequestActivity.b.COULD_NOT_SEND_EMAIL);
                        }
                        return Unit.INSTANCE;
                    }
                    if (i14 == 4) {
                        r.b(obj);
                        objB = obj;
                        v2Var2 = (v2) objB;
                        if (v2Var2 instanceof v2.b) {
                            a2 a2Var3 = a2.SAFETY_FEATURES;
                            l20.c cVar2 = dVar.f32647f;
                            String strM2 = j.m("[setEmergencyContactAndClose] Setting email address ", cVar2 != null ? cVar2.getCom.google.firebase.analytics.FirebaseAnalytics.Param.CONTENT java.lang.String() : null, " as an emergency contact method was successful.");
                            i2.f36769a.getClass();
                            i2.a.b(a2Var3, "EmergencyContactViewModel", strM2);
                            t7 = ((v2.b) v2Var2).f47386a;
                            if (t7 instanceof m20.f) {
                                contactInfoDTO = ((m20.f) t7).getContactInfoDTO();
                            } else {
                                if (!(t7 instanceof ue0.g)) {
                                    dVar.I.j(EmergencyContactSendRequestActivity.b.COULD_NOT_SEND_EMAIL);
                                    return Unit.INSTANCE;
                                }
                                contactInfoDTO = ((ue0.g) t7).getContactInfoDTO();
                            }
                            dVar.A4(contactInfoDTO);
                        } else {
                            a2 a2Var4 = a2.SAFETY_FEATURES;
                            i2.f36769a.getClass();
                            i2.a.f(a2Var4, "EmergencyContactViewModel", "[setEmergencyContactAndClose] Error! Setting the contact method to pending failed!");
                            dVar.I.j(EmergencyContactSendRequestActivity.b.COULD_NOT_SEND_EMAIL);
                        }
                        return Unit.INSTANCE;
                    }
                    if (i14 != 5) {
                        h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r.b(obj);
                    objL = obj;
                    v2Var2 = (v2) objL;
                    if (v2Var2 instanceof v2.b) {
                        a2 a2Var5 = a2.SAFETY_FEATURES;
                        l20.c cVar3 = dVar.f32647f;
                        String strM3 = j.m("[setEmergencyContactAndClose] Setting email address ", cVar3 != null ? cVar3.getCom.google.firebase.analytics.FirebaseAnalytics.Param.CONTENT java.lang.String() : null, " as an emergency contact method was successful.");
                        i2.f36769a.getClass();
                        i2.a.b(a2Var5, "EmergencyContactViewModel", strM3);
                        t7 = ((v2.b) v2Var2).f47386a;
                        if (t7 instanceof m20.f) {
                            contactInfoDTO = ((m20.f) t7).getContactInfoDTO();
                        } else {
                            if (!(t7 instanceof ue0.g)) {
                                dVar.I.j(EmergencyContactSendRequestActivity.b.COULD_NOT_SEND_EMAIL);
                                return Unit.INSTANCE;
                            }
                            contactInfoDTO = ((ue0.g) t7).getContactInfoDTO();
                        }
                        dVar.A4(contactInfoDTO);
                    } else {
                        a2 a2Var6 = a2.SAFETY_FEATURES;
                        i2.f36769a.getClass();
                        i2.a.f(a2Var6, "EmergencyContactViewModel", "[setEmergencyContactAndClose] Error! Setting the contact method to pending failed!");
                        dVar.I.j(EmergencyContactSendRequestActivity.b.COULD_NOT_SEND_EMAIL);
                    }
                    return Unit.INSTANCE;
                }
                r.b(obj);
                objJ = obj;
                v2Var = (v2) objJ;
            }
            if ((v2Var instanceof v2.b) && ((listB = ((tj1.u) ((v2.b) v2Var).f47386a).b()) == null || listB.isEmpty())) {
                hl.a aVar5 = dVar.f32645d;
                hl.a aVar6 = dVar.f32645d;
                o oVar = dVar.X;
                boolean zG = p005kotlin.jvm.internal.s.g(aVar5, hl.a.c.f84256b);
                String str = this.f32675d;
                if (zG) {
                    z zVar3 = dVar.T;
                    this.f32673b = b0Var;
                    this.f32672a = 3;
                    objB2 = zVar3.f116058d.b(str, this);
                } else {
                    if (!(aVar5 instanceof hl.a.b)) {
                        u0.r();
                        return null;
                    }
                    int i15 = a.f32677a[dVar.f32659r.ordinal()];
                    if (i15 == 1) {
                        long j8 = ((hl.a.b) aVar6).f84252b;
                        this.f32673b = b0Var;
                        this.f32672a = 4;
                        objB = oVar.b(j8, str, this);
                    } else {
                        if (i15 != 2) {
                            u0.r();
                            return null;
                        }
                        long j14 = ((hl.a.b) aVar6).f84252b;
                        this.f32673b = b0Var;
                        this.f32672a = 5;
                        objL = oVar.l(j14, str, this);
                    }
                }
                return aVar;
            }
            a2 a2Var7 = a2.SAFETY_FEATURES;
            i2.f36769a.getClass();
            i2.a.f(a2Var7, "EmergencyContactViewModel", "[setEmergencyContactAndClose] Error! Adding emergency contact failed!");
            dVar.I.j(EmergencyContactSendRequestActivity.b.COULD_NOT_SEND_EMAIL);
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.contacts.emergency.EmergencyContactViewModel$setEmergencyContactAndClose$2", f = "EmergencyContactViewModel.kt", l = {653, 657, 658}, m = "invokeSuspend", v = 2)
    public static final class e extends i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f32678a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f32679b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f32681d;

        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f32682a;

            static {
                int[] iArr = new int[l20.l.values().length];
                try {
                    iArr[l20.l.EMERGENCY_CONTACT.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[l20.l.LIVETRACK.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f32682a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str, t13.d<? super e> dVar) {
            super(2, dVar);
            this.f32681d = str;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            e eVar = d.this.new e(this.f32681d, dVar);
            eVar.f32679b = obj;
            return eVar;
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((e) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x0047, code lost:
        
            if (r11 == r1) goto L31;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x006b, code lost:
        
            if (r11 == r1) goto L31;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x0082, code lost:
        
            if (r11 == r1) goto L31;
         */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            v2 v2Var;
            l20.c contactInfoDTO;
            b0 b0Var = (b0) this.f32679b;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f32678a;
            d dVar = d.this;
            if (i14 == 0) {
                r.b(obj);
                hl.a aVar2 = dVar.f32645d;
                hl.a aVar3 = dVar.f32645d;
                o oVar = dVar.X;
                boolean zG = p005kotlin.jvm.internal.s.g(aVar2, hl.a.c.f84256b);
                String str = this.f32681d;
                if (zG) {
                    z zVar = dVar.T;
                    this.f32679b = b0Var;
                    this.f32678a = 1;
                    obj = zVar.f116058d.b(str, this);
                } else {
                    if (!(aVar2 instanceof hl.a.b)) {
                        u0.r();
                        return null;
                    }
                    int i15 = a.f32682a[dVar.f32659r.ordinal()];
                    if (i15 == 1) {
                        long j8 = ((hl.a.b) aVar3).f84252b;
                        this.f32679b = b0Var;
                        this.f32678a = 2;
                        obj = oVar.b(j8, str, this);
                    } else {
                        if (i15 != 2) {
                            u0.r();
                            return null;
                        }
                        long j14 = ((hl.a.b) aVar3).f84252b;
                        this.f32679b = b0Var;
                        this.f32678a = 3;
                        obj = oVar.l(j14, str, this);
                    }
                }
                return aVar;
            }
            if (i14 == 1) {
                r.b(obj);
                v2Var = (v2) obj;
            } else if (i14 == 2) {
                r.b(obj);
                v2Var = (v2) obj;
            } else {
                if (i14 != 3) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
                v2Var = (v2) obj;
            }
            if (v2Var instanceof v2.b) {
                a2 a2Var = a2.SAFETY_FEATURES;
                l20.c cVar = dVar.f32647f;
                String strM = j.m("[setEmergencyContactAndClose] Setting phone number ", cVar != null ? cVar.getCom.google.firebase.analytics.FirebaseAnalytics.Param.CONTENT java.lang.String() : null, " as an emergency contact method was successful.");
                i2.f36769a.getClass();
                i2.a.b(a2Var, "EmergencyContactViewModel", strM);
                T t7 = ((v2.b) v2Var).f47386a;
                if (t7 instanceof m20.f) {
                    contactInfoDTO = ((m20.f) t7).getContactInfoDTO();
                } else {
                    if (!(t7 instanceof ue0.g)) {
                        dVar.I.j(EmergencyContactSendRequestActivity.b.COULD_NOT_SEND_EMAIL);
                        return Unit.INSTANCE;
                    }
                    contactInfoDTO = ((ue0.g) t7).getContactInfoDTO();
                }
                dVar.A4(contactInfoDTO);
            } else {
                a2 a2Var2 = a2.SAFETY_FEATURES;
                l20.c cVar2 = dVar.f32647f;
                String strM2 = j.m("[setEmergencyContactAndClose] Error! Setting ", cVar2 != null ? cVar2.getCom.google.firebase.analytics.FirebaseAnalytics.Param.CONTENT java.lang.String() : null, " to pending failed!");
                i2.f36769a.getClass();
                i2.a.f(a2Var2, "EmergencyContactViewModel", strM2);
                dVar.I.j(EmergencyContactSendRequestActivity.b.COULD_NOT_SEND_SMS);
            }
            return Unit.INSTANCE;
        }
    }

    static {
        new a(null);
    }

    public d(l20.a aVar, ArrayList<l20.c> arrayList, l20.c cVar, boolean z14, boolean z15, boolean z16, hl.a aVar2) {
        aVar.getClass();
        aVar2.getClass();
        this.f32642a = z14;
        this.f32643b = z15;
        this.f32644c = z16;
        this.f32645d = aVar2;
        this.f32646e = aVar;
        this.f32647f = cVar;
        this.f32648g = arrayList;
        boolean z17 = arrayList == null || arrayList.isEmpty();
        this.f32651j = !z17;
        g3.a aVar3 = g3.f35298f;
        l20.a aVar4 = this.f32646e;
        l20.c cVar2 = this.f32647f;
        Boolean bool = Boolean.FALSE;
        u uVar = new u(aVar4, cVar2, bool);
        aVar3.getClass();
        y0<g3<u<l20.a, l20.c, Boolean>>> y0Var = new y0<>(g3.a.d(uVar));
        this.f32652k = y0Var;
        this.f32653l = y0Var;
        this.f32654m = m.b(new ik2.b(25));
        this.f32656o = "";
        this.f32657p = "";
        l20.l lVar = l20.l.EMERGENCY_CONTACT;
        this.f32659r = lVar;
        p pVar = new p(lVar, bool);
        l20.l lVar2 = l20.l.LIVETRACK;
        this.f32660t = x.m(pVar, new p(lVar2, bool));
        this.f32661v = new ArrayList();
        y0<g3<p<p0, l20.a>>> y0Var2 = new y0<>();
        this.f32662w = y0Var2;
        this.f32663x = y0Var2;
        y0<g3<String>> y0Var3 = new y0<>();
        this.f32664y = y0Var3;
        this.f32665z = y0Var3;
        y0<Boolean> y0Var4 = new y0<>(bool);
        this.A = y0Var4;
        this.B = y0Var4;
        y0<g3<p<String, String>>> y0Var5 = new y0<>();
        this.C = y0Var5;
        this.D = y0Var5;
        y0<String> y0Var6 = new y0<>();
        this.E = y0Var6;
        this.F = y0Var6;
        y0<EmergencyContactSendRequestActivity.b> y0Var7 = new y0<>();
        this.I = y0Var7;
        this.P = y0Var7;
        this.T = (z) KoinJavaComponent.inject$default(z.class, null, new f2(this, 16), 2, null).getValue();
        this.X = (o) KoinJavaComponent.get$default(o.class, null, null, 6, null);
        this.Y = KoinJavaComponent.inject$default(e0.class, null, null, 6, null);
        this.Z = KoinJavaComponent.inject$default(n0.class, null, null, 6, null);
        lVar = z15 ? lVar2 : lVar;
        this.f32659r = lVar;
        N4(lVar);
        if (z17) {
            l20.c cVar3 = this.f32647f;
            if (cVar3 != null) {
                I4(cVar3);
                return;
            } else {
                y0Var6.j("EmergencyContactMethodPickerFragment");
                return;
            }
        }
        if (arrayList != null) {
            Iterator<T> it = arrayList.iterator();
            while (it.hasNext()) {
                this.f32661v.add(new p((l20.c) it.next(), Boolean.FALSE));
            }
        }
        this.f32649h = false;
        this.E.j("SendMultipleSMSRequestFragment");
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:45:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00b9, code lost:
    
        if (r1 == r4) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00dd, code lost:
    
        if (r1 == r4) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object x4(d dVar, long j8, v13.c cVar) {
        j20.o oVar;
        v2 v2Var;
        y0<EmergencyContactSendRequestActivity.b> y0Var = dVar.I;
        hl.a aVar = dVar.f32645d;
        if (cVar instanceof j20.o) {
            oVar = (j20.o) cVar;
            int i14 = oVar.f96593c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                oVar.f96593c = i14 - Integer.MIN_VALUE;
            } else {
                oVar = new j20.o(dVar, cVar);
            }
        } else {
            oVar = new j20.o(dVar, cVar);
        }
        j20.o oVar2 = oVar;
        Object objQ = oVar2.f96591a;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = oVar2.f96593c;
        if (i15 == 0) {
            r.b(objQ);
            l20.c cVarI = dVar.f32646e.i(j8);
            List<l20.c> listR = dVar.f32646e.r();
            if (listR != null) {
                ArrayList arrayList = new ArrayList(listR);
                int iIndexOf = arrayList.indexOf(cVarI);
                l20.c cVarB = cVarI != null ? l20.c.b(cVarI, null, null, new Integer(l20.m.AUTO_LIVE_TRACK.f109026a), null, null, null, null, null, null, null, 0, 1048567) : null;
                if (cVarB != null && iIndexOf != -1) {
                    arrayList.set(iIndexOf, cVarB);
                    dVar.f32646e = l20.a.g(dVar.f32646e, null, null, null, null, null, null, arrayList, null, null, 8127);
                    if (p005kotlin.jvm.internal.s.g(aVar, hl.a.c.f84256b)) {
                        z zVar = dVar.T;
                        l20.a aVar3 = dVar.f32646e;
                        oVar2.f96593c = 1;
                        objQ = zVar.h(aVar3, oVar2);
                    } else {
                        if (!(aVar instanceof hl.a.b)) {
                            u0.r();
                            return null;
                        }
                        o oVar3 = dVar.X;
                        long j14 = ((hl.a.b) aVar).f84252b;
                        String contactId = dVar.f32646e.getContactId();
                        if (contactId == null) {
                            contactId = "";
                        }
                        l20.a aVar4 = dVar.f32646e;
                        oVar2.f96593c = 2;
                        objQ = oVar3.q(j14, contactId, aVar4, oVar2);
                    }
                    return aVar2;
                }
                y0Var.m(EmergencyContactSendRequestActivity.b.UNKNOWN);
                a2 a2Var = a2.LIVETRACK;
                i2.f36769a.getClass();
                i2.a.p(a2Var, "EmergencyContactViewModel", "[updateEmailWithLiveTrackFlag] There is no phone to update");
            }
        } else if (i15 == 1) {
            r.b(objQ);
            v2Var = (v2) objQ;
            if (v2Var instanceof v2.b) {
                a2 a2Var2 = a2.LIVETRACK;
                i2.f36769a.getClass();
                i2.a.b(a2Var2, "EmergencyContactViewModel", "[updateEmailWithLiveTrackFlag] ContactInfo updated with flag LiveTrack successfully!");
                return Boolean.TRUE;
            }
            y0Var.m(EmergencyContactSendRequestActivity.b.UNKNOWN);
            a2 a2Var3 = a2.LIVETRACK;
            String strF = b71.i.f("[updateEmailWithLiveTrackFlag] Could not update contact with flag LiveTrack! ", v2Var);
            i2.f36769a.getClass();
            i2.a.p(a2Var3, "EmergencyContactViewModel", strF);
        } else {
            if (i15 != 2) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(objQ);
            v2Var = (v2) objQ;
            if (v2Var instanceof v2.b) {
                a2 a2Var4 = a2.LIVETRACK;
                i2.f36769a.getClass();
                i2.a.b(a2Var4, "EmergencyContactViewModel", "[updateEmailWithLiveTrackFlag] ContactInfo updated with flag LiveTrack successfully!");
                return Boolean.TRUE;
            }
            y0Var.m(EmergencyContactSendRequestActivity.b.UNKNOWN);
            a2 a2Var5 = a2.LIVETRACK;
            String strF2 = b71.i.f("[updateEmailWithLiveTrackFlag] Could not update contact with flag LiveTrack! ", v2Var);
            i2.f36769a.getClass();
            i2.a.p(a2Var5, "EmergencyContactViewModel", strF2);
        }
        return Boolean.FALSE;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:45:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00b9, code lost:
    
        if (r1 == r4) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00dd, code lost:
    
        if (r1 == r4) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object y4(d dVar, long j8, v13.c cVar) {
        j20.p pVar;
        v2 v2Var;
        y0<EmergencyContactSendRequestActivity.b> y0Var = dVar.I;
        hl.a aVar = dVar.f32645d;
        if (cVar instanceof j20.p) {
            pVar = (j20.p) cVar;
            int i14 = pVar.f96596c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                pVar.f96596c = i14 - Integer.MIN_VALUE;
            } else {
                pVar = new j20.p(dVar, cVar);
            }
        } else {
            pVar = new j20.p(dVar, cVar);
        }
        j20.p pVar2 = pVar;
        Object objQ = pVar2.f96594a;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = pVar2.f96596c;
        if (i15 == 0) {
            r.b(objQ);
            l20.c cVarI = dVar.f32646e.i(j8);
            List<l20.c> listZ = dVar.f32646e.z();
            if (listZ != null) {
                ArrayList arrayList = new ArrayList(listZ);
                int iIndexOf = arrayList.indexOf(cVarI);
                l20.c cVarB = cVarI != null ? l20.c.b(cVarI, null, null, new Integer(l20.m.AUTO_LIVE_TRACK.f109026a), null, null, null, null, null, null, null, 0, 1048567) : null;
                if (cVarB != null && iIndexOf != -1) {
                    arrayList.set(iIndexOf, cVarB);
                    dVar.f32646e = l20.a.g(dVar.f32646e, null, null, null, null, null, null, null, arrayList, null, 8063);
                    if (p005kotlin.jvm.internal.s.g(aVar, hl.a.c.f84256b)) {
                        z zVar = dVar.T;
                        l20.a aVar3 = dVar.f32646e;
                        pVar2.f96596c = 1;
                        objQ = zVar.h(aVar3, pVar2);
                    } else {
                        if (!(aVar instanceof hl.a.b)) {
                            u0.r();
                            return null;
                        }
                        o oVar = dVar.X;
                        long j14 = ((hl.a.b) aVar).f84252b;
                        String contactId = dVar.f32646e.getContactId();
                        if (contactId == null) {
                            contactId = "";
                        }
                        l20.a aVar4 = dVar.f32646e;
                        pVar2.f96596c = 2;
                        objQ = oVar.q(j14, contactId, aVar4, pVar2);
                    }
                    return aVar2;
                }
                y0Var.m(EmergencyContactSendRequestActivity.b.UNKNOWN);
                a2 a2Var = a2.LIVETRACK;
                i2.f36769a.getClass();
                i2.a.p(a2Var, "EmergencyContactViewModel", "[updateContactWithLiveTrackFlag] There is no phone to update");
            }
        } else if (i15 == 1) {
            r.b(objQ);
            v2Var = (v2) objQ;
            if (v2Var instanceof v2.b) {
                a2 a2Var2 = a2.LIVETRACK;
                i2.f36769a.getClass();
                i2.a.b(a2Var2, "EmergencyContactViewModel", "[updateContactWithLiveTrackFlag] ContactInfo updated with flag LiveTrack successfully!");
                return Boolean.TRUE;
            }
            y0Var.m(EmergencyContactSendRequestActivity.b.UNKNOWN);
            a2 a2Var3 = a2.LIVETRACK;
            String strF = b71.i.f("[updateContactWithLiveTrackFlag] Could not update contact with flag LiveTrack! ", v2Var);
            i2.f36769a.getClass();
            i2.a.p(a2Var3, "EmergencyContactViewModel", strF);
        } else {
            if (i15 != 2) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(objQ);
            v2Var = (v2) objQ;
            if (v2Var instanceof v2.b) {
                a2 a2Var4 = a2.LIVETRACK;
                i2.f36769a.getClass();
                i2.a.b(a2Var4, "EmergencyContactViewModel", "[updateContactWithLiveTrackFlag] ContactInfo updated with flag LiveTrack successfully!");
                return Boolean.TRUE;
            }
            y0Var.m(EmergencyContactSendRequestActivity.b.UNKNOWN);
            a2 a2Var5 = a2.LIVETRACK;
            String strF2 = b71.i.f("[updateContactWithLiveTrackFlag] Could not update contact with flag LiveTrack! ", v2Var);
            i2.f36769a.getClass();
            i2.a.p(a2Var5, "EmergencyContactViewModel", strF2);
        }
        return Boolean.FALSE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Object z4(d dVar, v13.c cVar) {
        j20.r rVar;
        String str;
        y0<EmergencyContactSendRequestActivity.b> y0Var = dVar.I;
        if (cVar instanceof j20.r) {
            rVar = (j20.r) cVar;
            int i14 = rVar.f96603c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                rVar.f96603c = i14 - Integer.MIN_VALUE;
            } else {
                rVar = new j20.r(dVar, cVar);
            }
        } else {
            rVar = new j20.r(dVar, cVar);
        }
        Object objJ = rVar.f96601a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = rVar.f96603c;
        if (i15 == 0) {
            r.b(objJ);
            l20.c cVar2 = dVar.f32647f;
            if (cVar2 == null || (str = cVar2.getCom.google.firebase.analytics.FirebaseAnalytics.Param.CONTENT java.lang.String()) == null) {
                return Boolean.FALSE;
            }
            if (com.garmin.android.apps.connectmobile.contacts.b.e()) {
                n0 n0Var = (n0) dVar.Z.getValue();
                rVar.f96603c = 1;
                n0Var.getClass();
                objJ = f0.J(n0Var, new m0(str, n0Var, null), rVar);
                if (objJ == aVar) {
                    return aVar;
                }
            } else {
                com.garmin.android.apps.connectmobile.contacts.i.f32732a.getClass();
                if (com.garmin.android.apps.connectmobile.contacts.i.a.a(str)) {
                    return Boolean.TRUE;
                }
                y0Var.m(EmergencyContactSendRequestActivity.b.INVALID_PHONE_NUMBER);
            }
            return Boolean.FALSE;
        }
        if (i15 != 1) {
            h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(objJ);
        v2 v2Var = (v2) objJ;
        if (v2Var instanceof v2.b) {
            p0 p0Var = (p0) ((v2.b) v2Var).f47386a;
            Boolean valid = p0Var.getValid();
            Boolean bool = Boolean.TRUE;
            if (p005kotlin.jvm.internal.s.g(valid, bool) && p005kotlin.jvm.internal.s.g(p0Var.getCanReceiveText(), bool)) {
                return bool;
            }
            y0Var.m(EmergencyContactSendRequestActivity.b.INVALID_PHONE_NUMBER);
        } else {
            y0Var.m(EmergencyContactSendRequestActivity.b.UNKNOWN);
        }
        return Boolean.FALSE;
    }

    public final void A4(l20.c cVar) {
        l20.c cVar2 = this.f32647f;
        cVar2.getClass();
        L4(cVar2, cVar, false);
        l20.l lVar = this.f32659r;
        l20.l lVar2 = l20.l.LIVETRACK;
        l20.a aVar = this.f32646e;
        l20.a aVarG = lVar == lVar2 ? l20.a.g(aVar, null, null, null, null, Boolean.TRUE, null, null, null, null, 8175) : l20.a.g(aVar, null, null, null, Boolean.TRUE, null, null, null, null, null, 8183);
        this.f32646e = aVarG;
        w9.a aVarA = v1.a(this);
        x53.c cVar3 = s0.f129406a;
        ge1.b.T(aVarA, x53.b.f189152a, null, new n(this, aVarG, null), 2);
        boolean z14 = this.f32649h;
        y0<String> y0Var = this.E;
        y0<g3<u<l20.a, l20.c, Boolean>>> y0Var2 = this.f32652k;
        if (!z14) {
            if (this.f32651j) {
                O4();
                this.f32649h = false;
                y0Var.j("SendMultipleSMSRequestFragment");
                return;
            } else {
                g3.a aVar2 = g3.f35298f;
                u uVar = new u(this.f32646e, this.f32647f, Boolean.TRUE);
                aVar2.getClass();
                y0Var2.j(g3.a.d(uVar));
                return;
            }
        }
        g3.a aVar3 = g3.f35298f;
        u uVar2 = new u(this.f32646e, this.f32647f, Boolean.FALSE);
        aVar3.getClass();
        y0Var2.j(g3.a.d(uVar2));
        l20.l lVar3 = this.f32659r;
        int size = this.f32660t.size();
        for (int i14 = 0; i14 < size; i14++) {
            if (((p) this.f32660t.get(i14)).f128594a == lVar3) {
                this.f32660t.set(i14, new p(lVar3, Boolean.TRUE));
            }
        }
        this.f32649h = true;
        y0Var.j("SendFeatureSMSRequestFragment");
    }

    public final c2 B4() {
        return ge1.b.T(v1.a(this), null, null, new j20.l(this, null), 3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean C4() {
        ArrayList arrayList = this.f32661v;
        int size = arrayList.size();
        for (int i14 = 0; i14 < size; i14++) {
            if (!((Boolean) ((p) arrayList.get(i14)).f128595b).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean D4() {
        int size = this.f32660t.size();
        for (int i14 = 0; i14 < size; i14++) {
            if (!((Boolean) ((p) this.f32660t.get(i14)).f128595b).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean E4(l20.l lVar) {
        lVar.getClass();
        int size = this.f32660t.size();
        for (int i14 = 0; i14 < size; i14++) {
            if (((p) this.f32660t.get(i14)).f128594a == lVar) {
                return ((Boolean) ((p) this.f32660t.get(i14)).f128595b).booleanValue();
            }
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0033  */
    public final void F4(boolean z14, String str, String str2, l20.d dVar, String str3, Boolean bool) {
        ArrayList arrayList;
        boolean z15;
        l20.a aVarG;
        Long contactInfoPk;
        str2.getClass();
        y0<g3<u<l20.a, l20.c, Boolean>>> y0Var = this.f32652k;
        if (str == null) {
            a2 a2Var = a2.SAFETY_FEATURES;
            i2.f36769a.getClass();
            i2.a.f(a2Var, "EmergencyContactViewModel", "Error! There are no ContactInfoDTOs that match the number we started with! This should not be possible.");
            y0Var.j(g3.a.a(g3.f35298f, null, null, new u(this.f32646e, this.f32647f, Boolean.FALSE), null, 11));
            return;
        }
        g3.a aVar = g3.f35298f;
        y0Var.j(g3.a.c(aVar));
        l20.c cVarH = this.f32646e.h(str);
        if (cVarH == null) {
            a2 a2Var2 = a2.SAFETY_FEATURES;
            i2.f36769a.getClass();
            i2.a.f(a2Var2, "EmergencyContactViewModel", "Error! There are no ContactInfoDTOs that match the number we started with! This should not be possible.");
            y0Var.j(g3.a.a(aVar, null, null, new u(this.f32646e, this.f32647f, Boolean.FALSE), null, 11));
            return;
        }
        l20.a aVar2 = this.f32646e;
        if (z14) {
            List<l20.c> listR = aVar2.r();
            if (listR != null) {
                arrayList = new ArrayList(listR);
            } else {
                arrayList = null;
            }
        } else {
            List<l20.c> listZ = aVar2.z();
            if (listZ != null) {
                arrayList = new ArrayList(listZ);
            } else {
                arrayList = null;
            }
        }
        boolean z16 = false;
        if (dVar == null || dVar == cVarH.u()) {
            z15 = false;
        } else {
            if (arrayList != null) {
                arrayList.remove(cVarH);
            }
            cVarH = l20.c.b(cVarH, null, null, null, Integer.valueOf(dVar.getF109040a()), null, null, null, null, null, null, 0, 1048559);
            if (arrayList != null) {
                arrayList.add(cVarH);
            }
            this.f32647f = cVarH;
            z15 = true;
        }
        l20.c cVar = cVarH;
        if (str.equals(str2)) {
            z16 = z15;
        } else {
            this.f32650i = cVar.g0();
            if (arrayList != null) {
                arrayList.remove(cVar);
            }
            hl.a.c cVar2 = hl.a.c.f84256b;
            hl.a aVar3 = this.f32645d;
            if (p005kotlin.jvm.internal.s.g(aVar3, cVar2)) {
                contactInfoPk = null;
            } else {
                if (!(aVar3 instanceof hl.a.b)) {
                    u0.r();
                    return;
                }
                contactInfoPk = cVar.getContactInfoPk();
            }
            l20.c cVarB = l20.c.b(cVar, contactInfoPk, str2, Integer.valueOf(l20.m.NONE.f109026a), null, null, null, bool, str3, null, Boolean.FALSE, 0, 980724);
            if (arrayList != null) {
                arrayList.add(cVarB);
            }
            this.f32647f = cVarB;
        }
        l20.a aVar4 = this.f32646e;
        if (z14) {
            aVarG = l20.a.g(aVar4, null, null, null, null, null, null, arrayList != null ? h0.b1(arrayList) : null, null, null, 8127);
        } else {
            aVarG = l20.a.g(aVar4, null, null, null, null, null, null, null, arrayList != null ? h0.b1(arrayList) : null, null, 8063);
        }
        this.f32646e = aVarG;
        w9.a aVarA = v1.a(this);
        x53.c cVar3 = s0.f129406a;
        ge1.b.T(aVarA, x53.b.f189152a, null, new j20.m(this, z16, null), 2);
    }

    public final void G4(p0 p0Var) {
        Object objB4;
        p0Var.getClass();
        Boolean valid = p0Var.getValid();
        Boolean bool = Boolean.TRUE;
        boolean z14 = p005kotlin.jvm.internal.s.g(valid, bool) && p005kotlin.jvm.internal.s.g(p0Var.getCanReceiveText(), bool);
        l20.c cVar = this.f32647f;
        if (cVar != null) {
            l20.c cVarB = l20.c.b(cVar, null, p0Var.getPhoneNumber(), null, null, null, null, Boolean.valueOf(z14), p0Var.getPhoneUuid(), null, null, 0, 1046269);
            if (!cVar.equals(cVarB)) {
                L4(cVar, cVarB, true);
                l20.a aVar = this.f32646e;
                w9.a aVarA = v1.a(this);
                x53.c cVar2 = s0.f129406a;
                ge1.b.T(aVarA, x53.b.f189152a, null, new n(this, aVar, null), 2);
            }
            if (z14) {
                objB4 = B4();
            } else {
                this.I.j(EmergencyContactSendRequestActivity.b.INVALID_PHONE_NUMBER);
                a2 a2Var = a2.SAFETY_FEATURES;
                String strM = j.m("[onPhoneNumberValidated] Phone number ", p0Var.getPhoneNumber(), " was invalid from API!");
                i2.f36769a.getClass();
                i2.a.f(a2Var, "EmergencyContactViewModel", strM);
                objB4 = Unit.INSTANCE;
            }
            if (objB4 != null) {
                return;
            }
        }
        a2 a2Var2 = a2.SAFETY_FEATURES;
        i2.f36769a.getClass();
        i2.a.f(a2Var2, "EmergencyContactViewModel", "[onPhoneNumberValidated] contactInfoDTO is null; this should not have been called!");
        Unit unit = Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x004d  */
    /* JADX WARN: Code duplicated, block: B:24:0x0055  */
    /* JADX WARN: Code duplicated, block: B:27:0x005f  */
    /* JADX WARN: Code duplicated, block: B:29:0x006e  */
    /* JADX WARN: Code duplicated, block: B:30:0x0073  */
    /* JADX WARN: Code duplicated, block: B:37:0x0080  */
    /* JADX WARN: Code duplicated, block: B:38:0x0085  */
    /* JADX WARN: Code duplicated, block: B:53:0x007b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:? A[RETURN, SYNTHETIC] */
    public final void H4(boolean z14, l20.l lVar) {
        List<l20.c> listR;
        Long contactInfoPk;
        Iterator<T> it;
        Object next;
        l20.c cVar;
        String str;
        l20.c cVar2;
        String str2;
        Object next2;
        String str3;
        l20.c cVar3;
        lVar.getClass();
        this.f32649h = z14;
        N4(lVar);
        if (this.f32659r != l20.l.LIVETRACK) {
            J4();
            Unit unit = Unit.INSTANCE;
            return;
        }
        List<l20.c> listZ = this.f32646e.z();
        if (listZ != null) {
            Iterator<T> it3 = listZ.iterator();
            do {
                if (!it3.hasNext()) {
                    next2 = null;
                    break;
                } else {
                    next2 = it3.next();
                    str3 = ((l20.c) next2).getCom.google.firebase.analytics.FirebaseAnalytics.Param.CONTENT java.lang.String();
                    cVar3 = this.f32647f;
                }
            } while (!p005kotlin.jvm.internal.s.g(str3, cVar3 != null ? cVar3.getCom.google.firebase.analytics.FirebaseAnalytics.Param.CONTENT java.lang.String() : null));
            l20.c cVar4 = (l20.c) next2;
            if (cVar4 == null || (contactInfoPk = cVar4.getContactInfoPk()) == null) {
                listR = this.f32646e.r();
                if (listR != null) {
                    it = listR.iterator();
                    do {
                        if (it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                        str = ((l20.c) next).getCom.google.firebase.analytics.FirebaseAnalytics.Param.CONTENT java.lang.String();
                        cVar2 = this.f32647f;
                        if (cVar2 != null) {
                            str2 = cVar2.getCom.google.firebase.analytics.FirebaseAnalytics.Param.CONTENT java.lang.String();
                        } else {
                            str2 = null;
                        }
                    } while (!p005kotlin.jvm.internal.s.g(str, str2));
                    cVar = (l20.c) next;
                    if (cVar != null) {
                        contactInfoPk = cVar.getContactInfoPk();
                    } else {
                        contactInfoPk = null;
                    }
                } else {
                    contactInfoPk = null;
                }
                if (contactInfoPk == null) {
                    return;
                }
            }
        } else {
            listR = this.f32646e.r();
            if (listR != null) {
                it = listR.iterator();
                do {
                    if (it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    str = ((l20.c) next).getCom.google.firebase.analytics.FirebaseAnalytics.Param.CONTENT java.lang.String();
                    cVar2 = this.f32647f;
                    if (cVar2 != null) {
                        str2 = cVar2.getCom.google.firebase.analytics.FirebaseAnalytics.Param.CONTENT java.lang.String();
                    } else {
                        str2 = null;
                    }
                } while (!p005kotlin.jvm.internal.s.g(str, str2));
                cVar = (l20.c) next;
                if (cVar != null) {
                    contactInfoPk = cVar.getContactInfoPk();
                } else {
                    contactInfoPk = null;
                }
            } else {
                contactInfoPk = null;
            }
            if (contactInfoPk == null) {
                return;
            }
        }
        long jLongValue = contactInfoPk.longValue();
        if (this.f32658q) {
            ge1.b.T(v1.a(this), null, null, new b(jLongValue, null), 3);
        } else {
            ge1.b.T(v1.a(this), null, null, new c(jLongValue, null), 3);
        }
    }

    public final void I4(l20.c cVar) {
        if ((cVar != null && cVar.F()) || this.f32650i) {
            l20.l lVar = l20.l.EMERGENCY_CONTACT;
            Boolean bool = Boolean.FALSE;
            this.f32660t = x.m(new p(lVar, bool), new p(l20.l.LIVETRACK, bool));
        }
        if (cVar != null) {
            M4(cVar, true ^ cVar.equals(this.f32647f));
        }
        this.E.j("EmergencyContactConfirmFragment");
    }

    public final void J4() {
        if (!this.f32658q) {
            this.A.j(Boolean.TRUE);
            return;
        }
        if (this.f32659r != l20.l.LIVETRACK) {
            K4();
            return;
        }
        List<l20.c> listR = this.f32646e.r();
        l20.c cVar = null;
        Object obj = null;
        if (listR != null) {
            for (Object obj2 : listR) {
                String str = ((l20.c) obj2).getCom.google.firebase.analytics.FirebaseAnalytics.Param.CONTENT java.lang.String();
                l20.c cVar2 = this.f32647f;
                if (p005kotlin.jvm.internal.s.g(str, cVar2 != null ? cVar2.getCom.google.firebase.analytics.FirebaseAnalytics.Param.CONTENT java.lang.String() : null)) {
                    obj = obj2;
                    break;
                }
            }
            cVar = (l20.c) obj;
        }
        if (cVar != null) {
            A4(cVar);
        }
    }

    public final void K4() {
        String str;
        if (this.f32647f == null || (str = this.f32655n) == null) {
            a2 a2Var = a2.SAFETY_FEATURES;
            i2.f36769a.getClass();
            i2.a.f(a2Var, "EmergencyContactViewModel", "[setEmergencyContactAndClose] Error! Contact method does not have initialization token!");
            this.I.j(EmergencyContactSendRequestActivity.b.UNKNOWN);
            Unit unit = Unit.INSTANCE;
            return;
        }
        Object value = this.f32654m.getValue();
        value.getClass();
        String strD = hb2.h.d((Locale) value);
        if (this.f32658q) {
            w9.a aVarA = v1.a(this);
            x53.c cVar = s0.f129406a;
            ge1.b.T(aVarA, x53.b.f189152a, null, new C0537d(str, strD, null), 2);
        } else {
            w9.a aVarA2 = v1.a(this);
            x53.c cVar2 = s0.f129406a;
            ge1.b.T(aVarA2, x53.b.f189152a, null, new e(str, null), 2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    public final void L4(final l20.c cVar, final l20.c cVar2, boolean z14) {
        ArrayList arrayList;
        ArrayList arrayList2;
        boolean z15 = this.f32658q;
        l20.a aVar = this.f32646e;
        Integer numValueOf = null;
        if (z15) {
            List<l20.c> listR = aVar.r();
            if (listR != null) {
                arrayList = new ArrayList(listR);
                arrayList2 = arrayList;
            } else {
                arrayList2 = null;
            }
        } else {
            List<l20.c> listZ = aVar.z();
            if (listZ != null) {
                arrayList = new ArrayList(listZ);
                arrayList2 = arrayList;
            } else {
                arrayList2 = null;
            }
        }
        if (arrayList2 != null) {
            final int i14 = 0;
            numValueOf = Integer.valueOf(zf.b.o(new e23.l() { // from class: j20.j
                @Override // e23.l
                public final Object invoke(Object obj) {
                    boolean zG;
                    int i15 = i14;
                    l20.c cVar3 = cVar2;
                    l20.c cVar4 = (l20.c) obj;
                    switch (i15) {
                        case 0:
                            int i16 = com.garmin.android.apps.connectmobile.contacts.emergency.d.f32641k0;
                            cVar4.getClass();
                            zG = p005kotlin.jvm.internal.s.g(cVar4.getContactInfoPk(), cVar3.getContactInfoPk());
                            break;
                        default:
                            int i17 = com.garmin.android.apps.connectmobile.contacts.emergency.d.f32641k0;
                            cVar4.getClass();
                            zG = p005kotlin.jvm.internal.s.g(cVar4.getContactInfoPk(), cVar3.getContactInfoPk());
                            break;
                    }
                    return Boolean.valueOf(zG);
                }
            }, arrayList2));
        }
        if (numValueOf == null || numValueOf.intValue() == -1) {
            a2 a2Var = a2.SAFETY_FEATURES;
            i2.f36769a.getClass();
            i2.a.f(a2Var, "EmergencyContactViewModel", "[updateAndReplaceContactMethod] Error! contactMethodList does not have the right contact method to update!");
            return;
        }
        final int i15 = 1;
        d0.B(new e23.l() { // from class: j20.j
            @Override // e23.l
            public final Object invoke(Object obj) {
                boolean zG;
                int i16 = i15;
                l20.c cVar3 = cVar;
                l20.c cVar4 = (l20.c) obj;
                switch (i16) {
                    case 0:
                        int i17 = com.garmin.android.apps.connectmobile.contacts.emergency.d.f32641k0;
                        cVar4.getClass();
                        zG = p005kotlin.jvm.internal.s.g(cVar4.getContactInfoPk(), cVar3.getContactInfoPk());
                        break;
                    default:
                        int i18 = com.garmin.android.apps.connectmobile.contacts.emergency.d.f32641k0;
                        cVar4.getClass();
                        zG = p005kotlin.jvm.internal.s.g(cVar4.getContactInfoPk(), cVar3.getContactInfoPk());
                        break;
                }
                return Boolean.valueOf(zG);
            }
        }, arrayList2);
        arrayList2.add(numValueOf.intValue(), cVar2);
        this.f32647f = cVar2;
        boolean z16 = this.f32658q;
        l20.a aVar2 = this.f32646e;
        this.f32646e = z16 ? l20.a.g(aVar2, null, null, null, null, null, null, arrayList2, null, null, 8127) : l20.a.g(aVar2, null, null, null, null, null, null, null, arrayList2, null, 8063);
        M4(cVar2, z14);
    }

    public final void M4(l20.c cVar, boolean z14) {
        cVar.getClass();
        ArrayList arrayList = null;
        this.f32655n = null;
        this.f32647f = cVar;
        List<l20.c> listR = this.f32646e.r();
        if (listR != null) {
            arrayList = new ArrayList();
            for (Object obj : listR) {
                if (p005kotlin.jvm.internal.s.g(((l20.c) obj).getCom.google.firebase.analytics.FirebaseAnalytics.Param.CONTENT java.lang.String(), cVar.getCom.google.firebase.analytics.FirebaseAnalytics.Param.CONTENT java.lang.String())) {
                    arrayList.add(obj);
                }
            }
        }
        this.f32658q = true ^ (arrayList == null || arrayList.isEmpty());
        if (z14) {
            g3.a aVar = g3.f35298f;
            u uVar = new u(this.f32646e, this.f32647f, Boolean.FALSE);
            aVar.getClass();
            this.f32652k.j(g3.a.d(uVar));
        }
    }

    public final void N4(l20.l lVar) {
        this.f32659r = lVar;
        this.T = (z) KoinJavaComponent.inject$default(z.class, null, new f2(lVar, 17), 2, null).getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void O4() {
        if (this.f32647f == null) {
            i2.a aVar = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar.getClass();
            i2.a.f(a2Var, "EmergencyContactViewModel", "updateSmsRequestSendMultiplePhoneList: contactInfoDTO is null");
            return;
        }
        ArrayList arrayList = this.f32661v;
        int size = arrayList.size();
        for (int i14 = 0; i14 < size; i14++) {
            String str = ((l20.c) ((p) arrayList.get(i14)).f128594a).getCom.google.firebase.analytics.FirebaseAnalytics.Param.CONTENT java.lang.String();
            l20.c cVar = this.f32647f;
            if (p005kotlin.jvm.internal.s.g(str, cVar != null ? cVar.getCom.google.firebase.analytics.FirebaseAnalytics.Param.CONTENT java.lang.String() : null)) {
                l20.c cVar2 = this.f32647f;
                cVar2.getClass();
                arrayList.set(i14, new p(cVar2, Boolean.TRUE));
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0039  */
    /* JADX WARN: Code duplicated, block: B:21:0x0041  */
    /* JADX WARN: Code duplicated, block: B:24:0x004b  */
    /* JADX WARN: Code duplicated, block: B:26:0x005a  */
    /* JADX WARN: Code duplicated, block: B:27:0x005f  */
    /* JADX WARN: Code duplicated, block: B:33:0x006b  */
    /* JADX WARN: Code duplicated, block: B:66:0x0067 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:? A[RETURN, SYNTHETIC] */
    public final void P4() {
        List<l20.c> listR;
        l20.c cVar;
        Iterator<T> it;
        Object next;
        String str;
        l20.c cVar2;
        String str2;
        Object next2;
        String str3;
        l20.c cVar3;
        List<l20.c> listZ = this.f32646e.z();
        if (listZ != null) {
            Iterator<T> it3 = listZ.iterator();
            do {
                if (!it3.hasNext()) {
                    next2 = null;
                    break;
                } else {
                    next2 = it3.next();
                    str3 = ((l20.c) next2).getCom.google.firebase.analytics.FirebaseAnalytics.Param.CONTENT java.lang.String();
                    cVar3 = this.f32647f;
                }
            } while (!p005kotlin.jvm.internal.s.g(str3, cVar3 != null ? cVar3.getCom.google.firebase.analytics.FirebaseAnalytics.Param.CONTENT java.lang.String() : null));
            cVar = (l20.c) next2;
            if (cVar == null) {
                listR = this.f32646e.r();
                if (listR != null) {
                    it = listR.iterator();
                    do {
                        if (it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                        str = ((l20.c) next).getCom.google.firebase.analytics.FirebaseAnalytics.Param.CONTENT java.lang.String();
                        cVar2 = this.f32647f;
                        if (cVar2 != null) {
                            str2 = cVar2.getCom.google.firebase.analytics.FirebaseAnalytics.Param.CONTENT java.lang.String();
                        } else {
                            str2 = null;
                        }
                    } while (!p005kotlin.jvm.internal.s.g(str, str2));
                    cVar = (l20.c) next;
                } else {
                    cVar = null;
                }
                if (cVar == null) {
                    return;
                }
            }
        } else {
            listR = this.f32646e.r();
            if (listR != null) {
                it = listR.iterator();
                do {
                    if (it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    str = ((l20.c) next).getCom.google.firebase.analytics.FirebaseAnalytics.Param.CONTENT java.lang.String();
                    cVar2 = this.f32647f;
                    if (cVar2 != null) {
                        str2 = cVar2.getCom.google.firebase.analytics.FirebaseAnalytics.Param.CONTENT java.lang.String();
                    } else {
                        str2 = null;
                    }
                } while (!p005kotlin.jvm.internal.s.g(str, str2));
                cVar = (l20.c) next;
            } else {
                cVar = null;
            }
            if (cVar == null) {
                return;
            }
        }
        l20.c cVar4 = cVar;
        if (cVar4.getCom.google.firebase.analytics.FirebaseAnalytics.Param.CONTENT java.lang.String() != null) {
            boolean z14 = this.f32658q;
            y0<EmergencyContactSendRequestActivity.b> y0Var = this.I;
            if (z14) {
                L4(cVar4, l20.c.b(cVar4, null, null, null, null, null, null, Boolean.valueOf(gl1.d.J(cVar4)), null, null, null, 0, 1048319), true);
                if (gl1.d.J(cVar4)) {
                    B4();
                    return;
                }
                y0Var.j(EmergencyContactSendRequestActivity.b.UNKNOWN);
                a2 a2Var = a2.SAFETY_FEATURES;
                String strM = j.m("[validateContactMethod] Email ", cVar4.getCom.google.firebase.analytics.FirebaseAnalytics.Param.CONTENT java.lang.String(), " was invalid!");
                i2.f36769a.getClass();
                i2.a.f(a2Var, "EmergencyContactViewModel", strM);
                return;
            }
            if (!com.garmin.android.apps.connectmobile.contacts.b.e()) {
                boolean zK = gl1.d.K(cVar4, (e0) this.Y.getValue());
                G4(new p0(cVar4.getCom.google.firebase.analytics.FirebaseAnalytics.Param.CONTENT java.lang.String(), cVar4.getPhoneUUID(), null, null, Boolean.valueOf(zK), Boolean.valueOf(zK), null, 76, null));
                return;
            }
            if (cVar4.getIsValid() == null || cVar4.getPhoneUUID() == null) {
                String str4 = cVar4.getCom.google.firebase.analytics.FirebaseAnalytics.Param.CONTENT java.lang.String();
                str4.getClass();
                l20.a aVar = this.f32646e;
                aVar.getClass();
                ge1.b.T(v1.a(this), null, null, new q(this, str4, aVar, null), 3);
                return;
            }
            if (p005kotlin.jvm.internal.s.g(cVar4.getIsValid(), Boolean.TRUE)) {
                B4();
                return;
            }
            y0Var.j(EmergencyContactSendRequestActivity.b.INVALID_PHONE_NUMBER);
            a2 a2Var2 = a2.SAFETY_FEATURES;
            String strM2 = j.m("[validateContactMethod] Phone number ", cVar4.getCom.google.firebase.analytics.FirebaseAnalytics.Param.CONTENT java.lang.String(), " was invalid!");
            i2.f36769a.getClass();
            i2.a.b(a2Var2, "EmergencyContactViewModel", strM2);
        }
    }

    public final void Q4() {
        l20.c cVar = this.f32647f;
        if (cVar == null) {
            return;
        }
        if (p005kotlin.jvm.internal.s.g(cVar.getIsValid(), Boolean.TRUE)) {
            B4();
        } else {
            P4();
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/contacts/emergency/d$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-contacts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ d(l20.a aVar, ArrayList arrayList, l20.c cVar, boolean z14, boolean z15, boolean z16, hl.a aVar2, int i14, p005kotlin.jvm.internal.j jVar) {
        this(aVar, (i14 & 2) != 0 ? null : arrayList, (i14 & 4) != 0 ? null : cVar, (i14 & 8) != 0 ? false : z14, (i14 & 16) != 0 ? false : z15, (i14 & 32) != 0 ? false : z16, (i14 & 64) != 0 ? hl.a.c.f84256b : aVar2);
    }
}

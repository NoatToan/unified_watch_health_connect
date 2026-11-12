package zf0;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import org.apache.commons.lang3.StringUtils;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.events.RaceAndEventBaseViewModel$updateEventPrioritySelection$1", f = "RaceAndEventBaseViewModel.kt", l = {444, 445, 451, 473, 476}, m = "invokeSuspend", v = 2)
public final class x0 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public o53.j0 f204533a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public v2 f204534b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f204535c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f204536d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fg0.k f204537e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Long f204538f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ j0 f204539g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ fg0.k f204540h;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.events.RaceAndEventBaseViewModel$updateEventPrioritySelection$1$replaceEventUpdateResponse$1", f = "RaceAndEventBaseViewModel.kt", l = {443}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super v2<? extends Unit>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f204541a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ j0 f204542b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ fg0.k f204543c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(j0 j0Var, fg0.k kVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f204542b = j0Var;
            this.f204543c = kVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f204542b, this.f204543c, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super v2<? extends Unit>> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f204541a;
            if (i14 == 0) {
                o13.r.b(obj);
                this.f204541a = 1;
                Object objV4 = this.f204542b.V4(this.f204543c, this);
                return objV4 == aVar ? aVar : objV4;
            }
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.events.RaceAndEventBaseViewModel$updateEventPrioritySelection$1$selfEventUpdateResponse$1", f = "RaceAndEventBaseViewModel.kt", l = {442}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements e23.p<o53.b0, t13.d<? super v2<? extends Unit>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f204544a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ j0 f204545b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ fg0.k f204546c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(j0 j0Var, fg0.k kVar, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f204545b = j0Var;
            this.f204546c = kVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new b(this.f204545b, this.f204546c, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super v2<? extends Unit>> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f204544a;
            if (i14 == 0) {
                o13.r.b(obj);
                this.f204544a = 1;
                Object objV4 = this.f204545b.V4(this.f204546c, this);
                return objV4 == aVar ? aVar : objV4;
            }
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(fg0.k kVar, Long l14, j0 j0Var, fg0.k kVar2, t13.d<? super x0> dVar) {
        super(2, dVar);
        this.f204537e = kVar;
        this.f204538f = l14;
        this.f204539g = j0Var;
        this.f204540h = kVar2;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        x0 x0Var = new x0(this.f204537e, this.f204538f, this.f204539g, this.f204540h, dVar);
        x0Var.f204536d = obj;
        return x0Var;
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((x0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x008e A[PHI: r3 r6
      0x008e: PHI (r3v6 java.lang.Object) = (r3v5 java.lang.Object), (r3v24 java.lang.Object) binds: [B:23:0x008a, B:15:0x0044] A[DONT_GENERATE, DONT_INLINE]
      0x008e: PHI (r6v6 com.garmin.android.apps.connectmobile.v2) = (r6v5 com.garmin.android.apps.connectmobile.v2), (r6v13 com.garmin.android.apps.connectmobile.v2) binds: [B:23:0x008a, B:15:0x0044] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:27:0x0094  */
    /* JADX WARN: Code duplicated, block: B:41:0x011c  */
    /* JADX WARN: Code duplicated, block: B:47:0x0166 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:48:0x0168  */
    /* JADX WARN: Code duplicated, block: B:58:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:59:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:61:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:64:0x0225  */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00b6, code lost:
    
        if (r1 == r2) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0180, code lost:
    
        if (r1 == r2) goto L50;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:41:0x011c, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:61:0x01e7, please report this as an issue */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object objV4;
        o53.j0 j0VarJ;
        Object objC;
        v2 v2Var;
        Object objAwait;
        v2 v2Var2;
        Object objJ;
        v2 v2Var3;
        Object objJ2;
        o53.b0 b0Var = (o53.b0) this.f204536d;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f204535c;
        fg0.k kVar = this.f204540h;
        Long l14 = this.f204538f;
        j0 j0Var = this.f204539g;
        if (i14 == 0) {
            o13.r.b(obj);
            fg0.k kVar2 = this.f204537e;
            if (kVar2 != null) {
                o53.j0 j0VarJ2 = ge1.b.j(b0Var, null, null, new b(j0Var, kVar, null), 3);
                j0VarJ = ge1.b.j(b0Var, null, null, new a(j0Var, kVar2, null), 3);
                this.f204536d = b0Var;
                this.f204533a = j0VarJ;
                this.f204535c = 1;
                objC = j0VarJ2.C(this);
                if (objC != aVar) {
                    v2Var = (v2) objC;
                    this.f204536d = b0Var;
                    this.f204533a = null;
                    this.f204534b = v2Var;
                    this.f204535c = 2;
                    objAwait = j0VarJ.await(this);
                    if (objAwait != aVar) {
                        v2Var2 = (v2) objAwait;
                        if (v2Var instanceof v2.b) {
                            String str = "failed to update event customization: " + (v2Var instanceof v2.a) + " || " + (v2Var2 instanceof v2.a);
                            i2.a aVar2 = i2.f36769a;
                            a2 a2Var = a2.GENERAL;
                            aVar2.getClass();
                            i2.a.f(a2Var, "EventBaseViewModel", str);
                            j0Var.O4().j(g3.a.a(g3.f35298f, null, null, null, null, 15));
                        } else {
                            String str2 = "failed to update event customization: " + (v2Var instanceof v2.a) + " || " + (v2Var2 instanceof v2.a);
                            i2.a aVar3 = i2.f36769a;
                            a2 a2Var2 = a2.GENERAL;
                            aVar3.getClass();
                            i2.a.f(a2Var2, "EventBaseViewModel", str2);
                            j0Var.O4().j(g3.a.a(g3.f35298f, null, null, null, null, 15));
                        }
                    }
                }
            } else {
                this.f204536d = b0Var;
                this.f204535c = 4;
                objV4 = j0Var.V4(kVar, this);
                if (objV4 != aVar) {
                    v2Var3 = (v2) objV4;
                    if (v2Var3 instanceof v2.b) {
                        if (l14 != null) {
                            ax1.i iVarE4 = j0Var.E4();
                            long jLongValue = l14.longValue();
                            this.f204536d = b0Var;
                            this.f204535c = 5;
                            iVarE4.getClass();
                            objJ2 = com.garmin.android.apps.connectmobile.f0.J(iVarE4, new ax1.j(iVarE4, jLongValue, null), this);
                        } else {
                            j0Var.O4().j(g3.a.e(g3.f35298f));
                        }
                    } else {
                        if (v2Var3 instanceof v2.a) {
                            lc.u0.r();
                            return null;
                        }
                        String str3 = "Failed to update event customization " + kVar.getCom.google.android.exoplayer2.text.ttml.TtmlNode.ATTR_ID java.lang.String() + StringUtils.SPACE + kVar.getEventCustomization();
                        i2.a aVar4 = i2.f36769a;
                        a2 a2Var3 = a2.GENERAL;
                        aVar4.getClass();
                        i2.a.f(a2Var3, "EventBaseViewModel", str3);
                        j0Var.O4().j(g3.a.a(g3.f35298f, null, null, null, null, 15));
                    }
                }
            }
            return aVar;
        }
        if (i14 == 1) {
            j0VarJ = this.f204533a;
            o13.r.b(obj);
            objC = obj;
            v2Var = (v2) objC;
            this.f204536d = b0Var;
            this.f204533a = null;
            this.f204534b = v2Var;
            this.f204535c = 2;
            objAwait = j0VarJ.await(this);
            if (objAwait != aVar) {
                v2Var2 = (v2) objAwait;
                if (v2Var instanceof v2.b) {
                    String str4 = "failed to update event customization: " + (v2Var instanceof v2.a) + " || " + (v2Var2 instanceof v2.a);
                    i2.a aVar5 = i2.f36769a;
                    a2 a2Var4 = a2.GENERAL;
                    aVar5.getClass();
                    i2.a.f(a2Var4, "EventBaseViewModel", str4);
                    j0Var.O4().j(g3.a.a(g3.f35298f, null, null, null, null, 15));
                } else {
                    String str5 = "failed to update event customization: " + (v2Var instanceof v2.a) + " || " + (v2Var2 instanceof v2.a);
                    i2.a aVar6 = i2.f36769a;
                    a2 a2Var5 = a2.GENERAL;
                    aVar6.getClass();
                    i2.a.f(a2Var5, "EventBaseViewModel", str5);
                    j0Var.O4().j(g3.a.a(g3.f35298f, null, null, null, null, 15));
                }
            }
            return aVar;
        }
        if (i14 == 2) {
            v2 v2Var4 = this.f204534b;
            o13.r.b(obj);
            v2Var = v2Var4;
            objAwait = obj;
            v2Var2 = (v2) objAwait;
            if ((v2Var instanceof v2.b) || !(v2Var2 instanceof v2.b)) {
                String str6 = "failed to update event customization: " + (v2Var instanceof v2.a) + " || " + (v2Var2 instanceof v2.a);
                i2.a aVar7 = i2.f36769a;
                a2 a2Var6 = a2.GENERAL;
                aVar7.getClass();
                i2.a.f(a2Var6, "EventBaseViewModel", str6);
                j0Var.O4().j(g3.a.a(g3.f35298f, null, null, null, null, 15));
            } else if (l14 != null) {
                ax1.i iVarE5 = j0Var.E4();
                long jLongValue2 = l14.longValue();
                this.f204536d = b0Var;
                this.f204533a = null;
                this.f204534b = null;
                this.f204535c = 3;
                iVarE5.getClass();
                objJ = com.garmin.android.apps.connectmobile.f0.J(iVarE5, new ax1.j(iVarE5, jLongValue2, null), this);
            } else {
                j0Var.O4().j(g3.a.e(g3.f35298f));
            }
        } else if (i14 != 3) {
            if (i14 == 4) {
                o13.r.b(obj);
                objV4 = obj;
                v2Var3 = (v2) objV4;
                if (v2Var3 instanceof v2.b) {
                    if (l14 != null) {
                        ax1.i iVarE6 = j0Var.E4();
                        long jLongValue3 = l14.longValue();
                        this.f204536d = b0Var;
                        this.f204535c = 5;
                        iVarE6.getClass();
                        objJ2 = com.garmin.android.apps.connectmobile.f0.J(iVarE6, new ax1.j(iVarE6, jLongValue3, null), this);
                    } else {
                        j0Var.O4().j(g3.a.e(g3.f35298f));
                    }
                } else {
                    if (v2Var3 instanceof v2.a) {
                        lc.u0.r();
                        return null;
                    }
                    String str7 = "Failed to update event customization " + kVar.getCom.google.android.exoplayer2.text.ttml.TtmlNode.ATTR_ID java.lang.String() + StringUtils.SPACE + kVar.getEventCustomization();
                    i2.a aVar8 = i2.f36769a;
                    a2 a2Var7 = a2.GENERAL;
                    aVar8.getClass();
                    i2.a.f(a2Var7, "EventBaseViewModel", str7);
                    j0Var.O4().j(g3.a.a(g3.f35298f, null, null, null, null, 15));
                }
            } else {
                if (i14 != 5) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
                objJ2 = obj;
            }
            v2 v2Var5 = (v2) objJ2;
            if (v2Var5 instanceof v2.b) {
                j0Var.O4().j(g3.a.e(g3.f35298f));
            } else {
                if (!(v2Var5 instanceof v2.a)) {
                    lc.u0.r();
                    return null;
                }
                String str8 = "Error deleting FBT plan " + l14 + " - " + ((v2.a) v2Var5).f47383a;
                i2.a aVar9 = i2.f36769a;
                a2 a2Var8 = a2.GENERAL;
                aVar9.getClass();
                i2.a.f(a2Var8, "EventBaseViewModel", str8);
                j0Var.O4().j(g3.a.a(g3.f35298f, null, null, null, null, 15));
            }
        } else {
            o13.r.b(obj);
            objJ = obj;
        }
        v2 v2Var6 = (v2) objJ;
        if (v2Var6 instanceof v2.b) {
            j0Var.O4().j(g3.a.e(g3.f35298f));
        } else {
            if (!(v2Var6 instanceof v2.a)) {
                lc.u0.r();
                return null;
            }
            String str9 = "Error deleting FBT plan " + l14 + " - " + ((v2.a) v2Var6).f47383a;
            i2.a aVar10 = i2.f36769a;
            a2 a2Var9 = a2.GENERAL;
            aVar10.getClass();
            i2.a.f(a2Var9, "EventBaseViewModel", str9);
            j0Var.O4().j(g3.a.a(g3.f35298f, null, null, null, null, 15));
        }
        return Unit.INSTANCE;
    }
}

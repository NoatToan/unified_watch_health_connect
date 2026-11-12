package km0;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.garmin.android.apps.connectmobile.connections.groups.services.model.GroupDTO;
import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.v2;
import d53.w;
import e23.p;
import e23.r;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import o53.b0;
import o53.j0;
import o53.s0;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.NoWhenBranchMatchedException;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.m0;
import p005kotlin.jvm.internal.r0;
import p13.h0;
import p13.y;
import r53.p2;
import ym0.q0;
import ym0.u0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.group.create.GroupCreationViewModel$uploadGroup$1", f = "GroupCreationViewModel.kt", l = {243, 276, 277}, m = "invokeSuspend", v = 2)
public final class l extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public km0.b f105387a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public r0 f105388b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Serializable f105389c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public m0 f105390d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public m0 f105391e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public j0 f105392f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f105393g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f105394h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ i f105395i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ r<String, String, Boolean, Boolean, Unit> f105396j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ e23.a<Unit> f105397k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Context f105398l;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.group.create.GroupCreationViewModel$uploadGroup$1$2$1", f = "GroupCreationViewModel.kt", l = {271}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f105399a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ i f105400b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ r0<String> f105401c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ long f105402d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ m0 f105403e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(i iVar, r0<String> r0Var, long j8, m0 m0Var, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f105400b = iVar;
            this.f105401c = r0Var;
            this.f105402d = j8;
            this.f105403e = m0Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f105400b, this.f105401c, this.f105402d, this.f105403e, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f105399a;
            if (i14 == 0) {
                o13.r.b(obj);
                ym0.a aVar2 = this.f105400b.f105335b;
                String str = this.f105401c.f105810a;
                str.getClass();
                wm0.a aVar3 = new wm0.a(null, null, null, null, null, new Long(this.f105402d), null, 95, null);
                this.f105399a = 1;
                aVar2.getClass();
                obj = f0.J(aVar2, new q0(aVar2, str, aVar3, null), this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            if (((v2) obj) instanceof v2.a) {
                this.f105403e.f105804a = true;
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.group.create.GroupCreationViewModel$uploadGroup$1$uploadPhotoJob$1", f = "GroupCreationViewModel.kt", l = {260}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public m0 f105404a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public InputStream f105405b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f105406c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ km0.b f105407d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ Context f105408e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ i f105409f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ r0<String> f105410g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ m0 f105411h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(km0.b bVar, Context context, i iVar, r0<String> r0Var, m0 m0Var, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f105407d = bVar;
            this.f105408e = context;
            this.f105409f = iVar;
            this.f105410g = r0Var;
            this.f105411h = m0Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new b(this.f105407d, this.f105408e, this.f105409f, this.f105410g, this.f105411h, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) throws FileNotFoundException {
            InputStream inputStream;
            Throwable th3;
            m0 m0Var;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f105406c;
            if (i14 == 0) {
                o13.r.b(obj);
                e eVar = this.f105407d.f105298b;
                e.b bVar = eVar instanceof e.b ? (e.b) eVar : null;
                if (bVar == null) {
                    return null;
                }
                i iVar = this.f105409f;
                r0<String> r0Var = this.f105410g;
                m0 m0Var2 = this.f105411h;
                InputStream inputStreamOpenInputStream = this.f105408e.getContentResolver().openInputStream(bVar.f105320b);
                try {
                    Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamOpenInputStream);
                    jm0.e eVar2 = jm0.e.f99565a;
                    bitmapDecodeStream.getClass();
                    eVar2.getClass();
                    ArrayList arrayListA = jm0.e.a(bitmapDecodeStream);
                    ym0.a aVar2 = iVar.f105335b;
                    String str = r0Var.f105810a;
                    str.getClass();
                    this.f105404a = m0Var2;
                    this.f105405b = inputStreamOpenInputStream;
                    this.f105406c = 1;
                    aVar2.getClass();
                    Object objJ = f0.J(aVar2, new u0(aVar2, str, arrayListA, null), this);
                    if (objJ == aVar) {
                        return aVar;
                    }
                    inputStream = inputStreamOpenInputStream;
                    obj = objJ;
                    m0Var = m0Var2;
                } catch (Throwable th4) {
                    inputStream = inputStreamOpenInputStream;
                    th3 = th4;
                    throw th3;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                inputStream = this.f105405b;
                m0Var = this.f105404a;
                try {
                    o13.r.b(obj);
                } catch (Throwable th5) {
                    th3 = th5;
                    try {
                        throw th3;
                    } catch (Throwable th6) {
                        jg.b.l(inputStream, th3);
                        throw th6;
                    }
                }
            }
            if (((v2) obj) instanceof v2.a) {
                m0Var.f105804a = true;
            }
            Unit unit = Unit.INSTANCE;
            jg.b.l(inputStream, null);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public l(i iVar, r<? super String, ? super String, ? super Boolean, ? super Boolean, Unit> rVar, e23.a<Unit> aVar, Context context, t13.d<? super l> dVar) {
        super(2, dVar);
        this.f105395i = iVar;
        this.f105396j = rVar;
        this.f105397k = aVar;
        this.f105398l = context;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        l lVar = new l(this.f105395i, this.f105396j, this.f105397k, this.f105398l, dVar);
        lVar.f105394h = obj;
        return lVar;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((l) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:64:0x0216  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v29, types: [T, java.lang.String] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        i iVar;
        p2 p2Var;
        Object value;
        Object value2;
        km0.b bVar;
        r0 r0Var;
        m0 m0Var;
        Object objJ;
        m0 m0Var2;
        String str;
        j0 j0Var;
        m0 m0Var3;
        r0 r0Var2;
        m0 m0Var4;
        m0 m0Var5;
        b0 b0Var = (b0) this.f105394h;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f105393g;
        boolean z14 = true;
        i iVar2 = this.f105395i;
        try {
            try {
                if (i14 != 0) {
                    if (i14 == 1) {
                        m0 m0Var6 = this.f105390d;
                        m0Var = (m0) this.f105389c;
                        r0Var = this.f105388b;
                        bVar = this.f105387a;
                        o13.r.b(obj);
                        m0Var2 = m0Var6;
                        objJ = obj;
                    } else {
                        if (i14 == 2) {
                            j0Var = this.f105392f;
                            m0 m0Var7 = this.f105391e;
                            m0Var3 = this.f105390d;
                            String str2 = (String) this.f105389c;
                            r0 r0Var3 = this.f105388b;
                            o13.r.b(obj);
                            m0Var2 = m0Var7;
                            iVar = iVar2;
                            str = str2;
                            r0Var2 = r0Var3;
                            this.f105394h = null;
                            this.f105387a = null;
                            this.f105388b = r0Var2;
                            this.f105389c = str;
                            this.f105390d = m0Var3;
                            this.f105391e = m0Var2;
                            this.f105392f = null;
                            this.f105393g = 3;
                            if (j0Var.await(this) != aVar) {
                                m0Var4 = m0Var3;
                                m0Var5 = m0Var2;
                            }
                            return aVar;
                        }
                        if (i14 != 3) {
                            vb.h.z("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        m0Var5 = this.f105391e;
                        m0Var4 = this.f105390d;
                        str = (String) this.f105389c;
                        r0Var2 = this.f105388b;
                        o13.r.b(obj);
                        iVar = iVar2;
                    }
                    r<String, String, Boolean, Boolean, Unit> rVar = this.f105396j;
                    T t7 = r0Var2.f105810a;
                    t7.getClass();
                    str.getClass();
                    rVar.invoke(t7, str, Boolean.valueOf(m0Var4.f105804a), Boolean.valueOf(m0Var5.f105804a));
                    p2Var = iVar.f105339f;
                    do {
                        value = p2Var.getValue();
                    } while (!q6.f.z(((Number) value).intValue() - 1, p2Var, value));
                    return Unit.INSTANCE;
                }
                o13.r.b(obj);
                p2 p2Var2 = iVar2.f105339f;
                do {
                    value2 = p2Var2.getValue();
                } while (!q6.f.z(((Number) value2).intValue() + 1, p2Var2, value2));
                bVar = (km0.b) iVar2.f105338e.f150540a.getValue();
                GroupDTO groupDTO = new GroupDTO();
                String str3 = bVar.f105297a;
                String str4 = bVar.f105307k;
                groupDTO.f31559b = str3;
                e eVar = bVar.f105298b;
                e.a aVar2 = eVar instanceof e.a ? (e.a) eVar : null;
                groupDTO.I = aVar2 != null ? aVar2.f105318b : null;
                groupDTO.f31560c = bVar.f105299c;
                groupDTO.f31561d = String.valueOf(((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).getUserProfilePk());
                groupDTO.f31569l = bVar.f105300d;
                groupDTO.f31571n = bVar.f105301e;
                groupDTO.f31572o = bVar.f105302f;
                groupDTO.f31570m = bVar.f105303g;
                groupDTO.f31568k = bVar.f105305i;
                groupDTO.f31567j = bVar.f105304h;
                ArrayList arrayListD1 = h0.d1(bVar.f105306j);
                if (str4 != null && !w.J(str4)) {
                    groupDTO.f31574q = str4;
                }
                groupDTO.f31573p = arrayListD1;
                ArrayList arrayList = new ArrayList();
                Iterator it = arrayListD1.iterator();
                while (it.hasNext()) {
                    arrayList.addAll(((com.garmin.android.apps.connectmobile.connections.groups.services.model.e) it.next()).a());
                }
                groupDTO.f31577v = arrayList;
                ArrayList arrayList2 = new ArrayList();
                Iterator it3 = arrayListD1.iterator();
                while (it3.hasNext()) {
                    arrayList2.addAll(((com.garmin.android.apps.connectmobile.connections.groups.services.model.e) it3.next()).b());
                }
                groupDTO.D(arrayList2);
                r0Var = new r0();
                m0Var = new m0();
                m0 m0Var8 = new m0();
                ym0.a aVar3 = iVar2.f105335b;
                this.f105394h = b0Var;
                this.f105387a = bVar;
                this.f105388b = r0Var;
                this.f105389c = m0Var;
                this.f105390d = m0Var8;
                this.f105393g = 1;
                aVar3.getClass();
                objJ = f0.J(aVar3, new ym0.e(aVar3, groupDTO, null), this);
                if (objJ != aVar) {
                    m0Var2 = m0Var8;
                }
                return aVar;
                m0 m0Var9 = m0Var;
                km0.b bVar2 = bVar;
                r0 r0Var4 = r0Var;
                v2 v2Var = (v2) objJ;
                if (!(v2Var instanceof v2.b)) {
                    if (v2Var instanceof v2.a) {
                        throw ((v2.a) v2Var).f47383a;
                    }
                    throw new NoWhenBranchMatchedException();
                }
                GroupDTO groupDTO2 = (GroupDTO) ((v2.b) v2Var).f47386a;
                r0Var4.f105810a = groupDTO2.f31558a;
                str = groupDTO2.f31559b;
                x53.c cVar = s0.f129406a;
                r0 r0Var5 = r0Var4;
                j0 j0VarJ = ge1.b.j(b0Var, x53.b.f189152a, null, new b(bVar2, this.f105398l, this.f105395i, r0Var5, m0Var9, null), 2);
                Iterable iterable = (Iterable) iVar2.f105342i.getValue();
                i iVar3 = this.f105395i;
                ArrayList arrayList3 = new ArrayList(y.r(iterable, 10));
                Iterator it4 = iterable.iterator();
                while (it4.hasNext()) {
                    j0 j0Var2 = j0VarJ;
                    boolean z15 = z14;
                    ArrayList arrayList4 = arrayList3;
                    m0 m0Var10 = m0Var9;
                    i iVar4 = iVar2;
                    i iVar5 = iVar3;
                    r0 r0Var6 = r0Var5;
                    arrayList4.add(ge1.b.j(b0Var, x53.b.f189152a, null, new a(iVar5, r0Var6, ((Number) it4.next()).longValue(), m0Var2, null), 2));
                    m0Var9 = m0Var10;
                    arrayList3 = arrayList4;
                    r0Var5 = r0Var6;
                    iVar2 = iVar4;
                    z14 = z15;
                    j0VarJ = j0Var2;
                    iVar3 = iVar5;
                }
                iVar = iVar2;
                j0 j0Var3 = j0VarJ;
                r0 r0Var7 = r0Var5;
                m0 m0Var11 = m0Var9;
                this.f105394h = null;
                this.f105387a = null;
                this.f105388b = r0Var7;
                this.f105389c = str;
                this.f105390d = m0Var11;
                this.f105391e = m0Var2;
                this.f105392f = j0Var3;
                this.f105393g = 2;
                if (g8.i.o(arrayList3, this) != aVar) {
                    j0Var = j0Var3;
                    m0Var3 = m0Var11;
                    r0Var2 = r0Var7;
                    this.f105394h = null;
                    this.f105387a = null;
                    this.f105388b = r0Var2;
                    this.f105389c = str;
                    this.f105390d = m0Var3;
                    this.f105391e = m0Var2;
                    this.f105392f = null;
                    this.f105393g = 3;
                    if (j0Var.await(this) != aVar) {
                        m0Var4 = m0Var3;
                        m0Var5 = m0Var2;
                        r<String, String, Boolean, Boolean, Unit> rVar2 = this.f105396j;
                        T t14 = r0Var2.f105810a;
                        t14.getClass();
                        str.getClass();
                        rVar2.invoke(t14, str, Boolean.valueOf(m0Var4.f105804a), Boolean.valueOf(m0Var5.f105804a));
                        p2Var = iVar.f105339f;
                        do {
                            value = p2Var.getValue();
                        } while (!q6.f.z(((Number) value).intValue() - 1, p2Var, value));
                        return Unit.INSTANCE;
                    }
                }
                return aVar;
            } catch (Exception unused) {
                iVar = iVar2;
                this.f105397k.invoke();
            }
        } catch (Exception unused2) {
            this.f105397k.invoke();
        }
    }
}

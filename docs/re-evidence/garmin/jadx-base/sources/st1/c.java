package st1;

import com.garmin.android.apps.connectmobile.v2;
import fg0.j;
import fg0.k;
import java.util.List;
import o13.r;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.b2;
import r53.p2;
import r53.q2;
import r53.s;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\nB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lst1/c;", "", "Luw1/b;", "trainingPlansRepo", "Lgu1/b;", "atpRepo", "Lzf0/d;", "eventRepo", "<init>", "(Luw1/b;Lgu1/b;Lzf0/d;)V", "a", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uw1.b f160869a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gu1.b f160870b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final zf0.d f160871c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p2 f160872d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p2 f160873e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final b2 f160874f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final b2 f160875g;

    static {
        new a(null);
    }

    public c(uw1.b bVar, gu1.b bVar2, zf0.d dVar) {
        bVar.getClass();
        bVar2.getClass();
        dVar.getClass();
        this.f160869a = bVar;
        this.f160870b = bVar2;
        this.f160871c = dVar;
        p2 p2VarA = q2.a(null);
        this.f160872d = p2VarA;
        p2 p2VarA2 = q2.a(null);
        this.f160873e = p2VarA2;
        this.f160874f = s.d(p2VarA);
        this.f160875g = s.d(p2VarA2);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x006f  */
    /* JADX WARN: Code duplicated, block: B:35:0x007c  */
    /* JADX WARN: Code duplicated, block: B:38:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:41:0x00be  */
    /* JADX WARN: Code duplicated, block: B:43:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:44:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:47:0x00e9 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:48:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:50:0x00ee A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:51:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0050, code lost:
    
        if (r0 == r2) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0063, code lost:
    
        if (r0 == r2) goto L46;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(c cVar, Long l14, String str, v13.c cVar2) {
        d dVar;
        v2 v2Var;
        k kVarD;
        Object aVar;
        zf0.d dVar2 = cVar.f160871c;
        if (cVar2 instanceof d) {
            dVar = (d) cVar2;
            int i14 = dVar.f160878c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                dVar.f160878c = i14 - Integer.MIN_VALUE;
            } else {
                dVar = new d(cVar, cVar2);
            }
        } else {
            dVar = new d(cVar, cVar2);
        }
        Object objD = dVar.f160876a;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = dVar.f160878c;
        if (i15 == 0) {
            r.b(objD);
            if (str != null) {
                dVar.f160878c = 1;
                objD = dVar2.f(str, dVar);
            } else if (l14 != null) {
                long jLongValue = l14.longValue();
                dVar.f160878c = 2;
                objD = dVar2.d(jLongValue, dVar);
            } else {
                v2Var = null;
                if (!(v2Var instanceof v2.b)) {
                    if (v2Var instanceof v2.a) {
                        return v2Var;
                    }
                    return new v2.a(new IllegalStateException(), null, null, 6, null);
                }
                k kVar = (k) ((v2.b) v2Var).f47386a;
                j eventCustomization = kVar.getEventCustomization();
                kVarD = k.d(kVar, null, null, null, null, null, null, eventCustomization != null ? j.b(eventCustomization, null, null, null, null, null, null, 7999) : null, -16777217);
                dVar.f160878c = 3;
                if (!p005kotlin.jvm.internal.s.g(kVarD.getEventOrganizer(), Boolean.TRUE)) {
                    if (kVarD.getShareableEventUuid() != null) {
                        j eventCustomization2 = kVarD.getEventCustomization();
                        String shareableEventUuid = kVarD.getShareableEventUuid();
                        shareableEventUuid.getClass();
                        eventCustomization2.getClass();
                        aVar = dVar2.i(shareableEventUuid, eventCustomization2, dVar);
                    } else {
                        aVar = new v2.a(new IllegalStateException(), null, null, 6, null);
                    }
                } else if (kVarD.getShareableEventUuid() != null) {
                    j eventCustomization3 = kVarD.getEventCustomization();
                    String shareableEventUuid2 = kVarD.getShareableEventUuid();
                    shareableEventUuid2.getClass();
                    eventCustomization3.getClass();
                    aVar = dVar2.i(shareableEventUuid2, eventCustomization3, dVar);
                } else {
                    aVar = new v2.a(new IllegalStateException(), null, null, 6, null);
                }
                if (aVar != aVar2) {
                    return aVar;
                }
            }
        } else if (i15 == 1) {
            r.b(objD);
            v2Var = (v2) objD;
            if (!(v2Var instanceof v2.b)) {
                if (v2Var instanceof v2.a) {
                    return v2Var;
                }
                return new v2.a(new IllegalStateException(), null, null, 6, null);
            }
            k kVar2 = (k) ((v2.b) v2Var).f47386a;
            j eventCustomization4 = kVar2.getEventCustomization();
            kVarD = k.d(kVar2, null, null, null, null, null, null, eventCustomization4 != null ? j.b(eventCustomization4, null, null, null, null, null, null, 7999) : null, -16777217);
            dVar.f160878c = 3;
            if (!p005kotlin.jvm.internal.s.g(kVarD.getEventOrganizer(), Boolean.TRUE)) {
                if (kVarD.getShareableEventUuid() != null) {
                    j eventCustomization5 = kVarD.getEventCustomization();
                    String shareableEventUuid3 = kVarD.getShareableEventUuid();
                    shareableEventUuid3.getClass();
                    eventCustomization5.getClass();
                    aVar = dVar2.i(shareableEventUuid3, eventCustomization5, dVar);
                } else {
                    aVar = new v2.a(new IllegalStateException(), null, null, 6, null);
                }
            } else if (kVarD.getShareableEventUuid() != null) {
                j eventCustomization6 = kVarD.getEventCustomization();
                String shareableEventUuid4 = kVarD.getShareableEventUuid();
                shareableEventUuid4.getClass();
                eventCustomization6.getClass();
                aVar = dVar2.i(shareableEventUuid4, eventCustomization6, dVar);
            } else {
                aVar = new v2.a(new IllegalStateException(), null, null, 6, null);
            }
            if (aVar != aVar2) {
                return aVar;
            }
        } else {
            if (i15 != 2) {
                if (i15 == 3) {
                    r.b(objD);
                    return objD;
                }
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(objD);
            v2Var = (v2) objD;
            if (!(v2Var instanceof v2.b)) {
                if (v2Var instanceof v2.a) {
                    return v2Var;
                }
                return new v2.a(new IllegalStateException(), null, null, 6, null);
            }
            k kVar3 = (k) ((v2.b) v2Var).f47386a;
            j eventCustomization7 = kVar3.getEventCustomization();
            kVarD = k.d(kVar3, null, null, null, null, null, null, eventCustomization7 != null ? j.b(eventCustomization7, null, null, null, null, null, null, 7999) : null, -16777217);
            dVar.f160878c = 3;
            if (!p005kotlin.jvm.internal.s.g(kVarD.getEventOrganizer(), Boolean.TRUE) && kVarD.getCom.google.android.exoplayer2.text.ttml.TtmlNode.ATTR_ID java.lang.String() != null) {
                Long l15 = kVarD.getCom.google.android.exoplayer2.text.ttml.TtmlNode.ATTR_ID java.lang.String();
                l15.getClass();
                aVar = dVar2.h(l15.longValue(), kVarD, dVar);
            } else if (kVarD.getShareableEventUuid() != null) {
                j eventCustomization8 = kVarD.getEventCustomization();
                String shareableEventUuid5 = kVarD.getShareableEventUuid();
                shareableEventUuid5.getClass();
                eventCustomization8.getClass();
                aVar = dVar2.i(shareableEventUuid5, eventCustomization8, dVar);
            } else {
                aVar = new v2.a(new IllegalStateException(), null, null, 6, null);
            }
            if (aVar != aVar2) {
                return aVar;
            }
        }
        return aVar2;
    }

    public final Object b(Long l14, boolean z14, rt1.j jVar, List list, i iVar) throws Throwable {
        x53.c cVar = s0.f129406a;
        Object objE0 = ge1.b.e0(x53.b.f189152a, new g(this, l14, z14, list, jVar, null), iVar);
        return objE0 == u13.a.COROUTINE_SUSPENDED ? objE0 : Unit.INSTANCE;
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lst1/c$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "", "SUCCESS_CODE", "I", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}

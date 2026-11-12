package wi;

import android.util.Log;
import ch.qos.logback.core.CoreConstants;
import com.bumptech.glide.Registry;
import com.bumptech.glide.load.engine.GlideException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.apache.commons.text.StringSubstitutor;

/* JADX INFO: loaded from: classes7.dex */
public class i<DataType, ResourceType, Transcode> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class<DataType> f185359a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<? extends ui.j<DataType, ResourceType>> f185360b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ij.e<ResourceType, Transcode> f185361c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final k7.e<List<Throwable>> f185362d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f185363e;

    public i(Class<DataType> cls, Class<ResourceType> cls2, Class<Transcode> cls3, List<? extends ui.j<DataType, ResourceType>> list, ij.e<ResourceType, Transcode> eVar, k7.e<List<Throwable>> eVar2) {
        this.f185359a = cls;
        this.f185360b = list;
        this.f185361c = eVar;
        this.f185362d = eVar2;
        this.f185363e = "Failed DecodePath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + StringSubstitutor.DEFAULT_VAR_END;
    }

    /* JADX WARN: Multi-variable type inference failed */
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
    public final u a(int i14, int i15, com.bumptech.glide.load.data.e eVar, ui.h hVar, h.b bVar) {
        u uVarA;
        ui.l lVar;
        ui.c cVarA;
        boolean z14;
        boolean z15;
        ui.e dVar;
        k7.e<List<Throwable>> eVar2 = this.f185362d;
        List<Throwable> listAcquire = eVar2.acquire();
        qj.l.c(listAcquire, "Argument must not be null");
        try {
            u<ResourceType> uVarB = b(eVar, i14, i15, hVar, listAcquire);
            eVar2.a(listAcquire);
            h hVar2 = h.this;
            ui.a aVar = bVar.f185340a;
            g<R> gVar = hVar2.f185313a;
            Class<?> cls = uVarB.get().getClass();
            ui.k kVarA = null;
            if (aVar != ui.a.RESOURCE_DISK_CACHE) {
                ui.l lVarE = gVar.e((Class<Z>) cls);
                lVar = lVarE;
                uVarA = lVarE.a(hVar2.f185320h, uVarB, hVar2.f185324l, hVar2.f185325m);
            } else {
                uVarA = uVarB;
                lVar = null;
            }
            if (!uVarB.equals(uVarA)) {
                uVarB.b();
            }
            if (gVar.f185297c.a().f28444d.a(uVarA.a()) != null) {
                kVarA = gVar.f185297c.a().f28444d.a(uVarA.a());
                if (kVarA == null) {
                    throw new Registry.NoResultEncoderAvailableException(uVarA.a());
                }
                cVarA = kVarA.a(hVar2.f185327o);
            } else {
                cVarA = ui.c.NONE;
            }
            ui.k kVar = kVarA;
            ui.e eVar3 = hVar2.f185336z;
            ArrayList arrayListB = gVar.b();
            int size = arrayListB.size();
            int i16 = 0;
            while (true) {
                if (i16 >= size) {
                    z14 = false;
                    break;
                }
                if (((aj.o.a) arrayListB.get(i16)).f3370a.equals(eVar3)) {
                    z14 = true;
                    break;
                }
                i16++;
            }
            Object obj = uVarA;
            if (hVar2.f185326n.d(!z14, aVar, cVarA)) {
                if (kVar == null) {
                    throw new Registry.NoResultEncoderAvailableException(uVarA.get().getClass());
                }
                int i17 = h.a.f185339c[cVarA.ordinal()];
                if (i17 == 1) {
                    z15 = true;
                    dVar = new d(hVar2.f185336z, hVar2.f185321i);
                } else {
                    if (i17 != 2) {
                        com.google.firebase.messaging.l.j(cVarA, "Unknown strategy: ");
                        return null;
                    }
                    z15 = true;
                    dVar = new w(gVar.f185297c.f28477a, hVar2.f185336z, hVar2.f185321i, hVar2.f185324l, hVar2.f185325m, lVar, cls, hVar2.f185327o);
                }
                t<Z> tVar = (t) t.f185444e.acquire();
                tVar.f185448d = 0;
                tVar.f185447c = z15;
                tVar.f185446b = uVarA;
                h.c<?> cVar = hVar2.f185318f;
                cVar.f185342a = dVar;
                cVar.f185343b = kVar;
                cVar.f185344c = tVar;
                obj = tVar;
            }
            return this.f185361c.a(obj, hVar);
        } catch (Throwable th3) {
            eVar2.a(listAcquire);
            throw th3;
        }
    }

    public final u<ResourceType> b(com.bumptech.glide.load.data.e<DataType> eVar, int i14, int i15, ui.h hVar, List<Throwable> list) throws GlideException {
        List<? extends ui.j<DataType, ResourceType>> list2 = this.f185360b;
        int size = list2.size();
        u<ResourceType> uVarA = null;
        for (int i16 = 0; i16 < size; i16++) {
            ui.j<DataType, ResourceType> jVar = list2.get(i16);
            try {
                if (jVar.b(eVar.a(), hVar)) {
                    uVarA = jVar.a(eVar.a(), i14, i15, hVar);
                }
            } catch (IOException | OutOfMemoryError | RuntimeException e4) {
                if (Log.isLoggable("DecodePath", 2)) {
                    Objects.toString(jVar);
                }
                list.add(e4);
            }
            if (uVarA != null) {
                break;
            }
        }
        if (uVarA != null) {
            return uVarA;
        }
        throw new GlideException(this.f185363e, new ArrayList(list));
    }

    public final String toString() {
        return "DecodePath{ dataClass=" + this.f185359a + ", decoders=" + this.f185360b + ", transcoder=" + this.f185361c + CoreConstants.CURLY_RIGHT;
    }
}

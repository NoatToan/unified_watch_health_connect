package wi;

import ch.qos.logback.core.CoreConstants;
import com.bumptech.glide.load.engine.GlideException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.apache.commons.text.StringSubstitutor;

/* JADX INFO: loaded from: classes7.dex */
public class s<Data, ResourceType, Transcode> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k7.e<List<Throwable>> f185441a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<? extends i<Data, ResourceType, Transcode>> f185442b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f185443c;

    public s(Class<Data> cls, Class<ResourceType> cls2, Class<Transcode> cls3, List<i<Data, ResourceType, Transcode>> list, k7.e<List<Throwable>> eVar) {
        this.f185441a = eVar;
        if (list.isEmpty()) {
            vb.h.s("Must not be empty.");
            throw null;
        }
        this.f185442b = list;
        this.f185443c = "Failed LoadPath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + StringSubstitutor.DEFAULT_VAR_END;
    }

    public final u a(int i14, int i15, com.bumptech.glide.load.data.e eVar, ui.h hVar, h.b bVar) {
        k7.e<List<Throwable>> eVar2 = this.f185441a;
        List<Throwable> listAcquire = eVar2.acquire();
        qj.l.c(listAcquire, "Argument must not be null");
        try {
            List<? extends i<Data, ResourceType, Transcode>> list = this.f185442b;
            int size = list.size();
            u uVarA = null;
            for (int i16 = 0; i16 < size; i16++) {
                try {
                    uVarA = list.get(i16).a(i14, i15, eVar, hVar, bVar);
                } catch (GlideException e4) {
                    listAcquire.add(e4);
                }
                if (uVarA != null) {
                    break;
                }
            }
            if (uVarA == null) {
                throw new GlideException(this.f185443c, new ArrayList(listAcquire));
            }
            eVar2.a(listAcquire);
            return uVarA;
        } catch (Throwable th3) {
            eVar2.a(listAcquire);
            throw th3;
        }
    }

    public final String toString() {
        return "LoadPath{decodePaths=" + Arrays.toString(this.f185442b.toArray()) + CoreConstants.CURLY_RIGHT;
    }
}

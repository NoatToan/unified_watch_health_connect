package defpackage;

import androidx.core.util.Pools;
import com.bumptech.glide.load.data.a;
import com.bumptech.glide.load.engine.GlideException;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes4.dex */
public class pie<Data, ResourceType, Transcode> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class<Data> f30416a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Pools.Pool<List<Throwable>> f30417b;
    public final List<? extends cs5<Data, ResourceType, Transcode>> c;
    public final String d;

    public pie(Class<Data> cls, Class<ResourceType> cls2, Class<Transcode> cls3, List<cs5<Data, ResourceType, Transcode>> list, Pools.Pool<List<Throwable>> pool) {
        this.f30416a = cls;
        this.f30417b = pool;
        this.c = (List) a6i.c(list);
        this.d = "Failed LoadPath{" + cls.getSimpleName() + LifecycleConstantKt.DATA_DELIMITER + cls2.getSimpleName() + LifecycleConstantKt.DATA_DELIMITER + cls3.getSimpleName() + "}";
    }

    public kqk<Transcode> a(a<Data> aVar, cch cchVar, int i, int i2, cs5.a<ResourceType> aVar2) throws GlideException {
        List<Throwable> list = (List) a6i.d(this.f30417b.acquire());
        try {
            return b(aVar, cchVar, i, i2, aVar2, list);
        } finally {
            this.f30417b.release(list);
        }
    }

    public final kqk<Transcode> b(a<Data> aVar, cch cchVar, int i, int i2, cs5.a<ResourceType> aVar2, List<Throwable> list) throws GlideException {
        int size = this.c.size();
        kqk<Transcode> kqkVarA = null;
        for (int i3 = 0; i3 < size; i3++) {
            try {
                kqkVarA = this.c.get(i3).a(aVar, i, i2, cchVar, aVar2);
            } catch (GlideException e) {
                list.add(e);
            }
            if (kqkVarA != null) {
                break;
            }
        }
        if (kqkVarA != null) {
            return kqkVarA;
        }
        throw new GlideException(this.d, new ArrayList(list));
    }

    public String toString() {
        return "LoadPath{decodePaths=" + Arrays.toString(this.c.toArray()) + AbstractJsonLexerKt.END_OBJ;
    }
}

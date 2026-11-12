package defpackage;

import android.util.Log;
import androidx.core.util.Pools;
import com.bumptech.glide.load.engine.GlideException;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes4.dex */
public class cs5<DataType, ResourceType, Transcode> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class<DataType> f14666a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<? extends tqk<DataType, ResourceType>> f14667b;
    public final grk<ResourceType, Transcode> c;
    public final Pools.Pool<List<Throwable>> d;
    public final String e;

    public interface a<ResourceType> {
        kqk<ResourceType> a(kqk<ResourceType> kqkVar);
    }

    public cs5(Class<DataType> cls, Class<ResourceType> cls2, Class<Transcode> cls3, List<? extends tqk<DataType, ResourceType>> list, grk<ResourceType, Transcode> grkVar, Pools.Pool<List<Throwable>> pool) {
        this.f14666a = cls;
        this.f14667b = list;
        this.c = grkVar;
        this.d = pool;
        this.e = "Failed DecodePath{" + cls.getSimpleName() + LifecycleConstantKt.DATA_DELIMITER + cls2.getSimpleName() + LifecycleConstantKt.DATA_DELIMITER + cls3.getSimpleName() + "}";
    }

    public kqk<Transcode> a(com.bumptech.glide.load.data.a<DataType> aVar, int i, int i2, cch cchVar, a<ResourceType> aVar2) throws GlideException {
        return this.c.a(aVar2.a(b(aVar, i, i2, cchVar)), cchVar);
    }

    public final kqk<ResourceType> b(com.bumptech.glide.load.data.a<DataType> aVar, int i, int i2, cch cchVar) throws GlideException {
        List<Throwable> list = (List) a6i.d(this.d.acquire());
        try {
            return c(aVar, i, i2, cchVar, list);
        } finally {
            this.d.release(list);
        }
    }

    public final kqk<ResourceType> c(com.bumptech.glide.load.data.a<DataType> aVar, int i, int i2, cch cchVar, List<Throwable> list) throws GlideException {
        int size = this.f14667b.size();
        kqk<ResourceType> kqkVarB = null;
        for (int i3 = 0; i3 < size; i3++) {
            tqk<DataType, ResourceType> tqkVar = this.f14667b.get(i3);
            try {
                if (tqkVar.a(aVar.a(), cchVar)) {
                    kqkVarB = tqkVar.b(aVar.a(), i, i2, cchVar);
                }
            } catch (IOException | OutOfMemoryError | RuntimeException e) {
                if (Log.isLoggable("DecodePath", 2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Failed to decode data for ");
                    sb.append(tqkVar);
                }
                list.add(e);
            }
            if (kqkVarB != null) {
                break;
            }
        }
        if (kqkVarB != null) {
            return kqkVarB;
        }
        throw new GlideException(this.e, new ArrayList(list));
    }

    public String toString() {
        return "DecodePath{ dataClass=" + this.f14666a + ", decoders=" + this.f14667b + ", transcoder=" + this.c + AbstractJsonLexerKt.END_OBJ;
    }
}

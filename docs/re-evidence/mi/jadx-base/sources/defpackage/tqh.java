package defpackage;

import androidx.collection.ArraySet;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class tqh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f34942a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set<b> f34943b = new ArraySet();
    public final Map<String, zaf> c = new HashMap();
    public final Comparator<njh<String, Float>> d = new a();

    public class a implements Comparator<njh<String, Float>> {
        public a() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(njh<String, Float> njhVar, njh<String, Float> njhVar2) {
            float fFloatValue = njhVar.f27980b.floatValue();
            float fFloatValue2 = njhVar2.f27980b.floatValue();
            if (fFloatValue2 > fFloatValue) {
                return 1;
            }
            return fFloatValue > fFloatValue2 ? -1 : 0;
        }
    }

    public interface b {
        void a(float f);
    }

    public void a(String str, float f) {
        if (this.f34942a) {
            zaf zafVar = this.c.get(str);
            if (zafVar == null) {
                zafVar = new zaf();
                this.c.put(str, zafVar);
            }
            zafVar.a(f);
            if (str.equals("__container")) {
                Iterator<b> it = this.f34943b.iterator();
                while (it.hasNext()) {
                    it.next().a(f);
                }
            }
        }
    }

    public void b(boolean z) {
        this.f34942a = z;
    }
}

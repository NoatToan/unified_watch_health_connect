package defpackage;

import androidx.exifinterface.media.ExifInterface;
import com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader;
import com.huawei.openalliance.ad.constant.ParamConstants;
import com.huawei.pluginachievement.manager.model.MedalConstants;
import com.huawei.watchface.utils.constants.WatchFaceConstant;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u0003:\u0001(B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ(\u0010\t\u001a\u0004\u0018\u0001H\n\"\b\b\u0000\u0010\n*\u00020\u00062\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\n0\fH\u0096\u0002¢\u0006\u0002\u0010\rJ5\u0010\u000e\u001a\u0002H\u000f\"\u0004\b\u0000\u0010\u000f2\u0006\u0010\u0010\u001a\u0002H\u000f2\u0018\u0010\u0011\u001a\u0014\u0012\u0004\u0012\u0002H\u000f\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u0002H\u000f0\u0012H\u0016¢\u0006\u0002\u0010\u0013J\u0014\u0010\u0014\u001a\u00020\u00012\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\fH\u0016J\b\u0010\u0015\u001a\u00020\u0016H\u0002J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0010\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0000H\u0002J\u0013\u0010\u001b\u001a\u00020\u00182\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0096\u0002J\b\u0010\u001e\u001a\u00020\u0016H\u0016J\b\u0010\u001f\u001a\u00020 H\u0016J\b\u0010!\u001a\u00020\u001dH\u0002J\u0019\u0010\"\u001a\u00020#2\n\u0010$\u001a\u00060%j\u0002`&H\u0002¢\u0006\u0002\u0010'R\u000e\u0010\u0004\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006)"}, d2 = {"Lkotlin/coroutines/CombinedContext;", "Lkotlin/coroutines/CoroutineContext;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "left", FunctionSetBeanReader.BI_ELEMENT, "Lkotlin/coroutines/CoroutineContext$Element;", "<init>", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/CoroutineContext$Element;)V", "get", ExifInterface.LONGITUDE_EAST, MedalConstants.EVENT_KEY, "Lkotlin/coroutines/CoroutineContext$Key;", "(Lkotlin/coroutines/CoroutineContext$Key;)Lkotlin/coroutines/CoroutineContext$Element;", "fold", "R", "initial", "operation", "Lkotlin/Function2;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "minusKey", "size", "", "contains", "", "containsAll", ParamConstants.Param.CONTEXT, "equals", "other", "", WatchFaceConstant.HASHCODE, "toString", "", "writeReplace", "readObject", "", "input", "Ljava/io/ObjectInputStream;", "Lkotlin/internal/ReadObjectParameterType;", "(Ljava/io/ObjectInputStream;)V", "Serialized", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class zba implements CoroutineContext, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final CoroutineContext.Element f53952a;
    private final CoroutineContext e;

    public zba(CoroutineContext coroutineContext, CoroutineContext.Element element) {
        zcp.c(coroutineContext, "");
        zcp.c(element, "");
        this.e = coroutineContext;
        this.f53952a = element;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public CoroutineContext plus(CoroutineContext coroutineContext) {
        return CoroutineContext.d.d(this, coroutineContext);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public <E extends CoroutineContext.Element> E get(CoroutineContext.Key<E> key) {
        zcp.c(key, "");
        zba zbaVar = this;
        while (true) {
            E e = (E) zbaVar.f53952a.get(key);
            if (e != null) {
                return e;
            }
            CoroutineContext coroutineContext = zbaVar.e;
            if (coroutineContext instanceof zba) {
                zbaVar = (zba) coroutineContext;
            } else {
                return (E) coroutineContext.get(key);
            }
        }
    }

    @Override // kotlin.coroutines.CoroutineContext
    public <R> R fold(R initial, Function2<? super R, ? super CoroutineContext.Element, ? extends R> operation) {
        zcp.c(operation, "");
        return operation.invoke((Object) this.e.fold(initial, operation), this.f53952a);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public CoroutineContext minusKey(CoroutineContext.Key<?> key) {
        zcp.c(key, "");
        if (this.f53952a.get(key) != null) {
            return this.e;
        }
        CoroutineContext coroutineContextMinusKey = this.e.minusKey(key);
        if (coroutineContextMinusKey == this.e) {
            return this;
        }
        return coroutineContextMinusKey == zbf.f53962b ? this.f53952a : new zba(coroutineContextMinusKey, this.f53952a);
    }

    private final int c() {
        int i = 2;
        zba zbaVar = this;
        while (true) {
            CoroutineContext coroutineContext = zbaVar.e;
            zbaVar = coroutineContext instanceof zba ? (zba) coroutineContext : null;
            if (zbaVar == null) {
                return i;
            }
            i++;
        }
    }

    private final boolean c(CoroutineContext.Element element) {
        return zcp.b(get(element.getKey()), element);
    }

    private final boolean b(zba zbaVar) {
        while (c(zbaVar.f53952a)) {
            CoroutineContext coroutineContext = zbaVar.e;
            if (coroutineContext instanceof zba) {
                zbaVar = (zba) coroutineContext;
            } else {
                zcp.e(coroutineContext, "");
                return c((CoroutineContext.Element) coroutineContext);
            }
        }
        return false;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof zba)) {
            return false;
        }
        zba zbaVar = (zba) other;
        return zbaVar.c() == c() && zbaVar.b(this);
    }

    public int hashCode() {
        return this.e.hashCode() + this.f53952a.hashCode();
    }

    public String toString() {
        return "[" + ((String) fold("", new Function2() { // from class: zbb
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return zba.e((String) obj, (CoroutineContext.Element) obj2);
            }
        })) + ']';
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String e(String str, CoroutineContext.Element element) {
        zcp.c(str, "");
        zcp.c(element, "");
        if (str.length() == 0) {
            return element.toString();
        }
        return str + ", " + element;
    }

    private final Object writeReplace() {
        int iC = c();
        final CoroutineContext[] coroutineContextArr = new CoroutineContext[iC];
        final zcw.d dVar = new zcw.d();
        fold(yzc.e, new Function2() { // from class: zaz
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return zba.c(coroutineContextArr, dVar, (yzc) obj, (CoroutineContext.Element) obj2);
            }
        });
        if (dVar.f53982c != iC) {
            throw new IllegalStateException("Check failed.");
        }
        return new c(coroutineContextArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final yzc c(CoroutineContext[] coroutineContextArr, zcw.d dVar, yzc yzcVar, CoroutineContext.Element element) {
        zcp.c(yzcVar, "");
        zcp.c(element, "");
        int i = dVar.f53982c;
        dVar.f53982c = i + 1;
        coroutineContextArr[i] = element;
        return yzc.e;
    }

    private final void readObject(ObjectInputStream input) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    /* JADX INFO: loaded from: classes46.dex */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0002\u0018\u0000 \r2\u00060\u0001j\u0002`\u0002:\u0001\rB\u0015\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u000b\u001a\u00020\fH\u0002R\u0019\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\t¨\u0006\u000e"}, d2 = {"Lkotlin/coroutines/CombinedContext$Serialized;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "elements", "", "Lkotlin/coroutines/CoroutineContext;", "<init>", "([Lkotlin/coroutines/CoroutineContext;)V", "getElements", "()[Lkotlin/coroutines/CoroutineContext;", "[Lkotlin/coroutines/CoroutineContext;", "readResolve", "", "Companion", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    static final class c implements Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f53953a = new b(null);
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final CoroutineContext[] f53954c;

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lkotlin/coroutines/CombinedContext$Serialized$Companion;", "", "<init>", "()V", "serialVersionUID", "", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class b {
            private b() {
            }

            public /* synthetic */ b(zcm zcmVar) {
                this();
            }
        }

        public c(CoroutineContext[] coroutineContextArr) {
            zcp.c(coroutineContextArr, "");
            this.f53954c = coroutineContextArr;
        }

        private final Object readResolve() {
            CoroutineContext[] coroutineContextArr = this.f53954c;
            CoroutineContext coroutineContextPlus = zbf.f53962b;
            for (CoroutineContext coroutineContext : coroutineContextArr) {
                coroutineContextPlus = coroutineContextPlus.plus(coroutineContext);
            }
            return coroutineContextPlus;
        }
    }
}

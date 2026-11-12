package kotlin.coroutines;

import androidx.exifinterface.media.ExifInterface;
import com.huawei.openalliance.ad.constant.ParamConstants;
import com.huawei.pluginachievement.manager.model.MedalConstants;
import defpackage.zba;
import defpackage.zbf;
import defpackage.zcp;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\bg\u0018\u00002\u00020\u0001:\u0002\u0011\u0012J(\u0010\u0002\u001a\u0004\u0018\u0001H\u0003\"\b\b\u0000\u0010\u0003*\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00030\u0006H¦\u0002¢\u0006\u0002\u0010\u0007J5\u0010\b\u001a\u0002H\t\"\u0004\b\u0000\u0010\t2\u0006\u0010\n\u001a\u0002H\t2\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u0002H\t\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u0002H\t0\fH&¢\u0006\u0002\u0010\rJ\u0011\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0000H\u0096\u0002J\u0014\u0010\u0010\u001a\u00020\u00002\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0006H&¨\u0006\u0013"}, d2 = {"Lkotlin/coroutines/CoroutineContext;", "", "get", ExifInterface.LONGITUDE_EAST, "Lkotlin/coroutines/CoroutineContext$Element;", MedalConstants.EVENT_KEY, "Lkotlin/coroutines/CoroutineContext$Key;", "(Lkotlin/coroutines/CoroutineContext$Key;)Lkotlin/coroutines/CoroutineContext$Element;", "fold", "R", "initial", "operation", "Lkotlin/Function2;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "plus", ParamConstants.Param.CONTEXT, "minusKey", "Key", "Element", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface CoroutineContext {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lkotlin/coroutines/CoroutineContext$Key;", ExifInterface.LONGITUDE_EAST, "Lkotlin/coroutines/CoroutineContext$Element;", "", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface Key<E extends Element> {
    }

    <R> R fold(R initial, Function2<? super R, ? super Element, ? extends R> operation);

    <E extends Element> E get(Key<E> key);

    CoroutineContext minusKey(Key<?> key);

    CoroutineContext plus(CoroutineContext context);

    /* JADX INFO: loaded from: classes20.dex */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class d {
        public static CoroutineContext d(CoroutineContext coroutineContext, CoroutineContext coroutineContext2) {
            zcp.c(coroutineContext2, "");
            return coroutineContext2 == zbf.f53962b ? coroutineContext : (CoroutineContext) coroutineContext2.fold(coroutineContext, new Function2() { // from class: zbi
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CoroutineContext.d.a((CoroutineContext) obj, (CoroutineContext.Element) obj2);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static CoroutineContext a(CoroutineContext coroutineContext, Element element) {
            zba zbaVar;
            zcp.c(coroutineContext, "");
            zcp.c(element, "");
            CoroutineContext coroutineContextMinusKey = coroutineContext.minusKey(element.getKey());
            if (coroutineContextMinusKey == zbf.f53962b) {
                return element;
            }
            ContinuationInterceptor continuationInterceptor = (ContinuationInterceptor) coroutineContextMinusKey.get(ContinuationInterceptor.INSTANCE);
            if (continuationInterceptor == null) {
                zbaVar = new zba(coroutineContextMinusKey, element);
            } else {
                CoroutineContext coroutineContextMinusKey2 = coroutineContextMinusKey.minusKey(ContinuationInterceptor.INSTANCE);
                zbaVar = coroutineContextMinusKey2 == zbf.f53962b ? new zba(element, continuationInterceptor) : new zba(new zba(coroutineContextMinusKey2, element), continuationInterceptor);
            }
            return zbaVar;
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J(\u0010\u0006\u001a\u0004\u0018\u0001H\u0007\"\b\b\u0000\u0010\u0007*\u00020\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u0002H\u00070\u0003H\u0096\u0002¢\u0006\u0002\u0010\bJ5\u0010\t\u001a\u0002H\n\"\u0004\b\u0000\u0010\n2\u0006\u0010\u000b\u001a\u0002H\n2\u0018\u0010\f\u001a\u0014\u0012\u0004\u0012\u0002H\n\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u0002H\n0\rH\u0016¢\u0006\u0002\u0010\u000eJ\u0014\u0010\u000f\u001a\u00020\u00012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0016R\u0016\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0010"}, d2 = {"Lkotlin/coroutines/CoroutineContext$Element;", "Lkotlin/coroutines/CoroutineContext;", MedalConstants.EVENT_KEY, "Lkotlin/coroutines/CoroutineContext$Key;", "getKey", "()Lkotlin/coroutines/CoroutineContext$Key;", "get", ExifInterface.LONGITUDE_EAST, "(Lkotlin/coroutines/CoroutineContext$Key;)Lkotlin/coroutines/CoroutineContext$Element;", "fold", "R", "initial", "operation", "Lkotlin/Function2;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "minusKey", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface Element extends CoroutineContext {
        @Override // kotlin.coroutines.CoroutineContext
        <R> R fold(R initial, Function2<? super R, ? super Element, ? extends R> operation);

        @Override // kotlin.coroutines.CoroutineContext
        <E extends Element> E get(Key<E> key);

        Key<?> getKey();

        @Override // kotlin.coroutines.CoroutineContext
        CoroutineContext minusKey(Key<?> key);

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class c {
            public static CoroutineContext a(Element element, CoroutineContext coroutineContext) {
                zcp.c(coroutineContext, "");
                return d.d(element, coroutineContext);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static <E extends Element> E c(Element element, Key<E> key) {
                zcp.c(key, "");
                if (!zcp.b(element.getKey(), key)) {
                    return null;
                }
                zcp.e(element, "");
                return element;
            }

            public static <R> R a(Element element, R r, Function2<? super R, ? super Element, ? extends R> function2) {
                zcp.c(function2, "");
                return function2.invoke(r, element);
            }

            public static CoroutineContext a(Element element, Key<?> key) {
                zcp.c(key, "");
                return zcp.b(element.getKey(), key) ? zbf.f53962b : element;
            }
        }
    }
}

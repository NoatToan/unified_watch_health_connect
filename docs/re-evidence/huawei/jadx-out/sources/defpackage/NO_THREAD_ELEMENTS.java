package defpackage;

import com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader;
import com.huawei.openalliance.ad.constant.ParamConstants;
import com.huawei.phoneservice.faq.base.constants.TrackConstants$Opers;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.ThreadContextElement;

/* JADX INFO: renamed from: zml, reason: from Kotlin metadata */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001a\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0004H\u0000\u001a\u0010\u0010\u000f\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\rH\u0000\u001a\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00042\u0006\u0010\f\u001a\u00020\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0004H\u0000\"\u0010\u0010\u0000\u001a\u00020\u00018\u0000X\u0081\u0004¢\u0006\u0002\n\u0000\"$\u0010\u0002\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\",\u0010\u0006\u001a \u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u0007\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00070\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\" \u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\t0\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"NO_THREAD_ELEMENTS", "Lkotlinx/coroutines/internal/Symbol;", "countAll", "Lkotlin/Function2;", "", "Lkotlin/coroutines/CoroutineContext$Element;", "findOne", "Lkotlinx/coroutines/ThreadContextElement;", "updateState", "Lkotlinx/coroutines/internal/ThreadState;", "restoreThreadContext", "", ParamConstants.Param.CONTEXT, "Lkotlin/coroutines/CoroutineContext;", "oldState", "threadContextElements", "updateThreadContext", "countOrElement", "kotlinx-coroutines-core"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class NO_THREAD_ELEMENTS {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final zmh f54302a = new zmh("NO_THREAD_ELEMENTS");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Function2<Object, CoroutineContext.Element, Object> f54304c = e.d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Function2<ThreadContextElement<?>, CoroutineContext.Element, ThreadContextElement<?>> f54303b = b.f54305b;
    private static final Function2<zmr, CoroutineContext.Element, zmr> e = d.d;

    /* JADX INFO: renamed from: zml$e */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<no name provided>", "", "countOrElement", FunctionSetBeanReader.BI_ELEMENT, "Lkotlin/coroutines/CoroutineContext$Element;", TrackConstants$Opers.INVOKE}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class e extends Lambda implements Function2<Object, CoroutineContext.Element, Object> {
        public static final e d = new e();

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object obj, CoroutineContext.Element element) {
            if (!(element instanceof ThreadContextElement)) {
                return obj;
            }
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            int iIntValue = num != null ? num.intValue() : 1;
            return iIntValue == 0 ? element : Integer.valueOf(iIntValue + 1);
        }

        e() {
            super(2);
        }
    }

    /* JADX INFO: renamed from: zml$b */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00012\f\u0010\u0002\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<no name provided>", "Lkotlinx/coroutines/ThreadContextElement;", "found", FunctionSetBeanReader.BI_ELEMENT, "Lkotlin/coroutines/CoroutineContext$Element;", TrackConstants$Opers.INVOKE}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class b extends Lambda implements Function2<ThreadContextElement<?>, CoroutineContext.Element, ThreadContextElement<?>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f54305b = new b();

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public final ThreadContextElement<?> invoke(ThreadContextElement<?> threadContextElement, CoroutineContext.Element element) {
            if (threadContextElement != null) {
                return threadContextElement;
            }
            if (element instanceof ThreadContextElement) {
                return (ThreadContextElement) element;
            }
            return null;
        }

        b() {
            super(2);
        }
    }

    /* JADX INFO: renamed from: zml$d */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<no name provided>", "Lkotlinx/coroutines/internal/ThreadState;", "state", FunctionSetBeanReader.BI_ELEMENT, "Lkotlin/coroutines/CoroutineContext$Element;", TrackConstants$Opers.INVOKE}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class d extends Lambda implements Function2<zmr, CoroutineContext.Element, zmr> {
        public static final d d = new d();

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public final zmr invoke(zmr zmrVar, CoroutineContext.Element element) {
            if (element instanceof ThreadContextElement) {
                ThreadContextElement<?> threadContextElement = (ThreadContextElement) element;
                zmrVar.a(threadContextElement, threadContextElement.updateThreadContext(zmrVar.d));
            }
            return zmrVar;
        }

        d() {
            super(2);
        }
    }

    public static final Object c(CoroutineContext coroutineContext) {
        Object objFold = coroutineContext.fold(0, f54304c);
        zcp.e(objFold);
        return objFold;
    }

    public static final Object d(CoroutineContext coroutineContext, Object obj) {
        if (obj == null) {
            obj = c(coroutineContext);
        }
        if (obj == 0) {
            return f54302a;
        }
        if (obj instanceof Integer) {
            return coroutineContext.fold(new zmr(coroutineContext, ((Number) obj).intValue()), e);
        }
        zcp.e(obj, "");
        return ((ThreadContextElement) obj).updateThreadContext(coroutineContext);
    }

    public static final void b(CoroutineContext coroutineContext, Object obj) {
        if (obj == f54302a) {
            return;
        }
        if (obj instanceof zmr) {
            ((zmr) obj).b(coroutineContext);
            return;
        }
        Object objFold = coroutineContext.fold(null, f54303b);
        zcp.e(objFold, "");
        ((ThreadContextElement) objFold).restoreThreadContext(coroutineContext, obj);
    }
}

package defpackage;

import androidx.exifinterface.media.ExifInterface;
import com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader;
import com.huawei.openalliance.ad.constant.ParamConstants;
import com.huawei.phoneservice.faq.base.constants.TrackConstants$Opers;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CopyableThreadContextElement;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: renamed from: zgr, reason: from Kotlin metadata */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000>\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a \u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH\u0002\u001a8\u0010\u000b\u001a\u0002H\f\"\u0004\b\u0000\u0010\f2\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u0002H\f0\u0012H\u0080\b¢\u0006\u0002\u0010\u0013\u001a4\u0010\u0014\u001a\u0002H\f\"\u0004\b\u0000\u0010\f2\u0006\u0010\u0015\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u0002H\f0\u0012H\u0080\b¢\u0006\u0002\u0010\u0016\u001a\f\u0010\u0017\u001a\u00020\n*\u00020\u0003H\u0002\u001a\u0014\u0010\u0018\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u0003H\u0007\u001a\u0014\u0010\u0018\u001a\u00020\u0003*\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u0003H\u0007\u001a\u0013\u0010\u001b\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u001c*\u00020\u001dH\u0080\u0010\u001a(\u0010\u001e\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u001c*\u0006\u0012\u0002\b\u00030\u000e2\u0006\u0010\u0015\u001a\u00020\u00032\b\u0010\u001f\u001a\u0004\u0018\u00010\u0010H\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u00038@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006 "}, d2 = {"DEBUG_THREAD_NAME_SEPARATOR", "", "coroutineName", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineName", "(Lkotlin/coroutines/CoroutineContext;)Ljava/lang/String;", "foldCopies", "originalContext", "appendContext", "isNewCoroutine", "", "withContinuationContext", ExifInterface.GPS_DIRECTION_TRUE, "continuation", "Lkotlin/coroutines/Continuation;", "countOrElement", "", "block", "Lkotlin/Function0;", "(Lkotlin/coroutines/Continuation;Ljava/lang/Object;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "withCoroutineContext", ParamConstants.Param.CONTEXT, "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Object;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "hasCopyableElements", "newCoroutineContext", "addedContext", "Lkotlinx/coroutines/CoroutineScope;", "undispatchedCompletion", "Lkotlinx/coroutines/UndispatchedCoroutine;", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "updateUndispatchedCompletion", "oldValue", "kotlinx-coroutines-core"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class DEBUG_THREAD_NAME_SEPARATOR {
    public static final CoroutineContext e(CoroutineScope coroutineScope, CoroutineContext coroutineContext) {
        CoroutineContext coroutineContextA = a(coroutineScope.getF54264a(), coroutineContext, true);
        CoroutineContext coroutineContextPlus = ASSERTIONS_ENABLED.c() ? coroutineContextA.plus(new zgv(ASSERTIONS_ENABLED.d().incrementAndGet())) : coroutineContextA;
        return (coroutineContextA == zhf.e() || coroutineContextA.get(ContinuationInterceptor.INSTANCE) != null) ? coroutineContextPlus : coroutineContextPlus.plus(zhf.e());
    }

    public static final CoroutineContext e(CoroutineContext coroutineContext, CoroutineContext coroutineContext2) {
        return !e(coroutineContext2) ? coroutineContext.plus(coroutineContext2) : a(coroutineContext, coroutineContext2, false);
    }

    /* JADX INFO: renamed from: zgr$d */
    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "result", "it", "Lkotlin/coroutines/CoroutineContext$Element;", TrackConstants$Opers.INVOKE, "(ZLkotlin/coroutines/CoroutineContext$Element;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class d extends Lambda implements Function2<Boolean, CoroutineContext.Element, Boolean> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final d f54085b = new d();

        public final Boolean a(boolean z, CoroutineContext.Element element) {
            return Boolean.valueOf(z || (element instanceof CopyableThreadContextElement));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* synthetic */ Boolean invoke(Boolean bool, CoroutineContext.Element element) {
            return a(bool.booleanValue(), element);
        }

        d() {
            super(2);
        }
    }

    private static final boolean e(CoroutineContext coroutineContext) {
        return ((Boolean) coroutineContext.fold(false, d.f54085b)).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v6, types: [T, java.lang.Object] */
    private static final CoroutineContext a(CoroutineContext coroutineContext, CoroutineContext coroutineContext2, boolean z) {
        boolean zE = e(coroutineContext);
        boolean zE2 = e(coroutineContext2);
        if (!zE && !zE2) {
            return coroutineContext.plus(coroutineContext2);
        }
        zcw.e eVar = new zcw.e();
        eVar.f53983c = coroutineContext2;
        CoroutineContext coroutineContext3 = (CoroutineContext) coroutineContext.fold(zbf.f53962b, new a(eVar, z));
        if (zE2) {
            eVar.f53983c = ((CoroutineContext) eVar.f53983c).fold(zbf.f53962b, b.e);
        }
        return coroutineContext3.plus((CoroutineContext) eVar.f53983c);
    }

    /* JADX INFO: renamed from: zgr$a */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lkotlin/coroutines/CoroutineContext;", "result", FunctionSetBeanReader.BI_ELEMENT, "Lkotlin/coroutines/CoroutineContext$Element;", TrackConstants$Opers.INVOKE}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class a extends Lambda implements Function2<CoroutineContext, CoroutineContext.Element, CoroutineContext> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ zcw.e<CoroutineContext> f54084a;
        final /* synthetic */ boolean d;

        /* JADX WARN: Type inference failed for: r2v2, types: [T, kotlin.coroutines.CoroutineContext] */
        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final CoroutineContext invoke(CoroutineContext coroutineContext, CoroutineContext.Element element) {
            if (!(element instanceof CopyableThreadContextElement)) {
                return coroutineContext.plus(element);
            }
            CoroutineContext.Element element2 = this.f54084a.f53983c.get(element.getKey());
            if (element2 == null) {
                CopyableThreadContextElement copyableThreadContextElementCopyForChild = (CopyableThreadContextElement) element;
                if (this.d) {
                    copyableThreadContextElementCopyForChild = copyableThreadContextElementCopyForChild.copyForChild();
                }
                return coroutineContext.plus(copyableThreadContextElementCopyForChild);
            }
            zcw.e<CoroutineContext> eVar = this.f54084a;
            eVar.f53983c = eVar.f53983c.minusKey(element.getKey());
            return coroutineContext.plus(((CopyableThreadContextElement) element).mergeForChild(element2));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(zcw.e<CoroutineContext> eVar, boolean z) {
            super(2);
            this.f54084a = eVar;
            this.d = z;
        }
    }

    /* JADX INFO: renamed from: zgr$b */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lkotlin/coroutines/CoroutineContext;", "result", FunctionSetBeanReader.BI_ELEMENT, "Lkotlin/coroutines/CoroutineContext$Element;", TrackConstants$Opers.INVOKE}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class b extends Lambda implements Function2<CoroutineContext, CoroutineContext.Element, CoroutineContext> {
        public static final b e = new b();

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final CoroutineContext invoke(CoroutineContext coroutineContext, CoroutineContext.Element element) {
            if (element instanceof CopyableThreadContextElement) {
                return coroutineContext.plus(((CopyableThreadContextElement) element).copyForChild());
            }
            return coroutineContext.plus(element);
        }

        b() {
            super(2);
        }
    }

    public static final ziq<?> a(Continuation<?> continuation, CoroutineContext coroutineContext, Object obj) {
        if (!(continuation instanceof CoroutineStackFrame) || coroutineContext.get(zio.f54139c) == null) {
            return null;
        }
        ziq<?> ziqVarD = d((CoroutineStackFrame) continuation);
        if (ziqVarD != null) {
            ziqVarD.b(coroutineContext, obj);
        }
        return ziqVarD;
    }

    public static final ziq<?> d(CoroutineStackFrame coroutineStackFrame) {
        while (!(coroutineStackFrame instanceof zgy) && (coroutineStackFrame = coroutineStackFrame.getCallerFrame()) != null) {
            if (coroutineStackFrame instanceof ziq) {
                return (ziq) coroutineStackFrame;
            }
        }
        return null;
    }

    public static final String d(CoroutineContext coroutineContext) {
        zgv zgvVar;
        String f54088c;
        if (!ASSERTIONS_ENABLED.c() || (zgvVar = (zgv) coroutineContext.get(zgv.f54086a)) == null) {
            return null;
        }
        zgw zgwVar = (zgw) coroutineContext.get(zgw.f54087a);
        if (zgwVar == null || (f54088c = zgwVar.getF54088c()) == null) {
            f54088c = "coroutine";
        }
        return f54088c + '#' + zgvVar.getE();
    }
}

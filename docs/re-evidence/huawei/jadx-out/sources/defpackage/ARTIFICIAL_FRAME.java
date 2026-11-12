package defpackage;

import androidx.exifinterface.media.ExifInterface;
import com.huawei.health.suggestion.model.FitRunPlayAudio;
import com.huawei.phoneservice.faq.base.constants.TrackConstants$Events;
import java.util.ArrayDeque;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;

/* JADX INFO: renamed from: zmf, reason: from Kotlin metadata */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\u001a9\u0010\b\u001a\u0002H\t\"\b\b\u0000\u0010\t*\u00020\n2\u0006\u0010\u000b\u001a\u0002H\t2\u0006\u0010\f\u001a\u0002H\t2\u0010\u0010\r\u001a\f\u0012\b\u0012\u00060\u0001j\u0002`\u000f0\u000eH\u0002¢\u0006\u0002\u0010\u0010\u001a\u001e\u0010\u0011\u001a\f\u0012\b\u0012\u00060\u0001j\u0002`\u000f0\u000e2\n\u0010\u0012\u001a\u00060\u0013j\u0002`\u0014H\u0002\u001a1\u0010\u0015\u001a\u00020\u00162\u0010\u0010\u0017\u001a\f\u0012\b\u0012\u00060\u0001j\u0002`\u000f0\u00182\u0010\u0010\f\u001a\f\u0012\b\u0012\u00060\u0001j\u0002`\u000f0\u000eH\u0002¢\u0006\u0002\u0010\u0019\u001a\u0019\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\nH\u0080Hø\u0001\u0000¢\u0006\u0002\u0010\u001d\u001a+\u0010\u001e\u001a\u0002H\t\"\b\b\u0000\u0010\t*\u00020\n2\u0006\u0010\u001c\u001a\u0002H\t2\n\u0010\u0012\u001a\u00060\u0013j\u0002`\u0014H\u0002¢\u0006\u0002\u0010\u001f\u001a\u001f\u0010 \u001a\u0002H\t\"\b\b\u0000\u0010\t*\u00020\n2\u0006\u0010\u001c\u001a\u0002H\tH\u0000¢\u0006\u0002\u0010!\u001a,\u0010 \u001a\u0002H\t\"\b\b\u0000\u0010\t*\u00020\n2\u0006\u0010\u001c\u001a\u0002H\t2\n\u0010\u0012\u001a\u0006\u0012\u0002\b\u00030\"H\u0080\b¢\u0006\u0002\u0010#\u001a \u0010$\u001a\u0002H\t\"\b\b\u0000\u0010\t*\u00020\n2\u0006\u0010\u001c\u001a\u0002H\tH\u0081\b¢\u0006\u0002\u0010!\u001a\u001f\u0010%\u001a\u0002H\t\"\b\b\u0000\u0010\t*\u00020\n2\u0006\u0010\u001c\u001a\u0002H\tH\u0001¢\u0006\u0002\u0010!\u001a1\u0010&\u001a\u0018\u0012\u0004\u0012\u0002H\t\u0012\u000e\u0012\f\u0012\b\u0012\u00060\u0001j\u0002`\u000f0\u00180'\"\b\b\u0000\u0010\t*\u00020\n*\u0002H\tH\u0002¢\u0006\u0002\u0010(\u001a\u001c\u0010)\u001a\u00020**\u00060\u0001j\u0002`\u000f2\n\u0010+\u001a\u00060\u0001j\u0002`\u000fH\u0002\u001a#\u0010,\u001a\u00020-*\f\u0012\b\u0012\u00060\u0001j\u0002`\u000f0\u00182\u0006\u0010.\u001a\u00020\u0003H\u0002¢\u0006\u0002\u0010/\u001a\u0014\u00100\u001a\u00020\u0016*\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0000\u001a\u0010\u00101\u001a\u00020**\u00060\u0001j\u0002`\u000fH\u0000\u001a\u001b\u00102\u001a\u0002H\t\"\b\b\u0000\u0010\t*\u00020\n*\u0002H\tH\u0002¢\u0006\u0002\u0010!\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000\"\u0016\u0010\u0004\u001a\n \u0005*\u0004\u0018\u00010\u00030\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000\"\u0016\u0010\u0007\u001a\n \u0005*\u0004\u0018\u00010\u00030\u0003X\u0082\u0004¢\u0006\u0002\n\u0000*\f\b\u0000\u00103\"\u00020\u00132\u00020\u0013*\f\b\u0000\u00104\"\u00020\u00012\u00020\u0001\u0082\u0002\u0004\n\u0002\b\u0019¨\u00065"}, d2 = {"ARTIFICIAL_FRAME", "Ljava/lang/StackTraceElement;", "baseContinuationImplClass", "", "baseContinuationImplClassName", "kotlin.jvm.PlatformType", "stackTraceRecoveryClass", "stackTraceRecoveryClassName", "createFinalException", ExifInterface.LONGITUDE_EAST, "", "cause", "result", "resultStackTrace", "Ljava/util/ArrayDeque;", "Lkotlinx/coroutines/internal/StackTraceElement;", "(Ljava/lang/Throwable;Ljava/lang/Throwable;Ljava/util/ArrayDeque;)Ljava/lang/Throwable;", "createStackTrace", "continuation", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "Lkotlinx/coroutines/internal/CoroutineStackFrame;", "mergeRecoveredTraces", "", "recoveredStacktrace", "", "([Ljava/lang/StackTraceElement;Ljava/util/ArrayDeque;)V", "recoverAndThrow", "", TrackConstants$Events.EXCEPTION, "(Ljava/lang/Throwable;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "recoverFromStackFrame", "(Ljava/lang/Throwable;Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;)Ljava/lang/Throwable;", "recoverStackTrace", "(Ljava/lang/Throwable;)Ljava/lang/Throwable;", "Lkotlin/coroutines/Continuation;", "(Ljava/lang/Throwable;Lkotlin/coroutines/Continuation;)Ljava/lang/Throwable;", "unwrap", "unwrapImpl", "causeAndStacktrace", "Lkotlin/Pair;", "(Ljava/lang/Throwable;)Lkotlin/Pair;", "elementWiseEquals", "", FitRunPlayAudio.OPPORTUNITY_E, "firstFrameIndex", "", "methodName", "([Ljava/lang/StackTraceElement;Ljava/lang/String;)I", "initCause", "isArtificial", "sanitizeStackTrace", "CoroutineStackFrame", "StackTraceElement", "kotlinx-coroutines-core"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class ARTIFICIAL_FRAME {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f54295b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final StackTraceElement f54296c = new e().e();
    private static final String e;

    static {
        Object objE;
        Object objE2;
        try {
            yyt.c cVar = yyt.f53903b;
            objE = yyt.e(Class.forName("kotlin.coroutines.jvm.internal.BaseContinuationImpl").getCanonicalName());
        } catch (Throwable th) {
            yyt.c cVar2 = yyt.f53903b;
            objE = yyt.e(createFailure.a(th));
        }
        e = (String) (yyt.a(objE) == null ? objE : "kotlin.coroutines.jvm.internal.BaseContinuationImpl");
        try {
            yyt.c cVar3 = yyt.f53903b;
            objE2 = yyt.e(Class.forName("zmf").getCanonicalName());
        } catch (Throwable th2) {
            yyt.c cVar4 = yyt.f53903b;
            objE2 = yyt.e(createFailure.a(th2));
        }
        f54295b = (String) (yyt.a(objE2) == null ? objE2 : "zmf");
    }

    public static final <E extends Throwable> E c(E e2) {
        Throwable thB;
        return (ASSERTIONS_ENABLED.b() && (thB = ctorCache.b(e2)) != null) ? (E) b(thB) : e2;
    }

    private static final <E extends Throwable> E b(E e2) {
        StackTraceElement stackTraceElement;
        StackTraceElement[] stackTrace = e2.getStackTrace();
        int length = stackTrace.length;
        int length2 = stackTrace.length - 1;
        if (length2 < 0) {
            length2 = -1;
            break;
        }
        while (true) {
            int i = length2 - 1;
            if (zcp.b((Object) f54295b, (Object) stackTrace[length2].getClassName())) {
                break;
            }
            if (i < 0) {
                length2 = -1;
                break;
            }
            length2 = i;
        }
        int iB = b(stackTrace, e);
        int i2 = (length - length2) - (iB == -1 ? 0 : length - iB);
        StackTraceElement[] stackTraceElementArr = new StackTraceElement[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            if (i3 == 0) {
                stackTraceElement = f54296c;
            } else {
                stackTraceElement = stackTrace[((length2 + 1) + i3) - 1];
            }
            stackTraceElementArr[i3] = stackTraceElement;
        }
        e2.setStackTrace(stackTraceElementArr);
        return e2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <E extends Throwable> E d(E e2, CoroutineStackFrame coroutineStackFrame) {
        yyu yyuVarA = a(e2);
        Throwable th = (Throwable) yyuVarA.a();
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) yyuVarA.e();
        Throwable thB = ctorCache.b(th);
        if (thB != null) {
            ArrayDeque<StackTraceElement> arrayDequeB = b(coroutineStackFrame);
            if (!arrayDequeB.isEmpty()) {
                if (th != e2) {
                    b(stackTraceElementArr, arrayDequeB);
                }
                return (E) b(th, thB, arrayDequeB);
            }
        }
        return e2;
    }

    private static final <E extends Throwable> E b(E e2, E e3, ArrayDeque<StackTraceElement> arrayDeque) {
        arrayDeque.addFirst(f54296c);
        StackTraceElement[] stackTrace = e2.getStackTrace();
        int iB = b(stackTrace, e);
        int i = 0;
        if (iB == -1) {
            e3.setStackTrace((StackTraceElement[]) arrayDeque.toArray(new StackTraceElement[0]));
            return e3;
        }
        StackTraceElement[] stackTraceElementArr = new StackTraceElement[arrayDeque.size() + iB];
        for (int i2 = 0; i2 < iB; i2++) {
            stackTraceElementArr[i2] = stackTrace[i2];
        }
        Iterator<StackTraceElement> it = arrayDeque.iterator();
        while (it.hasNext()) {
            stackTraceElementArr[i + iB] = it.next();
            i++;
        }
        e3.setStackTrace(stackTraceElementArr);
        return e3;
    }

    private static final <E extends Throwable> yyu<E, StackTraceElement[]> a(E e2) {
        Throwable cause = e2.getCause();
        if (cause != null && zcp.b(cause.getClass(), e2.getClass())) {
            StackTraceElement[] stackTrace = e2.getStackTrace();
            for (StackTraceElement stackTraceElement : stackTrace) {
                if (e(stackTraceElement)) {
                    return yyz.c(cause, stackTrace);
                }
            }
            return yyz.c(e2, new StackTraceElement[0]);
        }
        return yyz.c(e2, new StackTraceElement[0]);
    }

    public static final <E extends Throwable> E e(E e2) {
        E e3 = (E) e2.getCause();
        if (e3 != null && zcp.b(e3.getClass(), e2.getClass())) {
            for (StackTraceElement stackTraceElement : e2.getStackTrace()) {
                if (e(stackTraceElement)) {
                    return e3;
                }
            }
        }
        return e2;
    }

    private static final ArrayDeque<StackTraceElement> b(CoroutineStackFrame coroutineStackFrame) {
        ArrayDeque<StackTraceElement> arrayDeque = new ArrayDeque<>();
        StackTraceElement stackTraceElement = coroutineStackFrame.getStackTraceElement();
        if (stackTraceElement != null) {
            arrayDeque.add(stackTraceElement);
        }
        while (true) {
            if (!(coroutineStackFrame instanceof CoroutineStackFrame)) {
                coroutineStackFrame = null;
            }
            if (coroutineStackFrame == null || (coroutineStackFrame = coroutineStackFrame.getCallerFrame()) == null) {
                break;
            }
            StackTraceElement stackTraceElement2 = coroutineStackFrame.getStackTraceElement();
            if (stackTraceElement2 != null) {
                arrayDeque.add(stackTraceElement2);
            }
        }
        return arrayDeque;
    }

    public static final boolean e(StackTraceElement stackTraceElement) {
        return zes.e(stackTraceElement.getClassName(), ARTIFICIAL_FRAME_PACKAGE_NAME.a(), false, 2, (Object) null);
    }

    private static final boolean e(StackTraceElement stackTraceElement, StackTraceElement stackTraceElement2) {
        return stackTraceElement.getLineNumber() == stackTraceElement2.getLineNumber() && zcp.b((Object) stackTraceElement.getMethodName(), (Object) stackTraceElement2.getMethodName()) && zcp.b((Object) stackTraceElement.getFileName(), (Object) stackTraceElement2.getFileName()) && zcp.b((Object) stackTraceElement.getClassName(), (Object) stackTraceElement2.getClassName());
    }

    private static final void b(StackTraceElement[] stackTraceElementArr, ArrayDeque<StackTraceElement> arrayDeque) {
        int length = stackTraceElementArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            } else if (e(stackTraceElementArr[i])) {
                break;
            } else {
                i++;
            }
        }
        int i2 = i + 1;
        int length2 = stackTraceElementArr.length - 1;
        if (i2 > length2) {
            return;
        }
        while (true) {
            if (e(stackTraceElementArr[length2], arrayDeque.getLast())) {
                arrayDeque.removeLast();
            }
            arrayDeque.addFirst(stackTraceElementArr[length2]);
            if (length2 == i2) {
                return;
            } else {
                length2--;
            }
        }
    }

    private static final int b(StackTraceElement[] stackTraceElementArr, String str) {
        int length = stackTraceElementArr.length;
        for (int i = 0; i < length; i++) {
            if (zcp.b((Object) str, (Object) stackTraceElementArr[i].getClassName())) {
                return i;
            }
        }
        return -1;
    }
}

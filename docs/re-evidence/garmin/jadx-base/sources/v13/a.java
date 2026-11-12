package v13;

import com.google.firebase.messaging.Constants;
import java.io.Serializable;
import java.lang.reflect.Field;
import o13.q;
import org.apache.commons.io.IOUtils;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b!\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\u00020\u00032\u00020\u0004B\u0019\u0012\u0010\u0010\u0005\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\u000b\u001a\u00020\n2\u000e\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\r\u001a\u0004\u0018\u00010\u00022\u000e\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\bH$¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\nH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\n0\u00012\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J+\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\n0\u00012\b\u0010\u0013\u001a\u0004\u0018\u00010\u00022\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0016¢\u0006\u0004\b\u0011\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0011\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR!\u0010\u0005\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010 \u001a\u0004\u0018\u00010\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Lv13/a;", "Lt13/d;", "", "Lv13/d;", "Ljava/io/Serializable;", "completion", "<init>", "(Lt13/d;)V", "Lo13/q;", "result", "", "resumeWith", "(Ljava/lang/Object;)V", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "releaseIntercepted", "()V", "create", "(Lt13/d;)Lt13/d;", "value", "(Ljava/lang/Object;Lt13/d;)Lt13/d;", "", "toString", "()Ljava/lang/String;", "Ljava/lang/StackTraceElement;", "getStackTraceElement", "()Ljava/lang/StackTraceElement;", "Lt13/d;", "getCompletion", "()Lt13/d;", "getCallerFrame", "()Lv13/d;", "callerFrame", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class a implements t13.d<Object>, d, Serializable {
    private final t13.d<Object> completion;

    public a(t13.d<Object> dVar) {
        this.completion = dVar;
    }

    public t13.d<Unit> create(t13.d<?> completion) {
        completion.getClass();
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    public d getCallerFrame() {
        t13.d<Object> dVar = this.completion;
        if (dVar instanceof d) {
            return (d) dVar;
        }
        return null;
    }

    public final t13.d<Object> getCompletion() {
        return this.completion;
    }

    public StackTraceElement getStackTraceElement() {
        String strC;
        e eVar = (e) getClass().getAnnotation(e.class);
        if (eVar == null || eVar.v() < 1) {
            return null;
        }
        int iIntValue = 0;
        if (!(this instanceof j)) {
            try {
                Field declaredField = getClass().getDeclaredField(Constants.ScionAnalytics.PARAM_LABEL);
                declaredField.setAccessible(true);
                Object obj = declaredField.get(this);
                Integer num = obj instanceof Integer ? (Integer) obj : null;
                iIntValue = (num != null ? num.intValue() : 0) - 1;
            } catch (Exception unused) {
                iIntValue = -1;
            }
        }
        int i14 = iIntValue >= 0 ? eVar.l()[iIntValue] : -1;
        f.f174831a.getClass();
        String strA = f.a(this);
        if (strA == null) {
            strC = eVar.c();
        } else {
            strC = strA + IOUtils.DIR_SEPARATOR_UNIX + eVar.c();
        }
        return new StackTraceElement(strC, eVar.m(), eVar.f(), i14);
    }

    public abstract Object invokeSuspend(Object result);

    public void releaseIntercepted() {
    }

    @Override // t13.d
    public final void resumeWith(Object result) {
        t13.d<Object> dVar = this;
        while (true) {
            a aVar = (a) dVar;
            t13.d<Object> dVar2 = aVar.completion;
            dVar2.getClass();
            try {
                result = aVar.invokeSuspend(result);
                if (result == u13.a.COROUTINE_SUSPENDED) {
                    return;
                } else {
                    int i14 = q.f128596b;
                }
            } catch (Throwable th3) {
                int i15 = q.f128596b;
                result = new q.b(th3);
            }
            aVar.releaseIntercepted();
            if (!(dVar2 instanceof a)) {
                dVar2.resumeWith(result);
                return;
            }
            dVar = dVar2;
        }
    }

    public String toString() {
        StringBuilder sb3 = new StringBuilder("Continuation at ");
        Object stackTraceElement = getStackTraceElement();
        if (stackTraceElement == null) {
            stackTraceElement = getClass().getName();
        }
        sb3.append(stackTraceElement);
        return sb3.toString();
    }

    public t13.d<Unit> create(Object value, t13.d<?> completion) {
        completion.getClass();
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }
}

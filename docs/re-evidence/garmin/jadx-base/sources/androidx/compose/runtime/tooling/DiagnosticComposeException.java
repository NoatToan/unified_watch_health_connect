package androidx.compose.runtime.tooling;

import ch.qos.logback.core.CoreConstants;
import com.google.mlkit.common.MlKitException;
import e23.l;
import g4.a;
import g4.d;
import g4.m;
import java.util.ArrayList;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p13.d0;
import p13.e0;
import p13.u;
import p13.w;
import p13.y0;
import q13.b;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0001\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006JB\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00010\f\"\u0004\b\u0000\u0010\u0007\"\u0006\b\u0001\u0010\b\u0018\u0001*\b\u0012\u0004\u0012\u00028\u00000\t2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\nH\u0082\b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0012R\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Landroidx/compose/runtime/tooling/DiagnosticComposeException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "Lg4/a;", "trace", "<init>", "(Lg4/a;)V", "T", "R", "", "Lkotlin/Function1;", "map", "", "mapToArray", "(Ljava/util/List;Le23/l;)[Ljava/lang/Object;", "", "fillInStackTrace", "()Ljava/lang/Throwable;", "Lg4/a;", "", "getMessage", "()Ljava/lang/String;", "message", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DiagnosticComposeException extends RuntimeException {
    public static final int $stable = 8;
    private final a trace;

    public DiagnosticComposeException(a aVar) {
        this.trace = aVar;
        if (aVar.f75731b) {
            return;
        }
        int[] iArr = {201, 202, MlKitException.CODE_SCANNER_TASK_IN_PROGRESS, MlKitException.CODE_SCANNER_PIPELINE_INFERENCE_ERROR, MlKitException.CODE_SCANNER_GOOGLE_PLAY_SERVICES_VERSION_TOO_OLD, 125, -127, 126665345, 200};
        List<d> list = aVar.f75730a;
        int size = list.size();
        ArrayList arrayList = new ArrayList();
        int i14 = 0;
        while (i14 < size) {
            int i15 = i14 + 1;
            d dVar = list.get(i14);
            if (!u.x(iArr, dVar.f75733a)) {
                if (dVar.f75733a == 100) {
                    int i16 = i14 + 2;
                    if (i16 < size && list.get(i16).f75733a == 1000) {
                        break;
                    } else {
                        d0.G(arrayList);
                    }
                } else {
                    arrayList.add(dVar);
                }
            }
            i14 = i15;
        }
        int size2 = arrayList.size();
        StackTraceElement[] stackTraceElementArr = new StackTraceElement[size2];
        for (int i17 = 0; i17 < size2; i17++) {
            stackTraceElementArr[i17] = new StackTraceElement("$$compose", "m$" + ((d) arrayList.get(i17)).f75733a, "SourceFile", 1);
        }
        setStackTrace(stackTraceElementArr);
    }

    private final <T, R> R[] mapToArray(List<? extends T> list, l<? super T, ? extends R> lVar) {
        list.size();
        s.l();
        throw null;
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        if (!this.trace.f75731b) {
            return "Composition stack when thrown:";
        }
        StringBuilder sb3 = new StringBuilder("Composition stack when thrown:\n");
        a aVar = this.trace;
        b bVarB = w.b();
        y0 y0VarJ = e0.J(aVar.f75730a);
        int f134973e = y0VarJ.getF134973e();
        String str = null;
        String str2 = null;
        for (int i14 = 0; i14 < f134973e; i14++) {
            d dVar = (d) y0VarJ.get(i14);
            g4.s sVar = dVar.f75734b;
            Integer num = dVar.f75735c;
            if (sVar != null) {
                boolean z14 = sVar.f75752a;
                String str3 = sVar.f75753b;
                if (str3 == null) {
                    String str4 = z14 ? "<lambda>" : null;
                    if (str4 != null) {
                        str = str4;
                    } else if (str == null) {
                        str = "<unknown function>";
                    }
                } else {
                    str = str3;
                }
                String str5 = sVar.f75754c;
                if (str5 != null) {
                    str2 = str5;
                } else if (str2 == null) {
                    str2 = "<unknown file>";
                }
                List<m> list = sVar.f75757f;
                String str6 = str + CoreConstants.LEFT_PARENTHESIS_CHAR + str2 + CoreConstants.COLON_CHAR + ((num == null || num.intValue() >= list.size()) ? "<unknown line>" : String.valueOf(list.get(num.intValue()).f75744a)) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
                if (!z14) {
                }
                if (!s.g(str3, "rememberCompositionContext") || !s.g(sVar.f75756e, "9igjgp")) {
                    bVarB.add(str6);
                }
            }
        }
        y0 y0VarJ2 = e0.J(w.a(bVarB));
        int f134973e2 = y0VarJ2.getF134973e();
        for (int i15 = 0; i15 < f134973e2; i15++) {
            String str7 = (String) y0VarJ2.get(i15);
            sb3.append("\tat ");
            sb3.append(str7);
            sb3.append('\n');
        }
        return sb3.toString();
    }
}

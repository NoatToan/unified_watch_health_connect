package g63;

import ch.qos.logback.core.CoreConstants;
import ds.e0;
import g63.c;
import java.util.ArrayList;
import java.util.List;
import kotlinx.datetime.internal.format.parser.ParseException;
import p005kotlin.Metadata;
import p13.c0;
import p13.d0;

/* JADX INFO: loaded from: classes3.dex */
@d23.a
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081@\u0018\u0000*\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00012\u00020\u0003:\u0001\u0004\u0088\u0001\u0005\u0092\u0001\b\u0012\u0004\u0012\u00028\u00000\u0006¨\u0006\u0007"}, d2 = {"Lg63/j;", "Lg63/c;", "Output", "", "a", "commands", "Lg63/o;", "kotlinx-datetime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class j<Output extends c<Output>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o<Output> f76144a;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002B%\u0012\u0006\u0010\u0003\u001a\u00028\u0001\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lg63/j$a;", "Output", "", "output", "Lg63/o;", "parserStructure", "", "inputPosition", "<init>", "(Ljava/lang/Object;Lg63/o;I)V", "kotlinx-datetime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a<Output> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Output f76145a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final o<Output> f76146b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f76147c;

        /* JADX WARN: Multi-variable type inference failed */
        public a(Output output, o<? super Output> oVar, int i14) {
            oVar.getClass();
            this.f76145a = output;
            this.f76146b = oVar;
            this.f76147c = i14;
        }
    }

    public static c a(o oVar, CharSequence charSequence, c cVar) throws ParseException {
        charSequence.getClass();
        cVar.getClass();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayListM = p13.x.m(new a(cVar, oVar, 0));
        while (true) {
            a aVar = (a) d0.G(arrayListM);
            if (aVar != null) {
                c cVar2 = (c) ((c) aVar.f76145a).copy();
                int iIntValue = aVar.f76147c;
                o<Output> oVar2 = aVar.f76146b;
                List<m<Output>> list = oVar2.f76149a;
                List<o<Output>> list2 = oVar2.f76150b;
                int size = list.size();
                int i14 = 0;
                while (true) {
                    if (i14 >= size) {
                        if (!list2.isEmpty()) {
                            int size2 = list2.size() - 1;
                            if (size2 < 0) {
                                break;
                            }
                            while (true) {
                                int i15 = size2 - 1;
                                arrayListM.add(new a(cVar2, (o) list2.get(size2), iIntValue));
                                if (i15 < 0) {
                                    break;
                                }
                                size2 = i15;
                            }
                        } else {
                            if (iIntValue != charSequence.length()) {
                                arrayList.add(new h(iIntValue, l.f76148a));
                                break;
                            }
                            return cVar2;
                        }
                    } else {
                        Object objA = ((m) list.get(i14)).a(cVar2, charSequence, iIntValue);
                        if (!(objA instanceof Integer)) {
                            if (objA instanceof h) {
                                arrayList.add((h) objA);
                                break;
                            }
                            e0.t(objA, "Unexpected parse result: ");
                            return null;
                        }
                        iIntValue = ((Number) objA).intValue();
                        i14++;
                    }
                }
            } else {
                if (arrayList.size() > 1) {
                    c0.u(arrayList, new k());
                }
                throw new ParseException(arrayList);
            }
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            return p005kotlin.jvm.internal.s.g(this.f76144a, ((j) obj).f76144a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f76144a.hashCode();
    }

    public final String toString() {
        return "Parser(commands=" + this.f76144a + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}

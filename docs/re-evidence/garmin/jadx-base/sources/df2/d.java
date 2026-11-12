package df2;

import e23.l;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u0001*\u0006\b\u0001\u0010\u0002 \u00002\u00020\u0003B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ldf2/d;", "ClassType", "ParameterType", "", "Lkotlin/Function1;", "creator", "<init>", "(Le23/l;)V", "promotionlibrary_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public class d<ClassType, ParameterType> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public l<? super ParameterType, ? extends ClassType> f59466a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile ClassType f59467b;

    public d(l<? super ParameterType, ? extends ClassType> lVar) {
        lVar.getClass();
        this.f59466a = lVar;
    }

    public final ClassType a(ParameterType parametertype) {
        ClassType classtypeInvoke;
        ClassType classtype = this.f59467b;
        if (classtype != null) {
            return classtype;
        }
        synchronized (this) {
            classtypeInvoke = this.f59467b;
            if (classtypeInvoke == null) {
                l<? super ParameterType, ? extends ClassType> lVar = this.f59466a;
                lVar.getClass();
                classtypeInvoke = lVar.invoke(parametertype);
                this.f59467b = classtypeInvoke;
                this.f59466a = null;
            }
        }
        return classtypeInvoke;
    }
}

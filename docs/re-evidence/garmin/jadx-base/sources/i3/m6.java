package i3;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B-\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\u001c\u0010\b\u001a\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0004\u0012\u00020\u00060\u0004j\u0002`\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Li3/m6;", "T", "", Action.KEY_ATTRIBUTE, "Lkotlin/Function1;", "Lkotlin/Function0;", "", "Landroidx/compose/material3/FadeInFadeOutTransition;", "transition", "<init>", "(Ljava/lang/Object;Le23/q;)V", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class m6<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final T f88952a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e23.q<e23.p<? super p3.m, ? super Integer, Unit>, p3.m, Integer, Unit> f88953b;

    /* JADX WARN: Multi-variable type inference failed */
    public m6(T t7, e23.q<? super e23.p<? super p3.m, ? super Integer, Unit>, ? super p3.m, ? super Integer, Unit> qVar) {
        this.f88952a = t7;
        this.f88953b = qVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m6)) {
            return false;
        }
        m6 m6Var = (m6) obj;
        return p005kotlin.jvm.internal.s.g(this.f88952a, m6Var.f88952a) && p005kotlin.jvm.internal.s.g(this.f88953b, m6Var.f88953b);
    }

    public final int hashCode() {
        T t7 = this.f88952a;
        return this.f88953b.hashCode() + ((t7 == null ? 0 : t7.hashCode()) * 31);
    }

    public final String toString() {
        return "FadeInFadeOutAnimationItem(key=" + this.f88952a + ", transition=" + this.f88953b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}

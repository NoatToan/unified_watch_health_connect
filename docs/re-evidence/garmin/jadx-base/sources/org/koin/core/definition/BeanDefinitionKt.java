package org.koin.core.definition;

import ch.qos.logback.core.CoreConstants;
import e23.p;
import java.util.List;
import k23.d;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.scope.Scope;
import org.koin.ext.KClassExtKt;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p13.j0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a.\u0010\u0006\u001a\u00020\u00052\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0086\b¢\u0006\u0004\b\u0006\u0010\u0007\u001ay\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013\"\u0006\b\u0000\u0010\b\u0018\u00012\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022$\b\b\u0010\u0010\u001a\u001e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00028\u00000\fj\b\u0012\u0004\u0012\u00028\u0000`\u000f2\u0012\b\u0002\u0010\u0012\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00000\u00112\u0006\u0010\u0004\u001a\u00020\u0002H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015*\n\u0010\u0016\"\u00020\u00052\u00020\u0005*4\u0010\u0017\u001a\u0004\b\u0000\u0010\b\"\u0014\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00028\u00000\f2\u0014\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00028\u00000\f\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0018"}, d2 = {"Lk23/d;", "clazz", "Lorg/koin/core/qualifier/Qualifier;", "typeQualifier", "scopeQualifier", "", "indexKey", "(Lk23/d;Lorg/koin/core/qualifier/Qualifier;Lorg/koin/core/qualifier/Qualifier;)Ljava/lang/String;", "T", "Lorg/koin/core/definition/Kind;", "kind", "qualifier", "Lkotlin/Function2;", "Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "Lorg/koin/core/definition/Definition;", "definition", "", "secondaryTypes", "Lorg/koin/core/definition/BeanDefinition;", "_createDefinition", "(Lorg/koin/core/definition/Kind;Lorg/koin/core/qualifier/Qualifier;Le23/p;Ljava/util/List;Lorg/koin/core/qualifier/Qualifier;)Lorg/koin/core/definition/BeanDefinition;", "IndexKey", "Definition", "koin-core"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class BeanDefinitionKt {
    public static final <T> BeanDefinition<T> _createDefinition(Kind kind, Qualifier qualifier, p<? super Scope, ? super ParametersHolder, ? extends T> pVar, List<? extends d<?>> list, Qualifier qualifier2) {
        kind.getClass();
        pVar.getClass();
        list.getClass();
        qualifier2.getClass();
        s.l();
        throw null;
    }

    public static BeanDefinition _createDefinition$default(Kind kind, Qualifier qualifier, p pVar, List list, Qualifier qualifier2, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            kind = Kind.Singleton;
        }
        if ((i14 & 8) != 0) {
            list = j0.f134944a;
        }
        kind.getClass();
        pVar.getClass();
        list.getClass();
        qualifier2.getClass();
        s.l();
        throw null;
    }

    public static final String indexKey(d<?> dVar, Qualifier qualifier, Qualifier qualifier2) {
        String value;
        dVar.getClass();
        qualifier2.getClass();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(KClassExtKt.getFullName(dVar));
        sb3.append(CoreConstants.COLON_CHAR);
        if (qualifier == null || (value = qualifier.getValue()) == null) {
            value = "";
        }
        sb3.append(value);
        sb3.append(CoreConstants.COLON_CHAR);
        sb3.append(qualifier2);
        return sb3.toString();
    }
}

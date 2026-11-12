package org.koin.core.definition;

import ch.qos.logback.core.CoreConstants;
import e23.p;
import java.io.IOException;
import java.util.List;
import k23.d;
import org.koin.core.module.KoinDslMarker;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.registry.ScopeRegistry;
import org.koin.core.scope.Scope;
import org.koin.ext.KClassExtKt;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import p13.h0;
import p13.j0;
import uu.o;

/* JADX INFO: loaded from: classes3.dex */
@KoinDslMarker
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002Bg\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\"\u0010\f\u001a\u001e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00028\u00000\bj\b\u0012\u0004\u0012\u00028\u0000`\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0012\b\u0002\u0010\u0010\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001c\u0010\u001b\u001a\u00020\u00172\n\u0010\u001a\u001a\u0006\u0012\u0002\b\u00030\u0005H\u0086\b¢\u0006\u0004\b\u001b\u0010\u001cJ.\u0010\u001e\u001a\u00020\u00172\n\u0010\u001a\u001a\u0006\u0012\u0002\b\u00030\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u001d\u001a\u00020\u0003H\u0086\b¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010#\u001a\u0004\b$\u0010%R\u001b\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010&\u001a\u0004\b'\u0010(R$\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010#\u001a\u0004\b)\u0010%\"\u0004\b*\u0010+R3\u0010\f\u001a\u001e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00028\u00000\bj\b\u0012\u0004\u0012\u00028\u0000`\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010,\u001a\u0004\b-\u0010.R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010/\u001a\u0004\b0\u00101R,\u0010\u0010\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R(\u00108\u001a\b\u0012\u0004\u0012\u00028\u0000078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R(\u0010>\u001a\u00020\u00178\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b>\u0010?\u0012\u0004\bD\u0010E\u001a\u0004\b@\u0010A\"\u0004\bB\u0010C¨\u0006F"}, d2 = {"Lorg/koin/core/definition/BeanDefinition;", "T", "", "Lorg/koin/core/qualifier/Qualifier;", "scopeQualifier", "Lk23/d;", "primaryType", "qualifier", "Lkotlin/Function2;", "Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "Lorg/koin/core/definition/Definition;", "definition", "Lorg/koin/core/definition/Kind;", "kind", "", "secondaryTypes", "<init>", "(Lorg/koin/core/qualifier/Qualifier;Lk23/d;Lorg/koin/core/qualifier/Qualifier;Le23/p;Lorg/koin/core/definition/Kind;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "other", "", "equals", "(Ljava/lang/Object;)Z", "clazz", "hasType", "(Lk23/d;)Z", "scopeDefinition", "is", "(Lk23/d;Lorg/koin/core/qualifier/Qualifier;Lorg/koin/core/qualifier/Qualifier;)Z", "", "hashCode", "()I", "Lorg/koin/core/qualifier/Qualifier;", "getScopeQualifier", "()Lorg/koin/core/qualifier/Qualifier;", "Lk23/d;", "getPrimaryType", "()Lk23/d;", "getQualifier", "setQualifier", "(Lorg/koin/core/qualifier/Qualifier;)V", "Le23/p;", "getDefinition", "()Le23/p;", "Lorg/koin/core/definition/Kind;", "getKind", "()Lorg/koin/core/definition/Kind;", "Ljava/util/List;", "getSecondaryTypes", "()Ljava/util/List;", "setSecondaryTypes", "(Ljava/util/List;)V", "Lorg/koin/core/definition/Callbacks;", "callbacks", "Lorg/koin/core/definition/Callbacks;", "getCallbacks", "()Lorg/koin/core/definition/Callbacks;", "setCallbacks", "(Lorg/koin/core/definition/Callbacks;)V", "_createdAtStart", "Z", "get_createdAtStart", "()Z", "set_createdAtStart", "(Z)V", "get_createdAtStart$annotations", "()V", "koin-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BeanDefinition<T> {
    private boolean _createdAtStart;
    private Callbacks<T> callbacks;
    private final p<Scope, ParametersHolder, T> definition;
    private final Kind kind;
    private final d<?> primaryType;
    private Qualifier qualifier;
    private final Qualifier scopeQualifier;
    private List<? extends d<?>> secondaryTypes;

    /* JADX WARN: Multi-variable type inference failed */
    public BeanDefinition(Qualifier qualifier, d<?> dVar, Qualifier qualifier2, p<? super Scope, ? super ParametersHolder, ? extends T> pVar, Kind kind, List<? extends d<?>> list) {
        qualifier.getClass();
        dVar.getClass();
        pVar.getClass();
        kind.getClass();
        list.getClass();
        this.scopeQualifier = qualifier;
        this.primaryType = dVar;
        this.qualifier = qualifier2;
        this.definition = pVar;
        this.kind = kind;
        this.secondaryTypes = list;
        this.callbacks = new Callbacks<>(null, 1, null);
    }

    public static /* synthetic */ void get_createdAtStart$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence toString$lambda$1$lambda$0(d dVar) {
        dVar.getClass();
        return KClassExtKt.getFullName(dVar);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        other.getClass();
        BeanDefinition beanDefinition = (BeanDefinition) other;
        return s.g(this.primaryType, beanDefinition.primaryType) && s.g(this.qualifier, beanDefinition.qualifier) && s.g(this.scopeQualifier, beanDefinition.scopeQualifier);
    }

    public final Callbacks<T> getCallbacks() {
        return this.callbacks;
    }

    public final p<Scope, ParametersHolder, T> getDefinition() {
        return this.definition;
    }

    public final Kind getKind() {
        return this.kind;
    }

    public final d<?> getPrimaryType() {
        return this.primaryType;
    }

    public final Qualifier getQualifier() {
        return this.qualifier;
    }

    public final Qualifier getScopeQualifier() {
        return this.scopeQualifier;
    }

    public final List<d<?>> getSecondaryTypes() {
        return this.secondaryTypes;
    }

    public final boolean get_createdAtStart() {
        return this._createdAtStart;
    }

    public final boolean hasType(d<?> clazz) {
        clazz.getClass();
        return s.g(getPrimaryType(), clazz) || getSecondaryTypes().contains(clazz);
    }

    public int hashCode() {
        Qualifier qualifier = this.qualifier;
        return this.scopeQualifier.hashCode() + ((this.primaryType.hashCode() + ((qualifier != null ? qualifier.hashCode() : 0) * 31)) * 31);
    }

    public final boolean is(d<?> clazz, Qualifier qualifier, Qualifier scopeDefinition) {
        clazz.getClass();
        scopeDefinition.getClass();
        return (s.g(getPrimaryType(), clazz) || getSecondaryTypes().contains(clazz)) && s.g(getQualifier(), qualifier) && s.g(getScopeQualifier(), scopeDefinition);
    }

    public final void setCallbacks(Callbacks<T> callbacks) {
        callbacks.getClass();
        this.callbacks = callbacks;
    }

    public final void setQualifier(Qualifier qualifier) {
        this.qualifier = qualifier;
    }

    public final void setSecondaryTypes(List<? extends d<?>> list) {
        list.getClass();
        this.secondaryTypes = list;
    }

    public final void set_createdAtStart(boolean z14) {
        this._createdAtStart = z14;
    }

    public String toString() throws IOException {
        StringBuilder sb3 = new StringBuilder();
        sb3.append('[');
        sb3.append(this.kind);
        sb3.append(": '");
        sb3.append(KClassExtKt.getFullName(this.primaryType));
        sb3.append(CoreConstants.SINGLE_QUOTE_CHAR);
        if (this.qualifier != null) {
            sb3.append(",qualifier:");
            sb3.append(this.qualifier);
        }
        if (!s.g(this.scopeQualifier, ScopeRegistry.INSTANCE.getRootScopeQualifier())) {
            sb3.append(",scope:");
            sb3.append(this.scopeQualifier);
        }
        if (!this.secondaryTypes.isEmpty()) {
            sb3.append(",binds:");
            h0.j0(this.secondaryTypes, sb3, ",", null, null, new o(24), 60);
        }
        sb3.append(']');
        return sb3.toString();
    }

    public BeanDefinition(Qualifier qualifier, d dVar, Qualifier qualifier2, p pVar, Kind kind, List list, int i14, j jVar) {
        this(qualifier, dVar, (i14 & 4) != 0 ? null : qualifier2, pVar, kind, (i14 & 32) != 0 ? j0.f134944a : list);
    }
}

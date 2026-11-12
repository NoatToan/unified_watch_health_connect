package com.mapbox.maps.extension.compose;

import com.mapbox.maps.interactions.QueryRenderedFeaturesetFeaturesCallback;
import java.util.List;
import o13.h;
import o53.j;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.n;
import p005kotlin.jvm.internal.q;
import p005kotlin.jvm.internal.s;
import t13.d;
import t13.f;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
public /* synthetic */ class MapState$queryRenderedFeatures$3$1$cancelable$1 implements QueryRenderedFeaturesetFeaturesCallback, n {
    final /* synthetic */ j<List<? extends FF>> $tmp0;

    /* JADX WARN: Multi-variable type inference failed */
    public MapState$queryRenderedFeatures$3$1$cancelable$1(j<? super List<? extends FF>> jVar) {
        this.$tmp0 = jVar;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof QueryRenderedFeaturesetFeaturesCallback) && (obj instanceof n)) {
            return s.g(getFunctionDelegate(), ((n) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // p005kotlin.jvm.internal.n
    public final h<?> getFunctionDelegate() {
        return new q(1, this.$tmp0, f.class, "resume", "resume(Lkotlin/coroutines/Continuation;Ljava/lang/Object;)V", 1);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.mapbox.maps.interactions.QueryRenderedFeaturesetFeaturesCallback
    public final void onQueryRenderedFeatures(List<? extends FF> list) {
        list.getClass();
        d dVar = this.$tmp0;
        int i14 = o13.q.f128596b;
        dVar.resumeWith(list);
    }
}

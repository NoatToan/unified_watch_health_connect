package org.koin.bundle.factory;

import a11.n;
import androidx.lifecycle.j1;
import androidx.lifecycle.m1;
import androidx.lifecycle.viewmodel.CreationExtras;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import e23.a;
import java.util.ArrayList;
import java.util.List;
import k23.d;
import org.koin.core.parameter.ParametersHolder;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ/\u0010\r\u001a\u00028\u0000\"\u0004\b\u0000\u0010\t2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0002¢\u0006\u0004\b\r\u0010\u000eJ)\u0010\u0011\u001a\u00028\u0000\"\u0004\b\u0000\u0010\t2\u0006\u0010\u0010\u001a\u00020\u000f2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\nH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u0013\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\t2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\nH\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0015¨\u0006\u0016"}, d2 = {"Lorg/koin/viewmodel/factory/AndroidParametersHolder;", "Lorg/koin/core/parameter/ParametersHolder;", "Lkotlin/Function0;", "Lorg/koin/core/parameter/ParametersDefinition;", "initialValues", "Landroidx/lifecycle/viewmodel/CreationExtras;", "extras", "<init>", "(Le23/a;Landroidx/lifecycle/viewmodel/CreationExtras;)V", "T", "Lk23/d;", "clazz", "block", "createSavedStateHandleOrElse", "(Lk23/d;Le23/a;)Ljava/lang/Object;", "", IntegerTokenConverter.CONVERTER_KEY, "elementAt", "(ILk23/d;)Ljava/lang/Object;", "getOrNull", "(Lk23/d;)Ljava/lang/Object;", "Landroidx/lifecycle/viewmodel/CreationExtras;", "koin-core-viewmodel"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AndroidParametersHolder extends ParametersHolder {
    private final CreationExtras extras;

    /* JADX WARN: Illegal instructions before constructor call */
    public AndroidParametersHolder(a<? extends ParametersHolder> aVar, CreationExtras creationExtras) {
        ParametersHolder parametersHolderInvoke;
        List<Object> values;
        creationExtras.getClass();
        super((aVar == null || (parametersHolderInvoke = aVar.invoke()) == null || (values = parametersHolderInvoke.getValues()) == null) ? new ArrayList() : new ArrayList(values), null, 2, null);
        this.extras = creationExtras;
    }

    private final <T> T createSavedStateHandleOrElse(d<?> clazz, a<? extends T> block) {
        return s.g(clazz, s0.f105811a.b(j1.class)) ? (T) m1.a(this.extras) : block.invoke();
    }

    @Override // org.koin.core.parameter.ParametersHolder
    public <T> T elementAt(int i14, d<?> clazz) {
        clazz.getClass();
        return (T) createSavedStateHandleOrElse(clazz, new a83.a(this, i14, clazz, 0));
    }

    @Override // org.koin.core.parameter.ParametersHolder
    public <T> T getOrNull(d<?> clazz) {
        clazz.getClass();
        return (T) createSavedStateHandleOrElse(clazz, new n(11, this, clazz));
    }

    public /* synthetic */ AndroidParametersHolder(a aVar, CreationExtras creationExtras, int i14, j jVar) {
        this((i14 & 1) != 0 ? null : aVar, creationExtras);
    }
}

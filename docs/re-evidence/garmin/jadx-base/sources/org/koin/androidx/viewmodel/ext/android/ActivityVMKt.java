package org.koin.androidx.viewmodel.ext.android;

import androidx.lifecycle.u1;
import androidx.lifecycle.viewmodel.CreationExtras;
import b.g;
import ch.qos.logback.core.net.SyslogConstants;
import e23.a;
import o13.l;
import o13.n;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.qualifier.Qualifier;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aY\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0010\b\n\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\u0010\b\n\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u001aS\u0010\r\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0010\b\n\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\u0010\b\n\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005H\u0087\bø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u000f"}, d2 = {"Landroidx/lifecycle/u1;", "T", "Lb/g;", "Lorg/koin/core/qualifier/Qualifier;", "qualifier", "Lkotlin/Function0;", "Landroidx/lifecycle/viewmodel/CreationExtras;", "extrasProducer", "Lorg/koin/core/parameter/ParametersHolder;", "parameters", "Lo13/l;", "viewModel", "(Lb/g;Lorg/koin/core/qualifier/Qualifier;Le23/a;Le23/a;)Lo13/l;", "getViewModel", "(Lb/g;Lorg/koin/core/qualifier/Qualifier;Le23/a;Le23/a;)Landroidx/lifecycle/u1;", "koin-android_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ActivityVMKt {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: org.koin.androidx.viewmodel.ext.android.ActivityVMKt$viewModel$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = SyslogConstants.LOG_LOCAL6)
    public static final class AnonymousClass1<T> implements a<T> {
        final /* synthetic */ a<CreationExtras> $extrasProducer;
        final /* synthetic */ a<ParametersHolder> $parameters;
        final /* synthetic */ Qualifier $qualifier;
        final /* synthetic */ g $this_viewModel;

        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(g gVar, Qualifier qualifier, a<? extends CreationExtras> aVar, a<? extends ParametersHolder> aVar2) {
            this.$this_viewModel = gVar;
            this.$qualifier = qualifier;
            this.$extrasProducer = aVar;
            this.$parameters = aVar2;
        }

        /* JADX WARN: Incorrect return type in method signature: ()TT; */
        @Override // e23.a
        public final u1 invoke() {
            g gVar = this.$this_viewModel;
            a<CreationExtras> aVar = this.$extrasProducer;
            gVar.getF189591b();
            if (aVar == null || aVar.invoke() == null) {
                gVar.getDefaultViewModelCreationExtras();
            }
            AndroidKoinScopeExtKt.getKoinScope(gVar);
            s.l();
            throw null;
        }
    }

    public static final <T extends u1> T getViewModel(g gVar, Qualifier qualifier, a<? extends CreationExtras> aVar, a<? extends ParametersHolder> aVar2) {
        gVar.getClass();
        gVar.getF189591b();
        if (aVar == null || aVar.invoke() == null) {
            gVar.getDefaultViewModelCreationExtras();
        }
        AndroidKoinScopeExtKt.getKoinScope(gVar);
        s.l();
        throw null;
    }

    public static u1 getViewModel$default(g gVar, Qualifier qualifier, a aVar, a aVar2, int i14, Object obj) {
        if ((i14 & 2) != 0) {
            aVar = null;
        }
        gVar.getClass();
        gVar.getF189591b();
        if (aVar == null || ((CreationExtras) aVar.invoke()) == null) {
            gVar.getDefaultViewModelCreationExtras();
        }
        AndroidKoinScopeExtKt.getKoinScope(gVar);
        s.l();
        throw null;
    }

    public static final <T extends u1> l<T> viewModel(g gVar, Qualifier qualifier, a<? extends CreationExtras> aVar, a<? extends ParametersHolder> aVar2) {
        gVar.getClass();
        n nVar = n.SYNCHRONIZED;
        s.l();
        throw null;
    }

    public static l viewModel$default(g gVar, Qualifier qualifier, a aVar, a aVar2, int i14, Object obj) {
        gVar.getClass();
        n nVar = n.SYNCHRONIZED;
        s.l();
        throw null;
    }
}

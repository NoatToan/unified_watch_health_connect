package org.koin.androidx.fragment.android;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.g0;
import androidx.fragment.app.m;
import androidx.fragment.app.q;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.pattern.parser.Parser;
import com.nimbusds.jose.HeaderParameterNames;
import e23.a;
import k23.d;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.scope.Scope;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a\u001d\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001aB\u0010\u000f\u001a\u00020\b\"\n\b\u0000\u0010\u0007\u0018\u0001*\u00020\u0006*\u00020\b2\b\b\u0001\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0086\b¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Landroidx/fragment/app/m;", "Lorg/koin/core/scope/Scope;", Action.SCOPE_ATTRIBUTE, "", "setupKoinFragmentFactory", "(Landroidx/fragment/app/m;Lorg/koin/core/scope/Scope;)V", "Landroidx/fragment/app/Fragment;", "F", "Landroidx/fragment/app/g0;", "", "containerViewId", "Landroid/os/Bundle;", "args", "", HeaderParameterNames.AUTHENTICATION_TAG, Parser.REPLACE_CONVERTER_WORD, "(Landroidx/fragment/app/g0;ILandroid/os/Bundle;Ljava/lang/String;)Landroidx/fragment/app/g0;", "koin-android_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ActivityExtKt {
    public static final <F extends Fragment> g0 replace(g0 g0Var, int i14, Bundle bundle, String str) {
        g0Var.getClass();
        s.l();
        throw null;
    }

    public static g0 replace$default(g0 g0Var, int i14, Bundle bundle, String str, int i15, Object obj) {
        g0Var.getClass();
        s.l();
        throw null;
    }

    public static final void setupKoinFragmentFactory(m mVar, Scope scope) {
        mVar.getClass();
        if (scope == null) {
            mVar.getSupportFragmentManager().B = (q) AndroidKoinScopeExtKt.getKoinScope(mVar).get((d<?>) s0.f105811a.b(q.class), (Qualifier) null, (a<? extends ParametersHolder>) null);
        } else {
            mVar.getSupportFragmentManager().B = new KoinFragmentFactory(scope);
        }
    }

    public static /* synthetic */ void setupKoinFragmentFactory$default(m mVar, Scope scope, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            scope = null;
        }
        setupKoinFragmentFactory(mVar, scope);
    }
}

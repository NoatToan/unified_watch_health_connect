package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes3.dex */
public final class zae extends k0<Void> {
    private final zabv a;

    public zae(zabv zabvVar, TaskCompletionSource<Void> taskCompletionSource) {
        super(3, taskCompletionSource);
        this.a = zabvVar;
    }

    @Override // com.google.android.gms.common.api.internal.k0, com.google.android.gms.common.api.internal.zab
    public final /* bridge */ /* synthetic */ void zaa(@NonNull zav zavVar, boolean z) {
    }

    @Override // com.google.android.gms.common.api.internal.k0, com.google.android.gms.common.api.internal.zab
    public final /* bridge */ /* synthetic */ void zaa(@NonNull Exception exc) {
        super.zaa(exc);
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
    @Override // com.google.android.gms.common.api.internal.k0
    public final void zab(GoogleApiManager.zaa<?> zaaVar) throws RemoteException {
        this.a.zaa.registerListener(zaaVar.zab(), this.zab);
        ListenerHolder.ListenerKey<?> listenerKey = this.a.zaa.getListenerKey();
        if (listenerKey != null) {
            zaaVar.zac().put(listenerKey, this.a);
        }
    }

    @Override // com.google.android.gms.common.api.internal.zad
    @Nullable
    public final Feature[] zac(GoogleApiManager.zaa<?> zaaVar) {
        return this.a.zaa.getRequiredFeatures();
    }

    @Override // com.google.android.gms.common.api.internal.zad
    public final boolean zad(GoogleApiManager.zaa<?> zaaVar) {
        return this.a.zaa.zaa();
    }

    @Override // com.google.android.gms.common.api.internal.k0, com.google.android.gms.common.api.internal.zab
    public final /* bridge */ /* synthetic */ void zaa(@NonNull Status status) {
        super.zaa(status);
    }
}

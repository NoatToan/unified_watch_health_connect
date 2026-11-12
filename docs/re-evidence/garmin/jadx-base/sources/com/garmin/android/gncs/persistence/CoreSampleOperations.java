package com.garmin.android.gncs.persistence;

import am.j;
import android.content.Context;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import e23.p;
import ih2.b;
import o13.r;
import o53.b0;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import t13.d;
import u13.a;
import v13.e;
import v13.i;
import vb.h;
import x53.c;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0086@¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/garmin/android/gncs/persistence/CoreSampleOperations;", "", "Landroid/content/Context;", "ctx", "<init>", "(Landroid/content/Context;)V", "", RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME, "", "deleteNotifsByPackageName", "(Ljava/lang/String;Lt13/d;)Ljava/lang/Object;", "gncs-all-modules_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class CoreSampleOperations {

    /* JADX INFO: renamed from: com.garmin.android.gncs.persistence.CoreSampleOperations$deleteNotifsByPackageName$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {1, 9, 0})
    @e(c = "com.garmin.android.gncs.persistence.CoreSampleOperations$deleteNotifsByPackageName$2", f = "CoreSampleOperations.kt", l = {}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends i implements p<b0, d<? super Unit>, Object> {
        final /* synthetic */ String $packageName;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str, d<? super AnonymousClass2> dVar) {
            super(2, dVar);
            this.$packageName = str;
        }

        @Override // v13.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return new AnonymousClass2(this.$packageName, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, d<? super Unit> dVar) {
            return ((AnonymousClass2) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
            b.b("CoreSampleOperations.deleteNotifsByPackageName -> " + this.$packageName);
            CacheManager.INSTANCE.deleteNotifsByPackageName(this.$packageName);
            return Unit.INSTANCE;
        }
    }

    public CoreSampleOperations(Context context) {
        context.getClass();
        String packageName = context.getPackageName();
        if (packageName.equals("com.garmin.coresample")) {
            return;
        }
        new RuntimeException(j.m("[", packageName, "] not allowed to use 'CoreSampleOperations'"));
    }

    public final Object deleteNotifsByPackageName(String str, d<? super Unit> dVar) throws Throwable {
        c cVar = s0.f129406a;
        Object objE0 = ge1.b.e0(x53.b.f189152a, new AnonymousClass2(str, null), dVar);
        return objE0 == a.COROUTINE_SUSPENDED ? objE0 : Unit.INSTANCE;
    }
}

package com.google.android.play.core.ktx;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.play.core.appupdate.AppUpdateInfo;
import com.google.android.play.core.appupdate.AppUpdateManager;
import com.google.android.play.core.appupdate.AppUpdateOptions;
import com.google.android.play.core.common.IntentSenderForResultStarter;
import com.google.android.play.core.install.InstallException;
import com.google.android.play.core.install.InstallState;
import com.google.android.play.core.install.InstallStateUpdatedListener;
import com.google.android.play.core.install.model.InstallErrorCode;
import com.google.android.play.core.install.model.InstallStatus;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import e23.p;
import o13.q;
import o13.r;
import o53.k;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import q53.m;
import q53.t;
import q53.w;
import r53.i;
import r53.s;
import t13.d;
import u13.a;
import u13.f;
import v13.c;
import v13.e;
import vb.h;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\n\u001a\u0017\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0017\u0010\u0005\u001a\u00020\u0004*\u00020\u0000H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0003\u001a7\u0010\u000b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\tH\u0080@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r*\u00020\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a1\u0010\u0019\u001a\u00020\u0018*\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0019\u0010\u001a\u001a'\u0010\u001e\u001a\u00020\u0018\"\u0004\b\u0000\u0010\u001b*\b\u0012\u0004\u0012\u00028\u00000\u001c2\u0006\u0010\u001d\u001a\u00028\u0000H\u0000¢\u0006\u0004\b\u001e\u0010\u001f\"\u0016\u0010#\u001a\u00020\u0016*\u00020 8Ç\u0002¢\u0006\u0006\u001a\u0004\b!\u0010\"\"\u0016\u0010&\u001a\u00020\u0016*\u00020\u00018Ç\u0002¢\u0006\u0006\u001a\u0004\b$\u0010%\"\u0016\u0010&\u001a\u00020\u0016*\u00020 8Ç\u0002¢\u0006\u0006\u001a\u0004\b$\u0010\"\"\u0016\u0010(\u001a\u00020\u0016*\u00020\u00018Æ\u0002¢\u0006\u0006\u001a\u0004\b'\u0010%\"\u0016\u0010,\u001a\u00020)*\u00020\u00018Æ\u0002¢\u0006\u0006\u001a\u0004\b*\u0010+\"\u0016\u0010,\u001a\u00020)*\u00020 8Æ\u0002¢\u0006\u0006\u001a\u0004\b*\u0010-\"\u0016\u0010/\u001a\u00020)*\u00020\u00018Æ\u0002¢\u0006\u0006\u001a\u0004\b.\u0010+\"\u0016\u0010/\u001a\u00020)*\u00020 8Æ\u0002¢\u0006\u0006\u001a\u0004\b.\u0010-\"\u0018\u00102\u001a\u0004\u0018\u00010\u0016*\u00020\u00018Æ\u0002¢\u0006\u0006\u001a\u0004\b0\u00101\"\u0016\u00106\u001a\u000203*\u00020 8Æ\u0002¢\u0006\u0006\u001a\u0004\b4\u00105\"\u0016\u00109\u001a\u00020\u0018*\u00020 8Æ\u0002¢\u0006\u0006\u001a\u0004\b7\u00108\"\u0016\u0010:\u001a\u00020\u0018*\u00020\u00018Æ\u0002¢\u0006\u0006\u001a\u0004\b:\u0010;\"\u0016\u0010<\u001a\u00020\u0018*\u00020\u00018Æ\u0002¢\u0006\u0006\u001a\u0004\b<\u0010;\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006="}, d2 = {"Lcom/google/android/play/core/appupdate/AppUpdateManager;", "Lcom/google/android/play/core/appupdate/AppUpdateInfo;", "requestAppUpdateInfo", "(Lcom/google/android/play/core/appupdate/AppUpdateManager;Lt13/d;)Ljava/lang/Object;", "", "requestCompleteUpdate", "T", "Lcom/google/android/gms/tasks/Task;", "task", "Lkotlin/Function0;", "onCanceled", "runTask", "(Lcom/google/android/gms/tasks/Task;Le23/a;Lt13/d;)Ljava/lang/Object;", "Lr53/i;", "Lcom/google/android/play/core/ktx/AppUpdateResult;", "requestUpdateFlow", "(Lcom/google/android/play/core/appupdate/AppUpdateManager;)Lr53/i;", "appUpdateInfo", "Landroidx/fragment/app/Fragment;", "fragment", "Lcom/google/android/play/core/appupdate/AppUpdateOptions;", "options", "", "requestCode", "", "startUpdateFlowForResult", "(Lcom/google/android/play/core/appupdate/AppUpdateManager;Lcom/google/android/play/core/appupdate/AppUpdateInfo;Landroidx/fragment/app/Fragment;Lcom/google/android/play/core/appupdate/AppUpdateOptions;I)Z", "E", "Lq53/w;", "element", "tryOffer", "(Lq53/w;Ljava/lang/Object;)Z", "Lcom/google/android/play/core/install/InstallState;", "getInstallErrorCode", "(Lcom/google/android/play/core/install/InstallState;)I", "installErrorCode", "getInstallStatus", "(Lcom/google/android/play/core/appupdate/AppUpdateInfo;)I", "installStatus", "getUpdatePriority", "updatePriority", "", "getBytesDownloaded", "(Lcom/google/android/play/core/appupdate/AppUpdateInfo;)J", "bytesDownloaded", "(Lcom/google/android/play/core/install/InstallState;)J", "getTotalBytesToDownload", "totalBytesToDownload", "getClientVersionStalenessDays", "(Lcom/google/android/play/core/appupdate/AppUpdateInfo;)Ljava/lang/Integer;", "clientVersionStalenessDays", "", "getPackageName", "(Lcom/google/android/play/core/install/InstallState;)Ljava/lang/String;", RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME, "getHasTerminalStatus", "(Lcom/google/android/play/core/install/InstallState;)Z", "hasTerminalStatus", "isFlexibleUpdateAllowed", "(Lcom/google/android/play/core/appupdate/AppUpdateInfo;)Z", "isImmediateUpdateAllowed", "java.com.google.android.apps.play.store.sdk.playcore.ktx_playcore_app_update_ktx"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class AppUpdateManagerKtxKt {

    /* JADX INFO: renamed from: com.google.android.play.core.ktx.AppUpdateManagerKtxKt$requestAppUpdateInfo$1, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @e(c = "com.google.android.play.core.ktx.AppUpdateManagerKtxKt", f = "AppUpdateManagerKtx.kt", l = {226}, m = "requestAppUpdateInfo")
    public static final class AnonymousClass1 extends c {
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(d<? super AnonymousClass1> dVar) {
            super(dVar);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AppUpdateManagerKtxKt.requestAppUpdateInfo(null, this);
        }
    }

    public static final long getBytesDownloaded(AppUpdateInfo appUpdateInfo) {
        appUpdateInfo.getClass();
        return appUpdateInfo.bytesDownloaded();
    }

    public static final Integer getClientVersionStalenessDays(AppUpdateInfo appUpdateInfo) {
        appUpdateInfo.getClass();
        return appUpdateInfo.clientVersionStalenessDays();
    }

    public static final boolean getHasTerminalStatus(InstallState installState) {
        installState.getClass();
        int iInstallStatus = installState.installStatus();
        return iInstallStatus == 0 || iInstallStatus == 11 || iInstallStatus == 5 || iInstallStatus == 6;
    }

    @InstallErrorCode
    public static final int getInstallErrorCode(InstallState installState) {
        installState.getClass();
        return installState.installErrorCode();
    }

    @InstallStatus
    public static final int getInstallStatus(AppUpdateInfo appUpdateInfo) {
        appUpdateInfo.getClass();
        return appUpdateInfo.installStatus();
    }

    public static final String getPackageName(InstallState installState) {
        installState.getClass();
        String strPackageName = installState.packageName();
        strPackageName.getClass();
        return strPackageName;
    }

    public static final long getTotalBytesToDownload(AppUpdateInfo appUpdateInfo) {
        appUpdateInfo.getClass();
        return appUpdateInfo.totalBytesToDownload();
    }

    public static final int getUpdatePriority(AppUpdateInfo appUpdateInfo) {
        appUpdateInfo.getClass();
        return appUpdateInfo.updatePriority();
    }

    public static final boolean isFlexibleUpdateAllowed(AppUpdateInfo appUpdateInfo) {
        appUpdateInfo.getClass();
        return appUpdateInfo.isUpdateTypeAllowed(0);
    }

    public static final boolean isImmediateUpdateAllowed(AppUpdateInfo appUpdateInfo) {
        appUpdateInfo.getClass();
        return appUpdateInfo.isUpdateTypeAllowed(1);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object requestAppUpdateInfo(AppUpdateManager appUpdateManager, d<? super AppUpdateInfo> dVar) {
        AnonymousClass1 anonymousClass1;
        if (dVar instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) dVar;
            int i14 = anonymousClass1.label;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i14 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(dVar);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(dVar);
        }
        Object objRunTask$default = anonymousClass1.result;
        a aVar = a.COROUTINE_SUSPENDED;
        int i15 = anonymousClass1.label;
        if (i15 == 0) {
            r.b(objRunTask$default);
            Task<AppUpdateInfo> appUpdateInfo = appUpdateManager.getAppUpdateInfo();
            appUpdateInfo.getClass();
            anonymousClass1.label = 1;
            objRunTask$default = runTask$default(appUpdateInfo, null, anonymousClass1, 2, null);
            if (objRunTask$default == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(objRunTask$default);
        }
        objRunTask$default.getClass();
        return objRunTask$default;
    }

    public static final Object requestCompleteUpdate(AppUpdateManager appUpdateManager, d<? super Unit> dVar) {
        Task<Void> taskCompleteUpdate = appUpdateManager.completeUpdate();
        taskCompleteUpdate.getClass();
        Object objRunTask$default = runTask$default(taskCompleteUpdate, null, dVar, 2, null);
        return objRunTask$default == a.COROUTINE_SUSPENDED ? objRunTask$default : Unit.INSTANCE;
    }

    public static final i<AppUpdateResult> requestUpdateFlow(AppUpdateManager appUpdateManager) {
        appUpdateManager.getClass();
        return s.o(s.f(new C39141(appUpdateManager, null)));
    }

    public static final <T> Object runTask(Task<T> task, e23.a<Unit> aVar, d<? super T> dVar) throws Throwable {
        final k kVar = new k(f.b(dVar), 1);
        kVar.q();
        kVar.r(new AppUpdateManagerKtxKt$runTask$3$1(aVar));
        if (!task.isComplete()) {
            task.addOnSuccessListener(new OnSuccessListener() { // from class: com.google.android.play.core.ktx.AppUpdateManagerKtxKt$runTask$3$2
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
                @Override // com.google.android.gms.tasks.OnSuccessListener
                public final void onSuccess(T t7) {
                    d dVar2 = kVar;
                    int i14 = q.f128596b;
                    dVar2.resumeWith(t7);
                }
            });
            task.addOnFailureListener(new OnFailureListener() { // from class: com.google.android.play.core.ktx.AppUpdateManagerKtxKt$runTask$3$3
                @Override // com.google.android.gms.tasks.OnFailureListener
                public final void onFailure(Exception exc) {
                    exc.getClass();
                    d dVar2 = kVar;
                    Object bVar = new q.b(exc);
                    int i14 = q.f128596b;
                    dVar2.resumeWith(bVar);
                }
            });
        } else if (task.isSuccessful()) {
            T result = task.getResult();
            int i14 = q.f128596b;
            kVar.resumeWith(result);
        } else {
            Exception exception = task.getException();
            exception.getClass();
            q.b bVar = new q.b(exception);
            int i15 = q.f128596b;
            kVar.resumeWith(bVar);
        }
        Object objP = kVar.p();
        a aVar2 = a.COROUTINE_SUSPENDED;
        return objP;
    }

    public static /* synthetic */ Object runTask$default(Task task, e23.a aVar, d dVar, int i14, Object obj) {
        if ((i14 & 2) != 0) {
            aVar = AnonymousClass2.INSTANCE;
        }
        return runTask(task, aVar, dVar);
    }

    public static final boolean startUpdateFlowForResult(AppUpdateManager appUpdateManager, AppUpdateInfo appUpdateInfo, final Fragment fragment, AppUpdateOptions appUpdateOptions, int i14) {
        appUpdateManager.getClass();
        appUpdateInfo.getClass();
        fragment.getClass();
        appUpdateOptions.getClass();
        return appUpdateManager.startUpdateFlowForResult(appUpdateInfo, new IntentSenderForResultStarter() { // from class: com.google.android.play.core.ktx.AppUpdateManagerKtxKt.startUpdateFlowForResult.1
            @Override // com.google.android.play.core.common.IntentSenderForResultStarter
            public final void startIntentSenderForResult(IntentSender intentSender, int i15, Intent intent, int i16, int i17, int i18, Bundle bundle) {
                intentSender.getClass();
                fragment.startIntentSenderForResult(intentSender, i15, intent, i16, i17, i18, bundle);
            }
        }, appUpdateOptions, i14);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <E> boolean tryOffer(w<? super E> wVar, E e4) {
        wVar.getClass();
        Object objI = wVar.i(e4);
        m.b bVar = m.f142998b;
        return !(objI instanceof m.c);
    }

    /* JADX INFO: renamed from: com.google.android.play.core.ktx.AppUpdateManagerKtxKt$runTask$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "T", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class AnonymousClass2 extends p005kotlin.jvm.internal.w implements e23.a<Unit> {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        public AnonymousClass2() {
            super(0);
        }

        @Override // e23.a
        public final /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }
    }

    /* JADX INFO: renamed from: com.google.android.play.core.ktx.AppUpdateManagerKtxKt$requestUpdateFlow$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lq53/t;", "Lcom/google/android/play/core/ktx/AppUpdateResult;", "", "<anonymous>", "(Lq53/t;)V"}, k = 3, mv = {1, 8, 0})
    @e(c = "com.google.android.play.core.ktx.AppUpdateManagerKtxKt$requestUpdateFlow$1", f = "AppUpdateManagerKtx.kt", l = {90}, m = "invokeSuspend")
    public static final class C39141 extends v13.i implements p<t<? super AppUpdateResult>, d<? super Unit>, Object> {
        final /* synthetic */ AppUpdateManager $this_requestUpdateFlow;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C39141(AppUpdateManager appUpdateManager, d<? super C39141> dVar) {
            super(2, dVar);
            this.$this_requestUpdateFlow = appUpdateManager;
        }

        @Override // v13.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            C39141 c39141 = new C39141(this.$this_requestUpdateFlow, dVar);
            c39141.L$0 = obj;
            return c39141;
        }

        @Override // e23.p
        public final Object invoke(t<? super AppUpdateResult> tVar, d<? super Unit> dVar) {
            return ((C39141) create(tVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.COROUTINE_SUSPENDED;
            int i14 = this.label;
            if (i14 == 0) {
                r.b(obj);
                final t tVar = (t) this.L$0;
                final AppUpdateManager appUpdateManager = this.$this_requestUpdateFlow;
                final AppUpdatePassthroughListener appUpdatePassthroughListener = new AppUpdatePassthroughListener(new InstallStateUpdatedListener() { // from class: com.google.android.play.core.ktx.AppUpdateManagerKtxKt$requestUpdateFlow$1$globalUpdateListener$1
                    @Override // com.google.android.play.core.listener.StateUpdatedListener
                    public final void onStateUpdate(InstallState installState) {
                        installState.getClass();
                        int iInstallStatus = installState.installStatus();
                        t<AppUpdateResult> tVar2 = tVar;
                        if (iInstallStatus == 11) {
                            AppUpdateManagerKtxKt.tryOffer(tVar2, new AppUpdateResult.Downloaded(appUpdateManager));
                        } else {
                            AppUpdateManagerKtxKt.tryOffer(tVar2, new AppUpdateResult.InProgress(installState));
                        }
                    }
                }, new AppUpdateManagerKtxKt$requestUpdateFlow$1$globalUpdateListener$2(tVar));
                Task<AppUpdateInfo> appUpdateInfo = this.$this_requestUpdateFlow.getAppUpdateInfo();
                final AppUpdateManager appUpdateManager2 = this.$this_requestUpdateFlow;
                appUpdateInfo.addOnSuccessListener(new OnSuccessListener() { // from class: com.google.android.play.core.ktx.AppUpdateManagerKtxKt.requestUpdateFlow.1.1
                    @Override // com.google.android.gms.tasks.OnSuccessListener
                    public final void onSuccess(AppUpdateInfo appUpdateInfo2) {
                        int iUpdateAvailability = appUpdateInfo2.updateAvailability();
                        if (iUpdateAvailability == 0) {
                            tVar.q(new InstallException(-2));
                            return;
                        }
                        if (iUpdateAvailability == 1) {
                            AppUpdateManagerKtxKt.tryOffer(tVar, AppUpdateResult.NotAvailable.INSTANCE);
                            tVar.q(null);
                        } else if (iUpdateAvailability == 2 || iUpdateAvailability == 3) {
                            if (appUpdateInfo2.installStatus() == 11) {
                                AppUpdateManagerKtxKt.tryOffer(tVar, new AppUpdateResult.Downloaded(appUpdateManager2));
                                tVar.q(null);
                            } else {
                                appUpdateManager2.registerListener(appUpdatePassthroughListener);
                                AppUpdateManagerKtxKt.tryOffer(tVar, new AppUpdateResult.Available(appUpdateManager2, appUpdateInfo2));
                            }
                        }
                    }
                }).addOnFailureListener(new OnFailureListener() { // from class: com.google.android.play.core.ktx.AppUpdateManagerKtxKt.requestUpdateFlow.1.2
                    @Override // com.google.android.gms.tasks.OnFailureListener
                    public final void onFailure(Exception exc) {
                        exc.getClass();
                        tVar.q(exc);
                    }
                });
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.$this_requestUpdateFlow, appUpdatePassthroughListener);
                this.label = 1;
                if (q53.r.a(tVar, anonymousClass3, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: com.google.android.play.core.ktx.AppUpdateManagerKtxKt$requestUpdateFlow$1$3, reason: invalid class name */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        public static final class AnonymousClass3 extends p005kotlin.jvm.internal.w implements e23.a<Unit> {
            final /* synthetic */ AppUpdatePassthroughListener $globalUpdateListener;
            final /* synthetic */ AppUpdateManager $this_requestUpdateFlow;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass3(AppUpdateManager appUpdateManager, AppUpdatePassthroughListener appUpdatePassthroughListener) {
                super(0);
                this.$this_requestUpdateFlow = appUpdateManager;
                this.$globalUpdateListener = appUpdatePassthroughListener;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.$this_requestUpdateFlow.unregisterListener(this.$globalUpdateListener);
            }

            @Override // e23.a
            public final /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }
        }
    }

    public static final long getBytesDownloaded(InstallState installState) {
        installState.getClass();
        return installState.bytesDownloaded();
    }

    @InstallStatus
    public static final int getInstallStatus(InstallState installState) {
        installState.getClass();
        return installState.installStatus();
    }

    public static final long getTotalBytesToDownload(InstallState installState) {
        installState.getClass();
        return installState.totalBytesToDownload();
    }
}

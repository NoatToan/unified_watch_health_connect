package com.google.accompanist.permissions;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c.q;
import e23.l;
import g.g;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.w;
import p3.h0;
import p3.i0;
import p3.l0;
import p3.m;
import p3.n;
import p3.x1;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a-\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0001¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"", "permission", "Lkotlin/Function1;", "", "", "onPermissionResult", "Lcom/google/accompanist/permissions/MutablePermissionState;", "rememberMutablePermissionState", "(Ljava/lang/String;Le23/l;Lp3/m;II)Lcom/google/accompanist/permissions/MutablePermissionState;", "permissions_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class MutablePermissionStateKt {

    /* JADX INFO: renamed from: com.google.accompanist.permissions.MutablePermissionStateKt$rememberMutablePermissionState$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lp3/i0;", "Lp3/h0;", "invoke", "(Lp3/i0;)Lp3/h0;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class AnonymousClass2 extends w implements l<i0, h0> {
        final /* synthetic */ q<String, Boolean> $launcher;
        final /* synthetic */ MutablePermissionState $permissionState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(MutablePermissionState mutablePermissionState, q<String, Boolean> qVar) {
            super(1);
            this.$permissionState = mutablePermissionState;
            this.$launcher = qVar;
        }

        @Override // e23.l
        public final h0 invoke(i0 i0Var) {
            i0Var.getClass();
            this.$permissionState.setLauncher$permissions_release(this.$launcher);
            final MutablePermissionState mutablePermissionState = this.$permissionState;
            return new h0() { // from class: com.google.accompanist.permissions.MutablePermissionStateKt$rememberMutablePermissionState$2$invoke$$inlined$onDispose$1
                @Override // p3.h0
                public void dispose() {
                    mutablePermissionState.setLauncher$permissions_release(null);
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0044  */
    /* JADX WARN: Code duplicated, block: B:30:0x008b  */
    @ExperimentalPermissionsApi
    public static final MutablePermissionState rememberMutablePermissionState(String str, l<? super Boolean, Unit> lVar, m mVar, int i14, int i15) {
        str.getClass();
        mVar.L(1424240517);
        if ((i15 & 2) != 0) {
            lVar = AnonymousClass1.INSTANCE;
        }
        x1 x1Var = n.f135158a;
        Context context = (Context) mVar.A(AndroidCompositionLocals_androidKt.f6042b);
        mVar.L(-1903070007);
        boolean z14 = true;
        boolean z15 = (((i14 & 14) ^ 6) > 4 && mVar.B(str)) || (i14 & 6) == 4;
        Object objQ = mVar.q();
        m.a aVar = m.f135153a;
        if (z15) {
            objQ = new MutablePermissionState(str, context, PermissionsUtilKt.findActivity(context));
            mVar.K(objQ);
        } else {
            aVar.getClass();
            if (objQ == m.a.f135155b) {
                objQ = new MutablePermissionState(str, context, PermissionsUtilKt.findActivity(context));
                mVar.K(objQ);
            }
        }
        MutablePermissionState mutablePermissionState = (MutablePermissionState) objQ;
        mVar.R();
        PermissionsUtilKt.PermissionLifecycleCheckerEffect(mutablePermissionState, null, mVar, 0, 2);
        g gVar = new g();
        mVar.L(-1903069605);
        boolean zB = mVar.B(mutablePermissionState);
        if ((((i14 & 112) ^ 48) <= 32 || !mVar.r(lVar)) && (i14 & 48) != 32) {
            z14 = false;
        }
        boolean z16 = zB | z14;
        Object objQ2 = mVar.q();
        if (z16) {
            objQ2 = new MutablePermissionStateKt$rememberMutablePermissionState$launcher$1$1(mutablePermissionState, lVar);
            mVar.K(objQ2);
        } else {
            aVar.getClass();
            if (objQ2 == m.a.f135155b) {
                objQ2 = new MutablePermissionStateKt$rememberMutablePermissionState$launcher$1$1(mutablePermissionState, lVar);
                mVar.K(objQ2);
            }
        }
        mVar.R();
        q qVarC = c.w.c(gVar, (l) objQ2, mVar, 8);
        l0.b(mutablePermissionState, qVarC, new AnonymousClass2(mutablePermissionState, qVarC), mVar);
        mVar.R();
        return mutablePermissionState;
    }

    /* JADX INFO: renamed from: com.google.accompanist.permissions.MutablePermissionStateKt$rememberMutablePermissionState$1, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class AnonymousClass1 extends w implements l<Boolean, Unit> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        @Override // e23.l
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke(bool.booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(boolean z14) {
        }
    }
}

package com.google.accompanist.permissions;

import a7.b;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.core.view.q;
import androidx.lifecycle.b0;
import androidx.lifecycle.k0;
import androidx.lifecycle.n0;
import e23.l;
import e23.p;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.w;
import p3.h0;
import p3.i0;
import p3.l0;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import vb.h;
import z6.a;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a!\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a'\u0010\t\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00000\u00072\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\t\u0010\n\u001a\u0013\u0010\r\u001a\u00020\f*\u00020\u000bH\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a\u001b\u0010\u0012\u001a\u00020\u0011*\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u001b\u0010\u0014\u001a\u00020\u0011*\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u0014\u0010\u0015\"\u001e\u0010\u0017\u001a\u00020\u0011*\u00020\u00168FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0017\u0010\u0018\"\u001e\u0010\u0014\u001a\u00020\u0011*\u00020\u00168FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u001c\u0010\u001a\u001a\u0004\b\u001b\u0010\u0018¨\u0006\u001d"}, d2 = {"Lcom/google/accompanist/permissions/MutablePermissionState;", "permissionState", "Landroidx/lifecycle/b0$a;", "lifecycleEvent", "", "PermissionLifecycleCheckerEffect", "(Lcom/google/accompanist/permissions/MutablePermissionState;Landroidx/lifecycle/b0$a;Lp3/m;II)V", "", "permissions", "PermissionsLifecycleCheckerEffect", "(Ljava/util/List;Landroidx/lifecycle/b0$a;Lp3/m;II)V", "Landroid/content/Context;", "Landroid/app/Activity;", "findActivity", "(Landroid/content/Context;)Landroid/app/Activity;", "", "permission", "", "checkPermission", "(Landroid/content/Context;Ljava/lang/String;)Z", "shouldShowRationale", "(Landroid/app/Activity;Ljava/lang/String;)Z", "Lcom/google/accompanist/permissions/PermissionStatus;", "isGranted", "(Lcom/google/accompanist/permissions/PermissionStatus;)Z", "isGranted$annotations", "(Lcom/google/accompanist/permissions/PermissionStatus;)V", "getShouldShowRationale", "getShouldShowRationale$annotations", "permissions_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class PermissionsUtilKt {

    /* JADX INFO: renamed from: com.google.accompanist.permissions.PermissionsUtilKt$PermissionLifecycleCheckerEffect$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lp3/i0;", "Lp3/h0;", "invoke", "(Lp3/i0;)Lp3/h0;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class AnonymousClass1 extends w implements l<i0, h0> {
        final /* synthetic */ b0 $lifecycle;
        final /* synthetic */ k0 $permissionCheckerObserver;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(b0 b0Var, k0 k0Var) {
            super(1);
            this.$lifecycle = b0Var;
            this.$permissionCheckerObserver = k0Var;
        }

        @Override // e23.l
        public final h0 invoke(i0 i0Var) {
            i0Var.getClass();
            this.$lifecycle.a(this.$permissionCheckerObserver);
            final b0 b0Var = this.$lifecycle;
            final k0 k0Var = this.$permissionCheckerObserver;
            return new h0() { // from class: com.google.accompanist.permissions.PermissionsUtilKt$PermissionLifecycleCheckerEffect$1$invoke$$inlined$onDispose$1
                @Override // p3.h0
                public void dispose() {
                    b0Var.d(k0Var);
                }
            };
        }
    }

    /* JADX INFO: renamed from: com.google.accompanist.permissions.PermissionsUtilKt$PermissionsLifecycleCheckerEffect$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lp3/i0;", "Lp3/h0;", "invoke", "(Lp3/i0;)Lp3/h0;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class C39121 extends w implements l<i0, h0> {
        final /* synthetic */ b0 $lifecycle;
        final /* synthetic */ k0 $permissionsCheckerObserver;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C39121(b0 b0Var, k0 k0Var) {
            super(1);
            this.$lifecycle = b0Var;
            this.$permissionsCheckerObserver = k0Var;
        }

        @Override // e23.l
        public final h0 invoke(i0 i0Var) {
            i0Var.getClass();
            this.$lifecycle.a(this.$permissionsCheckerObserver);
            final b0 b0Var = this.$lifecycle;
            final k0 k0Var = this.$permissionsCheckerObserver;
            return new h0() { // from class: com.google.accompanist.permissions.PermissionsUtilKt$PermissionsLifecycleCheckerEffect$1$invoke$$inlined$onDispose$1
                @Override // p3.h0
                public void dispose() {
                    b0Var.d(k0Var);
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x006d  */
    @ExperimentalPermissionsApi
    public static final void PermissionLifecycleCheckerEffect(MutablePermissionState mutablePermissionState, b0.a aVar, m mVar, int i14, int i15) {
        int i16;
        mutablePermissionState.getClass();
        o0 o0VarE = mVar.E(-1770945943);
        if ((i15 & 1) != 0) {
            i16 = i14 | 6;
        } else if ((i14 & 14) == 0) {
            i16 = (o0VarE.B(mutablePermissionState) ? 4 : 2) | i14;
        } else {
            i16 = i14;
        }
        int i17 = i15 & 2;
        if (i17 != 0) {
            i16 |= 48;
        } else if ((i14 & 112) == 0) {
            i16 |= o0VarE.B(aVar) ? 32 : 16;
        }
        if ((i16 & 91) == 18 && o0VarE.b()) {
            o0VarE.e();
        } else {
            if (i17 != 0) {
                aVar = b0.a.ON_RESUME;
            }
            x1 x1Var = n.f135158a;
            o0VarE.L(-899069773);
            boolean z14 = (i16 & 14) == 4;
            Object objQ = o0VarE.q();
            if (z14) {
                objQ = new q(3, aVar, mutablePermissionState);
                o0VarE.K(objQ);
            } else {
                m.f135153a.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new q(3, aVar, mutablePermissionState);
                    o0VarE.K(objQ);
                }
            }
            k0 k0Var = (k0) objQ;
            o0VarE.g0(false);
            b0 f158017a = ((n0) o0VarE.A(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner())).getF158016a();
            l0.b(f158017a, k0Var, new AnonymousClass1(f158017a, k0Var), o0VarE);
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new AnonymousClass2(mutablePermissionState, aVar, i14, i15);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void PermissionLifecycleCheckerEffect$lambda$1$lambda$0(b0.a aVar, MutablePermissionState mutablePermissionState, n0 n0Var, b0.a aVar2) {
        mutablePermissionState.getClass();
        n0Var.getClass();
        aVar2.getClass();
        if (aVar2 != aVar || s.g(mutablePermissionState.getStatus(), PermissionStatus.Granted.INSTANCE)) {
            return;
        }
        mutablePermissionState.refreshPermissionStatus$permissions_release();
    }

    /* JADX WARN: Code duplicated, block: B:9:0x002b  */
    @ExperimentalPermissionsApi
    public static final void PermissionsLifecycleCheckerEffect(List<MutablePermissionState> list, b0.a aVar, m mVar, int i14, int i15) {
        list.getClass();
        o0 o0VarE = mVar.E(1533427666);
        if ((i15 & 2) != 0) {
            aVar = b0.a.ON_RESUME;
        }
        x1 x1Var = n.f135158a;
        o0VarE.L(-1664752182);
        boolean zB = o0VarE.B(list);
        Object objQ = o0VarE.q();
        if (zB) {
            objQ = new q(4, aVar, list);
            o0VarE.K(objQ);
        } else {
            m.f135153a.getClass();
            if (objQ == m.a.f135155b) {
                objQ = new q(4, aVar, list);
                o0VarE.K(objQ);
            }
        }
        k0 k0Var = (k0) objQ;
        o0VarE.g0(false);
        b0 f158017a = ((n0) o0VarE.A(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner())).getF158016a();
        l0.b(f158017a, k0Var, new C39121(f158017a, k0Var), o0VarE);
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new C39132(list, aVar, i14, i15);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void PermissionsLifecycleCheckerEffect$lambda$3$lambda$2(b0.a aVar, List list, n0 n0Var, b0.a aVar2) {
        list.getClass();
        n0Var.getClass();
        aVar2.getClass();
        if (aVar2 == aVar) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                MutablePermissionState mutablePermissionState = (MutablePermissionState) it.next();
                if (!s.g(mutablePermissionState.getStatus(), PermissionStatus.Granted.INSTANCE)) {
                    mutablePermissionState.refreshPermissionStatus$permissions_release();
                }
            }
        }
    }

    public static final boolean checkPermission(Context context, String str) {
        context.getClass();
        str.getClass();
        return b.checkSelfPermission(context, str) == 0;
    }

    public static final Activity findActivity(Context context) {
        context.getClass();
        while (context instanceof ContextWrapper) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
            context = ((ContextWrapper) context).getBaseContext();
            context.getClass();
        }
        h.z("Permissions should be called in the context of an Activity");
        return null;
    }

    public static final boolean getShouldShowRationale(PermissionStatus permissionStatus) {
        permissionStatus.getClass();
        if (permissionStatus.equals(PermissionStatus.Granted.INSTANCE)) {
            return false;
        }
        if (permissionStatus instanceof PermissionStatus.Denied) {
            return ((PermissionStatus.Denied) permissionStatus).getShouldShowRationale();
        }
        u0.r();
        return false;
    }

    @ExperimentalPermissionsApi
    public static /* synthetic */ void getShouldShowRationale$annotations(PermissionStatus permissionStatus) {
    }

    public static final boolean isGranted(PermissionStatus permissionStatus) {
        permissionStatus.getClass();
        return permissionStatus.equals(PermissionStatus.Granted.INSTANCE);
    }

    @ExperimentalPermissionsApi
    public static /* synthetic */ void isGranted$annotations(PermissionStatus permissionStatus) {
    }

    public static final boolean shouldShowRationale(Activity activity, String str) {
        activity.getClass();
        str.getClass();
        return a.b(activity, str);
    }

    /* JADX INFO: renamed from: com.google.accompanist.permissions.PermissionsUtilKt$PermissionLifecycleCheckerEffect$2, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class AnonymousClass2 extends w implements p<m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ b0.a $lifecycleEvent;
        final /* synthetic */ MutablePermissionState $permissionState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(MutablePermissionState mutablePermissionState, b0.a aVar, int i14, int i15) {
            super(2);
            this.$permissionState = mutablePermissionState;
            this.$lifecycleEvent = aVar;
            this.$$changed = i14;
            this.$$default = i15;
        }

        public final void invoke(m mVar, int i14) {
            PermissionsUtilKt.PermissionLifecycleCheckerEffect(this.$permissionState, this.$lifecycleEvent, mVar, p0.t(this.$$changed | 1), this.$$default);
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
            invoke(mVar, num.intValue());
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.google.accompanist.permissions.PermissionsUtilKt$PermissionsLifecycleCheckerEffect$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class C39132 extends w implements p<m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ b0.a $lifecycleEvent;
        final /* synthetic */ List<MutablePermissionState> $permissions;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C39132(List<MutablePermissionState> list, b0.a aVar, int i14, int i15) {
            super(2);
            this.$permissions = list;
            this.$lifecycleEvent = aVar;
            this.$$changed = i14;
            this.$$default = i15;
        }

        public final void invoke(m mVar, int i14) {
            PermissionsUtilKt.PermissionsLifecycleCheckerEffect(this.$permissions, this.$lifecycleEvent, mVar, p0.t(this.$$changed | 1), this.$$default);
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
            invoke(mVar, num.intValue());
            return Unit.INSTANCE;
        }
    }
}

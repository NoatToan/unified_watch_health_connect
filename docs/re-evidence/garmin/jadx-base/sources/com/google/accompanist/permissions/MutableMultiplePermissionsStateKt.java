package com.google.accompanist.permissions;

import android.app.Activity;
import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c.q;
import e23.l;
import g.f;
import g.g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.w;
import p13.y;
import p3.h0;
import p3.i0;
import p3.l0;
import p3.m;
import p3.n;
import p3.x1;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a?\u0010\t\u001a\u00020\b2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002 \b\u0002\u0010\u0007\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0004\u0012\u00020\u00060\u0003H\u0001¢\u0006\u0004\b\t\u0010\n\u001a#\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0003¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"", "", "permissions", "Lkotlin/Function1;", "", "", "", "onPermissionsResult", "Lcom/google/accompanist/permissions/MultiplePermissionsState;", "rememberMutableMultiplePermissionsState", "(Ljava/util/List;Le23/l;Lp3/m;II)Lcom/google/accompanist/permissions/MultiplePermissionsState;", "Lcom/google/accompanist/permissions/MutablePermissionState;", "rememberMutablePermissionsState", "(Ljava/util/List;Lp3/m;I)Ljava/util/List;", "permissions_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class MutableMultiplePermissionsStateKt {

    /* JADX INFO: renamed from: com.google.accompanist.permissions.MutableMultiplePermissionsStateKt$rememberMutableMultiplePermissionsState$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lp3/i0;", "Lp3/h0;", "invoke", "(Lp3/i0;)Lp3/h0;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class AnonymousClass2 extends w implements l<i0, h0> {
        final /* synthetic */ q<String[], Map<String, Boolean>> $launcher;
        final /* synthetic */ MutableMultiplePermissionsState $multiplePermissionsState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(MutableMultiplePermissionsState mutableMultiplePermissionsState, q<String[], Map<String, Boolean>> qVar) {
            super(1);
            this.$multiplePermissionsState = mutableMultiplePermissionsState;
            this.$launcher = qVar;
        }

        @Override // e23.l
        public final h0 invoke(i0 i0Var) {
            i0Var.getClass();
            this.$multiplePermissionsState.setLauncher$permissions_release(this.$launcher);
            final MutableMultiplePermissionsState mutableMultiplePermissionsState = this.$multiplePermissionsState;
            return new h0() { // from class: com.google.accompanist.permissions.MutableMultiplePermissionsStateKt$rememberMutableMultiplePermissionsState$2$invoke$$inlined$onDispose$1
                @Override // p3.h0
                public void dispose() {
                    mutableMultiplePermissionsState.setLauncher$permissions_release(null);
                }
            };
        }
    }

    /* JADX INFO: renamed from: com.google.accompanist.permissions.MutableMultiplePermissionsStateKt$rememberMutablePermissionsState$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lp3/i0;", "Lp3/h0;", "invoke", "(Lp3/i0;)Lp3/h0;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class C39111 extends w implements l<i0, h0> {
        final /* synthetic */ q<String, Boolean> $launcher;
        final /* synthetic */ MutablePermissionState $permissionState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C39111(MutablePermissionState mutablePermissionState, q<String, Boolean> qVar) {
            super(1);
            this.$permissionState = mutablePermissionState;
            this.$launcher = qVar;
        }

        @Override // e23.l
        public final h0 invoke(i0 i0Var) {
            i0Var.getClass();
            this.$permissionState.setLauncher$permissions_release(this.$launcher);
            final MutablePermissionState mutablePermissionState = this.$permissionState;
            return new h0() { // from class: com.google.accompanist.permissions.MutableMultiplePermissionsStateKt$rememberMutablePermissionsState$1$invoke$$inlined$onDispose$1
                @Override // p3.h0
                public void dispose() {
                    mutablePermissionState.setLauncher$permissions_release(null);
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0073  */
    /* JADX WARN: Code duplicated, block: B:9:0x0034  */
    @ExperimentalPermissionsApi
    public static final MultiplePermissionsState rememberMutableMultiplePermissionsState(List<String> list, l<? super Map<String, Boolean>, Unit> lVar, m mVar, int i14, int i15) {
        list.getClass();
        mVar.L(-2044770427);
        if ((i15 & 2) != 0) {
            lVar = AnonymousClass1.INSTANCE;
        }
        x1 x1Var = n.f135158a;
        List<MutablePermissionState> listRememberMutablePermissionsState = rememberMutablePermissionsState(list, mVar, 8);
        PermissionsUtilKt.PermissionsLifecycleCheckerEffect(listRememberMutablePermissionsState, null, mVar, 8, 2);
        mVar.L(-1585748799);
        boolean zB = mVar.B(list);
        Object objQ = mVar.q();
        m.a aVar = m.f135153a;
        if (zB) {
            objQ = new MutableMultiplePermissionsState(listRememberMutablePermissionsState);
            mVar.K(objQ);
        } else {
            aVar.getClass();
            if (objQ == m.a.f135155b) {
                objQ = new MutableMultiplePermissionsState(listRememberMutablePermissionsState);
                mVar.K(objQ);
            }
        }
        MutableMultiplePermissionsState mutableMultiplePermissionsState = (MutableMultiplePermissionsState) objQ;
        mVar.R();
        f fVar = new f();
        mVar.L(-1585748493);
        boolean zB2 = ((((i14 & 112) ^ 48) > 32 && mVar.r(lVar)) || (i14 & 48) == 32) | mVar.B(mutableMultiplePermissionsState);
        Object objQ2 = mVar.q();
        if (zB2) {
            objQ2 = new MutableMultiplePermissionsStateKt$rememberMutableMultiplePermissionsState$launcher$1$1(mutableMultiplePermissionsState, lVar);
            mVar.K(objQ2);
        } else {
            aVar.getClass();
            if (objQ2 == m.a.f135155b) {
                objQ2 = new MutableMultiplePermissionsStateKt$rememberMutableMultiplePermissionsState$launcher$1$1(mutableMultiplePermissionsState, lVar);
                mVar.K(objQ2);
            }
        }
        mVar.R();
        q qVarC = c.w.c(fVar, (l) objQ2, mVar, 8);
        l0.b(mutableMultiplePermissionsState, qVarC, new AnonymousClass2(mutableMultiplePermissionsState, qVarC), mVar);
        mVar.R();
        return mutableMultiplePermissionsState;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x008f  */
    /* JADX WARN: Code duplicated, block: B:6:0x002d  */
    /* JADX WARN: Code duplicated, block: B:9:0x0042 A[LOOP:1: B:7:0x003c->B:9:0x0042, LOOP_END] */
    @ExperimentalPermissionsApi
    private static final List<MutablePermissionState> rememberMutablePermissionsState(List<String> list, m mVar, int i14) {
        ArrayList arrayList;
        Iterator<T> it;
        Object obj;
        mVar.L(992349447);
        x1 x1Var = n.f135158a;
        Context context = (Context) mVar.A(AndroidCompositionLocals_androidKt.f6042b);
        Activity activityFindActivity = PermissionsUtilKt.findActivity(context);
        mVar.L(-1458104306);
        boolean zB = mVar.B(list);
        Object objQ = mVar.q();
        m.a aVar = m.f135153a;
        if (zB) {
            obj = objQ;
            arrayList = new ArrayList(y.r(list, 10));
            it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new MutablePermissionState((String) it.next(), context, activityFindActivity));
            }
            mVar.K(arrayList);
            obj = arrayList;
        } else {
            aVar.getClass();
            if (objQ == m.a.f135155b) {
                obj = objQ;
                arrayList = new ArrayList(y.r(list, 10));
                it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(new MutablePermissionState((String) it.next(), context, activityFindActivity));
                }
                mVar.K(arrayList);
                obj = arrayList;
            }
        }
        obj = objQ;
        List<MutablePermissionState> list2 = (List) obj;
        mVar.R();
        for (MutablePermissionState mutablePermissionState : list2) {
            mVar.N(-1458104076, mutablePermissionState.getPermission());
            g gVar = new g();
            mVar.L(-1458103836);
            boolean zB2 = mVar.B(mutablePermissionState);
            Object objQ2 = mVar.q();
            if (zB2) {
                objQ2 = new MutableMultiplePermissionsStateKt$rememberMutablePermissionsState$launcher$1$1(mutablePermissionState);
                mVar.K(objQ2);
            } else {
                aVar.getClass();
                if (objQ2 == m.a.f135155b) {
                    objQ2 = new MutableMultiplePermissionsStateKt$rememberMutablePermissionsState$launcher$1$1(mutablePermissionState);
                    mVar.K(objQ2);
                }
            }
            mVar.R();
            q qVarC = c.w.c(gVar, (l) objQ2, mVar, 8);
            l0.a(qVarC, new C39111(mutablePermissionState, qVarC), mVar);
            mVar.Q();
        }
        x1 x1Var2 = n.f135158a;
        mVar.R();
        return list2;
    }

    /* JADX INFO: renamed from: com.google.accompanist.permissions.MutableMultiplePermissionsStateKt$rememberMutableMultiplePermissionsState$1, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class AnonymousClass1 extends w implements l<Map<String, ? extends Boolean>, Unit> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        @Override // e23.l
        public /* bridge */ /* synthetic */ Unit invoke(Map<String, ? extends Boolean> map) {
            invoke2((Map<String, Boolean>) map);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Map<String, Boolean> map) {
            map.getClass();
        }
    }
}

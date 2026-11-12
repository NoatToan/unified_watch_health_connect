package com.google.accompanist.permissions;

import e23.l;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.w;
import p3.m;
import p3.n;
import p3.x1;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a-\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"", "permission", "Lkotlin/Function1;", "", "", "onPermissionResult", "Lcom/google/accompanist/permissions/PermissionState;", "rememberPermissionState", "(Ljava/lang/String;Le23/l;Lp3/m;II)Lcom/google/accompanist/permissions/PermissionState;", "permissions_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class PermissionStateKt {
    @ExperimentalPermissionsApi
    public static final PermissionState rememberPermissionState(String str, l<? super Boolean, Unit> lVar, m mVar, int i14, int i15) {
        str.getClass();
        mVar.L(923020361);
        if ((i15 & 2) != 0) {
            lVar = AnonymousClass1.INSTANCE;
        }
        x1 x1Var = n.f135158a;
        MutablePermissionState mutablePermissionStateRememberMutablePermissionState = MutablePermissionStateKt.rememberMutablePermissionState(str, lVar, mVar, i14 & 126, 0);
        mVar.R();
        return mutablePermissionStateRememberMutablePermissionState;
    }

    /* JADX INFO: renamed from: com.google.accompanist.permissions.PermissionStateKt$rememberPermissionState$1, reason: invalid class name */
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

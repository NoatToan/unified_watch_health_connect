package com.google.accompanist.permissions;

import e23.l;
import java.util.List;
import java.util.Map;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.w;
import p3.m;
import p3.n;
import p3.x1;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a?\u0010\t\u001a\u00020\b2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002 \b\u0002\u0010\u0007\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0004\u0012\u00020\u00060\u0003H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"", "", "permissions", "Lkotlin/Function1;", "", "", "", "onPermissionsResult", "Lcom/google/accompanist/permissions/MultiplePermissionsState;", "rememberMultiplePermissionsState", "(Ljava/util/List;Le23/l;Lp3/m;II)Lcom/google/accompanist/permissions/MultiplePermissionsState;", "permissions_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class MultiplePermissionsStateKt {
    @ExperimentalPermissionsApi
    public static final MultiplePermissionsState rememberMultiplePermissionsState(List<String> list, l<? super Map<String, Boolean>, Unit> lVar, m mVar, int i14, int i15) {
        list.getClass();
        mVar.L(-57132327);
        if ((i15 & 2) != 0) {
            lVar = AnonymousClass1.INSTANCE;
        }
        x1 x1Var = n.f135158a;
        MultiplePermissionsState multiplePermissionsStateRememberMutableMultiplePermissionsState = MutableMultiplePermissionsStateKt.rememberMutableMultiplePermissionsState(list, lVar, mVar, (i14 & 112) | 8, 0);
        mVar.R();
        return multiplePermissionsStateRememberMutableMultiplePermissionsState;
    }

    /* JADX INFO: renamed from: com.google.accompanist.permissions.MultiplePermissionsStateKt$rememberMultiplePermissionsState$1, reason: invalid class name */
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

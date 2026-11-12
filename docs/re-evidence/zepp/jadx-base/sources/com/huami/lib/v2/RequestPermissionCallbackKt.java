package com.huami.lib.v2;

import com.huami.utils.permissionx.PermissionResult;
import com.huami.utils.permissionx.dsl.RequestPermissionDsl;
import com.xmlywind.sdk.common.mta.PointCategory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a%\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¨\u0006\b"}, d2 = {"Lcom/huami/lib/v2/RequestPermissionCallback;", "", PointCategory.PERMISSION, "Lkotlin/Function1;", "Lcom/huami/utils/permissionx/dsl/RequestPermissionDsl;", "", "Lkotlin/ExtensionFunctionType;", "requestDslToCallback", "zeppPermission_release"}, k = 2, mv = {1, 5, 1})
public final class RequestPermissionCallbackKt {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lcom/huami/utils/permissionx/dsl/RequestPermissionDsl;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<RequestPermissionDsl, Unit> {
        public final /* synthetic */ RequestPermissionCallback a;
        public final /* synthetic */ String b;

        /* JADX INFO: renamed from: com.huami.lib.v2.RequestPermissionCallbackKt$a$a, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class C0467a extends Lambda implements Function0<Unit> {
            public final /* synthetic */ RequestPermissionCallback a;
            public final /* synthetic */ String b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0467a(RequestPermissionCallback requestPermissionCallback, String str) {
                super(0);
                this.a = requestPermissionCallback;
                this.b = str;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.a.onPermissionGranted(this.b);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/utils/permissionx/PermissionResult;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class b extends Lambda implements Function1<PermissionResult, Unit> {
            public final /* synthetic */ RequestPermissionCallback a;
            public final /* synthetic */ String b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(RequestPermissionCallback requestPermissionCallback, String str) {
                super(1);
                this.a = requestPermissionCallback;
                this.b = str;
            }

            public final void a(@NotNull PermissionResult permissionResult) {
                this.a.onPermissionDenied(this.b, permissionResult);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(PermissionResult permissionResult) {
                a(permissionResult);
                return Unit.INSTANCE;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/utils/permissionx/PermissionResult;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class c extends Lambda implements Function1<PermissionResult, Unit> {
            public final /* synthetic */ RequestPermissionCallback a;
            public final /* synthetic */ String b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(RequestPermissionCallback requestPermissionCallback, String str) {
                super(1);
                this.a = requestPermissionCallback;
                this.b = str;
            }

            public final void a(@NotNull PermissionResult permissionResult) {
                this.a.onPermissionResult(this.b, permissionResult);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(PermissionResult permissionResult) {
                a(permissionResult);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(RequestPermissionCallback requestPermissionCallback, String str) {
            super(1);
            this.a = requestPermissionCallback;
            this.b = str;
        }

        public final void a(@NotNull RequestPermissionDsl requestPermissionDsl) {
            requestPermissionDsl.onPermissionGranted(new C0467a(this.a, this.b));
            requestPermissionDsl.onPermissionDenied(new b(this.a, this.b));
            requestPermissionDsl.onPermissionResult(new c(this.a, this.b));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(RequestPermissionDsl requestPermissionDsl) {
            a(requestPermissionDsl);
            return Unit.INSTANCE;
        }
    }

    @NotNull
    public static final Function1<RequestPermissionDsl, Unit> requestDslToCallback(@NotNull RequestPermissionCallback requestPermissionCallback, @NotNull String str) {
        return new a(requestPermissionCallback, str);
    }
}

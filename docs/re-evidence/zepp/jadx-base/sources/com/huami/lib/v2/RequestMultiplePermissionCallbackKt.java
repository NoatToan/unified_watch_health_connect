package com.huami.lib.v2;

import com.huami.utils.permissionx.PermissionResult;
import com.huami.utils.permissionx.dsl.RequestMultiplePermissionDsl;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001d\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u0004*\u00020\u0000H\u0000¨\u0006\u0006"}, d2 = {"Lcom/huami/lib/v2/RequestMultiplePermissionCallback;", "Lkotlin/Function1;", "Lcom/huami/utils/permissionx/dsl/RequestMultiplePermissionDsl;", "", "Lkotlin/ExtensionFunctionType;", "requestDslToCallback", "zeppPermission_release"}, k = 2, mv = {1, 5, 1})
public final class RequestMultiplePermissionCallbackKt {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lcom/huami/utils/permissionx/dsl/RequestMultiplePermissionDsl;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<RequestMultiplePermissionDsl, Unit> {
        public final /* synthetic */ RequestMultiplePermissionCallback a;

        /* JADX INFO: renamed from: com.huami.lib.v2.RequestMultiplePermissionCallbackKt$a$a, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n"}, d2 = {"", "", "Lcom/huami/utils/permissionx/PermissionResult;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class C0466a extends Lambda implements Function1<Map<String, ? extends PermissionResult>, Unit> {
            public final /* synthetic */ RequestMultiplePermissionCallback a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0466a(RequestMultiplePermissionCallback requestMultiplePermissionCallback) {
                super(1);
                this.a = requestMultiplePermissionCallback;
            }

            public final void a(@NotNull Map<String, ? extends PermissionResult> map) {
                this.a.onPermissionGranted(CollectionsKt___CollectionsKt.toList(map.keySet()));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Map<String, ? extends PermissionResult> map) {
                a(map);
                return Unit.INSTANCE;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n"}, d2 = {"", "", "Lcom/huami/utils/permissionx/PermissionResult;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class b extends Lambda implements Function1<Map<String, ? extends PermissionResult>, Unit> {
            public final /* synthetic */ RequestMultiplePermissionCallback a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(RequestMultiplePermissionCallback requestMultiplePermissionCallback) {
                super(1);
                this.a = requestMultiplePermissionCallback;
            }

            public final void a(@NotNull Map<String, ? extends PermissionResult> map) {
                this.a.onPermissionDenied(map);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Map<String, ? extends PermissionResult> map) {
                a(map);
                return Unit.INSTANCE;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n"}, d2 = {"", "", "Lcom/huami/utils/permissionx/PermissionResult;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class c extends Lambda implements Function1<Map<String, ? extends PermissionResult>, Unit> {
            public final /* synthetic */ RequestMultiplePermissionCallback a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(RequestMultiplePermissionCallback requestMultiplePermissionCallback) {
                super(1);
                this.a = requestMultiplePermissionCallback;
            }

            public final void a(@NotNull Map<String, ? extends PermissionResult> map) {
                this.a.onPermissionResult(map);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Map<String, ? extends PermissionResult> map) {
                a(map);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(RequestMultiplePermissionCallback requestMultiplePermissionCallback) {
            super(1);
            this.a = requestMultiplePermissionCallback;
        }

        public final void a(@NotNull RequestMultiplePermissionDsl requestMultiplePermissionDsl) {
            requestMultiplePermissionDsl.onPermissionsGranted(new C0466a(this.a));
            requestMultiplePermissionDsl.onPermissionsDenied(new b(this.a));
            requestMultiplePermissionDsl.onAllPermissionResult(new c(this.a));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(RequestMultiplePermissionDsl requestMultiplePermissionDsl) {
            a(requestMultiplePermissionDsl);
            return Unit.INSTANCE;
        }
    }

    @NotNull
    public static final Function1<RequestMultiplePermissionDsl, Unit> requestDslToCallback(@NotNull RequestMultiplePermissionCallback requestMultiplePermissionCallback) {
        return new a(requestMultiplePermissionCallback);
    }
}

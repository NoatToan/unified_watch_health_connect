package com.huami.utils.easypermission.manager;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b \u0010!J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0002HÆ\u0003J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J7\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001J\t\u0010\u000e\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0010\u001a\u00020\u000fHÖ\u0001J\u0013\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\t\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\n\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017R\u0019\u0010\u000b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u001b\u0010\u0017R\u001f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006\""}, d2 = {"Lcom/huami/utils/easypermission/manager/PermissionEntry;", "", "", "component1", "component2", "component3", "Lkotlin/Function0;", "", "component4", "title", "content", "status", "clickListener", "copy", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "b", "getContent", "c", "getStatus", GoogleApiAvailabilityLight.a, "Lkotlin/jvm/functions/Function0;", "getClickListener", "()Lkotlin/jvm/functions/Function0;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "easypermission_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class PermissionEntry {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private final String title;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private final String content;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @NotNull
    private final String status;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @NotNull
    private final Function0<Unit> clickListener;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<Unit> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }
    }

    public PermissionEntry(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull Function0<Unit> function0) {
        this.title = str;
        this.content = str2;
        this.status = str3;
        this.clickListener = function0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PermissionEntry copy$default(PermissionEntry permissionEntry, String str, String str2, String str3, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            str = permissionEntry.title;
        }
        if ((i & 2) != 0) {
            str2 = permissionEntry.content;
        }
        if ((i & 4) != 0) {
            str3 = permissionEntry.status;
        }
        if ((i & 8) != 0) {
            function0 = permissionEntry.clickListener;
        }
        return permissionEntry.copy(str, str2, str3, function0);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getContent() {
        return this.content;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    @NotNull
    public final Function0<Unit> component4() {
        return this.clickListener;
    }

    @NotNull
    public final PermissionEntry copy(@NotNull String title, @NotNull String content, @NotNull String status, @NotNull Function0<Unit> clickListener) {
        return new PermissionEntry(title, content, status, clickListener);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PermissionEntry)) {
            return false;
        }
        PermissionEntry permissionEntry = (PermissionEntry) other;
        return Intrinsics.areEqual(this.title, permissionEntry.title) && Intrinsics.areEqual(this.content, permissionEntry.content) && Intrinsics.areEqual(this.status, permissionEntry.status) && Intrinsics.areEqual(this.clickListener, permissionEntry.clickListener);
    }

    @NotNull
    public final Function0<Unit> getClickListener() {
        return this.clickListener;
    }

    @NotNull
    public final String getContent() {
        return this.content;
    }

    @NotNull
    public final String getStatus() {
        return this.status;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return (((((this.title.hashCode() * 31) + this.content.hashCode()) * 31) + this.status.hashCode()) * 31) + this.clickListener.hashCode();
    }

    @NotNull
    public String toString() {
        return "PermissionEntry(title=" + this.title + ", content=" + this.content + ", status=" + this.status + ", clickListener=" + this.clickListener + ')';
    }

    public /* synthetic */ PermissionEntry(String str, String str2, String str3, Function0 function0, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i & 8) != 0 ? a.a : function0);
    }
}

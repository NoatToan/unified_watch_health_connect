package com.huami.account.userinfo.bean;

import android.content.Context;
import androidx.p008lifecycle.LiveData;
import com.huami.tools.analytics.DbUtils;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001Bc\u0012\u0012\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002\u0012!\u0010\u000f\u001a\u001d\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b0\u0006\u0012#\b\u0002\u0010\u0010\u001a\u001d\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b0\u0006¢\u0006\u0004\b#\u0010$J\u0015\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002HÆ\u0003J$\u0010\f\u001a\u001d\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b0\u0006HÆ\u0003J$\u0010\r\u001a\u001d\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b0\u0006HÆ\u0003Ji\u0010\u0011\u001a\u00020\u00002\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00022#\b\u0002\u0010\u000f\u001a\u001d\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b0\u00062#\b\u0002\u0010\u0010\u001a\u001d\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b0\u0006HÆ\u0001J\t\u0010\u0013\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0014HÖ\u0001J\u0013\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003R%\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR4\u0010\u000f\u001a\u001d\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b0\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R4\u0010\u0010\u001a\u001d\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b0\u00068\u0006@\u0006¢\u0006\f\n\u0004\b!\u0010\u001e\u001a\u0004\b\"\u0010 ¨\u0006%"}, d2 = {"Lcom/huami/account/userinfo/bean/PersonInfoItem;", "", "Lkotlin/Function0;", "Landroidx/lifecycle/LiveData;", "Lcom/huami/account/userinfo/bean/ItemValue;", "component1", "Lkotlin/Function1;", "Landroid/content/Context;", "Lkotlin/ParameterName;", "name", DbUtils.Const.Table.CONTEXT, "", "component2", "component3", "itemValueProvider", "clickAction", "updateAction", "copy", "", "toString", "", "hashCode", "other", "", "equals", "a", "Lkotlin/jvm/functions/Function0;", "getItemValueProvider", "()Lkotlin/jvm/functions/Function0;", "b", "Lkotlin/jvm/functions/Function1;", "getClickAction", "()Lkotlin/jvm/functions/Function1;", "c", "getUpdateAction", "<init>", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "userinfo_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class PersonInfoItem {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private final Function0<LiveData<ItemValue>> itemValueProvider;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private final Function1<Context, Unit> clickAction;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @NotNull
    private final Function1<Context, Unit> updateAction;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/content/Context;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<Context, Unit> {
        public static final a a = new a();

        public a() {
            super(1);
        }

        public final void a(@NotNull Context context) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Context context) {
            a(context);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PersonInfoItem(@NotNull Function0<? extends LiveData<ItemValue>> function0, @NotNull Function1<? super Context, Unit> function1, @NotNull Function1<? super Context, Unit> function2) {
        this.itemValueProvider = function0;
        this.clickAction = function1;
        this.updateAction = function2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PersonInfoItem copy$default(PersonInfoItem personInfoItem, Function0 function0, Function1 function1, Function1 function2, int i, Object obj) {
        if ((i & 1) != 0) {
            function0 = personInfoItem.itemValueProvider;
        }
        if ((i & 2) != 0) {
            function1 = personInfoItem.clickAction;
        }
        if ((i & 4) != 0) {
            function2 = personInfoItem.updateAction;
        }
        return personInfoItem.copy(function0, function1, function2);
    }

    @NotNull
    public final Function0<LiveData<ItemValue>> component1() {
        return this.itemValueProvider;
    }

    @NotNull
    public final Function1<Context, Unit> component2() {
        return this.clickAction;
    }

    @NotNull
    public final Function1<Context, Unit> component3() {
        return this.updateAction;
    }

    @NotNull
    public final PersonInfoItem copy(@NotNull Function0<? extends LiveData<ItemValue>> itemValueProvider, @NotNull Function1<? super Context, Unit> clickAction, @NotNull Function1<? super Context, Unit> updateAction) {
        return new PersonInfoItem(itemValueProvider, clickAction, updateAction);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PersonInfoItem)) {
            return false;
        }
        PersonInfoItem personInfoItem = (PersonInfoItem) other;
        return Intrinsics.areEqual(this.itemValueProvider, personInfoItem.itemValueProvider) && Intrinsics.areEqual(this.clickAction, personInfoItem.clickAction) && Intrinsics.areEqual(this.updateAction, personInfoItem.updateAction);
    }

    @NotNull
    public final Function1<Context, Unit> getClickAction() {
        return this.clickAction;
    }

    @NotNull
    public final Function0<LiveData<ItemValue>> getItemValueProvider() {
        return this.itemValueProvider;
    }

    @NotNull
    public final Function1<Context, Unit> getUpdateAction() {
        return this.updateAction;
    }

    public int hashCode() {
        return (((this.itemValueProvider.hashCode() * 31) + this.clickAction.hashCode()) * 31) + this.updateAction.hashCode();
    }

    @NotNull
    public String toString() {
        return "PersonInfoItem(itemValueProvider=" + this.itemValueProvider + ", clickAction=" + this.clickAction + ", updateAction=" + this.updateAction + ')';
    }

    public /* synthetic */ PersonInfoItem(Function0 function0, Function1 function1, Function1 function2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(function0, function1, (i & 4) != 0 ? a.a : function2);
    }
}

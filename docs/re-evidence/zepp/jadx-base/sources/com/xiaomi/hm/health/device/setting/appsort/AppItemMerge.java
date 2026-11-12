package com.xiaomi.hm.health.device.setting.appsort;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.g;
import kotlin.collections.h;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u000eB\u0015\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\f\u0010\rJ\u0014\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002R\u001c\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000f"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/appsort/AppItemMerge;", "", "", "Lcom/xiaomi/hm/health/bt/model/appsort/AppItem;", "source", "", "mergeTo", "", "Lcom/xiaomi/hm/health/device/setting/appsort/AppItemMerge$Rule;", "a", "Ljava/util/List;", "rules", "<init>", "(Ljava/util/List;)V", "Rule", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class AppItemMerge {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final List<Rule> rules;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/bt/model/appsort/AppItem;", "item", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<com.xiaomi.hm.health.bt.model.appsort.AppItem, Boolean> {
        public final /* synthetic */ List<Rule> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(List<Rule> list) {
            super(1);
            this.a = list;
        }

        public final boolean a(@NotNull com.xiaomi.hm.health.bt.model.appsort.AppItem appItem) {
            List<Rule> list = this.a;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                for (Rule rule : list) {
                    if (rule.getItem().getType() == appItem.getType() && !rule.isValid().invoke().booleanValue()) {
                        return true;
                    }
                }
            }
            return false;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(com.xiaomi.hm.health.bt.model.appsort.AppItem appItem) {
            return Boolean.valueOf(a(appItem));
        }
    }

    public AppItemMerge(@NotNull List<Rule> list) {
        this.rules = list;
    }

    public final void mergeTo(@NotNull List<com.xiaomi.hm.health.bt.model.appsort.AppItem> source) {
        ArrayList arrayList = new ArrayList();
        ArrayList<Rule> arrayList2 = new ArrayList();
        for (Rule rule : this.rules) {
            if (rule.getValidRule() != null) {
                arrayList.add(rule);
            }
            if (rule.getMergeRule() != null) {
                arrayList2.add(rule);
            }
        }
        h.removeAll((List) source, (Function1) new a(arrayList));
        if (source.size() > 1) {
            g.sortWith(source, new Comparator() { // from class: com.xiaomi.hm.health.device.setting.appsort.AppItemMerge$mergeTo$$inlined$sortBy$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return ComparisonsKt__ComparisonsKt.compareValues(Integer.valueOf(((com.xiaomi.hm.health.bt.model.appsort.AppItem) t).getIndex()), Integer.valueOf(((com.xiaomi.hm.health.bt.model.appsort.AppItem) t2).getIndex()));
                }
            });
        }
        for (Rule rule2 : arrayList2) {
            if (rule2.isValid().invoke().booleanValue()) {
                boolean z = false;
                if (source.isEmpty()) {
                    z = true;
                    break;
                }
                Iterator<T> it2 = source.iterator();
                do {
                    if (!it2.hasNext()) {
                        z = true;
                        break;
                    }
                } while (!(((com.xiaomi.hm.health.bt.model.appsort.AppItem) it2.next()).getType() == rule2.getItem().getType()));
                if (z) {
                    rule2.getMergeTo().invoke(source);
                }
            }
        }
        for (com.xiaomi.hm.health.bt.model.appsort.AppItem appItem : source) {
            appItem.setIndex(source.indexOf(appItem));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0017\b\u0086\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u001c\b\u0002\u0010\r\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007¢\u0006\u0004\b&\u0010'J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0011\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0003J\u001d\u0010\n\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007HÆ\u0003JC\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\u00022\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u001c\b\u0002\u0010\r\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007HÆ\u0001J\t\u0010\u0010\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0012\u001a\u00020\u0011HÖ\u0001J\u0013\u0010\u0014\u001a\u00020\u00052\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u000b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R!\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR-\u0010\r\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u00078\u0006@\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006@\u0006¢\u0006\f\n\u0004\b!\u0010\u001a\u001a\u0004\b\"\u0010\u001cR+\u0010%\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\b\u0012\u0004\u0012\u00020\t0\u00078\u0006@\u0006¢\u0006\f\n\u0004\b#\u0010\u001e\u001a\u0004\b$\u0010 ¨\u0006("}, d2 = {"Lcom/xiaomi/hm/health/device/setting/appsort/AppItemMerge$Rule;", "", "Lcom/xiaomi/hm/health/bt/model/appsort/AppItem;", "component1", "Lkotlin/Function0;", "", "component2", "Lkotlin/Function1;", "", "", "component3", "item", "validRule", "mergeRule", "copy", "", "toString", "", "hashCode", "other", "equals", "a", "Lcom/xiaomi/hm/health/bt/model/appsort/AppItem;", "getItem", "()Lcom/xiaomi/hm/health/bt/model/appsort/AppItem;", "b", "Lkotlin/jvm/functions/Function0;", "getValidRule", "()Lkotlin/jvm/functions/Function0;", "c", "Lkotlin/jvm/functions/Function1;", "getMergeRule", "()Lkotlin/jvm/functions/Function1;", GoogleApiAvailabilityLight.a, "isValid", "e", "getMergeTo", "mergeTo", "<init>", "(Lcom/xiaomi/hm/health/bt/model/appsort/AppItem;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static final /* data */ class Rule {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        @NotNull
        private final com.xiaomi.hm.health.bt.model.appsort.AppItem item;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        @Nullable
        private final Function0<Boolean> validRule;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
        @Nullable
        private final Function1<List<com.xiaomi.hm.health.bt.model.appsort.AppItem>, Unit> mergeRule;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @NotNull
        private final Function0<Boolean> isValid;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @NotNull
        private final Function1<List<com.xiaomi.hm.health.bt.model.appsort.AppItem>, Unit> mergeTo;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000b\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<Boolean> {
            public a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Boolean invoke() {
                return Boolean.valueOf(invoke2());
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final boolean invoke2() {
                Boolean boolInvoke;
                Function0<Boolean> validRule = Rule.this.getValidRule();
                if (validRule == null || (boolInvoke = validRule.invoke()) == null) {
                    return true;
                }
                return boolInvoke.booleanValue();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"", "Lcom/xiaomi/hm/health/bt/model/appsort/AppItem;", "list", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class b extends Lambda implements Function1<List<com.xiaomi.hm.health.bt.model.appsort.AppItem>, Unit> {
            public b() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(List<com.xiaomi.hm.health.bt.model.appsort.AppItem> list) {
                invoke2(list);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull List<com.xiaomi.hm.health.bt.model.appsort.AppItem> list) {
                Function1<List<com.xiaomi.hm.health.bt.model.appsort.AppItem>, Unit> mergeRule = Rule.this.getMergeRule();
                if (mergeRule == null) {
                    return;
                }
                mergeRule.invoke(list);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Rule(@NotNull com.xiaomi.hm.health.bt.model.appsort.AppItem appItem, @Nullable Function0<Boolean> function0, @Nullable Function1<? super List<com.xiaomi.hm.health.bt.model.appsort.AppItem>, Unit> function1) {
            this.item = appItem;
            this.validRule = function0;
            this.mergeRule = function1;
            this.isValid = new a();
            this.mergeTo = new b();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Rule copy$default(Rule rule, com.xiaomi.hm.health.bt.model.appsort.AppItem appItem, Function0 function0, Function1 function1, int i, Object obj) {
            if ((i & 1) != 0) {
                appItem = rule.item;
            }
            if ((i & 2) != 0) {
                function0 = rule.validRule;
            }
            if ((i & 4) != 0) {
                function1 = rule.mergeRule;
            }
            return rule.copy(appItem, function0, function1);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final com.xiaomi.hm.health.bt.model.appsort.AppItem getItem() {
            return this.item;
        }

        @Nullable
        public final Function0<Boolean> component2() {
            return this.validRule;
        }

        @Nullable
        public final Function1<List<com.xiaomi.hm.health.bt.model.appsort.AppItem>, Unit> component3() {
            return this.mergeRule;
        }

        @NotNull
        public final Rule copy(@NotNull com.xiaomi.hm.health.bt.model.appsort.AppItem item, @Nullable Function0<Boolean> validRule, @Nullable Function1<? super List<com.xiaomi.hm.health.bt.model.appsort.AppItem>, Unit> mergeRule) {
            return new Rule(item, validRule, mergeRule);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Rule)) {
                return false;
            }
            Rule rule = (Rule) other;
            return Intrinsics.areEqual(this.item, rule.item) && Intrinsics.areEqual(this.validRule, rule.validRule) && Intrinsics.areEqual(this.mergeRule, rule.mergeRule);
        }

        @NotNull
        public final com.xiaomi.hm.health.bt.model.appsort.AppItem getItem() {
            return this.item;
        }

        @Nullable
        public final Function1<List<com.xiaomi.hm.health.bt.model.appsort.AppItem>, Unit> getMergeRule() {
            return this.mergeRule;
        }

        @NotNull
        public final Function1<List<com.xiaomi.hm.health.bt.model.appsort.AppItem>, Unit> getMergeTo() {
            return this.mergeTo;
        }

        @Nullable
        public final Function0<Boolean> getValidRule() {
            return this.validRule;
        }

        public int hashCode() {
            int iHashCode = this.item.hashCode() * 31;
            Function0<Boolean> function0 = this.validRule;
            int iHashCode2 = (iHashCode + (function0 == null ? 0 : function0.hashCode())) * 31;
            Function1<List<com.xiaomi.hm.health.bt.model.appsort.AppItem>, Unit> function1 = this.mergeRule;
            return iHashCode2 + (function1 != null ? function1.hashCode() : 0);
        }

        @NotNull
        public final Function0<Boolean> isValid() {
            return this.isValid;
        }

        @NotNull
        public String toString() {
            return "Rule(item=" + this.item + ", validRule=" + this.validRule + ", mergeRule=" + this.mergeRule + ")";
        }

        public /* synthetic */ Rule(com.xiaomi.hm.health.bt.model.appsort.AppItem appItem, Function0 function0, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(appItem, (i & 2) != 0 ? null : function0, (i & 4) != 0 ? null : function1);
        }
    }
}

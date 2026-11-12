package kotlin.reflect.jvm.internal.impl.resolve;

import defpackage.a05;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.utils.SmartSet;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class OverridingUtilsKt {

    /* JADX INFO: Add missing generic type declarations: [H] */
    public static final class a<H> extends Lambda implements Function1<H, Unit> {
        public final /* synthetic */ SmartSet<H> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(SmartSet<H> smartSet) {
            super(1);
            this.a = smartSet;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
            invoke2(obj);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(H h) {
            this.a.add(h);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <H> Collection<H> selectMostSpecificInEachOverridableGroup(@NotNull Collection<? extends H> collection, @NotNull Function1<? super H, ? extends CallableDescriptor> function1) {
        if (collection.size() <= 1) {
            return collection;
        }
        LinkedList linkedList = new LinkedList(collection);
        SmartSet smartSetCreate = SmartSet.Companion.create();
        while (!linkedList.isEmpty()) {
            Object objFirst = CollectionsKt.first((List<? extends Object>) linkedList);
            SmartSet smartSetCreate2 = SmartSet.Companion.create();
            Collection<a05> collectionExtractMembersOverridableInBothWays = OverridingUtil.extractMembersOverridableInBothWays(objFirst, linkedList, function1, new a(smartSetCreate2));
            if (collectionExtractMembersOverridableInBothWays.size() == 1 && smartSetCreate2.isEmpty()) {
                smartSetCreate.add(CollectionsKt.single(collectionExtractMembersOverridableInBothWays));
            } else {
                a05 a05Var = (Object) OverridingUtil.selectMostSpecificMember(collectionExtractMembersOverridableInBothWays, function1);
                CallableDescriptor callableDescriptorInvoke = function1.invoke(a05Var);
                for (a05 a05Var2 : collectionExtractMembersOverridableInBothWays) {
                    if (!OverridingUtil.isMoreSpecific(callableDescriptorInvoke, function1.invoke(a05Var2))) {
                        smartSetCreate2.add(a05Var2);
                    }
                }
                if (!smartSetCreate2.isEmpty()) {
                    smartSetCreate.addAll(smartSetCreate2);
                }
                smartSetCreate.add(a05Var);
            }
        }
        return smartSetCreate;
    }
}

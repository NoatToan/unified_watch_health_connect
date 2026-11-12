package com.huami.module.homepage.cards.manager;

import com.huami.module.homepage.cards.business.sky.StarSkyHelperKt;
import com.huami.module.homepage.cards.sort.web.CardEntry;
import com.huami.sky.entry.SkyCardEntry;
import it.sauronsoftware.ftp4j.FTPCodes;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import kotlinx.coroutines.flow.FlowCollector;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/FlowKt__CollectKt$collect$3", "Lkotlinx/coroutines/flow/FlowCollector;", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 5, 1})
public final class CardManager$initLoadCards$1$invokeSuspend$$inlined$collect$1 implements FlowCollector<Pair<? extends List<? extends CardEntry>, ? extends SkyCardEntry>> {
    public final /* synthetic */ CardManager a;

    /* JADX INFO: renamed from: com.huami.module.homepage.cards.manager.CardManager$initLoadCards$1$invokeSuspend$$inlined$collect$1$1, reason: invalid class name */
    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.module.homepage.cards.manager.CardManager$initLoadCards$1$invokeSuspend$$inlined$collect$1", f = "CardManager.kt", i = {0, 0}, l = {225, FTPCodes.DATA_CONNECTION_CLOSING}, m = "emit", n = {"this", "items"}, s = {"L$0", "L$1"})
    public static final class AnonymousClass1 extends ContinuationImpl {
        public /* synthetic */ Object a;
        public int b;
        public Object d;
        public Object e;

        public AnonymousClass1(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.a = obj;
            this.b |= Integer.MIN_VALUE;
            return CardManager$initLoadCards$1$invokeSuspend$$inlined$collect$1.this.emit(null, this);
        }
    }

    public CardManager$initLoadCards$1$invokeSuspend$$inlined$collect$1(CardManager cardManager) {
        this.a = cardManager;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    @Nullable
    public Object emit(Pair<? extends List<? extends CardEntry>, ? extends SkyCardEntry> pair, @NotNull Continuation<? super Unit> continuation) {
        AnonymousClass1 anonymousClass1;
        CardManager$initLoadCards$1$invokeSuspend$$inlined$collect$1 cardManager$initLoadCards$1$invokeSuspend$$inlined$collect$1;
        List list;
        AdapterItem adapterItem;
        boolean z;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            int i = anonymousClass1.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                anonymousClass1.b = i - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(continuation);
        }
        Object obj = anonymousClass1.a;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i2 = anonymousClass1.b;
        if (i2 != 0) {
            if (i2 == 1) {
                list = (List) anonymousClass1.e;
                cardManager$initLoadCards$1$invokeSuspend$$inlined$collect$1 = (CardManager$initLoadCards$1$invokeSuspend$$inlined$collect$1) anonymousClass1.d;
                ResultKt.throwOnFailure(obj);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        Pair<? extends List<? extends CardEntry>, ? extends SkyCardEntry> pair2 = pair;
        List<? extends CardEntry> listComponent1 = pair2.component1();
        SkyCardEntry skyCardEntryComponent2 = pair2.component2();
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : listComponent1) {
            if (((CardEntry) obj2).getShow()) {
                arrayList.add(obj2);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj3 : arrayList) {
            if (StarSkyHelperKt.filterSkyCard(((CardEntry) obj3).getType(), skyCardEntryComponent2)) {
                arrayList2.add(obj3);
            }
        }
        List<CardEntry> mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList2);
        Iterator it2 = this.a.a().iterator();
        while (it2.hasNext()) {
            ((Function1) it2.next()).invoke(mutableList);
        }
        Map map = this.a.bindingLogicList;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it3 = map.entrySet().iterator();
        while (true) {
            boolean z2 = false;
            if (!it3.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it3.next();
            CardType cardType = (CardType) entry.getKey();
            if (!(mutableList instanceof Collection) || !mutableList.isEmpty()) {
                Iterator it4 = mutableList.iterator();
                while (it4.hasNext()) {
                    if (((CardEntry) it4.next()).getType() == cardType) {
                        z2 = true;
                        break;
                    }
                }
            }
            if (!z2) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            ((BindingLogic) entry2.getValue()).bindLogicClose();
            this.a.bindingLogicList.remove(entry2.getKey());
        }
        for (CardEntry cardEntry : mutableList) {
            if (!this.a.bindingLogicList.containsKey(cardEntry.getType())) {
                Map map2 = this.a.bindingLogicList;
                CardType type = cardEntry.getType();
                BindingLogic bindingLogicE = this.a.e(cardEntry.getType());
                bindingLogicE.bindLogic();
                map2.put(type, bindingLogicE);
            }
        }
        Map map3 = this.a.adapterItemList;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry3 : map3.entrySet()) {
            CardType cardType2 = (CardType) entry3.getKey();
            if (!(mutableList instanceof Collection) || !mutableList.isEmpty()) {
                Iterator it5 = mutableList.iterator();
                while (true) {
                    if (!it5.hasNext()) {
                        z = false;
                        break;
                    }
                    if (((CardEntry) it5.next()).getType() == cardType2) {
                        z = true;
                        break;
                    }
                }
            } else {
                z = false;
                break;
            }
            if (!z) {
                linkedHashMap2.put(entry3.getKey(), entry3.getValue());
            }
        }
        Iterator it6 = linkedHashMap2.entrySet().iterator();
        while (it6.hasNext()) {
            this.a.adapterItemList.remove((CardType) ((Map.Entry) it6.next()).getKey());
        }
        ArrayList arrayList3 = new ArrayList();
        for (CardEntry cardEntry2 : mutableList) {
            if (this.a.adapterItemList.containsKey(cardEntry2.getType())) {
                adapterItem = (AdapterItem) this.a.adapterItemList.get(cardEntry2.getType());
            } else {
                AdapterItem adapterItemA = CardManagerKt.a(cardEntry2.getType(), this.a.com.huami.tools.analytics.DbUtils.Const.Table.CONTEXT java.lang.String, ((BindingLogic) this.a.bindingLogicList.get(cardEntry2.getType())).getStepCardView());
                this.a.adapterItemList.put(cardEntry2.getType(), adapterItemA);
                adapterItem = adapterItemA;
            }
            if (adapterItem != null) {
                arrayList3.add(adapterItem);
            }
        }
        CardManager cardManager = this.a;
        anonymousClass1.d = this;
        anonymousClass1.e = arrayList3;
        anonymousClass1.b = 1;
        Object objD = cardManager.d(anonymousClass1);
        if (objD == coroutine_suspended) {
            return coroutine_suspended;
        }
        cardManager$initLoadCards$1$invokeSuspend$$inlined$collect$1 = this;
        obj = objD;
        list = arrayList3;
        MainCoroutineDispatcher main = Dispatchers.getMain();
        CardManager$initLoadCards$1.b bVar = new CardManager$initLoadCards$1.b((List) obj, cardManager$initLoadCards$1$invokeSuspend$$inlined$collect$1.a, list, null);
        anonymousClass1.d = null;
        anonymousClass1.e = null;
        anonymousClass1.b = 2;
        if (BuildersKt.withContext(main, bVar, anonymousClass1) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }
}

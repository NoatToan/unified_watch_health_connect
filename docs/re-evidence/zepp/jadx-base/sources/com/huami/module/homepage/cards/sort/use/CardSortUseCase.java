package com.huami.module.homepage.cards.sort.use;

import android.content.Context;
import androidx.annotation.WorkerThread;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.dragview.draglist.DataCallback;
import com.huami.dragview.draglist.DragEntry;
import com.huami.dragview.draglist.DragListActivity;
import com.huami.dragview.draglist.DragParam;
import com.huami.module.homepage.R;
import com.huami.module.homepage.cards.manager.CardType;
import com.huami.module.homepage.cards.manager.CardTypeKt;
import com.huami.module.homepage.cards.sort.db.CardExpand;
import com.huami.module.homepage.cards.sort.db.CardSequence;
import com.huami.module.homepage.cards.sort.repo.HomeCardRepo;
import com.huami.module.homepage.cards.sort.web.CardEntry;
import com.huami.module.homepage.koin.ScopesAndQualifersKt;
import com.huami.module.ktx.ContextExtKt;
import com.huami.tools.analytics.DbUtils;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.language.CommonLanguageSettingFragment;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \u00162\u00020\u0001:\u0001\u0011B\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0013\u0010\u0006\u001a\u00020\u0004H\u0087@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bH\u0087@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\u0007J\u0019\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\tH\u0087@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u0007J\u000e\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\fR\u0016\u0010\u0013\u001a\u00020\u00108\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0017"}, d2 = {"Lcom/huami/module/homepage/cards/sort/use/CardSortUseCase;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "launchSortPage", "reLoadCardSortForNet", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/huami/module/homepage/cards/sort/web/CardEntry;", "loadCardSort", "Lcom/huami/module/homepage/cards/sort/db/CardExpand;", "loadCardExpand", "cardExpand", "updateCardExpand", "Lcom/huami/module/homepage/cards/sort/repo/HomeCardRepo;", "a", "Lcom/huami/module/homepage/cards/sort/repo/HomeCardRepo;", CommonLanguageSettingFragment.KEY_REPO, "<init>", "()V", "b", "homePage_release"}, k = 1, mv = {1, 5, 1})
public final class CardSortUseCase {

    @Deprecated
    public static final int MIN_CARDS_SIZE_LIMIT = 3;

    @NotNull
    private static final a b = new a(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final HomeCardRepo repo = ScopesAndQualifersKt.homeCardRepo(ScopesAndQualifersKt.getKoin());

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"com/huami/module/homepage/cards/sort/use/CardSortUseCase$a", "", "", "MIN_CARDS_SIZE_LIMIT", LogUtil.I, "<init>", "()V", "homePage_release"}, k = 1, mv = {1, 5, 1})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.module.homepage.cards.sort.use.CardSortUseCase", f = "CardSortUseCase.kt", i = {0}, l = {108}, m = "loadCardExpand", n = {"this"}, s = {"L$0"})
    public static final class b extends ContinuationImpl {
        public Object a;
        public /* synthetic */ Object b;
        public int d;

        public b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return CardSortUseCase.this.loadCardExpand(this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.module.homepage.cards.sort.use.CardSortUseCase", f = "CardSortUseCase.kt", i = {0}, l = {96, 97}, m = "loadCardSort", n = {"this"}, s = {"L$0"})
    public static final class c extends ContinuationImpl {
        public Object a;
        public /* synthetic */ Object b;
        public int d;

        public c(Continuation<? super c> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return CardSortUseCase.this.loadCardSort(this);
        }
    }

    /* JADX INFO: renamed from: com.huami.module.homepage.cards.sort.use.CardSortUseCase$launchSortPage$1, reason: invalid class name */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0019\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\n"}, d2 = {"com/huami/module/homepage/cards/sort/use/CardSortUseCase$launchSortPage$1", "Lcom/huami/dragview/draglist/DataCallback;", "", "Lcom/huami/dragview/draglist/DragEntry;", "loadData", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "data", "", "saveData", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "homePage_release"}, k = 1, mv = {1, 5, 1})
    public static final class AnonymousClass1 implements DataCallback {
        public final /* synthetic */ Context b;

        /* JADX INFO: renamed from: com.huami.module.homepage.cards.sort.use.CardSortUseCase$launchSortPage$1$a */
        @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.huami.module.homepage.cards.sort.use.CardSortUseCase$launchSortPage$1", f = "CardSortUseCase.kt", i = {0, 1, 1}, l = {61, 73}, m = "loadData", n = {"this", "destination$iv$iv", "element$iv$iv"}, s = {"L$0", "L$0", "L$2"})
        public static final class a extends ContinuationImpl {
            public Object a;
            public Object b;
            public Object c;
            public /* synthetic */ Object d;
            public int f;

            public a(Continuation<? super a> continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                this.d = obj;
                this.f |= Integer.MIN_VALUE;
                return AnonymousClass1.this.loadData(this);
            }
        }

        public AnonymousClass1(Context context) {
            this.b = context;
        }

        /* JADX WARN: Code duplicated, block: B:51:0x010b  */
        /* JADX WARN: Code duplicated, block: B:53:0x0129  */
        /* JADX WARN: Code duplicated, block: B:55:0x0139 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:59:0x0143  */
        /* JADX WARN: Code duplicated, block: B:60:0x0145  */
        /* JADX WARN: Code duplicated, block: B:62:0x0148  */
        /* JADX WARN: Code duplicated, block: B:7:0x0017  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:54:0x0137 -> B:56:0x013a). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // com.huami.dragview.draglist.DataCallback
        @org.jetbrains.annotations.Nullable
        public java.lang.Object loadData(@org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super java.util.List<com.huami.dragview.draglist.DragEntry>> r21) {
            /*
                Method dump skipped, instruction units count: 335
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huami.module.homepage.cards.sort.use.CardSortUseCase.AnonymousClass1.loadData(kotlin.coroutines.Continuation):java.lang.Object");
        }

        @Override // com.huami.dragview.draglist.DataCallback
        @Nullable
        public Object saveData(@NotNull List<DragEntry> list, @NotNull Continuation<? super Boolean> continuation) {
            HomeCardRepo homeCardRepo = CardSortUseCase.this.repo;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
            for (DragEntry dragEntry : list) {
                Object key = dragEntry.getKey();
                Objects.requireNonNull(key, "null cannot be cast to non-null type kotlin.String");
                arrayList.add(new CardSequence((String) key, dragEntry.getShow()));
            }
            return homeCardRepo.updateCardSequence(arrayList, continuation);
        }
    }

    public final void launchSortPage(@NotNull Context context) {
        DragListActivity.INSTANCE.launch(context, new DragParam(context.getString(R.string.homepage_card_sort_title), context.getString(R.string.homepage_card_sort_show), context.getString(R.string.homepage_card_sort_not_show), context.getString(R.string.homepage_card_sort_drag_tips), context.getString(R.string.homepage_card_sort_empty_tips), context.getString(R.string.homepage_card_sort_cannot_drag_tips), new Pair(context.getString(R.string.homepage_card_sort_save), context.getString(R.string.homepage_card_sort_cancel)), new Pair(context.getString(R.string.homepage_card_sort_save_success), context.getString(R.string.homepage_card_sort_save_fail)), new Pair(3, ContextExtKt.getQuantityString(context, R.plurals.homepage_card_sort_show_limit, 3))), new AnonymousClass1(context));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @WorkerThread
    @Nullable
    public final Object loadCardExpand(@NotNull Continuation<? super List<CardExpand>> continuation) {
        b bVar;
        CardSortUseCase cardSortUseCase;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i = bVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                bVar.d = i - Integer.MIN_VALUE;
            } else {
                bVar = new b(continuation);
            }
        } else {
            bVar = new b(continuation);
        }
        Object objLoadCardExpandForDb = bVar.b;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i2 = bVar.d;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objLoadCardExpandForDb);
            HomeCardRepo homeCardRepo = this.repo;
            bVar.a = this;
            bVar.d = 1;
            objLoadCardExpandForDb = homeCardRepo.loadCardExpandForDb(bVar);
            if (objLoadCardExpandForDb == coroutine_suspended) {
                return coroutine_suspended;
            }
            cardSortUseCase = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            cardSortUseCase = (CardSortUseCase) bVar.a;
            ResultKt.throwOnFailure(objLoadCardExpandForDb);
        }
        List list = (List) objLoadCardExpandForDb;
        if (!list.isEmpty()) {
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(((CardExpand) it2.next()).getCardName());
            }
            if (arrayList.contains(CardType.HEART_RATE.name())) {
                return list;
            }
        }
        CardExpand cardExpand = new CardExpand(CardType.HEART_RATE.name(), true);
        cardSortUseCase.repo.updateCardExpand(cardExpand);
        return CollectionsKt___CollectionsKt.plus((Collection<? extends CardExpand>) list, cardExpand);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @WorkerThread
    @Nullable
    public final Object loadCardSort(@NotNull Continuation<? super Flow<? extends List<CardEntry>>> continuation) {
        c cVar;
        CardSortUseCase cardSortUseCase;
        if (continuation instanceof c) {
            cVar = (c) continuation;
            int i = cVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                cVar.d = i - Integer.MIN_VALUE;
            } else {
                cVar = new c(continuation);
            }
        } else {
            cVar = new c(continuation);
        }
        Object objLoadCardSequenceFlow = cVar.b;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i2 = cVar.d;
        if (i2 != 0) {
            if (i2 == 1) {
                cardSortUseCase = (CardSortUseCase) cVar.a;
                ResultKt.throwOnFailure(objLoadCardSequenceFlow);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objLoadCardSequenceFlow);
            }
            final Flow flow = (Flow) objLoadCardSequenceFlow;
            return new Flow<List<? extends CardEntry>>() { // from class: com.huami.module.homepage.cards.sort.use.CardSortUseCase$loadCardSort$$inlined$map$1

                /* JADX INFO: renamed from: com.huami.module.homepage.cards.sort.use.CardSortUseCase$loadCardSort$$inlined$map$1$2, reason: invalid class name */
                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006¸\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/FlowKt__CollectKt$collect$3", "Lkotlinx/coroutines/flow/FlowCollector;", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2"}, k = 1, mv = {1, 5, 1})
                public static final class AnonymousClass2 implements FlowCollector<List<? extends CardSequence>> {
                    public final /* synthetic */ FlowCollector a;

                    /* JADX INFO: renamed from: com.huami.module.homepage.cards.sort.use.CardSortUseCase$loadCardSort$$inlined$map$1$2$1, reason: invalid class name */
                    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
                    @DebugMetadata(c = "com.huami.module.homepage.cards.sort.use.CardSortUseCase$loadCardSort$$inlined$map$1$2", f = "CardSortUseCase.kt", i = {}, l = {137}, m = "emit", n = {}, s = {})
                    public static final class AnonymousClass1 extends ContinuationImpl {
                        public /* synthetic */ Object a;
                        public int b;
                        public Object c;

                        public AnonymousClass1(Continuation continuation) {
                            super(continuation);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        @Nullable
                        public final Object invokeSuspend(@NotNull Object obj) {
                            this.a = obj;
                            this.b |= Integer.MIN_VALUE;
                            return AnonymousClass2.this.emit(null, this);
                        }
                    }

                    public AnonymousClass2(FlowCollector flowCollector) {
                        this.a = flowCollector;
                    }

                    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    @Nullable
                    public Object emit(List<? extends CardSequence> list, @NotNull Continuation continuation) {
                        AnonymousClass1 anonymousClass1;
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
                        Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
                        int i2 = anonymousClass1.b;
                        if (i2 == 0) {
                            ResultKt.throwOnFailure(obj);
                            FlowCollector flowCollector = this.a;
                            ArrayList arrayList = new ArrayList();
                            for (CardSequence cardSequence : list) {
                                CardType cardType = CardTypeKt.cardType(cardSequence.getCardName());
                                CardEntry cardEntry = cardType == null ? null : new CardEntry(cardType, cardSequence.getShowCard());
                                if (cardEntry != null) {
                                    arrayList.add(cardEntry);
                                }
                            }
                            anonymousClass1.b = 1;
                            if (flowCollector.emit(arrayList, anonymousClass1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else {
                            if (i2 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj);
                        }
                        return Unit.INSTANCE;
                    }
                }

                @Override // kotlinx.coroutines.flow.Flow
                @Nullable
                public Object collect(@NotNull FlowCollector<? super List<? extends CardEntry>> flowCollector, @NotNull Continuation continuation2) {
                    Object objCollect = flow.collect(new AnonymousClass2(flowCollector), continuation2);
                    return objCollect == a.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                }
            };
        }
        ResultKt.throwOnFailure(objLoadCardSequenceFlow);
        HomeCardRepo homeCardRepo = this.repo;
        cVar.a = this;
        cVar.d = 1;
        if (homeCardRepo.loadCardExpand(cVar) == coroutine_suspended) {
            return coroutine_suspended;
        }
        cardSortUseCase = this;
        HomeCardRepo homeCardRepo2 = cardSortUseCase.repo;
        cVar.a = null;
        cVar.d = 2;
        objLoadCardSequenceFlow = homeCardRepo2.loadCardSequenceFlow(cVar);
        if (objLoadCardSequenceFlow == coroutine_suspended) {
            return coroutine_suspended;
        }
        final Flow flow2 = (Flow) objLoadCardSequenceFlow;
        return new Flow<List<? extends CardEntry>>() { // from class: com.huami.module.homepage.cards.sort.use.CardSortUseCase$loadCardSort$$inlined$map$1

            /* JADX INFO: renamed from: com.huami.module.homepage.cards.sort.use.CardSortUseCase$loadCardSort$$inlined$map$1$2, reason: invalid class name */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006¸\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/FlowKt__CollectKt$collect$3", "Lkotlinx/coroutines/flow/FlowCollector;", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2"}, k = 1, mv = {1, 5, 1})
            public static final class AnonymousClass2 implements FlowCollector<List<? extends CardSequence>> {
                public final /* synthetic */ FlowCollector a;

                /* JADX INFO: renamed from: com.huami.module.homepage.cards.sort.use.CardSortUseCase$loadCardSort$$inlined$map$1$2$1, reason: invalid class name */
                @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
                @DebugMetadata(c = "com.huami.module.homepage.cards.sort.use.CardSortUseCase$loadCardSort$$inlined$map$1$2", f = "CardSortUseCase.kt", i = {}, l = {137}, m = "emit", n = {}, s = {})
                public static final class AnonymousClass1 extends ContinuationImpl {
                    public /* synthetic */ Object a;
                    public int b;
                    public Object c;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @Nullable
                    public final Object invokeSuspend(@NotNull Object obj) {
                        this.a = obj;
                        this.b |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector) {
                    this.a = flowCollector;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                @Nullable
                public Object emit(List<? extends CardSequence> list, @NotNull Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
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
                    Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
                    int i2 = anonymousClass1.b;
                    if (i2 == 0) {
                        ResultKt.throwOnFailure(obj);
                        FlowCollector flowCollector = this.a;
                        ArrayList arrayList = new ArrayList();
                        for (CardSequence cardSequence : list) {
                            CardType cardType = CardTypeKt.cardType(cardSequence.getCardName());
                            CardEntry cardEntry = cardType == null ? null : new CardEntry(cardType, cardSequence.getShowCard());
                            if (cardEntry != null) {
                                arrayList.add(cardEntry);
                            }
                        }
                        anonymousClass1.b = 1;
                        if (flowCollector.emit(arrayList, anonymousClass1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            @Nullable
            public Object collect(@NotNull FlowCollector<? super List<? extends CardEntry>> flowCollector, @NotNull Continuation continuation2) {
                Object objCollect = flow2.collect(new AnonymousClass2(flowCollector), continuation2);
                return objCollect == a.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        };
    }

    @WorkerThread
    @Nullable
    public final Object reLoadCardSortForNet(@NotNull Continuation<? super Unit> continuation) {
        Object objLoadCardSequenceForNet = this.repo.loadCardSequenceForNet(continuation);
        return objLoadCardSequenceForNet == kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED() ? objLoadCardSequenceForNet : Unit.INSTANCE;
    }

    public final void updateCardExpand(@NotNull CardExpand cardExpand) {
        this.repo.updateCardExpand(cardExpand);
    }
}

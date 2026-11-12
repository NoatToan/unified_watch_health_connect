package com.huami.dragview.draglist;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.p008lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.dragview.R;
import com.huami.dragview.databinding.DragviewActivityDragListBinding;
import com.huami.lib.rainbow.titlebar.RainbowTitleBar;
import com.huami.sky.lib.constant.WebConstant;
import com.huami.tools.analytics.DbUtils;
import com.huami.widget.toast.IconToast;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import kotlinx.coroutines.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 !2\u00020\u0001:\u0001!B\u0007¢\u0006\u0004\b\u001f\u0010 J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0002J\u0012\u0010\n\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0014J\b\u0010\u000b\u001a\u00020\u0002H\u0016J\b\u0010\f\u001a\u00020\u0002H\u0014R\u0016\u0010\u0010\u001a\u00020\r8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0014\u001a\u00020\u00118\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0017\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u0016R(\u0010\u001b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00060\u00190\u00188\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001aR$\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\""}, d2 = {"Lcom/huami/dragview/draglist/DragListActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "", "initView", "loadData", GoogleApiAvailabilityLight.a, "", "c", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "onBackPressed", "onDestroy", "Lcom/huami/dragview/databinding/DragviewActivityDragListBinding;", "a", "Lcom/huami/dragview/databinding/DragviewActivityDragListBinding;", "bind", "Lcom/huami/dragview/draglist/DragListAdapter;", "b", "Lcom/huami/dragview/draglist/DragListAdapter;", "showAdapter", "", "Ljava/lang/String;", "notShowTitle", "", "Lkotlin/Pair;", "Ljava/util/List;", "tempList", "e", "Lkotlin/Pair;", "saveText", "<init>", "()V", "Companion", "dragview_release"}, k = 1, mv = {1, 4, 0})
public final class DragListActivity extends AppCompatActivity {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static DataCallback f = null;
    private static final String g = "dragParam";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private DragviewActivityDragListBinding bind;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private DragListAdapter showAdapter;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private String notShowTitle = "不显示在首页";

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final List<Pair<String, Boolean>> tempList = new ArrayList();

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private Pair<String, String> saveText;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007R\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0018\u0010\r\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lcom/huami/dragview/draglist/DragListActivity$Companion;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Lcom/huami/dragview/draglist/DragParam;", DragListActivity.g, "Lcom/huami/dragview/draglist/DataCallback;", "callback", "", WebConstant.QueryParam.LAUNCH, "", "DRAG_PARAM", "Ljava/lang/String;", "dataCallback", "Lcom/huami/dragview/draglist/DataCallback;", "<init>", "()V", "dragview_release"}, k = 1, mv = {1, 4, 0})
    public static final class Companion {
        private Companion() {
        }

        @JvmStatic
        public final void launch(@NotNull Context context, @NotNull DragParam dragParam, @NotNull DataCallback callback) {
            DragListActivity.f = callback;
            context.startActivity(new Intent(context, (Class<?>) DragListActivity.class).putExtra(DragListActivity.g, dragParam).addFlags(268435456));
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroid/view/View;", "kotlin.jvm.PlatformType", "it", "", "onClick", "(Landroid/view/View;)V", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    public static final class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            DragListActivity.f = null;
            DragListActivity.this.finish();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroid/view/View;", "kotlin.jvm.PlatformType", "<anonymous parameter 0>", "", "<anonymous parameter 1>", "", "onClick", "(Landroid/view/View;I)V", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    public static final class b implements RainbowTitleBar.OnActionMenuClickListener {
        public b() {
        }

        @Override // com.huami.lib.rainbow.titlebar.RainbowTitleBar.OnActionMenuClickListener
        public final void onClick(View view, int i) {
            DragListActivity.this.d();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    @DebugMetadata(c = "com.huami.dragview.draglist.DragListActivity$loadData$1", f = "DragListActivity.kt", i = {0, 1, 1, 2}, l = {114, 115, 129}, m = "invokeSuspend", n = {"$this$launch", "$this$launch", "$this$apply", "$this$launch"}, s = {"L$0", "L$0", "L$2", "L$0"})
    public static final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private CoroutineScope a;
        public Object b;
        public Object c;
        public Object d;
        public int e;
        public final /* synthetic */ DragEntry g;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 4, 0})
        @DebugMetadata(c = "com.huami.dragview.draglist.DragListActivity$loadData$1$4", f = "DragListActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            private CoroutineScope a;
            public int b;

            public a(Continuation continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                a aVar = c.this.new a(continuation);
                aVar.a = (CoroutineScope) obj;
                return aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                if (this.b != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                DragListActivity.this.showAdapter.updateList(CollectionsKt__CollectionsKt.mutableListOf(c.this.g));
                return Unit.INSTANCE;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0005\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "com/huami/dragview/draglist/DragListActivity$loadData$1$3$1", "<anonymous>"}, k = 3, mv = {1, 4, 0})
        public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            private CoroutineScope a;
            public int b;
            public final /* synthetic */ Pair c;
            public final /* synthetic */ c d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(Pair pair, Continuation continuation, c cVar) {
                super(2, continuation);
                this.c = pair;
                this.d = cVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                b bVar = new b(this.c, continuation, this.d);
                bVar.a = (CoroutineScope) obj;
                return bVar;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                if (this.b != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                ArrayList arrayList = new ArrayList();
                arrayList.addAll((Collection) this.c.getFirst());
                arrayList.add(this.d.g);
                arrayList.addAll((Collection) this.c.getSecond());
                DragListActivity.this.showAdapter.updateList(arrayList);
                if (!arrayList.isEmpty()) {
                    DragviewActivityDragListBinding dragviewActivityDragListBinding = DragListActivity.this.bind;
                    dragviewActivityDragListBinding.dragviewDragShowRv.setVisibility(0);
                    dragviewActivityDragListBinding.dragviewDragItemShowEmpty.setVisibility(8);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(DragEntry dragEntry, Continuation continuation) {
            super(2, continuation);
            this.g = dragEntry;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            c cVar = DragListActivity.this.new c(this.g, continuation);
            cVar.a = (CoroutineScope) obj;
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:37:0x00ee  */
        /* JADX WARN: Code duplicated, block: B:41:0x0104 A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            CoroutineScope coroutineScope;
            CoroutineScope coroutineScope2;
            CoroutineScope coroutineScope3;
            Pair pair;
            MainCoroutineDispatcher main;
            a aVar;
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.e;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                coroutineScope = this.a;
                DataCallback dataCallback = DragListActivity.f;
                if (dataCallback != null) {
                    this.b = coroutineScope;
                    this.e = 1;
                    Object objLoadData = dataCallback.loadData(this);
                    if (objLoadData == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    coroutineScope2 = coroutineScope;
                    obj = objLoadData;
                }
                main = Dispatchers.getMain();
                aVar = new a(null);
                this.b = coroutineScope;
                this.e = 3;
                if (BuildersKt.withContext(main, aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                Unit unit = Unit.INSTANCE;
                return Unit.INSTANCE;
            }
            if (i == 1) {
                coroutineScope2 = (CoroutineScope) this.b;
                ResultKt.throwOnFailure(obj);
            } else {
                if (i == 2) {
                    pair = (Pair) this.c;
                    coroutineScope3 = (CoroutineScope) this.b;
                    ResultKt.throwOnFailure(obj);
                    if (pair == null) {
                        coroutineScope = coroutineScope3;
                        main = Dispatchers.getMain();
                        aVar = new a(null);
                        this.b = coroutineScope;
                        this.e = 3;
                        if (BuildersKt.withContext(main, aVar, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    return Unit.INSTANCE;
                }
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            Unit unit2 = Unit.INSTANCE;
            return Unit.INSTANCE;
            List<DragEntry> list = (List) obj;
            if (list != null) {
                DragListActivity.this.tempList.clear();
                List list2 = DragListActivity.this.tempList;
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                for (DragEntry dragEntry : list) {
                    arrayList.add(new Pair(dragEntry.getTitle(), Boxing.boxBoolean(dragEntry.getShow())));
                }
                list2.addAll(arrayList);
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                for (Object obj2 : list) {
                    if (Boxing.boxBoolean(((DragEntry) obj2).getShow()).booleanValue()) {
                        arrayList2.add(obj2);
                    } else {
                        arrayList3.add(obj2);
                    }
                }
                Pair pair2 = new Pair(arrayList2, arrayList3);
                MainCoroutineDispatcher main2 = Dispatchers.getMain();
                b bVar = new b(pair2, null, this);
                this.b = coroutineScope2;
                this.c = pair2;
                this.d = pair2;
                this.e = 2;
                if (BuildersKt.withContext(main2, bVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                coroutineScope3 = coroutineScope2;
                pair = pair2;
                if (pair == null) {
                    coroutineScope = coroutineScope3;
                }
                return Unit.INSTANCE;
            }
            coroutineScope = coroutineScope2;
            main = Dispatchers.getMain();
            aVar = new a(null);
            this.b = coroutineScope;
            this.e = 3;
            if (BuildersKt.withContext(main, aVar, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            Unit unit3 = Unit.INSTANCE;
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    @DebugMetadata(c = "com.huami.dragview.draglist.DragListActivity$saveData$2", f = "DragListActivity.kt", i = {0, 1, 1}, l = {156, 157}, m = "invokeSuspend", n = {"$this$launch", "$this$launch", "result"}, s = {"L$0", "L$0", "L$1"})
    public static final class d extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private CoroutineScope a;
        public Object b;
        public Object c;
        public int d;
        public final /* synthetic */ List f;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 4, 0})
        @DebugMetadata(c = "com.huami.dragview.draglist.DragListActivity$saveData$2$1", f = "DragListActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Object>, Object> {
            private CoroutineScope a;
            public int b;
            public final /* synthetic */ Boolean d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Boolean bool, Continuation continuation) {
                super(2, continuation);
                this.d = bool;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                a aVar = d.this.new a(this.d, continuation);
                aVar.a = (CoroutineScope) obj;
                return aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Object> continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                if (this.b != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                Boolean bool = this.d;
                if (bool == null || !bool.booleanValue()) {
                    Pair pair = DragListActivity.this.saveText;
                    if (pair == null) {
                        return null;
                    }
                    IconToast.showError(DragListActivity.this.getApplicationContext(), (CharSequence) pair.getSecond());
                    return pair;
                }
                Pair pair2 = DragListActivity.this.saveText;
                if (pair2 != null) {
                    IconToast.showSuccess(DragListActivity.this.getApplicationContext(), (CharSequence) pair2.getFirst());
                }
                DragListActivity.f = null;
                DragListActivity.this.finish();
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(List list, Continuation continuation) {
            super(2, continuation);
            this.f = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            d dVar = DragListActivity.this.new d(this.f, continuation);
            dVar.a = (CoroutineScope) obj;
            return dVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:19:0x005c A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            CoroutineScope coroutineScope;
            Boolean bool;
            MainCoroutineDispatcher main;
            a aVar;
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.d;
            if (i != 0) {
                if (i == 1) {
                    coroutineScope = (CoroutineScope) this.b;
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            coroutineScope = this.a;
            DataCallback dataCallback = DragListActivity.f;
            if (dataCallback != null) {
                List<DragEntry> list = this.f;
                this.b = coroutineScope;
                this.d = 1;
                obj = dataCallback.saveData(list, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                bool = null;
            }
            main = Dispatchers.getMain();
            aVar = new a(bool, null);
            this.b = coroutineScope;
            this.c = bool;
            this.d = 2;
            if (BuildersKt.withContext(main, aVar, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
            bool = (Boolean) obj;
            main = Dispatchers.getMain();
            aVar = new a(bool, null);
            this.b = coroutineScope;
            this.c = bool;
            this.d = 2;
            if (BuildersKt.withContext(main, aVar, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    private final boolean c() {
        boolean z;
        List<DragEntry> list = this.showAdapter.getList();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it2 = list.iterator();
        while (true) {
            z = false;
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            if (((DragEntry) next).getType() == R.layout.dragview_activity_drag_item_data) {
                arrayList.add(next);
            }
        }
        int i = 0;
        for (Object obj : arrayList) {
            i++;
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            DragEntry dragEntry = (DragEntry) obj;
            Pair<String, Boolean> pair = this.tempList.get(i);
            if ((!Intrinsics.areEqual(pair.getFirst(), dragEntry.getTitle())) || pair.getSecond().booleanValue() != dragEntry.getShow()) {
                z = true;
            }
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d() {
        boolean z;
        List<DragEntry> list = this.showAdapter.getList();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it2 = list.iterator();
        while (true) {
            z = false;
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            if (((DragEntry) next).getType() == R.layout.dragview_activity_drag_item_data) {
                arrayList.add(next);
            }
        }
        int i = 0;
        for (Object obj : arrayList) {
            i++;
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            DragEntry dragEntry = (DragEntry) obj;
            Pair<String, Boolean> pair = this.tempList.get(i);
            if ((!Intrinsics.areEqual(pair.getFirst(), dragEntry.getTitle())) || pair.getSecond().booleanValue() != dragEntry.getShow()) {
                z = true;
            }
        }
        if (z) {
            e.f(LifecycleOwnerKt.getLifecycleScope(this), Dispatchers.getIO(), null, new d(arrayList, null), 2, null);
        } else {
            f = null;
            finish();
        }
    }

    private final void initView() {
        Serializable serializableExtra = getIntent().getSerializableExtra(g);
        if (serializableExtra == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.huami.dragview.draglist.DragParam");
        }
        DragParam dragParam = (DragParam) serializableExtra;
        DragviewActivityDragListBinding dragviewActivityDragListBinding = this.bind;
        dragviewActivityDragListBinding.dragviewToolbar.setTitle(dragParam.getTitle());
        dragviewActivityDragListBinding.dragviewShowTitle.setText(dragParam.getShowTitle());
        dragviewActivityDragListBinding.dragviewDragItemShowEmpty.setText(dragParam.getEmptyTips());
        dragviewActivityDragListBinding.dragviewDragTip.setText(dragParam.getDragTips());
        Pair<String, String> saveAndCancelText = dragParam.getSaveAndCancelText();
        dragviewActivityDragListBinding.dragviewToolbar.setMenuText(saveAndCancelText.getFirst());
        dragviewActivityDragListBinding.dragviewToolbar.setNavigationText(saveAndCancelText.getSecond());
        this.saveText = dragParam.getSaveStatusToastText();
        this.notShowTitle = dragParam.getNotShowTitle();
        DragListAdapter.Companion companion = DragListAdapter.INSTANCE;
        companion.setCannotDragTips(dragParam.getCannotDragTips());
        companion.setEmptyTitle(dragParam.getEmptyTips());
        companion.setMinLimit(dragParam.getMinShowLimit());
        ItemTouchHelper itemTouchHelper = new ItemTouchHelper(new DragHelper());
        RecyclerView recyclerView = this.bind.dragviewDragShowRv;
        itemTouchHelper.attachToRecyclerView(recyclerView);
        DragListAdapter dragListAdapter = new DragListAdapter(this, itemTouchHelper);
        this.showAdapter = dragListAdapter;
        recyclerView.setAdapter(dragListAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        this.bind.dragviewToolbar.setNavigationOnClickListener(new a());
        this.bind.dragviewToolbar.setOnActionMenuClickListener(new b());
    }

    @JvmStatic
    public static final void launch(@NotNull Context context, @NotNull DragParam dragParam, @NotNull DataCallback dataCallback) {
        INSTANCE.launch(context, dragParam, dataCallback);
    }

    private final void loadData() {
        DragEntry dragEntry = new DragEntry(false, false, this.notShowTitle, 0, null, 0, 16, null);
        dragEntry.setType$dragview_release(R.layout.dragview_activity_drag_item_title);
        e.f(LifecycleOwnerKt.getLifecycleScope(this), Dispatchers.getIO(), null, new c(dragEntry, null), 2, null);
    }

    @Override // androidx.view.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (c()) {
            return;
        }
        f = null;
        super.onBackPressed();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        DragviewActivityDragListBinding dragviewActivityDragListBindingInflate = DragviewActivityDragListBinding.inflate(getLayoutInflater());
        this.bind = dragviewActivityDragListBindingInflate;
        setContentView(dragviewActivityDragListBindingInflate.getRoot());
        initView();
        loadData();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.tempList.clear();
    }
}

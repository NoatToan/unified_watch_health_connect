package com.huami.member_card;

import androidx.p008lifecycle.LiveData;
import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.ViewModel;
import androidx.p008lifecycle.ViewModelKt;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.bluetooth.profile.channel.module.member_card.MemberCard;
import com.huami.bluetooth.profile.channel.module.member_card.Version;
import com.huami.member_card.datasource.DataSourceManage;
import com.huami.mifit.analytics.Analytics;
import com.huami.mifit.analytics.builder.CountEventBuilder;
import com.huami.tools.log.HMLog;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 92\u00020\u0001:\u00019B\u0007¢\u0006\u0004\b7\u00108J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002J\u0006\u0010\b\u001a\u00020\u0004J\u0016\u0010\f\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tJ\u0018\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\u0002J\u0016\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0002J\u0006\u0010\u0013\u001a\u00020\u0004J\u0016\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\rJ\u001a\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00142\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0014J\u0006\u0010\u001b\u001a\u00020\u0004R\u001d\u0010 \u001a\u00020\u001c8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001d\u0010\u001fR\"\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\"0!8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010#R\u001c\u0010&\u001a\b\u0012\u0004\u0012\u00020\r0\"8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010%R\u001c\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00020!8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010#R*\u0010+\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\t0)0!8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010#R\u001e\u0010.\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010,0!8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010#R\u001f\u00102\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\"0/8F@\u0006¢\u0006\u0006\u001a\u0004\b0\u00101R\u0019\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020/8F@\u0006¢\u0006\u0006\u001a\u0004\b\u0006\u00101R'\u00104\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\t0)0/8F@\u0006¢\u0006\u0006\u001a\u0004\b3\u00101R\u001b\u00106\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010,0/8F@\u0006¢\u0006\u0006\u001a\u0004\b5\u00101¨\u0006:"}, d2 = {"Lcom/huami/member_card/MembershipCardViewModel;", "Landroidx/lifecycle/ViewModel;", "", "b", "", "c", "isEdit", "setEdit", "queryMembershipCardList", "", "srcPosition", "targetPosition", "swapList", "Lcom/huami/bluetooth/profile/channel/module/member_card/MemberCard;", "membershipCard", "isNowPush", "deleteCard", "scanResultFromCamera", "addMembershipCard", "done", "", "oldNameID", "memberCard", "modify", "nameID", "excludeName", "hasRepeatNameID", "restoreMemberOperationStatus", "Lcom/huami/member_card/datasource/DataSourceManage;", "a", "Lkotlin/Lazy;", "()Lcom/huami/member_card/datasource/DataSourceManage;", "dataSourceManage", "Landroidx/lifecycle/MutableLiveData;", "", "Landroidx/lifecycle/MutableLiveData;", "_memberCardList", "Ljava/util/List;", "_editMemberCardList", GoogleApiAvailabilityLight.a, "_isEdit", "Lkotlin/Pair;", "e", "_result", "Lcom/huami/bluetooth/profile/channel/module/member_card/Version;", "f", "_version", "Landroidx/lifecycle/LiveData;", "getMemberCardList", "()Landroidx/lifecycle/LiveData;", "memberCardList", "getResult", "result", "getVersion", "version", "<init>", "()V", "Companion", "member_card_release"}, k = 1, mv = {1, 5, 1})
public final class MembershipCardViewModel extends ViewModel {
    public static final int MEMBER_CARD_ADD = 1;
    public static final int MEMBER_CARD_DELETE = 0;
    public static final int MEMBER_CARD_DONE = 3;
    public static final int MEMBER_CARD_MODIFY = 5;
    public static final int MEMBER_CARD_NULL = -1;
    public static final int MEMBER_CARD_QUERY = 255;
    public static final int MEMBER_CARD_SORT = 2;
    public static final int MEMBER_OPERATION_FAILED = 1;
    public static final int MEMBER_OPERATION_START = 10;
    public static final int MEMBER_OPERATION_SUCCESS = 0;

    @NotNull
    private static final String g = "MembershipCardViewModel";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Lazy dataSourceManage = LazyKt__LazyJVMKt.lazy(c.a);

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<List<MemberCard>> _memberCardList = new MutableLiveData<>(new ArrayList());

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final List<MemberCard> _editMemberCardList = new ArrayList();

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Boolean> _isEdit;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Pair<Integer, Integer>> _result;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Version> _version;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.member_card.MembershipCardViewModel$1", f = "MembershipCardViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return MembershipCardViewModel.this.new a(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            MembershipCardViewModel.this._version.postValue(MembershipCardViewModel.this.a().queryProtocolVersion());
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.member_card.MembershipCardViewModel$addMembershipCard$1", f = "MembershipCardViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ MemberCard c;
        public final /* synthetic */ boolean d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(MemberCard memberCard, boolean z, Continuation<? super b> continuation) {
            super(2, continuation);
            this.c = memberCard;
            this.d = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return MembershipCardViewModel.this.new b(this.c, this.d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            MembershipCardViewModel.this._result.postValue(new Pair(Boxing.boxInt(1), Boxing.boxInt(10)));
            boolean zAddMemberCard = MembershipCardViewModel.this.a().addMemberCard(this.c);
            if (zAddMemberCard) {
                MutableLiveData mutableLiveData = MembershipCardViewModel.this._memberCardList;
                MemberCard memberCard = this.c;
                List arrayList = (List) mutableLiveData.getValue();
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(0, memberCard);
                mutableLiveData.postValue(arrayList);
                Analytics.recordEvent(new CountEventBuilder(MemberStatisticalKt.EVENTID_MEMBERSHIPCARD_ADD_SUCCESSFUL_C).addExtra("type", this.d ? "0" : "1").addExtra("name", this.c.getNameID()).addExtra("codeformat", String.valueOf((int) this.c.getCodeType())));
            }
            MembershipCardViewModel.this._result.postValue(new Pair(Boxing.boxInt(1), Boxing.boxInt(!zAddMemberCard ? 1 : 0)));
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/member_card/datasource/DataSourceManage;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<DataSourceManage> {
        public static final c a = new c();

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final DataSourceManage invoke() {
            return new DataSourceManage();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.member_card.MembershipCardViewModel$deleteCard$1", f = "MembershipCardViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ boolean c;
        public final /* synthetic */ MemberCard d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(boolean z, MemberCard memberCard, Continuation<? super d> continuation) {
            super(2, continuation);
            this.c = z;
            this.d = memberCard;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return MembershipCardViewModel.this.new d(this.c, this.d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            if (!Intrinsics.areEqual(MembershipCardViewModel.this.isEdit().getValue(), Boxing.boxBoolean(true))) {
                return Unit.INSTANCE;
            }
            MembershipCardViewModel.this._result.postValue(new Pair(Boxing.boxInt(0), this.c ? Boxing.boxInt(10) : null));
            List list = MembershipCardViewModel.this._editMemberCardList;
            MemberCard memberCard = this.d;
            Iterator it2 = list.iterator();
            int i = 0;
            while (true) {
                if (!it2.hasNext()) {
                    i = -1;
                    break;
                }
                if (Intrinsics.areEqual(((MemberCard) it2.next()).getNameID(), memberCard.getNameID())) {
                    break;
                }
                i++;
            }
            if (i != -1) {
                list.remove(i);
            }
            if (this.c) {
                boolean zDeleteMemberCard = MembershipCardViewModel.this.a().deleteMemberCard(this.d);
                if (zDeleteMemberCard) {
                    MembershipCardViewModel.this._memberCardList.postValue(CollectionsKt___CollectionsKt.toMutableList((Collection) MembershipCardViewModel.this._editMemberCardList));
                    Analytics.recordEvent(new CountEventBuilder(MemberStatisticalKt.EVENTID_MEMBERSHIPCARD_LIST_DELECT_C).addExtra("name", this.d.getNameID()));
                } else {
                    List list2 = (List) MembershipCardViewModel.this._memberCardList.getValue();
                    List mutableList = list2 != null ? CollectionsKt___CollectionsKt.toMutableList((Collection) list2) : null;
                    if (mutableList == null) {
                        mutableList = new ArrayList();
                    }
                    MembershipCardViewModel.this._editMemberCardList.clear();
                    MembershipCardViewModel.this._editMemberCardList.addAll(mutableList);
                }
                MembershipCardViewModel.this._result.postValue(new Pair(Boxing.boxInt(0), Boxing.boxInt(!zDeleteMemberCard ? 1 : 0)));
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.member_card.MembershipCardViewModel$done$1", f = "MembershipCardViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class e extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;

        public e(Continuation<? super e> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return MembershipCardViewModel.this.new e(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((e) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            if (MembershipCardViewModel.this.b()) {
                MembershipCardViewModel.this._isEdit.postValue(Boxing.boxBoolean(false));
                return Unit.INSTANCE;
            }
            if (!Intrinsics.areEqual(MembershipCardViewModel.this._isEdit.getValue(), Boxing.boxBoolean(true))) {
                return Unit.INSTANCE;
            }
            MembershipCardViewModel.this._result.postValue(new Pair(Boxing.boxInt(3), Boxing.boxInt(10)));
            boolean zIssuedMemberCards = MembershipCardViewModel.this.a().issuedMemberCards(MembershipCardViewModel.this._editMemberCardList);
            MembershipCardViewModel.this._isEdit.postValue(Boxing.boxBoolean(false));
            if (zIssuedMemberCards) {
                MembershipCardViewModel.this._memberCardList.postValue(CollectionsKt___CollectionsKt.toMutableList((Collection) MembershipCardViewModel.this._editMemberCardList));
                MembershipCardViewModel.this.c();
            } else {
                List list = (List) MembershipCardViewModel.this._memberCardList.getValue();
                List mutableList = list == null ? null : CollectionsKt___CollectionsKt.toMutableList((Collection) list);
                if (mutableList == null) {
                    mutableList = new ArrayList();
                }
                MembershipCardViewModel.this._editMemberCardList.clear();
                MembershipCardViewModel.this._editMemberCardList.addAll(mutableList);
            }
            MembershipCardViewModel.this._result.postValue(new Pair(Boxing.boxInt(3), Boxing.boxInt(!zIssuedMemberCards ? 1 : 0)));
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.member_card.MembershipCardViewModel$modify$1", f = "MembershipCardViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class f extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ String c;
        public final /* synthetic */ MemberCard d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str, MemberCard memberCard, Continuation<? super f> continuation) {
            super(2, continuation);
            this.c = str;
            this.d = memberCard;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return MembershipCardViewModel.this.new f(this.c, this.d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((f) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            List arrayList;
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            MembershipCardViewModel.this._result.postValue(new Pair(Boxing.boxInt(5), Boxing.boxInt(10)));
            boolean zModifyMemberCard = MembershipCardViewModel.this.a().modifyMemberCard(this.c, this.d);
            if (Intrinsics.areEqual(MembershipCardViewModel.this.isEdit().getValue(), Boxing.boxBoolean(true))) {
                arrayList = MembershipCardViewModel.this._editMemberCardList;
            } else {
                arrayList = (List) MembershipCardViewModel.this._memberCardList.getValue();
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
            }
            if (zModifyMemberCard) {
                String str = this.c;
                int i = 0;
                Iterator it2 = arrayList.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        i = -1;
                        break;
                    }
                    if (Intrinsics.areEqual(((MemberCard) it2.next()).getNameID(), str)) {
                        break;
                    }
                    i++;
                }
                arrayList.set(i, this.d);
                if (Intrinsics.areEqual(MembershipCardViewModel.this.isEdit().getValue(), Boxing.boxBoolean(true))) {
                    MembershipCardViewModel.this._memberCardList.postValue(CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList));
                } else {
                    MembershipCardViewModel.this._editMemberCardList.clear();
                    MembershipCardViewModel.this._editMemberCardList.addAll(arrayList);
                }
            } else {
                List list = (List) MembershipCardViewModel.this._memberCardList.getValue();
                if (list != null) {
                    MembershipCardViewModel membershipCardViewModel = MembershipCardViewModel.this;
                    membershipCardViewModel._editMemberCardList.clear();
                    membershipCardViewModel._editMemberCardList.addAll(CollectionsKt___CollectionsKt.toMutableList((Collection) list));
                }
            }
            MembershipCardViewModel.this._result.postValue(new Pair(Boxing.boxInt(5), Boxing.boxInt(!zModifyMemberCard ? 1 : 0)));
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.member_card.MembershipCardViewModel$queryMembershipCardList$1", f = "MembershipCardViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class g extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public static final a a = new a();

            public a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "The local membership card data is inconsistent with the device membership card data";
            }
        }

        public g(Continuation<? super g> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return MembershipCardViewModel.this.new g(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((g) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            List mutableList;
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            boolean z = true;
            List<MemberCard> listQueryAllMemberCards = MembershipCardViewModel.this.a().queryAllMemberCards(true);
            List mutableList2 = listQueryAllMemberCards == null ? null : CollectionsKt___CollectionsKt.toMutableList((Collection) listQueryAllMemberCards);
            if (mutableList2 == null) {
                mutableList2 = new ArrayList();
            }
            MembershipCardViewModel.this._memberCardList.postValue(mutableList2);
            List<MemberCard> listQueryAllMemberCards2 = MembershipCardViewModel.this.a().queryAllMemberCards(false);
            if (listQueryAllMemberCards2 != null && (mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) listQueryAllMemberCards2)) != null) {
                MembershipCardViewModel membershipCardViewModel = MembershipCardViewModel.this;
                if (mutableList.size() == mutableList2.size()) {
                    boolean z2 = true;
                    int i = 0;
                    for (Object obj2 : mutableList) {
                        int i2 = i + 1;
                        if (i < 0) {
                            CollectionsKt__CollectionsKt.throwIndexOverflow();
                        }
                        z2 = z2 && Intrinsics.areEqual((MemberCard) obj2, mutableList2.get(i));
                        i = i2;
                    }
                    if (z2) {
                        z = false;
                    }
                }
                if (z) {
                    HMLog.info(MembershipCardViewModel.g, a.a);
                    membershipCardViewModel._memberCardList.postValue(mutableList);
                    membershipCardViewModel._editMemberCardList.clear();
                    membershipCardViewModel._editMemberCardList.addAll(CollectionsKt___CollectionsKt.toMutableList((Collection) mutableList));
                }
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.member_card.MembershipCardViewModel$swapList$1", f = "MembershipCardViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class h extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ int c;
        public final /* synthetic */ int d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(int i, int i2, Continuation<? super h> continuation) {
            super(2, continuation);
            this.c = i;
            this.d = i2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return MembershipCardViewModel.this.new h(this.c, this.d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((h) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            if (!Intrinsics.areEqual(MembershipCardViewModel.this._isEdit.getValue(), Boxing.boxBoolean(true))) {
                return Unit.INSTANCE;
            }
            MembershipCardViewModel.this._result.postValue(new Pair(Boxing.boxInt(2), null));
            Collections.swap(MembershipCardViewModel.this._editMemberCardList, this.c, this.d);
            return Unit.INSTANCE;
        }
    }

    public MembershipCardViewModel() {
        MutableLiveData<Boolean> mutableLiveData = new MutableLiveData<>();
        mutableLiveData.setValue(Boolean.FALSE);
        Unit unit = Unit.INSTANCE;
        this._isEdit = mutableLiveData;
        this._result = new MutableLiveData<>(new Pair(-1, null));
        this._version = new MutableLiveData<>(null);
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new a(null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DataSourceManage a() {
        return (DataSourceManage) this.dataSourceManage.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean b() {
        int size = this._editMemberCardList.size();
        List<MemberCard> value = getMemberCardList().getValue();
        if (!(value != null && size == value.size())) {
            return false;
        }
        List<MemberCard> value2 = this._memberCardList.getValue();
        if (value2 == null) {
            return true;
        }
        boolean z = true;
        int i = 0;
        for (Object obj : value2) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            z = z && Intrinsics.areEqual((MemberCard) obj, this._editMemberCardList.get(i));
            i = i2;
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c() {
        String str;
        List<MemberCard> value = this._memberCardList.getValue();
        String str2 = "";
        if (value == null) {
            str = "";
        } else {
            str = "";
            int i = 0;
            for (Object obj : value) {
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                }
                str = ((Object) str) + i + ",";
                str2 = ((Object) str2) + ((MemberCard) obj).getNameID() + ",";
                i = i2;
            }
        }
        if (!(str2.length() > 0)) {
            str2 = null;
        }
        String strSubstring = str2 == null ? null : str2.substring(0, str2.length() - 1);
        if (strSubstring == null) {
            return;
        }
        if (!(str.length() > 0)) {
            str = null;
        }
        String strSubstring2 = str != null ? str.substring(0, str.length() - 1) : null;
        if (strSubstring2 == null) {
            return;
        }
        Analytics.recordEvent(new CountEventBuilder(MemberStatisticalKt.EVENTID_MEMBERSHIPCARD_LIST_SORT_C).addExtra("name", strSubstring).addExtra("serialno", strSubstring2));
    }

    public static /* synthetic */ void deleteCard$default(MembershipCardViewModel membershipCardViewModel, MemberCard memberCard, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        membershipCardViewModel.deleteCard(memberCard, z);
    }

    public static /* synthetic */ boolean hasRepeatNameID$default(MembershipCardViewModel membershipCardViewModel, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        return membershipCardViewModel.hasRepeatNameID(str, str2);
    }

    public final void addMembershipCard(@NotNull MemberCard membershipCard, boolean scanResultFromCamera) {
        if (Intrinsics.areEqual(isEdit().getValue(), Boolean.TRUE)) {
            return;
        }
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new b(membershipCard, scanResultFromCamera, null), 2, null);
    }

    public final void deleteCard(@NotNull MemberCard membershipCard, boolean isNowPush) {
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new d(isNowPush, membershipCard, null), 2, null);
    }

    public final void done() {
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new e(null), 2, null);
    }

    @NotNull
    public final LiveData<List<MemberCard>> getMemberCardList() {
        return this._memberCardList;
    }

    @NotNull
    public final LiveData<Pair<Integer, Integer>> getResult() {
        return this._result;
    }

    @NotNull
    public final LiveData<Version> getVersion() {
        return this._version;
    }

    public final boolean hasRepeatNameID(@NotNull String nameID, @Nullable String excludeName) {
        List<MemberCard> value;
        List arrayList;
        Object obj = null;
        if (excludeName == null || (value = this._memberCardList.getValue()) == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList();
            for (Object obj2 : value) {
                if (!Intrinsics.areEqual(((MemberCard) obj2).getNameID(), excludeName)) {
                    arrayList.add(obj2);
                }
            }
        }
        if (arrayList == null) {
            arrayList = (List) this._memberCardList.getValue();
        }
        if (arrayList != null) {
            for (Object obj3 : arrayList) {
                if (Intrinsics.areEqual(((MemberCard) obj3).getNameID(), nameID)) {
                    obj = obj3;
                    break;
                }
            }
            obj = (MemberCard) obj;
        }
        return obj != null;
    }

    @NotNull
    public final LiveData<Boolean> isEdit() {
        return this._isEdit;
    }

    public final void modify(@NotNull String oldNameID, @NotNull MemberCard memberCard) {
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new f(oldNameID, memberCard, null), 2, null);
    }

    public final void queryMembershipCardList() {
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new g(null), 2, null);
    }

    public final void restoreMemberOperationStatus() {
        this._result.postValue(new Pair<>(-1, null));
    }

    public final void setEdit(boolean isEdit) {
        List mutableList;
        this._isEdit.setValue(Boolean.valueOf(isEdit));
        List<MemberCard> value = this._memberCardList.getValue();
        if (value == null || (mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) value)) == null) {
            return;
        }
        this._editMemberCardList.clear();
        this._editMemberCardList.addAll(mutableList);
    }

    public final void swapList(int srcPosition, int targetPosition) {
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new h(srcPosition, targetPosition, null), 2, null);
    }
}

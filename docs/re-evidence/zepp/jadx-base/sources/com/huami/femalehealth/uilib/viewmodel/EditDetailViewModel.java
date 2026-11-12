package com.huami.femalehealth.uilib.viewmodel;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import androidx.fragment.app.FragmentManager;
import androidx.p008lifecycle.LiveData;
import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.ViewModelKt;
import com.amap.api.mapcore.util.hl;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.android.vo.Resource;
import com.huami.femalehealth.logiclib.api.DeleteType;
import com.huami.femalehealth.logiclib.calculation.AidKt;
import com.huami.femalehealth.logiclib.calculation.Day;
import com.huami.femalehealth.logiclib.device.MenstruationDataManager;
import com.huami.femalehealth.logiclib.dto.MenstruationDto;
import com.huami.femalehealth.logiclib.dto.Section;
import com.huami.femalehealth.logiclib.helper.DateHelper;
import com.huami.femalehealth.logiclib.helper.DateHelperKt;
import com.huami.femalehealth.logiclib.helper.DateTriple;
import com.huami.femalehealth.logiclib.helper.ext.NumberExtKt;
import com.huami.femalehealth.logiclib.repo.MenstruationRepo;
import com.huami.femalehealth.logiclib.vo.HistoryItemVo;
import com.huami.femalehealth.logiclib.vo.MenstruationVo;
import com.huami.femalehealth.uilib.R;
import com.huami.femalehealth.uilib.helper.ResourceHelper;
import com.huami.femalehealth.uilib.viewmodel.EditDetailViewModel;
import com.huami.femalehealth.uilib.widget.ExtKt;
import com.huami.femalehealth.uilib.widget.calendar.CalculationManager;
import com.huami.femalehealth.uilib.widget.calendar.FemaleHealthCalendarViewKt;
import com.huami.femalehealth.uilib.widget.calendar.dialog.CalendarSelectDialog;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.loc.z;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.language.CommonLanguageSettingFragment;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000f\u0018\u0000 J2\u00020\u0001:\u0002JKB\u0017\u0012\u0006\u0010)\u001a\u00020&\u0012\u0006\u0010,\u001a\u00020*¢\u0006\u0004\bH\u0010IJ\u001e\u0010\u0005\u001a\u00020\u0004*\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0002H\u0002J.\u0010\b\u001a\u00020\u0004*\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0003H\u0002J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002J\b\u0010\r\u001a\u00020\u0004H\u0002J8\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u001e\u0010\u0013\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u000b0\u0012J2\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00042\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b0\u0012J\u001c\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0019J\u0006\u0010\u001c\u001a\u00020\u000bJ\u0006\u0010\u001d\u001a\u00020\u000bJ\u001e\u0010 \u001a\u00020\u000b2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0003J\u001e\u0010!\u001a\u00020\u000b2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0003J\"\u0010%\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020\u00032\u0006\u0010#\u001a\u00020\u00032\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u001eR\u0016\u0010)\u001a\u00020&8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010,\u001a\u00020*8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010+R4\u00102\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u001c\u00106\u001a\b\u0012\u0004\u0012\u000204038\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u00105R\u001f\u0010;\u001a\b\u0012\u0004\u0012\u000204078\u0006@\u0006¢\u0006\f\n\u0004\b\f\u00108\u001a\u0004\b9\u0010:R%\u0010A\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020=0<038\u0006@\u0006¢\u0006\f\n\u0004\b>\u00105\u001a\u0004\b?\u0010@R%\u0010D\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020=0<038\u0006@\u0006¢\u0006\f\n\u0004\bB\u00105\u001a\u0004\bC\u0010@R%\u0010G\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020=0<038\u0006@\u0006¢\u0006\f\n\u0004\bE\u00105\u001a\u0004\bF\u0010@¨\u0006L"}, d2 = {"Lcom/huami/femalehealth/uilib/viewmodel/EditDetailViewModel;", "Lcom/huami/femalehealth/uilib/viewmodel/FHBaseViewModel;", "Lkotlin/Pair;", "Ljava/util/Date;", "", "f", "oldStart", "oldEnd", "g", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "h", "e", "", "type", "Lcom/huami/femalehealth/logiclib/vo/HistoryItemVo;", "item", "Lkotlin/Function1;", "selectCallback", "initDefaultDateRange", "Landroidx/fragment/app/FragmentManager;", "fm", "isStart", "showSelectDateDialog", "Lkotlin/Function0;", "deleteTask", "showDelDialog", "addMenstruation", "addMenstruationDirect", "", "sId", "editMenstruation", "editMenstruationDirect", "start", "end", "sid", "deleteMenstruation", "Lcom/huami/femalehealth/logiclib/repo/MenstruationRepo;", GoogleApiAvailabilityLight.a, "Lcom/huami/femalehealth/logiclib/repo/MenstruationRepo;", CommonLanguageSettingFragment.KEY_REPO, "Lcom/huami/femalehealth/logiclib/device/MenstruationDataManager;", "Lcom/huami/femalehealth/logiclib/device/MenstruationDataManager;", "manager", "Lkotlin/Pair;", "getDateRange", "()Lkotlin/Pair;", "setDateRange", "(Lkotlin/Pair;)V", "dateRange", "Landroidx/lifecycle/MutableLiveData;", "Lcom/huami/femalehealth/uilib/viewmodel/EditDetailViewModel$PeriodTip;", "Landroidx/lifecycle/MutableLiveData;", "_periodAlertLiveData", "Landroidx/lifecycle/LiveData;", "Landroidx/lifecycle/LiveData;", "getPeriodAlertLiveData", "()Landroidx/lifecycle/LiveData;", "periodAlertLiveData", "Lcom/huami/android/vo/Resource;", "", "i", "getAddResult", "()Landroidx/lifecycle/MutableLiveData;", "addResult", z.j, "getEditResult", "editResult", hl.k, "getDelResult", "delResult", "<init>", "(Lcom/huami/femalehealth/logiclib/repo/MenstruationRepo;Lcom/huami/femalehealth/logiclib/device/MenstruationDataManager;)V", "Companion", "PeriodTip", "uilib_release"}, k = 1, mv = {1, 5, 1})
public final class EditDetailViewModel extends FHBaseViewModel {

    @NotNull
    public static final String TAG = "EditDetailViewModel";

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final MenstruationRepo repo;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final MenstruationDataManager manager;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    private Pair<? extends Date, ? extends Date> dateRange;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<PeriodTip> _periodAlertLiveData;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final LiveData<PeriodTip> periodAlertLiveData;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Resource<Object>> addResult;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Resource<Object>> editResult;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Resource<Object>> delResult;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/huami/femalehealth/uilib/viewmodel/EditDetailViewModel$PeriodTip;", "", "<init>", "()V", "Add", "Edit", "Lcom/huami/femalehealth/uilib/viewmodel/EditDetailViewModel$PeriodTip$Add;", "Lcom/huami/femalehealth/uilib/viewmodel/EditDetailViewModel$PeriodTip$Edit;", "uilib_release"}, k = 1, mv = {1, 5, 1})
    public static abstract class PeriodTip {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/femalehealth/uilib/viewmodel/EditDetailViewModel$PeriodTip$Add;", "Lcom/huami/femalehealth/uilib/viewmodel/EditDetailViewModel$PeriodTip;", "<init>", "()V", "uilib_release"}, k = 1, mv = {1, 5, 1})
        public static final class Add extends PeriodTip {

            @NotNull
            public static final Add INSTANCE = new Add();

            private Add() {
                super(null);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/femalehealth/uilib/viewmodel/EditDetailViewModel$PeriodTip$Edit;", "Lcom/huami/femalehealth/uilib/viewmodel/EditDetailViewModel$PeriodTip;", "<init>", "()V", "uilib_release"}, k = 1, mv = {1, 5, 1})
        public static final class Edit extends PeriodTip {

            @NotNull
            public static final Edit INSTANCE = new Edit();

            private Edit() {
                super(null);
            }
        }

        private PeriodTip() {
        }

        public /* synthetic */ PeriodTip(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: com.huami.femalehealth.uilib.viewmodel.EditDetailViewModel$a$a, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class C0410a extends Lambda implements Function0<String> {
            public final /* synthetic */ EditDetailViewModel a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0410a(EditDetailViewModel editDetailViewModel) {
                super(0);
                this.a = editDetailViewModel;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String getA() {
                return Intrinsics.stringPlus("addMenstruation, dateRange=", this.a.getDateRange());
            }
        }

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Unit getA() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            HMLog.info(EditDetailViewModel.TAG, new C0410a(EditDetailViewModel.this));
            EditDetailViewModel editDetailViewModel = EditDetailViewModel.this;
            if (!editDetailViewModel.f(editDetailViewModel.getDateRange())) {
                EditDetailViewModel.this.getAddResult().postValue(Resource.Companion.error$default(Resource.INSTANCE, "date range empty", null, 2, null));
            } else if (EditDetailViewModel.this.e()) {
                EditDetailViewModel.this.addMenstruationDirect();
            } else {
                EditDetailViewModel.this._periodAlertLiveData.postValue(PeriodTip.Add.INSTANCE);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.femalehealth.uilib.viewmodel.EditDetailViewModel$addMenstruationDirect$1", f = "EditDetailViewModel.kt", i = {0, 0, 0, 0, 1, 1, 1, 1}, l = {216, 237, 239}, m = "invokeSuspend", n = {"start", "end", "todayTime", "isIncludeTodayConsiderExpand", "start", "end", "todayTime", "isIncludeTodayConsiderExpand"}, s = {"L$0", "L$1", "J$0", "I$0", "L$0", "L$1", "J$0", "I$0"})
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public Object a;
        public Object b;
        public Object c;
        public long d;
        public int e;
        public int f;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"", "Ljava/util/Date;", "it", "Lcom/huami/femalehealth/logiclib/vo/MenstruationVo;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.huami.femalehealth.uilib.viewmodel.EditDetailViewModel$addMenstruationDirect$1$1", f = "EditDetailViewModel.kt", i = {}, l = {218}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<List<? extends Date>, Continuation<? super List<? extends MenstruationVo>>, Object> {
            public int a;
            public /* synthetic */ Object b;
            public final /* synthetic */ EditDetailViewModel c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(EditDetailViewModel editDetailViewModel, Continuation<? super a> continuation) {
                super(2, continuation);
                this.c = editDetailViewModel;
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(@NotNull List<? extends Date> list, @Nullable Continuation<? super List<MenstruationVo>> continuation) {
                return ((a) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                a aVar = new a(this.c, continuation);
                aVar.b = obj;
                return aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                int i = this.a;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    List<? extends Date> list = (List) this.b;
                    MenstruationRepo menstruationRepo = this.c.repo;
                    this.a = 1;
                    obj = menstruationRepo.getMenstruationOfDay(list, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return obj;
            }
        }

        /* JADX INFO: renamed from: com.huami.femalehealth.uilib.viewmodel.EditDetailViewModel$b$b, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Ljava/util/Date;", "it", "", "Lcom/huami/femalehealth/logiclib/vo/MenstruationVo;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.huami.femalehealth.uilib.viewmodel.EditDetailViewModel$addMenstruationDirect$1$2", f = "EditDetailViewModel.kt", i = {}, l = {219}, m = "invokeSuspend", n = {}, s = {})
        public static final class C0411b extends SuspendLambda implements Function2<Date, Continuation<? super List<? extends MenstruationVo>>, Object> {
            public int a;
            public /* synthetic */ Object b;
            public final /* synthetic */ EditDetailViewModel c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0411b(EditDetailViewModel editDetailViewModel, Continuation<? super C0411b> continuation) {
                super(2, continuation);
                this.c = editDetailViewModel;
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(@NotNull Date date, @Nullable Continuation<? super List<MenstruationVo>> continuation) {
                return ((C0411b) create(date, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                C0411b c0411b = new C0411b(this.c, continuation);
                c0411b.b = obj;
                return c0411b;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                int i = this.a;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Date date = (Date) this.b;
                    MenstruationRepo menstruationRepo = this.c.repo;
                    this.a = 1;
                    obj = menstruationRepo.getLastMenstruation(date, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return obj;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class c extends Lambda implements Function0<String> {
            public final /* synthetic */ Pair<Date, Date> a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public c(Pair<? extends Date, ? extends Date> pair) {
                super(0);
                this.a = pair;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String getA() {
                return Intrinsics.stringPlus("delPart:", this.a);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class d extends Lambda implements Function0<String> {
            public final /* synthetic */ Date a;
            public final /* synthetic */ Date b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(Date date, Date date2) {
                super(0);
                this.a = date;
                this.b = date2;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String getA() {
                return "addMenstruation, del first:" + AidKt.toDateTriple(this.a) + " - " + AidKt.toDateTriple(this.b);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class e extends Lambda implements Function0<String> {
            public final /* synthetic */ int a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(int i) {
                super(0);
                this.a = i;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String getA() {
                return Intrinsics.stringPlus("add, repo add error, result=", Integer.valueOf(this.a));
            }
        }

        public b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return EditDetailViewModel.this.new b(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:26:0x00e4  */
        /* JADX WARN: Code duplicated, block: B:27:0x00e7  */
        /* JADX WARN: Code duplicated, block: B:30:0x00fd  */
        /* JADX WARN: Code duplicated, block: B:31:0x0100  */
        /* JADX WARN: Code duplicated, block: B:33:0x0149 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:34:0x014a  */
        /* JADX WARN: Code duplicated, block: B:38:0x015d  */
        /* JADX WARN: Code duplicated, block: B:41:0x0167  */
        /* JADX WARN: Code duplicated, block: B:44:0x017a A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:47:0x0189  */
        /* JADX WARN: Code duplicated, block: B:48:0x019a  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Date first;
            Date second;
            long timeInMillis;
            int i;
            int periodLen;
            Object objPredictionDurComplete;
            int i2;
            long j;
            Date date;
            Date date2;
            boolean z;
            Pair<Date, Date> pairCalcCurrMenstruationDelPart;
            Date first2;
            Date second2;
            MenstruationRepo menstruationRepo;
            Boolean boolBoxBoolean;
            DeleteType deleteType;
            int i3;
            Date date3;
            Date date4;
            long j2;
            Date date5;
            Date date6;
            boolean z2;
            Object objAdd;
            int iIntValue;
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i4 = this.f;
            if (i4 != 0) {
                if (i4 == 1) {
                    i = this.e;
                    timeInMillis = this.d;
                    second = (Date) this.b;
                    first = (Date) this.a;
                    ResultKt.throwOnFailure(obj);
                    objPredictionDurComplete = obj;
                } else if (i4 == 2) {
                    i3 = this.e;
                    j2 = this.d;
                    date4 = (Date) this.b;
                    date3 = (Date) this.a;
                    ResultKt.throwOnFailure(obj);
                    i2 = i3;
                    j = j2;
                    date6 = date4;
                    date5 = date3;
                    MenstruationRepo menstruationRepo2 = EditDetailViewModel.this.repo;
                    if (i2 == 0 && date6.getTime() == j) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    this.a = null;
                    this.b = null;
                    this.c = null;
                    this.f = 3;
                    objAdd = menstruationRepo2.add(date5, date6, true, true, z2, true, this);
                    if (objAdd == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i4 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    objAdd = obj;
                }
                iIntValue = ((Number) objAdd).intValue();
                if (MenstruationDataManager.INSTANCE.isResultSuccess(iIntValue)) {
                    EditDetailViewModel.this.getAddResult().postValue(Resource.Companion.success$default(Resource.INSTANCE, null, 1, null));
                } else {
                    HMLog.error$default(EditDetailViewModel.TAG, null, null, new e(iIntValue), 6, null);
                    EditDetailViewModel.this.getAddResult().postValue(Resource.Companion.error$default(Resource.INSTANCE, null, null, 3, null));
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            EditDetailViewModel.this.getAddResult().postValue(Resource.Companion.loading$default(Resource.INSTANCE, null, 1, null));
            first = EditDetailViewModel.this.getDateRange().getFirst();
            second = EditDetailViewModel.this.getDateRange().getSecond();
            timeInMillis = DateHelper.INSTANCE.today().getTimeInMillis();
            i = (timeInMillis < first.getTime() || timeInMillis > DateHelperKt.offset(second, 2).getTime()) ? 0 : 1;
            periodLen = EditDetailViewModel.this.manager.getSp().getPeriodLen();
            if (i != 0) {
                CalculationManager calculationManager = CalculationManager.INSTANCE;
                DateTriple dateTriple = AidKt.toDateTriple(first);
                a aVar = new a(EditDetailViewModel.this, null);
                C0411b c0411b = new C0411b(EditDetailViewModel.this, null);
                this.a = first;
                this.b = second;
                this.d = timeInMillis;
                this.e = i;
                this.f = 1;
                objPredictionDurComplete = calculationManager.predictionDurComplete(dateTriple, aVar, c0411b, this);
                if (objPredictionDurComplete == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                i2 = i;
                j = timeInMillis;
                date = second;
                int i5 = periodLen;
                date2 = first;
                MenstruationDataManager menstruationDataManager = EditDetailViewModel.this.manager;
                if (i2 != 0) {
                    z = true;
                } else {
                    z = false;
                }
                pairCalcCurrMenstruationDelPart = menstruationDataManager.calcCurrMenstruationDelPart(false, z, date2, date, i5);
                HMLog.info("xys_EditDetailViewModel", new c(pairCalcCurrMenstruationDelPart));
                if (pairCalcCurrMenstruationDelPart == null) {
                    date5 = date2;
                    date6 = date;
                } else {
                    EditDetailViewModel editDetailViewModel = EditDetailViewModel.this;
                    first2 = pairCalcCurrMenstruationDelPart.getFirst();
                    second2 = pairCalcCurrMenstruationDelPart.getSecond();
                    HMLog.info(EditDetailViewModel.TAG, new d(first2, second2));
                    menstruationRepo = editDetailViewModel.repo;
                    boolBoxBoolean = Boxing.boxBoolean(false);
                    deleteType = DeleteType.TYPE_MERGE;
                    this.a = date2;
                    this.b = date;
                    this.c = pairCalcCurrMenstruationDelPart;
                    this.d = j;
                    this.e = i2;
                    this.f = 2;
                    if (MenstruationRepo.delete$default(menstruationRepo, first2, second2, boolBoxBoolean, null, deleteType, this, 8, null) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    i3 = i2;
                    date3 = date2;
                    date4 = date;
                    j2 = j;
                    i2 = i3;
                    j = j2;
                    date6 = date4;
                    date5 = date3;
                }
            }
            MenstruationRepo menstruationRepo3 = EditDetailViewModel.this.repo;
            if (i2 == 0) {
                z2 = false;
            } else {
                z2 = false;
            }
            this.a = null;
            this.b = null;
            this.c = null;
            this.f = 3;
            objAdd = menstruationRepo3.add(date5, date6, true, true, z2, true, this);
            if (objAdd == coroutine_suspended) {
                return coroutine_suspended;
            }
            iIntValue = ((Number) objAdd).intValue();
            if (MenstruationDataManager.INSTANCE.isResultSuccess(iIntValue)) {
                EditDetailViewModel.this.getAddResult().postValue(Resource.Companion.success$default(Resource.INSTANCE, null, 1, null));
            } else {
                HMLog.error$default(EditDetailViewModel.TAG, null, null, new e(iIntValue), 6, null);
                EditDetailViewModel.this.getAddResult().postValue(Resource.Companion.error$default(Resource.INSTANCE, null, null, 3, null));
            }
            return Unit.INSTANCE;
            periodLen = ((Day) objPredictionDurComplete).getValue();
            i2 = i;
            j = timeInMillis;
            date = second;
            int i6 = periodLen;
            date2 = first;
            MenstruationDataManager menstruationDataManager2 = EditDetailViewModel.this.manager;
            if (i2 != 0) {
                z = true;
            } else {
                z = false;
            }
            pairCalcCurrMenstruationDelPart = menstruationDataManager2.calcCurrMenstruationDelPart(false, z, date2, date, i6);
            HMLog.info("xys_EditDetailViewModel", new c(pairCalcCurrMenstruationDelPart));
            if (pairCalcCurrMenstruationDelPart == null) {
                date5 = date2;
                date6 = date;
            } else {
                EditDetailViewModel editDetailViewModel2 = EditDetailViewModel.this;
                first2 = pairCalcCurrMenstruationDelPart.getFirst();
                second2 = pairCalcCurrMenstruationDelPart.getSecond();
                HMLog.info(EditDetailViewModel.TAG, new d(first2, second2));
                menstruationRepo = editDetailViewModel2.repo;
                boolBoxBoolean = Boxing.boxBoolean(false);
                deleteType = DeleteType.TYPE_MERGE;
                this.a = date2;
                this.b = date;
                this.c = pairCalcCurrMenstruationDelPart;
                this.d = j;
                this.e = i2;
                this.f = 2;
                if (MenstruationRepo.delete$default(menstruationRepo, first2, second2, boolBoxBoolean, null, deleteType, this, 8, null) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                i3 = i2;
                date3 = date2;
                date4 = date;
                j2 = j;
                i2 = i3;
                j = j2;
                date6 = date4;
                date5 = date3;
            }
            MenstruationRepo menstruationRepo4 = EditDetailViewModel.this.repo;
            if (i2 == 0) {
                z2 = false;
            } else {
                z2 = false;
            }
            this.a = null;
            this.b = null;
            this.c = null;
            this.f = 3;
            objAdd = menstruationRepo4.add(date5, date6, true, true, z2, true, this);
            if (objAdd == coroutine_suspended) {
                return coroutine_suspended;
            }
            iIntValue = ((Number) objAdd).intValue();
            if (MenstruationDataManager.INSTANCE.isResultSuccess(iIntValue)) {
                EditDetailViewModel.this.getAddResult().postValue(Resource.Companion.success$default(Resource.INSTANCE, null, 1, null));
            } else {
                HMLog.error$default(EditDetailViewModel.TAG, null, null, new e(iIntValue), 6, null);
                EditDetailViewModel.this.getAddResult().postValue(Resource.Companion.error$default(Resource.INSTANCE, null, null, 3, null));
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<Unit> {
        public final /* synthetic */ Date b;
        public final /* synthetic */ Date c;
        public final /* synthetic */ String d;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public final /* synthetic */ Date a;
            public final /* synthetic */ Date b;
            public final /* synthetic */ String c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Date date, Date date2, String str) {
                super(0);
                this.a = date;
                this.b = date2;
                this.c = str;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String getA() {
                StringBuilder sb = new StringBuilder();
                sb.append("del, start:");
                DateHelper dateHelper = DateHelper.INSTANCE;
                sb.append(DateHelper.convertUTCDate$default(dateHelper, this.a.getTime(), false, 2, null));
                sb.append(", end:");
                sb.append(DateHelper.convertUTCDate$default(dateHelper, this.b.getTime(), false, 2, null));
                sb.append(" sid:");
                sb.append((Object) this.c);
                return sb.toString();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.huami.femalehealth.uilib.viewmodel.EditDetailViewModel$deleteMenstruation$1$2", f = "EditDetailViewModel.kt", i = {}, l = {355}, m = "invokeSuspend", n = {}, s = {})
        public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ EditDetailViewModel b;
            public final /* synthetic */ Date c;
            public final /* synthetic */ Date d;
            public final /* synthetic */ String e;

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class a extends Lambda implements Function0<String> {
                public final /* synthetic */ int a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(int i) {
                    super(0);
                    this.a = i;
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final String getA() {
                    return Intrinsics.stringPlus("del, repo delete error, result=", Integer.valueOf(this.a));
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(EditDetailViewModel editDetailViewModel, Date date, Date date2, String str, Continuation<? super b> continuation) {
                super(2, continuation);
                this.b = editDetailViewModel;
                this.c = date;
                this.d = date2;
                this.e = str;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new b(this.b, this.c, this.d, this.e, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                int i = this.a;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    MenstruationRepo menstruationRepo = this.b.repo;
                    Date date = this.c;
                    Date date2 = this.d;
                    Boolean boolBoxBoolean = Boxing.boxBoolean(true);
                    String str = this.e;
                    DeleteType deleteType = DeleteType.TYPE_USER;
                    this.a = 1;
                    obj = menstruationRepo.delete(date, date2, boolBoxBoolean, str, deleteType, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                int iIntValue = ((Number) obj).intValue();
                if (MenstruationDataManager.INSTANCE.isResultSuccess(iIntValue)) {
                    this.b.getDelResult().postValue(Resource.Companion.success$default(Resource.INSTANCE, null, 1, null));
                } else {
                    HMLog.error$default(EditDetailViewModel.TAG, null, null, new a(iIntValue), 6, null);
                    this.b.getDelResult().postValue(Resource.Companion.error$default(Resource.INSTANCE, null, null, 3, null));
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Date date, Date date2, String str) {
            super(0);
            this.b = date;
            this.c = date2;
            this.d = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Unit getA() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            HMLog.info(EditDetailViewModel.TAG, new a(this.b, this.c, this.d));
            EditDetailViewModel.this.getDelResult().postValue(Resource.Companion.loading$default(Resource.INSTANCE, null, 1, null));
            kotlinx.coroutines.e.f(GlobalScope.INSTANCE, Dispatchers.getIO(), null, new b(EditDetailViewModel.this, this.b, this.c, this.d, null), 2, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<Unit> {
        public final /* synthetic */ Date b;
        public final /* synthetic */ Date c;
        public final /* synthetic */ String d;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public final /* synthetic */ String a;
            public final /* synthetic */ Date b;
            public final /* synthetic */ Date c;
            public final /* synthetic */ EditDetailViewModel d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(String str, Date date, Date date2, EditDetailViewModel editDetailViewModel) {
                super(0);
                this.a = str;
                this.b = date;
                this.c = date2;
                this.d = editDetailViewModel;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String getA() {
                return "edit, sId=" + this.a + ", oldStart=" + this.b + ", oldEnd=" + this.c + ", dateRange=" + this.d.getDateRange();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class b extends Lambda implements Function0<String> {
            public static final b a = new b();

            public b() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String getA() {
                return "edit, hasValidDate";
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class c extends Lambda implements Function0<String> {
            public static final c a = new c();

            public c() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String getA() {
                return "edit, no change";
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Date date, Date date2, String str) {
            super(0);
            this.b = date;
            this.c = date2;
            this.d = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Unit getA() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            HMLog.info(EditDetailViewModel.TAG, new a(this.d, this.b, this.c, EditDetailViewModel.this));
            EditDetailViewModel editDetailViewModel = EditDetailViewModel.this;
            if (!editDetailViewModel.f(editDetailViewModel.getDateRange())) {
                HMLog.info(EditDetailViewModel.TAG, b.a);
                EditDetailViewModel.this.getEditResult().postValue(Resource.Companion.error$default(Resource.INSTANCE, null, null, 3, null));
                return;
            }
            EditDetailViewModel editDetailViewModel2 = EditDetailViewModel.this;
            if (editDetailViewModel2.g(editDetailViewModel2.getDateRange(), this.b, this.c)) {
                HMLog.info(EditDetailViewModel.TAG, c.a);
                EditDetailViewModel.this.getEditResult().postValue(Resource.Companion.success$default(Resource.INSTANCE, null, 1, null));
            } else if (EditDetailViewModel.this.e()) {
                EditDetailViewModel.this.editMenstruationDirect(this.d, this.b, this.c);
            } else {
                EditDetailViewModel.this._periodAlertLiveData.postValue(PeriodTip.Edit.INSTANCE);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.femalehealth.uilib.viewmodel.EditDetailViewModel$editMenstruationDirect$1", f = "EditDetailViewModel.kt", i = {0, 0}, l = {289, 322}, m = "invokeSuspend", n = {"start", "end"}, s = {"L$0", "L$1"})
    public static final class e extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public Object a;
        public Object b;
        public int c;
        public final /* synthetic */ String e;
        public final /* synthetic */ Date f;
        public final /* synthetic */ Date g;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public final /* synthetic */ Ref.ObjectRef<Date> a;
            public final /* synthetic */ Ref.ObjectRef<Date> b;
            public final /* synthetic */ Map<Section, List<MenstruationDto>> c;
            public final /* synthetic */ boolean d;
            public final /* synthetic */ boolean e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(Ref.ObjectRef<Date> objectRef, Ref.ObjectRef<Date> objectRef2, Map<Section, ? extends List<MenstruationDto>> map, boolean z, boolean z2) {
                super(0);
                this.a = objectRef;
                this.b = objectRef2;
                this.c = map;
                this.d = z;
                this.e = z2;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String getA() {
                StringBuilder sb = new StringBuilder();
                sb.append("edit, updated start=");
                sb.append(NumberExtKt.dateFormat(this.a.element.getTime()));
                sb.append(", end=");
                sb.append(NumberExtKt.dateFormat(this.b.element.getTime()));
                sb.append(", involved=");
                Map<Section, List<MenstruationDto>> map = this.c;
                sb.append(map == null ? null : map.keySet());
                sb.append(", invoupdateFromCloudupdateFromCloudlvedExists=");
                sb.append(this.d);
                sb.append(", involvedPeriodHasUnfinished=");
                sb.append(this.e);
                return sb.toString();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class b extends Lambda implements Function0<String> {
            public final /* synthetic */ int a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(int i) {
                super(0);
                this.a = i;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String getA() {
                return Intrinsics.stringPlus("edit, repo modify error, result=", Integer.valueOf(this.a));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str, Date date, Date date2, Continuation<? super e> continuation) {
            super(2, continuation);
            this.e = str;
            this.f = date;
            this.g = date2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return EditDetailViewModel.this.new e(this.e, this.f, this.g, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((e) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:100:0x0264  */
        /* JADX WARN: Code duplicated, block: B:102:0x0267  */
        /* JADX WARN: Code duplicated, block: B:125:0x02fe  */
        /* JADX WARN: Code duplicated, block: B:126:0x030e  */
        /* JADX WARN: Code duplicated, block: B:15:0x007e  */
        /* JADX WARN: Code duplicated, block: B:45:0x0129  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v3, types: [T, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r0v6, types: [T, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r2v19, types: [T, java.util.Date] */
        /* JADX WARN: Type inference failed for: r3v20, types: [T, java.util.Date] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Ref.ObjectRef objectRef;
            Ref.ObjectRef objectRef2;
            Object objDeleteInvolved$default;
            Set setEntrySet;
            Object next;
            Section section;
            Long lBoxLong;
            Set setEntrySet2;
            Object next2;
            Section section2;
            Long lBoxLong2;
            Boolean boolBoxBoolean;
            boolean z;
            boolean z2;
            boolean zBooleanValue;
            Object objModify;
            boolean z3;
            int iIntValue;
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.c;
            if (i != 0) {
                if (i == 1) {
                    Ref.ObjectRef objectRef3 = (Ref.ObjectRef) this.b;
                    Ref.ObjectRef objectRef4 = (Ref.ObjectRef) this.a;
                    ResultKt.throwOnFailure(obj);
                    objectRef2 = objectRef3;
                    objectRef = objectRef4;
                    objDeleteInvolved$default = obj;
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    objModify = obj;
                }
                iIntValue = ((Number) objModify).intValue();
                EditDetailViewModel.this.repo.writeToDeviceIfConnectAndRefresh(false);
                if (MenstruationDataManager.INSTANCE.isResultSuccess(iIntValue)) {
                    EditDetailViewModel.this.getEditResult().postValue(Resource.Companion.success$default(Resource.INSTANCE, null, 1, null));
                } else {
                    HMLog.error$default(EditDetailViewModel.TAG, null, null, new b(iIntValue), 6, null);
                    EditDetailViewModel.this.getEditResult().postValue(Resource.Companion.error$default(Resource.INSTANCE, null, null, 3, null));
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            objectRef = new Ref.ObjectRef();
            objectRef.element = EditDetailViewModel.this.getDateRange().getFirst();
            objectRef2 = new Ref.ObjectRef();
            objectRef2.element = EditDetailViewModel.this.getDateRange().getSecond();
            MenstruationRepo menstruationRepo = EditDetailViewModel.this.repo;
            Pair pair = new Pair(objectRef.element, objectRef2.element);
            String str = this.e;
            this.a = objectRef;
            this.b = objectRef2;
            this.c = 1;
            objDeleteInvolved$default = MenstruationRepo.deleteInvolved$default(menstruationRepo, pair, str, 0, this, 4, null);
            if (objDeleteInvolved$default == coroutine_suspended) {
                return coroutine_suspended;
            }
            Map map = (Map) objDeleteInvolved$default;
            if (map == null || (setEntrySet = map.entrySet()) == null) {
                lBoxLong = null;
            } else {
                String str2 = this.e;
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : setEntrySet) {
                    if (Boxing.boxBoolean(!Intrinsics.areEqual(((MenstruationDto) CollectionsKt.first((List) ((Map.Entry) obj2).getValue())).getSId(), str2)).booleanValue()) {
                        arrayList.add(obj2);
                    }
                }
                Iterator it2 = arrayList.iterator();
                if (it2.hasNext()) {
                    next = it2.next();
                    if (it2.hasNext()) {
                        Long lBoxLong3 = Boxing.boxLong(((Section) ((Map.Entry) next).getKey()).getStart());
                        do {
                            Object next3 = it2.next();
                            Long lBoxLong4 = Boxing.boxLong(((Section) ((Map.Entry) next3).getKey()).getStart());
                            if (lBoxLong3.compareTo(lBoxLong4) > 0) {
                                next = next3;
                                lBoxLong3 = lBoxLong4;
                            }
                        } while (it2.hasNext());
                    }
                } else {
                    next = null;
                }
                Map.Entry entry = (Map.Entry) next;
                if (entry == null || (section = (Section) entry.getKey()) == null) {
                    lBoxLong = null;
                } else {
                    lBoxLong = Boxing.boxLong(section.getStart());
                }
            }
            if (map == null || (setEntrySet2 = map.entrySet()) == null) {
                lBoxLong2 = null;
            } else {
                String str3 = this.e;
                ArrayList arrayList2 = new ArrayList();
                for (Object obj3 : setEntrySet2) {
                    if (Boxing.boxBoolean(!Intrinsics.areEqual(((MenstruationDto) CollectionsKt.first((List) ((Map.Entry) obj3).getValue())).getSId(), str3)).booleanValue()) {
                        arrayList2.add(obj3);
                    }
                }
                Iterator it3 = arrayList2.iterator();
                if (it3.hasNext()) {
                    next2 = it3.next();
                    if (it3.hasNext()) {
                        Long lBoxLong5 = Boxing.boxLong(((Section) ((Map.Entry) next2).getKey()).getEnd());
                        do {
                            Object next4 = it3.next();
                            Long lBoxLong6 = Boxing.boxLong(((Section) ((Map.Entry) next4).getKey()).getEnd());
                            if (lBoxLong5.compareTo(lBoxLong6) < 0) {
                                next2 = next4;
                                lBoxLong5 = lBoxLong6;
                            }
                        } while (it3.hasNext());
                    }
                } else {
                    next2 = null;
                }
                Map.Entry entry2 = (Map.Entry) next2;
                if (entry2 == null || (section2 = (Section) entry2.getKey()) == null) {
                    lBoxLong2 = null;
                } else {
                    lBoxLong2 = Boxing.boxLong(section2.getEnd());
                }
            }
            if (lBoxLong != null) {
                objectRef.element = new Date(Math.min(((Date) objectRef.element).getTime(), lBoxLong.longValue()));
            }
            if (lBoxLong2 != null) {
                objectRef2.element = new Date(Math.max(((Date) objectRef2.element).getTime(), lBoxLong2.longValue()));
            }
            if ((map == null || (boolBoxBoolean = Boxing.boxBoolean(map.isEmpty() ^ true)) == null) ? false : boolBoxBoolean.booleanValue()) {
                Set setKeySet = map.keySet();
                Date date = this.f;
                Date date2 = this.g;
                if (!(setKeySet instanceof Collection) || !setKeySet.isEmpty()) {
                    Iterator it4 = setKeySet.iterator();
                    while (true) {
                        if (!it4.hasNext()) {
                            z3 = true;
                            break;
                        }
                        if (Boxing.boxBoolean(Intrinsics.areEqual((Section) it4.next(), new Section(date.getTime(), date2.getTime(), 0L, null))).booleanValue()) {
                            z3 = false;
                            break;
                        }
                    }
                } else {
                    z3 = true;
                    break;
                }
                if (z3) {
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = false;
            }
            if (map != null) {
                if (map.isEmpty()) {
                    z2 = false;
                    break;
                }
                Iterator it5 = map.entrySet().iterator();
                while (true) {
                    if (!it5.hasNext()) {
                        z2 = false;
                        break;
                    }
                    Boolean boolIsEnd = ((Section) ((Map.Entry) it5.next()).getKey()).isEnd();
                    if (Boxing.boxBoolean(!(boolIsEnd == null ? true : boolIsEnd.booleanValue())).booleanValue()) {
                        z2 = true;
                        break;
                    }
                }
                Boolean boolBoxBoolean2 = Boxing.boxBoolean(z2);
                if (boolBoxBoolean2 == null) {
                    zBooleanValue = false;
                } else {
                    zBooleanValue = boolBoxBoolean2.booleanValue();
                }
            } else {
                zBooleanValue = false;
            }
            HMLog.info(EditDetailViewModel.TAG, new a(objectRef, objectRef2, map, z, zBooleanValue));
            MenstruationRepo menstruationRepo2 = EditDetailViewModel.this.repo;
            String str4 = this.e;
            Date date3 = this.f;
            Date date4 = this.g;
            Date date5 = (Date) objectRef.element;
            Date date6 = (Date) objectRef2.element;
            this.a = null;
            this.b = null;
            this.c = 2;
            objModify = menstruationRepo2.modify(str4, date3, date4, date5, date6, z, zBooleanValue, this);
            if (objModify == coroutine_suspended) {
                return coroutine_suspended;
            }
            iIntValue = ((Number) objModify).intValue();
            EditDetailViewModel.this.repo.writeToDeviceIfConnectAndRefresh(false);
            if (MenstruationDataManager.INSTANCE.isResultSuccess(iIntValue)) {
                EditDetailViewModel.this.getEditResult().postValue(Resource.Companion.success$default(Resource.INSTANCE, null, 1, null));
            } else {
                HMLog.error$default(EditDetailViewModel.TAG, null, null, new b(iIntValue), 6, null);
                EditDetailViewModel.this.getEditResult().postValue(Resource.Companion.error$default(Resource.INSTANCE, null, null, 3, null));
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<String> {
        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return Intrinsics.stringPlus("showSelectDateDialog, date range invalid, dateRange=", EditDetailViewModel.this.getDateRange());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000H\n"}, d2 = {"", "year", "month", "day", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function3<Integer, Integer, Integer, Unit> {
        public final /* synthetic */ boolean a;
        public final /* synthetic */ EditDetailViewModel b;
        public final /* synthetic */ Context c;
        public final /* synthetic */ Function1<Date, Unit> d;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public final /* synthetic */ int a;
            public final /* synthetic */ int b;
            public final /* synthetic */ int c;
            public final /* synthetic */ boolean d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(int i, int i2, int i3, boolean z) {
                super(0);
                this.a = i;
                this.b = i2;
                this.c = i3;
                this.d = z;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String getA() {
                return "showSelectDateDialog, onDateSelectListener, date=" + this.a + '/' + this.b + '/' + this.c + ", isStart=" + this.d;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class b extends Lambda implements Function0<String> {
            public static final b a = new b();

            public b() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String getA() {
                return "showSelectDateDialog, date invalid";
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class c extends Lambda implements Function0<String> {
            public static final c a = new c();

            public c() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String getA() {
                return "showSelectDateDialog, date invalid";
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public g(boolean z, EditDetailViewModel editDetailViewModel, Context context, Function1<? super Date, Unit> function1) {
            super(3);
            this.a = z;
            this.b = editDetailViewModel;
            this.c = context;
            this.d = function1;
        }

        public final void a(int i, int i2, int i3) {
            HMLog.debug(EditDetailViewModel.TAG, new a(i, i2, i3, this.a));
            Date date = AidKt.toDate(new DateTriple(i, i2, i3));
            if (this.a) {
                if (DateHelperKt.diff(date, this.b.getDateRange().getSecond()) > 0) {
                    HMLog.error$default(EditDetailViewModel.TAG, null, null, b.a, 6, null);
                    this.b.h(this.c);
                    return;
                } else {
                    this.d.invoke(date);
                    EditDetailViewModel editDetailViewModel = this.b;
                    editDetailViewModel.setDateRange(editDetailViewModel.getDateRange().copy(date, this.b.getDateRange().getSecond()));
                    return;
                }
            }
            if (DateHelperKt.diff(date, this.b.getDateRange().getFirst()) < 0) {
                HMLog.error$default(EditDetailViewModel.TAG, null, null, c.a, 6, null);
                this.b.h(this.c);
            } else {
                this.d.invoke(date);
                EditDetailViewModel editDetailViewModel2 = this.b;
                editDetailViewModel2.setDateRange(editDetailViewModel2.getDateRange().copy(this.b.getDateRange().getFirst(), date));
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(Integer num, Integer num2, Integer num3) {
            a(num.intValue(), num2.intValue(), num3.intValue());
            return Unit.INSTANCE;
        }
    }

    public EditDetailViewModel(@NotNull MenstruationRepo menstruationRepo, @NotNull MenstruationDataManager menstruationDataManager) {
        this.repo = menstruationRepo;
        this.manager = menstruationDataManager;
        MutableLiveData<PeriodTip> mutableLiveData = new MutableLiveData<>();
        this._periodAlertLiveData = mutableLiveData;
        this.periodAlertLiveData = mutableLiveData;
        this.addResult = new MutableLiveData<>();
        this.editResult = new MutableLiveData<>();
        this.delResult = new MutableLiveData<>();
    }

    public static /* synthetic */ void deleteMenstruation$default(EditDetailViewModel editDetailViewModel, Date date, Date date2, String str, int i, Object obj) {
        if ((i & 4) != 0) {
            str = null;
        }
        editDetailViewModel.deleteMenstruation(date, date2, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean e() {
        Pair<? extends Date, ? extends Date> pair = this.dateRange;
        if (pair != null) {
            if ((pair == null ? null : pair.getSecond()) != null) {
                Pair<? extends Date, ? extends Date> pair2 = this.dateRange;
                if ((pair2 != null ? pair2.getSecond() : null) != null && DateHelper.INSTANCE.daysBetween(this.dateRange.getFirst(), this.dateRange.getSecond()) > 15) {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean f(Pair<? extends Date, ? extends Date> pair) {
        return (pair == null || pair.getFirst() == null || pair.getSecond() == null || DateHelperKt.diff(pair.getFirst(), pair.getSecond()) > 0) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean g(Pair<? extends Date, ? extends Date> pair, Date date, Date date2) {
        return (pair == null || pair.getFirst() == null || pair.getSecond() == null || !Intrinsics.areEqual(pair.getFirst(), date) || !Intrinsics.areEqual(pair.getSecond(), date2)) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h(Context context) {
        AlertDialog alertDialogCreate = new AlertDialog.Builder(context, R.style.FHAlertDialog).setNegativeButton(context.getString(R.string.fh_know), new DialogInterface.OnClickListener() { // from class: di1
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                EditDetailViewModel.i(dialogInterface, i);
            }
        }).setMessage(context.getString(R.string.fh_menstruation_date_invalid)).setCancelable(true).create();
        alertDialogCreate.show();
        alertDialogCreate.getButton(-2).setTextColor(ExtKt.getResColor(context, R.color.fh_dialog_button_color));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(Function0 function0, DialogInterface dialogInterface, int i) {
        function0.getA();
        dialogInterface.dismiss();
    }

    public final void addMenstruation() {
        FHBaseViewModel.runIfNetworkConnect$default(this, 0, new a(), 1, null);
    }

    public final void addMenstruationDirect() {
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new b(null), 2, null);
    }

    public final void deleteMenstruation(@NotNull Date start, @NotNull Date end, @Nullable String sid) {
        FHBaseViewModel.runIfNetworkConnect$default(this, 0, new c(start, end, sid), 1, null);
    }

    public final void editMenstruation(@NotNull String sId, @NotNull Date oldStart, @NotNull Date oldEnd) {
        FHBaseViewModel.runIfNetworkConnect$default(this, 0, new d(oldStart, oldEnd, sId), 1, null);
    }

    public final void editMenstruationDirect(@NotNull String sId, @NotNull Date oldStart, @NotNull Date oldEnd) {
        this.editResult.postValue(Resource.Companion.loading$default(Resource.INSTANCE, null, 1, null));
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new e(sId, oldStart, oldEnd, null), 2, null);
    }

    @NotNull
    public final MutableLiveData<Resource<Object>> getAddResult() {
        return this.addResult;
    }

    @Nullable
    public final Pair<Date, Date> getDateRange() {
        return this.dateRange;
    }

    @NotNull
    public final MutableLiveData<Resource<Object>> getDelResult() {
        return this.delResult;
    }

    @NotNull
    public final MutableLiveData<Resource<Object>> getEditResult() {
        return this.editResult;
    }

    @NotNull
    public final LiveData<PeriodTip> getPeriodAlertLiveData() {
        return this.periodAlertLiveData;
    }

    public final void initDefaultDateRange(int type, @Nullable HistoryItemVo item, @NotNull Function1<? super Pair<? extends Date, ? extends Date>, Unit> selectCallback) {
        if (type == 1) {
            if (item == null) {
                return;
            }
            Pair<? extends Date, ? extends Date> pair = new Pair<>(new Date(item.getMenstrualPeriod()), new Date(item.getMenstrualEndTime()));
            setDateRange(pair);
            selectCallback.invoke(pair);
            return;
        }
        if (type != 2) {
            return;
        }
        Date date = new Date(DateHelper.INSTANCE.today().getTimeInMillis());
        Pair<? extends Date, ? extends Date> pair2 = new Pair<>(date, date);
        this.dateRange = pair2;
        selectCallback.invoke(pair2);
    }

    public final void setDateRange(@Nullable Pair<? extends Date, ? extends Date> pair) {
        this.dateRange = pair;
    }

    public final void showDelDialog(@NotNull Context context, @NotNull final Function0<Unit> deleteTask) {
        AlertDialog alertDialogCreate = new AlertDialog.Builder(context, R.style.FHAlertDialog).setNegativeButton(context.getString(R.string.fh_cancel), new DialogInterface.OnClickListener() { // from class: ci1
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                EditDetailViewModel.j(dialogInterface, i);
            }
        }).setPositiveButton(context.getString(R.string.fh_delete), new DialogInterface.OnClickListener() { // from class: bi1
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                EditDetailViewModel.k(deleteTask, dialogInterface, i);
            }
        }).setMessage(context.getString(R.string.fh_del_record)).setCancelable(true).create();
        alertDialogCreate.show();
        alertDialogCreate.getButton(-1).setTextColor(ExtKt.getResColor(context, R.color.fh_dialog_positive_button_color));
        alertDialogCreate.getButton(-2).setTextColor(ExtKt.getResColor(context, R.color.fh_dialog_button_color));
    }

    public final void showSelectDateDialog(@NotNull Context context, @NotNull FragmentManager fm, boolean isStart, @NotNull Function1<? super Date, Unit> selectCallback) {
        if (!f(this.dateRange)) {
            HMLog.error$default(TAG, null, null, new f(), 6, null);
            return;
        }
        Pair<? extends Date, ? extends Date> pair = this.dateRange;
        DateTriple dateTriple = AidKt.toDateTriple(isStart ? pair.getFirst() : pair.getSecond());
        new CalendarSelectDialog(context, ResourceHelper.INSTANCE.getString(R.string.fh_date_select), FemaleHealthCalendarViewKt.getYEAR_MAX(), 2019, false, new g(isStart, this, context, selectCallback)).showDayWheel(new DateTriple(dateTriple.getYear(), dateTriple.getMonth(), dateTriple.getDay())).show(fm);
    }
}

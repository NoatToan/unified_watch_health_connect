package com.xiaomi.fitness.habit.manager;

import com.example.habit.export.Habit;
import com.example.habit.export.HabitBean;
import com.example.habit.export.HabitTime;
import com.example.habit.export.WeekDayBean;
import com.xiaomi.fitness.baseui.utils.PermissionsUtil;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.habit.bean.CalendarReminderEvent;
import com.xiaomi.fitness.habit.manager.HabitHelper;
import com.xiaomi.fitness.habit.persist.HabitDatabase;
import com.xiaomi.fitness.habit.persist.dao.HabitDao;
import defpackage.b0j;
import defpackage.ba3;
import defpackage.hfb;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010!\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000fJ*\u0010\u0010\u001a\u00020\u000b2\"\u0010\u000e\u001a\u001e\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\r0\u0013j\b\u0012\u0004\u0012\u00020\r`\u0012\u0012\u0004\u0012\u00020\u000b0\u0011J#\u0010\u0014\u001a\u00020\u000b2\u0016\u0010\u0015\u001a\u0012\u0012\u0004\u0012\u00020\r0\u0013j\b\u0012\u0004\u0012\u00020\r`\u0012¢\u0006\u0002\u0010\u0016J\u0014\u0010\u0017\u001a\u00020\u000b2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019J\u0006\u0010\u001b\u001a\u00020\u000bJ\u0016\u0010\u001c\u001a\u00020\u000b2\u000e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u0013J\u000e\u0010\u001f\u001a\u00020\u000b2\u0006\u0010 \u001a\u00020\u001eJ\u0018\u0010\u001f\u001a\u00020\u000b2\u0006\u0010 \u001a\u00020\u001e2\u0006\u0010!\u001a\u00020\"H\u0002J\u0010\u0010#\u001a\u00020\u001a2\u0006\u0010$\u001a\u00020%H\u0002J\u0016\u0010&\u001a\u00020'2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020'0)H\u0002R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006*"}, d2 = {"Lcom/xiaomi/fitness/habit/manager/HabitHelper;", "", "<init>", "()V", "habitDao", "Lcom/xiaomi/fitness/habit/persist/dao/HabitDao;", "getHabitDao", "()Lcom/xiaomi/fitness/habit/persist/dao/HabitDao;", "habitDao$delegate", "Lkotlin/Lazy;", "insterOrUpdate", "", "habit", "Lcom/example/habit/export/Habit;", "callBack", "Lkotlin/Function0;", "list", "Lkotlin/Function1;", "Lkotlin/collections/ArrayList;", "Ljava/util/ArrayList;", "clearAndAddAll", "habitList", "(Ljava/util/ArrayList;)V", "deleteHabitsByIds", "typeIdList", "", "", "clearCalendars", "saveOrUpdateCalendars", "habitBeans", "Lcom/example/habit/export/HabitBean;", "saveCalendar", "habitBean", "showToast", "", "getStartTime", "weekDayBean", "Lcom/example/habit/export/WeekDayBean;", "getDateNumber", "", "weekList", "", "habit_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class HabitHelper {

    @NotNull
    public static final HabitHelper INSTANCE = new HabitHelper();

    /* JADX INFO: renamed from: habitDao$delegate, reason: from kotlin metadata */
    @NotNull
    private static final Lazy habitDao = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: xeb
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return HabitHelper.habitDao_delegate$lambda$0();
        }
    });

    /* JADX INFO: renamed from: com.xiaomi.fitness.habit.manager.HabitHelper$clearAndAddAll$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.habit.manager.HabitHelper$clearAndAddAll$1", f = "HabitHelper.kt", i = {}, l = {61}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nHabitHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HabitHelper.kt\ncom/xiaomi/fitness/habit/manager/HabitHelper$clearAndAddAll$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,196:1\n1863#2,2:197\n*S KotlinDebug\n*F\n+ 1 HabitHelper.kt\ncom/xiaomi/fitness/habit/manager/HabitHelper$clearAndAddAll$1\n*L\n60#1:197,2\n*E\n"})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ ArrayList<Habit> $habitList;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ArrayList<Habit> arrayList, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$habitList = arrayList;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$habitList, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Iterator it;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                HabitHelper.INSTANCE.getHabitDao().clear();
                it = this.$habitList.iterator();
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                it = (Iterator) this.L$0;
                ResultKt.throwOnFailure(obj);
            }
            while (it.hasNext()) {
                Habit habit = (Habit) it.next();
                this.L$0 = it;
                this.label = 1;
                if (HabitHelper.INSTANCE.getHabitDao().insert(new Habit[]{habit}, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            hfb.d("db clearAndAddAll");
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.habit.manager.HabitHelper$deleteHabitsByIds$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.habit.manager.HabitHelper$deleteHabitsByIds$1", f = "HabitHelper.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nHabitHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HabitHelper.kt\ncom/xiaomi/fitness/habit/manager/HabitHelper$deleteHabitsByIds$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,196:1\n1863#2,2:197\n*S KotlinDebug\n*F\n+ 1 HabitHelper.kt\ncom/xiaomi/fitness/habit/manager/HabitHelper$deleteHabitsByIds$1\n*L\n69#1:197,2\n*E\n"})
    public static final class C23961 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ List<Long> $typeIdList;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23961(List<Long> list, Continuation<? super C23961> continuation) {
            super(2, continuation);
            this.$typeIdList = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C23961(this.$typeIdList, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Iterator<T> it = this.$typeIdList.iterator();
            while (it.hasNext()) {
                HabitHelper.INSTANCE.getHabitDao().deleteById(((Number) it.next()).longValue());
            }
            hfb.d("db deleteHabitsByIds");
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C23961) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.habit.manager.HabitHelper$insterOrUpdate$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.habit.manager.HabitHelper$insterOrUpdate$1", f = "HabitHelper.kt", i = {}, l = {33}, m = "invokeSuspend", n = {}, s = {})
    public static final class C23971 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function0<Unit> $callBack;
        final /* synthetic */ Habit $habit;
        int label;

        /* JADX INFO: renamed from: com.xiaomi.fitness.habit.manager.HabitHelper$insterOrUpdate$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.habit.manager.HabitHelper$insterOrUpdate$1$1", f = "HabitHelper.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class C05751 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Function0<Unit> $callBack;
            final /* synthetic */ Habit $habit;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C05751(Habit habit, Function0<Unit> function0, Continuation<? super C05751> continuation) {
                super(2, continuation);
                this.$habit = habit;
                this.$callBack = function0;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C05751(this.$habit, this.$callBack, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                hfb.d("db insterOrUpdate updateTime:" + this.$habit.updateTime);
                this.$callBack.invoke();
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C05751) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23971(Habit habit, Function0<Unit> function0, Continuation<? super C23971> continuation) {
            super(2, continuation);
            this.$habit = habit;
            this.$callBack = function0;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C23971(this.$habit, this.$callBack, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                HabitDao habitDao = HabitHelper.INSTANCE.getHabitDao();
                Habit[] habitArr = {this.$habit};
                this.label = 1;
                if (habitDao.insert(habitArr, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            AnyExtKt.main$default(null, new C05751(this.$habit, this.$callBack, null), 1, null);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C23971) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.habit.manager.HabitHelper$list$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.habit.manager.HabitHelper$list$1", f = "HabitHelper.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nHabitHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HabitHelper.kt\ncom/xiaomi/fitness/habit/manager/HabitHelper$list$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,196:1\n1863#2,2:197\n*S KotlinDebug\n*F\n+ 1 HabitHelper.kt\ncom/xiaomi/fitness/habit/manager/HabitHelper$list$1\n*L\n48#1:197,2\n*E\n"})
    public static final class C23981 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function1<ArrayList<Habit>, Unit> $callBack;
        int label;

        /* JADX INFO: renamed from: com.xiaomi.fitness.habit.manager.HabitHelper$list$1$2, reason: invalid class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.habit.manager.HabitHelper$list$1$2", f = "HabitHelper.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Function1<ArrayList<Habit>, Unit> $callBack;
            final /* synthetic */ ArrayList<Habit> $habitList;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public AnonymousClass2(Function1<? super ArrayList<Habit>, Unit> function1, ArrayList<Habit> arrayList, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.$callBack = function1;
                this.$habitList = arrayList;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(this.$callBack, this.$habitList, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.$callBack.invoke2(this.$habitList);
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C23981(Function1<? super ArrayList<Habit>, Unit> function1, Continuation<? super C23981> continuation) {
            super(2, continuation);
            this.$callBack = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C23981(this.$callBack, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            List<Habit> list = HabitHelper.INSTANCE.getHabitDao().list();
            hfb.d("db list size:" + list.size());
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add((Habit) it.next());
            }
            AnyExtKt.main$default(null, new AnonymousClass2(this.$callBack, arrayList, null), 1, null);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C23981) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    private HabitHelper() {
    }

    private final int getDateNumber(List<Integer> weekList) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis());
        int i = calendar.get(7);
        int size = weekList.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (weekList.get(i2).intValue() >= i) {
                if (weekList.get(i2).intValue() == i) {
                    return 0;
                }
                return weekList.get(i2).intValue() - i;
            }
            if (i2 == weekList.size() - 1) {
                return (7 - i) + weekList.get(i2).intValue();
            }
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final HabitDao getHabitDao() {
        return (HabitDao) habitDao.getValue();
    }

    private final long getStartTime(WeekDayBean weekDayBean) {
        ArrayList arrayList = new ArrayList();
        if (weekDayBean.getRest()) {
            arrayList.add(1);
            arrayList.add(7);
        } else if (weekDayBean.getWork()) {
            arrayList.add(2);
            arrayList.add(3);
            arrayList.add(4);
            arrayList.add(5);
            arrayList.add(6);
        } else {
            if (weekDayBean.getSun()) {
                arrayList.add(1);
            }
            if (weekDayBean.getMon()) {
                arrayList.add(2);
            }
            if (weekDayBean.getTue()) {
                arrayList.add(3);
            }
            if (weekDayBean.getWeb()) {
                arrayList.add(4);
            }
            if (weekDayBean.getThu()) {
                arrayList.add(5);
            }
            if (weekDayBean.getFri()) {
                arrayList.add(6);
            }
            if (weekDayBean.getSat()) {
                arrayList.add(7);
            }
        }
        if (arrayList.isEmpty()) {
            return System.currentTimeMillis();
        }
        return System.currentTimeMillis() + ((long) (getDateNumber(arrayList) * 86400000));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final HabitDao habitDao_delegate$lambda$0() {
        return HabitDatabase.INSTANCE.getInstance().getHabitDao();
    }

    public final void clearAndAddAll(@NotNull ArrayList<Habit> habitList) {
        Intrinsics.checkNotNullParameter(habitList, "habitList");
        AnyExtKt.io$default(null, new AnonymousClass1(habitList, null), 1, null);
    }

    public final void clearCalendars() {
        if (PermissionsUtil.INSTANCE.checkPermission("android.permission.WRITE_CALENDAR")) {
            ba3.g(AppUtil.getApp());
        }
    }

    public final void deleteHabitsByIds(@NotNull List<Long> typeIdList) {
        Intrinsics.checkNotNullParameter(typeIdList, "typeIdList");
        AnyExtKt.io$default(null, new C23961(typeIdList, null), 1, null);
    }

    public final void insterOrUpdate(@NotNull Habit habit, @NotNull Function0<Unit> callBack) {
        Intrinsics.checkNotNullParameter(habit, "habit");
        Intrinsics.checkNotNullParameter(callBack, "callBack");
        AnyExtKt.io$default(null, new C23971(habit, callBack, null), 1, null);
    }

    public final void list(@NotNull Function1<? super ArrayList<Habit>, Unit> callBack) {
        Intrinsics.checkNotNullParameter(callBack, "callBack");
        AnyExtKt.io$default(null, new C23981(callBack, null), 1, null);
    }

    public final void saveCalendar(@NotNull HabitBean habitBean) {
        Intrinsics.checkNotNullParameter(habitBean, "habitBean");
        if (habitBean.syncCalendar) {
            saveCalendar(habitBean, true);
        } else {
            ba3.i(AppUtil.getApp(), habitBean.name);
        }
    }

    public final void saveOrUpdateCalendars(@Nullable ArrayList<HabitBean> habitBeans) {
        if (!PermissionsUtil.INSTANCE.checkPermission("android.permission.WRITE_CALENDAR")) {
            hfb.d("save calendar no permission");
            return;
        }
        ba3.g(AppUtil.getApp());
        if (habitBeans == null || habitBeans.isEmpty()) {
            return;
        }
        Iterator<HabitBean> it = habitBeans.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        while (it.hasNext()) {
            HabitBean next = it.next();
            Intrinsics.checkNotNullExpressionValue(next, "next(...)");
            HabitBean habitBean = next;
            if (habitBean.syncCalendar) {
                saveCalendar(habitBean, false);
            }
        }
    }

    private final void saveCalendar(HabitBean habitBean, boolean showToast) {
        WeekDayBean weekDayBean = habitBean.repeat;
        ArrayList<HabitTime> arrayList = habitBean.punchTime;
        String str = habitBean.name;
        String str2 = habitBean.appBref;
        ArrayList arrayList2 = new ArrayList();
        Intrinsics.checkNotNull(weekDayBean);
        long startTime = getStartTime(weekDayBean);
        Iterator<HabitTime> it = arrayList.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        while (it.hasNext()) {
            HabitTime next = it.next();
            int hour = next.getHour();
            int minute = next.getMinute();
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(startTime);
            if (hour == 24) {
                hour = 0;
            }
            calendar.set(11, hour);
            calendar.set(12, minute);
            long timeInMillis = calendar.getTimeInMillis();
            String strD = ba3.d(weekDayBean);
            Intrinsics.checkNotNull(str);
            Intrinsics.checkNotNull(str2);
            Intrinsics.checkNotNull(strD);
            arrayList2.add(new CalendarReminderEvent(str, str2, timeInMillis, timeInMillis + ((long) 180000), strD));
            it = it;
        }
        if (ba3.c(AppUtil.getApp(), str, arrayList2) && showToast) {
            if (weekDayBean.getRest()) {
                ToastUtil.INSTANCE.showToast(b0j.i);
            } else if (weekDayBean.getWork()) {
                ToastUtil.INSTANCE.showToast(b0j.j);
            }
        }
    }
}

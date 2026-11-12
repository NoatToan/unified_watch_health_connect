package com.huami.femalehealth.uilib.viewmodel;

import com.huami.femalehealth.logiclib.api.pojo.HistoryDetailBean;
import com.huami.femalehealth.logiclib.api.pojo.MenstruationStatusBean;
import com.huami.femalehealth.logiclib.calculation.AidKt;
import com.huami.femalehealth.logiclib.dto.Degree;
import com.huami.femalehealth.logiclib.helper.DateTriple;
import com.huami.femalehealth.logiclib.repo.MenstruationRepo;
import com.huami.femalehealth.logiclib.vo.MenstruationVo;
import com.huami.tools.log.HMLog;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0001*\u00020\u0000H\u008a@¨\u0006\u0002"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "com/huami/femalehealth/uilib/viewmodel/FHBaseViewModel$safeLaunch$1", "<anonymous>"}, k = 3, mv = {1, 5, 1})
@DebugMetadata(c = "com.huami.femalehealth.uilib.viewmodel.FemaleHealthViewModel$setCardStatus$1$invoke$$inlined$safeLaunch$uilib_release$default$1", f = "FemaleHealthViewModel.kt", i = {0, 1}, l = {150, 157}, m = "invokeSuspend", n = {"$this$invoke_u24lambda_u2d8_u24lambda_u2d7", "$this$invoke_u24lambda_u2d8_u24lambda_u2d7_u24lambda_u2d6"}, s = {"L$1", "L$2"})
public final class FemaleHealthViewModel$setCardStatus$1$invoke$$inlined$safeLaunch$uilib_release$default$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int a;
    private /* synthetic */ Object b;
    public final /* synthetic */ FemaleHealthViewModel c;
    public final /* synthetic */ Degree d;
    public final /* synthetic */ Degree e;
    public final /* synthetic */ Degree f;
    public Object g;
    public Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FemaleHealthViewModel$setCardStatus$1$invoke$$inlined$safeLaunch$uilib_release$default$1(Continuation continuation, FemaleHealthViewModel femaleHealthViewModel, Degree degree, Degree degree2, Degree degree3) {
        super(2, continuation);
        this.c = femaleHealthViewModel;
        this.d = degree;
        this.e = degree2;
        this.f = degree3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        FemaleHealthViewModel$setCardStatus$1$invoke$$inlined$safeLaunch$uilib_release$default$1 femaleHealthViewModel$setCardStatus$1$invoke$$inlined$safeLaunch$uilib_release$default$1 = new FemaleHealthViewModel$setCardStatus$1$invoke$$inlined$safeLaunch$uilib_release$default$1(continuation, this.c, this.d, this.e, this.f);
        femaleHealthViewModel$setCardStatus$1$invoke$$inlined$safeLaunch$uilib_release$default$1.b = obj;
        return femaleHealthViewModel$setCardStatus$1$invoke$$inlined$safeLaunch$uilib_release$default$1;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((FemaleHealthViewModel$setCardStatus$1$invoke$$inlined$safeLaunch$uilib_release$default$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x007f  */
    /* JADX WARN: Code duplicated, block: B:46:0x0144  */
    /* JADX WARN: Code duplicated, block: B:49:0x0151  */
    /* JADX WARN: Code duplicated, block: B:52:0x0160  */
    /* JADX WARN: Code duplicated, block: B:55:0x016f  */
    /* JADX WARN: Code duplicated, block: B:57:0x018c  */
    /* JADX WARN: Code duplicated, block: B:58:0x018e  */
    /* JADX WARN: Code duplicated, block: B:65:0x01a7 A[LOOP:1: B:63:0x01a1->B:65:0x01a7, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:68:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:69:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:72:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:73:0x01db  */
    /* JADX WARN: Code duplicated, block: B:76:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:77:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:80:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:81:0x0207  */
    /* JADX WARN: Code duplicated, block: B:87:0x0199 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:89:0x0169 A[SYNTHETIC] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        DateTriple dateTriple;
        Object lastMenstruation;
        DateTriple dateTriple2;
        Object next;
        Long lBoxLong;
        Object cardStatus;
        MenstruationVo menstruationVo;
        MenstruationStatusBean menstruationStatusBean;
        ArrayList arrayList;
        String id;
        List list;
        Long menstruationTime;
        long jLongValue;
        Integer hp;
        int iIntValue;
        Integer mood;
        int iIntValue2;
        Integer pain;
        int iIntValue3;
        ArrayList arrayList2;
        Iterator it2;
        boolean z;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i != 0) {
            if (i == 1) {
                dateTriple = (DateTriple) this.g;
                DateTriple dateTriple3 = (DateTriple) this.b;
                ResultKt.throwOnFailure(obj);
                dateTriple2 = dateTriple3;
                lastMenstruation = obj;
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                menstruationVo = (MenstruationVo) this.h;
                ResultKt.throwOnFailure(obj);
                cardStatus = obj;
            }
            menstruationStatusBean = (MenstruationStatusBean) cardStatus;
            if (menstruationStatusBean != null) {
                arrayList = new ArrayList();
                id = menstruationVo.getId();
                if (id != null) {
                    list = (List) this.c.statusCatch.get(id);
                    if (list != null) {
                        arrayList2 = new ArrayList();
                        for (Object obj2 : list) {
                            if (((HistoryDetailBean) obj2).getMenstruationTime() != AidKt.toDate(this.c.select).getTime()) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (Boxing.boxBoolean(z).booleanValue()) {
                                arrayList2.add(obj2);
                            }
                        }
                        it2 = arrayList2.iterator();
                        while (it2.hasNext()) {
                            arrayList.add((HistoryDetailBean) it2.next());
                        }
                    }
                    menstruationTime = menstruationStatusBean.getMenstruationTime();
                    if (menstruationTime == null) {
                        jLongValue = AidKt.toDate(this.c.select).getTime();
                    } else {
                        jLongValue = menstruationTime.longValue();
                    }
                    long j = jLongValue;
                    hp = menstruationStatusBean.getHp();
                    if (hp == null) {
                        iIntValue = this.e.getValue() - 1;
                    } else {
                        iIntValue = hp.intValue();
                    }
                    Integer numBoxInt = Boxing.boxInt(iIntValue);
                    mood = menstruationStatusBean.getMood();
                    if (mood == null) {
                        iIntValue2 = this.f.getValue() - 1;
                    } else {
                        iIntValue2 = mood.intValue();
                    }
                    Integer numBoxInt2 = Boxing.boxInt(iIntValue2);
                    pain = menstruationStatusBean.getPain();
                    if (pain == null) {
                        iIntValue3 = this.d.getValue() - 1;
                    } else {
                        iIntValue3 = pain.intValue();
                    }
                    arrayList.add(new HistoryDetailBean("", j, id, numBoxInt, numBoxInt2, Boxing.boxInt(iIntValue3)));
                    this.c.statusCatch.put(id, arrayList);
                }
                FemaleHealthViewModel.q(this.c, false, 1, null);
            }
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        dateTriple = this.c.select;
        MenstruationRepo menstruationRepo = this.c.repo;
        Date date = AidKt.toDate(dateTriple);
        this.b = dateTriple;
        this.g = dateTriple;
        this.a = 1;
        lastMenstruation = menstruationRepo.getLastMenstruation(date, this);
        if (lastMenstruation == coroutine_suspended) {
            return coroutine_suspended;
        }
        dateTriple2 = dateTriple;
        List list2 = (List) lastMenstruation;
        MenstruationVo menstruationVo2 = (MenstruationVo) CollectionsKt.firstOrNull(list2);
        if (menstruationVo2 != null) {
            List list3 = (List) this.c.statusCatch.get(menstruationVo2.getId());
            if (list3 == null) {
                lBoxLong = null;
            } else {
                Iterator it3 = list3.iterator();
                do {
                    if (!it3.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it3.next();
                } while (!Boxing.boxBoolean(AidKt.resetZeroHour(AidKt.toDate(this.c.select).getTime()) == AidKt.resetZeroHour(((HistoryDetailBean) next).getMenstruationTime())).booleanValue());
                HistoryDetailBean historyDetailBean = (HistoryDetailBean) next;
                if (historyDetailBean == null) {
                    lBoxLong = null;
                } else {
                    lBoxLong = Boxing.boxLong(historyDetailBean.getMenstruationTime());
                }
            }
            HMLog.info("xys_FemaleHealthViewModel", new FemaleHealthViewModel.AnonymousClass1.a(lBoxLong, list2));
            MenstruationRepo menstruationRepo2 = this.c.repo;
            MenstruationStatusBean menstruationStatusBean2 = new MenstruationStatusBean((String) null, menstruationVo2.getId(), Boxing.boxLong(lBoxLong == null ? AidKt.toDate(dateTriple).getTime() : lBoxLong.longValue()), Boxing.boxInt(this.e.getValue() - 1), Boxing.boxInt(this.f.getValue() - 1), Boxing.boxInt(this.d.getValue() - 1), 1, (DefaultConstructorMarker) null);
            this.b = dateTriple2;
            this.g = menstruationVo2;
            this.h = menstruationVo2;
            this.a = 2;
            cardStatus = menstruationRepo2.setCardStatus(menstruationStatusBean2, this);
            if (cardStatus == coroutine_suspended) {
                return coroutine_suspended;
            }
            menstruationVo = menstruationVo2;
            menstruationStatusBean = (MenstruationStatusBean) cardStatus;
            if (menstruationStatusBean != null) {
                arrayList = new ArrayList();
                id = menstruationVo.getId();
                if (id != null) {
                    list = (List) this.c.statusCatch.get(id);
                    if (list != null) {
                        arrayList2 = new ArrayList();
                        while (r7.hasNext()) {
                            if (((HistoryDetailBean) obj2).getMenstruationTime() != AidKt.toDate(this.c.select).getTime()) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (Boxing.boxBoolean(z).booleanValue()) {
                                arrayList2.add(obj2);
                            }
                        }
                        it2 = arrayList2.iterator();
                        while (it2.hasNext()) {
                            arrayList.add((HistoryDetailBean) it2.next());
                        }
                    }
                    menstruationTime = menstruationStatusBean.getMenstruationTime();
                    if (menstruationTime == null) {
                        jLongValue = AidKt.toDate(this.c.select).getTime();
                    } else {
                        jLongValue = menstruationTime.longValue();
                    }
                    long j2 = jLongValue;
                    hp = menstruationStatusBean.getHp();
                    if (hp == null) {
                        iIntValue = this.e.getValue() - 1;
                    } else {
                        iIntValue = hp.intValue();
                    }
                    Integer numBoxInt3 = Boxing.boxInt(iIntValue);
                    mood = menstruationStatusBean.getMood();
                    if (mood == null) {
                        iIntValue2 = this.f.getValue() - 1;
                    } else {
                        iIntValue2 = mood.intValue();
                    }
                    Integer numBoxInt4 = Boxing.boxInt(iIntValue2);
                    pain = menstruationStatusBean.getPain();
                    if (pain == null) {
                        iIntValue3 = this.d.getValue() - 1;
                    } else {
                        iIntValue3 = pain.intValue();
                    }
                    arrayList.add(new HistoryDetailBean("", j2, id, numBoxInt3, numBoxInt4, Boxing.boxInt(iIntValue3)));
                    this.c.statusCatch.put(id, arrayList);
                }
                FemaleHealthViewModel.q(this.c, false, 1, null);
            }
        }
        return Unit.INSTANCE;
    }
}

package com.huami.bloodpressure_ui.add;

import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.ViewModel;
import androidx.p008lifecycle.ViewModelKt;
import com.amap.api.mapcore.util.hl;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.android.vo.Resource;
import com.huami.bloodpressure_core.dc.local.BloodPressureDbVo;
import com.huami.bloodpressure_core.dc.local.BloodPressureVo;
import com.huami.bloodpressure_core.dc.local.ILocalDelegate;
import com.huami.bloodpressure_core.dc.remote.BloodPressureRemoteV2Entity;
import com.huami.bloodpressure_core.dc.remote.BloodPressureRequestV2Entity;
import com.huami.bloodpressure_core.dc.remote.IBloodPressureDelegate;
import com.huami.bloodpressure_core.di.BloodPressureModuleKt;
import com.huami.bloodpressure_core.di.KoinExKt;
import com.huami.bloodpressure_core.ext.UserEx;
import com.huami.bloodpressure_core.p002const.BloodPressureConst;
import com.huami.bloodpressure_ui.convert.RemoteVoConverterKt;
import com.huami.bloodpressure_ui.ext.TimeZoneExKt;
import com.huami.bloodpressure_ui.view.TimePickerDialog;
import com.loc.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.e;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.text.l;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.qualifier.QualifierKt;
import org.koin.core.scope.Scope;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b?\u0010@J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\u000e\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tJ\u000e\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fJ\u000e\u0010\u000f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fJ\u0006\u0010\u0010\u001a\u00020\u0002R\u001c\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\u00118\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0012R\u001f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00060\u00118\u0006@\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0014\u0010\u0015R\"\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00170\u00118\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0012R%\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00170\u00118\u0006@\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0012\u001a\u0004\b\u001b\u0010\u0015R\u001c\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\f0\u00118\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0012R\u001f\u0010!\u001a\b\u0012\u0004\u0012\u00020\f0\u00118\u0006@\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0012\u001a\u0004\b \u0010\u0015R\u001c\u0010#\u001a\b\u0012\u0004\u0012\u00020\f0\u00118\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0012R\u001f\u0010&\u001a\b\u0012\u0004\u0012\u00020\f0\u00118\u0006@\u0006¢\u0006\f\n\u0004\b$\u0010\u0012\u001a\u0004\b%\u0010\u0015R\u001f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00040\u00118\u0006@\u0006¢\u0006\f\n\u0004\b'\u0010\u0012\u001a\u0004\b(\u0010\u0015R\u001f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00040\u00118\u0006@\u0006¢\u0006\f\n\u0004\b*\u0010\u0012\u001a\u0004\b+\u0010\u0015R/\u00104\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020/0.\u0012\u0004\u0012\u0002000-8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b\u0018\u00103R\u001d\u00108\u001a\u0002058B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b6\u00102\u001a\u0004\b\u001d\u00107R\u001f\u0010;\u001a\b\u0012\u0004\u0012\u00020\t0\u00118\u0006@\u0006¢\u0006\f\n\u0004\b9\u0010\u0012\u001a\u0004\b:\u0010\u0015R\u001f\u0010>\u001a\b\u0012\u0004\u0012\u00020\t0\u00118\u0006@\u0006¢\u0006\f\n\u0004\b<\u0010\u0012\u001a\u0004\b=\u0010\u0015¨\u0006A"}, d2 = {"Lcom/huami/bloodpressure_ui/add/BloodPressureAddViewModel;", "Landroidx/lifecycle/ViewModel;", "", "a", "", "b", "", "timeMillis", "setCurrentTime", "Lcom/huami/bloodpressure_ui/view/TimePickerDialog$Mode;", "mode", "setTimePickerMode", "", "it", "inputSbp", "inputDbp", "postData", "Landroidx/lifecycle/MutableLiveData;", "Landroidx/lifecycle/MutableLiveData;", "_currentTimeMillis", "getCurrentTimeMillis", "()Landroidx/lifecycle/MutableLiveData;", "currentTimeMillis", "Lcom/huami/android/vo/Resource;", "c", "_insertResultLiveData", GoogleApiAvailabilityLight.a, "getInsertResultLiveData", "insertResultLiveData", "e", "_sbpValue", "f", "getSbpValue", "sbpValue", "g", "_dbpValue", "h", "getDbpValue", "dbpValue", "i", "get_enableSave", "_enableSave", z.j, "getEnableSave", "enableSave", "Lcom/huami/bloodpressure_core/dc/remote/IBloodPressureDelegate;", "Lcom/huami/bloodpressure_core/dc/remote/BloodPressureRemoteV2Entity;", "Lcom/huami/bloodpressure_core/dc/local/BloodPressureVo;", "Lcom/huami/bloodpressure_core/dc/remote/BloodPressureRequestV2Entity;", hl.k, "Lkotlin/Lazy;", "()Lcom/huami/bloodpressure_core/dc/remote/IBloodPressureDelegate;", "bloodPressureEventApiV2", "Lcom/huami/bloodpressure_core/dc/local/ILocalDelegate;", "l", "()Lcom/huami/bloodpressure_core/dc/local/ILocalDelegate;", "iLocalDelegate", "m", "get_timePickerTrigger", "_timePickerTrigger", GoogleApiAvailabilityLight.b, "getTimePickerTrigger", "timePickerTrigger", "<init>", "()V", "bloodpressure-ui_release"}, k = 1, mv = {1, 5, 1})
public final class BloodPressureAddViewModel extends ViewModel {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Long> _currentTimeMillis;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Long> currentTimeMillis;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Resource<Long>> _insertResultLiveData;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Resource<Long>> insertResultLiveData;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<String> _sbpValue;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<String> sbpValue;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<String> _dbpValue;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<String> dbpValue;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Boolean> _enableSave;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Boolean> enableSave;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    private final Lazy bloodPressureEventApiV2;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    private final Lazy iLocalDelegate;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<TimePickerDialog.Mode> _timePickerTrigger;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<TimePickerDialog.Mode> timePickerTrigger;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012\u0004\u0012\u00020\u00030\u0000H\n"}, d2 = {"Lcom/huami/bloodpressure_core/dc/remote/IBloodPressureDelegate;", "Lcom/huami/bloodpressure_core/dc/remote/BloodPressureRemoteV2Entity;", "Lcom/huami/bloodpressure_core/dc/local/BloodPressureVo;", "Lcom/huami/bloodpressure_core/dc/remote/BloodPressureRequestV2Entity;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<IBloodPressureDelegate<BloodPressureRemoteV2Entity<BloodPressureVo>, BloodPressureRequestV2Entity>> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final IBloodPressureDelegate<BloodPressureRemoteV2Entity<BloodPressureVo>, BloodPressureRequestV2Entity> getA() {
            Scope scopeBloodPressureScope = KoinExKt.bloodPressureScope();
            return (IBloodPressureDelegate) KoinExKt.bloodPressureScope(scopeBloodPressureScope.getKoin()).get(Reflection.getOrCreateKotlinClass(IBloodPressureDelegate.class), QualifierKt.named(BloodPressureModuleKt.BLOODPRESSURE_SCOPE_APIV2), null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/bloodpressure_core/dc/local/ILocalDelegate;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<ILocalDelegate> {
        public static final b a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ILocalDelegate getA() {
            return (ILocalDelegate) KoinExKt.bloodPressureScope(KoinExKt.bloodPressureScope().getKoin()).get(Reflection.getOrCreateKotlinClass(ILocalDelegate.class), null, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bloodpressure_ui.add.BloodPressureAddViewModel$postData$1$1", f = "BloodPressureAddViewModel.kt", i = {0}, l = {136, 146}, m = "invokeSuspend", n = {"list"}, s = {"L$0"})
    public static final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public Object a;
        public int b;
        public final /* synthetic */ long d;
        public final /* synthetic */ int e;
        public final /* synthetic */ int f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(long j, int i, int i2, Continuation<? super c> continuation) {
            super(2, continuation);
            this.d = j;
            this.e = i;
            this.f = i2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return BloodPressureAddViewModel.this.new c(this.d, this.e, this.f, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            List listListOf;
            Object objPostDataList;
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.b;
            if (i != 0) {
                if (i == 1) {
                    listListOf = (List) this.a;
                    ResultKt.throwOnFailure(obj);
                    objPostDataList = obj;
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                BloodPressureAddViewModel.this.getInsertResultLiveData().postValue(Resource.INSTANCE.success(Boxing.boxLong(this.d)));
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            BloodPressureAddViewModel.this.getInsertResultLiveData().postValue(Resource.Companion.loading$default(Resource.INSTANCE, null, 1, null));
            listListOf = e.listOf(new BloodPressureRequestV2Entity("blood_pressure", BloodPressureConst.ParamValue.MANUALLY_ADD_DATA, this.d, UserEx.getUserId(), new BloodPressureVo(this.d, this.e, this.f, (Integer) null, TimeZoneExKt.getSecondsFromGMT(), 8, (DefaultConstructorMarker) null)));
            IBloodPressureDelegate iBloodPressureDelegateC = BloodPressureAddViewModel.this.c();
            this.a = listListOf;
            this.b = 1;
            objPostDataList = iBloodPressureDelegateC.postDataList(listListOf, this);
            if (objPostDataList == coroutine_suspended) {
                return coroutine_suspended;
            }
            if (((Boolean) objPostDataList).booleanValue()) {
                ArrayList arrayList = new ArrayList(listListOf.size());
                Iterator it2 = listListOf.iterator();
                while (it2.hasNext()) {
                    BloodPressureDbVo dataBaseVo = RemoteVoConverterKt.toDataBaseVo((BloodPressureRequestV2Entity) it2.next());
                    if (dataBaseVo != null) {
                        Boxing.boxBoolean(arrayList.add(dataBaseVo));
                    }
                }
                ILocalDelegate iLocalDelegateE = BloodPressureAddViewModel.this.e();
                this.a = null;
                this.b = 2;
                if (iLocalDelegateE.insert(arrayList, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                BloodPressureAddViewModel.this.getInsertResultLiveData().postValue(Resource.INSTANCE.success(Boxing.boxLong(this.d)));
            } else {
                BloodPressureAddViewModel.this.getInsertResultLiveData().postValue(Resource.Companion.error$default(Resource.INSTANCE, null, null, 3, null));
            }
            return Unit.INSTANCE;
        }
    }

    public BloodPressureAddViewModel() {
        MutableLiveData<Long> mutableLiveData = new MutableLiveData<>();
        this._currentTimeMillis = mutableLiveData;
        this.currentTimeMillis = mutableLiveData;
        MutableLiveData<Resource<Long>> mutableLiveData2 = new MutableLiveData<>();
        this._insertResultLiveData = mutableLiveData2;
        this.insertResultLiveData = mutableLiveData2;
        MutableLiveData<String> mutableLiveData3 = new MutableLiveData<>();
        this._sbpValue = mutableLiveData3;
        this.sbpValue = mutableLiveData3;
        MutableLiveData<String> mutableLiveData4 = new MutableLiveData<>();
        this._dbpValue = mutableLiveData4;
        this.dbpValue = mutableLiveData4;
        MutableLiveData<Boolean> mutableLiveData5 = new MutableLiveData<>();
        this._enableSave = mutableLiveData5;
        this.enableSave = mutableLiveData5;
        this.bloodPressureEventApiV2 = LazyKt__LazyJVMKt.lazy(a.a);
        this.iLocalDelegate = LazyKt__LazyJVMKt.lazy(b.a);
        MutableLiveData<TimePickerDialog.Mode> mutableLiveData6 = new MutableLiveData<>();
        this._timePickerTrigger = mutableLiveData6;
        this.timePickerTrigger = mutableLiveData6;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0024  */
    /* JADX WARN: Code duplicated, block: B:19:0x003a  */
    private final void a() {
        boolean z;
        boolean z2;
        String value = this.sbpValue.getValue();
        Integer intOrNull = value == null ? null : l.toIntOrNull(value);
        String value2 = this.dbpValue.getValue();
        Integer intOrNull2 = value2 != null ? l.toIntOrNull(value2) : null;
        if (intOrNull == null) {
            z = false;
        } else {
            float fIntValue = intOrNull.intValue();
            if (40.0f > fIntValue || fIntValue > 300.0f) {
                z = false;
            } else {
                z = true;
            }
        }
        if (intOrNull2 == null) {
            z2 = false;
        } else {
            float fIntValue2 = intOrNull2.intValue();
            if (30.0f > fIntValue2 || fIntValue2 > 200.0f) {
                z2 = false;
            } else {
                z2 = true;
            }
        }
        this._enableSave.setValue(Boolean.valueOf(z && z2 && b() && intOrNull.intValue() > intOrNull2.intValue()));
    }

    private final boolean b() {
        Long value = this.currentTimeMillis.getValue();
        return value != null && value.longValue() <= System.currentTimeMillis();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final IBloodPressureDelegate<BloodPressureRemoteV2Entity<BloodPressureVo>, BloodPressureRequestV2Entity> c() {
        return (IBloodPressureDelegate) this.bloodPressureEventApiV2.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ILocalDelegate e() {
        return (ILocalDelegate) this.iLocalDelegate.getValue();
    }

    @NotNull
    public final MutableLiveData<Long> getCurrentTimeMillis() {
        return this.currentTimeMillis;
    }

    @NotNull
    public final MutableLiveData<String> getDbpValue() {
        return this.dbpValue;
    }

    @NotNull
    public final MutableLiveData<Boolean> getEnableSave() {
        return this.enableSave;
    }

    @NotNull
    public final MutableLiveData<Resource<Long>> getInsertResultLiveData() {
        return this.insertResultLiveData;
    }

    @NotNull
    public final MutableLiveData<String> getSbpValue() {
        return this.sbpValue;
    }

    @NotNull
    public final MutableLiveData<TimePickerDialog.Mode> getTimePickerTrigger() {
        return this.timePickerTrigger;
    }

    @NotNull
    public final MutableLiveData<Boolean> get_enableSave() {
        return this._enableSave;
    }

    @NotNull
    public final MutableLiveData<TimePickerDialog.Mode> get_timePickerTrigger() {
        return this._timePickerTrigger;
    }

    public final void inputDbp(@NotNull String it2) {
        this._dbpValue.setValue(it2);
        a();
    }

    public final void inputSbp(@NotNull String it2) {
        this._sbpValue.setValue(it2);
        a();
    }

    public final void postData() {
        Long value = this._currentTimeMillis.getValue();
        if (value == null) {
            return;
        }
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new c(value.longValue(), Integer.parseInt(this._sbpValue.getValue()), Integer.parseInt(this._dbpValue.getValue()), null), 2, null);
    }

    public final void setCurrentTime(long timeMillis) {
        this._currentTimeMillis.setValue(Long.valueOf(timeMillis));
        a();
    }

    public final void setTimePickerMode(@NotNull TimePickerDialog.Mode mode) {
        this._timePickerTrigger.setValue(mode);
    }
}

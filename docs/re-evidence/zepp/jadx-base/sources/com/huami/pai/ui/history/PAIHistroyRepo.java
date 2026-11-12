package com.huami.pai.ui.history;

import android.database.sqlite.SQLiteException;
import androidx.exifinterface.media.ExifInterface;
import androidx.p008lifecycle.LiveData;
import androidx.room.RoomDatabaseKt;
import com.baseflow.permissionhandler.m;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.mifit.sportlib.common.DataTypeSource;
import com.huami.pai.db.PaiDb;
import com.huami.pai.db.userpai.PaiUserDao;
import com.huami.pai.dc.PaiWebConst;
import com.huami.pai.ext.DateExKt;
import com.huami.pai.ext.PaiDataVoExKt;
import com.huami.pai.ext.PaiTimeExKt;
import com.huami.pai.ext.SerializationKtxKt;
import com.huami.pai.koin.ScopesAndQualifersKt;
import com.huami.pai.p004const.SharedPrefConst;
import com.huami.pai.sp.ISharedPref;
import com.huami.pai.vo.PAIDataVo;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bt.profile.base.Mtu;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.language.CommonLanguageSettingFragment;
import it.sauronsoftware.ftp4j.FTPCodes;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.q;
import kotlin.collections.r;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.text.l;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.json.Json;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.context.GlobalContext;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u00032\u00020\u0004B\u001f\u0012\u0006\u0010.\u001a\u00020*\u0012\u0006\u00103\u001a\u00020/\u0012\u0006\u00109\u001a\u000204¢\u0006\u0004\bB\u0010CJ#\u0010\b\u001a\u00020\u00072\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0005H\u0083@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ#\u0010\n\u001a\u00020\u00072\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0005H\u0082@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\tJ\u0016\u0010\u000b\u001a\u00020\u00072\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0005J\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016J\u0019\u0010\u0011\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0010\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0010\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\fH\u0016J\u0014\u0010\u0018\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00050\u0017J\u001c\u0010\u001b\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00050\u00172\u0006\u0010\u001a\u001a\u00020\u0019J\u0014\u0010\u001d\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00050\u001cJ\u000e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0005J\u0016\u0010\u001f\u001a\u00020\u00072\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0005J\u0016\u0010 \u001a\u00020\u00072\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0005J \u0010#\u001a\u00020\u00072\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00052\b\b\u0002\u0010\"\u001a\u00020!J\u0006\u0010$\u001a\u00020\u0007J\u0013\u0010%\u001a\u00020\u0019H\u0086@ø\u0001\u0000¢\u0006\u0004\b%\u0010&J#\u0010'\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00052\u0006\u0010\u001a\u001a\u00020\u0019H\u0086@ø\u0001\u0000¢\u0006\u0004\b'\u0010(J\u0006\u0010)\u001a\u00020\u0007R\u0019\u0010.\u001a\u00020*8\u0006@\u0006¢\u0006\f\n\u0004\b\n\u0010+\u001a\u0004\b,\u0010-R\u0019\u00103\u001a\u00020/8\u0006@\u0006¢\u0006\f\n\u0004\b\b\u00100\u001a\u0004\b1\u00102R\u0019\u00109\u001a\u0002048\u0006@\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R0\u0010A\u001a\u0010\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00028\u0000\u0018\u00010:8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b\u000b\u0010@\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006D"}, d2 = {"Lcom/huami/pai/ui/history/PAIHistroyRepo;", "Lcom/huami/pai/vo/PAIDataVo;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/huami/pai/ui/history/PAIBaseHistoryRepo;", "Lorg/koin/core/component/KoinComponent;", "", "value", "", "b", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "setList", "Ljava/util/Date;", "dateKey", "", "hasReal", "date", "getData", "(Ljava/util/Date;)Lcom/huami/pai/vo/PAIDataVo;", "", "getPredictData", "(Ljava/util/Date;)Ljava/lang/Float;", "getRealOrPredictData", "Lkotlinx/coroutines/flow/Flow;", "getRemoteDatas", "", "from", "getRemoteChangedDatas", "Landroidx/lifecycle/LiveData;", "getPaiLiveDatas", "getPaiList", "saveUserPaiLocal", "saveLocalAndPost", "", "limit", "saveLocalAndLimitPost", "cleanData", "getLatestTimeStamp", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getRemoteData", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getRemoteChangedDatasInPaiScope", "Lcom/huami/pai/ui/history/PAIBaseRepo;", "Lcom/huami/pai/ui/history/PAIBaseRepo;", "getRepo", "()Lcom/huami/pai/ui/history/PAIBaseRepo;", CommonLanguageSettingFragment.KEY_REPO, "Lcom/huami/pai/db/PaiDb;", "Lcom/huami/pai/db/PaiDb;", "getDbRepo", "()Lcom/huami/pai/db/PaiDb;", "dbRepo", "Lkotlinx/coroutines/CoroutineScope;", "c", "Lkotlinx/coroutines/CoroutineScope;", "getCoroutineScope", "()Lkotlinx/coroutines/CoroutineScope;", "coroutineScope", "", "", GoogleApiAvailabilityLight.a, "Ljava/util/Map;", "getList", "()Ljava/util/Map;", "(Ljava/util/Map;)V", "list", "<init>", "(Lcom/huami/pai/ui/history/PAIBaseRepo;Lcom/huami/pai/db/PaiDb;Lkotlinx/coroutines/CoroutineScope;)V", "lib_release"}, k = 1, mv = {1, 5, 1})
public final class PAIHistroyRepo<T extends PAIDataVo> implements PAIBaseHistoryRepo<T>, KoinComponent {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final PAIBaseRepo repo;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final PaiDb dbRepo;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final CoroutineScope coroutineScope;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    private Map<String, T> list;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u0002H\u008a@"}, d2 = {"Lcom/huami/pai/vo/PAIDataVo;", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.pai.ui.history.PAIHistroyRepo$cleanData$1", f = "PAIHistroyRepo.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ PAIHistroyRepo<T> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(PAIHistroyRepo<T> pAIHistroyRepo, Continuation<? super a> continuation) {
            super(2, continuation);
            this.b = pAIHistroyRepo;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new a(this.b, continuation);
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
            this.b.getDbRepo().paiUserDB().cleanData();
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.pai.ui.history.PAIHistroyRepo", f = "PAIHistroyRepo.kt", i = {}, l = {277}, m = "getLatestTimeStamp", n = {}, s = {})
    public static final class b extends ContinuationImpl {
        public /* synthetic */ Object a;
        public final /* synthetic */ PAIHistroyRepo<T> b;
        public int c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(PAIHistroyRepo<T> pAIHistroyRepo, Continuation<? super b> continuation) {
            super(continuation);
            this.b = pAIHistroyRepo;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.a = obj;
            this.c |= Integer.MIN_VALUE;
            return this.b.getLatestTimeStamp(this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u0002H\u008a@"}, d2 = {"Lcom/huami/pai/vo/PAIDataVo;", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.pai.ui.history.PAIHistroyRepo$getRemoteChangedDatasInPaiScope$1", f = "PAIHistroyRepo.kt", i = {0}, l = {297, 308}, m = "invokeSuspend", n = {"mPaiSharedPref"}, s = {"L$0"})
    public static final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public Object a;
        public int b;
        public final /* synthetic */ PAIHistroyRepo<T> c;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0003\u001a\u0004\u0018\u00010\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n"}, d2 = {"Lcom/huami/pai/vo/PAIDataVo;", ExifInterface.GPS_DIRECTION_TRUE, "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public final /* synthetic */ PAIDataVo a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(PAIDataVo pAIDataVo) {
                super(0);
                this.a = pAIDataVo;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String getA() {
                return "paiStr Re " + this.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(PAIHistroyRepo<T> pAIHistroyRepo, Continuation<? super c> continuation) {
            super(2, continuation);
            this.c = pAIHistroyRepo;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new c(this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            ISharedPref iSharedPref;
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.b;
            if (i != 0) {
                if (i == 1) {
                    iSharedPref = (ISharedPref) this.a;
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
            iSharedPref = (ISharedPref) ScopesAndQualifersKt.paiScope(GlobalContext.INSTANCE.get()).get(Reflection.getOrCreateKotlinClass(ISharedPref.class), null, null);
            long jLongValue = 0;
            try {
                Long longOrNull = l.toLongOrNull(iSharedPref.getString(SharedPrefConst.KEY_PAI_LAST_DOWNLOAD_TIME, "0"));
                if (longOrNull != null) {
                    jLongValue = longOrNull.longValue();
                }
            } catch (Exception unused) {
            }
            PAIHistroyRepo<T> pAIHistroyRepo = this.c;
            this.a = iSharedPref;
            this.b = 1;
            obj = pAIHistroyRepo.getRemoteData(jLongValue, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            List list = (List) obj;
            if (list != null) {
                PAIHistroyRepo<T> pAIHistroyRepo2 = this.c;
                Iterator it2 = CollectionsKt___CollectionsKt.takeLast(list, 10).iterator();
                while (it2.hasNext()) {
                    HMLog.info(PaiWebConst.Tag.HTTP_TAG, new a((PAIDataVo) it2.next()));
                }
                iSharedPref.saveString(SharedPrefConst.KEY_PAI_LAST_DOWNLOAD_TIME, String.valueOf(((PAIDataVo) CollectionsKt.last(list)).getTimestamp()));
                this.a = null;
                this.b = 2;
                if (pAIHistroyRepo2.a(list, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u0002H\u008a@"}, d2 = {"Lcom/huami/pai/vo/PAIDataVo;", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.pai.ui.history.PAIHistroyRepo$saveLocalAndLimitPost$1", f = "PAIHistroyRepo.kt", i = {}, l = {197}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ PAIHistroyRepo<T> b;
        public final /* synthetic */ List<T> c;
        public final /* synthetic */ int d;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lcom/huami/pai/vo/PAIDataVo;", ExifInterface.GPS_DIRECTION_TRUE, "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.huami.pai.ui.history.PAIHistroyRepo$saveLocalAndLimitPost$1$1", f = "PAIHistroyRepo.kt", i = {3}, l = {199, 207, m.c, FTPCodes.DATA_CONNECTION_CLOSING, FTPCodes.ENTER_PASSIVE_MODE}, m = "invokeSuspend", n = {"it"}, s = {"L$1"})
        public static final class a extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
            public Object a;
            public Object b;
            public int c;
            public int d;
            public final /* synthetic */ PAIHistroyRepo<T> e;
            public final /* synthetic */ List<T> f;
            public final /* synthetic */ int g;

            /* JADX INFO: renamed from: com.huami.pai.ui.history.PAIHistroyRepo$d$a$a, reason: collision with other inner class name */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0003\u001a\u0004\u0018\u00010\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n"}, d2 = {"Lcom/huami/pai/vo/PAIDataVo;", ExifInterface.GPS_DIRECTION_TRUE, "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class C0522a extends Lambda implements Function0<String> {
                public final /* synthetic */ PAIDataVo a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0522a(PAIDataVo pAIDataVo) {
                    super(0);
                    this.a = pAIDataVo;
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final String getA() {
                    return "paiListJson " + this.a;
                }
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0003\u001a\u0004\u0018\u00010\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n"}, d2 = {"Lcom/huami/pai/vo/PAIDataVo;", ExifInterface.GPS_DIRECTION_TRUE, "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class b extends Lambda implements Function0<String> {
                public final /* synthetic */ Exception a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(Exception exc) {
                    super(0);
                    this.a = exc;
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final String getA() {
                    return "updateListUpload " + this.a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(PAIHistroyRepo<T> pAIHistroyRepo, List<T> list, int i, Continuation<? super a> continuation) {
                super(1, continuation);
                this.e = pAIHistroyRepo;
                this.f = list;
                this.g = i;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@NotNull Continuation<?> continuation) {
                return new a(this.e, this.f, this.g, continuation);
            }

            @Override // kotlin.jvm.functions.Function1
            @Nullable
            public final Object invoke(@Nullable Continuation<? super Unit> continuation) {
                return ((a) create(continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Code duplicated, block: B:42:0x00cf A[RETURN] */
            /* JADX WARN: Code duplicated, block: B:46:0x00d6 A[Catch: Exception -> 0x003a, TRY_ENTER, TryCatch #0 {Exception -> 0x003a, blocks: (B:9:0x001d, B:14:0x0032, B:55:0x011e, B:57:0x0126, B:58:0x013b, B:60:0x0141, B:61:0x0153, B:46:0x00d6, B:47:0x00de, B:49:0x00e4, B:50:0x00f3, B:52:0x00f9), top: B:67:0x0011 }] */
            /* JADX WARN: Code duplicated, block: B:49:0x00e4 A[Catch: Exception -> 0x003a, LOOP:1: B:47:0x00de->B:49:0x00e4, LOOP_END, TryCatch #0 {Exception -> 0x003a, blocks: (B:9:0x001d, B:14:0x0032, B:55:0x011e, B:57:0x0126, B:58:0x013b, B:60:0x0141, B:61:0x0153, B:46:0x00d6, B:47:0x00de, B:49:0x00e4, B:50:0x00f3, B:52:0x00f9), top: B:67:0x0011 }] */
            /* JADX WARN: Code duplicated, block: B:52:0x00f9 A[Catch: Exception -> 0x003a, TryCatch #0 {Exception -> 0x003a, blocks: (B:9:0x001d, B:14:0x0032, B:55:0x011e, B:57:0x0126, B:58:0x013b, B:60:0x0141, B:61:0x0153, B:46:0x00d6, B:47:0x00de, B:49:0x00e4, B:50:0x00f3, B:52:0x00f9), top: B:67:0x0011 }] */
            /* JADX WARN: Code duplicated, block: B:54:0x011d A[RETURN] */
            /* JADX WARN: Code duplicated, block: B:57:0x0126 A[Catch: Exception -> 0x003a, TryCatch #0 {Exception -> 0x003a, blocks: (B:9:0x001d, B:14:0x0032, B:55:0x011e, B:57:0x0126, B:58:0x013b, B:60:0x0141, B:61:0x0153, B:46:0x00d6, B:47:0x00de, B:49:0x00e4, B:50:0x00f3, B:52:0x00f9), top: B:67:0x0011 }] */
            /* JADX WARN: Code duplicated, block: B:60:0x0141 A[Catch: Exception -> 0x003a, LOOP:0: B:58:0x013b->B:60:0x0141, LOOP_END, TryCatch #0 {Exception -> 0x003a, blocks: (B:9:0x001d, B:14:0x0032, B:55:0x011e, B:57:0x0126, B:58:0x013b, B:60:0x0141, B:61:0x0153, B:46:0x00d6, B:47:0x00de, B:49:0x00e4, B:50:0x00f3, B:52:0x00f9), top: B:67:0x0011 }] */
            /* JADX WARN: Code duplicated, block: B:63:0x0160 A[RETURN] */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object userAllPaiListSuspend;
                PAIHistroyRepo<T> pAIHistroyRepo;
                int i;
                Object limitUploadPaiList;
                List list;
                Iterator it2;
                Object objUploadPaiList;
                PaiUserDao paiUserDaoPaiUserDB;
                ArrayList arrayList;
                Iterator it3;
                Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                int i2 = this.d;
                try {
                    if (i2 != 0) {
                        if (i2 == 1) {
                            ResultKt.throwOnFailure(obj);
                            userAllPaiListSuspend = obj;
                        } else if (i2 == 2) {
                            i = this.c;
                            pAIHistroyRepo = (PAIHistroyRepo) this.a;
                            ResultKt.throwOnFailure(obj);
                            PaiUserDao paiUserDaoPaiUserDB2 = pAIHistroyRepo.getDbRepo().paiUserDB();
                            this.a = pAIHistroyRepo;
                            this.d = 3;
                            limitUploadPaiList = paiUserDaoPaiUserDB2.getLimitUploadPaiList(false, i, this);
                            if (limitUploadPaiList == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            list = (List) limitUploadPaiList;
                            if (list != null) {
                                it2 = CollectionsKt___CollectionsKt.takeLast(list, 10).iterator();
                                while (it2.hasNext()) {
                                    HMLog.info(PaiWebConst.Tag.HTTP_TAG, new C0522a((PAIDataVo) it2.next()));
                                }
                                if (!list.isEmpty()) {
                                    String strEncodeToString = SerializationKtxKt.getNonStrictInstance(Json.INSTANCE).encodeToString(BuiltinSerializersKt.ListSerializer(PAIDataVo.INSTANCE.serializer()), list);
                                    PAIBaseRepo repo = pAIHistroyRepo.getRepo();
                                    this.a = pAIHistroyRepo;
                                    this.b = list;
                                    this.d = 4;
                                    objUploadPaiList = repo.uploadPaiList(strEncodeToString, this);
                                    if (objUploadPaiList == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    if (((Boolean) objUploadPaiList).booleanValue()) {
                                        paiUserDaoPaiUserDB = pAIHistroyRepo.getDbRepo().paiUserDB();
                                        arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                                        it3 = list.iterator();
                                        while (it3.hasNext()) {
                                            arrayList.add(Boxing.boxLong(((PAIDataVo) it3.next()).getTimestamp()));
                                        }
                                        this.a = null;
                                        this.b = null;
                                        this.d = 5;
                                        if (paiUserDaoPaiUserDB.updateListUploadSuspend(true, arrayList, this) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                    }
                                }
                            }
                        } else if (i2 == 3) {
                            PAIHistroyRepo<T> pAIHistroyRepo2 = (PAIHistroyRepo) this.a;
                            ResultKt.throwOnFailure(obj);
                            pAIHistroyRepo = pAIHistroyRepo2;
                            limitUploadPaiList = obj;
                            list = (List) limitUploadPaiList;
                            if (list != null) {
                                it2 = CollectionsKt___CollectionsKt.takeLast(list, 10).iterator();
                                while (it2.hasNext()) {
                                    HMLog.info(PaiWebConst.Tag.HTTP_TAG, new C0522a((PAIDataVo) it2.next()));
                                }
                                if (!list.isEmpty()) {
                                    String strEncodeToString2 = SerializationKtxKt.getNonStrictInstance(Json.INSTANCE).encodeToString(BuiltinSerializersKt.ListSerializer(PAIDataVo.INSTANCE.serializer()), list);
                                    PAIBaseRepo repo2 = pAIHistroyRepo.getRepo();
                                    this.a = pAIHistroyRepo;
                                    this.b = list;
                                    this.d = 4;
                                    objUploadPaiList = repo2.uploadPaiList(strEncodeToString2, this);
                                    if (objUploadPaiList == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    if (((Boolean) objUploadPaiList).booleanValue()) {
                                        paiUserDaoPaiUserDB = pAIHistroyRepo.getDbRepo().paiUserDB();
                                        arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                                        it3 = list.iterator();
                                        while (it3.hasNext()) {
                                            arrayList.add(Boxing.boxLong(((PAIDataVo) it3.next()).getTimestamp()));
                                        }
                                        this.a = null;
                                        this.b = null;
                                        this.d = 5;
                                        if (paiUserDaoPaiUserDB.updateListUploadSuspend(true, arrayList, this) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                    }
                                }
                            }
                        } else if (i2 == 4) {
                            list = (List) this.b;
                            PAIHistroyRepo<T> pAIHistroyRepo3 = (PAIHistroyRepo) this.a;
                            ResultKt.throwOnFailure(obj);
                            pAIHistroyRepo = pAIHistroyRepo3;
                            objUploadPaiList = obj;
                            if (((Boolean) objUploadPaiList).booleanValue()) {
                                paiUserDaoPaiUserDB = pAIHistroyRepo.getDbRepo().paiUserDB();
                                arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                                it3 = list.iterator();
                                while (it3.hasNext()) {
                                    arrayList.add(Boxing.boxLong(((PAIDataVo) it3.next()).getTimestamp()));
                                }
                                this.a = null;
                                this.b = null;
                                this.d = 5;
                                if (paiUserDaoPaiUserDB.updateListUploadSuspend(true, arrayList, this) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            }
                        } else {
                            if (i2 != 5) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj);
                        }
                        return Unit.INSTANCE;
                    }
                    ResultKt.throwOnFailure(obj);
                    PaiUserDao paiUserDaoPaiUserDB3 = this.e.getDbRepo().paiUserDB();
                    this.d = 1;
                    userAllPaiListSuspend = paiUserDaoPaiUserDB3.getUserAllPaiListSuspend(this);
                    if (userAllPaiListSuspend == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    List listEmptyList = (List) userAllPaiListSuspend;
                    if (listEmptyList == null) {
                        listEmptyList = CollectionsKt__CollectionsKt.emptyList();
                    }
                    List<T> list2 = this.f;
                    if (list2 != null) {
                        PAIHistroyRepo<T> pAIHistroyRepo4 = this.e;
                        int i3 = this.g;
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj2 : list2) {
                            if (!Boxing.boxBoolean(listEmptyList.contains((PAIDataVo) obj2)).booleanValue()) {
                                arrayList2.add(obj2);
                            }
                        }
                        List mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList2);
                        this.a = pAIHistroyRepo4;
                        this.c = i3;
                        this.d = 2;
                        if (pAIHistroyRepo4.b(mutableList, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        pAIHistroyRepo = pAIHistroyRepo4;
                        i = i3;
                        PaiUserDao paiUserDaoPaiUserDB4 = pAIHistroyRepo.getDbRepo().paiUserDB();
                        this.a = pAIHistroyRepo;
                        this.d = 3;
                        limitUploadPaiList = paiUserDaoPaiUserDB4.getLimitUploadPaiList(false, i, this);
                        if (limitUploadPaiList == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        list = (List) limitUploadPaiList;
                        if (list != null) {
                            it2 = CollectionsKt___CollectionsKt.takeLast(list, 10).iterator();
                            while (it2.hasNext()) {
                                HMLog.info(PaiWebConst.Tag.HTTP_TAG, new C0522a((PAIDataVo) it2.next()));
                            }
                            if (!list.isEmpty()) {
                                String strEncodeToString3 = SerializationKtxKt.getNonStrictInstance(Json.INSTANCE).encodeToString(BuiltinSerializersKt.ListSerializer(PAIDataVo.INSTANCE.serializer()), list);
                                PAIBaseRepo repo3 = pAIHistroyRepo.getRepo();
                                this.a = pAIHistroyRepo;
                                this.b = list;
                                this.d = 4;
                                objUploadPaiList = repo3.uploadPaiList(strEncodeToString3, this);
                                if (objUploadPaiList == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                if (((Boolean) objUploadPaiList).booleanValue()) {
                                    paiUserDaoPaiUserDB = pAIHistroyRepo.getDbRepo().paiUserDB();
                                    arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                                    it3 = list.iterator();
                                    while (it3.hasNext()) {
                                        arrayList.add(Boxing.boxLong(((PAIDataVo) it3.next()).getTimestamp()));
                                    }
                                    this.a = null;
                                    this.b = null;
                                    this.d = 5;
                                    if (paiUserDaoPaiUserDB.updateListUploadSuspend(true, arrayList, this) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                }
                            }
                        }
                    }
                } catch (Exception e) {
                    HMLog.info(PaiWebConst.Tag.HTTP_TAG, new b(e));
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(PAIHistroyRepo<T> pAIHistroyRepo, List<T> list, int i, Continuation<? super d> continuation) {
            super(2, continuation);
            this.b = pAIHistroyRepo;
            this.c = list;
            this.d = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new d(this.b, this.c, this.d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                PaiDb dbRepo = this.b.getDbRepo();
                a aVar = new a(this.b, this.c, this.d, null);
                this.a = 1;
                if (RoomDatabaseKt.withTransaction(dbRepo, aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u0002H\u008a@"}, d2 = {"Lcom/huami/pai/vo/PAIDataVo;", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.pai.ui.history.PAIHistroyRepo$saveLocalAndPost$1", f = "PAIHistroyRepo.kt", i = {}, l = {148, 157, 160, DataTypeSource.SPORT_TYPE_BRIDGE, 177}, m = "invokeSuspend", n = {}, s = {})
    public static final class e extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public Object a;
        public int b;
        public final /* synthetic */ PAIHistroyRepo<T> c;
        public final /* synthetic */ List<T> d;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0003\u001a\u0004\u0018\u00010\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n"}, d2 = {"Lcom/huami/pai/vo/PAIDataVo;", ExifInterface.GPS_DIRECTION_TRUE, "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public final /* synthetic */ PAIDataVo a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(PAIDataVo pAIDataVo) {
                super(0);
                this.a = pAIDataVo;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String getA() {
                return "paiListJson " + this.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(PAIHistroyRepo<T> pAIHistroyRepo, List<T> list, Continuation<? super e> continuation) {
            super(2, continuation);
            this.c = pAIHistroyRepo;
            this.d = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new e(this.c, this.d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((e) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:40:0x00b3 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:44:0x00b9  */
        /* JADX WARN: Code duplicated, block: B:48:0x00c9 A[Catch: Exception -> 0x011f, LOOP:0: B:46:0x00c3->B:48:0x00c9, LOOP_END, TryCatch #0 {Exception -> 0x011f, blocks: (B:9:0x0017, B:14:0x0028, B:54:0x0103, B:56:0x010b, B:45:0x00bb, B:46:0x00c3, B:48:0x00c9, B:49:0x00da, B:51:0x00e0), top: B:62:0x000b }] */
        /* JADX WARN: Code duplicated, block: B:51:0x00e0 A[Catch: Exception -> 0x011f, TryCatch #0 {Exception -> 0x011f, blocks: (B:9:0x0017, B:14:0x0028, B:54:0x0103, B:56:0x010b, B:45:0x00bb, B:46:0x00c3, B:48:0x00c9, B:49:0x00da, B:51:0x00e0), top: B:62:0x000b }] */
        /* JADX WARN: Code duplicated, block: B:53:0x0102 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:56:0x010b A[Catch: Exception -> 0x011f, TRY_LEAVE, TryCatch #0 {Exception -> 0x011f, blocks: (B:9:0x0017, B:14:0x0028, B:54:0x0103, B:56:0x010b, B:45:0x00bb, B:46:0x00c3, B:48:0x00c9, B:49:0x00da, B:51:0x00e0), top: B:62:0x000b }] */
        /* JADX WARN: Code duplicated, block: B:58:0x011e A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            PAIHistroyRepo<T> pAIHistroyRepo;
            List list;
            Iterator it2;
            PaiUserDao paiUserDaoPaiUserDB;
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.b;
            try {
                if (i != 0) {
                    if (i == 1) {
                        ResultKt.throwOnFailure(obj);
                    } else if (i == 2) {
                        pAIHistroyRepo = (PAIHistroyRepo) this.a;
                        ResultKt.throwOnFailure(obj);
                        PaiUserDao paiUserDaoPaiUserDB2 = pAIHistroyRepo.getDbRepo().paiUserDB();
                        this.a = pAIHistroyRepo;
                        this.b = 3;
                        obj = paiUserDaoPaiUserDB2.getAllUploadPaiList(false, this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        list = (List) obj;
                        if (list != null) {
                            it2 = CollectionsKt___CollectionsKt.takeLast(list, 10).iterator();
                            while (it2.hasNext()) {
                                HMLog.info(PaiWebConst.Tag.HTTP_TAG, new a((PAIDataVo) it2.next()));
                            }
                            if (!list.isEmpty()) {
                                String strEncodeToString = SerializationKtxKt.getNonStrictInstance(Json.INSTANCE).encodeToString(BuiltinSerializersKt.ListSerializer(PAIDataVo.INSTANCE.serializer()), list);
                                PAIBaseRepo repo = pAIHistroyRepo.getRepo();
                                this.a = pAIHistroyRepo;
                                this.b = 4;
                                obj = repo.uploadPaiList(strEncodeToString, this);
                                if (obj == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                if (((Boolean) obj).booleanValue()) {
                                    paiUserDaoPaiUserDB = pAIHistroyRepo.getDbRepo().paiUserDB();
                                    this.a = null;
                                    this.b = 5;
                                    if (paiUserDaoPaiUserDB.setUploadSuspend(true, this) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                }
                            }
                        }
                    } else if (i == 3) {
                        pAIHistroyRepo = (PAIHistroyRepo) this.a;
                        ResultKt.throwOnFailure(obj);
                        list = (List) obj;
                        if (list != null) {
                            it2 = CollectionsKt___CollectionsKt.takeLast(list, 10).iterator();
                            while (it2.hasNext()) {
                                HMLog.info(PaiWebConst.Tag.HTTP_TAG, new a((PAIDataVo) it2.next()));
                            }
                            if (!list.isEmpty()) {
                                String strEncodeToString2 = SerializationKtxKt.getNonStrictInstance(Json.INSTANCE).encodeToString(BuiltinSerializersKt.ListSerializer(PAIDataVo.INSTANCE.serializer()), list);
                                PAIBaseRepo repo2 = pAIHistroyRepo.getRepo();
                                this.a = pAIHistroyRepo;
                                this.b = 4;
                                obj = repo2.uploadPaiList(strEncodeToString2, this);
                                if (obj == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                if (((Boolean) obj).booleanValue()) {
                                    paiUserDaoPaiUserDB = pAIHistroyRepo.getDbRepo().paiUserDB();
                                    this.a = null;
                                    this.b = 5;
                                    if (paiUserDaoPaiUserDB.setUploadSuspend(true, this) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                }
                            }
                        }
                    } else if (i == 4) {
                        pAIHistroyRepo = (PAIHistroyRepo) this.a;
                        ResultKt.throwOnFailure(obj);
                        if (((Boolean) obj).booleanValue()) {
                            paiUserDaoPaiUserDB = pAIHistroyRepo.getDbRepo().paiUserDB();
                            this.a = null;
                            this.b = 5;
                            if (paiUserDaoPaiUserDB.setUploadSuspend(true, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                    } else {
                        if (i != 5) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
                PaiUserDao paiUserDaoPaiUserDB3 = this.c.getDbRepo().paiUserDB();
                this.b = 1;
                obj = paiUserDaoPaiUserDB3.getUserAllPaiListSuspend(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                List listEmptyList = (List) obj;
                if (listEmptyList == null) {
                    listEmptyList = CollectionsKt__CollectionsKt.emptyList();
                }
                List<T> list2 = this.d;
                if (list2 != null) {
                    PAIHistroyRepo<T> pAIHistroyRepo2 = this.c;
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : list2) {
                        if (!Boxing.boxBoolean(listEmptyList.contains((PAIDataVo) obj2)).booleanValue()) {
                            arrayList.add(obj2);
                        }
                    }
                    List mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList);
                    this.a = pAIHistroyRepo2;
                    this.b = 2;
                    if (pAIHistroyRepo2.b(mutableList, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    pAIHistroyRepo = pAIHistroyRepo2;
                    PaiUserDao paiUserDaoPaiUserDB4 = pAIHistroyRepo.getDbRepo().paiUserDB();
                    this.a = pAIHistroyRepo;
                    this.b = 3;
                    obj = paiUserDaoPaiUserDB4.getAllUploadPaiList(false, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    list = (List) obj;
                    if (list != null) {
                        it2 = CollectionsKt___CollectionsKt.takeLast(list, 10).iterator();
                        while (it2.hasNext()) {
                            HMLog.info(PaiWebConst.Tag.HTTP_TAG, new a((PAIDataVo) it2.next()));
                        }
                        if (!list.isEmpty()) {
                            String strEncodeToString3 = SerializationKtxKt.getNonStrictInstance(Json.INSTANCE).encodeToString(BuiltinSerializersKt.ListSerializer(PAIDataVo.INSTANCE.serializer()), list);
                            PAIBaseRepo repo3 = pAIHistroyRepo.getRepo();
                            this.a = pAIHistroyRepo;
                            this.b = 4;
                            obj = repo3.uploadPaiList(strEncodeToString3, this);
                            if (obj == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            if (((Boolean) obj).booleanValue()) {
                                paiUserDaoPaiUserDB = pAIHistroyRepo.getDbRepo().paiUserDB();
                                this.a = null;
                                this.b = 5;
                                if (paiUserDaoPaiUserDB.setUploadSuspend(true, this) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            }
                        }
                    }
                }
            } catch (Exception unused) {
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.pai.ui.history.PAIHistroyRepo", f = "PAIHistroyRepo.kt", i = {}, l = {257}, m = "savePaiListLocal", n = {}, s = {})
    public static final class f extends ContinuationImpl {
        public /* synthetic */ Object a;
        public final /* synthetic */ PAIHistroyRepo<T> b;
        public int c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(PAIHistroyRepo<T> pAIHistroyRepo, Continuation<? super f> continuation) {
            super(continuation);
            this.b = pAIHistroyRepo;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.a = obj;
            this.c |= Integer.MIN_VALUE;
            return this.b.a(null, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0003\u001a\u0004\u0018\u00010\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n"}, d2 = {"Lcom/huami/pai/vo/PAIDataVo;", ExifInterface.GPS_DIRECTION_TRUE, "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function0<String> {
        public final /* synthetic */ SQLiteException a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(SQLiteException sQLiteException) {
            super(0);
            this.a = sQLiteException;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "insertPai Error " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u0002H\u008a@"}, d2 = {"Lcom/huami/pai/vo/PAIDataVo;", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.pai.ui.history.PAIHistroyRepo$saveUserPaiLocal$1", f = "PAIHistroyRepo.kt", i = {}, l = {129}, m = "invokeSuspend", n = {}, s = {})
    public static final class h extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ PAIHistroyRepo<T> b;
        public final /* synthetic */ List<T> c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(PAIHistroyRepo<T> pAIHistroyRepo, List<T> list, Continuation<? super h> continuation) {
            super(2, continuation);
            this.b = pAIHistroyRepo;
            this.c = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new h(this.b, this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((h) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                PAIHistroyRepo<T> pAIHistroyRepo = this.b;
                List<T> list = this.c;
                this.a = 1;
                if (pAIHistroyRepo.b(list, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.pai.ui.history.PAIHistroyRepo", f = "PAIHistroyRepo.kt", i = {}, l = {Mtu.ATT_MTU_MAX}, m = "saveUserPaiLocalSuspend", n = {}, s = {})
    public static final class i extends ContinuationImpl {
        public /* synthetic */ Object a;
        public final /* synthetic */ PAIHistroyRepo<T> b;
        public int c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(PAIHistroyRepo<T> pAIHistroyRepo, Continuation<? super i> continuation) {
            super(continuation);
            this.b = pAIHistroyRepo;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.a = obj;
            this.c |= Integer.MIN_VALUE;
            return this.b.b(null, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0003\u001a\u0004\u0018\u00010\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n"}, d2 = {"Lcom/huami/pai/vo/PAIDataVo;", ExifInterface.GPS_DIRECTION_TRUE, "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class j extends Lambda implements Function0<String> {
        public final /* synthetic */ SQLiteException a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(SQLiteException sQLiteException) {
            super(0);
            this.a = sQLiteException;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "insertPai Error " + this.a;
        }
    }

    public PAIHistroyRepo(@NotNull PAIBaseRepo pAIBaseRepo, @NotNull PaiDb paiDb, @NotNull CoroutineScope coroutineScope) {
        this.repo = pAIBaseRepo;
        this.dbRepo = paiDb;
        this.coroutineScope = coroutineScope;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(List<PAIDataVo> list, Continuation<? super Unit> continuation) {
        f fVar;
        if (continuation instanceof f) {
            fVar = (f) continuation;
            int i2 = fVar.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fVar.c = i2 - Integer.MIN_VALUE;
            } else {
                fVar = new f(this, continuation);
            }
        } else {
            fVar = new f(this, continuation);
        }
        Object obj = fVar.a;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i3 = fVar.c;
        try {
            if (i3 == 0) {
                ResultKt.throwOnFailure(obj);
                if (list != null) {
                    PaiUserDao paiUserDaoPaiUserDB = getDbRepo().paiUserDB();
                    fVar.c = 1;
                    if (paiUserDaoPaiUserDB.insertOrUpdateUserPai(list, fVar) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return Unit.INSTANCE;
            }
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        } catch (SQLiteException e2) {
            HMLog.info(PaiWebConst.Tag.HTTP_TAG, new g(e2));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Deprecated(message = "泛型使用有误，建议使用固定类型 savePaiListLocal")
    public final Object b(List<T> list, Continuation<? super Unit> continuation) {
        i iVar;
        if (continuation instanceof i) {
            iVar = (i) continuation;
            int i2 = iVar.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                iVar.c = i2 - Integer.MIN_VALUE;
            } else {
                iVar = new i(this, continuation);
            }
        } else {
            iVar = new i(this, continuation);
        }
        Object obj = iVar.a;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i3 = iVar.c;
        try {
            if (i3 == 0) {
                ResultKt.throwOnFailure(obj);
                if (list != null) {
                    PaiUserDao paiUserDaoPaiUserDB = getDbRepo().paiUserDB();
                    iVar.c = 1;
                    if (paiUserDaoPaiUserDB.insertOrUpdateUserPai(list, iVar) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return Unit.INSTANCE;
            }
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        } catch (SQLiteException e2) {
            HMLog.info(PaiWebConst.Tag.HTTP_TAG, new j(e2));
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void saveLocalAndLimitPost$default(PAIHistroyRepo pAIHistroyRepo, List list, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 90;
        }
        pAIHistroyRepo.saveLocalAndLimitPost(list, i2);
    }

    public final void cleanData() {
        kotlinx.coroutines.e.f(this.coroutineScope, null, null, new a(this, null), 3, null);
    }

    @NotNull
    public final CoroutineScope getCoroutineScope() {
        return this.coroutineScope;
    }

    @Override // com.huami.pai.ui.history.PAIBaseHistoryRepo
    @Nullable
    public T getData(@NotNull Date date) {
        Map<String, T> map;
        String timeYMD = PaiTimeExKt.formatTimeYMD(date);
        Map<String, T> map2 = this.list;
        boolean z = false;
        if (map2 != null && map2.containsKey(timeYMD)) {
            z = true;
        }
        if (!z || (map = this.list) == null) {
            return null;
        }
        return map.get(timeYMD);
    }

    @NotNull
    public final PaiDb getDbRepo() {
        return this.dbRepo;
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object getLatestTimeStamp(@NotNull Continuation<? super Long> continuation) {
        b bVar;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i2 = bVar.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bVar.c = i2 - Integer.MIN_VALUE;
            } else {
                bVar = new b(this, continuation);
            }
        } else {
            bVar = new b(this, continuation);
        }
        Object maxTimeStamp = bVar.a;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i3 = bVar.c;
        if (i3 == 0) {
            ResultKt.throwOnFailure(maxTimeStamp);
            PaiUserDao paiUserDaoPaiUserDB = getDbRepo().paiUserDB();
            bVar.c = 1;
            maxTimeStamp = paiUserDaoPaiUserDB.getMaxTimeStamp(bVar);
            if (maxTimeStamp == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(maxTimeStamp);
        }
        Long l = (Long) maxTimeStamp;
        return Boxing.boxLong(l == null ? 0L : l.longValue());
    }

    @Nullable
    public final Map<String, T> getList() {
        return this.list;
    }

    @Nullable
    public final List<PAIDataVo> getPaiList() {
        return this.dbRepo.paiUserDB().getUserAllPaiList();
    }

    @NotNull
    public final LiveData<List<PAIDataVo>> getPaiLiveDatas() {
        return this.dbRepo.paiUserDB().getUserAllPaiData();
    }

    @Override // com.huami.pai.ui.history.PAIBaseHistoryRepo
    @Nullable
    public Float getPredictData(@NotNull Date date) {
        T t;
        boolean z = true;
        int i2 = 1;
        while (true) {
            int i3 = i2 + 1;
            if (hasReal(DateExKt.nextDay(date, -i2))) {
                break;
            }
            if (i3 > 6) {
                i2 = -1;
                break;
            }
            i2 = i3;
        }
        if (i2 == -1) {
            return null;
        }
        Map<String, T> map = this.list;
        String nextActivityScore = (map == null || (t = map.get(PaiTimeExKt.formatTimeYMD(DateExKt.nextDay(date, -i2)))) == null) ? null : t.getNextActivityScore();
        if (nextActivityScore == null) {
            return null;
        }
        try {
            List mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) SerializationKtxKt.getNonStrictInstance(Json.INSTANCE).decodeFromString(BuiltinSerializersKt.ListSerializer(BuiltinSerializersKt.serializer(FloatCompanionObject.INSTANCE)), nextActivityScore));
            if (mutableList != null && !mutableList.isEmpty()) {
                z = false;
            }
            if (!z && mutableList.size() >= i2) {
                return (Float) mutableList.get(i2);
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.huami.pai.ui.history.PAIBaseHistoryRepo
    public float getRealOrPredictData(@NotNull Date date) {
        PAIDataVo data = getData(date);
        Float fValueOf = data == null ? null : Float.valueOf(data.getTp());
        if (fValueOf != null) {
            return fValueOf.floatValue();
        }
        Float predictData = getPredictData(date);
        if (predictData == null) {
            return 0.0f;
        }
        return predictData.floatValue();
    }

    @NotNull
    public final Flow<List<PAIDataVo>> getRemoteChangedDatas(long from) {
        return this.repo.getAllDatas(from);
    }

    public final void getRemoteChangedDatasInPaiScope() {
        kotlinx.coroutines.e.f(this.coroutineScope, null, null, new c(this, null), 3, null);
    }

    @Nullable
    public final Object getRemoteData(long j2, @NotNull Continuation<? super List<PAIDataVo>> continuation) {
        return getRepo().getAllRemoteDatas(j2, continuation);
    }

    @NotNull
    public final Flow<List<PAIDataVo>> getRemoteDatas() {
        return this.repo.getAllDatas(0L);
    }

    @NotNull
    public final PAIBaseRepo getRepo() {
        return this.repo;
    }

    @Override // com.huami.pai.ui.history.PAIBaseHistoryRepo
    public boolean hasReal(@NotNull Date dateKey) {
        Map<String, T> map = this.list;
        if (map == null) {
            return false;
        }
        return map.containsKey(PaiTimeExKt.formatTimeYMD(dateKey));
    }

    public final void saveLocalAndLimitPost(@Nullable List<T> value, int limit) {
        kotlinx.coroutines.e.f(this.coroutineScope, null, null, new d(this, value, limit, null), 3, null);
    }

    public final void saveLocalAndPost(@Nullable List<T> value) {
        kotlinx.coroutines.e.f(this.coroutineScope, null, null, new e(this, value, null), 3, null);
    }

    public final void saveUserPaiLocal(@Nullable List<T> value) {
        kotlinx.coroutines.e.f(this.coroutineScope, null, null, new h(this, value, null), 3, null);
    }

    public final void setList(@Nullable Map<String, T> map) {
        this.list = map;
    }

    public final void setList(@Nullable List<T> value) {
        if (value == null) {
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.ranges.e.coerceAtLeast(q.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(value, 10)), 16));
        for (Object obj : value) {
            linkedHashMap.put(PaiDataVoExKt.realDateStr((PAIDataVo) obj), obj);
        }
        setList(r.toMutableMap(linkedHashMap));
    }
}

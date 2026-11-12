package com.mi.health.hearing;

import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import androidx.collection.ArrayMap;
import com.google.android.gms.actions.SearchIntents;
import com.mi.health.a;
import com.mi.health.router.business.IntentHelper;
import com.mibi.sdk.component.Constants;
import com.xiaomi.fit.fitness.export.api.repository.IHearingRepository;
import com.xiaomi.fit.fitness.export.api.repository.IRepositoryProvider;
import com.xiaomi.fit.fitness.export.data.item.HeadsetItem;
import com.xiaomi.fit.fitness.export.data.item.NoiseItem;
import com.xiaomi.fit.fitness.export.di.FitnessDataExtKt;
import com.xiaomi.fitness.account.region.RegionPreference;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.dataprovider.DataProvider;
import com.xiaomi.fitness.dataprovider.DataProviderException;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.login.export.RegionExtKt;
import com.xiaomi.fitness.login.export.RegionManager;
import defpackage.yc5;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0014J\u0012\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016JS\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\n\u001a\u00020\u000b2\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\t2\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0013\u001a\u00020\tH\u0014¢\u0006\u0002\u0010\u0014J\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\u0012\u0010\u0018\u001a\u00020\u00052\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0002J\u0012\u0010\u0019\u001a\u00020\u00052\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0002¨\u0006\u001b"}, d2 = {"Lcom/mi/health/hearing/HearingDataProvider;", "Lcom/xiaomi/fitness/dataprovider/DataProvider;", "<init>", "()V", "onRegisterPath", "", "mapper", "Lcom/xiaomi/fitness/dataprovider/DataProvider$PathMapper;", "getType", "", "uri", "Landroid/net/Uri;", SearchIntents.EXTRA_QUERY, "Landroid/database/Cursor;", "projection", "", "selection", "selectionArgs", "sortOrder", "callPackage", "(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;", "insert", Constants.KEY_RECHARGE_VALUES, "Landroid/content/ContentValues;", "addNoiseRecord", "addHeadsetRecord", "Companion", "fitness-data-provider_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class HearingDataProvider extends DataProvider {
    private static final int ADD_HEAD_SET = 2;
    private static final int ADD_NOISE_RECORD = 3;

    @NotNull
    private static final String COLUMN_BEGIN_TIME = "begin";

    @NotNull
    private static final String COLUMN_DECIBEL = "decibel";

    @NotNull
    private static final String COLUMN_END_TIME = "end";

    @NotNull
    private static final String COLUMN_HIGH = "high";

    @NotNull
    private static final String COLUMN_NOISE_TIMESTAMP = "time";

    @NotNull
    private static final String COL_PRIVACY_GRANT = "grant";

    @NotNull
    private static final String COL_URI = "uri";
    private static final int QUERY_SETUP = 4;

    @NotNull
    private static final String TAG = "HearingDataProvider";

    /* JADX INFO: renamed from: com.mi.health.hearing.HearingDataProvider$addHeadsetRecord$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.mi.health.hearing.HearingDataProvider$addHeadsetRecord$1", f = "HearingDataProvider.kt", i = {}, l = {128}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Long $begin;
        final /* synthetic */ Long $end;
        final /* synthetic */ IHearingRepository $hearingRepository;
        final /* synthetic */ Boolean $high;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Long l, Long l2, Boolean bool, IHearingRepository iHearingRepository, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$begin = l;
            this.$end = l2;
            this.$high = bool;
            this.$hearingRepository = iHearingRepository;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$begin, this.$end, this.$high, this.$hearingRepository, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                long j = 1000;
                HeadsetItem headsetItem = new HeadsetItem(this.$begin.longValue() / j, this.$end.longValue() / j, this.$high.booleanValue());
                headsetItem.setSid(DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentPhoneSid());
                IHearingRepository iHearingRepository = this.$hearingRepository;
                this.label = 1;
                if (iHearingRepository.addRecord(headsetItem, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            Logger.i(HearingDataProvider.TAG, "insert headset record success:" + this.$begin + "/" + this.$end + "/" + this.$high);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.mi.health.hearing.HearingDataProvider$addNoiseRecord$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.mi.health.hearing.HearingDataProvider$addNoiseRecord$1", f = "HearingDataProvider.kt", i = {}, l = {107}, m = "invokeSuspend", n = {}, s = {})
    public static final class C14761 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Integer $decibel;
        final /* synthetic */ IHearingRepository $hearingRepository;
        final /* synthetic */ Long $timestamp;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14761(Long l, Integer num, IHearingRepository iHearingRepository, Continuation<? super C14761> continuation) {
            super(2, continuation);
            this.$timestamp = l;
            this.$decibel = num;
            this.$hearingRepository = iHearingRepository;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C14761(this.$timestamp, this.$decibel, this.$hearingRepository, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                NoiseItem noiseItem = new NoiseItem(this.$timestamp.longValue() / ((long) 1000), this.$decibel.intValue());
                noiseItem.setSid(DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentPhoneSid());
                IHearingRepository iHearingRepository = this.$hearingRepository;
                this.label = 1;
                if (iHearingRepository.addRecord(noiseItem, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            Logger.i(HearingDataProvider.TAG, "insert noise record success:" + this.$decibel + "/" + this.$timestamp);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C14761) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    private final void addHeadsetRecord(ContentValues values) {
        if (values == null) {
            return;
        }
        Long asLong = values.getAsLong(COLUMN_BEGIN_TIME);
        Long asLong2 = values.getAsLong("end");
        Boolean asBoolean = values.getAsBoolean("high");
        if (asLong == null || asLong2 == null || asBoolean == null) {
            return;
        }
        AnyExtKt.io$default(null, new AnonymousClass1(asLong, asLong2, asBoolean, (IHearingRepository) FitnessDataExtKt.getInstance(IRepositoryProvider.INSTANCE).getRepository(IHearingRepository.class), null), 1, null);
    }

    private final void addNoiseRecord(ContentValues values) {
        if (values == null) {
            return;
        }
        Long asLong = values.getAsLong("time");
        Integer asInteger = values.getAsInteger(COLUMN_DECIBEL);
        if (asLong == null || asInteger == null) {
            return;
        }
        AnyExtKt.io$default(null, new C14761(asLong, asInteger, (IHearingRepository) FitnessDataExtKt.getInstance(IRepositoryProvider.INSTANCE).getRepository(IHearingRepository.class), null), 1, null);
    }

    @Override // com.xiaomi.fitness.dataprovider.DataProvider
    @Nullable
    public String getType(@NotNull Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        int iMatchPath = matchPath(uri);
        if (iMatchPath == 2) {
            return "vnd.android.cursor.item/vnd.mi.health.hearing.add.headset";
        }
        if (iMatchPath == 3) {
            return "vnd.android.cursor.item/vnd.mi.health.hearing.add.noise";
        }
        if (iMatchPath != 4) {
            return null;
        }
        return "vnd.android.cursor.item/vnd.mi.health.hearing.query.setup";
    }

    @Override // com.xiaomi.fitness.dataprovider.DataProvider
    @Nullable
    public Uri insert(@NotNull Uri uri, @Nullable ContentValues values) throws DataProviderException {
        Intrinsics.checkNotNullParameter(uri, "uri");
        boolean z = RegionExtKt.getInstance(RegionManager.INSTANCE).getCurrentRegion().length() > 0;
        if (!RegionPreference.INSTANCE.getPRIVACY_AGREE() || !z) {
            Logger.i(TAG, "privacy enable or region enable false ... insert failed");
            return null;
        }
        int iMatchPath = matchPath(uri);
        if (iMatchPath == 2) {
            addHeadsetRecord(values);
        } else if (iMatchPath == 3) {
            addNoiseRecord(values);
        }
        return super.insert(uri, values);
    }

    @Override // com.xiaomi.fitness.dataprovider.DataProvider
    public void onRegisterPath(@NotNull DataProvider.PathMapper mapper) {
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        mapper.addPath("/addHeadsetRecord", 2);
        mapper.addPath("/addNoiseRecord", 3);
        mapper.addPath("/querySetup", 4);
    }

    @Override // com.xiaomi.fitness.dataprovider.DataProvider
    @Nullable
    public Cursor query(@NotNull Uri uri, @Nullable String[] projection, @Nullable String selection, @Nullable String[] selectionArgs, @Nullable String sortOrder, @NotNull String callPackage) {
        String uri2;
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(callPackage, "callPackage");
        if (matchPath(uri) != 4) {
            return null;
        }
        ArrayMap arrayMap = new ArrayMap();
        int i = 1;
        if (RegionPreference.INSTANCE.getPRIVACY_AGREE()) {
            uri2 = IntentHelper.INSTANCE.getRouterIntentByAction(IntentHelper.HEARING_HOME_ACTION).toUri(1);
        } else {
            uri2 = new Intent(a.f9964a).toUri(1);
            i = 0;
        }
        arrayMap.put(COL_PRIVACY_GRANT, Integer.valueOf(i));
        arrayMap.put("uri", uri2);
        Logger.i(TAG, "query result privacy status:" + i + "/intentUri:" + uri2);
        return yc5.a(arrayMap, null);
    }
}

package com.xiaomi.fitness.steps;

import android.app.Application;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import android.util.SparseArray;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.SafeDBUtil;
import com.xiaomi.fitness.common.utils.TimeUtils;
import com.xiaomi.fitness.steps.PhoneStepsProviderImpl;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.ranges.RangesKt___RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 02\u00020\u0001:\u00010B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0018H\u0016J&\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u0013H\u0016J&\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u0013H\u0016J\n\u0010\u001f\u001a\u0004\u0018\u00010\bH\u0002J\u0010\u0010 \u001a\u00020\u00052\u0006\u0010!\u001a\u00020\"H\u0016J\u0018\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\b\u0010$\u001a\u0004\u0018\u00010%H\u0002J&\u0010&\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\b\u0010$\u001a\u0004\u0018\u00010%2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00180\u001bH\u0002J\u001e\u0010(\u001a\u00020\u00132\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00180\u001b2\u0006\u0010)\u001a\u00020\u0018H\u0002J\b\u0010*\u001a\u00020\u0005H\u0016J&\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00180\u001b2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u0013H\u0002J\u0016\u0010,\u001a\u00020-2\f\u0010.\u001a\b\u0012\u0004\u0012\u00020-0/H\u0016R\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0006R\u0018\u0010\u0007\u001a\n \t*\u0004\u0018\u00010\b0\bX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\nR\u0018\u0010\u000b\u001a\n \t*\u0004\u0018\u00010\b0\bX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\nR\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00061"}, d2 = {"Lcom/xiaomi/fitness/steps/PhoneStepsProviderImpl;", "Lcom/xiaomi/fitness/steps/StepProviderInternal;", "<init>", "()V", "sSupported", "", "Ljava/lang/Boolean;", "mContentUri", "Landroid/net/Uri;", "kotlin.jvm.PlatformType", "Landroid/net/Uri;", "LATEST_CONTENT_URI", "PROJECTION", "", "", "[Ljava/lang/String;", "mContext", "Landroid/app/Application;", "sLatestRecordEnable", "", "mStepsObserver", "Lcom/xiaomi/fitness/steps/PhoneStepsObserver;", "getStepsTotal", "beginTime", "", "endTime", "getSteps", "", "Lcom/xiaomi/fitness/steps/StepItem;", "granularity", "getStepsOptimization", "getQueryStepsUri", "getStepProviderValid", "context", "Landroid/content/Context;", "getDetails", "cursor", "Landroid/database/Cursor;", "mergeByTimeRange", "timeRanges", "findNearest", "time", "supported", "getTimeRanges", "setObserver", "", "observer", "Lkotlin/Function0;", "Companion", "steps_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nPhoneStepsProviderImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PhoneStepsProviderImpl.kt\ncom/xiaomi/fitness/steps/PhoneStepsProviderImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,249:1\n1#2:250\n*E\n"})
public final class PhoneStepsProviderImpl implements StepProviderInternal {

    @NotNull
    private static final String AUTHORITY = "com.miui.providers.steps";

    @NotNull
    private static final String BEGIN_TIME = "_begin_time";

    @NotNull
    private static final String END_TIME = "_end_time";
    private static final int INDEX_BEGIN_TIME = 0;
    private static final int INDEX_END_TIME = 1;
    private static final int INDEX_MODE = 2;
    private static final int INDEX_STEPS = 3;
    private static final int INIT_STEP_QUERY = -1;

    @NotNull
    private static final String MODE = "_mode";
    private static final int NEW_STEP_QUERY = 1;
    private static final int OLD_STEP_QUERY = 0;

    @NotNull
    private static final String PHONE_STEP_FEATURE_FIELD = "support_steps_provider";

    @NotNull
    private static final String SORT_ORDER = "_id ASC";

    @NotNull
    private static final String STEPS = "_steps";

    @NotNull
    private final Application mContext;

    @NotNull
    private final PhoneStepsObserver mStepsObserver;
    private volatile int sLatestRecordEnable;

    @Nullable
    private Boolean sSupported;
    private final Uri mContentUri = Uri.parse("content://0@com.miui.providers.steps/item");
    private final Uri LATEST_CONTENT_URI = Uri.parse("content://0@com.miui.providers.steps/item_latest");

    @NotNull
    private final String[] PROJECTION = {BEGIN_TIME, END_TIME, MODE, STEPS};

    public PhoneStepsProviderImpl() {
        Application application = ApplicationExtKt.getApplication();
        this.mContext = application;
        this.sLatestRecordEnable = -1;
        PhoneStepsObserver phoneStepsObserver = new PhoneStepsObserver();
        this.mStepsObserver = phoneStepsObserver;
        if (supported()) {
            try {
                application.getContentResolver().registerContentObserver(Uri.parse("content://0@com.miui.providers.steps"), true, phoneStepsObserver);
            } catch (SecurityException e) {
                Logger.e("Can't register phone step content observer.", e);
            }
        }
    }

    private final int findNearest(List<Long> timeRanges, long time) {
        int size = timeRanges.size() - 1;
        for (int i = 0; i < size; i++) {
            if (time >= timeRanges.get(i).longValue() && time < timeRanges.get(i + 1).longValue()) {
                return i;
            }
        }
        return -1;
    }

    private final List<StepItem> getDetails(Cursor cursor) {
        if (cursor == null || !cursor.moveToFirst()) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        Logger.d("Get " + cursor.getCount() + " records for step details query", new Object[0]);
        ArrayList arrayList = new ArrayList(cursor.getCount());
        do {
            arrayList.add(new StepItem(cursor.getLong(0), cursor.getLong(1), cursor.getInt(2), cursor.getInt(3)));
        } while (cursor.moveToNext());
        return arrayList;
    }

    private final Uri getQueryStepsUri() {
        int i = this.sLatestRecordEnable;
        if (i == -1) {
            this.sLatestRecordEnable = !TextUtils.isEmpty(this.mContext.getContentResolver().getType(this.LATEST_CONTENT_URI)) ? 1 : 0;
            return getQueryStepsUri();
        }
        if (i == 0) {
            return this.mContentUri;
        }
        if (i != 1) {
            return null;
        }
        return this.LATEST_CONTENT_URI;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List getSteps$lambda$0(int i, PhoneStepsProviderImpl this$0, long j, long j2, Cursor cursor) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return i == 0 ? this$0.getDetails(cursor) : this$0.mergeByTimeRange(cursor, this$0.getTimeRanges(j, j2, i));
    }

    private final List<Long> getTimeRanges(long beginTime, long endTime, int granularity) {
        int i;
        switch (granularity) {
            case 1:
                i = 5;
                break;
            case 2:
                i = 4;
                break;
            case 3:
                i = 3;
                break;
            case 4:
                i = 2;
                break;
            case 5:
                i = 1;
                break;
            case 6:
                return CollectionsKt__CollectionsKt.listOf((Object[]) new Long[]{Long.valueOf(beginTime), Long.valueOf(endTime)});
            default:
                return CollectionsKt__CollectionsKt.emptyList();
        }
        return TimeUtils.INSTANCE.splitTime(beginTime, endTime, i, 1);
    }

    private final List<StepItem> mergeByTimeRange(Cursor cursor, List<Long> timeRanges) {
        SparseArray sparseArray = new SparseArray(timeRanges.size() - 1);
        if (cursor == null || !cursor.moveToFirst()) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        Logger.d("Get " + cursor.getCount() + " records for step details merge query", new Object[0]);
        do {
            int iFindNearest = findNearest(timeRanges, cursor.getLong(0));
            if (iFindNearest >= 0) {
                StepItem stepItem = (StepItem) sparseArray.get(iFindNearest);
                if (stepItem == null) {
                    sparseArray.append(iFindNearest, new StepItem(timeRanges.get(iFindNearest).longValue(), timeRanges.get(iFindNearest + 1).longValue(), cursor.getInt(2), RangesKt___RangesKt.coerceAtLeast(cursor.getInt(3), 0)));
                } else {
                    stepItem.setSteps(stepItem.getSteps() + RangesKt___RangesKt.coerceAtLeast(cursor.getInt(3), 0));
                }
            }
        } while (cursor.moveToNext());
        ArrayList arrayList = new ArrayList(sparseArray.size());
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            Object objValueAt = sparseArray.valueAt(i);
            Intrinsics.checkNotNullExpressionValue(objValueAt, "valueAt(...)");
            arrayList.add(objValueAt);
        }
        return arrayList;
    }

    @Override // com.xiaomi.fitness.steps.StepProviderInternal
    public boolean getStepProviderValid(@NotNull Context context) {
        Object objM886constructorimpl;
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            Result.Companion companion = Result.Companion;
            objM886constructorimpl = Result.m886constructorimpl(Boolean.valueOf(context.getContentResolver().acquireContentProviderClient(AUTHORITY) != null));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM886constructorimpl = Result.m886constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m892isFailureimpl(objM886constructorimpl)) {
            objM886constructorimpl = null;
        }
        Boolean bool = (Boolean) objM886constructorimpl;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    @Override // com.xiaomi.fitness.steps.StepProviderInternal
    @NotNull
    public List<StepItem> getSteps(final long beginTime, final long endTime, final int granularity) {
        if (!supported() || !getStepProviderValid(this.mContext)) {
            Logger.w("Phone step provider not supported!", new Object[0]);
            return CollectionsKt__CollectionsKt.emptyList();
        }
        if (beginTime < 0 || endTime < beginTime) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format(Locale.US, "%s>=%d AND %s<%d", Arrays.copyOf(new Object[]{BEGIN_TIME, Long.valueOf(beginTime), BEGIN_TIME, Long.valueOf(endTime)}, 4));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        Uri queryStepsUri = getQueryStepsUri();
        Logger.i("PhoneStepsProvider", "query steps with uri(" + queryStepsUri + ")");
        return (List) SafeDBUtil.INSTANCE.safeQuery(this.mContext, queryStepsUri, this.PROJECTION, str, (String[]) null, SORT_ORDER, new Function1() { // from class: duh
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PhoneStepsProviderImpl.getSteps$lambda$0(granularity, this, beginTime, endTime, (Cursor) obj);
            }
        });
    }

    @Override // com.xiaomi.fitness.steps.StepProviderInternal
    @NotNull
    public List<StepItem> getStepsOptimization(long beginTime, long endTime, int granularity) {
        List<StepItem> steps = getSteps(beginTime - TimeUnit.MINUTES.toMillis(1L), endTime, granularity);
        LinkedList linkedList = new LinkedList();
        if (!steps.isEmpty()) {
            for (StepItem stepItem : steps) {
                if (stepItem.getBeginTime() <= beginTime && stepItem.getEndTime() > beginTime) {
                    linkedList.add(new StepItem(beginTime, stepItem.getEndTime(), stepItem.getMode(), (int) (stepItem.getSteps() * ((stepItem.getEndTime() - beginTime) / (stepItem.getEndTime() - stepItem.getBeginTime())))));
                } else if (stepItem.getEndTime() >= beginTime) {
                    linkedList.add(stepItem);
                }
            }
        }
        return linkedList;
    }

    @Override // com.xiaomi.fitness.steps.StepProviderInternal
    public int getStepsTotal(long beginTime, long endTime) {
        List<StepItem> steps = getSteps(beginTime, endTime, 6);
        if (steps.isEmpty()) {
            return 0;
        }
        return steps.get(0).getSteps();
    }

    @Override // com.xiaomi.fitness.steps.StepProviderInternal
    public void setObserver(@NotNull Function0<Unit> observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        this.mStepsObserver.setObserver(observer);
    }

    @Override // com.xiaomi.fitness.steps.StepProviderInternal
    public boolean supported() {
        if (this.sSupported == null) {
            this.sSupported = Boolean.valueOf(MiuiFeatureParser.INSTANCE.getBoolean(PHONE_STEP_FEATURE_FIELD, false));
        }
        Boolean bool = this.sSupported;
        Intrinsics.checkNotNull(bool);
        return bool.booleanValue();
    }
}

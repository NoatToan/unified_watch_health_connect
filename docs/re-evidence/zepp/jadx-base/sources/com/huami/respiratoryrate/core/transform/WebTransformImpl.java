package com.huami.respiratoryrate.core.transform;

import android.util.Base64;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.respiratoryrate.core.RespRateConstants;
import com.huami.respiratoryrate.core.data.local.entity.RespRateEntity;
import com.huami.respiratoryrate.core.data.remote.entity.Offset;
import com.huami.respiratoryrate.core.data.remote.entity.RespRateEventItem;
import com.huami.respiratoryrate.core.utils.TimeUtils;
import com.huami.respiratoryrate.core.utils.TimeUtilsKt;
import com.huami.tools.log.HMLog;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u0000 \u001a2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001aB\u0007¢\u0006\u0004\b\u0018\u0010\u0019J$\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u001e\u0010\r\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u0003H\u0002J\u0016\u0010\u000f\u001a\u00020\u000e2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u0003H\u0002J\u0018\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u001c\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u00032\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0016J$\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¨\u0006\u001b"}, d2 = {"Lcom/huami/respiratoryrate/core/transform/WebTransformImpl;", "Lcom/huami/respiratoryrate/core/transform/IWebTransform;", "Lcom/huami/respiratoryrate/core/data/remote/entity/RespRateEventItem;", "", "Lcom/huami/respiratoryrate/core/data/local/entity/RespRateEntity;", "list", "", "utcStartTime", "Lcom/huami/respiratoryrate/core/data/remote/entity/EventValueOffset;", GoogleApiAvailabilityLight.a, "", "index", "timeZone", "b", "", "c", "respRateTime", "a", "localData", "toWebEntity", "webData", "", "userId", "fromWebEntity", "<init>", "()V", "Companion", "core_release"}, k = 1, mv = {1, 5, 1})
public final class WebTransformImpl implements IWebTransform<RespRateEventItem> {
    public static final int DAY_MINUTES = 1440;
    public static final int MINUTES_UNIT = 60;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ ArrayList<RespRateEntity> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ArrayList<RespRateEntity> arrayList) {
            super(0);
            this.a = arrayList;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("transform from web entity:", CollectionsKt___CollectionsKt.joinToString$default(this.a, null, null, null, 0, null, null, 63, null));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ RespRateEntity a;
        public final /* synthetic */ Ref.LongRef b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(RespRateEntity respRateEntity, Ref.LongRef longRef) {
            super(0);
            this.a = respRateEntity;
            this.b = longRef;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "respRateTime = " + this.a.getRespRateTime() + " - utcStartTime = " + this.b.element;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ Ref.ObjectRef<RespRateEventItem> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Ref.ObjectRef<RespRateEventItem> objectRef) {
            super(0);
            this.a = objectRef;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("transform to web entity new:", this.a.element);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public final /* synthetic */ Ref.ObjectRef<RespRateEventItem> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Ref.ObjectRef<RespRateEventItem> objectRef) {
            super(0);
            this.a = objectRef;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("transform to web entity last:", this.a.element);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<String> {
        public final /* synthetic */ Exception a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Exception exc) {
            super(0);
            this.a = exc;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("toWebEntity Exception ", this.a.getCause());
        }
    }

    private final int a(long respRateTime, long utcStartTime) {
        return ((int) (respRateTime - utcStartTime)) / 60;
    }

    private final int b(int index, List<Offset> timeZone) {
        if (timeZone.isEmpty()) {
            return 0;
        }
        for (Offset offset : timeZone) {
            if (index >= offset.getPeriod()[0] && index <= offset.getPeriod()[1]) {
                return offset.getOffset();
            }
        }
        return 0;
    }

    private final int[] c(List<Offset> timeZone) {
        int[] iArr = new int[1440];
        if (timeZone.isEmpty()) {
            return iArr;
        }
        for (Offset offset : timeZone) {
            int i = offset.getPeriod()[0];
            int i2 = offset.getPeriod()[1];
            if (i <= i2) {
                while (true) {
                    int i3 = i + 1;
                    iArr[i] = offset.getOffset();
                    if (i == i2) {
                        break;
                    }
                    i = i3;
                }
            }
        }
        return iArr;
    }

    private final List<Offset> d(List<RespRateEntity> list, long utcStartTime) {
        ArrayList arrayList = new ArrayList();
        if (list.isEmpty()) {
            return arrayList;
        }
        int offset = ((RespRateEntity) CollectionsKt.first((List) list)).getOffset();
        int iA = a(((RespRateEntity) CollectionsKt.first((List) list)).getRespRateTime(), utcStartTime);
        int iA2 = iA;
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            RespRateEntity respRateEntity = (RespRateEntity) obj;
            int iA3 = a(respRateEntity.getRespRateTime(), utcStartTime);
            if (respRateEntity.getOffset() != offset || iA3 - iA > 1) {
                arrayList.add(new Offset(new int[]{iA2, a(list.get(i - 1).getRespRateTime(), utcStartTime)}, offset));
                offset = respRateEntity.getOffset();
                iA2 = a(respRateEntity.getRespRateTime(), utcStartTime);
            }
            if (i == CollectionsKt__CollectionsKt.getLastIndex(list)) {
                arrayList.add(new Offset(new int[]{iA2, a(respRateEntity.getRespRateTime(), utcStartTime)}, offset));
            }
            i = i2;
            iA = iA3;
        }
        return arrayList;
    }

    @Override // com.huami.respiratoryrate.core.transform.IWebTransform
    @NotNull
    public List<RespRateEntity> fromWebEntity(@NotNull List<? extends RespRateEventItem> webData, @NotNull String userId) {
        if (webData.isEmpty()) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        for (RespRateEventItem respRateEventItem : webData) {
            long second = TimeUtilsKt.toSecond(respRateEventItem.getTimestamp());
            int[] iArrC = c(respRateEventItem.getValue().getTimeZone());
            byte[] bArrDecode = Base64.decode(respRateEventItem.getValue().getMeasurements(), 2);
            int length = bArrDecode.length;
            int i = 0;
            int i2 = 0;
            while (i < length) {
                byte b2 = bArrDecode[i];
                int i3 = i2 + 1;
                if (b2 > 0) {
                    arrayList.add(new RespRateEntity(second + ((long) (i2 * 60)), b2, iArrC[i2], userId, 1));
                }
                i++;
                i2 = i3;
            }
        }
        HMLog.info(RespRateConstants.TAG, new a(arrayList));
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v18, types: [T, com.huami.respiratoryrate.core.data.remote.entity.RespRateEventItem] */
    /* JADX WARN: Type inference failed for: r6v2, types: [T, com.huami.respiratoryrate.core.data.remote.entity.RespRateEventItem] */
    @Override // com.huami.respiratoryrate.core.transform.IWebTransform
    @NotNull
    public List<RespRateEventItem> toWebEntity(@NotNull List<RespRateEntity> localData) {
        if (localData.isEmpty()) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        long respRateTime = ((RespRateEntity) CollectionsKt.first((List) localData)).getRespRateTime();
        Ref.LongRef longRef = new Ref.LongRef();
        longRef.element = TimeUtils.INSTANCE.toUTC0StartTime(respRateTime);
        ArrayList arrayList = new ArrayList();
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = RespRateEventItem.INSTANCE.defaultItem(longRef.element);
        byte[] bArr = new byte[1440];
        try {
            int i = 0;
            int i2 = 0;
            for (Iterator it2 = localData.iterator(); it2.hasNext(); it2 = it2) {
                Object next = it2.next();
                int i3 = i + 1;
                if (i < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                }
                RespRateEntity respRateEntity = (RespRateEntity) next;
                HMLog.info(RespRateConstants.TAG, new b(respRateEntity, longRef));
                byte[] bArr2 = bArr;
                int iA = a(respRateEntity.getRespRateTime(), longRef.element);
                if (iA >= 1440) {
                    List<RespRateEntity> listSubList = localData.subList(i2, i);
                    ((RespRateEventItem) objectRef.element).getValue().setMeasurements(Base64.encodeToString(bArr2, 2));
                    ((RespRateEventItem) objectRef.element).getValue().setTimeZone(d(listSubList, longRef.element));
                    arrayList.add(objectRef.element);
                    HMLog.info(RespRateConstants.TAG, new c(objectRef));
                    long uTC0StartTime = TimeUtils.INSTANCE.toUTC0StartTime(respRateEntity.getRespRateTime());
                    longRef.element = uTC0StartTime;
                    objectRef.element = RespRateEventItem.INSTANCE.defaultItem(uTC0StartTime);
                    byte[] bArr3 = new byte[1440];
                    bArr3[a(respRateEntity.getRespRateTime(), longRef.element)] = (byte) respRateEntity.getRespRate();
                    bArr = bArr3;
                    i2 = i;
                } else {
                    bArr2[iA] = (byte) respRateEntity.getRespRate();
                    bArr = bArr2;
                }
                if (i == CollectionsKt__CollectionsKt.getLastIndex(localData)) {
                    List<RespRateEntity> listSubList2 = localData.subList(i2, i3);
                    ((RespRateEventItem) objectRef.element).getValue().setMeasurements(Base64.encodeToString(bArr, 2));
                    ((RespRateEventItem) objectRef.element).getValue().setTimeZone(d(listSubList2, longRef.element));
                    arrayList.add(objectRef.element);
                    HMLog.info(RespRateConstants.TAG, new d(objectRef));
                }
                i = i3;
            }
        } catch (Exception e2) {
            e2.printStackTrace();
            HMLog.error$default(RespRateConstants.TAG, null, e2, new e(e2), 2, null);
        }
        return arrayList;
    }
}

package com.xiaomi.hm.health.bt.profile.gdsp.activity;

import com.xiaomi.hm.health.bt.gatt.GattUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.internal.ProgressionUtilKt;
import kotlin.io.c;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.ranges.IntRange;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.m;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0012\n\u0002\b\u000e\u001a\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000\u001a\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000\"\u001c\u0010\n\u001a\u00020\u00008\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u001c\u0010\r\u001a\u00020\u00008\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\f\u0010\t\"\u001c\u0010\u0010\u001a\u00020\u00008\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\b\u000e\u0010\u0007\u001a\u0004\b\u000f\u0010\t¨\u0006\u0011"}, d2 = {"", "path", "", "", "readActivityRecordsFromLogFile", "extractSportRawData", "a", "Ljava/lang/String;", "getTAST_START", "()Ljava/lang/String;", "TAST_START", "b", "getTAST_END", "TAST_END", "c", "getDATA_TAG", "DATA_TAG", "bluetooth_release"}, k = 2, mv = {1, 5, 1})
public final class ActivityLogParseToolKt {

    @NotNull
    private static final String a = "====================HMProSyncDataTask====================";

    @NotNull
    private static final String b = "====================HMProSyncDataTask====================<";

    @NotNull
    private static final String c = "HMBaseProfile  fetchData:";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<String, Unit> {
        public final /* synthetic */ Ref.BooleanRef a;
        public final /* synthetic */ List<byte[]> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Ref.BooleanRef booleanRef, List<byte[]> list) {
            super(1);
            this.a = booleanRef;
            this.b = list;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke2(str);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull String str) {
            int iIndexOf$default;
            if (StringsKt__StringsKt.contains$default((CharSequence) str, (CharSequence) ActivityLogParseToolKt.getTAST_END(), false, 2, (Object) null)) {
                this.a.element = false;
                return;
            }
            if (StringsKt__StringsKt.contains$default((CharSequence) str, (CharSequence) ActivityLogParseToolKt.getTAST_START(), false, 2, (Object) null)) {
                this.a.element = true;
            } else if (StringsKt__StringsKt.contains$default((CharSequence) str, (CharSequence) ActivityLogParseToolKt.getDATA_TAG(), false, 2, (Object) null) && this.a.element && (iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) str, ActivityLogParseToolKt.getDATA_TAG(), 0, false, 6, (Object) null)) > 0) {
                byte[] bArrHexStringToBytes = GattUtils.hexStringToBytes(m.replace$default(str.substring(iIndexOf$default + ActivityLogParseToolKt.getDATA_TAG().length(), str.length()), " ", "", false, 4, (Object) null));
                this.b.add(ArraysKt___ArraysKt.sliceArray(bArrHexStringToBytes, new IntRange(1, bArrHexStringToBytes.length - 1)));
            }
        }
    }

    @NotNull
    public static final List<byte[]> extractSportRawData(@NotNull String str) {
        File file = new File(str);
        ArrayList arrayList = new ArrayList();
        c.forEachLine$default(file, null, new a(new Ref.BooleanRef(), arrayList), 1, null);
        return arrayList;
    }

    @NotNull
    public static final String getDATA_TAG() {
        return c;
    }

    @NotNull
    public static final String getTAST_END() {
        return b;
    }

    @NotNull
    public static final String getTAST_START() {
        return a;
    }

    @NotNull
    public static final List<byte[]> readActivityRecordsFromLogFile(@NotNull String str) {
        List<byte[]> listExtractSportRawData = extractSportRawData(str);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (byte[] bArr : listExtractSportRawData) {
            int i = 3;
            int progressionLastElement = ProgressionUtilKt.getProgressionLastElement(3, bArr.length, 4);
            if (3 <= progressionLastElement) {
                while (true) {
                    int i2 = i + 4;
                    arrayList2.add(Byte.valueOf(bArr[i]));
                    if (i == progressionLastElement) {
                        break;
                    }
                    i = i2;
                }
            }
        }
        int i3 = 0;
        int size = (1440 - arrayList2.size()) - 1;
        if (size >= 0) {
            while (true) {
                int i4 = i3 + 1;
                arrayList2.add((byte) -1);
                if (i3 == size) {
                    break;
                }
                i3 = i4;
            }
        }
        System.out.println((Object) GattUtils.bytesToHexString(CollectionsKt___CollectionsKt.toByteArray(arrayList2)));
        return arrayList;
    }
}

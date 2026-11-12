package defpackage;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u001a\u001c\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000\u001a\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0007\u001a\u00020\u0006¨\u0006\b"}, d2 = {"", "dataDesc", "Ljava/util/HashMap;", "Lvr;", "Lb4;", PluginDeviceInfo.FMODEL, "", "type", "bluetooth_release"}, k = 2, mv = {1, 7, 1})
public final class z5 {

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", PluginDeviceInfo.FMODEL, "()Ljava/lang/String;"}, k = 3, mv = {1, 7, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ Throwable t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Throwable th) {
            super(0);
            this.t = th;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "parseDataDescription e: " + this.t;
        }
    }

    @Nullable
    public static final HashMap<vr, b4> a(@NotNull byte[] dataDesc) {
        Object objM886constructorimpl;
        vr vrVarA;
        Intrinsics.checkNotNullParameter(dataDesc, "dataDesc");
        try {
            Result.Companion companion = Result.Companion;
            HashMap map = new HashMap(16);
            int i = 4;
            int i2 = 0;
            int iD = tet.d(dataDesc, 0, 4);
            ArrayList arrayList = new ArrayList();
            for (int i3 = 0; i3 < 32; i3++) {
                if (((1 << i3) & iD) != 0 && (vrVarA = a(i3)) != null) {
                    arrayList.add(vrVarA);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            int size = arrayList.size();
            int i4 = 0;
            while (i4 < size) {
                int i5 = i + 1;
                byte b2 = dataDesc[i];
                b4 b4Var = new b4();
                int i6 = 0;
                while (i6 < b2) {
                    int i7 = i5 + 1;
                    a4 a4VarA = a4.v.a(dataDesc[i5]);
                    if (a4VarA != null) {
                        b4Var.a().add(a4VarA);
                    }
                    i6++;
                    i5 = i7;
                }
                arrayList2.add(b4Var);
                i4++;
                i = i5;
            }
            for (Object obj : arrayList) {
                int i8 = i2 + 1;
                if (i2 < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                }
                Object obj2 = arrayList2.get(i2);
                Intrinsics.checkNotNullExpressionValue(obj2, "channelDescriptions[position]");
                map.put((vr) obj, obj2);
                i2 = i8;
            }
            objM886constructorimpl = Result.m886constructorimpl(map);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM886constructorimpl = Result.m886constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM889exceptionOrNullimpl = Result.m889exceptionOrNullimpl(objM886constructorimpl);
        if (thM889exceptionOrNullimpl != null) {
            le.a("DataDescUtil", null, null, new a(thM889exceptionOrNullimpl), 6, null);
        }
        if (Result.m892isFailureimpl(objM886constructorimpl)) {
            objM886constructorimpl = null;
        }
        return (HashMap) objM886constructorimpl;
    }

    @Nullable
    public static final vr a(int i) {
        if (i == 14) {
            return vr.PP;
        }
        if (i != 16) {
            switch (i) {
                case 0:
                    return vr.GSENSOR;
                case 1:
                    return vr.PPG;
                case 2:
                    return vr.ECG;
                case 3:
                    return vr.NMEA;
                case 4:
                    return vr.GYRO;
                case 5:
                    return vr.ADATA;
                case 6:
                    return vr.GEO;
                case 7:
                    return vr.TIME;
                case 8:
                    return vr.SPO2;
                case 9:
                    return vr.HR;
                case 10:
                    return vr.PRESSURE;
                default:
                    return null;
            }
        }
        return vr.BODY_TEMPERATURE;
    }
}
